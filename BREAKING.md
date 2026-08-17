# Breaking Changes

## 2026-08-17 Investment Research API v1: `source` Field Changed to Enum

The `source` field on `CountRequestBody` (schema `CountSource`, previously named `SourceCount`) changed from a plain string to an enum with values `FRC` and `AMR`. Strongly-typed clients (Java, .NET, Python) passing a raw string for this field will fail to compile or type-check against the new enum type.

Also adds a new `POST /purchase-amr` endpoint for retrieving full Aftermarket Research documents, with supporting request/response schemas.

**New versions:** dotnet 2.0.0, java 2.0.0, python 3.0.0, typescript 2.0.0

**Migration:** Replace raw string values passed to `CountRequestBody`'s `source` field with the `CountSource` enum (`CountSource.FRC`, `CountSource.AMR`).

**Affected SDKs:**
- Investment Research (API v1)

## 2026-08-07 FactSet Debt Capital Structure API v1: Tag and Schema Renamed

The `Reference` tag was renamed to `Details`, and the `AsOfDate` schema was renamed to `StartDate`. Tag names become class names in generated SDKs, so `ReferenceApi` is now `DetailsApi` — this breaks strongly-typed clients (Java, .NET, TypeScript) at compile time, and Python callers referencing `ReferenceApi` will get an `ImportError`/`AttributeError` at runtime. The `AsOfDate` schema rename similarly changes the generated model class name wherever it's referenced.

Also adds 4 new endpoints: `/details-summary`, `/metrics`, `/dcs-totals`, `/liquidity`.

**New versions:** dotnet 2.0.0, java 2.0.0, python 2.0.0, typescript 2.0.0

**Migration:** Update any references to `ReferenceApi` to use `DetailsApi` instead. Update any references to the `AsOfDate` model/type to use `StartDate` instead.

**Affected SDKs:**
- FactSet Debt Capital Structure (API v1)

## 2026-08-07 SecurityModeling API v4: Request/Response Field Renamed

The `asofdate` field was renamed to `asOfDate` in `SMCreateParameters`, `SMDeleteParameters`, and `SMRetrieveParameters` (request bodies), and in `SMRetrieveResponse` (response body). The old field name no longer exists in the spec, so this is a rename rather than an addition — it breaks strongly-typed clients (Java, .NET, TypeScript) at compile time, and Python callers reading or setting `asofdate` will get an `AttributeError`/`TypeError` at runtime.

**New versions:** dotnet 2.0.0, java 2.0.0, python 3.0.0, typescript 2.0.0

**Migration:** Update any code reading or setting `asofdate` on `SMCreateParameters`, `SMDeleteParameters`, `SMRetrieveParameters`, or `SMRetrieveResponse` to use `asOfDate` instead.

**Affected SDKs:**
- Security Modeling (API v4)

## 2026-08-07 FactSet Ownership API v1: New Optional Parameters and Parameter Type Changes (Java, .NET, Python)

The `_paginationLimit` and `_paginationOffset` optional query parameters were added to the `getOwnershipInsiderTransactions` and `getOwnershipInstitutionalTransactions` endpoints — breaking for Java, where optional parameters are positional. Separately, several existing parameters (`transactionType`, `rowExclusion`, `batch`, and others) moved from an inline enum schema to a named, referenced schema. The allowed values didn't change, but the generated *type* did: Java gets an enum class instead of `String`, and .NET gets a nullable enum instead of `string?` — breaking for both even without the new pagination parameters. Python's type handling changes too. TypeScript is unaffected (no shipped `.d.ts`, JSDoc-only change).

**New versions:** dotnet 2.0.0, java 3.0.0, python 3.0.0 (typescript: minor bump only, 2.5.0)

**Migration:** For Java, add `null` (or actual values) for the new `_paginationLimit`/`_paginationOffset` parameters — the compiler will flag exact call sites. For Java, .NET, and Python, update any code that depended on `transactionType`/`rowExclusion`/`batch`/etc. being a plain string type to use the new generated enum type instead (the string values themselves are unchanged).

**Affected SDKs:**
- FactSet Ownership (API v1, Java, .NET, Python)

## 2026-08-07 FactSet Funds API v1: New Batch Support Changes Return Types (All Languages)

