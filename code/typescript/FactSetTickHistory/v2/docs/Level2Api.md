# factsettickhistory.Level2Api

All URIs are relative to *https://api.factset.com/tick-history/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getStatusLevel2**](Level2Api.md#getStatusLevel2) | **GET** /level2/files/status | Returns the status of the ID
[**getTickHistoryFilesLevel2**](Level2Api.md#getTickHistoryFilesLevel2) | **GET** /level2/files/get | Returns the tick history files requested in the /create endpoint
[**getlevel2id**](Level2Api.md#getlevel2id) | **POST** /level2/files/create | Returns the ID for the requested data.



## getStatusLevel2

> CompletedResponse getStatusLevel2(id)

Returns the status of the ID

Need to plug-in the id get from /create endpoint into /status endpoint

### Example

```javascript
const { ApiClient, Level2Api } = require('@factset/sdk-factsettickhistory');
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

const apiInstance = new Level2Api();
const id = "id_example"; // String | id returned by files create endpoint to poll and collect status of the query

// Call api endpoint
apiInstance.getStatusLevel2(id).then(
  data => {

      // data is a responsewrapper: GetStatusLevel2ResponseWrapper
      switch (data.statusCode) {

          case 201:
             // CompletedResponse
             console.log(data.getResponse201());
             break;

          case 202:
             // SubmittedResponse
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
 **id** | **String**| id returned by files create endpoint to poll and collect status of the query | 

### Return type

[**CompletedResponse**](CompletedResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getTickHistoryFilesLevel2

> LeveltwoGetFilesResponse getTickHistoryFilesLevel2(id, opts)

Returns the tick history files requested in the /create endpoint

Returns the files from tickhistory endpoint

### Example

```javascript
const { ApiClient, Level2Api } = require('@factset/sdk-factsettickhistory');
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

const apiInstance = new Level2Api();
const id = "id_example"; // String | id returned by files create endpoint to poll and collect results of the query
const opts = {
  'paginationLimit': 20, // Number | Specifies the maximum number of results to return per response page
  'paginationOffset': 0 // Number | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results
};

// Call api endpoint
apiInstance.getTickHistoryFilesLevel2(id, opts).then(
  data => {

      // data is a responsewrapper: GetTickHistoryFilesLevel2ResponseWrapper
      switch (data.statusCode) {

          case 200:
             // LeveltwoGetFilesResponse
             console.log(data.getResponse200());
             break;

          case 202:
             // SubmittedResponse
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
 **id** | **String**| id returned by files create endpoint to poll and collect results of the query | 
 **paginationLimit** | **Number**| Specifies the maximum number of results to return per response page | [optional] [default to 20]
 **paginationOffset** | **Number**| Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results | [optional] [default to 0]

### Return type

[**LeveltwoGetFilesResponse**](LeveltwoGetFilesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getlevel2id

> SubmittedResponse getlevel2id(levelTwoRequest)

Returns the ID for the requested data.

Data available from past 6 years to current date.

### Example

```javascript
const { ApiClient, Level2Api } = require('@factset/sdk-factsettickhistory');
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

const apiInstance = new Level2Api();
const levelTwoRequest = new factsettickhistory.LevelTwoRequest(); // LevelTwoRequest | 

// Call api endpoint
apiInstance.getlevel2id(levelTwoRequest).then(
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
 **levelTwoRequest** | [**LevelTwoRequest**](LevelTwoRequest.md)|  | 

### Return type

[**SubmittedResponse**](SubmittedResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

