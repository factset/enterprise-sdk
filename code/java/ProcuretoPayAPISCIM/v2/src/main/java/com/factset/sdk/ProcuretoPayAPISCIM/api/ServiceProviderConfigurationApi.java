package com.factset.sdk.ProcuretoPayAPISCIM.api;

import com.factset.sdk.ProcuretoPayAPISCIM.ApiException;
import com.factset.sdk.ProcuretoPayAPISCIM.ApiClient;
import com.factset.sdk.ProcuretoPayAPISCIM.ApiResponse;
import com.factset.sdk.ProcuretoPayAPISCIM.Configuration;
import com.factset.sdk.ProcuretoPayAPISCIM.Pair;

import jakarta.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.ProcuretoPayAPISCIM.models.Error;
import com.factset.sdk.ProcuretoPayAPISCIM.models.InlineResponse429;
import com.factset.sdk.ProcuretoPayAPISCIM.models.ServiceProviderConfig;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class ServiceProviderConfigurationApi {
  private ApiClient apiClient;

  public ServiceProviderConfigurationApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ServiceProviderConfigurationApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> getServiceProviderConfigResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getServiceProviderConfigResponseTypeMap.put(200, new GenericType<ServiceProviderConfig>(){});
    getServiceProviderConfigResponseTypeMap.put(401, new GenericType<Error>(){});
    getServiceProviderConfigResponseTypeMap.put(429, new GenericType<InlineResponse429>(){});
    getServiceProviderConfigResponseTypeMap.put(500, new GenericType<Error>(){});
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
   * Get service provider configuration.
   * Get service provider configuration, which describes the SCIM specification features available. See RFC 7644 section 4.
   * @return ServiceProviderConfig
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> User has not been authenticated. </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> User is accessing this API too frequently. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal server error. </td><td>  -  </td></tr>
     </table>
   */
  public ServiceProviderConfig getServiceProviderConfig() throws ApiException {
    return getServiceProviderConfigWithHttpInfo().getData();
  }

  /**
   * Get service provider configuration.
   * Get service provider configuration, which describes the SCIM specification features available. See RFC 7644 section 4.
   * @return ApiResponse&lt;ServiceProviderConfig&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> User has not been authenticated. </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> User is accessing this API too frequently. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal server error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ServiceProviderConfig> getServiceProviderConfigWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/ServiceProviderConfig";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/scim+json", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        ServiceProviderConfig
      
    > apiResponse = apiClient.invokeAPI("ServiceProviderConfigurationApi.getServiceProviderConfig", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getServiceProviderConfigResponseTypeMap, false);

    return apiResponse;

  }
}
