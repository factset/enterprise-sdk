# factsettermsandconditions.UnderwritersApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getLeadUnderwriters**](UnderwritersApi.md#getLeadUnderwriters) | **GET** /factset-terms-and-conditions/v1/lead-underwriters | Return Lead Underwriters for a Fixed Income security.
[**getLeadUnderwritersForList**](UnderwritersApi.md#getLeadUnderwritersForList) | **POST** /factset-terms-and-conditions/v1/lead-underwriters | Return Lead Underwriters for a list of Fixed Income securities.



## getLeadUnderwriters

> LeadUnderwritersResponse getLeadUnderwriters(ids)

Return Lead Underwriters for a Fixed Income security.

Returns Lead Underwriters for the Fixed Income security. 

### Example

```javascript
const { ApiClient, UnderwritersApi } = require('@factset/sdk-factsettermsandconditions');
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

const apiInstance = new UnderwritersApi();
const ids = ["30231GBJ","88579EAA"]; // [String] | List of Fixed Income Security identifiers. Supported symbol types include CUSIP, SEDOL, ISIN, and FactSet Security Permanent Identifier (-S).  **ID LIMIT = 250** *per request*. 

// Call api endpoint
apiInstance.getLeadUnderwriters(ids).then(
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

[**LeadUnderwritersResponse**](LeadUnderwritersResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getLeadUnderwritersForList

> LeadUnderwritersResponse getLeadUnderwritersForList(termsAndConditionsScalarRequest)

Return Lead Underwriters for a list of Fixed Income securities.

Returns Lead Underwriters for a list of Fixed Income securities. 

### Example

```javascript
const { ApiClient, UnderwritersApi } = require('@factset/sdk-factsettermsandconditions');
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

const apiInstance = new UnderwritersApi();
const termsAndConditionsScalarRequest = new factsettermsandconditions.TermsAndConditionsScalarRequest(); // TermsAndConditionsScalarRequest | Request object for Fixed Income Lead Underwriters.

// Call api endpoint
apiInstance.getLeadUnderwritersForList(termsAndConditionsScalarRequest).then(
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
 **termsAndConditionsScalarRequest** | [**TermsAndConditionsScalarRequest**](TermsAndConditionsScalarRequest.md)| Request object for Fixed Income Lead Underwriters. | 

### Return type

[**LeadUnderwritersResponse**](LeadUnderwritersResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

