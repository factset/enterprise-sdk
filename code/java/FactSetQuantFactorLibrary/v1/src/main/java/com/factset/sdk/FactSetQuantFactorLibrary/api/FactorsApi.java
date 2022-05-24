package com.factset.sdk.FactSetQuantFactorLibrary.api;

import com.factset.sdk.FactSetQuantFactorLibrary.ApiException;
import com.factset.sdk.FactSetQuantFactorLibrary.ApiClient;
import com.factset.sdk.FactSetQuantFactorLibrary.ApiResponse;
import com.factset.sdk.FactSetQuantFactorLibrary.Configuration;
import com.factset.sdk.FactSetQuantFactorLibrary.Pair;

import javax.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.FactSetQuantFactorLibrary.models.ErrorResponse;
import com.factset.sdk.FactSetQuantFactorLibrary.models.FactorsRequest;
import com.factset.sdk.FactSetQuantFactorLibrary.models.FactorsResponse;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class FactorsApi {
  private ApiClient apiClient;

  public FactorsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public FactorsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

    private static final Map<Integer, GenericType> getFactorsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getFactorsResponseTypeMap.put(200, new GenericType<FactorsResponse>(){});
    getFactorsResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getFactorsResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getFactorsResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getFactorsResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getFactorsResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }
  private static final Map<Integer, GenericType> getFactorsForListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getFactorsForListResponseTypeMap.put(200, new GenericType<FactorsResponse>(){});
    getFactorsForListResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getFactorsForListResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getFactorsForListResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getFactorsForListResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getFactorsForListResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
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
   * Retrieves Quant Factors for a small list of ids.
   * Retrieves Quant Factors for a small list of ids. Request an array of specific Factors, or fetch all factors within a Factor Group. Use the &#x60;library&#x60; endpoint to return a full list of available Factors, Factor Groups, and related meta data. 
   * @param ids Security or Entity identifiers. FactSet Identifiers, tickers, CUSIP and SEDOL are accepted as inputs. **NOTE:** Fixed Income identifiers, ETFs, and Options are not accepted in this endpoint. &lt;p&gt;***Maximum possible ids limit** &#x3D;  3500 per request*&lt;/p&gt; &#x60;NOTE:&#x60; *The maximum possible ids limit for a request will **decrease** based on the size of the historical date range, the number of factors or factorGroups requested.* *&lt;p&gt; GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;*  (required)
   * @param factors Array of individual Factor Items requested. For a list of all available factors and descriptions use the &#x60;/library&#x60; endpoint.***&lt;p&gt;factors limit** &#x3D; 20 individual factors per request*  (required)
   * @param startDate The start date requested for a given date range in **YYYY-MM-DD** format. Future dates (T+1) are not accepted in this endpoint.  (required)
   * @param endDate The end date requested for a given date range in **YYYY-MM-DD** format. Future dates (T+1) are not accepted in this endpoint. **NOTE:** The input endDate must come AFTER the input startDate.  (required)
   * @param factorGroups Fetch a collection of Factors that fall within one of the below \&quot;groups\&quot;. For example, resting factorGroup&#x3D;Momentum will return all factors under the momentum group. To know which items are available in each group use the /library endpoint.***&lt;p&gt;factor groups limit** &#x3D; 5 factor groups per request* ### Classification and Reference |Group|Descriptions| |---|---| |Asset_Data|Easily input security-level metadata into your quantitative research process. Common metrics used include Days Since Report, Days to Report, ADR Flag, and Minimum Lot Size. Integrate variables from FactSet Reference, FactSet Fundamentals, and FactSet Estimates databases to impose portfolio constraints and access general reference data.| |Country|Evaluate securities based on the countries in which they have the highest exposure. Analyze company-level exposures across various countries and measure how concentrated a firm’s business is within their countries of operation. Metrics are derived from FactSet Reference and FactSet Geographic Revenue Exposure (GeoRev) databases and include Country Exposure, Country of Incorporation, and Country of Risk.| |Industry|Classify securities based on the industries in which they generate the majority of their revenues. Incorporate variables from the FactSet Revere Business and Industry Classification System (RBICS) database to measure how concentrated a firm’s business is within the industries they operate and across various sub-sectors. Common metrics include Industry Classifications, Industry Exposures, and Industry Concentration.| |Size|Assess how large or small a company is relative to industry peers. Create size buckets and clarify the systematic portion of company returns using variables from FactSet Prices, FactSet RBICS, FactSet Fundamentals, and FactSet Estimates. Common metrics include Size Classification, Enterprise Value, and Market Share.| ### Market Factors |Group|Descriptions| |---|---| |Liquidity|Assess how investible a security is, as well as the potential market impact of a trade using signals built off pricing and volume data from FactSet Prices. Integrate factors as components into your alpha models to evaluate systematic risk or input them into your portfolio construction models to dictate how much of an asset can be bought or sold based on liquidity levels. Common metrics include Average Dollars Traded, Share Turnover, and Bid Ask Spread.| |Market Sensitivity|Clarify the common variations in stock returns attributable to the performance of their local market indices. Leverage regressions performed between security-level and market-index returns across different return horizons and methodologies. Metrics are derived from FactSet Prices and include Beta R-Squared, Up Market Beta, and Down Market Beta.| |Momentum|Analyze the historical momentum of a security and uncover how each underlying data item, calculation, and horizon can be meaningful in different situations. Metrics are derived from FactSet Prices and include 52W Position, Return Momentum, and Velocity.| |Technical|Forecast the direction of future price movements based on historical market data and leverage heuristic or pattern-based signals from FactSet Prices. Common metrics include Average True Range, Ulcer Performance Index, and Money Flow Volume.| |Volatility|Measure the uncertainty in asset price movements with indicators from the FactSet Prices database. Capture various forms of uncertainty by employing statistical calculations on security performance data. Common metrics include Return Volatility, Semivariance, and Turbulence.| ### Core Fundamentals |Group|Descriptions| |---|---| |Efficiency|Leverage core financial data to determine how effectively a company uses its assets, collects payments, and operates its business. Most variables are measured as turnover ratios and include changes over time to provide transparency into the efficiency of each business process. Metrics are derived from FactSet Fundamentals and FactSet Estimates and include Asset Turnover, Receivables Turnover, and Cash Conversion Cycle| |Growth|Measure a company’s ability to grow faster than its peers. Compare the future expected growth of a company with its historical growth and view growth rates adjusted for stability. Integrate variables from FactSet RBICS, FactSet Fundamentals, and FactSet Estimates to analyze growth rates over multiple horizons including Market Share, Sales, and EPS Growth| |Management|Gain insight into how management finances their business and the decisions they make that impact the core financial statements. These choices are reflected in changes to total debt or equity, the overall size of the balance sheet, and decisions around the accounting methods used. Metrics are derived from FactSet Fundamentals and FactSet Estimates and include Capital Expenditures (CAPEX) Growth, Equity Buyback Ratio, and Depreciation &amp; Amortization Variability| |Profitability|Evaluate a company’s ability to generate income relative to its revenue or balance sheet metrics. Identify lucrative businesses relative to their industry, region, and size profile. Metrics are derived from FactSet Fundamentals and FactSet Estimates and include Return on Assets, Return on Invested Capital Change, and Return on Total Equity |Quality|Understand the overall financial health and quality of a company’s business. Use historical data from FactSet Fundamentals to analyze balance sheet health, stability of earnings and profit margins, variability in cash flows, and trends that look beyond headline financial metrics. Common metrics include Cash Earnings Ratio Variability, Revenue Stability, and Accruals Ratios. Composite quality scores (i.e., the Piotroski F-Score, Beneish M-Score, and Altman Z-Score) and their underlying components are also available as individual metrics.| |Solvency|Measure a company’s ability to meet their short- and long-term financial obligations and determine the degree of leverage employed to run their business. Incorporate financial ratios from FactSet Fundamentals and FactSet Estimates to quantify liability or debt obligation relative to earnings, cash flows, equities, or items from the asset side of the balance sheet. Common metrics include Current Ratio, Current Asset Liquidity, and Debt to Equity Change.| |Value|Quickly determine how cheap or expensive a company is based on common security-level characteristics from FactSet Prices, FactSet Fundamentals, and FactSet Estimates. Apply factors as an intersection between other factors for a more customized analysis, such as finding the cheapest stocks among the highest quality companies. Common metrics include Earnings Yield, Book to Price, and Revenue to Enterprise Value.| ### Macro and Cross-Asset |Group|Descriptions| |---|---| |Commodity|Quantify the impact movements in the commodity markets have on equity prices. Metrics are derived from FactSet Prices and allow you to measure company-level exposure to commodities such as Gold, Crude Oil, Coffee, and Live Cattle.| |FX_Sensitivity| Analyze security-level sensitivity to fluctuations in the currency markets. Metrics are derived from FactSet Prices and allow you to identify company exposures to currencies such as USD, EUR, JPY, and CNY. |Debt|Uncover details related to company debt through issuer-level factor exposures. Use the FactSet Fixed Income Prices &amp; Derived Analytics database to aggregate metrics at the company level. Common metrics include Effective Duration, Option Adjusted Spread, and Yield to Worst.| |Economic|Capture daily security exposures to leading economic indicator forecasts. Leverage the Quant Factor Library’s detailed country exposure model to attribute economic measures to individual companies. Metrics are derived from FactSet Economic Estimates and include Real GPD Growth, Industrial Production Growth, Core CPI Inflation, and Policy Rates. ### Alternative |Group|Descriptions| |---|---| |Analyst_Sentiment|Analyze a security’s outlook from the perspective of a sell-side research analyst. Leverage consensus estimates data from the FactSet Estimates database to analyze the directional change in estimate revisions for various financial statement items and time periods. Common metrics include Sales Estimate Revisions, Free Cash Flow Estimate Revisions, and Robust Estimate Revisions.| |Corporate_Governance|Identify companies with strong corporate governance. Analyze the profile of a company’s management and board based on tenure, diversity, compensation incentives, and more factors from the FactSet People database. Common metrics include Management - Average Age, Board - Activist Member, and Executives - Average Bonus.| |Crowding|Understand the degree to which investors own, purchase, or sell a security. View characteristics of each investor’s profile and characterize crowding from passive, active, institutional, ETF, and hedge fund investors. Use metrics from FactSet Ownership, FactSet Prices, and FactSet Fundamentals to help identify potential effects of crowding such as whether certain investor types are acquiring or divesting from a given security. Common metrics include Active Buyer Percent of Portfolio Change, ETF Days to Liquidate, and Hedge Fund Percent Outstanding.| |Insider_Activity|Measure the degree to which insiders own, purchase, or sell their company’s stock. Analyze the sentiment of those with access to material non-public information or determine how the amount of insider ownership may impact management’s key business decisions. Metrics are derived from FactSet Ownership and include Insider Percent Outstanding, Insider Number of Buys, and Insider Seller Position Change. |ESG|Analyze Environmental, Social and Governance (ESG) behavior, which are aggregated and categorized into continuously updated, material ESG scores to uncover risks and opportunities from companies. Truvalue Labs focuses on company ESG behavior from external sources and includes both positive and negative events that go beyond traditional sources of ESG risk data.  (optional)
   * @param frequency Controls the display frequency of the data returned.   * **D** &#x3D; Daily   * **W** &#x3D; Weekly, based on the last day of the week of the start date.   * **M** &#x3D; Monthly, based on the last trading day of the month.   * **AM** &#x3D; Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16 etc.).   * **CQ** &#x3D; Quarterly based on the last trading day of the calendar quarter (March, June, September, or December).   * **AY** &#x3D; Actual Annual, based on the start date.   * **CY** &#x3D; Calendar Annual, based on the last trading day of the calendar year.  (optional, default to M)
   * @return FactorsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Factor Response Object </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the servier is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public FactorsResponse getFactors(java.util.List<String> ids, java.util.List<String> factors, String startDate, String endDate, java.util.List<String> factorGroups, String frequency) throws ApiException {
    return getFactorsWithHttpInfo(ids, factors, startDate, endDate, factorGroups, frequency).getData();
  }

  /**
   * Retrieves Quant Factors for a small list of ids.
   * Retrieves Quant Factors for a small list of ids. Request an array of specific Factors, or fetch all factors within a Factor Group. Use the &#x60;library&#x60; endpoint to return a full list of available Factors, Factor Groups, and related meta data. 
   * @param ids Security or Entity identifiers. FactSet Identifiers, tickers, CUSIP and SEDOL are accepted as inputs. **NOTE:** Fixed Income identifiers, ETFs, and Options are not accepted in this endpoint. &lt;p&gt;***Maximum possible ids limit** &#x3D;  3500 per request*&lt;/p&gt; &#x60;NOTE:&#x60; *The maximum possible ids limit for a request will **decrease** based on the size of the historical date range, the number of factors or factorGroups requested.* *&lt;p&gt; GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;*  (required)
   * @param factors Array of individual Factor Items requested. For a list of all available factors and descriptions use the &#x60;/library&#x60; endpoint.***&lt;p&gt;factors limit** &#x3D; 20 individual factors per request*  (required)
   * @param startDate The start date requested for a given date range in **YYYY-MM-DD** format. Future dates (T+1) are not accepted in this endpoint.  (required)
   * @param endDate The end date requested for a given date range in **YYYY-MM-DD** format. Future dates (T+1) are not accepted in this endpoint. **NOTE:** The input endDate must come AFTER the input startDate.  (required)
   * @param factorGroups Fetch a collection of Factors that fall within one of the below \&quot;groups\&quot;. For example, resting factorGroup&#x3D;Momentum will return all factors under the momentum group. To know which items are available in each group use the /library endpoint.***&lt;p&gt;factor groups limit** &#x3D; 5 factor groups per request* ### Classification and Reference |Group|Descriptions| |---|---| |Asset_Data|Easily input security-level metadata into your quantitative research process. Common metrics used include Days Since Report, Days to Report, ADR Flag, and Minimum Lot Size. Integrate variables from FactSet Reference, FactSet Fundamentals, and FactSet Estimates databases to impose portfolio constraints and access general reference data.| |Country|Evaluate securities based on the countries in which they have the highest exposure. Analyze company-level exposures across various countries and measure how concentrated a firm’s business is within their countries of operation. Metrics are derived from FactSet Reference and FactSet Geographic Revenue Exposure (GeoRev) databases and include Country Exposure, Country of Incorporation, and Country of Risk.| |Industry|Classify securities based on the industries in which they generate the majority of their revenues. Incorporate variables from the FactSet Revere Business and Industry Classification System (RBICS) database to measure how concentrated a firm’s business is within the industries they operate and across various sub-sectors. Common metrics include Industry Classifications, Industry Exposures, and Industry Concentration.| |Size|Assess how large or small a company is relative to industry peers. Create size buckets and clarify the systematic portion of company returns using variables from FactSet Prices, FactSet RBICS, FactSet Fundamentals, and FactSet Estimates. Common metrics include Size Classification, Enterprise Value, and Market Share.| ### Market Factors |Group|Descriptions| |---|---| |Liquidity|Assess how investible a security is, as well as the potential market impact of a trade using signals built off pricing and volume data from FactSet Prices. Integrate factors as components into your alpha models to evaluate systematic risk or input them into your portfolio construction models to dictate how much of an asset can be bought or sold based on liquidity levels. Common metrics include Average Dollars Traded, Share Turnover, and Bid Ask Spread.| |Market Sensitivity|Clarify the common variations in stock returns attributable to the performance of their local market indices. Leverage regressions performed between security-level and market-index returns across different return horizons and methodologies. Metrics are derived from FactSet Prices and include Beta R-Squared, Up Market Beta, and Down Market Beta.| |Momentum|Analyze the historical momentum of a security and uncover how each underlying data item, calculation, and horizon can be meaningful in different situations. Metrics are derived from FactSet Prices and include 52W Position, Return Momentum, and Velocity.| |Technical|Forecast the direction of future price movements based on historical market data and leverage heuristic or pattern-based signals from FactSet Prices. Common metrics include Average True Range, Ulcer Performance Index, and Money Flow Volume.| |Volatility|Measure the uncertainty in asset price movements with indicators from the FactSet Prices database. Capture various forms of uncertainty by employing statistical calculations on security performance data. Common metrics include Return Volatility, Semivariance, and Turbulence.| ### Core Fundamentals |Group|Descriptions| |---|---| |Efficiency|Leverage core financial data to determine how effectively a company uses its assets, collects payments, and operates its business. Most variables are measured as turnover ratios and include changes over time to provide transparency into the efficiency of each business process. Metrics are derived from FactSet Fundamentals and FactSet Estimates and include Asset Turnover, Receivables Turnover, and Cash Conversion Cycle| |Growth|Measure a company’s ability to grow faster than its peers. Compare the future expected growth of a company with its historical growth and view growth rates adjusted for stability. Integrate variables from FactSet RBICS, FactSet Fundamentals, and FactSet Estimates to analyze growth rates over multiple horizons including Market Share, Sales, and EPS Growth| |Management|Gain insight into how management finances their business and the decisions they make that impact the core financial statements. These choices are reflected in changes to total debt or equity, the overall size of the balance sheet, and decisions around the accounting methods used. Metrics are derived from FactSet Fundamentals and FactSet Estimates and include Capital Expenditures (CAPEX) Growth, Equity Buyback Ratio, and Depreciation &amp; Amortization Variability| |Profitability|Evaluate a company’s ability to generate income relative to its revenue or balance sheet metrics. Identify lucrative businesses relative to their industry, region, and size profile. Metrics are derived from FactSet Fundamentals and FactSet Estimates and include Return on Assets, Return on Invested Capital Change, and Return on Total Equity |Quality|Understand the overall financial health and quality of a company’s business. Use historical data from FactSet Fundamentals to analyze balance sheet health, stability of earnings and profit margins, variability in cash flows, and trends that look beyond headline financial metrics. Common metrics include Cash Earnings Ratio Variability, Revenue Stability, and Accruals Ratios. Composite quality scores (i.e., the Piotroski F-Score, Beneish M-Score, and Altman Z-Score) and their underlying components are also available as individual metrics.| |Solvency|Measure a company’s ability to meet their short- and long-term financial obligations and determine the degree of leverage employed to run their business. Incorporate financial ratios from FactSet Fundamentals and FactSet Estimates to quantify liability or debt obligation relative to earnings, cash flows, equities, or items from the asset side of the balance sheet. Common metrics include Current Ratio, Current Asset Liquidity, and Debt to Equity Change.| |Value|Quickly determine how cheap or expensive a company is based on common security-level characteristics from FactSet Prices, FactSet Fundamentals, and FactSet Estimates. Apply factors as an intersection between other factors for a more customized analysis, such as finding the cheapest stocks among the highest quality companies. Common metrics include Earnings Yield, Book to Price, and Revenue to Enterprise Value.| ### Macro and Cross-Asset |Group|Descriptions| |---|---| |Commodity|Quantify the impact movements in the commodity markets have on equity prices. Metrics are derived from FactSet Prices and allow you to measure company-level exposure to commodities such as Gold, Crude Oil, Coffee, and Live Cattle.| |FX_Sensitivity| Analyze security-level sensitivity to fluctuations in the currency markets. Metrics are derived from FactSet Prices and allow you to identify company exposures to currencies such as USD, EUR, JPY, and CNY. |Debt|Uncover details related to company debt through issuer-level factor exposures. Use the FactSet Fixed Income Prices &amp; Derived Analytics database to aggregate metrics at the company level. Common metrics include Effective Duration, Option Adjusted Spread, and Yield to Worst.| |Economic|Capture daily security exposures to leading economic indicator forecasts. Leverage the Quant Factor Library’s detailed country exposure model to attribute economic measures to individual companies. Metrics are derived from FactSet Economic Estimates and include Real GPD Growth, Industrial Production Growth, Core CPI Inflation, and Policy Rates. ### Alternative |Group|Descriptions| |---|---| |Analyst_Sentiment|Analyze a security’s outlook from the perspective of a sell-side research analyst. Leverage consensus estimates data from the FactSet Estimates database to analyze the directional change in estimate revisions for various financial statement items and time periods. Common metrics include Sales Estimate Revisions, Free Cash Flow Estimate Revisions, and Robust Estimate Revisions.| |Corporate_Governance|Identify companies with strong corporate governance. Analyze the profile of a company’s management and board based on tenure, diversity, compensation incentives, and more factors from the FactSet People database. Common metrics include Management - Average Age, Board - Activist Member, and Executives - Average Bonus.| |Crowding|Understand the degree to which investors own, purchase, or sell a security. View characteristics of each investor’s profile and characterize crowding from passive, active, institutional, ETF, and hedge fund investors. Use metrics from FactSet Ownership, FactSet Prices, and FactSet Fundamentals to help identify potential effects of crowding such as whether certain investor types are acquiring or divesting from a given security. Common metrics include Active Buyer Percent of Portfolio Change, ETF Days to Liquidate, and Hedge Fund Percent Outstanding.| |Insider_Activity|Measure the degree to which insiders own, purchase, or sell their company’s stock. Analyze the sentiment of those with access to material non-public information or determine how the amount of insider ownership may impact management’s key business decisions. Metrics are derived from FactSet Ownership and include Insider Percent Outstanding, Insider Number of Buys, and Insider Seller Position Change. |ESG|Analyze Environmental, Social and Governance (ESG) behavior, which are aggregated and categorized into continuously updated, material ESG scores to uncover risks and opportunities from companies. Truvalue Labs focuses on company ESG behavior from external sources and includes both positive and negative events that go beyond traditional sources of ESG risk data.  (optional)
   * @param frequency Controls the display frequency of the data returned.   * **D** &#x3D; Daily   * **W** &#x3D; Weekly, based on the last day of the week of the start date.   * **M** &#x3D; Monthly, based on the last trading day of the month.   * **AM** &#x3D; Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16 etc.).   * **CQ** &#x3D; Quarterly based on the last trading day of the calendar quarter (March, June, September, or December).   * **AY** &#x3D; Actual Annual, based on the start date.   * **CY** &#x3D; Calendar Annual, based on the last trading day of the calendar year.  (optional, default to M)
   * @return ApiResponse&lt;FactorsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Factor Response Object </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the servier is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<FactorsResponse> getFactorsWithHttpInfo(java.util.List<String> ids, java.util.List<String> factors, String startDate, String endDate, java.util.List<String> factorGroups, String frequency) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ids' is set
    if (ids == null) {
      throw new ApiException(400, "Missing the required parameter 'ids' when calling getFactors");
    }
    
    // verify the required parameter 'factors' is set
    if (factors == null) {
      throw new ApiException(400, "Missing the required parameter 'factors' when calling getFactors");
    }
    
    // verify the required parameter 'startDate' is set
    if (startDate == null) {
      throw new ApiException(400, "Missing the required parameter 'startDate' when calling getFactors");
    }
    
    // verify the required parameter 'endDate' is set
    if (endDate == null) {
      throw new ApiException(400, "Missing the required parameter 'endDate' when calling getFactors");
    }
    
    // create path and map variables
    String localVarPath = "/factset-quant-factor-library/v1/factors";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "ids", ids));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "factors", factors));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "factorGroups", factorGroups));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startDate", startDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "endDate", endDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "frequency", frequency));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        FactorsResponse
      
    > apiResponse = apiClient.invokeAPI("FactorsApi.getFactors", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getFactorsResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Retrieves Quant Factors for a large list of ids.
   * Retrieves Quant Factors for a large list of ids. Use the &#x60;library&#x60; endpoint to return a full list of available Factors, Factor Groups, and related meta data. 
   * @param factorsRequest Request Body for requesting a list or group of Factors and ids. (required)
   * @return FactorsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Factor Response Object </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the servier is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public FactorsResponse getFactorsForList(FactorsRequest factorsRequest) throws ApiException {
    return getFactorsForListWithHttpInfo(factorsRequest).getData();
  }

  /**
   * Retrieves Quant Factors for a large list of ids.
   * Retrieves Quant Factors for a large list of ids. Use the &#x60;library&#x60; endpoint to return a full list of available Factors, Factor Groups, and related meta data. 
   * @param factorsRequest Request Body for requesting a list or group of Factors and ids. (required)
   * @return ApiResponse&lt;FactorsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Factor Response Object </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the servier is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<FactorsResponse> getFactorsForListWithHttpInfo(FactorsRequest factorsRequest) throws ApiException {
    Object localVarPostBody = factorsRequest;
    
    // verify the required parameter 'factorsRequest' is set
    if (factorsRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'factorsRequest' when calling getFactorsForList");
    }
    
    // create path and map variables
    String localVarPath = "/factset-quant-factor-library/v1/factors";

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
        
        FactorsResponse
      
    > apiResponse = apiClient.invokeAPI("FactorsApi.getFactorsForList", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getFactorsForListResponseTypeMap, false);

    return apiResponse;

  }
}
