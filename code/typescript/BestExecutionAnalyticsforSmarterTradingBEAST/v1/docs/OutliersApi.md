# bestexecutionanalyticsforsmartertradingbeast.OutliersApi

All URIs are relative to *https://api.factset.com/analytics/beast/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getOutlierMetrics**](OutliersApi.md#getOutlierMetrics) | **GET** /tca/outlier/metrics | Get Outlier metrics
[**getOutlierMetricsByPercent**](OutliersApi.md#getOutlierMetricsByPercent) | **GET** /tca/outlier/metrics-by-percent | Get Outlier metrics by percent



## getOutlierMetrics

> OutlierResponseRoot getOutlierMetrics(metricType, startDate, endDate, opts)

Get Outlier metrics

Get outlier metrics by the specified metric type and date range

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, OutliersApi } = require('@factset/sdk-bestexecutionanalyticsforsmartertradingbeast');
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

const apiInstance = new OutliersApi();
const metricType = "metricType_example"; // String | Metric type
const startDate = 2024-08-20; // String | Start date in the format YYYY-MM-DD
const endDate = 2024-08-29; // String | End date in the format YYYY-MM-DD
const opts = {
  'deviation': 2, // Number | Deviation
  'binScalar': 51 // Number | Bin Scalar
};

// Call api endpoint
apiInstance.getOutlierMetrics(metricType, startDate, endDate, opts).then(
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
 **metricType** | **String**| Metric type | 
 **startDate** | **String**| Start date in the format YYYY-MM-DD | 
 **endDate** | **String**| End date in the format YYYY-MM-DD | 
 **deviation** | **Number**| Deviation | [optional] [default to 2]
 **binScalar** | **Number**| Bin Scalar | [optional] [default to 51]

### Return type

[**OutlierResponseRoot**](OutlierResponseRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getOutlierMetricsByPercent

> OutlierResponseRoot getOutlierMetricsByPercent(metricType, startDate, endDate, opts)

Get Outlier metrics by percent

Get outlier metrics by the specified metric type, percentage and date range

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, OutliersApi } = require('@factset/sdk-bestexecutionanalyticsforsmartertradingbeast');
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

const apiInstance = new OutliersApi();
const metricType = "metricType_example"; // String | Metric type
const startDate = 2024-08-20; // String | Start date in the format YYYY-MM-DD
const endDate = 2024-08-29; // String | End date in the format YYYY-MM-DD
const opts = {
  'minPercent': 25, // Number | Min Percentage
  'maxPercent': 75, // Number | Max Percentage
  'binScalar': 51 // Number | Bin Scalar
};

// Call api endpoint
apiInstance.getOutlierMetricsByPercent(metricType, startDate, endDate, opts).then(
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
 **metricType** | **String**| Metric type | 
 **startDate** | **String**| Start date in the format YYYY-MM-DD | 
 **endDate** | **String**| End date in the format YYYY-MM-DD | 
 **minPercent** | **Number**| Min Percentage | [optional] [default to 25]
 **maxPercent** | **Number**| Max Percentage | [optional] [default to 75]
 **binScalar** | **Number**| Bin Scalar | [optional] [default to 51]

### Return type

[**OutlierResponseRoot**](OutlierResponseRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

