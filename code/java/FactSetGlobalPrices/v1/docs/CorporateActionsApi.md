# CorporateActionsApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getGPDCorporateActions**](CorporateActionsApi.md#getGPDCorporateActions) | **GET** /factset-global-prices/v1/corporate-actions | Gets Corporate Actions information.
[**getannualizedDividends**](CorporateActionsApi.md#getannualizedDividends) | **GET** /factset-global-prices/v1/annualized-dividends | Gets Indicated Annualized Dividend information.
[**getannualizedDividendsForList**](CorporateActionsApi.md#getannualizedDividendsForList) | **POST** /factset-global-prices/v1/annualized-dividends | Gets Indicated Annualized Dividend information.
[**postCorporateActions**](CorporateActionsApi.md#postCorporateActions) | **POST** /factset-global-prices/v1/corporate-actions | Requests Corporate Actions information.



## getGPDCorporateActions

> GetGPDCorporateActionsResponseWrapper getGPDCorporateActions(ids, eventCategory, fields, startDate, endDate, currency, cancelledDividend, batch)

Gets Corporate Actions information.

Gets the Corporate Actions amounts, dates, types, and flags over a specified date range.
You may request future dates to receive information for declared events.

Event Categories:
* __Cash Dividends__ (CASH_DIVS)
  * **DVC** - Dividend
  * **DVCD** - Dividend with DRP Option
  * **DRP** - Dividend Reinvestment
* __Stock Distributions__ (STOCK_DIST)
  * **DVS** - Stock Dividend
  * **DVSS** - Stock Dividend, Special
  * **BNS** - Bonus Issue
  * **BNSS** - Bonus Issue, Special
* __Spin Offs__ (SPINOFFS)
  * **SPO** - Spin Off
* __Rights Issue__ (RIGHTS)
  * **DSR** - Rights Issue
* __Splits__ (SPLITS)
  * **FSP** - Forward Split
  * **RSP** - Reverse Split
  * **SPL** - Split
  * **EXOS** - Exchange of Securities


### Example

```java
// Import classes:
import com.factset.sdk.FactSetGlobalPrices.ApiClient;
import com.factset.sdk.FactSetGlobalPrices.ApiException;
import com.factset.sdk.FactSetGlobalPrices.Configuration;
import com.factset.sdk.FactSetGlobalPrices.auth.*;
import com.factset.sdk.FactSetGlobalPrices.models.*;
import com.factset.sdk.FactSetGlobalPrices.api.CorporateActionsApi;
import com.factset.sdk.FactSetGlobalPrices.api.CorporateActionsApi.GetGPDCorporateActionsResponseWrapper;

import com.factset.sdk.utils.authentication.ConfidentialClient;

public class Example {
    public static void main(String[] args) throws Exception {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
        //
        // The confidential client instance should be reused in production environments.
        // See https://github.com/FactSet/enterprise-sdk-utils-java#authentication
        // for more information on using the ConfidentialClient class
        ConfidentialClient confidentialClient = new ConfidentialClient("./path/to/config.json");
        ApiClient defaultClient = new ApiClient()
          .setFactSetOAuth2Client(confidentialClient);

        /* Basic authentication: FactSetApiKey */
        // See https://github.com/FactSet/enterprise-sdk#api-key
        // ApiClient defaultClient = new ApiClient()
        //   .setUsername("YOUR USERNAME")
        //   .setPassword("YOUR PASSWORD");

        CorporateActionsApi apiInstance = new CorporateActionsApi(defaultClient);
        java.util.List<String> ids = Arrays.asList(); // java.util.List<String> | The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent Ids.<p>***ids limit** =  1000 per non-batch request / 2000 per batch request for a single day and 50 per multi-day request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, it's advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>*
        String eventCategory = "CASH_DIVS"; // String | Selects the Event Category to include in the response.   * **CASH_DIVS** = Cash Dividends   * **STOCK_DIST** = Stock Distributions   * **SPINOFFS** = Spin Offs   * **RIGHTS** = Rights Issue   * **SPLITS** = Splits   * **ALL** = Returns all Event Types. If left blank the service will default to ALL. 
        java.util.List<String> fields = Arrays.asList(); // java.util.List<String> | Request available Corporate Actions data fields to be included in the response. Default is all fields. _fsymId_, _effectiveDate_, _eventTypeCode_ and _requestId_ are always included.    |field|description|   |---|---|   |fsymId|Factset Regional Security Identifier|   |eventTypeCode|Character code that denotes the type of event|   |effectiveDate|The date when security is traded ex-dividend|   |requestId|Identifier that was used for the request.|  <h3>Common Fields</h3>   |field|description|   |---|---|   |eventId|Uniquely Identifies the event|   |eventTypeDesc|Description of the type of event|   |divTypeCode|Dividend type code. [OA#8764](https://my.apps.factset.com/oa/pages/8764)|   |announcementDate|Date the event was publicly announced|   |recordDate|Record date of the event|   |payDate|Payment date of the event| <h3>Dividend Fields</h3>   |field|description|   |---|---|   |currency|Currency ISO code associated with distribution amount converted into trading currency of the record.|   |amtDefNetGrossIndicator|Indicates whether the default amount is net or gross. G=Gross; N=Net.|   |amtDefTradingAdj|Cash distribution amount (net or gross) in the trading currency of the record. Amount is translated to the trading currency based on the exchange rate as of the effective date. The value is adjusted for splits.|   |amtDefTradingUnadj|Cash distribution amount (net or gross) in the trading currency of the record. Amount is translated to the trading currency based on the exchange rate as of the effective date. The value is not adjusted for splits. |   |amtNetTradingAdj|Net distribution amount in the trading currency of the record. Amount is translated to the trading currency based on the exchange rate as of the effective date.  The value is adjusted for splits.|   |amtNetTradingUnadj|Net distribution amount in the trading currency of the record. Amount is translated to the trading currency based on the exchange rate as of the effective date. The value is not adjusted for splits.|   |amtGrossTradingAdj|Gross distribution amount in the trading currency of the record. Amount is translated to the trading currency based on the exchange rate as of the effective date. The value is adjusted for splits.|   |amtGrossTradingUnadj|Gross distribution amount in the trading currency of the record. Amount is translated to the trading currency based on the exchange rate as of the effective date. The value is not adjusted for splits.|   |declaredCurrency|Currency ISO code associated with the declared amount. |   |amtDefDecAdj|Cash distribution amount (net or gross) in the currency it was declared in. The value is adjusted for splits.|   |amtDefDecUnadj|Cash distribution amount (net or gross) in the currency it was declared in. The value is not adjusted for splits.|   |amtNetDecAdj|Net cash distribution amount in the currency it was declared in. The value is adjusted for splits. |   |amtNetDecUnadj|Net cash distribution amount in the currency it was declared in. The value is not adjusted for splits.|   |amtGrossDecAdj|Gross cash distribution amount in the currency it was declared in. N/A is returned if the gross amount is not available. The value is adjusted for splits.|   |amtGrossDecUnadj|Gross cash distribution amount in the currency it was declared in. The value is not adjusted for splits.|   |dividendStatus|Identifies the cancelled dividends status( Active, Cancelled, Postponed, Partial Information) and helps to evaluate their price and portfolio performance.Its applicable to Dividend(DVC) and Dividend with DRP option(DVCD)|   |dividendActiveFlag|Identifies whether the dividend record is currently active(1) or inactive(0).Its applicable to Dividend(DVC) and Dividend with DRP option(DVCD)|   |dividendsSpecFlag|Indicates a special price implications exists, which may or may not include special dividends. Indicates whether an adjustment should be made to historical pricing.|   |dividendFrequencyDesc|Dividend Frequency for different event types in the form of a text as per the descriptions found here [OA#8764](https://my.apps.factset.com/oa/pages/8764#Frequency)|   |dividendFrequencyCode|Dividend Frequency for different event types in the form of a code as per the details found here [OA#8764](https://my.apps.factset.com/oa/pages/8764#Frequency)|   |frankDefTradingAdj|Split amount of dividend that is franked (subject to tax credit). Published in the trading currency of the input ID. Amount is translated to the trading currency based on the exchange rate as of the effective date.**Only applicable for Australian Securities**.|   |frankDefTradingUnadj|Unsplit amount of dividend that is franked (subject to tax credit). Published in the trading currency of the input ID. Amount is translated to the trading currency based on the exchange rate as of the effective date.**Only applicable for Australian Securities**.|   |frankDefDecAdj|Split amount of dividend that is franked (subject to tax credit). Published in the currency the dividend was declared in.Amount is translated to the trading currency based on the exchange rate as of the effective date. **Only applicable for Australian Securities**.|   |frankDefDecUnadj|Unsplit amount of dividend that is franked (subject to tax credit). Published in the currency the dividend was declared in.Amount is translated to the trading currency based on the exchange rate as of the effective date. **Only applicable for Australian Securities**.|   |frankPct|Percent of total dividend that is franked (subject to tax credit). **Only applicable for Australian Securities**.|   |taxRate|Domestic Withholding Tax Rate for a Resident Individual| <h3>Distribution Fields</h3>   |field|description|   |---|---|   |adjFactor|Factor applied to adjust historical prices. Calculation formulas are available on [OA#12619](https://my.apps.factset.com/oa/pages/12619)|   |adjFactorCombined|Combined adjustment factor for all distribution events on that day.|   |amtDefTradingAdj|Cash distribution amount (net or gross) in the trading currency of the record. Amount is translated to the trading currency based on the exchange rate as of the effective date. The value is adjusted for splits.|   |amtDefTradingUnadj|Cash distribution amount (net or gross) in the trading currency of the record. Amount is translated to the trading currency based on the exchange rate as of the effective date. The value is not adjusted for splits. |   |currency|Currency ISO code associated with distribution amount converted into trading currency of the record.|   |distPct|Distribution percentage of the event  (i.e. 10%). Typical for stock distributions.|   |distOldTerm|Component of distribution ratio- Number of shares held.|   |distNewTerm|Component of distribution ratio - Number of shares received.|   |rightsIssuePrice|Price of the rights issue. |   |rightsIssueCurrency|Currency the rights issue price was declared in.|   |shortDesc|Textual description identifying the event. Example- Split (Mandatory): 3 for 1.| <h3>Splits Fields</h3>   |field|description|   |---|---|   |adjFactor|Distribution percentage of the event  (i.e. 10%). Typical for stock distributions.|   |adjFactorCombined|Combined adjustment factor for all distribution events on that day.|   |distOldTerm|Component of distribution ratio- Number of shares held.|   |distNewTerm|Component of distribution ratio - Number of shares received.|   |distInstFsymId|Helps to identify an instrument representing the distributed company or security associated with ca event identifier. Its applicable for types like Bonus issue(BNS),Stock dividend(DVS),Rights issue (DSR), and spin off(SPO).|   |shortDesc|Textual description identifying the event. Example- Split (Mandatory): 3 for 1.| 
        String startDate = "2019-01-01"; // String | The start date requested for a given date range in **YYYY-MM-DD** format. In the context of corporate actions, this filters the response to only include events within the date range. The frequency between the startDate and endDate is always set to the \"event\" frequency- meaning the service will return only events within those inclusive boundaries. Leaving both startDate and endDate blank will pull \"all\" events for each requested ids. 
        String endDate = "2019-12-31"; // String | The end date requested for a given date range in **YYYY-MM-DD** format. In the context of corporate actions, this filters the response to only include events within the date range. The frequency between the startDate and endDate is always set to the \"event\" frequency- meaning the service will return only events within those inclusive boundaries. Leaving both startDate and endDate blank will pull \"all\" events for each requested ids. 
        String currency = "USD"; // String | Currency code for adjusting prices. Default is Local. For a list of currency ISO codes, visit [Online Assistant Page 1470](https://oa.apps.factset.com/pages/1470).
        String cancelledDividend = "include"; // String | The cancelled dividend returns the dividend details whether they are cancelled or active. 
        String batch = "Y"; // String | Enables the ability to asynchronously \"batch\" the request, supporting a long-running request for up to 20 minutes. Upon requesting batch=Y, the service will respond with an HTTP Status Code of 202. Once a batch request is submitted, use batch status to see if the job has been completed. Once completed, retrieve the results of the request via batch-result. When using Batch, ids limit is increased to 10000 ids per request, though limits on query string via GET method still apply. It's advised to submit large lists of ids via POST method. <B>Please note that the number of unique currencies present in the requested ids is limited to 50 per request.</B> 
        try {
            GetGPDCorporateActionsResponseWrapper result = apiInstance.getGPDCorporateActions(ids, eventCategory, fields, startDate, endDate, currency, cancelledDividend, batch);
            switch(result.getStatusCode()) {
            
                case 200:
                    System.out.println(result.getResponse200()); // CorporateActionsResponse
            
                case 202:
                    System.out.println(result.getResponse202()); // BatchStatusResponse
            
            }

        } catch (ApiException e) {
            System.err.println("Exception when calling CorporateActionsApi#getGPDCorporateActions");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | **List&lt;String&gt;**| The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent Ids.&lt;p&gt;***ids limit** &#x3D;  1000 per non-batch request / 2000 per batch request for a single day and 50 per multi-day request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, it&#39;s advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;* |
 **eventCategory** | **String**| Selects the Event Category to include in the response.   * **CASH_DIVS** &#x3D; Cash Dividends   * **STOCK_DIST** &#x3D; Stock Distributions   * **SPINOFFS** &#x3D; Spin Offs   * **RIGHTS** &#x3D; Rights Issue   * **SPLITS** &#x3D; Splits   * **ALL** &#x3D; Returns all Event Types. If left blank the service will default to ALL.  | [optional] [default to ALL] [enum: CASH_DIVS, STOCK_DIST, RIGHTS, SPINOFFS, SPLITS, ALL]
 **fields** | **List&lt;String&gt;**| Request available Corporate Actions data fields to be included in the response. Default is all fields. _fsymId_, _effectiveDate_, _eventTypeCode_ and _requestId_ are always included.    |field|description|   |---|---|   |fsymId|Factset Regional Security Identifier|   |eventTypeCode|Character code that denotes the type of event|   |effectiveDate|The date when security is traded ex-dividend|   |requestId|Identifier that was used for the request.|  &lt;h3&gt;Common Fields&lt;/h3&gt;   |field|description|   |---|---|   |eventId|Uniquely Identifies the event|   |eventTypeDesc|Description of the type of event|   |divTypeCode|Dividend type code. [OA#8764](https://my.apps.factset.com/oa/pages/8764)|   |announcementDate|Date the event was publicly announced|   |recordDate|Record date of the event|   |payDate|Payment date of the event| &lt;h3&gt;Dividend Fields&lt;/h3&gt;   |field|description|   |---|---|   |currency|Currency ISO code associated with distribution amount converted into trading currency of the record.|   |amtDefNetGrossIndicator|Indicates whether the default amount is net or gross. G&#x3D;Gross; N&#x3D;Net.|   |amtDefTradingAdj|Cash distribution amount (net or gross) in the trading currency of the record. Amount is translated to the trading currency based on the exchange rate as of the effective date. The value is adjusted for splits.|   |amtDefTradingUnadj|Cash distribution amount (net or gross) in the trading currency of the record. Amount is translated to the trading currency based on the exchange rate as of the effective date. The value is not adjusted for splits. |   |amtNetTradingAdj|Net distribution amount in the trading currency of the record. Amount is translated to the trading currency based on the exchange rate as of the effective date.  The value is adjusted for splits.|   |amtNetTradingUnadj|Net distribution amount in the trading currency of the record. Amount is translated to the trading currency based on the exchange rate as of the effective date. The value is not adjusted for splits.|   |amtGrossTradingAdj|Gross distribution amount in the trading currency of the record. Amount is translated to the trading currency based on the exchange rate as of the effective date. The value is adjusted for splits.|   |amtGrossTradingUnadj|Gross distribution amount in the trading currency of the record. Amount is translated to the trading currency based on the exchange rate as of the effective date. The value is not adjusted for splits.|   |declaredCurrency|Currency ISO code associated with the declared amount. |   |amtDefDecAdj|Cash distribution amount (net or gross) in the currency it was declared in. The value is adjusted for splits.|   |amtDefDecUnadj|Cash distribution amount (net or gross) in the currency it was declared in. The value is not adjusted for splits.|   |amtNetDecAdj|Net cash distribution amount in the currency it was declared in. The value is adjusted for splits. |   |amtNetDecUnadj|Net cash distribution amount in the currency it was declared in. The value is not adjusted for splits.|   |amtGrossDecAdj|Gross cash distribution amount in the currency it was declared in. N/A is returned if the gross amount is not available. The value is adjusted for splits.|   |amtGrossDecUnadj|Gross cash distribution amount in the currency it was declared in. The value is not adjusted for splits.|   |dividendStatus|Identifies the cancelled dividends status( Active, Cancelled, Postponed, Partial Information) and helps to evaluate their price and portfolio performance.Its applicable to Dividend(DVC) and Dividend with DRP option(DVCD)|   |dividendActiveFlag|Identifies whether the dividend record is currently active(1) or inactive(0).Its applicable to Dividend(DVC) and Dividend with DRP option(DVCD)|   |dividendsSpecFlag|Indicates a special price implications exists, which may or may not include special dividends. Indicates whether an adjustment should be made to historical pricing.|   |dividendFrequencyDesc|Dividend Frequency for different event types in the form of a text as per the descriptions found here [OA#8764](https://my.apps.factset.com/oa/pages/8764#Frequency)|   |dividendFrequencyCode|Dividend Frequency for different event types in the form of a code as per the details found here [OA#8764](https://my.apps.factset.com/oa/pages/8764#Frequency)|   |frankDefTradingAdj|Split amount of dividend that is franked (subject to tax credit). Published in the trading currency of the input ID. Amount is translated to the trading currency based on the exchange rate as of the effective date.**Only applicable for Australian Securities**.|   |frankDefTradingUnadj|Unsplit amount of dividend that is franked (subject to tax credit). Published in the trading currency of the input ID. Amount is translated to the trading currency based on the exchange rate as of the effective date.**Only applicable for Australian Securities**.|   |frankDefDecAdj|Split amount of dividend that is franked (subject to tax credit). Published in the currency the dividend was declared in.Amount is translated to the trading currency based on the exchange rate as of the effective date. **Only applicable for Australian Securities**.|   |frankDefDecUnadj|Unsplit amount of dividend that is franked (subject to tax credit). Published in the currency the dividend was declared in.Amount is translated to the trading currency based on the exchange rate as of the effective date. **Only applicable for Australian Securities**.|   |frankPct|Percent of total dividend that is franked (subject to tax credit). **Only applicable for Australian Securities**.|   |taxRate|Domestic Withholding Tax Rate for a Resident Individual| &lt;h3&gt;Distribution Fields&lt;/h3&gt;   |field|description|   |---|---|   |adjFactor|Factor applied to adjust historical prices. Calculation formulas are available on [OA#12619](https://my.apps.factset.com/oa/pages/12619)|   |adjFactorCombined|Combined adjustment factor for all distribution events on that day.|   |amtDefTradingAdj|Cash distribution amount (net or gross) in the trading currency of the record. Amount is translated to the trading currency based on the exchange rate as of the effective date. The value is adjusted for splits.|   |amtDefTradingUnadj|Cash distribution amount (net or gross) in the trading currency of the record. Amount is translated to the trading currency based on the exchange rate as of the effective date. The value is not adjusted for splits. |   |currency|Currency ISO code associated with distribution amount converted into trading currency of the record.|   |distPct|Distribution percentage of the event  (i.e. 10%). Typical for stock distributions.|   |distOldTerm|Component of distribution ratio- Number of shares held.|   |distNewTerm|Component of distribution ratio - Number of shares received.|   |rightsIssuePrice|Price of the rights issue. |   |rightsIssueCurrency|Currency the rights issue price was declared in.|   |shortDesc|Textual description identifying the event. Example- Split (Mandatory): 3 for 1.| &lt;h3&gt;Splits Fields&lt;/h3&gt;   |field|description|   |---|---|   |adjFactor|Distribution percentage of the event  (i.e. 10%). Typical for stock distributions.|   |adjFactorCombined|Combined adjustment factor for all distribution events on that day.|   |distOldTerm|Component of distribution ratio- Number of shares held.|   |distNewTerm|Component of distribution ratio - Number of shares received.|   |distInstFsymId|Helps to identify an instrument representing the distributed company or security associated with ca event identifier. Its applicable for types like Bonus issue(BNS),Stock dividend(DVS),Rights issue (DSR), and spin off(SPO).|   |shortDesc|Textual description identifying the event. Example- Split (Mandatory): 3 for 1.|  | [optional]
 **startDate** | **String**| The start date requested for a given date range in **YYYY-MM-DD** format. In the context of corporate actions, this filters the response to only include events within the date range. The frequency between the startDate and endDate is always set to the \&quot;event\&quot; frequency- meaning the service will return only events within those inclusive boundaries. Leaving both startDate and endDate blank will pull \&quot;all\&quot; events for each requested ids.  | [optional]
 **endDate** | **String**| The end date requested for a given date range in **YYYY-MM-DD** format. In the context of corporate actions, this filters the response to only include events within the date range. The frequency between the startDate and endDate is always set to the \&quot;event\&quot; frequency- meaning the service will return only events within those inclusive boundaries. Leaving both startDate and endDate blank will pull \&quot;all\&quot; events for each requested ids.  | [optional]
 **currency** | **String**| Currency code for adjusting prices. Default is Local. For a list of currency ISO codes, visit [Online Assistant Page 1470](https://oa.apps.factset.com/pages/1470). | [optional]
 **cancelledDividend** | **String**| The cancelled dividend returns the dividend details whether they are cancelled or active.  | [optional] [default to exclude] [enum: include, exclude]
 **batch** | **String**| Enables the ability to asynchronously \&quot;batch\&quot; the request, supporting a long-running request for up to 20 minutes. Upon requesting batch&#x3D;Y, the service will respond with an HTTP Status Code of 202. Once a batch request is submitted, use batch status to see if the job has been completed. Once completed, retrieve the results of the request via batch-result. When using Batch, ids limit is increased to 10000 ids per request, though limits on query string via GET method still apply. It&#39;s advised to submit large lists of ids via POST method. &lt;B&gt;Please note that the number of unique currencies present in the requested ids is limited to 50 per request.&lt;/B&gt;  | [optional] [default to N] [enum: Y, N]

### Return type

GetGPDCorporateActionsResponseWrapper

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Array of security dividend information for a given date range and list of securities |  -  |
| **202** | Batch request has been accepted. |  * Location - Path to Batch Request result. <br>  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |


## getannualizedDividends

> GetannualizedDividendsResponseWrapper getannualizedDividends(ids, currency, batch)

Gets Indicated Annualized Dividend information.

Gets the Annualized dividend of the latest reported dividend.
The annualized dividend calculations does not involve cancelled dividends.


### Example

```java
// Import classes:
import com.factset.sdk.FactSetGlobalPrices.ApiClient;
import com.factset.sdk.FactSetGlobalPrices.ApiException;
import com.factset.sdk.FactSetGlobalPrices.Configuration;
import com.factset.sdk.FactSetGlobalPrices.auth.*;
import com.factset.sdk.FactSetGlobalPrices.models.*;
import com.factset.sdk.FactSetGlobalPrices.api.CorporateActionsApi;
import com.factset.sdk.FactSetGlobalPrices.api.CorporateActionsApi.GetannualizedDividendsResponseWrapper;

import com.factset.sdk.utils.authentication.ConfidentialClient;

public class Example {
    public static void main(String[] args) throws Exception {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
        //
        // The confidential client instance should be reused in production environments.
        // See https://github.com/FactSet/enterprise-sdk-utils-java#authentication
        // for more information on using the ConfidentialClient class
        ConfidentialClient confidentialClient = new ConfidentialClient("./path/to/config.json");
        ApiClient defaultClient = new ApiClient()
          .setFactSetOAuth2Client(confidentialClient);

        /* Basic authentication: FactSetApiKey */
        // See https://github.com/FactSet/enterprise-sdk#api-key
        // ApiClient defaultClient = new ApiClient()
        //   .setUsername("YOUR USERNAME")
        //   .setPassword("YOUR PASSWORD");

        CorporateActionsApi apiInstance = new CorporateActionsApi(defaultClient);
        java.util.List<String> ids = Arrays.asList(); // java.util.List<String> | The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent Ids.<p>***ids limit** =  1000 per non-batch request / 2000 per batch request for a single day and 50 per multi-day request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, it's advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>*
        String currency = "USD"; // String | Currency code for adjusting prices. Default is Local. For a list of currency ISO codes, visit [Online Assistant Page 1470](https://oa.apps.factset.com/pages/1470).
        String batch = "Y"; // String | Enables the ability to asynchronously \"batch\" the request, supporting a long-running request for up to 20 minutes. Upon requesting batch=Y, the service will respond with an HTTP Status Code of 202. Once a batch request is submitted, use batch status to see if the job has been completed. Once completed, retrieve the results of the request via batch-result. When using Batch, ids limit is increased to 10000 ids per request, though limits on query string via GET method still apply. It's advised to submit large lists of ids via POST method. <B>Please note that the number of unique currencies present in the requested ids is limited to 50 per request.</B> 
        try {
            GetannualizedDividendsResponseWrapper result = apiInstance.getannualizedDividends(ids, currency, batch);
            switch(result.getStatusCode()) {
            
                case 200:
                    System.out.println(result.getResponse200()); // AnnualizedDividendResponse
            
                case 202:
                    System.out.println(result.getResponse202()); // BatchStatusResponse
            
            }

        } catch (ApiException e) {
            System.err.println("Exception when calling CorporateActionsApi#getannualizedDividends");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | **List&lt;String&gt;**| The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent Ids.&lt;p&gt;***ids limit** &#x3D;  1000 per non-batch request / 2000 per batch request for a single day and 50 per multi-day request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, it&#39;s advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;* |
 **currency** | **String**| Currency code for adjusting prices. Default is Local. For a list of currency ISO codes, visit [Online Assistant Page 1470](https://oa.apps.factset.com/pages/1470). | [optional]
 **batch** | **String**| Enables the ability to asynchronously \&quot;batch\&quot; the request, supporting a long-running request for up to 20 minutes. Upon requesting batch&#x3D;Y, the service will respond with an HTTP Status Code of 202. Once a batch request is submitted, use batch status to see if the job has been completed. Once completed, retrieve the results of the request via batch-result. When using Batch, ids limit is increased to 10000 ids per request, though limits on query string via GET method still apply. It&#39;s advised to submit large lists of ids via POST method. &lt;B&gt;Please note that the number of unique currencies present in the requested ids is limited to 50 per request.&lt;/B&gt;  | [optional] [default to N] [enum: Y, N]

### Return type

GetannualizedDividendsResponseWrapper

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Array of annualized dividend information. |  -  |
| **202** | Batch request has been accepted. |  * Location - Path to Batch Request result. <br>  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |


## getannualizedDividendsForList

> GetannualizedDividendsForListResponseWrapper getannualizedDividendsForList(annualizedDividendsRequest)

Gets Indicated Annualized Dividend information.

Gets the Annualized dividend of the latest reported dividend. The annualized dividend calculations does not involve cancelled dividends.

### Example

```java
// Import classes:
import com.factset.sdk.FactSetGlobalPrices.ApiClient;
import com.factset.sdk.FactSetGlobalPrices.ApiException;
import com.factset.sdk.FactSetGlobalPrices.Configuration;
import com.factset.sdk.FactSetGlobalPrices.auth.*;
import com.factset.sdk.FactSetGlobalPrices.models.*;
import com.factset.sdk.FactSetGlobalPrices.api.CorporateActionsApi;
import com.factset.sdk.FactSetGlobalPrices.api.CorporateActionsApi.GetannualizedDividendsForListResponseWrapper;

import com.factset.sdk.utils.authentication.ConfidentialClient;

public class Example {
    public static void main(String[] args) throws Exception {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
        //
        // The confidential client instance should be reused in production environments.
        // See https://github.com/FactSet/enterprise-sdk-utils-java#authentication
        // for more information on using the ConfidentialClient class
        ConfidentialClient confidentialClient = new ConfidentialClient("./path/to/config.json");
        ApiClient defaultClient = new ApiClient()
          .setFactSetOAuth2Client(confidentialClient);

        /* Basic authentication: FactSetApiKey */
        // See https://github.com/FactSet/enterprise-sdk#api-key
        // ApiClient defaultClient = new ApiClient()
        //   .setUsername("YOUR USERNAME")
        //   .setPassword("YOUR PASSWORD");

        CorporateActionsApi apiInstance = new CorporateActionsApi(defaultClient);
        AnnualizedDividendsRequest annualizedDividendsRequest = new AnnualizedDividendsRequest(); // AnnualizedDividendsRequest | Request object for `Annualized Response`.
        try {
            GetannualizedDividendsForListResponseWrapper result = apiInstance.getannualizedDividendsForList(annualizedDividendsRequest);
            switch(result.getStatusCode()) {
            
                case 200:
                    System.out.println(result.getResponse200()); // AnnualizedDividendResponse
            
                case 202:
                    System.out.println(result.getResponse202()); // BatchStatusResponse
            
            }

        } catch (ApiException e) {
            System.err.println("Exception when calling CorporateActionsApi#getannualizedDividendsForList");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **annualizedDividendsRequest** | [**AnnualizedDividendsRequest**](AnnualizedDividendsRequest.md)| Request object for &#x60;Annualized Response&#x60;. |

### Return type

GetannualizedDividendsForListResponseWrapper

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Array of security prices |  -  |
| **202** | Batch request has been accepted. |  * Location - Path to Batch Request result. <br>  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |


## postCorporateActions

> PostCorporateActionsResponseWrapper postCorporateActions(corporateActionsRequest)

Requests Corporate Actions information.

Gets the Corporate Actions amounts, dates, types, and flags over a specified date range. You may request future dates to receive information for declared events. <p>**_startDate and endDate are required parameters. The input startDate must come before the input endDate._**

### Example

```java
// Import classes:
import com.factset.sdk.FactSetGlobalPrices.ApiClient;
import com.factset.sdk.FactSetGlobalPrices.ApiException;
import com.factset.sdk.FactSetGlobalPrices.Configuration;
import com.factset.sdk.FactSetGlobalPrices.auth.*;
import com.factset.sdk.FactSetGlobalPrices.models.*;
import com.factset.sdk.FactSetGlobalPrices.api.CorporateActionsApi;
import com.factset.sdk.FactSetGlobalPrices.api.CorporateActionsApi.PostCorporateActionsResponseWrapper;

import com.factset.sdk.utils.authentication.ConfidentialClient;

public class Example {
    public static void main(String[] args) throws Exception {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
        //
        // The confidential client instance should be reused in production environments.
        // See https://github.com/FactSet/enterprise-sdk-utils-java#authentication
        // for more information on using the ConfidentialClient class
        ConfidentialClient confidentialClient = new ConfidentialClient("./path/to/config.json");
        ApiClient defaultClient = new ApiClient()
          .setFactSetOAuth2Client(confidentialClient);

        /* Basic authentication: FactSetApiKey */
        // See https://github.com/FactSet/enterprise-sdk#api-key
        // ApiClient defaultClient = new ApiClient()
        //   .setUsername("YOUR USERNAME")
        //   .setPassword("YOUR PASSWORD");

        CorporateActionsApi apiInstance = new CorporateActionsApi(defaultClient);
        CorporateActionsRequest corporateActionsRequest = new CorporateActionsRequest(); // CorporateActionsRequest | Request object for `Corporate Actions`.
        try {
            PostCorporateActionsResponseWrapper result = apiInstance.postCorporateActions(corporateActionsRequest);
            switch(result.getStatusCode()) {
            
                case 200:
                    System.out.println(result.getResponse200()); // CorporateActionsResponse
            
                case 202:
                    System.out.println(result.getResponse202()); // BatchStatusResponse
            
            }

        } catch (ApiException e) {
            System.err.println("Exception when calling CorporateActionsApi#postCorporateActions");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **corporateActionsRequest** | [**CorporateActionsRequest**](CorporateActionsRequest.md)| Request object for &#x60;Corporate Actions&#x60;. |

### Return type

PostCorporateActionsResponseWrapper

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Array of security prices |  -  |
| **202** | Batch request has been accepted. |  * Location - Path to Batch Request result. <br>  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

