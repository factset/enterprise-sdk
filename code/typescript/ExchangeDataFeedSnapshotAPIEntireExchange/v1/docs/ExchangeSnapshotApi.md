# exchangedatafeedsnapshotapientireexchange.ExchangeSnapshotApi

All URIs are relative to *https://api.factset.com/bulk-documents/exchange-snapshot/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getListFiles**](ExchangeSnapshotApi.md#getListFiles) | **GET** /list-files | List Files service returns downloadable Real Time, Delayed or Static Exchange Snapshot files for a specified product, date range, and time range



## getListFiles

> EntireExchangeSnapshotResponse getListFiles(product, startDate, endDate, startTime, endTime, opts)

List Files service returns downloadable Real Time, Delayed or Static Exchange Snapshot files for a specified product, date range, and time range

A service that provides access to Real Time or Delayed data snapped at hourly intervals for an entire Exchange

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, ExchangeSnapshotApi } = require('@factset/sdk-exchangedatafeedsnapshotapientireexchange');
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

const apiInstance = new ExchangeSnapshotApi();
const product = 10001; // Number | any product subscribed by client
const startDate = new Date("2013-10-20"); // Date | YYYYMMDD (Choose between 1 and 4 previous trading days). Also accepts `start_date` (snake_case), which is deprecated and exists for backward compatibility.
const endDate = new Date("2013-10-20"); // Date | YYYYMMDD (Choose between 1 and 4 previous trading days, greater than or equal to start date). Also accepts `end_date` (snake_case), which is deprecated and exists for backward compatibility.
const startTime = "startTime_example"; // String | HHMM (24 hour time EST). Also accepts `start_time` (snake_case), which is deprecated and exists for backward compatibility.
const endTime = "endTime_example"; // String | HHMM (24 hour time EST). Also accepts `end_time` (snake_case), which is deprecated and exists for backward compatibility.
const opts = {
  'access': "'DL'" // String | Option to select from static, DL or RT data
};

// Call api endpoint
apiInstance.getListFiles(product, startDate, endDate, startTime, endTime, opts).then(
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
 **product** | **Number**| any product subscribed by client | 
 **startDate** | **Date**| YYYYMMDD (Choose between 1 and 4 previous trading days). Also accepts &#x60;start_date&#x60; (snake_case), which is deprecated and exists for backward compatibility. | 
 **endDate** | **Date**| YYYYMMDD (Choose between 1 and 4 previous trading days, greater than or equal to start date). Also accepts &#x60;end_date&#x60; (snake_case), which is deprecated and exists for backward compatibility. | 
 **startTime** | **String**| HHMM (24 hour time EST). Also accepts &#x60;start_time&#x60; (snake_case), which is deprecated and exists for backward compatibility. | 
 **endTime** | **String**| HHMM (24 hour time EST). Also accepts &#x60;end_time&#x60; (snake_case), which is deprecated and exists for backward compatibility. | 
 **access** | **String**| Option to select from static, DL or RT data | [optional] [default to &#39;DL&#39;]

### Return type

[**EntireExchangeSnapshotResponse**](EntireExchangeSnapshotResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, text/plain

