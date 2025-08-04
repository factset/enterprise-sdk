# fds.sdk.GlobalFilings.FilingsAPIApi

All URIs are relative to *https://api.factset.com/content/global-filings/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_count**](FilingsAPIApi.md#get_count) | **GET** /count | Returns the count of filings for specified source.
[**get_filings**](FilingsAPIApi.md#get_filings) | **GET** /search | Returns the filings documents and related metadata within FactSet coverage.



# **get_count**
> CountResponse get_count(ids, sources)

Returns the count of filings for specified source.

Returns the count of filings documents along with other response fields.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.GlobalFilings
from fds.sdk.GlobalFilings.api import filings_api_api
from fds.sdk.GlobalFilings.models import *
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
configuration = fds.sdk.GlobalFilings.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.GlobalFilings.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.GlobalFilings.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = filings_api_api.FilingsAPIApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    ids = ["MODN-US"] # [str] | Requested symbols or securities.  This is a comma-separated list with a maximum limit of 1000.  Each symbol can be a FactSet exchange symbol, CUSIP, SEDOL, ISIN, or Entity ID
    sources = ["EDG"] # [str] | Code for document source to include.This is a comma-separated list. Use the `/meta/sources` endpoint to get the list of available sources.  
    start_date = "20240601" # str | Start Date. Format is YYYYMMDD or relative +/- days (0,-1,etc).  (optional)
    end_date = "20241101" # str | End Date. Format is YYYYMMDD or relative +/- days (0,-1,etc). (optional)
    time_zone = "America/New_York" # str | timeZone to return story dates and times.Time zones, represented in POSIX format, are automatically adjusted for daylight savings. timeZone names are sourced from the IANA timezone registry. (optional) if omitted the server will use the default value of "America/New_York"
    categories = ["CN:US"] # [str] | Code for categories to include.  This is a comma-separated list. Use the `/meta/categories` endpoint to get the list of available categories.  Default = All categories. (optional)
    primary_id = False # bool | Type of identifier search * true - Returns headlines of stories that have the searched identifier(s) as the primary  identifier. * false - Returns headlines of stories that mentioned or referred to the  identifier. (optional) if omitted the server will use the default value of False
    search_text = "Officer" # str | Restricts the search to include only document stories that include the searched text. This parameter supports boolean operators as well. (optional)
    form_types = ["15-12G"] # [str] | The search to include any form types of given sources (optional)

    try:
        # Returns the count of filings for specified source.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_count(ids, sources, start_date=start_date, end_date=end_date, time_zone=time_zone, categories=categories, primary_id=primary_id, search_text=search_text, form_types=form_types)

        pprint(api_response)

    except fds.sdk.GlobalFilings.ApiException as e:
        print("Exception when calling FilingsAPIApi->get_count: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | **[str]**| Requested symbols or securities.  This is a comma-separated list with a maximum limit of 1000.  Each symbol can be a FactSet exchange symbol, CUSIP, SEDOL, ISIN, or Entity ID |
 **sources** | **[str]**| Code for document source to include.This is a comma-separated list. Use the &#x60;/meta/sources&#x60; endpoint to get the list of available sources.   |
 **start_date** | **str**| Start Date. Format is YYYYMMDD or relative +/- days (0,-1,etc).  | [optional]
 **end_date** | **str**| End Date. Format is YYYYMMDD or relative +/- days (0,-1,etc). | [optional]
 **time_zone** | **str**| timeZone to return story dates and times.Time zones, represented in POSIX format, are automatically adjusted for daylight savings. timeZone names are sourced from the IANA timezone registry. | [optional] if omitted the server will use the default value of "America/New_York"
 **categories** | **[str]**| Code for categories to include.  This is a comma-separated list. Use the &#x60;/meta/categories&#x60; endpoint to get the list of available categories.  Default &#x3D; All categories. | [optional]
 **primary_id** | **bool**| Type of identifier search * true - Returns headlines of stories that have the searched identifier(s) as the primary  identifier. * false - Returns headlines of stories that mentioned or referred to the  identifier. | [optional] if omitted the server will use the default value of False
 **search_text** | **str**| Restricts the search to include only document stories that include the searched text. This parameter supports boolean operators as well. | [optional]
 **form_types** | **[str]**| The search to include any form types of given sources | [optional]

### Return type

[**CountResponse**](CountResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Bad request. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_filings**
> SearchResponse get_filings(ids, sources)

Returns the filings documents and related metadata within FactSet coverage.

Returns the filings documents within FactSet coverage along with other response fields.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.GlobalFilings
from fds.sdk.GlobalFilings.api import filings_api_api
from fds.sdk.GlobalFilings.models import *
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
configuration = fds.sdk.GlobalFilings.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.GlobalFilings.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.GlobalFilings.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = filings_api_api.FilingsAPIApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    ids = ["MODN-US"] # [str] | Requested symbols or securities.  This is a comma-separated list with a maximum limit of 1000.  Each symbol can be a FactSet exchange symbol, CUSIP, SEDOL, ISIN, or Entity ID
    sources = ["EDG"] # [str] | 
    start_date = "20240601" # str | Start Date. Format is YYYYMMDD or relative +/- days (0,-1,etc).  (optional)
    end_date = "20241101" # str | End Date. Format is YYYYMMDD or relative +/- days (0,-1,etc). (optional)
    pagination_limit = 20 # int | Number of results to return per page. (optional) if omitted the server will use the default value of 25
    pagination_offset = 0 # int | Page number of the results to return.  (optional) if omitted the server will use the default value of 0
    time_zone = "America/New_York" # str | timeZone to return story dates and times.Time zones, represented in POSIX format, are automatically adjusted for daylight savings. timeZone names are sourced from the IANA timezone registry. (optional) if omitted the server will use the default value of "America/New_York"
    sort = ["filingsDateTime"] # [str] | Enables sorting data in ascending or descending  order based on filingsDateTime.   * `filingsDateTime` - sorting results in chronological (ascending) order. If a start date is not specified, the    API has a 10-year searching limitation.   *  `-filingsDateTime` - sorting results in reverse chronological (descending) order. This is the default value if     the sort parameter isn't used in the query. (optional) if omitted the server will use the default value of ["-filingsDateTime"]
    categories = ["CN:US"] # [str] | Code for categories to include.  This is a comma-separated list. Use the `/meta/categories` endpoint to get the list of available categories.  Default = All categories. (optional)
    primary_id = False # bool | Type of identifier search * true - Returns headlines of stories that have the searched identifier(s) as the primary  identifier. * false - Returns headlines of stories that mentioned or referred to the  identifier. (optional) if omitted the server will use the default value of False
    search_text = "Officer" # str | Restricts the search to include only document stories that include the searched text. This parameter supports boolean operators as well. (optional)
    form_types = ["15-12G"] # [str] | The search to include any form types of given sources (optional)
    edgar_accession = "edgarAccession_example" # str | A unique identifier given to each EDGAR filings document. e.g. accession=0001013237-21-000069&sources=EDG.   > **Note:**  > When used in conjunction with the 'sources' parameter set to 'EDGAR, the API considers this accession for data retrieval.  > For non-EDGAR sources, this parameter is ignored. (optional)

    try:
        # Returns the filings documents and related metadata within FactSet coverage.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_filings(ids, sources, start_date=start_date, end_date=end_date, pagination_limit=pagination_limit, pagination_offset=pagination_offset, time_zone=time_zone, sort=sort, categories=categories, primary_id=primary_id, search_text=search_text, form_types=form_types, edgar_accession=edgar_accession)

        pprint(api_response)

    except fds.sdk.GlobalFilings.ApiException as e:
        print("Exception when calling FilingsAPIApi->get_filings: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | **[str]**| Requested symbols or securities.  This is a comma-separated list with a maximum limit of 1000.  Each symbol can be a FactSet exchange symbol, CUSIP, SEDOL, ISIN, or Entity ID |
 **sources** | **[str]**|  |
 **start_date** | **str**| Start Date. Format is YYYYMMDD or relative +/- days (0,-1,etc).  | [optional]
 **end_date** | **str**| End Date. Format is YYYYMMDD or relative +/- days (0,-1,etc). | [optional]
 **pagination_limit** | **int**| Number of results to return per page. | [optional] if omitted the server will use the default value of 25
 **pagination_offset** | **int**| Page number of the results to return.  | [optional] if omitted the server will use the default value of 0
 **time_zone** | **str**| timeZone to return story dates and times.Time zones, represented in POSIX format, are automatically adjusted for daylight savings. timeZone names are sourced from the IANA timezone registry. | [optional] if omitted the server will use the default value of "America/New_York"
 **sort** | **[str]**| Enables sorting data in ascending or descending  order based on filingsDateTime.   * &#x60;filingsDateTime&#x60; - sorting results in chronological (ascending) order. If a start date is not specified, the    API has a 10-year searching limitation.   *  &#x60;-filingsDateTime&#x60; - sorting results in reverse chronological (descending) order. This is the default value if     the sort parameter isn&#39;t used in the query. | [optional] if omitted the server will use the default value of ["-filingsDateTime"]
 **categories** | **[str]**| Code for categories to include.  This is a comma-separated list. Use the &#x60;/meta/categories&#x60; endpoint to get the list of available categories.  Default &#x3D; All categories. | [optional]
 **primary_id** | **bool**| Type of identifier search * true - Returns headlines of stories that have the searched identifier(s) as the primary  identifier. * false - Returns headlines of stories that mentioned or referred to the  identifier. | [optional] if omitted the server will use the default value of False
 **search_text** | **str**| Restricts the search to include only document stories that include the searched text. This parameter supports boolean operators as well. | [optional]
 **form_types** | **[str]**| The search to include any form types of given sources | [optional]
 **edgar_accession** | **str**| A unique identifier given to each EDGAR filings document. e.g. accession&#x3D;0001013237-21-000069&amp;sources&#x3D;EDG.   &gt; **Note:**  &gt; When used in conjunction with the &#39;sources&#39; parameter set to &#39;EDGAR, the API considers this accession for data retrieval.  &gt; For non-EDGAR sources, this parameter is ignored. | [optional]

### Return type

[**SearchResponse**](SearchResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Array of downloadable URLs consisting of Filings documents with related metadata. |  -  |
**400** | Bad request. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

