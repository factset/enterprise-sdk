# streetaccountnews.HeadlinesApi

All URIs are relative to *https://api.factset.com/streetaccount/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getStreetAccountHeadlines**](HeadlinesApi.md#getStreetAccountHeadlines) | **POST** /headlines | Retrieve StreetAccount headlines for given filters
[**getStreetAccountHeadlinesByView**](HeadlinesApi.md#getStreetAccountHeadlinesByView) | **POST** /headlines/view | Retrieve StreetAccount headlines for given view



## getStreetAccountHeadlines

> HeadlinesResponse getStreetAccountHeadlines(opts)

Retrieve StreetAccount headlines for given filters

This endpoint will pull all headlines produced by StreetAccount and the full story body will be returned by the data set. Filters can be specified via the endpoint below. The attributes field in the request body can be used to specify which fields are returned in the response. If attributes are empty or not specified, the response does not omit attributes.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

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
  'headlinesRequest': new streetaccountnews.HeadlinesRequest() // HeadlinesRequest | /filters endpoint contains the filters associated with the optional parameters in the request body.
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
 **headlinesRequest** | [**HeadlinesRequest**](HeadlinesRequest.md)| /filters endpoint contains the filters associated with the optional parameters in the request body. | [optional] 

### Return type

[**HeadlinesResponse**](HeadlinesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## getStreetAccountHeadlinesByView

> HeadlinesResponse getStreetAccountHeadlinesByView(opts)

Retrieve StreetAccount headlines for given view

This endpoint allows you to pull all headlines produced by StreetAccount for a saved view. The full story body will be returned by the data set. Views can be created via the &#39;Create Views&#39; endpoint.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

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
  'headlinesRequestByView': new streetaccountnews.HeadlinesRequestByView() // HeadlinesRequestByView | View body which needs to be sent with request
};

// Call api endpoint
apiInstance.getStreetAccountHeadlinesByView(opts).then(
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
 **headlinesRequestByView** | [**HeadlinesRequestByView**](HeadlinesRequestByView.md)| View body which needs to be sent with request | [optional] 

### Return type

[**HeadlinesResponse**](HeadlinesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

