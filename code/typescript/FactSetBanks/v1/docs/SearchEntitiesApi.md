# factsetbanks.SearchEntitiesApi

All URIs are relative to *https://api.factset.com/content/factset-banks/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getSearchEntities**](SearchEntitiesApi.md#getSearchEntities) | **POST** /search-entities | Returns subsidiary and private affiliate entities for a parent ticker, entity ID, or name



## getSearchEntities

> SearchEntitiesResponse getSearchEntities(searchEntitiesRequest)

Returns subsidiary and private affiliate entities for a parent ticker, entity ID, or name

Finds the subsidiary or private affiliate entity IDs needed to query other Banks API endpoints from a given parent ticker, ultimate parent entity ID, or entity name. Several endpoints require an entity ID that differs from the parent&#39;s public ticker:  * &#x60;/financials&#x60;, &#x60;/branches&#x60;, and &#x60;/country-exposure&#x60; require bank entities from the parent company. * &#x60;/ubpr&#x60;, &#x60;/ucc1&#x60;, and &#x60;/deposit-rates&#x60; require the **subsidiary** bank entity, not the holding company. * &#x60;/ten-d&#x60; requires the **asset-backed trust** entity, not the subsidiary bank or holding company. For auto loan securitizations, the trust&#39;s ultimate parent may itself be a non-bank company (e.g., an auto manufacturer&#39;s finance arm like GM Financial, Toyota Financial, or Harley-Davidson Financial). * &#x60;/aum/ria&#x60; requires the **private Registered Investment Adviser** entity. * &#x60;/focus&#x60; requires the **private broker-dealer** entity.  Use &#x60;reportType&#x60; to select which of these destination endpoints you&#39;re resolving entities for; only entities eligible for that report type are returned, and the response&#39;s &#x60;reportType&#x60; field echoes back your selection. Pass the resulting &#x60;factsetEntityId&#x60; values into the &#x60;ids&#x60; field of the corresponding endpoint.  Not every bank has a holding company above it with its own ticker — for those, use &#x60;searchText&#x60; to look the entity up by (partial) name instead of &#x60;ids&#x60;. At least one of &#x60;ids&#x60; or &#x60;searchText&#x60; is required.  **Date filtering behavior:** * **No dates entered**: Returns only currently active subsidiaries (those with no end date). * **Dates entered**: Returns only subsidiaries active during the specified time period. * **End date is null**: The end date defaults to today&#39;s date for filtering purposes. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, SearchEntitiesApi } = require('@factset/sdk-factsetbanks');
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

const apiInstance = new SearchEntitiesApi();
const searchEntitiesRequest = new factsetbanks.SearchEntitiesRequest(); // SearchEntitiesRequest | 

// Call api endpoint
apiInstance.getSearchEntities(searchEntitiesRequest).then(
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
 **searchEntitiesRequest** | [**SearchEntitiesRequest**](SearchEntitiesRequest.md)|  | 

### Return type

[**SearchEntitiesResponse**](SearchEntitiesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

