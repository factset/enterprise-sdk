# factsetownership.ShortInterestApi

All URIs are relative to *https://api.factset.com/content/factset-ownership/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getShortInterest**](ShortInterestApi.md#getShortInterest) | **GET** /short-interest | Gets short interest data for a requested identifier.
[**postShortInterest**](ShortInterestApi.md#postShortInterest) | **POST** /short-interest | Gets short interest data for a requested identifier.



## getShortInterest

> ShortInterestResponse getShortInterest(ids, opts)

Gets short interest data for a requested identifier.

Returns short interest data for the specified security, sourced from NYSE, NASDAQ, and TSX exchanges via FactSet. Data is updated semi-monthly on scheduled dates and times in Eastern Time (ET). Note that the exact update dates may vary slightly due to weekends, market holidays, and other calendar adjustments. If the &#x60;years&#x60; parameter is provided, the short interest percentage and float percentage value will be returned as null, since historical data for this value is not available.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, ShortInterestApi } = require('@factset/sdk-factsetownership');
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

const apiInstance = new ShortInterestApi();
const ids = ["VTI-US"]; // [String] | Requested short interest identifier. <p>***id limit** =  1 per request*</p>
const opts = {
  'years': 1 // Number | Number of years of short interest data to include. Specify an integer value from 1 to 10. If the years parameter is provided, the short interest percentage and short interest float percentage will be returned as null, since historical data for this value is not available.
};

// Call api endpoint
apiInstance.getShortInterest(ids, opts).then(
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
 **ids** | [**[String]**](String.md)| Requested short interest identifier. &lt;p&gt;***id limit** &#x3D;  1 per request*&lt;/p&gt; | 
 **years** | **Number**| Number of years of short interest data to include. Specify an integer value from 1 to 10. If the years parameter is provided, the short interest percentage and short interest float percentage will be returned as null, since historical data for this value is not available. | [optional] 

### Return type

[**ShortInterestResponse**](ShortInterestResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## postShortInterest

> ShortInterestResponse postShortInterest(shortInterestRequest)

Gets short interest data for a requested identifier.

Returns short interest data for the specified security, sourced from NYSE, NASDAQ, and TSX exchanges via FactSet. Data is updated semi-monthly on scheduled dates and times in Eastern Time (ET). Note that the exact update dates may vary slightly due to weekends, market holidays, and other calendar adjustments. If the &#x60;years&#x60; parameter is provided, the short interest percentage and float percentage value will be returned as null, since historical data for this value is not available.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, ShortInterestApi } = require('@factset/sdk-factsetownership');
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

const apiInstance = new ShortInterestApi();
const shortInterestRequest = new factsetownership.ShortInterestRequest(); // ShortInterestRequest | Requesting short interest data for securities.

// Call api endpoint
apiInstance.postShortInterest(shortInterestRequest).then(
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
 **shortInterestRequest** | [**ShortInterestRequest**](ShortInterestRequest.md)| Requesting short interest data for securities. | 

### Return type

[**ShortInterestResponse**](ShortInterestResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

