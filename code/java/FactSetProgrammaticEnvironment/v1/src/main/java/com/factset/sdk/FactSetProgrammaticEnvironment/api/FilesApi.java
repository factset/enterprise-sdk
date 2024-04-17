package com.factset.sdk.FactSetProgrammaticEnvironment.api;

import com.factset.sdk.FactSetProgrammaticEnvironment.ApiException;
import com.factset.sdk.FactSetProgrammaticEnvironment.ApiClient;
import com.factset.sdk.FactSetProgrammaticEnvironment.ApiResponse;
import com.factset.sdk.FactSetProgrammaticEnvironment.Configuration;
import com.factset.sdk.FactSetProgrammaticEnvironment.Pair;

import jakarta.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import java.io.File;
import com.factset.sdk.FactSetProgrammaticEnvironment.models.FileUploadStatus;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class FilesApi {
  private ApiClient apiClient;

  public FilesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public FilesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> analyticsQuantFpeV1FilesServerFilePostResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    analyticsQuantFpeV1FilesServerFilePostResponseTypeMap.put(202, new GenericType<FileUploadStatus>(){});
  }

  private static final Map<Integer, GenericType> analyticsQuantFpeV1FilesUploadsIdGetResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    analyticsQuantFpeV1FilesUploadsIdGetResponseTypeMap.put(200, new GenericType<FileUploadStatus>(){});
    analyticsQuantFpeV1FilesUploadsIdGetResponseTypeMap.put(202, new GenericType<FileUploadStatus>(){});
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
   * Starts a file upload
   * This endpoint takes a file and uploads it
   * @param server The server to upload the file to. Either &#x60;interactive&#x60; or &#x60;batch&#x60;. (required)
   * @param _file The file name to upload the file to. Existing directory can be specified. (required)
   * @param body  (optional)
   * @return FileUploadStatus
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Expected response, contains the relative URL in the Location header to check the status of the upload. </td><td>  * Location - Relative URL to check status of the request. <br>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
       <tr><td> 500 </td><td> Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
       <tr><td> 503 </td><td> Request timeout. Retry the request later </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
     </table>
   */
  public FileUploadStatus analyticsQuantFpeV1FilesServerFilePost(String server, String _file, File body) throws ApiException {
    return analyticsQuantFpeV1FilesServerFilePostWithHttpInfo(server, _file, body).getData();
  }

  /**
   * Starts a file upload
   * This endpoint takes a file and uploads it
   * @param server The server to upload the file to. Either &#x60;interactive&#x60; or &#x60;batch&#x60;. (required)
   * @param _file The file name to upload the file to. Existing directory can be specified. (required)
   * @param body  (optional)
   * @return ApiResponse&lt;FileUploadStatus&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Expected response, contains the relative URL in the Location header to check the status of the upload. </td><td>  * Location - Relative URL to check status of the request. <br>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
       <tr><td> 500 </td><td> Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
       <tr><td> 503 </td><td> Request timeout. Retry the request later </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
     </table>
   */
  public ApiResponse<FileUploadStatus> analyticsQuantFpeV1FilesServerFilePostWithHttpInfo(String server, String _file, File body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'server' is set
    if (server == null) {
      throw new ApiException(400, "Missing the required parameter 'server' when calling analyticsQuantFpeV1FilesServerFilePost");
    }
    
    // verify the required parameter '_file' is set
    if (_file == null) {
      throw new ApiException(400, "Missing the required parameter '_file' when calling analyticsQuantFpeV1FilesServerFilePost");
    }
    
    // create path and map variables
    String localVarPath = "/analytics/quant/fpe/v1/files/{server}/{file}"
      .replaceAll("\\{" + "server" + "\\}", apiClient.escapeString(server.toString()))
      .replaceAll("\\{" + "file" + "\\}", apiClient.escapeString(_file.toString()));

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
      "*"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        FileUploadStatus
      
    > apiResponse = apiClient.invokeAPI("FilesApi.analyticsQuantFpeV1FilesServerFilePost", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, analyticsQuantFpeV1FilesServerFilePostResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Get upload status by id
   * This is the endpoint to check on the progress of a previous upload request.
   * @param id From url, provided by location header or response body in the upload start endpoint (required)
   * @return FileUploadStatus
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Expected response. Signals that the upload is finished. </td><td>  * Location - Relative URL to check status of the request. <br>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
       <tr><td> 202 </td><td> Expected response. Signals that the upload is still in progress. </td><td>  * Location - Relative URL to check status of the request. <br>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
       <tr><td> 500 </td><td> Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
       <tr><td> 503 </td><td> Request timeout. Retry the request later </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
     </table>
   */
  public FileUploadStatus analyticsQuantFpeV1FilesUploadsIdGet(String id) throws ApiException {
    return analyticsQuantFpeV1FilesUploadsIdGetWithHttpInfo(id).getData();
  }

  /**
   * Get upload status by id
   * This is the endpoint to check on the progress of a previous upload request.
   * @param id From url, provided by location header or response body in the upload start endpoint (required)
   * @return ApiResponse&lt;FileUploadStatus&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Expected response. Signals that the upload is finished. </td><td>  * Location - Relative URL to check status of the request. <br>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
       <tr><td> 202 </td><td> Expected response. Signals that the upload is still in progress. </td><td>  * Location - Relative URL to check status of the request. <br>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
       <tr><td> 500 </td><td> Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
       <tr><td> 503 </td><td> Request timeout. Retry the request later </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
     </table>
   */
  public ApiResponse<FileUploadStatus> analyticsQuantFpeV1FilesUploadsIdGetWithHttpInfo(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling analyticsQuantFpeV1FilesUploadsIdGet");
    }
    
    // create path and map variables
    String localVarPath = "/analytics/quant/fpe/v1/files/uploads/{id}"
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
        
        FileUploadStatus
      
    > apiResponse = apiClient.invokeAPI("FilesApi.analyticsQuantFpeV1FilesUploadsIdGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, analyticsQuantFpeV1FilesUploadsIdGetResponseTypeMap, false);

    return apiResponse;

  }
}
