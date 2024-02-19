# marketintelligence.RetrieveRefreshedDataApi

All URIs are relative to *https://api.factset.com/market-intelligence*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDataPollIdResultGet**](RetrieveRefreshedDataApi.md#getDataPollIdResultGet) | **GET** /get-data/{poll_id}/result | Retrieve data for desired report.



## getDataPollIdResultGet

> ReportDataHeader getDataPollIdResultGet(pollId)

Retrieve data for desired report.

Endpoint to retrieve raw data in JSON format for a particular Market Intelligence report.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, RetrieveRefreshedDataApi } = require('@factset/sdk-marketintelligence');
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

const apiInstance = new RetrieveRefreshedDataApi();
const pollId = "pollId_example"; // String | example: 65ba6dd63fb366464646426d0b

// Call api endpoint
apiInstance.getDataPollIdResultGet(pollId).then(
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
 **pollId** | **String**| example: 65ba6dd63fb366464646426d0b | 

### Return type

[**ReportDataHeader**](ReportDataHeader.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

