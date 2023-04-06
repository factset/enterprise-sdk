# factsetconcordance.EntityMappingsApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getEntityMappingDeleteForList**](EntityMappingsApi.md#getEntityMappingDeleteForList) | **POST** /factset-concordance/v2/entity-mapping-delete | Deletes mapping specified by the client.
[**getEntityMappingForList**](EntityMappingsApi.md#getEntityMappingForList) | **POST** /factset-concordance/v2/entity-mapping | Saves a single-mapping specified by the client.
[**getEntityUniverse**](EntityMappingsApi.md#getEntityUniverse) | **GET** /factset-concordance/v2/entity-universe | Retrieve all saved mappings within a requested universe
[**getEntityUniverseForList**](EntityMappingsApi.md#getEntityUniverseForList) | **POST** /factset-concordance/v2/entity-universe | Retrieve all saved mappings within a requested universe or large list of client ids



## getEntityMappingDeleteForList

> EntityMappingDeleteResponse getEntityMappingDeleteForList(entityMappingDeleteRequest)

Deletes mapping specified by the client.

Delete a Concordance Mapping to the client universe. When making a post, all exiting values are overwritten in the database with the values passed in the request. clientId and universeId are required. 

### Example

```javascript
const { ApiClient, EntityMappingsApi } = require('@factset/sdk-factsetconcordance');
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

const apiInstance = new EntityMappingsApi();
const entityMappingDeleteRequest = new factsetconcordance.EntityMappingDeleteRequest(); // EntityMappingDeleteRequest | A request to delete entity mappings specified by the client

// Call api endpoint
apiInstance.getEntityMappingDeleteForList(entityMappingDeleteRequest).then(
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
 **entityMappingDeleteRequest** | [**EntityMappingDeleteRequest**](EntityMappingDeleteRequest.md)| A request to delete entity mappings specified by the client | 

### Return type

[**EntityMappingDeleteResponse**](EntityMappingDeleteResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## getEntityMappingForList

> EntityResponse getEntityMappingForList(entityMappingRequest)

Saves a single-mapping specified by the client.

Saves a Concordance Mapping to the client universe. When making a post, all exiting values are overwritten in the database with the values passed in the request. clientId and clientName are required. 

### Example

```javascript
const { ApiClient, EntityMappingsApi } = require('@factset/sdk-factsetconcordance');
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

const apiInstance = new EntityMappingsApi();
const entityMappingRequest = new factsetconcordance.EntityMappingRequest(); // EntityMappingRequest | A request to create a single mapping.

// Call api endpoint
apiInstance.getEntityMappingForList(entityMappingRequest).then(
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
 **entityMappingRequest** | [**EntityMappingRequest**](EntityMappingRequest.md)| A request to create a single mapping. | 

### Return type

[**EntityResponse**](EntityResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## getEntityUniverse

> EntityUniverseResponse getEntityUniverse(universeId, opts)

Retrieve all saved mappings within a requested universe

Retrieves all entity mappings within a requested universe. 

### Example

```javascript
const { ApiClient, EntityMappingsApi } = require('@factset/sdk-factsetconcordance');
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

const apiInstance = new EntityMappingsApi();
const universeId = 1; // Number | Universe identifier. *To create a universe, use the `/universe' endpoint.*
const opts = {
  'clientId': ["abc-123","def-456"], // [String] | Filter by the clientId(s) created by the user in a previous mapping. 
  'mapStatus': MAPPED, // [String] | Filter by the Entity Decisions that have the specified mapStatus, where -   * MAPPED - The requested Entity Name is successfully mapped to a FactSet Entity Id (-E)   * UNMAPPED - The requested Entity Name is unmapped by FactSet.   * INDETERMINATE - The requested Entity Name was unable to make a mapping. 
  'offset': 0, // Number | Starting row for records to return or rows to skip.
  'limit': 10, // Number | Limits the number of records in the response.
  'sort': ["clientId:asc","clientName:desc"] // [String] | Sort clientId, createdTime, updatedTime, clientName, entityId fields in ascending or descending order with asc and desc to indicate the order. Example (clientId:asc)
};

// Call api endpoint
apiInstance.getEntityUniverse(universeId, opts).then(
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
 **universeId** | **Number**| Universe identifier. *To create a universe, use the &#x60;/universe&#39; endpoint.* | 
 **clientId** | [**[String]**](String.md)| Filter by the clientId(s) created by the user in a previous mapping.  | [optional] 
 **mapStatus** | [**[String]**](String.md)| Filter by the Entity Decisions that have the specified mapStatus, where -   * MAPPED - The requested Entity Name is successfully mapped to a FactSet Entity Id (-E)   * UNMAPPED - The requested Entity Name is unmapped by FactSet.   * INDETERMINATE - The requested Entity Name was unable to make a mapping.  | [optional] 
 **offset** | **Number**| Starting row for records to return or rows to skip. | [optional] [default to 0]
 **limit** | **Number**| Limits the number of records in the response. | [optional] 
 **sort** | [**[String]**](String.md)| Sort clientId, createdTime, updatedTime, clientName, entityId fields in ascending or descending order with asc and desc to indicate the order. Example (clientId:asc) | [optional] 

### Return type

[**EntityUniverseResponse**](EntityUniverseResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getEntityUniverseForList

> EntityUniverseResponse getEntityUniverseForList(entityUniverseRequest)

Retrieve all saved mappings within a requested universe or large list of client ids

Retrieves all entity mappings that were saved in a given universe. Supports filtering by a large number of &#x60;clientId&#x60;s 

### Example

```javascript
const { ApiClient, EntityMappingsApi } = require('@factset/sdk-factsetconcordance');
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

const apiInstance = new EntityMappingsApi();
const entityUniverseRequest = new factsetconcordance.EntityUniverseRequest(); // EntityUniverseRequest | A request to fetch all entities of a given universe

// Call api endpoint
apiInstance.getEntityUniverseForList(entityUniverseRequest).then(
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
 **entityUniverseRequest** | [**EntityUniverseRequest**](EntityUniverseRequest.md)| A request to fetch all entities of a given universe | 

### Return type

[**EntityUniverseResponse**](EntityUniverseResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

