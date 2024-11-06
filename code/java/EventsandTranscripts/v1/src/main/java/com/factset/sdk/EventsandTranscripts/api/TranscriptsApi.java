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
import java.time.LocalDate;
import java.time.OffsetDateTime;
import com.factset.sdk.EventsandTranscripts.models.ResponseCategories;
import com.factset.sdk.EventsandTranscripts.models.ResponseTime;
import com.factset.sdk.EventsandTranscripts.models.Transcripts;
import com.factset.sdk.EventsandTranscripts.models.TranscriptsOne;
import com.factset.sdk.EventsandTranscripts.models.TranscriptsTimes;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class TranscriptsApi {
  private ApiClient apiClient;

  public TranscriptsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public TranscriptsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> getTimezoneResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getTimezoneResponseTypeMap.put(200, new GenericType<ResponseTime>(){});
    getTimezoneResponseTypeMap.put(400, new GenericType<Error>(){});
    getTimezoneResponseTypeMap.put(401, new GenericType<Error>(){});
    getTimezoneResponseTypeMap.put(403, new GenericType<Error>(){});
    getTimezoneResponseTypeMap.put(500, new GenericType<Error>(){});
  }

  private static final Map<Integer, GenericType> getTranscriptsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getTranscriptsResponseTypeMap.put(200, new GenericType<Transcripts>(){});
    getTranscriptsResponseTypeMap.put(400, new GenericType<Error>(){});
    getTranscriptsResponseTypeMap.put(401, new GenericType<Error>(){});
    getTranscriptsResponseTypeMap.put(403, new GenericType<Error>(){});
    getTranscriptsResponseTypeMap.put(500, new GenericType<Error>(){});
  }

  private static final Map<Integer, GenericType> getTranscriptsDatesResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getTranscriptsDatesResponseTypeMap.put(200, new GenericType<Transcripts>(){});
    getTranscriptsDatesResponseTypeMap.put(400, new GenericType<Error>(){});
    getTranscriptsDatesResponseTypeMap.put(401, new GenericType<Error>(){});
    getTranscriptsDatesResponseTypeMap.put(403, new GenericType<Error>(){});
    getTranscriptsDatesResponseTypeMap.put(500, new GenericType<Error>(){});
  }

  private static final Map<Integer, GenericType> getTranscriptsEventsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getTranscriptsEventsResponseTypeMap.put(200, new GenericType<Transcripts>(){});
    getTranscriptsEventsResponseTypeMap.put(400, new GenericType<Error>(){});
    getTranscriptsEventsResponseTypeMap.put(401, new GenericType<Error>(){});
    getTranscriptsEventsResponseTypeMap.put(403, new GenericType<Error>(){});
    getTranscriptsEventsResponseTypeMap.put(500, new GenericType<Error>(){});
  }

  private static final Map<Integer, GenericType> getTranscriptsIdsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getTranscriptsIdsResponseTypeMap.put(200, new GenericType<TranscriptsOne>(){});
    getTranscriptsIdsResponseTypeMap.put(400, new GenericType<Error>(){});
    getTranscriptsIdsResponseTypeMap.put(401, new GenericType<Error>(){});
    getTranscriptsIdsResponseTypeMap.put(403, new GenericType<Error>(){});
    getTranscriptsIdsResponseTypeMap.put(500, new GenericType<Error>(){});
  }

  private static final Map<Integer, GenericType> getTranscriptsTimeResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getTranscriptsTimeResponseTypeMap.put(200, new GenericType<TranscriptsTimes>(){});
    getTranscriptsTimeResponseTypeMap.put(400, new GenericType<Error>(){});
    getTranscriptsTimeResponseTypeMap.put(401, new GenericType<Error>(){});
    getTranscriptsTimeResponseTypeMap.put(403, new GenericType<Error>(){});
    getTranscriptsTimeResponseTypeMap.put(500, new GenericType<Error>(){});
  }

  private static final Map<Integer, GenericType> getcategoriesResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getcategoriesResponseTypeMap.put(200, new GenericType<ResponseCategories>(){});
    getcategoriesResponseTypeMap.put(400, new GenericType<Error>(){});
    getcategoriesResponseTypeMap.put(401, new GenericType<Error>(){});
    getcategoriesResponseTypeMap.put(403, new GenericType<Error>(){});
    getcategoriesResponseTypeMap.put(500, new GenericType<Error>(){});
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
   * Returns the time zones.
   * Retrieves and delivers a comprehensive list of all available &#x60;timeZones&#x60;.
   * @return ResponseTime
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> List of all available time zones. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public ResponseTime getTimezone() throws ApiException {
    return getTimezoneWithHttpInfo().getData();
  }

  /**
   * Returns the time zones.
   * Retrieves and delivers a comprehensive list of all available &#x60;timeZones&#x60;.
   * @return ApiResponse&lt;ResponseTime&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> List of all available time zones. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ResponseTime> getTimezoneWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/reference/time-zones";

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
        
        ResponseTime
      
    > apiResponse = apiClient.invokeAPI("TranscriptsApi.getTimezone", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getTimezoneResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Returns the transcript documents in XML format and related metadata within FactSet coverage based on search text.
   * Returns the transcripts documents within FactSet coverage along with other response fields.   All transcripts originate from Factset Callstreet Transcripts. 
   * @param searchText Restricts the search to include only document stories which include the text searched. (optional)
   * @param sort Enables sorting data in ascending or descending chronological order based on eventDate.  (optional, default to [\&quot;-storyDateTime\&quot;])
   * @param paginationLimit Number of results to return per page. Maximum value: 1000.  (optional, default to 25)
   * @param paginationOffset Page number of the results to return. (optional, default to 0)
   * @return Transcripts
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The latest transcripts based on the provided search text. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public Transcripts getTranscripts(String searchText, java.util.List<String> sort, Integer paginationLimit, Integer paginationOffset) throws ApiException {
    return getTranscriptsWithHttpInfo(searchText, sort, paginationLimit, paginationOffset).getData();
  }

  /**
   * Returns the transcript documents in XML format and related metadata within FactSet coverage based on search text.
   * Returns the transcripts documents within FactSet coverage along with other response fields.   All transcripts originate from Factset Callstreet Transcripts. 
   * @param searchText Restricts the search to include only document stories which include the text searched. (optional)
   * @param sort Enables sorting data in ascending or descending chronological order based on eventDate.  (optional, default to [\&quot;-storyDateTime\&quot;])
   * @param paginationLimit Number of results to return per page. Maximum value: 1000.  (optional, default to 25)
   * @param paginationOffset Page number of the results to return. (optional, default to 0)
   * @return ApiResponse&lt;Transcripts&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The latest transcripts based on the provided search text. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Transcripts> getTranscriptsWithHttpInfo(String searchText, java.util.List<String> sort, Integer paginationLimit, Integer paginationOffset) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/transcripts/search";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "searchText", searchText));
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
        
        Transcripts
      
    > apiResponse = apiClient.invokeAPI("TranscriptsApi.getTranscripts", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getTranscriptsResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Returns the transcript documents in XML format and related metadata within FactSet coverage based on specific date range and time zones.
   * Returns the transcripts documents within FactSet coverage along with other response fields.   All transcripts originate from Factset Callstreet Transcripts. 
   * @param startDate Start Date. Format is YYYY-MM-DD    **The API supports data from 1999 onwards. Ensure that the provided Date falls within this range for accurate results.**  (optional)
   * @param endDate End Date. Format is YYYY-MM-DD. (optional)
   * @param startDateRelative The earliest date of the feed file the API should fetch based on the file timestamp.  - Format: Specify the date using a relative term as an integer: &#39;0&#39; for today, &#39;-1&#39; for yesterday, &#39;-2&#39; for two days ago, and so forth. Negative values are used to represent past dates.   - *Either &#x60;startDate&#x60; or &#x60;startDateRelative&#x60; should be used, but not both.* - *If both &#x60;startDate&#x60; and &#x60;startDateRelative&#x60; are provided in the same request, the API will return an error.* - *If users provide future dates in requests for &#x60;startDate&#x60; or &#x60;startDateRelative&#x60;, the API will not return any data.*  (optional)
   * @param endDateRelative The latest date of the feed file the API should fetch for based on the file timestamp.  - Format: Specify the date using a relative term as an integer: &#39;0&#39; for today, &#39;-1&#39; for yesterday, &#39;-2&#39; for two days ago, and so forth. Negative values are used to represent past dates.   - *Either &#x60;endDate&#x60; or &#x60;endDateRelative&#x60; should be used, but not both.* - *If both &#x60;endDate&#x60; and &#x60;endDateRelative&#x60; are provided in the same request, the API will return an error.* - *If users provide future dates in requests for &#x60;endDate&#x60; or &#x60;endDateRelative&#x60;, the API will not return any data.*  (optional)
   * @param timeZone timeZone to return story dates and times.Time zones, represented in POSIX format, are automatically adjusted for daylight savings. timeZone names are sourced from the IANA timezone registry. The time fields in the response will adhere to this specified timezone. (optional, default to America/New_York)
   * @param sort Enables sorting data in ascending or descending chronological order based on eventDate.  (optional, default to [\&quot;-storyDateTime\&quot;])
   * @param paginationLimit Number of results to return per page. Maximum value: 1000.  (optional, default to 25)
   * @param paginationOffset Page number of the results to return. (optional, default to 0)
   * @return Transcripts
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The latest transcripts based on the provided date ranges. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public Transcripts getTranscriptsDates(LocalDate startDate, LocalDate endDate, Integer startDateRelative, Integer endDateRelative, String timeZone, java.util.List<String> sort, Integer paginationLimit, Integer paginationOffset) throws ApiException {
    return getTranscriptsDatesWithHttpInfo(startDate, endDate, startDateRelative, endDateRelative, timeZone, sort, paginationLimit, paginationOffset).getData();
  }

  /**
   * Returns the transcript documents in XML format and related metadata within FactSet coverage based on specific date range and time zones.
   * Returns the transcripts documents within FactSet coverage along with other response fields.   All transcripts originate from Factset Callstreet Transcripts. 
   * @param startDate Start Date. Format is YYYY-MM-DD    **The API supports data from 1999 onwards. Ensure that the provided Date falls within this range for accurate results.**  (optional)
   * @param endDate End Date. Format is YYYY-MM-DD. (optional)
   * @param startDateRelative The earliest date of the feed file the API should fetch based on the file timestamp.  - Format: Specify the date using a relative term as an integer: &#39;0&#39; for today, &#39;-1&#39; for yesterday, &#39;-2&#39; for two days ago, and so forth. Negative values are used to represent past dates.   - *Either &#x60;startDate&#x60; or &#x60;startDateRelative&#x60; should be used, but not both.* - *If both &#x60;startDate&#x60; and &#x60;startDateRelative&#x60; are provided in the same request, the API will return an error.* - *If users provide future dates in requests for &#x60;startDate&#x60; or &#x60;startDateRelative&#x60;, the API will not return any data.*  (optional)
   * @param endDateRelative The latest date of the feed file the API should fetch for based on the file timestamp.  - Format: Specify the date using a relative term as an integer: &#39;0&#39; for today, &#39;-1&#39; for yesterday, &#39;-2&#39; for two days ago, and so forth. Negative values are used to represent past dates.   - *Either &#x60;endDate&#x60; or &#x60;endDateRelative&#x60; should be used, but not both.* - *If both &#x60;endDate&#x60; and &#x60;endDateRelative&#x60; are provided in the same request, the API will return an error.* - *If users provide future dates in requests for &#x60;endDate&#x60; or &#x60;endDateRelative&#x60;, the API will not return any data.*  (optional)
   * @param timeZone timeZone to return story dates and times.Time zones, represented in POSIX format, are automatically adjusted for daylight savings. timeZone names are sourced from the IANA timezone registry. The time fields in the response will adhere to this specified timezone. (optional, default to America/New_York)
   * @param sort Enables sorting data in ascending or descending chronological order based on eventDate.  (optional, default to [\&quot;-storyDateTime\&quot;])
   * @param paginationLimit Number of results to return per page. Maximum value: 1000.  (optional, default to 25)
   * @param paginationOffset Page number of the results to return. (optional, default to 0)
   * @return ApiResponse&lt;Transcripts&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The latest transcripts based on the provided date ranges. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Transcripts> getTranscriptsDatesWithHttpInfo(LocalDate startDate, LocalDate endDate, Integer startDateRelative, Integer endDateRelative, String timeZone, java.util.List<String> sort, Integer paginationLimit, Integer paginationOffset) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/transcripts/dates";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startDate", startDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "endDate", endDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startDateRelative", startDateRelative));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "endDateRelative", endDateRelative));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "timeZone", timeZone));
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
        
        Transcripts
      
    > apiResponse = apiClient.invokeAPI("TranscriptsApi.getTranscriptsDates", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getTranscriptsDatesResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Returns the transcript documents in XML format and related metadata within FactSet coverage based on eventIds and eventType.
   * Returns the transcripts documents within FactSet coverage along with other response fields.   All transcripts originate from Factset Callstreet Transcripts. 
   * @param eventIds Requests Event IDs. This is a comma-separated list with a maximum limit of 1000. (optional)
   * @param eventType Specifies the type of event you want to retrieve.   Earnings - Denotes an Earnings event.   Guidance - Denotes a Guidance event.   AnalystsShareholdersMeeting - Denotes an Analysts and Shareholders Meeting event.   ConferencePresentation - Denotes a Conference Presentation event.   SalesRevenue - Denotes a Sales/Revenue event.   SpecialSituation - Denotes a Special Situation event (i.e. Merger/Acquisition). (optional)
   * @param sort Enables sorting data in ascending or descending chronological order based on eventDate.  (optional, default to [\&quot;-storyDateTime\&quot;])
   * @param paginationLimit Number of results to return per page. Maximum value: 1000.  (optional, default to 25)
   * @param paginationOffset Page number of the results to return. (optional, default to 0)
   * @return Transcripts
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The latest transcripts based on the provided event IDs and event type. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public Transcripts getTranscriptsEvents(java.util.List<String> eventIds, String eventType, java.util.List<String> sort, Integer paginationLimit, Integer paginationOffset) throws ApiException {
    return getTranscriptsEventsWithHttpInfo(eventIds, eventType, sort, paginationLimit, paginationOffset).getData();
  }

  /**
   * Returns the transcript documents in XML format and related metadata within FactSet coverage based on eventIds and eventType.
   * Returns the transcripts documents within FactSet coverage along with other response fields.   All transcripts originate from Factset Callstreet Transcripts. 
   * @param eventIds Requests Event IDs. This is a comma-separated list with a maximum limit of 1000. (optional)
   * @param eventType Specifies the type of event you want to retrieve.   Earnings - Denotes an Earnings event.   Guidance - Denotes a Guidance event.   AnalystsShareholdersMeeting - Denotes an Analysts and Shareholders Meeting event.   ConferencePresentation - Denotes a Conference Presentation event.   SalesRevenue - Denotes a Sales/Revenue event.   SpecialSituation - Denotes a Special Situation event (i.e. Merger/Acquisition). (optional)
   * @param sort Enables sorting data in ascending or descending chronological order based on eventDate.  (optional, default to [\&quot;-storyDateTime\&quot;])
   * @param paginationLimit Number of results to return per page. Maximum value: 1000.  (optional, default to 25)
   * @param paginationOffset Page number of the results to return. (optional, default to 0)
   * @return ApiResponse&lt;Transcripts&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The latest transcripts based on the provided event IDs and event type. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Transcripts> getTranscriptsEventsWithHttpInfo(java.util.List<String> eventIds, String eventType, java.util.List<String> sort, Integer paginationLimit, Integer paginationOffset) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/transcripts/events";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "eventIds", eventIds));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "eventType", eventType));
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
        
        Transcripts
      
    > apiResponse = apiClient.invokeAPI("TranscriptsApi.getTranscriptsEvents", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getTranscriptsEventsResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Returns the transcript documents in XML format and related metadata within FactSet coverage based on specific IDs.
   * Returns the transcripts documents within FactSet coverage along with other response fields.   All transcripts originate from Factset Callstreet Transcripts. 
   * @param primaryId Type of identifier search * true - Returns headlines of stories that have the searched identifier(s) as the primary  identifier. * false - Returns headlines of stories that mentioned or referred to the  identifier. (optional, default to false)
   * @param ids Requested symbols or securities.  This is a comma-separated list with a maximum limit of 1000.  Each symbol can be a FactSet exchange symbol, CUSIP, or SEDOL. (optional)
   * @param startDate Start Date. Format is YYYY-MM-DD    **The API supports data from 1999 onwards. Ensure that the provided Date falls within this range for accurate results.**  (optional)
   * @param endDate End Date. Format is YYYY-MM-DD. (optional)
   * @param searchText Restricts the search to include only document stories which include the text searched. (optional)
   * @param reportIds Requests Report IDs. This is a comma-separated list with a maximum limit of 1000 (optional)
   * @param categories Code for categories to include. This is a comma-separated list.which represents country, industry, and subject codes. Use the &#x60;&#x60;&#x60;/reference/categories&#x60;&#x60;&#x60; endpoint to get the list of available categories.  Default &#x3D; All categories. (optional)
   * @param sort Enables sorting data in ascending or descending chronological order based on eventDate.  (optional, default to [\&quot;-storyDateTime\&quot;])
   * @param paginationLimit Number of results to return per page. Maximum value: 1000.  (optional, default to 25)
   * @param paginationOffset Page number of the results to return. (optional, default to 0)
   * @return TranscriptsOne
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The latest transcripts based on the provided report ID, IDs and primary ID. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public TranscriptsOne getTranscriptsIds(Boolean primaryId, java.util.List<String> ids, LocalDate startDate, LocalDate endDate, String searchText, java.util.List<String> reportIds, java.util.List<String> categories, java.util.List<String> sort, Integer paginationLimit, Integer paginationOffset) throws ApiException {
    return getTranscriptsIdsWithHttpInfo(primaryId, ids, startDate, endDate, searchText, reportIds, categories, sort, paginationLimit, paginationOffset).getData();
  }

  /**
   * Returns the transcript documents in XML format and related metadata within FactSet coverage based on specific IDs.
   * Returns the transcripts documents within FactSet coverage along with other response fields.   All transcripts originate from Factset Callstreet Transcripts. 
   * @param primaryId Type of identifier search * true - Returns headlines of stories that have the searched identifier(s) as the primary  identifier. * false - Returns headlines of stories that mentioned or referred to the  identifier. (optional, default to false)
   * @param ids Requested symbols or securities.  This is a comma-separated list with a maximum limit of 1000.  Each symbol can be a FactSet exchange symbol, CUSIP, or SEDOL. (optional)
   * @param startDate Start Date. Format is YYYY-MM-DD    **The API supports data from 1999 onwards. Ensure that the provided Date falls within this range for accurate results.**  (optional)
   * @param endDate End Date. Format is YYYY-MM-DD. (optional)
   * @param searchText Restricts the search to include only document stories which include the text searched. (optional)
   * @param reportIds Requests Report IDs. This is a comma-separated list with a maximum limit of 1000 (optional)
   * @param categories Code for categories to include. This is a comma-separated list.which represents country, industry, and subject codes. Use the &#x60;&#x60;&#x60;/reference/categories&#x60;&#x60;&#x60; endpoint to get the list of available categories.  Default &#x3D; All categories. (optional)
   * @param sort Enables sorting data in ascending or descending chronological order based on eventDate.  (optional, default to [\&quot;-storyDateTime\&quot;])
   * @param paginationLimit Number of results to return per page. Maximum value: 1000.  (optional, default to 25)
   * @param paginationOffset Page number of the results to return. (optional, default to 0)
   * @return ApiResponse&lt;TranscriptsOne&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The latest transcripts based on the provided report ID, IDs and primary ID. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<TranscriptsOne> getTranscriptsIdsWithHttpInfo(Boolean primaryId, java.util.List<String> ids, LocalDate startDate, LocalDate endDate, String searchText, java.util.List<String> reportIds, java.util.List<String> categories, java.util.List<String> sort, Integer paginationLimit, Integer paginationOffset) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/transcripts/ids";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "primaryId", primaryId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "ids", ids));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startDate", startDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "endDate", endDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "searchText", searchText));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "reportIds", reportIds));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "categories", categories));
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
        
        TranscriptsOne
      
    > apiResponse = apiClient.invokeAPI("TranscriptsApi.getTranscriptsIds", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getTranscriptsIdsResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Returns the transcript documents in XML format and related metadata within FactSet coverage based on specific time.
   * Returns the transcripts documents within FactSet coverage along with other response fields.   All transcripts originate from Factset Callstreet Transcripts. 
   * @param startDateTime  **The API supports data from 1999 onwards. Ensure that the provided Date falls within this range for accurate results.**    (optional)
   * @param endDateTime The date to which data is required (optional)
   * @param sort Enables sorting data in ascending or descending chronological order based on eventDate.  (optional, default to [\&quot;-storyDateTime\&quot;])
   * @param paginationLimit Number of results to return per page. Maximum value: 1000.  (optional, default to 25)
   * @param paginationOffset Page number of the results to return. (optional, default to 0)
   * @return TranscriptsTimes
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The latest transcripts based on the provided date ranges. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public TranscriptsTimes getTranscriptsTime(OffsetDateTime startDateTime, OffsetDateTime endDateTime, java.util.List<String> sort, Integer paginationLimit, Integer paginationOffset) throws ApiException {
    return getTranscriptsTimeWithHttpInfo(startDateTime, endDateTime, sort, paginationLimit, paginationOffset).getData();
  }

  /**
   * Returns the transcript documents in XML format and related metadata within FactSet coverage based on specific time.
   * Returns the transcripts documents within FactSet coverage along with other response fields.   All transcripts originate from Factset Callstreet Transcripts. 
   * @param startDateTime  **The API supports data from 1999 onwards. Ensure that the provided Date falls within this range for accurate results.**    (optional)
   * @param endDateTime The date to which data is required (optional)
   * @param sort Enables sorting data in ascending or descending chronological order based on eventDate.  (optional, default to [\&quot;-storyDateTime\&quot;])
   * @param paginationLimit Number of results to return per page. Maximum value: 1000.  (optional, default to 25)
   * @param paginationOffset Page number of the results to return. (optional, default to 0)
   * @return ApiResponse&lt;TranscriptsTimes&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The latest transcripts based on the provided date ranges. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<TranscriptsTimes> getTranscriptsTimeWithHttpInfo(OffsetDateTime startDateTime, OffsetDateTime endDateTime, java.util.List<String> sort, Integer paginationLimit, Integer paginationOffset) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/transcripts/times";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startDateTime", startDateTime));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "endDateTime", endDateTime));
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
        
        TranscriptsTimes
      
    > apiResponse = apiClient.invokeAPI("TranscriptsApi.getTranscriptsTime", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getTranscriptsTimeResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Returns the categories.
   * Retrieves and delivers a comprehensive list of all available &#x60;categories&#x60;which are defined as country, industry, and subject codes. The data is returned as a comma-separated list.
   * @return ResponseCategories
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> list of all available categories. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public ResponseCategories getcategories() throws ApiException {
    return getcategoriesWithHttpInfo().getData();
  }

  /**
   * Returns the categories.
   * Retrieves and delivers a comprehensive list of all available &#x60;categories&#x60;which are defined as country, industry, and subject codes. The data is returned as a comma-separated list.
   * @return ApiResponse&lt;ResponseCategories&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> list of all available categories. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ResponseCategories> getcategoriesWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/reference/categories";

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
        
        ResponseCategories
      
    > apiResponse = apiClient.invokeAPI("TranscriptsApi.getcategories", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getcategoriesResponseTypeMap, false);

    return apiResponse;

  }
}
