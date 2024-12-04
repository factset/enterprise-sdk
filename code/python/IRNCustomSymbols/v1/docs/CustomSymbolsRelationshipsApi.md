# fds.sdk.IRNCustomSymbols.CustomSymbolsRelationshipsApi

All URIs are relative to *https://api.factset.com/research/irn/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_symbol_relationship**](CustomSymbolsRelationshipsApi.md#create_symbol_relationship) | **POST** /symbol-relationships | Create a symbol relationship
[**delete_symbol_relationship**](CustomSymbolsRelationshipsApi.md#delete_symbol_relationship) | **DELETE** /symbol-relationships/{symbolRelationshipId} | Delete a symbol relationship
[**edit_and_add_symbol_relationship**](CustomSymbolsRelationshipsApi.md#edit_and_add_symbol_relationship) | **PUT** /symbol-relationships/{symbol} | Edit a symbol relationship
[**get_symbol_relationship**](CustomSymbolsRelationshipsApi.md#get_symbol_relationship) | **GET** /symbol-relationships/{symbolRelationshipId} | Get details on a specific symbol relationship
[**get_symbol_relationships**](CustomSymbolsRelationshipsApi.md#get_symbol_relationships) | **GET** /symbol-relationships/{symbolId}/relationships | Returns a list of a symbol’s relationships
[**get_symbols_relationships**](CustomSymbolsRelationshipsApi.md#get_symbols_relationships) | **GET** /symbol-relationships | Get list of all symbol relationships in your group



# **create_symbol_relationship**
> create_symbol_relationship()

Create a symbol relationship

Create a symbol relationship

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.IRNCustomSymbols
from fds.sdk.IRNCustomSymbols.api import custom_symbols___relationships_api
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
    api_instance = custom_symbols___relationships_api.CustomSymbolsRelationshipsApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    symbol_relationship_save_dto = [
        SymbolRelationshipSaveDto(
            symbols_relationship_id="symbols_relationship_id_example",
            parent_symbol="parent_symbol_example",
            child_symbol="child_symbol_example",
            start_date=dateutil_parser('1970-01-01T00:00:00.00Z'),
            end_date=dateutil_parser('1970-01-01T00:00:00.00Z'),
            comment="comment_example",
        ),
    ] # [SymbolRelationshipSaveDto] | symbolRelationship object to save (optional)

    try:
        # Create a symbol relationship
        # example passing only required values which don't have defaults set
        # and optional values
        api_instance.create_symbol_relationship(symbol_relationship_save_dto=symbol_relationship_save_dto)


    except fds.sdk.IRNCustomSymbols.ApiException as e:
        print("Exception when calling CustomSymbolsRelationshipsApi->create_symbol_relationship: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol_relationship_save_dto** | [**[SymbolRelationshipSaveDto]**](SymbolRelationshipSaveDto.md)| symbolRelationship object to save | [optional]

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
**201** | Created |  -  |
**400** | Bad Request |  -  |
**0** | Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_symbol_relationship**
> delete_symbol_relationship(symbol_relationship_id)

Delete a symbol relationship

Delete a symbol relationship

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.IRNCustomSymbols
from fds.sdk.IRNCustomSymbols.api import custom_symbols___relationships_api
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
    api_instance = custom_symbols___relationships_api.CustomSymbolsRelationshipsApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    symbol_relationship_id = "symbolRelationshipId_example" # str | symbolRelationshipId to delete associated record

    try:
        # Delete a symbol relationship
        # example passing only required values which don't have defaults set
        api_instance.delete_symbol_relationship(symbol_relationship_id)


    except fds.sdk.IRNCustomSymbols.ApiException as e:
        print("Exception when calling CustomSymbolsRelationshipsApi->delete_symbol_relationship: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol_relationship_id** | **str**| symbolRelationshipId to delete associated record |

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

# **edit_and_add_symbol_relationship**
> edit_and_add_symbol_relationship(symbol)

Edit a symbol relationship

Edit a symbol relationship

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.IRNCustomSymbols
from fds.sdk.IRNCustomSymbols.api import custom_symbols___relationships_api
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
    api_instance = custom_symbols___relationships_api.CustomSymbolsRelationshipsApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    symbol = "symbol_example" # str | 
    symbol_relationship_update_dto = [
        SymbolRelationshipUpdateDto(
            id="id_example",
            symbols_relationship_id="symbols_relationship_id_example",
            parent_symbol="parent_symbol_example",
            child_symbol="child_symbol_example",
            start_date=dateutil_parser('1970-01-01T00:00:00.00Z'),
            end_date=dateutil_parser('1970-01-01T00:00:00.00Z'),
            comment="comment_example",
        ),
    ] # [SymbolRelationshipUpdateDto] | symbolRelationship object to save (optional)

    try:
        # Edit a symbol relationship
        # example passing only required values which don't have defaults set
        # and optional values
        api_instance.edit_and_add_symbol_relationship(symbol, symbol_relationship_update_dto=symbol_relationship_update_dto)


    except fds.sdk.IRNCustomSymbols.ApiException as e:
        print("Exception when calling CustomSymbolsRelationshipsApi->edit_and_add_symbol_relationship: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **str**|  |
 **symbol_relationship_update_dto** | [**[SymbolRelationshipUpdateDto]**](SymbolRelationshipUpdateDto.md)| symbolRelationship object to save | [optional]

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

# **get_symbol_relationship**
> SymbolRelationshipDto get_symbol_relationship(symbol_relationship_id)

Get details on a specific symbol relationship

Get details on a specific symbol relationship

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.IRNCustomSymbols
from fds.sdk.IRNCustomSymbols.api import custom_symbols___relationships_api
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
    api_instance = custom_symbols___relationships_api.CustomSymbolsRelationshipsApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    symbol_relationship_id = "symbolRelationshipId_example" # str | symbolRelationshipId to get associated record

    try:
        # Get details on a specific symbol relationship
        # example passing only required values which don't have defaults set
        api_response = api_instance.get_symbol_relationship(symbol_relationship_id)

        pprint(api_response)

    except fds.sdk.IRNCustomSymbols.ApiException as e:
        print("Exception when calling CustomSymbolsRelationshipsApi->get_symbol_relationship: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol_relationship_id** | **str**| symbolRelationshipId to get associated record |

### Return type

[**SymbolRelationshipDto**](SymbolRelationshipDto.md)

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

# **get_symbol_relationships**
> [SymbolRelationshipDto] get_symbol_relationships(symbol_id)

Returns a list of a symbol’s relationships

Returns a list of a symbol’s relationships

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.IRNCustomSymbols
from fds.sdk.IRNCustomSymbols.api import custom_symbols___relationships_api
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
    api_instance = custom_symbols___relationships_api.CustomSymbolsRelationshipsApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    symbol_id = "symbolId_example" # str | symbolId to get associated records

    try:
        # Returns a list of a symbol’s relationships
        # example passing only required values which don't have defaults set
        api_response = api_instance.get_symbol_relationships(symbol_id)

        pprint(api_response)

    except fds.sdk.IRNCustomSymbols.ApiException as e:
        print("Exception when calling CustomSymbolsRelationshipsApi->get_symbol_relationships: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol_id** | **str**| symbolId to get associated records |

### Return type

[**[SymbolRelationshipDto]**](SymbolRelationshipDto.md)

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

# **get_symbols_relationships**
> [SymbolRelationshipDto] get_symbols_relationships()

Get list of all symbol relationships in your group

Get list of all symbol relationships in your group

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.IRNCustomSymbols
from fds.sdk.IRNCustomSymbols.api import custom_symbols___relationships_api
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
    api_instance = custom_symbols___relationships_api.CustomSymbolsRelationshipsApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    relationship_type = SymbolsRelationshipType("PARENTCHILD") # SymbolsRelationshipType | Filter results on relationship type (optional)
    relationship_code = "relationshipCode_example" # str | Filter results on relationship code (optional)

    try:
        # Get list of all symbol relationships in your group
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_symbols_relationships(relationship_type=relationship_type, relationship_code=relationship_code)

        pprint(api_response)

    except fds.sdk.IRNCustomSymbols.ApiException as e:
        print("Exception when calling CustomSymbolsRelationshipsApi->get_symbols_relationships: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **relationship_type** | **SymbolsRelationshipType**| Filter results on relationship type | [optional]
 **relationship_code** | **str**| Filter results on relationship code | [optional]

### Return type

[**[SymbolRelationshipDto]**](SymbolRelationshipDto.md)

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

