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

import com.factset.sdk.IRNNotes.models.EventSnippetDto;
import com.factset.sdk.IRNNotes.models.NoteEventDto;
import com.factset.sdk.IRNNotes.models.ProblemDetails;
import com.factset.sdk.IRNNotes.models.RecordEventSummaryDto;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class EventsApi {
  private ApiClient apiClient;

  public EventsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public EventsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> getAllEventsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getAllEventsResponseTypeMap.put(200, new GenericType<java.util.List<EventSnippetDto>>(){});
  }

  private static final Map<Integer, GenericType> getEventsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getEventsResponseTypeMap.put(200, new GenericType<java.util.List<RecordEventSummaryDto>>(){});
    getEventsResponseTypeMap.put(404, new GenericType<ProblemDetails>(){});
    getEventsResponseTypeMap.put(0, new GenericType<ProblemDetails>(){});
  }

  private static final Map<Integer, GenericType> getRecordEventResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getRecordEventResponseTypeMap.put(200, new GenericType<NoteEventDto>(){});
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
   * Get all the record events in the specified date range filtered on the given types
   * 
   * @param startDate StartDate (required)
   * @param endDate EndDate (optional)
   * @param types Set of event types to filter on (optional)
   * @return java.util.List<EventSnippetDto>
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success - Returns events list </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request - Returns error message </td><td>  -  </td></tr>
     </table>
   */
  public java.util.List<EventSnippetDto> getAllEvents(String startDate, String endDate, java.util.List<String> types) throws ApiException {
    return getAllEventsWithHttpInfo(startDate, endDate, types).getData();
  }

  /**
   * Get all the record events in the specified date range filtered on the given types
   * 
   * @param startDate StartDate (required)
   * @param endDate EndDate (optional)
   * @param types Set of event types to filter on (optional)
   * @return ApiResponse&lt;java.util.List<EventSnippetDto>&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success - Returns events list </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request - Returns error message </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<java.util.List<EventSnippetDto>> getAllEventsWithHttpInfo(String startDate, String endDate, java.util.List<String> types) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'startDate' is set
    if (startDate == null) {
      throw new ApiException(400, "Missing the required parameter 'startDate' when calling getAllEvents");
    }
    
    // create path and map variables
    String localVarPath = "/v1/events";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startDate", startDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "endDate", endDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "types", types));

    
    
    
    final String[] localVarAccepts = {
      "text/plain", "application/json", "text/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        java.util.List<EventSnippetDto>
      
    > apiResponse = apiClient.invokeAPI("EventsApi.getAllEvents", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getAllEventsResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Get all the record events that belong to a note
   * 
   * @param noteId Note Id (required)
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
  public java.util.List<RecordEventSummaryDto> getEvents(java.util.UUID noteId) throws ApiException {
    return getEventsWithHttpInfo(noteId).getData();
  }

  /**
   * Get all the record events that belong to a note
   * 
   * @param noteId Note Id (required)
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
  public ApiResponse<java.util.List<RecordEventSummaryDto>> getEventsWithHttpInfo(java.util.UUID noteId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'noteId' is set
    if (noteId == null) {
      throw new ApiException(400, "Missing the required parameter 'noteId' when calling getEvents");
    }
    
    // create path and map variables
    String localVarPath = "/v1/notes/{noteId}/events"
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
        
        java.util.List<RecordEventSummaryDto>
      
    > apiResponse = apiClient.invokeAPI("EventsApi.getEvents", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getEventsResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Get details of a record event of a note
   * 
   * @param noteId Note Id (required)
   * @param recordEventId Record Event Id (required)
   * @return NoteEventDto
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
   */
  public NoteEventDto getRecordEvent(java.util.UUID noteId, java.util.UUID recordEventId) throws ApiException {
    return getRecordEventWithHttpInfo(noteId, recordEventId).getData();
  }

  /**
   * Get details of a record event of a note
   * 
   * @param noteId Note Id (required)
   * @param recordEventId Record Event Id (required)
   * @return ApiResponse&lt;NoteEventDto&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<NoteEventDto> getRecordEventWithHttpInfo(java.util.UUID noteId, java.util.UUID recordEventId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'noteId' is set
    if (noteId == null) {
      throw new ApiException(400, "Missing the required parameter 'noteId' when calling getRecordEvent");
    }
    
    // verify the required parameter 'recordEventId' is set
    if (recordEventId == null) {
      throw new ApiException(400, "Missing the required parameter 'recordEventId' when calling getRecordEvent");
    }
    
    // create path and map variables
    String localVarPath = "/v1/notes/{noteId}/events/{recordEventId}"
      .replaceAll("\\{" + "noteId" + "\\}", apiClient.escapeString(noteId.toString()))
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
        
        NoteEventDto
      
    > apiResponse = apiClient.invokeAPI("EventsApi.getRecordEvent", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getRecordEventResponseTypeMap, false);

    return apiResponse;

  }
}
