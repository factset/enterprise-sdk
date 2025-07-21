# factsetprivatecompany.FinancialsApi

All URIs are relative to *https://api.factset.com/content/private-company/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getFinancials**](FinancialsApi.md#getFinancials) | **GET** /financials | Returns Private Company Financial Data.
[**getFinancialsForList**](FinancialsApi.md#getFinancialsForList) | **POST** /financials | Returns Private Company Financial Data.



## getFinancials

> FinancialsResponse getFinancials(ids, metrics, startDate, opts)

Returns Private Company Financial Data.

Retrieves Financial Data for specified Private Companies. Use the &#x60;&#x60;&#x60;/universe&#x60;&#x60;&#x60; endpoint to retrieve valid Private Company  identifiers. Use the &#x60;&#x60;&#x60;/metrics&#x60;&#x60;&#x60; endpoint to retrieve a full list of valid metrics or data items.  

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, FinancialsApi } = require('@factset/sdk-factsetprivatecompany');
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

const apiInstance = new FinancialsApi();
const ids = ["0H3R4Y-E"]; // [String] | The requested FactSet Private Company Entity Identifier in XXXXXX-E format.<br/><br/> *Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the  service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB,  it's advised for any requests with large request lines to be requested through the respective \\\"POST\\\" method.* 
const metrics = ["FPC_EBIT"]; // [String] | Requested list of Private Company Financial items 
const startDate = Mon Jan 01 00:00:00 UTC 2024; // Date | The start date requested for a given date range in YYYY-MM-DD format. <br/> Future dates (T+1) are not accepted in this endpoint. 
const opts = {
  'endDate': Tue Dec 31 00:00:00 UTC 2024 // Date | The end date requested for a given date range in YYYY-MM-DD format. If left blank, the API will default to previous close. <br/> Future dates (T+1) are not accepted in this endpoint. 
};

// Call api endpoint
apiInstance.getFinancials(ids, metrics, startDate, opts).then(
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
 **ids** | [**[String]**](String.md)| The requested FactSet Private Company Entity Identifier in XXXXXX-E format.&lt;br/&gt;&lt;br/&gt; *Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the  service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB,  it&#39;s advised for any requests with large request lines to be requested through the respective \\\&quot;POST\\\&quot; method.*  | 
 **metrics** | [**[String]**](String.md)| Requested list of Private Company Financial items  | 
 **startDate** | **Date**| The start date requested for a given date range in YYYY-MM-DD format. &lt;br/&gt; Future dates (T+1) are not accepted in this endpoint.  | 
 **endDate** | **Date**| The end date requested for a given date range in YYYY-MM-DD format. If left blank, the API will default to previous close. &lt;br/&gt; Future dates (T+1) are not accepted in this endpoint.  | [optional] 

### Return type

[**FinancialsResponse**](FinancialsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getFinancialsForList

> FinancialsResponse getFinancialsForList(financialsRequest)

Returns Private Company Financial Data.

Retrieves Financial Data for specified Private Companies. Use the &#x60;&#x60;&#x60;/universe&#x60;&#x60;&#x60; endpoint to retrieve valid Private Company  identifiers. Use the &#x60;&#x60;&#x60;/metrics&#x60;&#x60;&#x60; endpoint to retrieve a full list of valid metrics or data items.  

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, FinancialsApi } = require('@factset/sdk-factsetprivatecompany');
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

const apiInstance = new FinancialsApi();
const financialsRequest = new factsetprivatecompany.FinancialsRequest(); // FinancialsRequest | Request Body to request a list of Private Company financials objects.

// Call api endpoint
apiInstance.getFinancialsForList(financialsRequest).then(
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
 **financialsRequest** | [**FinancialsRequest**](FinancialsRequest.md)| Request Body to request a list of Private Company financials objects. | 

### Return type

[**FinancialsResponse**](FinancialsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

