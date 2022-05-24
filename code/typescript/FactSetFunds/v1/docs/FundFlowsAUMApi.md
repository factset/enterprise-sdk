# factsetfunds.FundFlowsAUMApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getFundsAum**](FundFlowsAUMApi.md#getFundsAum) | **GET** /factset-funds/v1/aum | Get Fund AUM for a requested date range and list of ids
[**getFundsAumForList**](FundFlowsAUMApi.md#getFundsAumForList) | **POST** /factset-funds/v1/aum | Get Fund AUM for a requested date range and large list of ids
[**getFundsFlows**](FundFlowsAUMApi.md#getFundsFlows) | **GET** /factset-funds/v1/flows | Get Fund Flows for a requested date range and list of ids
[**getFundsFlowsForList**](FundFlowsAUMApi.md#getFundsFlowsForList) | **POST** /factset-funds/v1/flows | Get Fund Flows for a requested date range and large list of ids



## getFundsAum

> AumResponse getFundsAum(ids, opts)

Get Fund AUM for a requested date range and list of ids

Get the Fund Level or Share Class Level Assets Under Management (AUM). &lt;p&gt;NOTE - AUM can be accessed on a five-day calendar. If a vendor does not provide NAV and shares outstanding on a market holiday, the previous trading day value is used. If a vendor does provide data on a market holiday, that value will be presented, and then fund flows and AUM will be calculated. When you are manually calculating actual AUM on a market holiday or a rolled date, it will differ from the value shown in the FactSet workstation. This is due to the previous day&#39;s NAV being used in the manual AUM calculation.&lt;/p&gt; 

### Example

```javascript
const { ApiClient, FundFlowsAUMApi } = require('@factset/sdk-factsetfunds');
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

const apiInstance = new FundFlowsAUMApi();
const ids = ["MABAX-US"]; // [String] | The requested fund identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. <p>***ids limit** =  1000 per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>* 
const opts = {
  'startDate': 2018-12-31, // String | The start date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to latest available completed period. 
  'endDate': 2019-12-31, // String | The end date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to latest available completed period. 
  'frequency': "'M'", // String | Controls the display frequency of the data returned.   * **MTD** = Month-To-Date   * **M** = Monthly, based on the last trading day of the month.   * **CQTD** = Calendar Quarter-to-Date   * **CQ** = Calendar Quarterly   * **CYTD** = Calendar Year-to-Date   * **CY** = Calendar Yearly 
  'currency': USD, // String | Controls the Currency conversion of the Fund. By default, the currency will use the funds local currency.
  'dataType': "'ROLL'" // String | The Data Type of the NAV expressed as Raw or Rolled values.
};

// Call api endpoint
apiInstance.getFundsAum(ids, opts).then(
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
 **frequency** | **String**| Controls the display frequency of the data returned.   * **MTD** &#x3D; Month-To-Date   * **M** &#x3D; Monthly, based on the last trading day of the month.   * **CQTD** &#x3D; Calendar Quarter-to-Date   * **CQ** &#x3D; Calendar Quarterly   * **CYTD** &#x3D; Calendar Year-to-Date   * **CY** &#x3D; Calendar Yearly  | [optional] [default to &#39;M&#39;]
 **currency** | **String**| Controls the Currency conversion of the Fund. By default, the currency will use the funds local currency. | [optional] [default to &#39;LOCAL&#39;]
 **dataType** | **String**| The Data Type of the NAV expressed as Raw or Rolled values. | [optional] [default to &#39;ROLL&#39;]

### Return type

[**AumResponse**](AumResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getFundsAumForList

> AumResponse getFundsAumForList(aumRequest)

Get Fund AUM for a requested date range and large list of ids

Get the Fund Level or Share Class Level Assets Under Management (AUM). &lt;p&gt;NOTE - AUM can be accessed on a five-day calendar. If a vendor does not provide NAV and shares outstanding on a market holiday, the previous trading day value is used. If a vendor does provide data on a market holiday, that value will be presented, and then fund flows and AUM will be calculated. When you are manually calculating actual AUM on a market holiday or a rolled date, it will differ from the value shown in the FactSet workstation. This is due to the previous day&#39;s NAV being used in the manual AUM calculation.&lt;/p&gt; 

### Example

```javascript
const { ApiClient, FundFlowsAUMApi } = require('@factset/sdk-factsetfunds');
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

const apiInstance = new FundFlowsAUMApi();
const aumRequest = new factsetfunds.AumRequest(); // AumRequest | The AUM request body, allowing the user to specify a list of ids.

// Call api endpoint
apiInstance.getFundsAumForList(aumRequest).then(
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
 **aumRequest** | [**AumRequest**](AumRequest.md)| The AUM request body, allowing the user to specify a list of ids. | 

### Return type

[**AumResponse**](AumResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## getFundsFlows

> FlowsResponse getFundsFlows(ids, opts)

Get Fund Flows for a requested date range and list of ids

Get the Fund Flows. One-day fund flows are calculated by subtracting the shares outstanding at previous close from the shares outstanding one day prior to close, and then multiplying the result by the net asset value (NAV) of one day prior to close.  The fund flows calculation breaks down as follows -  (Shares Outstanding T0 - Shares Outstanding T-1) * NAV T-1 While NAVs are routinely reported on a trade-day (T0) basis, industry-wide shares outstanding are a mixture of trade-day and next-day values. Trade-day values are not verified, as the actual creation/redemption activity takes place late in the evening, after NAVs and shares outstanding values have been published. The result is that multiple industry flows are calculated using unverified T0 values. FactSet has standardized all shares outstanding reporting on a next-day basis. To ensure that assets under management (AUM) and fund flows are synchronized, FactSet synchronizes shares outstanding values and changes with NAVs reported on the previous day, as the creations and redemptions used the previous day&#39;s reported NAVs as a transaction price. &lt;p&gt;For more information on Fund Flows Methodology, Time Windows, Makret Holidays, and Missing Values, visit - [OA #17863](https://my.apps.factset.com/oa/pages/17863#Flows_Calculation)&lt;/p&gt; 

### Example

```javascript
const { ApiClient, FundFlowsAUMApi } = require('@factset/sdk-factsetfunds');
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

const apiInstance = new FundFlowsAUMApi();
const ids = ["MABAX-US"]; // [String] | The requested fund identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. <p>***ids limit** =  1000 per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>* 
const opts = {
  'startDate': 2018-12-31, // String | The start date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to latest available completed period. 
  'endDate': 2019-12-31, // String | The end date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to latest available completed period. 
  'frequency': "'M'", // String | Controls the display frequency of the data returned.   * **D** = Daily   * **W** = Weekly, based on the last day of the week of the start date.   * **M** = Monthly, based on the last trading day of the month.   * **AM** = Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16 etc.).   * **CQ** = Quarterly based on the last trading day of the calendar quarter (March, June, September, or December).   * **FQ** = Fiscal Quarter of the company.   * **AY** = Actual Annual, based on the start date.   * **CY** = Calendar Annual, based on the last trading day of the calendar year.   * **FY** = Fiscal Annual, based on the last trading day of the company's fiscal year. 
  'currency': USD // String | Controls the Currency conversion of the Fund. By default, the currency will use the funds local currency.
};

// Call api endpoint
apiInstance.getFundsFlows(ids, opts).then(
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

### Return type

[**FlowsResponse**](FlowsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getFundsFlowsForList

> FlowsResponse getFundsFlowsForList(flowsRequest)

Get Fund Flows for a requested date range and large list of ids

Get the Fund Flows. One-day fund flows are calculated by subtracting the shares outstanding at previous close from the shares outstanding one day prior to close, and then multiplying the result by the net asset value (NAV) of one day prior to close.  The fund flows calculation breaks down as follows -  (Shares Outstanding T0 - Shares Outstanding T-1) * NAV T-1 While NAVs are routinely reported on a trade-day (T0) basis, industry-wide shares outstanding are a mixture of trade-day and next-day values. Trade-day values are not verified, as the actual creation/redemption activity takes place late in the evening, after NAVs and shares outstanding values have been published. The result is that multiple industry flows are calculated using unverified T0 values. FactSet has standardized all shares outstanding reporting on a next-day basis. To ensure that assets under management (AUM) and fund flows are synchronized, FactSet synchronizes shares outstanding values and changes with NAVs reported on the previous day, as the creations and redemptions used the previous day&#39;s reported NAVs as a transaction price. &lt;p&gt;For more information on Fund Flows Methodology, Time Windows, Makret Holidays, and Missing Values, visit - [OA #17863](https://my.apps.factset.com/oa/pages/17863#Flows_Calculation)&lt;/p&gt; 

### Example

```javascript
const { ApiClient, FundFlowsAUMApi } = require('@factset/sdk-factsetfunds');
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

const apiInstance = new FundFlowsAUMApi();
const flowsRequest = new factsetfunds.FlowsRequest(); // FlowsRequest | The Fund Flows request body, allowing the user to specify a list of ids.

// Call api endpoint
apiInstance.getFundsFlowsForList(flowsRequest).then(
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
 **flowsRequest** | [**FlowsRequest**](FlowsRequest.md)| The Fund Flows request body, allowing the user to specify a list of ids. | 

### Return type

[**FlowsResponse**](FlowsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

