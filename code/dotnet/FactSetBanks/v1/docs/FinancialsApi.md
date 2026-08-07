# FactSet.SDK.FactSetBanks.Api.FinancialsApi

All URIs are relative to *https://api.factset.com/content/factset-banks/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetFinancials**](FinancialsApi.md#getfinancials) | **POST** /financials | Returns bank financial statement data



<a name="getfinancials"></a>
# **GetFinancials**
> FinancialsResponse GetFinancials (FinancialsRequest financialsRequest)

Returns bank financial statement data

Returns regulatory financial statements for banks and financial institutions. Use the `coverage` field to specify the data source:  * **US** — US banks, thrifts, and depository institutions (FFIEC/FDIC/Federal Reserve sources). Covers 11,000+ bank holding companies (forms FR Y-9C/SP/LP/15) and 10,000+ banking institutions (FFIEC 031/041/051/101/102), with history back to 1991 for BHCs and 2002 for institutions. Includes demographics (charter class, specialization, established and deposit-insurance dates) and 3,000+ metrics covering profitability, capital adequacy (Basel III), loan/deposit composition, asset quality, yields, and funding costs. Also includes industry aggregates for 800+ US banking institutions with annual, quarterly, LTM, and YTD data since 2010. * **CANADA** — Canadian banks regulated by OSFI. 148+ institutions; 800+ data items; history since 2017. Balance sheet data is updated monthly; supplementary reports (Capital Components, Credit Losses, Derivative Contracts, Foreign Bank Branch, Income Statement) are updated quarterly. * **AUSTRALIA** — Australian banks regulated by APRA. 100+ institutions, interim-period balance sheet data; LTM history since 2002; 30+ data items. * **CREDIT_UNION** — US credit unions regulated by NCUA. 5,800+ credit unions, quarterly data since 2017; 2,400+ data items.  Find available metrics via [`/metrics`](#operation/getMetrics) with:  * **category**: `FINANCIALS` * **subcategory**: `US`, `CANADA`, `AUSTRALIA`, `CREDIT_UNION`, `INDUSTRY` 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetBanks.Api;
using FactSet.SDK.FactSetBanks.Client;
using FactSet.SDK.FactSetBanks.Model;

namespace Example
{
    public class GetFinancialsExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetBanks.Client.Configuration();

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

            var apiInstance = new FinancialsApi(config);

            var financialsRequest = new FinancialsRequest(); // FinancialsRequest | 

            try
            {
                // Returns bank financial statement data
                FinancialsResponse result = apiInstance.GetFinancials(financialsRequest);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling FinancialsApi.GetFinancials: " + e.Message );
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
 **financialsRequest** | [**FinancialsRequest**](FinancialsRequest.md)|  | 

### Return type
[**FinancialsResponse**](FinancialsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with financial statement data |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;detail\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **404** | The requested endpoint could not be found. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **422** | Unprocessable Entity. Your request data was syntactically correct but semantically invalid. Check the required parameters and their value constraints.  |  -  |
| **500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


