# FactSet.SDK.ProposalGenerationEngine.Api.ExPostApi

All URIs are relative to *https://api.factset.com/analytics/engines/proposal-generation/v0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CalculateExPostCorrelationsStats**](ExPostApi.md#calculateexpostcorrelationsstats) | **POST** /portfolios/ex-post/stats/correlations | calculate portfolio vs benchmark correlation and correlation between portfolio holdings
[**CalculateExPostFactorExposureStats**](ExPostApi.md#calculateexpostfactorexposurestats) | **POST** /portfolios/ex-post/stats/factor-exposure | Create portfolio and return risk factor contribution
[**CalculateExPostRollingSeries**](ExPostApi.md#calculateexpostrollingseries) | **POST** /portfolios/ex-post/series/rolling | retrieve series of rolling stats for the portfolio
[**CalculateExPostRollingStats**](ExPostApi.md#calculateexpostrollingstats) | **POST** /portfolios/ex-post/stats/rolling | calculate rolling stats (for ex-post data)
[**CalculateExPostSeries**](ExPostApi.md#calculateexpostseries) | **POST** /portfolios/ex-post/series | retrieve portfolio and benchmark data series, generated from the underlying holdings data series
[**CalculateExPostStats**](ExPostApi.md#calculateexpoststats) | **POST** /portfolios/ex-post/stats | calculate ex-post stats (on portfolio or holdings level)



<a name="calculateexpostcorrelationsstats"></a>
# **CalculateExPostCorrelationsStats**
> ExPostStatsCorrelationsResponse CalculateExPostCorrelationsStats (ExPostStatsCorrelations exPostStatsCorrelations = null)

calculate portfolio vs benchmark correlation and correlation between portfolio holdings

Notes:<br> * id 'Cash proxy' can be used in order to set cash amount for the portfolio

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.ProposalGenerationEngine.Api;
using FactSet.SDK.ProposalGenerationEngine.Client;
using FactSet.SDK.ProposalGenerationEngine.Model;

namespace Example
{
    public class CalculateExPostCorrelationsStatsExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.ProposalGenerationEngine.Client.Configuration();

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

            var apiInstance = new ExPostApi(config);

            var exPostStatsCorrelations = new ExPostStatsCorrelations(); // ExPostStatsCorrelations |  (optional) 

            try
            {
                // calculate portfolio vs benchmark correlation and correlation between portfolio holdings
                ExPostStatsCorrelationsResponse result = apiInstance.CalculateExPostCorrelationsStats(exPostStatsCorrelations);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling ExPostApi.CalculateExPostCorrelationsStats: " + e.Message );
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
 **exPostStatsCorrelations** | [**ExPostStatsCorrelations**](ExPostStatsCorrelations.md)|  | [optional] 

### Return type
[**ExPostStatsCorrelationsResponse**](ExPostStatsCorrelationsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Status 200 |  -  |
| **501** | Server is unable to process your request |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="calculateexpostfactorexposurestats"></a>
# **CalculateExPostFactorExposureStats**
> ExPostStatsFactorExposureResponse CalculateExPostFactorExposureStats (ExPostStatsFactorExposure exPostStatsFactorExposure = null)

Create portfolio and return risk factor contribution

Ex-Post factor-exposure Stats

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.ProposalGenerationEngine.Api;
using FactSet.SDK.ProposalGenerationEngine.Client;
using FactSet.SDK.ProposalGenerationEngine.Model;

namespace Example
{
    public class CalculateExPostFactorExposureStatsExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.ProposalGenerationEngine.Client.Configuration();

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

            var apiInstance = new ExPostApi(config);

            var exPostStatsFactorExposure = new ExPostStatsFactorExposure(); // ExPostStatsFactorExposure |  (optional) 

            try
            {
                // Create portfolio and return risk factor contribution
                ExPostStatsFactorExposureResponse result = apiInstance.CalculateExPostFactorExposureStats(exPostStatsFactorExposure);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling ExPostApi.CalculateExPostFactorExposureStats: " + e.Message );
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
 **exPostStatsFactorExposure** | [**ExPostStatsFactorExposure**](ExPostStatsFactorExposure.md)|  | [optional] 

### Return type
[**ExPostStatsFactorExposureResponse**](ExPostStatsFactorExposureResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Status 200 |  -  |
| **501** | Server is unable to process your request |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="calculateexpostrollingseries"></a>
# **CalculateExPostRollingSeries**
> ExPostSeriesRollingResponse CalculateExPostRollingSeries (ExPostSeriesRolling exPostSeriesRolling = null)

retrieve series of rolling stats for the portfolio

Notes:<br> * id 'Cash proxy' can be used in order to set cash amount for the portfolio

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.ProposalGenerationEngine.Api;
using FactSet.SDK.ProposalGenerationEngine.Client;
using FactSet.SDK.ProposalGenerationEngine.Model;

namespace Example
{
    public class CalculateExPostRollingSeriesExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.ProposalGenerationEngine.Client.Configuration();

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

            var apiInstance = new ExPostApi(config);

            var exPostSeriesRolling = new ExPostSeriesRolling(); // ExPostSeriesRolling |  (optional) 

            try
            {
                // retrieve series of rolling stats for the portfolio
                ExPostSeriesRollingResponse result = apiInstance.CalculateExPostRollingSeries(exPostSeriesRolling);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling ExPostApi.CalculateExPostRollingSeries: " + e.Message );
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
 **exPostSeriesRolling** | [**ExPostSeriesRolling**](ExPostSeriesRolling.md)|  | [optional] 

### Return type
[**ExPostSeriesRollingResponse**](ExPostSeriesRollingResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Status 200 |  -  |
| **501** | Server is unable to process your request |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="calculateexpostrollingstats"></a>
# **CalculateExPostRollingStats**
> ExPostStatsRollingResponse CalculateExPostRollingStats (ExPostStatsRolling exPostStatsRolling = null)

calculate rolling stats (for ex-post data)

Notes:<br> * id 'Cash proxy' can be used in order to set cash amount for the portfolio

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.ProposalGenerationEngine.Api;
using FactSet.SDK.ProposalGenerationEngine.Client;
using FactSet.SDK.ProposalGenerationEngine.Model;

namespace Example
{
    public class CalculateExPostRollingStatsExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.ProposalGenerationEngine.Client.Configuration();

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

            var apiInstance = new ExPostApi(config);

            var exPostStatsRolling = new ExPostStatsRolling(); // ExPostStatsRolling |  (optional) 

            try
            {
                // calculate rolling stats (for ex-post data)
                ExPostStatsRollingResponse result = apiInstance.CalculateExPostRollingStats(exPostStatsRolling);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling ExPostApi.CalculateExPostRollingStats: " + e.Message );
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
 **exPostStatsRolling** | [**ExPostStatsRolling**](ExPostStatsRolling.md)|  | [optional] 

### Return type
[**ExPostStatsRollingResponse**](ExPostStatsRollingResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Status 200 |  -  |
| **501** | Server is unable to process your request |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="calculateexpostseries"></a>
# **CalculateExPostSeries**
> ExPostSeriesResponse CalculateExPostSeries (ExPostSeries exPostSeries = null)

retrieve portfolio and benchmark data series, generated from the underlying holdings data series

Notes:<br> * id 'Cash proxy' can be used in order to set cash amount for the portfolio

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.ProposalGenerationEngine.Api;
using FactSet.SDK.ProposalGenerationEngine.Client;
using FactSet.SDK.ProposalGenerationEngine.Model;

namespace Example
{
    public class CalculateExPostSeriesExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.ProposalGenerationEngine.Client.Configuration();

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

            var apiInstance = new ExPostApi(config);

            var exPostSeries = new ExPostSeries(); // ExPostSeries |  (optional) 

            try
            {
                // retrieve portfolio and benchmark data series, generated from the underlying holdings data series
                ExPostSeriesResponse result = apiInstance.CalculateExPostSeries(exPostSeries);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling ExPostApi.CalculateExPostSeries: " + e.Message );
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
 **exPostSeries** | [**ExPostSeries**](ExPostSeries.md)|  | [optional] 

### Return type
[**ExPostSeriesResponse**](ExPostSeriesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful request |  -  |
| **400** | Bad request |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="calculateexpoststats"></a>
# **CalculateExPostStats**
> ExPostStatsResponse CalculateExPostStats (ExPostStats exPostStats = null)

calculate ex-post stats (on portfolio or holdings level)

Notes:<br> * id 'Cash proxy' can be used in order to set cash amount for the portfolio

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.ProposalGenerationEngine.Api;
using FactSet.SDK.ProposalGenerationEngine.Client;
using FactSet.SDK.ProposalGenerationEngine.Model;

namespace Example
{
    public class CalculateExPostStatsExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.ProposalGenerationEngine.Client.Configuration();

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

            var apiInstance = new ExPostApi(config);

            var exPostStats = new ExPostStats(); // ExPostStats |  (optional) 

            try
            {
                // calculate ex-post stats (on portfolio or holdings level)
                ExPostStatsResponse result = apiInstance.CalculateExPostStats(exPostStats);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling ExPostApi.CalculateExPostStats: " + e.Message );
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
 **exPostStats** | [**ExPostStats**](ExPostStats.md)|  | [optional] 

### Return type
[**ExPostStatsResponse**](ExPostStatsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Status 200 |  -  |
| **400** | Bad request |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


