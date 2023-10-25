# fds.sdk.DocumentsDistributorCallStreetEvents.EventsAudioApi

All URIs are relative to *https://api.factset.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_docs_distributor_audio_v1_history_files**](EventsAudioApi.md#get_docs_distributor_audio_v1_history_files) | **GET** /docs-distributor/audio/v1/history-files | Retrieve historical audio recordings and related metadata within FactSet coverage.
[**get_docs_distributor_audio_v1_list_files**](EventsAudioApi.md#get_docs_distributor_audio_v1_list_files) | **GET** /docs-distributor/audio/v1/list-files | Retrieve latest audio recordings and related metadata within FactSet coverage.



# **get_docs_distributor_audio_v1_history_files**
> EventsAudioHistory get_docs_distributor_audio_v1_history_files()

Retrieve historical audio recordings and related metadata within FactSet coverage.

 * Returns the **untrimmed** historical audio recordings and related metadata dating back from May 10, 2011 to Sep 30, 2022.  * Returns the **trimmed** historical audio recordings and related metadata dating back from May 10, 2011 to Dec 31, 2022.    Query parameters can be used to filter and narrow down the results. 

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
    api_instance = events_audio_api.EventsAudioApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    pagination_limit = 25 # int | Specifies the number of results to return per page. [ Min=0 ; Max=500 ] (optional) if omitted the server will use the default value of 25
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    pagination_offset = 0 # int | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. (optional) if omitted the server will use the default value of 0
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    year = 2021 # int | Specifies the year for which the historical audio recordings and related metadata are to be retrieved. (optional)
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    trimmed = True # bool | Specifies if trimmed/untrimmed historical audio recordings should be returned. (optional) if omitted the server will use the default value of False

    try:
        # Retrieve historical audio recordings and related metadata within FactSet coverage.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_docs_distributor_audio_v1_history_files(pagination_limit=pagination_limit, pagination_offset=pagination_offset, year=year, trimmed=trimmed)

        pprint(api_response)

    except fds.sdk.DocumentsDistributorCallStreetEvents.ApiException as e:
        print("Exception when calling EventsAudioApi->get_docs_distributor_audio_v1_history_files: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pagination_limit** | **int**| Specifies the number of results to return per page. [ Min&#x3D;0 ; Max&#x3D;500 ] | [optional] if omitted the server will use the default value of 25
 **pagination_offset** | **int**| Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. | [optional] if omitted the server will use the default value of 0
 **year** | **int**| Specifies the year for which the historical audio recordings and related metadata are to be retrieved. | [optional]
 **trimmed** | **bool**| Specifies if trimmed/untrimmed historical audio recordings should be returned. | [optional] if omitted the server will use the default value of False

### Return type

[**EventsAudioHistory**](EventsAudioHistory.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Array of presigned downloadable URLs consisting of historical audio recordings with related metadata. |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;details\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_docs_distributor_audio_v1_list_files**
> EventsAudio get_docs_distributor_audio_v1_list_files()

Retrieve latest audio recordings and related metadata within FactSet coverage.

Returns the latest audio recordings. Query parameters can be used to filter and narrow down the results.

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
    api_instance = events_audio_api.EventsAudioApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    sort = "-startDate" # str | Sorts results in chronological order, reverse chronological order and by uploadTime(latest uploaded first). Results are in reverse chronological order by default. (optional) if omitted the server will use the default value of "-startDate"
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    pagination_limit = 25 # int | Specifies the number of results to return per page. [ Min=0 ; Max=500 ] (optional) if omitted the server will use the default value of 25
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    start_date = "2022-01-01T00:00:00.000Z" # str | Used in conjuction with endDate. The earliest date of the audio file the API should fetch for (can be in absolute: **YYYY-MM-DD** or relative date: **-1** for yesterday). (optional)
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    pagination_offset = 0 # int | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. (optional) if omitted the server will use the default value of 0
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    end_date = "2022-06-01T00:00:00.000Z" # str | Used in conjuction with startDate. The latest date of the audio file the API should fetch for (can be in absolute: **YYYY-MM-DD** or relative date: **0** for today). (optional)
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    report_id = 2666621 # int | Unique identifier for fetching the audio file for an event. The same ID is used for the transcript of the same event. (optional)
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    audio_source_id = 1 # int | Unique ID for an Internal recording specific to reportID. For example, ReportID X would have multiple recordings from different source (phone or webcast or vendor or replay). One ReportID can have multiple AudioSourceIDs. (optional)
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    ids = ["SPWH-US"] # [str] | This parameter filters the results based on ticker-region or Entity ID or the combination of both. A comma is used to separate each identifier. (optional)
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    source_code = "P" # str | This parameter filters the results based on Source of the Audio file. Below are the descriptions for each Source Code - * P = Phone * W = Webcast * V = Vendor * I = Webcast Replay * F = Flash - identical to webcast; can merge with \"W\" in the future * R = Replay (Phone Replay) (optional)
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    file_name = "835A1FD9-3CE1-EC11-8128-8CDCD4AF21E4.mp3" # str | This parameter is used to filter the data on based on the file name. (optional)
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    trimmed = True # bool | This parameters helps to search trimmed audio files. (optional)
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    upload_time = -168 # int | This parameter filters data based on uploadTime relative to the current time, in hours. For example:- uploadTime = -15 (fetches audio files between 15 hours ago and now)  Minimum is 1 hour i.e., uploadTime= -1  Maximum is 1 week/168 hours i.e., uploadTime=-168  While using uploadTime, the startDate and endDate parameters will be ignored. (optional)

    try:
        # Retrieve latest audio recordings and related metadata within FactSet coverage.
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
 **pagination_limit** | **int**| Specifies the number of results to return per page. [ Min&#x3D;0 ; Max&#x3D;500 ] | [optional] if omitted the server will use the default value of 25
 **start_date** | **str**| Used in conjuction with endDate. The earliest date of the audio file the API should fetch for (can be in absolute: **YYYY-MM-DD** or relative date: **-1** for yesterday). | [optional]
 **pagination_offset** | **int**| Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. | [optional] if omitted the server will use the default value of 0
 **end_date** | **str**| Used in conjuction with startDate. The latest date of the audio file the API should fetch for (can be in absolute: **YYYY-MM-DD** or relative date: **0** for today). | [optional]
 **report_id** | **int**| Unique identifier for fetching the audio file for an event. The same ID is used for the transcript of the same event. | [optional]
 **audio_source_id** | **int**| Unique ID for an Internal recording specific to reportID. For example, ReportID X would have multiple recordings from different source (phone or webcast or vendor or replay). One ReportID can have multiple AudioSourceIDs. | [optional]
 **ids** | **[str]**| This parameter filters the results based on ticker-region or Entity ID or the combination of both. A comma is used to separate each identifier. | [optional]
 **source_code** | **str**| This parameter filters the results based on Source of the Audio file. Below are the descriptions for each Source Code - * P &#x3D; Phone * W &#x3D; Webcast * V &#x3D; Vendor * I &#x3D; Webcast Replay * F &#x3D; Flash - identical to webcast; can merge with \&quot;W\&quot; in the future * R &#x3D; Replay (Phone Replay) | [optional]
 **file_name** | **str**| This parameter is used to filter the data on based on the file name. | [optional]
 **trimmed** | **bool**| This parameters helps to search trimmed audio files. | [optional]
 **upload_time** | **int**| This parameter filters data based on uploadTime relative to the current time, in hours. For example:- uploadTime &#x3D; -15 (fetches audio files between 15 hours ago and now)  Minimum is 1 hour i.e., uploadTime&#x3D; -1  Maximum is 1 week/168 hours i.e., uploadTime&#x3D;-168  While using uploadTime, the startDate and endDate parameters will be ignored. | [optional]

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
**200** | Array of URLs consisting of latest audio recordings and related metadata. |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;details\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