A new optional `batch` parameter was added to `getGroupHoldings`/`getMarketAggregates` (and their `ForList` variants), together with a new `202 Accepted` response carrying a distinct `BatchStatusResponse` schema alongside the existing `200` response. Adding a second, differently-shaped success response forces the generator to synthesize a wrapper/union return type for these methods in every language, not just the parameter-signature change in Java. In Java this compounds with the usual positional-argument break.

**New versions:** dotnet 3.0.0, java 5.0.0, python 4.0.0, typescript 4.0.0

**Migration:** Update code calling `getGroupHoldings()`/`getMarketAggregates()` (and `ForList` variants) to handle the new wrapped/union return type in all languages. For Java, also add `null` (or an actual value) for the new `batch` parameter — the compiler will flag exact call sites.

**Affected SDKs:**
- FactSet Funds (API v1, all languages)

## 2026-08-07 Standard Datafeed API v2: New Parameter Inserted Mid-List Changes Method Signatures (Java, .NET)

A new optional query parameter `excludeRelatedBundles` was added to the bundle-listing endpoints, but it's inserted *before* the existing `_paginationLimit`/`_paginationOffset`/`_sort` parameters rather than appended after them. This breaks Java as usual (positional arguments), and also breaks .NET for positional callers, since the parameters after the insertion point shift too — .NET's usual protection (trailing default values) only holds when a new parameter is appended last, not inserted mid-list. Python and TypeScript are unaffected.

**New versions:** dotnet 2.0.0, java 2.0.0 (python 2.1.0, typescript 2.1.0: minor bump only)

**Migration:** Add a value (or `null`/default) for the new `excludeRelatedBundles` parameter at its correct position in any Java or positional .NET calls to `getListFilesWithHttpInfo()`/`getHistoricalFilesWithHttpInfo()`. The compiler will flag exact call sites; .NET callers using named arguments are unaffected.

**Affected SDKs:**
- Standard Datafeed (API v2, Java, .NET)

## 2026-07-21 EventsAndTranscripts API v2: `ids` No Longer Required, Response Type Renamed

The `ids` query parameter on `getTranscriptsInvestorSlides` and `getTranscriptsIntelligence` lost its `required: true` flag. Since optional parameters are positional in generated method signatures, this reshuffles arguments in every language. Additionally, `TranscriptsResponseData`'s discriminator mapping now points to a new `TranscriptsResult` schema instead of `DocumentResult`, changing the generated class name for that polymorphic response.

**New versions:** 3.0.0 (all languages)

**Migration:** Update calls that pass `ids` positionally — use the named parameter or adjust for its new position. Update any references to the `DocumentResult` type for transcript responses to `TranscriptsResult`.

**Affected SDKs:**
- Events and Transcripts (API v2)

## 2026-07-21 FactSet Estimates API v2 (Java): New Optional Parameter Changes Method Signatures

A new optional query parameter `includeDocId` was added to the `GET /fixed-detail` and `GET /rolling-detail` endpoints. In Java, optional parameters are positional, so even an optional addition shifts every subsequent positional argument in the generated method signatures. Python, TypeScript, and .NET are unaffected (kwargs / options object / trailing defaults respectively).

**New versions:** java 7.0.0 (other languages: minor bump only)

**Migration:** Add a value (or `null`) for the new `includeDocId` parameter in any Java calls to the affected methods. The compiler will flag the exact call sites.

**Affected SDKs:**
- FactSet Estimates (API v2, Java only)

## 2026-07-21 FactSet Prices API v1: `BatchDataResponse.data` Now Required, Typed, and Renamed

`BatchDataResponse.data` changed from an untyped, optional `object` to a required, typed array. The underlying schema was also renamed from `BatchData` to `BatchResult` and is now a `oneOf: [price, marketValue]`. This is both a generated-class rename and a shape change on the `/batch/v1/result` response.

**New versions:** 3.0.0 (all languages)

**Migration:** Update any code referencing the `BatchData` type to use `BatchResult`. Update handling of `BatchDataResponse.data` to expect a required, typed array rather than an untyped optional object.

**Affected SDKs:**
- FactSet Prices (API v1)

## 2026-07-21 FactSet Private Equity and Venture Capital API v1: Removed Response Fields

Four response fields were removed from the spec: `FundDetail.dates.launchDate`, `FundDetail.strategyType`, `GPDetail.investmentCriteria` (moved to `FundDetail` instead), and `FundSummary.launchDate`. Strongly-typed clients (Java, .NET, TypeScript) will find these fields gone at compile time; Python callers reading them will get `AttributeError` at runtime.

