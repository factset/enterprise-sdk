# ReturnsApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getReturnsSnapshot**](ReturnsApi.md#getReturnsSnapshot) | **GET** /factset-prices/v1/returns-snapshot | Returns the price performance of the security and annualized compound total returns.
[**getReturnsSnapshotForList**](ReturnsApi.md#getReturnsSnapshotForList) | **POST** /factset-prices/v1/returns-snapshot | Returns the price performance of the security and annualized compound total returns.
[**getSecurityReturns**](ReturnsApi.md#getSecurityReturns) | **GET** /factset-prices/v1/returns | Gets Returns for a list of &#x60;ids&#x60; as of given date range and rolling Period
[**getSecurityReturnsForList**](ReturnsApi.md#getSecurityReturnsForList) | **POST** /factset-prices/v1/returns | Requests security returns for the given date range and rollingPeriod.



## getReturnsSnapshot

> ReturnsSnapshotResponse getReturnsSnapshot(ids, date, calendar, currency, dividendAdjust)

Returns the price performance of the security and annualized compound total returns.

Retrieves various return periods as of a given date for a requested list of securities. This endpoint is very helpful for quickly retrieving a list of pre-calculated returns for application development.<p> Return periods include
  * oneDay
  * weekToDate
  * monthToDate
  * quarterToDate
  * yearToDate
  * oneMonth
  * threeMonth
  * sixMonth
  * nineMonth
  * oneYear
  * twoYearAnnualized
  * threeYearAnnualized
  * fiveYearAnnualized
  * tenYearAnnualized
  * twentyYearAnnualized
  * thirtyYearAnnualized
  * ipoToDateAnnualized
  </p>


### Example

```java
// Import classes:
import com.factset.sdk.FactSetPrices.ApiClient;
import com.factset.sdk.FactSetPrices.ApiException;
import com.factset.sdk.FactSetPrices.Configuration;
import com.factset.sdk.FactSetPrices.auth.*;
import com.factset.sdk.FactSetPrices.model.*;
import com.factset.sdk.FactSetPrices.api.ReturnsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.factset.com/content");
        
        // Configure HTTP basic authorization: FactSetApiKey
        HttpBasicAuth FactSetApiKey = (HttpBasicAuth) defaultClient.getAuthentication("FactSetApiKey");
        FactSetApiKey.setUsername("YOUR USERNAME");
        FactSetApiKey.setPassword("YOUR PASSWORD");

        // Configure OAuth2 access token for authorization: FactSetOAuth2
        OAuth FactSetOAuth2 = (OAuth) defaultClient.getAuthentication("FactSetOAuth2");
        FactSetOAuth2.setAccessToken("YOUR ACCESS TOKEN");

        ReturnsApi apiInstance = new ReturnsApi(defaultClient);
        java.util.List<String> ids = Arrays.asList(); // java.util.List<String> | The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent Ids. <p>***ids limit** =  2000 per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>*
        String date = "2019-07-07"; // String | The date in **YYYY-MM-DD** format. This controls the perspective dates to the calculate the returns. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this endpoint. 
        String calendar = "FIVEDAY"; // String | Calendar of data returned. SEVENDAY includes weekends. LOCAL calendar will default to the securities' trading calendar which excludes date records for respective holiday periods.
        String currency = "USD"; // String | Currency code for adjusting prices. Default is Local. For a list of currency ISO codes, visit [Online Assistant Page 1470](https://oa.apps.factset.com/pages/1470).
        String dividendAdjust = "PRICE"; // String | Controls the dividend reinvestment for the returns calculation. Dividends will be reinvested on the date the dividends go ex (when the dividends belong to the seller rather than the buyer). Visit [OA 8748](https://my.apps.factset.com/oa/pages/8748) for calculation methodology.   * **PRICE** = Price Change - Dividends Excluded.   * **EXDATE** = Simple Return - Dividends Received on exdate but not reinvested. Dividends accumulated throughout the specified period are added to the price at the end of the period.   * **EXDATE_C** = Compound Return - Dividends reinvested on exdate. Dividends accumulated throughout the specified period are used to buy more shares of stock in the company. 
        try {
            ReturnsSnapshotResponse result = apiInstance.getReturnsSnapshot(ids, date, calendar, currency, dividendAdjust);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReturnsApi#getReturnsSnapshot");
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
 **ids** | **List&lt;String&gt;**| The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent Ids. &lt;p&gt;***ids limit** &#x3D;  2000 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;* |
 **date** | **String**| The date in **YYYY-MM-DD** format. This controls the perspective dates to the calculate the returns. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this endpoint.  | [optional]
 **calendar** | **String**| Calendar of data returned. SEVENDAY includes weekends. LOCAL calendar will default to the securities&#39; trading calendar which excludes date records for respective holiday periods. | [optional] [default to FIVEDAY] [enum: FIVEDAY, SEVENDAY, LOCAL]
 **currency** | **String**| Currency code for adjusting prices. Default is Local. For a list of currency ISO codes, visit [Online Assistant Page 1470](https://oa.apps.factset.com/pages/1470). | [optional]
 **dividendAdjust** | **String**| Controls the dividend reinvestment for the returns calculation. Dividends will be reinvested on the date the dividends go ex (when the dividends belong to the seller rather than the buyer). Visit [OA 8748](https://my.apps.factset.com/oa/pages/8748) for calculation methodology.   * **PRICE** &#x3D; Price Change - Dividends Excluded.   * **EXDATE** &#x3D; Simple Return - Dividends Received on exdate but not reinvested. Dividends accumulated throughout the specified period are added to the price at the end of the period.   * **EXDATE_C** &#x3D; Compound Return - Dividends reinvested on exdate. Dividends accumulated throughout the specified period are used to buy more shares of stock in the company.  | [optional] [default to PRICE] [enum: PRICE, EXDATE, EXDATE_C]

### Return type

[**ReturnsSnapshotResponse**](ReturnsSnapshotResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Array of returns-snapshot objects for the list of ids requested |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |


## getReturnsSnapshotForList

> ReturnsSnapshotResponse getReturnsSnapshotForList(returnsSnapshotRequest)

Returns the price performance of the security and annualized compound total returns.

Retrieves various return periods as of a given date for a requested list of securities. This endpoint is very helpful for quickly retrieving a list of pre-calculated returns for application development.<p> Return periods include
  * oneDay
  * weekToDate
  * monthToDate
  * quarterToDate
  * yearToDate
  * oneMonth
  * threeMonth
  * sixMonth
  * nineMonth
  * oneYear
  * twoYearAnnualized
  * threeYearAnnualized
  * fiveYearAnnualized
  * tenYearAnnualized
  * twentyYearAnnualized
  * thirtyYearAnnualized
  * ipoToDateAnnualized
  </p>


### Example

```java
// Import classes:
import com.factset.sdk.FactSetPrices.ApiClient;
import com.factset.sdk.FactSetPrices.ApiException;
import com.factset.sdk.FactSetPrices.Configuration;
import com.factset.sdk.FactSetPrices.auth.*;
import com.factset.sdk.FactSetPrices.model.*;
import com.factset.sdk.FactSetPrices.api.ReturnsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.factset.com/content");
        
        // Configure HTTP basic authorization: FactSetApiKey
        HttpBasicAuth FactSetApiKey = (HttpBasicAuth) defaultClient.getAuthentication("FactSetApiKey");
        FactSetApiKey.setUsername("YOUR USERNAME");
        FactSetApiKey.setPassword("YOUR PASSWORD");

        // Configure OAuth2 access token for authorization: FactSetOAuth2
        OAuth FactSetOAuth2 = (OAuth) defaultClient.getAuthentication("FactSetOAuth2");
        FactSetOAuth2.setAccessToken("YOUR ACCESS TOKEN");

        ReturnsApi apiInstance = new ReturnsApi(defaultClient);
        ReturnsSnapshotRequest returnsSnapshotRequest = new ReturnsSnapshotRequest(); // ReturnsSnapshotRequest | Request object for Returns-Snapshot.
        try {
            ReturnsSnapshotResponse result = apiInstance.getReturnsSnapshotForList(returnsSnapshotRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReturnsApi#getReturnsSnapshotForList");
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
 **returnsSnapshotRequest** | [**ReturnsSnapshotRequest**](ReturnsSnapshotRequest.md)| Request object for Returns-Snapshot. |

### Return type

[**ReturnsSnapshotResponse**](ReturnsSnapshotResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Array of returns-snapshot objects for the list of ids requested |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |


## getSecurityReturns

> ReturnsResponse getSecurityReturns(ids, startDate, endDate, frequency, calendar, currency, dividendAdjust, rollingPeriod)

Gets Returns for a list of &#x60;ids&#x60; as of given date range and rolling Period

The simple or compound return for the requested frequency and/or rollingPeriod. Depending on the input parameters the return will adjust accordingly. If you simply use frequency and no rollingPeriod, the return value will represent the frequency period. If you use rollingPeriod, the values will be returned in actual period ends (e.g. actual month, actual week, daily, etc.). General Return Calculation Details found on [Online Assistant Page #8748](https://oa.apps.factset.com/pages/8748)

### Example

```java
// Import classes:
import com.factset.sdk.FactSetPrices.ApiClient;
import com.factset.sdk.FactSetPrices.ApiException;
import com.factset.sdk.FactSetPrices.Configuration;
import com.factset.sdk.FactSetPrices.auth.*;
import com.factset.sdk.FactSetPrices.model.*;
import com.factset.sdk.FactSetPrices.api.ReturnsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.factset.com/content");
        
        // Configure HTTP basic authorization: FactSetApiKey
        HttpBasicAuth FactSetApiKey = (HttpBasicAuth) defaultClient.getAuthentication("FactSetApiKey");
        FactSetApiKey.setUsername("YOUR USERNAME");
        FactSetApiKey.setPassword("YOUR PASSWORD");

        // Configure OAuth2 access token for authorization: FactSetOAuth2
        OAuth FactSetOAuth2 = (OAuth) defaultClient.getAuthentication("FactSetOAuth2");
        FactSetOAuth2.setAccessToken("YOUR ACCESS TOKEN");

        ReturnsApi apiInstance = new ReturnsApi(defaultClient);
        java.util.List<String> ids = Arrays.asList(); // java.util.List<String> | The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent Ids. <p>***ids limit** =  2000 per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>*
        String startDate = "2019-01-01"; // String | The start date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this endpoint. 
        String endDate = "2019-12-31"; // String | The end date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this endpoint. 
        String frequency = "D"; // String | Controls the display frequency of the data returned.   * **D** = Daily   * **W** = Weekly, based on the last day of the week of the start date.   * **M** = Monthly, based on the last trading day of the month.   * **AM** = Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16 etc.).   * **CQ** = Quarterly based on the last trading day of the calendar quarter (March, June, September, or December).   * **FQ** = Fiscal Quarter of the company.   * **AY** = Actual Annual, based on the start date.   * **CY** = Calendar Annual, based on the last trading day of the calendar year.   * **FY** = Fiscal Annual, based on the last trading day of the company's fiscal year. 
        String calendar = "FIVEDAY"; // String | Calendar of data returned. SEVENDAY includes weekends. LOCAL calendar will default to the securities' trading calendar which excludes date records for respective holiday periods.
        String currency = "USD"; // String | Currency code for adjusting prices. Default is Local. For a list of currency ISO codes, visit [Online Assistant Page 1470](https://oa.apps.factset.com/pages/1470).
        String dividendAdjust = "PRICE"; // String | Controls the dividend reinvestment for the returns calculation.   * **PRICE** = Price Change - Dividends Excluded   * **EXDATE** = Simple Return - Dividends Received on exdate but not reinvested   * **PAYDATE** = Simple Return - Dividends Received on paydate but not reinvested   * **EXDATE_C** = Compound Return - Dividends reinvested on exdate   * **PAYDATE_C** = Compound Return - Dividends reinvested on paydate. 
        String rollingPeriod = "1D"; // String | Period of measure for the rolling cumulative return. This does not change display `frequency` but rather the underlying return calculation period. All periods are referencing actual periods of measure, not period-ends. For example, 1M rolling period will go back to that date the previous month, which is not always the month-end date.
        try {
            ReturnsResponse result = apiInstance.getSecurityReturns(ids, startDate, endDate, frequency, calendar, currency, dividendAdjust, rollingPeriod);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReturnsApi#getSecurityReturns");
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
 **ids** | **List&lt;String&gt;**| The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent Ids. &lt;p&gt;***ids limit** &#x3D;  2000 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;* |
 **startDate** | **String**| The start date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this endpoint.  | [optional]
 **endDate** | **String**| The end date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this endpoint.  | [optional]
 **frequency** | **String**| Controls the display frequency of the data returned.   * **D** &#x3D; Daily   * **W** &#x3D; Weekly, based on the last day of the week of the start date.   * **M** &#x3D; Monthly, based on the last trading day of the month.   * **AM** &#x3D; Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16 etc.).   * **CQ** &#x3D; Quarterly based on the last trading day of the calendar quarter (March, June, September, or December).   * **FQ** &#x3D; Fiscal Quarter of the company.   * **AY** &#x3D; Actual Annual, based on the start date.   * **CY** &#x3D; Calendar Annual, based on the last trading day of the calendar year.   * **FY** &#x3D; Fiscal Annual, based on the last trading day of the company&#39;s fiscal year.  | [optional] [default to D] [enum: D, W, M, AM, CQ, FQ, AY, CY, FY]
 **calendar** | **String**| Calendar of data returned. SEVENDAY includes weekends. LOCAL calendar will default to the securities&#39; trading calendar which excludes date records for respective holiday periods. | [optional] [default to FIVEDAY] [enum: FIVEDAY, SEVENDAY, LOCAL]
 **currency** | **String**| Currency code for adjusting prices. Default is Local. For a list of currency ISO codes, visit [Online Assistant Page 1470](https://oa.apps.factset.com/pages/1470). | [optional]
 **dividendAdjust** | **String**| Controls the dividend reinvestment for the returns calculation.   * **PRICE** &#x3D; Price Change - Dividends Excluded   * **EXDATE** &#x3D; Simple Return - Dividends Received on exdate but not reinvested   * **PAYDATE** &#x3D; Simple Return - Dividends Received on paydate but not reinvested   * **EXDATE_C** &#x3D; Compound Return - Dividends reinvested on exdate   * **PAYDATE_C** &#x3D; Compound Return - Dividends reinvested on paydate.  | [optional] [default to PRICE] [enum: PRICE, EXDATE, PAYDATE, EXDATE_C, PAYDATE_C]
 **rollingPeriod** | **String**| Period of measure for the rolling cumulative return. This does not change display &#x60;frequency&#x60; but rather the underlying return calculation period. All periods are referencing actual periods of measure, not period-ends. For example, 1M rolling period will go back to that date the previous month, which is not always the month-end date. | [optional] [enum: 1D, 1W, 1M, 3M, 6M, 52W, 2Y, 3Y, 5Y, 10Y]

### Return type

[**ReturnsResponse**](ReturnsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Array of security returns for the requested date range and rolling period |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |


## getSecurityReturnsForList

> ReturnsResponse getSecurityReturnsForList(returnsRequest)

Requests security returns for the given date range and rollingPeriod.

The simple or compound return for the requested frequency and/or rollingPeriod. Depending on the input parameters the return will adjust accordingly. If you simply use frequency and no rollingPeriod, the return value will represent the frequency period. If you use rollingPeriod, the values will be returned in actual period ends (e.g. actual month, actual week, daily, etc.). General Return Calculation Details found on [Online Assistant Page #8748](https://oa.apps.factset.com/pages/8748)

### Example

```java
// Import classes:
import com.factset.sdk.FactSetPrices.ApiClient;
import com.factset.sdk.FactSetPrices.ApiException;
import com.factset.sdk.FactSetPrices.Configuration;
import com.factset.sdk.FactSetPrices.auth.*;
import com.factset.sdk.FactSetPrices.model.*;
import com.factset.sdk.FactSetPrices.api.ReturnsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.factset.com/content");
        
        // Configure HTTP basic authorization: FactSetApiKey
        HttpBasicAuth FactSetApiKey = (HttpBasicAuth) defaultClient.getAuthentication("FactSetApiKey");
        FactSetApiKey.setUsername("YOUR USERNAME");
        FactSetApiKey.setPassword("YOUR PASSWORD");

        // Configure OAuth2 access token for authorization: FactSetOAuth2
        OAuth FactSetOAuth2 = (OAuth) defaultClient.getAuthentication("FactSetOAuth2");
        FactSetOAuth2.setAccessToken("YOUR ACCESS TOKEN");

        ReturnsApi apiInstance = new ReturnsApi(defaultClient);
        ReturnsRequest returnsRequest = new ReturnsRequest(); // ReturnsRequest | Request object for `Security` returns.
        try {
            ReturnsResponse result = apiInstance.getSecurityReturnsForList(returnsRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReturnsApi#getSecurityReturnsForList");
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
 **returnsRequest** | [**ReturnsRequest**](ReturnsRequest.md)| Request object for &#x60;Security&#x60; returns. |

### Return type

[**ReturnsResponse**](ReturnsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Array of security returns for the requested date range and rolling period |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

