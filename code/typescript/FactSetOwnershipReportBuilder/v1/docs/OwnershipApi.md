# factsetownershipreportbuilder.OwnershipApi

All URIs are relative to *https://api.factset.com/report/ownership/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getOwnershipHolders**](OwnershipApi.md#getOwnershipHolders) | **GET** /holders | Holders of a company or fund
[**getOwnershipUltimateParent**](OwnershipApi.md#getOwnershipUltimateParent) | **GET** /ultimate-parent | Get FactSet&#39;s ownership breakdown about a specific security.  The returned table will display the institutions, insiders, funds, and beneficial owners that comprise the ownership of the provided security.  These holders will be grouped by the ultimate parent in their entity structure.



## getOwnershipHolders

> ResponseHolders getOwnershipHolders(id, opts)

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
const id = FDS-US; // String | Company or Fund Identifier
const opts = {
  'assetType': "'EQUITY'", // String | Controls the Asset Type of the data returned
  'holderType': "'INSTITUTIONS'", // String | Controls the Holder Type of the data returned
  'entityType': "'SECURITY'", // String | Controls the type of Entity data returned. Defaults to Security data, but can also be used to display Company data.
  'topn': ALL, // String | Limits the number of holders returned based on their Market Value position in the security. Default is ALL, otherwise use a valid number above 0. 
  'date': Tue Dec 31 00:00:00 UTC 2019 // Date | Top Holders as of date expressed in YYYY-MM-DD format. Defaults to latest month-end close; non-month-end dates are converted to month-end dates.
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
 **entityType** | **String**| Controls the type of Entity data returned. Defaults to Security data, but can also be used to display Company data. | [optional] [default to &#39;SECURITY&#39;]
 **topn** | **String**| Limits the number of holders returned based on their Market Value position in the security. Default is ALL, otherwise use a valid number above 0.  | [optional] 
 **date** | **Date**| Top Holders as of date expressed in YYYY-MM-DD format. Defaults to latest month-end close; non-month-end dates are converted to month-end dates. | [optional] 

### Return type

[**ResponseHolders**](ResponseHolders.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getOwnershipUltimateParent

> ResponseUltimateParent getOwnershipUltimateParent(id, opts)

Get FactSet&#39;s ownership breakdown about a specific security.  The returned table will display the institutions, insiders, funds, and beneficial owners that comprise the ownership of the provided security.  These holders will be grouped by the ultimate parent in their entity structure.

Get FactSet&#39;s ownership breakdown about a specific security.  The returned table will display the institutions, insiders, funds, and beneficial owners that comprise the ownership of the provided security.  These holders will be grouped by the ultimate parent in their entity structure.

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
const id = FDS-US; // String | Any valid FactSet identifier which points to a security.  This could be Ticker Region, Entity ID, CUSIP, or SEDOL. 
const opts = {
  'currency': LOCAL, // String | Currency ISO code that any currency-based data should be returned in.  If excluded, the value will default to the special keyword \"LOCAL\" which will cause the currency-based values to be calculated in currency which is local to the exchange it is traded on. 
  'attributes': ["percentOwnership","position","positionChange","marketValue","marketValueChange","percentPortfolio","reportDate","source","holderId"], // [String] | The columns to be returned in the resulting table
  'period': "'6m'", // String | The period over which we should return holdings for.
  'holderType': "'institutions'", // String | The holder types which should be included in this table
  'date': Tue Dec 31 00:00:00 UTC 2019 // Date | The date as of which this data should be returned. YYYY-MM-DD format. Defaults to current date.
};

// Call api endpoint
apiInstance.getOwnershipUltimateParent(id, opts).then(
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
 **id** | **String**| Any valid FactSet identifier which points to a security.  This could be Ticker Region, Entity ID, CUSIP, or SEDOL.  | 
 **currency** | **String**| Currency ISO code that any currency-based data should be returned in.  If excluded, the value will default to the special keyword \&quot;LOCAL\&quot; which will cause the currency-based values to be calculated in currency which is local to the exchange it is traded on.  | [optional] 
 **attributes** | [**[String]**](String.md)| The columns to be returned in the resulting table | [optional] 
 **period** | **String**| The period over which we should return holdings for. | [optional] [default to &#39;6m&#39;]
 **holderType** | **String**| The holder types which should be included in this table | [optional] [default to &#39;institutions&#39;]
 **date** | **Date**| The date as of which this data should be returned. YYYY-MM-DD format. Defaults to current date. | [optional] 

### Return type

[**ResponseUltimateParent**](ResponseUltimateParent.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

