# factsetconcordance.UniversesApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getEntityUniverseStatistics**](UniversesApi.md#getEntityUniverseStatistics) | **GET** /factset-concordance/v2/entity-universe-statistics | Get statistics on a given universe
[**getUniverseForList**](UniversesApi.md#getUniverseForList) | **POST** /factset-concordance/v2/universe | Create a new universe
[**getUniverses**](UniversesApi.md#getUniverses) | **GET** /factset-concordance/v2/universes | Fetch metadata for universes
[**getUpdateUniverseForList**](UniversesApi.md#getUpdateUniverseForList) | **POST** /factset-concordance/v2/update-universe | Update metadata for an existing universe



## getEntityUniverseStatistics

> EntityUniverseStatisticsResponse getEntityUniverseStatistics(universeId)

Get statistics on a given universe

Get the total number of mappings in a universe, as well as the number of mapped, unmapped and indeterminate mappings 

### Example

```javascript
const { ApiClient, UniversesApi } = require('@factset/sdk-factsetconcordance');
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

const apiInstance = new UniversesApi();
const universeId = 1; // Number | Universe identifier. *To create a universe, use the `/universe' endpoint.*

// Call api endpoint
apiInstance.getEntityUniverseStatistics(universeId).then(
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

### Return type

[**EntityUniverseStatisticsResponse**](EntityUniverseStatisticsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getUniverseForList

> UniverseMetaResponse getUniverseForList(createUniverseRequest)

Create a new universe

Create a new universe that is distinct from any existing universe 

### Example

```javascript
const { ApiClient, UniversesApi } = require('@factset/sdk-factsetconcordance');
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

const apiInstance = new UniversesApi();
const createUniverseRequest = new factsetconcordance.CreateUniverseRequest(); // CreateUniverseRequest | A request to create a user's universe

// Call api endpoint
apiInstance.getUniverseForList(createUniverseRequest).then(
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
 **createUniverseRequest** | [**CreateUniverseRequest**](CreateUniverseRequest.md)| A request to create a user&#39;s universe | 

### Return type

[**UniverseMetaResponse**](UniverseMetaResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## getUniverses

> UniversesResponse getUniverses(opts)

Fetch metadata for universes

Fetch information on active universes for the current user. Optionally filter for a specific universe given a &#x60;universeId&#x60; 

### Example

```javascript
const { ApiClient, UniversesApi } = require('@factset/sdk-factsetconcordance');
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

const apiInstance = new UniversesApi();
const opts = {
  'universeId': 1 // Number | Universe identifier. *To create a universe, use the `/universe' endpoint.*
};

// Call api endpoint
apiInstance.getUniverses(opts).then(
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
 **universeId** | **Number**| Universe identifier. *To create a universe, use the &#x60;/universe&#39; endpoint.* | [optional] 

### Return type

[**UniversesResponse**](UniversesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getUpdateUniverseForList

> UniverseMetaResponse getUpdateUniverseForList(updateUniverseRequest)

Update metadata for an existing universe

Update metadata for an existing universe 

### Example

```javascript
const { ApiClient, UniversesApi } = require('@factset/sdk-factsetconcordance');
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

const apiInstance = new UniversesApi();
const updateUniverseRequest = new factsetconcordance.UpdateUniverseRequest(); // UpdateUniverseRequest | A request to update a user's universe

// Call api endpoint
apiInstance.getUpdateUniverseForList(updateUniverseRequest).then(
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
 **updateUniverseRequest** | [**UpdateUniverseRequest**](UpdateUniverseRequest.md)| A request to update a user&#39;s universe | 

### Return type

[**UniverseMetaResponse**](UniverseMetaResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

