# FactSet.SDK.FactSetPowerUtilities.Api.MarketDataApi

All URIs are relative to *https://api.factset.com/content/factset-power-utilities/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ListMarketData**](MarketDataApi.md#listmarketdata) | **POST** /market-data | Returns balancing authority generation, demand, or interchange
[**ListMarketDataCoverage**](MarketDataApi.md#listmarketdatacoverage) | **GET** /market-data/coverage | Returns balancing authority coverage



<a name="listmarketdata"></a>
# **ListMarketData**
> MarketDataResponse ListMarketData (MarketDataRequest marketDataRequest)

Returns balancing authority generation, demand, or interchange

Returns balancing authority time-series data for one of three categories, selected via the `category` discriminator in the request body:  * **`Generation`** — Hourly net generation in MW by fuel type for the specified balancing authorities (`factsetBaId`) and date range. * **`Demand`** — Hourly electricity demand (load) in MW for the specified balancing authority sub-regions (`factsetBaSubRegId`). * **`Interchange`** — Hourly net interchange in MW between a reporting BA sub-region and its counterpart sub-regions. Positive values indicate net exports; negative values indicate net imports. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetPowerUtilities.Api;
using FactSet.SDK.FactSetPowerUtilities.Client;
using FactSet.SDK.FactSetPowerUtilities.Model;

namespace Example
{
    public class ListMarketDataExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetPowerUtilities.Client.Configuration();

            // Examples for each supported authentication method are below,
            // choose one that satisfies your use case.

            /* (Preferred) OAuth 2.0: FactSetOAuth2 */
            // See https://github.com/FactSet/enterprise-sdk#oauth-20
            // for information on how to create the app-config.json file
            //
            // The confidential client instance should be reused in production environments.
            // See https://github.com/FactSet/enterprise-sdk-utils-dotnet#authentication
            // for more information on using the ConfidentialClient class
            ConfidentialClient confidentialClient = await ConfidentialClient.CreateAsync("/path/to/app-config.json");
            config.OAuth2Client = confidentialClient;

            /* Basic authentication: FactSetApiKey */
            // See https://github.com/FactSet/enterprise-sdk#api-key
            // for information how to create an API key
            // config.Username = "USERNAME-SERIAL";
            // config.Password = "API-KEY";

            var apiInstance = new MarketDataApi(config);

            var marketDataRequest = new MarketDataRequest(); // MarketDataRequest | 

            try
            {
                // Returns balancing authority generation, demand, or interchange
                MarketDataResponse result = apiInstance.ListMarketData(marketDataRequest);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling MarketDataApi.ListMarketData: " + e.Message );
                Console.WriteLine("Status Code: "+ e.ErrorCode);
                Console.WriteLine(e.StackTrace);
            }
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="listmarketdatacoverage"></a>
# **ListMarketDataCoverage**
> MarketDataCoverageResponse ListMarketDataCoverage (string country = null, int? paginationLimit = null, int? paginationOffset = null)

Returns balancing authority coverage

Returns the full list of balancing authority (BA) sub-regions available in the market data endpoints. Use the returned `factsetBaId` values as input for the `Generation` category, or `factsetBaSubRegId` values for the `Demand` and `Interchange` categories, of `POST /market-data`. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetPowerUtilities.Api;
using FactSet.SDK.FactSetPowerUtilities.Client;
using FactSet.SDK.FactSetPowerUtilities.Model;

namespace Example
{
    public class ListMarketDataCoverageExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetPowerUtilities.Client.Configuration();

            // Examples for each supported authentication method are below,
            // choose one that satisfies your use case.

            /* (Preferred) OAuth 2.0: FactSetOAuth2 */
            // See https://github.com/FactSet/enterprise-sdk#oauth-20
            // for information on how to create the app-config.json file
            //
            // The confidential client instance should be reused in production environments.
            // See https://github.com/FactSet/enterprise-sdk-utils-dotnet#authentication
            // for more information on using the ConfidentialClient class
            ConfidentialClient confidentialClient = await ConfidentialClient.CreateAsync("/path/to/app-config.json");
            config.OAuth2Client = confidentialClient;

            /* Basic authentication: FactSetApiKey */
            // See https://github.com/FactSet/enterprise-sdk#api-key
            // for information how to create an API key
            // config.Username = "USERNAME-SERIAL";
            // config.Password = "API-KEY";

            var apiInstance = new MarketDataApi(config);

            var country = "United States";  // string | Filter by country name. (optional) 
            var paginationLimit = 100;  // int? | Maximum number of results to return per request. (optional)  (default to 100)
            var paginationOffset = 0;  // int? | Number of results to skip. (optional)  (default to 0)

            try
            {
                // Returns balancing authority coverage
                MarketDataCoverageResponse result = apiInstance.ListMarketDataCoverage(country, paginationLimit, paginationOffset);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling MarketDataApi.ListMarketDataCoverage: " + e.Message );
                Console.WriteLine("Status Code: "+ e.ErrorCode);
                Console.WriteLine(e.StackTrace);
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **country** | **string**| Filter by country name. | [optional] 
 **paginationLimit** | **int?**| Maximum number of results to return per request. | [optional] [default to 100]
 **paginationOffset** | **int?**| Number of results to skip. | [optional] [default to 0]

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


