# FactSet.SDK.Vermilion.Api.ReportInstanceApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CancelReportGeneration**](ReportInstanceApi.md#cancelreportgeneration) | **DELETE** /v1/{tenant}/report-instances/{reportInstanceId} | Cancels a report generation
[**DownloadReportFile**](ReportInstanceApi.md#downloadreportfile) | **GET** /v1/{tenant}/report-instances/{reportInstanceId}/results/{reportFileName} | Gets the generated file
[**GetAllReportInstances**](ReportInstanceApi.md#getallreportinstances) | **GET** /v1/{tenant}/report-instances | Gets a list of report instances
[**GetReportGenerationLogs**](ReportInstanceApi.md#getreportgenerationlogs) | **GET** /v1/{tenant}/report-instances/{reportInstanceId}/logs | Gets a list of logs for the report instance generation
[**GetReportInstanceById**](ReportInstanceApi.md#getreportinstancebyid) | **GET** /v1/{tenant}/report-instances/{reportInstanceId} | Gets a report instance based on the ID
[**StartReportGeneration**](ReportInstanceApi.md#startreportgeneration) | **POST** /v1/report-instances/generate | Generates a report



<a name="cancelreportgeneration"></a>
# **CancelReportGeneration**
> void CancelReportGeneration (string tenant, string reportInstanceId)

Cancels a report generation

Sends a request to cancel a report generation based on the report instance id passed

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
    public class CancelReportGenerationExample
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

            var apiInstance = new ReportInstanceApi(config);

            var tenant = "TENANT";  // string | The code of the tenancy
            var reportInstanceId = "123456";  // string | The id of the report instance

            try
            {
                // Cancels a report generation
                apiInstance.CancelReportGeneration(tenant, reportInstanceId);
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling ReportInstanceApi.CancelReportGeneration: " + e.Message );
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


<a name="downloadreportfile"></a>
# **DownloadReportFile**
> System.IO.Stream DownloadReportFile (string tenant, string reportInstanceId, string reportFileName)

Gets the generated file

Get the generated file for a report instance. Users can fetch the generated report once the generation is finished. The report instance id and the report file name are passed in as path paramters. The following mapping defines the respective Content-Type for the outputFormat defined during report generation. | outputFormat | Content-Type | | - -- -- -- -- -- -- -- - | - -- -- -- -- -- -| |WORD     | application/msword | |WORD2010 |   application/vnd.openxmlformats-officedocument.wordprocessingml.document| |EXCEL    |   application/vnd.ms-excel| |EXCEL2010|   application/vnd.openxmlformats-officedocument.spreadsheetml.sheet| |PPT      |   application/vnd.ms-powerpoint| |PPT2010  |   application/vnd.openxmlformats-officedocument.presentationml.presentation| |PDF      |   application/pdf| |CSV      |   text/csv| |XML      |   application/xml| |VXML     |   application/xml| |HTML     |   text/html| |PS       |   application/postscript|

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
    public class DownloadReportFileExample
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

            var apiInstance = new ReportInstanceApi(config);

            var tenant = "TENANT";  // string | The code of the tenancy
            var reportInstanceId = "123456";  // string | Used to validate that report file name belongs to the report instance passed
            var reportFileName = "xyz.pdf";  // string | The report file name that has to be retrieved. report file name. E.g: xyz.pdf

            try
            {
                // Gets the generated file
                System.IO.Stream result = apiInstance.DownloadReportFile(tenant, reportInstanceId, reportFileName);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling ReportInstanceApi.DownloadReportFile: " + e.Message );
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
**System.IO.Stream**

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/pdf, application/vnd.openxmlformats-officedocument.presentationml.presentation, application/vnd.ms-powerpoint, application/vnd.openxmlformats-officedocument.spreadsheetml.sheet, application/vnd.ms-excel, application/vnd.openxmlformats-officedocument.wordprocessingml.document, application/msword, application/postscript, text/csv, text/html, application/xml, application/zip, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **400** | The supplied report instance id was either missing or invalid or the report instance was not found. The supplied report file name was either invalid or not found |  -  |
| **401** | Unauthorised |  -  |
| **403** | No permissions to view the generated file in VRS |  -  |
| **406** | Unsupported Accept header. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getallreportinstances"></a>
# **GetAllReportInstances**
> ReportInstanceList GetAllReportInstances (string tenant, string reportDefinitionCode = null, string entityCodes = null, string entityKeys = null, string sectionFilter = null, string outputFormat = null, List<string> sort = null, int? paginationLimit = null, int? paginationOffset = null)

Gets a list of report instances

Gets a list of report instances. This can be filtered down further by including query parameters in the URL. For example, a report definition id can be added so the only report instances returned are the ones with a matching id

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
    public class GetAllReportInstancesExample
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

            var apiInstance = new ReportInstanceApi(config);

            var tenant = "TENANT";  // string | The code of the tenancy
            var reportDefinitionCode = "RPCODE";  // string | Acts as a filter for the retrieval process. Filters the report instances that match the report definition code (optional) 
            var entityCodes = "SYSTEM_LANG";  // string | A series of query parameters used to filter the report instances by entity code. E.g: entityCode=DATE&entityCode=SYSTEM_LANG (optional) 
            var entityKeys = "en-gb";  // string | A series of query parameters used to filter the report instances by entity keys. E.g: entityKey=en-gb (optional) 
            var sectionFilter = "testFilter";  // string | Acts as a filter for the retrieval process. Filters the report instances that match the section filter (optional) 
            var outputFormat = "pdf";  // string | Acts as a filter for the retrieval process. Filters the report instances that match the output format (optional) 
            var sort = new List<string>(); // List<string> | The column to sort on. Append - to sort in descending order. If parameter is not given, sorting will be based on the report instance id in descending order (optional) 
            var paginationLimit = 25;  // int? | Non-negative maximum number of entries to return (optional)  (default to 25)
            var paginationOffset = 0;  // int? | Non-negative number of entries to skip (optional)  (default to 0)

            try
            {
                // Gets a list of report instances
                ReportInstanceList result = apiInstance.GetAllReportInstances(tenant, reportDefinitionCode, entityCodes, entityKeys, sectionFilter, outputFormat, sort, paginationLimit, paginationOffset);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling ReportInstanceApi.GetAllReportInstances: " + e.Message );
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
 **sort** | [**List&lt;string&gt;**](string.md)| The column to sort on. Append - to sort in descending order. If parameter is not given, sorting will be based on the report instance id in descending order | [optional] 
 **paginationLimit** | **int?**| Non-negative maximum number of entries to return | [optional] [default to 25]
 **paginationOffset** | **int?**| Non-negative number of entries to skip | [optional] [default to 0]

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


<a name="getreportgenerationlogs"></a>
# **GetReportGenerationLogs**
> ReportInstanceLogList GetReportGenerationLogs (string tenant, string reportInstanceId, string errorsOnly = null, List<string> sort = null, int? paginationLimit = null, int? paginationOffset = null)

Gets a list of logs for the report instance generation

Gets a list of logs for the generated report instance. Allows the user to sort on log message, type and date. Also allows for retrieving of just the errors & warnings'

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
    public class GetReportGenerationLogsExample
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

            var apiInstance = new ReportInstanceApi(config);

            var tenant = "TENANT";  // string | The code of the tenancy
            var reportInstanceId = "123456";  // string | Used to validate that report file name belongs to the report instance passed
            var errorsOnly = "true";  // string | If the parameter is set to true the endpoint should return just errors and warnings E.g: errorsOnly=true (optional) 
            var sort = new List<string>(); // List<string> | The column to sort on. Can add - to sort (optional) 
            var paginationLimit = 25;  // int? | Non-negative maximum number of entries to return (optional)  (default to 25)
            var paginationOffset = 0;  // int? | Non-negative number of entries to skip (optional)  (default to 0)

            try
            {
                // Gets a list of logs for the report instance generation
                ReportInstanceLogList result = apiInstance.GetReportGenerationLogs(tenant, reportInstanceId, errorsOnly, sort, paginationLimit, paginationOffset);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling ReportInstanceApi.GetReportGenerationLogs: " + e.Message );
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
 **errorsOnly** | **string**| If the parameter is set to true the endpoint should return just errors and warnings E.g: errorsOnly&#x3D;true | [optional] 
 **sort** | [**List&lt;string&gt;**](string.md)| The column to sort on. Can add - to sort | [optional] 
 **paginationLimit** | **int?**| Non-negative maximum number of entries to return | [optional] [default to 25]
 **paginationOffset** | **int?**| Non-negative number of entries to skip | [optional] [default to 0]

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


<a name="getreportinstancebyid"></a>
# **GetReportInstanceById**
> ReportInstanceData GetReportInstanceById (string reportInstanceId, string tenant)

Gets a report instance based on the ID

Gets a report instance object based on the ID passed

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
    public class GetReportInstanceByIdExample
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

            var apiInstance = new ReportInstanceApi(config);

            var reportInstanceId = "123456";  // string | The ID of the report instance
            var tenant = "TENANT";  // string | The code of the tenancy

            try
            {
                // Gets a report instance based on the ID
                ReportInstanceData result = apiInstance.GetReportInstanceById(reportInstanceId, tenant);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling ReportInstanceApi.GetReportInstanceById: " + e.Message );
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
[**ReportInstanceData**](ReportInstanceData.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  * Location - A callback URL to the updated group, for example https://example.com/VRSAPI/scim/v2/Groups/1 <br>  |
| **400** | The supplied report instance id was either missing or invalid, or the report instance was not found |  -  |
| **401** | Unauthorised |  -  |
| **403** | No permissions to view reports in VRS |  -  |
| **404** | The supplied report instance ID could not be found |  -  |
| **406** | Unsupported Accept header. Header needs to be set to application/json. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="startreportgeneration"></a>
# **StartReportGeneration**
> ReportInstanceDataResponse StartReportGeneration (ReportGenerationRequestBody reportGenerationRequestBody)

Generates a report

Generates a report using the specified ID and the JSON in the request body

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
    public class StartReportGenerationExample
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

            var apiInstance = new ReportInstanceApi(config);

            var reportGenerationRequestBody = new ReportGenerationRequestBody(); // ReportGenerationRequestBody | 

            try
            {
                // Generates a report
                ReportInstanceDataResponse result = apiInstance.StartReportGeneration(reportGenerationRequestBody);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling ReportInstanceApi.StartReportGeneration: " + e.Message );
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
 **reportGenerationRequestBody** | [**ReportGenerationRequestBody**](ReportGenerationRequestBody.md)|  | 

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


