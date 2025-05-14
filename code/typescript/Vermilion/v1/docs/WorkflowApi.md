# vermilion.WorkflowApi

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

> GenerateScheduleResponse generateSchedule(tenant, scheduleDefinitionCode, opts)

Creates schedule for the specified schedule definition

Creates schedule for the specified Schedule Definition code and sets to running based on the param in the JSON in the request body

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, WorkflowApi } = require('@factset/sdk-vermilion');
const { ConfidentialClient } = require('@factset/sdk-utils');

const apiClient = ApiClient.instance;

// Examples for each supported authentication method are below,
// choose one that satisfies your use case.

// (Preferred) OAuth 2.0: FactSetOAuth2
// See https://github.com/FactSet/enterprise-sdk#oauth-20
// for information on how to create the app-config.json file
//
// The confidential client instance should be reused in production environments.
// See https://github.com/FactSet/enterprise-sdk-utils-typescript#authentication
// for more information on using the ConfidentialClient class
apiClient.factsetOauth2Client = new ConfidentialClient('/path/to/app-config.json');

// Basic authentication: FactSetApiKey
// See https://github.com/FactSet/enterprise-sdk#api-key
// for information how to create an API key
// const FactSetApiKey = apiClient.authentications['FactSetApiKey'];
// FactSetApiKey.username = 'USERNAME-SERIAL';
// FactSetApiKey.password = 'API-KEY';

const apiInstance = new WorkflowApi();
const tenant = TENANT; // String | The code of the tenancy
const scheduleDefinitionCode = TEST_SCHEDULE_DEF; // String | The schedule definition code for which to generate the schedule
const opts = {
  'setToRunning': true // Boolean | This parameter is used to set the generated schedule's status to Running.If parameter is set to true, the generated schedule will be set to Running. If no value is provided, the schedule will remain in Initialised status.
};

// Call api endpoint
apiInstance.generateSchedule(tenant, scheduleDefinitionCode, opts).then(
  data => {

    console.log('API called successfully. Returned data:');
    console.log(data);
  },
  error => {
    console.error(error);
  },
);

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


## generateScheduleTasks

> ScheduleStatusUpdateResponse generateScheduleTasks(tenant, scheduleId)

Generates the tasks for the initialised schedule

Generates the schedule tasks for the specified schedule id

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, WorkflowApi } = require('@factset/sdk-vermilion');
const { ConfidentialClient } = require('@factset/sdk-utils');

const apiClient = ApiClient.instance;

// Examples for each supported authentication method are below,
// choose one that satisfies your use case.

// (Preferred) OAuth 2.0: FactSetOAuth2
// See https://github.com/FactSet/enterprise-sdk#oauth-20
// for information on how to create the app-config.json file
//
// The confidential client instance should be reused in production environments.
// See https://github.com/FactSet/enterprise-sdk-utils-typescript#authentication
// for more information on using the ConfidentialClient class
apiClient.factsetOauth2Client = new ConfidentialClient('/path/to/app-config.json');

// Basic authentication: FactSetApiKey
// See https://github.com/FactSet/enterprise-sdk#api-key
// for information how to create an API key
// const FactSetApiKey = apiClient.authentications['FactSetApiKey'];
// FactSetApiKey.username = 'USERNAME-SERIAL';
// FactSetApiKey.password = 'API-KEY';

const apiInstance = new WorkflowApi();
const tenant = TENANT; // String | The code of the tenancy
const scheduleId = 123456; // String | The schedule id for which to generate the tasks

// Call api endpoint
apiInstance.generateScheduleTasks(tenant, scheduleId).then(
  data => {

    console.log('API called successfully. Returned data:');
    console.log(data);
  },
  error => {
    console.error(error);
  },
);

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


## getScheduleById

> ScheduleResponseData getScheduleById(tenant, scheduleId)

Gets a schedule based on the schedule ID

Gets a schedule Object based on the schedule ID passed.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, WorkflowApi } = require('@factset/sdk-vermilion');
const { ConfidentialClient } = require('@factset/sdk-utils');

const apiClient = ApiClient.instance;

// Examples for each supported authentication method are below,
// choose one that satisfies your use case.

// (Preferred) OAuth 2.0: FactSetOAuth2
// See https://github.com/FactSet/enterprise-sdk#oauth-20
// for information on how to create the app-config.json file
//
// The confidential client instance should be reused in production environments.
// See https://github.com/FactSet/enterprise-sdk-utils-typescript#authentication
// for more information on using the ConfidentialClient class
apiClient.factsetOauth2Client = new ConfidentialClient('/path/to/app-config.json');

