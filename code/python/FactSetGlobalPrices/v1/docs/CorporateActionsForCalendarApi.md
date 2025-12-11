# fds.sdk.FactSetGlobalPrices.CorporateActionsForCalendarApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_corporate_actions**](CorporateActionsForCalendarApi.md#get_corporate_actions) | **GET** /factset-global-prices/v1/calendar/corporate-actions | Retrieve Event Calendar information for Corporate Actions
[**get_dividends**](CorporateActionsForCalendarApi.md#get_dividends) | **GET** /factset-global-prices/v1/calendar/dividends | Retrieve Dividend information
[**get_event_count**](CorporateActionsForCalendarApi.md#get_event_count) | **GET** /factset-global-prices/v1/calendar/event-count | Retrieve daily event count for a given date range
[**get_exchanges**](CorporateActionsForCalendarApi.md#get_exchanges) | **GET** /factset-global-prices/v1/calendar/meta/exchanges | Returns a list of exchanges for which event/action data is available.
[**get_rights_issues**](CorporateActionsForCalendarApi.md#get_rights_issues) | **GET** /factset-global-prices/v1/calendar/rights-issues | Retrieve Rights Issue information
[**get_spin_offs**](CorporateActionsForCalendarApi.md#get_spin_offs) | **GET** /factset-global-prices/v1/calendar/spin-offs | Retrieve Spin Off information
[**get_splits**](CorporateActionsForCalendarApi.md#get_splits) | **GET** /factset-global-prices/v1/calendar/splits | Retrieve Split information
[**get_stock_distributions**](CorporateActionsForCalendarApi.md#get_stock_distributions) | **GET** /factset-global-prices/v1/calendar/stock-distributions | Retrieve Stock Distribution information



# **get_corporate_actions**
> CorporateActionsResponseCalendar get_corporate_actions()

Retrieve Event Calendar information for Corporate Actions

Gives an overview of all available Corporate Actions over a specified date range. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetGlobalPrices
from fds.sdk.FactSetGlobalPrices.api import corporate_actions_for_calendar_api
from fds.sdk.FactSetGlobalPrices.models import *
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
configuration = fds.sdk.FactSetGlobalPrices.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetGlobalPrices.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetGlobalPrices.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = corporate_actions_for_calendar_api.CorporateActionsForCalendarApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    ids = ["IBM-US"] # [str] | The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent IDs. If not specified, the data related to all the IDs is returned. (optional)
    start_date = dateutil_parser('Mon Dec 31 00:00:00 UTC 2018').date() # date | The start date requested for a given date range in **YYYY-MM-DD** format. If both start and end dates are omitted, the API will return data for the current week starting from Monday. (optional)
    end_date = dateutil_parser('Tue Dec 31 00:00:00 UTC 2019').date() # date | The end date requested for a given date range in **YYYY-MM-DD** format. The max date range is 1 year for up to 100 identifiers. If IDs are more than 100 or omitted, the max range is restricted to 90 days. (optional)
    event_categories = [
        "CASH_DIVS",
    ] # [str] | Select one or more Event Categories from the dropdown:   - **CASH_DIVS:** Includes Dividends(DVC), Dividend with DRP Option(DVCD), Dividend Reinvestment(DRP)   - **STOCK_DIST:** Includes Stock Dividend(DVS), Stock Dividend - Special(DVSS), Bonus(BNS), Bonus - Special(BNSS)   - **SPINOFFS:** Includes Spin Off(SPO)   - **RIGHTS:** Includes Rights Issue(DSR)   - **SPLITS:** Includes Forward Split(FSP), Reverse Split(RSP), Split(SPL), Exchange Of Securities(EXOS)  If omitted, the data is returned for all the available eventCategories.  (optional)
    exchanges = ["NYS","NAS"] # [str] | One or more exchange codes for which data is to be requested. When omitted, the data from all the supported exchanges is returned. See `/meta/exchanges` for available values. (optional)
    sort = ["-eventDate"] # [str] | Sorts the field in ascending or descending order of `eventDate`. (optional) if omitted the server will use the default value of ["-eventDate"]
    pagination_limit = 50 # int | Specifies the number of results to return per page. The maximum limit is 500. (optional) if omitted the server will use the default value of 50
    pagination_offset = 0 # int | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. (optional) if omitted the server will use the default value of 0

    try:
        # Retrieve Event Calendar information for Corporate Actions
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_corporate_actions(ids=ids, start_date=start_date, end_date=end_date, event_categories=event_categories, exchanges=exchanges, sort=sort, pagination_limit=pagination_limit, pagination_offset=pagination_offset)

        pprint(api_response)

    except fds.sdk.FactSetGlobalPrices.ApiException as e:
        print("Exception when calling CorporateActionsForCalendarApi->get_corporate_actions: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | **[str]**| The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent IDs. If not specified, the data related to all the IDs is returned. | [optional]
 **start_date** | **date**| The start date requested for a given date range in **YYYY-MM-DD** format. If both start and end dates are omitted, the API will return data for the current week starting from Monday. | [optional]
 **end_date** | **date**| The end date requested for a given date range in **YYYY-MM-DD** format. The max date range is 1 year for up to 100 identifiers. If IDs are more than 100 or omitted, the max range is restricted to 90 days. | [optional]
 **event_categories** | **[str]**| Select one or more Event Categories from the dropdown:   - **CASH_DIVS:** Includes Dividends(DVC), Dividend with DRP Option(DVCD), Dividend Reinvestment(DRP)   - **STOCK_DIST:** Includes Stock Dividend(DVS), Stock Dividend - Special(DVSS), Bonus(BNS), Bonus - Special(BNSS)   - **SPINOFFS:** Includes Spin Off(SPO)   - **RIGHTS:** Includes Rights Issue(DSR)   - **SPLITS:** Includes Forward Split(FSP), Reverse Split(RSP), Split(SPL), Exchange Of Securities(EXOS)  If omitted, the data is returned for all the available eventCategories.  | [optional]
 **exchanges** | **[str]**| One or more exchange codes for which data is to be requested. When omitted, the data from all the supported exchanges is returned. See &#x60;/meta/exchanges&#x60; for available values. | [optional]
 **sort** | **[str]**| Sorts the field in ascending or descending order of &#x60;eventDate&#x60;. | [optional] if omitted the server will use the default value of ["-eventDate"]
 **pagination_limit** | **int**| Specifies the number of results to return per page. The maximum limit is 500. | [optional] if omitted the server will use the default value of 50
 **pagination_offset** | **int**| Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. | [optional] if omitted the server will use the default value of 0

### Return type

[**CorporateActionsResponseCalendar**](CorporateActionsResponseCalendar.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Corporate Actions data items |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**404** | The requested endpoint could not be found. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_dividends**
> DividendsResponse get_dividends()

Retrieve Dividend information

Retrieves detailed dividend information including amounts, relevant dates, and other specifics for Dividends, Dividends with DRP Option, and Dividend Reinvestment events within the specified date range.   To retrieve details of a given event for a company on a specific exchange, please pass both the eventId and the company identifier.  Note that passing eventId or (`eventId` + `ids`) will cause the end point to ignore the other parameters.  Passing values for any other combination of the parameters (`ids`, `startDate`, `endDate` and `exchanges`) will lead to an AND operation for all the parameters passed. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetGlobalPrices
from fds.sdk.FactSetGlobalPrices.api import corporate_actions_for_calendar_api
from fds.sdk.FactSetGlobalPrices.models import *
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
configuration = fds.sdk.FactSetGlobalPrices.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetGlobalPrices.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetGlobalPrices.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = corporate_actions_for_calendar_api.CorporateActionsForCalendarApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    event_ids = ["WF7WM3-A"] # [str] | FactSet Event Identifier - a unique identifier for an event across multiple exchanges. If provided, the API will return data for the specified event. (optional)
    ids = ["XSLCX-US"] # [str] | The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent IDs. If not specified, the data related to all the IDs is returned. (optional)
    start_date = dateutil_parser('Mon Dec 31 00:00:00 UTC 2018').date() # date | The start date requested for a given date range in **YYYY-MM-DD** format. If both start and end dates are omitted, the API will return data for the current week starting from Monday. (optional)
    end_date = dateutil_parser('Tue Dec 31 00:00:00 UTC 2019').date() # date | The end date requested for a given date range in **YYYY-MM-DD** format. The max date range is 1 year for up to 100 identifiers. If IDs are more than 100 or omitted, the max range is restricted to 90 days. (optional)
    exchanges = ["NYS","NAS"] # [str] | One or more exchange codes for which data is to be requested. When omitted, the data from all the supported exchanges is returned. See `/meta/exchanges` for available values. (optional)
    sort = ["-effectiveDate"] # [str] | Sorts the field in ascending or descending order of `effectiveDate`. (optional) if omitted the server will use the default value of ["-effectiveDate"]
    pagination_limit = 50 # int | Specifies the number of results to return per page. The maximum limit is 500. (optional) if omitted the server will use the default value of 50
    pagination_offset = 0 # int | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. (optional) if omitted the server will use the default value of 0

    try:
        # Retrieve Dividend information
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_dividends(event_ids=event_ids, ids=ids, start_date=start_date, end_date=end_date, exchanges=exchanges, sort=sort, pagination_limit=pagination_limit, pagination_offset=pagination_offset)

        pprint(api_response)

    except fds.sdk.FactSetGlobalPrices.ApiException as e:
        print("Exception when calling CorporateActionsForCalendarApi->get_dividends: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **event_ids** | **[str]**| FactSet Event Identifier - a unique identifier for an event across multiple exchanges. If provided, the API will return data for the specified event. | [optional]
 **ids** | **[str]**| The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent IDs. If not specified, the data related to all the IDs is returned. | [optional]
 **start_date** | **date**| The start date requested for a given date range in **YYYY-MM-DD** format. If both start and end dates are omitted, the API will return data for the current week starting from Monday. | [optional]
 **end_date** | **date**| The end date requested for a given date range in **YYYY-MM-DD** format. The max date range is 1 year for up to 100 identifiers. If IDs are more than 100 or omitted, the max range is restricted to 90 days. | [optional]
 **exchanges** | **[str]**| One or more exchange codes for which data is to be requested. When omitted, the data from all the supported exchanges is returned. See &#x60;/meta/exchanges&#x60; for available values. | [optional]
 **sort** | **[str]**| Sorts the field in ascending or descending order of &#x60;effectiveDate&#x60;. | [optional] if omitted the server will use the default value of ["-effectiveDate"]
 **pagination_limit** | **int**| Specifies the number of results to return per page. The maximum limit is 500. | [optional] if omitted the server will use the default value of 50
 **pagination_offset** | **int**| Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. | [optional] if omitted the server will use the default value of 0

### Return type

[**DividendsResponse**](DividendsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Dividend data items |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**404** | The requested endpoint could not be found. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_event_count**
> EventCountResponse get_event_count()

Retrieve daily event count for a given date range

Returns the overall count of various events for each day within the specified date range. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetGlobalPrices
from fds.sdk.FactSetGlobalPrices.api import corporate_actions_for_calendar_api
from fds.sdk.FactSetGlobalPrices.models import *
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
configuration = fds.sdk.FactSetGlobalPrices.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetGlobalPrices.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetGlobalPrices.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = corporate_actions_for_calendar_api.CorporateActionsForCalendarApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    ids = ["IBM-US"] # [str] | The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent IDs. If not specified, the data related to all the IDs is returned. (optional)
    start_date = dateutil_parser('Mon Dec 31 00:00:00 UTC 2018').date() # date | The start date requested for a given date range in **YYYY-MM-DD** format. If both start and end dates are omitted, the API will return data for the current week starting from Monday. (optional)
    end_date = dateutil_parser('Tue Dec 31 00:00:00 UTC 2019').date() # date | The end date requested for a given date range in **YYYY-MM-DD** format. The max date range is 1 year for up to 100 identifiers. If IDs are more than 100 or omitted, the max range is restricted to 90 days. (optional)
    exchanges = ["NYS","NAS"] # [str] | One or more exchange codes for which data is to be requested. When omitted, the data from all the supported exchanges is returned. See `/meta/exchanges` for available values. (optional)
    sort = ["-eventDate"] # [str] | Sorts the field in ascending or descending order of `eventDate`. (optional) if omitted the server will use the default value of ["-eventDate"]

    try:
        # Retrieve daily event count for a given date range
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_event_count(ids=ids, start_date=start_date, end_date=end_date, exchanges=exchanges, sort=sort)

        pprint(api_response)

    except fds.sdk.FactSetGlobalPrices.ApiException as e:
        print("Exception when calling CorporateActionsForCalendarApi->get_event_count: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | **[str]**| The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent IDs. If not specified, the data related to all the IDs is returned. | [optional]
 **start_date** | **date**| The start date requested for a given date range in **YYYY-MM-DD** format. If both start and end dates are omitted, the API will return data for the current week starting from Monday. | [optional]
 **end_date** | **date**| The end date requested for a given date range in **YYYY-MM-DD** format. The max date range is 1 year for up to 100 identifiers. If IDs are more than 100 or omitted, the max range is restricted to 90 days. | [optional]
 **exchanges** | **[str]**| One or more exchange codes for which data is to be requested. When omitted, the data from all the supported exchanges is returned. See &#x60;/meta/exchanges&#x60; for available values. | [optional]
 **sort** | **[str]**| Sorts the field in ascending or descending order of &#x60;eventDate&#x60;. | [optional] if omitted the server will use the default value of ["-eventDate"]

### Return type

[**EventCountResponse**](EventCountResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Event Count data items |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**404** | The requested endpoint could not be found. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_exchanges**
> ExchangesResponse get_exchanges()

Returns a list of exchanges for which event/action data is available.

Returns a list of available values for the exchanges parameter. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetGlobalPrices
from fds.sdk.FactSetGlobalPrices.api import corporate_actions_for_calendar_api
from fds.sdk.FactSetGlobalPrices.models import *
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
configuration = fds.sdk.FactSetGlobalPrices.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetGlobalPrices.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetGlobalPrices.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = corporate_actions_for_calendar_api.CorporateActionsForCalendarApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.

    try:
        # Returns a list of exchanges for which event/action data is available.
        # example, this endpoint has no required or optional parameters
        api_response = api_instance.get_exchanges()

        pprint(api_response)

    except fds.sdk.FactSetGlobalPrices.ApiException as e:
        print("Exception when calling CorporateActionsForCalendarApi->get_exchanges: %s\n" % e)
```


### Parameters
This endpoint does not need any parameter.

### Return type

[**ExchangesResponse**](ExchangesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Exchange details |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**404** | The requested endpoint could not be found. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_rights_issues**
> RightsIssuesResponse get_rights_issues()

Retrieve Rights Issue information

Retrieves the prices, relevant dates, and other specifics over a specified date range for Rights Issue events.  To retrieve details of a given event for a company on a specific exchange, please pass both the eventId and the company identifier.  Note that passing eventId or (`eventId` + `ids`) will cause the end point to ignore the other parameters.  Passing values for any other combination of the parameters (`ids`, `startDate`, `endDate` and `exchanges`) will lead to an AND operation for all the parameters passed. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetGlobalPrices
from fds.sdk.FactSetGlobalPrices.api import corporate_actions_for_calendar_api
from fds.sdk.FactSetGlobalPrices.models import *
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
configuration = fds.sdk.FactSetGlobalPrices.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetGlobalPrices.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetGlobalPrices.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = corporate_actions_for_calendar_api.CorporateActionsForCalendarApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    event_ids = ["JZ6938-A"] # [str] | FactSet Event Identifier - a unique identifier for an event across multiple exchanges. If provided, the API will return data for the specified event. (optional)
    ids = ["XOMA-US"] # [str] | The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent IDs. If not specified, the data related to all the IDs is returned. (optional)
    start_date = dateutil_parser('Mon Dec 31 00:00:00 UTC 2018').date() # date | The start date requested for a given date range in **YYYY-MM-DD** format. If both start and end dates are omitted, the API will return data for the current week starting from Monday. (optional)
    end_date = dateutil_parser('Tue Dec 31 00:00:00 UTC 2019').date() # date | The end date requested for a given date range in **YYYY-MM-DD** format. The max date range is 1 year for up to 100 identifiers. If IDs are more than 100 or omitted, the max range is restricted to 90 days. (optional)
    exchanges = ["NYS","NAS"] # [str] | One or more exchange codes for which data is to be requested. When omitted, the data from all the supported exchanges is returned. See `/meta/exchanges` for available values. (optional)
    sort = ["-effectiveDate"] # [str] | Sorts the field in ascending or descending order of `effectiveDate`. (optional) if omitted the server will use the default value of ["-effectiveDate"]
    pagination_limit = 50 # int | Specifies the number of results to return per page. The maximum limit is 500. (optional) if omitted the server will use the default value of 50
    pagination_offset = 0 # int | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. (optional) if omitted the server will use the default value of 0

    try:
        # Retrieve Rights Issue information
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_rights_issues(event_ids=event_ids, ids=ids, start_date=start_date, end_date=end_date, exchanges=exchanges, sort=sort, pagination_limit=pagination_limit, pagination_offset=pagination_offset)

        pprint(api_response)

    except fds.sdk.FactSetGlobalPrices.ApiException as e:
        print("Exception when calling CorporateActionsForCalendarApi->get_rights_issues: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **event_ids** | **[str]**| FactSet Event Identifier - a unique identifier for an event across multiple exchanges. If provided, the API will return data for the specified event. | [optional]
 **ids** | **[str]**| The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent IDs. If not specified, the data related to all the IDs is returned. | [optional]
 **start_date** | **date**| The start date requested for a given date range in **YYYY-MM-DD** format. If both start and end dates are omitted, the API will return data for the current week starting from Monday. | [optional]
 **end_date** | **date**| The end date requested for a given date range in **YYYY-MM-DD** format. The max date range is 1 year for up to 100 identifiers. If IDs are more than 100 or omitted, the max range is restricted to 90 days. | [optional]
 **exchanges** | **[str]**| One or more exchange codes for which data is to be requested. When omitted, the data from all the supported exchanges is returned. See &#x60;/meta/exchanges&#x60; for available values. | [optional]
 **sort** | **[str]**| Sorts the field in ascending or descending order of &#x60;effectiveDate&#x60;. | [optional] if omitted the server will use the default value of ["-effectiveDate"]
 **pagination_limit** | **int**| Specifies the number of results to return per page. The maximum limit is 500. | [optional] if omitted the server will use the default value of 50
 **pagination_offset** | **int**| Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. | [optional] if omitted the server will use the default value of 0

### Return type

[**RightsIssuesResponse**](RightsIssuesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Rights Issue data items |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**404** | The requested endpoint could not be found. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_spin_offs**
> SpinOffsResponse get_spin_offs()

Retrieve Spin Off information

Retrieves the price adjustment factors, dates, and other specifics over a specified date range for Spin Off events.  To retrieve details of a given event for a company on a specific exchange, please pass both the eventId and the company identifier.  Note that passing eventId or (`eventId` + `ids`) will cause the end point to ignore the other parameters.  Passing values for any other combination of the parameters (`ids`, `startDate`, `endDate` and `exchanges`) will lead to an AND operation for all the parameters passed. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetGlobalPrices
from fds.sdk.FactSetGlobalPrices.api import corporate_actions_for_calendar_api
from fds.sdk.FactSetGlobalPrices.models import *
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
configuration = fds.sdk.FactSetGlobalPrices.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetGlobalPrices.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetGlobalPrices.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = corporate_actions_for_calendar_api.CorporateActionsForCalendarApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    event_ids = ["DB9782-A"] # [str] | FactSet Event Identifier - a unique identifier for an event across multiple exchanges. If provided, the API will return data for the specified event. (optional)
    ids = ["STNG-US"] # [str] | The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent IDs. If not specified, the data related to all the IDs is returned. (optional)
    start_date = dateutil_parser('Mon Dec 31 00:00:00 UTC 2018').date() # date | The start date requested for a given date range in **YYYY-MM-DD** format. If both start and end dates are omitted, the API will return data for the current week starting from Monday. (optional)
    end_date = dateutil_parser('Tue Dec 31 00:00:00 UTC 2019').date() # date | The end date requested for a given date range in **YYYY-MM-DD** format. The max date range is 1 year for up to 100 identifiers. If IDs are more than 100 or omitted, the max range is restricted to 90 days. (optional)
    exchanges = ["NYS","NAS"] # [str] | One or more exchange codes for which data is to be requested. When omitted, the data from all the supported exchanges is returned. See `/meta/exchanges` for available values. (optional)
    sort = ["-effectiveDate"] # [str] | Sorts the field in ascending or descending order of `effectiveDate`. (optional) if omitted the server will use the default value of ["-effectiveDate"]
    pagination_limit = 50 # int | Specifies the number of results to return per page. The maximum limit is 500. (optional) if omitted the server will use the default value of 50
    pagination_offset = 0 # int | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. (optional) if omitted the server will use the default value of 0

    try:
        # Retrieve Spin Off information
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_spin_offs(event_ids=event_ids, ids=ids, start_date=start_date, end_date=end_date, exchanges=exchanges, sort=sort, pagination_limit=pagination_limit, pagination_offset=pagination_offset)

        pprint(api_response)

    except fds.sdk.FactSetGlobalPrices.ApiException as e:
        print("Exception when calling CorporateActionsForCalendarApi->get_spin_offs: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **event_ids** | **[str]**| FactSet Event Identifier - a unique identifier for an event across multiple exchanges. If provided, the API will return data for the specified event. | [optional]
 **ids** | **[str]**| The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent IDs. If not specified, the data related to all the IDs is returned. | [optional]
 **start_date** | **date**| The start date requested for a given date range in **YYYY-MM-DD** format. If both start and end dates are omitted, the API will return data for the current week starting from Monday. | [optional]
 **end_date** | **date**| The end date requested for a given date range in **YYYY-MM-DD** format. The max date range is 1 year for up to 100 identifiers. If IDs are more than 100 or omitted, the max range is restricted to 90 days. | [optional]
 **exchanges** | **[str]**| One or more exchange codes for which data is to be requested. When omitted, the data from all the supported exchanges is returned. See &#x60;/meta/exchanges&#x60; for available values. | [optional]
 **sort** | **[str]**| Sorts the field in ascending or descending order of &#x60;effectiveDate&#x60;. | [optional] if omitted the server will use the default value of ["-effectiveDate"]
 **pagination_limit** | **int**| Specifies the number of results to return per page. The maximum limit is 500. | [optional] if omitted the server will use the default value of 50
 **pagination_offset** | **int**| Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. | [optional] if omitted the server will use the default value of 0

### Return type

[**SpinOffsResponse**](SpinOffsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Spin Off data items |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**404** | The requested endpoint could not be found. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_splits**
> SplitsResponseCalendar get_splits()

Retrieve Split information

Retrieves the split factors, dates, and other specifics over a specified date range for Forward Split,  Reverse Split, Split and Exchange of Securities event types.  To retrieve details of a given event for a company on a specific exchange, please pass both the eventId and the company identifier.  Note that passing eventId or (`eventId` + `ids`) will cause the end point to ignore the other parameters.  Passing values for any other combination of the parameters (`ids`, `startDate`, `endDate` and `exchanges`) will lead to an AND operation for all the parameters passed. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetGlobalPrices
from fds.sdk.FactSetGlobalPrices.api import corporate_actions_for_calendar_api
from fds.sdk.FactSetGlobalPrices.models import *
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
configuration = fds.sdk.FactSetGlobalPrices.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetGlobalPrices.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetGlobalPrices.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = corporate_actions_for_calendar_api.CorporateActionsForCalendarApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    event_ids = ["B5QRB4-A"] # [str] | FactSet Event Identifier - a unique identifier for an event across multiple exchanges. If provided, the API will return data for the specified event. (optional)
    ids = ["MTVA-US"] # [str] | The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent IDs. If not specified, the data related to all the IDs is returned. (optional)
    start_date = dateutil_parser('Mon Dec 31 00:00:00 UTC 2018').date() # date | The start date requested for a given date range in **YYYY-MM-DD** format. If both start and end dates are omitted, the API will return data for the current week starting from Monday. (optional)
    end_date = dateutil_parser('Tue Dec 31 00:00:00 UTC 2019').date() # date | The end date requested for a given date range in **YYYY-MM-DD** format. The max date range is 1 year for up to 100 identifiers. If IDs are more than 100 or omitted, the max range is restricted to 90 days. (optional)
    exchanges = ["NYS","NAS"] # [str] | One or more exchange codes for which data is to be requested. When omitted, the data from all the supported exchanges is returned. See `/meta/exchanges` for available values. (optional)
    sort = ["-effectiveDate"] # [str] | Sorts the field in ascending or descending order of `effectiveDate`. (optional) if omitted the server will use the default value of ["-effectiveDate"]
    pagination_limit = 50 # int | Specifies the number of results to return per page. The maximum limit is 500. (optional) if omitted the server will use the default value of 50
    pagination_offset = 0 # int | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. (optional) if omitted the server will use the default value of 0

    try:
        # Retrieve Split information
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_splits(event_ids=event_ids, ids=ids, start_date=start_date, end_date=end_date, exchanges=exchanges, sort=sort, pagination_limit=pagination_limit, pagination_offset=pagination_offset)

        pprint(api_response)

    except fds.sdk.FactSetGlobalPrices.ApiException as e:
        print("Exception when calling CorporateActionsForCalendarApi->get_splits: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **event_ids** | **[str]**| FactSet Event Identifier - a unique identifier for an event across multiple exchanges. If provided, the API will return data for the specified event. | [optional]
 **ids** | **[str]**| The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent IDs. If not specified, the data related to all the IDs is returned. | [optional]
 **start_date** | **date**| The start date requested for a given date range in **YYYY-MM-DD** format. If both start and end dates are omitted, the API will return data for the current week starting from Monday. | [optional]
 **end_date** | **date**| The end date requested for a given date range in **YYYY-MM-DD** format. The max date range is 1 year for up to 100 identifiers. If IDs are more than 100 or omitted, the max range is restricted to 90 days. | [optional]
 **exchanges** | **[str]**| One or more exchange codes for which data is to be requested. When omitted, the data from all the supported exchanges is returned. See &#x60;/meta/exchanges&#x60; for available values. | [optional]
 **sort** | **[str]**| Sorts the field in ascending or descending order of &#x60;effectiveDate&#x60;. | [optional] if omitted the server will use the default value of ["-effectiveDate"]
 **pagination_limit** | **int**| Specifies the number of results to return per page. The maximum limit is 500. | [optional] if omitted the server will use the default value of 50
 **pagination_offset** | **int**| Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. | [optional] if omitted the server will use the default value of 0

### Return type

[**SplitsResponseCalendar**](SplitsResponseCalendar.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Split data items |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**404** | The requested endpoint could not be found. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_stock_distributions**
> StockDistributionsResponseCalendar get_stock_distributions()

Retrieve Stock Distribution information

Retrieves detailed stock distribution information including price adjustment factors, relevant dates, and other  specifics for Stock Dividends, Stock Dividends(Special), Bonus Issues, and Bonus Issues(Special) events within  the specified date range.  To retrieve details of a given event for a company on a specific exchange, please pass both the eventId and the company identifier.  Note that passing eventId or (`eventId` + `ids`) will cause the end point to ignore the other parameters.  Passing values for any other combination of the parameters (`ids`, `startDate`, `endDate` and `exchanges`) will lead to an AND operation for all the parameters passed. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetGlobalPrices
from fds.sdk.FactSetGlobalPrices.api import corporate_actions_for_calendar_api
from fds.sdk.FactSetGlobalPrices.models import *
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
configuration = fds.sdk.FactSetGlobalPrices.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetGlobalPrices.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetGlobalPrices.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = corporate_actions_for_calendar_api.CorporateActionsForCalendarApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    event_ids = ["WGLQ32-A"] # [str] | FactSet Event Identifier - a unique identifier for an event across multiple exchanges. If provided, the API will return data for the specified event. (optional)
    ids = ["FGBI-US"] # [str] | The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent IDs. If not specified, the data related to all the IDs is returned. (optional)
    start_date = dateutil_parser('Mon Dec 31 00:00:00 UTC 2018').date() # date | The start date requested for a given date range in **YYYY-MM-DD** format. If both start and end dates are omitted, the API will return data for the current week starting from Monday. (optional)
    end_date = dateutil_parser('Tue Dec 31 00:00:00 UTC 2019').date() # date | The end date requested for a given date range in **YYYY-MM-DD** format. The max date range is 1 year for up to 100 identifiers. If IDs are more than 100 or omitted, the max range is restricted to 90 days. (optional)
    exchanges = ["NYS","NAS"] # [str] | One or more exchange codes for which data is to be requested. When omitted, the data from all the supported exchanges is returned. See `/meta/exchanges` for available values. (optional)
    sort = ["-effectiveDate"] # [str] | Sorts the field in ascending or descending order of `effectiveDate`. (optional) if omitted the server will use the default value of ["-effectiveDate"]
    pagination_limit = 50 # int | Specifies the number of results to return per page. The maximum limit is 500. (optional) if omitted the server will use the default value of 50
    pagination_offset = 0 # int | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. (optional) if omitted the server will use the default value of 0

    try:
        # Retrieve Stock Distribution information
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_stock_distributions(event_ids=event_ids, ids=ids, start_date=start_date, end_date=end_date, exchanges=exchanges, sort=sort, pagination_limit=pagination_limit, pagination_offset=pagination_offset)

        pprint(api_response)

    except fds.sdk.FactSetGlobalPrices.ApiException as e:
        print("Exception when calling CorporateActionsForCalendarApi->get_stock_distributions: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **event_ids** | **[str]**| FactSet Event Identifier - a unique identifier for an event across multiple exchanges. If provided, the API will return data for the specified event. | [optional]
 **ids** | **[str]**| The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent IDs. If not specified, the data related to all the IDs is returned. | [optional]
 **start_date** | **date**| The start date requested for a given date range in **YYYY-MM-DD** format. If both start and end dates are omitted, the API will return data for the current week starting from Monday. | [optional]
 **end_date** | **date**| The end date requested for a given date range in **YYYY-MM-DD** format. The max date range is 1 year for up to 100 identifiers. If IDs are more than 100 or omitted, the max range is restricted to 90 days. | [optional]
 **exchanges** | **[str]**| One or more exchange codes for which data is to be requested. When omitted, the data from all the supported exchanges is returned. See &#x60;/meta/exchanges&#x60; for available values. | [optional]
 **sort** | **[str]**| Sorts the field in ascending or descending order of &#x60;effectiveDate&#x60;. | [optional] if omitted the server will use the default value of ["-effectiveDate"]
 **pagination_limit** | **int**| Specifies the number of results to return per page. The maximum limit is 500. | [optional] if omitted the server will use the default value of 50
 **pagination_offset** | **int**| Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. | [optional] if omitted the server will use the default value of 0

### Return type

[**StockDistributionsResponseCalendar**](StockDistributionsResponseCalendar.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Stock Distribution data items |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**404** | The requested endpoint could not be found. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

