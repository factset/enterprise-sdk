# factsetdebtcapitalstructure.TotalsApi

All URIs are relative to *https://api.factset.com/content/factset-dcs/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDcsTotalsPost**](TotalsApi.md#getDcsTotalsPost) | **POST** /dcs-totals | Retrieves debt instrument totals for specified metrics and date ranges.



## getDcsTotalsPost

> DcsResponse getDcsTotalsPost(dCSRequest)

Retrieves debt instrument totals for specified metrics and date ranges.

Returns debt instruments totals. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, TotalsApi } = require('@factset/sdk-factsetdebtcapitalstructure');
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

const apiInstance = new TotalsApi();
const dCSRequest = new factsetdebtcapitalstructure.DCSRequest(); // DCSRequest | Request object for `DCS Totals`.

// Call api endpoint
apiInstance.getDcsTotalsPost(dCSRequest).then(
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
 **dCSRequest** | [**DCSRequest**](DCSRequest.md)| Request object for &#x60;DCS Totals&#x60;. | 

### Return type

[**DcsResponse**](DcsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

