# vermilion.ReportInstanceApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1ReportInstancesGeneratePost**](ReportInstanceApi.md#v1ReportInstancesGeneratePost) | **POST** /v1/report-instances/generate | Generates a report
[**v1TenantReportInstancesGet**](ReportInstanceApi.md#v1TenantReportInstancesGet) | **GET** /v1/{tenant}/report-instances | Gets a list of report instances
[**v1TenantReportInstancesReportInstanceIdDelete**](ReportInstanceApi.md#v1TenantReportInstancesReportInstanceIdDelete) | **DELETE** /v1/{tenant}/report-instances/{reportInstanceId} | Cancels a report generation
[**v1TenantReportInstancesReportInstanceIdGet**](ReportInstanceApi.md#v1TenantReportInstancesReportInstanceIdGet) | **GET** /v1/{tenant}/report-instances/{reportInstanceId} | Gets a report instance based on the ID
[**v1TenantReportInstancesReportInstanceIdLogsGet**](ReportInstanceApi.md#v1TenantReportInstancesReportInstanceIdLogsGet) | **GET** /v1/{tenant}/report-instances/{reportInstanceId}/logs | Gets a list of logs for the report instance generation
[**v1TenantReportInstancesReportInstanceIdResultsReportFileNameGet**](ReportInstanceApi.md#v1TenantReportInstancesReportInstanceIdResultsReportFileNameGet) | **GET** /v1/{tenant}/report-instances/{reportInstanceId}/results/{reportFileName} | Gets the generated file



## v1ReportInstancesGeneratePost

> ReportInstanceDataResponse v1ReportInstancesGeneratePost(inlineObject)

Generates a report

Generates a report using the specified ID and the JSON in the request body

### Example

```javascript
const { ApiClient, ReportInstanceApi } = require('@factset/sdk-vermilion');
const { ConfidentialClient } = require('@factset/sdk-utils');

const apiClient = ApiClient.instance;

// Examples for each supported authentication method are below,
// choose one that satisfies your use case.

// (Preferred) OAuth 2.0: FactSetOAuth2
// See https://github.com/FactSet/enterprise-sdk#oauth-20
// for information on how to create the app-config.json file
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
const inlineObject = new vermilion.InlineObject(); // InlineObject | 

// Call api endpoint
apiInstance.v1ReportInstancesGeneratePost(inlineObject).then(
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
 **inlineObject** | [**InlineObject**](InlineObject.md)|  | 

### Return type

[**ReportInstanceDataResponse**](ReportInstanceDataResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## v1TenantReportInstancesGet

> ReportInstanceList v1TenantReportInstancesGet(tenant, opts)

Gets a list of report instances

Gets a list of report instances. This can be filtered down further by including query parameters in the URL. For example, a report definition id can be added so the only report instances returned are the ones with a matching id

### Example

```javascript
const { ApiClient, ReportInstanceApi } = require('@factset/sdk-vermilion');
const { ConfidentialClient } = require('@factset/sdk-utils');

const apiClient = ApiClient.instance;

// Examples for each supported authentication method are below,
// choose one that satisfies your use case.

// (Preferred) OAuth 2.0: FactSetOAuth2
// See https://github.com/FactSet/enterprise-sdk#oauth-20
// for information on how to create the app-config.json file
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
const tenant = "tenant_example"; // String | The code of the tenancy
const opts = {
  'reportDefinitionCode': "reportDefinitionCode_example", // String | Acts as a filter for the retrieval process. Filters the report instances that match the report definition code
  'entityCodes': "entityCodes_example", // String | A series of query parameters used to filter the report instances by entity code. E.g: entityCode=DATE&entityCode=SYSTEM_LANG
  'entityKeys': "entityKeys_example", // String | A series of query parameters used to filter the report instances by entity keys. E.g: entityKey=en-gb
  'sectionFilter': "sectionFilter_example", // String | Acts as a filter for the retrieval process. Filters the report instances that match the section filter
  'outputFormat': "outputFormat_example", // String | Acts as a filter for the retrieval process. Filters the report instances that match the output format
  'paginationLimit': 25, // Number | Non-negative maximum number of entries to return
  'paginationOffset': 0 // Number | Non-negative number of entries to skip
};

// Call api endpoint
apiInstance.v1TenantReportInstancesGet(tenant, opts).then(
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
 **paginationLimit** | **Number**| Non-negative maximum number of entries to return | [optional] 
 **paginationOffset** | **Number**| Non-negative number of entries to skip | [optional] 

### Return type

[**ReportInstanceList**](ReportInstanceList.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## v1TenantReportInstancesReportInstanceIdDelete

> v1TenantReportInstancesReportInstanceIdDelete(tenant, reportInstanceId)

Cancels a report generation

Sends a request to cancel a report generation based on the report instance id passed

### Example

```javascript
const { ApiClient, ReportInstanceApi } = require('@factset/sdk-vermilion');
const { ConfidentialClient } = require('@factset/sdk-utils');

const apiClient = ApiClient.instance;

// Examples for each supported authentication method are below,
// choose one that satisfies your use case.

// (Preferred) OAuth 2.0: FactSetOAuth2
// See https://github.com/FactSet/enterprise-sdk#oauth-20
// for information on how to create the app-config.json file
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
const tenant = "tenant_example"; // String | The code of the tenancy
const reportInstanceId = "reportInstanceId_example"; // String | The id of the report instance

// Call api endpoint
apiInstance.v1TenantReportInstancesReportInstanceIdDelete(tenant, reportInstanceId).then(
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


## v1TenantReportInstancesReportInstanceIdGet

> v1TenantReportInstancesReportInstanceIdGet(reportInstanceId, tenant)

Gets a report instance based on the ID

Gets a report instance object based on the ID passed

### Example

```javascript
const { ApiClient, ReportInstanceApi } = require('@factset/sdk-vermilion');
const { ConfidentialClient } = require('@factset/sdk-utils');

const apiClient = ApiClient.instance;

// Examples for each supported authentication method are below,
// choose one that satisfies your use case.

// (Preferred) OAuth 2.0: FactSetOAuth2
// See https://github.com/FactSet/enterprise-sdk#oauth-20
// for information on how to create the app-config.json file
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
const reportInstanceId = "reportInstanceId_example"; // String | The ID of the report instance
const tenant = "tenant_example"; // String | The code of the tenancy

// Call api endpoint
apiInstance.v1TenantReportInstancesReportInstanceIdGet(reportInstanceId, tenant).then(
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
 **reportInstanceId** | **String**| The ID of the report instance | 
 **tenant** | **String**| The code of the tenancy | 

### Return type

null (empty response body)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## v1TenantReportInstancesReportInstanceIdLogsGet

> ReportInstanceLogList v1TenantReportInstancesReportInstanceIdLogsGet(tenant, reportInstanceId, opts)

Gets a list of logs for the report instance generation

Gets a list of logs for the generated report instance. Allows the user to sort on log message, type and date. Also allows for retrieving of just the errors &amp; warnings&#39;

### Example

```javascript
const { ApiClient, ReportInstanceApi } = require('@factset/sdk-vermilion');
const { ConfidentialClient } = require('@factset/sdk-utils');

const apiClient = ApiClient.instance;

// Examples for each supported authentication method are below,
// choose one that satisfies your use case.

// (Preferred) OAuth 2.0: FactSetOAuth2
// See https://github.com/FactSet/enterprise-sdk#oauth-20
// for information on how to create the app-config.json file
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
const tenant = "tenant_example"; // String | The code of the tenancy
const reportInstanceId = "reportInstanceId_example"; // String | Used to validate that report file name belongs to the report instance passed
const opts = {
  'fullLog': "fullLog_example", // String | Determines if the endpoint should return a full set of logs or just the errors and warnings E.g: fullLog=true
  'sort': _sort=sequenceNumber, // String | The column to sort on. Can add - to sort
  'paginationLimit': 25, // Number | Non-negative maximum number of entries to return
  'paginationOffset': 0 // Number | Non-negative number of entries to skip
};

// Call api endpoint
apiInstance.v1TenantReportInstancesReportInstanceIdLogsGet(tenant, reportInstanceId, opts).then(
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
 **fullLog** | **String**| Determines if the endpoint should return a full set of logs or just the errors and warnings E.g: fullLog&#x3D;true | [optional] 
 **sort** | **String**| The column to sort on. Can add - to sort | [optional] 
 **paginationLimit** | **Number**| Non-negative maximum number of entries to return | [optional] 
 **paginationOffset** | **Number**| Non-negative number of entries to skip | [optional] 

### Return type

[**ReportInstanceLogList**](ReportInstanceLogList.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## v1TenantReportInstancesReportInstanceIdResultsReportFileNameGet

> v1TenantReportInstancesReportInstanceIdResultsReportFileNameGet(tenant, reportInstanceId, reportFileName)

Gets the generated file

Get the generated file for a report instance. Users can fetch the generated report once the genration is finished. The report instance id and the report file name are passed in as path paramters

### Example

```javascript
const { ApiClient, ReportInstanceApi } = require('@factset/sdk-vermilion');
const { ConfidentialClient } = require('@factset/sdk-utils');

const apiClient = ApiClient.instance;

// Examples for each supported authentication method are below,
// choose one that satisfies your use case.

// (Preferred) OAuth 2.0: FactSetOAuth2
// See https://github.com/FactSet/enterprise-sdk#oauth-20
// for information on how to create the app-config.json file
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
const tenant = "tenant_example"; // String | The code of the tenancy
const reportInstanceId = "reportInstanceId_example"; // String | Used to validate that report file name belongs to the report instance passed
const reportFileName = "reportFileName_example"; // String | The report file name that has to be retrieved. report file name. E.g: xyz.pdf

// Call api endpoint
apiInstance.v1TenantReportInstancesReportInstanceIdResultsReportFileNameGet(tenant, reportInstanceId, reportFileName).then(
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
 **reportInstanceId** | **String**| Used to validate that report file name belongs to the report instance passed | 
 **reportFileName** | **String**| The report file name that has to be retrieved. report file name. E.g: xyz.pdf | 

### Return type

null (empty response body)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

