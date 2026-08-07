# factsetownership.CompanyReportsApi

All URIs are relative to *https://api.factset.com/content/factset-ownership/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getOwnershipCompanyReportsSummary**](CompanyReportsApi.md#getOwnershipCompanyReportsSummary) | **GET** /company-reports/summary | Get current only ownership summary data for a list of requested identifiers.
[**postOwnershipCompanyReportsSummary**](CompanyReportsApi.md#postOwnershipCompanyReportsSummary) | **POST** /company-reports/summary | Get current only ownership summary data for a list of requested identifiers.



## getOwnershipCompanyReportsSummary

> OwnershipSummaryResponse getOwnershipCompanyReportsSummary(ids, opts)

Get current only ownership summary data for a list of requested identifiers.

Get current only ownership summary data for a list of requested identifiers. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, CompanyReportsApi } = require('@factset/sdk-factsetownership');
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
const ids = ["TSLA-US"]; // [String] | Requested list of identifiers.  _**ids limit** = 10 per request_
const opts = {
  'batch': new factsetownership.Batch() // Batch | Enables the ability to asynchronously \"batch\" the request, supporting a long-running request for up to 20 minutes.  When `batch=Y`, the service will respond with an HTTP Status Code of 202.  Once a batch request is submitted, use batch status to see if the job has been completed.  Once completed, retrieve the results of the request via batch-result. When using Batch, ids     limit is increased to  1000 ids per request, though limits on query string via GET method still apply.  It's advised to submit large lists of ids via POST method. 
};

// Call api endpoint
apiInstance.getOwnershipCompanyReportsSummary(ids, opts).then(
  data => {

      // data is a responsewrapper: GetOwnershipCompanyReportsSummaryResponseWrapper
      switch (data.statusCode) {

          case 200:
             // OwnershipSummaryResponse
             console.log(data.getResponse200());
             break;

          case 202:
             // BatchStatusResponse
             console.log(data.getResponse202());
             break;

      }

  },
  error => {
    console.error(error);
  },
);

```


### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | [**[String]**](String.md)| Requested list of identifiers.  _**ids limit** &#x3D; 10 per request_ | 
 **batch** | [**Batch**](.md)| Enables the ability to asynchronously \&quot;batch\&quot; the request, supporting a long-running request for up to 20 minutes.  When &#x60;batch&#x3D;Y&#x60;, the service will respond with an HTTP Status Code of 202.  Once a batch request is submitted, use batch status to see if the job has been completed.  Once completed, retrieve the results of the request via batch-result. When using Batch, ids     limit is increased to  1000 ids per request, though limits on query string via GET method still apply.  It&#39;s advised to submit large lists of ids via POST method.  | [optional] 

### Return type

[**OwnershipSummaryResponse**](OwnershipSummaryResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## postOwnershipCompanyReportsSummary

> OwnershipSummaryResponse postOwnershipCompanyReportsSummary(ownershipSummaryRequest)

Get current only ownership summary data for a list of requested identifiers.

Get current only ownership summary data for a list of requested identifiers.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, CompanyReportsApi } = require('@factset/sdk-factsetownership');
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
const ownershipSummaryRequest = new factsetownership.OwnershipSummaryRequest(); // OwnershipSummaryRequest | Requesting Ownership Summary Details

// Call api endpoint
apiInstance.postOwnershipCompanyReportsSummary(ownershipSummaryRequest).then(
  data => {

      // data is a responsewrapper: PostOwnershipCompanyReportsSummaryResponseWrapper
      switch (data.statusCode) {

          case 200:
             // OwnershipSummaryResponse
             console.log(data.getResponse200());
             break;

          case 202:
             // BatchStatusResponse
             console.log(data.getResponse202());
             break;

      }

  },
  error => {
    console.error(error);
  },
);

```


### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ownershipSummaryRequest** | [**OwnershipSummaryRequest**](OwnershipSummaryRequest.md)| Requesting Ownership Summary Details | 

### Return type

[**OwnershipSummaryResponse**](OwnershipSummaryResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

