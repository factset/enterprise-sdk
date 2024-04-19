# streetaccountnews.ViewsApi

All URIs are relative to *https://api.factset.com/streetaccount/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createQuickAlertForView**](ViewsApi.md#createQuickAlertForView) | **POST** /quick-alert/create | Creates a quick-alert for given saved view
[**createStreetAccountView**](ViewsApi.md#createStreetAccountView) | **POST** /views/create | Creates and saves a StreetAccount view
[**deleteQuickalertView**](ViewsApi.md#deleteQuickalertView) | **POST** /quick-alert/delete | Deletes an existing quick alert for a view.
[**deleteStreetAccountView**](ViewsApi.md#deleteStreetAccountView) | **POST** /views/delete | Deletes an existing StreetAccount view
[**editStreetAccountView**](ViewsApi.md#editStreetAccountView) | **POST** /views/update | Edits and saves an existing StreetAccount view
[**getStreetAccountViews**](ViewsApi.md#getStreetAccountViews) | **GET** /views | Retrieves StreetAccount search views



## createQuickAlertForView

> QuickAlertsResponse createQuickAlertForView(opts)

Creates a quick-alert for given saved view

This endpoint takes in a view name and provides realtime email updates on new stories coming in for the view. Only one quick alert can be enabled for a view at a time.  

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, ViewsApi } = require('@factset/sdk-streetaccountnews');
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

const apiInstance = new ViewsApi();
const opts = {
  'quickAlertsBody': new streetaccountnews.QuickAlertsBody() // QuickAlertsBody | View name to get an alert
};

// Call api endpoint
apiInstance.createQuickAlertForView(opts).then(
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
 **quickAlertsBody** | [**QuickAlertsBody**](QuickAlertsBody.md)| View name to get an alert | [optional] 

### Return type

[**QuickAlertsResponse**](QuickAlertsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## createStreetAccountView

> CreateViewResponse createStreetAccountView(opts)

Creates and saves a StreetAccount view

This endpoint allows you to create a new StreetAccount view. Select watchlists/tickers and filters of your choice to create and save a view.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, ViewsApi } = require('@factset/sdk-streetaccountnews');
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

const apiInstance = new ViewsApi();
const opts = {
  'createOrEditViewBody': new streetaccountnews.CreateOrEditViewBody() // CreateOrEditViewBody | Create or Edit View Body which needs to be sent with request
};

// Call api endpoint
apiInstance.createStreetAccountView(opts).then(
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
 **createOrEditViewBody** | [**CreateOrEditViewBody**](CreateOrEditViewBody.md)| Create or Edit View Body which needs to be sent with request | [optional] 

### Return type

[**CreateViewResponse**](CreateViewResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## deleteQuickalertView

> deleteQuickalertView(opts)

Deletes an existing quick alert for a view.

This endpoint allows you to delete a quick alert from a previously saved view.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, ViewsApi } = require('@factset/sdk-streetaccountnews');
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

const apiInstance = new ViewsApi();
const opts = {
  'quickAlertsBody': new streetaccountnews.QuickAlertsBody() // QuickAlertsBody | View name to get an alert
};

// Call api endpoint
apiInstance.deleteQuickalertView(opts).then(
  () => {
    console.log('API called successfully.');
  },
  error => {
    console.error(error);
  },
);

```


### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **quickAlertsBody** | [**QuickAlertsBody**](QuickAlertsBody.md)| View name to get an alert | [optional] 

### Return type

null (empty response body)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## deleteStreetAccountView

> deleteStreetAccountView(opts)

Deletes an existing StreetAccount view

This endpoint allows you to delete a previously saved StreetAccount view.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, ViewsApi } = require('@factset/sdk-streetaccountnews');
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

const apiInstance = new ViewsApi();
const opts = {
  'deleteViewBody': new streetaccountnews.DeleteViewBody() // DeleteViewBody | Delete View Body which needs to be sent with request
};

// Call api endpoint
apiInstance.deleteStreetAccountView(opts).then(
  () => {
    console.log('API called successfully.');
  },
  error => {
    console.error(error);
  },
);

```


### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deleteViewBody** | [**DeleteViewBody**](DeleteViewBody.md)| Delete View Body which needs to be sent with request | [optional] 

### Return type

null (empty response body)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## editStreetAccountView

> editStreetAccountView(opts)

Edits and saves an existing StreetAccount view

This endpoint allows you to edit the criteria used for a previously saved StreetAccount view.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, ViewsApi } = require('@factset/sdk-streetaccountnews');
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

const apiInstance = new ViewsApi();
const opts = {
  'createOrEditViewBody': new streetaccountnews.CreateOrEditViewBody() // CreateOrEditViewBody | Create or Edit View Body which needs to be sent with request
};

// Call api endpoint
apiInstance.editStreetAccountView(opts).then(
  () => {
    console.log('API called successfully.');
  },
  error => {
    console.error(error);
  },
);

```


### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createOrEditViewBody** | [**CreateOrEditViewBody**](CreateOrEditViewBody.md)| Create or Edit View Body which needs to be sent with request | [optional] 

### Return type

null (empty response body)

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

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, ViewsApi } = require('@factset/sdk-streetaccountnews');
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

