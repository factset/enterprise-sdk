# vault.DatesApi

All URIs are relative to *https://api.factset.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**convertVaultDatesToAbsoluteFormat**](DatesApi.md#convertVaultDatesToAbsoluteFormat) | **GET** /analytics/engines/vault/v3/dates | Convert Vault dates to absolute format



## convertVaultDatesToAbsoluteFormat

> DateParametersSummaryRoot convertVaultDatesToAbsoluteFormat(enddate, componentid, account, opts)

Convert Vault dates to absolute format

This endpoint converts the given start and end dates in FactSet date format to yyyymmdd format for a Vault calculation. For more information on FactSet date format, please refer to the Vault API documentation under the &#39;API Documentation&#39; section in the developer portal.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, DatesApi } = require('@factset/sdk-vault');
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
const enddate = "enddate_example"; // String | End Date
const componentid = "componentid_example"; // String | Vault Component Id
const account = "account_example"; // String | Account
const opts = {
  'startdate': "startdate_example" // String | Start Date
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
 **enddate** | **String**| End Date | 
 **componentid** | **String**| Vault Component Id | 
 **account** | **String**| Account | 
 **startdate** | **String**| Start Date | [optional] 

### Return type

[**DateParametersSummaryRoot**](DateParametersSummaryRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

