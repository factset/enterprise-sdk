# fds.sdk.DocumentsDistributorCallStreetEvents.NearRealTimeTranscriptsApi

All URIs are relative to *https://api.factset.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_bulk_documents_nrt_v1_calls**](NearRealTimeTranscriptsApi.md#get_bulk_documents_nrt_v1_calls) | **GET** /bulk-documents/nrt/v1/calls | Returns the active calls happening at the moment.
[**get_bulk_documents_nrt_v1_indexed_nrt**](NearRealTimeTranscriptsApi.md#get_bulk_documents_nrt_v1_indexed_nrt) | **GET** /bulk-documents/nrt/v1/indexed-nrt | Returns the  indexed transcript data  in small increments throughout the duration of an active call.
[**get_bulk_documents_nrt_v1_list_snippets**](NearRealTimeTranscriptsApi.md#get_bulk_documents_nrt_v1_list_snippets) | **GET** /bulk-documents/nrt/v1/list-snippets | Returns the latest transcript snippets from an active call.
[**get_bulk_documents_nrt_v1_speakerids**](NearRealTimeTranscriptsApi.md#get_bulk_documents_nrt_v1_speakerids) | **GET** /bulk-documents/nrt/v1/speakerids | Returns the latest speakerIds with the confidence scores generated for an active call.



# **get_bulk_documents_nrt_v1_calls**
> NRTCalls get_bulk_documents_nrt_v1_calls()

Returns the active calls happening at the moment.

Returns the active calls happening at the moment

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.DocumentsDistributorCallStreetEvents
from fds.sdk.DocumentsDistributorCallStreetEvents.api import near_real_time_transcripts_api
from fds.sdk.DocumentsDistributorCallStreetEvents.models import *
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
configuration = fds.sdk.DocumentsDistributorCallStreetEvents.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.DocumentsDistributorCallStreetEvents.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.DocumentsDistributorCallStreetEvents.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = near_real_time_transcripts_api.NearRealTimeTranscriptsApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    pagination_limit = 5 # int | Specifies the  number of results to return per page. [ Min=0; Max=500] (optional) if omitted the server will use the default value of 200
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    pagination_offset = 0 # int | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. (optional) if omitted the server will use the default value of 0
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    audio_source_id = 471849 # int | Unique ID for an Internal recording specific to reportID. For example, ReportID X would have multiple recordings from different source (dial-in or webcast). One ReportID can have multiple AudioSourceIDs. (optional)
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    report_id = 2683372 # int | Unique identifier for an event. (optional)
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    sort = "-startDate" # str | Enables to get the data in chronological or reverse chronological order based on startDate. Results are in reverse chronological order if this parameter is not used. (optional) if omitted the server will use the default value of "-startDate"
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    entity_id = "000CGP-E" # str | Factset entity level identifier for the company hosting the event. (optional)
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    ticker = "AZZ-US" # str | Ticker-region identifier for the company hosting the event. (optional)
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    call_status = "inProgress" # str | Status of the call i.e. ended or inProgress or ewn or issueAtSource. (optional)

    try:
        # Returns the active calls happening at the moment.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_bulk_documents_nrt_v1_calls(pagination_limit=pagination_limit, pagination_offset=pagination_offset, audio_source_id=audio_source_id, report_id=report_id, sort=sort, entity_id=entity_id, ticker=ticker, call_status=call_status)

        pprint(api_response)

    except fds.sdk.DocumentsDistributorCallStreetEvents.ApiException as e:
        print("Exception when calling NearRealTimeTranscriptsApi->get_bulk_documents_nrt_v1_calls: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pagination_limit** | **int**| Specifies the  number of results to return per page. [ Min&#x3D;0; Max&#x3D;500] | [optional] if omitted the server will use the default value of 200
 **pagination_offset** | **int**| Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. | [optional] if omitted the server will use the default value of 0
 **audio_source_id** | **int**| Unique ID for an Internal recording specific to reportID. For example, ReportID X would have multiple recordings from different source (dial-in or webcast). One ReportID can have multiple AudioSourceIDs. | [optional]
 **report_id** | **int**| Unique identifier for an event. | [optional]
 **sort** | **str**| Enables to get the data in chronological or reverse chronological order based on startDate. Results are in reverse chronological order if this parameter is not used. | [optional] if omitted the server will use the default value of "-startDate"
 **entity_id** | **str**| Factset entity level identifier for the company hosting the event. | [optional]
 **ticker** | **str**| Ticker-region identifier for the company hosting the event. | [optional]
 **call_status** | **str**| Status of the call i.e. ended or inProgress or ewn or issueAtSource. | [optional]

### Return type

[**NRTCalls**](NRTCalls.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Bad Request |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_bulk_documents_nrt_v1_indexed_nrt**
> IndexedNRT get_bulk_documents_nrt_v1_indexed_nrt(audio_source_id)

Returns the  indexed transcript data  in small increments throughout the duration of an active call.

Returns the  indexed transcript data  in small increments throughout the duration of an active call.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.DocumentsDistributorCallStreetEvents
from fds.sdk.DocumentsDistributorCallStreetEvents.api import near_real_time_transcripts_api
from fds.sdk.DocumentsDistributorCallStreetEvents.models import *
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
configuration = fds.sdk.DocumentsDistributorCallStreetEvents.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.DocumentsDistributorCallStreetEvents.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.DocumentsDistributorCallStreetEvents.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = near_real_time_transcripts_api.NearRealTimeTranscriptsApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    audio_source_id = 471849 # int | Unique ID for an Internal recording specific to reportID. For example, ReportID X would have multiple recordings from different source (dial-in or webcast). One ReportID can have multiple AudioSourceIDs.
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    pagination_limit = 5 # int | Specifies the  number of results to return per page. [ Min=0; Max=50 ] (optional) if omitted the server will use the default value of 25
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    pagination_offset = 0 # int | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. (optional) if omitted the server will use the default value of 0
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    report_id = 2683372 # int | Unique identifier for an event. (optional)

    try:
        # Returns the  indexed transcript data  in small increments throughout the duration of an active call.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_bulk_documents_nrt_v1_indexed_nrt(audio_source_id, pagination_limit=pagination_limit, pagination_offset=pagination_offset, report_id=report_id)

        pprint(api_response)

    except fds.sdk.DocumentsDistributorCallStreetEvents.ApiException as e:
        print("Exception when calling NearRealTimeTranscriptsApi->get_bulk_documents_nrt_v1_indexed_nrt: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **audio_source_id** | **int**| Unique ID for an Internal recording specific to reportID. For example, ReportID X would have multiple recordings from different source (dial-in or webcast). One ReportID can have multiple AudioSourceIDs. |
 **pagination_limit** | **int**| Specifies the  number of results to return per page. [ Min&#x3D;0; Max&#x3D;50 ] | [optional] if omitted the server will use the default value of 25
 **pagination_offset** | **int**| Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. | [optional] if omitted the server will use the default value of 0
 **report_id** | **int**| Unique identifier for an event. | [optional]

### Return type

[**IndexedNRT**](IndexedNRT.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Bad Request |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_bulk_documents_nrt_v1_list_snippets**
> NRTSnippets get_bulk_documents_nrt_v1_list_snippets(audio_source_id)

Returns the latest transcript snippets from an active call.

Returns the latest snippets from an active call

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.DocumentsDistributorCallStreetEvents
from fds.sdk.DocumentsDistributorCallStreetEvents.api import near_real_time_transcripts_api
from fds.sdk.DocumentsDistributorCallStreetEvents.models import *
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
configuration = fds.sdk.DocumentsDistributorCallStreetEvents.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.DocumentsDistributorCallStreetEvents.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.DocumentsDistributorCallStreetEvents.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = near_real_time_transcripts_api.NearRealTimeTranscriptsApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    audio_source_id = 471849 # int | Unique ID for an Internal recording specific to reportID. For example, ReportID X would have multiple recordings from different source (dial-in or webcast). One ReportID can have multiple AudioSourceIDs.
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    pagination_limit = 5 # int | Specifies the  number of results to return per page. [ Min=0; Max=500] (optional) if omitted the server will use the default value of 200
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    pagination_offset = 0 # int | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. (optional) if omitted the server will use the default value of 0
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    report_id = 2683372 # int | Unique identifier for an event. (optional)

    try:
        # Returns the latest transcript snippets from an active call.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_bulk_documents_nrt_v1_list_snippets(audio_source_id, pagination_limit=pagination_limit, pagination_offset=pagination_offset, report_id=report_id)

        pprint(api_response)

    except fds.sdk.DocumentsDistributorCallStreetEvents.ApiException as e:
        print("Exception when calling NearRealTimeTranscriptsApi->get_bulk_documents_nrt_v1_list_snippets: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **audio_source_id** | **int**| Unique ID for an Internal recording specific to reportID. For example, ReportID X would have multiple recordings from different source (dial-in or webcast). One ReportID can have multiple AudioSourceIDs. |
 **pagination_limit** | **int**| Specifies the  number of results to return per page. [ Min&#x3D;0; Max&#x3D;500] | [optional] if omitted the server will use the default value of 200
 **pagination_offset** | **int**| Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. | [optional] if omitted the server will use the default value of 0
 **report_id** | **int**| Unique identifier for an event. | [optional]

### Return type

[**NRTSnippets**](NRTSnippets.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Bad Request |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_bulk_documents_nrt_v1_speakerids**
> NRTSpeakerids get_bulk_documents_nrt_v1_speakerids(audio_source_id)

Returns the latest speakerIds with the confidence scores generated for an active call.

Returns the latest speakerIds with the cosine scores(confidence scores) generated for an active call.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.DocumentsDistributorCallStreetEvents
from fds.sdk.DocumentsDistributorCallStreetEvents.api import near_real_time_transcripts_api
from fds.sdk.DocumentsDistributorCallStreetEvents.models import *
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
configuration = fds.sdk.DocumentsDistributorCallStreetEvents.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.DocumentsDistributorCallStreetEvents.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.DocumentsDistributorCallStreetEvents.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = near_real_time_transcripts_api.NearRealTimeTranscriptsApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    audio_source_id = 471849 # int | Unique ID for an Internal recording specific to reportID. For example, ReportID X would have multiple recordings from different source (dial-in or webcast). One ReportID can have multiple AudioSourceIDs.
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    pagination_limit = 5 # int | Specifies the  number of results to return per page. [ Min=0; Max=500] (optional) if omitted the server will use the default value of 200
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    pagination_offset = 0 # int | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. (optional) if omitted the server will use the default value of 0
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    sort = "startDate" # str | Enables to get the data in chronological or reverse chronological order. Results are in chronological order if this parameter is not used. (optional) if omitted the server will use the default value of "startDate"

    try:
        # Returns the latest speakerIds with the confidence scores generated for an active call.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_bulk_documents_nrt_v1_speakerids(audio_source_id, pagination_limit=pagination_limit, pagination_offset=pagination_offset, sort=sort)

        pprint(api_response)

    except fds.sdk.DocumentsDistributorCallStreetEvents.ApiException as e:
        print("Exception when calling NearRealTimeTranscriptsApi->get_bulk_documents_nrt_v1_speakerids: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **audio_source_id** | **int**| Unique ID for an Internal recording specific to reportID. For example, ReportID X would have multiple recordings from different source (dial-in or webcast). One ReportID can have multiple AudioSourceIDs. |
 **pagination_limit** | **int**| Specifies the  number of results to return per page. [ Min&#x3D;0; Max&#x3D;500] | [optional] if omitted the server will use the default value of 200
 **pagination_offset** | **int**| Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. | [optional] if omitted the server will use the default value of 0
 **sort** | **str**| Enables to get the data in chronological or reverse chronological order. Results are in chronological order if this parameter is not used. | [optional] if omitted the server will use the default value of "startDate"

### Return type

[**NRTSpeakerids**](NRTSpeakerids.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Bad Request |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

