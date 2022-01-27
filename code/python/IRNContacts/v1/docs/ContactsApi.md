# fds.sdk.IRNContacts.ContactsApi

All URIs are relative to *https://api-sandbox.factset.com/research/irn*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1_contacts_contact_id_about_get**](ContactsApi.md#v1_contacts_contact_id_about_get) | **GET** /v1/contacts/{contactId}/about | Get the About field content for a specific contact
[**v1_contacts_contact_id_delete**](ContactsApi.md#v1_contacts_contact_id_delete) | **DELETE** /v1/contacts/{contactId} | Delete a contact
[**v1_contacts_contact_id_events_get**](ContactsApi.md#v1_contacts_contact_id_events_get) | **GET** /v1/contacts/{contactId}/events | Get a contact’s audit history
[**v1_contacts_contact_id_get**](ContactsApi.md#v1_contacts_contact_id_get) | **GET** /v1/contacts/{contactId} | Get all custom field and standard field details on a specific contact
[**v1_contacts_contact_id_patch**](ContactsApi.md#v1_contacts_contact_id_patch) | **PATCH** /v1/contacts/{contactId} | Edit a contact’s standard field and custom field data
[**v1_contacts_contact_id_records_get**](ContactsApi.md#v1_contacts_contact_id_records_get) | **GET** /v1/contacts/{contactId}/records | Get all notes and meetings where a specific contact was tagged
[**v1_contacts_contact_id_relationships_get**](ContactsApi.md#v1_contacts_contact_id_relationships_get) | **GET** /v1/contacts/{contactId}/relationships | Returns a list of a contact’s relationships
[**v1_contacts_get**](ContactsApi.md#v1_contacts_get) | **GET** /v1/contacts | Get list of all contacts in your group along with some of their standard field data
[**v1_contacts_post**](ContactsApi.md#v1_contacts_post) | **POST** /v1/contacts | Create a contact


# **v1_contacts_contact_id_about_get**
> str v1_contacts_contact_id_about_get(contact_id)

Get the About field content for a specific contact

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
import time
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.IRNContacts
from fds.sdk.IRNContacts.api import contacts_api
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
    api_instance = contacts_api.ContactsApi(api_client)
    contact_id = "contactId_example" # str | contactId of associated record

    # example passing only required values which don't have defaults set
    try:
        # Get the About field content for a specific contact
        api_response = api_instance.v1_contacts_contact_id_about_get(contact_id)
        pprint(api_response)
    except fds.sdk.IRNContacts.ApiException as e:
        print("Exception when calling ContactsApi->v1_contacts_contact_id_about_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contact_id** | **str**| contactId of associated record |

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

# **v1_contacts_contact_id_delete**
> v1_contacts_contact_id_delete(contact_id)

Delete a contact

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
import time
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.IRNContacts
from fds.sdk.IRNContacts.api import contacts_api
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
    api_instance = contacts_api.ContactsApi(api_client)
    contact_id = "contactId_example" # str | contactId to delete associated record

    # example passing only required values which don't have defaults set
    try:
        # Delete a contact
        api_instance.v1_contacts_contact_id_delete(contact_id)
    except fds.sdk.IRNContacts.ApiException as e:
        print("Exception when calling ContactsApi->v1_contacts_contact_id_delete: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contact_id** | **str**| contactId to delete associated record |

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

# **v1_contacts_contact_id_events_get**
> [ContactEventDto] v1_contacts_contact_id_events_get(contact_id)

Get a contact’s audit history

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
import time
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.IRNContacts
from fds.sdk.IRNContacts.api import contacts_api
from fds.sdk.IRNContacts.model.problem_details import ProblemDetails
from fds.sdk.IRNContacts.model.contact_event_dto import ContactEventDto
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
    api_instance = contacts_api.ContactsApi(api_client)
    contact_id = "contactId_example" # str | contactId to get associated records

    # example passing only required values which don't have defaults set
    try:
        # Get a contact’s audit history
        api_response = api_instance.v1_contacts_contact_id_events_get(contact_id)
        pprint(api_response)
    except fds.sdk.IRNContacts.ApiException as e:
        print("Exception when calling ContactsApi->v1_contacts_contact_id_events_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contact_id** | **str**| contactId to get associated records |

### Return type

[**[ContactEventDto]**](ContactEventDto.md)

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

# **v1_contacts_contact_id_get**
> ContactDto v1_contacts_contact_id_get(contact_id)

Get all custom field and standard field details on a specific contact

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
import time
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.IRNContacts
from fds.sdk.IRNContacts.api import contacts_api
from fds.sdk.IRNContacts.model.problem_details import ProblemDetails
from fds.sdk.IRNContacts.model.contact_dto import ContactDto
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
    api_instance = contacts_api.ContactsApi(api_client)
    contact_id = "contactId_example" # str | contactId to get associated record

    # example passing only required values which don't have defaults set
    try:
        # Get all custom field and standard field details on a specific contact
        api_response = api_instance.v1_contacts_contact_id_get(contact_id)
        pprint(api_response)
    except fds.sdk.IRNContacts.ApiException as e:
        print("Exception when calling ContactsApi->v1_contacts_contact_id_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contact_id** | **str**| contactId to get associated record |

### Return type

[**ContactDto**](ContactDto.md)

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

# **v1_contacts_contact_id_patch**
> v1_contacts_contact_id_patch(contact_id)

Edit a contact’s standard field and custom field data

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
import time
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.IRNContacts
from fds.sdk.IRNContacts.api import contacts_api
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
    api_instance = contacts_api.ContactsApi(api_client)
    contact_id = "contactId_example" # str | contactId to update associated record
    operation = [
        Operation(
            value={},
            path="path_example",
            op="op_example",
            _from="_from_example",
        ),
    ] # [Operation] | contactSaveDtoPatch object to update (optional)

    # example passing only required values which don't have defaults set
    try:
        # Edit a contact’s standard field and custom field data
        api_instance.v1_contacts_contact_id_patch(contact_id)
    except fds.sdk.IRNContacts.ApiException as e:
        print("Exception when calling ContactsApi->v1_contacts_contact_id_patch: %s\n" % e)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Edit a contact’s standard field and custom field data
        api_instance.v1_contacts_contact_id_patch(contact_id, operation=operation)
    except fds.sdk.IRNContacts.ApiException as e:
        print("Exception when calling ContactsApi->v1_contacts_contact_id_patch: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contact_id** | **str**| contactId to update associated record |
 **operation** | [**[Operation]**](Operation.md)| contactSaveDtoPatch object to update | [optional]

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

# **v1_contacts_contact_id_records_get**
> [RecordPreviewDto] v1_contacts_contact_id_records_get(contact_id)

Get all notes and meetings where a specific contact was tagged

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
import time
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.IRNContacts
from fds.sdk.IRNContacts.api import contacts_api
from fds.sdk.IRNContacts.model.problem_details import ProblemDetails
from fds.sdk.IRNContacts.model.record_preview_dto import RecordPreviewDto
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
    api_instance = contacts_api.ContactsApi(api_client)
    contact_id = "contactId_example" # str | contactId to get associated records

    # example passing only required values which don't have defaults set
    try:
        # Get all notes and meetings where a specific contact was tagged
        api_response = api_instance.v1_contacts_contact_id_records_get(contact_id)
        pprint(api_response)
    except fds.sdk.IRNContacts.ApiException as e:
        print("Exception when calling ContactsApi->v1_contacts_contact_id_records_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contact_id** | **str**| contactId to get associated records |

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

# **v1_contacts_contact_id_relationships_get**
> [ContactRelationshipDto] v1_contacts_contact_id_relationships_get(contact_id)

Returns a list of a contact’s relationships

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
import time
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.IRNContacts
from fds.sdk.IRNContacts.api import contacts_api
from fds.sdk.IRNContacts.model.problem_details import ProblemDetails
from fds.sdk.IRNContacts.model.contact_relationship_dto import ContactRelationshipDto
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
    api_instance = contacts_api.ContactsApi(api_client)
    contact_id = "contactId_example" # str | contactId to get associated records

    # example passing only required values which don't have defaults set
    try:
        # Returns a list of a contact’s relationships
        api_response = api_instance.v1_contacts_contact_id_relationships_get(contact_id)
        pprint(api_response)
    except fds.sdk.IRNContacts.ApiException as e:
        print("Exception when calling ContactsApi->v1_contacts_contact_id_relationships_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contact_id** | **str**| contactId to get associated records |

### Return type

[**[ContactRelationshipDto]**](ContactRelationshipDto.md)

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

# **v1_contacts_get**
> [ContactSummaryDto] v1_contacts_get()

Get list of all contacts in your group along with some of their standard field data

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
import time
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.IRNContacts
from fds.sdk.IRNContacts.api import contacts_api
from fds.sdk.IRNContacts.model.contact_summary_dto import ContactSummaryDto
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
    api_instance = contacts_api.ContactsApi(api_client)
    full_name = "fullName_example" # str | Filter results on fullName (optional)
    email_address = "emailAddress_example" # str | Filter results on emailAddress (optional)
    identifier = "identifier_example" # str | Filter results on identifier (optional)
    employer_name = "employerName_example" # str | Filter results on employerName (optional)
    custom_field_values = False # bool | Includes custom field values in response if true (optional) if omitted the server will use the default value of False
    search = "search_example" # str | Filter results on the combination of fullName, emailAddress, identifier and employerName (optional)
    sort = "sort_example" # str |  (optional)
    include_last_meeting_date = False # bool | If true, returns when they were last tagged as an attendee in an IRN meeting (optional) if omitted the server will use the default value of False
    limit = 0 # int | Restrict number of records returned (optional) if omitted the server will use the default value of 0

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Get list of all contacts in your group along with some of their standard field data
        api_response = api_instance.v1_contacts_get(full_name=full_name, email_address=email_address, identifier=identifier, employer_name=employer_name, custom_field_values=custom_field_values, search=search, sort=sort, include_last_meeting_date=include_last_meeting_date, limit=limit)
        pprint(api_response)
    except fds.sdk.IRNContacts.ApiException as e:
        print("Exception when calling ContactsApi->v1_contacts_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **full_name** | **str**| Filter results on fullName | [optional]
 **email_address** | **str**| Filter results on emailAddress | [optional]
 **identifier** | **str**| Filter results on identifier | [optional]
 **employer_name** | **str**| Filter results on employerName | [optional]
 **custom_field_values** | **bool**| Includes custom field values in response if true | [optional] if omitted the server will use the default value of False
 **search** | **str**| Filter results on the combination of fullName, emailAddress, identifier and employerName | [optional]
 **sort** | **str**|  | [optional]
 **include_last_meeting_date** | **bool**| If true, returns when they were last tagged as an attendee in an IRN meeting | [optional] if omitted the server will use the default value of False
 **limit** | **int**| Restrict number of records returned | [optional] if omitted the server will use the default value of 0

### Return type

[**[ContactSummaryDto]**](ContactSummaryDto.md)

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

# **v1_contacts_post**
> str v1_contacts_post()

Create a contact

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
import time
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.IRNContacts
from fds.sdk.IRNContacts.api import contacts_api
from fds.sdk.IRNContacts.model.problem_details import ProblemDetails
from fds.sdk.IRNContacts.model.contact_save_dto import ContactSaveDto
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
    api_instance = contacts_api.ContactsApi(api_client)
    contact_save_dto = ContactSaveDto(
        primary_email_address="primary_email_address_example",
        full_name="full_name_example",
        notes="notes_example",
        linked_in_profile="linked_in_profile_example",
        person_symbol="person_symbol_example",
        role_id="role_id_example",
        type_id="type_id_example",
        address=ContactAddressDto(
            google_maps_place_id="google_maps_place_id_example",
            formatted_address="formatted_address_example",
            city="city_example",
            state_province="state_province_example",
            postal_code="postal_code_example",
            country="country_example",
        ),
        phone_numbers=[
            ContactPhoneSaveDto(
                id="id_example",
                number="number_example",
                type_id="type_id_example",
                is_primary=True,
            ),
        ],
        left_relationships=[
            ContactRelationshipSaveDto(
                relationship_id="relationship_id_example",
                contact_id="contact_id_example",
                start=dateutil_parser('1970-01-01T00:00:00.00Z'),
                end=dateutil_parser('1970-01-01T00:00:00.00Z'),
                comment="comment_example",
                is_current=True,
                symbol="symbol_example",
                title="title_example",
            ),
        ],
        right_relationships=[
            ContactRelationshipSaveDto(
                relationship_id="relationship_id_example",
                contact_id="contact_id_example",
                start=dateutil_parser('1970-01-01T00:00:00.00Z'),
                end=dateutil_parser('1970-01-01T00:00:00.00Z'),
                comment="comment_example",
                is_current=True,
                symbol="symbol_example",
                title="title_example",
            ),
        ],
        alternative_email_addresses=[
            AlternativeEmailAddressDto(
                id="id_example",
                email_address="email_address_example",
            ),
        ],
        custom_fields=[
            ContactCustomFieldValueSaveDto(
                code="code_example",
                value="value_example",
                option_values=[
                    "option_values_example",
                ],
                evaluate_formula=False,
            ),
        ],
    ) # ContactSaveDto | contactSaveDto object to save (optional)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Create a contact
        api_response = api_instance.v1_contacts_post(contact_save_dto=contact_save_dto)
        pprint(api_response)
    except fds.sdk.IRNContacts.ApiException as e:
        print("Exception when calling ContactsApi->v1_contacts_post: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contact_save_dto** | [**ContactSaveDto**](ContactSaveDto.md)| contactSaveDto object to save | [optional]

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

