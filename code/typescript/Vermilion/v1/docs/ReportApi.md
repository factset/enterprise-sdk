# vermilion.ReportApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1TenantReportsGet**](ReportApi.md#v1TenantReportsGet) | **GET** /v1/{tenant}/reports | Gets all report definitions
[**v1TenantReportsReportDefinitionCodeGet**](ReportApi.md#v1TenantReportsReportDefinitionCodeGet) | **GET** /v1/{tenant}/reports/{reportDefinitionCode} | Gets a report definition



## v1TenantReportsGet

> [ReportDefinitionList] v1TenantReportsGet(tenant, opts)

Gets all report definitions

Gets all report definitions the user has permissions for

### Example

```javascript
const { ApiClient, ReportApi } = require('@factset/sdk-vermilion');
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

const apiInstance = new ReportApi();
const tenant = "tenant_example"; // String | The code of the tenancy
const opts = {
  'sort': _sort=name, // String | The column to sort on. Can add - to sort
  'paginationLimit': 25, // Number | Non-negative maximum number of entries to return
  'paginationOffset': 0 // Number | Non-negative number of entries to skip
};

// Call api endpoint
apiInstance.v1TenantReportsGet(tenant, opts).then(
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
 **sort** | **String**| The column to sort on. Can add - to sort | [optional] 
 **paginationLimit** | **Number**| Non-negative maximum number of entries to return | [optional] 
 **paginationOffset** | **Number**| Non-negative number of entries to skip | [optional] 

### Return type

[**[ReportDefinitionList]**](ReportDefinitionList.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## v1TenantReportsReportDefinitionCodeGet

> ReportDefinitionData v1TenantReportsReportDefinitionCodeGet(tenant, reportDefinitionCode)

Gets a report definition

Gets a report defintion based on the code specified

### Example

```javascript
const { ApiClient, ReportApi } = require('@factset/sdk-vermilion');
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

const apiInstance = new ReportApi();
const tenant = "tenant_example"; // String | The code of the tenancy
const reportDefinitionCode = "reportDefinitionCode_example"; // String | The code of the report definition

// Call api endpoint
apiInstance.v1TenantReportsReportDefinitionCodeGet(tenant, reportDefinitionCode).then(
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
 **reportDefinitionCode** | **String**| The code of the report definition | 

### Return type

[**ReportDefinitionData**](ReportDefinitionData.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

