# SummarySegmentsAndStatsApi

All URIs are relative to *https://api.factset.com/content/factset-funds/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getFundsAum**](SummarySegmentsAndStatsApi.md#getFundsAum) | **GET** /aum | Get Fund AUM for a requested date range and list of IDs
[**getFundsAumForList**](SummarySegmentsAndStatsApi.md#getFundsAumForList) | **POST** /aum | Get Fund AUM for a requested date range and large list of IDs
[**getFundsFlows**](SummarySegmentsAndStatsApi.md#getFundsFlows) | **GET** /flows | Get Fund Flows for a requested date range and list of IDs
[**getFundsFlowsForList**](SummarySegmentsAndStatsApi.md#getFundsFlowsForList) | **POST** /flows | Get Fund Flows for a requested date range and large list of IDs
[**getFundsSummary**](SummarySegmentsAndStatsApi.md#getFundsSummary) | **GET** /summary | Get basic reference summary data for a Fund.
[**getFundsSummaryForList**](SummarySegmentsAndStatsApi.md#getFundsSummaryForList) | **POST** /summary | Get basic reference data for a large list of Fund IDs.
[**getSegmentsAndStructure**](SummarySegmentsAndStatsApi.md#getSegmentsAndStructure) | **GET** /segments-and-structure | Get Fund Classification, Similar Funds, Segments, and Fund Structure
[**getSegmentsAndStructureForList**](SummarySegmentsAndStatsApi.md#getSegmentsAndStructureForList) | **POST** /segments-and-structure | Get Fund Classification, Similar Funds, Segments, and Fund Structure.



## getFundsAum

> AumResponse getFundsAum(ids, startDate, endDate, frequency, currency, dataType, paginationLimit, paginationOffset)

Get Fund AUM for a requested date range and list of IDs

Get the Fund Level or Share Class Level Assets Under Management (AUM). <p>NOTE - AUM can be accessed on a five-day calendar. If a vendor does not provide NAV and shares outstanding on a market holiday, the previous trading day value is used. If a vendor does provide data on a market holiday, that value will be presented, and then fund flows and AUM will be calculated. When you are manually calculating actual AUM on a market holiday or a rolled date, it will differ from the value shown in the FactSet workstation. This is due to the previous day's NAV being used in the manual AUM calculation.</p>

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
import java.time.LocalDate;
// Import classes:
import com.factset.sdk.FactSetFunds.ApiClient;
import com.factset.sdk.FactSetFunds.ApiException;
import com.factset.sdk.FactSetFunds.Configuration;
import com.factset.sdk.FactSetFunds.auth.*;
import com.factset.sdk.FactSetFunds.models.*;
import com.factset.sdk.FactSetFunds.api.SummarySegmentsAndStatsApi;

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

        SummarySegmentsAndStatsApi apiInstance = new SummarySegmentsAndStatsApi(defaultClient);
        java.util.List<String> ids = Arrays.asList(); // java.util.List<String> | The requested fund identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. <p>***IDs limit** =  10 per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of IDs, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>*
        LocalDate startDate = LocalDate.parse("2025-01-01"); // LocalDate | The start date requested for a given date range in YYYY-MM-DD format. If left blank, the API will default to previous close.Future dates (T+1) are not accepted in this endpoint.
        LocalDate endDate = LocalDate.parse("2025-12-31"); // LocalDate | The end date requested for a given date range in YYYY-MM-DD format. If left blank, the API will default to previous close.Future dates (T+1) are not accepted in this endpoint
        FrequencyAum frequency = FrequencyAum.fromValue("MTD"); // FrequencyAum | Controls the display frequency of the data returned. Supported values are: - **MTD**: Month-To-Date - **M**: Monthly, based on the last trading day of the month - **CQTD**: Calendar Quarter-to-Date - **CQ**: Calendar Quarterly - **CYTD**: Calendar Year-to-Date - **CY**: Calendar Yearly
        String currency = "USD"; // String | The ISO3 currency control for the requested fund. For a list of currency ISO codes, visit Online Assistant Page [OA1470](https://my.apps.factset.com/oa/pages/1470)
        NavDataType dataType = NavDataType.fromValue("ROLL"); // NavDataType | The Data Type of the NAV expressed as Raw or Rolled values.
        Integer paginationLimit = 20; // Integer | The maximum number of records to return. The default is 20.
        Integer paginationOffset = 0; // Integer | The number of records to skip before the first record to return. The default is 0.
        try {
            AumResponse result = apiInstance.getFundsAum(ids, startDate, endDate, frequency, currency, dataType, paginationLimit, paginationOffset);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling SummarySegmentsAndStatsApi#getFundsAum");
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
 **ids** | **List&lt;String&gt;**| The requested fund identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. &lt;p&gt;***IDs limit** &#x3D;  10 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of IDs, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;* |
 **startDate** | **LocalDate**| The start date requested for a given date range in YYYY-MM-DD format. If left blank, the API will default to previous close.Future dates (T+1) are not accepted in this endpoint. | [optional]
 **endDate** | **LocalDate**| The end date requested for a given date range in YYYY-MM-DD format. If left blank, the API will default to previous close.Future dates (T+1) are not accepted in this endpoint | [optional]
 **frequency** | **FrequencyAum**| Controls the display frequency of the data returned. Supported values are: - **MTD**: Month-To-Date - **M**: Monthly, based on the last trading day of the month - **CQTD**: Calendar Quarter-to-Date - **CQ**: Calendar Quarterly - **CYTD**: Calendar Year-to-Date - **CY**: Calendar Yearly | [optional] [default to M] [enum: MTD, M, CQTD, CQ, CYTD, CY]
 **currency** | **String**| The ISO3 currency control for the requested fund. For a list of currency ISO codes, visit Online Assistant Page [OA1470](https://my.apps.factset.com/oa/pages/1470) | [optional] [default to USD]
 **dataType** | **NavDataType**| The Data Type of the NAV expressed as Raw or Rolled values. | [optional] [default to ROLL] [enum: ROLL, RAW]
 **paginationLimit** | **Integer**| The maximum number of records to return. The default is 20. | [optional] [default to 20]
 **paginationOffset** | **Integer**| The number of records to skip before the first record to return. The default is 0. | [optional] [default to 0]

### Return type

[**AumResponse**](AumResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The AUM response object. |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **404** | The requested resource was not found. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **422** | Unprocessable Entity. Your request data was syntactically correct but semantically invalid. Check the required parameters and their value constraints.  |  -  |
| **500** | Internal Server Error. |  -  |


## getFundsAumForList

> AumResponse getFundsAumForList(aumRequest)

Get Fund AUM for a requested date range and large list of IDs

Get the Fund Level or Share Class Level Assets Under Management (AUM). <p>NOTE - AUM can be accessed on a five-day calendar. If a vendor does not provide NAV and shares outstanding on a market holiday, the previous trading day value is used. If a vendor does provide data on a market holiday, that value will be presented, and then fund flows and AUM will be calculated. When you are manually calculating actual AUM on a market holiday or a rolled date, it will differ from the value shown in the FactSet workstation. This is due to the previous day's NAV being used in the manual AUM calculation.</p>

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.FactSetFunds.ApiClient;
import com.factset.sdk.FactSetFunds.ApiException;
import com.factset.sdk.FactSetFunds.Configuration;
import com.factset.sdk.FactSetFunds.auth.*;
import com.factset.sdk.FactSetFunds.models.*;
import com.factset.sdk.FactSetFunds.api.SummarySegmentsAndStatsApi;

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

        SummarySegmentsAndStatsApi apiInstance = new SummarySegmentsAndStatsApi(defaultClient);
        AumRequest aumRequest = new AumRequest(); // AumRequest | The AUM request body, allowing the user to specify a list of IDs.
        try {
            AumResponse result = apiInstance.getFundsAumForList(aumRequest);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling SummarySegmentsAndStatsApi#getFundsAumForList");
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
 **aumRequest** | [**AumRequest**](AumRequest.md)| The AUM request body, allowing the user to specify a list of IDs. |

### Return type

[**AumResponse**](AumResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The AUM response object. |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **404** | The requested resource was not found. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **422** | Unprocessable Entity. Your request data was syntactically correct but semantically invalid. Check the required parameters and their value constraints.  |  -  |
| **500** | Internal Server Error. |  -  |


## getFundsFlows

> FlowsResponse getFundsFlows(ids, startDate, endDate, frequency, currency, paginationLimit, paginationOffset)

Get Fund Flows for a requested date range and list of IDs

Get the Fund Flows. One-day fund flows are calculated by subtracting the shares outstanding at previous close from the shares outstanding one day prior to close, and then multiplying the result by the net asset value (NAV) of one day prior to close.

The fund flows calculation breaks down as follows - 
```(Shares Outstanding T0 - Shares Outstanding T-1) * NAV T-1 ```
While NAVs are routinely reported on a trade-day (T0) basis, industry-wide shares outstanding are a mixture of trade-day and next-day values. Trade-day values are not verified, as the actual creation/redemption activity takes place late in the evening, after NAVs and shares outstanding values have been published. The result is that multiple industry flows are calculated using unverified T0 values.
FactSet has standardized all shares outstanding reporting on a next-day basis. To ensure that assets under management (AUM) and fund flows are synchronized, FactSet synchronizes shares outstanding values and changes with NAVs reported on the previous day, as the creations and redemptions used the previous day's reported NAVs as a transaction price. <p>For more information on Fund Flows Methodology, Time Windows, Market Holidays, and Missing Values, visit - [OA #17863](https://my.apps.factset.com/oa/pages/17863#Flows_Calculation)</p>


### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
import java.time.LocalDate;
// Import classes:
import com.factset.sdk.FactSetFunds.ApiClient;
import com.factset.sdk.FactSetFunds.ApiException;
import com.factset.sdk.FactSetFunds.Configuration;
import com.factset.sdk.FactSetFunds.auth.*;
import com.factset.sdk.FactSetFunds.models.*;
import com.factset.sdk.FactSetFunds.api.SummarySegmentsAndStatsApi;

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

        SummarySegmentsAndStatsApi apiInstance = new SummarySegmentsAndStatsApi(defaultClient);
        java.util.List<String> ids = Arrays.asList(); // java.util.List<String> | The requested fund identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. <p>***IDs limit** =  10 per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of IDs, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>*
        LocalDate startDate = LocalDate.parse("2025-01-01"); // LocalDate | The start date requested for a given date range in YYYY-MM-DD format. If left blank, the API will default to previous close.Future dates (T+1) are not accepted in this endpoint.
        LocalDate endDate = LocalDate.parse("2025-12-31"); // LocalDate | The end date requested for a given date range in YYYY-MM-DD format. If left blank, the API will default to previous close.Future dates (T+1) are not accepted in this endpoint
        Frequency frequency = Frequency.fromValue("D"); // Frequency | Controls the display frequency of the data returned. The supported frequencies are:    - **D**: Daily - **W**: Weekly, based on the last day of the week of the start date. - **M**: Monthly, based on the last trading day of the month. - **AM**: Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16, etc.). - **CQ**: Quarterly, based on the last trading day of the calendar quarter (March, June, September, or December). - **FQ**: Fiscal Quarter of the company. - **AY**: Actual Annual, based on the start date. - **CY**: Calendar Annual, based on the last trading day of the calendar year. - **FY**: Fiscal Annual, based on the last trading day of the company's fiscal year. 
        String currency = "USD"; // String | The ISO3 currency control for the requested fund. For a list of currency ISO codes, visit Online Assistant Page [OA1470](https://my.apps.factset.com/oa/pages/1470)
        Integer paginationLimit = 20; // Integer | The maximum number of records to return. The default is 20.
        Integer paginationOffset = 0; // Integer | The number of records to skip before the first record to return. The default is 0.
        try {
            FlowsResponse result = apiInstance.getFundsFlows(ids, startDate, endDate, frequency, currency, paginationLimit, paginationOffset);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling SummarySegmentsAndStatsApi#getFundsFlows");
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
 **ids** | **List&lt;String&gt;**| The requested fund identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. &lt;p&gt;***IDs limit** &#x3D;  10 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of IDs, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;* |
 **startDate** | **LocalDate**| The start date requested for a given date range in YYYY-MM-DD format. If left blank, the API will default to previous close.Future dates (T+1) are not accepted in this endpoint. | [optional]
 **endDate** | **LocalDate**| The end date requested for a given date range in YYYY-MM-DD format. If left blank, the API will default to previous close.Future dates (T+1) are not accepted in this endpoint | [optional]
 **frequency** | **Frequency**| Controls the display frequency of the data returned. The supported frequencies are:    - **D**: Daily - **W**: Weekly, based on the last day of the week of the start date. - **M**: Monthly, based on the last trading day of the month. - **AM**: Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16, etc.). - **CQ**: Quarterly, based on the last trading day of the calendar quarter (March, June, September, or December). - **FQ**: Fiscal Quarter of the company. - **AY**: Actual Annual, based on the start date. - **CY**: Calendar Annual, based on the last trading day of the calendar year. - **FY**: Fiscal Annual, based on the last trading day of the company&#39;s fiscal year.  | [optional] [default to D] [enum: D, W, M, AM, CQ, FQ, AY, CY, FY]
 **currency** | **String**| The ISO3 currency control for the requested fund. For a list of currency ISO codes, visit Online Assistant Page [OA1470](https://my.apps.factset.com/oa/pages/1470) | [optional] [default to USD]
 **paginationLimit** | **Integer**| The maximum number of records to return. The default is 20. | [optional] [default to 20]
 **paginationOffset** | **Integer**| The number of records to skip before the first record to return. The default is 0. | [optional] [default to 0]

### Return type

[**FlowsResponse**](FlowsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The Fund Flows response object. |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **404** | The requested resource was not found. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **422** | Unprocessable Entity. Your request data was syntactically correct but semantically invalid. Check the required parameters and their value constraints.  |  -  |
| **500** | Internal Server Error. |  -  |


## getFundsFlowsForList

> FlowsResponse getFundsFlowsForList(flowsRequest)

Get Fund Flows for a requested date range and large list of IDs

Get the Fund Flows. One-day fund flows are calculated by subtracting the shares outstanding at previous close from the shares outstanding one day prior to close, and then multiplying the result by the net asset value (NAV) of one day prior to close.

The fund flows calculation breaks down as follows - 
```(Shares Outstanding T0 - Shares Outstanding T-1) * NAV T-1```
While NAVs are routinely reported on a trade-day (T0) basis, industry-wide shares outstanding are a mixture of trade-day and next-day values. Trade-day values are not verified, as the actual creation/redemption activity takes place late in the evening, after NAVs and shares outstanding values have been published. The result is that multiple industry flows are calculated using unverified T0 values.
FactSet has standardized all shares outstanding reporting on a next-day basis. To ensure that assets under management (AUM) and fund flows are synchronized, FactSet synchronizes shares outstanding values and changes with NAVs reported on the previous day, as the creations and redemptions used the previous day's reported NAVs as a transaction price. <p>For more information on Fund Flows Methodology, Time Windows, Market Holidays, and Missing Values, visit - [OA #17863](https://my.apps.factset.com/oa/pages/17863#Flows_Calculation)</p>


### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.FactSetFunds.ApiClient;
import com.factset.sdk.FactSetFunds.ApiException;
import com.factset.sdk.FactSetFunds.Configuration;
import com.factset.sdk.FactSetFunds.auth.*;
import com.factset.sdk.FactSetFunds.models.*;
import com.factset.sdk.FactSetFunds.api.SummarySegmentsAndStatsApi;

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

        SummarySegmentsAndStatsApi apiInstance = new SummarySegmentsAndStatsApi(defaultClient);
        FlowsRequest flowsRequest = new FlowsRequest(); // FlowsRequest | The Fund Flows request body, allowing the user to specify a list of IDs.
        try {
            FlowsResponse result = apiInstance.getFundsFlowsForList(flowsRequest);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling SummarySegmentsAndStatsApi#getFundsFlowsForList");
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
 **flowsRequest** | [**FlowsRequest**](FlowsRequest.md)| The Fund Flows request body, allowing the user to specify a list of IDs. |

### Return type

[**FlowsResponse**](FlowsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The Flows response object. |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **404** | The requested resource was not found. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **422** | Unprocessable Entity. Your request data was syntactically correct but semantically invalid. Check the required parameters and their value constraints.  |  -  |
| **500** | Internal Server Error. |  -  |


## getFundsSummary

> SummariesResponse getFundsSummary(ids, lang)

Get basic reference summary data for a Fund.

Fetch basic reference data for the requested fund(s), including `fundDomicile`, `shareClass`, `shareClassLaunchDate`, etc. 


### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.FactSetFunds.ApiClient;
import com.factset.sdk.FactSetFunds.ApiException;
import com.factset.sdk.FactSetFunds.Configuration;
import com.factset.sdk.FactSetFunds.auth.*;
import com.factset.sdk.FactSetFunds.models.*;
import com.factset.sdk.FactSetFunds.api.SummarySegmentsAndStatsApi;

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

        SummarySegmentsAndStatsApi apiInstance = new SummarySegmentsAndStatsApi(defaultClient);
        java.util.List<String> ids = Arrays.asList(); // java.util.List<String> | The requested fund identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. <p>***IDs limit** =  10 per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of IDs, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>*
        Lang lang = Lang.fromValue("EN"); // Lang | Language to be returned for Description, Insight (Overview), and Objective attributes, where available. Currently French will be returned for U.S. funds when \"FR\" is passed.
        try {
            SummariesResponse result = apiInstance.getFundsSummary(ids, lang);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling SummarySegmentsAndStatsApi#getFundsSummary");
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
 **ids** | **List&lt;String&gt;**| The requested fund identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. &lt;p&gt;***IDs limit** &#x3D;  10 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of IDs, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;* |
 **lang** | **Lang**| Language to be returned for Description, Insight (Overview), and Objective attributes, where available. Currently French will be returned for U.S. funds when \&quot;FR\&quot; is passed. | [optional] [default to EN] [enum: EN, FR]

### Return type

[**SummariesResponse**](SummariesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The Fund Summaries response object. |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **404** | The requested resource was not found. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **422** | Unprocessable Entity. Your request data was syntactically correct but semantically invalid. Check the required parameters and their value constraints.  |  -  |
| **500** | Internal Server Error. |  -  |


## getFundsSummaryForList

> SummariesResponse getFundsSummaryForList(summariesRequest)

Get basic reference data for a large list of Fund IDs.

Fetch basic reference data for the requested fund(s), including `fundDomicile`, `shareClass`, `shareClassLaunchDate`, etc. 


### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.FactSetFunds.ApiClient;
import com.factset.sdk.FactSetFunds.ApiException;
import com.factset.sdk.FactSetFunds.Configuration;
import com.factset.sdk.FactSetFunds.auth.*;
import com.factset.sdk.FactSetFunds.models.*;
import com.factset.sdk.FactSetFunds.api.SummarySegmentsAndStatsApi;

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

        SummarySegmentsAndStatsApi apiInstance = new SummarySegmentsAndStatsApi(defaultClient);
        SummariesRequest summariesRequest = new SummariesRequest(); // SummariesRequest | The Funds Summary request body, allowing the user to specify a list of IDs.
        try {
            SummariesResponse result = apiInstance.getFundsSummaryForList(summariesRequest);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling SummarySegmentsAndStatsApi#getFundsSummaryForList");
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
 **summariesRequest** | [**SummariesRequest**](SummariesRequest.md)| The Funds Summary request body, allowing the user to specify a list of IDs. |

### Return type

[**SummariesResponse**](SummariesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The Funds Summary response object. |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **404** | The requested resource was not found. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **422** | Unprocessable Entity. Your request data was syntactically correct but semantically invalid. Check the required parameters and their value constraints.  |  -  |
| **500** | Internal Server Error. |  -  |


## getSegmentsAndStructure

> SegmentsAndStructureResponse getSegmentsAndStructure(ids, structureType)

Get Fund Classification, Similar Funds, Segments, and Fund Structure

Returns fund structure information (classification, similar funds,
segments, or fund structure) based on the `structureType` parameter.


### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.FactSetFunds.ApiClient;
import com.factset.sdk.FactSetFunds.ApiException;
import com.factset.sdk.FactSetFunds.Configuration;
import com.factset.sdk.FactSetFunds.auth.*;
import com.factset.sdk.FactSetFunds.models.*;
import com.factset.sdk.FactSetFunds.api.SummarySegmentsAndStatsApi;

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

        SummarySegmentsAndStatsApi apiInstance = new SummarySegmentsAndStatsApi(defaultClient);
        java.util.List<String> ids = Arrays.asList(); // java.util.List<String> | The requested fund identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. <p>***IDs limit** =  10 per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of IDs, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>*
        StructureType structureType = StructureType.fromValue("CLASSIFICATION"); // StructureType | Returns the type of data items requested, such as classification details, similar funds, segment (benchmark) details, or structure information (funds structure and advisor details).  * **CLASSIFICATION**: Categorizes funds using a rules-based system that is derived from seven core classifications. This system evaluates the asset class, economic development level, and geographical region as described in each fund's prospectus and marketing materials. Fund exposure details are presented on successively granular levels- category, then focus, and then niche  * **SIMILAR_FUNDS**: Returns the similar fund share classes * **SEGMENTS**: Returns the Fund's Benchmark and Segment Benchmark information. * **FUND_STRUCTURE**: Returns fund structure and advisor information 
        try {
            SegmentsAndStructureResponse result = apiInstance.getSegmentsAndStructure(ids, structureType);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling SummarySegmentsAndStatsApi#getSegmentsAndStructure");
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
 **ids** | **List&lt;String&gt;**| The requested fund identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. &lt;p&gt;***IDs limit** &#x3D;  10 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of IDs, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;* |
 **structureType** | **StructureType**| Returns the type of data items requested, such as classification details, similar funds, segment (benchmark) details, or structure information (funds structure and advisor details).  * **CLASSIFICATION**: Categorizes funds using a rules-based system that is derived from seven core classifications. This system evaluates the asset class, economic development level, and geographical region as described in each fund&#39;s prospectus and marketing materials. Fund exposure details are presented on successively granular levels- category, then focus, and then niche  * **SIMILAR_FUNDS**: Returns the similar fund share classes * **SEGMENTS**: Returns the Fund&#39;s Benchmark and Segment Benchmark information. * **FUND_STRUCTURE**: Returns fund structure and advisor information  | [optional] [default to CLASSIFICATION] [enum: CLASSIFICATION, SIMILAR_FUNDS, SEGMENTS, FUND_STRUCTURE]

### Return type

[**SegmentsAndStructureResponse**](SegmentsAndStructureResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **404** | The requested resource was not found. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **422** | Unprocessable Entity. Your request data was syntactically correct but semantically invalid. Check the required parameters and their value constraints.  |  -  |
| **500** | Internal Server Error. |  -  |


## getSegmentsAndStructureForList

> SegmentsAndStructureResponse getSegmentsAndStructureForList(segmentsAndStructureRequest)

Get Fund Classification, Similar Funds, Segments, and Fund Structure.

Returns fund structure information (classification, similar funds, segments, or fund structure) for a large list of fund IDs based on the `structureType` parameter.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.FactSetFunds.ApiClient;
import com.factset.sdk.FactSetFunds.ApiException;
import com.factset.sdk.FactSetFunds.Configuration;
import com.factset.sdk.FactSetFunds.auth.*;
import com.factset.sdk.FactSetFunds.models.*;
import com.factset.sdk.FactSetFunds.api.SummarySegmentsAndStatsApi;

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

        SummarySegmentsAndStatsApi apiInstance = new SummarySegmentsAndStatsApi(defaultClient);
        SegmentsAndStructureRequest segmentsAndStructureRequest = new SegmentsAndStructureRequest(); // SegmentsAndStructureRequest | 
        try {
            SegmentsAndStructureResponse result = apiInstance.getSegmentsAndStructureForList(segmentsAndStructureRequest);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling SummarySegmentsAndStatsApi#getSegmentsAndStructureForList");
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
 **segmentsAndStructureRequest** | [**SegmentsAndStructureRequest**](SegmentsAndStructureRequest.md)|  |

### Return type

[**SegmentsAndStructureResponse**](SegmentsAndStructureResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **404** | The requested resource was not found. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **422** | Unprocessable Entity. Your request data was syntactically correct but semantically invalid. Check the required parameters and their value constraints.  |  -  |
| **500** | Internal Server Error. |  -  |

