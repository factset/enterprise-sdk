# fds.sdk.EventsandTranscripts.EventsAudioApi

All URIs are relative to *https://api.factset.com/events/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_docs_distributor_audio_v1_history_files**](EventsAudioApi.md#get_docs_distributor_audio_v1_history_files) | **GET** /audio/history | Retrieve historical audio recordings and related metadata within FactSet coverage.
[**get_docs_distributor_audio_v1_list_files_date**](EventsAudioApi.md#get_docs_distributor_audio_v1_list_files_date) | **GET** /audio/by-date | Retrieve latest audio recordings and related metadata within FactSet coverage based on a specific date ranges.
[**get_docs_distributor_audio_v1_list_files_file_name**](EventsAudioApi.md#get_docs_distributor_audio_v1_list_files_file_name) | **GET** /audio/by-file-name | Retrieve latest audio recordings and related metadata within FactSet coverage based on file name.
[**get_docs_distributor_audio_v1_list_files_ids**](EventsAudioApi.md#get_docs_distributor_audio_v1_list_files_ids) | **GET** /audio/by-ids | Retrieve the latest audio recordings along with their corresponding metadata from the FactSet coverage based on specific IDs.
[**get_docs_distributor_audio_v1_list_files_upload_time**](EventsAudioApi.md#get_docs_distributor_audio_v1_list_files_upload_time) | **GET** /audio/by-upload-time | Retrieve latest audio recordings and related metadata within FactSet coverage based on upload time.



# **get_docs_distributor_audio_v1_history_files**
> EventsAudioHistory get_docs_distributor_audio_v1_history_files(year)

Retrieve historical audio recordings and related metadata within FactSet coverage.

 This endpoint retrieves an object containing a pre-signed URL from which an archive of all audio data for a specified year can be downloaded.  * Returns **untrimmed** historical audio recordings, which include complete audio files such as intro music & non-speaking portions, and related metadata dating back from May 10, 2011 to Sep 30, 2022.  * Returns **trimmed** historical audio recordings, which are audio files with the non-speaking portions removed, and related metadata dating back from May 10, 2011 to Dec 31, 2022. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.EventsandTranscripts
from fds.sdk.EventsandTranscripts.api import events_audio_api
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
    api_instance = events_audio_api.EventsAudioApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    year = 2021 # int | Specifies the year for which the historical audio recordings and related metadata are to be retrieved. 
    trimmed = True # bool | Specifies if trimmed/untrimmed historical audio recordings should be returned. (optional) if omitted the server will use the default value of False

    try:
        # Retrieve historical audio recordings and related metadata within FactSet coverage.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_docs_distributor_audio_v1_history_files(year, trimmed=trimmed)

        pprint(api_response)

    except fds.sdk.EventsandTranscripts.ApiException as e:
        print("Exception when calling EventsAudioApi->get_docs_distributor_audio_v1_history_files: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **year** | **int**| Specifies the year for which the historical audio recordings and related metadata are to be retrieved.  |
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
**200** | The historical audio recordings based on the provided year. |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;details\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_docs_distributor_audio_v1_list_files_date**
> EventsAudioDaily get_docs_distributor_audio_v1_list_files_date()

Retrieve latest audio recordings and related metadata within FactSet coverage based on a specific date ranges.

Retrieves the most recent audio recordings based on specified dates and allows filtering through both source code and Ids.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.EventsandTranscripts
from fds.sdk.EventsandTranscripts.api import events_audio_api
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
    api_instance = events_audio_api.EventsAudioApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    start_date = dateutil_parser('2020-10-01T00:00:00.000Z').date() # date | The earliest date of the audio file the API should fetch for.  - Format: Should be absolute (YYYY-MM-DD).  (optional)
    end_date = dateutil_parser('2020-12-26T00:00:00.000Z').date() # date | The latest date of the audio file the API should fetch for. - Format: Should be absolute (YYYY-MM-DD).  (optional)
    start_date_relative = 1 # int | The earliest date of the feed file the API should fetch based on the file timestamp.  - Format: Specify the date using a relative term as an integer: '0' for today, '-1' for yesterday, '-2' for two days ago, and so forth. Negative values are used to represent past dates.   - *Either `startDate` or `startDateRelative` should be used, but not both.* - *If both `startDate` and `startDateRelative` are provided in the same request, the API will return an error.* - *If users provide future dates in requests for `startDate` or `startDateRelative`, the API will not return any data.*  (optional)
    end_date_relative = 1 # int | The latest date of the feed file the API should fetch based on the file timestamp.   Format: Specify the date using a relative term as an integer: '0' for today, '-1' for yesterday, '-2' for two days ago, and so forth. Negative values are used to represent past dates.  - Either `endDate` or `endDateRelative` should be used, but not both. - If both `endDate` and `endDateRelative` are provided in the same request, the API will return an error. - If users provide future dates in requests for `endDate` or `endDateRelative`, the API will not return any data.  (optional)
    source_code = "Webcast" # str | This parameter filters the results based on Source of the Audio file. Below are the descriptions for each Source Code - * Phone = Originated from phone call * Webcast = Originated from a webcast * Vendor = Received from vendor * WebcastReplay = Replay of a webcast * Flash = Identical to webcast; can merge with \"Webcast\" in the future * Replay = Phone replay (optional)
    ids = ["SPWH-US"] # [str] | This parameter filters the results based on ticker-region or Entity ID or the combination of both. A comma is used to separate each identifier.  (optional)
    trimmed = False # bool | This parameter helps to search for trimmed audio files, with the non-speaking portions removed, and related metadata. The data ranges from May 10, 2011 to Dec 31, 2022.  (optional) if omitted the server will use the default value of False
    sort = ["-startDate"] # [str] | Enables sorting data in ascending or descending chronological order based on startDate.  (optional) if omitted the server will use the default value of ["-startDate"]
    pagination_limit = 25 # int | Specifies the number of results to return per page. (optional) if omitted the server will use the default value of 25
    pagination_offset = 0 # int | Page number of the results to return. (optional) if omitted the server will use the default value of 0

    try:
        # Retrieve latest audio recordings and related metadata within FactSet coverage based on a specific date ranges.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_docs_distributor_audio_v1_list_files_date(start_date=start_date, end_date=end_date, start_date_relative=start_date_relative, end_date_relative=end_date_relative, source_code=source_code, ids=ids, trimmed=trimmed, sort=sort, pagination_limit=pagination_limit, pagination_offset=pagination_offset)

        pprint(api_response)

    except fds.sdk.EventsandTranscripts.ApiException as e:
        print("Exception when calling EventsAudioApi->get_docs_distributor_audio_v1_list_files_date: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start_date** | **date**| The earliest date of the audio file the API should fetch for.  - Format: Should be absolute (YYYY-MM-DD).  | [optional]
 **end_date** | **date**| The latest date of the audio file the API should fetch for. - Format: Should be absolute (YYYY-MM-DD).  | [optional]
 **start_date_relative** | **int**| The earliest date of the feed file the API should fetch based on the file timestamp.  - Format: Specify the date using a relative term as an integer: &#39;0&#39; for today, &#39;-1&#39; for yesterday, &#39;-2&#39; for two days ago, and so forth. Negative values are used to represent past dates.   - *Either &#x60;startDate&#x60; or &#x60;startDateRelative&#x60; should be used, but not both.* - *If both &#x60;startDate&#x60; and &#x60;startDateRelative&#x60; are provided in the same request, the API will return an error.* - *If users provide future dates in requests for &#x60;startDate&#x60; or &#x60;startDateRelative&#x60;, the API will not return any data.*  | [optional]
 **end_date_relative** | **int**| The latest date of the feed file the API should fetch based on the file timestamp.   Format: Specify the date using a relative term as an integer: &#39;0&#39; for today, &#39;-1&#39; for yesterday, &#39;-2&#39; for two days ago, and so forth. Negative values are used to represent past dates.  - Either &#x60;endDate&#x60; or &#x60;endDateRelative&#x60; should be used, but not both. - If both &#x60;endDate&#x60; and &#x60;endDateRelative&#x60; are provided in the same request, the API will return an error. - If users provide future dates in requests for &#x60;endDate&#x60; or &#x60;endDateRelative&#x60;, the API will not return any data.  | [optional]
 **source_code** | **str**| This parameter filters the results based on Source of the Audio file. Below are the descriptions for each Source Code - * Phone &#x3D; Originated from phone call * Webcast &#x3D; Originated from a webcast * Vendor &#x3D; Received from vendor * WebcastReplay &#x3D; Replay of a webcast * Flash &#x3D; Identical to webcast; can merge with \&quot;Webcast\&quot; in the future * Replay &#x3D; Phone replay | [optional]
 **ids** | **[str]**| This parameter filters the results based on ticker-region or Entity ID or the combination of both. A comma is used to separate each identifier.  | [optional]
 **trimmed** | **bool**| This parameter helps to search for trimmed audio files, with the non-speaking portions removed, and related metadata. The data ranges from May 10, 2011 to Dec 31, 2022.  | [optional] if omitted the server will use the default value of False
 **sort** | **[str]**| Enables sorting data in ascending or descending chronological order based on startDate.  | [optional] if omitted the server will use the default value of ["-startDate"]
 **pagination_limit** | **int**| Specifies the number of results to return per page. | [optional] if omitted the server will use the default value of 25
 **pagination_offset** | **int**| Page number of the results to return. | [optional] if omitted the server will use the default value of 0

### Return type

[**EventsAudioDaily**](EventsAudioDaily.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The latest audio recordings based on the provided date ranges. |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;details\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_docs_distributor_audio_v1_list_files_file_name**
> EventsAudioDailyFileName get_docs_distributor_audio_v1_list_files_file_name()

Retrieve latest audio recordings and related metadata within FactSet coverage based on file name.

Retrieves the latest audio recordings corresponding to the provided file name.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.EventsandTranscripts
from fds.sdk.EventsandTranscripts.api import events_audio_api
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
    api_instance = events_audio_api.EventsAudioApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    file_name = "835A1FD9-3CE1-EC11-8128-8CDCD4AF21E4.mp3" # str | This parameter is used to filter the data on based on the file name. (optional)

    try:
        # Retrieve latest audio recordings and related metadata within FactSet coverage based on file name.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_docs_distributor_audio_v1_list_files_file_name(file_name=file_name)

        pprint(api_response)

    except fds.sdk.EventsandTranscripts.ApiException as e:
        print("Exception when calling EventsAudioApi->get_docs_distributor_audio_v1_list_files_file_name: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file_name** | **str**| This parameter is used to filter the data on based on the file name. | [optional]

### Return type

[**EventsAudioDailyFileName**](EventsAudioDailyFileName.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The latest audio recordings based on the provided file name. |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;details\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_docs_distributor_audio_v1_list_files_ids**
> EventsAudioDailyIds get_docs_distributor_audio_v1_list_files_ids()

Retrieve the latest audio recordings along with their corresponding metadata from the FactSet coverage based on specific IDs.

Retrieves the latest audio recordings based on the provided report ID and audio source ID.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.EventsandTranscripts
from fds.sdk.EventsandTranscripts.api import events_audio_api
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
    api_instance = events_audio_api.EventsAudioApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    report_id = 3015749 # int | Unique identifier for fetching the audio file for an event. The same ID is used for the transcript of the same event.  (optional)
    audio_source_id = 594948 # int | Unique ID for an Internal recording specific to reportID. For example, ReportID X would have multiple recordings from different source (phone or webcast or vendor or replay). One ReportID can have multiple AudioSourceIDs.  (optional)
    trimmed = False # bool | This parameters helps to search trimmed audio files. (optional) if omitted the server will use the default value of False

    try:
        # Retrieve the latest audio recordings along with their corresponding metadata from the FactSet coverage based on specific IDs.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_docs_distributor_audio_v1_list_files_ids(report_id=report_id, audio_source_id=audio_source_id, trimmed=trimmed)

        pprint(api_response)

    except fds.sdk.EventsandTranscripts.ApiException as e:
        print("Exception when calling EventsAudioApi->get_docs_distributor_audio_v1_list_files_ids: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **report_id** | **int**| Unique identifier for fetching the audio file for an event. The same ID is used for the transcript of the same event.  | [optional]
 **audio_source_id** | **int**| Unique ID for an Internal recording specific to reportID. For example, ReportID X would have multiple recordings from different source (phone or webcast or vendor or replay). One ReportID can have multiple AudioSourceIDs.  | [optional]
 **trimmed** | **bool**| This parameters helps to search trimmed audio files. | [optional] if omitted the server will use the default value of False

### Return type

[**EventsAudioDailyIds**](EventsAudioDailyIds.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The latest audio recordings based on the provided report ID and audio source ID. |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;details\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_docs_distributor_audio_v1_list_files_upload_time**
> EventsAudioDaily get_docs_distributor_audio_v1_list_files_upload_time()

Retrieve latest audio recordings and related metadata within FactSet coverage based on upload time.

Returns the latest audio recordings based on upload time and allows filtering through both source code and Ids.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.EventsandTranscripts
from fds.sdk.EventsandTranscripts.api import events_audio_api
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
    api_instance = events_audio_api.EventsAudioApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    upload_time = -20 # int | This parameter filters data based on uploadTime relative to the current time, in hours. For example:- uploadTime = -15 (fetches audio files between 15 hours ago and now)  Minimum is 1 hour i.e., uploadTime= -1  Maximum is 1 week/168 hours i.e., uploadTime=-168 (optional)
    source_code = "Webcast" # str | This parameter filters the results based on Source of the Audio file. Below are the descriptions for each Source Code - * Phone = Originated from phone call * Webcast = Originated from a webcast * Vendor = Received from vendor * WebcastReplay = Replay of a webcast * Flash = Identical to webcast; can merge with \"Webcast\" in the future * Replay = Phone replay (optional)
    ids = ["SNA-AR"] # [str] | This parameter filters the results based on ticker-region or Entity ID or the combination of both. A comma is used to separate each identifier.  (optional)
    trimmed = False # bool | This parameter helps to search for trimmed audio files, with the non-speaking portions removed, and related metadata. The data ranges from May 10, 2011 to Dec 31, 2022.  (optional) if omitted the server will use the default value of False
    sort = ["-uploadTime"] # [str] | Enables sorting data in ascending or descending chronological order based on uploadTime.  (optional) if omitted the server will use the default value of ["-uploadTime"]
    pagination_limit = 25 # int | Specifies the number of results to return per page. (optional) if omitted the server will use the default value of 25
    pagination_offset = 0 # int | Page number of the results to return. (optional) if omitted the server will use the default value of 0

    try:
        # Retrieve latest audio recordings and related metadata within FactSet coverage based on upload time.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_docs_distributor_audio_v1_list_files_upload_time(upload_time=upload_time, source_code=source_code, ids=ids, trimmed=trimmed, sort=sort, pagination_limit=pagination_limit, pagination_offset=pagination_offset)

        pprint(api_response)

    except fds.sdk.EventsandTranscripts.ApiException as e:
        print("Exception when calling EventsAudioApi->get_docs_distributor_audio_v1_list_files_upload_time: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **upload_time** | **int**| This parameter filters data based on uploadTime relative to the current time, in hours. For example:- uploadTime &#x3D; -15 (fetches audio files between 15 hours ago and now)  Minimum is 1 hour i.e., uploadTime&#x3D; -1  Maximum is 1 week/168 hours i.e., uploadTime&#x3D;-168 | [optional]
 **source_code** | **str**| This parameter filters the results based on Source of the Audio file. Below are the descriptions for each Source Code - * Phone &#x3D; Originated from phone call * Webcast &#x3D; Originated from a webcast * Vendor &#x3D; Received from vendor * WebcastReplay &#x3D; Replay of a webcast * Flash &#x3D; Identical to webcast; can merge with \&quot;Webcast\&quot; in the future * Replay &#x3D; Phone replay | [optional]
 **ids** | **[str]**| This parameter filters the results based on ticker-region or Entity ID or the combination of both. A comma is used to separate each identifier.  | [optional]
 **trimmed** | **bool**| This parameter helps to search for trimmed audio files, with the non-speaking portions removed, and related metadata. The data ranges from May 10, 2011 to Dec 31, 2022.  | [optional] if omitted the server will use the default value of False
 **sort** | **[str]**| Enables sorting data in ascending or descending chronological order based on uploadTime.  | [optional] if omitted the server will use the default value of ["-uploadTime"]
 **pagination_limit** | **int**| Specifies the number of results to return per page. | [optional] if omitted the server will use the default value of 25
 **pagination_offset** | **int**| Page number of the results to return. | [optional] if omitted the server will use the default value of 0

### Return type

[**EventsAudioDaily**](EventsAudioDaily.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The latest audio recordings based on the provided upload time, source code and IDs. |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;details\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

