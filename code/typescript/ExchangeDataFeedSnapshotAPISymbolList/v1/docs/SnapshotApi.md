# exchangedatafeedsnapshotapisymbollist.SnapshotApi

All URIs are relative to *https://api-sandbox.factset.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDFSnapshot**](SnapshotApi.md#getDFSnapshot) | **GET** /DFSnapshot | Request a snapshot of exchange data for a list of symbols.
[**postDFSnapshot**](SnapshotApi.md#postDFSnapshot) | **POST** /DFSnapshot | Snap exchange data. Use if URL lengh of 2,048 is exceeded.



## getDFSnapshot

> DFSnapshotResponse getDFSnapshot(opts)

Request a snapshot of exchange data for a list of symbols.

 &#x60;ids&#x60; and &#x60;oc&#x60; are required parameters, but only one can be used based on request. Use &#x60;ids&#x60; for regular snapshot requests, and &#x60;oc&#x60; for requesting an option chain.   **Try it Out** feature is available using a pre-recorded sandbox environment. Follow Try it Out inscrutions on each parameter to develop a request and view a sample server response.  &#39;*You must be logged into the Developer Portal and obtain an **[API Key](https://developer.factset.com/factset/api-key-listing)** for &#39;&#39;Try it Out&#39;&#39; to receive a successful server response. Select **Authorize** button or visit **[Authentication Support](https://developer.factset.com/authentication)** for more details.*&#39; 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, SnapshotApi } = require('@factset/sdk-exchangedatafeedsnapshotapisymbollist');
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

const apiInstance = new SnapshotApi();
const opts = {
  'ids': "ids_example", // String | Requested symbols or securities. **Required** if not using `oc`. This is a comma-seperated list with a maximum of 500. Each symbol can be a FactSet Exchange Symbol, CUSIP, or SEDOL. This can be used in combination with `chain` parameter to pull in a custom portfolio.<P>**Try it out** - Choose one or multiple - IBM-USA, BABA-USA, WALMEX-MX, 7203-TKS, VOD-LON, NPN-JSE, MABAX, NZF, SPY-USA, AGG-USA, GLD-USA, AOR-USA, MNA-USA, UUP-USA, SP50-SPX, ESX-STX, XAO-ASX, WD-MSX, NG00-USA, GC00-USA, CC00-USA, C00-USA, FC00-USA, ER00-USA, EURUSD-FX1, USDMXN-FX1, AUDJPY-FX1, EURCZK-FX1, USDILS-FX1, USDZAR-FX1, US10YY-TU1, FDS#190621C00145000-USA, FDS#190621P00145000-USA. *Leave blank if you are trying the `oc` parameter*.</p>
  'oc': "oc_example", // String | Option Chain, accepts one underlying symbol for which the option chain will be returned. **Required** if not using `ids`. <p>**Try it Out** - Only available for BABA-USA</p>
  'fields': "fields_example", // String | All available fields. This is a comma-seperated list (no spaces). **Required** only when using `oc`. Otherwise, leave blank to return all fields by default. See definitions for details on available field names and Field ID #s. The Data Service Manual has complete reference.<p>**Try it Out** - All fields available. Use either FID # or name. For `oc`, recommend to use BID_1,ASK_1,STRIKE_PRICE.
  'sf': "sf_example", // String | Symbol Filters, ability to apply filtering to the result of an option chain `oc` request based on available fields and values for the symbols. `sf`=VALUE_[filter],[field],[value]   * **VALUE_MINMAX** -  Field value will be within specified interval. ex. - VALUE_MINMAX,BID_1,min,max   * **VALUE_EQUALS** - Field value will equal specified value. ex. - VALUE_EQUALS,BID_1,value   * **VALUE_NOT_EQUALS** - Field value will not equal specified value. ex. - VALUE_NOT_EQUALS,BID_1,value      **Try it Out** - depends on fields used. Example - VALUE_MINMAX,STRIKE_PRICE,120,130  
  'format': "'XML'", // String | The format of the output file.<p>**Try it Out** - All formats available</p>
  'serv': "serv_example", // String | The Data Service that handles the request for the specified symbols. Available live services are -    * **FDS1** -Production Data Service   * **FDS_FUND** -Fundamental Data Service used for End-of-Day data.  **Try it Out** - use FDS1 
  'reqId': "reqId_example" // String | Request Identification String. Can be used by the application to keep track of requests.  The id is not used by this service, however, it is included in the XML response.<p> **Try it Out** - any value can be passed through.</p>
};

// Call api endpoint
apiInstance.getDFSnapshot(opts).then(
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
 **ids** | **String**| Requested symbols or securities. **Required** if not using &#x60;oc&#x60;. This is a comma-seperated list with a maximum of 500. Each symbol can be a FactSet Exchange Symbol, CUSIP, or SEDOL. This can be used in combination with &#x60;chain&#x60; parameter to pull in a custom portfolio.&lt;P&gt;**Try it out** - Choose one or multiple - IBM-USA, BABA-USA, WALMEX-MX, 7203-TKS, VOD-LON, NPN-JSE, MABAX, NZF, SPY-USA, AGG-USA, GLD-USA, AOR-USA, MNA-USA, UUP-USA, SP50-SPX, ESX-STX, XAO-ASX, WD-MSX, NG00-USA, GC00-USA, CC00-USA, C00-USA, FC00-USA, ER00-USA, EURUSD-FX1, USDMXN-FX1, AUDJPY-FX1, EURCZK-FX1, USDILS-FX1, USDZAR-FX1, US10YY-TU1, FDS#190621C00145000-USA, FDS#190621P00145000-USA. *Leave blank if you are trying the &#x60;oc&#x60; parameter*.&lt;/p&gt; | [optional] 
 **oc** | **String**| Option Chain, accepts one underlying symbol for which the option chain will be returned. **Required** if not using &#x60;ids&#x60;. &lt;p&gt;**Try it Out** - Only available for BABA-USA&lt;/p&gt; | [optional] 
 **fields** | **String**| All available fields. This is a comma-seperated list (no spaces). **Required** only when using &#x60;oc&#x60;. Otherwise, leave blank to return all fields by default. See definitions for details on available field names and Field ID #s. The Data Service Manual has complete reference.&lt;p&gt;**Try it Out** - All fields available. Use either FID # or name. For &#x60;oc&#x60;, recommend to use BID_1,ASK_1,STRIKE_PRICE. | [optional] 
 **sf** | **String**| Symbol Filters, ability to apply filtering to the result of an option chain &#x60;oc&#x60; request based on available fields and values for the symbols. &#x60;sf&#x60;&#x3D;VALUE_[filter],[field],[value]   * **VALUE_MINMAX** -  Field value will be within specified interval. ex. - VALUE_MINMAX,BID_1,min,max   * **VALUE_EQUALS** - Field value will equal specified value. ex. - VALUE_EQUALS,BID_1,value   * **VALUE_NOT_EQUALS** - Field value will not equal specified value. ex. - VALUE_NOT_EQUALS,BID_1,value      **Try it Out** - depends on fields used. Example - VALUE_MINMAX,STRIKE_PRICE,120,130   | [optional] 
 **format** | **String**| The format of the output file.&lt;p&gt;**Try it Out** - All formats available&lt;/p&gt; | [optional] [default to &#39;XML&#39;]
 **serv** | **String**| The Data Service that handles the request for the specified symbols. Available live services are -    * **FDS1** -Production Data Service   * **FDS_FUND** -Fundamental Data Service used for End-of-Day data.  **Try it Out** - use FDS1  | [optional] 
 **reqId** | **String**| Request Identification String. Can be used by the application to keep track of requests.  The id is not used by this service, however, it is included in the XML response.&lt;p&gt; **Try it Out** - any value can be passed through.&lt;/p&gt; | [optional] 

### Return type

[**DFSnapshotResponse**](DFSnapshotResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/xml, text/csv


## postDFSnapshot

> DFSnapshotResponse postDFSnapshot(opts)

Snap exchange data. Use if URL lengh of 2,048 is exceeded.

Request Snapshot exchange data. Use POST when your URL length exceeds 2,048 characters.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, SnapshotApi } = require('@factset/sdk-exchangedatafeedsnapshotapisymbollist');
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

const apiInstance = new SnapshotApi();
const opts = {
  'ids': "ids_example", // String | Requested symbols or securities. **Required** if not using `oc`. This is a comma-seperated list with a maximum of 500. Each symbol can be a FactSet Exchange Symbol, CUSIP, or SEDOL. This can be used in combination with `chain` parameter to pull in a custom portfolio.<P>**Try it out** - Choose one or multiple - IBM-USA, BABA-USA, WALMEX-MX, 7203-TKS, VOD-LON, NPN-JSE, MABAX, NZF, SPY-USA, AGG-USA, GLD-USA, AOR-USA, MNA-USA, UUP-USA, SP50-SPX, ESX-STX, XAO-ASX, WD-MSX, NG00-USA, GC00-USA, CC00-USA, C00-USA, FC00-USA, ER00-USA, EURUSD-FX1, USDMXN-FX1, AUDJPY-FX1, EURCZK-FX1, USDILS-FX1, USDZAR-FX1, US10YY-TU1, FDS#190621C00145000-USA, FDS#190621P00145000-USA. *Leave blank if you are trying the `oc` parameter*.</p>
  'oc': "oc_example", // String | Option Chain, accepts one underlying symbol for which the option chain will be returned. **Required** if not using `ids`. <p>**Try it Out** - Only available for BABA-USA</p>
  'fields': "fields_example", // String | All available fields. This is a comma-seperated list (no spaces). **Required** only when using `oc`. Otherwise, leave blank to return all fields by default. See definitions for details on available field names and Field ID #s. The Data Service Manual has complete reference.<p>**Try it Out** - All fields available. Use either FID # or name. For `oc`, recommend to use BID_1,ASK_1,STRIKE_PRICE.
  'sf': "sf_example", // String | Symbol Filters, ability to apply filtering to the result of an option chain `oc` request based on available fields and values for the symbols. `sf`=VALUE_[filter],[field],[value]   * **VALUE_MINMAX** -  Field value will be within specified interval. ex. - VALUE_MINMAX,BID_1,min,max   * **VALUE_EQUALS** - Field value will equal specified value. ex. - VALUE_EQUALS,BID_1,value   * **VALUE_NOT_EQUALS** - Field value will not equal specified value. ex. - VALUE_NOT_EQUALS,BID_1,value      **Try it Out** - depends on fields used. Example - VALUE_MINMAX,STRIKE_PRICE,120,130  
  'format': "'XML'", // String | The format of the output file.<p>**Try it Out** - All formats available</p>
  'serv': "serv_example", // String | The Data Service that handles the request for the specified symbols. Available live services are -    * **FDS1** -Production Data Service   * **FDS_FUND** -Fundamental Data Service used for End-of-Day data.  **Try it Out** - use FDS1 
  'reqId': "reqId_example" // String | Request Identification String. Can be used by the application to keep track of requests.  The id is not used by this service, however, it is included in the XML response.<p> **Try it Out** - any value can be passed through.</p>
};

// Call api endpoint
apiInstance.postDFSnapshot(opts).then(
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
 **ids** | **String**| Requested symbols or securities. **Required** if not using &#x60;oc&#x60;. This is a comma-seperated list with a maximum of 500. Each symbol can be a FactSet Exchange Symbol, CUSIP, or SEDOL. This can be used in combination with &#x60;chain&#x60; parameter to pull in a custom portfolio.&lt;P&gt;**Try it out** - Choose one or multiple - IBM-USA, BABA-USA, WALMEX-MX, 7203-TKS, VOD-LON, NPN-JSE, MABAX, NZF, SPY-USA, AGG-USA, GLD-USA, AOR-USA, MNA-USA, UUP-USA, SP50-SPX, ESX-STX, XAO-ASX, WD-MSX, NG00-USA, GC00-USA, CC00-USA, C00-USA, FC00-USA, ER00-USA, EURUSD-FX1, USDMXN-FX1, AUDJPY-FX1, EURCZK-FX1, USDILS-FX1, USDZAR-FX1, US10YY-TU1, FDS#190621C00145000-USA, FDS#190621P00145000-USA. *Leave blank if you are trying the &#x60;oc&#x60; parameter*.&lt;/p&gt; | [optional] 
 **oc** | **String**| Option Chain, accepts one underlying symbol for which the option chain will be returned. **Required** if not using &#x60;ids&#x60;. &lt;p&gt;**Try it Out** - Only available for BABA-USA&lt;/p&gt; | [optional] 
 **fields** | **String**| All available fields. This is a comma-seperated list (no spaces). **Required** only when using &#x60;oc&#x60;. Otherwise, leave blank to return all fields by default. See definitions for details on available field names and Field ID #s. The Data Service Manual has complete reference.&lt;p&gt;**Try it Out** - All fields available. Use either FID # or name. For &#x60;oc&#x60;, recommend to use BID_1,ASK_1,STRIKE_PRICE. | [optional] 
 **sf** | **String**| Symbol Filters, ability to apply filtering to the result of an option chain &#x60;oc&#x60; request based on available fields and values for the symbols. &#x60;sf&#x60;&#x3D;VALUE_[filter],[field],[value]   * **VALUE_MINMAX** -  Field value will be within specified interval. ex. - VALUE_MINMAX,BID_1,min,max   * **VALUE_EQUALS** - Field value will equal specified value. ex. - VALUE_EQUALS,BID_1,value   * **VALUE_NOT_EQUALS** - Field value will not equal specified value. ex. - VALUE_NOT_EQUALS,BID_1,value      **Try it Out** - depends on fields used. Example - VALUE_MINMAX,STRIKE_PRICE,120,130   | [optional] 
 **format** | **String**| The format of the output file.&lt;p&gt;**Try it Out** - All formats available&lt;/p&gt; | [optional] [default to &#39;XML&#39;]
 **serv** | **String**| The Data Service that handles the request for the specified symbols. Available live services are -    * **FDS1** -Production Data Service   * **FDS_FUND** -Fundamental Data Service used for End-of-Day data.  **Try it Out** - use FDS1  | [optional] 
 **reqId** | **String**| Request Identification String. Can be used by the application to keep track of requests.  The id is not used by this service, however, it is included in the XML response.&lt;p&gt; **Try it Out** - any value can be passed through.&lt;/p&gt; | [optional] 

### Return type

[**DFSnapshotResponse**](DFSnapshotResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/xml, text/csv

