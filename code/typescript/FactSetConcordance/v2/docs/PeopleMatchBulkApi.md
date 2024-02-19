# factsetconcordance.PeopleMatchBulkApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getPeopleDecisions**](PeopleMatchBulkApi.md#getPeopleDecisions) | **GET** /factset-concordance/v2/people-decisions | Get the decisions of matches for the requested taskId.
[**getPeopleTaskForList**](PeopleMatchBulkApi.md#getPeopleTaskForList) | **POST** /factset-concordance/v2/people-task | Create a People Concordance Task.
[**getPeopleTaskStatus**](PeopleMatchBulkApi.md#getPeopleTaskStatus) | **GET** /factset-concordance/v2/people-task-status | Get the Status of the People Tasks.



## getPeopleDecisions

> PeopleDecisionsResponse getPeopleDecisions(taskId, opts)

Get the decisions of matches for the requested taskId.

Retrieves the &#x60;Decision&#x60; objects for an People Task (taskId). The decisions do not include all candidates, but rather the results of concording the requested list of names included in the input file. Mapped entities will include a FactSet Entity Identifier (-E). Results will be saved to the &#x60;universeId&#x60; specified in the input file. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, PeopleMatchBulkApi } = require('@factset/sdk-factsetconcordance');
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

const apiInstance = new PeopleMatchBulkApi();
const taskId = 31589; // Number | Concordance Task Identifier. The taskId is created in response from the /people-task endpoint.
const opts = {
  'offset': 0, // Number | Starting row for records to return or rows to skip.
  'limit': 10 // Number | Limits the number of records in the response.
};

// Call api endpoint
apiInstance.getPeopleDecisions(taskId, opts).then(
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
 **taskId** | **Number**| Concordance Task Identifier. The taskId is created in response from the /people-task endpoint. | 
 **offset** | **Number**| Starting row for records to return or rows to skip. | [optional] [default to 0]
 **limit** | **Number**| Limits the number of records in the response. | [optional] 

### Return type

[**PeopleDecisionsResponse**](PeopleDecisionsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json;charset=utf-8, application/json


## getPeopleTaskForList

> PeopleTaskResponse getPeopleTaskForList(universeId, taskName, inputFile, clientIdColumn, entityColumn, opts)

Create a People Concordance Task.

The \&quot;Bulk\&quot; workflow allows the user to create a People Concordance Task. Uploading of a Comma-Separated List file (.csv / UTF-8 encoding) with a list of names and attributes and creation of a task id is mandatory to start the process.    The taskId is then used for reference in the /people-task-status and /people-decisions endpoints to receive results once the task is successful.The /people-task-status endpoint is to check the status of the Tasks as per the ids.     A universeId must be included in request. If you do not have a universe created, reference the /universe endpoint.The bulk workflow supports a two way approach for the user.   **The user can use these parameters in the following ways.**     1.Filling all the required fields including the &#x60;personNameColumn&#x60;.(do not include &#x60;firstNameColumn&#x60;,&#x60;lastNameColumn&#x60; &amp; &#x60;middleNameColumn&#x60;)     2.Filling all the required fields excluding the &#x60;personNameColumn&#x60;.(Ensure atleast the &#x60;lastNameColumn&#x60; is filled) 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, PeopleMatchBulkApi } = require('@factset/sdk-factsetconcordance');
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

const apiInstance = new PeopleMatchBulkApi();
const universeId = 56; // Number | The id of the universe that entities should be mapped to. Reference the `/universe` endpoint to create a universe, or view available universes via `/universes`.
const taskName = "taskName_example"; // String | User defined name for the task that will be used to name the output files.
const inputFile = "/path/to/file"; // File | The UTF-8 encoded CSV File containing the entity names to be concorded to a FactSet Entity Identifier. The files first row **MUST** include headers as defined in the *Column parameters. Be mindful of casing and spacing in column headers. The input file is posted as a file object in the form. For this reason, the mime type of this post request must be multipart/form-data. 
const clientIdColumn = "clientIdColumn_example"; // String | Header Name of the column in the input file that contains a unique identifier supplied by the user referred to as a \\\"clientId\\\". This clientId can be used to create custom mappings or references. 
const entityColumn = "entityColumn_example"; // String | Header name of the column in the input file that contains the Entity Name to be matched. 
const opts = {
  'additionalContextColumns': ["Address"], // [String] | Comma separated list of any additional column names in the input file.  To be used by Managed Service for any unmapped records. 
  'firstNameColumn': "firstNameColumn_example", // String | First name of the person.**Do not include with `personNameColumn`**.  
  'lastNameColumn': "lastNameColumn_example", // String | Lat name of the person.**Do not include with `personNameColumn`**. 
  'middleNameColumn': "middleNameColumn_example", // String | Middle name of the person.**Do not include within `personNameColumn`**. 
  'personNameColumn': "personNameColumn_example", // String | Header name of the column in the input file that contains the name of the person to be matched. **Do not include with `firstNameColumn` and `lastNameColumn`.** 
  'priorityColumn': "priorityColumn_example", // String | Priority associated to the clientId. Used for manual mapping. 
  'salutationColumn': "salutationColumn_example", // String | The salutation of the person.**Do not include with `personNameColumn`**. 
  'suffixColumn': "suffixColumn_example" // String | A name suffix, that follows a person's full name and provides additional information about the person.**Do not include with `personNameColumn`**. 
};

// Call api endpoint
apiInstance.getPeopleTaskForList(universeId, taskName, inputFile, clientIdColumn, entityColumn, opts).then(
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
 **universeId** | **Number**| The id of the universe that entities should be mapped to. Reference the &#x60;/universe&#x60; endpoint to create a universe, or view available universes via &#x60;/universes&#x60;. | 
 **taskName** | **String**| User defined name for the task that will be used to name the output files. | 
 **inputFile** | **File**| The UTF-8 encoded CSV File containing the entity names to be concorded to a FactSet Entity Identifier. The files first row **MUST** include headers as defined in the *Column parameters. Be mindful of casing and spacing in column headers. The input file is posted as a file object in the form. For this reason, the mime type of this post request must be multipart/form-data.  | 
 **clientIdColumn** | **String**| Header Name of the column in the input file that contains a unique identifier supplied by the user referred to as a \\\&quot;clientId\\\&quot;. This clientId can be used to create custom mappings or references.  | 
 **entityColumn** | **String**| Header name of the column in the input file that contains the Entity Name to be matched.  | 
 **additionalContextColumns** | [**[String]**](String.md)| Comma separated list of any additional column names in the input file.  To be used by Managed Service for any unmapped records.  | [optional] 
 **firstNameColumn** | **String**| First name of the person.**Do not include with &#x60;personNameColumn&#x60;**.   | [optional] 
 **lastNameColumn** | **String**| Lat name of the person.**Do not include with &#x60;personNameColumn&#x60;**.  | [optional] 
 **middleNameColumn** | **String**| Middle name of the person.**Do not include within &#x60;personNameColumn&#x60;**.  | [optional] 
 **personNameColumn** | **String**| Header name of the column in the input file that contains the name of the person to be matched. **Do not include with &#x60;firstNameColumn&#x60; and &#x60;lastNameColumn&#x60;.**  | [optional] 
 **priorityColumn** | **String**| Priority associated to the clientId. Used for manual mapping.  | [optional] 
 **salutationColumn** | **String**| The salutation of the person.**Do not include with &#x60;personNameColumn&#x60;**.  | [optional] 
 **suffixColumn** | **String**| A name suffix, that follows a person&#39;s full name and provides additional information about the person.**Do not include with &#x60;personNameColumn&#x60;**.  | [optional] 

### Return type

[**PeopleTaskResponse**](PeopleTaskResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json;charset=utf-8, application/json


## getPeopleTaskStatus

> PeopleTaskStatusResponse getPeopleTaskStatus(opts)

Get the Status of the People Tasks.

Pulls the **status** for ALL the People Tasks submitted by a client within the last 30 days, and related details such as task duration and decision rates. Specific Tasks can also be retrieved by using the _taskId_ parameter.&lt;p&gt;Status types include -   * PENDING - The task has not yet started.   * IN_PROGRESS - The task is submitted and decisions are in progress.   * SUCCESS - The task was successful! Move to the /people-decisions endpoint to retrieve decisions.   * FAILURE - The task failed. Reach out to FactSet Support for assistance.   * BAD_REQUEST - The task creation was unsuccesfull. Typically occurs with an incorrect input file format or column headers.   * ABORTED - The task was aborted. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, PeopleMatchBulkApi } = require('@factset/sdk-factsetconcordance');
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

const apiInstance = new PeopleMatchBulkApi();
const opts = {
  'taskId': 31589, // Number | Concordance Task Identifier. The taskId is created in response from the /people-task endpoint.
  'offset': 0, // Number | Starting row for records to return or rows to skip.
  'limit': 10, // Number | Limits the number of records in the response.
  'status': ["null"] // [String] | Filter on the status of the Concordance Tasks. Default is no filter.   * PENDING - The task has not yet started   * IN_PROGRESS - The task is submitted and decisions are in progress.   * SUCCESS - The task was successful! Move to the /entity-decisions endpoint to retrieve decisions.   * FAILURE - The task failed. Reach out to FactSet Support for assistance.   * BAD_REQUEST - The task creation was unsuccesfull. Typically occurs with an incorrect input file format or column headers.   * ABORTED - The task was aborted. 
};

// Call api endpoint
apiInstance.getPeopleTaskStatus(opts).then(
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
 **taskId** | **Number**| Concordance Task Identifier. The taskId is created in response from the /people-task endpoint. | [optional] 
 **offset** | **Number**| Starting row for records to return or rows to skip. | [optional] [default to 0]
 **limit** | **Number**| Limits the number of records in the response. | [optional] 
 **status** | [**[String]**](String.md)| Filter on the status of the Concordance Tasks. Default is no filter.   * PENDING - The task has not yet started   * IN_PROGRESS - The task is submitted and decisions are in progress.   * SUCCESS - The task was successful! Move to the /entity-decisions endpoint to retrieve decisions.   * FAILURE - The task failed. Reach out to FactSet Support for assistance.   * BAD_REQUEST - The task creation was unsuccesfull. Typically occurs with an incorrect input file format or column headers.   * ABORTED - The task was aborted.  | [optional] 

### Return type

[**PeopleTaskStatusResponse**](PeopleTaskStatusResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json;charset=utf-8, application/json

