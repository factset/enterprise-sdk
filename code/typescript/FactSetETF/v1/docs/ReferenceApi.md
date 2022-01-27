# factsetetf.ReferenceApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getEtfReferenceData**](ReferenceApi.md#getEtfReferenceData) | **GET** /factset-etf/v1/reference | Return reference data for an ETF.
[**getEtfReferenceDataForList**](ReferenceApi.md#getEtfReferenceDataForList) | **POST** /factset-etf/v1/reference | Fetch Reference Data for a large list of ETF securities.



## getEtfReferenceData

> EtfReferenceDataResponse getEtfReferenceData(ids, opts)

Return reference data for an ETF.

Returns reference data items for Exchange Traded Funds. 

### Example

```javascript
const { ApiClient, ReferenceApi } = require('@factset/sdk-factsetetf');
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
const ids = ["null"]; // [String] | The list of ETF identifiers. Accepted identifer types include FactSet Permanent Ids, Tickers, CUSIP, SEDOL, ISIN. <p>***ids limit** =  3000 per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>* 
const opts = {
  'metrics': ["null"], // [String] | List of individdual data items for Exchange Traded Funds. By default only the fsymId and requestId are returned. To fetch a list of all available data items, use the **_/metrics** endpoint. 
  'categories': [new factsetetf.Category()] // [Category] | Groupings of `metrics` data items. Supply a list of categories below to return collections of data items in response. |category|description| |---|---| |BENCHMARK_DETAILS|Details surrounding the underlying Benchmark Id and Segment Banchmark| |CLASSIFICATION|FactSet Fund Classification Codes and Names, across Asset Class, Broad  Geography, Fund Categories, Focus, Niche, and more.| |COSTS_FEES|Expenses and Fees such as capital gains, expense ratio, management fees, and more.| |COUNTERPARTY|Credit and Swap Counterparty details| |CREATE_REDEEM|Creation and Redemption Sizes| |DESCRIPTIVE|General Descriptive information such as name, objectives, issuer details, launch dates, website, and more.| |DISTRIBUTIONS|Dividend Dates, Dividend Treatmetns, Min/Max Cap Gains| |DOCUMENTATION|Details surrounding reporting information.| |GEARING|Leverage factors, inverse flags, and more.| |HEDGE|Hedging Information| |RISK|CIFSC Risk Ratings| |SERVICE_PROVIDERS|Distributors, issuers, and Advisor details| |STATUS|Actively Managed Flags| |STRATEGY|Segment Codes, selection criteria, strategy codes, weighting schemes, and lending details.| |STRUCTURE|ETF Type, backing codes, synthetic types, ucits compliance, legal structures, and more.| |TAX|Tax Types, distribution takes, K1 Flags, and more.| 
};

// Call api endpoint
apiInstance.getEtfReferenceData(ids, opts).then(
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
 **ids** | [**[String]**](String.md)| The list of ETF identifiers. Accepted identifer types include FactSet Permanent Ids, Tickers, CUSIP, SEDOL, ISIN. &lt;p&gt;***ids limit** &#x3D;  3000 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;*  | 
 **metrics** | [**[String]**](String.md)| List of individdual data items for Exchange Traded Funds. By default only the fsymId and requestId are returned. To fetch a list of all available data items, use the **_/metrics** endpoint.  | [optional] 
 **categories** | [**[Category]**](Category.md)| Groupings of &#x60;metrics&#x60; data items. Supply a list of categories below to return collections of data items in response. |category|description| |---|---| |BENCHMARK_DETAILS|Details surrounding the underlying Benchmark Id and Segment Banchmark| |CLASSIFICATION|FactSet Fund Classification Codes and Names, across Asset Class, Broad  Geography, Fund Categories, Focus, Niche, and more.| |COSTS_FEES|Expenses and Fees such as capital gains, expense ratio, management fees, and more.| |COUNTERPARTY|Credit and Swap Counterparty details| |CREATE_REDEEM|Creation and Redemption Sizes| |DESCRIPTIVE|General Descriptive information such as name, objectives, issuer details, launch dates, website, and more.| |DISTRIBUTIONS|Dividend Dates, Dividend Treatmetns, Min/Max Cap Gains| |DOCUMENTATION|Details surrounding reporting information.| |GEARING|Leverage factors, inverse flags, and more.| |HEDGE|Hedging Information| |RISK|CIFSC Risk Ratings| |SERVICE_PROVIDERS|Distributors, issuers, and Advisor details| |STATUS|Actively Managed Flags| |STRATEGY|Segment Codes, selection criteria, strategy codes, weighting schemes, and lending details.| |STRUCTURE|ETF Type, backing codes, synthetic types, ucits compliance, legal structures, and more.| |TAX|Tax Types, distribution takes, K1 Flags, and more.|  | [optional] 

### Return type

[**EtfReferenceDataResponse**](EtfReferenceDataResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getEtfReferenceDataForList

> EtfReferenceDataResponse getEtfReferenceDataForList(etfReferenceDataRequest)

Fetch Reference Data for a large list of ETF securities.

Returns reference data items for a list of Exchange Traded Funds. 

### Example

```javascript
const { ApiClient, ReferenceApi } = require('@factset/sdk-factsetetf');
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
const etfReferenceDataRequest = new factsetetf.EtfReferenceDataRequest(); // EtfReferenceDataRequest | Request object for Exchange Traded Funds

// Call api endpoint
apiInstance.getEtfReferenceDataForList(etfReferenceDataRequest).then(
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
 **etfReferenceDataRequest** | [**EtfReferenceDataRequest**](EtfReferenceDataRequest.md)| Request object for Exchange Traded Funds | 

### Return type

[**EtfReferenceDataResponse**](EtfReferenceDataResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

