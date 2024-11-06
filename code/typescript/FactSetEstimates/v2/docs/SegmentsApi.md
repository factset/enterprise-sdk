# factsetestimates.SegmentsApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getSegments**](SegmentsApi.md#getSegments) | **GET** /factset-estimates/v2/segments | Retrieves product &amp; geographic segment estimates for a requested list of ids and fiscal periods
[**getSegmentsForList**](SegmentsApi.md#getSegmentsForList) | **POST** /factset-estimates/v2/segments | Retrieves product segment estimates for a requested list of ids and fiscal periods



## getSegments

> SegmentsResponse getSegments(ids, segmentType, metrics, opts)

Retrieves product &amp; geographic segment estimates for a requested list of ids and fiscal periods

Returns FactSet Estimates Consensus Data for the segments gathered from the Business, Geographical, or Actual Reconciliation (ADJUSTMENT) classifications by using fiscal periods with a reporting frequency.  

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, SegmentsApi } = require('@factset/sdk-factsetestimates');
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

const apiInstance = new SegmentsApi();
const ids = ["AAPL-USA"]; // [String] | Security or Entity identifiers. FactSet Identifiers, tickers, CUSIP and SEDOL are accepted input. <p>***ids limit** =  50 per request*</p> * Make Note - id limit of 50 for defaults, otherwise the service is limited to a 30 second duration. This can be reached when increasing total number of metrics requested and depth of history. * 
const segmentType = BUS; // String | Controls the type of segment selected.   * **BUS** = Business / Product Segment   * **GEO** = Geographic Segment 
const metrics = ["SALES"]; // [String] | Requested metrics. Use the /metrics endpoint to return a list of available estimate items. Note, the number of metrics you are allowed to supply is limited to 1 for now. **Top 10** most used metrics are **EPS, SALES, DPS, EBITDA,EBIT, PRICE_TGT, CFPS, BPS, NET_INC, and ASSETS**.  For more details, visit [Online Assistant Page #15034](https://oa.apps.factset.com/pages/15034). 
const opts = {
  'startDate': 2019-07-30, // String | Start date for point in time of estimates expressed in YYYY-MM-DD format.
  'endDate': 2019-08-30, // String | End date for point in time of estimates expressed in YYYY-MM-DD format.
  'relativeFiscalStart': 1, // Number | Relative fiscal period, expressed as an integer, used to filter results. This is combined with the periodicity parameter to specify a relative estimate period. For example, set to 1 and periodicity to ANN to ask for relative Fiscal Year 1 (FY1).
  'relativeFiscalEnd': 2, // Number | Relative fiscal period, expressed as an integer, used to filter results. This is combined with the periodicity parameter to specify a relative estimate period. For example, set to 2 and periodicity to ANN to ask for relative Fiscal Year 1 (FY2).
  'periodicity': "'ANN'", // String | The periodicity for the estimates requested, allowing you to fetch Quarterly, Semi-Annual, Annual, and NTMA/LTMA Estimates.   * **ANN** - Annual   * **QTR** - Quarterly   * **SEMI** - Semi-Annual    * **NTMA** - Next-Twelve-Months - Time-weighted Annual. Estimates use a percentage of annual estimates from two fiscal years to create an estimate based on the 12-month period. Visit [OA 16614](https://my.apps.factset.com/oa/pages/16614) for detail.   * **LTMA** - Last-Twelve-Months - Time-weighted Annual. Estimates use a percentage of annual estimates from two fiscal years to create an estimate based on the 12-month period. Visit [OA 16614](https://my.apps.factset.com/oa/pages/16614) for detail.    
  'frequency': D, // String | Controls the frequency of the data returned.   * **D** = Daily   * **W** = Weekly, based on the last day of the week of the start date.   * **AM** = Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16 etc.).         * **AQ** = Quarterly, based on the start date.   * **AY** = Actual Annual, based on the start date.  
  'currency': USD // String | Currency code for adjusting the data. Use 'ESTIMATE' as input value for the values in Estimate Currency. For a list of currency ISO codes, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470).
};

