# FactSet.SDK.RealTimeTimeSeries.Api.VendorApi

All URIs are relative to *https://api.factset.com/wealth/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**PostVendorChartIqTimeSeriesEodList**](VendorApi.md#postvendorchartiqtimeserieseodlist) | **POST** /vendor/chart-iq/time-series/eod/list | End-of-day time series data for a notation.
[**PostVendorChartIqTimeSeriesEodSubsampleGet**](VendorApi.md#postvendorchartiqtimeserieseodsubsampleget) | **POST** /vendor/chart-iq/time-series/eod/subsample/get | Single subsample end-of-day data for a notation.
[**PostVendorChartIqTimeSeriesEodSubsampleList**](VendorApi.md#postvendorchartiqtimeserieseodsubsamplelist) | **POST** /vendor/chart-iq/time-series/eod/subsample/list | Subsampled end-of-day time series data for a notation.
[**PostVendorChartIqTimeSeriesIntradaySubsampleGet**](VendorApi.md#postvendorchartiqtimeseriesintradaysubsampleget) | **POST** /vendor/chart-iq/time-series/intraday/subsample/get | Single subsample intraday data for a notation.
[**PostVendorChartIqTimeSeriesIntradaySubsampleList**](VendorApi.md#postvendorchartiqtimeseriesintradaysubsamplelist) | **POST** /vendor/chart-iq/time-series/intraday/subsample/list | Subsampled intraday time series data for a notation.



<a name="postvendorchartiqtimeserieseodlist"></a>
# **PostVendorChartIqTimeSeriesEodList**
> InlineResponse200 PostVendorChartIqTimeSeriesEodList (PostVendorChartIQTimeSeriesEodListRequest postVendorChartIQTimeSeriesEodListRequest)

End-of-day time series data for a notation.

End-of-day time series data for a notation. The resulting time series is always adjusted for currency changes.<br><br>Pagination to a previous page is not supported and `pagination.previous` is always `null`.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.RealTimeTimeSeries.Api;
using FactSet.SDK.RealTimeTimeSeries.Client;
using FactSet.SDK.RealTimeTimeSeries.Model;

namespace Example
{
    public class PostVendorChartIqTimeSeriesEodListExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.RealTimeTimeSeries.Client.Configuration();

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

            var apiInstance = new VendorApi(config);

            var postVendorChartIQTimeSeriesEodListRequest = new PostVendorChartIQTimeSeriesEodListRequest(); // PostVendorChartIQTimeSeriesEodListRequest | Request Body

            try
            {
                // End-of-day time series data for a notation.
                InlineResponse200 result = apiInstance.PostVendorChartIqTimeSeriesEodList(postVendorChartIQTimeSeriesEodListRequest);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling VendorApi.PostVendorChartIqTimeSeriesEodList: " + e.Message );
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
 **postVendorChartIQTimeSeriesEodListRequest** | [**PostVendorChartIQTimeSeriesEodListRequest**](PostVendorChartIQTimeSeriesEodListRequest.md)| Request Body | 

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
# **PostVendorChartIqTimeSeriesEodSubsampleGet**
> InlineResponse2001 PostVendorChartIqTimeSeriesEodSubsampleGet (PostVendorChartIQTimeSeriesEodSubsampleGetRequest postVendorChartIQTimeSeriesEodSubsampleGetRequest)

Single subsample end-of-day data for a notation.

Single subsample end-of-day data for a notation. The sample is always adjusted for currency changes. The subsample may exceed the entitled date range, but will be based only on days that are in the entitled range.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.RealTimeTimeSeries.Api;
using FactSet.SDK.RealTimeTimeSeries.Client;
using FactSet.SDK.RealTimeTimeSeries.Model;

namespace Example
{
    public class PostVendorChartIqTimeSeriesEodSubsampleGetExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.RealTimeTimeSeries.Client.Configuration();

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

            var apiInstance = new VendorApi(config);

            var postVendorChartIQTimeSeriesEodSubsampleGetRequest = new PostVendorChartIQTimeSeriesEodSubsampleGetRequest(); // PostVendorChartIQTimeSeriesEodSubsampleGetRequest | Request Body

            try
            {
                // Single subsample end-of-day data for a notation.
                InlineResponse2001 result = apiInstance.PostVendorChartIqTimeSeriesEodSubsampleGet(postVendorChartIQTimeSeriesEodSubsampleGetRequest);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling VendorApi.PostVendorChartIqTimeSeriesEodSubsampleGet: " + e.Message );
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
 **postVendorChartIQTimeSeriesEodSubsampleGetRequest** | [**PostVendorChartIQTimeSeriesEodSubsampleGetRequest**](PostVendorChartIQTimeSeriesEodSubsampleGetRequest.md)| Request Body | 

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
# **PostVendorChartIqTimeSeriesEodSubsampleList**
> InlineResponse2002 PostVendorChartIqTimeSeriesEodSubsampleList (PostVendorChartIQTimeSeriesEodSubsampleListRequest postVendorChartIQTimeSeriesEodSubsampleListRequest)

Subsampled end-of-day time series data for a notation.

Subsampled end-of-day time series data for a notation. The resulting time series is always adjusted for currency changes. If a subsample's date range is not entirely within the maximally entitled date range, the subsample is excluded from the response.<br><br>Pagination to a previous page is not supported and `pagination.previous` is always `null`.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.RealTimeTimeSeries.Api;
using FactSet.SDK.RealTimeTimeSeries.Client;
using FactSet.SDK.RealTimeTimeSeries.Model;

namespace Example
{
    public class PostVendorChartIqTimeSeriesEodSubsampleListExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.RealTimeTimeSeries.Client.Configuration();

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

            var apiInstance = new VendorApi(config);

            var postVendorChartIQTimeSeriesEodSubsampleListRequest = new PostVendorChartIQTimeSeriesEodSubsampleListRequest(); // PostVendorChartIQTimeSeriesEodSubsampleListRequest | Request Body

            try
            {
                // Subsampled end-of-day time series data for a notation.
                InlineResponse2002 result = apiInstance.PostVendorChartIqTimeSeriesEodSubsampleList(postVendorChartIQTimeSeriesEodSubsampleListRequest);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling VendorApi.PostVendorChartIqTimeSeriesEodSubsampleList: " + e.Message );
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
 **postVendorChartIQTimeSeriesEodSubsampleListRequest** | [**PostVendorChartIQTimeSeriesEodSubsampleListRequest**](PostVendorChartIQTimeSeriesEodSubsampleListRequest.md)| Request Body | 

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
# **PostVendorChartIqTimeSeriesIntradaySubsampleGet**
> InlineResponse2003 PostVendorChartIqTimeSeriesIntradaySubsampleGet (PostVendorChartIQTimeSeriesIntradaySubsampleGetRequest postVendorChartIQTimeSeriesIntradaySubsampleGetRequest)

Single subsample intraday data for a notation.

Single subsample intraday data for a notation. The subsample may exceed the entitled time range, but will be based only on ticks that are in the entitled range.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.RealTimeTimeSeries.Api;
using FactSet.SDK.RealTimeTimeSeries.Client;
using FactSet.SDK.RealTimeTimeSeries.Model;

namespace Example
{
    public class PostVendorChartIqTimeSeriesIntradaySubsampleGetExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.RealTimeTimeSeries.Client.Configuration();

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

            var apiInstance = new VendorApi(config);

            var postVendorChartIQTimeSeriesIntradaySubsampleGetRequest = new PostVendorChartIQTimeSeriesIntradaySubsampleGetRequest(); // PostVendorChartIQTimeSeriesIntradaySubsampleGetRequest | Request Body

            try
            {
                // Single subsample intraday data for a notation.
                InlineResponse2003 result = apiInstance.PostVendorChartIqTimeSeriesIntradaySubsampleGet(postVendorChartIQTimeSeriesIntradaySubsampleGetRequest);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling VendorApi.PostVendorChartIqTimeSeriesIntradaySubsampleGet: " + e.Message );
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
 **postVendorChartIQTimeSeriesIntradaySubsampleGetRequest** | [**PostVendorChartIQTimeSeriesIntradaySubsampleGetRequest**](PostVendorChartIQTimeSeriesIntradaySubsampleGetRequest.md)| Request Body | 

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
# **PostVendorChartIqTimeSeriesIntradaySubsampleList**
> InlineResponse2004 PostVendorChartIqTimeSeriesIntradaySubsampleList (PostVendorChartIQTimeSeriesIntradaySubsampleListRequest postVendorChartIQTimeSeriesIntradaySubsampleListRequest)

Subsampled intraday time series data for a notation.

Subsampled intraday time series data for a notation. If a subsample's time range is not entirely within the maximally entitled time range, the subsample is excluded from the response.<br><br>Pagination to a previous page is not supported and `pagination.previous` is always `null`.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.RealTimeTimeSeries.Api;
using FactSet.SDK.RealTimeTimeSeries.Client;
using FactSet.SDK.RealTimeTimeSeries.Model;

namespace Example
{
    public class PostVendorChartIqTimeSeriesIntradaySubsampleListExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.RealTimeTimeSeries.Client.Configuration();

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

            var apiInstance = new VendorApi(config);

            var postVendorChartIQTimeSeriesIntradaySubsampleListRequest = new PostVendorChartIQTimeSeriesIntradaySubsampleListRequest(); // PostVendorChartIQTimeSeriesIntradaySubsampleListRequest | Request Body

            try
            {
                // Subsampled intraday time series data for a notation.
                InlineResponse2004 result = apiInstance.PostVendorChartIqTimeSeriesIntradaySubsampleList(postVendorChartIQTimeSeriesIntradaySubsampleListRequest);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling VendorApi.PostVendorChartIqTimeSeriesIntradaySubsampleList: " + e.Message );
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
 **postVendorChartIQTimeSeriesIntradaySubsampleListRequest** | [**PostVendorChartIQTimeSeriesIntradaySubsampleListRequest**](PostVendorChartIQTimeSeriesIntradaySubsampleListRequest.md)| Request Body | 

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


