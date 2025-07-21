# factsetsupplychain.RelationshipsApi

All URIs are relative to *https://api.factset.com/content/factset-supply-chain/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getRelationships**](RelationshipsApi.md#getRelationships) | **GET** /relationships | Returns Supply Chain Relationships Data.
[**getRelationshipsForList**](RelationshipsApi.md#getRelationshipsForList) | **POST** /relationships | Returns Supply Chain Relationships Data.



## getRelationships

> RelationshipsResponse getRelationships(ids, relationshipType, opts)

Returns Supply Chain Relationships Data.

Retrieves Supply Chain Relationship data (current only). Results are first sorted by the number of overlapping products between companies, then by the percentage of overlap. 

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
const relationshipType = SUPPLIERS; // String |  The category describing how the source company is connected to another organization. Use this parameter to filter results based on the business relationship type. Defined as:    * **SUPPLIERS** = An organization that provides goods or services to the source company. The source company acts as the buyer in this relationship. (inverse of \"Customer\" relationships.)   * **COMPETITORS** = An organization explicitly identified by the source company as a rival, usually operating in the same market or industry sector.   * **CUSTOMERS** = An organization that receives goods or services from the source company. The source company acts as the seller in this relationship. (Reverse of \"Supplier\" relationships.)   * **PARTNERS** = An organization in which the source company holds an ownership interest (i.e., the source company owns shares or equity in the partner). This is the counterpart to an investor relationship, where the external party has an ownership interest in the source company. 
const opts = {
  'companyType': PUBLIC_COMPANIES_ONLY, // String | Specifies the category of companies to include when filtering results:   * **PUBLIC_COMPANIES_ONLY**: Include only relationships involving companies that are publicly traded.            * **PRIVATE_COMPANIES_ONLY**: Include only relationships involving companies that are privately held (not publicly traded).            * **ALL**: Include relationships involving both public and private companies. 
  'relationshipDirection': ALL // String | Filters the list of available relationship directions -   * **ALL** = Include both direct and reverse relationships.   * **DIRECT** = Include only relationships where the source company identified and named the connection to the target company.   * **REVERSE** = Include only relationships where the target company identified and named the connection to the source company. 
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
 **relationshipType** | **String**|  The category describing how the source company is connected to another organization. Use this parameter to filter results based on the business relationship type. Defined as:    * **SUPPLIERS** &#x3D; An organization that provides goods or services to the source company. The source company acts as the buyer in this relationship. (inverse of \&quot;Customer\&quot; relationships.)   * **COMPETITORS** &#x3D; An organization explicitly identified by the source company as a rival, usually operating in the same market or industry sector.   * **CUSTOMERS** &#x3D; An organization that receives goods or services from the source company. The source company acts as the seller in this relationship. (Reverse of \&quot;Supplier\&quot; relationships.)   * **PARTNERS** &#x3D; An organization in which the source company holds an ownership interest (i.e., the source company owns shares or equity in the partner). This is the counterpart to an investor relationship, where the external party has an ownership interest in the source company.  | [default to &#39;SUPPLIERS&#39;]
 **companyType** | **String**| Specifies the category of companies to include when filtering results:   * **PUBLIC_COMPANIES_ONLY**: Include only relationships involving companies that are publicly traded.            * **PRIVATE_COMPANIES_ONLY**: Include only relationships involving companies that are privately held (not publicly traded).            * **ALL**: Include relationships involving both public and private companies.  | [optional] [default to &#39;PUBLIC_COMPANIES_ONLY&#39;]
 **relationshipDirection** | **String**| Filters the list of available relationship directions -   * **ALL** &#x3D; Include both direct and reverse relationships.   * **DIRECT** &#x3D; Include only relationships where the source company identified and named the connection to the target company.   * **REVERSE** &#x3D; Include only relationships where the target company identified and named the connection to the source company.  | [optional] [default to &#39;ALL&#39;]

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

Retrieves Supply Chain Relationship data (current only). Results are first sorted by the number of overlapping products between companies, then by the percentage of overlap. 

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

