package com.factset.sdk.UniversalScreening.api;

import com.factset.sdk.UniversalScreening.ApiException;
import com.factset.sdk.UniversalScreening.ApiClient;
import com.factset.sdk.UniversalScreening.ApiResponse;
import com.factset.sdk.UniversalScreening.Configuration;
import com.factset.sdk.UniversalScreening.Pair;

import javax.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.UniversalScreening.models.ActiveJobsData;
import com.factset.sdk.UniversalScreening.models.ErrorArray;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class JobManagementApi {
  private ApiClient apiClient;

  public JobManagementApi() {
    this(Configuration.getDefaultApiClient());
  }

  public JobManagementApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> deleteActiveJobResponseTypeMap = new HashMap<Integer, GenericType>();

  private static final Map<Integer, GenericType> deleteAllActiveJobsResponseTypeMap = new HashMap<Integer, GenericType>();

  private static final Map<Integer, GenericType> getAllActiveJobsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getAllActiveJobsResponseTypeMap.put(200, new GenericType<ActiveJobsData>(){});
    getAllActiveJobsResponseTypeMap.put(401, new GenericType<ErrorArray>(){});
    getAllActiveJobsResponseTypeMap.put(404, new GenericType<ErrorArray>(){});
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
   * 
   * Delete a specified job started by the requester&#39;s username-serial
   * @param id Unique identifier for a screen calculation job (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> No content </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Invalid or missing authentication. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Job ID not found. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  * Request-Key - Provide this key when reporting this issue <br>  </td></tr>
     </table>
   */
  public void deleteActiveJob(String id) throws ApiException {
    deleteActiveJobWithHttpInfo(id);
  }

  /**
   * 
   * Delete a specified job started by the requester&#39;s username-serial
   * @param id Unique identifier for a screen calculation job (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> No content </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Invalid or missing authentication. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Job ID not found. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  * Request-Key - Provide this key when reporting this issue <br>  </td></tr>
     </table>
   */
  public ApiResponse<Void> deleteActiveJobWithHttpInfo(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteActiveJob");
    }
    
    // create path and map variables
    String localVarPath = "/v2/job/{id}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

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
      Void
    > apiResponse = apiClient.invokeAPI("JobManagementApi.deleteActiveJob", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, deleteActiveJobResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * 
   * Delete all active jobs started by the requester&#39;s username-serial
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Invalid or missing authentication. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Job ID not found. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  * Request-Key - Provide this key when reporting this issue <br>  </td></tr>
     </table>
   */
  public void deleteAllActiveJobs() throws ApiException {
    deleteAllActiveJobsWithHttpInfo();
  }

  /**
   * 
   * Delete all active jobs started by the requester&#39;s username-serial
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Invalid or missing authentication. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Job ID not found. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  * Request-Key - Provide this key when reporting this issue <br>  </td></tr>
     </table>
   */
  public ApiResponse<Void> deleteAllActiveJobsWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/v2/jobs";

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
      Void
    > apiResponse = apiClient.invokeAPI("JobManagementApi.deleteAllActiveJobs", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, deleteAllActiveJobsResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * 
   * Retrieve list of all active job ids started by requester&#39;s username-serial
   * @return ActiveJobsData
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> ActiveJobsResponse contains id of all of a user&#39;s active jobs </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Invalid or missing authentication. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Job ID not found. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  * Request-Key - Provide this key when reporting this issue <br>  </td></tr>
     </table>
   */
  public ActiveJobsData getAllActiveJobs() throws ApiException {
    return getAllActiveJobsWithHttpInfo().getData();
  }

  /**
   * 
   * Retrieve list of all active job ids started by requester&#39;s username-serial
   * @return ApiResponse&lt;ActiveJobsData&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> ActiveJobsResponse contains id of all of a user&#39;s active jobs </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Invalid or missing authentication. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Job ID not found. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  * Request-Key - Provide this key when reporting this issue <br>  </td></tr>
     </table>
   */
  public ApiResponse<ActiveJobsData> getAllActiveJobsWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/v2/jobs";

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
        
        ActiveJobsData
      
    > apiResponse = apiClient.invokeAPI("JobManagementApi.getAllActiveJobs", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getAllActiveJobsResponseTypeMap, false);

    return apiResponse;

  }
}
