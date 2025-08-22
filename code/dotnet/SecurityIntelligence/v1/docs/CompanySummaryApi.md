# FactSet.SDK.SecurityIntelligence.Api.CompanySummaryApi

All URIs are relative to *https://api.factset.com/security-intelligence/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetCompanyDebtSummary**](CompanySummaryApi.md#getcompanydebtsummary) | **GET** /company/debt | Get Company Debt Summary
[**GetCompanyEvents**](CompanySummaryApi.md#getcompanyevents) | **GET** /company/events | Get Company Events
[**GetCompanyFinancialHighlights**](CompanySummaryApi.md#getcompanyfinancialhighlights) | **GET** /company/financials | Get Company Financial Highlights
[**GetCompanyMNASummary**](CompanySummaryApi.md#getcompanymnasummary) | **GET** /company/mna | Get Company M&amp;A Summary
[**GetCompanyOwnershipInsights**](CompanySummaryApi.md#getcompanyownershipinsights) | **GET** /company/ownership | Get Company Ownership Insights



<a name="getcompanydebtsummary"></a>
# **GetCompanyDebtSummary**
> DebtSummaryResponse GetCompanyDebtSummary (string identifier)

Get Company Debt Summary

Presents the company's Debt Capital Structure maturity data, analysis of Total Debt, and information on debt obligations due in the near term.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.SecurityIntelligence.Api;
using FactSet.SDK.SecurityIntelligence.Client;
using FactSet.SDK.SecurityIntelligence.Model;

namespace Example
{
    public class GetCompanyDebtSummaryExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.SecurityIntelligence.Client.Configuration();

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

            var apiInstance = new CompanySummaryApi(config);

            var identifier = "identifier_example";  // string | Ticker or FactSet Entity ID of the company

            try
            {
                // Get Company Debt Summary
                DebtSummaryResponse result = apiInstance.GetCompanyDebtSummary(identifier);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling CompanySummaryApi.GetCompanyDebtSummary: " + e.Message );
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
 **identifier** | **string**| Ticker or FactSet Entity ID of the company | 

### Return type
[**DebtSummaryResponse**](DebtSummaryResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with company data |  -  |
| **400** | Bad request |  -  |
| **401** | Authentication Failed |  -  |
| **500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getcompanyevents"></a>
# **GetCompanyEvents**
> EventsSummaryResponse GetCompanyEvents (string identifier)

Get Company Events

Returns a summary of company events including Dividends, Earnings Releases and Stock Splits spanning 7 days in the past and 60 days into the future.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.SecurityIntelligence.Api;
using FactSet.SDK.SecurityIntelligence.Client;
using FactSet.SDK.SecurityIntelligence.Model;

namespace Example
{
    public class GetCompanyEventsExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.SecurityIntelligence.Client.Configuration();

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

            var apiInstance = new CompanySummaryApi(config);

            var identifier = "identifier_example";  // string | Ticker or FactSet Entity ID of the company

            try
            {
                // Get Company Events
                EventsSummaryResponse result = apiInstance.GetCompanyEvents(identifier);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling CompanySummaryApi.GetCompanyEvents: " + e.Message );
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
 **identifier** | **string**| Ticker or FactSet Entity ID of the company | 

### Return type
[**EventsSummaryResponse**](EventsSummaryResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with company data |  -  |
| **400** | Bad request |  -  |
| **401** | Authentication Failed |  -  |
| **500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getcompanyfinancialhighlights"></a>
# **GetCompanyFinancialHighlights**
> FinancialHighlightsResponse GetCompanyFinancialHighlights (string identifier)

Get Company Financial Highlights

Provides comprehensive financial data including Income Statement, Cash Flow Statement, and Balance Sheet for the past 1.5 years.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.SecurityIntelligence.Api;
using FactSet.SDK.SecurityIntelligence.Client;
using FactSet.SDK.SecurityIntelligence.Model;

namespace Example
{
    public class GetCompanyFinancialHighlightsExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.SecurityIntelligence.Client.Configuration();

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

            var apiInstance = new CompanySummaryApi(config);

            var identifier = "identifier_example";  // string | Ticker or FactSet Entity ID of the company

            try
            {
                // Get Company Financial Highlights
                FinancialHighlightsResponse result = apiInstance.GetCompanyFinancialHighlights(identifier);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling CompanySummaryApi.GetCompanyFinancialHighlights: " + e.Message );
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
 **identifier** | **string**| Ticker or FactSet Entity ID of the company | 

### Return type
[**FinancialHighlightsResponse**](FinancialHighlightsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with company data |  -  |
| **400** | Bad request |  -  |
| **401** | Authentication Failed |  -  |
| **500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getcompanymnasummary"></a>
# **GetCompanyMNASummary**
> MnaSummaryResponse GetCompanyMNASummary (string identifier)

Get Company M&A Summary

Reports on Mergers and Acquisitions activity related to the company within the last 3 months.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.SecurityIntelligence.Api;
using FactSet.SDK.SecurityIntelligence.Client;
using FactSet.SDK.SecurityIntelligence.Model;

namespace Example
{
    public class GetCompanyMNASummaryExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.SecurityIntelligence.Client.Configuration();

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

            var apiInstance = new CompanySummaryApi(config);

            var identifier = "identifier_example";  // string | Ticker or FactSet Entity ID of the company

            try
            {
                // Get Company M&A Summary
                MnaSummaryResponse result = apiInstance.GetCompanyMNASummary(identifier);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling CompanySummaryApi.GetCompanyMNASummary: " + e.Message );
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
 **identifier** | **string**| Ticker or FactSet Entity ID of the company | 

### Return type
[**MnaSummaryResponse**](MnaSummaryResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with company data |  -  |
| **400** | Bad request |  -  |
| **401** | Authentication Failed |  -  |
| **500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getcompanyownershipinsights"></a>
# **GetCompanyOwnershipInsights**
> OwnershipInsightsResponse GetCompanyOwnershipInsights (string identifier)

Get Company Ownership Insights

Provides information on any activists targeting the company, and highlights the largest ownership position changes over the last 6 months.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.SecurityIntelligence.Api;
using FactSet.SDK.SecurityIntelligence.Client;
using FactSet.SDK.SecurityIntelligence.Model;

namespace Example
{
    public class GetCompanyOwnershipInsightsExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.SecurityIntelligence.Client.Configuration();

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

            var apiInstance = new CompanySummaryApi(config);

            var identifier = "identifier_example";  // string | Ticker or FactSet Entity ID of the company

            try
            {
                // Get Company Ownership Insights
                OwnershipInsightsResponse result = apiInstance.GetCompanyOwnershipInsights(identifier);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling CompanySummaryApi.GetCompanyOwnershipInsights: " + e.Message );
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
 **identifier** | **string**| Ticker or FactSet Entity ID of the company | 

### Return type
[**OwnershipInsightsResponse**](OwnershipInsightsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with company data |  -  |
| **400** | Bad request |  -  |
| **401** | Authentication Failed |  -  |
| **500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


