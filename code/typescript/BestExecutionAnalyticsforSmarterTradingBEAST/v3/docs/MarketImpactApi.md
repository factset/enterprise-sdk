# bestexecutionanalyticsforsmartertradingbeast.MarketImpactApi

All URIs are relative to *https://api.factset.com/analytics/beast/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCostImpactV3**](MarketImpactApi.md#getCostImpactV3) | **GET** /tca/market-impact/cost-impact | Get Cost Impact



## getCostImpactV3

> CostImpactResponseRootV3 getCostImpactV3(securityId, orderVolume, opts)

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
const securityId = FDS-US; // String | ISIN for European securities, otherwise TICKER
const orderVolume = 1000; // String | Order Volume in scientific notation or float format. Example: 1000 or 1.234567e4.
const opts = {
  'strategy': "strategy_example", // String | Specify the strategy, choices are: Optimal, VWAP, TWAP, Custom
  'riskAversion': ["0.1","0.3"], // [String] | Input risk tolerance from passive to very aggressive
  'date': 2024-08-29, // Date | Date in the format YYYY-MM-DD
  'startTime': 10:00, // String | Start Time in the format HH:MM
  'endTime': 15:00, // String | End Time in the format HH:MM
  'isMomentum': false, // Boolean | Flag to apply stock momentum. Specify true to include momentum
  'side': "side_example", // String | Indicate whether a buyer or seller. Only applies when isMomentum is true. Example: Buy or Sell.
  'peer': false, // Boolean | Flag to apply peer calibration. Specify true to include peer calibration
  'frontLoadHalfLife': 1000, // Number | Speeds up early execution
  'rearLoadHalfLife': 0, // Number | Delays orders towards end of the trading day.
  'rearRatio': 1, // Number | Adjusts weighting of final execution
  'binsData': true // Boolean | Flag to apply BinsData. Specify true to include BinsData
};

// Call api endpoint
apiInstance.getCostImpactV3(securityId, orderVolume, opts).then(
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
 **orderVolume** | **String**| Order Volume in scientific notation or float format. Example: 1000 or 1.234567e4. | 
 **strategy** | **String**| Specify the strategy, choices are: Optimal, VWAP, TWAP, Custom | [optional] 
 **riskAversion** | [**[String]**](String.md)| Input risk tolerance from passive to very aggressive | [optional] 
 **date** | **Date**| Date in the format YYYY-MM-DD | [optional] 
 **startTime** | **String**| Start Time in the format HH:MM | [optional] 
 **endTime** | **String**| End Time in the format HH:MM | [optional] 
 **isMomentum** | **Boolean**| Flag to apply stock momentum. Specify true to include momentum | [optional] 
 **side** | **String**| Indicate whether a buyer or seller. Only applies when isMomentum is true. Example: Buy or Sell. | [optional] 
 **peer** | **Boolean**| Flag to apply peer calibration. Specify true to include peer calibration | [optional] 
 **frontLoadHalfLife** | **Number**| Speeds up early execution | [optional] 
 **rearLoadHalfLife** | **Number**| Delays orders towards end of the trading day. | [optional] 
 **rearRatio** | **Number**| Adjusts weighting of final execution | [optional] 
 **binsData** | **Boolean**| Flag to apply BinsData. Specify true to include BinsData | [optional] [default to true]

### Return type

[**CostImpactResponseRootV3**](CostImpactResponseRootV3.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

