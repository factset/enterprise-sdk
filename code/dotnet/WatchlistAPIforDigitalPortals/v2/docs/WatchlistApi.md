# FactSet.SDK.WatchlistAPIforDigitalPortals.Api.WatchlistApi

All URIs are relative to *http://api-sandbox.factset.com/wealth/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**WatchlistCreatePost**](WatchlistApi.md#watchlistcreatepost) | **POST** /watchlist/create | Create watchlist.
[**WatchlistDeletePost**](WatchlistApi.md#watchlistdeletepost) | **POST** /watchlist/delete | The endpoint deletes a watchlist.
[**WatchlistListGet**](WatchlistApi.md#watchlistlistget) | **GET** /watchlist/list | List watchlists.
[**WatchlistModifyPost**](WatchlistApi.md#watchlistmodifypost) | **POST** /watchlist/modify | Rename a watchlist.
[**WatchlistPositionCreatePost**](WatchlistApi.md#watchlistpositioncreatepost) | **POST** /watchlist/position/create | Add position in watchlist.
[**WatchlistPositionDeletePost**](WatchlistApi.md#watchlistpositiondeletepost) | **POST** /watchlist/position/delete | Add position in watchlist.
[**WatchlistPositionListGet**](WatchlistApi.md#watchlistpositionlistget) | **GET** /watchlist/position/list | List positions of watchlist.
[**WatchlistPositionModifyPost**](WatchlistApi.md#watchlistpositionmodifypost) | **POST** /watchlist/position/modify | Add position in watchlist.


<a name="watchlistcreatepost"></a>
# **WatchlistCreatePost**
> InlineResponse200 WatchlistCreatePost (InlineObject body = null)

Create watchlist.

The endpoint creates a new watchlist.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.WatchlistAPIforDigitalPortals.Api;
using FactSet.SDK.WatchlistAPIforDigitalPortals.Client;
using FactSet.SDK.WatchlistAPIforDigitalPortals.Model;

namespace Example
{
    public class WatchlistCreatePostExample
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

            var apiInstance = new WatchlistApi(config);
            var body = new InlineObject(); // InlineObject |  (optional) 

            try
            {
                // Create watchlist.
                InlineResponse200 result = apiInstance.WatchlistCreatePost(body);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling WatchlistApi.WatchlistCreatePost: " + e.Message );
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
 **body** | [**InlineObject**](InlineObject.md)|  | [optional] 

### Return type
[**InlineResponse200**](InlineResponse200.md)

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

<a name="watchlistdeletepost"></a>
# **WatchlistDeletePost**
> InlineResponse2001 WatchlistDeletePost (InlineObject1 body = null)

The endpoint deletes a watchlist.

The endpoint deletes a watchlist.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.WatchlistAPIforDigitalPortals.Api;
using FactSet.SDK.WatchlistAPIforDigitalPortals.Client;
using FactSet.SDK.WatchlistAPIforDigitalPortals.Model;

namespace Example
{
    public class WatchlistDeletePostExample
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

            var apiInstance = new WatchlistApi(config);
            var body = new InlineObject1(); // InlineObject1 |  (optional) 

            try
            {
                // The endpoint deletes a watchlist.
                InlineResponse2001 result = apiInstance.WatchlistDeletePost(body);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling WatchlistApi.WatchlistDeletePost: " + e.Message );
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
 **body** | [**InlineObject1**](InlineObject1.md)|  | [optional] 

### Return type
[**InlineResponse2001**](InlineResponse2001.md)

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

<a name="watchlistlistget"></a>
# **WatchlistListGet**
> InlineResponse2002 WatchlistListGet (List<string> attributes = null, List<string> sort = null, decimal? paginationOffset = null, decimal? paginationLimit = null)

List watchlists.

The endpoint lists all watchlist of a user.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.WatchlistAPIforDigitalPortals.Api;
using FactSet.SDK.WatchlistAPIforDigitalPortals.Client;
using FactSet.SDK.WatchlistAPIforDigitalPortals.Model;

namespace Example
{
    public class WatchlistListGetExample
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

            var apiInstance = new WatchlistApi(config);
            var attributes = new List<string>(); // List<string> | Limit the attributes returned in the response to the specified set. (optional) 
            var sort = new List<string>(); // List<string> | Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 2 (possibly prefixed) attribute name(s) is allowed. (optional) 
            var paginationOffset = 0.0MD;  // decimal? | Non-negative number of entries to skip, or 0 (default). (optional)  (default to 0.0M)
            var paginationLimit = 20.0MD;  // decimal? | Non-negative maximum number of entries to return. (optional)  (default to 20.0M)

            try
            {
                // List watchlists.
                InlineResponse2002 result = apiInstance.WatchlistListGet(attributes, sort, paginationOffset, paginationLimit);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling WatchlistApi.WatchlistListGet: " + e.Message );
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
 **sort** | [**List&lt;string&gt;**](string.md)| Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 2 (possibly prefixed) attribute name(s) is allowed. | [optional] 
 **paginationOffset** | **decimal?**| Non-negative number of entries to skip, or 0 (default). | [optional] [default to 0.0M]
 **paginationLimit** | **decimal?**| Non-negative maximum number of entries to return. | [optional] [default to 20.0M]

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

<a name="watchlistmodifypost"></a>
# **WatchlistModifyPost**
> InlineResponse200 WatchlistModifyPost (InlineObject2 body = null)

Rename a watchlist.

The endpoint renames a watchlist.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.WatchlistAPIforDigitalPortals.Api;
using FactSet.SDK.WatchlistAPIforDigitalPortals.Client;
using FactSet.SDK.WatchlistAPIforDigitalPortals.Model;

namespace Example
{
    public class WatchlistModifyPostExample
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

            var apiInstance = new WatchlistApi(config);
            var body = new InlineObject2(); // InlineObject2 |  (optional) 

            try
            {
                // Rename a watchlist.
                InlineResponse200 result = apiInstance.WatchlistModifyPost(body);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling WatchlistApi.WatchlistModifyPost: " + e.Message );
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
 **body** | [**InlineObject2**](InlineObject2.md)|  | [optional] 

### Return type
[**InlineResponse200**](InlineResponse200.md)

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

<a name="watchlistpositioncreatepost"></a>
# **WatchlistPositionCreatePost**
> InlineResponse2003 WatchlistPositionCreatePost (InlineObject3 body = null)

Add position in watchlist.

The endpoint adds a new position in a watchlist.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.WatchlistAPIforDigitalPortals.Api;
using FactSet.SDK.WatchlistAPIforDigitalPortals.Client;
using FactSet.SDK.WatchlistAPIforDigitalPortals.Model;

namespace Example
{
    public class WatchlistPositionCreatePostExample
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

            var apiInstance = new WatchlistApi(config);
            var body = new InlineObject3(); // InlineObject3 |  (optional) 

            try
            {
                // Add position in watchlist.
                InlineResponse2003 result = apiInstance.WatchlistPositionCreatePost(body);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling WatchlistApi.WatchlistPositionCreatePost: " + e.Message );
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
 **body** | [**InlineObject3**](InlineObject3.md)|  | [optional] 

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

<a name="watchlistpositiondeletepost"></a>
# **WatchlistPositionDeletePost**
> InlineResponse200 WatchlistPositionDeletePost (InlineObject4 body = null)

Add position in watchlist.

The endpoint deletes a position in a watchlist.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.WatchlistAPIforDigitalPortals.Api;
using FactSet.SDK.WatchlistAPIforDigitalPortals.Client;
using FactSet.SDK.WatchlistAPIforDigitalPortals.Model;

namespace Example
{
    public class WatchlistPositionDeletePostExample
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

            var apiInstance = new WatchlistApi(config);
            var body = new InlineObject4(); // InlineObject4 |  (optional) 

            try
            {
                // Add position in watchlist.
                InlineResponse200 result = apiInstance.WatchlistPositionDeletePost(body);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling WatchlistApi.WatchlistPositionDeletePost: " + e.Message );
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
 **body** | [**InlineObject4**](InlineObject4.md)|  | [optional] 

### Return type
[**InlineResponse200**](InlineResponse200.md)

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

<a name="watchlistpositionlistget"></a>
# **WatchlistPositionListGet**
> InlineResponse2004 WatchlistPositionListGet (string name, List<string> attributes = null, List<string> sort = null, decimal? paginationOffset = null, decimal? paginationLimit = null)

List positions of watchlist.

The endpoint lists the positions of a watchlist.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.WatchlistAPIforDigitalPortals.Api;
using FactSet.SDK.WatchlistAPIforDigitalPortals.Client;
using FactSet.SDK.WatchlistAPIforDigitalPortals.Model;

namespace Example
{
    public class WatchlistPositionListGetExample
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

            var apiInstance = new WatchlistApi(config);
            var name = "name_example";  // string | Name of watchlist
            var attributes = new List<string>(); // List<string> | Limit the attributes returned in the response to the specified set. (optional) 
            var sort = new List<string>(); // List<string> | Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 2 (possibly prefixed) attribute name(s) is allowed. (optional) 
            var paginationOffset = 0.0MD;  // decimal? | Non-negative number of entries to skip, or 0 (default). (optional)  (default to 0.0M)
            var paginationLimit = 20.0MD;  // decimal? | Non-negative maximum number of entries to return. (optional)  (default to 20.0M)

            try
            {
                // List positions of watchlist.
                InlineResponse2004 result = apiInstance.WatchlistPositionListGet(name, attributes, sort, paginationOffset, paginationLimit);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling WatchlistApi.WatchlistPositionListGet: " + e.Message );
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
 **name** | **string**| Name of watchlist | 
 **attributes** | [**List&lt;string&gt;**](string.md)| Limit the attributes returned in the response to the specified set. | [optional] 
 **sort** | [**List&lt;string&gt;**](string.md)| Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 2 (possibly prefixed) attribute name(s) is allowed. | [optional] 
 **paginationOffset** | **decimal?**| Non-negative number of entries to skip, or 0 (default). | [optional] [default to 0.0M]
 **paginationLimit** | **decimal?**| Non-negative maximum number of entries to return. | [optional] [default to 20.0M]

### Return type
[**InlineResponse2004**](InlineResponse2004.md)

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

<a name="watchlistpositionmodifypost"></a>
# **WatchlistPositionModifyPost**
> InlineResponse200 WatchlistPositionModifyPost (InlineObject5 body = null)

Add position in watchlist.

The endpoint modifies a position in a watchlist. All properties except the position id are modifiable by the endpoint.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.WatchlistAPIforDigitalPortals.Api;
using FactSet.SDK.WatchlistAPIforDigitalPortals.Client;
using FactSet.SDK.WatchlistAPIforDigitalPortals.Model;

namespace Example
{
    public class WatchlistPositionModifyPostExample
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

            var apiInstance = new WatchlistApi(config);
            var body = new InlineObject5(); // InlineObject5 |  (optional) 

            try
            {
                // Add position in watchlist.
                InlineResponse200 result = apiInstance.WatchlistPositionModifyPost(body);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling WatchlistApi.WatchlistPositionModifyPost: " + e.Message );
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
 **body** | [**InlineObject5**](InlineObject5.md)|  | [optional] 

### Return type
[**InlineResponse200**](InlineResponse200.md)

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

