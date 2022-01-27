# fds.sdk.IRNContacts.RelationshipsApi

All URIs are relative to *https://api-sandbox.factset.com/research/irn*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1_relationships_get**](RelationshipsApi.md#v1_relationships_get) | **GET** /v1/relationships | Get list of the relationships configured in your group
[**v1_relationships_post**](RelationshipsApi.md#v1_relationships_post) | **POST** /v1/relationships | Create a relationship type
[**v1_relationships_relationship_id_delete**](RelationshipsApi.md#v1_relationships_relationship_id_delete) | **DELETE** /v1/relationships/{relationshipId} | Delete a relationship type
[**v1_relationships_relationship_id_put**](RelationshipsApi.md#v1_relationships_relationship_id_put) | **PUT** /v1/relationships/{relationshipId} | Edit a relationship type


# **v1_relationships_get**
> [RelationshipDto] v1_relationships_get()

Get list of the relationships configured in your group

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
import time
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.IRNContacts
from fds.sdk.IRNContacts.api import relationships_api
from fds.sdk.IRNContacts.model.relationship_dto import RelationshipDto
from fds.sdk.IRNContacts.model.relationship_type import RelationshipType
from pprint import pprint
# Defining the host is optional and defaults to https://api-sandbox.factset.com/research/irn
# See configuration.py for a list of all supported configuration parameters.
configuration = fds.sdk.IRNContacts.Configuration(
    host = "https://api-sandbox.factset.com/research/irn"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://developer.factset.com/applications
configuration = fds.sdk.IRNContacts.Configuration(
     fds_oauth_client = ConfidentialClient('app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://developer.factset.com/manage-api-keys
# configuration = fds.sdk.IRNContacts.Configuration(
#     username = 'USERNAME-SERIAL',
#     password = 'API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.IRNContacts.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = relationships_api.RelationshipsApi(api_client)
    type = RelationshipType("All") # RelationshipType |  (optional)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Get list of the relationships configured in your group
        api_response = api_instance.v1_relationships_get(type=type)
        pprint(api_response)
    except fds.sdk.IRNContacts.ApiException as e:
        print("Exception when calling RelationshipsApi->v1_relationships_get: %s\n" % e)
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

# **v1_relationships_post**
> str v1_relationships_post()

Create a relationship type

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
import time
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.IRNContacts
from fds.sdk.IRNContacts.api import relationships_api
from fds.sdk.IRNContacts.model.problem_details import ProblemDetails
from fds.sdk.IRNContacts.model.relationship_save_dto import RelationshipSaveDto
from pprint import pprint
# Defining the host is optional and defaults to https://api-sandbox.factset.com/research/irn
# See configuration.py for a list of all supported configuration parameters.
configuration = fds.sdk.IRNContacts.Configuration(
    host = "https://api-sandbox.factset.com/research/irn"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://developer.factset.com/applications
configuration = fds.sdk.IRNContacts.Configuration(
     fds_oauth_client = ConfidentialClient('app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://developer.factset.com/manage-api-keys
# configuration = fds.sdk.IRNContacts.Configuration(
#     username = 'USERNAME-SERIAL',
#     password = 'API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.IRNContacts.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = relationships_api.RelationshipsApi(api_client)
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

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Create a relationship type
        api_response = api_instance.v1_relationships_post(relationship_save_dto=relationship_save_dto)
        pprint(api_response)
    except fds.sdk.IRNContacts.ApiException as e:
        print("Exception when calling RelationshipsApi->v1_relationships_post: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **relationship_save_dto** | [**RelationshipSaveDto**](RelationshipSaveDto.md)| RelationshipSaveDto object to save | [optional]

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

# **v1_relationships_relationship_id_delete**
> v1_relationships_relationship_id_delete(relationship_id)

Delete a relationship type

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
import time
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.IRNContacts
from fds.sdk.IRNContacts.api import relationships_api
from fds.sdk.IRNContacts.model.problem_details import ProblemDetails
from pprint import pprint
# Defining the host is optional and defaults to https://api-sandbox.factset.com/research/irn
# See configuration.py for a list of all supported configuration parameters.
configuration = fds.sdk.IRNContacts.Configuration(
    host = "https://api-sandbox.factset.com/research/irn"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://developer.factset.com/applications
configuration = fds.sdk.IRNContacts.Configuration(
     fds_oauth_client = ConfidentialClient('app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://developer.factset.com/manage-api-keys
# configuration = fds.sdk.IRNContacts.Configuration(
#     username = 'USERNAME-SERIAL',
#     password = 'API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.IRNContacts.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = relationships_api.RelationshipsApi(api_client)
    relationship_id = "relationshipId_example" # str | relationshipId to delete associated record

    # example passing only required values which don't have defaults set
    try:
        # Delete a relationship type
        api_instance.v1_relationships_relationship_id_delete(relationship_id)
    except fds.sdk.IRNContacts.ApiException as e:
        print("Exception when calling RelationshipsApi->v1_relationships_relationship_id_delete: %s\n" % e)
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

# **v1_relationships_relationship_id_put**
> v1_relationships_relationship_id_put(relationship_id)

Edit a relationship type

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
import time
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.IRNContacts
from fds.sdk.IRNContacts.api import relationships_api
from fds.sdk.IRNContacts.model.problem_details import ProblemDetails
from fds.sdk.IRNContacts.model.relationship_save_dto import RelationshipSaveDto
from pprint import pprint
# Defining the host is optional and defaults to https://api-sandbox.factset.com/research/irn
# See configuration.py for a list of all supported configuration parameters.
configuration = fds.sdk.IRNContacts.Configuration(
    host = "https://api-sandbox.factset.com/research/irn"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://developer.factset.com/applications
configuration = fds.sdk.IRNContacts.Configuration(
     fds_oauth_client = ConfidentialClient('app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://developer.factset.com/manage-api-keys
# configuration = fds.sdk.IRNContacts.Configuration(
#     username = 'USERNAME-SERIAL',
#     password = 'API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.IRNContacts.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = relationships_api.RelationshipsApi(api_client)
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

    # example passing only required values which don't have defaults set
    try:
        # Edit a relationship type
        api_instance.v1_relationships_relationship_id_put(relationship_id)
    except fds.sdk.IRNContacts.ApiException as e:
        print("Exception when calling RelationshipsApi->v1_relationships_relationship_id_put: %s\n" % e)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Edit a relationship type
        api_instance.v1_relationships_relationship_id_put(relationship_id, relationship_save_dto=relationship_save_dto)
    except fds.sdk.IRNContacts.ApiException as e:
        print("Exception when calling RelationshipsApi->v1_relationships_relationship_id_put: %s\n" % e)
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
**204** | Success |  -  |
**400** | Bad Request |  -  |
**404** | Not Found |  -  |
**0** | Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

