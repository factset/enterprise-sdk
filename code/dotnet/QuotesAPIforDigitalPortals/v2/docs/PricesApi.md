# FactSet.SDK.QuotesAPIforDigitalPortals.Api.PricesApi

All URIs are relative to *http://api.factset.com/wealth/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetPricesBidAskGet**](PricesApi.md#getpricesbidaskget) | **GET** /prices/bidAsk/get | Current bid and ask prices (best bid / offer) for a notation.
[**GetPricesBidAskList**](PricesApi.md#getpricesbidasklist) | **GET** /prices/bidAsk/list | Current bid and ask prices (best bid / offer) for a list of notations.
[**GetPricesGet**](PricesApi.md#getpricesget) | **GET** /prices/get | Overview of trading on the current trading day, including the latest price, for a notation.
[**GetPricesList**](PricesApi.md#getpriceslist) | **GET** /prices/list | Overview of trading on the current trading day, including the latest price, for a list of notations.
[**GetPricesOrderbookAggregatedGet**](PricesApi.md#getpricesorderbookaggregatedget) | **GET** /prices/orderbook/aggregated/get | Orderbook aggregated by price.
[**GetPricesOrderbookFullGet**](PricesApi.md#getpricesorderbookfullget) | **GET** /prices/orderbook/full/get | Full orderbook
[**GetPricesTradingScheduleEventTypeList**](PricesApi.md#getpricestradingscheduleeventtypelist) | **GET** /prices/tradingSchedule/event/type/list | Trading schedule event types.
[**PostPricesTradingScheduleEventList**](PricesApi.md#postpricestradingscheduleeventlist) | **POST** /prices/tradingSchedule/event/list | Sequence of market-related events.


<a name="getpricesbidaskget"></a>
# **GetPricesBidAskGet**
> InlineResponse20081 GetPricesBidAskGet (string id, string quality = null, List<string> attributes = null, decimal? subscriptionMinimumInterval = null)

Current bid and ask prices (best bid / offer) for a notation.

Current bid and ask prices (best bid / offer) for a notation.  The endpoint is subscribable to provide push updates. See attribute `_subscriptionMinimalInterval` for valid update rates.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.QuotesAPIforDigitalPortals.Api;
using FactSet.SDK.QuotesAPIforDigitalPortals.Client;
using FactSet.SDK.QuotesAPIforDigitalPortals.Model;

namespace Example
{
    public class GetPricesBidAskGetExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.PAEngine.Client.Configuration();

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
            var quality = "RLT";  // string | Quality of the price. (optional)  (default to DLY)
            var attributes = new List<string>(); // List<string> | Limit the attributes returned in the response to the specified set. (optional) 
            var subscriptionMinimumInterval = 1000D;  // decimal? | Minimum number of milliseconds at which updates are send. (optional)  (default to 5000.0M)

            try
            {
                // Current bid and ask prices (best bid / offer) for a notation.
                InlineResponse20081 result = apiInstance.GetPricesBidAskGet(id, quality, attributes, subscriptionMinimumInterval);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling PricesApi.GetPricesBidAskGet: " + e.Message );
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
 **quality** | **string**| Quality of the price. | [optional] [default to DLY]
 **attributes** | [**List&lt;string&gt;**](string.md)| Limit the attributes returned in the response to the specified set. | [optional] 
 **subscriptionMinimumInterval** | **decimal?**| Minimum number of milliseconds at which updates are send. | [optional] [default to 5000.0M]

### Return type
[**InlineResponse20081**](InlineResponse20081.md)

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

<a name="getpricesbidasklist"></a>
# **GetPricesBidAskList**
> InlineResponse20082 GetPricesBidAskList (List<string> ids, string quality = null, bool? sameQuality = null, List<string> attributes = null)

Current bid and ask prices (best bid / offer) for a list of notations.

Current bid and ask prices (best bid / offer) for a list of notations.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.QuotesAPIforDigitalPortals.Api;
using FactSet.SDK.QuotesAPIforDigitalPortals.Client;
using FactSet.SDK.QuotesAPIforDigitalPortals.Model;

namespace Example
{
    public class GetPricesBidAskListExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.PAEngine.Client.Configuration();

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
            var ids = new List<string>(); // List<string> | List of notations.
            var quality = "RLT";  // string | Quality of the price. (optional)  (default to DLY)
            var sameQuality = true;  // bool? | Assure that the prices for all notations are of the same quality. (optional)  (default to true)
            var attributes = new List<string>(); // List<string> | Limit the attributes returned in the response to the specified set. (optional) 

            try
            {
                // Current bid and ask prices (best bid / offer) for a list of notations.
                InlineResponse20082 result = apiInstance.GetPricesBidAskList(ids, quality, sameQuality, attributes);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling PricesApi.GetPricesBidAskList: " + e.Message );
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
 **ids** | [**List&lt;string&gt;**](string.md)| List of notations. | 
 **quality** | **string**| Quality of the price. | [optional] [default to DLY]
 **sameQuality** | **bool?**| Assure that the prices for all notations are of the same quality. | [optional] [default to true]
 **attributes** | [**List&lt;string&gt;**](string.md)| Limit the attributes returned in the response to the specified set. | [optional] 

### Return type
[**InlineResponse20082**](InlineResponse20082.md)

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

<a name="getpricesget"></a>
# **GetPricesGet**
> InlineResponse20079 GetPricesGet (string id, string quality = null, List<string> attributes = null, decimal? subscriptionMinimumInterval = null)

Overview of trading on the current trading day, including the latest price, for a notation.

Overview of trading on the current trading day, including the latest price, for a notation.  The endpoint is subscribable to provide push updates. See attribute `_subscriptionMinimalInterval` for valid update rates.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.QuotesAPIforDigitalPortals.Api;
using FactSet.SDK.QuotesAPIforDigitalPortals.Client;
using FactSet.SDK.QuotesAPIforDigitalPortals.Model;

namespace Example
{
    public class GetPricesGetExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.PAEngine.Client.Configuration();

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
            var quality = "RLT";  // string | Quality of the price. (optional)  (default to DLY)
            var attributes = new List<string>(); // List<string> | Limit the attributes returned in the response to the specified set. (optional) 
            var subscriptionMinimumInterval = 1000D;  // decimal? | Minimum number of milliseconds at which updates are send. (optional)  (default to 5000.0M)

            try
            {
                // Overview of trading on the current trading day, including the latest price, for a notation.
                InlineResponse20079 result = apiInstance.GetPricesGet(id, quality, attributes, subscriptionMinimumInterval);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling PricesApi.GetPricesGet: " + e.Message );
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
 **quality** | **string**| Quality of the price. | [optional] [default to DLY]
 **attributes** | [**List&lt;string&gt;**](string.md)| Limit the attributes returned in the response to the specified set. | [optional] 
 **subscriptionMinimumInterval** | **decimal?**| Minimum number of milliseconds at which updates are send. | [optional] [default to 5000.0M]

### Return type
[**InlineResponse20079**](InlineResponse20079.md)

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

<a name="getpriceslist"></a>
# **GetPricesList**
> InlineResponse20080 GetPricesList (List<string> ids, string quality = null, bool? sameQuality = null, List<string> attributes = null)

Overview of trading on the current trading day, including the latest price, for a list of notations.

Overview of trading on the current trading day, including the latest price, for a list of notations.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.QuotesAPIforDigitalPortals.Api;
using FactSet.SDK.QuotesAPIforDigitalPortals.Client;
using FactSet.SDK.QuotesAPIforDigitalPortals.Model;

namespace Example
{
    public class GetPricesListExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.PAEngine.Client.Configuration();

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
            var ids = new List<string>(); // List<string> | List of notations.
            var quality = "RLT";  // string | Quality of the price. (optional)  (default to DLY)
            var sameQuality = true;  // bool? | Assure that the prices for all notations are of the same quality. (optional)  (default to true)
            var attributes = new List<string>(); // List<string> | Limit the attributes returned in the response to the specified set. (optional) 

            try
            {
                // Overview of trading on the current trading day, including the latest price, for a list of notations.
                InlineResponse20080 result = apiInstance.GetPricesList(ids, quality, sameQuality, attributes);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling PricesApi.GetPricesList: " + e.Message );
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
 **ids** | [**List&lt;string&gt;**](string.md)| List of notations. | 
 **quality** | **string**| Quality of the price. | [optional] [default to DLY]
 **sameQuality** | **bool?**| Assure that the prices for all notations are of the same quality. | [optional] [default to true]
 **attributes** | [**List&lt;string&gt;**](string.md)| Limit the attributes returned in the response to the specified set. | [optional] 

### Return type
[**InlineResponse20080**](InlineResponse20080.md)

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

<a name="getpricesorderbookaggregatedget"></a>
# **GetPricesOrderbookAggregatedGet**
> InlineResponse20083 GetPricesOrderbookAggregatedGet (string id, string quality = null, List<string> attributes = null)

Orderbook aggregated by price.

Orderbook aggregated by price.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.QuotesAPIforDigitalPortals.Api;
using FactSet.SDK.QuotesAPIforDigitalPortals.Client;
using FactSet.SDK.QuotesAPIforDigitalPortals.Model;

namespace Example
{
    public class GetPricesOrderbookAggregatedGetExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.PAEngine.Client.Configuration();

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
            var quality = "RLT";  // string | Quality of the price. (optional)  (default to RLT)
            var attributes = new List<string>(); // List<string> | Limit the attributes returned in the response to the specified set. (optional) 

            try
            {
                // Orderbook aggregated by price.
                InlineResponse20083 result = apiInstance.GetPricesOrderbookAggregatedGet(id, quality, attributes);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling PricesApi.GetPricesOrderbookAggregatedGet: " + e.Message );
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
 **quality** | **string**| Quality of the price. | [optional] [default to RLT]
 **attributes** | [**List&lt;string&gt;**](string.md)| Limit the attributes returned in the response to the specified set. | [optional] 

### Return type
[**InlineResponse20083**](InlineResponse20083.md)

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

<a name="getpricesorderbookfullget"></a>
# **GetPricesOrderbookFullGet**
> InlineResponse20084 GetPricesOrderbookFullGet (string id, string quality = null, List<string> attributes = null)

Full orderbook

Full orderbook

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.QuotesAPIforDigitalPortals.Api;
using FactSet.SDK.QuotesAPIforDigitalPortals.Client;
using FactSet.SDK.QuotesAPIforDigitalPortals.Model;

namespace Example
{
    public class GetPricesOrderbookFullGetExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.PAEngine.Client.Configuration();

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
            var quality = "RLT";  // string | Quality of the price. (optional)  (default to RLT)
            var attributes = new List<string>(); // List<string> | Limit the attributes returned in the response to the specified set. (optional) 

            try
            {
                // Full orderbook
                InlineResponse20084 result = apiInstance.GetPricesOrderbookFullGet(id, quality, attributes);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling PricesApi.GetPricesOrderbookFullGet: " + e.Message );
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
 **quality** | **string**| Quality of the price. | [optional] [default to RLT]
 **attributes** | [**List&lt;string&gt;**](string.md)| Limit the attributes returned in the response to the specified set. | [optional] 

### Return type
[**InlineResponse20084**](InlineResponse20084.md)

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

<a name="getpricestradingscheduleeventtypelist"></a>
# **GetPricesTradingScheduleEventTypeList**
> InlineResponse20086 GetPricesTradingScheduleEventTypeList (List<string> attributes = null)

Trading schedule event types.

Trading schedule event types define the events which may occur during any period of trading. Types of trading schedule events are for instance OPEN, CLOSE, END_OF_DAY.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.QuotesAPIforDigitalPortals.Api;
using FactSet.SDK.QuotesAPIforDigitalPortals.Client;
using FactSet.SDK.QuotesAPIforDigitalPortals.Model;

namespace Example
{
    public class GetPricesTradingScheduleEventTypeListExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.PAEngine.Client.Configuration();

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
            var attributes = new List<string>(); // List<string> | Limit the attributes returned in the response to the specified set. (optional) 

            try
            {
                // Trading schedule event types.
                InlineResponse20086 result = apiInstance.GetPricesTradingScheduleEventTypeList(attributes);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling PricesApi.GetPricesTradingScheduleEventTypeList: " + e.Message );
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

### Return type
[**InlineResponse20086**](InlineResponse20086.md)

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

<a name="postpricestradingscheduleeventlist"></a>
# **PostPricesTradingScheduleEventList**
> InlineResponse20085 PostPricesTradingScheduleEventList (InlineObject21 body)

Sequence of market-related events.

Sequence of market-related events like the opening time or closing time of a market of a specific notation.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.QuotesAPIforDigitalPortals.Api;
using FactSet.SDK.QuotesAPIforDigitalPortals.Client;
using FactSet.SDK.QuotesAPIforDigitalPortals.Model;

namespace Example
{
    public class PostPricesTradingScheduleEventListExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.PAEngine.Client.Configuration();

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
            var body = new InlineObject21(); // InlineObject21 | 

            try
            {
                // Sequence of market-related events.
                InlineResponse20085 result = apiInstance.PostPricesTradingScheduleEventList(body);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling PricesApi.PostPricesTradingScheduleEventList: " + e.Message );
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
 **body** | [**InlineObject21**](InlineObject21.md)|  | 

### Return type
[**InlineResponse20085**](InlineResponse20085.md)

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

