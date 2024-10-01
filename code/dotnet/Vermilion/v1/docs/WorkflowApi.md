# FactSet.SDK.Vermilion.Api.WorkflowApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GenerateSchedule**](WorkflowApi.md#generateschedule) | **POST** /v1/{tenant}/schedules/{scheduleDefinitionCode} | Creates schedule for the specified schedule definition
[**GetScheduleDefinitions**](WorkflowApi.md#getscheduledefinitions) | **GET** /v1/{tenant}/schedule-definitions | Retrieves a list of all schedule definitions
[**GetScheduleGenerationLogs**](WorkflowApi.md#getschedulegenerationlogs) | **GET** /v1/{tenant}/schedules/{scheduleId}/logs | Gets the generation logs for a specific schedule
[**GetSchedules**](WorkflowApi.md#getschedules) | **GET** /v1/{tenant}/schedules | Retrieves a list of all schedules
[**UpdateScheduleStatus**](WorkflowApi.md#updateschedulestatus) | **PATCH** /v1/{tenant}/schedules/{scheduleId}/{status} | Update schedule status for specified schedule



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
            var scheduleType = "MANUAL";  // string | Acts as a filter for the retrieval process. Filters the schedule definitions that match the given schedule type. Accepts multiple values separated by a comma, e.g. ?scheduleType=REPEATING,TEMPLATE (optional) 
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
 **scheduleType** | **string**| Acts as a filter for the retrieval process. Filters the schedule definitions that match the given schedule type. Accepts multiple values separated by a comma, e.g. ?scheduleType&#x3D;REPEATING,TEMPLATE | [optional] 
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


