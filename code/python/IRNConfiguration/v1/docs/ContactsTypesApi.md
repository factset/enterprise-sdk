# fds.sdk.IRNConfiguration.ContactsTypesApi

All URIs are relative to *https://api.factset.com/research/irn*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_contact_type**](ContactsTypesApi.md#create_contact_type) | **POST** /v1/contact-types | Create contact types
[**delete_contact_type**](ContactsTypesApi.md#delete_contact_type) | **DELETE** /v1/contact-types/{contactTypeId} | Delete a contact type
[**get_contact_types**](ContactsTypesApi.md#get_contact_types) | **GET** /v1/contact-types | Get list of the contact types configured in your group
[**update_contact_type**](ContactsTypesApi.md#update_contact_type) | **PUT** /v1/contact-types/{contactTypeId} | Edit a contact type



# **create_contact_type**
> NewItemDto create_contact_type(body)

Create contact types

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.IRNConfiguration
from fds.sdk.IRNConfiguration.api import contacts___types_api
from fds.sdk.IRNConfiguration.models import *
from dateutil.parser import parse as dateutil_parser
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
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.IRNConfiguration.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.IRNConfiguration.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = contacts___types_api.ContactsTypesApi(api_client)

    body = "body_example" # str | Contact type name

    try:
        # Create contact types
        # example passing only required values which don't have defaults set
        api_response = api_instance.create_contact_type(body)
        pprint(api_response)

    except fds.sdk.IRNConfiguration.ApiException as e:
        print("Exception when calling ContactsTypesApi->create_contact_type: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **str**| Contact type name |

### Return type

[**NewItemDto**](NewItemDto.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Created |  -  |
**400** | Bad Request |  -  |
**0** | Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_contact_type**
> delete_contact_type(contact_type_id)

Delete a contact type

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.IRNConfiguration
from fds.sdk.IRNConfiguration.api import contacts___types_api
from fds.sdk.IRNConfiguration.models import *
from dateutil.parser import parse as dateutil_parser
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
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.IRNConfiguration.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.IRNConfiguration.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = contacts___types_api.ContactsTypesApi(api_client)

    contact_type_id = "contactTypeId_example" # str | contactTypeId to delete associated record

    try:
        # Delete a contact type
        # example passing only required values which don't have defaults set
        api_instance.delete_contact_type(contact_type_id)

    except fds.sdk.IRNConfiguration.ApiException as e:
        print("Exception when calling ContactsTypesApi->delete_contact_type: %s\n" % e)
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

# **get_contact_types**
> [ContactTypeDto] get_contact_types()

Get list of the contact types configured in your group

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.IRNConfiguration
from fds.sdk.IRNConfiguration.api import contacts___types_api
from fds.sdk.IRNConfiguration.models import *
from dateutil.parser import parse as dateutil_parser
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
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.IRNConfiguration.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.IRNConfiguration.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = contacts___types_api.ContactsTypesApi(api_client)


    try:
        # Get list of the contact types configured in your group
        # example, this endpoint has no required or optional parameters
        api_response = api_instance.get_contact_types()
        pprint(api_response)

    except fds.sdk.IRNConfiguration.ApiException as e:
        print("Exception when calling ContactsTypesApi->get_contact_types: %s\n" % e)
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

# **update_contact_type**
> update_contact_type(contact_type_id, body)

Edit a contact type

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.IRNConfiguration
from fds.sdk.IRNConfiguration.api import contacts___types_api
from fds.sdk.IRNConfiguration.models import *
from dateutil.parser import parse as dateutil_parser
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
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.IRNConfiguration.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.IRNConfiguration.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = contacts___types_api.ContactsTypesApi(api_client)

    contact_type_id = "contactTypeId_example" # str | contactTypeId to update associated record
    body = "body_example" # str | Updated contact type name

    try:
        # Edit a contact type
        # example passing only required values which don't have defaults set
        api_instance.update_contact_type(contact_type_id, body)

    except fds.sdk.IRNConfiguration.ApiException as e:
        print("Exception when calling ContactsTypesApi->update_contact_type: %s\n" % e)
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
**204** | No Content |  -  |
**400** | Bad Request |  -  |
**404** | Not Found |  -  |
**0** | Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

