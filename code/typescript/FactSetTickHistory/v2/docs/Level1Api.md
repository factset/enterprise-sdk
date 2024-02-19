# factsettickhistory.Level1Api

All URIs are relative to *https://api.factset.com/tick-history/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getLevel1FileStatus**](Level1Api.md#getLevel1FileStatus) | **GET** /level1/files/status | Returns the status of the ID
[**getMinutebarsFileStatus**](Level1Api.md#getMinutebarsFileStatus) | **GET** /level1/files/minute-bars/status | Returns the status of the ID
[**getMinutebarsFiles**](Level1Api.md#getMinutebarsFiles) | **GET** /level1/files/minute-bars/get | Returns the Minute bars data in files requested in the /create endpoint
[**getTickHistoryLevel1Files**](Level1Api.md#getTickHistoryLevel1Files) | **GET** /level1/files/get | Returns the tick-by-tick data in files requested in the /create endpoint
[**requestMinutebarsFiles**](Level1Api.md#requestMinutebarsFiles) | **POST** /level1/files/minute-bars/create | Requests the creation of Minute bars file
[**requestTickHistoryCoverage**](Level1Api.md#requestTickHistoryCoverage) | **GET** /level1/coverage | Returns the coverage for the requested ticker/isin along with other response fields for Level1 data.
[**requestTickHistoryLevel1Files**](Level1Api.md#requestTickHistoryLevel1Files) | **POST** /level1/files/create | Requests the creation of tick-by-tick file



## getLevel1FileStatus

> CompletedResponse getLevel1FileStatus(id)

Returns the status of the ID

Need to plug-in the id get from /create endpoint into /status endpoint

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, Level1Api } = require('@factset/sdk-factsettickhistory');
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

const apiInstance = new Level1Api();
const id = "id_example"; // String | id returned by files create endpoint to poll and collect status of the query

// Call api endpoint
apiInstance.getLevel1FileStatus(id).then(
  data => {

      // data is a responsewrapper: GetLevel1FileStatusResponseWrapper
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


## getMinutebarsFileStatus

> CompletedResponse getMinutebarsFileStatus(id)

Returns the status of the ID

Need to plug-in the id get from /create endpoint into /status endpoint

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, Level1Api } = require('@factset/sdk-factsettickhistory');
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

const apiInstance = new Level1Api();
const id = "id_example"; // String | id returned by files create endpoint to poll and collect status of the query

// Call api endpoint
apiInstance.getMinutebarsFileStatus(id).then(
  data => {

      // data is a responsewrapper: GetMinutebarsFileStatusResponseWrapper
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


## getMinutebarsFiles

> GetFilesMinuteResponse getMinutebarsFiles(id, opts)

Returns the Minute bars data in files requested in the /create endpoint

Returns the files from tickhistory endpoint

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, Level1Api } = require('@factset/sdk-factsettickhistory');
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

const apiInstance = new Level1Api();
const id = "id_example"; // String | id returned by files create endpoint to poll and collect results of the query
const opts = {
  'paginationLimit': 20, // Number | Specifies the maximum number of results to return per response page
  'paginationOffset': 0 // Number | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results
};

// Call api endpoint
apiInstance.getMinutebarsFiles(id, opts).then(
  data => {

      // data is a responsewrapper: GetMinutebarsFilesResponseWrapper
      switch (data.statusCode) {

          case 200:
             // GetFilesMinuteResponse
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

[**GetFilesMinuteResponse**](GetFilesMinuteResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getTickHistoryLevel1Files

> GetFilesResponse getTickHistoryLevel1Files(id, opts)

Returns the tick-by-tick data in files requested in the /create endpoint

Returns the files from tickhistory endpoint

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, Level1Api } = require('@factset/sdk-factsettickhistory');
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

const apiInstance = new Level1Api();
const id = "id_example"; // String | id returned by files create endpoint to poll and collect results of the query
const opts = {
  'paginationLimit': 20, // Number | Specifies the maximum number of results to return per response page
  'paginationOffset': 0 // Number | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results
};

// Call api endpoint
apiInstance.getTickHistoryLevel1Files(id, opts).then(
  data => {

      // data is a responsewrapper: GetTickHistoryLevel1FilesResponseWrapper
      switch (data.statusCode) {

          case 200:
             // GetFilesResponse
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

[**GetFilesResponse**](GetFilesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## requestMinutebarsFiles

> SubmittedResponse requestMinutebarsFiles(minRequest)

Requests the creation of Minute bars file

1-minute bars available from 20120101 to previous day. Per request able to fetch upto 6 months of data.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, Level1Api } = require('@factset/sdk-factsettickhistory');
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

const apiInstance = new Level1Api();
const minRequest = new factsettickhistory.MinRequest(); // MinRequest | 

// Call api endpoint
apiInstance.requestMinutebarsFiles(minRequest).then(
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
 **minRequest** | [**MinRequest**](MinRequest.md)|  | 

### Return type

[**SubmittedResponse**](SubmittedResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## requestTickHistoryCoverage

> CoverageResponse requestTickHistoryCoverage(opts)

Returns the coverage for the requested ticker/isin along with other response fields for Level1 data.

Returns coverage for specified tickers for Level1 Data

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, Level1Api } = require('@factset/sdk-factsettickhistory');
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

const apiInstance = new Level1Api();
const opts = {
  'tickers': ["CBA"], // [String] | <P> The requested list of one or more tickers.</p>   The `tickers` and `isins`  parameters provide two different ways to specify the identifiers for data retrieved. Please enter either the tickers or isins parameter.   <P> Maximum 10 tickers per request</p>     
  'factsetExchangeCode': AUS, // String | <p>This parameter is used to filter the results based on the FactSet specific regional or composite exchange code.</p> **NOTE**:Does not support multiple factsetExchangeCodes
  'isins': [] // [String] | <P> Specifies the ISIN of the record. </p>    Please enter either the `tickers` or `isins` parameter.     <P> Maximum 10 ISINs per request.</p>      
};

// Call api endpoint
apiInstance.requestTickHistoryCoverage(opts).then(
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
 **tickers** | [**[String]**](String.md)| &lt;P&gt; The requested list of one or more tickers.&lt;/p&gt;   The &#x60;tickers&#x60; and &#x60;isins&#x60;  parameters provide two different ways to specify the identifiers for data retrieved. Please enter either the tickers or isins parameter.   &lt;P&gt; Maximum 10 tickers per request&lt;/p&gt;      | [optional] 
 **factsetExchangeCode** | **String**| &lt;p&gt;This parameter is used to filter the results based on the FactSet specific regional or composite exchange code.&lt;/p&gt; **NOTE**:Does not support multiple factsetExchangeCodes | [optional] 
 **isins** | [**[String]**](String.md)| &lt;P&gt; Specifies the ISIN of the record. &lt;/p&gt;    Please enter either the &#x60;tickers&#x60; or &#x60;isins&#x60; parameter.     &lt;P&gt; Maximum 10 ISINs per request.&lt;/p&gt;       | [optional] 

### Return type

[**CoverageResponse**](CoverageResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## requestTickHistoryLevel1Files

> SubmittedResponse requestTickHistoryLevel1Files(leveloneRequest)

Requests the creation of tick-by-tick file

Data available from 20120101 to previous day.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, Level1Api } = require('@factset/sdk-factsettickhistory');
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

const apiInstance = new Level1Api();
const leveloneRequest = new factsettickhistory.LeveloneRequest(); // LeveloneRequest | 

// Call api endpoint
apiInstance.requestTickHistoryLevel1Files(leveloneRequest).then(
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
 **leveloneRequest** | [**LeveloneRequest**](LeveloneRequest.md)|  | 

### Return type

[**SubmittedResponse**](SubmittedResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

