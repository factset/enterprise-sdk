# factsetbanks.MetricsApi

All URIs are relative to *https://api.factset.com/content/factset-banks/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getMetrics**](MetricsApi.md#getMetrics) | **GET** /metrics | Returns available metrics and their definitions



## getMetrics

> MetricsResponse getMetrics(opts)

Returns available metrics and their definitions

Returns list of available metrics that can be used in the metrics parameter of related endpoints.  Use this endpoint to discover available financial metrics, their definitions, and metadata. Filter by category and subcategory to narrow results.  **For methodology definitions**, reference the &#x60;oaPageId&#x60; or &#x60;oaUrl&#x60; response items to launch the available methodology page. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, MetricsApi } = require('@factset/sdk-factsetbanks');
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

const apiInstance = new MetricsApi();
const opts = {
  'searchText': return on assets, // String | Free-text search to filter metrics whose metric code or description contains the supplied text. Case-insensitive partial matching. 
  'category': "category_example", // String | Filter metrics by major category: - **FINANCIALS** - Financial statement data, demographics, and core institution identifiers (US, Canada, Australia, Credit Union, Industry, Specialty Finance). Endpoint: `/financials`, `/aum`, `/focus` - **FILINGS** - Regulatory filing data (10-D). Endpoint: `/ten-d` - **PERFORMANCE** - Uniform Bank Performance Report (UBPR) metrics. Endpoint: `/ubpr` - **EXPOSURE** - Country exposure data (Form 009a). Endpoint: `/country-exposure` 
  'subcategory': "subcategory_example", // String | Sub-category filter for the primary category: - **US** - United States regulatory financials. Endpoint: `/financials` - **CANADA** - Canadian OSFI regulatory financials. Endpoint: `/financials` - **AUSTRALIA** - Australian regulatory financials. Endpoint: `/financials` - **CREDIT_UNION** - Credit union financial data. Endpoint: `/financials` - **INDUSTRY** - Industry-level financial aggregates. Endpoint: `/financials` - **SPECIALTY_FINANCE** - Specialty finance industry data including FOCUS reports, Form ADV, and Business Development Corporations. Endpoint: `/aum`, `/focus` - **TEN_D** - Form 10-D securitization filings. Endpoint: `/ten-d` - **UBPR** - Uniform Bank Performance Report metrics. Endpoint: `/ubpr` - **COUNTRY** - Country exposure metrics. Endpoint: `/country-exposure` 
  'dataType': "dataType_example" // String | Filter by metric data type
};

// Call api endpoint
apiInstance.getMetrics(opts).then(
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
 **searchText** | **String**| Free-text search to filter metrics whose metric code or description contains the supplied text. Case-insensitive partial matching.  | [optional] 
 **category** | **String**| Filter metrics by major category: - **FINANCIALS** - Financial statement data, demographics, and core institution identifiers (US, Canada, Australia, Credit Union, Industry, Specialty Finance). Endpoint: &#x60;/financials&#x60;, &#x60;/aum&#x60;, &#x60;/focus&#x60; - **FILINGS** - Regulatory filing data (10-D). Endpoint: &#x60;/ten-d&#x60; - **PERFORMANCE** - Uniform Bank Performance Report (UBPR) metrics. Endpoint: &#x60;/ubpr&#x60; - **EXPOSURE** - Country exposure data (Form 009a). Endpoint: &#x60;/country-exposure&#x60;  | [optional] 
 **subcategory** | **String**| Sub-category filter for the primary category: - **US** - United States regulatory financials. Endpoint: &#x60;/financials&#x60; - **CANADA** - Canadian OSFI regulatory financials. Endpoint: &#x60;/financials&#x60; - **AUSTRALIA** - Australian regulatory financials. Endpoint: &#x60;/financials&#x60; - **CREDIT_UNION** - Credit union financial data. Endpoint: &#x60;/financials&#x60; - **INDUSTRY** - Industry-level financial aggregates. Endpoint: &#x60;/financials&#x60; - **SPECIALTY_FINANCE** - Specialty finance industry data including FOCUS reports, Form ADV, and Business Development Corporations. Endpoint: &#x60;/aum&#x60;, &#x60;/focus&#x60; - **TEN_D** - Form 10-D securitization filings. Endpoint: &#x60;/ten-d&#x60; - **UBPR** - Uniform Bank Performance Report metrics. Endpoint: &#x60;/ubpr&#x60; - **COUNTRY** - Country exposure metrics. Endpoint: &#x60;/country-exposure&#x60;  | [optional] 
 **dataType** | **String**| Filter by metric data type | [optional] 

### Return type

[**MetricsResponse**](MetricsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

