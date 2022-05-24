# publisher.PubCalculationsApi

All URIs are relative to *https://api.factset.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelCalculationById**](PubCalculationsApi.md#cancelCalculationById) | **DELETE** /analytics/engines/pub/v3/calculations/{id} | Cancel Pub calculation by id
[**getCalculationParameters**](PubCalculationsApi.md#getCalculationParameters) | **GET** /analytics/engines/pub/v3/calculations/{id} | Get Pub calculation parameters by id
[**getCalculationStatusById**](PubCalculationsApi.md#getCalculationStatusById) | **GET** /analytics/engines/pub/v3/calculations/{id}/status | Get Pub calculation status by id
[**getCalculationUnitResultById**](PubCalculationsApi.md#getCalculationUnitResultById) | **GET** /analytics/engines/pub/v3/calculations/{id}/units/{unitId}/result | Get Pub calculation result by id
[**postAndCalculate**](PubCalculationsApi.md#postAndCalculate) | **POST** /analytics/engines/pub/v3/calculations | Create and Run Pub calculation
[**putAndCalculate**](PubCalculationsApi.md#putAndCalculate) | **PUT** /analytics/engines/pub/v3/calculations/{id} | Create or Update Pub calculation and run it.



## cancelCalculationById

> cancelCalculationById(id)

Cancel Pub calculation by id

This is the endpoint to cancel a previously submitted calculation.

### Example

```javascript
const { ApiClient, PubCalculationsApi } = require('@factset/sdk-publisher');
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

const apiInstance = new PubCalculationsApi();
const id = "id_example"; // String | from url, provided from the location header in the Create and Run Pub calculation endpoint

// Call api endpoint
apiInstance.cancelCalculationById(id).then(
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
 **id** | **String**| from url, provided from the location header in the Create and Run Pub calculation endpoint | 

### Return type

null (empty response body)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


## getCalculationParameters

> PubCalculationParametersRoot getCalculationParameters(id)

Get Pub calculation parameters by id

This is the endpoint that returns the calculation parameters passed for a calculation.

### Example

```javascript
const { ApiClient, PubCalculationsApi } = require('@factset/sdk-publisher');
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

const apiInstance = new PubCalculationsApi();
const id = "id_example"; // String | from url, provided from the location header in the Create and Run Pub calculation endpoint

// Call api endpoint
apiInstance.getCalculationParameters(id).then(
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
 **id** | **String**| from url, provided from the location header in the Create and Run Pub calculation endpoint | 

### Return type

[**PubCalculationParametersRoot**](PubCalculationParametersRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getCalculationStatusById

> CalculationStatusRoot getCalculationStatusById(id)

Get Pub calculation status by id

This is the endpoint to check on the progress of a previously requested calculation.  If the calculation has finished computing, the result field in the response body will point to the result url.  Otherwise, the calculation is still running and the X-FactSet-Api-PickUp-Progress header will contain a progress percentage.

### Example

```javascript
const { ApiClient, PubCalculationsApi } = require('@factset/sdk-publisher');
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

const apiInstance = new PubCalculationsApi();
const id = "id_example"; // String | from url, provided from the location header in the Create and Run Pub calculation endpoint

// Call api endpoint
apiInstance.getCalculationStatusById(id).then(
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
 **id** | **String**| from url, provided from the location header in the Create and Run Pub calculation endpoint | 

### Return type

[**CalculationStatusRoot**](CalculationStatusRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getCalculationUnitResultById

> ObjectRoot getCalculationUnitResultById(id, unitId, opts)

Get Pub calculation result by id

This is the endpoint to get the result of a previously requested calculation.  If the calculation has finished computing, the body of the response will contain the requested document in the specified format.

### Example

```javascript
const { ApiClient, PubCalculationsApi } = require('@factset/sdk-publisher');
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

const apiInstance = new PubCalculationsApi();
const id = "id_example"; // String | from url, provided from the location header in the Get Pub calculation status by id endpoint
const unitId = "unitId_example"; // String | from url, provided from the location header in the Get Pub calculation status by id endpoint
const opts = {
  'accept': "accept_example" // String | Standard HTTP header. Value can be gzip, compress, deflate, br, identity and/or *
};

// Call api endpoint
apiInstance.getCalculationUnitResultById(id, unitId, opts).then(
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
 **id** | **String**| from url, provided from the location header in the Get Pub calculation status by id endpoint | 
 **unitId** | **String**| from url, provided from the location header in the Get Pub calculation status by id endpoint | 
 **accept** | **String**| Standard HTTP header. Value can be gzip, compress, deflate, br, identity and/or * | [optional] 

### Return type

[**ObjectRoot**](ObjectRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/x-protobuf, application/pdf


## postAndCalculate

> CalculationStatusRoot postAndCalculate(opts)

Create and Run Pub calculation

This endpoint runs the Pub calculation specified in the POST body parameters.  It can take one or more units as input.

### Example

```javascript
const { ApiClient, PubCalculationsApi } = require('@factset/sdk-publisher');
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

const apiInstance = new PubCalculationsApi();
const opts = {
  'xFactSetApiLongRunningDeadline': 56, // Number | Long running deadline in seconds when only one unit is passed in the POST body.
  'cacheControl': "cacheControl_example", // String | Standard HTTP header.  Accepts no-cache, no-store, max-age, max-stale.
  'pubCalculationParametersRoot': new publisher.PubCalculationParametersRoot() // PubCalculationParametersRoot | Calculation Parameters
};

// Call api endpoint
apiInstance.postAndCalculate(opts).then(
  data => {

      // data is a responsewrapper: PostAndCalculateResponseWrapper
      switch (data.statusCode) {

          case 200:
             // CalculationStatusRoot
             console.log(data.getResponse200());
             break;

          case 201:
             // ObjectRoot
             console.log(data.getResponse201());
             break;

          case 202:
             // CalculationStatusRoot
             console.log(data.getResponse202());
             break;

      }

  },
  error => {
    console.error(error);
  },
);

```


### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xFactSetApiLongRunningDeadline** | **Number**| Long running deadline in seconds when only one unit is passed in the POST body. | [optional] 
 **cacheControl** | **String**| Standard HTTP header.  Accepts no-cache, no-store, max-age, max-stale. | [optional] 
 **pubCalculationParametersRoot** | [**PubCalculationParametersRoot**](PubCalculationParametersRoot.md)| Calculation Parameters | [optional] 

### Return type

[**CalculationStatusRoot**](CalculationStatusRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/pdf, application/vnd.openxmlformats-officedocument.presentationml.presentation


## putAndCalculate

> CalculationStatusRoot putAndCalculate(id, opts)

Create or Update Pub calculation and run it.

This endpoint updates and run the Pub calculation specified in the PUT body parameters. This also allows creating new Pub calculations with custom ids.  It can take one or more units as input.    Remarks:    *   Start and and end date must be within the configuration&#39;s min and max date range

### Example

```javascript
const { ApiClient, PubCalculationsApi } = require('@factset/sdk-publisher');
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

const apiInstance = new PubCalculationsApi();
const id = "id_example"; // String | from url, provided from the location header in the Create and Run Pub calculation endpoint
const opts = {
  'xFactSetApiLongRunningDeadline': 56, // Number | Long running deadline in seconds when only one unit is passed in the PUT body.
  'cacheControl': "cacheControl_example", // String | Standard HTTP header.  Accepts no-cache, no-store, max-age, max-stale.
  'pubCalculationParametersRoot': new publisher.PubCalculationParametersRoot() // PubCalculationParametersRoot | Calculation Parameters
};

// Call api endpoint
apiInstance.putAndCalculate(id, opts).then(
  data => {

      // data is a responsewrapper: PutAndCalculateResponseWrapper
      switch (data.statusCode) {

          case 200:
             // CalculationStatusRoot
             console.log(data.getResponse200());
             break;

          case 201:
             // ObjectRoot
             console.log(data.getResponse201());
             break;

          case 202:
             // CalculationStatusRoot
             console.log(data.getResponse202());
             break;

      }

  },
  error => {
    console.error(error);
  },
);

```


### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| from url, provided from the location header in the Create and Run Pub calculation endpoint | 
 **xFactSetApiLongRunningDeadline** | **Number**| Long running deadline in seconds when only one unit is passed in the PUT body. | [optional] 
 **cacheControl** | **String**| Standard HTTP header.  Accepts no-cache, no-store, max-age, max-stale. | [optional] 
 **pubCalculationParametersRoot** | [**PubCalculationParametersRoot**](PubCalculationParametersRoot.md)| Calculation Parameters | [optional] 

### Return type

[**CalculationStatusRoot**](CalculationStatusRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/pdf

