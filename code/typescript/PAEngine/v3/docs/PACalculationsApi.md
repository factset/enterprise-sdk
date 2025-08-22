# paengine.PACalculationsApi

All URIs are relative to *https://api.factset.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelCalculationById**](PACalculationsApi.md#cancelCalculationById) | **DELETE** /analytics/engines/pa/v3/calculations/{id} | Cancel PA calculation by id
[**generatePAPortfolioCommentary**](PACalculationsApi.md#generatePAPortfolioCommentary) | **POST** /analytics/engines/pa/v3/calculations/{id}/units/{unitId}/commentary | Generate PA portfolio commentary by calculation and unit id.
[**getAllCalculations**](PACalculationsApi.md#getAllCalculations) | **GET** /analytics/engines/pa/v3/calculations | Get all calculations
[**getCalculationParameters**](PACalculationsApi.md#getCalculationParameters) | **GET** /analytics/engines/pa/v3/calculations/{id} | Get PA calculation parameters by id
[**getCalculationStatusById**](PACalculationsApi.md#getCalculationStatusById) | **GET** /analytics/engines/pa/v3/calculations/{id}/status | Get PA calculation status by id
[**getCalculationUnitResultById**](PACalculationsApi.md#getCalculationUnitResultById) | **GET** /analytics/engines/pa/v3/calculations/{id}/units/{unitId}/result | Get PA calculation result by id
[**getPAPortfolioCommentaryResultById**](PACalculationsApi.md#getPAPortfolioCommentaryResultById) | **GET** /analytics/engines/pa/v3/calculations/{id}/units/{unitId}/commentary/result | Get PA Portfolio commentary result by calculation and unit id.
[**getPAPortfolioCommentaryStatusById**](PACalculationsApi.md#getPAPortfolioCommentaryStatusById) | **GET** /analytics/engines/pa/v3/calculations/{id}/units/{unitId}/commentary/status | Get PA portfolio commentary status by calculation and unit id.
[**postAndCalculate**](PACalculationsApi.md#postAndCalculate) | **POST** /analytics/engines/pa/v3/calculations | Create and Run PA calculation
[**putAndCalculate**](PACalculationsApi.md#putAndCalculate) | **PUT** /analytics/engines/pa/v3/calculations/{id} | Create or Update PA calculation and run it.



## cancelCalculationById

> cancelCalculationById(id)

Cancel PA calculation by id

This is the endpoint to cancel a previously submitted calculation.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, PACalculationsApi } = require('@factset/sdk-paengine');
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


## generatePAPortfolioCommentary

> PACommentaryRoot generatePAPortfolioCommentary(id, unitId, opts)

Generate PA portfolio commentary by calculation and unit id.

This endpoint can be used to generate the PA portfolio commentary based on a previous successful calculation.    Remarks:    * The PA component used in the calculation must be an attribution tile.        *   The \&quot;Variation in Average Weight\&quot; column must be included along with those required      as specified on the [OA page](https://my.apps.factset.com/oa/pages/13632#portfolio_commentary)      in the component for successful commentary generation; otherwise, the request will result in an error.    *   PA portfolio commentary generation is not supported for multi-port requests.    *   The POST calculation must use a single portfolio and a benchmark to generate the commentary.    *   PA portfolio commentary with sub-period analysis will be returned only when the frequency      is set to something other than \&quot;single\&quot; and the report contains more than one sub-period.        *   Commentary customization is optional. Please include a configuration ID in the request body when customization is desired.       If the configuration ID is not specified, the default commentary will be returned.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, PACalculationsApi } = require('@factset/sdk-paengine');
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

const apiInstance = new PACalculationsApi();
const id = "id_example"; // String | Successful calculation id
const unitId = "unitId_example"; // String | Unit id associated with the successful calculation id
const opts = {
  'pACommentaryParametersRoot': {"data":{"configurationid":"39A1C0C7BD46731552B29D913804EC5F3ED91E6B991AF298DEC88CCA2A9FC6B3"}} // PACommentaryParametersRoot | Request Parameters
};

// Call api endpoint
apiInstance.generatePAPortfolioCommentary(id, unitId, opts).then(
  data => {

      // data is a responsewrapper: GeneratePAPortfolioCommentaryResponseWrapper
      switch (data.statusCode) {

          case 201:
             // PACommentaryRoot
             console.log(data.getResponse201());
             break;

          case 202:
             // PACommentaryGetStatusRoot
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
 **id** | **String**| Successful calculation id | 
 **unitId** | **String**| Unit id associated with the successful calculation id | 
 **pACommentaryParametersRoot** | [**PACommentaryParametersRoot**](PACommentaryParametersRoot.md)| Request Parameters | [optional] 

### Return type

[**PACommentaryRoot**](PACommentaryRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## getAllCalculations

> CalculationsSummaryRoot getAllCalculations(opts)

Get all calculations

This endpoints returns all calculation requests.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, PACalculationsApi } = require('@factset/sdk-paengine');
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

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, PACalculationsApi } = require('@factset/sdk-paengine');
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

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, PACalculationsApi } = require('@factset/sdk-paengine');
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

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, PACalculationsApi } = require('@factset/sdk-paengine');
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


## getPAPortfolioCommentaryResultById

> PACommentaryRoot getPAPortfolioCommentaryResultById(id, unitId)

Get PA Portfolio commentary result by calculation and unit id.

This endpoint retrieves the result of a previously requested portfolio commentary.   If the commentary generation is complete, the commentary will be returned in a predefined JSON format.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, PACalculationsApi } = require('@factset/sdk-paengine');
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

const apiInstance = new PACalculationsApi();
const id = "id_example"; // String | Successful calculation id
const unitId = "unitId_example"; // String | Unit id associated with the successful calculation id

// Call api endpoint
apiInstance.getPAPortfolioCommentaryResultById(id, unitId).then(
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
 **id** | **String**| Successful calculation id | 
 **unitId** | **String**| Unit id associated with the successful calculation id | 

### Return type

[**PACommentaryRoot**](PACommentaryRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getPAPortfolioCommentaryStatusById

> PACommentaryStatusRoot getPAPortfolioCommentaryStatusById(id, unitId)

Get PA portfolio commentary status by calculation and unit id.

This endpoint allows you to check the progress of a previously requested PA portfolio commentary.   If the commentary generation is complete, the location header will provide the URL for the result.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, PACalculationsApi } = require('@factset/sdk-paengine');
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

const apiInstance = new PACalculationsApi();
const id = "id_example"; // String | Successful calculation id
const unitId = "unitId_example"; // String | Unit id associated with the successful calculation id

// Call api endpoint
apiInstance.getPAPortfolioCommentaryStatusById(id, unitId).then(
  data => {

      // data is a responsewrapper: GetPAPortfolioCommentaryStatusByIdResponseWrapper
      switch (data.statusCode) {

          case 200:
             // PACommentaryStatusRoot
             console.log(data.getResponse200());
             break;

          case 202:
             // PACommentaryGetStatusRoot
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
 **id** | **String**| Successful calculation id | 
 **unitId** | **String**| Unit id associated with the successful calculation id | 

### Return type

[**PACommentaryStatusRoot**](PACommentaryStatusRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## postAndCalculate

> CalculationStatusRoot postAndCalculate(opts)

Create and Run PA calculation

This endpoint runs the PA calculation specified in the POST body parameters.  It can take one or more calculation units as input.    Remarks:    * Any settings in POST body will act as a one-time override over the settings saved in the PA template.    *   Account identifiers must have .ACCT or .ACTM extension or BENCH: prefix. Holdings mode can be optionally set for every account.       Possible values for holdings mode are B&amp;H (Buy and Hold), TBR (Transaction based returns), OMS (Order Management System),       VLT (Vaulted returns) or EXT (External Returns Data).     *   If we are overriding the grouping with a frequency, we will be overriding the grouping saved to the original component and also overriding       the default frequency of the Beginning of Period to whatever we pass in the request body.        *   If we are overriding grouping frequency without overriding the group id it will not be applied to the default groupings saved to the original component.    *   Componentdetail supports securities, groups, groupsall, and totals levels of granularity. However, if no value is passed, the default value is &#39;securities&#39;.      Additionally, while &#39;groupsall&#39; returns all the group levels in the PA component,      setting componentdetail to &#39;groups&#39; only returns the expanded or collapsed group levels within the PA component.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, PACalculationsApi } = require('@factset/sdk-paengine');
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

const apiInstance = new PACalculationsApi();
const opts = {
  'xFactSetApiLongRunningDeadline': 10, // Number | Long running deadline in seconds when only one unit is passed in the POST body. Example value is set to 10s. Please update it as per requirement before triggering a calculation.
  'cacheControl': "cacheControl_example", // String | Standard HTTP header.  Accepts max-stale.
  'pACalculationParametersRoot': {"data":{"1":{"componentid":"8A4863688B9360E09957CF79684E68F85D5F4E514E657B6F24D00D5E928E7A1B","accounts":[{"id":"LION:100D-GB","holdingsmode":"B&H"}],"benchmarks":[{"id":"LION:OEF-US","holdingsmode":"B&H"}],"dates":{"startdate":"","enddate":"20240508","frequency":"Single"},"currencyisocode":"USD"}},"meta":{"contentorganization":"None","stachContentOrganization":"SimplifiedRow","contenttype":"Json","format":"JsonStach"}} // PACalculationParametersRoot | Calculation Parameters
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
 **xFactSetApiLongRunningDeadline** | **Number**| Long running deadline in seconds when only one unit is passed in the POST body. Example value is set to 10s. Please update it as per requirement before triggering a calculation. | [optional] 
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

This endpoint updates and run the PA calculation specified in the PUT body parameters. This also allows creating new PA calculations with custom ids.  It can take one or more calculation units as input.    Remarks:    * Any settings in PUT body will act as a one-time override over the settings saved in the PA template.    *   Account identifiers must have .ACCT or .ACTM extension or BENCH: prefix. Holdings mode can be optionally set for every account.       Possible values for holdings mode are B&amp;H (Buy and Hold), TBR (Transaction based returns), OMS (Order Management System),       VLT (Vaulted returns) or EXT (External Returns Data).    *   If we are overriding the grouping with a frequency, we will be overriding the grouping saved to the original component and also overriding       the default frequency of the Beginning of Period to whatever we pass in the request body.        *   If we are overriding grouping frequency without overriding the group id it will not be applied to the default groupings saved to the original component.    *   Componentdetail supports securities, groups, groupsall, and totals levels of granularity. However, if no value is passed, the default value is &#39;securities&#39;.      Additionally, while &#39;groupsall&#39; returns all the group levels in the PA component,      setting componentdetail to &#39;groups&#39; only returns the expanded or collapsed group levels within the PA component.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, PACalculationsApi } = require('@factset/sdk-paengine');
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

const apiInstance = new PACalculationsApi();
const id = "id_example"; // String | from url, provided from the location header in the Create and Run PA calculation endpoint
const opts = {
  'xFactSetApiLongRunningDeadline': 10, // Number | Long running deadline in seconds when only one unit is passed in the PUT body. Example value is set to 10s. Please update it as per requirement before triggering a calculation
  'cacheControl': "cacheControl_example", // String | Standard HTTP header.  Accepts max-stale.
  'pACalculationParametersRoot': {"data":{"1":{"componentid":"8A4863688B9360E09957CF79684E68F85D5F4E514E657B6F24D00D5E928E7A1B","accounts":[{"id":"LION:100D-GB","holdingsmode":"B&H"}],"benchmarks":[{"id":"LION:OEF-US","holdingsmode":"B&H"}],"dates":{"startdate":"","enddate":"20240508","frequency":"Single"},"currencyisocode":"USD"}},"meta":{"contentorganization":"None","stachContentOrganization":"SimplifiedRow","contenttype":"Json","format":"JsonStach"}} // PACalculationParametersRoot | Calculation Parameters
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
 **xFactSetApiLongRunningDeadline** | **Number**| Long running deadline in seconds when only one unit is passed in the PUT body. Example value is set to 10s. Please update it as per requirement before triggering a calculation | [optional] 
 **cacheControl** | **String**| Standard HTTP header.  Accepts max-stale. | [optional] 
 **pACalculationParametersRoot** | [**PACalculationParametersRoot**](PACalculationParametersRoot.md)| Calculation Parameters | [optional] 

### Return type

[**CalculationStatusRoot**](CalculationStatusRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/x-protobuf

