# FactSet.SDK.Vermilion.Api.WorkflowApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GenerateSchedule**](WorkflowApi.md#generateschedule) | **POST** /v1/{tenant}/schedules/{scheduleDefinitionCode} | Creates schedule for the specified schedule definition
[**GenerateScheduleTasks**](WorkflowApi.md#generatescheduletasks) | **POST** /v1/{tenant}/schedules/{scheduleId}/generate-tasks | Generates the tasks for the initialised schedule
[**GetScheduleById**](WorkflowApi.md#getschedulebyid) | **GET** /v1/{tenant}/schedules/{scheduleId} | Gets a schedule based on the schedule ID
[**GetScheduleDefinitions**](WorkflowApi.md#getscheduledefinitions) | **GET** /v1/{tenant}/schedule-definitions | Retrieves a list of all schedule definitions
[**GetScheduleGenerationLogs**](WorkflowApi.md#getschedulegenerationlogs) | **GET** /v1/{tenant}/schedules/{scheduleId}/logs | Gets the generation logs for a specific schedule
[**GetSchedules**](WorkflowApi.md#getschedules) | **GET** /v1/{tenant}/schedules | Retrieves a list of all schedules
[**GetTask**](WorkflowApi.md#gettask) | **GET** /v1/{tenant}/tasks/{taskId} | Gets a task based on the task ID
[**GetTaskHistory**](WorkflowApi.md#gettaskhistory) | **GET** /v1/{tenant}/tasks/{taskId}/history | Gets the task history for a specific task
[**GetTasks**](WorkflowApi.md#gettasks) | **GET** /v1/{tenant}/tasks | Retrieves a list of all tasks
[**UpdateScheduleStatus**](WorkflowApi.md#updateschedulestatus) | **PATCH** /v1/{tenant}/schedules/{scheduleId}/{status} | Update schedule status for specified schedule
[**UpdateTaskDetails**](WorkflowApi.md#updatetaskdetails) | **PATCH** /v1/{tenant}/tasks/{taskId} | Updates the task details for the specified task.



<a name="generateschedule"></a>
# **GenerateSchedule**
> GenerateScheduleResponse GenerateSchedule (string tenant, string scheduleDefinitionCode, bool? setToRunning = null)

Creates schedule for the specified schedule definition

Creates schedule for the specified Schedule Definition code and sets to running based on the param in the JSON in the request body

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
    public class GenerateScheduleExample
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

            var apiInstance = new WorkflowApi(config);

            var tenant = "TENANT";  // string | The code of the tenancy
            var scheduleDefinitionCode = "TEST_SCHEDULE_DEF";  // string | The schedule definition code for which to generate the schedule
            var setToRunning = true;  // bool? | This parameter is used to set the generated schedule's status to Running.If parameter is set to true, the generated schedule will be set to Running. If no value is provided, the schedule will remain in Initialised status. (optional) 

            try
            {
                // Creates schedule for the specified schedule definition
                GenerateScheduleResponse result = apiInstance.GenerateSchedule(tenant, scheduleDefinitionCode, setToRunning);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling WorkflowApi.GenerateSchedule: " + e.Message );
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
 **scheduleDefinitionCode** | **string**| The schedule definition code for which to generate the schedule | 
 **setToRunning** | **bool?**| This parameter is used to set the generated schedule&#39;s status to Running.If parameter is set to true, the generated schedule will be set to Running. If no value is provided, the schedule will remain in Initialised status. | [optional] 

### Return type
[**GenerateScheduleResponse**](GenerateScheduleResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Schedule generation request succeeded and tasks have been generated |  -  |
| **400** | The supplied schedule definition code missing or invalid |  -  |
| **401** | Unauthorised |  -  |
| **403** | No permissions to create schedule in VRS |  -  |
| **404** | The schedule definition code could not be found |  -  |
| **406** | Unsupported Accept header. Header needs to be set to application/json. |  -  |
| **500** | The server have encountered an unhandled error due to which request was not fulfilled. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="generatescheduletasks"></a>
# **GenerateScheduleTasks**
> ScheduleStatusUpdateResponse GenerateScheduleTasks (string tenant, string scheduleId)

Generates the tasks for the initialised schedule

Generates the schedule tasks for the specified schedule id

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
    public class GenerateScheduleTasksExample
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

            var apiInstance = new WorkflowApi(config);

            var tenant = "TENANT";  // string | The code of the tenancy
            var scheduleId = "123456";  // string | The schedule id for which to generate the tasks

            try
            {
                // Generates the tasks for the initialised schedule
                ScheduleStatusUpdateResponse result = apiInstance.GenerateScheduleTasks(tenant, scheduleId);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling WorkflowApi.GenerateScheduleTasks: " + e.Message );
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
 **scheduleId** | **string**| The schedule id for which to generate the tasks | 

### Return type
[**ScheduleStatusUpdateResponse**](ScheduleStatusUpdateResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Task generation request succeeded and task generation is in progress |  -  |
| **400** | Tasks could not be generated because the schedule is not in an initialized state |  -  |
| **401** | Unauthorised |  -  |
| **403** | No permissions to generate tasks for the schedule |  -  |
| **404** | The schedule id could not be found |  -  |
| **406** | Unsupported Accept header. Header needs to be set to application/json. |  -  |
| **500** | The server might have encountered an unhandled error due to which request was not fulfilled. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getschedulebyid"></a>
# **GetScheduleById**
> ScheduleResponseData GetScheduleById (string tenant, string scheduleId)

Gets a schedule based on the schedule ID

Gets a schedule Object based on the schedule ID passed.

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
    public class GetScheduleByIdExample
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

            var apiInstance = new WorkflowApi(config);

            var tenant = "TENANT";  // string | The code of the tenancy
            var scheduleId = "16304";  // string | The Id of the schedule

            try
            {
                // Gets a schedule based on the schedule ID
                ScheduleResponseData result = apiInstance.GetScheduleById(tenant, scheduleId);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling WorkflowApi.GetScheduleById: " + e.Message );
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
 **scheduleId** | **string**| The Id of the schedule | 

### Return type
[**ScheduleResponseData**](ScheduleResponseData.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **400** | Bad Request. Required values not provided in request parameter or invalid values given (e.g. tenant) |  -  |
| **401** | Unauthorised |  -  |
| **403** | Forbidden. No permissions to view schedule in VRS |  -  |
| **404** | The supplied schedule ID was not found |  -  |
| **406** | Unsupported Accept header. Header needs to be set to application/json. |  -  |
| **500** | The server have encountered an unhandled error due to which request was not fulfilled. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getscheduledefinitions"></a>
# **GetScheduleDefinitions**
> ScheduleDefinitionsList GetScheduleDefinitions (string tenant, string scheduleType = null, string reportDate = null, string lastUpdatedBy = null, string startDate = null, string endDate = null, List<string> sort = null, int? paginationLimit = null, int? paginationOffset = null)

Retrieves a list of all schedule definitions

Retrieves all schedule definitions the user has permissions for. User has sort and filter parameters available to use.

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
    public class GetScheduleDefinitionsExample
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

            var apiInstance = new WorkflowApi(config);

            var tenant = "TENANT";  // string | The code of the tenancy
            var scheduleType = "MANUAL";  // string | Acts as a filter for the retrieval process. Filters the schedule definitions that match the given schedule type. Accepts multiple values separated by a comma, e.g. ?scheduleType=REPEATING,MANUAL (optional) 
            var reportDate = "LAST_DAY_OF_PREV_MONTH";  // string | Acts as a filter for the retrieval process. Filters the schedule definitions that match the given schedule report date.  Accepts multiple values separated by a comma, e.g. ?reportDate=LAST_DAY_OF_PREV_MONTH,CREATION_DATE (optional) 
            var lastUpdatedBy = "John";  // string | Acts as a filter for the retrieval process. Filters the schedule definitions where the provided parameter value matches or is a substring of the last updated by value of the schedule definitions (optional) 
            var startDate = "25 March 2024 00:00:00";  // string | Acts as a filter for the retrieval process. Filters the schedule definitions based on their last updated date, the input date must be of the date format (d MMMMM yyyy 00:00:00). (optional) 
            var endDate = "25 March 2024 00:00:00";  // string | Acts as a filter for the retrieval process. Filters the schedule definitions based on their last updated date, the input date must be of the date format (d MMMMM yyyy 00:00:00). (optional) 
            var sort = new List<string>(); // List<string> | The column to sort on. Can add '-' to the start of the parameter value to sort in descending order. (optional) 
            var paginationLimit = 25;  // int? | Non-negative maximum number of entries to return (optional)  (default to 25)
            var paginationOffset = 0;  // int? | Non-negative number of entries to skip (optional)  (default to 0)

            try
            {
                // Retrieves a list of all schedule definitions
                ScheduleDefinitionsList result = apiInstance.GetScheduleDefinitions(tenant, scheduleType, reportDate, lastUpdatedBy, startDate, endDate, sort, paginationLimit, paginationOffset);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling WorkflowApi.GetScheduleDefinitions: " + e.Message );
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
 **scheduleType** | **string**| Acts as a filter for the retrieval process. Filters the schedule definitions that match the given schedule type. Accepts multiple values separated by a comma, e.g. ?scheduleType&#x3D;REPEATING,MANUAL | [optional] 
 **reportDate** | **string**| Acts as a filter for the retrieval process. Filters the schedule definitions that match the given schedule report date.  Accepts multiple values separated by a comma, e.g. ?reportDate&#x3D;LAST_DAY_OF_PREV_MONTH,CREATION_DATE | [optional] 
 **lastUpdatedBy** | **string**| Acts as a filter for the retrieval process. Filters the schedule definitions where the provided parameter value matches or is a substring of the last updated by value of the schedule definitions | [optional] 
 **startDate** | **string**| Acts as a filter for the retrieval process. Filters the schedule definitions based on their last updated date, the input date must be of the date format (d MMMMM yyyy 00:00:00). | [optional] 
 **endDate** | **string**| Acts as a filter for the retrieval process. Filters the schedule definitions based on their last updated date, the input date must be of the date format (d MMMMM yyyy 00:00:00). | [optional] 
 **sort** | [**List&lt;string&gt;**](string.md)| The column to sort on. Can add &#39;-&#39; to the start of the parameter value to sort in descending order. | [optional] 
 **paginationLimit** | **int?**| Non-negative maximum number of entries to return | [optional] [default to 25]
 **paginationOffset** | **int?**| Non-negative number of entries to skip | [optional] [default to 0]

### Return type
[**ScheduleDefinitionsList**](ScheduleDefinitionsList.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **400** | Bad Request. Required values not provided in request parameter or invalid values given (e.g. tenant, scheduleType) |  -  |
| **401** | Unauthorised |  -  |
| **403** | Forbidden. No permissions to view schedule definitions in VRS |  -  |
| **406** | Unsupported Accept header. Header needs to be set to application/json. |  -  |
| **500** | The server have encountered an unhandled error due to which request was not fulfilled. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getschedulegenerationlogs"></a>
# **GetScheduleGenerationLogs**
> ScheduleGenerationLogList GetScheduleGenerationLogs (string tenant, string scheduleId, string type = null, string message = null, string logSet = null, string startDate = null, string endDate = null, List<string> sort = null, int? paginationLimit = null, int? paginationOffset = null)

Gets the generation logs for a specific schedule

Gets the generation logs for a specific schedule based on the Schedule ID. Allows the user to sort and filter logs.

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
    public class GetScheduleGenerationLogsExample
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

            var apiInstance = new WorkflowApi(config);

            var tenant = "TENANT";  // string | The code of the tenancy
            var scheduleId = "123456";  // string | The scheduleId for which the logs are requested
            var type = "INFO";  // string | Acts as a filter for the retrieval process. Filters the log instances that match the input type (optional) 
            var message = "package definition";  // string | Acts as a filter for the retrieval process. Filters the log instances that match the input message (optional) 
            var logSet = "1";  // string | Acts as a filter for the retrieval process. Filters the log instances that match the input logset (optional) 
            var startDate = "25 March 2024 00:00:00";  // string | Acts as a filter for the retrieval process. Filters the log instances based on their last updated date, the input date must be of the date format (d MMMMM yyyy 00:00:00). (optional) 
            var endDate = "25 March 2024 00:00:00";  // string | Acts as a filter for the retrieval process. Filters the log instances based on their last updated date, the input date must be of the date format (d MMMMM yyyy 00:00:00). (optional) 
            var sort = new List<string>(); // List<string> | The column to sort on. Can add - to sort (optional) 
            var paginationLimit = 25;  // int? | Non-negative maximum number of entries to return (optional)  (default to 25)
            var paginationOffset = 0;  // int? | Non-negative number of entries to skip (optional)  (default to 0)

            try
            {
                // Gets the generation logs for a specific schedule
                ScheduleGenerationLogList result = apiInstance.GetScheduleGenerationLogs(tenant, scheduleId, type, message, logSet, startDate, endDate, sort, paginationLimit, paginationOffset);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling WorkflowApi.GetScheduleGenerationLogs: " + e.Message );
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
 **scheduleId** | **string**| The scheduleId for which the logs are requested | 
 **type** | **string**| Acts as a filter for the retrieval process. Filters the log instances that match the input type | [optional] 
 **message** | **string**| Acts as a filter for the retrieval process. Filters the log instances that match the input message | [optional] 
 **logSet** | **string**| Acts as a filter for the retrieval process. Filters the log instances that match the input logset | [optional] 
 **startDate** | **string**| Acts as a filter for the retrieval process. Filters the log instances based on their last updated date, the input date must be of the date format (d MMMMM yyyy 00:00:00). | [optional] 
 **endDate** | **string**| Acts as a filter for the retrieval process. Filters the log instances based on their last updated date, the input date must be of the date format (d MMMMM yyyy 00:00:00). | [optional] 
 **sort** | [**List&lt;string&gt;**](string.md)| The column to sort on. Can add - to sort | [optional] 
 **paginationLimit** | **int?**| Non-negative maximum number of entries to return | [optional] [default to 25]
 **paginationOffset** | **int?**| Non-negative number of entries to skip | [optional] [default to 0]

### Return type
[**ScheduleGenerationLogList**](ScheduleGenerationLogList.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **400** | Bad Request. Required values not provided in request parameter or invalid values given (e.g. tenant, type) |  -  |
| **401** | Unauthorised |  -  |
| **403** | No permissions to view schedule logs in VRS |  -  |
| **406** | Unsupported Accept header. Header needs to be set to application/json. |  -  |
| **500** | The server have encountered an unhandled error due to which request was not fulfilled. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getschedules"></a>
# **GetSchedules**
> SchedulesList GetSchedules (string tenant, string status = null, string startDate = null, string endDate = null, List<string> sort = null, int? paginationLimit = null, int? paginationOffset = null)

Retrieves a list of all schedules

Retrieves all schedules the user has permissions for. User has sort and filter parameters available to use.

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
    public class GetSchedulesExample
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

            var apiInstance = new WorkflowApi(config);

            var tenant = "TENANT";  // string | The code of the tenancy
            var status = "INITIALISED";  // string | Acts as a filter for the retrieval process. Filters the schedules that match the given status. Accepts multiple values separated by a comma, e.g. ?status=INITIALISED,RUNNING (optional) 
            var startDate = "14 June 2024 00:00:00";  // string | Acts as a filter for the retrieval process. Filters the schedules based on their last updated date, the input date must be of the date format (d MMMMM yyyy 00:00:00). (optional) 
            var endDate = "14 June 2024 00:00:00";  // string | Acts as a filter for the retrieval process. Filters the schedules based on their last updated date, the input date must be of the date format (d MMMMM yyyy 00:00:00). (optional) 
            var sort = new List<string>(); // List<string> | The column to sort on. Can add '-' to the start of the parameter value to sort in descending order. (optional) 
            var paginationLimit = 25;  // int? | Non-negative maximum number of entries to return (optional)  (default to 25)
            var paginationOffset = 0;  // int? | Non-negative number of entries to skip (optional)  (default to 0)

            try
            {
                // Retrieves a list of all schedules
                SchedulesList result = apiInstance.GetSchedules(tenant, status, startDate, endDate, sort, paginationLimit, paginationOffset);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling WorkflowApi.GetSchedules: " + e.Message );
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
 **status** | **string**| Acts as a filter for the retrieval process. Filters the schedules that match the given status. Accepts multiple values separated by a comma, e.g. ?status&#x3D;INITIALISED,RUNNING | [optional] 
 **startDate** | **string**| Acts as a filter for the retrieval process. Filters the schedules based on their last updated date, the input date must be of the date format (d MMMMM yyyy 00:00:00). | [optional] 
 **endDate** | **string**| Acts as a filter for the retrieval process. Filters the schedules based on their last updated date, the input date must be of the date format (d MMMMM yyyy 00:00:00). | [optional] 
 **sort** | [**List&lt;string&gt;**](string.md)| The column to sort on. Can add &#39;-&#39; to the start of the parameter value to sort in descending order. | [optional] 
 **paginationLimit** | **int?**| Non-negative maximum number of entries to return | [optional] [default to 25]
 **paginationOffset** | **int?**| Non-negative number of entries to skip | [optional] [default to 0]

### Return type
[**SchedulesList**](SchedulesList.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **400** | Bad Request. Required values not provided in request parameter or invalid values given (e.g. tenant, status) |  -  |
| **401** | Unauthorised |  -  |
| **403** | Forbidden. No permissions to view schedule definitions in VRS |  -  |
| **406** | Unsupported Accept header. Header needs to be set to application/json. |  -  |
| **500** | The server have encountered an unhandled error due to which request was not fulfilled. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="gettask"></a>
# **GetTask**
> TaskDetailsObject GetTask (string tenant, string taskId)

Gets a task based on the task ID

Gets a task Object based on the task ID passed.

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
    public class GetTaskExample
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

            var apiInstance = new WorkflowApi(config);

            var tenant = "TENANT";  // string | The code of the tenancy
            var taskId = "135709";  // string | The Id of the task

            try
            {
                // Gets a task based on the task ID
                TaskDetailsObject result = apiInstance.GetTask(tenant, taskId);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling WorkflowApi.GetTask: " + e.Message );
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
 **taskId** | **string**| The Id of the task | 

### Return type
[**TaskDetailsObject**](TaskDetailsObject.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **400** | Bad Request. Required values not provided in request parameter or invalid values given (e.g. tenant) |  -  |
| **401** | Unauthorised |  -  |
| **403** | Forbidden. No permissions to view tasks in VRS |  -  |
| **406** | Unsupported Accept header. Header needs to be set to application/json. |  -  |
| **500** | The server have encountered an unhandled error due to which request was not fulfilled. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="gettaskhistory"></a>
# **GetTaskHistory**
> TaskHistoryList GetTaskHistory (string tenant, string taskId, string actionType = null, string reasonCode = null, string startDate = null, string endDate = null, List<string> sort = null, int? paginationLimit = null, int? paginationOffset = null)

Gets the task history for a specific task

Gets the task history for a specific task based on the Task ID. Allows the user to sort and filter the task history entries.

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
    public class GetTaskHistoryExample
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

            var apiInstance = new WorkflowApi(config);

            var tenant = "TENANT";  // string | The code of the tenancy
            var taskId = "123456";  // string | The taskId for which the history of the specific task is requested
            var actionType = "Status Changed";  // string | Acts as a filter for the retrieval process. Filters the task history entries that match the given action type (optional) 
            var reasonCode = "Missing Data";  // string | Acts as a filter for the retrieval process. Filters the task history entries that match the given reason code (optional) 
            var startDate = "25 March 2024 00:00:00";  // string | Acts as a filter for the retrieval process. Filters the task history events based on their last updated date, the input date must be of the date format (d MMMMM yyyy 00:00:00). (optional) 
            var endDate = "25 March 2024 00:00:00";  // string | Acts as a filter for the retrieval process. Filters the task history events based on their last updated date, the input date must be of the date format (d MMMMM yyyy 00:00:00). (optional) 
            var sort = new List<string>(); // List<string> | The column to sort on. Can add - to sort for descending order (optional) 
            var paginationLimit = 25;  // int? | Non-negative maximum number of entries to return (optional)  (default to 25)
            var paginationOffset = 0;  // int? | Non-negative number of entries to skip (optional)  (default to 0)

            try
            {
                // Gets the task history for a specific task
                TaskHistoryList result = apiInstance.GetTaskHistory(tenant, taskId, actionType, reasonCode, startDate, endDate, sort, paginationLimit, paginationOffset);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling WorkflowApi.GetTaskHistory: " + e.Message );
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
 **taskId** | **string**| The taskId for which the history of the specific task is requested | 
 **actionType** | **string**| Acts as a filter for the retrieval process. Filters the task history entries that match the given action type | [optional] 
 **reasonCode** | **string**| Acts as a filter for the retrieval process. Filters the task history entries that match the given reason code | [optional] 
 **startDate** | **string**| Acts as a filter for the retrieval process. Filters the task history events based on their last updated date, the input date must be of the date format (d MMMMM yyyy 00:00:00). | [optional] 
 **endDate** | **string**| Acts as a filter for the retrieval process. Filters the task history events based on their last updated date, the input date must be of the date format (d MMMMM yyyy 00:00:00). | [optional] 
 **sort** | [**List&lt;string&gt;**](string.md)| The column to sort on. Can add - to sort for descending order | [optional] 
 **paginationLimit** | **int?**| Non-negative maximum number of entries to return | [optional] [default to 25]
 **paginationOffset** | **int?**| Non-negative number of entries to skip | [optional] [default to 0]

### Return type
[**TaskHistoryList**](TaskHistoryList.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **400** | Bad Request. Required values not provided in request parameter or invalid values given (e.g. tenant, taskId) |  -  |
| **401** | Unauthorised |  -  |
| **403** | No permissions to view task in VRS |  -  |
| **406** | Unsupported Accept header. Header needs to be set to application/json. |  -  |
| **500** | The server have encountered an unhandled error due to which request was not fulfilled. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="gettasks"></a>
# **GetTasks**
> TaskList GetTasks (string tenant, string taskType = null, string status = null, string role = null, string user = null, bool? immediateTasksOnly = null, int? scheduleId = null, List<string> sort = null, int? paginationLimit = null, int? paginationOffset = null)

Retrieves a list of all tasks

Retrieves all tasks the user has permissions for. User has sort and filter parameters available to use.

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
    public class GetTasksExample
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

            var apiInstance = new WorkflowApi(config);

            var tenant = "TENANT";  // string | The code of the tenancy
            var taskType = "WAIT_FOR_DATA";  // string | Acts as a filter for the retrieval process. Filters the tasks that match the given task type. Accepts multiple values separated by a comma, e.g. ?taskType=SIGNOFF_DATA,PACKAGE_REPORTS (optional) 
            var status = "COMPLETED";  // string | Acts as a filter for the retrieval process. Filters the tasks that match the given status. Accepts multiple values separated by a comma, e.g. ?status=PENDING,AWAITING_CORRECTION (optional) 
            var role = "Client Reporting Manager";  // string | Acts as a filter for the retrieval process. Filters the tasks that match the input role assigned to the task (optional) 
            var user = "John";  // string | Acts as a filter for the retrieval process. Filters the tasks that match the input user name assigned to the task (optional) 
            var immediateTasksOnly = true;  // bool? | Acts as a filter for the retrieval process. Filters the immediate tasks if the parameter value is set to true (optional) 
            var scheduleId = 37325;  // int? | Acts as a filter for the retrieval process. Filters the schedule tasks for the Schedule Id passed in the parameter value (optional) 
            var sort = new List<string>(); // List<string> | The column to sort on. Can add '-' to the start of the parameter value to sort in descending order. (optional) 
            var paginationLimit = 25;  // int? | Non-negative maximum number of entries to return (optional)  (default to 25)
            var paginationOffset = 0;  // int? | Non-negative number of entries to skip (optional)  (default to 0)

            try
            {
                // Retrieves a list of all tasks
                TaskList result = apiInstance.GetTasks(tenant, taskType, status, role, user, immediateTasksOnly, scheduleId, sort, paginationLimit, paginationOffset);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling WorkflowApi.GetTasks: " + e.Message );
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
 **taskType** | **string**| Acts as a filter for the retrieval process. Filters the tasks that match the given task type. Accepts multiple values separated by a comma, e.g. ?taskType&#x3D;SIGNOFF_DATA,PACKAGE_REPORTS | [optional] 
 **status** | **string**| Acts as a filter for the retrieval process. Filters the tasks that match the given status. Accepts multiple values separated by a comma, e.g. ?status&#x3D;PENDING,AWAITING_CORRECTION | [optional] 
 **role** | **string**| Acts as a filter for the retrieval process. Filters the tasks that match the input role assigned to the task | [optional] 
 **user** | **string**| Acts as a filter for the retrieval process. Filters the tasks that match the input user name assigned to the task | [optional] 
 **immediateTasksOnly** | **bool?**| Acts as a filter for the retrieval process. Filters the immediate tasks if the parameter value is set to true | [optional] 
 **scheduleId** | **int?**| Acts as a filter for the retrieval process. Filters the schedule tasks for the Schedule Id passed in the parameter value | [optional] 
 **sort** | [**List&lt;string&gt;**](string.md)| The column to sort on. Can add &#39;-&#39; to the start of the parameter value to sort in descending order. | [optional] 
 **paginationLimit** | **int?**| Non-negative maximum number of entries to return | [optional] [default to 25]
 **paginationOffset** | **int?**| Non-negative number of entries to skip | [optional] [default to 0]

### Return type
[**TaskList**](TaskList.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **400** | Bad Request. Required values not provided in request parameter or invalid values given (e.g. tenant, status) |  -  |
| **401** | Unauthorised |  -  |
| **403** | Forbidden. No permissions to view tasks in VRS |  -  |
| **404** | The supplied schedule Id was not found |  -  |
| **406** | Unsupported Accept header. Header needs to be set to application/json. |  -  |
| **500** | The server have encountered an unhandled error due to which request was not fulfilled. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="updateschedulestatus"></a>
# **UpdateScheduleStatus**
> ScheduleStatusUpdateResponse UpdateScheduleStatus (string tenant, string scheduleId, string status)

Update schedule status for specified schedule

Updated the schedule status for the specified schedule id based on the given status

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
    public class UpdateScheduleStatusExample
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

            var apiInstance = new WorkflowApi(config);

            var tenant = "TENANT";  // string | The code of the tenancy
            var scheduleId = "123456";  // string | The schedule id for which to update the status
            var status = "INITIALISED";  // string | The schedule status that needs to be updated only if the transition is valid

            try
            {
                // Update schedule status for specified schedule
                ScheduleStatusUpdateResponse result = apiInstance.UpdateScheduleStatus(tenant, scheduleId, status);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling WorkflowApi.UpdateScheduleStatus: " + e.Message );
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
 **scheduleId** | **string**| The schedule id for which to update the status | 
 **status** | **string**| The schedule status that needs to be updated only if the transition is valid | 

### Return type
[**ScheduleStatusUpdateResponse**](ScheduleStatusUpdateResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update schedule request succeeded and status has been changed |  -  |
| **400** | Schedule status in the request is missing or invalid |  -  |
| **401** | Unauthorised |  -  |
| **403** | No permissions to update schedule in VRS |  -  |
| **404** | The schedule id could not be found |  -  |
| **406** | Unsupported Accept header. Header needs to be set to application/json. |  -  |
| **500** | The server have encountered an unhandled error due to which request was not fulfilled. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="updatetaskdetails"></a>
# **UpdateTaskDetails**
> TaskPatchResponseObject UpdateTaskDetails (string tenant, string taskId, TaskPatchRequestBody taskPatchRequestBody)

Updates the task details for the specified task.

Updates the task details for the specified task.

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
    public class UpdateTaskDetailsExample
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

            var apiInstance = new WorkflowApi(config);

            var tenant = "TENANT";  // string | The code of the tenancy
            var taskId = "123456";  // string | The unique identifier for task
            var taskPatchRequestBody = new TaskPatchRequestBody(); // TaskPatchRequestBody | 

            try
            {
                // Updates the task details for the specified task.
                TaskPatchResponseObject result = apiInstance.UpdateTaskDetails(tenant, taskId, taskPatchRequestBody);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling WorkflowApi.UpdateTaskDetails: " + e.Message );
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
 **taskId** | **string**| The unique identifier for task | 
 **taskPatchRequestBody** | [**TaskPatchRequestBody**](TaskPatchRequestBody.md)|  | 

### Return type
[**TaskPatchResponseObject**](TaskPatchResponseObject.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **206** | Request was partially successful |  -  |
| **400** | Bad Request. Required values not provided in request parameter or invalid values given (e.g. tenant) |  -  |
| **401** | Unauthorised |  -  |
| **403** | Forbidden. No permissions to view the task. |  -  |
| **406** | Unsupported Accept header. Header needs to be set to application/json. |  -  |
| **500** | The server have encountered an unhandled error due to which request was not fulfilled. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


