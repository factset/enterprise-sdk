# FactSet.SDK.PriceAlertingAPIforDigitalPortals.Api.AlertingApi

All URIs are relative to *https://api.factset.com/wealth/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetAlertingPricesBasicAlertGet**](AlertingApi.md#getalertingpricesbasicalertget) | **GET** /alerting/prices/basic/alert/get | Details of an alert.
[**GetAlertingPricesBasicAlertList**](AlertingApi.md#getalertingpricesbasicalertlist) | **GET** /alerting/prices/basic/alert/list | List of alerts.
[**GetAlertingPricesBasicTriggerGet**](AlertingApi.md#getalertingpricesbasictriggerget) | **GET** /alerting/prices/basic/trigger/get | Details of a trigger.
[**PostAlertingPricesBasicTriggerList**](AlertingApi.md#postalertingpricesbasictriggerlist) | **POST** /alerting/prices/basic/trigger/list | List of triggers.


<a name="getalertingpricesbasicalertget"></a>
# **GetAlertingPricesBasicAlertGet**
> InlineResponse200 GetAlertingPricesBasicAlertGet (string id, List<string> attributes = null)

Details of an alert.

Details of an alert. The details include the trigger definition at the time of alert creation.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.PriceAlertingAPIforDigitalPortals.Api;
using FactSet.SDK.PriceAlertingAPIforDigitalPortals.Client;
using FactSet.SDK.PriceAlertingAPIforDigitalPortals.Model;

namespace Example
{
    public class GetAlertingPricesBasicAlertGetExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.PriceAlertingAPIforDigitalPortals.Client.Configuration();

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

            var apiInstance = new AlertingApi(config);

            var id = "id_example";  // string | 
            var attributes = new List<string>(); // List<string> | Limit the attributes returned in the response to the specified set. (optional) 

            try
            {
                // Details of an alert.
                InlineResponse200 result = apiInstance.GetAlertingPricesBasicAlertGet(id, attributes);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling AlertingApi.GetAlertingPricesBasicAlertGet: " + e.Message );
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
 **id** | **string**|  | 
 **attributes** | [**List&lt;string&gt;**](string.md)| Limit the attributes returned in the response to the specified set. | [optional] 

### Return type
[**InlineResponse200**](InlineResponse200.md)

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

<a name="getalertingpricesbasicalertlist"></a>
# **GetAlertingPricesBasicAlertList**
> InlineResponse2001 GetAlertingPricesBasicAlertList (List<string> attributes = null, decimal? subscriptionMinimumInterval = null, string paginationCursor = null, decimal? paginationLimit = null)

List of alerts.

List of alerts in descending order of creation.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.PriceAlertingAPIforDigitalPortals.Api;
using FactSet.SDK.PriceAlertingAPIforDigitalPortals.Client;
using FactSet.SDK.PriceAlertingAPIforDigitalPortals.Model;

namespace Example
{
    public class GetAlertingPricesBasicAlertListExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.PriceAlertingAPIforDigitalPortals.Client.Configuration();

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

            var apiInstance = new AlertingApi(config);

            var attributes = new List<string>(); // List<string> | Limit the attributes returned in the response to the specified set. (optional) 
            var subscriptionMinimumInterval = 0MD;  // decimal? | Non-negative number of milliseconds to throttle the update rate from 0ms to 5000ms. Set to 0 for sending updates immediately. (optional)  (default to 0M)
            var paginationCursor = "paginationCursor_example";  // string | Starting point as returned in the attributes `pagination.next` or `pagination.previous` by a prior invocation of this endpoint, or undefined (default). (optional) 
            var paginationLimit = 20MD;  // decimal? | Non-negative maximum number of entries to return. (optional)  (default to 20M)

            try
            {
                // List of alerts.
                InlineResponse2001 result = apiInstance.GetAlertingPricesBasicAlertList(attributes, subscriptionMinimumInterval, paginationCursor, paginationLimit);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling AlertingApi.GetAlertingPricesBasicAlertList: " + e.Message );
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
 **subscriptionMinimumInterval** | **decimal?**| Non-negative number of milliseconds to throttle the update rate from 0ms to 5000ms. Set to 0 for sending updates immediately. | [optional] [default to 0M]
 **paginationCursor** | **string**| Starting point as returned in the attributes &#x60;pagination.next&#x60; or &#x60;pagination.previous&#x60; by a prior invocation of this endpoint, or undefined (default). | [optional] 
 **paginationLimit** | **decimal?**| Non-negative maximum number of entries to return. | [optional] [default to 20M]

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

<a name="getalertingpricesbasictriggerget"></a>
# **GetAlertingPricesBasicTriggerGet**
> InlineResponse2002 GetAlertingPricesBasicTriggerGet (string id, List<string> attributes = null)

Details of a trigger.

Details of a trigger.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.PriceAlertingAPIforDigitalPortals.Api;
using FactSet.SDK.PriceAlertingAPIforDigitalPortals.Client;
using FactSet.SDK.PriceAlertingAPIforDigitalPortals.Model;

namespace Example
{
    public class GetAlertingPricesBasicTriggerGetExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.PriceAlertingAPIforDigitalPortals.Client.Configuration();

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

            var apiInstance = new AlertingApi(config);

            var id = "id_example";  // string | 
            var attributes = new List<string>(); // List<string> | Limit the attributes returned in the response to the specified set. (optional) 

            try
            {
                // Details of a trigger.
                InlineResponse2002 result = apiInstance.GetAlertingPricesBasicTriggerGet(id, attributes);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling AlertingApi.GetAlertingPricesBasicTriggerGet: " + e.Message );
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
 **id** | **string**|  | 
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

<a name="postalertingpricesbasictriggerlist"></a>
# **PostAlertingPricesBasicTriggerList**
> InlineResponse2003 PostAlertingPricesBasicTriggerList (InlineObject inlineObject = null)

List of triggers.

Returns a list of triggers sorted in descending order of creation.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.PriceAlertingAPIforDigitalPortals.Api;
using FactSet.SDK.PriceAlertingAPIforDigitalPortals.Client;
using FactSet.SDK.PriceAlertingAPIforDigitalPortals.Model;

namespace Example
{
    public class PostAlertingPricesBasicTriggerListExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.PriceAlertingAPIforDigitalPortals.Client.Configuration();

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

            var apiInstance = new AlertingApi(config);

            var inlineObject = new InlineObject(); // InlineObject |  (optional) 

            try
            {
                // List of triggers.
                InlineResponse2003 result = apiInstance.PostAlertingPricesBasicTriggerList(inlineObject);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling AlertingApi.PostAlertingPricesBasicTriggerList: " + e.Message );
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
 **inlineObject** | [**InlineObject**](InlineObject.md)|  | [optional] 

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

