# marketintelligence.RetrieveReportListApi

All URIs are relative to *https://api.factset.com/market-intelligence*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getReportsGet**](RetrieveReportListApi.md#getReportsGet) | **GET** /get-reports | Retrieve a list of previously created reports and associated report metadata.



## getReportsGet

> GetReportInfo getReportsGet()

Retrieve a list of previously created reports and associated report metadata.

Endpoint to retrieve list of all available Market Intelligence reports for specific User in JSON format.

### Example

```javascript
const { ApiClient, RetrieveReportListApi } = require('@factset/sdk-marketintelligence');
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

const apiInstance = new RetrieveReportListApi();

// Call api endpoint
apiInstance.getReportsGet().then(
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

This endpoint does not need any parameter.

### Return type

[**GetReportInfo**](GetReportInfo.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

