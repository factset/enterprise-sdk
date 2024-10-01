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

import com.factset.sdk.IRNMeetings.models.CreateMeetingDto;
import com.factset.sdk.IRNMeetings.models.MeetingDto;
import com.factset.sdk.IRNMeetings.models.MeetingSummaryDto;
import com.factset.sdk.IRNMeetings.models.NewItemDto;
import com.factset.sdk.IRNMeetings.models.ProblemDetails;
import com.factset.sdk.IRNMeetings.models.UpdateMeetingDto;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class MeetingsApi {
  private ApiClient apiClient;

  public MeetingsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public MeetingsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> createMeetingResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    createMeetingResponseTypeMap.put(201, new GenericType<NewItemDto>(){});
    createMeetingResponseTypeMap.put(400, new GenericType<ProblemDetails>(){});
    createMeetingResponseTypeMap.put(0, new GenericType<ProblemDetails>(){});
  }

  private static final Map<Integer, GenericType> deleteMeetingResponseTypeMap = new HashMap<Integer, GenericType>();

  private static final Map<Integer, GenericType> getMeetingResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getMeetingResponseTypeMap.put(200, new GenericType<MeetingDto>(){});
    getMeetingResponseTypeMap.put(404, new GenericType<ProblemDetails>(){});
    getMeetingResponseTypeMap.put(0, new GenericType<ProblemDetails>(){});
  }

  private static final Map<Integer, GenericType> getMeetingsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getMeetingsResponseTypeMap.put(200, new GenericType<java.util.List<MeetingSummaryDto>>(){});
    getMeetingsResponseTypeMap.put(400, new GenericType<ProblemDetails>(){});
  }

  private static final Map<Integer, GenericType> updateMeetingResponseTypeMap = new HashMap<Integer, GenericType>();

  


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
   * Create a meeting
   * Create a meeting with the given details like date, time, location, attendees, etc.
   * @param createMeetingDto Note: The organizer property is deprecated in favor of organizerId (optional)
   * @return NewItemDto
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Success - Returns unique identifier of the meeting created </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
     </table>
   */
  public NewItemDto createMeeting(CreateMeetingDto createMeetingDto) throws ApiException {
    return createMeetingWithHttpInfo(createMeetingDto).getData();
  }

  /**
   * Create a meeting
   * Create a meeting with the given details like date, time, location, attendees, etc.
   * @param createMeetingDto Note: The organizer property is deprecated in favor of organizerId (optional)
   * @return ApiResponse&lt;NewItemDto&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Success - Returns unique identifier of the meeting created </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<NewItemDto> createMeetingWithHttpInfo(CreateMeetingDto createMeetingDto) throws ApiException {
    Object localVarPostBody = createMeetingDto;
    
    // create path and map variables
    String localVarPath = "/meetings";

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
      
    > apiResponse = apiClient.invokeAPI("MeetingsApi.createMeeting", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, createMeetingResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Delete a Meeting
   * Delete a meeting by providing the meeting id.
   * @param meetingId Meeting Id (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
     </table>
   */
  public void deleteMeeting(java.util.UUID meetingId) throws ApiException {
    deleteMeetingWithHttpInfo(meetingId);
  }

  /**
   * Delete a Meeting
   * Delete a meeting by providing the meeting id.
   * @param meetingId Meeting Id (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> deleteMeetingWithHttpInfo(java.util.UUID meetingId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'meetingId' is set
    if (meetingId == null) {
      throw new ApiException(400, "Missing the required parameter 'meetingId' when calling deleteMeeting");
    }
    
    // create path and map variables
    String localVarPath = "/meetings/{meetingId}"
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
      Void
    > apiResponse = apiClient.invokeAPI("MeetingsApi.deleteMeeting", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, deleteMeetingResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Get details of a meeting
   * Get details of a meeting by providing the meeting id.
   * @param meetingId Meeting Id (required)
   * @return MeetingDto
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
     </table>
   */
  public MeetingDto getMeeting(java.util.UUID meetingId) throws ApiException {
    return getMeetingWithHttpInfo(meetingId).getData();
  }

  /**
   * Get details of a meeting
   * Get details of a meeting by providing the meeting id.
   * @param meetingId Meeting Id (required)
   * @return ApiResponse&lt;MeetingDto&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<MeetingDto> getMeetingWithHttpInfo(java.util.UUID meetingId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'meetingId' is set
    if (meetingId == null) {
      throw new ApiException(400, "Missing the required parameter 'meetingId' when calling getMeeting");
    }
    
    // create path and map variables
    String localVarPath = "/meetings/{meetingId}"
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
        
        MeetingDto
      
    > apiResponse = apiClient.invokeAPI("MeetingsApi.getMeeting", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getMeetingResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Get all the meetings in the specified date range filtered on the given identifiers
   * Get all the meetings in the specified date range filtered on the given identifiers.
   * @param start StartDate (optional)
   * @param end EndDate (optional)
   * @param identifiers Set of identifiers to filter on (optional)
   * @param limit Limit on the number of meetings retrieved (optional)
   * @param modifiedSince Only return meetings which have been modified or created since a particular time (optional)
   * @param includeRelatedEntities When set to true fetches meetings tagged with all the entities related to identifiers param (optional, default to false)
   * @param xIRNIncludeDeleted Includes deleted meetings in results when set to true (optional, default to false)
   * @return java.util.List<MeetingSummaryDto>
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     </table>
   */
  public java.util.List<MeetingSummaryDto> getMeetings(String start, String end, java.util.List<String> identifiers, Integer limit, String modifiedSince, Boolean includeRelatedEntities, Boolean xIRNIncludeDeleted) throws ApiException {
    return getMeetingsWithHttpInfo(start, end, identifiers, limit, modifiedSince, includeRelatedEntities, xIRNIncludeDeleted).getData();
  }

  /**
   * Get all the meetings in the specified date range filtered on the given identifiers
   * Get all the meetings in the specified date range filtered on the given identifiers.
   * @param start StartDate (optional)
   * @param end EndDate (optional)
   * @param identifiers Set of identifiers to filter on (optional)
   * @param limit Limit on the number of meetings retrieved (optional)
   * @param modifiedSince Only return meetings which have been modified or created since a particular time (optional)
   * @param includeRelatedEntities When set to true fetches meetings tagged with all the entities related to identifiers param (optional, default to false)
   * @param xIRNIncludeDeleted Includes deleted meetings in results when set to true (optional, default to false)
   * @return ApiResponse&lt;java.util.List<MeetingSummaryDto>&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<java.util.List<MeetingSummaryDto>> getMeetingsWithHttpInfo(String start, String end, java.util.List<String> identifiers, Integer limit, String modifiedSince, Boolean includeRelatedEntities, Boolean xIRNIncludeDeleted) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/meetings";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start", start));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end", end));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "identifiers", identifiers));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "modifiedSince", modifiedSince));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "includeRelatedEntities", includeRelatedEntities));

    if (xIRNIncludeDeleted != null)
      localVarHeaderParams.put("X-IRN-Include-Deleted", apiClient.parameterToString(xIRNIncludeDeleted));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        java.util.List<MeetingSummaryDto>
      
    > apiResponse = apiClient.invokeAPI("MeetingsApi.getMeetings", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getMeetingsResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Update meeting
   * Update the details of a meeting by providing the meeting id based on the given details.
   * @param meetingId Meeting Id (required)
   * @param updateMeetingDto Meeting details to update. Note: The organizer property is deprecated in favor of organizerId (optional)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
     </table>
   */
  public void updateMeeting(java.util.UUID meetingId, UpdateMeetingDto updateMeetingDto) throws ApiException {
    updateMeetingWithHttpInfo(meetingId, updateMeetingDto);
  }

  /**
   * Update meeting
   * Update the details of a meeting by providing the meeting id based on the given details.
   * @param meetingId Meeting Id (required)
   * @param updateMeetingDto Meeting details to update. Note: The organizer property is deprecated in favor of organizerId (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> updateMeetingWithHttpInfo(java.util.UUID meetingId, UpdateMeetingDto updateMeetingDto) throws ApiException {
    Object localVarPostBody = updateMeetingDto;
    
    // verify the required parameter 'meetingId' is set
    if (meetingId == null) {
      throw new ApiException(400, "Missing the required parameter 'meetingId' when calling updateMeeting");
    }
    
    // create path and map variables
    String localVarPath = "/meetings/{meetingId}"
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
      Void
    > apiResponse = apiClient.invokeAPI("MeetingsApi.updateMeeting", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, updateMeetingResponseTypeMap, false);

    return apiResponse;

  }
}
