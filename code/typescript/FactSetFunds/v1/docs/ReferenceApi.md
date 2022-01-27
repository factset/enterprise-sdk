# factsetfunds.ReferenceApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getFundsBenchmarkDetails**](ReferenceApi.md#getFundsBenchmarkDetails) | **GET** /factset-funds/v1/benchmark-details | Get the Fund&#39;s Primary and Segment Benchmark Details
[**getFundsBenchmarkDetailsForList**](ReferenceApi.md#getFundsBenchmarkDetailsForList) | **POST** /factset-funds/v1/benchmark-details | Get the Fund&#39;s Primary and Segment Benchmark details for large list of ids.
[**getFundsClassifications**](ReferenceApi.md#getFundsClassifications) | **GET** /factset-funds/v1/classifications | Get basic Fund Classifications
[**getFundsClassificationsForList**](ReferenceApi.md#getFundsClassificationsForList) | **POST** /factset-funds/v1/classifications | Get basic Fund Classifications for a large list of ids.
[**getFundsCostsFees**](ReferenceApi.md#getFundsCostsFees) | **GET** /factset-funds/v1/costs-fees | Get the Fund&#39;s Costs, Investment minimums and Risk, and Fees.
[**getFundsCostsFeesForList**](ReferenceApi.md#getFundsCostsFeesForList) | **POST** /factset-funds/v1/costs-fees | Get the Fund&#39;s Costs, Investment minimums and Risk, and Fees for large list of ids.
[**getFundsManagers**](ReferenceApi.md#getFundsManagers) | **GET** /factset-funds/v1/managers | Get a list of Fund Managers and related details for a list of ids.
[**getFundsManagersForList**](ReferenceApi.md#getFundsManagersForList) | **POST** /factset-funds/v1/managers | Get a list of Fund Managers and related details for a large list of ids.
[**getFundsSummary**](ReferenceApi.md#getFundsSummary) | **GET** /factset-funds/v1/summary | Get basic reference summary data for a Fund.
[**getFundsSummaryForList**](ReferenceApi.md#getFundsSummaryForList) | **POST** /factset-funds/v1/summary | Get basic reference data for a large list of Fund ids.
[**getRelatedFunds**](ReferenceApi.md#getRelatedFunds) | **GET** /factset-funds/v1/related-funds | Get a list of Related Funds for a list of Fund ids.
[**getRelatedFundsForList**](ReferenceApi.md#getRelatedFundsForList) | **POST** /factset-funds/v1/related-funds | Get a list of Related Funds for a large list of Fund ids.



## getFundsBenchmarkDetails

> BenchmarkDetailsResponse getFundsBenchmarkDetails(ids)

Get the Fund&#39;s Primary and Segment Benchmark Details

Fetch the Fund&#39;s Benchmark and Segement Benchmark ids. These ids can be then used in the [Benchmarks API](https://developer.factset.com/api-catalog/factset-benchmarks-api) to fetch index-level prices, returns, constituents data. 

### Example

```javascript
const { ApiClient, ReferenceApi } = require('@factset/sdk-factsetfunds');
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

const apiInstance = new ReferenceApi();
const ids = ["MABAX-US"]; // [String] | The requested fund identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. <p>***ids limit** =  1000 per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>* 

// Call api endpoint
apiInstance.getFundsBenchmarkDetails(ids).then(
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

### Return type

[**BenchmarkDetailsResponse**](BenchmarkDetailsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getFundsBenchmarkDetailsForList

> BenchmarkDetailsResponse getFundsBenchmarkDetailsForList(benchmarkDetailsRequest)

Get the Fund&#39;s Primary and Segment Benchmark details for large list of ids.

Fetch the Fund&#39;s Benchmark and Segement Benchmark ids. These ids can be then used in the [Benchmarks API](https://developer.factset.com/api-catalog/factset-benchmarks-api) to fetch index-level prices, returns, constituents data. 

### Example

```javascript
const { ApiClient, ReferenceApi } = require('@factset/sdk-factsetfunds');
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

const apiInstance = new ReferenceApi();
const benchmarkDetailsRequest = new factsetfunds.BenchmarkDetailsRequest(); // BenchmarkDetailsRequest | The Benchmark Details request body, allowing the user to specify a list of ids.

// Call api endpoint
apiInstance.getFundsBenchmarkDetailsForList(benchmarkDetailsRequest).then(
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
 **benchmarkDetailsRequest** | [**BenchmarkDetailsRequest**](BenchmarkDetailsRequest.md)| The Benchmark Details request body, allowing the user to specify a list of ids. | 

### Return type

[**BenchmarkDetailsResponse**](BenchmarkDetailsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## getFundsClassifications

> ClassificationsResponse getFundsClassifications(ids)

Get basic Fund Classifications

Fetch basic fund classification data, such as Asset Class, Category, Focus, Niche, Region, and more.&lt;p&gt; FactSet Mutual Funds Reference uses FactSet&#39;s proprietary Fund Classification System, which categorizes funds using a rules-based system that is derived from seven core classifications. This system evaluates the asset class, economic development level, and geographical region as described in each fund&#39;s prospectus and marketing materials. Fund exposure details are presented on successively granular levels- category, then focus, and then niche. Moreover, FactSet Fund Reference captures over 40 unique data points for U.S. mutual funds. All data items are grouped in one of two levels, either as a Fund or as a Share Class.&lt;/p&gt;&lt;p&gt;For more details regarding FactSet&#39;s Fund Classification, visit Online Assistant [21436](https://my.apps.factset.com/oa/pages/21436) or download - [FactSet Fund Classification System Rules &amp; Methodology](https://my.apps.factset.com/oa/cms/oaAttachment/4547a2f4-5df5-4ec9-a0d3-7d51610dd637/26837)&lt;/p&gt;&lt;p&gt; |Classification Type|Description| |---|---| |Asset Class|The asset class of the fund (e.g. Equity, Fixed Income, Currency, Commodities, Asset Allocation, or Alternatives) based on the fund’s mandate.| |Category|The 1st of 3 asset-class-specific, hierarchical exposure tiers; the broadest category the fund falls under within its asset class (e.g., Size &amp; Style, Sector, Precious Metals, Absolute Returns); based on the fund’s mandate.| |Focus|The 2nd of 3 asset-class-specific, hierarchical exposure tiers; the fund&#39;s classification within its category (e.g. Small Cap, Energy, Palladium, Long/Short); based on the fund’s mandate.| |Niche|The 3rd of 3 asset-class-specific, hierarchical exposure tiers; The fund&#39;s classification within its Focus. Most granular tier of exposure sort (e.g., Growth, Coal, Physically held, Merger Arbitrage); based on the fund’s mandate.| |Economic Development Level|The country development level of the fund (Developed, Emerging, Frontier, or Blended) based on the fund’s mandate.| |Region|The broad regional exposure of the fund (e.g., Latin America, Asia-Pacific, Global) based on the fund’s mandate.| |Specific Geography|The specific geographic exposure of the fund (e.g., Developed Europe, Chile, Asia-Pacific Ex-Japan) based on the fund’s mandate.| &lt;/p&gt; 

### Example

```javascript
const { ApiClient, ReferenceApi } = require('@factset/sdk-factsetfunds');
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

const apiInstance = new ReferenceApi();
const ids = ["MABAX-US"]; // [String] | The requested fund identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. <p>***ids limit** =  1000 per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>* 

// Call api endpoint
apiInstance.getFundsClassifications(ids).then(
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

### Return type

[**ClassificationsResponse**](ClassificationsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getFundsClassificationsForList

> ClassificationsResponse getFundsClassificationsForList(classificationsRequest)

Get basic Fund Classifications for a large list of ids.

Fetch basic fund classification data, such as Asset Class, Category, Focus, Niche, Region, and more.&lt;p&gt; FactSet Mutual Funds Reference uses FactSet&#39;s proprietary Fund Classification System, which categorizes funds using a rules-based system that is derived from seven core classifications. This system evaluates the asset class, economic development level, and geographical region as described in each fund&#39;s prospectus and marketing materials. Fund exposure details are presented on successively granular levels- category, then focus, and then niche. Moreover, FactSet Fund Reference captures over 40 unique data points for U.S. mutual funds. All data items are grouped in one of two levels, either as a Fund or as a Share Class.&lt;/p&gt;&lt;p&gt;For more details regarding FactSet&#39;s Fund Classification, visit Online Assistant [21436](https://my.apps.factset.com/oa/pages/21436) or download - [FactSet Fund Classification System Rules &amp; Methodology](https://my.apps.factset.com/oa/cms/oaAttachment/4547a2f4-5df5-4ec9-a0d3-7d51610dd637/26837)&lt;/p&gt;&lt;p&gt; |Classification Type|Description| |---|---| |Asset Class|The asset class of the fund (e.g. Equity, Fixed Income, Currency, Commodities, Asset Allocation, or Alternatives) based on the fund’s mandate.| |Category|The 1st of 3 asset-class-specific, hierarchical exposure tiers; the broadest category the fund falls under within its asset class (e.g., Size &amp; Style, Sector, Precious Metals, Absolute Returns); based on the fund’s mandate.| |Focus|The 2nd of 3 asset-class-specific, hierarchical exposure tiers; the fund&#39;s classification within its category (e.g. Small Cap, Energy, Palladium, Long/Short); based on the fund’s mandate.| |Niche|The 3rd of 3 asset-class-specific, hierarchical exposure tiers; The fund&#39;s classification within its Focus. Most granular tier of exposure sort (e.g., Growth, Coal, Physically held, Merger Arbitrage); based on the fund’s mandate.| |Economic Development Level|The country development level of the fund (Developed, Emerging, Frontier, or Blended) based on the fund’s mandate.| |Region|The broad regional exposure of the fund (e.g., Latin America, Asia-Pacific, Global) based on the fund’s mandate.| |Specific Geography|The specific geographic exposure of the fund (e.g., Developed Europe, Chile, Asia-Pacific Ex-Japan) based on the fund’s mandate.| &lt;/p&gt; 

### Example

```javascript
const { ApiClient, ReferenceApi } = require('@factset/sdk-factsetfunds');
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

const apiInstance = new ReferenceApi();
const classificationsRequest = new factsetfunds.ClassificationsRequest(); // ClassificationsRequest | The Classifications request body, allowing the user to specify a list of ids.

// Call api endpoint
apiInstance.getFundsClassificationsForList(classificationsRequest).then(
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
 **classificationsRequest** | [**ClassificationsRequest**](ClassificationsRequest.md)| The Classifications request body, allowing the user to specify a list of ids. | 

### Return type

[**ClassificationsResponse**](ClassificationsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## getFundsCostsFees

> CostsFeesResponse getFundsCostsFees(ids, opts)

Get the Fund&#39;s Costs, Investment minimums and Risk, and Fees.

Fetch the Fund&#39;s Costs, Investment minimums and Risk, and Fees. This subcategory includes management fees, 12b-1 fees, expense ratios, and several other data items. The value for each specified share class is expressed as a percentage of the AUM. 

### Example

```javascript
const { ApiClient, ReferenceApi } = require('@factset/sdk-factsetfunds');
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

const apiInstance = new ReferenceApi();
const ids = ["MABAX-US"]; // [String] | The requested fund identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. <p>***ids limit** =  1000 per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>* 
const opts = {
  'date': 2019-12-31, // String | The date requested in **YYYY-MM-DD** format. If left blank, the API will default to latest available completed period. 
  'currency': USD // String | Controls the Currency conversion of the Fund. By default, the currency will use the funds local currency.
};

// Call api endpoint
apiInstance.getFundsCostsFees(ids, opts).then(
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
 **date** | **String**| The date requested in **YYYY-MM-DD** format. If left blank, the API will default to latest available completed period.  | [optional] 
 **currency** | **String**| Controls the Currency conversion of the Fund. By default, the currency will use the funds local currency. | [optional] [default to &#39;LOCAL&#39;]

### Return type

[**CostsFeesResponse**](CostsFeesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getFundsCostsFeesForList

> CostsFeesResponse getFundsCostsFeesForList(costsFeesRequest)

Get the Fund&#39;s Costs, Investment minimums and Risk, and Fees for large list of ids.

Fetch the Fund&#39;s Costs, Investment minimums and Risk, and Fees. Data Items include Expense Ratios, investment minimums and maximums, swing prices, entry and exit expenses, and more. 

### Example

```javascript
const { ApiClient, ReferenceApi } = require('@factset/sdk-factsetfunds');
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

const apiInstance = new ReferenceApi();
const costsFeesRequest = new factsetfunds.CostsFeesRequest(); // CostsFeesRequest | The Costs and Fees request body, allowing the user to specify a list of ids.

// Call api endpoint
apiInstance.getFundsCostsFeesForList(costsFeesRequest).then(
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
 **costsFeesRequest** | [**CostsFeesRequest**](CostsFeesRequest.md)| The Costs and Fees request body, allowing the user to specify a list of ids. | 

### Return type

[**CostsFeesResponse**](CostsFeesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## getFundsManagers

> ManagersResponse getFundsManagers(ids)

Get a list of Fund Managers and related details for a list of ids.

Fetch basic Fund manager details, such as Title, Phone, Job Id and Name. NOTE - A subscription to FactSet&#39;s Ownership product is required to access formulas in this Asset Managers subcategory. 

### Example

```javascript
const { ApiClient, ReferenceApi } = require('@factset/sdk-factsetfunds');
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

const apiInstance = new ReferenceApi();
const ids = ["MABAX-US"]; // [String] | The requested fund identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. <p>***ids limit** =  1000 per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>* 

// Call api endpoint
apiInstance.getFundsManagers(ids).then(
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

### Return type

[**ManagersResponse**](ManagersResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getFundsManagersForList

> ManagersResponse getFundsManagersForList(managersRequest)

Get a list of Fund Managers and related details for a large list of ids.

Fetch basic Fund manager details, such as Title, Phone, Job Id and Name.  

### Example

```javascript
const { ApiClient, ReferenceApi } = require('@factset/sdk-factsetfunds');
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

const apiInstance = new ReferenceApi();
const managersRequest = new factsetfunds.ManagersRequest(); // ManagersRequest | The Funds Managers request body, allowing the user to specify a list of ids.

// Call api endpoint
apiInstance.getFundsManagersForList(managersRequest).then(
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
 **managersRequest** | [**ManagersRequest**](ManagersRequest.md)| The Funds Managers request body, allowing the user to specify a list of ids. | 

### Return type

[**ManagersResponse**](ManagersResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## getFundsSummary

> SummariesResponse getFundsSummary(ids)

Get basic reference summary data for a Fund.

Fetch basic reference data for the requested fund(s), including countryDomicile, shrClass, shrClassInceptDate, etc.  

### Example

```javascript
const { ApiClient, ReferenceApi } = require('@factset/sdk-factsetfunds');
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

const apiInstance = new ReferenceApi();
const ids = ["MABAX-US"]; // [String] | The requested fund identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. <p>***ids limit** =  1000 per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>* 

// Call api endpoint
apiInstance.getFundsSummary(ids).then(
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

### Return type

[**SummariesResponse**](SummariesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getFundsSummaryForList

> SummariesResponse getFundsSummaryForList(summariesRequest)

Get basic reference data for a large list of Fund ids.

Fetch basic reference data for the requested fund(s), including countryDomicile, shrClass, shrClassInceptDate, etc.  

### Example

```javascript
const { ApiClient, ReferenceApi } = require('@factset/sdk-factsetfunds');
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

const apiInstance = new ReferenceApi();
const summariesRequest = new factsetfunds.SummariesRequest(); // SummariesRequest | The Funds Summary request body, allowing the user to specify a list of ids.

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
 **summariesRequest** | [**SummariesRequest**](SummariesRequest.md)| The Funds Summary request body, allowing the user to specify a list of ids. | 

### Return type

[**SummariesResponse**](SummariesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## getRelatedFunds

> RelatedFundsResponse getRelatedFunds(ids)

Get a list of Related Funds for a list of Fund ids.

Fetch the five related fund share classes. Fund share classes can be related if they belong to the same Fund Classification segment, have the same share class type, have the same legal structure, and have the same country of primary exchange. Beyond the baseline criteria, the five most relevant funds are determined based on whether they follow the same benchmark, have the same maturity, and have the same selection strategy as the specified share class. 

### Example

```javascript
const { ApiClient, ReferenceApi } = require('@factset/sdk-factsetfunds');
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

const apiInstance = new ReferenceApi();
const ids = ["MABAX-US"]; // [String] | The requested fund identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. <p>***ids limit** =  1000 per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>* 

// Call api endpoint
apiInstance.getRelatedFunds(ids).then(
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

### Return type

[**RelatedFundsResponse**](RelatedFundsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getRelatedFundsForList

> RelatedFundsResponse getRelatedFundsForList(relatedFundsRequest)

Get a list of Related Funds for a large list of Fund ids.

Fetch the five related fund share classes. Fund share classes can be related if they belong to the same Fund Classification segment, have the same share class type, have the same legal structure, and have the same country of primary exchange. Beyond the baseline criteria, the five most relevant funds are determined based on whether they follow the same benchmark, have the same maturity, and have the same selection strategy as the specified share class. 

### Example

```javascript
const { ApiClient, ReferenceApi } = require('@factset/sdk-factsetfunds');
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

const apiInstance = new ReferenceApi();
const relatedFundsRequest = new factsetfunds.RelatedFundsRequest(); // RelatedFundsRequest | The Related Funds request body, allowing the user to specify a list of ids.

// Call api endpoint
apiInstance.getRelatedFundsForList(relatedFundsRequest).then(
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
 **relatedFundsRequest** | [**RelatedFundsRequest**](RelatedFundsRequest.md)| The Related Funds request body, allowing the user to specify a list of ids. | 

### Return type

[**RelatedFundsResponse**](RelatedFundsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

