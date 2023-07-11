# factsettickhistory.RequestFilesLevel2BETAApi

All URIs are relative to *https://api.factset.com/bulk-documents/tick-history/v0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getrequestIdLevel2**](RequestFilesLevel2BETAApi.md#getrequestIdLevel2) | **GET** /level2/request-files | Returns the requestId and status



## getrequestIdLevel2

> Level2RequestFilesResponse getrequestIdLevel2(ticker, startDate, endDate, mic, opts)

Returns the requestId and status

Returns the requestId and status.

### Example

```javascript
const { ApiClient, RequestFilesLevel2BETAApi } = require('@factset/sdk-factsettickhistory');
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

const apiInstance = new RequestFilesLevel2BETAApi();
const ticker = ["GOOGL"]; // [String] | The requested list of one or more Market tickers.
const startDate = 2023-01-01; // Date | The date to which data is required.
const endDate = 2023-01-30; // Date | The date to which data is required.
const mic = XNYS; // String | This parameter is used to filter the results based on the exchange code. <p>**NOTE**:Does not support multiple mic codes</p>
const opts = {
  'responseFileType': "'parquet'" // String | Specifies the fileType
};

// Call api endpoint
apiInstance.getrequestIdLevel2(ticker, startDate, endDate, mic, opts).then(
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
 **ticker** | [**[String]**](String.md)| The requested list of one or more Market tickers. | 
 **startDate** | **Date**| The date to which data is required. | 
 **endDate** | **Date**| The date to which data is required. | 
 **mic** | **String**| This parameter is used to filter the results based on the exchange code. &lt;p&gt;**NOTE**:Does not support multiple mic codes&lt;/p&gt; | 
 **responseFileType** | **String**| Specifies the fileType | [optional] [default to &#39;parquet&#39;]

### Return type

[**Level2RequestFilesResponse**](Level2RequestFilesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

