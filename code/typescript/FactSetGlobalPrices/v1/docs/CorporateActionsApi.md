# factsetglobalprices.CorporateActionsApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getGPDCorporateActions**](CorporateActionsApi.md#getGPDCorporateActions) | **GET** /factset-global-prices/v1/corporate-actions | Gets Corporate Actions information.
[**getannualizedDividends**](CorporateActionsApi.md#getannualizedDividends) | **GET** /factset-global-prices/v1/annualized-dividends | Gets Indicated Annualized Dividend information.
[**getannualizedDividendsForList**](CorporateActionsApi.md#getannualizedDividendsForList) | **POST** /factset-global-prices/v1/annualized-dividends | Gets Indicated Annualized Dividend information.
[**postCorporateActions**](CorporateActionsApi.md#postCorporateActions) | **POST** /factset-global-prices/v1/corporate-actions | Requests Corporate Actions information.



## getGPDCorporateActions

> CorporateActionsResponse getGPDCorporateActions(ids, opts)

Gets Corporate Actions information.

Gets the Corporate Actions amounts, dates, types, and flags over a specified date range. You may request future dates to receive information for declared events.  Event Categories: * __Cash Dividends__ (CASH_DIVS)   * **DVC** - Dividend   * **DVCD** - Dividend with DRP Option   * **DRP** - Dividend Reinvestment * __Stock Distributions__ (STOCK_DIST)   * **DVS** - Stock Dividend   * **DVSS** - Stock Dividend, Special   * **BNS** - Bonus Issue   * **BNSS** - Bonus Issue, Special * __Spin Offs__ (SPINOFFS)   * **SPO** - Spin Off * __Rights Issue__ (RIGHTS)   * **DSR** - Rights Issue * __Splits__ (SPLITS)   * **FSP** - Forward Split   * **RSP** - Reverse Split   * **SPL** - Split   * **EXOS** - Exchange of Securities 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, CorporateActionsApi } = require('@factset/sdk-factsetglobalprices');
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

const apiInstance = new CorporateActionsApi();
const ids = ["IBM-US"]; // [String] | The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent IDs.<p>***IDs limit** =  50 per both non-batch request and batch request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of IDs, which may lead to exceeding this request line limit of 8KB, it's advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>*
const opts = {
  'eventCategory': "'ALL'", // String | Selects the Event Category to include in the response.   * **CASH_DIVS** = Cash Dividends   * **STOCK_DIST** = Stock Distributions   * **SPINOFFS** = Spin Offs   * **RIGHTS** = Rights Issue   * **SPLITS** = Splits   * **ALL** = Returns all Event Types. If omitted, the service will default to ALL. 
  'fields': ["null"], // [String] | Request available Corporate Actions data fields to be included in the response. Default is all fields. _fsymId_, _effectiveDate_, _eventTypeCode_ and _requestId_ are always included.    |field|description|   |---|---|   |fsymId|Factset Regional Security Identifier|   |eventTypeCode|Character code that denotes the type of event|   |effectiveDate|The date when security is traded ex-dividend|   |requestId|Identifier that was used for the request.|  <h3>Common Fields</h3>   |field|description|   |---|---|   |eventId|Uniquely Identifies the event|   |eventTypeDesc|Description of the type of event|   |divTypeCode|Dividend type code. [OA#8764](https://my.apps.factset.com/oa/pages/8764)|   |announcementDate|Date the event was publicly announced|   |recordDate|Record date of the event|   |payDate|Payment date of the event| <h3>Dividend Fields</h3>   |field|description|   |---|---|   |currency|Currency ISO code associated with distribution amount converted into trading currency of the record.|   |amtDefNetGrossIndicator|Indicates whether the default amount is net or gross. G=Gross; N=Net.|   |amtDefTradingAdj|Cash distribution amount (net or gross) in the trading currency of the record. Amount is translated to the trading currency based on the exchange rate as of the effective date. The value is adjusted for splits.|   |amtDefTradingUnadj|Cash distribution amount (net or gross) in the trading currency of the record. Amount is translated to the trading currency based on the exchange rate as of the effective date. The value is not adjusted for splits. |   |amtNetTradingAdj|Net distribution amount in the trading currency of the record. Amount is translated to the trading currency based on the exchange rate as of the effective date.  The value is adjusted for splits.|   |amtNetTradingUnadj|Net distribution amount in the trading currency of the record. Amount is translated to the trading currency based on the exchange rate as of the effective date. The value is not adjusted for splits.|   |amtGrossTradingAdj|Gross distribution amount in the trading currency of the record. Amount is translated to the trading currency based on the exchange rate as of the effective date. The value is adjusted for splits.|   |amtGrossTradingUnadj|Gross distribution amount in the trading currency of the record. Amount is translated to the trading currency based on the exchange rate as of the effective date. The value is not adjusted for splits.|   |declaredCurrency|Currency ISO code associated with the declared amount. |   |amtDefDecAdj|Cash distribution amount (net or gross) in the currency it was declared in. The value is adjusted for splits.|   |amtDefDecUnadj|Cash distribution amount (net or gross) in the currency it was declared in. The value is not adjusted for splits.|   |amtNetDecAdj|Net cash distribution amount in the currency it was declared in. The value is adjusted for splits. |   |amtNetDecUnadj|Net cash distribution amount in the currency it was declared in. The value is not adjusted for splits.|   |amtGrossDecAdj|Gross cash distribution amount in the currency it was declared in. N/A is returned if the gross amount is not available. The value is adjusted for splits.|   |amtGrossDecUnadj|Gross cash distribution amount in the currency it was declared in. The value is not adjusted for splits.|   |dividendStatus|Identifies the cancelled dividends status( Active, Cancelled, Postponed, Partial Information) and helps to evaluate their price and portfolio performance. Its applicable to Dividend(DVC) and Dividend with DRP option(DVCD)|   |dividendActiveFlag|Identifies whether the dividend record is currently active(1) or inactive(0). Its applicable to Dividend(DVC) and Dividend with DRP option(DVCD)|   |dividendsSpecFlag|Indicates a special price implications exists, which may or may not include special dividends. Indicates whether an adjustment should be made to historical pricing.|   |dividendFrequencyDesc|Dividend Frequency for different event types in the form of a text as per the descriptions found here [OA#8764](https://my.apps.factset.com/oa/pages/8764#Frequency)|   |dividendFrequencyCode|Dividend Frequency for different event types in the form of a code as per the details found here [OA#8764](https://my.apps.factset.com/oa/pages/8764#Frequency)|   |frankDefTradingAdj|Split amount of dividend that is franked (subject to tax credit). Published in the trading currency of the input ID. Amount is translated to the trading currency based on the exchange rate as of the effective date.**Only applicable for Australian Securities**.|   |frankDefTradingUnadj|Unsplit amount of dividend that is franked (subject to tax credit). Published in the trading currency of the input ID. Amount is translated to the trading currency based on the exchange rate as of the effective date.**Only applicable for Australian Securities**.|   |frankDefDecAdj|Split amount of dividend that is franked (subject to tax credit). Published in the currency the dividend was declared in. Amount is translated to the trading currency based on the exchange rate as of the effective date. **Only applicable for Australian Securities**.|   |frankDefDecUnadj|Unsplit amount of dividend that is franked (subject to tax credit). Published in the currency the dividend was declared in. Amount is translated to the trading currency based on the exchange rate as of the effective date. **Only applicable for Australian Securities**.|   |frankPct|Percent of total dividend that is franked (subject to tax credit). **Only applicable for Australian Securities**.|   |taxRate|Domestic Withholding Tax Rate for a Resident Individual| <h3>Distribution Fields</h3>   |field|description|   |---|---|   |adjFactor|Factor applied to adjust historical prices. Calculation formulas are available on [OA#12619](https://my.apps.factset.com/oa/pages/12619)|   |adjFactorCombined|Combined adjustment factor for all distribution events on that day.|   |amtDefTradingAdj|Cash distribution amount (net or gross) in the trading currency of the record. Amount is translated to the trading currency based on the exchange rate as of the effective date. The value is adjusted for splits.|   |amtDefTradingUnadj|Cash distribution amount (net or gross) in the trading currency of the record. Amount is translated to the trading currency based on the exchange rate as of the effective date. The value is not adjusted for splits. |   |currency|Currency ISO code associated with distribution amount converted into trading currency of the record.|   |distPct|Distribution percentage of the event  (i.e. 10%). Typical for stock distributions.|   |distOldTerm|Component of distribution ratio- Number of shares held.|   |distNewTerm|Component of distribution ratio - Number of shares received.|   |rightsIssuePrice|Price of the rights issue. |   |rightsIssueCurrency|Currency the rights issue price was declared in.|   |shortDesc|Textual description identifying the event. Example- Split (Mandatory): 3 for 1.| <h3>Splits Fields</h3>   |field|description|   |---|---|   |adjFactor|Distribution percentage of the event  (i.e. 10%). Typical for stock distributions.|   |adjFactorCombined|Combined adjustment factor for all distribution events on that day.|   |distOldTerm|Component of distribution ratio- Number of shares held.|   |distNewTerm|Component of distribution ratio - Number of shares received.|   |distInstFsymId|Helps to identify an instrument representing the distributed company or security associated with ca event identifier. Its applicable for types like Bonus issue(BNS),Stock dividend(DVS),Rights issue (DSR), and spin off(SPO).|   |shortDesc|Textual description identifying the event. Example- Split (Mandatory): 3 for 1.| 
  'startDate': 2019-01-01, // String | The start date requested for a given date range in **YYYY-MM-DD** format. In the context of corporate actions, this filters the response to only include events within the date range. The frequency between the startDate and endDate is always set to the \"event\" frequency- meaning the service will return only events within those inclusive boundaries. Omitting startDate and endDate will pull \"all\" events for each requested IDs. 
  'endDate': 2019-12-31, // String | The end date requested for a given date range in **YYYY-MM-DD** format. In the context of corporate actions, this filters the response to only include events within the date range. The frequency between the startDate and endDate is always set to the \"event\" frequency- meaning the service will return only events within those inclusive boundaries. Omitting  startDate and endDate will pull \"all\" events for each requested IDs. 
  'currency': USD, // String | Currency code for adjusting prices. Default is Local. For a list of currency ISO codes, visit [Online Assistant Page 1470](https://oa.apps.factset.com/pages/1470).
  'cancelledDividend': exclude, // String | The cancelled dividend returns the dividend details whether they are cancelled or active. 
  'batch': "'N'" // String | Enables the ability to asynchronously \"batch\" the request, supporting a long-running request for up to 20 minutes. Upon requesting batch=Y, the service will respond with an HTTP Status Code of 202. Once a batch request is submitted, use batch status to see if the job has been completed. Once completed, retrieve the results of the request via batch-result.  For single-day requests, the IDs limit is 500 for non-batch and 2000 for batch. For multi-day requests, the limit is 50 IDs for both batch and non-batch.  Limits on query string via GET method still apply. It's advised to submit large lists of IDs via POST method. <B>Please note that the number of unique currencies present in the requested IDs is limited to 50 per request.</B> 
};

// Call api endpoint
apiInstance.getGPDCorporateActions(ids, opts).then(
  data => {

      // data is a responsewrapper: GetGPDCorporateActionsResponseWrapper
      switch (data.statusCode) {

          case 200:
             // CorporateActionsResponse
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
 **ids** | [**[String]**](String.md)| The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent IDs.&lt;p&gt;***IDs limit** &#x3D;  50 per both non-batch request and batch request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of IDs, which may lead to exceeding this request line limit of 8KB, it&#39;s advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;* | 
 **eventCategory** | **String**| Selects the Event Category to include in the response.   * **CASH_DIVS** &#x3D; Cash Dividends   * **STOCK_DIST** &#x3D; Stock Distributions   * **SPINOFFS** &#x3D; Spin Offs   * **RIGHTS** &#x3D; Rights Issue   * **SPLITS** &#x3D; Splits   * **ALL** &#x3D; Returns all Event Types. If omitted, the service will default to ALL.  | [optional] [default to &#39;ALL&#39;]
 **fields** | [**[String]**](String.md)| Request available Corporate Actions data fields to be included in the response. Default is all fields. _fsymId_, _effectiveDate_, _eventTypeCode_ and _requestId_ are always included.    |field|description|   |---|---|   |fsymId|Factset Regional Security Identifier|   |eventTypeCode|Character code that denotes the type of event|   |effectiveDate|The date when security is traded ex-dividend|   |requestId|Identifier that was used for the request.|  &lt;h3&gt;Common Fields&lt;/h3&gt;   |field|description|   |---|---|   |eventId|Uniquely Identifies the event|   |eventTypeDesc|Description of the type of event|   |divTypeCode|Dividend type code. [OA#8764](https://my.apps.factset.com/oa/pages/8764)|   |announcementDate|Date the event was publicly announced|   |recordDate|Record date of the event|   |payDate|Payment date of the event| &lt;h3&gt;Dividend Fields&lt;/h3&gt;   |field|description|   |---|---|   |currency|Currency ISO code associated with distribution amount converted into trading currency of the record.|   |amtDefNetGrossIndicator|Indicates whether the default amount is net or gross. G&#x3D;Gross; N&#x3D;Net.|   |amtDefTradingAdj|Cash distribution amount (net or gross) in the trading currency of the record. Amount is translated to the trading currency based on the exchange rate as of the effective date. The value is adjusted for splits.|   |amtDefTradingUnadj|Cash distribution amount (net or gross) in the trading currency of the record. Amount is translated to the trading currency based on the exchange rate as of the effective date. The value is not adjusted for splits. |   |amtNetTradingAdj|Net distribution amount in the trading currency of the record. Amount is translated to the trading currency based on the exchange rate as of the effective date.  The value is adjusted for splits.|   |amtNetTradingUnadj|Net distribution amount in the trading currency of the record. Amount is translated to the trading currency based on the exchange rate as of the effective date. The value is not adjusted for splits.|   |amtGrossTradingAdj|Gross distribution amount in the trading currency of the record. Amount is translated to the trading currency based on the exchange rate as of the effective date. The value is adjusted for splits.|   |amtGrossTradingUnadj|Gross distribution amount in the trading currency of the record. Amount is translated to the trading currency based on the exchange rate as of the effective date. The value is not adjusted for splits.|   |declaredCurrency|Currency ISO code associated with the declared amount. |   |amtDefDecAdj|Cash distribution amount (net or gross) in the currency it was declared in. The value is adjusted for splits.|   |amtDefDecUnadj|Cash distribution amount (net or gross) in the currency it was declared in. The value is not adjusted for splits.|   |amtNetDecAdj|Net cash distribution amount in the currency it was declared in. The value is adjusted for splits. |   |amtNetDecUnadj|Net cash distribution amount in the currency it was declared in. The value is not adjusted for splits.|   |amtGrossDecAdj|Gross cash distribution amount in the currency it was declared in. N/A is returned if the gross amount is not available. The value is adjusted for splits.|   |amtGrossDecUnadj|Gross cash distribution amount in the currency it was declared in. The value is not adjusted for splits.|   |dividendStatus|Identifies the cancelled dividends status( Active, Cancelled, Postponed, Partial Information) and helps to evaluate their price and portfolio performance. Its applicable to Dividend(DVC) and Dividend with DRP option(DVCD)|   |dividendActiveFlag|Identifies whether the dividend record is currently active(1) or inactive(0). Its applicable to Dividend(DVC) and Dividend with DRP option(DVCD)|   |dividendsSpecFlag|Indicates a special price implications exists, which may or may not include special dividends. Indicates whether an adjustment should be made to historical pricing.|   |dividendFrequencyDesc|Dividend Frequency for different event types in the form of a text as per the descriptions found here [OA#8764](https://my.apps.factset.com/oa/pages/8764#Frequency)|   |dividendFrequencyCode|Dividend Frequency for different event types in the form of a code as per the details found here [OA#8764](https://my.apps.factset.com/oa/pages/8764#Frequency)|   |frankDefTradingAdj|Split amount of dividend that is franked (subject to tax credit). Published in the trading currency of the input ID. Amount is translated to the trading currency based on the exchange rate as of the effective date.**Only applicable for Australian Securities**.|   |frankDefTradingUnadj|Unsplit amount of dividend that is franked (subject to tax credit). Published in the trading currency of the input ID. Amount is translated to the trading currency based on the exchange rate as of the effective date.**Only applicable for Australian Securities**.|   |frankDefDecAdj|Split amount of dividend that is franked (subject to tax credit). Published in the currency the dividend was declared in. Amount is translated to the trading currency based on the exchange rate as of the effective date. **Only applicable for Australian Securities**.|   |frankDefDecUnadj|Unsplit amount of dividend that is franked (subject to tax credit). Published in the currency the dividend was declared in. Amount is translated to the trading currency based on the exchange rate as of the effective date. **Only applicable for Australian Securities**.|   |frankPct|Percent of total dividend that is franked (subject to tax credit). **Only applicable for Australian Securities**.|   |taxRate|Domestic Withholding Tax Rate for a Resident Individual| &lt;h3&gt;Distribution Fields&lt;/h3&gt;   |field|description|   |---|---|   |adjFactor|Factor applied to adjust historical prices. Calculation formulas are available on [OA#12619](https://my.apps.factset.com/oa/pages/12619)|   |adjFactorCombined|Combined adjustment factor for all distribution events on that day.|   |amtDefTradingAdj|Cash distribution amount (net or gross) in the trading currency of the record. Amount is translated to the trading currency based on the exchange rate as of the effective date. The value is adjusted for splits.|   |amtDefTradingUnadj|Cash distribution amount (net or gross) in the trading currency of the record. Amount is translated to the trading currency based on the exchange rate as of the effective date. The value is not adjusted for splits. |   |currency|Currency ISO code associated with distribution amount converted into trading currency of the record.|   |distPct|Distribution percentage of the event  (i.e. 10%). Typical for stock distributions.|   |distOldTerm|Component of distribution ratio- Number of shares held.|   |distNewTerm|Component of distribution ratio - Number of shares received.|   |rightsIssuePrice|Price of the rights issue. |   |rightsIssueCurrency|Currency the rights issue price was declared in.|   |shortDesc|Textual description identifying the event. Example- Split (Mandatory): 3 for 1.| &lt;h3&gt;Splits Fields&lt;/h3&gt;   |field|description|   |---|---|   |adjFactor|Distribution percentage of the event  (i.e. 10%). Typical for stock distributions.|   |adjFactorCombined|Combined adjustment factor for all distribution events on that day.|   |distOldTerm|Component of distribution ratio- Number of shares held.|   |distNewTerm|Component of distribution ratio - Number of shares received.|   |distInstFsymId|Helps to identify an instrument representing the distributed company or security associated with ca event identifier. Its applicable for types like Bonus issue(BNS),Stock dividend(DVS),Rights issue (DSR), and spin off(SPO).|   |shortDesc|Textual description identifying the event. Example- Split (Mandatory): 3 for 1.|  | [optional] 
 **startDate** | **String**| The start date requested for a given date range in **YYYY-MM-DD** format. In the context of corporate actions, this filters the response to only include events within the date range. The frequency between the startDate and endDate is always set to the \&quot;event\&quot; frequency- meaning the service will return only events within those inclusive boundaries. Omitting startDate and endDate will pull \&quot;all\&quot; events for each requested IDs.  | [optional] 
 **endDate** | **String**| The end date requested for a given date range in **YYYY-MM-DD** format. In the context of corporate actions, this filters the response to only include events within the date range. The frequency between the startDate and endDate is always set to the \&quot;event\&quot; frequency- meaning the service will return only events within those inclusive boundaries. Omitting  startDate and endDate will pull \&quot;all\&quot; events for each requested IDs.  | [optional] 
 **currency** | **String**| Currency code for adjusting prices. Default is Local. For a list of currency ISO codes, visit [Online Assistant Page 1470](https://oa.apps.factset.com/pages/1470). | [optional] [default to &#39;LOCAL&#39;]
 **cancelledDividend** | **String**| The cancelled dividend returns the dividend details whether they are cancelled or active.  | [optional] [default to &#39;exclude&#39;]
 **batch** | **String**| Enables the ability to asynchronously \&quot;batch\&quot; the request, supporting a long-running request for up to 20 minutes. Upon requesting batch&#x3D;Y, the service will respond with an HTTP Status Code of 202. Once a batch request is submitted, use batch status to see if the job has been completed. Once completed, retrieve the results of the request via batch-result.  For single-day requests, the IDs limit is 500 for non-batch and 2000 for batch. For multi-day requests, the limit is 50 IDs for both batch and non-batch.  Limits on query string via GET method still apply. It&#39;s advised to submit large lists of IDs via POST method. &lt;B&gt;Please note that the number of unique currencies present in the requested IDs is limited to 50 per request.&lt;/B&gt;  | [optional] [default to &#39;N&#39;]

### Return type

[**CorporateActionsResponse**](CorporateActionsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getannualizedDividends

> AnnualizedDividendResponse getannualizedDividends(ids, opts)

Gets Indicated Annualized Dividend information.

Gets the Annualized dividend of the latest reported dividend. The annualized dividend calculations does not involve cancelled dividends. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, CorporateActionsApi } = require('@factset/sdk-factsetglobalprices');
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

const apiInstance = new CorporateActionsApi();
const ids = ["IBM-US"]; // [String] | The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent IDs.<p>***IDs limit** =  50 per both non-batch request and batch request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of IDs, which may lead to exceeding this request line limit of 8KB, it's advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>*
const opts = {
  'currency': USD, // String | Currency code for adjusting prices. Default is Local. For a list of currency ISO codes, visit [Online Assistant Page 1470](https://oa.apps.factset.com/pages/1470).
  'batch': "'N'" // String | Enables the ability to asynchronously \"batch\" the request, supporting a long-running request for up to 20 minutes. Upon requesting batch=Y, the service will respond with an HTTP Status Code of 202. Once a batch request is submitted, use batch status to see if the job has been completed. Once completed, retrieve the results of the request via batch-result.  For single-day requests, the IDs limit is 500 for non-batch and 2000 for batch. For multi-day requests, the limit is 50 IDs for both batch and non-batch.  Limits on query string via GET method still apply. It's advised to submit large lists of IDs via POST method. <B>Please note that the number of unique currencies present in the requested IDs is limited to 50 per request.</B> 
};

// Call api endpoint
apiInstance.getannualizedDividends(ids, opts).then(
  data => {

      // data is a responsewrapper: GetannualizedDividendsResponseWrapper
      switch (data.statusCode) {

          case 200:
             // AnnualizedDividendResponse
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
 **ids** | [**[String]**](String.md)| The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent IDs.&lt;p&gt;***IDs limit** &#x3D;  50 per both non-batch request and batch request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of IDs, which may lead to exceeding this request line limit of 8KB, it&#39;s advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;* | 
 **currency** | **String**| Currency code for adjusting prices. Default is Local. For a list of currency ISO codes, visit [Online Assistant Page 1470](https://oa.apps.factset.com/pages/1470). | [optional] [default to &#39;LOCAL&#39;]
 **batch** | **String**| Enables the ability to asynchronously \&quot;batch\&quot; the request, supporting a long-running request for up to 20 minutes. Upon requesting batch&#x3D;Y, the service will respond with an HTTP Status Code of 202. Once a batch request is submitted, use batch status to see if the job has been completed. Once completed, retrieve the results of the request via batch-result.  For single-day requests, the IDs limit is 500 for non-batch and 2000 for batch. For multi-day requests, the limit is 50 IDs for both batch and non-batch.  Limits on query string via GET method still apply. It&#39;s advised to submit large lists of IDs via POST method. &lt;B&gt;Please note that the number of unique currencies present in the requested IDs is limited to 50 per request.&lt;/B&gt;  | [optional] [default to &#39;N&#39;]

### Return type

[**AnnualizedDividendResponse**](AnnualizedDividendResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getannualizedDividendsForList

> AnnualizedDividendResponse getannualizedDividendsForList(annualizedDividendsRequest)

Gets Indicated Annualized Dividend information.

Gets the Annualized dividend of the latest reported dividend. The annualized dividend calculations does not involve cancelled dividends.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, CorporateActionsApi } = require('@factset/sdk-factsetglobalprices');
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

const apiInstance = new CorporateActionsApi();
const annualizedDividendsRequest = new factsetglobalprices.AnnualizedDividendsRequest(); // AnnualizedDividendsRequest | Request object for `Annualized Response`.

// Call api endpoint
apiInstance.getannualizedDividendsForList(annualizedDividendsRequest).then(
  data => {

      // data is a responsewrapper: GetannualizedDividendsForListResponseWrapper
      switch (data.statusCode) {

          case 200:
             // AnnualizedDividendResponse
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
 **annualizedDividendsRequest** | [**AnnualizedDividendsRequest**](AnnualizedDividendsRequest.md)| Request object for &#x60;Annualized Response&#x60;. | 

### Return type

[**AnnualizedDividendResponse**](AnnualizedDividendResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## postCorporateActions

> CorporateActionsResponse postCorporateActions(corporateActionsRequest)

Requests Corporate Actions information.

Gets the Corporate Actions amounts, dates, types, and flags over a specified date range. You may request future dates to receive information for declared events. &lt;p&gt;**_startDate and endDate are required parameters. The input startDate must come before the input endDate._**

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, CorporateActionsApi } = require('@factset/sdk-factsetglobalprices');
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

const apiInstance = new CorporateActionsApi();
const corporateActionsRequest = new factsetglobalprices.CorporateActionsRequest(); // CorporateActionsRequest | Request object for `Corporate Actions`.

// Call api endpoint
apiInstance.postCorporateActions(corporateActionsRequest).then(
  data => {

      // data is a responsewrapper: PostCorporateActionsResponseWrapper
      switch (data.statusCode) {

          case 200:
             // CorporateActionsResponse
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
 **corporateActionsRequest** | [**CorporateActionsRequest**](CorporateActionsRequest.md)| Request object for &#x60;Corporate Actions&#x60;. | 

### Return type

[**CorporateActionsResponse**](CorporateActionsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

