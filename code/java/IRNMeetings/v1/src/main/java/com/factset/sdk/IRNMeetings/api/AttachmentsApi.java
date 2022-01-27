package com.factset.sdk.IRNMeetings.api;

import com.factset.sdk.IRNMeetings.ApiException;
import com.factset.sdk.IRNMeetings.ApiClient;
import com.factset.sdk.IRNMeetings.ApiResponse;
import com.factset.sdk.IRNMeetings.Configuration;
import com.factset.sdk.IRNMeetings.Pair;

import javax.ws.rs.core.GenericType;

import com.factset.sdk.IRNMeetings.models.AttachmentSummaryDto;
import java.io.File;
import com.factset.sdk.IRNMeetings.models.NewItemDto;
import com.factset.sdk.IRNMeetings.models.ProblemDetails;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AttachmentsApi {
  private ApiClient apiClient;

  public AttachmentsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AttachmentsApi(ApiClient apiClient) {
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
   * Create an attachment for an existing meeting
   * 
   * @param meetingId Meeting Id (required)
   * @param file  (required)
   * @return NewItemDto
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Success - Returns unique identifier of the Attachment </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
     </table>
   */
  public NewItemDto createAttachment(java.util.UUID meetingId, File file) throws ApiException {
    return createAttachmentWithHttpInfo(meetingId, file).getData();
  }

  /**
   * Create an attachment for an existing meeting
   * 
   * @param meetingId Meeting Id (required)
   * @param file  (required)
   * @return ApiResponse&lt;NewItemDto&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Success - Returns unique identifier of the Attachment </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<NewItemDto> createAttachmentWithHttpInfo(java.util.UUID meetingId, File file) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'meetingId' is set
    if (meetingId == null) {
      throw new ApiException(400, "Missing the required parameter 'meetingId' when calling createAttachment");
    }
    
    // verify the required parameter 'file' is set
    if (file == null) {
      throw new ApiException(400, "Missing the required parameter 'file' when calling createAttachment");
    }
    
    // create path and map variables
    String localVarPath = "/v1/meetings/{meetingId}/attachments"
      .replaceAll("\\{" + "meetingId" + "\\}", apiClient.escapeString(meetingId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();


    
    
    if (file != null)
      localVarFormParams.put("file", file);

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "multipart/form-data"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };

    GenericType<NewItemDto> localVarReturnType = new GenericType<NewItemDto>() {};

    return apiClient.invokeAPI("AttachmentsApi.createAttachment", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Download an attachment from a meeting
   * 
   * @param meetingId  (required)
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
  public void downloadAttachment(java.util.UUID meetingId, java.util.UUID attachmentId) throws ApiException {
    downloadAttachmentWithHttpInfo(meetingId, attachmentId);
  }

  /**
   * Download an attachment from a meeting
   * 
   * @param meetingId  (required)
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
  public ApiResponse<Void> downloadAttachmentWithHttpInfo(java.util.UUID meetingId, java.util.UUID attachmentId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'meetingId' is set
    if (meetingId == null) {
      throw new ApiException(400, "Missing the required parameter 'meetingId' when calling downloadAttachment");
    }
    
    // verify the required parameter 'attachmentId' is set
    if (attachmentId == null) {
      throw new ApiException(400, "Missing the required parameter 'attachmentId' when calling downloadAttachment");
    }
    
    // create path and map variables
    String localVarPath = "/v1/meetings/{meetingId}/attachments/{attachmentId}/download"
      .replaceAll("\\{" + "meetingId" + "\\}", apiClient.escapeString(meetingId.toString()))
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

    return apiClient.invokeAPI("AttachmentsApi.downloadAttachment", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * Get all the attachments belonging to a meeting
   * 
   * @param meetingId Meeting Id (required)
   * @return java.util.List&lt;AttachmentSummaryDto&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
     </table>
   */
  public java.util.List<AttachmentSummaryDto> getAttachments(java.util.UUID meetingId) throws ApiException {
    return getAttachmentsWithHttpInfo(meetingId).getData();
  }

  /**
   * Get all the attachments belonging to a meeting
   * 
   * @param meetingId Meeting Id (required)
   * @return ApiResponse&lt;java.util.List&lt;AttachmentSummaryDto&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<java.util.List<AttachmentSummaryDto>> getAttachmentsWithHttpInfo(java.util.UUID meetingId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'meetingId' is set
    if (meetingId == null) {
      throw new ApiException(400, "Missing the required parameter 'meetingId' when calling getAttachments");
    }
    
    // create path and map variables
    String localVarPath = "/v1/meetings/{meetingId}/attachments"
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

    GenericType<java.util.List<AttachmentSummaryDto>> localVarReturnType = new GenericType<java.util.List<AttachmentSummaryDto>>() {};

    return apiClient.invokeAPI("AttachmentsApi.getAttachments", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Delete attachment from meeting
   * 
   * @param meetingId Meeting Id (required)
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
  public void softDeleteMeetingAttachment(java.util.UUID meetingId, java.util.UUID attachmentId) throws ApiException {
    softDeleteMeetingAttachmentWithHttpInfo(meetingId, attachmentId);
  }

  /**
   * Delete attachment from meeting
   * 
   * @param meetingId Meeting Id (required)
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
  public ApiResponse<Void> softDeleteMeetingAttachmentWithHttpInfo(java.util.UUID meetingId, java.util.UUID attachmentId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'meetingId' is set
    if (meetingId == null) {
      throw new ApiException(400, "Missing the required parameter 'meetingId' when calling softDeleteMeetingAttachment");
    }
    
    // verify the required parameter 'attachmentId' is set
    if (attachmentId == null) {
      throw new ApiException(400, "Missing the required parameter 'attachmentId' when calling softDeleteMeetingAttachment");
    }
    
    // create path and map variables
    String localVarPath = "/v1/meetings/{meetingId}/attachments/{attachmentId}"
      .replaceAll("\\{" + "meetingId" + "\\}", apiClient.escapeString(meetingId.toString()))
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

    return apiClient.invokeAPI("AttachmentsApi.softDeleteMeetingAttachment", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
}
