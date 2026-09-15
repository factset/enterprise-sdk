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

public class LastTradeApi {
  private ApiClient apiClient;

  public LastTradeApi() {
    this(Configuration.getDefaultApiClient());
  }

  public LastTradeApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> lasttradeGetResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    lasttradeGetResponseTypeMap.put(200, new GenericType<TickHistoryResponse>(){});
    lasttradeGetResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    lasttradeGetResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    lasttradeGetResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    lasttradeGetResponseTypeMap.put(405, new GenericType<ErrorResponse>(){});
    lasttradeGetResponseTypeMap.put(408, new GenericType<ErrorResponse>(){});
    lasttradeGetResponseTypeMap.put(429, new GenericType<ErrorResponse>(){});
    lasttradeGetResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
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
   * Last Trade service returns the last trade and associated quotes before a specified time
   * The Last Trade service returns data for the last trade and associated quotes before the specified time.
   * @param id Requested symbol or security. The symbol can be a FactSet ticker-exchange or ticker-region symbol, CUSIP, ISIN or SEDOL.  &lt;p&gt;**Note**: Only one identifier can be requested per API call. &lt;/p&gt; &lt;p&gt;The sandbox environment provides access to the following list of symbols: &lt;/p&gt; &lt;p&gt;BABA-USA,WALMEX-MX,7203-TKS,VOD-LON,NPN-JSE,MABAX,NZF,SPY-USA,AGG-USA,GLD-USA,AOR-USA,MNA-USA,UUP-USA,SP50-SPX,ESX-STX,XAO-ASX,WD-MSX,NG00-USA,GC00-USA,CC00-USA,C00-USA,FC00-USA,ER00-USA,EURUSD-FX1,USDMXN-FX1,AUDJPY-FX1,EURCZK-FX1,USDILS-FX1,USDZAR-FX1,US10YY-TU1&lt;/p&gt; (required)
   * @param format The format of the output file.  (optional, default to XML)
   * @param date Request should be made in the format **YYYYMMDD**.  The initial release only supports requests from completed trading days  (optional)
   * @param time Request should be made in the format **HHMMSS**.HH- Hour, MM- Minutes, SSS- Seconds (optional)
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
  public TickHistoryResponse lasttradeGet(String id, String format, String date, String time) throws ApiException {
    return lasttradeGetWithHttpInfo(id, format, date, time).getData();
  }

  /**
   * Last Trade service returns the last trade and associated quotes before a specified time
   * The Last Trade service returns data for the last trade and associated quotes before the specified time.
   * @param id Requested symbol or security. The symbol can be a FactSet ticker-exchange or ticker-region symbol, CUSIP, ISIN or SEDOL.  &lt;p&gt;**Note**: Only one identifier can be requested per API call. &lt;/p&gt; &lt;p&gt;The sandbox environment provides access to the following list of symbols: &lt;/p&gt; &lt;p&gt;BABA-USA,WALMEX-MX,7203-TKS,VOD-LON,NPN-JSE,MABAX,NZF,SPY-USA,AGG-USA,GLD-USA,AOR-USA,MNA-USA,UUP-USA,SP50-SPX,ESX-STX,XAO-ASX,WD-MSX,NG00-USA,GC00-USA,CC00-USA,C00-USA,FC00-USA,ER00-USA,EURUSD-FX1,USDMXN-FX1,AUDJPY-FX1,EURCZK-FX1,USDILS-FX1,USDZAR-FX1,US10YY-TU1&lt;/p&gt; (required)
   * @param format The format of the output file.  (optional, default to XML)
   * @param date Request should be made in the format **YYYYMMDD**.  The initial release only supports requests from completed trading days  (optional)
   * @param time Request should be made in the format **HHMMSS**.HH- Hour, MM- Minutes, SSS- Seconds (optional)
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
  public ApiResponse<TickHistoryResponse> lasttradeGetWithHttpInfo(String id, String format, String date, String time) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling lasttradeGet");
    }
    
    // create path and map variables
    String localVarPath = "/lasttrade";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "id", id));
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
      
    > apiResponse = apiClient.invokeAPI("LastTradeApi.lasttradeGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, lasttradeGetResponseTypeMap, false);

    return apiResponse;

  }
}
