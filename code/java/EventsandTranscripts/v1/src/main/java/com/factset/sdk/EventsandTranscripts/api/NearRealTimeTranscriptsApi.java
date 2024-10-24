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
import com.factset.sdk.EventsandTranscripts.models.IndexedNrt;
import com.factset.sdk.EventsandTranscripts.models.NrtCalls;
import com.factset.sdk.EventsandTranscripts.models.NrtSpeakerIds;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class NearRealTimeTranscriptsApi {
  private ApiClient apiClient;

  public NearRealTimeTranscriptsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public NearRealTimeTranscriptsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> getBulkDocumentsNrtV1CallsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getBulkDocumentsNrtV1CallsResponseTypeMap.put(200, new GenericType<NrtCalls>(){});
    getBulkDocumentsNrtV1CallsResponseTypeMap.put(400, new GenericType<Error>(){});
    getBulkDocumentsNrtV1CallsResponseTypeMap.put(401, new GenericType<Error>(){});
    getBulkDocumentsNrtV1CallsResponseTypeMap.put(403, new GenericType<Error>(){});
    getBulkDocumentsNrtV1CallsResponseTypeMap.put(500, new GenericType<Error>(){});
  }

  private static final Map<Integer, GenericType> getBulkDocumentsNrtV1CallsByAudioSourceIdResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getBulkDocumentsNrtV1CallsByAudioSourceIdResponseTypeMap.put(200, new GenericType<NrtCalls>(){});
    getBulkDocumentsNrtV1CallsByAudioSourceIdResponseTypeMap.put(400, new GenericType<Error>(){});
    getBulkDocumentsNrtV1CallsByAudioSourceIdResponseTypeMap.put(401, new GenericType<Error>(){});
    getBulkDocumentsNrtV1CallsByAudioSourceIdResponseTypeMap.put(403, new GenericType<Error>(){});
    getBulkDocumentsNrtV1CallsByAudioSourceIdResponseTypeMap.put(500, new GenericType<Error>(){});
  }

  private static final Map<Integer, GenericType> getBulkDocumentsNrtV1IndexedrtResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getBulkDocumentsNrtV1IndexedrtResponseTypeMap.put(200, new GenericType<IndexedNrt>(){});
    getBulkDocumentsNrtV1IndexedrtResponseTypeMap.put(400, new GenericType<Error>(){});
    getBulkDocumentsNrtV1IndexedrtResponseTypeMap.put(401, new GenericType<Error>(){});
    getBulkDocumentsNrtV1IndexedrtResponseTypeMap.put(403, new GenericType<Error>(){});
    getBulkDocumentsNrtV1IndexedrtResponseTypeMap.put(500, new GenericType<Error>(){});
  }

  private static final Map<Integer, GenericType> getBulkDocumentsNrtV1SpeakerIdsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getBulkDocumentsNrtV1SpeakerIdsResponseTypeMap.put(200, new GenericType<NrtSpeakerIds>(){});
    getBulkDocumentsNrtV1SpeakerIdsResponseTypeMap.put(400, new GenericType<Error>(){});
    getBulkDocumentsNrtV1SpeakerIdsResponseTypeMap.put(401, new GenericType<Error>(){});
    getBulkDocumentsNrtV1SpeakerIdsResponseTypeMap.put(403, new GenericType<Error>(){});
    getBulkDocumentsNrtV1SpeakerIdsResponseTypeMap.put(500, new GenericType<Error>(){});
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
   * Returns the active calls happening at the moment based on ticker,call status and entity ID.
   * Returns the active calls happening at the moment
   * @param ticker Ticker-region identifier for the company hosting the event. (optional)
   * @param entityId Factset entity level identifier for the company hosting the event. (optional)
   * @param callStatus Status of the call, i.e., Ended, InProgress, EndedWithoutNotification, or IssueAtSource. (optional)
   * @param sort Enables sorting data in ascending or descending chronological order based on eventDatetimeUtc.  (optional, default to [\&quot;-eventDatetimeUtc\&quot;])
   * @param paginationLimit Number of results to return per page. Maximum value: 1000.  (optional, default to 25)
   * @param paginationOffset Page number of the results to return. (optional, default to 0)
   * @return NrtCalls
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The active calls happening at the moment, based on the provided ticker, call status, and entity ID. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses.  </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization.  </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public NrtCalls getBulkDocumentsNrtV1Calls(String ticker, String entityId, String callStatus, java.util.List<String> sort, Integer paginationLimit, Integer paginationOffset) throws ApiException {
    return getBulkDocumentsNrtV1CallsWithHttpInfo(ticker, entityId, callStatus, sort, paginationLimit, paginationOffset).getData();
  }

  /**
   * Returns the active calls happening at the moment based on ticker,call status and entity ID.
   * Returns the active calls happening at the moment
   * @param ticker Ticker-region identifier for the company hosting the event. (optional)
   * @param entityId Factset entity level identifier for the company hosting the event. (optional)
   * @param callStatus Status of the call, i.e., Ended, InProgress, EndedWithoutNotification, or IssueAtSource. (optional)
   * @param sort Enables sorting data in ascending or descending chronological order based on eventDatetimeUtc.  (optional, default to [\&quot;-eventDatetimeUtc\&quot;])
   * @param paginationLimit Number of results to return per page. Maximum value: 1000.  (optional, default to 25)
   * @param paginationOffset Page number of the results to return. (optional, default to 0)
   * @return ApiResponse&lt;NrtCalls&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The active calls happening at the moment, based on the provided ticker, call status, and entity ID. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses.  </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization.  </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<NrtCalls> getBulkDocumentsNrtV1CallsWithHttpInfo(String ticker, String entityId, String callStatus, java.util.List<String> sort, Integer paginationLimit, Integer paginationOffset) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/nrt/by-ticker";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "ticker", ticker));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "entityId", entityId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "callStatus", callStatus));
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
        
        NrtCalls
      
    > apiResponse = apiClient.invokeAPI("NearRealTimeTranscriptsApi.getBulkDocumentsNrtV1Calls", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getBulkDocumentsNrtV1CallsResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Returns the active calls happening at the moment based on audio source ID and report ID.
   * Returns the active calls happening at the moment
   * @param audioSourceId Unique ID for an Internal recording specific to reportID. For example, ReportID X would have multiple recordings from different source (dial-in or webcast). One ReportID can have multiple AudioSourceIDs. (optional)
   * @param reportId Unique identifier for an event. (optional)
   * @param sort Enables sorting data in ascending or descending chronological order based on eventDatetimeUtc.  (optional, default to [\&quot;-eventDatetimeUtc\&quot;])
   * @param paginationLimit Number of results to return per page. Maximum value: 1000.  (optional, default to 25)
   * @param paginationOffset Page number of the results to return. (optional, default to 0)
   * @return NrtCalls
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The active calls happening at the moment, based on IDs. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses.  </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization.  </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public NrtCalls getBulkDocumentsNrtV1CallsByAudioSourceId(Integer audioSourceId, Integer reportId, java.util.List<String> sort, Integer paginationLimit, Integer paginationOffset) throws ApiException {
    return getBulkDocumentsNrtV1CallsByAudioSourceIdWithHttpInfo(audioSourceId, reportId, sort, paginationLimit, paginationOffset).getData();
  }

  /**
   * Returns the active calls happening at the moment based on audio source ID and report ID.
   * Returns the active calls happening at the moment
   * @param audioSourceId Unique ID for an Internal recording specific to reportID. For example, ReportID X would have multiple recordings from different source (dial-in or webcast). One ReportID can have multiple AudioSourceIDs. (optional)
   * @param reportId Unique identifier for an event. (optional)
   * @param sort Enables sorting data in ascending or descending chronological order based on eventDatetimeUtc.  (optional, default to [\&quot;-eventDatetimeUtc\&quot;])
   * @param paginationLimit Number of results to return per page. Maximum value: 1000.  (optional, default to 25)
   * @param paginationOffset Page number of the results to return. (optional, default to 0)
   * @return ApiResponse&lt;NrtCalls&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The active calls happening at the moment, based on IDs. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses.  </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization.  </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<NrtCalls> getBulkDocumentsNrtV1CallsByAudioSourceIdWithHttpInfo(Integer audioSourceId, Integer reportId, java.util.List<String> sort, Integer paginationLimit, Integer paginationOffset) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/nrt/by-ids";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "audioSourceId", audioSourceId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "reportId", reportId));
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
        
        NrtCalls
      
    > apiResponse = apiClient.invokeAPI("NearRealTimeTranscriptsApi.getBulkDocumentsNrtV1CallsByAudioSourceId", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getBulkDocumentsNrtV1CallsByAudioSourceIdResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Returns the  indexed transcript data  in small increments throughout the duration of an active call.
   * Returns the  indexed transcript data  in small increments throughout the duration of an active call.
   * @param audioSourceId Unique ID for an Internal recording specific to reportID. For example, ReportID X would have multiple recordings from different source (dial-in or webcast). One ReportID can have multiple AudioSourceIDs. (required)
   * @param paginationLimit Number of results to return per page. (optional, default to 25)
   * @param paginationOffset Page number of the results to return. (optional, default to 0)
   * @return IndexedNrt
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
  public IndexedNrt getBulkDocumentsNrtV1Indexedrt(Integer audioSourceId, Integer paginationLimit, Integer paginationOffset) throws ApiException {
    return getBulkDocumentsNrtV1IndexedrtWithHttpInfo(audioSourceId, paginationLimit, paginationOffset).getData();
  }

  /**
   * Returns the  indexed transcript data  in small increments throughout the duration of an active call.
   * Returns the  indexed transcript data  in small increments throughout the duration of an active call.
   * @param audioSourceId Unique ID for an Internal recording specific to reportID. For example, ReportID X would have multiple recordings from different source (dial-in or webcast). One ReportID can have multiple AudioSourceIDs. (required)
   * @param paginationLimit Number of results to return per page. (optional, default to 25)
   * @param paginationOffset Page number of the results to return. (optional, default to 0)
   * @return ApiResponse&lt;IndexedNrt&gt;
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
  public ApiResponse<IndexedNrt> getBulkDocumentsNrtV1IndexedrtWithHttpInfo(Integer audioSourceId, Integer paginationLimit, Integer paginationOffset) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'audioSourceId' is set
    if (audioSourceId == null) {
      throw new ApiException(400, "Missing the required parameter 'audioSourceId' when calling getBulkDocumentsNrtV1Indexedrt");
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
        
        IndexedNrt
      
    > apiResponse = apiClient.invokeAPI("NearRealTimeTranscriptsApi.getBulkDocumentsNrtV1Indexedrt", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getBulkDocumentsNrtV1IndexedrtResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Returns the latest speakerIds with the confidence scores generated for an active call.
   * Returns the latest speakerIds with the confidence scores generated for an active call.
   * @param audioSourceId Unique ID for an Internal recording specific to reportID. For example, ReportID X would have multiple recordings from different source (dial-in or webcast). One ReportID can have multiple AudioSourceIDs. (required)
   * @param sort Enables sorting data in ascending or descending chronological order based on the start offset of the speaker.  (optional, default to [\&quot;-speakerStartOffset\&quot;])
   * @param paginationLimit Number of results to return per page. Maximum value: 1000.  (optional, default to 25)
   * @param paginationOffset Page number of the results to return. (optional, default to 0)
   * @return NrtSpeakerIds
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
  public NrtSpeakerIds getBulkDocumentsNrtV1SpeakerIds(Integer audioSourceId, java.util.List<String> sort, Integer paginationLimit, Integer paginationOffset) throws ApiException {
    return getBulkDocumentsNrtV1SpeakerIdsWithHttpInfo(audioSourceId, sort, paginationLimit, paginationOffset).getData();
  }

  /**
   * Returns the latest speakerIds with the confidence scores generated for an active call.
   * Returns the latest speakerIds with the confidence scores generated for an active call.
   * @param audioSourceId Unique ID for an Internal recording specific to reportID. For example, ReportID X would have multiple recordings from different source (dial-in or webcast). One ReportID can have multiple AudioSourceIDs. (required)
   * @param sort Enables sorting data in ascending or descending chronological order based on the start offset of the speaker.  (optional, default to [\&quot;-speakerStartOffset\&quot;])
   * @param paginationLimit Number of results to return per page. Maximum value: 1000.  (optional, default to 25)
   * @param paginationOffset Page number of the results to return. (optional, default to 0)
   * @return ApiResponse&lt;NrtSpeakerIds&gt;
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
  public ApiResponse<NrtSpeakerIds> getBulkDocumentsNrtV1SpeakerIdsWithHttpInfo(Integer audioSourceId, java.util.List<String> sort, Integer paginationLimit, Integer paginationOffset) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'audioSourceId' is set
    if (audioSourceId == null) {
      throw new ApiException(400, "Missing the required parameter 'audioSourceId' when calling getBulkDocumentsNrtV1SpeakerIds");
    }
    
    // create path and map variables
    String localVarPath = "/nrt/speakerids";

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
        
        NrtSpeakerIds
      
    > apiResponse = apiClient.invokeAPI("NearRealTimeTranscriptsApi.getBulkDocumentsNrtV1SpeakerIds", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getBulkDocumentsNrtV1SpeakerIdsResponseTypeMap, false);

    return apiResponse;

  }
}
