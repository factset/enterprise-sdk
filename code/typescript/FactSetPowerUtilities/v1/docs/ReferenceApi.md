# factsetpowerutilities.ReferenceApi

All URIs are relative to *https://api.factset.com/content/factset-power-utilities/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listEntityHistory**](ReferenceApi.md#listEntityHistory) | **GET** /reference/entity-history | Returns entity and security history records
[**listIsoMapping**](ReferenceApi.md#listIsoMapping) | **GET** /reference/iso-mapping | Returns ISO/TSO mapping data
[**listLocationMapping**](ReferenceApi.md#listLocationMapping) | **GET** /reference/location-mapping | Returns power price location mapping data
[**listZoneMapping**](ReferenceApi.md#listZoneMapping) | **GET** /reference/zone-mapping | Returns price zone and hub mapping data



## listEntityHistory

> EntityHistoryResponse listEntityHistory(opts)

Returns entity and security history records

Returns entity and security history records combining security-to-entity identifier mappings and entity ownership structure history, including immediate and ultimate parent entities.  **Helpful for:** Understanding entity relationships and parent-subsidiary structures related to plant ownership data returned by &#x60;POST /units/ownership&#x60;. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, ReferenceApi } = require('@factset/sdk-factsetpowerutilities');
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

const apiInstance = new ReferenceApi();
const opts = {
  'factsetEntityId': 0GSF7D-E, // String | Filter records by a specific FactSet entity identifier (e.g., `\"0GSF7D-E\"`).
  'paginationLimit': 100, // Number | Maximum number of results to return per request.
  'paginationOffset': 0 // Number | Number of results to skip.
};

// Call api endpoint
apiInstance.listEntityHistory(opts).then(
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
 **factsetEntityId** | **String**| Filter records by a specific FactSet entity identifier (e.g., &#x60;\&quot;0GSF7D-E\&quot;&#x60;). | [optional] 
 **paginationLimit** | **Number**| Maximum number of results to return per request. | [optional] [default to 100]
 **paginationOffset** | **Number**| Number of results to skip. | [optional] [default to 0]

### Return type

[**EntityHistoryResponse**](EntityHistoryResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## listIsoMapping

> IsoMappingResponse listIsoMapping(opts)

Returns ISO/TSO mapping data

Returns the complete list of ISO/TSO codes and their corresponding names.  **Helpful for:** Use this endpoint to understand available ISO/TSO codes for filtering in &#x60;GET /plants/ids&#x60; (via the &#x60;isoCode&#x60; parameter) and &#x60;GET /market-data/coverage&#x60;.  Reflects current data only; historical or point-in-time values are not retained. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, ReferenceApi } = require('@factset/sdk-factsetpowerutilities');
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

const apiInstance = new ReferenceApi();
const opts = {
  'paginationLimit': 100, // Number | Maximum number of results to return per request.
  'paginationOffset': 0 // Number | Number of results to skip.
};

// Call api endpoint
apiInstance.listIsoMapping(opts).then(
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
 **paginationLimit** | **Number**| Maximum number of results to return per request. | [optional] [default to 100]
 **paginationOffset** | **Number**| Number of results to skip. | [optional] [default to 0]

### Return type

[**IsoMappingResponse**](IsoMappingResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## listLocationMapping

> LocationMappingResponse listLocationMapping(opts)

Returns power price location mapping data

Returns the list of ISO/TSO power price location codes (hub codes) used by &#x60;POST /prices&#x60; for the &#x60;Power&#x60;, &#x60;SparkSpread&#x60;, and &#x60;Forward&#x60; categories, with their names. Use the returned &#x60;locationId&#x60; values as input to those endpoints.  Note: these &#x60;iso_loc_code&#x60; identifiers are a distinct code space from the &#x60;iso_zone_code&#x60; identifiers used by &#x60;POST /prices?category&#x3D;Capacity&#x60; — see &#x60;GET /reference/zone-mapping&#x60; for those.  Reflects current data only; historical or point-in-time values are not retained. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, ReferenceApi } = require('@factset/sdk-factsetpowerutilities');
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

const apiInstance = new ReferenceApi();
const opts = {
  'isoCode': ERCOT, // String | Filter locations by ISO/TSO market.
  'paginationLimit': 100, // Number | Maximum number of results to return per request.
  'paginationOffset': 0 // Number | Number of results to skip.
};

// Call api endpoint
apiInstance.listLocationMapping(opts).then(
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
 **isoCode** | **String**| Filter locations by ISO/TSO market. | [optional] 
 **paginationLimit** | **Number**| Maximum number of results to return per request. | [optional] [default to 100]
 **paginationOffset** | **Number**| Number of results to skip. | [optional] [default to 0]

### Return type

[**LocationMappingResponse**](LocationMappingResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## listZoneMapping

> ZoneMappingResponse listZoneMapping(opts)

Returns price zone and hub mapping data

Returns the list of ISO/TSO load distribution area and zone codes used by &#x60;POST /prices?category&#x3D;Capacity&#x60;, with their names, price units, and auction frequency. Use the returned &#x60;locationId&#x60; values as input to that endpoint.  Note: these &#x60;iso_zone_code&#x60; identifiers are a distinct code space from the &#x60;iso_loc_code&#x60; identifiers used by &#x60;POST /prices&#x60; for the &#x60;Power&#x60;, &#x60;SparkSpread&#x60;, and &#x60;Forward&#x60; categories.  Reflects current data only; historical or point-in-time values are not retained. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, ReferenceApi } = require('@factset/sdk-factsetpowerutilities');
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

const apiInstance = new ReferenceApi();
const opts = {
  'isoCode': PJM, // String | Filter locations by ISO/TSO market.
  'paginationLimit': 100, // Number | Maximum number of results to return per request.
  'paginationOffset': 0 // Number | Number of results to skip.
};

// Call api endpoint
apiInstance.listZoneMapping(opts).then(
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
 **isoCode** | **String**| Filter locations by ISO/TSO market. | [optional] 
 **paginationLimit** | **Number**| Maximum number of results to return per request. | [optional] [default to 100]
 **paginationOffset** | **Number**| Number of results to skip. | [optional] [default to 0]

### Return type

[**ZoneMappingResponse**](ZoneMappingResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

