# FactSet.SDK.FactSetPrivateEquityandVentureCapital.Api.FundsApi

All URIs are relative to *https://api.factset.com/content/factset-pevc/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetFund**](FundsApi.md#getfund) | **GET** /funds | Retrieve core profile and summary data for specified Private Equity or Venture Capital Funds.
[**GetFundCashflows**](FundsApi.md#getfundcashflows) | **POST** /funds/cashflows | Retrieve time-series cash flow data (contributions and distributions) for specified funds.
[**GetFundFundraising**](FundsApi.md#getfundfundraising) | **GET** /funds/fundraising | Retrieve the complete fundraising history for specified Private Equity or Venture Capital Funds.
[**GetFundPortfolioCompanies**](FundsApi.md#getfundportfoliocompanies) | **GET** /funds/portfolio-companies | Retrieve the list of portfolio companies held by specified Private Equity or Venture Capital Funds.



<a name="getfund"></a>
# **GetFund**
> FundDetailsResponse GetFund (List<string> ids)

Retrieve core profile and summary data for specified Private Equity or Venture Capital Funds.

Retrieves the main descriptive and profile information for one or more Private Equity or Venture Capital funds identified by their FactSet entity IDs. This includes key characteristics like fund status (e.g., Open, Closed), fund type (e.g., Venture, Buyout), vintage year, and high-level strategy details.  Use the `/universe` endpoint, set the `entityType` parameter to `VEN` (Venture Capital Fund), `PVF` (Private Equity Fund/Alt Investment), or `FAF` (Family of Funds (Venture Capital/Private Equity)). Submit the fund's name. The returned `entityId` is the required input value for this endpoint.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetPrivateEquityandVentureCapital.Api;
using FactSet.SDK.FactSetPrivateEquityandVentureCapital.Client;
using FactSet.SDK.FactSetPrivateEquityandVentureCapital.Model;

namespace Example
{
    public class GetFundExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetPrivateEquityandVentureCapital.Client.Configuration();

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

            var apiInstance = new FundsApi(config);

            var ids = new List<string>(); // List<string> | A list of FactSet Permanent Entity Identifiers (FactSet IDs) for **Private Equity and Venture Capital Funds**. These IDs are in the format 'XXXXXX-E' and are the primary input for most fund-related endpoints. These IDs can be retrieved from the /universe endpoint

            try
            {
                // Retrieve core profile and summary data for specified Private Equity or Venture Capital Funds.
                FundDetailsResponse result = apiInstance.GetFund(ids);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling FundsApi.GetFund: " + e.Message );
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
 **ids** | [**List&lt;string&gt;**](string.md)| A list of FactSet Permanent Entity Identifiers (FactSet IDs) for **Private Equity and Venture Capital Funds**. These IDs are in the format &#39;XXXXXX-E&#39; and are the primary input for most fund-related endpoints. These IDs can be retrieved from the /universe endpoint | 

### Return type
[**FundDetailsResponse**](FundDetailsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that the Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getfundcashflows"></a>
# **GetFundCashflows**
> FundCashflowsResponse GetFundCashflows (FundCashflowsRequest fundCashflowsRequest)

Retrieve time-series cash flow data (contributions and distributions) for specified funds.

Provides **quarterly** cash flow data for one or more funds, including **contributions** (capital calls) and **distributions** (payouts). This raw data is fundamental for calculating net cash flows and performance metrics like DPI, TVPI, and IRR.  Use the `/universe` endpoint, set the `entityType` parameter to `VEN` (Venture Capital Fund), `PVF` (Private Equity Fund/Alt Investment), or `FAF` (Family of Funds (Venture Capital/Private Equity)). Submit the fund's name. The returned `entityId` is the required input value for this endpoint.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetPrivateEquityandVentureCapital.Api;
using FactSet.SDK.FactSetPrivateEquityandVentureCapital.Client;
using FactSet.SDK.FactSetPrivateEquityandVentureCapital.Model;

namespace Example
{
    public class GetFundCashflowsExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetPrivateEquityandVentureCapital.Client.Configuration();

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

            var apiInstance = new FundsApi(config);

            var fundCashflowsRequest = new FundCashflowsRequest(); // FundCashflowsRequest | 

            try
            {
                // Retrieve time-series cash flow data (contributions and distributions) for specified funds.
                FundCashflowsResponse result = apiInstance.GetFundCashflows(fundCashflowsRequest);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling FundsApi.GetFundCashflows: " + e.Message );
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
 **fundCashflowsRequest** | [**FundCashflowsRequest**](FundCashflowsRequest.md)|  | 

### Return type
[**FundCashflowsResponse**](FundCashflowsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that the Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getfundfundraising"></a>
# **GetFundFundraising**
> FundFundraisingResponse GetFundFundraising (List<string> ids)

Retrieve the complete fundraising history for specified Private Equity or Venture Capital Funds.

Provides detailed information on the **fundraising lifecycle** of one or more funds, including data on interim and **final closes**, the **total amount raised** (fund size), and the as-reported currency for each fundraising round.  Use the `/universe` endpoint, set the `entityType` parameter to `VEN` (Venture Capital Fund), `PVF` (Private Equity Fund/Alt Investment), or `FAF` (Family of Funds (Venture Capital/Private Equity)). Submit the fund's name. The returned `entityId` is the required input value for this endpoint.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetPrivateEquityandVentureCapital.Api;
using FactSet.SDK.FactSetPrivateEquityandVentureCapital.Client;
using FactSet.SDK.FactSetPrivateEquityandVentureCapital.Model;

namespace Example
{
    public class GetFundFundraisingExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetPrivateEquityandVentureCapital.Client.Configuration();

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

            var apiInstance = new FundsApi(config);

            var ids = new List<string>(); // List<string> | A list of FactSet Permanent Entity Identifiers (FactSet IDs) for **Private Equity and Venture Capital Funds**. These IDs are in the format 'XXXXXX-E' and are the primary input for most fund-related endpoints. These IDs can be retrieved from the /universe endpoint

            try
            {
                // Retrieve the complete fundraising history for specified Private Equity or Venture Capital Funds.
                FundFundraisingResponse result = apiInstance.GetFundFundraising(ids);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling FundsApi.GetFundFundraising: " + e.Message );
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
 **ids** | [**List&lt;string&gt;**](string.md)| A list of FactSet Permanent Entity Identifiers (FactSet IDs) for **Private Equity and Venture Capital Funds**. These IDs are in the format &#39;XXXXXX-E&#39; and are the primary input for most fund-related endpoints. These IDs can be retrieved from the /universe endpoint | 

### Return type
[**FundFundraisingResponse**](FundFundraisingResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that the Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getfundportfoliocompanies"></a>
# **GetFundPortfolioCompanies**
> FundPortfolioCompaniesResponse GetFundPortfolioCompanies (List<string> ids)

Retrieve the list of portfolio companies held by specified Private Equity or Venture Capital Funds.

Provides a list of **FactSet entity identifiers** for the portfolio companies in which a specified fund has invested. This endpoint is key for analyzing a fund's holdings and exposure to different companies in the private market.  Use the `/universe` endpoint, set the `entityType` parameter to `VEN` (Venture Capital Fund), `PVF` (Private Equity Fund/Alt Investment), or `FAF` (Family of Funds (Venture Capital/Private Equity)). Submit the fund's name. The returned `entityId` is the required input value for this endpoint.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetPrivateEquityandVentureCapital.Api;
using FactSet.SDK.FactSetPrivateEquityandVentureCapital.Client;
using FactSet.SDK.FactSetPrivateEquityandVentureCapital.Model;

namespace Example
{
    public class GetFundPortfolioCompaniesExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetPrivateEquityandVentureCapital.Client.Configuration();

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

            var apiInstance = new FundsApi(config);

            var ids = new List<string>(); // List<string> | A list of FactSet Permanent Entity Identifiers (FactSet IDs) for **Private Equity and Venture Capital Funds**. These IDs are in the format 'XXXXXX-E' and are the primary input for most fund-related endpoints. These IDs can be retrieved from the /universe endpoint

            try
            {
                // Retrieve the list of portfolio companies held by specified Private Equity or Venture Capital Funds.
                FundPortfolioCompaniesResponse result = apiInstance.GetFundPortfolioCompanies(ids);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling FundsApi.GetFundPortfolioCompanies: " + e.Message );
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
 **ids** | [**List&lt;string&gt;**](string.md)| A list of FactSet Permanent Entity Identifiers (FactSet IDs) for **Private Equity and Venture Capital Funds**. These IDs are in the format &#39;XXXXXX-E&#39; and are the primary input for most fund-related endpoints. These IDs can be retrieved from the /universe endpoint | 

### Return type
[**FundPortfolioCompaniesResponse**](FundPortfolioCompaniesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that the Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


