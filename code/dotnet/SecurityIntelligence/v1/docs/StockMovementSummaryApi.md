# FactSet.SDK.SecurityIntelligence.Api.StockMovementSummaryApi

All URIs are relative to *https://api.factset.com/security-intelligence/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetStockMovementSummary**](StockMovementSummaryApi.md#getstockmovementsummary) | **GET** /company/stock-movement-summary | Get Stock Movement Summary



<a name="getstockmovementsummary"></a>
# **GetStockMovementSummary**
> StockMovementResponse GetStockMovementSummary (string identifier, string outputType = null)

Get Stock Movement Summary

Returns the stock price movement over the last trading period or intraday, and aims to explain that movement using StreetAccount news over the last two trading days.

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
    public class GetStockMovementSummaryExample
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

            var apiInstance = new StockMovementSummaryApi(config);

            var identifier = "identifier_example";  // string | Ticker or FactSet Entity ID of the company
            var outputType = "default";  // string | Type of output to return. default for full summary and oneline for one-line summary. (optional)  (default to default)

            try
            {
                // Get Stock Movement Summary
                StockMovementResponse result = apiInstance.GetStockMovementSummary(identifier, outputType);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling StockMovementSummaryApi.GetStockMovementSummary: " + e.Message );
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
 **outputType** | **string**| Type of output to return. default for full summary and oneline for one-line summary. | [optional] [default to default]

### Return type
[**StockMovementResponse**](StockMovementResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with stock movement data |  -  |
| **400** | Bad request |  -  |
| **401** | Authentication Failed |  -  |
| **500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


