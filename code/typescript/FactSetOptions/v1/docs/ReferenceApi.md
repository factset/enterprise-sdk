# factsetoptions.ReferenceApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getOptionsDatesForList**](ReferenceApi.md#getOptionsDatesForList) | **POST** /factset-options/v1/dates | Returns option security dates such as expiration and trade.
[**getOptionsReferencesForList**](ReferenceApi.md#getOptionsReferencesForList) | **POST** /factset-options/v1/references | Returns basic reference details for the options such as currency, exchange, symbols, flags and more



## getOptionsDatesForList

> OptionsDatesResponse getOptionsDatesForList(optionsDatesRequest)

Returns option security dates such as expiration and trade.

Returns all relevant dates such as  for the specified Option identifier. Data Items include -  * Expiration Date * First Dates for Ask, Bid, Settlement, and Trade * Last Dates for Ask, Bid, Settlement, and Trade    *Currently only OPRA Exchange is supported with exchange ISO \&quot;USA\&quot;* 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, ReferenceApi } = require('@factset/sdk-factsetoptions');
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

const apiInstance = new ReferenceApi();
const optionsDatesRequest = new factsetoptions.OptionsDatesRequest(); // OptionsDatesRequest | 

// Call api endpoint
apiInstance.getOptionsDatesForList(optionsDatesRequest).then(
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
 **optionsDatesRequest** | [**OptionsDatesRequest**](OptionsDatesRequest.md)|  | 

### Return type

[**OptionsDatesResponse**](OptionsDatesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## getOptionsReferencesForList

> OptionsReferencesResponse getOptionsReferencesForList(optionsReferencesRequest)

Returns basic reference details for the options such as currency, exchange, symbols, flags and more

Returns basic reference details for the options. Data items include -  * Name * Exchange * Call or Put Flag * Call or Put Pair Symbol * Other symbols such as OPRA17 and OCC21 * Currency * Underlying Security Symbols * Expiration Month, Dates, and Frequency  *For details or definitions of all available response fields visit the associated schema.*    *Currently only OPRA Exchange is supported with exchange ISO \&quot;USA\&quot;* 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, ReferenceApi } = require('@factset/sdk-factsetoptions');
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

const apiInstance = new ReferenceApi();
const optionsReferencesRequest = new factsetoptions.OptionsReferencesRequest(); // OptionsReferencesRequest | Options Reference Request Body

// Call api endpoint
apiInstance.getOptionsReferencesForList(optionsReferencesRequest).then(
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
 **optionsReferencesRequest** | [**OptionsReferencesRequest**](OptionsReferencesRequest.md)| Options Reference Request Body | 

### Return type

[**OptionsReferencesResponse**](OptionsReferencesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

