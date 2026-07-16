# fds.sdk.FactSetRBICS.EntityApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_rbics_entity_focus**](EntityApi.md#get_rbics_entity_focus) | **GET** /factset-rbics/v1/entity-focus | Get RBICS classification for the Focus industry
[**get_rbics_entity_focus_for_list**](EntityApi.md#get_rbics_entity_focus_for_list) | **POST** /factset-rbics/v1/entity-focus | Get RBICS classification for the Focus industry
[**get_rbics_entity_revenue**](EntityApi.md#get_rbics_entity_revenue) | **GET** /factset-rbics/v1/entity/revenue | Get a company&#39;s revenue breakdown by RBICS classification.
[**get_rbics_entity_revenue_for_list**](EntityApi.md#get_rbics_entity_revenue_for_list) | **POST** /factset-rbics/v1/entity/revenue | Get a company&#39;s revenue breakdown by RBICS classification.



# **get_rbics_entity_focus**
> EntityFocusResponse get_rbics_entity_focus(ids)

Get RBICS classification for the Focus industry

Gets RBICS classifications for the Focus industry for a short list of companies. Full history is included if _date_ parameter is not specified.    RBICS Focus offers a single-sector mapping of about 48,000 of the most liquid and publicly-traded companies based on their primary lines of business; it uses revenues as the key factor in determining a company’s primary line of business, by mapping a company to the lowest-level sector from which it derives 50% or more of its revenues.    The RBICS Extended Universe – Industry Group is not currently supported through the RBICS API. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetRBICS
from fds.sdk.FactSetRBICS.api import entity_api
from fds.sdk.FactSetRBICS.models import *
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
configuration = fds.sdk.FactSetRBICS.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetRBICS.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetRBICS.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = entity_api.EntityApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    ids = ["AAPL-US","0FPWZZ-E","TSLA-US"] # [str] | List of Company identifiers. Accepted identifiers include Ticker-Exchange, Ticker-Regions, CUSIPs, ISINs, SEDOLs, or FactSet Permanent Ids, such as -R, -L, or -E.<p>**ids limit = 2500 per request**</p>    Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p> 
    date = "2017-07-24" # str | Effective date for data expressed in YYYY-MM-DD format. If no date is requested, the default behavior is to return the full history for the requested entity. (optional)
    levels = [1,3,6] # [int] | List of RBICS industry levels to include in the response. **By default if left blank, all levels are returned.** (optional)
    include_names = True # bool | Option to include or exclude industry Names and the L6 Description. true = Include Names; false = Exclude Names. (optional) if omitted the server will use the default value of True

    try:
        # Get RBICS classification for the Focus industry
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_rbics_entity_focus(ids, date=date, levels=levels, include_names=include_names)

        pprint(api_response)

    except fds.sdk.FactSetRBICS.ApiException as e:
        print("Exception when calling EntityApi->get_rbics_entity_focus: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | **[str]**| List of Company identifiers. Accepted identifiers include Ticker-Exchange, Ticker-Regions, CUSIPs, ISINs, SEDOLs, or FactSet Permanent Ids, such as -R, -L, or -E.&lt;p&gt;**ids limit &#x3D; 2500 per request**&lt;/p&gt;    Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;  |
 **date** | **str**| Effective date for data expressed in YYYY-MM-DD format. If no date is requested, the default behavior is to return the full history for the requested entity. | [optional]
 **levels** | **[int]**| List of RBICS industry levels to include in the response. **By default if left blank, all levels are returned.** | [optional]
 **include_names** | **bool**| Option to include or exclude industry Names and the L6 Description. true &#x3D; Include Names; false &#x3D; Exclude Names. | [optional] if omitted the server will use the default value of True

### Return type

[**EntityFocusResponse**](EntityFocusResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful Response producing an array of Entity Focus Objects |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_rbics_entity_focus_for_list**
> EntityFocusResponse get_rbics_entity_focus_for_list(entity_focus_request)

Get RBICS classification for the Focus industry

Gets RBICS classifications for the Focus industry for a long list of companies. Full history is included if _date_ parameter is not specified.    RBICS Focus offers a single-sector mapping of about 48,000 of the most liquid and publicly-traded companies based on their primary lines of business; it uses revenues as the key factor in determining a company’s primary line of business, by mapping a company to the lowest-level sector from which it derives 50% or more of its revenues.    The RBICS Extended Universe – Industry Group is not currently supported through the RBICS API. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetRBICS
from fds.sdk.FactSetRBICS.api import entity_api
from fds.sdk.FactSetRBICS.models import *
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
configuration = fds.sdk.FactSetRBICS.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetRBICS.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetRBICS.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = entity_api.EntityApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    entity_focus_request = EntityFocusRequest(
        ids=Ids(["FDS-US","0FPWZZ-E","TSLA-US"]),
        date=dateutil_parser('Wed Sep 30 00:00:00 UTC 2020').date(),
        levels=Levels([1,3,6]),
        include_names=True,
    ) # EntityFocusRequest | Request Body to request a list of RBICS Entity Focus objects.

    try:
        # Get RBICS classification for the Focus industry
        # example passing only required values which don't have defaults set
        api_response = api_instance.get_rbics_entity_focus_for_list(entity_focus_request)

        pprint(api_response)

    except fds.sdk.FactSetRBICS.ApiException as e:
        print("Exception when calling EntityApi->get_rbics_entity_focus_for_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **entity_focus_request** | [**EntityFocusRequest**](EntityFocusRequest.md)| Request Body to request a list of RBICS Entity Focus objects. |

### Return type

[**EntityFocusResponse**](EntityFocusResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful Response producing an array of Entity Focus Objects |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_rbics_entity_revenue**
> EntityResponse get_rbics_entity_revenue(ids)

Get a company's revenue breakdown by RBICS classification.

Access a comprehensive, hierarchical breakdown of a company's revenue according to each RBICS industry classification. This endpoint aligns a company's reported business segment revenues with the complete, multi-level RBICS taxonomy, offering the percentage of total revenue attributed to each industry.  For Mutual Funds and ETFs we only have data from L1-L4 and requires additional access to get this data. Note that, the response time can exceed 20+ seconds when querying for more than one year of data.  As such we do not recommend requesting for more than 1 ID at a time for history.   Use the `level` parameter to control the depth of the returned taxonomy, from Economy (L1) down to Sub-Industry (L6). 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetRBICS
from fds.sdk.FactSetRBICS.api import entity_api
from fds.sdk.FactSetRBICS.models import *
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
configuration = fds.sdk.FactSetRBICS.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetRBICS.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetRBICS.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = entity_api.EntityApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    ids = ["AAPL-US","0FPWZZ-E","TSLA-US"] # [str] | List of Company identifiers. Accepted identifiers include Ticker-Exchange, Ticker-Regions, CUSIPs, ISINs, SEDOLs, or FactSet Permanent Ids, such as -R, -L, or -E.<p>**ids limit = 2500 per request**</p>    Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p> 
    start_date = dateutil_parser('2021-08-27').date() # date | Specifies the start date for the requested date range, formatted as **YYYY-MM-DD**. The data returned will be reflective of the classifications or revenue data as of this date and forward. The `startDate` must be equal to or before the `endDate`. Future dates (T+1) are not accepted in this endpoint.  Note:  - If omitted while `endDate` is specified: Data will be fetched from the earliest available record up to the specified end date. - If both `startDate` and `endDate` are omitted: The response will return the latest available data.  (optional)
    end_date = dateutil_parser('2022-08-27').date() # date | Specifies the end date for the requested date range, formatted as **YYYY-MM-DD**. The data returned will be reflective of the classifications or revenue data as of this date and earlier. The `endDate` must be equal to or after the `startDate`. Future dates (T+1) are not accepted in this endpoint.  Note: - If omitted (with `startDate` specified): Data will be returned from the specified start date up to the most recent available date. - If both `startDate` and `endDate` are omitted: The response will return the latest available data.  (optional)
    level = 6 # int | Specifies the deepest level of the RBICS taxonomy to be included in the revenue breakdown. The response will include all levels from 1 up to the specified level. For example, a value of '3' will return revenue percentages for Economy (L1), Sector (L2), and Sub-Sector (L3). The default behavior is to return all 6 levels.   |Level|Description|Number of Groups|   |---|---|---|   |1|Economy|14|   |2|Sector|37|   |3|Sub-Sector|109|   |4|Industry Group|366|   |5|Industry|901|   |6|Sub-Industry|1629|  (optional)

    try:
        # Get a company's revenue breakdown by RBICS classification.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_rbics_entity_revenue(ids, start_date=start_date, end_date=end_date, level=level)

        pprint(api_response)

    except fds.sdk.FactSetRBICS.ApiException as e:
        print("Exception when calling EntityApi->get_rbics_entity_revenue: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | **[str]**| List of Company identifiers. Accepted identifiers include Ticker-Exchange, Ticker-Regions, CUSIPs, ISINs, SEDOLs, or FactSet Permanent Ids, such as -R, -L, or -E.&lt;p&gt;**ids limit &#x3D; 2500 per request**&lt;/p&gt;    Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;  |
 **start_date** | **date**| Specifies the start date for the requested date range, formatted as **YYYY-MM-DD**. The data returned will be reflective of the classifications or revenue data as of this date and forward. The &#x60;startDate&#x60; must be equal to or before the &#x60;endDate&#x60;. Future dates (T+1) are not accepted in this endpoint.  Note:  - If omitted while &#x60;endDate&#x60; is specified: Data will be fetched from the earliest available record up to the specified end date. - If both &#x60;startDate&#x60; and &#x60;endDate&#x60; are omitted: The response will return the latest available data.  | [optional]
 **end_date** | **date**| Specifies the end date for the requested date range, formatted as **YYYY-MM-DD**. The data returned will be reflective of the classifications or revenue data as of this date and earlier. The &#x60;endDate&#x60; must be equal to or after the &#x60;startDate&#x60;. Future dates (T+1) are not accepted in this endpoint.  Note: - If omitted (with &#x60;startDate&#x60; specified): Data will be returned from the specified start date up to the most recent available date. - If both &#x60;startDate&#x60; and &#x60;endDate&#x60; are omitted: The response will return the latest available data.  | [optional]
 **level** | **int**| Specifies the deepest level of the RBICS taxonomy to be included in the revenue breakdown. The response will include all levels from 1 up to the specified level. For example, a value of &#39;3&#39; will return revenue percentages for Economy (L1), Sector (L2), and Sub-Sector (L3). The default behavior is to return all 6 levels.   |Level|Description|Number of Groups|   |---|---|---|   |1|Economy|14|   |2|Sector|37|   |3|Sub-Sector|109|   |4|Industry Group|366|   |5|Industry|901|   |6|Sub-Industry|1629|  | [optional]

### Return type

[**EntityResponse**](EntityResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response returning a company&#39;s revenue breakdown by RBICS classification. |  -  |
**400** | Bad request. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**415** | Unsupported Media Type |  -  |
**500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_rbics_entity_revenue_for_list**
> EntityResponse get_rbics_entity_revenue_for_list(entity_request)

Get a company's revenue breakdown by RBICS classification.

Access a comprehensive, hierarchical breakdown of a company's revenue according to each RBICS industry classification. This endpoint aligns a company's reported business segment revenues with the complete, multi-level RBICS taxonomy, offering the percentage of total revenue attributed to each industry.  For Mutual Funds and ETFs we only have data from L1-L4 and requires additional access to get this data. Note that, the response time can exceed 20+ seconds when querying for more than one year of data.  As such we do not recommend requesting for more than 1 ID at a time for history.  Use the `level` parameter to control the depth of the returned taxonomy, from Economy (L1) down to Sub-Industry (L6). Use the POST method for large lists of identifiers. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetRBICS
from fds.sdk.FactSetRBICS.api import entity_api
from fds.sdk.FactSetRBICS.models import *
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
configuration = fds.sdk.FactSetRBICS.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetRBICS.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetRBICS.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = entity_api.EntityApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    entity_request = EntityRequest(
        ids=Ids(["FDS-US","0FPWZZ-E","TSLA-US"]),
        start_date=dateutil_parser('Fri Aug 27 00:00:00 UTC 2021').date(),
        end_date=dateutil_parser('Fri Aug 27 00:00:00 UTC 2021').date(),
        level=Level(6),
    ) # EntityRequest | Request Body to request a list of Entity Revenue objects.

    try:
        # Get a company's revenue breakdown by RBICS classification.
        # example passing only required values which don't have defaults set
        api_response = api_instance.get_rbics_entity_revenue_for_list(entity_request)

        pprint(api_response)

    except fds.sdk.FactSetRBICS.ApiException as e:
        print("Exception when calling EntityApi->get_rbics_entity_revenue_for_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **entity_request** | [**EntityRequest**](EntityRequest.md)| Request Body to request a list of Entity Revenue objects. |

### Return type

[**EntityResponse**](EntityResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response returning a company&#39;s revenue breakdown by RBICS classification. |  -  |
**400** | Bad request. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**415** | Unsupported Media Type |  -  |
**500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

