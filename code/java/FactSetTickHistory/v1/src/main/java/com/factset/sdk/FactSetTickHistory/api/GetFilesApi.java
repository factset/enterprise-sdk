package com.factset.sdk.FactSetTickHistory.api;

import com.factset.sdk.FactSetTickHistory.ApiException;
import com.factset.sdk.FactSetTickHistory.ApiClient;
import com.factset.sdk.FactSetTickHistory.ApiResponse;
import com.factset.sdk.FactSetTickHistory.Configuration;
import com.factset.sdk.FactSetTickHistory.Pair;

import javax.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.FactSetTickHistory.models.GetFilesResponse;
import com.factset.sdk.FactSetTickHistory.models.GetFilesStatus;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GetFilesApi {
  private ApiClient apiClient;

  public GetFilesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public GetFilesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> v1GetFilesGetResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    v1GetFilesGetResponseTypeMap.put(200, new GenericType<GetFilesResponse>(){});
    v1GetFilesGetResponseTypeMap.put(400, new GenericType<GetFilesStatus>(){});
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
   * Returns the files from tickhistory endpoint for the specified date range
   * 
   * @param requestId RequestId returned by request-files endpoint to poll and collect results of the query (required)
   * @param paginationLimit Specifies the maximum number of results to return per response page (optional, default to 20)
   * @param paginationOffset Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results (optional, default to 0)
   * @return GetFilesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success&lt;/p&gt; **To download the output file copy the response url in a browser** </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     </table>
   */
  public GetFilesResponse v1GetFilesGet(String requestId, Integer paginationLimit, Integer paginationOffset) throws ApiException {
    return v1GetFilesGetWithHttpInfo(requestId, paginationLimit, paginationOffset).getData();
  }

  /**
   * Returns the files from tickhistory endpoint for the specified date range
   * 
   * @param requestId RequestId returned by request-files endpoint to poll and collect results of the query (required)
   * @param paginationLimit Specifies the maximum number of results to return per response page (optional, default to 20)
   * @param paginationOffset Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results (optional, default to 0)
   * @return ApiResponse&lt;GetFilesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success&lt;/p&gt; **To download the output file copy the response url in a browser** </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetFilesResponse> v1GetFilesGetWithHttpInfo(String requestId, Integer paginationLimit, Integer paginationOffset) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'requestId' is set
    if (requestId == null) {
      throw new ApiException(400, "Missing the required parameter 'requestId' when calling v1GetFilesGet");
    }
    
    // create path and map variables
    String localVarPath = "/v1/get-files";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "requestId", requestId));
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
        
        GetFilesResponse
      
    > apiResponse = apiClient.invokeAPI("GetFilesApi.v1GetFilesGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, v1GetFilesGetResponseTypeMap, false);

    return apiResponse;

  }
}
