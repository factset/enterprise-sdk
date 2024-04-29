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

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetSearchAnswers
from fds.sdk.FactSetSearchAnswers.api import answers_api
from fds.sdk.FactSetSearchAnswers.models import *
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
configuration = fds.sdk.FactSetSearchAnswers.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetSearchAnswers.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetSearchAnswers.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = answers_api.AnswersApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    query = "query_example" # str | Query for desired answer (e.g., \"fds price\")
    include_thumbnail = False # bool | Includes thumbnail of Adaptive Card in response (optional) if omitted the server will use the default value of False
    disable_no_answer_responses = True # bool | Disables no-result answer responses (no-results and answer without data) (optional) if omitted the server will use the default value of True
    theme = "Light" # str | Theme for desired answer (e.g., \"Light\", \"Dark\") (optional) if omitted the server will use the default value of "Light"

    try:
        # Fetch FactSet answer in Adaptive Card format
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.search_for_adaptive_card_answer(query, include_thumbnail=include_thumbnail, disable_no_answer_responses=disable_no_answer_responses, theme=theme)

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
 **theme** | **str**| Theme for desired answer (e.g., \&quot;Light\&quot;, \&quot;Dark\&quot;) | [optional] if omitted the server will use the default value of "Light"

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

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetSearchAnswers
from fds.sdk.FactSetSearchAnswers.api import answers_api
from fds.sdk.FactSetSearchAnswers.models import *
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
configuration = fds.sdk.FactSetSearchAnswers.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetSearchAnswers.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetSearchAnswers.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = answers_api.AnswersApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    query = "query_example" # str | Query for desired answer (e.g., \"fds price\")
    consuming_application = "Developer Portal" # str | Name of application consuming the API (used for analytics purposes) (optional) if omitted the server will use the default value of "Developer Portal"

    try:
        # Fetch FactSet answer in data format
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.search_for_data_answer(query, consuming_application=consuming_application)

        pprint(api_response)

    except fds.sdk.FactSetSearchAnswers.ApiException as e:
        print("Exception when calling AnswersApi->search_for_data_answer: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **query** | **str**| Query for desired answer (e.g., \&quot;fds price\&quot;) |
 **consuming_application** | **str**| Name of application consuming the API (used for analytics purposes) | [optional] if omitted the server will use the default value of "Developer Portal"

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

