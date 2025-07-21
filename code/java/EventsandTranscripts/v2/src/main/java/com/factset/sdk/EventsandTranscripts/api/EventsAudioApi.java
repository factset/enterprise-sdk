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

import com.factset.sdk.EventsandTranscripts.models.AudioRequest;
import com.factset.sdk.EventsandTranscripts.models.AudioResponse;
import com.factset.sdk.EventsandTranscripts.models.Error;
import com.factset.sdk.EventsandTranscripts.models.EventsAudioHistoryResponse;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class EventsAudioApi {
  private ApiClient apiClient;

  public EventsAudioApi() {
    this(Configuration.getDefaultApiClient());
  }

  public EventsAudioApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> getAudioHistoryFilesResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getAudioHistoryFilesResponseTypeMap.put(200, new GenericType<EventsAudioHistoryResponse>(){});
    getAudioHistoryFilesResponseTypeMap.put(400, new GenericType<Error>(){});
    getAudioHistoryFilesResponseTypeMap.put(401, new GenericType<Error>(){});
    getAudioHistoryFilesResponseTypeMap.put(403, new GenericType<Error>(){});
    getAudioHistoryFilesResponseTypeMap.put(500, new GenericType<Error>(){});
  }

  private static final Map<Integer, GenericType> searchEventsAudioResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    searchEventsAudioResponseTypeMap.put(200, new GenericType<AudioResponse>(){});
    searchEventsAudioResponseTypeMap.put(400, new GenericType<Error>(){});
    searchEventsAudioResponseTypeMap.put(401, new GenericType<Error>(){});
    searchEventsAudioResponseTypeMap.put(403, new GenericType<Error>(){});
    searchEventsAudioResponseTypeMap.put(500, new GenericType<Error>(){});
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
   * Retrieve historical audio recordings and related metadata within FactSet coverage.
   *  This endpoint retrieves an object containing a pre-signed URL from which an archive of all audio data for a specified year can be downloaded.  * Returns **untrimmed** historical audio recordings, which include complete audio files such as intro music &amp; non-speaking portions, and related metadata dating back from May 10, 2011 to Sep 30, 2024.  * Returns **trimmed** historical audio recordings, which are audio files with the non-speaking portions removed, and related metadata dating back from May 10, 2011 to Dec 31, 2024. 
   * @param year Specifies the year for which the historical audio recordings and related metadata are to be retrieved.  (required)
   * @param trimmed Specifies if trimmed/untrimmed historical audio recordings should be returned. (optional, default to false)
   * @return EventsAudioHistoryResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The historical audio recordings based on the provided year. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;details\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public EventsAudioHistoryResponse getAudioHistoryFiles(Integer year, Boolean trimmed) throws ApiException {
    return getAudioHistoryFilesWithHttpInfo(year, trimmed).getData();
  }

  /**
   * Retrieve historical audio recordings and related metadata within FactSet coverage.
   *  This endpoint retrieves an object containing a pre-signed URL from which an archive of all audio data for a specified year can be downloaded.  * Returns **untrimmed** historical audio recordings, which include complete audio files such as intro music &amp; non-speaking portions, and related metadata dating back from May 10, 2011 to Sep 30, 2024.  * Returns **trimmed** historical audio recordings, which are audio files with the non-speaking portions removed, and related metadata dating back from May 10, 2011 to Dec 31, 2024. 
   * @param year Specifies the year for which the historical audio recordings and related metadata are to be retrieved.  (required)
   * @param trimmed Specifies if trimmed/untrimmed historical audio recordings should be returned. (optional, default to false)
   * @return ApiResponse&lt;EventsAudioHistoryResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The historical audio recordings based on the provided year. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;details\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<EventsAudioHistoryResponse> getAudioHistoryFilesWithHttpInfo(Integer year, Boolean trimmed) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'year' is set
    if (year == null) {
      throw new ApiException(400, "Missing the required parameter 'year' when calling getAudioHistoryFiles");
    }
    
    // create path and map variables
    String localVarPath = "/audio/history";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "year", year));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "trimmed", trimmed));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        EventsAudioHistoryResponse
      
    > apiResponse = apiClient.invokeAPI("EventsAudioApi.getAudioHistoryFiles", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getAudioHistoryFilesResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Retrieve latest audio recordings and related metadata based on different search criteria.
   * Retrieves the most recent audio recordings and their metadata based on various criteria like date range, upload time, file name, or specific IDs. Use the appropriate parameters within the &#x60;data&#x60; object of the request body to specify the search method. Pagination and sorting are controlled via the &#x60;meta&#x60; object. 
   * @param audioRequest Criteria to search for audio files. Select one mode of search. (required)
   * @return AudioResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The latest audio recordings matching the specified criteria. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons, including invalid parameter combinations or malformed JSON. Please review the \&quot;details\&quot; for more information. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public AudioResponse searchEventsAudio(AudioRequest audioRequest) throws ApiException {
    return searchEventsAudioWithHttpInfo(audioRequest).getData();
  }

  /**
   * Retrieve latest audio recordings and related metadata based on different search criteria.
   * Retrieves the most recent audio recordings and their metadata based on various criteria like date range, upload time, file name, or specific IDs. Use the appropriate parameters within the &#x60;data&#x60; object of the request body to specify the search method. Pagination and sorting are controlled via the &#x60;meta&#x60; object. 
   * @param audioRequest Criteria to search for audio files. Select one mode of search. (required)
   * @return ApiResponse&lt;AudioResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The latest audio recordings matching the specified criteria. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons, including invalid parameter combinations or malformed JSON. Please review the \&quot;details\&quot; for more information. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AudioResponse> searchEventsAudioWithHttpInfo(AudioRequest audioRequest) throws ApiException {
    Object localVarPostBody = audioRequest;
    
    // verify the required parameter 'audioRequest' is set
    if (audioRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'audioRequest' when calling searchEventsAudio");
    }
    
    // create path and map variables
    String localVarPath = "/audio";

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
        
        AudioResponse
      
    > apiResponse = apiClient.invokeAPI("EventsAudioApi.searchEventsAudio", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, searchEventsAudioResponseTypeMap, false);

    return apiResponse;

  }
}
