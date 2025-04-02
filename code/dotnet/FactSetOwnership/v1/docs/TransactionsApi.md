# FactSet.SDK.FactSetOwnership.Api.TransactionsApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetOwnershipInsiderTransactions**](TransactionsApi.md#getownershipinsidertransactions) | **GET** /factset-ownership/v1/transactions/insider | Get insider transactions details for a list of requested identifiers.
[**GetOwnershipInstitutionalTransactions**](TransactionsApi.md#getownershipinstitutionaltransactions) | **GET** /factset-ownership/v1/transactions/institutional | Get institutional transaction details for a list of requested identifiers.
[**PostOwnershipInsiderTransactions**](TransactionsApi.md#postownershipinsidertransactions) | **POST** /factset-ownership/v1/transactions/insider | Get insider transactions details for a list of requested identifiers.
[**PostOwnershipInstituionalTransactions**](TransactionsApi.md#postownershipinstituionaltransactions) | **POST** /factset-ownership/v1/transactions/institutional | Gets institutional transaction details for a list of requested identifiers.



<a name="getownershipinsidertransactions"></a>
# **GetOwnershipInsiderTransactions**
> InsiderTransactionsResponse GetOwnershipInsiderTransactions (List<string> ids, DateTime startDate, DateTime endDate, string transactionType = null, string rowExclusion = null, string currency = null)

Get insider transactions details for a list of requested identifiers.

Gets insider transaction details for a list of requested identifiers. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
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

            var ids = new List<string>(); // List<string> | Requested list of security identifiers. <p>***ids limit** =  10 per request*</p  >.
            var startDate = DateTime.Parse("2020-06-30");  // DateTime | The start date requested for a given date range in **YYYY-MM-DD** format. Future dates (T+1) are not accepted in this endpoint. 
            var endDate = DateTime.Parse("2021-06-30");  // DateTime | The end date requested for a given date range in **YYYY-MM-DD** format. Future dates (T+1) are not accepted in this endpoint. 
            var transactionType = "A";  // string | Controls the Transaction Type of the data returned. By default, the service will return All Transaction Types.   * **A** = All Transaction Types - returns all available transaction types.   * **P** = Open Market Purchases - shares on the open market.   * **S** =  Open Market Sales - selling shares on the open market.   * **PS** = Open Market Purchases & Sales - buying and selling shares on the open market.   * **O** = Options Exercised - executing stock options to acquire shares.   * **M** = Other Transactions - any other types of equity-related actions not covered above.  (optional)  (default to A)
            var rowExclusion = "DB";  // string | Controls the exlcusion of specific transaction rows from the data returned. By default, the service will exclude Derivative and Blank Transaction Types.   * **DB** =  Derivative and Blank Transaction Types - excludes both derivative and blank transaction types.   * **B** = Blank Transaction Types - excludes only blank transaction types.   * **N** =   None - includes all transaction types without exclusion.  (optional)  (default to DB)
            var currency = "\"LOCAL\"";  // string | Currency code for adjusting prices. Default is Local. For a list of currency ISO codes, visit [Online Assistant Page 1470](https://oa.apps.factset.com/pages/1470). (optional)  (default to "LOCAL")

            try
            {
                // Get insider transactions details for a list of requested identifiers.
                InsiderTransactionsResponse result = apiInstance.GetOwnershipInsiderTransactions(ids, startDate, endDate, transactionType, rowExclusion, currency);
                Console.WriteLine(result.ToJson());
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
 **ids** | [**List&lt;string&gt;**](string.md)| Requested list of security identifiers. &lt;p&gt;***ids limit** &#x3D;  10 per request*&lt;/p  &gt;. | 
 **startDate** | **DateTime**| The start date requested for a given date range in **YYYY-MM-DD** format. Future dates (T+1) are not accepted in this endpoint.  | 
 **endDate** | **DateTime**| The end date requested for a given date range in **YYYY-MM-DD** format. Future dates (T+1) are not accepted in this endpoint.  | 
 **transactionType** | **string**| Controls the Transaction Type of the data returned. By default, the service will return All Transaction Types.   * **A** &#x3D; All Transaction Types - returns all available transaction types.   * **P** &#x3D; Open Market Purchases - shares on the open market.   * **S** &#x3D;  Open Market Sales - selling shares on the open market.   * **PS** &#x3D; Open Market Purchases &amp; Sales - buying and selling shares on the open market.   * **O** &#x3D; Options Exercised - executing stock options to acquire shares.   * **M** &#x3D; Other Transactions - any other types of equity-related actions not covered above.  | [optional] [default to A]
 **rowExclusion** | **string**| Controls the exlcusion of specific transaction rows from the data returned. By default, the service will exclude Derivative and Blank Transaction Types.   * **DB** &#x3D;  Derivative and Blank Transaction Types - excludes both derivative and blank transaction types.   * **B** &#x3D; Blank Transaction Types - excludes only blank transaction types.   * **N** &#x3D;   None - includes all transaction types without exclusion.  | [optional] [default to DB]
 **currency** | **string**| Currency code for adjusting prices. Default is Local. For a list of currency ISO codes, visit [Online Assistant Page 1470](https://oa.apps.factset.com/pages/1470). | [optional] [default to &quot;LOCAL&quot;]

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getownershipinstitutionaltransactions"></a>
# **GetOwnershipInstitutionalTransactions**
> InstitutionalTransactionsResponse GetOwnershipInstitutionalTransactions (List<string> ids, DateTime startDate, DateTime endDate, string currency = null, string frequency = null, string topNHolders = null, string holderType = null)

Get institutional transaction details for a list of requested identifiers.

Get institutional transaction details for a list of requested identifiers. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
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

            var ids = new List<string>(); // List<string> | Requested list of security identifiers. <p>***ids limit** =  10 per request*</p  >.
            var startDate = DateTime.Parse("2020-06-30");  // DateTime | The start date requested for a given date range in **YYYY-MM-DD** format. Future dates (T+1) are not accepted in this endpoint. 
            var endDate = DateTime.Parse("2021-06-30");  // DateTime | The end date requested for a given date range in **YYYY-MM-DD** format. Future dates (T+1) are not accepted in this endpoint. 
            var currency = "\"LOCAL\"";  // string | Currency code for adjusting prices. Default is Local. For a list of currency ISO codes, visit [Online Assistant Page 1470](https://oa.apps.factset.com/pages/1470). (optional)  (default to "LOCAL")
            var frequency = "M";  // string | Controls the display frequency of the data returned.   * **M** = Monthly, based on the last trading day of the month.   * **MTD** = Month-to-date   * **CQ** = Quarterly based on the last trading day of the calendar quarter (March, June, September, or December).   * **CQTD** =  Calendar quarter-to-date   * **CY** = Calendar Annual, based on the last trading day of the calendar year.   * **CYTD** = Calendar Year-to-date.  (optional)  (default to M)
            var topNHolders = "ALL";  // string | Specifies the number of top holders whose data is returned.   * **ALL** = All holders   * **5** = Top 5 Institutional Holders   * **10** = Top 10 Institutional Holders   * **25** = Top 25 Institutional Holders   * **50** = Top 50 Institutional Holders   * **100** = Top 100 Institutional Holders  (optional)  (default to 25)
            var holderType = "F";  // string | Controls the Holder Type of the data returned. By default, the service will return Institutional Holders. Requesting All Holders is not currently supported. Only a single Holder Type is allowed per request.   * **F** = Institutions   * **M** = Mutual Funds   * **S** =  Insiders/Stakeholders   * **FS** = Institutions/Insiders   * **B** = Beneficial Owners  (optional)  (default to F)

            try
            {
                // Get institutional transaction details for a list of requested identifiers.
                InstitutionalTransactionsResponse result = apiInstance.GetOwnershipInstitutionalTransactions(ids, startDate, endDate, currency, frequency, topNHolders, holderType);
                Console.WriteLine(result.ToJson());
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
 **ids** | [**List&lt;string&gt;**](string.md)| Requested list of security identifiers. &lt;p&gt;***ids limit** &#x3D;  10 per request*&lt;/p  &gt;. | 
 **startDate** | **DateTime**| The start date requested for a given date range in **YYYY-MM-DD** format. Future dates (T+1) are not accepted in this endpoint.  | 
 **endDate** | **DateTime**| The end date requested for a given date range in **YYYY-MM-DD** format. Future dates (T+1) are not accepted in this endpoint.  | 
 **currency** | **string**| Currency code for adjusting prices. Default is Local. For a list of currency ISO codes, visit [Online Assistant Page 1470](https://oa.apps.factset.com/pages/1470). | [optional] [default to &quot;LOCAL&quot;]
 **frequency** | **string**| Controls the display frequency of the data returned.   * **M** &#x3D; Monthly, based on the last trading day of the month.   * **MTD** &#x3D; Month-to-date   * **CQ** &#x3D; Quarterly based on the last trading day of the calendar quarter (March, June, September, or December).   * **CQTD** &#x3D;  Calendar quarter-to-date   * **CY** &#x3D; Calendar Annual, based on the last trading day of the calendar year.   * **CYTD** &#x3D; Calendar Year-to-date.  | [optional] [default to M]
 **topNHolders** | **string**| Specifies the number of top holders whose data is returned.   * **ALL** &#x3D; All holders   * **5** &#x3D; Top 5 Institutional Holders   * **10** &#x3D; Top 10 Institutional Holders   * **25** &#x3D; Top 25 Institutional Holders   * **50** &#x3D; Top 50 Institutional Holders   * **100** &#x3D; Top 100 Institutional Holders  | [optional] [default to 25]
 **holderType** | **string**| Controls the Holder Type of the data returned. By default, the service will return Institutional Holders. Requesting All Holders is not currently supported. Only a single Holder Type is allowed per request.   * **F** &#x3D; Institutions   * **M** &#x3D; Mutual Funds   * **S** &#x3D;  Insiders/Stakeholders   * **FS** &#x3D; Institutions/Insiders   * **B** &#x3D; Beneficial Owners  | [optional] [default to F]

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
                InsiderTransactionsResponse result = apiInstance.PostOwnershipInsiderTransactions(insiderTransactionsRequest);
                Console.WriteLine(result.ToJson());
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="postownershipinstituionaltransactions"></a>
# **PostOwnershipInstituionalTransactions**
> InstitutionalTransactionsResponse PostOwnershipInstituionalTransactions (InstitutionalTransactionsRequest institutionalTransactionsRequest)

Gets institutional transaction details for a list of requested identifiers.

Gets institutional transaction details for a list of requested identifiers.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetOwnership.Api;
using FactSet.SDK.FactSetOwnership.Client;
using FactSet.SDK.FactSetOwnership.Model;

namespace Example
{
    public class PostOwnershipInstituionalTransactionsExample
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
                InstitutionalTransactionsResponse result = apiInstance.PostOwnershipInstituionalTransactions(institutionalTransactionsRequest);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling TransactionsApi.PostOwnershipInstituionalTransactions: " + e.Message );
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


