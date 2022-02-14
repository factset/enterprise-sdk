# fds.sdk.IRNContacts.RelationshipCategoriesApi

All URIs are relative to *https://api-sandbox.factset.com/research/irn*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1_relationship_categories_get**](RelationshipCategoriesApi.md#v1_relationship_categories_get) | **GET** /v1/relationship-categories | Get list of the relationship categories configured in your group
[**v1_relationship_categories_post**](RelationshipCategoriesApi.md#v1_relationship_categories_post) | **POST** /v1/relationship-categories | Create a relationship category
[**v1_relationship_categories_relationship_category_id_delete**](RelationshipCategoriesApi.md#v1_relationship_categories_relationship_category_id_delete) | **DELETE** /v1/relationship-categories/{relationshipCategoryId} | Delete a relationship category
[**v1_relationship_categories_relationship_category_id_put**](RelationshipCategoriesApi.md#v1_relationship_categories_relationship_category_id_put) | **PUT** /v1/relationship-categories/{relationshipCategoryId} | Edit a relationship category
[**v1_relationship_categories_reorder_post**](RelationshipCategoriesApi.md#v1_relationship_categories_reorder_post) | **POST** /v1/relationship-categories/reorder | Reorder relationship categories


# **v1_relationship_categories_get**
> [RelationshipCategoryDto] v1_relationship_categories_get()

Get list of the relationship categories configured in your group

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.IRNContacts
from fds.sdk.IRNContacts.api import relationship_categories_api
from fds.sdk.IRNContacts.model.relationship_category_dto import RelationshipCategoryDto
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
    api_instance = relationship_categories_api.RelationshipCategoriesApi(api_client)

    # example, this endpoint has no required or optional parameters
    try:
        # Get list of the relationship categories configured in your group
        api_response = api_instance.v1_relationship_categories_get()
        pprint(api_response)
    except fds.sdk.IRNContacts.ApiException as e:
        print("Exception when calling RelationshipCategoriesApi->v1_relationship_categories_get: %s\n" % e)
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

# **v1_relationship_categories_post**
> str v1_relationship_categories_post()

Create a relationship category

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.IRNContacts
from fds.sdk.IRNContacts.api import relationship_categories_api
from fds.sdk.IRNContacts.model.problem_details import ProblemDetails
from fds.sdk.IRNContacts.model.relationship_category_save_dto import RelationshipCategorySaveDto
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
    api_instance = relationship_categories_api.RelationshipCategoriesApi(api_client)
    relationship_category_save_dto = RelationshipCategorySaveDto(
        category_name="category_name_example",
        is_contact_to_contact=False,
        is_contact_to_symbol=False,
    ) # RelationshipCategorySaveDto | RelationshipCategorySaveDto object to save (optional)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Create a relationship category
        api_response = api_instance.v1_relationship_categories_post(relationship_category_save_dto=relationship_category_save_dto)
        pprint(api_response)
    except fds.sdk.IRNContacts.ApiException as e:
        print("Exception when calling RelationshipCategoriesApi->v1_relationship_categories_post: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **relationship_category_save_dto** | [**RelationshipCategorySaveDto**](RelationshipCategorySaveDto.md)| RelationshipCategorySaveDto object to save | [optional]

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

# **v1_relationship_categories_relationship_category_id_delete**
> v1_relationship_categories_relationship_category_id_delete(relationship_category_id)

Delete a relationship category

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.IRNContacts
from fds.sdk.IRNContacts.api import relationship_categories_api
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
    api_instance = relationship_categories_api.RelationshipCategoriesApi(api_client)
    relationship_category_id = "relationshipCategoryId_example" # str | relationshipCategoryId to delete associated record

    # example passing only required values which don't have defaults set
    try:
        # Delete a relationship category
        api_instance.v1_relationship_categories_relationship_category_id_delete(relationship_category_id)
    except fds.sdk.IRNContacts.ApiException as e:
        print("Exception when calling RelationshipCategoriesApi->v1_relationship_categories_relationship_category_id_delete: %s\n" % e)
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

# **v1_relationship_categories_relationship_category_id_put**
> v1_relationship_categories_relationship_category_id_put(relationship_category_id)

Edit a relationship category

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.IRNContacts
from fds.sdk.IRNContacts.api import relationship_categories_api
from fds.sdk.IRNContacts.model.problem_details import ProblemDetails
from fds.sdk.IRNContacts.model.relationship_category_save_dto import RelationshipCategorySaveDto
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
    api_instance = relationship_categories_api.RelationshipCategoriesApi(api_client)
    relationship_category_id = "relationshipCategoryId_example" # str | relationshipCategoryId to update associated record
    relationship_category_save_dto = RelationshipCategorySaveDto(
        category_name="category_name_example",
        is_contact_to_contact=False,
        is_contact_to_symbol=False,
    ) # RelationshipCategorySaveDto | RelationshipCategorySaveDto object to update (optional)

    # example passing only required values which don't have defaults set
    try:
        # Edit a relationship category
        api_instance.v1_relationship_categories_relationship_category_id_put(relationship_category_id)
    except fds.sdk.IRNContacts.ApiException as e:
        print("Exception when calling RelationshipCategoriesApi->v1_relationship_categories_relationship_category_id_put: %s\n" % e)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Edit a relationship category
        api_instance.v1_relationship_categories_relationship_category_id_put(relationship_category_id, relationship_category_save_dto=relationship_category_save_dto)
    except fds.sdk.IRNContacts.ApiException as e:
        print("Exception when calling RelationshipCategoriesApi->v1_relationship_categories_relationship_category_id_put: %s\n" % e)
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
**204** | Success |  -  |
**400** | Bad Request |  -  |
**404** | Not Found |  -  |
**0** | Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1_relationship_categories_reorder_post**
> v1_relationship_categories_reorder_post()

Reorder relationship categories

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.IRNContacts
from fds.sdk.IRNContacts.api import relationship_categories_api
from fds.sdk.IRNContacts.model.problem_details import ProblemDetails
from fds.sdk.IRNContacts.model.relationship_category_list_dto import RelationshipCategoryListDto
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
    api_instance = relationship_categories_api.RelationshipCategoriesApi(api_client)
    relationship_category_list_dto = RelationshipCategoryListDto(
        ids=[
            "ids_example",
        ],
    ) # RelationshipCategoryListDto | List of Guid (optional)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Reorder relationship categories
        api_instance.v1_relationship_categories_reorder_post(relationship_category_list_dto=relationship_category_list_dto)
    except fds.sdk.IRNContacts.ApiException as e:
        print("Exception when calling RelationshipCategoriesApi->v1_relationship_categories_reorder_post: %s\n" % e)
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
**204** | Success |  -  |
**400** | Bad Request |  -  |
**404** | Not Found |  -  |
**0** | Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

