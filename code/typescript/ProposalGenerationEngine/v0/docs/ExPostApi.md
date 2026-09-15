# proposalgenerationengine.ExPostApi

All URIs are relative to *https://api.factset.com/analytics/engines/proposal-generation/v0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**calculateExPostCorrelationsStats**](ExPostApi.md#calculateExPostCorrelationsStats) | **POST** /portfolios/ex-post/stats/correlations | calculate portfolio vs benchmark correlation and correlation between portfolio holdings
[**calculateExPostFactorExposureStats**](ExPostApi.md#calculateExPostFactorExposureStats) | **POST** /portfolios/ex-post/stats/factor-exposure | Create portfolio and return risk factor contribution
[**calculateExPostRollingSeries**](ExPostApi.md#calculateExPostRollingSeries) | **POST** /portfolios/ex-post/series/rolling | retrieve series of rolling stats for the portfolio
[**calculateExPostRollingStats**](ExPostApi.md#calculateExPostRollingStats) | **POST** /portfolios/ex-post/stats/rolling | calculate rolling stats (for ex-post data)
[**calculateExPostSeries**](ExPostApi.md#calculateExPostSeries) | **POST** /portfolios/ex-post/series | retrieve portfolio and benchmark data series, generated from the underlying holdings data series
[**calculateExPostStats**](ExPostApi.md#calculateExPostStats) | **POST** /portfolios/ex-post/stats | calculate ex-post stats (on portfolio or holdings level)



## calculateExPostCorrelationsStats

> ExPostStatsCorrelationsResponse calculateExPostCorrelationsStats(opts)

calculate portfolio vs benchmark correlation and correlation between portfolio holdings

Notes:&lt;br&gt; * id &#39;Cash proxy&#39; can be used in order to set cash amount for the portfolio

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, ExPostApi } = require('@factset/sdk-proposalgenerationengine');
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

const apiInstance = new ExPostApi();
const opts = {
  'exPostStatsCorrelations': {"data":{"portfolio":{"id":"sample_ID","details":{"name":"test portfolio"},"initialValue":1000,"rebalancing":{"frequency":12,"frequencyAlignment":"start","rebalanceAtStart":true},"holdings":[{"id":"security_id_1","weight":1,"salesCharge":0,"transactionRules":[{"type":"fee","amount":0,"amountType":"cash","amountGrowth":0,"amountGrowthType":"absolute","amountGrowthFrequency":1,"allowPartialAmount":false,"startDate":"2026-03-11","endDate":"2026-03-11","frequency":0,"frequencyAlignment":"start"}]}],"transactionRules":[{"type":"fee","amount":0,"amountType":"cash","amountGrowth":0,"amountGrowthType":"absolute","amountGrowthFrequency":1,"allowPartialAmount":false,"startDate":"2026-03-11","endDate":"2026-03-11","frequency":0,"frequencyAlignment":"start"}]},"benchmark":{"details":{"name":"bmk_portfolio"},"initialValue":1000,"rebalancing":{"frequency":12,"frequencyAlignment":"start","rebalanceAtStart":true},"holdings":[{"id":"security_id_3","weight":50,"salesCharge":0}]},"settings":{"asOfDate":"latestMonthEnd","returnsPreferences":"string","validatePortfolio":false,"timeWindows":["ytd","12","36","60","120","lifetime"],"stats":["correlationMatrix","portfolioCorrelationMatrix","actReturnsCorrelationMatrix"],"holdingsLimit":1,"fundCorrelationsOnly":true,"showBenchmark":true}}} // ExPostStatsCorrelations | 
};

// Call api endpoint
apiInstance.calculateExPostCorrelationsStats(opts).then(
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
 **exPostStatsCorrelations** | [**ExPostStatsCorrelations**](ExPostStatsCorrelations.md)|  | [optional] 

### Return type

[**ExPostStatsCorrelationsResponse**](ExPostStatsCorrelationsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## calculateExPostFactorExposureStats

> ExPostStatsFactorExposureResponse calculateExPostFactorExposureStats(opts)

Create portfolio and return risk factor contribution

Ex-Post factor-exposure Stats

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, ExPostApi } = require('@factset/sdk-proposalgenerationengine');
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

const apiInstance = new ExPostApi();
const opts = {
  'exPostStatsFactorExposure': {"data":{"portfolio":{"id":"sample_ID","details":{"name":"test portfolio"},"initialValue":1000,"rebalancing":{"frequency":12,"frequencyAlignment":"start","rebalanceAtStart":true},"holdings":[{"id":"security_id_1","weight":1,"salesCharge":0,"transactionRules":[{"type":"fee","amount":0,"amountType":"cash","amountGrowth":0,"amountGrowthType":"absolute","amountGrowthFrequency":1,"allowPartialAmount":false,"startDate":"2026-03-11","endDate":"2026-03-11","frequency":0,"frequencyAlignment":"start"}]}],"transactionRules":[{"type":"fee","amount":0,"amountType":"cash","amountGrowth":0,"amountGrowthType":"absolute","amountGrowthFrequency":1,"allowPartialAmount":false,"startDate":"2026-03-11","endDate":"2026-03-11","frequency":0,"frequencyAlignment":"start"}]},"benchmark":{"details":{"name":"bmk_portfolio"},"initialValue":1000,"rebalancing":{"frequency":12,"frequencyAlignment":"start","rebalanceAtStart":true},"holdings":[{"id":"security_id_3","weight":1,"salesCharge":0}]},"settings":{"asOfDate":"latestMonthEnd","returnsPreferences":"string","validatePortfolio":false,"timeWindows":["ytd","12","36","60","120","lifetime"],"displayFormat":1,"riskTreeLevel":3}}} // ExPostStatsFactorExposure | 
};

// Call api endpoint
apiInstance.calculateExPostFactorExposureStats(opts).then(
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
 **exPostStatsFactorExposure** | [**ExPostStatsFactorExposure**](ExPostStatsFactorExposure.md)|  | [optional] 

### Return type

[**ExPostStatsFactorExposureResponse**](ExPostStatsFactorExposureResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## calculateExPostRollingSeries

> ExPostSeriesRollingResponse calculateExPostRollingSeries(opts)

retrieve series of rolling stats for the portfolio

Notes:&lt;br&gt; * id &#39;Cash proxy&#39; can be used in order to set cash amount for the portfolio

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, ExPostApi } = require('@factset/sdk-proposalgenerationengine');
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

const apiInstance = new ExPostApi();
const opts = {
  'exPostSeriesRolling': {"data":{"portfolio":{"id":"sample_ID","details":{"name":"test portfolio"},"initialValue":1000,"holdings":[{"id":"security_id_1","weight":0.5},{"id":"security_id_2","weight":0.5}],"rebalancing":{"frequency":12,"frequencyAlignment":"start","rebalanceAtStart":true}},"benchmark":{"details":{"name":"bmk_portfolio"},"initialValue":1000,"holdings":[{"id":"security_id_3","weight":1}],"rebalancing":{"frequency":12,"frequencyAlignment":"start","rebalanceAtStart":true}},"settings":{"asOfDate":"latestMonthEnd","returnsPreferences":"Portal 5.1 - Historical Monthly 120","validatePortfolio":false,"timeWindows":["ytd","12","36","60","120","lifetime"],"rollingTimeWindow":12,"stats":["annReturn","cumReturn","stDev","annLossStd","sharpe","sharpeExcessReturn","sortino","sortinoExcessReturn","correlationMatrix","portfolioCorrelationMatrix"],"periods":[{"startDate":"2017-01-03","endDate":"2017-05-31"}]}}} // ExPostSeriesRolling | 
};

// Call api endpoint
apiInstance.calculateExPostRollingSeries(opts).then(
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
 **exPostSeriesRolling** | [**ExPostSeriesRolling**](ExPostSeriesRolling.md)|  | [optional] 

### Return type

[**ExPostSeriesRollingResponse**](ExPostSeriesRollingResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## calculateExPostRollingStats

> ExPostStatsRollingResponse calculateExPostRollingStats(opts)

calculate rolling stats (for ex-post data)

Notes:&lt;br&gt; * id &#39;Cash proxy&#39; can be used in order to set cash amount for the portfolio

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, ExPostApi } = require('@factset/sdk-proposalgenerationengine');
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

const apiInstance = new ExPostApi();
const opts = {
  'exPostStatsRolling': {"data":{"portfolio":{"id":"sample_ID","details":{"name":"test portfolio"},"initialValue":1000,"rebalancing":{"frequency":12,"frequencyAlignment":"start","rebalanceAtStart":true},"holdings":[{"id":"security_id_1","weight":1,"salesCharge":0,"transactionRules":[{"type":"fee","amount":0,"amountType":"cash","amountGrowth":0,"amountGrowthType":"absolute","amountGrowthFrequency":1,"allowPartialAmount":false,"startDate":"2026-03-11","endDate":"2026-03-11","frequency":0,"frequencyAlignment":"start"}]}],"transactionRules":[{"type":"fee","amount":0,"amountType":"cash","amountGrowth":0,"amountGrowthType":"absolute","amountGrowthFrequency":1,"allowPartialAmount":false,"startDate":"2026-03-11","endDate":"2026-03-11","frequency":0,"frequencyAlignment":"start"}]},"benchmark":{"details":{"name":"bmk_portfolio"},"initialValue":1000,"holdings":[{"id":"security_id_1","weight":1,"salesCharge":0}]},"settings":{"asOfDate":"latestMonthEnd","returnsPreferences":"Portal 5.1 - Historical Monthly 36","validatePortfolio":false,"timeWindows":["ytd","12","36","60","120","lifetime"],"rollingTimeWindow":12,"stats":["annReturn","cumReturn","stDev","annLossStd","sharpe","sharpeExcessReturn","sortino","sortinoExcessReturn","correlationMatrix","portfolioCorrelationMatrix"],"aggregationFunctions":["minimum","maximum"]}}} // ExPostStatsRolling | 
};

// Call api endpoint
apiInstance.calculateExPostRollingStats(opts).then(
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
 **exPostStatsRolling** | [**ExPostStatsRolling**](ExPostStatsRolling.md)|  | [optional] 

### Return type

[**ExPostStatsRollingResponse**](ExPostStatsRollingResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## calculateExPostSeries

> ExPostSeriesResponse calculateExPostSeries(opts)

retrieve portfolio and benchmark data series, generated from the underlying holdings data series

Notes:&lt;br&gt; * id &#39;Cash proxy&#39; can be used in order to set cash amount for the portfolio

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, ExPostApi } = require('@factset/sdk-proposalgenerationengine');
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

const apiInstance = new ExPostApi();
const opts = {
  'exPostSeries': {"data":{"portfolio":{"id":"sample_ID","details":{"name":"test portfolio"},"initialValue":1000,"rebalancing":{"frequency":12,"frequencyAlignment":"start","rebalanceAtStart":true},"holdings":[{"id":"security_id_1","weight":1,"salesCharge":0,"transactionRules":[{"type":"fee","amount":0,"amountType":"cash","amountGrowth":0,"amountGrowthType":"absolute","amountGrowthFrequency":1,"allowPartialAmount":false,"startDate":"2026-03-11","endDate":"2026-03-11","frequency":0,"frequencyAlignment":"start"}]}],"transactionRules":[{"type":"fee","amount":0,"amountType":"cash","amountGrowth":0,"amountGrowthType":"absolute","amountGrowthFrequency":1,"allowPartialAmount":false,"startDate":"2026-03-11","endDate":"2026-03-11","frequency":0,"frequencyAlignment":"start"}]},"benchmark":{"details":{"name":"bmk_portfolio"},"initialValue":1000,"rebalancing":{"frequency":12,"frequencyAlignment":"start","rebalanceAtStart":true},"holdings":[{"id":"security_id_2","weight":50,"salesCharge":0}]},"settings":{"asOfDate":"latestMonthEnd","returnsPreferences":"Portal 5.1 - Historical Monthly 120","validatePortfolio":false,"levels":["portfolio","holdings"],"confidenceLevels":[95,99],"reportingFrequency":1,"timeWindows":["ytd","12","36","60","120","lifetime"],"periods":[{"startDate":"2017-01-03","endDate":"2017-05-31"}],"reportingFrequencyAlignment":"start","series":["values","returns","drawdown","benchmarkDrawdown","contributionTransactions","withdrawalTransactions","feeTransactions"]}}} // ExPostSeries | 
};

// Call api endpoint
apiInstance.calculateExPostSeries(opts).then(
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
 **exPostSeries** | [**ExPostSeries**](ExPostSeries.md)|  | [optional] 

### Return type

[**ExPostSeriesResponse**](ExPostSeriesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## calculateExPostStats

> ExPostStatsResponse calculateExPostStats(opts)

calculate ex-post stats (on portfolio or holdings level)

Notes:&lt;br&gt; * id &#39;Cash proxy&#39; can be used in order to set cash amount for the portfolio

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, ExPostApi } = require('@factset/sdk-proposalgenerationengine');
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

const apiInstance = new ExPostApi();
const opts = {
  'exPostStats': {"data":{"portfolio":{"id":"sample_ID","details":{"name":"test portfolio"},"initialValue":1000,"rebalancing":{"frequency":12,"frequencyAlignment":"start","rebalanceAtStart":true},"holdings":[{"id":"string","weight":1,"salesCharge":0,"transactionRules":[{"type":"fee","amount":0,"amountType":"cash","amountGrowth":0,"amountGrowthType":"absolute","amountGrowthFrequency":1,"allowPartialAmount":false,"startDate":"2026-03-10","endDate":"2026-03-10","frequency":0,"frequencyAlignment":"start"}]}],"transactionRules":[{"type":"fee","amount":0,"amountType":"cash","amountGrowth":0,"amountGrowthType":"absolute","amountGrowthFrequency":1,"allowPartialAmount":false,"startDate":"2026-03-10","endDate":"2026-03-10","frequency":0,"frequencyAlignment":"start"}]},"benchmark":{"details":{"name":"bmk_portfolio"},"initialValue":1000,"rebalancing":{"frequency":12,"frequencyAlignment":"start","rebalanceAtStart":true},"holdings":[{"id":"string","weight":1,"salesCharge":0}]},"settings":{"asOfDate":"latestMonthEnd","returnsPreferences":"Portal 5.1 - Historical Monthly 36","validatePortfolio":false,"levels":["portfolio","holdings"],"confidenceLevels":[95,99],"reportingFrequency":1,"timeWindows":["ytd","12","36","60","120","lifetime"],"periods":[{"startDate":"2017-01-03","endDate":"2017-05-31"}],"reportingFrequencyAlignment":"start","stats":["cumReturn","annReturn","meanReturn","stDev","annStDev","annLossStDev","etl","var","skewness","excessKurtosis","positiveReturnsRatio","alpha","beta","rsquare","upCapture","downCapture","sharpe","sortino","starr","longestDrawdownStart","longestDrawdownEnd","maxDrawdown","maxDrawdownDate","maxDrawdownStart","maxDrawdownEnd","maxDrawdownPeriods","topDrawdowns","boxplotSummary","boxplotOutliers"],"udfs":["maxFrontLoad","assetAllocation"]}}} // ExPostStats | 
};

// Call api endpoint
apiInstance.calculateExPostStats(opts).then(
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
 **exPostStats** | [**ExPostStats**](ExPostStats.md)|  | [optional] 

### Return type

[**ExPostStatsResponse**](ExPostStatsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

