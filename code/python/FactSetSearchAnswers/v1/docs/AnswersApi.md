# fds.sdk.FactSetSearchAnswers.AnswersApi

All URIs are relative to *https://api.factset.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**search_for_adaptive_card_answer**](AnswersApi.md#search_for_adaptive_card_answer) | **GET** /search/answers/v1/adaptive-card | Fetch FactSet answer in Adaptive Card format
[**search_for_data_answer**](AnswersApi.md#search_for_data_answer) | **GET** /search/answers/v1/data | Fetch FactSet answer in data format


# **search_for_adaptive_card_answer**
> AdaptiveCardAnswerSuccessResponse search_for_adaptive_card_answer(query)

Fetch FactSet answer in Adaptive Card format

Returns an answer to the specified query (if valid answer exists) in the Adaptive Card format (https://adaptivecards.io/).

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetSearchAnswers
from fds.sdk.FactSetSearchAnswers.api import answers_api
from fds.sdk.FactSetSearchAnswers.model.adaptive_card_answer_success_response import AdaptiveCardAnswerSuccessResponse
from fds.sdk.FactSetSearchAnswers.model.answer_failure_response import AnswerFailureResponse
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.FactSetSearchAnswers.Configuration(
    fds_oauth_client = ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetSearchAnswers.Configuration(
#     username = 'USERNAME-SERIAL',
#     password = 'API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetSearchAnswers.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = answers_api.AnswersApi(api_client)
    query = "query_example" # str | Query for desired answer (e.g., \"fds price\")
    include_thumbnail = False # bool | Includes thumbnail of Adaptive Card in response (optional) if omitted the server will use the default value of False
    disable_no_answer_responses = True # bool | Disables no-result answer responses (no-results and answer without data) (optional) if omitted the server will use the default value of True

    # example passing only required values which don't have defaults set
    try:
        # Fetch FactSet answer in Adaptive Card format
        api_response = api_instance.search_for_adaptive_card_answer(query)
        pprint(api_response)
    except fds.sdk.FactSetSearchAnswers.ApiException as e:
        print("Exception when calling AnswersApi->search_for_adaptive_card_answer: %s\n" % e)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Fetch FactSet answer in Adaptive Card format
        api_response = api_instance.search_for_adaptive_card_answer(query, include_thumbnail=include_thumbnail, disable_no_answer_responses=disable_no_answer_responses)
        pprint(api_response)
    except fds.sdk.FactSetSearchAnswers.ApiException as e:
        print("Exception when calling AnswersApi->search_for_adaptive_card_answer: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **query** | **str**| Query for desired answer (e.g., \&quot;fds price\&quot;) |
 **include_thumbnail** | **bool**| Includes thumbnail of Adaptive Card in response | [optional] if omitted the server will use the default value of False
 **disable_no_answer_responses** | **bool**| Disables no-result answer responses (no-results and answer without data) | [optional] if omitted the server will use the default value of True

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
**200** | Request was successful. |  -  |
**400** | Missing or empty query. |  -  |
**401** | Missing or invalid authentication. |  -  |
**500** | Unhandled error occurred while processing the request. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **search_for_data_answer**
> DataAnswerSuccessResponse search_for_data_answer(query)

Fetch FactSet answer in data format

Returns an answer to the specified query (if a valid answer exists). Returns the answer data only (as JSON), without any markup information.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetSearchAnswers
from fds.sdk.FactSetSearchAnswers.api import answers_api
from fds.sdk.FactSetSearchAnswers.model.answer_failure_response import AnswerFailureResponse
from fds.sdk.FactSetSearchAnswers.model.data_answer_success_response import DataAnswerSuccessResponse
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.FactSetSearchAnswers.Configuration(
    fds_oauth_client = ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetSearchAnswers.Configuration(
#     username = 'USERNAME-SERIAL',
#     password = 'API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetSearchAnswers.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = answers_api.AnswersApi(api_client)
    query = "query_example" # str | Query for desired answer (e.g., \"fds price\")

    # example passing only required values which don't have defaults set
    try:
        # Fetch FactSet answer in data format
        api_response = api_instance.search_for_data_answer(query)
        pprint(api_response)
    except fds.sdk.FactSetSearchAnswers.ApiException as e:
        print("Exception when calling AnswersApi->search_for_data_answer: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **query** | **str**| Query for desired answer (e.g., \&quot;fds price\&quot;) |

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
**200** | Request was successful. |  -  |
**400** | Missing or empty query. |  -  |
**401** | Missing or invalid authentication. |  -  |
**500** | Unhandled error occurred while processing the request. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

