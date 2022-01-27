# fds.sdk.IRNContacts.ContactRolesApi

All URIs are relative to *https://api-sandbox.factset.com/research/irn*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1_contact_roles_contact_role_id_delete**](ContactRolesApi.md#v1_contact_roles_contact_role_id_delete) | **DELETE** /v1/contact-roles/{contactRoleId} | Delete a contact role
[**v1_contact_roles_contact_role_id_put**](ContactRolesApi.md#v1_contact_roles_contact_role_id_put) | **PUT** /v1/contact-roles/{contactRoleId} | Edit a contact role
[**v1_contact_roles_get**](ContactRolesApi.md#v1_contact_roles_get) | **GET** /v1/contact-roles | Get list of the contact roles configured in your group
[**v1_contact_roles_post**](ContactRolesApi.md#v1_contact_roles_post) | **POST** /v1/contact-roles | Create contact roles


# **v1_contact_roles_contact_role_id_delete**
> v1_contact_roles_contact_role_id_delete(contact_role_id)

Delete a contact role

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
import time
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.IRNContacts
from fds.sdk.IRNContacts.api import contact_roles_api
from fds.sdk.IRNContacts.model.problem_details import ProblemDetails
from pprint import pprint
# Defining the host is optional and defaults to https://api-sandbox.factset.com/research/irn
# See configuration.py for a list of all supported configuration parameters.
configuration = fds.sdk.IRNContacts.Configuration(
    host = "https://api-sandbox.factset.com/research/irn"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://developer.factset.com/applications
configuration = fds.sdk.IRNContacts.Configuration(
     fds_oauth_client = ConfidentialClient('app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://developer.factset.com/manage-api-keys
# configuration = fds.sdk.IRNContacts.Configuration(
#     username = 'USERNAME-SERIAL',
#     password = 'API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.IRNContacts.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = contact_roles_api.ContactRolesApi(api_client)
    contact_role_id = "contactRoleId_example" # str | contactRoleId to delete associated record

    # example passing only required values which don't have defaults set
    try:
        # Delete a contact role
        api_instance.v1_contact_roles_contact_role_id_delete(contact_role_id)
    except fds.sdk.IRNContacts.ApiException as e:
        print("Exception when calling ContactRolesApi->v1_contact_roles_contact_role_id_delete: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contact_role_id** | **str**| contactRoleId to delete associated record |

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

# **v1_contact_roles_contact_role_id_put**
> v1_contact_roles_contact_role_id_put(contact_role_id, body)

Edit a contact role

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
import time
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.IRNContacts
from fds.sdk.IRNContacts.api import contact_roles_api
from fds.sdk.IRNContacts.model.problem_details import ProblemDetails
from pprint import pprint
# Defining the host is optional and defaults to https://api-sandbox.factset.com/research/irn
# See configuration.py for a list of all supported configuration parameters.
configuration = fds.sdk.IRNContacts.Configuration(
    host = "https://api-sandbox.factset.com/research/irn"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://developer.factset.com/applications
configuration = fds.sdk.IRNContacts.Configuration(
     fds_oauth_client = ConfidentialClient('app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://developer.factset.com/manage-api-keys
# configuration = fds.sdk.IRNContacts.Configuration(
#     username = 'USERNAME-SERIAL',
#     password = 'API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.IRNContacts.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = contact_roles_api.ContactRolesApi(api_client)
    contact_role_id = "contactRoleId_example" # str | contactRoleId to update associated record
    body = "body_example" # str | Updated contact role name

    # example passing only required values which don't have defaults set
    try:
        # Edit a contact role
        api_instance.v1_contact_roles_contact_role_id_put(contact_role_id, body)
    except fds.sdk.IRNContacts.ApiException as e:
        print("Exception when calling ContactRolesApi->v1_contact_roles_contact_role_id_put: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contact_role_id** | **str**| contactRoleId to update associated record |
 **body** | **str**| Updated contact role name |

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

# **v1_contact_roles_get**
> [ContactRoleDto] v1_contact_roles_get()

Get list of the contact roles configured in your group

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
import time
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.IRNContacts
from fds.sdk.IRNContacts.api import contact_roles_api
from fds.sdk.IRNContacts.model.contact_role_dto import ContactRoleDto
from pprint import pprint
# Defining the host is optional and defaults to https://api-sandbox.factset.com/research/irn
# See configuration.py for a list of all supported configuration parameters.
configuration = fds.sdk.IRNContacts.Configuration(
    host = "https://api-sandbox.factset.com/research/irn"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://developer.factset.com/applications
configuration = fds.sdk.IRNContacts.Configuration(
     fds_oauth_client = ConfidentialClient('app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://developer.factset.com/manage-api-keys
# configuration = fds.sdk.IRNContacts.Configuration(
#     username = 'USERNAME-SERIAL',
#     password = 'API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.IRNContacts.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = contact_roles_api.ContactRolesApi(api_client)

    # example, this endpoint has no required or optional parameters
    try:
        # Get list of the contact roles configured in your group
        api_response = api_instance.v1_contact_roles_get()
        pprint(api_response)
    except fds.sdk.IRNContacts.ApiException as e:
        print("Exception when calling ContactRolesApi->v1_contact_roles_get: %s\n" % e)
```


### Parameters
This endpoint does not need any parameter.

### Return type

[**[ContactRoleDto]**](ContactRoleDto.md)

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

# **v1_contact_roles_post**
> str v1_contact_roles_post(body)

Create contact roles

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
import time
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.IRNContacts
from fds.sdk.IRNContacts.api import contact_roles_api
from fds.sdk.IRNContacts.model.problem_details import ProblemDetails
from pprint import pprint
# Defining the host is optional and defaults to https://api-sandbox.factset.com/research/irn
# See configuration.py for a list of all supported configuration parameters.
configuration = fds.sdk.IRNContacts.Configuration(
    host = "https://api-sandbox.factset.com/research/irn"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://developer.factset.com/applications
configuration = fds.sdk.IRNContacts.Configuration(
     fds_oauth_client = ConfidentialClient('app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://developer.factset.com/manage-api-keys
# configuration = fds.sdk.IRNContacts.Configuration(
#     username = 'USERNAME-SERIAL',
#     password = 'API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.IRNContacts.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = contact_roles_api.ContactRolesApi(api_client)
    body = "body_example" # str | Contact role name

    # example passing only required values which don't have defaults set
    try:
        # Create contact roles
        api_response = api_instance.v1_contact_roles_post(body)
        pprint(api_response)
    except fds.sdk.IRNContacts.ApiException as e:
        print("Exception when calling ContactRolesApi->v1_contact_roles_post: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **str**| Contact role name |

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

