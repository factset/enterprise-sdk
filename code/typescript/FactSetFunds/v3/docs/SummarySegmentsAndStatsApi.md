# factsetfunds.SummarySegmentsAndStatsApi

All URIs are relative to *https://api.factset.com/content/factset-funds/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getFundsAum**](SummarySegmentsAndStatsApi.md#getFundsAum) | **GET** /aum | Get Fund AUM for a requested date range and list of IDs
[**getFundsAumForList**](SummarySegmentsAndStatsApi.md#getFundsAumForList) | **POST** /aum | Get Fund AUM for a requested date range and large list of IDs
[**getFundsFlows**](SummarySegmentsAndStatsApi.md#getFundsFlows) | **GET** /flows | Get Fund Flows for a requested date range and list of IDs
[**getFundsFlowsForList**](SummarySegmentsAndStatsApi.md#getFundsFlowsForList) | **POST** /flows | Get Fund Flows for a requested date range and large list of IDs
[**getFundsSummary**](SummarySegmentsAndStatsApi.md#getFundsSummary) | **GET** /summary | Get basic reference summary data for a Fund.
[**getFundsSummaryForList**](SummarySegmentsAndStatsApi.md#getFundsSummaryForList) | **POST** /summary | Get basic reference data for a large list of Fund IDs.
[**getSegmentsAndStructure**](SummarySegmentsAndStatsApi.md#getSegmentsAndStructure) | **GET** /segments-and-structure | Get Fund Classification, Similar Funds, Segments, and Fund Structure
[**getSegmentsAndStructureForList**](SummarySegmentsAndStatsApi.md#getSegmentsAndStructureForList) | **POST** /segments-and-structure | Get Fund Classification, Similar Funds, Segments, and Fund Structure.



## getFundsAum

> AumResponse getFundsAum(ids, opts)

Get Fund AUM for a requested date range and list of IDs

Get the Fund Level or Share Class Level Assets Under Management (AUM). &lt;p&gt;NOTE - AUM can be accessed on a five-day calendar. If a vendor does not provide NAV and shares outstanding on a market holiday, the previous trading day value is used. If a vendor does provide data on a market holiday, that value will be presented, and then fund flows and AUM will be calculated. When you are manually calculating actual AUM on a market holiday or a rolled date, it will differ from the value shown in the FactSet workstation. This is due to the previous day&#39;s NAV being used in the manual AUM calculation.&lt;/p&gt;

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, SummarySegmentsAndStatsApi } = require('@factset/sdk-factsetfunds');
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

const apiInstance = new SummarySegmentsAndStatsApi();
const ids = ["MABAX-US"]; // [String] | The requested fund identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. <p>***IDs limit** =  10 per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of IDs, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>*
const opts = {
  'startDate': 2025-01-01, // Date | The start date requested for a given date range in YYYY-MM-DD format. If left blank, the API will default to previous close.Future dates (T+1) are not accepted in this endpoint.
  'endDate': 2025-12-31, // Date | The end date requested for a given date range in YYYY-MM-DD format. If left blank, the API will default to previous close.Future dates (T+1) are not accepted in this endpoint
  'frequency': M, // FrequencyAum | Controls the display frequency of the data returned. Supported values are: - **MTD**: Month-To-Date - **M**: Monthly, based on the last trading day of the month - **CQTD**: Calendar Quarter-to-Date - **CQ**: Calendar Quarterly - **CYTD**: Calendar Year-to-Date - **CY**: Calendar Yearly
  'currency': USD, // String | The ISO3 currency control for the requested fund. For a list of currency ISO codes, visit Online Assistant Page [OA1470](https://my.apps.factset.com/oa/pages/1470)
  'dataType': ROLL, // NavDataType | The Data Type of the NAV expressed as Raw or Rolled values.
  'paginationLimit': 100, // Number | The maximum number of records to return. The default is 20.
  'paginationOffset': 0 // Number | The number of records to skip before the first record to return. The default is 0.
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
 **ids** | [**[String]**](String.md)| The requested fund identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. &lt;p&gt;***IDs limit** &#x3D;  10 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of IDs, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;* | 
 **startDate** | **Date**| The start date requested for a given date range in YYYY-MM-DD format. If left blank, the API will default to previous close.Future dates (T+1) are not accepted in this endpoint. | [optional] 
 **endDate** | **Date**| The end date requested for a given date range in YYYY-MM-DD format. If left blank, the API will default to previous close.Future dates (T+1) are not accepted in this endpoint | [optional] 
 **frequency** | [**FrequencyAum**](.md)| Controls the display frequency of the data returned. Supported values are: - **MTD**: Month-To-Date - **M**: Monthly, based on the last trading day of the month - **CQTD**: Calendar Quarter-to-Date - **CQ**: Calendar Quarterly - **CYTD**: Calendar Year-to-Date - **CY**: Calendar Yearly | [optional] 
 **currency** | **String**| The ISO3 currency control for the requested fund. For a list of currency ISO codes, visit Online Assistant Page [OA1470](https://my.apps.factset.com/oa/pages/1470) | [optional] [default to &#39;USD&#39;]
 **dataType** | [**NavDataType**](.md)| The Data Type of the NAV expressed as Raw or Rolled values. | [optional] 
 **paginationLimit** | **Number**| The maximum number of records to return. The default is 20. | [optional] [default to 20]
 **paginationOffset** | **Number**| The number of records to skip before the first record to return. The default is 0. | [optional] [default to 0]

### Return type

[**AumResponse**](AumResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getFundsAumForList

> AumResponse getFundsAumForList(aumRequest)

Get Fund AUM for a requested date range and large list of IDs

Get the Fund Level or Share Class Level Assets Under Management (AUM). &lt;p&gt;NOTE - AUM can be accessed on a five-day calendar. If a vendor does not provide NAV and shares outstanding on a market holiday, the previous trading day value is used. If a vendor does provide data on a market holiday, that value will be presented, and then fund flows and AUM will be calculated. When you are manually calculating actual AUM on a market holiday or a rolled date, it will differ from the value shown in the FactSet workstation. This is due to the previous day&#39;s NAV being used in the manual AUM calculation.&lt;/p&gt;

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, SummarySegmentsAndStatsApi } = require('@factset/sdk-factsetfunds');
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

const apiInstance = new SummarySegmentsAndStatsApi();
const aumRequest = new factsetfunds.AumRequest(); // AumRequest | The AUM request body, allowing the user to specify a list of IDs.

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
 **aumRequest** | [**AumRequest**](AumRequest.md)| The AUM request body, allowing the user to specify a list of IDs. | 

### Return type

[**AumResponse**](AumResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## getFundsFlows

> FlowsResponse getFundsFlows(ids, opts)

Get Fund Flows for a requested date range and list of IDs

Get the Fund Flows. One-day fund flows are calculated by subtracting the shares outstanding at previous close from the shares outstanding one day prior to close, and then multiplying the result by the net asset value (NAV) of one day prior to close.  The fund flows calculation breaks down as follows -  &#x60;&#x60;&#x60;(Shares Outstanding T0 - Shares Outstanding T-1) * NAV T-1 &#x60;&#x60;&#x60; While NAVs are routinely reported on a trade-day (T0) basis, industry-wide shares outstanding are a mixture of trade-day and next-day values. Trade-day values are not verified, as the actual creation/redemption activity takes place late in the evening, after NAVs and shares outstanding values have been published. The result is that multiple industry flows are calculated using unverified T0 values. FactSet has standardized all shares outstanding reporting on a next-day basis. To ensure that assets under management (AUM) and fund flows are synchronized, FactSet synchronizes shares outstanding values and changes with NAVs reported on the previous day, as the creations and redemptions used the previous day&#39;s reported NAVs as a transaction price. &lt;p&gt;For more information on Fund Flows Methodology, Time Windows, Market Holidays, and Missing Values, visit - [OA #17863](https://my.apps.factset.com/oa/pages/17863#Flows_Calculation)&lt;/p&gt; 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, SummarySegmentsAndStatsApi } = require('@factset/sdk-factsetfunds');
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

const apiInstance = new SummarySegmentsAndStatsApi();
const ids = ["MABAX-US"]; // [String] | The requested fund identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. <p>***IDs limit** =  10 per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of IDs, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>*
const opts = {
  'startDate': 2025-01-01, // Date | The start date requested for a given date range in YYYY-MM-DD format. If left blank, the API will default to previous close.Future dates (T+1) are not accepted in this endpoint.
  'endDate': 2025-12-31, // Date | The end date requested for a given date range in YYYY-MM-DD format. If left blank, the API will default to previous close.Future dates (T+1) are not accepted in this endpoint
  'frequency': M, // Frequency | Controls the display frequency of the data returned. The supported frequencies are:    - **D**: Daily - **W**: Weekly, based on the last day of the week of the start date. - **M**: Monthly, based on the last trading day of the month. - **AM**: Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16, etc.). - **CQ**: Quarterly, based on the last trading day of the calendar quarter (March, June, September, or December). - **FQ**: Fiscal Quarter of the company. - **AY**: Actual Annual, based on the start date. - **CY**: Calendar Annual, based on the last trading day of the calendar year. - **FY**: Fiscal Annual, based on the last trading day of the company's fiscal year. 
  'currency': USD, // String | The ISO3 currency control for the requested fund. For a list of currency ISO codes, visit Online Assistant Page [OA1470](https://my.apps.factset.com/oa/pages/1470)
  'paginationLimit': 100, // Number | The maximum number of records to return. The default is 20.
  'paginationOffset': 0 // Number | The number of records to skip before the first record to return. The default is 0.
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
 **ids** | [**[String]**](String.md)| The requested fund identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. &lt;p&gt;***IDs limit** &#x3D;  10 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of IDs, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;* | 
 **startDate** | **Date**| The start date requested for a given date range in YYYY-MM-DD format. If left blank, the API will default to previous close.Future dates (T+1) are not accepted in this endpoint. | [optional] 
 **endDate** | **Date**| The end date requested for a given date range in YYYY-MM-DD format. If left blank, the API will default to previous close.Future dates (T+1) are not accepted in this endpoint | [optional] 
 **frequency** | [**Frequency**](.md)| Controls the display frequency of the data returned. The supported frequencies are:    - **D**: Daily - **W**: Weekly, based on the last day of the week of the start date. - **M**: Monthly, based on the last trading day of the month. - **AM**: Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16, etc.). - **CQ**: Quarterly, based on the last trading day of the calendar quarter (March, June, September, or December). - **FQ**: Fiscal Quarter of the company. - **AY**: Actual Annual, based on the start date. - **CY**: Calendar Annual, based on the last trading day of the calendar year. - **FY**: Fiscal Annual, based on the last trading day of the company&#39;s fiscal year.  | [optional] 
 **currency** | **String**| The ISO3 currency control for the requested fund. For a list of currency ISO codes, visit Online Assistant Page [OA1470](https://my.apps.factset.com/oa/pages/1470) | [optional] [default to &#39;USD&#39;]
 **paginationLimit** | **Number**| The maximum number of records to return. The default is 20. | [optional] [default to 20]
 **paginationOffset** | **Number**| The number of records to skip before the first record to return. The default is 0. | [optional] [default to 0]

### Return type

[**FlowsResponse**](FlowsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getFundsFlowsForList

> FlowsResponse getFundsFlowsForList(flowsRequest)

Get Fund Flows for a requested date range and large list of IDs

Get the Fund Flows. One-day fund flows are calculated by subtracting the shares outstanding at previous close from the shares outstanding one day prior to close, and then multiplying the result by the net asset value (NAV) of one day prior to close.  The fund flows calculation breaks down as follows -  &#x60;&#x60;&#x60;(Shares Outstanding T0 - Shares Outstanding T-1) * NAV T-1&#x60;&#x60;&#x60; While NAVs are routinely reported on a trade-day (T0) basis, industry-wide shares outstanding are a mixture of trade-day and next-day values. Trade-day values are not verified, as the actual creation/redemption activity takes place late in the evening, after NAVs and shares outstanding values have been published. The result is that multiple industry flows are calculated using unverified T0 values. FactSet has standardized all shares outstanding reporting on a next-day basis. To ensure that assets under management (AUM) and fund flows are synchronized, FactSet synchronizes shares outstanding values and changes with NAVs reported on the previous day, as the creations and redemptions used the previous day&#39;s reported NAVs as a transaction price. &lt;p&gt;For more information on Fund Flows Methodology, Time Windows, Market Holidays, and Missing Values, visit - [OA #17863](https://my.apps.factset.com/oa/pages/17863#Flows_Calculation)&lt;/p&gt; 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, SummarySegmentsAndStatsApi } = require('@factset/sdk-factsetfunds');
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

const apiInstance = new SummarySegmentsAndStatsApi();
const flowsRequest = new factsetfunds.FlowsRequest(); // FlowsRequest | The Fund Flows request body, allowing the user to specify a list of IDs.

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
 **flowsRequest** | [**FlowsRequest**](FlowsRequest.md)| The Fund Flows request body, allowing the user to specify a list of IDs. | 

### Return type

[**FlowsResponse**](FlowsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## getFundsSummary

> SummariesResponse getFundsSummary(ids, opts)

Get basic reference summary data for a Fund.

Fetch basic reference data for the requested fund(s), including &#x60;fundDomicile&#x60;, &#x60;shareClass&#x60;, &#x60;shareClassLaunchDate&#x60;, etc.  

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, SummarySegmentsAndStatsApi } = require('@factset/sdk-factsetfunds');
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

const apiInstance = new SummarySegmentsAndStatsApi();
const ids = ["MABAX-US"]; // [String] | The requested fund identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. <p>***IDs limit** =  10 per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of IDs, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>*
const opts = {
  'lang': EN // Lang | Language to be returned for Description, Insight (Overview), and Objective attributes, where available. Currently French will be returned for U.S. funds when \"FR\" is passed.
};

// Call api endpoint
apiInstance.getFundsSummary(ids, opts).then(
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
 **ids** | [**[String]**](String.md)| The requested fund identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. &lt;p&gt;***IDs limit** &#x3D;  10 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of IDs, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;* | 
 **lang** | [**Lang**](.md)| Language to be returned for Description, Insight (Overview), and Objective attributes, where available. Currently French will be returned for U.S. funds when \&quot;FR\&quot; is passed. | [optional] 

### Return type

[**SummariesResponse**](SummariesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getFundsSummaryForList

> SummariesResponse getFundsSummaryForList(summariesRequest)

Get basic reference data for a large list of Fund IDs.

Fetch basic reference data for the requested fund(s), including &#x60;fundDomicile&#x60;, &#x60;shareClass&#x60;, &#x60;shareClassLaunchDate&#x60;, etc.  

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, SummarySegmentsAndStatsApi } = require('@factset/sdk-factsetfunds');
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

const apiInstance = new SummarySegmentsAndStatsApi();
const summariesRequest = new factsetfunds.SummariesRequest(); // SummariesRequest | The Funds Summary request body, allowing the user to specify a list of IDs.

// Call api endpoint
apiInstance.getFundsSummaryForList(summariesRequest).then(
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
 **summariesRequest** | [**SummariesRequest**](SummariesRequest.md)| The Funds Summary request body, allowing the user to specify a list of IDs. | 

### Return type

[**SummariesResponse**](SummariesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## getSegmentsAndStructure

> SegmentsAndStructureResponse getSegmentsAndStructure(ids, opts)

Get Fund Classification, Similar Funds, Segments, and Fund Structure

Returns fund structure information (classification, similar funds, segments, or fund structure) based on the &#x60;structureType&#x60; parameter. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, SummarySegmentsAndStatsApi } = require('@factset/sdk-factsetfunds');
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

const apiInstance = new SummarySegmentsAndStatsApi();
const ids = ["MABAX-US"]; // [String] | The requested fund identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. <p>***IDs limit** =  10 per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of IDs, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>*
const opts = {
  'structureType': new factsetfunds.StructureType() // StructureType | Returns the type of data items requested, such as classification details, similar funds, segment (benchmark) details, or structure information (funds structure and advisor details).  * **CLASSIFICATION**: Categorizes funds using a rules-based system that is derived from seven core classifications. This system evaluates the asset class, economic development level, and geographical region as described in each fund's prospectus and marketing materials. Fund exposure details are presented on successively granular levels- category, then focus, and then niche  * **SIMILAR_FUNDS**: Returns the similar fund share classes * **SEGMENTS**: Returns the Fund's Benchmark and Segment Benchmark information. * **FUND_STRUCTURE**: Returns fund structure and advisor information 
};

// Call api endpoint
apiInstance.getSegmentsAndStructure(ids, opts).then(
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
 **ids** | [**[String]**](String.md)| The requested fund identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. &lt;p&gt;***IDs limit** &#x3D;  10 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of IDs, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;* | 
 **structureType** | [**StructureType**](.md)| Returns the type of data items requested, such as classification details, similar funds, segment (benchmark) details, or structure information (funds structure and advisor details).  * **CLASSIFICATION**: Categorizes funds using a rules-based system that is derived from seven core classifications. This system evaluates the asset class, economic development level, and geographical region as described in each fund&#39;s prospectus and marketing materials. Fund exposure details are presented on successively granular levels- category, then focus, and then niche  * **SIMILAR_FUNDS**: Returns the similar fund share classes * **SEGMENTS**: Returns the Fund&#39;s Benchmark and Segment Benchmark information. * **FUND_STRUCTURE**: Returns fund structure and advisor information  | [optional] 

### Return type

[**SegmentsAndStructureResponse**](SegmentsAndStructureResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getSegmentsAndStructureForList

> SegmentsAndStructureResponse getSegmentsAndStructureForList(segmentsAndStructureRequest)

Get Fund Classification, Similar Funds, Segments, and Fund Structure.

Returns fund structure information (classification, similar funds, segments, or fund structure) for a large list of fund IDs based on the &#x60;structureType&#x60; parameter.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, SummarySegmentsAndStatsApi } = require('@factset/sdk-factsetfunds');
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

const apiInstance = new SummarySegmentsAndStatsApi();
const segmentsAndStructureRequest = new factsetfunds.SegmentsAndStructureRequest(); // SegmentsAndStructureRequest | 

// Call api endpoint
apiInstance.getSegmentsAndStructureForList(segmentsAndStructureRequest).then(
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
 **segmentsAndStructureRequest** | [**SegmentsAndStructureRequest**](SegmentsAndStructureRequest.md)|  | 

### Return type

[**SegmentsAndStructureResponse**](SegmentsAndStructureResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

