# FactSet.SDK.Cabot.Api.OverviewModelsApi

All URIs are relative to *https://api.factset.com/analytics/cabot/v0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetConstructionModelAnalytic**](OverviewModelsApi.md#getconstructionmodelanalytic) | **GET** /models/construction | Cabot main path for Construction API
[**GetHitRateModelAnalytic**](OverviewModelsApi.md#gethitratemodelanalytic) | **GET** /models/hit-rate | Cabot main path for Hit Rate API
[**GetResultsModelAnalytic**](OverviewModelsApi.md#getresultsmodelanalytic) | **GET** /models/results | Cabot main path for Results API
[**GetSkillsModelAnalytic**](OverviewModelsApi.md#getskillsmodelanalytic) | **GET** /models/skills | Cabot main path for Skills API



<a name="getconstructionmodelanalytic"></a>
# **GetConstructionModelAnalytic**
> ConstructionResponseRoot GetConstructionModelAnalytic (string accountPath, string benchmarkPath, string period)

Cabot main path for Construction API

Cabot main path for Construction API

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.Cabot.Api;
using FactSet.SDK.Cabot.Client;
using FactSet.SDK.Cabot.Model;

namespace Example
{
    public class GetConstructionModelAnalyticExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.Cabot.Client.Configuration();

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

            var apiInstance = new OverviewModelsApi(config);

            var accountPath = "accountPath_example";  // string | The account path of the portfolio you want to retrieve the data for.<br /><br />
            var benchmarkPath = "benchmarkPath_example";  // string | The path of the benchmark you want to retrieve the data for.<br /><br />
            var period = "2015-2017";  // string | For which period you want to retrieve the data.<br />There are four options available as follows:<br /><br />1 -> YYYY (Repeating One Year)<br /><br />2 -> YYYY-YYYY (Repeating Three/Five/Ten Year)<br /><br />3 -> 1M_TRAILING, 3M_TRAILING, 1Y_TRAILING, 3Y_TRAILING, 5Y_TRAILING (Trailing Periods (If available for your portfolio))<br /><br />4 -> INCEPTION_TO_DATE<br /><br />You can only get the data for one period per request.<br /><br />

            try
            {
                // Cabot main path for Construction API
                ConstructionResponseRoot result = apiInstance.GetConstructionModelAnalytic(accountPath, benchmarkPath, period);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling OverviewModelsApi.GetConstructionModelAnalytic: " + e.Message );
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
 **accountPath** | **string**| The account path of the portfolio you want to retrieve the data for.&lt;br /&gt;&lt;br /&gt; | 
 **benchmarkPath** | **string**| The path of the benchmark you want to retrieve the data for.&lt;br /&gt;&lt;br /&gt; | 
 **period** | **string**| For which period you want to retrieve the data.&lt;br /&gt;There are four options available as follows:&lt;br /&gt;&lt;br /&gt;1 -&gt; YYYY (Repeating One Year)&lt;br /&gt;&lt;br /&gt;2 -&gt; YYYY-YYYY (Repeating Three/Five/Ten Year)&lt;br /&gt;&lt;br /&gt;3 -&gt; 1M_TRAILING, 3M_TRAILING, 1Y_TRAILING, 3Y_TRAILING, 5Y_TRAILING (Trailing Periods (If available for your portfolio))&lt;br /&gt;&lt;br /&gt;4 -&gt; INCEPTION_TO_DATE&lt;br /&gt;&lt;br /&gt;You can only get the data for one period per request.&lt;br /&gt;&lt;br /&gt; | 

### Return type
[**ConstructionResponseRoot**](ConstructionResponseRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response. |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-RateLimit-Limit -  <br>  * X-FactSet-Api-RateLimit-Remaining -  <br>  * X-FactSet-Api-RateLimit-Reset -  <br>  * X-FactSet-Api-Request-Key -  <br>  |
| **400** | Bad request, invalid query parameters. |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-RateLimit-Limit -  <br>  * X-FactSet-Api-RateLimit-Remaining -  <br>  * X-FactSet-Api-RateLimit-Reset -  <br>  * X-FactSet-Api-Request-Key -  <br>  |
| **401** | Missing or invalid authentication. |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  |
| **403** | User is forbidden with current credentials. |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-RateLimit-Limit -  <br>  * X-FactSet-Api-RateLimit-Remaining -  <br>  * X-FactSet-Api-RateLimit-Reset -  <br>  * X-FactSet-Api-Request-Key -  <br>  |
| **404** | Path not found |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-RateLimit-Limit -  <br>  * X-FactSet-Api-RateLimit-Remaining -  <br>  * X-FactSet-Api-RateLimit-Reset -  <br>  * X-FactSet-Api-Request-Key -  <br>  |
| **408** | Request timeout. Retry the request in sometime. |  -  |
| **415** | Missing/Invalid Content-Type header. Header needs to be set to application/json. |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-RateLimit-Limit -  <br>  * X-FactSet-Api-RateLimit-Remaining -  <br>  * X-FactSet-Api-RateLimit-Reset -  <br>  * X-FactSet-Api-Request-Key -  <br>  |
| **429** | Rate limit reached. Wait till the time specified in Retry-After header value to make further requests. |  * Retry-After - Time to wait in seconds before making a new request as the rate limit has reached. <br>  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  |
| **500** | Server error. |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  |
| **503** | Request timed out. Retry the request in some time |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="gethitratemodelanalytic"></a>
# **GetHitRateModelAnalytic**
> HitRateResponseRoot GetHitRateModelAnalytic (string accountPath, string benchmarkPath, string period, Sectors sector, Regions region)

Cabot main path for Hit Rate API

Cabot main path for Hit Rate API

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.Cabot.Api;
using FactSet.SDK.Cabot.Client;
using FactSet.SDK.Cabot.Model;

namespace Example
{
    public class GetHitRateModelAnalyticExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.Cabot.Client.Configuration();

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

            var apiInstance = new OverviewModelsApi(config);

            var accountPath = "accountPath_example";  // string | The account path of the portfolio you want to retrieve the data for.<br /><br />
            var benchmarkPath = "benchmarkPath_example";  // string | The path of the benchmark you want to retrieve the data for.<br /><br />
            var period = "2015-2017";  // string | For which period you want to retrieve the data.<br />There are four options available as follows:<br /><br />1 -> YYYY (Repeating One Year)<br /><br />2 -> YYYY-YYYY (Repeating Three/Five/Ten Year)<br /><br />3 -> 1M_TRAILING, 3M_TRAILING, 1Y_TRAILING, 3Y_TRAILING, 5Y_TRAILING (Trailing Periods (If available for your portfolio))<br /><br />4 -> INCEPTION_TO_DATE<br /><br />You can only get the data for one period per request.<br /><br />
            var sector = (Sectors) "energy";  // Sectors | Sector represents the sector based on the company's industry breakdown.<br />You can choose which of them (if any) you want to see analytics for.<br /><br />
            var region = (Regions) "africa";  // Regions | Region of domicile represents the region based on the company's primary listing.<br />You can choose which of them (if any) you want to see analytics for.<br /><br />

            try
            {
                // Cabot main path for Hit Rate API
                HitRateResponseRoot result = apiInstance.GetHitRateModelAnalytic(accountPath, benchmarkPath, period, sector, region);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling OverviewModelsApi.GetHitRateModelAnalytic: " + e.Message );
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
 **accountPath** | **string**| The account path of the portfolio you want to retrieve the data for.&lt;br /&gt;&lt;br /&gt; | 
 **benchmarkPath** | **string**| The path of the benchmark you want to retrieve the data for.&lt;br /&gt;&lt;br /&gt; | 
 **period** | **string**| For which period you want to retrieve the data.&lt;br /&gt;There are four options available as follows:&lt;br /&gt;&lt;br /&gt;1 -&gt; YYYY (Repeating One Year)&lt;br /&gt;&lt;br /&gt;2 -&gt; YYYY-YYYY (Repeating Three/Five/Ten Year)&lt;br /&gt;&lt;br /&gt;3 -&gt; 1M_TRAILING, 3M_TRAILING, 1Y_TRAILING, 3Y_TRAILING, 5Y_TRAILING (Trailing Periods (If available for your portfolio))&lt;br /&gt;&lt;br /&gt;4 -&gt; INCEPTION_TO_DATE&lt;br /&gt;&lt;br /&gt;You can only get the data for one period per request.&lt;br /&gt;&lt;br /&gt; | 
 **sector** | **Sectors**| Sector represents the sector based on the company&#39;s industry breakdown.&lt;br /&gt;You can choose which of them (if any) you want to see analytics for.&lt;br /&gt;&lt;br /&gt; | 
 **region** | **Regions**| Region of domicile represents the region based on the company&#39;s primary listing.&lt;br /&gt;You can choose which of them (if any) you want to see analytics for.&lt;br /&gt;&lt;br /&gt; | 

### Return type
[**HitRateResponseRoot**](HitRateResponseRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response. |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-RateLimit-Limit -  <br>  * X-FactSet-Api-RateLimit-Remaining -  <br>  * X-FactSet-Api-RateLimit-Reset -  <br>  * X-FactSet-Api-Request-Key -  <br>  |
| **400** | Bad request, invalid query parameters. |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-RateLimit-Limit -  <br>  * X-FactSet-Api-RateLimit-Remaining -  <br>  * X-FactSet-Api-RateLimit-Reset -  <br>  * X-FactSet-Api-Request-Key -  <br>  |
| **401** | Missing or invalid authentication. |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  |
| **403** | User is forbidden with current credentials. |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-RateLimit-Limit -  <br>  * X-FactSet-Api-RateLimit-Remaining -  <br>  * X-FactSet-Api-RateLimit-Reset -  <br>  * X-FactSet-Api-Request-Key -  <br>  |
| **404** | Path not found |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-RateLimit-Limit -  <br>  * X-FactSet-Api-RateLimit-Remaining -  <br>  * X-FactSet-Api-RateLimit-Reset -  <br>  * X-FactSet-Api-Request-Key -  <br>  |
| **408** | Request timeout. Retry the request in sometime. |  -  |
| **415** | Missing/Invalid Content-Type header. Header needs to be set to application/json. |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-RateLimit-Limit -  <br>  * X-FactSet-Api-RateLimit-Remaining -  <br>  * X-FactSet-Api-RateLimit-Reset -  <br>  * X-FactSet-Api-Request-Key -  <br>  |
| **429** | Rate limit reached. Wait till the time specified in Retry-After header value to make further requests. |  * Retry-After - Time to wait in seconds before making a new request as the rate limit has reached. <br>  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  |
| **500** | Server error. |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  |
| **503** | Request timed out. Retry the request in some time |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getresultsmodelanalytic"></a>
# **GetResultsModelAnalytic**
> ResultsResponseRoot GetResultsModelAnalytic (string accountPath, string benchmarkPath, string period, Currency? currency = null)

Cabot main path for Results API

Cabot main path for Results API.     Describes portfolio returns in comparison to its benchmark. A positive value indicates excess returns while a negative value indicates underperformance.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.Cabot.Api;
using FactSet.SDK.Cabot.Client;
using FactSet.SDK.Cabot.Model;

namespace Example
{
    public class GetResultsModelAnalyticExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.Cabot.Client.Configuration();

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

            var apiInstance = new OverviewModelsApi(config);

            var accountPath = "accountPath_example";  // string | The account path of the portfolio you want to retrieve the data for.<br /><br />
            var benchmarkPath = "benchmarkPath_example";  // string | The path of the benchmark you want to retrieve the data for.<br /><br />
            var period = "2015-2017";  // string | For which period you want to retrieve the data.<br />There are four options available as follows:<br /><br />1 -> YYYY (Repeating One Year)<br /><br />2 -> YYYY-YYYY (Repeating Three/Five/Ten Year)<br /><br />3 -> 1M_TRAILING, 3M_TRAILING, 1Y_TRAILING, 3Y_TRAILING, 5Y_TRAILING (Trailing Periods (If available for your portfolio))<br /><br />4 -> INCEPTION_TO_DATE<br /><br />You can only get the data for one period per request.<br /><br />
            var currency = (Currency) "USD";  // Currency? | In which currency you want to see the data. By default the API uses USD.<br /><br /> (optional) 

            try
            {
                // Cabot main path for Results API
                ResultsResponseRoot result = apiInstance.GetResultsModelAnalytic(accountPath, benchmarkPath, period, currency);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling OverviewModelsApi.GetResultsModelAnalytic: " + e.Message );
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
 **accountPath** | **string**| The account path of the portfolio you want to retrieve the data for.&lt;br /&gt;&lt;br /&gt; | 
 **benchmarkPath** | **string**| The path of the benchmark you want to retrieve the data for.&lt;br /&gt;&lt;br /&gt; | 
 **period** | **string**| For which period you want to retrieve the data.&lt;br /&gt;There are four options available as follows:&lt;br /&gt;&lt;br /&gt;1 -&gt; YYYY (Repeating One Year)&lt;br /&gt;&lt;br /&gt;2 -&gt; YYYY-YYYY (Repeating Three/Five/Ten Year)&lt;br /&gt;&lt;br /&gt;3 -&gt; 1M_TRAILING, 3M_TRAILING, 1Y_TRAILING, 3Y_TRAILING, 5Y_TRAILING (Trailing Periods (If available for your portfolio))&lt;br /&gt;&lt;br /&gt;4 -&gt; INCEPTION_TO_DATE&lt;br /&gt;&lt;br /&gt;You can only get the data for one period per request.&lt;br /&gt;&lt;br /&gt; | 
 **currency** | **Currency?**| In which currency you want to see the data. By default the API uses USD.&lt;br /&gt;&lt;br /&gt; | [optional] 

### Return type
[**ResultsResponseRoot**](ResultsResponseRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response. |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-RateLimit-Limit -  <br>  * X-FactSet-Api-RateLimit-Remaining -  <br>  * X-FactSet-Api-RateLimit-Reset -  <br>  * X-FactSet-Api-Request-Key -  <br>  |
| **400** | Bad request, invalid query parameters. |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-RateLimit-Limit -  <br>  * X-FactSet-Api-RateLimit-Remaining -  <br>  * X-FactSet-Api-RateLimit-Reset -  <br>  * X-FactSet-Api-Request-Key -  <br>  |
| **401** | Missing or invalid authentication. |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  |
| **403** | User is forbidden with current credentials. |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-RateLimit-Limit -  <br>  * X-FactSet-Api-RateLimit-Remaining -  <br>  * X-FactSet-Api-RateLimit-Reset -  <br>  * X-FactSet-Api-Request-Key -  <br>  |
| **404** | Path not found |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-RateLimit-Limit -  <br>  * X-FactSet-Api-RateLimit-Remaining -  <br>  * X-FactSet-Api-RateLimit-Reset -  <br>  * X-FactSet-Api-Request-Key -  <br>  |
| **408** | Request timeout. Retry the request in sometime. |  -  |
| **415** | Missing/Invalid Content-Type header. Header needs to be set to application/json. |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-RateLimit-Limit -  <br>  * X-FactSet-Api-RateLimit-Remaining -  <br>  * X-FactSet-Api-RateLimit-Reset -  <br>  * X-FactSet-Api-Request-Key -  <br>  |
| **429** | Rate limit reached. Wait till the time specified in Retry-After header value to make further requests. |  * Retry-After - Time to wait in seconds before making a new request as the rate limit has reached. <br>  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  |
| **500** | Server error. |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  |
| **503** | Request timed out. Retry the request in some time |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getskillsmodelanalytic"></a>
# **GetSkillsModelAnalytic**
> SkillsResponseRoot GetSkillsModelAnalytic (string accountPath, string benchmarkPath, string period, Attributes? attribute = null, Sectors? sector = null, Regions? region = null, SkillsHoldings? holdings = null)

Cabot main path for Skills API

Cabot main path for Skills API

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.Cabot.Api;
using FactSet.SDK.Cabot.Client;
using FactSet.SDK.Cabot.Model;

namespace Example
{
    public class GetSkillsModelAnalyticExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.Cabot.Client.Configuration();

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

            var apiInstance = new OverviewModelsApi(config);

            var accountPath = "accountPath_example";  // string | The account path of the portfolio you want to retrieve the data for.
            var benchmarkPath = "BENCH:SP50";  // string | The path of the benchmark you want to retrieve the data for.<br /><br />
            var period = "period_example";  // string | For which period you want to retrieve the data.<br />There are four options available as follows:<br /><br />1 -> YYYY (Repeating One Year)<br /><br />2 -> YYYY-YYYY (Repeating Three/Five/Ten Year)<br /><br />3 -> 1M_TRAILING, 3M_TRAILING, 1Y_TRAILING, 3Y_TRAILING, 5Y_TRAILING (Trailing Periods (If available for your portfolio))<br /><br />4 -> INCEPTION_TO_DATE<br /><br />You can only get the data for one period per request.<br /><br />
            var attribute = (Attributes) "QFL_EY";  // Attributes? | The attribute represents the different factors.<br />You can choose which of them (if any) you want to see analytics for.<br /><br />If provided, the API response will contain both \"LOW\" and \"HIGH\" values for it.<br /><br /> (optional) 
            var sector = (Sectors) "energy";  // Sectors? | Sector represents the sector based on the company's industry breakdown.<br />You can choose which of them (if any) you want to see analytics for.<br /><br /> (optional) 
            var region = (Regions) "africa";  // Regions? | Region of domicile represents the region based on the company's primary listing.<br />You can choose which of them (if any) you want to see analytics for.<br /><br /> (optional) 
            var holdings = (SkillsHoldings) "all";  // SkillsHoldings? | If set, the API will add holding-level details for all or only the selected analytic (if available for your portfolio).<br /><br /> (optional) 

            try
            {
                // Cabot main path for Skills API
                SkillsResponseRoot result = apiInstance.GetSkillsModelAnalytic(accountPath, benchmarkPath, period, attribute, sector, region, holdings);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling OverviewModelsApi.GetSkillsModelAnalytic: " + e.Message );
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
 **accountPath** | **string**| The account path of the portfolio you want to retrieve the data for. | 
 **benchmarkPath** | **string**| The path of the benchmark you want to retrieve the data for.&lt;br /&gt;&lt;br /&gt; | 
 **period** | **string**| For which period you want to retrieve the data.&lt;br /&gt;There are four options available as follows:&lt;br /&gt;&lt;br /&gt;1 -&gt; YYYY (Repeating One Year)&lt;br /&gt;&lt;br /&gt;2 -&gt; YYYY-YYYY (Repeating Three/Five/Ten Year)&lt;br /&gt;&lt;br /&gt;3 -&gt; 1M_TRAILING, 3M_TRAILING, 1Y_TRAILING, 3Y_TRAILING, 5Y_TRAILING (Trailing Periods (If available for your portfolio))&lt;br /&gt;&lt;br /&gt;4 -&gt; INCEPTION_TO_DATE&lt;br /&gt;&lt;br /&gt;You can only get the data for one period per request.&lt;br /&gt;&lt;br /&gt; | 
 **attribute** | **Attributes?**| The attribute represents the different factors.&lt;br /&gt;You can choose which of them (if any) you want to see analytics for.&lt;br /&gt;&lt;br /&gt;If provided, the API response will contain both \&quot;LOW\&quot; and \&quot;HIGH\&quot; values for it.&lt;br /&gt;&lt;br /&gt; | [optional] 
 **sector** | **Sectors?**| Sector represents the sector based on the company&#39;s industry breakdown.&lt;br /&gt;You can choose which of them (if any) you want to see analytics for.&lt;br /&gt;&lt;br /&gt; | [optional] 
 **region** | **Regions?**| Region of domicile represents the region based on the company&#39;s primary listing.&lt;br /&gt;You can choose which of them (if any) you want to see analytics for.&lt;br /&gt;&lt;br /&gt; | [optional] 
 **holdings** | **SkillsHoldings?**| If set, the API will add holding-level details for all or only the selected analytic (if available for your portfolio).&lt;br /&gt;&lt;br /&gt; | [optional] 

### Return type
[**SkillsResponseRoot**](SkillsResponseRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response. |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-RateLimit-Limit -  <br>  * X-FactSet-Api-RateLimit-Remaining -  <br>  * X-FactSet-Api-RateLimit-Reset -  <br>  * X-FactSet-Api-Request-Key -  <br>  |
| **400** | Bad request, invalid query parameters. |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-RateLimit-Limit -  <br>  * X-FactSet-Api-RateLimit-Remaining -  <br>  * X-FactSet-Api-RateLimit-Reset -  <br>  * X-FactSet-Api-Request-Key -  <br>  |
| **401** | Missing or invalid authentication. |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  |
| **403** | User is forbidden with current credentials. |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-RateLimit-Limit -  <br>  * X-FactSet-Api-RateLimit-Remaining -  <br>  * X-FactSet-Api-RateLimit-Reset -  <br>  * X-FactSet-Api-Request-Key -  <br>  |
| **404** | Path not found |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-RateLimit-Limit -  <br>  * X-FactSet-Api-RateLimit-Remaining -  <br>  * X-FactSet-Api-RateLimit-Reset -  <br>  * X-FactSet-Api-Request-Key -  <br>  |
| **408** | Request timeout. Retry the request in sometime. |  -  |
| **415** | Missing/Invalid Content-Type header. Header needs to be set to application/json. |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-RateLimit-Limit -  <br>  * X-FactSet-Api-RateLimit-Remaining -  <br>  * X-FactSet-Api-RateLimit-Reset -  <br>  * X-FactSet-Api-Request-Key -  <br>  |
| **429** | Rate limit reached. Wait till the time specified in Retry-After header value to make further requests. |  * Retry-After - Time to wait in seconds before making a new request as the rate limit has reached. <br>  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  |
| **500** | Server error. |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  |
| **503** | Request timed out. Retry the request in some time |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


