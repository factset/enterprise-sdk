# factsetconcordance.ManageMappingsApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getEntityUniverse**](ManageMappingsApi.md#getEntityUniverse) | **GET** /factset-concordance/v1/entity-universe | View Universe for the requesting user.
[**saveEntityMapping**](ManageMappingsApi.md#saveEntityMapping) | **POST** /factset-concordance/v1/entity-mapping | Saves a single-mapping specified by the client.



## getEntityUniverse

> EntityUniverseResponse getEntityUniverse(opts)

View Universe for the requesting user.

Retrieves all entity mappings&#39; history made by the current user, or for a list of clientIds. 

### Example

```javascript
const { ApiClient, ManageMappingsApi } = require('@factset/sdk-factsetconcordance');
const { ConfidentialClient } = require('@factset/sdk-utils');

const apiClient = ApiClient.instance;

// Configure HTTP basic authorization: FactSetApiKey
const FactSetApiKey = apiClient.authentications['FactSetApiKey'];
FactSetApiKey.username = 'YOUR USERNAME';
FactSetApiKey.password = 'YOUR PASSWORD';

// Configure OAuth2 access token for authorization: FactSetOAuth2
const FactSetOAuth2 = apiClient.authentications['FactSetOAuth2'];
FactSetOAuth2.accessToken = 'YOUR ACCESS TOKEN';

// Configure OAuth2 access with ConfidentialClient
apiClient.factsetOauth2Client = new ConfidentialClient('./config.json');

const apiInstance = new ManageMappingsApi();
const opts = {
  'clientId': ["abc-123","def-456"], // [String] | Filter by the clientId(s) created by the user in a previous mapping. 
  'mapStatus': MAPPED, // [String] | Filter by the Entity Decisions that have the specified mapStatus, where -   * MAPPED - The requested Entity Name is successfully mapped to a FactSet Entity Id (-E)   * UNMAPPED - The requested Entity Name is unmapped by FactSet.   * INDETERMINATE - The requested Entity Name was unable to make a mapping. 
  'offset': 0, // Number | Starting row for records to return or rows to skip.
  'limit': 10 // Number | Limits the number of records in the response.
};

// Call api endpoint
apiInstance.getEntityUniverse(opts).then(
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
 **clientId** | [**[String]**](String.md)| Filter by the clientId(s) created by the user in a previous mapping.  | [optional] 
 **mapStatus** | [**[String]**](String.md)| Filter by the Entity Decisions that have the specified mapStatus, where -   * MAPPED - The requested Entity Name is successfully mapped to a FactSet Entity Id (-E)   * UNMAPPED - The requested Entity Name is unmapped by FactSet.   * INDETERMINATE - The requested Entity Name was unable to make a mapping.  | [optional] 
 **offset** | **Number**| Starting row for records to return or rows to skip. | [optional] [default to 0]
 **limit** | **Number**| Limits the number of records in the response. | [optional] 

### Return type

[**EntityUniverseResponse**](EntityUniverseResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## saveEntityMapping

> EntityResponse saveEntityMapping(entityMappingRequest)

Saves a single-mapping specified by the client.

Saves a Concordance Mapping to the client universe. When making a post, all exiting values are overwritten in the database with the values passed in the request. clientId and clientName are required. 

### Example

```javascript
const { ApiClient, ManageMappingsApi } = require('@factset/sdk-factsetconcordance');
const { ConfidentialClient } = require('@factset/sdk-utils');

const apiClient = ApiClient.instance;

// Configure HTTP basic authorization: FactSetApiKey
const FactSetApiKey = apiClient.authentications['FactSetApiKey'];
FactSetApiKey.username = 'YOUR USERNAME';
FactSetApiKey.password = 'YOUR PASSWORD';

// Configure OAuth2 access token for authorization: FactSetOAuth2
const FactSetOAuth2 = apiClient.authentications['FactSetOAuth2'];
FactSetOAuth2.accessToken = 'YOUR ACCESS TOKEN';

// Configure OAuth2 access with ConfidentialClient
apiClient.factsetOauth2Client = new ConfidentialClient('./config.json');

const apiInstance = new ManageMappingsApi();
const entityMappingRequest = new factsetconcordance.EntityMappingRequest(); // EntityMappingRequest | A request to create a single mapping.

// Call api endpoint
apiInstance.saveEntityMapping(entityMappingRequest).then(
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

