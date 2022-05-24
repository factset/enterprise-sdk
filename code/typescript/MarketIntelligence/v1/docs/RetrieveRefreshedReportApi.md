# marketintelligence.RetrieveRefreshedReportApi

All URIs are relative to *https://api.factset.com/market-intelligence*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDataReportIdGet**](RetrieveRefreshedReportApi.md#getDataReportIdGet) | **GET** /get-data/{report_id} | Retrieve data for desired report.



## getDataReportIdGet

> FetchReportPollID getDataReportIdGet(reportId)

Retrieve data for desired report.

Endpoint to retrieve raw data in JSON format for a particular Market Intelligence report. If the report has not been refreshed within the last hour, a pollUrl will be returned which can be used to call the refreshed report. If the report has been refreshed within 1 hour, the report data from the most recent refresh will be returned.

### Example

```javascript
const { ApiClient, RetrieveRefreshedReportApi } = require('@factset/sdk-marketintelligence');
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

const apiInstance = new RetrieveRefreshedReportApi();
const reportId = "reportId_example"; // String | example: 65ba6dd63fb366464646426d0b

// Call api endpoint
apiInstance.getDataReportIdGet(reportId).then(
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
 **reportId** | **String**| example: 65ba6dd63fb366464646426d0b | 

### Return type

[**FetchReportPollID**](FetchReportPollID.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

