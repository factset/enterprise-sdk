# factsetsupplychain.SupplyChainApi

All URIs are relative to *https://api.factset.com/content/factset-supply-chain/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listSupplyChain**](SupplyChainApi.md#listSupplyChain) | **GET** /supply-chain | Get supply chain relationships for requested entities.
[**listSupplyChainForList**](SupplyChainApi.md#listSupplyChainForList) | **POST** /supply-chain | Get supply chain relationships for a large list of entity IDs.



## listSupplyChain

> SupplyChainResponse listSupplyChain(ids, opts)

Get supply chain relationships for requested entities.

Retrieve supplier and customer relationships for the requested entity or entities.  Includes:  - subsidiaries - revenue percentages - relevance grades - centrality measures - relationship keywords  Use the &#x60;relationshipType&#x60; parameter to filter by:  - &#x60;CUSTOMER&#x60; - &#x60;SUPPLIER&#x60;  Historical data can be accessed only with the Historical product subscription. If the product is not subscribed, data for the latest available period will be returned. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, SupplyChainApi } = require('@factset/sdk-factsetsupplychain');
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

const apiInstance = new SupplyChainApi();
const ids = ["000C7F-E"]; // [String] | The requested identifier. FactSet identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs.<p><strong>IDs limit</strong> = 20 per non-batch request and 1000 per batch request.</p><p>Make note, <strong>GET</strong> Method URL request lines are also limited to a total length of 8192 bytes (8 KB). In cases where the service allows for large numbers of IDs, which may lead to exceeding this request line limit of 8 KB, it is advised that requests with large request lines be made through the respective <strong>POST</strong> method.</p>
const opts = {
  'relationshipType': CUSTOMER, // SupplyChainRelationshipType | Controls the type of supply chain relationship returned.   * **CUSTOMER** = Returns entities to which the source company sells products/services.   * **SUPPLIER** = Returns entities from which the source company purchases goods or services.
  'date': 2025-12-31, // Date | The date requested in YYYY-MM-DD format. If left blank, the API will default to the most recent available data. Future dates (T+1) are not accepted in this endpoint.
  'fields': [new factsetsupplychain.SupplyChainFieldsEnum()], // [SupplyChainFieldsEnum] | A specific set of attributes to return in the response. If omitted, all fields are returned. 
  'batch': new factsetsupplychain.Batch(), // Batch | Enables the ability to asynchronously \"batch\" the request, supporting a long-running request for up to 20 minutes. Upon requesting batch=Y, the service will respond with an HTTP Status Code of 202. Once a batch request is submitted, use the corresponding `/batch-status` endpoint to see if the job has been completed. Once completed, retrieve the results of the request via the `/batch-result` endpoint. 
  'paginationLimit': 5, // Number | Specifies the number of results to return per page.
  'paginationOffset': 0 // Number | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results.
};

// Call api endpoint
apiInstance.listSupplyChain(ids, opts).then(
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
 **relationshipType** | [**SupplyChainRelationshipType**](.md)| Controls the type of supply chain relationship returned.   * **CUSTOMER** &#x3D; Returns entities to which the source company sells products/services.   * **SUPPLIER** &#x3D; Returns entities from which the source company purchases goods or services. | [optional] 
 **date** | **Date**| The date requested in YYYY-MM-DD format. If left blank, the API will default to the most recent available data. Future dates (T+1) are not accepted in this endpoint. | [optional] 
 **fields** | [**[SupplyChainFieldsEnum]**](SupplyChainFieldsEnum.md)| A specific set of attributes to return in the response. If omitted, all fields are returned.  | [optional] 
 **batch** | [**Batch**](.md)| Enables the ability to asynchronously \&quot;batch\&quot; the request, supporting a long-running request for up to 20 minutes. Upon requesting batch&#x3D;Y, the service will respond with an HTTP Status Code of 202. Once a batch request is submitted, use the corresponding &#x60;/batch-status&#x60; endpoint to see if the job has been completed. Once completed, retrieve the results of the request via the &#x60;/batch-result&#x60; endpoint.  | [optional] 
 **paginationLimit** | **Number**| Specifies the number of results to return per page. | [optional] [default to 5]
 **paginationOffset** | **Number**| Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. | [optional] [default to 0]

### Return type

[**SupplyChainResponse**](SupplyChainResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## listSupplyChainForList

> SupplyChainResponse listSupplyChainForList(supplyChainRequest)

Get supply chain relationships for a large list of entity IDs.

Retrieve supplier and customer relationships for a large list of entity IDs.  Includes:  - subsidiaries - revenue percentages - relevance grades - centrality measures - relationship keywords  Use the &#x60;relationshipType&#x60; parameter to filter by:  - &#x60;CUSTOMER&#x60; - &#x60;SUPPLIER&#x60;  Historical data can be accessed only with the Historical product subscription. If the product is not subscribed, data for the latest available period will be returned. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, SupplyChainApi } = require('@factset/sdk-factsetsupplychain');
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

const apiInstance = new SupplyChainApi();
const supplyChainRequest = new factsetsupplychain.SupplyChainRequest(); // SupplyChainRequest | The Supply Chain request body, allowing the user to specify a list of IDs.

// Call api endpoint
apiInstance.listSupplyChainForList(supplyChainRequest).then(
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
 **supplyChainRequest** | [**SupplyChainRequest**](SupplyChainRequest.md)| The Supply Chain request body, allowing the user to specify a list of IDs. | 

### Return type

[**SupplyChainResponse**](SupplyChainResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

