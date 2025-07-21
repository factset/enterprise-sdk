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
import com.factset.sdk.EventsandTranscripts.models.InvestorSlidesResponse;
import java.time.LocalDate;
import com.factset.sdk.EventsandTranscripts.models.ResponseType;
import com.factset.sdk.EventsandTranscripts.models.TranscriptsCollection;
import com.factset.sdk.EventsandTranscripts.models.TranscriptsIntelligenceResponse;
import com.factset.sdk.EventsandTranscripts.models.TranscriptsRequest;
import com.factset.sdk.EventsandTranscripts.models.TranscriptsResponse;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class TranscriptsApi {
  private ApiClient apiClient;

  public TranscriptsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public TranscriptsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> getTranscriptsIntelligenceResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getTranscriptsIntelligenceResponseTypeMap.put(200, new GenericType<TranscriptsIntelligenceResponse>(){});
    getTranscriptsIntelligenceResponseTypeMap.put(400, new GenericType<Error>(){});
    getTranscriptsIntelligenceResponseTypeMap.put(401, new GenericType<Error>(){});
    getTranscriptsIntelligenceResponseTypeMap.put(403, new GenericType<Error>(){});
    getTranscriptsIntelligenceResponseTypeMap.put(500, new GenericType<Error>(){});
  }

  private static final Map<Integer, GenericType> getTranscriptsInvestorSlidesResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getTranscriptsInvestorSlidesResponseTypeMap.put(200, new GenericType<InvestorSlidesResponse>(){});
    getTranscriptsInvestorSlidesResponseTypeMap.put(400, new GenericType<Error>(){});
    getTranscriptsInvestorSlidesResponseTypeMap.put(401, new GenericType<Error>(){});
    getTranscriptsInvestorSlidesResponseTypeMap.put(403, new GenericType<Error>(){});
    getTranscriptsInvestorSlidesResponseTypeMap.put(500, new GenericType<Error>(){});
  }

  private static final Map<Integer, GenericType> getTranscriptsinXMLResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getTranscriptsinXMLResponseTypeMap.put(200, new GenericType<ResponseType>(){});
    getTranscriptsinXMLResponseTypeMap.put(400, new GenericType<Error>(){});
    getTranscriptsinXMLResponseTypeMap.put(401, new GenericType<Error>(){});
    getTranscriptsinXMLResponseTypeMap.put(403, new GenericType<Error>(){});
    getTranscriptsinXMLResponseTypeMap.put(500, new GenericType<Error>(){});
  }

  private static final Map<Integer, GenericType> searchTranscriptsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    searchTranscriptsResponseTypeMap.put(200, new GenericType<TranscriptsResponse>(){});
    searchTranscriptsResponseTypeMap.put(400, new GenericType<Error>(){});
    searchTranscriptsResponseTypeMap.put(401, new GenericType<Error>(){});
    searchTranscriptsResponseTypeMap.put(403, new GenericType<Error>(){});
    searchTranscriptsResponseTypeMap.put(500, new GenericType<Error>(){});
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
   * Returns the StreetAccount Transcript Intelligence documents and related metadata within FactSet coverage based on specific date range and various parameters.
   * Returns the StreetAccount Transcript Intelligence documents within FactSet coverage along with other response fields.  All StreetAccount Transcript Intelligence stories originate from StreetAccount 
   * @param ids Requested symbols or securities. This is a list with a maximum limit of 1000. Each symbol can be a FactSet exchange symbol, CUSIP, SEDOL, ISIN, or Entity ID (required)
   * @param startDate Start Date (YYYY-MM-DD).  (optional)
   * @param endDate End Date (YYYY-MM-DD).  (optional)
   * @param startDateRelative The earliest date of the feed file the API should fetch based on the file timestamp, relative to today. - Format: Integer (&#x60;0&#x60; for today, &#x60;-1&#x60; for yesterday, etc.). - *Either &#x60;startDate&#x60; or &#x60;startDateRelative&#x60; should be used, but not both.*  (optional)
   * @param endDateRelative The latest date of the feed file the API should fetch based on the file timestamp, relative to today. - Format: Integer (&#x60;0&#x60; for today, &#x60;-1&#x60; for yesterday, etc.). - *Either &#x60;endDate&#x60; or &#x60;endDateRelative&#x60; should be used, but not both.*  (optional)
   * @param categories Code for categories to include. This is a list, which represents country, industry, and subject codes. Use the &#x60;&#x60;&#x60;/meta/categories&#x60;&#x60;&#x60; endpoint to get the list of available categories.  Default &#x3D; All categories.   (optional)
   * @param timeZone Time Zone for story dates/times (POSIX format from IANA timeZone registry).  Use the &#x60;/meta/time-zones&#x60; endpoint to get the list of available time zones. (optional, default to America/New_York)
   * @param sort Enables sorting data in ascending or descending chronological order based on eventDate.  (optional, default to [\&quot;-storyDateTime\&quot;])
   * @param paginationLimit Number of results to return per page. (optional, default to 25)
   * @param paginationOffset Specifies the starting point for pagination. This parameter is used to identify the beginning of the next set of results. (optional, default to 0)
   * @return TranscriptsIntelligenceResponse
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
  public TranscriptsIntelligenceResponse getTranscriptsIntelligence(java.util.List<String> ids, LocalDate startDate, LocalDate endDate, Integer startDateRelative, Integer endDateRelative, java.util.List<String> categories, String timeZone, java.util.List<String> sort, Integer paginationLimit, Integer paginationOffset) throws ApiException {
    return getTranscriptsIntelligenceWithHttpInfo(ids, startDate, endDate, startDateRelative, endDateRelative, categories, timeZone, sort, paginationLimit, paginationOffset).getData();
  }

  /**
   * Returns the StreetAccount Transcript Intelligence documents and related metadata within FactSet coverage based on specific date range and various parameters.
   * Returns the StreetAccount Transcript Intelligence documents within FactSet coverage along with other response fields.  All StreetAccount Transcript Intelligence stories originate from StreetAccount 
   * @param ids Requested symbols or securities. This is a list with a maximum limit of 1000. Each symbol can be a FactSet exchange symbol, CUSIP, SEDOL, ISIN, or Entity ID (required)
   * @param startDate Start Date (YYYY-MM-DD).  (optional)
   * @param endDate End Date (YYYY-MM-DD).  (optional)
   * @param startDateRelative The earliest date of the feed file the API should fetch based on the file timestamp, relative to today. - Format: Integer (&#x60;0&#x60; for today, &#x60;-1&#x60; for yesterday, etc.). - *Either &#x60;startDate&#x60; or &#x60;startDateRelative&#x60; should be used, but not both.*  (optional)
   * @param endDateRelative The latest date of the feed file the API should fetch based on the file timestamp, relative to today. - Format: Integer (&#x60;0&#x60; for today, &#x60;-1&#x60; for yesterday, etc.). - *Either &#x60;endDate&#x60; or &#x60;endDateRelative&#x60; should be used, but not both.*  (optional)
   * @param categories Code for categories to include. This is a list, which represents country, industry, and subject codes. Use the &#x60;&#x60;&#x60;/meta/categories&#x60;&#x60;&#x60; endpoint to get the list of available categories.  Default &#x3D; All categories.   (optional)
   * @param timeZone Time Zone for story dates/times (POSIX format from IANA timeZone registry).  Use the &#x60;/meta/time-zones&#x60; endpoint to get the list of available time zones. (optional, default to America/New_York)
   * @param sort Enables sorting data in ascending or descending chronological order based on eventDate.  (optional, default to [\&quot;-storyDateTime\&quot;])
   * @param paginationLimit Number of results to return per page. (optional, default to 25)
   * @param paginationOffset Specifies the starting point for pagination. This parameter is used to identify the beginning of the next set of results. (optional, default to 0)
   * @return ApiResponse&lt;TranscriptsIntelligenceResponse&gt;
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
  public ApiResponse<TranscriptsIntelligenceResponse> getTranscriptsIntelligenceWithHttpInfo(java.util.List<String> ids, LocalDate startDate, LocalDate endDate, Integer startDateRelative, Integer endDateRelative, java.util.List<String> categories, String timeZone, java.util.List<String> sort, Integer paginationLimit, Integer paginationOffset) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ids' is set
    if (ids == null) {
      throw new ApiException(400, "Missing the required parameter 'ids' when calling getTranscriptsIntelligence");
    }
    
    // create path and map variables
    String localVarPath = "/transcripts/intelligence";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startDate", startDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "endDate", endDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startDateRelative", startDateRelative));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "endDateRelative", endDateRelative));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "ids", ids));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "categories", categories));
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
        
        TranscriptsIntelligenceResponse
      
    > apiResponse = apiClient.invokeAPI("TranscriptsApi.getTranscriptsIntelligence", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getTranscriptsIntelligenceResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Returns the investor slides in PDF format and related metadata within FactSet coverage based on specific date range and various parameters.
   * Returns the Factset Callstreet Investor Slides documents within FactSet coverage along with other response fields   All transcripts originate from Factset Callstreet Investor Slides. 
   * @param ids Requested symbols or securities. This is a list with a maximum limit of 1000. Each symbol can be a FactSet exchange symbol, CUSIP, SEDOL, ISIN, or Entity ID (required)
   * @param startDate Start Date. Format is YYYY-MM-DD    **The API supports data from 1995 onwards. Ensure that the provided Date falls within this range for accurate results.**  (required)
   * @param endDate End Date. Format is YYYY-MM-DD. (required)
   * @param eventIds Requests Event IDs. This is a list with a maximum limit of 1000. (optional)
   * @param categories Code for categories to include. This is a list, which represents country, industry, and subject codes. Use the &#x60;&#x60;&#x60;/meta/categories&#x60;&#x60;&#x60; endpoint to get the list of available categories.  Default &#x3D; All categories.   (optional)
   * @param searchText Restricts the search to include only document stories which include the text searched.     (optional)
   * @param sort Enables sorting data in ascending or descending chronological order based on eventDate.  (optional, default to [\&quot;-storyDateTime\&quot;])
   * @param paginationLimit Number of results to return per page. (optional, default to 25)
   * @param paginationOffset Specifies the starting point for pagination. This parameter is used to identify the beginning of the next set of results. (optional, default to 0)
   * @return InvestorSlidesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The latest investor slides based on the provided date ranges. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public InvestorSlidesResponse getTranscriptsInvestorSlides(java.util.List<String> ids, LocalDate startDate, LocalDate endDate, java.util.List<String> eventIds, java.util.List<String> categories, String searchText, java.util.List<String> sort, Integer paginationLimit, Integer paginationOffset) throws ApiException {
    return getTranscriptsInvestorSlidesWithHttpInfo(ids, startDate, endDate, eventIds, categories, searchText, sort, paginationLimit, paginationOffset).getData();
  }

  /**
   * Returns the investor slides in PDF format and related metadata within FactSet coverage based on specific date range and various parameters.
   * Returns the Factset Callstreet Investor Slides documents within FactSet coverage along with other response fields   All transcripts originate from Factset Callstreet Investor Slides. 
   * @param ids Requested symbols or securities. This is a list with a maximum limit of 1000. Each symbol can be a FactSet exchange symbol, CUSIP, SEDOL, ISIN, or Entity ID (required)
   * @param startDate Start Date. Format is YYYY-MM-DD    **The API supports data from 1995 onwards. Ensure that the provided Date falls within this range for accurate results.**  (required)
   * @param endDate End Date. Format is YYYY-MM-DD. (required)
   * @param eventIds Requests Event IDs. This is a list with a maximum limit of 1000. (optional)
   * @param categories Code for categories to include. This is a list, which represents country, industry, and subject codes. Use the &#x60;&#x60;&#x60;/meta/categories&#x60;&#x60;&#x60; endpoint to get the list of available categories.  Default &#x3D; All categories.   (optional)
   * @param searchText Restricts the search to include only document stories which include the text searched.     (optional)
   * @param sort Enables sorting data in ascending or descending chronological order based on eventDate.  (optional, default to [\&quot;-storyDateTime\&quot;])
   * @param paginationLimit Number of results to return per page. (optional, default to 25)
   * @param paginationOffset Specifies the starting point for pagination. This parameter is used to identify the beginning of the next set of results. (optional, default to 0)
   * @return ApiResponse&lt;InvestorSlidesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The latest investor slides based on the provided date ranges. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InvestorSlidesResponse> getTranscriptsInvestorSlidesWithHttpInfo(java.util.List<String> ids, LocalDate startDate, LocalDate endDate, java.util.List<String> eventIds, java.util.List<String> categories, String searchText, java.util.List<String> sort, Integer paginationLimit, Integer paginationOffset) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ids' is set
    if (ids == null) {
      throw new ApiException(400, "Missing the required parameter 'ids' when calling getTranscriptsInvestorSlides");
    }
    
    // verify the required parameter 'startDate' is set
    if (startDate == null) {
      throw new ApiException(400, "Missing the required parameter 'startDate' when calling getTranscriptsInvestorSlides");
    }
    
    // verify the required parameter 'endDate' is set
    if (endDate == null) {
      throw new ApiException(400, "Missing the required parameter 'endDate' when calling getTranscriptsInvestorSlides");
    }
    
    // create path and map variables
    String localVarPath = "/transcripts/investor-slides";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "ids", ids));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startDate", startDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "endDate", endDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "eventIds", eventIds));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "categories", categories));
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
        
        InvestorSlidesResponse
      
    > apiResponse = apiClient.invokeAPI("TranscriptsApi.getTranscriptsInvestorSlides", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getTranscriptsInvestorSlidesResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Returns the requested response type of transcript
   * Returns the Factset Callstreet documents within FactSet coverage along with other response fields   All transcripts originate from Factset Callstreet Transcripts 
   * @param reportIds Requests Report IDs. This is a list with a maximum limit of 1000 (required)
   * @param format The format of the output file. Allowed values:   - &#x60;XML&#x60;: Structured data format ideal for integrations and parsing.   - &#x60;PDF&#x60;: Printable document format preserving layout and design.   - &#x60;DocViewer&#x60;: Web-friendly format rendered in an in-browser document viewer.   - &#x60;ContentXML&#x60;: XML containing only the core content without layout or styling metadata.  (required)
   * @param paginationLimit Number of results to return per page. (optional, default to 25)
   * @param paginationOffset Specifies the starting point for pagination. This parameter is used to identify the beginning of the next set of results. (optional, default to 0)
   * @return ResponseType
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Returns the requested response type of transcripts </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public ResponseType getTranscriptsinXML(java.util.List<String> reportIds, String format, Integer paginationLimit, Integer paginationOffset) throws ApiException {
    return getTranscriptsinXMLWithHttpInfo(reportIds, format, paginationLimit, paginationOffset).getData();
  }

  /**
   * Returns the requested response type of transcript
   * Returns the Factset Callstreet documents within FactSet coverage along with other response fields   All transcripts originate from Factset Callstreet Transcripts 
   * @param reportIds Requests Report IDs. This is a list with a maximum limit of 1000 (required)
   * @param format The format of the output file. Allowed values:   - &#x60;XML&#x60;: Structured data format ideal for integrations and parsing.   - &#x60;PDF&#x60;: Printable document format preserving layout and design.   - &#x60;DocViewer&#x60;: Web-friendly format rendered in an in-browser document viewer.   - &#x60;ContentXML&#x60;: XML containing only the core content without layout or styling metadata.  (required)
   * @param paginationLimit Number of results to return per page. (optional, default to 25)
   * @param paginationOffset Specifies the starting point for pagination. This parameter is used to identify the beginning of the next set of results. (optional, default to 0)
   * @return ApiResponse&lt;ResponseType&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Returns the requested response type of transcripts </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ResponseType> getTranscriptsinXMLWithHttpInfo(java.util.List<String> reportIds, String format, Integer paginationLimit, Integer paginationOffset) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'reportIds' is set
    if (reportIds == null) {
      throw new ApiException(400, "Missing the required parameter 'reportIds' when calling getTranscriptsinXML");
    }
    
    // verify the required parameter 'format' is set
    if (format == null) {
      throw new ApiException(400, "Missing the required parameter 'format' when calling getTranscriptsinXML");
    }
    
    // create path and map variables
    String localVarPath = "/transcripts/response-type";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "reportIds", reportIds));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "format", format));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_paginationLimit", paginationLimit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_paginationOffset", paginationOffset));

    
    
    
    final String[] localVarAccepts = {
      "application/json", "application/xml"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        ResponseType
      
    > apiResponse = apiClient.invokeAPI("TranscriptsApi.getTranscriptsinXML", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getTranscriptsinXMLResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Returns transcript documents and related metadata based on different search criteria.
   * Retrieves transcript documents in XML format and related metadata within FactSet coverage based on various criteria like date range, search text, specific IDs, or event details. Use the appropriate parameters within the &#x60;data&#x60; object of the request body to specify the search method. Pagination and sorting are controlled via the &#x60;meta&#x60; object.  All transcripts originate from Factset Callstreet Transcripts. 
   * @param transcriptsRequest Criteria to search for transcripts. Select one mode of search. (required)
   * @return TranscriptsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The latest transcripts matching the specified criteria. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public TranscriptsResponse searchTranscripts(TranscriptsRequest transcriptsRequest) throws ApiException {
    return searchTranscriptsWithHttpInfo(transcriptsRequest).getData();
  }

  /**
   * Returns transcript documents and related metadata based on different search criteria.
   * Retrieves transcript documents in XML format and related metadata within FactSet coverage based on various criteria like date range, search text, specific IDs, or event details. Use the appropriate parameters within the &#x60;data&#x60; object of the request body to specify the search method. Pagination and sorting are controlled via the &#x60;meta&#x60; object.  All transcripts originate from Factset Callstreet Transcripts. 
   * @param transcriptsRequest Criteria to search for transcripts. Select one mode of search. (required)
   * @return ApiResponse&lt;TranscriptsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The latest transcripts matching the specified criteria. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<TranscriptsResponse> searchTranscriptsWithHttpInfo(TranscriptsRequest transcriptsRequest) throws ApiException {
    Object localVarPostBody = transcriptsRequest;
    
    // verify the required parameter 'transcriptsRequest' is set
    if (transcriptsRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'transcriptsRequest' when calling searchTranscripts");
    }
    
    // create path and map variables
    String localVarPath = "/transcripts";

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
        
        TranscriptsResponse
      
    > apiResponse = apiClient.invokeAPI("TranscriptsApi.searchTranscripts", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, searchTranscriptsResponseTypeMap, false);

    return apiResponse;

  }
}
