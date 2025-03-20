# bestexecutionanalyticsforsmartertradingbeast.MarketImpactApi

All URIs are relative to *https://api.factset.com/analytics/beast/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCostImpact**](MarketImpactApi.md#getCostImpact) | **GET** /tca/market-impact/cost-impact | Get Cost Impact



## getCostImpact

> CostImpactResponseRoot getCostImpact(securityId, region, currency, orderVolume, opts)

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
const region = US; // String | The two character ISO country code of the trading region. EMEA is used for the European trading region
const currency = USD; // String | The ISO 4217 currency code
const orderVolume = 100000; // Number | Order Volume
const opts = {
  'strategy': vwap, // String | Specify the strategy, choices are: Optimal, VWAP, TWAP, Custom
  'date': 2024-08-29, // String | Date in the format YYYY-MM-DD
  'isin': "isin_example", // String | International securities identification number
  'startTime': 10:00:00, // String | Start Time in the format HH:MM:SS
  'endTime': 15:00:00, // String | End Time in the format HH:MM:SS
  'frontLoadHalfLife': 1000, // Number | Front Load Half Life
  'rearLoadHalfLife': 0, // Number | Rear Load Half Life
  'rearRatio': 1, // Number | Rear Ratio
  'riskAversion': 0.3, // Number | Risk Aversion
  'applyMomentum': false, // Boolean | Flag to apply stock momentum. Specify true to include momentum
  'side': "side_example" // String | Indicate whether a buyer or seller. Only applies when applyMomentum is true. Example: Buy or Sell.
};

// Call api endpoint
apiInstance.getCostImpact(securityId, region, currency, orderVolume, opts).then(
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
 **currency** | **String**| The ISO 4217 currency code | 
 **orderVolume** | **Number**| Order Volume | 
 **strategy** | **String**| Specify the strategy, choices are: Optimal, VWAP, TWAP, Custom | [optional] 
 **date** | **String**| Date in the format YYYY-MM-DD | [optional] 
 **isin** | **String**| International securities identification number | [optional] 
 **startTime** | **String**| Start Time in the format HH:MM:SS | [optional] 
 **endTime** | **String**| End Time in the format HH:MM:SS | [optional] 
 **frontLoadHalfLife** | **Number**| Front Load Half Life | [optional] 
 **rearLoadHalfLife** | **Number**| Rear Load Half Life | [optional] 
 **rearRatio** | **Number**| Rear Ratio | [optional] 
 **riskAversion** | **Number**| Risk Aversion | [optional] 
 **applyMomentum** | **Boolean**| Flag to apply stock momentum. Specify true to include momentum | [optional] 
 **side** | **String**| Indicate whether a buyer or seller. Only applies when applyMomentum is true. Example: Buy or Sell. | [optional] 

### Return type

[**CostImpactResponseRoot**](CostImpactResponseRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

