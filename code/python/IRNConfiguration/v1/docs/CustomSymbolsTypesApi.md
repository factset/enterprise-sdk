# fds.sdk.IRNConfiguration.CustomSymbolsTypesApi

All URIs are relative to *https://api.factset.com/research/irn*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_custom_symbol_type**](CustomSymbolsTypesApi.md#create_custom_symbol_type) | **POST** /v1/custom-symbol-types | Create a Custom symbol type
[**delete_custom_symbol_type_async**](CustomSymbolsTypesApi.md#delete_custom_symbol_type_async) | **DELETE** /v1/custom-symbol-types/{customSymbolTypeId} | Delete a Custom symbol type
[**get_custom_symbol_type**](CustomSymbolsTypesApi.md#get_custom_symbol_type) | **GET** /v1/custom-symbol-types/{customSymbolTypeId} | Get a specific Custom symbol type&#39;s details
[**get_custom_symbol_types**](CustomSymbolsTypesApi.md#get_custom_symbol_types) | **GET** /v1/custom-symbol-types | Get all the custom symbol types
[**get_symbol_custom_fields_for_custom_symbol_type**](CustomSymbolsTypesApi.md#get_symbol_custom_fields_for_custom_symbol_type) | **GET** /v1/custom-symbol-types/{customSymbolTypeId}/custom-fields | Get Custom fields for Custom Symbol type
[**update_custom_symbol_type**](CustomSymbolsTypesApi.md#update_custom_symbol_type) | **PUT** /v1/custom-symbol-types/{customSymbolTypeId} | Edit a Custom symbol type
[**update_custom_symbol_type_order**](CustomSymbolsTypesApi.md#update_custom_symbol_type_order) | **POST** /v1/custom-symbol-types/reorder | 



# **create_custom_symbol_type**
> NewItemDto create_custom_symbol_type()

Create a Custom symbol type

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.IRNConfiguration
from fds.sdk.IRNConfiguration.api import custom_symbols___types_api
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
    api_instance = custom_symbols___types_api.CustomSymbolsTypesApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    save_custom_symbol_type_dto = SaveCustomSymbolTypeDto(
        name="name_example",
        hide_address_field=True,
        hide_symbol_subtype=True,
        is_default=False,
        due_diligence_symbol_entity_type=EntityType(0),
        sub_types=[
            "sub_types_example",
        ],
        custom_field_ids=[
            "custom_field_ids_example",
        ],
    ) # SaveCustomSymbolTypeDto | saveCustomSymbolTypeDto object to save (optional)

    try:
        # Create a Custom symbol type
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.create_custom_symbol_type(save_custom_symbol_type_dto=save_custom_symbol_type_dto)

        pprint(api_response)

    except fds.sdk.IRNConfiguration.ApiException as e:
        print("Exception when calling CustomSymbolsTypesApi->create_custom_symbol_type: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **save_custom_symbol_type_dto** | [**SaveCustomSymbolTypeDto**](SaveCustomSymbolTypeDto.md)| saveCustomSymbolTypeDto object to save | [optional]

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

# **delete_custom_symbol_type_async**
> delete_custom_symbol_type_async(custom_symbol_type_id)

Delete a Custom symbol type

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.IRNConfiguration
from fds.sdk.IRNConfiguration.api import custom_symbols___types_api
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
    api_instance = custom_symbols___types_api.CustomSymbolsTypesApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    custom_symbol_type_id = "customSymbolTypeId_example" # str | customSymbolTypeId to delete associated record

    try:
        # Delete a Custom symbol type
        # example passing only required values which don't have defaults set
        api_instance.delete_custom_symbol_type_async(custom_symbol_type_id)


    except fds.sdk.IRNConfiguration.ApiException as e:
        print("Exception when calling CustomSymbolsTypesApi->delete_custom_symbol_type_async: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **custom_symbol_type_id** | **str**| customSymbolTypeId to delete associated record |

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

# **get_custom_symbol_type**
> CustomSymbolTypeDetailDto get_custom_symbol_type(custom_symbol_type_id)

Get a specific Custom symbol type's details

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.IRNConfiguration
from fds.sdk.IRNConfiguration.api import custom_symbols___types_api
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
    api_instance = custom_symbols___types_api.CustomSymbolsTypesApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    custom_symbol_type_id = "customSymbolTypeId_example" # str | customSymbolTypeId to get associated record

    try:
        # Get a specific Custom symbol type's details
        # example passing only required values which don't have defaults set
        api_response = api_instance.get_custom_symbol_type(custom_symbol_type_id)

        pprint(api_response)

    except fds.sdk.IRNConfiguration.ApiException as e:
        print("Exception when calling CustomSymbolsTypesApi->get_custom_symbol_type: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **custom_symbol_type_id** | **str**| customSymbolTypeId to get associated record |

### Return type

[**CustomSymbolTypeDetailDto**](CustomSymbolTypeDetailDto.md)

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

# **get_custom_symbol_types**
> [CustomSymbolTypeDto] get_custom_symbol_types()

Get all the custom symbol types

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.IRNConfiguration
from fds.sdk.IRNConfiguration.api import custom_symbols___types_api
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
    api_instance = custom_symbols___types_api.CustomSymbolsTypesApi(api_client)


    try:
        # Get all the custom symbol types
        # example, this endpoint has no required or optional parameters
        api_response = api_instance.get_custom_symbol_types()

        pprint(api_response)

    except fds.sdk.IRNConfiguration.ApiException as e:
        print("Exception when calling CustomSymbolsTypesApi->get_custom_symbol_types: %s\n" % e)
```


### Parameters
This endpoint does not need any parameter.

### Return type

[**[CustomSymbolTypeDto]**](CustomSymbolTypeDto.md)

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

# **get_symbol_custom_fields_for_custom_symbol_type**
> [CustomSymbolCustomFieldConfigDto] get_symbol_custom_fields_for_custom_symbol_type(custom_symbol_type_id)

Get Custom fields for Custom Symbol type

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.IRNConfiguration
from fds.sdk.IRNConfiguration.api import custom_symbols___types_api
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
    api_instance = custom_symbols___types_api.CustomSymbolsTypesApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    custom_symbol_type_id = "customSymbolTypeId_example" # str | customSymbolTypeId to get associated Custom fileds

    try:
        # Get Custom fields for Custom Symbol type
        # example passing only required values which don't have defaults set
        api_response = api_instance.get_symbol_custom_fields_for_custom_symbol_type(custom_symbol_type_id)

        pprint(api_response)

    except fds.sdk.IRNConfiguration.ApiException as e:
        print("Exception when calling CustomSymbolsTypesApi->get_symbol_custom_fields_for_custom_symbol_type: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **custom_symbol_type_id** | **str**| customSymbolTypeId to get associated Custom fileds |

### Return type

[**[CustomSymbolCustomFieldConfigDto]**](CustomSymbolCustomFieldConfigDto.md)

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

# **update_custom_symbol_type**
> update_custom_symbol_type(custom_symbol_type_id)

Edit a Custom symbol type

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.IRNConfiguration
from fds.sdk.IRNConfiguration.api import custom_symbols___types_api
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
    api_instance = custom_symbols___types_api.CustomSymbolsTypesApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    custom_symbol_type_id = "customSymbolTypeId_example" # str | customSymbolTypeId to update associated record
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    update_custom_symbol_type_dto = UpdateCustomSymbolTypeDto(
        name="name_example",
        hide_address_field=True,
        hide_symbol_subtype=True,
        is_default=False,
        due_diligence_symbol_entity_type=EntityType(0),
        sub_types=[
            CustomSymbolSubTypeDto(
                id="id_example",
                name="name_example",
            ),
        ],
        custom_field_ids=[
            "custom_field_ids_example",
        ],
    ) # UpdateCustomSymbolTypeDto | updateCustomSymbolTypeDto object to update (optional)

    try:
        # Edit a Custom symbol type
        # example passing only required values which don't have defaults set
        # and optional values
        api_instance.update_custom_symbol_type(custom_symbol_type_id, update_custom_symbol_type_dto=update_custom_symbol_type_dto)


    except fds.sdk.IRNConfiguration.ApiException as e:
        print("Exception when calling CustomSymbolsTypesApi->update_custom_symbol_type: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **custom_symbol_type_id** | **str**| customSymbolTypeId to update associated record |
 **update_custom_symbol_type_dto** | [**UpdateCustomSymbolTypeDto**](UpdateCustomSymbolTypeDto.md)| updateCustomSymbolTypeDto object to update | [optional]

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

# **update_custom_symbol_type_order**
> update_custom_symbol_type_order()



### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.IRNConfiguration
from fds.sdk.IRNConfiguration.api import custom_symbols___types_api
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
    api_instance = custom_symbols___types_api.CustomSymbolsTypesApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    reorder_custom_symbol_type_dto = ReorderCustomSymbolTypeDto(
        ids=[
            "ids_example",
        ],
    ) # ReorderCustomSymbolTypeDto |  (optional)

    try:
        # example passing only required values which don't have defaults set
        # and optional values
        api_instance.update_custom_symbol_type_order(reorder_custom_symbol_type_dto=reorder_custom_symbol_type_dto)


    except fds.sdk.IRNConfiguration.ApiException as e:
        print("Exception when calling CustomSymbolsTypesApi->update_custom_symbol_type_order: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reorder_custom_symbol_type_dto** | [**ReorderCustomSymbolTypeDto**](ReorderCustomSymbolTypeDto.md)|  | [optional]

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

