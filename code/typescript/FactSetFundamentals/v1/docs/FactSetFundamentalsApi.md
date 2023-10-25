# factsetfundamentals.FactSetFundamentalsApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getFdsFundamentals**](FactSetFundamentalsApi.md#getFdsFundamentals) | **GET** /factset-fundamentals/v1/fundamentals | Returns the Company Fundamental Data.
[**getFdsFundamentalsForList**](FactSetFundamentalsApi.md#getFdsFundamentalsForList) | **POST** /factset-fundamentals/v1/fundamentals | Returns the Company Fundamental Data.



## getFdsFundamentals

> FundamentalsResponse getFdsFundamentals(ids, metrics, opts)

Returns the Company Fundamental Data.

Retrieves FactSet Fundamental standardized data for an individual security. Use the /metrics endpoint to retrieve a full list of valid metrics or data items. 

### Example

```javascript
const { ApiClient, FactSetFundamentalsApi } = require('@factset/sdk-factsetfundamentals');
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

const apiInstance = new FactSetFundamentalsApi();
const ids = ["FDS-US"]; // [String] | Security or Entity identifiers. FactSet Identifiers, tickers, CUSIP and SEDOL are accepted as input. <p>***ids limit** =  1000 per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>* 
const metrics = ["FF_SALES"]; // [String] | Requested List of Financial Statement Items or Ratios. Use /metrics endpoint for a complete list of available FF_* metric items. <p>*When requesting multiple metrics, you cannot mix metric data types (e.g. strings and floats). Please use /metrics endpoints for context on metric dataType to avoid null data.*</p> <p>***metrics limit** =  1600 per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of metrics, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>* 
const opts = {
  'periodicity': ANN, // String | Periodicity or frequency of the fiscal periods, where   * **ANN**  = Annual - Original,   * **ANN_R** = Annual - Latest - *Includes Restatements*,   * **QTR**  = Quarterly - Original,   * **QTR_R** = Quarterly - Latest - *Includes Restatements*,   * **SEMI** = Semi-Annual,   * **LTM**  = Last Twelve Months,   * **LTMSG** = Last Twelve Months Global [OA17959](https://my.apps.factset.com/oa/pages/17959),   * **YTD** = Year-to-date. 
  'fiscalPeriodStart': 2017-09-01, // String | Fiscal period start expressed as YYYY-MM-DD.  Calendar date that will fall back to most recent completed period during resolution. 
  'fiscalPeriodEnd': 2018-03-01, // String | Fiscal period end expressed YYYY-MM-DD.  Calendar date that will fall back to most recent completed period during resolution. 
  'currency': USD, // String | Currency code for currency values. For a list of currency ISO codes, visit Online Assistant Page [OA1470](https://my.apps.factset.com/oa/pages/1470).  Giving input as \"DOC\" would give the values in reporting currency for the requested ids. 
  'restated': RP // String | Update Status Flag:   * **RP** = Include preliminary data,   * **RF** = Only final data 
};

// Call api endpoint
apiInstance.getFdsFundamentals(ids, metrics, opts).then(
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
 **ids** | [**[String]**](String.md)| Security or Entity identifiers. FactSet Identifiers, tickers, CUSIP and SEDOL are accepted as input. &lt;p&gt;***ids limit** &#x3D;  1000 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;*  | 
 **metrics** | [**[String]**](String.md)| Requested List of Financial Statement Items or Ratios. Use /metrics endpoint for a complete list of available FF_* metric items. &lt;p&gt;*When requesting multiple metrics, you cannot mix metric data types (e.g. strings and floats). Please use /metrics endpoints for context on metric dataType to avoid null data.*&lt;/p&gt; &lt;p&gt;***metrics limit** &#x3D;  1600 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of metrics, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;*  | 
 **periodicity** | **String**| Periodicity or frequency of the fiscal periods, where   * **ANN**  &#x3D; Annual - Original,   * **ANN_R** &#x3D; Annual - Latest - *Includes Restatements*,   * **QTR**  &#x3D; Quarterly - Original,   * **QTR_R** &#x3D; Quarterly - Latest - *Includes Restatements*,   * **SEMI** &#x3D; Semi-Annual,   * **LTM**  &#x3D; Last Twelve Months,   * **LTMSG** &#x3D; Last Twelve Months Global [OA17959](https://my.apps.factset.com/oa/pages/17959),   * **YTD** &#x3D; Year-to-date.  | [optional] [default to &#39;QTR&#39;]
 **fiscalPeriodStart** | **String**| Fiscal period start expressed as YYYY-MM-DD.  Calendar date that will fall back to most recent completed period during resolution.  | [optional] 
 **fiscalPeriodEnd** | **String**| Fiscal period end expressed YYYY-MM-DD.  Calendar date that will fall back to most recent completed period during resolution.  | [optional] 
 **currency** | **String**| Currency code for currency values. For a list of currency ISO codes, visit Online Assistant Page [OA1470](https://my.apps.factset.com/oa/pages/1470).  Giving input as \&quot;DOC\&quot; would give the values in reporting currency for the requested ids.  | [optional] [default to &#39;LOCAL&#39;]
 **restated** | **String**| Update Status Flag:   * **RP** &#x3D; Include preliminary data,   * **RF** &#x3D; Only final data  | [optional] [default to &#39;RP&#39;]

### Return type

[**FundamentalsResponse**](FundamentalsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getFdsFundamentalsForList

> FundamentalsResponse getFdsFundamentalsForList(fundamentalsRequest)

Returns the Company Fundamental Data.

Retrieves FactSet Fundamental standardized data for an individual security. Use the /metrics endpoint to retrieve a full list of valid metrics or data items.   

### Example

```javascript
const { ApiClient, FactSetFundamentalsApi } = require('@factset/sdk-factsetfundamentals');
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

const apiInstance = new FactSetFundamentalsApi();
const fundamentalsRequest = new factsetfundamentals.FundamentalsRequest(); // FundamentalsRequest | Request object for requesting fundamentals data

// Call api endpoint
apiInstance.getFdsFundamentalsForList(fundamentalsRequest).then(
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
 **fundamentalsRequest** | [**FundamentalsRequest**](FundamentalsRequest.md)| Request object for requesting fundamentals data | 

### Return type

[**FundamentalsResponse**](FundamentalsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

