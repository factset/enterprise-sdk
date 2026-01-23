# sparengine.SPARPeerUniverseApi

All URIs are relative to *https://api.factset.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getListOfPeerUniverse**](SPARPeerUniverseApi.md#getListOfPeerUniverse) | **GET** /analytics/engines/spar/v3/peer-universe | Get List of Peer Universe



## getListOfPeerUniverse

> SPARPeerUniverseRoot getListOfPeerUniverse(category, opts)

Get List of Peer Universe

Retrieves peer universe information that can be used when specifying universeId for SPAR calculations. This endpoint returns a list of available universes for different categories.     Parameters: Category is mandatory.    Usage:  * Category parameter: Fetches all peer universe details available for specified category.  * Use parameters to narrow down your lookup based on peer universe name, category, and/or directory.    Remarks:  * Category Values: Allowed values include category name like &#39;US Funds&#39;, &#39;Asia Funds&#39;, &#39;Intl Funds&#39;,&#39;Institutions&#39;, &#39;Hedge Funds&#39;, &#39;Database&#39;, &#39;Domicile&#39;, &#39;Manager&#39;, &#39;Rating&#39;, &#39;OFDBs&#39;, &#39;Screens&#39; etc.  * Access to specific categories may vary depending on your permissions.  * Directory parameter is mandatory when category is &#39;OFDBs&#39; or &#39;Screens&#39;. Eg: CLIENT:/FOLDER1.  * Note: Category &#39;Client funds&#39; is not supported yet.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, SPARPeerUniverseApi } = require('@factset/sdk-sparengine');
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

const apiInstance = new SPARPeerUniverseApi();
const category = US Funds; // String | Peer universe category
const opts = {
  'name': Morningstar US, // String | Peer universe name
  'directory': "directory_example" // String | The directory to get the peer universe
};

// Call api endpoint
apiInstance.getListOfPeerUniverse(category, opts).then(
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
 **category** | **String**| Peer universe category | 
 **name** | **String**| Peer universe name | [optional] 
 **directory** | **String**| The directory to get the peer universe | [optional] 

### Return type

[**SPARPeerUniverseRoot**](SPARPeerUniverseRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

