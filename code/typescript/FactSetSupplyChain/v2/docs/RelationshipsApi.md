# factsetsupplychain.RelationshipsApi

All URIs are relative to *https://api.factset.com/content/factset-supply-chain/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listRelationships**](RelationshipsApi.md#listRelationships) | **GET** /relationships | Get competitor or partner relationships for requested entities.
[**listRelationshipsForList**](RelationshipsApi.md#listRelationshipsForList) | **POST** /relationships | Get competitor or partner relationships for a large list of entity IDs.



## listRelationships

> RelationshipsResponse listRelationships(ids, opts)

Get competitor or partner relationships for requested entities.

Retrieve competitor or partner relationships for the requested entity or entities.  Use the &#x60;relationshipType&#x60; parameter to select one or more relationship types.  Historical data can be accessed only with the Historical product subscription. If the product is not subscribed, data for the latest available period will be returned. 

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
const ids = ["000C7F-E"]; // [String] | The requested identifier. FactSet identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs.<p><strong>IDs limit</strong> = 20 per non-batch request and 1000 per batch request.</p><p>Make note, <strong>GET</strong> Method URL request lines are also limited to a total length of 8192 bytes (8 KB). In cases where the service allows for large numbers of IDs, which may lead to exceeding this request line limit of 8 KB, it is advised that requests with large request lines be made through the respective <strong>POST</strong> method.</p>
const opts = {
  'relationshipType': ["COMPETITOR","PARTNER_MARKETING"], // [RelationshipTypeEnum] | Controls the relationship types returned in the response. Multiple relationship types can be selected simultaneously.    * **COMPETITOR** = Returns entities disclosed by the source company as competitors or rivals.    * **ALL_PARTNERS** = Returns all available partner relationship types in a single response.    * **PARTNER_DISTRIBUTION** = Returns distribution partnership relationships.    * **PARTNER_EQUITY_INVESTMENT** = Returns equity investment partnership relationships.    * **PARTNER_INTEGRATED_PRODUCT_OFFERING** = Returns integrated product offering partnerships.    * **PARTNER_INVESTORS** = Returns investor-related partnership relationships.    * **PARTNER_JOINT_VENTURE** = Returns joint venture partnership relationships.    * **PARTNER_IN_LICENSING** = Returns in-licensing partnership relationships.    * **PARTNER_OUT_LICENSING** = Returns out-licensing partnership relationships.    * **PARTNER_MANUFACTURING** = Returns manufacturing partnership relationships.    * **PARTNER_MARKETING** = Returns marketing partnership relationships.    * **PARTNER_RESEARCH_COLLABORATION** = Returns research collaboration partnership relationships.
  'date': 2025-12-31, // Date | The date requested in YYYY-MM-DD format. If left blank, the API will default to the most recent available data. Future dates (T+1) are not accepted in this endpoint.
  'fields': [new factsetsupplychain.RelationshipsFieldsEnum()], // [RelationshipsFieldsEnum] | A specific set of attributes to return in the response. If omitted, all fields are returned. 
  'batch': new factsetsupplychain.Batch(), // Batch | Enables the ability to asynchronously \"batch\" the request, supporting a long-running request for up to 20 minutes. Upon requesting batch=Y, the service will respond with an HTTP Status Code of 202. Once a batch request is submitted, use the corresponding `/batch-status` endpoint to see if the job has been completed. Once completed, retrieve the results of the request via the `/batch-result` endpoint. 
  'paginationLimit': 5, // Number | Specifies the number of results to return per page.
  'paginationOffset': 0 // Number | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results.
};

// Call api endpoint
apiInstance.listRelationships(ids, opts).then(
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
 **ids** | [**[String]**](String.md)| The requested identifier. FactSet identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs.&lt;p&gt;&lt;strong&gt;IDs limit&lt;/strong&gt; &#x3D; 20 per non-batch request and 1000 per batch request.&lt;/p&gt;&lt;p&gt;Make note, &lt;strong&gt;GET&lt;/strong&gt; Method URL request lines are also limited to a total length of 8192 bytes (8 KB). In cases where the service allows for large numbers of IDs, which may lead to exceeding this request line limit of 8 KB, it is advised that requests with large request lines be made through the respective &lt;strong&gt;POST&lt;/strong&gt; method.&lt;/p&gt; | 
 **relationshipType** | [**[RelationshipTypeEnum]**](RelationshipTypeEnum.md)| Controls the relationship types returned in the response. Multiple relationship types can be selected simultaneously.    * **COMPETITOR** &#x3D; Returns entities disclosed by the source company as competitors or rivals.    * **ALL_PARTNERS** &#x3D; Returns all available partner relationship types in a single response.    * **PARTNER_DISTRIBUTION** &#x3D; Returns distribution partnership relationships.    * **PARTNER_EQUITY_INVESTMENT** &#x3D; Returns equity investment partnership relationships.    * **PARTNER_INTEGRATED_PRODUCT_OFFERING** &#x3D; Returns integrated product offering partnerships.    * **PARTNER_INVESTORS** &#x3D; Returns investor-related partnership relationships.    * **PARTNER_JOINT_VENTURE** &#x3D; Returns joint venture partnership relationships.    * **PARTNER_IN_LICENSING** &#x3D; Returns in-licensing partnership relationships.    * **PARTNER_OUT_LICENSING** &#x3D; Returns out-licensing partnership relationships.    * **PARTNER_MANUFACTURING** &#x3D; Returns manufacturing partnership relationships.    * **PARTNER_MARKETING** &#x3D; Returns marketing partnership relationships.    * **PARTNER_RESEARCH_COLLABORATION** &#x3D; Returns research collaboration partnership relationships. | [optional] 
 **date** | **Date**| The date requested in YYYY-MM-DD format. If left blank, the API will default to the most recent available data. Future dates (T+1) are not accepted in this endpoint. | [optional] 
 **fields** | [**[RelationshipsFieldsEnum]**](RelationshipsFieldsEnum.md)| A specific set of attributes to return in the response. If omitted, all fields are returned.  | [optional] 
 **batch** | [**Batch**](.md)| Enables the ability to asynchronously \&quot;batch\&quot; the request, supporting a long-running request for up to 20 minutes. Upon requesting batch&#x3D;Y, the service will respond with an HTTP Status Code of 202. Once a batch request is submitted, use the corresponding &#x60;/batch-status&#x60; endpoint to see if the job has been completed. Once completed, retrieve the results of the request via the &#x60;/batch-result&#x60; endpoint.  | [optional] 
 **paginationLimit** | **Number**| Specifies the number of results to return per page. | [optional] [default to 5]
 **paginationOffset** | **Number**| Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. | [optional] [default to 0]

### Return type

[**RelationshipsResponse**](RelationshipsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## listRelationshipsForList

> RelationshipsResponse listRelationshipsForList(relationshipsRequest)

Get competitor or partner relationships for a large list of entity IDs.

Retrieve competitor or partner relationships for the requested entity or entities.  Use the &#x60;relationshipType&#x60; parameter to select one or more relationship types.  Historical data can be accessed only with the Historical product subscription. If the product is not subscribed, data for the latest available period will be returned. 

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
const relationshipsRequest = new factsetsupplychain.RelationshipsRequest(); // RelationshipsRequest | The Relationships request body, allowing the user to specify a list of IDs and relationship type.

// Call api endpoint
apiInstance.listRelationshipsForList(relationshipsRequest).then(
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
 **relationshipsRequest** | [**RelationshipsRequest**](RelationshipsRequest.md)| The Relationships request body, allowing the user to specify a list of IDs and relationship type. | 

### Return type

[**RelationshipsResponse**](RelationshipsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

