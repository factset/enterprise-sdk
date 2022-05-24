# factsetprices.HighLowApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getHighLow**](HighLowApi.md#getHighLow) | **GET** /factset-prices/v1/high-low | Gets the price high and price low of securities for a list of &#x60;ids&#x60; as of given date, period and frequency.
[**getHighLowForList**](HighLowApi.md#getHighLowForList) | **POST** /factset-prices/v1/high-low | Requests the price high and price low of securities for a list of &#x60;ids&#x60; as of given date, period and frequency.



## getHighLow

> HighLowResponse getHighLow(ids, opts)

Gets the price high and price low of securities for a list of &#x60;ids&#x60; as of given date, period and frequency.

For given security(s), gets the high and low prices with the respective dates on which they occurred. This service gives options for fetching the price as of the close or intraday. 

### Example

```javascript
const { ApiClient, HighLowApi } = require('@factset/sdk-factsetprices');
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

const apiInstance = new HighLowApi();
const ids = ["AAPL-USA"]; // [String] | The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent Ids. <p>***ids limit** =  2000 per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>*
const opts = {
  'date': 2019-07-07, // String | The as of date in **YYYY-MM-DD** format. This controls the perspective date in which the period parameter will be computed. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this endpoint. 
  'period': "'52W'", // String | The period of measure for the security's high and low pricing. This does not change display `frequency` but rather the underlying period. For example, if you wish to fetch the latest 52 week high and low price, select 52W. All periods are referencing actual periods of measure, not period-ends where-    * **D** = Daily   * **W** = Weekly, based on the last trading day of the week. Use the 52W for representing the latest year.   * **M** = Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16 etc.).   * **YTD** = Year-to-Date   * **Y** =  Actual Annual, based on the start date. 
  'priceType': "'CLOSE'", // String | Controls whether price high and low data is returned intraday or at the close. For example, by selecting INTRADAY, if a security price reached an all time high of 10 during trading hours over the period of measure but closed that day at 8, then the service will return 10. If CLOSE was selected the service would return 8 if that was the high for the period measured. 
  'calendar': FIVEDAY, // String | Calendar of data returned. SEVENDAY includes weekends. LOCAL calendar will default to the securities' trading calendar which excludes date records for respective holiday periods.
  'currency': USD, // String | Currency code for adjusting prices. Default is Local. For a list of currency ISO codes, visit [Online Assistant Page 1470](https://oa.apps.factset.com/pages/1470).
  'adjust': SPLIT // String | Controls the split, spinoff, and dividend adjustments for the prices. <p>For more information, visit [Online Assistant Page 614](https://oa.apps.factset.com/pages/614)</p>   * **SPLIT** = Split ONLY Adjusted. This is used by default.   * **SPINOFF** = Splits & Spinoff Adjusted.   * **DIVADJ** = Splits, Spinoffs, and Dividends adjusted.   * **UNSPLIT** = No Adjustments. 
};

// Call api endpoint
apiInstance.getHighLow(ids, opts).then(
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
 **ids** | [**[String]**](String.md)| The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent Ids. &lt;p&gt;***ids limit** &#x3D;  2000 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;* | 
 **date** | **String**| The as of date in **YYYY-MM-DD** format. This controls the perspective date in which the period parameter will be computed. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this endpoint.  | [optional] 
 **period** | **String**| The period of measure for the security&#39;s high and low pricing. This does not change display &#x60;frequency&#x60; but rather the underlying period. For example, if you wish to fetch the latest 52 week high and low price, select 52W. All periods are referencing actual periods of measure, not period-ends where-    * **D** &#x3D; Daily   * **W** &#x3D; Weekly, based on the last trading day of the week. Use the 52W for representing the latest year.   * **M** &#x3D; Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16 etc.).   * **YTD** &#x3D; Year-to-Date   * **Y** &#x3D;  Actual Annual, based on the start date.  | [optional] [default to &#39;52W&#39;]
 **priceType** | **String**| Controls whether price high and low data is returned intraday or at the close. For example, by selecting INTRADAY, if a security price reached an all time high of 10 during trading hours over the period of measure but closed that day at 8, then the service will return 10. If CLOSE was selected the service would return 8 if that was the high for the period measured.  | [optional] [default to &#39;CLOSE&#39;]
 **calendar** | **String**| Calendar of data returned. SEVENDAY includes weekends. LOCAL calendar will default to the securities&#39; trading calendar which excludes date records for respective holiday periods. | [optional] [default to &#39;FIVEDAY&#39;]
 **currency** | **String**| Currency code for adjusting prices. Default is Local. For a list of currency ISO codes, visit [Online Assistant Page 1470](https://oa.apps.factset.com/pages/1470). | [optional] 
 **adjust** | **String**| Controls the split, spinoff, and dividend adjustments for the prices. &lt;p&gt;For more information, visit [Online Assistant Page 614](https://oa.apps.factset.com/pages/614)&lt;/p&gt;   * **SPLIT** &#x3D; Split ONLY Adjusted. This is used by default.   * **SPINOFF** &#x3D; Splits &amp; Spinoff Adjusted.   * **DIVADJ** &#x3D; Splits, Spinoffs, and Dividends adjusted.   * **UNSPLIT** &#x3D; No Adjustments.  | [optional] [default to &#39;SPLIT&#39;]

### Return type

[**HighLowResponse**](HighLowResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getHighLowForList

> HighLowResponse getHighLowForList(highLowRequest)

Requests the price high and price low of securities for a list of &#x60;ids&#x60; as of given date, period and frequency.

For given security(s), gets the high and low prices with the respective dates on which they occurred. This service gives options for fetching the price as of the close or intraday. 

### Example

```javascript
const { ApiClient, HighLowApi } = require('@factset/sdk-factsetprices');
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

const apiInstance = new HighLowApi();
const highLowRequest = new factsetprices.HighLowRequest(); // HighLowRequest | Request object for high low prices.

// Call api endpoint
apiInstance.getHighLowForList(highLowRequest).then(
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
 **highLowRequest** | [**HighLowRequest**](HighLowRequest.md)| Request object for high low prices. | 

### Return type

[**HighLowResponse**](HighLowResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

