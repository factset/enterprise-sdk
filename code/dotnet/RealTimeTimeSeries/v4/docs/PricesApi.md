# FactSet.SDK.RealTimeTimeSeries.Api.PricesApi

All URIs are relative to *https://api.factset.com/wealth/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**PostPricesTimeSeriesEodList**](PricesApi.md#postpricestimeserieseodlist) | **POST** /prices/time-series/eod/list | End-of-day time series data for a notation.
[**PostPricesTimeSeriesEodSubsampleGet**](PricesApi.md#postpricestimeserieseodsubsampleget) | **POST** /prices/time-series/eod/subsample/get | Single subsample end-of-day data for a notation.
[**PostPricesTimeSeriesEodSubsampleList**](PricesApi.md#postpricestimeserieseodsubsamplelist) | **POST** /prices/time-series/eod/subsample/list | Subsampled end-of-day time series data for a notation.
[**PostPricesTimeSeriesIntradayList**](PricesApi.md#postpricestimeseriesintradaylist) | **POST** /prices/time-series/intraday/list | Intraday time series data for a notation.
[**PostPricesTimeSeriesIntradaySubsampleGet**](PricesApi.md#postpricestimeseriesintradaysubsampleget) | **POST** /prices/time-series/intraday/subsample/get | Single subsample intraday data for a notation.
[**PostPricesTimeSeriesIntradaySubsampleList**](PricesApi.md#postpricestimeseriesintradaysubsamplelist) | **POST** /prices/time-series/intraday/subsample/list | Subsampled intraday time series data for a notation.



<a name="postpricestimeserieseodlist"></a>
# **PostPricesTimeSeriesEodList**
> InlineResponse2005 PostPricesTimeSeriesEodList (PostPricesTimeSeriesEodListRequest postPricesTimeSeriesEodListRequest)

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
    public class PostPricesTimeSeriesEodListExample
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

            var apiInstance = new PricesApi(config);

            var postPricesTimeSeriesEodListRequest = new PostPricesTimeSeriesEodListRequest(); // PostPricesTimeSeriesEodListRequest | Request Body

            try
            {
                // End-of-day time series data for a notation.
                InlineResponse2005 result = apiInstance.PostPricesTimeSeriesEodList(postPricesTimeSeriesEodListRequest);
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
 **postPricesTimeSeriesEodListRequest** | [**PostPricesTimeSeriesEodListRequest**](PostPricesTimeSeriesEodListRequest.md)| Request Body | 

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
> InlineResponse2006 PostPricesTimeSeriesEodSubsampleGet (PostPricesTimeSeriesEodSubsampleGetRequest postPricesTimeSeriesEodSubsampleGetRequest)

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
    public class PostPricesTimeSeriesEodSubsampleGetExample
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

            var apiInstance = new PricesApi(config);

            var postPricesTimeSeriesEodSubsampleGetRequest = new PostPricesTimeSeriesEodSubsampleGetRequest(); // PostPricesTimeSeriesEodSubsampleGetRequest | Request Body

            try
            {
                // Single subsample end-of-day data for a notation.
                InlineResponse2006 result = apiInstance.PostPricesTimeSeriesEodSubsampleGet(postPricesTimeSeriesEodSubsampleGetRequest);
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
 **postPricesTimeSeriesEodSubsampleGetRequest** | [**PostPricesTimeSeriesEodSubsampleGetRequest**](PostPricesTimeSeriesEodSubsampleGetRequest.md)| Request Body | 

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
> InlineResponse2007 PostPricesTimeSeriesEodSubsampleList (PostPricesTimeSeriesEodSubsampleListRequest postPricesTimeSeriesEodSubsampleListRequest)

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
    public class PostPricesTimeSeriesEodSubsampleListExample
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

            var apiInstance = new PricesApi(config);

            var postPricesTimeSeriesEodSubsampleListRequest = new PostPricesTimeSeriesEodSubsampleListRequest(); // PostPricesTimeSeriesEodSubsampleListRequest | Request Body

            try
            {
                // Subsampled end-of-day time series data for a notation.
                InlineResponse2007 result = apiInstance.PostPricesTimeSeriesEodSubsampleList(postPricesTimeSeriesEodSubsampleListRequest);
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
 **postPricesTimeSeriesEodSubsampleListRequest** | [**PostPricesTimeSeriesEodSubsampleListRequest**](PostPricesTimeSeriesEodSubsampleListRequest.md)| Request Body | 

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
> InlineResponse2008 PostPricesTimeSeriesIntradayList (PostPricesTimeSeriesIntradayListRequest postPricesTimeSeriesIntradayListRequest)

Intraday time series data for a notation.

Intraday time series data for a notation.<br><br>Pagination to a previous page is not supported and `pagination.previous` is always `null`.

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
    public class PostPricesTimeSeriesIntradayListExample
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

            var apiInstance = new PricesApi(config);

            var postPricesTimeSeriesIntradayListRequest = new PostPricesTimeSeriesIntradayListRequest(); // PostPricesTimeSeriesIntradayListRequest | Request Body

            try
            {
                // Intraday time series data for a notation.
                InlineResponse2008 result = apiInstance.PostPricesTimeSeriesIntradayList(postPricesTimeSeriesIntradayListRequest);
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
 **postPricesTimeSeriesIntradayListRequest** | [**PostPricesTimeSeriesIntradayListRequest**](PostPricesTimeSeriesIntradayListRequest.md)| Request Body | 

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


<a name="postpricestimeseriesintradaysubsampleget"></a>
# **PostPricesTimeSeriesIntradaySubsampleGet**
> InlineResponse2009 PostPricesTimeSeriesIntradaySubsampleGet (PostPricesTimeSeriesIntradaySubsampleGetRequest postPricesTimeSeriesIntradaySubsampleGetRequest)

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
    public class PostPricesTimeSeriesIntradaySubsampleGetExample
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

            var apiInstance = new PricesApi(config);

            var postPricesTimeSeriesIntradaySubsampleGetRequest = new PostPricesTimeSeriesIntradaySubsampleGetRequest(); // PostPricesTimeSeriesIntradaySubsampleGetRequest | Request Body

            try
            {
                // Single subsample intraday data for a notation.
                InlineResponse2009 result = apiInstance.PostPricesTimeSeriesIntradaySubsampleGet(postPricesTimeSeriesIntradaySubsampleGetRequest);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling PricesApi.PostPricesTimeSeriesIntradaySubsampleGet: " + e.Message );
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
 **postPricesTimeSeriesIntradaySubsampleGetRequest** | [**PostPricesTimeSeriesIntradaySubsampleGetRequest**](PostPricesTimeSeriesIntradaySubsampleGetRequest.md)| Request Body | 

### Return type
[**InlineResponse2009**](InlineResponse2009.md)

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
> InlineResponse20010 PostPricesTimeSeriesIntradaySubsampleList (PostPricesTimeSeriesIntradaySubsampleListRequest postPricesTimeSeriesIntradaySubsampleListRequest)

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
    public class PostPricesTimeSeriesIntradaySubsampleListExample
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

            var apiInstance = new PricesApi(config);

            var postPricesTimeSeriesIntradaySubsampleListRequest = new PostPricesTimeSeriesIntradaySubsampleListRequest(); // PostPricesTimeSeriesIntradaySubsampleListRequest | Request Body

            try
            {
                // Subsampled intraday time series data for a notation.
                InlineResponse20010 result = apiInstance.PostPricesTimeSeriesIntradaySubsampleList(postPricesTimeSeriesIntradaySubsampleListRequest);
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
 **postPricesTimeSeriesIntradaySubsampleListRequest** | [**PostPricesTimeSeriesIntradaySubsampleListRequest**](PostPricesTimeSeriesIntradaySubsampleListRequest.md)| Request Body | 

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


