# fds.sdk.IRNMeetings.MeetingsApi

All URIs are relative to *https://api.factset.com/research/irn*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_meeting**](MeetingsApi.md#create_meeting) | **POST** /v1/meetings | Create a meeting
[**delete_meeting**](MeetingsApi.md#delete_meeting) | **DELETE** /v1/meetings/{meetingId} | Delete a Meeting
[**get_meeting**](MeetingsApi.md#get_meeting) | **GET** /v1/meetings/{meetingId} | Get details of a meeting
[**get_meetings**](MeetingsApi.md#get_meetings) | **GET** /v1/meetings | Get all the meetings in the specified date range filtered on the given identifiers
[**update_meeting**](MeetingsApi.md#update_meeting) | **PUT** /v1/meetings/{meetingId} | Update meeting


# **create_meeting**
> NewItemDto create_meeting()

Create a meeting

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.IRNMeetings
from fds.sdk.IRNMeetings.api import meetings_api
from fds.sdk.IRNMeetings.models import *
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
configuration = fds.sdk.IRNMeetings.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.IRNMeetings.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.IRNMeetings.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = meetings_api.MeetingsApi(api_client)

    create_meeting_dto = CreateMeetingDto(
        author=UserSerialDto(
            username="username_example",
            serial_number="serial_number_example",
        ),
        title="title_example",
        identifier="identifier_example",
        start="start_example",
        end="end_example",
        locations=[
            "locations_example",
        ],
        organizer="organizer_example",
        organizer_id="organizer_id_example",
        attendees=[
            ReferenceAttendeeDto(
                email_address="email_address_example",
            ),
        ],
        alert_attendees=False,
        alert_author=False,
        related_records=RelatedRecordsDto(
            note_ids=[
                "note_ids_example",
            ],
            meeting_ids=[
                "meeting_ids_example",
            ],
        ),
        related_contacts=[
            "related_contacts_example",
        ],
        related_symbols=[
            "related_symbols_example",
        ],
        body=CreateBodyDto(
            content="content_example",
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
    ) # CreateMeetingDto | Note: The organizer property is deprecated in favor of organizerId (optional)

    try:
        # Create a meeting
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.create_meeting(create_meeting_dto=create_meeting_dto)
        pprint(api_response)

    except fds.sdk.IRNMeetings.ApiException as e:
        print("Exception when calling MeetingsApi->create_meeting: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **create_meeting_dto** | [**CreateMeetingDto**](CreateMeetingDto.md)| Note: The organizer property is deprecated in favor of organizerId | [optional]

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
**201** | Success - Returns unique identifier of the meeting created |  -  |
**400** | Bad Request |  -  |
**0** | Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_meeting**
> delete_meeting(meeting_id)

Delete a Meeting

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.IRNMeetings
from fds.sdk.IRNMeetings.api import meetings_api
from fds.sdk.IRNMeetings.models import *
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
configuration = fds.sdk.IRNMeetings.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.IRNMeetings.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.IRNMeetings.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = meetings_api.MeetingsApi(api_client)

    meeting_id = "meetingId_example" # str | 

    try:
        # Delete a Meeting
        # example passing only required values which don't have defaults set
        api_instance.delete_meeting(meeting_id)

    except fds.sdk.IRNMeetings.ApiException as e:
        print("Exception when calling MeetingsApi->delete_meeting: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **meeting_id** | **str**|  |

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

# **get_meeting**
> MeetingDto get_meeting(meeting_id)

Get details of a meeting

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.IRNMeetings
from fds.sdk.IRNMeetings.api import meetings_api
from fds.sdk.IRNMeetings.models import *
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
configuration = fds.sdk.IRNMeetings.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.IRNMeetings.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.IRNMeetings.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = meetings_api.MeetingsApi(api_client)

    meeting_id = "meetingId_example" # str | Meeting Id

    try:
        # Get details of a meeting
        # example passing only required values which don't have defaults set
        api_response = api_instance.get_meeting(meeting_id)
        pprint(api_response)

    except fds.sdk.IRNMeetings.ApiException as e:
        print("Exception when calling MeetingsApi->get_meeting: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **meeting_id** | **str**| Meeting Id |

### Return type

[**MeetingDto**](MeetingDto.md)

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

# **get_meetings**
> [MeetingSummaryDto] get_meetings()

Get all the meetings in the specified date range filtered on the given identifiers

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.IRNMeetings
from fds.sdk.IRNMeetings.api import meetings_api
from fds.sdk.IRNMeetings.models import *
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
configuration = fds.sdk.IRNMeetings.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.IRNMeetings.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.IRNMeetings.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = meetings_api.MeetingsApi(api_client)

    start = "start_example" # str | StartDate (optional)
    end = "end_example" # str | EndDate (optional)
    identifiers = [
        "identifiers_example",
    ] # [str] | Set of identifiers to filter on (optional)
    limit = 1 # int | Limit on the number of meetings retrieved (optional)
    modified_since = "modifiedSince_example" # str | Only return meetings which have been modified or created since a particular time (optional)
    x_irn_include_deleted = False # bool | Includes deleted meetings in results when set to true (optional) if omitted the server will use the default value of False

    try:
        # Get all the meetings in the specified date range filtered on the given identifiers
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_meetings(start=start, end=end, identifiers=identifiers, limit=limit, modified_since=modified_since, x_irn_include_deleted=x_irn_include_deleted)
        pprint(api_response)

    except fds.sdk.IRNMeetings.ApiException as e:
        print("Exception when calling MeetingsApi->get_meetings: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start** | **str**| StartDate | [optional]
 **end** | **str**| EndDate | [optional]
 **identifiers** | **[str]**| Set of identifiers to filter on | [optional]
 **limit** | **int**| Limit on the number of meetings retrieved | [optional]
 **modified_since** | **str**| Only return meetings which have been modified or created since a particular time | [optional]
 **x_irn_include_deleted** | **bool**| Includes deleted meetings in results when set to true | [optional] if omitted the server will use the default value of False

### Return type

[**[MeetingSummaryDto]**](MeetingSummaryDto.md)

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

# **update_meeting**
> update_meeting(meeting_id)

Update meeting

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.IRNMeetings
from fds.sdk.IRNMeetings.api import meetings_api
from fds.sdk.IRNMeetings.models import *
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
configuration = fds.sdk.IRNMeetings.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.IRNMeetings.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.IRNMeetings.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = meetings_api.MeetingsApi(api_client)

    meeting_id = "meetingId_example" # str | Meeting Id
    update_meeting_dto = UpdateMeetingDto(
        title="title_example",
        identifier="identifier_example",
        start="start_example",
        end="end_example",
        locations=[
            "locations_example",
        ],
        organizer="organizer_example",
        organizer_id="organizer_id_example",
        attendees=[
            ReferenceAttendeeDto(
                email_address="email_address_example",
            ),
        ],
        alert_attendees=False,
        alert_author=False,
        related_records=RelatedRecordsDto(
            note_ids=[
                "note_ids_example",
            ],
            meeting_ids=[
                "meeting_ids_example",
            ],
        ),
        related_contacts=[
            "related_contacts_example",
        ],
        related_symbols=[
            "related_symbols_example",
        ],
        body=CreateBodyDto(
            content="content_example",
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
    ) # UpdateMeetingDto | Meeting details to update. Note: The organizer property is deprecated in favor of organizerId (optional)

    try:
        # Update meeting
        # example passing only required values which don't have defaults set
        # and optional values
        api_instance.update_meeting(meeting_id, update_meeting_dto=update_meeting_dto)

    except fds.sdk.IRNMeetings.ApiException as e:
        print("Exception when calling MeetingsApi->update_meeting: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **meeting_id** | **str**| Meeting Id |
 **update_meeting_dto** | [**UpdateMeetingDto**](UpdateMeetingDto.md)| Meeting details to update. Note: The organizer property is deprecated in favor of organizerId | [optional]

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

