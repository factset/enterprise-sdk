# securitymodeling.SecurityModelingApi

All URIs are relative to *https://api.factset.com/analytics/security-modeling/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteSecurities**](SecurityModelingApi.md#deleteSecurities) | **POST** /securities/delete | Delete existing securities
[**getFields**](SecurityModelingApi.md#getFields) | **GET** /securities/{securityType}/fields | Get security type fields
[**getSecurities**](SecurityModelingApi.md#getSecurities) | **POST** /securities/retrieve | Get existing securities
[**smGetRequestResultById**](SecurityModelingApi.md#smGetRequestResultById) | **GET** /securities/{jobId}/result | Get SM upsert or delete result by id
[**smGetUpsertStatusById**](SecurityModelingApi.md#smGetUpsertStatusById) | **GET** /securities/{jobId}/status | Get SM upsert or delete status by id
[**upsertSecurities**](SecurityModelingApi.md#upsertSecurities) | **POST** /securities/upsert | Create or update securities



## deleteSecurities

> RequestStatusRoot deleteSecurities(opts)

Delete existing securities

This endpoint allows you to permanently remove previously saved securities and their associated terms and conditions from your modeling data on the FactSet side. This endpoint is useful when a security was created in error, is no longer needed, or must be cleared before re-modeling with new terms.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, SecurityModelingApi } = require('@factset/sdk-securitymodeling');
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

const apiInstance = new SecurityModelingApi();
const opts = {
  'sMDeleteParametersRoot': {"data":[{"securityName":"Bond_Security","location":"Client","asofdate":"20250101","securityType":"BOND"}]} // SMDeleteParametersRoot | 
};

// Call api endpoint
apiInstance.deleteSecurities(opts).then(
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
 **sMDeleteParametersRoot** | [**SMDeleteParametersRoot**](SMDeleteParametersRoot.md)|  | [optional] 

### Return type

[**RequestStatusRoot**](RequestStatusRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## getFields

> SMTemplateFieldPropertiesRoot getFields(securityType)

Get security type fields

This endpoint allows you to retrieve the complete list of fields supported for modeling a security based on its security type. Each field returned in this endpoint includes rich metadata designed to help you understand how to correctly populate terms and conditions for the Upsert workflow.    **Security Type mappings for the &#x60;sectype&#x60; parameter:**    | Security Type                | Sectype needed for templates |   |-----------------------------|------------------------------|   | Bond                        | BOND                         |   | Bank Loan Facility          | BLF                          |   | Mortgage Backed Security    | MBS                          |   | Multi-Legged Bond           | MLB                          |   | Custom Cash Flow            | CCF                          |   | Tender Option Bond          | TOB                          |   | Bond Forward                | BFW                          |   | Bond Option/Lock            | BOPT                         |   | Cross Currency Swap         | CCS                          |   | Inflation Swap              | ISWP                         |   | Interest Rate Cap/Floor     | IRCF                         |   | CMS Rate Cap/Floor          | CRCF                         |   | CMS Spread Cap/Floor        | CSCF                         |   | Vanilla Interest Rate Swap  | VIRS                         |   | Swaption                   | SWP                          |   | Credit Default Swap         | CDS                          |   | CDS Index Option            | CDSW                         |   | Currency Forward            | CFW                          |   | Total Return Swap           | TRS                          |   | Option                      | OPT                          |   | Variance Swap               | VSWP                         |   | Fund                        | PE                           |   | Real Estate                 | RE                           | 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, SecurityModelingApi } = require('@factset/sdk-securitymodeling');
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

const apiInstance = new SecurityModelingApi();
const securityType = "securityType_example"; // String | Security Type

// Call api endpoint
apiInstance.getFields(securityType).then(
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
 **securityType** | **String**| Security Type | 

### Return type

[**SMTemplateFieldPropertiesRoot**](SMTemplateFieldPropertiesRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getSecurities

> SMRetrieveResponseRoot getSecurities(opts)

Get existing securities

This endpoint allows you to fetch the terms and conditions for securities that have already been saved and exist on the FactSet side of your modeling data. It is designed for scenarios where you need to review or validate the details of securities that were previously created or modeled.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, SecurityModelingApi } = require('@factset/sdk-securitymodeling');
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

const apiInstance = new SecurityModelingApi();
const opts = {
  'sMRetrieveParametersRoot': {"data":[{"securityName":"SECURITY_BOND","location":"CLIENT","asofdate":"19000101","securityType":"BOND"}]} // SMRetrieveParametersRoot | 
};

// Call api endpoint
apiInstance.getSecurities(opts).then(
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
 **sMRetrieveParametersRoot** | [**SMRetrieveParametersRoot**](SMRetrieveParametersRoot.md)|  | [optional] 

### Return type

[**SMRetrieveResponseRoot**](SMRetrieveResponseRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## smGetRequestResultById

> SMCreateResponseRoot smGetRequestResultById(jobId)

Get SM upsert or delete result by id

This is the endpoint to get the result of a previously requested upsert/delete.  If the process has completed, the body of the response will contain the requested results in JSON.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, SecurityModelingApi } = require('@factset/sdk-securitymodeling');
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

const apiInstance = new SecurityModelingApi();
const jobId = "jobId_example"; // String | from url, provided from the location header in the Get SM upsert status by id endpoint

// Call api endpoint
apiInstance.smGetRequestResultById(jobId).then(
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
 **jobId** | **String**| from url, provided from the location header in the Get SM upsert status by id endpoint | 

### Return type

[**SMCreateResponseRoot**](SMCreateResponseRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## smGetUpsertStatusById

> RequestStatusRoot smGetUpsertStatusById(jobId)

Get SM upsert or delete status by id

This is the endpoint to check on the progress of a previously requested upsert or delete.  If the process has completed, the location header will point to the result url.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, SecurityModelingApi } = require('@factset/sdk-securitymodeling');
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

const apiInstance = new SecurityModelingApi();
const jobId = "jobId_example"; // String | from url, provided from the location header in the Create and Run SM upsert/delete endpoint

// Call api endpoint
apiInstance.smGetUpsertStatusById(jobId).then(
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
 **jobId** | **String**| from url, provided from the location header in the Create and Run SM upsert/delete endpoint | 

### Return type

[**RequestStatusRoot**](RequestStatusRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## upsertSecurities

> RequestStatusRoot upsertSecurities(opts)

Create or update securities

This endpoint enables you to model new securities or modify existing securities by supplying the appropriate terms and conditions.    To determine which fields are required for a successful save, you can use the fields endpoint to retrieve the supported fields based on the security type you wish to model.    It can take up to 1200 securities.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, SecurityModelingApi } = require('@factset/sdk-securitymodeling');
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

const apiInstance = new SecurityModelingApi();
const opts = {
  'sMCreateParametersRoot': {"data":[{"securityName":"SECUIRTY_CCF","fields":{"ParAmt":"1.000","CashFlowAmounts":["100"],"CashFlowDates":["20220101"]}}]} // SMCreateParametersRoot | 
};

// Call api endpoint
apiInstance.upsertSecurities(opts).then(
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
 **sMCreateParametersRoot** | [**SMCreateParametersRoot**](SMCreateParametersRoot.md)|  | [optional] 

### Return type

[**RequestStatusRoot**](RequestStatusRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