// Basic authentication: FactSetApiKey
// See https://github.com/FactSet/enterprise-sdk#api-key
// for information how to create an API key
// const FactSetApiKey = apiClient.authentications['FactSetApiKey'];
// FactSetApiKey.username = 'USERNAME-SERIAL';
// FactSetApiKey.password = 'API-KEY';

const apiInstance = new WorkflowApi();
const tenant = TENANT; // String | The code of the tenancy
const scheduleId = 16304; // String | The Id of the schedule

// Call api endpoint
apiInstance.getScheduleById(tenant, scheduleId).then(
  data => {

    console.log('API called successfully. Returned data:');
    console.log(data);
  },
  error => {
    console.error(error);
  },
);

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


## getScheduleDefinitions

> ScheduleDefinitionsList getScheduleDefinitions(tenant, opts)

Retrieves a list of all schedule definitions

Retrieves all schedule definitions the user has permissions for. User has sort and filter parameters available to use.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, WorkflowApi } = require('@factset/sdk-vermilion');
const { ConfidentialClient } = require('@factset/sdk-utils');

const apiClient = ApiClient.instance;

// Examples for each supported authentication method are below,
// choose one that satisfies your use case.

// (Preferred) OAuth 2.0: FactSetOAuth2
// See https://github.com/FactSet/enterprise-sdk#oauth-20
// for information on how to create the app-config.json file
//
// The confidential client instance should be reused in production environments.
// See https://github.com/FactSet/enterprise-sdk-utils-typescript#authentication
// for more information on using the ConfidentialClient class
apiClient.factsetOauth2Client = new ConfidentialClient('/path/to/app-config.json');

// Basic authentication: FactSetApiKey
// See https://github.com/FactSet/enterprise-sdk#api-key
// for information how to create an API key
// const FactSetApiKey = apiClient.authentications['FactSetApiKey'];
// FactSetApiKey.username = 'USERNAME-SERIAL';
// FactSetApiKey.password = 'API-KEY';

const apiInstance = new WorkflowApi();
const tenant = TENANT; // String | The code of the tenancy
const opts = {
  'scheduleType': MANUAL, // String | Acts as a filter for the retrieval process. Filters the schedule definitions that match the given schedule type. Accepts multiple values separated by a comma, e.g. ?scheduleType=REPEATING,MANUAL
  'reportDate': LAST_BUSINESS_DAY_OF_PREV_MONTH, // String | Acts as a filter for the retrieval process. Filters the schedule definitions that match the given schedule report date.  Accepts multiple values separated by a comma, e.g. ?reportDate=LAST_DAY_OF_PREV_MONTH,CREATION_DATE
  'lastUpdatedBy': John, // String | Acts as a filter for the retrieval process. Filters the schedule definitions where the provided parameter value matches or is a substring of the last updated by value of the schedule definitions
  'startDate': 25 March 2024 00:00:00, // String | Acts as a filter for the retrieval process. Filters the schedule definitions based on their last updated date, the input date must be of the date format (d MMMMM yyyy 00:00:00).
  'endDate': 25 March 2024 00:00:00, // String | Acts as a filter for the retrieval process. Filters the schedule definitions based on their last updated date, the input date must be of the date format (d MMMMM yyyy 00:00:00).
  'sort': ["name"], // [String] | The column to sort on. Can add '-' to the start of the parameter value to sort in descending order.
  'paginationLimit': 10, // Number | Non-negative maximum number of entries to return
  'paginationOffset': 0 // Number | Non-negative number of entries to skip
};

// Call api endpoint
apiInstance.getScheduleDefinitions(tenant, opts).then(
  data => {

    console.log('API called successfully. Returned data:');
    console.log(data);
  },
  error => {
    console.error(error);
  },
);

