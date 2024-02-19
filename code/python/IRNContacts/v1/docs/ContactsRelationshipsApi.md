# fds.sdk.IRNContacts.ContactsRelationshipsApi

All URIs are relative to *https://api.factset.com/research/irn*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_contact_relationship**](ContactsRelationshipsApi.md#create_contact_relationship) | **POST** /v1/contact-relationships | Create a contact relationship
[**delete_contact_relationship**](ContactsRelationshipsApi.md#delete_contact_relationship) | **DELETE** /v1/contact-relationships/{contactRelationshipId} | Delete a contact relationship
[**get_all_relationships_tagging_a_contact**](ContactsRelationshipsApi.md#get_all_relationships_tagging_a_contact) | **GET** /v1/contact-relationships | Get all the relationships where the given symbol or contact identifier has been tagged in a relationship
[**get_contact_relationship**](ContactsRelationshipsApi.md#get_contact_relationship) | **GET** /v1/contact-relationships/{contactRelationshipId} | Get details on a specific contact relationship
[**patch_contact_relationship**](ContactsRelationshipsApi.md#patch_contact_relationship) | **PATCH** /v1/contact-relationships/{contactRelationshipId} | Update a contact relationship



# **create_contact_relationship**
> NewItemDto create_contact_relationship()

Create a contact relationship

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.IRNContacts
from fds.sdk.IRNContacts.api import contacts___relationships_api
from fds.sdk.IRNContacts.models import *
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
configuration = fds.sdk.IRNContacts.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.IRNContacts.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.IRNContacts.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = contacts___relationships_api.ContactsRelationshipsApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
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

    try:
        # Create a contact relationship
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.create_contact_relationship(contact_relationship_two_sided_save_dto=contact_relationship_two_sided_save_dto)

        pprint(api_response)

    except fds.sdk.IRNContacts.ApiException as e:
        print("Exception when calling ContactsRelationshipsApi->create_contact_relationship: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contact_relationship_two_sided_save_dto** | [**ContactRelationshipTwoSidedSaveDto**](ContactRelationshipTwoSidedSaveDto.md)| contactRelationship object to save | [optional]

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

# **delete_contact_relationship**
> delete_contact_relationship(contact_relationship_id)

Delete a contact relationship

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.IRNContacts
from fds.sdk.IRNContacts.api import contacts___relationships_api
from fds.sdk.IRNContacts.models import *
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
configuration = fds.sdk.IRNContacts.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.IRNContacts.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.IRNContacts.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = contacts___relationships_api.ContactsRelationshipsApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    contact_relationship_id = "contactRelationshipId_example" # str | contactRelationshipId to delete associated record

    try:
        # Delete a contact relationship
        # example passing only required values which don't have defaults set
        api_instance.delete_contact_relationship(contact_relationship_id)


    except fds.sdk.IRNContacts.ApiException as e:
        print("Exception when calling ContactsRelationshipsApi->delete_contact_relationship: %s\n" % e)
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

# **get_all_relationships_tagging_a_contact**
> [ContactRelationshipTwoSidedDto] get_all_relationships_tagging_a_contact()

Get all the relationships where the given symbol or contact identifier has been tagged in a relationship

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.IRNContacts
from fds.sdk.IRNContacts.api import contacts___relationships_api
from fds.sdk.IRNContacts.models import *
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
configuration = fds.sdk.IRNContacts.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.IRNContacts.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.IRNContacts.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = contacts___relationships_api.ContactsRelationshipsApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    symbol = "symbol_example" # str |  (optional)
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    contact_id = "contactId_example" # str |  (optional)
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    relationship_id = "relationshipId_example" # str |  (optional)

    try:
        # Get all the relationships where the given symbol or contact identifier has been tagged in a relationship
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_all_relationships_tagging_a_contact(symbol=symbol, contact_id=contact_id, relationship_id=relationship_id)

        pprint(api_response)

    except fds.sdk.IRNContacts.ApiException as e:
        print("Exception when calling ContactsRelationshipsApi->get_all_relationships_tagging_a_contact: %s\n" % e)
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

# **get_contact_relationship**
> ContactRelationshipTwoSidedDto get_contact_relationship(contact_relationship_id)

Get details on a specific contact relationship

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.IRNContacts
from fds.sdk.IRNContacts.api import contacts___relationships_api
from fds.sdk.IRNContacts.models import *
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
configuration = fds.sdk.IRNContacts.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.IRNContacts.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.IRNContacts.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = contacts___relationships_api.ContactsRelationshipsApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    contact_relationship_id = "contactRelationshipId_example" # str | contactRelationshipId to get associated record

    try:
        # Get details on a specific contact relationship
        # example passing only required values which don't have defaults set
        api_response = api_instance.get_contact_relationship(contact_relationship_id)

        pprint(api_response)

    except fds.sdk.IRNContacts.ApiException as e:
        print("Exception when calling ContactsRelationshipsApi->get_contact_relationship: %s\n" % e)
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

# **patch_contact_relationship**
> patch_contact_relationship(contact_relationship_id)

Update a contact relationship

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.IRNContacts
from fds.sdk.IRNContacts.api import contacts___relationships_api
from fds.sdk.IRNContacts.models import *
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
configuration = fds.sdk.IRNContacts.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.IRNContacts.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.IRNContacts.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = contacts___relationships_api.ContactsRelationshipsApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    contact_relationship_id = "contactRelationshipId_example" # str | contactRelationshipId to update associated record
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    operation = [
        Operation(
            operation_type=OperationType(0),
            path="path_example",
            op="op_example",
            _from="_from_example",
            value=None,
        ),
    ] # [Operation] | contactRelationshipPatch object to update (optional)

    try:
        # Update a contact relationship
        # example passing only required values which don't have defaults set
        # and optional values
        api_instance.patch_contact_relationship(contact_relationship_id, operation=operation)


    except fds.sdk.IRNContacts.ApiException as e:
        print("Exception when calling ContactsRelationshipsApi->patch_contact_relationship: %s\n" % e)
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

