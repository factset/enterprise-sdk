package com.factset.sdk.IRNNotes.api;

import com.factset.sdk.IRNNotes.ApiException;
import com.factset.sdk.IRNNotes.ApiClient;
import com.factset.sdk.IRNNotes.ApiResponse;
import com.factset.sdk.IRNNotes.Configuration;
import com.factset.sdk.IRNNotes.Pair;

import jakarta.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.IRNNotes.models.AttachmentSummaryDto;
import java.io.File;
import com.factset.sdk.IRNNotes.models.NewItemDto;
import com.factset.sdk.IRNNotes.models.ProblemDetails;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class AttachmentsApi {
  private ApiClient apiClient;

  public AttachmentsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AttachmentsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> createAttachmentResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    createAttachmentResponseTypeMap.put(201, new GenericType<NewItemDto>(){});
    createAttachmentResponseTypeMap.put(400, new GenericType<ProblemDetails>(){});
    createAttachmentResponseTypeMap.put(0, new GenericType<ProblemDetails>(){});
  }

  private static final Map<Integer, GenericType> downloadAttachmentResponseTypeMap = new HashMap<Integer, GenericType>();

  private static final Map<Integer, GenericType> getAttachmentsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getAttachmentsResponseTypeMap.put(200, new GenericType<java.util.List<AttachmentSummaryDto>>(){});
    getAttachmentsResponseTypeMap.put(404, new GenericType<ProblemDetails>(){});
    getAttachmentsResponseTypeMap.put(0, new GenericType<ProblemDetails>(){});
  }

  private static final Map<Integer, GenericType> softDeleteNoteAttachmentResponseTypeMap = new HashMap<Integer, GenericType>();

  


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
   * Create an attachment for an existing note
   * 
   * @param noteId  (required)
   * @param _file  (required)
   * @return NewItemDto
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
     </table>
   */
  public NewItemDto createAttachment(java.util.UUID noteId, File _file) throws ApiException {
    return createAttachmentWithHttpInfo(noteId, _file).getData();
  }

  /**
   * Create an attachment for an existing note
   * 
   * @param noteId  (required)
   * @param _file  (required)
   * @return ApiResponse&lt;NewItemDto&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<NewItemDto> createAttachmentWithHttpInfo(java.util.UUID noteId, File _file) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'noteId' is set
    if (noteId == null) {
      throw new ApiException(400, "Missing the required parameter 'noteId' when calling createAttachment");
    }
    
    // verify the required parameter '_file' is set
    if (_file == null) {
      throw new ApiException(400, "Missing the required parameter '_file' when calling createAttachment");
    }
    
    // create path and map variables
    String localVarPath = "/notes/{noteId}/attachments"
      .replaceAll("\\{" + "noteId" + "\\}", apiClient.escapeString(noteId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();


    
    
    if (_file != null)
      localVarFormParams.put("file", _file);

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "multipart/form-data"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        NewItemDto
      
    > apiResponse = apiClient.invokeAPI("AttachmentsApi.createAttachment", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, createAttachmentResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Download an attachment from a Note
   * 
   * @param noteId  (required)
   * @param attachmentId  (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
   */
  public void downloadAttachment(java.util.UUID noteId, java.util.UUID attachmentId) throws ApiException {
    downloadAttachmentWithHttpInfo(noteId, attachmentId);
  }

  /**
   * Download an attachment from a Note
   * 
   * @param noteId  (required)
   * @param attachmentId  (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> downloadAttachmentWithHttpInfo(java.util.UUID noteId, java.util.UUID attachmentId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'noteId' is set
    if (noteId == null) {
      throw new ApiException(400, "Missing the required parameter 'noteId' when calling downloadAttachment");
    }
    
    // verify the required parameter 'attachmentId' is set
    if (attachmentId == null) {
      throw new ApiException(400, "Missing the required parameter 'attachmentId' when calling downloadAttachment");
    }
    
    // create path and map variables
    String localVarPath = "/notes/{noteId}/attachments/{attachmentId}/download"
      .replaceAll("\\{" + "noteId" + "\\}", apiClient.escapeString(noteId.toString()))
      .replaceAll("\\{" + "attachmentId" + "\\}", apiClient.escapeString(attachmentId.toString()));

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
    > apiResponse = apiClient.invokeAPI("AttachmentsApi.downloadAttachment", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, downloadAttachmentResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Get all the attachments belonging to a note
   * 
   * @param noteId Note Id (required)
   * @return java.util.List<AttachmentSummaryDto>
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
     </table>
   */
  public java.util.List<AttachmentSummaryDto> getAttachments(java.util.UUID noteId) throws ApiException {
    return getAttachmentsWithHttpInfo(noteId).getData();
  }

  /**
   * Get all the attachments belonging to a note
   * 
   * @param noteId Note Id (required)
   * @return ApiResponse&lt;java.util.List<AttachmentSummaryDto>&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<java.util.List<AttachmentSummaryDto>> getAttachmentsWithHttpInfo(java.util.UUID noteId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'noteId' is set
    if (noteId == null) {
      throw new ApiException(400, "Missing the required parameter 'noteId' when calling getAttachments");
    }
    
    // create path and map variables
    String localVarPath = "/notes/{noteId}/attachments"
      .replaceAll("\\{" + "noteId" + "\\}", apiClient.escapeString(noteId.toString()));

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
        
        java.util.List<AttachmentSummaryDto>
      
    > apiResponse = apiClient.invokeAPI("AttachmentsApi.getAttachments", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getAttachmentsResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Delete attachment from note
   * 
   * @param noteId Note Id (required)
   * @param attachmentId Attachment Id (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
   */
  public void softDeleteNoteAttachment(java.util.UUID noteId, java.util.UUID attachmentId) throws ApiException {
    softDeleteNoteAttachmentWithHttpInfo(noteId, attachmentId);
  }

  /**
   * Delete attachment from note
   * 
   * @param noteId Note Id (required)
   * @param attachmentId Attachment Id (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> softDeleteNoteAttachmentWithHttpInfo(java.util.UUID noteId, java.util.UUID attachmentId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'noteId' is set
    if (noteId == null) {
      throw new ApiException(400, "Missing the required parameter 'noteId' when calling softDeleteNoteAttachment");
    }
    
    // verify the required parameter 'attachmentId' is set
    if (attachmentId == null) {
      throw new ApiException(400, "Missing the required parameter 'attachmentId' when calling softDeleteNoteAttachment");
    }
    
    // create path and map variables
    String localVarPath = "/notes/{noteId}/attachments/{attachmentId}"
      .replaceAll("\\{" + "noteId" + "\\}", apiClient.escapeString(noteId.toString()))
      .replaceAll("\\{" + "attachmentId" + "\\}", apiClient.escapeString(attachmentId.toString()));

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
    > apiResponse = apiClient.invokeAPI("AttachmentsApi.softDeleteNoteAttachment", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, softDeleteNoteAttachmentResponseTypeMap, false);

    return apiResponse;

  }
}
