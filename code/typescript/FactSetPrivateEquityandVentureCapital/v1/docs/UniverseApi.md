# factsetprivateequityandventurecapital.UniverseApi

All URIs are relative to *https://api.factset.com/content/factset-pevc/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getUniverse**](UniverseApi.md#getUniverse) | **GET** /universe | Returns Entity Candidates and Matches for a single name and attributes.



## getUniverse

> EntityMatchesResponse getUniverse(name, opts)

Returns Entity Candidates and Matches for a single name and attributes.

Finds the best candidate entities matching the given entity name. Country code can also be supplied to narrow the search.  Returns a list of potential entity matches, along with a match indicator, to assist in identifying the correct entity within the FactSet universe.  **Max of 1 Name permitted in a single request.** 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, UniverseApi } = require('@factset/sdk-factsetprivateequityandventurecapital');
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
const name = Alto Pharmacy; // String | The proper name of a Private Equity/Venture Capital firm, Fund, or Portfolio Company to be matched against the FactSet entity universe.<br/>  <p>***max length** =  200 per request*</p> 
const opts = {
  'country': US, // String | The two-character ISO2 country code corresponding to the entity's primary location. Providing this code helps to narrow the entity match candidates, significantly improving the accuracy of the matching algorithm. For a list of ISO2 Country codes, visit [OA 8754](https://my.apps.factset.com/oa/pages/8754).
  'entityType': ["PVT"] // [String] | Three-character FactSet entity type code used to filter candidates in order to determine the final match result.   |Entity Type Code|Entity Type Description|Entity Type Code|Entity Type Description|   |---|---|---|---|   |PVT|Private Company|SUB|Subsidiary|   |HOL|Holding Company|JVT|Joint Venture|   |NPO|Non-Profit Organization|      |Entity Type Code|Entity Type Description|Entity Type Code|Entity Type Description|   |---|---|---|---|   |FAF| Family of Funds (Venture Capital/Private Equity)|PVF|Private Equity Fund / Alternative Investment|   |VEN|Venture Capital Fund|
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
 **name** | **String**| The proper name of a Private Equity/Venture Capital firm, Fund, or Portfolio Company to be matched against the FactSet entity universe.&lt;br/&gt;  &lt;p&gt;***max length** &#x3D;  200 per request*&lt;/p&gt;  | 
 **country** | **String**| The two-character ISO2 country code corresponding to the entity&#39;s primary location. Providing this code helps to narrow the entity match candidates, significantly improving the accuracy of the matching algorithm. For a list of ISO2 Country codes, visit [OA 8754](https://my.apps.factset.com/oa/pages/8754). | [optional] 
 **entityType** | [**[String]**](String.md)| Three-character FactSet entity type code used to filter candidates in order to determine the final match result.   |Entity Type Code|Entity Type Description|Entity Type Code|Entity Type Description|   |---|---|---|---|   |PVT|Private Company|SUB|Subsidiary|   |HOL|Holding Company|JVT|Joint Venture|   |NPO|Non-Profit Organization|      |Entity Type Code|Entity Type Description|Entity Type Code|Entity Type Description|   |---|---|---|---|   |FAF| Family of Funds (Venture Capital/Private Equity)|PVF|Private Equity Fund / Alternative Investment|   |VEN|Venture Capital Fund| | [optional] 

### Return type

[**EntityMatchesResponse**](EntityMatchesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

