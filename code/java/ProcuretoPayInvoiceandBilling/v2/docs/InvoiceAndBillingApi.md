# InvoiceAndBillingApi

All URIs are relative to *https://api.factset.com/procure-to-pay/invoice-and-billing/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**downloadInvoice**](InvoiceAndBillingApi.md#downloadInvoice) | **GET** /invoices/{id}/download | Get a PDF of the provided invoiceId
[**fitsReport**](InvoiceAndBillingApi.md#fitsReport) | **GET** /invoices/{id}/fits-report | Get FITS report
[**invoiceDetails**](InvoiceAndBillingApi.md#invoiceDetails) | **GET** /invoices/{id} | Get invoice details
[**listAccounts**](InvoiceAndBillingApi.md#listAccounts) | **GET** /accounts | Returns a list of available accounts



## downloadInvoice

> File downloadInvoice(id)

Get a PDF of the provided invoiceId

Returns and downloads .PDF invoice by provided invoiceId. <b>InvoiceId</b> is determined by concatenating the AccountId and 2-Digit date, representing year and 2-Digit month. E.G. For the December 2023 Invoice the invoiceId would be: AB2C2312

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
        String id = "AB2C2503"; // String | Concatenation of AccountID and Date as YYMM
        try {
            File result = apiInstance.downloadInvoice(id);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling InvoiceAndBillingApi#downloadInvoice");
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
 **id** | **String**| Concatenation of AccountID and Date as YYMM |

### Return type

[**File**](File.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/pdf, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  * Content-Disposition -  <br>  * Content-Type -  <br>  |
| **401** | Unauthorized - Authentication failed |  -  |
| **403** | Forbidden - Insufficient permissions |  -  |
| **404** | Not Found - Invoice ID does not exist |  -  |
| **500** | Internal Server Error - An unexpected error occurred on the server. |  -  |


## fitsReport

> ProductGroups fitsReport(id)

Get FITS report

Returns machine readable FITS report by provided fitsId. <b>fitsId</b> is determined by concatenating the AccountId and 2-Digit date, representing year and 2-Digit month. E.G. For the December 2023 Invoice the fitsId would be: AB2C2312.         All prices in the report are provided without currency information. For currency details, please refer to the '/invoices/{id}' endpoint.

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
        String id = "AB2C2503"; // String | Concatenation of AccountID and Date as YYMM
        try {
            ProductGroups result = apiInstance.fitsReport(id);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling InvoiceAndBillingApi#fitsReport");
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
 **id** | **String**| Concatenation of AccountID and Date as YYMM |

### Return type

[**ProductGroups**](ProductGroups.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **401** | Unauthorized - Authentication failed |  -  |
| **403** | Forbidden - Insufficient permissions |  -  |
| **404** | Not Found - fits ID does not exist |  -  |
| **500** | Internal Server Error - An unexpected error occurred on the server. |  -  |


## invoiceDetails

> Invoice invoiceDetails(id)

Get invoice details

Returns a machine readable invoice report by provided invoiceId. <b>InvoiceId</b> is determined by concatenating the AccountId and  2-Digit date, representing year and 2-Digit month. E.G. For the December 2023 Invoice the invoiceId would be: AB2C2312

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
        String id = "AB2C2503"; // String | Concatenation of AccountID and Date as YYMM
        try {
            Invoice result = apiInstance.invoiceDetails(id);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling InvoiceAndBillingApi#invoiceDetails");
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
 **id** | **String**| Concatenation of AccountID and Date as YYMM |

### Return type

[**Invoice**](Invoice.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **401** | Unauthorized - Authentication failed |  -  |
| **403** | Forbidden - Insufficient permissions |  -  |
| **404** | Not Found - Invoice ID does not exist |  -  |
| **500** | Internal Server Error - An unexpected error occurred on the server. |  -  |


## listAccounts

> Accounts listAccounts()

Returns a list of available accounts

Returns a list of accounts containing information such as AccountName and AccountId.

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
            Accounts result = apiInstance.listAccounts();
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling InvoiceAndBillingApi#listAccounts");
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

[**Accounts**](Accounts.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **401** | Unauthorized - Authentication failed |  -  |
| **403** | Forbidden - Insufficient permissions |  -  |
| **404** | Not Found - Accounts does not exist |  -  |
| **500** | Internal Server Error - An unexpected error occurred on the server. |  -  |

