# factsetsupplychain.RelationshipsApi

All URIs are relative to *https://api.factset.com/content/factset-supply-chain/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getRelationships**](RelationshipsApi.md#getRelationships) | **GET** /relationships | Returns Supply Chain Relationships Data.
[**getRelationshipsForList**](RelationshipsApi.md#getRelationshipsForList) | **POST** /relationships | Returns Supply Chain Relationships Data.



## getRelationships

> RelationshipsResponse getRelationships(ids, relationshipType, opts)

Returns Supply Chain Relationships Data.

Returns Supply Chain Relationships Data. This data is sorted primarily by the number of overlapping products, followed by the overlap percentage. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, RelationshipsApi } = require('@factset/sdk-factsetsupplychain');
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

const apiInstance = new RelationshipsApi();
const ids = ["AAPL-USA"]; // [String] | The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent Ids. * Make Note - id limit of 500 
const relationshipType = SUPPLIERS; // String | Specifies the type of relationship to filter the results  -   * **SUPPLIERS** = Entities from which the source company purchases goods or services; the opposite of “Customer” relationship.   * **COMPETITORS** = Entities disclosed by the source company as competitors.   * **CUSTOMERS** = Entities to which the source company sells products/services; the “opposite” of Supplier relationship.   * **PARTNERS** = Entities in which the source company owns an equity stake (“opposite” of an Investor relationship). 
const opts = {
  'companyType': PUBLIC_COMPANIES_ONLY, // String | Specifies the type of companies to filter by  -   * **PUBLIC_COMPANIES_ONLY** = Display public company relationships only.   * **PRIVATE_COMPANIES_ONLY** = Display private company relationships only.   * **ALL** = Display public and private company relationships. 
  'relationshipDirection': ALL // String | Filters the list of available relationship directions -   * **ALL** = All relationship directions.   * **DIRECT** = Direct indicates that the source company named the relationship.   * **REVERSE** = Reverse indicates that the target company named the relationship. 
};

// Call api endpoint
apiInstance.getRelationships(ids, relationshipType, opts).then(
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
 **ids** | [**[String]**](String.md)| The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent Ids. * Make Note - id limit of 500  | 
 **relationshipType** | **String**| Specifies the type of relationship to filter the results  -   * **SUPPLIERS** &#x3D; Entities from which the source company purchases goods or services; the opposite of “Customer” relationship.   * **COMPETITORS** &#x3D; Entities disclosed by the source company as competitors.   * **CUSTOMERS** &#x3D; Entities to which the source company sells products/services; the “opposite” of Supplier relationship.   * **PARTNERS** &#x3D; Entities in which the source company owns an equity stake (“opposite” of an Investor relationship).  | [default to &#39;SUPPLIERS&#39;]
 **companyType** | **String**| Specifies the type of companies to filter by  -   * **PUBLIC_COMPANIES_ONLY** &#x3D; Display public company relationships only.   * **PRIVATE_COMPANIES_ONLY** &#x3D; Display private company relationships only.   * **ALL** &#x3D; Display public and private company relationships.  | [optional] [default to &#39;PUBLIC_COMPANIES_ONLY&#39;]
 **relationshipDirection** | **String**| Filters the list of available relationship directions -   * **ALL** &#x3D; All relationship directions.   * **DIRECT** &#x3D; Direct indicates that the source company named the relationship.   * **REVERSE** &#x3D; Reverse indicates that the target company named the relationship.  | [optional] [default to &#39;ALL&#39;]

### Return type

[**RelationshipsResponse**](RelationshipsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getRelationshipsForList

> RelationshipsResponse getRelationshipsForList(relationshipsRequest)

Returns Supply Chain Relationships Data.

Returns Supply Chain Relationships Data. This data is sorted primarily by the number of overlapping products, followed by the overlap percentage. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, RelationshipsApi } = require('@factset/sdk-factsetsupplychain');
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

const apiInstance = new RelationshipsApi();
const relationshipsRequest = new factsetsupplychain.RelationshipsRequest(); // RelationshipsRequest | Request body to request a list of Supply Chain financials objects.

// Call api endpoint
apiInstance.getRelationshipsForList(relationshipsRequest).then(
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
 **relationshipsRequest** | [**RelationshipsRequest**](RelationshipsRequest.md)| Request body to request a list of Supply Chain financials objects. | 

### Return type

[**RelationshipsResponse**](RelationshipsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

