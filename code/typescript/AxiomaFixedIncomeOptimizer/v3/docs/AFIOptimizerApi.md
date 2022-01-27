# axiomafixedincomeoptimizer.AFIOptimizerApi

All URIs are relative to *https://api.factset.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelOptimizationById**](AFIOptimizerApi.md#cancelOptimizationById) | **DELETE** /analytics/engines/afi/v3/optimizations/{id} | Cancel AFI optimization by id
[**getOptimizationParameters**](AFIOptimizerApi.md#getOptimizationParameters) | **GET** /analytics/engines/afi/v3/optimizations/{id} | Get AFI optimization parameters by id
[**getOptimizationResult**](AFIOptimizerApi.md#getOptimizationResult) | **GET** /analytics/engines/afi/v3/optimizations/{id}/result | Get AFI optimization result by id
[**getOptimizationStatusById**](AFIOptimizerApi.md#getOptimizationStatusById) | **GET** /analytics/engines/afi/v3/optimizations/{id}/status | Get AFI optimization status by id
[**postAndOptimize**](AFIOptimizerApi.md#postAndOptimize) | **POST** /analytics/engines/afi/v3/optimizations | Create and Run AFI optimization
[**putAndOptimize**](AFIOptimizerApi.md#putAndOptimize) | **PUT** /analytics/engines/afi/v3/optimizations/{id} | Create or Update AFI optimization and run it.



## cancelOptimizationById

> cancelOptimizationById(id)

Cancel AFI optimization by id

This is the endpoint to cancel a previously submitted optimization.

### Example

```javascript
const { ApiClient, AFIOptimizerApi } = require('@factset/sdk-axiomafixedincomeoptimizer');
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

const apiInstance = new AFIOptimizerApi();
const id = "id_example"; // String | from url, provided from the location header in the Create and Run AFI optimization endpoint

// Call api endpoint
apiInstance.cancelOptimizationById(id).then(
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
 **id** | **String**| from url, provided from the location header in the Create and Run AFI optimization endpoint | 

### Return type

null (empty response body)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


## getOptimizationParameters

> AFIOptimizationParametersRoot getOptimizationParameters(id)

Get AFI optimization parameters by id

This is the endpoint that returns the optimization parameters passed for an optimization.

### Example

```javascript
const { ApiClient, AFIOptimizerApi } = require('@factset/sdk-axiomafixedincomeoptimizer');
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

const apiInstance = new AFIOptimizerApi();
const id = "id_example"; // String | from url, provided from the location header in the Create and Run AFI optimization endpoint

// Call api endpoint
apiInstance.getOptimizationParameters(id).then(
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
 **id** | **String**| from url, provided from the location header in the Create and Run AFI optimization endpoint | 

### Return type

[**AFIOptimizationParametersRoot**](AFIOptimizationParametersRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getOptimizationResult

> ObjectRoot getOptimizationResult(id)

Get AFI optimization result by id

This is the endpoint to get the result of a previously requested optimization.

### Example

```javascript
const { ApiClient, AFIOptimizerApi } = require('@factset/sdk-axiomafixedincomeoptimizer');
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

const apiInstance = new AFIOptimizerApi();
const id = "id_example"; // String | from url, provided from the location header in the Get AFI optimization status by id endpoint

// Call api endpoint
apiInstance.getOptimizationResult(id).then(
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
 **id** | **String**| from url, provided from the location header in the Get AFI optimization status by id endpoint | 

### Return type

[**ObjectRoot**](ObjectRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getOptimizationStatusById

> ObjectRoot getOptimizationStatusById(id)

Get AFI optimization status by id

This is the endpoint to check on the progress of a previously requested optimization.  If the optimization has finished computing, the body of the response will contain result in JSON.  Otherwise, the optimization is still running and the X-FactSet-Api-PickUp-Progress header will contain a progress percentage.

### Example

```javascript
const { ApiClient, AFIOptimizerApi } = require('@factset/sdk-axiomafixedincomeoptimizer');
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

const apiInstance = new AFIOptimizerApi();
const id = "id_example"; // String | from url, provided from the location header in the Create and Run AFI optimization endpoint

// Call api endpoint
apiInstance.getOptimizationStatusById(id).then(
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
 **id** | **String**| from url, provided from the location header in the Create and Run AFI optimization endpoint | 

### Return type

[**ObjectRoot**](ObjectRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## postAndOptimize

> ObjectRoot postAndOptimize(opts)

Create and Run AFI optimization

This endpoint creates and runs AFI optimization specified in the POST body parameters.                Remarks:                * Any settings in POST body will act as a one-time override over the settings saved in the strategy document.

### Example

```javascript
const { ApiClient, AFIOptimizerApi } = require('@factset/sdk-axiomafixedincomeoptimizer');
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

const apiInstance = new AFIOptimizerApi();
const opts = {
  'xFactSetApiLongRunningDeadline': 56, // Number | Long running deadline in seconds.
  'cacheControl': "cacheControl_example", // String | Standard HTTP header.  Accepts max-stale.
  'aFIOptimizationParametersRoot': new axiomafixedincomeoptimizer.AFIOptimizationParametersRoot() // AFIOptimizationParametersRoot | Optimization Parameters
};

// Call api endpoint
apiInstance.postAndOptimize(opts).then(
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
 **xFactSetApiLongRunningDeadline** | **Number**| Long running deadline in seconds. | [optional] 
 **cacheControl** | **String**| Standard HTTP header.  Accepts max-stale. | [optional] 
 **aFIOptimizationParametersRoot** | [**AFIOptimizationParametersRoot**](AFIOptimizationParametersRoot.md)| Optimization Parameters | [optional] 

### Return type

[**ObjectRoot**](ObjectRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## putAndOptimize

> ObjectRoot putAndOptimize(id, opts)

Create or Update AFI optimization and run it.

This endpoint updates and run the AFI optimization specified in the PUT body parameters. It also allows the creation of new AFI optimization with custom id.

### Example

```javascript
const { ApiClient, AFIOptimizerApi } = require('@factset/sdk-axiomafixedincomeoptimizer');
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

const apiInstance = new AFIOptimizerApi();
const id = "id_example"; // String | from url, provided from the location header in the Create and Run AFI optimization endpoint
const opts = {
  'xFactSetApiLongRunningDeadline': 56, // Number | Long running deadline in seconds.
  'cacheControl': "cacheControl_example", // String | Standard HTTP header.  Accepts max-stale.
  'aFIOptimizationParametersRoot': new axiomafixedincomeoptimizer.AFIOptimizationParametersRoot() // AFIOptimizationParametersRoot | Optimization Parameters
};

// Call api endpoint
apiInstance.putAndOptimize(id, opts).then(
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
 **id** | **String**| from url, provided from the location header in the Create and Run AFI optimization endpoint | 
 **xFactSetApiLongRunningDeadline** | **Number**| Long running deadline in seconds. | [optional] 
 **cacheControl** | **String**| Standard HTTP header.  Accepts max-stale. | [optional] 
 **aFIOptimizationParametersRoot** | [**AFIOptimizationParametersRoot**](AFIOptimizationParametersRoot.md)| Optimization Parameters | [optional] 

### Return type

[**ObjectRoot**](ObjectRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

