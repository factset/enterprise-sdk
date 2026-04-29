# companylogo.CompanyLogosApi

All URIs are relative to *https://api.factset.com/wealth/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**postCompanyLogo**](CompanyLogosApi.md#postCompanyLogo) | **POST** /company/logo | Retrieves logos for one or more publicly traded companies.



## postCompanyLogo

> InlineResponse200 postCompanyLogo(opts)

Retrieves logos for one or more publicly traded companies.

Retrieves high-quality logos for one or more publicly traded companies using standard identifiers (e.g., ticker symbols, ISIN). Logos are available in a selection of predefined sizes or can be generated on-the-fly to custom dimensions. The endpoint accepts up to 100 identifiers per request. Note: Requesting a large number of logos in a single call may result in increased response times.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, CompanyLogosApi } = require('@factset/sdk-companylogo');
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

const apiInstance = new CompanyLogosApi();
const opts = {
  'postCompanyLogoRequest': {"data":{"identifier":{"values":["FDS-US"],"type":"tickerRegion"},"format":"square","size":{"predefined":["small","medium","large","vector"]}}} // PostCompanyLogoRequest | Request Body
};

// Call api endpoint
apiInstance.postCompanyLogo(opts).then(
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
 **postCompanyLogoRequest** | [**PostCompanyLogoRequest**](PostCompanyLogoRequest.md)| Request Body | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

