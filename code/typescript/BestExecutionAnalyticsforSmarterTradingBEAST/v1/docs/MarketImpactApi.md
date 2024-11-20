# bestexecutionanalyticsforsmartertradingbeast.MarketImpactApi

All URIs are relative to *https://api.factset.com/analytics/beast/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCostImpact**](MarketImpactApi.md#getCostImpact) | **GET** /tca/market-impact/cost-impact | Get Cost Impact
[**getCostImpactStandard**](MarketImpactApi.md#getCostImpactStandard) | **GET** /tca/market-impact/cost-impact-standard | Get Standard Cost Impact
[**getPreviousVwaps**](MarketImpactApi.md#getPreviousVwaps) | **GET** /tca/market-impact/previous-vwaps | Get Previous Volume Weighted Average Prices



## getCostImpact

> CostImpactResponseRoot getCostImpact(date, startTime, endTime, pauseStartTime, pauseEndTime, securityId, region, orderVolume, frontLoadHalfLife, opts)

Get Cost Impact

Get Cost Impact

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, MarketImpactApi } = require('@factset/sdk-bestexecutionanalyticsforsmartertradingbeast');
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

const apiInstance = new MarketImpactApi();
const date = 2024-08-29; // String | Date in the format YYYY-MM-DD
const startTime = 10:00:00; // String | Start Time in the format HH:MM:SS
const endTime = 15:30:00; // String | End Time in the format HH:MM:SS
const pauseStartTime = 12:00:00; // String | Pause Start Time in the format HH:MM:SS
const pauseEndTime = 12:00:00; // String | Pause End Time in the format HH:MM:SS
const securityId = FDS; // String | ISIN for European securities, otherwise TICKER
const region = US; // String | The two character ISO country code of the trading region. EMEA is used for the European trading region
const orderVolume = 100000; // Number | Order Volume
const frontLoadHalfLife = 5000; // Number | Front Load Half Life
const opts = {
  'currency': USD, // String | The ISO 4217 currency code
  'isin': "isin_example", // String | Isin code
  'spreadSensitivity': 0, // Number | Spread Sensitivity
  'liquiditySensitivity': 0 // Number | Liquidity Sensitivity
};

// Call api endpoint
apiInstance.getCostImpact(date, startTime, endTime, pauseStartTime, pauseEndTime, securityId, region, orderVolume, frontLoadHalfLife, opts).then(
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
 **date** | **String**| Date in the format YYYY-MM-DD | 
 **startTime** | **String**| Start Time in the format HH:MM:SS | 
 **endTime** | **String**| End Time in the format HH:MM:SS | 
 **pauseStartTime** | **String**| Pause Start Time in the format HH:MM:SS | 
 **pauseEndTime** | **String**| Pause End Time in the format HH:MM:SS | 
 **securityId** | **String**| ISIN for European securities, otherwise TICKER | 
 **region** | **String**| The two character ISO country code of the trading region. EMEA is used for the European trading region | 
 **orderVolume** | **Number**| Order Volume | 
 **frontLoadHalfLife** | **Number**| Front Load Half Life | 
 **currency** | **String**| The ISO 4217 currency code | [optional] 
 **isin** | **String**| Isin code | [optional] 
 **spreadSensitivity** | **Number**| Spread Sensitivity | [optional] [default to 0]
 **liquiditySensitivity** | **Number**| Liquidity Sensitivity | [optional] [default to 0]

### Return type

[**CostImpactResponseRoot**](CostImpactResponseRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getCostImpactStandard

> CostImpactStandardResponseRoot getCostImpactStandard(securityId, region, orderVolume, opts)

Get Standard Cost Impact

Get Standard Cost Impact

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, MarketImpactApi } = require('@factset/sdk-bestexecutionanalyticsforsmartertradingbeast');
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

const apiInstance = new MarketImpactApi();
const securityId = FDS; // String | ISIN for European securities, otherwise TICKER
const region = US; // String | The two character ISO country code of the trading region. EMEA is used for the European trading region
const orderVolume = 100000; // Number | Order Volume
const opts = {
  'currency': USD // String | The ISO 4217 currency code
};

// Call api endpoint
apiInstance.getCostImpactStandard(securityId, region, orderVolume, opts).then(
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
 **securityId** | **String**| ISIN for European securities, otherwise TICKER | 
 **region** | **String**| The two character ISO country code of the trading region. EMEA is used for the European trading region | 
 **orderVolume** | **Number**| Order Volume | 
 **currency** | **String**| The ISO 4217 currency code | [optional] 

### Return type

[**CostImpactStandardResponseRoot**](CostImpactStandardResponseRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getPreviousVwaps

> VwapResponseRoot getPreviousVwaps(date, startTime, endTime, securityId, region, opts)

Get Previous Volume Weighted Average Prices

Get previous vwaps by specified date, time range, security, region and optional currency

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, MarketImpactApi } = require('@factset/sdk-bestexecutionanalyticsforsmartertradingbeast');
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

const apiInstance = new MarketImpactApi();
const date = 2024-08-29; // String | Date in the format YYYY-MM-DD
const startTime = 10:00:00; // String | Start Time in the format HH:MM:SS
const endTime = 15:30:00; // String | End Time in the format HH:MM:SS
const securityId = FDS; // String | ISIN for European securities, otherwise TICKER
const region = US; // String | The two character ISO country code of the trading region. EMEA is used for the European trading region
const opts = {
  'currency': USD // String | The ISO 4217 currency code
};

// Call api endpoint
apiInstance.getPreviousVwaps(date, startTime, endTime, securityId, region, opts).then(
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
 **date** | **String**| Date in the format YYYY-MM-DD | 
 **startTime** | **String**| Start Time in the format HH:MM:SS | 
 **endTime** | **String**| End Time in the format HH:MM:SS | 
 **securityId** | **String**| ISIN for European securities, otherwise TICKER | 
 **region** | **String**| The two character ISO country code of the trading region. EMEA is used for the European trading region | 
 **currency** | **String**| The ISO 4217 currency code | [optional] 

### Return type

[**VwapResponseRoot**](VwapResponseRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

