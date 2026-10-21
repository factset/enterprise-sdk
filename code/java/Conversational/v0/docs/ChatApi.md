# ChatApi

All URIs are relative to *https://api.factset.com/conversational/v0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**chatCompletion**](ChatApi.md#chatCompletion) | **POST** /chat/completions | Ask a question and stream back the answer (OpenAI-compatible)
[**listModels**](ChatApi.md#listModels) | **GET** /models | List the models you can use (OpenAI-compatible)



## chatCompletion

> ChatCompletionChunk chatCompletion(chatCompletionRequest, consumer)

Ask a question and stream back the answer (OpenAI-compatible)

Send a question and get the answer back as a live stream of
small pieces of text, rather than one big response at the end,
formatted the way OpenAI's Chat Completions API formats its
output.

You send your question in the `messages` array, using the same
shape OpenAI uses. The API looks for the last message where
`role` is `"user"` and treats that as the question being asked
right now — any earlier messages in the array, or a system
prompt, are not read.

To have a back-and-forth conversation, include the
`factset_configuration.conversation_id` you received from a
previous call, and the assistant will pick up where that
conversation left off. Leave it out to start a brand new
conversation — you'll be given a fresh id in the first piece of
the response, which you should hold onto and send back next
time.


### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.Conversational.ApiClient;
import com.factset.sdk.Conversational.ApiException;
import com.factset.sdk.Conversational.Configuration;
import com.factset.sdk.Conversational.auth.*;
import com.factset.sdk.Conversational.models.*;
import com.factset.sdk.Conversational.api.ChatApi;

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
        ChatCompletionRequest chatCompletionRequest = new ChatCompletionRequest(); // ChatCompletionRequest | 
        String consumer = "developer-portal"; // String | A short name identifying which application or integration is making this call, used for FactSet's own usage tracking. If omitted, usage is tracked under a generic default value rather than the request being rejected.
        try {
            ChatCompletionChunk result = apiInstance.chatCompletion(chatCompletionRequest, consumer);
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
 **chatCompletionRequest** | [**ChatCompletionRequest**](ChatCompletionRequest.md)|  |
 **consumer** | **String**| A short name identifying which application or integration is making this call, used for FactSet&#39;s own usage tracking. If omitted, usage is tracked under a generic default value rather than the request being rejected. | [optional]

### Return type

[**ChatCompletionChunk**](ChatCompletionChunk.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: text/event-stream, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. The response isn&#39;t a single JSON object — it&#39;s a live stream of small messages (\&quot;chunks\&quot;), sent one at a time as the answer is generated, using the Server-Sent Events format (each chunk looks like &#x60;data: { ... }&#x60; followed by a blank line). When the answer is finished, the server sends a final &#x60;data: [DONE]&#x60; line so the client knows to stop reading.  The very first chunk includes a &#x60;conversation_id&#x60; field. Save this value — sending it back in a later request&#39;s &#x60;factset_configuration.conversation_id&#x60; lets you continue this same conversation. No other chunk repeats this field.  |  -  |
| **400** | The request couldn&#39;t be understood or was missing something required. This happens when: the request body isn&#39;t in the expected shape, there&#39;s no message with &#x60;role: \&quot;user\&quot;&#x60; to answer, the &#x60;model&#x60; value is missing or isn&#39;t one of the supported models, or &#x60;factset_configuration.conversation_id&#x60; was provided but isn&#39;t a properly formatted UUID. The body is a plain-text message, not a JSON object.  |  -  |
| **401** | You&#39;re not properly authenticated. Make sure you&#39;re using a valid API key or valid OAuth 2.0 credentials. The body is a plain-text message, not a JSON object. |  -  |
| **403** | You don&#39;t have the required permissions for this request — typically because your account or API key isn&#39;t entitled to this service, or because you&#39;re calling from an IP address that isn&#39;t allowed for the API key you&#39;re using. The body is a plain-text message, not a JSON object. |  -  |
| **404** | The &#x60;conversation_id&#x60; you sent couldn&#39;t be found — either it was never created, or it belongs to a different user/account than the one making this request. The body is a plain-text message, not a JSON object.  |  -  |
| **429** | You&#39;ve sent more requests than are currently allowed in a given period of time. Wait a moment and try again. |  * RateLimit-Limit - Request limit per minute. <br>  * RateLimit-Remaining - Number of available requests. <br>  * RateLimit-Reset - Time remaining (in seconds) until request limit is reset. <br>  * Retry-After - How long (in seconds) to wait before attempting to send a new request. <br>  * X-DataDirect-Request-Key - FactSet request ID. <br>  * X-RateLimit-Limit-Minute - Request limit per minute. <br>  * X-RateLimit-Remaining-Minute - Number of available requests in the minute. <br>  |
| **500** | Something went wrong on the server while handling the request. This isn&#39;t caused by anything in your request; retrying later may help. The body is a plain-text message, not a JSON object. |  -  |


## listModels

> ModelList listModels()

List the models you can use (OpenAI-compatible)

Returns the list of model names you're allowed to use with
`/chat/completions`. This mirrors the shape of OpenAI's own
`GET /v1/models` endpoint, so tools built for OpenAI can
discover which model names are valid without any special
handling.

There are currently two models, and they behave the same way
except for one difference: `fds-web-answer-2.0` is allowed to
search the public web for extra information when answering,
while `fds-answer-2.0` only uses FactSet's own data. There's no
separate switch to turn web search on or off — you choose it by
picking which model to use.


### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.Conversational.ApiClient;
import com.factset.sdk.Conversational.ApiException;
import com.factset.sdk.Conversational.Configuration;
import com.factset.sdk.Conversational.auth.*;
import com.factset.sdk.Conversational.models.*;
import com.factset.sdk.Conversational.api.ChatApi;

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
        try {
            ModelList result = apiInstance.listModels();
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

This endpoint does not need any parameter.

### Return type

[**ModelList**](ModelList.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Model list. |  -  |
| **401** | You&#39;re not properly authenticated. Make sure you&#39;re using a valid API key or valid OAuth 2.0 credentials. The body is a plain-text message, not a JSON object. |  -  |
| **403** | You don&#39;t have the required permissions for this request — typically because your account or API key isn&#39;t entitled to this service, or because you&#39;re calling from an IP address that isn&#39;t allowed for the API key you&#39;re using. The body is a plain-text message, not a JSON object. |  -  |
| **429** | You&#39;ve sent more requests than are currently allowed in a given period of time. Wait a moment and try again. |  * RateLimit-Limit - Request limit per minute. <br>  * RateLimit-Remaining - Number of available requests. <br>  * RateLimit-Reset - Time remaining (in seconds) until request limit is reset. <br>  * Retry-After - How long (in seconds) to wait before attempting to send a new request. <br>  * X-DataDirect-Request-Key - FactSet request ID. <br>  * X-RateLimit-Limit-Minute - Request limit per minute. <br>  * X-RateLimit-Remaining-Minute - Number of available requests in the minute. <br>  |
| **500** | Something went wrong on the server while handling the request. This isn&#39;t caused by anything in your request; retrying later may help. The body is a plain-text message, not a JSON object. |  -  |

