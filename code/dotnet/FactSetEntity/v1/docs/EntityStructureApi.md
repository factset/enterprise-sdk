# FactSet.SDK.FactSetEntity.Api.EntityStructureApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetEntityStructure**](EntityStructureApi.md#getentitystructure) | **GET** /factset-entity/v1/entity-structures | Returns all active or inactive entities and respective levels below the requested entity id.
[**GetUltimateEntityStructure**](EntityStructureApi.md#getultimateentitystructure) | **GET** /factset-entity/v1/ultimate-entity-structures | Returns the full ultimate parent entity hiearachy. Control levels and active status of underlying entities.
[**PostEntityStructure**](EntityStructureApi.md#postentitystructure) | **POST** /factset-entity/v1/entity-structures | Returns all active or inactive entities below the requested entity id.
[**PostUltimateEntityStructure**](EntityStructureApi.md#postultimateentitystructure) | **POST** /factset-entity/v1/ultimate-entity-structures | Returns all active or inactive entities and respective levels below the requested entity id.



<a name="getentitystructure"></a>
# **GetEntityStructure**
> EntityStructureResponse GetEntityStructure (List<string> ids, int? level = null, int? active = null)

Returns all active or inactive entities and respective levels below the requested entity id.

Returns all active or inactive entities below the requested entity id. 

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetEntity.Api;
using FactSet.SDK.FactSetEntity.Client;
using FactSet.SDK.FactSetEntity.Model;

namespace Example
{
    public class GetEntityStructureExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetEntity.Client.Configuration();

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

            var apiInstance = new EntityStructureApi(config);

            var ids = new List<string>(); // List<string> | The requested Market Identifier. Accepted input identifiers include Ticker-Exchange, Ticker-Regions, CUSIPs, ISINs, SEDOLs, or FactSet Permanent Ids, such as -R, -L, or -E.<p>**Max Ids Limit set to 100 in a single request**</p>   *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids,       which may lead to exceeding this request line limit of 8KB, its       advised for any requests with large request lines to be requested through       the respective \\\"POST\\\" method.</p>* 
            var level = -1;  // int? | Controls the levels returned in the hierarchy. Use -1 to return all levels, or 1-n for a specific level. (optional)  (default to -1)
            var active = -1;  // int? | Controls active or inactive securities returned in the hierarchy. Enter 1 to return only active entities, 0 for inactive entities, and -1 for all active and inactive. (optional)  (default to -1)

            try
            {
                // Returns all active or inactive entities and respective levels below the requested entity id.
                EntityStructureResponse result = apiInstance.GetEntityStructure(ids, level, active);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling EntityStructureApi.GetEntityStructure: " + e.Message );
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
 **ids** | [**List&lt;string&gt;**](string.md)| The requested Market Identifier. Accepted input identifiers include Ticker-Exchange, Ticker-Regions, CUSIPs, ISINs, SEDOLs, or FactSet Permanent Ids, such as -R, -L, or -E.&lt;p&gt;**Max Ids Limit set to 100 in a single request**&lt;/p&gt;   *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids,       which may lead to exceeding this request line limit of 8KB, its       advised for any requests with large request lines to be requested through       the respective \\\&quot;POST\\\&quot; method.&lt;/p&gt;*  | 
 **level** | **int?**| Controls the levels returned in the hierarchy. Use -1 to return all levels, or 1-n for a specific level. | [optional] [default to -1]
 **active** | **int?**| Controls active or inactive securities returned in the hierarchy. Enter 1 to return only active entities, 0 for inactive entities, and -1 for all active and inactive. | [optional] [default to -1]

### Return type
[**EntityStructureResponse**](EntityStructureResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Fetches Entity Structure |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getultimateentitystructure"></a>
# **GetUltimateEntityStructure**
> UltimateEntityStructureResponse GetUltimateEntityStructure (List<string> ids, int? level = null, int? active = null)

Returns the full ultimate parent entity hiearachy. Control levels and active status of underlying entities.

Returns full ultimate entity structure including ultimate parent and all subordinates. Will accept entity from any level of entity structure or active vs. inactive status of entity. 

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetEntity.Api;
using FactSet.SDK.FactSetEntity.Client;
using FactSet.SDK.FactSetEntity.Model;

namespace Example
{
    public class GetUltimateEntityStructureExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetEntity.Client.Configuration();

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

            var apiInstance = new EntityStructureApi(config);

            var ids = new List<string>(); // List<string> | The requested Market Identifier. Accepted input identifiers include Ticker-Exchange, Ticker-Regions, CUSIPs, ISINs, SEDOLs, or FactSet Permanent Ids, such as -R, -L, or -E.<p>**Max Ids Limit set to 100 in a single request**</p>   *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids,       which may lead to exceeding this request line limit of 8KB, its       advised for any requests with large request lines to be requested through       the respective \\\"POST\\\" method.</p>* 
            var level = -1;  // int? | Controls the levels returned in the hierarchy. Use -1 to return all levels, or 1-n for a specific level. (optional)  (default to -1)
            var active = -1;  // int? | Controls active or inactive securities returned in the hierarchy. Enter 1 to return only active entities, 0 for inactive entities, and -1 for all active and inactive. (optional)  (default to -1)

            try
            {
                // Returns the full ultimate parent entity hiearachy. Control levels and active status of underlying entities.
                UltimateEntityStructureResponse result = apiInstance.GetUltimateEntityStructure(ids, level, active);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling EntityStructureApi.GetUltimateEntityStructure: " + e.Message );
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
 **ids** | [**List&lt;string&gt;**](string.md)| The requested Market Identifier. Accepted input identifiers include Ticker-Exchange, Ticker-Regions, CUSIPs, ISINs, SEDOLs, or FactSet Permanent Ids, such as -R, -L, or -E.&lt;p&gt;**Max Ids Limit set to 100 in a single request**&lt;/p&gt;   *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids,       which may lead to exceeding this request line limit of 8KB, its       advised for any requests with large request lines to be requested through       the respective \\\&quot;POST\\\&quot; method.&lt;/p&gt;*  | 
 **level** | **int?**| Controls the levels returned in the hierarchy. Use -1 to return all levels, or 1-n for a specific level. | [optional] [default to -1]
 **active** | **int?**| Controls active or inactive securities returned in the hierarchy. Enter 1 to return only active entities, 0 for inactive entities, and -1 for all active and inactive. | [optional] [default to -1]

### Return type
[**UltimateEntityStructureResponse**](UltimateEntityStructureResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Fetches Ultimate Entity Structure data for a list of ids. |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="postentitystructure"></a>
# **PostEntityStructure**
> EntityStructureResponse PostEntityStructure (EntityStructureRequest entityStructureRequest)

Returns all active or inactive entities below the requested entity id.

Returns all active or inactive entities and respective levels below the requested entity id. 

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetEntity.Api;
using FactSet.SDK.FactSetEntity.Client;
using FactSet.SDK.FactSetEntity.Model;

namespace Example
{
    public class PostEntityStructureExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetEntity.Client.Configuration();

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

            var apiInstance = new EntityStructureApi(config);

            var entityStructureRequest = new EntityStructureRequest(); // EntityStructureRequest | Request Body to request a list of Entity Structure objects.

            try
            {
                // Returns all active or inactive entities below the requested entity id.
                EntityStructureResponse result = apiInstance.PostEntityStructure(entityStructureRequest);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling EntityStructureApi.PostEntityStructure: " + e.Message );
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
 **entityStructureRequest** | [**EntityStructureRequest**](EntityStructureRequest.md)| Request Body to request a list of Entity Structure objects. | 

### Return type
[**EntityStructureResponse**](EntityStructureResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Entity Structure data items |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="postultimateentitystructure"></a>
# **PostUltimateEntityStructure**
> UltimateEntityStructureResponse PostUltimateEntityStructure (UltimateEntityStructureRequest ultimateEntityStructureRequest)

Returns all active or inactive entities and respective levels below the requested entity id.

Returns all active or inactive entities and respective levels below the requested entity id. 

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetEntity.Api;
using FactSet.SDK.FactSetEntity.Client;
using FactSet.SDK.FactSetEntity.Model;

namespace Example
{
    public class PostUltimateEntityStructureExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetEntity.Client.Configuration();

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

            var apiInstance = new EntityStructureApi(config);

            var ultimateEntityStructureRequest = new UltimateEntityStructureRequest(); // UltimateEntityStructureRequest | Request Body to request a list of Ultimate Entity Structure objects.

            try
            {
                // Returns all active or inactive entities and respective levels below the requested entity id.
                UltimateEntityStructureResponse result = apiInstance.PostUltimateEntityStructure(ultimateEntityStructureRequest);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling EntityStructureApi.PostUltimateEntityStructure: " + e.Message );
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
 **ultimateEntityStructureRequest** | [**UltimateEntityStructureRequest**](UltimateEntityStructureRequest.md)| Request Body to request a list of Ultimate Entity Structure objects. | 

### Return type
[**UltimateEntityStructureResponse**](UltimateEntityStructureResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ultimate Entity Structure data items |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


