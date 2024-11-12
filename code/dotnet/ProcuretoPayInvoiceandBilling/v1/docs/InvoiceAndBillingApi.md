# FactSet.SDK.ProcuretoPayInvoiceandBilling.Api.InvoiceAndBillingApi

All URIs are relative to *https://api-sandbox.factset.com/procuretopay/invoice-and-billing*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetFitsReportGet**](InvoiceAndBillingApi.md#getfitsreportget) | **GET** /getFitsReport | Returns Fits report by given FITSID
[**GetInvoiceGet**](InvoiceAndBillingApi.md#getinvoiceget) | **GET** /getInvoice | Returns PDF of specific invoice
[**InvoiceDetailsGet**](InvoiceAndBillingApi.md#invoicedetailsget) | **GET** /invoiceDetails | Returns details on specific invoice.
[**ListInvoicesGet**](InvoiceAndBillingApi.md#listinvoicesget) | **GET** /listInvoices | Returns all available invoices



<a name="getfitsreportget"></a>
# **GetFitsReportGet**
> List&lt;Object&gt; GetFitsReportGet (string fitsID)

Returns Fits report by given FITSID

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.ProcuretoPayInvoiceandBilling.Api;
using FactSet.SDK.ProcuretoPayInvoiceandBilling.Client;
using FactSet.SDK.ProcuretoPayInvoiceandBilling.Model;

namespace Example
{
    public class GetFitsReportGetExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.ProcuretoPayInvoiceandBilling.Client.Configuration();

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

            var apiInstance = new InvoiceAndBillingApi(config);

            var fitsID = "AB2C2101";  // string | FITSID can be determined by concatenating the AccountNumber + two-digit year (e.g 21 for 2021) and two-digit month (e.g. 01 for January). Available AccountNumbers are available from the /listInvoices endpoint.

            try
            {
                // Returns Fits report by given FITSID
                List<Object> result = apiInstance.GetFitsReportGet(fitsID);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling InvoiceAndBillingApi.GetFitsReportGet: " + e.Message );
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
 **fitsID** | **string**| FITSID can be determined by concatenating the AccountNumber + two-digit year (e.g 21 for 2021) and two-digit month (e.g. 01 for January). Available AccountNumbers are available from the /listInvoices endpoint. | 

### Return type
**List<Object>**

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getinvoiceget"></a>
# **GetInvoiceGet**
> System.IO.Stream GetInvoiceGet (string invoiceId)

Returns PDF of specific invoice

A .PDF File

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.ProcuretoPayInvoiceandBilling.Api;
using FactSet.SDK.ProcuretoPayInvoiceandBilling.Client;
using FactSet.SDK.ProcuretoPayInvoiceandBilling.Model;

namespace Example
{
    public class GetInvoiceGetExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.ProcuretoPayInvoiceandBilling.Client.Configuration();

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

            var apiInstance = new InvoiceAndBillingApi(config);

            var invoiceId = "11963874";  // string | Invoice code you wish to download

            try
            {
                // Returns PDF of specific invoice
                System.IO.Stream result = apiInstance.GetInvoiceGet(invoiceId);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling InvoiceAndBillingApi.GetInvoiceGet: " + e.Message );
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
 **invoiceId** | **string**| Invoice code you wish to download | 

### Return type
**System.IO.Stream**

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="invoicedetailsget"></a>
# **InvoiceDetailsGet**
> InvoiceDetails InvoiceDetailsGet (string invoiceId)

Returns details on specific invoice.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.ProcuretoPayInvoiceandBilling.Api;
using FactSet.SDK.ProcuretoPayInvoiceandBilling.Client;
using FactSet.SDK.ProcuretoPayInvoiceandBilling.Model;

namespace Example
{
    public class InvoiceDetailsGetExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.ProcuretoPayInvoiceandBilling.Client.Configuration();

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

            var apiInstance = new InvoiceAndBillingApi(config);

            var invoiceId = "11963874";  // string | Invoice code to query. See /listInvoices endpoint for list of available invoices to query.

            try
            {
                // Returns details on specific invoice.
                InvoiceDetails result = apiInstance.InvoiceDetailsGet(invoiceId);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling InvoiceAndBillingApi.InvoiceDetailsGet: " + e.Message );
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
 **invoiceId** | **string**| Invoice code to query. See /listInvoices endpoint for list of available invoices to query. | 

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="listinvoicesget"></a>
# **ListInvoicesGet**
> List&lt;Object&gt; ListInvoicesGet ()

Returns all available invoices

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.ProcuretoPayInvoiceandBilling.Api;
using FactSet.SDK.ProcuretoPayInvoiceandBilling.Client;
using FactSet.SDK.ProcuretoPayInvoiceandBilling.Model;

namespace Example
{
    public class ListInvoicesGetExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.ProcuretoPayInvoiceandBilling.Client.Configuration();

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

            var apiInstance = new InvoiceAndBillingApi(config);


            try
            {
                // Returns all available invoices
                List<Object> result = apiInstance.ListInvoicesGet();
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling InvoiceAndBillingApi.ListInvoicesGet: " + e.Message );
                Console.WriteLine("Status Code: "+ e.ErrorCode);
                Console.WriteLine(e.StackTrace);
            }
        }
    }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type
**List<Object>**

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


