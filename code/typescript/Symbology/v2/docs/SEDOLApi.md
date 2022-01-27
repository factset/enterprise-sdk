# symbology.SEDOLApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**batchSedolHistory**](SEDOLApi.md#batchSedolHistory) | **POST** /symbology/v2/sedol-history | Retrieve the full history or as of a specific date of SEDOL changes for a requested ID.
[**batchTranslateSedol**](SEDOLApi.md#batchTranslateSedol) | **POST** /symbology/v2/sedol | Translate market security symbols into SEDOL. - Current Only
[**sedolHistory**](SEDOLApi.md#sedolHistory) | **GET** /symbology/v2/sedol-history | Retrieve the full history or as of a specific date of SEDOL changes for the requested ID(s).
[**translateSedol**](SEDOLApi.md#translateSedol) | **GET** /symbology/v2/sedol | Translate market security symbols into SEDOL. - Current Only



## batchSedolHistory

> SedolHistoryTranslationResponse batchSedolHistory(sedolHistoryTranslationRequest)

Retrieve the full history or as of a specific date of SEDOL changes for a requested ID.

Return the full history of SEDOL changes for a given market security or FactSet Permanent Id. The service will default to returning the full history if no asOfDate is requested. Visit [OA 3938](https://my.apps.factset.com/oa/pages/3938%23sedol) for more details regarding the SEDOL numbering system. 

### Example

```javascript
const { ApiClient, SEDOLApi } = require('@factset/sdk-symbology');
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

const apiInstance = new SEDOLApi();
const sedolHistoryTranslationRequest = new symbology.SedolHistoryTranslationRequest(); // SedolHistoryTranslationRequest | Response Body for SEDOL History

// Call api endpoint
apiInstance.batchSedolHistory(sedolHistoryTranslationRequest).then(
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
 **sedolHistoryTranslationRequest** | [**SedolHistoryTranslationRequest**](SedolHistoryTranslationRequest.md)| Response Body for SEDOL History | 

### Return type

[**SedolHistoryTranslationResponse**](SedolHistoryTranslationResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## batchTranslateSedol

> SedolTranslationResponse batchTranslateSedol(sedolTranslationRequest)

Translate market security symbols into SEDOL. - Current Only

Translate market security symbols into SEDOL and FactSet Permanent Identifiers. Visit [OA 3938](https://my.apps.factset.com/oa/pages/3938%23sedol) for more details regarding the SEDOL numbering system. 

### Example

```javascript
const { ApiClient, SEDOLApi } = require('@factset/sdk-symbology');
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

const apiInstance = new SEDOLApi();
const sedolTranslationRequest = new symbology.SedolTranslationRequest(); // SedolTranslationRequest | Request Body for SEDOL Symbology Translation

// Call api endpoint
apiInstance.batchTranslateSedol(sedolTranslationRequest).then(
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
 **sedolTranslationRequest** | [**SedolTranslationRequest**](SedolTranslationRequest.md)| Request Body for SEDOL Symbology Translation | 

### Return type

[**SedolTranslationResponse**](SedolTranslationResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## sedolHistory

> SedolHistoryTranslationResponse sedolHistory(ids, opts)

Retrieve the full history or as of a specific date of SEDOL changes for the requested ID(s).

Returns the full history of SEDOL changes for a given security or as of a requested date. The service will default to returning the full history if no asOfDate is requested. Visit [OA 3938](https://my.apps.factset.com/oa/pages/3938%23sedol) for more details. 

### Example

```javascript
const { ApiClient, SEDOLApi } = require('@factset/sdk-symbology');
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

const apiInstance = new SEDOLApi();
const ids = ["GOOGL-US"]; // [String] | Requested market securities or entities. Accepted identifiers include all FactSet Permanent Identifiers types, CUSIP, SEDOL, ISIN, and Tickers. This request value is sent back in the response as, `requestId'. <p>***ids limit** =  3000 per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>*
const opts = {
  'asOfDate': 2010-01-01 // String | As-Of date for historical symbol request in YYYY-MM-DD format. This is the date requested in the service. If no asOfDate was requested, the response will be null.
};

// Call api endpoint
apiInstance.sedolHistory(ids, opts).then(
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
 **ids** | [**[String]**](String.md)| Requested market securities or entities. Accepted identifiers include all FactSet Permanent Identifiers types, CUSIP, SEDOL, ISIN, and Tickers. This request value is sent back in the response as, &#x60;requestId&#39;. &lt;p&gt;***ids limit** &#x3D;  3000 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;* | 
 **asOfDate** | **String**| As-Of date for historical symbol request in YYYY-MM-DD format. This is the date requested in the service. If no asOfDate was requested, the response will be null. | [optional] 

### Return type

[**SedolHistoryTranslationResponse**](SedolHistoryTranslationResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## translateSedol

> SedolTranslationResponse translateSedol(ids)

Translate market security symbols into SEDOL. - Current Only

Translate market security symbols into SEDOL and FactSet Permanent Identifiers. Visit [OA 3938](https://my.apps.factset.com/oa/pages/3938%23sedol) for more details regarding the SEDOL numbering system. 

### Example

```javascript
const { ApiClient, SEDOLApi } = require('@factset/sdk-symbology');
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

const apiInstance = new SEDOLApi();
const ids = ["GOOGL-US"]; // [String] | Requested market securities or entities. Accepted identifiers include all FactSet Permanent Identifiers types, CUSIP, SEDOL, ISIN, and Tickers. This request value is sent back in the response as, `requestId'. <p>***ids limit** =  3000 per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>*

// Call api endpoint
apiInstance.translateSedol(ids).then(
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
 **ids** | [**[String]**](String.md)| Requested market securities or entities. Accepted identifiers include all FactSet Permanent Identifiers types, CUSIP, SEDOL, ISIN, and Tickers. This request value is sent back in the response as, &#x60;requestId&#39;. &lt;p&gt;***ids limit** &#x3D;  3000 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;* | 

### Return type

[**SedolTranslationResponse**](SedolTranslationResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

