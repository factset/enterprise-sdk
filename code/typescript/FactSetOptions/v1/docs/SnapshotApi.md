# factsetoptions.SnapshotApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getOptionsSnapshotForList**](SnapshotApi.md#getOptionsSnapshotForList) | **POST** /factset-options/v1/snapshot | Returns all the profile information for the list of identifiers as of a specific date



## getOptionsSnapshotForList

> SnapshotResponse getOptionsSnapshotForList(snapshotRequest)

Returns all the profile information for the list of identifiers as of a specific date

Returns all the profile information for the list of identifiers for a specific date. The data includes -  * Expiration Date * Greek - Delta * Implied Volatility * Price  * Style * Type * Underlying Security * Underlying Security Price * Open Interest * Name    *Currently only OPRA Exchange is supported with exchange ISO \&quot;USA\&quot;* 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, SnapshotApi } = require('@factset/sdk-factsetoptions');
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

const apiInstance = new SnapshotApi();
const snapshotRequest = new factsetoptions.SnapshotRequest(); // SnapshotRequest | Snapshot Request Object

// Call api endpoint
apiInstance.getOptionsSnapshotForList(snapshotRequest).then(
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
 **snapshotRequest** | [**SnapshotRequest**](SnapshotRequest.md)| Snapshot Request Object | 

### Return type

[**SnapshotResponse**](SnapshotResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

