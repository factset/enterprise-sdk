# FactSet.SDK.StreetAccountNews.Api.FiltersApi

All URIs are relative to *https://api.factset.com/streetaccount/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetStreetAccountFilters**](FiltersApi.md#getstreetaccountfilters) | **GET** /filters | Retrieve all StreetAccount filters
[**GetStreetAccountFiltersCategories**](FiltersApi.md#getstreetaccountfilterscategories) | **GET** /filters/categories | Retrieve all StreetAccount filter categories
[**GetStreetAccountFiltersRegions**](FiltersApi.md#getstreetaccountfiltersregions) | **GET** /filters/regions | Retrieve all StreetAccount filter regions
[**GetStreetAccountFiltersSectors**](FiltersApi.md#getstreetaccountfilterssectors) | **GET** /filters/sectors | Retrieve all StreetAccount filter sectors
[**GetStreetAccountFiltersTopics**](FiltersApi.md#getstreetaccountfilterstopics) | **GET** /filters/topics | Retrieve all StreetAccount filter topics
[**GetStreetAccountFiltersWatchlists**](FiltersApi.md#getstreetaccountfilterswatchlists) | **GET** /filters/watchlists | Retrieve all StreetAccount filter watchlists



<a name="getstreetaccountfilters"></a>
# **GetStreetAccountFilters**
> FilterResponse GetStreetAccountFilters (List<string> attributes = null)

Retrieve all StreetAccount filters

If structured flag is set, parent and child filter information will be returned. If flattened flag is set, flattened filters will be returned which can be used with the headlines and createView endpoints. Both flags can be set to return both sets of filters.  If no params are provided it will return both.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.StreetAccountNews.Api;
using FactSet.SDK.StreetAccountNews.Client;
using FactSet.SDK.StreetAccountNews.Model;

namespace Example
{
    public class GetStreetAccountFiltersExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.StreetAccountNews.Client.Configuration();

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

            var attributes = new List<string>(); // List<string> | Pass a list of filters to return the respective type of filter. Accepted list values are \"structured\" and/or \"flattened\". If no _atrributes are specified, all filters will be returned in the response (this is the default response).  (optional) 

            try
            {
                // Retrieve all StreetAccount filters
                FilterResponse result = apiInstance.GetStreetAccountFilters(attributes);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling FiltersApi.GetStreetAccountFilters: " + e.Message );
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
 **attributes** | [**List&lt;string&gt;**](string.md)| Pass a list of filters to return the respective type of filter. Accepted list values are \&quot;structured\&quot; and/or \&quot;flattened\&quot;. If no _atrributes are specified, all filters will be returned in the response (this is the default response).  | [optional] 

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
| **200** | Returns all filters. |  -  |
| **400** | Bad Request. This can occur for invalid parameter. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses.  |  -  |
| **404** | Not Found |  -  |
| **429** | Limit Exceeded |  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Reset - Number of seconds remaining till rate limit resets. <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getstreetaccountfilterscategories"></a>
# **GetStreetAccountFiltersCategories**
> FilterCategoriesResponse GetStreetAccountFiltersCategories (List<string> attributes = null)

Retrieve all StreetAccount filter categories

If structured flag is set, parent and child filter information will be returned. If flattened flag is set, flattened filters will be returned which can be used with the headlines and createView endpoints. Both flags can be set to return both sets of filters.  If no params are provided it will return both.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.StreetAccountNews.Api;
using FactSet.SDK.StreetAccountNews.Client;
using FactSet.SDK.StreetAccountNews.Model;

namespace Example
{
    public class GetStreetAccountFiltersCategoriesExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.StreetAccountNews.Client.Configuration();

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

            var attributes = new List<string>(); // List<string> | Pass a list of filters to return the respective type of filter categories. Accepted list values are \"structured\" and/or \"flattened\". If no _atrributes are specified, all filters will be returned in the response (this is the default response).  (optional) 

            try
            {
                // Retrieve all StreetAccount filter categories
                FilterCategoriesResponse result = apiInstance.GetStreetAccountFiltersCategories(attributes);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling FiltersApi.GetStreetAccountFiltersCategories: " + e.Message );
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
 **attributes** | [**List&lt;string&gt;**](string.md)| Pass a list of filters to return the respective type of filter categories. Accepted list values are \&quot;structured\&quot; and/or \&quot;flattened\&quot;. If no _atrributes are specified, all filters will be returned in the response (this is the default response).  | [optional] 

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
| **200** | Returns StreetAccount categories |  -  |
| **400** | Bad Request. This can occur for invalid parameter. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses.  |  -  |
| **404** | Not Found |  -  |
| **429** | Limit Exceeded |  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Reset - Number of seconds remaining till rate limit resets. <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getstreetaccountfiltersregions"></a>
# **GetStreetAccountFiltersRegions**
> FilterRegionsResponse GetStreetAccountFiltersRegions (List<string> attributes = null)

Retrieve all StreetAccount filter regions

If structured flag is set, parent and child filter information will be returned. If flattened flag is set, flattened filters will be returned which can be used with the headlines and createView endpoints. Both flags can be set to return both sets of filters.  If no params are provided it will return both.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.StreetAccountNews.Api;
using FactSet.SDK.StreetAccountNews.Client;
using FactSet.SDK.StreetAccountNews.Model;

namespace Example
{
    public class GetStreetAccountFiltersRegionsExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.StreetAccountNews.Client.Configuration();

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

            var attributes = new List<string>(); // List<string> | Pass a list of filters to return the respective type of filter Regions. Accepted list values are \"structured\" and/or \"flattened\". If no _atrributes are specified, all filters will be returned in the response (this is the default response).  (optional) 

            try
            {
                // Retrieve all StreetAccount filter regions
                FilterRegionsResponse result = apiInstance.GetStreetAccountFiltersRegions(attributes);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling FiltersApi.GetStreetAccountFiltersRegions: " + e.Message );
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
 **attributes** | [**List&lt;string&gt;**](string.md)| Pass a list of filters to return the respective type of filter Regions. Accepted list values are \&quot;structured\&quot; and/or \&quot;flattened\&quot;. If no _atrributes are specified, all filters will be returned in the response (this is the default response).  | [optional] 

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
| **200** | Returns StreetAccount regions. |  -  |
| **400** | Bad Request. This can occur for invalid parameter. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses.  |  -  |
| **404** | Not Found |  -  |
| **429** | Limit Exceeded |  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Reset - Number of seconds remaining till rate limit resets. <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getstreetaccountfilterssectors"></a>
# **GetStreetAccountFiltersSectors**
> FilterSectorsResponse GetStreetAccountFiltersSectors (List<string> attributes = null)

Retrieve all StreetAccount filter sectors

If structured flag is set, parent and child filter information will be returned. If flattened flag is set, flattened filters will be returned which can be used with the headlines and createView endpoints. Both flags can be set to return both sets of filters.  If no params are provided it will return both.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.StreetAccountNews.Api;
using FactSet.SDK.StreetAccountNews.Client;
using FactSet.SDK.StreetAccountNews.Model;

namespace Example
{
    public class GetStreetAccountFiltersSectorsExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.StreetAccountNews.Client.Configuration();

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

            var attributes = new List<string>(); // List<string> | Pass a list of filters to return the respective type of filter Sectors. Accepted list values are \"structured\" and/or \"flattened\". If no _atrributes are specified, all filters will be returned in the response (this is the default response).  (optional) 

            try
            {
                // Retrieve all StreetAccount filter sectors
                FilterSectorsResponse result = apiInstance.GetStreetAccountFiltersSectors(attributes);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling FiltersApi.GetStreetAccountFiltersSectors: " + e.Message );
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
 **attributes** | [**List&lt;string&gt;**](string.md)| Pass a list of filters to return the respective type of filter Sectors. Accepted list values are \&quot;structured\&quot; and/or \&quot;flattened\&quot;. If no _atrributes are specified, all filters will be returned in the response (this is the default response).  | [optional] 

### Return type
[**FilterSectorsResponse**](FilterSectorsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns StreetAccount sectors. |  -  |
| **400** | Bad Request. This can occur for invalid parameter. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses.  |  -  |
| **404** | Not Found |  -  |
| **429** | Limit Exceeded |  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Reset - Number of seconds remaining till rate limit resets. <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getstreetaccountfilterstopics"></a>
# **GetStreetAccountFiltersTopics**
> FilterTopicResponse GetStreetAccountFiltersTopics (List<string> attributes = null)

Retrieve all StreetAccount filter topics

If structured flag is set, parent and child filter information will be returned. If flattened flag is set, flattened filters will be returned which can be used with the headlines and createView endpoints. Both flags can be set to return both sets of filters.  If no params are provided it will return both.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.StreetAccountNews.Api;
using FactSet.SDK.StreetAccountNews.Client;
using FactSet.SDK.StreetAccountNews.Model;

namespace Example
{
    public class GetStreetAccountFiltersTopicsExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.StreetAccountNews.Client.Configuration();

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

            var attributes = new List<string>(); // List<string> | Pass a list of filters to return the respective type of filter topics. Accepted list values are \"structured\" and/or \"flattened\". If no _atrributes are specified, all filters will be returned in the response (this is the default response).  (optional) 

            try
            {
                // Retrieve all StreetAccount filter topics
                FilterTopicResponse result = apiInstance.GetStreetAccountFiltersTopics(attributes);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling FiltersApi.GetStreetAccountFiltersTopics: " + e.Message );
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
 **attributes** | [**List&lt;string&gt;**](string.md)| Pass a list of filters to return the respective type of filter topics. Accepted list values are \&quot;structured\&quot; and/or \&quot;flattened\&quot;. If no _atrributes are specified, all filters will be returned in the response (this is the default response).  | [optional] 

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
| **200** | Returns StreetAccount topics. |  -  |
| **400** | Bad Request. This can occur for invalid parameter. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses.  |  -  |
| **404** | Not Found |  -  |
| **429** | Limit Exceeded |  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Reset - Number of seconds remaining till rate limit resets. <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getstreetaccountfilterswatchlists"></a>
# **GetStreetAccountFiltersWatchlists**
> FilterWatchlistsResponse GetStreetAccountFiltersWatchlists (List<string> attributes = null)

Retrieve all StreetAccount filter watchlists

If structured flag is set, parent and child filter information will be returned. If flattened flag is set, flattened filters will be returned which can be used with the headlines and createView endpoints. Both flags can be set to return both sets of filters.  If no params are provided it will return both.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.StreetAccountNews.Api;
using FactSet.SDK.StreetAccountNews.Client;
using FactSet.SDK.StreetAccountNews.Model;

namespace Example
{
    public class GetStreetAccountFiltersWatchlistsExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.StreetAccountNews.Client.Configuration();

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

            var attributes = new List<string>(); // List<string> | Pass a list of filters to return the respective type of filter Watchlists. Accepted list values are \"structured\" and/or \"flattened\". If no _atrributes are specified, all filters will be returned in the response (this is the default response).  (optional) 

            try
            {
                // Retrieve all StreetAccount filter watchlists
                FilterWatchlistsResponse result = apiInstance.GetStreetAccountFiltersWatchlists(attributes);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling FiltersApi.GetStreetAccountFiltersWatchlists: " + e.Message );
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
 **attributes** | [**List&lt;string&gt;**](string.md)| Pass a list of filters to return the respective type of filter Watchlists. Accepted list values are \&quot;structured\&quot; and/or \&quot;flattened\&quot;. If no _atrributes are specified, all filters will be returned in the response (this is the default response).  | [optional] 

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
| **200** | Returns StreetAccount watchlists. |  -  |
| **400** | Bad Request. This can occur for invalid parameter. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses.  |  -  |
| **404** | Not Found |  -  |
| **429** | Limit Exceeded |  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Reset - Number of seconds remaining till rate limit resets. <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


