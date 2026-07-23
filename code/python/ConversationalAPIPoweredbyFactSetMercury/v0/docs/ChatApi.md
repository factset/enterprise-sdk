# fds.sdk.ConversationalAPIPoweredbyFactSetMercury.ChatApi

All URIs are relative to *https://api.uat.factset.com/conversational/v0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**chat_completion**](ChatApi.md#chat_completion) | **POST** /chat/completions | Stream a chat completion (OpenAI-compatible)
[**list_models**](ChatApi.md#list_models) | **GET** /models | List available models (OpenAI-compatible)



# **chat_completion**
> ChatCompletionChunk chat_completion(consumer, chat_completion_request)

Stream a chat completion (OpenAI-compatible)

Accepts an OpenAI-style Chat Completions request and streams `chat.completion.chunk` frames via Server-Sent Events.  The `messages` array is searched in reverse for the last entry with `role: user`; everything else is discarded before the request is forwarded to the agent. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.ConversationalAPIPoweredbyFactSetMercury
from fds.sdk.ConversationalAPIPoweredbyFactSetMercury.api import chat_api
from fds.sdk.ConversationalAPIPoweredbyFactSetMercury.models import *
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
configuration = fds.sdk.ConversationalAPIPoweredbyFactSetMercury.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.ConversationalAPIPoweredbyFactSetMercury.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.ConversationalAPIPoweredbyFactSetMercury.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = chat_api.ChatApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    consumer = "developer-portal" # str | Identify the requestor
    chat_completion_request = ChatCompletionRequest(
        model="fds-answer-2.0",
        stream=True,
        messages=[
            ChatMessage(
                role="system",
                content="content_example",
            ),
        ],
    ) # ChatCompletionRequest | 

    try:
        # Stream a chat completion (OpenAI-compatible)
        # example passing only required values which don't have defaults set
        api_response = api_instance.chat_completion(consumer, chat_completion_request)

        pprint(api_response)

    except fds.sdk.ConversationalAPIPoweredbyFactSetMercury.ApiException as e:
        print("Exception when calling ChatApi->chat_completion: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **consumer** | **str**| Identify the requestor |
 **chat_completion_request** | [**ChatCompletionRequest**](ChatCompletionRequest.md)|  |

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
**200** | A stream of OpenAI &#x60;chat.completion.chunk&#x60; frames delivered via Server-Sent Events. The stream terminates with &#x60;data: [DONE]&#x60;.  |  -  |
**400** | Invalid request body or missing user message. |  -  |
**429** | Too Many Requests. |  -  |
**500** | Internal server error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_models**
> ModelList list_models(consumer)

List available models (OpenAI-compatible)

Returns the static list of models accepted by `/chat/completions`. Mirrors the OpenAI `GET /v1/models` shape so OpenAI-compatible clients can discover the model ID. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.ConversationalAPIPoweredbyFactSetMercury
from fds.sdk.ConversationalAPIPoweredbyFactSetMercury.api import chat_api
from fds.sdk.ConversationalAPIPoweredbyFactSetMercury.models import *
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
configuration = fds.sdk.ConversationalAPIPoweredbyFactSetMercury.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.ConversationalAPIPoweredbyFactSetMercury.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.ConversationalAPIPoweredbyFactSetMercury.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = chat_api.ChatApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    consumer = "developer-portal" # str | Identify the requestor

    try:
        # List available models (OpenAI-compatible)
        # example passing only required values which don't have defaults set
        api_response = api_instance.list_models(consumer)

        pprint(api_response)

    except fds.sdk.ConversationalAPIPoweredbyFactSetMercury.ApiException as e:
        print("Exception when calling ChatApi->list_models: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **consumer** | **str**| Identify the requestor |

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
**200** | Model list. |  -  |
**429** | Too Many Requests. |  -  |
**500** | Internal server error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

