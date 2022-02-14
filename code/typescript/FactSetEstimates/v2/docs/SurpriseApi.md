# factsetestimates.SurpriseApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getSurprise**](SurpriseApi.md#getSurprise) | **GET** /factset-estimates/v2/surprise | Surprise estimates for rolling fiscal periods
[**getSurpriseForList**](SurpriseApi.md#getSurpriseForList) | **POST** /factset-estimates/v2/surprise | Surprise estimates for rolling fiscal periods



## getSurprise

> SurpriseResponse getSurprise(ids, metrics, opts)

Surprise estimates for rolling fiscal periods

Returns FactSet Estimates surprise data using rolling fiscal dates. 

### Example

```javascript
const { ApiClient, SurpriseApi } = require('@factset/sdk-factsetestimates');
const { ConfidentialClient } = require('@factset/sdk-utils');

const apiClient = ApiClient.instance;

// Examples for each supported authentication method are below,
// choose one that satisfies your use case.

// (Preferred) OAuth 2.0: FactSetOAuth2
// See https://github.com/FactSet/enterprise-sdk#oauth-20
// for information on how to create the app-config.json file
// See https://github.com/FactSet/enterprise-sdk-utils-typescript#authentication
// for more information on using the ConfidentialClient class
apiClient.factsetOauth2Client = new ConfidentialClient('/path/to/app-config.json');

// Basic authentication: FactSetApiKey
// See https://github.com/FactSet/enterprise-sdk#api-key
// for information how to create an API key
// const FactSetApiKey = apiClient.authentications['FactSetApiKey'];
// FactSetApiKey.username = 'USERNAME-SERIAL';
// FactSetApiKey.password = 'API-KEY';

const apiInstance = new SurpriseApi();
const ids = ["AAPL-USA"]; // [String] | Security or Entity identifiers. FactSet Identifiers, tickers, CUSIP and SEDOL are accepted input. <p>***ids limit** =  3000 per request*</p> * Make Note - id limit of 3000 for defaults, otherwise the service is limited to a 30 second duration. This can be reached when increasing total number of metrics requested and depth of history. * 
const metrics = ["SALES"]; // [String] | Requested metrics. Use the /metrics endpoint to return a list of available estimate items. Note, the number of metrics you are allowed to supply is limited to 1 for now. **Top 10** most used metrics are **EPS, SALES, DPS, EBITDA,EBIT, PRICE_TGT, CFPS, BPS, NET_INC, and ASSETS**.  For more details, visit [Online Assistant Page #15034](https://oa.apps.factset.com/pages/15034). 
const opts = {
  'startDate': 2019-07-30, // String | Start date for point in time of estimates expressed in YYYY-MM-DD format.
  'endDate': 2020-07-30, // String | End date for point in time of estimates expressed in YYYY-MM-DD format.
  'frequency': D, // String | Controls the frequency of the data returned.   * **D** = Daily   * **W** = Weekly, based on the last day of the week of the start date.   * **AM** = Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16 etc.).         * **AQ** = Quarterly, based on the start date.   * **AY** = Actual Annual, based on the start date.  
  'periodicity': "'ANN'", // String | The periodicity for the estimates requested, allowing you to fetch Quarterly, Semi-Annual and Annual Estimates.   * **ANN** - Annual   * **QTR** - Quarterly   * **SEMI** - Semi-Annual  
  'statistic': "'MEAN'", // String | Statistic for consensus calculation.
  'currency': USD // String | Currency code for adjusting the data. For a list of currency ISO codes, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470).
};

// Call api endpoint
apiInstance.getSurprise(ids, metrics, opts).then(
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
 **ids** | [**[String]**](String.md)| Security or Entity identifiers. FactSet Identifiers, tickers, CUSIP and SEDOL are accepted input. &lt;p&gt;***ids limit** &#x3D;  3000 per request*&lt;/p&gt; * Make Note - id limit of 3000 for defaults, otherwise the service is limited to a 30 second duration. This can be reached when increasing total number of metrics requested and depth of history. *  | 
 **metrics** | [**[String]**](String.md)| Requested metrics. Use the /metrics endpoint to return a list of available estimate items. Note, the number of metrics you are allowed to supply is limited to 1 for now. **Top 10** most used metrics are **EPS, SALES, DPS, EBITDA,EBIT, PRICE_TGT, CFPS, BPS, NET_INC, and ASSETS**.  For more details, visit [Online Assistant Page #15034](https://oa.apps.factset.com/pages/15034).  | 
 **startDate** | **String**| Start date for point in time of estimates expressed in YYYY-MM-DD format. | [optional] 
 **endDate** | **String**| End date for point in time of estimates expressed in YYYY-MM-DD format. | [optional] 
 **frequency** | **String**| Controls the frequency of the data returned.   * **D** &#x3D; Daily   * **W** &#x3D; Weekly, based on the last day of the week of the start date.   * **AM** &#x3D; Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16 etc.).         * **AQ** &#x3D; Quarterly, based on the start date.   * **AY** &#x3D; Actual Annual, based on the start date.   | [optional] [default to &#39;D&#39;]
 **periodicity** | **String**| The periodicity for the estimates requested, allowing you to fetch Quarterly, Semi-Annual and Annual Estimates.   * **ANN** - Annual   * **QTR** - Quarterly   * **SEMI** - Semi-Annual   | [optional] [default to &#39;ANN&#39;]
 **statistic** | **String**| Statistic for consensus calculation. | [optional] [default to &#39;MEAN&#39;]
 **currency** | **String**| Currency code for adjusting the data. For a list of currency ISO codes, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470). | [optional] 

### Return type

[**SurpriseResponse**](SurpriseResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getSurpriseForList

> SurpriseResponse getSurpriseForList(surpriseRequest)

Surprise estimates for rolling fiscal periods

Returns FactSet Estimates surprise data using rolling fiscal dates. 

### Example

```javascript
const { ApiClient, SurpriseApi } = require('@factset/sdk-factsetestimates');
const { ConfidentialClient } = require('@factset/sdk-utils');

const apiClient = ApiClient.instance;

// Examples for each supported authentication method are below,
// choose one that satisfies your use case.

// (Preferred) OAuth 2.0: FactSetOAuth2
// See https://github.com/FactSet/enterprise-sdk#oauth-20
// for information on how to create the app-config.json file
// See https://github.com/FactSet/enterprise-sdk-utils-typescript#authentication
// for more information on using the ConfidentialClient class
apiClient.factsetOauth2Client = new ConfidentialClient('/path/to/app-config.json');

// Basic authentication: FactSetApiKey
// See https://github.com/FactSet/enterprise-sdk#api-key
// for information how to create an API key
// const FactSetApiKey = apiClient.authentications['FactSetApiKey'];
// FactSetApiKey.username = 'USERNAME-SERIAL';
// FactSetApiKey.password = 'API-KEY';

const apiInstance = new SurpriseApi();
const surpriseRequest = new factsetestimates.SurpriseRequest(); // SurpriseRequest | Request object for `Security` prices.

// Call api endpoint
apiInstance.getSurpriseForList(surpriseRequest).then(
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
 **surpriseRequest** | [**SurpriseRequest**](SurpriseRequest.md)| Request object for &#x60;Security&#x60; prices. | 

### Return type

[**SurpriseResponse**](SurpriseResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

