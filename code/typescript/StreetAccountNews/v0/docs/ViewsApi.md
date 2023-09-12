# streetaccountnews.ViewsApi

All URIs are relative to *https://api.factset.com/research/news/v0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createStreetAccountView**](ViewsApi.md#createStreetAccountView) | **POST** /streetaccount/views/{id} | Creates and saves a StreetAccount view
[**deleteStreetAccountView**](ViewsApi.md#deleteStreetAccountView) | **DELETE** /streetaccount/views/{id} | Deletes an existing StreetAccount view
[**editStreetAccountView**](ViewsApi.md#editStreetAccountView) | **PUT** /streetaccount/views/{id} | Edits and saves an existing StreetAccount view
[**getStreetAccountViews**](ViewsApi.md#getStreetAccountViews) | **GET** /streetaccount/views | Retrieves StreetAccount search views



## createStreetAccountView

> CreateEditDeleteViewResponse createStreetAccountView(id, opts)

Creates and saves a StreetAccount view

This endpoint allows you to create a new StreetAccount view. Select watchlists/tickers and filters of your choice to create and save a view.

### Example

```javascript
const { ApiClient, ViewsApi } = require('@factset/sdk-streetaccountnews');
const { ConfidentialClient } = require('@factset/sdk-utils');

const apiClient = ApiClient.instance;

// Examples for each supported authentication method are below,
// choose one that satisfies your use case.

// (Preferred) OAuth 2.0: FactSetOAuth2
// See https://github.com/FactSet/enterprise-sdk#oauth-20
// for information on how to create the app-config.json file
// See https://github.com/FactSet/enterprise-sdk-utils-typescript#authentication
// for more information on using the ConfidentialClient class
apiClient.factsetOauth2Client = new ConfidentialClient('/path/to/app-config.json');

// Basic authentication: FactSetApiKey
// See https://github.com/FactSet/enterprise-sdk#api-key
// for information how to create an API key
// const FactSetApiKey = apiClient.authentications['FactSetApiKey'];
// FactSetApiKey.username = 'USERNAME-SERIAL';
// FactSetApiKey.password = 'API-KEY';

const apiInstance = new ViewsApi();
const id = SA News View; // String | view id of the view which is the be created
const opts = {
  'createOrEditViewBody': new streetaccountnews.CreateOrEditViewBody() // CreateOrEditViewBody | Create or Edit View Body which needs to be sent with request
};

// Call api endpoint
apiInstance.createStreetAccountView(id, opts).then(
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
 **id** | **String**| view id of the view which is the be created | 
 **createOrEditViewBody** | [**CreateOrEditViewBody**](CreateOrEditViewBody.md)| Create or Edit View Body which needs to be sent with request | [optional] 

### Return type

[**CreateEditDeleteViewResponse**](CreateEditDeleteViewResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## deleteStreetAccountView

> CreateEditDeleteViewResponse deleteStreetAccountView(id)

Deletes an existing StreetAccount view

This endpoint allows you to delete a previously saved StreetAccount view.

### Example

```javascript
const { ApiClient, ViewsApi } = require('@factset/sdk-streetaccountnews');
const { ConfidentialClient } = require('@factset/sdk-utils');

const apiClient = ApiClient.instance;

// Examples for each supported authentication method are below,
// choose one that satisfies your use case.

// (Preferred) OAuth 2.0: FactSetOAuth2
// See https://github.com/FactSet/enterprise-sdk#oauth-20
// for information on how to create the app-config.json file
// See https://github.com/FactSet/enterprise-sdk-utils-typescript#authentication
// for more information on using the ConfidentialClient class
apiClient.factsetOauth2Client = new ConfidentialClient('/path/to/app-config.json');

// Basic authentication: FactSetApiKey
// See https://github.com/FactSet/enterprise-sdk#api-key
// for information how to create an API key
// const FactSetApiKey = apiClient.authentications['FactSetApiKey'];
// FactSetApiKey.username = 'USERNAME-SERIAL';
// FactSetApiKey.password = 'API-KEY';

const apiInstance = new ViewsApi();
const id = SA News View; // String | view id of the view to be deleted

// Call api endpoint
apiInstance.deleteStreetAccountView(id).then(
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
 **id** | **String**| view id of the view to be deleted | 

### Return type

[**CreateEditDeleteViewResponse**](CreateEditDeleteViewResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## editStreetAccountView

> CreateEditDeleteViewResponse editStreetAccountView(id, opts)

Edits and saves an existing StreetAccount view

This endpoint allows you to edit the criteria used for a previously saved StreetAccount view.

### Example

```javascript
const { ApiClient, ViewsApi } = require('@factset/sdk-streetaccountnews');
const { ConfidentialClient } = require('@factset/sdk-utils');

const apiClient = ApiClient.instance;

// Examples for each supported authentication method are below,
// choose one that satisfies your use case.

// (Preferred) OAuth 2.0: FactSetOAuth2
// See https://github.com/FactSet/enterprise-sdk#oauth-20
// for information on how to create the app-config.json file
// See https://github.com/FactSet/enterprise-sdk-utils-typescript#authentication
// for more information on using the ConfidentialClient class
apiClient.factsetOauth2Client = new ConfidentialClient('/path/to/app-config.json');

// Basic authentication: FactSetApiKey
// See https://github.com/FactSet/enterprise-sdk#api-key
// for information how to create an API key
// const FactSetApiKey = apiClient.authentications['FactSetApiKey'];
// FactSetApiKey.username = 'USERNAME-SERIAL';
// FactSetApiKey.password = 'API-KEY';

const apiInstance = new ViewsApi();
const id = SA News View; // String | view id of the view to be edited
const opts = {
  'createOrEditViewBody': new streetaccountnews.CreateOrEditViewBody() // CreateOrEditViewBody | Create or Edit View Body which needs to be sent with request
};

// Call api endpoint
apiInstance.editStreetAccountView(id, opts).then(
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
 **id** | **String**| view id of the view to be edited | 
 **createOrEditViewBody** | [**CreateOrEditViewBody**](CreateOrEditViewBody.md)| Create or Edit View Body which needs to be sent with request | [optional] 

### Return type

[**CreateEditDeleteViewResponse**](CreateEditDeleteViewResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## getStreetAccountViews

> Views getStreetAccountViews()

Retrieves StreetAccount search views

This endpoint allows you to pull the full list of StreetAccount views that have been previously saved.

### Example

```javascript
const { ApiClient, ViewsApi } = require('@factset/sdk-streetaccountnews');
const { ConfidentialClient } = require('@factset/sdk-utils');

const apiClient = ApiClient.instance;

// Examples for each supported authentication method are below,
// choose one that satisfies your use case.

// (Preferred) OAuth 2.0: FactSetOAuth2
// See https://github.com/FactSet/enterprise-sdk#oauth-20
// for information on how to create the app-config.json file
// See https://github.com/FactSet/enterprise-sdk-utils-typescript#authentication
// for more information on using the ConfidentialClient class
apiClient.factsetOauth2Client = new ConfidentialClient('/path/to/app-config.json');

// Basic authentication: FactSetApiKey
// See https://github.com/FactSet/enterprise-sdk#api-key
// for information how to create an API key
// const FactSetApiKey = apiClient.authentications['FactSetApiKey'];
// FactSetApiKey.username = 'USERNAME-SERIAL';
// FactSetApiKey.password = 'API-KEY';

const apiInstance = new ViewsApi();

// Call api endpoint
apiInstance.getStreetAccountViews().then(
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

[**Views**](Views.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

