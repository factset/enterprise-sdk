package com.factset.sdk.DocumentsDistributorCallStreetEvents.api;

import com.factset.sdk.DocumentsDistributorCallStreetEvents.ApiException;
import com.factset.sdk.DocumentsDistributorCallStreetEvents.ApiClient;
import com.factset.sdk.DocumentsDistributorCallStreetEvents.ApiResponse;
import com.factset.sdk.DocumentsDistributorCallStreetEvents.Configuration;
import com.factset.sdk.DocumentsDistributorCallStreetEvents.Pair;

import jakarta.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.DocumentsDistributorCallStreetEvents.models.Error;
import com.factset.sdk.DocumentsDistributorCallStreetEvents.models.EventsAudio;
import com.factset.sdk.DocumentsDistributorCallStreetEvents.models.EventsAudio400Response;
import com.factset.sdk.DocumentsDistributorCallStreetEvents.models.EventsAudioHistory;
import com.factset.sdk.DocumentsDistributorCallStreetEvents.models.EventsAudioHistory400Response;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class EventsAudioApi {
  private ApiClient apiClient;

  public EventsAudioApi() {
    this(Configuration.getDefaultApiClient());
  }

  public EventsAudioApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> getDocsDistributorAudioV1HistoryFilesResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getDocsDistributorAudioV1HistoryFilesResponseTypeMap.put(200, new GenericType<EventsAudioHistory>(){});
    getDocsDistributorAudioV1HistoryFilesResponseTypeMap.put(400, new GenericType<EventsAudioHistory400Response>(){});
    getDocsDistributorAudioV1HistoryFilesResponseTypeMap.put(401, new GenericType<Error>(){});
    getDocsDistributorAudioV1HistoryFilesResponseTypeMap.put(403, new GenericType<Error>(){});
    getDocsDistributorAudioV1HistoryFilesResponseTypeMap.put(500, new GenericType<Error>(){});
  }

  private static final Map<Integer, GenericType> getDocsDistributorAudioV1ListFilesResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getDocsDistributorAudioV1ListFilesResponseTypeMap.put(200, new GenericType<EventsAudio>(){});
    getDocsDistributorAudioV1ListFilesResponseTypeMap.put(400, new GenericType<EventsAudio400Response>(){});
    getDocsDistributorAudioV1ListFilesResponseTypeMap.put(401, new GenericType<Error>(){});
    getDocsDistributorAudioV1ListFilesResponseTypeMap.put(403, new GenericType<Error>(){});
    getDocsDistributorAudioV1ListFilesResponseTypeMap.put(500, new GenericType<Error>(){});
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
   *  * Returns the **untrimmed** historical audio recordings and related metadata dating back from May 10, 2011 to Sep 30, 2022.  * Returns the **trimmed** historical audio recordings and related metadata dating back from May 10, 2011 to Dec 31, 2022.    Query parameters can be used to filter and narrow down the results. 
   * @param paginationLimit Specifies the number of results to return per page. [ Min&#x3D;0 ; Max&#x3D;500 ] (optional, default to 25)
   * @param paginationOffset Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. (optional, default to 0)
   * @param year Specifies the year for which the historical audio recordings and related metadata are to be retrieved. (optional)
   * @param trimmed Specifies if trimmed/untrimmed historical audio recordings should be returned. (optional, default to false)
   * @return EventsAudioHistory
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Array of presigned downloadable URLs consisting of historical audio recordings with related metadata. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;details\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public EventsAudioHistory getDocsDistributorAudioV1HistoryFiles(Integer paginationLimit, Integer paginationOffset, Integer year, Boolean trimmed) throws ApiException {
    return getDocsDistributorAudioV1HistoryFilesWithHttpInfo(paginationLimit, paginationOffset, year, trimmed).getData();
  }

  /**
   * Retrieve historical audio recordings and related metadata within FactSet coverage.
   *  * Returns the **untrimmed** historical audio recordings and related metadata dating back from May 10, 2011 to Sep 30, 2022.  * Returns the **trimmed** historical audio recordings and related metadata dating back from May 10, 2011 to Dec 31, 2022.    Query parameters can be used to filter and narrow down the results. 
   * @param paginationLimit Specifies the number of results to return per page. [ Min&#x3D;0 ; Max&#x3D;500 ] (optional, default to 25)
   * @param paginationOffset Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. (optional, default to 0)
   * @param year Specifies the year for which the historical audio recordings and related metadata are to be retrieved. (optional)
   * @param trimmed Specifies if trimmed/untrimmed historical audio recordings should be returned. (optional, default to false)
   * @return ApiResponse&lt;EventsAudioHistory&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Array of presigned downloadable URLs consisting of historical audio recordings with related metadata. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;details\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<EventsAudioHistory> getDocsDistributorAudioV1HistoryFilesWithHttpInfo(Integer paginationLimit, Integer paginationOffset, Integer year, Boolean trimmed) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/docs-distributor/audio/v1/history-files";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_paginationLimit", paginationLimit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_paginationOffset", paginationOffset));
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
        
        EventsAudioHistory
      
    > apiResponse = apiClient.invokeAPI("EventsAudioApi.getDocsDistributorAudioV1HistoryFiles", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getDocsDistributorAudioV1HistoryFilesResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Retrieve latest audio recordings and related metadata within FactSet coverage.
   * Returns the latest audio recordings. Query parameters can be used to filter and narrow down the results.
   * @param sort Sorts results in chronological order, reverse chronological order and by uploadTime(latest uploaded first). Results are in reverse chronological order by default. (optional, default to -startDate)
   * @param paginationLimit Specifies the number of results to return per page. [ Min&#x3D;0 ; Max&#x3D;500 ] (optional, default to 25)
   * @param startDate Used in conjuction with endDate. The earliest date of the audio file the API should fetch for (can be in absolute: **YYYY-MM-DD** or relative date: **-1** for yesterday). (optional)
   * @param paginationOffset Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. (optional, default to 0)
   * @param endDate Used in conjuction with startDate. The latest date of the audio file the API should fetch for (can be in absolute: **YYYY-MM-DD** or relative date: **0** for today). (optional)
   * @param reportId Unique identifier for fetching the audio file for an event. The same ID is used for the transcript of the same event. (optional)
   * @param audioSourceId Unique ID for an Internal recording specific to reportID. For example, ReportID X would have multiple recordings from different source (phone or webcast or vendor or replay). One ReportID can have multiple AudioSourceIDs. (optional)
   * @param ids This parameter filters the results based on ticker-region or Entity ID or the combination of both. A comma is used to separate each identifier. (optional)
   * @param sourceCode This parameter filters the results based on Source of the Audio file. Below are the descriptions for each Source Code - * P &#x3D; Phone * W &#x3D; Webcast * V &#x3D; Vendor * I &#x3D; Webcast Replay * F &#x3D; Flash - identical to webcast; can merge with \&quot;W\&quot; in the future * R &#x3D; Replay (Phone Replay) (optional)
   * @param fileName This parameter is used to filter the data on based on the file name. (optional)
   * @param trimmed This parameters helps to search trimmed audio files. (optional)
   * @param uploadTime This parameter filters data based on uploadTime relative to the current time, in hours. For example:- uploadTime &#x3D; -15 (fetches audio files between 15 hours ago and now)  Minimum is 1 hour i.e., uploadTime&#x3D; -1  Maximum is 1 week/168 hours i.e., uploadTime&#x3D;-168  While using uploadTime, the startDate and endDate parameters will be ignored. (optional)
   * @return EventsAudio
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Array of URLs consisting of latest audio recordings and related metadata. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;details\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public EventsAudio getDocsDistributorAudioV1ListFiles(String sort, Integer paginationLimit, String startDate, Integer paginationOffset, String endDate, Integer reportId, Integer audioSourceId, java.util.List<String> ids, String sourceCode, String fileName, Boolean trimmed, Integer uploadTime) throws ApiException {
    return getDocsDistributorAudioV1ListFilesWithHttpInfo(sort, paginationLimit, startDate, paginationOffset, endDate, reportId, audioSourceId, ids, sourceCode, fileName, trimmed, uploadTime).getData();
  }

  /**
   * Retrieve latest audio recordings and related metadata within FactSet coverage.
   * Returns the latest audio recordings. Query parameters can be used to filter and narrow down the results.
   * @param sort Sorts results in chronological order, reverse chronological order and by uploadTime(latest uploaded first). Results are in reverse chronological order by default. (optional, default to -startDate)
   * @param paginationLimit Specifies the number of results to return per page. [ Min&#x3D;0 ; Max&#x3D;500 ] (optional, default to 25)
   * @param startDate Used in conjuction with endDate. The earliest date of the audio file the API should fetch for (can be in absolute: **YYYY-MM-DD** or relative date: **-1** for yesterday). (optional)
   * @param paginationOffset Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. (optional, default to 0)
   * @param endDate Used in conjuction with startDate. The latest date of the audio file the API should fetch for (can be in absolute: **YYYY-MM-DD** or relative date: **0** for today). (optional)
   * @param reportId Unique identifier for fetching the audio file for an event. The same ID is used for the transcript of the same event. (optional)
   * @param audioSourceId Unique ID for an Internal recording specific to reportID. For example, ReportID X would have multiple recordings from different source (phone or webcast or vendor or replay). One ReportID can have multiple AudioSourceIDs. (optional)
   * @param ids This parameter filters the results based on ticker-region or Entity ID or the combination of both. A comma is used to separate each identifier. (optional)
   * @param sourceCode This parameter filters the results based on Source of the Audio file. Below are the descriptions for each Source Code - * P &#x3D; Phone * W &#x3D; Webcast * V &#x3D; Vendor * I &#x3D; Webcast Replay * F &#x3D; Flash - identical to webcast; can merge with \&quot;W\&quot; in the future * R &#x3D; Replay (Phone Replay) (optional)
   * @param fileName This parameter is used to filter the data on based on the file name. (optional)
   * @param trimmed This parameters helps to search trimmed audio files. (optional)
   * @param uploadTime This parameter filters data based on uploadTime relative to the current time, in hours. For example:- uploadTime &#x3D; -15 (fetches audio files between 15 hours ago and now)  Minimum is 1 hour i.e., uploadTime&#x3D; -1  Maximum is 1 week/168 hours i.e., uploadTime&#x3D;-168  While using uploadTime, the startDate and endDate parameters will be ignored. (optional)
   * @return ApiResponse&lt;EventsAudio&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Array of URLs consisting of latest audio recordings and related metadata. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;details\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<EventsAudio> getDocsDistributorAudioV1ListFilesWithHttpInfo(String sort, Integer paginationLimit, String startDate, Integer paginationOffset, String endDate, Integer reportId, Integer audioSourceId, java.util.List<String> ids, String sourceCode, String fileName, Boolean trimmed, Integer uploadTime) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/docs-distributor/audio/v1/list-files";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_paginationLimit", paginationLimit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startDate", startDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_paginationOffset", paginationOffset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "endDate", endDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "reportId", reportId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "audioSourceId", audioSourceId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "ids", ids));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sourceCode", sourceCode));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "fileName", fileName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "trimmed", trimmed));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "uploadTime", uploadTime));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        EventsAudio
      
    > apiResponse = apiClient.invokeAPI("EventsAudioApi.getDocsDistributorAudioV1ListFiles", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getDocsDistributorAudioV1ListFilesResponseTypeMap, false);

    return apiResponse;

  }
}
