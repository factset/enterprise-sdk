# factsetrbics.StructureApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getRbicsStructure**](StructureApi.md#getRbicsStructure) | **GET** /factset-rbics/v1/structure | Get the full RBICS Taxonomy Structure Ids, Names, and effective periods.
[**getRbicsStructureForList**](StructureApi.md#getRbicsStructureForList) | **POST** /factset-rbics/v1/structure | Get the full RBICS Taxonomy Structure Ids, Names, and effective periods.



## getRbicsStructure

> StructureResponse getRbicsStructure(opts)

Get the full RBICS Taxonomy Structure Ids, Names, and effective periods.

Understand the full RBICS Taxonomy Structure through time to help organize your analysis or facilitate the use of RBICS in application development.  Designed to overcome disparate and non-standardized company disclosures, the RBICS taxonomy is a normalized global industry classification consisting of a fourteen-by-six matrix. There are twelve economies with two specialty sectors, each with six incremental detailed layers, resulting in over 1,600 sector groups.  The top-levels&#39; market-defined approach groups companies based on their behavioral similarities and stock price co-movement, while the patented product-based approach used in the lower levels enables the necessary precision to capture the specialty sectors of global markets. 

### Example

```javascript
const { ApiClient, StructureApi } = require('@factset/sdk-factsetrbics');
const { ConfidentialClient } = require('@factset/sdk-utils');

const apiClient = ApiClient.instance;

// Examples for each supported authentication method are below,
// choose one that satisfies your use case.

// (Preferred) OAuth 2.0: FactSetOAuth2
// See https://github.com/FactSet/enterprise-sdk#oauth-20
// for information on how to create the app-config.json file
// See https://github.com/FactSet/enterprise-sdk-utils-typescript#authentication
// for more information on using the ConfidentialClient class
apiClient.factsetOauth2Client = new ConfidentialClient('/path/to/app-config.json');

// Basic authentication: FactSetApiKey
// See https://github.com/FactSet/enterprise-sdk#api-key
// for information how to create an API key
// const FactSetApiKey = apiClient.authentications['FactSetApiKey'];
// FactSetApiKey.username = 'USERNAME-SERIAL';
// FactSetApiKey.password = 'API-KEY';

const apiInstance = new StructureApi();
const opts = {
  'rbicsIds': ["101010000000","55"], // [String] | RBICS Taxonomy Id Filter. Use to lookup the structure details for the Id requested. 
  'level': 1, // Number | RBICS industry levels to include in the response. All levels from 1-N will be returned. For example, '3' returns all levels 1,2 and 3. To request all levels, request level=6. Level 1 is returned by default.   |Level|Description|Number of Groups|   |---|---|---|   |1|Economomy|14|   |2|Sector|37   |3|Sub-Sector|109|   |4|Industry Group|366|   |5|Inudstry|901|   |6|Sub-Industry|1629| 
  'includeNames': true, // Boolean | Option to include or exclude industry Names and the L6 Description. true = Include Names; false = Exclude Names.
  'date': 2017-07-24 // String | Effective date for data expressed in YYYY-MM-DD format. If no date is requested, the default behavior is to return the full history for the requested entity.
};

// Call api endpoint
apiInstance.getRbicsStructure(opts).then(
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
 **rbicsIds** | [**[String]**](String.md)| RBICS Taxonomy Id Filter. Use to lookup the structure details for the Id requested.  | [optional] 
 **level** | **Number**| RBICS industry levels to include in the response. All levels from 1-N will be returned. For example, &#39;3&#39; returns all levels 1,2 and 3. To request all levels, request level&#x3D;6. Level 1 is returned by default.   |Level|Description|Number of Groups|   |---|---|---|   |1|Economomy|14|   |2|Sector|37   |3|Sub-Sector|109|   |4|Industry Group|366|   |5|Inudstry|901|   |6|Sub-Industry|1629|  | [optional] 
 **includeNames** | **Boolean**| Option to include or exclude industry Names and the L6 Description. true &#x3D; Include Names; false &#x3D; Exclude Names. | [optional] [default to true]
 **date** | **String**| Effective date for data expressed in YYYY-MM-DD format. If no date is requested, the default behavior is to return the full history for the requested entity. | [optional] 

### Return type

[**StructureResponse**](StructureResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getRbicsStructureForList

> StructureResponse getRbicsStructureForList(structureRequest)

Get the full RBICS Taxonomy Structure Ids, Names, and effective periods.

Get the full RBICS Taxonomy Structure Ids, Names, and effective periods. POST method is optimal for requesting large lists of &#x60;rbicsIds&#x60;. 

### Example

```javascript
const { ApiClient, StructureApi } = require('@factset/sdk-factsetrbics');
const { ConfidentialClient } = require('@factset/sdk-utils');

const apiClient = ApiClient.instance;

// Examples for each supported authentication method are below,
// choose one that satisfies your use case.

// (Preferred) OAuth 2.0: FactSetOAuth2
// See https://github.com/FactSet/enterprise-sdk#oauth-20
// for information on how to create the app-config.json file
// See https://github.com/FactSet/enterprise-sdk-utils-typescript#authentication
// for more information on using the ConfidentialClient class
apiClient.factsetOauth2Client = new ConfidentialClient('/path/to/app-config.json');

// Basic authentication: FactSetApiKey
// See https://github.com/FactSet/enterprise-sdk#api-key
// for information how to create an API key
// const FactSetApiKey = apiClient.authentications['FactSetApiKey'];
// FactSetApiKey.username = 'USERNAME-SERIAL';
// FactSetApiKey.password = 'API-KEY';

const apiInstance = new StructureApi();
const structureRequest = new factsetrbics.StructureRequest(); // StructureRequest | Request Body to request a list of RBICS Structure objects.

// Call api endpoint
apiInstance.getRbicsStructureForList(structureRequest).then(
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
 **structureRequest** | [**StructureRequest**](StructureRequest.md)| Request Body to request a list of RBICS Structure objects. | 

### Return type

[**StructureResponse**](StructureResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