```


### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenant** | **String**| The code of the tenancy | 
 **scheduleType** | **String**| Acts as a filter for the retrieval process. Filters the schedule definitions that match the given schedule type. Accepts multiple values separated by a comma, e.g. ?scheduleType&#x3D;REPEATING,MANUAL | [optional] 
 **reportDate** | **String**| Acts as a filter for the retrieval process. Filters the schedule definitions that match the given schedule report date.  Accepts multiple values separated by a comma, e.g. ?reportDate&#x3D;LAST_DAY_OF_PREV_MONTH,CREATION_DATE | [optional] 
 **lastUpdatedBy** | **String**| Acts as a filter for the retrieval process. Filters the schedule definitions where the provided parameter value matches or is a substring of the last updated by value of the schedule definitions | [optional] 
 **startDate** | **String**| Acts as a filter for the retrieval process. Filters the schedule definitions based on their last updated date, the input date must be of the date format (d MMMMM yyyy 00:00:00). | [optional] 
 **endDate** | **String**| Acts as a filter for the retrieval process. Filters the schedule definitions based on their last updated date, the input date must be of the date format (d MMMMM yyyy 00:00:00). | [optional] 
 **sort** | [**[String]**](String.md)| The column to sort on. Can add &#39;-&#39; to the start of the parameter value to sort in descending order. | [optional] 
 **paginationLimit** | **Number**| Non-negative maximum number of entries to return | [optional] [default to 25]
 **paginationOffset** | **Number**| Non-negative number of entries to skip | [optional] [default to 0]

### Return type

[**ScheduleDefinitionsList**](ScheduleDefinitionsList.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getScheduleGenerationLogs

> ScheduleGenerationLogList getScheduleGenerationLogs(tenant, scheduleId, opts)

Gets the generation logs for a specific schedule

Gets the generation logs for a specific schedule based on the Schedule ID. Allows the user to sort and filter logs.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, WorkflowApi } = require('@factset/sdk-vermilion');
const { ConfidentialClient } = require('@factset/sdk-utils');

const apiClient = ApiClient.instance;

// Examples for each supported authentication method are below,
// choose one that satisfies your use case.

// (Preferred) OAuth 2.0: FactSetOAuth2
// See https://github.com/FactSet/enterprise-sdk#oauth-20
// for information on how to create the app-config.json file
//
// The confidential client instance should be reused in production environments.
// See https://github.com/FactSet/enterprise-sdk-utils-typescript#authentication
// for more information on using the ConfidentialClient class
apiClient.factsetOauth2Client = new ConfidentialClient('/path/to/app-config.json');

// Basic authentication: FactSetApiKey
// See https://github.com/FactSet/enterprise-sdk#api-key
// for information how to create an API key
// const FactSetApiKey = apiClient.authentications['FactSetApiKey'];
// FactSetApiKey.username = 'USERNAME-SERIAL';
// FactSetApiKey.password = 'API-KEY';

const apiInstance = new WorkflowApi();
const tenant = TENANT; // String | The code of the tenancy
const scheduleId = 123456; // String | The scheduleId for which the logs are requested
const opts = {
  'type': INFO, // String | Acts as a filter for the retrieval process. Filters the log instances that match the input type
  'message': package definition, // String | Acts as a filter for the retrieval process. Filters the log instances that match the input message
  'logSet': 1, // String | Acts as a filter for the retrieval process. Filters the log instances that match the input logset
  'startDate': 25 March 2024 00:00:00, // String | Acts as a filter for the retrieval process. Filters the log instances based on their last updated date, the input date must be of the date format (d MMMMM yyyy 00:00:00).
  'endDate': 25 March 2024 00:00:00, // String | Acts as a filter for the retrieval process. Filters the log instances based on their last updated date, the input date must be of the date format (d MMMMM yyyy 00:00:00).
  'sort': ["sequenceNumber"], // [String] | The column to sort on. Can add - to sort
  'paginationLimit': 10, // Number | Non-negative maximum number of entries to return
  'paginationOffset': 0 // Number | Non-negative number of entries to skip
};

// Call api endpoint
apiInstance.getScheduleGenerationLogs(tenant, scheduleId, opts).then(
  data => {

    console.log('API called successfully. Returned data:');
    console.log(data);
  },
  error => {
    console.error(error);
  },
);

```


### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenant** | **String**| The code of the tenancy | 
 **scheduleId** | **String**| The scheduleId for which the logs are requested | 
 **type** | **String**| Acts as a filter for the retrieval process. Filters the log instances that match the input type | [optional] 
 **message** | **String**| Acts as a filter for the retrieval process. Filters the log instances that match the input message | [optional] 
 **logSet** | **String**| Acts as a filter for the retrieval process. Filters the log instances that match the input logset | [optional] 
 **startDate** | **String**| Acts as a filter for the retrieval process. Filters the log instances based on their last updated date, the input date must be of the date format (d MMMMM yyyy 00:00:00). | [optional] 
 **endDate** | **String**| Acts as a filter for the retrieval process. Filters the log instances based on their last updated date, the input date must be of the date format (d MMMMM yyyy 00:00:00). | [optional] 
 **sort** | [**[String]**](String.md)| The column to sort on. Can add - to sort | [optional] 
 **paginationLimit** | **Number**| Non-negative maximum number of entries to return | [optional] [default to 25]
 **paginationOffset** | **Number**| Non-negative number of entries to skip | [optional] [default to 0]

