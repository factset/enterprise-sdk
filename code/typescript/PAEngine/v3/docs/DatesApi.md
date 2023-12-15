# paengine.DatesApi

All URIs are relative to *https://api.factset.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**convertPADatesToAbsoluteFormat**](DatesApi.md#convertPADatesToAbsoluteFormat) | **GET** /analytics/engines/pa/v3/dates | Convert PA dates to absolute format



## convertPADatesToAbsoluteFormat

> DateParametersSummaryRoot convertPADatesToAbsoluteFormat(enddate, componentid, account, opts)

Convert PA dates to absolute format

This endpoint converts the given start and end dates in FactSet date format to yyyymmdd format for a PA calculation. For more information on FactSet date format, please refer to the PA Engine API documentation under the &#39;API Documentation&#39; section in the developer portal.

### Example

```javascript
const { ApiClient, DatesApi } = require('@factset/sdk-paengine');
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

const apiInstance = new DatesApi();
const enddate = -1AY; // String | End Date
const componentid = 801B800245E468A52AEBEC4BE31CFF5AF82F371DAEF5F158AC2E98C2FA324B46; // String | Component Id
const account = Client:/Folder1/Folder2/AccountName.ACCT; // String | Account ( Account Name ending with .ACCT or .ACTM )
const opts = {
  'startdate': -3AY // String | Start Date
};

// Call api endpoint
apiInstance.convertPADatesToAbsoluteFormat(enddate, componentid, account, opts).then(
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
 **enddate** | **String**| End Date | 
 **componentid** | **String**| Component Id | 
 **account** | **String**| Account ( Account Name ending with .ACCT or .ACTM ) | 
 **startdate** | **String**| Start Date | [optional] 

### Return type

[**DateParametersSummaryRoot**](DateParametersSummaryRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

