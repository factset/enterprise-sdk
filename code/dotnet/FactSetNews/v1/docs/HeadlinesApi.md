# FactSet.SDK.FactSetNews.Api.HeadlinesApi

All URIs are relative to *https://api.factset.com/content/news/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetFactSetNewsHeadlines**](HeadlinesApi.md#getfactsetnewsheadlines) | **POST** /headlines | Retrieve FactSet News headlines for the given filters
[**GetFactSetNewsHeadlinesByView**](HeadlinesApi.md#getfactsetnewsheadlinesbyview) | **POST** /headlines/view | Retrieve FactSet News headlines for given view



<a name="getfactsetnewsheadlines"></a>
# **GetFactSetNewsHeadlines**
> SearchResponse GetFactSetNewsHeadlines (HeadlinesRequest headlinesRequest = null)

Retrieve FactSet News headlines for the given filters

This endpoint will pull all FactSet News headlines. Filters can be specified via the endpoint below. Please refer to `/filters` endpoint to obtain the values.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetNews.Api;
using FactSet.SDK.FactSetNews.Client;
using FactSet.SDK.FactSetNews.Model;

namespace Example
{
    public class GetFactSetNewsHeadlinesExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetNews.Client.Configuration();

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

            var apiInstance = new HeadlinesApi(config);

            var headlinesRequest = new HeadlinesRequest(); // HeadlinesRequest | Filter Body which needs to be sent with request. (optional) 

            try
            {
                // Retrieve FactSet News headlines for the given filters
                SearchResponse result = apiInstance.GetFactSetNewsHeadlines(headlinesRequest);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling HeadlinesApi.GetFactSetNewsHeadlines: " + e.Message );
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
 **headlinesRequest** | [**HeadlinesRequest**](HeadlinesRequest.md)| Filter Body which needs to be sent with request. | [optional] 

### Return type
[**SearchResponse**](SearchResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthenticated |  -  |
| **404** | Not Found |  -  |
| **429** | Limit Exceeded |  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Reset - Number of seconds remaining till rate limit resets. <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getfactsetnewsheadlinesbyview"></a>
# **GetFactSetNewsHeadlinesByView**
> SearchResponse GetFactSetNewsHeadlinesByView (HeadlinesRequestByView headlinesRequestByView = null)

Retrieve FactSet News headlines for given view

This endpoint allows you to pull all FactSet News Headlines for a saved view. Views can be created via the 'Create Views' endpoint.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetNews.Api;
using FactSet.SDK.FactSetNews.Client;
using FactSet.SDK.FactSetNews.Model;

namespace Example
{
    public class GetFactSetNewsHeadlinesByViewExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetNews.Client.Configuration();

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

            var apiInstance = new HeadlinesApi(config);

            var headlinesRequestByView = new HeadlinesRequestByView(); // HeadlinesRequestByView | View body which needs to be sent with request. (optional) 

            try
            {
                // Retrieve FactSet News headlines for given view
                SearchResponse result = apiInstance.GetFactSetNewsHeadlinesByView(headlinesRequestByView);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling HeadlinesApi.GetFactSetNewsHeadlinesByView: " + e.Message );
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
 **headlinesRequestByView** | [**HeadlinesRequestByView**](HeadlinesRequestByView.md)| View body which needs to be sent with request. | [optional] 

### Return type
[**SearchResponse**](SearchResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthenticated |  -  |
| **404** | Not Found |  -  |
| **429** | Limit Exceeded |  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Reset - Number of seconds remaining till rate limit resets. <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


