# paengine.PACalculationsApi

All URIs are relative to *https://api.factset.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelCalculationById**](PACalculationsApi.md#cancelCalculationById) | **DELETE** /analytics/engines/pa/v3/calculations/{id} | Cancel PA calculation by id
[**getAllCalculations**](PACalculationsApi.md#getAllCalculations) | **GET** /analytics/engines/pa/v3/calculations | Get all calculations
[**getCalculationParameters**](PACalculationsApi.md#getCalculationParameters) | **GET** /analytics/engines/pa/v3/calculations/{id} | Get PA calculation parameters by id
[**getCalculationStatusById**](PACalculationsApi.md#getCalculationStatusById) | **GET** /analytics/engines/pa/v3/calculations/{id}/status | Get PA calculation status by id
[**getCalculationUnitResultById**](PACalculationsApi.md#getCalculationUnitResultById) | **GET** /analytics/engines/pa/v3/calculations/{id}/units/{unitId}/result | Get PA calculation result by id
[**postAndCalculate**](PACalculationsApi.md#postAndCalculate) | **POST** /analytics/engines/pa/v3/calculations | Create and Run PA calculation
[**putAndCalculate**](PACalculationsApi.md#putAndCalculate) | **PUT** /analytics/engines/pa/v3/calculations/{id} | Create or Update PA calculation and run it.



## cancelCalculationById

> cancelCalculationById(id)

Cancel PA calculation by id

This is the endpoint to cancel a previously submitted calculation.

### Example

```javascript
const { ApiClient, PACalculationsApi } = require('@factset/sdk-paengine');
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

const apiInstance = new PACalculationsApi();
const id = "id_example"; // String | from url, provided from the location header in the Create and Run PA calculation endpoint

// Call api endpoint
apiInstance.cancelCalculationById(id).then(
  () => {
    console.log('API called successfully.');
  },
  error => {
    console.error(error);
  },
);

```


### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| from url, provided from the location header in the Create and Run PA calculation endpoint | 

### Return type

null (empty response body)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getAllCalculations

> CalculationsSummaryRoot getAllCalculations(opts)

Get all calculations

This endpoints returns all calculation requests.

### Example

```javascript
const { ApiClient, PACalculationsApi } = require('@factset/sdk-paengine');
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

const apiInstance = new PACalculationsApi();
const opts = {
  'pageNumber': 1 // Number | 
};

// Call api endpoint
apiInstance.getAllCalculations(opts).then(
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
 **pageNumber** | **Number**|  | [optional] [default to 1]

### Return type

[**CalculationsSummaryRoot**](CalculationsSummaryRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getCalculationParameters

> PACalculationParametersRoot getCalculationParameters(id)

Get PA calculation parameters by id

This is the endpoint that returns the calculation parameters passed for a calculation.

### Example

```javascript
const { ApiClient, PACalculationsApi } = require('@factset/sdk-paengine');
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

const apiInstance = new PACalculationsApi();
const id = "id_example"; // String | from url, provided from the location header in the Create and Run PA calculation endpoint

// Call api endpoint
apiInstance.getCalculationParameters(id).then(
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
 **id** | **String**| from url, provided from the location header in the Create and Run PA calculation endpoint | 

### Return type

[**PACalculationParametersRoot**](PACalculationParametersRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getCalculationStatusById

> CalculationStatusRoot getCalculationStatusById(id)

Get PA calculation status by id

This is the endpoint to check on the progress of a previously requested calculation.  If the calculation has finished computing, the location header will point to the result url.  Otherwise, the calculation is still running and the X-FactSet-Api-PickUp-Progress header will contain a progress percentage.

### Example

```javascript
const { ApiClient, PACalculationsApi } = require('@factset/sdk-paengine');
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

const apiInstance = new PACalculationsApi();
const id = "id_example"; // String | from url, provided from the location header in the Create and Run PA calculation endpoint

// Call api endpoint
apiInstance.getCalculationStatusById(id).then(
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
 **id** | **String**| from url, provided from the location header in the Create and Run PA calculation endpoint | 

### Return type

[**CalculationStatusRoot**](CalculationStatusRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getCalculationUnitResultById

> ObjectRoot getCalculationUnitResultById(id, unitId)

Get PA calculation result by id

This is the endpoint to get the result of a previously requested calculation.  If the calculation has finished computing, the body of the response will contain the requested document in JSON.

### Example

```javascript
const { ApiClient, PACalculationsApi } = require('@factset/sdk-paengine');
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

const apiInstance = new PACalculationsApi();
const id = "id_example"; // String | from url, provided from the location header in the Get PA calculation status by id endpoint
const unitId = "unitId_example"; // String | from url, provided from the location header in the Get PA calculation status by id endpoint

// Call api endpoint
apiInstance.getCalculationUnitResultById(id, unitId).then(
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
 **id** | **String**| from url, provided from the location header in the Get PA calculation status by id endpoint | 
 **unitId** | **String**| from url, provided from the location header in the Get PA calculation status by id endpoint | 

### Return type

[**ObjectRoot**](ObjectRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/x-protobuf


## postAndCalculate

> CalculationStatusRoot postAndCalculate(opts)

Create and Run PA calculation

This endpoint runs the PA calculation specified in the POST body parameters.  It can take one or more calculation units as input.    Remarks:    * Any settings in POST body will act as a one-time override over the settings saved in the PA template.    *   Account identifiers must have .ACCT or .ACTM extension or BENCH: prefix. Holdings mode can be optionally set for every account.       Possible values for holdings mode are B&amp;H (Buy and Hold), TBR (Transaction based returns), OMS (Order Management System),       VLT (Vaulted returns) or EXT (External Returns Data). Default holdings mode value is B&amp;H.     *   If we are overriding the grouping with a frequency, we will be overriding the grouping saved to the original component and also overriding       the default frequency of the Beginning of Period to whatever we pass in the request body.        *   If we are overriding gouping frequency without overriding the group id it will not be applied to the default groupings saved to the original component.    *   Componentdetail supports securities, groups, groupsall, and totals levels of granularity. However, if no value is passed, the default value is &#39;securities&#39;.      Additionally, while &#39;groupsall&#39; returns all the group levels in the PA component,      setting componentdetail to &#39;groups&#39; only returns the expanded or collapsed group levels within the PA component.

### Example

```javascript
const { ApiClient, PACalculationsApi } = require('@factset/sdk-paengine');
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

const apiInstance = new PACalculationsApi();
const opts = {
  'xFactSetApiLongRunningDeadline': 56, // Number | Long running deadline in seconds when only one unit is passed in the POST body.
  'cacheControl': "cacheControl_example", // String | Standard HTTP header.  Accepts max-stale.
  'pACalculationParametersRoot': {"data":{"1":{"componentid":"801B800245E468A52AEBEC4BE31CFF5AF82F371DAEF5F158AC2E98C2FA324B46","accounts":[{"id":"BENCH:DJII","holdingsmode":"B&H"}],"benchmarks":[{"id":"BENCH:SP50","holdingsmode":"B&H"}],"dates":{"startdate":"20210101","enddate":"20210331","frequency":"Monthly"},"currencyisocode":"USD"},"2":{"componentid":"67077F67610EC30675E240A614661176C792A8997C78C9B9D64F738C01F18893","accounts":[{"id":"BENCH:SP100EQ","holdingsmode":"B&H"}],"benchmarks":[{"id":"BENCH:SP50","holdingsmode":"B&H"}],"dates":{"frequency":"Single","enddate":"0"},"currencyisocode":"USD"}},"meta":{"stachContentorganization":"SimplifiedRow","format":"JsonStach"}} // PACalculationParametersRoot | Calculation Parameters
};

// Call api endpoint
apiInstance.postAndCalculate(opts).then(
  data => {

      // data is a responsewrapper: PostAndCalculateResponseWrapper
      switch (data.statusCode) {

          case 200:
             // CalculationStatusRoot
             console.log(data.getResponse200());
             break;

          case 201:
             // ObjectRoot
             console.log(data.getResponse201());
             break;

          case 202:
             // CalculationStatusRoot
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
 **xFactSetApiLongRunningDeadline** | **Number**| Long running deadline in seconds when only one unit is passed in the POST body. | [optional] 
 **cacheControl** | **String**| Standard HTTP header.  Accepts max-stale. | [optional] 
 **pACalculationParametersRoot** | [**PACalculationParametersRoot**](PACalculationParametersRoot.md)| Calculation Parameters | [optional] 

### Return type

[**CalculationStatusRoot**](CalculationStatusRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/x-protobuf


## putAndCalculate

> CalculationStatusRoot putAndCalculate(id, opts)

Create or Update PA calculation and run it.

This endpoint updates and run the PA calculation specified in the PUT body parameters. This also allows creating new PA calculations with custom ids.  It can take one or more calculation units as input.    Remarks:    * Any settings in PUT body will act as a one-time override over the settings saved in the PA template.    *   Account identifiers must have .ACCT or .ACTM extension or BENCH: prefix. Holdings mode can be optionally set for every account.       Possible values for holdings mode are B&amp;H (Buy and Hold), TBR (Transaction based returns), OMS (Order Management System),       VLT (Vaulted returns) or EXT (External Returns Data). Default holdings mode value is B&amp;H.    *   If we are overriding the grouping with a frequency, we will be overriding the grouping saved to the original component and also overriding       the default frequency of the Beginning of Period to whatever we pass in the request body.        *   If we are overriding gouping frequency without overriding the group id it will not be applied to the default groupings saved to the original component.    *   Componentdetail supports securities, groups, groupsall, and totals levels of granularity. However, if no value is passed, the default value is &#39;securities&#39;.      Additionally, while &#39;groupsall&#39; returns all the group levels in the PA component,      setting componentdetail to &#39;groups&#39; only returns the expanded or collapsed group levels within the PA component.

### Example

```javascript
const { ApiClient, PACalculationsApi } = require('@factset/sdk-paengine');
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

const apiInstance = new PACalculationsApi();
const id = "id_example"; // String | from url, provided from the location header in the Create and Run PA calculation endpoint
const opts = {
  'xFactSetApiLongRunningDeadline': 56, // Number | Long running deadline in seconds when only one unit is passed in the PUT body.
  'cacheControl': "cacheControl_example", // String | Standard HTTP header.  Accepts max-stale.
  'pACalculationParametersRoot': {"data":{"1":{"componentid":"801B800245E468A52AEBEC4BE31CFF5AF82F371DAEF5F158AC2E98C2FA324B46","accounts":[{"id":"BENCH:DJII","holdingsmode":"B&H"}],"benchmarks":[{"id":"BENCH:SP50","holdingsmode":"B&H"}],"dates":{"startdate":"20210101","enddate":"20210231","frequency":"Monthly"},"currencyisocode":"USD"},"2":{"componentid":"67077F67610EC30675E240A614661176C792A8997C78C9B9D64F738C01F18893","accounts":[{"id":"BENCH:SP100EQ","holdingsmode":"B&H"}],"benchmarks":[{"id":"BENCH:SP50","holdingsmode":"B&H"}],"dates":{"frequency":"Single","enddate":"0"},"currencyisocode":"USD"}},"meta":{"stachContentorganization":"SimplifiedRow","format":"JsonStach"}} // PACalculationParametersRoot | Calculation Parameters
};

// Call api endpoint
apiInstance.putAndCalculate(id, opts).then(
  data => {

      // data is a responsewrapper: PutAndCalculateResponseWrapper
      switch (data.statusCode) {

          case 200:
             // CalculationStatusRoot
             console.log(data.getResponse200());
             break;

          case 201:
             // ObjectRoot
             console.log(data.getResponse201());
             break;

          case 202:
             // CalculationStatusRoot
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
 **id** | **String**| from url, provided from the location header in the Create and Run PA calculation endpoint | 
 **xFactSetApiLongRunningDeadline** | **Number**| Long running deadline in seconds when only one unit is passed in the PUT body. | [optional] 
 **cacheControl** | **String**| Standard HTTP header.  Accepts max-stale. | [optional] 
 **pACalculationParametersRoot** | [**PACalculationParametersRoot**](PACalculationParametersRoot.md)| Calculation Parameters | [optional] 

### Return type

[**CalculationStatusRoot**](CalculationStatusRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/x-protobuf

