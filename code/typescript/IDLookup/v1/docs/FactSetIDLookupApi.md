# idlookup.FactSetIDLookupApi

All URIs are relative to *https://api.factset.com/idsearch*

Method | HTTP request | Description
------------- | ------------- | -------------
[**searchCompanyname**](FactSetIDLookupApi.md#searchCompanyname) | **POST** /v1/idsearch | Search funtionality to return tickers, company names and unique identifiers for FactSet data



## searchCompanyname

> LookupResponse searchCompanyname(lookupRequest)

Search funtionality to return tickers, company names and unique identifiers for FactSet data

Service will accept request in JSON formatted request body. The request is sent by passing a query which is an array conitaining search query objects with parameters. The parameters contain search term and filters defined by the end user. This would display a specific set of identifiers based on the request. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, FactSetIDLookupApi } = require('@factset/sdk-idlookup');
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

const apiInstance = new FactSetIDLookupApi();
const lookupRequest = new idlookup.LookupRequest(); // LookupRequest | Post body to lookup any FactSet identifiers

// Call api endpoint
apiInstance.searchCompanyname(lookupRequest).then(
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
 **lookupRequest** | [**LookupRequest**](LookupRequest.md)| Post body to lookup any FactSet identifiers | 

### Return type

[**LookupResponse**](LookupResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

