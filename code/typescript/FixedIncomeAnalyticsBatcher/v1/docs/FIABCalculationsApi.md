# fixedincomeanalyticsbatcher.FIABCalculationsApi

All URIs are relative to *https://api.factset.com/analytics/engines/fiab/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getFIABCalculationById**](FIABCalculationsApi.md#getFIABCalculationById) | **GET** /calculations/{id} | Get FIAB calculation by id
[**getFIABCalculationStatusSummaries**](FIABCalculationsApi.md#getFIABCalculationStatusSummaries) | **GET** /calculations | Get all FIAB calculation summaries
[**runFIABCalculation**](FIABCalculationsApi.md#runFIABCalculation) | **POST** /calculations | Run FIAB calculation



## getFIABCalculationById

> FIABCalculationStatus getFIABCalculationById(id)

Get FIAB calculation by id

This is the endpoint to check on the progress of a previously requested calculation.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, FIABCalculationsApi } = require('@factset/sdk-fixedincomeanalyticsbatcher');
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

const apiInstance = new FIABCalculationsApi();
const id = "id_example"; // String | from url, provided from the location header in the Run FIAB Calculation endpoint

// Call api endpoint
apiInstance.getFIABCalculationById(id).then(
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
 **id** | **String**| from url, provided from the location header in the Run FIAB Calculation endpoint | 

### Return type

[**FIABCalculationStatus**](FIABCalculationStatus.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getFIABCalculationStatusSummaries

> {String: FIABCalculationStatusSummary} getFIABCalculationStatusSummaries()

Get all FIAB calculation summaries

This endpoints returns all FIAB calculation requests.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, FIABCalculationsApi } = require('@factset/sdk-fixedincomeanalyticsbatcher');
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

const apiInstance = new FIABCalculationsApi();

// Call api endpoint
apiInstance.getFIABCalculationStatusSummaries().then(
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

[**{String: FIABCalculationStatusSummary}**](FIABCalculationStatusSummary.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## runFIABCalculation

> runFIABCalculation(opts)

Run FIAB calculation

This endpoint creates a new FIAB calculation.  This must be used first before get status or cancelling endpoints with a calculation id.  A successful response will contain the URL to check the status of the calculation request.    Remarks:  * Any settings in POST body will act as a one-time override over the settings saved in the FIAB template.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, FIABCalculationsApi } = require('@factset/sdk-fixedincomeanalyticsbatcher');
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

const apiInstance = new FIABCalculationsApi();
const opts = {
  'fIABCalculationParameters': {"account":{"id":"CLIENT:TEST.ACCT"},"dates":{"startdate":"20200501","enddate":"20200515"}} // FIABCalculationParameters | 
};

// Call api endpoint
apiInstance.runFIABCalculation(opts).then(
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
 **fIABCalculationParameters** | [**FIABCalculationParameters**](FIABCalculationParameters.md)|  | [optional] 

### Return type

null (empty response body)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined

