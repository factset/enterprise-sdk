# FactSet.SDK.FactSetOwnership.Api.TransactionsApi

All URIs are relative to *https://api.factset.com/content/factset-ownership/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetOwnershipInsiderTransactions**](TransactionsApi.md#getownershipinsidertransactions) | **GET** /transactions/insider | Get insider transactions details for a list of requested identifiers.
[**GetOwnershipInstitutionalTransactions**](TransactionsApi.md#getownershipinstitutionaltransactions) | **GET** /transactions/institutional | Get institutional transaction details for a list of requested identifiers.
[**PostOwnershipInsiderTransactions**](TransactionsApi.md#postownershipinsidertransactions) | **POST** /transactions/insider | Get insider transactions details for a list of requested identifiers.
[**PostOwnershipInstitutionalTransactions**](TransactionsApi.md#postownershipinstitutionaltransactions) | **POST** /transactions/institutional | Gets institutional transaction details for a list of requested identifiers.



<a name="getownershipinsidertransactions"></a>
# **GetOwnershipInsiderTransactions**
> InsiderTransactionsResponse GetOwnershipInsiderTransactions (List<string> ids, DateTime startDate, DateTime endDate, TransactionType? transactionType = null, RowExclusion? rowExclusion = null, string currency = null, Batch? batch = null, int? paginationLimit = null, int? paginationOffset = null)

Get insider transactions details for a list of requested identifiers.

Gets insider transaction details for a list of requested identifiers. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Net;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetOwnership.Api;
using FactSet.SDK.FactSetOwnership.Client;
using FactSet.SDK.FactSetOwnership.Model;

namespace Example
{
    public class GetOwnershipInsiderTransactionsExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetOwnership.Client.Configuration();

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

            var apiInstance = new TransactionsApi(config);

            var ids = new List<string>(); // List<string> | Requested list of security identifiers. <p>***ids limit** =  10 per request*</p  > <p>***Batch ids limit** =  1000 per request*</p  >.
            var startDate = DateTime.Parse("2020-06-30");  // DateTime | The start date requested for a given date range in **YYYY-MM-DD** format. Future dates (T+1) are not accepted in this endpoint. 
            var endDate = DateTime.Parse("2021-06-30");  // DateTime | The end date requested for a given date range in **YYYY-MM-DD** format. Future dates (T+1) are not accepted in this endpoint. 
            var transactionType = (TransactionType) "A";  // TransactionType? | Controls the Transaction Type of the data returned. By default, the service will return All Transaction Types.   * **A** = All Transaction Types - returns all available transaction types.   * **P** = Open Market Purchases - shares on the open market.   * **S** =  Open Market Sales - selling shares on the open market.   * **PS** = Open Market Purchases & Sales - buying and selling shares on the open market.   * **O** = Options Exercised - executing stock options to acquire shares.   * **M** = Other Transactions - any other types of equity-related actions not covered above.  (optional) 
            var rowExclusion = (RowExclusion) "DB";  // RowExclusion? | Controls the exlcusion of specific transaction rows from the data returned. By default, the service will exclude Derivative and Blank Transaction Types.   * **DB** =  Derivative and Blank Transaction Types - excludes both derivative and blank transaction types.   * **B** = Blank Transaction Types - excludes only blank transaction types.   * **N** =   None - includes all transaction types without exclusion.  (optional) 
            var currency = "\"LOCAL\"";  // string | Currency code for adjusting prices. Default is Local. For a list of currency ISO codes, visit [Online Assistant Page 1470](https://oa.apps.factset.com/pages/1470). (optional)  (default to "LOCAL")
            var batch = (Batch) "Y";  // Batch? | Enables the ability to asynchronously \"batch\" the request, supporting a long-running request for up to 20 minutes.  When `batch=Y`, the service will respond with an HTTP Status Code of 202.  Once a batch request is submitted, use batch status to see if the job has been completed.  Once completed, retrieve the results of the request via batch-result. When using Batch, ids     limit is increased to  1000 ids per request, though limits on query string via GET method still apply.  It's advised to submit large lists of ids via POST method.  (optional) 
            var paginationLimit = 56;  // int? | Specifies the number of results to return per page. (optional) 
            var paginationOffset = 56;  // int? | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. (optional) 

            try
            {
                // Get insider transactions details for a list of requested identifiers.
                TransactionsApi.GetOwnershipInsiderTransactionsResponseWrapper result = apiInstance.GetOwnershipInsiderTransactions(ids, startDate, endDate, transactionType, rowExclusion, currency, batch, paginationLimit, paginationOffset);

                switch (result.StatusCode)
                {

                    case (HttpStatusCode)200:
                        Console.WriteLine(result.Response200);
                        break;

                    case (HttpStatusCode)202:
                        Console.WriteLine(result.Response202);
                        break;

                }
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling TransactionsApi.GetOwnershipInsiderTransactions: " + e.Message );
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
 **ids** | [**List&lt;string&gt;**](string.md)| Requested list of security identifiers. &lt;p&gt;***ids limit** &#x3D;  10 per request*&lt;/p  &gt; &lt;p&gt;***Batch ids limit** &#x3D;  1000 per request*&lt;/p  &gt;. | 
 **startDate** | **DateTime**| The start date requested for a given date range in **YYYY-MM-DD** format. Future dates (T+1) are not accepted in this endpoint.  | 
 **endDate** | **DateTime**| The end date requested for a given date range in **YYYY-MM-DD** format. Future dates (T+1) are not accepted in this endpoint.  | 
 **transactionType** | **TransactionType?**| Controls the Transaction Type of the data returned. By default, the service will return All Transaction Types.   * **A** &#x3D; All Transaction Types - returns all available transaction types.   * **P** &#x3D; Open Market Purchases - shares on the open market.   * **S** &#x3D;  Open Market Sales - selling shares on the open market.   * **PS** &#x3D; Open Market Purchases &amp; Sales - buying and selling shares on the open market.   * **O** &#x3D; Options Exercised - executing stock options to acquire shares.   * **M** &#x3D; Other Transactions - any other types of equity-related actions not covered above.  | [optional] 
 **rowExclusion** | **RowExclusion?**| Controls the exlcusion of specific transaction rows from the data returned. By default, the service will exclude Derivative and Blank Transaction Types.   * **DB** &#x3D;  Derivative and Blank Transaction Types - excludes both derivative and blank transaction types.   * **B** &#x3D; Blank Transaction Types - excludes only blank transaction types.   * **N** &#x3D;   None - includes all transaction types without exclusion.  | [optional] 
 **currency** | **string**| Currency code for adjusting prices. Default is Local. For a list of currency ISO codes, visit [Online Assistant Page 1470](https://oa.apps.factset.com/pages/1470). | [optional] [default to &quot;LOCAL&quot;]
 **batch** | **Batch?**| Enables the ability to asynchronously \&quot;batch\&quot; the request, supporting a long-running request for up to 20 minutes.  When &#x60;batch&#x3D;Y&#x60;, the service will respond with an HTTP Status Code of 202.  Once a batch request is submitted, use batch status to see if the job has been completed.  Once completed, retrieve the results of the request via batch-result. When using Batch, ids     limit is increased to  1000 ids per request, though limits on query string via GET method still apply.  It&#39;s advised to submit large lists of ids via POST method.  | [optional] 
 **paginationLimit** | **int?**| Specifies the number of results to return per page. | [optional] 
 **paginationOffset** | **int?**| Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. | [optional] 

### Return type
GetOwnershipInsiderTransactionsResponseWrapper

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Insider Transactions Response. |  -  |
| **202** | Batch request has been accepted. |  * Location - Path to Batch Request status. <br>  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getownershipinstitutionaltransactions"></a>
# **GetOwnershipInstitutionalTransactions**
> InstitutionalTransactionsResponse GetOwnershipInstitutionalTransactions (List<string> ids, DateTime startDate, DateTime endDate, string currency = null, Frequency? frequency = null, TopNHolders? topNHolders = null, HolderType? holderType = null, PeriodOfMeasure? periodOfMeasure = null, Batch? batch = null, int? paginationLimit = null, int? paginationOffset = null)

Get institutional transaction details for a list of requested identifiers.

Get institutional transaction details for a list of requested identifiers. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Net;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetOwnership.Api;
using FactSet.SDK.FactSetOwnership.Client;
using FactSet.SDK.FactSetOwnership.Model;

namespace Example
{
    public class GetOwnershipInstitutionalTransactionsExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetOwnership.Client.Configuration();

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

            var apiInstance = new TransactionsApi(config);

            var ids = new List<string>(); // List<string> | Requested list of security identifiers. <p>***ids limit** =  10 per request*</p  > <p>***Batch ids limit** =  1000 per request*</p  >.
            var startDate = DateTime.Parse("2020-06-30");  // DateTime | The start date requested for a given date range in **YYYY-MM-DD** format. Future dates (T+1) are not accepted in this endpoint. 
            var endDate = DateTime.Parse("2021-06-30");  // DateTime | The end date requested for a given date range in **YYYY-MM-DD** format. Future dates (T+1) are not accepted in this endpoint. 
            var currency = "\"LOCAL\"";  // string | Currency code for adjusting prices. Default is Local. For a list of currency ISO codes, visit [Online Assistant Page 1470](https://oa.apps.factset.com/pages/1470). (optional)  (default to "LOCAL")
            var frequency = (Frequency) "M";  // Frequency? | Controls the display frequency of the data returned.   * **M** = Monthly, based on the last trading day of the month.   * **MTD** = Month-to-date   * **CQ** = Quarterly based on the last trading day of the calendar quarter (March, June, September, or December).   * **CQTD** =  Calendar quarter-to-date   * **CY** = Calendar Annual, based on the last trading day of the calendar year.   * **CYTD** = Calendar Year-to-date.  (optional) 
            var topNHolders = (TopNHolders) "ALL";  // TopNHolders? | Specifies the number of top holders whose data is returned.   * **ALL** = All holders   * **5** = Top 5 Institutional Holders   * **10** = Top 10 Institutional Holders   * **25** = Top 25 Institutional Holders   * **50** = Top 50 Institutional Holders   * **100** = Top 100 Institutional Holders  (optional) 
            var holderType = (HolderType) "F";  // HolderType? | Controls the Holder Type of the data returned. By default, the service will return Institutional Holders. Requesting All Holders is not currently supported. Only a single Holder Type is allowed per request.   * **F** = Institutions   * **M** = Mutual Funds   * **S** =  Insiders/Stakeholders   * **FS** = Institutions/Insiders   * **B** = Beneficial Owners  (optional) 
            var periodOfMeasure = (PeriodOfMeasure) "1M";  // PeriodOfMeasure? | Determines the range over which the code calculates change for Percent Ownership and Position Change.   * **1M** = 1 Month (last 30 days)   * **3M** = 3 Months (last 90 days)   * **6M** = 6 Months (last 180 days)   * **12M** = 12 Months (last 365 days)  (optional) 
            var batch = (Batch) "Y";  // Batch? | Enables the ability to asynchronously \"batch\" the request, supporting a long-running request for up to 20 minutes.  When `batch=Y`, the service will respond with an HTTP Status Code of 202.  Once a batch request is submitted, use batch status to see if the job has been completed.  Once completed, retrieve the results of the request via batch-result. When using Batch, ids     limit is increased to  1000 ids per request, though limits on query string via GET method still apply.  It's advised to submit large lists of ids via POST method.  (optional) 
            var paginationLimit = 56;  // int? | Specifies the number of results to return per page. (optional) 
            var paginationOffset = 56;  // int? | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. (optional) 

            try
            {
                // Get institutional transaction details for a list of requested identifiers.
                TransactionsApi.GetOwnershipInstitutionalTransactionsResponseWrapper result = apiInstance.GetOwnershipInstitutionalTransactions(ids, startDate, endDate, currency, frequency, topNHolders, holderType, periodOfMeasure, batch, paginationLimit, paginationOffset);

                switch (result.StatusCode)
                {

                    case (HttpStatusCode)200:
                        Console.WriteLine(result.Response200);
                        break;

                    case (HttpStatusCode)202:
                        Console.WriteLine(result.Response202);
                        break;

                }
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling TransactionsApi.GetOwnershipInstitutionalTransactions: " + e.Message );
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
 **ids** | [**List&lt;string&gt;**](string.md)| Requested list of security identifiers. &lt;p&gt;***ids limit** &#x3D;  10 per request*&lt;/p  &gt; &lt;p&gt;***Batch ids limit** &#x3D;  1000 per request*&lt;/p  &gt;. | 
 **startDate** | **DateTime**| The start date requested for a given date range in **YYYY-MM-DD** format. Future dates (T+1) are not accepted in this endpoint.  | 
 **endDate** | **DateTime**| The end date requested for a given date range in **YYYY-MM-DD** format. Future dates (T+1) are not accepted in this endpoint.  | 
 **currency** | **string**| Currency code for adjusting prices. Default is Local. For a list of currency ISO codes, visit [Online Assistant Page 1470](https://oa.apps.factset.com/pages/1470). | [optional] [default to &quot;LOCAL&quot;]
 **frequency** | **Frequency?**| Controls the display frequency of the data returned.   * **M** &#x3D; Monthly, based on the last trading day of the month.   * **MTD** &#x3D; Month-to-date   * **CQ** &#x3D; Quarterly based on the last trading day of the calendar quarter (March, June, September, or December).   * **CQTD** &#x3D;  Calendar quarter-to-date   * **CY** &#x3D; Calendar Annual, based on the last trading day of the calendar year.   * **CYTD** &#x3D; Calendar Year-to-date.  | [optional] 
 **topNHolders** | **TopNHolders?**| Specifies the number of top holders whose data is returned.   * **ALL** &#x3D; All holders   * **5** &#x3D; Top 5 Institutional Holders   * **10** &#x3D; Top 10 Institutional Holders   * **25** &#x3D; Top 25 Institutional Holders   * **50** &#x3D; Top 50 Institutional Holders   * **100** &#x3D; Top 100 Institutional Holders  | [optional] 
 **holderType** | **HolderType?**| Controls the Holder Type of the data returned. By default, the service will return Institutional Holders. Requesting All Holders is not currently supported. Only a single Holder Type is allowed per request.   * **F** &#x3D; Institutions   * **M** &#x3D; Mutual Funds   * **S** &#x3D;  Insiders/Stakeholders   * **FS** &#x3D; Institutions/Insiders   * **B** &#x3D; Beneficial Owners  | [optional] 
 **periodOfMeasure** | **PeriodOfMeasure?**| Determines the range over which the code calculates change for Percent Ownership and Position Change.   * **1M** &#x3D; 1 Month (last 30 days)   * **3M** &#x3D; 3 Months (last 90 days)   * **6M** &#x3D; 6 Months (last 180 days)   * **12M** &#x3D; 12 Months (last 365 days)  | [optional] 
 **batch** | **Batch?**| Enables the ability to asynchronously \&quot;batch\&quot; the request, supporting a long-running request for up to 20 minutes.  When &#x60;batch&#x3D;Y&#x60;, the service will respond with an HTTP Status Code of 202.  Once a batch request is submitted, use batch status to see if the job has been completed.  Once completed, retrieve the results of the request via batch-result. When using Batch, ids     limit is increased to  1000 ids per request, though limits on query string via GET method still apply.  It&#39;s advised to submit large lists of ids via POST method.  | [optional] 
 **paginationLimit** | **int?**| Specifies the number of results to return per page. | [optional] 
 **paginationOffset** | **int?**| Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. | [optional] 

### Return type
GetOwnershipInstitutionalTransactionsResponseWrapper

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Institutional Transactions Response. |  -  |
| **202** | Batch request has been accepted. |  * Location - Path to Batch Request status. <br>  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="postownershipinsidertransactions"></a>
# **PostOwnershipInsiderTransactions**
> InsiderTransactionsResponse PostOwnershipInsiderTransactions (InsiderTransactionsRequest insiderTransactionsRequest)

Get insider transactions details for a list of requested identifiers.

Gets insider transaction details for a list of requested identifiers.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Net;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetOwnership.Api;
using FactSet.SDK.FactSetOwnership.Client;
using FactSet.SDK.FactSetOwnership.Model;

namespace Example
{
    public class PostOwnershipInsiderTransactionsExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetOwnership.Client.Configuration();

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

            var apiInstance = new TransactionsApi(config);

            var insiderTransactionsRequest = new InsiderTransactionsRequest(); // InsiderTransactionsRequest | Requesting Insider Transaction Details

            try
            {
                // Get insider transactions details for a list of requested identifiers.
                TransactionsApi.PostOwnershipInsiderTransactionsResponseWrapper result = apiInstance.PostOwnershipInsiderTransactions(insiderTransactionsRequest);

                switch (result.StatusCode)
                {

                    case (HttpStatusCode)200:
                        Console.WriteLine(result.Response200);
                        break;

                    case (HttpStatusCode)202:
                        Console.WriteLine(result.Response202);
                        break;

                }
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling TransactionsApi.PostOwnershipInsiderTransactions: " + e.Message );
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
 **insiderTransactionsRequest** | [**InsiderTransactionsRequest**](InsiderTransactionsRequest.md)| Requesting Insider Transaction Details | 

### Return type
PostOwnershipInsiderTransactionsResponseWrapper

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Insider Transactions Response. |  -  |
| **202** | Batch request has been accepted. |  * Location - Path to Batch Request status. <br>  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="postownershipinstitutionaltransactions"></a>
# **PostOwnershipInstitutionalTransactions**
> InstitutionalTransactionsResponse PostOwnershipInstitutionalTransactions (InstitutionalTransactionsRequest institutionalTransactionsRequest)

Gets institutional transaction details for a list of requested identifiers.

Gets institutional transaction details for a list of requested identifiers.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Net;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetOwnership.Api;
using FactSet.SDK.FactSetOwnership.Client;
using FactSet.SDK.FactSetOwnership.Model;

namespace Example
{
    public class PostOwnershipInstitutionalTransactionsExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetOwnership.Client.Configuration();

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

            var apiInstance = new TransactionsApi(config);

            var institutionalTransactionsRequest = new InstitutionalTransactionsRequest(); // InstitutionalTransactionsRequest | Requesting Institutional Transaction Details

            try
            {
                // Gets institutional transaction details for a list of requested identifiers.
                TransactionsApi.PostOwnershipInstitutionalTransactionsResponseWrapper result = apiInstance.PostOwnershipInstitutionalTransactions(institutionalTransactionsRequest);

                switch (result.StatusCode)
                {

                    case (HttpStatusCode)200:
                        Console.WriteLine(result.Response200);
                        break;

                    case (HttpStatusCode)202:
                        Console.WriteLine(result.Response202);
                        break;

                }
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling TransactionsApi.PostOwnershipInstitutionalTransactions: " + e.Message );
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
 **institutionalTransactionsRequest** | [**InstitutionalTransactionsRequest**](InstitutionalTransactionsRequest.md)| Requesting Institutional Transaction Details | 

### Return type
PostOwnershipInstitutionalTransactionsResponseWrapper

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Institutional Transactions Response. |  -  |
| **202** | Batch request has been accepted. |  * Location - Path to Batch Request status. <br>  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


