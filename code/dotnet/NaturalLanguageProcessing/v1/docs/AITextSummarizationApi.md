# FactSet.SDK.NaturalLanguageProcessing.Api.AITextSummarizationApi

All URIs are relative to *https://api.factset.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CognitiveNlpV1SummarizationHeadlineAndSummaryPost**](AITextSummarizationApi.md#cognitivenlpv1summarizationheadlineandsummarypost) | **POST** /cognitive/nlp/v1/summarization/headline-and-summary | POST request for summarizing an input text
[**CognitiveNlpV1SummarizationHeadlinePost**](AITextSummarizationApi.md#cognitivenlpv1summarizationheadlinepost) | **POST** /cognitive/nlp/v1/summarization/headline | POST request for summarizing an input text
[**CognitiveNlpV1SummarizationResultResultIdGet**](AITextSummarizationApi.md#cognitivenlpv1summarizationresultresultidget) | **GET** /cognitive/nlp/v1/summarization/result/{result_id} | GET request for obtaining response of a particular processing job
[**CognitiveNlpV1SummarizationSummaryPost**](AITextSummarizationApi.md#cognitivenlpv1summarizationsummarypost) | **POST** /cognitive/nlp/v1/summarization/summary | POST request for summarizing an input text


<a name="cognitivenlpv1summarizationheadlineandsummarypost"></a>
# **CognitiveNlpV1SummarizationHeadlineAndSummaryPost**
> SummarizationResultID CognitiveNlpV1SummarizationHeadlineAndSummaryPost (SummarizationRequest summarizationRequest = null)

POST request for summarizing an input text

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.NaturalLanguageProcessing.Api;
using FactSet.SDK.NaturalLanguageProcessing.Client;
using FactSet.SDK.NaturalLanguageProcessing.Model;

namespace Example
{
    public class CognitiveNlpV1SummarizationHeadlineAndSummaryPostExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.NaturalLanguageProcessing.Client.Configuration();

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

            var apiInstance = new AITextSummarizationApi(config);

            var summarizationRequest = new SummarizationRequest(); // SummarizationRequest |  (optional) 

            try
            {
                // POST request for summarizing an input text
                SummarizationResultID result = apiInstance.CognitiveNlpV1SummarizationHeadlineAndSummaryPost(summarizationRequest);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling AITextSummarizationApi.CognitiveNlpV1SummarizationHeadlineAndSummaryPost: " + e.Message );
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
 **summarizationRequest** | [**SummarizationRequest**](SummarizationRequest.md)|  | [optional] 

### Return type
[**SummarizationResultID**](SummarizationResultID.md)

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

<a name="cognitivenlpv1summarizationheadlinepost"></a>
# **CognitiveNlpV1SummarizationHeadlinePost**
> SummarizationResultID CognitiveNlpV1SummarizationHeadlinePost (SummarizationRequest summarizationRequest = null)

POST request for summarizing an input text

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.NaturalLanguageProcessing.Api;
using FactSet.SDK.NaturalLanguageProcessing.Client;
using FactSet.SDK.NaturalLanguageProcessing.Model;

namespace Example
{
    public class CognitiveNlpV1SummarizationHeadlinePostExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.NaturalLanguageProcessing.Client.Configuration();

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

            var apiInstance = new AITextSummarizationApi(config);

            var summarizationRequest = new SummarizationRequest(); // SummarizationRequest |  (optional) 

            try
            {
                // POST request for summarizing an input text
                SummarizationResultID result = apiInstance.CognitiveNlpV1SummarizationHeadlinePost(summarizationRequest);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling AITextSummarizationApi.CognitiveNlpV1SummarizationHeadlinePost: " + e.Message );
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
 **summarizationRequest** | [**SummarizationRequest**](SummarizationRequest.md)|  | [optional] 

### Return type
[**SummarizationResultID**](SummarizationResultID.md)

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

<a name="cognitivenlpv1summarizationresultresultidget"></a>
# **CognitiveNlpV1SummarizationResultResultIdGet**
> SummarizationResult CognitiveNlpV1SummarizationResultResultIdGet (string resultId)

GET request for obtaining response of a particular processing job

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.NaturalLanguageProcessing.Api;
using FactSet.SDK.NaturalLanguageProcessing.Client;
using FactSet.SDK.NaturalLanguageProcessing.Model;

namespace Example
{
    public class CognitiveNlpV1SummarizationResultResultIdGetExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.NaturalLanguageProcessing.Client.Configuration();

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

            var apiInstance = new AITextSummarizationApi(config);

            var resultId = "resultId_example";  // string | 

            try
            {
                // GET request for obtaining response of a particular processing job
                SummarizationResult result = apiInstance.CognitiveNlpV1SummarizationResultResultIdGet(resultId);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling AITextSummarizationApi.CognitiveNlpV1SummarizationResultResultIdGet: " + e.Message );
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
[**SummarizationResult**](SummarizationResult.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **400** | Bad Request |  -  |
| **401** | Access Denied |  -  |
| **404** | Not found |  -  |
| **500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="cognitivenlpv1summarizationsummarypost"></a>
# **CognitiveNlpV1SummarizationSummaryPost**
> SummarizationResultID CognitiveNlpV1SummarizationSummaryPost (SummarizationRequest summarizationRequest = null)

POST request for summarizing an input text

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.NaturalLanguageProcessing.Api;
using FactSet.SDK.NaturalLanguageProcessing.Client;
using FactSet.SDK.NaturalLanguageProcessing.Model;

namespace Example
{
    public class CognitiveNlpV1SummarizationSummaryPostExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.NaturalLanguageProcessing.Client.Configuration();

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

            var apiInstance = new AITextSummarizationApi(config);

            var summarizationRequest = new SummarizationRequest(); // SummarizationRequest |  (optional) 

            try
            {
                // POST request for summarizing an input text
                SummarizationResultID result = apiInstance.CognitiveNlpV1SummarizationSummaryPost(summarizationRequest);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling AITextSummarizationApi.CognitiveNlpV1SummarizationSummaryPost: " + e.Message );
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
 **summarizationRequest** | [**SummarizationRequest**](SummarizationRequest.md)|  | [optional] 

### Return type
[**SummarizationResultID**](SummarizationResultID.md)

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

