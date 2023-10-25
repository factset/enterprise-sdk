# foreignexchangerate.SpotsApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getSpots**](SpotsApi.md#getSpots) | **GET** /foreign-exchange/v1/spots | Gets spots for a list of currency pairs
[**getSpotsForList**](SpotsApi.md#getSpotsForList) | **POST** /foreign-exchange/v1/spots | Gets spots for a list of currency pairs



## getSpots

> SpotsResponse getSpots(ids, opts)

Gets spots for a list of currency pairs

Gets FX Spot rates for a requested currency pair, date range, and frequency. The WM Company calculates daily standardized spot rates for global foreign exchange transactions, using rates provided by Reuters. These rates are recognized globally as the standard by banks, fund managers, and index compilers; increasingly these rates are also being used for benchmark currency trading. 

### Example

```javascript
const { ApiClient, SpotsApi } = require('@factset/sdk-foreignexchangerate');
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

const apiInstance = new SpotsApi();
const ids = ["USDGBP"]; // [String] | The currency pair requested in the format of a ISO {source}{target}. For a complete list of ISO currencies, please visit [OA 1470](https://my.apps.factset.com/oa/pages/1470)
const opts = {
  'startDate': 2019-01-01, // String | The start date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to latest available. 
  'endDate': 2019-12-31, // String | The end date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to latest available. 
  'frequency': D // String | Controls the display frequency of the data returned.   * **D** = Daily   * **W** = Weekly, based on the last day of the week of the start date.   * **M** = Monthly, based on the last trading day of the month.   * **AM** = Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16 etc.).    * **CQ** = Quarterly based on the last trading day of the calendar quarter (March, June, September, or December).   * **AY** = Actual Annual, based on the start date.   * **CY** = Calendar Annual, based on the last trading day of the calendar year. 
};

// Call api endpoint
apiInstance.getSpots(ids, opts).then(
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
 **ids** | [**[String]**](String.md)| The currency pair requested in the format of a ISO {source}{target}. For a complete list of ISO currencies, please visit [OA 1470](https://my.apps.factset.com/oa/pages/1470) | 
 **startDate** | **String**| The start date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to latest available.  | [optional] 
 **endDate** | **String**| The end date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to latest available.  | [optional] 
 **frequency** | **String**| Controls the display frequency of the data returned.   * **D** &#x3D; Daily   * **W** &#x3D; Weekly, based on the last day of the week of the start date.   * **M** &#x3D; Monthly, based on the last trading day of the month.   * **AM** &#x3D; Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16 etc.).    * **CQ** &#x3D; Quarterly based on the last trading day of the calendar quarter (March, June, September, or December).   * **AY** &#x3D; Actual Annual, based on the start date.   * **CY** &#x3D; Calendar Annual, based on the last trading day of the calendar year.  | [optional] [default to &#39;D&#39;]

### Return type

[**SpotsResponse**](SpotsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getSpotsForList

> SpotsResponse getSpotsForList(spotsRequest)

Gets spots for a list of currency pairs

Gets FX Spot rates for a requested currency pair, date range, and frequency. The WM Company calculates daily standardized spot rates for global foreign exchange transactions, using rates provided by Reuters. These rates are recognized globally as the standard by banks, fund managers, and index compilers; increasingly these rates are also being used for benchmark currency trading. 

### Example

```javascript
const { ApiClient, SpotsApi } = require('@factset/sdk-foreignexchangerate');
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

const apiInstance = new SpotsApi();
const spotsRequest = new foreignexchangerate.SpotsRequest(); // SpotsRequest | Request object for Spots.

// Call api endpoint
apiInstance.getSpotsForList(spotsRequest).then(
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
 **spotsRequest** | [**SpotsRequest**](SpotsRequest.md)| Request object for Spots. | 

### Return type

[**SpotsResponse**](SpotsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

