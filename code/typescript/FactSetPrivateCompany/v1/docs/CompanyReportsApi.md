# factsetprivatecompany.CompanyReportsApi

All URIs are relative to *https://api.factset.com/content/private-company/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getFinancialsReport**](CompanyReportsApi.md#getFinancialsReport) | **GET** /company-reports/financial-statement | Returns Private Company Financial Data
[**getProfileReport**](CompanyReportsApi.md#getProfileReport) | **GET** /company-reports/profile | Returns Private Company Non-Periodic Data



## getFinancialsReport

> FinancialStatementsResponse getFinancialsReport(ids, statementType, opts)

Returns Private Company Financial Data

Returns financial data for specified private companies and statement type (income,  balance sheet, cash flow, and ratios) over an annual reporting period. &lt;br/&gt; Use the &#x60;&#x60;&#x60;/universe&#x60;&#x60;&#x60; endpoint to retrieve valid Private Company identifiers.&lt;br/&gt;&lt;br/&gt; **Note:** Due to variations in calculation time of average exchange rates, there may be some minor differences in the values of company report financial statement attributes if you are requesting for  a currency other than local, when compared to workstation. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, CompanyReportsApi } = require('@factset/sdk-factsetprivatecompany');
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

const apiInstance = new CompanyReportsApi();
const ids = ["0H3R4Y-E"]; // [String] | The requested list of Factset Private Company identifiers in XXXXXX-E format <p>***ids limit** =  50 per request*</p> 
const statementType = BS; // String | The type of financial statement being requested
const opts = {
  'currency': USD, // String | Currency code for currency values. For a list of currency ISO codes, visit Online Assistant Page [OA1470](https://my.apps.factset.com/oa/pages/1470).  Giving input as \"DOC\" would give the values in reporting currency for the requested ids. 
  'numberAnnualPeriods': 4 // Number | The number of annual periods for the returned data which will be displayed in descending order from most recent annual period for the number of annual periods specified. </br>Within range of 1 to 100. If not specified default will be 4.      
};

// Call api endpoint
apiInstance.getFinancialsReport(ids, statementType, opts).then(
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
 **ids** | [**[String]**](String.md)| The requested list of Factset Private Company identifiers in XXXXXX-E format &lt;p&gt;***ids limit** &#x3D;  50 per request*&lt;/p&gt;  | 
 **statementType** | **String**| The type of financial statement being requested | 
 **currency** | **String**| Currency code for currency values. For a list of currency ISO codes, visit Online Assistant Page [OA1470](https://my.apps.factset.com/oa/pages/1470).  Giving input as \&quot;DOC\&quot; would give the values in reporting currency for the requested ids.  | [optional] [default to &#39;LOCAL&#39;]
 **numberAnnualPeriods** | **Number**| The number of annual periods for the returned data which will be displayed in descending order from most recent annual period for the number of annual periods specified. &lt;/br&gt;Within range of 1 to 100. If not specified default will be 4.       | [optional] [default to 4]

### Return type

[**FinancialStatementsResponse**](FinancialStatementsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getProfileReport

> ProfileResponse getProfileReport(ids)

Returns Private Company Non-Periodic Data

Retrieves a comprehensive overview of key non-periodic details and information for a  specified list of identifiers. All values provided in the response are absolute. &lt;br/&gt; Use the &#x60;&#x60;&#x60;/universe&#x60;&#x60;&#x60; endpoint to retrieve valid Private Company identifiers.&lt;br/&gt; 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, CompanyReportsApi } = require('@factset/sdk-factsetprivatecompany');
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

const apiInstance = new CompanyReportsApi();
const ids = ["0H3R4Y-E"]; // [String] | The requested list of Factset Private Company identifiers in XXXXXX-E format <p>***ids limit** =  50 per request*</p> 

// Call api endpoint
apiInstance.getProfileReport(ids).then(
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
 **ids** | [**[String]**](String.md)| The requested list of Factset Private Company identifiers in XXXXXX-E format &lt;p&gt;***ids limit** &#x3D;  50 per request*&lt;/p&gt;  | 

### Return type

[**ProfileResponse**](ProfileResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