**New versions:** 2.0.0 (all languages)

**Migration:** Remove any code reading `FundDetail.dates.launchDate`, `FundDetail.strategyType`, `GPDetail.investmentCriteria`, or `FundSummary.launchDate`. If you relied on `investmentCriteria`, read it from `FundDetail` instead of `GPDetail`.

**Affected SDKs:**
- FactSet Private Equity and Venture Capital (API v1)

## 2026-07-21 PA Engine API v3: Required Fields Dropped from `PADateParameters`

`PADateParameters.enddate` and `.frequency` both lost `required: true` — the schema's `required` array was dropped entirely. This affects the ~6 operations that accept this schema as a request body, including `convertPADatesToAbsoluteFormat` and the PA calculation endpoints, reshuffling positional arguments in every language. A new optional `calendar` query parameter was also added to the dates endpoint.

**New versions:** dotnet 3.0.0, java 4.0.0, python 4.0.0, typescript 4.0.0

**Migration:** Update calls that pass `enddate` or `frequency` positionally — use named parameters or adjust for their new position.

**Affected SDKs:**
- PA Engine (API v3)

## 2026-05-29 FactSet Concordance API v2 (Java): New Optional Parameters Change Method Signatures

The `creditsafe` and `crunchbase` optional parameters were added to entity match endpoints. In Java, optional parameters are positional, so this changes the method signatures for `getEntityMatch()`, `getEntityMatchForList()`, and `getEntityTaskForList()`. Other languages (Python, TypeScript, .NET) are unaffected.

**New versions:** java 3.0.0 (other languages: minor bump only)

**Migration:** Add `null` (or actual values) for the new `creditsafe` and `crunchbase` parameters in any Java calls to the affected methods. The compiler will flag the exact call sites.

**Affected SDKs:**
- FactSet Concordance (API v2, Java only)

## 2026-05-20 Python SDKs: Minimum Python Version Bump and Dependency Updates

All Python SDKs have received a major version bump. This release drops support for Python 3.7, 3.8, and 3.9. The minimum supported version is now **Python 3.10**.

Additionally, vulnerable dependencies (urllib3, certifi, etc.) have been updated.

**Migration:** Upgrade to Python 3.10 or later before updating to the new SDK versions.

**Affected SDKs:** All Python SDKs

## 2026-05-20 Global Filings API v2: `ids` Parameter Now Optional

The `ids` parameter in the SDKs for the Global Filings API v2 was changed from required to optional, which moves its position in all method signatures. This was erroneously published as a patch version (dotnet 2.3.1, java 2.3.2, python 2.3.1, typescript 3.3.1). This release properly marks the change as breaking with a major version bump.

**New versions:** dotnet 3.0.0, java 3.0.0, python 3.0.0, typescript 4.0.0

**Migration:** Update any calls that pass `ids` positionally — either use the named parameter or adjust for its new position.

**Affected SDKs:**
- Global Filings (API v2)

## 2026-04-09 TypeScript SDKs: oneOf/anyOf Deserialization Fix

This update fixes how TypeScript SDKs deserialize response fields defined as `oneOf`/`anyOf` with primitive types (numbers, strings, booleans). Previously, these fields were wrapped in an object with a `.value` property. They are now returned as plain values.

**Before:**

```js
const val = response.someField; // { value: 123.45 } — wrapped object
console.log(val.value);         // 123.45 — required extra .value access
```

**After:**

```js
const val = response.someField; // 123.45 — direct primitive value
console.log(val);               // 123.45
```

**Migration:** If your code accesses `.value` on these fields, remove the `.value` access.

**Affected SDKs:**
- Analytics Datastore
- FactSet News
- Formula
- OFDB
- OPEN:OPTIMIZER
- Open:Risk
- Quant Engine

### Additional SDKs with Stricter Deserialization

The same update also affects the following TypeScript SDKs. These did not receive a major version bump because the change is not breaking under normal usage: response fields with `oneOf`/`anyOf` schemas that fail to match any expected type now throw an error instead of silently returning `undefined`.

This only surfaces errors for responses that were already failing to deserialize correctly. If your code handles `undefined` values from these fields as a fallback, you may need to add error handling.

**Affected SDKs:**
- Chart Generation Service
- Conversational API Powered by FactSet Mercury
- Events and Transcripts
- FactSet Ownership
- FactSet Search Answers
- Procure to Pay API: SCIM
- Security Modeling

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
