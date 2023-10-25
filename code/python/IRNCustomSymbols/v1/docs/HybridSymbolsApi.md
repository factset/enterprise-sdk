# fds.sdk.IRNCustomSymbols.HybridSymbolsApi

All URIs are relative to *https://api.factset.com/research/irn*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_standard_symbol_metadata**](HybridSymbolsApi.md#create_standard_symbol_metadata) | **POST** /v1/custom-symbols/standard-symbol-metadata | Create standard symbol metadata
[**get_standard_symbol_metadata_guid**](HybridSymbolsApi.md#get_standard_symbol_metadata_guid) | **GET** /v1/custom-symbols/standard-symbol-metadata/{standardSymbol} | Get all custom field and standard field details on a specific standard symbol
[**patch_standard_symbol**](HybridSymbolsApi.md#patch_standard_symbol) | **PATCH** /v1/custom-symbols/standard-symbol-metadata/{standardSymbolId} | Edit a standard symbol’s standard field and custom field data



# **create_standard_symbol_metadata**
> NewItemDto create_standard_symbol_metadata()

Create standard symbol metadata

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.IRNCustomSymbols
from fds.sdk.IRNCustomSymbols.api import hybrid_symbols_api
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
    api_instance = hybrid_symbols_api.HybridSymbolsApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    create_standard_symbol_metadata_dto = CreateStandardSymbolMetadataDto(
        standard_symbol="standard_symbol_example",
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
    ) # CreateStandardSymbolMetadataDto | createStandardSymbolMetadataDto object to save (optional)

    try:
        # Create standard symbol metadata
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.create_standard_symbol_metadata(create_standard_symbol_metadata_dto=create_standard_symbol_metadata_dto)

        pprint(api_response)

    except fds.sdk.IRNCustomSymbols.ApiException as e:
        print("Exception when calling HybridSymbolsApi->create_standard_symbol_metadata: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **create_standard_symbol_metadata_dto** | [**CreateStandardSymbolMetadataDto**](CreateStandardSymbolMetadataDto.md)| createStandardSymbolMetadataDto object to save | [optional]

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

# **get_standard_symbol_metadata_guid**
> str get_standard_symbol_metadata_guid(standard_symbol)

Get all custom field and standard field details on a specific standard symbol

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.IRNCustomSymbols
from fds.sdk.IRNCustomSymbols.api import hybrid_symbols_api
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
    api_instance = hybrid_symbols_api.HybridSymbolsApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    standard_symbol = "standardSymbol_example" # str | Standard symbol to get associated customSymbolId

    try:
        # Get all custom field and standard field details on a specific standard symbol
        # example passing only required values which don't have defaults set
        api_response = api_instance.get_standard_symbol_metadata_guid(standard_symbol)

        pprint(api_response)

    except fds.sdk.IRNCustomSymbols.ApiException as e:
        print("Exception when calling HybridSymbolsApi->get_standard_symbol_metadata_guid: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **standard_symbol** | **str**| Standard symbol to get associated customSymbolId |

### Return type

**str**

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

# **patch_standard_symbol**
> patch_standard_symbol(standard_symbol_id)

Edit a standard symbol’s standard field and custom field data

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.IRNCustomSymbols
from fds.sdk.IRNCustomSymbols.api import hybrid_symbols_api
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
    api_instance = hybrid_symbols_api.HybridSymbolsApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    standard_symbol_id = "standardSymbolId_example" # str | standardSymbolId to update associated standard symbol
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
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
        # Edit a standard symbol’s standard field and custom field data
        # example passing only required values which don't have defaults set
        # and optional values
        api_instance.patch_standard_symbol(standard_symbol_id, operation=operation)


    except fds.sdk.IRNCustomSymbols.ApiException as e:
        print("Exception when calling HybridSymbolsApi->patch_standard_symbol: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **standard_symbol_id** | **str**| standardSymbolId to update associated standard symbol |
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

