# factsetglobalprices.PricesApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getGPDPrices**](PricesApi.md#getGPDPrices) | **GET** /factset-global-prices/v1/prices | Gets end-of-day Open, High, Low, Close for a list of securities.
[**getSecurityPricesForList**](PricesApi.md#getSecurityPricesForList) | **POST** /factset-global-prices/v1/prices | Requests end-of-day Open, High, Low, Close for a large list of securities.



## getGPDPrices

> GlobalPricesResponse getGPDPrices(ids, startDate, opts)

Gets end-of-day Open, High, Low, Close for a list of securities.

Gets security prices&#39;, Open, High, Low, Close, Volume, VWAP, Trade Count, and Turn Over for a specified list of securities, date range, currency, and adjustment factors. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, PricesApi } = require('@factset/sdk-factsetglobalprices');
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

const apiInstance = new PricesApi();
const ids = ["AAPL-USA"]; // [String] | The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent Ids. **ids limit** = 500 per non-batch request / 2000 per batch request for a single day and 50 per multi-day request for both batch and non-batch. The number of unique currencies present in the requested ids is limited to 50 per request. Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, it's advised for any requests with large request lines to be requested through the respective \"POST\" method.
const startDate = 2021-08-27; // String | The start date requested for a given date range in **YYYY-MM-DD** format. The input start date must be before the input end date. Future dates (T+1) are not accepted in this endpoint. 
const opts = {
  'fields': ["price","priceOpen","priceHigh","priceLow","volume"], // [String] | Request available pricing data fields to be included in the response. Default is all fields. All responses will include the _fsymId_, _date_, and _currency_ fields.   |field|description|   |---|---|   |price|Closing Price|   |priceOpen|Opening Price|   |priceHigh|High Price|   |priceLow|Low Price|   |volume|Volume|   |turnover|Total Trade Value for the Day|   |tradeCount|Number of Trades|   |vwap|Volume Weighted Average Price| 
  'endDate': 2021-08-27, // String | The end date requested for a given date range in **YYYY-MM-DD** format. The input end date must be after the input start date. Future dates (T+1) are not accepted in this endpoint. 
  'frequency': "'D'", // String | Controls the display frequency of the data returned.   * **D** = Daily   * **AD** = Actual Daily   * **W** = Weekly, based on the last day of the week of the start date.   * **M** = Monthly, based on the last trading day of the month.   * **AM** = Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16 etc.).   * **AQ** =  Actual Quarterly   * **CQ** = Quarterly based on the last trading day of the calendar quarter (March, June, September, or December).   * **ASA** = Actual Semi-annual   * **CSA** = Calendar Semi-annual   * **AY** = Actual Annual, based on the start date.   * **CY** = Calendar Annual, based on the last trading day of the calendar year.    
  'calendar': FIVEDAY, // String | Calendar of data returned. SEVENDAY includes weekends.
  'currency': USD, // String | Currency code for adjusting prices. Default is Local. For a list of currency ISO codes, visit [Online Assistant Page 1470](https://oa.apps.factset.com/pages/1470).
  'adjust': "'SPLIT'", // String | Controls the split and spinoff adjustments for the prices.   * **SPLIT** = Split ONLY Adjusted. This is used by default.   * **SPLIT_SPINOFF** = Splits & Spinoff Adjusted.   * **DIV_SPIN_SPLITS** = Dividend adjustments, Spinoff, and Splits combined.   * **UNSPLIT** = No Adjustments.    
  'batch': "'N'" // String | Enables the ability to asynchronously \"batch\" the request, supporting a long-running request for up to 20 minutes. Upon requesting batch=Y, the service will respond with an HTTP Status Code of 202. Once a batch request is submitted, use batch status to see if the job has been completed. Once completed, retrieve the results of the request via batch-result.  For single-day requests, the ids limit is 500 for non-batch and 2000 for batch. For multi-day requests, the limit is 50 ids for both batch and non-batch.  Limits on query string via GET method still apply. It's advised to submit large lists of ids via POST method. <B>Please note that the number of unique currencies present in the requested ids is limited to 50 per request.</B> 
};

// Call api endpoint
apiInstance.getGPDPrices(ids, startDate, opts).then(
  data => {

      // data is a responsewrapper: GetGPDPricesResponseWrapper
      switch (data.statusCode) {

          case 200:
             // GlobalPricesResponse
             console.log(data.getResponse200());
             break;

          case 202:
             // BatchStatusResponse
             console.log(data.getResponse202());
             break;

      }

  },
  error => {
    console.error(error);
  },
);

```


### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | [**[String]**](String.md)| The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent Ids. **ids limit** &#x3D; 500 per non-batch request / 2000 per batch request for a single day and 50 per multi-day request for both batch and non-batch. The number of unique currencies present in the requested ids is limited to 50 per request. Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, it&#39;s advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method. | 
 **startDate** | **String**| The start date requested for a given date range in **YYYY-MM-DD** format. The input start date must be before the input end date. Future dates (T+1) are not accepted in this endpoint.  | 
 **fields** | [**[String]**](String.md)| Request available pricing data fields to be included in the response. Default is all fields. All responses will include the _fsymId_, _date_, and _currency_ fields.   |field|description|   |---|---|   |price|Closing Price|   |priceOpen|Opening Price|   |priceHigh|High Price|   |priceLow|Low Price|   |volume|Volume|   |turnover|Total Trade Value for the Day|   |tradeCount|Number of Trades|   |vwap|Volume Weighted Average Price|  | [optional] 
 **endDate** | **String**| The end date requested for a given date range in **YYYY-MM-DD** format. The input end date must be after the input start date. Future dates (T+1) are not accepted in this endpoint.  | [optional] 
 **frequency** | **String**| Controls the display frequency of the data returned.   * **D** &#x3D; Daily   * **AD** &#x3D; Actual Daily   * **W** &#x3D; Weekly, based on the last day of the week of the start date.   * **M** &#x3D; Monthly, based on the last trading day of the month.   * **AM** &#x3D; Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16 etc.).   * **AQ** &#x3D;  Actual Quarterly   * **CQ** &#x3D; Quarterly based on the last trading day of the calendar quarter (March, June, September, or December).   * **ASA** &#x3D; Actual Semi-annual   * **CSA** &#x3D; Calendar Semi-annual   * **AY** &#x3D; Actual Annual, based on the start date.   * **CY** &#x3D; Calendar Annual, based on the last trading day of the calendar year.     | [optional] [default to &#39;D&#39;]
 **calendar** | **String**| Calendar of data returned. SEVENDAY includes weekends. | [optional] [default to &#39;FIVEDAY&#39;]
 **currency** | **String**| Currency code for adjusting prices. Default is Local. For a list of currency ISO codes, visit [Online Assistant Page 1470](https://oa.apps.factset.com/pages/1470). | [optional] [default to &#39;LOCAL&#39;]
 **adjust** | **String**| Controls the split and spinoff adjustments for the prices.   * **SPLIT** &#x3D; Split ONLY Adjusted. This is used by default.   * **SPLIT_SPINOFF** &#x3D; Splits &amp; Spinoff Adjusted.   * **DIV_SPIN_SPLITS** &#x3D; Dividend adjustments, Spinoff, and Splits combined.   * **UNSPLIT** &#x3D; No Adjustments.     | [optional] [default to &#39;SPLIT&#39;]
 **batch** | **String**| Enables the ability to asynchronously \&quot;batch\&quot; the request, supporting a long-running request for up to 20 minutes. Upon requesting batch&#x3D;Y, the service will respond with an HTTP Status Code of 202. Once a batch request is submitted, use batch status to see if the job has been completed. Once completed, retrieve the results of the request via batch-result.  For single-day requests, the ids limit is 500 for non-batch and 2000 for batch. For multi-day requests, the limit is 50 ids for both batch and non-batch.  Limits on query string via GET method still apply. It&#39;s advised to submit large lists of ids via POST method. &lt;B&gt;Please note that the number of unique currencies present in the requested ids is limited to 50 per request.&lt;/B&gt;  | [optional] [default to &#39;N&#39;]

### Return type

[**GlobalPricesResponse**](GlobalPricesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getSecurityPricesForList

> GlobalPricesResponse getSecurityPricesForList(globalPricesRequest)

Requests end-of-day Open, High, Low, Close for a large list of securities.

Gets security prices&#39;, Open, High, Low, Close, Volume, VWAP, Trade Count, and Turn Over for a specified list of securities, date range, currency, and adjustment factors.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, PricesApi } = require('@factset/sdk-factsetglobalprices');
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

const apiInstance = new PricesApi();
const globalPricesRequest = new factsetglobalprices.GlobalPricesRequest(); // GlobalPricesRequest | Request object for `Prices`.

// Call api endpoint
apiInstance.getSecurityPricesForList(globalPricesRequest).then(
  data => {

      // data is a responsewrapper: GetSecurityPricesForListResponseWrapper
      switch (data.statusCode) {

          case 200:
             // GlobalPricesResponse
             console.log(data.getResponse200());
             break;

          case 202:
             // BatchStatusResponse
             console.log(data.getResponse202());
             break;

      }

  },
  error => {
    console.error(error);
  },
);

```


### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **globalPricesRequest** | [**GlobalPricesRequest**](GlobalPricesRequest.md)| Request object for &#x60;Prices&#x60;. | 

### Return type

[**GlobalPricesResponse**](GlobalPricesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

