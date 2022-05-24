# factsetprices.PricesApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getFixedSecurityPrices**](PricesApi.md#getFixedSecurityPrices) | **GET** /factset-prices/v1/fixed-income | Gets pricing for a list of Fixed Income securities
[**getFixedSecurityPricesForList**](PricesApi.md#getFixedSecurityPricesForList) | **POST** /factset-prices/v1/fixed-income | Requests pricing for a list of Fixed Income securities for date range requested
[**getSecurityPrices**](PricesApi.md#getSecurityPrices) | **GET** /factset-prices/v1/prices | Gets end-of-day Open, High, Low, Close for a list of securities.
[**getSecurityPricesForList**](PricesApi.md#getSecurityPricesForList) | **POST** /factset-prices/v1/prices | Requests end-of-day Open, High, Low, Close for a large list of securities.



## getFixedSecurityPrices

> PricesFixedIncomeResponse getFixedSecurityPrices(ids, opts)

Gets pricing for a list of Fixed Income securities

Get BID, MID, ASK, and Issuer Entity ID for a list of Fixed Income Securities as of a requested date range. Available for U.S. Corporate, Treasury and Agency bonds, Municipals, and non-U.S. Corporate and Government bonds. To learn more about Fixed Income Prices database, please review [OA:15995](https://my.apps.factset.com/oa/pages/15995) 

### Example

```javascript
const { ApiClient, PricesApi } = require('@factset/sdk-factsetprices');
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

const apiInstance = new PricesApi();
const ids = ["037833BX"]; // [String] | The requested list of Fixed Income security identifiers. <p>***ids limit** =  2000 per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>*
const opts = {
  'startDate': 2019-01-01, // String | The start date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this endpoint. 
  'endDate': 2019-12-31, // String | The end date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this endpoint. 
  'frequency': D // String | Controls the display frequency of the data returned.   * **D** = Daily   * **M** = Monthly, based on the last trading day of the month.   * **AM** = Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16 etc.).   * **MTD** = Month-to-date   * **CQ** = Quarterly based on the last trading day of the calendar quarter (March, June, September, or December).   * **CQTD** =  Calendar quarter-to-date   * **AY** = Actual Annual, based on the start date.   * **CY** = Calendar Annual, based on the last trading day of the calendar year.   * **CYTD** = Calendar Year-to-date. 
};

// Call api endpoint
apiInstance.getFixedSecurityPrices(ids, opts).then(
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
 **ids** | [**[String]**](String.md)| The requested list of Fixed Income security identifiers. &lt;p&gt;***ids limit** &#x3D;  2000 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;* | 
 **startDate** | **String**| The start date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this endpoint.  | [optional] 
 **endDate** | **String**| The end date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this endpoint.  | [optional] 
 **frequency** | **String**| Controls the display frequency of the data returned.   * **D** &#x3D; Daily   * **M** &#x3D; Monthly, based on the last trading day of the month.   * **AM** &#x3D; Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16 etc.).   * **MTD** &#x3D; Month-to-date   * **CQ** &#x3D; Quarterly based on the last trading day of the calendar quarter (March, June, September, or December).   * **CQTD** &#x3D;  Calendar quarter-to-date   * **AY** &#x3D; Actual Annual, based on the start date.   * **CY** &#x3D; Calendar Annual, based on the last trading day of the calendar year.   * **CYTD** &#x3D; Calendar Year-to-date.  | [optional] [default to &#39;D&#39;]

### Return type

[**PricesFixedIncomeResponse**](PricesFixedIncomeResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getFixedSecurityPricesForList

> PricesFixedIncomeResponse getFixedSecurityPricesForList(pricesFixedIncomeRequest)

Requests pricing for a list of Fixed Income securities for date range requested

Get BID, MID, ASK, and Issuer Entity ID for a list of Fixed Income Securities as of a requested date range. Available for U.S. Corporate, Treasury and Agency bonds, Municipals, and non-U.S. Corporate and Government bonds. To learn more about Fixed Income Prices database, please review [OA:15995](https://my.apps.factset.com/oa/pages/15995) 

### Example

```javascript
const { ApiClient, PricesApi } = require('@factset/sdk-factsetprices');
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

const apiInstance = new PricesApi();
const pricesFixedIncomeRequest = new factsetprices.PricesFixedIncomeRequest(); // PricesFixedIncomeRequest | Request object for Fixed Income `Security` prices.

// Call api endpoint
apiInstance.getFixedSecurityPricesForList(pricesFixedIncomeRequest).then(
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
 **pricesFixedIncomeRequest** | [**PricesFixedIncomeRequest**](PricesFixedIncomeRequest.md)| Request object for Fixed Income &#x60;Security&#x60; prices. | 

### Return type

[**PricesFixedIncomeResponse**](PricesFixedIncomeResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## getSecurityPrices

> PricesResponse getSecurityPrices(ids, opts)

Gets end-of-day Open, High, Low, Close for a list of securities.

Gets security prices, Open, High, Low, Close, Volume, and currency for a specified date range and frequency. Prices are updated and at different times across the different regions around the globe. The Prices API automatically defaults relative price dates to the local region which is determined by the local region of the requested security id. To learn more about relative dates please visit [OA Page 4627](https://my.apps.factset.com/oa/pages/4627)  *_/prices* endpoint currently supports Long Running asynchronous requests up to **10 minutes** via &#x60;batch&#x60; parameter. This feature is in **Beta**. **Additional Approvals needed for access**. Id limits increased to **5000 ids** per request using batch parameter. 

### Example

```javascript
const { ApiClient, PricesApi } = require('@factset/sdk-factsetprices');
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

const apiInstance = new PricesApi();
const ids = ["AAPL-USA"]; // [String] | The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent Ids.<p>***ids limit** =  2000 per non-batch request / 5000 per batch request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>*
const opts = {
  'startDate': 2019-01-01, // String | The start date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this endpoint. 
  'endDate': 2019-12-31, // String | The end date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this endpoint. 
  'frequency': D, // String | Controls the display frequency of the data returned.   * **D** = Daily   * **W** = Weekly, based on the last day of the week of the start date.   * **M** = Monthly, based on the last trading day of the month.   * **AM** = Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16 etc.).   * **CQ** = Quarterly based on the last trading day of the calendar quarter (March, June, September, or December).   * **FQ** = Fiscal Quarter of the company.   * **AY** = Actual Annual, based on the start date.   * **CY** = Calendar Annual, based on the last trading day of the calendar year.   * **FY** = Fiscal Annual, based on the last trading day of the company's fiscal year. 
  'calendar': FIVEDAY, // String | Calendar of data returned. SEVENDAY includes weekends. LOCAL calendar will default to the securities' trading calendar which excludes date records for respective holiday periods.
  'currency': USD, // String | Currency code for adjusting prices. Default is Local. For a list of currency ISO codes, visit [Online Assistant Page 1470](https://oa.apps.factset.com/pages/1470).
  'adjust': SPLIT, // String | Controls the split, spinoff, and dividend adjustments for the prices. <p>For more information, visit [Online Assistant Page 614](https://oa.apps.factset.com/pages/614)</p>   * **SPLIT** = Split ONLY Adjusted. This is used by default.   * **SPINOFF** = Splits & Spinoff Adjusted.   * **DIVADJ** = Splits, Spinoffs, and Dividends adjusted.   * **UNSPLIT** = No Adjustments. 
  'batch': "'N'" // String | Enables the ability to asynchronously \"batch\" the request, supporting a long-running request up to **10 minutes**. Upon requesting batch=Y, the service will respond back with an HTTP Status Code of 202.  **`batch` is currently in **BETA**. Additional Access Required. To gain access to this feature, reach out to your FactSet Account team or \"Report Issue\" above and our support teams can assist.**  Once a batch request is submitted, use `batch/v1/status` to see if the job has completed. Once completed, retrieve the results of the request via `batch/v1/result`. See [Batching API](https://developer.factset.com/api-catalog/factset-content-api-batch) for more details.  When using Batch, `ids` limit is increased to **5000** ids per request, though limits on query string via GET method still apply. It's advised to submit large lists of ids via POST method. 
};

// Call api endpoint
apiInstance.getSecurityPrices(ids, opts).then(
  data => {

      // data is a responsewrapper: GetSecurityPricesResponseWrapper
      switch (data.statusCode) {

          case 200:
             // PricesResponse
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
 **ids** | [**[String]**](String.md)| The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent Ids.&lt;p&gt;***ids limit** &#x3D;  2000 per non-batch request / 5000 per batch request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;* | 
 **startDate** | **String**| The start date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this endpoint.  | [optional] 
 **endDate** | **String**| The end date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this endpoint.  | [optional] 
 **frequency** | **String**| Controls the display frequency of the data returned.   * **D** &#x3D; Daily   * **W** &#x3D; Weekly, based on the last day of the week of the start date.   * **M** &#x3D; Monthly, based on the last trading day of the month.   * **AM** &#x3D; Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16 etc.).   * **CQ** &#x3D; Quarterly based on the last trading day of the calendar quarter (March, June, September, or December).   * **FQ** &#x3D; Fiscal Quarter of the company.   * **AY** &#x3D; Actual Annual, based on the start date.   * **CY** &#x3D; Calendar Annual, based on the last trading day of the calendar year.   * **FY** &#x3D; Fiscal Annual, based on the last trading day of the company&#39;s fiscal year.  | [optional] [default to &#39;D&#39;]
 **calendar** | **String**| Calendar of data returned. SEVENDAY includes weekends. LOCAL calendar will default to the securities&#39; trading calendar which excludes date records for respective holiday periods. | [optional] [default to &#39;FIVEDAY&#39;]
 **currency** | **String**| Currency code for adjusting prices. Default is Local. For a list of currency ISO codes, visit [Online Assistant Page 1470](https://oa.apps.factset.com/pages/1470). | [optional] 
 **adjust** | **String**| Controls the split, spinoff, and dividend adjustments for the prices. &lt;p&gt;For more information, visit [Online Assistant Page 614](https://oa.apps.factset.com/pages/614)&lt;/p&gt;   * **SPLIT** &#x3D; Split ONLY Adjusted. This is used by default.   * **SPINOFF** &#x3D; Splits &amp; Spinoff Adjusted.   * **DIVADJ** &#x3D; Splits, Spinoffs, and Dividends adjusted.   * **UNSPLIT** &#x3D; No Adjustments.  | [optional] [default to &#39;SPLIT&#39;]
 **batch** | **String**| Enables the ability to asynchronously \&quot;batch\&quot; the request, supporting a long-running request up to **10 minutes**. Upon requesting batch&#x3D;Y, the service will respond back with an HTTP Status Code of 202.  **&#x60;batch&#x60; is currently in **BETA**. Additional Access Required. To gain access to this feature, reach out to your FactSet Account team or \&quot;Report Issue\&quot; above and our support teams can assist.**  Once a batch request is submitted, use &#x60;batch/v1/status&#x60; to see if the job has completed. Once completed, retrieve the results of the request via &#x60;batch/v1/result&#x60;. See [Batching API](https://developer.factset.com/api-catalog/factset-content-api-batch) for more details.  When using Batch, &#x60;ids&#x60; limit is increased to **5000** ids per request, though limits on query string via GET method still apply. It&#39;s advised to submit large lists of ids via POST method.  | [optional] [default to &#39;N&#39;]

### Return type

[**PricesResponse**](PricesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getSecurityPricesForList

> PricesResponse getSecurityPricesForList(pricesRequest)

Requests end-of-day Open, High, Low, Close for a large list of securities.

 Gets security prices, Open, High, Low, Close, Volume, and currency for a specified date range and frequency.  *_/prices* endpoint currently supports Long Running asynchronous requests up to **10 minutes** via &#x60;batch&#x60; parameter. This feature is in **Beta**. **Additional Approvals needed for access**. Id limits increased to **5000 ids** per request using batch parameter. 

### Example

```javascript
const { ApiClient, PricesApi } = require('@factset/sdk-factsetprices');
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

const apiInstance = new PricesApi();
const pricesRequest = new factsetprices.PricesRequest(); // PricesRequest | Request object for `Security` prices.

// Call api endpoint
apiInstance.getSecurityPricesForList(pricesRequest).then(
  data => {

      // data is a responsewrapper: GetSecurityPricesForListResponseWrapper
      switch (data.statusCode) {

          case 200:
             // PricesResponse
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
 **pricesRequest** | [**PricesRequest**](PricesRequest.md)| Request object for &#x60;Security&#x60; prices. | 

### Return type

[**PricesResponse**](PricesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

