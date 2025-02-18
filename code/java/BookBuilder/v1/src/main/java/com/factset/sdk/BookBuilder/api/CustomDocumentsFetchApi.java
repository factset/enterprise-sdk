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


@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class CustomDocumentsFetchApi {
  private ApiClient apiClient;

  public CustomDocumentsFetchApi() {
    this(Configuration.getDefaultApiClient());
  }

  public CustomDocumentsFetchApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> getCustomUploadListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getCustomUploadListResponseTypeMap.put(200, new GenericType<java.util.List<Object>>(){});
    getCustomUploadListResponseTypeMap.put(401, new GenericType<String>(){});
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
   * Check out the documents uploaded before to use them in creating books
   * Retrieves the list of documents uploaded before using the endpoint \&quot;/upload-custom-document\&quot;. The documents uploaded are available for 30 days from the date of uploading.
   * @return java.util.List<Object>
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response contains file name, fileURL and the date and time the book was uploaded </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Missing or invalid authentication </td><td>  -  </td></tr>
     </table>
   */
  public java.util.List<Object> getCustomUploadList() throws ApiException {
    return getCustomUploadListWithHttpInfo().getData();
  }

  /**
   * Check out the documents uploaded before to use them in creating books
   * Retrieves the list of documents uploaded before using the endpoint \&quot;/upload-custom-document\&quot;. The documents uploaded are available for 30 days from the date of uploading.
   * @return ApiResponse&lt;java.util.List<Object>&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response contains file name, fileURL and the date and time the book was uploaded </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Missing or invalid authentication </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<java.util.List<Object>> getCustomUploadListWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/custom-upload-list";

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
        
        java.util.List<Object>
      
    > apiResponse = apiClient.invokeAPI("CustomDocumentsFetchApi.getCustomUploadList", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getCustomUploadListResponseTypeMap, false);

    return apiResponse;

  }
}
