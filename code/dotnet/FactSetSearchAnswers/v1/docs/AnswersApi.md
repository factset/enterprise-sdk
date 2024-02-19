# FactSet.SDK.FactSetSearchAnswers.Api.AnswersApi

All URIs are relative to *https://api.factset.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**SearchForAdaptiveCardAnswer**](AnswersApi.md#searchforadaptivecardanswer) | **GET** /search/answers/v1/adaptive-card | Fetch FactSet answer in Adaptive Card format
[**SearchForDataAnswer**](AnswersApi.md#searchfordataanswer) | **GET** /search/answers/v1/data | Fetch FactSet answer in data format



<a name="searchforadaptivecardanswer"></a>
# **SearchForAdaptiveCardAnswer**
> AdaptiveCardAnswerSuccessResponse SearchForAdaptiveCardAnswer (string query, bool? includeThumbnail = null, bool? disableNoAnswerResponses = null, string theme = null)

Fetch FactSet answer in Adaptive Card format

Returns an answer to the specified query (if valid answer exists) in the Adaptive Card format (https://adaptivecards.io/).

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetSearchAnswers.Api;
using FactSet.SDK.FactSetSearchAnswers.Client;
using FactSet.SDK.FactSetSearchAnswers.Model;

namespace Example
{
    public class SearchForAdaptiveCardAnswerExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetSearchAnswers.Client.Configuration();

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

            var apiInstance = new AnswersApi(config);

            var query = "query_example";  // string | Query for desired answer (e.g., \"fds price\")
            var includeThumbnail = false;  // bool? | Includes thumbnail of Adaptive Card in response (optional)  (default to false)
            var disableNoAnswerResponses = true;  // bool? | Disables no-result answer responses (no-results and answer without data) (optional)  (default to true)
            var theme = "\"Light\"";  // string | Theme for desired answer (e.g., \"Light\", \"Dark\") (optional)  (default to "Light")

            try
            {
                // Fetch FactSet answer in Adaptive Card format
                AdaptiveCardAnswerSuccessResponse result = apiInstance.SearchForAdaptiveCardAnswer(query, includeThumbnail, disableNoAnswerResponses, theme);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling AnswersApi.SearchForAdaptiveCardAnswer: " + e.Message );
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
 **query** | **string**| Query for desired answer (e.g., \&quot;fds price\&quot;) | 
 **includeThumbnail** | **bool?**| Includes thumbnail of Adaptive Card in response | [optional] [default to false]
 **disableNoAnswerResponses** | **bool?**| Disables no-result answer responses (no-results and answer without data) | [optional] [default to true]
 **theme** | **string**| Theme for desired answer (e.g., \&quot;Light\&quot;, \&quot;Dark\&quot;) | [optional] [default to &quot;Light&quot;]

### Return type
[**AdaptiveCardAnswerSuccessResponse**](AdaptiveCardAnswerSuccessResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Request was successful. |  -  |
| **400** | Missing or empty query. |  -  |
| **401** | Missing or invalid authentication. |  -  |
| **500** | Unhandled error occurred while processing the request. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="searchfordataanswer"></a>
# **SearchForDataAnswer**
> DataAnswerSuccessResponse SearchForDataAnswer (string query, string consumingApplication = null)

Fetch FactSet answer in data format

Returns an answer to the specified query (if a valid answer exists). Returns the answer data only (as JSON), without any markup information.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetSearchAnswers.Api;
using FactSet.SDK.FactSetSearchAnswers.Client;
using FactSet.SDK.FactSetSearchAnswers.Model;

namespace Example
{
    public class SearchForDataAnswerExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetSearchAnswers.Client.Configuration();

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

            var apiInstance = new AnswersApi(config);

            var query = "query_example";  // string | Query for desired answer (e.g., \"fds price\")
            var consumingApplication = "\"Developer Portal\"";  // string | Name of application consuming the API (used for analytics purposes) (optional)  (default to "Developer Portal")

            try
            {
                // Fetch FactSet answer in data format
                DataAnswerSuccessResponse result = apiInstance.SearchForDataAnswer(query, consumingApplication);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling AnswersApi.SearchForDataAnswer: " + e.Message );
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
 **query** | **string**| Query for desired answer (e.g., \&quot;fds price\&quot;) | 
 **consumingApplication** | **string**| Name of application consuming the API (used for analytics purposes) | [optional] [default to &quot;Developer Portal&quot;]

### Return type
[**DataAnswerSuccessResponse**](DataAnswerSuccessResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Request was successful. |  -  |
| **400** | Missing or empty query. |  -  |
| **401** | Missing or invalid authentication. |  -  |
| **500** | Unhandled error occurred while processing the request. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


