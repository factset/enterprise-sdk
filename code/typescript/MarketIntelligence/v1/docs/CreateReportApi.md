# marketintelligence.CreateReportApi

All URIs are relative to *https://api.factset.com/market-intelligence*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createPost**](CreateReportApi.md#createPost) | **POST** /create | Create new report templates including portfolio or market news and data.



## createPost

> PostResponseInfo createPost(mIAPIPostRequest)

Create new report templates including portfolio or market news and data.

Endpoint to create a new Market Intelligence report. If you want to retrieve a report you created, use get-reports call mentioned below.

### Example

```javascript
const { ApiClient, CreateReportApi } = require('@factset/sdk-marketintelligence');
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

const apiInstance = new CreateReportApi();
const mIAPIPostRequest = new marketintelligence.MIAPIPostRequest(); // MIAPIPostRequest | 

// Call api endpoint
apiInstance.createPost(mIAPIPostRequest).then(
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
 **mIAPIPostRequest** | [**MIAPIPostRequest**](MIAPIPostRequest.md)|  | 

### Return type

[**PostResponseInfo**](PostResponseInfo.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

