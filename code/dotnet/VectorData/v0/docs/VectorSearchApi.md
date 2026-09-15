# FactSet.SDK.VectorData.Api.VectorSearchApi

All URIs are relative to *https://api.factset.com/content/vector/v0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetFormTypes**](VectorSearchApi.md#getformtypes) | **GET** /form-types | Returns the available form types
[**GetVector**](VectorSearchApi.md#getvector) | **GET** /vector | Returns vector data and metadata for specified vector IDs
[**PostSearch**](VectorSearchApi.md#postsearch) | **POST** /search | Perform semantic search and return ranked results with similarity scores
[**RetrieveSources**](VectorSearchApi.md#retrievesources) | **GET** /sources | Returns the available data sources



<a name="getformtypes"></a>
# **GetFormTypes**
> FormTypesResponse GetFormTypes ()

Returns the available form types

Retrieves and delivers a comprehensive list of all available `formTypes`.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.VectorData.Api;
using FactSet.SDK.VectorData.Client;
using FactSet.SDK.VectorData.Model;

namespace Example
{
    public class GetFormTypesExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.VectorData.Client.Configuration();

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

            var apiInstance = new VectorSearchApi(config);


            try
            {
                // Returns the available form types
                FormTypesResponse result = apiInstance.GetFormTypes();
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling VectorSearchApi.GetFormTypes: " + e.Message );
                Console.WriteLine("Status Code: "+ e.ErrorCode);
                Console.WriteLine(e.StackTrace);
            }
        }
    }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type
[**FormTypesResponse**](FormTypesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad request. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getvector"></a>
# **GetVector**
> VectorResponse GetVector (List<string> vectorId, bool? trimmed = null, int? paginationLimit = null, int? paginationOffset = null)

Returns vector data and metadata for specified vector IDs

Retrieves the complete vector embedding and all associated metadata for one or more vector IDs. Optionally returns trimmed vectors (metadata only) when the trimmed parameter is set to true.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.VectorData.Api;
using FactSet.SDK.VectorData.Client;
using FactSet.SDK.VectorData.Model;

namespace Example
{
    public class GetVectorExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.VectorData.Client.Configuration();

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

            var apiInstance = new VectorSearchApi(config);

            var vectorId = new List<string>(); // List<string> | Unique identifier for a document
            var trimmed = false;  // bool? | If true, returns metadata only without vector embeddings. If false, includes full vector embeddings in the response. (optional)  (default to false)
            var paginationLimit = 10;  // int? | Number of results to return per page. (optional)  (default to 10)
            var paginationOffset = 0;  // int? | Page number of the results to return.  (optional)  (default to 0)

            try
            {
                // Returns vector data and metadata for specified vector IDs
                VectorResponse result = apiInstance.GetVector(vectorId, trimmed, paginationLimit, paginationOffset);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling VectorSearchApi.GetVector: " + e.Message );
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
 **vectorId** | [**List&lt;string&gt;**](string.md)| Unique identifier for a document | 
 **trimmed** | **bool?**| If true, returns metadata only without vector embeddings. If false, includes full vector embeddings in the response. | [optional] [default to false]
 **paginationLimit** | **int?**| Number of results to return per page. | [optional] [default to 10]
 **paginationOffset** | **int?**| Page number of the results to return.  | [optional] [default to 0]

### Return type
[**VectorResponse**](VectorResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad request. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **404** | Not Found |  -  |
| **422** | Unprocessable Entity. Validation failed for one or more request parameters or body fields. |  -  |
| **500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="postsearch"></a>
# **PostSearch**
> SearchResponse PostSearch (SearchRequest searchRequest)

Perform semantic search and return ranked results with similarity scores

Performs semantic search across vectorized financial documents and returns results ranked by similarity score. Supports filtering by themes (including ESG themes and search concepts), sentiment, form types, date ranges, and entity identifiers.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.VectorData.Api;
using FactSet.SDK.VectorData.Client;
using FactSet.SDK.VectorData.Model;

namespace Example
{
    public class PostSearchExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.VectorData.Client.Configuration();

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

            var apiInstance = new VectorSearchApi(config);

            var searchRequest = new SearchRequest(); // SearchRequest | Input parameters for semantic search.

            try
            {
                // Perform semantic search and return ranked results with similarity scores
                SearchResponse result = apiInstance.PostSearch(searchRequest);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling VectorSearchApi.PostSearch: " + e.Message );
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
 **searchRequest** | [**SearchRequest**](SearchRequest.md)| Input parameters for semantic search. | 

### Return type
[**SearchResponse**](SearchResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns search results with similarity scores |  -  |
| **400** | Bad request. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **422** | Unprocessable Entity. Validation failed for one or more request parameters or body fields. |  -  |
| **500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="retrievesources"></a>
# **RetrieveSources**
> SourceResponseData RetrieveSources (bool? entitledSources = null, List<string> type = null)

Returns the available data sources

Retrieves and delivers a comprehensive list of all available `sources`.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.VectorData.Api;
using FactSet.SDK.VectorData.Client;
using FactSet.SDK.VectorData.Model;

namespace Example
{
    public class RetrieveSourcesExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.VectorData.Client.Configuration();

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

            var apiInstance = new VectorSearchApi(config);

            var entitledSources = false;  // bool? | If true, returns only entitled sources. If false, returns all the available sources. (optional)  (default to false)
            var type = new List<string>(); // List<string> | Filters type of sources. (optional) 

            try
            {
                // Returns the available data sources
                SourceResponseData result = apiInstance.RetrieveSources(entitledSources, type);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling VectorSearchApi.RetrieveSources: " + e.Message );
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
 **entitledSources** | **bool?**| If true, returns only entitled sources. If false, returns all the available sources. | [optional] [default to false]
 **type** | [**List&lt;string&gt;**](string.md)| Filters type of sources. | [optional] 

### Return type
[**SourceResponseData**](SourceResponseData.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad request. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


