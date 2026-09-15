# factsetpowerutilities.GenerationEmissionsApi

All URIs are relative to *https://api.factset.com/content/factset-power-utilities/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listHourlyGenerationUnits**](GenerationEmissionsApi.md#listHourlyGenerationUnits) | **POST** /generation/hourly/units | Returns hourly plant unit generation and emissions
[**listMonthlyGeneration**](GenerationEmissionsApi.md#listMonthlyGeneration) | **POST** /generation/monthly | Returns monthly plant generation and emissions



## listHourlyGenerationUnits

> HourlyGenerationResponse listHourlyGenerationUnits(hourlyGenerationRequest)

Returns hourly plant unit generation and emissions

Returns hourly net generation and emissions for the requested power plant units over the specified date range. Each record provides net generation in MWh and reported emissions of CO₂, SO₂, and N₂O (nitrous oxide) in metric tons, along with heat input in MMBtu and steam generation.  This endpoint operates at the unit level, matching the underlying source data. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, GenerationEmissionsApi } = require('@factset/sdk-factsetpowerutilities');
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

const apiInstance = new GenerationEmissionsApi();
const hourlyGenerationRequest = new factsetpowerutilities.HourlyGenerationRequest(); // HourlyGenerationRequest | 

// Call api endpoint
apiInstance.listHourlyGenerationUnits(hourlyGenerationRequest).then(
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
 **hourlyGenerationRequest** | [**HourlyGenerationRequest**](HourlyGenerationRequest.md)|  | 

### Return type

[**HourlyGenerationResponse**](HourlyGenerationResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## listMonthlyGeneration

> MonthlyGenerationResponse listMonthlyGeneration(monthlyGenerationRequest)

Returns monthly plant generation and emissions

Returns monthly net generation and emissions for the requested power plants over the specified date range. Each record provides net generation in MWh, plant/fuel-type capacity and capacity factor, and total emissions of CO₂ (metric tons), SO₂ (short tons), and N₂O (nitrous oxide, short tons), along with heat input in MMBtu and a CO₂ intensity measure. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, GenerationEmissionsApi } = require('@factset/sdk-factsetpowerutilities');
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

const apiInstance = new GenerationEmissionsApi();
const monthlyGenerationRequest = new factsetpowerutilities.MonthlyGenerationRequest(); // MonthlyGenerationRequest | 

// Call api endpoint
apiInstance.listMonthlyGeneration(monthlyGenerationRequest).then(
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
 **monthlyGenerationRequest** | [**MonthlyGenerationRequest**](MonthlyGenerationRequest.md)|  | 

### Return type

[**MonthlyGenerationResponse**](MonthlyGenerationResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

