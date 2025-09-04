# Breaking Changes

## 2025-09-03 Formula API SDK: Removal of GET Endpoint versions and Deserialization fix for BatchData

### Removal of GET Endpoint versions

GET versions of several endpoints have been removed from the Formula API SDK in favor of their POST equivalents. This streamlines the interface and reduces confusion about which method should be used. Please update any usages of GET endpoints to the corresponding POST endpoint.

#### Example

**Before:**
    
    response_get = api.get_cross_sectional_data(
        formulas=["PROPER_NAME", "P_PRICE(0)", "P_VOLUME(0)", "FF_OPER_MGN(ANN_R,0)", "FF_ASSETS(ANN_R,0)"],
        ids=["FDS-US"],
        calendar="SEVENDAY",
        flatten="N"
    )

**After:**
    
    cross_sectional_request = CrossSectionalRequest(
        data=CrossSectionalRequestData(
            formulas=["PROPER_NAME", "P_PRICE(0)", "P_VOLUME(0)", "FF_OPER_MGN(ANN_R,0)", "FF_ASSETS(ANN_R,0)"],
            ids=["FDS-US"],
            calendar="SEVENDAY",
            flatten="N"
        ),
    )
    response_post = api.get_cross_sectional_data_for_list(cross_sectional_request)

### Deserialization Fix for BatchData

