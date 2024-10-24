package com.factset.sdk.EventsContribution.api;

import com.factset.sdk.EventsContribution.ApiException;
import com.factset.sdk.EventsContribution.ApiClient;
import com.factset.sdk.EventsContribution.ApiResponse;
import com.factset.sdk.EventsContribution.Configuration;
import com.factset.sdk.EventsContribution.Pair;

import jakarta.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.EventsContribution.models.DeleteResponse;
import com.factset.sdk.EventsContribution.models.ErrorResponse;
import com.factset.sdk.EventsContribution.models.GetResponse;
import com.factset.sdk.EventsContribution.models.InsertRequest;
import com.factset.sdk.EventsContribution.models.InsertResponse;
import com.factset.sdk.EventsContribution.models.UpdateRequest;
import com.factset.sdk.EventsContribution.models.UpdateResponse;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class EventsContributionApi {
  private ApiClient apiClient;

  public EventsContributionApi() {
    this(Configuration.getDefaultApiClient());
  }

  public EventsContributionApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> deleteEventResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    deleteEventResponseTypeMap.put(200, new GenericType<DeleteResponse>(){});
    deleteEventResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    deleteEventResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    deleteEventResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    deleteEventResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> getEventResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getEventResponseTypeMap.put(200, new GenericType<GetResponse>(){});
    getEventResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getEventResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getEventResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getEventResponseTypeMap.put(404, new GenericType<ErrorResponse>(){});
    getEventResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> insertEventResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    insertEventResponseTypeMap.put(200, new GenericType<InsertResponse>(){});
    insertEventResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    insertEventResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    insertEventResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    insertEventResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> updateEventResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    updateEventResponseTypeMap.put(200, new GenericType<UpdateResponse>(){});
    updateEventResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    updateEventResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    updateEventResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    updateEventResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
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
   * Delete Event data
   * This endpoint allows you to delete a previously inserted event with the corresponding event id.
   * @param eventId ID of event to be deleted. This ID is vendor generated and should be unique in each vendor&#39;s content set. (required)
   * @return DeleteResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public DeleteResponse deleteEvent(String eventId) throws ApiException {
    return deleteEventWithHttpInfo(eventId).getData();
  }

  /**
   * Delete Event data
   * This endpoint allows you to delete a previously inserted event with the corresponding event id.
   * @param eventId ID of event to be deleted. This ID is vendor generated and should be unique in each vendor&#39;s content set. (required)
   * @return ApiResponse&lt;DeleteResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<DeleteResponse> deleteEventWithHttpInfo(String eventId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'eventId' is set
    if (eventId == null) {
      throw new ApiException(400, "Missing the required parameter 'eventId' when calling deleteEvent");
    }
    
    // create path and map variables
    String localVarPath = "/events/{eventId}"
      .replaceAll("\\{" + "eventId" + "\\}", apiClient.escapeString(eventId.toString()));

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
        
        DeleteResponse
      
    > apiResponse = apiClient.invokeAPI("EventsContributionApi.deleteEvent", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, deleteEventResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Get Event Data
   * This endpoint retrieves previously submitted events by event ID.
   * @param eventId ID for event retrieval. This ID is vendor generated and should be unique in each vendor&#39;s content set. (required)
   * @return GetResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. Invalid Parameter. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public GetResponse getEvent(String eventId) throws ApiException {
    return getEventWithHttpInfo(eventId).getData();
  }

  /**
   * Get Event Data
   * This endpoint retrieves previously submitted events by event ID.
   * @param eventId ID for event retrieval. This ID is vendor generated and should be unique in each vendor&#39;s content set. (required)
   * @return ApiResponse&lt;GetResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. Invalid Parameter. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetResponse> getEventWithHttpInfo(String eventId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'eventId' is set
    if (eventId == null) {
      throw new ApiException(400, "Missing the required parameter 'eventId' when calling getEvent");
    }
    
    // create path and map variables
    String localVarPath = "/events/{eventId}"
      .replaceAll("\\{" + "eventId" + "\\}", apiClient.escapeString(eventId.toString()));

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
        
        GetResponse
      
    > apiResponse = apiClient.invokeAPI("EventsContributionApi.getEvent", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getEventResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Insert Event data
   * This endpoint inserts an event. Once the event is inserted, it will show up immediately among FactSet’s own event calendar apps, for display within FactSet’s applications.
   * @param insertRequest INSERT request body which needs to be sent with request (required)
   * @return InsertResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public InsertResponse insertEvent(InsertRequest insertRequest) throws ApiException {
    return insertEventWithHttpInfo(insertRequest).getData();
  }

  /**
   * Insert Event data
   * This endpoint inserts an event. Once the event is inserted, it will show up immediately among FactSet’s own event calendar apps, for display within FactSet’s applications.
   * @param insertRequest INSERT request body which needs to be sent with request (required)
   * @return ApiResponse&lt;InsertResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InsertResponse> insertEventWithHttpInfo(InsertRequest insertRequest) throws ApiException {
    Object localVarPostBody = insertRequest;
    
    // verify the required parameter 'insertRequest' is set
    if (insertRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'insertRequest' when calling insertEvent");
    }
    
    // create path and map variables
    String localVarPath = "/events";

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
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        InsertResponse
      
    > apiResponse = apiClient.invokeAPI("EventsContributionApi.insertEvent", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, insertEventResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Update Event data
   * This endpoint allows you to update a previously inserted event. Existing event will be replaced with the event data provided in the request body.
   * @param eventId ID of event to be updated. This ID is vendor generated and should be unique in each vendor&#39;s content set. (required)
   * @param updateRequest UPDATE request body which needs to be sent with request (required)
   * @return UpdateResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public UpdateResponse updateEvent(String eventId, UpdateRequest updateRequest) throws ApiException {
    return updateEventWithHttpInfo(eventId, updateRequest).getData();
  }

  /**
   * Update Event data
   * This endpoint allows you to update a previously inserted event. Existing event will be replaced with the event data provided in the request body.
   * @param eventId ID of event to be updated. This ID is vendor generated and should be unique in each vendor&#39;s content set. (required)
   * @param updateRequest UPDATE request body which needs to be sent with request (required)
   * @return ApiResponse&lt;UpdateResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<UpdateResponse> updateEventWithHttpInfo(String eventId, UpdateRequest updateRequest) throws ApiException {
    Object localVarPostBody = updateRequest;
    
    // verify the required parameter 'eventId' is set
    if (eventId == null) {
      throw new ApiException(400, "Missing the required parameter 'eventId' when calling updateEvent");
    }
    
    // verify the required parameter 'updateRequest' is set
    if (updateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'updateRequest' when calling updateEvent");
    }
    
    // create path and map variables
    String localVarPath = "/events/{eventId}"
      .replaceAll("\\{" + "eventId" + "\\}", apiClient.escapeString(eventId.toString()));

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
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        UpdateResponse
      
    > apiResponse = apiClient.invokeAPI("EventsContributionApi.updateEvent", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, updateEventResponseTypeMap, false);

    return apiResponse;

  }
}
