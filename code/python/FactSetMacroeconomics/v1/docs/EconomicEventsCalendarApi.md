# fds.sdk.FactSetMacroeconomics.EconomicEventsCalendarApi

All URIs are relative to *https://api.factset.com/content/economics/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_economic_events**](EconomicEventsCalendarApi.md#get_economic_events) | **GET** /economic-events | Retrieve economic calendar events
[**get_economic_events_count**](EconomicEventsCalendarApi.md#get_economic_events_count) | **GET** /event-count | Retrieve economic events count



# **get_economic_events**
> EventResponse get_economic_events()

Retrieve economic calendar events

Returns economic calendar events for a specified date range, with optional filtering by country, indicator, and FDS code. Use `/meta/events` to discover available filter values (indicators, countries, FDS codes).

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetMacroeconomics
from fds.sdk.FactSetMacroeconomics.api import economic_events_calendar_api
from fds.sdk.FactSetMacroeconomics.models import *
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
configuration = fds.sdk.FactSetMacroeconomics.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetMacroeconomics.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetMacroeconomics.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = economic_events_calendar_api.EconomicEventsCalendarApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    fds_code = "CPIMOM@US" # str | FDS code to filter events by a specific economic indicator. Use the `/meta/events?type=fds-codes` endpoint to retrieve all available codes.  - **Required:** startDate and endDate parameters must be provided when using this filter  (optional)
    indicator = "PRCPI" # str | Economic indicator name for filtering events. Use the `/meta/events?type=indicators` endpoint to retrieve available indicators.  - **Required:** startDate and endDate parameters must be provided when using this filter  (optional)
    country_code = "US" # str | ISO country code for filtering events by country. Use the `/meta/events?type=countries` endpoint to retrieve available country codes.  (optional)
    time_zone = "GMT+05:00" # str | Time zone for event dates and times in GMT offset format (e.g., GMT-5, GMT, GMT+9). Use the `/meta/events?type=TIMEZONES` endpoint to retrieve available time zone values. If left blank, the default time zone is GMT.  (optional) if omitted the server will use the default value of "GMT"
    start_date = dateutil_parser('Mon Jan 01 00:00:00 UTC 2024').date() # date | Start date for the query range.  - **Required:** when `fdsCode` or `indicator` is specified - **Default:** If both `startDate` and `endDate` are omitted, the API defaults to the most recent available calendar day - **Maximum date range limit:** The maximum date range limit between `startDate` and `endDate` is up to 90 days. Requests with date ranges exceeding 90 days will result in a validation error.  (optional)
    end_date = dateutil_parser('Thu Mar 28 00:00:00 UTC 2024').date() # date | End date for the query range.  - **Required:** when `fdsCode` or `indicator` is specified - **Default:** If both `startDate` and `endDate` are omitted, the API defaults to the most recent available calendar day - **Maximum date range limit:** The maximum date range limit between `startDate` and `endDate` is up to 90 days. Requests with date ranges exceeding 90 days will result in a validation error.  (optional)
    fields = ["eventDateTime","actual","consensus"] # [str] | Comma-separated list of fields to include in the `items` array for each event. Common event fields (`requestedFdsCode`, `eventName`, `countryCode`, `indicator`) are always returned. When omitted, all available fields in the items array are returned.  **Available fields (for items array):** | Field | Description | |---|---| | `eventDateTime` | Scheduled release date and time (UTC) | | `period` | Reference period covered by the data | | `actual` | Released actual value | | `prior` | Value from the prior period | | `consensus` | Consensus market estimate | | `surprise` | Difference between actual and consensus |  (optional)
    pagination_limit = 25 # int | Maximum number of results to return per page. If not specified, the default page size is applied.  (optional) if omitted the server will use the default value of 25
    pagination_offset = 0 # int | Number of results to skip before returning the first result. Used for pagination in combination with `_paginationLimit`.  (optional) if omitted the server will use the default value of 0

    try:
        # Retrieve economic calendar events
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_economic_events(fds_code=fds_code, indicator=indicator, country_code=country_code, time_zone=time_zone, start_date=start_date, end_date=end_date, fields=fields, pagination_limit=pagination_limit, pagination_offset=pagination_offset)

        pprint(api_response)

    except fds.sdk.FactSetMacroeconomics.ApiException as e:
        print("Exception when calling EconomicEventsCalendarApi->get_economic_events: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fds_code** | **str**| FDS code to filter events by a specific economic indicator. Use the &#x60;/meta/events?type&#x3D;fds-codes&#x60; endpoint to retrieve all available codes.  - **Required:** startDate and endDate parameters must be provided when using this filter  | [optional]
 **indicator** | **str**| Economic indicator name for filtering events. Use the &#x60;/meta/events?type&#x3D;indicators&#x60; endpoint to retrieve available indicators.  - **Required:** startDate and endDate parameters must be provided when using this filter  | [optional]
 **country_code** | **str**| ISO country code for filtering events by country. Use the &#x60;/meta/events?type&#x3D;countries&#x60; endpoint to retrieve available country codes.  | [optional]
 **time_zone** | **str**| Time zone for event dates and times in GMT offset format (e.g., GMT-5, GMT, GMT+9). Use the &#x60;/meta/events?type&#x3D;TIMEZONES&#x60; endpoint to retrieve available time zone values. If left blank, the default time zone is GMT.  | [optional] if omitted the server will use the default value of "GMT"
 **start_date** | **date**| Start date for the query range.  - **Required:** when &#x60;fdsCode&#x60; or &#x60;indicator&#x60; is specified - **Default:** If both &#x60;startDate&#x60; and &#x60;endDate&#x60; are omitted, the API defaults to the most recent available calendar day - **Maximum date range limit:** The maximum date range limit between &#x60;startDate&#x60; and &#x60;endDate&#x60; is up to 90 days. Requests with date ranges exceeding 90 days will result in a validation error.  | [optional]
 **end_date** | **date**| End date for the query range.  - **Required:** when &#x60;fdsCode&#x60; or &#x60;indicator&#x60; is specified - **Default:** If both &#x60;startDate&#x60; and &#x60;endDate&#x60; are omitted, the API defaults to the most recent available calendar day - **Maximum date range limit:** The maximum date range limit between &#x60;startDate&#x60; and &#x60;endDate&#x60; is up to 90 days. Requests with date ranges exceeding 90 days will result in a validation error.  | [optional]
 **fields** | **[str]**| Comma-separated list of fields to include in the &#x60;items&#x60; array for each event. Common event fields (&#x60;requestedFdsCode&#x60;, &#x60;eventName&#x60;, &#x60;countryCode&#x60;, &#x60;indicator&#x60;) are always returned. When omitted, all available fields in the items array are returned.  **Available fields (for items array):** | Field | Description | |---|---| | &#x60;eventDateTime&#x60; | Scheduled release date and time (UTC) | | &#x60;period&#x60; | Reference period covered by the data | | &#x60;actual&#x60; | Released actual value | | &#x60;prior&#x60; | Value from the prior period | | &#x60;consensus&#x60; | Consensus market estimate | | &#x60;surprise&#x60; | Difference between actual and consensus |  | [optional]
 **pagination_limit** | **int**| Maximum number of results to return per page. If not specified, the default page size is applied.  | [optional] if omitted the server will use the default value of 25
 **pagination_offset** | **int**| Number of results to skip before returning the first result. Used for pagination in combination with &#x60;_paginationLimit&#x60;.  | [optional] if omitted the server will use the default value of 0

### Return type

[**EventResponse**](EventResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully retrieved economic events. |  -  |
**400** | Bad Request. The request contains syntax errors or is malformed (e.g., malformed JSON, invalid protocol formatting, illegal characters in query strings). The server cannot parse the request.  |  -  |
**401** | Unauthenticated - API authentication failed. Ensure you have successfully generated a valid API key, included the API key in your request via Basic Auth, and the API key is valid for your IP range. For help with connectivity issues, please contact FactSet support.  |  -  |
**403** | Forbidden - You do not have permission to access this endpoint or resource. Your API key or account may not have the required access level. Please reach out to your FactSet Account Team for assistance with authorization.  |  -  |
**404** | Not Found - The requested endpoint or resource does not exist. Please verify that the endpoint path is correct, all required path parameters are provided, and the resource identifier (if any) is valid.  |  -  |
**422** | Unprocessable Entity - Your request data was syntactically correct but semantically invalid. This can occur for validation errors such as invalid date format, invalid parameter values, missing required parameters, invalid enum values, or invalid date ranges. Check the required parameters and their value constraints.  |  -  |
**429** | Too Many Requests - You have exceeded the allowed request rate for this API. Please wait and retry your request after some time.  |  -  |
**500** | Internal Server Error - An unexpected error occurred on the server. Please try your request again. If the problem persists, contact FactSet support and provide the error ID from the response for investigation.  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_economic_events_count**
> EventCountResponse get_economic_events_count()

Retrieve economic events count

Returns the number of economic events per calendar day for a specified date range. Weekends can be included or excluded via the `includeWeekends` parameter.  Note: The response includes only dates with one or more events. Dates with no events are omitted from the response. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetMacroeconomics
from fds.sdk.FactSetMacroeconomics.api import economic_events_calendar_api
from fds.sdk.FactSetMacroeconomics.models import *
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
configuration = fds.sdk.FactSetMacroeconomics.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetMacroeconomics.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetMacroeconomics.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = economic_events_calendar_api.EconomicEventsCalendarApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    start_date = dateutil_parser('Mon Jan 01 00:00:00 UTC 2024').date() # date | Start date for the query range.  - **Default:** If both `startDate` and `endDate` are omitted, the API defaults to the most recent available calendar day - **Maximum date range limit:** The maximum date range limit between `startDate` and `endDate` is up to 90 days. Requests with date ranges exceeding 90 days will result in a validation error.  (optional)
    end_date = dateutil_parser('Fri Mar 01 00:00:00 UTC 2024').date() # date | End date for the query range.  - **Default:** If both `startDate` and `endDate` are omitted, the API defaults to the most recent available calendar day - **Maximum date range limit:** The maximum date range limit between `startDate` and `endDate` is up to 90 days. Requests with date ranges exceeding 90 days will result in a validation error.  (optional)
    include_weekends = True # bool | Returned daily counts include weekends by default. Set this to `false` to exclude weekends. (optional) if omitted the server will use the default value of True
    pagination_limit = 25 # int | Maximum number of results to return per page. If not specified, the default page size is applied.  (optional) if omitted the server will use the default value of 25
    pagination_offset = 0 # int | Number of results to skip before returning the first result. Used for pagination in combination with `_paginationLimit`.  (optional) if omitted the server will use the default value of 0

    try:
        # Retrieve economic events count
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_economic_events_count(start_date=start_date, end_date=end_date, include_weekends=include_weekends, pagination_limit=pagination_limit, pagination_offset=pagination_offset)

        pprint(api_response)

    except fds.sdk.FactSetMacroeconomics.ApiException as e:
        print("Exception when calling EconomicEventsCalendarApi->get_economic_events_count: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start_date** | **date**| Start date for the query range.  - **Default:** If both &#x60;startDate&#x60; and &#x60;endDate&#x60; are omitted, the API defaults to the most recent available calendar day - **Maximum date range limit:** The maximum date range limit between &#x60;startDate&#x60; and &#x60;endDate&#x60; is up to 90 days. Requests with date ranges exceeding 90 days will result in a validation error.  | [optional]
 **end_date** | **date**| End date for the query range.  - **Default:** If both &#x60;startDate&#x60; and &#x60;endDate&#x60; are omitted, the API defaults to the most recent available calendar day - **Maximum date range limit:** The maximum date range limit between &#x60;startDate&#x60; and &#x60;endDate&#x60; is up to 90 days. Requests with date ranges exceeding 90 days will result in a validation error.  | [optional]
 **include_weekends** | **bool**| Returned daily counts include weekends by default. Set this to &#x60;false&#x60; to exclude weekends. | [optional] if omitted the server will use the default value of True
 **pagination_limit** | **int**| Maximum number of results to return per page. If not specified, the default page size is applied.  | [optional] if omitted the server will use the default value of 25
 **pagination_offset** | **int**| Number of results to skip before returning the first result. Used for pagination in combination with &#x60;_paginationLimit&#x60;.  | [optional] if omitted the server will use the default value of 0

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
**200** | Successfully retrieved economic events count. |  -  |
**400** | Bad Request. The request contains syntax errors or is malformed (e.g., malformed JSON, invalid protocol formatting, illegal characters in query strings). The server cannot parse the request.  |  -  |
**401** | Unauthenticated - API authentication failed. Ensure you have successfully generated a valid API key, included the API key in your request via Basic Auth, and the API key is valid for your IP range. For help with connectivity issues, please contact FactSet support.  |  -  |
**403** | Forbidden - You do not have permission to access this endpoint or resource. Your API key or account may not have the required access level. Please reach out to your FactSet Account Team for assistance with authorization.  |  -  |
**404** | Not Found - The requested endpoint or resource does not exist. Please verify that the endpoint path is correct, all required path parameters are provided, and the resource identifier (if any) is valid.  |  -  |
**422** | Unprocessable Entity - Your request data was syntactically correct but semantically invalid. This can occur for validation errors such as invalid date format, invalid parameter values, missing required parameters, invalid enum values, or invalid date ranges. Check the required parameters and their value constraints.  |  -  |
**429** | Too Many Requests - You have exceeded the allowed request rate for this API. Please wait and retry your request after some time.  |  -  |
**500** | Internal Server Error - An unexpected error occurred on the server. Please try your request again. If the problem persists, contact FactSet support and provide the error ID from the response for investigation.  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

