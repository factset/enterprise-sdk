# companylogo.CompanyApi

All URIs are relative to *https://api.factset.com/wealth/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCompanyLogoGet**](CompanyApi.md#getCompanyLogoGet) | **GET** /company/logo/get | List of URLs of company logos.



## getCompanyLogoGet

> InlineResponse200 getCompanyLogoGet(identifier, identifierType, opts)

List of URLs of company logos.

List of URLs for transparent company logos in different sizes and formats.   The different sizes for the rectangular and square formats are:    **Small**:  * rectangular:  maximum width of 88 pixels and maximum height of 31 pixels.  * square:  31 x 31 pixels.    **Medium**: small logo scaled up by 200%.   **Large**: small logo scaled up by 300%.   **Vector**: can be rendered at any size.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, CompanyApi } = require('@factset/sdk-companylogo');
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

const apiInstance = new CompanyApi();
const identifier = FDS-US; // String | Identifier to resolve.
const identifierType = tickerRegion; // String | Type of the identifier. | Value | Description | | --- | --- | | idInstrument | MDG identifier of an instrument. | | idNotation | MDG identifier of a listing. | | fdsPermanentIdentifierSecurity | FactSet Permanent Identifier on security level. | | fdsPermanentIdentifierListing | FactSet Permanent Identifier on listing level. | | fdsPermanentIdentifierRegional | Regional FactSet Permanent Identifier. | | tickerExchange | FactSet market symbol of a listing. | | tickerRegion | Regional FactSet ticker symbol. | | sedol | SEDOL or IDII of a listing. | | isin | ISIN of an instrument. | | wkn | WKN of an instrument. | | valor | Valor number of an instrument. | | cusip | CUSIP or CINS identifier of an instrument |  
const opts = {
  'format': rectangular, // String | Format of the logos. | Value | Description | | --- | --- | | rectangular | Logos in rectangular format | | square | Logos in square format |  
  'attributes': ["null"] // [String] | Limit the attributes returned in the response to the specified set.
};

// Call api endpoint
apiInstance.getCompanyLogoGet(identifier, identifierType, opts).then(
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
 **identifier** | **String**| Identifier to resolve. | 
 **identifierType** | **String**| Type of the identifier. | Value | Description | | --- | --- | | idInstrument | MDG identifier of an instrument. | | idNotation | MDG identifier of a listing. | | fdsPermanentIdentifierSecurity | FactSet Permanent Identifier on security level. | | fdsPermanentIdentifierListing | FactSet Permanent Identifier on listing level. | | fdsPermanentIdentifierRegional | Regional FactSet Permanent Identifier. | | tickerExchange | FactSet market symbol of a listing. | | tickerRegion | Regional FactSet ticker symbol. | | sedol | SEDOL or IDII of a listing. | | isin | ISIN of an instrument. | | wkn | WKN of an instrument. | | valor | Valor number of an instrument. | | cusip | CUSIP or CINS identifier of an instrument |   | 
 **format** | **String**| Format of the logos. | Value | Description | | --- | --- | | rectangular | Logos in rectangular format | | square | Logos in square format |   | [optional] [default to &#39;rectangular&#39;]
 **attributes** | [**[String]**](String.md)| Limit the attributes returned in the response to the specified set. | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

