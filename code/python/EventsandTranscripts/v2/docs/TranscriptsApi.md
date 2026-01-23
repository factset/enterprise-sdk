# fds.sdk.EventsandTranscripts.TranscriptsApi

All URIs are relative to *https://api.factset.com/content/events/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_transcripts_intelligence**](TranscriptsApi.md#get_transcripts_intelligence) | **GET** /transcripts/intelligence | Returns the StreetAccount Transcript Intelligence documents and related metadata within FactSet coverage based on specific date range and various parameters.
[**get_transcripts_investor_slides**](TranscriptsApi.md#get_transcripts_investor_slides) | **GET** /transcripts/investor-slides | Returns the investor slides in PDF format and related metadata within FactSet coverage based on specific date range and various parameters.
[**get_transcriptsin_xml**](TranscriptsApi.md#get_transcriptsin_xml) | **GET** /transcripts/response-type | Returns the requested response type of transcript
[**search_transcripts**](TranscriptsApi.md#search_transcripts) | **POST** /transcripts | Returns transcript documents and related metadata based on different search criteria.



# **get_transcripts_intelligence**
> TranscriptsIntelligenceResponse get_transcripts_intelligence(ids)

Returns the StreetAccount Transcript Intelligence documents and related metadata within FactSet coverage based on specific date range and various parameters.

Returns the StreetAccount Transcript Intelligence documents within FactSet coverage along with other response fields.  All StreetAccount Transcript Intelligence stories originate from StreetAccount 

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
    ids = ["ADT-US"] # [str] | Requested symbols or securities. This is a list with a maximum limit of 1000. Each symbol can be a FactSet exchange symbol, CUSIP, SEDOL, ISIN, or Entity ID
    start_date = dateutil_parser('2025-05-01').date() # date | Start Date (YYYY-MM-DD). If dates are not provided, default will return all files.  (optional)
    end_date = dateutil_parser('2025-07-24').date() # date | End Date (YYYY-MM-DD). If dates are not provided, default will return all files.  (optional)
    start_date_relative = 1 # int | The earliest date of the feed file the API should fetch based on the file timestamp, relative to today. - Format: Integer (`0` for today, `-1` for yesterday, etc.). - *Either `startDate` or `startDateRelative` should be used, but not both.* - If dates are not provided, default will return all files.  (optional)
    end_date_relative = 1 # int | The latest date of the feed file the API should fetch based on the file timestamp, relative to today. - Format: Integer (`0` for today, `-1` for yesterday, etc.). - *Either `endDate` or `endDateRelative` should be used, but not both.* - If dates are not provided, default will return all files.  (optional)
    categories = ["CN:US"] # [str] | Code for categories to include. This is a list, which represents country, industry, and subject codes. Use the ```/meta/categories``` endpoint to get the list of available categories.  Default = All categories.   (optional)
    time_zone = "America/New_York" # str | Time Zone for story dates/times (POSIX format from IANA timeZone registry).  Use the `/meta/time-zones` endpoint to get the list of available time zones. (optional) if omitted the server will use the default value of "America/New_York"
    sort = ["-storyDateTime"] # [str] | Enables sorting data in ascending or descending chronological order based on eventDate.  (optional) if omitted the server will use the default value of ["-storyDateTime"]
    pagination_limit = 20 # int | Number of results to return per page. (optional) if omitted the server will use the default value of 25
    pagination_offset = 0 # int | Specifies the starting point for pagination. This parameter is used to identify the beginning of the next set of results. (optional) if omitted the server will use the default value of 0

    try:
        # Returns the StreetAccount Transcript Intelligence documents and related metadata within FactSet coverage based on specific date range and various parameters.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_transcripts_intelligence(ids, start_date=start_date, end_date=end_date, start_date_relative=start_date_relative, end_date_relative=end_date_relative, categories=categories, time_zone=time_zone, sort=sort, pagination_limit=pagination_limit, pagination_offset=pagination_offset)

        pprint(api_response)

    except fds.sdk.EventsandTranscripts.ApiException as e:
        print("Exception when calling TranscriptsApi->get_transcripts_intelligence: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | **[str]**| Requested symbols or securities. This is a list with a maximum limit of 1000. Each symbol can be a FactSet exchange symbol, CUSIP, SEDOL, ISIN, or Entity ID |
 **start_date** | **date**| Start Date (YYYY-MM-DD). If dates are not provided, default will return all files.  | [optional]
 **end_date** | **date**| End Date (YYYY-MM-DD). If dates are not provided, default will return all files.  | [optional]
 **start_date_relative** | **int**| The earliest date of the feed file the API should fetch based on the file timestamp, relative to today. - Format: Integer (&#x60;0&#x60; for today, &#x60;-1&#x60; for yesterday, etc.). - *Either &#x60;startDate&#x60; or &#x60;startDateRelative&#x60; should be used, but not both.* - If dates are not provided, default will return all files.  | [optional]
 **end_date_relative** | **int**| The latest date of the feed file the API should fetch based on the file timestamp, relative to today. - Format: Integer (&#x60;0&#x60; for today, &#x60;-1&#x60; for yesterday, etc.). - *Either &#x60;endDate&#x60; or &#x60;endDateRelative&#x60; should be used, but not both.* - If dates are not provided, default will return all files.  | [optional]
 **categories** | **[str]**| Code for categories to include. This is a list, which represents country, industry, and subject codes. Use the &#x60;&#x60;&#x60;/meta/categories&#x60;&#x60;&#x60; endpoint to get the list of available categories.  Default &#x3D; All categories.   | [optional]
 **time_zone** | **str**| Time Zone for story dates/times (POSIX format from IANA timeZone registry).  Use the &#x60;/meta/time-zones&#x60; endpoint to get the list of available time zones. | [optional] if omitted the server will use the default value of "America/New_York"
 **sort** | **[str]**| Enables sorting data in ascending or descending chronological order based on eventDate.  | [optional] if omitted the server will use the default value of ["-storyDateTime"]
 **pagination_limit** | **int**| Number of results to return per page. | [optional] if omitted the server will use the default value of 25
 **pagination_offset** | **int**| Specifies the starting point for pagination. This parameter is used to identify the beginning of the next set of results. | [optional] if omitted the server will use the default value of 0

### Return type

[**TranscriptsIntelligenceResponse**](TranscriptsIntelligenceResponse.md)

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

# **get_transcripts_investor_slides**
> InvestorSlidesResponse get_transcripts_investor_slides(ids, start_date, end_date)

Returns the investor slides in PDF format and related metadata within FactSet coverage based on specific date range and various parameters.

Returns the Factset Callstreet Investor Slides documents within FactSet coverage along with other response fields   All transcripts originate from Factset Callstreet Investor Slides. 

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
    ids = ["ADT-US"] # [str] | Requested symbols or securities. This is a list with a maximum limit of 1000. Each symbol can be a FactSet exchange symbol, CUSIP, SEDOL, ISIN, or Entity ID
    start_date = dateutil_parser('2025-07-23').date() # date | Start Date. Format is YYYY-MM-DD    **The API supports data from 1995 onwards. Ensure that the provided Date falls within this range for accurate results.** 
    end_date = dateutil_parser('2025-07-24').date() # date | End Date. Format is YYYY-MM-DD.
    event_ids = ["1203806069"] # [str] | Requests Event IDs. This is a list with a maximum limit of 1000. (optional)
    categories = ["CN:US"] # [str] | Code for categories to include. This is a list, which represents country, industry, and subject codes. Use the ```/meta/categories``` endpoint to get the list of available categories.  Default = All categories.   (optional)
    search_text = "presentation" # str | Restricts the search to include only document stories which include the text searched.     (optional)
    sort = ["-storyDateTime"] # [str] | Enables sorting data in ascending or descending chronological order based on eventDate.  (optional) if omitted the server will use the default value of ["-storyDateTime"]
    pagination_limit = 20 # int | Number of results to return per page. (optional) if omitted the server will use the default value of 25
    pagination_offset = 0 # int | Specifies the starting point for pagination. This parameter is used to identify the beginning of the next set of results. (optional) if omitted the server will use the default value of 0

    try:
        # Returns the investor slides in PDF format and related metadata within FactSet coverage based on specific date range and various parameters.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_transcripts_investor_slides(ids, start_date, end_date, event_ids=event_ids, categories=categories, search_text=search_text, sort=sort, pagination_limit=pagination_limit, pagination_offset=pagination_offset)

        pprint(api_response)

    except fds.sdk.EventsandTranscripts.ApiException as e:
        print("Exception when calling TranscriptsApi->get_transcripts_investor_slides: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | **[str]**| Requested symbols or securities. This is a list with a maximum limit of 1000. Each symbol can be a FactSet exchange symbol, CUSIP, SEDOL, ISIN, or Entity ID |
 **start_date** | **date**| Start Date. Format is YYYY-MM-DD    **The API supports data from 1995 onwards. Ensure that the provided Date falls within this range for accurate results.**  |
 **end_date** | **date**| End Date. Format is YYYY-MM-DD. |
 **event_ids** | **[str]**| Requests Event IDs. This is a list with a maximum limit of 1000. | [optional]
 **categories** | **[str]**| Code for categories to include. This is a list, which represents country, industry, and subject codes. Use the &#x60;&#x60;&#x60;/meta/categories&#x60;&#x60;&#x60; endpoint to get the list of available categories.  Default &#x3D; All categories.   | [optional]
 **search_text** | **str**| Restricts the search to include only document stories which include the text searched.     | [optional]
 **sort** | **[str]**| Enables sorting data in ascending or descending chronological order based on eventDate.  | [optional] if omitted the server will use the default value of ["-storyDateTime"]
 **pagination_limit** | **int**| Number of results to return per page. | [optional] if omitted the server will use the default value of 25
 **pagination_offset** | **int**| Specifies the starting point for pagination. This parameter is used to identify the beginning of the next set of results. | [optional] if omitted the server will use the default value of 0

### Return type

[**InvestorSlidesResponse**](InvestorSlidesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The latest investor slides based on the provided date ranges. |  -  |
**400** | Bad request |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_transcriptsin_xml**
> ResponseType get_transcriptsin_xml(report_ids, format)

Returns the requested response type of transcript

Returns the Factset Callstreet documents within FactSet coverage along with other response fields   All transcripts originate from Factset Callstreet Transcripts 

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
    report_ids = ["3022837"] # [str] | Requests Report IDs. This is a list with a maximum limit of 1000
    format = "XML" # str | The format of the output file. Allowed values:   - `XML`: Structured data format ideal for integrations and parsing.   - `PDF`: Printable document format preserving layout and design.   - `DocViewer`: Web-friendly format rendered in an in-browser document viewer.   - `ContentXML`: XML containing only the core content without layout or styling metadata. 
    pagination_limit = 20 # int | Number of results to return per page. (optional) if omitted the server will use the default value of 25
    pagination_offset = 0 # int | Specifies the starting point for pagination. This parameter is used to identify the beginning of the next set of results. (optional) if omitted the server will use the default value of 0

    try:
        # Returns the requested response type of transcript
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_transcriptsin_xml(report_ids, format, pagination_limit=pagination_limit, pagination_offset=pagination_offset)

        pprint(api_response)

    except fds.sdk.EventsandTranscripts.ApiException as e:
        print("Exception when calling TranscriptsApi->get_transcriptsin_xml: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **report_ids** | **[str]**| Requests Report IDs. This is a list with a maximum limit of 1000 |
 **format** | **str**| The format of the output file. Allowed values:   - &#x60;XML&#x60;: Structured data format ideal for integrations and parsing.   - &#x60;PDF&#x60;: Printable document format preserving layout and design.   - &#x60;DocViewer&#x60;: Web-friendly format rendered in an in-browser document viewer.   - &#x60;ContentXML&#x60;: XML containing only the core content without layout or styling metadata.  |
 **pagination_limit** | **int**| Number of results to return per page. | [optional] if omitted the server will use the default value of 25
 **pagination_offset** | **int**| Specifies the starting point for pagination. This parameter is used to identify the beginning of the next set of results. | [optional] if omitted the server will use the default value of 0

### Return type

[**ResponseType**](ResponseType.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Returns the requested response type of transcripts |  -  |
**400** | Bad request |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **search_transcripts**
> TranscriptsResponse search_transcripts(transcripts_request)

Returns transcript documents and related metadata based on different search criteria.

Retrieves transcript documents in XML format and related metadata within FactSet coverage based on various criteria like date range, search text, specific IDs, or event details. Use the appropriate parameters within the `data` object of the request body to specify the search method. Pagination and sorting are controlled via the `meta` object.  All transcripts originate from Factset Callstreet Transcripts. 

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
    transcripts_request = TranscriptsRequest(
        data=TranscriptsRequestData(),
        meta=TranscriptsRequestMeta(
            pagination=TranscriptsRequestMetaPagination(
                limit=25,
                offset=0,
            ),
            sort=["-storyDateTime"],
        ),
    ) # TranscriptsRequest | Criteria to search for transcripts. Select one mode of search.

    try:
        # Returns transcript documents and related metadata based on different search criteria.
        # example passing only required values which don't have defaults set
        api_response = api_instance.search_transcripts(transcripts_request)

        pprint(api_response)

    except fds.sdk.EventsandTranscripts.ApiException as e:
        print("Exception when calling TranscriptsApi->search_transcripts: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transcripts_request** | [**TranscriptsRequest**](TranscriptsRequest.md)| Criteria to search for transcripts. Select one mode of search. |

### Return type

[**TranscriptsResponse**](TranscriptsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The latest transcripts matching the specified criteria. |  -  |
**400** | Bad request |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

