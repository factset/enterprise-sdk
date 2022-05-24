# foreignexchangerate.ForwardsApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getFXForwards**](ForwardsApi.md#getFXForwards) | **GET** /foreign-exchange/v1/forwards | Gets Forwards for a list of currency pairs
[**getFXForwardsForList**](ForwardsApi.md#getFXForwardsForList) | **POST** /foreign-exchange/v1/forwards | Gets Forwards for a list of currency pairs



## getFXForwards

> ForwardsResponse getFXForwards(ids, opts)

Gets Forwards for a list of currency pairs

Forward rates are provided in 80+ currencies against the U.S. dollar, British pound, and euro. Forward quotes are provided by Reuters and coverage is determined by the amount of reliable currency trading in a particular currency. Bid, offer, and mid rates are available for 11 &#x60;forwardPeriod&#x60; periods - Overnight, Tomorrow Next, 1 Week (Spot Week), 1 month, 2 month, 3 month, 6 month, 9 month, 1 year, 2 year, 5 year. All identifiers have spot rates, but not all identifiers have forward rate data. 

### Example

```javascript
const { ApiClient, ForwardsApi } = require('@factset/sdk-foreignexchangerate');
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

const apiInstance = new ForwardsApi();
const ids = ["USDGBP"]; // [String] | The currency pair requested in the format of a ISO {source}{target}. For a complete list of ISO currencies, please visit [OA 1470](https://my.apps.factset.com/oa/pages/1470)
const opts = {
  'forwardPeriod': ON, // String | Bid, offer, and mid rates are available for the following 11 time periods.  * ON - Overnight  * TN - Tomorrow Next  * SW - One Week (Spot Week)  * 1M - One Month  * 2M - Two Months  * 3M - Three Months  * 6M - Six Months  * 9M - Nine Months  * 1Y - One Year  * 2Y - Two Years  * 5Y - Five Years 
  'startDate': 2019-01-01, // String | The start date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to latest available. 
  'endDate': 2019-12-31, // String | The end date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to latest available. 
  'frequency': D // String | Controls the display frequency of the data returned.   * **D** = Daily   * **W** = Weekly, based on the last day of the week of the start date.   * **M** = Monthly, based on the last trading day of the month.   * **AM** = Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16 etc.).    * **CQ** = Quarterly based on the last trading day of the calendar quarter (March, June, September, or December).   * **AY** = Actual Annual, based on the start date.   * **CY** = Calendar Annual, based on the last trading day of the calendar year. 
};

// Call api endpoint
apiInstance.getFXForwards(ids, opts).then(
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
 **forwardPeriod** | **String**| Bid, offer, and mid rates are available for the following 11 time periods.  * ON - Overnight  * TN - Tomorrow Next  * SW - One Week (Spot Week)  * 1M - One Month  * 2M - Two Months  * 3M - Three Months  * 6M - Six Months  * 9M - Nine Months  * 1Y - One Year  * 2Y - Two Years  * 5Y - Five Years  | [optional] [default to &#39;1M&#39;]
 **startDate** | **String**| The start date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to latest available.  | [optional] 
 **endDate** | **String**| The end date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to latest available.  | [optional] 
 **frequency** | **String**| Controls the display frequency of the data returned.   * **D** &#x3D; Daily   * **W** &#x3D; Weekly, based on the last day of the week of the start date.   * **M** &#x3D; Monthly, based on the last trading day of the month.   * **AM** &#x3D; Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16 etc.).    * **CQ** &#x3D; Quarterly based on the last trading day of the calendar quarter (March, June, September, or December).   * **AY** &#x3D; Actual Annual, based on the start date.   * **CY** &#x3D; Calendar Annual, based on the last trading day of the calendar year.  | [optional] [default to &#39;D&#39;]

### Return type

[**ForwardsResponse**](ForwardsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getFXForwardsForList

> ForwardsResponse getFXForwardsForList(forwardsRequest)

Gets Forwards for a list of currency pairs

Forward rates are provided in 80+ currencies against the U.S. dollar, British pound, and euro. Forward quotes are provided by Reuters and coverage is determined by the amount of reliable currency trading in a particular currency. Bid, offer, and mid rates are available for 11 &#x60;forwardPeriod&#x60; periods - Overnight, Tomorrow Next, 1 Week (Spot Week), 1 month, 2 month, 3 month, 6 month, 9 month, 1 year, 2 year, 5 year. All identifiers have spot rates, but not all identifiers have forward rate data. 

### Example

```javascript
const { ApiClient, ForwardsApi } = require('@factset/sdk-foreignexchangerate');
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

const apiInstance = new ForwardsApi();
const forwardsRequest = new foreignexchangerate.ForwardsRequest(); // ForwardsRequest | Request object for FX Forwards.

// Call api endpoint
apiInstance.getFXForwardsForList(forwardsRequest).then(
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
 **forwardsRequest** | [**ForwardsRequest**](ForwardsRequest.md)| Request object for FX Forwards. | 

### Return type

[**ForwardsResponse**](ForwardsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

