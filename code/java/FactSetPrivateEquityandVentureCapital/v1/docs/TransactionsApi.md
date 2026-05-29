# TransactionsApi

All URIs are relative to *https://api.factset.com/content/factset-pevc/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getTransaction**](TransactionsApi.md#getTransaction) | **GET** /transactions | Retrieve comprehensive details for a list of Private Equity or Venture Capital transactions.
[**getTransactionMAActivity**](TransactionsApi.md#getTransactionMAActivity) | **GET** /transactions/ma-activity | Retrieve detailed M&amp;A advisory and investment information for specified transactions.
[**searchTransactions**](TransactionsApi.md#searchTransactions) | **POST** /transactions/search | Search and filter the universe of transactions by deal size, date range, stage, and portfolio company.



## getTransaction

> TransactionDetailsResponse getTransaction(ids)

Retrieve comprehensive details for a list of Private Equity or Venture Capital transactions.

Retrieves rich, fundamental data for one or more private investment transactions, such as a **Venture Capital funding round** or a **Private Equity buyout**. This includes the **deal size** (transaction amount), **transaction date**, participating **investors**, **security type** (e.g., common stock, preferred stock), and the round's **stage**.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.FactSetPrivateEquityandVentureCapital.ApiClient;
import com.factset.sdk.FactSetPrivateEquityandVentureCapital.ApiException;
import com.factset.sdk.FactSetPrivateEquityandVentureCapital.Configuration;
import com.factset.sdk.FactSetPrivateEquityandVentureCapital.auth.*;
import com.factset.sdk.FactSetPrivateEquityandVentureCapital.models.*;
import com.factset.sdk.FactSetPrivateEquityandVentureCapital.api.TransactionsApi;

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
        java.util.List<Integer> ids = Arrays.asList(); // java.util.List<Integer> | A list of unique FactSet-generated identifiers for **Private Equity or Venture Capital transactions**. These IDs link to a single investment event, distinct from the main deal ID.
        try {
            TransactionDetailsResponse result = apiInstance.getTransaction(ids);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling TransactionsApi#getTransaction");
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
 **ids** | **List&lt;Integer&gt;**| A list of unique FactSet-generated identifiers for **Private Equity or Venture Capital transactions**. These IDs link to a single investment event, distinct from the main deal ID. |

### Return type

[**TransactionDetailsResponse**](TransactionDetailsResponse.md)

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
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that the Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |


## getTransactionMAActivity

> TransactionMaActivityResponse getTransactionMAActivity(ids)

Retrieve detailed M&amp;A advisory and investment information for specified transactions.

Provides specific details related to Mergers & Acquisitions (M&A) activity for a given transaction. This includes information on M&A **advisors** (e.g., financial, legal) and the specific **investments** made by General Partner and Limited Partner investors in the context of the M&A deal.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.FactSetPrivateEquityandVentureCapital.ApiClient;
import com.factset.sdk.FactSetPrivateEquityandVentureCapital.ApiException;
import com.factset.sdk.FactSetPrivateEquityandVentureCapital.Configuration;
import com.factset.sdk.FactSetPrivateEquityandVentureCapital.auth.*;
import com.factset.sdk.FactSetPrivateEquityandVentureCapital.models.*;
import com.factset.sdk.FactSetPrivateEquityandVentureCapital.api.TransactionsApi;

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
        java.util.List<Integer> ids = Arrays.asList(); // java.util.List<Integer> | A list of unique FactSet-generated identifiers for **Private Equity or Venture Capital transactions**. These IDs link to a single investment event, distinct from the main deal ID.
        try {
            TransactionMaActivityResponse result = apiInstance.getTransactionMAActivity(ids);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling TransactionsApi#getTransactionMAActivity");
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
 **ids** | **List&lt;Integer&gt;**| A list of unique FactSet-generated identifiers for **Private Equity or Venture Capital transactions**. These IDs link to a single investment event, distinct from the main deal ID. |

### Return type

[**TransactionMaActivityResponse**](TransactionMaActivityResponse.md)

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
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that the Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |


## searchTransactions

> TransactionSearchResponse searchTransactions(transactionSearchRequest)

Search and filter the universe of transactions by deal size, date range, stage, and portfolio company.

Allows users to query the universe of private transactions using a set of powerful filters. Filters can include specific **portfolio companies**, **investment stages** (e.g., Seed, Growth, Late), **transaction date range**, and **minimum/maximum transaction amounts** in USD.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.FactSetPrivateEquityandVentureCapital.ApiClient;
import com.factset.sdk.FactSetPrivateEquityandVentureCapital.ApiException;
import com.factset.sdk.FactSetPrivateEquityandVentureCapital.Configuration;
import com.factset.sdk.FactSetPrivateEquityandVentureCapital.auth.*;
import com.factset.sdk.FactSetPrivateEquityandVentureCapital.models.*;
import com.factset.sdk.FactSetPrivateEquityandVentureCapital.api.TransactionsApi;

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
        TransactionSearchRequest transactionSearchRequest = new TransactionSearchRequest(); // TransactionSearchRequest | 
        try {
            TransactionSearchResponse result = apiInstance.searchTransactions(transactionSearchRequest);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling TransactionsApi#searchTransactions");
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
 **transactionSearchRequest** | [**TransactionSearchRequest**](TransactionSearchRequest.md)|  |

### Return type

[**TransactionSearchResponse**](TransactionSearchResponse.md)

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
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that the Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

