# fds.sdk.IRNContacts.ContactCustomFieldsApi

All URIs are relative to *https://api-sandbox.factset.com/research/irn*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1_contact_custom_fields_contact_custom_field_id_delete**](ContactCustomFieldsApi.md#v1_contact_custom_fields_contact_custom_field_id_delete) | **DELETE** /v1/contact-custom-fields/{contactCustomFieldId} | Delete a contact custom field
[**v1_contact_custom_fields_contact_custom_field_id_get**](ContactCustomFieldsApi.md#v1_contact_custom_fields_contact_custom_field_id_get) | **GET** /v1/contact-custom-fields/{contactCustomFieldId} | Get a specific Contact custom field&#39;s details
[**v1_contact_custom_fields_contact_custom_field_id_patch**](ContactCustomFieldsApi.md#v1_contact_custom_fields_contact_custom_field_id_patch) | **PATCH** /v1/contact-custom-fields/{contactCustomFieldId} | Edit a contact custom field
[**v1_contact_custom_fields_get**](ContactCustomFieldsApi.md#v1_contact_custom_fields_get) | **GET** /v1/contact-custom-fields | Get all the contact custom fields
[**v1_contact_custom_fields_post**](ContactCustomFieldsApi.md#v1_contact_custom_fields_post) | **POST** /v1/contact-custom-fields | Create a contact custom field
[**v1_contact_custom_fields_reorder_post**](ContactCustomFieldsApi.md#v1_contact_custom_fields_reorder_post) | **POST** /v1/contact-custom-fields/reorder | Reorder contact custom fields


# **v1_contact_custom_fields_contact_custom_field_id_delete**
> v1_contact_custom_fields_contact_custom_field_id_delete(contact_custom_field_id)

Delete a contact custom field

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.IRNContacts
from fds.sdk.IRNContacts.api import contact_custom_fields_api
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
    api_instance = contact_custom_fields_api.ContactCustomFieldsApi(api_client)
    contact_custom_field_id = "contactCustomFieldId_example" # str | contactCustomFieldId to delete associated record

    # example passing only required values which don't have defaults set
    try:
        # Delete a contact custom field
        api_instance.v1_contact_custom_fields_contact_custom_field_id_delete(contact_custom_field_id)
    except fds.sdk.IRNContacts.ApiException as e:
        print("Exception when calling ContactCustomFieldsApi->v1_contact_custom_fields_contact_custom_field_id_delete: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contact_custom_field_id** | **str**| contactCustomFieldId to delete associated record |

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

# **v1_contact_custom_fields_contact_custom_field_id_get**
> ContactCustomFieldDto v1_contact_custom_fields_contact_custom_field_id_get(contact_custom_field_id)

Get a specific Contact custom field's details

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.IRNContacts
from fds.sdk.IRNContacts.api import contact_custom_fields_api
from fds.sdk.IRNContacts.model.problem_details import ProblemDetails
from fds.sdk.IRNContacts.model.contact_custom_field_dto import ContactCustomFieldDto
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
    api_instance = contact_custom_fields_api.ContactCustomFieldsApi(api_client)
    contact_custom_field_id = "contactCustomFieldId_example" # str | contactCustomFieldId to get associated record

    # example passing only required values which don't have defaults set
    try:
        # Get a specific Contact custom field's details
        api_response = api_instance.v1_contact_custom_fields_contact_custom_field_id_get(contact_custom_field_id)
        pprint(api_response)
    except fds.sdk.IRNContacts.ApiException as e:
        print("Exception when calling ContactCustomFieldsApi->v1_contact_custom_fields_contact_custom_field_id_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contact_custom_field_id** | **str**| contactCustomFieldId to get associated record |

### Return type

[**ContactCustomFieldDto**](ContactCustomFieldDto.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**404** | Not Found |  -  |
**0** | Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1_contact_custom_fields_contact_custom_field_id_patch**
> v1_contact_custom_fields_contact_custom_field_id_patch(contact_custom_field_id)

Edit a contact custom field

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.IRNContacts
from fds.sdk.IRNContacts.api import contact_custom_fields_api
from fds.sdk.IRNContacts.model.problem_details import ProblemDetails
from fds.sdk.IRNContacts.model.operation import Operation
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
    api_instance = contact_custom_fields_api.ContactCustomFieldsApi(api_client)
    contact_custom_field_id = "contactCustomFieldId_example" # str | contactCustomFieldId to update associated record
    operation = [
        Operation(
            value={},
            path="path_example",
            op="op_example",
            _from="_from_example",
        ),
    ] # [Operation] | contactCustomFieldUpdateDto object to update (optional)

    # example passing only required values which don't have defaults set
    try:
        # Edit a contact custom field
        api_instance.v1_contact_custom_fields_contact_custom_field_id_patch(contact_custom_field_id)
    except fds.sdk.IRNContacts.ApiException as e:
        print("Exception when calling ContactCustomFieldsApi->v1_contact_custom_fields_contact_custom_field_id_patch: %s\n" % e)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Edit a contact custom field
        api_instance.v1_contact_custom_fields_contact_custom_field_id_patch(contact_custom_field_id, operation=operation)
    except fds.sdk.IRNContacts.ApiException as e:
        print("Exception when calling ContactCustomFieldsApi->v1_contact_custom_fields_contact_custom_field_id_patch: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contact_custom_field_id** | **str**| contactCustomFieldId to update associated record |
 **operation** | [**[Operation]**](Operation.md)| contactCustomFieldUpdateDto object to update | [optional]

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
**200** | Success |  -  |
**400** | Bad Request |  -  |
**404** | Not Found |  -  |
**0** | Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1_contact_custom_fields_get**
> [ContactCustomFieldDto] v1_contact_custom_fields_get()

Get all the contact custom fields

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.IRNContacts
from fds.sdk.IRNContacts.api import contact_custom_fields_api
from fds.sdk.IRNContacts.model.contact_custom_field_dto import ContactCustomFieldDto
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
    api_instance = contact_custom_fields_api.ContactCustomFieldsApi(api_client)

    # example, this endpoint has no required or optional parameters
    try:
        # Get all the contact custom fields
        api_response = api_instance.v1_contact_custom_fields_get()
        pprint(api_response)
    except fds.sdk.IRNContacts.ApiException as e:
        print("Exception when calling ContactCustomFieldsApi->v1_contact_custom_fields_get: %s\n" % e)
```


### Parameters
This endpoint does not need any parameter.

### Return type

[**[ContactCustomFieldDto]**](ContactCustomFieldDto.md)

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

# **v1_contact_custom_fields_post**
> str v1_contact_custom_fields_post()

Create a contact custom field

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.IRNContacts
from fds.sdk.IRNContacts.api import contact_custom_fields_api
from fds.sdk.IRNContacts.model.problem_details import ProblemDetails
from fds.sdk.IRNContacts.model.contact_custom_field_save_dto import ContactCustomFieldSaveDto
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
    api_instance = contact_custom_fields_api.ContactCustomFieldsApi(api_client)
    contact_custom_field_save_dto = ContactCustomFieldSaveDto(
        code="code_example",
        name="name_example",
        type=ContactCustomFieldType("None"),
        is_hidden=False,
        is_mandatory=False,
        field_formula=ContactCustomFieldFormulaDto(
            formula="formula_example",
            is_screening=False,
            symbol="symbol_example",
        ),
        contact_custom_field_options=[
            ContactCustomFieldOptionSaveDto(
                name="name_example",
            ),
        ],
    ) # ContactCustomFieldSaveDto | ContactCustomFieldSaveDto object to save (optional)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Create a contact custom field
        api_response = api_instance.v1_contact_custom_fields_post(contact_custom_field_save_dto=contact_custom_field_save_dto)
        pprint(api_response)
    except fds.sdk.IRNContacts.ApiException as e:
        print("Exception when calling ContactCustomFieldsApi->v1_contact_custom_fields_post: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contact_custom_field_save_dto** | [**ContactCustomFieldSaveDto**](ContactCustomFieldSaveDto.md)| ContactCustomFieldSaveDto object to save | [optional]

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

# **v1_contact_custom_fields_reorder_post**
> v1_contact_custom_fields_reorder_post()

Reorder contact custom fields

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.IRNContacts
from fds.sdk.IRNContacts.api import contact_custom_fields_api
from fds.sdk.IRNContacts.model.problem_details import ProblemDetails
from fds.sdk.IRNContacts.model.contact_custom_field_list_dto import ContactCustomFieldListDto
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
    api_instance = contact_custom_fields_api.ContactCustomFieldsApi(api_client)
    contact_custom_field_list_dto = ContactCustomFieldListDto(
        ids=[
            "ids_example",
        ],
    ) # ContactCustomFieldListDto | List of Guid (optional)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Reorder contact custom fields
        api_instance.v1_contact_custom_fields_reorder_post(contact_custom_field_list_dto=contact_custom_field_list_dto)
    except fds.sdk.IRNContacts.ApiException as e:
        print("Exception when calling ContactCustomFieldsApi->v1_contact_custom_fields_reorder_post: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contact_custom_field_list_dto** | [**ContactCustomFieldListDto**](ContactCustomFieldListDto.md)| List of Guid | [optional]

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

