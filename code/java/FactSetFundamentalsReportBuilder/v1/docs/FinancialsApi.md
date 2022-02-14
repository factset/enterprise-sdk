# FinancialsApi

All URIs are relative to *https://api.factset.com/report/financials/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getFinancialsBalanceSheet**](FinancialsApi.md#getFinancialsBalanceSheet) | **GET** /balance-sheet | Balance Sheet
[**getFinancialsCashFlow**](FinancialsApi.md#getFinancialsCashFlow) | **GET** /cash-flow | Cash Flow
[**getFinancialsIncomeStatement**](FinancialsApi.md#getFinancialsIncomeStatement) | **GET** /income-statement | Income Statement



## getFinancialsBalanceSheet

> Response getFinancialsBalanceSheet(id, periodicity, schema, reportStatus, currency)

Balance Sheet

Returns a standardized Balance Sheet based on industry.

### Example

```java
// Import classes:
import com.factset.sdk.FactSetFundamentalsReportBuilder.ApiClient;
import com.factset.sdk.FactSetFundamentalsReportBuilder.ApiException;
import com.factset.sdk.FactSetFundamentalsReportBuilder.Configuration;
import com.factset.sdk.FactSetFundamentalsReportBuilder.auth.*;
import com.factset.sdk.FactSetFundamentalsReportBuilder.model.*;
import com.factset.sdk.FactSetFundamentalsReportBuilder.api.FinancialsApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;


public class Example {
    public static void main(String[] args) {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
        // See https://github.com/FactSet/enterprise-sdk-utils-java#authentication
        // for more information on using the ConfidentialClient class
        ConfidentialClient confidentialClient = new ConfidentialClient("./path/to/config.json");
        ApiClient defaultClient = new ApiClient(confidentialClient);

        /* Basic authentication: FactSetApiKey */
        // See https://github.com/FactSet/enterprise-sdk#api-key
        // ApiClient defaultClient = new ApiClient();
        // HttpBasicAuth FactSetApiKey = (HttpBasicAuth) defaultClient.getAuthentication("FactSetApiKey");
        // FactSetApiKey.setUsername("YOUR USERNAME");
        // FactSetApiKey.setPassword("YOUR PASSWORD");

        FinancialsApi apiInstance = new FinancialsApi(defaultClient);
        String id = "FDS"; // String | Company Ticker
        String periodicity = "ANN"; // String | Periodicity or frequency of the fiscal periods.
        String schema = "table_group_level"; // String | The schema that the data is returned as. The following are descriptions for the accepted values: - table_group_level - STACH 2.0 row organized package format with parent-child relationships represented using STACH group level cell metadata - table_parent_child_columns - STACH 2.0 row organized package format with parent-child relationships represented using STACH parent-child columns 
        String reportStatus = "RESTATED"; // String | Return historical periods as originally reported or retroactively restated (for M&A, accounting changes, and other events). The following are descriptions for the accepted values: - RESTATED - retroactively restated data. - NON-RESTATED - originally reported data.  
        String currency = "LOCAL"; // String | Currency code for currency values. \"LOCAL\" will return the security's pricing currency. \"RPT\" will return the company's reporting currency (which may differ from \"LOCAL\" for some companies). For a list of other currency ISO codes, visit Online Assistant Page [OA1470](https://my.apps.factset.com/oa/pages/1470). 
        try {
            Response result = apiInstance.getFinancialsBalanceSheet(id, periodicity, schema, reportStatus, currency);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FinancialsApi#getFinancialsBalanceSheet");
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
 **id** | **String**| Company Ticker |
 **periodicity** | **String**| Periodicity or frequency of the fiscal periods. | [optional] [default to INTERIM] [enum: ANN, QTR, SEMI, INTERIM, CAL]
 **schema** | **String**| The schema that the data is returned as. The following are descriptions for the accepted values: - table_group_level - STACH 2.0 row organized package format with parent-child relationships represented using STACH group level cell metadata - table_parent_child_columns - STACH 2.0 row organized package format with parent-child relationships represented using STACH parent-child columns  | [optional] [default to table_parent_child_columns] [enum: table_group_level, table_parent_child_columns]
 **reportStatus** | **String**| Return historical periods as originally reported or retroactively restated (for M&amp;A, accounting changes, and other events). The following are descriptions for the accepted values: - RESTATED - retroactively restated data. - NON-RESTATED - originally reported data.   | [optional] [default to RESTATED] [enum: RESTATED, NON-RESTATED]
 **currency** | **String**| Currency code for currency values. \&quot;LOCAL\&quot; will return the security&#39;s pricing currency. \&quot;RPT\&quot; will return the company&#39;s reporting currency (which may differ from \&quot;LOCAL\&quot; for some companies). For a list of other currency ISO codes, visit Online Assistant Page [OA1470](https://my.apps.factset.com/oa/pages/1470).  | [optional] [default to LOCAL]

### Return type

[**Response**](Response.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Expected response; returns JSON data containing STACH 2.0 row organized package format |  * X-DataDirect-Request-Key - FactSet request ID <br>  * Api-Supported-Versions - Supported API major versions <br>  * Api-Version - API version (semantic versioning) <br>  |
| **400** | Bad Request. For further assistance, file an issue under \&quot;Workflow &amp; Throttling - 400 or 429 Response\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. |  * X-DataDirect-Request-Key - FactSet request ID <br>  * Api-Supported-Versions - Supported API major versions <br>  * Api-Version - API version (semantic versioning) <br>  |
| **401** | Missing or invalid authentication. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For further assistance, file an issue under \&quot;Connectivty - 401 or 403 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. |  * X-DataDirect-Request-Key - FactSet request ID <br>  |
| **403** | User is forbidden access with current credentials. Reach out to your local FactSet Account Manager for assistance, or file an issue under \&quot;Connectivty - 401 or 403 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. |  * X-DataDirect-Request-Key - FactSet request ID <br>  |
| **404** | Not found. For further assistance, file an issue under \&quot;Performance - 404 and 500 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. |  * X-DataDirect-Request-Key - FactSet request ID <br>  |
| **429** | Too many requests - this API is rate-limited to 20 requests per second. For further assistance, file an issue under \&quot;Workflow &amp; Throttling - 400 or 429 Response\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. |  * X-DataDirect-Request-Key - FactSet request ID <br>  |
| **500** | Server error. For further assistance, file an issue under \&quot;Performance - 404 and 500 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. |  * X-DataDirect-Request-Key - FactSet request ID <br>  |
| **503** | Service unavailable. Typically a timeout, or result of a rejected request to prevent service overload. For further assistance, file an issue under \&quot;Performance - 404 and 500 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. |  * X-DataDirect-Request-Key - FactSet request ID <br>  |


## getFinancialsCashFlow

> Response getFinancialsCashFlow(id, periodicity, schema, reportStatus, currency)

Cash Flow

Returns a standardized Cash Flow based on industry.

### Example

```java
// Import classes:
import com.factset.sdk.FactSetFundamentalsReportBuilder.ApiClient;
import com.factset.sdk.FactSetFundamentalsReportBuilder.ApiException;
import com.factset.sdk.FactSetFundamentalsReportBuilder.Configuration;
import com.factset.sdk.FactSetFundamentalsReportBuilder.auth.*;
import com.factset.sdk.FactSetFundamentalsReportBuilder.model.*;
import com.factset.sdk.FactSetFundamentalsReportBuilder.api.FinancialsApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;


public class Example {
    public static void main(String[] args) {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
        // See https://github.com/FactSet/enterprise-sdk-utils-java#authentication
        // for more information on using the ConfidentialClient class
        ConfidentialClient confidentialClient = new ConfidentialClient("./path/to/config.json");
        ApiClient defaultClient = new ApiClient(confidentialClient);

        /* Basic authentication: FactSetApiKey */
        // See https://github.com/FactSet/enterprise-sdk#api-key
        // ApiClient defaultClient = new ApiClient();
        // HttpBasicAuth FactSetApiKey = (HttpBasicAuth) defaultClient.getAuthentication("FactSetApiKey");
        // FactSetApiKey.setUsername("YOUR USERNAME");
        // FactSetApiKey.setPassword("YOUR PASSWORD");

        FinancialsApi apiInstance = new FinancialsApi(defaultClient);
        String id = "FDS"; // String | Company Ticker
        String periodicity = "ANN"; // String | Periodicity or frequency of the fiscal periods.
        String schema = "table_group_level"; // String | The schema that the data is returned as. The following are descriptions for the accepted values: - table_group_level - STACH 2.0 row organized package format with parent-child relationships represented using STACH group level cell metadata - table_parent_child_columns - STACH 2.0 row organized package format with parent-child relationships represented using STACH parent-child columns 
        String reportStatus = "RESTATED"; // String | Return historical periods as originally reported or retroactively restated (for M&A, accounting changes, and other events). The following are descriptions for the accepted values: - RESTATED - retroactively restated data. - NON-RESTATED - originally reported data.  
        String currency = "LOCAL"; // String | Currency code for currency values. \"LOCAL\" will return the security's pricing currency. \"RPT\" will return the company's reporting currency (which may differ from \"LOCAL\" for some companies). For a list of other currency ISO codes, visit Online Assistant Page [OA1470](https://my.apps.factset.com/oa/pages/1470). 
        try {
            Response result = apiInstance.getFinancialsCashFlow(id, periodicity, schema, reportStatus, currency);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FinancialsApi#getFinancialsCashFlow");
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
 **id** | **String**| Company Ticker |
 **periodicity** | **String**| Periodicity or frequency of the fiscal periods. | [optional] [default to INTERIM] [enum: ANN, QTR, SEMI, INTERIM, CAL]
 **schema** | **String**| The schema that the data is returned as. The following are descriptions for the accepted values: - table_group_level - STACH 2.0 row organized package format with parent-child relationships represented using STACH group level cell metadata - table_parent_child_columns - STACH 2.0 row organized package format with parent-child relationships represented using STACH parent-child columns  | [optional] [default to table_parent_child_columns] [enum: table_group_level, table_parent_child_columns]
 **reportStatus** | **String**| Return historical periods as originally reported or retroactively restated (for M&amp;A, accounting changes, and other events). The following are descriptions for the accepted values: - RESTATED - retroactively restated data. - NON-RESTATED - originally reported data.   | [optional] [default to RESTATED] [enum: RESTATED, NON-RESTATED]
 **currency** | **String**| Currency code for currency values. \&quot;LOCAL\&quot; will return the security&#39;s pricing currency. \&quot;RPT\&quot; will return the company&#39;s reporting currency (which may differ from \&quot;LOCAL\&quot; for some companies). For a list of other currency ISO codes, visit Online Assistant Page [OA1470](https://my.apps.factset.com/oa/pages/1470).  | [optional] [default to LOCAL]

### Return type

[**Response**](Response.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Expected response; returns JSON data containing STACH 2.0 row organized package format |  * X-DataDirect-Request-Key - FactSet request ID <br>  * Api-Supported-Versions - Supported API major versions <br>  * Api-Version - API version (semantic versioning) <br>  |
| **400** | Bad Request. For further assistance, file an issue under \&quot;Workflow &amp; Throttling - 400 or 429 Response\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. |  * X-DataDirect-Request-Key - FactSet request ID <br>  * Api-Supported-Versions - Supported API major versions <br>  * Api-Version - API version (semantic versioning) <br>  |
| **401** | Missing or invalid authentication. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For further assistance, file an issue under \&quot;Connectivty - 401 or 403 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. |  * X-DataDirect-Request-Key - FactSet request ID <br>  |
| **403** | User is forbidden access with current credentials. Reach out to your local FactSet Account Manager for assistance, or file an issue under \&quot;Connectivty - 401 or 403 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. |  * X-DataDirect-Request-Key - FactSet request ID <br>  |
| **404** | Not found. For further assistance, file an issue under \&quot;Performance - 404 and 500 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. |  * X-DataDirect-Request-Key - FactSet request ID <br>  |
| **429** | Too many requests - this API is rate-limited to 20 requests per second. For further assistance, file an issue under \&quot;Workflow &amp; Throttling - 400 or 429 Response\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. |  * X-DataDirect-Request-Key - FactSet request ID <br>  |
| **500** | Server error. For further assistance, file an issue under \&quot;Performance - 404 and 500 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. |  * X-DataDirect-Request-Key - FactSet request ID <br>  |
| **503** | Service unavailable. Typically a timeout, or result of a rejected request to prevent service overload. For further assistance, file an issue under \&quot;Performance - 404 and 500 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. |  * X-DataDirect-Request-Key - FactSet request ID <br>  |


## getFinancialsIncomeStatement

> Response getFinancialsIncomeStatement(id, periodicity, schema, reportStatus, currency)

Income Statement

Returns a standardized Income Statement based on industry.

### Example

```java
// Import classes:
import com.factset.sdk.FactSetFundamentalsReportBuilder.ApiClient;
import com.factset.sdk.FactSetFundamentalsReportBuilder.ApiException;
import com.factset.sdk.FactSetFundamentalsReportBuilder.Configuration;
import com.factset.sdk.FactSetFundamentalsReportBuilder.auth.*;
import com.factset.sdk.FactSetFundamentalsReportBuilder.model.*;
import com.factset.sdk.FactSetFundamentalsReportBuilder.api.FinancialsApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;


public class Example {
    public static void main(String[] args) {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
        // See https://github.com/FactSet/enterprise-sdk-utils-java#authentication
        // for more information on using the ConfidentialClient class
        ConfidentialClient confidentialClient = new ConfidentialClient("./path/to/config.json");
        ApiClient defaultClient = new ApiClient(confidentialClient);

        /* Basic authentication: FactSetApiKey */
        // See https://github.com/FactSet/enterprise-sdk#api-key
        // ApiClient defaultClient = new ApiClient();
        // HttpBasicAuth FactSetApiKey = (HttpBasicAuth) defaultClient.getAuthentication("FactSetApiKey");
        // FactSetApiKey.setUsername("YOUR USERNAME");
        // FactSetApiKey.setPassword("YOUR PASSWORD");

        FinancialsApi apiInstance = new FinancialsApi(defaultClient);
        String id = "FDS"; // String | Company Ticker
        String periodicity = "ANN"; // String | Periodicity or frequency of the fiscal periods.
        String schema = "table_group_level"; // String | The schema that the data is returned as. The following are descriptions for the accepted values: - table_group_level - STACH 2.0 row organized package format with parent-child relationships represented using STACH group level cell metadata - table_parent_child_columns - STACH 2.0 row organized package format with parent-child relationships represented using STACH parent-child columns 
        String reportStatus = "RESTATED"; // String | Return historical periods as originally reported or retroactively restated (for M&A, accounting changes, and other events). The following are descriptions for the accepted values: - RESTATED - retroactively restated data. - NON-RESTATED - originally reported data.  
        String currency = "LOCAL"; // String | Currency code for currency values. \"LOCAL\" will return the security's pricing currency. \"RPT\" will return the company's reporting currency (which may differ from \"LOCAL\" for some companies). For a list of other currency ISO codes, visit Online Assistant Page [OA1470](https://my.apps.factset.com/oa/pages/1470). 
        try {
            Response result = apiInstance.getFinancialsIncomeStatement(id, periodicity, schema, reportStatus, currency);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FinancialsApi#getFinancialsIncomeStatement");
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
 **id** | **String**| Company Ticker |
 **periodicity** | **String**| Periodicity or frequency of the fiscal periods. | [optional] [default to INTERIM] [enum: ANN, QTR, SEMI, INTERIM, CAL]
 **schema** | **String**| The schema that the data is returned as. The following are descriptions for the accepted values: - table_group_level - STACH 2.0 row organized package format with parent-child relationships represented using STACH group level cell metadata - table_parent_child_columns - STACH 2.0 row organized package format with parent-child relationships represented using STACH parent-child columns  | [optional] [default to table_parent_child_columns] [enum: table_group_level, table_parent_child_columns]
 **reportStatus** | **String**| Return historical periods as originally reported or retroactively restated (for M&amp;A, accounting changes, and other events). The following are descriptions for the accepted values: - RESTATED - retroactively restated data. - NON-RESTATED - originally reported data.   | [optional] [default to RESTATED] [enum: RESTATED, NON-RESTATED]
 **currency** | **String**| Currency code for currency values. \&quot;LOCAL\&quot; will return the security&#39;s pricing currency. \&quot;RPT\&quot; will return the company&#39;s reporting currency (which may differ from \&quot;LOCAL\&quot; for some companies). For a list of other currency ISO codes, visit Online Assistant Page [OA1470](https://my.apps.factset.com/oa/pages/1470).  | [optional] [default to LOCAL]

### Return type

[**Response**](Response.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Expected response; returns JSON data containing STACH 2.0 row organized package format |  * X-DataDirect-Request-Key - FactSet request ID <br>  * Api-Supported-Versions - Supported API major versions <br>  * Api-Version - API version (semantic versioning) <br>  |
| **400** | Bad Request. For further assistance, file an issue under \&quot;Workflow &amp; Throttling - 400 or 429 Response\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. |  * X-DataDirect-Request-Key - FactSet request ID <br>  * Api-Supported-Versions - Supported API major versions <br>  * Api-Version - API version (semantic versioning) <br>  |
| **401** | Missing or invalid authentication. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For further assistance, file an issue under \&quot;Connectivty - 401 or 403 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. |  * X-DataDirect-Request-Key - FactSet request ID <br>  |
| **403** | User is forbidden access with current credentials. Reach out to your local FactSet Account Manager for assistance, or file an issue under \&quot;Connectivty - 401 or 403 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. |  * X-DataDirect-Request-Key - FactSet request ID <br>  |
| **404** | Not found. For further assistance, file an issue under \&quot;Performance - 404 and 500 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. |  * X-DataDirect-Request-Key - FactSet request ID <br>  |
| **429** | Too many requests - this API is rate-limited to 20 requests per second. For further assistance, file an issue under \&quot;Workflow &amp; Throttling - 400 or 429 Response\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. |  * X-DataDirect-Request-Key - FactSet request ID <br>  |
| **500** | Server error. For further assistance, file an issue under \&quot;Performance - 404 and 500 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. |  * X-DataDirect-Request-Key - FactSet request ID <br>  |
| **503** | Service unavailable. Typically a timeout, or result of a rejected request to prevent service overload. For further assistance, file an issue under \&quot;Performance - 404 and 500 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. |  * X-DataDirect-Request-Key - FactSet request ID <br>  |

