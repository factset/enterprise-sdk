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

```javascript
const { ApiClient, DatesApi } = require('@factset/sdk-vault');
const { ConfidentialClient } = require('@factset/sdk-utils');

const apiClient = ApiClient.instance;

// Configure HTTP basic authorization: FactSetApiKey
const FactSetApiKey = apiClient.authentications['FactSetApiKey'];
FactSetApiKey.username = 'YOUR USERNAME';
FactSetApiKey.password = 'YOUR PASSWORD';

// Configure OAuth2 access token for authorization: FactSetOAuth2
const FactSetOAuth2 = apiClient.authentications['FactSetOAuth2'];
FactSetOAuth2.accessToken = 'YOUR ACCESS TOKEN';

// Configure OAuth2 access with ConfidentialClient
apiClient.factsetOauth2Client = new ConfidentialClient('./config.json');

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

