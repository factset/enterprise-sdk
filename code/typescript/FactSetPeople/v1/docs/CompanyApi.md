# factsetpeople.CompanyApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCompanyCompensation**](CompanyApi.md#getCompanyCompensation) | **GET** /factset-people/v1/company-compensation | Returns the compensation details of the people for the specified company identifier
[**getCompanyCompensationForList**](CompanyApi.md#getCompanyCompensationForList) | **POST** /factset-people/v1/company-compensation | Returns the compensation details for the people for the specified company identifier
[**getCompanyPeople**](CompanyApi.md#getCompanyPeople) | **GET** /factset-people/v1/company-people | Returns the list of people for the specified company identifiers
[**getCompanyPeopleForList**](CompanyApi.md#getCompanyPeopleForList) | **POST** /factset-people/v1/company-people | Returns the list of people associated for a large list of company identitifers
[**getCompanyPositions**](CompanyApi.md#getCompanyPositions) | **GET** /factset-people/v1/company-positions | Returns the list of people for the specified company identifiers and position
[**getCompanyPositionsForList**](CompanyApi.md#getCompanyPositionsForList) | **POST** /factset-people/v1/company-positions | Returns the list of people associated for a large list of company identitifers and position
[**getCompanyStats**](CompanyApi.md#getCompanyStats) | **GET** /factset-people/v1/company-stats | Returns statistics about top leadership of a company.
[**getCompanyStatsForList**](CompanyApi.md#getCompanyStatsForList) | **POST** /factset-people/v1/company-stats | Returns statistics about top leadership of a company.



## getCompanyCompensation

> CompanyCompensationResponse getCompanyCompensation(ids)

Returns the compensation details of the people for the specified company identifier

Returns the list of company-level executive compensation data items for the top executives listed in annual filings.The coverage of the compensation details for the executives are limited to US region. All the compensation figures are expressed in raw units.  

### Example

```javascript
const { ApiClient, CompanyApi } = require('@factset/sdk-factsetpeople');
const { ConfidentialClient } = require('@factset/sdk-utils');

const apiClient = ApiClient.instance;

// Examples for each supported authentication method are below,
// choose one that satisfies your use case.

// (Preferred) OAuth 2.0: FactSetOAuth2
// See https://github.com/FactSet/enterprise-sdk#oauth-20
// for information on how to create the app-config.json file
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
const ids = ["AAPL-US","IBM-US"]; // [String] | The requested company identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. <p>***ids limit** =  1000 per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>* 

// Call api endpoint
apiInstance.getCompanyCompensation(ids).then(
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
 **ids** | [**[String]**](String.md)| The requested company identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. &lt;p&gt;***ids limit** &#x3D;  1000 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;*  | 

### Return type

[**CompanyCompensationResponse**](CompanyCompensationResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getCompanyCompensationForList

> CompanyCompensationResponse getCompanyCompensationForList(companyCompensationRequest)

Returns the compensation details for the people for the specified company identifier

Returns the list of company-level executive compensation data items for the top executives listed in annual filings for the most recent fiscal year. The coverage of the compensation details for the executives are limited to US region. All the compensation figures are expressed in raw units.  

### Example

```javascript
const { ApiClient, CompanyApi } = require('@factset/sdk-factsetpeople');
const { ConfidentialClient } = require('@factset/sdk-utils');

const apiClient = ApiClient.instance;

// Examples for each supported authentication method are below,
// choose one that satisfies your use case.

// (Preferred) OAuth 2.0: FactSetOAuth2
// See https://github.com/FactSet/enterprise-sdk#oauth-20
// for information on how to create the app-config.json file
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
const companyCompensationRequest = new factsetpeople.CompanyCompensationRequest(); // CompanyCompensationRequest | 

// Call api endpoint
apiInstance.getCompanyCompensationForList(companyCompensationRequest).then(
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
 **companyCompensationRequest** | [**CompanyCompensationRequest**](CompanyCompensationRequest.md)|  | 

### Return type

[**CompanyCompensationResponse**](CompanyCompensationResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## getCompanyPeople

> CompanyPeopleResponse getCompanyPeople(ids, opts)

Returns the list of people for the specified company identifiers

Returns the list of executives associated the company identifier requested. Information includes the job functions, email, phone, title, name, and FactSet Entity Identifier. The personId returned can then be used in the &#x60;/profiles&#x60; endpoint to learn more about the given person. 

### Example

```javascript
const { ApiClient, CompanyApi } = require('@factset/sdk-factsetpeople');
const { ConfidentialClient } = require('@factset/sdk-utils');

const apiClient = ApiClient.instance;

// Examples for each supported authentication method are below,
// choose one that satisfies your use case.

// (Preferred) OAuth 2.0: FactSetOAuth2
// See https://github.com/FactSet/enterprise-sdk#oauth-20
// for information on how to create the app-config.json file
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
const ids = ["AAPL-US","IBM-US"]; // [String] | The requested company identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. <p>***ids limit** =  1000 per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>* 
const opts = {
  '_function': PEOPLE // String | Controls the types of people returned based on high-level job functions. Filter by -    |function|description|   |---|---|   |PEOPLE|Retrieve **ALL** Executives of a requested company|   |OFFICER|Retrieve only the Officers of a requested company|   |DIRECTOR|Retrieve only the Directors of a requested company| 
};

// Call api endpoint
apiInstance.getCompanyPeople(ids, opts).then(
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
 **ids** | [**[String]**](String.md)| The requested company identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. &lt;p&gt;***ids limit** &#x3D;  1000 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;*  | 
 **_function** | **String**| Controls the types of people returned based on high-level job functions. Filter by -    |function|description|   |---|---|   |PEOPLE|Retrieve **ALL** Executives of a requested company|   |OFFICER|Retrieve only the Officers of a requested company|   |DIRECTOR|Retrieve only the Directors of a requested company|  | [optional] [default to &#39;PEOPLE&#39;]

### Return type

[**CompanyPeopleResponse**](CompanyPeopleResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getCompanyPeopleForList

> CompanyPeopleResponse getCompanyPeopleForList(companyPeopleRequest)

Returns the list of people associated for a large list of company identitifers

Returns the list of executives associated the company identifier requested. Information includes the job functions, email, phone, title, name, and FactSet Entity Identifier. The personId returned can then be used in the /profiles endpoint to learn more about the given person. 

### Example

```javascript
const { ApiClient, CompanyApi } = require('@factset/sdk-factsetpeople');
const { ConfidentialClient } = require('@factset/sdk-utils');

const apiClient = ApiClient.instance;

// Examples for each supported authentication method are below,
// choose one that satisfies your use case.

// (Preferred) OAuth 2.0: FactSetOAuth2
// See https://github.com/FactSet/enterprise-sdk#oauth-20
// for information on how to create the app-config.json file
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
const companyPeopleRequest = new factsetpeople.CompanyPeopleRequest(); // CompanyPeopleRequest | 

// Call api endpoint
apiInstance.getCompanyPeopleForList(companyPeopleRequest).then(
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
 **companyPeopleRequest** | [**CompanyPeopleRequest**](CompanyPeopleRequest.md)|  | 

### Return type

[**CompanyPeopleResponse**](CompanyPeopleResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## getCompanyPositions

> CompanyPositionsResponse getCompanyPositions(ids, opts)

Returns the list of people for the specified company identifiers and position

Returns the list of people, name, and title for a list of company ids and requested position. Positions include-   * Chairman   * Chief Executive Officer   * President   * Chief Operating Officer   * Chief Financial Officer   * Chief Technology Officer   * Chief Investment Officer   * Founder(s)   * Compliance Officer   * Admin   * Independent Director   * Directors/Board Members   * Investor Relations   * Legal Counsel   * Treasurer   * Sales and Marketing Managers   * Human Resources 

### Example

```javascript
const { ApiClient, CompanyApi } = require('@factset/sdk-factsetpeople');
const { ConfidentialClient } = require('@factset/sdk-utils');

const apiClient = ApiClient.instance;

// Examples for each supported authentication method are below,
// choose one that satisfies your use case.

// (Preferred) OAuth 2.0: FactSetOAuth2
// See https://github.com/FactSet/enterprise-sdk#oauth-20
// for information on how to create the app-config.json file
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
const ids = ["AAPL-US","IBM-US"]; // [String] | The requested company identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. <p>***ids limit** =  1000 per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>* 
const opts = {
  'position': FOU // String | Controls the position details returned for the requested company. By default, the service returns the CEO name, title, and ID for the requested company ids.   |position|description|   |---|---|   |CHAIR|Chairman|   |CEO|Chief Executive Officer|   |PRES|President|   |COO|Chief Operating Officer|   |CFO|Chief Financial Officer|   |CTO|Chief Technology Officer|   |CIO|Chief Investment Officer|   |FOU|Founder(s)|   |CMP|Compliance Officer|   |ADM|Admin|   |IND|Independent Director|   |BRD|Directors/Board Members|   |IR|Investor Relations|   |LEG|Legal Counsel|   |TREAS|Treasurer|   |MKT|Sales and Marketing Managers|   |HR|Human Resources| 
};

// Call api endpoint
apiInstance.getCompanyPositions(ids, opts).then(
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
 **ids** | [**[String]**](String.md)| The requested company identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. &lt;p&gt;***ids limit** &#x3D;  1000 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;*  | 
 **position** | **String**| Controls the position details returned for the requested company. By default, the service returns the CEO name, title, and ID for the requested company ids.   |position|description|   |---|---|   |CHAIR|Chairman|   |CEO|Chief Executive Officer|   |PRES|President|   |COO|Chief Operating Officer|   |CFO|Chief Financial Officer|   |CTO|Chief Technology Officer|   |CIO|Chief Investment Officer|   |FOU|Founder(s)|   |CMP|Compliance Officer|   |ADM|Admin|   |IND|Independent Director|   |BRD|Directors/Board Members|   |IR|Investor Relations|   |LEG|Legal Counsel|   |TREAS|Treasurer|   |MKT|Sales and Marketing Managers|   |HR|Human Resources|  | [optional] [default to &#39;CEO&#39;]

### Return type

[**CompanyPositionsResponse**](CompanyPositionsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getCompanyPositionsForList

> CompanyPositionsResponse getCompanyPositionsForList(companyPositionsRequest)

Returns the list of people associated for a large list of company identitifers and position

Returns the list of people, name, and title for a list of company ids and requested position. Positions include-   * Chairman   * Chief Executive Officer   * President   * Chief Operating Officer   * Chief Financial Officer   * Chief Technology Officer   * Chief Investment Officer   * Founder(s)   * Compliance Officer   * Admin   * Independent Director   * Directors/Board Members   * Investor Relations   * Legal Counsel   * Treasurer   * Sales and Marketing Managers   * Human Resources 

### Example

```javascript
const { ApiClient, CompanyApi } = require('@factset/sdk-factsetpeople');
const { ConfidentialClient } = require('@factset/sdk-utils');

const apiClient = ApiClient.instance;

// Examples for each supported authentication method are below,
// choose one that satisfies your use case.

// (Preferred) OAuth 2.0: FactSetOAuth2
// See https://github.com/FactSet/enterprise-sdk#oauth-20
// for information on how to create the app-config.json file
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
const companyPositionsRequest = new factsetpeople.CompanyPositionsRequest(); // CompanyPositionsRequest | 

// Call api endpoint
apiInstance.getCompanyPositionsForList(companyPositionsRequest).then(
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
 **companyPositionsRequest** | [**CompanyPositionsRequest**](CompanyPositionsRequest.md)|  | 

### Return type

[**CompanyPositionsResponse**](CompanyPositionsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## getCompanyStats

> CompanyStatsResponse getCompanyStats(ids, opts)

Returns statistics about top leadership of a company.

Returns the statistics such as the average age, tenure, compensation of leadership, number of executives, and the gender diversity of leadership. We can utilize the data for analyzing a company&#39;s board and management. 

### Example

```javascript
const { ApiClient, CompanyApi } = require('@factset/sdk-factsetpeople');
const { ConfidentialClient } = require('@factset/sdk-utils');

const apiClient = ApiClient.instance;

// Examples for each supported authentication method are below,
// choose one that satisfies your use case.

// (Preferred) OAuth 2.0: FactSetOAuth2
// See https://github.com/FactSet/enterprise-sdk#oauth-20
// for information on how to create the app-config.json file
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
const ids = ["AAPL-US","IBM-US"]; // [String] | The requested company identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. <p>***ids limit** =  1000 per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>* 
const opts = {
  'mbType': "'MB'" // String | Search based on the management and board types. The types include -  |type|description| |---|---| |MB|Management & Board| |MGMT|Management| |BRD|Board| 
};

// Call api endpoint
apiInstance.getCompanyStats(ids, opts).then(
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
 **ids** | [**[String]**](String.md)| The requested company identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. &lt;p&gt;***ids limit** &#x3D;  1000 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;*  | 
 **mbType** | **String**| Search based on the management and board types. The types include -  |type|description| |---|---| |MB|Management &amp; Board| |MGMT|Management| |BRD|Board|  | [optional] [default to &#39;MB&#39;]

### Return type

[**CompanyStatsResponse**](CompanyStatsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getCompanyStatsForList

> CompanyStatsResponse getCompanyStatsForList(companyStatsRequest)

Returns statistics about top leadership of a company.

Returns the statistics such as the average age, tenure, compensation of leadership, number of executives, and the gender diversity of leadership. We can utilize the data for analyzing a company&#39;s board and management.  

### Example

```javascript
const { ApiClient, CompanyApi } = require('@factset/sdk-factsetpeople');
const { ConfidentialClient } = require('@factset/sdk-utils');

const apiClient = ApiClient.instance;

// Examples for each supported authentication method are below,
// choose one that satisfies your use case.

// (Preferred) OAuth 2.0: FactSetOAuth2
// See https://github.com/FactSet/enterprise-sdk#oauth-20
// for information on how to create the app-config.json file
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
const companyStatsRequest = new factsetpeople.CompanyStatsRequest(); // CompanyStatsRequest | 

// Call api endpoint
apiInstance.getCompanyStatsForList(companyStatsRequest).then(
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
 **companyStatsRequest** | [**CompanyStatsRequest**](CompanyStatsRequest.md)|  | 

### Return type

[**CompanyStatsResponse**](CompanyStatsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

