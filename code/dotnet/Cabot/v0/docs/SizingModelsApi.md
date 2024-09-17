# FactSet.SDK.Cabot.Api.SizingModelsApi

All URIs are relative to *https://api.factset.com/analytics/cabot/v0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetAddTrimModelAnalytic**](SizingModelsApi.md#getaddtrimmodelanalytic) | **GET** /models/add-trim | Cabot main path for Add Trim API
[**GetRampDownModelAnalytic**](SizingModelsApi.md#getrampdownmodelanalytic) | **GET** /models/ramp-down | Cabot main path for Ramp Down API
[**GetRampUpModelAnalytic**](SizingModelsApi.md#getrampupmodelanalytic) | **GET** /models/ramp-up | Cabot main path for Ramp Up API



<a name="getaddtrimmodelanalytic"></a>
# **GetAddTrimModelAnalytic**
> AddTrimResponseRoot GetAddTrimModelAnalytic (string accountPath, string benchmarkPath, string period, Attributes? attribute = null, Sectors? sector = null, Regions? region = null)

Cabot main path for Add Trim API

Cabot main path for Add Trim API

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
    public class GetAddTrimModelAnalyticExample
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

            var apiInstance = new SizingModelsApi(config);

            var accountPath = "accountPath_example";  // string | The account path of the portfolio you want to retrieve the data for.<br /><br />
            var benchmarkPath = "benchmarkPath_example";  // string | The path of the benchmark you want to retrieve the data for.<br /><br />
            var period = "2015-2017";  // string | For which period you want to retrieve the data.<br />There are four options available as follows:<br /><br />1 -> YYYY (Repeating One Year)<br /><br />2 -> YYYY-YYYY (Repeating Three/Five/Ten Year)<br /><br />3 -> 1M_TRAILING, 3M_TRAILING, 1Y_TRAILING, 3Y_TRAILING, 5Y_TRAILING (Trailing Periods (If available for your portfolio))<br /><br />4 -> INCEPTION_TO_DATE<br /><br />You can only get the data for one period per request.<br /><br />
            var attribute = (Attributes) "QFL_EY";  // Attributes? | The attribute represents the different factors.<br />You can choose which of them (if any) you want to see analytics for.<br /><br />If provided, the API response will contain both \"LOW\" and \"HIGH\" values for it.<br /><br /> (optional) 
            var sector = (Sectors) "energy";  // Sectors? | Sector represents the sector based on the company's industry breakdown.<br />You can choose which of them (if any) you want to see analytics for.<br /><br /> (optional) 
            var region = (Regions) "africa";  // Regions? | Region of domicile represents the region based on the company's primary listing.<br />You can choose which of them (if any) you want to see analytics for.<br /><br /> (optional) 

            try
            {
                // Cabot main path for Add Trim API
                AddTrimResponseRoot result = apiInstance.GetAddTrimModelAnalytic(accountPath, benchmarkPath, period, attribute, sector, region);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling SizingModelsApi.GetAddTrimModelAnalytic: " + e.Message );
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
 **attribute** | **Attributes?**| The attribute represents the different factors.&lt;br /&gt;You can choose which of them (if any) you want to see analytics for.&lt;br /&gt;&lt;br /&gt;If provided, the API response will contain both \&quot;LOW\&quot; and \&quot;HIGH\&quot; values for it.&lt;br /&gt;&lt;br /&gt; | [optional] 
 **sector** | **Sectors?**| Sector represents the sector based on the company&#39;s industry breakdown.&lt;br /&gt;You can choose which of them (if any) you want to see analytics for.&lt;br /&gt;&lt;br /&gt; | [optional] 
 **region** | **Regions?**| Region of domicile represents the region based on the company&#39;s primary listing.&lt;br /&gt;You can choose which of them (if any) you want to see analytics for.&lt;br /&gt;&lt;br /&gt; | [optional] 

### Return type
[**AddTrimResponseRoot**](AddTrimResponseRoot.md)

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


<a name="getrampdownmodelanalytic"></a>
# **GetRampDownModelAnalytic**
> RampDownResponseRoot GetRampDownModelAnalytic (string accountPath, string benchmarkPath, string period, Attributes? attribute = null, Sectors? sector = null, Regions? region = null)

Cabot main path for Ramp Down API

Cabot main path for Ramp Down API

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
    public class GetRampDownModelAnalyticExample
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

            var apiInstance = new SizingModelsApi(config);

            var accountPath = "accountPath_example";  // string | The account path of the portfolio you want to retrieve the data for.<br /><br />
            var benchmarkPath = "benchmarkPath_example";  // string | The path of the benchmark you want to retrieve the data for.<br /><br />
            var period = "2015-2017";  // string | For which period you want to retrieve the data.<br />There are four options available as follows:<br /><br />1 -> YYYY (Repeating One Year)<br /><br />2 -> YYYY-YYYY (Repeating Three/Five/Ten Year)<br /><br />3 -> 1M_TRAILING, 3M_TRAILING, 1Y_TRAILING, 3Y_TRAILING, 5Y_TRAILING (Trailing Periods (If available for your portfolio))<br /><br />4 -> INCEPTION_TO_DATE<br /><br />You can only get the data for one period per request.<br /><br />
            var attribute = (Attributes) "QFL_EY";  // Attributes? | The attribute represents the different factors.<br />You can choose which of them (if any) you want to see analytics for.<br /><br />If provided, the API response will contain both \"LOW\" and \"HIGH\" values for it.<br /><br /> (optional) 
            var sector = (Sectors) "energy";  // Sectors? | Sector represents the sector based on the company's industry breakdown.<br />You can choose which of them (if any) you want to see analytics for.<br /><br /> (optional) 
            var region = (Regions) "africa";  // Regions? | Region of domicile represents the region based on the company's primary listing.<br />You can choose which of them (if any) you want to see analytics for.<br /><br /> (optional) 

            try
            {
                // Cabot main path for Ramp Down API
                RampDownResponseRoot result = apiInstance.GetRampDownModelAnalytic(accountPath, benchmarkPath, period, attribute, sector, region);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling SizingModelsApi.GetRampDownModelAnalytic: " + e.Message );
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
 **attribute** | **Attributes?**| The attribute represents the different factors.&lt;br /&gt;You can choose which of them (if any) you want to see analytics for.&lt;br /&gt;&lt;br /&gt;If provided, the API response will contain both \&quot;LOW\&quot; and \&quot;HIGH\&quot; values for it.&lt;br /&gt;&lt;br /&gt; | [optional] 
 **sector** | **Sectors?**| Sector represents the sector based on the company&#39;s industry breakdown.&lt;br /&gt;You can choose which of them (if any) you want to see analytics for.&lt;br /&gt;&lt;br /&gt; | [optional] 
 **region** | **Regions?**| Region of domicile represents the region based on the company&#39;s primary listing.&lt;br /&gt;You can choose which of them (if any) you want to see analytics for.&lt;br /&gt;&lt;br /&gt; | [optional] 

### Return type
[**RampDownResponseRoot**](RampDownResponseRoot.md)

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


<a name="getrampupmodelanalytic"></a>
# **GetRampUpModelAnalytic**
> RampUpResponseRoot GetRampUpModelAnalytic (string accountPath, string benchmarkPath, string period, Attributes? attribute = null, Sectors? sector = null, Regions? region = null)

Cabot main path for Ramp Up API

Cabot main path for Ramp Up API

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
    public class GetRampUpModelAnalyticExample
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

            var apiInstance = new SizingModelsApi(config);

            var accountPath = "accountPath_example";  // string | The account path of the portfolio you want to retrieve the data for.<br /><br />
            var benchmarkPath = "benchmarkPath_example";  // string | The path of the benchmark you want to retrieve the data for.<br /><br />
            var period = "2015-2017";  // string | For which period you want to retrieve the data.<br />There are four options available as follows:<br /><br />1 -> YYYY (Repeating One Year)<br /><br />2 -> YYYY-YYYY (Repeating Three/Five/Ten Year)<br /><br />3 -> 1M_TRAILING, 3M_TRAILING, 1Y_TRAILING, 3Y_TRAILING, 5Y_TRAILING (Trailing Periods (If available for your portfolio))<br /><br />4 -> INCEPTION_TO_DATE<br /><br />You can only get the data for one period per request.<br /><br />
            var attribute = (Attributes) "QFL_EY";  // Attributes? | The attribute represents the different factors.<br />You can choose which of them (if any) you want to see analytics for.<br /><br />If provided, the API response will contain both \"LOW\" and \"HIGH\" values for it.<br /><br /> (optional) 
            var sector = (Sectors) "energy";  // Sectors? | Sector represents the sector based on the company's industry breakdown.<br />You can choose which of them (if any) you want to see analytics for.<br /><br /> (optional) 
            var region = (Regions) "africa";  // Regions? | Region of domicile represents the region based on the company's primary listing.<br />You can choose which of them (if any) you want to see analytics for.<br /><br /> (optional) 

            try
            {
                // Cabot main path for Ramp Up API
                RampUpResponseRoot result = apiInstance.GetRampUpModelAnalytic(accountPath, benchmarkPath, period, attribute, sector, region);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling SizingModelsApi.GetRampUpModelAnalytic: " + e.Message );
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
 **attribute** | **Attributes?**| The attribute represents the different factors.&lt;br /&gt;You can choose which of them (if any) you want to see analytics for.&lt;br /&gt;&lt;br /&gt;If provided, the API response will contain both \&quot;LOW\&quot; and \&quot;HIGH\&quot; values for it.&lt;br /&gt;&lt;br /&gt; | [optional] 
 **sector** | **Sectors?**| Sector represents the sector based on the company&#39;s industry breakdown.&lt;br /&gt;You can choose which of them (if any) you want to see analytics for.&lt;br /&gt;&lt;br /&gt; | [optional] 
 **region** | **Regions?**| Region of domicile represents the region based on the company&#39;s primary listing.&lt;br /&gt;You can choose which of them (if any) you want to see analytics for.&lt;br /&gt;&lt;br /&gt; | [optional] 

### Return type
[**RampUpResponseRoot**](RampUpResponseRoot.md)

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


