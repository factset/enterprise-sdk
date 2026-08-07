# factsetfunds.MarketAggregatesApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getMarketAggregates**](MarketAggregatesApi.md#getMarketAggregates) | **GET** /factset-funds/v1/aggregates/market | Get market aggregates for a requested time series.
[**getMarketAggregatesForList**](MarketAggregatesApi.md#getMarketAggregatesForList) | **POST** /factset-funds/v1/aggregates/market | Get market aggregates for a requested time series.



## getMarketAggregates

> MarketAggregatesResponse getMarketAggregates(ids, opts)

Get market aggregates for a requested time series.

Retrieves FactSet market aggregate data for the funds and date range specified. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, MarketAggregatesApi } = require('@factset/sdk-factsetfunds');
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

const apiInstance = new MarketAggregatesApi();
const ids = ["SPAXX-US"]; // [String] | The requested fund identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs.  Request Limits:    - ids limit = 1000 per request(Non batch)   - Batch requests:       * Single day: up to 1500 IDs per request       * Multi-day: up to 1500 IDs per request   GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of IDs, which may lead to exceeding this request line limit, it is advised that large request payloads be sent using the respective POST method. 
const opts = {
  'startDate': 2018-12-31, // String | The `start date` requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to latest available completed period. 
  'endDate': 2019-12-31, // String | The end date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to latest available completed period. 
  'frequency': "'M'", // String | Controls the display frequency of the data returned.   * **D** = Daily   * **W** = Weekly, based on the last day of the week of the start date.   * **M** = Monthly, based on the last trading day of the month.   * **AM** = Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16 etc.).   * **CQ** = Quarterly based on the last trading day of the calendar quarter (March, June, September, or December).   * **FQ** = Fiscal Quarter of the company.   * **AY** = Actual Annual, based on the start date.   * **CY** = Calendar Annual, based on the last trading day of the calendar year.   * **FY** = Fiscal Annual, based on the last trading day of the company's fiscal year.    
  'currency': USD, // String | Controls the Currency conversion of the Fund. By default, the currency will use the funds local currency. For a list of currency ISO codes, visit Online Assistant Page [OA1470](https://my.apps.factset.com/oa/pages/1470). 
  'batch': "'N'" // String | Enables the ability to asynchronously \"batch\" the request, supporting a long-running request for up to 20 minutes. Upon requesting batch=Y, the service will respond with an HTTP Status Code of 202. Once a batch request is submitted, use batch status to see if the job has been completed. Once completed, retrieve the results of the request via batch-result.    
};

// Call api endpoint
apiInstance.getMarketAggregates(ids, opts).then(
  data => {

      // data is a responsewrapper: GetMarketAggregatesResponseWrapper
      switch (data.statusCode) {

          case 200:
             // MarketAggregatesResponse
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
 **ids** | [**[String]**](String.md)| The requested fund identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs.  Request Limits:    - ids limit &#x3D; 1000 per request(Non batch)   - Batch requests:       * Single day: up to 1500 IDs per request       * Multi-day: up to 1500 IDs per request   GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of IDs, which may lead to exceeding this request line limit, it is advised that large request payloads be sent using the respective POST method.  | 
 **startDate** | **String**| The &#x60;start date&#x60; requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to latest available completed period.  | [optional] 
 **endDate** | **String**| The end date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to latest available completed period.  | [optional] 
 **frequency** | **String**| Controls the display frequency of the data returned.   * **D** &#x3D; Daily   * **W** &#x3D; Weekly, based on the last day of the week of the start date.   * **M** &#x3D; Monthly, based on the last trading day of the month.   * **AM** &#x3D; Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16 etc.).   * **CQ** &#x3D; Quarterly based on the last trading day of the calendar quarter (March, June, September, or December).   * **FQ** &#x3D; Fiscal Quarter of the company.   * **AY** &#x3D; Actual Annual, based on the start date.   * **CY** &#x3D; Calendar Annual, based on the last trading day of the calendar year.   * **FY** &#x3D; Fiscal Annual, based on the last trading day of the company&#39;s fiscal year.     | [optional] [default to &#39;M&#39;]
 **currency** | **String**| Controls the Currency conversion of the Fund. By default, the currency will use the funds local currency. For a list of currency ISO codes, visit Online Assistant Page [OA1470](https://my.apps.factset.com/oa/pages/1470).  | [optional] [default to &#39;LOCAL&#39;]
 **batch** | **String**| Enables the ability to asynchronously \&quot;batch\&quot; the request, supporting a long-running request for up to 20 minutes. Upon requesting batch&#x3D;Y, the service will respond with an HTTP Status Code of 202. Once a batch request is submitted, use batch status to see if the job has been completed. Once completed, retrieve the results of the request via batch-result.     | [optional] [default to &#39;N&#39;]

### Return type

[**MarketAggregatesResponse**](MarketAggregatesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getMarketAggregatesForList

> MarketAggregatesResponse getMarketAggregatesForList(marketAggregatesRequest)

Get market aggregates for a requested time series.

Retrieves FactSet market aggregate data for the funds and date range specified. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, MarketAggregatesApi } = require('@factset/sdk-factsetfunds');
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

const apiInstance = new MarketAggregatesApi();
const marketAggregatesRequest = new factsetfunds.MarketAggregatesRequest(); // MarketAggregatesRequest | The Market Aggregates request body, allowing the user to specify a list of ids and date range.

// Call api endpoint
apiInstance.getMarketAggregatesForList(marketAggregatesRequest).then(
  data => {

      // data is a responsewrapper: GetMarketAggregatesForListResponseWrapper
      switch (data.statusCode) {

          case 200:
             // MarketAggregatesResponse
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
 **marketAggregatesRequest** | [**MarketAggregatesRequest**](MarketAggregatesRequest.md)| The Market Aggregates request body, allowing the user to specify a list of ids and date range. | 

### Return type

[**MarketAggregatesResponse**](MarketAggregatesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

