# FactSet.SDK.StreetAccountNews.Api.HeadlinesApi

All URIs are relative to *https://api.factset.com/research/news/v0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetStreetAccountHeadlines**](HeadlinesApi.md#getstreetaccountheadlines) | **POST** /streetaccount/headlines | Retrieve StreetAccount headlines for given filters
[**GetStreetAccountHeadlinesByView**](HeadlinesApi.md#getstreetaccountheadlinesbyview) | **POST** /streetaccount/views/{id}/headlines | Retrieve StreetAccount headlines for given view



<a name="getstreetaccountheadlines"></a>
# **GetStreetAccountHeadlines**
> SearchResponse GetStreetAccountHeadlines (SaHeadlinesRequest saHeadlinesRequest = null)

Retrieve StreetAccount headlines for given filters

This endpoint will pull all headlines produced by StreetAccount and the full story body will be returned by the data set. Filters can be specified via the endpoint below.

### Example
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

            var saHeadlinesRequest = new SaHeadlinesRequest(); // SaHeadlinesRequest | Filter Body which needs to be sent with request (optional) 

            try
            {
                // Retrieve StreetAccount headlines for given filters
                SearchResponse result = apiInstance.GetStreetAccountHeadlines(saHeadlinesRequest);
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
 **saHeadlinesRequest** | [**SaHeadlinesRequest**](SaHeadlinesRequest.md)| Filter Body which needs to be sent with request | [optional] 

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
| **401** | Unauthorized |  -  |
| **404** | Not Found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getstreetaccountheadlinesbyview"></a>
# **GetStreetAccountHeadlinesByView**
> SearchResponse GetStreetAccountHeadlinesByView (string id, SaHeadlinesRequestByView saHeadlinesRequestByView = null)

Retrieve StreetAccount headlines for given view

This endpoint allows you to pull all headlines produced by StreetAccount for a saved view. The full story body will be returned by the data set. Views can be created via the ‘Create Views’ endpoint.

### Example
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

            var id = "SA News View";  // string | view id of the view to return headlines for
            var saHeadlinesRequestByView = new SaHeadlinesRequestByView(); // SaHeadlinesRequestByView | View body which needs to be sent with request (optional) 

            try
            {
                // Retrieve StreetAccount headlines for given view
                SearchResponse result = apiInstance.GetStreetAccountHeadlinesByView(id, saHeadlinesRequestByView);
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
 **id** | **string**| view id of the view to return headlines for | 
 **saHeadlinesRequestByView** | [**SaHeadlinesRequestByView**](SaHeadlinesRequestByView.md)| View body which needs to be sent with request | [optional] 

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
| **401** | Unauthorized |  -  |
| **404** | Not Found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


