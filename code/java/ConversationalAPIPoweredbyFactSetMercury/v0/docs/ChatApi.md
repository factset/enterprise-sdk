# ChatApi

All URIs are relative to *https://api.uat.factset.com/conversational/v0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**chatCompletion**](ChatApi.md#chatCompletion) | **POST** /chat/completions | Stream a chat completion (OpenAI-compatible)
[**listModels**](ChatApi.md#listModels) | **GET** /models | List available models (OpenAI-compatible)



## chatCompletion

> ChatCompletionChunk chatCompletion(consumer, chatCompletionRequest)

Stream a chat completion (OpenAI-compatible)

Accepts an OpenAI-style Chat Completions request and streams
`chat.completion.chunk` frames via Server-Sent Events.

The `messages` array is searched in reverse for the last entry
with `role: user`; everything else is discarded before the
request is forwarded to the agent.


### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.ConversationalAPIPoweredbyFactSetMercury.ApiClient;
import com.factset.sdk.ConversationalAPIPoweredbyFactSetMercury.ApiException;
import com.factset.sdk.ConversationalAPIPoweredbyFactSetMercury.Configuration;
import com.factset.sdk.ConversationalAPIPoweredbyFactSetMercury.auth.*;
import com.factset.sdk.ConversationalAPIPoweredbyFactSetMercury.models.*;
import com.factset.sdk.ConversationalAPIPoweredbyFactSetMercury.api.ChatApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;

public class Example {
    public static void main(String[] args) throws Exception {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
        //
        // The confidential client instance should be reused in production environments.
        // See https://github.com/FactSet/enterprise-sdk-utils-java#authentication
        // for more information on using the ConfidentialClient class
        ConfidentialClient confidentialClient = new ConfidentialClient("./path/to/config.json");
        ApiClient defaultClient = new ApiClient()
          .setFactSetOAuth2Client(confidentialClient);

        /* Basic authentication: FactSetApiKey */
        // See https://github.com/FactSet/enterprise-sdk#api-key
        // ApiClient defaultClient = new ApiClient()
        //   .setUsername("YOUR USERNAME")
        //   .setPassword("YOUR PASSWORD");

        ChatApi apiInstance = new ChatApi(defaultClient);
        String consumer = "developer-portal"; // String | Identify the requestor
        ChatCompletionRequest chatCompletionRequest = new ChatCompletionRequest(); // ChatCompletionRequest | 
        try {
            ChatCompletionChunk result = apiInstance.chatCompletion(consumer, chatCompletionRequest);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling ChatApi#chatCompletion");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **consumer** | **String**| Identify the requestor |
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


## listModels

> ModelList listModels(consumer)

List available models (OpenAI-compatible)

Returns the static list of models accepted by `/chat/completions`.
Mirrors the OpenAI `GET /v1/models` shape so OpenAI-compatible
clients can discover the model ID.


### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.ConversationalAPIPoweredbyFactSetMercury.ApiClient;
import com.factset.sdk.ConversationalAPIPoweredbyFactSetMercury.ApiException;
import com.factset.sdk.ConversationalAPIPoweredbyFactSetMercury.Configuration;
import com.factset.sdk.ConversationalAPIPoweredbyFactSetMercury.auth.*;
import com.factset.sdk.ConversationalAPIPoweredbyFactSetMercury.models.*;
import com.factset.sdk.ConversationalAPIPoweredbyFactSetMercury.api.ChatApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;

public class Example {
    public static void main(String[] args) throws Exception {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
        //
        // The confidential client instance should be reused in production environments.
        // See https://github.com/FactSet/enterprise-sdk-utils-java#authentication
        // for more information on using the ConfidentialClient class
        ConfidentialClient confidentialClient = new ConfidentialClient("./path/to/config.json");
        ApiClient defaultClient = new ApiClient()
          .setFactSetOAuth2Client(confidentialClient);

        /* Basic authentication: FactSetApiKey */
        // See https://github.com/FactSet/enterprise-sdk#api-key
        // ApiClient defaultClient = new ApiClient()
        //   .setUsername("YOUR USERNAME")
        //   .setPassword("YOUR PASSWORD");

        ChatApi apiInstance = new ChatApi(defaultClient);
        String consumer = "developer-portal"; // String | Identify the requestor
        try {
            ModelList result = apiInstance.listModels(consumer);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling ChatApi#listModels");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **consumer** | **String**| Identify the requestor |

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

