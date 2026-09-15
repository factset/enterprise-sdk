# MarketDataApi

All URIs are relative to *https://api.factset.com/content/factset-power-utilities/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listMarketData**](MarketDataApi.md#listMarketData) | **POST** /market-data | Returns balancing authority generation, demand, or interchange
[**listMarketDataCoverage**](MarketDataApi.md#listMarketDataCoverage) | **GET** /market-data/coverage | Returns balancing authority coverage



## listMarketData

> MarketDataResponse listMarketData(marketDataRequest)

Returns balancing authority generation, demand, or interchange

Returns balancing authority time-series data for one of three categories, selected via the `category` discriminator in the request body:

* **`Generation`** — Hourly net generation in MW by fuel type for the specified balancing authorities (`factsetBaId`) and date range.
* **`Demand`** — Hourly electricity demand (load) in MW for the specified balancing authority sub-regions (`factsetBaSubRegId`).
* **`Interchange`** — Hourly net interchange in MW between a reporting BA sub-region and its counterpart sub-regions. Positive values indicate net exports; negative values indicate net imports.


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
import com.factset.sdk.FactSetPowerUtilities.api.MarketDataApi;

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

        MarketDataApi apiInstance = new MarketDataApi(defaultClient);
        MarketDataRequest marketDataRequest = new MarketDataRequest(); // MarketDataRequest | 
        try {
            MarketDataResponse result = apiInstance.listMarketData(marketDataRequest);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling MarketDataApi#listMarketData");
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
 **marketDataRequest** | [**MarketDataRequest**](MarketDataRequest.md)|  |

### Return type

[**MarketDataResponse**](MarketDataResponse.md)

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


## listMarketDataCoverage

> MarketDataCoverageResponse listMarketDataCoverage(country, paginationLimit, paginationOffset)

Returns balancing authority coverage

Returns the full list of balancing authority (BA) sub-regions available in the market data endpoints. Use the returned `factsetBaId` values as input for the `Generation` category, or `factsetBaSubRegId` values for the `Demand` and `Interchange` categories, of `POST /market-data`.


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
import com.factset.sdk.FactSetPowerUtilities.api.MarketDataApi;

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

        MarketDataApi apiInstance = new MarketDataApi(defaultClient);
        String country = "United States"; // String | Filter by country name.
        Integer paginationLimit = 100; // Integer | Maximum number of results to return per request.
        Integer paginationOffset = 0; // Integer | Number of results to skip.
        try {
            MarketDataCoverageResponse result = apiInstance.listMarketDataCoverage(country, paginationLimit, paginationOffset);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling MarketDataApi#listMarketDataCoverage");
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
 **country** | **String**| Filter by country name. | [optional]
 **paginationLimit** | **Integer**| Maximum number of results to return per request. | [optional] [default to 100]
 **paginationOffset** | **Integer**| Number of results to skip. | [optional] [default to 0]

### Return type

[**MarketDataCoverageResponse**](MarketDataCoverageResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with balancing authority coverage list |  -  |
| **400** | Bad Request — the request was malformed or a required parameter was missing. |  -  |
| **401** | Unauthenticated — no valid credentials were provided. |  -  |
| **403** | Forbidden — the credentials provided do not have access to this resource. |  -  |
| **404** | Not Found — the requested resource was not found. |  -  |
| **429** | Too Many Requests — the rate limit for this endpoint has been exceeded. |  -  |
| **500** | Internal Server Error — an unexpected error occurred on the server. |  -  |
| **503** | Service Unavailable — the service is temporarily unavailable. |  -  |

