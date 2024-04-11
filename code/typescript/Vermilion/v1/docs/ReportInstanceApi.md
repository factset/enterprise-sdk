# vermilion.ReportInstanceApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelReportGeneration**](ReportInstanceApi.md#cancelReportGeneration) | **DELETE** /v1/{tenant}/report-instances/{reportInstanceId} | Cancels a report generation
[**downloadReportFile**](ReportInstanceApi.md#downloadReportFile) | **GET** /v1/{tenant}/report-instances/{reportInstanceId}/results/{reportFileName} | Gets the generated file
[**getAllReportInstances**](ReportInstanceApi.md#getAllReportInstances) | **GET** /v1/{tenant}/report-instances | Gets a list of report instances
[**getReportGenerationLogs**](ReportInstanceApi.md#getReportGenerationLogs) | **GET** /v1/{tenant}/report-instances/{reportInstanceId}/logs | Gets a list of logs for the report instance generation
[**getReportInstanceById**](ReportInstanceApi.md#getReportInstanceById) | **GET** /v1/{tenant}/report-instances/{reportInstanceId} | Gets a report instance based on the ID
[**startReportGeneration**](ReportInstanceApi.md#startReportGeneration) | **POST** /v1/report-instances/generate | Generates a report



## cancelReportGeneration

> cancelReportGeneration(tenant, reportInstanceId)

Cancels a report generation

Sends a request to cancel a report generation based on the report instance id passed

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, ReportInstanceApi } = require('@factset/sdk-vermilion');
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

const apiInstance = new ReportInstanceApi();
const tenant = XXXXXXXXXX; // String | The code of the tenancy
const reportInstanceId = 123456789; // String | The id of the report instance

// Call api endpoint
apiInstance.cancelReportGeneration(tenant, reportInstanceId).then(
  () => {
    console.log('API called successfully.');
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
 **reportInstanceId** | **String**| The id of the report instance | 

### Return type

null (empty response body)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## downloadReportFile

> File downloadReportFile(tenant, reportInstanceId, reportFileName)

Gets the generated file

Get the generated file for a report instance. Users can fetch the generated report once the generation is finished. The report instance id and the report file name are passed in as path paramters. The following mapping defines the respective Content-Type for the outputFormat defined during report generation. | outputFormat | Content-Type | | ---------------- | ------------| |WORD     | application/msword | |WORD2010 |   application/vnd.openxmlformats-officedocument.wordprocessingml.document| |EXCEL    |   application/vnd.ms-excel| |EXCEL2010|   application/vnd.openxmlformats-officedocument.spreadsheetml.sheet| |PPT      |   application/vnd.ms-powerpoint| |PPT2010  |   application/vnd.openxmlformats-officedocument.presentationml.presentation| |PDF      |   application/pdf| |CSV      |   text/csv| |XML      |   application/xml| |VXML     |   application/xml| |HTML     |   text/html| |PS       |   application/postscript|

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, ReportInstanceApi } = require('@factset/sdk-vermilion');
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

const apiInstance = new ReportInstanceApi();
const tenant = XXXXXXXXXX; // String | The code of the tenancy
const reportInstanceId = 123456789; // String | Used to validate that report file name belongs to the report instance passed
const reportFileName = xyz.pdf; // String | The report file name that has to be retrieved. report file name. E.g: xyz.pdf

// Call api endpoint
apiInstance.downloadReportFile(tenant, reportInstanceId, reportFileName).then(
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
 **reportInstanceId** | **String**| Used to validate that report file name belongs to the report instance passed | 
 **reportFileName** | **String**| The report file name that has to be retrieved. report file name. E.g: xyz.pdf | 

### Return type

**File**

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/pdf, application/vnd.openxmlformats-officedocument.presentationml.presentation, application/vnd.ms-powerpoint, application/vnd.openxmlformats-officedocument.spreadsheetml.sheet, application/vnd.ms-excel, application/vnd.openxmlformats-officedocument.wordprocessingml.document, application/msword, application/postscript, text/csv, text/html, application/xml, application/zip, application/json


## getAllReportInstances

> ReportInstanceList getAllReportInstances(tenant, opts)

Gets a list of report instances

Gets a list of report instances. This can be filtered down further by including query parameters in the URL. For example, a report definition id can be added so the only report instances returned are the ones with a matching id

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, ReportInstanceApi } = require('@factset/sdk-vermilion');
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

const apiInstance = new ReportInstanceApi();
const tenant = XXXXXXXXXX; // String | The code of the tenancy
const opts = {
  'reportDefinitionCode': XXXXXXXXXX, // String | Acts as a filter for the retrieval process. Filters the report instances that match the report definition code
  'entityCodes': SYSTEM_LANG, // String | A series of query parameters used to filter the report instances by entity code. E.g: entityCode=DATE&entityCode=SYSTEM_LANG
  'entityKeys': en-gb, // String | A series of query parameters used to filter the report instances by entity keys. E.g: entityKey=en-gb
  'sectionFilter': testFilter, // String | Acts as a filter for the retrieval process. Filters the report instances that match the section filter
  'outputFormat': pdf, // String | Acts as a filter for the retrieval process. Filters the report instances that match the output format
  'sort': ["reportInstanceId"], // [String] | The column to sort on. Append - to sort in descending order. If parameter is not given, sorting will be based on the report instance id in descending order
  'paginationLimit': 25, // Number | Non-negative maximum number of entries to return
  'paginationOffset': 0 // Number | Non-negative number of entries to skip
};

// Call api endpoint
apiInstance.getAllReportInstances(tenant, opts).then(
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
 **reportDefinitionCode** | **String**| Acts as a filter for the retrieval process. Filters the report instances that match the report definition code | [optional] 
 **entityCodes** | **String**| A series of query parameters used to filter the report instances by entity code. E.g: entityCode&#x3D;DATE&amp;entityCode&#x3D;SYSTEM_LANG | [optional] 
 **entityKeys** | **String**| A series of query parameters used to filter the report instances by entity keys. E.g: entityKey&#x3D;en-gb | [optional] 
 **sectionFilter** | **String**| Acts as a filter for the retrieval process. Filters the report instances that match the section filter | [optional] 
 **outputFormat** | **String**| Acts as a filter for the retrieval process. Filters the report instances that match the output format | [optional] 
 **sort** | [**[String]**](String.md)| The column to sort on. Append - to sort in descending order. If parameter is not given, sorting will be based on the report instance id in descending order | [optional] 
 **paginationLimit** | **Number**| Non-negative maximum number of entries to return | [optional] 
 **paginationOffset** | **Number**| Non-negative number of entries to skip | [optional] 

### Return type

[**ReportInstanceList**](ReportInstanceList.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getReportGenerationLogs

> ReportInstanceLogList getReportGenerationLogs(tenant, reportInstanceId, opts)

Gets a list of logs for the report instance generation

Gets a list of logs for the generated report instance. Allows the user to sort on log message, type and date. Also allows for retrieving of just the errors &amp; warnings&#39;

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, ReportInstanceApi } = require('@factset/sdk-vermilion');
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

const apiInstance = new ReportInstanceApi();
const tenant = XXXXXXXXXX; // String | The code of the tenancy
const reportInstanceId = 123456789; // String | Used to validate that report file name belongs to the report instance passed
const opts = {
  'errorsOnly': true, // String | If the parameter is set to true the endpoint should return just errors and warnings E.g: errorsOnly=true
  'sort': ["sequenceNumber"], // [String] | The column to sort on. Can add - to sort
  'paginationLimit': 25, // Number | Non-negative maximum number of entries to return
  'paginationOffset': 0 // Number | Non-negative number of entries to skip
};

// Call api endpoint
apiInstance.getReportGenerationLogs(tenant, reportInstanceId, opts).then(
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
 **reportInstanceId** | **String**| Used to validate that report file name belongs to the report instance passed | 
 **errorsOnly** | **String**| If the parameter is set to true the endpoint should return just errors and warnings E.g: errorsOnly&#x3D;true | [optional] 
 **sort** | [**[String]**](String.md)| The column to sort on. Can add - to sort | [optional] 
 **paginationLimit** | **Number**| Non-negative maximum number of entries to return | [optional] 
 **paginationOffset** | **Number**| Non-negative number of entries to skip | [optional] 

### Return type

[**ReportInstanceLogList**](ReportInstanceLogList.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getReportInstanceById

> ReportInstanceData getReportInstanceById(reportInstanceId, tenant)

Gets a report instance based on the ID

Gets a report instance object based on the ID passed

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, ReportInstanceApi } = require('@factset/sdk-vermilion');
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

const apiInstance = new ReportInstanceApi();
const reportInstanceId = 1256789; // String | The ID of the report instance
const tenant = XXXXXXXXXX; // String | The code of the tenancy

// Call api endpoint
apiInstance.getReportInstanceById(reportInstanceId, tenant).then(
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
 **reportInstanceId** | **String**| The ID of the report instance | 
 **tenant** | **String**| The code of the tenancy | 

### Return type

[**ReportInstanceData**](ReportInstanceData.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## startReportGeneration

> ReportInstanceDataResponse startReportGeneration(reportGenerationRequestBody)

Generates a report

Generates a report using the specified ID and the JSON in the request body

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, ReportInstanceApi } = require('@factset/sdk-vermilion');
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

const apiInstance = new ReportInstanceApi();
const reportGenerationRequestBody = {"vrs":{"1":{"report":"MONTHLY_REPORT","tenancy":"CLIENT_REPORTING","outputFormat":"PDF","sectionFilter":"Section One","priority":"2","startDate":"15 December 2023 00:00:00","entitySelection":{"ACCOUNT":{"key":"Account name"},"PORTFOLIO":{"key":"Test fund"},"DATE":{"key":"2020-01-01 00:00:00"}}}}}; // ReportGenerationRequestBody | 

// Call api endpoint
apiInstance.startReportGeneration(reportGenerationRequestBody).then(
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
 **reportGenerationRequestBody** | [**ReportGenerationRequestBody**](ReportGenerationRequestBody.md)|  | 

### Return type

[**ReportInstanceDataResponse**](ReportInstanceDataResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

