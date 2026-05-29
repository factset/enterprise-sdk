# factsetprivateequityandventurecapital.GeneralAndLimitedPartnersApi

All URIs are relative to *https://api.factset.com/content/factset-pevc/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getFundLimitedPartners**](GeneralAndLimitedPartnersApi.md#getFundLimitedPartners) | **GET** /limited-partners/funds | Retrieve the Limited Partners (LPs) and their capital commitments to specific funds.
[**getGP**](GeneralAndLimitedPartnersApi.md#getGP) | **GET** /general-partners | Retrieve core profile and summary data for specified General Partner (GP) firms.
[**getGPFunds**](GeneralAndLimitedPartnersApi.md#getGPFunds) | **GET** /general-partners/funds | Retrieve the list of all Private Equity and Venture Capital Funds managed by specified General Partners.



## getFundLimitedPartners

> FundLimitedPartnersResponse getFundLimitedPartners(ids)

Retrieve the Limited Partners (LPs) and their capital commitments to specific funds.

Returns a list of **Limited Partners** (investors) associated with the specified funds, along with details of their **capital commitments** (investment amounts) and the **commit date**. This data is essential for understanding a fund&#39;s LP base.  Use the &#x60;/universe&#x60; endpoint and input the fund&#39;s name, setting the &#x60;entityType&#x60; to the most appropriate type (e.g., VEN, FAF, PVF).

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, GeneralAndLimitedPartnersApi } = require('@factset/sdk-factsetprivateequityandventurecapital');
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

const apiInstance = new GeneralAndLimitedPartnersApi();
const ids = ["001JYM-E","005GEM-E"]; // [String] | A list of FactSet Permanent Entity Identifiers (FactSet IDs) for **Private Equity and Venture Capital Funds**. These IDs are in the format 'XXXXXX-E' and are the primary input for most fund-related endpoints. These IDs can be retrieved from the /universe endpoint

// Call api endpoint
apiInstance.getFundLimitedPartners(ids).then(
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
 **ids** | [**[String]**](String.md)| A list of FactSet Permanent Entity Identifiers (FactSet IDs) for **Private Equity and Venture Capital Funds**. These IDs are in the format &#39;XXXXXX-E&#39; and are the primary input for most fund-related endpoints. These IDs can be retrieved from the /universe endpoint | 

### Return type

[**FundLimitedPartnersResponse**](FundLimitedPartnersResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getGP

> GPDetailsResponse getGP(ids, opts)

Retrieve core profile and summary data for specified General Partner (GP) firms.

Retrieves the primary descriptive and profile information for one or more General Partner firms. This includes firm-level details such as the **Asset Under Management (AUM)** and a high-level overview of their **investment strategy** (e.g., target industry, geography).  Use the &#x60;/universe&#x60; endpoint and input the GP firm name, with &#x60;entityType&#x60; set to &#x60;HOL&#x60;. Only use &#x60;entityId&#x60; values whose &#x60;entityTypeCode&#x60; is &#x60;HOL&#x60; in your request.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, GeneralAndLimitedPartnersApi } = require('@factset/sdk-factsetprivateequityandventurecapital');
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

const apiInstance = new GeneralAndLimitedPartnersApi();
const ids = ["000BKX-E","000KCYH-E"]; // [String] | A list of FactSet Permanent Entity Identifiers (FactSet IDs) for **General Partner (GP) firms**. These IDs are used to identify the management companies of the funds.
const opts = {
  'asOfDate': 2023-08-27 // Date | The as-of date for the AUM data in **YYYY-MM-DD** format. Returns the AUM value as of the specified date.  Note:  - If omitted: The response will return the latest available AUM data. - Future dates (T+1) are not accepted in this endpoint. 
};

// Call api endpoint
apiInstance.getGP(ids, opts).then(
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
 **ids** | [**[String]**](String.md)| A list of FactSet Permanent Entity Identifiers (FactSet IDs) for **General Partner (GP) firms**. These IDs are used to identify the management companies of the funds. | 
 **asOfDate** | **Date**| The as-of date for the AUM data in **YYYY-MM-DD** format. Returns the AUM value as of the specified date.  Note:  - If omitted: The response will return the latest available AUM data. - Future dates (T+1) are not accepted in this endpoint.  | [optional] 

### Return type

[**GPDetailsResponse**](GPDetailsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getGPFunds

> GPFundsResponse getGPFunds(ids)

Retrieve the list of all Private Equity and Venture Capital Funds managed by specified General Partners.

Returns a list of all Private Equity and Venture Capital funds that are actively or historically managed by the specified General Partner firms. This provides a complete view of a GP&#39;s fund vintage and strategy history.  Use the &#x60;/universe&#x60; endpoint and input the GP firm name, with &#x60;entityType&#x60; set to &#x60;HOL&#x60;. Only use &#x60;entityId&#x60; values whose &#x60;entityTypeCode&#x60; is &#x60;HOL&#x60; in your request.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, GeneralAndLimitedPartnersApi } = require('@factset/sdk-factsetprivateequityandventurecapital');
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

const apiInstance = new GeneralAndLimitedPartnersApi();
const ids = ["000BKX-E","000KCYH-E"]; // [String] | A list of FactSet Permanent Entity Identifiers (FactSet IDs) for **General Partner (GP) firms**. These IDs are used to identify the management companies of the funds.

// Call api endpoint
apiInstance.getGPFunds(ids).then(
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
 **ids** | [**[String]**](String.md)| A list of FactSet Permanent Entity Identifiers (FactSet IDs) for **General Partner (GP) firms**. These IDs are used to identify the management companies of the funds. | 

### Return type

[**GPFundsResponse**](GPFundsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

