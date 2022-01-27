# fds.sdk.DocumentsDistributorCallStreetEvents.NearRealTimeTranscriptsApi

All URIs are relative to *https://api.factset.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_bulk_documents_nrt_v1_calls**](NearRealTimeTranscriptsApi.md#get_bulk_documents_nrt_v1_calls) | **GET** /bulk-documents/nrt/v1/calls | Returns the active calls happening at the moment
[**get_bulk_documents_nrt_v1_list_snippets**](NearRealTimeTranscriptsApi.md#get_bulk_documents_nrt_v1_list_snippets) | **GET** /bulk-documents/nrt/v1/list-snippets | Returns the latest snippets from an active call
[**get_bulk_documents_nrt_v1_speakerids**](NearRealTimeTranscriptsApi.md#get_bulk_documents_nrt_v1_speakerids) | **GET** /bulk-documents/nrt/v1/speakerids | Returns the latest speakerIds with the confidence scores generated for an active call.


# **get_bulk_documents_nrt_v1_calls**
> NRTCalls get_bulk_documents_nrt_v1_calls()

Returns the active calls happening at the moment

Returns the active calls happening at the moment

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
import time
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.DocumentsDistributorCallStreetEvents
from fds.sdk.DocumentsDistributorCallStreetEvents.api import near_real_time_transcripts_api
from fds.sdk.DocumentsDistributorCallStreetEvents.model.error import Error
from fds.sdk.DocumentsDistributorCallStreetEvents.model.nrt_calls import NRTCalls
from fds.sdk.DocumentsDistributorCallStreetEvents.model.nrt_calls400_response import NRTCalls400Response
from pprint import pprint
# Defining the host is optional and defaults to https://api.factset.com
# See configuration.py for a list of all supported configuration parameters.
configuration = fds.sdk.DocumentsDistributorCallStreetEvents.Configuration(
    host = "https://api.factset.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://developer.factset.com/applications
configuration = fds.sdk.DocumentsDistributorCallStreetEvents.Configuration(
     fds_oauth_client = ConfidentialClient('app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://developer.factset.com/manage-api-keys
# configuration = fds.sdk.DocumentsDistributorCallStreetEvents.Configuration(
#     username = 'USERNAME-SERIAL',
#     password = 'API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.DocumentsDistributorCallStreetEvents.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = near_real_time_transcripts_api.NearRealTimeTranscriptsApi(api_client)
    sort = "-startDate" # str | Enables to get the data in chronological or reverse chronological order based on startDate. Results are in reverse chronological order if this parameter is not used (optional) if omitted the server will use the default value of "-startDate"
    report_id = 1 # int | Unique identifier for an event (optional)
    audio_source_id = 1 # int | Unique Id for an internal recording specific to reportId. For example, reportId X would have multiple recordings from different source (dial-in or webcast).One reportId can have multiple audiosource ids. (optional)
    entity_id = "entityId_example" # str | Factset entity level identifier for the company hosting the event (optional)
    ticker = "ticker_example" # str | Ticker-region identifier for the company hosting the event (optional)
    call_status = "inProgress" # str | Status of the call i.e. ended or inProgress or ewn or issueAtSource (optional)
    pagination_limit = 0 # int | Specifies the number of results to return per page.[ Min=0 ; Max=500 ] (optional)
    pagination_offset = 1 # int | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results (optional)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Returns the active calls happening at the moment
        api_response = api_instance.get_bulk_documents_nrt_v1_calls(sort=sort, report_id=report_id, audio_source_id=audio_source_id, entity_id=entity_id, ticker=ticker, call_status=call_status, pagination_limit=pagination_limit, pagination_offset=pagination_offset)
        pprint(api_response)
    except fds.sdk.DocumentsDistributorCallStreetEvents.ApiException as e:
        print("Exception when calling NearRealTimeTranscriptsApi->get_bulk_documents_nrt_v1_calls: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sort** | **str**| Enables to get the data in chronological or reverse chronological order based on startDate. Results are in reverse chronological order if this parameter is not used | [optional] if omitted the server will use the default value of "-startDate"
 **report_id** | **int**| Unique identifier for an event | [optional]
 **audio_source_id** | **int**| Unique Id for an internal recording specific to reportId. For example, reportId X would have multiple recordings from different source (dial-in or webcast).One reportId can have multiple audiosource ids. | [optional]
 **entity_id** | **str**| Factset entity level identifier for the company hosting the event | [optional]
 **ticker** | **str**| Ticker-region identifier for the company hosting the event | [optional]
 **call_status** | **str**| Status of the call i.e. ended or inProgress or ewn or issueAtSource | [optional]
 **pagination_limit** | **int**| Specifies the number of results to return per page.[ Min&#x3D;0 ; Max&#x3D;500 ] | [optional]
 **pagination_offset** | **int**| Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results | [optional]

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
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_bulk_documents_nrt_v1_list_snippets**
> NRTSnippets get_bulk_documents_nrt_v1_list_snippets(audio_source_id)

Returns the latest snippets from an active call

Returns the latest snippets from an active call

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
import time
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.DocumentsDistributorCallStreetEvents
from fds.sdk.DocumentsDistributorCallStreetEvents.api import near_real_time_transcripts_api
from fds.sdk.DocumentsDistributorCallStreetEvents.model.nrt_snippets import NRTSnippets
from fds.sdk.DocumentsDistributorCallStreetEvents.model.nrt_snippets400_response import NRTSnippets400Response
from fds.sdk.DocumentsDistributorCallStreetEvents.model.error import Error
from pprint import pprint
# Defining the host is optional and defaults to https://api.factset.com
# See configuration.py for a list of all supported configuration parameters.
configuration = fds.sdk.DocumentsDistributorCallStreetEvents.Configuration(
    host = "https://api.factset.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://developer.factset.com/applications
configuration = fds.sdk.DocumentsDistributorCallStreetEvents.Configuration(
     fds_oauth_client = ConfidentialClient('app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://developer.factset.com/manage-api-keys
# configuration = fds.sdk.DocumentsDistributorCallStreetEvents.Configuration(
#     username = 'USERNAME-SERIAL',
#     password = 'API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.DocumentsDistributorCallStreetEvents.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = near_real_time_transcripts_api.NearRealTimeTranscriptsApi(api_client)
    audio_source_id = 1 # int | Unique ID for an Internal recording specific to reportID. For example, ReportID X would have multiple recordings from different source (dial-in or webcast). One ReportID can have multiple AudioSource ids.
    report_id = 1 # int | Unique identifier for an event (optional)
    pagination_limit = 0 # int | Specifies the  number of results to return per page. [ Min=0; Max=500 ] (optional)
    pagination_offset = 1 # int | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results (optional)

    # example passing only required values which don't have defaults set
    try:
        # Returns the latest snippets from an active call
        api_response = api_instance.get_bulk_documents_nrt_v1_list_snippets(audio_source_id)
        pprint(api_response)
    except fds.sdk.DocumentsDistributorCallStreetEvents.ApiException as e:
        print("Exception when calling NearRealTimeTranscriptsApi->get_bulk_documents_nrt_v1_list_snippets: %s\n" % e)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Returns the latest snippets from an active call
        api_response = api_instance.get_bulk_documents_nrt_v1_list_snippets(audio_source_id, report_id=report_id, pagination_limit=pagination_limit, pagination_offset=pagination_offset)
        pprint(api_response)
    except fds.sdk.DocumentsDistributorCallStreetEvents.ApiException as e:
        print("Exception when calling NearRealTimeTranscriptsApi->get_bulk_documents_nrt_v1_list_snippets: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **audio_source_id** | **int**| Unique ID for an Internal recording specific to reportID. For example, ReportID X would have multiple recordings from different source (dial-in or webcast). One ReportID can have multiple AudioSource ids. |
 **report_id** | **int**| Unique identifier for an event | [optional]
 **pagination_limit** | **int**| Specifies the  number of results to return per page. [ Min&#x3D;0; Max&#x3D;500 ] | [optional]
 **pagination_offset** | **int**| Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results | [optional]

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
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_bulk_documents_nrt_v1_speakerids**
> NRTSpeakerids get_bulk_documents_nrt_v1_speakerids(audio_source_id)

Returns the latest speakerIds with the confidence scores generated for an active call.

Returns the latest speakerIds with the cosine scores(confidence scores) generated for an active call.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
import time
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.DocumentsDistributorCallStreetEvents
from fds.sdk.DocumentsDistributorCallStreetEvents.api import near_real_time_transcripts_api
from fds.sdk.DocumentsDistributorCallStreetEvents.model.error import Error
from fds.sdk.DocumentsDistributorCallStreetEvents.model.nrt_speakerids400_response import NRTSpeakerids400Response
from fds.sdk.DocumentsDistributorCallStreetEvents.model.nrt_speakerids import NRTSpeakerids
from pprint import pprint
# Defining the host is optional and defaults to https://api.factset.com
# See configuration.py for a list of all supported configuration parameters.
configuration = fds.sdk.DocumentsDistributorCallStreetEvents.Configuration(
    host = "https://api.factset.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://developer.factset.com/applications
configuration = fds.sdk.DocumentsDistributorCallStreetEvents.Configuration(
     fds_oauth_client = ConfidentialClient('app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://developer.factset.com/manage-api-keys
# configuration = fds.sdk.DocumentsDistributorCallStreetEvents.Configuration(
#     username = 'USERNAME-SERIAL',
#     password = 'API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.DocumentsDistributorCallStreetEvents.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = near_real_time_transcripts_api.NearRealTimeTranscriptsApi(api_client)
    audio_source_id = 1 # int | The Unique ID for an Internal recording specific to reportID. For example, ReportID X would have multiple recordings from a different source (dial-in or webcast). One ReportID can have multiple audioSource ids. 
    sort = "startDate" # str | Enables to get the data in chronological or reverse chronological order. Results are in chronological order if this parameter is not used (optional) if omitted the server will use the default value of "startDate"
    pagination_limit = 0 # int | Specifies the number of results to return per page.[ Min=0 ; Max=500 ] (optional)
    pagination_offset = 1 # int | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results (optional)

    # example passing only required values which don't have defaults set
    try:
        # Returns the latest speakerIds with the confidence scores generated for an active call.
        api_response = api_instance.get_bulk_documents_nrt_v1_speakerids(audio_source_id)
        pprint(api_response)
    except fds.sdk.DocumentsDistributorCallStreetEvents.ApiException as e:
        print("Exception when calling NearRealTimeTranscriptsApi->get_bulk_documents_nrt_v1_speakerids: %s\n" % e)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Returns the latest speakerIds with the confidence scores generated for an active call.
        api_response = api_instance.get_bulk_documents_nrt_v1_speakerids(audio_source_id, sort=sort, pagination_limit=pagination_limit, pagination_offset=pagination_offset)
        pprint(api_response)
    except fds.sdk.DocumentsDistributorCallStreetEvents.ApiException as e:
        print("Exception when calling NearRealTimeTranscriptsApi->get_bulk_documents_nrt_v1_speakerids: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **audio_source_id** | **int**| The Unique ID for an Internal recording specific to reportID. For example, ReportID X would have multiple recordings from a different source (dial-in or webcast). One ReportID can have multiple audioSource ids.  |
 **sort** | **str**| Enables to get the data in chronological or reverse chronological order. Results are in chronological order if this parameter is not used | [optional] if omitted the server will use the default value of "startDate"
 **pagination_limit** | **int**| Specifies the number of results to return per page.[ Min&#x3D;0 ; Max&#x3D;500 ] | [optional]
 **pagination_offset** | **int**| Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results | [optional]

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
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

