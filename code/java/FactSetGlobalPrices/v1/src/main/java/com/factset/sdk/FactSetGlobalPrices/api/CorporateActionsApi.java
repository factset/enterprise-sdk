package com.factset.sdk.FactSetGlobalPrices.api;

import com.factset.sdk.FactSetGlobalPrices.ApiException;
import com.factset.sdk.FactSetGlobalPrices.ApiClient;
import com.factset.sdk.FactSetGlobalPrices.ApiResponse;
import com.factset.sdk.FactSetGlobalPrices.Configuration;
import com.factset.sdk.FactSetGlobalPrices.Pair;

import javax.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.FactSetGlobalPrices.models.AnnualizedDividendResponse;
import com.factset.sdk.FactSetGlobalPrices.models.AnnualizedDividendsRequest;
import com.factset.sdk.FactSetGlobalPrices.models.CorporateActionsRequest;
import com.factset.sdk.FactSetGlobalPrices.models.CorporateActionsResponse;
import com.factset.sdk.FactSetGlobalPrices.models.ErrorResponse;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CorporateActionsApi {
  private ApiClient apiClient;

  public CorporateActionsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public CorporateActionsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> getGPDCorporateActionsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getGPDCorporateActionsResponseTypeMap.put(200, new GenericType<CorporateActionsResponse>(){});
    getGPDCorporateActionsResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getGPDCorporateActionsResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getGPDCorporateActionsResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getGPDCorporateActionsResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getGPDCorporateActionsResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> getannualizedDividendsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getannualizedDividendsResponseTypeMap.put(200, new GenericType<AnnualizedDividendResponse>(){});
    getannualizedDividendsResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getannualizedDividendsResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getannualizedDividendsResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getannualizedDividendsResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getannualizedDividendsResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> getannualizedDividendsForListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getannualizedDividendsForListResponseTypeMap.put(200, new GenericType<AnnualizedDividendResponse>(){});
  }

  private static final Map<Integer, GenericType> postCorporateActionsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    postCorporateActionsResponseTypeMap.put(200, new GenericType<CorporateActionsResponse>(){});
  }

  


  /**
   * Get the API client
   *
   * @return API client
   */
  public ApiClient getApiClient() {
    return apiClient;
  }

  /**
   * Set the API client
   *
   * @param apiClient an instance of API client
   */
  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Gets Corporate Actions information.
   * Gets the Corporate Actions amounts, dates, types, and flags over a specified date range. You may request future dates to receive information for declared events.  Event Categories: * __Cash Dividends__ (CASH_DIVS)   * **DVC** – Dividend   * **DVCD** – Dividend with DRP Option   * **DRP** – Dividend Reinvestment * __Stock Distributions__ (STOCK_DIST)   * **DVS** – Stock Dividend   * **DVSS** – Stock Dividend, Special   * **BNS** – Bonus Issue   * **BNSS** – Bonus Issue, Special * __Spin Offs__ (SPINOFFS)   * **SPO** – Spin Off * __Rights Issue__ (RIGHTS)   * **DSR** – Rights Issue * __Splits__ (SPLITS)   * **FSP** – Forward Split   * **RSP** – Reverse Split   * **SPL** – Split   * **EXOS** – Exchange of Securities 
   * @param ids The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent Ids. &lt;p&gt;***ids limit** &#x3D;  100 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;* (required)
   * @param eventCategory Selects the Event Category to include in the response.   * **CASH_DIVS** &#x3D; Cash Dividends   * **STOCK_DIST** &#x3D; Stock Distributions   * **SPINOFFS** &#x3D; Spin Offs   * **RIGHTS** &#x3D; Rights Issue   * **SPLITS** &#x3D; Splits   * **ALL** &#x3D; Returns all Event Types. If left blank the service will default to ALL.  (optional, default to ALL)
   * @param fields Request available Corporate Actions data fields to be included in the response. Default is all fields. _fsymId_, _effectiveDate_, _eventTypeCode_ and _requestId_ are always included.    |field|description|   |---|---|   |fsymId|Factset Regional Security Identifier|   |eventTypeCode|Character code that denotes the type of event|   |effectiveDate|The date when security is traded ex-dividend|   |requestId|Identifier that was used for the request.|  &lt;h3&gt;Common Fields&lt;/h3&gt;   |field|description|   |---|---|   |eventId|Uniquely Identifies the event|   |eventTypeDesc|Description of the type of event|   |divTypeCode|Dividend type code. [OA#8764](https://my.apps.factset.com/oa/pages/8764)|   |announcementDate|Date the event was publicly announced|   |recordDate|Record date of the event|   |payDate|Payment date of the event| &lt;h3&gt;Dividend Fields&lt;/h3&gt;   |field|description|   |---|---|   |currency|Currency ISO code associated with distribution amount converted into trading currency of the record.|   |amtDefNetGrossIndicator|Indicates whether the default amount is net or gross. G&#x3D;Gross; N&#x3D;Net.|   |amtDefTradingAdj|Cash distribution amount (net or gross) in the trading currency of the record. Amount is translated to the trading currency based on the exchange rate as of the effective date. The value is adjusted for splits.|   |amtDefTradingUnadj|Cash distribution amount (net or gross) in the trading currency of the record. Amount is translated to the trading currency based on the exchange rate as of the effective date. The value is not adjusted for splits. |   |amtNetTradingAdj|Net distribution amount in the trading currency of the record. Amount is translated to the trading currency based on the exchange rate as of the effective date.  The value is adjusted for splits.|   |amtNetTradingUnadj|Net distribution amount in the trading currency of the record. Amount is translated to the trading currency based on the exchange rate as of the effective date. The value is not adjusted for splits.|   |amtGrossTradingAdj|Gross distribution amount in the trading currency of the record. Amount is translated to the trading currency based on the exchange rate as of the effective date. The value is adjusted for splits.|   |amtGrossTradingUnadj|Gross distribution amount in the trading currency of the record. Amount is translated to the trading currency based on the exchange rate as of the effective date. The value is not adjusted for splits.|   |declaredCurrency|Currency ISO code associated with the declared amount. |   |amtDefDecAdj|Cash distribution amount (net or gross) in the currency it was declared in. The value is adjusted for splits.|   |amtDefDecUnadj|Cash distribution amount (net or gross) in the currency it was declared in. The value is not adjusted for splits.|   |amtNetDecAdj|Net cash distribution amount in the currency it was declared in. The value is adjusted for splits. |   |amtNetDecUnadj|Net cash distribution amount in the currency it was declared in. The value is not adjusted for splits.|   |amtGrossDecAdj|Gross cash distribution amount in the currency it was declared in. N/A is returned if the gross amount is not available. The value is adjusted for splits.|   |amtGrossDecUnadj|Gross cash distribution amount in the currency it was declared in. The value is not adjusted for splits.|   |dividendStatus|Identifies the cancelled dividends status( Active, Cancelled, Postponed, Partial Information) and helps to evaluate their price and portfolio performance.Its applicable to Dividend(DVC) and Dividend with DRP option(DVCD)|   |dividendActiveFlag|Identifies whether the dividend record is currently active(1) or inactive(0).Its applicable to Dividend(DVC) and Dividend with DRP option(DVCD)|   |dividendsSpecFlag|Indicates a special price implications exists, which may or may not include special dividends. Indicates whether an adjustment should be made to historical pricing.|   |dividendFrequencyDesc|Dividend Frequency for different event types in the form of a text as per the descriptions found here [OA#8764](https://my.apps.factset.com/oa/pages/8764#Frequency)|   |dividendFrequencyCode|Dividend Frequency for different event types in the form of a code as per the details found here [OA#8764](https://my.apps.factset.com/oa/pages/8764#Frequency)|   |frankDefTradingAdj|Split amount of dividend that is franked (subject to tax credit). Published in the trading currency of the input ID. Amount is translated to the trading currency based on the exchange rate as of the effective date.**Only applicable for Australian Securities**.|   |frankDefTradingUnadj|Unsplit amount of dividend that is franked (subject to tax credit). Published in the trading currency of the input ID. Amount is translated to the trading currency based on the exchange rate as of the effective date.**Only applicable for Australian Securities**.|   |frankDefDecAdj|Split amount of dividend that is franked (subject to tax credit). Published in the currency the dividend was declared in.Amount is translated to the trading currency based on the exchange rate as of the effective date. **Only applicable for Australian Securities**.|   |frankDefDecUnadj|Unsplit amount of dividend that is franked (subject to tax credit). Published in the currency the dividend was declared in.Amount is translated to the trading currency based on the exchange rate as of the effective date. **Only applicable for Australian Securities**.|   |frankPct|Percent of total dividend that is franked (subject to tax credit). **Only applicable for Australian Securities**.|   |taxRate|Domestic Withholding Tax Rate for a Resident Individual| &lt;h3&gt;Distribution Fields&lt;/h3&gt;   |field|description|   |---|---|   |adjFactor|Factor applied to adjust historical prices. Calculation formulas are available on [OA#12619](https://my.apps.factset.com/oa/pages/12619)|   |adjFactorCombined|Combined adjustment factor for all distribution events on that day.|   |amtDefTradingAdj|Cash distribution amount (net or gross) in the trading currency of the record. Amount is translated to the trading currency based on the exchange rate as of the effective date. The value is adjusted for splits.|   |amtDefTradingUnadj|Cash distribution amount (net or gross) in the trading currency of the record. Amount is translated to the trading currency based on the exchange rate as of the effective date. The value is not adjusted for splits. |   |currency|Currency ISO code associated with distribution amount converted into trading currency of the record.|   |distPct|Distribution percentage of the event  (i.e. 10%). Typical for stock distributions.|   |distOldTerm|Component of distribution ratio- Number of shares held.|   |distNewTerm|Component of distribution ratio - Number of shares received.|   |rightsIssuePrice|Price of the rights issue. |   |rightsIssueCurrency|Currency the rights issue price was declared in.|   |shortDesc|Textual description identifying the event. Example- Split (Mandatory): 3 for 1.| &lt;h3&gt;Splits Fields&lt;/h3&gt;   |field|description|   |---|---|   |adjFactor|Distribution percentage of the event  (i.e. 10%). Typical for stock distributions.|   |adjFactorCombined|Combined adjustment factor for all distribution events on that day.|   |distOldTerm|Component of distribution ratio- Number of shares held.|   |distNewTerm|Component of distribution ratio - Number of shares received.|   |distInstFsymId|Helps to identify an instrument representing the distributed company or security associated with ca event identifier. Its applicable for types like Bonus issue(BNS),Stock dividend(DVS),Rights issue (DSR), and spin off(SPO).|   |shortDesc|Textual description identifying the event. Example- Split (Mandatory): 3 for 1.|  (optional)
   * @param startDate The start date requested for a given date range in **YYYY-MM-DD** format. In the context of corporate actions, this filters the response to only include events within the date range. The frequency between the startDate and endDate is always set to the \&quot;event\&quot; frequency- meaning the service will return only events within those inclusive boundaries. Leaving both startDate and endDate blank will pull \&quot;all\&quot; events for each requested ids.  (optional)
   * @param endDate The end date requested for a given date range in **YYYY-MM-DD** format. In the context of corporate actions, this filters the response to only include events within the date range. The frequency between the startDate and endDate is always set to the \&quot;event\&quot; frequency- meaning the service will return only events within those inclusive boundaries. Leaving both startDate and endDate blank will pull \&quot;all\&quot; events for each requested ids.  (optional)
   * @param currency Currency code for adjusting prices. Default is Local. For a list of currency ISO codes, visit [Online Assistant Page 1470](https://oa.apps.factset.com/pages/1470). (optional)
   * @param cancelledDividend The cancelled dividend returns the dividend details whether they are cancelled or active.  (optional, default to exclude)
   * @return CorporateActionsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Array of security dividend information for a given date range and list of securities </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public CorporateActionsResponse getGPDCorporateActions(java.util.List<String> ids, String eventCategory, java.util.List<String> fields, String startDate, String endDate, String currency, String cancelledDividend) throws ApiException {
    return getGPDCorporateActionsWithHttpInfo(ids, eventCategory, fields, startDate, endDate, currency, cancelledDividend).getData();
  }

  /**
   * Gets Corporate Actions information.
   * Gets the Corporate Actions amounts, dates, types, and flags over a specified date range. You may request future dates to receive information for declared events.  Event Categories: * __Cash Dividends__ (CASH_DIVS)   * **DVC** – Dividend   * **DVCD** – Dividend with DRP Option   * **DRP** – Dividend Reinvestment * __Stock Distributions__ (STOCK_DIST)   * **DVS** – Stock Dividend   * **DVSS** – Stock Dividend, Special   * **BNS** – Bonus Issue   * **BNSS** – Bonus Issue, Special * __Spin Offs__ (SPINOFFS)   * **SPO** – Spin Off * __Rights Issue__ (RIGHTS)   * **DSR** – Rights Issue * __Splits__ (SPLITS)   * **FSP** – Forward Split   * **RSP** – Reverse Split   * **SPL** – Split   * **EXOS** – Exchange of Securities 
   * @param ids The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent Ids. &lt;p&gt;***ids limit** &#x3D;  100 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;* (required)
   * @param eventCategory Selects the Event Category to include in the response.   * **CASH_DIVS** &#x3D; Cash Dividends   * **STOCK_DIST** &#x3D; Stock Distributions   * **SPINOFFS** &#x3D; Spin Offs   * **RIGHTS** &#x3D; Rights Issue   * **SPLITS** &#x3D; Splits   * **ALL** &#x3D; Returns all Event Types. If left blank the service will default to ALL.  (optional, default to ALL)
   * @param fields Request available Corporate Actions data fields to be included in the response. Default is all fields. _fsymId_, _effectiveDate_, _eventTypeCode_ and _requestId_ are always included.    |field|description|   |---|---|   |fsymId|Factset Regional Security Identifier|   |eventTypeCode|Character code that denotes the type of event|   |effectiveDate|The date when security is traded ex-dividend|   |requestId|Identifier that was used for the request.|  &lt;h3&gt;Common Fields&lt;/h3&gt;   |field|description|   |---|---|   |eventId|Uniquely Identifies the event|   |eventTypeDesc|Description of the type of event|   |divTypeCode|Dividend type code. [OA#8764](https://my.apps.factset.com/oa/pages/8764)|   |announcementDate|Date the event was publicly announced|   |recordDate|Record date of the event|   |payDate|Payment date of the event| &lt;h3&gt;Dividend Fields&lt;/h3&gt;   |field|description|   |---|---|   |currency|Currency ISO code associated with distribution amount converted into trading currency of the record.|   |amtDefNetGrossIndicator|Indicates whether the default amount is net or gross. G&#x3D;Gross; N&#x3D;Net.|   |amtDefTradingAdj|Cash distribution amount (net or gross) in the trading currency of the record. Amount is translated to the trading currency based on the exchange rate as of the effective date. The value is adjusted for splits.|   |amtDefTradingUnadj|Cash distribution amount (net or gross) in the trading currency of the record. Amount is translated to the trading currency based on the exchange rate as of the effective date. The value is not adjusted for splits. |   |amtNetTradingAdj|Net distribution amount in the trading currency of the record. Amount is translated to the trading currency based on the exchange rate as of the effective date.  The value is adjusted for splits.|   |amtNetTradingUnadj|Net distribution amount in the trading currency of the record. Amount is translated to the trading currency based on the exchange rate as of the effective date. The value is not adjusted for splits.|   |amtGrossTradingAdj|Gross distribution amount in the trading currency of the record. Amount is translated to the trading currency based on the exchange rate as of the effective date. The value is adjusted for splits.|   |amtGrossTradingUnadj|Gross distribution amount in the trading currency of the record. Amount is translated to the trading currency based on the exchange rate as of the effective date. The value is not adjusted for splits.|   |declaredCurrency|Currency ISO code associated with the declared amount. |   |amtDefDecAdj|Cash distribution amount (net or gross) in the currency it was declared in. The value is adjusted for splits.|   |amtDefDecUnadj|Cash distribution amount (net or gross) in the currency it was declared in. The value is not adjusted for splits.|   |amtNetDecAdj|Net cash distribution amount in the currency it was declared in. The value is adjusted for splits. |   |amtNetDecUnadj|Net cash distribution amount in the currency it was declared in. The value is not adjusted for splits.|   |amtGrossDecAdj|Gross cash distribution amount in the currency it was declared in. N/A is returned if the gross amount is not available. The value is adjusted for splits.|   |amtGrossDecUnadj|Gross cash distribution amount in the currency it was declared in. The value is not adjusted for splits.|   |dividendStatus|Identifies the cancelled dividends status( Active, Cancelled, Postponed, Partial Information) and helps to evaluate their price and portfolio performance.Its applicable to Dividend(DVC) and Dividend with DRP option(DVCD)|   |dividendActiveFlag|Identifies whether the dividend record is currently active(1) or inactive(0).Its applicable to Dividend(DVC) and Dividend with DRP option(DVCD)|   |dividendsSpecFlag|Indicates a special price implications exists, which may or may not include special dividends. Indicates whether an adjustment should be made to historical pricing.|   |dividendFrequencyDesc|Dividend Frequency for different event types in the form of a text as per the descriptions found here [OA#8764](https://my.apps.factset.com/oa/pages/8764#Frequency)|   |dividendFrequencyCode|Dividend Frequency for different event types in the form of a code as per the details found here [OA#8764](https://my.apps.factset.com/oa/pages/8764#Frequency)|   |frankDefTradingAdj|Split amount of dividend that is franked (subject to tax credit). Published in the trading currency of the input ID. Amount is translated to the trading currency based on the exchange rate as of the effective date.**Only applicable for Australian Securities**.|   |frankDefTradingUnadj|Unsplit amount of dividend that is franked (subject to tax credit). Published in the trading currency of the input ID. Amount is translated to the trading currency based on the exchange rate as of the effective date.**Only applicable for Australian Securities**.|   |frankDefDecAdj|Split amount of dividend that is franked (subject to tax credit). Published in the currency the dividend was declared in.Amount is translated to the trading currency based on the exchange rate as of the effective date. **Only applicable for Australian Securities**.|   |frankDefDecUnadj|Unsplit amount of dividend that is franked (subject to tax credit). Published in the currency the dividend was declared in.Amount is translated to the trading currency based on the exchange rate as of the effective date. **Only applicable for Australian Securities**.|   |frankPct|Percent of total dividend that is franked (subject to tax credit). **Only applicable for Australian Securities**.|   |taxRate|Domestic Withholding Tax Rate for a Resident Individual| &lt;h3&gt;Distribution Fields&lt;/h3&gt;   |field|description|   |---|---|   |adjFactor|Factor applied to adjust historical prices. Calculation formulas are available on [OA#12619](https://my.apps.factset.com/oa/pages/12619)|   |adjFactorCombined|Combined adjustment factor for all distribution events on that day.|   |amtDefTradingAdj|Cash distribution amount (net or gross) in the trading currency of the record. Amount is translated to the trading currency based on the exchange rate as of the effective date. The value is adjusted for splits.|   |amtDefTradingUnadj|Cash distribution amount (net or gross) in the trading currency of the record. Amount is translated to the trading currency based on the exchange rate as of the effective date. The value is not adjusted for splits. |   |currency|Currency ISO code associated with distribution amount converted into trading currency of the record.|   |distPct|Distribution percentage of the event  (i.e. 10%). Typical for stock distributions.|   |distOldTerm|Component of distribution ratio- Number of shares held.|   |distNewTerm|Component of distribution ratio - Number of shares received.|   |rightsIssuePrice|Price of the rights issue. |   |rightsIssueCurrency|Currency the rights issue price was declared in.|   |shortDesc|Textual description identifying the event. Example- Split (Mandatory): 3 for 1.| &lt;h3&gt;Splits Fields&lt;/h3&gt;   |field|description|   |---|---|   |adjFactor|Distribution percentage of the event  (i.e. 10%). Typical for stock distributions.|   |adjFactorCombined|Combined adjustment factor for all distribution events on that day.|   |distOldTerm|Component of distribution ratio- Number of shares held.|   |distNewTerm|Component of distribution ratio - Number of shares received.|   |distInstFsymId|Helps to identify an instrument representing the distributed company or security associated with ca event identifier. Its applicable for types like Bonus issue(BNS),Stock dividend(DVS),Rights issue (DSR), and spin off(SPO).|   |shortDesc|Textual description identifying the event. Example- Split (Mandatory): 3 for 1.|  (optional)
   * @param startDate The start date requested for a given date range in **YYYY-MM-DD** format. In the context of corporate actions, this filters the response to only include events within the date range. The frequency between the startDate and endDate is always set to the \&quot;event\&quot; frequency- meaning the service will return only events within those inclusive boundaries. Leaving both startDate and endDate blank will pull \&quot;all\&quot; events for each requested ids.  (optional)
   * @param endDate The end date requested for a given date range in **YYYY-MM-DD** format. In the context of corporate actions, this filters the response to only include events within the date range. The frequency between the startDate and endDate is always set to the \&quot;event\&quot; frequency- meaning the service will return only events within those inclusive boundaries. Leaving both startDate and endDate blank will pull \&quot;all\&quot; events for each requested ids.  (optional)
   * @param currency Currency code for adjusting prices. Default is Local. For a list of currency ISO codes, visit [Online Assistant Page 1470](https://oa.apps.factset.com/pages/1470). (optional)
   * @param cancelledDividend The cancelled dividend returns the dividend details whether they are cancelled or active.  (optional, default to exclude)
   * @return ApiResponse&lt;CorporateActionsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Array of security dividend information for a given date range and list of securities </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CorporateActionsResponse> getGPDCorporateActionsWithHttpInfo(java.util.List<String> ids, String eventCategory, java.util.List<String> fields, String startDate, String endDate, String currency, String cancelledDividend) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ids' is set
    if (ids == null) {
      throw new ApiException(400, "Missing the required parameter 'ids' when calling getGPDCorporateActions");
    }
    
    // create path and map variables
    String localVarPath = "/factset-global-prices/v1/corporate-actions";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "ids", ids));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "eventCategory", eventCategory));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields", fields));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startDate", startDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "endDate", endDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "currency", currency));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "cancelledDividend", cancelledDividend));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        CorporateActionsResponse
      
    > apiResponse = apiClient.invokeAPI("CorporateActionsApi.getGPDCorporateActions", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getGPDCorporateActionsResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Gets Indicated Annualized Dividend information.
   * Gets the Annualized dividend or the latest reported dividend. The annualized dividend calculations does not involve cancelled dividends. 
   * @param ids The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent Ids. &lt;p&gt;***ids limit** &#x3D;  100 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;* (required)
   * @param currency Currency code for adjusting prices. Default is Local. For a list of currency ISO codes, visit [Online Assistant Page 1470](https://oa.apps.factset.com/pages/1470). (optional)
   * @return AnnualizedDividendResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Array of annualized dividend information. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public AnnualizedDividendResponse getannualizedDividends(java.util.List<String> ids, String currency) throws ApiException {
    return getannualizedDividendsWithHttpInfo(ids, currency).getData();
  }

  /**
   * Gets Indicated Annualized Dividend information.
   * Gets the Annualized dividend or the latest reported dividend. The annualized dividend calculations does not involve cancelled dividends. 
   * @param ids The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent Ids. &lt;p&gt;***ids limit** &#x3D;  100 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;* (required)
   * @param currency Currency code for adjusting prices. Default is Local. For a list of currency ISO codes, visit [Online Assistant Page 1470](https://oa.apps.factset.com/pages/1470). (optional)
   * @return ApiResponse&lt;AnnualizedDividendResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Array of annualized dividend information. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AnnualizedDividendResponse> getannualizedDividendsWithHttpInfo(java.util.List<String> ids, String currency) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ids' is set
    if (ids == null) {
      throw new ApiException(400, "Missing the required parameter 'ids' when calling getannualizedDividends");
    }
    
    // create path and map variables
    String localVarPath = "/factset-global-prices/v1/annualized-dividends";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "ids", ids));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "currency", currency));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        AnnualizedDividendResponse
      
    > apiResponse = apiClient.invokeAPI("CorporateActionsApi.getannualizedDividends", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getannualizedDividendsResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Gets Indicated Annualized Dividend information.
   * Gets the Annualized dividend or the latest reported dividend. The annualized dividend calculations does not involve cancelled dividends.
   * @param annualizedDividendsRequest Request object for &#x60;Annualized Response&#x60;. (required)
   * @return AnnualizedDividendResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Array of security prices </td><td>  -  </td></tr>
     </table>
   */
  public AnnualizedDividendResponse getannualizedDividendsForList(AnnualizedDividendsRequest annualizedDividendsRequest) throws ApiException {
    return getannualizedDividendsForListWithHttpInfo(annualizedDividendsRequest).getData();
  }

  /**
   * Gets Indicated Annualized Dividend information.
   * Gets the Annualized dividend or the latest reported dividend. The annualized dividend calculations does not involve cancelled dividends.
   * @param annualizedDividendsRequest Request object for &#x60;Annualized Response&#x60;. (required)
   * @return ApiResponse&lt;AnnualizedDividendResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Array of security prices </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AnnualizedDividendResponse> getannualizedDividendsForListWithHttpInfo(AnnualizedDividendsRequest annualizedDividendsRequest) throws ApiException {
    Object localVarPostBody = annualizedDividendsRequest;
    
    // verify the required parameter 'annualizedDividendsRequest' is set
    if (annualizedDividendsRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'annualizedDividendsRequest' when calling getannualizedDividendsForList");
    }
    
    // create path and map variables
    String localVarPath = "/factset-global-prices/v1/annualized-dividends";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        AnnualizedDividendResponse
      
    > apiResponse = apiClient.invokeAPI("CorporateActionsApi.getannualizedDividendsForList", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getannualizedDividendsForListResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Requests Corporate Actions information.
   * Gets the Corporate Actions amounts, dates, types, and flags over a specified date range. You may request future dates to receive information for declared events. &lt;p&gt;**_startDate and endDate are required parameters. The input startDate must come before the input endDate._**
   * @param corporateActionsRequest Request object for &#x60;Corporate Actions&#x60;. (required)
   * @return CorporateActionsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Array of security prices </td><td>  -  </td></tr>
     </table>
   */
  public CorporateActionsResponse postCorporateActions(CorporateActionsRequest corporateActionsRequest) throws ApiException {
    return postCorporateActionsWithHttpInfo(corporateActionsRequest).getData();
  }

  /**
   * Requests Corporate Actions information.
   * Gets the Corporate Actions amounts, dates, types, and flags over a specified date range. You may request future dates to receive information for declared events. &lt;p&gt;**_startDate and endDate are required parameters. The input startDate must come before the input endDate._**
   * @param corporateActionsRequest Request object for &#x60;Corporate Actions&#x60;. (required)
   * @return ApiResponse&lt;CorporateActionsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Array of security prices </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CorporateActionsResponse> postCorporateActionsWithHttpInfo(CorporateActionsRequest corporateActionsRequest) throws ApiException {
    Object localVarPostBody = corporateActionsRequest;
    
    // verify the required parameter 'corporateActionsRequest' is set
    if (corporateActionsRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'corporateActionsRequest' when calling postCorporateActions");
    }
    
    // create path and map variables
    String localVarPath = "/factset-global-prices/v1/corporate-actions";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        CorporateActionsResponse
      
    > apiResponse = apiClient.invokeAPI("CorporateActionsApi.postCorporateActions", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, postCorporateActionsResponseTypeMap, false);

    return apiResponse;

  }
}
