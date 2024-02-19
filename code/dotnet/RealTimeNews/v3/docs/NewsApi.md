# FactSet.SDK.RealTimeNews.Api.NewsApi

All URIs are relative to *https://api.factset.com/wealth/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetNewsArticleGet**](NewsApi.md#getnewsarticleget) | **GET** /news/article/get | Details for a news article.
[**GetNewsArticleTypeGet**](NewsApi.md#getnewsarticletypeget) | **GET** /news/article/type/get | Details for a news article type.
[**GetNewsArticleTypeList**](NewsApi.md#getnewsarticletypelist) | **GET** /news/article/type/list | List of news article types.
[**GetNewsDistributorGet**](NewsApi.md#getnewsdistributorget) | **GET** /news/distributor/get | Details of a distributor.
[**GetNewsDistributorList**](NewsApi.md#getnewsdistributorlist) | **GET** /news/distributor/list | List of distributors.
[**GetNewsPublisherGet**](NewsApi.md#getnewspublisherget) | **GET** /news/publisher/get | Details of a publisher.
[**GetNewsPublisherList**](NewsApi.md#getnewspublisherlist) | **GET** /news/publisher/list | List of publishers.
[**GetNewsPublisherListByDistributor**](NewsApi.md#getnewspublisherlistbydistributor) | **GET** /news/publisher/listByDistributor | List of publishers provided by the given distributor.
[**PostNewsArticleList**](NewsApi.md#postnewsarticlelist) | **POST** /news/article/list | List of news articles.
[**PostNewsArticleListByChain**](NewsApi.md#postnewsarticlelistbychain) | **POST** /news/article/listByChain | List news articles of an article chain.
[**PostNewsArticleListByIndex**](NewsApi.md#postnewsarticlelistbyindex) | **POST** /news/article/listByIndex | News articles for instruments that are constituents of the given indices.
[**PostNewsArticleListByInstrument**](NewsApi.md#postnewsarticlelistbyinstrument) | **POST** /news/article/listByInstrument | News articles for instruments.
[**PostNewsArticleListByMediaKind**](NewsApi.md#postnewsarticlelistbymediakind) | **POST** /news/article/listByMediaKind | List news articles which contain media of specific media kinds.
[**PostNewsArticleSearchByText**](NewsApi.md#postnewsarticlesearchbytext) | **POST** /news/article/searchByText | Search for news articles using a fulltext search.
[**PostNewsPublisherSearchByName**](NewsApi.md#postnewspublishersearchbyname) | **POST** /news/publisher/searchByName | Search for publishers.



<a name="getnewsarticleget"></a>
# **GetNewsArticleGet**
> InlineResponse200 GetNewsArticleGet (string code, bool? includeMedia = null, List<string> attributes = null, string language = null)

Details for a news article.

Details for a news article.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.RealTimeNews.Api;
using FactSet.SDK.RealTimeNews.Client;
using FactSet.SDK.RealTimeNews.Model;

namespace Example
{
    public class GetNewsArticleGetExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.RealTimeNews.Client.Configuration();

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

            var apiInstance = new NewsApi(config);

            var code = "code_example";  // string | 
            var includeMedia = false;  // bool? |  (optional)  (default to false)
            var attributes = new List<string>(); // List<string> | Limit the attributes returned in the response to the specified set. (optional) 
            var language = "language_example";  // string |  (optional) 

            try
            {
                // Details for a news article.
                InlineResponse200 result = apiInstance.GetNewsArticleGet(code, includeMedia, attributes, language);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling NewsApi.GetNewsArticleGet: " + e.Message );
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
 **code** | **string**|  | 
 **includeMedia** | **bool?**|  | [optional] [default to false]
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


<a name="getnewsarticletypeget"></a>
# **GetNewsArticleTypeGet**
> InlineResponse2005 GetNewsArticleTypeGet (decimal id, List<string> attributes = null, string language = null)

Details for a news article type.

Details for a news article type.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.RealTimeNews.Api;
using FactSet.SDK.RealTimeNews.Client;
using FactSet.SDK.RealTimeNews.Model;

namespace Example
{
    public class GetNewsArticleTypeGetExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.RealTimeNews.Client.Configuration();

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

            var apiInstance = new NewsApi(config);

            var id = 8.14D;  // decimal | 
            var attributes = new List<string>(); // List<string> | Limit the attributes returned in the response to the specified set. (optional) 
            var language = "language_example";  // string |  (optional) 

            try
            {
                // Details for a news article type.
                InlineResponse2005 result = apiInstance.GetNewsArticleTypeGet(id, attributes, language);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling NewsApi.GetNewsArticleTypeGet: " + e.Message );
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


<a name="getnewsarticletypelist"></a>
# **GetNewsArticleTypeList**
> InlineResponse2006 GetNewsArticleTypeList (List<string> attributes = null, string language = null)

List of news article types.

List of news article types.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.RealTimeNews.Api;
using FactSet.SDK.RealTimeNews.Client;
using FactSet.SDK.RealTimeNews.Model;

namespace Example
{
    public class GetNewsArticleTypeListExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.RealTimeNews.Client.Configuration();

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

            var apiInstance = new NewsApi(config);

            var attributes = new List<string>(); // List<string> | Limit the attributes returned in the response to the specified set. (optional) 
            var language = "language_example";  // string |  (optional) 

            try
            {
                // List of news article types.
                InlineResponse2006 result = apiInstance.GetNewsArticleTypeList(attributes, language);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling NewsApi.GetNewsArticleTypeList: " + e.Message );
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
 **language** | **string**|  | [optional] 

### Return type
[**InlineResponse2006**](InlineResponse2006.md)

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


<a name="getnewsdistributorget"></a>
# **GetNewsDistributorGet**
> InlineResponse2007 GetNewsDistributorGet (decimal id, List<string> attributes = null)

Details of a distributor.

Details of a distributor.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.RealTimeNews.Api;
using FactSet.SDK.RealTimeNews.Client;
using FactSet.SDK.RealTimeNews.Model;

namespace Example
{
    public class GetNewsDistributorGetExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.RealTimeNews.Client.Configuration();

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

            var apiInstance = new NewsApi(config);

            var id = 8.14D;  // decimal | 
            var attributes = new List<string>(); // List<string> | Limit the attributes returned in the response to the specified set. (optional) 

            try
            {
                // Details of a distributor.
                InlineResponse2007 result = apiInstance.GetNewsDistributorGet(id, attributes);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling NewsApi.GetNewsDistributorGet: " + e.Message );
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

### Return type
[**InlineResponse2007**](InlineResponse2007.md)

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


<a name="getnewsdistributorlist"></a>
# **GetNewsDistributorList**
> InlineResponse2008 GetNewsDistributorList (List<decimal> ids = null, List<string> attributes = null, List<string> sort = null)

List of distributors.

List of distributors.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.RealTimeNews.Api;
using FactSet.SDK.RealTimeNews.Client;
using FactSet.SDK.RealTimeNews.Model;

namespace Example
{
    public class GetNewsDistributorListExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.RealTimeNews.Client.Configuration();

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

            var apiInstance = new NewsApi(config);

            var ids = new List<decimal>(); // List<decimal> |  (optional) 
            var attributes = new List<string>(); // List<string> | Limit the attributes returned in the response to the specified set. (optional) 
            var sort = new List<string>(); // List<string> | Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 1 (possibly prefixed) attribute name(s) is allowed. (optional) 

            try
            {
                // List of distributors.
                InlineResponse2008 result = apiInstance.GetNewsDistributorList(ids, attributes, sort);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling NewsApi.GetNewsDistributorList: " + e.Message );
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
 **ids** | [**List&lt;decimal&gt;**](decimal.md)|  | [optional] 
 **attributes** | [**List&lt;string&gt;**](string.md)| Limit the attributes returned in the response to the specified set. | [optional] 
 **sort** | [**List&lt;string&gt;**](string.md)| Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 1 (possibly prefixed) attribute name(s) is allowed. | [optional] 

### Return type
[**InlineResponse2008**](InlineResponse2008.md)

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


<a name="getnewspublisherget"></a>
# **GetNewsPublisherGet**
> InlineResponse2009 GetNewsPublisherGet (decimal id, List<string> attributes = null)

Details of a publisher.

Details of a publisher.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.RealTimeNews.Api;
using FactSet.SDK.RealTimeNews.Client;
using FactSet.SDK.RealTimeNews.Model;

namespace Example
{
    public class GetNewsPublisherGetExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.RealTimeNews.Client.Configuration();

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

            var apiInstance = new NewsApi(config);

            var id = 8.14D;  // decimal | 
            var attributes = new List<string>(); // List<string> | Limit the attributes returned in the response to the specified set. (optional) 

            try
            {
                // Details of a publisher.
                InlineResponse2009 result = apiInstance.GetNewsPublisherGet(id, attributes);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling NewsApi.GetNewsPublisherGet: " + e.Message );
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

### Return type
[**InlineResponse2009**](InlineResponse2009.md)

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


<a name="getnewspublisherlist"></a>
# **GetNewsPublisherList**
> InlineResponse20010 GetNewsPublisherList (List<decimal> ids = null, List<string> attributes = null, List<string> sort = null, decimal? paginationOffset = null, decimal? paginationLimit = null)

List of publishers.

List of publishers.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.RealTimeNews.Api;
using FactSet.SDK.RealTimeNews.Client;
using FactSet.SDK.RealTimeNews.Model;

namespace Example
{
    public class GetNewsPublisherListExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.RealTimeNews.Client.Configuration();

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

            var apiInstance = new NewsApi(config);

            var ids = new List<decimal>(); // List<decimal> |  (optional) 
            var attributes = new List<string>(); // List<string> | Limit the attributes returned in the response to the specified set. (optional) 
            var sort = new List<string>(); // List<string> | Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 1 (possibly prefixed) attribute name(s) is allowed. (optional) 
            var paginationOffset = 0MD;  // decimal? | Non-negative number of entries to skip, or 0 (default). (optional)  (default to 0M)
            var paginationLimit = 20MD;  // decimal? | Non-negative maximum number of entries to return. (optional)  (default to 20M)

            try
            {
                // List of publishers.
                InlineResponse20010 result = apiInstance.GetNewsPublisherList(ids, attributes, sort, paginationOffset, paginationLimit);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling NewsApi.GetNewsPublisherList: " + e.Message );
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
 **ids** | [**List&lt;decimal&gt;**](decimal.md)|  | [optional] 
 **attributes** | [**List&lt;string&gt;**](string.md)| Limit the attributes returned in the response to the specified set. | [optional] 
 **sort** | [**List&lt;string&gt;**](string.md)| Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 1 (possibly prefixed) attribute name(s) is allowed. | [optional] 
 **paginationOffset** | **decimal?**| Non-negative number of entries to skip, or 0 (default). | [optional] [default to 0M]
 **paginationLimit** | **decimal?**| Non-negative maximum number of entries to return. | [optional] [default to 20M]

### Return type
[**InlineResponse20010**](InlineResponse20010.md)

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


<a name="getnewspublisherlistbydistributor"></a>
# **GetNewsPublisherListByDistributor**
> InlineResponse20011 GetNewsPublisherListByDistributor (decimal id, List<string> attributes = null, List<string> sort = null)

List of publishers provided by the given distributor.

List of publishers provided by the given distributor.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.RealTimeNews.Api;
using FactSet.SDK.RealTimeNews.Client;
using FactSet.SDK.RealTimeNews.Model;

namespace Example
{
    public class GetNewsPublisherListByDistributorExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.RealTimeNews.Client.Configuration();

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

            var apiInstance = new NewsApi(config);

            var id = 8.14D;  // decimal | 
            var attributes = new List<string>(); // List<string> | Limit the attributes returned in the response to the specified set. (optional) 
            var sort = new List<string>(); // List<string> | Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 1 (possibly prefixed) attribute name(s) is allowed. (optional) 

            try
            {
                // List of publishers provided by the given distributor.
                InlineResponse20011 result = apiInstance.GetNewsPublisherListByDistributor(id, attributes, sort);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling NewsApi.GetNewsPublisherListByDistributor: " + e.Message );
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
 **sort** | [**List&lt;string&gt;**](string.md)| Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 1 (possibly prefixed) attribute name(s) is allowed. | [optional] 

### Return type
[**InlineResponse20011**](InlineResponse20011.md)

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


<a name="postnewsarticlelist"></a>
# **PostNewsArticleList**
> InlineResponse2001 PostNewsArticleList (PostNewsArticleListRequest postNewsArticleListRequest = null)

List of news articles.

List of news articles.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.RealTimeNews.Api;
using FactSet.SDK.RealTimeNews.Client;
using FactSet.SDK.RealTimeNews.Model;

namespace Example
{
    public class PostNewsArticleListExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.RealTimeNews.Client.Configuration();

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

            var apiInstance = new NewsApi(config);

            var postNewsArticleListRequest = new PostNewsArticleListRequest(); // PostNewsArticleListRequest | Request Body (optional) 

            try
            {
                // List of news articles.
                InlineResponse2001 result = apiInstance.PostNewsArticleList(postNewsArticleListRequest);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling NewsApi.PostNewsArticleList: " + e.Message );
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
 **postNewsArticleListRequest** | [**PostNewsArticleListRequest**](PostNewsArticleListRequest.md)| Request Body | [optional] 

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


<a name="postnewsarticlelistbychain"></a>
# **PostNewsArticleListByChain**
> InlineResponse2002 PostNewsArticleListByChain (PostNewsArticleListByChainRequest postNewsArticleListByChainRequest)

List news articles of an article chain.

List news articles of an article chain.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.RealTimeNews.Api;
using FactSet.SDK.RealTimeNews.Client;
using FactSet.SDK.RealTimeNews.Model;

namespace Example
{
    public class PostNewsArticleListByChainExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.RealTimeNews.Client.Configuration();

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

            var apiInstance = new NewsApi(config);

            var postNewsArticleListByChainRequest = new PostNewsArticleListByChainRequest(); // PostNewsArticleListByChainRequest | Request Body

            try
            {
                // List news articles of an article chain.
                InlineResponse2002 result = apiInstance.PostNewsArticleListByChain(postNewsArticleListByChainRequest);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling NewsApi.PostNewsArticleListByChain: " + e.Message );
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
 **postNewsArticleListByChainRequest** | [**PostNewsArticleListByChainRequest**](PostNewsArticleListByChainRequest.md)| Request Body | 

### Return type
[**InlineResponse2002**](InlineResponse2002.md)

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


<a name="postnewsarticlelistbyindex"></a>
# **PostNewsArticleListByIndex**
> InlineResponse2003 PostNewsArticleListByIndex (PostNewsArticleListByIndexRequest postNewsArticleListByIndexRequest)

News articles for instruments that are constituents of the given indices.

News articles for instruments that are constituents of the given indices.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.RealTimeNews.Api;
using FactSet.SDK.RealTimeNews.Client;
using FactSet.SDK.RealTimeNews.Model;

namespace Example
{
    public class PostNewsArticleListByIndexExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.RealTimeNews.Client.Configuration();

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

            var apiInstance = new NewsApi(config);

            var postNewsArticleListByIndexRequest = new PostNewsArticleListByIndexRequest(); // PostNewsArticleListByIndexRequest | Request Body

            try
            {
                // News articles for instruments that are constituents of the given indices.
                InlineResponse2003 result = apiInstance.PostNewsArticleListByIndex(postNewsArticleListByIndexRequest);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling NewsApi.PostNewsArticleListByIndex: " + e.Message );
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
 **postNewsArticleListByIndexRequest** | [**PostNewsArticleListByIndexRequest**](PostNewsArticleListByIndexRequest.md)| Request Body | 

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


<a name="postnewsarticlelistbyinstrument"></a>
# **PostNewsArticleListByInstrument**
> InlineResponse2004 PostNewsArticleListByInstrument (PostNewsArticleListByInstrumentRequest postNewsArticleListByInstrumentRequest)

News articles for instruments.

News articles for instruments.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.RealTimeNews.Api;
using FactSet.SDK.RealTimeNews.Client;
using FactSet.SDK.RealTimeNews.Model;

namespace Example
{
    public class PostNewsArticleListByInstrumentExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.RealTimeNews.Client.Configuration();

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

            var apiInstance = new NewsApi(config);

            var postNewsArticleListByInstrumentRequest = new PostNewsArticleListByInstrumentRequest(); // PostNewsArticleListByInstrumentRequest | Request Body

            try
            {
                // News articles for instruments.
                InlineResponse2004 result = apiInstance.PostNewsArticleListByInstrument(postNewsArticleListByInstrumentRequest);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling NewsApi.PostNewsArticleListByInstrument: " + e.Message );
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
 **postNewsArticleListByInstrumentRequest** | [**PostNewsArticleListByInstrumentRequest**](PostNewsArticleListByInstrumentRequest.md)| Request Body | 

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


<a name="postnewsarticlelistbymediakind"></a>
# **PostNewsArticleListByMediaKind**
> InlineResponse2001 PostNewsArticleListByMediaKind (PostNewsArticleListByMediaKindRequest postNewsArticleListByMediaKindRequest)

List news articles which contain media of specific media kinds.

List news articles which contain media of specific media kinds.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.RealTimeNews.Api;
using FactSet.SDK.RealTimeNews.Client;
using FactSet.SDK.RealTimeNews.Model;

namespace Example
{
    public class PostNewsArticleListByMediaKindExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.RealTimeNews.Client.Configuration();

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

            var apiInstance = new NewsApi(config);

            var postNewsArticleListByMediaKindRequest = new PostNewsArticleListByMediaKindRequest(); // PostNewsArticleListByMediaKindRequest | Request Body

            try
            {
                // List news articles which contain media of specific media kinds.
                InlineResponse2001 result = apiInstance.PostNewsArticleListByMediaKind(postNewsArticleListByMediaKindRequest);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling NewsApi.PostNewsArticleListByMediaKind: " + e.Message );
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
 **postNewsArticleListByMediaKindRequest** | [**PostNewsArticleListByMediaKindRequest**](PostNewsArticleListByMediaKindRequest.md)| Request Body | 

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


<a name="postnewsarticlesearchbytext"></a>
# **PostNewsArticleSearchByText**
> InlineResponse2001 PostNewsArticleSearchByText (PostNewsArticleSearchByTextRequest postNewsArticleSearchByTextRequest = null)

Search for news articles using a fulltext search.

Search for news articles using a fulltext search. All specified criteria need to be fulfilled for an article to match. Each criterion is handled according to its selectionType; \"include\" requires the criterion to evaluate to true, \"exclude\" requires the criterion to evaluate to false. A criterion is fulfilled when at least one of its values is found.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.RealTimeNews.Api;
using FactSet.SDK.RealTimeNews.Client;
using FactSet.SDK.RealTimeNews.Model;

namespace Example
{
    public class PostNewsArticleSearchByTextExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.RealTimeNews.Client.Configuration();

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

            var apiInstance = new NewsApi(config);

            var postNewsArticleSearchByTextRequest = new PostNewsArticleSearchByTextRequest(); // PostNewsArticleSearchByTextRequest | Request Body (optional) 

            try
            {
                // Search for news articles using a fulltext search.
                InlineResponse2001 result = apiInstance.PostNewsArticleSearchByText(postNewsArticleSearchByTextRequest);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling NewsApi.PostNewsArticleSearchByText: " + e.Message );
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
 **postNewsArticleSearchByTextRequest** | [**PostNewsArticleSearchByTextRequest**](PostNewsArticleSearchByTextRequest.md)| Request Body | [optional] 

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


<a name="postnewspublishersearchbyname"></a>
# **PostNewsPublisherSearchByName**
> InlineResponse20011 PostNewsPublisherSearchByName (PostNewsPublisherSearchByNameRequest postNewsPublisherSearchByNameRequest)

Search for publishers.

Search for publishers by the name of the publisher.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.RealTimeNews.Api;
using FactSet.SDK.RealTimeNews.Client;
using FactSet.SDK.RealTimeNews.Model;

namespace Example
{
    public class PostNewsPublisherSearchByNameExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.RealTimeNews.Client.Configuration();

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

            var apiInstance = new NewsApi(config);

            var postNewsPublisherSearchByNameRequest = new PostNewsPublisherSearchByNameRequest(); // PostNewsPublisherSearchByNameRequest | Request Body

            try
            {
                // Search for publishers.
                InlineResponse20011 result = apiInstance.PostNewsPublisherSearchByName(postNewsPublisherSearchByNameRequest);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling NewsApi.PostNewsPublisherSearchByName: " + e.Message );
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
 **postNewsPublisherSearchByNameRequest** | [**PostNewsPublisherSearchByNameRequest**](PostNewsPublisherSearchByNameRequest.md)| Request Body | 

### Return type
[**InlineResponse20011**](InlineResponse20011.md)

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


