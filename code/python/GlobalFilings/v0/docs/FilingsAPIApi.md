# fds.sdk.GlobalFilings.FilingsAPIApi

All URIs are relative to *https://api.factset.com/global-filings/v0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_count**](FilingsAPIApi.md#get_count) | **GET** /count | Returns the count of filings for specified source
[**get_filings**](FilingsAPIApi.md#get_filings) | **GET** /search | Returns the filings documents and related metadata within FactSet coverage.
[**get_helper**](FilingsAPIApi.md#get_helper) | **GET** /helper | Returns the static values for various parameters



# **get_count**
> ResponseCount get_count(sources)

Returns the count of filings for specified source

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
    sources = ["EDG"] # [str] | Code for document source to include.This is a comma-separated list. Use the ```/helper``` endpoint to get the list of available sources.  
    start_date = "20231222" # str | Start Date. Format is YYYYMMDD or relative +/- days (0,-1,etc). (optional) if omitted the server will use the default value of "0"
    end_date = "20231223" # str | End Date. Format is YYYYMMDD or relative +/- days (0,-1,etc). (optional) if omitted the server will use the default value of "0"
    ids = ["MODN-US"] # [str] | Requested symbols or securities.  This is a comma-separated list with a maximum limit of 1000.  Each symbol can be a FactSet exchange symbol, CUSIP, or SEDOL. (optional)

    try:
        # Returns the count of filings for specified source
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_count(sources, start_date=start_date, end_date=end_date, ids=ids)

        pprint(api_response)

    except fds.sdk.GlobalFilings.ApiException as e:
        print("Exception when calling FilingsAPIApi->get_count: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sources** | **[str]**| Code for document source to include.This is a comma-separated list. Use the &#x60;&#x60;&#x60;/helper&#x60;&#x60;&#x60; endpoint to get the list of available sources.   |
 **report** | **str**| retrives count of source. | defaults to "count"
 **start_date** | **str**| Start Date. Format is YYYYMMDD or relative +/- days (0,-1,etc). | [optional] if omitted the server will use the default value of "0"
 **end_date** | **str**| End Date. Format is YYYYMMDD or relative +/- days (0,-1,etc). | [optional] if omitted the server will use the default value of "0"
 **ids** | **[str]**| Requested symbols or securities.  This is a comma-separated list with a maximum limit of 1000.  Each symbol can be a FactSet exchange symbol, CUSIP, or SEDOL. | [optional]

### Return type

[**ResponseCount**](ResponseCount.md)

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
> InvestmentResearch get_filings(sources)

Returns the filings documents and related metadata within FactSet coverage.

Returns the filings documents within FactSet coverage along with other response fields

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
    sources = ["EDG"] # [str] | Code for document source to include.  This is a comma-separated list. Use the ```/helper``` endpoint to get the list of available sources.
    ids = ["MODN-US"] # [str] | Requested symbols or securities.  This is a comma-separated list with a maximum limit of 1000.  Each symbol can be a FactSet exchange symbol, CUSIP, or SEDOL. (optional)
    start_date = "20231222" # str | Start Date. Format is YYYYMMDD or relative +/- days (0,-1,etc). (optional) if omitted the server will use the default value of "0"
    end_date = "20231223" # str | End Date. Format is YYYYMMDD or relative +/- days (0,-1,etc). (optional) if omitted the server will use the default value of "0"
    pagination_limit = 20 # int | Number of results to return per page. (optional) if omitted the server will use the default value of 25
    pagination_offset = 1 # int | Page number of the results to return. (optional)
    timezone = "America/New_York" # str | Time zone to return story dates and times. Time zones are in POSIX format and automatically adjusted for daylight savings. (optional) if omitted the server will use the default value of "America/New_York"
    sort = "desc" # str | Sorting the results in chronological (oldest to newest) or reverse chronological (newest to oldest) order.    *  desc - sorting results in reverse chronological (descending) order. This is the default value if     the sort parameter isn’t used in the query       *   asc - sorting results in chronological (ascending) order. If a start date is not specified, the    API has a 10-year searching limitation.  (optional) if omitted the server will use the default value of "desc"
    categories = ["CN:US","LN:EN"] # [str] | Code for categories to include.  This is a comma-separated list. Use the ```/helper``` endpoint to get the list of available categories.  Default = All categories. (optional)
    primary_id = "N" # str | Type of identifier search * Y - Returns headlines of stories that have the search ID(s) as the Primary ID. * N - Returns headlines of stories that mention/refer to the ID(s). (optional) if omitted the server will use the default value of "N"
    search_text = "Updates" # str | Restricts the search to include only document stories which include the text searched. (optional)
    form_type = "formType_example" # str | Restricts the search to include any form types of EDGAR. (optional)
    accession = "accession_example" # str | A unique identifier given to each EDGAR filings document. e.g. accession=0001013237-21-000069&sources=EDG (optional)

    try:
        # Returns the filings documents and related metadata within FactSet coverage.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_filings(sources, ids=ids, start_date=start_date, end_date=end_date, pagination_limit=pagination_limit, pagination_offset=pagination_offset, timezone=timezone, sort=sort, categories=categories, primary_id=primary_id, search_text=search_text, form_type=form_type, accession=accession)

        pprint(api_response)

    except fds.sdk.GlobalFilings.ApiException as e:
        print("Exception when calling FilingsAPIApi->get_filings: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sources** | **[str]**| Code for document source to include.  This is a comma-separated list. Use the &#x60;&#x60;&#x60;/helper&#x60;&#x60;&#x60; endpoint to get the list of available sources. |
 **ids** | **[str]**| Requested symbols or securities.  This is a comma-separated list with a maximum limit of 1000.  Each symbol can be a FactSet exchange symbol, CUSIP, or SEDOL. | [optional]
 **start_date** | **str**| Start Date. Format is YYYYMMDD or relative +/- days (0,-1,etc). | [optional] if omitted the server will use the default value of "0"
 **end_date** | **str**| End Date. Format is YYYYMMDD or relative +/- days (0,-1,etc). | [optional] if omitted the server will use the default value of "0"
 **pagination_limit** | **int**| Number of results to return per page. | [optional] if omitted the server will use the default value of 25
 **pagination_offset** | **int**| Page number of the results to return. | [optional]
 **timezone** | **str**| Time zone to return story dates and times. Time zones are in POSIX format and automatically adjusted for daylight savings. | [optional] if omitted the server will use the default value of "America/New_York"
 **sort** | **str**| Sorting the results in chronological (oldest to newest) or reverse chronological (newest to oldest) order.    *  desc - sorting results in reverse chronological (descending) order. This is the default value if     the sort parameter isn’t used in the query       *   asc - sorting results in chronological (ascending) order. If a start date is not specified, the    API has a 10-year searching limitation.  | [optional] if omitted the server will use the default value of "desc"
 **categories** | **[str]**| Code for categories to include.  This is a comma-separated list. Use the &#x60;&#x60;&#x60;/helper&#x60;&#x60;&#x60; endpoint to get the list of available categories.  Default &#x3D; All categories. | [optional]
 **primary_id** | **str**| Type of identifier search * Y - Returns headlines of stories that have the search ID(s) as the Primary ID. * N - Returns headlines of stories that mention/refer to the ID(s). | [optional] if omitted the server will use the default value of "N"
 **search_text** | **str**| Restricts the search to include only document stories which include the text searched. | [optional]
 **form_type** | **str**| Restricts the search to include any form types of EDGAR. | [optional]
 **accession** | **str**| A unique identifier given to each EDGAR filings document. e.g. accession&#x3D;0001013237-21-000069&amp;sources&#x3D;EDG | [optional]

### Return type

[**InvestmentResearch**](InvestmentResearch.md)

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

# **get_helper**
> ResponseHelper get_helper()

Returns the static values for various parameters

Returns the static values for sources,formTypes,timeZones,categories based on the specified parameter

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
    fields = "sources" # str | Request data for given field. (optional)

    try:
        # Returns the static values for various parameters
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_helper(fields=fields)

        pprint(api_response)

    except fds.sdk.GlobalFilings.ApiException as e:
        print("Exception when calling FilingsAPIApi->get_helper: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fields** | **str**| Request data for given field. | [optional]

### Return type

[**ResponseHelper**](ResponseHelper.md)

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

