# CorporateActionsForCalendarApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCorporateActions**](CorporateActionsForCalendarApi.md#getCorporateActions) | **GET** /factset-global-prices/v1/calendar/corporate-actions | Retrieve Event Calendar information for Corporate Actions
[**getDividends**](CorporateActionsForCalendarApi.md#getDividends) | **GET** /factset-global-prices/v1/calendar/dividends | Retrieve Dividend information
[**getEventCount**](CorporateActionsForCalendarApi.md#getEventCount) | **GET** /factset-global-prices/v1/calendar/event-count | Retrieve daily event count for a given date range
[**getExchanges**](CorporateActionsForCalendarApi.md#getExchanges) | **GET** /factset-global-prices/v1/calendar/meta/exchanges | Returns a list of exchanges for which event/action data is available.
[**getRightsIssues**](CorporateActionsForCalendarApi.md#getRightsIssues) | **GET** /factset-global-prices/v1/calendar/rights-issues | Retrieve Rights Issue information
[**getSpinOffs**](CorporateActionsForCalendarApi.md#getSpinOffs) | **GET** /factset-global-prices/v1/calendar/spin-offs | Retrieve Spin Off information
[**getSplits**](CorporateActionsForCalendarApi.md#getSplits) | **GET** /factset-global-prices/v1/calendar/splits | Retrieve Split information
[**getStockDistributions**](CorporateActionsForCalendarApi.md#getStockDistributions) | **GET** /factset-global-prices/v1/calendar/stock-distributions | Retrieve Stock Distribution information



## getCorporateActions

> CorporateActionsResponseCalendar getCorporateActions(ids, startDate, endDate, eventCategories, exchanges, sort, paginationLimit, paginationOffset)

Retrieve Event Calendar information for Corporate Actions

Gives an overview of all available Corporate Actions over a specified date range.


### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
import java.time.LocalDate;
// Import classes:
import com.factset.sdk.FactSetGlobalPrices.ApiClient;
import com.factset.sdk.FactSetGlobalPrices.ApiException;
import com.factset.sdk.FactSetGlobalPrices.Configuration;
import com.factset.sdk.FactSetGlobalPrices.auth.*;
import com.factset.sdk.FactSetGlobalPrices.models.*;
import com.factset.sdk.FactSetGlobalPrices.api.CorporateActionsForCalendarApi;

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

        CorporateActionsForCalendarApi apiInstance = new CorporateActionsForCalendarApi(defaultClient);
        java.util.List<String> ids = Arrays.asList(); // java.util.List<String> | The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent IDs. If not specified, the data related to all the IDs is returned.
        LocalDate startDate = LocalDate.parse("Mon Dec 31 00:00:00 UTC 2018"); // LocalDate | The start date requested for a given date range in **YYYY-MM-DD** format. If both start and end dates are omitted, the API will return data for the current week starting from Monday.
        LocalDate endDate = LocalDate.parse("Tue Dec 31 00:00:00 UTC 2019"); // LocalDate | The end date requested for a given date range in **YYYY-MM-DD** format. The max date range is 1 year for up to 100 identifiers. If IDs are more than 100 or omitted, the max range is restricted to 90 days.
        java.util.List<String> eventCategories = Arrays.asList(); // java.util.List<String> | Select one or more Event Categories from the dropdown:   - **CASH_DIVS:** Includes Dividends(DVC), Dividend with DRP Option(DVCD), Dividend Reinvestment(DRP)   - **STOCK_DIST:** Includes Stock Dividend(DVS), Stock Dividend - Special(DVSS), Bonus(BNS), Bonus - Special(BNSS)   - **SPINOFFS:** Includes Spin Off(SPO)   - **RIGHTS:** Includes Rights Issue(DSR)   - **SPLITS:** Includes Forward Split(FSP), Reverse Split(RSP), Split(SPL), Exchange Of Securities(EXOS)  If omitted, the data is returned for all the available eventCategories. 
        java.util.List<String> exchanges = Arrays.asList(); // java.util.List<String> | One or more exchange codes for which data is to be requested. When omitted, the data from all the supported exchanges is returned. See `/meta/exchanges` for available values.
        java.util.List<String> sort = Arrays.asList(); // java.util.List<String> | Sorts the field in ascending or descending order of `eventDate`.
        Integer paginationLimit = 50; // Integer | Specifies the number of results to return per page. The maximum limit is 500.
        Integer paginationOffset = 0; // Integer | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results.
        try {
            CorporateActionsResponseCalendar result = apiInstance.getCorporateActions(ids, startDate, endDate, eventCategories, exchanges, sort, paginationLimit, paginationOffset);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling CorporateActionsForCalendarApi#getCorporateActions");
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
 **ids** | **List&lt;String&gt;**| The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent IDs. If not specified, the data related to all the IDs is returned. | [optional]
 **startDate** | **LocalDate**| The start date requested for a given date range in **YYYY-MM-DD** format. If both start and end dates are omitted, the API will return data for the current week starting from Monday. | [optional]
 **endDate** | **LocalDate**| The end date requested for a given date range in **YYYY-MM-DD** format. The max date range is 1 year for up to 100 identifiers. If IDs are more than 100 or omitted, the max range is restricted to 90 days. | [optional]
 **eventCategories** | **List&lt;String&gt;**| Select one or more Event Categories from the dropdown:   - **CASH_DIVS:** Includes Dividends(DVC), Dividend with DRP Option(DVCD), Dividend Reinvestment(DRP)   - **STOCK_DIST:** Includes Stock Dividend(DVS), Stock Dividend - Special(DVSS), Bonus(BNS), Bonus - Special(BNSS)   - **SPINOFFS:** Includes Spin Off(SPO)   - **RIGHTS:** Includes Rights Issue(DSR)   - **SPLITS:** Includes Forward Split(FSP), Reverse Split(RSP), Split(SPL), Exchange Of Securities(EXOS)  If omitted, the data is returned for all the available eventCategories.  | [optional] [enum: CASH_DIVS, STOCK_DIST, SPINOFFS, RIGHTS, SPLITS]
 **exchanges** | **List&lt;String&gt;**| One or more exchange codes for which data is to be requested. When omitted, the data from all the supported exchanges is returned. See &#x60;/meta/exchanges&#x60; for available values. | [optional]
 **sort** | **List&lt;String&gt;**| Sorts the field in ascending or descending order of &#x60;eventDate&#x60;. | [optional] [enum: eventDate, -eventDate]
 **paginationLimit** | **Integer**| Specifies the number of results to return per page. The maximum limit is 500. | [optional] [default to 50]
 **paginationOffset** | **Integer**| Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. | [optional] [default to 0]

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
| **200** | Corporate Actions data items |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **404** | The requested endpoint could not be found. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |


## getDividends

> DividendsResponse getDividends(eventIds, ids, startDate, endDate, exchanges, sort, paginationLimit, paginationOffset)

Retrieve Dividend information

Retrieves detailed dividend information including amounts, relevant dates, and other specifics for Dividends,
Dividends with DRP Option, and Dividend Reinvestment events within the specified date range. 

To retrieve details of a given event for a company on a specific exchange, please pass both the eventId and the company identifier.  Note that passing eventId or (`eventId` + `ids`) will cause the end point to ignore the other parameters.  Passing values for any other combination of the parameters (`ids`, `startDate`, `endDate` and `exchanges`) will lead to an AND operation for all the parameters passed.


### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
import java.time.LocalDate;
// Import classes:
import com.factset.sdk.FactSetGlobalPrices.ApiClient;
import com.factset.sdk.FactSetGlobalPrices.ApiException;
import com.factset.sdk.FactSetGlobalPrices.Configuration;
import com.factset.sdk.FactSetGlobalPrices.auth.*;
import com.factset.sdk.FactSetGlobalPrices.models.*;
import com.factset.sdk.FactSetGlobalPrices.api.CorporateActionsForCalendarApi;

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

        CorporateActionsForCalendarApi apiInstance = new CorporateActionsForCalendarApi(defaultClient);
        java.util.List<String> eventIds = Arrays.asList(); // java.util.List<String> | FactSet Event Identifier - a unique identifier for an event across multiple exchanges. If provided, the API will return data for the specified event.
        java.util.List<String> ids = Arrays.asList(); // java.util.List<String> | The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent IDs. If not specified, the data related to all the IDs is returned.
        LocalDate startDate = LocalDate.parse("Mon Dec 31 00:00:00 UTC 2018"); // LocalDate | The start date requested for a given date range in **YYYY-MM-DD** format. If both start and end dates are omitted, the API will return data for the current week starting from Monday.
        LocalDate endDate = LocalDate.parse("Tue Dec 31 00:00:00 UTC 2019"); // LocalDate | The end date requested for a given date range in **YYYY-MM-DD** format. The max date range is 1 year for up to 100 identifiers. If IDs are more than 100 or omitted, the max range is restricted to 90 days.
        java.util.List<String> exchanges = Arrays.asList(); // java.util.List<String> | One or more exchange codes for which data is to be requested. When omitted, the data from all the supported exchanges is returned. See `/meta/exchanges` for available values.
        java.util.List<String> sort = Arrays.asList(); // java.util.List<String> | Sorts the field in ascending or descending order of `effectiveDate`.
        Integer paginationLimit = 50; // Integer | Specifies the number of results to return per page. The maximum limit is 500.
        Integer paginationOffset = 0; // Integer | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results.
        try {
            DividendsResponse result = apiInstance.getDividends(eventIds, ids, startDate, endDate, exchanges, sort, paginationLimit, paginationOffset);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling CorporateActionsForCalendarApi#getDividends");
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
 **eventIds** | **List&lt;String&gt;**| FactSet Event Identifier - a unique identifier for an event across multiple exchanges. If provided, the API will return data for the specified event. | [optional]
 **ids** | **List&lt;String&gt;**| The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent IDs. If not specified, the data related to all the IDs is returned. | [optional]
 **startDate** | **LocalDate**| The start date requested for a given date range in **YYYY-MM-DD** format. If both start and end dates are omitted, the API will return data for the current week starting from Monday. | [optional]
 **endDate** | **LocalDate**| The end date requested for a given date range in **YYYY-MM-DD** format. The max date range is 1 year for up to 100 identifiers. If IDs are more than 100 or omitted, the max range is restricted to 90 days. | [optional]
 **exchanges** | **List&lt;String&gt;**| One or more exchange codes for which data is to be requested. When omitted, the data from all the supported exchanges is returned. See &#x60;/meta/exchanges&#x60; for available values. | [optional]
 **sort** | **List&lt;String&gt;**| Sorts the field in ascending or descending order of &#x60;effectiveDate&#x60;. | [optional] [enum: effectiveDate, -effectiveDate]
 **paginationLimit** | **Integer**| Specifies the number of results to return per page. The maximum limit is 500. | [optional] [default to 50]
 **paginationOffset** | **Integer**| Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. | [optional] [default to 0]

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
| **200** | Dividend data items |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **404** | The requested endpoint could not be found. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |


## getEventCount

> EventCountResponse getEventCount(ids, startDate, endDate, exchanges, sort)

Retrieve daily event count for a given date range

Returns the overall count of various events for each day within the specified date range.


### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
import java.time.LocalDate;
// Import classes:
import com.factset.sdk.FactSetGlobalPrices.ApiClient;
import com.factset.sdk.FactSetGlobalPrices.ApiException;
import com.factset.sdk.FactSetGlobalPrices.Configuration;
import com.factset.sdk.FactSetGlobalPrices.auth.*;
import com.factset.sdk.FactSetGlobalPrices.models.*;
import com.factset.sdk.FactSetGlobalPrices.api.CorporateActionsForCalendarApi;

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

        CorporateActionsForCalendarApi apiInstance = new CorporateActionsForCalendarApi(defaultClient);
        java.util.List<String> ids = Arrays.asList(); // java.util.List<String> | The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent IDs. If not specified, the data related to all the IDs is returned.
        LocalDate startDate = LocalDate.parse("Mon Dec 31 00:00:00 UTC 2018"); // LocalDate | The start date requested for a given date range in **YYYY-MM-DD** format. If both start and end dates are omitted, the API will return data for the current week starting from Monday.
        LocalDate endDate = LocalDate.parse("Tue Dec 31 00:00:00 UTC 2019"); // LocalDate | The end date requested for a given date range in **YYYY-MM-DD** format. The max date range is 1 year for up to 100 identifiers. If IDs are more than 100 or omitted, the max range is restricted to 90 days.
        java.util.List<String> exchanges = Arrays.asList(); // java.util.List<String> | One or more exchange codes for which data is to be requested. When omitted, the data from all the supported exchanges is returned. See `/meta/exchanges` for available values.
        java.util.List<String> sort = Arrays.asList(); // java.util.List<String> | Sorts the field in ascending or descending order of `eventDate`.
        try {
            EventCountResponse result = apiInstance.getEventCount(ids, startDate, endDate, exchanges, sort);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling CorporateActionsForCalendarApi#getEventCount");
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
 **ids** | **List&lt;String&gt;**| The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent IDs. If not specified, the data related to all the IDs is returned. | [optional]
 **startDate** | **LocalDate**| The start date requested for a given date range in **YYYY-MM-DD** format. If both start and end dates are omitted, the API will return data for the current week starting from Monday. | [optional]
 **endDate** | **LocalDate**| The end date requested for a given date range in **YYYY-MM-DD** format. The max date range is 1 year for up to 100 identifiers. If IDs are more than 100 or omitted, the max range is restricted to 90 days. | [optional]
 **exchanges** | **List&lt;String&gt;**| One or more exchange codes for which data is to be requested. When omitted, the data from all the supported exchanges is returned. See &#x60;/meta/exchanges&#x60; for available values. | [optional]
 **sort** | **List&lt;String&gt;**| Sorts the field in ascending or descending order of &#x60;eventDate&#x60;. | [optional] [enum: eventDate, -eventDate]

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
| **200** | Event Count data items |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **404** | The requested endpoint could not be found. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |


## getExchanges

> ExchangesResponse getExchanges()

Returns a list of exchanges for which event/action data is available.

Returns a list of available values for the exchanges parameter.


### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.FactSetGlobalPrices.ApiClient;
import com.factset.sdk.FactSetGlobalPrices.ApiException;
import com.factset.sdk.FactSetGlobalPrices.Configuration;
import com.factset.sdk.FactSetGlobalPrices.auth.*;
import com.factset.sdk.FactSetGlobalPrices.models.*;
import com.factset.sdk.FactSetGlobalPrices.api.CorporateActionsForCalendarApi;

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

        CorporateActionsForCalendarApi apiInstance = new CorporateActionsForCalendarApi(defaultClient);
        try {
            ExchangesResponse result = apiInstance.getExchanges();
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling CorporateActionsForCalendarApi#getExchanges");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
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
| **200** | Exchange details |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **404** | The requested endpoint could not be found. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |


## getRightsIssues

> RightsIssuesResponse getRightsIssues(eventIds, ids, startDate, endDate, exchanges, sort, paginationLimit, paginationOffset)

Retrieve Rights Issue information

Retrieves the prices, relevant dates, and other specifics over a specified date range for Rights Issue events.

To retrieve details of a given event for a company on a specific exchange, please pass both the eventId and the company identifier.  Note that passing eventId or (`eventId` + `ids`) will cause the end point to ignore the other parameters.  Passing values for any other combination of the parameters (`ids`, `startDate`, `endDate` and `exchanges`) will lead to an AND operation for all the parameters passed.


### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
import java.time.LocalDate;
// Import classes:
import com.factset.sdk.FactSetGlobalPrices.ApiClient;
import com.factset.sdk.FactSetGlobalPrices.ApiException;
import com.factset.sdk.FactSetGlobalPrices.Configuration;
import com.factset.sdk.FactSetGlobalPrices.auth.*;
import com.factset.sdk.FactSetGlobalPrices.models.*;
import com.factset.sdk.FactSetGlobalPrices.api.CorporateActionsForCalendarApi;

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

        CorporateActionsForCalendarApi apiInstance = new CorporateActionsForCalendarApi(defaultClient);
        java.util.List<String> eventIds = Arrays.asList(); // java.util.List<String> | FactSet Event Identifier - a unique identifier for an event across multiple exchanges. If provided, the API will return data for the specified event.
        java.util.List<String> ids = Arrays.asList(); // java.util.List<String> | The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent IDs. If not specified, the data related to all the IDs is returned.
        LocalDate startDate = LocalDate.parse("Mon Dec 31 00:00:00 UTC 2018"); // LocalDate | The start date requested for a given date range in **YYYY-MM-DD** format. If both start and end dates are omitted, the API will return data for the current week starting from Monday.
        LocalDate endDate = LocalDate.parse("Tue Dec 31 00:00:00 UTC 2019"); // LocalDate | The end date requested for a given date range in **YYYY-MM-DD** format. The max date range is 1 year for up to 100 identifiers. If IDs are more than 100 or omitted, the max range is restricted to 90 days.
        java.util.List<String> exchanges = Arrays.asList(); // java.util.List<String> | One or more exchange codes for which data is to be requested. When omitted, the data from all the supported exchanges is returned. See `/meta/exchanges` for available values.
        java.util.List<String> sort = Arrays.asList(); // java.util.List<String> | Sorts the field in ascending or descending order of `effectiveDate`.
        Integer paginationLimit = 50; // Integer | Specifies the number of results to return per page. The maximum limit is 500.
        Integer paginationOffset = 0; // Integer | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results.
        try {
            RightsIssuesResponse result = apiInstance.getRightsIssues(eventIds, ids, startDate, endDate, exchanges, sort, paginationLimit, paginationOffset);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling CorporateActionsForCalendarApi#getRightsIssues");
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
 **eventIds** | **List&lt;String&gt;**| FactSet Event Identifier - a unique identifier for an event across multiple exchanges. If provided, the API will return data for the specified event. | [optional]
 **ids** | **List&lt;String&gt;**| The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent IDs. If not specified, the data related to all the IDs is returned. | [optional]
 **startDate** | **LocalDate**| The start date requested for a given date range in **YYYY-MM-DD** format. If both start and end dates are omitted, the API will return data for the current week starting from Monday. | [optional]
 **endDate** | **LocalDate**| The end date requested for a given date range in **YYYY-MM-DD** format. The max date range is 1 year for up to 100 identifiers. If IDs are more than 100 or omitted, the max range is restricted to 90 days. | [optional]
 **exchanges** | **List&lt;String&gt;**| One or more exchange codes for which data is to be requested. When omitted, the data from all the supported exchanges is returned. See &#x60;/meta/exchanges&#x60; for available values. | [optional]
 **sort** | **List&lt;String&gt;**| Sorts the field in ascending or descending order of &#x60;effectiveDate&#x60;. | [optional] [enum: effectiveDate, -effectiveDate]
 **paginationLimit** | **Integer**| Specifies the number of results to return per page. The maximum limit is 500. | [optional] [default to 50]
 **paginationOffset** | **Integer**| Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. | [optional] [default to 0]

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
| **200** | Rights Issue data items |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **404** | The requested endpoint could not be found. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |


## getSpinOffs

> SpinOffsResponse getSpinOffs(eventIds, ids, startDate, endDate, exchanges, sort, paginationLimit, paginationOffset)

Retrieve Spin Off information

Retrieves the price adjustment factors, dates, and other specifics over a specified date range for Spin Off events.

To retrieve details of a given event for a company on a specific exchange, please pass both the eventId and the company identifier.  Note that passing eventId or (`eventId` + `ids`) will cause the end point to ignore the other parameters.  Passing values for any other combination of the parameters (`ids`, `startDate`, `endDate` and `exchanges`) will lead to an AND operation for all the parameters passed.


### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
import java.time.LocalDate;
// Import classes:
import com.factset.sdk.FactSetGlobalPrices.ApiClient;
import com.factset.sdk.FactSetGlobalPrices.ApiException;
import com.factset.sdk.FactSetGlobalPrices.Configuration;
import com.factset.sdk.FactSetGlobalPrices.auth.*;
import com.factset.sdk.FactSetGlobalPrices.models.*;
import com.factset.sdk.FactSetGlobalPrices.api.CorporateActionsForCalendarApi;

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

        CorporateActionsForCalendarApi apiInstance = new CorporateActionsForCalendarApi(defaultClient);
        java.util.List<String> eventIds = Arrays.asList(); // java.util.List<String> | FactSet Event Identifier - a unique identifier for an event across multiple exchanges. If provided, the API will return data for the specified event.
        java.util.List<String> ids = Arrays.asList(); // java.util.List<String> | The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent IDs. If not specified, the data related to all the IDs is returned.
        LocalDate startDate = LocalDate.parse("Mon Dec 31 00:00:00 UTC 2018"); // LocalDate | The start date requested for a given date range in **YYYY-MM-DD** format. If both start and end dates are omitted, the API will return data for the current week starting from Monday.
        LocalDate endDate = LocalDate.parse("Tue Dec 31 00:00:00 UTC 2019"); // LocalDate | The end date requested for a given date range in **YYYY-MM-DD** format. The max date range is 1 year for up to 100 identifiers. If IDs are more than 100 or omitted, the max range is restricted to 90 days.
        java.util.List<String> exchanges = Arrays.asList(); // java.util.List<String> | One or more exchange codes for which data is to be requested. When omitted, the data from all the supported exchanges is returned. See `/meta/exchanges` for available values.
        java.util.List<String> sort = Arrays.asList(); // java.util.List<String> | Sorts the field in ascending or descending order of `effectiveDate`.
        Integer paginationLimit = 50; // Integer | Specifies the number of results to return per page. The maximum limit is 500.
        Integer paginationOffset = 0; // Integer | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results.
        try {
            SpinOffsResponse result = apiInstance.getSpinOffs(eventIds, ids, startDate, endDate, exchanges, sort, paginationLimit, paginationOffset);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling CorporateActionsForCalendarApi#getSpinOffs");
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
 **eventIds** | **List&lt;String&gt;**| FactSet Event Identifier - a unique identifier for an event across multiple exchanges. If provided, the API will return data for the specified event. | [optional]
 **ids** | **List&lt;String&gt;**| The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent IDs. If not specified, the data related to all the IDs is returned. | [optional]
 **startDate** | **LocalDate**| The start date requested for a given date range in **YYYY-MM-DD** format. If both start and end dates are omitted, the API will return data for the current week starting from Monday. | [optional]
 **endDate** | **LocalDate**| The end date requested for a given date range in **YYYY-MM-DD** format. The max date range is 1 year for up to 100 identifiers. If IDs are more than 100 or omitted, the max range is restricted to 90 days. | [optional]
 **exchanges** | **List&lt;String&gt;**| One or more exchange codes for which data is to be requested. When omitted, the data from all the supported exchanges is returned. See &#x60;/meta/exchanges&#x60; for available values. | [optional]
 **sort** | **List&lt;String&gt;**| Sorts the field in ascending or descending order of &#x60;effectiveDate&#x60;. | [optional] [enum: effectiveDate, -effectiveDate]
 **paginationLimit** | **Integer**| Specifies the number of results to return per page. The maximum limit is 500. | [optional] [default to 50]
 **paginationOffset** | **Integer**| Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. | [optional] [default to 0]

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
| **200** | Spin Off data items |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **404** | The requested endpoint could not be found. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |


## getSplits

> SplitsResponseCalendar getSplits(eventIds, ids, startDate, endDate, exchanges, sort, paginationLimit, paginationOffset)

Retrieve Split information

Retrieves the split factors, dates, and other specifics over a specified date range for Forward Split, 
Reverse Split, Split and Exchange of Securities event types.

To retrieve details of a given event for a company on a specific exchange, please pass both the eventId and the company identifier.  Note that passing eventId or (`eventId` + `ids`) will cause the end point to ignore the other parameters.  Passing values for any other combination of the parameters (`ids`, `startDate`, `endDate` and `exchanges`) will lead to an AND operation for all the parameters passed.


### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
import java.time.LocalDate;
// Import classes:
import com.factset.sdk.FactSetGlobalPrices.ApiClient;
import com.factset.sdk.FactSetGlobalPrices.ApiException;
import com.factset.sdk.FactSetGlobalPrices.Configuration;
import com.factset.sdk.FactSetGlobalPrices.auth.*;
import com.factset.sdk.FactSetGlobalPrices.models.*;
import com.factset.sdk.FactSetGlobalPrices.api.CorporateActionsForCalendarApi;

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

        CorporateActionsForCalendarApi apiInstance = new CorporateActionsForCalendarApi(defaultClient);
        java.util.List<String> eventIds = Arrays.asList(); // java.util.List<String> | FactSet Event Identifier - a unique identifier for an event across multiple exchanges. If provided, the API will return data for the specified event.
        java.util.List<String> ids = Arrays.asList(); // java.util.List<String> | The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent IDs. If not specified, the data related to all the IDs is returned.
        LocalDate startDate = LocalDate.parse("Mon Dec 31 00:00:00 UTC 2018"); // LocalDate | The start date requested for a given date range in **YYYY-MM-DD** format. If both start and end dates are omitted, the API will return data for the current week starting from Monday.
        LocalDate endDate = LocalDate.parse("Tue Dec 31 00:00:00 UTC 2019"); // LocalDate | The end date requested for a given date range in **YYYY-MM-DD** format. The max date range is 1 year for up to 100 identifiers. If IDs are more than 100 or omitted, the max range is restricted to 90 days.
        java.util.List<String> exchanges = Arrays.asList(); // java.util.List<String> | One or more exchange codes for which data is to be requested. When omitted, the data from all the supported exchanges is returned. See `/meta/exchanges` for available values.
        java.util.List<String> sort = Arrays.asList(); // java.util.List<String> | Sorts the field in ascending or descending order of `effectiveDate`.
        Integer paginationLimit = 50; // Integer | Specifies the number of results to return per page. The maximum limit is 500.
        Integer paginationOffset = 0; // Integer | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results.
        try {
            SplitsResponseCalendar result = apiInstance.getSplits(eventIds, ids, startDate, endDate, exchanges, sort, paginationLimit, paginationOffset);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling CorporateActionsForCalendarApi#getSplits");
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
 **eventIds** | **List&lt;String&gt;**| FactSet Event Identifier - a unique identifier for an event across multiple exchanges. If provided, the API will return data for the specified event. | [optional]
 **ids** | **List&lt;String&gt;**| The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent IDs. If not specified, the data related to all the IDs is returned. | [optional]
 **startDate** | **LocalDate**| The start date requested for a given date range in **YYYY-MM-DD** format. If both start and end dates are omitted, the API will return data for the current week starting from Monday. | [optional]
 **endDate** | **LocalDate**| The end date requested for a given date range in **YYYY-MM-DD** format. The max date range is 1 year for up to 100 identifiers. If IDs are more than 100 or omitted, the max range is restricted to 90 days. | [optional]
 **exchanges** | **List&lt;String&gt;**| One or more exchange codes for which data is to be requested. When omitted, the data from all the supported exchanges is returned. See &#x60;/meta/exchanges&#x60; for available values. | [optional]
 **sort** | **List&lt;String&gt;**| Sorts the field in ascending or descending order of &#x60;effectiveDate&#x60;. | [optional] [enum: effectiveDate, -effectiveDate]
 **paginationLimit** | **Integer**| Specifies the number of results to return per page. The maximum limit is 500. | [optional] [default to 50]
 **paginationOffset** | **Integer**| Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. | [optional] [default to 0]

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
| **200** | Split data items |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **404** | The requested endpoint could not be found. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |


## getStockDistributions

> StockDistributionsResponseCalendar getStockDistributions(eventIds, ids, startDate, endDate, exchanges, sort, paginationLimit, paginationOffset)

Retrieve Stock Distribution information

Retrieves detailed stock distribution information including price adjustment factors, relevant dates, and other 
specifics for Stock Dividends, Stock Dividends(Special), Bonus Issues, and Bonus Issues(Special) events within 
the specified date range.

To retrieve details of a given event for a company on a specific exchange, please pass both the eventId and the company identifier.  Note that passing eventId or (`eventId` + `ids`) will cause the end point to ignore the other parameters.  Passing values for any other combination of the parameters (`ids`, `startDate`, `endDate` and `exchanges`) will lead to an AND operation for all the parameters passed.


### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
import java.time.LocalDate;
// Import classes:
import com.factset.sdk.FactSetGlobalPrices.ApiClient;
import com.factset.sdk.FactSetGlobalPrices.ApiException;
import com.factset.sdk.FactSetGlobalPrices.Configuration;
import com.factset.sdk.FactSetGlobalPrices.auth.*;
import com.factset.sdk.FactSetGlobalPrices.models.*;
import com.factset.sdk.FactSetGlobalPrices.api.CorporateActionsForCalendarApi;

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

        CorporateActionsForCalendarApi apiInstance = new CorporateActionsForCalendarApi(defaultClient);
        java.util.List<String> eventIds = Arrays.asList(); // java.util.List<String> | FactSet Event Identifier - a unique identifier for an event across multiple exchanges. If provided, the API will return data for the specified event.
        java.util.List<String> ids = Arrays.asList(); // java.util.List<String> | The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent IDs. If not specified, the data related to all the IDs is returned.
        LocalDate startDate = LocalDate.parse("Mon Dec 31 00:00:00 UTC 2018"); // LocalDate | The start date requested for a given date range in **YYYY-MM-DD** format. If both start and end dates are omitted, the API will return data for the current week starting from Monday.
        LocalDate endDate = LocalDate.parse("Tue Dec 31 00:00:00 UTC 2019"); // LocalDate | The end date requested for a given date range in **YYYY-MM-DD** format. The max date range is 1 year for up to 100 identifiers. If IDs are more than 100 or omitted, the max range is restricted to 90 days.
        java.util.List<String> exchanges = Arrays.asList(); // java.util.List<String> | One or more exchange codes for which data is to be requested. When omitted, the data from all the supported exchanges is returned. See `/meta/exchanges` for available values.
        java.util.List<String> sort = Arrays.asList(); // java.util.List<String> | Sorts the field in ascending or descending order of `effectiveDate`.
        Integer paginationLimit = 50; // Integer | Specifies the number of results to return per page. The maximum limit is 500.
        Integer paginationOffset = 0; // Integer | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results.
        try {
            StockDistributionsResponseCalendar result = apiInstance.getStockDistributions(eventIds, ids, startDate, endDate, exchanges, sort, paginationLimit, paginationOffset);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling CorporateActionsForCalendarApi#getStockDistributions");
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
 **eventIds** | **List&lt;String&gt;**| FactSet Event Identifier - a unique identifier for an event across multiple exchanges. If provided, the API will return data for the specified event. | [optional]
 **ids** | **List&lt;String&gt;**| The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent IDs. If not specified, the data related to all the IDs is returned. | [optional]
 **startDate** | **LocalDate**| The start date requested for a given date range in **YYYY-MM-DD** format. If both start and end dates are omitted, the API will return data for the current week starting from Monday. | [optional]
 **endDate** | **LocalDate**| The end date requested for a given date range in **YYYY-MM-DD** format. The max date range is 1 year for up to 100 identifiers. If IDs are more than 100 or omitted, the max range is restricted to 90 days. | [optional]
 **exchanges** | **List&lt;String&gt;**| One or more exchange codes for which data is to be requested. When omitted, the data from all the supported exchanges is returned. See &#x60;/meta/exchanges&#x60; for available values. | [optional]
 **sort** | **List&lt;String&gt;**| Sorts the field in ascending or descending order of &#x60;effectiveDate&#x60;. | [optional] [enum: effectiveDate, -effectiveDate]
 **paginationLimit** | **Integer**| Specifies the number of results to return per page. The maximum limit is 500. | [optional] [default to 50]
 **paginationOffset** | **Integer**| Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. | [optional] [default to 0]

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
| **200** | Stock Distribution data items |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **404** | The requested endpoint could not be found. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

