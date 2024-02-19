# openrisk.OperationsApi

All URIs are relative to *https://api.factset.com/analytics/openrisk*

Method | HTTP request | Description
------------- | ------------- | -------------
[**calculateFromHoldings**](OperationsApi.md#calculateFromHoldings) | **POST** /linear/{version}/calculate/from-holdings | Calculate risk statistics
[**generateIdMapping**](OperationsApi.md#generateIdMapping) | **POST** /linear/{version}/generate/id-mapping | Generate risk model ID mapping



## calculateFromHoldings

> InlineResponse2004 calculateFromHoldings(version, calculateFromHoldingsRequestBody)

Calculate risk statistics

Calculate predicted risk statistics for provided holdings using risk model data. Asset symbols and market values/weights are required.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, OperationsApi } = require('@factset/sdk-openrisk');
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

const apiInstance = new OperationsApi();
const version = v1; // String | Semantic version number. See [this link here](https://regexr.com/47b7t) to test validate patterns.
const calculateFromHoldingsRequestBody = {"data":{"stats":[{"name":"ActiveVarianceToRisk","level":"Portfolio"},{"name":"ActiveVarianceToRisk","level":"SecurityGroup"},{"name":"PortfolioWeights","level":"Security"},{"name":"BenchmarkWeights","level":"Security"},{"name":"ActiveWeights","level":"Security"},{"name":"ActiveFactorVarianceToRisk","level":"Security","settings":{"correlatedSpecificRisk":true}},{"name":"ActiveFactorVarianceToRiskCSR","level":"Security"},{"name":"ActiveFactorRisk","level":"FactorGroup","settings":{"covarianceTimesTwo":true}},{"name":"PortfolioReturnAtRiskPercentWithContribution","level":"Portfolio","settings":{"confidenceLevel":0.95,"daysPerYear":250,"horizon":1}},{"name":"RawResidualRisk","level":"Security"},{"name":"RawSecurityFactorRisk","level":"Security"},{"name":"RawFactorExposure","level":"FactorSecurity"},{"name":"RawFactorExposure","level":"FactorSecurity","settings":{"sparse":true}},{"name":"PortfolioExposure","level":"Factor","settings":{"sparse":true}}],"holdings":{"portfolio":{"ids":["IBM","FDS","CA_ETF","CASH_GBP_CFD","CFD_B10RZP"],"marketValues":[60,30,30,-30,30],"grouping":{"groups":[{"name":"USD","groups":[{"name":"Direct Assets","indices":[0,1]},{"name":"Composite Assets","indices":[2]}]},{"name":"GBP","indices":[4]},{"name":"Offset Cash","indices":[3]}]}},"benchmark":{"ids":["B10RZP","IBM","MSFT"],"marketValues":[30,40,30],"grouping":{"groups":[{"name":"GBP","indices":[0]},{"name":"USD","groups":[{"name":"Direct Assets","indices":[1,2]}]}]}}},"underlyingIds":{"CFD_B10RZP":"B10RZP"},"compositeAssets":{"CA_ETF":{"ids":["FDS","IBM"],"marketValues":[10,90]}},"assetTypes":{"CFD_B10RZP":"OTH_CFD"},"factorGrouping":{"name":"This factor grouping is incomplete; it omits factors for the sake of brevity and is not recomended for actual use.","nodes":[{"name":"Market","nodes":[{"id":"GLOBAL_MARKET"}]},{"name":"Style","nodes":[{"name":"Market Factors","nodes":[{"id":"BETA"},{"id":"LIQUIDITY"},{"id":"MOMENTUM"},{"id":"SIZE"},{"id":"VOLATILITY"}]},{"name":"Fundamental Factors","nodes":[{"id":"BOOK_TO_PRICE"},{"id":"DIVIDEND_YIELD"},{"id":"EARNINGS_YIELD"},{"id":"GROWTH"},{"id":"LEVERAGE"}]}]}]},"factorsVisible":{"list":["FX_GBP","FX_USD"],"type":"Whitelist"},"allowForcedRisklessAssets":true,"currency":"USD","riskModel":"FDS:GLOBAL_EQUITY_M_V1","date":"2021-05-31","calendar":"FIVEDAY"}}; // CalculateFromHoldingsRequestBody | 

// Call api endpoint
apiInstance.calculateFromHoldings(version, calculateFromHoldingsRequestBody).then(
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
 **version** | **String**| Semantic version number. See [this link here](https://regexr.com/47b7t) to test validate patterns. | 
 **calculateFromHoldingsRequestBody** | [**CalculateFromHoldingsRequestBody**](CalculateFromHoldingsRequestBody.md)|  | 

### Return type

[**InlineResponse2004**](InlineResponse2004.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, text/plain


## generateIdMapping

> InlineResponse2005 generateIdMapping(version, generateIDMappingRequestBody)

Generate risk model ID mapping

Resolve all input holdings IDs against a risk model for coverage and provide a mapping to security indices in the model or the reason for exclusion

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, OperationsApi } = require('@factset/sdk-openrisk');
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

const apiInstance = new OperationsApi();
const version = v1; // String | Semantic version number. See [this link here](https://regexr.com/47b7t) to test validate patterns.
const generateIDMappingRequestBody = {"data":{"holdings":{"portfolio":{"grouping":{"groups":[{"name":"USD","groups":[{"name":"Direct Assets","indices":[0,1]},{"name":"Composite Assets","indices":[2]}]},{"name":"GBP","indices":[4]},{"name":"Offset Cash","indices":[3]}]},"ids":["IBM","FDS","CA_ETF","CASH_GBP_CFD","CFD_B10RZP"],"marketValues":[60,30,30,-30,30]},"benchmark":{"grouping":{"groups":[{"name":"GBP","indices":[0]},{"name":"USD","groups":[{"name":"Direct Assets","indices":[1,2]}]},{"name":"Other - Uncovered Assets","indices":[3]}]},"ids":["B10RZP","IBM","MSFT","FAKE_UNCOVERED_ASSET"],"marketValues":[30,30,30,10]}},"allowForcedRisklessAssets":true,"assetTypes":{"CFD_B10RZP":"OTH_CFD"},"calendar":"FIVEDAY","compositeAssets":{"CA_ETF":{"ids":["FDS","IBM"],"marketValues":[10,90]}},"currency":"USD","date":"2021-05-31","riskModel":"FDS:GLOBAL_EQUITY_M_V1","underlyingIds":{"CFD_B10RZP":"B10RZP"}}}; // GenerateIDMappingRequestBody | 

// Call api endpoint
apiInstance.generateIdMapping(version, generateIDMappingRequestBody).then(
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
 **version** | **String**| Semantic version number. See [this link here](https://regexr.com/47b7t) to test validate patterns. | 
 **generateIDMappingRequestBody** | [**GenerateIDMappingRequestBody**](GenerateIDMappingRequestBody.md)|  | 

### Return type

[**InlineResponse2005**](InlineResponse2005.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

