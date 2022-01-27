# factsetfunds.PricesReturnsApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getFundsPrices**](PricesReturnsApi.md#getFundsPrices) | **GET** /factset-funds/v1/prices | Get Fund Prices (NAV) for a requested time-series
[**getFundsPricesForList**](PricesReturnsApi.md#getFundsPricesForList) | **POST** /factset-funds/v1/prices | Get Fund Prices (NAV) for a requested date range and large list of ids.
[**getFundsReturns**](PricesReturnsApi.md#getFundsReturns) | **GET** /factset-funds/v1/returns | Get Fund Returns for a requested time-series
[**getFundsReturnsForList**](PricesReturnsApi.md#getFundsReturnsForList) | **POST** /factset-funds/v1/returns | Get Fund Returns for a requested time-series and large list of ids
[**getFundsReturnsRange**](PricesReturnsApi.md#getFundsReturnsRange) | **GET** /factset-funds/v1/returns-range | Get Fund Returns for a user-defined date range
[**getFundsReturnsRangeForList**](PricesReturnsApi.md#getFundsReturnsRangeForList) | **POST** /factset-funds/v1/returns-range | Get Fund Returns over pre-defined time horizons as of a specific date for large list of ids.
[**getFundsReturnsSnapshot**](PricesReturnsApi.md#getFundsReturnsSnapshot) | **GET** /factset-funds/v1/returns-snapshot | Get Fund Returns over pre-defined time horizons as of a specific date.
[**getFundsReturnsSnapshotForList**](PricesReturnsApi.md#getFundsReturnsSnapshotForList) | **POST** /factset-funds/v1/returns-snapshot | Get Fund Returns over pre-defined time horizons as of a specific date.



## getFundsPrices

> FundsPricesResponse getFundsPrices(ids, opts)

Get Fund Prices (NAV) for a requested time-series

Get Fund Prices (NAV) for a requested date range and list of ids. 

### Example

```javascript
const { ApiClient, PricesReturnsApi } = require('@factset/sdk-factsetfunds');
const { ConfidentialClient } = require('@factset/sdk-utils');

const apiClient = ApiClient.instance;

// Configure HTTP basic authorization: FactSetApiKey
const FactSetApiKey = apiClient.authentications['FactSetApiKey'];
FactSetApiKey.username = 'YOUR USERNAME';
FactSetApiKey.password = 'YOUR PASSWORD';

// Configure OAuth2 access token for authorization: FactSetOAuth2
const FactSetOAuth2 = apiClient.authentications['FactSetOAuth2'];
FactSetOAuth2.accessToken = 'YOUR ACCESS TOKEN';

// Configure OAuth2 access with ConfidentialClient
apiClient.factsetOauth2Client = new ConfidentialClient('./config.json');

const apiInstance = new PricesReturnsApi();
const ids = ["MABAX-US"]; // [String] | The requested fund identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. <p>***ids limit** =  1000 per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>* 
const opts = {
  'startDate': 2018-12-31, // String | The start date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to latest available completed period. 
  'endDate': 2019-12-31, // String | The end date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to latest available completed period. 
  'frequency': "'M'", // String | Controls the display frequency of the data returned.   * **D** = Daily   * **W** = Weekly, based on the last day of the week of the start date.   * **M** = Monthly, based on the last trading day of the month.   * **AM** = Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16 etc.).   * **CQ** = Quarterly based on the last trading day of the calendar quarter (March, June, September, or December).   * **FQ** = Fiscal Quarter of the company.   * **AY** = Actual Annual, based on the start date.   * **CY** = Calendar Annual, based on the last trading day of the calendar year.   * **FY** = Fiscal Annual, based on the last trading day of the company's fiscal year. 
  'currency': USD, // String | Controls the Currency conversion of the Fund. By default, the currency will use the funds local currency.
  'dataType': "'ROLL'", // String | The Data Type of the NAV expressed as Raw or Rolled values.
  'splitAdjust': "'SPLIT'" // String | The price adjustment split or unsplit.
};

// Call api endpoint
apiInstance.getFundsPrices(ids, opts).then(
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
 **ids** | [**[String]**](String.md)| The requested fund identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. &lt;p&gt;***ids limit** &#x3D;  1000 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;*  | 
 **startDate** | **String**| The start date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to latest available completed period.  | [optional] 
 **endDate** | **String**| The end date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to latest available completed period.  | [optional] 
 **frequency** | **String**| Controls the display frequency of the data returned.   * **D** &#x3D; Daily   * **W** &#x3D; Weekly, based on the last day of the week of the start date.   * **M** &#x3D; Monthly, based on the last trading day of the month.   * **AM** &#x3D; Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16 etc.).   * **CQ** &#x3D; Quarterly based on the last trading day of the calendar quarter (March, June, September, or December).   * **FQ** &#x3D; Fiscal Quarter of the company.   * **AY** &#x3D; Actual Annual, based on the start date.   * **CY** &#x3D; Calendar Annual, based on the last trading day of the calendar year.   * **FY** &#x3D; Fiscal Annual, based on the last trading day of the company&#39;s fiscal year.  | [optional] [default to &#39;M&#39;]
 **currency** | **String**| Controls the Currency conversion of the Fund. By default, the currency will use the funds local currency. | [optional] [default to &#39;LOCAL&#39;]
 **dataType** | **String**| The Data Type of the NAV expressed as Raw or Rolled values. | [optional] [default to &#39;ROLL&#39;]
 **splitAdjust** | **String**| The price adjustment split or unsplit. | [optional] [default to &#39;SPLIT&#39;]

### Return type

[**FundsPricesResponse**](FundsPricesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getFundsPricesForList

> FundsPricesResponse getFundsPricesForList(fundsPricesRequest)

Get Fund Prices (NAV) for a requested date range and large list of ids.

Fetch fund prices (NAV) as of a requested date range and a large list of ids.  

### Example

```javascript
const { ApiClient, PricesReturnsApi } = require('@factset/sdk-factsetfunds');
const { ConfidentialClient } = require('@factset/sdk-utils');

const apiClient = ApiClient.instance;

// Configure HTTP basic authorization: FactSetApiKey
const FactSetApiKey = apiClient.authentications['FactSetApiKey'];
FactSetApiKey.username = 'YOUR USERNAME';
FactSetApiKey.password = 'YOUR PASSWORD';

// Configure OAuth2 access token for authorization: FactSetOAuth2
const FactSetOAuth2 = apiClient.authentications['FactSetOAuth2'];
FactSetOAuth2.accessToken = 'YOUR ACCESS TOKEN';

// Configure OAuth2 access with ConfidentialClient
apiClient.factsetOauth2Client = new ConfidentialClient('./config.json');

const apiInstance = new PricesReturnsApi();
const fundsPricesRequest = new factsetfunds.FundsPricesRequest(); // FundsPricesRequest | The Prices request body, allowing the user to specify a list of ids.

// Call api endpoint
apiInstance.getFundsPricesForList(fundsPricesRequest).then(
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
 **fundsPricesRequest** | [**FundsPricesRequest**](FundsPricesRequest.md)| The Prices request body, allowing the user to specify a list of ids. | 

### Return type

[**FundsPricesResponse**](FundsPricesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## getFundsReturns

> FundsReturnsResponse getFundsReturns(ids, opts)

Get Fund Returns for a requested time-series

Get Fund NAV Returns over a time-series for the requested date range and frequency. &lt;p&gt;The simple Total Return NAV shows the fund&#39;s total return level by reinvesting distributions so that ex-date NAVs are increased by the distribution amount and compounded thereafter. Total return NAV compounds daily and is calculated from the first available NAV date of each fund. The total return NAV series reflects the value that an investor would own if it had purchased one share at the inception date and reinvested all dividends on a Gross basis.&lt;/p&gt;&lt;p&gt; Control the dividends to include or exclude using the dividendAdjust parameter. The first available NAV date of each fund can be found in the /summary endpoint as &#x60;priceFristDate&#x60;. Visit [OA #21437](https://my.apps.factset.com/oa/pages/21437) for more details.&lt;/p&gt; 

### Example

```javascript
const { ApiClient, PricesReturnsApi } = require('@factset/sdk-factsetfunds');
const { ConfidentialClient } = require('@factset/sdk-utils');

const apiClient = ApiClient.instance;

// Configure HTTP basic authorization: FactSetApiKey
const FactSetApiKey = apiClient.authentications['FactSetApiKey'];
FactSetApiKey.username = 'YOUR USERNAME';
FactSetApiKey.password = 'YOUR PASSWORD';

// Configure OAuth2 access token for authorization: FactSetOAuth2
const FactSetOAuth2 = apiClient.authentications['FactSetOAuth2'];
FactSetOAuth2.accessToken = 'YOUR ACCESS TOKEN';

// Configure OAuth2 access with ConfidentialClient
apiClient.factsetOauth2Client = new ConfidentialClient('./config.json');

const apiInstance = new PricesReturnsApi();
const ids = ["MABAX-US"]; // [String] | The requested fund identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. <p>***ids limit** =  1000 per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>* 
const opts = {
  'startDate': 2018-12-31, // String | The start date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to latest available completed period. 
  'endDate': 2019-12-31, // String | The end date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to latest available completed period. 
  'frequency': "'M'", // String | Controls the display frequency of the data returned.   * **D** = Daily   * **W** = Weekly, based on the last day of the week of the start date.   * **M** = Monthly, based on the last trading day of the month.   * **AM** = Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16 etc.).   * **CQ** = Quarterly based on the last trading day of the calendar quarter (March, June, September, or December).   * **FQ** = Fiscal Quarter of the company.   * **AY** = Actual Annual, based on the start date.   * **CY** = Calendar Annual, based on the last trading day of the calendar year.   * **FY** = Fiscal Annual, based on the last trading day of the company's fiscal year. 
  'currency': USD, // String | Controls the Currency conversion of the Fund. By default, the currency will use the funds local currency.
  'dividendAdjust': "'DIV'" // String | Controls the dividend inclusion for the NAV returns calculations, where -  * DIV = Include Dividends, Total Return * NO_DIV = Exclude Dividends, Simple Return 
};

// Call api endpoint
apiInstance.getFundsReturns(ids, opts).then(
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
 **ids** | [**[String]**](String.md)| The requested fund identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. &lt;p&gt;***ids limit** &#x3D;  1000 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;*  | 
 **startDate** | **String**| The start date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to latest available completed period.  | [optional] 
 **endDate** | **String**| The end date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to latest available completed period.  | [optional] 
 **frequency** | **String**| Controls the display frequency of the data returned.   * **D** &#x3D; Daily   * **W** &#x3D; Weekly, based on the last day of the week of the start date.   * **M** &#x3D; Monthly, based on the last trading day of the month.   * **AM** &#x3D; Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16 etc.).   * **CQ** &#x3D; Quarterly based on the last trading day of the calendar quarter (March, June, September, or December).   * **FQ** &#x3D; Fiscal Quarter of the company.   * **AY** &#x3D; Actual Annual, based on the start date.   * **CY** &#x3D; Calendar Annual, based on the last trading day of the calendar year.   * **FY** &#x3D; Fiscal Annual, based on the last trading day of the company&#39;s fiscal year.  | [optional] [default to &#39;M&#39;]
 **currency** | **String**| Controls the Currency conversion of the Fund. By default, the currency will use the funds local currency. | [optional] [default to &#39;LOCAL&#39;]
 **dividendAdjust** | **String**| Controls the dividend inclusion for the NAV returns calculations, where -  * DIV &#x3D; Include Dividends, Total Return * NO_DIV &#x3D; Exclude Dividends, Simple Return  | [optional] [default to &#39;DIV&#39;]

### Return type

[**FundsReturnsResponse**](FundsReturnsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getFundsReturnsForList

> FundsReturnsResponse getFundsReturnsForList(fundsReturnsRequest)

Get Fund Returns for a requested time-series and large list of ids

Get Fund NAV Returns over a time-series for the requested date range and frequency. &lt;p&gt;The simple Total Return NAV shows the fund&#39;s total return level by reinvesting distributions so that ex-date NAVs are increased by the distribution amount and compounded thereafter. Total return NAV compounds daily and is calculated from the first available NAV date of each fund. The total return NAV series reflects the value that an investor would own if it had purchased one share at the inception date and reinvested all dividends on a Gross basis.&lt;/p&gt;&lt;p&gt; Control the dividends to include or exclude using the dividendAdjust parameter. The first available NAV date of each fund can be found in the /summary endpoint as &#x60;priceFristDate&#x60;. Visit [OA #21437](https://my.apps.factset.com/oa/pages/21437) for more details.&lt;/p&gt; 

### Example

```javascript
const { ApiClient, PricesReturnsApi } = require('@factset/sdk-factsetfunds');
const { ConfidentialClient } = require('@factset/sdk-utils');

const apiClient = ApiClient.instance;

// Configure HTTP basic authorization: FactSetApiKey
const FactSetApiKey = apiClient.authentications['FactSetApiKey'];
FactSetApiKey.username = 'YOUR USERNAME';
FactSetApiKey.password = 'YOUR PASSWORD';

// Configure OAuth2 access token for authorization: FactSetOAuth2
const FactSetOAuth2 = apiClient.authentications['FactSetOAuth2'];
FactSetOAuth2.accessToken = 'YOUR ACCESS TOKEN';

// Configure OAuth2 access with ConfidentialClient
apiClient.factsetOauth2Client = new ConfidentialClient('./config.json');

const apiInstance = new PricesReturnsApi();
const fundsReturnsRequest = new factsetfunds.FundsReturnsRequest(); // FundsReturnsRequest | The Returns request body, allowing the user to specify a list of ids.

// Call api endpoint
apiInstance.getFundsReturnsForList(fundsReturnsRequest).then(
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
 **fundsReturnsRequest** | [**FundsReturnsRequest**](FundsReturnsRequest.md)| The Returns request body, allowing the user to specify a list of ids. | 

### Return type

[**FundsReturnsResponse**](FundsReturnsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## getFundsReturnsRange

> ReturnsRangeResponse getFundsReturnsRange(ids, opts)

Get Fund Returns for a user-defined date range

Get Fund Returns between a specified startDate and endDate. The service will compute the return between those two periods to retrieve the single value and does not create a time-series. Control the return type to include or exclude dividends by using the dividendAdjust parameter. 

### Example

```javascript
const { ApiClient, PricesReturnsApi } = require('@factset/sdk-factsetfunds');
const { ConfidentialClient } = require('@factset/sdk-utils');

const apiClient = ApiClient.instance;

// Configure HTTP basic authorization: FactSetApiKey
const FactSetApiKey = apiClient.authentications['FactSetApiKey'];
FactSetApiKey.username = 'YOUR USERNAME';
FactSetApiKey.password = 'YOUR PASSWORD';

// Configure OAuth2 access token for authorization: FactSetOAuth2
const FactSetOAuth2 = apiClient.authentications['FactSetOAuth2'];
FactSetOAuth2.accessToken = 'YOUR ACCESS TOKEN';

// Configure OAuth2 access with ConfidentialClient
apiClient.factsetOauth2Client = new ConfidentialClient('./config.json');

const apiInstance = new PricesReturnsApi();
const ids = ["MABAX-US"]; // [String] | The requested fund identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. <p>***ids limit** =  1000 per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>* 
const opts = {
  'startDate': 2018-12-31, // String | The start date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to the day prior to today's previous close. The startDate cannot be equal to the endDate as no return can be computed. Additionally, the startDate MUST be equal to or greater than the `priceFirstDate` found within the /summary endpoint. 
  'endDate': 2019-12-31, // String | The end date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to latest available completed period. 
  'dividendAdjust': "'DIV'" // String | Controls the dividend inclusion for the NAV returns calculations, where -  * DIV = Include Dividends, Total Return * NO_DIV = Exclude Dividends, Simple Return 
};

// Call api endpoint
apiInstance.getFundsReturnsRange(ids, opts).then(
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
 **ids** | [**[String]**](String.md)| The requested fund identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. &lt;p&gt;***ids limit** &#x3D;  1000 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;*  | 
 **startDate** | **String**| The start date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to the day prior to today&#39;s previous close. The startDate cannot be equal to the endDate as no return can be computed. Additionally, the startDate MUST be equal to or greater than the &#x60;priceFirstDate&#x60; found within the /summary endpoint.  | [optional] 
 **endDate** | **String**| The end date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to latest available completed period.  | [optional] 
 **dividendAdjust** | **String**| Controls the dividend inclusion for the NAV returns calculations, where -  * DIV &#x3D; Include Dividends, Total Return * NO_DIV &#x3D; Exclude Dividends, Simple Return  | [optional] [default to &#39;DIV&#39;]

### Return type

[**ReturnsRangeResponse**](ReturnsRangeResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getFundsReturnsRangeForList

> ReturnsRangeResponse getFundsReturnsRangeForList(returnsRangeRequest)

Get Fund Returns over pre-defined time horizons as of a specific date for large list of ids.

Get Fund Returns between a specified startDate and endDate. The service will compute the return between those two periods to retrieve the single value and does not create a time-series. Control the return type to include or exclude dividends by using the dividendAdjust parameter. 

### Example

```javascript
const { ApiClient, PricesReturnsApi } = require('@factset/sdk-factsetfunds');
const { ConfidentialClient } = require('@factset/sdk-utils');

const apiClient = ApiClient.instance;

// Configure HTTP basic authorization: FactSetApiKey
const FactSetApiKey = apiClient.authentications['FactSetApiKey'];
FactSetApiKey.username = 'YOUR USERNAME';
FactSetApiKey.password = 'YOUR PASSWORD';

// Configure OAuth2 access token for authorization: FactSetOAuth2
const FactSetOAuth2 = apiClient.authentications['FactSetOAuth2'];
FactSetOAuth2.accessToken = 'YOUR ACCESS TOKEN';

// Configure OAuth2 access with ConfidentialClient
apiClient.factsetOauth2Client = new ConfidentialClient('./config.json');

const apiInstance = new PricesReturnsApi();
const returnsRangeRequest = new factsetfunds.ReturnsRangeRequest(); // ReturnsRangeRequest | The Returns Range request body, allowing the user to specify a list of ids.

// Call api endpoint
apiInstance.getFundsReturnsRangeForList(returnsRangeRequest).then(
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
 **returnsRangeRequest** | [**ReturnsRangeRequest**](ReturnsRangeRequest.md)| The Returns Range request body, allowing the user to specify a list of ids. | 

### Return type

[**ReturnsRangeResponse**](ReturnsRangeResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## getFundsReturnsSnapshot

> FundsReturnsSnapshotResponse getFundsReturnsSnapshot(ids, opts)

Get Fund Returns over pre-defined time horizons as of a specific date.

Get Fund Returns over pre-defined time horizons as of a specific date. Use the date parameter to set the perspective date, and adjust the return type to include or exclude dividends using the dividendAdjust parameter. Returns Ranges include -  * oneWeek * oneMonth * threeMonth * yearToDate * oneYear * threeYear * threeYearAnnualized * fiveYear * fiveYearAnnualized 

### Example

```javascript
const { ApiClient, PricesReturnsApi } = require('@factset/sdk-factsetfunds');
const { ConfidentialClient } = require('@factset/sdk-utils');

const apiClient = ApiClient.instance;

// Configure HTTP basic authorization: FactSetApiKey
const FactSetApiKey = apiClient.authentications['FactSetApiKey'];
FactSetApiKey.username = 'YOUR USERNAME';
FactSetApiKey.password = 'YOUR PASSWORD';

// Configure OAuth2 access token for authorization: FactSetOAuth2
const FactSetOAuth2 = apiClient.authentications['FactSetOAuth2'];
FactSetOAuth2.accessToken = 'YOUR ACCESS TOKEN';

// Configure OAuth2 access with ConfidentialClient
apiClient.factsetOauth2Client = new ConfidentialClient('./config.json');

const apiInstance = new PricesReturnsApi();
const ids = ["MABAX-US"]; // [String] | The requested fund identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. <p>***ids limit** =  1000 per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>* 
const opts = {
  'date': 2018-12-31, // String | The date requested for a given date range in YYYY-MM-DD format. The date MUST be equal to or less than the `priceRecentDate` found within the /summary endpoint. 
  'dividendAdjust': "'DIV'" // String | Controls the dividend inclusion for the NAV returns calculations, where -  * DIV = Include Dividends, Total Return * NO_DIV = Exclude Dividends, Simple Return 
};

// Call api endpoint
apiInstance.getFundsReturnsSnapshot(ids, opts).then(
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
 **ids** | [**[String]**](String.md)| The requested fund identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. &lt;p&gt;***ids limit** &#x3D;  1000 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;*  | 
 **date** | **String**| The date requested for a given date range in YYYY-MM-DD format. The date MUST be equal to or less than the &#x60;priceRecentDate&#x60; found within the /summary endpoint.  | [optional] 
 **dividendAdjust** | **String**| Controls the dividend inclusion for the NAV returns calculations, where -  * DIV &#x3D; Include Dividends, Total Return * NO_DIV &#x3D; Exclude Dividends, Simple Return  | [optional] [default to &#39;DIV&#39;]

### Return type

[**FundsReturnsSnapshotResponse**](FundsReturnsSnapshotResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getFundsReturnsSnapshotForList

> FundsReturnsSnapshotResponse getFundsReturnsSnapshotForList(fundsReturnsSnapshotRequest)

Get Fund Returns over pre-defined time horizons as of a specific date.

Get Fund Returns over pre-defined time horizons as of a specific date. Use the date parameter to set the perspective date, and adjust the return type to include or exclude dividends using the dividendAdjust parameter. Returns Ranges include -  * oneWeek * oneMonth * threeMonth * yearToDate * oneYear * threeYear * threeYearAnnualized * fiveYear * fiveYearAnnualized  

### Example

```javascript
const { ApiClient, PricesReturnsApi } = require('@factset/sdk-factsetfunds');
const { ConfidentialClient } = require('@factset/sdk-utils');

const apiClient = ApiClient.instance;

// Configure HTTP basic authorization: FactSetApiKey
const FactSetApiKey = apiClient.authentications['FactSetApiKey'];
FactSetApiKey.username = 'YOUR USERNAME';
FactSetApiKey.password = 'YOUR PASSWORD';

// Configure OAuth2 access token for authorization: FactSetOAuth2
const FactSetOAuth2 = apiClient.authentications['FactSetOAuth2'];
FactSetOAuth2.accessToken = 'YOUR ACCESS TOKEN';

// Configure OAuth2 access with ConfidentialClient
apiClient.factsetOauth2Client = new ConfidentialClient('./config.json');

const apiInstance = new PricesReturnsApi();
const fundsReturnsSnapshotRequest = new factsetfunds.FundsReturnsSnapshotRequest(); // FundsReturnsSnapshotRequest | The Returns Snapshot request body, allowing the user to specify a list of ids.

// Call api endpoint
apiInstance.getFundsReturnsSnapshotForList(fundsReturnsSnapshotRequest).then(
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
 **fundsReturnsSnapshotRequest** | [**FundsReturnsSnapshotRequest**](FundsReturnsSnapshotRequest.md)| The Returns Snapshot request body, allowing the user to specify a list of ids. | 

### Return type

[**FundsReturnsSnapshotResponse**](FundsReturnsSnapshotResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

