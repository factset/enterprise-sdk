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

public class FirstTradeApi {
  private ApiClient apiClient;

  public FirstTradeApi() {
    this(Configuration.getDefaultApiClient());
  }

  public FirstTradeApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> firsttradeGetResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    firsttradeGetResponseTypeMap.put(200, new GenericType<TickHistoryResponse>(){});
    firsttradeGetResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    firsttradeGetResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    firsttradeGetResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    firsttradeGetResponseTypeMap.put(405, new GenericType<ErrorResponse>(){});
    firsttradeGetResponseTypeMap.put(408, new GenericType<ErrorResponse>(){});
    firsttradeGetResponseTypeMap.put(429, new GenericType<ErrorResponse>(){});
    firsttradeGetResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
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
   * First Trade service returns the first trade (official and unofficial) and associated quotes after a specified time
   * The First Trade service returns data for the first trade (official and unofficial) and associated quotes after the specified time.
   * @param id Requested symbol or security. The symbol can be a FactSet ticker-exchange or ticker-region symbol, CUSIP, ISIN or SEDOL.  &lt;p&gt;**Note**: Only one identifier can be requested per API call. &lt;/p&gt; &lt;p&gt;The sandbox environment provides access to the following list of symbols: &lt;/p&gt; &lt;p&gt;BABA-USA,WALMEX-MX,7203-TKS,VOD-LON,NPN-JSE,MABAX,NZF,SPY-USA,AGG-USA,GLD-USA,AOR-USA,MNA-USA,UUP-USA,SP50-SPX,ESX-STX,XAO-ASX,WD-MSX,NG00-USA,GC00-USA,CC00-USA,C00-USA,FC00-USA,ER00-USA,EURUSD-FX1,USDMXN-FX1,AUDJPY-FX1,EURCZK-FX1,USDILS-FX1,USDZAR-FX1,US10YY-TU1&lt;/p&gt; (required)
   * @param reqId Request Identification String. Can be used by the application to keep track of requests.  The id is not used by this service, however, it is included in the response. (optional)
   * @param startDate This is the start date for the Snapshot History. Requests should be made in the format YYYYMMDD Default is current business day. Field can be sd or date. TRY IT OUT Cannot use current day. (optional)
   * @param startTime This is the start time for the snapshot history requested. Requests should be made in a **HHMMSS** format.Range from 000000 - 235959. **TRY IT OUT** Cannot use current day (optional, default to 040000)
   * @param format The format of the output file.  (optional, default to XML)
   * @param includeRequest Flag to include request id and key in the CSV output. (optional, default to false)
   * @param dataset Decides what type of trades to return, default is all trades and quotes, alternatively charting can be selected which will filter out unofficial trades. (optional)
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
  public TickHistoryResponse firsttradeGet(String id, String reqId, String startDate, String startTime, String format, String includeRequest, String dataset) throws ApiException {
    return firsttradeGetWithHttpInfo(id, reqId, startDate, startTime, format, includeRequest, dataset).getData();
  }

  /**
   * First Trade service returns the first trade (official and unofficial) and associated quotes after a specified time
   * The First Trade service returns data for the first trade (official and unofficial) and associated quotes after the specified time.
   * @param id Requested symbol or security. The symbol can be a FactSet ticker-exchange or ticker-region symbol, CUSIP, ISIN or SEDOL.  &lt;p&gt;**Note**: Only one identifier can be requested per API call. &lt;/p&gt; &lt;p&gt;The sandbox environment provides access to the following list of symbols: &lt;/p&gt; &lt;p&gt;BABA-USA,WALMEX-MX,7203-TKS,VOD-LON,NPN-JSE,MABAX,NZF,SPY-USA,AGG-USA,GLD-USA,AOR-USA,MNA-USA,UUP-USA,SP50-SPX,ESX-STX,XAO-ASX,WD-MSX,NG00-USA,GC00-USA,CC00-USA,C00-USA,FC00-USA,ER00-USA,EURUSD-FX1,USDMXN-FX1,AUDJPY-FX1,EURCZK-FX1,USDILS-FX1,USDZAR-FX1,US10YY-TU1&lt;/p&gt; (required)
   * @param reqId Request Identification String. Can be used by the application to keep track of requests.  The id is not used by this service, however, it is included in the response. (optional)
   * @param startDate This is the start date for the Snapshot History. Requests should be made in the format YYYYMMDD Default is current business day. Field can be sd or date. TRY IT OUT Cannot use current day. (optional)
   * @param startTime This is the start time for the snapshot history requested. Requests should be made in a **HHMMSS** format.Range from 000000 - 235959. **TRY IT OUT** Cannot use current day (optional, default to 040000)
   * @param format The format of the output file.  (optional, default to XML)
   * @param includeRequest Flag to include request id and key in the CSV output. (optional, default to false)
   * @param dataset Decides what type of trades to return, default is all trades and quotes, alternatively charting can be selected which will filter out unofficial trades. (optional)
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
  public ApiResponse<TickHistoryResponse> firsttradeGetWithHttpInfo(String id, String reqId, String startDate, String startTime, String format, String includeRequest, String dataset) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling firsttradeGet");
    }
    
    // create path and map variables
    String localVarPath = "/firsttrade";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "id", id));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "req_id", reqId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_date", startDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_time", startTime));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "format", format));
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
        
        TickHistoryResponse
      
    > apiResponse = apiClient.invokeAPI("FirstTradeApi.firsttradeGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, firsttradeGetResponseTypeMap, false);

    return apiResponse;

  }
}
