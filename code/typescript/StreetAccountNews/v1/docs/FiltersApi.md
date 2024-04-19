# streetaccountnews.FiltersApi

All URIs are relative to *https://api.factset.com/streetaccount/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getStreetAccountFilters**](FiltersApi.md#getStreetAccountFilters) | **GET** /filters | Retrieve all StreetAccount filters
[**getStreetAccountFiltersCategories**](FiltersApi.md#getStreetAccountFiltersCategories) | **GET** /filters/categories | Retrieve all StreetAccount filter categories
[**getStreetAccountFiltersRegions**](FiltersApi.md#getStreetAccountFiltersRegions) | **GET** /filters/regions | Retrieve all StreetAccount filter regions
[**getStreetAccountFiltersSectors**](FiltersApi.md#getStreetAccountFiltersSectors) | **GET** /filters/sectors | Retrieve all StreetAccount filter sectors
[**getStreetAccountFiltersTopics**](FiltersApi.md#getStreetAccountFiltersTopics) | **GET** /filters/topics | Retrieve all StreetAccount filter topics
[**getStreetAccountFiltersWatchlists**](FiltersApi.md#getStreetAccountFiltersWatchlists) | **GET** /filters/watchlists | Retrieve all StreetAccount filter watchlists



## getStreetAccountFilters

> FilterResponse getStreetAccountFilters(opts)

Retrieve all StreetAccount filters

If structured flag is set, parent and child filter information will be returned. If flattened flag is set, flattened filters will be returned which can be used with the headlines and createView endpoints. Both flags can be set to return both sets of filters.  If no params are provided it will return both.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, FiltersApi } = require('@factset/sdk-streetaccountnews');
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

const apiInstance = new FiltersApi();
const opts = {
  'attributes': ["null"] // [String] | Pass a list of filters to return the respective type of filter. Accepted list values are \"structured\" and/or \"flattened\". If no _atrributes are specified, all filters will be returned in the response (this is the default response). 
};

// Call api endpoint
apiInstance.getStreetAccountFilters(opts).then(
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
 **attributes** | [**[String]**](String.md)| Pass a list of filters to return the respective type of filter. Accepted list values are \&quot;structured\&quot; and/or \&quot;flattened\&quot;. If no _atrributes are specified, all filters will be returned in the response (this is the default response).  | [optional] 

### Return type

[**FilterResponse**](FilterResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getStreetAccountFiltersCategories

> FilterCategoriesResponse getStreetAccountFiltersCategories(opts)

Retrieve all StreetAccount filter categories

If structured flag is set, parent and child filter information will be returned. If flattened flag is set, flattened filters will be returned which can be used with the headlines and createView endpoints. Both flags can be set to return both sets of filters.  If no params are provided it will return both.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, FiltersApi } = require('@factset/sdk-streetaccountnews');
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

const apiInstance = new FiltersApi();
const opts = {
  'attributes': ["null"] // [String] | Pass a list of filters to return the respective type of filter categories. Accepted list values are \"structured\" and/or \"flattened\". If no _atrributes are specified, all filters will be returned in the response (this is the default response). 
};

// Call api endpoint
apiInstance.getStreetAccountFiltersCategories(opts).then(
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
 **attributes** | [**[String]**](String.md)| Pass a list of filters to return the respective type of filter categories. Accepted list values are \&quot;structured\&quot; and/or \&quot;flattened\&quot;. If no _atrributes are specified, all filters will be returned in the response (this is the default response).  | [optional] 

### Return type

[**FilterCategoriesResponse**](FilterCategoriesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getStreetAccountFiltersRegions

> FilterRegionsResponse getStreetAccountFiltersRegions(opts)

Retrieve all StreetAccount filter regions

If structured flag is set, parent and child filter information will be returned. If flattened flag is set, flattened filters will be returned which can be used with the headlines and createView endpoints. Both flags can be set to return both sets of filters.  If no params are provided it will return both.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, FiltersApi } = require('@factset/sdk-streetaccountnews');
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

const apiInstance = new FiltersApi();
const opts = {
  'attributes': ["null"] // [String] | Pass a list of filters to return the respective type of filter Regions. Accepted list values are \"structured\" and/or \"flattened\". If no _atrributes are specified, all filters will be returned in the response (this is the default response). 
};

// Call api endpoint
apiInstance.getStreetAccountFiltersRegions(opts).then(
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
 **attributes** | [**[String]**](String.md)| Pass a list of filters to return the respective type of filter Regions. Accepted list values are \&quot;structured\&quot; and/or \&quot;flattened\&quot;. If no _atrributes are specified, all filters will be returned in the response (this is the default response).  | [optional] 

### Return type

[**FilterRegionsResponse**](FilterRegionsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getStreetAccountFiltersSectors

> FilterSectorsResponse getStreetAccountFiltersSectors(opts)

Retrieve all StreetAccount filter sectors

If structured flag is set, parent and child filter information will be returned. If flattened flag is set, flattened filters will be returned which can be used with the headlines and createView endpoints. Both flags can be set to return both sets of filters.  If no params are provided it will return both.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, FiltersApi } = require('@factset/sdk-streetaccountnews');
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

const apiInstance = new FiltersApi();
const opts = {
  'attributes': ["null"] // [String] | Pass a list of filters to return the respective type of filter Sectors. Accepted list values are \"structured\" and/or \"flattened\". If no _atrributes are specified, all filters will be returned in the response (this is the default response). 
};

// Call api endpoint
apiInstance.getStreetAccountFiltersSectors(opts).then(
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
 **attributes** | [**[String]**](String.md)| Pass a list of filters to return the respective type of filter Sectors. Accepted list values are \&quot;structured\&quot; and/or \&quot;flattened\&quot;. If no _atrributes are specified, all filters will be returned in the response (this is the default response).  | [optional] 

### Return type

[**FilterSectorsResponse**](FilterSectorsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getStreetAccountFiltersTopics

> FilterTopicResponse getStreetAccountFiltersTopics(opts)

Retrieve all StreetAccount filter topics

If structured flag is set, parent and child filter information will be returned. If flattened flag is set, flattened filters will be returned which can be used with the headlines and createView endpoints. Both flags can be set to return both sets of filters.  If no params are provided it will return both.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, FiltersApi } = require('@factset/sdk-streetaccountnews');
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

const apiInstance = new FiltersApi();
const opts = {
  'attributes': ["null"] // [String] | Pass a list of filters to return the respective type of filter topics. Accepted list values are \"structured\" and/or \"flattened\". If no _atrributes are specified, all filters will be returned in the response (this is the default response). 
};

// Call api endpoint
apiInstance.getStreetAccountFiltersTopics(opts).then(
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
 **attributes** | [**[String]**](String.md)| Pass a list of filters to return the respective type of filter topics. Accepted list values are \&quot;structured\&quot; and/or \&quot;flattened\&quot;. If no _atrributes are specified, all filters will be returned in the response (this is the default response).  | [optional] 

### Return type

[**FilterTopicResponse**](FilterTopicResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getStreetAccountFiltersWatchlists

> FilterWatchlistsResponse getStreetAccountFiltersWatchlists(opts)

Retrieve all StreetAccount filter watchlists

If structured flag is set, parent and child filter information will be returned. If flattened flag is set, flattened filters will be returned which can be used with the headlines and createView endpoints. Both flags can be set to return both sets of filters.  If no params are provided it will return both.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, FiltersApi } = require('@factset/sdk-streetaccountnews');
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

const apiInstance = new FiltersApi();
const opts = {
  'attributes': ["null"] // [String] | Pass a list of filters to return the respective type of filter Watchlists. Accepted list values are \"structured\" and/or \"flattened\". If no _atrributes are specified, all filters will be returned in the response (this is the default response). 
};

// Call api endpoint
apiInstance.getStreetAccountFiltersWatchlists(opts).then(
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
 **attributes** | [**[String]**](String.md)| Pass a list of filters to return the respective type of filter Watchlists. Accepted list values are \&quot;structured\&quot; and/or \&quot;flattened\&quot;. If no _atrributes are specified, all filters will be returned in the response (this is the default response).  | [optional] 

### Return type

[**FilterWatchlistsResponse**](FilterWatchlistsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

