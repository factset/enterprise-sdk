# realtimetimeseries.VendorApi

All URIs are relative to *https://api.factset.com/wealth/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**postVendorChartIqTimeSeriesEodList**](VendorApi.md#postVendorChartIqTimeSeriesEodList) | **POST** /vendor/chart-iq/time-series/eod/list | End-of-day time series data for a notation.
[**postVendorChartIqTimeSeriesEodSubsampleGet**](VendorApi.md#postVendorChartIqTimeSeriesEodSubsampleGet) | **POST** /vendor/chart-iq/time-series/eod/subsample/get | Single subsample end-of-day data for a notation.
[**postVendorChartIqTimeSeriesEodSubsampleList**](VendorApi.md#postVendorChartIqTimeSeriesEodSubsampleList) | **POST** /vendor/chart-iq/time-series/eod/subsample/list | Subsampled end-of-day time series data for a notation.
[**postVendorChartIqTimeSeriesIntradaySubsampleGet**](VendorApi.md#postVendorChartIqTimeSeriesIntradaySubsampleGet) | **POST** /vendor/chart-iq/time-series/intraday/subsample/get | Single subsample intraday data for a notation.
[**postVendorChartIqTimeSeriesIntradaySubsampleList**](VendorApi.md#postVendorChartIqTimeSeriesIntradaySubsampleList) | **POST** /vendor/chart-iq/time-series/intraday/subsample/list | Subsampled intraday time series data for a notation.



## postVendorChartIqTimeSeriesEodList

> InlineResponse200 postVendorChartIqTimeSeriesEodList(postVendorChartIQTimeSeriesEodListRequest)

End-of-day time series data for a notation.

End-of-day time series data for a notation. The resulting time series is always adjusted for currency changes.&lt;br&gt;&lt;br&gt;Pagination to a previous page is not supported and &#x60;pagination.previous&#x60; is always &#x60;null&#x60;.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, VendorApi } = require('@factset/sdk-realtimetimeseries');
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

const apiInstance = new VendorApi();
const postVendorChartIQTimeSeriesEodListRequest = {"data":{"identifier":{"value":"FDS-US","type":"tickerRegion"},"type":"trade","quality":"DLY","range":{"start":"2024-12-24","end":"2024-01-01"},"newestFirst":true,"adjustments":{"payout":true,"split":true}},"meta":{"attributes":[],"pagination":{"cursor":"Lorem ipsum","limit":20}}}; // PostVendorChartIQTimeSeriesEodListRequest | Request Body

// Call api endpoint
apiInstance.postVendorChartIqTimeSeriesEodList(postVendorChartIQTimeSeriesEodListRequest).then(
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
 **postVendorChartIQTimeSeriesEodListRequest** | [**PostVendorChartIQTimeSeriesEodListRequest**](PostVendorChartIQTimeSeriesEodListRequest.md)| Request Body | 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## postVendorChartIqTimeSeriesEodSubsampleGet

> InlineResponse2001 postVendorChartIqTimeSeriesEodSubsampleGet(postVendorChartIQTimeSeriesEodSubsampleGetRequest)

Single subsample end-of-day data for a notation.

Single subsample end-of-day data for a notation. The sample is always adjusted for currency changes. The subsample may exceed the entitled date range, but will be based only on days that are in the entitled range.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, VendorApi } = require('@factset/sdk-realtimetimeseries');
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

const apiInstance = new VendorApi();
const postVendorChartIQTimeSeriesEodSubsampleGetRequest = {"data":{"identifier":{"value":"FDS-US","type":"tickerRegion"},"type":"trade","quality":"DLY","interval":{"start":"2024-01-01","end":"2024-01-01"},"adjustments":{"payout":true,"split":true}},"meta":{"attributes":[]}}; // PostVendorChartIQTimeSeriesEodSubsampleGetRequest | Request Body

// Call api endpoint
apiInstance.postVendorChartIqTimeSeriesEodSubsampleGet(postVendorChartIQTimeSeriesEodSubsampleGetRequest).then(
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
 **postVendorChartIQTimeSeriesEodSubsampleGetRequest** | [**PostVendorChartIQTimeSeriesEodSubsampleGetRequest**](PostVendorChartIQTimeSeriesEodSubsampleGetRequest.md)| Request Body | 

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## postVendorChartIqTimeSeriesEodSubsampleList

> InlineResponse2002 postVendorChartIqTimeSeriesEodSubsampleList(postVendorChartIQTimeSeriesEodSubsampleListRequest)

Subsampled end-of-day time series data for a notation.

Subsampled end-of-day time series data for a notation. The resulting time series is always adjusted for currency changes. If a subsample&#39;s date range is not entirely within the maximally entitled date range, the subsample is excluded from the response.&lt;br&gt;&lt;br&gt;Pagination to a previous page is not supported and &#x60;pagination.previous&#x60; is always &#x60;null&#x60;.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, VendorApi } = require('@factset/sdk-realtimetimeseries');
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

const apiInstance = new VendorApi();
const postVendorChartIQTimeSeriesEodSubsampleListRequest = {"data":{"identifier":{"value":"FDS-US","type":"tickerRegion"},"type":"trade","quality":"DLY","intervalSelection":{"intervals":["2024-01-01","2024-02-01"],"samples":{"end":"2024-01-01","number":2999,"granularity":"1w"}},"newestFirst":true,"adjustments":{"payout":true,"split":true}},"meta":{"attributes":[],"pagination":{"cursor":"Lorem ipsum","limit":20}}}; // PostVendorChartIQTimeSeriesEodSubsampleListRequest | Request Body

// Call api endpoint
apiInstance.postVendorChartIqTimeSeriesEodSubsampleList(postVendorChartIQTimeSeriesEodSubsampleListRequest).then(
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
 **postVendorChartIQTimeSeriesEodSubsampleListRequest** | [**PostVendorChartIQTimeSeriesEodSubsampleListRequest**](PostVendorChartIQTimeSeriesEodSubsampleListRequest.md)| Request Body | 

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## postVendorChartIqTimeSeriesIntradaySubsampleGet

> InlineResponse2003 postVendorChartIqTimeSeriesIntradaySubsampleGet(postVendorChartIQTimeSeriesIntradaySubsampleGetRequest)

Single subsample intraday data for a notation.

Single subsample intraday data for a notation. The subsample may exceed the entitled time range, but will be based only on ticks that are in the entitled range.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, VendorApi } = require('@factset/sdk-realtimetimeseries');
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

const apiInstance = new VendorApi();
const postVendorChartIQTimeSeriesIntradaySubsampleGetRequest = {"data":{"identifier":{"value":"FDS-US","type":"tickerRegion"},"type":"trade","quality":"DLY","from":"2024-12-24T18:00:00.000000Z","granularity":"1h","adjustments":{"split":true}},"meta":{"attributes":[]}}; // PostVendorChartIQTimeSeriesIntradaySubsampleGetRequest | Request Body

// Call api endpoint
apiInstance.postVendorChartIqTimeSeriesIntradaySubsampleGet(postVendorChartIQTimeSeriesIntradaySubsampleGetRequest).then(
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
 **postVendorChartIQTimeSeriesIntradaySubsampleGetRequest** | [**PostVendorChartIQTimeSeriesIntradaySubsampleGetRequest**](PostVendorChartIQTimeSeriesIntradaySubsampleGetRequest.md)| Request Body | 

### Return type

[**InlineResponse2003**](InlineResponse2003.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## postVendorChartIqTimeSeriesIntradaySubsampleList

> InlineResponse2004 postVendorChartIqTimeSeriesIntradaySubsampleList(postVendorChartIQTimeSeriesIntradaySubsampleListRequest)

Subsampled intraday time series data for a notation.

Subsampled intraday time series data for a notation. If a subsample&#39;s time range is not entirely within the maximally entitled time range, the subsample is excluded from the response.&lt;br&gt;&lt;br&gt;Pagination to a previous page is not supported and &#x60;pagination.previous&#x60; is always &#x60;null&#x60;.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, VendorApi } = require('@factset/sdk-realtimetimeseries');
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

const apiInstance = new VendorApi();
const postVendorChartIQTimeSeriesIntradaySubsampleListRequest = {"data":{"identifier":{"value":"FDS-US","type":"tickerRegion"},"type":"trade","quality":"DLY","range":{"start":"2024-01-01T00:00:00.000Z","end":"2024-12-24T18:00:00.000000Z"},"granularity":"1h","newestFirst":false,"adjustments":{"split":true}},"meta":{"attributes":[],"pagination":{"cursor":"Lorem ipsum","limit":20}}}; // PostVendorChartIQTimeSeriesIntradaySubsampleListRequest | Request Body

// Call api endpoint
apiInstance.postVendorChartIqTimeSeriesIntradaySubsampleList(postVendorChartIQTimeSeriesIntradaySubsampleListRequest).then(
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
 **postVendorChartIQTimeSeriesIntradaySubsampleListRequest** | [**PostVendorChartIQTimeSeriesIntradaySubsampleListRequest**](PostVendorChartIQTimeSeriesIntradaySubsampleListRequest.md)| Request Body | 

### Return type

[**InlineResponse2004**](InlineResponse2004.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

