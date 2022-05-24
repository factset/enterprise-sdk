package com.factset.sdk.IRNMeetings.api;

import com.factset.sdk.IRNMeetings.ApiException;
import com.factset.sdk.IRNMeetings.ApiClient;
import com.factset.sdk.IRNMeetings.ApiResponse;
import com.factset.sdk.IRNMeetings.Configuration;
import com.factset.sdk.IRNMeetings.Pair;

import javax.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.IRNMeetings.models.MeetingEventDto;
import com.factset.sdk.IRNMeetings.models.ProblemDetails;
import com.factset.sdk.IRNMeetings.models.RecordEventSummaryDto;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class EventsApi {
  private ApiClient apiClient;

  public EventsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public EventsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

    private static final Map<Integer, GenericType> getEventsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getEventsResponseTypeMap.put(200, new GenericType<java.util.List<RecordEventSummaryDto>>(){});
    getEventsResponseTypeMap.put(404, new GenericType<ProblemDetails>(){});
    getEventsResponseTypeMap.put(0, new GenericType<ProblemDetails>(){});
  }
  private static final Map<Integer, GenericType> getRecordEventResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getRecordEventResponseTypeMap.put(200, new GenericType<MeetingEventDto>(){});
    getRecordEventResponseTypeMap.put(403, new GenericType<ProblemDetails>(){});
    getRecordEventResponseTypeMap.put(404, new GenericType<ProblemDetails>(){});
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
   * Get all the record events that belong to a meeting
   * 
   * @param meetingId Meeting ID (required)
   * @return java.util.List<RecordEventSummaryDto>
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
     </table>
   */
  public java.util.List<RecordEventSummaryDto> getEvents(java.util.UUID meetingId) throws ApiException {
    return getEventsWithHttpInfo(meetingId).getData();
  }

  /**
   * Get all the record events that belong to a meeting
   * 
   * @param meetingId Meeting ID (required)
   * @return ApiResponse&lt;java.util.List<RecordEventSummaryDto>&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<java.util.List<RecordEventSummaryDto>> getEventsWithHttpInfo(java.util.UUID meetingId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'meetingId' is set
    if (meetingId == null) {
      throw new ApiException(400, "Missing the required parameter 'meetingId' when calling getEvents");
    }
    
    // create path and map variables
    String localVarPath = "/v1/meetings/{meetingId}/events"
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
        
        java.util.List<RecordEventSummaryDto>
      
    > apiResponse = apiClient.invokeAPI("EventsApi.getEvents", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getEventsResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Get details of a record event of a meeting
   * 
   * @param meetingId Meeting Id (required)
   * @param recordEventId Record Event Id (required)
   * @return MeetingEventDto
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
   */
  public MeetingEventDto getRecordEvent(java.util.UUID meetingId, java.util.UUID recordEventId) throws ApiException {
    return getRecordEventWithHttpInfo(meetingId, recordEventId).getData();
  }

  /**
   * Get details of a record event of a meeting
   * 
   * @param meetingId Meeting Id (required)
   * @param recordEventId Record Event Id (required)
   * @return ApiResponse&lt;MeetingEventDto&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<MeetingEventDto> getRecordEventWithHttpInfo(java.util.UUID meetingId, java.util.UUID recordEventId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'meetingId' is set
    if (meetingId == null) {
      throw new ApiException(400, "Missing the required parameter 'meetingId' when calling getRecordEvent");
    }
    
    // verify the required parameter 'recordEventId' is set
    if (recordEventId == null) {
      throw new ApiException(400, "Missing the required parameter 'recordEventId' when calling getRecordEvent");
    }
    
    // create path and map variables
    String localVarPath = "/v1/meetings/{meetingId}/events/{recordEventId}"
      .replaceAll("\\{" + "meetingId" + "\\}", apiClient.escapeString(meetingId.toString()))
      .replaceAll("\\{" + "recordEventId" + "\\}", apiClient.escapeString(recordEventId.toString()));

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
        
        MeetingEventDto
      
    > apiResponse = apiClient.invokeAPI("EventsApi.getRecordEvent", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getRecordEventResponseTypeMap, false);

    return apiResponse;

  }
}
