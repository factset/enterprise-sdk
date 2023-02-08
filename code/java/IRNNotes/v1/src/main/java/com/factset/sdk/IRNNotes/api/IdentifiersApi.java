package com.factset.sdk.IRNNotes.api;

import com.factset.sdk.IRNNotes.ApiException;
import com.factset.sdk.IRNNotes.ApiClient;
import com.factset.sdk.IRNNotes.ApiResponse;
import com.factset.sdk.IRNNotes.Configuration;
import com.factset.sdk.IRNNotes.Pair;

import javax.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.IRNNotes.models.ProblemDetails;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class IdentifiersApi {
  private ApiClient apiClient;

  public IdentifiersApi() {
    this(Configuration.getDefaultApiClient());
  }

  public IdentifiersApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> getIdentifiersResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getIdentifiersResponseTypeMap.put(200, new GenericType<java.util.List<Object>>(){});
    getIdentifiersResponseTypeMap.put(400, new GenericType<ProblemDetails>(){});
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
   * Get all the identifier details for given identifiers
   * 
   * @param identifiers Identifiers (optional)
   * @return java.util.List<Object>
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     </table>
   */
  public java.util.List<Object> getIdentifiers(String identifiers) throws ApiException {
    return getIdentifiersWithHttpInfo(identifiers).getData();
  }

  /**
   * Get all the identifier details for given identifiers
   * 
   * @param identifiers Identifiers (optional)
   * @return ApiResponse&lt;java.util.List<Object>&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<java.util.List<Object>> getIdentifiersWithHttpInfo(String identifiers) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/v1/identifiers";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "identifiers", identifiers));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        java.util.List<Object>
      
    > apiResponse = apiClient.invokeAPI("IdentifiersApi.getIdentifiers", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getIdentifiersResponseTypeMap, false);

    return apiResponse;

  }
}
