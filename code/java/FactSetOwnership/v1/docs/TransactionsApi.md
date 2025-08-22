# TransactionsApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getOwnershipInsiderTransactions**](TransactionsApi.md#getOwnershipInsiderTransactions) | **GET** /factset-ownership/v1/transactions/insider | Get insider transactions details for a list of requested identifiers.
[**getOwnershipInstitutionalTransactions**](TransactionsApi.md#getOwnershipInstitutionalTransactions) | **GET** /factset-ownership/v1/transactions/institutional | Get institutional transaction details for a list of requested identifiers.
[**postOwnershipInsiderTransactions**](TransactionsApi.md#postOwnershipInsiderTransactions) | **POST** /factset-ownership/v1/transactions/insider | Get insider transactions details for a list of requested identifiers.
[**postOwnershipInstituionalTransactions**](TransactionsApi.md#postOwnershipInstituionalTransactions) | **POST** /factset-ownership/v1/transactions/institutional | Gets institutional transaction details for a list of requested identifiers.



## getOwnershipInsiderTransactions

> InsiderTransactionsResponse getOwnershipInsiderTransactions(ids, startDate, endDate, transactionType, rowExclusion, currency)

Get insider transactions details for a list of requested identifiers.

Gets insider transaction details for a list of requested identifiers.


### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
import java.time.LocalDate;
// Import classes:
import com.factset.sdk.FactSetOwnership.ApiClient;
import com.factset.sdk.FactSetOwnership.ApiException;
import com.factset.sdk.FactSetOwnership.Configuration;
import com.factset.sdk.FactSetOwnership.auth.*;
import com.factset.sdk.FactSetOwnership.models.*;
import com.factset.sdk.FactSetOwnership.api.TransactionsApi;

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

        TransactionsApi apiInstance = new TransactionsApi(defaultClient);
        java.util.List<String> ids = Arrays.asList(); // java.util.List<String> | Requested list of security identifiers. <p>***ids limit** =  10 per request*</p  >.
        LocalDate startDate = LocalDate.parse("2020-06-30"); // LocalDate | The start date requested for a given date range in **YYYY-MM-DD** format. Future dates (T+1) are not accepted in this endpoint. 
        LocalDate endDate = LocalDate.parse("2021-06-30"); // LocalDate | The end date requested for a given date range in **YYYY-MM-DD** format. Future dates (T+1) are not accepted in this endpoint. 
        String transactionType = "A"; // String | Controls the Transaction Type of the data returned. By default, the service will return All Transaction Types.   * **A** = All Transaction Types - returns all available transaction types.   * **P** = Open Market Purchases - shares on the open market.   * **S** =  Open Market Sales - selling shares on the open market.   * **PS** = Open Market Purchases & Sales - buying and selling shares on the open market.   * **O** = Options Exercised - executing stock options to acquire shares.   * **M** = Other Transactions - any other types of equity-related actions not covered above. 
        String rowExclusion = "DB"; // String | Controls the exlcusion of specific transaction rows from the data returned. By default, the service will exclude Derivative and Blank Transaction Types.   * **DB** =  Derivative and Blank Transaction Types - excludes both derivative and blank transaction types.   * **B** = Blank Transaction Types - excludes only blank transaction types.   * **N** =   None - includes all transaction types without exclusion. 
        String currency = "LOCAL"; // String | Currency code for adjusting prices. Default is Local. For a list of currency ISO codes, visit [Online Assistant Page 1470](https://oa.apps.factset.com/pages/1470).
        try {
            InsiderTransactionsResponse result = apiInstance.getOwnershipInsiderTransactions(ids, startDate, endDate, transactionType, rowExclusion, currency);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling TransactionsApi#getOwnershipInsiderTransactions");
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
 **ids** | **List&lt;String&gt;**| Requested list of security identifiers. &lt;p&gt;***ids limit** &#x3D;  10 per request*&lt;/p  &gt;. |
 **startDate** | **LocalDate**| The start date requested for a given date range in **YYYY-MM-DD** format. Future dates (T+1) are not accepted in this endpoint.  |
 **endDate** | **LocalDate**| The end date requested for a given date range in **YYYY-MM-DD** format. Future dates (T+1) are not accepted in this endpoint.  |
 **transactionType** | **String**| Controls the Transaction Type of the data returned. By default, the service will return All Transaction Types.   * **A** &#x3D; All Transaction Types - returns all available transaction types.   * **P** &#x3D; Open Market Purchases - shares on the open market.   * **S** &#x3D;  Open Market Sales - selling shares on the open market.   * **PS** &#x3D; Open Market Purchases &amp; Sales - buying and selling shares on the open market.   * **O** &#x3D; Options Exercised - executing stock options to acquire shares.   * **M** &#x3D; Other Transactions - any other types of equity-related actions not covered above.  | [optional] [default to A] [enum: A, P, S, PS, O, M]
 **rowExclusion** | **String**| Controls the exlcusion of specific transaction rows from the data returned. By default, the service will exclude Derivative and Blank Transaction Types.   * **DB** &#x3D;  Derivative and Blank Transaction Types - excludes both derivative and blank transaction types.   * **B** &#x3D; Blank Transaction Types - excludes only blank transaction types.   * **N** &#x3D;   None - includes all transaction types without exclusion.  | [optional] [default to DB] [enum: DB, B, N]
 **currency** | **String**| Currency code for adjusting prices. Default is Local. For a list of currency ISO codes, visit [Online Assistant Page 1470](https://oa.apps.factset.com/pages/1470). | [optional] [default to LOCAL]

### Return type

[**InsiderTransactionsResponse**](InsiderTransactionsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Insider Transactions Response. |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |


## getOwnershipInstitutionalTransactions

> InstitutionalTransactionsResponse getOwnershipInstitutionalTransactions(ids, startDate, endDate, currency, frequency, topNHolders, holderType, periodOfMeasure)

Get institutional transaction details for a list of requested identifiers.

Get institutional transaction details for a list of requested identifiers.


### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
import java.time.LocalDate;
// Import classes:
import com.factset.sdk.FactSetOwnership.ApiClient;
import com.factset.sdk.FactSetOwnership.ApiException;
import com.factset.sdk.FactSetOwnership.Configuration;
import com.factset.sdk.FactSetOwnership.auth.*;
import com.factset.sdk.FactSetOwnership.models.*;
import com.factset.sdk.FactSetOwnership.api.TransactionsApi;

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

        TransactionsApi apiInstance = new TransactionsApi(defaultClient);
        java.util.List<String> ids = Arrays.asList(); // java.util.List<String> | Requested list of security identifiers. <p>***ids limit** =  10 per request*</p  >.
        LocalDate startDate = LocalDate.parse("2020-06-30"); // LocalDate | The start date requested for a given date range in **YYYY-MM-DD** format. Future dates (T+1) are not accepted in this endpoint. 
        LocalDate endDate = LocalDate.parse("2021-06-30"); // LocalDate | The end date requested for a given date range in **YYYY-MM-DD** format. Future dates (T+1) are not accepted in this endpoint. 
        String currency = "LOCAL"; // String | Currency code for adjusting prices. Default is Local. For a list of currency ISO codes, visit [Online Assistant Page 1470](https://oa.apps.factset.com/pages/1470).
        String frequency = "M"; // String | Controls the display frequency of the data returned.   * **M** = Monthly, based on the last trading day of the month.   * **MTD** = Month-to-date   * **CQ** = Quarterly based on the last trading day of the calendar quarter (March, June, September, or December).   * **CQTD** =  Calendar quarter-to-date   * **CY** = Calendar Annual, based on the last trading day of the calendar year.   * **CYTD** = Calendar Year-to-date. 
        String topNHolders = "ALL"; // String | Specifies the number of top holders whose data is returned.   * **ALL** = All holders   * **5** = Top 5 Institutional Holders   * **10** = Top 10 Institutional Holders   * **25** = Top 25 Institutional Holders   * **50** = Top 50 Institutional Holders   * **100** = Top 100 Institutional Holders 
        String holderType = "F"; // String | Controls the Holder Type of the data returned. By default, the service will return Institutional Holders. Requesting All Holders is not currently supported. Only a single Holder Type is allowed per request.   * **F** = Institutions   * **M** = Mutual Funds   * **S** =  Insiders/Stakeholders   * **FS** = Institutions/Insiders   * **B** = Beneficial Owners 
        String periodOfMeasure = "1M"; // String | Determines the range over which the code calculates change for Percent Ownership and Position Change.   * **1M** = 1 Month (last 30 days)   * **3M** = 3 Months (last 90 days)   * **6M** = 6 Months (last 180 days)   * **12M** = 12 Months (last 365 days) 
        try {
            InstitutionalTransactionsResponse result = apiInstance.getOwnershipInstitutionalTransactions(ids, startDate, endDate, currency, frequency, topNHolders, holderType, periodOfMeasure);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling TransactionsApi#getOwnershipInstitutionalTransactions");
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
 **ids** | **List&lt;String&gt;**| Requested list of security identifiers. &lt;p&gt;***ids limit** &#x3D;  10 per request*&lt;/p  &gt;. |
 **startDate** | **LocalDate**| The start date requested for a given date range in **YYYY-MM-DD** format. Future dates (T+1) are not accepted in this endpoint.  |
 **endDate** | **LocalDate**| The end date requested for a given date range in **YYYY-MM-DD** format. Future dates (T+1) are not accepted in this endpoint.  |
 **currency** | **String**| Currency code for adjusting prices. Default is Local. For a list of currency ISO codes, visit [Online Assistant Page 1470](https://oa.apps.factset.com/pages/1470). | [optional] [default to LOCAL]
 **frequency** | **String**| Controls the display frequency of the data returned.   * **M** &#x3D; Monthly, based on the last trading day of the month.   * **MTD** &#x3D; Month-to-date   * **CQ** &#x3D; Quarterly based on the last trading day of the calendar quarter (March, June, September, or December).   * **CQTD** &#x3D;  Calendar quarter-to-date   * **CY** &#x3D; Calendar Annual, based on the last trading day of the calendar year.   * **CYTD** &#x3D; Calendar Year-to-date.  | [optional] [default to M] [enum: M, MTD, CQ, CQTD, CY, CYTD]
 **topNHolders** | **String**| Specifies the number of top holders whose data is returned.   * **ALL** &#x3D; All holders   * **5** &#x3D; Top 5 Institutional Holders   * **10** &#x3D; Top 10 Institutional Holders   * **25** &#x3D; Top 25 Institutional Holders   * **50** &#x3D; Top 50 Institutional Holders   * **100** &#x3D; Top 100 Institutional Holders  | [optional] [default to 25] [enum: ALL, 5, 10, 25, 50, 100]
 **holderType** | **String**| Controls the Holder Type of the data returned. By default, the service will return Institutional Holders. Requesting All Holders is not currently supported. Only a single Holder Type is allowed per request.   * **F** &#x3D; Institutions   * **M** &#x3D; Mutual Funds   * **S** &#x3D;  Insiders/Stakeholders   * **FS** &#x3D; Institutions/Insiders   * **B** &#x3D; Beneficial Owners  | [optional] [default to F] [enum: F, M, S, FS, B]
 **periodOfMeasure** | **String**| Determines the range over which the code calculates change for Percent Ownership and Position Change.   * **1M** &#x3D; 1 Month (last 30 days)   * **3M** &#x3D; 3 Months (last 90 days)   * **6M** &#x3D; 6 Months (last 180 days)   * **12M** &#x3D; 12 Months (last 365 days)  | [optional] [default to 6M] [enum: 1M, 3M, 6M, 12M]

### Return type

[**InstitutionalTransactionsResponse**](InstitutionalTransactionsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Institutional Transactions Response. |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |


## postOwnershipInsiderTransactions

> InsiderTransactionsResponse postOwnershipInsiderTransactions(insiderTransactionsRequest)

Get insider transactions details for a list of requested identifiers.

Gets insider transaction details for a list of requested identifiers.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.FactSetOwnership.ApiClient;
import com.factset.sdk.FactSetOwnership.ApiException;
import com.factset.sdk.FactSetOwnership.Configuration;
import com.factset.sdk.FactSetOwnership.auth.*;
import com.factset.sdk.FactSetOwnership.models.*;
import com.factset.sdk.FactSetOwnership.api.TransactionsApi;

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

        TransactionsApi apiInstance = new TransactionsApi(defaultClient);
        InsiderTransactionsRequest insiderTransactionsRequest = new InsiderTransactionsRequest(); // InsiderTransactionsRequest | Requesting Insider Transaction Details
        try {
            InsiderTransactionsResponse result = apiInstance.postOwnershipInsiderTransactions(insiderTransactionsRequest);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling TransactionsApi#postOwnershipInsiderTransactions");
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
 **insiderTransactionsRequest** | [**InsiderTransactionsRequest**](InsiderTransactionsRequest.md)| Requesting Insider Transaction Details |

### Return type

[**InsiderTransactionsResponse**](InsiderTransactionsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Insider Transactions Response. |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |


## postOwnershipInstituionalTransactions

> InstitutionalTransactionsResponse postOwnershipInstituionalTransactions(institutionalTransactionsRequest)

Gets institutional transaction details for a list of requested identifiers.

Gets institutional transaction details for a list of requested identifiers.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.FactSetOwnership.ApiClient;
import com.factset.sdk.FactSetOwnership.ApiException;
import com.factset.sdk.FactSetOwnership.Configuration;
import com.factset.sdk.FactSetOwnership.auth.*;
import com.factset.sdk.FactSetOwnership.models.*;
import com.factset.sdk.FactSetOwnership.api.TransactionsApi;

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

        TransactionsApi apiInstance = new TransactionsApi(defaultClient);
        InstitutionalTransactionsRequest institutionalTransactionsRequest = new InstitutionalTransactionsRequest(); // InstitutionalTransactionsRequest | Requesting Institutional Transaction Details
        try {
            InstitutionalTransactionsResponse result = apiInstance.postOwnershipInstituionalTransactions(institutionalTransactionsRequest);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling TransactionsApi#postOwnershipInstituionalTransactions");
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
 **institutionalTransactionsRequest** | [**InstitutionalTransactionsRequest**](InstitutionalTransactionsRequest.md)| Requesting Institutional Transaction Details |

### Return type

[**InstitutionalTransactionsResponse**](InstitutionalTransactionsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Institutional Transactions Response. |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

