# FactSet.SDK.BestExecutionAnalyticsforSmarterTradingBEAST.Api.MarketImpactApi

All URIs are relative to *https://api.factset.com/analytics/beast/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetCostImpact**](MarketImpactApi.md#getcostimpact) | **GET** /tca/market-impact/cost-impact | Get Cost Impact



<a name="getcostimpact"></a>
# **GetCostImpact**
> CostImpactResponseRoot GetCostImpact (string securityId, string region, string currency, float orderVolume, string strategy = null, string date = null, string isin = null, string startTime = null, string endTime = null, float? frontLoadHalfLife = null, float? rearLoadHalfLife = null, float? rearRatio = null, float? riskAversion = null, bool? applyMomentum = null, string side = null)

Get Cost Impact

Get Cost Impact

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.BestExecutionAnalyticsforSmarterTradingBEAST.Api;
using FactSet.SDK.BestExecutionAnalyticsforSmarterTradingBEAST.Client;
using FactSet.SDK.BestExecutionAnalyticsforSmarterTradingBEAST.Model;

namespace Example
{
    public class GetCostImpactExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.BestExecutionAnalyticsforSmarterTradingBEAST.Client.Configuration();

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

            var apiInstance = new MarketImpactApi(config);

            var securityId = "FDS-US";  // string | ISIN for European securities, otherwise TICKER
            var region = "US";  // string | The two character ISO country code of the trading region. EMEA is used for the European trading region
            var currency = "USD";  // string | The ISO 4217 currency code
            var orderVolume = 100000F;  // float | Order Volume
            var strategy = "vwap";  // string | Specify the strategy, choices are: Optimal, VWAP, TWAP, Custom (optional) 
            var date = "2024-08-29";  // string | Date in the format YYYY-MM-DD (optional) 
            var isin = "isin_example";  // string | International securities identification number (optional) 
            var startTime = "10:00:00";  // string | Start Time in the format HH:MM:SS (optional) 
            var endTime = "15:00:00";  // string | End Time in the format HH:MM:SS (optional) 
            var frontLoadHalfLife = 1000F;  // float? | Front Load Half Life (optional) 
            var rearLoadHalfLife = 0F;  // float? | Rear Load Half Life (optional) 
            var rearRatio = 1F;  // float? | Rear Ratio (optional) 
            var riskAversion = 0.3F;  // float? | Risk Aversion (optional) 
            var applyMomentum = false;  // bool? | Flag to apply stock momentum. Specify true to include momentum (optional) 
            var side = "side_example";  // string | Indicate whether a buyer or seller. Only applies when applyMomentum is true. Example: Buy or Sell. (optional) 

            try
            {
                // Get Cost Impact
                CostImpactResponseRoot result = apiInstance.GetCostImpact(securityId, region, currency, orderVolume, strategy, date, isin, startTime, endTime, frontLoadHalfLife, rearLoadHalfLife, rearRatio, riskAversion, applyMomentum, side);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling MarketImpactApi.GetCostImpact: " + e.Message );
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
 **securityId** | **string**| ISIN for European securities, otherwise TICKER | 
 **region** | **string**| The two character ISO country code of the trading region. EMEA is used for the European trading region | 
 **currency** | **string**| The ISO 4217 currency code | 
 **orderVolume** | **float**| Order Volume | 
 **strategy** | **string**| Specify the strategy, choices are: Optimal, VWAP, TWAP, Custom | [optional] 
 **date** | **string**| Date in the format YYYY-MM-DD | [optional] 
 **isin** | **string**| International securities identification number | [optional] 
 **startTime** | **string**| Start Time in the format HH:MM:SS | [optional] 
 **endTime** | **string**| End Time in the format HH:MM:SS | [optional] 
 **frontLoadHalfLife** | **float?**| Front Load Half Life | [optional] 
 **rearLoadHalfLife** | **float?**| Rear Load Half Life | [optional] 
 **rearRatio** | **float?**| Rear Ratio | [optional] 
 **riskAversion** | **float?**| Risk Aversion | [optional] 
 **applyMomentum** | **bool?**| Flag to apply stock momentum. Specify true to include momentum | [optional] 
 **side** | **string**| Indicate whether a buyer or seller. Only applies when applyMomentum is true. Example: Buy or Sell. | [optional] 

### Return type
[**CostImpactResponseRoot**](CostImpactResponseRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Expected response. |  * X-DataDirect-Request-Key - FactSet request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify the API request. Only available after successful authentication. <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Reset - Number of seconds remaining until the rate limit resets. <br>  |
| **400** | Invalid query parameters. |  * X-DataDirect-Request-Key - FactSet request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify the API request. Only available after successful authentication. <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Reset - Number of seconds remaining until the rate limit resets. <br>  |
| **401** | Missing or invalid authentication. |  * X-DataDirect-Request-Key - FactSet request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify the API request. Only available after successful authentication. <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Reset - Number of seconds remaining until the rate limit resets. <br>  |
| **403** | User is forbidden with current credentials. |  * X-DataDirect-Request-Key - FactSet request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify the API request. Only available after successful authentication. <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Reset - Number of seconds remaining until the rate limit resets. <br>  |
| **429** | Rate limit reached. Retry the requests after waiting the time specified in the Retry-After header. |  * X-DataDirect-Request-Key - FactSet request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify the API request. Only available after successful authentication. <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Reset - Number of seconds remaining until the rate limit resets. <br>  * Retry-After - Time to wait in seconds before making a new request as the rate limit has been reached. <br>  |
| **500** | Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting. |  * X-DataDirect-Request-Key - FactSet request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify the API request. Only available after successful authentication. <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Reset - Number of seconds remaining until the rate limit resets. <br>  |
| **503** | Request timed out. |  * X-DataDirect-Request-Key - FactSet request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify the API request. Only available after successful authentication. <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Reset - Number of seconds remaining until the rate limit resets. <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


