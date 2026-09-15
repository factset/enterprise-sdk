# factsetpowerutilities.UnitsApi

All URIs are relative to *https://api.factset.com/content/factset-power-utilities/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listPlantUnits**](UnitsApi.md#listPlantUnits) | **POST** /units/details | Returns power plant unit metadata and technical details
[**listUnitsOwnership**](UnitsApi.md#listUnitsOwnership) | **POST** /units/ownership | Returns power plant unit ownership details



## listPlantUnits

> PlantUnitsResponse listPlantUnits(plantUnitsRequest)

Returns power plant unit metadata and technical details

Returns metadata and technical detail data for one of five categories, selected via the &#x60;category&#x60; discriminator in the request body:  * **&#x60;Metadata&#x60;** — General plant metadata: plant name, ISO/TSO assignment, primary fuel type, nameplate capacity, operational status, owner details, and key lifecycle dates. * **&#x60;Pipeline&#x60;** — Gas pipeline connections: pipeline name and pipeline sequence (for units supplied by more than one pipeline). * **&#x60;Solar&#x60;** — Solar-specific technical specifications: installed capacity (DC), array/tracking type, tilt and azimuth angle, thin-film flag, and land area. * **&#x60;Wind&#x60;** — Wind turbine technical specifications: turbine count, model, manufacturer, hub height, and rotor swept area. * **&#x60;Thermal&#x60;** — Thermal/fossil technical specifications: design heat rate.  For unit ownership details, use &#x60;POST /units/ownership&#x60;.  This endpoint operates at the unit level, matching the underlying source data.  Reflects current data only; historical or point-in-time values are not retained.  **Input flexibility:** You can provide either plant IDs or unit IDs. When you provide a plant ID, all units within that plant are returned. Unit names, parent plant IDs, EIA codes, project grades, and regional mappings are included in the metadata response. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, UnitsApi } = require('@factset/sdk-factsetpowerutilities');
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

const apiInstance = new UnitsApi();
const plantUnitsRequest = new factsetpowerutilities.PlantUnitsRequest(); // PlantUnitsRequest | 

// Call api endpoint
apiInstance.listPlantUnits(plantUnitsRequest).then(
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
 **plantUnitsRequest** | [**PlantUnitsRequest**](PlantUnitsRequest.md)|  | 

### Return type

[**PlantUnitsResponse**](PlantUnitsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## listUnitsOwnership

> UnitsOwnershipResponse listUnitsOwnership(unitsOwnershipRequest)

Returns power plant unit ownership details

Returns ownership records for the specified unit IDs, including owner name, FactSet entity ID, ownership percentage, ultimate parent entity, and the plant ID for each unit.  This endpoint is a convenience endpoint that returns ownership data with the plant ID included. For other unit detail categories (metadata, pipeline, solar, wind, thermal), use &#x60;POST /units/details&#x60;.  Reflects current data only; historical or point-in-time values are not retained. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, UnitsApi } = require('@factset/sdk-factsetpowerutilities');
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

const apiInstance = new UnitsApi();
const unitsOwnershipRequest = new factsetpowerutilities.UnitsOwnershipRequest(); // UnitsOwnershipRequest | 

// Call api endpoint
apiInstance.listUnitsOwnership(unitsOwnershipRequest).then(
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
 **unitsOwnershipRequest** | [**UnitsOwnershipRequest**](UnitsOwnershipRequest.md)|  | 

### Return type

[**UnitsOwnershipResponse**](UnitsOwnershipResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

