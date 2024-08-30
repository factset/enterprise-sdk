# FactSet.SDK.ChartGenerationService.Api.ChartTemplatesApi

All URIs are relative to *https://api.factset.com/charting/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetCategoryList**](ChartTemplatesApi.md#getcategorylist) | **GET** /catalog/categories | Get a list of chart categories
[**GetChartList**](ChartTemplatesApi.md#getchartlist) | **GET** /catalog/charts | Get a list of chart templates that can be used for getting the image from the service.
[**Images**](ChartTemplatesApi.md#images) | **GET** /image | Get chart image back in PNG or JPEG formats



<a name="getcategorylist"></a>
# **GetCategoryList**
> List&lt;string&gt; GetCategoryList ()

Get a list of chart categories

Retrieve a list of all chart categories with getCategoryList() API call.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.ChartGenerationService.Api;
using FactSet.SDK.ChartGenerationService.Client;
using FactSet.SDK.ChartGenerationService.Model;

namespace Example
{
    public class GetCategoryListExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.ChartGenerationService.Client.Configuration();

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

            var apiInstance = new ChartTemplatesApi(config);


            try
            {
                // Get a list of chart categories
                List<string> result = apiInstance.GetCategoryList();
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling ChartTemplatesApi.GetCategoryList: " + e.Message );
                Console.WriteLine("Status Code: "+ e.ErrorCode);
                Console.WriteLine(e.StackTrace);
            }
        }
    }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type
**List<string>**

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Input |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getchartlist"></a>
# **GetChartList**
> List&lt;CategoryChartListErrorObject&gt; GetChartList (string categories = null)

Get a list of chart templates that can be used for getting the image from the service.

You can get all the charts present or can just get the information by categories. The response includes the name of the chart, description, tags and any additional input specific to that chart. Use the information from this response to determine what charts you want and get its image from /images endpoint. Additionally you can also get back a auto generated PDF for the categories you requested for.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.ChartGenerationService.Api;
using FactSet.SDK.ChartGenerationService.Client;
using FactSet.SDK.ChartGenerationService.Model;

namespace Example
{
    public class GetChartListExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.ChartGenerationService.Client.Configuration();

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

            var apiInstance = new ChartTemplatesApi(config);

            var categories = "categories_example";  // string | A comma delimited string of catgory names to limit the response to certain categories. If nothing is provided, all charts under every category would be listed out. (optional) 

            try
            {
                // Get a list of chart templates that can be used for getting the image from the service.
                List<CategoryChartListErrorObject> result = apiInstance.GetChartList(categories);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling ChartTemplatesApi.GetChartList: " + e.Message );
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
 **categories** | **string**| A comma delimited string of catgory names to limit the response to certain categories. If nothing is provided, all charts under every category would be listed out. | [optional] 

### Return type
[**List&lt;CategoryChartListErrorObject&gt;**](CategoryChartListErrorObject.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Input |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="images"></a>
# **Images**
> System.IO.Stream Images (string chart, string ids = null, string sd = null, string ed = null, long? width = null, long? height = null, string freq = null, string ccy = null, string split = null, decimal? spin = null, string cal = null, string title = null, decimal? fontSize = null, string type = null, bool? gridLines = null, decimal? decimalPrecision = null)

Get chart image back in PNG or JPEG formats

Get a chart image in PNG or JPEG formats with the images() API call.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.ChartGenerationService.Api;
using FactSet.SDK.ChartGenerationService.Client;
using FactSet.SDK.ChartGenerationService.Model;

namespace Example
{
    public class ImagesExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.ChartGenerationService.Client.Configuration();

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

            var apiInstance = new ChartTemplatesApi(config);

            var chart = "Equity/RSI";  // string | Path to the saved chart. For any of the default charts, the option should be `categoryName + '/' + chartName`. For charts under the Client or Personal directories, the option should be `directoryName + ':/' + pathTotheChart`.  
            var ids = "FDS,AAPL";  // string | List of identifiers to be charted in a comma(,) separated string. Only the first one would be considered as primary and rest would be added as comps. Check the catalog for more information on which charts require a ticker. (optional) 
            var sd = "-1Y";  // string | Option for overriding the startDate of the chart.  #### Absolute Dates  For absolute dates, provide a string in `YYYYMMDD` format.  #### Relative Dates  Relative dates represent a date relative to the most recently-updated period. For example, 0 (zero) represents the most recently-updated period; -1 represents the time period prior to the most recently updated.\\ \\ The \"zero date\" is determined by the default time period or the natural frequency of the data being requested. Zero (0), when used with monthly data, indicates the most recent month-end. Negative one (-1), when used with annual data, indicates one fiscal year prior to the most recently-updated fiscal year.  #### Relative Date Options  **D:** `0D` is the most recent trading day, `-1D` is one trading day prior  **M:** `0M` is the last trading day of the most recent month, `-1M` is the last trading day of the prior month  **AY:** `0AY` is the most recent trading day, `-1AY` is one actual year (365 days) prior  **Y:** `0Y` is the last trading day of the company's most recent fiscal year, `-1Y` is the last trading day of the prior fiscal year\\ \\ For more information and examples, refer to our [date format documentation](https://my.apps.factset.com/oa/pages/1964#date_f). (optional) 
            var ed = "0";  // string | Option for overriding the endDate of the chart. For absolute dates provide a string in `YYYYMMDD` format. We can also specify relative date options as described in the above `sd` option. (optional) 
            var width = 1056L;  // long? | Option for setting the width of the image (optional)  (default to 1056)
            var height = 816L;  // long? | Option for setting the height of the image (optional)  (default to 816)
            var freq = "D";  // string | A shorthand string for the overall frequency of the chart like `D` (daily), `W` (weekly), `Y` (yearly) and `Q` (Quarterly). This will default to frequency stored in the document. (optional) 
            var ccy = "USD";  // string | Currency ISO code for the overall currency of the chart. The API doesn't allow per series currency at this point in time. (optional) 
            var split = "SPLIT";  // string | Option to specify the splits adjustment (optional) 
            var spin = 0D;  // decimal? | Numeric option to specify the spinOffs adjustment. Possible options include `0` (When we only want spits adjustment), `1` (spinOffs), `4` (spinOffs and cash dividends) and `9` (No adjustments) (optional) 
            var cal = "local";  // string | Option for the calendarType of the chart (optional)  (default to local)
            var title = "title_example";  // string | Option to customize the title. If you don't customize the title, then it displays by default the security name. (optional) 
            var fontSize = 10D;  // decimal? | Option to adjust chart's fontSize (optional) 
            var type = "png";  // string | The type of image to be generated by the service (optional)  (default to png)
            var gridLines = true;  // bool? | Option to toggle gridLines on/off on the chart (optional)  (default to true)
            var decimalPrecision = 2D;  // decimal? | Option to add custom decimal precision on the chart (optional) 

            try
            {
                // Get chart image back in PNG or JPEG formats
                System.IO.Stream result = apiInstance.Images(chart, ids, sd, ed, width, height, freq, ccy, split, spin, cal, title, fontSize, type, gridLines, decimalPrecision);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling ChartTemplatesApi.Images: " + e.Message );
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
 **chart** | **string**| Path to the saved chart. For any of the default charts, the option should be &#x60;categoryName + &#39;/&#39; + chartName&#x60;. For charts under the Client or Personal directories, the option should be &#x60;directoryName + &#39;:/&#39; + pathTotheChart&#x60;.   | 
 **ids** | **string**| List of identifiers to be charted in a comma(,) separated string. Only the first one would be considered as primary and rest would be added as comps. Check the catalog for more information on which charts require a ticker. | [optional] 
 **sd** | **string**| Option for overriding the startDate of the chart.  #### Absolute Dates  For absolute dates, provide a string in &#x60;YYYYMMDD&#x60; format.  #### Relative Dates  Relative dates represent a date relative to the most recently-updated period. For example, 0 (zero) represents the most recently-updated period; -1 represents the time period prior to the most recently updated.\\ \\ The \&quot;zero date\&quot; is determined by the default time period or the natural frequency of the data being requested. Zero (0), when used with monthly data, indicates the most recent month-end. Negative one (-1), when used with annual data, indicates one fiscal year prior to the most recently-updated fiscal year.  #### Relative Date Options  **D:** &#x60;0D&#x60; is the most recent trading day, &#x60;-1D&#x60; is one trading day prior  **M:** &#x60;0M&#x60; is the last trading day of the most recent month, &#x60;-1M&#x60; is the last trading day of the prior month  **AY:** &#x60;0AY&#x60; is the most recent trading day, &#x60;-1AY&#x60; is one actual year (365 days) prior  **Y:** &#x60;0Y&#x60; is the last trading day of the company&#39;s most recent fiscal year, &#x60;-1Y&#x60; is the last trading day of the prior fiscal year\\ \\ For more information and examples, refer to our [date format documentation](https://my.apps.factset.com/oa/pages/1964#date_f). | [optional] 
 **ed** | **string**| Option for overriding the endDate of the chart. For absolute dates provide a string in &#x60;YYYYMMDD&#x60; format. We can also specify relative date options as described in the above &#x60;sd&#x60; option. | [optional] 
 **width** | **long?**| Option for setting the width of the image | [optional] [default to 1056]
 **height** | **long?**| Option for setting the height of the image | [optional] [default to 816]
 **freq** | **string**| A shorthand string for the overall frequency of the chart like &#x60;D&#x60; (daily), &#x60;W&#x60; (weekly), &#x60;Y&#x60; (yearly) and &#x60;Q&#x60; (Quarterly). This will default to frequency stored in the document. | [optional] 
 **ccy** | **string**| Currency ISO code for the overall currency of the chart. The API doesn&#39;t allow per series currency at this point in time. | [optional] 
 **split** | **string**| Option to specify the splits adjustment | [optional] 
 **spin** | **decimal?**| Numeric option to specify the spinOffs adjustment. Possible options include &#x60;0&#x60; (When we only want spits adjustment), &#x60;1&#x60; (spinOffs), &#x60;4&#x60; (spinOffs and cash dividends) and &#x60;9&#x60; (No adjustments) | [optional] 
 **cal** | **string**| Option for the calendarType of the chart | [optional] [default to local]
 **title** | **string**| Option to customize the title. If you don&#39;t customize the title, then it displays by default the security name. | [optional] 
 **fontSize** | **decimal?**| Option to adjust chart&#39;s fontSize | [optional] 
 **type** | **string**| The type of image to be generated by the service | [optional] [default to png]
 **gridLines** | **bool?**| Option to toggle gridLines on/off on the chart | [optional] [default to true]
 **decimalPrecision** | **decimal?**| Option to add custom decimal precision on the chart | [optional] 

### Return type
**System.IO.Stream**

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: img/png, img/jpeg, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Input |  -  |
| **401** | Unauthorized |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


