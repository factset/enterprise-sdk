# factsetownership.SecurityHoldersApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getSecurityHolders**](SecurityHoldersApi.md#getSecurityHolders) | **GET** /factset-ownership/v1/security-holders | Get security ownership data for requested security identifers.
[**postSecurityHolders**](SecurityHoldersApi.md#postSecurityHolders) | **POST** /factset-ownership/v1/security-holders | Get security ownership data for a list of requested securities.



## getSecurityHolders

> SecurityHoldersResponse getSecurityHolders(ids, opts)

Get security ownership data for requested security identifers.

Gets security ownership details and activity for the requested security identifiers. The services allows filtering by \&quot;Topn\&quot; holders and by holder \&quot;type\&quot;, such as Institutions, Insiders, and Stakeholders. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, SecurityHoldersApi } = require('@factset/sdk-factsetownership');
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

const apiInstance = new SecurityHoldersApi();
const ids = ["FDS-US"]; // [String] | Requested list of security identifiers. <p>***ids limit** =  1 per request*</p>.
const opts = {
  'holderType': "'F'", // String | Controls the Holder Type of the data returned. By default, the service will return Institutional Holders. Requesting All Holders is not currently supported. Only a single Holder Type is allowed per request.   * **F** = Institutions   * **M** = Mutual Funds   * **S** =  Insiders/Stakeholders   * **FS** = Institutions/Insiders   * **B** = Beneficial Owners 
  'topn': 5, // String | Limits number of holdings or holders displayed by the top *n* securities based on positions Market Value. Default is ALL, otherwise use number to limit number.
  'date': 2019-12-31, // String | Date of holdings expressed in YYYY-MM-DD format. The fund-holdings endpoint will default to latest month-end close.
  'currency': USD // String | Currency code for adjusting prices. Default is Local. For a list of currency ISO codes, visit [Online Assistant Page 1470](https://oa.apps.factset.com/pages/1470).
};

// Call api endpoint
apiInstance.getSecurityHolders(ids, opts).then(
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
 **ids** | [**[String]**](String.md)| Requested list of security identifiers. &lt;p&gt;***ids limit** &#x3D;  1 per request*&lt;/p&gt;. | 
 **holderType** | **String**| Controls the Holder Type of the data returned. By default, the service will return Institutional Holders. Requesting All Holders is not currently supported. Only a single Holder Type is allowed per request.   * **F** &#x3D; Institutions   * **M** &#x3D; Mutual Funds   * **S** &#x3D;  Insiders/Stakeholders   * **FS** &#x3D; Institutions/Insiders   * **B** &#x3D; Beneficial Owners  | [optional] [default to &#39;F&#39;]
 **topn** | **String**| Limits number of holdings or holders displayed by the top *n* securities based on positions Market Value. Default is ALL, otherwise use number to limit number. | [optional] [default to &#39;ALL&#39;]
 **date** | **String**| Date of holdings expressed in YYYY-MM-DD format. The fund-holdings endpoint will default to latest month-end close. | [optional] 
 **currency** | **String**| Currency code for adjusting prices. Default is Local. For a list of currency ISO codes, visit [Online Assistant Page 1470](https://oa.apps.factset.com/pages/1470). | [optional] 

### Return type

[**SecurityHoldersResponse**](SecurityHoldersResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## postSecurityHolders

> SecurityHoldersResponse postSecurityHolders(securityHoldersRequest)

Get security ownership data for a list of requested securities.

Gets security ownership details and activity for the requested security identifiers. The services allows filtering by \&quot;Topn\&quot; holders and by holder \&quot;type\&quot;, such as Institutions, Insiders, and Stakeholders. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, SecurityHoldersApi } = require('@factset/sdk-factsetownership');
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

const apiInstance = new SecurityHoldersApi();
const securityHoldersRequest = new factsetownership.SecurityHoldersRequest(); // SecurityHoldersRequest | Requesting Security Holders for a list of Fund Identifiers.

// Call api endpoint
apiInstance.postSecurityHolders(securityHoldersRequest).then(
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
 **securityHoldersRequest** | [**SecurityHoldersRequest**](SecurityHoldersRequest.md)| Requesting Security Holders for a list of Fund Identifiers. | 

### Return type

[**SecurityHoldersResponse**](SecurityHoldersResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

