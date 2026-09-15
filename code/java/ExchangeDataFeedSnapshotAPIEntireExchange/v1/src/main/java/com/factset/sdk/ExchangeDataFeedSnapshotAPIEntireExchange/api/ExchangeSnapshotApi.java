package com.factset.sdk.ExchangeDataFeedSnapshotAPIEntireExchange.api;

import com.factset.sdk.ExchangeDataFeedSnapshotAPIEntireExchange.ApiException;
import com.factset.sdk.ExchangeDataFeedSnapshotAPIEntireExchange.ApiClient;
import com.factset.sdk.ExchangeDataFeedSnapshotAPIEntireExchange.ApiResponse;
import com.factset.sdk.ExchangeDataFeedSnapshotAPIEntireExchange.Configuration;
import com.factset.sdk.ExchangeDataFeedSnapshotAPIEntireExchange.Pair;

import jakarta.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.ExchangeDataFeedSnapshotAPIEntireExchange.models.EntireExchangeSnapshotResponse;
import com.factset.sdk.ExchangeDataFeedSnapshotAPIEntireExchange.models.ErrorResponse;
import java.time.LocalDate;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class ExchangeSnapshotApi {
  private ApiClient apiClient;

  public ExchangeSnapshotApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ExchangeSnapshotApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> getListFilesResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getListFilesResponseTypeMap.put(200, new GenericType<EntireExchangeSnapshotResponse>(){});
    getListFilesResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getListFilesResponseTypeMap.put(401, new GenericType<String>(){});
    getListFilesResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getListFilesResponseTypeMap.put(408, new GenericType<ErrorResponse>(){});
    getListFilesResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
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
   * List Files service returns downloadable Real Time, Delayed or Static Exchange Snapshot files for a specified product, date range, and time range
   * A service that provides access to Real Time or Delayed data snapped at hourly intervals for an entire Exchange
   * @param product any product subscribed by client (required)
   * @param startDate YYYYMMDD (Choose between 1 and 4 previous trading days). Also accepts &#x60;start_date&#x60; (snake_case), which is deprecated and exists for backward compatibility. (required)
   * @param endDate YYYYMMDD (Choose between 1 and 4 previous trading days, greater than or equal to start date). Also accepts &#x60;end_date&#x60; (snake_case), which is deprecated and exists for backward compatibility. (required)
   * @param startTime HHMM (24 hour time EST). Also accepts &#x60;start_time&#x60; (snake_case), which is deprecated and exists for backward compatibility. (required)
   * @param endTime HHMM (24 hour time EST). Also accepts &#x60;end_time&#x60; (snake_case), which is deprecated and exists for backward compatibility. (required)
   * @param access Option to select from static, DL or RT data (optional, default to DL)
   * @return EntireExchangeSnapshotResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success  </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Authentication Failed </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 408 </td><td> Request Timeout </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public EntireExchangeSnapshotResponse getListFiles(Integer product, LocalDate startDate, LocalDate endDate, String startTime, String endTime, String access) throws ApiException {
    return getListFilesWithHttpInfo(product, startDate, endDate, startTime, endTime, access).getData();
  }

  /**
   * List Files service returns downloadable Real Time, Delayed or Static Exchange Snapshot files for a specified product, date range, and time range
   * A service that provides access to Real Time or Delayed data snapped at hourly intervals for an entire Exchange
   * @param product any product subscribed by client (required)
   * @param startDate YYYYMMDD (Choose between 1 and 4 previous trading days). Also accepts &#x60;start_date&#x60; (snake_case), which is deprecated and exists for backward compatibility. (required)
   * @param endDate YYYYMMDD (Choose between 1 and 4 previous trading days, greater than or equal to start date). Also accepts &#x60;end_date&#x60; (snake_case), which is deprecated and exists for backward compatibility. (required)
   * @param startTime HHMM (24 hour time EST). Also accepts &#x60;start_time&#x60; (snake_case), which is deprecated and exists for backward compatibility. (required)
   * @param endTime HHMM (24 hour time EST). Also accepts &#x60;end_time&#x60; (snake_case), which is deprecated and exists for backward compatibility. (required)
   * @param access Option to select from static, DL or RT data (optional, default to DL)
   * @return ApiResponse&lt;EntireExchangeSnapshotResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success  </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Authentication Failed </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 408 </td><td> Request Timeout </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<EntireExchangeSnapshotResponse> getListFilesWithHttpInfo(Integer product, LocalDate startDate, LocalDate endDate, String startTime, String endTime, String access) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'product' is set
    if (product == null) {
      throw new ApiException(400, "Missing the required parameter 'product' when calling getListFiles");
    }
    
    // verify the required parameter 'startDate' is set
    if (startDate == null) {
      throw new ApiException(400, "Missing the required parameter 'startDate' when calling getListFiles");
    }
    
    // verify the required parameter 'endDate' is set
    if (endDate == null) {
      throw new ApiException(400, "Missing the required parameter 'endDate' when calling getListFiles");
    }
    
    // verify the required parameter 'startTime' is set
    if (startTime == null) {
      throw new ApiException(400, "Missing the required parameter 'startTime' when calling getListFiles");
    }
    
    // verify the required parameter 'endTime' is set
    if (endTime == null) {
      throw new ApiException(400, "Missing the required parameter 'endTime' when calling getListFiles");
    }
    
    // create path and map variables
    String localVarPath = "/list-files";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "product", product));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startDate", startDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "endDate", endDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startTime", startTime));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "endTime", endTime));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "access", access));

    
    
    
    final String[] localVarAccepts = {
      "application/json", "text/plain"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        EntireExchangeSnapshotResponse
      
    > apiResponse = apiClient.invokeAPI("ExchangeSnapshotApi.getListFiles", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getListFilesResponseTypeMap, false);

    return apiResponse;

  }
}
