# FactSet.SDK.Vermilion.Api.ReportApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**V1TenantReportsGet**](ReportApi.md#v1tenantreportsget) | **GET** /v1/{tenant}/reports | Gets all report definitions
[**V1TenantReportsReportDefinitionCodeGet**](ReportApi.md#v1tenantreportsreportdefinitioncodeget) | **GET** /v1/{tenant}/reports/{reportDefinitionCode} | Gets a report definition


<a name="v1tenantreportsget"></a>
# **V1TenantReportsGet**
> List&lt;ReportDefinitionList&gt; V1TenantReportsGet (string tenant, string sort = null, int? paginationLimit = null, int? paginationOffset = null)

Gets all report definitions

Gets all report definitions the user has permissions for

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
    public class V1TenantReportsGetExample
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

            var apiInstance = new ReportApi(config);
            var tenant = "tenant_example";  // string | The code of the tenancy
            var sort = _sort=name;  // string | The column to sort on. Can add - to sort (optional) 
            var paginationLimit = 25;  // int? | Non-negative maximum number of entries to return (optional) 
            var paginationOffset = 0;  // int? | Non-negative number of entries to skip (optional) 

            try
            {
                // Gets all report definitions
                List<ReportDefinitionList> result = apiInstance.V1TenantReportsGet(tenant, sort, paginationLimit, paginationOffset);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling ReportApi.V1TenantReportsGet: " + e.Message );
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
 **sort** | **string**| The column to sort on. Can add - to sort | [optional] 
 **paginationLimit** | **int?**| Non-negative maximum number of entries to return | [optional] 
 **paginationOffset** | **int?**| Non-negative number of entries to skip | [optional] 

### Return type

[**List&lt;ReportDefinitionList&gt;**](ReportDefinitionList.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **400** | The supplied report definition code was either missing or invalid, or the report definition was not found |  -  |
| **401** | Unauthorised |  -  |
| **403** | No permissions to view reports in VRS |  -  |
| **406** | Unsupported Accept header. Header needs to be set to application/json. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="v1tenantreportsreportdefinitioncodeget"></a>
# **V1TenantReportsReportDefinitionCodeGet**
> ReportDefinitionData V1TenantReportsReportDefinitionCodeGet (string tenant, string reportDefinitionCode)

Gets a report definition

Gets a report defintion based on the code specified

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
    public class V1TenantReportsReportDefinitionCodeGetExample
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

            var apiInstance = new ReportApi(config);
            var tenant = "tenant_example";  // string | The code of the tenancy
            var reportDefinitionCode = "reportDefinitionCode_example";  // string | The code of the report definition

            try
            {
                // Gets a report definition
                ReportDefinitionData result = apiInstance.V1TenantReportsReportDefinitionCodeGet(tenant, reportDefinitionCode);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling ReportApi.V1TenantReportsReportDefinitionCodeGet: " + e.Message );
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
 **reportDefinitionCode** | **string**| The code of the report definition | 

### Return type

[**ReportDefinitionData**](ReportDefinitionData.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **400** | The supplied report definition code was either missing or invalid, or the report definition was not found |  -  |
| **401** | Unauthorised |  -  |
| **403** | No permissions to view reports in VRS |  -  |
| **404** | The supplied report definition code was was not found |  -  |
| **406** | Unsupported Accept header. Header needs to be set to application/json. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

