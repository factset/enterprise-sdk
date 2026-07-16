# factsetrbics.IndustryApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getRbicsIndustryFocus**](IndustryApi.md#getRbicsIndustryFocus) | **GET** /factset-rbics/v1/industry/focus | Get the list of companies with a specific RBICS Focus classification.
[**getRbicsIndustryFocusForList**](IndustryApi.md#getRbicsIndustryFocusForList) | **POST** /factset-rbics/v1/industry/focus | Get the list of companies with a specific Industry Focus classification.
[**getRbicsIndustryRevenue**](IndustryApi.md#getRbicsIndustryRevenue) | **GET** /factset-rbics/v1/industry/revenue | Get companies and their revenue exposure to a specific RBICS L6 Sub-Industry.
[**getRbicsIndustryRevenueForList**](IndustryApi.md#getRbicsIndustryRevenueForList) | **POST** /factset-rbics/v1/industry/revenue | Get companies and their revenue exposure to a specific RBICS L6 Sub-Industry.



## getRbicsIndustryFocus

> IndustryFocusResponse getRbicsIndustryFocus(rbicsIds, opts)

Get the list of companies with a specific RBICS Focus classification.

Identify all companies whose primary business falls within a specific RBICS industry. This endpoint screens your universe based on the RBICS Focus classification.   A company&#39;s Focus is the lowest-level (Level 6) RBICS sub-industry from which it derives 50% or more of its annual revenue.   Provide a list of one or more RBICS IDs (up to Level 6) to retrieve the list of companies whose primary business line falls within those sectors. A complete list of valid RBICS IDs can be retrieved using the &#x60;/structure&#x60; endpoints. Use the &#x60;startDate&#x60; and &#x60;endDate&#x60; parameters to screen for companies that held this classification during a specific historical period. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, IndustryApi } = require('@factset/sdk-factsetrbics');
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

const apiInstance = new IndustryApi();
const rbicsIds = ["101010000000","55"]; // [String] | A list of RBICS industry classification identifiers. These are used to filter the results to specific industries. IDs can range from Level 1 (Economy) to Level 6 (Sub-Industry). A complete list of valid RBICS IDs can be retrieved using the `/structure` endpoints. 
const opts = {
  'startDate': 2021-08-27, // Date | Specifies the start date for the requested date range, formatted as **YYYY-MM-DD**. The data returned will be reflective of the classifications or revenue data as of this date and forward. The `startDate` must be equal to or before the `endDate`. Future dates (T+1) are not accepted in this endpoint.  Note:  - If omitted while `endDate` is specified: Data will be fetched from the earliest available record up to the specified end date. - If both `startDate` and `endDate` are omitted: The response will return the latest available data. 
  'endDate': 2022-08-27 // Date | Specifies the end date for the requested date range, formatted as **YYYY-MM-DD**. The data returned will be reflective of the classifications or revenue data as of this date and earlier. The `endDate` must be equal to or after the `startDate`. Future dates (T+1) are not accepted in this endpoint.  Note: - If omitted (with `startDate` specified): Data will be returned from the specified start date up to the most recent available date. - If both `startDate` and `endDate` are omitted: The response will return the latest available data. 
};

// Call api endpoint
apiInstance.getRbicsIndustryFocus(rbicsIds, opts).then(
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
 **rbicsIds** | [**[String]**](String.md)| A list of RBICS industry classification identifiers. These are used to filter the results to specific industries. IDs can range from Level 1 (Economy) to Level 6 (Sub-Industry). A complete list of valid RBICS IDs can be retrieved using the &#x60;/structure&#x60; endpoints.  | 
 **startDate** | **Date**| Specifies the start date for the requested date range, formatted as **YYYY-MM-DD**. The data returned will be reflective of the classifications or revenue data as of this date and forward. The &#x60;startDate&#x60; must be equal to or before the &#x60;endDate&#x60;. Future dates (T+1) are not accepted in this endpoint.  Note:  - If omitted while &#x60;endDate&#x60; is specified: Data will be fetched from the earliest available record up to the specified end date. - If both &#x60;startDate&#x60; and &#x60;endDate&#x60; are omitted: The response will return the latest available data.  | [optional] 
 **endDate** | **Date**| Specifies the end date for the requested date range, formatted as **YYYY-MM-DD**. The data returned will be reflective of the classifications or revenue data as of this date and earlier. The &#x60;endDate&#x60; must be equal to or after the &#x60;startDate&#x60;. Future dates (T+1) are not accepted in this endpoint.  Note: - If omitted (with &#x60;startDate&#x60; specified): Data will be returned from the specified start date up to the most recent available date. - If both &#x60;startDate&#x60; and &#x60;endDate&#x60; are omitted: The response will return the latest available data.  | [optional] 

### Return type

[**IndustryFocusResponse**](IndustryFocusResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getRbicsIndustryFocusForList

> IndustryFocusResponse getRbicsIndustryFocusForList(industryRequest)

Get the list of companies with a specific Industry Focus classification.

Identify all companies whose primary business falls within a specific RBICS industry. This endpoint screens your universe based on the RBICS Focus classification.  A company&#39;s Focus is the lowest-level (Level 6) RBICS sub-industry from which it derives 50% or more of its annual revenue.  Provide a list of one or more RBICS IDs (up to Level 6) to retrieve the list of companies whose primary business line falls within those sectors. Use the &#x60;startDate&#x60; and &#x60;endDate&#x60; parameters to screen for companies that held this classification during a specific historical period. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, IndustryApi } = require('@factset/sdk-factsetrbics');
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

const apiInstance = new IndustryApi();
const industryRequest = new factsetrbics.IndustryRequest(); // IndustryRequest | Request Body to request a list of Industry Focus objects.

// Call api endpoint
apiInstance.getRbicsIndustryFocusForList(industryRequest).then(
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
 **industryRequest** | [**IndustryRequest**](IndustryRequest.md)| Request Body to request a list of Industry Focus objects. | 

### Return type

[**IndustryFocusResponse**](IndustryFocusResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## getRbicsIndustryRevenue

> IndustryRevenueResponse getRbicsIndustryRevenue(rbicsIds, opts)

Get companies and their revenue exposure to a specific RBICS L6 Sub-Industry.

Screen for companies with revenue exposure to a specific RBICS Level 6 Sub-Industry. This endpoint identifies all companies that derive revenue from a specified sub-industry and returns the percentage of their total revenue attributable to that industry. This is a powerful tool for understanding the competitive landscape and supply chains at a granular level, beyond a company&#39;s primary classification. **Note:** The &#x60;rbicsIds&#x60; parameter for this endpoint must be a valid Level 6 Sub-Industry ID. Use the &#x60;startDate&#x60; and &#x60;endDate&#x60; parameters to control the time period for the underlying revenue reports. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, IndustryApi } = require('@factset/sdk-factsetrbics');
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

const apiInstance = new IndustryApi();
const rbicsIds = ["551515453010"]; // [String] | List of RBICS Level 6 Sub-Industry IDs to screen for companies by revenue exposure. **Note:** Only Level 6 IDs are supported for this endpoint. A complete list of valid Level 6 IDs can be retrieved using the `/structure` endpoints. 
const opts = {
  'startDate': 2021-08-27, // Date | Specifies the start date for the requested date range, formatted as **YYYY-MM-DD**. The data returned will be reflective of the classifications or revenue data as of this date and forward. The `startDate` must be equal to or before the `endDate`. Future dates (T+1) are not accepted in this endpoint.  Note:  - If omitted while `endDate` is specified: Data will be fetched from the earliest available record up to the specified end date. - If both `startDate` and `endDate` are omitted: The response will return the latest available data. 
  'endDate': 2022-08-27 // Date | Specifies the end date for the requested date range, formatted as **YYYY-MM-DD**. The data returned will be reflective of the classifications or revenue data as of this date and earlier. The `endDate` must be equal to or after the `startDate`. Future dates (T+1) are not accepted in this endpoint.  Note: - If omitted (with `startDate` specified): Data will be returned from the specified start date up to the most recent available date. - If both `startDate` and `endDate` are omitted: The response will return the latest available data. 
};

// Call api endpoint
apiInstance.getRbicsIndustryRevenue(rbicsIds, opts).then(
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
 **rbicsIds** | [**[String]**](String.md)| List of RBICS Level 6 Sub-Industry IDs to screen for companies by revenue exposure. **Note:** Only Level 6 IDs are supported for this endpoint. A complete list of valid Level 6 IDs can be retrieved using the &#x60;/structure&#x60; endpoints.  | 
 **startDate** | **Date**| Specifies the start date for the requested date range, formatted as **YYYY-MM-DD**. The data returned will be reflective of the classifications or revenue data as of this date and forward. The &#x60;startDate&#x60; must be equal to or before the &#x60;endDate&#x60;. Future dates (T+1) are not accepted in this endpoint.  Note:  - If omitted while &#x60;endDate&#x60; is specified: Data will be fetched from the earliest available record up to the specified end date. - If both &#x60;startDate&#x60; and &#x60;endDate&#x60; are omitted: The response will return the latest available data.  | [optional] 
 **endDate** | **Date**| Specifies the end date for the requested date range, formatted as **YYYY-MM-DD**. The data returned will be reflective of the classifications or revenue data as of this date and earlier. The &#x60;endDate&#x60; must be equal to or after the &#x60;startDate&#x60;. Future dates (T+1) are not accepted in this endpoint.  Note: - If omitted (with &#x60;startDate&#x60; specified): Data will be returned from the specified start date up to the most recent available date. - If both &#x60;startDate&#x60; and &#x60;endDate&#x60; are omitted: The response will return the latest available data.  | [optional] 

### Return type

[**IndustryRevenueResponse**](IndustryRevenueResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getRbicsIndustryRevenueForList

> IndustryRevenueResponse getRbicsIndustryRevenueForList(industryRevenueRequest)

Get companies and their revenue exposure to a specific RBICS L6 Sub-Industry.

Screen for companies with revenue exposure to a specific RBICS Level 6 Sub-Industry. This endpoint identifies all companies that derive revenue from a specified sub-industry and returns the percentage of their total revenue attributable to that industry. This is a powerful tool for understanding the competitive landscape and supply chains at a granular level, beyond a company&#39;s primary classification. **Note:** The &#x60;rbicsIds&#x60; parameter for this endpoint must be a valid Level 6 Sub-Industry ID. Use the &#x60;startDate&#x60; and &#x60;endDate&#x60; parameters to control the time period for the underlying revenue reports. Use the POST method for large lists of &#x60;rbicsIds&#x60;. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, IndustryApi } = require('@factset/sdk-factsetrbics');
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

const apiInstance = new IndustryApi();
const industryRevenueRequest = new factsetrbics.IndustryRevenueRequest(); // IndustryRevenueRequest | Request Body to screen for companies with revenue exposure to a specific RBICS L6 Sub-Industry.

// Call api endpoint
apiInstance.getRbicsIndustryRevenueForList(industryRevenueRequest).then(
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
 **industryRevenueRequest** | [**IndustryRevenueRequest**](IndustryRevenueRequest.md)| Request Body to screen for companies with revenue exposure to a specific RBICS L6 Sub-Industry. | 

### Return type

[**IndustryRevenueResponse**](IndustryRevenueResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

