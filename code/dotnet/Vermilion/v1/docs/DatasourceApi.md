# FactSet.SDK.Vermilion.Api.DatasourceApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetAllDataSources**](DatasourceApi.md#getalldatasources) | **GET** /v1/{tenant}/data-sources | Lists all datasources
[**GetDataSourceByCode**](DatasourceApi.md#getdatasourcebycode) | **GET** /v1/{tenant}/data-sources/{dataSourceCode} | Gets a datasource
[**GetDataSourceData**](DatasourceApi.md#getdatasourcedata) | **GET** /v1/{tenant}/data-sources/{dataSourceCode}/data | Gets the data for the datasource



<a name="getalldatasources"></a>
# **GetAllDataSources**
> DataSourceList GetAllDataSources (string tenant, List<string> sort = null, int? paginationLimit = null, int? paginationOffset = null)

Lists all datasources

List all datasources the user has permission to see

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.Vermilion.Api;
using FactSet.SDK.Vermilion.Client;
using FactSet.SDK.Vermilion.Model;

namespace Example
{
    public class GetAllDataSourcesExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.Vermilion.Client.Configuration();

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

            var apiInstance = new DatasourceApi(config);

            var tenant = "TENANT";  // string | The code of the tenancy
            var sort = new List<string>(); // List<string> | The column to sort on. Append - to sort in descending order. If parameter is not given, no sorting will be done (optional) 
            var paginationLimit = 25;  // int? | Non-negative maximum number of entries to return. Default is 25 (optional)  (default to 25)
            var paginationOffset = 0;  // int? | Non-negative number of entries to skip. Default is 0 (optional)  (default to 0)

            try
            {
                // Lists all datasources
                DataSourceList result = apiInstance.GetAllDataSources(tenant, sort, paginationLimit, paginationOffset);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling DatasourceApi.GetAllDataSources: " + e.Message );
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
 **tenant** | **string**| The code of the tenancy | 
 **sort** | [**List&lt;string&gt;**](string.md)| The column to sort on. Append - to sort in descending order. If parameter is not given, no sorting will be done | [optional] 
 **paginationLimit** | **int?**| Non-negative maximum number of entries to return. Default is 25 | [optional] [default to 25]
 **paginationOffset** | **int?**| Non-negative number of entries to skip. Default is 0 | [optional] [default to 0]

### Return type
[**DataSourceList**](DataSourceList.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **401** | Unauthorised |  -  |
| **403** | No permissions to view datasources in VRS |  -  |
| **406** | Unsupported Accept header. Header needs to be set to application/json. |  -  |
| **500** | The server have encountered an unhandled error due to which request was not fulfilled. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getdatasourcebycode"></a>
# **GetDataSourceByCode**
> DataSourceData GetDataSourceByCode (string tenant, string dataSourceCode)

Gets a datasource

Gets a datasource based on the code passed

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.Vermilion.Api;
using FactSet.SDK.Vermilion.Client;
using FactSet.SDK.Vermilion.Model;

namespace Example
{
    public class GetDataSourceByCodeExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.Vermilion.Client.Configuration();

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

            var apiInstance = new DatasourceApi(config);

            var tenant = "TENANT";  // string | The code of the tenancy
            var dataSourceCode = "DSCODE";  // string | The code of the datasource

            try
            {
                // Gets a datasource
                DataSourceData result = apiInstance.GetDataSourceByCode(tenant, dataSourceCode);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling DatasourceApi.GetDataSourceByCode: " + e.Message );
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
 **tenant** | **string**| The code of the tenancy | 
 **dataSourceCode** | **string**| The code of the datasource | 

### Return type
[**DataSourceData**](DataSourceData.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **401** | Unauthorised |  -  |
| **403** | No permissions to view datasources in VRS |  -  |
| **404** | The supplied datasource code was not found |  -  |
| **406** | Unsupported Accept header. Header needs to be set to application/json. |  -  |
| **500** | The server have encountered an unhandled error due to which request was not fulfilled. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getdatasourcedata"></a>
# **GetDataSourceData**
> DataSourceDataInstance GetDataSourceData (string tenant, string dataSourceCode, string entityCodes = null, string entityKeys = null, int? paginationLimit = null, int? paginationOffset = null)

Gets the data for the datasource

Gets the data for the datasource. There are optional query parameters to filter the data

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.Vermilion.Api;
using FactSet.SDK.Vermilion.Client;
using FactSet.SDK.Vermilion.Model;

namespace Example
{
    public class GetDataSourceDataExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.Vermilion.Client.Configuration();

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

            var apiInstance = new DatasourceApi(config);

            var tenant = "TENANT";  // string | The code of the tenancy
            var dataSourceCode = "DSCODE";  // string | The code of the datasource
            var entityCodes = "FUNDS";  // string | A series of query parameter used to filter the data for a datasource. This represents the entities for the datasource. E.g.: entityCodes=ACCOUNT~FUNDS (optional) 
            var entityKeys = "Test2";  // string | A series of query parameter used to filter the data for a datasource. This is the entity key value for an entity selection. E.g.: entityKeys=1~Test2 (optional) 
            var paginationLimit = 25;  // int? | Non-negative maximum number of entries to return. Default is 25 (optional)  (default to 25)
            var paginationOffset = 0;  // int? | Non-negative number of entries to skip. Default is 0 (optional)  (default to 0)

            try
            {
                // Gets the data for the datasource
                DataSourceDataInstance result = apiInstance.GetDataSourceData(tenant, dataSourceCode, entityCodes, entityKeys, paginationLimit, paginationOffset);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling DatasourceApi.GetDataSourceData: " + e.Message );
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
 **tenant** | **string**| The code of the tenancy | 
 **dataSourceCode** | **string**| The code of the datasource | 
 **entityCodes** | **string**| A series of query parameter used to filter the data for a datasource. This represents the entities for the datasource. E.g.: entityCodes&#x3D;ACCOUNT~FUNDS | [optional] 
 **entityKeys** | **string**| A series of query parameter used to filter the data for a datasource. This is the entity key value for an entity selection. E.g.: entityKeys&#x3D;1~Test2 | [optional] 
 **paginationLimit** | **int?**| Non-negative maximum number of entries to return. Default is 25 | [optional] [default to 25]
 **paginationOffset** | **int?**| Non-negative number of entries to skip. Default is 0 | [optional] [default to 0]

### Return type
[**DataSourceDataInstance**](DataSourceDataInstance.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation - returns data for the datasource |  -  |
| **400** | The supplied datasource code was either missing or invalid, or the query parameters are invalid |  -  |
| **401** | Unauthorised |  -  |
| **403** | No permissions to view datasources in VRS |  -  |
| **404** | The supplied datasource code was not found |  -  |
| **406** | Unsupported Accept header. Header needs to be set to application/json. |  -  |
| **500** | The server have encountered an unhandled error due to which request was not fulfilled. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


