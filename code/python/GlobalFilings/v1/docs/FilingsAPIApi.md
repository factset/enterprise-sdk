# fds.sdk.GlobalFilings.FilingsAPIApi

All URIs are relative to *https://api.factset.com/global-filings/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_count**](FilingsAPIApi.md#get_count) | **GET** /count | Returns the count of filings for specified source.
[**get_filings**](FilingsAPIApi.md#get_filings) | **GET** /search | Returns the filings documents and related metadata within FactSet coverage.
[**get_formtype**](FilingsAPIApi.md#get_formtype) | **GET** /reference/form-types | Returns the form types of EDGAR.
[**get_sources**](FilingsAPIApi.md#get_sources) | **GET** /reference/sources | Returns the sources.
[**get_timezone**](FilingsAPIApi.md#get_timezone) | **GET** /reference/time-zones | Returns the time zones.
[**getcategories**](FilingsAPIApi.md#getcategories) | **GET** /reference/categories | Returns the categories.



# **get_count**
> ResponseCount get_count(sources)

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
    sources = ["EDG"] # [str] | Code for document source to include.This is a comma-separated list. Use the ```/reference/sources``` endpoint to get the list of available sources.  
    start_date = "20231222" # str | Start Date. Format is YYYYMMDD or relative +/- days (0,-1,etc).  **Note:** **The API supports data from 1995 onwards. Ensure that the provided Date falls within this range for accurate results.**  (optional) if omitted the server will use the default value of "0"
    end_date = "20231223" # str | End Date. Format is YYYYMMDD or relative +/- days (0,-1,etc). (optional) if omitted the server will use the default value of "0"
    ids = ["MODN-US"] # [str] | Requested symbols or securities.  This is a comma-separated list with a maximum limit of 1000.  Each symbol can be a FactSet exchange symbol, CUSIP, or SEDOL. (optional)

    try:
        # Returns the count of filings for specified source.
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
 **sources** | **[str]**| Code for document source to include.This is a comma-separated list. Use the &#x60;&#x60;&#x60;/reference/sources&#x60;&#x60;&#x60; endpoint to get the list of available sources.   |
 **start_date** | **str**| Start Date. Format is YYYYMMDD or relative +/- days (0,-1,etc).  **Note:** **The API supports data from 1995 onwards. Ensure that the provided Date falls within this range for accurate results.**  | [optional] if omitted the server will use the default value of "0"
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
    sources = ["EDG"] # [str] | Code for document source to include.  This is a comma-separated list. Use the ```/reference/sources``` endpoint to get the list of available sources.
    ids = ["MODN-US"] # [str] | Requested symbols or securities.  This is a comma-separated list with a maximum limit of 1000.  Each symbol can be a FactSet exchange symbol, CUSIP, or SEDOL. (optional)
    start_date = "20231222" # str | Start Date. Format is YYYYMMDD or relative +/- days (0,-1,etc).  **Note:** **The API supports data from 1995 onwards. Ensure that the provided Date falls within this range for accurate results.**  (optional) if omitted the server will use the default value of "0"
    end_date = "20231223" # str | End Date. Format is YYYYMMDD or relative +/- days (0,-1,etc). (optional) if omitted the server will use the default value of "0"
    pagination_limit = 20 # int | Number of results to return per page. (optional) if omitted the server will use the default value of 25
    pagination_offset = 1 # int | Page number of the results to return. (optional)
    time_zone = "America/New_York" # str | timeZone to return story dates and times.Time zones, represented in POSIX format, are automatically adjusted for daylight savings. timeZone names are sourced from the IANA timezone registry. (optional) if omitted the server will use the default value of "America/New_York"
    sort = "desc" # str | Sorting the results in chronological (oldest to newest) or reverse chronological (newest to oldest) order.    *  desc - sorting results in reverse chronological (descending) order. This is the default value if     the sort parameter isn't used in the query.       *   asc - sorting results in chronological (ascending) order. If a start date is not specified, the    API has a 10-year searching limitation.  (optional) if omitted the server will use the default value of "desc"
    categories = ["CN:US","LN:EN"] # [str] | Code for categories to include.  This is a comma-separated list. Use the ```/reference/categories``` endpoint to get the list of available categories.  Default = All categories. (optional)
    primary_id = False # bool | Type of identifier search * true - Returns headlines of stories that have the searched identifier(s) as the primary  identifier. * false - Returns headlines of stories that mentioned or referred to the  identifier. (optional) if omitted the server will use the default value of False
    search_text = "Updates" # str | Restricts the search to include only document stories which include the text searched. (optional)
    edgar_form_type = "edgarFormType_example" # str | Restricts the search to include any form types of EDGAR.  **Note:This parameter applies exclusively to EDGAR searches; it is ignored when used with non-EDGAR sources.**  (optional)
    edgar_accession = "edgarAccession_example" # str | A unique identifier given to each EDGAR filings document. e.g. accession=0001013237-21-000069&sources=EDG.  **Note:  When used in conjunction with the 'source' parameter set to 'EDGAR', the API considers this accession for data retrieval. For non-EDGAR sources, this parameter is ignored.** (optional)

    try:
        # Returns the filings documents and related metadata within FactSet coverage.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_filings(sources, ids=ids, start_date=start_date, end_date=end_date, pagination_limit=pagination_limit, pagination_offset=pagination_offset, time_zone=time_zone, sort=sort, categories=categories, primary_id=primary_id, search_text=search_text, edgar_form_type=edgar_form_type, edgar_accession=edgar_accession)

        pprint(api_response)

    except fds.sdk.GlobalFilings.ApiException as e:
        print("Exception when calling FilingsAPIApi->get_filings: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sources** | **[str]**| Code for document source to include.  This is a comma-separated list. Use the &#x60;&#x60;&#x60;/reference/sources&#x60;&#x60;&#x60; endpoint to get the list of available sources. |
 **ids** | **[str]**| Requested symbols or securities.  This is a comma-separated list with a maximum limit of 1000.  Each symbol can be a FactSet exchange symbol, CUSIP, or SEDOL. | [optional]
 **start_date** | **str**| Start Date. Format is YYYYMMDD or relative +/- days (0,-1,etc).  **Note:** **The API supports data from 1995 onwards. Ensure that the provided Date falls within this range for accurate results.**  | [optional] if omitted the server will use the default value of "0"
 **end_date** | **str**| End Date. Format is YYYYMMDD or relative +/- days (0,-1,etc). | [optional] if omitted the server will use the default value of "0"
 **pagination_limit** | **int**| Number of results to return per page. | [optional] if omitted the server will use the default value of 25
 **pagination_offset** | **int**| Page number of the results to return. | [optional]
 **time_zone** | **str**| timeZone to return story dates and times.Time zones, represented in POSIX format, are automatically adjusted for daylight savings. timeZone names are sourced from the IANA timezone registry. | [optional] if omitted the server will use the default value of "America/New_York"
 **sort** | **str**| Sorting the results in chronological (oldest to newest) or reverse chronological (newest to oldest) order.    *  desc - sorting results in reverse chronological (descending) order. This is the default value if     the sort parameter isn&#39;t used in the query.       *   asc - sorting results in chronological (ascending) order. If a start date is not specified, the    API has a 10-year searching limitation.  | [optional] if omitted the server will use the default value of "desc"
 **categories** | **[str]**| Code for categories to include.  This is a comma-separated list. Use the &#x60;&#x60;&#x60;/reference/categories&#x60;&#x60;&#x60; endpoint to get the list of available categories.  Default &#x3D; All categories. | [optional]
 **primary_id** | **bool**| Type of identifier search * true - Returns headlines of stories that have the searched identifier(s) as the primary  identifier. * false - Returns headlines of stories that mentioned or referred to the  identifier. | [optional] if omitted the server will use the default value of False
 **search_text** | **str**| Restricts the search to include only document stories which include the text searched. | [optional]
 **edgar_form_type** | **str**| Restricts the search to include any form types of EDGAR.  **Note:This parameter applies exclusively to EDGAR searches; it is ignored when used with non-EDGAR sources.**  | [optional]
 **edgar_accession** | **str**| A unique identifier given to each EDGAR filings document. e.g. accession&#x3D;0001013237-21-000069&amp;sources&#x3D;EDG.  **Note:  When used in conjunction with the &#39;source&#39; parameter set to &#39;EDGAR&#39;, the API considers this accession for data retrieval. For non-EDGAR sources, this parameter is ignored.** | [optional]

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

# **get_formtype**
> ResponseFormtype get_formtype()

Returns the form types of EDGAR.

 Retrieves and delivers a comprehensive list of all available  `formTypes`.

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

    try:
        # Returns the form types of EDGAR.
        # example, this endpoint has no required or optional parameters
        api_response = api_instance.get_formtype()

        pprint(api_response)

    except fds.sdk.GlobalFilings.ApiException as e:
        print("Exception when calling FilingsAPIApi->get_formtype: %s\n" % e)
```


### Parameters
This endpoint does not need any parameter.

### Return type

[**ResponseFormtype**](ResponseFormtype.md)

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

# **get_sources**
> ResponseSources get_sources()

Returns the sources.

Retrieves and delivers a comprehensive list of all available `sources`.

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

    try:
        # Returns the sources.
        # example, this endpoint has no required or optional parameters
        api_response = api_instance.get_sources()

        pprint(api_response)

    except fds.sdk.GlobalFilings.ApiException as e:
        print("Exception when calling FilingsAPIApi->get_sources: %s\n" % e)
```


### Parameters
This endpoint does not need any parameter.

### Return type

[**ResponseSources**](ResponseSources.md)

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

# **get_timezone**
> ResponseTime get_timezone()

Returns the time zones.

Retrieves and delivers a comprehensive list of all available `timeZones`.

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

    try:
        # Returns the time zones.
        # example, this endpoint has no required or optional parameters
        api_response = api_instance.get_timezone()

        pprint(api_response)

    except fds.sdk.GlobalFilings.ApiException as e:
        print("Exception when calling FilingsAPIApi->get_timezone: %s\n" % e)
```


### Parameters
This endpoint does not need any parameter.

### Return type

[**ResponseTime**](ResponseTime.md)

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

# **getcategories**
> ResponseCategies getcategories()

Returns the categories.

Retrieves and delivers a comprehensive list of all available `categories`.

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

    try:
        # Returns the categories.
        # example, this endpoint has no required or optional parameters
        api_response = api_instance.getcategories()

        pprint(api_response)

    except fds.sdk.GlobalFilings.ApiException as e:
        print("Exception when calling FilingsAPIApi->getcategories: %s\n" % e)
```


### Parameters
This endpoint does not need any parameter.

### Return type

[**ResponseCategies**](ResponseCategies.md)

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

