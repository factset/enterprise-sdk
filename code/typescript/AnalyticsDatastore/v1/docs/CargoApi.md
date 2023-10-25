# analyticsdatastore.CargoApi

All URIs are relative to *https://api-sandbox.factset.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCargoEndpoint**](CargoApi.md#getCargoEndpoint) | **GET** /analytics/pub-datastore/cargo/v1/groups/{groupId}/objects/{objectId} | Get Cargo endpoint, gets an object given an ID. In this case ID retrieved from Swivel Location header, results in json response body of the report.



## getCargoEndpoint

> [String] getCargoEndpoint(groupId, objectId)

Get Cargo endpoint, gets an object given an ID. In this case ID retrieved from Swivel Location header, results in json response body of the report.

STACH json response documentation: https://pages.github.factset.com/analytics-reporting/stachschema/#/    Optional request header \&quot;accept-encoding\&quot;, with allowed values of \&quot;br\&quot; and \&quot;gzip\&quot;. If accept-encoding is passed, the response is compressed.

### Example

```javascript
const { ApiClient, CargoApi } = require('@factset/sdk-analyticsdatastore');
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

const apiInstance = new CargoApi();
const groupId = "'a4186c50f8e74f979d271dd22298c901'"; // String | The ID of the group
const objectId = "'fe875bc4150542dea6bc237663a01a0d'"; // String | The ID of the object

// Call api endpoint
apiInstance.getCargoEndpoint(groupId, objectId).then(
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
 **groupId** | **String**| The ID of the group | [default to &#39;a4186c50f8e74f979d271dd22298c901&#39;]
 **objectId** | **String**| The ID of the object | [default to &#39;fe875bc4150542dea6bc237663a01a0d&#39;]

### Return type

**[String]**

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

