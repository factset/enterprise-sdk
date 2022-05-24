# FactSet.SDK.Vermilion.Api.DatasourceApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**V1TenantDataSourcesDataSourceCodeDataGet**](DatasourceApi.md#v1tenantdatasourcesdatasourcecodedataget) | **GET** /v1/{tenant}/data-sources/{dataSourceCode}/data | Gets the data for the datasource
[**V1TenantDataSourcesDataSourceCodeGet**](DatasourceApi.md#v1tenantdatasourcesdatasourcecodeget) | **GET** /v1/{tenant}/data-sources/{dataSourceCode} | Gets a datasource
[**V1TenantDataSourcesGet**](DatasourceApi.md#v1tenantdatasourcesget) | **GET** /v1/{tenant}/data-sources | Lists all datasources


<a name="v1tenantdatasourcesdatasourcecodedataget"></a>
# **V1TenantDataSourcesDataSourceCodeDataGet**
> List&lt;DataSourceDataInstance&gt; V1TenantDataSourcesDataSourceCodeDataGet (string tenant, string dataSourceCode, string entityCodes = null, string entityKeys = null)

Gets the data for the datasource

Gets the data for the datasource. There are optional query parameters to filter the da

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.Vermilion.Api;
using FactSet.SDK.Vermilion.Client;
using FactSet.SDK.Vermilion.Model;

namespace Example
{
    public class V1TenantDataSourcesDataSourceCodeDataGetExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.PAEngine.Client.Configuration();

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

            var apiInstance = new DatasourceApi(config);
            var tenant = "tenant_example";  // string | The code of the tenancy
            var dataSourceCode = "dataSourceCode_example";  // string | The code of the datasource
            var entityCodes = "entityCodes_example";  // string | A series of query parameter used to filter the data for a datasource. This represents the entities for the datasource. E.g.: entityCodes=ACCOUNT&entityCodes=FUNDS (optional) 
            var entityKeys = "entityKeys_example";  // string | A series of query parameter used to filter the data for a datasource. This is the entity key value for an entity selection. E.g.: entityKeys=1&entityKeys=Test2 (optional) 

            try
            {
                // Gets the data for the datasource
                List<DataSourceDataInstance> result = apiInstance.V1TenantDataSourcesDataSourceCodeDataGet(tenant, dataSourceCode, entityCodes, entityKeys);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling DatasourceApi.V1TenantDataSourcesDataSourceCodeDataGet: " + e.Message );
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
 **entityCodes** | **string**| A series of query parameter used to filter the data for a datasource. This represents the entities for the datasource. E.g.: entityCodes&#x3D;ACCOUNT&amp;entityCodes&#x3D;FUNDS | [optional] 
 **entityKeys** | **string**| A series of query parameter used to filter the data for a datasource. This is the entity key value for an entity selection. E.g.: entityKeys&#x3D;1&amp;entityKeys&#x3D;Test2 | [optional] 

### Return type

[**List&lt;DataSourceDataInstance&gt;**](DataSourceDataInstance.md)

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="v1tenantdatasourcesdatasourcecodeget"></a>
# **V1TenantDataSourcesDataSourceCodeGet**
> DataSourceData V1TenantDataSourcesDataSourceCodeGet (string tenant, string dataSourceCode)

Gets a datasource

Gets a datasource based on the code passed

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.Vermilion.Api;
using FactSet.SDK.Vermilion.Client;
using FactSet.SDK.Vermilion.Model;

namespace Example
{
    public class V1TenantDataSourcesDataSourceCodeGetExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.PAEngine.Client.Configuration();

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

            var apiInstance = new DatasourceApi(config);
            var tenant = "tenant_example";  // string | The code of the tenancy
            var dataSourceCode = "dataSourceCode_example";  // string | The code of the datasource

            try
            {
                // Gets a datasource
                DataSourceData result = apiInstance.V1TenantDataSourcesDataSourceCodeGet(tenant, dataSourceCode);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling DatasourceApi.V1TenantDataSourcesDataSourceCodeGet: " + e.Message );
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="v1tenantdatasourcesget"></a>
# **V1TenantDataSourcesGet**
> DataSourceList V1TenantDataSourcesGet (string tenant, string sort = null, int? paginationLimit = null, int? paginationOffset = null)

Lists all datasources

List all datasources the user has permission to see

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.Vermilion.Api;
using FactSet.SDK.Vermilion.Client;
using FactSet.SDK.Vermilion.Model;

namespace Example
{
    public class V1TenantDataSourcesGetExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.PAEngine.Client.Configuration();

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

            var apiInstance = new DatasourceApi(config);
            var tenant = "tenant_example";  // string | The code of the tenancy
            var sort = _sort=name;  // string | The column to sort on. Append - to sort in descending order. If parameter is not given, no sorting will be done (optional) 
            var paginationLimit = 25;  // int? | Non-negative maximum number of entries to return. Default is 25 (optional) 
            var paginationOffset = 0;  // int? | Non-negative number of entries to skip. Default is 0 (optional) 

            try
            {
                // Lists all datasources
                DataSourceList result = apiInstance.V1TenantDataSourcesGet(tenant, sort, paginationLimit, paginationOffset);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling DatasourceApi.V1TenantDataSourcesGet: " + e.Message );
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
 **sort** | **string**| The column to sort on. Append - to sort in descending order. If parameter is not given, no sorting will be done | [optional] 
 **paginationLimit** | **int?**| Non-negative maximum number of entries to return. Default is 25 | [optional] 
 **paginationOffset** | **int?**| Non-negative number of entries to skip. Default is 0 | [optional] 

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

