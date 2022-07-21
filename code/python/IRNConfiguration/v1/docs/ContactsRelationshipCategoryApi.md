# fds.sdk.IRNConfiguration.ContactsRelationshipCategoryApi

All URIs are relative to *https://api.factset.com/research/irn*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_relationship_category**](ContactsRelationshipCategoryApi.md#create_relationship_category) | **POST** /v1/relationship-categories | Create a relationship category
[**delete_relationship_category**](ContactsRelationshipCategoryApi.md#delete_relationship_category) | **DELETE** /v1/relationship-categories/{relationshipCategoryId} | Delete a relationship category
[**edit_relationship_category**](ContactsRelationshipCategoryApi.md#edit_relationship_category) | **PUT** /v1/relationship-categories/{relationshipCategoryId} | Edit a relationship category
[**get_relationship_categories**](ContactsRelationshipCategoryApi.md#get_relationship_categories) | **GET** /v1/relationship-categories | Get list of the relationship categories configured in your group
[**update_relationship_category_order**](ContactsRelationshipCategoryApi.md#update_relationship_category_order) | **POST** /v1/relationship-categories/reorder | Reorder relationship categories


# **create_relationship_category**
> NewItemDto create_relationship_category()

Create a relationship category

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.IRNConfiguration
from fds.sdk.IRNConfiguration.api import contacts___relationship_category_api
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
    api_instance = contacts___relationship_category_api.ContactsRelationshipCategoryApi(api_client)

    relationship_category_save_dto = RelationshipCategorySaveDto(
        category_name="category_name_example",
        is_contact_to_contact=False,
        is_contact_to_symbol=False,
    ) # RelationshipCategorySaveDto | RelationshipCategorySaveDto object to save (optional)

    try:
        # Create a relationship category
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.create_relationship_category(relationship_category_save_dto=relationship_category_save_dto)
        pprint(api_response)

    except fds.sdk.IRNConfiguration.ApiException as e:
        print("Exception when calling ContactsRelationshipCategoryApi->create_relationship_category: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **relationship_category_save_dto** | [**RelationshipCategorySaveDto**](RelationshipCategorySaveDto.md)| RelationshipCategorySaveDto object to save | [optional]

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

# **delete_relationship_category**
> delete_relationship_category(relationship_category_id)

Delete a relationship category

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.IRNConfiguration
from fds.sdk.IRNConfiguration.api import contacts___relationship_category_api
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
    api_instance = contacts___relationship_category_api.ContactsRelationshipCategoryApi(api_client)

    relationship_category_id = "relationshipCategoryId_example" # str | relationshipCategoryId to delete associated record

    try:
        # Delete a relationship category
        # example passing only required values which don't have defaults set
        api_instance.delete_relationship_category(relationship_category_id)

    except fds.sdk.IRNConfiguration.ApiException as e:
        print("Exception when calling ContactsRelationshipCategoryApi->delete_relationship_category: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **relationship_category_id** | **str**| relationshipCategoryId to delete associated record |

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

# **edit_relationship_category**
> edit_relationship_category(relationship_category_id)

Edit a relationship category

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.IRNConfiguration
from fds.sdk.IRNConfiguration.api import contacts___relationship_category_api
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
    api_instance = contacts___relationship_category_api.ContactsRelationshipCategoryApi(api_client)

    relationship_category_id = "relationshipCategoryId_example" # str | relationshipCategoryId to update associated record
    relationship_category_save_dto = RelationshipCategorySaveDto(
        category_name="category_name_example",
        is_contact_to_contact=False,
        is_contact_to_symbol=False,
    ) # RelationshipCategorySaveDto | RelationshipCategorySaveDto object to update (optional)

    try:
        # Edit a relationship category
        # example passing only required values which don't have defaults set
        # and optional values
        api_instance.edit_relationship_category(relationship_category_id, relationship_category_save_dto=relationship_category_save_dto)

    except fds.sdk.IRNConfiguration.ApiException as e:
        print("Exception when calling ContactsRelationshipCategoryApi->edit_relationship_category: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **relationship_category_id** | **str**| relationshipCategoryId to update associated record |
 **relationship_category_save_dto** | [**RelationshipCategorySaveDto**](RelationshipCategorySaveDto.md)| RelationshipCategorySaveDto object to update | [optional]

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

# **get_relationship_categories**
> [RelationshipCategoryDto] get_relationship_categories()

Get list of the relationship categories configured in your group

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.IRNConfiguration
from fds.sdk.IRNConfiguration.api import contacts___relationship_category_api
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
    api_instance = contacts___relationship_category_api.ContactsRelationshipCategoryApi(api_client)


    try:
        # Get list of the relationship categories configured in your group
        # example, this endpoint has no required or optional parameters
        api_response = api_instance.get_relationship_categories()
        pprint(api_response)

    except fds.sdk.IRNConfiguration.ApiException as e:
        print("Exception when calling ContactsRelationshipCategoryApi->get_relationship_categories: %s\n" % e)
```


### Parameters
This endpoint does not need any parameter.

### Return type

[**[RelationshipCategoryDto]**](RelationshipCategoryDto.md)

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

# **update_relationship_category_order**
> update_relationship_category_order()

Reorder relationship categories

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.IRNConfiguration
from fds.sdk.IRNConfiguration.api import contacts___relationship_category_api
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
    api_instance = contacts___relationship_category_api.ContactsRelationshipCategoryApi(api_client)

    relationship_category_list_dto = RelationshipCategoryListDto(
        ids=[
            "ids_example",
        ],
    ) # RelationshipCategoryListDto | List of Guid (optional)

    try:
        # Reorder relationship categories
        # example passing only required values which don't have defaults set
        # and optional values
        api_instance.update_relationship_category_order(relationship_category_list_dto=relationship_category_list_dto)

    except fds.sdk.IRNConfiguration.ApiException as e:
        print("Exception when calling ContactsRelationshipCategoryApi->update_relationship_category_order: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **relationship_category_list_dto** | [**RelationshipCategoryListDto**](RelationshipCategoryListDto.md)| List of Guid | [optional]

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

