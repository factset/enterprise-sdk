# analyticsdatastore.MappingsApi

All URIs are relative to *https://api.factset.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getInsightMapping**](MappingsApi.md#getInsightMapping) | **GET** /analytics/pub-datastore/swivel/v1/{document}/{assetName}/{reportId}/{tileId}/{accountId}/{configId}/{date} | Redirects to the underlying Insight/Vault data in a Stach format.
[**getPdfPptMapping**](MappingsApi.md#getPdfPptMapping) | **GET** /analytics/pub-datastore/swivel/v1/{document}/{accountId}/{date} | Redirects to the raw PPT/PDF output created by the Publisher service.
[**getStachMapping**](MappingsApi.md#getStachMapping) | **GET** /analytics/pub-datastore/swivel/v1/{document}/{assetName}/{reportId}/{tileId}/{accountId}/{date} | Redirects to the underlying PA/SPAR data represented in a Stach format.
[**getStachMappingNoDate**](MappingsApi.md#getStachMappingNoDate) | **GET** /analytics/pub-datastore/swivel/v1/{document}/{assetName}/{reportId}/{tileId}/{accountId} | Redirects to the underlying PA/SPAR data represented in a Stach format, with no as of date specified.



## getInsightMapping

> getInsightMapping(document, assetName, reportId, tileId, accountId, configId, date)

Redirects to the underlying Insight/Vault data in a Stach format.

The inclusion of a configId in the path indicates this is for Insight/Vault mappings only, as PA/SPAR mappings do not support the concept of configuration id.    Takes report parameter inputs and returns the object location for the specified report via a 302 redirect.    Note: Due to Swagger UI functionality, the redirect is automatically followed when using &#39;Try it out&#39;, so instead of the 302 Header response, a 200 is returned with the Cargo response Body.

### Example

```javascript
const { ApiClient, MappingsApi } = require('@factset/sdk-analyticsdatastore');
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

const apiInstance = new MappingsApi();
const document = Analytics_Datastore; // String | The Analytics Datafeed document containing the report
const assetName = ADS_Demo.PA3; // String | The PA/SPAR asset name and extension
const reportId = report7; // String | The PA/SPAR report ID
const tileId = tile0; // String | The PA/SPAR tile ID
const accountId = LARGE_CORE; // String | The account ID
const configId = acb5150d-4333-49e7-8e33-4f7fa749691e; // String | The Vault configuration ID
const date = 2023-01-01; // Date | The as of date for the report

// Call api endpoint
apiInstance.getInsightMapping(document, assetName, reportId, tileId, accountId, configId, date).then(
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
 **document** | **String**| The Analytics Datafeed document containing the report | 
 **assetName** | **String**| The PA/SPAR asset name and extension | 
 **reportId** | **String**| The PA/SPAR report ID | 
 **tileId** | **String**| The PA/SPAR tile ID | 
 **accountId** | **String**| The account ID | 
 **configId** | **String**| The Vault configuration ID | 
 **date** | **Date**| The as of date for the report | 

### Return type

null (empty response body)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## getPdfPptMapping

> getPdfPptMapping(document, accountId, date)

Redirects to the raw PPT/PDF output created by the Publisher service.

Takes report parameter inputs and returns the object location for the specified report via a 302 redirect.    Note: Due to Swagger UI functionality, the redirect is automatically followed when using &#39;Try it out&#39;, so instead of the 302 Header response, a 200 is returned with the Cargo response Body.

### Example

```javascript
const { ApiClient, MappingsApi } = require('@factset/sdk-analyticsdatastore');
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

const apiInstance = new MappingsApi();
const document = Analytics_Datastore; // String | The Publisher document containing the report
const accountId = LARGE_CORE; // String | The account ID
const date = 2023-01-01; // Date | The as of date for the report

// Call api endpoint
apiInstance.getPdfPptMapping(document, accountId, date).then(
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
 **document** | **String**| The Publisher document containing the report | 
 **accountId** | **String**| The account ID | 
 **date** | **Date**| The as of date for the report | 

### Return type

null (empty response body)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## getStachMapping

> getStachMapping(document, assetName, reportId, tileId, accountId, date)

Redirects to the underlying PA/SPAR data represented in a Stach format.

Takes report parameter inputs and returns the object location for the specified report via a 302 redirect.    Note: Due to Swagger UI functionality, the redirect is automatically followed when using &#39;Try it out&#39;, so instead of the 302 Header response, a 200 is returned with the Cargo response Body.

### Example

```javascript
const { ApiClient, MappingsApi } = require('@factset/sdk-analyticsdatastore');
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

const apiInstance = new MappingsApi();
const document = Analytics_Datastore; // String | The Publisher or Analytics Datafeed document containing the report
const assetName = ADS_Demo.PA3; // String | The PA/SPAR asset name and extension
const reportId = report7; // String | The PA/SPAR report ID
const tileId = tile0; // String | The PA/SPAR tile ID
const accountId = LARGE_CORE; // String | The account ID
const date = 2023-01-01; // Date | The as of date for the report

// Call api endpoint
apiInstance.getStachMapping(document, assetName, reportId, tileId, accountId, date).then(
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
 **document** | **String**| The Publisher or Analytics Datafeed document containing the report | 
 **assetName** | **String**| The PA/SPAR asset name and extension | 
 **reportId** | **String**| The PA/SPAR report ID | 
 **tileId** | **String**| The PA/SPAR tile ID | 
 **accountId** | **String**| The account ID | 
 **date** | **Date**| The as of date for the report | 

### Return type

null (empty response body)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## getStachMappingNoDate

> getStachMappingNoDate(document, assetName, reportId, tileId, accountId)

Redirects to the underlying PA/SPAR data represented in a Stach format, with no as of date specified.

Takes report parameter inputs and returns the object location for the specified report via a 302 redirect.    Note: Due to Swagger UI functionality, the redirect is automatically followed when using &#39;Try it out&#39;, so instead of the 302 Header response, a 200 is returned with the Cargo response Body.

### Example

```javascript
const { ApiClient, MappingsApi } = require('@factset/sdk-analyticsdatastore');
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

const apiInstance = new MappingsApi();
const document = Analytics_Datastore; // String | The Publisher or Analytics Datafeed document containing the report
const assetName = ADS_Demo.PA3; // String | The PA/SPAR asset name and extension
const reportId = report7; // String | The PA/SPAR report ID
const tileId = tile0; // String | The PA/SPAR tile ID
const accountId = LARGE_CORE; // String | The account ID

// Call api endpoint
apiInstance.getStachMappingNoDate(document, assetName, reportId, tileId, accountId).then(
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
 **document** | **String**| The Publisher or Analytics Datafeed document containing the report | 
 **assetName** | **String**| The PA/SPAR asset name and extension | 
 **reportId** | **String**| The PA/SPAR report ID | 
 **tileId** | **String**| The PA/SPAR tile ID | 
 **accountId** | **String**| The account ID | 

### Return type

null (empty response body)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

