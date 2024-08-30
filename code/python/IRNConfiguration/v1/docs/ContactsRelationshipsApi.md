# fds.sdk.IRNConfiguration.ContactsRelationshipsApi

All URIs are relative to *https://api.factset.com/research/irn/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_contact_relationship_type**](ContactsRelationshipsApi.md#create_contact_relationship_type) | **POST** /relationships | Create a relationship type
[**delete_relationship**](ContactsRelationshipsApi.md#delete_relationship) | **DELETE** /relationships/{relationshipId} | Delete a relationship type
[**edit_relationship**](ContactsRelationshipsApi.md#edit_relationship) | **PUT** /relationships/{relationshipId} | Edit a relationship type
[**get_relationships**](ContactsRelationshipsApi.md#get_relationships) | **GET** /relationships | Get list of the relationships configured in your group



# **create_contact_relationship_type**
> NewItemDto create_contact_relationship_type()

Create a relationship type

Create a contact relationship type with given name

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.IRNConfiguration
from fds.sdk.IRNConfiguration.api import contacts___relationships_api
from fds.sdk.IRNConfiguration.models import *
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
    api_instance = contacts___relationships_api.ContactsRelationshipsApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    relationship_save_dto = RelationshipSaveDto(
        relationship_category_id="relationship_category_id_example",
        relationship_code="relationship_code_example",
        bidirectional_name="bidirectional_name_example",
        left_to_right_name="left_to_right_name_example",
        right_to_left_name="right_to_left_name_example",
        hide_dates=False,
        hide_comment=False,
        hide_company=False,
    ) # RelationshipSaveDto | RelationshipSaveDto object to save (optional)

    try:
        # Create a relationship type
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.create_contact_relationship_type(relationship_save_dto=relationship_save_dto)

        pprint(api_response)

    except fds.sdk.IRNConfiguration.ApiException as e:
        print("Exception when calling ContactsRelationshipsApi->create_contact_relationship_type: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **relationship_save_dto** | [**RelationshipSaveDto**](RelationshipSaveDto.md)| RelationshipSaveDto object to save | [optional]

### Return type

[**NewItemDto**](NewItemDto.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Created |  -  |
**400** | Bad Request |  -  |
**0** | Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_relationship**
> delete_relationship(relationship_id)

Delete a relationship type

Delete a contact relationship type based on guid

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.IRNConfiguration
from fds.sdk.IRNConfiguration.api import contacts___relationships_api
from fds.sdk.IRNConfiguration.models import *
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
    api_instance = contacts___relationships_api.ContactsRelationshipsApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    relationship_id = "relationshipId_example" # str | relationshipId to delete associated record

    try:
        # Delete a relationship type
        # example passing only required values which don't have defaults set
        api_instance.delete_relationship(relationship_id)


    except fds.sdk.IRNConfiguration.ApiException as e:
        print("Exception when calling ContactsRelationshipsApi->delete_relationship: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **relationship_id** | **str**| relationshipId to delete associated record |

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

# **edit_relationship**
> edit_relationship(relationship_id)

Edit a relationship type

Update a contact relationship type

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.IRNConfiguration
from fds.sdk.IRNConfiguration.api import contacts___relationships_api
from fds.sdk.IRNConfiguration.models import *
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
    api_instance = contacts___relationships_api.ContactsRelationshipsApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    relationship_id = "relationshipId_example" # str | relationshipId to update associated record
    relationship_save_dto = RelationshipSaveDto(
        relationship_category_id="relationship_category_id_example",
        relationship_code="relationship_code_example",
        bidirectional_name="bidirectional_name_example",
        left_to_right_name="left_to_right_name_example",
        right_to_left_name="right_to_left_name_example",
        hide_dates=False,
        hide_comment=False,
        hide_company=False,
    ) # RelationshipSaveDto | RelationshipSaveDto object to update (optional)

    try:
        # Edit a relationship type
        # example passing only required values which don't have defaults set
        # and optional values
        api_instance.edit_relationship(relationship_id, relationship_save_dto=relationship_save_dto)


    except fds.sdk.IRNConfiguration.ApiException as e:
        print("Exception when calling ContactsRelationshipsApi->edit_relationship: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **relationship_id** | **str**| relationshipId to update associated record |
 **relationship_save_dto** | [**RelationshipSaveDto**](RelationshipSaveDto.md)| RelationshipSaveDto object to update | [optional]

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

# **get_relationships**
> [RelationshipDto] get_relationships()

Get list of the relationships configured in your group

Get all contact relationships configured in your group

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.IRNConfiguration
from fds.sdk.IRNConfiguration.api import contacts___relationships_api
from fds.sdk.IRNConfiguration.models import *
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
    api_instance = contacts___relationships_api.ContactsRelationshipsApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    type = RelationshipType(0) # RelationshipType |  (optional)

    try:
        # Get list of the relationships configured in your group
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_relationships(type=type)

        pprint(api_response)

    except fds.sdk.IRNConfiguration.ApiException as e:
        print("Exception when calling ContactsRelationshipsApi->get_relationships: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **RelationshipType**|  | [optional]

### Return type

[**[RelationshipDto]**](RelationshipDto.md)

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

