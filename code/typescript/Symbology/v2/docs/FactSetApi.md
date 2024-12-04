# symbology.FactSetApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**batchTranslateFactSet**](FactSetApi.md#batchTranslateFactSet) | **POST** /symbology/v2/factset | Translate market security symbols into FactSet Permanent Identifiers
[**batchTranslateFactSetAdvanced**](FactSetApi.md#batchTranslateFactSetAdvanced) | **POST** /symbology/v2/factset-advanced | Translate advanced symbol types into FactSet Permanent Identifiers
[**translateFactset**](FactSetApi.md#translateFactset) | **GET** /symbology/v2/factset | Translate market security symbols into FactSet Permanent Identifiers.
[**translateFactsetAdvanced**](FactSetApi.md#translateFactsetAdvanced) | **GET** /symbology/v2/factset-advanced | Translate advanced symbol types into FactSet Permanent Identifiers



## batchTranslateFactSet

> FactsetTranslationResponse batchTranslateFactSet(factsetTranslationRequest)

Translate market security symbols into FactSet Permanent Identifiers

Translate market security symbols into FactSet Permanent Security Identifiers. The permanent identifier provides a unique record key and a convenient way to link across content sets. Additionally, if your firm does not have licenses for the symbol systems (e.g., CUSIP, SEDOL, ISIN), the permanent identifier provides a way to deliver security and listing-level data.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, FactSetApi } = require('@factset/sdk-symbology');
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

const apiInstance = new FactSetApi();
const factsetTranslationRequest = new symbology.FactsetTranslationRequest(); // FactsetTranslationRequest | Request Body for FactSet Symbology Translation

// Call api endpoint
apiInstance.batchTranslateFactSet(factsetTranslationRequest).then(
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
 **factsetTranslationRequest** | [**FactsetTranslationRequest**](FactsetTranslationRequest.md)| Request Body for FactSet Symbology Translation | 

### Return type

[**FactsetTranslationResponse**](FactsetTranslationResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## batchTranslateFactSetAdvanced

> FactsetTranslationAdvancedResponse batchTranslateFactSetAdvanced(factsetTranslationAdvancedRequest)

Translate advanced symbol types into FactSet Permanent Identifiers

FactSet Advanced Symbology gives you enhanced resolution capabilities to translate a wider variety of input ids. Using the symbolType parameter, you are able to resolve from the below list of third-party identifier types into FactSet Permanent Identifiers. Any symbol types within this category MUST be declared by themselves to appropriately resolve.  * BIC - Bank Identification Code (e.g. ABXXHKH1) * CIK - Edgar Central Index Keys (e.g. 0000100331) * CRD - Central Registration Depository (e.g. 149722) * EIN - Employer Identification Number (e.g. 953540776) * FITCH - Fitch Ratings Identifier (e.g. 47504) * LEI - Legal Entity Identifier (e.g. 549300A6K7JX8EX2QZ33) * MD - Moody&#39;s Ratings Identifier (e.g. 0823736553) * SPR - S&amp;P Ratings Identifier (e.g. 301939) * VALOREN - Valoren (\&quot;Valor\&quot;) Identification (e.g. 685558) * WKN - German Securities Identification (\&quot;Wert\&quot;) (e.g. A0MU9T) * UKCH - UK Company House Identifier(e.g.CE012494) * RSSD -   Federal Reserve RSSD Identifier(1139297)    Not providing a symbolType will use FactSet Advanced Unknown logic, allowing you to resolve a mix of ids across various input id types and asset classes (Equities, Debt Instruments, Companies, Portfolios, Market Listings, and more). Input Id Types include -  * FactSet Ticker, Ticker-Region, Ticker-Exchange * FactSet Permanent Identifiers (-R, -S, -L, -E) * CUSIP * SEDOL * ISIN * Bloomberg FIGI - Regional/Security/Listing Level * Bloomberg Ticker - Regional/Listing Level 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, FactSetApi } = require('@factset/sdk-symbology');
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

const apiInstance = new FactSetApi();
const factsetTranslationAdvancedRequest = new symbology.FactsetTranslationAdvancedRequest(); // FactsetTranslationAdvancedRequest | Request Body for FactSet Symbology Translation

// Call api endpoint
apiInstance.batchTranslateFactSetAdvanced(factsetTranslationAdvancedRequest).then(
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
 **factsetTranslationAdvancedRequest** | [**FactsetTranslationAdvancedRequest**](FactsetTranslationAdvancedRequest.md)| Request Body for FactSet Symbology Translation | 

### Return type

[**FactsetTranslationAdvancedResponse**](FactsetTranslationAdvancedResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## translateFactset

> FactsetTranslationResponse translateFactset(ids)

Translate market security symbols into FactSet Permanent Identifiers.

Translate market security symbols into FactSet Permanent Security Identifiers. The permanent identifier provides a unique record key and a convenient way to link across content sets. Additionally, if your firm does not have licenses for the symbol systems (e.g., CUSIP, SEDOL, ISIN), the permanent identifier provides a way to deliver security and listing-level data. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, FactSetApi } = require('@factset/sdk-symbology');
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

const apiInstance = new FactSetApi();
const ids = ["GOOGL-US"]; // [String] | Requested market securities or entities. Accepted identifiers include all FactSet Permanent Identifiers types, CUSIP, SEDOL, ISIN, and Tickers. This request value is sent back in the response as, `requestId'. <p>***ids limit** =  3000 per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>*

// Call api endpoint
apiInstance.translateFactset(ids).then(
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

[**FactsetTranslationResponse**](FactsetTranslationResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## translateFactsetAdvanced

> FactsetTranslationAdvancedResponse translateFactsetAdvanced(ids, opts)

Translate advanced symbol types into FactSet Permanent Identifiers

FactSet Advanced Symbology gives you enhanced resolution capabilities to translate a wider variety of input ids. Using the symbolType parameter, you are able to resolve from the below list of third-party identifier types into FactSet Permanent Identifiers. Any symbol types within this category MUST be declared by themselves to appropriately resolve.  * BIC - Bank Identification Code (e.g. ABXXHKH1) * CIK - Edgar Central Index Keys (e.g. 0000100331) * CRD - Central Registration Depository (e.g. 149722) * EIN - Employer Identification Number (e.g. 953540776) * FITCH - Fitch Ratings Identifier (e.g. 47504) * LEI - Legal Entity Identifier (e.g. 549300A6K7JX8EX2QZ33) * MD - Moody&#39;s Ratings Identifier (e.g. 0823736553) * SPR - S&amp;P Ratings Identifier (e.g. 301939) * VALOREN - Valoren (\&quot;Valor\&quot;) Identification (e.g. 685558) * WKN - German Securities Identification (\&quot;Wert\&quot;) (e.g. A0MU9T) * UKCH - UK Company House Identifier(e.g.CE012494) * RSSD -   Federal Reserve RSSD Identifier(1139297)  Not providing a symbolType will use FactSet Advanced Unknown logic, allowing you to resolve a mix of ids across various input id types and asset classes (Equities, Debt Instruments, Companies, Portfolios, Market Listings, and more). Input Id Types include -  * FactSet Ticker, Ticker-Region, Ticker-Exchange * FactSet Permanent Identifiers (-R, -S, -L, -E) * CUSIP * SEDOL * ISIN * Bloomberg FIGI - Regional/Security/Listing Level * Bloomberg Ticker - Regional/Listing Level 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, FactSetApi } = require('@factset/sdk-symbology');
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

const apiInstance = new FactSetApi();
const ids = ["GOOGL-US"]; // [String] | Requested market securities or entities. Accepted identifiers include all identifiers in the list above. This request value is sent back in the response as ‘requestId’. <p>***ids limit** =  3000 per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>*
const opts = {
  'symbolType':  // String | Specifies the type of symbol being requested in the ids parameter. **This is only required when requesting to translate from the symbolTypes in the list below to a FactSet Permanent Identifier.  Only one symbolType is permitted per request, and all ids passed in request must be of the same type.** It is expected that not all fsym* types respond with values. Every response for valid translations will include at a minimum the fsymId and requestId.   |symbolType|Description|fsymId Default Perm Type|   |---|---|---|   |BIC|Bank Identification Codes|Entity (-E)|   |CIK|Edgar Central Index Key|Entity (-E)|   |CRD|Central Registration Depository|Entity (-E)|   |EIN|Employer Identification Number|Entity (-E)|   |FITCH|Fitch Ratings Identifier|Entity (-E)|   |LEI|Legal Entity Identifier|Entity (-E)|   |MD|Moody's Ratings Identifier|Entity (-E)|   |SPR|S&P Ratings Identifier|Entity (-E)|   |VALOREN|Valoren (\"Valor\") Identification|Security (-S)|   |WKN|German Securities Identification (\"Wert\")|Security (-S)|   |UKCH|UK Company House Identifier|Entity(-E)|   |RSSD|Federal Reserve RSSD Identifier|Entity(-E)| 
};

// Call api endpoint
apiInstance.translateFactsetAdvanced(ids, opts).then(
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
 **ids** | [**[String]**](String.md)| Requested market securities or entities. Accepted identifiers include all identifiers in the list above. This request value is sent back in the response as ‘requestId’. &lt;p&gt;***ids limit** &#x3D;  3000 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;* | 
 **symbolType** | **String**| Specifies the type of symbol being requested in the ids parameter. **This is only required when requesting to translate from the symbolTypes in the list below to a FactSet Permanent Identifier.  Only one symbolType is permitted per request, and all ids passed in request must be of the same type.** It is expected that not all fsym* types respond with values. Every response for valid translations will include at a minimum the fsymId and requestId.   |symbolType|Description|fsymId Default Perm Type|   |---|---|---|   |BIC|Bank Identification Codes|Entity (-E)|   |CIK|Edgar Central Index Key|Entity (-E)|   |CRD|Central Registration Depository|Entity (-E)|   |EIN|Employer Identification Number|Entity (-E)|   |FITCH|Fitch Ratings Identifier|Entity (-E)|   |LEI|Legal Entity Identifier|Entity (-E)|   |MD|Moody&#39;s Ratings Identifier|Entity (-E)|   |SPR|S&amp;P Ratings Identifier|Entity (-E)|   |VALOREN|Valoren (\&quot;Valor\&quot;) Identification|Security (-S)|   |WKN|German Securities Identification (\&quot;Wert\&quot;)|Security (-S)|   |UKCH|UK Company House Identifier|Entity(-E)|   |RSSD|Federal Reserve RSSD Identifier|Entity(-E)|  | [optional] [default to &#39;&#39;]

### Return type

[**FactsetTranslationAdvancedResponse**](FactsetTranslationAdvancedResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

