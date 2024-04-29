# fds.sdk.EventsandTranscripts.NearRealTimeTranscriptsApi

All URIs are relative to *https://api.factset.com/events/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_bulk_documents_nrt_v1_calls**](NearRealTimeTranscriptsApi.md#get_bulk_documents_nrt_v1_calls) | **GET** /nrt/by-ticker | Returns the active calls happening at the moment based on ticker,call status and entity ID.
[**get_bulk_documents_nrt_v1_calls_by_audio_source_id**](NearRealTimeTranscriptsApi.md#get_bulk_documents_nrt_v1_calls_by_audio_source_id) | **GET** /nrt/by-ids | Returns the active calls happening at the moment based on audio source ID and report ID.
[**get_bulk_documents_nrt_v1_indexedrt**](NearRealTimeTranscriptsApi.md#get_bulk_documents_nrt_v1_indexedrt) | **GET** /nrt/indexed | Returns the  indexed transcript data  in small increments throughout the duration of an active call.
[**get_bulk_documents_nrt_v1_speaker_ids**](NearRealTimeTranscriptsApi.md#get_bulk_documents_nrt_v1_speaker_ids) | **GET** /nrt/speakerids | Returns the latest speakerIds with the confidence scores generated for an active call.



# **get_bulk_documents_nrt_v1_calls**
> NrtCalls get_bulk_documents_nrt_v1_calls()

Returns the active calls happening at the moment based on ticker,call status and entity ID.

Returns the active calls happening at the moment

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.EventsandTranscripts
from fds.sdk.EventsandTranscripts.api import near_real_time_transcripts_api
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
    api_instance = near_real_time_transcripts_api.NearRealTimeTranscriptsApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    ticker = "AZZ-US" # str | Ticker-region identifier for the company hosting the event. (optional)
    entity_id = "000CGP-E" # str | Factset entity level identifier for the company hosting the event. (optional)
    call_status = "Ended" # str | Status of the call, i.e., Ended, InProgress, EndedWithoutNotification, or IssueAtSource. (optional)
    sort = ["-eventDatetimeUtc"] # [str] | Enables sorting data in ascending or descending chronological order based on eventDatetimeUtc.  (optional) if omitted the server will use the default value of ["-eventDatetimeUtc"]
    pagination_limit = 20 # int | Number of results to return per page. (optional) if omitted the server will use the default value of 25
    pagination_offset = 0 # int | Page number of the results to return. (optional) if omitted the server will use the default value of 0

    try:
        # Returns the active calls happening at the moment based on ticker,call status and entity ID.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_bulk_documents_nrt_v1_calls(ticker=ticker, entity_id=entity_id, call_status=call_status, sort=sort, pagination_limit=pagination_limit, pagination_offset=pagination_offset)

        pprint(api_response)

    except fds.sdk.EventsandTranscripts.ApiException as e:
        print("Exception when calling NearRealTimeTranscriptsApi->get_bulk_documents_nrt_v1_calls: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ticker** | **str**| Ticker-region identifier for the company hosting the event. | [optional]
 **entity_id** | **str**| Factset entity level identifier for the company hosting the event. | [optional]
 **call_status** | **str**| Status of the call, i.e., Ended, InProgress, EndedWithoutNotification, or IssueAtSource. | [optional]
 **sort** | **[str]**| Enables sorting data in ascending or descending chronological order based on eventDatetimeUtc.  | [optional] if omitted the server will use the default value of ["-eventDatetimeUtc"]
 **pagination_limit** | **int**| Number of results to return per page. | [optional] if omitted the server will use the default value of 25
 **pagination_offset** | **int**| Page number of the results to return. | [optional] if omitted the server will use the default value of 0

### Return type

[**NrtCalls**](NrtCalls.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The active calls happening at the moment, based on the provided ticker, call status, and entity ID. |  -  |
**400** | Bad Request |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses.  |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization.  |  -  |
**500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_bulk_documents_nrt_v1_calls_by_audio_source_id**
> NrtCalls get_bulk_documents_nrt_v1_calls_by_audio_source_id()

Returns the active calls happening at the moment based on audio source ID and report ID.

Returns the active calls happening at the moment

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.EventsandTranscripts
from fds.sdk.EventsandTranscripts.api import near_real_time_transcripts_api
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
    api_instance = near_real_time_transcripts_api.NearRealTimeTranscriptsApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    audio_source_id = 471849 # int | Unique ID for an Internal recording specific to reportID. For example, ReportID X would have multiple recordings from different source (dial-in or webcast). One ReportID can have multiple AudioSourceIDs. (optional)
    report_id = 2683372 # int | Unique identifier for an event. (optional)
    sort = ["-eventDatetimeUtc"] # [str] | Enables sorting data in ascending or descending chronological order based on eventDatetimeUtc.  (optional) if omitted the server will use the default value of ["-eventDatetimeUtc"]
    pagination_limit = 20 # int | Number of results to return per page. (optional) if omitted the server will use the default value of 25
    pagination_offset = 0 # int | Page number of the results to return. (optional) if omitted the server will use the default value of 0

    try:
        # Returns the active calls happening at the moment based on audio source ID and report ID.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_bulk_documents_nrt_v1_calls_by_audio_source_id(audio_source_id=audio_source_id, report_id=report_id, sort=sort, pagination_limit=pagination_limit, pagination_offset=pagination_offset)

        pprint(api_response)

    except fds.sdk.EventsandTranscripts.ApiException as e:
        print("Exception when calling NearRealTimeTranscriptsApi->get_bulk_documents_nrt_v1_calls_by_audio_source_id: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **audio_source_id** | **int**| Unique ID for an Internal recording specific to reportID. For example, ReportID X would have multiple recordings from different source (dial-in or webcast). One ReportID can have multiple AudioSourceIDs. | [optional]
 **report_id** | **int**| Unique identifier for an event. | [optional]
 **sort** | **[str]**| Enables sorting data in ascending or descending chronological order based on eventDatetimeUtc.  | [optional] if omitted the server will use the default value of ["-eventDatetimeUtc"]
 **pagination_limit** | **int**| Number of results to return per page. | [optional] if omitted the server will use the default value of 25
 **pagination_offset** | **int**| Page number of the results to return. | [optional] if omitted the server will use the default value of 0

### Return type

[**NrtCalls**](NrtCalls.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The active calls happening at the moment, based on IDs. |  -  |
**400** | Bad Request |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses.  |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization.  |  -  |
**500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_bulk_documents_nrt_v1_indexedrt**
> IndexedNrt get_bulk_documents_nrt_v1_indexedrt(audio_source_id)

Returns the  indexed transcript data  in small increments throughout the duration of an active call.

Returns the  indexed transcript data  in small increments throughout the duration of an active call.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.EventsandTranscripts
from fds.sdk.EventsandTranscripts.api import near_real_time_transcripts_api
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
    api_instance = near_real_time_transcripts_api.NearRealTimeTranscriptsApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    audio_source_id = 471849 # int | Unique ID for an Internal recording specific to reportID. For example, ReportID X would have multiple recordings from different source (dial-in or webcast). One ReportID can have multiple AudioSourceIDs.
    pagination_limit = 5 # int | Number of results to return per page. (optional) if omitted the server will use the default value of 25
    pagination_offset = 0 # int | Page number of the results to return. (optional) if omitted the server will use the default value of 0

    try:
        # Returns the  indexed transcript data  in small increments throughout the duration of an active call.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_bulk_documents_nrt_v1_indexedrt(audio_source_id, pagination_limit=pagination_limit, pagination_offset=pagination_offset)

        pprint(api_response)

    except fds.sdk.EventsandTranscripts.ApiException as e:
        print("Exception when calling NearRealTimeTranscriptsApi->get_bulk_documents_nrt_v1_indexedrt: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **audio_source_id** | **int**| Unique ID for an Internal recording specific to reportID. For example, ReportID X would have multiple recordings from different source (dial-in or webcast). One ReportID can have multiple AudioSourceIDs. |
 **pagination_limit** | **int**| Number of results to return per page. | [optional] if omitted the server will use the default value of 25
 **pagination_offset** | **int**| Page number of the results to return. | [optional] if omitted the server will use the default value of 0

### Return type

[**IndexedNrt**](IndexedNrt.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The transcript data that has been indexed according to the specific audio source ID. |  -  |
**400** | Bad Request |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses.  |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization.  |  -  |
**500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_bulk_documents_nrt_v1_speaker_ids**
> NrtSpeakerIds get_bulk_documents_nrt_v1_speaker_ids(audio_source_id)

Returns the latest speakerIds with the confidence scores generated for an active call.

Returns the latest speakerIds with the confidence scores generated for an active call.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.EventsandTranscripts
from fds.sdk.EventsandTranscripts.api import near_real_time_transcripts_api
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
    api_instance = near_real_time_transcripts_api.NearRealTimeTranscriptsApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    audio_source_id = 471849 # int | Unique ID for an Internal recording specific to reportID. For example, ReportID X would have multiple recordings from different source (dial-in or webcast). One ReportID can have multiple AudioSourceIDs.
    sort = ["-speakerStartOffset"] # [str] | Enables sorting data in ascending or descending chronological order based on the start offset of the speaker.  (optional) if omitted the server will use the default value of ["-speakerStartOffset"]
    pagination_limit = 20 # int | Number of results to return per page. (optional) if omitted the server will use the default value of 25
    pagination_offset = 0 # int | Page number of the results to return. (optional) if omitted the server will use the default value of 0

    try:
        # Returns the latest speakerIds with the confidence scores generated for an active call.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_bulk_documents_nrt_v1_speaker_ids(audio_source_id, sort=sort, pagination_limit=pagination_limit, pagination_offset=pagination_offset)

        pprint(api_response)

    except fds.sdk.EventsandTranscripts.ApiException as e:
        print("Exception when calling NearRealTimeTranscriptsApi->get_bulk_documents_nrt_v1_speaker_ids: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **audio_source_id** | **int**| Unique ID for an Internal recording specific to reportID. For example, ReportID X would have multiple recordings from different source (dial-in or webcast). One ReportID can have multiple AudioSourceIDs. |
 **sort** | **[str]**| Enables sorting data in ascending or descending chronological order based on the start offset of the speaker.  | [optional] if omitted the server will use the default value of ["-speakerStartOffset"]
 **pagination_limit** | **int**| Number of results to return per page. | [optional] if omitted the server will use the default value of 25
 **pagination_offset** | **int**| Page number of the results to return. | [optional] if omitted the server will use the default value of 0

### Return type

[**NrtSpeakerIds**](NrtSpeakerIds.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The up-to-date speaker IDs and their associated confidence scores, based on the audio source ID. |  -  |
**400** | Bad Request |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses.  |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

