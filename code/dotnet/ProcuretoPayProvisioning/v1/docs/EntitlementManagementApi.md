# FactSet.SDK.ProcuretoPayProvisioning.Api.EntitlementManagementApi

All URIs are relative to *https://api.factset.com/procuretopay/provisioning*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AddProductsPost**](EntitlementManagementApi.md#addproductspost) | **POST** /addProducts | Adds listed productIds to an individual
[**RemoveProductsPost**](EntitlementManagementApi.md#removeproductspost) | **POST** /removeProducts | Removes listed productIds from an individual


<a name="addproductspost"></a>
# **AddProductsPost**
> InlineResponse202 AddProductsPost (ManageProductIds manageProductIds = null)

Adds listed productIds to an individual

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.ProcuretoPayProvisioning.Api;
using FactSet.SDK.ProcuretoPayProvisioning.Client;
using FactSet.SDK.ProcuretoPayProvisioning.Model;

namespace Example
{
    public class AddProductsPostExample
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

            var apiInstance = new EntitlementManagementApi(config);
            var manageProductIds = new ManageProductIds(); // ManageProductIds |  (optional) 

            try
            {
                // Adds listed productIds to an individual
                InlineResponse202 result = apiInstance.AddProductsPost(manageProductIds);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling EntitlementManagementApi.AddProductsPost: " + e.Message );
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
 **manageProductIds** | [**ManageProductIds**](ManageProductIds.md)|  | [optional] 

### Return type

[**InlineResponse202**](InlineResponse202.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json; charset=utf-8, text/plain


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Accepted |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
| **400** | Bad Request |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
| **401** | Unauthenticated |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
| **403** | Unauthorized |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
| **429** | Rate limit reached |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="removeproductspost"></a>
# **RemoveProductsPost**
> InlineResponse202 RemoveProductsPost (ManageProductIds manageProductIds = null)

Removes listed productIds from an individual

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.ProcuretoPayProvisioning.Api;
using FactSet.SDK.ProcuretoPayProvisioning.Client;
using FactSet.SDK.ProcuretoPayProvisioning.Model;

namespace Example
{
    public class RemoveProductsPostExample
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

            var apiInstance = new EntitlementManagementApi(config);
            var manageProductIds = new ManageProductIds(); // ManageProductIds |  (optional) 

            try
            {
                // Removes listed productIds from an individual
                InlineResponse202 result = apiInstance.RemoveProductsPost(manageProductIds);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling EntitlementManagementApi.RemoveProductsPost: " + e.Message );
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
 **manageProductIds** | [**ManageProductIds**](ManageProductIds.md)|  | [optional] 

### Return type

[**InlineResponse202**](InlineResponse202.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json; charset=utf-8, text/plain


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Accepted |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
| **400** | Bad Request |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
| **401** | Unauthenticated |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
| **403** | Unauthorized |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
| **429** | Rate limit reached |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

