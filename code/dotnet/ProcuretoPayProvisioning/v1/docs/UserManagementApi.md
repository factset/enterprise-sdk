# FactSet.SDK.ProcuretoPayProvisioning.Api.UserManagementApi

All URIs are relative to *https://api.factset.com/procuretopay/provisioning*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CancelIndividualPost**](UserManagementApi.md#cancelindividualpost) | **POST** /cancelIndividual | Cancels an individual&#39;s serial and all productIds
[**CreateIndividualPost**](UserManagementApi.md#createindividualpost) | **POST** /createIndividual | Provisions an individual for FactSet
[**GetIndividualGet**](UserManagementApi.md#getindividualget) | **GET** /getIndividual | Returns an individual&#39;s details by uniqueId
[**ListIndividualsGet**](UserManagementApi.md#listindividualsget) | **GET** /listIndividuals | Lists all individuals with details at all locations.
[**ModifyIndividualPost**](UserManagementApi.md#modifyindividualpost) | **POST** /modifyIndividual | Modifies an individual&#39;s attributes as determined by the uniqueId in the body of the request. Please note that the uniqueId may not be changed. Fields not changing may be passed as NULL but never empty.


<a name="cancelindividualpost"></a>
# **CancelIndividualPost**
> InlineResponse202 CancelIndividualPost (CancelIndividual cancelIndividual = null)

Cancels an individual's serial and all productIds

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
    public class CancelIndividualPostExample
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

            var apiInstance = new UserManagementApi(config);
            var cancelIndividual = new CancelIndividual(); // CancelIndividual |  (optional) 

            try
            {
                // Cancels an individual's serial and all productIds
                InlineResponse202 result = apiInstance.CancelIndividualPost(cancelIndividual);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling UserManagementApi.CancelIndividualPost: " + e.Message );
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
 **cancelIndividual** | [**CancelIndividual**](CancelIndividual.md)|  | [optional] 

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

<a name="createindividualpost"></a>
# **CreateIndividualPost**
> InlineResponse202 CreateIndividualPost (CreateIndividual createIndividual = null)

Provisions an individual for FactSet

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
    public class CreateIndividualPostExample
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

            var apiInstance = new UserManagementApi(config);
            var createIndividual = new CreateIndividual(); // CreateIndividual |  (optional) 

            try
            {
                // Provisions an individual for FactSet
                InlineResponse202 result = apiInstance.CreateIndividualPost(createIndividual);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling UserManagementApi.CreateIndividualPost: " + e.Message );
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
 **createIndividual** | [**CreateIndividual**](CreateIndividual.md)|  | [optional] 

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

<a name="getindividualget"></a>
# **GetIndividualGet**
> GetIndividual GetIndividualGet (string uniqueid)

Returns an individual's details by uniqueId

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
    public class GetIndividualGetExample
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

            var apiInstance = new UserManagementApi(config);
            var uniqueid = jdoe113901;  // string | uniqueId to query

            try
            {
                // Returns an individual's details by uniqueId
                GetIndividual result = apiInstance.GetIndividualGet(uniqueid);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling UserManagementApi.GetIndividualGet: " + e.Message );
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
 **uniqueid** | **string**| uniqueId to query | 

### Return type

[**GetIndividual**](GetIndividual.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8, text/plain


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
| **400** | Bad Request |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
| **401** | Unauthenticated |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
| **403** | Unauthorized |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
| **429** | Rate limit reached |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="listindividualsget"></a>
# **ListIndividualsGet**
> List&lt;Object&gt; ListIndividualsGet (bool? includeProductIds = null)

Lists all individuals with details at all locations.

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
    public class ListIndividualsGetExample
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

            var apiInstance = new UserManagementApi(config);
            var includeProductIds = true;  // bool? | <br>Optional, if =TRUE will return additional product array per object with all productIds for all returned individuals.</br> (optional) 

            try
            {
                // Lists all individuals with details at all locations.
                List<Object> result = apiInstance.ListIndividualsGet(includeProductIds);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling UserManagementApi.ListIndividualsGet: " + e.Message );
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
 **includeProductIds** | **bool?**| &lt;br&gt;Optional, if &#x3D;TRUE will return additional product array per object with all productIds for all returned individuals.&lt;/br&gt; | [optional] 

### Return type

**List<Object>**

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8, text/plain


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
| **400** | Bad Request |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
| **401** | Unauthenticated |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
| **403** | Unauthorized |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
| **429** | Rate limit reached |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="modifyindividualpost"></a>
# **ModifyIndividualPost**
> InlineResponse202 ModifyIndividualPost (ModifyIndividual modifyIndividual = null)

Modifies an individual's attributes as determined by the uniqueId in the body of the request. Please note that the uniqueId may not be changed. Fields not changing may be passed as NULL but never empty.

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
    public class ModifyIndividualPostExample
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

            var apiInstance = new UserManagementApi(config);
            var modifyIndividual = new ModifyIndividual(); // ModifyIndividual |  (optional) 

            try
            {
                // Modifies an individual's attributes as determined by the uniqueId in the body of the request. Please note that the uniqueId may not be changed. Fields not changing may be passed as NULL but never empty.
                InlineResponse202 result = apiInstance.ModifyIndividualPost(modifyIndividual);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling UserManagementApi.ModifyIndividualPost: " + e.Message );
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
 **modifyIndividual** | [**ModifyIndividual**](ModifyIndividual.md)|  | [optional] 

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

