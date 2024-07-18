# sparengine.SPARCalculationsApi

All URIs are relative to *https://api.factset.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelCalculationById**](SPARCalculationsApi.md#cancelCalculationById) | **DELETE** /analytics/engines/spar/v3/calculations/{id} | Cancel SPAR calculation
[**getAllCalculations**](SPARCalculationsApi.md#getAllCalculations) | **GET** /analytics/engines/spar/v3/calculations | Get all calculations
[**getCalculationParameters**](SPARCalculationsApi.md#getCalculationParameters) | **GET** /analytics/engines/spar/v3/calculations/{id} | Get SPAR calculation parameters by id
[**getCalculationStatusById**](SPARCalculationsApi.md#getCalculationStatusById) | **GET** /analytics/engines/spar/v3/calculations/{id}/status | Get SPAR calculation status by id
[**getCalculationUnitResultById**](SPARCalculationsApi.md#getCalculationUnitResultById) | **GET** /analytics/engines/spar/v3/calculations/{id}/units/{unitId}/result | Get SPAR calculation result by id
[**postAndCalculate**](SPARCalculationsApi.md#postAndCalculate) | **POST** /analytics/engines/spar/v3/calculations | Create and Run SPAR calculation
[**putAndCalculate**](SPARCalculationsApi.md#putAndCalculate) | **PUT** /analytics/engines/spar/v3/calculations/{id} | Create or Update SPAR calculation and run it.



## cancelCalculationById

> cancelCalculationById(id)

Cancel SPAR calculation

This is the endpoint to cancel a previously submitted calculation.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, SPARCalculationsApi } = require('@factset/sdk-sparengine');
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

const apiInstance = new SPARCalculationsApi();
const id = 917cc544adbe46f99a33dc4179f3983f; // String | from url, provided from the location header in the Create and Run SPAR calculation endpoint

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
 **id** | **String**| from url, provided from the location header in the Create and Run SPAR calculation endpoint | 

### Return type

null (empty response body)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getAllCalculations

> CalculationsSummaryRoot getAllCalculations(opts)

Get all calculations

This endpoints returns all calculation requests.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, SPARCalculationsApi } = require('@factset/sdk-sparengine');
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

const apiInstance = new SPARCalculationsApi();
const opts = {
  'pageNumber': 1 // Number | 
};

// Call api endpoint
apiInstance.getAllCalculations(opts).then(
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
 **pageNumber** | **Number**|  | [optional] [default to 1]

### Return type

[**CalculationsSummaryRoot**](CalculationsSummaryRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getCalculationParameters

> SPARCalculationParametersRoot getCalculationParameters(id)

Get SPAR calculation parameters by id

This is the endpoint that returns the calculation parameters passed for a calculation.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, SPARCalculationsApi } = require('@factset/sdk-sparengine');
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

const apiInstance = new SPARCalculationsApi();
const id = 917cc544adbe46f99a33dc4179f3983d; // String | from url, provided from the location header in the Create and Run SPAR calculation endpoint

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
 **id** | **String**| from url, provided from the location header in the Create and Run SPAR calculation endpoint | 

### Return type

[**SPARCalculationParametersRoot**](SPARCalculationParametersRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getCalculationStatusById

> CalculationStatusRoot getCalculationStatusById(id)

Get SPAR calculation status by id

This is the endpoint to check on the progress of a previously requested calculation.  If the calculation has finished computing, the location header will point to the result url.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, SPARCalculationsApi } = require('@factset/sdk-sparengine');
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

const apiInstance = new SPARCalculationsApi();
const id = 917cc544adbe46f99a33dc4179f3983f; // String | from url, provided from the location header in the Create and Run SPAR calculation endpoint

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
 **id** | **String**| from url, provided from the location header in the Create and Run SPAR calculation endpoint | 

### Return type

[**CalculationStatusRoot**](CalculationStatusRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getCalculationUnitResultById

> ObjectRoot getCalculationUnitResultById(id, unitId)

Get SPAR calculation result by id

This is the endpoint to get the result of a previously requested calculation.  If the calculation has finished computing, the body of the response will contain the requested document in JSON.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, SPARCalculationsApi } = require('@factset/sdk-sparengine');
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

const apiInstance = new SPARCalculationsApi();
const id = 917cc544adbe46f99a33dc4179f3983f; // String | from url, provided from the location header in the Get SPAR calculation status by id endpoint
const unitId = 1; // String | from url, provided from the location header in the Get SPAR calculation status by id endpoint

// Call api endpoint
apiInstance.getCalculationUnitResultById(id, unitId).then(
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
 **id** | **String**| from url, provided from the location header in the Get SPAR calculation status by id endpoint | 
 **unitId** | **String**| from url, provided from the location header in the Get SPAR calculation status by id endpoint | 

### Return type

[**ObjectRoot**](ObjectRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/x-protobuf


## postAndCalculate

> CalculationStatusRoot postAndCalculate(opts)

Create and Run SPAR calculation

This endpoint runs the SPAR calculation specified in the POST body parameters.  It can take one or more units as input.    Remarks:    * Any settings in POST body will act as a one-time override over the settings saved in the SPAR template.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, SPARCalculationsApi } = require('@factset/sdk-sparengine');
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

const apiInstance = new SPARCalculationsApi();
const opts = {
  'xFactSetApiLongRunningDeadline': 10, // Number | Long running deadline in seconds when only one unit is passed in the POST body. Example value is set to 10s. Please update it as per requirement before triggering a calculation.
  'cacheControl': "cacheControl_example", // String | Standard HTTP header.  Accepts max-stale.
  'sPARCalculationParametersRoot': {"data":{"1":{"componentid":"067F5DE2E2A11F9AD734594AA8957E11B633438D0FADFCCE0F423ABEF2FC5F1D","accounts":[{"id":"R.1000","returntype":"GTR","prefix":"RUSSELL"},{"id":"R.2000","returntype":"GTR","prefix":"RUSSELL"}],"benchmark":{"id":"R.2000","returntype":"GTR","prefix":"RUSSELL"},"dates":{"startdate":"-3M","enddate":"0","frequency":"Monthly"}}},"meta":{"stachContentOrganization":"SimplifiedRow","format":"JsonStach"}} // SPARCalculationParametersRoot | Calculation Parameters
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
 **xFactSetApiLongRunningDeadline** | **Number**| Long running deadline in seconds when only one unit is passed in the POST body. Example value is set to 10s. Please update it as per requirement before triggering a calculation. | [optional] 
 **cacheControl** | **String**| Standard HTTP header.  Accepts max-stale. | [optional] 
 **sPARCalculationParametersRoot** | [**SPARCalculationParametersRoot**](SPARCalculationParametersRoot.md)| Calculation Parameters | [optional] 

### Return type

[**CalculationStatusRoot**](CalculationStatusRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/x-protobuf


## putAndCalculate

> CalculationStatusRoot putAndCalculate(id, opts)

Create or Update SPAR calculation and run it.

This endpoint updates and run the SPAR calculation specified in the PUT body parameters. This also allows creating new SPAR calculations with custom ids.  It can take one or more units as input.    Remarks:    * Any settings in PUT body will act as a one-time override over the settings saved in the SPAR template.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, SPARCalculationsApi } = require('@factset/sdk-sparengine');
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

const apiInstance = new SPARCalculationsApi();
const id = e257350ec6cd46ee8a42db79a4ae84d0; // String | from url, provided from the location header in the Create and Run SPAR calculation endpoint
const opts = {
  'xFactSetApiLongRunningDeadline': 10, // Number | Long running deadline in seconds when only one unit is passed in the PUT body. Example value is set to 10s. Please update it as per requirement before triggering a calculation.
  'cacheControl': "cacheControl_example", // String | Standard HTTP header.  Accepts max-stale.
  'sPARCalculationParametersRoot': {"data":{"1":{"componentid":"067F5DE2E2A11F9AD734594AA8957E11B633438D0FADFCCE0F423ABEF2FC5F1D","accounts":[{"id":"R.1000","returntype":"GTR","prefix":"RUSSELL"},{"id":"R.2000","returntype":"GTR","prefix":"RUSSELL"}],"benchmark":{"id":"R.2000","returntype":"GTR","prefix":"RUSSELL"},"dates":{"startdate":"-3M","enddate":"0","frequency":"Monthly"}}},"meta":{"stachContentOrganization":"SimplifiedRow","format":"JsonStach"}} // SPARCalculationParametersRoot | Calculation Parameters
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
 **id** | **String**| from url, provided from the location header in the Create and Run SPAR calculation endpoint | 
 **xFactSetApiLongRunningDeadline** | **Number**| Long running deadline in seconds when only one unit is passed in the PUT body. Example value is set to 10s. Please update it as per requirement before triggering a calculation. | [optional] 
 **cacheControl** | **String**| Standard HTTP header.  Accepts max-stale. | [optional] 
 **sPARCalculationParametersRoot** | [**SPARCalculationParametersRoot**](SPARCalculationParametersRoot.md)| Calculation Parameters | [optional] 

### Return type

[**CalculationStatusRoot**](CalculationStatusRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/x-protobuf

