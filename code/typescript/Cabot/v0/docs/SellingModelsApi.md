# cabot.SellingModelsApi

All URIs are relative to *https://api.factset.com/analytics/cabot/v0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getSellTimingModelAnalytic**](SellingModelsApi.md#getSellTimingModelAnalytic) | **GET** /models/sell-timing | Cabot main path for Sell Timing API
[**getStopLossModelAnalytic**](SellingModelsApi.md#getStopLossModelAnalytic) | **GET** /models/stop-loss | Cabot main path for Stop Loss API



## getSellTimingModelAnalytic

> SellTimingResponseRoot getSellTimingModelAnalytic(accountPath, benchmarkPath, period, opts)

Cabot main path for Sell Timing API

Cabot main path for Sell Timing API

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, SellingModelsApi } = require('@factset/sdk-cabot');
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

const apiInstance = new SellingModelsApi();
const accountPath = "accountPath_example"; // String | The account path of the portfolio you want to retrieve the data for.<br /><br />
const benchmarkPath = "benchmarkPath_example"; // String | The path of the benchmark you want to retrieve the data for.<br /><br />
const period = 2015-2017; // String | For which period you want to retrieve the data.<br />There are four options available as follows:<br /><br />1 -> YYYY (Repeating One Year)<br /><br />2 -> YYYY-YYYY (Repeating Three/Five/Ten Year)<br /><br />3 -> 1M_TRAILING, 3M_TRAILING, 1Y_TRAILING, 3Y_TRAILING, 5Y_TRAILING (Trailing Periods (If available for your portfolio))<br /><br />4 -> INCEPTION_TO_DATE<br /><br />You can only get the data for one period per request.<br /><br />
const opts = {
  'attribute': QFL_EY, // Attributes | The attribute represents the different factors.<br />You can choose which of them (if any) you want to see analytics for.<br /><br />If provided, the API response will contain both \"LOW\" and \"HIGH\" values for it.<br /><br />
  'sector': energy, // Sectors | Sector represents the sector based on the company's industry breakdown.<br />You can choose which of them (if any) you want to see analytics for.<br /><br />
  'region': northAmerica, // Regions | Region of domicile represents the region based on the company's primary listing.<br />You can choose which of them (if any) you want to see analytics for.<br /><br />
  'holdings': olderLoser // SellTimingHoldings | If set, the API will add holding-level details for all or only the selected analytic (if available for your portfolio).<br /><br />
};

