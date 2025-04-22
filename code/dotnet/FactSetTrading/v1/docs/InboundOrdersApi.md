# FactSet.SDK.FactSetTrading.Api.InboundOrdersApi

All URIs are relative to *https://api.factset.com/trading/ems/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**Cancel**](InboundOrdersApi.md#cancel) | **POST** /inbound-orders/cancel | Cancel the inbound orders on Trading system.
[**Create**](InboundOrdersApi.md#create) | **POST** /inbound-orders/create | Send inbound orders to Trading system for execution.
[**Replace**](InboundOrdersApi.md#replace) | **POST** /inbound-orders/replace | Replace the inbound orders on Trading system.



<a name="cancel"></a>
# **Cancel**
> InboundOrdersResponseRoot Cancel (CancelInboundOrdersRoot cancelInboundOrdersRoot = null)

Cancel the inbound orders on Trading system.

This endpoint takes the list of inbound orders to be cancelled on the Trading system.

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

            var apiInstance = new InboundOrdersApi(config);

            var cancelInboundOrdersRoot = new CancelInboundOrdersRoot(); // CancelInboundOrdersRoot |  (optional) 

            try
            {
                // Cancel the inbound orders on Trading system.
                InboundOrdersResponseRoot result = apiInstance.Cancel(cancelInboundOrdersRoot);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling InboundOrdersApi.Cancel: " + e.Message );
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
 **cancelInboundOrdersRoot** | [**CancelInboundOrdersRoot**](CancelInboundOrdersRoot.md)|  | [optional] 

### Return type
[**InboundOrdersResponseRoot**](InboundOrdersResponseRoot.md)

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
> InboundOrdersResponseRoot Create (InboundOrdersRoot inboundOrdersRoot = null)

Send inbound orders to Trading system for execution.

This endpoint takes the list of inbound orders and place them on Trading system for execution.

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

            var apiInstance = new InboundOrdersApi(config);

            var inboundOrdersRoot = new InboundOrdersRoot(); // InboundOrdersRoot |  (optional) 

            try
            {
                // Send inbound orders to Trading system for execution.
                InboundOrdersResponseRoot result = apiInstance.Create(inboundOrdersRoot);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling InboundOrdersApi.Create: " + e.Message );
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
 **inboundOrdersRoot** | [**InboundOrdersRoot**](InboundOrdersRoot.md)|  | [optional] 

### Return type
[**InboundOrdersResponseRoot**](InboundOrdersResponseRoot.md)

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
> InboundOrdersResponseRoot Replace (ReplaceInboundOrdersRoot replaceInboundOrdersRoot = null)

Replace the inbound orders on Trading system.

This endpoint takes the list of orders to be replaced on the Trading system.

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

            var apiInstance = new InboundOrdersApi(config);

            var replaceInboundOrdersRoot = new ReplaceInboundOrdersRoot(); // ReplaceInboundOrdersRoot |  (optional) 

            try
            {
                // Replace the inbound orders on Trading system.
                InboundOrdersResponseRoot result = apiInstance.Replace(replaceInboundOrdersRoot);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling InboundOrdersApi.Replace: " + e.Message );
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
 **replaceInboundOrdersRoot** | [**ReplaceInboundOrdersRoot**](ReplaceInboundOrdersRoot.md)|  | [optional] 

### Return type
[**InboundOrdersResponseRoot**](InboundOrdersResponseRoot.md)

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


