# paengine.CalculationsApi

All URIs are relative to *https://api-sandbox.factset.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelCalculationById**](CalculationsApi.md#cancelCalculationById) | **DELETE** /analytics/engines/v2/calculations/{id} | Cancel calculation by id
[**getCalculationStatusById**](CalculationsApi.md#getCalculationStatusById) | **GET** /analytics/engines/v2/calculations/{id} | Get calculation status by id
[**getCalculationStatusSummaries**](CalculationsApi.md#getCalculationStatusSummaries) | **GET** /analytics/engines/v2/calculations | Get all calculation statuses
[**runCalculation**](CalculationsApi.md#runCalculation) | **POST** /analytics/engines/v2/calculations | Run calculation



## cancelCalculationById

> cancelCalculationById(id)

Cancel calculation by id

This is the endpoint to cancel a previously submitted calculation request.  Instead of doing a GET on the getCalculationById URL, cancel the calculation by doing a DELETE.  All individual calculation units within the calculation will be canceled if they have not already finished.

### Example

```javascript
const { ApiClient, CalculationsApi } = require('@factset/sdk-paengine');
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

const apiInstance = new CalculationsApi();
const id = "id_example"; // String | From url, provided from the location header in the Run Multiple Calculations endpoint.

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
 **id** | **String**| From url, provided from the location header in the Run Multiple Calculations endpoint. | 

### Return type

null (empty response body)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## getCalculationStatusById

> CalculationStatus getCalculationStatusById(id)

Get calculation status by id

This is the endpoint to check on the progress of a previous calculation request.  Response body contains status information of the entire request and each individual calculation unit.

### Example

```javascript
const { ApiClient, CalculationsApi } = require('@factset/sdk-paengine');
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

const apiInstance = new CalculationsApi();
const id = "id_example"; // String | From url, provided from the location header in the Run Multiple Calculations endpoint.

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
 **id** | **String**| From url, provided from the location header in the Run Multiple Calculations endpoint. | 

### Return type

[**CalculationStatus**](CalculationStatus.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getCalculationStatusSummaries

> {String: CalculationStatusSummary} getCalculationStatusSummaries()

Get all calculation statuses

This endpoints returns all active calculation requests.

### Example

```javascript
const { ApiClient, CalculationsApi } = require('@factset/sdk-paengine');
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

const apiInstance = new CalculationsApi();

// Call api endpoint
apiInstance.getCalculationStatusSummaries().then(
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

This endpoint does not need any parameter.

### Return type

[**{String: CalculationStatusSummary}**](CalculationStatusSummary.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## runCalculation

> runCalculation(opts)

Run calculation

This endpoint creates a new calculation and runs the set of calculation units specified in the POST body.  This must be used first before get status or cancelling endpoints with a calculation id.   A successful response will contain the URL to check the status of the calculation request.    Remarks:  * Maximum 500 units allowed across all simultaneous calculations. (Refer API documentation for more information)                * Any settings in POST body will act as a one-time override over the settings saved in the PA/SPAR/Vault template.

### Example

```javascript
const { ApiClient, CalculationsApi } = require('@factset/sdk-paengine');
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

const apiInstance = new CalculationsApi();
const opts = {
  'calculation': {"pa":{"1":{"componentid":"125872E5D836683A3EB09EF8C73D3E1BE854BE4EF6173BAB4BFBB5752788F4E9","accounts":[{"id":"BENCH:SP50","holdingsmode":"B&H"}],"benchmarks":[{"id":"BENCH:R.1000","holdingsmode":"B&H"}],"dates":{"startdate":"20170101","enddate":"20180101","frequency":"Monthly"},"groups":[{"id":"E5DB59F608778844CD784DD5659F65AA8A0A9F63F9E4314B2D92761AF0B1B3D9"}]},"2":{"componentid":"125872E5D836683A3EB09EF8C73D3E1BE854BE4EF6173BAB4BFBB5752788F4E9","accounts":[{"id":"BENCH:SP50","holdingsmode":"B&H"}],"benchmarks":[{"id":"BENCH:R.1000","holdingsmode":"B&H"}],"dates":{"startdate":"20180101","enddate":"20180107","frequency":"Daily"},"groups":[{"id":"E5DB59F608778844CD784DD5659F65AA8A0A9F63F9E4314B2D92761AF0B1B3D9"}],"currencyisocode":"USD"}}} // Calculation | 
};

// Call api endpoint
apiInstance.runCalculation(opts).then(
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
 **calculation** | [**Calculation**](Calculation.md)|  | [optional] 

### Return type

null (empty response body)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined

