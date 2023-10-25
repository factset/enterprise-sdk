# ForwardsApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getFXForwards**](ForwardsApi.md#getFXForwards) | **GET** /foreign-exchange/v1/forwards | Gets Forwards for a list of currency pairs
[**getFXForwardsForList**](ForwardsApi.md#getFXForwardsForList) | **POST** /foreign-exchange/v1/forwards | Gets Forwards for a list of currency pairs



## getFXForwards

> ForwardsResponse getFXForwards(ids, forwardPeriod, startDate, endDate, frequency)

Gets Forwards for a list of currency pairs

Forward rates are provided in 80+ currencies against the U.S. dollar, British pound, and euro. Forward quotes are provided by Reuters and coverage is determined by the amount of reliable currency trading in a particular currency. Bid, offer, and mid rates are available for 11 `forwardPeriod` periods - Overnight, Tomorrow Next, 1 Week (Spot Week), 1 month, 2 month, 3 month, 6 month, 9 month, 1 year, 2 year, 5 year. All identifiers have spot rates, but not all identifiers have forward rate data.


### Example

```java
// Import classes:
import com.factset.sdk.ForeignExchangeRate.ApiClient;
import com.factset.sdk.ForeignExchangeRate.ApiException;
import com.factset.sdk.ForeignExchangeRate.Configuration;
import com.factset.sdk.ForeignExchangeRate.auth.*;
import com.factset.sdk.ForeignExchangeRate.models.*;
import com.factset.sdk.ForeignExchangeRate.api.ForwardsApi;

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

        ForwardsApi apiInstance = new ForwardsApi(defaultClient);
        java.util.List<String> ids = Arrays.asList(); // java.util.List<String> | The currency pair requested in the format of a ISO {source}{target}. For a complete list of ISO currencies, please visit [OA 1470](https://my.apps.factset.com/oa/pages/1470)
        String forwardPeriod = "ON"; // String | Bid, offer, and mid rates are available for the following 11 time periods.  * ON - Overnight  * TN - Tomorrow Next  * SW - One Week (Spot Week)  * 1M - One Month  * 2M - Two Months  * 3M - Three Months  * 6M - Six Months  * 9M - Nine Months  * 1Y - One Year  * 2Y - Two Years  * 5Y - Five Years 
        String startDate = "2019-01-01"; // String | The start date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to latest available. 
        String endDate = "2019-12-31"; // String | The end date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to latest available. 
        String frequency = "D"; // String | Controls the display frequency of the data returned.   * **D** = Daily   * **W** = Weekly, based on the last day of the week of the start date.   * **M** = Monthly, based on the last trading day of the month.   * **AM** = Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16 etc.).    * **CQ** = Quarterly based on the last trading day of the calendar quarter (March, June, September, or December).   * **AY** = Actual Annual, based on the start date.   * **CY** = Calendar Annual, based on the last trading day of the calendar year. 
        try {
            ForwardsResponse result = apiInstance.getFXForwards(ids, forwardPeriod, startDate, endDate, frequency);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling ForwardsApi#getFXForwards");
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
 **ids** | **List&lt;String&gt;**| The currency pair requested in the format of a ISO {source}{target}. For a complete list of ISO currencies, please visit [OA 1470](https://my.apps.factset.com/oa/pages/1470) |
 **forwardPeriod** | **String**| Bid, offer, and mid rates are available for the following 11 time periods.  * ON - Overnight  * TN - Tomorrow Next  * SW - One Week (Spot Week)  * 1M - One Month  * 2M - Two Months  * 3M - Three Months  * 6M - Six Months  * 9M - Nine Months  * 1Y - One Year  * 2Y - Two Years  * 5Y - Five Years  | [optional] [default to 1M] [enum: ON, TN, SW, 1M, 2M, 3M, 6M, 9M, 1Y, 2Y, 5Y]
 **startDate** | **String**| The start date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to latest available.  | [optional]
 **endDate** | **String**| The end date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to latest available.  | [optional]
 **frequency** | **String**| Controls the display frequency of the data returned.   * **D** &#x3D; Daily   * **W** &#x3D; Weekly, based on the last day of the week of the start date.   * **M** &#x3D; Monthly, based on the last trading day of the month.   * **AM** &#x3D; Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16 etc.).    * **CQ** &#x3D; Quarterly based on the last trading day of the calendar quarter (March, June, September, or December).   * **AY** &#x3D; Actual Annual, based on the start date.   * **CY** &#x3D; Calendar Annual, based on the last trading day of the calendar year.  | [optional] [default to D] [enum: D, W, M, AM, CQ, AY, CY]

### Return type

[**ForwardsResponse**](ForwardsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Array of ids Forward Rates for the date range and frequency requested |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivty 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the servier is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |


## getFXForwardsForList

> ForwardsResponse getFXForwardsForList(forwardsRequest)

Gets Forwards for a list of currency pairs

Forward rates are provided in 80+ currencies against the U.S. dollar, British pound, and euro. Forward quotes are provided by Reuters and coverage is determined by the amount of reliable currency trading in a particular currency. Bid, offer, and mid rates are available for 11 `forwardPeriod` periods - Overnight, Tomorrow Next, 1 Week (Spot Week), 1 month, 2 month, 3 month, 6 month, 9 month, 1 year, 2 year, 5 year. All identifiers have spot rates, but not all identifiers have forward rate data.


### Example

```java
// Import classes:
import com.factset.sdk.ForeignExchangeRate.ApiClient;
import com.factset.sdk.ForeignExchangeRate.ApiException;
import com.factset.sdk.ForeignExchangeRate.Configuration;
import com.factset.sdk.ForeignExchangeRate.auth.*;
import com.factset.sdk.ForeignExchangeRate.models.*;
import com.factset.sdk.ForeignExchangeRate.api.ForwardsApi;

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

        ForwardsApi apiInstance = new ForwardsApi(defaultClient);
        ForwardsRequest forwardsRequest = new ForwardsRequest(); // ForwardsRequest | Request object for FX Forwards.
        try {
            ForwardsResponse result = apiInstance.getFXForwardsForList(forwardsRequest);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling ForwardsApi#getFXForwardsForList");
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
 **forwardsRequest** | [**ForwardsRequest**](ForwardsRequest.md)| Request object for FX Forwards. |

### Return type

[**ForwardsResponse**](ForwardsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Array of forward rates |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivty 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the servier is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

