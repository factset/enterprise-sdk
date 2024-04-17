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

import com.factset.sdk.GlobalFilings.models.ErrorResponse;
import com.factset.sdk.GlobalFilings.models.InvestmentResearch;
import com.factset.sdk.GlobalFilings.models.ResponseCategies;
import com.factset.sdk.GlobalFilings.models.ResponseCount;
import com.factset.sdk.GlobalFilings.models.ResponseFormtype;
import com.factset.sdk.GlobalFilings.models.ResponseSources;
import com.factset.sdk.GlobalFilings.models.ResponseTime;

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
    getCountResponseTypeMap.put(200, new GenericType<ResponseCount>(){});
    getCountResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getCountResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getCountResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getCountResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> getFilingsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getFilingsResponseTypeMap.put(200, new GenericType<InvestmentResearch>(){});
    getFilingsResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getFilingsResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getFilingsResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getFilingsResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> getFormtypeResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getFormtypeResponseTypeMap.put(200, new GenericType<ResponseFormtype>(){});
    getFormtypeResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getFormtypeResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getFormtypeResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getFormtypeResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> getSourcesResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getSourcesResponseTypeMap.put(200, new GenericType<ResponseSources>(){});
    getSourcesResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getSourcesResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getSourcesResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getSourcesResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> getTimezoneResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getTimezoneResponseTypeMap.put(200, new GenericType<ResponseTime>(){});
    getTimezoneResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getTimezoneResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getTimezoneResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getTimezoneResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> getcategoriesResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getcategoriesResponseTypeMap.put(200, new GenericType<ResponseCategies>(){});
    getcategoriesResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getcategoriesResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getcategoriesResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getcategoriesResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
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
   * @param sources Code for document source to include.This is a comma-separated list. Use the &#x60;&#x60;&#x60;/reference/sources&#x60;&#x60;&#x60; endpoint to get the list of available sources.   (required)
   * @param startDate Start Date. Format is YYYYMMDD or relative +/- days (0,-1,etc).  **Note:** **The API supports data from 1995 onwards. Ensure that the provided Date falls within this range for accurate results.**  (optional, default to 0)
   * @param endDate End Date. Format is YYYYMMDD or relative +/- days (0,-1,etc). (optional, default to 0)
   * @param ids Requested symbols or securities.  This is a comma-separated list with a maximum limit of 1000.  Each symbol can be a FactSet exchange symbol, CUSIP, or SEDOL. (optional)
   * @return ResponseCount
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
  public ResponseCount getCount(java.util.List<String> sources, String startDate, String endDate, java.util.List<String> ids) throws ApiException {
    return getCountWithHttpInfo(sources, startDate, endDate, ids).getData();
  }

  /**
   * Returns the count of filings for specified source.
   * Returns the count of filings documents along with other response fields.
   * @param sources Code for document source to include.This is a comma-separated list. Use the &#x60;&#x60;&#x60;/reference/sources&#x60;&#x60;&#x60; endpoint to get the list of available sources.   (required)
   * @param startDate Start Date. Format is YYYYMMDD or relative +/- days (0,-1,etc).  **Note:** **The API supports data from 1995 onwards. Ensure that the provided Date falls within this range for accurate results.**  (optional, default to 0)
   * @param endDate End Date. Format is YYYYMMDD or relative +/- days (0,-1,etc). (optional, default to 0)
   * @param ids Requested symbols or securities.  This is a comma-separated list with a maximum limit of 1000.  Each symbol can be a FactSet exchange symbol, CUSIP, or SEDOL. (optional)
   * @return ApiResponse&lt;ResponseCount&gt;
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
  public ApiResponse<ResponseCount> getCountWithHttpInfo(java.util.List<String> sources, String startDate, String endDate, java.util.List<String> ids) throws ApiException {
    Object localVarPostBody = null;
    
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

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        ResponseCount
      
    > apiResponse = apiClient.invokeAPI("FilingsApiApi.getCount", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getCountResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Returns the filings documents and related metadata within FactSet coverage.
   * Returns the filings documents within FactSet coverage along with other response fields.
   * @param sources Code for document source to include.  This is a comma-separated list. Use the &#x60;&#x60;&#x60;/reference/sources&#x60;&#x60;&#x60; endpoint to get the list of available sources. (required)
   * @param ids Requested symbols or securities.  This is a comma-separated list with a maximum limit of 1000.  Each symbol can be a FactSet exchange symbol, CUSIP, or SEDOL. (optional)
   * @param startDate Start Date. Format is YYYYMMDD or relative +/- days (0,-1,etc).  **Note:** **The API supports data from 1995 onwards. Ensure that the provided Date falls within this range for accurate results.**  (optional, default to 0)
   * @param endDate End Date. Format is YYYYMMDD or relative +/- days (0,-1,etc). (optional, default to 0)
   * @param paginationLimit Number of results to return per page. (optional, default to 25)
   * @param paginationOffset Page number of the results to return. (optional)
   * @param timeZone timeZone to return story dates and times.Time zones, represented in POSIX format, are automatically adjusted for daylight savings. timeZone names are sourced from the IANA timezone registry. (optional, default to America/New_York)
   * @param sort Sorting the results in chronological (oldest to newest) or reverse chronological (newest to oldest) order.    *  desc - sorting results in reverse chronological (descending) order. This is the default value if     the sort parameter isn&#39;t used in the query.       *   asc - sorting results in chronological (ascending) order. If a start date is not specified, the    API has a 10-year searching limitation.  (optional, default to desc)
   * @param categories Code for categories to include.  This is a comma-separated list. Use the &#x60;&#x60;&#x60;/reference/categories&#x60;&#x60;&#x60; endpoint to get the list of available categories.  Default &#x3D; All categories. (optional)
   * @param primaryId Type of identifier search * true - Returns headlines of stories that have the searched identifier(s) as the primary  identifier. * false - Returns headlines of stories that mentioned or referred to the  identifier. (optional, default to false)
   * @param searchText Restricts the search to include only document stories which include the text searched. (optional)
   * @param edgarFormType Restricts the search to include any form types of EDGAR.  **Note:This parameter applies exclusively to EDGAR searches; it is ignored when used with non-EDGAR sources.**  (optional)
   * @param edgarAccession A unique identifier given to each EDGAR filings document. e.g. accession&#x3D;0001013237-21-000069&amp;sources&#x3D;EDG.  **Note:  When used in conjunction with the &#39;source&#39; parameter set to &#39;EDGAR&#39;, the API considers this accession for data retrieval. For non-EDGAR sources, this parameter is ignored.** (optional)
   * @return InvestmentResearch
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
  public InvestmentResearch getFilings(java.util.List<String> sources, java.util.List<String> ids, String startDate, String endDate, Integer paginationLimit, Integer paginationOffset, String timeZone, String sort, java.util.List<String> categories, Boolean primaryId, String searchText, String edgarFormType, String edgarAccession) throws ApiException {
    return getFilingsWithHttpInfo(sources, ids, startDate, endDate, paginationLimit, paginationOffset, timeZone, sort, categories, primaryId, searchText, edgarFormType, edgarAccession).getData();
  }

  /**
   * Returns the filings documents and related metadata within FactSet coverage.
   * Returns the filings documents within FactSet coverage along with other response fields.
   * @param sources Code for document source to include.  This is a comma-separated list. Use the &#x60;&#x60;&#x60;/reference/sources&#x60;&#x60;&#x60; endpoint to get the list of available sources. (required)
   * @param ids Requested symbols or securities.  This is a comma-separated list with a maximum limit of 1000.  Each symbol can be a FactSet exchange symbol, CUSIP, or SEDOL. (optional)
   * @param startDate Start Date. Format is YYYYMMDD or relative +/- days (0,-1,etc).  **Note:** **The API supports data from 1995 onwards. Ensure that the provided Date falls within this range for accurate results.**  (optional, default to 0)
   * @param endDate End Date. Format is YYYYMMDD or relative +/- days (0,-1,etc). (optional, default to 0)
   * @param paginationLimit Number of results to return per page. (optional, default to 25)
   * @param paginationOffset Page number of the results to return. (optional)
   * @param timeZone timeZone to return story dates and times.Time zones, represented in POSIX format, are automatically adjusted for daylight savings. timeZone names are sourced from the IANA timezone registry. (optional, default to America/New_York)
   * @param sort Sorting the results in chronological (oldest to newest) or reverse chronological (newest to oldest) order.    *  desc - sorting results in reverse chronological (descending) order. This is the default value if     the sort parameter isn&#39;t used in the query.       *   asc - sorting results in chronological (ascending) order. If a start date is not specified, the    API has a 10-year searching limitation.  (optional, default to desc)
   * @param categories Code for categories to include.  This is a comma-separated list. Use the &#x60;&#x60;&#x60;/reference/categories&#x60;&#x60;&#x60; endpoint to get the list of available categories.  Default &#x3D; All categories. (optional)
   * @param primaryId Type of identifier search * true - Returns headlines of stories that have the searched identifier(s) as the primary  identifier. * false - Returns headlines of stories that mentioned or referred to the  identifier. (optional, default to false)
   * @param searchText Restricts the search to include only document stories which include the text searched. (optional)
   * @param edgarFormType Restricts the search to include any form types of EDGAR.  **Note:This parameter applies exclusively to EDGAR searches; it is ignored when used with non-EDGAR sources.**  (optional)
   * @param edgarAccession A unique identifier given to each EDGAR filings document. e.g. accession&#x3D;0001013237-21-000069&amp;sources&#x3D;EDG.  **Note:  When used in conjunction with the &#39;source&#39; parameter set to &#39;EDGAR&#39;, the API considers this accession for data retrieval. For non-EDGAR sources, this parameter is ignored.** (optional)
   * @return ApiResponse&lt;InvestmentResearch&gt;
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
  public ApiResponse<InvestmentResearch> getFilingsWithHttpInfo(java.util.List<String> sources, java.util.List<String> ids, String startDate, String endDate, Integer paginationLimit, Integer paginationOffset, String timeZone, String sort, java.util.List<String> categories, Boolean primaryId, String searchText, String edgarFormType, String edgarAccession) throws ApiException {
    Object localVarPostBody = null;
    
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
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "sources", sources));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "categories", categories));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "primaryId", primaryId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "searchText", searchText));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "edgarFormType", edgarFormType));
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
        
        InvestmentResearch
      
    > apiResponse = apiClient.invokeAPI("FilingsApiApi.getFilings", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getFilingsResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Returns the form types of EDGAR.
   *  Retrieves and delivers a comprehensive list of all available  &#x60;formTypes&#x60;.
   * @return ResponseFormtype
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
  public ResponseFormtype getFormtype() throws ApiException {
    return getFormtypeWithHttpInfo().getData();
  }

  /**
   * Returns the form types of EDGAR.
   *  Retrieves and delivers a comprehensive list of all available  &#x60;formTypes&#x60;.
   * @return ApiResponse&lt;ResponseFormtype&gt;
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
  public ApiResponse<ResponseFormtype> getFormtypeWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/reference/form-types";

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
        
        ResponseFormtype
      
    > apiResponse = apiClient.invokeAPI("FilingsApiApi.getFormtype", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getFormtypeResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Returns the sources.
   * Retrieves and delivers a comprehensive list of all available &#x60;sources&#x60;.
   * @return ResponseSources
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
  public ResponseSources getSources() throws ApiException {
    return getSourcesWithHttpInfo().getData();
  }

  /**
   * Returns the sources.
   * Retrieves and delivers a comprehensive list of all available &#x60;sources&#x60;.
   * @return ApiResponse&lt;ResponseSources&gt;
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
  public ApiResponse<ResponseSources> getSourcesWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/reference/sources";

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
        
        ResponseSources
      
    > apiResponse = apiClient.invokeAPI("FilingsApiApi.getSources", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getSourcesResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Returns the time zones.
   * Retrieves and delivers a comprehensive list of all available &#x60;timeZones&#x60;.
   * @return ResponseTime
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
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
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
      
    > apiResponse = apiClient.invokeAPI("FilingsApiApi.getTimezone", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getTimezoneResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Returns the categories.
   * Retrieves and delivers a comprehensive list of all available &#x60;categories&#x60;.
   * @return ResponseCategies
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
  public ResponseCategies getcategories() throws ApiException {
    return getcategoriesWithHttpInfo().getData();
  }

  /**
   * Returns the categories.
   * Retrieves and delivers a comprehensive list of all available &#x60;categories&#x60;.
   * @return ApiResponse&lt;ResponseCategies&gt;
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
  public ApiResponse<ResponseCategies> getcategoriesWithHttpInfo() throws ApiException {
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
        
        ResponseCategies
      
    > apiResponse = apiClient.invokeAPI("FilingsApiApi.getcategories", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getcategoriesResponseTypeMap, false);

    return apiResponse;

  }
}
