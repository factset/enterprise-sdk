# SharesOutstandingApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getSharesOutstanding**](SharesOutstandingApi.md#getSharesOutstanding) | **GET** /factset-global-prices/v1/security-shares | Gets Shares Outstanding information for securities.
[**postSharesOutstanding**](SharesOutstandingApi.md#postSharesOutstanding) | **POST** /factset-global-prices/v1/security-shares | Gets Shares Outstanding information for securities.



## getSharesOutstanding

> GetSharesOutstandingResponseWrapper getSharesOutstanding(ids, startDate, endDate, frequency, calendar, batch)

Gets Shares Outstanding information for securities.

Returns security level shares outstanding data for the given IDs and dates. At this time, all values returned are split adjusted.

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
import com.factset.sdk.FactSetGlobalPrices.api.SharesOutstandingApi;
import com.factset.sdk.FactSetGlobalPrices.api.SharesOutstandingApi.GetSharesOutstandingResponseWrapper;

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

        SharesOutstandingApi apiInstance = new SharesOutstandingApi(defaultClient);
        java.util.List<String> ids = Arrays.asList(); // java.util.List<String> | The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent IDs.<p>***IDs limit** =  50 per both non-batch request and batch request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of IDs, which may lead to exceeding this request line limit of 8KB, it's advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>*
        String startDate = "2021-08-27"; // String | The start date requested for a given date range in **YYYY-MM-DD** format. The input start date must be before the input end date. Future dates (T+1) are not accepted in this endpoint. 
        String endDate = "2021-08-27"; // String | The end date requested for a given date range in **YYYY-MM-DD** format. The input end date must be after the input start date. Future dates (T+1) are not accepted in this endpoint. 
        String frequency = "D"; // String | Controls the display frequency of the data returned.   * **D** = Daily   * **AD** = Actual Daily   * **W** = Weekly, based on the last day of the week of the start date.   * **M** = Monthly, based on the last trading day of the month.   * **AM** = Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16 etc.).   * **AQ** =  Actual Quarterly   * **CQ** = Quarterly based on the last trading day of the calendar quarter (March, June, September, or December).   * **ASA** = Actual Semi-annual   * **CSA** = Calendar Semi-annual   * **AY** = Actual Annual, based on the start date.   * **CY** = Calendar Annual, based on the last trading day of the calendar year.    
        String calendar = "FIVEDAY"; // String | Calendar of data returned. SEVENDAY includes weekends.
        String batch = "Y"; // String | Enables the ability to asynchronously \"batch\" the request, supporting a long-running request for up to 20 minutes. Upon requesting batch=Y, the service will respond with an HTTP Status Code of 202. Once a batch request is submitted, use batch status to see if the job has been completed. Once completed, retrieve the results of the request via batch-result.  For single-day requests, the IDs limit is 500 for non-batch and 2000 for batch. For multi-day requests, the limit is 50 IDs for both batch and non-batch.  Limits on query string via GET method still apply. It's advised to submit large lists of IDs via POST method. <B>Please note that the number of unique currencies present in the requested IDs is limited to 50 per request.</B> 
        try {
            GetSharesOutstandingResponseWrapper result = apiInstance.getSharesOutstanding(ids, startDate, endDate, frequency, calendar, batch);
            switch(result.getStatusCode()) {
            
                case 200:
                    System.out.println(result.getResponse200()); // SharesOutstandingResponse
            
                case 202:
                    System.out.println(result.getResponse202()); // BatchStatusResponse
            
            }

        } catch (ApiException e) {
            System.err.println("Exception when calling SharesOutstandingApi#getSharesOutstanding");
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
 **ids** | **List&lt;String&gt;**| The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent IDs.&lt;p&gt;***IDs limit** &#x3D;  50 per both non-batch request and batch request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of IDs, which may lead to exceeding this request line limit of 8KB, it&#39;s advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;* |
 **startDate** | **String**| The start date requested for a given date range in **YYYY-MM-DD** format. The input start date must be before the input end date. Future dates (T+1) are not accepted in this endpoint.  | [optional] [default to 2021-08-27]
 **endDate** | **String**| The end date requested for a given date range in **YYYY-MM-DD** format. The input end date must be after the input start date. Future dates (T+1) are not accepted in this endpoint.  | [optional]
 **frequency** | **String**| Controls the display frequency of the data returned.   * **D** &#x3D; Daily   * **AD** &#x3D; Actual Daily   * **W** &#x3D; Weekly, based on the last day of the week of the start date.   * **M** &#x3D; Monthly, based on the last trading day of the month.   * **AM** &#x3D; Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16 etc.).   * **AQ** &#x3D;  Actual Quarterly   * **CQ** &#x3D; Quarterly based on the last trading day of the calendar quarter (March, June, September, or December).   * **ASA** &#x3D; Actual Semi-annual   * **CSA** &#x3D; Calendar Semi-annual   * **AY** &#x3D; Actual Annual, based on the start date.   * **CY** &#x3D; Calendar Annual, based on the last trading day of the calendar year.     | [optional] [default to D] [enum: D, AD, W, M, AM, AQ, CQ, ASA, CSA, AY, CY]
 **calendar** | **String**| Calendar of data returned. SEVENDAY includes weekends. | [optional] [default to FIVEDAY] [enum: FIVEDAY, SEVENDAY, US]
 **batch** | **String**| Enables the ability to asynchronously \&quot;batch\&quot; the request, supporting a long-running request for up to 20 minutes. Upon requesting batch&#x3D;Y, the service will respond with an HTTP Status Code of 202. Once a batch request is submitted, use batch status to see if the job has been completed. Once completed, retrieve the results of the request via batch-result.  For single-day requests, the IDs limit is 500 for non-batch and 2000 for batch. For multi-day requests, the limit is 50 IDs for both batch and non-batch.  Limits on query string via GET method still apply. It&#39;s advised to submit large lists of IDs via POST method. &lt;B&gt;Please note that the number of unique currencies present in the requested IDs is limited to 50 per request.&lt;/B&gt;  | [optional] [default to N] [enum: Y, N]

### Return type

GetSharesOutstandingResponseWrapper

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Array of security shares outstanding information for a given date range and list of securities |  -  |
| **202** | Batch request has been accepted. |  * Location - Path to Batch Request result. <br>  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |


## postSharesOutstanding

> PostSharesOutstandingResponseWrapper postSharesOutstanding(sharesOutstandingRequest)

Gets Shares Outstanding information for securities.

Returns security level shares outstanding data for the given IDs and dates. At this time, all values returned are split adjusted.

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
import com.factset.sdk.FactSetGlobalPrices.api.SharesOutstandingApi;
import com.factset.sdk.FactSetGlobalPrices.api.SharesOutstandingApi.PostSharesOutstandingResponseWrapper;

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

        SharesOutstandingApi apiInstance = new SharesOutstandingApi(defaultClient);
        SharesOutstandingRequest sharesOutstandingRequest = new SharesOutstandingRequest(); // SharesOutstandingRequest | Request object for `Shares Outstanding`.
        try {
            PostSharesOutstandingResponseWrapper result = apiInstance.postSharesOutstanding(sharesOutstandingRequest);
            switch(result.getStatusCode()) {
            
                case 200:
                    System.out.println(result.getResponse200()); // SharesOutstandingResponse
            
                case 202:
                    System.out.println(result.getResponse202()); // BatchStatusResponse
            
            }

        } catch (ApiException e) {
            System.err.println("Exception when calling SharesOutstandingApi#postSharesOutstanding");
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
 **sharesOutstandingRequest** | [**SharesOutstandingRequest**](SharesOutstandingRequest.md)| Request object for &#x60;Shares Outstanding&#x60;. |

### Return type

PostSharesOutstandingResponseWrapper

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Array of shares outstanding |  -  |
| **202** | Batch request has been accepted. |  * Location - Path to Batch Request result. <br>  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

