# factsetfunds.ScoringApi

All URIs are relative to *https://api.factset.com/content/factset-funds/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getScoringDetails**](ScoringApi.md#getScoringDetails) | **GET** /scoring | Get Scoring Details for ETFs
[**getScoringForList**](ScoringApi.md#getScoringForList) | **POST** /scoring | Get Scoring Details for ETFs



## getScoringDetails

> ScoringResponse getScoringDetails(ids, opts)

Get Scoring Details for ETFs

Returns ETF scores, segment averages, analyst recommendations, and grade. * Calculated scores include efficiency, tradability, and fit.  * Segment averages include efficiency, tradability, and fit.   * Analyst pick flags an ETF that provides comprehensive, market like exposure to an area of the market/segment, keeping costs and liquidity in mind.  *  Opportunities list flags an ETF that provides potentially valuable but alternative   exposure to the market/segment, keeping costs and liquidity in mind.  * Grade combines efficiency and tradability scores and assigns a letter grade  This endpoint is available only with Analytics product subscription. If the product is not subscribed, an error will be returned. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, ScoringApi } = require('@factset/sdk-factsetfunds');
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

const apiInstance = new ScoringApi();
const ids = ["MABAX-US"]; // [String] | The requested fund identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. <p>***IDs limit** =  10 per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of IDs, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>*
const opts = {
  'startDate': 2025-01-01, // Date | The start date requested for a given date range in YYYY-MM-DD format. If left blank, the API will default to previous close.Future dates (T+1) are not accepted in this endpoint.
  'endDate': 2025-12-31, // Date | The end date requested for a given date range in YYYY-MM-DD format. If left blank, the API will default to previous close.Future dates (T+1) are not accepted in this endpoint
  'frequency': M, // Frequency | Controls the display frequency of the data returned. The supported frequencies are:    - **D**: Daily - **W**: Weekly, based on the last day of the week of the start date. - **M**: Monthly, based on the last trading day of the month. - **AM**: Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16, etc.). - **CQ**: Quarterly, based on the last trading day of the calendar quarter (March, June, September, or December). - **FQ**: Fiscal Quarter of the company. - **AY**: Actual Annual, based on the start date. - **CY**: Calendar Annual, based on the last trading day of the calendar year. - **FY**: Fiscal Annual, based on the last trading day of the company's fiscal year. 
  'paginationLimit': 100, // Number | The maximum number of records to return. The default is 20.
  'paginationOffset': 0 // Number | The number of records to skip before the first record to return. The default is 0.
};

// Call api endpoint
apiInstance.getScoringDetails(ids, opts).then(
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
 **paginationLimit** | **Number**| The maximum number of records to return. The default is 20. | [optional] [default to 20]
 **paginationOffset** | **Number**| The number of records to skip before the first record to return. The default is 0. | [optional] [default to 0]

### Return type

[**ScoringResponse**](ScoringResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getScoringForList

> ScoringResponse getScoringForList(scoringRequest)

Get Scoring Details for ETFs

Returns ETF scores, segment averages, analyst recommendations, and grade. * Calculated scores include efficiency, tradability, and fit.  * Segment averages include efficiency, tradability, and fit.   * Analyst pick flags an ETF that provides comprehensive, market like exposure to an area of the market/segment, keeping costs and liquidity in mind.  *  Opportunities list flags an ETF that provides potentially valuable but alternative   exposure to the market/segment, keeping costs and liquidity in mind.  * Grade combines efficiency and tradability scores and assigns a letter grade  This endpoint is available only with Analytics product subscription. If the product is not subscribed, an error will be returned. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, ScoringApi } = require('@factset/sdk-factsetfunds');
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

const apiInstance = new ScoringApi();
const scoringRequest = new factsetfunds.ScoringRequest(); // ScoringRequest | The Scoring request body, allowing the user to specify a list of IDs, date ranges and frequency.

// Call api endpoint
apiInstance.getScoringForList(scoringRequest).then(
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
 **scoringRequest** | [**ScoringRequest**](ScoringRequest.md)| The Scoring request body, allowing the user to specify a list of IDs, date ranges and frequency. | 

### Return type

[**ScoringResponse**](ScoringResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

