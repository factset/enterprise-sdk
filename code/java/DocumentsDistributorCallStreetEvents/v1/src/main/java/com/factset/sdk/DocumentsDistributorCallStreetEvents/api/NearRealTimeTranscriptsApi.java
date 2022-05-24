package com.factset.sdk.DocumentsDistributorCallStreetEvents.api;

import com.factset.sdk.DocumentsDistributorCallStreetEvents.ApiException;
import com.factset.sdk.DocumentsDistributorCallStreetEvents.ApiClient;
import com.factset.sdk.DocumentsDistributorCallStreetEvents.ApiResponse;
import com.factset.sdk.DocumentsDistributorCallStreetEvents.Configuration;
import com.factset.sdk.DocumentsDistributorCallStreetEvents.Pair;

import javax.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.DocumentsDistributorCallStreetEvents.models.Error;
import com.factset.sdk.DocumentsDistributorCallStreetEvents.models.IndexedNRT;
import com.factset.sdk.DocumentsDistributorCallStreetEvents.models.NRTCalls;
import com.factset.sdk.DocumentsDistributorCallStreetEvents.models.NRTCalls400Response;
import com.factset.sdk.DocumentsDistributorCallStreetEvents.models.NRTSnippets;
import com.factset.sdk.DocumentsDistributorCallStreetEvents.models.NRTSnippets400Response;
import com.factset.sdk.DocumentsDistributorCallStreetEvents.models.NRTSpeakerids;
import com.factset.sdk.DocumentsDistributorCallStreetEvents.models.NRTSpeakerids400Response;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
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
    getBulkDocumentsNrtV1CallsResponseTypeMap.put(200, new GenericType<NRTCalls>(){});
    getBulkDocumentsNrtV1CallsResponseTypeMap.put(400, new GenericType<NRTCalls400Response>(){});
    getBulkDocumentsNrtV1CallsResponseTypeMap.put(401, new GenericType<Error>(){});
    getBulkDocumentsNrtV1CallsResponseTypeMap.put(403, new GenericType<Error>(){});
    getBulkDocumentsNrtV1CallsResponseTypeMap.put(500, new GenericType<Error>(){});
  }
  private static final Map<Integer, GenericType> getBulkDocumentsNrtV1IndexedNrtResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getBulkDocumentsNrtV1IndexedNrtResponseTypeMap.put(200, new GenericType<IndexedNRT>(){});
    getBulkDocumentsNrtV1IndexedNrtResponseTypeMap.put(400, new GenericType<NRTSnippets400Response>(){});
    getBulkDocumentsNrtV1IndexedNrtResponseTypeMap.put(401, new GenericType<Error>(){});
    getBulkDocumentsNrtV1IndexedNrtResponseTypeMap.put(403, new GenericType<Error>(){});
    getBulkDocumentsNrtV1IndexedNrtResponseTypeMap.put(500, new GenericType<Error>(){});
  }
  private static final Map<Integer, GenericType> getBulkDocumentsNrtV1ListSnippetsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getBulkDocumentsNrtV1ListSnippetsResponseTypeMap.put(200, new GenericType<NRTSnippets>(){});
    getBulkDocumentsNrtV1ListSnippetsResponseTypeMap.put(400, new GenericType<NRTSnippets400Response>(){});
    getBulkDocumentsNrtV1ListSnippetsResponseTypeMap.put(401, new GenericType<Error>(){});
    getBulkDocumentsNrtV1ListSnippetsResponseTypeMap.put(403, new GenericType<Error>(){});
    getBulkDocumentsNrtV1ListSnippetsResponseTypeMap.put(500, new GenericType<Error>(){});
  }
  private static final Map<Integer, GenericType> getBulkDocumentsNrtV1SpeakeridsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getBulkDocumentsNrtV1SpeakeridsResponseTypeMap.put(200, new GenericType<NRTSpeakerids>(){});
    getBulkDocumentsNrtV1SpeakeridsResponseTypeMap.put(400, new GenericType<NRTSpeakerids400Response>(){});
    getBulkDocumentsNrtV1SpeakeridsResponseTypeMap.put(401, new GenericType<Error>(){});
    getBulkDocumentsNrtV1SpeakeridsResponseTypeMap.put(403, new GenericType<Error>(){});
    getBulkDocumentsNrtV1SpeakeridsResponseTypeMap.put(500, new GenericType<Error>(){});
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
   * Returns the active calls happening at the moment
   * Returns the active calls happening at the moment
   * @param sort Enables to get the data in chronological or reverse chronological order based on startDate. Results are in reverse chronological order if this parameter is not used (optional, default to -startDate)
   * @param reportId Unique identifier for an event (optional)
   * @param audioSourceId Unique Id for an internal recording specific to reportId. For example, reportId X would have multiple recordings from different source (dial-in or webcast).One reportId can have multiple audiosource ids. (optional)
   * @param entityId Factset entity level identifier for the company hosting the event (optional)
   * @param ticker Ticker-region identifier for the company hosting the event (optional)
   * @param callStatus Status of the call i.e. ended or inProgress or ewn or issueAtSource (optional)
   * @param paginationLimit Specifies the number of results to return per page.[ Min&#x3D;0 ; Max&#x3D;500 ] (optional)
   * @param paginationOffset Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results (optional)
   * @return NRTCalls
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public NRTCalls getBulkDocumentsNrtV1Calls(String sort, Integer reportId, Integer audioSourceId, String entityId, String ticker, String callStatus, Integer paginationLimit, Integer paginationOffset) throws ApiException {
    return getBulkDocumentsNrtV1CallsWithHttpInfo(sort, reportId, audioSourceId, entityId, ticker, callStatus, paginationLimit, paginationOffset).getData();
  }

  /**
   * Returns the active calls happening at the moment
   * Returns the active calls happening at the moment
   * @param sort Enables to get the data in chronological or reverse chronological order based on startDate. Results are in reverse chronological order if this parameter is not used (optional, default to -startDate)
   * @param reportId Unique identifier for an event (optional)
   * @param audioSourceId Unique Id for an internal recording specific to reportId. For example, reportId X would have multiple recordings from different source (dial-in or webcast).One reportId can have multiple audiosource ids. (optional)
   * @param entityId Factset entity level identifier for the company hosting the event (optional)
   * @param ticker Ticker-region identifier for the company hosting the event (optional)
   * @param callStatus Status of the call i.e. ended or inProgress or ewn or issueAtSource (optional)
   * @param paginationLimit Specifies the number of results to return per page.[ Min&#x3D;0 ; Max&#x3D;500 ] (optional)
   * @param paginationOffset Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results (optional)
   * @return ApiResponse&lt;NRTCalls&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<NRTCalls> getBulkDocumentsNrtV1CallsWithHttpInfo(String sort, Integer reportId, Integer audioSourceId, String entityId, String ticker, String callStatus, Integer paginationLimit, Integer paginationOffset) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/bulk-documents/nrt/v1/calls";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "reportId", reportId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "audioSourceId", audioSourceId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "entityId", entityId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "ticker", ticker));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "callStatus", callStatus));
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
        
        NRTCalls
      
    > apiResponse = apiClient.invokeAPI("NearRealTimeTranscriptsApi.getBulkDocumentsNrtV1Calls", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getBulkDocumentsNrtV1CallsResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Returns the  indexed transcript data  in small increments throughout the duration of an active call.
   * Returns the  indexed transcript data  in small increments throughout the duration of an active call.
   * @param audioSourceId Unique ID for an Internal recording specific to reportID. For example, ReportID X would have multiple recordings from different source (dial-in or webcast). One ReportID can have multiple AudioSource ids. (required)
   * @param reportId Unique identifier for an event (optional)
   * @param paginationLimit Specifies the  number of results to return per page. [ Min&#x3D;0; Max&#x3D;50 ] (optional)
   * @param paginationOffset Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results (optional)
   * @return IndexedNRT
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public IndexedNRT getBulkDocumentsNrtV1IndexedNrt(Integer audioSourceId, Integer reportId, Integer paginationLimit, Integer paginationOffset) throws ApiException {
    return getBulkDocumentsNrtV1IndexedNrtWithHttpInfo(audioSourceId, reportId, paginationLimit, paginationOffset).getData();
  }

  /**
   * Returns the  indexed transcript data  in small increments throughout the duration of an active call.
   * Returns the  indexed transcript data  in small increments throughout the duration of an active call.
   * @param audioSourceId Unique ID for an Internal recording specific to reportID. For example, ReportID X would have multiple recordings from different source (dial-in or webcast). One ReportID can have multiple AudioSource ids. (required)
   * @param reportId Unique identifier for an event (optional)
   * @param paginationLimit Specifies the  number of results to return per page. [ Min&#x3D;0; Max&#x3D;50 ] (optional)
   * @param paginationOffset Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results (optional)
   * @return ApiResponse&lt;IndexedNRT&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<IndexedNRT> getBulkDocumentsNrtV1IndexedNrtWithHttpInfo(Integer audioSourceId, Integer reportId, Integer paginationLimit, Integer paginationOffset) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'audioSourceId' is set
    if (audioSourceId == null) {
      throw new ApiException(400, "Missing the required parameter 'audioSourceId' when calling getBulkDocumentsNrtV1IndexedNrt");
    }
    
    // create path and map variables
    String localVarPath = "/bulk-documents/nrt/v1/indexed-nrt";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "reportId", reportId));
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
        
        IndexedNRT
      
    > apiResponse = apiClient.invokeAPI("NearRealTimeTranscriptsApi.getBulkDocumentsNrtV1IndexedNrt", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getBulkDocumentsNrtV1IndexedNrtResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Returns the latest transcript snippets from an active call
   * Returns the latest snippets from an active call
   * @param audioSourceId Unique ID for an Internal recording specific to reportID. For example, ReportID X would have multiple recordings from different source (dial-in or webcast). One ReportID can have multiple AudioSource ids. (required)
   * @param reportId Unique identifier for an event (optional)
   * @param paginationLimit Specifies the  number of results to return per page. [ Min&#x3D;0; Max&#x3D;500 ] (optional)
   * @param paginationOffset Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results (optional)
   * @return NRTSnippets
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public NRTSnippets getBulkDocumentsNrtV1ListSnippets(Integer audioSourceId, Integer reportId, Integer paginationLimit, Integer paginationOffset) throws ApiException {
    return getBulkDocumentsNrtV1ListSnippetsWithHttpInfo(audioSourceId, reportId, paginationLimit, paginationOffset).getData();
  }

  /**
   * Returns the latest transcript snippets from an active call
   * Returns the latest snippets from an active call
   * @param audioSourceId Unique ID for an Internal recording specific to reportID. For example, ReportID X would have multiple recordings from different source (dial-in or webcast). One ReportID can have multiple AudioSource ids. (required)
   * @param reportId Unique identifier for an event (optional)
   * @param paginationLimit Specifies the  number of results to return per page. [ Min&#x3D;0; Max&#x3D;500 ] (optional)
   * @param paginationOffset Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results (optional)
   * @return ApiResponse&lt;NRTSnippets&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<NRTSnippets> getBulkDocumentsNrtV1ListSnippetsWithHttpInfo(Integer audioSourceId, Integer reportId, Integer paginationLimit, Integer paginationOffset) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'audioSourceId' is set
    if (audioSourceId == null) {
      throw new ApiException(400, "Missing the required parameter 'audioSourceId' when calling getBulkDocumentsNrtV1ListSnippets");
    }
    
    // create path and map variables
    String localVarPath = "/bulk-documents/nrt/v1/list-snippets";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "reportId", reportId));
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
        
        NRTSnippets
      
    > apiResponse = apiClient.invokeAPI("NearRealTimeTranscriptsApi.getBulkDocumentsNrtV1ListSnippets", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getBulkDocumentsNrtV1ListSnippetsResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Returns the latest speakerIds with the confidence scores generated for an active call.
   * Returns the latest speakerIds with the cosine scores(confidence scores) generated for an active call.
   * @param audioSourceId The Unique ID for an Internal recording specific to reportID. For example, ReportID X would have multiple recordings from a different source (dial-in or webcast). One ReportID can have multiple audioSource ids.  (required)
   * @param sort Enables to get the data in chronological or reverse chronological order. Results are in chronological order if this parameter is not used (optional, default to startDate)
   * @param paginationLimit Specifies the number of results to return per page.[ Min&#x3D;0 ; Max&#x3D;500 ] (optional)
   * @param paginationOffset Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results (optional)
   * @return NRTSpeakerids
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public NRTSpeakerids getBulkDocumentsNrtV1Speakerids(Integer audioSourceId, String sort, Integer paginationLimit, Integer paginationOffset) throws ApiException {
    return getBulkDocumentsNrtV1SpeakeridsWithHttpInfo(audioSourceId, sort, paginationLimit, paginationOffset).getData();
  }

  /**
   * Returns the latest speakerIds with the confidence scores generated for an active call.
   * Returns the latest speakerIds with the cosine scores(confidence scores) generated for an active call.
   * @param audioSourceId The Unique ID for an Internal recording specific to reportID. For example, ReportID X would have multiple recordings from a different source (dial-in or webcast). One ReportID can have multiple audioSource ids.  (required)
   * @param sort Enables to get the data in chronological or reverse chronological order. Results are in chronological order if this parameter is not used (optional, default to startDate)
   * @param paginationLimit Specifies the number of results to return per page.[ Min&#x3D;0 ; Max&#x3D;500 ] (optional)
   * @param paginationOffset Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results (optional)
   * @return ApiResponse&lt;NRTSpeakerids&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<NRTSpeakerids> getBulkDocumentsNrtV1SpeakeridsWithHttpInfo(Integer audioSourceId, String sort, Integer paginationLimit, Integer paginationOffset) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'audioSourceId' is set
    if (audioSourceId == null) {
      throw new ApiException(400, "Missing the required parameter 'audioSourceId' when calling getBulkDocumentsNrtV1Speakerids");
    }
    
    // create path and map variables
    String localVarPath = "/bulk-documents/nrt/v1/speakerids";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_sort", sort));
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
        
        NRTSpeakerids
      
    > apiResponse = apiClient.invokeAPI("NearRealTimeTranscriptsApi.getBulkDocumentsNrtV1Speakerids", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getBulkDocumentsNrtV1SpeakeridsResponseTypeMap, false);

    return apiResponse;

  }
}
