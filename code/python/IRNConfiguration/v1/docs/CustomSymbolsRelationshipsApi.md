# fds.sdk.IRNConfiguration.CustomSymbolsRelationshipsApi

All URIs are relative to *https://api.factset.com/research/irn*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_symbol_relationship_type**](CustomSymbolsRelationshipsApi.md#create_symbol_relationship_type) | **POST** /v1/symbols-relationships | Create a symbol relationship
[**delete_symbols_relationship**](CustomSymbolsRelationshipsApi.md#delete_symbols_relationship) | **DELETE** /v1/symbols-relationships/{symbolsRelationshipId} | Delete a symbol relationship
[**edit_symbols_relationship**](CustomSymbolsRelationshipsApi.md#edit_symbols_relationship) | **PUT** /v1/symbols-relationships/{symbolsRelationshipId} | Edit a symbol relationship
[**get_symbols_relationships**](CustomSymbolsRelationshipsApi.md#get_symbols_relationships) | **GET** /v1/symbols-relationships | Get all the Symbols Relationships



# **create_symbol_relationship_type**
> NewItemDto create_symbol_relationship_type()

Create a symbol relationship

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.IRNConfiguration
from fds.sdk.IRNConfiguration.api import custom_symbols___relationships_api
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
    api_instance = custom_symbols___relationships_api.CustomSymbolsRelationshipsApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    symbols_relation_ship_save_dto = SymbolsRelationShipSaveDto(
        relationship_code="relationship_code_example",
        parent_to_child_name="parent_to_child_name_example",
        child_to_parent_name="child_to_parent_name_example",
        peer_name="peer_name_example",
        hide_dates=True,
        hide_comment=True,
    ) # SymbolsRelationShipSaveDto | symbolsRelationshipSaveDto object to save (optional)

    try:
        # Create a symbol relationship
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.create_symbol_relationship_type(symbols_relation_ship_save_dto=symbols_relation_ship_save_dto)
        pprint(api_response)

    except fds.sdk.IRNConfiguration.ApiException as e:
        print("Exception when calling CustomSymbolsRelationshipsApi->create_symbol_relationship_type: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbols_relation_ship_save_dto** | [**SymbolsRelationShipSaveDto**](SymbolsRelationShipSaveDto.md)| symbolsRelationshipSaveDto object to save | [optional]

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

# **delete_symbols_relationship**
> delete_symbols_relationship(symbols_relationship_id)

Delete a symbol relationship

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.IRNConfiguration
from fds.sdk.IRNConfiguration.api import custom_symbols___relationships_api
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
    api_instance = custom_symbols___relationships_api.CustomSymbolsRelationshipsApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    symbols_relationship_id = "symbolsRelationshipId_example" # str | symbolsRelationshipId to delete associated record

    try:
        # Delete a symbol relationship
        # example passing only required values which don't have defaults set
        api_instance.delete_symbols_relationship(symbols_relationship_id)

    except fds.sdk.IRNConfiguration.ApiException as e:
        print("Exception when calling CustomSymbolsRelationshipsApi->delete_symbols_relationship: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbols_relationship_id** | **str**| symbolsRelationshipId to delete associated record |

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

# **edit_symbols_relationship**
> edit_symbols_relationship(symbols_relationship_id)

Edit a symbol relationship

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.IRNConfiguration
from fds.sdk.IRNConfiguration.api import custom_symbols___relationships_api
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
    api_instance = custom_symbols___relationships_api.CustomSymbolsRelationshipsApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    symbols_relationship_id = "symbolsRelationshipId_example" # str | symbolsRelationshipId to update associated record
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    symbols_relation_ship_save_dto = SymbolsRelationShipSaveDto(
        relationship_code="relationship_code_example",
        parent_to_child_name="parent_to_child_name_example",
        child_to_parent_name="child_to_parent_name_example",
        peer_name="peer_name_example",
        hide_dates=True,
        hide_comment=True,
    ) # SymbolsRelationShipSaveDto | SymbolsRelationShipSaveDto object to update (optional)

    try:
        # Edit a symbol relationship
        # example passing only required values which don't have defaults set
        # and optional values
        api_instance.edit_symbols_relationship(symbols_relationship_id, symbols_relation_ship_save_dto=symbols_relation_ship_save_dto)

    except fds.sdk.IRNConfiguration.ApiException as e:
        print("Exception when calling CustomSymbolsRelationshipsApi->edit_symbols_relationship: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbols_relationship_id** | **str**| symbolsRelationshipId to update associated record |
 **symbols_relation_ship_save_dto** | [**SymbolsRelationShipSaveDto**](SymbolsRelationShipSaveDto.md)| SymbolsRelationShipSaveDto object to update | [optional]

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

# **get_symbols_relationships**
> [SymbolsRelationshipDto] get_symbols_relationships()

Get all the Symbols Relationships

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.IRNConfiguration
from fds.sdk.IRNConfiguration.api import custom_symbols___relationships_api
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
    api_instance = custom_symbols___relationships_api.CustomSymbolsRelationshipsApi(api_client)


    try:
        # Get all the Symbols Relationships
        # example, this endpoint has no required or optional parameters
        api_response = api_instance.get_symbols_relationships()
        pprint(api_response)

    except fds.sdk.IRNConfiguration.ApiException as e:
        print("Exception when calling CustomSymbolsRelationshipsApi->get_symbols_relationships: %s\n" % e)
```


### Parameters
This endpoint does not need any parameter.

### Return type

[**[SymbolsRelationshipDto]**](SymbolsRelationshipDto.md)

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

