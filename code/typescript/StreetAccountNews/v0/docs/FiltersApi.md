# streetaccountnews.FiltersApi

All URIs are relative to *https://api.factset.com/research/news/v0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getStreetAccountFilters**](FiltersApi.md#getStreetAccountFilters) | **GET** /streetaccount/filters | Retrieve all StreetAccount filters



## getStreetAccountFilters

> FilterResponse getStreetAccountFilters(opts)

Retrieve all StreetAccount filters

Add StreetAccount filters (watchlists, company filters, market topics, regions and sectors) to filter down StreetAccount headlines by the relevant categories. Set the structured and/or flattened flag. If structured flag is set, parent and child filter information will be returned. If flattened flag is set, flattened filters will be returned which can be used with the headlines and createView endpoints. Both flags can be set to return both sets of filters.  If no params are provided it will return both

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
  'structured': true, // Boolean | Pass structured to generate a structured view of the available filters.
  'flattened': true // Boolean | Pass flattened to generate a structured view of the available filters.
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
 **structured** | **Boolean**| Pass structured to generate a structured view of the available filters. | [optional] 
 **flattened** | **Boolean**| Pass flattened to generate a structured view of the available filters. | [optional] 

### Return type

[**FilterResponse**](FilterResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

