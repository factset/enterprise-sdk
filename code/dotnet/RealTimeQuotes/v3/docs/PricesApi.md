# FactSet.SDK.RealTimeQuotes.Api.PricesApi

All URIs are relative to *https://api.factset.com/wealth/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetPricesBidAskGet**](PricesApi.md#getpricesbidaskget) | **GET** /prices/bidAsk/get | Most recent bid and ask prices (best bid / offer) for a notation.
[**GetPricesBidAskList**](PricesApi.md#getpricesbidasklist) | **GET** /prices/bidAsk/list | Most recent bid and ask prices (best bid / offer) for a list of notations.
[**GetPricesGet**](PricesApi.md#getpricesget) | **GET** /prices/get | Overview of trading on the most recent trading day, including the latest price, for a notation.
[**GetPricesList**](PricesApi.md#getpriceslist) | **GET** /prices/list | Overview of trading on the most recent trading day, including the latest price, for a list of notations.
[**GetPricesOrderbookAggregatedGet**](PricesApi.md#getpricesorderbookaggregatedget) | **GET** /prices/orderbook/aggregated/get | Orderbook aggregated by price.
[**GetPricesOrderbookFullGet**](PricesApi.md#getpricesorderbookfullget) | **GET** /prices/orderbook/full/get | Full orderbook
[**GetPricesTradingScheduleEventTypeList**](PricesApi.md#getpricestradingscheduleeventtypelist) | **GET** /prices/tradingSchedule/event/type/list | Trading schedule event types.
[**PostPricesTradingScheduleEventList**](PricesApi.md#postpricestradingscheduleeventlist) | **POST** /prices/tradingSchedule/event/list | Sequence of market-related events.



<a name="getpricesbidaskget"></a>
# **GetPricesBidAskGet**
> InlineResponse20091 GetPricesBidAskGet (string identifier, string identifierType, string quality = null, List<string> attributes = null, decimal? subscriptionMinimumInterval = null)

Most recent bid and ask prices (best bid / offer) for a notation.

Most recent bid and ask prices (best bid / offer) for a notation.  The endpoint is subscribable to provide push updates. See attribute `_subscriptionMinimalInterval` for valid update rates.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.RealTimeQuotes.Api;
using FactSet.SDK.RealTimeQuotes.Client;
using FactSet.SDK.RealTimeQuotes.Model;

namespace Example
{
    public class GetPricesBidAskGetExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.RealTimeQuotes.Client.Configuration();

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

            var identifier = "identifier_example";  // string | 
            var identifierType = "idNotation";  // string | 
            var quality = "RLT";  // string |  (optional)  (default to DLY)
            var attributes = new List<string>(); // List<string> | Limit the attributes returned in the response to the specified set. (optional) 
            var subscriptionMinimumInterval = 1000D;  // decimal? | Minimum number of milliseconds at which updates are send. (optional)  (default to 5000M)

            try
            {
                // Most recent bid and ask prices (best bid / offer) for a notation.
                InlineResponse20091 result = apiInstance.GetPricesBidAskGet(identifier, identifierType, quality, attributes, subscriptionMinimumInterval);
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
 **identifier** | **string**|  | 
 **identifierType** | **string**|  | 
 **quality** | **string**|  | [optional] [default to DLY]
 **attributes** | [**List&lt;string&gt;**](string.md)| Limit the attributes returned in the response to the specified set. | [optional] 
 **subscriptionMinimumInterval** | **decimal?**| Minimum number of milliseconds at which updates are send. | [optional] [default to 5000M]

### Return type
[**InlineResponse20091**](InlineResponse20091.md)

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
> InlineResponse20092 GetPricesBidAskList (List<string> identifiers, string identifierType, string quality = null, bool? sameQuality = null, List<string> attributes = null)

Most recent bid and ask prices (best bid / offer) for a list of notations.

Most recent bid and ask prices (best bid / offer) for a list of notations.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.RealTimeQuotes.Api;
using FactSet.SDK.RealTimeQuotes.Client;
using FactSet.SDK.RealTimeQuotes.Model;

namespace Example
{
    public class GetPricesBidAskListExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.RealTimeQuotes.Client.Configuration();

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

            var identifiers = new List<string>(); // List<string> | 
            var identifierType = "idNotation";  // string | 
            var quality = "RLT";  // string |  (optional)  (default to DLY)
            var sameQuality = true;  // bool? |  (optional)  (default to true)
            var attributes = new List<string>(); // List<string> | Limit the attributes returned in the response to the specified set. (optional) 

            try
            {
                // Most recent bid and ask prices (best bid / offer) for a list of notations.
                InlineResponse20092 result = apiInstance.GetPricesBidAskList(identifiers, identifierType, quality, sameQuality, attributes);
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
 **identifiers** | [**List&lt;string&gt;**](string.md)|  | 
 **identifierType** | **string**|  | 
 **quality** | **string**|  | [optional] [default to DLY]
 **sameQuality** | **bool?**|  | [optional] [default to true]
 **attributes** | [**List&lt;string&gt;**](string.md)| Limit the attributes returned in the response to the specified set. | [optional] 

### Return type
[**InlineResponse20092**](InlineResponse20092.md)

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
> InlineResponse20089 GetPricesGet (string identifier, string identifierType, string quality = null, List<string> attributes = null, decimal? subscriptionMinimumInterval = null)

Overview of trading on the most recent trading day, including the latest price, for a notation.

Overview of trading on the most recent trading day, including the latest price, for a notation.  The endpoint is subscribable to provide push updates. See attribute `_subscriptionMinimalInterval` for valid update rates.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.RealTimeQuotes.Api;
using FactSet.SDK.RealTimeQuotes.Client;
using FactSet.SDK.RealTimeQuotes.Model;

namespace Example
{
    public class GetPricesGetExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.RealTimeQuotes.Client.Configuration();

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

            var identifier = "identifier_example";  // string | 
            var identifierType = "idNotation";  // string | 
            var quality = "RLT";  // string |  (optional)  (default to DLY)
            var attributes = new List<string>(); // List<string> | Limit the attributes returned in the response to the specified set. (optional) 
            var subscriptionMinimumInterval = 1000D;  // decimal? | Minimum number of milliseconds at which updates are sent. (optional)  (default to 5000M)

            try
            {
                // Overview of trading on the most recent trading day, including the latest price, for a notation.
                InlineResponse20089 result = apiInstance.GetPricesGet(identifier, identifierType, quality, attributes, subscriptionMinimumInterval);
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
 **identifier** | **string**|  | 
 **identifierType** | **string**|  | 
 **quality** | **string**|  | [optional] [default to DLY]
 **attributes** | [**List&lt;string&gt;**](string.md)| Limit the attributes returned in the response to the specified set. | [optional] 
 **subscriptionMinimumInterval** | **decimal?**| Minimum number of milliseconds at which updates are sent. | [optional] [default to 5000M]

### Return type
[**InlineResponse20089**](InlineResponse20089.md)

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
> InlineResponse20090 GetPricesList (List<string> identifiers, string identifierType, string quality = null, bool? sameQuality = null, List<string> attributes = null)

Overview of trading on the most recent trading day, including the latest price, for a list of notations.

Overview of trading on the most recent trading day, including the latest price, for a list of notations.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.RealTimeQuotes.Api;
using FactSet.SDK.RealTimeQuotes.Client;
using FactSet.SDK.RealTimeQuotes.Model;

namespace Example
{
    public class GetPricesListExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.RealTimeQuotes.Client.Configuration();

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

            var identifiers = new List<string>(); // List<string> | 
            var identifierType = "idNotation";  // string | 
            var quality = "RLT";  // string |  (optional)  (default to DLY)
            var sameQuality = true;  // bool? |  (optional)  (default to true)
            var attributes = new List<string>(); // List<string> | Limit the attributes returned in the response to the specified set. (optional) 

            try
            {
                // Overview of trading on the most recent trading day, including the latest price, for a list of notations.
                InlineResponse20090 result = apiInstance.GetPricesList(identifiers, identifierType, quality, sameQuality, attributes);
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
 **identifiers** | [**List&lt;string&gt;**](string.md)|  | 
 **identifierType** | **string**|  | 
 **quality** | **string**|  | [optional] [default to DLY]
 **sameQuality** | **bool?**|  | [optional] [default to true]
 **attributes** | [**List&lt;string&gt;**](string.md)| Limit the attributes returned in the response to the specified set. | [optional] 

### Return type
[**InlineResponse20090**](InlineResponse20090.md)

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
> InlineResponse20093 GetPricesOrderbookAggregatedGet (string identifier, string identifierType, string quality = null, List<string> attributes = null, decimal? subscriptionMinimumInterval = null)

Orderbook aggregated by price.

Orderbook aggregated by price.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.RealTimeQuotes.Api;
using FactSet.SDK.RealTimeQuotes.Client;
using FactSet.SDK.RealTimeQuotes.Model;

namespace Example
{
    public class GetPricesOrderbookAggregatedGetExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.RealTimeQuotes.Client.Configuration();

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

            var identifier = "identifier_example";  // string | 
            var identifierType = "idNotation";  // string | 
            var quality = "RLT";  // string |  (optional)  (default to RLT)
            var attributes = new List<string>(); // List<string> | Limit the attributes returned in the response to the specified set. (optional) 
            var subscriptionMinimumInterval = 1000D;  // decimal? | Non-negative number of milliseconds to throttle the update rate. (optional)  (default to 5000M)

            try
            {
                // Orderbook aggregated by price.
                InlineResponse20093 result = apiInstance.GetPricesOrderbookAggregatedGet(identifier, identifierType, quality, attributes, subscriptionMinimumInterval);
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
 **identifier** | **string**|  | 
 **identifierType** | **string**|  | 
 **quality** | **string**|  | [optional] [default to RLT]
 **attributes** | [**List&lt;string&gt;**](string.md)| Limit the attributes returned in the response to the specified set. | [optional] 
 **subscriptionMinimumInterval** | **decimal?**| Non-negative number of milliseconds to throttle the update rate. | [optional] [default to 5000M]

### Return type
[**InlineResponse20093**](InlineResponse20093.md)

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
> InlineResponse20094 GetPricesOrderbookFullGet (string identifier, string identifierType, string quality = null, List<string> attributes = null, decimal? subscriptionMinimumInterval = null)

Full orderbook

Full orderbook

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.RealTimeQuotes.Api;
using FactSet.SDK.RealTimeQuotes.Client;
using FactSet.SDK.RealTimeQuotes.Model;

namespace Example
{
    public class GetPricesOrderbookFullGetExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.RealTimeQuotes.Client.Configuration();

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

            var identifier = "identifier_example";  // string | 
            var identifierType = "idNotation";  // string | 
            var quality = "RLT";  // string |  (optional)  (default to RLT)
            var attributes = new List<string>(); // List<string> | Limit the attributes returned in the response to the specified set. (optional) 
            var subscriptionMinimumInterval = 1000D;  // decimal? | Non-negative number of milliseconds to throttle the update rate. (optional)  (default to 5000M)

            try
            {
                // Full orderbook
                InlineResponse20094 result = apiInstance.GetPricesOrderbookFullGet(identifier, identifierType, quality, attributes, subscriptionMinimumInterval);
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
 **identifier** | **string**|  | 
 **identifierType** | **string**|  | 
 **quality** | **string**|  | [optional] [default to RLT]
 **attributes** | [**List&lt;string&gt;**](string.md)| Limit the attributes returned in the response to the specified set. | [optional] 
 **subscriptionMinimumInterval** | **decimal?**| Non-negative number of milliseconds to throttle the update rate. | [optional] [default to 5000M]

### Return type
[**InlineResponse20094**](InlineResponse20094.md)

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
> InlineResponse20096 GetPricesTradingScheduleEventTypeList (List<string> attributes = null)

Trading schedule event types.

Trading schedule event types define the events which may occur during any period of trading. Types of trading schedule events are for instance OPEN, CLOSE, END_OF_DAY.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.RealTimeQuotes.Api;
using FactSet.SDK.RealTimeQuotes.Client;
using FactSet.SDK.RealTimeQuotes.Model;

namespace Example
{
    public class GetPricesTradingScheduleEventTypeListExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.RealTimeQuotes.Client.Configuration();

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

            var attributes = new List<string>(); // List<string> | Limit the attributes returned in the response to the specified set. (optional) 

            try
            {
                // Trading schedule event types.
                InlineResponse20096 result = apiInstance.GetPricesTradingScheduleEventTypeList(attributes);
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
[**InlineResponse20096**](InlineResponse20096.md)

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
> InlineResponse20095 PostPricesTradingScheduleEventList (PostPricesTradingScheduleEventListRequest postPricesTradingScheduleEventListRequest)

Sequence of market-related events.

Sequence of market-related events like the opening time or closing time of a market of a specific notation.<br><br>Pagination to a previous page is not supported and `pagination.previous` is always `null`.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.RealTimeQuotes.Api;
using FactSet.SDK.RealTimeQuotes.Client;
using FactSet.SDK.RealTimeQuotes.Model;

namespace Example
{
    public class PostPricesTradingScheduleEventListExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.RealTimeQuotes.Client.Configuration();

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

            var postPricesTradingScheduleEventListRequest = new PostPricesTradingScheduleEventListRequest(); // PostPricesTradingScheduleEventListRequest | Request Body

            try
            {
                // Sequence of market-related events.
                InlineResponse20095 result = apiInstance.PostPricesTradingScheduleEventList(postPricesTradingScheduleEventListRequest);
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
 **postPricesTradingScheduleEventListRequest** | [**PostPricesTradingScheduleEventListRequest**](PostPricesTradingScheduleEventListRequest.md)| Request Body | 

### Return type
[**InlineResponse20095**](InlineResponse20095.md)

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