// Call api endpoint
apiInstance.getSegments(ids, segmentType, metrics, opts).then(
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
 **ids** | [**[String]**](String.md)| Security or Entity identifiers. FactSet Identifiers, tickers, CUSIP and SEDOL are accepted input. &lt;p&gt;***ids limit** &#x3D;  50 per request*&lt;/p&gt; * Make Note - id limit of 50 for defaults, otherwise the service is limited to a 30 second duration. This can be reached when increasing total number of metrics requested and depth of history. *  | 
 **segmentType** | **String**| Controls the type of segment selected.   * **BUS** &#x3D; Business / Product Segment   * **GEO** &#x3D; Geographic Segment  | [default to &#39;BUS&#39;]
 **metrics** | [**[String]**](String.md)| Requested metrics. Use the /metrics endpoint to return a list of available estimate items. Note, the number of metrics you are allowed to supply is limited to 1 for now. **Top 10** most used metrics are **EPS, SALES, DPS, EBITDA,EBIT, PRICE_TGT, CFPS, BPS, NET_INC, and ASSETS**.  For more details, visit [Online Assistant Page #15034](https://oa.apps.factset.com/pages/15034).  | 
 **startDate** | **String**| Start date for point in time of estimates expressed in YYYY-MM-DD format. | [optional] 
 **endDate** | **String**| End date for point in time of estimates expressed in YYYY-MM-DD format. | [optional] 
 **relativeFiscalStart** | **Number**| Relative fiscal period, expressed as an integer, used to filter results. This is combined with the periodicity parameter to specify a relative estimate period. For example, set to 1 and periodicity to ANN to ask for relative Fiscal Year 1 (FY1). | [optional] 
 **relativeFiscalEnd** | **Number**| Relative fiscal period, expressed as an integer, used to filter results. This is combined with the periodicity parameter to specify a relative estimate period. For example, set to 2 and periodicity to ANN to ask for relative Fiscal Year 1 (FY2). | [optional] 
 **periodicity** | **String**| The periodicity for the estimates requested, allowing you to fetch Quarterly, Semi-Annual, Annual, and NTMA/LTMA Estimates.   * **ANN** - Annual   * **QTR** - Quarterly   * **SEMI** - Semi-Annual    * **NTMA** - Next-Twelve-Months - Time-weighted Annual. Estimates use a percentage of annual estimates from two fiscal years to create an estimate based on the 12-month period. Visit [OA 16614](https://my.apps.factset.com/oa/pages/16614) for detail.   * **LTMA** - Last-Twelve-Months - Time-weighted Annual. Estimates use a percentage of annual estimates from two fiscal years to create an estimate based on the 12-month period. Visit [OA 16614](https://my.apps.factset.com/oa/pages/16614) for detail.     | [optional] [default to &#39;ANN&#39;]
 **frequency** | **String**| Controls the frequency of the data returned.   * **D** &#x3D; Daily   * **W** &#x3D; Weekly, based on the last day of the week of the start date.   * **AM** &#x3D; Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16 etc.).         * **AQ** &#x3D; Quarterly, based on the start date.   * **AY** &#x3D; Actual Annual, based on the start date.   | [optional] [default to &#39;D&#39;]
 **currency** | **String**| Currency code for adjusting the data. Use &#39;ESTIMATE&#39; as input value for the values in Estimate Currency. For a list of currency ISO codes, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470). | [optional] 

### Return type

[**SegmentsResponse**](SegmentsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getSegmentsForList

> SegmentsResponse getSegmentsForList(segmentsRequest)

Retrieves product segment estimates for a requested list of ids and fiscal periods

Returns FactSet Estimates Data for the segments gathered from the Business, Geographical, or Actual Reconciliation (ADJUSTMENT) classifications by using fiscal periods with a reporting frequency.  

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, SegmentsApi } = require('@factset/sdk-factsetestimates');
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

const apiInstance = new SegmentsApi();
const segmentsRequest = new factsetestimates.SegmentsRequest(); // SegmentsRequest | Request object for Product Segments estimates.

// Call api endpoint
apiInstance.getSegmentsForList(segmentsRequest).then(
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
 **segmentsRequest** | [**SegmentsRequest**](SegmentsRequest.md)| Request object for Product Segments estimates. | 

### Return type

[**SegmentsResponse**](SegmentsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

