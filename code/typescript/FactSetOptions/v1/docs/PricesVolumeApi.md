# factsetoptions.PricesVolumeApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getOptionsPricesForList**](PricesVolumeApi.md#getOptionsPricesForList) | **POST** /factset-options/v1/prices | Returns the pricing related information for the specified option identifier
[**getOptionsVolumeForList**](PricesVolumeApi.md#getOptionsVolumeForList) | **POST** /factset-options/v1/volume | Returns the volume details for the specified option identifier
[**getUnderlyingVolumeForList**](PricesVolumeApi.md#getUnderlyingVolumeForList) | **POST** /factset-options/v1/underlying-volume | Returns the aggregate volume and open interest for the list of the options under the specified security identifier



## getOptionsPricesForList

> OptionsPricesResponse getOptionsPricesForList(optionsPricesRequest)

Returns the pricing related information for the specified option identifier

Returns the pricing related information for the specified option identifier. Items include -  * Ask * Bid * Mid * Mid Bid Ask * Settlement * Last Price Type (Settlement or MidBidAsk) * Last Price * Strike Price * Underlying Security Price * 52 Week High/Low * Open, High, Low for day. Note securities must be trading for day requested.    *Currently only OPRA Exchange is supported with exchange ISO \&quot;USA\&quot;* 

### Example

```javascript
const { ApiClient, PricesVolumeApi } = require('@factset/sdk-factsetoptions');
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

const apiInstance = new PricesVolumeApi();
const optionsPricesRequest = new factsetoptions.OptionsPricesRequest(); // OptionsPricesRequest | Options Prices Request Body

// Call api endpoint
apiInstance.getOptionsPricesForList(optionsPricesRequest).then(
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
 **optionsPricesRequest** | [**OptionsPricesRequest**](OptionsPricesRequest.md)| Options Prices Request Body | 

### Return type

[**OptionsPricesResponse**](OptionsPricesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## getOptionsVolumeForList

> OptionsVolumeResponse getOptionsVolumeForList(optionsVolumeRequest)

Returns the volume details for the specified option identifier

Returns the volume details for the specified option identifier for a specified exchange. Data items include -  * Open Interest * Volume    *Currently only OPRA Exchange is supported with exchange ISO \&quot;USA\&quot;* 

### Example

```javascript
const { ApiClient, PricesVolumeApi } = require('@factset/sdk-factsetoptions');
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

const apiInstance = new PricesVolumeApi();
const optionsVolumeRequest = new factsetoptions.OptionsVolumeRequest(); // OptionsVolumeRequest | Volume Request Object

// Call api endpoint
apiInstance.getOptionsVolumeForList(optionsVolumeRequest).then(
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
 **optionsVolumeRequest** | [**OptionsVolumeRequest**](OptionsVolumeRequest.md)| Volume Request Object | 

### Return type

[**OptionsVolumeResponse**](OptionsVolumeResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## getUnderlyingVolumeForList

> UnderlyingVolumeResponse getUnderlyingVolumeForList(underlyingVolumeRequest)

Returns the aggregate volume and open interest for the list of the options under the specified security identifier

Return the Volume and Open Interest details for list of the options for the specified underlying security identifier. The data is aggregated for all options contracts associated to the underlying id, or specified in the request only the contracts listed on a specific exchange. Data Includes -  * Put Call Ratio  * Total Put Volume &amp; Open Interest * Total Call Volume &amp; Open Interest * Total Put &amp; Call Volume &amp; Open Interest    *Currently only OPRA Exchange is supported with exchange ISO \&quot;USA\&quot;* 

### Example

```javascript
const { ApiClient, PricesVolumeApi } = require('@factset/sdk-factsetoptions');
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

const apiInstance = new PricesVolumeApi();
const underlyingVolumeRequest = new factsetoptions.UnderlyingVolumeRequest(); // UnderlyingVolumeRequest | Underlying Volume Request Body

// Call api endpoint
apiInstance.getUnderlyingVolumeForList(underlyingVolumeRequest).then(
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
 **underlyingVolumeRequest** | [**UnderlyingVolumeRequest**](UnderlyingVolumeRequest.md)| Underlying Volume Request Body | 

### Return type

[**UnderlyingVolumeResponse**](UnderlyingVolumeResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

