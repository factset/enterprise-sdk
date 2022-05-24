# FactSet.SDK.Vermilion.Api.ReportInstanceApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**V1ReportInstancesGeneratePost**](ReportInstanceApi.md#v1reportinstancesgeneratepost) | **POST** /v1/report-instances/generate | Generates a report
[**V1TenantReportInstancesGet**](ReportInstanceApi.md#v1tenantreportinstancesget) | **GET** /v1/{tenant}/report-instances | Gets a list of report instances
[**V1TenantReportInstancesReportInstanceIdDelete**](ReportInstanceApi.md#v1tenantreportinstancesreportinstanceiddelete) | **DELETE** /v1/{tenant}/report-instances/{reportInstanceId} | Cancels a report generation
[**V1TenantReportInstancesReportInstanceIdGet**](ReportInstanceApi.md#v1tenantreportinstancesreportinstanceidget) | **GET** /v1/{tenant}/report-instances/{reportInstanceId} | Gets a report instance based on the ID
[**V1TenantReportInstancesReportInstanceIdLogsGet**](ReportInstanceApi.md#v1tenantreportinstancesreportinstanceidlogsget) | **GET** /v1/{tenant}/report-instances/{reportInstanceId}/logs | Gets a list of logs for the report instance generation
[**V1TenantReportInstancesReportInstanceIdResultsReportFileNameGet**](ReportInstanceApi.md#v1tenantreportinstancesreportinstanceidresultsreportfilenameget) | **GET** /v1/{tenant}/report-instances/{reportInstanceId}/results/{reportFileName} | Gets the generated file


<a name="v1reportinstancesgeneratepost"></a>
# **V1ReportInstancesGeneratePost**
> ReportInstanceDataResponse V1ReportInstancesGeneratePost (InlineObject inlineObject)

Generates a report

Generates a report using the specified ID and the JSON in the request body

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
    public class V1ReportInstancesGeneratePostExample
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

            var apiInstance = new ReportInstanceApi(config);
            var inlineObject = new InlineObject(); // InlineObject | 

            try
            {
                // Generates a report
                ReportInstanceDataResponse result = apiInstance.V1ReportInstancesGeneratePost(inlineObject);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling ReportInstanceApi.V1ReportInstancesGeneratePost: " + e.Message );
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
 **inlineObject** | [**InlineObject**](InlineObject.md)|  | 

### Return type

[**ReportInstanceDataResponse**](ReportInstanceDataResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Report generation request succeeded and report generation is in progress |  * Location - A callback URL to the updated group, for example https://example.com/VRSAPI/scim/v2/Groups/1 <br>  |
| **400** | The supplied report definition code was either missing or invalid, or the report definition was not found |  * Location - A callback URL to the updated group, for example https://example.com/VRSAPI/scim/v2/Groups/1 <br>  |
| **401** | Unauthorised |  * Location - A callback URL to the updated group, for example https://example.com/VRSAPI/scim/v2/Groups/1 <br>  |
| **403** | No permissions to view reports in VRS |  -  |
| **404** | The report code could not be found |  -  |
| **406** | Unsupported Accept header. Header needs to be set to application/json. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="v1tenantreportinstancesget"></a>
# **V1TenantReportInstancesGet**
> ReportInstanceList V1TenantReportInstancesGet (string tenant, string reportDefinitionCode = null, string entityCodes = null, string entityKeys = null, string sectionFilter = null, string outputFormat = null, int? paginationLimit = null, int? paginationOffset = null)

Gets a list of report instances

Gets a list of report instances. This can be filtered down further by including query parameters in the URL. For example, a report definition id can be added so the only report instances returned are the ones with a matching id

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
    public class V1TenantReportInstancesGetExample
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

            var apiInstance = new ReportInstanceApi(config);
            var tenant = "tenant_example";  // string | The code of the tenancy
            var reportDefinitionCode = "reportDefinitionCode_example";  // string | Acts as a filter for the retrieval process. Filters the report instances that match the report definition code (optional) 
            var entityCodes = "entityCodes_example";  // string | A series of query parameters used to filter the report instances by entity code. E.g: entityCode=DATE&entityCode=SYSTEM_LANG (optional) 
            var entityKeys = "entityKeys_example";  // string | A series of query parameters used to filter the report instances by entity keys. E.g: entityKey=en-gb (optional) 
            var sectionFilter = "sectionFilter_example";  // string | Acts as a filter for the retrieval process. Filters the report instances that match the section filter (optional) 
            var outputFormat = "outputFormat_example";  // string | Acts as a filter for the retrieval process. Filters the report instances that match the output format (optional) 
            var paginationLimit = 25;  // int? | Non-negative maximum number of entries to return (optional) 
            var paginationOffset = 0;  // int? | Non-negative number of entries to skip (optional) 

            try
            {
                // Gets a list of report instances
                ReportInstanceList result = apiInstance.V1TenantReportInstancesGet(tenant, reportDefinitionCode, entityCodes, entityKeys, sectionFilter, outputFormat, paginationLimit, paginationOffset);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling ReportInstanceApi.V1TenantReportInstancesGet: " + e.Message );
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
 **reportDefinitionCode** | **string**| Acts as a filter for the retrieval process. Filters the report instances that match the report definition code | [optional] 
 **entityCodes** | **string**| A series of query parameters used to filter the report instances by entity code. E.g: entityCode&#x3D;DATE&amp;entityCode&#x3D;SYSTEM_LANG | [optional] 
 **entityKeys** | **string**| A series of query parameters used to filter the report instances by entity keys. E.g: entityKey&#x3D;en-gb | [optional] 
 **sectionFilter** | **string**| Acts as a filter for the retrieval process. Filters the report instances that match the section filter | [optional] 
 **outputFormat** | **string**| Acts as a filter for the retrieval process. Filters the report instances that match the output format | [optional] 
 **paginationLimit** | **int?**| Non-negative maximum number of entries to return | [optional] 
 **paginationOffset** | **int?**| Non-negative number of entries to skip | [optional] 

### Return type

[**ReportInstanceList**](ReportInstanceList.md)

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
| **403** | No permissions to view reports in VRS |  -  |
| **406** | Unsupported Accept header. Header needs to be set to application/json. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="v1tenantreportinstancesreportinstanceiddelete"></a>
# **V1TenantReportInstancesReportInstanceIdDelete**
> void V1TenantReportInstancesReportInstanceIdDelete (string tenant, string reportInstanceId)

Cancels a report generation

Sends a request to cancel a report generation based on the report instance id passed

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
    public class V1TenantReportInstancesReportInstanceIdDeleteExample
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

            var apiInstance = new ReportInstanceApi(config);
            var tenant = "tenant_example";  // string | The code of the tenancy
            var reportInstanceId = "reportInstanceId_example";  // string | The id of the report instance

            try
            {
                // Cancels a report generation
                apiInstance.V1TenantReportInstancesReportInstanceIdDelete(tenant, reportInstanceId);
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling ReportInstanceApi.V1TenantReportInstancesReportInstanceIdDelete: " + e.Message );
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
 **reportInstanceId** | **string**| The id of the report instance | 

### Return type

void (empty response body)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Successful operation - no response |  -  |
| **400** | The supplied report instance id was either missing or invalid |  -  |
| **401** | Unauthorised |  -  |
| **403** | No permissions to view reports in VRS |  -  |
| **404** | The supplied report instance ID could not be found |  -  |
| **406** | Unsupported Accept header. Header needs to be set to application/json. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="v1tenantreportinstancesreportinstanceidget"></a>
# **V1TenantReportInstancesReportInstanceIdGet**
> void V1TenantReportInstancesReportInstanceIdGet (string reportInstanceId, string tenant)

Gets a report instance based on the ID

Gets a report instance object based on the ID passed

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
    public class V1TenantReportInstancesReportInstanceIdGetExample
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

            var apiInstance = new ReportInstanceApi(config);
            var reportInstanceId = "reportInstanceId_example";  // string | The ID of the report instance
            var tenant = "tenant_example";  // string | The code of the tenancy

            try
            {
                // Gets a report instance based on the ID
                apiInstance.V1TenantReportInstancesReportInstanceIdGet(reportInstanceId, tenant);
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling ReportInstanceApi.V1TenantReportInstancesReportInstanceIdGet: " + e.Message );
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
 **reportInstanceId** | **string**| The ID of the report instance | 
 **tenant** | **string**| The code of the tenancy | 

### Return type

void (empty response body)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Report generation has completed and the report is ready to download |  * Location - A callback URL to the updated group, for example https://example.com/VRSAPI/scim/v2/Groups/1 <br>  |
| **202** | Expected response returned if the report generation is not yet completed. |  -  |
| **400** | The supplied report instance id was either missing or invalid, or the report instance was not found |  -  |
| **401** | Unauthorised |  -  |
| **403** | No permissions to view reports in VRS |  -  |
| **404** | The supplied report instance ID could not be found |  -  |
| **406** | Unsupported Accept header. Header needs to be set to application/json. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="v1tenantreportinstancesreportinstanceidlogsget"></a>
# **V1TenantReportInstancesReportInstanceIdLogsGet**
> ReportInstanceLogList V1TenantReportInstancesReportInstanceIdLogsGet (string tenant, string reportInstanceId, string fullLog = null, string sort = null, int? paginationLimit = null, int? paginationOffset = null)

Gets a list of logs for the report instance generation

Gets a list of logs for the generated report instance. Allows the user to sort on log message, type and date. Also allows for retrieving of just the errors & warnings'

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
    public class V1TenantReportInstancesReportInstanceIdLogsGetExample
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

            var apiInstance = new ReportInstanceApi(config);
            var tenant = "tenant_example";  // string | The code of the tenancy
            var reportInstanceId = "reportInstanceId_example";  // string | Used to validate that report file name belongs to the report instance passed
            var fullLog = "fullLog_example";  // string | Determines if the endpoint should return a full set of logs or just the errors and warnings E.g: fullLog=true (optional) 
            var sort = _sort=sequenceNumber;  // string | The column to sort on. Can add - to sort (optional) 
            var paginationLimit = 25;  // int? | Non-negative maximum number of entries to return (optional) 
            var paginationOffset = 0;  // int? | Non-negative number of entries to skip (optional) 

            try
            {
                // Gets a list of logs for the report instance generation
                ReportInstanceLogList result = apiInstance.V1TenantReportInstancesReportInstanceIdLogsGet(tenant, reportInstanceId, fullLog, sort, paginationLimit, paginationOffset);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling ReportInstanceApi.V1TenantReportInstancesReportInstanceIdLogsGet: " + e.Message );
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
 **reportInstanceId** | **string**| Used to validate that report file name belongs to the report instance passed | 
 **fullLog** | **string**| Determines if the endpoint should return a full set of logs or just the errors and warnings E.g: fullLog&#x3D;true | [optional] 
 **sort** | **string**| The column to sort on. Can add - to sort | [optional] 
 **paginationLimit** | **int?**| Non-negative maximum number of entries to return | [optional] 
 **paginationOffset** | **int?**| Non-negative number of entries to skip | [optional] 

### Return type

[**ReportInstanceLogList**](ReportInstanceLogList.md)

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
| **403** | No permissions to view reports in VRS |  -  |
| **404** | The supplied report instance ID could not be found |  -  |
| **406** | Unsupported Accept header. Header needs to be set to application/json. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="v1tenantreportinstancesreportinstanceidresultsreportfilenameget"></a>
# **V1TenantReportInstancesReportInstanceIdResultsReportFileNameGet**
> void V1TenantReportInstancesReportInstanceIdResultsReportFileNameGet (string tenant, string reportInstanceId, string reportFileName)

Gets the generated file

Get the generated file for a report instance. Users can fetch the generated report once the genration is finished. The report instance id and the report file name are passed in as path paramters

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
    public class V1TenantReportInstancesReportInstanceIdResultsReportFileNameGetExample
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

            var apiInstance = new ReportInstanceApi(config);
            var tenant = "tenant_example";  // string | The code of the tenancy
            var reportInstanceId = "reportInstanceId_example";  // string | Used to validate that report file name belongs to the report instance passed
            var reportFileName = "reportFileName_example";  // string | The report file name that has to be retrieved. report file name. E.g: xyz.pdf

            try
            {
                // Gets the generated file
                apiInstance.V1TenantReportInstancesReportInstanceIdResultsReportFileNameGet(tenant, reportInstanceId, reportFileName);
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling ReportInstanceApi.V1TenantReportInstancesReportInstanceIdResultsReportFileNameGet: " + e.Message );
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
 **reportInstanceId** | **string**| Used to validate that report file name belongs to the report instance passed | 
 **reportFileName** | **string**| The report file name that has to be retrieved. report file name. E.g: xyz.pdf | 

### Return type

void (empty response body)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **400** | The supplied report instance id was either missing or invalid or the report instance was not found. The supplied report file name was either invalid or not found |  -  |
| **401** | Unauthorised |  -  |
| **403** | No permissions to view the generated file in VRS |  -  |
| **406** | Unsupported Accept header. Header needs to be set to application/json. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

