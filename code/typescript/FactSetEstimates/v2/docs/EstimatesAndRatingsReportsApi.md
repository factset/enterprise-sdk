# factsetestimates.EstimatesAndRatingsReportsApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getEstimateTypes**](EstimatesAndRatingsReportsApi.md#getEstimateTypes) | **GET** /factset-estimates/v2/company-reports/estimate-types | Returns a list of valid estimate types.
[**getEstimates**](EstimatesAndRatingsReportsApi.md#getEstimates) | **GET** /factset-estimates/v2/company-reports/forecast | Returns forecasted estimates.
[**getSurpriseHistory**](EstimatesAndRatingsReportsApi.md#getSurpriseHistory) | **GET** /factset-estimates/v2/company-reports/surprise-history | Surprise History



## getEstimateTypes

> EstimateTypesResponse getEstimateTypes()

Returns a list of valid estimate types.

This endpoint retrieves a list of valid estimate types that can be used in the /company-reports/forecast and /company-reports/surprise-history end points. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, EstimatesAndRatingsReportsApi } = require('@factset/sdk-factsetestimates');
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

const apiInstance = new EstimatesAndRatingsReportsApi();

// Call api endpoint
apiInstance.getEstimateTypes().then(
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

[**EstimateTypesResponse**](EstimateTypesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getEstimates

> EstimateResponse getEstimates(id, estimateType, opts)

Returns forecasted estimates.

This endpoint returns up to 4 years of forecasted consensus estimates made by analysts for various financial metrics such as EPS, Sales, and more.  **Note :**   Due to variations in methodology, with the workstation using intra-day prices and our API using the previous day&#39;s closing prices, there may be some minor differences in the values of FactSet Estimates Valuation Items. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, EstimatesAndRatingsReportsApi } = require('@factset/sdk-factsetestimates');
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

const apiInstance = new EstimatesAndRatingsReportsApi();
const id = IBM-US; // String | The requested security identifier. Accepted ID types include Market Ticker, SEDOL, ISIN, CUSIP, or FactSet Permanent Id.
const estimateType = EPS; // String | The requested estimate type. Please use /meta/estimate-types to find all allowed values for this parameter.
const opts = {
  'periodicity': "'ANN'" // String | The periodicity for the estimates requested, allowing you to fetch Quarterly and Annual Estimates.   * **ANN** - Annual   * **QTR** - Quarterly 
};

// Call api endpoint
apiInstance.getEstimates(id, estimateType, opts).then(
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
 **id** | **String**| The requested security identifier. Accepted ID types include Market Ticker, SEDOL, ISIN, CUSIP, or FactSet Permanent Id. | 
 **estimateType** | **String**| The requested estimate type. Please use /meta/estimate-types to find all allowed values for this parameter. | 
 **periodicity** | **String**| The periodicity for the estimates requested, allowing you to fetch Quarterly and Annual Estimates.   * **ANN** - Annual   * **QTR** - Quarterly  | [optional] [default to &#39;ANN&#39;]

### Return type

[**EstimateResponse**](EstimateResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getSurpriseHistory

> SurpriseHistoryResponse getSurpriseHistory(id, estimateType, opts)

Surprise History

Returns surprise history for the given security

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, EstimatesAndRatingsReportsApi } = require('@factset/sdk-factsetestimates');
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

const apiInstance = new EstimatesAndRatingsReportsApi();
const id = IBM-US; // String | The requested security identifier. Accepted ID types include Market Ticker, SEDOL, ISIN, CUSIP, or FactSet Permanent Id.
const estimateType = EPS; // String | The requested estimate type. Please use /meta/estimate-types to find all allowed values for this parameter.
const opts = {
  'periodicity': "'ANN'", // String | The periodicity for the estimates requested, allowing you to fetch Quarterly and Annual Estimates.   * **ANN** - Annual   * **QTR** - Quarterly 
  'paginationLimit': 50, // Number | Specifies the number of results to return per page.
  'paginationOffset': 0 // Number | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results.
};

// Call api endpoint
apiInstance.getSurpriseHistory(id, estimateType, opts).then(
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
 **id** | **String**| The requested security identifier. Accepted ID types include Market Ticker, SEDOL, ISIN, CUSIP, or FactSet Permanent Id. | 
 **estimateType** | **String**| The requested estimate type. Please use /meta/estimate-types to find all allowed values for this parameter. | 
 **periodicity** | **String**| The periodicity for the estimates requested, allowing you to fetch Quarterly and Annual Estimates.   * **ANN** - Annual   * **QTR** - Quarterly  | [optional] [default to &#39;ANN&#39;]
 **paginationLimit** | **Number**| Specifies the number of results to return per page. | [optional] [default to 50]
 **paginationOffset** | **Number**| Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. | [optional] [default to 0]

### Return type

[**SurpriseHistoryResponse**](SurpriseHistoryResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

