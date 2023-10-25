# factsettermsandconditions.ConvertiblesApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getConvertibleDetails**](ConvertiblesApi.md#getConvertibleDetails) | **GET** /factset-terms-and-conditions/v1/convertible-details | Return Convertible Details for a list of Convertible Fixed Income securities.
[**getConvertibleDetailsForList**](ConvertiblesApi.md#getConvertibleDetailsForList) | **POST** /factset-terms-and-conditions/v1/convertible-details | Return Convertible Details data for a large list of Fixed Income securities.
[**getConvertibleHistory**](ConvertiblesApi.md#getConvertibleHistory) | **GET** /factset-terms-and-conditions/v1/convertible-history | Return Convertible History data for a list of Fixed Income securities.
[**getConvertibleHistoryForList**](ConvertiblesApi.md#getConvertibleHistoryForList) | **POST** /factset-terms-and-conditions/v1/convertible-history | Return Convertible History data for a large list of Fixed Income securities.
[**getConvertibleTriggers**](ConvertiblesApi.md#getConvertibleTriggers) | **GET** /factset-terms-and-conditions/v1/convertible-triggers | Return Convertible Triggers data for a list of Fixed Income securities.
[**getConvertibleTriggersForList**](ConvertiblesApi.md#getConvertibleTriggersForList) | **POST** /factset-terms-and-conditions/v1/convertible-triggers | Return Convertible Trigger data for a large list of Fixed Income securities.



## getConvertibleDetails

> ConvertibleDetailsResponse getConvertibleDetails(ids)

Return Convertible Details for a list of Convertible Fixed Income securities.

Returns Convertible Details for a list of securities, such as -   * Convertible Currency   * Convertible Effective Date   * Convertible Notice Days Max and Min   * Convertible Payment Form   * Convertible Payment Details   * Convertible Payment Form Election   * Convertible Price Method   * Convertible Type   * Convertibles Ratio   * More 

### Example

```javascript
const { ApiClient, ConvertiblesApi } = require('@factset/sdk-factsettermsandconditions');
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

const apiInstance = new ConvertiblesApi();
const ids = ["30231GBJ","88579EAA"]; // [String] | List of Fixed Income Security identifiers. Supported symbol types include CUSIP, SEDOL, ISIN, and FactSet Security Permanent Identifier (-S).  **ID LIMIT = 250** *per request*. 

// Call api endpoint
apiInstance.getConvertibleDetails(ids).then(
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
 **ids** | [**[String]**](String.md)| List of Fixed Income Security identifiers. Supported symbol types include CUSIP, SEDOL, ISIN, and FactSet Security Permanent Identifier (-S).  **ID LIMIT &#x3D; 250** *per request*.  | 

### Return type

[**ConvertibleDetailsResponse**](ConvertibleDetailsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getConvertibleDetailsForList

> ConvertibleDetailsResponse getConvertibleDetailsForList(termsAndConditionsScalarRequest)

Return Convertible Details data for a large list of Fixed Income securities.

Returns Convertible Details for a list of securities, such as -   * Convertible Currency   * Convertible Effective Date   * Convertible Notice Days Max and Min   * Convertible Payment Form   * Convertible Payment Details   * Convertible Payment Form Election   * Convertible Price Method   * Convertible Type   * Convertibles Ratio   * More 

### Example

```javascript
const { ApiClient, ConvertiblesApi } = require('@factset/sdk-factsettermsandconditions');
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

const apiInstance = new ConvertiblesApi();
const termsAndConditionsScalarRequest = new factsettermsandconditions.TermsAndConditionsScalarRequest(); // TermsAndConditionsScalarRequest | Request object for Fixed Income Convertible Details.

// Call api endpoint
apiInstance.getConvertibleDetailsForList(termsAndConditionsScalarRequest).then(
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
 **termsAndConditionsScalarRequest** | [**TermsAndConditionsScalarRequest**](TermsAndConditionsScalarRequest.md)| Request object for Fixed Income Convertible Details. | 

### Return type

[**ConvertibleDetailsResponse**](ConvertibleDetailsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## getConvertibleHistory

> ConvertibleHistoryResponse getConvertibleHistory(ids)

Return Convertible History data for a list of Fixed Income securities.

Returns Convertible History data for the Fixed Income security, including - * Convertibles Price * Convertibles Effective Date 

### Example

```javascript
const { ApiClient, ConvertiblesApi } = require('@factset/sdk-factsettermsandconditions');
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

const apiInstance = new ConvertiblesApi();
const ids = ["30231GBJ","88579EAA"]; // [String] | List of Fixed Income Security identifiers. Supported symbol types include CUSIP, SEDOL, ISIN, and FactSet Security Permanent Identifier (-S).  **ID LIMIT = 250** *per request*. 

// Call api endpoint
apiInstance.getConvertibleHistory(ids).then(
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
 **ids** | [**[String]**](String.md)| List of Fixed Income Security identifiers. Supported symbol types include CUSIP, SEDOL, ISIN, and FactSet Security Permanent Identifier (-S).  **ID LIMIT &#x3D; 250** *per request*.  | 

### Return type

[**ConvertibleHistoryResponse**](ConvertibleHistoryResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getConvertibleHistoryForList

> ConvertibleHistoryResponse getConvertibleHistoryForList(termsAndConditionsScalarRequest)

Return Convertible History data for a large list of Fixed Income securities.

Returns Convertible History data for a list of Fixed Income securities. 

### Example

```javascript
const { ApiClient, ConvertiblesApi } = require('@factset/sdk-factsettermsandconditions');
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

const apiInstance = new ConvertiblesApi();
const termsAndConditionsScalarRequest = new factsettermsandconditions.TermsAndConditionsScalarRequest(); // TermsAndConditionsScalarRequest | Request object for Fixed Income Issue Size.

// Call api endpoint
apiInstance.getConvertibleHistoryForList(termsAndConditionsScalarRequest).then(
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
 **termsAndConditionsScalarRequest** | [**TermsAndConditionsScalarRequest**](TermsAndConditionsScalarRequest.md)| Request object for Fixed Income Issue Size. | 

### Return type

[**ConvertibleHistoryResponse**](ConvertibleHistoryResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## getConvertibleTriggers

> ConvertibleTriggersResponse getConvertibleTriggers(ids)

Return Convertible Triggers data for a list of Fixed Income securities.

Returns Convertible Triggers data for the Fixed Income security including the Convertible Trigger Id, Event, and Description. 

### Example

```javascript
const { ApiClient, ConvertiblesApi } = require('@factset/sdk-factsettermsandconditions');
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

const apiInstance = new ConvertiblesApi();
const ids = ["30231GBJ","88579EAA"]; // [String] | List of Fixed Income Security identifiers. Supported symbol types include CUSIP, SEDOL, ISIN, and FactSet Security Permanent Identifier (-S).  **ID LIMIT = 250** *per request*. 

// Call api endpoint
apiInstance.getConvertibleTriggers(ids).then(
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
 **ids** | [**[String]**](String.md)| List of Fixed Income Security identifiers. Supported symbol types include CUSIP, SEDOL, ISIN, and FactSet Security Permanent Identifier (-S).  **ID LIMIT &#x3D; 250** *per request*.  | 

### Return type

[**ConvertibleTriggersResponse**](ConvertibleTriggersResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getConvertibleTriggersForList

> ConvertibleTriggersResponse getConvertibleTriggersForList(termsAndConditionsScalarRequest)

Return Convertible Trigger data for a large list of Fixed Income securities.

Returns Convertible Triggers data for the Fixed Income security including the Convertible Trigger Id, Event, and Description. 

### Example

```javascript
const { ApiClient, ConvertiblesApi } = require('@factset/sdk-factsettermsandconditions');
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

const apiInstance = new ConvertiblesApi();
const termsAndConditionsScalarRequest = new factsettermsandconditions.TermsAndConditionsScalarRequest(); // TermsAndConditionsScalarRequest | Request object for Fixed Income Issue Size.

// Call api endpoint
apiInstance.getConvertibleTriggersForList(termsAndConditionsScalarRequest).then(
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
 **termsAndConditionsScalarRequest** | [**TermsAndConditionsScalarRequest**](TermsAndConditionsScalarRequest.md)| Request object for Fixed Income Issue Size. | 

### Return type

[**ConvertibleTriggersResponse**](ConvertibleTriggersResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

