package com.factset.sdk.FactSetGlobalPrices.api;

import com.factset.sdk.FactSetGlobalPrices.ApiException;
import com.factset.sdk.FactSetGlobalPrices.ApiClient;
import com.factset.sdk.FactSetGlobalPrices.ApiResponse;
import com.factset.sdk.FactSetGlobalPrices.Configuration;
import com.factset.sdk.FactSetGlobalPrices.Pair;

import jakarta.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.FactSetGlobalPrices.models.CorporateActionsResponseCalendar;
import com.factset.sdk.FactSetGlobalPrices.models.DividendsResponse;
import com.factset.sdk.FactSetGlobalPrices.models.ErrorResponseCalendar;
import com.factset.sdk.FactSetGlobalPrices.models.EventCountResponse;
import com.factset.sdk.FactSetGlobalPrices.models.ExchangesResponse;
import java.time.LocalDate;
import com.factset.sdk.FactSetGlobalPrices.models.RightsIssuesResponse;
import com.factset.sdk.FactSetGlobalPrices.models.SpinOffsResponse;
import com.factset.sdk.FactSetGlobalPrices.models.SplitsResponseCalendar;
import com.factset.sdk.FactSetGlobalPrices.models.StockDistributionsResponseCalendar;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class CorporateActionsForCalendarApi {
  private ApiClient apiClient;

  public CorporateActionsForCalendarApi() {
    this(Configuration.getDefaultApiClient());
  }

  public CorporateActionsForCalendarApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> getCorporateActionsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getCorporateActionsResponseTypeMap.put(200, new GenericType<CorporateActionsResponseCalendar>(){});
    getCorporateActionsResponseTypeMap.put(400, new GenericType<ErrorResponseCalendar>(){});
    getCorporateActionsResponseTypeMap.put(401, new GenericType<ErrorResponseCalendar>(){});
    getCorporateActionsResponseTypeMap.put(403, new GenericType<ErrorResponseCalendar>(){});
    getCorporateActionsResponseTypeMap.put(404, new GenericType<ErrorResponseCalendar>(){});
    getCorporateActionsResponseTypeMap.put(415, new GenericType<ErrorResponseCalendar>(){});
    getCorporateActionsResponseTypeMap.put(500, new GenericType<ErrorResponseCalendar>(){});
  }

  private static final Map<Integer, GenericType> getDividendsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getDividendsResponseTypeMap.put(200, new GenericType<DividendsResponse>(){});
    getDividendsResponseTypeMap.put(400, new GenericType<ErrorResponseCalendar>(){});
    getDividendsResponseTypeMap.put(401, new GenericType<ErrorResponseCalendar>(){});
    getDividendsResponseTypeMap.put(403, new GenericType<ErrorResponseCalendar>(){});
    getDividendsResponseTypeMap.put(404, new GenericType<ErrorResponseCalendar>(){});
    getDividendsResponseTypeMap.put(415, new GenericType<ErrorResponseCalendar>(){});
    getDividendsResponseTypeMap.put(500, new GenericType<ErrorResponseCalendar>(){});
  }

  private static final Map<Integer, GenericType> getEventCountResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getEventCountResponseTypeMap.put(200, new GenericType<EventCountResponse>(){});
    getEventCountResponseTypeMap.put(400, new GenericType<ErrorResponseCalendar>(){});
    getEventCountResponseTypeMap.put(401, new GenericType<ErrorResponseCalendar>(){});
    getEventCountResponseTypeMap.put(403, new GenericType<ErrorResponseCalendar>(){});
    getEventCountResponseTypeMap.put(404, new GenericType<ErrorResponseCalendar>(){});
    getEventCountResponseTypeMap.put(415, new GenericType<ErrorResponseCalendar>(){});
    getEventCountResponseTypeMap.put(500, new GenericType<ErrorResponseCalendar>(){});
  }

  private static final Map<Integer, GenericType> getExchangesResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getExchangesResponseTypeMap.put(200, new GenericType<ExchangesResponse>(){});
    getExchangesResponseTypeMap.put(401, new GenericType<ErrorResponseCalendar>(){});
    getExchangesResponseTypeMap.put(403, new GenericType<ErrorResponseCalendar>(){});
    getExchangesResponseTypeMap.put(404, new GenericType<ErrorResponseCalendar>(){});
    getExchangesResponseTypeMap.put(415, new GenericType<ErrorResponseCalendar>(){});
    getExchangesResponseTypeMap.put(500, new GenericType<ErrorResponseCalendar>(){});
  }

  private static final Map<Integer, GenericType> getRightsIssuesResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getRightsIssuesResponseTypeMap.put(200, new GenericType<RightsIssuesResponse>(){});
    getRightsIssuesResponseTypeMap.put(400, new GenericType<ErrorResponseCalendar>(){});
    getRightsIssuesResponseTypeMap.put(401, new GenericType<ErrorResponseCalendar>(){});
    getRightsIssuesResponseTypeMap.put(403, new GenericType<ErrorResponseCalendar>(){});
    getRightsIssuesResponseTypeMap.put(404, new GenericType<ErrorResponseCalendar>(){});
    getRightsIssuesResponseTypeMap.put(415, new GenericType<ErrorResponseCalendar>(){});
    getRightsIssuesResponseTypeMap.put(500, new GenericType<ErrorResponseCalendar>(){});
  }

  private static final Map<Integer, GenericType> getSpinOffsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getSpinOffsResponseTypeMap.put(200, new GenericType<SpinOffsResponse>(){});
    getSpinOffsResponseTypeMap.put(400, new GenericType<ErrorResponseCalendar>(){});
    getSpinOffsResponseTypeMap.put(401, new GenericType<ErrorResponseCalendar>(){});
    getSpinOffsResponseTypeMap.put(403, new GenericType<ErrorResponseCalendar>(){});
    getSpinOffsResponseTypeMap.put(404, new GenericType<ErrorResponseCalendar>(){});
    getSpinOffsResponseTypeMap.put(415, new GenericType<ErrorResponseCalendar>(){});
    getSpinOffsResponseTypeMap.put(500, new GenericType<ErrorResponseCalendar>(){});
  }

  private static final Map<Integer, GenericType> getSplitsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getSplitsResponseTypeMap.put(200, new GenericType<SplitsResponseCalendar>(){});
    getSplitsResponseTypeMap.put(400, new GenericType<ErrorResponseCalendar>(){});
    getSplitsResponseTypeMap.put(401, new GenericType<ErrorResponseCalendar>(){});
    getSplitsResponseTypeMap.put(403, new GenericType<ErrorResponseCalendar>(){});
    getSplitsResponseTypeMap.put(404, new GenericType<ErrorResponseCalendar>(){});
    getSplitsResponseTypeMap.put(415, new GenericType<ErrorResponseCalendar>(){});
    getSplitsResponseTypeMap.put(500, new GenericType<ErrorResponseCalendar>(){});
  }

  private static final Map<Integer, GenericType> getStockDistributionsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getStockDistributionsResponseTypeMap.put(200, new GenericType<StockDistributionsResponseCalendar>(){});
    getStockDistributionsResponseTypeMap.put(400, new GenericType<ErrorResponseCalendar>(){});
    getStockDistributionsResponseTypeMap.put(401, new GenericType<ErrorResponseCalendar>(){});
    getStockDistributionsResponseTypeMap.put(403, new GenericType<ErrorResponseCalendar>(){});
    getStockDistributionsResponseTypeMap.put(404, new GenericType<ErrorResponseCalendar>(){});
    getStockDistributionsResponseTypeMap.put(415, new GenericType<ErrorResponseCalendar>(){});
    getStockDistributionsResponseTypeMap.put(500, new GenericType<ErrorResponseCalendar>(){});
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
   * Retrieve Event Calendar information for Corporate Actions
   * Gives an overview of all available Corporate Actions over a specified date range. 
   * @param ids The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent IDs. If not specified, the data related to all the IDs is returned. (optional)
   * @param startDate The start date requested for a given date range in **YYYY-MM-DD** format. If both start and end dates are omitted, the API will return data for the current week starting from Monday. (optional)
   * @param endDate The end date requested for a given date range in **YYYY-MM-DD** format. The max date range is 1 year for up to 100 identifiers. If IDs are more than 100 or omitted, the max range is restricted to 90 days. (optional)
   * @param eventCategories Select one or more Event Categories from the dropdown:   - **CASH_DIVS:** Includes Dividends(DVC), Dividend with DRP Option(DVCD), Dividend Reinvestment(DRP)   - **STOCK_DIST:** Includes Stock Dividend(DVS), Stock Dividend - Special(DVSS), Bonus(BNS), Bonus - Special(BNSS)   - **SPINOFFS:** Includes Spin Off(SPO)   - **RIGHTS:** Includes Rights Issue(DSR)   - **SPLITS:** Includes Forward Split(FSP), Reverse Split(RSP), Split(SPL), Exchange Of Securities(EXOS)  If omitted, the data is returned for all the available eventCategories.  (optional)
   * @param exchanges One or more exchange codes for which data is to be requested. When omitted, the data from all the supported exchanges is returned. See &#x60;/meta/exchanges&#x60; for available values. (optional)
   * @param sort Sorts the field in ascending or descending order of &#x60;eventDate&#x60;. (optional, default to [\&quot;-eventDate\&quot;])
   * @param paginationLimit Specifies the number of results to return per page. The maximum limit is 500. (optional, default to 50)
   * @param paginationOffset Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. (optional, default to 0)
   * @return CorporateActionsResponseCalendar
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Corporate Actions data items </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The requested endpoint could not be found. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public CorporateActionsResponseCalendar getCorporateActions(java.util.List<String> ids, LocalDate startDate, LocalDate endDate, java.util.List<String> eventCategories, java.util.List<String> exchanges, java.util.List<String> sort, Integer paginationLimit, Integer paginationOffset) throws ApiException {
    return getCorporateActionsWithHttpInfo(ids, startDate, endDate, eventCategories, exchanges, sort, paginationLimit, paginationOffset).getData();
  }

  /**
   * Retrieve Event Calendar information for Corporate Actions
   * Gives an overview of all available Corporate Actions over a specified date range. 
   * @param ids The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent IDs. If not specified, the data related to all the IDs is returned. (optional)
   * @param startDate The start date requested for a given date range in **YYYY-MM-DD** format. If both start and end dates are omitted, the API will return data for the current week starting from Monday. (optional)
   * @param endDate The end date requested for a given date range in **YYYY-MM-DD** format. The max date range is 1 year for up to 100 identifiers. If IDs are more than 100 or omitted, the max range is restricted to 90 days. (optional)
   * @param eventCategories Select one or more Event Categories from the dropdown:   - **CASH_DIVS:** Includes Dividends(DVC), Dividend with DRP Option(DVCD), Dividend Reinvestment(DRP)   - **STOCK_DIST:** Includes Stock Dividend(DVS), Stock Dividend - Special(DVSS), Bonus(BNS), Bonus - Special(BNSS)   - **SPINOFFS:** Includes Spin Off(SPO)   - **RIGHTS:** Includes Rights Issue(DSR)   - **SPLITS:** Includes Forward Split(FSP), Reverse Split(RSP), Split(SPL), Exchange Of Securities(EXOS)  If omitted, the data is returned for all the available eventCategories.  (optional)
   * @param exchanges One or more exchange codes for which data is to be requested. When omitted, the data from all the supported exchanges is returned. See &#x60;/meta/exchanges&#x60; for available values. (optional)
   * @param sort Sorts the field in ascending or descending order of &#x60;eventDate&#x60;. (optional, default to [\&quot;-eventDate\&quot;])
   * @param paginationLimit Specifies the number of results to return per page. The maximum limit is 500. (optional, default to 50)
   * @param paginationOffset Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. (optional, default to 0)
   * @return ApiResponse&lt;CorporateActionsResponseCalendar&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Corporate Actions data items </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The requested endpoint could not be found. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CorporateActionsResponseCalendar> getCorporateActionsWithHttpInfo(java.util.List<String> ids, LocalDate startDate, LocalDate endDate, java.util.List<String> eventCategories, java.util.List<String> exchanges, java.util.List<String> sort, Integer paginationLimit, Integer paginationOffset) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/factset-global-prices/v1/calendar/corporate-actions";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "ids", ids));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startDate", startDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "endDate", endDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "eventCategories", eventCategories));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "exchanges", exchanges));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "_sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_paginationLimit", paginationLimit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_paginationOffset", paginationOffset));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        CorporateActionsResponseCalendar
      
    > apiResponse = apiClient.invokeAPI("CorporateActionsForCalendarApi.getCorporateActions", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getCorporateActionsResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Retrieve Dividend information
   * Retrieves detailed dividend information including amounts, relevant dates, and other specifics for Dividends, Dividends with DRP Option, and Dividend Reinvestment events within the specified date range.   To retrieve details of a given event for a company on a specific exchange, please pass both the eventId and the company identifier.  Note that passing eventId or (&#x60;eventId&#x60; + &#x60;ids&#x60;) will cause the end point to ignore the other parameters.  Passing values for any other combination of the parameters (&#x60;ids&#x60;, &#x60;startDate&#x60;, &#x60;endDate&#x60; and &#x60;exchanges&#x60;) will lead to an AND operation for all the parameters passed. 
   * @param eventIds FactSet Event Identifier - a unique identifier for an event across multiple exchanges. If provided, the API will return data for the specified event. (optional)
   * @param ids The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent IDs. If not specified, the data related to all the IDs is returned. (optional)
   * @param startDate The start date requested for a given date range in **YYYY-MM-DD** format. If both start and end dates are omitted, the API will return data for the current week starting from Monday. (optional)
   * @param endDate The end date requested for a given date range in **YYYY-MM-DD** format. The max date range is 1 year for up to 100 identifiers. If IDs are more than 100 or omitted, the max range is restricted to 90 days. (optional)
   * @param exchanges One or more exchange codes for which data is to be requested. When omitted, the data from all the supported exchanges is returned. See &#x60;/meta/exchanges&#x60; for available values. (optional)
   * @param sort Sorts the field in ascending or descending order of &#x60;effectiveDate&#x60;. (optional, default to [\&quot;-effectiveDate\&quot;])
   * @param paginationLimit Specifies the number of results to return per page. The maximum limit is 500. (optional, default to 50)
   * @param paginationOffset Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. (optional, default to 0)
   * @return DividendsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Dividend data items </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The requested endpoint could not be found. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public DividendsResponse getDividends(java.util.List<String> eventIds, java.util.List<String> ids, LocalDate startDate, LocalDate endDate, java.util.List<String> exchanges, java.util.List<String> sort, Integer paginationLimit, Integer paginationOffset) throws ApiException {
    return getDividendsWithHttpInfo(eventIds, ids, startDate, endDate, exchanges, sort, paginationLimit, paginationOffset).getData();
  }

  /**
   * Retrieve Dividend information
   * Retrieves detailed dividend information including amounts, relevant dates, and other specifics for Dividends, Dividends with DRP Option, and Dividend Reinvestment events within the specified date range.   To retrieve details of a given event for a company on a specific exchange, please pass both the eventId and the company identifier.  Note that passing eventId or (&#x60;eventId&#x60; + &#x60;ids&#x60;) will cause the end point to ignore the other parameters.  Passing values for any other combination of the parameters (&#x60;ids&#x60;, &#x60;startDate&#x60;, &#x60;endDate&#x60; and &#x60;exchanges&#x60;) will lead to an AND operation for all the parameters passed. 
   * @param eventIds FactSet Event Identifier - a unique identifier for an event across multiple exchanges. If provided, the API will return data for the specified event. (optional)
   * @param ids The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent IDs. If not specified, the data related to all the IDs is returned. (optional)
   * @param startDate The start date requested for a given date range in **YYYY-MM-DD** format. If both start and end dates are omitted, the API will return data for the current week starting from Monday. (optional)
   * @param endDate The end date requested for a given date range in **YYYY-MM-DD** format. The max date range is 1 year for up to 100 identifiers. If IDs are more than 100 or omitted, the max range is restricted to 90 days. (optional)
   * @param exchanges One or more exchange codes for which data is to be requested. When omitted, the data from all the supported exchanges is returned. See &#x60;/meta/exchanges&#x60; for available values. (optional)
   * @param sort Sorts the field in ascending or descending order of &#x60;effectiveDate&#x60;. (optional, default to [\&quot;-effectiveDate\&quot;])
   * @param paginationLimit Specifies the number of results to return per page. The maximum limit is 500. (optional, default to 50)
   * @param paginationOffset Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. (optional, default to 0)
   * @return ApiResponse&lt;DividendsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Dividend data items </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The requested endpoint could not be found. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<DividendsResponse> getDividendsWithHttpInfo(java.util.List<String> eventIds, java.util.List<String> ids, LocalDate startDate, LocalDate endDate, java.util.List<String> exchanges, java.util.List<String> sort, Integer paginationLimit, Integer paginationOffset) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/factset-global-prices/v1/calendar/dividends";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "eventIds", eventIds));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "ids", ids));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startDate", startDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "endDate", endDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "exchanges", exchanges));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "_sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_paginationLimit", paginationLimit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_paginationOffset", paginationOffset));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        DividendsResponse
      
    > apiResponse = apiClient.invokeAPI("CorporateActionsForCalendarApi.getDividends", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getDividendsResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Retrieve daily event count for a given date range
   * Returns the overall count of various events for each day within the specified date range. 
   * @param ids The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent IDs. If not specified, the data related to all the IDs is returned. (optional)
   * @param startDate The start date requested for a given date range in **YYYY-MM-DD** format. If both start and end dates are omitted, the API will return data for the current week starting from Monday. (optional)
   * @param endDate The end date requested for a given date range in **YYYY-MM-DD** format. The max date range is 1 year for up to 100 identifiers. If IDs are more than 100 or omitted, the max range is restricted to 90 days. (optional)
   * @param exchanges One or more exchange codes for which data is to be requested. When omitted, the data from all the supported exchanges is returned. See &#x60;/meta/exchanges&#x60; for available values. (optional)
   * @param sort Sorts the field in ascending or descending order of &#x60;eventDate&#x60;. (optional, default to [\&quot;-eventDate\&quot;])
   * @return EventCountResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Event Count data items </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The requested endpoint could not be found. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public EventCountResponse getEventCount(java.util.List<String> ids, LocalDate startDate, LocalDate endDate, java.util.List<String> exchanges, java.util.List<String> sort) throws ApiException {
    return getEventCountWithHttpInfo(ids, startDate, endDate, exchanges, sort).getData();
  }

  /**
   * Retrieve daily event count for a given date range
   * Returns the overall count of various events for each day within the specified date range. 
   * @param ids The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent IDs. If not specified, the data related to all the IDs is returned. (optional)
   * @param startDate The start date requested for a given date range in **YYYY-MM-DD** format. If both start and end dates are omitted, the API will return data for the current week starting from Monday. (optional)
   * @param endDate The end date requested for a given date range in **YYYY-MM-DD** format. The max date range is 1 year for up to 100 identifiers. If IDs are more than 100 or omitted, the max range is restricted to 90 days. (optional)
   * @param exchanges One or more exchange codes for which data is to be requested. When omitted, the data from all the supported exchanges is returned. See &#x60;/meta/exchanges&#x60; for available values. (optional)
   * @param sort Sorts the field in ascending or descending order of &#x60;eventDate&#x60;. (optional, default to [\&quot;-eventDate\&quot;])
   * @return ApiResponse&lt;EventCountResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Event Count data items </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The requested endpoint could not be found. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<EventCountResponse> getEventCountWithHttpInfo(java.util.List<String> ids, LocalDate startDate, LocalDate endDate, java.util.List<String> exchanges, java.util.List<String> sort) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/factset-global-prices/v1/calendar/event-count";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "ids", ids));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startDate", startDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "endDate", endDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "exchanges", exchanges));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "_sort", sort));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        EventCountResponse
      
    > apiResponse = apiClient.invokeAPI("CorporateActionsForCalendarApi.getEventCount", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getEventCountResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Returns a list of exchanges for which event/action data is available.
   * Returns a list of available values for the exchanges parameter. 
   * @return ExchangesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Exchange details </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The requested endpoint could not be found. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ExchangesResponse getExchanges() throws ApiException {
    return getExchangesWithHttpInfo().getData();
  }

  /**
   * Returns a list of exchanges for which event/action data is available.
   * Returns a list of available values for the exchanges parameter. 
   * @return ApiResponse&lt;ExchangesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Exchange details </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The requested endpoint could not be found. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ExchangesResponse> getExchangesWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/factset-global-prices/v1/calendar/meta/exchanges";

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
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        ExchangesResponse
      
    > apiResponse = apiClient.invokeAPI("CorporateActionsForCalendarApi.getExchanges", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getExchangesResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Retrieve Rights Issue information
   * Retrieves the prices, relevant dates, and other specifics over a specified date range for Rights Issue events.  To retrieve details of a given event for a company on a specific exchange, please pass both the eventId and the company identifier.  Note that passing eventId or (&#x60;eventId&#x60; + &#x60;ids&#x60;) will cause the end point to ignore the other parameters.  Passing values for any other combination of the parameters (&#x60;ids&#x60;, &#x60;startDate&#x60;, &#x60;endDate&#x60; and &#x60;exchanges&#x60;) will lead to an AND operation for all the parameters passed. 
   * @param eventIds FactSet Event Identifier - a unique identifier for an event across multiple exchanges. If provided, the API will return data for the specified event. (optional)
   * @param ids The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent IDs. If not specified, the data related to all the IDs is returned. (optional)
   * @param startDate The start date requested for a given date range in **YYYY-MM-DD** format. If both start and end dates are omitted, the API will return data for the current week starting from Monday. (optional)
   * @param endDate The end date requested for a given date range in **YYYY-MM-DD** format. The max date range is 1 year for up to 100 identifiers. If IDs are more than 100 or omitted, the max range is restricted to 90 days. (optional)
   * @param exchanges One or more exchange codes for which data is to be requested. When omitted, the data from all the supported exchanges is returned. See &#x60;/meta/exchanges&#x60; for available values. (optional)
   * @param sort Sorts the field in ascending or descending order of &#x60;effectiveDate&#x60;. (optional, default to [\&quot;-effectiveDate\&quot;])
   * @param paginationLimit Specifies the number of results to return per page. The maximum limit is 500. (optional, default to 50)
   * @param paginationOffset Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. (optional, default to 0)
   * @return RightsIssuesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Rights Issue data items </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The requested endpoint could not be found. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public RightsIssuesResponse getRightsIssues(java.util.List<String> eventIds, java.util.List<String> ids, LocalDate startDate, LocalDate endDate, java.util.List<String> exchanges, java.util.List<String> sort, Integer paginationLimit, Integer paginationOffset) throws ApiException {
    return getRightsIssuesWithHttpInfo(eventIds, ids, startDate, endDate, exchanges, sort, paginationLimit, paginationOffset).getData();
  }

  /**
   * Retrieve Rights Issue information
   * Retrieves the prices, relevant dates, and other specifics over a specified date range for Rights Issue events.  To retrieve details of a given event for a company on a specific exchange, please pass both the eventId and the company identifier.  Note that passing eventId or (&#x60;eventId&#x60; + &#x60;ids&#x60;) will cause the end point to ignore the other parameters.  Passing values for any other combination of the parameters (&#x60;ids&#x60;, &#x60;startDate&#x60;, &#x60;endDate&#x60; and &#x60;exchanges&#x60;) will lead to an AND operation for all the parameters passed. 
   * @param eventIds FactSet Event Identifier - a unique identifier for an event across multiple exchanges. If provided, the API will return data for the specified event. (optional)
   * @param ids The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent IDs. If not specified, the data related to all the IDs is returned. (optional)
   * @param startDate The start date requested for a given date range in **YYYY-MM-DD** format. If both start and end dates are omitted, the API will return data for the current week starting from Monday. (optional)
   * @param endDate The end date requested for a given date range in **YYYY-MM-DD** format. The max date range is 1 year for up to 100 identifiers. If IDs are more than 100 or omitted, the max range is restricted to 90 days. (optional)
   * @param exchanges One or more exchange codes for which data is to be requested. When omitted, the data from all the supported exchanges is returned. See &#x60;/meta/exchanges&#x60; for available values. (optional)
   * @param sort Sorts the field in ascending or descending order of &#x60;effectiveDate&#x60;. (optional, default to [\&quot;-effectiveDate\&quot;])
   * @param paginationLimit Specifies the number of results to return per page. The maximum limit is 500. (optional, default to 50)
   * @param paginationOffset Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. (optional, default to 0)
   * @return ApiResponse&lt;RightsIssuesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Rights Issue data items </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The requested endpoint could not be found. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<RightsIssuesResponse> getRightsIssuesWithHttpInfo(java.util.List<String> eventIds, java.util.List<String> ids, LocalDate startDate, LocalDate endDate, java.util.List<String> exchanges, java.util.List<String> sort, Integer paginationLimit, Integer paginationOffset) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/factset-global-prices/v1/calendar/rights-issues";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "eventIds", eventIds));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "ids", ids));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startDate", startDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "endDate", endDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "exchanges", exchanges));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "_sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_paginationLimit", paginationLimit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_paginationOffset", paginationOffset));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        RightsIssuesResponse
      
    > apiResponse = apiClient.invokeAPI("CorporateActionsForCalendarApi.getRightsIssues", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getRightsIssuesResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Retrieve Spin Off information
   * Retrieves the price adjustment factors, dates, and other specifics over a specified date range for Spin Off events.  To retrieve details of a given event for a company on a specific exchange, please pass both the eventId and the company identifier.  Note that passing eventId or (&#x60;eventId&#x60; + &#x60;ids&#x60;) will cause the end point to ignore the other parameters.  Passing values for any other combination of the parameters (&#x60;ids&#x60;, &#x60;startDate&#x60;, &#x60;endDate&#x60; and &#x60;exchanges&#x60;) will lead to an AND operation for all the parameters passed. 
   * @param eventIds FactSet Event Identifier - a unique identifier for an event across multiple exchanges. If provided, the API will return data for the specified event. (optional)
   * @param ids The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent IDs. If not specified, the data related to all the IDs is returned. (optional)
   * @param startDate The start date requested for a given date range in **YYYY-MM-DD** format. If both start and end dates are omitted, the API will return data for the current week starting from Monday. (optional)
   * @param endDate The end date requested for a given date range in **YYYY-MM-DD** format. The max date range is 1 year for up to 100 identifiers. If IDs are more than 100 or omitted, the max range is restricted to 90 days. (optional)
   * @param exchanges One or more exchange codes for which data is to be requested. When omitted, the data from all the supported exchanges is returned. See &#x60;/meta/exchanges&#x60; for available values. (optional)
   * @param sort Sorts the field in ascending or descending order of &#x60;effectiveDate&#x60;. (optional, default to [\&quot;-effectiveDate\&quot;])
   * @param paginationLimit Specifies the number of results to return per page. The maximum limit is 500. (optional, default to 50)
   * @param paginationOffset Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. (optional, default to 0)
   * @return SpinOffsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Spin Off data items </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The requested endpoint could not be found. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public SpinOffsResponse getSpinOffs(java.util.List<String> eventIds, java.util.List<String> ids, LocalDate startDate, LocalDate endDate, java.util.List<String> exchanges, java.util.List<String> sort, Integer paginationLimit, Integer paginationOffset) throws ApiException {
    return getSpinOffsWithHttpInfo(eventIds, ids, startDate, endDate, exchanges, sort, paginationLimit, paginationOffset).getData();
  }

  /**
   * Retrieve Spin Off information
   * Retrieves the price adjustment factors, dates, and other specifics over a specified date range for Spin Off events.  To retrieve details of a given event for a company on a specific exchange, please pass both the eventId and the company identifier.  Note that passing eventId or (&#x60;eventId&#x60; + &#x60;ids&#x60;) will cause the end point to ignore the other parameters.  Passing values for any other combination of the parameters (&#x60;ids&#x60;, &#x60;startDate&#x60;, &#x60;endDate&#x60; and &#x60;exchanges&#x60;) will lead to an AND operation for all the parameters passed. 
   * @param eventIds FactSet Event Identifier - a unique identifier for an event across multiple exchanges. If provided, the API will return data for the specified event. (optional)
   * @param ids The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent IDs. If not specified, the data related to all the IDs is returned. (optional)
   * @param startDate The start date requested for a given date range in **YYYY-MM-DD** format. If both start and end dates are omitted, the API will return data for the current week starting from Monday. (optional)
   * @param endDate The end date requested for a given date range in **YYYY-MM-DD** format. The max date range is 1 year for up to 100 identifiers. If IDs are more than 100 or omitted, the max range is restricted to 90 days. (optional)
   * @param exchanges One or more exchange codes for which data is to be requested. When omitted, the data from all the supported exchanges is returned. See &#x60;/meta/exchanges&#x60; for available values. (optional)
   * @param sort Sorts the field in ascending or descending order of &#x60;effectiveDate&#x60;. (optional, default to [\&quot;-effectiveDate\&quot;])
   * @param paginationLimit Specifies the number of results to return per page. The maximum limit is 500. (optional, default to 50)
   * @param paginationOffset Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. (optional, default to 0)
   * @return ApiResponse&lt;SpinOffsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Spin Off data items </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The requested endpoint could not be found. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SpinOffsResponse> getSpinOffsWithHttpInfo(java.util.List<String> eventIds, java.util.List<String> ids, LocalDate startDate, LocalDate endDate, java.util.List<String> exchanges, java.util.List<String> sort, Integer paginationLimit, Integer paginationOffset) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/factset-global-prices/v1/calendar/spin-offs";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "eventIds", eventIds));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "ids", ids));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startDate", startDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "endDate", endDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "exchanges", exchanges));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "_sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_paginationLimit", paginationLimit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_paginationOffset", paginationOffset));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        SpinOffsResponse
      
    > apiResponse = apiClient.invokeAPI("CorporateActionsForCalendarApi.getSpinOffs", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getSpinOffsResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Retrieve Split information
   * Retrieves the split factors, dates, and other specifics over a specified date range for Forward Split,  Reverse Split, Split and Exchange of Securities event types.  To retrieve details of a given event for a company on a specific exchange, please pass both the eventId and the company identifier.  Note that passing eventId or (&#x60;eventId&#x60; + &#x60;ids&#x60;) will cause the end point to ignore the other parameters.  Passing values for any other combination of the parameters (&#x60;ids&#x60;, &#x60;startDate&#x60;, &#x60;endDate&#x60; and &#x60;exchanges&#x60;) will lead to an AND operation for all the parameters passed. 
   * @param eventIds FactSet Event Identifier - a unique identifier for an event across multiple exchanges. If provided, the API will return data for the specified event. (optional)
   * @param ids The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent IDs. If not specified, the data related to all the IDs is returned. (optional)
   * @param startDate The start date requested for a given date range in **YYYY-MM-DD** format. If both start and end dates are omitted, the API will return data for the current week starting from Monday. (optional)
   * @param endDate The end date requested for a given date range in **YYYY-MM-DD** format. The max date range is 1 year for up to 100 identifiers. If IDs are more than 100 or omitted, the max range is restricted to 90 days. (optional)
   * @param exchanges One or more exchange codes for which data is to be requested. When omitted, the data from all the supported exchanges is returned. See &#x60;/meta/exchanges&#x60; for available values. (optional)
   * @param sort Sorts the field in ascending or descending order of &#x60;effectiveDate&#x60;. (optional, default to [\&quot;-effectiveDate\&quot;])
   * @param paginationLimit Specifies the number of results to return per page. The maximum limit is 500. (optional, default to 50)
   * @param paginationOffset Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. (optional, default to 0)
   * @return SplitsResponseCalendar
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Split data items </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The requested endpoint could not be found. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public SplitsResponseCalendar getSplits(java.util.List<String> eventIds, java.util.List<String> ids, LocalDate startDate, LocalDate endDate, java.util.List<String> exchanges, java.util.List<String> sort, Integer paginationLimit, Integer paginationOffset) throws ApiException {
    return getSplitsWithHttpInfo(eventIds, ids, startDate, endDate, exchanges, sort, paginationLimit, paginationOffset).getData();
  }

  /**
   * Retrieve Split information
   * Retrieves the split factors, dates, and other specifics over a specified date range for Forward Split,  Reverse Split, Split and Exchange of Securities event types.  To retrieve details of a given event for a company on a specific exchange, please pass both the eventId and the company identifier.  Note that passing eventId or (&#x60;eventId&#x60; + &#x60;ids&#x60;) will cause the end point to ignore the other parameters.  Passing values for any other combination of the parameters (&#x60;ids&#x60;, &#x60;startDate&#x60;, &#x60;endDate&#x60; and &#x60;exchanges&#x60;) will lead to an AND operation for all the parameters passed. 
   * @param eventIds FactSet Event Identifier - a unique identifier for an event across multiple exchanges. If provided, the API will return data for the specified event. (optional)
   * @param ids The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent IDs. If not specified, the data related to all the IDs is returned. (optional)
   * @param startDate The start date requested for a given date range in **YYYY-MM-DD** format. If both start and end dates are omitted, the API will return data for the current week starting from Monday. (optional)
   * @param endDate The end date requested for a given date range in **YYYY-MM-DD** format. The max date range is 1 year for up to 100 identifiers. If IDs are more than 100 or omitted, the max range is restricted to 90 days. (optional)
   * @param exchanges One or more exchange codes for which data is to be requested. When omitted, the data from all the supported exchanges is returned. See &#x60;/meta/exchanges&#x60; for available values. (optional)
   * @param sort Sorts the field in ascending or descending order of &#x60;effectiveDate&#x60;. (optional, default to [\&quot;-effectiveDate\&quot;])
   * @param paginationLimit Specifies the number of results to return per page. The maximum limit is 500. (optional, default to 50)
   * @param paginationOffset Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. (optional, default to 0)
   * @return ApiResponse&lt;SplitsResponseCalendar&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Split data items </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The requested endpoint could not be found. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SplitsResponseCalendar> getSplitsWithHttpInfo(java.util.List<String> eventIds, java.util.List<String> ids, LocalDate startDate, LocalDate endDate, java.util.List<String> exchanges, java.util.List<String> sort, Integer paginationLimit, Integer paginationOffset) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/factset-global-prices/v1/calendar/splits";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "eventIds", eventIds));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "ids", ids));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startDate", startDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "endDate", endDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "exchanges", exchanges));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "_sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_paginationLimit", paginationLimit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_paginationOffset", paginationOffset));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        SplitsResponseCalendar
      
    > apiResponse = apiClient.invokeAPI("CorporateActionsForCalendarApi.getSplits", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getSplitsResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Retrieve Stock Distribution information
   * Retrieves detailed stock distribution information including price adjustment factors, relevant dates, and other  specifics for Stock Dividends, Stock Dividends(Special), Bonus Issues, and Bonus Issues(Special) events within  the specified date range.  To retrieve details of a given event for a company on a specific exchange, please pass both the eventId and the company identifier.  Note that passing eventId or (&#x60;eventId&#x60; + &#x60;ids&#x60;) will cause the end point to ignore the other parameters.  Passing values for any other combination of the parameters (&#x60;ids&#x60;, &#x60;startDate&#x60;, &#x60;endDate&#x60; and &#x60;exchanges&#x60;) will lead to an AND operation for all the parameters passed. 
   * @param eventIds FactSet Event Identifier - a unique identifier for an event across multiple exchanges. If provided, the API will return data for the specified event. (optional)
   * @param ids The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent IDs. If not specified, the data related to all the IDs is returned. (optional)
   * @param startDate The start date requested for a given date range in **YYYY-MM-DD** format. If both start and end dates are omitted, the API will return data for the current week starting from Monday. (optional)
   * @param endDate The end date requested for a given date range in **YYYY-MM-DD** format. The max date range is 1 year for up to 100 identifiers. If IDs are more than 100 or omitted, the max range is restricted to 90 days. (optional)
   * @param exchanges One or more exchange codes for which data is to be requested. When omitted, the data from all the supported exchanges is returned. See &#x60;/meta/exchanges&#x60; for available values. (optional)
   * @param sort Sorts the field in ascending or descending order of &#x60;effectiveDate&#x60;. (optional, default to [\&quot;-effectiveDate\&quot;])
   * @param paginationLimit Specifies the number of results to return per page. The maximum limit is 500. (optional, default to 50)
   * @param paginationOffset Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. (optional, default to 0)
   * @return StockDistributionsResponseCalendar
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Stock Distribution data items </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The requested endpoint could not be found. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public StockDistributionsResponseCalendar getStockDistributions(java.util.List<String> eventIds, java.util.List<String> ids, LocalDate startDate, LocalDate endDate, java.util.List<String> exchanges, java.util.List<String> sort, Integer paginationLimit, Integer paginationOffset) throws ApiException {
    return getStockDistributionsWithHttpInfo(eventIds, ids, startDate, endDate, exchanges, sort, paginationLimit, paginationOffset).getData();
  }

  /**
   * Retrieve Stock Distribution information
   * Retrieves detailed stock distribution information including price adjustment factors, relevant dates, and other  specifics for Stock Dividends, Stock Dividends(Special), Bonus Issues, and Bonus Issues(Special) events within  the specified date range.  To retrieve details of a given event for a company on a specific exchange, please pass both the eventId and the company identifier.  Note that passing eventId or (&#x60;eventId&#x60; + &#x60;ids&#x60;) will cause the end point to ignore the other parameters.  Passing values for any other combination of the parameters (&#x60;ids&#x60;, &#x60;startDate&#x60;, &#x60;endDate&#x60; and &#x60;exchanges&#x60;) will lead to an AND operation for all the parameters passed. 
   * @param eventIds FactSet Event Identifier - a unique identifier for an event across multiple exchanges. If provided, the API will return data for the specified event. (optional)
   * @param ids The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent IDs. If not specified, the data related to all the IDs is returned. (optional)
   * @param startDate The start date requested for a given date range in **YYYY-MM-DD** format. If both start and end dates are omitted, the API will return data for the current week starting from Monday. (optional)
   * @param endDate The end date requested for a given date range in **YYYY-MM-DD** format. The max date range is 1 year for up to 100 identifiers. If IDs are more than 100 or omitted, the max range is restricted to 90 days. (optional)
   * @param exchanges One or more exchange codes for which data is to be requested. When omitted, the data from all the supported exchanges is returned. See &#x60;/meta/exchanges&#x60; for available values. (optional)
   * @param sort Sorts the field in ascending or descending order of &#x60;effectiveDate&#x60;. (optional, default to [\&quot;-effectiveDate\&quot;])
   * @param paginationLimit Specifies the number of results to return per page. The maximum limit is 500. (optional, default to 50)
   * @param paginationOffset Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. (optional, default to 0)
   * @return ApiResponse&lt;StockDistributionsResponseCalendar&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Stock Distribution data items </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The requested endpoint could not be found. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<StockDistributionsResponseCalendar> getStockDistributionsWithHttpInfo(java.util.List<String> eventIds, java.util.List<String> ids, LocalDate startDate, LocalDate endDate, java.util.List<String> exchanges, java.util.List<String> sort, Integer paginationLimit, Integer paginationOffset) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/factset-global-prices/v1/calendar/stock-distributions";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "eventIds", eventIds));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "ids", ids));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startDate", startDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "endDate", endDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "exchanges", exchanges));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "_sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_paginationLimit", paginationLimit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_paginationOffset", paginationOffset));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        StockDistributionsResponseCalendar
      
    > apiResponse = apiClient.invokeAPI("CorporateActionsForCalendarApi.getStockDistributions", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getStockDistributionsResponseTypeMap, false);

    return apiResponse;

  }
}
