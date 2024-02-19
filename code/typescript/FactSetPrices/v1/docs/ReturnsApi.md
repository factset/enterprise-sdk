# factsetprices.ReturnsApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getReturnsSnapshot**](ReturnsApi.md#getReturnsSnapshot) | **GET** /factset-prices/v1/returns-snapshot | Returns the price performance of the security and annualized compound total returns.
[**getReturnsSnapshotForList**](ReturnsApi.md#getReturnsSnapshotForList) | **POST** /factset-prices/v1/returns-snapshot | Returns the price performance of the security and annualized compound total returns.
[**getSecurityReturns**](ReturnsApi.md#getSecurityReturns) | **GET** /factset-prices/v1/returns | Gets Returns for a list of &#x60;ids&#x60; as of given date range and rolling Period
[**getSecurityReturnsForList**](ReturnsApi.md#getSecurityReturnsForList) | **POST** /factset-prices/v1/returns | Requests security returns for the given date range and rollingPeriod.



## getReturnsSnapshot

> ReturnsSnapshotResponse getReturnsSnapshot(ids, opts)

Returns the price performance of the security and annualized compound total returns.

Retrieves various return periods as of a given date for a requested list of securities. This endpoint is very helpful for quickly retrieving a list of pre-calculated returns for application development.&lt;p&gt; Return periods include   * oneDay   * weekToDate   * monthToDate   * quarterToDate   * yearToDate   * oneMonth   * threeMonth   * sixMonth   * nineMonth   * oneYear   * twoYearAnnualized   * threeYearAnnualized   * fiveYearAnnualized   * tenYearAnnualized   * twentyYearAnnualized   * thirtyYearAnnualized   * ipoToDateAnnualized   &lt;/p&gt; 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, ReturnsApi } = require('@factset/sdk-factsetprices');
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

const apiInstance = new ReturnsApi();
const ids = ["AAPL-USA"]; // [String] | The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent Ids. <p>***ids limit** =  2000 per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>*
const opts = {
  'date': 2019-07-07, // String | The date in **YYYY-MM-DD** format. This controls the perspective dates to the calculate the returns. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this endpoint. 
  'calendar': FIVEDAY, // String | Calendar of data returned. SEVENDAY includes weekends. LOCAL calendar will default to the securities' trading calendar which excludes date records for respective holiday periods.
  'currency': USD, // String | Currency code for adjusting prices. Default is Local. For a list of currency ISO codes, visit [Online Assistant Page 1470](https://oa.apps.factset.com/pages/1470).
  'dividendAdjust': "'PRICE'" // String | Controls the dividend reinvestment for the returns calculation. Dividends will be reinvested on the date the dividends go ex (when the dividends belong to the seller rather than the buyer). Visit [OA 8748](https://my.apps.factset.com/oa/pages/8748) for calculation methodology.   * **PRICE** = Price Change - Dividends Excluded.   * **EXDATE** = Simple Return - Dividends Received on exdate but not reinvested. Dividends accumulated throughout the specified period are added to the price at the end of the period.   * **EXDATE_C** = Compound Return - Dividends reinvested on exdate. Dividends accumulated throughout the specified period are used to buy more shares of stock in the company. 
};

// Call api endpoint
apiInstance.getReturnsSnapshot(ids, opts).then(
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
 **date** | **String**| The date in **YYYY-MM-DD** format. This controls the perspective dates to the calculate the returns. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this endpoint.  | [optional] 
 **calendar** | **String**| Calendar of data returned. SEVENDAY includes weekends. LOCAL calendar will default to the securities&#39; trading calendar which excludes date records for respective holiday periods. | [optional] [default to &#39;FIVEDAY&#39;]
 **currency** | **String**| Currency code for adjusting prices. Default is Local. For a list of currency ISO codes, visit [Online Assistant Page 1470](https://oa.apps.factset.com/pages/1470). | [optional] 
 **dividendAdjust** | **String**| Controls the dividend reinvestment for the returns calculation. Dividends will be reinvested on the date the dividends go ex (when the dividends belong to the seller rather than the buyer). Visit [OA 8748](https://my.apps.factset.com/oa/pages/8748) for calculation methodology.   * **PRICE** &#x3D; Price Change - Dividends Excluded.   * **EXDATE** &#x3D; Simple Return - Dividends Received on exdate but not reinvested. Dividends accumulated throughout the specified period are added to the price at the end of the period.   * **EXDATE_C** &#x3D; Compound Return - Dividends reinvested on exdate. Dividends accumulated throughout the specified period are used to buy more shares of stock in the company.  | [optional] [default to &#39;PRICE&#39;]

### Return type

[**ReturnsSnapshotResponse**](ReturnsSnapshotResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getReturnsSnapshotForList

> ReturnsSnapshotResponse getReturnsSnapshotForList(returnsSnapshotRequest)

Returns the price performance of the security and annualized compound total returns.

Retrieves various return periods as of a given date for a requested list of securities. This endpoint is very helpful for quickly retrieving a list of pre-calculated returns for application development.&lt;p&gt; Return periods include   * oneDay   * weekToDate   * monthToDate   * quarterToDate   * yearToDate   * oneMonth   * threeMonth   * sixMonth   * nineMonth   * oneYear   * twoYearAnnualized   * threeYearAnnualized   * fiveYearAnnualized   * tenYearAnnualized   * twentyYearAnnualized   * thirtyYearAnnualized   * ipoToDateAnnualized   &lt;/p&gt; 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, ReturnsApi } = require('@factset/sdk-factsetprices');
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

const apiInstance = new ReturnsApi();
const returnsSnapshotRequest = new factsetprices.ReturnsSnapshotRequest(); // ReturnsSnapshotRequest | Request object for Returns-Snapshot.

// Call api endpoint
apiInstance.getReturnsSnapshotForList(returnsSnapshotRequest).then(
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
 **returnsSnapshotRequest** | [**ReturnsSnapshotRequest**](ReturnsSnapshotRequest.md)| Request object for Returns-Snapshot. | 

### Return type

[**ReturnsSnapshotResponse**](ReturnsSnapshotResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## getSecurityReturns

> ReturnsResponse getSecurityReturns(ids, opts)

Gets Returns for a list of &#x60;ids&#x60; as of given date range and rolling Period

The simple or compound return for the requested frequency and/or rollingPeriod. Depending on the input parameters the return will adjust accordingly. If you simply use frequency and no rollingPeriod, the return value will represent the frequency period. If you use rollingPeriod, the values will be returned in actual period ends (e.g. actual month, actual week, daily, etc.). General Return Calculation Details found on [Online Assistant Page #8748](https://oa.apps.factset.com/pages/8748)

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, ReturnsApi } = require('@factset/sdk-factsetprices');
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

const apiInstance = new ReturnsApi();
const ids = ["AAPL-USA"]; // [String] | The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent Ids. <p>***ids limit** =  2000 per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>*
const opts = {
  'startDate': 2019-01-01, // String | The start date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this endpoint. 
  'endDate': 2019-12-31, // String | The end date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this endpoint. 
  'frequency': D, // String | Controls the display frequency of the data returned.   * **D** = Daily   * **W** = Weekly, based on the last day of the week of the start date.   * **M** = Monthly, based on the last trading day of the month.   * **AM** = Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16 etc.).   * **CQ** = Quarterly based on the last trading day of the calendar quarter (March, June, September, or December).   * **FQ** = Fiscal Quarter of the company.   * **AY** = Actual Annual, based on the start date.   * **CY** = Calendar Annual, based on the last trading day of the calendar year.   * **FY** = Fiscal Annual, based on the last trading day of the company's fiscal year. 
  'calendar': FIVEDAY, // String | Calendar of data returned. SEVENDAY includes weekends. LOCAL calendar will default to the securities' trading calendar which excludes date records for respective holiday periods.
  'currency': USD, // String | Currency code for adjusting prices. Default is Local. For a list of currency ISO codes, visit [Online Assistant Page 1470](https://oa.apps.factset.com/pages/1470).
  'dividendAdjust': "'PRICE'", // String | Controls the dividend reinvestment for the returns calculation.   * **PRICE** = Price Change - Dividends Excluded   * **EXDATE** = Simple Return - Dividends Received on exdate but not reinvested   * **PAYDATE** = Simple Return - Dividends Received on paydate but not reinvested   * **EXDATE_C** = Compound Return - Dividends reinvested on exdate   * **PAYDATE_C** = Compound Return - Dividends reinvested on paydate. 
  'rollingPeriod': "rollingPeriod_example" // String | Period of measure for the rolling cumulative return. This does not change display `frequency` but rather the underlying return calculation period. All periods are referencing actual periods of measure, not period-ends. For example, 1M rolling period will go back to that date the previous month, which is not always the month-end date.
};

// Call api endpoint
apiInstance.getSecurityReturns(ids, opts).then(
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
 **startDate** | **String**| The start date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this endpoint.  | [optional] 
 **endDate** | **String**| The end date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this endpoint.  | [optional] 
 **frequency** | **String**| Controls the display frequency of the data returned.   * **D** &#x3D; Daily   * **W** &#x3D; Weekly, based on the last day of the week of the start date.   * **M** &#x3D; Monthly, based on the last trading day of the month.   * **AM** &#x3D; Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16 etc.).   * **CQ** &#x3D; Quarterly based on the last trading day of the calendar quarter (March, June, September, or December).   * **FQ** &#x3D; Fiscal Quarter of the company.   * **AY** &#x3D; Actual Annual, based on the start date.   * **CY** &#x3D; Calendar Annual, based on the last trading day of the calendar year.   * **FY** &#x3D; Fiscal Annual, based on the last trading day of the company&#39;s fiscal year.  | [optional] [default to &#39;D&#39;]
 **calendar** | **String**| Calendar of data returned. SEVENDAY includes weekends. LOCAL calendar will default to the securities&#39; trading calendar which excludes date records for respective holiday periods. | [optional] [default to &#39;FIVEDAY&#39;]
 **currency** | **String**| Currency code for adjusting prices. Default is Local. For a list of currency ISO codes, visit [Online Assistant Page 1470](https://oa.apps.factset.com/pages/1470). | [optional] 
 **dividendAdjust** | **String**| Controls the dividend reinvestment for the returns calculation.   * **PRICE** &#x3D; Price Change - Dividends Excluded   * **EXDATE** &#x3D; Simple Return - Dividends Received on exdate but not reinvested   * **PAYDATE** &#x3D; Simple Return - Dividends Received on paydate but not reinvested   * **EXDATE_C** &#x3D; Compound Return - Dividends reinvested on exdate   * **PAYDATE_C** &#x3D; Compound Return - Dividends reinvested on paydate.  | [optional] [default to &#39;PRICE&#39;]
 **rollingPeriod** | **String**| Period of measure for the rolling cumulative return. This does not change display &#x60;frequency&#x60; but rather the underlying return calculation period. All periods are referencing actual periods of measure, not period-ends. For example, 1M rolling period will go back to that date the previous month, which is not always the month-end date. | [optional] 

### Return type

[**ReturnsResponse**](ReturnsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getSecurityReturnsForList

> ReturnsResponse getSecurityReturnsForList(returnsRequest)

Requests security returns for the given date range and rollingPeriod.

The simple or compound return for the requested frequency and/or rollingPeriod. Depending on the input parameters the return will adjust accordingly. If you simply use frequency and no rollingPeriod, the return value will represent the frequency period. If you use rollingPeriod, the values will be returned in actual period ends (e.g. actual month, actual week, daily, etc.). General Return Calculation Details found on [Online Assistant Page #8748](https://oa.apps.factset.com/pages/8748)

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, ReturnsApi } = require('@factset/sdk-factsetprices');
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

const apiInstance = new ReturnsApi();
const returnsRequest = new factsetprices.ReturnsRequest(); // ReturnsRequest | Request object for `Security` returns.

// Call api endpoint
apiInstance.getSecurityReturnsForList(returnsRequest).then(
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
 **returnsRequest** | [**ReturnsRequest**](ReturnsRequest.md)| Request object for &#x60;Security&#x60; returns. | 

### Return type

[**ReturnsResponse**](ReturnsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

