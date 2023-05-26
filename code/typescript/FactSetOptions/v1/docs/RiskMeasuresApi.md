# factsetoptions.RiskMeasuresApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getOptionsATMImpliedVolatilityForList**](RiskMeasuresApi.md#getOptionsATMImpliedVolatilityForList) | **POST** /factset-options/v1/atm-implied-volatility | Returns the at-the-money (ATM) implied volatility details for the specified underlying security identifier
[**getOptionsGreeksForList**](RiskMeasuresApi.md#getOptionsGreeksForList) | **POST** /factset-options/v1/greeks | Returns all the Greeks details for the specified option identifier
[**getOptionsVolatilityForList**](RiskMeasuresApi.md#getOptionsVolatilityForList) | **POST** /factset-options/v1/implied-volatility | Returns the implied volatility information for the specified option identifier



## getOptionsATMImpliedVolatilityForList

> AtmImpliedVolatilityResponse getOptionsATMImpliedVolatilityForList(atmImpliedVolatilityRequest)

Returns the at-the-money (ATM) implied volatility details for the specified underlying security identifier

Returns weighted average of the implied volatilities from the options listed for a specified security identifier.   There are three different methods available for calculating at-the-money implied volatility (ATM IV), which gives a weighted average of the implied volatilities from the options listed on a given stock. They are ATM IV (Filtered), ATM IV (Filtered with Smoothing), and ATM IV (Market). Each of these ATM IV calculations is available for just the calls on a given stock, just the puts, or the composite of both the calls and puts. This at-the-money implied volatility market can calculated for different periods - * One Month * Two Months * Three Months * Four Months * Five Months * Six Months  *For more details regarding ATM Volatility calculations, visit [OA 16276](https://my.apps.factset.com/oa/pages/16276)*    *Currently only OPRA Exchange traded options are supported* 

### Example

```javascript
const { ApiClient, RiskMeasuresApi } = require('@factset/sdk-factsetoptions');
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

const apiInstance = new RiskMeasuresApi();
const atmImpliedVolatilityRequest = new factsetoptions.AtmImpliedVolatilityRequest(); // AtmImpliedVolatilityRequest | 

// Call api endpoint
apiInstance.getOptionsATMImpliedVolatilityForList(atmImpliedVolatilityRequest).then(
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
 **atmImpliedVolatilityRequest** | [**AtmImpliedVolatilityRequest**](AtmImpliedVolatilityRequest.md)|  | 

### Return type

[**AtmImpliedVolatilityResponse**](AtmImpliedVolatilityResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## getOptionsGreeksForList

> GreeksResponse getOptionsGreeksForList(greeksRequest)

Returns all the Greeks details for the specified option identifier

Returns all the greeks details for the specified option identifier. Greeks provide quantifiable factors for measuring the option&#39;s price sensativity. Greeks include -  |Greek|Description| |---|---| |Delta| The ratio comparing the change in the price of the underlying asset to the corresponding change in the price of a derivative. Sometimes referred to as the \&quot;hedge ratio\&quot;. For example, with respect to call options, a delta of 0.7 means that for every $1 the underlying stock increases, the call option will increase by $0.70. Put option deltas, on the other hand, will be negative, because as the underlying security increases, the value of the option will decrease. So a put option with a delta of -0.7 will decrease by $0.70 for every $1 the underlying increases in price. As an in-the-money call option nears expiration, it will approach a delta of 1.00, and as an in-the-money put option nears expiration, it will approach a delta of -1.00.| |Gamma| The rate of change for delta with respect to the underlying asset&#39;s price. Mathematically, gamma is the first derivative of delta and is used when trying to gauge the price of an option relative to the amount it is in or out of the money. When the option being measured is deep in or out of the money, gamma is small. When the option is near the money, gamma is largest.| |Rho|The rate at which the price of a derivative changes relative to a change in the risk-free rate of interest. Rho measures the sensitivity of an option or options portfolio to a change in interest rate.| |Theta|A measure of the rate of decline in the value of an option due to the passage of time. Theta can also be referred to as the time decay on the value of an option. If everything is held constant, then the option will lose value as time moves closer to the maturity of the option. For example, if the strike price of an option is $1,150 and theta is 53.80, then in theory the value of the option will drop $53.80 per day. The measure of theta quantifies the risk that time imposes on options as options are only exercisable for a certain period of time.| |Vega|The amount that the price of an option changes compared to a 1% change in volatility. Vega changes when there are large price movements in the underlying asset and vega falls as the option gets closer to maturity. Vega can change even if there is no change in the price of the underlying asset, this would happen if there is a change in expected volatility. For example, if the vega of an option is -96.94 and if implied volatility were to rise by 1% then the option value would fall by $96.94.|  Note   * Each step in the binomial model represents a change in time, therefore, point estimates of the Greeks can be calculated for American options. The following can be used to calculate the Greeks for the Binomial Option Pricing Model (BOPM) pricing model, using the notation fstep,node so f1,1 represents the option price at the first step, top node (nodes are counted at each step starting with 0 at the bottom. See [Constructing the Tree](https://my.apps.factset.com/oa/pages/17735#tree) for more information).    For more detials on calculation methodologies, visit [OA 14933](https://my.apps.factset.com/oa/pages/14933).     *Currently only OPRA Exchange is supported with exchange ISO \&quot;USA\&quot;* 

### Example

```javascript
const { ApiClient, RiskMeasuresApi } = require('@factset/sdk-factsetoptions');
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

const apiInstance = new RiskMeasuresApi();
const greeksRequest = new factsetoptions.GreeksRequest(); // GreeksRequest | Greeks Request Object

// Call api endpoint
apiInstance.getOptionsGreeksForList(greeksRequest).then(
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
 **greeksRequest** | [**GreeksRequest**](GreeksRequest.md)| Greeks Request Object | 

### Return type

[**GreeksResponse**](GreeksResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## getOptionsVolatilityForList

> ImpliedVolatilityResponse getOptionsVolatilityForList(impliedVolatilityRequest)

Returns the implied volatility information for the specified option identifier

Returns the Implied Volatility for the specified option across European and American contracts. For more details regarding Implied Volatility calculations visit - [OA 14932](https://my.apps.factset.com/oa/pages/14932)  *Currently the following exchanges are not supported for API use cases - CME, CMEE, CBT, CBTE, NYM, NYME* 

### Example

```javascript
const { ApiClient, RiskMeasuresApi } = require('@factset/sdk-factsetoptions');
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

const apiInstance = new RiskMeasuresApi();
const impliedVolatilityRequest = new factsetoptions.ImpliedVolatilityRequest(); // ImpliedVolatilityRequest | Volatility Request Object

// Call api endpoint
apiInstance.getOptionsVolatilityForList(impliedVolatilityRequest).then(
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
 **impliedVolatilityRequest** | [**ImpliedVolatilityRequest**](ImpliedVolatilityRequest.md)| Volatility Request Object | 

### Return type

[**ImpliedVolatilityResponse**](ImpliedVolatilityResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

