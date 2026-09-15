# PlantsApi

All URIs are relative to *https://api.factset.com/content/factset-power-utilities/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listPlantIds**](PlantsApi.md#listPlantIds) | **GET** /plants/ids | Returns discoverable power plant IDs



## listPlantIds

> PlantIdsResponse listPlantIds(isoCode, country, region, plantStatus, plantIds, minCapacityMw, maxCapacityMw, paginationLimit, paginationOffset)

Returns discoverable power plant IDs

Returns a paginated list of FactSet power plant asset identifiers matching the specified filter criteria, along with plant name, status, fuel type, and geographic location (nearest city, region, country, continent, and coordinates).

For unit-level metadata and technical details, see `POST /units/details`. You can provide either plant IDs or unit IDs to `/units/details` to retrieve unit-level data with full mapping information (unit names, EIA codes, grades, regions).

Reflects current data only; historical or point-in-time values are not retained.


### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
import java.math.BigDecimal;
// Import classes:
import com.factset.sdk.FactSetPowerUtilities.ApiClient;
import com.factset.sdk.FactSetPowerUtilities.ApiException;
import com.factset.sdk.FactSetPowerUtilities.Configuration;
import com.factset.sdk.FactSetPowerUtilities.auth.*;
import com.factset.sdk.FactSetPowerUtilities.models.*;
import com.factset.sdk.FactSetPowerUtilities.api.PlantsApi;

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

        PlantsApi apiInstance = new PlantsApi(defaultClient);
        java.util.List<String> isoCode = Arrays.asList(); // java.util.List<String> | Filter plants by ISO/TSO market area code (e.g., `\"ERCOT\"`, `\"PJM\"` for US ISO/RTOs; other codes for non-US TSOs as coverage expands).
        java.util.List<String> country = Arrays.asList(); // java.util.List<String> | Filter plants by country name (e.g., `\"United States\"`, `\"Canada\"`, `\"United Kingdom\"`).
        java.util.List<String> region = Arrays.asList(); // java.util.List<String> | Filter plants by region (e.g., a US state name such as `\"Texas\"`, `\"Tennessee\"`).
        java.util.List<String> plantStatus = Arrays.asList(); // java.util.List<String> | Filter plants by operational status.
        java.util.List<String> plantIds = Arrays.asList(); // java.util.List<String> | Filter results to the specified FactSet plant asset identifiers. If omitted, all plants matching other filter criteria are returned.
        BigDecimal minCapacityMw = new BigDecimal("100"); // BigDecimal | Filter plants by minimum nameplate capacity in megawatts (MW), inclusive. Returns plants with capacity greater than or equal to this value.
        BigDecimal maxCapacityMw = new BigDecimal("5000"); // BigDecimal | Filter plants by maximum nameplate capacity in megawatts (MW), inclusive. Returns plants with capacity less than or equal to this value.
        Integer paginationLimit = 100; // Integer | Maximum number of results to return per request.
        Integer paginationOffset = 0; // Integer | Number of results to skip. Use with `_paginationLimit` for paging through large result sets.
        try {
            PlantIdsResponse result = apiInstance.listPlantIds(isoCode, country, region, plantStatus, plantIds, minCapacityMw, maxCapacityMw, paginationLimit, paginationOffset);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling PlantsApi#listPlantIds");
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
 **isoCode** | **List&lt;String&gt;**| Filter plants by ISO/TSO market area code (e.g., &#x60;\&quot;ERCOT\&quot;&#x60;, &#x60;\&quot;PJM\&quot;&#x60; for US ISO/RTOs; other codes for non-US TSOs as coverage expands). | [optional]
 **country** | **List&lt;String&gt;**| Filter plants by country name (e.g., &#x60;\&quot;United States\&quot;&#x60;, &#x60;\&quot;Canada\&quot;&#x60;, &#x60;\&quot;United Kingdom\&quot;&#x60;). | [optional]
 **region** | **List&lt;String&gt;**| Filter plants by region (e.g., a US state name such as &#x60;\&quot;Texas\&quot;&#x60;, &#x60;\&quot;Tennessee\&quot;&#x60;). | [optional]
 **plantStatus** | **List&lt;String&gt;**| Filter plants by operational status. | [optional] [enum: Operational, Planned, Retired, Cancelled]
 **plantIds** | **List&lt;String&gt;**| Filter results to the specified FactSet plant asset identifiers. If omitted, all plants matching other filter criteria are returned. | [optional]
 **minCapacityMw** | **BigDecimal**| Filter plants by minimum nameplate capacity in megawatts (MW), inclusive. Returns plants with capacity greater than or equal to this value. | [optional]
 **maxCapacityMw** | **BigDecimal**| Filter plants by maximum nameplate capacity in megawatts (MW), inclusive. Returns plants with capacity less than or equal to this value. | [optional]
 **paginationLimit** | **Integer**| Maximum number of results to return per request. | [optional] [default to 100]
 **paginationOffset** | **Integer**| Number of results to skip. Use with &#x60;_paginationLimit&#x60; for paging through large result sets. | [optional] [default to 0]

### Return type

[**PlantIdsResponse**](PlantIdsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with a list of plant identifiers |  -  |
| **400** | Bad Request — the request was malformed or a required parameter was missing. |  -  |
| **401** | Unauthenticated — no valid credentials were provided. |  -  |
| **403** | Forbidden — the credentials provided do not have access to this resource. |  -  |
| **404** | Not Found — the requested resource was not found. |  -  |
| **429** | Too Many Requests — the rate limit for this endpoint has been exceeded. |  -  |
| **500** | Internal Server Error — an unexpected error occurred on the server. |  -  |
| **503** | Service Unavailable — the service is temporarily unavailable. |  -  |

