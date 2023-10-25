# streetaccountnews.HeadlinesApi

All URIs are relative to *https://api.factset.com/research/news/v0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getStreetAccountHeadlines**](HeadlinesApi.md#getStreetAccountHeadlines) | **POST** /streetaccount/headlines | Retrieve StreetAccount headlines for given filters
[**getStreetAccountHeadlinesByView**](HeadlinesApi.md#getStreetAccountHeadlinesByView) | **POST** /streetaccount/views/{id}/headlines | Retrieve StreetAccount headlines for given view



## getStreetAccountHeadlines

> SearchResponse getStreetAccountHeadlines(opts)

Retrieve StreetAccount headlines for given filters

This endpoint will pull all headlines produced by StreetAccount and the full story body will be returned by the data set. Filters can be specified via the endpoint below.

### Example

```javascript
const { ApiClient, HeadlinesApi } = require('@factset/sdk-streetaccountnews');
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

const apiInstance = new HeadlinesApi();
const opts = {
  'saHeadlinesRequest': new streetaccountnews.SaHeadlinesRequest() // SaHeadlinesRequest | Filter Body which needs to be sent with request
};

// Call api endpoint
apiInstance.getStreetAccountHeadlines(opts).then(
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
 **saHeadlinesRequest** | [**SaHeadlinesRequest**](SaHeadlinesRequest.md)| Filter Body which needs to be sent with request | [optional] 

### Return type

[**SearchResponse**](SearchResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## getStreetAccountHeadlinesByView

> SearchResponse getStreetAccountHeadlinesByView(id, opts)

Retrieve StreetAccount headlines for given view

This endpoint allows you to pull all headlines produced by StreetAccount for a saved view. The full story body will be returned by the data set. Views can be created via the ‘Create Views’ endpoint.

### Example

```javascript
const { ApiClient, HeadlinesApi } = require('@factset/sdk-streetaccountnews');
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

const apiInstance = new HeadlinesApi();
const id = SA News View; // String | view id of the view to return headlines for
const opts = {
  'saHeadlinesRequestByView': new streetaccountnews.SaHeadlinesRequestByView() // SaHeadlinesRequestByView | View body which needs to be sent with request
};

// Call api endpoint
apiInstance.getStreetAccountHeadlinesByView(id, opts).then(
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
 **id** | **String**| view id of the view to return headlines for | 
 **saHeadlinesRequestByView** | [**SaHeadlinesRequestByView**](SaHeadlinesRequestByView.md)| View body which needs to be sent with request | [optional] 

### Return type

[**SearchResponse**](SearchResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

