package com.factset.sdk.EventsandTranscripts.api;

import com.factset.sdk.EventsandTranscripts.ApiException;
import com.factset.sdk.EventsandTranscripts.ApiClient;
import com.factset.sdk.EventsandTranscripts.ApiResponse;
import com.factset.sdk.EventsandTranscripts.Configuration;
import com.factset.sdk.EventsandTranscripts.Pair;

import jakarta.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.EventsandTranscripts.models.Error;
import com.factset.sdk.EventsandTranscripts.models.IndexedNrtResponse;
import com.factset.sdk.EventsandTranscripts.models.NrtCallsRequest;
import com.factset.sdk.EventsandTranscripts.models.NrtCallsResponse;
import com.factset.sdk.EventsandTranscripts.models.NrtSpeakerIdsResponse;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class NearRealTimeTranscriptsApi {
  private ApiClient apiClient;

  public NearRealTimeTranscriptsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public NearRealTimeTranscriptsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> getIndexedNrtResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getIndexedNrtResponseTypeMap.put(200, new GenericType<IndexedNrtResponse>(){});
    getIndexedNrtResponseTypeMap.put(400, new GenericType<Error>(){});
    getIndexedNrtResponseTypeMap.put(401, new GenericType<Error>(){});
    getIndexedNrtResponseTypeMap.put(403, new GenericType<Error>(){});
    getIndexedNrtResponseTypeMap.put(500, new GenericType<Error>(){});
  }

  private static final Map<Integer, GenericType> getSpeakerIdsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getSpeakerIdsResponseTypeMap.put(200, new GenericType<NrtSpeakerIdsResponse>(){});
    getSpeakerIdsResponseTypeMap.put(400, new GenericType<Error>(){});
    getSpeakerIdsResponseTypeMap.put(401, new GenericType<Error>(){});
    getSpeakerIdsResponseTypeMap.put(403, new GenericType<Error>(){});
    getSpeakerIdsResponseTypeMap.put(500, new GenericType<Error>(){});
  }

  private static final Map<Integer, GenericType> searchNrtCallsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    searchNrtCallsResponseTypeMap.put(200, new GenericType<NrtCallsResponse>(){});
    searchNrtCallsResponseTypeMap.put(400, new GenericType<Error>(){});
    searchNrtCallsResponseTypeMap.put(401, new GenericType<Error>(){});
    searchNrtCallsResponseTypeMap.put(403, new GenericType<Error>(){});
    searchNrtCallsResponseTypeMap.put(500, new GenericType<Error>(){});
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
   * Returns the  indexed transcript data  in small increments throughout the duration of an active call.
   * Returns the  indexed transcript data  in small increments throughout the duration of an active call.
   * @param audioSourceId Unique ID for an Internal recording specific to reportID. For example, ReportID X would have multiple recordings from different source (dial-in or webcast). One ReportID can have multiple AudioSourceIDs. (required)
   * @param paginationLimit Number of results to return per page. (optional, default to 25)
   * @param paginationOffset Specifies the starting point for pagination. This parameter is used to identify the beginning of the next set of results. (optional, default to 0)
   * @return IndexedNrtResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The transcript data that has been indexed according to the specific audio source ID. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses.  </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization.  </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public IndexedNrtResponse getIndexedNrt(Integer audioSourceId, Integer paginationLimit, Integer paginationOffset) throws ApiException {
    return getIndexedNrtWithHttpInfo(audioSourceId, paginationLimit, paginationOffset).getData();
  }

  /**
   * Returns the  indexed transcript data  in small increments throughout the duration of an active call.
   * Returns the  indexed transcript data  in small increments throughout the duration of an active call.
   * @param audioSourceId Unique ID for an Internal recording specific to reportID. For example, ReportID X would have multiple recordings from different source (dial-in or webcast). One ReportID can have multiple AudioSourceIDs. (required)
   * @param paginationLimit Number of results to return per page. (optional, default to 25)
   * @param paginationOffset Specifies the starting point for pagination. This parameter is used to identify the beginning of the next set of results. (optional, default to 0)
   * @return ApiResponse&lt;IndexedNrtResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The transcript data that has been indexed according to the specific audio source ID. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses.  </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization.  </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<IndexedNrtResponse> getIndexedNrtWithHttpInfo(Integer audioSourceId, Integer paginationLimit, Integer paginationOffset) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'audioSourceId' is set
    if (audioSourceId == null) {
      throw new ApiException(400, "Missing the required parameter 'audioSourceId' when calling getIndexedNrt");
    }
    
    // create path and map variables
    String localVarPath = "/nrt/indexed";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "audioSourceId", audioSourceId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_paginationLimit", paginationLimit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_paginationOffset", paginationOffset));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        IndexedNrtResponse
      
    > apiResponse = apiClient.invokeAPI("NearRealTimeTranscriptsApi.getIndexedNrt", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getIndexedNrtResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Returns the latest speakerIds with the confidence scores generated for an active call.
   * Returns the latest speakerIds with the confidence scores generated for an active call.
   * @param audioSourceId Unique ID for an Internal recording specific to reportID. For example, ReportID X would have multiple recordings from different source (dial-in or webcast). One ReportID can have multiple AudioSourceIDs. (required)
   * @param sort Enables sorting data in ascending or descending chronological order based on the start offset of the speaker.  (optional, default to [\&quot;-speakerStartOffset\&quot;])
   * @param paginationLimit Number of results to return per page. (optional, default to 25)
   * @param paginationOffset Specifies the starting point for pagination. This parameter is used to identify the beginning of the next set of results. (optional, default to 0)
   * @return NrtSpeakerIdsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The up-to-date speaker IDs and their associated confidence scores, based on the audio source ID. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses.  </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public NrtSpeakerIdsResponse getSpeakerIds(Integer audioSourceId, java.util.List<String> sort, Integer paginationLimit, Integer paginationOffset) throws ApiException {
    return getSpeakerIdsWithHttpInfo(audioSourceId, sort, paginationLimit, paginationOffset).getData();
  }

  /**
   * Returns the latest speakerIds with the confidence scores generated for an active call.
   * Returns the latest speakerIds with the confidence scores generated for an active call.
   * @param audioSourceId Unique ID for an Internal recording specific to reportID. For example, ReportID X would have multiple recordings from different source (dial-in or webcast). One ReportID can have multiple AudioSourceIDs. (required)
   * @param sort Enables sorting data in ascending or descending chronological order based on the start offset of the speaker.  (optional, default to [\&quot;-speakerStartOffset\&quot;])
   * @param paginationLimit Number of results to return per page. (optional, default to 25)
   * @param paginationOffset Specifies the starting point for pagination. This parameter is used to identify the beginning of the next set of results. (optional, default to 0)
   * @return ApiResponse&lt;NrtSpeakerIdsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The up-to-date speaker IDs and their associated confidence scores, based on the audio source ID. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses.  </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<NrtSpeakerIdsResponse> getSpeakerIdsWithHttpInfo(Integer audioSourceId, java.util.List<String> sort, Integer paginationLimit, Integer paginationOffset) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'audioSourceId' is set
    if (audioSourceId == null) {
      throw new ApiException(400, "Missing the required parameter 'audioSourceId' when calling getSpeakerIds");
    }
    
    // create path and map variables
    String localVarPath = "/nrt/speaker-ids";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "audioSourceId", audioSourceId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "_sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_paginationLimit", paginationLimit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_paginationOffset", paginationOffset));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        NrtSpeakerIdsResponse
      
    > apiResponse = apiClient.invokeAPI("NearRealTimeTranscriptsApi.getSpeakerIds", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getSpeakerIdsResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Returns the active calls happening at the moment based on ticker/entity or specific IDs.
   * Retrieves active Near Real-Time (NRT) calls based on either ticker/entity/status criteria or specific audio source/report IDs. Use the appropriate parameters within the &#x60;data&#x60; object of the request body to specify the search method. Pagination and sorting are controlled via the &#x60;meta&#x60; object. 
   * @param nrtCallsRequest Criteria to search for NRT calls. Select one mode of search. (required)
   * @return NrtCallsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The active calls happening at the moment, matching the specified criteria. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses.  </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization.  </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public NrtCallsResponse searchNrtCalls(NrtCallsRequest nrtCallsRequest) throws ApiException {
    return searchNrtCallsWithHttpInfo(nrtCallsRequest).getData();
  }

  /**
   * Returns the active calls happening at the moment based on ticker/entity or specific IDs.
   * Retrieves active Near Real-Time (NRT) calls based on either ticker/entity/status criteria or specific audio source/report IDs. Use the appropriate parameters within the &#x60;data&#x60; object of the request body to specify the search method. Pagination and sorting are controlled via the &#x60;meta&#x60; object. 
   * @param nrtCallsRequest Criteria to search for NRT calls. Select one mode of search. (required)
   * @return ApiResponse&lt;NrtCallsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The active calls happening at the moment, matching the specified criteria. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses.  </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization.  </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<NrtCallsResponse> searchNrtCallsWithHttpInfo(NrtCallsRequest nrtCallsRequest) throws ApiException {
    Object localVarPostBody = nrtCallsRequest;
    
    // verify the required parameter 'nrtCallsRequest' is set
    if (nrtCallsRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'nrtCallsRequest' when calling searchNrtCalls");
    }
    
    // create path and map variables
    String localVarPath = "/nrt/calls";

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
        
        NrtCallsResponse
      
    > apiResponse = apiClient.invokeAPI("NearRealTimeTranscriptsApi.searchNrtCalls", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, searchNrtCallsResponseTypeMap, false);

    return apiResponse;

  }
}
