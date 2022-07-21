# fds.sdk.DocumentsDistributorCallStreetEvents.EventsAudioApi

All URIs are relative to *https://api.factset.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_docs_distributor_audio_v1_list_files**](EventsAudioApi.md#get_docs_distributor_audio_v1_list_files) | **GET** /docs-distributor/audio/v1/list-files | Retrieve audio recordings and metadata within FactSet coverage


# **get_docs_distributor_audio_v1_list_files**
> EventsAudio get_docs_distributor_audio_v1_list_files()

Retrieve audio recordings and metadata within FactSet coverage

Gets the latest 25 audio files. Parameters can be used to filter and narrow down the results

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.DocumentsDistributorCallStreetEvents
from fds.sdk.DocumentsDistributorCallStreetEvents.api import events_audio_api
from fds.sdk.DocumentsDistributorCallStreetEvents.models import *
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
    api_instance = events_audio_api.EventsAudioApi(api_client)

    sort = "-startDate" # str | Sorts results in chronological order, reverse chronological order and by uploadTime(latest uploaded first). Results are in reverse chronological order by default. (optional) if omitted the server will use the default value of "-startDate"
    pagination_limit = 0 # int | Specifies the number of results to return per page. [ Min=0 ; Max=500 ] (optional)
    start_date = dateutil_parser('1970-01-01').date() # date | Used in conjuction with endDate. The earliest date of the audio file the API should fetch for (can be in absolute: YYYY-MM-DD or relative date: -1 for yesterday)' (optional)
    pagination_offset = 1 # int | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results (optional)
    end_date = dateutil_parser('1970-01-01').date() # date | Used in conjuction with startDate. The latest date of the audio file the API should fetch for (can be in absolute: YYYY-MM-DD or relative date: 0 for today) (optional)
    report_id = 1 # int | Unique identifier for fetching the audio file for an event. The same ID is used for the transcript of the same event (optional)
    audio_source_id = 1 # int | Unique ID for an Internal recording specific to reportID. For example, ReportID X would have multiple recordings from different source (phone or webcast or vendor or replay). One ReportID can have multiple AudioSource ids. (optional)
    ids = "ids_example" # str | This parameter filters the results based on ticker-region or Entity ID or the combination of both. A comma is used to separate each identifier (optional)
    source_code = "P" # str | This parameter filters the results based on Source of the Audio file. Below are the descriptions for each Source Code - * P = Phone * W = Webcast * V = Vendor * I = Webcast Replay * F = Flash - identical to webcast; can merge with \"W\" in the future * R = Replay (Phone Replay) (optional)
    file_name = "fileName_example" # str | This parameter is used to filter the data on based on the file name. (optional)
    trimmed = True # bool | This parameters helps to search trimmed audio files (optional)
    upload_time = -168 # int | This parameter filters data based on uploadTime relative to the current time, in hours. For example:- uploadTime = -15 (fetches audio files between 15 hours ago and now)  Minimum is 1 hour i.e., uploadTime= -1  Maximum is 1 week/168 hours i.e., uploadTime=-168  While using uploadTime, the startDate and endDate parameters will be ignored (optional)

    try:
        # Retrieve audio recordings and metadata within FactSet coverage
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_docs_distributor_audio_v1_list_files(sort=sort, pagination_limit=pagination_limit, start_date=start_date, pagination_offset=pagination_offset, end_date=end_date, report_id=report_id, audio_source_id=audio_source_id, ids=ids, source_code=source_code, file_name=file_name, trimmed=trimmed, upload_time=upload_time)
        pprint(api_response)

    except fds.sdk.DocumentsDistributorCallStreetEvents.ApiException as e:
        print("Exception when calling EventsAudioApi->get_docs_distributor_audio_v1_list_files: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sort** | **str**| Sorts results in chronological order, reverse chronological order and by uploadTime(latest uploaded first). Results are in reverse chronological order by default. | [optional] if omitted the server will use the default value of "-startDate"
 **pagination_limit** | **int**| Specifies the number of results to return per page. [ Min&#x3D;0 ; Max&#x3D;500 ] | [optional]
 **start_date** | **date**| Used in conjuction with endDate. The earliest date of the audio file the API should fetch for (can be in absolute: YYYY-MM-DD or relative date: -1 for yesterday)&#39; | [optional]
 **pagination_offset** | **int**| Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results | [optional]
 **end_date** | **date**| Used in conjuction with startDate. The latest date of the audio file the API should fetch for (can be in absolute: YYYY-MM-DD or relative date: 0 for today) | [optional]
 **report_id** | **int**| Unique identifier for fetching the audio file for an event. The same ID is used for the transcript of the same event | [optional]
 **audio_source_id** | **int**| Unique ID for an Internal recording specific to reportID. For example, ReportID X would have multiple recordings from different source (phone or webcast or vendor or replay). One ReportID can have multiple AudioSource ids. | [optional]
 **ids** | **str**| This parameter filters the results based on ticker-region or Entity ID or the combination of both. A comma is used to separate each identifier | [optional]
 **source_code** | **str**| This parameter filters the results based on Source of the Audio file. Below are the descriptions for each Source Code - * P &#x3D; Phone * W &#x3D; Webcast * V &#x3D; Vendor * I &#x3D; Webcast Replay * F &#x3D; Flash - identical to webcast; can merge with \&quot;W\&quot; in the future * R &#x3D; Replay (Phone Replay) | [optional]
 **file_name** | **str**| This parameter is used to filter the data on based on the file name. | [optional]
 **trimmed** | **bool**| This parameters helps to search trimmed audio files | [optional]
 **upload_time** | **int**| This parameter filters data based on uploadTime relative to the current time, in hours. For example:- uploadTime &#x3D; -15 (fetches audio files between 15 hours ago and now)  Minimum is 1 hour i.e., uploadTime&#x3D; -1  Maximum is 1 week/168 hours i.e., uploadTime&#x3D;-168  While using uploadTime, the startDate and endDate parameters will be ignored | [optional]

### Return type

[**EventsAudio**](EventsAudio.md)

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

