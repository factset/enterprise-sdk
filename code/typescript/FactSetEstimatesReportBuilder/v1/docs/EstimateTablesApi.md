# factsetestimatesreportbuilder.EstimateTablesApi

All URIs are relative to *https://api.factset.com/report/estimates/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getEstimateTablesTable**](EstimateTablesApi.md#getEstimateTablesTable) | **GET** /table | Interim/Annual Estimate Table



## getEstimateTablesTable

> Response getEstimateTablesTable(id, opts)

Interim/Annual Estimate Table

Returns a timeseries grid of Interim and Annual data for a single line item

### Example

```javascript
const { ApiClient, EstimateTablesApi } = require('@factset/sdk-factsetestimatesreportbuilder');
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

const apiInstance = new EstimateTablesApi();
const id = FDS; // String | Company Ticker
const opts = {
  'metric': EPS // String | Requested metric. For more details, visit [Online Assitant Page #15034](https://oa.apps.factset.com/pages/15034).
};

// Call api endpoint
apiInstance.getEstimateTablesTable(id, opts).then(
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
 **id** | **String**| Company Ticker | 
 **metric** | **String**| Requested metric. For more details, visit [Online Assitant Page #15034](https://oa.apps.factset.com/pages/15034). | [optional] 

### Return type

[**Response**](Response.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

