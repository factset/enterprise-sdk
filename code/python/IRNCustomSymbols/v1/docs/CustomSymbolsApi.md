# fds.sdk.IRNCustomSymbols.CustomSymbolsApi

All URIs are relative to *https://api.factset.com/research/irn/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_custom_symbol**](CustomSymbolsApi.md#create_custom_symbol) | **POST** /custom-symbols | Create a custom symbol
[**delete_custom_symbol**](CustomSymbolsApi.md#delete_custom_symbol) | **DELETE** /custom-symbols/{customSymbolId} | Delete a custom symbol
[**get_custom_symbol**](CustomSymbolsApi.md#get_custom_symbol) | **GET** /custom-symbols/{customSymbolId} | Get all custom field and standard field details on a specific custom symbol
[**get_custom_symbol_records**](CustomSymbolsApi.md#get_custom_symbol_records) | **GET** /custom-symbols/{customSymbolId}/records | Get all notes and meetings where a specific customSymbol was tagged as primary or related identifier
[**get_custom_symbols**](CustomSymbolsApi.md#get_custom_symbols) | **GET** /custom-symbols | Get list of all custom symbols in your group along with some of their standard field and custom fields data
[**link_custom_symbol_to_standard_symbol**](CustomSymbolsApi.md#link_custom_symbol_to_standard_symbol) | **POST** /custom-symbols/{customSymbolId}/link-standard-symbol | Link custom symbol to standard symbol
[**patch_custom_symbol**](CustomSymbolsApi.md#patch_custom_symbol) | **PATCH** /custom-symbols/{customSymbolId} | Edit a custom symbol’s standard field and custom field data



# **create_custom_symbol**
> NewItemDto create_custom_symbol()

Create a custom symbol

Create a custom symbol

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.IRNCustomSymbols
from fds.sdk.IRNCustomSymbols.api import custom_symbols_api
from fds.sdk.IRNCustomSymbols.models import *
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
configuration = fds.sdk.IRNCustomSymbols.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.IRNCustomSymbols.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.IRNCustomSymbols.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = custom_symbols_api.CustomSymbolsApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    create_custom_symbol_dto = CreateCustomSymbolDto(
        code="code_example",
        name="name_example",
        description="description_example",
        type_id="type_id_example",
        sub_type_id="sub_type_id_example",
        google_maps_place_id="google_maps_place_id_example",
        formatted_address="formatted_address_example",
        city="city_example",
        state_province="state_province_example",
        postal_code="postal_code_example",
        country="country_example",
        custom_field_values=[
            CreateCustomSymbolCustomFieldValueDto(
                code="code_example",
                text_value="text_value_example",
                numeric_value=3.14,
                date_value="date_value_example",
                extended_text_value="extended_text_value_example",
                option_values=[
                    "option_values_example",
                ],
                contact_ids=[
                    "contact_ids_example",
                ],
            ),
        ],
    ) # CreateCustomSymbolDto | createCustomSymbolDto object to save (optional)

    try:
        # Create a custom symbol
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.create_custom_symbol(create_custom_symbol_dto=create_custom_symbol_dto)

        pprint(api_response)

    except fds.sdk.IRNCustomSymbols.ApiException as e:
        print("Exception when calling CustomSymbolsApi->create_custom_symbol: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **create_custom_symbol_dto** | [**CreateCustomSymbolDto**](CreateCustomSymbolDto.md)| createCustomSymbolDto object to save | [optional]

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

# **delete_custom_symbol**
> delete_custom_symbol(custom_symbol_id)

Delete a custom symbol

Delete a custom symbol

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.IRNCustomSymbols
from fds.sdk.IRNCustomSymbols.api import custom_symbols_api
from fds.sdk.IRNCustomSymbols.models import *
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
configuration = fds.sdk.IRNCustomSymbols.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.IRNCustomSymbols.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.IRNCustomSymbols.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = custom_symbols_api.CustomSymbolsApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    custom_symbol_id = "customSymbolId_example" # str | customSymbolId to delete associated custom symbol

    try:
        # Delete a custom symbol
        # example passing only required values which don't have defaults set
        api_instance.delete_custom_symbol(custom_symbol_id)


    except fds.sdk.IRNCustomSymbols.ApiException as e:
        print("Exception when calling CustomSymbolsApi->delete_custom_symbol: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **custom_symbol_id** | **str**| customSymbolId to delete associated custom symbol |

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

# **get_custom_symbol**
> CustomSymbolDto get_custom_symbol(custom_symbol_id)

Get all custom field and standard field details on a specific custom symbol

Get all custom field and standard field details on a specific custom symbol

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.IRNCustomSymbols
from fds.sdk.IRNCustomSymbols.api import custom_symbols_api
from fds.sdk.IRNCustomSymbols.models import *
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
configuration = fds.sdk.IRNCustomSymbols.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.IRNCustomSymbols.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.IRNCustomSymbols.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = custom_symbols_api.CustomSymbolsApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    custom_symbol_id = "customSymbolId_example" # str | customSymbolId to get associated custom symbol

    try:
        # Get all custom field and standard field details on a specific custom symbol
        # example passing only required values which don't have defaults set
        api_response = api_instance.get_custom_symbol(custom_symbol_id)

        pprint(api_response)

    except fds.sdk.IRNCustomSymbols.ApiException as e:
        print("Exception when calling CustomSymbolsApi->get_custom_symbol: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **custom_symbol_id** | **str**| customSymbolId to get associated custom symbol |

### Return type

[**CustomSymbolDto**](CustomSymbolDto.md)

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

# **get_custom_symbol_records**
> [RecordPreviewDto] get_custom_symbol_records(custom_symbol_id)

Get all notes and meetings where a specific customSymbol was tagged as primary or related identifier

Get all notes and meetings where a specific customSymbol was tagged as primary or related identifier

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.IRNCustomSymbols
from fds.sdk.IRNCustomSymbols.api import custom_symbols_api
from fds.sdk.IRNCustomSymbols.models import *
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
configuration = fds.sdk.IRNCustomSymbols.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.IRNCustomSymbols.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.IRNCustomSymbols.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = custom_symbols_api.CustomSymbolsApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    custom_symbol_id = "customSymbolId_example" # str | CustomSymbolId to get associated records

    try:
        # Get all notes and meetings where a specific customSymbol was tagged as primary or related identifier
        # example passing only required values which don't have defaults set
        api_response = api_instance.get_custom_symbol_records(custom_symbol_id)

        pprint(api_response)

    except fds.sdk.IRNCustomSymbols.ApiException as e:
        print("Exception when calling CustomSymbolsApi->get_custom_symbol_records: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **custom_symbol_id** | **str**| CustomSymbolId to get associated records |

### Return type

[**[RecordPreviewDto]**](RecordPreviewDto.md)

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

# **get_custom_symbols**
> [CustomSymbolDto] get_custom_symbols()

Get list of all custom symbols in your group along with some of their standard field and custom fields data

Get list of all custom symbols in your group along with some of their standard field and custom fields data

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.IRNCustomSymbols
from fds.sdk.IRNCustomSymbols.api import custom_symbols_api
from fds.sdk.IRNCustomSymbols.models import *
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
configuration = fds.sdk.IRNCustomSymbols.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.IRNCustomSymbols.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.IRNCustomSymbols.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = custom_symbols_api.CustomSymbolsApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    type_name = "typeName_example" # str | filter custom symbols based on custom symbol type (optional)
    query = "query_example" # str | filter custom symbols based on custom symbol code, name or linked factset entity's properties (optional)
    include_custom_field_values = False # bool | Whether or not to include customFieldValues (optional) if omitted the server will use the default value of False
    exclude_linked_custom_symbol = False # bool | Whether or not to exclude linked custom symbol (optional) if omitted the server will use the default value of False
    modified_since = "modifiedSince_example" # str | Only return Custom Symbols which have been modified or created since a particular time (optional)
    job_id = "jobId_example" # str | Filter custom symbols based on custom symbol sync job (optional)
    batch_job_id = "batchJobId_example" # str | Filter custom symbols based on rbl custom symbol job (optional)
    include_deleted = False # bool | Whether or not to include deleted custom symbols (optional) if omitted the server will use the default value of False

    try:
        # Get list of all custom symbols in your group along with some of their standard field and custom fields data
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_custom_symbols(type_name=type_name, query=query, include_custom_field_values=include_custom_field_values, exclude_linked_custom_symbol=exclude_linked_custom_symbol, modified_since=modified_since, job_id=job_id, batch_job_id=batch_job_id, include_deleted=include_deleted)

        pprint(api_response)

    except fds.sdk.IRNCustomSymbols.ApiException as e:
        print("Exception when calling CustomSymbolsApi->get_custom_symbols: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type_name** | **str**| filter custom symbols based on custom symbol type | [optional]
 **query** | **str**| filter custom symbols based on custom symbol code, name or linked factset entity&#39;s properties | [optional]
 **include_custom_field_values** | **bool**| Whether or not to include customFieldValues | [optional] if omitted the server will use the default value of False
 **exclude_linked_custom_symbol** | **bool**| Whether or not to exclude linked custom symbol | [optional] if omitted the server will use the default value of False
 **modified_since** | **str**| Only return Custom Symbols which have been modified or created since a particular time | [optional]
 **job_id** | **str**| Filter custom symbols based on custom symbol sync job | [optional]
 **batch_job_id** | **str**| Filter custom symbols based on rbl custom symbol job | [optional]
 **include_deleted** | **bool**| Whether or not to include deleted custom symbols | [optional] if omitted the server will use the default value of False

### Return type

[**[CustomSymbolDto]**](CustomSymbolDto.md)

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

# **link_custom_symbol_to_standard_symbol**
> link_custom_symbol_to_standard_symbol(custom_symbol_id)

Link custom symbol to standard symbol

Link custom symbol to standard symbol

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.IRNCustomSymbols
from fds.sdk.IRNCustomSymbols.api import custom_symbols_api
from fds.sdk.IRNCustomSymbols.models import *
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
configuration = fds.sdk.IRNCustomSymbols.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.IRNCustomSymbols.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.IRNCustomSymbols.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = custom_symbols_api.CustomSymbolsApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    custom_symbol_id = "customSymbolId_example" # str | customSymbolId associated with custom symbol
    standard_symbol_dto = StandardSymbolDto(
        standard_symbol="standard_symbol_example",
    ) # StandardSymbolDto | standard symbol name (optional)

    try:
        # Link custom symbol to standard symbol
        # example passing only required values which don't have defaults set
        # and optional values
        api_instance.link_custom_symbol_to_standard_symbol(custom_symbol_id, standard_symbol_dto=standard_symbol_dto)


    except fds.sdk.IRNCustomSymbols.ApiException as e:
        print("Exception when calling CustomSymbolsApi->link_custom_symbol_to_standard_symbol: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **custom_symbol_id** | **str**| customSymbolId associated with custom symbol |
 **standard_symbol_dto** | [**StandardSymbolDto**](StandardSymbolDto.md)| standard symbol name | [optional]

### Return type

void (empty response body)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: Not defined


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **patch_custom_symbol**
> patch_custom_symbol(custom_symbol_id)

Edit a custom symbol’s standard field and custom field data

Edit a custom symbol’s standard field and custom field data

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.IRNCustomSymbols
from fds.sdk.IRNCustomSymbols.api import custom_symbols_api
from fds.sdk.IRNCustomSymbols.models import *
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
configuration = fds.sdk.IRNCustomSymbols.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.IRNCustomSymbols.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.IRNCustomSymbols.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = custom_symbols_api.CustomSymbolsApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    custom_symbol_id = "customSymbolId_example" # str | customSymbolId to update associated custom symbol
    operation = [
        Operation(
            operation_type=OperationType(0),
            path="path_example",
            op="op_example",
            _from="_from_example",
            value=None,
        ),
    ] # [Operation] | updateCustomSymbolDto object to update (optional)

    try:
        # Edit a custom symbol’s standard field and custom field data
        # example passing only required values which don't have defaults set
        # and optional values
        api_instance.patch_custom_symbol(custom_symbol_id, operation=operation)


    except fds.sdk.IRNCustomSymbols.ApiException as e:
        print("Exception when calling CustomSymbolsApi->patch_custom_symbol: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **custom_symbol_id** | **str**| customSymbolId to update associated custom symbol |
 **operation** | [**[Operation]**](Operation.md)| updateCustomSymbolDto object to update | [optional]

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

