# factsetdebtcapitalstructure.DetailsApi

All URIs are relative to *https://api.factset.com/content/factset-dcs/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDetailsList**](DetailsApi.md#getDetailsList) | **POST** /details | Returns debt instruments for a list of companies.
[**getDetailsSummary**](DetailsApi.md#getDetailsSummary) | **GET** /details-summary | Returns debt instrument totals details for specified list of companies.
[**getInterimDetailsList**](DetailsApi.md#getInterimDetailsList) | **POST** /details-interim | Returns most recently available debt instrument data for a list of companies.



## getDetailsList

> DetailsResponse getDetailsList(detailsRequest)

Returns debt instruments for a list of companies.

Gets instruments of varying types such as Revolving Credit, Term Loans, ST Debt Total, Notes/Bonds, and Other. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, DetailsApi } = require('@factset/sdk-factsetdebtcapitalstructure');
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

const apiInstance = new DetailsApi();
const detailsRequest = new factsetdebtcapitalstructure.DetailsRequest(); // DetailsRequest | Request object for `Details`.

// Call api endpoint
apiInstance.getDetailsList(detailsRequest).then(
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
 **detailsRequest** | [**DetailsRequest**](DetailsRequest.md)| Request object for &#x60;Details&#x60;. | 

### Return type

[**DetailsResponse**](DetailsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## getDetailsSummary

> DetailsSummaryResponse getDetailsSummary(ids, periodicity, startDate, opts)

Returns debt instrument totals details for specified list of companies.

Gets totals for instruments of varying types such as Revolving Credit, Term Loans,  ST Debt Total, Notes/Bonds, and Other.  

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, DetailsApi } = require('@factset/sdk-factsetdebtcapitalstructure');
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

const apiInstance = new DetailsApi();
const ids = ["IBM-US"]; // [String] | The requested list of security identifiers. Accepted ID types include Market Tickers,  SEDOL, ISINs, CUSIPs, or FactSet Permanent Ids.  
const periodicity = ANN; // String | Periodicity or frequency of the fiscal periods, where   * **ANN**  = Annual Original,   * **QTR**  = Quarterly 
const startDate = 2024-01-01; // Date | The date of the period requested in YYYY-MM-DD format.  Future dates (T+1) are not accepted in this endpoint. 
const opts = {
  'currency': USD // String | Currency code for currency values. For a list of currency ISO codes, visit Online Assistant Page [OA1470](https://my.apps.factset.com/oa/pages/1470). 
};

// Call api endpoint
apiInstance.getDetailsSummary(ids, periodicity, startDate, opts).then(
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
 **ids** | [**[String]**](String.md)| The requested list of security identifiers. Accepted ID types include Market Tickers,  SEDOL, ISINs, CUSIPs, or FactSet Permanent Ids.   | 
 **periodicity** | **String**| Periodicity or frequency of the fiscal periods, where   * **ANN**  &#x3D; Annual Original,   * **QTR**  &#x3D; Quarterly  | 
 **startDate** | **Date**| The date of the period requested in YYYY-MM-DD format.  Future dates (T+1) are not accepted in this endpoint.  | 
 **currency** | **String**| Currency code for currency values. For a list of currency ISO codes, visit Online Assistant Page [OA1470](https://my.apps.factset.com/oa/pages/1470).  | [optional] [default to &#39;LOCAL&#39;]

### Return type

[**DetailsSummaryResponse**](DetailsSummaryResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getInterimDetailsList

> DetailsResponse getInterimDetailsList(interimDetailsRequest)

Returns most recently available debt instrument data for a list of companies.

Gets instruments of varying types such as Revolving Credit, Term Loans, ST Debt Total, Notes/Bonds, and Other. The data returned by this endpoint is for the interim period and only returns the most recently available value. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, DetailsApi } = require('@factset/sdk-factsetdebtcapitalstructure');
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

const apiInstance = new DetailsApi();
const interimDetailsRequest = new factsetdebtcapitalstructure.InterimDetailsRequest(); // InterimDetailsRequest | Request object for `Details`.

// Call api endpoint
apiInstance.getInterimDetailsList(interimDetailsRequest).then(
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
 **interimDetailsRequest** | [**InterimDetailsRequest**](InterimDetailsRequest.md)| Request object for &#x60;Details&#x60;. | 

### Return type

[**DetailsResponse**](DetailsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

