# FactSet.SDK.StreetAccountNews.Api.HeadlinesApi

All URIs are relative to *https://api.factset.com/streetaccount/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetStreetAccountHeadlines**](HeadlinesApi.md#getstreetaccountheadlines) | **POST** /headlines | Retrieve StreetAccount headlines for given filters
[**GetStreetAccountHeadlinesByView**](HeadlinesApi.md#getstreetaccountheadlinesbyview) | **POST** /headlines/view | Retrieve StreetAccount headlines for given view



<a name="getstreetaccountheadlines"></a>
# **GetStreetAccountHeadlines**
> HeadlinesResponse GetStreetAccountHeadlines (HeadlinesRequest headlinesRequest = null)

Retrieve StreetAccount headlines for given filters

This endpoint will pull all headlines produced by StreetAccount and the full story body will be returned by the data set. Filters can be specified via the endpoint below. The attributes field in the request body can be used to specify which fields are returned in the response. If attributes are empty or not specified, the response does not omit attributes.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.StreetAccountNews.Api;
using FactSet.SDK.StreetAccountNews.Client;
using FactSet.SDK.StreetAccountNews.Model;

namespace Example
{
    public class GetStreetAccountHeadlinesExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.StreetAccountNews.Client.Configuration();

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

            var headlinesRequest = new HeadlinesRequest(); // HeadlinesRequest | /filters endpoint contains the filters associated with the optional parameters in the request body. (optional) 

            try
            {
                // Retrieve StreetAccount headlines for given filters
                HeadlinesResponse result = apiInstance.GetStreetAccountHeadlines(headlinesRequest);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling HeadlinesApi.GetStreetAccountHeadlines: " + e.Message );
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
 **headlinesRequest** | [**HeadlinesRequest**](HeadlinesRequest.md)| /filters endpoint contains the filters associated with the optional parameters in the request body. | [optional] 

### Return type
[**HeadlinesResponse**](HeadlinesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the headlines and associated story information for given filters. |  -  |
| **400** | Bad Request. This can occur for invalid parameter. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses.  |  -  |
| **404** | Not Found |  -  |
| **429** | Limit Exceeded |  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Reset - Number of seconds remaining till rate limit resets. <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getstreetaccountheadlinesbyview"></a>
# **GetStreetAccountHeadlinesByView**
> HeadlinesResponse GetStreetAccountHeadlinesByView (HeadlinesRequestByView headlinesRequestByView = null)

Retrieve StreetAccount headlines for given view

This endpoint allows you to pull all headlines produced by StreetAccount for a saved view. The full story body will be returned by the data set. Views can be created via the ‘Create Views’ endpoint.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.StreetAccountNews.Api;
using FactSet.SDK.StreetAccountNews.Client;
using FactSet.SDK.StreetAccountNews.Model;

namespace Example
{
    public class GetStreetAccountHeadlinesByViewExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.StreetAccountNews.Client.Configuration();

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

            var headlinesRequestByView = new HeadlinesRequestByView(); // HeadlinesRequestByView | View body which needs to be sent with request (optional) 

            try
            {
                // Retrieve StreetAccount headlines for given view
                HeadlinesResponse result = apiInstance.GetStreetAccountHeadlinesByView(headlinesRequestByView);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling HeadlinesApi.GetStreetAccountHeadlinesByView: " + e.Message );
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
 **headlinesRequestByView** | [**HeadlinesRequestByView**](HeadlinesRequestByView.md)| View body which needs to be sent with request | [optional] 

### Return type
[**HeadlinesResponse**](HeadlinesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the headlines and associated story information for given view. |  -  |
| **400** | Bad Request. This can occur for invalid parameter. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses.  |  -  |
| **404** | Not Found |  -  |
| **429** | Limit Exceeded |  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Reset - Number of seconds remaining till rate limit resets. <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


