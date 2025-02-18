package com.factset.sdk.BookBuilder.api;

import com.factset.sdk.BookBuilder.ApiException;
import com.factset.sdk.BookBuilder.ApiClient;
import com.factset.sdk.BookBuilder.ApiResponse;
import com.factset.sdk.BookBuilder.Configuration;
import com.factset.sdk.BookBuilder.Pair;

import jakarta.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.BookBuilder.models.TemplateInfo;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class TemplatesFetchApi {
  private ApiClient apiClient;

  public TemplatesFetchApi() {
    this(Configuration.getDefaultApiClient());
  }

  public TemplatesFetchApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> getTemplateListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getTemplateListResponseTypeMap.put(200, new GenericType<java.util.List<TemplateInfo>>(){});
    getTemplateListResponseTypeMap.put(401, new GenericType<String>(){});
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
   * Retrieves the list of templates that are available
   * A template is a predefined list of content to be compiled in a PDF. This end point works without any parameters and retrieves the list of templates available for the user. Templates need to defined/created in FactSet workstation.
   * @return java.util.List<TemplateInfo>
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response contains an array with template name, template ID, created date, template source and template type </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Missing or invalid authentication </td><td>  -  </td></tr>
     </table>
   */
  public java.util.List<TemplateInfo> getTemplateList() throws ApiException {
    return getTemplateListWithHttpInfo().getData();
  }

  /**
   * Retrieves the list of templates that are available
   * A template is a predefined list of content to be compiled in a PDF. This end point works without any parameters and retrieves the list of templates available for the user. Templates need to defined/created in FactSet workstation.
   * @return ApiResponse&lt;java.util.List<TemplateInfo>&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response contains an array with template name, template ID, created date, template source and template type </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Missing or invalid authentication </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<java.util.List<TemplateInfo>> getTemplateListWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/template-list";

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
        
        java.util.List<TemplateInfo>
      
    > apiResponse = apiClient.invokeAPI("TemplatesFetchApi.getTemplateList", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getTemplateListResponseTypeMap, false);

    return apiResponse;

  }
}
