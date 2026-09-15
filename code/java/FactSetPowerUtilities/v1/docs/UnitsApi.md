# UnitsApi

All URIs are relative to *https://api.factset.com/content/factset-power-utilities/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listPlantUnits**](UnitsApi.md#listPlantUnits) | **POST** /units/details | Returns power plant unit metadata and technical details
[**listUnitsOwnership**](UnitsApi.md#listUnitsOwnership) | **POST** /units/ownership | Returns power plant unit ownership details



## listPlantUnits

> PlantUnitsResponse listPlantUnits(plantUnitsRequest)

Returns power plant unit metadata and technical details

Returns metadata and technical detail data for one of five categories, selected via the `category` discriminator in the request body:

* **`Metadata`** — General plant metadata: plant name, ISO/TSO assignment, primary fuel type, nameplate capacity, operational status, owner details, and key lifecycle dates.
* **`Pipeline`** — Gas pipeline connections: pipeline name and pipeline sequence (for units supplied by more than one pipeline).
* **`Solar`** — Solar-specific technical specifications: installed capacity (DC), array/tracking type, tilt and azimuth angle, thin-film flag, and land area.
* **`Wind`** — Wind turbine technical specifications: turbine count, model, manufacturer, hub height, and rotor swept area.
* **`Thermal`** — Thermal/fossil technical specifications: design heat rate.

For unit ownership details, use `POST /units/ownership`.

This endpoint operates at the unit level, matching the underlying source data.

Reflects current data only; historical or point-in-time values are not retained.

**Input flexibility:** You can provide either plant IDs or unit IDs. When you provide a plant ID, all units within that plant are returned. Unit names, parent plant IDs, EIA codes, project grades, and regional mappings are included in the metadata response.


### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.FactSetPowerUtilities.ApiClient;
import com.factset.sdk.FactSetPowerUtilities.ApiException;
import com.factset.sdk.FactSetPowerUtilities.Configuration;
import com.factset.sdk.FactSetPowerUtilities.auth.*;
import com.factset.sdk.FactSetPowerUtilities.models.*;
import com.factset.sdk.FactSetPowerUtilities.api.UnitsApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;

public class Example {
    public static void main(String[] args) throws Exception {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
        //
        // The confidential client instance should be reused in production environments.
        // See https://github.com/FactSet/enterprise-sdk-utils-java#authentication
        // for more information on using the ConfidentialClient class
        ConfidentialClient confidentialClient = new ConfidentialClient("./path/to/config.json");
        ApiClient defaultClient = new ApiClient()
          .setFactSetOAuth2Client(confidentialClient);

        /* Basic authentication: FactSetApiKey */
        // See https://github.com/FactSet/enterprise-sdk#api-key
        // ApiClient defaultClient = new ApiClient()
        //   .setUsername("YOUR USERNAME")
        //   .setPassword("YOUR PASSWORD");

        UnitsApi apiInstance = new UnitsApi(defaultClient);
        PlantUnitsRequest plantUnitsRequest = new PlantUnitsRequest(); // PlantUnitsRequest | 
        try {
            PlantUnitsResponse result = apiInstance.listPlantUnits(plantUnitsRequest);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling UnitsApi#listPlantUnits");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **plantUnitsRequest** | [**PlantUnitsRequest**](PlantUnitsRequest.md)|  |

### Return type

[**PlantUnitsResponse**](PlantUnitsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response. Record shape matches the requested &#x60;category&#x60;. |  -  |
| **400** | Bad Request — the request was malformed or a required parameter was missing. |  -  |
| **401** | Unauthenticated — no valid credentials were provided. |  -  |
| **403** | Forbidden — the credentials provided do not have access to this resource. |  -  |
| **404** | Not Found — the requested resource was not found. |  -  |
| **415** | Unsupported Media Type — the request body was not JSON or the Content-Type header was missing. |  -  |
| **422** | Unprocessable Entity — the request was syntactically valid but semantically incorrect (e.g., invalid date range). |  -  |
| **429** | Too Many Requests — the rate limit for this endpoint has been exceeded. |  -  |
| **500** | Internal Server Error — an unexpected error occurred on the server. |  -  |
| **503** | Service Unavailable — the service is temporarily unavailable. |  -  |


## listUnitsOwnership

> UnitsOwnershipResponse listUnitsOwnership(unitsOwnershipRequest)

Returns power plant unit ownership details

Returns ownership records for the specified unit IDs, including owner name, FactSet entity ID, ownership percentage, ultimate parent entity, and the plant ID for each unit.

This endpoint is a convenience endpoint that returns ownership data with the plant ID included. For other unit detail categories (metadata, pipeline, solar, wind, thermal), use `POST /units/details`.

Reflects current data only; historical or point-in-time values are not retained.


### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.FactSetPowerUtilities.ApiClient;
import com.factset.sdk.FactSetPowerUtilities.ApiException;
import com.factset.sdk.FactSetPowerUtilities.Configuration;
import com.factset.sdk.FactSetPowerUtilities.auth.*;
import com.factset.sdk.FactSetPowerUtilities.models.*;
import com.factset.sdk.FactSetPowerUtilities.api.UnitsApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;

public class Example {
    public static void main(String[] args) throws Exception {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
        //
        // The confidential client instance should be reused in production environments.
        // See https://github.com/FactSet/enterprise-sdk-utils-java#authentication
        // for more information on using the ConfidentialClient class
        ConfidentialClient confidentialClient = new ConfidentialClient("./path/to/config.json");
        ApiClient defaultClient = new ApiClient()
          .setFactSetOAuth2Client(confidentialClient);

        /* Basic authentication: FactSetApiKey */
        // See https://github.com/FactSet/enterprise-sdk#api-key
        // ApiClient defaultClient = new ApiClient()
        //   .setUsername("YOUR USERNAME")
        //   .setPassword("YOUR PASSWORD");

        UnitsApi apiInstance = new UnitsApi(defaultClient);
        UnitsOwnershipRequest unitsOwnershipRequest = new UnitsOwnershipRequest(); // UnitsOwnershipRequest | 
        try {
            UnitsOwnershipResponse result = apiInstance.listUnitsOwnership(unitsOwnershipRequest);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling UnitsApi#listUnitsOwnership");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **unitsOwnershipRequest** | [**UnitsOwnershipRequest**](UnitsOwnershipRequest.md)|  |

### Return type

[**UnitsOwnershipResponse**](UnitsOwnershipResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with unit ownership records. |  -  |
| **400** | Bad Request — the request was malformed or a required parameter was missing. |  -  |
| **401** | Unauthenticated — no valid credentials were provided. |  -  |
| **403** | Forbidden — the credentials provided do not have access to this resource. |  -  |
| **404** | Not Found — the requested resource was not found. |  -  |
| **415** | Unsupported Media Type — the request body was not JSON or the Content-Type header was missing. |  -  |
| **422** | Unprocessable Entity — the request was syntactically valid but semantically incorrect (e.g., invalid date range). |  -  |
| **429** | Too Many Requests — the rate limit for this endpoint has been exceeded. |  -  |
| **500** | Internal Server Error — an unexpected error occurred on the server. |  -  |
| **503** | Service Unavailable — the service is temporarily unavailable. |  -  |

