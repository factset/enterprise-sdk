# exchangedatafeedsnapshotapientireexchange.SnapshotApi

All URIs are relative to *https://api.factset.com/bulk-documents/exchange-snapshot*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getV1ListFiles**](SnapshotApi.md#getV1ListFiles) | **GET** /v1/list-files | Snapshot



## getV1ListFiles

> InlineResponse200 getV1ListFiles(product, startDate, endDate, startTime, endTime, opts)

Snapshot

A service that provides access to Real Time or Delayed data snapped at hourly intervals for an entire Exchange

### Example

```javascript
const { ApiClient, SnapshotApi } = require('@factset/sdk-exchangedatafeedsnapshotapientireexchange');
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
const product = 10001; // Number | any product subscribed by client. Minimum value for prod code=9001
const startDate = new Date("2013-10-20"); // Date | YYYYMMDD (Choose between 1 and 4 previous trading days)
const endDate = new Date("2013-10-20"); // Date | YYYYMMDD (Choose between 1 and 4 previous trading days, greater than or equal to start date)
const startTime = "startTime_example"; // String | HHMM (24 hour time EST)
const endTime = "endTime_example"; // String | HHMM (24 hour time EST)
const opts = {
  'access': "'DL'" // String | Option to select from static, DL or RT data
};

// Call api endpoint
apiInstance.getV1ListFiles(product, startDate, endDate, startTime, endTime, opts).then(
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
 **product** | **Number**| any product subscribed by client. Minimum value for prod code&#x3D;9001 | 
 **startDate** | **Date**| YYYYMMDD (Choose between 1 and 4 previous trading days) | 
 **endDate** | **Date**| YYYYMMDD (Choose between 1 and 4 previous trading days, greater than or equal to start date) | 
 **startTime** | **String**| HHMM (24 hour time EST) | 
 **endTime** | **String**| HHMM (24 hour time EST) | 
 **access** | **String**| Option to select from static, DL or RT data | [optional] [default to &#39;DL&#39;]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

