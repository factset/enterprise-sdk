# FactSet.SDK.BestExecutionAnalyticsforSmarterTradingBEAST.Api.MarketImpactApi

All URIs are relative to *https://api.factset.com/analytics/beast/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetCostImpactV3**](MarketImpactApi.md#getcostimpactv3) | **GET** /tca/market-impact/cost-impact | Get Cost Impact



<a name="getcostimpactv3"></a>
# **GetCostImpactV3**
> CostImpactResponseRootV3 GetCostImpactV3 (string securityId, string orderVolume, string country = null, string currency = null, string strategy = null, List<string> riskAversion = null, DateTime? date = null, string startTime = null, string endTime = null, bool? isMomentum = null, string side = null, bool? peer = null, float? frontLoadHalfLife = null, float? rearLoadHalfLife = null, float? rearRatio = null, bool? binsData = null)

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
    public class GetCostImpactV3Example
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

            var securityId = "FDS";  // string | ISIN for European or India securities, otherwise TICKER. Works together with country and currency parameters.
            var orderVolume = "1000";  // string | Order Volume in scientific notation or float format. Example: 1000 or 1.234567e4.
            var country = "US";  // string | The two character ISO country code of the trading region, like US. EMEA is used for the European trading region (optional) 
            var currency = "USD";  // string | The ISO 4217 currency code (optional) 
            var strategy = "strategy_example";  // string | Specify the strategy, choices are: Optimal, VWAP, TWAP, Custom (optional) 
            var riskAversion = new List<string>(); // List<string> | Input risk tolerance from passive to very aggressive (optional) 
            var date = DateTime.Parse("2024-08-29");  // DateTime? | Date in the format YYYY-MM-DD (optional) 
            var startTime = "10:00";  // string | Start Time in the format HH:MM (optional) 
            var endTime = "15:00";  // string | End Time in the format HH:MM (optional) 
            var isMomentum = false;  // bool? | Flag to apply stock momentum. Specify true to include momentum (optional) 
            var side = "side_example";  // string | Indicate whether a buyer or seller. Only applies when isMomentum is true. Example: Buy or Sell (optional) 
            var peer = false;  // bool? | Flag to apply peer calibration. Specify true to include peer calibration (optional) 
            var frontLoadHalfLife = 1000F;  // float? | Speeds up early execution (optional) 
            var rearLoadHalfLife = 0F;  // float? | Delays orders towards end of the trading day (optional) 
            var rearRatio = 1F;  // float? | Adjusts weighting of final execution (optional) 
            var binsData = true;  // bool? | Flag to apply BinsData. Specify true to include BinsData (optional)  (default to true)

            try
            {
                // Get Cost Impact
                CostImpactResponseRootV3 result = apiInstance.GetCostImpactV3(securityId, orderVolume, country, currency, strategy, riskAversion, date, startTime, endTime, isMomentum, side, peer, frontLoadHalfLife, rearLoadHalfLife, rearRatio, binsData);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling MarketImpactApi.GetCostImpactV3: " + e.Message );
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
 **securityId** | **string**| ISIN for European or India securities, otherwise TICKER. Works together with country and currency parameters. | 
 **orderVolume** | **string**| Order Volume in scientific notation or float format. Example: 1000 or 1.234567e4. | 
 **country** | **string**| The two character ISO country code of the trading region, like US. EMEA is used for the European trading region | [optional] 
 **currency** | **string**| The ISO 4217 currency code | [optional] 
 **strategy** | **string**| Specify the strategy, choices are: Optimal, VWAP, TWAP, Custom | [optional] 
 **riskAversion** | [**List&lt;string&gt;**](string.md)| Input risk tolerance from passive to very aggressive | [optional] 
 **date** | **DateTime?**| Date in the format YYYY-MM-DD | [optional] 
 **startTime** | **string**| Start Time in the format HH:MM | [optional] 
 **endTime** | **string**| End Time in the format HH:MM | [optional] 
 **isMomentum** | **bool?**| Flag to apply stock momentum. Specify true to include momentum | [optional] 
 **side** | **string**| Indicate whether a buyer or seller. Only applies when isMomentum is true. Example: Buy or Sell | [optional] 
 **peer** | **bool?**| Flag to apply peer calibration. Specify true to include peer calibration | [optional] 
 **frontLoadHalfLife** | **float?**| Speeds up early execution | [optional] 
 **rearLoadHalfLife** | **float?**| Delays orders towards end of the trading day | [optional] 
 **rearRatio** | **float?**| Adjusts weighting of final execution | [optional] 
 **binsData** | **bool?**| Flag to apply BinsData. Specify true to include BinsData | [optional] [default to true]

### Return type
[**CostImpactResponseRootV3**](CostImpactResponseRootV3.md)

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


