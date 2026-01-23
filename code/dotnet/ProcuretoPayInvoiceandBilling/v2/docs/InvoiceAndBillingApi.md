# FactSet.SDK.ProcuretoPayInvoiceandBilling.Api.InvoiceAndBillingApi

All URIs are relative to *https://api.factset.com/procure-to-pay/invoice-and-billing/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**DownloadInvoice**](InvoiceAndBillingApi.md#downloadinvoice) | **GET** /invoices/{id}/download | Get a PDF of the provided invoiceId
[**FitsReport**](InvoiceAndBillingApi.md#fitsreport) | **GET** /invoices/{id}/fits-report | Get FITS report
[**InvoiceDetails**](InvoiceAndBillingApi.md#invoicedetails) | **GET** /invoices/{id} | Get invoice details
[**ListAccounts**](InvoiceAndBillingApi.md#listaccounts) | **GET** /accounts | Returns a list of available accounts



<a name="downloadinvoice"></a>
# **DownloadInvoice**
> System.IO.Stream DownloadInvoice (string id)

Get a PDF of the provided invoiceId

Returns and downloads .PDF invoice by provided invoiceId. <b>InvoiceId</b> is determined by concatenating the AccountId and 2-Digit date, representing year and 2-Digit month. E.G. For the December 2023 Invoice the invoiceId would be: AB2C2312

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
    public class DownloadInvoiceExample
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

            var id = "AB2C2503";  // string | Concatenation of AccountID and Date as YYMM

            try
            {
                // Get a PDF of the provided invoiceId
                System.IO.Stream result = apiInstance.DownloadInvoice(id);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling InvoiceAndBillingApi.DownloadInvoice: " + e.Message );
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
 **id** | **string**| Concatenation of AccountID and Date as YYMM | 

### Return type
**System.IO.Stream**

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="fitsreport"></a>
# **FitsReport**
> ProductGroups FitsReport (string id)

Get FITS report

Returns machine readable FITS report by provided fitsId. <b>fitsId</b> is determined by concatenating the AccountId and 2-Digit date, representing year and 2-Digit month. E.G. For the December 2023 Invoice the fitsId would be: AB2C2312.         All prices in the report are provided without currency information. For currency details, please refer to the '/invoices/{id}' endpoint.

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
    public class FitsReportExample
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

            var id = "AB2C2503";  // string | Concatenation of AccountID and Date as YYMM

            try
            {
                // Get FITS report
                ProductGroups result = apiInstance.FitsReport(id);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling InvoiceAndBillingApi.FitsReport: " + e.Message );
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
 **id** | **string**| Concatenation of AccountID and Date as YYMM | 

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="invoicedetails"></a>
# **InvoiceDetails**
> Invoice InvoiceDetails (string id)

Get invoice details

Returns a machine readable invoice report by provided invoiceId. <b>InvoiceId</b> is determined by concatenating the AccountId and  2-Digit date, representing year and 2-Digit month. E.G. For the December 2023 Invoice the invoiceId would be: AB2C2312

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
    public class InvoiceDetailsExample
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

            var id = "AB2C2503";  // string | Concatenation of AccountID and Date as YYMM

            try
            {
                // Get invoice details
                Invoice result = apiInstance.InvoiceDetails(id);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling InvoiceAndBillingApi.InvoiceDetails: " + e.Message );
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
 **id** | **string**| Concatenation of AccountID and Date as YYMM | 

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="listaccounts"></a>
# **ListAccounts**
> Accounts ListAccounts ()

Returns a list of available accounts

Returns a list of accounts containing information such as AccountName and AccountId.

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
    public class ListAccountsExample
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
                // Returns a list of available accounts
                Accounts result = apiInstance.ListAccounts();
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling InvoiceAndBillingApi.ListAccounts: " + e.Message );
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


