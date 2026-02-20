# factsetprivatecompany.UniverseApi

All URIs are relative to *https://api.factset.com/content/private-company/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getUniverse**](UniverseApi.md#getUniverse) | **GET** /universe | Returns Entity Candidates and Matches for a single name and attributes.
[**getUniverseForList**](UniverseApi.md#getUniverseForList) | **POST** /universe | Returns Entity Candidates and Matches for a requested list of up to 25 names and attributes.



## getUniverse

> EntityMatchesResponse getUniverse(name, opts)

Returns Entity Candidates and Matches for a single name and attributes.

Finds the best candidate entities matching the given entity name. Country code can also be supplied to narrow the search.  The &#x60;matchFlag&#x60; indicates whether the &#x60;entityId&#x60; is a FactSet match based on the input name and country. When &#x60;true&#x60;, the FactSet &#x60;entityId&#x60; was confidently matched to the input name and country. When &#x60;false&#x60;, the FactSet &#x60;entityId&#x60; could not be confidently matched to the input name and country.  **Max of 1 Name permitted in a single GET request.** Use the POST method to fetch up to 25 names. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, UniverseApi } = require('@factset/sdk-factsetprivatecompany');
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

const apiInstance = new UniverseApi();
const name = Alto Pharmacy; // String | Name of Entity to match.<br/>  <p>***max length** =  200 per request*</p> 
const opts = {
  'country': US // String | ISO2 country code corresponding to the entity name is used when evaluating candidates for a match. For a list of ISO2 Country codes, visit [OA 8754](https://my.apps.factset.com/oa/pages/8754).
};

// Call api endpoint
apiInstance.getUniverse(name, opts).then(
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
 **name** | **String**| Name of Entity to match.&lt;br/&gt;  &lt;p&gt;***max length** &#x3D;  200 per request*&lt;/p&gt;  | 
 **country** | **String**| ISO2 country code corresponding to the entity name is used when evaluating candidates for a match. For a list of ISO2 Country codes, visit [OA 8754](https://my.apps.factset.com/oa/pages/8754). | [optional] 

### Return type

[**EntityMatchesResponse**](EntityMatchesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getUniverseForList

> EntityMatchesResponse getUniverseForList(entityMatchRequest)

Returns Entity Candidates and Matches for a requested list of up to 25 names and attributes.

Finds the best candidate entities matching the given entity name. Country code can also be supplied to narrow the search. &lt;p&gt;**Max of 25 Names inputted.**&lt;/p&gt;&lt;p&gt; 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, UniverseApi } = require('@factset/sdk-factsetprivatecompany');
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

const apiInstance = new UniverseApi();
const entityMatchRequest = new factsetprivatecompany.EntityMatchRequest(); // EntityMatchRequest | A request to match an Entity.

// Call api endpoint
apiInstance.getUniverseForList(entityMatchRequest).then(
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
 **entityMatchRequest** | [**EntityMatchRequest**](EntityMatchRequest.md)| A request to match an Entity. | 

### Return type

[**EntityMatchesResponse**](EntityMatchesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

