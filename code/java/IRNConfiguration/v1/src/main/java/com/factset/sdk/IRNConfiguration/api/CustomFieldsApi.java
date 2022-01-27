package com.factset.sdk.IRNConfiguration.api;

import com.factset.sdk.IRNConfiguration.ApiException;
import com.factset.sdk.IRNConfiguration.ApiClient;
import com.factset.sdk.IRNConfiguration.ApiResponse;
import com.factset.sdk.IRNConfiguration.Configuration;
import com.factset.sdk.IRNConfiguration.Pair;

import javax.ws.rs.core.GenericType;

import com.factset.sdk.IRNConfiguration.models.CustomFieldConfigDto;
import com.factset.sdk.IRNConfiguration.models.ProblemDetails;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CustomFieldsApi {
  private ApiClient apiClient;

  public CustomFieldsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public CustomFieldsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
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
   * Get all Custom Fields
   * 
   * @param xIRNIgnorePermissions  (optional, default to false)
   * @return java.util.List&lt;CustomFieldConfigDto&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     </table>
   */
  public java.util.List<CustomFieldConfigDto> v1CustomFieldsGet(Boolean xIRNIgnorePermissions) throws ApiException {
    return v1CustomFieldsGetWithHttpInfo(xIRNIgnorePermissions).getData();
  }

  /**
   * Get all Custom Fields
   * 
   * @param xIRNIgnorePermissions  (optional, default to false)
   * @return ApiResponse&lt;java.util.List&lt;CustomFieldConfigDto&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<java.util.List<CustomFieldConfigDto>> v1CustomFieldsGetWithHttpInfo(Boolean xIRNIgnorePermissions) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/v1/custom-fields";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();


    if (xIRNIgnorePermissions != null)
      localVarHeaderParams.put("X-IRN-Ignore-Permissions", apiClient.parameterToString(xIRNIgnorePermissions));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };

    GenericType<java.util.List<CustomFieldConfigDto>> localVarReturnType = new GenericType<java.util.List<CustomFieldConfigDto>>() {};

    return apiClient.invokeAPI("CustomFieldsApi.v1CustomFieldsGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
