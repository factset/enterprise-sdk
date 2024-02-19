# classifications.GICSApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getGics**](GICSApi.md#getGics) | **GET** /classifications/v1/gics | Gets the GICS Direct Classifications
[**postGics**](GICSApi.md#postGics) | **POST** /classifications/v1/gics | Returns the GICS classifications for the requested &#39;ids&#39; and date range.



## getGics

> GicsResponse getGics(ids, opts)

Gets the GICS Direct Classifications

Gets the **Global Industry Classification Standard (\&quot;GICS\&quot;)** Sectors, Industry Group, Industry, and Sub-Industry Names and Numbers for a requested list of ids and date range. All economic sectors have a two-digit identification code, all industry groups have a four-digit identification code, all industries have a six-digit identification code, and all sub-industries have an eight-digit identification code. To access the complete GICS structure and definitions, visit the [MSCI GICS](https://www.msci.com/gics) or [S&amp;P GICS](https://www.spglobal.com/spdji/en/landing/topic/gics/) home pages. Coverage includes over 37,000 securities. *Licensing for GICS Classifications, Regions, and History is required in addition to FactSet API license. Reach out to your FactSet Account Team for assistance.* 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, GICSApi } = require('@factset/sdk-classifications');
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

const apiInstance = new GICSApi();
const ids = ["null"]; // [String] | The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent Ids. <p>***ids limit** =  1000 per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>* 
const opts = {
  'startDate': "startDate_example", // String | Requested start date expressed in YYYY-MM-DD format.
  'endDate': "endDate_example", // String | Requested End Date for Range expressed in YYYY-MM-DD format.
  'frequency': "'M'", // String | Controls the display frequency of the data returned.   * **D** = Daily   * **W** = Weekly, based on the last day of the week of the start date.   * **M** = Monthly, based on the last trading day of the month.   * **AM** = Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16 etc.).   * **CQ** = Quarterly based on the last trading day of the calendar quarter (March, June, September, or December).   * **AY** = Actual Annual, based on the start date.   * **CY** = Calendar Annual, based on the last trading day of the calendar year. 
  'calendar': "'FIVEDAY'" // String | Calendar of data returned. SEVENDAY includes weekends.
};

// Call api endpoint
apiInstance.getGics(ids, opts).then(
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
 **ids** | [**[String]**](String.md)| The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent Ids. &lt;p&gt;***ids limit** &#x3D;  1000 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;*  | 
 **startDate** | **String**| Requested start date expressed in YYYY-MM-DD format. | [optional] 
 **endDate** | **String**| Requested End Date for Range expressed in YYYY-MM-DD format. | [optional] 
 **frequency** | **String**| Controls the display frequency of the data returned.   * **D** &#x3D; Daily   * **W** &#x3D; Weekly, based on the last day of the week of the start date.   * **M** &#x3D; Monthly, based on the last trading day of the month.   * **AM** &#x3D; Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16 etc.).   * **CQ** &#x3D; Quarterly based on the last trading day of the calendar quarter (March, June, September, or December).   * **AY** &#x3D; Actual Annual, based on the start date.   * **CY** &#x3D; Calendar Annual, based on the last trading day of the calendar year.  | [optional] [default to &#39;M&#39;]
 **calendar** | **String**| Calendar of data returned. SEVENDAY includes weekends. | [optional] [default to &#39;FIVEDAY&#39;]

### Return type

[**GicsResponse**](GicsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## postGics

> GicsResponse postGics(gicsRequest)

Returns the GICS classifications for the requested &#39;ids&#39; and date range.

Gets the **Global Industry Classification Standard (\&quot;GICS\&quot;)** Sectors, Industry Group, Industry, and Sub-Industry Names and Numbers for a requested list of ids and date range. All economic sectors have a two-digit identification code, all industry groups have a four-digit identification code, all industries have a six-digit identification code, and all sub-industries have an eight-digit identification code. To access the complete GICS structure and definitions, visit the [MSCI GICS](https://www.msci.com/gics) or [S&amp;P GICS](https://www.spglobal.com/spdji/en/landing/topic/gics/) home pages. Coverage includes over 37,000 securities. *Licensing for GICS Classifications, Regions, and History is required in addition to FactSet API license. Reach out to your FactSet Account Team for assistance.* 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, GICSApi } = require('@factset/sdk-classifications');
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

const apiInstance = new GICSApi();
const gicsRequest = new classifications.GicsRequest(); // GicsRequest | Requests GICS Classifications for the given identifier and date range.

// Call api endpoint
apiInstance.postGics(gicsRequest).then(
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
 **gicsRequest** | [**GicsRequest**](GicsRequest.md)| Requests GICS Classifications for the given identifier and date range. | 

### Return type

[**GicsResponse**](GicsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

