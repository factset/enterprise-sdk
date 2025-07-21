# fds.sdk.EventsandTranscripts.EventsAudioApi

All URIs are relative to *https://api.factset.com/content/events/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_audio_history_files**](EventsAudioApi.md#get_audio_history_files) | **GET** /audio/history | Retrieve historical audio recordings and related metadata within FactSet coverage.
[**search_events_audio**](EventsAudioApi.md#search_events_audio) | **POST** /audio | Retrieve latest audio recordings and related metadata based on different search criteria.



# **get_audio_history_files**
> EventsAudioHistoryResponse get_audio_history_files(year)

Retrieve historical audio recordings and related metadata within FactSet coverage.

 This endpoint retrieves an object containing a pre-signed URL from which an archive of all audio data for a specified year can be downloaded.  * Returns **untrimmed** historical audio recordings, which include complete audio files such as intro music & non-speaking portions, and related metadata dating back from May 10, 2011 to Sep 30, 2024.  * Returns **trimmed** historical audio recordings, which are audio files with the non-speaking portions removed, and related metadata dating back from May 10, 2011 to Dec 31, 2024. 

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
        api_response = api_instance.get_audio_history_files(year, trimmed=trimmed)

        pprint(api_response)

    except fds.sdk.EventsandTranscripts.ApiException as e:
        print("Exception when calling EventsAudioApi->get_audio_history_files: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **year** | **int**| Specifies the year for which the historical audio recordings and related metadata are to be retrieved.  |
 **trimmed** | **bool**| Specifies if trimmed/untrimmed historical audio recordings should be returned. | [optional] if omitted the server will use the default value of False

### Return type

[**EventsAudioHistoryResponse**](EventsAudioHistoryResponse.md)

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

# **search_events_audio**
> AudioResponse search_events_audio(audio_request)

Retrieve latest audio recordings and related metadata based on different search criteria.

Retrieves the most recent audio recordings and their metadata based on various criteria like date range, upload time, file name, or specific IDs. Use the appropriate parameters within the `data` object of the request body to specify the search method. Pagination and sorting are controlled via the `meta` object. 

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
    audio_request = AudioRequest(
        data=AudioRequestData(),
        meta=AudioRequestMeta(
            pagination=AudioRequestMetaPagination(
                limit=25,
                offset=0,
            ),
            sort=["-startDate"],
        ),
    ) # AudioRequest | Criteria to search for audio files. Select one mode of search.

    try:
        # Retrieve latest audio recordings and related metadata based on different search criteria.
        # example passing only required values which don't have defaults set
        api_response = api_instance.search_events_audio(audio_request)

        pprint(api_response)

    except fds.sdk.EventsandTranscripts.ApiException as e:
        print("Exception when calling EventsAudioApi->search_events_audio: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **audio_request** | [**AudioRequest**](AudioRequest.md)| Criteria to search for audio files. Select one mode of search. |

### Return type

[**AudioResponse**](AudioResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The latest audio recordings matching the specified criteria. |  -  |
**400** | Bad Request. This can occur for several reasons, including invalid parameter combinations or malformed JSON. Please review the \&quot;details\&quot; for more information. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