### Return type

[**ScheduleGenerationLogList**](ScheduleGenerationLogList.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getSchedules

> SchedulesList getSchedules(tenant, opts)

Retrieves a list of all schedules

Retrieves all schedules the user has permissions for. User has sort and filter parameters available to use.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, WorkflowApi } = require('@factset/sdk-vermilion');
const { ConfidentialClient } = require('@factset/sdk-utils');

const apiClient = ApiClient.instance;

// Examples for each supported authentication method are below,
// choose one that satisfies your use case.

// (Preferred) OAuth 2.0: FactSetOAuth2
// See https://github.com/FactSet/enterprise-sdk#oauth-20
// for information on how to create the app-config.json file
//
// The confidential client instance should be reused in production environments.
// See https://github.com/FactSet/enterprise-sdk-utils-typescript#authentication
// for more information on using the ConfidentialClient class
apiClient.factsetOauth2Client = new ConfidentialClient('/path/to/app-config.json');

// Basic authentication: FactSetApiKey
// See https://github.com/FactSet/enterprise-sdk#api-key
// for information how to create an API key
// const FactSetApiKey = apiClient.authentications['FactSetApiKey'];
// FactSetApiKey.username = 'USERNAME-SERIAL';
// FactSetApiKey.password = 'API-KEY';

const apiInstance = new WorkflowApi();
const tenant = TENANT; // String | The code of the tenancy
const opts = {
  'status': RUNNING, // String | Acts as a filter for the retrieval process. Filters the schedules that match the given status. Accepts multiple values separated by a comma, e.g. ?status=INITIALISED,RUNNING
  'startDate': 14 June 2024 00:00:00, // String | Acts as a filter for the retrieval process. Filters the schedules based on their last updated date, the input date must be of the date format (d MMMMM yyyy 00:00:00).
  'endDate': 14 June 2024 00:00:00, // String | Acts as a filter for the retrieval process. Filters the schedules based on their last updated date, the input date must be of the date format (d MMMMM yyyy 00:00:00).
  'sort': ["scheduleId"], // [String] | The column to sort on. Can add '-' to the start of the parameter value to sort in descending order.
  'paginationLimit': 10, // Number | Non-negative maximum number of entries to return
  'paginationOffset': 0 // Number | Non-negative number of entries to skip
};

// Call api endpoint
apiInstance.getSchedules(tenant, opts).then(
  data => {

    console.log('API called successfully. Returned data:');
    console.log(data);
  },
  error => {
    console.error(error);
  },
);

