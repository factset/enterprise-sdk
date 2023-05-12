# fds.sdk.IRNConfiguration.CustomSymbolsCustomFieldsApi

All URIs are relative to *https://api.factset.com/research/irn*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_custom_symbol_custom_field**](CustomSymbolsCustomFieldsApi.md#create_custom_symbol_custom_field) | **POST** /v1/custom-symbol-custom-fields | Create a Custom symbol custom field
[**delete_custom_symbol_custom_field**](CustomSymbolsCustomFieldsApi.md#delete_custom_symbol_custom_field) | **DELETE** /v1/custom-symbol-custom-fields/{customSymbolCustomFieldId} | Delete a Custom symbol custom field
[**get_custom_symbol_custom_field**](CustomSymbolsCustomFieldsApi.md#get_custom_symbol_custom_field) | **GET** /v1/custom-symbol-custom-fields/{customSymbolCustomFieldId} | Get a specific Custom symbol custom field&#39;s details
[**get_custom_symbol_custom_fields**](CustomSymbolsCustomFieldsApi.md#get_custom_symbol_custom_fields) | **GET** /v1/custom-symbol-custom-fields | Get all the Custom symbol custom fields
[**patch_custom_symbol_custom_field**](CustomSymbolsCustomFieldsApi.md#patch_custom_symbol_custom_field) | **PATCH** /v1/custom-symbol-custom-fields/{customSymbolCustomFieldId} | Edit a Custom symbol custom field



# **create_custom_symbol_custom_field**
> NewItemDto create_custom_symbol_custom_field()

Create a Custom symbol custom field

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.IRNConfiguration
from fds.sdk.IRNConfiguration.api import custom_symbols___custom_fields_api
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
    api_instance = custom_symbols___custom_fields_api.CustomSymbolsCustomFieldsApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    create_custom_symbol_custom_field_dto = CreateCustomSymbolCustomFieldDto(
        code="code_example",
        name="name_example",
        type="type_example",
        is_hidden=False,
        is_mandatory=False,
        is_shown_in_infobox=True,
        formula_config=CustomSymbolCustomFieldFormulaConfigDto(
            formula="formula_example",
            formula_type="formula_type_example",
        ),
        options_config=[
            "options_config_example",
        ],
        custom_symbol_types=[
            "custom_symbol_types_example",
        ],
    ) # CreateCustomSymbolCustomFieldDto | createCustomSymbolCustomFieldDto object to save (optional)

    try:
        # Create a Custom symbol custom field
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.create_custom_symbol_custom_field(create_custom_symbol_custom_field_dto=create_custom_symbol_custom_field_dto)
        pprint(api_response)

    except fds.sdk.IRNConfiguration.ApiException as e:
        print("Exception when calling CustomSymbolsCustomFieldsApi->create_custom_symbol_custom_field: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **create_custom_symbol_custom_field_dto** | [**CreateCustomSymbolCustomFieldDto**](CreateCustomSymbolCustomFieldDto.md)| createCustomSymbolCustomFieldDto object to save | [optional]

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

# **delete_custom_symbol_custom_field**
> delete_custom_symbol_custom_field(custom_symbol_custom_field_id)

Delete a Custom symbol custom field

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.IRNConfiguration
from fds.sdk.IRNConfiguration.api import custom_symbols___custom_fields_api
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
    api_instance = custom_symbols___custom_fields_api.CustomSymbolsCustomFieldsApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    custom_symbol_custom_field_id = "customSymbolCustomFieldId_example" # str | customSymbolCustomFieldId to delete associated record

    try:
        # Delete a Custom symbol custom field
        # example passing only required values which don't have defaults set
        api_instance.delete_custom_symbol_custom_field(custom_symbol_custom_field_id)

    except fds.sdk.IRNConfiguration.ApiException as e:
        print("Exception when calling CustomSymbolsCustomFieldsApi->delete_custom_symbol_custom_field: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **custom_symbol_custom_field_id** | **str**| customSymbolCustomFieldId to delete associated record |

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

# **get_custom_symbol_custom_field**
> CustomSymbolCustomFieldConfigDto get_custom_symbol_custom_field(custom_symbol_custom_field_id)

Get a specific Custom symbol custom field's details

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.IRNConfiguration
from fds.sdk.IRNConfiguration.api import custom_symbols___custom_fields_api
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
    api_instance = custom_symbols___custom_fields_api.CustomSymbolsCustomFieldsApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    custom_symbol_custom_field_id = "customSymbolCustomFieldId_example" # str | customSymbolCustomFieldId to get associated record

    try:
        # Get a specific Custom symbol custom field's details
        # example passing only required values which don't have defaults set
        api_response = api_instance.get_custom_symbol_custom_field(custom_symbol_custom_field_id)
        pprint(api_response)

    except fds.sdk.IRNConfiguration.ApiException as e:
        print("Exception when calling CustomSymbolsCustomFieldsApi->get_custom_symbol_custom_field: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **custom_symbol_custom_field_id** | **str**| customSymbolCustomFieldId to get associated record |

### Return type

[**CustomSymbolCustomFieldConfigDto**](CustomSymbolCustomFieldConfigDto.md)

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

# **get_custom_symbol_custom_fields**
> [CustomSymbolCustomFieldConfigDto] get_custom_symbol_custom_fields()

Get all the Custom symbol custom fields

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.IRNConfiguration
from fds.sdk.IRNConfiguration.api import custom_symbols___custom_fields_api
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
    api_instance = custom_symbols___custom_fields_api.CustomSymbolsCustomFieldsApi(api_client)


    try:
        # Get all the Custom symbol custom fields
        # example, this endpoint has no required or optional parameters
        api_response = api_instance.get_custom_symbol_custom_fields()
        pprint(api_response)

    except fds.sdk.IRNConfiguration.ApiException as e:
        print("Exception when calling CustomSymbolsCustomFieldsApi->get_custom_symbol_custom_fields: %s\n" % e)
```


### Parameters
This endpoint does not need any parameter.

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **patch_custom_symbol_custom_field**
> patch_custom_symbol_custom_field(custom_symbol_custom_field_id)

Edit a Custom symbol custom field

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.IRNConfiguration
from fds.sdk.IRNConfiguration.api import custom_symbols___custom_fields_api
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
    api_instance = custom_symbols___custom_fields_api.CustomSymbolsCustomFieldsApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    custom_symbol_custom_field_id = "customSymbolCustomFieldId_example" # str | customSymbolCustomFieldId to update associated record
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    operation = [
        Operation(
            operation_type=OperationType(0),
            path="path_example",
            op="op_example",
            _from="_from_example",
            value=None,
        ),
    ] # [Operation] | customSymbolCustomFieldUpdateDto object to update (optional)

    try:
        # Edit a Custom symbol custom field
        # example passing only required values which don't have defaults set
        # and optional values
        api_instance.patch_custom_symbol_custom_field(custom_symbol_custom_field_id, operation=operation)

    except fds.sdk.IRNConfiguration.ApiException as e:
        print("Exception when calling CustomSymbolsCustomFieldsApi->patch_custom_symbol_custom_field: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **custom_symbol_custom_field_id** | **str**| customSymbolCustomFieldId to update associated record |
 **operation** | [**[Operation]**](Operation.md)| customSymbolCustomFieldUpdateDto object to update | [optional]

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

