package com.factset.sdk.Vermilion.api;

import com.factset.sdk.Vermilion.ApiException;
import com.factset.sdk.Vermilion.ApiClient;
import com.factset.sdk.Vermilion.ApiResponse;
import com.factset.sdk.Vermilion.Configuration;
import com.factset.sdk.Vermilion.Pair;

import jakarta.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.Vermilion.models.ErrorList;
import com.factset.sdk.Vermilion.models.VersionResponseBody;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class VersionApi {
  private ApiClient apiClient;

  public VersionApi() {
    this(Configuration.getDefaultApiClient());
  }

  public VersionApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> getVersionResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getVersionResponseTypeMap.put(200, new GenericType<VersionResponseBody>(){});
    getVersionResponseTypeMap.put(401, new GenericType<ErrorList>(){});
    getVersionResponseTypeMap.put(500, new GenericType<ErrorList>(){});
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
   * Gets the version of VRS,WRS and DBServer
   * Gets the version of VRS,WRS and DBServer
   * @return VersionResponseBody
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorised </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> The server have encountered an unhandled error due to which request was not fulfilled. </td><td>  -  </td></tr>
     </table>
   */
  public VersionResponseBody getVersion() throws ApiException {
    return getVersionWithHttpInfo().getData();
  }

  /**
   * Gets the version of VRS,WRS and DBServer
   * Gets the version of VRS,WRS and DBServer
   * @return ApiResponse&lt;VersionResponseBody&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorised </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> The server have encountered an unhandled error due to which request was not fulfilled. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<VersionResponseBody> getVersionWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/v1/version";

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
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        VersionResponseBody
      
    > apiResponse = apiClient.invokeAPI("VersionApi.getVersion", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getVersionResponseTypeMap, false);

    return apiResponse;

  }
}