```


### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenant** | **String**| The code of the tenancy | 
 **status** | **String**| Acts as a filter for the retrieval process. Filters the schedules that match the given status. Accepts multiple values separated by a comma, e.g. ?status&#x3D;INITIALISED,RUNNING | [optional] 
 **startDate** | **String**| Acts as a filter for the retrieval process. Filters the schedules based on their last updated date, the input date must be of the date format (d MMMMM yyyy 00:00:00). | [optional] 
 **endDate** | **String**| Acts as a filter for the retrieval process. Filters the schedules based on their last updated date, the input date must be of the date format (d MMMMM yyyy 00:00:00). | [optional] 
 **sort** | [**[String]**](String.md)| The column to sort on. Can add &#39;-&#39; to the start of the parameter value to sort in descending order. | [optional] 
 **paginationLimit** | **Number**| Non-negative maximum number of entries to return | [optional] [default to 25]
 **paginationOffset** | **Number**| Non-negative number of entries to skip | [optional] [default to 0]

### Return type

[**SchedulesList**](SchedulesList.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getTask

> TaskDetailsObject getTask(tenant, taskId)

Gets a task based on the task ID

Gets a task Object based on the task ID passed.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, WorkflowApi } = require('@factset/sdk-vermilion');
const { ConfidentialClient } = require('@factset/sdk-utils');

const apiClient = ApiClient.instance;

// Examples for each supported authentication method are below,
// choose one that satisfies your use case.

// (Preferred) OAuth 2.0: FactSetOAuth2
// See https://github.com/FactSet/enterprise-sdk#oauth-20
// for information on how to create the app-config.json file
//
// The confidential client instance should be reused in production environments.
// See https://github.com/FactSet/enterprise-sdk-utils-typescript#authentication
// for more information on using the ConfidentialClient class
apiClient.factsetOauth2Client = new ConfidentialClient('/path/to/app-config.json');

// Basic authentication: FactSetApiKey
// See https://github.com/FactSet/enterprise-sdk#api-key
// for information how to create an API key
// const FactSetApiKey = apiClient.authentications['FactSetApiKey'];
// FactSetApiKey.username = 'USERNAME-SERIAL';
// FactSetApiKey.password = 'API-KEY';

const apiInstance = new WorkflowApi();
const tenant = TENANT; // String | The code of the tenancy
const taskId = 135709; // String | The Id of the task

// Call api endpoint
apiInstance.getTask(tenant, taskId).then(
  data => {

    console.log('API called successfully. Returned data:');
    console.log(data);
  },
  error => {
    console.error(error);
  },
);

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


## getTaskHistory

> TaskHistoryList getTaskHistory(tenant, taskId, opts)

Gets the task history for a specific task

Gets the task history for a specific task based on the Task ID. Allows the user to sort and filter the task history entries.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, WorkflowApi } = require('@factset/sdk-vermilion');
const { ConfidentialClient } = require('@factset/sdk-utils');

const apiClient = ApiClient.instance;

// Examples for each supported authentication method are below,
// choose one that satisfies your use case.

// (Preferred) OAuth 2.0: FactSetOAuth2
// See https://github.com/FactSet/enterprise-sdk#oauth-20
// for information on how to create the app-config.json file
//
// The confidential client instance should be reused in production environments.
// See https://github.com/FactSet/enterprise-sdk-utils-typescript#authentication
// for more information on using the ConfidentialClient class
apiClient.factsetOauth2Client = new ConfidentialClient('/path/to/app-config.json');

// Basic authentication: FactSetApiKey
// See https://github.com/FactSet/enterprise-sdk#api-key
// for information how to create an API key
// const FactSetApiKey = apiClient.authentications['FactSetApiKey'];
// FactSetApiKey.username = 'USERNAME-SERIAL';
// FactSetApiKey.password = 'API-KEY';

const apiInstance = new WorkflowApi();
const tenant = TENANT; // String | The code of the tenancy
const taskId = 123456; // String | The taskId for which the history of the specific task is requested
const opts = {
  'actionType': Status Changed, // String | Acts as a filter for the retrieval process. Filters the task history entries that match the given action type
  'reasonCode': Missing Data, // String | Acts as a filter for the retrieval process. Filters the task history entries that match the given reason code
  'startDate': 25 March 2024 00:00:00, // String | Acts as a filter for the retrieval process. Filters the task history events based on their last updated date, the input date must be of the date format (d MMMMM yyyy 00:00:00).
  'endDate': 25 March 2024 00:00:00, // String | Acts as a filter for the retrieval process. Filters the task history events based on their last updated date, the input date must be of the date format (d MMMMM yyyy 00:00:00).
  'sort': ["dateAndTime"], // [String] | The column to sort on. Can add - to sort for descending order
  'paginationLimit': 10, // Number | Non-negative maximum number of entries to return
  'paginationOffset': 0 // Number | Non-negative number of entries to skip
};

// Call api endpoint
apiInstance.getTaskHistory(tenant, taskId, opts).then(
  data => {

    console.log('API called successfully. Returned data:');
    console.log(data);
  },
  error => {
    console.error(error);
  },
);

```


### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenant** | **String**| The code of the tenancy | 
 **taskId** | **String**| The taskId for which the history of the specific task is requested | 
 **actionType** | **String**| Acts as a filter for the retrieval process. Filters the task history entries that match the given action type | [optional] 
 **reasonCode** | **String**| Acts as a filter for the retrieval process. Filters the task history entries that match the given reason code | [optional] 
 **startDate** | **String**| Acts as a filter for the retrieval process. Filters the task history events based on their last updated date, the input date must be of the date format (d MMMMM yyyy 00:00:00). | [optional] 
 **endDate** | **String**| Acts as a filter for the retrieval process. Filters the task history events based on their last updated date, the input date must be of the date format (d MMMMM yyyy 00:00:00). | [optional] 
 **sort** | [**[String]**](String.md)| The column to sort on. Can add - to sort for descending order | [optional] 
 **paginationLimit** | **Number**| Non-negative maximum number of entries to return | [optional] [default to 25]
 **paginationOffset** | **Number**| Non-negative number of entries to skip | [optional] [default to 0]

