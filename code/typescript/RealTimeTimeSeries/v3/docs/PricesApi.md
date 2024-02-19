# realtimetimeseries.PricesApi

All URIs are relative to *https://api.factset.com/wealth/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**postPricesTimeSeriesEodList**](PricesApi.md#postPricesTimeSeriesEodList) | **POST** /prices/timeSeries/eod/list | End-of-day time series data for a notation.
[**postPricesTimeSeriesEodSubsampleGet**](PricesApi.md#postPricesTimeSeriesEodSubsampleGet) | **POST** /prices/timeSeries/eod/subsample/get | Single subsample end-of-day data for a notation.
[**postPricesTimeSeriesEodSubsampleList**](PricesApi.md#postPricesTimeSeriesEodSubsampleList) | **POST** /prices/timeSeries/eod/subsample/list | Subsampled end-of-day time series data for a notation.
[**postPricesTimeSeriesIntradayList**](PricesApi.md#postPricesTimeSeriesIntradayList) | **POST** /prices/timeSeries/intraday/list | Intraday time series data for a notation.
[**postPricesTimeSeriesIntradaySubsampleGet**](PricesApi.md#postPricesTimeSeriesIntradaySubsampleGet) | **POST** /prices/timeSeries/intraday/subsample/get | Single subsample intraday data for a notation.
[**postPricesTimeSeriesIntradaySubsampleList**](PricesApi.md#postPricesTimeSeriesIntradaySubsampleList) | **POST** /prices/timeSeries/intraday/subsample/list | Subsampled intraday time series data for a notation.



## postPricesTimeSeriesEodList

> InlineResponse2005 postPricesTimeSeriesEodList(postPricesTimeSeriesEodListRequest)

End-of-day time series data for a notation.

End-of-day time series data for a notation. The resulting time series is always adjusted for currency changes.&lt;br&gt;&lt;br&gt;Pagination to a previous page is not supported and &#x60;pagination.previous&#x60; is always &#x60;null&#x60;.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, PricesApi } = require('@factset/sdk-realtimetimeseries');
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

const apiInstance = new PricesApi();
const postPricesTimeSeriesEodListRequest = new realtimetimeseries.PostPricesTimeSeriesEodListRequest(); // PostPricesTimeSeriesEodListRequest | Request Body

// Call api endpoint
apiInstance.postPricesTimeSeriesEodList(postPricesTimeSeriesEodListRequest).then(
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
 **postPricesTimeSeriesEodListRequest** | [**PostPricesTimeSeriesEodListRequest**](PostPricesTimeSeriesEodListRequest.md)| Request Body | 

### Return type

[**InlineResponse2005**](InlineResponse2005.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## postPricesTimeSeriesEodSubsampleGet

> InlineResponse2006 postPricesTimeSeriesEodSubsampleGet(postPricesTimeSeriesEodSubsampleGetRequest)

Single subsample end-of-day data for a notation.

Single subsample end-of-day data for a notation. The sample is always adjusted for currency changes. The subsample may exceed the entitled date range, but will be based only on days that are in the entitled range.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, PricesApi } = require('@factset/sdk-realtimetimeseries');
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

const apiInstance = new PricesApi();
const postPricesTimeSeriesEodSubsampleGetRequest = new realtimetimeseries.PostPricesTimeSeriesEodSubsampleGetRequest(); // PostPricesTimeSeriesEodSubsampleGetRequest | Request Body

// Call api endpoint
apiInstance.postPricesTimeSeriesEodSubsampleGet(postPricesTimeSeriesEodSubsampleGetRequest).then(
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
 **postPricesTimeSeriesEodSubsampleGetRequest** | [**PostPricesTimeSeriesEodSubsampleGetRequest**](PostPricesTimeSeriesEodSubsampleGetRequest.md)| Request Body | 

### Return type

[**InlineResponse2006**](InlineResponse2006.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## postPricesTimeSeriesEodSubsampleList

> InlineResponse2007 postPricesTimeSeriesEodSubsampleList(postPricesTimeSeriesEodSubsampleListRequest)

Subsampled end-of-day time series data for a notation.

Subsampled end-of-day time series data for a notation. The resulting time series is always adjusted for currency changes. If a subsample&#39;s date range is not entirely within the maximally entitled date range, the subsample is excluded from the response.&lt;br&gt;&lt;br&gt;Pagination to a previous page is not supported and &#x60;pagination.previous&#x60; is always &#x60;null&#x60;.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, PricesApi } = require('@factset/sdk-realtimetimeseries');
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

const apiInstance = new PricesApi();
const postPricesTimeSeriesEodSubsampleListRequest = new realtimetimeseries.PostPricesTimeSeriesEodSubsampleListRequest(); // PostPricesTimeSeriesEodSubsampleListRequest | Request Body

// Call api endpoint
apiInstance.postPricesTimeSeriesEodSubsampleList(postPricesTimeSeriesEodSubsampleListRequest).then(
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
 **postPricesTimeSeriesEodSubsampleListRequest** | [**PostPricesTimeSeriesEodSubsampleListRequest**](PostPricesTimeSeriesEodSubsampleListRequest.md)| Request Body | 

### Return type

[**InlineResponse2007**](InlineResponse2007.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## postPricesTimeSeriesIntradayList

> InlineResponse2008 postPricesTimeSeriesIntradayList(postPricesTimeSeriesIntradayListRequest)

Intraday time series data for a notation.

Intraday time series data for a notation.&lt;br&gt;&lt;br&gt;Pagination to a previous page is not supported and &#x60;pagination.previous&#x60; is always &#x60;null&#x60;.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, PricesApi } = require('@factset/sdk-realtimetimeseries');
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

const apiInstance = new PricesApi();
const postPricesTimeSeriesIntradayListRequest = new realtimetimeseries.PostPricesTimeSeriesIntradayListRequest(); // PostPricesTimeSeriesIntradayListRequest | Request Body

// Call api endpoint
apiInstance.postPricesTimeSeriesIntradayList(postPricesTimeSeriesIntradayListRequest).then(
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
 **postPricesTimeSeriesIntradayListRequest** | [**PostPricesTimeSeriesIntradayListRequest**](PostPricesTimeSeriesIntradayListRequest.md)| Request Body | 

### Return type

[**InlineResponse2008**](InlineResponse2008.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## postPricesTimeSeriesIntradaySubsampleGet

> InlineResponse2009 postPricesTimeSeriesIntradaySubsampleGet(postPricesTimeSeriesIntradaySubsampleGetRequest)

Single subsample intraday data for a notation.

Single subsample intraday data for a notation. The subsample may exceed the entitled time range, but will be based only on ticks that are in the entitled range.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, PricesApi } = require('@factset/sdk-realtimetimeseries');
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

const apiInstance = new PricesApi();
const postPricesTimeSeriesIntradaySubsampleGetRequest = new realtimetimeseries.PostPricesTimeSeriesIntradaySubsampleGetRequest(); // PostPricesTimeSeriesIntradaySubsampleGetRequest | Request Body

// Call api endpoint
apiInstance.postPricesTimeSeriesIntradaySubsampleGet(postPricesTimeSeriesIntradaySubsampleGetRequest).then(
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
 **postPricesTimeSeriesIntradaySubsampleGetRequest** | [**PostPricesTimeSeriesIntradaySubsampleGetRequest**](PostPricesTimeSeriesIntradaySubsampleGetRequest.md)| Request Body | 

### Return type

[**InlineResponse2009**](InlineResponse2009.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## postPricesTimeSeriesIntradaySubsampleList

> InlineResponse20010 postPricesTimeSeriesIntradaySubsampleList(postPricesTimeSeriesIntradaySubsampleListRequest)

Subsampled intraday time series data for a notation.

Subsampled intraday time series data for a notation. If a subsample&#39;s time range is not entirely within the maximally entitled time range, the subsample is excluded from the response.&lt;br&gt;&lt;br&gt;Pagination to a previous page is not supported and &#x60;pagination.previous&#x60; is always &#x60;null&#x60;.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, PricesApi } = require('@factset/sdk-realtimetimeseries');
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

const apiInstance = new PricesApi();
const postPricesTimeSeriesIntradaySubsampleListRequest = new realtimetimeseries.PostPricesTimeSeriesIntradaySubsampleListRequest(); // PostPricesTimeSeriesIntradaySubsampleListRequest | Request Body

// Call api endpoint
apiInstance.postPricesTimeSeriesIntradaySubsampleList(postPricesTimeSeriesIntradaySubsampleListRequest).then(
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
 **postPricesTimeSeriesIntradaySubsampleListRequest** | [**PostPricesTimeSeriesIntradaySubsampleListRequest**](PostPricesTimeSeriesIntradaySubsampleListRequest.md)| Request Body | 

### Return type

[**InlineResponse20010**](InlineResponse20010.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

