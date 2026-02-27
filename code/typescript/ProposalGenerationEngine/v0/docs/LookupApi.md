# proposalgenerationengine.LookupApi

All URIs are relative to *https://api.factset.com/analytics/engines/proposal-generation/v0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getSecurities**](LookupApi.md#getSecurities) | **GET** /securities | 



## getSecurities

> PagedSecurities getSecurities(opts)



search for securities within the security universe for the user/client

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, LookupApi } = require('@factset/sdk-proposalgenerationengine');
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

const apiInstance = new LookupApi();
const opts = {
  'name': Amazon, // String | search by (part of) security name
  'identifier': AMZN, // String | search by security identifier (e.g. cusip or tradingSymbol).
  'asOfDate': latestMonthEnd, // String | search only within valid securities for the specified asOfDate. The value should be in YYYY-MM-DD format. A special wildcard value 'latestMonthEnd' is supported as well
  'udfs': maxFrontLoad,assetAllocation, // String | specify list of UDFs to retrieve for every security in the result
  'paginationOffset': 500, // Number | Specifies the starting index for pagination.
  'paginationLimit': 56 // Number | Specifies the maximum number of results to return
};

// Call api endpoint
apiInstance.getSecurities(opts).then(
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
 **name** | **String**| search by (part of) security name | [optional] 
 **identifier** | **String**| search by security identifier (e.g. cusip or tradingSymbol). | [optional] 
 **asOfDate** | **String**| search only within valid securities for the specified asOfDate. The value should be in YYYY-MM-DD format. A special wildcard value &#39;latestMonthEnd&#39; is supported as well | [optional] 
 **udfs** | **String**| specify list of UDFs to retrieve for every security in the result | [optional] 
 **paginationOffset** | **Number**| Specifies the starting index for pagination. | [optional] 
 **paginationLimit** | **Number**| Specifies the maximum number of results to return | [optional] 

### Return type

[**PagedSecurities**](PagedSecurities.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

