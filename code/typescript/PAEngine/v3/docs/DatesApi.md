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
const enddate = "'-1AY'"; // String | End Date
const componentid = "'7CF4BCEB46020A5D3C78344108905FF73A4937F5E37CFF6BD97EC29545341935'"; // String | Component Id
const account = "'Client:Foo/Bar/myaccount.acct'"; // String | Account
const opts = {
  'startdate': "'-3AY'" // String | Start Date
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
 **enddate** | **String**| End Date | [default to &#39;-1AY&#39;]
 **componentid** | **String**| Component Id | [default to &#39;7CF4BCEB46020A5D3C78344108905FF73A4937F5E37CFF6BD97EC29545341935&#39;]
 **account** | **String**| Account | [default to &#39;Client:Foo/Bar/myaccount.acct&#39;]
 **startdate** | **String**| Start Date | [optional] [default to &#39;-3AY&#39;]

### Return type

[**DateParametersSummaryRoot**](DateParametersSummaryRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

