# vault.DatesApi

All URIs are relative to *https://api-sandbox.factset.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**convertVaultDatesToAbsoluteFormat**](DatesApi.md#convertVaultDatesToAbsoluteFormat) | **GET** /analytics/lookups/v2/engines/vault/dates | Convert Vault dates to absolute format



## convertVaultDatesToAbsoluteFormat

> DateParametersSummary convertVaultDatesToAbsoluteFormat(enddate, componentid, account, opts)

Convert Vault dates to absolute format

This endpoint converts the given start and end dates in FactSet date format to yyyymmdd format for a Vault calculation. For more information on FactSet date format, please refer to the Vault API documentation under the &#39;API Documentation&#39; section in the developer portal.

### Example

```javascript
const { ApiClient, DatesApi } = require('@factset/sdk-vault');
const { ConfidentialClient } = require('@factset/sdk-utils');

const apiClient = ApiClient.instance;

// Examples for each supported authentication method are below,
// choose one that satisfies your use case.

// (Preferred) OAuth 2.0: FactSetOAuth2
// See https://github.com/FactSet/enterprise-sdk#oauth-20
// for information on how to create the app-config.json file
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
const enddate = "'-1AY'"; // String | End Date
const componentid = "'7CF4BCEB46020A5D3C78344108905FF73A4937F5E37CFF6BD97EC29545341935'"; // String | Vault Component Id
const account = "'Client:Foo/Bar/myaccount.acct'"; // String | Account
const opts = {
  'startdate': "'-3AY'" // String | Start Date
};

// Call api endpoint
apiInstance.convertVaultDatesToAbsoluteFormat(enddate, componentid, account, opts).then(
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
 **enddate** | **String**| End Date | [default to &#39;-1AY&#39;]
 **componentid** | **String**| Vault Component Id | [default to &#39;7CF4BCEB46020A5D3C78344108905FF73A4937F5E37CFF6BD97EC29545341935&#39;]
 **account** | **String**| Account | [default to &#39;Client:Foo/Bar/myaccount.acct&#39;]
 **startdate** | **String**| Start Date | [optional] [default to &#39;-3AY&#39;]

### Return type

[**DateParametersSummary**](DateParametersSummary.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

