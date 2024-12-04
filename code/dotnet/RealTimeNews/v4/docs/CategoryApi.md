# FactSet.SDK.RealTimeNews.Api.CategoryApi

All URIs are relative to *https://api.factset.com/wealth/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetCategoryDatasetList**](CategoryApi.md#getcategorydatasetlist) | **GET** /category/dataset/list | List of entitled category datasets.
[**GetCategoryGet**](CategoryApi.md#getcategoryget) | **GET** /category/get | Details of a category.
[**GetCategoryInstrumentList**](CategoryApi.md#getcategoryinstrumentlist) | **GET** /category/instrument/list | List of instruments where a specific dataset has assigned a given category.
[**GetCategoryLevelGet**](CategoryApi.md#getcategorylevelget) | **GET** /category/level/get | Details of a category level.
[**GetCategoryList**](CategoryApi.md#getcategorylist) | **GET** /category/list | List of categories.
[**GetCategoryListByLevel**](CategoryApi.md#getcategorylistbylevel) | **GET** /category/list-by-level | List of categories assigned to a category level.
[**GetCategoryListBySystem**](CategoryApi.md#getcategorylistbysystem) | **GET** /category/list-by-system | List of categories assigned to a category system.
[**GetCategoryPathGet**](CategoryApi.md#getcategorypathget) | **GET** /category/path/get | Path from the first level to the level of a specific category.
[**GetCategorySystemGet**](CategoryApi.md#getcategorysystemget) | **GET** /category/system/get | Details of an entitled category system.
[**GetCategorySystemList**](CategoryApi.md#getcategorysystemlist) | **GET** /category/system/list | List of entitled category systems.
[**GetCategorySystemTypeList**](CategoryApi.md#getcategorysystemtypelist) | **GET** /category/system/type/list | List of category system types.



<a name="getcategorydatasetlist"></a>
# **GetCategoryDatasetList**
> InlineResponse20036 GetCategoryDatasetList (List<string> attributes = null, string metaLanguage = null)

List of entitled category datasets.

List of entitled category datasets.

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
    public class GetCategoryDatasetListExample
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

            var apiInstance = new CategoryApi(config);

            var attributes = new List<string>(); // List<string> | Limit the attributes returned in the response to the specified set. (optional) 
            var metaLanguage = "de";  // string | ISO 639-1 code of the language. (optional) 

            try
            {
                // List of entitled category datasets.
                InlineResponse20036 result = apiInstance.GetCategoryDatasetList(attributes, metaLanguage);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling CategoryApi.GetCategoryDatasetList: " + e.Message );
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
 **metaLanguage** | **string**| ISO 639-1 code of the language. | [optional] 

### Return type
[**InlineResponse20036**](InlineResponse20036.md)

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


<a name="getcategoryget"></a>
# **GetCategoryGet**
> InlineResponse20032 GetCategoryGet (decimal id, List<string> attributes = null, string metaLanguage = null)

Details of a category.

Details of a category.

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
    public class GetCategoryGetExample
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

            var apiInstance = new CategoryApi(config);

            var id = 4D;  // decimal | Identifier of a category.
            var attributes = new List<string>(); // List<string> | Limit the attributes returned in the response to the specified set. (optional) 
            var metaLanguage = "de";  // string | ISO 639-1 code of the language. (optional) 

            try
            {
                // Details of a category.
                InlineResponse20032 result = apiInstance.GetCategoryGet(id, attributes, metaLanguage);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling CategoryApi.GetCategoryGet: " + e.Message );
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
 **id** | **decimal**| Identifier of a category. | 
 **attributes** | [**List&lt;string&gt;**](string.md)| Limit the attributes returned in the response to the specified set. | [optional] 
 **metaLanguage** | **string**| ISO 639-1 code of the language. | [optional] 

### Return type
[**InlineResponse20032**](InlineResponse20032.md)

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


<a name="getcategoryinstrumentlist"></a>
# **GetCategoryInstrumentList**
> InlineResponse20037 GetCategoryInstrumentList (decimal idCategory, decimal idCategoryDataset, List<string> attributes = null, decimal? paginationOffset = null, decimal? paginationLimit = null)

List of instruments where a specific dataset has assigned a given category.

List of instruments where a specific dataset has assigned a given category.

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
    public class GetCategoryInstrumentListExample
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

            var apiInstance = new CategoryApi(config);

            var idCategory = 1D;  // decimal | Identifier of a category.
            var idCategoryDataset = 3D;  // decimal | Identifier of a category dataset.
            var attributes = new List<string>(); // List<string> | Limit the attributes returned in the response to the specified set. (optional) 
            var paginationOffset = 0MD;  // decimal? | Non-negative number of entries to skip, or 0 (default). (optional)  (default to 0M)
            var paginationLimit = 20MD;  // decimal? | Non-negative maximum number of entries to return. (optional)  (default to 20M)

            try
            {
                // List of instruments where a specific dataset has assigned a given category.
                InlineResponse20037 result = apiInstance.GetCategoryInstrumentList(idCategory, idCategoryDataset, attributes, paginationOffset, paginationLimit);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling CategoryApi.GetCategoryInstrumentList: " + e.Message );
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
 **idCategory** | **decimal**| Identifier of a category. | 
 **idCategoryDataset** | **decimal**| Identifier of a category dataset. | 
 **attributes** | [**List&lt;string&gt;**](string.md)| Limit the attributes returned in the response to the specified set. | [optional] 
 **paginationOffset** | **decimal?**| Non-negative number of entries to skip, or 0 (default). | [optional] [default to 0M]
 **paginationLimit** | **decimal?**| Non-negative maximum number of entries to return. | [optional] [default to 20M]

### Return type
[**InlineResponse20037**](InlineResponse20037.md)

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


<a name="getcategorylevelget"></a>
# **GetCategoryLevelGet**
> InlineResponse20038 GetCategoryLevelGet (decimal id, List<string> attributes = null, string metaLanguage = null)

Details of a category level.

Details of a category level.

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
    public class GetCategoryLevelGetExample
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

            var apiInstance = new CategoryApi(config);

            var id = 4D;  // decimal | Identifier of a category level. See attribute `levels` in endpoint `/category/system/get` for valid values.
            var attributes = new List<string>(); // List<string> | Limit the attributes returned in the response to the specified set. (optional) 
            var metaLanguage = "de";  // string | ISO 639-1 code of the language. (optional) 

            try
            {
                // Details of a category level.
                InlineResponse20038 result = apiInstance.GetCategoryLevelGet(id, attributes, metaLanguage);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling CategoryApi.GetCategoryLevelGet: " + e.Message );
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
 **id** | **decimal**| Identifier of a category level. See attribute &#x60;levels&#x60; in endpoint &#x60;/category/system/get&#x60; for valid values. | 
 **attributes** | [**List&lt;string&gt;**](string.md)| Limit the attributes returned in the response to the specified set. | [optional] 
 **metaLanguage** | **string**| ISO 639-1 code of the language. | [optional] 

### Return type
[**InlineResponse20038**](InlineResponse20038.md)

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


<a name="getcategorylist"></a>
# **GetCategoryList**
> InlineResponse20033 GetCategoryList (List<decimal> ids, List<string> attributes = null, string metaLanguage = null)

List of categories.

List of categories.

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
    public class GetCategoryListExample
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

            var apiInstance = new CategoryApi(config);

            var ids = new List<decimal>(); // List<decimal> | List of categories belonging to the same category system.
            var attributes = new List<string>(); // List<string> | Limit the attributes returned in the response to the specified set. (optional) 
            var metaLanguage = "de";  // string | ISO 639-1 code of the language. (optional) 

            try
            {
                // List of categories.
                InlineResponse20033 result = apiInstance.GetCategoryList(ids, attributes, metaLanguage);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling CategoryApi.GetCategoryList: " + e.Message );
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
 **ids** | [**List&lt;decimal&gt;**](decimal.md)| List of categories belonging to the same category system. | 
 **attributes** | [**List&lt;string&gt;**](string.md)| Limit the attributes returned in the response to the specified set. | [optional] 
 **metaLanguage** | **string**| ISO 639-1 code of the language. | [optional] 

### Return type
[**InlineResponse20033**](InlineResponse20033.md)

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


<a name="getcategorylistbylevel"></a>
# **GetCategoryListByLevel**
> InlineResponse20034 GetCategoryListByLevel (decimal id, List<string> attributes = null, string metaLanguage = null, decimal? paginationOffset = null, decimal? paginationLimit = null)

List of categories assigned to a category level.

List of categories assigned to a category level.

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
    public class GetCategoryListByLevelExample
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

            var apiInstance = new CategoryApi(config);

            var id = 2D;  // decimal | Identifier of a category level. See attribute `levels` in endpoint `/category/system/get` for valid values.
            var attributes = new List<string>(); // List<string> | Limit the attributes returned in the response to the specified set. (optional) 
            var metaLanguage = "de";  // string | ISO 639-1 code of the language. (optional) 
            var paginationOffset = 0MD;  // decimal? | Non-negative number of entries to skip, or 0 (default). (optional)  (default to 0M)
            var paginationLimit = 20MD;  // decimal? | Non-negative maximum number of entries to return. (optional)  (default to 20M)

            try
            {
                // List of categories assigned to a category level.
                InlineResponse20034 result = apiInstance.GetCategoryListByLevel(id, attributes, metaLanguage, paginationOffset, paginationLimit);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling CategoryApi.GetCategoryListByLevel: " + e.Message );
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
 **id** | **decimal**| Identifier of a category level. See attribute &#x60;levels&#x60; in endpoint &#x60;/category/system/get&#x60; for valid values. | 
 **attributes** | [**List&lt;string&gt;**](string.md)| Limit the attributes returned in the response to the specified set. | [optional] 
 **metaLanguage** | **string**| ISO 639-1 code of the language. | [optional] 
 **paginationOffset** | **decimal?**| Non-negative number of entries to skip, or 0 (default). | [optional] [default to 0M]
 **paginationLimit** | **decimal?**| Non-negative maximum number of entries to return. | [optional] [default to 20M]

### Return type
[**InlineResponse20034**](InlineResponse20034.md)

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


<a name="getcategorylistbysystem"></a>
# **GetCategoryListBySystem**
> InlineResponse20035 GetCategoryListBySystem (decimal id, List<string> attributes = null, string metaLanguage = null, decimal? paginationOffset = null, decimal? paginationLimit = null)

List of categories assigned to a category system.

List of categories assigned to a category system.

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
    public class GetCategoryListBySystemExample
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

            var apiInstance = new CategoryApi(config);

            var id = 5D;  // decimal | Identifier of a category system. See endpoint `/category/system/list` for valid values.
            var attributes = new List<string>(); // List<string> | Limit the attributes returned in the response to the specified set. (optional) 
            var metaLanguage = "en";  // string | ISO 639-1 code of the language. (optional) 
            var paginationOffset = 0MD;  // decimal? | Non-negative number of entries to skip, or 0 (default). (optional)  (default to 0M)
            var paginationLimit = 20MD;  // decimal? | Non-negative maximum number of entries to return. (optional)  (default to 20M)

            try
            {
                // List of categories assigned to a category system.
                InlineResponse20035 result = apiInstance.GetCategoryListBySystem(id, attributes, metaLanguage, paginationOffset, paginationLimit);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling CategoryApi.GetCategoryListBySystem: " + e.Message );
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
 **id** | **decimal**| Identifier of a category system. See endpoint &#x60;/category/system/list&#x60; for valid values. | 
 **attributes** | [**List&lt;string&gt;**](string.md)| Limit the attributes returned in the response to the specified set. | [optional] 
 **metaLanguage** | **string**| ISO 639-1 code of the language. | [optional] 
 **paginationOffset** | **decimal?**| Non-negative number of entries to skip, or 0 (default). | [optional] [default to 0M]
 **paginationLimit** | **decimal?**| Non-negative maximum number of entries to return. | [optional] [default to 20M]

### Return type
[**InlineResponse20035**](InlineResponse20035.md)

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


<a name="getcategorypathget"></a>
# **GetCategoryPathGet**
> InlineResponse20039 GetCategoryPathGet (decimal id, List<string> attributes = null, string metaLanguage = null)

Path from the first level to the level of a specific category.

Path from the first level to the level of a specific category.

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
    public class GetCategoryPathGetExample
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

            var apiInstance = new CategoryApi(config);

            var id = 2D;  // decimal | Identifier of a category.
            var attributes = new List<string>(); // List<string> | Limit the attributes returned in the response to the specified set. (optional) 
            var metaLanguage = "de";  // string | ISO 639-1 code of the language. (optional) 

            try
            {
                // Path from the first level to the level of a specific category.
                InlineResponse20039 result = apiInstance.GetCategoryPathGet(id, attributes, metaLanguage);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling CategoryApi.GetCategoryPathGet: " + e.Message );
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
 **id** | **decimal**| Identifier of a category. | 
 **attributes** | [**List&lt;string&gt;**](string.md)| Limit the attributes returned in the response to the specified set. | [optional] 
 **metaLanguage** | **string**| ISO 639-1 code of the language. | [optional] 

### Return type
[**InlineResponse20039**](InlineResponse20039.md)

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


<a name="getcategorysystemget"></a>
# **GetCategorySystemGet**
> InlineResponse20040 GetCategorySystemGet (decimal id, List<string> attributes = null, string metaLanguage = null)

Details of an entitled category system.

Details of an entitled category system.

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
    public class GetCategorySystemGetExample
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

            var apiInstance = new CategoryApi(config);

            var id = 4D;  // decimal | Identifier of a category system. See endpoint `/category/system/list` for valid values.
            var attributes = new List<string>(); // List<string> | Limit the attributes returned in the response to the specified set. (optional) 
            var metaLanguage = "en";  // string | ISO 639-1 code of the language. (optional) 

            try
            {
                // Details of an entitled category system.
                InlineResponse20040 result = apiInstance.GetCategorySystemGet(id, attributes, metaLanguage);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling CategoryApi.GetCategorySystemGet: " + e.Message );
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
 **id** | **decimal**| Identifier of a category system. See endpoint &#x60;/category/system/list&#x60; for valid values. | 
 **attributes** | [**List&lt;string&gt;**](string.md)| Limit the attributes returned in the response to the specified set. | [optional] 
 **metaLanguage** | **string**| ISO 639-1 code of the language. | [optional] 

### Return type
[**InlineResponse20040**](InlineResponse20040.md)

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


<a name="getcategorysystemlist"></a>
# **GetCategorySystemList**
> InlineResponse20041 GetCategorySystemList (decimal? idType = null, List<string> attributes = null, string metaLanguage = null)

List of entitled category systems.

List of entitled category systems.

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
    public class GetCategorySystemListExample
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

            var apiInstance = new CategoryApi(config);

            var idType = 1D;  // decimal? | Filter for a specific category system type. See endpoint `/category/system/type/list` for valid values. (optional) 
            var attributes = new List<string>(); // List<string> | Limit the attributes returned in the response to the specified set. (optional) 
            var metaLanguage = "de";  // string | ISO 639-1 code of the language. (optional) 

            try
            {
                // List of entitled category systems.
                InlineResponse20041 result = apiInstance.GetCategorySystemList(idType, attributes, metaLanguage);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling CategoryApi.GetCategorySystemList: " + e.Message );
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
 **idType** | **decimal?**| Filter for a specific category system type. See endpoint &#x60;/category/system/type/list&#x60; for valid values. | [optional] 
 **attributes** | [**List&lt;string&gt;**](string.md)| Limit the attributes returned in the response to the specified set. | [optional] 
 **metaLanguage** | **string**| ISO 639-1 code of the language. | [optional] 

### Return type
[**InlineResponse20041**](InlineResponse20041.md)

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


<a name="getcategorysystemtypelist"></a>
# **GetCategorySystemTypeList**
> InlineResponse20042 GetCategorySystemTypeList (List<string> attributes = null, string metaLanguage = null)

List of category system types.

List of category system types.

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
    public class GetCategorySystemTypeListExample
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

            var apiInstance = new CategoryApi(config);

            var attributes = new List<string>(); // List<string> | Limit the attributes returned in the response to the specified set. (optional) 
            var metaLanguage = "en";  // string | ISO 639-1 code of the language. (optional) 

            try
            {
                // List of category system types.
                InlineResponse20042 result = apiInstance.GetCategorySystemTypeList(attributes, metaLanguage);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling CategoryApi.GetCategorySystemTypeList: " + e.Message );
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
 **metaLanguage** | **string**| ISO 639-1 code of the language. | [optional] 

### Return type
[**InlineResponse20042**](InlineResponse20042.md)

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


