package com.factset.sdk.IRNMeetings.api;

import com.factset.sdk.IRNMeetings.ApiException;
import com.factset.sdk.IRNMeetings.ApiClient;
import com.factset.sdk.IRNMeetings.ApiResponse;
import com.factset.sdk.IRNMeetings.Configuration;
import com.factset.sdk.IRNMeetings.Pair;

import jakarta.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.IRNMeetings.models.AttachmentSummaryDto;
import com.factset.sdk.IRNMeetings.models.CommentDto;
import com.factset.sdk.IRNMeetings.models.CommentSummaryDto;
import com.factset.sdk.IRNMeetings.models.CreateCommentDto;
import java.io.File;
import com.factset.sdk.IRNMeetings.models.NewItemDto;
import com.factset.sdk.IRNMeetings.models.Operation;
import com.factset.sdk.IRNMeetings.models.ProblemDetails;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class CommentsApi {
  private ApiClient apiClient;

  public CommentsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public CommentsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> createCommentResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    createCommentResponseTypeMap.put(201, new GenericType<NewItemDto>(){});
    createCommentResponseTypeMap.put(400, new GenericType<ProblemDetails>(){});
    createCommentResponseTypeMap.put(403, new GenericType<ProblemDetails>(){});
    createCommentResponseTypeMap.put(404, new GenericType<ProblemDetails>(){});
  }

  private static final Map<Integer, GenericType> createCommentAttachmentResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    createCommentAttachmentResponseTypeMap.put(201, new GenericType<NewItemDto>(){});
    createCommentAttachmentResponseTypeMap.put(400, new GenericType<ProblemDetails>(){});
    createCommentAttachmentResponseTypeMap.put(403, new GenericType<ProblemDetails>(){});
    createCommentAttachmentResponseTypeMap.put(404, new GenericType<ProblemDetails>(){});
  }

  private static final Map<Integer, GenericType> deleteCommentResponseTypeMap = new HashMap<Integer, GenericType>();

  private static final Map<Integer, GenericType> downloadCommentAttachmentForCommentResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    downloadCommentAttachmentForCommentResponseTypeMap.put(200, new GenericType<File>(){});
    downloadCommentAttachmentForCommentResponseTypeMap.put(400, new GenericType<ProblemDetails>(){});
    downloadCommentAttachmentForCommentResponseTypeMap.put(403, new GenericType<ProblemDetails>(){});
    downloadCommentAttachmentForCommentResponseTypeMap.put(404, new GenericType<ProblemDetails>(){});
  }

  private static final Map<Integer, GenericType> getCommentResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getCommentResponseTypeMap.put(200, new GenericType<CommentDto>(){});
    getCommentResponseTypeMap.put(400, new GenericType<ProblemDetails>(){});
    getCommentResponseTypeMap.put(403, new GenericType<ProblemDetails>(){});
    getCommentResponseTypeMap.put(404, new GenericType<ProblemDetails>(){});
  }

  private static final Map<Integer, GenericType> getCommentAttachmentsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getCommentAttachmentsResponseTypeMap.put(200, new GenericType<java.util.List<AttachmentSummaryDto>>(){});
    getCommentAttachmentsResponseTypeMap.put(400, new GenericType<ProblemDetails>(){});
    getCommentAttachmentsResponseTypeMap.put(403, new GenericType<ProblemDetails>(){});
    getCommentAttachmentsResponseTypeMap.put(404, new GenericType<ProblemDetails>(){});
  }

  private static final Map<Integer, GenericType> getCommentsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getCommentsResponseTypeMap.put(200, new GenericType<java.util.List<CommentSummaryDto>>(){});
    getCommentsResponseTypeMap.put(400, new GenericType<ProblemDetails>(){});
    getCommentsResponseTypeMap.put(403, new GenericType<ProblemDetails>(){});
    getCommentsResponseTypeMap.put(404, new GenericType<ProblemDetails>(){});
  }

  private static final Map<Integer, GenericType> patchCommentResponseTypeMap = new HashMap<Integer, GenericType>();

  


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
   * Create a comment to a Meeting
   * Create a comment to a Meeting by providing the meeting id and comment details.
   * @param meetingId The meeting Id to which the comment will be added (required)
   * @param createCommentDto The details of the comment to be created (optional)
   * @return NewItemDto
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Server Error </td><td>  -  </td></tr>
     </table>
   */
  public NewItemDto createComment(java.util.UUID meetingId, CreateCommentDto createCommentDto) throws ApiException {
    return createCommentWithHttpInfo(meetingId, createCommentDto).getData();
  }

  /**
   * Create a comment to a Meeting
   * Create a comment to a Meeting by providing the meeting id and comment details.
   * @param meetingId The meeting Id to which the comment will be added (required)
   * @param createCommentDto The details of the comment to be created (optional)
   * @return ApiResponse&lt;NewItemDto&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Server Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<NewItemDto> createCommentWithHttpInfo(java.util.UUID meetingId, CreateCommentDto createCommentDto) throws ApiException {
    Object localVarPostBody = createCommentDto;
    
    // verify the required parameter 'meetingId' is set
    if (meetingId == null) {
      throw new ApiException(400, "Missing the required parameter 'meetingId' when calling createComment");
    }
    
    // create path and map variables
    String localVarPath = "/meetings/{meetingId}/comments"
      .replaceAll("\\{" + "meetingId" + "\\}", apiClient.escapeString(meetingId.toString()));

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
      "application/json-patch+json", "application/json", "text/json", "application/_*+json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        NewItemDto
      
    > apiResponse = apiClient.invokeAPI("CommentsApi.createComment", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, createCommentResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Create a comment attachment to a Meeting
   * Create a attachment on a comment of a Meeting by providing the meeting id and comment id and attachment details.
   * @param meetingId Meeting Id (required)
   * @param commentId Comment Id (required)
   * @param _file  (required)
   * @return NewItemDto
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Server Error </td><td>  -  </td></tr>
     </table>
   */
  public NewItemDto createCommentAttachment(java.util.UUID meetingId, java.util.UUID commentId, File _file) throws ApiException {
    return createCommentAttachmentWithHttpInfo(meetingId, commentId, _file).getData();
  }

  /**
   * Create a comment attachment to a Meeting
   * Create a attachment on a comment of a Meeting by providing the meeting id and comment id and attachment details.
   * @param meetingId Meeting Id (required)
   * @param commentId Comment Id (required)
   * @param _file  (required)
   * @return ApiResponse&lt;NewItemDto&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Server Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<NewItemDto> createCommentAttachmentWithHttpInfo(java.util.UUID meetingId, java.util.UUID commentId, File _file) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'meetingId' is set
    if (meetingId == null) {
      throw new ApiException(400, "Missing the required parameter 'meetingId' when calling createCommentAttachment");
    }
    
    // verify the required parameter 'commentId' is set
    if (commentId == null) {
      throw new ApiException(400, "Missing the required parameter 'commentId' when calling createCommentAttachment");
    }
    
    // verify the required parameter '_file' is set
    if (_file == null) {
      throw new ApiException(400, "Missing the required parameter '_file' when calling createCommentAttachment");
    }
    
    // create path and map variables
    String localVarPath = "/meetings/{meetingId}/comments/{commentId}/attachments"
      .replaceAll("\\{" + "meetingId" + "\\}", apiClient.escapeString(meetingId.toString()))
      .replaceAll("\\{" + "commentId" + "\\}", apiClient.escapeString(commentId.toString()));

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
      
    > apiResponse = apiClient.invokeAPI("CommentsApi.createCommentAttachment", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, createCommentAttachmentResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Delete a Comment from a Meeting
   * Delete a Comment from a Meeting by providing the meeting id and comment id.
   * @param meetingId Meeting Id (required)
   * @param commentId Comment Id (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Server Error </td><td>  -  </td></tr>
     </table>
   */
  public void deleteComment(java.util.UUID meetingId, java.util.UUID commentId) throws ApiException {
    deleteCommentWithHttpInfo(meetingId, commentId);
  }

  /**
   * Delete a Comment from a Meeting
   * Delete a Comment from a Meeting by providing the meeting id and comment id.
   * @param meetingId Meeting Id (required)
   * @param commentId Comment Id (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Server Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> deleteCommentWithHttpInfo(java.util.UUID meetingId, java.util.UUID commentId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'meetingId' is set
    if (meetingId == null) {
      throw new ApiException(400, "Missing the required parameter 'meetingId' when calling deleteComment");
    }
    
    // verify the required parameter 'commentId' is set
    if (commentId == null) {
      throw new ApiException(400, "Missing the required parameter 'commentId' when calling deleteComment");
    }
    
    // create path and map variables
    String localVarPath = "/meetings/{meetingId}/comments/{commentId}"
      .replaceAll("\\{" + "meetingId" + "\\}", apiClient.escapeString(meetingId.toString()))
      .replaceAll("\\{" + "commentId" + "\\}", apiClient.escapeString(commentId.toString()));

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
    > apiResponse = apiClient.invokeAPI("CommentsApi.deleteComment", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, deleteCommentResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Download single attachment detail of a comment belonging to a meeting
   * Download single attachment detail of a comment belonging to a meeting by providing the meeting id, comment id and attachment id.
   * @param meetingId Meeting Id (required)
   * @param commentId Comment Id (required)
   * @param attachmentId Attachment Id (required)
   * @return File
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
  public File downloadCommentAttachmentForComment(java.util.UUID meetingId, java.util.UUID commentId, java.util.UUID attachmentId) throws ApiException {
    return downloadCommentAttachmentForCommentWithHttpInfo(meetingId, commentId, attachmentId).getData();
  }

  /**
   * Download single attachment detail of a comment belonging to a meeting
   * Download single attachment detail of a comment belonging to a meeting by providing the meeting id, comment id and attachment id.
   * @param meetingId Meeting Id (required)
   * @param commentId Comment Id (required)
   * @param attachmentId Attachment Id (required)
   * @return ApiResponse&lt;File&gt;
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
  public ApiResponse<File> downloadCommentAttachmentForCommentWithHttpInfo(java.util.UUID meetingId, java.util.UUID commentId, java.util.UUID attachmentId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'meetingId' is set
    if (meetingId == null) {
      throw new ApiException(400, "Missing the required parameter 'meetingId' when calling downloadCommentAttachmentForComment");
    }
    
    // verify the required parameter 'commentId' is set
    if (commentId == null) {
      throw new ApiException(400, "Missing the required parameter 'commentId' when calling downloadCommentAttachmentForComment");
    }
    
    // verify the required parameter 'attachmentId' is set
    if (attachmentId == null) {
      throw new ApiException(400, "Missing the required parameter 'attachmentId' when calling downloadCommentAttachmentForComment");
    }
    
    // create path and map variables
    String localVarPath = "/meetings/{meetingId}/comments/{commentId}/attachments/{attachmentId}/download"
      .replaceAll("\\{" + "meetingId" + "\\}", apiClient.escapeString(meetingId.toString()))
      .replaceAll("\\{" + "commentId" + "\\}", apiClient.escapeString(commentId.toString()))
      .replaceAll("\\{" + "attachmentId" + "\\}", apiClient.escapeString(attachmentId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/octet-stream", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        File
      
    > apiResponse = apiClient.invokeAPI("CommentsApi.downloadCommentAttachmentForComment", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, downloadCommentAttachmentForCommentResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Get details of a comment belonging to a meeting
   * Get details of a comment belonging to a meeting by providing the meeting id and comment id.
   * @param meetingId Meeting Id (required)
   * @param commentId Comment Id (required)
   * @return CommentDto
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
  public CommentDto getComment(java.util.UUID meetingId, java.util.UUID commentId) throws ApiException {
    return getCommentWithHttpInfo(meetingId, commentId).getData();
  }

  /**
   * Get details of a comment belonging to a meeting
   * Get details of a comment belonging to a meeting by providing the meeting id and comment id.
   * @param meetingId Meeting Id (required)
   * @param commentId Comment Id (required)
   * @return ApiResponse&lt;CommentDto&gt;
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
  public ApiResponse<CommentDto> getCommentWithHttpInfo(java.util.UUID meetingId, java.util.UUID commentId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'meetingId' is set
    if (meetingId == null) {
      throw new ApiException(400, "Missing the required parameter 'meetingId' when calling getComment");
    }
    
    // verify the required parameter 'commentId' is set
    if (commentId == null) {
      throw new ApiException(400, "Missing the required parameter 'commentId' when calling getComment");
    }
    
    // create path and map variables
    String localVarPath = "/meetings/{meetingId}/comments/{commentId}"
      .replaceAll("\\{" + "meetingId" + "\\}", apiClient.escapeString(meetingId.toString()))
      .replaceAll("\\{" + "commentId" + "\\}", apiClient.escapeString(commentId.toString()));

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
        
        CommentDto
      
    > apiResponse = apiClient.invokeAPI("CommentsApi.getComment", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getCommentResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Get attachments summary of a comment belonging to a meeting
   * Get attachments summary of a comment belonging to a meeting by providing the meeting id and comment id.
   * @param meetingId Meeting Id (required)
   * @param commentId Comment Id (required)
   * @return java.util.List<AttachmentSummaryDto>
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
  public java.util.List<AttachmentSummaryDto> getCommentAttachments(java.util.UUID meetingId, java.util.UUID commentId) throws ApiException {
    return getCommentAttachmentsWithHttpInfo(meetingId, commentId).getData();
  }

  /**
   * Get attachments summary of a comment belonging to a meeting
   * Get attachments summary of a comment belonging to a meeting by providing the meeting id and comment id.
   * @param meetingId Meeting Id (required)
   * @param commentId Comment Id (required)
   * @return ApiResponse&lt;java.util.List<AttachmentSummaryDto>&gt;
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
  public ApiResponse<java.util.List<AttachmentSummaryDto>> getCommentAttachmentsWithHttpInfo(java.util.UUID meetingId, java.util.UUID commentId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'meetingId' is set
    if (meetingId == null) {
      throw new ApiException(400, "Missing the required parameter 'meetingId' when calling getCommentAttachments");
    }
    
    // verify the required parameter 'commentId' is set
    if (commentId == null) {
      throw new ApiException(400, "Missing the required parameter 'commentId' when calling getCommentAttachments");
    }
    
    // create path and map variables
    String localVarPath = "/meetings/{meetingId}/comments/{commentId}/attachments"
      .replaceAll("\\{" + "meetingId" + "\\}", apiClient.escapeString(meetingId.toString()))
      .replaceAll("\\{" + "commentId" + "\\}", apiClient.escapeString(commentId.toString()));

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
      
    > apiResponse = apiClient.invokeAPI("CommentsApi.getCommentAttachments", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getCommentAttachmentsResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Get all comments for a meeting
   * Get all comments for a meeting by providing the meeting id.
   * @param meetingId Meeting Id (required)
   * @return java.util.List<CommentSummaryDto>
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
  public java.util.List<CommentSummaryDto> getComments(java.util.UUID meetingId) throws ApiException {
    return getCommentsWithHttpInfo(meetingId).getData();
  }

  /**
   * Get all comments for a meeting
   * Get all comments for a meeting by providing the meeting id.
   * @param meetingId Meeting Id (required)
   * @return ApiResponse&lt;java.util.List<CommentSummaryDto>&gt;
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
  public ApiResponse<java.util.List<CommentSummaryDto>> getCommentsWithHttpInfo(java.util.UUID meetingId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'meetingId' is set
    if (meetingId == null) {
      throw new ApiException(400, "Missing the required parameter 'meetingId' when calling getComments");
    }
    
    // create path and map variables
    String localVarPath = "/meetings/{meetingId}/comments"
      .replaceAll("\\{" + "meetingId" + "\\}", apiClient.escapeString(meetingId.toString()));

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
        
        java.util.List<CommentSummaryDto>
      
    > apiResponse = apiClient.invokeAPI("CommentsApi.getComments", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getCommentsResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Edit a comment for a meeting
   * Edit a comment for a meeting by providing the meeting id and comment id.
   * @param meetingId Meeting Id (required)
   * @param commentId Comment Id (required)
   * @param operation The JSON patch document with updates for the comment (optional)
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
  public void patchComment(java.util.UUID meetingId, java.util.UUID commentId, java.util.List<Operation> operation) throws ApiException {
    patchCommentWithHttpInfo(meetingId, commentId, operation);
  }

  /**
   * Edit a comment for a meeting
   * Edit a comment for a meeting by providing the meeting id and comment id.
   * @param meetingId Meeting Id (required)
   * @param commentId Comment Id (required)
   * @param operation The JSON patch document with updates for the comment (optional)
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
  public ApiResponse<Void> patchCommentWithHttpInfo(java.util.UUID meetingId, java.util.UUID commentId, java.util.List<Operation> operation) throws ApiException {
    Object localVarPostBody = operation;
    
    // verify the required parameter 'meetingId' is set
    if (meetingId == null) {
      throw new ApiException(400, "Missing the required parameter 'meetingId' when calling patchComment");
    }
    
    // verify the required parameter 'commentId' is set
    if (commentId == null) {
      throw new ApiException(400, "Missing the required parameter 'commentId' when calling patchComment");
    }
    
    // create path and map variables
    String localVarPath = "/meetings/{meetingId}/comments/{commentId}"
      .replaceAll("\\{" + "meetingId" + "\\}", apiClient.escapeString(meetingId.toString()))
      .replaceAll("\\{" + "commentId" + "\\}", apiClient.escapeString(commentId.toString()));

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
      "application/json-patch+json", "application/json", "text/json", "application/_*+json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
      Void
    > apiResponse = apiClient.invokeAPI("CommentsApi.patchComment", localVarPath, "PATCH", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, patchCommentResponseTypeMap, false);

    return apiResponse;

  }
}
