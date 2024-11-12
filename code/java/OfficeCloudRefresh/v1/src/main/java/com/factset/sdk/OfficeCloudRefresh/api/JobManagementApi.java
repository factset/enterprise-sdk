package com.factset.sdk.OfficeCloudRefresh.api;

import com.factset.sdk.OfficeCloudRefresh.ApiException;
import com.factset.sdk.OfficeCloudRefresh.ApiClient;
import com.factset.sdk.OfficeCloudRefresh.ApiResponse;
import com.factset.sdk.OfficeCloudRefresh.Configuration;
import com.factset.sdk.OfficeCloudRefresh.Pair;

import jakarta.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.OfficeCloudRefresh.models.ActiveJobStatusList;
import com.factset.sdk.OfficeCloudRefresh.models.Errors;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class JobManagementApi {
  private ApiClient apiClient;

  public JobManagementApi() {
    this(Configuration.getDefaultApiClient());
  }

  public JobManagementApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> cancelActiveJobResponseTypeMap = new HashMap<Integer, GenericType>();

  private static final Map<Integer, GenericType> cancelAllActiveJobsResponseTypeMap = new HashMap<Integer, GenericType>();

  private static final Map<Integer, GenericType> getJobsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getJobsResponseTypeMap.put(200, new GenericType<ActiveJobStatusList>(){});
    getJobsResponseTypeMap.put(400, new GenericType<Errors>(){});
    getJobsResponseTypeMap.put(500, new GenericType<Errors>(){});
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
   * Cancel a job with the given resource ID
   * Cancel a specific job by the resource ID
   * @param id Unique identifier for the job (resource ID returned from FactSet). (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Server Error </td><td>  -  </td></tr>
     </table>
   */
  public void cancelActiveJob(java.util.UUID id) throws ApiException {
    cancelActiveJobWithHttpInfo(id);
  }

  /**
   * Cancel a job with the given resource ID
   * Cancel a specific job by the resource ID
   * @param id Unique identifier for the job (resource ID returned from FactSet). (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Server Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> cancelActiveJobWithHttpInfo(java.util.UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling cancelActiveJob");
    }
    
    // create path and map variables
    String localVarPath = "/jobs/{id}"
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
    > apiResponse = apiClient.invokeAPI("JobManagementApi.cancelActiveJob", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, cancelActiveJobResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Cancel all active jobs
   * Cancel all active (on_hold, queued, executing) jobs
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Server Error </td><td>  -  </td></tr>
     </table>
   */
  public void cancelAllActiveJobs() throws ApiException {
    cancelAllActiveJobsWithHttpInfo();
  }

  /**
   * Cancel all active jobs
   * Cancel all active (on_hold, queued, executing) jobs
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Server Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> cancelAllActiveJobsWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/jobs";

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
    > apiResponse = apiClient.invokeAPI("JobManagementApi.cancelAllActiveJobs", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, cancelAllActiveJobsResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Get information on all active jobs
   * Get the ids and status of all active jobs
   * @return ActiveJobStatusList
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  * X-Concurrent-Limit -  <br>  * X-Concurrent-Limit-Remaining -  <br>  * X-Weekly-Limit -  <br>  * X-Weekly-Limit-Remaining -  <br>  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Server Error </td><td>  -  </td></tr>
     </table>
   */
  public ActiveJobStatusList getJobs() throws ApiException {
    return getJobsWithHttpInfo().getData();
  }

  /**
   * Get information on all active jobs
   * Get the ids and status of all active jobs
   * @return ApiResponse&lt;ActiveJobStatusList&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  * X-Concurrent-Limit -  <br>  * X-Concurrent-Limit-Remaining -  <br>  * X-Weekly-Limit -  <br>  * X-Weekly-Limit-Remaining -  <br>  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Server Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ActiveJobStatusList> getJobsWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/jobs";

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
        
        ActiveJobStatusList
      
    > apiResponse = apiClient.invokeAPI("JobManagementApi.getJobs", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getJobsResponseTypeMap, false);

    return apiResponse;

  }
}
