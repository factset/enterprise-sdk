package com.factset.sdk.FactSetEstimates.api;

import com.factset.sdk.FactSetEstimates.ApiException;
import com.factset.sdk.FactSetEstimates.ApiClient;
import com.factset.sdk.FactSetEstimates.ApiResponse;
import com.factset.sdk.FactSetEstimates.Configuration;
import com.factset.sdk.FactSetEstimates.Pair;

import jakarta.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.FactSetEstimates.models.ConsensusRatingsRequest;
import com.factset.sdk.FactSetEstimates.models.ConsensusRatingsResponse;
import com.factset.sdk.FactSetEstimates.models.DetailRatingsRequest;
import com.factset.sdk.FactSetEstimates.models.DetailRatingsResponse;
import com.factset.sdk.FactSetEstimates.models.ErrorResponse;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class RatingsApi {
  private ApiClient apiClient;

  public RatingsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public RatingsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> getConsensusRatingsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getConsensusRatingsResponseTypeMap.put(200, new GenericType<ConsensusRatingsResponse>(){});
    getConsensusRatingsResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getConsensusRatingsResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getConsensusRatingsResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getConsensusRatingsResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getConsensusRatingsResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> getConsensusRatingsForListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getConsensusRatingsForListResponseTypeMap.put(200, new GenericType<ConsensusRatingsResponse>(){});
    getConsensusRatingsForListResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getConsensusRatingsForListResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getConsensusRatingsForListResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getConsensusRatingsForListResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getConsensusRatingsForListResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> getDetailRatingsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getDetailRatingsResponseTypeMap.put(200, new GenericType<DetailRatingsResponse>(){});
    getDetailRatingsResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getDetailRatingsResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getDetailRatingsResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getDetailRatingsResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getDetailRatingsResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> getDetailRatingsForListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getDetailRatingsForListResponseTypeMap.put(200, new GenericType<DetailRatingsResponse>(){});
    getDetailRatingsForListResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getDetailRatingsForListResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getDetailRatingsForListResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getDetailRatingsForListResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getDetailRatingsForListResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
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
   * Ratings consensus estimates to fetch Buy, overWeight, Hold, underWeight, and Sell.
   * Returns ratings from the FactSet Estimates database for current and historical for an individual security using rolling fiscal dates as of a specific date. 
   * @param ids Security or Entity identifiers. Accepted inputs include FactSet Identifiers, tickers, CUSIP, and SEDOL. &lt;p&gt;&lt;b&gt;Performance Note:&lt;/b&gt; Requests that increase the number of metrics or request long historical data may trigger the 30-second service timeout threshold. To ensure system stability and performance, please keep requests lightweight.&lt;/p&gt; &lt;p&gt;If requesting long historical data, limit the history to &lt;b&gt;10 years per metric per ID&lt;/b&gt;.&lt;/p&gt;  (required)
   * @param startDate Start date for point in time of estimates expressed in YYYY-MM-DD format. (optional)
   * @param endDate End date for point in time of estimates expressed in YYYY-MM-DD format. (optional)
   * @param frequency Controls the frequency of the data returned.   * **D** &#x3D; Daily   * **W** &#x3D; Weekly, based on the last day of the week of the start date.   * **AM** &#x3D; Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16 etc.).         * **AQ** &#x3D; Quarterly, based on the start date.   * **AY** &#x3D; Actual Annual, based on the start date.   (optional, default to AM)
   * @return ConsensusRatingsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Estimate data items </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ConsensusRatingsResponse getConsensusRatings(java.util.List<String> ids, String startDate, String endDate, String frequency) throws ApiException {
    return getConsensusRatingsWithHttpInfo(ids, startDate, endDate, frequency).getData();
  }

  /**
   * Ratings consensus estimates to fetch Buy, overWeight, Hold, underWeight, and Sell.
   * Returns ratings from the FactSet Estimates database for current and historical for an individual security using rolling fiscal dates as of a specific date. 
   * @param ids Security or Entity identifiers. Accepted inputs include FactSet Identifiers, tickers, CUSIP, and SEDOL. &lt;p&gt;&lt;b&gt;Performance Note:&lt;/b&gt; Requests that increase the number of metrics or request long historical data may trigger the 30-second service timeout threshold. To ensure system stability and performance, please keep requests lightweight.&lt;/p&gt; &lt;p&gt;If requesting long historical data, limit the history to &lt;b&gt;10 years per metric per ID&lt;/b&gt;.&lt;/p&gt;  (required)
   * @param startDate Start date for point in time of estimates expressed in YYYY-MM-DD format. (optional)
   * @param endDate End date for point in time of estimates expressed in YYYY-MM-DD format. (optional)
   * @param frequency Controls the frequency of the data returned.   * **D** &#x3D; Daily   * **W** &#x3D; Weekly, based on the last day of the week of the start date.   * **AM** &#x3D; Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16 etc.).         * **AQ** &#x3D; Quarterly, based on the start date.   * **AY** &#x3D; Actual Annual, based on the start date.   (optional, default to AM)
   * @return ApiResponse&lt;ConsensusRatingsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Estimate data items </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ConsensusRatingsResponse> getConsensusRatingsWithHttpInfo(java.util.List<String> ids, String startDate, String endDate, String frequency) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ids' is set
    if (ids == null) {
      throw new ApiException(400, "Missing the required parameter 'ids' when calling getConsensusRatings");
    }
    
    // create path and map variables
    String localVarPath = "/factset-estimates/v2/consensus-ratings";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "ids", ids));
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
        
        ConsensusRatingsResponse
      
    > apiResponse = apiClient.invokeAPI("RatingsApi.getConsensusRatings", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getConsensusRatingsResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Ratings consensus estimates to fetch Buy, overWeight, Hold, underWeight, and Sell.
   * Returns ratings from the FactSet Estimates database for current and historical for an individual security using rolling fiscal dates as of a specific date. 
   * @param consensusRatingsRequest Request object for Estimate Data Items. (required)
   * @return ConsensusRatingsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Estimate data items </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ConsensusRatingsResponse getConsensusRatingsForList(ConsensusRatingsRequest consensusRatingsRequest) throws ApiException {
    return getConsensusRatingsForListWithHttpInfo(consensusRatingsRequest).getData();
  }

  /**
   * Ratings consensus estimates to fetch Buy, overWeight, Hold, underWeight, and Sell.
   * Returns ratings from the FactSet Estimates database for current and historical for an individual security using rolling fiscal dates as of a specific date. 
   * @param consensusRatingsRequest Request object for Estimate Data Items. (required)
   * @return ApiResponse&lt;ConsensusRatingsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Estimate data items </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ConsensusRatingsResponse> getConsensusRatingsForListWithHttpInfo(ConsensusRatingsRequest consensusRatingsRequest) throws ApiException {
    Object localVarPostBody = consensusRatingsRequest;
    
    // verify the required parameter 'consensusRatingsRequest' is set
    if (consensusRatingsRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'consensusRatingsRequest' when calling getConsensusRatingsForList");
    }
    
    // create path and map variables
    String localVarPath = "/factset-estimates/v2/consensus-ratings";

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
        
        ConsensusRatingsResponse
      
    > apiResponse = apiClient.invokeAPI("RatingsApi.getConsensusRatingsForList", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getConsensusRatingsForListResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Broker Detail estimates to fetch Buy, overWeight, Hold, underWeight, and Sell.
   * Retrieves the Broker Level ratings for the requested Id and date range. Ratings include Buy, Hold, Sell, overWeight, and underWeight. &lt;p&gt;The &#x60;startDate&#x60; and &#x60;endDate&#x60; parameters controls the range of perspective dates. By default, the service will return the range of estimateDates within the latest company&#39;s reporting period. As you expand the date range, additional full historical reporting periods and all ratings estimateDates per broker will be returned.&lt;/p&gt; 
   * @param ids Security or Entity identifiers. Accepted inputs include FactSet Identifiers, tickers, CUSIP, and SEDOL. &lt;p&gt;&lt;b&gt;Performance Note:&lt;/b&gt; Requests that increase the number of metrics or request long historical data may trigger the 30-second service timeout threshold. To ensure system stability and performance, please keep requests lightweight.&lt;/p&gt; &lt;p&gt;If requesting long historical data, limit the history to &lt;b&gt;10 years per metric per ID&lt;/b&gt;.&lt;/p&gt;  (required)
   * @param startDate Start date for point in time of estimates expressed in YYYY-MM-DD format. (optional)
   * @param endDate End date for point in time of estimates expressed in YYYY-MM-DD format. (optional)
   * @param includeAll Include All filter is used to identify included and excluded broker details from the consensus   By default the service would return only the brokers included in the consensus-   * **TRUE** &#x3D; Returns all the brokers included and excluded in the consensus   * **FALSE** &#x3D; Returns only the broker details included in the consensus     (optional, default to false)
   * @return DetailRatingsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Estimate Ratings data items </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public DetailRatingsResponse getDetailRatings(java.util.List<String> ids, String startDate, String endDate, Boolean includeAll) throws ApiException {
    return getDetailRatingsWithHttpInfo(ids, startDate, endDate, includeAll).getData();
  }

  /**
   * Broker Detail estimates to fetch Buy, overWeight, Hold, underWeight, and Sell.
   * Retrieves the Broker Level ratings for the requested Id and date range. Ratings include Buy, Hold, Sell, overWeight, and underWeight. &lt;p&gt;The &#x60;startDate&#x60; and &#x60;endDate&#x60; parameters controls the range of perspective dates. By default, the service will return the range of estimateDates within the latest company&#39;s reporting period. As you expand the date range, additional full historical reporting periods and all ratings estimateDates per broker will be returned.&lt;/p&gt; 
   * @param ids Security or Entity identifiers. Accepted inputs include FactSet Identifiers, tickers, CUSIP, and SEDOL. &lt;p&gt;&lt;b&gt;Performance Note:&lt;/b&gt; Requests that increase the number of metrics or request long historical data may trigger the 30-second service timeout threshold. To ensure system stability and performance, please keep requests lightweight.&lt;/p&gt; &lt;p&gt;If requesting long historical data, limit the history to &lt;b&gt;10 years per metric per ID&lt;/b&gt;.&lt;/p&gt;  (required)
   * @param startDate Start date for point in time of estimates expressed in YYYY-MM-DD format. (optional)
   * @param endDate End date for point in time of estimates expressed in YYYY-MM-DD format. (optional)
   * @param includeAll Include All filter is used to identify included and excluded broker details from the consensus   By default the service would return only the brokers included in the consensus-   * **TRUE** &#x3D; Returns all the brokers included and excluded in the consensus   * **FALSE** &#x3D; Returns only the broker details included in the consensus     (optional, default to false)
   * @return ApiResponse&lt;DetailRatingsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Estimate Ratings data items </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<DetailRatingsResponse> getDetailRatingsWithHttpInfo(java.util.List<String> ids, String startDate, String endDate, Boolean includeAll) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ids' is set
    if (ids == null) {
      throw new ApiException(400, "Missing the required parameter 'ids' when calling getDetailRatings");
    }
    
    // create path and map variables
    String localVarPath = "/factset-estimates/v2/detail-ratings";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "ids", ids));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startDate", startDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "endDate", endDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "includeAll", includeAll));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        DetailRatingsResponse
      
    > apiResponse = apiClient.invokeAPI("RatingsApi.getDetailRatings", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getDetailRatingsResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Broker Detail estimates to fetch Buy, overWeight, Hold, underWeight, and Sell.
   * Retrieves the Broker Level ratings for the requested Id and date range. Ratings include Buy, Hold, Sell, overWeight, and underWeight. &lt;p&gt;The &#x60;startDate&#x60; and &#x60;endDate&#x60; parameters controls the range of perspective dates. By default, the service will return the range of estimateDates within the latest company&#39;s reporting period. As you expand the date range, additional full historical reporting periods and all ratings estimateDates per broker will be returned.&lt;/p&gt; 
   * @param detailRatingsRequest Request object for Detail Reatings Data Items. (required)
   * @return DetailRatingsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Estimate Detail Ratings data items </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public DetailRatingsResponse getDetailRatingsForList(DetailRatingsRequest detailRatingsRequest) throws ApiException {
    return getDetailRatingsForListWithHttpInfo(detailRatingsRequest).getData();
  }

  /**
   * Broker Detail estimates to fetch Buy, overWeight, Hold, underWeight, and Sell.
   * Retrieves the Broker Level ratings for the requested Id and date range. Ratings include Buy, Hold, Sell, overWeight, and underWeight. &lt;p&gt;The &#x60;startDate&#x60; and &#x60;endDate&#x60; parameters controls the range of perspective dates. By default, the service will return the range of estimateDates within the latest company&#39;s reporting period. As you expand the date range, additional full historical reporting periods and all ratings estimateDates per broker will be returned.&lt;/p&gt; 
   * @param detailRatingsRequest Request object for Detail Reatings Data Items. (required)
   * @return ApiResponse&lt;DetailRatingsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Estimate Detail Ratings data items </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<DetailRatingsResponse> getDetailRatingsForListWithHttpInfo(DetailRatingsRequest detailRatingsRequest) throws ApiException {
    Object localVarPostBody = detailRatingsRequest;
    
    // verify the required parameter 'detailRatingsRequest' is set
    if (detailRatingsRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'detailRatingsRequest' when calling getDetailRatingsForList");
    }
    
    // create path and map variables
    String localVarPath = "/factset-estimates/v2/detail-ratings";

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
        
        DetailRatingsResponse
      
    > apiResponse = apiClient.invokeAPI("RatingsApi.getDetailRatingsForList", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getDetailRatingsForListResponseTypeMap, false);

    return apiResponse;

  }
}
