# FactSet.SDK.FactSetPrivateCompany.Api.CompanyReportsApi

All URIs are relative to *https://api.factset.com/content/private-company/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetFinancialsReport**](CompanyReportsApi.md#getfinancialsreport) | **GET** /company-reports/financial-statement | Returns Private Company Financial Data
[**GetProfileReport**](CompanyReportsApi.md#getprofilereport) | **GET** /company-reports/profile | Returns Private Company Non-Periodic Data



<a name="getfinancialsreport"></a>
# **GetFinancialsReport**
> FinancialStatementsResponse GetFinancialsReport (List<string> ids, string statementType, string currency = null, int? numberAnnualPeriods = null)

Returns Private Company Financial Data

Returns financial data for specified private companies and statement type (income,  balance sheet, cash flow, and ratios) over an annual reporting period. <br/> Use the ```/universe``` endpoint to retrieve valid Private Company identifiers.<br/><br/> **Note:** Due to variations in calculation time of average exchange rates, there may be some minor differences in the values of company report financial statement attributes if you are requesting for  a currency other than local, when compared to workstation. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetPrivateCompany.Api;
using FactSet.SDK.FactSetPrivateCompany.Client;
using FactSet.SDK.FactSetPrivateCompany.Model;

namespace Example
{
    public class GetFinancialsReportExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetPrivateCompany.Client.Configuration();

            // Examples for each supported authentication method are below,
            // choose one that satisfies your use case.

            /* (Preferred) OAuth 2.0: FactSetOAuth2 */
            // See https://github.com/FactSet/enterprise-sdk#oauth-20
            // for information on how to create the app-config.json file
            //
            // The confidential client instance should be reused in production environments.
            // See https://github.com/FactSet/enterprise-sdk-utils-dotnet#authentication
            // for more information on using the ConfidentialClient class
            ConfidentialClient confidentialClient = await ConfidentialClient.CreateAsync("/path/to/app-config.json");
            config.OAuth2Client = confidentialClient;

            /* Basic authentication: FactSetApiKey */
            // See https://github.com/FactSet/enterprise-sdk#api-key
            // for information how to create an API key
            // config.Username = "USERNAME-SERIAL";
            // config.Password = "API-KEY";

            var apiInstance = new CompanyReportsApi(config);

            var ids = new List<string>(); // List<string> | The requested list of Factset Private Company identifiers in XXXXXX-E format <p>***ids limit** =  50 per request*</p> 
            var statementType = "BS";  // string | The type of financial statement being requested
            var currency = "\"LOCAL\"";  // string | Currency code for currency values. For a list of currency ISO codes, visit Online Assistant Page [OA1470](https://my.apps.factset.com/oa/pages/1470).  Giving input as \"DOC\" would give the values in reporting currency for the requested ids.  (optional)  (default to "LOCAL")
            var numberAnnualPeriods = 4;  // int? | The number of annual periods for the returned data which will be displayed in descending order from most recent annual period for the number of annual periods specified. </br>Within range of 1 to 100. If not specified default will be 4.       (optional)  (default to 4)

            try
            {
                // Returns Private Company Financial Data
                FinancialStatementsResponse result = apiInstance.GetFinancialsReport(ids, statementType, currency, numberAnnualPeriods);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling CompanyReportsApi.GetFinancialsReport: " + e.Message );
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
 **ids** | [**List&lt;string&gt;**](string.md)| The requested list of Factset Private Company identifiers in XXXXXX-E format &lt;p&gt;***ids limit** &#x3D;  50 per request*&lt;/p&gt;  | 
 **statementType** | **string**| The type of financial statement being requested | 
 **currency** | **string**| Currency code for currency values. For a list of currency ISO codes, visit Online Assistant Page [OA1470](https://my.apps.factset.com/oa/pages/1470).  Giving input as \&quot;DOC\&quot; would give the values in reporting currency for the requested ids.  | [optional] [default to &quot;LOCAL&quot;]
 **numberAnnualPeriods** | **int?**| The number of annual periods for the returned data which will be displayed in descending order from most recent annual period for the number of annual periods specified. &lt;/br&gt;Within range of 1 to 100. If not specified default will be 4.       | [optional] [default to 4]

### Return type
[**FinancialStatementsResponse**](FinancialStatementsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Financial data items |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getprofilereport"></a>
# **GetProfileReport**
> ProfileResponse GetProfileReport (List<string> ids)

Returns Private Company Non-Periodic Data

Retrieves a comprehensive overview of key non-periodic details and information for a  specified list of identifiers. All values provided in the response are absolute. <br/> Use the ```/universe``` endpoint to retrieve valid Private Company identifiers.<br/> 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetPrivateCompany.Api;
using FactSet.SDK.FactSetPrivateCompany.Client;
using FactSet.SDK.FactSetPrivateCompany.Model;

namespace Example
{
    public class GetProfileReportExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetPrivateCompany.Client.Configuration();

            // Examples for each supported authentication method are below,
            // choose one that satisfies your use case.

            /* (Preferred) OAuth 2.0: FactSetOAuth2 */
            // See https://github.com/FactSet/enterprise-sdk#oauth-20
            // for information on how to create the app-config.json file
            //
            // The confidential client instance should be reused in production environments.
            // See https://github.com/FactSet/enterprise-sdk-utils-dotnet#authentication
            // for more information on using the ConfidentialClient class
            ConfidentialClient confidentialClient = await ConfidentialClient.CreateAsync("/path/to/app-config.json");
            config.OAuth2Client = confidentialClient;

            /* Basic authentication: FactSetApiKey */
            // See https://github.com/FactSet/enterprise-sdk#api-key
            // for information how to create an API key
            // config.Username = "USERNAME-SERIAL";
            // config.Password = "API-KEY";

            var apiInstance = new CompanyReportsApi(config);

            var ids = new List<string>(); // List<string> | The requested list of Factset Private Company identifiers in XXXXXX-E format <p>***ids limit** =  50 per request*</p> 

            try
            {
                // Returns Private Company Non-Periodic Data
                ProfileResponse result = apiInstance.GetProfileReport(ids);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling CompanyReportsApi.GetProfileReport: " + e.Message );
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
 **ids** | [**List&lt;string&gt;**](string.md)| The requested list of Factset Private Company identifiers in XXXXXX-E format &lt;p&gt;***ids limit** &#x3D;  50 per request*&lt;/p&gt;  | 

### Return type
[**ProfileResponse**](ProfileResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Non-periodic data items |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


