# FactSet.SDK.IDLookup.Api.FactSetIDLookupApi

All URIs are relative to *https://api.factset.com/idsearch/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**Helper**](FactSetIDLookupApi.md#helper) | **GET** /metadata/fields/list-by-dataset | Helper endpoint offering a list of supported fields and values to filter a requested dataset.
[**Search**](FactSetIDLookupApi.md#search) | **POST** /lookup | Search functionality to return tickers, company names, and unique identifiers for FactSet data.



<a name="helper"></a>
# **Helper**
> HelperEndpoint Helper (string dataset)

Helper endpoint offering a list of supported fields and values to filter a requested dataset.

By querying this helper endpoint, users can retrieve a comprehensive list of supported fields, each associated with its permissible values. This functionality enhances the usability of the API by empowering users to construct precise queries tailored to their requirements when accessing the requested dataset. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.IDLookup.Api;
using FactSet.SDK.IDLookup.Client;
using FactSet.SDK.IDLookup.Model;

namespace Example
{
    public class HelperExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.IDLookup.Client.Configuration();

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

            var apiInstance = new FactSetIDLookupApi(config);

            var dataset = "equities";  // string | Type of dataset.

            try
            {
                // Helper endpoint offering a list of supported fields and values to filter a requested dataset.
                HelperEndpoint result = apiInstance.Helper(dataset);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling FactSetIDLookupApi.Helper: " + e.Message );
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
 **dataset** | **string**| Type of dataset. | 

### Return type
[**HelperEndpoint**](HelperEndpoint.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Authentication Issue |  -  |
| **403** | Authorization Issue |  -  |
| **429** | Limit Exceeded |  -  |
| **500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="search"></a>
# **Search**
> LookupResponse Search (LookupRequest lookupRequest)

Search functionality to return tickers, company names, and unique identifiers for FactSet data.

This functionality enables users to input search queries, such as company names or keywords, and receive results containing matching entities along with their associated tickers and unique identifiers.   Essentially, it provides a streamlined means of locating specific data points within the FactSet database, facilitating the efficient retrieval of essential information related to companies or financial instruments.  The dataset names provided in the table below can be used in the request body.  | Dataset Name                | Dataset Description                 | ID Type           | ID Example   | |- -- -- -- -- -- -- -- -- -- -- -- -- -- --|- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- --|- -- -- -- -- -- -- -- -- --|- -- -- -- -- -- -- -| | *`bankLoans`*               | Bank Loans                          | symbol            | LX056750     | | *`commodities`*             | Commodities                         | symbol            | DUBAIM-FDS   | | *`cepBonds`*                | Continuous Evaluated Pricing        | tickerExchange    | N3ZWW5.FI-CEP| | *`countries`*               | Countries                           | symbol            | CC_MA        | | *`deals`*                   | Deals                               | symbol            | 4161715      | | *`economicReports`*             | Economic Reports                    | symbol            | USKEY-ECON   | | *`economicSeries`*          | Economic Series                     | symbol            | EUZ.GDPR     | | *`equities`*                | Equities                            | tickerRegion      | AAPL-US      | | *`equitiesRealTime`*        | Equities RealTime                   | tickerExchange    | M-BKK        | | *`etfs`*                    | ETFs                                | tickerRegion      | ACWI-US      | | *`etfsRealTime`*            | ETFs RealTime                       | symbol            | JPNA | *`exchangeRatesRealTime`*   | Exchange Rates RealTime             | symbol            | AUDUSD-FX1   | | *`bonds`*                   | Fixed Income                        | symbol            | XS2027359756 | | *`forex`*                   | Foreign Exchange                    | symbol            | USDARS       | | *`futures`*                 | Futures (continuous)                | symbol            | AP00-SFE     | | *`indices`*                 | Indices                             | symbol            | 186745       | | *`indicesRealTime`*         | Indices RealTime                    | symbol            | BB3MUS.A-PSE | | *`industries`*              | Industries                          | symbol            | FI1225R1     | | *`markitLoans`*             | Markit Loans                        | symbol            | LX111044-USA | | *`mutualFunds`*             | Mutual Funds                        | tickerRegion      | AMECX-US     | | *`mutualFundsRealTime`*     | Mutual Funds RealTime               | symbol            | 015414       | | *`ownershipHolders`*        | Ownership Holders                   | symbol            | F5102330     | | *`people`*                  | People                              | entityId          | 065SLB-E     | | *`privateCompanies`*        | Private Companies                   | entityId          | 0CBD2D-E     | | *`pevcFirms`*               | Private Equity/Venture Capital Firms| entityId          | 000BKX-E     | | *`pevcFunds`*               | Private Equity/Venture Capital Funds| entityId          | 0WCD0X-E     | | *`regions`*                 | Region                              | symbol            | RG_AMER      | | *`yields`*                  | Yields                              | symbol            | TRYAU10Y-FDS | | *`options`*                 | options                             | tickerExchange           | A#P1924C100000-USA| 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.IDLookup.Api;
using FactSet.SDK.IDLookup.Client;
using FactSet.SDK.IDLookup.Model;

namespace Example
{
    public class SearchExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.IDLookup.Client.Configuration();

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

            var apiInstance = new FactSetIDLookupApi(config);

            var lookupRequest = new LookupRequest(); // LookupRequest | Request body to lookup any FactSet identifiers.

            try
            {
                // Search functionality to return tickers, company names, and unique identifiers for FactSet data.
                LookupResponse result = apiInstance.Search(lookupRequest);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling FactSetIDLookupApi.Search: " + e.Message );
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
 **lookupRequest** | [**LookupRequest**](LookupRequest.md)| Request body to lookup any FactSet identifiers. | 

### Return type
[**LookupResponse**](LookupResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A list of securities |  -  |
| **400** | Bad Request |  -  |
| **401** | Authentication Issue |  -  |
| **403** | Authorization Issue |  -  |
| **429** | Limit Exceeded |  -  |
| **500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


