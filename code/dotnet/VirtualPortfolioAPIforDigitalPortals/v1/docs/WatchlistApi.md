# FactSet.SDK.VirtualPortfolioAPIforDigitalPortals.Api.WatchlistApi

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
> InlineResponse20012 GetWatchlistGet (string id, List<string> attributes = null)

Details of a watchlist.

Details of a watchlist.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.VirtualPortfolioAPIforDigitalPortals.Api;
using FactSet.SDK.VirtualPortfolioAPIforDigitalPortals.Client;
using FactSet.SDK.VirtualPortfolioAPIforDigitalPortals.Model;

namespace Example
{
    public class GetWatchlistGetExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.VirtualPortfolioAPIforDigitalPortals.Client.Configuration();

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
                InlineResponse20012 result = apiInstance.GetWatchlistGet(id, attributes);
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
[**InlineResponse20012**](InlineResponse20012.md)

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
> InlineResponse20013 GetWatchlistList (List<string> attributes = null, List<string> sort = null)

List of watchlists.

List of watchlists.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.VirtualPortfolioAPIforDigitalPortals.Api;
using FactSet.SDK.VirtualPortfolioAPIforDigitalPortals.Client;
using FactSet.SDK.VirtualPortfolioAPIforDigitalPortals.Model;

namespace Example
{
    public class GetWatchlistListExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.VirtualPortfolioAPIforDigitalPortals.Client.Configuration();

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
                InlineResponse20013 result = apiInstance.GetWatchlistList(attributes, sort);
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
[**InlineResponse20013**](InlineResponse20013.md)

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
> InlineResponse20015 GetWatchlistPositionList (string id, List<string> attributes = null, List<string> sort = null)

List of positions of a watchlist.

List of positions of a watchlist.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.VirtualPortfolioAPIforDigitalPortals.Api;
using FactSet.SDK.VirtualPortfolioAPIforDigitalPortals.Client;
using FactSet.SDK.VirtualPortfolioAPIforDigitalPortals.Model;

namespace Example
{
    public class GetWatchlistPositionListExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.VirtualPortfolioAPIforDigitalPortals.Client.Configuration();

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
                InlineResponse20015 result = apiInstance.GetWatchlistPositionList(id, attributes, sort);
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
[**InlineResponse20015**](InlineResponse20015.md)

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
> InlineResponse2013 PostWatchlistCreate (InlineObject14 inlineObject14 = null)

Create a watchlist.

Create a watchlist.  Certain error conditions yield errors as follows:   |Error Condition|HTTP Error| |- -- -- --|- -- -- -- -| |The number of watchlists would exceed 100.|400 Bad Request|

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.VirtualPortfolioAPIforDigitalPortals.Api;
using FactSet.SDK.VirtualPortfolioAPIforDigitalPortals.Client;
using FactSet.SDK.VirtualPortfolioAPIforDigitalPortals.Model;

namespace Example
{
    public class PostWatchlistCreateExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.VirtualPortfolioAPIforDigitalPortals.Client.Configuration();

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

            var inlineObject14 = new InlineObject14(); // InlineObject14 |  (optional) 

