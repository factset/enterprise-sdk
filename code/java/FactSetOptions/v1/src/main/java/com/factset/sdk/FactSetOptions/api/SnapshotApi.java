package com.factset.sdk.FactSetOptions.api;

import com.factset.sdk.FactSetOptions.ApiException;
import com.factset.sdk.FactSetOptions.ApiClient;
import com.factset.sdk.FactSetOptions.ApiResponse;
import com.factset.sdk.FactSetOptions.Configuration;
import com.factset.sdk.FactSetOptions.Pair;

import javax.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.FactSetOptions.models.ErrorResponse;
import com.factset.sdk.FactSetOptions.models.SnapshotRequest;
import com.factset.sdk.FactSetOptions.models.SnapshotResponse;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SnapshotApi {
  private ApiClient apiClient;

  public SnapshotApi() {
    this(Configuration.getDefaultApiClient());
  }

  public SnapshotApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> getOptionsSnapshotForListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getOptionsSnapshotForListResponseTypeMap.put(200, new GenericType<SnapshotResponse>(){});
    getOptionsSnapshotForListResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getOptionsSnapshotForListResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getOptionsSnapshotForListResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getOptionsSnapshotForListResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getOptionsSnapshotForListResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
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
   * Returns all the profile information for the list of identifiers as of a specific date
   * Returns all the profile information for the list of identifiers for a specific date. The data includes -  * Expiration Date * Greek - Delta * Implied Volatility * Price  * Style * Type * Underlying Security * Underlying Security Price * Open Interest * Name    *Currently only OPRA Exchange is supported with exchange ISO \&quot;USA\&quot;* 
   * @param snapshotRequest Snapshot Request Object (required)
   * @return SnapshotResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Snapshot Response Object </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public SnapshotResponse getOptionsSnapshotForList(SnapshotRequest snapshotRequest) throws ApiException {
    return getOptionsSnapshotForListWithHttpInfo(snapshotRequest).getData();
  }

  /**
   * Returns all the profile information for the list of identifiers as of a specific date
   * Returns all the profile information for the list of identifiers for a specific date. The data includes -  * Expiration Date * Greek - Delta * Implied Volatility * Price  * Style * Type * Underlying Security * Underlying Security Price * Open Interest * Name    *Currently only OPRA Exchange is supported with exchange ISO \&quot;USA\&quot;* 
   * @param snapshotRequest Snapshot Request Object (required)
   * @return ApiResponse&lt;SnapshotResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Snapshot Response Object </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SnapshotResponse> getOptionsSnapshotForListWithHttpInfo(SnapshotRequest snapshotRequest) throws ApiException {
    Object localVarPostBody = snapshotRequest;
    
    // verify the required parameter 'snapshotRequest' is set
    if (snapshotRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'snapshotRequest' when calling getOptionsSnapshotForList");
    }
    
    // create path and map variables
    String localVarPath = "/factset-options/v1/snapshot";

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
        
        SnapshotResponse
      
    > apiResponse = apiClient.invokeAPI("SnapshotApi.getOptionsSnapshotForList", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getOptionsSnapshotForListResponseTypeMap, false);

    return apiResponse;

  }
}
