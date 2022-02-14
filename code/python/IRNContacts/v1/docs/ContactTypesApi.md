# fds.sdk.IRNContacts.ContactTypesApi

All URIs are relative to *https://api-sandbox.factset.com/research/irn*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1_contact_types_contact_type_id_delete**](ContactTypesApi.md#v1_contact_types_contact_type_id_delete) | **DELETE** /v1/contact-types/{contactTypeId} | Delete a contact type
[**v1_contact_types_contact_type_id_put**](ContactTypesApi.md#v1_contact_types_contact_type_id_put) | **PUT** /v1/contact-types/{contactTypeId} | Edit a contact type
[**v1_contact_types_get**](ContactTypesApi.md#v1_contact_types_get) | **GET** /v1/contact-types | Get list of the contact types configured in your group
[**v1_contact_types_post**](ContactTypesApi.md#v1_contact_types_post) | **POST** /v1/contact-types | Create contact types


# **v1_contact_types_contact_type_id_delete**
> v1_contact_types_contact_type_id_delete(contact_type_id)

Delete a contact type

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.IRNContacts
from fds.sdk.IRNContacts.api import contact_types_api
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
    api_instance = contact_types_api.ContactTypesApi(api_client)
    contact_type_id = "contactTypeId_example" # str | contactTypeId to delete associated record

    # example passing only required values which don't have defaults set
    try:
        # Delete a contact type
        api_instance.v1_contact_types_contact_type_id_delete(contact_type_id)
    except fds.sdk.IRNContacts.ApiException as e:
        print("Exception when calling ContactTypesApi->v1_contact_types_contact_type_id_delete: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contact_type_id** | **str**| contactTypeId to delete associated record |

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

# **v1_contact_types_contact_type_id_put**
> v1_contact_types_contact_type_id_put(contact_type_id, body)

Edit a contact type

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.IRNContacts
from fds.sdk.IRNContacts.api import contact_types_api
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
    api_instance = contact_types_api.ContactTypesApi(api_client)
    contact_type_id = "contactTypeId_example" # str | contactTypeId to update associated record
    body = "body_example" # str | Updated contact type name

    # example passing only required values which don't have defaults set
    try:
        # Edit a contact type
        api_instance.v1_contact_types_contact_type_id_put(contact_type_id, body)
    except fds.sdk.IRNContacts.ApiException as e:
        print("Exception when calling ContactTypesApi->v1_contact_types_contact_type_id_put: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contact_type_id** | **str**| contactTypeId to update associated record |
 **body** | **str**| Updated contact type name |

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

# **v1_contact_types_get**
> [ContactTypeDto] v1_contact_types_get()

Get list of the contact types configured in your group

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.IRNContacts
from fds.sdk.IRNContacts.api import contact_types_api
from fds.sdk.IRNContacts.model.contact_type_dto import ContactTypeDto
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
    api_instance = contact_types_api.ContactTypesApi(api_client)

    # example, this endpoint has no required or optional parameters
    try:
        # Get list of the contact types configured in your group
        api_response = api_instance.v1_contact_types_get()
        pprint(api_response)
    except fds.sdk.IRNContacts.ApiException as e:
        print("Exception when calling ContactTypesApi->v1_contact_types_get: %s\n" % e)
```


### Parameters
This endpoint does not need any parameter.

### Return type

[**[ContactTypeDto]**](ContactTypeDto.md)

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

# **v1_contact_types_post**
> str v1_contact_types_post(body)

Create contact types

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.IRNContacts
from fds.sdk.IRNContacts.api import contact_types_api
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
    api_instance = contact_types_api.ContactTypesApi(api_client)
    body = "body_example" # str | Contact type name

    # example passing only required values which don't have defaults set
    try:
        # Create contact types
        api_response = api_instance.v1_contact_types_post(body)
        pprint(api_response)
    except fds.sdk.IRNContacts.ApiException as e:
        print("Exception when calling ContactTypesApi->v1_contact_types_post: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **str**| Contact type name |

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

