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

import com.factset.sdk.IRNNotes.models.CreateNoteDto;
import com.factset.sdk.IRNNotes.models.NewItemDto;
import com.factset.sdk.IRNNotes.models.NoteDto;
import com.factset.sdk.IRNNotes.models.NoteSummaryDto;
import com.factset.sdk.IRNNotes.models.ProblemDetails;
import com.factset.sdk.IRNNotes.models.UpdateNoteDto;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class NotesApi {
  private ApiClient apiClient;

  public NotesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public NotesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> createNoteResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    createNoteResponseTypeMap.put(201, new GenericType<NewItemDto>(){});
    createNoteResponseTypeMap.put(400, new GenericType<ProblemDetails>(){});
  }

  private static final Map<Integer, GenericType> deleteNoteResponseTypeMap = new HashMap<Integer, GenericType>();

  private static final Map<Integer, GenericType> getNoteResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getNoteResponseTypeMap.put(200, new GenericType<NoteDto>(){});
    getNoteResponseTypeMap.put(404, new GenericType<ProblemDetails>(){});
    getNoteResponseTypeMap.put(0, new GenericType<ProblemDetails>(){});
  }

  private static final Map<Integer, GenericType> getNotesResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getNotesResponseTypeMap.put(200, new GenericType<java.util.List<NoteSummaryDto>>(){});
    getNotesResponseTypeMap.put(400, new GenericType<ProblemDetails>(){});
  }

  private static final Map<Integer, GenericType> updateNoteResponseTypeMap = new HashMap<Integer, GenericType>();

  


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
   * Create a note
   * 
   * @param createNoteDto  (required)
   * @param xIRNContributorUsername  (optional)
   * @param xIRNContributorSerial  (optional)
   * @return NewItemDto
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Success - Returns unique identifier of the note created </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     </table>
   */
  public NewItemDto createNote(CreateNoteDto createNoteDto, String xIRNContributorUsername, String xIRNContributorSerial) throws ApiException {
    return createNoteWithHttpInfo(createNoteDto, xIRNContributorUsername, xIRNContributorSerial).getData();
  }

  /**
   * Create a note
   * 
   * @param createNoteDto  (required)
   * @param xIRNContributorUsername  (optional)
   * @param xIRNContributorSerial  (optional)
   * @return ApiResponse&lt;NewItemDto&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Success - Returns unique identifier of the note created </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<NewItemDto> createNoteWithHttpInfo(CreateNoteDto createNoteDto, String xIRNContributorUsername, String xIRNContributorSerial) throws ApiException {
    Object localVarPostBody = createNoteDto;
    
    // verify the required parameter 'createNoteDto' is set
    if (createNoteDto == null) {
      throw new ApiException(400, "Missing the required parameter 'createNoteDto' when calling createNote");
    }
    
    // create path and map variables
    String localVarPath = "/notes";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();


    if (xIRNContributorUsername != null)
      localVarHeaderParams.put("X-IRN-Contributor-Username", apiClient.parameterToString(xIRNContributorUsername));
if (xIRNContributorSerial != null)
      localVarHeaderParams.put("X-IRN-Contributor-Serial", apiClient.parameterToString(xIRNContributorSerial));

    
    
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
      
    > apiResponse = apiClient.invokeAPI("NotesApi.createNote", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, createNoteResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Delete a Note
   * 
   * @param noteId  (required)
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
  public void deleteNote(java.util.UUID noteId) throws ApiException {
    deleteNoteWithHttpInfo(noteId);
  }

  /**
   * Delete a Note
   * 
   * @param noteId  (required)
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
  public ApiResponse<Void> deleteNoteWithHttpInfo(java.util.UUID noteId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'noteId' is set
    if (noteId == null) {
      throw new ApiException(400, "Missing the required parameter 'noteId' when calling deleteNote");
    }
    
    // create path and map variables
    String localVarPath = "/notes/{noteId}"
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
      Void
    > apiResponse = apiClient.invokeAPI("NotesApi.deleteNote", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, deleteNoteResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Get details of a note
   * 
   * @param noteId Note Id (required)
   * @return NoteDto
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
     </table>
   */
  public NoteDto getNote(java.util.UUID noteId) throws ApiException {
    return getNoteWithHttpInfo(noteId).getData();
  }

  /**
   * Get details of a note
   * 
   * @param noteId Note Id (required)
   * @return ApiResponse&lt;NoteDto&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<NoteDto> getNoteWithHttpInfo(java.util.UUID noteId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'noteId' is set
    if (noteId == null) {
      throw new ApiException(400, "Missing the required parameter 'noteId' when calling getNote");
    }
    
    // create path and map variables
    String localVarPath = "/notes/{noteId}"
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
        
        NoteDto
      
    > apiResponse = apiClient.invokeAPI("NotesApi.getNote", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getNoteResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Get all the notes in the specified date range filtered on the given identifiers
   * 
   * @param start StartDate (optional)
   * @param end EndDate (optional)
   * @param identifiers Set of identifiers to filter on (optional)
   * @param authors Set of authors to filter on (optional)
   * @param subjects Set of subjects to filter on (optional)
   * @param recommendations Set of recommendations to filter on (optional)
   * @param sentiments Set of sentiments to filter on (optional)
   * @param limit Limit on the number of notes retrieved (optional)
   * @param offset Fetch notes after the offset (optional)
   * @param modifiedSince Only return notes which have been modified or created since a particular time (optional)
   * @param states Set of states to filter on (optional)
   * @param filterOnRelatedSymbols Include notes whose related symbols match the identifier filter (optional, default to false)
   * @param includeRelatedEntities When set to true fetches notes tagged with all the entities related to identifiers param (optional, default to false)
   * @param xIRNIncludeDeleted  (optional, default to false)
   * @return java.util.List<NoteSummaryDto>
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     </table>
   */
  public java.util.List<NoteSummaryDto> getNotes(String start, String end, java.util.List<String> identifiers, java.util.List<java.util.UUID> authors, java.util.List<java.util.UUID> subjects, java.util.List<java.util.UUID> recommendations, java.util.List<java.util.UUID> sentiments, Integer limit, Integer offset, String modifiedSince, java.util.List<String> states, Boolean filterOnRelatedSymbols, Boolean includeRelatedEntities, Boolean xIRNIncludeDeleted) throws ApiException {
    return getNotesWithHttpInfo(start, end, identifiers, authors, subjects, recommendations, sentiments, limit, offset, modifiedSince, states, filterOnRelatedSymbols, includeRelatedEntities, xIRNIncludeDeleted).getData();
  }

  /**
   * Get all the notes in the specified date range filtered on the given identifiers
   * 
   * @param start StartDate (optional)
   * @param end EndDate (optional)
   * @param identifiers Set of identifiers to filter on (optional)
   * @param authors Set of authors to filter on (optional)
   * @param subjects Set of subjects to filter on (optional)
   * @param recommendations Set of recommendations to filter on (optional)
   * @param sentiments Set of sentiments to filter on (optional)
   * @param limit Limit on the number of notes retrieved (optional)
   * @param offset Fetch notes after the offset (optional)
   * @param modifiedSince Only return notes which have been modified or created since a particular time (optional)
   * @param states Set of states to filter on (optional)
   * @param filterOnRelatedSymbols Include notes whose related symbols match the identifier filter (optional, default to false)
   * @param includeRelatedEntities When set to true fetches notes tagged with all the entities related to identifiers param (optional, default to false)
   * @param xIRNIncludeDeleted  (optional, default to false)
   * @return ApiResponse&lt;java.util.List<NoteSummaryDto>&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<java.util.List<NoteSummaryDto>> getNotesWithHttpInfo(String start, String end, java.util.List<String> identifiers, java.util.List<java.util.UUID> authors, java.util.List<java.util.UUID> subjects, java.util.List<java.util.UUID> recommendations, java.util.List<java.util.UUID> sentiments, Integer limit, Integer offset, String modifiedSince, java.util.List<String> states, Boolean filterOnRelatedSymbols, Boolean includeRelatedEntities, Boolean xIRNIncludeDeleted) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/notes";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start", start));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end", end));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "identifiers", identifiers));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "authors", authors));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "subjects", subjects));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "recommendations", recommendations));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "sentiments", sentiments));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "modifiedSince", modifiedSince));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "states", states));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filterOnRelatedSymbols", filterOnRelatedSymbols));
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
        
        java.util.List<NoteSummaryDto>
      
    > apiResponse = apiClient.invokeAPI("NotesApi.getNotes", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getNotesResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Updates a note by replacing existing note with new data
   * 
   * @param noteId Note Id (required)
   * @param updateNoteDto The new data for the note (optional)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
   */
  public void updateNote(java.util.UUID noteId, UpdateNoteDto updateNoteDto) throws ApiException {
    updateNoteWithHttpInfo(noteId, updateNoteDto);
  }

  /**
   * Updates a note by replacing existing note with new data
   * 
   * @param noteId Note Id (required)
   * @param updateNoteDto The new data for the note (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> updateNoteWithHttpInfo(java.util.UUID noteId, UpdateNoteDto updateNoteDto) throws ApiException {
    Object localVarPostBody = updateNoteDto;
    
    // verify the required parameter 'noteId' is set
    if (noteId == null) {
      throw new ApiException(400, "Missing the required parameter 'noteId' when calling updateNote");
    }
    
    // create path and map variables
    String localVarPath = "/notes/{noteId}"
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
      "application/json-patch+json", "application/json", "text/json", "application/_*+json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
      Void
    > apiResponse = apiClient.invokeAPI("NotesApi.updateNote", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, updateNoteResponseTypeMap, false);

    return apiResponse;

  }
}
