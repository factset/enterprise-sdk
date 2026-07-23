# FactSet.SDK.ConversationalAPIPoweredbyFactSetMercury.Api.ChatApi

All URIs are relative to *https://api.uat.factset.com/conversational/v0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ChatCompletion**](ChatApi.md#chatcompletion) | **POST** /chat/completions | Stream a chat completion (OpenAI-compatible)
[**ListModels**](ChatApi.md#listmodels) | **GET** /models | List available models (OpenAI-compatible)



<a name="chatcompletion"></a>
# **ChatCompletion**
> ChatCompletionChunk ChatCompletion (string consumer, ChatCompletionRequest chatCompletionRequest)

Stream a chat completion (OpenAI-compatible)

Accepts an OpenAI-style Chat Completions request and streams `chat.completion.chunk` frames via Server-Sent Events.  The `messages` array is searched in reverse for the last entry with `role: user`; everything else is discarded before the request is forwarded to the agent. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.ConversationalAPIPoweredbyFactSetMercury.Api;
using FactSet.SDK.ConversationalAPIPoweredbyFactSetMercury.Client;
using FactSet.SDK.ConversationalAPIPoweredbyFactSetMercury.Model;

namespace Example
{
    public class ChatCompletionExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.ConversationalAPIPoweredbyFactSetMercury.Client.Configuration();

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

            var apiInstance = new ChatApi(config);

            var consumer = "developer-portal";  // string | Identify the requestor
            var chatCompletionRequest = new ChatCompletionRequest(); // ChatCompletionRequest | 

            try
            {
                // Stream a chat completion (OpenAI-compatible)
                ChatCompletionChunk result = apiInstance.ChatCompletion(consumer, chatCompletionRequest);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling ChatApi.ChatCompletion: " + e.Message );
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
 **consumer** | **string**| Identify the requestor | 
 **chatCompletionRequest** | [**ChatCompletionRequest**](ChatCompletionRequest.md)|  | 

### Return type
[**ChatCompletionChunk**](ChatCompletionChunk.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: text/event-stream, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A stream of OpenAI &#x60;chat.completion.chunk&#x60; frames delivered via Server-Sent Events. The stream terminates with &#x60;data: [DONE]&#x60;.  |  -  |
| **400** | Invalid request body or missing user message. |  -  |
| **429** | Too Many Requests. |  -  |
| **500** | Internal server error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="listmodels"></a>
# **ListModels**
> ModelList ListModels (string consumer)

List available models (OpenAI-compatible)

Returns the static list of models accepted by `/chat/completions`. Mirrors the OpenAI `GET /v1/models` shape so OpenAI-compatible clients can discover the model ID. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.ConversationalAPIPoweredbyFactSetMercury.Api;
using FactSet.SDK.ConversationalAPIPoweredbyFactSetMercury.Client;
using FactSet.SDK.ConversationalAPIPoweredbyFactSetMercury.Model;

namespace Example
{
    public class ListModelsExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.ConversationalAPIPoweredbyFactSetMercury.Client.Configuration();

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

            var apiInstance = new ChatApi(config);

            var consumer = "developer-portal";  // string | Identify the requestor

            try
            {
                // List available models (OpenAI-compatible)
                ModelList result = apiInstance.ListModels(consumer);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling ChatApi.ListModels: " + e.Message );
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
 **consumer** | **string**| Identify the requestor | 

### Return type
[**ModelList**](ModelList.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Model list. |  -  |
| **429** | Too Many Requests. |  -  |
| **500** | Internal server error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


