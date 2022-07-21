# FactSet.SDK.TimeSeriesAPIforDigitalPortals.Api.VendorApi

All URIs are relative to *https://api.factset.com/wealth/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**PostVendorChartIQTimeSeriesEodList**](VendorApi.md#postvendorchartiqtimeserieseodlist) | **POST** /vendor/chartIQ/timeSeries/eod/list | End-of-day time series data for a notation.
[**PostVendorChartIQTimeSeriesEodSubsampleGet**](VendorApi.md#postvendorchartiqtimeserieseodsubsampleget) | **POST** /vendor/chartIQ/timeSeries/eod/subsample/get | Single subsample end-of-day data for a notation.
[**PostVendorChartIQTimeSeriesEodSubsampleList**](VendorApi.md#postvendorchartiqtimeserieseodsubsamplelist) | **POST** /vendor/chartIQ/timeSeries/eod/subsample/list | Subsampled end-of-day time series data for a notation.
[**PostVendorChartIQTimeSeriesIntradaySubsampleGet**](VendorApi.md#postvendorchartiqtimeseriesintradaysubsampleget) | **POST** /vendor/chartIQ/timeSeries/intraday/subsample/get | Single subsample intraday data for a notation.
[**PostVendorChartIQTimeSeriesIntradaySubsampleList**](VendorApi.md#postvendorchartiqtimeseriesintradaysubsamplelist) | **POST** /vendor/chartIQ/timeSeries/intraday/subsample/list | Subsampled intraday time series data for a notation.


<a name="postvendorchartiqtimeserieseodlist"></a>
# **PostVendorChartIQTimeSeriesEodList**
> InlineResponse200 PostVendorChartIQTimeSeriesEodList (InlineObject inlineObject)

End-of-day time series data for a notation.

End-of-day time series data for a notation. The resulting time series is always adjusted for currency changes.<br><br>Pagination to a previous page is not supported and `pagination.previous` is always `null`.

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
    public class PostVendorChartIQTimeSeriesEodListExample
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

            var apiInstance = new VendorApi(config);

            var inlineObject = new InlineObject(); // InlineObject | 

            try
            {
                // End-of-day time series data for a notation.
                InlineResponse200 result = apiInstance.PostVendorChartIQTimeSeriesEodList(inlineObject);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling VendorApi.PostVendorChartIQTimeSeriesEodList: " + e.Message );
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
 **inlineObject** | [**InlineObject**](InlineObject.md)|  | 

### Return type
[**InlineResponse200**](InlineResponse200.md)

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

<a name="postvendorchartiqtimeserieseodsubsampleget"></a>
# **PostVendorChartIQTimeSeriesEodSubsampleGet**
> InlineResponse2001 PostVendorChartIQTimeSeriesEodSubsampleGet (InlineObject1 inlineObject1)

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
    public class PostVendorChartIQTimeSeriesEodSubsampleGetExample
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

            var apiInstance = new VendorApi(config);

            var inlineObject1 = new InlineObject1(); // InlineObject1 | 

            try
            {
                // Single subsample end-of-day data for a notation.
                InlineResponse2001 result = apiInstance.PostVendorChartIQTimeSeriesEodSubsampleGet(inlineObject1);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling VendorApi.PostVendorChartIQTimeSeriesEodSubsampleGet: " + e.Message );
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
 **inlineObject1** | [**InlineObject1**](InlineObject1.md)|  | 

### Return type
[**InlineResponse2001**](InlineResponse2001.md)

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

<a name="postvendorchartiqtimeserieseodsubsamplelist"></a>
# **PostVendorChartIQTimeSeriesEodSubsampleList**
> InlineResponse2002 PostVendorChartIQTimeSeriesEodSubsampleList (InlineObject2 inlineObject2)

Subsampled end-of-day time series data for a notation.

Subsampled end-of-day time series data for a notation. The resulting time series is always adjusted for currency changes. If a subsample's date range is not entirely within the maximally entitled date range, the subsample is excluded from the response.<br><br>Pagination to a previous page is not supported and `pagination.previous` is always `null`.

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
    public class PostVendorChartIQTimeSeriesEodSubsampleListExample
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

            var apiInstance = new VendorApi(config);

            var inlineObject2 = new InlineObject2(); // InlineObject2 | 

            try
            {
                // Subsampled end-of-day time series data for a notation.
                InlineResponse2002 result = apiInstance.PostVendorChartIQTimeSeriesEodSubsampleList(inlineObject2);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling VendorApi.PostVendorChartIQTimeSeriesEodSubsampleList: " + e.Message );
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
 **inlineObject2** | [**InlineObject2**](InlineObject2.md)|  | 

### Return type
[**InlineResponse2002**](InlineResponse2002.md)

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

<a name="postvendorchartiqtimeseriesintradaysubsampleget"></a>
# **PostVendorChartIQTimeSeriesIntradaySubsampleGet**
> InlineResponse2003 PostVendorChartIQTimeSeriesIntradaySubsampleGet (InlineObject3 inlineObject3)

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
    public class PostVendorChartIQTimeSeriesIntradaySubsampleGetExample
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

            var apiInstance = new VendorApi(config);

            var inlineObject3 = new InlineObject3(); // InlineObject3 | 

            try
            {
                // Single subsample intraday data for a notation.
                InlineResponse2003 result = apiInstance.PostVendorChartIQTimeSeriesIntradaySubsampleGet(inlineObject3);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling VendorApi.PostVendorChartIQTimeSeriesIntradaySubsampleGet: " + e.Message );
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
 **inlineObject3** | [**InlineObject3**](InlineObject3.md)|  | 

### Return type
[**InlineResponse2003**](InlineResponse2003.md)

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

<a name="postvendorchartiqtimeseriesintradaysubsamplelist"></a>
# **PostVendorChartIQTimeSeriesIntradaySubsampleList**
> InlineResponse2004 PostVendorChartIQTimeSeriesIntradaySubsampleList (InlineObject4 inlineObject4)

Subsampled intraday time series data for a notation.

Subsampled intraday time series data for a notation. If a subsample's time range is not entirely within the maximally entitled time range, the subsample is excluded from the response.<br><br>Pagination to a previous page is not supported and `pagination.previous` is always `null`.

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
    public class PostVendorChartIQTimeSeriesIntradaySubsampleListExample
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

            var apiInstance = new VendorApi(config);

            var inlineObject4 = new InlineObject4(); // InlineObject4 | 

            try
            {
                // Subsampled intraday time series data for a notation.
                InlineResponse2004 result = apiInstance.PostVendorChartIQTimeSeriesIntradaySubsampleList(inlineObject4);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling VendorApi.PostVendorChartIQTimeSeriesIntradaySubsampleList: " + e.Message );
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
 **inlineObject4** | [**InlineObject4**](InlineObject4.md)|  | 

### Return type
[**InlineResponse2004**](InlineResponse2004.md)

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

