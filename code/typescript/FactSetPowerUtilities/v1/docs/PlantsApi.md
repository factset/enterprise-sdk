# factsetpowerutilities.PlantsApi

All URIs are relative to *https://api.factset.com/content/factset-power-utilities/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listPlantIds**](PlantsApi.md#listPlantIds) | **GET** /plants/ids | Returns discoverable power plant IDs



## listPlantIds

> PlantIdsResponse listPlantIds(opts)

Returns discoverable power plant IDs

Returns a paginated list of FactSet power plant asset identifiers matching the specified filter criteria, along with plant name, status, fuel type, and geographic location (nearest city, region, country, continent, and coordinates).  For unit-level metadata and technical details, see &#x60;POST /units/details&#x60;. You can provide either plant IDs or unit IDs to &#x60;/units/details&#x60; to retrieve unit-level data with full mapping information (unit names, EIA codes, grades, regions).  Reflects current data only; historical or point-in-time values are not retained. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, PlantsApi } = require('@factset/sdk-factsetpowerutilities');
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

const apiInstance = new PlantsApi();
const opts = {
  'isoCode': ["ERCOT"], // [String] | Filter plants by ISO/TSO market area code (e.g., `\"ERCOT\"`, `\"PJM\"` for US ISO/RTOs; other codes for non-US TSOs as coverage expands).
  'country': ["United States"], // [String] | Filter plants by country name (e.g., `\"United States\"`, `\"Canada\"`, `\"United Kingdom\"`).
  'region': ["Texas"], // [String] | Filter plants by region (e.g., a US state name such as `\"Texas\"`, `\"Tennessee\"`).
  'plantStatus': ["Operational"], // [String] | Filter plants by operational status.
  'plantIds': ["B00121-M"], // [String] | Filter results to the specified FactSet plant asset identifiers. If omitted, all plants matching other filter criteria are returned.
  'minCapacityMw': 100, // Number | Filter plants by minimum nameplate capacity in megawatts (MW), inclusive. Returns plants with capacity greater than or equal to this value.
  'maxCapacityMw': 5000, // Number | Filter plants by maximum nameplate capacity in megawatts (MW), inclusive. Returns plants with capacity less than or equal to this value.
  'paginationLimit': 100, // Number | Maximum number of results to return per request.
  'paginationOffset': 0 // Number | Number of results to skip. Use with `_paginationLimit` for paging through large result sets.
};

// Call api endpoint
apiInstance.listPlantIds(opts).then(
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
 **isoCode** | [**[String]**](String.md)| Filter plants by ISO/TSO market area code (e.g., &#x60;\&quot;ERCOT\&quot;&#x60;, &#x60;\&quot;PJM\&quot;&#x60; for US ISO/RTOs; other codes for non-US TSOs as coverage expands). | [optional] 
 **country** | [**[String]**](String.md)| Filter plants by country name (e.g., &#x60;\&quot;United States\&quot;&#x60;, &#x60;\&quot;Canada\&quot;&#x60;, &#x60;\&quot;United Kingdom\&quot;&#x60;). | [optional] 
 **region** | [**[String]**](String.md)| Filter plants by region (e.g., a US state name such as &#x60;\&quot;Texas\&quot;&#x60;, &#x60;\&quot;Tennessee\&quot;&#x60;). | [optional] 
 **plantStatus** | [**[String]**](String.md)| Filter plants by operational status. | [optional] 
 **plantIds** | [**[String]**](String.md)| Filter results to the specified FactSet plant asset identifiers. If omitted, all plants matching other filter criteria are returned. | [optional] 
 **minCapacityMw** | **Number**| Filter plants by minimum nameplate capacity in megawatts (MW), inclusive. Returns plants with capacity greater than or equal to this value. | [optional] 
 **maxCapacityMw** | **Number**| Filter plants by maximum nameplate capacity in megawatts (MW), inclusive. Returns plants with capacity less than or equal to this value. | [optional] 
 **paginationLimit** | **Number**| Maximum number of results to return per request. | [optional] [default to 100]
 **paginationOffset** | **Number**| Number of results to skip. Use with &#x60;_paginationLimit&#x60; for paging through large result sets. | [optional] [default to 0]

### Return type

[**PlantIdsResponse**](PlantIdsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

