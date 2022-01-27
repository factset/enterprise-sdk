package com.factset.sdk.DocumentsDistributorCallStreetEvents.api;

import com.factset.sdk.DocumentsDistributorCallStreetEvents.ApiException;
import com.factset.sdk.DocumentsDistributorCallStreetEvents.ApiClient;
import com.factset.sdk.DocumentsDistributorCallStreetEvents.ApiResponse;
import com.factset.sdk.DocumentsDistributorCallStreetEvents.Configuration;
import com.factset.sdk.DocumentsDistributorCallStreetEvents.Pair;

import javax.ws.rs.core.GenericType;

import com.factset.sdk.DocumentsDistributorCallStreetEvents.models.Error;
import com.factset.sdk.DocumentsDistributorCallStreetEvents.models.EventsAudio;
import com.factset.sdk.DocumentsDistributorCallStreetEvents.models.EventsAudio400Response;
import org.threeten.bp.LocalDate;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class EventsAudioApi {
  private ApiClient apiClient;

  public EventsAudioApi() {
    this(Configuration.getDefaultApiClient());
  }

  public EventsAudioApi(ApiClient apiClient) {
    this.apiClient = apiClient;
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
   * Retrieve audio recordings and metadata within FactSet coverage
   * Gets the latest 25 audio files. Parameters can be used to filter and narrow down the results
   * @param sort Sorts results in chronological order, reverse chronological order and by uploadTime(latest uploaded first). Results are in reverse chronological order by default. (optional, default to -startDate)
   * @param paginationLimit Specifies the number of results to return per page. [ Min&#x3D;0 ; Max&#x3D;500 ] (optional)
   * @param startDate Used in conjuction with endDate. The earliest date of the audio file the API should fetch for (can be in absolute: YYYY-MM-DD or relative date: -1 for yesterday)&#39; (optional)
   * @param paginationOffset Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results (optional)
   * @param endDate Used in conjuction with startDate. The latest date of the audio file the API should fetch for (can be in absolute: YYYY-MM-DD or relative date: 0 for today) (optional)
   * @param reportId Unique identifier for fetching the audio file for an event. The same ID is used for the transcript of the same event (optional)
   * @param ids This parameter filters the results based on ticker-region or Entity ID or the combination of both. A comma is used to separate each identifier (optional)
   * @param sourceCode This parameter filters the results based on Source of the Audio file. Below are the descriptions for each Source Code - * P &#x3D; Phone * W &#x3D; Webcast * V &#x3D; Vendor * I &#x3D; Webcast Replay * F &#x3D; Flash - identical to webcast; can merge with \&quot;W\&quot; in the future * R &#x3D; Replay (Phone Replay) (optional)
   * @param fileName This parameter is used to filter the data on based on the file name. (optional)
   * @param trimmed This parameters helps to search trimmed audio files (optional)
   * @param uploadTime This parameter filters data based on uploadTime relative to the current time, in hours. For example:- uploadTime &#x3D; -15 (fetches audio files between 15 hours ago and now)  Minimum is 1 hour i.e., uploadTime&#x3D; -1  Maximum is 1 week/168 hours i.e., uploadTime&#x3D;-168  While using uploadTime, the startDate and endDate parameters will be ignored (optional)
   * @return EventsAudio
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
  public EventsAudio getDocsDistributorAudioV1ListFiles(String sort, Integer paginationLimit, LocalDate startDate, Integer paginationOffset, LocalDate endDate, Integer reportId, String ids, String sourceCode, String fileName, Boolean trimmed, Integer uploadTime) throws ApiException {
    return getDocsDistributorAudioV1ListFilesWithHttpInfo(sort, paginationLimit, startDate, paginationOffset, endDate, reportId, ids, sourceCode, fileName, trimmed, uploadTime).getData();
  }

  /**
   * Retrieve audio recordings and metadata within FactSet coverage
   * Gets the latest 25 audio files. Parameters can be used to filter and narrow down the results
   * @param sort Sorts results in chronological order, reverse chronological order and by uploadTime(latest uploaded first). Results are in reverse chronological order by default. (optional, default to -startDate)
   * @param paginationLimit Specifies the number of results to return per page. [ Min&#x3D;0 ; Max&#x3D;500 ] (optional)
   * @param startDate Used in conjuction with endDate. The earliest date of the audio file the API should fetch for (can be in absolute: YYYY-MM-DD or relative date: -1 for yesterday)&#39; (optional)
   * @param paginationOffset Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results (optional)
   * @param endDate Used in conjuction with startDate. The latest date of the audio file the API should fetch for (can be in absolute: YYYY-MM-DD or relative date: 0 for today) (optional)
   * @param reportId Unique identifier for fetching the audio file for an event. The same ID is used for the transcript of the same event (optional)
   * @param ids This parameter filters the results based on ticker-region or Entity ID or the combination of both. A comma is used to separate each identifier (optional)
   * @param sourceCode This parameter filters the results based on Source of the Audio file. Below are the descriptions for each Source Code - * P &#x3D; Phone * W &#x3D; Webcast * V &#x3D; Vendor * I &#x3D; Webcast Replay * F &#x3D; Flash - identical to webcast; can merge with \&quot;W\&quot; in the future * R &#x3D; Replay (Phone Replay) (optional)
   * @param fileName This parameter is used to filter the data on based on the file name. (optional)
   * @param trimmed This parameters helps to search trimmed audio files (optional)
   * @param uploadTime This parameter filters data based on uploadTime relative to the current time, in hours. For example:- uploadTime &#x3D; -15 (fetches audio files between 15 hours ago and now)  Minimum is 1 hour i.e., uploadTime&#x3D; -1  Maximum is 1 week/168 hours i.e., uploadTime&#x3D;-168  While using uploadTime, the startDate and endDate parameters will be ignored (optional)
   * @return ApiResponse&lt;EventsAudio&gt;
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
  public ApiResponse<EventsAudio> getDocsDistributorAudioV1ListFilesWithHttpInfo(String sort, Integer paginationLimit, LocalDate startDate, Integer paginationOffset, LocalDate endDate, Integer reportId, String ids, String sourceCode, String fileName, Boolean trimmed, Integer uploadTime) throws ApiException {
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
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "ids", ids));
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

    GenericType<EventsAudio> localVarReturnType = new GenericType<EventsAudio>() {};

    return apiClient.invokeAPI("EventsAudioApi.getDocsDistributorAudioV1ListFiles", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
