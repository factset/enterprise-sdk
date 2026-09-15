# ReferenceApi

All URIs are relative to *https://api.factset.com/content/factset-power-utilities/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listEntityHistory**](ReferenceApi.md#listEntityHistory) | **GET** /reference/entity-history | Returns entity and security history records
[**listIsoMapping**](ReferenceApi.md#listIsoMapping) | **GET** /reference/iso-mapping | Returns ISO/TSO mapping data
[**listLocationMapping**](ReferenceApi.md#listLocationMapping) | **GET** /reference/location-mapping | Returns power price location mapping data
[**listZoneMapping**](ReferenceApi.md#listZoneMapping) | **GET** /reference/zone-mapping | Returns price zone and hub mapping data



## listEntityHistory

> EntityHistoryResponse listEntityHistory(factsetEntityId, paginationLimit, paginationOffset)

Returns entity and security history records

Returns entity and security history records combining security-to-entity identifier mappings and entity ownership structure history, including immediate and ultimate parent entities.

**Helpful for:** Understanding entity relationships and parent-subsidiary structures related to plant ownership data returned by `POST /units/ownership`.


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
import com.factset.sdk.FactSetPowerUtilities.api.ReferenceApi;

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

        ReferenceApi apiInstance = new ReferenceApi(defaultClient);
        String factsetEntityId = "0GSF7D-E"; // String | Filter records by a specific FactSet entity identifier (e.g., `\"0GSF7D-E\"`).
        Integer paginationLimit = 100; // Integer | Maximum number of results to return per request.
        Integer paginationOffset = 0; // Integer | Number of results to skip.
        try {
            EntityHistoryResponse result = apiInstance.listEntityHistory(factsetEntityId, paginationLimit, paginationOffset);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling ReferenceApi#listEntityHistory");
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
 **factsetEntityId** | **String**| Filter records by a specific FactSet entity identifier (e.g., &#x60;\&quot;0GSF7D-E\&quot;&#x60;). | [optional]
 **paginationLimit** | **Integer**| Maximum number of results to return per request. | [optional] [default to 100]
 **paginationOffset** | **Integer**| Number of results to skip. | [optional] [default to 0]

### Return type

[**EntityHistoryResponse**](EntityHistoryResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with entity history records |  -  |
| **400** | Bad Request — the request was malformed or a required parameter was missing. |  -  |
| **401** | Unauthenticated — no valid credentials were provided. |  -  |
| **403** | Forbidden — the credentials provided do not have access to this resource. |  -  |
| **404** | Not Found — the requested resource was not found. |  -  |
| **429** | Too Many Requests — the rate limit for this endpoint has been exceeded. |  -  |
| **500** | Internal Server Error — an unexpected error occurred on the server. |  -  |
| **503** | Service Unavailable — the service is temporarily unavailable. |  -  |


## listIsoMapping

> IsoMappingResponse listIsoMapping(paginationLimit, paginationOffset)

Returns ISO/TSO mapping data

Returns the complete list of ISO/TSO codes and their corresponding names.

**Helpful for:** Use this endpoint to understand available ISO/TSO codes for filtering in `GET /plants/ids` (via the `isoCode` parameter) and `GET /market-data/coverage`.

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
import com.factset.sdk.FactSetPowerUtilities.api.ReferenceApi;

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

        ReferenceApi apiInstance = new ReferenceApi(defaultClient);
        Integer paginationLimit = 100; // Integer | Maximum number of results to return per request.
        Integer paginationOffset = 0; // Integer | Number of results to skip.
        try {
            IsoMappingResponse result = apiInstance.listIsoMapping(paginationLimit, paginationOffset);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling ReferenceApi#listIsoMapping");
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
 **paginationLimit** | **Integer**| Maximum number of results to return per request. | [optional] [default to 100]
 **paginationOffset** | **Integer**| Number of results to skip. | [optional] [default to 0]

### Return type

[**IsoMappingResponse**](IsoMappingResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with ISO/TSO mapping records |  -  |
| **400** | Bad Request — the request was malformed or a required parameter was missing. |  -  |
| **401** | Unauthenticated — no valid credentials were provided. |  -  |
| **403** | Forbidden — the credentials provided do not have access to this resource. |  -  |
| **404** | Not Found — the requested resource was not found. |  -  |
| **429** | Too Many Requests — the rate limit for this endpoint has been exceeded. |  -  |
| **500** | Internal Server Error — an unexpected error occurred on the server. |  -  |
| **503** | Service Unavailable — the service is temporarily unavailable. |  -  |


## listLocationMapping

> LocationMappingResponse listLocationMapping(isoCode, paginationLimit, paginationOffset)

Returns power price location mapping data

Returns the list of ISO/TSO power price location codes (hub codes) used by `POST /prices` for the `Power`, `SparkSpread`, and `Forward` categories, with their names. Use the returned `locationId` values as input to those endpoints.

Note: these `iso_loc_code` identifiers are a distinct code space from the `iso_zone_code` identifiers used by `POST /prices?category=Capacity` — see `GET /reference/zone-mapping` for those.

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
import com.factset.sdk.FactSetPowerUtilities.api.ReferenceApi;

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

        ReferenceApi apiInstance = new ReferenceApi(defaultClient);
        String isoCode = "ERCOT"; // String | Filter locations by ISO/TSO market.
        Integer paginationLimit = 100; // Integer | Maximum number of results to return per request.
        Integer paginationOffset = 0; // Integer | Number of results to skip.
        try {
            LocationMappingResponse result = apiInstance.listLocationMapping(isoCode, paginationLimit, paginationOffset);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling ReferenceApi#listLocationMapping");
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
 **isoCode** | **String**| Filter locations by ISO/TSO market. | [optional]
 **paginationLimit** | **Integer**| Maximum number of results to return per request. | [optional] [default to 100]
 **paginationOffset** | **Integer**| Number of results to skip. | [optional] [default to 0]

### Return type

[**LocationMappingResponse**](LocationMappingResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with power price location mapping records |  -  |
| **400** | Bad Request — the request was malformed or a required parameter was missing. |  -  |
| **401** | Unauthenticated — no valid credentials were provided. |  -  |
| **403** | Forbidden — the credentials provided do not have access to this resource. |  -  |
| **404** | Not Found — the requested resource was not found. |  -  |
| **429** | Too Many Requests — the rate limit for this endpoint has been exceeded. |  -  |
| **500** | Internal Server Error — an unexpected error occurred on the server. |  -  |
| **503** | Service Unavailable — the service is temporarily unavailable. |  -  |


## listZoneMapping

> ZoneMappingResponse listZoneMapping(isoCode, paginationLimit, paginationOffset)

Returns price zone and hub mapping data

Returns the list of ISO/TSO load distribution area and zone codes used by `POST /prices?category=Capacity`, with their names, price units, and auction frequency. Use the returned `locationId` values as input to that endpoint.

Note: these `iso_zone_code` identifiers are a distinct code space from the `iso_loc_code` identifiers used by `POST /prices` for the `Power`, `SparkSpread`, and `Forward` categories.

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
import com.factset.sdk.FactSetPowerUtilities.api.ReferenceApi;

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

        ReferenceApi apiInstance = new ReferenceApi(defaultClient);
        String isoCode = "PJM"; // String | Filter locations by ISO/TSO market.
        Integer paginationLimit = 100; // Integer | Maximum number of results to return per request.
        Integer paginationOffset = 0; // Integer | Number of results to skip.
        try {
            ZoneMappingResponse result = apiInstance.listZoneMapping(isoCode, paginationLimit, paginationOffset);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling ReferenceApi#listZoneMapping");
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
 **isoCode** | **String**| Filter locations by ISO/TSO market. | [optional]
 **paginationLimit** | **Integer**| Maximum number of results to return per request. | [optional] [default to 100]
 **paginationOffset** | **Integer**| Number of results to skip. | [optional] [default to 0]

### Return type

[**ZoneMappingResponse**](ZoneMappingResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with zone and hub mapping records |  -  |
| **400** | Bad Request — the request was malformed or a required parameter was missing. |  -  |
| **401** | Unauthenticated — no valid credentials were provided. |  -  |
| **403** | Forbidden — the credentials provided do not have access to this resource. |  -  |
| **404** | Not Found — the requested resource was not found. |  -  |
| **429** | Too Many Requests — the rate limit for this endpoint has been exceeded. |  -  |
| **500** | Internal Server Error — an unexpected error occurred on the server. |  -  |
| **503** | Service Unavailable — the service is temporarily unavailable. |  -  |

