# PricesReturnsApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getFundsPrices**](PricesReturnsApi.md#getFundsPrices) | **GET** /factset-funds/v1/prices | Get Fund Prices (NAV) for a requested time-series
[**getFundsPricesForList**](PricesReturnsApi.md#getFundsPricesForList) | **POST** /factset-funds/v1/prices | Get Fund Prices (NAV) for a requested date range and large list of ids.
[**getFundsReturns**](PricesReturnsApi.md#getFundsReturns) | **GET** /factset-funds/v1/returns | Get Fund Returns for a requested time-series
[**getFundsReturnsForList**](PricesReturnsApi.md#getFundsReturnsForList) | **POST** /factset-funds/v1/returns | Get Fund Returns for a requested time-series and large list of ids
[**getFundsReturnsRange**](PricesReturnsApi.md#getFundsReturnsRange) | **GET** /factset-funds/v1/returns-range | Get Fund Returns for a user-defined date range
[**getFundsReturnsRangeForList**](PricesReturnsApi.md#getFundsReturnsRangeForList) | **POST** /factset-funds/v1/returns-range | Get Fund Returns over pre-defined time horizons as of a specific date for large list of ids.
[**getFundsReturnsSnapshot**](PricesReturnsApi.md#getFundsReturnsSnapshot) | **GET** /factset-funds/v1/returns-snapshot | Get Fund Returns over pre-defined time horizons as of a specific date.
[**getFundsReturnsSnapshotForList**](PricesReturnsApi.md#getFundsReturnsSnapshotForList) | **POST** /factset-funds/v1/returns-snapshot | Get Fund Returns over pre-defined time horizons as of a specific date.



## getFundsPrices

> FundsPricesResponse getFundsPrices(ids, startDate, endDate, frequency, currency, dataType, splitAdjust)

Get Fund Prices (NAV) for a requested time-series

Get Fund Prices (NAV) for a requested date range and list of ids.


### Example

```java
// Import classes:
import com.factset.sdk.FactSetFunds.ApiClient;
import com.factset.sdk.FactSetFunds.ApiException;
import com.factset.sdk.FactSetFunds.Configuration;
import com.factset.sdk.FactSetFunds.auth.*;
import com.factset.sdk.FactSetFunds.models.*;
import com.factset.sdk.FactSetFunds.api.PricesReturnsApi;

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

        PricesReturnsApi apiInstance = new PricesReturnsApi(defaultClient);
        java.util.List<String> ids = Arrays.asList(); // java.util.List<String> | The requested fund identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. <p>***ids limit** =  1000 per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>* 
        String startDate = "2018-12-31"; // String | The start date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to latest available completed period. 
        String endDate = "2019-12-31"; // String | The end date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to latest available completed period. 
        String frequency = "D"; // String | Controls the display frequency of the data returned.   * **D** = Daily   * **W** = Weekly, based on the last day of the week of the start date.   * **M** = Monthly, based on the last trading day of the month.   * **AM** = Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16 etc.).   * **CQ** = Quarterly based on the last trading day of the calendar quarter (March, June, September, or December).   * **FQ** = Fiscal Quarter of the company.   * **AY** = Actual Annual, based on the start date.   * **CY** = Calendar Annual, based on the last trading day of the calendar year.   * **FY** = Fiscal Annual, based on the last trading day of the company's fiscal year. 
        String currency = "LOCAL"; // String | Controls the Currency conversion of the Fund. By default, the currency will use the funds local currency.
        String dataType = "ROLL"; // String | The Data Type of the NAV expressed as Raw or Rolled values.
        String splitAdjust = "SPLIT"; // String | The price adjustment split or unsplit.
        try {
            FundsPricesResponse result = apiInstance.getFundsPrices(ids, startDate, endDate, frequency, currency, dataType, splitAdjust);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling PricesReturnsApi#getFundsPrices");
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
 **ids** | **List&lt;String&gt;**| The requested fund identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. &lt;p&gt;***ids limit** &#x3D;  1000 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;*  |
 **startDate** | **String**| The start date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to latest available completed period.  | [optional]
 **endDate** | **String**| The end date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to latest available completed period.  | [optional]
 **frequency** | **String**| Controls the display frequency of the data returned.   * **D** &#x3D; Daily   * **W** &#x3D; Weekly, based on the last day of the week of the start date.   * **M** &#x3D; Monthly, based on the last trading day of the month.   * **AM** &#x3D; Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16 etc.).   * **CQ** &#x3D; Quarterly based on the last trading day of the calendar quarter (March, June, September, or December).   * **FQ** &#x3D; Fiscal Quarter of the company.   * **AY** &#x3D; Actual Annual, based on the start date.   * **CY** &#x3D; Calendar Annual, based on the last trading day of the calendar year.   * **FY** &#x3D; Fiscal Annual, based on the last trading day of the company&#39;s fiscal year.  | [optional] [default to M] [enum: D, W, M, AM, CQ, FQ, AY, CY, FY]
 **currency** | **String**| Controls the Currency conversion of the Fund. By default, the currency will use the funds local currency. | [optional] [default to LOCAL]
 **dataType** | **String**| The Data Type of the NAV expressed as Raw or Rolled values. | [optional] [default to ROLL] [enum: ROLL, RAW]
 **splitAdjust** | **String**| The price adjustment split or unsplit. | [optional] [default to SPLIT] [enum: SPLIT, UNSPLIT]

### Return type

[**FundsPricesResponse**](FundsPricesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The Prices response object. |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |


## getFundsPricesForList

> FundsPricesResponse getFundsPricesForList(fundsPricesRequest)

Get Fund Prices (NAV) for a requested date range and large list of ids.

Fetch fund prices (NAV) as of a requested date range and a large list of ids. 


### Example

```java
// Import classes:
import com.factset.sdk.FactSetFunds.ApiClient;
import com.factset.sdk.FactSetFunds.ApiException;
import com.factset.sdk.FactSetFunds.Configuration;
import com.factset.sdk.FactSetFunds.auth.*;
import com.factset.sdk.FactSetFunds.models.*;
import com.factset.sdk.FactSetFunds.api.PricesReturnsApi;

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

        PricesReturnsApi apiInstance = new PricesReturnsApi(defaultClient);
        FundsPricesRequest fundsPricesRequest = new FundsPricesRequest(); // FundsPricesRequest | The Prices request body, allowing the user to specify a list of ids.
        try {
            FundsPricesResponse result = apiInstance.getFundsPricesForList(fundsPricesRequest);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling PricesReturnsApi#getFundsPricesForList");
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
 **fundsPricesRequest** | [**FundsPricesRequest**](FundsPricesRequest.md)| The Prices request body, allowing the user to specify a list of ids. |

### Return type

[**FundsPricesResponse**](FundsPricesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The Prices response object. |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |


## getFundsReturns

> FundsReturnsResponse getFundsReturns(ids, startDate, endDate, frequency, currency, dividendAdjust)

Get Fund Returns for a requested time-series

Get Fund NAV Returns over a time-series for the requested date range and frequency. <p>The simple Total Return NAV shows the fund's total return level by reinvesting distributions so that ex-date NAVs are increased by the distribution amount and compounded thereafter. Total return NAV compounds daily and is calculated from the first available NAV date of each fund. The total return NAV series reflects the value that an investor would own if it had purchased one share at the inception date and reinvested all dividends on a Gross basis.</p><p> Control the dividends to include or exclude using the dividendAdjust parameter. The first available NAV date of each fund can be found in the /summary endpoint as `priceFristDate`. Visit [OA #21437](https://my.apps.factset.com/oa/pages/21437) for more details.</p>


### Example

```java
// Import classes:
import com.factset.sdk.FactSetFunds.ApiClient;
import com.factset.sdk.FactSetFunds.ApiException;
import com.factset.sdk.FactSetFunds.Configuration;
import com.factset.sdk.FactSetFunds.auth.*;
import com.factset.sdk.FactSetFunds.models.*;
import com.factset.sdk.FactSetFunds.api.PricesReturnsApi;

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

        PricesReturnsApi apiInstance = new PricesReturnsApi(defaultClient);
        java.util.List<String> ids = Arrays.asList(); // java.util.List<String> | The requested fund identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. <p>***ids limit** =  1000 per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>* 
        String startDate = "2018-12-31"; // String | The start date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to latest available completed period. 
        String endDate = "2019-12-31"; // String | The end date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to latest available completed period. 
        String frequency = "D"; // String | Controls the display frequency of the data returned.   * **D** = Daily   * **W** = Weekly, based on the last day of the week of the start date.   * **M** = Monthly, based on the last trading day of the month.   * **AM** = Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16 etc.).   * **CQ** = Quarterly based on the last trading day of the calendar quarter (March, June, September, or December).   * **FQ** = Fiscal Quarter of the company.   * **AY** = Actual Annual, based on the start date.   * **CY** = Calendar Annual, based on the last trading day of the calendar year.   * **FY** = Fiscal Annual, based on the last trading day of the company's fiscal year. 
        String currency = "LOCAL"; // String | Controls the Currency conversion of the Fund. By default, the currency will use the funds local currency.
        String dividendAdjust = "DIV"; // String | Controls the dividend inclusion for the NAV returns calculations, where -  * DIV = Include Dividends, Total Return * NO_DIV = Exclude Dividends, Simple Return 
        try {
            FundsReturnsResponse result = apiInstance.getFundsReturns(ids, startDate, endDate, frequency, currency, dividendAdjust);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling PricesReturnsApi#getFundsReturns");
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
 **ids** | **List&lt;String&gt;**| The requested fund identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. &lt;p&gt;***ids limit** &#x3D;  1000 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;*  |
 **startDate** | **String**| The start date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to latest available completed period.  | [optional]
 **endDate** | **String**| The end date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to latest available completed period.  | [optional]
 **frequency** | **String**| Controls the display frequency of the data returned.   * **D** &#x3D; Daily   * **W** &#x3D; Weekly, based on the last day of the week of the start date.   * **M** &#x3D; Monthly, based on the last trading day of the month.   * **AM** &#x3D; Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16 etc.).   * **CQ** &#x3D; Quarterly based on the last trading day of the calendar quarter (March, June, September, or December).   * **FQ** &#x3D; Fiscal Quarter of the company.   * **AY** &#x3D; Actual Annual, based on the start date.   * **CY** &#x3D; Calendar Annual, based on the last trading day of the calendar year.   * **FY** &#x3D; Fiscal Annual, based on the last trading day of the company&#39;s fiscal year.  | [optional] [default to M] [enum: D, W, M, AM, CQ, FQ, AY, CY, FY]
 **currency** | **String**| Controls the Currency conversion of the Fund. By default, the currency will use the funds local currency. | [optional] [default to LOCAL]
 **dividendAdjust** | **String**| Controls the dividend inclusion for the NAV returns calculations, where -  * DIV &#x3D; Include Dividends, Total Return * NO_DIV &#x3D; Exclude Dividends, Simple Return  | [optional] [default to DIV] [enum: DIV, NO_DIV]

### Return type

[**FundsReturnsResponse**](FundsReturnsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The Returns response object. |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |


## getFundsReturnsForList

> FundsReturnsResponse getFundsReturnsForList(fundsReturnsRequest)

Get Fund Returns for a requested time-series and large list of ids

Get Fund NAV Returns over a time-series for the requested date range and frequency. <p>The simple Total Return NAV shows the fund's total return level by reinvesting distributions so that ex-date NAVs are increased by the distribution amount and compounded thereafter. Total return NAV compounds daily and is calculated from the first available NAV date of each fund. The total return NAV series reflects the value that an investor would own if it had purchased one share at the inception date and reinvested all dividends on a Gross basis.</p><p> Control the dividends to include or exclude using the dividendAdjust parameter. The first available NAV date of each fund can be found in the /summary endpoint as `priceFristDate`. Visit [OA #21437](https://my.apps.factset.com/oa/pages/21437) for more details.</p>


### Example

```java
// Import classes:
import com.factset.sdk.FactSetFunds.ApiClient;
import com.factset.sdk.FactSetFunds.ApiException;
import com.factset.sdk.FactSetFunds.Configuration;
import com.factset.sdk.FactSetFunds.auth.*;
import com.factset.sdk.FactSetFunds.models.*;
import com.factset.sdk.FactSetFunds.api.PricesReturnsApi;

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

        PricesReturnsApi apiInstance = new PricesReturnsApi(defaultClient);
        FundsReturnsRequest fundsReturnsRequest = new FundsReturnsRequest(); // FundsReturnsRequest | The Returns request body, allowing the user to specify a list of ids.
        try {
            FundsReturnsResponse result = apiInstance.getFundsReturnsForList(fundsReturnsRequest);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling PricesReturnsApi#getFundsReturnsForList");
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
 **fundsReturnsRequest** | [**FundsReturnsRequest**](FundsReturnsRequest.md)| The Returns request body, allowing the user to specify a list of ids. |

### Return type

[**FundsReturnsResponse**](FundsReturnsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The Returns response object. |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |


## getFundsReturnsRange

> ReturnsRangeResponse getFundsReturnsRange(ids, startDate, endDate, dividendAdjust)

Get Fund Returns for a user-defined date range

Get Fund Returns between a specified startDate and endDate. The service will compute the return between those two periods to retrieve the single value and does not create a time-series. Control the return type to include or exclude dividends by using the dividendAdjust parameter.


### Example

```java
// Import classes:
import com.factset.sdk.FactSetFunds.ApiClient;
import com.factset.sdk.FactSetFunds.ApiException;
import com.factset.sdk.FactSetFunds.Configuration;
import com.factset.sdk.FactSetFunds.auth.*;
import com.factset.sdk.FactSetFunds.models.*;
import com.factset.sdk.FactSetFunds.api.PricesReturnsApi;

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

        PricesReturnsApi apiInstance = new PricesReturnsApi(defaultClient);
        java.util.List<String> ids = Arrays.asList(); // java.util.List<String> | The requested fund identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. <p>***ids limit** =  1000 per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>* 
        String startDate = "2018-12-31"; // String | The start date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to the day prior to today's previous close. The startDate cannot be equal to the endDate as no return can be computed. Additionally, the startDate MUST be equal to or greater than the `priceFirstDate` found within the /summary endpoint. 
        String endDate = "2019-12-31"; // String | The end date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to latest available completed period. 
        String dividendAdjust = "DIV"; // String | Controls the dividend inclusion for the NAV returns calculations, where -  * DIV = Include Dividends, Total Return * NO_DIV = Exclude Dividends, Simple Return 
        try {
            ReturnsRangeResponse result = apiInstance.getFundsReturnsRange(ids, startDate, endDate, dividendAdjust);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling PricesReturnsApi#getFundsReturnsRange");
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
 **ids** | **List&lt;String&gt;**| The requested fund identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. &lt;p&gt;***ids limit** &#x3D;  1000 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;*  |
 **startDate** | **String**| The start date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to the day prior to today&#39;s previous close. The startDate cannot be equal to the endDate as no return can be computed. Additionally, the startDate MUST be equal to or greater than the &#x60;priceFirstDate&#x60; found within the /summary endpoint.  | [optional]
 **endDate** | **String**| The end date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to latest available completed period.  | [optional]
 **dividendAdjust** | **String**| Controls the dividend inclusion for the NAV returns calculations, where -  * DIV &#x3D; Include Dividends, Total Return * NO_DIV &#x3D; Exclude Dividends, Simple Return  | [optional] [default to DIV] [enum: DIV, NO_DIV]

### Return type

[**ReturnsRangeResponse**](ReturnsRangeResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The Returns Range response object. |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |


## getFundsReturnsRangeForList

> ReturnsRangeResponse getFundsReturnsRangeForList(returnsRangeRequest)

Get Fund Returns over pre-defined time horizons as of a specific date for large list of ids.

Get Fund Returns between a specified startDate and endDate. The service will compute the return between those two periods to retrieve the single value and does not create a time-series. Control the return type to include or exclude dividends by using the dividendAdjust parameter.


### Example

```java
// Import classes:
import com.factset.sdk.FactSetFunds.ApiClient;
import com.factset.sdk.FactSetFunds.ApiException;
import com.factset.sdk.FactSetFunds.Configuration;
import com.factset.sdk.FactSetFunds.auth.*;
import com.factset.sdk.FactSetFunds.models.*;
import com.factset.sdk.FactSetFunds.api.PricesReturnsApi;

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

        PricesReturnsApi apiInstance = new PricesReturnsApi(defaultClient);
        ReturnsRangeRequest returnsRangeRequest = new ReturnsRangeRequest(); // ReturnsRangeRequest | The Returns Range request body, allowing the user to specify a list of ids.
        try {
            ReturnsRangeResponse result = apiInstance.getFundsReturnsRangeForList(returnsRangeRequest);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling PricesReturnsApi#getFundsReturnsRangeForList");
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
 **returnsRangeRequest** | [**ReturnsRangeRequest**](ReturnsRangeRequest.md)| The Returns Range request body, allowing the user to specify a list of ids. |

### Return type

[**ReturnsRangeResponse**](ReturnsRangeResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The Returns Range response object. |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |


## getFundsReturnsSnapshot

> FundsReturnsSnapshotResponse getFundsReturnsSnapshot(ids, date, dividendAdjust)

Get Fund Returns over pre-defined time horizons as of a specific date.

Get Fund Returns over pre-defined time horizons as of a specific date. Use the date parameter to set the perspective date, and adjust the return type to include or exclude dividends using the dividendAdjust parameter. Returns Ranges include - 
* oneWeek
* oneMonth
* threeMonth
* yearToDate
* oneYear
* threeYear
* threeYearAnnualized
* fiveYear
* fiveYearAnnualized


### Example

```java
// Import classes:
import com.factset.sdk.FactSetFunds.ApiClient;
import com.factset.sdk.FactSetFunds.ApiException;
import com.factset.sdk.FactSetFunds.Configuration;
import com.factset.sdk.FactSetFunds.auth.*;
import com.factset.sdk.FactSetFunds.models.*;
import com.factset.sdk.FactSetFunds.api.PricesReturnsApi;

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

        PricesReturnsApi apiInstance = new PricesReturnsApi(defaultClient);
        java.util.List<String> ids = Arrays.asList(); // java.util.List<String> | The requested fund identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. <p>***ids limit** =  1000 per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>* 
        String date = "2018-12-31"; // String | The date requested for a given date range in YYYY-MM-DD format. The date MUST be equal to or less than the `priceRecentDate` found within the /summary endpoint. 
        String dividendAdjust = "DIV"; // String | Controls the dividend inclusion for the NAV returns calculations, where -  * DIV = Include Dividends, Total Return * NO_DIV = Exclude Dividends, Simple Return 
        try {
            FundsReturnsSnapshotResponse result = apiInstance.getFundsReturnsSnapshot(ids, date, dividendAdjust);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling PricesReturnsApi#getFundsReturnsSnapshot");
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
 **ids** | **List&lt;String&gt;**| The requested fund identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. &lt;p&gt;***ids limit** &#x3D;  1000 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;*  |
 **date** | **String**| The date requested for a given date range in YYYY-MM-DD format. The date MUST be equal to or less than the &#x60;priceRecentDate&#x60; found within the /summary endpoint.  | [optional]
 **dividendAdjust** | **String**| Controls the dividend inclusion for the NAV returns calculations, where -  * DIV &#x3D; Include Dividends, Total Return * NO_DIV &#x3D; Exclude Dividends, Simple Return  | [optional] [default to DIV] [enum: DIV, NO_DIV]

### Return type

[**FundsReturnsSnapshotResponse**](FundsReturnsSnapshotResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The Returns Snapshot response object. |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |


## getFundsReturnsSnapshotForList

> FundsReturnsSnapshotResponse getFundsReturnsSnapshotForList(fundsReturnsSnapshotRequest)

Get Fund Returns over pre-defined time horizons as of a specific date.

Get Fund Returns over pre-defined time horizons as of a specific date. Use the date parameter to set the perspective date, and adjust the return type to include or exclude dividends using the dividendAdjust parameter. Returns Ranges include - 
* oneWeek
* oneMonth
* threeMonth
* yearToDate
* oneYear
* threeYear
* threeYearAnnualized
* fiveYear
* fiveYearAnnualized 


### Example

```java
// Import classes:
import com.factset.sdk.FactSetFunds.ApiClient;
import com.factset.sdk.FactSetFunds.ApiException;
import com.factset.sdk.FactSetFunds.Configuration;
import com.factset.sdk.FactSetFunds.auth.*;
import com.factset.sdk.FactSetFunds.models.*;
import com.factset.sdk.FactSetFunds.api.PricesReturnsApi;

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

        PricesReturnsApi apiInstance = new PricesReturnsApi(defaultClient);
        FundsReturnsSnapshotRequest fundsReturnsSnapshotRequest = new FundsReturnsSnapshotRequest(); // FundsReturnsSnapshotRequest | The Returns Snapshot request body, allowing the user to specify a list of ids.
        try {
            FundsReturnsSnapshotResponse result = apiInstance.getFundsReturnsSnapshotForList(fundsReturnsSnapshotRequest);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling PricesReturnsApi#getFundsReturnsSnapshotForList");
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
 **fundsReturnsSnapshotRequest** | [**FundsReturnsSnapshotRequest**](FundsReturnsSnapshotRequest.md)| The Returns Snapshot request body, allowing the user to specify a list of ids. |

### Return type

[**FundsReturnsSnapshotResponse**](FundsReturnsSnapshotResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The Returns Snapshot response object. |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

