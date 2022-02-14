# fds.sdk.IRNConfiguration.SubjectsApi

All URIs are relative to *https://api-sandbox.factset.com/research/irn*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1_subjects_get**](SubjectsApi.md#v1_subjects_get) | **GET** /v1/subjects | Get all Subjects
[**v1_subjects_subject_id_get**](SubjectsApi.md#v1_subjects_subject_id_get) | **GET** /v1/subjects/{subjectId} | Get Subject details for the given Id provided


# **v1_subjects_get**
> [SubjectSummaryDto] v1_subjects_get()

Get all Subjects

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.IRNConfiguration
from fds.sdk.IRNConfiguration.api import subjects_api
from fds.sdk.IRNConfiguration.model.problem_details import ProblemDetails
from fds.sdk.IRNConfiguration.model.subject_summary_dto import SubjectSummaryDto
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.IRNConfiguration.Configuration(
    fds_oauth_client = ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.IRNConfiguration.Configuration(
#     username = 'USERNAME-SERIAL',
#     password = 'API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.IRNConfiguration.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = subjects_api.SubjectsApi(api_client)
    x_irn_ignore_permissions = False # bool |  (optional) if omitted the server will use the default value of False

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Get all Subjects
        api_response = api_instance.v1_subjects_get(x_irn_ignore_permissions=x_irn_ignore_permissions)
        pprint(api_response)
    except fds.sdk.IRNConfiguration.ApiException as e:
        print("Exception when calling SubjectsApi->v1_subjects_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **x_irn_ignore_permissions** | **bool**|  | [optional] if omitted the server will use the default value of False

### Return type

[**[SubjectSummaryDto]**](SubjectSummaryDto.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**403** | Forbidden |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1_subjects_subject_id_get**
> SubjectConfigDto v1_subjects_subject_id_get(subject_id)

Get Subject details for the given Id provided

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.IRNConfiguration
from fds.sdk.IRNConfiguration.api import subjects_api
from fds.sdk.IRNConfiguration.model.problem_details import ProblemDetails
from fds.sdk.IRNConfiguration.model.subject_config_dto import SubjectConfigDto
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.IRNConfiguration.Configuration(
    fds_oauth_client = ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.IRNConfiguration.Configuration(
#     username = 'USERNAME-SERIAL',
#     password = 'API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.IRNConfiguration.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = subjects_api.SubjectsApi(api_client)
    subject_id = "subjectId_example" # str | Id
    x_irn_ignore_permissions = False # bool |  (optional) if omitted the server will use the default value of False

    # example passing only required values which don't have defaults set
    try:
        # Get Subject details for the given Id provided
        api_response = api_instance.v1_subjects_subject_id_get(subject_id)
        pprint(api_response)
    except fds.sdk.IRNConfiguration.ApiException as e:
        print("Exception when calling SubjectsApi->v1_subjects_subject_id_get: %s\n" % e)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Get Subject details for the given Id provided
        api_response = api_instance.v1_subjects_subject_id_get(subject_id, x_irn_ignore_permissions=x_irn_ignore_permissions)
        pprint(api_response)
    except fds.sdk.IRNConfiguration.ApiException as e:
        print("Exception when calling SubjectsApi->v1_subjects_subject_id_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subject_id** | **str**| Id |
 **x_irn_ignore_permissions** | **bool**|  | [optional] if omitted the server will use the default value of False

### Return type

[**SubjectConfigDto**](SubjectConfigDto.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

