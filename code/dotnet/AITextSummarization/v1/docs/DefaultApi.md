# FactSet.SDK.AITextSummarization.Api.DefaultApi

All URIs are relative to *http://api.factset.com/cognitive/summarization/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetResultV1ResultResultId**](DefaultApi.md#getresultv1resultresultid) | **GET** /result/{result_id} | GET request that returns the full headline and summary results from the initial POST requests
[**PostHeadlineAndSummaryV1HeadlineAndSummary**](DefaultApi.md#postheadlineandsummaryv1headlineandsummary) | **POST** /headline-and-summary | POST request to create a 2-3 sentence summary from input text
[**PostHeadlineV1Headline**](DefaultApi.md#postheadlinev1headline) | **POST** /headline | POST request to create a headline from input text
[**PostSummaryV1Summary**](DefaultApi.md#postsummaryv1summary) | **POST** /summary | POST request to create a headline and summary from input text



<a name="getresultv1resultresultid"></a>
# **GetResultV1ResultResultId**
> SuccessResponse GetResultV1ResultResultId (string resultId)

GET request that returns the full headline and summary results from the initial POST requests

Endpoint that returns the full headline and summary results from the initial POST requests.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.AITextSummarization.Api;
using FactSet.SDK.AITextSummarization.Client;
using FactSet.SDK.AITextSummarization.Model;

namespace Example
{
    public class GetResultV1ResultResultIdExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.AITextSummarization.Client.Configuration();

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

            var apiInstance = new DefaultApi(config);

            var resultId = "resultId_example";  // string | 

            try
            {
                // GET request that returns the full headline and summary results from the initial POST requests
                SuccessResponse result = apiInstance.GetResultV1ResultResultId(resultId);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling DefaultApi.GetResultV1ResultResultId: " + e.Message );
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
 **resultId** | **string**|  | 

### Return type
[**SuccessResponse**](SuccessResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **202** | Processing |  -  |
| **400** | Bad Request |  -  |
| **401** | Access Denied |  -  |
| **404** | Invalid Result ID |  -  |
| **500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="postheadlineandsummaryv1headlineandsummary"></a>
# **PostHeadlineAndSummaryV1HeadlineAndSummary**
> string PostHeadlineAndSummaryV1HeadlineAndSummary (Request payload)

POST request to create a 2-3 sentence summary from input text

Endpoint for initiating a processing job to create a 2-3 sentence summary from input text.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.AITextSummarization.Api;
using FactSet.SDK.AITextSummarization.Client;
using FactSet.SDK.AITextSummarization.Model;

namespace Example
{
    public class PostHeadlineAndSummaryV1HeadlineAndSummaryExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.AITextSummarization.Client.Configuration();

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

            var apiInstance = new DefaultApi(config);

            var payload = new Request(); // Request | 

            try
            {
                // POST request to create a 2-3 sentence summary from input text
                string result = apiInstance.PostHeadlineAndSummaryV1HeadlineAndSummary(payload);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling DefaultApi.PostHeadlineAndSummaryV1HeadlineAndSummary: " + e.Message );
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
 **payload** | [**Request**](Request.md)|  | 

### Return type
**string**

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Unique Result ID |  -  |
| **400** | Bad Request |  -  |
| **401** | Access Denied |  -  |
| **500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="postheadlinev1headline"></a>
# **PostHeadlineV1Headline**
> string PostHeadlineV1Headline (Request payload)

POST request to create a headline from input text

Endpoint for initiating a processing job to create a headline from input text.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.AITextSummarization.Api;
using FactSet.SDK.AITextSummarization.Client;
using FactSet.SDK.AITextSummarization.Model;

namespace Example
{
    public class PostHeadlineV1HeadlineExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.AITextSummarization.Client.Configuration();

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

            var apiInstance = new DefaultApi(config);

            var payload = new Request(); // Request | 

            try
            {
                // POST request to create a headline from input text
                string result = apiInstance.PostHeadlineV1Headline(payload);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling DefaultApi.PostHeadlineV1Headline: " + e.Message );
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
 **payload** | [**Request**](Request.md)|  | 

### Return type
**string**

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Unique Result ID |  -  |
| **400** | Bad Request |  -  |
| **401** | Access Denied |  -  |
| **500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="postsummaryv1summary"></a>
# **PostSummaryV1Summary**
> string PostSummaryV1Summary (Request payload)

POST request to create a headline and summary from input text

Endpoint for initiating a processing job to create a headline and summary from input text.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.AITextSummarization.Api;
using FactSet.SDK.AITextSummarization.Client;
using FactSet.SDK.AITextSummarization.Model;

namespace Example
{
    public class PostSummaryV1SummaryExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.AITextSummarization.Client.Configuration();

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

            var apiInstance = new DefaultApi(config);

            var payload = new Request(); // Request | 

            try
            {
                // POST request to create a headline and summary from input text
                string result = apiInstance.PostSummaryV1Summary(payload);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling DefaultApi.PostSummaryV1Summary: " + e.Message );
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
 **payload** | [**Request**](Request.md)|  | 

### Return type
**string**

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Unique Result ID |  -  |
| **400** | Bad Request |  -  |
| **401** | Access Denied |  -  |
| **500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


