# fds.sdk.Conversational.ChatApi

All URIs are relative to *https://api.factset.com/conversational/v0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**chat_completion**](ChatApi.md#chat_completion) | **POST** /chat/completions | Ask a question and stream back the answer (OpenAI-compatible)
[**list_models**](ChatApi.md#list_models) | **GET** /models | List the models you can use (OpenAI-compatible)



# **chat_completion**
> ChatCompletionChunk chat_completion(chat_completion_request)

Ask a question and stream back the answer (OpenAI-compatible)

Send a question and get the answer back as a live stream of small pieces of text, rather than one big response at the end, formatted the way OpenAI's Chat Completions API formats its output.  You send your question in the `messages` array, using the same shape OpenAI uses. The API looks for the last message where `role` is `\"user\"` and treats that as the question being asked right now — any earlier messages in the array, or a system prompt, are not read.  To have a back-and-forth conversation, include the `factset_configuration.conversation_id` you received from a previous call, and the assistant will pick up where that conversation left off. Leave it out to start a brand new conversation — you'll be given a fresh id in the first piece of the response, which you should hold onto and send back next time. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.Conversational
from fds.sdk.Conversational.api import chat_api
from fds.sdk.Conversational.models import *
from dateutil.parser import parse as dateutil_parser
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
#
# The confidential client instance should be reused in production environments.
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.Conversational.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.Conversational.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.Conversational.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = chat_api.ChatApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    chat_completion_request = ChatCompletionRequest(
        model="fds-answer-2.0",
        stream=True,
        messages=[
            ChatMessage(
                role="system",
                content="content_example",
            ),
        ],
        factset_configuration=FactSetConfiguration(
            conversation_id="conversation_id_example",
            return_raw_link_context=False,
        ),
    ) # ChatCompletionRequest | 
    consumer = "developer-portal" # str | A short name identifying which application or integration is making this call, used for FactSet's own usage tracking. If omitted, usage is tracked under a generic default value rather than the request being rejected. (optional)

    try:
        # Ask a question and stream back the answer (OpenAI-compatible)
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.chat_completion(chat_completion_request, consumer=consumer)

        pprint(api_response)

    except fds.sdk.Conversational.ApiException as e:
        print("Exception when calling ChatApi->chat_completion: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chat_completion_request** | [**ChatCompletionRequest**](ChatCompletionRequest.md)|  |
 **consumer** | **str**| A short name identifying which application or integration is making this call, used for FactSet&#39;s own usage tracking. If omitted, usage is tracked under a generic default value rather than the request being rejected. | [optional]

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
**200** | Success. The response isn&#39;t a single JSON object — it&#39;s a live stream of small messages (\&quot;chunks\&quot;), sent one at a time as the answer is generated, using the Server-Sent Events format (each chunk looks like &#x60;data: { ... }&#x60; followed by a blank line). When the answer is finished, the server sends a final &#x60;data: [DONE]&#x60; line so the client knows to stop reading.  The very first chunk includes a &#x60;conversation_id&#x60; field. Save this value — sending it back in a later request&#39;s &#x60;factset_configuration.conversation_id&#x60; lets you continue this same conversation. No other chunk repeats this field.  |  -  |
**400** | The request couldn&#39;t be understood or was missing something required. This happens when: the request body isn&#39;t in the expected shape, there&#39;s no message with &#x60;role: \&quot;user\&quot;&#x60; to answer, the &#x60;model&#x60; value is missing or isn&#39;t one of the supported models, or &#x60;factset_configuration.conversation_id&#x60; was provided but isn&#39;t a properly formatted UUID. The body is a plain-text message, not a JSON object.  |  -  |
**401** | You&#39;re not properly authenticated. Make sure you&#39;re using a valid API key or valid OAuth 2.0 credentials. The body is a plain-text message, not a JSON object. |  -  |
**403** | You don&#39;t have the required permissions for this request — typically because your account or API key isn&#39;t entitled to this service, or because you&#39;re calling from an IP address that isn&#39;t allowed for the API key you&#39;re using. The body is a plain-text message, not a JSON object. |  -  |
**404** | The &#x60;conversation_id&#x60; you sent couldn&#39;t be found — either it was never created, or it belongs to a different user/account than the one making this request. The body is a plain-text message, not a JSON object.  |  -  |
**429** | You&#39;ve sent more requests than are currently allowed in a given period of time. Wait a moment and try again. |  * RateLimit-Limit - Request limit per minute. <br>  * RateLimit-Remaining - Number of available requests. <br>  * RateLimit-Reset - Time remaining (in seconds) until request limit is reset. <br>  * Retry-After - How long (in seconds) to wait before attempting to send a new request. <br>  * X-DataDirect-Request-Key - FactSet request ID. <br>  * X-RateLimit-Limit-Minute - Request limit per minute. <br>  * X-RateLimit-Remaining-Minute - Number of available requests in the minute. <br>  |
**500** | Something went wrong on the server while handling the request. This isn&#39;t caused by anything in your request; retrying later may help. The body is a plain-text message, not a JSON object. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_models**
> ModelList list_models()

List the models you can use (OpenAI-compatible)

Returns the list of model names you're allowed to use with `/chat/completions`. This mirrors the shape of OpenAI's own `GET /v1/models` endpoint, so tools built for OpenAI can discover which model names are valid without any special handling.  There are currently two models, and they behave the same way except for one difference: `fds-web-answer-2.0` is allowed to search the public web for extra information when answering, while `fds-answer-2.0` only uses FactSet's own data. There's no separate switch to turn web search on or off — you choose it by picking which model to use. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.Conversational
from fds.sdk.Conversational.api import chat_api
from fds.sdk.Conversational.models import *
from dateutil.parser import parse as dateutil_parser
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
#
# The confidential client instance should be reused in production environments.
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.Conversational.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.Conversational.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.Conversational.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = chat_api.ChatApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.

    try:
        # List the models you can use (OpenAI-compatible)
        # example, this endpoint has no required or optional parameters
        api_response = api_instance.list_models()

        pprint(api_response)

    except fds.sdk.Conversational.ApiException as e:
        print("Exception when calling ChatApi->list_models: %s\n" % e)
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
**200** | Model list. |  -  |
**401** | You&#39;re not properly authenticated. Make sure you&#39;re using a valid API key or valid OAuth 2.0 credentials. The body is a plain-text message, not a JSON object. |  -  |
**403** | You don&#39;t have the required permissions for this request — typically because your account or API key isn&#39;t entitled to this service, or because you&#39;re calling from an IP address that isn&#39;t allowed for the API key you&#39;re using. The body is a plain-text message, not a JSON object. |  -  |
**429** | You&#39;ve sent more requests than are currently allowed in a given period of time. Wait a moment and try again. |  * RateLimit-Limit - Request limit per minute. <br>  * RateLimit-Remaining - Number of available requests. <br>  * RateLimit-Reset - Time remaining (in seconds) until request limit is reset. <br>  * Retry-After - How long (in seconds) to wait before attempting to send a new request. <br>  * X-DataDirect-Request-Key - FactSet request ID. <br>  * X-RateLimit-Limit-Minute - Request limit per minute. <br>  * X-RateLimit-Remaining-Minute - Number of available requests in the minute. <br>  |
**500** | Something went wrong on the server while handling the request. This isn&#39;t caused by anything in your request; retrying later may help. The body is a plain-text message, not a JSON object. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

