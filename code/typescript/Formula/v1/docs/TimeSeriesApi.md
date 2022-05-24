# formula.TimeSeriesApi

All URIs are relative to *https://api.factset.com/formula-api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getTimeSeriesData**](TimeSeriesApi.md#getTimeSeriesData) | **GET** /v1/time-series | Retrieve data items (FQL formulas) for a list of identifiers or defined universe.
[**getTimeSeriesDataForList**](TimeSeriesApi.md#getTimeSeriesDataForList) | **POST** /v1/time-series | Retrieve data items (FQL formulas) for a list of identifiers or defined universe.



## getTimeSeriesData

> TimeSeriesResponse getTimeSeriesData(formulas, opts)

Retrieve data items (FQL formulas) for a list of identifiers or defined universe.

The &#x60;/time-series&#x60; endpoint is closely aligned with FactSet’s powerful data retrieval language **FactSet Query Language (FQL)** which is optimized for time-series analysis. FQL can also perform sophisticated statistical, mathematical, logical, and other complex operations on the data.    This endpoint has a unique **TIMESERIES** data object that pairs the requested data with FactSet provided dates. This helps reduce the need for additional data requests and reduces the work required by users.  The &#x60;/time-series&#x60; endpoint supports Long Running asynchronous requests up to **10 minutes** via the &#x60;batch&#x60; parameter. *This feature is available to Individual Users subscribed to the Performance Package and Performance Package Plus Performance Tiers and all Production Users. If you are unsure which Performance Tier you are subscribed to or you would like to gain access to the batch capabilities, please contact your FactSet Account Team or \&quot;Report Issue\&quot; above and our support teams can assist.* 

### Example

```javascript
const { ApiClient, TimeSeriesApi } = require('@factset/sdk-formula');
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

const apiInstance = new TimeSeriesApi();
const formulas = ["P_PRICE(0)"]; // [String] | List of FQL formulas
const opts = {
  'ids': ["IBM"], // [String] | List of entity identifiers.  The `ids` and `universe` parameters provide two different ways to specify the identifiers for which you want data retrieved. Please enter either the `ids` or `universe` parameter. 
  'universe': , // String | Screening expression to limit the universe  Please enter either the `ids` or `universe` parameter. 
  'universeType': "'EQUITY'", // String | Specify the universe type to calculate the `universe` in.  Find documentation below on how to build a screen for each universe type - * Equity Screen - [Online Assistant Page 20606](https://my.apps.factset.com/oa/pages/20606)  * Debt Screen - [Online Assistant Page 20888](https://my.apps.factset.com/oa/pages/20888)  * Fund Screen - [Online Assistant Page 21384](https://my.apps.factset.com/oa/pages/21384)  This parameter may only be used in conjunction with the `universe` parameter. 
  'calendar': FIVEDAY, // String | Calendar of data returned. The default value is FIVEDAY which displays Monday through Friday, regardless of whether there were trading holidays.
  'fsymId': "'N'", // String | Specify **Y** for the `fsymId` parameter to return the **fsymId** (FactSet Default Permanent Identifier) of the `requestId`, in addition to the **requestId** field, in each response object. The default value for the `fsymId` parameter is **N**.  The **fsymId** field returned is the FactSet Default Permanent Identifier for the `requestId`. For all supported `requestId` symbol types, the `fsymId` parameter will return the Regional Level PermId '-R' which identifies the security’s best regional security data series per currency. Currently, the fsymId parameter only supports equities. Accepted `requestId` symbol types include all FactSet Permanent Identifiers types, CUSIP, SEDOL, ISIN, and Tickers. Further documentation can be found at this [Online Assistant attachment](https://oa.apps.factset.com/cms/oaAttachment/64c3213a-f415-4c27-a336-92c73a72deed/24881). 
  'displayName': , // [String] | Define display names for the formulas inputted. Enter the list of display names in the same order as the formulas inputted. An additional field **displayName** will be returned in the data object for a formula.  If the number of display names does not match the number of formulas provided, an error will be returned.  To define the display name for a subset of the formulas, leave a blank in the position of the formula that won't be renamed. For example - If three formulas are inputted, to define display names only for the first and third formula, enter *displayName=FORMULA_1,,FORMULA_3*. The **displayName** field will still be included in that formula, but will contain the formula as inputted. 
  'flatten': "'N'", // String | Specify **Y** for `flatten` to return a flat, table-like JSON response model instead of the standard nested JSON response model. This option is provided for easier data processing and visualization. The default value for `flatten` is **N**.  See the **Time-Series Result Object Flattened** schema for more detail on the response structure for flattened output. 
  'batch': "'N'" // String | Enables the ability to asynchronously \"batch\" the request, supporting a long-running request up to **10 minutes**. Upon requesting batch=Y, the service will respond back with an HTTP Status Code of 202.  A user is limited to running 5 Batch Requests in a 10 minute period.  *This feature is available to Individual Users subscribed to the Performance Package and Performance Package Plus Performance Tiers and all Production Users. If you are unsure which Performance Tier you are subscribed to or you would like to gain access to the batch capabilities, please contact your FactSet Account Team or \"Report Issue\" above and our support teams can assist.*  Once a batch request is submitted, use `/batch-status` to see if the job has completed. Once completed, retrieve the results of the request via `/batch-result`. See the endpoints listed under *Batch Processing* for more information. 
};

// Call api endpoint
apiInstance.getTimeSeriesData(formulas, opts).then(
  data => {

      // data is a responsewrapper: GetTimeSeriesDataResponseWrapper
      switch (data.statusCode) {

          case 200:
             // TimeSeriesResponse
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
 **formulas** | [**[String]**](String.md)| List of FQL formulas | 
 **ids** | [**[String]**](String.md)| List of entity identifiers.  The &#x60;ids&#x60; and &#x60;universe&#x60; parameters provide two different ways to specify the identifiers for which you want data retrieved. Please enter either the &#x60;ids&#x60; or &#x60;universe&#x60; parameter.  | [optional] 
 **universe** | **String**| Screening expression to limit the universe  Please enter either the &#x60;ids&#x60; or &#x60;universe&#x60; parameter.  | [optional] 
 **universeType** | **String**| Specify the universe type to calculate the &#x60;universe&#x60; in.  Find documentation below on how to build a screen for each universe type - * Equity Screen - [Online Assistant Page 20606](https://my.apps.factset.com/oa/pages/20606)  * Debt Screen - [Online Assistant Page 20888](https://my.apps.factset.com/oa/pages/20888)  * Fund Screen - [Online Assistant Page 21384](https://my.apps.factset.com/oa/pages/21384)  This parameter may only be used in conjunction with the &#x60;universe&#x60; parameter.  | [optional] [default to &#39;EQUITY&#39;]
 **calendar** | **String**| Calendar of data returned. The default value is FIVEDAY which displays Monday through Friday, regardless of whether there were trading holidays. | [optional] 
 **fsymId** | **String**| Specify **Y** for the &#x60;fsymId&#x60; parameter to return the **fsymId** (FactSet Default Permanent Identifier) of the &#x60;requestId&#x60;, in addition to the **requestId** field, in each response object. The default value for the &#x60;fsymId&#x60; parameter is **N**.  The **fsymId** field returned is the FactSet Default Permanent Identifier for the &#x60;requestId&#x60;. For all supported &#x60;requestId&#x60; symbol types, the &#x60;fsymId&#x60; parameter will return the Regional Level PermId &#39;-R&#39; which identifies the security’s best regional security data series per currency. Currently, the fsymId parameter only supports equities. Accepted &#x60;requestId&#x60; symbol types include all FactSet Permanent Identifiers types, CUSIP, SEDOL, ISIN, and Tickers. Further documentation can be found at this [Online Assistant attachment](https://oa.apps.factset.com/cms/oaAttachment/64c3213a-f415-4c27-a336-92c73a72deed/24881).  | [optional] [default to &#39;N&#39;]
 **displayName** | [**[String]**](String.md)| Define display names for the formulas inputted. Enter the list of display names in the same order as the formulas inputted. An additional field **displayName** will be returned in the data object for a formula.  If the number of display names does not match the number of formulas provided, an error will be returned.  To define the display name for a subset of the formulas, leave a blank in the position of the formula that won&#39;t be renamed. For example - If three formulas are inputted, to define display names only for the first and third formula, enter *displayName&#x3D;FORMULA_1,,FORMULA_3*. The **displayName** field will still be included in that formula, but will contain the formula as inputted.  | [optional] 
 **flatten** | **String**| Specify **Y** for &#x60;flatten&#x60; to return a flat, table-like JSON response model instead of the standard nested JSON response model. This option is provided for easier data processing and visualization. The default value for &#x60;flatten&#x60; is **N**.  See the **Time-Series Result Object Flattened** schema for more detail on the response structure for flattened output.  | [optional] [default to &#39;N&#39;]
 **batch** | **String**| Enables the ability to asynchronously \&quot;batch\&quot; the request, supporting a long-running request up to **10 minutes**. Upon requesting batch&#x3D;Y, the service will respond back with an HTTP Status Code of 202.  A user is limited to running 5 Batch Requests in a 10 minute period.  *This feature is available to Individual Users subscribed to the Performance Package and Performance Package Plus Performance Tiers and all Production Users. If you are unsure which Performance Tier you are subscribed to or you would like to gain access to the batch capabilities, please contact your FactSet Account Team or \&quot;Report Issue\&quot; above and our support teams can assist.*  Once a batch request is submitted, use &#x60;/batch-status&#x60; to see if the job has completed. Once completed, retrieve the results of the request via &#x60;/batch-result&#x60;. See the endpoints listed under *Batch Processing* for more information.  | [optional] [default to &#39;N&#39;]

### Return type

[**TimeSeriesResponse**](TimeSeriesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getTimeSeriesDataForList

> TimeSeriesResponse getTimeSeriesDataForList(timeSeriesRequest)

Retrieve data items (FQL formulas) for a list of identifiers or defined universe.

The &#x60;/time-series&#x60; endpoint is closely aligned with FactSet’s powerful data retrieval language **FactSet Query Language (FQL)** which is optimized for time-series analysis. FQL can also perform sophisticated statistical, mathematical, logical, and other complex operations on the data.    This endpoint has a unique **TIMESERIES** data object that pairs the requested data with FactSet provided dates. This helps reduce the need for additional data requests and reduces the work required by users.  The &#x60;/time-series&#x60; endpoint supports Long Running asynchronous requests up to **10 minutes** via the &#x60;batch&#x60; parameter. *This feature is available to Individual Users subscribed to the Performance Package and Performance Package Plus Performance Tiers and all Production Users. If you are unsure which Performance Tier you are subscribed to or you would like to gain access to the batch capabilities, please contact your FactSet Account Team or \&quot;Report Issue\&quot; above and our support teams can assist.* 

### Example

```javascript
const { ApiClient, TimeSeriesApi } = require('@factset/sdk-formula');
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

const apiInstance = new TimeSeriesApi();
const timeSeriesRequest = {"data":{"ids":["IBM"],"formulas":["P_PRICE(0)"]}}; // TimeSeriesRequest | 

// Call api endpoint
apiInstance.getTimeSeriesDataForList(timeSeriesRequest).then(
  data => {

      // data is a responsewrapper: GetTimeSeriesDataForListResponseWrapper
      switch (data.statusCode) {

          case 200:
             // TimeSeriesResponse
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
 **timeSeriesRequest** | [**TimeSeriesRequest**](TimeSeriesRequest.md)|  | 

### Return type

[**TimeSeriesResponse**](TimeSeriesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

