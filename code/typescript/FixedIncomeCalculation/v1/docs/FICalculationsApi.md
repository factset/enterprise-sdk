# fixedincomecalculation.FICalculationsApi

All URIs are relative to *https://api.factset.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelFICalculationById**](FICalculationsApi.md#cancelFICalculationById) | **DELETE** /analytics/engines/fi/v1/calculations/{id} | Cancel FI calculation by id
[**getFICalculationById**](FICalculationsApi.md#getFICalculationById) | **GET** /analytics/engines/fi/v1/calculations/{id} | Get FI calculation by id
[**runFICalculation**](FICalculationsApi.md#runFICalculation) | **POST** /analytics/engines/fi/v1/calculations | Run FI calculation



## cancelFICalculationById

> cancelFICalculationById(id)

Cancel FI calculation by id

This is the endpoint to cancel a previously submitted calculation.  Instead of doing a GET on the polling URL, cancel the request by doing a DELETE.

### Example

```javascript
const { ApiClient, FICalculationsApi } = require('@factset/sdk-fixedincomecalculation');
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

const apiInstance = new FICalculationsApi();
const id = "id_example"; // String | from url, provided from the location header in the Run FI Calculation endpoint

// Call api endpoint
apiInstance.cancelFICalculationById(id).then(
  () => {
    console.log('API called successfully.');
  },
  error => {
    console.error(error);
  },
);

```


### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| from url, provided from the location header in the Run FI Calculation endpoint | 

### Return type

null (empty response body)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## getFICalculationById

> Object getFICalculationById(id)

Get FI calculation by id

This is the endpoint to check on the progress of a previously requested calculation.  If the calculation has finished computing, the body of the response will contain the requested document in JSON.  Otherwise, the calculation is still running and the X-FactSet-Api-PickUp-Progress header will contain a progress percentage.

### Example

```javascript
const { ApiClient, FICalculationsApi } = require('@factset/sdk-fixedincomecalculation');
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

const apiInstance = new FICalculationsApi();
const id = "id_example"; // String | from url, provided from the location header in the Run FI Calculation endpoint

// Call api endpoint
apiInstance.getFICalculationById(id).then(
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
 **id** | **String**| from url, provided from the location header in the Run FI Calculation endpoint | 

### Return type

**Object**

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## runFICalculation

> Object runFICalculation(opts)

Run FI calculation

This endpoint creates a new FI calculation.  This must be used first before get status or cancelling endpoints with a calculation id.  A successful response will contain the resulting FI calculation or a polling URL in location header if the request takes too long.

### Example

```javascript
const { ApiClient, FICalculationsApi } = require('@factset/sdk-fixedincomecalculation');
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

const apiInstance = new FICalculationsApi();
const opts = {
  'xFactSetContentOrganization': "xFactSetContentOrganization_example", // String | FactSet content organization
  'xFactSetContentType': "xFactSetContentType_example", // String | FactSet content type
  'fICalculationParameters': new fixedincomecalculation.FICalculationParameters() // FICalculationParameters | 
};

// Call api endpoint
apiInstance.runFICalculation(opts).then(
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
 **xFactSetContentOrganization** | **String**| FactSet content organization | [optional] 
 **xFactSetContentType** | **String**| FactSet content type | [optional] 
 **fICalculationParameters** | [**FICalculationParameters**](FICalculationParameters.md)|  | [optional] 

### Return type

**Object**

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

