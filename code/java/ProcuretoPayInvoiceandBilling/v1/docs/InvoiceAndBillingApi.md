# InvoiceAndBillingApi

All URIs are relative to *https://api-sandbox.factset.com/procuretopay/invoice-and-billing*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getFitsReportGet**](InvoiceAndBillingApi.md#getFitsReportGet) | **GET** /getFitsReport | Returns Fits report by given FITSID
[**getInvoiceGet**](InvoiceAndBillingApi.md#getInvoiceGet) | **GET** /getInvoice | Returns PDF of specific invoice
[**invoiceDetailsGet**](InvoiceAndBillingApi.md#invoiceDetailsGet) | **GET** /invoiceDetails | Returns details on specific invoice.
[**listInvoicesGet**](InvoiceAndBillingApi.md#listInvoicesGet) | **GET** /listInvoices | Returns all available invoices



## getFitsReportGet

> java.util.List<Object> getFitsReportGet(fitsID)

Returns Fits report by given FITSID

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.ProcuretoPayInvoiceandBilling.ApiClient;
import com.factset.sdk.ProcuretoPayInvoiceandBilling.ApiException;
import com.factset.sdk.ProcuretoPayInvoiceandBilling.Configuration;
import com.factset.sdk.ProcuretoPayInvoiceandBilling.auth.*;
import com.factset.sdk.ProcuretoPayInvoiceandBilling.models.*;
import com.factset.sdk.ProcuretoPayInvoiceandBilling.api.InvoiceAndBillingApi;

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

        InvoiceAndBillingApi apiInstance = new InvoiceAndBillingApi(defaultClient);
        String fitsID = "AB2C2101"; // String | FITSID can be determined by concatenating the AccountNumber + two-digit year (e.g 21 for 2021) and two-digit month (e.g. 01 for January). Available AccountNumbers are available from the /listInvoices endpoint.
        try {
            java.util.List<Object> result = apiInstance.getFitsReportGet(fitsID);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling InvoiceAndBillingApi#getFitsReportGet");
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
 **fitsID** | **String**| FITSID can be determined by concatenating the AccountNumber + two-digit year (e.g 21 for 2021) and two-digit month (e.g. 01 for January). Available AccountNumbers are available from the /listInvoices endpoint. |

### Return type

**java.util.List&lt;Object&gt;**

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
| **401** | Unauthenticated |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
| **403** | Unauthorized |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
| **404** | Requested Resource not found |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
| **429** | Throttle Limit Reached |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |


## getInvoiceGet

> File getInvoiceGet(invoiceId)

Returns PDF of specific invoice

A .PDF File

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.ProcuretoPayInvoiceandBilling.ApiClient;
import com.factset.sdk.ProcuretoPayInvoiceandBilling.ApiException;
import com.factset.sdk.ProcuretoPayInvoiceandBilling.Configuration;
import com.factset.sdk.ProcuretoPayInvoiceandBilling.auth.*;
import com.factset.sdk.ProcuretoPayInvoiceandBilling.models.*;
import com.factset.sdk.ProcuretoPayInvoiceandBilling.api.InvoiceAndBillingApi;

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

        InvoiceAndBillingApi apiInstance = new InvoiceAndBillingApi(defaultClient);
        String invoiceId = "11963874"; // String | Invoice code you wish to download
        try {
            File result = apiInstance.getInvoiceGet(invoiceId);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling InvoiceAndBillingApi#getInvoiceGet");
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
 **invoiceId** | **String**| Invoice code you wish to download |

### Return type

[**File**](File.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: appliction/pdf, application/json; charset=utf-8, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK - PDF File download offered |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
| **401** | Unauthenticated |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
| **403** | Unauthorized |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
| **404** | Requested Resource not found |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
| **429** | Throttle Limit Reached |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |


## invoiceDetailsGet

> InvoiceDetails invoiceDetailsGet(invoiceId)

Returns details on specific invoice.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.ProcuretoPayInvoiceandBilling.ApiClient;
import com.factset.sdk.ProcuretoPayInvoiceandBilling.ApiException;
import com.factset.sdk.ProcuretoPayInvoiceandBilling.Configuration;
import com.factset.sdk.ProcuretoPayInvoiceandBilling.auth.*;
import com.factset.sdk.ProcuretoPayInvoiceandBilling.models.*;
import com.factset.sdk.ProcuretoPayInvoiceandBilling.api.InvoiceAndBillingApi;

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

        InvoiceAndBillingApi apiInstance = new InvoiceAndBillingApi(defaultClient);
        String invoiceId = "11963874"; // String | Invoice code to query. See /listInvoices endpoint for list of available invoices to query.
        try {
            InvoiceDetails result = apiInstance.invoiceDetailsGet(invoiceId);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling InvoiceAndBillingApi#invoiceDetailsGet");
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
 **invoiceId** | **String**| Invoice code to query. See /listInvoices endpoint for list of available invoices to query. |

### Return type

[**InvoiceDetails**](InvoiceDetails.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
| **401** | Unauthenticated |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
| **403** | Unauthorized |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
| **404** | Requested Resource not found |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
| **429** | Throttle Limit Reached |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |


## listInvoicesGet

> java.util.List<Object> listInvoicesGet()

Returns all available invoices

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.ProcuretoPayInvoiceandBilling.ApiClient;
import com.factset.sdk.ProcuretoPayInvoiceandBilling.ApiException;
import com.factset.sdk.ProcuretoPayInvoiceandBilling.Configuration;
import com.factset.sdk.ProcuretoPayInvoiceandBilling.auth.*;
import com.factset.sdk.ProcuretoPayInvoiceandBilling.models.*;
import com.factset.sdk.ProcuretoPayInvoiceandBilling.api.InvoiceAndBillingApi;

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

        InvoiceAndBillingApi apiInstance = new InvoiceAndBillingApi(defaultClient);
        try {
            java.util.List<Object> result = apiInstance.listInvoicesGet();
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling InvoiceAndBillingApi#listInvoicesGet");
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

**java.util.List&lt;Object&gt;**

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
| **401** | Unauthenticated |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
| **403** | Unauthorized |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
| **404** | Requested Resource not found |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
| **429** | Throttle Limit Reached |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |

