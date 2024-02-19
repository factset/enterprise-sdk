# analyticsdatastore.ObjectsApi

All URIs are relative to *https://api.factset.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCargoEndpoint**](ObjectsApi.md#getCargoEndpoint) | **GET** /analytics/pub-datastore/cargo/v1/groups/{groupId}/objects/{objectId} | Gets an object given an ID. In this case ID retrieved from mapping Location header, object data in response body.



## getCargoEndpoint

> getCargoEndpoint(groupId, objectId)

Gets an object given an ID. In this case ID retrieved from mapping Location header, object data in response body.

Raw object data can be found in the response body. This can be either the mapped PDF/PPT or STACH json, depending on the mapping. https://pages.github.factset.com/analytics-reporting/stachschema/#/    Optional request header \&quot;accept-encoding\&quot;, with allowed values of \&quot;br\&quot; and \&quot;gzip\&quot;. If accept-encoding is passed, the response is compressed.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, ObjectsApi } = require('@factset/sdk-analyticsdatastore');
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

const apiInstance = new ObjectsApi();
const groupId = a4186c50f8e74f979d271dd22298c901; // String | The ID of the group
const objectId = fe875bc4150542dea6bc237663a01a0d; // String | The ID of the object

// Call api endpoint
apiInstance.getCargoEndpoint(groupId, objectId).then(
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
 **groupId** | **String**| The ID of the group | 
 **objectId** | **String**| The ID of the object | 

### Return type

null (empty response body)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

