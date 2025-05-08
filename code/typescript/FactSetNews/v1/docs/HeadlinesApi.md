# factsetnews.HeadlinesApi

All URIs are relative to *https://api.factset.com/content/news/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getFactSetNewsHeadlines**](HeadlinesApi.md#getFactSetNewsHeadlines) | **POST** /headlines | Retrieve FactSet News headlines for the given filters
[**getFactSetNewsHeadlinesByView**](HeadlinesApi.md#getFactSetNewsHeadlinesByView) | **POST** /headlines/view | Retrieve FactSet News headlines for given view



## getFactSetNewsHeadlines

> SearchResponse getFactSetNewsHeadlines(opts)

Retrieve FactSet News headlines for the given filters

This endpoint will pull all FactSet News headlines. Filters can be specified via the endpoint below. Please refer to &#x60;/filters&#x60; endpoint to obtain the values.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, HeadlinesApi } = require('@factset/sdk-factsetnews');
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
  'headlinesRequest': new factsetnews.HeadlinesRequest() // HeadlinesRequest | Filter Body which needs to be sent with request.
};

// Call api endpoint
apiInstance.getFactSetNewsHeadlines(opts).then(
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
 **headlinesRequest** | [**HeadlinesRequest**](HeadlinesRequest.md)| Filter Body which needs to be sent with request. | [optional] 

### Return type

[**SearchResponse**](SearchResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## getFactSetNewsHeadlinesByView

> SearchResponse getFactSetNewsHeadlinesByView(opts)

Retrieve FactSet News headlines for given view

This endpoint allows you to pull all FactSet News Headlines for a saved view. Views can be created via the &#39;Create Views&#39; endpoint.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, HeadlinesApi } = require('@factset/sdk-factsetnews');
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
  'headlinesRequestByView': new factsetnews.HeadlinesRequestByView() // HeadlinesRequestByView | View body which needs to be sent with request.
};

// Call api endpoint
apiInstance.getFactSetNewsHeadlinesByView(opts).then(
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
 **headlinesRequestByView** | [**HeadlinesRequestByView**](HeadlinesRequestByView.md)| View body which needs to be sent with request. | [optional] 

### Return type

[**SearchResponse**](SearchResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

