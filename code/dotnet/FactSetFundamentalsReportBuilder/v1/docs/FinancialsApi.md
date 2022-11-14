# FactSet.SDK.FactSetFundamentalsReportBuilder.Api.FinancialsApi

All URIs are relative to *https://api.factset.com/report/financials/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetFinancialsBalanceSheet**](FinancialsApi.md#getfinancialsbalancesheet) | **GET** /balance-sheet | Balance Sheet
[**GetFinancialsCashFlow**](FinancialsApi.md#getfinancialscashflow) | **GET** /cash-flow | Cash Flow
[**GetFinancialsIncomeStatement**](FinancialsApi.md#getfinancialsincomestatement) | **GET** /income-statement | Income Statement


<a name="getfinancialsbalancesheet"></a>
# **GetFinancialsBalanceSheet**
> Response GetFinancialsBalanceSheet (string id, string periodicity = null, string schema = null, string reportStatus = null, string currency = null)

Balance Sheet

Returns a standardized Balance Sheet based on industry.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetFundamentalsReportBuilder.Api;
using FactSet.SDK.FactSetFundamentalsReportBuilder.Client;
using FactSet.SDK.FactSetFundamentalsReportBuilder.Model;

namespace Example
{
    public class GetFinancialsBalanceSheetExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetFundamentalsReportBuilder.Client.Configuration();

            // Examples for each supported authentication method are below,
            // choose one that satisfies your use case.

            /* (Preferred) OAuth 2.0: FactSetOAuth2 */
            // See https://github.com/FactSet/enterprise-sdk#oauth-20
            // for information on how to create the app-config.json file
            // See https://github.com/FactSet/enterprise-sdk-utils-dotnet#authentication
            // for more information on using the ConfidentialClient class
            ConfidentialClient confidentialClient = await ConfidentialClient.CreateAsync("/path/to/app-config.json");
            config.OAuth2Client = confidentialClient;

            /* Basic authentication: FactSetApiKey */
            // See https://github.com/FactSet/enterprise-sdk#api-key
            // for information how to create an API key
            // config.Username = "USERNAME-SERIAL";
            // config.Password = "API-KEY";

            var apiInstance = new FinancialsApi(config);

            var id = "FDS";  // string | Company Ticker
            var periodicity = "ANN";  // string | Periodicity or frequency of the fiscal periods. (optional)  (default to INTERIM)
            var schema = "table_group_level";  // string | The schema that the data is returned as. The following are descriptions for the accepted values: - table_group_level - STACH 2.0 row organized package format with parent-child relationships represented using STACH group level cell metadata - table_parent_child_columns - STACH 2.0 row organized package format with parent-child relationships represented using STACH parent-child columns  (optional)  (default to table_parent_child_columns)
            var reportStatus = "RESTATED";  // string | Return historical periods as originally reported or retroactively restated (for M&A, accounting changes, and other events). The following are descriptions for the accepted values: - RESTATED - retroactively restated data. - NON-RESTATED - originally reported data.   (optional)  (default to RESTATED)
            var currency = "\"LOCAL\"";  // string | Currency code for currency values. \"LOCAL\" will return the security's pricing currency. \"RPT\" will return the company's reporting currency (which may differ from \"LOCAL\" for some companies). For a list of other currency ISO codes, visit Online Assistant Page [OA1470](https://my.apps.factset.com/oa/pages/1470).  (optional)  (default to "LOCAL")

            try
            {
                // Balance Sheet
                Response result = apiInstance.GetFinancialsBalanceSheet(id, periodicity, schema, reportStatus, currency);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling FinancialsApi.GetFinancialsBalanceSheet: " + e.Message );
                Console.WriteLine("Status Code: "+ e.ErrorCode);
                Console.WriteLine(e.StackTrace);
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **string**| Company Ticker | 
 **periodicity** | **string**| Periodicity or frequency of the fiscal periods. | [optional] [default to INTERIM]
 **schema** | **string**| The schema that the data is returned as. The following are descriptions for the accepted values: - table_group_level - STACH 2.0 row organized package format with parent-child relationships represented using STACH group level cell metadata - table_parent_child_columns - STACH 2.0 row organized package format with parent-child relationships represented using STACH parent-child columns  | [optional] [default to table_parent_child_columns]
 **reportStatus** | **string**| Return historical periods as originally reported or retroactively restated (for M&amp;A, accounting changes, and other events). The following are descriptions for the accepted values: - RESTATED - retroactively restated data. - NON-RESTATED - originally reported data.   | [optional] [default to RESTATED]
 **currency** | **string**| Currency code for currency values. \&quot;LOCAL\&quot; will return the security&#39;s pricing currency. \&quot;RPT\&quot; will return the company&#39;s reporting currency (which may differ from \&quot;LOCAL\&quot; for some companies). For a list of other currency ISO codes, visit Online Assistant Page [OA1470](https://my.apps.factset.com/oa/pages/1470).  | [optional] [default to &quot;LOCAL&quot;]

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getfinancialscashflow"></a>
# **GetFinancialsCashFlow**
> Response GetFinancialsCashFlow (string id, string periodicity = null, string schema = null, string reportStatus = null, string currency = null)

Cash Flow

Returns a standardized Cash Flow based on industry.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetFundamentalsReportBuilder.Api;
using FactSet.SDK.FactSetFundamentalsReportBuilder.Client;
using FactSet.SDK.FactSetFundamentalsReportBuilder.Model;

namespace Example
{
    public class GetFinancialsCashFlowExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetFundamentalsReportBuilder.Client.Configuration();

            // Examples for each supported authentication method are below,
            // choose one that satisfies your use case.

            /* (Preferred) OAuth 2.0: FactSetOAuth2 */
            // See https://github.com/FactSet/enterprise-sdk#oauth-20
            // for information on how to create the app-config.json file
            // See https://github.com/FactSet/enterprise-sdk-utils-dotnet#authentication
            // for more information on using the ConfidentialClient class
            ConfidentialClient confidentialClient = await ConfidentialClient.CreateAsync("/path/to/app-config.json");
            config.OAuth2Client = confidentialClient;

            /* Basic authentication: FactSetApiKey */
            // See https://github.com/FactSet/enterprise-sdk#api-key
            // for information how to create an API key
            // config.Username = "USERNAME-SERIAL";
            // config.Password = "API-KEY";

            var apiInstance = new FinancialsApi(config);

            var id = "FDS";  // string | Company Ticker
            var periodicity = "ANN";  // string | Periodicity or frequency of the fiscal periods. (optional)  (default to INTERIM)
            var schema = "table_group_level";  // string | The schema that the data is returned as. The following are descriptions for the accepted values: - table_group_level - STACH 2.0 row organized package format with parent-child relationships represented using STACH group level cell metadata - table_parent_child_columns - STACH 2.0 row organized package format with parent-child relationships represented using STACH parent-child columns  (optional)  (default to table_parent_child_columns)
            var reportStatus = "RESTATED";  // string | Return historical periods as originally reported or retroactively restated (for M&A, accounting changes, and other events). The following are descriptions for the accepted values: - RESTATED - retroactively restated data. - NON-RESTATED - originally reported data.   (optional)  (default to RESTATED)
            var currency = "\"LOCAL\"";  // string | Currency code for currency values. \"LOCAL\" will return the security's pricing currency. \"RPT\" will return the company's reporting currency (which may differ from \"LOCAL\" for some companies). For a list of other currency ISO codes, visit Online Assistant Page [OA1470](https://my.apps.factset.com/oa/pages/1470).  (optional)  (default to "LOCAL")

            try
            {
                // Cash Flow
                Response result = apiInstance.GetFinancialsCashFlow(id, periodicity, schema, reportStatus, currency);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling FinancialsApi.GetFinancialsCashFlow: " + e.Message );
                Console.WriteLine("Status Code: "+ e.ErrorCode);
                Console.WriteLine(e.StackTrace);
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **string**| Company Ticker | 
 **periodicity** | **string**| Periodicity or frequency of the fiscal periods. | [optional] [default to INTERIM]
 **schema** | **string**| The schema that the data is returned as. The following are descriptions for the accepted values: - table_group_level - STACH 2.0 row organized package format with parent-child relationships represented using STACH group level cell metadata - table_parent_child_columns - STACH 2.0 row organized package format with parent-child relationships represented using STACH parent-child columns  | [optional] [default to table_parent_child_columns]
 **reportStatus** | **string**| Return historical periods as originally reported or retroactively restated (for M&amp;A, accounting changes, and other events). The following are descriptions for the accepted values: - RESTATED - retroactively restated data. - NON-RESTATED - originally reported data.   | [optional] [default to RESTATED]
 **currency** | **string**| Currency code for currency values. \&quot;LOCAL\&quot; will return the security&#39;s pricing currency. \&quot;RPT\&quot; will return the company&#39;s reporting currency (which may differ from \&quot;LOCAL\&quot; for some companies). For a list of other currency ISO codes, visit Online Assistant Page [OA1470](https://my.apps.factset.com/oa/pages/1470).  | [optional] [default to &quot;LOCAL&quot;]

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getfinancialsincomestatement"></a>
# **GetFinancialsIncomeStatement**
> Response GetFinancialsIncomeStatement (string id, string periodicity = null, string schema = null, string reportStatus = null, string currency = null)

Income Statement

Returns a standardized Income Statement based on industry.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetFundamentalsReportBuilder.Api;
using FactSet.SDK.FactSetFundamentalsReportBuilder.Client;
using FactSet.SDK.FactSetFundamentalsReportBuilder.Model;

namespace Example
{
    public class GetFinancialsIncomeStatementExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetFundamentalsReportBuilder.Client.Configuration();

            // Examples for each supported authentication method are below,
            // choose one that satisfies your use case.

            /* (Preferred) OAuth 2.0: FactSetOAuth2 */
            // See https://github.com/FactSet/enterprise-sdk#oauth-20
            // for information on how to create the app-config.json file
            // See https://github.com/FactSet/enterprise-sdk-utils-dotnet#authentication
            // for more information on using the ConfidentialClient class
            ConfidentialClient confidentialClient = await ConfidentialClient.CreateAsync("/path/to/app-config.json");
            config.OAuth2Client = confidentialClient;

            /* Basic authentication: FactSetApiKey */
            // See https://github.com/FactSet/enterprise-sdk#api-key
            // for information how to create an API key
            // config.Username = "USERNAME-SERIAL";
            // config.Password = "API-KEY";

            var apiInstance = new FinancialsApi(config);

            var id = "FDS";  // string | Company Ticker
            var periodicity = "ANN";  // string | Periodicity or frequency of the fiscal periods. (optional)  (default to INTERIM)
            var schema = "table_group_level";  // string | The schema that the data is returned as. The following are descriptions for the accepted values: - table_group_level - STACH 2.0 row organized package format with parent-child relationships represented using STACH group level cell metadata - table_parent_child_columns - STACH 2.0 row organized package format with parent-child relationships represented using STACH parent-child columns  (optional)  (default to table_parent_child_columns)
            var reportStatus = "RESTATED";  // string | Return historical periods as originally reported or retroactively restated (for M&A, accounting changes, and other events). The following are descriptions for the accepted values: - RESTATED - retroactively restated data. - NON-RESTATED - originally reported data.   (optional)  (default to RESTATED)
            var currency = "\"LOCAL\"";  // string | Currency code for currency values. \"LOCAL\" will return the security's pricing currency. \"RPT\" will return the company's reporting currency (which may differ from \"LOCAL\" for some companies). For a list of other currency ISO codes, visit Online Assistant Page [OA1470](https://my.apps.factset.com/oa/pages/1470).  (optional)  (default to "LOCAL")

            try
            {
                // Income Statement
                Response result = apiInstance.GetFinancialsIncomeStatement(id, periodicity, schema, reportStatus, currency);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling FinancialsApi.GetFinancialsIncomeStatement: " + e.Message );
                Console.WriteLine("Status Code: "+ e.ErrorCode);
                Console.WriteLine(e.StackTrace);
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **string**| Company Ticker | 
 **periodicity** | **string**| Periodicity or frequency of the fiscal periods. | [optional] [default to INTERIM]
 **schema** | **string**| The schema that the data is returned as. The following are descriptions for the accepted values: - table_group_level - STACH 2.0 row organized package format with parent-child relationships represented using STACH group level cell metadata - table_parent_child_columns - STACH 2.0 row organized package format with parent-child relationships represented using STACH parent-child columns  | [optional] [default to table_parent_child_columns]
 **reportStatus** | **string**| Return historical periods as originally reported or retroactively restated (for M&amp;A, accounting changes, and other events). The following are descriptions for the accepted values: - RESTATED - retroactively restated data. - NON-RESTATED - originally reported data.   | [optional] [default to RESTATED]
 **currency** | **string**| Currency code for currency values. \&quot;LOCAL\&quot; will return the security&#39;s pricing currency. \&quot;RPT\&quot; will return the company&#39;s reporting currency (which may differ from \&quot;LOCAL\&quot; for some companies). For a list of other currency ISO codes, visit Online Assistant Page [OA1470](https://my.apps.factset.com/oa/pages/1470).  | [optional] [default to &quot;LOCAL&quot;]

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

