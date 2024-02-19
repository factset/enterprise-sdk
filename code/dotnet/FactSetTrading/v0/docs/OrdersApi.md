# FactSet.SDK.FactSetTrading.Api.OrdersApi

All URIs are relative to *https://api.factset.com/trading/ems/v0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**Cancel**](OrdersApi.md#cancel) | **POST** /orders/cancel | Cancel the orders on EMS system.
[**Create**](OrdersApi.md#create) | **POST** /orders/create | Send orders to EMS for execution.
[**Replace**](OrdersApi.md#replace) | **POST** /orders/replace | Replace the orders on EMS system.



<a name="cancel"></a>
# **Cancel**
> EMSOrdersResponseRoot Cancel (EMSCancelOrdersRoot eMSCancelOrdersRoot = null)

Cancel the orders on EMS system.

This endpoint takes the list of orders to be cancelled on the EMS system.

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
    public class CancelExample
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

            var apiInstance = new OrdersApi(config);

            var eMSCancelOrdersRoot = new EMSCancelOrdersRoot(); // EMSCancelOrdersRoot |  (optional) 

            try
            {
                // Cancel the orders on EMS system.
                EMSOrdersResponseRoot result = apiInstance.Cancel(eMSCancelOrdersRoot);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling OrdersApi.Cancel: " + e.Message );
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
 **eMSCancelOrdersRoot** | [**EMSCancelOrdersRoot**](EMSCancelOrdersRoot.md)|  | [optional] 

### Return type
[**EMSOrdersResponseRoot**](EMSOrdersResponseRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Expected response, returns the list of order ids. |  -  |
| **400** | Invalid post body parameters. |  -  |
| **401** | Missing or invalid authentication. |  -  |
| **403** | User is forbidden with current credentials. |  -  |
| **415** | Missing/Invalid Content-Type header. Header needs to be set to application/json. |  -  |
| **429** | Rate limit reached. Wait before sending further requests. |  -  |
| **500** | Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting. |  -  |
| **503** | Request timed out. Retry the request in sometime. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="create"></a>
# **Create**
> EMSOrdersResponseRoot Create (EMSOrdersRoot eMSOrdersRoot = null)

Send orders to EMS for execution.

This endpoint takes the list of orders and place them on EMS for execution.

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
    public class CreateExample
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

            var apiInstance = new OrdersApi(config);

            var eMSOrdersRoot = new EMSOrdersRoot(); // EMSOrdersRoot |  (optional) 

            try
            {
                // Send orders to EMS for execution.
                EMSOrdersResponseRoot result = apiInstance.Create(eMSOrdersRoot);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling OrdersApi.Create: " + e.Message );
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
 **eMSOrdersRoot** | [**EMSOrdersRoot**](EMSOrdersRoot.md)|  | [optional] 

### Return type
[**EMSOrdersResponseRoot**](EMSOrdersResponseRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Expected response, returns the list of orders. |  -  |
| **400** | Invalid post body parameters. |  -  |
| **401** | Missing or invalid authentication. |  -  |
| **403** | User is forbidden with current credentials. |  -  |
| **415** | Missing/Invalid Content-Type header. Header needs to be set to application/json. |  -  |
| **429** | Rate limit reached. Wait before sending further requests. |  -  |
| **500** | Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting. |  -  |
| **503** | Request timed out. Retry the request in sometime. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="replace"></a>
# **Replace**
> EMSOrdersResponseRoot Replace (EMSReplaceOrdersRoot eMSReplaceOrdersRoot = null)

Replace the orders on EMS system.

This endpoint takes the list of orders to be replaced on the EMS system.

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
    public class ReplaceExample
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

            var apiInstance = new OrdersApi(config);

            var eMSReplaceOrdersRoot = new EMSReplaceOrdersRoot(); // EMSReplaceOrdersRoot |  (optional) 

            try
            {
                // Replace the orders on EMS system.
                EMSOrdersResponseRoot result = apiInstance.Replace(eMSReplaceOrdersRoot);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling OrdersApi.Replace: " + e.Message );
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
 **eMSReplaceOrdersRoot** | [**EMSReplaceOrdersRoot**](EMSReplaceOrdersRoot.md)|  | [optional] 

### Return type
[**EMSOrdersResponseRoot**](EMSOrdersResponseRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Expected response, returns the list of order ids. |  -  |
| **400** | Invalid post body parameters. |  -  |
| **401** | Missing or invalid authentication. |  -  |
| **403** | User is forbidden with current credentials. |  -  |
| **415** | Missing/Invalid Content-Type header. Header needs to be set to application/json. |  -  |
| **429** | Rate limit reached. Wait before sending further requests. |  -  |
| **500** | Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting. |  -  |
| **503** | Request timed out. Retry the request in sometime. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


