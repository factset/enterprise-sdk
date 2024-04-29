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
import com.factset.sdk.EventsandTranscripts.models.EventsAudioDaily;
import com.factset.sdk.EventsandTranscripts.models.EventsAudioDailyFileName;
import com.factset.sdk.EventsandTranscripts.models.EventsAudioDailyIds;
import com.factset.sdk.EventsandTranscripts.models.EventsAudioHistory;
import java.time.LocalDate;

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
    getDocsDistributorAudioV1HistoryFilesResponseTypeMap.put(400, new GenericType<Error>(){});
    getDocsDistributorAudioV1HistoryFilesResponseTypeMap.put(401, new GenericType<Error>(){});
    getDocsDistributorAudioV1HistoryFilesResponseTypeMap.put(403, new GenericType<Error>(){});
    getDocsDistributorAudioV1HistoryFilesResponseTypeMap.put(500, new GenericType<Error>(){});
  }

  private static final Map<Integer, GenericType> getDocsDistributorAudioV1ListFilesDateResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getDocsDistributorAudioV1ListFilesDateResponseTypeMap.put(200, new GenericType<EventsAudioDaily>(){});
    getDocsDistributorAudioV1ListFilesDateResponseTypeMap.put(400, new GenericType<Error>(){});
    getDocsDistributorAudioV1ListFilesDateResponseTypeMap.put(401, new GenericType<Error>(){});
    getDocsDistributorAudioV1ListFilesDateResponseTypeMap.put(403, new GenericType<Error>(){});
    getDocsDistributorAudioV1ListFilesDateResponseTypeMap.put(500, new GenericType<Error>(){});
  }

  private static final Map<Integer, GenericType> getDocsDistributorAudioV1ListFilesFileNameResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getDocsDistributorAudioV1ListFilesFileNameResponseTypeMap.put(200, new GenericType<EventsAudioDailyFileName>(){});
    getDocsDistributorAudioV1ListFilesFileNameResponseTypeMap.put(400, new GenericType<Error>(){});
    getDocsDistributorAudioV1ListFilesFileNameResponseTypeMap.put(401, new GenericType<Error>(){});
    getDocsDistributorAudioV1ListFilesFileNameResponseTypeMap.put(403, new GenericType<Error>(){});
    getDocsDistributorAudioV1ListFilesFileNameResponseTypeMap.put(500, new GenericType<Error>(){});
  }

  private static final Map<Integer, GenericType> getDocsDistributorAudioV1ListFilesIdsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getDocsDistributorAudioV1ListFilesIdsResponseTypeMap.put(200, new GenericType<EventsAudioDailyIds>(){});
    getDocsDistributorAudioV1ListFilesIdsResponseTypeMap.put(400, new GenericType<Error>(){});
    getDocsDistributorAudioV1ListFilesIdsResponseTypeMap.put(401, new GenericType<Error>(){});
    getDocsDistributorAudioV1ListFilesIdsResponseTypeMap.put(403, new GenericType<Error>(){});
    getDocsDistributorAudioV1ListFilesIdsResponseTypeMap.put(500, new GenericType<Error>(){});
  }

  private static final Map<Integer, GenericType> getDocsDistributorAudioV1ListFilesUploadTimeResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getDocsDistributorAudioV1ListFilesUploadTimeResponseTypeMap.put(200, new GenericType<EventsAudioDaily>(){});
    getDocsDistributorAudioV1ListFilesUploadTimeResponseTypeMap.put(400, new GenericType<Error>(){});
    getDocsDistributorAudioV1ListFilesUploadTimeResponseTypeMap.put(401, new GenericType<Error>(){});
    getDocsDistributorAudioV1ListFilesUploadTimeResponseTypeMap.put(403, new GenericType<Error>(){});
    getDocsDistributorAudioV1ListFilesUploadTimeResponseTypeMap.put(500, new GenericType<Error>(){});
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
   *  This endpoint retrieves an object containing a pre-signed URL from which an archive of all audio data for a specified year can be downloaded.  * Returns **untrimmed** historical audio recordings, which include complete audio files such as intro music &amp; non-speaking portions, and related metadata dating back from May 10, 2011 to Sep 30, 2022.  * Returns **trimmed** historical audio recordings, which are audio files with the non-speaking portions removed, and related metadata dating back from May 10, 2011 to Dec 31, 2022. 
   * @param year Specifies the year for which the historical audio recordings and related metadata are to be retrieved.  (required)
   * @param trimmed Specifies if trimmed/untrimmed historical audio recordings should be returned. (optional, default to false)
   * @return EventsAudioHistory
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
  public EventsAudioHistory getDocsDistributorAudioV1HistoryFiles(Integer year, Boolean trimmed) throws ApiException {
    return getDocsDistributorAudioV1HistoryFilesWithHttpInfo(year, trimmed).getData();
  }

  /**
   * Retrieve historical audio recordings and related metadata within FactSet coverage.
   *  This endpoint retrieves an object containing a pre-signed URL from which an archive of all audio data for a specified year can be downloaded.  * Returns **untrimmed** historical audio recordings, which include complete audio files such as intro music &amp; non-speaking portions, and related metadata dating back from May 10, 2011 to Sep 30, 2022.  * Returns **trimmed** historical audio recordings, which are audio files with the non-speaking portions removed, and related metadata dating back from May 10, 2011 to Dec 31, 2022. 
   * @param year Specifies the year for which the historical audio recordings and related metadata are to be retrieved.  (required)
   * @param trimmed Specifies if trimmed/untrimmed historical audio recordings should be returned. (optional, default to false)
   * @return ApiResponse&lt;EventsAudioHistory&gt;
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
  public ApiResponse<EventsAudioHistory> getDocsDistributorAudioV1HistoryFilesWithHttpInfo(Integer year, Boolean trimmed) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'year' is set
    if (year == null) {
      throw new ApiException(400, "Missing the required parameter 'year' when calling getDocsDistributorAudioV1HistoryFiles");
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
        
        EventsAudioHistory
      
    > apiResponse = apiClient.invokeAPI("EventsAudioApi.getDocsDistributorAudioV1HistoryFiles", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getDocsDistributorAudioV1HistoryFilesResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Retrieve latest audio recordings and related metadata within FactSet coverage based on a specific date ranges.
   * Retrieves the most recent audio recordings based on specified dates and allows filtering through both source code and Ids.
   * @param startDate The earliest date of the audio file the API should fetch for.  - Format: Should be absolute (YYYY-MM-DD).  (optional)
   * @param endDate The latest date of the audio file the API should fetch for. - Format: Should be absolute (YYYY-MM-DD).  (optional)
   * @param startDateRelative The earliest date of the feed file the API should fetch based on the file timestamp.  - Format: Specify the date using a relative term as an integer: &#39;0&#39; for today, &#39;-1&#39; for yesterday, &#39;-2&#39; for two days ago, and so forth. Negative values are used to represent past dates.   - *Either &#x60;startDate&#x60; or &#x60;startDateRelative&#x60; should be used, but not both.* - *If both &#x60;startDate&#x60; and &#x60;startDateRelative&#x60; are provided in the same request, the API will return an error.* - *If users provide future dates in requests for &#x60;startDate&#x60; or &#x60;startDateRelative&#x60;, the API will not return any data.*  (optional)
   * @param endDateRelative The latest date of the feed file the API should fetch based on the file timestamp.   Format: Specify the date using a relative term as an integer: &#39;0&#39; for today, &#39;-1&#39; for yesterday, &#39;-2&#39; for two days ago, and so forth. Negative values are used to represent past dates.  - Either &#x60;endDate&#x60; or &#x60;endDateRelative&#x60; should be used, but not both. - If both &#x60;endDate&#x60; and &#x60;endDateRelative&#x60; are provided in the same request, the API will return an error. - If users provide future dates in requests for &#x60;endDate&#x60; or &#x60;endDateRelative&#x60;, the API will not return any data.  (optional)
   * @param sourceCode This parameter filters the results based on Source of the Audio file. Below are the descriptions for each Source Code - * Phone &#x3D; Originated from phone call * Webcast &#x3D; Originated from a webcast * Vendor &#x3D; Received from vendor * WebcastReplay &#x3D; Replay of a webcast * Flash &#x3D; Identical to webcast; can merge with \&quot;Webcast\&quot; in the future * Replay &#x3D; Phone replay (optional)
   * @param ids This parameter filters the results based on ticker-region or Entity ID or the combination of both. A comma is used to separate each identifier.  (optional)
   * @param trimmed This parameter helps to search for trimmed audio files, with the non-speaking portions removed, and related metadata. The data ranges from May 10, 2011 to Dec 31, 2022.  (optional, default to false)
   * @param sort Enables sorting data in ascending or descending chronological order based on startDate.  (optional, default to [\&quot;-startDate\&quot;])
   * @param paginationLimit Specifies the number of results to return per page. (optional, default to 25)
   * @param paginationOffset Page number of the results to return. (optional, default to 0)
   * @return EventsAudioDaily
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The latest audio recordings based on the provided date ranges. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;details\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public EventsAudioDaily getDocsDistributorAudioV1ListFilesDate(LocalDate startDate, LocalDate endDate, Integer startDateRelative, Integer endDateRelative, String sourceCode, java.util.List<String> ids, Boolean trimmed, java.util.List<String> sort, Integer paginationLimit, Integer paginationOffset) throws ApiException {
    return getDocsDistributorAudioV1ListFilesDateWithHttpInfo(startDate, endDate, startDateRelative, endDateRelative, sourceCode, ids, trimmed, sort, paginationLimit, paginationOffset).getData();
  }

  /**
   * Retrieve latest audio recordings and related metadata within FactSet coverage based on a specific date ranges.
   * Retrieves the most recent audio recordings based on specified dates and allows filtering through both source code and Ids.
   * @param startDate The earliest date of the audio file the API should fetch for.  - Format: Should be absolute (YYYY-MM-DD).  (optional)
   * @param endDate The latest date of the audio file the API should fetch for. - Format: Should be absolute (YYYY-MM-DD).  (optional)
   * @param startDateRelative The earliest date of the feed file the API should fetch based on the file timestamp.  - Format: Specify the date using a relative term as an integer: &#39;0&#39; for today, &#39;-1&#39; for yesterday, &#39;-2&#39; for two days ago, and so forth. Negative values are used to represent past dates.   - *Either &#x60;startDate&#x60; or &#x60;startDateRelative&#x60; should be used, but not both.* - *If both &#x60;startDate&#x60; and &#x60;startDateRelative&#x60; are provided in the same request, the API will return an error.* - *If users provide future dates in requests for &#x60;startDate&#x60; or &#x60;startDateRelative&#x60;, the API will not return any data.*  (optional)
   * @param endDateRelative The latest date of the feed file the API should fetch based on the file timestamp.   Format: Specify the date using a relative term as an integer: &#39;0&#39; for today, &#39;-1&#39; for yesterday, &#39;-2&#39; for two days ago, and so forth. Negative values are used to represent past dates.  - Either &#x60;endDate&#x60; or &#x60;endDateRelative&#x60; should be used, but not both. - If both &#x60;endDate&#x60; and &#x60;endDateRelative&#x60; are provided in the same request, the API will return an error. - If users provide future dates in requests for &#x60;endDate&#x60; or &#x60;endDateRelative&#x60;, the API will not return any data.  (optional)
   * @param sourceCode This parameter filters the results based on Source of the Audio file. Below are the descriptions for each Source Code - * Phone &#x3D; Originated from phone call * Webcast &#x3D; Originated from a webcast * Vendor &#x3D; Received from vendor * WebcastReplay &#x3D; Replay of a webcast * Flash &#x3D; Identical to webcast; can merge with \&quot;Webcast\&quot; in the future * Replay &#x3D; Phone replay (optional)
   * @param ids This parameter filters the results based on ticker-region or Entity ID or the combination of both. A comma is used to separate each identifier.  (optional)
   * @param trimmed This parameter helps to search for trimmed audio files, with the non-speaking portions removed, and related metadata. The data ranges from May 10, 2011 to Dec 31, 2022.  (optional, default to false)
   * @param sort Enables sorting data in ascending or descending chronological order based on startDate.  (optional, default to [\&quot;-startDate\&quot;])
   * @param paginationLimit Specifies the number of results to return per page. (optional, default to 25)
   * @param paginationOffset Page number of the results to return. (optional, default to 0)
   * @return ApiResponse&lt;EventsAudioDaily&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The latest audio recordings based on the provided date ranges. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;details\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<EventsAudioDaily> getDocsDistributorAudioV1ListFilesDateWithHttpInfo(LocalDate startDate, LocalDate endDate, Integer startDateRelative, Integer endDateRelative, String sourceCode, java.util.List<String> ids, Boolean trimmed, java.util.List<String> sort, Integer paginationLimit, Integer paginationOffset) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/audio/by-date";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startDate", startDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "endDate", endDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startDateRelative", startDateRelative));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "endDateRelative", endDateRelative));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sourceCode", sourceCode));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "ids", ids));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "trimmed", trimmed));
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
        
        EventsAudioDaily
      
    > apiResponse = apiClient.invokeAPI("EventsAudioApi.getDocsDistributorAudioV1ListFilesDate", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getDocsDistributorAudioV1ListFilesDateResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Retrieve latest audio recordings and related metadata within FactSet coverage based on file name.
   * Retrieves the latest audio recordings corresponding to the provided file name.
   * @param fileName This parameter is used to filter the data on based on the file name. (optional)
   * @return EventsAudioDailyFileName
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The latest audio recordings based on the provided file name. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;details\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public EventsAudioDailyFileName getDocsDistributorAudioV1ListFilesFileName(String fileName) throws ApiException {
    return getDocsDistributorAudioV1ListFilesFileNameWithHttpInfo(fileName).getData();
  }

  /**
   * Retrieve latest audio recordings and related metadata within FactSet coverage based on file name.
   * Retrieves the latest audio recordings corresponding to the provided file name.
   * @param fileName This parameter is used to filter the data on based on the file name. (optional)
   * @return ApiResponse&lt;EventsAudioDailyFileName&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The latest audio recordings based on the provided file name. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;details\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<EventsAudioDailyFileName> getDocsDistributorAudioV1ListFilesFileNameWithHttpInfo(String fileName) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/audio/by-file-name";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "fileName", fileName));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        EventsAudioDailyFileName
      
    > apiResponse = apiClient.invokeAPI("EventsAudioApi.getDocsDistributorAudioV1ListFilesFileName", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getDocsDistributorAudioV1ListFilesFileNameResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Retrieve the latest audio recordings along with their corresponding metadata from the FactSet coverage based on specific IDs.
   * Retrieves the latest audio recordings based on the provided report ID and audio source ID.
   * @param reportId Unique identifier for fetching the audio file for an event. The same ID is used for the transcript of the same event.  (optional)
   * @param audioSourceId Unique ID for an Internal recording specific to reportID. For example, ReportID X would have multiple recordings from different source (phone or webcast or vendor or replay). One ReportID can have multiple AudioSourceIDs.  (optional)
   * @param trimmed This parameters helps to search trimmed audio files. (optional, default to false)
   * @return EventsAudioDailyIds
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The latest audio recordings based on the provided report ID and audio source ID. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;details\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public EventsAudioDailyIds getDocsDistributorAudioV1ListFilesIds(Integer reportId, Integer audioSourceId, Boolean trimmed) throws ApiException {
    return getDocsDistributorAudioV1ListFilesIdsWithHttpInfo(reportId, audioSourceId, trimmed).getData();
  }

  /**
   * Retrieve the latest audio recordings along with their corresponding metadata from the FactSet coverage based on specific IDs.
   * Retrieves the latest audio recordings based on the provided report ID and audio source ID.
   * @param reportId Unique identifier for fetching the audio file for an event. The same ID is used for the transcript of the same event.  (optional)
   * @param audioSourceId Unique ID for an Internal recording specific to reportID. For example, ReportID X would have multiple recordings from different source (phone or webcast or vendor or replay). One ReportID can have multiple AudioSourceIDs.  (optional)
   * @param trimmed This parameters helps to search trimmed audio files. (optional, default to false)
   * @return ApiResponse&lt;EventsAudioDailyIds&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The latest audio recordings based on the provided report ID and audio source ID. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;details\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<EventsAudioDailyIds> getDocsDistributorAudioV1ListFilesIdsWithHttpInfo(Integer reportId, Integer audioSourceId, Boolean trimmed) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/audio/by-ids";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "reportId", reportId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "audioSourceId", audioSourceId));
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
        
        EventsAudioDailyIds
      
    > apiResponse = apiClient.invokeAPI("EventsAudioApi.getDocsDistributorAudioV1ListFilesIds", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getDocsDistributorAudioV1ListFilesIdsResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Retrieve latest audio recordings and related metadata within FactSet coverage based on upload time.
   * Returns the latest audio recordings based on upload time and allows filtering through both source code and Ids.
   * @param uploadTime This parameter filters data based on uploadTime relative to the current time, in hours. For example:- uploadTime &#x3D; -15 (fetches audio files between 15 hours ago and now)  Minimum is 1 hour i.e., uploadTime&#x3D; -1  Maximum is 1 week/168 hours i.e., uploadTime&#x3D;-168 (optional)
   * @param sourceCode This parameter filters the results based on Source of the Audio file. Below are the descriptions for each Source Code - * Phone &#x3D; Originated from phone call * Webcast &#x3D; Originated from a webcast * Vendor &#x3D; Received from vendor * WebcastReplay &#x3D; Replay of a webcast * Flash &#x3D; Identical to webcast; can merge with \&quot;Webcast\&quot; in the future * Replay &#x3D; Phone replay (optional)
   * @param ids This parameter filters the results based on ticker-region or Entity ID or the combination of both. A comma is used to separate each identifier.  (optional)
   * @param trimmed This parameter helps to search for trimmed audio files, with the non-speaking portions removed, and related metadata. The data ranges from May 10, 2011 to Dec 31, 2022.  (optional, default to false)
   * @param sort Enables sorting data in ascending or descending chronological order based on uploadTime.  (optional, default to [\&quot;-uploadTime\&quot;])
   * @param paginationLimit Specifies the number of results to return per page. (optional, default to 25)
   * @param paginationOffset Page number of the results to return. (optional, default to 0)
   * @return EventsAudioDaily
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The latest audio recordings based on the provided upload time, source code and IDs. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;details\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public EventsAudioDaily getDocsDistributorAudioV1ListFilesUploadTime(Integer uploadTime, String sourceCode, java.util.List<String> ids, Boolean trimmed, java.util.List<String> sort, Integer paginationLimit, Integer paginationOffset) throws ApiException {
    return getDocsDistributorAudioV1ListFilesUploadTimeWithHttpInfo(uploadTime, sourceCode, ids, trimmed, sort, paginationLimit, paginationOffset).getData();
  }

  /**
   * Retrieve latest audio recordings and related metadata within FactSet coverage based on upload time.
   * Returns the latest audio recordings based on upload time and allows filtering through both source code and Ids.
   * @param uploadTime This parameter filters data based on uploadTime relative to the current time, in hours. For example:- uploadTime &#x3D; -15 (fetches audio files between 15 hours ago and now)  Minimum is 1 hour i.e., uploadTime&#x3D; -1  Maximum is 1 week/168 hours i.e., uploadTime&#x3D;-168 (optional)
   * @param sourceCode This parameter filters the results based on Source of the Audio file. Below are the descriptions for each Source Code - * Phone &#x3D; Originated from phone call * Webcast &#x3D; Originated from a webcast * Vendor &#x3D; Received from vendor * WebcastReplay &#x3D; Replay of a webcast * Flash &#x3D; Identical to webcast; can merge with \&quot;Webcast\&quot; in the future * Replay &#x3D; Phone replay (optional)
   * @param ids This parameter filters the results based on ticker-region or Entity ID or the combination of both. A comma is used to separate each identifier.  (optional)
   * @param trimmed This parameter helps to search for trimmed audio files, with the non-speaking portions removed, and related metadata. The data ranges from May 10, 2011 to Dec 31, 2022.  (optional, default to false)
   * @param sort Enables sorting data in ascending or descending chronological order based on uploadTime.  (optional, default to [\&quot;-uploadTime\&quot;])
   * @param paginationLimit Specifies the number of results to return per page. (optional, default to 25)
   * @param paginationOffset Page number of the results to return. (optional, default to 0)
   * @return ApiResponse&lt;EventsAudioDaily&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The latest audio recordings based on the provided upload time, source code and IDs. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;details\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<EventsAudioDaily> getDocsDistributorAudioV1ListFilesUploadTimeWithHttpInfo(Integer uploadTime, String sourceCode, java.util.List<String> ids, Boolean trimmed, java.util.List<String> sort, Integer paginationLimit, Integer paginationOffset) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/audio/by-upload-time";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "uploadTime", uploadTime));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sourceCode", sourceCode));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "ids", ids));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "trimmed", trimmed));
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
        
        EventsAudioDaily
      
    > apiResponse = apiClient.invokeAPI("EventsAudioApi.getDocsDistributorAudioV1ListFilesUploadTime", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getDocsDistributorAudioV1ListFilesUploadTimeResponseTypeMap, false);

    return apiResponse;

  }
}
