# factsetglobalprices.MarketValueApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getGPDMarketVal**](MarketValueApi.md#getGPDMarketVal) | **GET** /factset-global-prices/v1/market-value | Provides the current market value for a list of specified securities.
[**getSecurityPricesForListMarketVal**](MarketValueApi.md#getSecurityPricesForListMarketVal) | **POST** /factset-global-prices/v1/market-value | Requests the current market value for a list of specified securities.



## getGPDMarketVal

> MarketValueResponse getGPDMarketVal(ids, opts)

Provides the current market value for a list of specified securities.

Provides the current market value (in USD millions) for a list of specified securities.  

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, MarketValueApi } = require('@factset/sdk-factsetglobalprices');
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

const apiInstance = new MarketValueApi();
const ids = ["AAPL-USA"]; // [String] | The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent Ids.<p>***ids limit** =  50 per both non-batch request and batch request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, it's advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>*
const opts = {
  'batch': "'N'" // String | Enables the ability to asynchronously \"batch\" the request, supporting a long-running request for up to 20 minutes. Upon requesting batch=Y, the service will respond with an HTTP Status Code of 202. Once a batch request is submitted, use batch status to see if the job has been completed. Once completed, retrieve the results of the request via batch-result.  For single-day requests, the ids limit is 500 for non-batch and 2000 for batch. For multi-day requests, the limit is 50 ids for both batch and non-batch.  Limits on query string via GET method still apply. It's advised to submit large lists of ids via POST method. <B>Please note that the number of unique currencies present in the requested ids is limited to 50 per request.</B> 
};

// Call api endpoint
apiInstance.getGPDMarketVal(ids, opts).then(
  data => {

      // data is a responsewrapper: GetGPDMarketValResponseWrapper
      switch (data.statusCode) {

          case 200:
             // MarketValueResponse
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
 **ids** | [**[String]**](String.md)| The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent Ids.&lt;p&gt;***ids limit** &#x3D;  50 per both non-batch request and batch request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, it&#39;s advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;* | 
 **batch** | **String**| Enables the ability to asynchronously \&quot;batch\&quot; the request, supporting a long-running request for up to 20 minutes. Upon requesting batch&#x3D;Y, the service will respond with an HTTP Status Code of 202. Once a batch request is submitted, use batch status to see if the job has been completed. Once completed, retrieve the results of the request via batch-result.  For single-day requests, the ids limit is 500 for non-batch and 2000 for batch. For multi-day requests, the limit is 50 ids for both batch and non-batch.  Limits on query string via GET method still apply. It&#39;s advised to submit large lists of ids via POST method. &lt;B&gt;Please note that the number of unique currencies present in the requested ids is limited to 50 per request.&lt;/B&gt;  | [optional] [default to &#39;N&#39;]

### Return type

[**MarketValueResponse**](MarketValueResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getSecurityPricesForListMarketVal

> MarketValueResponse getSecurityPricesForListMarketVal(marketValueRequest)

Requests the current market value for a list of specified securities.

Provides the current market value (in USD millions) for a list of specified securities.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, MarketValueApi } = require('@factset/sdk-factsetglobalprices');
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

const apiInstance = new MarketValueApi();
const marketValueRequest = new factsetglobalprices.MarketValueRequest(); // MarketValueRequest | Request object for `Market Value`.

// Call api endpoint
apiInstance.getSecurityPricesForListMarketVal(marketValueRequest).then(
  data => {

      // data is a responsewrapper: GetSecurityPricesForListMarketValResponseWrapper
      switch (data.statusCode) {

          case 200:
             // MarketValueResponse
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
 **marketValueRequest** | [**MarketValueRequest**](MarketValueRequest.md)| Request object for &#x60;Market Value&#x60;. | 

### Return type

[**MarketValueResponse**](MarketValueResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

