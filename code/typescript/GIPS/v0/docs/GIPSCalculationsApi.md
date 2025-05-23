# gips.GIPSCalculationsApi

All URIs are relative to *https://api.factset.com/analytics/engines/gips/v0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelCalculationById**](GIPSCalculationsApi.md#cancelCalculationById) | **DELETE** /calculations/{id} | Cancel GIPS calculation by id
[**gipsGetAllCalculations**](GIPSCalculationsApi.md#gipsGetAllCalculations) | **GET** /calculations | Get all calculations
[**gipsGetCalculationStatusById**](GIPSCalculationsApi.md#gipsGetCalculationStatusById) | **GET** /calculations/{id}/status | Get GIPS calculation status by id
[**gipsGetCalculationUnitResultById**](GIPSCalculationsApi.md#gipsGetCalculationUnitResultById) | **GET** /calculations/{id}/units/{unitId}/result | Get GIPS calculation result by id
[**gipsPostAndCalculate**](GIPSCalculationsApi.md#gipsPostAndCalculate) | **POST** /calculations | Create and Run GIPS calculation



## cancelCalculationById

> cancelCalculationById(id)

Cancel GIPS calculation by id

Use this endpoint to clear calculations from the queue. Note, calculations that are already running cannot be cancelled.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, GIPSCalculationsApi } = require('@factset/sdk-gips');
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

const apiInstance = new GIPSCalculationsApi();
const id = "id_example"; // String | from url, provided from the location header in the Create and Run GIPS calculation endpoint

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
 **id** | **String**| from url, provided from the location header in the Create and Run GIPS calculation endpoint | 

### Return type

null (empty response body)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## gipsGetAllCalculations

> CalculationsSummaryRoot gipsGetAllCalculations(opts)

Get all calculations

This endpoints returns all calculation requests.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, GIPSCalculationsApi } = require('@factset/sdk-gips');
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

const apiInstance = new GIPSCalculationsApi();
const opts = {
  'pageNumber': 1 // Number | Page number to be viewed
};

// Call api endpoint
apiInstance.gipsGetAllCalculations(opts).then(
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
 **pageNumber** | **Number**| Page number to be viewed | [optional] [default to 1]

### Return type

[**CalculationsSummaryRoot**](CalculationsSummaryRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## gipsGetCalculationStatusById

> CalculationStatusRoot gipsGetCalculationStatusById(id)

Get GIPS calculation status by id

This is the endpoint to check on the progress of a previously requested calculation.  If the calculation has finished computing, the location header will point to the result url.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, GIPSCalculationsApi } = require('@factset/sdk-gips');
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

const apiInstance = new GIPSCalculationsApi();
const id = "id_example"; // String | from url, provided from the location header in the Create and Run GIPS calculation endpoint

// Call api endpoint
apiInstance.gipsGetCalculationStatusById(id).then(
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
 **id** | **String**| from url, provided from the location header in the Create and Run GIPS calculation endpoint | 

### Return type

[**CalculationStatusRoot**](CalculationStatusRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## gipsGetCalculationUnitResultById

> FactSetProtobufStachV3StachV3Table gipsGetCalculationUnitResultById(id, unitId)

Get GIPS calculation result by id

This is the endpoint to get the result of a previously requested calculation.  If the calculation has finished computing, the body of the response will contain the requested document in JSON.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, GIPSCalculationsApi } = require('@factset/sdk-gips');
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

const apiInstance = new GIPSCalculationsApi();
const id = "id_example"; // String | from url, provided from the location header in the Get GIPS calculation status by id endpoint
const unitId = "unitId_example"; // String | from url, provided from the location header in the Get GIPS calculation status by id endpoint

// Call api endpoint
apiInstance.gipsGetCalculationUnitResultById(id, unitId).then(
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
 **id** | **String**| from url, provided from the location header in the Get GIPS calculation status by id endpoint | 
 **unitId** | **String**| from url, provided from the location header in the Get GIPS calculation status by id endpoint | 

### Return type

[**FactSetProtobufStachV3StachV3Table**](FactSetProtobufStachV3StachV3Table.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/stach.v3+json, application/json


## gipsPostAndCalculate

> CalculationStatusRoot gipsPostAndCalculate(opts)

Create and Run GIPS calculation

This endpoint runs the GIPS calculation specified in the POST body parameters.  It can take upto 2 units.    Remarks:    * Any settings in POST body will act as a one-time override over the settings saved in the GIPS template.  Use this endpoint to trigger calculation requests.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, GIPSCalculationsApi } = require('@factset/sdk-gips');
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

const apiInstance = new GIPSCalculationsApi();
const opts = {
  'xFactSetApiLongRunningDeadline': 20, // Number | The number of seconds the request will wait before sending back the response. If not provided, 20 will be used as default.
  'cacheControl': max-stale=0, // String | Standard HTTP header.  Accepts max-stale.
  'gIPSCalculationParametersRoot': {"data":{"unit1":{"account":"CLIENT:/FDS_DEMO/GIPS/COMPOSITES/F00000QDFB.ACTM","enddate":"2024-07-25","report":"RET_STAT","viewid":"TIME_SERIES","currencyisocode":"USD"}}} // GIPSCalculationParametersRoot | The request body contains the information needed to run a calculation, e.g. the GIPS composite. See the schema for more details.
};

// Call api endpoint
apiInstance.gipsPostAndCalculate(opts).then(
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
 **xFactSetApiLongRunningDeadline** | **Number**| The number of seconds the request will wait before sending back the response. If not provided, 20 will be used as default. | [optional] 
 **cacheControl** | **String**| Standard HTTP header.  Accepts max-stale. | [optional] 
 **gIPSCalculationParametersRoot** | [**GIPSCalculationParametersRoot**](GIPSCalculationParametersRoot.md)| The request body contains the information needed to run a calculation, e.g. the GIPS composite. See the schema for more details. | [optional] 

### Return type

[**CalculationStatusRoot**](CalculationStatusRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

