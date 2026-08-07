# EconomicEventsCalendarApi

All URIs are relative to *https://api.factset.com/content/economics/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getEconomicEvents**](EconomicEventsCalendarApi.md#getEconomicEvents) | **GET** /economic-events | Retrieve economic calendar events
[**getEconomicEventsCount**](EconomicEventsCalendarApi.md#getEconomicEventsCount) | **GET** /event-count | Retrieve economic events count



## getEconomicEvents

> EventResponse getEconomicEvents(fdsCode, indicator, countryCode, timeZone, startDate, endDate, fields, paginationLimit, paginationOffset)

Retrieve economic calendar events

Returns economic calendar events for a specified date range, with optional filtering by country, indicator, and FDS code. Use `/meta/events` to discover available filter values (indicators, countries, FDS codes).

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
import java.time.LocalDate;
// Import classes:
import com.factset.sdk.FactSetMacroeconomics.ApiClient;
import com.factset.sdk.FactSetMacroeconomics.ApiException;
import com.factset.sdk.FactSetMacroeconomics.Configuration;
import com.factset.sdk.FactSetMacroeconomics.auth.*;
import com.factset.sdk.FactSetMacroeconomics.models.*;
import com.factset.sdk.FactSetMacroeconomics.api.EconomicEventsCalendarApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;

public class Example {
    public static void main(String[] args) throws Exception {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
        //
        // The confidential client instance should be reused in production environments.
        // See https://github.com/FactSet/enterprise-sdk-utils-java#authentication
        // for more information on using the ConfidentialClient class
        ConfidentialClient confidentialClient = new ConfidentialClient("./path/to/config.json");
        ApiClient defaultClient = new ApiClient()
          .setFactSetOAuth2Client(confidentialClient);

        /* Basic authentication: FactSetApiKey */
        // See https://github.com/FactSet/enterprise-sdk#api-key
        // ApiClient defaultClient = new ApiClient()
        //   .setUsername("YOUR USERNAME")
        //   .setPassword("YOUR PASSWORD");

        EconomicEventsCalendarApi apiInstance = new EconomicEventsCalendarApi(defaultClient);
        String fdsCode = "CPIMOM@US"; // String | FDS code to filter events by a specific economic indicator. Use the `/meta/events?type=fds-codes` endpoint to retrieve all available codes.  - **Required:** startDate and endDate parameters must be provided when using this filter 
        String indicator = "PRCPI"; // String | Economic indicator name for filtering events. Use the `/meta/events?type=indicators` endpoint to retrieve available indicators.  - **Required:** startDate and endDate parameters must be provided when using this filter 
        String countryCode = "US"; // String | ISO country code for filtering events by country. Use the `/meta/events?type=countries` endpoint to retrieve available country codes. 
        String timeZone = "GMT"; // String | Time zone for event dates and times in GMT offset format (e.g., GMT-5, GMT, GMT+9). Use the `/meta/events?type=TIMEZONES` endpoint to retrieve available time zone values. If left blank, the default time zone is GMT. 
        LocalDate startDate = LocalDate.parse("Mon Jan 01 00:00:00 UTC 2024"); // LocalDate | Start date for the query range.  - **Required:** when `fdsCode` or `indicator` is specified - **Default:** If both `startDate` and `endDate` are omitted, the API defaults to the most recent available calendar day - **Maximum date range limit:** The maximum date range limit between `startDate` and `endDate` is up to 90 days. Requests with date ranges exceeding 90 days will result in a validation error. 
        LocalDate endDate = LocalDate.parse("Thu Mar 28 00:00:00 UTC 2024"); // LocalDate | End date for the query range.  - **Required:** when `fdsCode` or `indicator` is specified - **Default:** If both `startDate` and `endDate` are omitted, the API defaults to the most recent available calendar day - **Maximum date range limit:** The maximum date range limit between `startDate` and `endDate` is up to 90 days. Requests with date ranges exceeding 90 days will result in a validation error. 
        java.util.List<String> fields = Arrays.asList(); // java.util.List<String> | Comma-separated list of fields to include in the `items` array for each event. Common event fields (`requestedFdsCode`, `eventName`, `countryCode`, `indicator`) are always returned. When omitted, all available fields in the items array are returned.  **Available fields (for items array):** | Field | Description | |---|---| | `eventDateTime` | Scheduled release date and time (UTC) | | `period` | Reference period covered by the data | | `actual` | Released actual value | | `prior` | Value from the prior period | | `consensus` | Consensus market estimate | | `surprise` | Difference between actual and consensus | 
        Integer paginationLimit = 25; // Integer | Maximum number of results to return per page. If not specified, the default page size is applied. 
        Integer paginationOffset = 0; // Integer | Number of results to skip before returning the first result. Used for pagination in combination with `_paginationLimit`. 
        try {
            EventResponse result = apiInstance.getEconomicEvents(fdsCode, indicator, countryCode, timeZone, startDate, endDate, fields, paginationLimit, paginationOffset);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling EconomicEventsCalendarApi#getEconomicEvents");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fdsCode** | **String**| FDS code to filter events by a specific economic indicator. Use the &#x60;/meta/events?type&#x3D;fds-codes&#x60; endpoint to retrieve all available codes.  - **Required:** startDate and endDate parameters must be provided when using this filter  | [optional]
 **indicator** | **String**| Economic indicator name for filtering events. Use the &#x60;/meta/events?type&#x3D;indicators&#x60; endpoint to retrieve available indicators.  - **Required:** startDate and endDate parameters must be provided when using this filter  | [optional]
 **countryCode** | **String**| ISO country code for filtering events by country. Use the &#x60;/meta/events?type&#x3D;countries&#x60; endpoint to retrieve available country codes.  | [optional]
 **timeZone** | **String**| Time zone for event dates and times in GMT offset format (e.g., GMT-5, GMT, GMT+9). Use the &#x60;/meta/events?type&#x3D;TIMEZONES&#x60; endpoint to retrieve available time zone values. If left blank, the default time zone is GMT.  | [optional] [default to GMT]
 **startDate** | **LocalDate**| Start date for the query range.  - **Required:** when &#x60;fdsCode&#x60; or &#x60;indicator&#x60; is specified - **Default:** If both &#x60;startDate&#x60; and &#x60;endDate&#x60; are omitted, the API defaults to the most recent available calendar day - **Maximum date range limit:** The maximum date range limit between &#x60;startDate&#x60; and &#x60;endDate&#x60; is up to 90 days. Requests with date ranges exceeding 90 days will result in a validation error.  | [optional]
 **endDate** | **LocalDate**| End date for the query range.  - **Required:** when &#x60;fdsCode&#x60; or &#x60;indicator&#x60; is specified - **Default:** If both &#x60;startDate&#x60; and &#x60;endDate&#x60; are omitted, the API defaults to the most recent available calendar day - **Maximum date range limit:** The maximum date range limit between &#x60;startDate&#x60; and &#x60;endDate&#x60; is up to 90 days. Requests with date ranges exceeding 90 days will result in a validation error.  | [optional]
 **fields** | **List&lt;String&gt;**| Comma-separated list of fields to include in the &#x60;items&#x60; array for each event. Common event fields (&#x60;requestedFdsCode&#x60;, &#x60;eventName&#x60;, &#x60;countryCode&#x60;, &#x60;indicator&#x60;) are always returned. When omitted, all available fields in the items array are returned.  **Available fields (for items array):** | Field | Description | |---|---| | &#x60;eventDateTime&#x60; | Scheduled release date and time (UTC) | | &#x60;period&#x60; | Reference period covered by the data | | &#x60;actual&#x60; | Released actual value | | &#x60;prior&#x60; | Value from the prior period | | &#x60;consensus&#x60; | Consensus market estimate | | &#x60;surprise&#x60; | Difference between actual and consensus |  | [optional] [enum: eventDateTime, period, actual, prior, consensus, surprise]
 **paginationLimit** | **Integer**| Maximum number of results to return per page. If not specified, the default page size is applied.  | [optional] [default to 25]
 **paginationOffset** | **Integer**| Number of results to skip before returning the first result. Used for pagination in combination with &#x60;_paginationLimit&#x60;.  | [optional] [default to 0]

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
| **200** | Successfully retrieved economic events. |  -  |
| **400** | Bad Request. The request contains syntax errors or is malformed (e.g., malformed JSON, invalid protocol formatting, illegal characters in query strings). The server cannot parse the request.  |  -  |
| **401** | Unauthenticated - API authentication failed. Ensure you have successfully generated a valid API key, included the API key in your request via Basic Auth, and the API key is valid for your IP range. For help with connectivity issues, please contact FactSet support.  |  -  |
| **403** | Forbidden - You do not have permission to access this endpoint or resource. Your API key or account may not have the required access level. Please reach out to your FactSet Account Team for assistance with authorization.  |  -  |
| **404** | Not Found - The requested endpoint or resource does not exist. Please verify that the endpoint path is correct, all required path parameters are provided, and the resource identifier (if any) is valid.  |  -  |
| **422** | Unprocessable Entity - Your request data was syntactically correct but semantically invalid. This can occur for validation errors such as invalid date format, invalid parameter values, missing required parameters, invalid enum values, or invalid date ranges. Check the required parameters and their value constraints.  |  -  |
| **429** | Too Many Requests - You have exceeded the allowed request rate for this API. Please wait and retry your request after some time.  |  -  |
| **500** | Internal Server Error - An unexpected error occurred on the server. Please try your request again. If the problem persists, contact FactSet support and provide the error ID from the response for investigation.  |  -  |


## getEconomicEventsCount

> EventCountResponse getEconomicEventsCount(startDate, endDate, includeWeekends, paginationLimit, paginationOffset)

Retrieve economic events count

Returns the number of economic events per calendar day for a specified date range. Weekends can be included or excluded via the `includeWeekends` parameter.

Note: The response includes only dates with one or more events. Dates with no events are omitted from the response.


### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
import java.time.LocalDate;
// Import classes:
import com.factset.sdk.FactSetMacroeconomics.ApiClient;
import com.factset.sdk.FactSetMacroeconomics.ApiException;
import com.factset.sdk.FactSetMacroeconomics.Configuration;
import com.factset.sdk.FactSetMacroeconomics.auth.*;
import com.factset.sdk.FactSetMacroeconomics.models.*;
import com.factset.sdk.FactSetMacroeconomics.api.EconomicEventsCalendarApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;

public class Example {
    public static void main(String[] args) throws Exception {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
        //
        // The confidential client instance should be reused in production environments.
        // See https://github.com/FactSet/enterprise-sdk-utils-java#authentication
        // for more information on using the ConfidentialClient class
        ConfidentialClient confidentialClient = new ConfidentialClient("./path/to/config.json");
        ApiClient defaultClient = new ApiClient()
          .setFactSetOAuth2Client(confidentialClient);

        /* Basic authentication: FactSetApiKey */
        // See https://github.com/FactSet/enterprise-sdk#api-key
        // ApiClient defaultClient = new ApiClient()
        //   .setUsername("YOUR USERNAME")
        //   .setPassword("YOUR PASSWORD");

        EconomicEventsCalendarApi apiInstance = new EconomicEventsCalendarApi(defaultClient);
        LocalDate startDate = LocalDate.parse("Mon Jan 01 00:00:00 UTC 2024"); // LocalDate | Start date for the query range.  - **Default:** If both `startDate` and `endDate` are omitted, the API defaults to the most recent available calendar day - **Maximum date range limit:** The maximum date range limit between `startDate` and `endDate` is up to 90 days. Requests with date ranges exceeding 90 days will result in a validation error. 
        LocalDate endDate = LocalDate.parse("Fri Mar 01 00:00:00 UTC 2024"); // LocalDate | End date for the query range.  - **Default:** If both `startDate` and `endDate` are omitted, the API defaults to the most recent available calendar day - **Maximum date range limit:** The maximum date range limit between `startDate` and `endDate` is up to 90 days. Requests with date ranges exceeding 90 days will result in a validation error. 
        Boolean includeWeekends = true; // Boolean | Returned daily counts include weekends by default. Set this to `false` to exclude weekends.
        Integer paginationLimit = 25; // Integer | Maximum number of results to return per page. If not specified, the default page size is applied. 
        Integer paginationOffset = 0; // Integer | Number of results to skip before returning the first result. Used for pagination in combination with `_paginationLimit`. 
        try {
            EventCountResponse result = apiInstance.getEconomicEventsCount(startDate, endDate, includeWeekends, paginationLimit, paginationOffset);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling EconomicEventsCalendarApi#getEconomicEventsCount");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startDate** | **LocalDate**| Start date for the query range.  - **Default:** If both &#x60;startDate&#x60; and &#x60;endDate&#x60; are omitted, the API defaults to the most recent available calendar day - **Maximum date range limit:** The maximum date range limit between &#x60;startDate&#x60; and &#x60;endDate&#x60; is up to 90 days. Requests with date ranges exceeding 90 days will result in a validation error.  | [optional]
 **endDate** | **LocalDate**| End date for the query range.  - **Default:** If both &#x60;startDate&#x60; and &#x60;endDate&#x60; are omitted, the API defaults to the most recent available calendar day - **Maximum date range limit:** The maximum date range limit between &#x60;startDate&#x60; and &#x60;endDate&#x60; is up to 90 days. Requests with date ranges exceeding 90 days will result in a validation error.  | [optional]
 **includeWeekends** | **Boolean**| Returned daily counts include weekends by default. Set this to &#x60;false&#x60; to exclude weekends. | [optional] [default to true]
 **paginationLimit** | **Integer**| Maximum number of results to return per page. If not specified, the default page size is applied.  | [optional] [default to 25]
 **paginationOffset** | **Integer**| Number of results to skip before returning the first result. Used for pagination in combination with &#x60;_paginationLimit&#x60;.  | [optional] [default to 0]

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
| **200** | Successfully retrieved economic events count. |  -  |
| **400** | Bad Request. The request contains syntax errors or is malformed (e.g., malformed JSON, invalid protocol formatting, illegal characters in query strings). The server cannot parse the request.  |  -  |
| **401** | Unauthenticated - API authentication failed. Ensure you have successfully generated a valid API key, included the API key in your request via Basic Auth, and the API key is valid for your IP range. For help with connectivity issues, please contact FactSet support.  |  -  |
| **403** | Forbidden - You do not have permission to access this endpoint or resource. Your API key or account may not have the required access level. Please reach out to your FactSet Account Team for assistance with authorization.  |  -  |
| **404** | Not Found - The requested endpoint or resource does not exist. Please verify that the endpoint path is correct, all required path parameters are provided, and the resource identifier (if any) is valid.  |  -  |
| **422** | Unprocessable Entity - Your request data was syntactically correct but semantically invalid. This can occur for validation errors such as invalid date format, invalid parameter values, missing required parameters, invalid enum values, or invalid date ranges. Check the required parameters and their value constraints.  |  -  |
| **429** | Too Many Requests - You have exceeded the allowed request rate for this API. Please wait and retry your request after some time.  |  -  |
| **500** | Internal Server Error - An unexpected error occurred on the server. Please try your request again. If the problem persists, contact FactSet support and provide the error ID from the response for investigation.  |  -  |

