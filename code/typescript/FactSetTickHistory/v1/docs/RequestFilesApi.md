# factsettickhistory.RequestFilesApi

All URIs are relative to *https://api-sandbox.factset.com/bulk-documents/tickhistory*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1RequestFilesGet**](RequestFilesApi.md#v1RequestFilesGet) | **GET** /v1/request-files | Returns the requestId and status



## v1RequestFilesGet

> RequestFilesResponse v1RequestFilesGet(startDate, endDate, opts)

Returns the requestId and status

Try it Out - references a Sandbox environment to simulate live reponses.&lt;/p&gt; **In Sandbox** data available from 20210101 to 20210131. Current date data is not available.&lt;/p&gt; PROD has data from 20120101 to current date &amp;&lt;/p&gt; **available IDs is limited to..**&lt;/p&gt; US Equity - IBM-USA, F-USA, AAPL-USA, GOOG-USA&lt;/p&gt; ASX - CBA-ASX, BHP-ASX&lt;/p&gt; LSE - HSBA-LON, VOD-LON&lt;/p&gt; Tokyo - 7203-TKS, 4307-TKS&lt;/p&gt; Swiss - NESN-SWX, COTN-SWX&lt;/p&gt; Singapore - J36-SES &amp;&lt;/p&gt; Hong Kong - 700-HKG&lt;/p&gt;

### Example

```javascript
const { ApiClient, RequestFilesApi } = require('@factset/sdk-factsettickhistory');
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

const apiInstance = new RequestFilesApi();
const startDate = 2021-01-01; // Date | The date for (or from which) the data is required.</p> **In Sandbox, data available from 1st to 31st Jan'21 only**.
const endDate = 2021-01-31; // Date | The date to which data is required.</p> **In Sandbox, data available from 1st to 31st Jan'21 only**.
const opts = {
  'ticker': CBA,BHP, // String | The requested list of security identifiers. <p>**Either ticker(s) + iso_code  (OR) product is allowed**</p> **NOTE**:Only one identifier can be requested per request
  'isoCode': AUS, // String | The requested ISO code. <p>ticker(s) + iso_code</p> <p>**Does not support multiple iso_codes**</p>
  'fields': *, // String | Fields for which data is requested. Refer <a href= \"https://developer.factset.com/api-catalog/factset-tick-history-api#apiDocumentation\">Output fields list</a>. for available fields.</p> **In trial default=all fields**
  'startTime': 10:20:30, // String | The start time of the data being requested. The time should be in HH:MM:SS format.
  'endTime': 11:20:30, // String | The end time of the data being requested. The time should be in HH:MM:SS format.
  'single': "'false'", // String | Returns data in a single file when single=true. This parameter only works for smaller date/time requests where the file size is upto 128MB.
  'regionalISOCode': ASX // String | Works in conjunction with iso_code parameter.<p>ticker(s) + iso_code + regionalISOCode</p> <p>**Does not support multiple regionalISOCodes**</p>
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
 **startDate** | **Date**| The date for (or from which) the data is required.&lt;/p&gt; **In Sandbox, data available from 1st to 31st Jan&#39;21 only**. | 
 **endDate** | **Date**| The date to which data is required.&lt;/p&gt; **In Sandbox, data available from 1st to 31st Jan&#39;21 only**. | 
 **ticker** | **String**| The requested list of security identifiers. &lt;p&gt;**Either ticker(s) + iso_code  (OR) product is allowed**&lt;/p&gt; **NOTE**:Only one identifier can be requested per request | [optional] 
 **isoCode** | **String**| The requested ISO code. &lt;p&gt;ticker(s) + iso_code&lt;/p&gt; &lt;p&gt;**Does not support multiple iso_codes**&lt;/p&gt; | [optional] 
 **fields** | **String**| Fields for which data is requested. Refer &lt;a href&#x3D; \&quot;https://developer.factset.com/api-catalog/factset-tick-history-api#apiDocumentation\&quot;&gt;Output fields list&lt;/a&gt;. for available fields.&lt;/p&gt; **In trial default&#x3D;all fields** | [optional] [default to &#39;*&#39;]
 **startTime** | **String**| The start time of the data being requested. The time should be in HH:MM:SS format. | [optional] 
 **endTime** | **String**| The end time of the data being requested. The time should be in HH:MM:SS format. | [optional] 
 **single** | **String**| Returns data in a single file when single&#x3D;true. This parameter only works for smaller date/time requests where the file size is upto 128MB. | [optional] [default to &#39;false&#39;]
 **regionalISOCode** | **String**| Works in conjunction with iso_code parameter.&lt;p&gt;ticker(s) + iso_code + regionalISOCode&lt;/p&gt; &lt;p&gt;**Does not support multiple regionalISOCodes**&lt;/p&gt; | [optional] 

### Return type

[**RequestFilesResponse**](RequestFilesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

