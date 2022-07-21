# FactSet.SDK.RecommendationListAPIforDigitalPortals.Api.RecommendationListApi

All URIs are relative to *https://api.factset.com/wealth/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetRecommendationListGet**](RecommendationListApi.md#getrecommendationlistget) | **GET** /recommendationList/get | Attributes of a single list.
[**GetRecommendationListRevisionElementList**](RecommendationListApi.md#getrecommendationlistrevisionelementlist) | **GET** /recommendationList/revision/element/list | List of elements of a given revision.
[**GetRecommendationListRevisionGet**](RecommendationListApi.md#getrecommendationlistrevisionget) | **GET** /recommendationList/revision/get | Attributes of a single revision.
[**GetRecommendationListRevisionSearch**](RecommendationListApi.md#getrecommendationlistrevisionsearch) | **GET** /recommendationList/revision/search | Search for revisions of a recommendation list.
[**GetRecommendationListSearch**](RecommendationListApi.md#getrecommendationlistsearch) | **GET** /recommendationList/search | Search for recommendation lists.
[**PostRecommendationListRevisionList**](RecommendationListApi.md#postrecommendationlistrevisionlist) | **POST** /recommendationList/revision/list | List of revisions of a recommendation list.


<a name="getrecommendationlistget"></a>
# **GetRecommendationListGet**
> InlineResponse200 GetRecommendationListGet (decimal id, List<string> attributes = null, string language = null)

Attributes of a single list.

Attributes of a single list, including data about its active revision.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.RecommendationListAPIforDigitalPortals.Api;
using FactSet.SDK.RecommendationListAPIforDigitalPortals.Client;
using FactSet.SDK.RecommendationListAPIforDigitalPortals.Model;

namespace Example
{
    public class GetRecommendationListGetExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.RecommendationListAPIforDigitalPortals.Client.Configuration();

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

            var apiInstance = new RecommendationListApi(config);

            var id = 8.14D;  // decimal | 
            var attributes = new List<string>(); // List<string> | Limit the attributes returned in the response to the specified set. (optional) 
            var language = "language_example";  // string |  (optional) 

            try
            {
                // Attributes of a single list.
                InlineResponse200 result = apiInstance.GetRecommendationListGet(id, attributes, language);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling RecommendationListApi.GetRecommendationListGet: " + e.Message );
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
 **id** | **decimal**|  | 
 **attributes** | [**List&lt;string&gt;**](string.md)| Limit the attributes returned in the response to the specified set. | [optional] 
 **language** | **string**|  | [optional] 

### Return type
[**InlineResponse200**](InlineResponse200.md)

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

<a name="getrecommendationlistrevisionelementlist"></a>
# **GetRecommendationListRevisionElementList**
> InlineResponse2005 GetRecommendationListRevisionElementList (decimal idRevision, List<string> attributes = null, string language = null)

List of elements of a given revision.

List of elements of a given revision.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.RecommendationListAPIforDigitalPortals.Api;
using FactSet.SDK.RecommendationListAPIforDigitalPortals.Client;
using FactSet.SDK.RecommendationListAPIforDigitalPortals.Model;

namespace Example
{
    public class GetRecommendationListRevisionElementListExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.RecommendationListAPIforDigitalPortals.Client.Configuration();

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

            var apiInstance = new RecommendationListApi(config);

            var idRevision = 8.14D;  // decimal | 
            var attributes = new List<string>(); // List<string> | Limit the attributes returned in the response to the specified set. (optional) 
            var language = "language_example";  // string |  (optional) 

            try
            {
                // List of elements of a given revision.
                InlineResponse2005 result = apiInstance.GetRecommendationListRevisionElementList(idRevision, attributes, language);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling RecommendationListApi.GetRecommendationListRevisionElementList: " + e.Message );
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
 **idRevision** | **decimal**|  | 
 **attributes** | [**List&lt;string&gt;**](string.md)| Limit the attributes returned in the response to the specified set. | [optional] 
 **language** | **string**|  | [optional] 

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

<a name="getrecommendationlistrevisionget"></a>
# **GetRecommendationListRevisionGet**
> InlineResponse2002 GetRecommendationListRevisionGet (decimal id, List<string> attributes = null, string language = null)

Attributes of a single revision.

Attributes of a single revision.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.RecommendationListAPIforDigitalPortals.Api;
using FactSet.SDK.RecommendationListAPIforDigitalPortals.Client;
using FactSet.SDK.RecommendationListAPIforDigitalPortals.Model;

namespace Example
{
    public class GetRecommendationListRevisionGetExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.RecommendationListAPIforDigitalPortals.Client.Configuration();

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

            var apiInstance = new RecommendationListApi(config);

            var id = 8.14D;  // decimal | 
            var attributes = new List<string>(); // List<string> | Limit the attributes returned in the response to the specified set. (optional) 
            var language = "language_example";  // string |  (optional) 

            try
            {
                // Attributes of a single revision.
                InlineResponse2002 result = apiInstance.GetRecommendationListRevisionGet(id, attributes, language);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling RecommendationListApi.GetRecommendationListRevisionGet: " + e.Message );
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
 **id** | **decimal**|  | 
 **attributes** | [**List&lt;string&gt;**](string.md)| Limit the attributes returned in the response to the specified set. | [optional] 
 **language** | **string**|  | [optional] 

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

<a name="getrecommendationlistrevisionsearch"></a>
# **GetRecommendationListRevisionSearch**
> InlineResponse2004 GetRecommendationListRevisionSearch (string idNotation = null, string idInstrument = null, List<string> attributes = null, string language = null)

Search for revisions of a recommendation list.

Search for revisions of a recommendation list.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.RecommendationListAPIforDigitalPortals.Api;
using FactSet.SDK.RecommendationListAPIforDigitalPortals.Client;
using FactSet.SDK.RecommendationListAPIforDigitalPortals.Model;

namespace Example
{
    public class GetRecommendationListRevisionSearchExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.RecommendationListAPIforDigitalPortals.Client.Configuration();

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

            var apiInstance = new RecommendationListApi(config);

            var idNotation = "idNotation_example";  // string |  (optional) 
            var idInstrument = "idInstrument_example";  // string |  (optional) 
            var attributes = new List<string>(); // List<string> | Limit the attributes returned in the response to the specified set. (optional) 
            var language = "language_example";  // string |  (optional) 

            try
            {
                // Search for revisions of a recommendation list.
                InlineResponse2004 result = apiInstance.GetRecommendationListRevisionSearch(idNotation, idInstrument, attributes, language);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling RecommendationListApi.GetRecommendationListRevisionSearch: " + e.Message );
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
 **idNotation** | **string**|  | [optional] 
 **idInstrument** | **string**|  | [optional] 
 **attributes** | [**List&lt;string&gt;**](string.md)| Limit the attributes returned in the response to the specified set. | [optional] 
 **language** | **string**|  | [optional] 

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

<a name="getrecommendationlistsearch"></a>
# **GetRecommendationListSearch**
> InlineResponse2001 GetRecommendationListSearch (string name = null, bool? onlyActive = null, List<string> attributes = null, string language = null)

Search for recommendation lists.

Search for recommendation lists, delivering an array of recommendation lists matching the specified filter criteria. The data provided for each recommendation list includes the currently active revision (or null in case no active revision exists).

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.RecommendationListAPIforDigitalPortals.Api;
using FactSet.SDK.RecommendationListAPIforDigitalPortals.Client;
using FactSet.SDK.RecommendationListAPIforDigitalPortals.Model;

namespace Example
{
    public class GetRecommendationListSearchExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.RecommendationListAPIforDigitalPortals.Client.Configuration();

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

            var apiInstance = new RecommendationListApi(config);

            var name = "name_example";  // string |  (optional) 
            var onlyActive = true;  // bool? |  (optional) 
            var attributes = new List<string>(); // List<string> | Limit the attributes returned in the response to the specified set. (optional) 
            var language = "language_example";  // string |  (optional) 

            try
            {
                // Search for recommendation lists.
                InlineResponse2001 result = apiInstance.GetRecommendationListSearch(name, onlyActive, attributes, language);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling RecommendationListApi.GetRecommendationListSearch: " + e.Message );
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
 **name** | **string**|  | [optional] 
 **onlyActive** | **bool?**|  | [optional] 
 **attributes** | [**List&lt;string&gt;**](string.md)| Limit the attributes returned in the response to the specified set. | [optional] 
 **language** | **string**|  | [optional] 

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

<a name="postrecommendationlistrevisionlist"></a>
# **PostRecommendationListRevisionList**
> InlineResponse2003 PostRecommendationListRevisionList (InlineObject inlineObject)

List of revisions of a recommendation list.

List of revisions of a recommendation list, excluding the elements of each revision.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.RecommendationListAPIforDigitalPortals.Api;
using FactSet.SDK.RecommendationListAPIforDigitalPortals.Client;
using FactSet.SDK.RecommendationListAPIforDigitalPortals.Model;

namespace Example
{
    public class PostRecommendationListRevisionListExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.RecommendationListAPIforDigitalPortals.Client.Configuration();

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

            var apiInstance = new RecommendationListApi(config);

            var inlineObject = new InlineObject(); // InlineObject | 

            try
            {
                // List of revisions of a recommendation list.
                InlineResponse2003 result = apiInstance.PostRecommendationListRevisionList(inlineObject);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling RecommendationListApi.PostRecommendationListRevisionList: " + e.Message );
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
 **inlineObject** | [**InlineObject**](InlineObject.md)|  | 

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

