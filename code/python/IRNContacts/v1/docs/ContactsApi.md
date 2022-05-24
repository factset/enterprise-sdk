# fds.sdk.IRNContacts.ContactsApi

All URIs are relative to *https://api-sandbox.factset.com/research/irn*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_contact**](ContactsApi.md#create_contact) | **POST** /v1/contacts | Create a contact
[**delete_contact**](ContactsApi.md#delete_contact) | **DELETE** /v1/contacts/{contactId} | Delete a contact
[**get_contact**](ContactsApi.md#get_contact) | **GET** /v1/contacts/{contactId} | Get all custom field and standard field details on a specific contact
[**get_contact_events**](ContactsApi.md#get_contact_events) | **GET** /v1/contacts/{contactId}/events | Get a contact’s audit history
[**get_contact_notes**](ContactsApi.md#get_contact_notes) | **GET** /v1/contacts/{contactId}/about | Get the About field content for a specific contact
[**get_contact_records**](ContactsApi.md#get_contact_records) | **GET** /v1/contacts/{contactId}/records | Get all notes and meetings where a specific contact was tagged
[**get_contact_relationships**](ContactsApi.md#get_contact_relationships) | **GET** /v1/contacts/{contactId}/relationships | Returns a list of a contact’s relationships
[**get_contacts**](ContactsApi.md#get_contacts) | **GET** /v1/contacts | Get list of all contacts in your group along with some of their standard field data
[**patch_contact**](ContactsApi.md#patch_contact) | **PATCH** /v1/contacts/{contactId} | Edit a contact’s standard field and custom field data


# **create_contact**
> NewItemDto create_contact()

Create a contact

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.IRNContacts
from fds.sdk.IRNContacts.api import contacts_api
from fds.sdk.IRNContacts.model.problem_details import ProblemDetails
from fds.sdk.IRNContacts.model.new_item_dto import NewItemDto
from fds.sdk.IRNContacts.model.contact_save_dto import ContactSaveDto
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

    try:
        # Create a contact
        api_response = api_instance.create_contact(contact_save_dto=contact_save_dto)
        pprint(api_response)

    except fds.sdk.IRNContacts.ApiException as e:
        print("Exception when calling ContactsApi->create_contact: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contact_save_dto** | [**ContactSaveDto**](ContactSaveDto.md)| contactSaveDto object to save | [optional]

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

# **delete_contact**
> delete_contact(contact_id)

Delete a contact

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.IRNContacts
from fds.sdk.IRNContacts.api import contacts_api
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
    api_instance = contacts_api.ContactsApi(api_client)

    contact_id = "contactId_example" # str | contactId to delete associated record

    try:
        # Delete a contact
        api_instance.delete_contact(contact_id)
    except fds.sdk.IRNContacts.ApiException as e:
        print("Exception when calling ContactsApi->delete_contact: %s\n" % e)
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

# **get_contact**
> ContactDto get_contact(contact_id)

Get all custom field and standard field details on a specific contact

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.IRNContacts
from fds.sdk.IRNContacts.api import contacts_api
from fds.sdk.IRNContacts.model.problem_details import ProblemDetails
from fds.sdk.IRNContacts.model.contact_dto import ContactDto
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
    api_instance = contacts_api.ContactsApi(api_client)

    contact_id = "contactId_example" # str | contactId to get associated record

    try:
        # Get all custom field and standard field details on a specific contact
        api_response = api_instance.get_contact(contact_id)
        pprint(api_response)

    except fds.sdk.IRNContacts.ApiException as e:
        print("Exception when calling ContactsApi->get_contact: %s\n" % e)
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

# **get_contact_events**
> [ContactEventDto] get_contact_events(contact_id)

Get a contact’s audit history

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.IRNContacts
from fds.sdk.IRNContacts.api import contacts_api
from fds.sdk.IRNContacts.model.problem_details import ProblemDetails
from fds.sdk.IRNContacts.model.contact_event_dto import ContactEventDto
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
    api_instance = contacts_api.ContactsApi(api_client)

    contact_id = "contactId_example" # str | contactId to get associated records

    try:
        # Get a contact’s audit history
        api_response = api_instance.get_contact_events(contact_id)
        pprint(api_response)

    except fds.sdk.IRNContacts.ApiException as e:
        print("Exception when calling ContactsApi->get_contact_events: %s\n" % e)
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

# **get_contact_notes**
> str get_contact_notes(contact_id)

Get the About field content for a specific contact

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.IRNContacts
from fds.sdk.IRNContacts.api import contacts_api
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
    api_instance = contacts_api.ContactsApi(api_client)

    contact_id = "contactId_example" # str | contactId of associated record

    try:
        # Get the About field content for a specific contact
        api_response = api_instance.get_contact_notes(contact_id)
        pprint(api_response)

    except fds.sdk.IRNContacts.ApiException as e:
        print("Exception when calling ContactsApi->get_contact_notes: %s\n" % e)
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

# **get_contact_records**
> [RecordPreviewDto] get_contact_records(contact_id)

Get all notes and meetings where a specific contact was tagged

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.IRNContacts
from fds.sdk.IRNContacts.api import contacts_api
from fds.sdk.IRNContacts.model.problem_details import ProblemDetails
from fds.sdk.IRNContacts.model.record_preview_dto import RecordPreviewDto
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
    api_instance = contacts_api.ContactsApi(api_client)

    contact_id = "contactId_example" # str | contactId to get associated records

    try:
        # Get all notes and meetings where a specific contact was tagged
        api_response = api_instance.get_contact_records(contact_id)
        pprint(api_response)

    except fds.sdk.IRNContacts.ApiException as e:
        print("Exception when calling ContactsApi->get_contact_records: %s\n" % e)
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

# **get_contact_relationships**
> [ContactRelationshipDto] get_contact_relationships(contact_id)

Returns a list of a contact’s relationships

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.IRNContacts
from fds.sdk.IRNContacts.api import contacts_api
from fds.sdk.IRNContacts.model.problem_details import ProblemDetails
from fds.sdk.IRNContacts.model.contact_relationship_dto import ContactRelationshipDto
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
    api_instance = contacts_api.ContactsApi(api_client)

    contact_id = "contactId_example" # str | contactId to get associated records

    try:
        # Returns a list of a contact’s relationships
        api_response = api_instance.get_contact_relationships(contact_id)
        pprint(api_response)

    except fds.sdk.IRNContacts.ApiException as e:
        print("Exception when calling ContactsApi->get_contact_relationships: %s\n" % e)
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

# **get_contacts**
> [ContactSummaryDto] get_contacts()

Get list of all contacts in your group along with some of their standard field data

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.IRNContacts
from fds.sdk.IRNContacts.api import contacts_api
from fds.sdk.IRNContacts.model.contact_summary_dto import ContactSummaryDto
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
    api_instance = contacts_api.ContactsApi(api_client)

    full_name = "fullName_example" # str | Filter results on fullName (optional)
    email_address = "emailAddress_example" # str | Filter results on emailAddress (optional)
    identifier = "identifier_example" # str | Filter results on identifier (optional)
    employer_name = "employerName_example" # str | Filter results on employerName (optional)
    custom_field_values = False # bool | Includes custom field values in response if true (optional) (default to False)
    search = "search_example" # str | Filter results on the combination of fullName, emailAddress, identifier and employerName (optional)
    sort = "sort_example" # str |  (optional)
    include_last_meeting_date = False # bool | If true, returns when they were last tagged as an attendee in an IRN meeting (optional) (default to False)
    limit = 0 # int | Restrict number of records returned (optional) (default to 0)

    try:
        # Get list of all contacts in your group along with some of their standard field data
        api_response = api_instance.get_contacts(full_name=full_name, email_address=email_address, identifier=identifier, employer_name=employer_name, custom_field_values=custom_field_values, search=search, sort=sort, include_last_meeting_date=include_last_meeting_date, limit=limit)
        pprint(api_response)

    except fds.sdk.IRNContacts.ApiException as e:
        print("Exception when calling ContactsApi->get_contacts: %s\n" % e)
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

# **patch_contact**
> patch_contact(contact_id)

Edit a contact’s standard field and custom field data

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.IRNContacts
from fds.sdk.IRNContacts.api import contacts_api
from fds.sdk.IRNContacts.model.problem_details import ProblemDetails
from fds.sdk.IRNContacts.model.operation import Operation
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
    api_instance = contacts_api.ContactsApi(api_client)

    contact_id = "contactId_example" # str | contactId to update associated record
    operation = [
        Operation(
            operation_type=OperationType(0),
            path="path_example",
            op="op_example",
            _from="_from_example",
            value=None,
        ),
    ] # [Operation] | contactSaveDtoPatch object to update (optional)

    try:
        # Edit a contact’s standard field and custom field data
        api_instance.patch_contact(contact_id, operation=operation)
    except fds.sdk.IRNContacts.ApiException as e:
        print("Exception when calling ContactsApi->patch_contact: %s\n" % e)
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