### Return type

[**TaskHistoryList**](TaskHistoryList.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getTasks

> TaskList getTasks(tenant, opts)

Retrieves a list of all tasks

Retrieves all tasks the user has permissions for. User has sort and filter parameters available to use.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, WorkflowApi } = require('@factset/sdk-vermilion');
const { ConfidentialClient } = require('@factset/sdk-utils');

const apiClient = ApiClient.instance;

// Examples for each supported authentication method are below,
// choose one that satisfies your use case.

// (Preferred) OAuth 2.0: FactSetOAuth2
// See https://github.com/FactSet/enterprise-sdk#oauth-20
// for information on how to create the app-config.json file
//
// The confidential client instance should be reused in production environments.
// See https://github.com/FactSet/enterprise-sdk-utils-typescript#authentication
// for more information on using the ConfidentialClient class
apiClient.factsetOauth2Client = new ConfidentialClient('/path/to/app-config.json');

// Basic authentication: FactSetApiKey
// See https://github.com/FactSet/enterprise-sdk#api-key
// for information how to create an API key
// const FactSetApiKey = apiClient.authentications['FactSetApiKey'];
// FactSetApiKey.username = 'USERNAME-SERIAL';
// FactSetApiKey.password = 'API-KEY';

const apiInstance = new WorkflowApi();
const tenant = TENANT; // String | The code of the tenancy
const opts = {
  'taskType': PACKAGE_REPORTS, // String | Acts as a filter for the retrieval process. Filters the tasks that match the given task type. Accepts multiple values separated by a comma, e.g. ?taskType=SIGNOFF_DATA,PACKAGE_REPORTS
  'status': PENDING, // String | Acts as a filter for the retrieval process. Filters the tasks that match the given status. Accepts multiple values separated by a comma, e.g. ?status=PENDING,AWAITING_CORRECTION
  'role': Client Reporting Manager, // String | Acts as a filter for the retrieval process. Filters the tasks that match the input role assigned to the task
  'user': John, // String | Acts as a filter for the retrieval process. Filters the tasks that match the input user name assigned to the task
  'immediateTasksOnly': true, // Boolean | Acts as a filter for the retrieval process. Filters the immediate tasks if the parameter value is set to true
  'scheduleId': 37325, // Number | Acts as a filter for the retrieval process. Filters the schedule tasks for the Schedule Id passed in the parameter value
  'sort': ["taskId"], // [String] | The column to sort on. Can add '-' to the start of the parameter value to sort in descending order.
  'paginationLimit': 10, // Number | Non-negative maximum number of entries to return
  'paginationOffset': 0 // Number | Non-negative number of entries to skip
};

// Call api endpoint
apiInstance.getTasks(tenant, opts).then(
  data => {

    console.log('API called successfully. Returned data:');
    console.log(data);
  },
  error => {
    console.error(error);
  },
);

