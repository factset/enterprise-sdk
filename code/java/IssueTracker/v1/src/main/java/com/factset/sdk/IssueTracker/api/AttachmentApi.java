package com.factset.sdk.IssueTracker.api;

import com.factset.sdk.IssueTracker.ApiException;
import com.factset.sdk.IssueTracker.ApiClient;
import com.factset.sdk.IssueTracker.ApiResponse;
import com.factset.sdk.IssueTracker.Configuration;
import com.factset.sdk.IssueTracker.Pair;

import jakarta.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.IssueTracker.models.AttachmentResponse;
import com.factset.sdk.IssueTracker.models.ErrorResponse;
import java.io.File;
import com.factset.sdk.IssueTracker.models.FileExtension;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class AttachmentApi {
  private ApiClient apiClient;

  public AttachmentApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AttachmentApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> getFileAttachmentResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getFileAttachmentResponseTypeMap.put(200, new GenericType<File>(){});
    getFileAttachmentResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getFileAttachmentResponseTypeMap.put(401, new GenericType<String>(){});
    getFileAttachmentResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getFileAttachmentResponseTypeMap.put(404, new GenericType<ErrorResponse>(){});
    getFileAttachmentResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> getFileExtensionsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getFileExtensionsResponseTypeMap.put(200, new GenericType<FileExtension>(){});
    getFileExtensionsResponseTypeMap.put(404, new GenericType<ErrorResponse>(){});
    getFileExtensionsResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> postFileAttachmentResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    postFileAttachmentResponseTypeMap.put(201, new GenericType<AttachmentResponse>(){});
    postFileAttachmentResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    postFileAttachmentResponseTypeMap.put(401, new GenericType<String>(){});
    postFileAttachmentResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    postFileAttachmentResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
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
   * get the matched file attachment
   * It retreive matched file. However, File read won&#39;t work until it used in any issue tracker issue/comment.     Note: the Accept header gets ignored and the originally uploaded content-type is returned
   * @param id identity value of file attachment (required)
   * @param name name of the file (required)
   * @return File
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public File getFileAttachment(String id, String name) throws ApiException {
    return getFileAttachmentWithHttpInfo(id, name).getData();
  }

  /**
   * get the matched file attachment
   * It retreive matched file. However, File read won&#39;t work until it used in any issue tracker issue/comment.     Note: the Accept header gets ignored and the originally uploaded content-type is returned
   * @param id identity value of file attachment (required)
   * @param name name of the file (required)
   * @return ApiResponse&lt;File&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<File> getFileAttachmentWithHttpInfo(String id, String name) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getFileAttachment");
    }
    
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling getFileAttachment");
    }
    
    // create path and map variables
    String localVarPath = "/attachments/{id}/{name}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()))
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "image/bmp", "image/png", "image/gif", "image/jpeg", "application/pdf", "text/csv", "application/vnd.openxmlformats-officedocument.wordprocessingml.document", "text/plain", "application/vnd.ms-excel", "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet", "text/x-r-source", "application/x-dosexec", "text/html", "application/xml", "application/sql", "application/vnd.ms-officetheme", "application/msword", "application/vnd.openxmlformats-officedocument.wordprocessingml.template", "application/vnd.openxmlformats-officedocument.presentationml.template", "application/vnd.ms-powerpoint", "application/vnd.openxmlformats-officedocument.presentationml.presentation", "application/zip", "application/x-7z-compressed", "application/octet-stream", "text/tab-separated-values", "application/x-iwork-keynote", "application/vnd.ms-word.document.macroEnabled.12", "application/vnd.ms-word.template.macroEnabled.12", "application/vnd.ms-excel.sheet.macroEnabled.12", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        File
      
    > apiResponse = apiClient.invokeAPI("AttachmentApi.getFileAttachment", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getFileAttachmentResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Allowed file types GET endpoint
   * This will provide information about file extensions allowed to attachments.
   * @return FileExtension
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public FileExtension getFileExtensions() throws ApiException {
    return getFileExtensionsWithHttpInfo().getData();
  }

  /**
   * Allowed file types GET endpoint
   * This will provide information about file extensions allowed to attachments.
   * @return ApiResponse&lt;FileExtension&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<FileExtension> getFileExtensionsWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/attachments/file-extensions";

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
        
        FileExtension
      
    > apiResponse = apiClient.invokeAPI("AttachmentApi.getFileExtensions", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getFileExtensionsResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Post file attachment to Issue Tracker Issue or comment
   *   This endpoint upload file attachments into Issue Tracker and it allows only single file at a time. It will throws error when tries to upload multiple files in single call.     File size should not exceed 10Mb. More info provided in examples. It allows only few type of files for attachments. Please review \&quot;attachments/file-extensions\&quot; endpoint for list allowed file types.
   * @param _file input file for upload (required)
   * @return AttachmentResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public AttachmentResponse postFileAttachment(File _file) throws ApiException {
    return postFileAttachmentWithHttpInfo(_file).getData();
  }

  /**
   * Post file attachment to Issue Tracker Issue or comment
   *   This endpoint upload file attachments into Issue Tracker and it allows only single file at a time. It will throws error when tries to upload multiple files in single call.     File size should not exceed 10Mb. More info provided in examples. It allows only few type of files for attachments. Please review \&quot;attachments/file-extensions\&quot; endpoint for list allowed file types.
   * @param _file input file for upload (required)
   * @return ApiResponse&lt;AttachmentResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AttachmentResponse> postFileAttachmentWithHttpInfo(File _file) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter '_file' is set
    if (_file == null) {
      throw new ApiException(400, "Missing the required parameter '_file' when calling postFileAttachment");
    }
    
    // create path and map variables
    String localVarPath = "/attachments";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();


    
    
    if (_file != null)
      localVarFormParams.put("file", _file);

    final String[] localVarAccepts = {
      "application/json", "text/plain"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "multipart/form-data"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        AttachmentResponse
      
    > apiResponse = apiClient.invokeAPI("AttachmentApi.postFileAttachment", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, postFileAttachmentResponseTypeMap, false);

    return apiResponse;

  }
}
