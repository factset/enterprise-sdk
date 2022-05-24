# factsettermsandconditions.TermsConditionsApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getTermsAndConditions**](TermsConditionsApi.md#getTermsAndConditions) | **GET** /factset-terms-and-conditions/v1/terms-and-conditions | Return select Terms and Conditions items for a Fixed Income security.
[**getTermsAndConditionsFields**](TermsConditionsApi.md#getTermsAndConditionsFields) | **GET** /factset-terms-and-conditions/v1/fields | Available fields for /terms-and-conditions endpoint
[**getTermsAndConditionsForList**](TermsConditionsApi.md#getTermsAndConditionsForList) | **POST** /factset-terms-and-conditions/v1/terms-and-conditions | Return Terms and Conditions for a list of Fixed Income securities.



## getTermsAndConditions

> TermsAndConditionsResponse getTermsAndConditions(ids, opts)

Return select Terms and Conditions items for a Fixed Income security.

Returns Terms and Conditions data items for the Fixed Income security. Includes items for Conditional Redemptions, Redemption Options, Security Details, and Coupon Details. Use the &#x60;fields&#x60; parameter to request specific items only or request an entire category of items to fetch all available fields matching that category(s). &lt;p&gt;*For T&amp;C data related to Agency, Coupon History, Issue Size, Negative Covenants, or Redemption Prices, Lead Underwriters, and Use of Proceeds, please use respective endpoints optimized for that content.*&lt;/p&gt; 

### Example

```javascript
const { ApiClient, TermsConditionsApi } = require('@factset/sdk-factsettermsandconditions');
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

const apiInstance = new TermsConditionsApi();
const ids = ["30231GBJ","88579EAA"]; // [String] | List of Fixed Income Security identifiers. Supported symbol types include CUSIP, SEDOL, ISIN, and FactSet Security Permanent Identifier (-S).  **ID LIMIT = 250** *per request*. 
const opts = {
  'fields': ["principalAmt","issueDesc","denomMin","maturityDate"], // [String] | List of data items for Terms and Conditions. For a full list of available fields, definitions, and category assignments, use the `/fields` endpoint.
  'categories': ["null"] // [String] | Selects the Fixed Income metrics by major category. Use the `/fields` endpoint to get a list of all fields associated with each category.   * **SECURITY_DETAILS** = Detailed information about the security.   * **COUPON_DETAILS** = Coupon details.   * **CONVERTIBLE_FEATURES** = Features of convertible instruments.   * **REDEMPTION_OPTIONS** = Redemption options. 
};

// Call api endpoint
apiInstance.getTermsAndConditions(ids, opts).then(
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
 **fields** | [**[String]**](String.md)| List of data items for Terms and Conditions. For a full list of available fields, definitions, and category assignments, use the &#x60;/fields&#x60; endpoint. | [optional] 
 **categories** | [**[String]**](String.md)| Selects the Fixed Income metrics by major category. Use the &#x60;/fields&#x60; endpoint to get a list of all fields associated with each category.   * **SECURITY_DETAILS** &#x3D; Detailed information about the security.   * **COUPON_DETAILS** &#x3D; Coupon details.   * **CONVERTIBLE_FEATURES** &#x3D; Features of convertible instruments.   * **REDEMPTION_OPTIONS** &#x3D; Redemption options.  | [optional] 

### Return type

[**TermsAndConditionsResponse**](TermsAndConditionsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getTermsAndConditionsFields

> FieldsResponse getTermsAndConditionsFields(opts)

Available fields for /terms-and-conditions endpoint

Returns a list of available fields that can be used in the &#x60;fields&#x60; parameter of the **_/terms-and-conditions** endpoint. Leave _category_ blank to request all available items. Make Note, this does not represent all available fields within the Terms and Conditions API and all other endpoints. 

### Example

```javascript
const { ApiClient, TermsConditionsApi } = require('@factset/sdk-factsettermsandconditions');
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

const apiInstance = new TermsConditionsApi();
const opts = {
  'category': "category_example" // String | Filters the list of Fixed Income metrics by major category -   * **SECURITY_DETAILS** = Detailed information about the security.   * **COUPON_DETAILS** = Coupon details.   * **CONVERTIBLE_FEATURES** = Features of convertible instruments.   * **REDEMPTION_OPTIONS** = Redemption options. 
};

// Call api endpoint
apiInstance.getTermsAndConditionsFields(opts).then(
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
 **category** | **String**| Filters the list of Fixed Income metrics by major category -   * **SECURITY_DETAILS** &#x3D; Detailed information about the security.   * **COUPON_DETAILS** &#x3D; Coupon details.   * **CONVERTIBLE_FEATURES** &#x3D; Features of convertible instruments.   * **REDEMPTION_OPTIONS** &#x3D; Redemption options.  | [optional] 

### Return type

[**FieldsResponse**](FieldsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getTermsAndConditionsForList

> TermsAndConditionsResponse getTermsAndConditionsForList(termsAndConditionsRequest)

Return Terms and Conditions for a list of Fixed Income securities.

Returns Terms and Conditions data items for the Fixed Income security. Includes reference items for Conditional Redemptions, Redemption Options, Security Details, Convertible Features, and Coupon Details. Use the &#x60;fields&#x60; parameter to request specific items only or request an entire category of items to fetch all available fields matching that category(s). &lt;p&gt;*For T&amp;C data related to Agency, Coupon History, Issue Size, Negative Covenants, or Redemption Prices, Lead Underwriters, and Use of Proceeds, please use respective endpoints optimized for that content.*&lt;/p&gt; 

### Example

```javascript
const { ApiClient, TermsConditionsApi } = require('@factset/sdk-factsettermsandconditions');
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

const apiInstance = new TermsConditionsApi();
const termsAndConditionsRequest = new factsettermsandconditions.TermsAndConditionsRequest(); // TermsAndConditionsRequest | Request object for Terms And Conditions

// Call api endpoint
apiInstance.getTermsAndConditionsForList(termsAndConditionsRequest).then(
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
 **termsAndConditionsRequest** | [**TermsAndConditionsRequest**](TermsAndConditionsRequest.md)| Request object for Terms And Conditions | 

### Return type

[**TermsAndConditionsResponse**](TermsAndConditionsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

