# stocksapifordigitalportals.CompanyApi

All URIs are relative to *https://api.factset.com/wealth/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCompanyBoardListByInstrument**](CompanyApi.md#getCompanyBoardListByInstrument) | **GET** /company/board/listByInstrument | List of boards for a company, with their officers.
[**getCompanyBoardOfficerFunctionDeliveryList**](CompanyApi.md#getCompanyBoardOfficerFunctionDeliveryList) | **GET** /company/board/officer/function/delivery/list | List of officer functions as provided by a delivery.
[**getCompanyBoardTypeList**](CompanyApi.md#getCompanyBoardTypeList) | **GET** /company/board/type/list | List of company board types.
[**postCompanyEstimatesListByInstrument**](CompanyApi.md#postCompanyEstimatesListByInstrument) | **POST** /company/estimates/listByInstrument | Estimates for selected figures for a stock.
[**postCompanyKeyItemsCurrentGetByInstrument**](CompanyApi.md#postCompanyKeyItemsCurrentGetByInstrument) | **POST** /company/keyItems/current/getByInstrument | Fundamentals for a stock with potentially daily updates.
[**postCompanyKeyItemsFiscalYearListByInstrument**](CompanyApi.md#postCompanyKeyItemsFiscalYearListByInstrument) | **POST** /company/keyItems/fiscalYear/listByInstrument | Selected fundamentals for a stock with values as of the end of a fiscal year.



## getCompanyBoardListByInstrument

> InlineResponse2005 getCompanyBoardListByInstrument(id, opts)

List of boards for a company, with their officers.

List of boards for a company, with their officers. A given person may be a member ofdifferent boards of the same company but also a member of boards of different companies.

### Example

```javascript
const { ApiClient, CompanyApi } = require('@factset/sdk-stocksapifordigitalportals');
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
const id = "id_example"; // String | 
const opts = {
  'attributes': ["null"], // [String] | Limit the attributes returned in the response to the specified set.
  'language': "language_example" // String | 
};

// Call api endpoint
apiInstance.getCompanyBoardListByInstrument(id, opts).then(
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
 **id** | **String**|  | 
 **attributes** | [**[String]**](String.md)| Limit the attributes returned in the response to the specified set. | [optional] 
 **language** | **String**|  | [optional] 

### Return type

[**InlineResponse2005**](InlineResponse2005.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getCompanyBoardOfficerFunctionDeliveryList

> InlineResponse2006 getCompanyBoardOfficerFunctionDeliveryList(opts)

List of officer functions as provided by a delivery.

List of officer functions as provided by a delivery.

### Example

```javascript
const { ApiClient, CompanyApi } = require('@factset/sdk-stocksapifordigitalportals');
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
const opts = {
  'attributes': ["null"], // [String] | Limit the attributes returned in the response to the specified set.
  'language': "language_example" // String | 
};

// Call api endpoint
apiInstance.getCompanyBoardOfficerFunctionDeliveryList(opts).then(
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
 **attributes** | [**[String]**](String.md)| Limit the attributes returned in the response to the specified set. | [optional] 
 **language** | **String**|  | [optional] 

### Return type

[**InlineResponse2006**](InlineResponse2006.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getCompanyBoardTypeList

> InlineResponse2007 getCompanyBoardTypeList(opts)

List of company board types.

List of company board types.

### Example

```javascript
const { ApiClient, CompanyApi } = require('@factset/sdk-stocksapifordigitalportals');
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
const opts = {
  'attributes': ["null"], // [String] | Limit the attributes returned in the response to the specified set.
  'language': "language_example" // String | 
};

// Call api endpoint
apiInstance.getCompanyBoardTypeList(opts).then(
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
 **attributes** | [**[String]**](String.md)| Limit the attributes returned in the response to the specified set. | [optional] 
 **language** | **String**|  | [optional] 

### Return type

[**InlineResponse2007**](InlineResponse2007.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## postCompanyEstimatesListByInstrument

> InlineResponse2002 postCompanyEstimatesListByInstrument(opts)

Estimates for selected figures for a stock.

Fiscal year estimates for selected figures of a stock. Data is available only for common shares; instruments such as preferred shares or depository receipts yield an empty result. For the share type, see endpoint &#x60;/instrument/category/list&#x60; using dataset 23. Data can be retrieved only for the current, the past, and three future fiscal years. For past fiscal years, the estimates are not being replaced by the reported figures. Since a fiscal year and a calendar year do not necessarily match with regard to their start and end dates, the year is derived as the calendar year occupied to a larger extent by the fiscal year, using a June through May fiscal year assignment. That means, fiscal years ending from the 1st of June onwards are assigned to the same calendar year. Dates are interpreted in the timezone of the location of the head office of the company.

### Example

```javascript
const { ApiClient, CompanyApi } = require('@factset/sdk-stocksapifordigitalportals');
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
const opts = {
  'postCompanyEstimatesListByInstrumentRequest': new stocksapifordigitalportals.PostCompanyEstimatesListByInstrumentRequest() // PostCompanyEstimatesListByInstrumentRequest | 
};

// Call api endpoint
apiInstance.postCompanyEstimatesListByInstrument(opts).then(
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
 **postCompanyEstimatesListByInstrumentRequest** | [**PostCompanyEstimatesListByInstrumentRequest**](PostCompanyEstimatesListByInstrumentRequest.md)|  | [optional] 

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## postCompanyKeyItemsCurrentGetByInstrument

> InlineResponse200 postCompanyKeyItemsCurrentGetByInstrument(opts)

Fundamentals for a stock with potentially daily updates.

Fundamentals for a stock with potentially daily updates; any other instrument yields empty values for stock-specific attributes. The price used to calculate the various price-dependent figures is unspecified and the exchange for that price is not identified. Dates are interpreted in the timezone of the data provider. For reported company fundamentals of the previous fiscal years (only closed fiscal years) see endpoint &#x60;/company/keyItems/fiscalYear/listByInstrument.&#x60;

### Example

```javascript
const { ApiClient, CompanyApi } = require('@factset/sdk-stocksapifordigitalportals');
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
const opts = {
  'postCompanyKeyItemsCurrentGetByInstrumentRequest': new stocksapifordigitalportals.PostCompanyKeyItemsCurrentGetByInstrumentRequest() // PostCompanyKeyItemsCurrentGetByInstrumentRequest | 
};

// Call api endpoint
apiInstance.postCompanyKeyItemsCurrentGetByInstrument(opts).then(
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
 **postCompanyKeyItemsCurrentGetByInstrumentRequest** | [**PostCompanyKeyItemsCurrentGetByInstrumentRequest**](PostCompanyKeyItemsCurrentGetByInstrumentRequest.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## postCompanyKeyItemsFiscalYearListByInstrument

> InlineResponse2001 postCompanyKeyItemsFiscalYearListByInstrument(opts)

Selected fundamentals for a stock with values as of the end of a fiscal year.

Selected fundamentals for a stock with values as of the end of a fiscal year; any other instrument yields empty values for stock-specific attributes. The endpoint allows the retrieval of data only for specified fiscal years by using the start and end properties. Since a fiscal year and a calendar year do not necessarily match with regard to their start and end dates, the year is derived as the calendar year occupied to a larger extent by the fiscal year, using a June through May fiscal year assignment. That means, fiscal years ending from the 1st of June onwards are assigned to the same calendar year. Dates are interpreted in the timezone of the location of the head office of the company.

### Example

```javascript
const { ApiClient, CompanyApi } = require('@factset/sdk-stocksapifordigitalportals');
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
const opts = {
  'postCompanyKeyItemsFiscalYearListByInstrumentRequest': new stocksapifordigitalportals.PostCompanyKeyItemsFiscalYearListByInstrumentRequest() // PostCompanyKeyItemsFiscalYearListByInstrumentRequest | 
};

// Call api endpoint
apiInstance.postCompanyKeyItemsFiscalYearListByInstrument(opts).then(
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
 **postCompanyKeyItemsFiscalYearListByInstrumentRequest** | [**PostCompanyKeyItemsFiscalYearListByInstrumentRequest**](PostCompanyKeyItemsFiscalYearListByInstrumentRequest.md)|  | [optional] 

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

