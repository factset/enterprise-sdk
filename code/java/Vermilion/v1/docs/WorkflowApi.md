# WorkflowApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**generateSchedule**](WorkflowApi.md#generateSchedule) | **POST** /v1/{tenant}/schedules/{scheduleDefinitionCode} | Creates schedule for the specified schedule definition
[**generateScheduleTasks**](WorkflowApi.md#generateScheduleTasks) | **POST** /v1/{tenant}/schedules/{scheduleId}/generate-tasks | Generates the tasks for the initialised schedule
[**getScheduleById**](WorkflowApi.md#getScheduleById) | **GET** /v1/{tenant}/schedules/{scheduleId} | Gets a schedule based on the schedule ID
[**getScheduleDefinitions**](WorkflowApi.md#getScheduleDefinitions) | **GET** /v1/{tenant}/schedule-definitions | Retrieves a list of all schedule definitions
[**getScheduleGenerationLogs**](WorkflowApi.md#getScheduleGenerationLogs) | **GET** /v1/{tenant}/schedules/{scheduleId}/logs | Gets the generation logs for a specific schedule
[**getSchedules**](WorkflowApi.md#getSchedules) | **GET** /v1/{tenant}/schedules | Retrieves a list of all schedules
[**getTask**](WorkflowApi.md#getTask) | **GET** /v1/{tenant}/tasks/{taskId} | Gets a task based on the task ID
[**getTaskHistory**](WorkflowApi.md#getTaskHistory) | **GET** /v1/{tenant}/tasks/{taskId}/history | Gets the task history for a specific task
[**getTasks**](WorkflowApi.md#getTasks) | **GET** /v1/{tenant}/tasks | Retrieves a list of all tasks
[**updateScheduleStatus**](WorkflowApi.md#updateScheduleStatus) | **PATCH** /v1/{tenant}/schedules/{scheduleId}/{status} | Update schedule status for specified schedule
[**updateTaskDetails**](WorkflowApi.md#updateTaskDetails) | **PATCH** /v1/{tenant}/tasks/{taskId} | Updates the task details for the specified task.



## generateSchedule

> GenerateScheduleResponse generateSchedule(tenant, scheduleDefinitionCode, setToRunning)

Creates schedule for the specified schedule definition

Creates schedule for the specified Schedule Definition code and sets to running based on the param in the JSON in the request body

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.Vermilion.ApiClient;
import com.factset.sdk.Vermilion.ApiException;
import com.factset.sdk.Vermilion.Configuration;
import com.factset.sdk.Vermilion.auth.*;
import com.factset.sdk.Vermilion.models.*;
import com.factset.sdk.Vermilion.api.WorkflowApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;

public class Example {
    public static void main(String[] args) throws Exception {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
        //
        // The confidential client instance should be reused in production environments.
        // See https://github.com/FactSet/enterprise-sdk-utils-java#authentication
        // for more information on using the ConfidentialClient class
        ConfidentialClient confidentialClient = new ConfidentialClient("./path/to/config.json");
        ApiClient defaultClient = new ApiClient()
          .setFactSetOAuth2Client(confidentialClient);

        /* Basic authentication: FactSetApiKey */
        // See https://github.com/FactSet/enterprise-sdk#api-key
        // ApiClient defaultClient = new ApiClient()
        //   .setUsername("YOUR USERNAME")
        //   .setPassword("YOUR PASSWORD");

        WorkflowApi apiInstance = new WorkflowApi(defaultClient);
        String tenant = "TENANT"; // String | The code of the tenancy
        String scheduleDefinitionCode = "TEST_SCHEDULE_DEF"; // String | The schedule definition code for which to generate the schedule
        Boolean setToRunning = true; // Boolean | This parameter is used to set the generated schedule's status to Running.If parameter is set to true, the generated schedule will be set to Running. If no value is provided, the schedule will remain in Initialised status.
        try {
            GenerateScheduleResponse result = apiInstance.generateSchedule(tenant, scheduleDefinitionCode, setToRunning);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling WorkflowApi#generateSchedule");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenant** | **String**| The code of the tenancy |
 **scheduleDefinitionCode** | **String**| The schedule definition code for which to generate the schedule |
 **setToRunning** | **Boolean**| This parameter is used to set the generated schedule&#39;s status to Running.If parameter is set to true, the generated schedule will be set to Running. If no value is provided, the schedule will remain in Initialised status. | [optional]

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


## generateScheduleTasks

> ScheduleStatusUpdateResponse generateScheduleTasks(tenant, scheduleId)

Generates the tasks for the initialised schedule

Generates the schedule tasks for the specified schedule id

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.Vermilion.ApiClient;
import com.factset.sdk.Vermilion.ApiException;
import com.factset.sdk.Vermilion.Configuration;
import com.factset.sdk.Vermilion.auth.*;
import com.factset.sdk.Vermilion.models.*;
import com.factset.sdk.Vermilion.api.WorkflowApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;

public class Example {
    public static void main(String[] args) throws Exception {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
        //
        // The confidential client instance should be reused in production environments.
        // See https://github.com/FactSet/enterprise-sdk-utils-java#authentication
        // for more information on using the ConfidentialClient class
        ConfidentialClient confidentialClient = new ConfidentialClient("./path/to/config.json");
        ApiClient defaultClient = new ApiClient()
          .setFactSetOAuth2Client(confidentialClient);

        /* Basic authentication: FactSetApiKey */
        // See https://github.com/FactSet/enterprise-sdk#api-key
        // ApiClient defaultClient = new ApiClient()
        //   .setUsername("YOUR USERNAME")
        //   .setPassword("YOUR PASSWORD");

        WorkflowApi apiInstance = new WorkflowApi(defaultClient);
        String tenant = "TENANT"; // String | The code of the tenancy
        String scheduleId = "123456"; // String | The schedule id for which to generate the tasks
        try {
            ScheduleStatusUpdateResponse result = apiInstance.generateScheduleTasks(tenant, scheduleId);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling WorkflowApi#generateScheduleTasks");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenant** | **String**| The code of the tenancy |
 **scheduleId** | **String**| The schedule id for which to generate the tasks |

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


## getScheduleById

> ScheduleResponseData getScheduleById(tenant, scheduleId)

Gets a schedule based on the schedule ID

Gets a schedule Object based on the schedule ID passed.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.Vermilion.ApiClient;
import com.factset.sdk.Vermilion.ApiException;
import com.factset.sdk.Vermilion.Configuration;
import com.factset.sdk.Vermilion.auth.*;
import com.factset.sdk.Vermilion.models.*;
import com.factset.sdk.Vermilion.api.WorkflowApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;

public class Example {
    public static void main(String[] args) throws Exception {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
        //
        // The confidential client instance should be reused in production environments.
        // See https://github.com/FactSet/enterprise-sdk-utils-java#authentication
        // for more information on using the ConfidentialClient class
        ConfidentialClient confidentialClient = new ConfidentialClient("./path/to/config.json");
        ApiClient defaultClient = new ApiClient()
          .setFactSetOAuth2Client(confidentialClient);

        /* Basic authentication: FactSetApiKey */
        // See https://github.com/FactSet/enterprise-sdk#api-key
        // ApiClient defaultClient = new ApiClient()
        //   .setUsername("YOUR USERNAME")
        //   .setPassword("YOUR PASSWORD");

        WorkflowApi apiInstance = new WorkflowApi(defaultClient);
        String tenant = "TENANT"; // String | The code of the tenancy
        String scheduleId = "16304"; // String | The Id of the schedule
        try {
            ScheduleResponseData result = apiInstance.getScheduleById(tenant, scheduleId);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling WorkflowApi#getScheduleById");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenant** | **String**| The code of the tenancy |
 **scheduleId** | **String**| The Id of the schedule |

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


## getScheduleDefinitions

> ScheduleDefinitionsList getScheduleDefinitions(tenant, scheduleType, reportDate, lastUpdatedBy, startDate, endDate, sort, paginationLimit, paginationOffset)

Retrieves a list of all schedule definitions

Retrieves all schedule definitions the user has permissions for. User has sort and filter parameters available to use.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.Vermilion.ApiClient;
import com.factset.sdk.Vermilion.ApiException;
import com.factset.sdk.Vermilion.Configuration;
import com.factset.sdk.Vermilion.auth.*;
import com.factset.sdk.Vermilion.models.*;
import com.factset.sdk.Vermilion.api.WorkflowApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;

public class Example {
    public static void main(String[] args) throws Exception {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
        //
        // The confidential client instance should be reused in production environments.
        // See https://github.com/FactSet/enterprise-sdk-utils-java#authentication
        // for more information on using the ConfidentialClient class
        ConfidentialClient confidentialClient = new ConfidentialClient("./path/to/config.json");
        ApiClient defaultClient = new ApiClient()
          .setFactSetOAuth2Client(confidentialClient);

        /* Basic authentication: FactSetApiKey */
        // See https://github.com/FactSet/enterprise-sdk#api-key
        // ApiClient defaultClient = new ApiClient()
        //   .setUsername("YOUR USERNAME")
        //   .setPassword("YOUR PASSWORD");

        WorkflowApi apiInstance = new WorkflowApi(defaultClient);
        String tenant = "TENANT"; // String | The code of the tenancy
        String scheduleType = "MANUAL"; // String | Acts as a filter for the retrieval process. Filters the schedule definitions that match the given schedule type. Accepts multiple values separated by a comma, e.g. ?scheduleType=REPEATING,MANUAL
        String reportDate = "LAST_DAY_OF_PREV_MONTH"; // String | Acts as a filter for the retrieval process. Filters the schedule definitions that match the given schedule report date.  Accepts multiple values separated by a comma, e.g. ?reportDate=LAST_DAY_OF_PREV_MONTH,CREATION_DATE
        String lastUpdatedBy = "John"; // String | Acts as a filter for the retrieval process. Filters the schedule definitions where the provided parameter value matches or is a substring of the last updated by value of the schedule definitions
        String startDate = "25 March 2024 00:00:00"; // String | Acts as a filter for the retrieval process. Filters the schedule definitions based on their last updated date, the input date must be of the date format (d MMMMM yyyy 00:00:00).
        String endDate = "25 March 2024 00:00:00"; // String | Acts as a filter for the retrieval process. Filters the schedule definitions based on their last updated date, the input date must be of the date format (d MMMMM yyyy 00:00:00).
        java.util.List<String> sort = Arrays.asList(); // java.util.List<String> | The column to sort on. Can add '-' to the start of the parameter value to sort in descending order.
        Integer paginationLimit = 25; // Integer | Non-negative maximum number of entries to return
        Integer paginationOffset = 0; // Integer | Non-negative number of entries to skip
        try {
            ScheduleDefinitionsList result = apiInstance.getScheduleDefinitions(tenant, scheduleType, reportDate, lastUpdatedBy, startDate, endDate, sort, paginationLimit, paginationOffset);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling WorkflowApi#getScheduleDefinitions");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenant** | **String**| The code of the tenancy |
 **scheduleType** | **String**| Acts as a filter for the retrieval process. Filters the schedule definitions that match the given schedule type. Accepts multiple values separated by a comma, e.g. ?scheduleType&#x3D;REPEATING,MANUAL | [optional] [enum: MANUAL, REPEATING]
 **reportDate** | **String**| Acts as a filter for the retrieval process. Filters the schedule definitions that match the given schedule report date.  Accepts multiple values separated by a comma, e.g. ?reportDate&#x3D;LAST_DAY_OF_PREV_MONTH,CREATION_DATE | [optional] [enum: LAST_DAY_OF_PREV_MONTH, LAST_BUSINESS_DAY_OF_PREV_MONTH, CREATION_DATE, DAY_BEFORE_CREATION_DATE, BUSINESS_DAY_BEFORE_CREATION_DATE, LAST_DAY_OF_MONTH_SCHEDULE_CREATED, LAST_BUSINESS_DAY_OF_MONTH_SCHEDULE_CREATED, LAST_BUSINESS_DAY_OF_PREVIOUS_WEEK_SCHEDULE_CREATED, LAST_BUSINESS_DAY_OF_WEEK_SCHEDULE_CREATED, TWO_BUSINESS_DAYS_BEFORE_SCHEDULE_CREATED]
 **lastUpdatedBy** | **String**| Acts as a filter for the retrieval process. Filters the schedule definitions where the provided parameter value matches or is a substring of the last updated by value of the schedule definitions | [optional]
 **startDate** | **String**| Acts as a filter for the retrieval process. Filters the schedule definitions based on their last updated date, the input date must be of the date format (d MMMMM yyyy 00:00:00). | [optional]
 **endDate** | **String**| Acts as a filter for the retrieval process. Filters the schedule definitions based on their last updated date, the input date must be of the date format (d MMMMM yyyy 00:00:00). | [optional]
 **sort** | **List&lt;String&gt;**| The column to sort on. Can add &#39;-&#39; to the start of the parameter value to sort in descending order. | [optional]
 **paginationLimit** | **Integer**| Non-negative maximum number of entries to return | [optional] [default to 25]
 **paginationOffset** | **Integer**| Non-negative number of entries to skip | [optional] [default to 0]

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


## getScheduleGenerationLogs

> ScheduleGenerationLogList getScheduleGenerationLogs(tenant, scheduleId, type, message, logSet, startDate, endDate, sort, paginationLimit, paginationOffset)

Gets the generation logs for a specific schedule

Gets the generation logs for a specific schedule based on the Schedule ID. Allows the user to sort and filter logs.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.Vermilion.ApiClient;
import com.factset.sdk.Vermilion.ApiException;
import com.factset.sdk.Vermilion.Configuration;
import com.factset.sdk.Vermilion.auth.*;
import com.factset.sdk.Vermilion.models.*;
import com.factset.sdk.Vermilion.api.WorkflowApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;

public class Example {
    public static void main(String[] args) throws Exception {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
        //
        // The confidential client instance should be reused in production environments.
        // See https://github.com/FactSet/enterprise-sdk-utils-java#authentication
        // for more information on using the ConfidentialClient class
        ConfidentialClient confidentialClient = new ConfidentialClient("./path/to/config.json");
        ApiClient defaultClient = new ApiClient()
          .setFactSetOAuth2Client(confidentialClient);

        /* Basic authentication: FactSetApiKey */
        // See https://github.com/FactSet/enterprise-sdk#api-key
        // ApiClient defaultClient = new ApiClient()
        //   .setUsername("YOUR USERNAME")
        //   .setPassword("YOUR PASSWORD");

        WorkflowApi apiInstance = new WorkflowApi(defaultClient);
        String tenant = "TENANT"; // String | The code of the tenancy
        String scheduleId = "123456"; // String | The scheduleId for which the logs are requested
        String type = "INFO"; // String | Acts as a filter for the retrieval process. Filters the log instances that match the input type
        String message = "package definition"; // String | Acts as a filter for the retrieval process. Filters the log instances that match the input message
        String logSet = "1"; // String | Acts as a filter for the retrieval process. Filters the log instances that match the input logset
        String startDate = "25 March 2024 00:00:00"; // String | Acts as a filter for the retrieval process. Filters the log instances based on their last updated date, the input date must be of the date format (d MMMMM yyyy 00:00:00).
        String endDate = "25 March 2024 00:00:00"; // String | Acts as a filter for the retrieval process. Filters the log instances based on their last updated date, the input date must be of the date format (d MMMMM yyyy 00:00:00).
        java.util.List<String> sort = Arrays.asList(); // java.util.List<String> | The column to sort on. Can add - to sort
        Integer paginationLimit = 25; // Integer | Non-negative maximum number of entries to return
        Integer paginationOffset = 0; // Integer | Non-negative number of entries to skip
        try {
            ScheduleGenerationLogList result = apiInstance.getScheduleGenerationLogs(tenant, scheduleId, type, message, logSet, startDate, endDate, sort, paginationLimit, paginationOffset);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling WorkflowApi#getScheduleGenerationLogs");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenant** | **String**| The code of the tenancy |
 **scheduleId** | **String**| The scheduleId for which the logs are requested |
 **type** | **String**| Acts as a filter for the retrieval process. Filters the log instances that match the input type | [optional] [enum: INFO, WARN, ERROR, DEBUG]
 **message** | **String**| Acts as a filter for the retrieval process. Filters the log instances that match the input message | [optional]
 **logSet** | **String**| Acts as a filter for the retrieval process. Filters the log instances that match the input logset | [optional]
 **startDate** | **String**| Acts as a filter for the retrieval process. Filters the log instances based on their last updated date, the input date must be of the date format (d MMMMM yyyy 00:00:00). | [optional]
 **endDate** | **String**| Acts as a filter for the retrieval process. Filters the log instances based on their last updated date, the input date must be of the date format (d MMMMM yyyy 00:00:00). | [optional]
 **sort** | **List&lt;String&gt;**| The column to sort on. Can add - to sort | [optional]
 **paginationLimit** | **Integer**| Non-negative maximum number of entries to return | [optional] [default to 25]
 **paginationOffset** | **Integer**| Non-negative number of entries to skip | [optional] [default to 0]

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


## getSchedules

> SchedulesList getSchedules(tenant, status, startDate, endDate, sort, paginationLimit, paginationOffset)

Retrieves a list of all schedules

Retrieves all schedules the user has permissions for. User has sort and filter parameters available to use.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.Vermilion.ApiClient;
import com.factset.sdk.Vermilion.ApiException;
import com.factset.sdk.Vermilion.Configuration;
import com.factset.sdk.Vermilion.auth.*;
import com.factset.sdk.Vermilion.models.*;
import com.factset.sdk.Vermilion.api.WorkflowApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;

public class Example {
    public static void main(String[] args) throws Exception {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
        //
        // The confidential client instance should be reused in production environments.
        // See https://github.com/FactSet/enterprise-sdk-utils-java#authentication
        // for more information on using the ConfidentialClient class
        ConfidentialClient confidentialClient = new ConfidentialClient("./path/to/config.json");
        ApiClient defaultClient = new ApiClient()
          .setFactSetOAuth2Client(confidentialClient);

        /* Basic authentication: FactSetApiKey */
        // See https://github.com/FactSet/enterprise-sdk#api-key
        // ApiClient defaultClient = new ApiClient()
        //   .setUsername("YOUR USERNAME")
        //   .setPassword("YOUR PASSWORD");

        WorkflowApi apiInstance = new WorkflowApi(defaultClient);
        String tenant = "TENANT"; // String | The code of the tenancy
        String status = "INITIALISED"; // String | Acts as a filter for the retrieval process. Filters the schedules that match the given status. Accepts multiple values separated by a comma, e.g. ?status=INITIALISED,RUNNING
        String startDate = "14 June 2024 00:00:00"; // String | Acts as a filter for the retrieval process. Filters the schedules based on their last updated date, the input date must be of the date format (d MMMMM yyyy 00:00:00).
        String endDate = "14 June 2024 00:00:00"; // String | Acts as a filter for the retrieval process. Filters the schedules based on their last updated date, the input date must be of the date format (d MMMMM yyyy 00:00:00).
        java.util.List<String> sort = Arrays.asList(); // java.util.List<String> | The column to sort on. Can add '-' to the start of the parameter value to sort in descending order.
        Integer paginationLimit = 25; // Integer | Non-negative maximum number of entries to return
        Integer paginationOffset = 0; // Integer | Non-negative number of entries to skip
        try {
            SchedulesList result = apiInstance.getSchedules(tenant, status, startDate, endDate, sort, paginationLimit, paginationOffset);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling WorkflowApi#getSchedules");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenant** | **String**| The code of the tenancy |
 **status** | **String**| Acts as a filter for the retrieval process. Filters the schedules that match the given status. Accepts multiple values separated by a comma, e.g. ?status&#x3D;INITIALISED,RUNNING | [optional] [enum: INITIALISED, RUNNING, CANCELLED, SUSPENDED, FINISHED, CLOSED, GENERATING_TASKS]
 **startDate** | **String**| Acts as a filter for the retrieval process. Filters the schedules based on their last updated date, the input date must be of the date format (d MMMMM yyyy 00:00:00). | [optional]
 **endDate** | **String**| Acts as a filter for the retrieval process. Filters the schedules based on their last updated date, the input date must be of the date format (d MMMMM yyyy 00:00:00). | [optional]
 **sort** | **List&lt;String&gt;**| The column to sort on. Can add &#39;-&#39; to the start of the parameter value to sort in descending order. | [optional]
 **paginationLimit** | **Integer**| Non-negative maximum number of entries to return | [optional] [default to 25]
 **paginationOffset** | **Integer**| Non-negative number of entries to skip | [optional] [default to 0]

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


## getTask

> TaskDetailsObject getTask(tenant, taskId)

Gets a task based on the task ID

Gets a task Object based on the task ID passed.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.Vermilion.ApiClient;
import com.factset.sdk.Vermilion.ApiException;
import com.factset.sdk.Vermilion.Configuration;
import com.factset.sdk.Vermilion.auth.*;
import com.factset.sdk.Vermilion.models.*;
import com.factset.sdk.Vermilion.api.WorkflowApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;

public class Example {
    public static void main(String[] args) throws Exception {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
        //
        // The confidential client instance should be reused in production environments.
        // See https://github.com/FactSet/enterprise-sdk-utils-java#authentication
        // for more information on using the ConfidentialClient class
        ConfidentialClient confidentialClient = new ConfidentialClient("./path/to/config.json");
        ApiClient defaultClient = new ApiClient()
          .setFactSetOAuth2Client(confidentialClient);

        /* Basic authentication: FactSetApiKey */
        // See https://github.com/FactSet/enterprise-sdk#api-key
        // ApiClient defaultClient = new ApiClient()
        //   .setUsername("YOUR USERNAME")
        //   .setPassword("YOUR PASSWORD");

        WorkflowApi apiInstance = new WorkflowApi(defaultClient);
        String tenant = "TENANT"; // String | The code of the tenancy
        String taskId = "135709"; // String | The Id of the task
        try {
            TaskDetailsObject result = apiInstance.getTask(tenant, taskId);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling WorkflowApi#getTask");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenant** | **String**| The code of the tenancy |
 **taskId** | **String**| The Id of the task |

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


## getTaskHistory

> TaskHistoryList getTaskHistory(tenant, taskId, actionType, reasonCode, startDate, endDate, sort, paginationLimit, paginationOffset)

Gets the task history for a specific task

Gets the task history for a specific task based on the Task ID. Allows the user to sort and filter the task history entries.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.Vermilion.ApiClient;
import com.factset.sdk.Vermilion.ApiException;
import com.factset.sdk.Vermilion.Configuration;
import com.factset.sdk.Vermilion.auth.*;
import com.factset.sdk.Vermilion.models.*;
import com.factset.sdk.Vermilion.api.WorkflowApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;

public class Example {
    public static void main(String[] args) throws Exception {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
        //
        // The confidential client instance should be reused in production environments.
        // See https://github.com/FactSet/enterprise-sdk-utils-java#authentication
        // for more information on using the ConfidentialClient class
        ConfidentialClient confidentialClient = new ConfidentialClient("./path/to/config.json");
        ApiClient defaultClient = new ApiClient()
          .setFactSetOAuth2Client(confidentialClient);

        /* Basic authentication: FactSetApiKey */
        // See https://github.com/FactSet/enterprise-sdk#api-key
        // ApiClient defaultClient = new ApiClient()
        //   .setUsername("YOUR USERNAME")
        //   .setPassword("YOUR PASSWORD");

        WorkflowApi apiInstance = new WorkflowApi(defaultClient);
        String tenant = "TENANT"; // String | The code of the tenancy
        String taskId = "123456"; // String | The taskId for which the history of the specific task is requested
        String actionType = "Status Changed"; // String | Acts as a filter for the retrieval process. Filters the task history entries that match the given action type
        String reasonCode = "Missing Data"; // String | Acts as a filter for the retrieval process. Filters the task history entries that match the given reason code
        String startDate = "25 March 2024 00:00:00"; // String | Acts as a filter for the retrieval process. Filters the task history events based on their last updated date, the input date must be of the date format (d MMMMM yyyy 00:00:00).
        String endDate = "25 March 2024 00:00:00"; // String | Acts as a filter for the retrieval process. Filters the task history events based on their last updated date, the input date must be of the date format (d MMMMM yyyy 00:00:00).
        java.util.List<String> sort = Arrays.asList(); // java.util.List<String> | The column to sort on. Can add - to sort for descending order
        Integer paginationLimit = 25; // Integer | Non-negative maximum number of entries to return
        Integer paginationOffset = 0; // Integer | Non-negative number of entries to skip
        try {
            TaskHistoryList result = apiInstance.getTaskHistory(tenant, taskId, actionType, reasonCode, startDate, endDate, sort, paginationLimit, paginationOffset);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling WorkflowApi#getTaskHistory");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenant** | **String**| The code of the tenancy |
 **taskId** | **String**| The taskId for which the history of the specific task is requested |
 **actionType** | **String**| Acts as a filter for the retrieval process. Filters the task history entries that match the given action type | [optional] [enum: Status Changed, Notes Changed, Reason code Changed, Current Role Changed, Current User Changed, Expected Start Changed, Expected End Changed, Actual Start Changed, Task Dependency Added, Task Dependency Removed]
 **reasonCode** | **String**| Acts as a filter for the retrieval process. Filters the task history entries that match the given reason code | [optional]
 **startDate** | **String**| Acts as a filter for the retrieval process. Filters the task history events based on their last updated date, the input date must be of the date format (d MMMMM yyyy 00:00:00). | [optional]
 **endDate** | **String**| Acts as a filter for the retrieval process. Filters the task history events based on their last updated date, the input date must be of the date format (d MMMMM yyyy 00:00:00). | [optional]
 **sort** | **List&lt;String&gt;**| The column to sort on. Can add - to sort for descending order | [optional]
 **paginationLimit** | **Integer**| Non-negative maximum number of entries to return | [optional] [default to 25]
 **paginationOffset** | **Integer**| Non-negative number of entries to skip | [optional] [default to 0]

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


## getTasks

> TaskList getTasks(tenant, taskType, status, role, user, immediateTasksOnly, scheduleId, sort, paginationLimit, paginationOffset)

Retrieves a list of all tasks

Retrieves all tasks the user has permissions for. User has sort and filter parameters available to use.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.Vermilion.ApiClient;
import com.factset.sdk.Vermilion.ApiException;
import com.factset.sdk.Vermilion.Configuration;
import com.factset.sdk.Vermilion.auth.*;
import com.factset.sdk.Vermilion.models.*;
import com.factset.sdk.Vermilion.api.WorkflowApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;

public class Example {
    public static void main(String[] args) throws Exception {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
        //
        // The confidential client instance should be reused in production environments.
        // See https://github.com/FactSet/enterprise-sdk-utils-java#authentication
        // for more information on using the ConfidentialClient class
        ConfidentialClient confidentialClient = new ConfidentialClient("./path/to/config.json");
        ApiClient defaultClient = new ApiClient()
          .setFactSetOAuth2Client(confidentialClient);

        /* Basic authentication: FactSetApiKey */
        // See https://github.com/FactSet/enterprise-sdk#api-key
        // ApiClient defaultClient = new ApiClient()
        //   .setUsername("YOUR USERNAME")
        //   .setPassword("YOUR PASSWORD");

        WorkflowApi apiInstance = new WorkflowApi(defaultClient);
        String tenant = "TENANT"; // String | The code of the tenancy
        String taskType = "WAIT_FOR_DATA"; // String | Acts as a filter for the retrieval process. Filters the tasks that match the given task type. Accepts multiple values separated by a comma, e.g. ?taskType=SIGNOFF_DATA,PACKAGE_REPORTS
        String status = "COMPLETED"; // String | Acts as a filter for the retrieval process. Filters the tasks that match the given status. Accepts multiple values separated by a comma, e.g. ?status=PENDING,AWAITING_CORRECTION
        String role = "Client Reporting Manager"; // String | Acts as a filter for the retrieval process. Filters the tasks that match the input role assigned to the task
        String user = "John"; // String | Acts as a filter for the retrieval process. Filters the tasks that match the input user name assigned to the task
        Boolean immediateTasksOnly = true; // Boolean | Acts as a filter for the retrieval process. Filters the immediate tasks if the parameter value is set to true
        Integer scheduleId = 37325; // Integer | Acts as a filter for the retrieval process. Filters the schedule tasks for the Schedule Id passed in the parameter value
        java.util.List<String> sort = Arrays.asList(); // java.util.List<String> | The column to sort on. Can add '-' to the start of the parameter value to sort in descending order.
        Integer paginationLimit = 25; // Integer | Non-negative maximum number of entries to return
        Integer paginationOffset = 0; // Integer | Non-negative number of entries to skip
        try {
            TaskList result = apiInstance.getTasks(tenant, taskType, status, role, user, immediateTasksOnly, scheduleId, sort, paginationLimit, paginationOffset);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling WorkflowApi#getTasks");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenant** | **String**| The code of the tenancy |
 **taskType** | **String**| Acts as a filter for the retrieval process. Filters the tasks that match the given task type. Accepts multiple values separated by a comma, e.g. ?taskType&#x3D;SIGNOFF_DATA,PACKAGE_REPORTS | [optional] [enum: WAIT_FOR_DATA, CUSTOM_DATA, CREATE_MANUAL_DATA, CREATE_FILTERED_DATA, GET_DATA, GENERATE_PREVIEW, SIGNOFF_DATA, CUSTOM_GENERATE, GENERATE_REPORT, SIGNOFF_REPORT, CUSTOM_DELIVERY, EMAIL_REPORT, POST_REPORT, FTP_REPORT, CUSTOM_OTHER, COPY_REPORT_FILE, PACKAGE_REPORTS]
 **status** | **String**| Acts as a filter for the retrieval process. Filters the tasks that match the given status. Accepts multiple values separated by a comma, e.g. ?status&#x3D;PENDING,AWAITING_CORRECTION | [optional] [enum: COMPLETED, IN_PROGRESS, AWAITING_CORRECTION, PENDING, SKIPPED, FAILED_REJECTED]
 **role** | **String**| Acts as a filter for the retrieval process. Filters the tasks that match the input role assigned to the task | [optional]
 **user** | **String**| Acts as a filter for the retrieval process. Filters the tasks that match the input user name assigned to the task | [optional]
 **immediateTasksOnly** | **Boolean**| Acts as a filter for the retrieval process. Filters the immediate tasks if the parameter value is set to true | [optional]
 **scheduleId** | **Integer**| Acts as a filter for the retrieval process. Filters the schedule tasks for the Schedule Id passed in the parameter value | [optional]
 **sort** | **List&lt;String&gt;**| The column to sort on. Can add &#39;-&#39; to the start of the parameter value to sort in descending order. | [optional]
 **paginationLimit** | **Integer**| Non-negative maximum number of entries to return | [optional] [default to 25]
 **paginationOffset** | **Integer**| Non-negative number of entries to skip | [optional] [default to 0]

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


## updateScheduleStatus

> ScheduleStatusUpdateResponse updateScheduleStatus(tenant, scheduleId, status)

Update schedule status for specified schedule

Updated the schedule status for the specified schedule id based on the given status

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.Vermilion.ApiClient;
import com.factset.sdk.Vermilion.ApiException;
import com.factset.sdk.Vermilion.Configuration;
import com.factset.sdk.Vermilion.auth.*;
import com.factset.sdk.Vermilion.models.*;
import com.factset.sdk.Vermilion.api.WorkflowApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;

public class Example {
    public static void main(String[] args) throws Exception {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
        //
        // The confidential client instance should be reused in production environments.
        // See https://github.com/FactSet/enterprise-sdk-utils-java#authentication
        // for more information on using the ConfidentialClient class
        ConfidentialClient confidentialClient = new ConfidentialClient("./path/to/config.json");
        ApiClient defaultClient = new ApiClient()
          .setFactSetOAuth2Client(confidentialClient);

        /* Basic authentication: FactSetApiKey */
        // See https://github.com/FactSet/enterprise-sdk#api-key
        // ApiClient defaultClient = new ApiClient()
        //   .setUsername("YOUR USERNAME")
        //   .setPassword("YOUR PASSWORD");

        WorkflowApi apiInstance = new WorkflowApi(defaultClient);
        String tenant = "TENANT"; // String | The code of the tenancy
        String scheduleId = "123456"; // String | The schedule id for which to update the status
        String status = "INITIALISED"; // String | The schedule status that needs to be updated only if the transition is valid
        try {
            ScheduleStatusUpdateResponse result = apiInstance.updateScheduleStatus(tenant, scheduleId, status);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling WorkflowApi#updateScheduleStatus");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenant** | **String**| The code of the tenancy |
 **scheduleId** | **String**| The schedule id for which to update the status |
 **status** | **String**| The schedule status that needs to be updated only if the transition is valid | [enum: INITIALISED, RUNNING, CANCELLED, SUSPENDED, FINISHED, CLOSED, GENERATING_TASKS]

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


## updateTaskDetails

> TaskPatchResponseObject updateTaskDetails(tenant, taskId, taskPatchRequestBody)

Updates the task details for the specified task.

Updates the task details for the specified task.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.Vermilion.ApiClient;
import com.factset.sdk.Vermilion.ApiException;
import com.factset.sdk.Vermilion.Configuration;
import com.factset.sdk.Vermilion.auth.*;
import com.factset.sdk.Vermilion.models.*;
import com.factset.sdk.Vermilion.api.WorkflowApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;

public class Example {
    public static void main(String[] args) throws Exception {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
        //
        // The confidential client instance should be reused in production environments.
        // See https://github.com/FactSet/enterprise-sdk-utils-java#authentication
        // for more information on using the ConfidentialClient class
        ConfidentialClient confidentialClient = new ConfidentialClient("./path/to/config.json");
        ApiClient defaultClient = new ApiClient()
          .setFactSetOAuth2Client(confidentialClient);

        /* Basic authentication: FactSetApiKey */
        // See https://github.com/FactSet/enterprise-sdk#api-key
        // ApiClient defaultClient = new ApiClient()
        //   .setUsername("YOUR USERNAME")
        //   .setPassword("YOUR PASSWORD");

        WorkflowApi apiInstance = new WorkflowApi(defaultClient);
        String tenant = "TENANT"; // String | The code of the tenancy
        String taskId = "123456"; // String | The unique identifier for task
        TaskPatchRequestBody taskPatchRequestBody = new TaskPatchRequestBody(); // TaskPatchRequestBody | 
        try {
            TaskPatchResponseObject result = apiInstance.updateTaskDetails(tenant, taskId, taskPatchRequestBody);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling WorkflowApi#updateTaskDetails");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenant** | **String**| The code of the tenancy |
 **taskId** | **String**| The unique identifier for task |
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

