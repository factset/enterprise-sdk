package com.factset.sdk.IntradayTickHistory.api;

import com.factset.sdk.IntradayTickHistory.ApiException;
import com.factset.sdk.IntradayTickHistory.ApiClient;
import com.factset.sdk.IntradayTickHistory.ApiResponse;
import com.factset.sdk.IntradayTickHistory.Configuration;
import com.factset.sdk.IntradayTickHistory.Pair;

import javax.ws.rs.core.GenericType;

import com.factset.sdk.IntradayTickHistory.models.TickhistoryResponse;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TradesAtTimeApi {
  private ApiClient apiClient;

  public TradesAtTimeApi() {
    this(Configuration.getDefaultApiClient());
  }

  public TradesAtTimeApi(ApiClient apiClient) {
    this.apiClient = apiClient;
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
   * Request returns the before and after trade data along with the associated quotes for the specified time
   * 
   * @param id Requested symbol or security. The symbol can be a FactSet exchange symbol, CUSIP, or SEDOL. **NOTE**: Only one identifier can be requested per request.&lt;P&gt;**TRY IT OUT** - Choose One from - BABA-USA,WALMEX-MX,7203-TKS,VOD-LON,NPN-JSE,MABAX,NZF,SPY-USA,AGG-USA,GLD-USA,AOR-USA,MNA-USA,UUP-USA,SP50-SPX,ESX-STX,XAO-ASX,WD-MSX,NG00-USA,GC00-USA,CC00-USA,C00-USA,FC00-USA,ER00-USA,EURUSD-FX1,USDMXN-FX1,AUDJPY-FX1,EURCZK-FX1,USDILS-FX1,USDZAR-FX1,US10YY-TU1,FDS#190621C00145000-USA,FDS#190621P00145000-USA (required)
   * @param reqId Request Identification String. Can be used by the application to keep track of requests. The id is not used by this service, however, it is included in the XML response. (optional)
   * @param format The format of the output file. TRY IT OUT Choose from JSON, CSV, CSV_NO_HEADER (optional, default to XML)
   * @param date Request should be made in the format **YYYYMMDD**. The initial release only supports requests from completed trading days (optional)
   * @param time Request should be made in the format **HHMMSSS**.HH- Hour, MM- Minutes, SS- Seconds (optional)
   * @return TickhistoryResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK  x </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Access Denied. The user is not authorized to view the data requested. Contact FactSet Consulting Services for assistance. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Invalid HTTP URL. Necessary query parameters are missing in the request. The description field will indicate the exact reason. </td><td>  -  </td></tr>
       <tr><td> 405 </td><td> Invalid HTTP method. Either the method is not GET or exceeds the maximum request lenght (currently set at 5000 bytes. The description field will indicate the exact reason. </td><td>  -  </td></tr>
     </table>
   */
  public TickhistoryResponse tickHistoryTradesattimeGet(String id, String reqId, String format, String date, String time) throws ApiException {
    return tickHistoryTradesattimeGetWithHttpInfo(id, reqId, format, date, time).getData();
  }

  /**
   * Request returns the before and after trade data along with the associated quotes for the specified time
   * 
   * @param id Requested symbol or security. The symbol can be a FactSet exchange symbol, CUSIP, or SEDOL. **NOTE**: Only one identifier can be requested per request.&lt;P&gt;**TRY IT OUT** - Choose One from - BABA-USA,WALMEX-MX,7203-TKS,VOD-LON,NPN-JSE,MABAX,NZF,SPY-USA,AGG-USA,GLD-USA,AOR-USA,MNA-USA,UUP-USA,SP50-SPX,ESX-STX,XAO-ASX,WD-MSX,NG00-USA,GC00-USA,CC00-USA,C00-USA,FC00-USA,ER00-USA,EURUSD-FX1,USDMXN-FX1,AUDJPY-FX1,EURCZK-FX1,USDILS-FX1,USDZAR-FX1,US10YY-TU1,FDS#190621C00145000-USA,FDS#190621P00145000-USA (required)
   * @param reqId Request Identification String. Can be used by the application to keep track of requests. The id is not used by this service, however, it is included in the XML response. (optional)
   * @param format The format of the output file. TRY IT OUT Choose from JSON, CSV, CSV_NO_HEADER (optional, default to XML)
   * @param date Request should be made in the format **YYYYMMDD**. The initial release only supports requests from completed trading days (optional)
   * @param time Request should be made in the format **HHMMSSS**.HH- Hour, MM- Minutes, SS- Seconds (optional)
   * @return ApiResponse&lt;TickhistoryResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK  x </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Access Denied. The user is not authorized to view the data requested. Contact FactSet Consulting Services for assistance. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Invalid HTTP URL. Necessary query parameters are missing in the request. The description field will indicate the exact reason. </td><td>  -  </td></tr>
       <tr><td> 405 </td><td> Invalid HTTP method. Either the method is not GET or exceeds the maximum request lenght (currently set at 5000 bytes. The description field will indicate the exact reason. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<TickhistoryResponse> tickHistoryTradesattimeGetWithHttpInfo(String id, String reqId, String format, String date, String time) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling tickHistoryTradesattimeGet");
    }
    
    // create path and map variables
    String localVarPath = "/TickHistory/tradesattime";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "id", id));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "req_id", reqId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "format", format));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "date", date));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "time", time));

    
    
    
    final String[] localVarAccepts = {
      "application/json", "application/xml", "text/csv"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };

    GenericType<TickhistoryResponse> localVarReturnType = new GenericType<TickhistoryResponse>() {};

    return apiClient.invokeAPI("TradesAtTimeApi.tickHistoryTradesattimeGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
