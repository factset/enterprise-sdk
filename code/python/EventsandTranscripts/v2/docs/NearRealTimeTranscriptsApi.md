# fds.sdk.EventsandTranscripts.NearRealTimeTranscriptsApi

All URIs are relative to *https://api.factset.com/content/events/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_indexed_nrt**](NearRealTimeTranscriptsApi.md#get_indexed_nrt) | **GET** /nrt/indexed | Returns the  indexed transcript data  in small increments throughout the duration of an active call.
[**get_speaker_ids**](NearRealTimeTranscriptsApi.md#get_speaker_ids) | **GET** /nrt/speaker-ids | Returns the latest speakerIds with the confidence scores generated for an active call.
[**search_nrt_calls**](NearRealTimeTranscriptsApi.md#search_nrt_calls) | **POST** /nrt/calls | Returns the active calls happening at the moment based on ticker/entity or specific IDs.



# **get_indexed_nrt**
> IndexedNrtResponse get_indexed_nrt(audio_source_id)

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
    pagination_offset = 0 # int | Specifies the starting point for pagination. This parameter is used to identify the beginning of the next set of results. (optional) if omitted the server will use the default value of 0

    try:
        # Returns the  indexed transcript data  in small increments throughout the duration of an active call.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_indexed_nrt(audio_source_id, pagination_limit=pagination_limit, pagination_offset=pagination_offset)

        pprint(api_response)

    except fds.sdk.EventsandTranscripts.ApiException as e:
        print("Exception when calling NearRealTimeTranscriptsApi->get_indexed_nrt: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **audio_source_id** | **int**| Unique ID for an Internal recording specific to reportID. For example, ReportID X would have multiple recordings from different source (dial-in or webcast). One ReportID can have multiple AudioSourceIDs. |
 **pagination_limit** | **int**| Number of results to return per page. | [optional] if omitted the server will use the default value of 25
 **pagination_offset** | **int**| Specifies the starting point for pagination. This parameter is used to identify the beginning of the next set of results. | [optional] if omitted the server will use the default value of 0

### Return type

[**IndexedNrtResponse**](IndexedNrtResponse.md)

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

# **get_speaker_ids**
> NrtSpeakerIdsResponse get_speaker_ids(audio_source_id)

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
    pagination_offset = 0 # int | Specifies the starting point for pagination. This parameter is used to identify the beginning of the next set of results. (optional) if omitted the server will use the default value of 0

    try:
        # Returns the latest speakerIds with the confidence scores generated for an active call.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_speaker_ids(audio_source_id, sort=sort, pagination_limit=pagination_limit, pagination_offset=pagination_offset)

        pprint(api_response)

    except fds.sdk.EventsandTranscripts.ApiException as e:
        print("Exception when calling NearRealTimeTranscriptsApi->get_speaker_ids: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **audio_source_id** | **int**| Unique ID for an Internal recording specific to reportID. For example, ReportID X would have multiple recordings from different source (dial-in or webcast). One ReportID can have multiple AudioSourceIDs. |
 **sort** | **[str]**| Enables sorting data in ascending or descending chronological order based on the start offset of the speaker.  | [optional] if omitted the server will use the default value of ["-speakerStartOffset"]
 **pagination_limit** | **int**| Number of results to return per page. | [optional] if omitted the server will use the default value of 25
 **pagination_offset** | **int**| Specifies the starting point for pagination. This parameter is used to identify the beginning of the next set of results. | [optional] if omitted the server will use the default value of 0

### Return type

[**NrtSpeakerIdsResponse**](NrtSpeakerIdsResponse.md)

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

# **search_nrt_calls**
> NrtCallsResponse search_nrt_calls(nrt_calls_request)

Returns the active calls happening at the moment based on ticker/entity or specific IDs.

Retrieves active Near Real-Time (NRT) calls based on either ticker/entity/status criteria or specific audio source/report IDs. Use the appropriate parameters within the `data` object of the request body to specify the search method. Pagination and sorting are controlled via the `meta` object. 

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
    nrt_calls_request = NrtCallsRequest(
        data=NrtCallsRequestData(),
        meta=NrtCallsRequestMeta(
            pagination=TranscriptsRequestMetaPagination(
                limit=25,
                offset=0,
            ),
            sort=["-eventDatetime"],
        ),
    ) # NrtCallsRequest | Criteria to search for NRT calls. Select one mode of search.

    try:
        # Returns the active calls happening at the moment based on ticker/entity or specific IDs.
        # example passing only required values which don't have defaults set
        api_response = api_instance.search_nrt_calls(nrt_calls_request)

        pprint(api_response)

    except fds.sdk.EventsandTranscripts.ApiException as e:
        print("Exception when calling NearRealTimeTranscriptsApi->search_nrt_calls: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nrt_calls_request** | [**NrtCallsRequest**](NrtCallsRequest.md)| Criteria to search for NRT calls. Select one mode of search. |

### Return type

[**NrtCallsResponse**](NrtCallsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The active calls happening at the moment, matching the specified criteria. |  -  |
**400** | Bad Request |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses.  |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization.  |  -  |
**500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

