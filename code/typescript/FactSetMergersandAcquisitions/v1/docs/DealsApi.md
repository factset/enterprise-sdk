# factsetmergersandacquisitions.DealsApi

All URIs are relative to *https://api.factset.com/content/factset-mergers-acquisitions/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDealsByCompanyList**](DealsApi.md#getDealsByCompanyList) | **POST** /deals/by-company | Returns details for a list of companies.
[**getDealsDetailsList**](DealsApi.md#getDealsDetailsList) | **POST** /deals/details | Returns details for specified deals.
[**getPublicTargetDealsList**](DealsApi.md#getPublicTargetDealsList) | **POST** /deals/public-targets | Returns a list of deals in which the target is a public company.



## getDealsByCompanyList

> DealsResponse getDealsByCompanyList(dealsRequest)

Returns details for a list of companies.

Gets deals for a specified list of companies within a date range. Deals returned are any in which the requested company is involved as either the buyer, seller, or target. The start and end date parameters will find deals based on their announcement date. The response of this endpoint includes &#x60;dealId&#x60; which can be sent to the &#x60;/deals/details&#x60; endpoint for more information about the deal. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, DealsApi } = require('@factset/sdk-factsetmergersandacquisitions');
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

const apiInstance = new DealsApi();
const dealsRequest = new factsetmergersandacquisitions.DealsRequest(); // DealsRequest | Request object for `Deals`.

// Call api endpoint
apiInstance.getDealsByCompanyList(dealsRequest).then(
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
 **dealsRequest** | [**DealsRequest**](DealsRequest.md)| Request object for &#x60;Deals&#x60;. | 

### Return type

[**DealsResponse**](DealsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## getDealsDetailsList

> DetailsResponse getDealsDetailsList(detailsRequest)

Returns details for specified deals.

Gets deal details for a specified list of FactSet deal identifiers. Monetary values returned by this API are converted and represented in USD. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, DealsApi } = require('@factset/sdk-factsetmergersandacquisitions');
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

const apiInstance = new DealsApi();
const detailsRequest = new factsetmergersandacquisitions.DetailsRequest(); // DetailsRequest | Request object for `Deal Details`.

// Call api endpoint
apiInstance.getDealsDetailsList(detailsRequest).then(
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
 **detailsRequest** | [**DetailsRequest**](DetailsRequest.md)| Request object for &#x60;Deal Details&#x60;. | 

### Return type

[**DetailsResponse**](DetailsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## getPublicTargetDealsList

> DealsPublicResponse getPublicTargetDealsList(dealsPublicRequest)

Returns a list of deals in which the target is a public company.

Gets deals in which the target is a public company for a specified date range and status. The start and end date parameters will find deals based on their announcement date. The response of this endpoint includes &#x60;dealId&#x60; which can be sent to the &#x60;/deals/details&#x60; endpoint for more information about the deal. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, DealsApi } = require('@factset/sdk-factsetmergersandacquisitions');
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

const apiInstance = new DealsApi();
const dealsPublicRequest = new factsetmergersandacquisitions.DealsPublicRequest(); // DealsPublicRequest | Request object for `Deals`.

// Call api endpoint
apiInstance.getPublicTargetDealsList(dealsPublicRequest).then(
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
 **dealsPublicRequest** | [**DealsPublicRequest**](DealsPublicRequest.md)| Request object for &#x60;Deals&#x60;. | 

### Return type

[**DealsPublicResponse**](DealsPublicResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

