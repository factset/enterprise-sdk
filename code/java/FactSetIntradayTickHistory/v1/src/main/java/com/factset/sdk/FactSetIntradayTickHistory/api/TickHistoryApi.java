package com.factset.sdk.FactSetIntradayTickHistory.api;

import com.factset.sdk.FactSetIntradayTickHistory.ApiException;
import com.factset.sdk.FactSetIntradayTickHistory.ApiClient;
import com.factset.sdk.FactSetIntradayTickHistory.ApiResponse;
import com.factset.sdk.FactSetIntradayTickHistory.Configuration;
import com.factset.sdk.FactSetIntradayTickHistory.Pair;

import javax.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.FactSetIntradayTickHistory.models.TickhistoryResponse;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TickHistoryApi {
  private ApiClient apiClient;

  public TickHistoryApi() {
    this(Configuration.getDefaultApiClient());
  }

  public TickHistoryApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

    private static final Map<Integer, GenericType> getTickHistoryResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getTickHistoryResponseTypeMap.put(200, new GenericType<TickhistoryResponse>(){});
    getTickHistoryResponseTypeMap.put(401, new GenericType<Object>(){});
    getTickHistoryResponseTypeMap.put(403, new GenericType<Object>(){});
    getTickHistoryResponseTypeMap.put(405, new GenericType<Object>(){});
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
   * Tick History service returns trade data and associated quotes for a client specified interval and time period
   * When using an HTTP GET request, the seach criteria is sent via the query string in the URL. Please make sure that all requests contain a date within the past trailing year. Fields are added using ampersands, with enumerations seperated by commas. &lt;p&gt;**Try it Out** - references a sandbox environment to simulate live reponses. Available &#x60;id&#x60; is limited to BABA-USA,WALMEX-MX,7203-TKS,VOD-LON,NPN-JSE,MABAX,NZF,SPY-USA,AGG-USA,GLD-USA,AOR-USA,MNA-USA,UUP-USA,SP50-SPX,ESX-STX,XAO-ASX,WD-MSX,NG00-USA,GC00-USA,CC00-USA,C00-USA,FC00-USA,ER00-USA,EURUSD-FX1,USDMXN-FX1,AUDJPY-FX1,EURCZK-FX1,USDILS-FX1,USDZAR-FX1,US10YY-TU1,FDS#190621C00145000-USA,FDS#190621P00145000-USA. Current day data is not available.&lt;/p&gt;
   * @param id Requested symbol or security. The symbol can be a FactSet exchange symbol, CUSIP, or SEDOL. **NOTE**: Only one identifier can be requested per request.&lt;P&gt;**TRY IT OUT** - Choose One from - BABA-USA,WALMEX-MX,7203-TKS,VOD-LON,NPN-JSE,MABAX,NZF,SPY-USA,AGG-USA,GLD-USA,AOR-USA,MNA-USA,UUP-USA,SP50-SPX,ESX-STX,XAO-ASX,WD-MSX,NG00-USA,GC00-USA,CC00-USA,C00-USA,FC00-USA,ER00-USA,EURUSD-FX1,USDMXN-FX1,AUDJPY-FX1,EURCZK-FX1,USDILS-FX1,USDZAR-FX1,US10YY-TU1,FDS#190621C00145000-USA,FDS#190621P00145000-USA (required)
   * @param reqId Request Identification String. Can be used by the application to keep track of requests.  The id is not used by this service, however, it is included in the XML response. (optional)
   * @param format The format of the output file. **TRY IT OUT** Choose from JSON, CSV, CSV_NO_HEADER (optional, default to XML)
   * @param fields All available fields. This is a comma-seperated list (no spaces). See definitions for details. Default is all fields when left blank. (optional)
   * @param sd This is the start date for the Snapshot History. Requests should be made in the format **YYYYMMDD**. Default is current business day. Field can be sd or date. **TRY IT OUT** Cannot use current day. (optional)
   * @param ed This is the end date for teh Snapshot History. Requests should be made in the format **YYYYMMDD**. If the period requested is larger than Max. Days requested, results will be limited to the Max Days starting at sd/date. Defautl is sd or date. **TRY IT OUT** Cannot use current day. (optional)
   * @param st Requested start time. This is the start time for the snapshot history requested. Requests should be made in a **HHMMSSS** format. Range from 000000 - 235959. **TRY IT OUT** Cannot use current day. (optional, default to 040000)
   * @param et Requested end time. This is the end time for the snapshot history requested. Requests should be made in a **HHMMSSS** format. Range from 000000 - 235959. **TRY IT OUT** Cannot use current day. (optional, default to 200000)
   * @param interval Requested time interval. This is the interval the data is returned from the service. Possible values from 1 Second (1S) to 1 Hour (1H). A maximum of 10 Tick History Requests and a maximum of 100,000 rows of data may be made in any one-minute period. Additional subsctiption is available to access 20 requests/200,000 rows of data per minute. Contact your FactSet team for details. (optional, default to 1M)
   * @param includeRequest Flag to include request id and key in the CSV output. (optional, default to false)
   * @param dataset Decides what type of trades to return, default is all trades and quotes, alternatively charting can be selected which will filter out unofficial trades. (optional)
   * @return TickhistoryResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Access Denied. The user is not authorized to view the data requested. Contact FactSet Consulting Services for assistance. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Invalid HTTP URL. Necessary query parameters are missing in the request. The description field will indicate the exact reason. </td><td>  -  </td></tr>
       <tr><td> 405 </td><td> Invalid HTTP method. Either the method is not GET or exceeds the maximum request lenght (currently set at 5000 bytes. The description field will indicate the exact reason. </td><td>  -  </td></tr>
     </table>
   */
  public TickhistoryResponse getTickHistory(String id, String reqId, String format, String fields, String sd, String ed, String st, String et, String interval, String includeRequest, String dataset) throws ApiException {
    return getTickHistoryWithHttpInfo(id, reqId, format, fields, sd, ed, st, et, interval, includeRequest, dataset).getData();
  }

  /**
   * Tick History service returns trade data and associated quotes for a client specified interval and time period
   * When using an HTTP GET request, the seach criteria is sent via the query string in the URL. Please make sure that all requests contain a date within the past trailing year. Fields are added using ampersands, with enumerations seperated by commas. &lt;p&gt;**Try it Out** - references a sandbox environment to simulate live reponses. Available &#x60;id&#x60; is limited to BABA-USA,WALMEX-MX,7203-TKS,VOD-LON,NPN-JSE,MABAX,NZF,SPY-USA,AGG-USA,GLD-USA,AOR-USA,MNA-USA,UUP-USA,SP50-SPX,ESX-STX,XAO-ASX,WD-MSX,NG00-USA,GC00-USA,CC00-USA,C00-USA,FC00-USA,ER00-USA,EURUSD-FX1,USDMXN-FX1,AUDJPY-FX1,EURCZK-FX1,USDILS-FX1,USDZAR-FX1,US10YY-TU1,FDS#190621C00145000-USA,FDS#190621P00145000-USA. Current day data is not available.&lt;/p&gt;
   * @param id Requested symbol or security. The symbol can be a FactSet exchange symbol, CUSIP, or SEDOL. **NOTE**: Only one identifier can be requested per request.&lt;P&gt;**TRY IT OUT** - Choose One from - BABA-USA,WALMEX-MX,7203-TKS,VOD-LON,NPN-JSE,MABAX,NZF,SPY-USA,AGG-USA,GLD-USA,AOR-USA,MNA-USA,UUP-USA,SP50-SPX,ESX-STX,XAO-ASX,WD-MSX,NG00-USA,GC00-USA,CC00-USA,C00-USA,FC00-USA,ER00-USA,EURUSD-FX1,USDMXN-FX1,AUDJPY-FX1,EURCZK-FX1,USDILS-FX1,USDZAR-FX1,US10YY-TU1,FDS#190621C00145000-USA,FDS#190621P00145000-USA (required)
   * @param reqId Request Identification String. Can be used by the application to keep track of requests.  The id is not used by this service, however, it is included in the XML response. (optional)
   * @param format The format of the output file. **TRY IT OUT** Choose from JSON, CSV, CSV_NO_HEADER (optional, default to XML)
   * @param fields All available fields. This is a comma-seperated list (no spaces). See definitions for details. Default is all fields when left blank. (optional)
   * @param sd This is the start date for the Snapshot History. Requests should be made in the format **YYYYMMDD**. Default is current business day. Field can be sd or date. **TRY IT OUT** Cannot use current day. (optional)
   * @param ed This is the end date for teh Snapshot History. Requests should be made in the format **YYYYMMDD**. If the period requested is larger than Max. Days requested, results will be limited to the Max Days starting at sd/date. Defautl is sd or date. **TRY IT OUT** Cannot use current day. (optional)
   * @param st Requested start time. This is the start time for the snapshot history requested. Requests should be made in a **HHMMSSS** format. Range from 000000 - 235959. **TRY IT OUT** Cannot use current day. (optional, default to 040000)
   * @param et Requested end time. This is the end time for the snapshot history requested. Requests should be made in a **HHMMSSS** format. Range from 000000 - 235959. **TRY IT OUT** Cannot use current day. (optional, default to 200000)
   * @param interval Requested time interval. This is the interval the data is returned from the service. Possible values from 1 Second (1S) to 1 Hour (1H). A maximum of 10 Tick History Requests and a maximum of 100,000 rows of data may be made in any one-minute period. Additional subsctiption is available to access 20 requests/200,000 rows of data per minute. Contact your FactSet team for details. (optional, default to 1M)
   * @param includeRequest Flag to include request id and key in the CSV output. (optional, default to false)
   * @param dataset Decides what type of trades to return, default is all trades and quotes, alternatively charting can be selected which will filter out unofficial trades. (optional)
   * @return ApiResponse&lt;TickhistoryResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Access Denied. The user is not authorized to view the data requested. Contact FactSet Consulting Services for assistance. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Invalid HTTP URL. Necessary query parameters are missing in the request. The description field will indicate the exact reason. </td><td>  -  </td></tr>
       <tr><td> 405 </td><td> Invalid HTTP method. Either the method is not GET or exceeds the maximum request lenght (currently set at 5000 bytes. The description field will indicate the exact reason. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<TickhistoryResponse> getTickHistoryWithHttpInfo(String id, String reqId, String format, String fields, String sd, String ed, String st, String et, String interval, String includeRequest, String dataset) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getTickHistory");
    }
    
    // create path and map variables
    String localVarPath = "/TickHistory/history";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "id", id));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "req_id", reqId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "format", format));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "fields", fields));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sd", sd));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "ed", ed));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "st", st));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "et", et));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "interval", interval));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include_request", includeRequest));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "dataset", dataset));

    
    
    
    final String[] localVarAccepts = {
      "application/json", "application/xml", "text/csv"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        TickhistoryResponse
      
    > apiResponse = apiClient.invokeAPI("TickHistoryApi.getTickHistory", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getTickHistoryResponseTypeMap, false);

    return apiResponse;

  }
}
