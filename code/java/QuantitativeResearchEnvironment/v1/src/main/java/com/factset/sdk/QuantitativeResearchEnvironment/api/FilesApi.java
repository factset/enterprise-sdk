package com.factset.sdk.QuantitativeResearchEnvironment.api;

import com.factset.sdk.QuantitativeResearchEnvironment.ApiException;
import com.factset.sdk.QuantitativeResearchEnvironment.ApiClient;
import com.factset.sdk.QuantitativeResearchEnvironment.ApiResponse;
import com.factset.sdk.QuantitativeResearchEnvironment.Configuration;
import com.factset.sdk.QuantitativeResearchEnvironment.Pair;

import javax.ws.rs.core.GenericType;

import java.io.File;
import com.factset.sdk.QuantitativeResearchEnvironment.models.FileUploadStatus;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class FilesApi {
  private ApiClient apiClient;

  public FilesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public FilesApi(ApiClient apiClient) {
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
   * Starts a file upload
   * This endpoint takes a file and uploads it
   * @param server The server to upload the file to. Either &#x60;interactive&#x60; or &#x60;batch&#x60;. (required)
   * @param file The file name to upload the file to. Existing directory can be specified. (required)
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
  public FileUploadStatus analyticsQuantQreV1FilesServerFilePost(String server, String file, File body) throws ApiException {
    return analyticsQuantQreV1FilesServerFilePostWithHttpInfo(server, file, body).getData();
  }

  /**
   * Starts a file upload
   * This endpoint takes a file and uploads it
   * @param server The server to upload the file to. Either &#x60;interactive&#x60; or &#x60;batch&#x60;. (required)
   * @param file The file name to upload the file to. Existing directory can be specified. (required)
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
  public ApiResponse<FileUploadStatus> analyticsQuantQreV1FilesServerFilePostWithHttpInfo(String server, String file, File body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'server' is set
    if (server == null) {
      throw new ApiException(400, "Missing the required parameter 'server' when calling analyticsQuantQreV1FilesServerFilePost");
    }
    
    // verify the required parameter 'file' is set
    if (file == null) {
      throw new ApiException(400, "Missing the required parameter 'file' when calling analyticsQuantQreV1FilesServerFilePost");
    }
    
    // create path and map variables
    String localVarPath = "/analytics/quant/qre/v1/files/{server}/{file}"
      .replaceAll("\\{" + "server" + "\\}", apiClient.escapeString(server.toString()))
      .replaceAll("\\{" + "file" + "\\}", apiClient.escapeString(file.toString()));

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

    GenericType<FileUploadStatus> localVarReturnType = new GenericType<FileUploadStatus>() {};

    return apiClient.invokeAPI("FilesApi.analyticsQuantQreV1FilesServerFilePost", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
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
  public FileUploadStatus analyticsQuantQreV1FilesUploadsIdGet(String id) throws ApiException {
    return analyticsQuantQreV1FilesUploadsIdGetWithHttpInfo(id).getData();
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
  public ApiResponse<FileUploadStatus> analyticsQuantQreV1FilesUploadsIdGetWithHttpInfo(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling analyticsQuantQreV1FilesUploadsIdGet");
    }
    
    // create path and map variables
    String localVarPath = "/analytics/quant/qre/v1/files/uploads/{id}"
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

    GenericType<FileUploadStatus> localVarReturnType = new GenericType<FileUploadStatus>() {};

    return apiClient.invokeAPI("FilesApi.analyticsQuantQreV1FilesUploadsIdGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
