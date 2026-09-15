package com.factset.sdk.FactSetIntradayTickHistory.api;

import com.factset.sdk.FactSetIntradayTickHistory.ApiException;
import com.factset.sdk.FactSetIntradayTickHistory.ApiClient;
import com.factset.sdk.FactSetIntradayTickHistory.ApiResponse;
import com.factset.sdk.FactSetIntradayTickHistory.Configuration;
import com.factset.sdk.FactSetIntradayTickHistory.Pair;

import jakarta.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.FactSetIntradayTickHistory.models.ErrorResponse;
import com.factset.sdk.FactSetIntradayTickHistory.models.TickHistoryResponse;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class TradesAtTimeApi {
  private ApiClient apiClient;

  public TradesAtTimeApi() {
    this(Configuration.getDefaultApiClient());
  }

  public TradesAtTimeApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> tradesattimeGetResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    tradesattimeGetResponseTypeMap.put(200, new GenericType<TickHistoryResponse>(){});
    tradesattimeGetResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    tradesattimeGetResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    tradesattimeGetResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    tradesattimeGetResponseTypeMap.put(405, new GenericType<ErrorResponse>(){});
    tradesattimeGetResponseTypeMap.put(408, new GenericType<ErrorResponse>(){});
    tradesattimeGetResponseTypeMap.put(429, new GenericType<ErrorResponse>(){});
    tradesattimeGetResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
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
   * Trades at Time service returns the trade immediately before and after a specified time, along with associated quotes
   * Request returns the before and after trade data along with the associated quotes for the specified time
   * @param id Requested symbol or security. The symbol can be a FactSet ticker-exchange or ticker-region symbol, CUSIP, ISIN or SEDOL.  &lt;p&gt;**Note**: Only one identifier can be requested per API call. &lt;/p&gt; &lt;p&gt;The sandbox environment provides access to the following list of symbols: &lt;/p&gt; &lt;p&gt;BABA-USA,WALMEX-MX,7203-TKS,VOD-LON,NPN-JSE,MABAX,NZF,SPY-USA,AGG-USA,GLD-USA,AOR-USA,MNA-USA,UUP-USA,SP50-SPX,ESX-STX,XAO-ASX,WD-MSX,NG00-USA,GC00-USA,CC00-USA,C00-USA,FC00-USA,ER00-USA,EURUSD-FX1,USDMXN-FX1,AUDJPY-FX1,EURCZK-FX1,USDILS-FX1,USDZAR-FX1,US10YY-TU1&lt;/p&gt; (required)
   * @param reqId Request Identification String. Can be used by the application to keep track of requests.  The id is not used by this service, however, it is included in the response. (optional)
   * @param format The format of the output file.  (optional, default to XML)
   * @param date Request should be made in the format **YYYYMMDD**. The initial release only supports requests from completed trading days (optional)
   * @param time Request should be made in the format **HHMMSS**.HH- Hour, MM- Minutes, SS- Seconds (optional)
   * @return TickHistoryResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 405 </td><td> Method Not Allowed </td><td>  -  </td></tr>
       <tr><td> 408 </td><td> Request Timeout </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public TickHistoryResponse tradesattimeGet(String id, String reqId, String format, String date, String time) throws ApiException {
    return tradesattimeGetWithHttpInfo(id, reqId, format, date, time).getData();
  }

  /**
   * Trades at Time service returns the trade immediately before and after a specified time, along with associated quotes
   * Request returns the before and after trade data along with the associated quotes for the specified time
   * @param id Requested symbol or security. The symbol can be a FactSet ticker-exchange or ticker-region symbol, CUSIP, ISIN or SEDOL.  &lt;p&gt;**Note**: Only one identifier can be requested per API call. &lt;/p&gt; &lt;p&gt;The sandbox environment provides access to the following list of symbols: &lt;/p&gt; &lt;p&gt;BABA-USA,WALMEX-MX,7203-TKS,VOD-LON,NPN-JSE,MABAX,NZF,SPY-USA,AGG-USA,GLD-USA,AOR-USA,MNA-USA,UUP-USA,SP50-SPX,ESX-STX,XAO-ASX,WD-MSX,NG00-USA,GC00-USA,CC00-USA,C00-USA,FC00-USA,ER00-USA,EURUSD-FX1,USDMXN-FX1,AUDJPY-FX1,EURCZK-FX1,USDILS-FX1,USDZAR-FX1,US10YY-TU1&lt;/p&gt; (required)
   * @param reqId Request Identification String. Can be used by the application to keep track of requests.  The id is not used by this service, however, it is included in the response. (optional)
   * @param format The format of the output file.  (optional, default to XML)
   * @param date Request should be made in the format **YYYYMMDD**. The initial release only supports requests from completed trading days (optional)
   * @param time Request should be made in the format **HHMMSS**.HH- Hour, MM- Minutes, SS- Seconds (optional)
   * @return ApiResponse&lt;TickHistoryResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 405 </td><td> Method Not Allowed </td><td>  -  </td></tr>
       <tr><td> 408 </td><td> Request Timeout </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<TickHistoryResponse> tradesattimeGetWithHttpInfo(String id, String reqId, String format, String date, String time) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling tradesattimeGet");
    }
    
    // create path and map variables
    String localVarPath = "/tradesattime";

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


    ApiResponse<
        
        TickHistoryResponse
      
    > apiResponse = apiClient.invokeAPI("TradesAtTimeApi.tradesattimeGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, tradesattimeGetResponseTypeMap, false);

    return apiResponse;

  }
}
