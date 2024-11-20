# securityexplanation.SecurityExplanationApi

All URIs are relative to *https://api.factset.com/analytics/security-explanation/v0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**checkExplanationStatus**](SecurityExplanationApi.md#checkExplanationStatus) | **GET** /explanation/{id}/status | Get explanation status by id
[**fetchExplanationResults**](SecurityExplanationApi.md#fetchExplanationResults) | **GET** /explanation/{id}/result | Get explanation results by id
[**getExplanation**](SecurityExplanationApi.md#getExplanation) | **GET** /explanation | Request explanation



## checkExplanationStatus

> ExplanationStatusRoot checkExplanationStatus(id)

Get explanation status by id

Use this endpoint to fetch the status of the given explanation ID.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, SecurityExplanationApi } = require('@factset/sdk-securityexplanation');
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

const apiInstance = new SecurityExplanationApi();
const id = 80931ca92c7b432380dcd51f539c79f5; // String | id

// Call api endpoint
apiInstance.checkExplanationStatus(id).then(
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
 **id** | **String**| id | 

### Return type

[**ExplanationStatusRoot**](ExplanationStatusRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## fetchExplanationResults

> SecurityExplanationResponseRoot fetchExplanationResults(id)

Get explanation results by id

Use this endpoint to fetch the results of the given explanation ID.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, SecurityExplanationApi } = require('@factset/sdk-securityexplanation');
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

const apiInstance = new SecurityExplanationApi();
const id = 80931ca92c7b432380dcd51f539c79f5; // String | id

// Call api endpoint
apiInstance.fetchExplanationResults(id).then(
  data => {

      // data is a responsewrapper: FetchExplanationResultsResponseWrapper
      switch (data.statusCode) {

          case 200:
             // SecurityExplanationResponseRoot
             console.log(data.getResponse200());
             break;

          case 202:
             // ExplanationStatusRoot
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
 **id** | **String**| id | 

### Return type

[**SecurityExplanationResponseRoot**](SecurityExplanationResponseRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getExplanation

> ExplanationStatusRoot getExplanation(id, startDate, endDate, opts)

Request explanation

Use this endpoint to initiate a request to the LLM based on the required query parameters.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, SecurityExplanationApi } = require('@factset/sdk-securityexplanation');
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

const apiInstance = new SecurityExplanationApi();
const id = FDS-US; // String | Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent Ids.
const startDate = 2024-10-01; // Date | 
const endDate = 2024-10-15; // Date | 
const opts = {
  'enableLinks': true, // Boolean | 
  'explanationStyle': "'short'" // String | 
};

// Call api endpoint
apiInstance.getExplanation(id, startDate, endDate, opts).then(
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
 **id** | **String**| Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent Ids. | 
 **startDate** | **Date**|  | 
 **endDate** | **Date**|  | 
 **enableLinks** | **Boolean**|  | [optional] [default to true]
 **explanationStyle** | **String**|  | [optional] [default to &#39;short&#39;]

### Return type

[**ExplanationStatusRoot**](ExplanationStatusRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