```


### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenant** | **String**| The code of the tenancy | 
 **taskType** | **String**| Acts as a filter for the retrieval process. Filters the tasks that match the given task type. Accepts multiple values separated by a comma, e.g. ?taskType&#x3D;SIGNOFF_DATA,PACKAGE_REPORTS | [optional] 
 **status** | **String**| Acts as a filter for the retrieval process. Filters the tasks that match the given status. Accepts multiple values separated by a comma, e.g. ?status&#x3D;PENDING,AWAITING_CORRECTION | [optional] 
 **role** | **String**| Acts as a filter for the retrieval process. Filters the tasks that match the input role assigned to the task | [optional] 
 **user** | **String**| Acts as a filter for the retrieval process. Filters the tasks that match the input user name assigned to the task | [optional] 
 **immediateTasksOnly** | **Boolean**| Acts as a filter for the retrieval process. Filters the immediate tasks if the parameter value is set to true | [optional] 
 **scheduleId** | **Number**| Acts as a filter for the retrieval process. Filters the schedule tasks for the Schedule Id passed in the parameter value | [optional] 
 **sort** | [**[String]**](String.md)| The column to sort on. Can add &#39;-&#39; to the start of the parameter value to sort in descending order. | [optional] 
 **paginationLimit** | **Number**| Non-negative maximum number of entries to return | [optional] [default to 25]
 **paginationOffset** | **Number**| Non-negative number of entries to skip | [optional] [default to 0]

### Return type

[**TaskList**](TaskList.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## updateScheduleStatus

> ScheduleStatusUpdateResponse updateScheduleStatus(tenant, scheduleId, status)

Update schedule status for specified schedule

Updated the schedule status for the specified schedule id based on the given status

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, WorkflowApi } = require('@factset/sdk-vermilion');
const { ConfidentialClient } = require('@factset/sdk-utils');

const apiClient = ApiClient.instance;

// Examples for each supported authentication method are below,
// choose one that satisfies your use case.

// (Preferred) OAuth 2.0: FactSetOAuth2
// See https://github.com/FactSet/enterprise-sdk#oauth-20
// for information on how to create the app-config.json file
//
// The confidential client instance should be reused in production environments.
// See https://github.com/FactSet/enterprise-sdk-utils-typescript#authentication
// for more information on using the ConfidentialClient class
apiClient.factsetOauth2Client = new ConfidentialClient('/path/to/app-config.json');

// Basic authentication: FactSetApiKey
// See https://github.com/FactSet/enterprise-sdk#api-key
// for information how to create an API key
// const FactSetApiKey = apiClient.authentications['FactSetApiKey'];
// FactSetApiKey.username = 'USERNAME-SERIAL';
// FactSetApiKey.password = 'API-KEY';

const apiInstance = new WorkflowApi();
const tenant = TENANT; // String | The code of the tenancy
const scheduleId = 123456; // String | The schedule id for which to update the status
const status = RUNNING; // String | The schedule status that needs to be updated only if the transition is valid

// Call api endpoint
apiInstance.updateScheduleStatus(tenant, scheduleId, status).then(
  data => {

    console.log('API called successfully. Returned data:');
    console.log(data);
  },
  error => {
    console.error(error);
  },
);

```


### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenant** | **String**| The code of the tenancy | 
 **scheduleId** | **String**| The schedule id for which to update the status | 
 **status** | **String**| The schedule status that needs to be updated only if the transition is valid | 

### Return type

[**ScheduleStatusUpdateResponse**](ScheduleStatusUpdateResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## updateTaskDetails

> TaskPatchResponseObject updateTaskDetails(tenant, taskId, taskPatchRequestBody)

Updates the task details for the specified task.

Updates the task details for the specified task.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, WorkflowApi } = require('@factset/sdk-vermilion');
const { ConfidentialClient } = require('@factset/sdk-utils');

const apiClient = ApiClient.instance;

// Examples for each supported authentication method are below,
// choose one that satisfies your use case.

// (Preferred) OAuth 2.0: FactSetOAuth2
// See https://github.com/FactSet/enterprise-sdk#oauth-20
// for information on how to create the app-config.json file
//
// The confidential client instance should be reused in production environments.
// See https://github.com/FactSet/enterprise-sdk-utils-typescript#authentication
// for more information on using the ConfidentialClient class
apiClient.factsetOauth2Client = new ConfidentialClient('/path/to/app-config.json');

// Basic authentication: FactSetApiKey
// See https://github.com/FactSet/enterprise-sdk#api-key
// for information how to create an API key
// const FactSetApiKey = apiClient.authentications['FactSetApiKey'];
// FactSetApiKey.username = 'USERNAME-SERIAL';
// FactSetApiKey.password = 'API-KEY';

const apiInstance = new WorkflowApi();
const tenant = TENANT; // String | The code of the tenancy
const taskId = 123456; // String | The unique identifier for task
const taskPatchRequestBody = {"data":{"status":"COMPLETED","expectedStartDate":"25 December 2024 00:00:00","expectedEndDate":"25 December 2024 01:00:00","actualStartDate":"25 December 2024 00:00:00","notes":"string","role":"Admin","user":"user1","action":"Reject","reason":"Reason for rejection"}}; // TaskPatchRequestBody | 

// Call api endpoint
apiInstance.updateTaskDetails(tenant, taskId, taskPatchRequestBody).then(
  data => {

    console.log('API called successfully. Returned data:');
    console.log(data);
  },
  error => {
    console.error(error);
  },
);

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

