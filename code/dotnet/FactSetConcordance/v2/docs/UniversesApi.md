# FactSet.SDK.FactSetConcordance.Api.UniversesApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetEntityUniverseStatistics**](UniversesApi.md#getentityuniversestatistics) | **GET** /factset-concordance/v2/entity-universe-statistics | Get statistics on a given universe
[**GetUniverseForList**](UniversesApi.md#getuniverseforlist) | **POST** /factset-concordance/v2/universe | Create a new universe
[**GetUniverseStatistics**](UniversesApi.md#getuniversestatistics) | **GET** /factset-concordance/v2/universe-statistics | Get statistics on a given universe
[**GetUniverses**](UniversesApi.md#getuniverses) | **GET** /factset-concordance/v2/universes | Fetch metadata for universes
[**GetUpdateUniverseForList**](UniversesApi.md#getupdateuniverseforlist) | **POST** /factset-concordance/v2/update-universe | Update metadata for an existing universe



<a name="getentityuniversestatistics"></a>
# **GetEntityUniverseStatistics**
> EntityUniverseStatisticsResponse GetEntityUniverseStatistics (int universeId)

Get statistics on a given universe

Get the total number of mappings in a universe, as well as the number of mapped, unmapped and indeterminate mappings 

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetConcordance.Api;
using FactSet.SDK.FactSetConcordance.Client;
using FactSet.SDK.FactSetConcordance.Model;

namespace Example
{
    public class GetEntityUniverseStatisticsExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetConcordance.Client.Configuration();

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

            var apiInstance = new UniversesApi(config);

            var universeId = 1;  // int | Universe identifier. *To create a universe, use the `/universe' endpoint.*

            try
            {
                // Get statistics on a given universe
                EntityUniverseStatisticsResponse result = apiInstance.GetEntityUniverseStatistics(universeId);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling UniversesApi.GetEntityUniverseStatistics: " + e.Message );
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
 **universeId** | **int**| Universe identifier. *To create a universe, use the &#x60;/universe&#39; endpoint.* | 

### Return type
[**EntityUniverseStatisticsResponse**](EntityUniverseStatisticsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response object for mapping statistics for a universe |  -  |
| **0** | Error Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getuniverseforlist"></a>
# **GetUniverseForList**
> UniverseMetaResponse GetUniverseForList (CreateUniverseRequest createUniverseRequest)

Create a new universe

Create a new universe that is distinct from any existing universe 

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetConcordance.Api;
using FactSet.SDK.FactSetConcordance.Client;
using FactSet.SDK.FactSetConcordance.Model;

namespace Example
{
    public class GetUniverseForListExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetConcordance.Client.Configuration();

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

            var apiInstance = new UniversesApi(config);

            var createUniverseRequest = new CreateUniverseRequest(); // CreateUniverseRequest | A request to create a user's universe

            try
            {
                // Create a new universe
                UniverseMetaResponse result = apiInstance.GetUniverseForList(createUniverseRequest);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling UniversesApi.GetUniverseForList: " + e.Message );
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
 **createUniverseRequest** | [**CreateUniverseRequest**](CreateUniverseRequest.md)| A request to create a user&#39;s universe | 

### Return type
[**UniverseMetaResponse**](UniverseMetaResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Metadata on a single universe |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |
| **0** | Error Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getuniversestatistics"></a>
# **GetUniverseStatistics**
> UniverseStatisticsResponse GetUniverseStatistics (int universeId)

Get statistics on a given universe

Get the total number of mappings in a universe, as well as the number of mapped, unmapped and indeterminate mappings 

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetConcordance.Api;
using FactSet.SDK.FactSetConcordance.Client;
using FactSet.SDK.FactSetConcordance.Model;

namespace Example
{
    public class GetUniverseStatisticsExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetConcordance.Client.Configuration();

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

            var apiInstance = new UniversesApi(config);

            var universeId = 1;  // int | Universe identifier. *To create a universe, use the `/universe' endpoint.*

            try
            {
                // Get statistics on a given universe
                UniverseStatisticsResponse result = apiInstance.GetUniverseStatistics(universeId);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling UniversesApi.GetUniverseStatistics: " + e.Message );
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
 **universeId** | **int**| Universe identifier. *To create a universe, use the &#x60;/universe&#39; endpoint.* | 

### Return type
[**UniverseStatisticsResponse**](UniverseStatisticsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response object for mapping statistics for a universe |  -  |
| **0** | Error Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getuniverses"></a>
# **GetUniverses**
> UniversesResponse GetUniverses (int? universeId = null, string universeType = null)

Fetch metadata for universes

Fetch information on active universes for the current user. Optionally filter for a specific universe given a `universeId` 

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetConcordance.Api;
using FactSet.SDK.FactSetConcordance.Client;
using FactSet.SDK.FactSetConcordance.Model;

namespace Example
{
    public class GetUniversesExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetConcordance.Client.Configuration();

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

            var apiInstance = new UniversesApi(config);

            var universeId = 1;  // int? | Universe identifier. *To create a universe, use the `/universe' endpoint.* (optional) 
            var universeType = "ENTITY";  // string | Universe Type. (optional) 

            try
            {
                // Fetch metadata for universes
                UniversesResponse result = apiInstance.GetUniverses(universeId, universeType);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling UniversesApi.GetUniverses: " + e.Message );
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
 **universeId** | **int?**| Universe identifier. *To create a universe, use the &#x60;/universe&#39; endpoint.* | [optional] 
 **universeType** | **string**| Universe Type. | [optional] 

### Return type
[**UniversesResponse**](UniversesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Metadata on multiple universes |  -  |
| **0** | Error Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getupdateuniverseforlist"></a>
# **GetUpdateUniverseForList**
> UniverseMetaResponse GetUpdateUniverseForList (UpdateUniverseRequest updateUniverseRequest)

Update metadata for an existing universe

Update metadata for an existing universe 

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetConcordance.Api;
using FactSet.SDK.FactSetConcordance.Client;
using FactSet.SDK.FactSetConcordance.Model;

namespace Example
{
    public class GetUpdateUniverseForListExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetConcordance.Client.Configuration();

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

            var apiInstance = new UniversesApi(config);

            var updateUniverseRequest = new UpdateUniverseRequest(); // UpdateUniverseRequest | A request to update a user's universe

            try
            {
                // Update metadata for an existing universe
                UniverseMetaResponse result = apiInstance.GetUpdateUniverseForList(updateUniverseRequest);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling UniversesApi.GetUpdateUniverseForList: " + e.Message );
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
 **updateUniverseRequest** | [**UpdateUniverseRequest**](UpdateUniverseRequest.md)| A request to update a user&#39;s universe | 

### Return type
[**UniverseMetaResponse**](UniverseMetaResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Metadata on a single universe |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |
| **0** | Error Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


