# chartgenerationservice.ChartTemplatesApi

All URIs are relative to *https://api.factset.com/charting/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCategoryList**](ChartTemplatesApi.md#getCategoryList) | **GET** /catalog/categories | Get a list of chart categories
[**getChartList**](ChartTemplatesApi.md#getChartList) | **GET** /catalog/charts | Get a list of chart templates that can be used for getting the image from the service.
[**images**](ChartTemplatesApi.md#images) | **GET** /image | Get chart image back in PNG or JPEG formats



## getCategoryList

> [String] getCategoryList()

Get a list of chart categories

Retrieve a list of all chart categories with getCategoryList() API call.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, ChartTemplatesApi } = require('@factset/sdk-chartgenerationservice');
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

const apiInstance = new ChartTemplatesApi();

// Call api endpoint
apiInstance.getCategoryList().then(
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

This endpoint does not need any parameter.

### Return type

**[String]**

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getChartList

> [CategoryChartListErrorObject] getChartList(opts)

Get a list of chart templates that can be used for getting the image from the service.

You can get all the charts present or can just get the information by categories. The response includes the name of the chart, description, tags and any additional input specific to that chart. Use the information from this response to determine what charts you want and get its image from /images endpoint. Additionally you can also get back a auto generated PDF for the categories you requested for.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, ChartTemplatesApi } = require('@factset/sdk-chartgenerationservice');
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

const apiInstance = new ChartTemplatesApi();
const opts = {
  'categories': "categories_example" // String | A comma delimited string of catgory names to limit the response to certain categories. If nothing is provided, all charts under every category would be listed out.
};

// Call api endpoint
apiInstance.getChartList(opts).then(
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
 **categories** | **String**| A comma delimited string of catgory names to limit the response to certain categories. If nothing is provided, all charts under every category would be listed out. | [optional] 

### Return type

[**[CategoryChartListErrorObject]**](CategoryChartListErrorObject.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## images

> File images(chart, opts)

Get chart image back in PNG or JPEG formats

Get a chart image in PNG or JPEG formats with the images() API call.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, ChartTemplatesApi } = require('@factset/sdk-chartgenerationservice');
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

const apiInstance = new ChartTemplatesApi();
const chart = Equity/RSI; // String | Path to the saved chart. For any of the default charts, the option should be `categoryName + '/' + chartName`. For charts under the Client or Personal directories, the option should be `directoryName + ':/' + pathTotheChart`.  
const opts = {
  'ids': FDS,AAPL, // String | List of identifiers to be charted in a comma(,) separated string. Only the first one would be considered as primary and rest would be added as comps. Check the catalog for more information on which charts require a ticker.
  'sd': -1Y, // String | Option for overriding the startDate of the chart.  #### Absolute Dates  For absolute dates, provide a string in `YYYYMMDD` format.  #### Relative Dates  Relative dates represent a date relative to the most recently-updated period. For example, 0 (zero) represents the most recently-updated period; -1 represents the time period prior to the most recently updated.\\ \\ The \"zero date\" is determined by the default time period or the natural frequency of the data being requested. Zero (0), when used with monthly data, indicates the most recent month-end. Negative one (-1), when used with annual data, indicates one fiscal year prior to the most recently-updated fiscal year.  #### Relative Date Options  **D:** `0D` is the most recent trading day, `-1D` is one trading day prior  **M:** `0M` is the last trading day of the most recent month, `-1M` is the last trading day of the prior month  **AY:** `0AY` is the most recent trading day, `-1AY` is one actual year (365 days) prior  **Y:** `0Y` is the last trading day of the company's most recent fiscal year, `-1Y` is the last trading day of the prior fiscal year\\ \\ For more information and examples, refer to our [date format documentation](https://my.apps.factset.com/oa/pages/1964#date_f).
  'ed': 0, // String | Option for overriding the endDate of the chart. For absolute dates provide a string in `YYYYMMDD` format. We can also specify relative date options as described in the above `sd` option.
  'width': 600, // Number | Option for setting the width of the image
  'height': 500, // Number | Option for setting the height of the image
  'freq': D, // String | A shorthand string for the overall frequency of the chart like `D` (daily), `W` (weekly), `Y` (yearly) and `Q` (Quarterly). This will default to frequency stored in the document.
  'ccy': USD, // String | Currency ISO code for the overall currency of the chart. The API doesn't allow per series currency at this point in time.
  'split': SPLIT, // String | Option to specify the splits adjustment
  'spin': 1, // Number | Numeric option to specify the spinOffs adjustment. Possible options include `0` (When we only want spits adjustment), `1` (spinOffs), `4` (spinOffs and cash dividends) and `9` (No adjustments)
  'cal': "'local'", // String | Option for the calendarType of the chart
  'title': "title_example", // String | Option to customize the title. If you don't customize the title, then it displays by default the security name.
  'fontSize': 10, // Number | Option to adjust chart's fontSize
  'type': "'png'", // String | The type of image to be generated by the service
  'gridLines': false, // Boolean | Option to toggle gridLines on/off on the chart
  'decimalPrecision': 2 // Number | Option to add custom decimal precision on the chart
};

// Call api endpoint
apiInstance.images(chart, opts).then(
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
 **chart** | **String**| Path to the saved chart. For any of the default charts, the option should be &#x60;categoryName + &#39;/&#39; + chartName&#x60;. For charts under the Client or Personal directories, the option should be &#x60;directoryName + &#39;:/&#39; + pathTotheChart&#x60;.   | 
 **ids** | **String**| List of identifiers to be charted in a comma(,) separated string. Only the first one would be considered as primary and rest would be added as comps. Check the catalog for more information on which charts require a ticker. | [optional] 
 **sd** | **String**| Option for overriding the startDate of the chart.  #### Absolute Dates  For absolute dates, provide a string in &#x60;YYYYMMDD&#x60; format.  #### Relative Dates  Relative dates represent a date relative to the most recently-updated period. For example, 0 (zero) represents the most recently-updated period; -1 represents the time period prior to the most recently updated.\\ \\ The \&quot;zero date\&quot; is determined by the default time period or the natural frequency of the data being requested. Zero (0), when used with monthly data, indicates the most recent month-end. Negative one (-1), when used with annual data, indicates one fiscal year prior to the most recently-updated fiscal year.  #### Relative Date Options  **D:** &#x60;0D&#x60; is the most recent trading day, &#x60;-1D&#x60; is one trading day prior  **M:** &#x60;0M&#x60; is the last trading day of the most recent month, &#x60;-1M&#x60; is the last trading day of the prior month  **AY:** &#x60;0AY&#x60; is the most recent trading day, &#x60;-1AY&#x60; is one actual year (365 days) prior  **Y:** &#x60;0Y&#x60; is the last trading day of the company&#39;s most recent fiscal year, &#x60;-1Y&#x60; is the last trading day of the prior fiscal year\\ \\ For more information and examples, refer to our [date format documentation](https://my.apps.factset.com/oa/pages/1964#date_f). | [optional] 
 **ed** | **String**| Option for overriding the endDate of the chart. For absolute dates provide a string in &#x60;YYYYMMDD&#x60; format. We can also specify relative date options as described in the above &#x60;sd&#x60; option. | [optional] 
 **width** | **Number**| Option for setting the width of the image | [optional] [default to 1056]
 **height** | **Number**| Option for setting the height of the image | [optional] [default to 816]
 **freq** | **String**| A shorthand string for the overall frequency of the chart like &#x60;D&#x60; (daily), &#x60;W&#x60; (weekly), &#x60;Y&#x60; (yearly) and &#x60;Q&#x60; (Quarterly). This will default to frequency stored in the document. | [optional] 
 **ccy** | **String**| Currency ISO code for the overall currency of the chart. The API doesn&#39;t allow per series currency at this point in time. | [optional] 
 **split** | **String**| Option to specify the splits adjustment | [optional] 
 **spin** | **Number**| Numeric option to specify the spinOffs adjustment. Possible options include &#x60;0&#x60; (When we only want spits adjustment), &#x60;1&#x60; (spinOffs), &#x60;4&#x60; (spinOffs and cash dividends) and &#x60;9&#x60; (No adjustments) | [optional] 
 **cal** | **String**| Option for the calendarType of the chart | [optional] [default to &#39;local&#39;]
 **title** | **String**| Option to customize the title. If you don&#39;t customize the title, then it displays by default the security name. | [optional] 
 **fontSize** | **Number**| Option to adjust chart&#39;s fontSize | [optional] 
 **type** | **String**| The type of image to be generated by the service | [optional] [default to &#39;png&#39;]
 **gridLines** | **Boolean**| Option to toggle gridLines on/off on the chart | [optional] [default to true]
 **decimalPrecision** | **Number**| Option to add custom decimal precision on the chart | [optional] 

### Return type

**File**

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: img/png, img/jpeg, application/json

