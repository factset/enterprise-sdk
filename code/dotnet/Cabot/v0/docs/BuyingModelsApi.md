# FactSet.SDK.Cabot.Api.BuyingModelsApi

All URIs are relative to *https://api.factset.com/analytics/cabot/v0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetBuyContextModelAnalytic**](BuyingModelsApi.md#getbuycontextmodelanalytic) | **POST** /models/buy-context | Cabot main path for Buy Context API
[**GetBuyTimingModelAnalytic**](BuyingModelsApi.md#getbuytimingmodelanalytic) | **POST** /models/buy-timing | Cabot main path for Buy Timing API



<a name="getbuycontextmodelanalytic"></a>
# **GetBuyContextModelAnalytic**
> BuyContextResponseRoot GetBuyContextModelAnalytic (BuyContextRequestBodyRoot buyContextRequestBodyRoot)

Cabot main path for Buy Context API

Cabot main path for Buy Context API

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.Cabot.Api;
using FactSet.SDK.Cabot.Client;
using FactSet.SDK.Cabot.Model;

namespace Example
{
    public class GetBuyContextModelAnalyticExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.Cabot.Client.Configuration();

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

            var apiInstance = new BuyingModelsApi(config);

            var buyContextRequestBodyRoot = new BuyContextRequestBodyRoot(); // BuyContextRequestBodyRoot | 

            try
            {
                // Cabot main path for Buy Context API
                BuyContextResponseRoot result = apiInstance.GetBuyContextModelAnalytic(buyContextRequestBodyRoot);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling BuyingModelsApi.GetBuyContextModelAnalytic: " + e.Message );
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
 **buyContextRequestBodyRoot** | [**BuyContextRequestBodyRoot**](BuyContextRequestBodyRoot.md)|  | 

### Return type
[**BuyContextResponseRoot**](BuyContextResponseRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response. |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-RateLimit-Limit -  <br>  * X-FactSet-Api-RateLimit-Remaining -  <br>  * X-FactSet-Api-RateLimit-Reset -  <br>  * X-FactSet-Api-Request-Key -  <br>  |
| **400** | Bad request, invalid query parameters. |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-RateLimit-Limit -  <br>  * X-FactSet-Api-RateLimit-Remaining -  <br>  * X-FactSet-Api-RateLimit-Reset -  <br>  * X-FactSet-Api-Request-Key -  <br>  |
| **401** | Missing or invalid authentication. |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  |
| **403** | User is forbidden with current credentials. |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-RateLimit-Limit -  <br>  * X-FactSet-Api-RateLimit-Remaining -  <br>  * X-FactSet-Api-RateLimit-Reset -  <br>  * X-FactSet-Api-Request-Key -  <br>  |
| **404** | Path not found |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-RateLimit-Limit -  <br>  * X-FactSet-Api-RateLimit-Remaining -  <br>  * X-FactSet-Api-RateLimit-Reset -  <br>  * X-FactSet-Api-Request-Key -  <br>  |
| **408** | Request timeout. Retry the request in sometime. |  -  |
| **415** | Missing/Invalid Content-Type header. Header needs to be set to application/json. |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-RateLimit-Limit -  <br>  * X-FactSet-Api-RateLimit-Remaining -  <br>  * X-FactSet-Api-RateLimit-Reset -  <br>  * X-FactSet-Api-Request-Key -  <br>  |
| **429** | Rate limit reached. Wait till the time specified in Retry-After header value to make further requests. |  * Retry-After - Time to wait in seconds before making a new request as the rate limit has reached. <br>  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  |
| **500** | Server error. |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  |
| **503** | Request timed out. Retry the request in some time |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getbuytimingmodelanalytic"></a>
# **GetBuyTimingModelAnalytic**
> BuyTimingResponseRoot GetBuyTimingModelAnalytic (BuyTimingRequestBodyRoot buyTimingRequestBodyRoot)

Cabot main path for Buy Timing API

Cabot main path for Buy Timing API.    Buy timing examines the timeliness of entry points and measures how quickly new buys contribute to results. This is done by delaying the buys by the specified number of days to see if buying into the position early would have benefited the portfolio.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.Cabot.Api;
using FactSet.SDK.Cabot.Client;
using FactSet.SDK.Cabot.Model;

namespace Example
{
    public class GetBuyTimingModelAnalyticExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.Cabot.Client.Configuration();

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

            var apiInstance = new BuyingModelsApi(config);

            var buyTimingRequestBodyRoot = new BuyTimingRequestBodyRoot(); // BuyTimingRequestBodyRoot | 

            try
            {
                // Cabot main path for Buy Timing API
                BuyTimingResponseRoot result = apiInstance.GetBuyTimingModelAnalytic(buyTimingRequestBodyRoot);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling BuyingModelsApi.GetBuyTimingModelAnalytic: " + e.Message );
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
 **buyTimingRequestBodyRoot** | [**BuyTimingRequestBodyRoot**](BuyTimingRequestBodyRoot.md)|  | 

### Return type
[**BuyTimingResponseRoot**](BuyTimingResponseRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response. |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-RateLimit-Limit -  <br>  * X-FactSet-Api-RateLimit-Remaining -  <br>  * X-FactSet-Api-RateLimit-Reset -  <br>  * X-FactSet-Api-Request-Key -  <br>  |
| **400** | Bad request, invalid query parameters. |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-RateLimit-Limit -  <br>  * X-FactSet-Api-RateLimit-Remaining -  <br>  * X-FactSet-Api-RateLimit-Reset -  <br>  * X-FactSet-Api-Request-Key -  <br>  |
| **401** | Missing or invalid authentication. |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  |
| **403** | User is forbidden with current credentials. |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-RateLimit-Limit -  <br>  * X-FactSet-Api-RateLimit-Remaining -  <br>  * X-FactSet-Api-RateLimit-Reset -  <br>  * X-FactSet-Api-Request-Key -  <br>  |
| **404** | Path not found |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-RateLimit-Limit -  <br>  * X-FactSet-Api-RateLimit-Remaining -  <br>  * X-FactSet-Api-RateLimit-Reset -  <br>  * X-FactSet-Api-Request-Key -  <br>  |
| **408** | Request timeout. Retry the request in sometime. |  -  |
| **415** | Missing/Invalid Content-Type header. Header needs to be set to application/json. |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-RateLimit-Limit -  <br>  * X-FactSet-Api-RateLimit-Remaining -  <br>  * X-FactSet-Api-RateLimit-Reset -  <br>  * X-FactSet-Api-Request-Key -  <br>  |
| **429** | Rate limit reached. Wait till the time specified in Retry-After header value to make further requests. |  * Retry-After - Time to wait in seconds before making a new request as the rate limit has reached. <br>  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  |
| **500** | Server error. |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  |
| **503** | Request timed out. Retry the request in some time |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


