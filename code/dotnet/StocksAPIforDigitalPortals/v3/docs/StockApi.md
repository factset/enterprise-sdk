# FactSet.SDK.StocksAPIforDigitalPortals.Api.StockApi

All URIs are relative to *http://api.factset.com/wealth/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetStockDividendTypeList**](StockApi.md#getstockdividendtypelist) | **GET** /stock/dividend/type/list | List of dividend types.
[**GetStockNotationKeyFiguresBenchmarkMonth1Get**](StockApi.md#getstocknotationkeyfiguresbenchmarkmonth1get) | **GET** /stock/notation/keyFigures/benchmark/month/1/get | End-of-day (EOD) benchmark key figures of a stock for the time range of one month.
[**GetStockNotationKeyFiguresBenchmarkMonth3Get**](StockApi.md#getstocknotationkeyfiguresbenchmarkmonth3get) | **GET** /stock/notation/keyFigures/benchmark/month/3/get | End-of-day (EOD) benchmark key figures of a stock for the time range of three months.
[**GetStockNotationKeyFiguresBenchmarkWeek1Get**](StockApi.md#getstocknotationkeyfiguresbenchmarkweek1get) | **GET** /stock/notation/keyFigures/benchmark/week/1/get | End-of-day (EOD) benchmark key figures of a stock for the time range of one week.
[**GetStockNotationKeyFiguresBenchmarkYear1Get**](StockApi.md#getstocknotationkeyfiguresbenchmarkyear1get) | **GET** /stock/notation/keyFigures/benchmark/year/1/get | End-of-day (EOD) benchmark key figures of a stock for the time range of one year.
[**GetStockNotationKeyFiguresBenchmarkYear3Get**](StockApi.md#getstocknotationkeyfiguresbenchmarkyear3get) | **GET** /stock/notation/keyFigures/benchmark/year/3/get | End-of-day (EOD) benchmark key figures of a stock for the time range of three years.
[**GetStockNotationKeyFiguresBenchmarkYear5Get**](StockApi.md#getstocknotationkeyfiguresbenchmarkyear5get) | **GET** /stock/notation/keyFigures/benchmark/year/5/get | End-of-day (EOD) benchmark key figures of a stock for the time range of five years.
[**GetStockOwnerList**](StockApi.md#getstockownerlist) | **GET** /stock/owner/list | List of owners for a specific type of a company&#39;s shares.
[**GetStockRecommendationAggregateGet**](StockApi.md#getstockrecommendationaggregateget) | **GET** /stock/recommendation/aggregate/get | Target price and aggregated recommendations for a stock.
[**GetStockRecommendationAggregateHistoryList**](StockApi.md#getstockrecommendationaggregatehistorylist) | **GET** /stock/recommendation/aggregate/history/list | Current and historical trade recommendations and target prices for a stock.
[**PostStockDividendList**](StockApi.md#poststockdividendlist) | **POST** /stock/dividend/list | List of dividends for a stock.
[**PostStockNotationRankingIntradayList**](StockApi.md#poststocknotationrankingintradaylist) | **POST** /stock/notation/ranking/intraday/list | Ranking of stocks&#39; notations using intraday figures.
[**PostStockNotationScreenerSearch**](StockApi.md#poststocknotationscreenersearch) | **POST** /stock/notation/screener/search | Screener for stocks&#39; notations based on stock-specific parameters.
[**PostStockNotationScreenerValueRangesGet**](StockApi.md#poststocknotationscreenervaluerangesget) | **POST** /stock/notation/screener/valueRanges/get | Possible values and value ranges for the parameters used in the endpoint &#x60;/stock/notation/screener/search&#x60;.


<a name="getstockdividendtypelist"></a>
# **GetStockDividendTypeList**
> InlineResponse2008 GetStockDividendTypeList (List<string> attributes = null, string language = null)

List of dividend types.

List of dividend types.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.StocksAPIforDigitalPortals.Api;
using FactSet.SDK.StocksAPIforDigitalPortals.Client;
using FactSet.SDK.StocksAPIforDigitalPortals.Model;

namespace Example
{
    public class GetStockDividendTypeListExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.StocksAPIforDigitalPortals.Client.Configuration();

            // Examples for each supported authentication method are below,
            // choose one that satisfies your use case.

            /* (Preferred) OAuth 2.0: FactSetOAuth2 */
            // See https://github.com/FactSet/enterprise-sdk#oauth-20
            // for information on how to create the app-config.json file
            // See https://github.com/FactSet/enterprise-sdk-utils-dotnet#authentication
            // for more information on using the ConfidentialClient class
            ConfidentialClient confidentialClient = await ConfidentialClient.CreateAsync("/path/to/app-config.json");
            config.OAuth2Client = confidentialClient;

            /* Basic authentication: FactSetApiKey */
            // See https://github.com/FactSet/enterprise-sdk#api-key
            // for information how to create an API key
            // config.Username = "USERNAME-SERIAL";
            // config.Password = "API-KEY";

            var apiInstance = new StockApi(config);

            var attributes = new List<string>(); // List<string> | Limit the attributes returned in the response to the specified set. (optional) 
            var language = "language_example";  // string | ISO 639-1 code of the language. (optional) 

            try
            {
                // List of dividend types.
                InlineResponse2008 result = apiInstance.GetStockDividendTypeList(attributes, language);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling StockApi.GetStockDividendTypeList: " + e.Message );
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
 **attributes** | [**List&lt;string&gt;**](string.md)| Limit the attributes returned in the response to the specified set. | [optional] 
 **language** | **string**| ISO 639-1 code of the language. | [optional] 

### Return type
[**InlineResponse2008**](InlineResponse2008.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getstocknotationkeyfiguresbenchmarkmonth1get"></a>
# **GetStockNotationKeyFiguresBenchmarkMonth1Get**
> InlineResponse2009 GetStockNotationKeyFiguresBenchmarkMonth1Get (string id, List<string> idNotationBenchmark, List<string> attributes = null, string language = null)

End-of-day (EOD) benchmark key figures of a stock for the time range of one month.

End-of-day (EOD) benchmark key figures of a stock for the time range of one month.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.StocksAPIforDigitalPortals.Api;
using FactSet.SDK.StocksAPIforDigitalPortals.Client;
using FactSet.SDK.StocksAPIforDigitalPortals.Model;

namespace Example
{
    public class GetStockNotationKeyFiguresBenchmarkMonth1GetExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.StocksAPIforDigitalPortals.Client.Configuration();

            // Examples for each supported authentication method are below,
            // choose one that satisfies your use case.

            /* (Preferred) OAuth 2.0: FactSetOAuth2 */
            // See https://github.com/FactSet/enterprise-sdk#oauth-20
            // for information on how to create the app-config.json file
            // See https://github.com/FactSet/enterprise-sdk-utils-dotnet#authentication
            // for more information on using the ConfidentialClient class
            ConfidentialClient confidentialClient = await ConfidentialClient.CreateAsync("/path/to/app-config.json");
            config.OAuth2Client = confidentialClient;

            /* Basic authentication: FactSetApiKey */
            // See https://github.com/FactSet/enterprise-sdk#api-key
            // for information how to create an API key
            // config.Username = "USERNAME-SERIAL";
            // config.Password = "API-KEY";

            var apiInstance = new StockApi(config);

            var id = "id_example";  // string | Identifier of the notation.
            var idNotationBenchmark = new List<string>(); // List<string> | List of identifiers of benchmark notations. See the group description for the list of valid values.
            var attributes = new List<string>(); // List<string> | Limit the attributes returned in the response to the specified set. (optional) 
            var language = "language_example";  // string | ISO 639-1 code of the language. (optional) 

            try
            {
                // End-of-day (EOD) benchmark key figures of a stock for the time range of one month.
                InlineResponse2009 result = apiInstance.GetStockNotationKeyFiguresBenchmarkMonth1Get(id, idNotationBenchmark, attributes, language);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling StockApi.GetStockNotationKeyFiguresBenchmarkMonth1Get: " + e.Message );
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
 **id** | **string**| Identifier of the notation. | 
 **idNotationBenchmark** | [**List&lt;string&gt;**](string.md)| List of identifiers of benchmark notations. See the group description for the list of valid values. | 
 **attributes** | [**List&lt;string&gt;**](string.md)| Limit the attributes returned in the response to the specified set. | [optional] 
 **language** | **string**| ISO 639-1 code of the language. | [optional] 

### Return type
[**InlineResponse2009**](InlineResponse2009.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getstocknotationkeyfiguresbenchmarkmonth3get"></a>
# **GetStockNotationKeyFiguresBenchmarkMonth3Get**
> InlineResponse2009 GetStockNotationKeyFiguresBenchmarkMonth3Get (string id, List<string> idNotationBenchmark, List<string> attributes = null, string language = null)

End-of-day (EOD) benchmark key figures of a stock for the time range of three months.

End-of-day (EOD) benchmark key figures of a stock for the time range of three months.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.StocksAPIforDigitalPortals.Api;
using FactSet.SDK.StocksAPIforDigitalPortals.Client;
using FactSet.SDK.StocksAPIforDigitalPortals.Model;

namespace Example
{
    public class GetStockNotationKeyFiguresBenchmarkMonth3GetExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.StocksAPIforDigitalPortals.Client.Configuration();

            // Examples for each supported authentication method are below,
            // choose one that satisfies your use case.

            /* (Preferred) OAuth 2.0: FactSetOAuth2 */
            // See https://github.com/FactSet/enterprise-sdk#oauth-20
            // for information on how to create the app-config.json file
            // See https://github.com/FactSet/enterprise-sdk-utils-dotnet#authentication
            // for more information on using the ConfidentialClient class
            ConfidentialClient confidentialClient = await ConfidentialClient.CreateAsync("/path/to/app-config.json");
            config.OAuth2Client = confidentialClient;

            /* Basic authentication: FactSetApiKey */
            // See https://github.com/FactSet/enterprise-sdk#api-key
            // for information how to create an API key
            // config.Username = "USERNAME-SERIAL";
            // config.Password = "API-KEY";

            var apiInstance = new StockApi(config);

            var id = "id_example";  // string | Identifier of the notation.
            var idNotationBenchmark = new List<string>(); // List<string> | List of identifiers of benchmark notations. See the group description for the list of valid values.
            var attributes = new List<string>(); // List<string> | Limit the attributes returned in the response to the specified set. (optional) 
            var language = "language_example";  // string | ISO 639-1 code of the language. (optional) 

            try
            {
                // End-of-day (EOD) benchmark key figures of a stock for the time range of three months.
                InlineResponse2009 result = apiInstance.GetStockNotationKeyFiguresBenchmarkMonth3Get(id, idNotationBenchmark, attributes, language);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling StockApi.GetStockNotationKeyFiguresBenchmarkMonth3Get: " + e.Message );
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
 **id** | **string**| Identifier of the notation. | 
 **idNotationBenchmark** | [**List&lt;string&gt;**](string.md)| List of identifiers of benchmark notations. See the group description for the list of valid values. | 
 **attributes** | [**List&lt;string&gt;**](string.md)| Limit the attributes returned in the response to the specified set. | [optional] 
 **language** | **string**| ISO 639-1 code of the language. | [optional] 

### Return type
[**InlineResponse2009**](InlineResponse2009.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getstocknotationkeyfiguresbenchmarkweek1get"></a>
# **GetStockNotationKeyFiguresBenchmarkWeek1Get**
> InlineResponse2009 GetStockNotationKeyFiguresBenchmarkWeek1Get (string id, List<string> idNotationBenchmark, List<string> attributes = null, string language = null)

End-of-day (EOD) benchmark key figures of a stock for the time range of one week.

End-of-day (EOD) benchmark key figures of a stock for the time range of one week.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.StocksAPIforDigitalPortals.Api;
using FactSet.SDK.StocksAPIforDigitalPortals.Client;
using FactSet.SDK.StocksAPIforDigitalPortals.Model;

namespace Example
{
    public class GetStockNotationKeyFiguresBenchmarkWeek1GetExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.StocksAPIforDigitalPortals.Client.Configuration();

            // Examples for each supported authentication method are below,
            // choose one that satisfies your use case.

            /* (Preferred) OAuth 2.0: FactSetOAuth2 */
            // See https://github.com/FactSet/enterprise-sdk#oauth-20
            // for information on how to create the app-config.json file
            // See https://github.com/FactSet/enterprise-sdk-utils-dotnet#authentication
            // for more information on using the ConfidentialClient class
            ConfidentialClient confidentialClient = await ConfidentialClient.CreateAsync("/path/to/app-config.json");
            config.OAuth2Client = confidentialClient;

            /* Basic authentication: FactSetApiKey */
            // See https://github.com/FactSet/enterprise-sdk#api-key
            // for information how to create an API key
            // config.Username = "USERNAME-SERIAL";
            // config.Password = "API-KEY";

            var apiInstance = new StockApi(config);

            var id = "id_example";  // string | Identifier of the notation.
            var idNotationBenchmark = new List<string>(); // List<string> | List of identifiers of benchmark notations. See the group description for the list of valid values.
            var attributes = new List<string>(); // List<string> | Limit the attributes returned in the response to the specified set. (optional) 
            var language = "language_example";  // string | ISO 639-1 code of the language. (optional) 

            try
            {
                // End-of-day (EOD) benchmark key figures of a stock for the time range of one week.
                InlineResponse2009 result = apiInstance.GetStockNotationKeyFiguresBenchmarkWeek1Get(id, idNotationBenchmark, attributes, language);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling StockApi.GetStockNotationKeyFiguresBenchmarkWeek1Get: " + e.Message );
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
 **id** | **string**| Identifier of the notation. | 
 **idNotationBenchmark** | [**List&lt;string&gt;**](string.md)| List of identifiers of benchmark notations. See the group description for the list of valid values. | 
 **attributes** | [**List&lt;string&gt;**](string.md)| Limit the attributes returned in the response to the specified set. | [optional] 
 **language** | **string**| ISO 639-1 code of the language. | [optional] 

### Return type
[**InlineResponse2009**](InlineResponse2009.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getstocknotationkeyfiguresbenchmarkyear1get"></a>
# **GetStockNotationKeyFiguresBenchmarkYear1Get**
> InlineResponse2009 GetStockNotationKeyFiguresBenchmarkYear1Get (string id, List<string> idNotationBenchmark, List<string> attributes = null, string language = null)

End-of-day (EOD) benchmark key figures of a stock for the time range of one year.

End-of-day (EOD) benchmark key figures of a stock for the time range of one year.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.StocksAPIforDigitalPortals.Api;
using FactSet.SDK.StocksAPIforDigitalPortals.Client;
using FactSet.SDK.StocksAPIforDigitalPortals.Model;

namespace Example
{
    public class GetStockNotationKeyFiguresBenchmarkYear1GetExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.StocksAPIforDigitalPortals.Client.Configuration();

            // Examples for each supported authentication method are below,
            // choose one that satisfies your use case.

            /* (Preferred) OAuth 2.0: FactSetOAuth2 */
            // See https://github.com/FactSet/enterprise-sdk#oauth-20
            // for information on how to create the app-config.json file
            // See https://github.com/FactSet/enterprise-sdk-utils-dotnet#authentication
            // for more information on using the ConfidentialClient class
            ConfidentialClient confidentialClient = await ConfidentialClient.CreateAsync("/path/to/app-config.json");
            config.OAuth2Client = confidentialClient;

            /* Basic authentication: FactSetApiKey */
            // See https://github.com/FactSet/enterprise-sdk#api-key
            // for information how to create an API key
            // config.Username = "USERNAME-SERIAL";
            // config.Password = "API-KEY";

            var apiInstance = new StockApi(config);

            var id = "id_example";  // string | Identifier of the notation.
            var idNotationBenchmark = new List<string>(); // List<string> | List of identifiers of benchmark notations. See the group description for the list of valid values.
            var attributes = new List<string>(); // List<string> | Limit the attributes returned in the response to the specified set. (optional) 
            var language = "language_example";  // string | ISO 639-1 code of the language. (optional) 

            try
            {
                // End-of-day (EOD) benchmark key figures of a stock for the time range of one year.
                InlineResponse2009 result = apiInstance.GetStockNotationKeyFiguresBenchmarkYear1Get(id, idNotationBenchmark, attributes, language);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling StockApi.GetStockNotationKeyFiguresBenchmarkYear1Get: " + e.Message );
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
 **id** | **string**| Identifier of the notation. | 
 **idNotationBenchmark** | [**List&lt;string&gt;**](string.md)| List of identifiers of benchmark notations. See the group description for the list of valid values. | 
 **attributes** | [**List&lt;string&gt;**](string.md)| Limit the attributes returned in the response to the specified set. | [optional] 
 **language** | **string**| ISO 639-1 code of the language. | [optional] 

### Return type
[**InlineResponse2009**](InlineResponse2009.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getstocknotationkeyfiguresbenchmarkyear3get"></a>
# **GetStockNotationKeyFiguresBenchmarkYear3Get**
> InlineResponse2009 GetStockNotationKeyFiguresBenchmarkYear3Get (string id, List<string> idNotationBenchmark, List<string> attributes = null, string language = null)

End-of-day (EOD) benchmark key figures of a stock for the time range of three years.

End-of-day (EOD) benchmark key figures of a stock for the time range of three years.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.StocksAPIforDigitalPortals.Api;
using FactSet.SDK.StocksAPIforDigitalPortals.Client;
using FactSet.SDK.StocksAPIforDigitalPortals.Model;

namespace Example
{
    public class GetStockNotationKeyFiguresBenchmarkYear3GetExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.StocksAPIforDigitalPortals.Client.Configuration();

            // Examples for each supported authentication method are below,
            // choose one that satisfies your use case.

            /* (Preferred) OAuth 2.0: FactSetOAuth2 */
            // See https://github.com/FactSet/enterprise-sdk#oauth-20
            // for information on how to create the app-config.json file
            // See https://github.com/FactSet/enterprise-sdk-utils-dotnet#authentication
            // for more information on using the ConfidentialClient class
            ConfidentialClient confidentialClient = await ConfidentialClient.CreateAsync("/path/to/app-config.json");
            config.OAuth2Client = confidentialClient;

            /* Basic authentication: FactSetApiKey */
            // See https://github.com/FactSet/enterprise-sdk#api-key
            // for information how to create an API key
            // config.Username = "USERNAME-SERIAL";
            // config.Password = "API-KEY";

            var apiInstance = new StockApi(config);

            var id = "id_example";  // string | Identifier of the notation.
            var idNotationBenchmark = new List<string>(); // List<string> | List of identifiers of benchmark notations. See the group description for the list of valid values.
            var attributes = new List<string>(); // List<string> | Limit the attributes returned in the response to the specified set. (optional) 
            var language = "language_example";  // string | ISO 639-1 code of the language. (optional) 

            try
            {
                // End-of-day (EOD) benchmark key figures of a stock for the time range of three years.
                InlineResponse2009 result = apiInstance.GetStockNotationKeyFiguresBenchmarkYear3Get(id, idNotationBenchmark, attributes, language);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling StockApi.GetStockNotationKeyFiguresBenchmarkYear3Get: " + e.Message );
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
 **id** | **string**| Identifier of the notation. | 
 **idNotationBenchmark** | [**List&lt;string&gt;**](string.md)| List of identifiers of benchmark notations. See the group description for the list of valid values. | 
 **attributes** | [**List&lt;string&gt;**](string.md)| Limit the attributes returned in the response to the specified set. | [optional] 
 **language** | **string**| ISO 639-1 code of the language. | [optional] 

### Return type
[**InlineResponse2009**](InlineResponse2009.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getstocknotationkeyfiguresbenchmarkyear5get"></a>
# **GetStockNotationKeyFiguresBenchmarkYear5Get**
> InlineResponse2009 GetStockNotationKeyFiguresBenchmarkYear5Get (string id, List<string> idNotationBenchmark, List<string> attributes = null, string language = null)

End-of-day (EOD) benchmark key figures of a stock for the time range of five years.

End-of-day (EOD) benchmark key figures of a stock for the time range of five years.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.StocksAPIforDigitalPortals.Api;
using FactSet.SDK.StocksAPIforDigitalPortals.Client;
using FactSet.SDK.StocksAPIforDigitalPortals.Model;

namespace Example
{
    public class GetStockNotationKeyFiguresBenchmarkYear5GetExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.StocksAPIforDigitalPortals.Client.Configuration();

            // Examples for each supported authentication method are below,
            // choose one that satisfies your use case.

            /* (Preferred) OAuth 2.0: FactSetOAuth2 */
            // See https://github.com/FactSet/enterprise-sdk#oauth-20
            // for information on how to create the app-config.json file
            // See https://github.com/FactSet/enterprise-sdk-utils-dotnet#authentication
            // for more information on using the ConfidentialClient class
            ConfidentialClient confidentialClient = await ConfidentialClient.CreateAsync("/path/to/app-config.json");
            config.OAuth2Client = confidentialClient;

            /* Basic authentication: FactSetApiKey */
            // See https://github.com/FactSet/enterprise-sdk#api-key
            // for information how to create an API key
            // config.Username = "USERNAME-SERIAL";
            // config.Password = "API-KEY";

            var apiInstance = new StockApi(config);

            var id = "id_example";  // string | Identifier of the notation.
            var idNotationBenchmark = new List<string>(); // List<string> | List of identifiers of benchmark notations. See the group description for the list of valid values.
            var attributes = new List<string>(); // List<string> | Limit the attributes returned in the response to the specified set. (optional) 
            var language = "language_example";  // string | ISO 639-1 code of the language. (optional) 

            try
            {
                // End-of-day (EOD) benchmark key figures of a stock for the time range of five years.
                InlineResponse2009 result = apiInstance.GetStockNotationKeyFiguresBenchmarkYear5Get(id, idNotationBenchmark, attributes, language);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling StockApi.GetStockNotationKeyFiguresBenchmarkYear5Get: " + e.Message );
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
 **id** | **string**| Identifier of the notation. | 
 **idNotationBenchmark** | [**List&lt;string&gt;**](string.md)| List of identifiers of benchmark notations. See the group description for the list of valid values. | 
 **attributes** | [**List&lt;string&gt;**](string.md)| Limit the attributes returned in the response to the specified set. | [optional] 
 **language** | **string**| ISO 639-1 code of the language. | [optional] 

### Return type
[**InlineResponse2009**](InlineResponse2009.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getstockownerlist"></a>
# **GetStockOwnerList**
> InlineResponse2006 GetStockOwnerList (string id, List<string> attributes = null, string language = null)

List of owners for a specific type of a company's shares.

List of top-20 owners for a specific type of a company's shares.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.StocksAPIforDigitalPortals.Api;
using FactSet.SDK.StocksAPIforDigitalPortals.Client;
using FactSet.SDK.StocksAPIforDigitalPortals.Model;

namespace Example
{
    public class GetStockOwnerListExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.StocksAPIforDigitalPortals.Client.Configuration();

            // Examples for each supported authentication method are below,
            // choose one that satisfies your use case.

            /* (Preferred) OAuth 2.0: FactSetOAuth2 */
            // See https://github.com/FactSet/enterprise-sdk#oauth-20
            // for information on how to create the app-config.json file
            // See https://github.com/FactSet/enterprise-sdk-utils-dotnet#authentication
            // for more information on using the ConfidentialClient class
            ConfidentialClient confidentialClient = await ConfidentialClient.CreateAsync("/path/to/app-config.json");
            config.OAuth2Client = confidentialClient;

            /* Basic authentication: FactSetApiKey */
            // See https://github.com/FactSet/enterprise-sdk#api-key
            // for information how to create an API key
            // config.Username = "USERNAME-SERIAL";
            // config.Password = "API-KEY";

            var apiInstance = new StockApi(config);

            var id = "id_example";  // string | Identifier of the instrument.
            var attributes = new List<string>(); // List<string> | Limit the attributes returned in the response to the specified set. (optional) 
            var language = "language_example";  // string | ISO 639-1 code of the language. (optional) 

            try
            {
                // List of owners for a specific type of a company's shares.
                InlineResponse2006 result = apiInstance.GetStockOwnerList(id, attributes, language);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling StockApi.GetStockOwnerList: " + e.Message );
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
 **id** | **string**| Identifier of the instrument. | 
 **attributes** | [**List&lt;string&gt;**](string.md)| Limit the attributes returned in the response to the specified set. | [optional] 
 **language** | **string**| ISO 639-1 code of the language. | [optional] 

### Return type
[**InlineResponse2006**](InlineResponse2006.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getstockrecommendationaggregateget"></a>
# **GetStockRecommendationAggregateGet**
> InlineResponse2001 GetStockRecommendationAggregateGet (string id, List<string> attributes = null)

Target price and aggregated recommendations for a stock.

Target price and aggregated recommendations for a stock.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.StocksAPIforDigitalPortals.Api;
using FactSet.SDK.StocksAPIforDigitalPortals.Client;
using FactSet.SDK.StocksAPIforDigitalPortals.Model;

namespace Example
{
    public class GetStockRecommendationAggregateGetExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.StocksAPIforDigitalPortals.Client.Configuration();

            // Examples for each supported authentication method are below,
            // choose one that satisfies your use case.

            /* (Preferred) OAuth 2.0: FactSetOAuth2 */
            // See https://github.com/FactSet/enterprise-sdk#oauth-20
            // for information on how to create the app-config.json file
            // See https://github.com/FactSet/enterprise-sdk-utils-dotnet#authentication
            // for more information on using the ConfidentialClient class
            ConfidentialClient confidentialClient = await ConfidentialClient.CreateAsync("/path/to/app-config.json");
            config.OAuth2Client = confidentialClient;

            /* Basic authentication: FactSetApiKey */
            // See https://github.com/FactSet/enterprise-sdk#api-key
            // for information how to create an API key
            // config.Username = "USERNAME-SERIAL";
            // config.Password = "API-KEY";

            var apiInstance = new StockApi(config);

            var id = "id_example";  // string | Identifier of an instrument.
            var attributes = new List<string>(); // List<string> | Limit the attributes returned in the response to the specified set. (optional) 

            try
            {
                // Target price and aggregated recommendations for a stock.
                InlineResponse2001 result = apiInstance.GetStockRecommendationAggregateGet(id, attributes);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling StockApi.GetStockRecommendationAggregateGet: " + e.Message );
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
 **id** | **string**| Identifier of an instrument. | 
 **attributes** | [**List&lt;string&gt;**](string.md)| Limit the attributes returned in the response to the specified set. | [optional] 

### Return type
[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getstockrecommendationaggregatehistorylist"></a>
# **GetStockRecommendationAggregateHistoryList**
> InlineResponse2002 GetStockRecommendationAggregateHistoryList (string id, List<string> snapshots, List<string> attributes = null)

Current and historical trade recommendations and target prices for a stock.

Current and historical trade recommendations and target prices for a stock.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.StocksAPIforDigitalPortals.Api;
using FactSet.SDK.StocksAPIforDigitalPortals.Client;
using FactSet.SDK.StocksAPIforDigitalPortals.Model;

namespace Example
{
    public class GetStockRecommendationAggregateHistoryListExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.StocksAPIforDigitalPortals.Client.Configuration();

            // Examples for each supported authentication method are below,
            // choose one that satisfies your use case.

            /* (Preferred) OAuth 2.0: FactSetOAuth2 */
            // See https://github.com/FactSet/enterprise-sdk#oauth-20
            // for information on how to create the app-config.json file
            // See https://github.com/FactSet/enterprise-sdk-utils-dotnet#authentication
            // for more information on using the ConfidentialClient class
            ConfidentialClient confidentialClient = await ConfidentialClient.CreateAsync("/path/to/app-config.json");
            config.OAuth2Client = confidentialClient;

            /* Basic authentication: FactSetApiKey */
            // See https://github.com/FactSet/enterprise-sdk#api-key
            // for information how to create an API key
            // config.Username = "USERNAME-SERIAL";
            // config.Password = "API-KEY";

            var apiInstance = new StockApi(config);

            var id = "id_example";  // string | Identifier of an instrument.
            var snapshots = new List<string>(); // List<string> | Choice of historic snapshots for aggregated recommendations.
            var attributes = new List<string>(); // List<string> | Limit the attributes returned in the response to the specified set. (optional) 

            try
            {
                // Current and historical trade recommendations and target prices for a stock.
                InlineResponse2002 result = apiInstance.GetStockRecommendationAggregateHistoryList(id, snapshots, attributes);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling StockApi.GetStockRecommendationAggregateHistoryList: " + e.Message );
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
 **id** | **string**| Identifier of an instrument. | 
 **snapshots** | [**List&lt;string&gt;**](string.md)| Choice of historic snapshots for aggregated recommendations. | 
 **attributes** | [**List&lt;string&gt;**](string.md)| Limit the attributes returned in the response to the specified set. | [optional] 

### Return type
[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="poststockdividendlist"></a>
# **PostStockDividendList**
> InlineResponse2007 PostStockDividendList (InlineObject1 body)

List of dividends for a stock.

List of dividends for a stock.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.StocksAPIforDigitalPortals.Api;
using FactSet.SDK.StocksAPIforDigitalPortals.Client;
using FactSet.SDK.StocksAPIforDigitalPortals.Model;

namespace Example
{
    public class PostStockDividendListExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.StocksAPIforDigitalPortals.Client.Configuration();

            // Examples for each supported authentication method are below,
            // choose one that satisfies your use case.

            /* (Preferred) OAuth 2.0: FactSetOAuth2 */
            // See https://github.com/FactSet/enterprise-sdk#oauth-20
            // for information on how to create the app-config.json file
            // See https://github.com/FactSet/enterprise-sdk-utils-dotnet#authentication
            // for more information on using the ConfidentialClient class
            ConfidentialClient confidentialClient = await ConfidentialClient.CreateAsync("/path/to/app-config.json");
            config.OAuth2Client = confidentialClient;

            /* Basic authentication: FactSetApiKey */
            // See https://github.com/FactSet/enterprise-sdk#api-key
            // for information how to create an API key
            // config.Username = "USERNAME-SERIAL";
            // config.Password = "API-KEY";

            var apiInstance = new StockApi(config);

            var body = new InlineObject1(); // InlineObject1 | 

            try
            {
                // List of dividends for a stock.
                InlineResponse2007 result = apiInstance.PostStockDividendList(body);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling StockApi.PostStockDividendList: " + e.Message );
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
 **body** | [**InlineObject1**](InlineObject1.md)|  | 

### Return type
[**InlineResponse2007**](InlineResponse2007.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="poststocknotationrankingintradaylist"></a>
# **PostStockNotationRankingIntradayList**
> InlineResponse20010 PostStockNotationRankingIntradayList (InlineObject2 body = null)

Ranking of stocks' notations using intraday figures.

Ranking of stocks' notations using intraday figures. The result is limited to 100 notations that all must satisfy all selected filters. If more than one notation of an instrument matches the parameters, and no market priority has been specified, only the notation with the highest trading volume, averaged over one month, is considered.  By default, the result is sorted descending by the relative intraday performance corresponding to the most recent trade price, see attribute `trade.performance.relative`. The result may contain sortable values based on different currencies, possibly making the ranking nonsensical, if the parameter `currency` has not been specified.`  The search can be restricted to a specific set of products by using customer-specific instrument or notation restriction lists. Such restriction lists are set up by FactSet upon request.  All identifiers used as parameters must be valid and entitled.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.StocksAPIforDigitalPortals.Api;
using FactSet.SDK.StocksAPIforDigitalPortals.Client;
using FactSet.SDK.StocksAPIforDigitalPortals.Model;

namespace Example
{
    public class PostStockNotationRankingIntradayListExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.StocksAPIforDigitalPortals.Client.Configuration();

            // Examples for each supported authentication method are below,
            // choose one that satisfies your use case.

            /* (Preferred) OAuth 2.0: FactSetOAuth2 */
            // See https://github.com/FactSet/enterprise-sdk#oauth-20
            // for information on how to create the app-config.json file
            // See https://github.com/FactSet/enterprise-sdk-utils-dotnet#authentication
            // for more information on using the ConfidentialClient class
            ConfidentialClient confidentialClient = await ConfidentialClient.CreateAsync("/path/to/app-config.json");
            config.OAuth2Client = confidentialClient;

            /* Basic authentication: FactSetApiKey */
            // See https://github.com/FactSet/enterprise-sdk#api-key
            // for information how to create an API key
            // config.Username = "USERNAME-SERIAL";
            // config.Password = "API-KEY";

            var apiInstance = new StockApi(config);

            var body = new InlineObject2(); // InlineObject2 |  (optional) 

            try
            {
                // Ranking of stocks' notations using intraday figures.
                InlineResponse20010 result = apiInstance.PostStockNotationRankingIntradayList(body);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling StockApi.PostStockNotationRankingIntradayList: " + e.Message );
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
 **body** | [**InlineObject2**](InlineObject2.md)|  | [optional] 

### Return type
[**InlineResponse20010**](InlineResponse20010.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="poststocknotationscreenersearch"></a>
# **PostStockNotationScreenerSearch**
> InlineResponse20011 PostStockNotationScreenerSearch (InlineObject3 body = null)

Screener for stocks' notations based on stock-specific parameters.

Screener for stocks' notations based on stock-specific parameters. The result is limited to the notations that satisfy all the selected filters. If more than one notation of an instrument matches the parameters, and no market priority has been specified, only the notation with the highest trading volume, averaged over one month, is considered.  Parameters for up to three fiscal years might be used in one request, see attribute `reportedKeyFigures`; data is available for the ten most recent completed fiscal years. Estimates are available for the current and two consecutive fiscal years; parameters for all three might be used in one request, see attribute `estimates`. The estimated values are calculated as the average of the most recent estimates provided by all analysts in a fixed time frame of 100 days. Screening and sorting by a currency-dependent attribute is not possible if the currency (see parameter `reportedKeyFigures.currencyDependentKeyFigures.currency.isoCode` and parameter `estimates.currencyDependentEstimates.currency.isoCode` respectively) is not set. If a fiscal year for the data as of the end of a fiscal year (see parameter `reportedKeyFigures.fiscalYear`) or for the estimates (see parameter `estimates.fiscalYear`) has been selected but no currency has been set, the respective data will be returned in the currency in which it was originally reported.  A specific set of stocks can be restricted to or excluded by using customer-specific instrument or notation selection lists. Such selection lists are set up by FactSet upon request. All identifiers used as parameters must be valid and entitled.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.StocksAPIforDigitalPortals.Api;
using FactSet.SDK.StocksAPIforDigitalPortals.Client;
using FactSet.SDK.StocksAPIforDigitalPortals.Model;

namespace Example
{
    public class PostStockNotationScreenerSearchExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.StocksAPIforDigitalPortals.Client.Configuration();

            // Examples for each supported authentication method are below,
            // choose one that satisfies your use case.

            /* (Preferred) OAuth 2.0: FactSetOAuth2 */
            // See https://github.com/FactSet/enterprise-sdk#oauth-20
            // for information on how to create the app-config.json file
            // See https://github.com/FactSet/enterprise-sdk-utils-dotnet#authentication
            // for more information on using the ConfidentialClient class
            ConfidentialClient confidentialClient = await ConfidentialClient.CreateAsync("/path/to/app-config.json");
            config.OAuth2Client = confidentialClient;

            /* Basic authentication: FactSetApiKey */
            // See https://github.com/FactSet/enterprise-sdk#api-key
            // for information how to create an API key
            // config.Username = "USERNAME-SERIAL";
            // config.Password = "API-KEY";

            var apiInstance = new StockApi(config);

            var body = new InlineObject3(); // InlineObject3 |  (optional) 

            try
            {
                // Screener for stocks' notations based on stock-specific parameters.
                InlineResponse20011 result = apiInstance.PostStockNotationScreenerSearch(body);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling StockApi.PostStockNotationScreenerSearch: " + e.Message );
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
 **body** | [**InlineObject3**](InlineObject3.md)|  | [optional] 

### Return type
[**InlineResponse20011**](InlineResponse20011.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="poststocknotationscreenervaluerangesget"></a>
# **PostStockNotationScreenerValueRangesGet**
> InlineResponse20012 PostStockNotationScreenerValueRangesGet (InlineObject4 body = null)

Possible values and value ranges for the parameters used in the endpoint `/stock/notation/screener/search`.

The endpoint returns the possible values and value ranges for the parameters used in the endpoint `/stock/notation/screener/search`. It allows to request the values and value ranges only for a restricted set of notations that match predefined parameters. The functionality may be used to pre-fill the values and value ranges of the parameters of the `/stock/notation/screener/search` endpoint so that performing a search always leads to a non-empty set of notations. If more than one notation of an instrument matches the parameters, and no market priority has been specified, only the notation with the highest trading volume, averaged over one month, is considered. For more information regarding the performance and volatility parameters, see the information available in the group description of the `/notation/keyFigures/` endpoints.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.StocksAPIforDigitalPortals.Api;
using FactSet.SDK.StocksAPIforDigitalPortals.Client;
using FactSet.SDK.StocksAPIforDigitalPortals.Model;

namespace Example
{
    public class PostStockNotationScreenerValueRangesGetExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.StocksAPIforDigitalPortals.Client.Configuration();

            // Examples for each supported authentication method are below,
            // choose one that satisfies your use case.

            /* (Preferred) OAuth 2.0: FactSetOAuth2 */
            // See https://github.com/FactSet/enterprise-sdk#oauth-20
            // for information on how to create the app-config.json file
            // See https://github.com/FactSet/enterprise-sdk-utils-dotnet#authentication
            // for more information on using the ConfidentialClient class
            ConfidentialClient confidentialClient = await ConfidentialClient.CreateAsync("/path/to/app-config.json");
            config.OAuth2Client = confidentialClient;

            /* Basic authentication: FactSetApiKey */
            // See https://github.com/FactSet/enterprise-sdk#api-key
            // for information how to create an API key
            // config.Username = "USERNAME-SERIAL";
            // config.Password = "API-KEY";

            var apiInstance = new StockApi(config);

            var body = new InlineObject4(); // InlineObject4 |  (optional) 

            try
            {
                // Possible values and value ranges for the parameters used in the endpoint `/stock/notation/screener/search`.
                InlineResponse20012 result = apiInstance.PostStockNotationScreenerValueRangesGet(body);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling StockApi.PostStockNotationScreenerValueRangesGet: " + e.Message );
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
 **body** | [**InlineObject4**](InlineObject4.md)|  | [optional] 

### Return type
[**InlineResponse20012**](InlineResponse20012.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