// Call api endpoint
apiInstance.getSellTimingModelAnalytic(accountPath, benchmarkPath, period, opts).then(
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
 **accountPath** | **String**| The account path of the portfolio you want to retrieve the data for.&lt;br /&gt;&lt;br /&gt; | 
 **benchmarkPath** | **String**| The path of the benchmark you want to retrieve the data for.&lt;br /&gt;&lt;br /&gt; | 
 **period** | **String**| For which period you want to retrieve the data.&lt;br /&gt;There are four options available as follows:&lt;br /&gt;&lt;br /&gt;1 -&gt; YYYY (Repeating One Year)&lt;br /&gt;&lt;br /&gt;2 -&gt; YYYY-YYYY (Repeating Three/Five/Ten Year)&lt;br /&gt;&lt;br /&gt;3 -&gt; 1M_TRAILING, 3M_TRAILING, 1Y_TRAILING, 3Y_TRAILING, 5Y_TRAILING (Trailing Periods (If available for your portfolio))&lt;br /&gt;&lt;br /&gt;4 -&gt; INCEPTION_TO_DATE&lt;br /&gt;&lt;br /&gt;You can only get the data for one period per request.&lt;br /&gt;&lt;br /&gt; | 
 **attribute** | [**Attributes**](.md)| The attribute represents the different factors.&lt;br /&gt;You can choose which of them (if any) you want to see analytics for.&lt;br /&gt;&lt;br /&gt;If provided, the API response will contain both \&quot;LOW\&quot; and \&quot;HIGH\&quot; values for it.&lt;br /&gt;&lt;br /&gt; | [optional] 
 **sector** | [**Sectors**](.md)| Sector represents the sector based on the company&#39;s industry breakdown.&lt;br /&gt;You can choose which of them (if any) you want to see analytics for.&lt;br /&gt;&lt;br /&gt; | [optional] 
 **region** | [**Regions**](.md)| Region of domicile represents the region based on the company&#39;s primary listing.&lt;br /&gt;You can choose which of them (if any) you want to see analytics for.&lt;br /&gt;&lt;br /&gt; | [optional] 
 **holdings** | [**SellTimingHoldings**](.md)| If set, the API will add holding-level details for all or only the selected analytic (if available for your portfolio).&lt;br /&gt;&lt;br /&gt; | [optional] 

### Return type

[**SellTimingResponseRoot**](SellTimingResponseRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getStopLossModelAnalytic

> StopLossResponseRoot getStopLossModelAnalytic(accountPath, benchmarkPath, period, opts)

Cabot main path for Stop Loss API

Cabot main path for Stop Loss API

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, SellingModelsApi } = require('@factset/sdk-cabot');
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

const apiInstance = new SellingModelsApi();
const accountPath = "accountPath_example"; // String | The account path of the portfolio you want to retrieve the data for.<br /><br />
const benchmarkPath = "benchmarkPath_example"; // String | The path of the benchmark you want to retrieve the data for.<br /><br />
const period = 2015-2017; // String | For which period you want to retrieve the data.<br />There are four options available as follows:<br /><br />1 -> YYYY (Repeating One Year)<br /><br />2 -> YYYY-YYYY (Repeating Three/Five/Ten Year)<br /><br />3 -> 1M_TRAILING, 3M_TRAILING, 1Y_TRAILING, 3Y_TRAILING, 5Y_TRAILING (Trailing Periods (If available for your portfolio))<br /><br />4 -> INCEPTION_TO_DATE<br /><br />You can only get the data for one period per request.<br /><br />
const opts = {
  'attribute': QFL_EY, // Attributes | The attribute represents the different factors.<br />You can choose which of them (if any) you want to see analytics for.<br /><br />If provided, the API response will contain both \"LOW\" and \"HIGH\" values for it.<br /><br />
  'sector': energy, // Sectors | Sector represents the sector based on the company's industry breakdown.<br />You can choose which of them (if any) you want to see analytics for.<br /><br />
  'region': northAmerica, // Regions | Region of domicile represents the region based on the company's primary listing.<br />You can choose which of them (if any) you want to see analytics for.<br /><br />
  'holdings': -20 // StopLossHoldings | If set, the API will add holding-level details for all or only the selected analytic (if available for your portfolio).<br /><br />
};

// Call api endpoint
apiInstance.getStopLossModelAnalytic(accountPath, benchmarkPath, period, opts).then(
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
 **accountPath** | **String**| The account path of the portfolio you want to retrieve the data for.&lt;br /&gt;&lt;br /&gt; | 
 **benchmarkPath** | **String**| The path of the benchmark you want to retrieve the data for.&lt;br /&gt;&lt;br /&gt; | 
 **period** | **String**| For which period you want to retrieve the data.&lt;br /&gt;There are four options available as follows:&lt;br /&gt;&lt;br /&gt;1 -&gt; YYYY (Repeating One Year)&lt;br /&gt;&lt;br /&gt;2 -&gt; YYYY-YYYY (Repeating Three/Five/Ten Year)&lt;br /&gt;&lt;br /&gt;3 -&gt; 1M_TRAILING, 3M_TRAILING, 1Y_TRAILING, 3Y_TRAILING, 5Y_TRAILING (Trailing Periods (If available for your portfolio))&lt;br /&gt;&lt;br /&gt;4 -&gt; INCEPTION_TO_DATE&lt;br /&gt;&lt;br /&gt;You can only get the data for one period per request.&lt;br /&gt;&lt;br /&gt; | 
 **attribute** | [**Attributes**](.md)| The attribute represents the different factors.&lt;br /&gt;You can choose which of them (if any) you want to see analytics for.&lt;br /&gt;&lt;br /&gt;If provided, the API response will contain both \&quot;LOW\&quot; and \&quot;HIGH\&quot; values for it.&lt;br /&gt;&lt;br /&gt; | [optional] 
 **sector** | [**Sectors**](.md)| Sector represents the sector based on the company&#39;s industry breakdown.&lt;br /&gt;You can choose which of them (if any) you want to see analytics for.&lt;br /&gt;&lt;br /&gt; | [optional] 
 **region** | [**Regions**](.md)| Region of domicile represents the region based on the company&#39;s primary listing.&lt;br /&gt;You can choose which of them (if any) you want to see analytics for.&lt;br /&gt;&lt;br /&gt; | [optional] 
 **holdings** | [**StopLossHoldings**](.md)| If set, the API will add holding-level details for all or only the selected analytic (if available for your portfolio).&lt;br /&gt;&lt;br /&gt; | [optional] 

### Return type

[**StopLossResponseRoot**](StopLossResponseRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

