# factsetownershipreportbuilder.OwnershipApi

All URIs are relative to *https://api.factset.com/report/ownership/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getOwnershipHolders**](OwnershipApi.md#getOwnershipHolders) | **GET** /holders | Holders of a company or fund



## getOwnershipHolders

> Response getOwnershipHolders(id, opts)

Holders of a company or fund

Holders of a company or fund

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, OwnershipApi } = require('@factset/sdk-factsetownershipreportbuilder');
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

const apiInstance = new OwnershipApi();
const id = FDS; // String | Company or Fund Identifier
const opts = {
  'assetType': "'EQUITY'", // String | Controls the Asset Type of the data returned
  'holderType': "'INSTITUTIONS'", // String | Controls the Holder Type of the data returned
  'topn': ALL, // String | Limits the number of holders returned based on their Market Value position in the security.   Default is ALL, otherwise use a valid number above 0. 
  'date': 2019-12-31 // String | Top Holders as of date expressed in YYYY-MM-DD format. Defaults to latest month-end close; non-month-end dates are converted to month-end dates.
};

// Call api endpoint
apiInstance.getOwnershipHolders(id, opts).then(
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
 **id** | **String**| Company or Fund Identifier | 
 **assetType** | **String**| Controls the Asset Type of the data returned | [optional] [default to &#39;EQUITY&#39;]
 **holderType** | **String**| Controls the Holder Type of the data returned | [optional] [default to &#39;INSTITUTIONS&#39;]
 **topn** | **String**| Limits the number of holders returned based on their Market Value position in the security.   Default is ALL, otherwise use a valid number above 0.  | [optional] 
 **date** | **String**| Top Holders as of date expressed in YYYY-MM-DD format. Defaults to latest month-end close; non-month-end dates are converted to month-end dates. | [optional] 

### Return type

[**Response**](Response.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

