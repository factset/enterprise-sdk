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

import com.factset.sdk.ExchangeDataFeedSnapshotAPIEntireExchange.models.ErrorMessages;
import com.factset.sdk.ExchangeDataFeedSnapshotAPIEntireExchange.models.InlineResponse200;
import java.time.LocalDate;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class SnapshotApi {
  private ApiClient apiClient;

  public SnapshotApi() {
    this(Configuration.getDefaultApiClient());
  }

  public SnapshotApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> getV1ListFilesResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getV1ListFilesResponseTypeMap.put(200, new GenericType<InlineResponse200>(){});
    getV1ListFilesResponseTypeMap.put(400, new GenericType<ErrorMessages>(){});
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
   * Snapshot
   * A service that provides access to Real Time or Delayed data snapped at hourly intervals for an entire Exchange
   * @param product any product subscribed by client. Minimum value for prod code&#x3D;9001 (required)
   * @param startDate YYYYMMDD (Choose between 1 and 4 previous trading days) (required)
   * @param endDate YYYYMMDD (Choose between 1 and 4 previous trading days, greater than or equal to start date) (required)
   * @param startTime HHMM (24 hour time EST) (required)
   * @param endTime HHMM (24 hour time EST) (required)
   * @param access Option to select from static, DL or RT data (optional, default to DL)
   * @return InlineResponse200
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success  </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse200 getV1ListFiles(Integer product, LocalDate startDate, LocalDate endDate, String startTime, String endTime, String access) throws ApiException {
    return getV1ListFilesWithHttpInfo(product, startDate, endDate, startTime, endTime, access).getData();
  }

  /**
   * Snapshot
   * A service that provides access to Real Time or Delayed data snapped at hourly intervals for an entire Exchange
   * @param product any product subscribed by client. Minimum value for prod code&#x3D;9001 (required)
   * @param startDate YYYYMMDD (Choose between 1 and 4 previous trading days) (required)
   * @param endDate YYYYMMDD (Choose between 1 and 4 previous trading days, greater than or equal to start date) (required)
   * @param startTime HHMM (24 hour time EST) (required)
   * @param endTime HHMM (24 hour time EST) (required)
   * @param access Option to select from static, DL or RT data (optional, default to DL)
   * @return ApiResponse&lt;InlineResponse200&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success  </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse200> getV1ListFilesWithHttpInfo(Integer product, LocalDate startDate, LocalDate endDate, String startTime, String endTime, String access) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'product' is set
    if (product == null) {
      throw new ApiException(400, "Missing the required parameter 'product' when calling getV1ListFiles");
    }
    
    // verify the required parameter 'startDate' is set
    if (startDate == null) {
      throw new ApiException(400, "Missing the required parameter 'startDate' when calling getV1ListFiles");
    }
    
    // verify the required parameter 'endDate' is set
    if (endDate == null) {
      throw new ApiException(400, "Missing the required parameter 'endDate' when calling getV1ListFiles");
    }
    
    // verify the required parameter 'startTime' is set
    if (startTime == null) {
      throw new ApiException(400, "Missing the required parameter 'startTime' when calling getV1ListFiles");
    }
    
    // verify the required parameter 'endTime' is set
    if (endTime == null) {
      throw new ApiException(400, "Missing the required parameter 'endTime' when calling getV1ListFiles");
    }
    
    // create path and map variables
    String localVarPath = "/v1/list-files";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "product", product));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_date", startDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_date", endDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_time", startTime));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_time", endTime));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "access", access));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        InlineResponse200
      
    > apiResponse = apiClient.invokeAPI("SnapshotApi.getV1ListFiles", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getV1ListFilesResponseTypeMap, false);

    return apiResponse;

  }
}
