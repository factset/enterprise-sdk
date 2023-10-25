# analyticsdatastore.SwivelApi

All URIs are relative to *https://api-sandbox.factset.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getSwivelEndpoint**](SwivelApi.md#getSwivelEndpoint) | **GET** /analytics/pub-datastore/swivel/v1/{pubDoc}/{assetName}/{reportId}/{tileId}/{accountId} | Get Swivel endpoint, takes report parameter inputs and returns the Cargo location for the specified report via a 302 redirect.



## getSwivelEndpoint

> [String] getSwivelEndpoint(pubDoc, assetName, reportId, tileId, accountId)

Get Swivel endpoint, takes report parameter inputs and returns the Cargo location for the specified report via a 302 redirect.

Note: Due to Swagger UI functionality, the redirect is automatically followed when using &#39;Try it out&#39;, so instead of the 302 Header response, a 200 is returned with the Cargo response Body.

### Example

```javascript
const { ApiClient, SwivelApi } = require('@factset/sdk-analyticsdatastore');
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

const apiInstance = new SwivelApi();
const pubDoc = "'Analytics_Datastore'"; // String | The publisher document containing the report
const assetName = "'ADS_Demo.PA3'"; // String | The PA/SPAR asset name and extension
const reportId = "'report7'"; // String | The PA/SPAR report ID
const tileId = "'tile0'"; // String | The PA/SPAR tile ID
const accountId = "'LARGE_CORE'"; // String | The account ID

// Call api endpoint
apiInstance.getSwivelEndpoint(pubDoc, assetName, reportId, tileId, accountId).then(
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
 **pubDoc** | **String**| The publisher document containing the report | [default to &#39;Analytics_Datastore&#39;]
 **assetName** | **String**| The PA/SPAR asset name and extension | [default to &#39;ADS_Demo.PA3&#39;]
 **reportId** | **String**| The PA/SPAR report ID | [default to &#39;report7&#39;]
 **tileId** | **String**| The PA/SPAR tile ID | [default to &#39;tile0&#39;]
 **accountId** | **String**| The account ID | [default to &#39;LARGE_CORE&#39;]

### Return type

**[String]**

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: headers

