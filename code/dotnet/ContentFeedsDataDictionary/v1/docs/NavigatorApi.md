# FactSet.SDK.ContentFeedsDataDictionary.Api.NavigatorApi

All URIs are relative to *https://api.factset.com/data-dictionary*

Method | HTTP request | Description
------------- | ------------- | -------------
[**NavigatorBasicSearchPost**](NavigatorApi.md#navigatorbasicsearchpost) | **POST** /navigator/basic_search | Returns the data items (along with the products they belong to) that contain at least one of the search terms as a substring of either their name or description.
[**NavigatorDataItemsProductIdGet**](NavigatorApi.md#navigatordataitemsproductidget) | **GET** /navigator/data_items/{Product_id} | Get the list of data items associated with a product for Navigator.
[**NavigatorProductsGet**](NavigatorApi.md#navigatorproductsget) | **GET** /navigator/products | Get the list of products for Navigator.
[**NavigatorSourcesDataItemIdGet**](NavigatorApi.md#navigatorsourcesdataitemidget) | **GET** /navigator/sources/{DataItem_id} | Get a list of sources where the specified data item can be found, for each delivery method, filtered to the appearances of the given data item within the specified product.
[**NavigatorSourcesGet**](NavigatorApi.md#navigatorsourcesget) | **GET** /navigator/sources | Get a list of sources by delivery method for the given product_id
[**NavigatorTableFieldsTableIdGet**](NavigatorApi.md#navigatortablefieldstableidget) | **GET** /navigator/table_fields/{Table_id} | Get the list of fields associated with a table for Navigator, and the code information for the specified data item, if applicable.



<a name="navigatorbasicsearchpost"></a>
# **NavigatorBasicSearchPost**
> BasicSearchResponse NavigatorBasicSearchPost (BasicSearchRequest basicSearchRequest)

Returns the data items (along with the products they belong to) that contain at least one of the search terms as a substring of either their name or description.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.ContentFeedsDataDictionary.Api;
using FactSet.SDK.ContentFeedsDataDictionary.Client;
using FactSet.SDK.ContentFeedsDataDictionary.Model;

namespace Example
{
    public class NavigatorBasicSearchPostExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.ContentFeedsDataDictionary.Client.Configuration();

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

            var apiInstance = new NavigatorApi(config);

            var basicSearchRequest = new BasicSearchRequest(); // BasicSearchRequest | A list of search terms (each term must be at least two characters).

            try
            {
                // Returns the data items (along with the products they belong to) that contain at least one of the search terms as a substring of either their name or description.
                BasicSearchResponse result = apiInstance.NavigatorBasicSearchPost(basicSearchRequest);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling NavigatorApi.NavigatorBasicSearchPost: " + e.Message );
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
 **basicSearchRequest** | [**BasicSearchRequest**](BasicSearchRequest.md)| A list of search terms (each term must be at least two characters). | 

### Return type
[**BasicSearchResponse**](BasicSearchResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation. |  -  |
| **400** | The request body was not formatted properly. |  -  |
| **401** | You are not authorized to view this page. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="navigatordataitemsproductidget"></a>
# **NavigatorDataItemsProductIdGet**
> List&lt;DataItem&gt; NavigatorDataItemsProductIdGet (string productId)

Get the list of data items associated with a product for Navigator.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.ContentFeedsDataDictionary.Api;
using FactSet.SDK.ContentFeedsDataDictionary.Client;
using FactSet.SDK.ContentFeedsDataDictionary.Model;

namespace Example
{
    public class NavigatorDataItemsProductIdGetExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.ContentFeedsDataDictionary.Client.Configuration();

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

            var apiInstance = new NavigatorApi(config);

            var productId = "productId_example";  // string | The id for the Product to fetch the list of data items for.

            try
            {
                // Get the list of data items associated with a product for Navigator.
                List<DataItem> result = apiInstance.NavigatorDataItemsProductIdGet(productId);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling NavigatorApi.NavigatorDataItemsProductIdGet: " + e.Message );
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
 **productId** | **string**| The id for the Product to fetch the list of data items for. | 

### Return type
[**List&lt;DataItem&gt;**](DataItem.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation. |  -  |
| **401** | You are not authorized to view this page. |  -  |
| **404** | The specified Product_id was not found. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="navigatorproductsget"></a>
# **NavigatorProductsGet**
> List&lt;Product&gt; NavigatorProductsGet ()

Get the list of products for Navigator.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.ContentFeedsDataDictionary.Api;
using FactSet.SDK.ContentFeedsDataDictionary.Client;
using FactSet.SDK.ContentFeedsDataDictionary.Model;

namespace Example
{
    public class NavigatorProductsGetExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.ContentFeedsDataDictionary.Client.Configuration();

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

            var apiInstance = new NavigatorApi(config);


            try
            {
                // Get the list of products for Navigator.
                List<Product> result = apiInstance.NavigatorProductsGet();
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling NavigatorApi.NavigatorProductsGet: " + e.Message );
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
[**List&lt;Product&gt;**](Product.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation. |  -  |
| **401** | You are not authorized to view this page. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="navigatorsourcesdataitemidget"></a>
# **NavigatorSourcesDataItemIdGet**
> NavigatorSourcesResponse NavigatorSourcesDataItemIdGet (string dataItemId, string productId)

Get a list of sources where the specified data item can be found, for each delivery method, filtered to the appearances of the given data item within the specified product.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.ContentFeedsDataDictionary.Api;
using FactSet.SDK.ContentFeedsDataDictionary.Client;
using FactSet.SDK.ContentFeedsDataDictionary.Model;

namespace Example
{
    public class NavigatorSourcesDataItemIdGetExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.ContentFeedsDataDictionary.Client.Configuration();

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

            var apiInstance = new NavigatorApi(config);

            var dataItemId = "dataItemId_example";  // string | The id for the DataItem to fetch the sources for.
            var productId = "productId_example";  // string | The id for the Product to filter down the sources returned on.

            try
            {
                // Get a list of sources where the specified data item can be found, for each delivery method, filtered to the appearances of the given data item within the specified product.
                NavigatorSourcesResponse result = apiInstance.NavigatorSourcesDataItemIdGet(dataItemId, productId);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling NavigatorApi.NavigatorSourcesDataItemIdGet: " + e.Message );
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
 **dataItemId** | **string**| The id for the DataItem to fetch the sources for. | 
 **productId** | **string**| The id for the Product to filter down the sources returned on. | 

### Return type
[**NavigatorSourcesResponse**](NavigatorSourcesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation. |  -  |
| **401** | You are not authorized to view this page. |  -  |
| **404** | The specified DataItem_id was not found. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="navigatorsourcesget"></a>
# **NavigatorSourcesGet**
> NavigatorSourcesResponse NavigatorSourcesGet (string productId)

Get a list of sources by delivery method for the given product_id

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.ContentFeedsDataDictionary.Api;
using FactSet.SDK.ContentFeedsDataDictionary.Client;
using FactSet.SDK.ContentFeedsDataDictionary.Model;

namespace Example
{
    public class NavigatorSourcesGetExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.ContentFeedsDataDictionary.Client.Configuration();

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

            var apiInstance = new NavigatorApi(config);

            var productId = "productId_example";  // string | The id for the Product to filter down the sources returned on.

            try
            {
                // Get a list of sources by delivery method for the given product_id
                NavigatorSourcesResponse result = apiInstance.NavigatorSourcesGet(productId);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling NavigatorApi.NavigatorSourcesGet: " + e.Message );
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
 **productId** | **string**| The id for the Product to filter down the sources returned on. | 

### Return type
[**NavigatorSourcesResponse**](NavigatorSourcesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation. |  -  |
| **401** | You are not authorized to view this page. |  -  |
| **404** | The specified DataItem_id was not found. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="navigatortablefieldstableidget"></a>
# **NavigatorTableFieldsTableIdGet**
> TableCodeFieldInfoResponse NavigatorTableFieldsTableIdGet (string tableId, string dataItemId = null)

Get the list of fields associated with a table for Navigator, and the code information for the specified data item, if applicable.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.ContentFeedsDataDictionary.Api;
using FactSet.SDK.ContentFeedsDataDictionary.Client;
using FactSet.SDK.ContentFeedsDataDictionary.Model;

namespace Example
{
    public class NavigatorTableFieldsTableIdGetExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.ContentFeedsDataDictionary.Client.Configuration();

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

            var apiInstance = new NavigatorApi(config);

            var tableId = "tableId_example";  // string | The id for the Table to fetch the fields for.
            var dataItemId = "dataItemId_example";  // string | The id for the DataItem. This is required in case the data item is represented as a code in Standard DataFeeds. (optional) 

            try
            {
                // Get the list of fields associated with a table for Navigator, and the code information for the specified data item, if applicable.
                TableCodeFieldInfoResponse result = apiInstance.NavigatorTableFieldsTableIdGet(tableId, dataItemId);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling NavigatorApi.NavigatorTableFieldsTableIdGet: " + e.Message );
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
 **tableId** | **string**| The id for the Table to fetch the fields for. | 
 **dataItemId** | **string**| The id for the DataItem. This is required in case the data item is represented as a code in Standard DataFeeds. | [optional] 

### Return type
[**TableCodeFieldInfoResponse**](TableCodeFieldInfoResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation. |  -  |
| **401** | You are not authorized to view this page. |  -  |
| **404** | The specified Table_id was not found. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


