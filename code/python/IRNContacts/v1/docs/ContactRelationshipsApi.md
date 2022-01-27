# fds.sdk.IRNContacts.ContactRelationshipsApi

All URIs are relative to *https://api-sandbox.factset.com/research/irn*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1_contact_relationships_contact_relationship_id_delete**](ContactRelationshipsApi.md#v1_contact_relationships_contact_relationship_id_delete) | **DELETE** /v1/contact-relationships/{contactRelationshipId} | Delete a contact relationship
[**v1_contact_relationships_contact_relationship_id_get**](ContactRelationshipsApi.md#v1_contact_relationships_contact_relationship_id_get) | **GET** /v1/contact-relationships/{contactRelationshipId} | Get details on a specific contact relationship
[**v1_contact_relationships_contact_relationship_id_patch**](ContactRelationshipsApi.md#v1_contact_relationships_contact_relationship_id_patch) | **PATCH** /v1/contact-relationships/{contactRelationshipId} | Update a contact relationship
[**v1_contact_relationships_get**](ContactRelationshipsApi.md#v1_contact_relationships_get) | **GET** /v1/contact-relationships | Get all the relationships where the given symbol or contact identifier has been tagged in a relationship
[**v1_contact_relationships_post**](ContactRelationshipsApi.md#v1_contact_relationships_post) | **POST** /v1/contact-relationships | Create a contact relationship


# **v1_contact_relationships_contact_relationship_id_delete**
> v1_contact_relationships_contact_relationship_id_delete(contact_relationship_id)

Delete a contact relationship

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
import time
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.IRNContacts
from fds.sdk.IRNContacts.api import contact_relationships_api
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
    api_instance = contact_relationships_api.ContactRelationshipsApi(api_client)
    contact_relationship_id = "contactRelationshipId_example" # str | contactRelationshipId to delete associated record

    # example passing only required values which don't have defaults set
    try:
        # Delete a contact relationship
        api_instance.v1_contact_relationships_contact_relationship_id_delete(contact_relationship_id)
    except fds.sdk.IRNContacts.ApiException as e:
        print("Exception when calling ContactRelationshipsApi->v1_contact_relationships_contact_relationship_id_delete: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contact_relationship_id** | **str**| contactRelationshipId to delete associated record |

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

# **v1_contact_relationships_contact_relationship_id_get**
> ContactRelationshipTwoSidedDto v1_contact_relationships_contact_relationship_id_get(contact_relationship_id)

Get details on a specific contact relationship

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
import time
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.IRNContacts
from fds.sdk.IRNContacts.api import contact_relationships_api
from fds.sdk.IRNContacts.model.problem_details import ProblemDetails
from fds.sdk.IRNContacts.model.contact_relationship_two_sided_dto import ContactRelationshipTwoSidedDto
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
    api_instance = contact_relationships_api.ContactRelationshipsApi(api_client)
    contact_relationship_id = "contactRelationshipId_example" # str | contactRelationshipId to get associated record

    # example passing only required values which don't have defaults set
    try:
        # Get details on a specific contact relationship
        api_response = api_instance.v1_contact_relationships_contact_relationship_id_get(contact_relationship_id)
        pprint(api_response)
    except fds.sdk.IRNContacts.ApiException as e:
        print("Exception when calling ContactRelationshipsApi->v1_contact_relationships_contact_relationship_id_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contact_relationship_id** | **str**| contactRelationshipId to get associated record |

### Return type

[**ContactRelationshipTwoSidedDto**](ContactRelationshipTwoSidedDto.md)

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

# **v1_contact_relationships_contact_relationship_id_patch**
> v1_contact_relationships_contact_relationship_id_patch(contact_relationship_id)

Update a contact relationship

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
import time
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.IRNContacts
from fds.sdk.IRNContacts.api import contact_relationships_api
from fds.sdk.IRNContacts.model.problem_details import ProblemDetails
from fds.sdk.IRNContacts.model.operation import Operation
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
    api_instance = contact_relationships_api.ContactRelationshipsApi(api_client)
    contact_relationship_id = "contactRelationshipId_example" # str | contactRelationshipId to update associated record
    operation = [
        Operation(
            value={},
            path="path_example",
            op="op_example",
            _from="_from_example",
        ),
    ] # [Operation] | contactRelationshipPatch object to update (optional)

    # example passing only required values which don't have defaults set
    try:
        # Update a contact relationship
        api_instance.v1_contact_relationships_contact_relationship_id_patch(contact_relationship_id)
    except fds.sdk.IRNContacts.ApiException as e:
        print("Exception when calling ContactRelationshipsApi->v1_contact_relationships_contact_relationship_id_patch: %s\n" % e)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Update a contact relationship
        api_instance.v1_contact_relationships_contact_relationship_id_patch(contact_relationship_id, operation=operation)
    except fds.sdk.IRNContacts.ApiException as e:
        print("Exception when calling ContactRelationshipsApi->v1_contact_relationships_contact_relationship_id_patch: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contact_relationship_id** | **str**| contactRelationshipId to update associated record |
 **operation** | [**[Operation]**](Operation.md)| contactRelationshipPatch object to update | [optional]

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

# **v1_contact_relationships_get**
> [ContactRelationshipTwoSidedDto] v1_contact_relationships_get()

Get all the relationships where the given symbol or contact identifier has been tagged in a relationship

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
import time
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.IRNContacts
from fds.sdk.IRNContacts.api import contact_relationships_api
from fds.sdk.IRNContacts.model.problem_details import ProblemDetails
from fds.sdk.IRNContacts.model.contact_relationship_two_sided_dto import ContactRelationshipTwoSidedDto
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
    api_instance = contact_relationships_api.ContactRelationshipsApi(api_client)
    symbol = "symbol_example" # str |  (optional)
    contact_id = "contactId_example" # str |  (optional)
    relationship_id = "relationshipId_example" # str |  (optional)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Get all the relationships where the given symbol or contact identifier has been tagged in a relationship
        api_response = api_instance.v1_contact_relationships_get(symbol=symbol, contact_id=contact_id, relationship_id=relationship_id)
        pprint(api_response)
    except fds.sdk.IRNContacts.ApiException as e:
        print("Exception when calling ContactRelationshipsApi->v1_contact_relationships_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **str**|  | [optional]
 **contact_id** | **str**|  | [optional]
 **relationship_id** | **str**|  | [optional]

### Return type

[**[ContactRelationshipTwoSidedDto]**](ContactRelationshipTwoSidedDto.md)

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1_contact_relationships_post**
> v1_contact_relationships_post()

Create a contact relationship

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
import time
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.IRNContacts
from fds.sdk.IRNContacts.api import contact_relationships_api
from fds.sdk.IRNContacts.model.problem_details import ProblemDetails
from fds.sdk.IRNContacts.model.contact_relationship_two_sided_save_dto import ContactRelationshipTwoSidedSaveDto
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
    api_instance = contact_relationships_api.ContactRelationshipsApi(api_client)
    contact_relationship_two_sided_save_dto = ContactRelationshipTwoSidedSaveDto(
        relationship_id="relationship_id_example",
        left_contact_id="left_contact_id_example",
        right_contact_id="right_contact_id_example",
        start=dateutil_parser('1970-01-01T00:00:00.00Z'),
        end=dateutil_parser('1970-01-01T00:00:00.00Z'),
        comment="comment_example",
        is_current=True,
        symbol_id="symbol_id_example",
        symbol="symbol_example",
        title="title_example",
    ) # ContactRelationshipTwoSidedSaveDto | contactRelationship object to save (optional)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Create a contact relationship
        api_instance.v1_contact_relationships_post(contact_relationship_two_sided_save_dto=contact_relationship_two_sided_save_dto)
    except fds.sdk.IRNContacts.ApiException as e:
        print("Exception when calling ContactRelationshipsApi->v1_contact_relationships_post: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contact_relationship_two_sided_save_dto** | [**ContactRelationshipTwoSidedSaveDto**](ContactRelationshipTwoSidedSaveDto.md)| contactRelationship object to save | [optional]

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
**201** | Success |  -  |
**400** | Bad Request |  -  |
**0** | Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

