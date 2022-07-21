# fds.sdk.IRNNotes.NotesApi

All URIs are relative to *https://api.factset.com/research/irn*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_note**](NotesApi.md#create_note) | **POST** /v1/notes | Create a note
[**delete_note**](NotesApi.md#delete_note) | **DELETE** /v1/notes/{noteId} | Delete a Note
[**get_note**](NotesApi.md#get_note) | **GET** /v1/notes/{noteId} | Get details of a note
[**get_notes**](NotesApi.md#get_notes) | **GET** /v1/notes | Get all the notes in the specified date range filtered on the given identifiers
[**update_note**](NotesApi.md#update_note) | **PUT** /v1/notes/{noteId} | Update a note


# **create_note**
> NewItemDto create_note(create_note_dto)

Create a note

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.IRNNotes
from fds.sdk.IRNNotes.api import notes_api
from fds.sdk.IRNNotes.models import *
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
configuration = fds.sdk.IRNNotes.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.IRNNotes.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.IRNNotes.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = notes_api.NotesApi(api_client)

    create_note_dto = CreateNoteDto(
        author=UserSerialDto(
            username="username_example",
            serial_number="serial_number_example",
        ),
        title="title_example",
        identifier="identifier_example",
        date="date_example",
        subject_id="subject_id_example",
        recommendation_id="recommendation_id_example",
        sentiment_id="sentiment_id_example",
        body=CreateBodyDto(
            content="content_example",
        ),
        source="source_example",
        link="link_example",
        related_symbols=[
            "related_symbols_example",
        ],
        related_contacts=[
            "related_contacts_example",
        ],
        related_records=RelatedRecordsDto(
            note_ids=[
                "note_ids_example",
            ],
            meeting_ids=[
                "meeting_ids_example",
            ],
        ),
        custom_field_values=[
            CreateCustomFieldValueDto(
                code="code_example",
                integer_value=1,
                text_value="text_value_example",
                file_path_value="file_path_value_example",
                numeric_value=3.14,
                date_value="date_value_example",
                extended_text_value="extended_text_value_example",
                contact_lookup_values=[
                    "contact_lookup_values_example",
                ],
                option_value="option_value_example",
                option_values=[
                    "option_values_example",
                ],
            ),
        ],
        is_personal=False,
    ) # CreateNoteDto | 
    x_irn_contributor_username = "X-IRN-Contributor-Username_example" # str |  (optional)
    x_irn_contributor_serial = "X-IRN-Contributor-Serial_example" # str |  (optional)

    try:
        # Create a note
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.create_note(create_note_dto, x_irn_contributor_username=x_irn_contributor_username, x_irn_contributor_serial=x_irn_contributor_serial)
        pprint(api_response)

    except fds.sdk.IRNNotes.ApiException as e:
        print("Exception when calling NotesApi->create_note: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **create_note_dto** | [**CreateNoteDto**](CreateNoteDto.md)|  |
 **x_irn_contributor_username** | **str**|  | [optional]
 **x_irn_contributor_serial** | **str**|  | [optional]

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
**201** | Success - Returns unique identifier of the note created |  -  |
**400** | Bad Request |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_note**
> delete_note(note_id)

Delete a Note

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.IRNNotes
from fds.sdk.IRNNotes.api import notes_api
from fds.sdk.IRNNotes.models import *
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
configuration = fds.sdk.IRNNotes.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.IRNNotes.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.IRNNotes.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = notes_api.NotesApi(api_client)

    note_id = "noteId_example" # str | 

    try:
        # Delete a Note
        # example passing only required values which don't have defaults set
        api_instance.delete_note(note_id)

    except fds.sdk.IRNNotes.ApiException as e:
        print("Exception when calling NotesApi->delete_note: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **note_id** | **str**|  |

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

# **get_note**
> NoteDto get_note(note_id)

Get details of a note

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.IRNNotes
from fds.sdk.IRNNotes.api import notes_api
from fds.sdk.IRNNotes.models import *
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
configuration = fds.sdk.IRNNotes.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.IRNNotes.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.IRNNotes.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = notes_api.NotesApi(api_client)

    note_id = "noteId_example" # str | Note Id

    try:
        # Get details of a note
        # example passing only required values which don't have defaults set
        api_response = api_instance.get_note(note_id)
        pprint(api_response)

    except fds.sdk.IRNNotes.ApiException as e:
        print("Exception when calling NotesApi->get_note: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **note_id** | **str**| Note Id |

### Return type

[**NoteDto**](NoteDto.md)

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

# **get_notes**
> [NoteSummaryDto] get_notes()

Get all the notes in the specified date range filtered on the given identifiers

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.IRNNotes
from fds.sdk.IRNNotes.api import notes_api
from fds.sdk.IRNNotes.models import *
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
configuration = fds.sdk.IRNNotes.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.IRNNotes.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.IRNNotes.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = notes_api.NotesApi(api_client)

    start = "start_example" # str | StartDate (optional)
    end = "end_example" # str | EndDate (optional)
    identifiers = [
        "identifiers_example",
    ] # [str] | Set of identifiers to filter on (optional)
    authors = [
        "authors_example",
    ] # [str] | Set of authors to filter on (optional)
    subjects = [
        "subjects_example",
    ] # [str] | Set of subjects to filter on (optional)
    recommendations = [
        "recommendations_example",
    ] # [str] | Set of recommendations to filter on (optional)
    sentiments = [
        "sentiments_example",
    ] # [str] | Set of sentiments to filter on (optional)
    limit = 1 # int | Limit on the number of notes retrieved (optional)
    offset = 1 # int | Fetch notes after the offset (optional)
    modified_since = "modifiedSince_example" # str | Only return notes which have been modified or created since a particular time (optional)
    states = [
        "states_example",
    ] # [str] | Set of states to filter on (optional)
    filter_on_related_symbols = False # bool | Include notes whose related symbols match the identifier filter (optional) if omitted the server will use the default value of False
    x_irn_include_deleted = False # bool |  (optional) if omitted the server will use the default value of False

    try:
        # Get all the notes in the specified date range filtered on the given identifiers
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_notes(start=start, end=end, identifiers=identifiers, authors=authors, subjects=subjects, recommendations=recommendations, sentiments=sentiments, limit=limit, offset=offset, modified_since=modified_since, states=states, filter_on_related_symbols=filter_on_related_symbols, x_irn_include_deleted=x_irn_include_deleted)
        pprint(api_response)

    except fds.sdk.IRNNotes.ApiException as e:
        print("Exception when calling NotesApi->get_notes: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start** | **str**| StartDate | [optional]
 **end** | **str**| EndDate | [optional]
 **identifiers** | **[str]**| Set of identifiers to filter on | [optional]
 **authors** | **[str]**| Set of authors to filter on | [optional]
 **subjects** | **[str]**| Set of subjects to filter on | [optional]
 **recommendations** | **[str]**| Set of recommendations to filter on | [optional]
 **sentiments** | **[str]**| Set of sentiments to filter on | [optional]
 **limit** | **int**| Limit on the number of notes retrieved | [optional]
 **offset** | **int**| Fetch notes after the offset | [optional]
 **modified_since** | **str**| Only return notes which have been modified or created since a particular time | [optional]
 **states** | **[str]**| Set of states to filter on | [optional]
 **filter_on_related_symbols** | **bool**| Include notes whose related symbols match the identifier filter | [optional] if omitted the server will use the default value of False
 **x_irn_include_deleted** | **bool**|  | [optional] if omitted the server will use the default value of False

### Return type

[**[NoteSummaryDto]**](NoteSummaryDto.md)

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

# **update_note**
> update_note(note_id)

Update a note

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.IRNNotes
from fds.sdk.IRNNotes.api import notes_api
from fds.sdk.IRNNotes.models import *
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
configuration = fds.sdk.IRNNotes.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.IRNNotes.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.IRNNotes.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = notes_api.NotesApi(api_client)

    note_id = "noteId_example" # str | Note Id
    update_note_dto = UpdateNoteDto(
        author=UserSerialDto(
            username="username_example",
            serial_number="serial_number_example",
        ),
        title="title_example",
        subject_id="subject_id_example",
        note_date="note_date_example",
        recommendation_id="recommendation_id_example",
        sentiment_id="sentiment_id_example",
        body=CreateBodyDto(
            content="content_example",
        ),
        source="source_example",
        link="link_example",
        related_symbols=[
            "related_symbols_example",
        ],
        related_contacts=[
            "related_contacts_example",
        ],
        related_records=RelatedRecordsDto(
            note_ids=[
                "note_ids_example",
            ],
            meeting_ids=[
                "meeting_ids_example",
            ],
        ),
        custom_field_values=[
            CreateCustomFieldValueDto(
                code="code_example",
                integer_value=1,
                text_value="text_value_example",
                file_path_value="file_path_value_example",
                numeric_value=3.14,
                date_value="date_value_example",
                extended_text_value="extended_text_value_example",
                contact_lookup_values=[
                    "contact_lookup_values_example",
                ],
                option_value="option_value_example",
                option_values=[
                    "option_values_example",
                ],
            ),
        ],
        is_personal=True,
        identifier="identifier_example",
    ) # UpdateNoteDto | Note details to update (optional)

    try:
        # Update a note
        # example passing only required values which don't have defaults set
        # and optional values
        api_instance.update_note(note_id, update_note_dto=update_note_dto)

    except fds.sdk.IRNNotes.ApiException as e:
        print("Exception when calling NotesApi->update_note: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **note_id** | **str**| Note Id |
 **update_note_dto** | [**UpdateNoteDto**](UpdateNoteDto.md)| Note details to update | [optional]

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

