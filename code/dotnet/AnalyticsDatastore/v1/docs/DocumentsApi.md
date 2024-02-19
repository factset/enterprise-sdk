# FactSet.SDK.AnalyticsDatastore.Api.DocumentsApi

All URIs are relative to *https://api.factset.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetDocumentsEndPoint**](DocumentsApi.md#getdocumentsendpoint) | **POST** /analytics/pub-datastore/tag-search/v1/documents/search | Gets a list of Documents that a user has access to.
[**GetProductTypes**](DocumentsApi.md#getproducttypes) | **POST** /analytics/pub-datastore/tag-search/v1/product-types/search | Gets a list of product types that a user has access to.
[**GetSingleTagEndPoint**](DocumentsApi.md#getsingletagendpoint) | **GET** /analytics/pub-datastore/tag-search/v1/tags/{name} | Get a single tag definition based on its name
[**GetTagValuesEndPoint**](DocumentsApi.md#gettagvaluesendpoint) | **POST** /analytics/pub-datastore/tag-search/v1/tags/{name}/values | Gets a list of tag values for the given name
[**GetTagsEndPoint**](DocumentsApi.md#gettagsendpoint) | **GET** /analytics/pub-datastore/tag-search/v1/tags | Gets a list of tag definitions for the user.



<a name="getdocumentsendpoint"></a>
# **GetDocumentsEndPoint**
> DocumentListResponse GetDocumentsEndPoint (DocumentRequest documentRequest)

Gets a list of Documents that a user has access to.

Retrieves metadata around documents stored in the Analytics Datastore Service. Each Document will have a 'url' property which will act as a re-direct to the underlying document data    This end point supports pagination and filtering through the use of the request body listed below.    To discover what tags are available to filter on, see GET /tags and GET /tags/{name}/values to retrieve these filter values.    Similarly, to discover what product types are available to filter on, see POST /product-types/search to retrieve a list of product types.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.AnalyticsDatastore.Api;
using FactSet.SDK.AnalyticsDatastore.Client;
using FactSet.SDK.AnalyticsDatastore.Model;

namespace Example
{
    public class GetDocumentsEndPointExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.AnalyticsDatastore.Client.Configuration();

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

            var apiInstance = new DocumentsApi(config);

            var documentRequest = new DocumentRequest(); // DocumentRequest | Example request of a filtered Documents search call

            try
            {
                // Gets a list of Documents that a user has access to.
                DocumentListResponse result = apiInstance.GetDocumentsEndPoint(documentRequest);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling DocumentsApi.GetDocumentsEndPoint: " + e.Message );
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
 **documentRequest** | [**DocumentRequest**](DocumentRequest.md)| Example request of a filtered Documents search call | 

### Return type
[**DocumentListResponse**](DocumentListResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Expected response, a list of documents the user has access to. |  -  |
| **400** | Invalid parameter provided. |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |
| **401** | Missing or invalid authentication. |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |
| **403** | User is forbidden with current credentials |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |
| **404** | The provided request does not exist. |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |
| **500** | Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |
| **503** | Request timed out. Retry the request in sometime. |  * X-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  * X-RateLimit-Reset - Number of seconds remaining till rate limit resets. <br>  * X-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getproducttypes"></a>
# **GetProductTypes**
> ProductTypeListResponse GetProductTypes (TagFilterModel tagFilterModel)

Gets a list of product types that a user has access to.

Retrieves a list of product types that have been specified across all documents the user has access to

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.AnalyticsDatastore.Api;
using FactSet.SDK.AnalyticsDatastore.Client;
using FactSet.SDK.AnalyticsDatastore.Model;

namespace Example
{
    public class GetProductTypesExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.AnalyticsDatastore.Client.Configuration();

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

            var apiInstance = new DocumentsApi(config);

            var tagFilterModel = new TagFilterModel(); // TagFilterModel | Request body to apply when filtering on this end point. Pagination controls are applied through the pagination object and additional tag filters can be used by supplying the tag name and its value in the tags object.

            try
            {
                // Gets a list of product types that a user has access to.
                ProductTypeListResponse result = apiInstance.GetProductTypes(tagFilterModel);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling DocumentsApi.GetProductTypes: " + e.Message );
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
 **tagFilterModel** | [**TagFilterModel**](TagFilterModel.md)| Request body to apply when filtering on this end point. Pagination controls are applied through the pagination object and additional tag filters can be used by supplying the tag name and its value in the tags object. | 

### Return type
[**ProductTypeListResponse**](ProductTypeListResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Expected response, a list of product types the user has access to. |  -  |
| **400** | Invalid parameter provided. |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |
| **401** | Missing or invalid authentication. |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |
| **403** | User is forbidden with current credentials |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |
| **404** | The provided request does not exist. |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |
| **500** | Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |
| **503** | Request timed out. Retry the request in sometime. |  * X-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  * X-RateLimit-Reset - Number of seconds remaining till rate limit resets. <br>  * X-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getsingletagendpoint"></a>
# **GetSingleTagEndPoint**
> TagResponse GetSingleTagEndPoint (string name)

Get a single tag definition based on its name

Retrieve a tag definition based on its name

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.AnalyticsDatastore.Api;
using FactSet.SDK.AnalyticsDatastore.Client;
using FactSet.SDK.AnalyticsDatastore.Model;

namespace Example
{
    public class GetSingleTagEndPointExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.AnalyticsDatastore.Client.Configuration();

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

            var apiInstance = new DocumentsApi(config);

            var name = "name_example";  // string | The name of the tag

            try
            {
                // Get a single tag definition based on its name
                TagResponse result = apiInstance.GetSingleTagEndPoint(name);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling DocumentsApi.GetSingleTagEndPoint: " + e.Message );
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
 **name** | **string**| The name of the tag | 

### Return type
[**TagResponse**](TagResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Expected response, returns the tag requested |  -  |
| **400** | Invalid parameter provided. |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |
| **401** | Missing or invalid authentication. |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |
| **403** | User is forbidden with current credentials |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |
| **404** | The provided request does not exist. |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |
| **500** | Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |
| **503** | Request timed out. Retry the request in sometime. |  * X-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  * X-RateLimit-Reset - Number of seconds remaining till rate limit resets. <br>  * X-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="gettagvaluesendpoint"></a>
# **GetTagValuesEndPoint**
> TagValuesListResponse GetTagValuesEndPoint (string name, TagFilterModel tagFilterModel)

Gets a list of tag values for the given name

Returns a list of tag values depending on the name provided. Supports filtering on additional tag name value pairs, which operates as an 'AND' where the Document must have the tag name specified in the path AND the filtered parameter.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.AnalyticsDatastore.Api;
using FactSet.SDK.AnalyticsDatastore.Client;
using FactSet.SDK.AnalyticsDatastore.Model;

namespace Example
{
    public class GetTagValuesEndPointExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.AnalyticsDatastore.Client.Configuration();

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

            var apiInstance = new DocumentsApi(config);

            var name = "name_example";  // string | The name of the tag
            var tagFilterModel = new TagFilterModel(); // TagFilterModel | Request body to apply when filtering on this end point. Pagination controls are applied through the pagination object and additional tag filters can be used by supplying the tag name and its value in the tags object.

            try
            {
                // Gets a list of tag values for the given name
                TagValuesListResponse result = apiInstance.GetTagValuesEndPoint(name, tagFilterModel);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling DocumentsApi.GetTagValuesEndPoint: " + e.Message );
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
 **name** | **string**| The name of the tag | 
 **tagFilterModel** | [**TagFilterModel**](TagFilterModel.md)| Request body to apply when filtering on this end point. Pagination controls are applied through the pagination object and additional tag filters can be used by supplying the tag name and its value in the tags object. | 

### Return type
[**TagValuesListResponse**](TagValuesListResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Expected response, returns a list of tag definitions the user has access to. |  -  |
| **400** | Invalid parameter provided. |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |
| **401** | Missing or invalid authentication. |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |
| **403** | User is forbidden with current credentials |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |
| **404** | The provided request does not exist. |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |
| **500** | Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |
| **503** | Request timed out. Retry the request in sometime. |  * X-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  * X-RateLimit-Reset - Number of seconds remaining till rate limit resets. <br>  * X-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="gettagsendpoint"></a>
# **GetTagsEndPoint**
> TagListResponse GetTagsEndPoint (int? paginationOffset = null, int? paginationLimit = null)

Gets a list of tag definitions for the user.

Tag definitions consist of a name and a type. Use this end point to see a list of pre-existing tags that can be used to filter on the Documents end point.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.AnalyticsDatastore.Api;
using FactSet.SDK.AnalyticsDatastore.Client;
using FactSet.SDK.AnalyticsDatastore.Model;

namespace Example
{
    public class GetTagsEndPointExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.AnalyticsDatastore.Client.Configuration();

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

            var apiInstance = new DocumentsApi(config);

            var paginationOffset = 0;  // int? | The offset integer on where to begin paginating (optional)  (default to 0)
            var paginationLimit = 50;  // int? | The limit of records to return when paginating (optional)  (default to 50)

            try
            {
                // Gets a list of tag definitions for the user.
                TagListResponse result = apiInstance.GetTagsEndPoint(paginationOffset, paginationLimit);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling DocumentsApi.GetTagsEndPoint: " + e.Message );
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
 **paginationOffset** | **int?**| The offset integer on where to begin paginating | [optional] [default to 0]
 **paginationLimit** | **int?**| The limit of records to return when paginating | [optional] [default to 50]

### Return type
[**TagListResponse**](TagListResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Expected response, returns a list of tag definitions the user has access to. |  -  |
| **400** | Invalid parameter provided. |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |
| **401** | Missing or invalid authentication. |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |
| **403** | User is forbidden with current credentials |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |
| **404** | The provided request does not exist. |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |
| **500** | Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |
| **503** | Request timed out. Retry the request in sometime. |  * X-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  * X-RateLimit-Reset - Number of seconds remaining till rate limit resets. <br>  * X-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


