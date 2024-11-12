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

import com.factset.sdk.OfficeCloudRefresh.models.Errors;
import java.io.File;
import com.factset.sdk.OfficeCloudRefresh.models.FileGroupInfo;
import com.factset.sdk.OfficeCloudRefresh.models.JobStatus;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class RefreshOperationsApi {
  private ApiClient apiClient;

  public RefreshOperationsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public RefreshOperationsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> getFileByIdResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getFileByIdResponseTypeMap.put(200, new GenericType<File>(){});
    getFileByIdResponseTypeMap.put(202, new GenericType<JobStatus>(){});
    getFileByIdResponseTypeMap.put(400, new GenericType<Errors>(){});
    getFileByIdResponseTypeMap.put(404, new GenericType<Errors>(){});
    getFileByIdResponseTypeMap.put(422, new GenericType<Errors>(){});
    getFileByIdResponseTypeMap.put(500, new GenericType<Errors>(){});
  }

  private static final Map<Integer, GenericType> getStatusByIdResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getStatusByIdResponseTypeMap.put(201, new GenericType<JobStatus>(){});
    getStatusByIdResponseTypeMap.put(202, new GenericType<JobStatus>(){});
    getStatusByIdResponseTypeMap.put(400, new GenericType<Errors>(){});
    getStatusByIdResponseTypeMap.put(404, new GenericType<Errors>(){});
    getStatusByIdResponseTypeMap.put(422, new GenericType<Errors>(){});
    getStatusByIdResponseTypeMap.put(500, new GenericType<Errors>(){});
  }

  private static final Map<Integer, GenericType> postWorkbookResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    postWorkbookResponseTypeMap.put(202, new GenericType<JobStatus>(){});
    postWorkbookResponseTypeMap.put(400, new GenericType<Errors>(){});
    postWorkbookResponseTypeMap.put(403, new GenericType<Errors>(){});
    postWorkbookResponseTypeMap.put(413, new GenericType<Errors>(){});
    postWorkbookResponseTypeMap.put(500, new GenericType<Errors>(){});
  }

  
 /**
   * Wrapper to support GET /refresh/{id} returning different types
   * per status code.
   *
   * <p>
   * Responses:
   * <ul>
   *   <li>200 : {@code File }<br>Expected response; body will contain calculated file</li>
   * 
   *   <li>202 : {@code JobStatus }<br>Accepted (resource not ready yet)</li>
   * </ul>
   *
   * <p>
   * Example:
   * <pre>{@code
   * GetFileByIdResponseWrapper response = ...;
   * switch (response.statusCode) {
   *   case 200:
   *     File data200 = response.getResponse200();
   *     break;
   *   case 202:
   *     JobStatus data202 = response.getResponse202();
   *     break;
   *  }
   * }</pre>
   */
  public static class GetFileByIdResponseWrapper {
    public final int statusCode;
    public final Object response;

    public GetFileByIdResponseWrapper(int statusCode, Object response) {
      this.statusCode = statusCode;
      this.response = response;
    }

    public int getStatusCode() { return statusCode; }
    public Object getResponse() { return response; }
    
    public File getResponse200() throws ApiException {
      if (this.statusCode != 200) {
        throw new ApiException(500, "Invalid response getter called. getResponse200 can't return a " + this.statusCode + " response");
      }
      return (File) this.response;
    }
    
    public JobStatus getResponse202() throws ApiException {
      if (this.statusCode != 202) {
        throw new ApiException(500, "Invalid response getter called. getResponse202 can't return a " + this.statusCode + " response");
      }
      return (JobStatus) this.response;
    }
    

    @Override
    public boolean equals(Object o) {
      if (this == o) {
        return true;
      }
      if (o == null || getClass() != o.getClass()) {
        return false;
      }
      GetFileByIdResponseWrapper other = (GetFileByIdResponseWrapper) o;
      return this.statusCode == other.statusCode &&
        Objects.equals(this.response, other.response);
    }

    @Override
    public int hashCode() {
      return Objects.hash(statusCode, response);
    }

    @Override
    public String toString() {
      return "class GetFileByIdResponseWrapper {\n"
       + "    statusCode: " + statusCode + "\n"
       + "    response: "
       + Objects.toString(response).replace("\n", "\n    ")
       + "\n}";
    }
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
   * Retrieve a calculated file by resource ID.
   * If the requested job is complete, the calculated file will be returned.
   * @param id Unique identifier for the job (resource ID returned from FactSet). (required)
   * @param deleteFile Delete the file from FactSet servers after completing the request. (optional, default to true)
   * @return GetFileByIdResponseWrapper
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Expected response; body will contain calculated file </td><td>  * Content-Disposition - Standard HTTP header. Content is expected to be displayed as an attachment. <br>  * Content-Type - Standard HTTP header. The file format type. <br>  * Transfer-Encoding - Standard HTTP header. Header value will be set to Chunked if Accept-Encoding header is specified. <br>  </td></tr>
       <tr><td> 202 </td><td> Accepted (resource not ready yet) </td><td>  * Location - Relative URL to check status of the request. <br>  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Failed to refresh file </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Server Error </td><td>  -  </td></tr>
     </table>
   */
  public GetFileByIdResponseWrapper getFileById(java.util.UUID id, Boolean deleteFile) throws ApiException {
    return getFileByIdWithHttpInfo(id, deleteFile).getData();
  }

  /**
   * Retrieve a calculated file by resource ID.
   * If the requested job is complete, the calculated file will be returned.
   * @param id Unique identifier for the job (resource ID returned from FactSet). (required)
   * @param deleteFile Delete the file from FactSet servers after completing the request. (optional, default to true)
   * @return ApiResponse&lt;GetFileByIdResponseWrapper&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Expected response; body will contain calculated file </td><td>  * Content-Disposition - Standard HTTP header. Content is expected to be displayed as an attachment. <br>  * Content-Type - Standard HTTP header. The file format type. <br>  * Transfer-Encoding - Standard HTTP header. Header value will be set to Chunked if Accept-Encoding header is specified. <br>  </td></tr>
       <tr><td> 202 </td><td> Accepted (resource not ready yet) </td><td>  * Location - Relative URL to check status of the request. <br>  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Failed to refresh file </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Server Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetFileByIdResponseWrapper> getFileByIdWithHttpInfo(java.util.UUID id, Boolean deleteFile) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getFileById");
    }
    
    // create path and map variables
    String localVarPath = "/refresh/{id}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "deleteFile", deleteFile));

    
    
    
    final String[] localVarAccepts = {
      "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        Object
        
      
    > apiResponse = apiClient.invokeAPI("RefreshOperationsApi.getFileById", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getFileByIdResponseTypeMap, false);

    int statusCode = apiResponse.getStatusCode();
    GetFileByIdResponseWrapper responseWrapper = new GetFileByIdResponseWrapper(
      statusCode,
      apiResponse.getData()
    );

    return new ApiResponse<GetFileByIdResponseWrapper>(statusCode, apiResponse.getHeaders(), responseWrapper);


  }
  /**
   * Get the status of the refresh job with the given resource ID
   * Check the status of the given job by the resource ID
   * @param id Unique identifier for the job (resource ID returned from FactSet). (required)
   * @return JobStatus
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Created (the calculated workbook is ready to be retrieved) </td><td>  * Location - Relative URL to check status of the request. <br>  </td></tr>
       <tr><td> 202 </td><td> Accepted (resource not ready yet) </td><td>  * Location - Relative URL to check status of the request. <br>  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Failed to refresh file </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Server Error </td><td>  -  </td></tr>
     </table>
   */
  public JobStatus getStatusById(java.util.UUID id) throws ApiException {
    return getStatusByIdWithHttpInfo(id).getData();
  }

  /**
   * Get the status of the refresh job with the given resource ID
   * Check the status of the given job by the resource ID
   * @param id Unique identifier for the job (resource ID returned from FactSet). (required)
   * @return ApiResponse&lt;JobStatus&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Created (the calculated workbook is ready to be retrieved) </td><td>  * Location - Relative URL to check status of the request. <br>  </td></tr>
       <tr><td> 202 </td><td> Accepted (resource not ready yet) </td><td>  * Location - Relative URL to check status of the request. <br>  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Failed to refresh file </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Server Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<JobStatus> getStatusByIdWithHttpInfo(java.util.UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getStatusById");
    }
    
    // create path and map variables
    String localVarPath = "/refresh/{id}/status"
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
        
        JobStatus
      
    > apiResponse = apiClient.invokeAPI("RefreshOperationsApi.getStatusById", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getStatusByIdResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Refresh a spreadsheet file
   * Start refreshing a spreadsheet file (in the Open Office XML format).
   * @param body  (required)
   * @param nowHandlingEnabled Return \\#VALUE for &#x3D;FDS codes dependent on NOW(). Default is true. For more information on volatile code handling, see Online Assistant https://my.apps.factset.com/oa/pages/16118. (optional)
   * @param refreshAutoFilters Option to refresh &#x3D;FDS codes within autofilters.  Codes that are filtered out will not be refreshed, unless this option is set to true.  Default is true.  For more information, see Online Assistant https://my.apps.factset.com/oa/pages/21084#fds (optional)
   * @param resizeArrays Option to allow automatic array-resizing, which allows you to return a time series of data without manually setting an array.  Default is true.  For more information, see Online Assistant https://my.apps.factset.com/oa/pages/21084#fds (optional)
   * @return JobStatus
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Accepted </td><td>  * Location - Relative URL to check status of the request. <br>  * X-Concurrent-Limit -  <br>  * X-Concurrent-Limit-Remaining -  <br>  * X-Weekly-Limit -  <br>  * X-Weekly-Limit-Remaining -  <br>  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden. The user&#39;s subscription is missing required CACCESS. </td><td>  -  </td></tr>
       <tr><td> 413 </td><td> File Too Large.  Currently only accepting files up to 50MB. </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> Limit Exceeded </td><td>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Reset - Number of seconds remaining till rate limit resets. <br>  </td></tr>
       <tr><td> 500 </td><td> Server Error </td><td>  -  </td></tr>
     </table>
   */
  public JobStatus postWorkbook(File body, Boolean nowHandlingEnabled, Boolean refreshAutoFilters, Boolean resizeArrays) throws ApiException {
    return postWorkbookWithHttpInfo(body, nowHandlingEnabled, refreshAutoFilters, resizeArrays).getData();
  }

  /**
   * Refresh a spreadsheet file
   * Start refreshing a spreadsheet file (in the Open Office XML format).
   * @param body  (required)
   * @param nowHandlingEnabled Return \\#VALUE for &#x3D;FDS codes dependent on NOW(). Default is true. For more information on volatile code handling, see Online Assistant https://my.apps.factset.com/oa/pages/16118. (optional)
   * @param refreshAutoFilters Option to refresh &#x3D;FDS codes within autofilters.  Codes that are filtered out will not be refreshed, unless this option is set to true.  Default is true.  For more information, see Online Assistant https://my.apps.factset.com/oa/pages/21084#fds (optional)
   * @param resizeArrays Option to allow automatic array-resizing, which allows you to return a time series of data without manually setting an array.  Default is true.  For more information, see Online Assistant https://my.apps.factset.com/oa/pages/21084#fds (optional)
   * @return ApiResponse&lt;JobStatus&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Accepted </td><td>  * Location - Relative URL to check status of the request. <br>  * X-Concurrent-Limit -  <br>  * X-Concurrent-Limit-Remaining -  <br>  * X-Weekly-Limit -  <br>  * X-Weekly-Limit-Remaining -  <br>  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden. The user&#39;s subscription is missing required CACCESS. </td><td>  -  </td></tr>
       <tr><td> 413 </td><td> File Too Large.  Currently only accepting files up to 50MB. </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> Limit Exceeded </td><td>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Reset - Number of seconds remaining till rate limit resets. <br>  </td></tr>
       <tr><td> 500 </td><td> Server Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<JobStatus> postWorkbookWithHttpInfo(File body, Boolean nowHandlingEnabled, Boolean refreshAutoFilters, Boolean resizeArrays) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling postWorkbook");
    }
    
    // create path and map variables
    String localVarPath = "/refresh/calculate";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "nowHandlingEnabled", nowHandlingEnabled));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "refreshAutoFilters", refreshAutoFilters));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "resizeArrays", resizeArrays));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet", "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        JobStatus
      
    > apiResponse = apiClient.invokeAPI("RefreshOperationsApi.postWorkbook", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, postWorkbookResponseTypeMap, false);

    return apiResponse;

  }
}
