# intradaytickhistory.FirstTradeApi

All URIs are relative to *https://api-sandbox.factset.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**tickHistoryFirsttradeGet**](FirstTradeApi.md#tickHistoryFirsttradeGet) | **GET** /TickHistory/firsttrade | Request returns data for the first trade (official and unofficial) after the specified time



## tickHistoryFirsttradeGet

> TickhistoryResponse tickHistoryFirsttradeGet(id, opts)

Request returns data for the first trade (official and unofficial) after the specified time

### Example

```javascript
const { ApiClient, FirstTradeApi } = require('@factset/sdk-intradaytickhistory');
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

const apiInstance = new FirstTradeApi();
const id = "id_example"; // String | Requested symbol or security. The symbol can be a FactSet exchange symbol, CUSIP, or SEDOL. **NOTE**: Only one identifier can be requested per request.<P>**TRY IT OUT** - Choose One from - BABA-USA,WALMEX-MX,7203-TKS,VOD-LON,NPN-JSE,MABAX,NZF,SPY-USA,AGG-USA,GLD-USA,AOR-USA,MNA-USA,UUP-USA,SP50-SPX,ESX-STX,XAO-ASX,WD-MSX,NG00-USA,GC00-USA,CC00-USA,C00-USA,FC00-USA,ER00-USA,EURUSD-FX1,USDMXN-FX1,AUDJPY-FX1,EURCZK-FX1,USDILS-FX1,USDZAR-FX1,US10YY-TU1,FDS#190621C00145000-USA,FDS#190621P00145000-USA
const opts = {
  'reqId': "reqId_example", // String | Request Identification String. Can be used by the application to keep track of requests. The id is not used by this service, however, it is included in the XML response.
  'startDate': "startDate_example", // String | This is the start date for the Snapshot History. Requests should be made in the format YYYYMMDD Default is current business day. Field can be sd or date. TRY IT OUT Cannot use current day.
  'startTime': "'040000'", // String | This is the start time for the snapshot history requested. Requests should be made in a **HHMMSSS** format.Range from 000000 - 235959. **TRY IT OUT** Cannot use current day
  'format': "'XML'", // String | The format of the output file. TRY IT OUT Choose from JSON, CSV, CSV_NO_HEADER
  'includeRequest': "'false'", // String | Flag to include request id and key in the CSV output.
  'dataset': "dataset_example" // String | Decides what type of trades to return, default is all trades and quotes, alternatively charting can be selected which will filter out unofficial trades.
};

// Call api endpoint
apiInstance.tickHistoryFirsttradeGet(id, opts).then(
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
 **startDate** | **String**| This is the start date for the Snapshot History. Requests should be made in the format YYYYMMDD Default is current business day. Field can be sd or date. TRY IT OUT Cannot use current day. | [optional] 
 **startTime** | **String**| This is the start time for the snapshot history requested. Requests should be made in a **HHMMSSS** format.Range from 000000 - 235959. **TRY IT OUT** Cannot use current day | [optional] [default to &#39;040000&#39;]
 **format** | **String**| The format of the output file. TRY IT OUT Choose from JSON, CSV, CSV_NO_HEADER | [optional] [default to &#39;XML&#39;]
 **includeRequest** | **String**| Flag to include request id and key in the CSV output. | [optional] [default to &#39;false&#39;]
 **dataset** | **String**| Decides what type of trades to return, default is all trades and quotes, alternatively charting can be selected which will filter out unofficial trades. | [optional] 

### Return type

[**TickhistoryResponse**](TickhistoryResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/xml, text/csv

