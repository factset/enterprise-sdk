# symbology.IdentifierResolutionApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**batchIdentifierResolution**](IdentifierResolutionApi.md#batchIdentifierResolution) | **POST** /symbology/v3/identifier-resolution | Returns the specified output identifiers for the specified input identifier.
[**identifierResolution**](IdentifierResolutionApi.md#identifierResolution) | **GET** /symbology/v3/identifier-resolution | Returns the specified output identifiers for the specified input identifier.



## batchIdentifierResolution

> IdentifierResolutionResponse batchIdentifierResolution(identifierResolutionRequest)

Returns the specified output identifiers for the specified input identifier.

The Identifier Resolution endpoint provides flexibility for requesting and receiving both third-party and FactSet Permanent identifiers. Users can both input and output most of the listed identifiers, with exceptions noted below.  All input and output symbols must be declared, and users have the ability to resolve one input symbol to many different output symbols in one request.  * BIC* - Bank Identification Code (e.g. ABXXHKH1) * CIK - Edgar Central Index Keys (e.g. 0000100331) * CRD - Central Registration Depository (e.g. 149722) * DUNS - Dun &amp; Bradstreet Data Universal Numbering System (e.g. 687741991) (Input only) * EIN - Employer Identification Number (e.g. 953540776) * FITCH* - Fitch Ratings Identifier (e.g. 47504) * LEI - Legal Entity Identifier (e.g. 549300A6K7JX8EX2QZ33) * MD* - Moody&#39;s Ratings Identifier (e.g. 0823736553) * SPR* - S&amp;P Ratings Identifier (e.g. 301939) * VALOREN - Valoren (\&quot;Valor\&quot;) Identification (e.g. 685558) (Input only) * WKN* - German Securities Identification (\&quot;Wert\&quot;) (e.g. A0MU9T) * UKCH - UK Company House Identifier(e.g.CE012494) * RSSD - Federal Reserve RSSD Identifier(1139297) * SEDOL* * CUSIP* * fsymEntityId - FactSet entity Id * fsymSecurityId - FactSet security level permanent identifier * fsymRegionalId - FactSet regional level permanent identifier * fsymListingId - FactSet listing level permanent identifier * ISIN* * tickerExchange * tickerRegion * bloombergFigi (output symbols: bloombergFigiListing, bloombergFigiRegional &amp; bloombergFigiSecurity ) * bloombergTicker (output symbols: bloombergRegionalTicker &amp; bloombergListingTicker) * GVKEY (Input only) * GVKEY &amp; IID (Input only) * JCN * LoanX (Input only) * Markit Red (Input only)  **These symbol types require additional subscriptions. If you would like to gain access to these symbol types, please contact your FactSet Account Team or \&quot;Report Issue\&quot; above and our support teams can assist.* 

### Example

```javascript
const { ApiClient, IdentifierResolutionApi } = require('@factset/sdk-symbology');
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

const apiInstance = new IdentifierResolutionApi();
const identifierResolutionRequest = new symbology.IdentifierResolutionRequest(); // IdentifierResolutionRequest | Request Body for Identifier Resolution.

// Call api endpoint
apiInstance.batchIdentifierResolution(identifierResolutionRequest).then(
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
 **identifierResolutionRequest** | [**IdentifierResolutionRequest**](IdentifierResolutionRequest.md)| Request Body for Identifier Resolution. | 

### Return type

[**IdentifierResolutionResponse**](IdentifierResolutionResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## identifierResolution

> IdentifierResolutionResponse identifierResolution(ids, inputSymbolType, outputSymbolTypes)

Returns the specified output identifiers for the specified input identifier.

The Identifier Resolution endpoint provides flexibility for requesting and receiving both third-party and FactSet Permanent identifiers. Users can both input and output most of the listed identifiers, with exceptions noted below.  All input and output symbols must be declared, and users have the ability to resolve one input symbol to many different output symbols in one request.  * BIC* - Bank Identification Code (e.g. ABXXHKH1) * CIK - Edgar Central Index Keys (e.g. 0000100331) * CRD - Central Registration Depository (e.g. 149722) * DUNS - Dun &amp; Bradstreet Data Universal Numbering System (e.g. 687741991) (Input only) * EIN - Employer Identification Number (e.g. 953540776) * FITCH* - Fitch Ratings Identifier (e.g. 47504) * LEI - Legal Entity Identifier (e.g. 549300A6K7JX8EX2QZ33) * MD* - Moody&#39;s Ratings Identifier (e.g. 0823736553) * SPR* - S&amp;P Ratings Identifier (e.g. 301939) * VALOREN - Valoren (\&quot;Valor\&quot;) Identification (e.g. 685558) (Input only) * WKN* - German Securities Identification (\&quot;Wert\&quot;) (e.g. A0MU9T) * UKCH - UK Company House Identifier(e.g.CE012494) * RSSD - Federal Reserve RSSD Identifier(1139297) * SEDOL* * CUSIP* * fsymEntityId - FactSet entity Id * fsymSecurityId - FactSet security level permanent identifier * fsymRegionalId - FactSet regional level permanent identifier * fsymListingId - FactSet listing level permanent identifier * ISIN* * tickerExchange * tickerRegion * bloombergFigi (output symbols: bloombergFigiListing, bloombergFigiRegional &amp; bloombergFigiSecurity ) * bloombergTicker (output symbols: bloombergRegionalTicker &amp; bloombergListingTicker) * GVKEY (Input only) * GVKEY &amp; IID (Input only) * JCN * LoanX (Input only) * Markit Red (Input only)  **These symbol types require additional subscriptions. If you would like to gain access to these symbol types, please contact your FactSet Account Team or \&quot;Report Issue\&quot; above and our support teams can assist.* 

### Example

```javascript
const { ApiClient, IdentifierResolutionApi } = require('@factset/sdk-symbology');
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

const apiInstance = new IdentifierResolutionApi();
const ids = ["GOOGL-US"]; // [String] | Requested security or entity identifiers. All requested identifiers must be of the same type. This request value is sent back in the response as, `requestId'. <p>***ids limit** =  3000 per request*</p>   *<p>NOTE:  GET Method URL request lines are also limited to a total   length of 8192 bytes (8KB). In cases where the service allows for thousands   of ids, which may lead to exceeding this request line limit of 8KB, its   advised for any requests with large request lines to be requested through   the respective \"POST\" method.</p>* 
const inputSymbolType = "'tickerRegion'"; // String | The type of symbol being inputted. Only one type of symbol is accepted with each request. 
const outputSymbolTypes = ["CUSIP","SEDOL"]; // [String] | The type of symbols being outputted. Multiple types of symbols can be outputted with each request. The user must be authorized for the requested identifier type.

// Call api endpoint
apiInstance.identifierResolution(ids, inputSymbolType, outputSymbolTypes).then(
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
 **ids** | [**[String]**](String.md)| Requested security or entity identifiers. All requested identifiers must be of the same type. This request value is sent back in the response as, &#x60;requestId&#39;. &lt;p&gt;***ids limit** &#x3D;  3000 per request*&lt;/p&gt;   *&lt;p&gt;NOTE:  GET Method URL request lines are also limited to a total   length of 8192 bytes (8KB). In cases where the service allows for thousands   of ids, which may lead to exceeding this request line limit of 8KB, its   advised for any requests with large request lines to be requested through   the respective \&quot;POST\&quot; method.&lt;/p&gt;*  | 
 **inputSymbolType** | **String**| The type of symbol being inputted. Only one type of symbol is accepted with each request.  | [default to &#39;tickerRegion&#39;]
 **outputSymbolTypes** | [**[String]**](String.md)| The type of symbols being outputted. Multiple types of symbols can be outputted with each request. The user must be authorized for the requested identifier type. | 

### Return type

[**IdentifierResolutionResponse**](IdentifierResolutionResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

