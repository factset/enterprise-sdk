# FactSet.SDK.TimeSeriesAPIforDigitalPortals.Api.PricesApi

All URIs are relative to *http://api.factset.com/wealth/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetPricesTimeSeriesIntradaySubsampleGet**](PricesApi.md#getpricestimeseriesintradaysubsampleget) | **GET** /prices/timeSeries/intraday/subsample/get | Single subsample intraday data for a notation.
[**PostPricesTimeSeriesEodList**](PricesApi.md#postpricestimeserieseodlist) | **POST** /prices/timeSeries/eod/list | End-of-day time series data for a notation.
[**PostPricesTimeSeriesEodSubsampleGet**](PricesApi.md#postpricestimeserieseodsubsampleget) | **POST** /prices/timeSeries/eod/subsample/get | Single subsample end-of-day data for a notation.
[**PostPricesTimeSeriesEodSubsampleList**](PricesApi.md#postpricestimeserieseodsubsamplelist) | **POST** /prices/timeSeries/eod/subsample/list | Subsampled end-of-day time series data for a notation.
[**PostPricesTimeSeriesIntradayList**](PricesApi.md#postpricestimeseriesintradaylist) | **POST** /prices/timeSeries/intraday/list | Intraday time series data for a notation.
[**PostPricesTimeSeriesIntradaySubsampleList**](PricesApi.md#postpricestimeseriesintradaysubsamplelist) | **POST** /prices/timeSeries/intraday/subsample/list | Subsampled intraday time series data for a notation.


<a name="getpricestimeseriesintradaysubsampleget"></a>
# **GetPricesTimeSeriesIntradaySubsampleGet**
> InlineResponse2009 GetPricesTimeSeriesIntradaySubsampleGet (string id, string from, string type = null, string quality = null, string granularity = null, List<string> attributes = null)

Single subsample intraday data for a notation.

Single subsample intraday data for a notation. The subsample may exceed the entitled time range, but will be based only on ticks that are in the entitled range.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.TimeSeriesAPIforDigitalPortals.Api;
using FactSet.SDK.TimeSeriesAPIforDigitalPortals.Client;
using FactSet.SDK.TimeSeriesAPIforDigitalPortals.Model;

namespace Example
{
    public class GetPricesTimeSeriesIntradaySubsampleGetExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.TimeSeriesAPIforDigitalPortals.Client.Configuration();

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

            var apiInstance = new PricesApi(config);

            var id = "id_example";  // string | Identifier of the notation.
            var from = "from_example";  // string | Date and time of the start point of the subsample (inclusive). `from` must be aligned to `granularity`. That is, the numerical value is an integral multiple of the time span value represented by `granularity`. The data accessible in the past is limited to a few weeks at most. Dates in the future are not allowed.
            var type = "trade";  // string | Type of the price as configured for the customer. (optional)  (default to trade)
            var quality = "RLT";  // string | Quality of the price. (optional)  (default to DLY)
            var granularity = "1s";  // string | Subsample granularities suitable for intraday data. (optional)  (default to 1h)
            var attributes = new List<string>(); // List<string> | Limit the attributes returned in the response to the specified set. (optional) 

            try
            {
                // Single subsample intraday data for a notation.
                InlineResponse2009 result = apiInstance.GetPricesTimeSeriesIntradaySubsampleGet(id, from, type, quality, granularity, attributes);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling PricesApi.GetPricesTimeSeriesIntradaySubsampleGet: " + e.Message );
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
 **from** | **string**| Date and time of the start point of the subsample (inclusive). &#x60;from&#x60; must be aligned to &#x60;granularity&#x60;. That is, the numerical value is an integral multiple of the time span value represented by &#x60;granularity&#x60;. The data accessible in the past is limited to a few weeks at most. Dates in the future are not allowed. | 
 **type** | **string**| Type of the price as configured for the customer. | [optional] [default to trade]
 **quality** | **string**| Quality of the price. | [optional] [default to DLY]
 **granularity** | **string**| Subsample granularities suitable for intraday data. | [optional] [default to 1h]
 **attributes** | [**List&lt;string&gt;**](string.md)| Limit the attributes returned in the response to the specified set. | [optional] 

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

<a name="postpricestimeserieseodlist"></a>
# **PostPricesTimeSeriesEodList**
> InlineResponse2005 PostPricesTimeSeriesEodList (InlineObject4 body)

End-of-day time series data for a notation.

End-of-day time series data for a notation. The resulting time series is always adjusted for currency changes.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.TimeSeriesAPIforDigitalPortals.Api;
using FactSet.SDK.TimeSeriesAPIforDigitalPortals.Client;
using FactSet.SDK.TimeSeriesAPIforDigitalPortals.Model;

namespace Example
{
    public class PostPricesTimeSeriesEodListExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.TimeSeriesAPIforDigitalPortals.Client.Configuration();

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

            var apiInstance = new PricesApi(config);

            var body = new InlineObject4(); // InlineObject4 | 

            try
            {
                // End-of-day time series data for a notation.
                InlineResponse2005 result = apiInstance.PostPricesTimeSeriesEodList(body);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling PricesApi.PostPricesTimeSeriesEodList: " + e.Message );
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
 **body** | [**InlineObject4**](InlineObject4.md)|  | 

### Return type
[**InlineResponse2005**](InlineResponse2005.md)

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

<a name="postpricestimeserieseodsubsampleget"></a>
# **PostPricesTimeSeriesEodSubsampleGet**
> InlineResponse2006 PostPricesTimeSeriesEodSubsampleGet (InlineObject5 body)

Single subsample end-of-day data for a notation.

Single subsample end-of-day data for a notation. The sample is always adjusted for currency changes. The subsample may exceed the entitled date range, but will be based only on days that are in the entitled range.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.TimeSeriesAPIforDigitalPortals.Api;
using FactSet.SDK.TimeSeriesAPIforDigitalPortals.Client;
using FactSet.SDK.TimeSeriesAPIforDigitalPortals.Model;

namespace Example
{
    public class PostPricesTimeSeriesEodSubsampleGetExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.TimeSeriesAPIforDigitalPortals.Client.Configuration();

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

            var apiInstance = new PricesApi(config);

            var body = new InlineObject5(); // InlineObject5 | 

            try
            {
                // Single subsample end-of-day data for a notation.
                InlineResponse2006 result = apiInstance.PostPricesTimeSeriesEodSubsampleGet(body);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling PricesApi.PostPricesTimeSeriesEodSubsampleGet: " + e.Message );
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
 **body** | [**InlineObject5**](InlineObject5.md)|  | 

### Return type
[**InlineResponse2006**](InlineResponse2006.md)

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

<a name="postpricestimeserieseodsubsamplelist"></a>
# **PostPricesTimeSeriesEodSubsampleList**
> InlineResponse2007 PostPricesTimeSeriesEodSubsampleList (InlineObject6 body)

Subsampled end-of-day time series data for a notation.

Subsampled end-of-day time series data for a notation. The resulting time series is always adjusted for currency changes. If a subsample's date range is not entirely within the maximally entitled date range, the subsample is excluded from the response.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.TimeSeriesAPIforDigitalPortals.Api;
using FactSet.SDK.TimeSeriesAPIforDigitalPortals.Client;
using FactSet.SDK.TimeSeriesAPIforDigitalPortals.Model;

namespace Example
{
    public class PostPricesTimeSeriesEodSubsampleListExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.TimeSeriesAPIforDigitalPortals.Client.Configuration();

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

            var apiInstance = new PricesApi(config);

            var body = new InlineObject6(); // InlineObject6 | 

            try
            {
                // Subsampled end-of-day time series data for a notation.
                InlineResponse2007 result = apiInstance.PostPricesTimeSeriesEodSubsampleList(body);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling PricesApi.PostPricesTimeSeriesEodSubsampleList: " + e.Message );
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
 **body** | [**InlineObject6**](InlineObject6.md)|  | 

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

<a name="postpricestimeseriesintradaylist"></a>
# **PostPricesTimeSeriesIntradayList**
> InlineResponse2008 PostPricesTimeSeriesIntradayList (InlineObject7 body)

Intraday time series data for a notation.

Intraday time series data for a notation.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.TimeSeriesAPIforDigitalPortals.Api;
using FactSet.SDK.TimeSeriesAPIforDigitalPortals.Client;
using FactSet.SDK.TimeSeriesAPIforDigitalPortals.Model;

namespace Example
{
    public class PostPricesTimeSeriesIntradayListExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.TimeSeriesAPIforDigitalPortals.Client.Configuration();

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

            var apiInstance = new PricesApi(config);

            var body = new InlineObject7(); // InlineObject7 | 

            try
            {
                // Intraday time series data for a notation.
                InlineResponse2008 result = apiInstance.PostPricesTimeSeriesIntradayList(body);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling PricesApi.PostPricesTimeSeriesIntradayList: " + e.Message );
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
 **body** | [**InlineObject7**](InlineObject7.md)|  | 

### Return type
[**InlineResponse2008**](InlineResponse2008.md)

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

<a name="postpricestimeseriesintradaysubsamplelist"></a>
# **PostPricesTimeSeriesIntradaySubsampleList**
> InlineResponse20010 PostPricesTimeSeriesIntradaySubsampleList (InlineObject8 body)

Subsampled intraday time series data for a notation.

Subsampled intraday time series data for a notation. If a subsample's time range is not entirely within the maximally entitled time range, the subsample is excluded from the response.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.TimeSeriesAPIforDigitalPortals.Api;
using FactSet.SDK.TimeSeriesAPIforDigitalPortals.Client;
using FactSet.SDK.TimeSeriesAPIforDigitalPortals.Model;

namespace Example
{
    public class PostPricesTimeSeriesIntradaySubsampleListExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.TimeSeriesAPIforDigitalPortals.Client.Configuration();

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

            var apiInstance = new PricesApi(config);

            var body = new InlineObject8(); // InlineObject8 | 

            try
            {
                // Subsampled intraday time series data for a notation.
                InlineResponse20010 result = apiInstance.PostPricesTimeSeriesIntradaySubsampleList(body);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling PricesApi.PostPricesTimeSeriesIntradaySubsampleList: " + e.Message );
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
 **body** | [**InlineObject8**](InlineObject8.md)|  | 

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

