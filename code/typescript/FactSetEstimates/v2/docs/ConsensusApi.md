# factsetestimates.ConsensusApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getFixedConsensus**](ConsensusApi.md#getFixedConsensus) | **GET** /factset-estimates/v2/fixed-consensus | Retrieves consensus estimates for a requested list of ids and fixed fiscal periods
[**getFixedConsensusForList**](ConsensusApi.md#getFixedConsensusForList) | **POST** /factset-estimates/v2/fixed-consensus | FactSet consensus estimates for fixed fiscal periods
[**getRollingConsensus**](ConsensusApi.md#getRollingConsensus) | **GET** /factset-estimates/v2/rolling-consensus | Retrieves consensus estimates for a requested list of ids and rolling fiscal periods.
[**getRollingConsensusForList**](ConsensusApi.md#getRollingConsensusForList) | **POST** /factset-estimates/v2/rolling-consensus | Retrieves consensus estimates for a requested list of ids and rolling fiscal periods



## getFixedConsensus

> ConsensusResponse getFixedConsensus(ids, metrics, opts)

Retrieves consensus estimates for a requested list of ids and fixed fiscal periods

Returns FactSet Estimates consensus data using fixed fiscal dates. For example, if the company&#39;s current unreported year is 12/2020, all data returned by formulas that specify as the period/report basis will be for 12/2005 regardless of what perspective dates (startDate/endDate) are used. The fixed dates are \&quot;locked\&quot; in time and all estimated values are for that explicit date. If you are requesting that the estimated periods can change with the perspective date, please use the rolling-consensus endpoint. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, ConsensusApi } = require('@factset/sdk-factsetestimates');
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

const apiInstance = new ConsensusApi();
const ids = ["AAPL-USA"]; // [String] | Security or Entity identifiers. Accepted inputs include FactSet Identifiers, tickers, CUSIP, and SEDOL. <p><b>Performance Note:</b> Requests that increase the number of metrics or request long historical data may trigger the 30-second service timeout threshold. To ensure system stability and performance, please keep requests lightweight.</p> <p>If requesting long historical data, limit the history to <b>10 years per metric per ID</b>.</p> 
const metrics = ["SALES"]; // [String] | Requested metrics. Use the `/metrics` endpoint to return a list of available estimate items. Note, the number of metrics you are allowed to supply is limited to 1 for now. **Top 10** most used metrics are **EPS, SALES, DPS, EBITDA,EBIT, PRICE_TGT, CFPS, BPS, NET_INC, and ASSETS**.  For more details, visit [Online Assistant Page #15034](https://oa.apps.factset.com/pages/15034). 
const opts = {
  'startDate': 2019-07-30, // String | Start date for point in time of estimates expressed in YYYY-MM-DD format.
  'endDate': 2019-08-30, // String | End date for point in time of estimates expressed in YYYY-MM-DD format.
  'frequency': D, // String | Controls the frequency of the data returned.   * **D** = Daily   * **W** = Weekly, based on the last day of the week of the start date.   * **AM** = Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16 etc.).         * **AQ** = Quarterly, based on the start date.   * **AY** = Actual Annual, based on the start date.  
  'fiscalPeriodStart': 2019, // String | Fiscal period start expressed in absolute date formats. Date that will fall back to most recent completed period during resolution.   * **Fiscal Quarter-end** - YYYY/FQ (e.g., 2019/1F, 2019/2F, 2019/3F, 2019/4F)   * **Fiscal Year-end** - YYYY (e.g. 2019) 
  'fiscalPeriodEnd': 2020, // String | Fiscal period start expressed in absolute date formats. Date that will fall back to most recent completed period during resolution.   * **Fiscal Quarter-end** - YYYY/FQ (e.g., 2019/1F, 2019/2F, 2019/3F, 2019/4F)   * **Fiscal Year-end** - YYYY (e.g. 2019) 
  'periodicity': "'ANN'", // String | The periodicity for the estimates requested, allowing you to fetch Quarterly, Semi-Annual, Annual, and NTMA/LTMA Estimates.   * **ANN** - Annual   * **QTR** - Quarterly   * **SEMI** - Semi-Annual    * **NTMA** - Next-Twelve-Months - Time-weighted Annual. Estimates use a percentage of annual estimates from two fiscal years to create an estimate based on the 12-month period. Visit [OA 16614](https://my.apps.factset.com/oa/pages/16614) for detail.   * **LTMA** - Last-Twelve-Months - Time-weighted Annual. Estimates use a percentage of annual estimates from two fiscal years to create an estimate based on the 12-month period. Visit [OA 16614](https://my.apps.factset.com/oa/pages/16614) for detail.    
  'currency': USD // String | Currency code for adjusting the data. Use `ESTIMATE` as input value for the values in Estimate Currency. For a list of currency ISO codes, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470).
};

// Call api endpoint
apiInstance.getFixedConsensus(ids, metrics, opts).then(
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
 **ids** | [**[String]**](String.md)| Security or Entity identifiers. Accepted inputs include FactSet Identifiers, tickers, CUSIP, and SEDOL. &lt;p&gt;&lt;b&gt;Performance Note:&lt;/b&gt; Requests that increase the number of metrics or request long historical data may trigger the 30-second service timeout threshold. To ensure system stability and performance, please keep requests lightweight.&lt;/p&gt; &lt;p&gt;If requesting long historical data, limit the history to &lt;b&gt;10 years per metric per ID&lt;/b&gt;.&lt;/p&gt;  | 
 **metrics** | [**[String]**](String.md)| Requested metrics. Use the &#x60;/metrics&#x60; endpoint to return a list of available estimate items. Note, the number of metrics you are allowed to supply is limited to 1 for now. **Top 10** most used metrics are **EPS, SALES, DPS, EBITDA,EBIT, PRICE_TGT, CFPS, BPS, NET_INC, and ASSETS**.  For more details, visit [Online Assistant Page #15034](https://oa.apps.factset.com/pages/15034).  | 
 **startDate** | **String**| Start date for point in time of estimates expressed in YYYY-MM-DD format. | [optional] 
 **endDate** | **String**| End date for point in time of estimates expressed in YYYY-MM-DD format. | [optional] 
 **frequency** | **String**| Controls the frequency of the data returned.   * **D** &#x3D; Daily   * **W** &#x3D; Weekly, based on the last day of the week of the start date.   * **AM** &#x3D; Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16 etc.).         * **AQ** &#x3D; Quarterly, based on the start date.   * **AY** &#x3D; Actual Annual, based on the start date.   | [optional] [default to &#39;AM&#39;]
 **fiscalPeriodStart** | **String**| Fiscal period start expressed in absolute date formats. Date that will fall back to most recent completed period during resolution.   * **Fiscal Quarter-end** - YYYY/FQ (e.g., 2019/1F, 2019/2F, 2019/3F, 2019/4F)   * **Fiscal Year-end** - YYYY (e.g. 2019)  | [optional] 
 **fiscalPeriodEnd** | **String**| Fiscal period start expressed in absolute date formats. Date that will fall back to most recent completed period during resolution.   * **Fiscal Quarter-end** - YYYY/FQ (e.g., 2019/1F, 2019/2F, 2019/3F, 2019/4F)   * **Fiscal Year-end** - YYYY (e.g. 2019)  | [optional] 
 **periodicity** | **String**| The periodicity for the estimates requested, allowing you to fetch Quarterly, Semi-Annual, Annual, and NTMA/LTMA Estimates.   * **ANN** - Annual   * **QTR** - Quarterly   * **SEMI** - Semi-Annual    * **NTMA** - Next-Twelve-Months - Time-weighted Annual. Estimates use a percentage of annual estimates from two fiscal years to create an estimate based on the 12-month period. Visit [OA 16614](https://my.apps.factset.com/oa/pages/16614) for detail.   * **LTMA** - Last-Twelve-Months - Time-weighted Annual. Estimates use a percentage of annual estimates from two fiscal years to create an estimate based on the 12-month period. Visit [OA 16614](https://my.apps.factset.com/oa/pages/16614) for detail.     | [optional] [default to &#39;ANN&#39;]
 **currency** | **String**| Currency code for adjusting the data. Use &#x60;ESTIMATE&#x60; as input value for the values in Estimate Currency. For a list of currency ISO codes, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470). | [optional] 

### Return type

[**ConsensusResponse**](ConsensusResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getFixedConsensusForList

> ConsensusResponse getFixedConsensusForList(fixedConsensusRequest)

FactSet consensus estimates for fixed fiscal periods

Returns FactSet Estimates consensus data using fixed fiscal dates. For example, if the company&#39;s current unreported year is 12/2020, all data returned by formulas that specify as the period/report basis will be for 12/2005 regardless of what perspective dates (startDate/endDate) are used. The fixed dates are \&quot;locked\&quot; in time and all estimated values are for that explicit date. If you are requesting that the estimated periods can change with the perspective date, please use the rolling-consensus endpoint. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, ConsensusApi } = require('@factset/sdk-factsetestimates');
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

const apiInstance = new ConsensusApi();
const fixedConsensusRequest = new factsetestimates.FixedConsensusRequest(); // FixedConsensusRequest | Request object for Estimate Data Items.

// Call api endpoint
apiInstance.getFixedConsensusForList(fixedConsensusRequest).then(
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
 **fixedConsensusRequest** | [**FixedConsensusRequest**](FixedConsensusRequest.md)| Request object for Estimate Data Items. | 

### Return type

[**ConsensusResponse**](ConsensusResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## getRollingConsensus

> ConsensusResponse getRollingConsensus(ids, metrics, opts)

Retrieves consensus estimates for a requested list of ids and rolling fiscal periods.

Returns FactSet Estimates consensus data using rolling fiscal dates. &lt;p&gt;The rolling behavior causes fiscal year to automatically roll from one year to the next as the historical perspective date changes. The fiscal period rolls forward as of each period end. This endpoint is optimized to allow the request to simply include a relative fiscal period (e.g. use relativeFiscalStart integer 1 and periodicity ANN for next unreported fiscal year end), and then see what the consensus thought the \&quot;next fiscal year\&quot; estimates were through time as you \&quot;roll\&quot; back your perspective dates. This differs from locking down an absolute estimate period such as explicitly stating Fiscal Year 2019. This can be done in the fixed-consensus endpoint.&lt;/p&gt; 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, ConsensusApi } = require('@factset/sdk-factsetestimates');
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

const apiInstance = new ConsensusApi();
const ids = ["AAPL-USA"]; // [String] | Security or Entity identifiers. Accepted inputs include FactSet Identifiers, tickers, CUSIP, and SEDOL. <p><b>Performance Note:</b> Requests that increase the number of metrics or request long historical data may trigger the 30-second service timeout threshold. To ensure system stability and performance, please keep requests lightweight.</p> <p>If requesting long historical data, limit the history to <b>10 years per metric per ID</b>.</p> 
const metrics = ["SALES"]; // [String] | Requested metrics. Use the `/metrics` endpoint to return a list of available estimate items. Note, the number of metrics you are allowed to supply is limited to 1 for now. **Top 10** most used metrics are **EPS, SALES, DPS, EBITDA,EBIT, PRICE_TGT, CFPS, BPS, NET_INC, and ASSETS**.  For more details, visit [Online Assistant Page #15034](https://oa.apps.factset.com/pages/15034). 
const opts = {
  'startDate': 2019-07-30, // String | Start date for point in time of estimates expressed in YYYY-MM-DD format.
  'endDate': 2019-08-30, // String | End date for point in time of estimates expressed in YYYY-MM-DD format.
  'frequency': D, // String | Controls the frequency of the data returned.   * **D** = Daily   * **W** = Weekly, based on the last day of the week of the start date.   * **AM** = Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16 etc.).         * **AQ** = Quarterly, based on the start date.   * **AY** = Actual Annual, based on the start date.  
  'relativeFiscalStart': 1, // Number | Relative fiscal period, expressed as an integer, used to filter results. This is combined with the periodicity parameter to specify a relative estimate period. For example, set to 1 and periodicity to ANN to ask for relative Fiscal Year 1 (FY1).
  'relativeFiscalEnd': 2, // Number | Relative fiscal period, expressed as an integer, used to filter results. This is combined with the periodicity parameter to specify a relative estimate period. For example, set to 2 and periodicity to ANN to ask for relative Fiscal Year 1 (FY2).
  'periodicity': "'ANN'", // String | The periodicity for the estimates requested, allowing you to fetch Quarterly, Semi-Annual, Annual, and NTMA/LTMA Estimates.   * **ANN** - Annual   * **QTR** - Quarterly   * **SEMI** - Semi-Annual    * **NTMA** - Next-Twelve-Months - Time-weighted Annual. Estimates use a percentage of annual estimates from two fiscal years to create an estimate based on the 12-month period. Visit [OA 16614](https://my.apps.factset.com/oa/pages/16614) for detail.   * **LTMA** - Last-Twelve-Months - Time-weighted Annual. Estimates use a percentage of annual estimates from two fiscal years to create an estimate based on the 12-month period. Visit [OA 16614](https://my.apps.factset.com/oa/pages/16614) for detail.    
  'currency': USD // String | Currency code for adjusting the data. Use `ESTIMATE` as input value for the values in Estimate Currency. For a list of currency ISO codes, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470).
};

// Call api endpoint
apiInstance.getRollingConsensus(ids, metrics, opts).then(
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
 **ids** | [**[String]**](String.md)| Security or Entity identifiers. Accepted inputs include FactSet Identifiers, tickers, CUSIP, and SEDOL. &lt;p&gt;&lt;b&gt;Performance Note:&lt;/b&gt; Requests that increase the number of metrics or request long historical data may trigger the 30-second service timeout threshold. To ensure system stability and performance, please keep requests lightweight.&lt;/p&gt; &lt;p&gt;If requesting long historical data, limit the history to &lt;b&gt;10 years per metric per ID&lt;/b&gt;.&lt;/p&gt;  | 
 **metrics** | [**[String]**](String.md)| Requested metrics. Use the &#x60;/metrics&#x60; endpoint to return a list of available estimate items. Note, the number of metrics you are allowed to supply is limited to 1 for now. **Top 10** most used metrics are **EPS, SALES, DPS, EBITDA,EBIT, PRICE_TGT, CFPS, BPS, NET_INC, and ASSETS**.  For more details, visit [Online Assistant Page #15034](https://oa.apps.factset.com/pages/15034).  | 
 **startDate** | **String**| Start date for point in time of estimates expressed in YYYY-MM-DD format. | [optional] 
 **endDate** | **String**| End date for point in time of estimates expressed in YYYY-MM-DD format. | [optional] 
 **frequency** | **String**| Controls the frequency of the data returned.   * **D** &#x3D; Daily   * **W** &#x3D; Weekly, based on the last day of the week of the start date.   * **AM** &#x3D; Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16 etc.).         * **AQ** &#x3D; Quarterly, based on the start date.   * **AY** &#x3D; Actual Annual, based on the start date.   | [optional] [default to &#39;AM&#39;]
 **relativeFiscalStart** | **Number**| Relative fiscal period, expressed as an integer, used to filter results. This is combined with the periodicity parameter to specify a relative estimate period. For example, set to 1 and periodicity to ANN to ask for relative Fiscal Year 1 (FY1). | [optional] 
 **relativeFiscalEnd** | **Number**| Relative fiscal period, expressed as an integer, used to filter results. This is combined with the periodicity parameter to specify a relative estimate period. For example, set to 2 and periodicity to ANN to ask for relative Fiscal Year 1 (FY2). | [optional] 
 **periodicity** | **String**| The periodicity for the estimates requested, allowing you to fetch Quarterly, Semi-Annual, Annual, and NTMA/LTMA Estimates.   * **ANN** - Annual   * **QTR** - Quarterly   * **SEMI** - Semi-Annual    * **NTMA** - Next-Twelve-Months - Time-weighted Annual. Estimates use a percentage of annual estimates from two fiscal years to create an estimate based on the 12-month period. Visit [OA 16614](https://my.apps.factset.com/oa/pages/16614) for detail.   * **LTMA** - Last-Twelve-Months - Time-weighted Annual. Estimates use a percentage of annual estimates from two fiscal years to create an estimate based on the 12-month period. Visit [OA 16614](https://my.apps.factset.com/oa/pages/16614) for detail.     | [optional] [default to &#39;ANN&#39;]
 **currency** | **String**| Currency code for adjusting the data. Use &#x60;ESTIMATE&#x60; as input value for the values in Estimate Currency. For a list of currency ISO codes, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470). | [optional] 

### Return type

[**ConsensusResponse**](ConsensusResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getRollingConsensusForList

> ConsensusResponse getRollingConsensusForList(rollingConsensusRequest)

Retrieves consensus estimates for a requested list of ids and rolling fiscal periods

Returns FactSet Estimates consensus data using rolling fiscal dates. &lt;p&gt;The rolling behavior causes fiscal year to automatically roll from one year to the next as the historical perspective date changes. The fiscal period rolls forward as of each period end. This endpoint is optimized to allow the request to simply include a relative fiscal period (e.g. use relativeFiscalStart integer 1 and periodicity ANN for next unreported fiscal year end), and then see what the consensus thought the \&quot;next fiscal year\&quot; estimates were through time as you \&quot;roll\&quot; back your perspective dates. This differs from locking down an absolute estimate period such as explicitly stating Fiscal Year 2019. This can be done in the fixed-consensus endpoint.&lt;/p&gt; 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, ConsensusApi } = require('@factset/sdk-factsetestimates');
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

const apiInstance = new ConsensusApi();
const rollingConsensusRequest = new factsetestimates.RollingConsensusRequest(); // RollingConsensusRequest | Request object for Rolling Conensus estimates.

// Call api endpoint
apiInstance.getRollingConsensusForList(rollingConsensusRequest).then(
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
 **rollingConsensusRequest** | [**RollingConsensusRequest**](RollingConsensusRequest.md)| Request object for Rolling Conensus estimates. | 

### Return type

[**ConsensusResponse**](ConsensusResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