The [issue](#2024-10-01-formula-api-sdk-deserialization-of-batchdata) where `BatchData` objects were sometimes incorrectly deserialized as `CrossSectionalResponseObjectItems` instead of `TimeSeriesResponseObjectItems` has been resolved. The SDK now correctly returns the intended type, improving reliability in downstream processing and eliminating the need for extra type-checking code.

**Before:**

Previously, `BatchData` instances could be misclassified because the structures of `TimeSeriesResponseObjectItems` and `CrossSectionalResponseObjectItems` were similar. This would occasionally result in a time-series response being incorrectly handled as cross-sectional data, especially in flattened results.

- BatchData
  - CrossSectionalResponseObjectItems
    - CrossSectionalResultObjectNonflattened
    - CrossSectionalResultObjectFlattened
  - TimeSeriesResponseObjectItems
    - TimeSeriesResultObjectNonflattened
    - TimeSeriesResultObjectFlattened

**After:**

Now, the SDK uses a unified result model for flattened responses, ensuring that each `BatchData` instance is properly deserialized according to its actual type. Flattened results are handled by `UnifiedResultObjectFlattened`, which is shared between both time-series and cross-sectional types. This reduces the risk of misclassification and simplifies response handling.

- BatchData
  - CrossSectionalResultObjectNonflattened
  - TimeSeriesResultObjectNonflattened
  - UnifiedResultObjectFlattened

**Affected SDKs:**
- Formula 


## 2024-09-01 IRN Meetings API SDK: Attachments-related functions

Endpoints that return attachments now correctly return a file or stream object (depending on the programming language) instead of an empty response or generic object.

## 2024-10-01 Formula API SDK: Deserialization of BatchData

When a long-running `BatchRequest` is made to the `/time-series` endpoint, the `/batch-result` response containing `BatchData` may be incorrectly deserialized as `CrossSectionalResponseObjectItems` instead of `TimeSeriesResponseObjectItems`.

This issue stems from the polymorphic nature of the `BatchData` object, which can represent either `CrossSectionalResponseObjectItems` or `TimeSeriesResponseObjectItems`. During deserialization, the process may default to `CrossSectionalResponseObjectItems`, if the data for `TimeSeriesResponseObjectItems` closely resembles the former.

### Impact

Applications that rely on the correct type for downstream processing can experience disrupted functionality if a `CrossSectionalResponseObjectItems` is encountered instead of an expected `TimeSeriesResponseObjectItems`. This type mismatch can lead to runtime errors.

### Recommendation

Before casting `BatchData` to the expected type, perform a type check to ensure it matches the expected type.

#### Java

```java
if (batchData.getActualInstance() instanceof TimeSeriesResponseObjectItems) {
    // Process TimeSeriesResponseObjectItems
} else {
    CrossSectionalResponseObjectItems crossSectionalResponseObjectItems = (CrossSectionalResponseObjectItems) batchData.getActualInstance();
    // Process CrossSectionalResponseObjectItems
}
```

#### Dotnet

```dotnet
if (batchData.ActualInstance is TimeSeriesResponseObjectItems timeSeriesResponseObjectItems) {
    // Process TimeSeriesResponseObjectItems
} else {
    CrossSectionalResponseObjectItems crossSectionalResponseObjectItems = (CrossSectionalResponseObjectItems) batchData.ActualInstance;
    // Process CrossSectionalResponseObjectItems
}
```

#### Python

```python
if isinstance(batch_data, time_series_response_object_items):
    # Process TimeSeriesResponseObjectItems
elif isinstance(batch_data, cross_sectional_response_object_items):
    # Process CrossSectionalResponseObjectItems
else:
    raise TypeError(f"Unexpected type: {type(batch_data)}")

```

#### TypeScript

```typescript
if (batchData instanceof TimeSeriesResponseObjectItems) {
    const timeSeriesResponseObjectItems = batchData as TimeSeriesResponseObjectItems;
    // Process TimeSeriesResponseObjectItems
} else {
    const crossSectionalResponseObjectItems = batchData as CrossSectionalResponseObjectItems;
    // Process CrossSectionalResponseObjectItems
}
```

Affected SDKs:
* Formula

## 2024-06-13 Dotnet: HashSet instead of a List when `uniqueItems: true`

Schema of `type: array` which has `uniqueItems: true` now generates a HashSet to reflect that property.

```yaml
# OpenAPI Spec Example
components:
  schemas:
    MySchema:
      type: array
      uniqueItems: true
      items:
        type: string
```

Generated property with the old code:

```cs
List<string> MySchema
```

Generated property with the new code:

```cs
HashSet<string> MySchema
```

Affected SDKs:
* [ETFProfileandPrices](./code/dotnet/ETFProfileandPrices/v2)
* [OpenRisk](./code/dotnet/OpenRisk/v1)
* [RealTimeNews](./code/dotnet/RealTimeNews/v3)
* [RealTimePriceAlerting](./code/dotnet/RealTimePriceAlerting/v3)
* [RealTimeQuotes](./code/dotnet/RealTimeQuotes/v3)
* [RealTimeTimeSeries](./code/dotnet/RealTimeTimeSeries/v3)
* [StocksAPIforDigitalPortals](./code/dotnet/StocksAPIforDigitalPortals/v3)

## 2024-04-17 Java: Update from Jersey 2.35 to 3.0

* Library Update: The Jersey library version has been updated from 2.35 to 3.0.
* Package Change: All imports that previously used `javax.ws.rs.client` are now updated to use `jakarta.ws.rs.client`.
* Spring Boot / Spring Framework
  * This update makes the Java SDKs compatible with Spring Boot 3 and Spring Framework 6.
  * And **incompatible** with earlier versions (e.g. Spring Boot 2 and Spring Framework 5).

Affected SDKs: All Java SDKs

## 2023-01-25 Dotnet: Handling of schemas with named and additionalProperties

Accessing values of schemas with named properties and `additionalProperties` in the OpenAPI spec changed.

```yaml
# OpenAPI Spec Example
components:
  schemas:
    MySchema:
      type: object
      properties:
        namedProperty:
          # ...
      additionalProperties: true
```

Accessing properties with the old code:

```cs
... = instance.NamedProperty // this was null
... = instance["namedProperty"] // to get the named property
... = instance["AnyOtherAdditionalProperty"] // to get additional properties
```

Accessing properties with the new code:

```cs
... = instance.NamedProperty // to get the named property
... = instance.AdditionalProperties["AnyOtherAddtionalProperty"] // to get additional properties
```

Affected SDKs:
* [FactSetESG v2.0.0](./code/dotnet/FactSetESG/v1)
* [FactSetETF v2.0.0](./code/dotnet/FactSetETF/v1)
* [FactSetPrivateMarkets v2.0.0](./code/dotnet/FactSetPrivateMarkets/v1)
* [FactSetQuantFactorLibrary v2.0.0](./code/dotnet/FactSetQuantFactorLibrary/v1)
* [FactSetRBICS v0.22.0](./code/dotnet/FactSetRBICS/v1)
* [FactSetTermsandConditions v2.0.0](./code/dotnet/FactSetTermsandConditions/v1)
* [Formula v2.0.0](./code/dotnet/Formula/v1)
* [IRNConfiguration v2.0.0](./code/dotnet/IRNConfiguration/v1)
* [IRNContacts v2.0.0](./code/dotnet/IRNContacts/v1)
* [IRNCustomSymbols v2.0.0](./code/dotnet/IRNCustomSymbols/v1)
* [IRNMeetings v2.0.0](./code/dotnet/IRNMeetings/v1)
* [IRNNotes v2.0.0](./code/dotnet/IRNNotes/v1)
* [ModelPortfolio v0.22.0](./code/dotnet/ModelPortfolio/v3)
* [Symbology v3.0.0](./code/dotnet/Symbology/v3)
