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

import com.factset.sdk.BookBuilder.models.CreateTemplatePostRequest;
import com.factset.sdk.BookBuilder.models.EnableTemplateInfoPost;
import com.factset.sdk.BookBuilder.models.InvalidTemplateRequest;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class TemplatesCreationApi {
  private ApiClient apiClient;

  public TemplatesCreationApi() {
    this(Configuration.getDefaultApiClient());
  }

  public TemplatesCreationApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> createTemplateResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    createTemplateResponseTypeMap.put(200, new GenericType<EnableTemplateInfoPost>(){});
    createTemplateResponseTypeMap.put(400, new GenericType<InvalidTemplateRequest>(){});
    createTemplateResponseTypeMap.put(401, new GenericType<String>(){});
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
   * Kick off request to create template with reports of your choice
   * This end point retrieves template name and template_id of the template you create. All the book options such as name of the template, type, and reports can be specified in the request body. Please refer to the documentation for valid section ids and report ids.
   * @param createTemplatePostRequest  (required)
   * @return EnableTemplateInfoPost
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response contains book name and book ID </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Invalid template type/section_id/report_id </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Missing or invalid authentication </td><td>  -  </td></tr>
     </table>
   */
  public EnableTemplateInfoPost createTemplate(CreateTemplatePostRequest createTemplatePostRequest) throws ApiException {
    return createTemplateWithHttpInfo(createTemplatePostRequest).getData();
  }

  /**
   * Kick off request to create template with reports of your choice
   * This end point retrieves template name and template_id of the template you create. All the book options such as name of the template, type, and reports can be specified in the request body. Please refer to the documentation for valid section ids and report ids.
   * @param createTemplatePostRequest  (required)
   * @return ApiResponse&lt;EnableTemplateInfoPost&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response contains book name and book ID </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Invalid template type/section_id/report_id </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Missing or invalid authentication </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<EnableTemplateInfoPost> createTemplateWithHttpInfo(CreateTemplatePostRequest createTemplatePostRequest) throws ApiException {
    Object localVarPostBody = createTemplatePostRequest;
    
    // verify the required parameter 'createTemplatePostRequest' is set
    if (createTemplatePostRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'createTemplatePostRequest' when calling createTemplate");
    }
    
    // create path and map variables
    String localVarPath = "/create-template";

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
        
        EnableTemplateInfoPost
      
    > apiResponse = apiClient.invokeAPI("TemplatesCreationApi.createTemplate", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, createTemplateResponseTypeMap, false);

    return apiResponse;

  }
}
