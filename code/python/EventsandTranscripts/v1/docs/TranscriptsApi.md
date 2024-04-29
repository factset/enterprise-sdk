# fds.sdk.EventsandTranscripts.TranscriptsApi

All URIs are relative to *https://api.factset.com/events/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_timezone**](TranscriptsApi.md#get_timezone) | **GET** /reference/time-zones | Returns the time zones.
[**get_transcripts**](TranscriptsApi.md#get_transcripts) | **GET** /transcripts/search | Returns the transcript documents in XML format and related metadata within FactSet coverage based on search text.
[**get_transcripts_dates**](TranscriptsApi.md#get_transcripts_dates) | **GET** /transcripts/dates | Returns the transcript documents in XML format and related metadata within FactSet coverage based on specific date range and time zones.
[**get_transcripts_events**](TranscriptsApi.md#get_transcripts_events) | **GET** /transcripts/events | Returns the transcript documents in XML format and related metadata within FactSet coverage based on eventIds and eventType.
[**get_transcripts_ids**](TranscriptsApi.md#get_transcripts_ids) | **GET** /transcripts/ids | Returns the transcript documents in XML format and related metadata within FactSet coverage based on specific IDs.
[**getcategories**](TranscriptsApi.md#getcategories) | **GET** /reference/categories | Returns the categories.



# **get_timezone**
> ResponseTime get_timezone()

Returns the time zones.

Retrieves and delivers a comprehensive list of all available `timeZones`.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.EventsandTranscripts
from fds.sdk.EventsandTranscripts.api import transcripts_api
from fds.sdk.EventsandTranscripts.models import *
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
configuration = fds.sdk.EventsandTranscripts.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.EventsandTranscripts.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.EventsandTranscripts.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = transcripts_api.TranscriptsApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.

    try:
        # Returns the time zones.
        # example, this endpoint has no required or optional parameters
        api_response = api_instance.get_timezone()

        pprint(api_response)

    except fds.sdk.EventsandTranscripts.ApiException as e:
        print("Exception when calling TranscriptsApi->get_timezone: %s\n" % e)
```


### Parameters
This endpoint does not need any parameter.

### Return type

[**ResponseTime**](ResponseTime.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List of all available time zones. |  -  |
**400** | Bad request. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_transcripts**
> Transcripts get_transcripts()

Returns the transcript documents in XML format and related metadata within FactSet coverage based on search text.

Returns the transcripts documents within FactSet coverage along with other response fields.   All transcripts originate from Factset Callstreet Transcripts. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.EventsandTranscripts
from fds.sdk.EventsandTranscripts.api import transcripts_api
from fds.sdk.EventsandTranscripts.models import *
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
configuration = fds.sdk.EventsandTranscripts.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.EventsandTranscripts.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.EventsandTranscripts.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = transcripts_api.TranscriptsApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    search_text = "Updates" # str | Restricts the search to include only document stories which include the text searched. (optional)
    sort = ["-storyDateTime"] # [str] | Enables sorting data in ascending or descending chronological order based on eventDate.  (optional) if omitted the server will use the default value of ["-storyDateTime"]
    pagination_limit = 20 # int | Number of results to return per page. (optional) if omitted the server will use the default value of 25
    pagination_offset = 0 # int | Page number of the results to return. (optional) if omitted the server will use the default value of 0

    try:
        # Returns the transcript documents in XML format and related metadata within FactSet coverage based on search text.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_transcripts(search_text=search_text, sort=sort, pagination_limit=pagination_limit, pagination_offset=pagination_offset)

        pprint(api_response)

    except fds.sdk.EventsandTranscripts.ApiException as e:
        print("Exception when calling TranscriptsApi->get_transcripts: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **search_text** | **str**| Restricts the search to include only document stories which include the text searched. | [optional]
 **sort** | **[str]**| Enables sorting data in ascending or descending chronological order based on eventDate.  | [optional] if omitted the server will use the default value of ["-storyDateTime"]
 **pagination_limit** | **int**| Number of results to return per page. | [optional] if omitted the server will use the default value of 25
 **pagination_offset** | **int**| Page number of the results to return. | [optional] if omitted the server will use the default value of 0

### Return type

[**Transcripts**](Transcripts.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The latest transcripts based on the provided search text. |  -  |
**400** | Bad request |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_transcripts_dates**
> Transcripts get_transcripts_dates()

Returns the transcript documents in XML format and related metadata within FactSet coverage based on specific date range and time zones.

Returns the transcripts documents within FactSet coverage along with other response fields.   All transcripts originate from Factset Callstreet Transcripts. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.EventsandTranscripts
from fds.sdk.EventsandTranscripts.api import transcripts_api
from fds.sdk.EventsandTranscripts.models import *
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
configuration = fds.sdk.EventsandTranscripts.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.EventsandTranscripts.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.EventsandTranscripts.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = transcripts_api.TranscriptsApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    start_date = dateutil_parser('2020-10-01').date() # date | Start Date. Format is YYYY-MM-DD    **The API supports data from 1999 onwards. Ensure that the provided Date falls within this range for accurate results.**  (optional)
    end_date = dateutil_parser('2020-12-26').date() # date | End Date. Format is YYYY-MM-DD. (optional)
    start_date_relative = 1 # int | The earliest date of the feed file the API should fetch based on the file timestamp.  - Format: Specify the date using a relative term as an integer: '0' for today, '-1' for yesterday, '-2' for two days ago, and so forth. Negative values are used to represent past dates.   - *Either `startDate` or `startDateRelative` should be used, but not both.* - *If both `startDate` and `startDateRelative` are provided in the same request, the API will return an error.* - *If users provide future dates in requests for `startDate` or `startDateRelative`, the API will not return any data.*  (optional)
    end_date_relative = 1 # int | The latest date of the feed file the API should fetch for based on the file timestamp.  - Format: Specify the date using a relative term as an integer: '0' for today, '-1' for yesterday, '-2' for two days ago, and so forth. Negative values are used to represent past dates.   - *Either `endDate` or `endDateRelative` should be used, but not both.* - *If both `endDate` and `endDateRelative` are provided in the same request, the API will return an error.* - *If users provide future dates in requests for `endDate` or `endDateRelative`, the API will not return any data.*  (optional)
    time_zone = "America/New_York" # str | timeZone to return story dates and times.Time zones, represented in POSIX format, are automatically adjusted for daylight savings. timeZone names are sourced from the IANA timezone registry. The time fields in the response will adhere to this specified timezone. (optional) if omitted the server will use the default value of "America/New_York"
    sort = ["-storyDateTime"] # [str] | Enables sorting data in ascending or descending chronological order based on eventDate.  (optional) if omitted the server will use the default value of ["-storyDateTime"]
    pagination_limit = 20 # int | Number of results to return per page. (optional) if omitted the server will use the default value of 25
    pagination_offset = 0 # int | Page number of the results to return. (optional) if omitted the server will use the default value of 0

    try:
        # Returns the transcript documents in XML format and related metadata within FactSet coverage based on specific date range and time zones.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_transcripts_dates(start_date=start_date, end_date=end_date, start_date_relative=start_date_relative, end_date_relative=end_date_relative, time_zone=time_zone, sort=sort, pagination_limit=pagination_limit, pagination_offset=pagination_offset)

        pprint(api_response)

    except fds.sdk.EventsandTranscripts.ApiException as e:
        print("Exception when calling TranscriptsApi->get_transcripts_dates: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start_date** | **date**| Start Date. Format is YYYY-MM-DD    **The API supports data from 1999 onwards. Ensure that the provided Date falls within this range for accurate results.**  | [optional]
 **end_date** | **date**| End Date. Format is YYYY-MM-DD. | [optional]
 **start_date_relative** | **int**| The earliest date of the feed file the API should fetch based on the file timestamp.  - Format: Specify the date using a relative term as an integer: &#39;0&#39; for today, &#39;-1&#39; for yesterday, &#39;-2&#39; for two days ago, and so forth. Negative values are used to represent past dates.   - *Either &#x60;startDate&#x60; or &#x60;startDateRelative&#x60; should be used, but not both.* - *If both &#x60;startDate&#x60; and &#x60;startDateRelative&#x60; are provided in the same request, the API will return an error.* - *If users provide future dates in requests for &#x60;startDate&#x60; or &#x60;startDateRelative&#x60;, the API will not return any data.*  | [optional]
 **end_date_relative** | **int**| The latest date of the feed file the API should fetch for based on the file timestamp.  - Format: Specify the date using a relative term as an integer: &#39;0&#39; for today, &#39;-1&#39; for yesterday, &#39;-2&#39; for two days ago, and so forth. Negative values are used to represent past dates.   - *Either &#x60;endDate&#x60; or &#x60;endDateRelative&#x60; should be used, but not both.* - *If both &#x60;endDate&#x60; and &#x60;endDateRelative&#x60; are provided in the same request, the API will return an error.* - *If users provide future dates in requests for &#x60;endDate&#x60; or &#x60;endDateRelative&#x60;, the API will not return any data.*  | [optional]
 **time_zone** | **str**| timeZone to return story dates and times.Time zones, represented in POSIX format, are automatically adjusted for daylight savings. timeZone names are sourced from the IANA timezone registry. The time fields in the response will adhere to this specified timezone. | [optional] if omitted the server will use the default value of "America/New_York"
 **sort** | **[str]**| Enables sorting data in ascending or descending chronological order based on eventDate.  | [optional] if omitted the server will use the default value of ["-storyDateTime"]
 **pagination_limit** | **int**| Number of results to return per page. | [optional] if omitted the server will use the default value of 25
 **pagination_offset** | **int**| Page number of the results to return. | [optional] if omitted the server will use the default value of 0

### Return type

[**Transcripts**](Transcripts.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The latest transcripts based on the provided date ranges. |  -  |
**400** | Bad request |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_transcripts_events**
> Transcripts get_transcripts_events()

Returns the transcript documents in XML format and related metadata within FactSet coverage based on eventIds and eventType.

Returns the transcripts documents within FactSet coverage along with other response fields.   All transcripts originate from Factset Callstreet Transcripts. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.EventsandTranscripts
from fds.sdk.EventsandTranscripts.api import transcripts_api
from fds.sdk.EventsandTranscripts.models import *
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
configuration = fds.sdk.EventsandTranscripts.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.EventsandTranscripts.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.EventsandTranscripts.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = transcripts_api.TranscriptsApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    event_ids = ["1202993804"] # [str] | Requests Event IDs. This is a comma-separated list with a maximum limit of 1000. (optional)
    event_type = "Earnings" # str | Specifies the type of event you want to retrieve.   Earnings - Denotes an Earnings event.   Guidance - Denotes a Guidance event.   AnalystsShareholdersMeeting - Denotes an Analysts and Shareholders Meeting event.   ConferencePresentation - Denotes a Conference Presentation event.   SalesRevenue - Denotes a Sales/Revenue event.   SpecialSituation - Denotes a Special Situation event (i.e. Merger/Acquisition). (optional)
    sort = ["-storyDateTime"] # [str] | Enables sorting data in ascending or descending chronological order based on eventDate.  (optional) if omitted the server will use the default value of ["-storyDateTime"]
    pagination_limit = 20 # int | Number of results to return per page. (optional) if omitted the server will use the default value of 25
    pagination_offset = 0 # int | Page number of the results to return. (optional) if omitted the server will use the default value of 0

    try:
        # Returns the transcript documents in XML format and related metadata within FactSet coverage based on eventIds and eventType.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_transcripts_events(event_ids=event_ids, event_type=event_type, sort=sort, pagination_limit=pagination_limit, pagination_offset=pagination_offset)

        pprint(api_response)

    except fds.sdk.EventsandTranscripts.ApiException as e:
        print("Exception when calling TranscriptsApi->get_transcripts_events: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **event_ids** | **[str]**| Requests Event IDs. This is a comma-separated list with a maximum limit of 1000. | [optional]
 **event_type** | **str**| Specifies the type of event you want to retrieve.   Earnings - Denotes an Earnings event.   Guidance - Denotes a Guidance event.   AnalystsShareholdersMeeting - Denotes an Analysts and Shareholders Meeting event.   ConferencePresentation - Denotes a Conference Presentation event.   SalesRevenue - Denotes a Sales/Revenue event.   SpecialSituation - Denotes a Special Situation event (i.e. Merger/Acquisition). | [optional]
 **sort** | **[str]**| Enables sorting data in ascending or descending chronological order based on eventDate.  | [optional] if omitted the server will use the default value of ["-storyDateTime"]
 **pagination_limit** | **int**| Number of results to return per page. | [optional] if omitted the server will use the default value of 25
 **pagination_offset** | **int**| Page number of the results to return. | [optional] if omitted the server will use the default value of 0

### Return type

[**Transcripts**](Transcripts.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The latest transcripts based on the provided event IDs and event type. |  -  |
**400** | Bad request |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_transcripts_ids**
> TranscriptsOne get_transcripts_ids()

Returns the transcript documents in XML format and related metadata within FactSet coverage based on specific IDs.

Returns the transcripts documents within FactSet coverage along with other response fields.   All transcripts originate from Factset Callstreet Transcripts. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.EventsandTranscripts
from fds.sdk.EventsandTranscripts.api import transcripts_api
from fds.sdk.EventsandTranscripts.models import *
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
configuration = fds.sdk.EventsandTranscripts.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.EventsandTranscripts.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.EventsandTranscripts.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = transcripts_api.TranscriptsApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    primary_id = False # bool | Type of identifier search * true - Returns headlines of stories that have the searched identifier(s) as the primary  identifier. * false - Returns headlines of stories that mentioned or referred to the  identifier. (optional) if omitted the server will use the default value of False
    ids = ["RTO-GB"] # [str] | Requested symbols or securities.  This is a comma-separated list with a maximum limit of 1000.  Each symbol can be a FactSet exchange symbol, CUSIP, or SEDOL. (optional)
    report_ids = ["3022837"] # [str] | Requests Report IDs. This is a comma-separated list with a maximum limit of 1000 (optional)
    categories = ["CN:GB"] # [str] | Code for categories to include. This is a comma-separated list.which represent country, industry, and subject codes. Use the ```/reference/categories``` endpoint to get the list of available categories.  Default = All categories. (optional)
    sort = ["-storyDateTime"] # [str] | Enables sorting data in ascending or descending chronological order based on eventDate.  (optional) if omitted the server will use the default value of ["-storyDateTime"]
    pagination_limit = 20 # int | Number of results to return per page. (optional) if omitted the server will use the default value of 25
    pagination_offset = 0 # int | Page number of the results to return. (optional) if omitted the server will use the default value of 0

    try:
        # Returns the transcript documents in XML format and related metadata within FactSet coverage based on specific IDs.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_transcripts_ids(primary_id=primary_id, ids=ids, report_ids=report_ids, categories=categories, sort=sort, pagination_limit=pagination_limit, pagination_offset=pagination_offset)

        pprint(api_response)

    except fds.sdk.EventsandTranscripts.ApiException as e:
        print("Exception when calling TranscriptsApi->get_transcripts_ids: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **primary_id** | **bool**| Type of identifier search * true - Returns headlines of stories that have the searched identifier(s) as the primary  identifier. * false - Returns headlines of stories that mentioned or referred to the  identifier. | [optional] if omitted the server will use the default value of False
 **ids** | **[str]**| Requested symbols or securities.  This is a comma-separated list with a maximum limit of 1000.  Each symbol can be a FactSet exchange symbol, CUSIP, or SEDOL. | [optional]
 **report_ids** | **[str]**| Requests Report IDs. This is a comma-separated list with a maximum limit of 1000 | [optional]
 **categories** | **[str]**| Code for categories to include. This is a comma-separated list.which represent country, industry, and subject codes. Use the &#x60;&#x60;&#x60;/reference/categories&#x60;&#x60;&#x60; endpoint to get the list of available categories.  Default &#x3D; All categories. | [optional]
 **sort** | **[str]**| Enables sorting data in ascending or descending chronological order based on eventDate.  | [optional] if omitted the server will use the default value of ["-storyDateTime"]
 **pagination_limit** | **int**| Number of results to return per page. | [optional] if omitted the server will use the default value of 25
 **pagination_offset** | **int**| Page number of the results to return. | [optional] if omitted the server will use the default value of 0

### Return type

[**TranscriptsOne**](TranscriptsOne.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The latest transcripts based on the provided report ID, IDs and primary ID. |  -  |
**400** | Bad request |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getcategories**
> ResponseCategories getcategories()

Returns the categories.

Retrieves and delivers a comprehensive list of all available `categories`which are defined as country, industry, and subject codes. The data is returned as a comma-separated list.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.EventsandTranscripts
from fds.sdk.EventsandTranscripts.api import transcripts_api
from fds.sdk.EventsandTranscripts.models import *
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
configuration = fds.sdk.EventsandTranscripts.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.EventsandTranscripts.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.EventsandTranscripts.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = transcripts_api.TranscriptsApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.

    try:
        # Returns the categories.
        # example, this endpoint has no required or optional parameters
        api_response = api_instance.getcategories()

        pprint(api_response)

    except fds.sdk.EventsandTranscripts.ApiException as e:
        print("Exception when calling TranscriptsApi->getcategories: %s\n" % e)
```


### Parameters
This endpoint does not need any parameter.

### Return type

[**ResponseCategories**](ResponseCategories.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | list of all available categories. |  -  |
**400** | Bad request. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

