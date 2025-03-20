# bestexecutionanalyticsforsmartertradingbeast.OutliersApi

All URIs are relative to *https://api.factset.com/analytics/beast/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getOutlierMetricsByPercentile**](OutliersApi.md#getOutlierMetricsByPercentile) | **GET** /tca/outlier/metrics-by-percentile | Get Outlier Metrics by percentile
[**getOutlierMetricsStandard**](OutliersApi.md#getOutlierMetricsStandard) | **GET** /tca/outlier/metrics-standard | Get Outlier Metrics by standard deviation



## getOutlierMetricsByPercentile

> OutlierResponseRoot getOutlierMetricsByPercentile(metricType, startDate, endDate, opts)

Get Outlier Metrics by percentile

Get outlier metrics by the specified metric type, percentile and date range

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
const startDate = 2024-07-29; // String | Start date in the format YYYY-MM-DD
const endDate = 2024-08-29; // String | End date in the format YYYY-MM-DD
const opts = {
  'region': US, // String | The two character ISO country code of the trading region. EMEA is used for the European trading region
  'trader': "trader_example", // String | Optionally specify a trader to filter by, Example : Ryan
  'minPercent': 2.5, // Number | Min Percentile
  'maxPercent': 97.5, // Number | Max Percentile
  'binScalar': 51 // Number | Bin Scalar
};

// Call api endpoint
apiInstance.getOutlierMetricsByPercentile(metricType, startDate, endDate, opts).then(
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
 **region** | **String**| The two character ISO country code of the trading region. EMEA is used for the European trading region | [optional] 
 **trader** | **String**| Optionally specify a trader to filter by, Example : Ryan | [optional] 
 **minPercent** | **Number**| Min Percentile | [optional] [default to 2.5]
 **maxPercent** | **Number**| Max Percentile | [optional] [default to 97.5]
 **binScalar** | **Number**| Bin Scalar | [optional] [default to 51]

### Return type

[**OutlierResponseRoot**](OutlierResponseRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getOutlierMetricsStandard

> OutlierResponseRoot getOutlierMetricsStandard(metricType, startDate, endDate, opts)

Get Outlier Metrics by standard deviation

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
const startDate = 2024-07-29; // String | Start date in the format YYYY-MM-DD
const endDate = 2024-08-29; // String | End date in the format YYYY-MM-DD
const opts = {
  'region': US, // String | The two character ISO country code of the trading region. EMEA is used for the European trading region
  'trader': "trader_example", // String | Optionally specify a trader to filter by, Example : Ryan
  'deviation': 2, // Number | Deviation
  'binScalar': 51 // Number | Bin Scalar
};

// Call api endpoint
apiInstance.getOutlierMetricsStandard(metricType, startDate, endDate, opts).then(
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
 **region** | **String**| The two character ISO country code of the trading region. EMEA is used for the European trading region | [optional] 
 **trader** | **String**| Optionally specify a trader to filter by, Example : Ryan | [optional] 
 **deviation** | **Number**| Deviation | [optional] [default to 2]
 **binScalar** | **Number**| Bin Scalar | [optional] [default to 51]

### Return type

[**OutlierResponseRoot**](OutlierResponseRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

