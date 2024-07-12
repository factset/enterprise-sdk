# FactSet.SDK.FactSetTrading.Api.ChildOrdersApi

All URIs are relative to *https://api.factset.com/trading/ems/v0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CancelChildOrder**](ChildOrdersApi.md#cancelchildorder) | **POST** /child-orders/cancel | Cancel Child Orders on Trading system
[**CreateChildOrder**](ChildOrdersApi.md#createchildorder) | **POST** /child-orders/create | Create Child Orders on Trading system.
[**ReplaceChildOrder**](ChildOrdersApi.md#replacechildorder) | **POST** /child-orders/replace | Replace the Child Orders on Trading system.



<a name="cancelchildorder"></a>
# **CancelChildOrder**
> ChildOrdersResponseRoot CancelChildOrder (CancelChildOrdersRoot cancelChildOrdersRoot = null)

Cancel Child Orders on Trading system

This endpoint is used to cancel a specific child order on Trading system.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetTrading.Api;
using FactSet.SDK.FactSetTrading.Client;
using FactSet.SDK.FactSetTrading.Model;

namespace Example
{
    public class CancelChildOrderExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetTrading.Client.Configuration();

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

            var apiInstance = new ChildOrdersApi(config);

            var cancelChildOrdersRoot = new CancelChildOrdersRoot(); // CancelChildOrdersRoot |  (optional) 

            try
            {
                // Cancel Child Orders on Trading system
                ChildOrdersResponseRoot result = apiInstance.CancelChildOrder(cancelChildOrdersRoot);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling ChildOrdersApi.CancelChildOrder: " + e.Message );
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
 **cancelChildOrdersRoot** | [**CancelChildOrdersRoot**](CancelChildOrdersRoot.md)|  | [optional] 

### Return type
[**ChildOrdersResponseRoot**](ChildOrdersResponseRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Expected response. |  -  |
| **400** | Invalid parameters provided. |  -  |
| **401** | Missing or invalid authentication. |  -  |
| **403** | User is forbidden with current credentials. |  -  |
| **415** | Missing/Invalid Content-Type header. Header needs to be set to application/json. |  -  |
| **429** | Rate limit reached. Wait before sending further requests. |  -  |
| **500** | Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting. |  -  |
| **503** | Request timed out. Retry the request in sometime. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="createchildorder"></a>
# **CreateChildOrder**
> CreateChildOrdersResponseRoot CreateChildOrder (ChildOrdersRoot childOrdersRoot = null)

Create Child Orders on Trading system.

This endpoint is used to create child orders on Trading system.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetTrading.Api;
using FactSet.SDK.FactSetTrading.Client;
using FactSet.SDK.FactSetTrading.Model;

namespace Example
{
    public class CreateChildOrderExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetTrading.Client.Configuration();

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

            var apiInstance = new ChildOrdersApi(config);

            var childOrdersRoot = new ChildOrdersRoot(); // ChildOrdersRoot |  (optional) 

            try
            {
                // Create Child Orders on Trading system.
                CreateChildOrdersResponseRoot result = apiInstance.CreateChildOrder(childOrdersRoot);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling ChildOrdersApi.CreateChildOrder: " + e.Message );
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
 **childOrdersRoot** | [**ChildOrdersRoot**](ChildOrdersRoot.md)|  | [optional] 

### Return type
[**CreateChildOrdersResponseRoot**](CreateChildOrdersResponseRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Expected response. |  -  |
| **400** | Invalid parameters provided. |  -  |
| **401** | Missing or invalid authentication. |  -  |
| **403** | User is forbidden with current credentials. |  -  |
| **415** | Missing/Invalid Content-Type header. Header needs to be set to application/json. |  -  |
| **429** | Rate limit reached. Wait before sending further requests. |  -  |
| **500** | Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting. |  -  |
| **503** | Request timed out. Retry the request in sometime. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="replacechildorder"></a>
# **ReplaceChildOrder**
> ChildOrdersResponseRoot ReplaceChildOrder (ReplaceChildOrdersRoot replaceChildOrdersRoot = null)

Replace the Child Orders on Trading system.

This endpoint takes the child order to be replaced on the Trading system.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetTrading.Api;
using FactSet.SDK.FactSetTrading.Client;
using FactSet.SDK.FactSetTrading.Model;

namespace Example
{
    public class ReplaceChildOrderExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetTrading.Client.Configuration();

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

            var apiInstance = new ChildOrdersApi(config);

            var replaceChildOrdersRoot = new ReplaceChildOrdersRoot(); // ReplaceChildOrdersRoot |  (optional) 

            try
            {
                // Replace the Child Orders on Trading system.
                ChildOrdersResponseRoot result = apiInstance.ReplaceChildOrder(replaceChildOrdersRoot);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling ChildOrdersApi.ReplaceChildOrder: " + e.Message );
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
 **replaceChildOrdersRoot** | [**ReplaceChildOrdersRoot**](ReplaceChildOrdersRoot.md)|  | [optional] 

### Return type
[**ChildOrdersResponseRoot**](ChildOrdersResponseRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Expected response. |  -  |
| **400** | Invalid parameters provided. |  -  |
| **401** | Missing or invalid authentication. |  -  |
| **403** | User is forbidden with current credentials. |  -  |
| **415** | Missing/Invalid Content-Type header. Header needs to be set to application/json. |  -  |
| **429** | Rate limit reached. Wait before sending further requests. |  -  |
| **500** | Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting. |  -  |
| **503** | Request timed out. Retry the request in sometime. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


