# FactSet.SDK.NaturalLanguageProcessing.Api.QuestionAnswerApi

All URIs are relative to *https://api.factset.com/cognitive/nlp/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**QnaGetAnswers**](QuestionAnswerApi.md#qnagetanswers) | **GET** /qna/answers/{id} | Endpoint to get the answer(s)
[**QnaGetStatus**](QuestionAnswerApi.md#qnagetstatus) | **GET** /qna/answers/{id}/status | Endpoint to get the completion status for a Q&amp;A request
[**QnaPostQuestion**](QuestionAnswerApi.md#qnapostquestion) | **POST** /qna/answers | Endpoint to submit a question for answer(s)



<a name="qnagetanswers"></a>
# **QnaGetAnswers**
> QnAAnswerRoot QnaGetAnswers (string id)

Endpoint to get the answer(s)

Endpoint to obtain the results from the original Q&A task request. The `id` parameter represents the identifier from the task and comes from the POST request which created the task. Once the task is complete, the result can be fetched with this endpoint.

### Example
```csharp
using System;
using System.Net;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.NaturalLanguageProcessing.Api;
using FactSet.SDK.NaturalLanguageProcessing.Client;
using FactSet.SDK.NaturalLanguageProcessing.Model;

namespace Example
{
    public class QnaGetAnswersExample
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

            var apiInstance = new QuestionAnswerApi(config);

            var id = "id_example";  // string | Identifier from the Question & Answer task and comes from the POST request which created the task

            try
            {
                // Endpoint to get the answer(s)
                QuestionAnswerApi.QnaGetAnswersResponseWrapper result = apiInstance.QnaGetAnswers(id);

                switch (result.StatusCode)
                {

                    case (HttpStatusCode)200:
                        Console.WriteLine(result.Response200);
                        break;

                    case (HttpStatusCode)202:
                        Console.WriteLine(result.Response202);
                        break;

                }
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling QuestionAnswerApi.QnaGetAnswers: " + e.Message );
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
 **id** | **string**| Identifier from the Question &amp; Answer task and comes from the POST request which created the task | 

### Return type
QnaGetAnswersResponseWrapper

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **202** | Accepted |  * Location - The &#x60;Location&#x60; response header indicates the URL to redirect a page to. <br>  |
| **401** | The server could not verify that you are authorized to access the URL requested. You either supplied the wrong credentials (e.g. a bad password), or your browser doesn&#39;t understand how to supply the credentials required. |  -  |
| **404** | The requested URL was not found on the server. If you entered the URL manually please check your spelling and try again. |  -  |
| **500** | The server encountered an internal error and was unable to complete your request. Either the server is overloaded or there is an error in the application. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="qnagetstatus"></a>
# **QnaGetStatus**
> TaskRoot QnaGetStatus (string id)

Endpoint to get the completion status for a Q&A request

Endpoint to obtain the status of the Q&A task request. The `id` parameter represents the identifier of the task created and comes from the POST request which created the task.

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
    public class QnaGetStatusExample
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

            var apiInstance = new QuestionAnswerApi(config);

            var id = "id_example";  // string | Identifier from the Question & Answer task and comes from the POST request which created the task

            try
            {
                // Endpoint to get the completion status for a Q&A request
                TaskRoot result = apiInstance.QnaGetStatus(id);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling QuestionAnswerApi.QnaGetStatus: " + e.Message );
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
 **id** | **string**| Identifier from the Question &amp; Answer task and comes from the POST request which created the task | 

### Return type
[**TaskRoot**](TaskRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  * Location - The &#x60;Location&#x60; response header indicates the URL to redirect a page to. <br>  |
| **202** | Accepted |  * Location - The &#x60;Location&#x60; response header indicates the URL to redirect a page to. <br>  |
| **401** | The server could not verify that you are authorized to access the URL requested. You either supplied the wrong credentials (e.g. a bad password), or your browser doesn&#39;t understand how to supply the credentials required. |  -  |
| **404** | The requested URL was not found on the server. If you entered the URL manually please check your spelling and try again. |  -  |
| **500** | The server encountered an internal error and was unable to complete your request. Either the server is overloaded or there is an error in the application. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="qnapostquestion"></a>
# **QnaPostQuestion**
> TaskRoot QnaPostQuestion (QnAAnswerParametersRoot qnAAnswerParametersRoot)

Endpoint to submit a question for answer(s)

Endpoint to create a task submission by providing plain text and question(s). The underlying model will answer the question. The created task needs to be polled to obtain the results. Please check the schema(s) for each of the status codes for more details about the task.

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
    public class QnaPostQuestionExample
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

            var apiInstance = new QuestionAnswerApi(config);

            var qnAAnswerParametersRoot = new QnAAnswerParametersRoot(); // QnAAnswerParametersRoot | 

            try
            {
                // Endpoint to submit a question for answer(s)
                TaskRoot result = apiInstance.QnaPostQuestion(qnAAnswerParametersRoot);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling QuestionAnswerApi.QnaPostQuestion: " + e.Message );
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
 **qnAAnswerParametersRoot** | [**QnAAnswerParametersRoot**](QnAAnswerParametersRoot.md)|  | 

### Return type
[**TaskRoot**](TaskRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Accepted |  * Location - The &#x60;Location&#x60; response header indicates the URL to redirect a page to. <br>  |
| **400** | The browser (or proxy) sent a request that this server could not understand. |  -  |
| **401** | The server could not verify that you are authorized to access the URL requested. You either supplied the wrong credentials (e.g. a bad password), or your browser doesn&#39;t understand how to supply the credentials required. |  -  |
| **500** | The server encountered an internal error and was unable to complete your request. Either the server is overloaded or there is an error in the application. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


