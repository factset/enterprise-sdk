# fds.sdk.IRNContacts.PhoneNumberTypesApi

All URIs are relative to *https://api-sandbox.factset.com/research/irn*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1_phone_number_types_get**](PhoneNumberTypesApi.md#v1_phone_number_types_get) | **GET** /v1/phone-number-types | Get list of the phone types configured in your group
[**v1_phone_number_types_phone_number_type_id_delete**](PhoneNumberTypesApi.md#v1_phone_number_types_phone_number_type_id_delete) | **DELETE** /v1/phone-number-types/{phoneNumberTypeId} | Delete a phone type
[**v1_phone_number_types_phone_number_type_id_put**](PhoneNumberTypesApi.md#v1_phone_number_types_phone_number_type_id_put) | **PUT** /v1/phone-number-types/{phoneNumberTypeId} | Edit a phone type
[**v1_phone_number_types_post**](PhoneNumberTypesApi.md#v1_phone_number_types_post) | **POST** /v1/phone-number-types | Create a phone type


# **v1_phone_number_types_get**
> [PhoneNumberTypeDto] v1_phone_number_types_get()

Get list of the phone types configured in your group

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.IRNContacts
from fds.sdk.IRNContacts.api import phone_number_types_api
from fds.sdk.IRNContacts.model.phone_number_type_dto import PhoneNumberTypeDto
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.IRNContacts.Configuration(
    fds_oauth_client = ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.IRNContacts.Configuration(
#     username = 'USERNAME-SERIAL',
#     password = 'API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.IRNContacts.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = phone_number_types_api.PhoneNumberTypesApi(api_client)

    # example, this endpoint has no required or optional parameters
    try:
        # Get list of the phone types configured in your group
        api_response = api_instance.v1_phone_number_types_get()
        pprint(api_response)
    except fds.sdk.IRNContacts.ApiException as e:
        print("Exception when calling PhoneNumberTypesApi->v1_phone_number_types_get: %s\n" % e)
```


### Parameters
This endpoint does not need any parameter.

### Return type

[**[PhoneNumberTypeDto]**](PhoneNumberTypeDto.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1_phone_number_types_phone_number_type_id_delete**
> v1_phone_number_types_phone_number_type_id_delete(phone_number_type_id)

Delete a phone type

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.IRNContacts
from fds.sdk.IRNContacts.api import phone_number_types_api
from fds.sdk.IRNContacts.model.problem_details import ProblemDetails
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.IRNContacts.Configuration(
    fds_oauth_client = ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.IRNContacts.Configuration(
#     username = 'USERNAME-SERIAL',
#     password = 'API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.IRNContacts.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = phone_number_types_api.PhoneNumberTypesApi(api_client)
    phone_number_type_id = "phoneNumberTypeId_example" # str | phoneNumberTypeId for deleting associated record

    # example passing only required values which don't have defaults set
    try:
        # Delete a phone type
        api_instance.v1_phone_number_types_phone_number_type_id_delete(phone_number_type_id)
    except fds.sdk.IRNContacts.ApiException as e:
        print("Exception when calling PhoneNumberTypesApi->v1_phone_number_types_phone_number_type_id_delete: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **phone_number_type_id** | **str**| phoneNumberTypeId for deleting associated record |

### Return type

void (empty response body)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Bad Request |  -  |
**404** | Not Found |  -  |
**0** | Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1_phone_number_types_phone_number_type_id_put**
> v1_phone_number_types_phone_number_type_id_put(phone_number_type_id, body)

Edit a phone type

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.IRNContacts
from fds.sdk.IRNContacts.api import phone_number_types_api
from fds.sdk.IRNContacts.model.problem_details import ProblemDetails
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.IRNContacts.Configuration(
    fds_oauth_client = ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.IRNContacts.Configuration(
#     username = 'USERNAME-SERIAL',
#     password = 'API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.IRNContacts.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = phone_number_types_api.PhoneNumberTypesApi(api_client)
    phone_number_type_id = "phoneNumberTypeId_example" # str | phoneNumberTypeId to update associated record
    body = "body_example" # str | Update with phoneNumberType

    # example passing only required values which don't have defaults set
    try:
        # Edit a phone type
        api_instance.v1_phone_number_types_phone_number_type_id_put(phone_number_type_id, body)
    except fds.sdk.IRNContacts.ApiException as e:
        print("Exception when calling PhoneNumberTypesApi->v1_phone_number_types_phone_number_type_id_put: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **phone_number_type_id** | **str**| phoneNumberTypeId to update associated record |
 **body** | **str**| Update with phoneNumberType |

### Return type

void (empty response body)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Success |  -  |
**400** | Bad Request |  -  |
**404** | Not Found |  -  |
**0** | Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1_phone_number_types_post**
> str v1_phone_number_types_post(body)

Create a phone type

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.IRNContacts
from fds.sdk.IRNContacts.api import phone_number_types_api
from fds.sdk.IRNContacts.model.problem_details import ProblemDetails
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.IRNContacts.Configuration(
    fds_oauth_client = ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.IRNContacts.Configuration(
#     username = 'USERNAME-SERIAL',
#     password = 'API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.IRNContacts.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = phone_number_types_api.PhoneNumberTypesApi(api_client)
    body = "body_example" # str | To add phoneNumberType

    # example passing only required values which don't have defaults set
    try:
        # Create a phone type
        api_response = api_instance.v1_phone_number_types_post(body)
        pprint(api_response)
    except fds.sdk.IRNContacts.ApiException as e:
        print("Exception when calling PhoneNumberTypesApi->v1_phone_number_types_post: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **str**| To add phoneNumberType |

### Return type

**str**

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Success |  -  |
**400** | Bad Request |  -  |
**0** | Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

