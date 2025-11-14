# FactSet.SDK.BestExecutionAnalyticsforSmarterTradingBEAST.Api.OutliersApi

All URIs are relative to *https://api.factset.com/analytics/beast/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetOutlierMetricsByPercentile**](OutliersApi.md#getoutliermetricsbypercentile) | **GET** /tca/outlier/metrics-by-percentile | Get Outlier Metrics by percentile
[**GetOutlierMetricsStandard**](OutliersApi.md#getoutliermetricsstandard) | **GET** /tca/outlier/metrics-standard | Get Outlier Metrics by standard deviation



<a name="getoutliermetricsbypercentile"></a>
# **GetOutlierMetricsByPercentile**
> OutlierResponseRoot GetOutlierMetricsByPercentile (string metricType, DateTime startDate, DateTime endDate, string region = null, string trader = null, float? minPercent = null, float? maxPercent = null, int? binScalar = null)

Get Outlier Metrics by percentile

Get outlier metrics by the specified metric type, percentile and date range

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
    public class GetOutlierMetricsByPercentileExample
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

            var apiInstance = new OutliersApi(config);

            var metricType = "firstFillMidPerfBps";  // string | Metric type
            var startDate = DateTime.Parse("2024-08-21");  // DateTime | Date in the format YYYY-MM-DD
            var endDate = DateTime.Parse("2024-08-29");  // DateTime | Date in the format YYYY-MM-DD
            var region = "US";  // string | The two character ISO country code of the trading region. EMEA is used for the European trading region (optional) 
            var trader = "trader_example";  // string | Optionally specify a trader to filter by, Example : Ryan (optional) 
            var minPercent = 2.5F;  // float? | Min Percentile (optional)  (default to 2.5F)
            var maxPercent = 97.5F;  // float? | Max Percentile (optional)  (default to 97.5F)
            var binScalar = 51;  // int? | Bin Scalar (optional)  (default to 51)

            try
            {
                // Get Outlier Metrics by percentile
                OutlierResponseRoot result = apiInstance.GetOutlierMetricsByPercentile(metricType, startDate, endDate, region, trader, minPercent, maxPercent, binScalar);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling OutliersApi.GetOutlierMetricsByPercentile: " + e.Message );
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
 **metricType** | **string**| Metric type | 
 **startDate** | **DateTime**| Date in the format YYYY-MM-DD | 
 **endDate** | **DateTime**| Date in the format YYYY-MM-DD | 
 **region** | **string**| The two character ISO country code of the trading region. EMEA is used for the European trading region | [optional] 
 **trader** | **string**| Optionally specify a trader to filter by, Example : Ryan | [optional] 
 **minPercent** | **float?**| Min Percentile | [optional] [default to 2.5F]
 **maxPercent** | **float?**| Max Percentile | [optional] [default to 97.5F]
 **binScalar** | **int?**| Bin Scalar | [optional] [default to 51]

### Return type
[**OutlierResponseRoot**](OutlierResponseRoot.md)

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


<a name="getoutliermetricsstandard"></a>
# **GetOutlierMetricsStandard**
> OutlierResponseRoot GetOutlierMetricsStandard (string metricType, DateTime startDate, DateTime endDate, string region = null, string trader = null, float? deviation = null, int? binScalar = null)

Get Outlier Metrics by standard deviation

Get outlier metrics by the specified metric type and date range

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
    public class GetOutlierMetricsStandardExample
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

            var apiInstance = new OutliersApi(config);

            var metricType = "firstFillMidPerfBps";  // string | Metric type
            var startDate = DateTime.Parse("2024-08-21");  // DateTime | Date in the format YYYY-MM-DD
            var endDate = DateTime.Parse("2024-08-29");  // DateTime | Date in the format YYYY-MM-DD
            var region = "US";  // string | The two character ISO country code of the trading region. EMEA is used for the European trading region (optional) 
            var trader = "trader_example";  // string | Optionally specify a trader to filter by, Example : Ryan (optional) 
            var deviation = 2F;  // float? | Deviation (optional)  (default to 2F)
            var binScalar = 51;  // int? | Bin Scalar (optional)  (default to 51)

            try
            {
                // Get Outlier Metrics by standard deviation
                OutlierResponseRoot result = apiInstance.GetOutlierMetricsStandard(metricType, startDate, endDate, region, trader, deviation, binScalar);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling OutliersApi.GetOutlierMetricsStandard: " + e.Message );
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
 **metricType** | **string**| Metric type | 
 **startDate** | **DateTime**| Date in the format YYYY-MM-DD | 
 **endDate** | **DateTime**| Date in the format YYYY-MM-DD | 
 **region** | **string**| The two character ISO country code of the trading region. EMEA is used for the European trading region | [optional] 
 **trader** | **string**| Optionally specify a trader to filter by, Example : Ryan | [optional] 
 **deviation** | **float?**| Deviation | [optional] [default to 2F]
 **binScalar** | **int?**| Bin Scalar | [optional] [default to 51]

### Return type
[**OutlierResponseRoot**](OutlierResponseRoot.md)

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


