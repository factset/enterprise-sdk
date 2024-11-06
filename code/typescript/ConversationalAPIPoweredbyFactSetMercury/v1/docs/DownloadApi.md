# conversationalapipoweredbyfactsetmercury.DownloadApi

All URIs are relative to *https://api.factset.com/conversational/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**downloadFile**](DownloadApi.md#downloadFile) | **POST** /download/file | Retrieve data file based on file ID.



## downloadFile

> File downloadFile(fileDownloadRequest)

Retrieve data file based on file ID.

If your response from the &#x60;/result&#x60; endpoint contains a file ID within a NextStep Download action, you can retrieve the file using this endpoint.  Files are available for download for 24 hours after generation.  Returns a downloadable Excel .xlsx file referenced in the NextStep action returned from the &#x60;/result&#x60; endpoint.  Any of the following content can be embedded into a downloadable Excel file: * ActiveGraph * ExcelChart * STACH Table (as Excel) 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, DownloadApi } = require('@factset/sdk-conversationalapipoweredbyfactsetmercury');
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

const apiInstance = new DownloadApi();
const fileDownloadRequest = {"data":{"fileId":"9c1031c2-5463-47ae-81b3-126a68f0c2a6"}}; // FileDownloadRequest | ID refers to the file ID in the NextStep action returned from the `/result` endpoint

// Call api endpoint
apiInstance.downloadFile(fileDownloadRequest).then(
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
 **fileDownloadRequest** | [**FileDownloadRequest**](FileDownloadRequest.md)| ID refers to the file ID in the NextStep action returned from the &#x60;/result&#x60; endpoint | 

### Return type

**File**

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/vnd.openxmlformats-officedocument.spreadsheetml.sheet, application/json, text/plain

