# factsetintradaytickhistory.TradesAtTimeApi

All URIs are relative to *https://api-sandbox.factset.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**tickHistoryTradesattimeGet**](TradesAtTimeApi.md#tickHistoryTradesattimeGet) | **GET** /TickHistory/tradesattime | Request returns the before and after trade data along with the associated quotes for the specified time



## tickHistoryTradesattimeGet

> TickhistoryResponse tickHistoryTradesattimeGet(id, opts)

Request returns the before and after trade data along with the associated quotes for the specified time

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, TradesAtTimeApi } = require('@factset/sdk-factsetintradaytickhistory');
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

const apiInstance = new TradesAtTimeApi();
const id = "id_example"; // String | Requested symbol or security. The symbol can be a FactSet exchange symbol, CUSIP, or SEDOL. **NOTE**: Only one identifier can be requested per request.<P>**TRY IT OUT** - Choose One from - BABA-USA,WALMEX-MX,7203-TKS,VOD-LON,NPN-JSE,MABAX,NZF,SPY-USA,AGG-USA,GLD-USA,AOR-USA,MNA-USA,UUP-USA,SP50-SPX,ESX-STX,XAO-ASX,WD-MSX,NG00-USA,GC00-USA,CC00-USA,C00-USA,FC00-USA,ER00-USA,EURUSD-FX1,USDMXN-FX1,AUDJPY-FX1,EURCZK-FX1,USDILS-FX1,USDZAR-FX1,US10YY-TU1,FDS#190621C00145000-USA,FDS#190621P00145000-USA
const opts = {
  'reqId': "reqId_example", // String | Request Identification String. Can be used by the application to keep track of requests. The id is not used by this service, however, it is included in the XML response.
  'format': "'XML'", // String | The format of the output file. TRY IT OUT Choose from JSON, CSV, CSV_NO_HEADER
  'date': "date_example", // String | Request should be made in the format **YYYYMMDD**. The initial release only supports requests from completed trading days
  'time': "time_example" // String | Request should be made in the format **HHMMSSS**.HH- Hour, MM- Minutes, SS- Seconds
};

// Call api endpoint
apiInstance.tickHistoryTradesattimeGet(id, opts).then(
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
 **id** | **String**| Requested symbol or security. The symbol can be a FactSet exchange symbol, CUSIP, or SEDOL. **NOTE**: Only one identifier can be requested per request.&lt;P&gt;**TRY IT OUT** - Choose One from - BABA-USA,WALMEX-MX,7203-TKS,VOD-LON,NPN-JSE,MABAX,NZF,SPY-USA,AGG-USA,GLD-USA,AOR-USA,MNA-USA,UUP-USA,SP50-SPX,ESX-STX,XAO-ASX,WD-MSX,NG00-USA,GC00-USA,CC00-USA,C00-USA,FC00-USA,ER00-USA,EURUSD-FX1,USDMXN-FX1,AUDJPY-FX1,EURCZK-FX1,USDILS-FX1,USDZAR-FX1,US10YY-TU1,FDS#190621C00145000-USA,FDS#190621P00145000-USA | 
 **reqId** | **String**| Request Identification String. Can be used by the application to keep track of requests. The id is not used by this service, however, it is included in the XML response. | [optional] 
 **format** | **String**| The format of the output file. TRY IT OUT Choose from JSON, CSV, CSV_NO_HEADER | [optional] [default to &#39;XML&#39;]
 **date** | **String**| Request should be made in the format **YYYYMMDD**. The initial release only supports requests from completed trading days | [optional] 
 **time** | **String**| Request should be made in the format **HHMMSSS**.HH- Hour, MM- Minutes, SS- Seconds | [optional] 

### Return type

[**TickhistoryResponse**](TickhistoryResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/xml, text/csv