            try
            {
                // Create a watchlist.
                InlineResponse2013 result = apiInstance.PostWatchlistCreate(inlineObject14);
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
 **inlineObject14** | [**InlineObject14**](InlineObject14.md)|  | [optional] 

### Return type
[**InlineResponse2013**](InlineResponse2013.md)

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
> InlineResponse200 PostWatchlistDelete (InlineObject15 inlineObject15 = null)

Delete a watchlist.

Delete a watchlist.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.VirtualPortfolioAPIforDigitalPortals.Api;
using FactSet.SDK.VirtualPortfolioAPIforDigitalPortals.Client;
using FactSet.SDK.VirtualPortfolioAPIforDigitalPortals.Model;

namespace Example
{
    public class PostWatchlistDeleteExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.VirtualPortfolioAPIforDigitalPortals.Client.Configuration();

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

            var inlineObject15 = new InlineObject15(); // InlineObject15 |  (optional) 

            try
            {
                // Delete a watchlist.
                InlineResponse200 result = apiInstance.PostWatchlistDelete(inlineObject15);
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
 **inlineObject15** | [**InlineObject15**](InlineObject15.md)|  | [optional] 

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
> InlineResponse2003 PostWatchlistModify (InlineObject16 inlineObject16 = null)

Modify a watchlist.

Modify a watchlist.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.VirtualPortfolioAPIforDigitalPortals.Api;
using FactSet.SDK.VirtualPortfolioAPIforDigitalPortals.Client;
using FactSet.SDK.VirtualPortfolioAPIforDigitalPortals.Model;

namespace Example
{
    public class PostWatchlistModifyExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.VirtualPortfolioAPIforDigitalPortals.Client.Configuration();

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

            var inlineObject16 = new InlineObject16(); // InlineObject16 |  (optional) 

            try
            {
                // Modify a watchlist.
                InlineResponse2003 result = apiInstance.PostWatchlistModify(inlineObject16);
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
 **inlineObject16** | [**InlineObject16**](InlineObject16.md)|  | [optional] 

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
> InlineResponse2014 PostWatchlistPositionCreate (InlineObject17 inlineObject17 = null)

Add a position to a watchlist.

Add a position to a watchlist.  Certain error conditions yield errors as follows:   |Error Condition|HTTP Error| |- -- -- --|- -- -- -- -| |Maximum number of watchlist positions would exceed 100.|400 Bad Request| |The watchlist does not exist.|400 Bad Request| |The notation already exists in the watchlist.|400 Bad Request|

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.VirtualPortfolioAPIforDigitalPortals.Api;
using FactSet.SDK.VirtualPortfolioAPIforDigitalPortals.Client;
using FactSet.SDK.VirtualPortfolioAPIforDigitalPortals.Model;

namespace Example
{
    public class PostWatchlistPositionCreateExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.VirtualPortfolioAPIforDigitalPortals.Client.Configuration();

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

            var inlineObject17 = new InlineObject17(); // InlineObject17 |  (optional) 

            try
            {
                // Add a position to a watchlist.
                InlineResponse2014 result = apiInstance.PostWatchlistPositionCreate(inlineObject17);
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
 **inlineObject17** | [**InlineObject17**](InlineObject17.md)|  | [optional] 

### Return type
[**InlineResponse2014**](InlineResponse2014.md)

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
> InlineResponse2003 PostWatchlistPositionDelete (InlineObject18 inlineObject18 = null)

Delete a position of a watchlist.

Delete a position of a watchlist.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.VirtualPortfolioAPIforDigitalPortals.Api;
using FactSet.SDK.VirtualPortfolioAPIforDigitalPortals.Client;
using FactSet.SDK.VirtualPortfolioAPIforDigitalPortals.Model;

namespace Example
{
    public class PostWatchlistPositionDeleteExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.VirtualPortfolioAPIforDigitalPortals.Client.Configuration();

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

            var inlineObject18 = new InlineObject18(); // InlineObject18 |  (optional) 

            try
            {
                // Delete a position of a watchlist.
                InlineResponse2003 result = apiInstance.PostWatchlistPositionDelete(inlineObject18);
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
 **inlineObject18** | [**InlineObject18**](InlineObject18.md)|  | [optional] 

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
> InlineResponse20014 PostWatchlistPositionGet (InlineObject19 inlineObject19 = null)

Details of the position of a watchlist.

Details of the position of a watchlist.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.VirtualPortfolioAPIforDigitalPortals.Api;
using FactSet.SDK.VirtualPortfolioAPIforDigitalPortals.Client;
using FactSet.SDK.VirtualPortfolioAPIforDigitalPortals.Model;

namespace Example
{
    public class PostWatchlistPositionGetExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.VirtualPortfolioAPIforDigitalPortals.Client.Configuration();

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

            var inlineObject19 = new InlineObject19(); // InlineObject19 |  (optional) 

            try
            {
                // Details of the position of a watchlist.
                InlineResponse20014 result = apiInstance.PostWatchlistPositionGet(inlineObject19);
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
 **inlineObject19** | [**InlineObject19**](InlineObject19.md)|  | [optional] 

### Return type
[**InlineResponse20014**](InlineResponse20014.md)

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
> InlineResponse2003 PostWatchlistPositionModify (InlineObject20 inlineObject20 = null)

Modify a position in a watchlist.

Modify a position in a watchlist.  Certain error conditions yield errors as follows:   |Error Condition|HTTP Error| |- -- -- --|- -- -- -- -| |At least one of the parameters `notation` or `comment` must be set.|400 Bad Request| |The notation already exists in the watchlist.|400 Bad Request|

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.VirtualPortfolioAPIforDigitalPortals.Api;
using FactSet.SDK.VirtualPortfolioAPIforDigitalPortals.Client;
using FactSet.SDK.VirtualPortfolioAPIforDigitalPortals.Model;

namespace Example
{
    public class PostWatchlistPositionModifyExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.VirtualPortfolioAPIforDigitalPortals.Client.Configuration();

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

            var inlineObject20 = new InlineObject20(); // InlineObject20 |  (optional) 

            try
            {
                // Modify a position in a watchlist.
                InlineResponse2003 result = apiInstance.PostWatchlistPositionModify(inlineObject20);
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
 **inlineObject20** | [**InlineObject20**](InlineObject20.md)|  | [optional] 

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

