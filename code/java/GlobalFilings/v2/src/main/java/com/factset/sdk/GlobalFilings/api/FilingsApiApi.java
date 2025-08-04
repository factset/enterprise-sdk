package com.factset.sdk.GlobalFilings.api;

import com.factset.sdk.GlobalFilings.ApiException;
import com.factset.sdk.GlobalFilings.ApiClient;
import com.factset.sdk.GlobalFilings.ApiResponse;
import com.factset.sdk.GlobalFilings.Configuration;
import com.factset.sdk.GlobalFilings.Pair;

import jakarta.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.GlobalFilings.models.CountResponse;
import com.factset.sdk.GlobalFilings.models.ErrorResponse;
import com.factset.sdk.GlobalFilings.models.SearchResponse;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class FilingsApiApi {
  private ApiClient apiClient;

  public FilingsApiApi() {
    this(Configuration.getDefaultApiClient());
  }

  public FilingsApiApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> getCountResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getCountResponseTypeMap.put(200, new GenericType<CountResponse>(){});
    getCountResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getCountResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getCountResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getCountResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> getFilingsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getFilingsResponseTypeMap.put(200, new GenericType<SearchResponse>(){});
    getFilingsResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getFilingsResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getFilingsResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getFilingsResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
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
   * Returns the count of filings for specified source.
   * Returns the count of filings documents along with other response fields.
   * @param ids Requested symbols or securities.  This is a comma-separated list with a maximum limit of 1000.  Each symbol can be a FactSet exchange symbol, CUSIP, SEDOL, ISIN, or Entity ID (required)
   * @param sources Code for document source to include.This is a comma-separated list. Use the &#x60;/meta/sources&#x60; endpoint to get the list of available sources.   (required)
   * @param startDate Start Date. Format is YYYYMMDD or relative +/- days (0,-1,etc).  (optional)
   * @param endDate End Date. Format is YYYYMMDD or relative +/- days (0,-1,etc). (optional)
   * @param timeZone timeZone to return story dates and times.Time zones, represented in POSIX format, are automatically adjusted for daylight savings. timeZone names are sourced from the IANA timezone registry. (optional, default to America/New_York)
   * @param categories Code for categories to include.  This is a comma-separated list. Use the &#x60;/meta/categories&#x60; endpoint to get the list of available categories.  Default &#x3D; All categories. (optional)
   * @param primaryId Type of identifier search * true - Returns headlines of stories that have the searched identifier(s) as the primary  identifier. * false - Returns headlines of stories that mentioned or referred to the  identifier. (optional, default to false)
   * @param searchText Restricts the search to include only document stories that include the searched text. This parameter supports boolean operators as well. (optional)
   * @param formTypes The search to include any form types of given sources (optional)
   * @return CountResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public CountResponse getCount(java.util.List<String> ids, java.util.List<String> sources, String startDate, String endDate, String timeZone, java.util.List<String> categories, Boolean primaryId, String searchText, java.util.List<String> formTypes) throws ApiException {
    return getCountWithHttpInfo(ids, sources, startDate, endDate, timeZone, categories, primaryId, searchText, formTypes).getData();
  }

  /**
   * Returns the count of filings for specified source.
   * Returns the count of filings documents along with other response fields.
   * @param ids Requested symbols or securities.  This is a comma-separated list with a maximum limit of 1000.  Each symbol can be a FactSet exchange symbol, CUSIP, SEDOL, ISIN, or Entity ID (required)
   * @param sources Code for document source to include.This is a comma-separated list. Use the &#x60;/meta/sources&#x60; endpoint to get the list of available sources.   (required)
   * @param startDate Start Date. Format is YYYYMMDD or relative +/- days (0,-1,etc).  (optional)
   * @param endDate End Date. Format is YYYYMMDD or relative +/- days (0,-1,etc). (optional)
   * @param timeZone timeZone to return story dates and times.Time zones, represented in POSIX format, are automatically adjusted for daylight savings. timeZone names are sourced from the IANA timezone registry. (optional, default to America/New_York)
   * @param categories Code for categories to include.  This is a comma-separated list. Use the &#x60;/meta/categories&#x60; endpoint to get the list of available categories.  Default &#x3D; All categories. (optional)
   * @param primaryId Type of identifier search * true - Returns headlines of stories that have the searched identifier(s) as the primary  identifier. * false - Returns headlines of stories that mentioned or referred to the  identifier. (optional, default to false)
   * @param searchText Restricts the search to include only document stories that include the searched text. This parameter supports boolean operators as well. (optional)
   * @param formTypes The search to include any form types of given sources (optional)
   * @return ApiResponse&lt;CountResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CountResponse> getCountWithHttpInfo(java.util.List<String> ids, java.util.List<String> sources, String startDate, String endDate, String timeZone, java.util.List<String> categories, Boolean primaryId, String searchText, java.util.List<String> formTypes) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ids' is set
    if (ids == null) {
      throw new ApiException(400, "Missing the required parameter 'ids' when calling getCount");
    }
    
    // verify the required parameter 'sources' is set
    if (sources == null) {
      throw new ApiException(400, "Missing the required parameter 'sources' when calling getCount");
    }
    
    // create path and map variables
    String localVarPath = "/count";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startDate", startDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "endDate", endDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "ids", ids));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "sources", sources));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "timeZone", timeZone));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "categories", categories));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "primaryId", primaryId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "searchText", searchText));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "formTypes", formTypes));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        CountResponse
      
    > apiResponse = apiClient.invokeAPI("FilingsApiApi.getCount", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getCountResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Returns the filings documents and related metadata within FactSet coverage.
   * Returns the filings documents within FactSet coverage along with other response fields.
   * @param ids Requested symbols or securities.  This is a comma-separated list with a maximum limit of 1000.  Each symbol can be a FactSet exchange symbol, CUSIP, SEDOL, ISIN, or Entity ID (required)
   * @param sources  (required)
   * @param startDate Start Date. Format is YYYYMMDD or relative +/- days (0,-1,etc).  (optional)
   * @param endDate End Date. Format is YYYYMMDD or relative +/- days (0,-1,etc). (optional)
   * @param paginationLimit Number of results to return per page. (optional, default to 25)
   * @param paginationOffset Page number of the results to return.  (optional, default to 0)
   * @param timeZone timeZone to return story dates and times.Time zones, represented in POSIX format, are automatically adjusted for daylight savings. timeZone names are sourced from the IANA timezone registry. (optional, default to America/New_York)
   * @param sort Enables sorting data in ascending or descending  order based on filingsDateTime.   * &#x60;filingsDateTime&#x60; - sorting results in chronological (ascending) order. If a start date is not specified, the    API has a 10-year searching limitation.   *  &#x60;-filingsDateTime&#x60; - sorting results in reverse chronological (descending) order. This is the default value if     the sort parameter isn&#39;t used in the query. (optional, default to [\&quot;-filingsDateTime\&quot;])
   * @param categories Code for categories to include.  This is a comma-separated list. Use the &#x60;/meta/categories&#x60; endpoint to get the list of available categories.  Default &#x3D; All categories. (optional)
   * @param primaryId Type of identifier search * true - Returns headlines of stories that have the searched identifier(s) as the primary  identifier. * false - Returns headlines of stories that mentioned or referred to the  identifier. (optional, default to false)
   * @param searchText Restricts the search to include only document stories that include the searched text. This parameter supports boolean operators as well. (optional)
   * @param formTypes The search to include any form types of given sources (optional)
   * @param edgarAccession A unique identifier given to each EDGAR filings document. e.g. accession&#x3D;0001013237-21-000069&amp;sources&#x3D;EDG.   &gt; **Note:**  &gt; When used in conjunction with the &#39;sources&#39; parameter set to &#39;EDGAR, the API considers this accession for data retrieval.  &gt; For non-EDGAR sources, this parameter is ignored. (optional)
   * @return SearchResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Array of downloadable URLs consisting of Filings documents with related metadata. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public SearchResponse getFilings(java.util.List<String> ids, java.util.List<String> sources, String startDate, String endDate, Integer paginationLimit, Integer paginationOffset, String timeZone, java.util.List<String> sort, java.util.List<String> categories, Boolean primaryId, String searchText, java.util.List<String> formTypes, String edgarAccession) throws ApiException {
    return getFilingsWithHttpInfo(ids, sources, startDate, endDate, paginationLimit, paginationOffset, timeZone, sort, categories, primaryId, searchText, formTypes, edgarAccession).getData();
  }

  /**
   * Returns the filings documents and related metadata within FactSet coverage.
   * Returns the filings documents within FactSet coverage along with other response fields.
   * @param ids Requested symbols or securities.  This is a comma-separated list with a maximum limit of 1000.  Each symbol can be a FactSet exchange symbol, CUSIP, SEDOL, ISIN, or Entity ID (required)
   * @param sources  (required)
   * @param startDate Start Date. Format is YYYYMMDD or relative +/- days (0,-1,etc).  (optional)
   * @param endDate End Date. Format is YYYYMMDD or relative +/- days (0,-1,etc). (optional)
   * @param paginationLimit Number of results to return per page. (optional, default to 25)
   * @param paginationOffset Page number of the results to return.  (optional, default to 0)
   * @param timeZone timeZone to return story dates and times.Time zones, represented in POSIX format, are automatically adjusted for daylight savings. timeZone names are sourced from the IANA timezone registry. (optional, default to America/New_York)
   * @param sort Enables sorting data in ascending or descending  order based on filingsDateTime.   * &#x60;filingsDateTime&#x60; - sorting results in chronological (ascending) order. If a start date is not specified, the    API has a 10-year searching limitation.   *  &#x60;-filingsDateTime&#x60; - sorting results in reverse chronological (descending) order. This is the default value if     the sort parameter isn&#39;t used in the query. (optional, default to [\&quot;-filingsDateTime\&quot;])
   * @param categories Code for categories to include.  This is a comma-separated list. Use the &#x60;/meta/categories&#x60; endpoint to get the list of available categories.  Default &#x3D; All categories. (optional)
   * @param primaryId Type of identifier search * true - Returns headlines of stories that have the searched identifier(s) as the primary  identifier. * false - Returns headlines of stories that mentioned or referred to the  identifier. (optional, default to false)
   * @param searchText Restricts the search to include only document stories that include the searched text. This parameter supports boolean operators as well. (optional)
   * @param formTypes The search to include any form types of given sources (optional)
   * @param edgarAccession A unique identifier given to each EDGAR filings document. e.g. accession&#x3D;0001013237-21-000069&amp;sources&#x3D;EDG.   &gt; **Note:**  &gt; When used in conjunction with the &#39;sources&#39; parameter set to &#39;EDGAR, the API considers this accession for data retrieval.  &gt; For non-EDGAR sources, this parameter is ignored. (optional)
   * @return ApiResponse&lt;SearchResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Array of downloadable URLs consisting of Filings documents with related metadata. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SearchResponse> getFilingsWithHttpInfo(java.util.List<String> ids, java.util.List<String> sources, String startDate, String endDate, Integer paginationLimit, Integer paginationOffset, String timeZone, java.util.List<String> sort, java.util.List<String> categories, Boolean primaryId, String searchText, java.util.List<String> formTypes, String edgarAccession) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ids' is set
    if (ids == null) {
      throw new ApiException(400, "Missing the required parameter 'ids' when calling getFilings");
    }
    
    // verify the required parameter 'sources' is set
    if (sources == null) {
      throw new ApiException(400, "Missing the required parameter 'sources' when calling getFilings");
    }
    
    // create path and map variables
    String localVarPath = "/search";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "ids", ids));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startDate", startDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "endDate", endDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_paginationLimit", paginationLimit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_paginationOffset", paginationOffset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "timeZone", timeZone));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "_sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "sources", sources));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "categories", categories));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "primaryId", primaryId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "searchText", searchText));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "formTypes", formTypes));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "edgarAccession", edgarAccession));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        SearchResponse
      
    > apiResponse = apiClient.invokeAPI("FilingsApiApi.getFilings", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getFilingsResponseTypeMap, false);

    return apiResponse;

  }
}
