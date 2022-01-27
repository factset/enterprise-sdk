# factsettickhistory.RequestFilesApi

All URIs are relative to *https://api-sandbox.factset.com/bulk-documents/tickhistory*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1RequestFilesGet**](RequestFilesApi.md#v1RequestFilesGet) | **GET** /v1/request-files | Returns the requestId and status



## v1RequestFilesGet

> RequestFilesResponse v1RequestFilesGet(startDate, endDate, opts)

Returns the requestId and status

Try it Out - references a Sandbox environment to simulate live reponses.&lt;/p&gt; **In Sandbox** data available from 20210101 to 20210131. Current date data is not available.&lt;/p&gt; PROD has data from 20120101 to current date &amp;&lt;/p&gt; **available IDs is limited to..**&lt;/p&gt; US Equity - IBM-USA, F-USA, AAPL-USA, GOOG-USA&lt;/p&gt; ASX - CBA-ASX, BHP-ASX&lt;/p&gt; LSE - HSBA-LON, VOD-LON&lt;/p&gt; Tokyo - 7203-TKS, 4307-TKS&lt;/p&gt; Shenzhen OR Shanghai - 300782-SHE, 300792-SHE&lt;/p&gt; Swiss - NESN-SWX, COTN-SWX&lt;/p&gt; Singapore - J36-SES &amp;&lt;/p&gt; Hong Kong - 700-HKG&lt;/p&gt;

### Example

```javascript
const { ApiClient, RequestFilesApi } = require('@factset/sdk-factsettickhistory');
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

const apiInstance = new RequestFilesApi();
const startDate = 2021-01-01; // Date | The date for (or from which) the data is required</p> **In Sandbox, data available from 1st to 31st Jan'21 only**
const endDate = 2021-01-31; // Date | The date to which data is required</p> **In Sandbox, data available from 1st to 31st Jan'21 only**
const opts = {
  'ticker': IBM,F,AAPL,GOOG, // String | any ticker. <p>**Either ticker(s) + iso_code  (OR) product is allowed**</p> **NOTE**:Only one identifier can be requested per request
  'isoCode': USA, // String | iso_code. <p>ticker(s) + iso_code</p> <p>**Does not support multiple iso_codes**</p>
  'fields': * // String | Fields for which data is requested. Refer <a href= \"https://developer.factset.com/api-catalog/tick-history-api#apiDocumentation\">Output fileds list</a>. for available fields.</p> **In trial default=all fields**
};

// Call api endpoint
apiInstance.v1RequestFilesGet(startDate, endDate, opts).then(
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
 **startDate** | **Date**| The date for (or from which) the data is required&lt;/p&gt; **In Sandbox, data available from 1st to 31st Jan&#39;21 only** | 
 **endDate** | **Date**| The date to which data is required&lt;/p&gt; **In Sandbox, data available from 1st to 31st Jan&#39;21 only** | 
 **ticker** | **String**| any ticker. &lt;p&gt;**Either ticker(s) + iso_code  (OR) product is allowed**&lt;/p&gt; **NOTE**:Only one identifier can be requested per request | [optional] 
 **isoCode** | **String**| iso_code. &lt;p&gt;ticker(s) + iso_code&lt;/p&gt; &lt;p&gt;**Does not support multiple iso_codes**&lt;/p&gt; | [optional] 
 **fields** | **String**| Fields for which data is requested. Refer &lt;a href&#x3D; \&quot;https://developer.factset.com/api-catalog/tick-history-api#apiDocumentation\&quot;&gt;Output fileds list&lt;/a&gt;. for available fields.&lt;/p&gt; **In trial default&#x3D;all fields** | [optional] [default to &#39;*&#39;]

### Return type

[**RequestFilesResponse**](RequestFilesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

