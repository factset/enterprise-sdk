package com.factset.sdk.GlobalFilings.api;

import com.factset.sdk.GlobalFilings.ApiException;
import com.factset.sdk.GlobalFilings.ApiClient;
import com.factset.sdk.GlobalFilings.ApiResponse;
import com.factset.sdk.GlobalFilings.Configuration;
import com.factset.sdk.GlobalFilings.Pair;

import javax.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.GlobalFilings.models.ErrorResponse;
import com.factset.sdk.GlobalFilings.models.InvestmentResearch;
import com.factset.sdk.GlobalFilings.models.ResponseCount;
import com.factset.sdk.GlobalFilings.models.ResponseHelper;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
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

  private static final Map<Integer, GenericType> getHelperResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getHelperResponseTypeMap.put(200, new GenericType<ResponseHelper>(){});
    getHelperResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getHelperResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getHelperResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getHelperResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
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
   * Returns the count of filings for specified source
   * Returns the count of filings documents along with other response fields.
   * @param report retrives count of source. (required)
   * @param sources Code for document source to include.This is a comma-separated list. Use the &#x60;&#x60;&#x60;/helper&#x60;&#x60;&#x60; endpoint to get the list of available sources.   (required)
   * @param startDate Start Date. Format is YYYYMMDD or relative +/- days (0,-1,etc). (optional, default to 0)
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
  public ResponseCount getCount(String report, java.util.List<String> sources, String startDate, String endDate, java.util.List<String> ids) throws ApiException {
    return getCountWithHttpInfo(report, sources, startDate, endDate, ids).getData();
  }

  /**
   * Returns the count of filings for specified source
   * Returns the count of filings documents along with other response fields.
   * @param report retrives count of source. (required)
   * @param sources Code for document source to include.This is a comma-separated list. Use the &#x60;&#x60;&#x60;/helper&#x60;&#x60;&#x60; endpoint to get the list of available sources.   (required)
   * @param startDate Start Date. Format is YYYYMMDD or relative +/- days (0,-1,etc). (optional, default to 0)
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
  public ApiResponse<ResponseCount> getCountWithHttpInfo(String report, java.util.List<String> sources, String startDate, String endDate, java.util.List<String> ids) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'report' is set
    if (report == null) {
      throw new ApiException(400, "Missing the required parameter 'report' when calling getCount");
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

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "report", report));
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
   * Returns the filings documents within FactSet coverage along with other response fields
   * @param sources Code for document source to include.  This is a comma-separated list. Use the &#x60;&#x60;&#x60;/helper&#x60;&#x60;&#x60; endpoint to get the list of available sources. (required)
   * @param ids Requested symbols or securities.  This is a comma-separated list with a maximum limit of 1000.  Each symbol can be a FactSet exchange symbol, CUSIP, or SEDOL. (optional)
   * @param startDate Start Date. Format is YYYYMMDD or relative +/- days (0,-1,etc). (optional, default to 0)
   * @param endDate End Date. Format is YYYYMMDD or relative +/- days (0,-1,etc). (optional, default to 0)
   * @param paginationLimit Number of results to return per page. (optional, default to 25)
   * @param paginationOffset Page number of the results to return. (optional)
   * @param timezone Time zone to return story dates and times. Time zones are in POSIX format and automatically adjusted for daylight savings. (optional, default to America/New_York)
   * @param sort Sorting the results in chronological (oldest to newest) or reverse chronological (newest to oldest) order.    *  desc - sorting results in reverse chronological (descending) order. This is the default value if     the sort parameter isn’t used in the query       *   asc - sorting results in chronological (ascending) order. If a start date is not specified, the    API has a 10-year searching limitation.  (optional, default to desc)
   * @param categories Code for categories to include.  This is a comma-separated list. Use the &#x60;&#x60;&#x60;/helper&#x60;&#x60;&#x60; endpoint to get the list of available categories.  Default &#x3D; All categories. (optional)
   * @param primaryId Type of identifier search * Y - Returns headlines of stories that have the search ID(s) as the Primary ID. * N - Returns headlines of stories that mention/refer to the ID(s). (optional, default to N)
   * @param searchText Restricts the search to include only document stories which include the text searched. (optional)
   * @param formType Restricts the search to include any form types of EDGAR. (optional)
   * @param accession A unique identifier given to each EDGAR filings document. e.g. accession&#x3D;0001013237-21-000069&amp;sources&#x3D;EDG (optional)
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
  public InvestmentResearch getFilings(java.util.List<String> sources, java.util.List<String> ids, String startDate, String endDate, Integer paginationLimit, Integer paginationOffset, String timezone, String sort, java.util.List<String> categories, String primaryId, String searchText, String formType, String accession) throws ApiException {
    return getFilingsWithHttpInfo(sources, ids, startDate, endDate, paginationLimit, paginationOffset, timezone, sort, categories, primaryId, searchText, formType, accession).getData();
  }

  /**
   * Returns the filings documents and related metadata within FactSet coverage.
   * Returns the filings documents within FactSet coverage along with other response fields
   * @param sources Code for document source to include.  This is a comma-separated list. Use the &#x60;&#x60;&#x60;/helper&#x60;&#x60;&#x60; endpoint to get the list of available sources. (required)
   * @param ids Requested symbols or securities.  This is a comma-separated list with a maximum limit of 1000.  Each symbol can be a FactSet exchange symbol, CUSIP, or SEDOL. (optional)
   * @param startDate Start Date. Format is YYYYMMDD or relative +/- days (0,-1,etc). (optional, default to 0)
   * @param endDate End Date. Format is YYYYMMDD or relative +/- days (0,-1,etc). (optional, default to 0)
   * @param paginationLimit Number of results to return per page. (optional, default to 25)
   * @param paginationOffset Page number of the results to return. (optional)
   * @param timezone Time zone to return story dates and times. Time zones are in POSIX format and automatically adjusted for daylight savings. (optional, default to America/New_York)
   * @param sort Sorting the results in chronological (oldest to newest) or reverse chronological (newest to oldest) order.    *  desc - sorting results in reverse chronological (descending) order. This is the default value if     the sort parameter isn’t used in the query       *   asc - sorting results in chronological (ascending) order. If a start date is not specified, the    API has a 10-year searching limitation.  (optional, default to desc)
   * @param categories Code for categories to include.  This is a comma-separated list. Use the &#x60;&#x60;&#x60;/helper&#x60;&#x60;&#x60; endpoint to get the list of available categories.  Default &#x3D; All categories. (optional)
   * @param primaryId Type of identifier search * Y - Returns headlines of stories that have the search ID(s) as the Primary ID. * N - Returns headlines of stories that mention/refer to the ID(s). (optional, default to N)
   * @param searchText Restricts the search to include only document stories which include the text searched. (optional)
   * @param formType Restricts the search to include any form types of EDGAR. (optional)
   * @param accession A unique identifier given to each EDGAR filings document. e.g. accession&#x3D;0001013237-21-000069&amp;sources&#x3D;EDG (optional)
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
  public ApiResponse<InvestmentResearch> getFilingsWithHttpInfo(java.util.List<String> sources, java.util.List<String> ids, String startDate, String endDate, Integer paginationLimit, Integer paginationOffset, String timezone, String sort, java.util.List<String> categories, String primaryId, String searchText, String formType, String accession) throws ApiException {
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
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "paginationLimit", paginationLimit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "paginationOffset", paginationOffset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "timezone", timezone));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "sources", sources));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "categories", categories));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "primaryId", primaryId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "searchText", searchText));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "formType", formType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "accession", accession));

    
    
    
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
   * Returns the static values for various parameters
   * Returns the static values for sources,formTypes,timeZones,categories based on the specified parameter
   * @param fields Request data for given field. (optional)
   * @return ResponseHelper
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
  public ResponseHelper getHelper(String fields) throws ApiException {
    return getHelperWithHttpInfo(fields).getData();
  }

  /**
   * Returns the static values for various parameters
   * Returns the static values for sources,formTypes,timeZones,categories based on the specified parameter
   * @param fields Request data for given field. (optional)
   * @return ApiResponse&lt;ResponseHelper&gt;
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
  public ApiResponse<ResponseHelper> getHelperWithHttpInfo(String fields) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/helper";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "fields", fields));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        ResponseHelper
      
    > apiResponse = apiClient.invokeAPI("FilingsApiApi.getHelper", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getHelperResponseTypeMap, false);

    return apiResponse;

  }
}
