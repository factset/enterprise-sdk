# openfactsetpartnersdocuments.ScriptsAsiaApi

All URIs are relative to *https://api.factset.com/bulk-documents/ofm/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getScriptsAsiaFiles**](ScriptsAsiaApi.md#getScriptsAsiaFiles) | **GET** /scripts-asia/transcripts | Returns the daily files from Open:FactSet Partner - Scripts Asia.



## getScriptsAsiaFiles

> ScriptsAsiaResponse getScriptsAsiaFiles(opts)

Returns the daily files from Open:FactSet Partner - Scripts Asia.

Returns XML files and relevant metadata provided by Open: FactSet Partner – Scripts Asia. - type&#x3D;delta returns the files from March 1st 2023 to current date. - type&#x3D;full will returns the files from start of date until Feb 28th 2023.

### Example

```javascript
const { ApiClient, ScriptsAsiaApi } = require('@factset/sdk-openfactsetpartnersdocuments');
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

const apiInstance = new ScriptsAsiaApi();
const opts = {
  'sort': "'-startDate'", // String | Enables to get the data in ascending or descending order based on startTime. Results are in reverse chronological order if this parameter is not used.
  'paginationLimit': 20, // Number | Specifies the maximum number of results to return per result.
  'paginationOffset': 0, // Number | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. Using this parameter can fetch maximum of first 10000 records.
  'trackingId': 5f6b2d30-955d-11ed-9002-bfc7208ab203, // String | Unique Scripts Asia identifier assigned to an event. 
  'saId': SA000733_2023Feb24_a_02, // String | This parameter filters the results based on saId of the Transcript. 
  'startDate': 2023-02-20, // Date | The earliest date of the Scripts Asia file the API should return based on date. 
  'endDate': 2023-02-28, // Date | The latest date of the Scripts Asia file the API should return based on date.          
  'companyName': Mercuria Holdings Co., Ltd., // String | This parameter filters the results based on Company Name of the Transcript. 
  'eventType': 02, // String | This parameter filters the results based on eventType of the Transcript. 
  'languageType': "'local'", // String | This parameter filters the results based on language type(either English or local) of the Transcript. 
  'fileName': SA000733_2023Feb24_a_02_xml_local.xml, // String | This parameter is used to filters the results based on file name.
  'type': "'delta'" // String | Specifies the type of the file.
};

// Call api endpoint
apiInstance.getScriptsAsiaFiles(opts).then(
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
 **sort** | **String**| Enables to get the data in ascending or descending order based on startTime. Results are in reverse chronological order if this parameter is not used. | [optional] [default to &#39;-startDate&#39;]
 **paginationLimit** | **Number**| Specifies the maximum number of results to return per result. | [optional] [default to 20]
 **paginationOffset** | **Number**| Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. Using this parameter can fetch maximum of first 10000 records. | [optional] [default to 0]
 **trackingId** | **String**| Unique Scripts Asia identifier assigned to an event.  | [optional] 
 **saId** | **String**| This parameter filters the results based on saId of the Transcript.  | [optional] 
 **startDate** | **Date**| The earliest date of the Scripts Asia file the API should return based on date.  | [optional] 
 **endDate** | **Date**| The latest date of the Scripts Asia file the API should return based on date.           | [optional] 
 **companyName** | **String**| This parameter filters the results based on Company Name of the Transcript.  | [optional] 
 **eventType** | **String**| This parameter filters the results based on eventType of the Transcript.  | [optional] 
 **languageType** | **String**| This parameter filters the results based on language type(either English or local) of the Transcript.  | [optional] [default to &#39;local&#39;]
 **fileName** | **String**| This parameter is used to filters the results based on file name. | [optional] 
 **type** | **String**| Specifies the type of the file. | [optional] [default to &#39;delta&#39;]

### Return type

[**ScriptsAsiaResponse**](ScriptsAsiaResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

