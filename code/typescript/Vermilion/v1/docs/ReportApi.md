# vermilion.ReportApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAllReportDefinitions**](ReportApi.md#getAllReportDefinitions) | **GET** /v1/{tenant}/reports | Gets all report definitions
[**getReportDefinitionByCode**](ReportApi.md#getReportDefinitionByCode) | **GET** /v1/{tenant}/reports/{reportDefinitionCode} | Gets a report definition



## getAllReportDefinitions

> ReportDefinitionList getAllReportDefinitions(tenant, opts)

Gets all report definitions

Gets all report definitions the user has permissions for

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, ReportApi } = require('@factset/sdk-vermilion');
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

const apiInstance = new ReportApi();
const tenant = TENANT; // String | The code of the tenancy
const opts = {
  'sort': ["name"], // [String] | The column to sort on. Can add - to sort
  'paginationLimit': 10, // Number | Non-negative maximum number of entries to return
  'paginationOffset': 0 // Number | Non-negative number of entries to skip
};

// Call api endpoint
apiInstance.getAllReportDefinitions(tenant, opts).then(
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
 **sort** | [**[String]**](String.md)| The column to sort on. Can add - to sort | [optional] 
 **paginationLimit** | **Number**| Non-negative maximum number of entries to return | [optional] [default to 25]
 **paginationOffset** | **Number**| Non-negative number of entries to skip | [optional] [default to 0]

### Return type

[**ReportDefinitionList**](ReportDefinitionList.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getReportDefinitionByCode

> ReportDefinitionData getReportDefinitionByCode(tenant, reportDefinitionCode)

Gets a report definition

Gets a report defintion based on the code specified

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, ReportApi } = require('@factset/sdk-vermilion');
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

const apiInstance = new ReportApi();
const tenant = TENANT; // String | The code of the tenancy
const reportDefinitionCode = RPCODE; // String | The code of the report definition

// Call api endpoint
apiInstance.getReportDefinitionByCode(tenant, reportDefinitionCode).then(
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

