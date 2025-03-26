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
import com.factset.sdk.ProcuretoPayAPISCIM.models.FileManagerAuditItem;
import com.factset.sdk.ProcuretoPayAPISCIM.models.InlineResponse429;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class FileManagerAuditApi {
  private ApiClient apiClient;

  public FileManagerAuditApi() {
    this(Configuration.getDefaultApiClient());
  }

  public FileManagerAuditApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> getFileManagerAuditResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getFileManagerAuditResponseTypeMap.put(200, new GenericType<java.util.List<FileManagerAuditItem>>(){});
    getFileManagerAuditResponseTypeMap.put(401, new GenericType<Error>(){});
    getFileManagerAuditResponseTypeMap.put(403, new GenericType<Error>(){});
    getFileManagerAuditResponseTypeMap.put(429, new GenericType<InlineResponse429>(){});
    getFileManagerAuditResponseTypeMap.put(500, new GenericType<Error>(){});
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
   * Get File Manager audit data.
   * Get a list of File Manager file paths and associated information, such as user permissions.
   * @return java.util.List<FileManagerAuditItem>
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> User has not been authenticated. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> User is not authorized to use this API. </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> User is accessing this API too frequently. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal server error. </td><td>  -  </td></tr>
     </table>
   */
  public java.util.List<FileManagerAuditItem> getFileManagerAudit() throws ApiException {
    return getFileManagerAuditWithHttpInfo().getData();
  }

  /**
   * Get File Manager audit data.
   * Get a list of File Manager file paths and associated information, such as user permissions.
   * @return ApiResponse&lt;java.util.List<FileManagerAuditItem>&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> User has not been authenticated. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> User is not authorized to use this API. </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> User is accessing this API too frequently. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal server error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<java.util.List<FileManagerAuditItem>> getFileManagerAuditWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/FileManagerAudit";

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
        
        java.util.List<FileManagerAuditItem>
      
    > apiResponse = apiClient.invokeAPI("FileManagerAuditApi.getFileManagerAudit", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getFileManagerAuditResponseTypeMap, false);

    return apiResponse;

  }
}
