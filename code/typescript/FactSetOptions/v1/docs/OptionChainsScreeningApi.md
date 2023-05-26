# factsetoptions.OptionChainsScreeningApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getOptionsChainsForList**](OptionChainsScreeningApi.md#getOptionsChainsForList) | **POST** /factset-options/v1/chains | Returns all the underlying option identifiers for the specified underlying Security identifier
[**getOptionsScreeningForList**](OptionChainsScreeningApi.md#getOptionsScreeningForList) | **POST** /factset-options/v1/option-screening | Returns all the option identifiers based on the conditions provided as input in the request



## getOptionsChainsForList

> ChainsResponse getOptionsChainsForList(chainsRequest)

Returns all the underlying option identifiers for the specified underlying Security identifier

Returns all the underlying option identifiers for the underlying security identifier. Specify the date and or exhcange for the list of options associated to the id.     *Currently only OPRA Exchange is supported with exchange ISO \&quot;USA\&quot;* 

### Example

```javascript
const { ApiClient, OptionChainsScreeningApi } = require('@factset/sdk-factsetoptions');
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

const apiInstance = new OptionChainsScreeningApi();
const chainsRequest = new factsetoptions.ChainsRequest(); // ChainsRequest | Options Chains Request Object

// Call api endpoint
apiInstance.getOptionsChainsForList(chainsRequest).then(
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
 **chainsRequest** | [**ChainsRequest**](ChainsRequest.md)| Options Chains Request Object | 

### Return type

[**ChainsResponse**](ChainsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## getOptionsScreeningForList

> OptionScreeningResponse getOptionsScreeningForList(optionScreeningRequest)

Returns all the option identifiers based on the conditions provided as input in the request

Returns all the option identifiers based on the conditions provided as input in the request. Conditions are as follows and will follow \&quot;AND\&quot; logic if more than one condition is applied and allows up to **three conditions** using AND Logic.If a condition is used the accompanying value MUST be used -  |conditions|description| |---|---| |P_OPT_UNDERLYING_SECURITY_E|Underlying Security Equal To| |P_OPT_STRIKE_PRICE_E|Strike Price Equal To| |P_OPT_EXP_DATEN_E|Expiration Date (YYYYMMDD) Equal To| |P_OPT_VOLUME_G|Volume Greater Than| |P_OPT_VOLUME_GE|Volume Greater Than or Equal To| |P_OPT_VOLUME_L|Volume Less Than| |P_OPT_VOLUME_LE|Volume Less Than or Equal To| |P_OPT_VOLUME_E|Volume Equal To| |P_OPT_OPTION_TYPE_E|Option Type (1&#x3D; Equity, 2&#x3D;Index)| |P_OPT_CALL_OR_PUT_E|Call or Put (0&#x3D;Call, 1&#x3D;Put)|    *Currently only OPRA Exchange is supported with exchange ISO \&quot;USA\&quot;* 

### Example

```javascript
const { ApiClient, OptionChainsScreeningApi } = require('@factset/sdk-factsetoptions');
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

const apiInstance = new OptionChainsScreeningApi();
const optionScreeningRequest = new factsetoptions.OptionScreeningRequest(); // OptionScreeningRequest | Option Screening Request. Example request asks for Put Options where Underlying Security is AAPL and Volume is greater than 0 as of 2021-03-31.  

// Call api endpoint
apiInstance.getOptionsScreeningForList(optionScreeningRequest).then(
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
 **optionScreeningRequest** | [**OptionScreeningRequest**](OptionScreeningRequest.md)| Option Screening Request. Example request asks for Put Options where Underlying Security is AAPL and Volume is greater than 0 as of 2021-03-31.   | 

### Return type

[**OptionScreeningResponse**](OptionScreeningResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

