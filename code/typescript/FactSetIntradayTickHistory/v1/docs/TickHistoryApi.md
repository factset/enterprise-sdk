# factsetintradaytickhistory.TickHistoryApi

All URIs are relative to *https://api-sandbox.factset.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getTickHistory**](TickHistoryApi.md#getTickHistory) | **GET** /TickHistory/history | Tick History service returns trade data and associated quotes for a client specified interval and time period



## getTickHistory

> TickhistoryResponse getTickHistory(id, opts)

Tick History service returns trade data and associated quotes for a client specified interval and time period

When using an HTTP GET request, the seach criteria is sent via the query string in the URL. Please make sure that all requests contain a date within the past trailing year. Fields are added using ampersands, with enumerations seperated by commas. &lt;p&gt;**Try it Out** - references a sandbox environment to simulate live reponses. Available &#x60;id&#x60; is limited to BABA-USA,WALMEX-MX,7203-TKS,VOD-LON,NPN-JSE,MABAX,NZF,SPY-USA,AGG-USA,GLD-USA,AOR-USA,MNA-USA,UUP-USA,SP50-SPX,ESX-STX,XAO-ASX,WD-MSX,NG00-USA,GC00-USA,CC00-USA,C00-USA,FC00-USA,ER00-USA,EURUSD-FX1,USDMXN-FX1,AUDJPY-FX1,EURCZK-FX1,USDILS-FX1,USDZAR-FX1,US10YY-TU1,FDS#190621C00145000-USA,FDS#190621P00145000-USA. Current day data is not available.&lt;/p&gt;

### Example

```javascript
const { ApiClient, TickHistoryApi } = require('@factset/sdk-factsetintradaytickhistory');
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

const apiInstance = new TickHistoryApi();
const id = "id_example"; // String | Requested symbol or security. The symbol can be a FactSet exchange symbol, CUSIP, or SEDOL. **NOTE**: Only one identifier can be requested per request.<P>**TRY IT OUT** - Choose One from - BABA-USA,WALMEX-MX,7203-TKS,VOD-LON,NPN-JSE,MABAX,NZF,SPY-USA,AGG-USA,GLD-USA,AOR-USA,MNA-USA,UUP-USA,SP50-SPX,ESX-STX,XAO-ASX,WD-MSX,NG00-USA,GC00-USA,CC00-USA,C00-USA,FC00-USA,ER00-USA,EURUSD-FX1,USDMXN-FX1,AUDJPY-FX1,EURCZK-FX1,USDILS-FX1,USDZAR-FX1,US10YY-TU1,FDS#190621C00145000-USA,FDS#190621P00145000-USA
const opts = {
  'reqId': "reqId_example", // String | Request Identification String. Can be used by the application to keep track of requests.  The id is not used by this service, however, it is included in the XML response.
  'format': "'XML'", // String | The format of the output file. **TRY IT OUT** Choose from JSON, CSV, CSV_NO_HEADER
  'fields': "fields_example", // String | All available fields. This is a comma-seperated list (no spaces). See definitions for details. Default is all fields when left blank.
  'sd': "sd_example", // String | This is the start date for the Snapshot History. Requests should be made in the format **YYYYMMDD**. Default is current business day. Field can be sd or date. **TRY IT OUT** Cannot use current day.
  'ed': "ed_example", // String | This is the end date for teh Snapshot History. Requests should be made in the format **YYYYMMDD**. If the period requested is larger than Max. Days requested, results will be limited to the Max Days starting at sd/date. Defautl is sd or date. **TRY IT OUT** Cannot use current day.
  'st': "'040000'", // String | Requested start time. This is the start time for the snapshot history requested. Requests should be made in a **HHMMSSS** format. Range from 000000 - 235959. **TRY IT OUT** Cannot use current day.
  'et': "'200000'", // String | Requested end time. This is the end time for the snapshot history requested. Requests should be made in a **HHMMSSS** format. Range from 000000 - 235959. **TRY IT OUT** Cannot use current day.
  'interval': "'1M'", // String | Requested time interval. This is the interval the data is returned from the service. Possible values from 1 Second (1S) to 1 Hour (1H). A maximum of 10 Tick History Requests and a maximum of 100,000 rows of data may be made in any one-minute period. Additional subsctiption is available to access 20 requests/200,000 rows of data per minute. Contact your FactSet team for details.
  'includeRequest': "'false'", // String | Flag to include request id and key in the CSV output.
  'dataset': "dataset_example" // String | Decides what type of trades to return, default is all trades and quotes, alternatively charting can be selected which will filter out unofficial trades.
};

// Call api endpoint
apiInstance.getTickHistory(id, opts).then(
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
 **reqId** | **String**| Request Identification String. Can be used by the application to keep track of requests.  The id is not used by this service, however, it is included in the XML response. | [optional] 
 **format** | **String**| The format of the output file. **TRY IT OUT** Choose from JSON, CSV, CSV_NO_HEADER | [optional] [default to &#39;XML&#39;]
 **fields** | **String**| All available fields. This is a comma-seperated list (no spaces). See definitions for details. Default is all fields when left blank. | [optional] 
 **sd** | **String**| This is the start date for the Snapshot History. Requests should be made in the format **YYYYMMDD**. Default is current business day. Field can be sd or date. **TRY IT OUT** Cannot use current day. | [optional] 
 **ed** | **String**| This is the end date for teh Snapshot History. Requests should be made in the format **YYYYMMDD**. If the period requested is larger than Max. Days requested, results will be limited to the Max Days starting at sd/date. Defautl is sd or date. **TRY IT OUT** Cannot use current day. | [optional] 
 **st** | **String**| Requested start time. This is the start time for the snapshot history requested. Requests should be made in a **HHMMSSS** format. Range from 000000 - 235959. **TRY IT OUT** Cannot use current day. | [optional] [default to &#39;040000&#39;]
 **et** | **String**| Requested end time. This is the end time for the snapshot history requested. Requests should be made in a **HHMMSSS** format. Range from 000000 - 235959. **TRY IT OUT** Cannot use current day. | [optional] [default to &#39;200000&#39;]
 **interval** | **String**| Requested time interval. This is the interval the data is returned from the service. Possible values from 1 Second (1S) to 1 Hour (1H). A maximum of 10 Tick History Requests and a maximum of 100,000 rows of data may be made in any one-minute period. Additional subsctiption is available to access 20 requests/200,000 rows of data per minute. Contact your FactSet team for details. | [optional] [default to &#39;1M&#39;]
 **includeRequest** | **String**| Flag to include request id and key in the CSV output. | [optional] [default to &#39;false&#39;]
 **dataset** | **String**| Decides what type of trades to return, default is all trades and quotes, alternatively charting can be selected which will filter out unofficial trades. | [optional] 

### Return type

[**TickhistoryResponse**](TickhistoryResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/xml, text/csv

