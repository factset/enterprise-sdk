# FactSet.SDK.WatchlistAPIforDigitalPortals.Api.WatchlistApi

All URIs are relative to *https://api.factset.com/wealth/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetWatchlistGet**](WatchlistApi.md#getwatchlistget) | **GET** /watchlist/get | Details of a watchlist.
[**GetWatchlistList**](WatchlistApi.md#getwatchlistlist) | **GET** /watchlist/list | List of watchlists.
[**GetWatchlistPositionList**](WatchlistApi.md#getwatchlistpositionlist) | **GET** /watchlist/position/list | List of positions of a watchlist.
[**PostWatchlistCreate**](WatchlistApi.md#postwatchlistcreate) | **POST** /watchlist/create | Create a watchlist.
[**PostWatchlistDelete**](WatchlistApi.md#postwatchlistdelete) | **POST** /watchlist/delete | Delete a watchlist.
[**PostWatchlistModify**](WatchlistApi.md#postwatchlistmodify) | **POST** /watchlist/modify | Modify a watchlist.
[**PostWatchlistPositionCreate**](WatchlistApi.md#postwatchlistpositioncreate) | **POST** /watchlist/position/create | Add a position to a watchlist.
[**PostWatchlistPositionDelete**](WatchlistApi.md#postwatchlistpositiondelete) | **POST** /watchlist/position/delete | Delete a position of a watchlist.
[**PostWatchlistPositionGet**](WatchlistApi.md#postwatchlistpositionget) | **POST** /watchlist/position/get | Details of the position of a watchlist.
[**PostWatchlistPositionModify**](WatchlistApi.md#postwatchlistpositionmodify) | **POST** /watchlist/position/modify | Modify a position in a watchlist.


<a name="getwatchlistget"></a>
# **GetWatchlistGet**
> InlineResponse2001 GetWatchlistGet (string id, List<string> attributes = null)

Details of a watchlist.

Details of a watchlist.

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
    public class GetWatchlistGetExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.WatchlistAPIforDigitalPortals.Client.Configuration();

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

            var id = "id_example";  // string | 
            var attributes = new List<string>(); // List<string> | Limit the attributes returned in the response to the specified set. (optional) 

            try
            {
                // Details of a watchlist.
                InlineResponse2001 result = apiInstance.GetWatchlistGet(id, attributes);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling WatchlistApi.GetWatchlistGet: " + e.Message );
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

<a name="getwatchlistlist"></a>
# **GetWatchlistList**
> InlineResponse2002 GetWatchlistList (List<string> attributes = null, List<string> sort = null)

List of watchlists.

List of watchlists.

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
    public class GetWatchlistListExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.WatchlistAPIforDigitalPortals.Client.Configuration();

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
            var sort = new List<string>(); // List<string> | Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 4 (possibly prefixed) attribute name(s) is allowed. (optional) 

            try
            {
                // List of watchlists.
                InlineResponse2002 result = apiInstance.GetWatchlistList(attributes, sort);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling WatchlistApi.GetWatchlistList: " + e.Message );
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
 **sort** | [**List&lt;string&gt;**](string.md)| Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 4 (possibly prefixed) attribute name(s) is allowed. | [optional] 

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

<a name="getwatchlistpositionlist"></a>
# **GetWatchlistPositionList**
> InlineResponse2005 GetWatchlistPositionList (string id, List<string> attributes = null, List<string> sort = null)

List of positions of a watchlist.

List of positions of a watchlist.

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
    public class GetWatchlistPositionListExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.WatchlistAPIforDigitalPortals.Client.Configuration();

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

            var id = "id_example";  // string | 
            var attributes = new List<string>(); // List<string> | Limit the attributes returned in the response to the specified set. (optional) 
            var sort = new List<string>(); // List<string> | Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 2 (possibly prefixed) attribute name(s) is allowed. (optional) 

            try
            {
                // List of positions of a watchlist.
                InlineResponse2005 result = apiInstance.GetWatchlistPositionList(id, attributes, sort);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling WatchlistApi.GetWatchlistPositionList: " + e.Message );
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
 **sort** | [**List&lt;string&gt;**](string.md)| Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 2 (possibly prefixed) attribute name(s) is allowed. | [optional] 

### Return type
[**InlineResponse2005**](InlineResponse2005.md)

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

<a name="postwatchlistcreate"></a>
# **PostWatchlistCreate**
> InlineResponse201 PostWatchlistCreate (InlineObject inlineObject = null)

Create a watchlist.

Create a watchlist.  Certain error conditions yield errors as follows:   |Error Condition|HTTP Error| |- -- -- --|- -- -- -- -| |The number of watchlists would exceed 100.|400 Bad Request|

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
    public class PostWatchlistCreateExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.WatchlistAPIforDigitalPortals.Client.Configuration();

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

            var inlineObject = new InlineObject(); // InlineObject |  (optional) 

            try
            {
                // Create a watchlist.
                InlineResponse201 result = apiInstance.PostWatchlistCreate(inlineObject);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling WatchlistApi.PostWatchlistCreate: " + e.Message );
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
[**InlineResponse201**](InlineResponse201.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="postwatchlistdelete"></a>
# **PostWatchlistDelete**
> InlineResponse200 PostWatchlistDelete (InlineObject1 inlineObject1 = null)

Delete a watchlist.

Delete a watchlist.

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
    public class PostWatchlistDeleteExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.WatchlistAPIforDigitalPortals.Client.Configuration();

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

            var inlineObject1 = new InlineObject1(); // InlineObject1 |  (optional) 

            try
            {
                // Delete a watchlist.
                InlineResponse200 result = apiInstance.PostWatchlistDelete(inlineObject1);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling WatchlistApi.PostWatchlistDelete: " + e.Message );
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
 **inlineObject1** | [**InlineObject1**](InlineObject1.md)|  | [optional] 

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

<a name="postwatchlistmodify"></a>
# **PostWatchlistModify**
> InlineResponse2003 PostWatchlistModify (InlineObject2 inlineObject2 = null)

Modify a watchlist.

Modify a watchlist.

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
    public class PostWatchlistModifyExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.WatchlistAPIforDigitalPortals.Client.Configuration();

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

            var inlineObject2 = new InlineObject2(); // InlineObject2 |  (optional) 

            try
            {
                // Modify a watchlist.
                InlineResponse2003 result = apiInstance.PostWatchlistModify(inlineObject2);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling WatchlistApi.PostWatchlistModify: " + e.Message );
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
 **inlineObject2** | [**InlineObject2**](InlineObject2.md)|  | [optional] 

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

<a name="postwatchlistpositioncreate"></a>
# **PostWatchlistPositionCreate**
> InlineResponse2011 PostWatchlistPositionCreate (InlineObject3 inlineObject3 = null)

Add a position to a watchlist.

Add a position to a watchlist.  Certain error conditions yield errors as follows:   |Error Condition|HTTP Error| |- -- -- --|- -- -- -- -| |Maximum number of watchlist positions would exceed 100.|400 Bad Request| |The watchlist does not exist.|400 Bad Request| |The notation already exists in the watchlist.|400 Bad Request|

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
    public class PostWatchlistPositionCreateExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.WatchlistAPIforDigitalPortals.Client.Configuration();

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

            var inlineObject3 = new InlineObject3(); // InlineObject3 |  (optional) 

            try
            {
                // Add a position to a watchlist.
                InlineResponse2011 result = apiInstance.PostWatchlistPositionCreate(inlineObject3);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling WatchlistApi.PostWatchlistPositionCreate: " + e.Message );
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
 **inlineObject3** | [**InlineObject3**](InlineObject3.md)|  | [optional] 

### Return type
[**InlineResponse2011**](InlineResponse2011.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="postwatchlistpositiondelete"></a>
# **PostWatchlistPositionDelete**
> InlineResponse2003 PostWatchlistPositionDelete (InlineObject4 inlineObject4 = null)

Delete a position of a watchlist.

Delete a position of a watchlist.

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
    public class PostWatchlistPositionDeleteExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.WatchlistAPIforDigitalPortals.Client.Configuration();

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

            var inlineObject4 = new InlineObject4(); // InlineObject4 |  (optional) 

            try
            {
                // Delete a position of a watchlist.
                InlineResponse2003 result = apiInstance.PostWatchlistPositionDelete(inlineObject4);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling WatchlistApi.PostWatchlistPositionDelete: " + e.Message );
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
 **inlineObject4** | [**InlineObject4**](InlineObject4.md)|  | [optional] 

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

<a name="postwatchlistpositionget"></a>
# **PostWatchlistPositionGet**
> InlineResponse2004 PostWatchlistPositionGet (InlineObject5 inlineObject5 = null)

Details of the position of a watchlist.

Details of the position of a watchlist.

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
    public class PostWatchlistPositionGetExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.WatchlistAPIforDigitalPortals.Client.Configuration();

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

            var inlineObject5 = new InlineObject5(); // InlineObject5 |  (optional) 

            try
            {
                // Details of the position of a watchlist.
                InlineResponse2004 result = apiInstance.PostWatchlistPositionGet(inlineObject5);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling WatchlistApi.PostWatchlistPositionGet: " + e.Message );
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
 **inlineObject5** | [**InlineObject5**](InlineObject5.md)|  | [optional] 

### Return type
[**InlineResponse2004**](InlineResponse2004.md)

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

<a name="postwatchlistpositionmodify"></a>
# **PostWatchlistPositionModify**
> InlineResponse2003 PostWatchlistPositionModify (InlineObject6 inlineObject6 = null)

Modify a position in a watchlist.

Modify a position in a watchlist.  Certain error conditions yield errors as follows:   |Error Condition|HTTP Error| |- -- -- --|- -- -- -- -| |At least one of the parameters `notation` or `comment` must be set.|400 Bad Request| |The notation already exists in the watchlist.|400 Bad Request|

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
    public class PostWatchlistPositionModifyExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.WatchlistAPIforDigitalPortals.Client.Configuration();

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

            var inlineObject6 = new InlineObject6(); // InlineObject6 |  (optional) 

            try
            {
                // Modify a position in a watchlist.
                InlineResponse2003 result = apiInstance.PostWatchlistPositionModify(inlineObject6);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling WatchlistApi.PostWatchlistPositionModify: " + e.Message );
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
 **inlineObject6** | [**InlineObject6**](InlineObject6.md)|  | [optional] 

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

