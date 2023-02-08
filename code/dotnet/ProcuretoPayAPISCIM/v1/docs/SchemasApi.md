# FactSet.SDK.ProcuretoPayAPISCIM.Api.SchemasApi

All URIs are relative to *https://api.factset.com/scim/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**SchemasGet**](SchemasApi.md#schemasget) | **GET** /Schemas | Get a list of schemas.
[**SchemasIdGet**](SchemasApi.md#schemasidget) | **GET** /Schemas/{id} | Get a schema.



<a name="schemasget"></a>
# **SchemasGet**
> SchemaList SchemasGet (int? startIndex = null, int? count = null)

Get a list of schemas.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.ProcuretoPayAPISCIM.Api;
using FactSet.SDK.ProcuretoPayAPISCIM.Client;
using FactSet.SDK.ProcuretoPayAPISCIM.Model;

namespace Example
{
    public class SchemasGetExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.ProcuretoPayAPISCIM.Client.Configuration();

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

            var apiInstance = new SchemasApi(config);

            var startIndex = 56;  // int? | Result start index. The one-based index of the first result to be returned in the list of resources. For example, to exclude the first two resources, use a *startIndex* value of 3. This parameter has a default value of 1. This index applies *after* any resource filtration has been applied as specified by the *filter* argument. (optional) 
            var count = 56;  // int? | Maximum resource count. The server will not return more resources than this value, although it may return fewer. (optional) 

            try
            {
                // Get a list of schemas.
                SchemaList result = apiInstance.SchemasGet(startIndex, count);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling SchemasApi.SchemasGet: " + e.Message );
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
 **startIndex** | **int?**| Result start index. The one-based index of the first result to be returned in the list of resources. For example, to exclude the first two resources, use a *startIndex* value of 3. This parameter has a default value of 1. This index applies *after* any resource filtration has been applied as specified by the *filter* argument. | [optional] 
 **count** | **int?**| Maximum resource count. The server will not return more resources than this value, although it may return fewer. | [optional] 

### Return type
[**SchemaList**](SchemaList.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/scim+json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. |  -  |
| **401** | User has not been authenticated. |  -  |
| **403** | User is not authorized to use this API. |  -  |
| **500** | Internal server error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="schemasidget"></a>
# **SchemasIdGet**
> Schema SchemasIdGet (string id)

Get a schema.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.ProcuretoPayAPISCIM.Api;
using FactSet.SDK.ProcuretoPayAPISCIM.Client;
using FactSet.SDK.ProcuretoPayAPISCIM.Model;

namespace Example
{
    public class SchemasIdGetExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.ProcuretoPayAPISCIM.Client.Configuration();

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

            var apiInstance = new SchemasApi(config);

            var id = "id_example";  // string | ID of resource.

            try
            {
                // Get a schema.
                Schema result = apiInstance.SchemasIdGet(id);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling SchemasApi.SchemasIdGet: " + e.Message );
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
 **id** | **string**| ID of resource. | 

### Return type
[**Schema**](Schema.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/scim+json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. |  -  |
| **401** | User has not been authenticated. |  -  |
| **404** | Schema not found. |  -  |
| **500** | Internal server error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


