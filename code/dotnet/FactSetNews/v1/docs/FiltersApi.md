# FactSet.SDK.FactSetNews.Api.FiltersApi

All URIs are relative to *https://api.factset.com/content/news/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetFilters**](FiltersApi.md#getfilters) | **GET** /filters | Retrieve all FactSet News filters
[**GetNewsFiltersCategories**](FiltersApi.md#getnewsfilterscategories) | **GET** /filters/categories | Retrieve all News filter categories
[**GetNewsFiltersCountries**](FiltersApi.md#getnewsfilterscountries) | **GET** /filters/countries | Retrieve all News filter countries
[**GetNewsFiltersRegions**](FiltersApi.md#getnewsfiltersregions) | **GET** /filters/regions | Retrieve all News filter regions
[**GetNewsFiltersSources**](FiltersApi.md#getnewsfilterssources) | **GET** /filters/sources | Retrieve all News filter sources
[**GetNewsFiltersTopics**](FiltersApi.md#getnewsfilterstopics) | **GET** /filters/topics | Retrieve all News filter topics
[**GetNewsFiltersWatchlists**](FiltersApi.md#getnewsfilterswatchlists) | **GET** /filters/watchlists | Retrieve all News filter watchlists



<a name="getfilters"></a>
# **GetFilters**
> FilterResponse GetFilters (List<string> attributes = null)

Retrieve all FactSet News filters

If structured flag is set, parent and child filter information will be returned. If flattened flag is set, flattened filters will be returned which can be used with the `/headlines` and `/views/create` endpoints. Both flags can be set to return both sets of filters.  If no params are provided it will return both.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetNews.Api;
using FactSet.SDK.FactSetNews.Client;
using FactSet.SDK.FactSetNews.Model;

namespace Example
{
    public class GetFiltersExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetNews.Client.Configuration();

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

            var apiInstance = new FiltersApi(config);

            var attributes = new List<string>(); // List<string> | Pass a list of filters to return the respective type of filter. Accepted list values are \"structured\" and/or \"flattened\". If no _attributes are specified, all filters will be returned in the response (this is the default response).  (optional) 

            try
            {
                // Retrieve all FactSet News filters
                FilterResponse result = apiInstance.GetFilters(attributes);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling FiltersApi.GetFilters: " + e.Message );
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
 **attributes** | [**List&lt;string&gt;**](string.md)| Pass a list of filters to return the respective type of filter. Accepted list values are \&quot;structured\&quot; and/or \&quot;flattened\&quot;. If no _attributes are specified, all filters will be returned in the response (this is the default response).  | [optional] 

### Return type
[**FilterResponse**](FilterResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthenticated |  -  |
| **404** | Not Found |  -  |
| **429** | Limit Exceeded |  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Reset - Number of seconds remaining till rate limit resets. <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getnewsfilterscategories"></a>
# **GetNewsFiltersCategories**
> FilterCategoriesResponse GetNewsFiltersCategories (List<string> attributes = null)

Retrieve all News filter categories

If structured flag is set, parent and child filter information will be returned. If flattened flag is set, flattened filters will be returned which can be used with the `/headlines` and `/views/create` endpoints. Both flags can be set to return both sets of filters.  If no params are provided it will return both.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetNews.Api;
using FactSet.SDK.FactSetNews.Client;
using FactSet.SDK.FactSetNews.Model;

namespace Example
{
    public class GetNewsFiltersCategoriesExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetNews.Client.Configuration();

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

            var apiInstance = new FiltersApi(config);

            var attributes = new List<string>(); // List<string> | Pass a list of filters to return the respective type of filter categories. Accepted list values are \"structured\" and/or \"flattened\". If no _attributes are specified, all filters will be returned in the response (this is the default response).  (optional) 

            try
            {
                // Retrieve all News filter categories
                FilterCategoriesResponse result = apiInstance.GetNewsFiltersCategories(attributes);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling FiltersApi.GetNewsFiltersCategories: " + e.Message );
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
 **attributes** | [**List&lt;string&gt;**](string.md)| Pass a list of filters to return the respective type of filter categories. Accepted list values are \&quot;structured\&quot; and/or \&quot;flattened\&quot;. If no _attributes are specified, all filters will be returned in the response (this is the default response).  | [optional] 

### Return type
[**FilterCategoriesResponse**](FilterCategoriesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns news categories |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthenticated |  -  |
| **404** | Not Found |  -  |
| **429** | Limit Exceeded |  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Reset - Number of seconds remaining till rate limit resets. <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getnewsfilterscountries"></a>
# **GetNewsFiltersCountries**
> FilterCountriesResponse GetNewsFiltersCountries (List<string> attributes = null)

Retrieve all News filter countries

If structured flag is set, parent and child filter information will be returned. If flattened flag is set, flattened filters will be returned which can be used with the `/headlines` and `/views/create` endpoints. Both flags can be set to return both sets of filters.  If no params are provided it will return both.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetNews.Api;
using FactSet.SDK.FactSetNews.Client;
using FactSet.SDK.FactSetNews.Model;

namespace Example
{
    public class GetNewsFiltersCountriesExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetNews.Client.Configuration();

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

            var apiInstance = new FiltersApi(config);

            var attributes = new List<string>(); // List<string> | Pass a list of filters to return the respective type of filter countries. Accepted list values are \"structured\" and/or \"flattened\". If no _attributes are specified, all filters will be returned in the response (this is the default response).  (optional) 

            try
            {
                // Retrieve all News filter countries
                FilterCountriesResponse result = apiInstance.GetNewsFiltersCountries(attributes);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling FiltersApi.GetNewsFiltersCountries: " + e.Message );
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
 **attributes** | [**List&lt;string&gt;**](string.md)| Pass a list of filters to return the respective type of filter countries. Accepted list values are \&quot;structured\&quot; and/or \&quot;flattened\&quot;. If no _attributes are specified, all filters will be returned in the response (this is the default response).  | [optional] 

### Return type
[**FilterCountriesResponse**](FilterCountriesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns News countries. |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthenticated |  -  |
| **404** | Not Found |  -  |
| **429** | Limit Exceeded |  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Reset - Number of seconds remaining till rate limit resets. <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getnewsfiltersregions"></a>
# **GetNewsFiltersRegions**
> FilterRegionsResponse GetNewsFiltersRegions (List<string> attributes = null)

Retrieve all News filter regions

If structured flag is set, parent and child filter information will be returned. If flattened flag is set, flattened filters will be returned which can be used with the `/headlines` and `/views/create` endpoints. Both flags can be set to return both sets of filters.  If no params are provided it will return both.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetNews.Api;
using FactSet.SDK.FactSetNews.Client;
using FactSet.SDK.FactSetNews.Model;

namespace Example
{
    public class GetNewsFiltersRegionsExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetNews.Client.Configuration();

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

            var apiInstance = new FiltersApi(config);

            var attributes = new List<string>(); // List<string> | Pass a list of filters to return the respective type of filter regions. Accepted list values are \"structured\" and/or \"flattened\". If no _attributes are specified, all filters will be returned in the response (this is the default response).  (optional) 

            try
            {
                // Retrieve all News filter regions
                FilterRegionsResponse result = apiInstance.GetNewsFiltersRegions(attributes);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling FiltersApi.GetNewsFiltersRegions: " + e.Message );
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
 **attributes** | [**List&lt;string&gt;**](string.md)| Pass a list of filters to return the respective type of filter regions. Accepted list values are \&quot;structured\&quot; and/or \&quot;flattened\&quot;. If no _attributes are specified, all filters will be returned in the response (this is the default response).  | [optional] 

### Return type
[**FilterRegionsResponse**](FilterRegionsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns News regions. |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthenticated |  -  |
| **404** | Not Found |  -  |
| **429** | Limit Exceeded |  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Reset - Number of seconds remaining till rate limit resets. <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getnewsfilterssources"></a>
# **GetNewsFiltersSources**
> FilterSourcesResponse GetNewsFiltersSources (List<string> attributes = null)

Retrieve all News filter sources

If structured flag is set, parent and child filter information will be returned. If flattened flag is set, flattened filters will be returned which can be used with the `/headlines` and `/views/create` endpoints. Both flags can be set to return both sets of filters.  If no params are provided it will return both.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetNews.Api;
using FactSet.SDK.FactSetNews.Client;
using FactSet.SDK.FactSetNews.Model;

namespace Example
{
    public class GetNewsFiltersSourcesExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetNews.Client.Configuration();

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

            var apiInstance = new FiltersApi(config);

            var attributes = new List<string>(); // List<string> | Pass a list of filters to return the respective type of filter sources. Accepted list values are \"structured\" and/or \"flattened\". If no _attributes are specified, all filters will be returned in the response (this is the default response).  (optional) 

            try
            {
                // Retrieve all News filter sources
                FilterSourcesResponse result = apiInstance.GetNewsFiltersSources(attributes);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling FiltersApi.GetNewsFiltersSources: " + e.Message );
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
 **attributes** | [**List&lt;string&gt;**](string.md)| Pass a list of filters to return the respective type of filter sources. Accepted list values are \&quot;structured\&quot; and/or \&quot;flattened\&quot;. If no _attributes are specified, all filters will be returned in the response (this is the default response).  | [optional] 

### Return type
[**FilterSourcesResponse**](FilterSourcesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns News Sources. |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthenticated |  -  |
| **404** | Not Found |  -  |
| **429** | Limit Exceeded |  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Reset - Number of seconds remaining till rate limit resets. <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getnewsfilterstopics"></a>
# **GetNewsFiltersTopics**
> FilterTopicResponse GetNewsFiltersTopics (List<string> attributes = null)

Retrieve all News filter topics

If structured flag is set, parent and child filter information will be returned. If flattened flag is set, flattened filters will be returned which can be used with the `/headlines` and `/views/create` endpoints. Both flags can be set to return both sets of filters.  If no params are provided it will return both.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetNews.Api;
using FactSet.SDK.FactSetNews.Client;
using FactSet.SDK.FactSetNews.Model;

namespace Example
{
    public class GetNewsFiltersTopicsExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetNews.Client.Configuration();

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

            var apiInstance = new FiltersApi(config);

            var attributes = new List<string>(); // List<string> | Pass a list of filters to return the respective type of filter topics. Accepted list values are \"structured\" and/or \"flattened\". If no _attributes are specified, all filters will be returned in the response (this is the default response).  (optional) 

            try
            {
                // Retrieve all News filter topics
                FilterTopicResponse result = apiInstance.GetNewsFiltersTopics(attributes);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling FiltersApi.GetNewsFiltersTopics: " + e.Message );
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
 **attributes** | [**List&lt;string&gt;**](string.md)| Pass a list of filters to return the respective type of filter topics. Accepted list values are \&quot;structured\&quot; and/or \&quot;flattened\&quot;. If no _attributes are specified, all filters will be returned in the response (this is the default response).  | [optional] 

### Return type
[**FilterTopicResponse**](FilterTopicResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns News topics. |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthenticated |  -  |
| **404** | Not Found |  -  |
| **429** | Limit Exceeded |  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Reset - Number of seconds remaining till rate limit resets. <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getnewsfilterswatchlists"></a>
# **GetNewsFiltersWatchlists**
> FilterWatchlistsResponse GetNewsFiltersWatchlists (List<string> attributes = null)

Retrieve all News filter watchlists

If structured flag is set, parent and child filter information will be returned. If flattened flag is set, flattened filters will be returned which can be used with the `/headlines` and `/views/create` endpoints. Both flags can be set to return both sets of filters.  If no params are provided it will return both.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetNews.Api;
using FactSet.SDK.FactSetNews.Client;
using FactSet.SDK.FactSetNews.Model;

namespace Example
{
    public class GetNewsFiltersWatchlistsExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetNews.Client.Configuration();

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

            var apiInstance = new FiltersApi(config);

            var attributes = new List<string>(); // List<string> | Pass a list of filters to return the respective type of filter watchlists. Accepted list values are \"structured\" and/or \"flattened\". If no _attributes are specified, all filters will be returned in the response (this is the default response).  (optional) 

            try
            {
                // Retrieve all News filter watchlists
                FilterWatchlistsResponse result = apiInstance.GetNewsFiltersWatchlists(attributes);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling FiltersApi.GetNewsFiltersWatchlists: " + e.Message );
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
 **attributes** | [**List&lt;string&gt;**](string.md)| Pass a list of filters to return the respective type of filter watchlists. Accepted list values are \&quot;structured\&quot; and/or \&quot;flattened\&quot;. If no _attributes are specified, all filters will be returned in the response (this is the default response).  | [optional] 

### Return type
[**FilterWatchlistsResponse**](FilterWatchlistsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns News watchlists. |  -  |
| **400** | Bad Request. This can occur for invalid parameter. |  -  |
| **401** | Unauthenticated |  -  |
| **404** | Not Found |  -  |
| **429** | Limit Exceeded |  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Reset - Number of seconds remaining till rate limit resets. <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


