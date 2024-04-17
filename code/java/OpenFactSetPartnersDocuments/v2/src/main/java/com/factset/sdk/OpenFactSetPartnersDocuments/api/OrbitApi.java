package com.factset.sdk.OpenFactSetPartnersDocuments.api;

import com.factset.sdk.OpenFactSetPartnersDocuments.ApiException;
import com.factset.sdk.OpenFactSetPartnersDocuments.ApiClient;
import com.factset.sdk.OpenFactSetPartnersDocuments.ApiResponse;
import com.factset.sdk.OpenFactSetPartnersDocuments.Configuration;
import com.factset.sdk.OpenFactSetPartnersDocuments.Pair;

import jakarta.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.OpenFactSetPartnersDocuments.models.AuthStatus;
import java.time.LocalDate;
import com.factset.sdk.OpenFactSetPartnersDocuments.models.OrbitResponse;
import com.factset.sdk.OpenFactSetPartnersDocuments.models.OrbithistoryResponse;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class OrbitApi {
  private ApiClient apiClient;

  public OrbitApi() {
    this(Configuration.getDefaultApiClient());
  }

  public OrbitApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> getChineseTranscriptsDailyResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getChineseTranscriptsDailyResponseTypeMap.put(200, new GenericType<OrbitResponse>(){});
    getChineseTranscriptsDailyResponseTypeMap.put(400, new GenericType<AuthStatus>(){});
    getChineseTranscriptsDailyResponseTypeMap.put(401, new GenericType<AuthStatus>(){});
    getChineseTranscriptsDailyResponseTypeMap.put(403, new GenericType<AuthStatus>(){});
    getChineseTranscriptsDailyResponseTypeMap.put(500, new GenericType<AuthStatus>(){});
  }

  private static final Map<Integer, GenericType> getChineseTranscriptsHistoryResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getChineseTranscriptsHistoryResponseTypeMap.put(200, new GenericType<OrbithistoryResponse>(){});
    getChineseTranscriptsHistoryResponseTypeMap.put(400, new GenericType<AuthStatus>(){});
    getChineseTranscriptsHistoryResponseTypeMap.put(401, new GenericType<AuthStatus>(){});
    getChineseTranscriptsHistoryResponseTypeMap.put(403, new GenericType<AuthStatus>(){});
    getChineseTranscriptsHistoryResponseTypeMap.put(500, new GenericType<AuthStatus>(){});
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
   * Returns the daily files from Open:FactSet Partner - Orbit.
   * Returns the daily files from Open:FactSet Partner - Orbit.
   * @param sort Enables to get the data in ascending or descending order based on startTime. Results are in reverse chronological order if this parameter is not used. (optional, default to -startDate)
   * @param paginationLimit Specifies the maximum number of results to return per result. (optional, default to 20)
   * @param paginationOffset Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. Using this parameter can fetch maximum of first 10000 records. (optional, default to 0)
   * @param startDate The earliest date of the Orbit file the API should fetching for based on fileTimestamp. (optional)
   * @param endDate The latest date of the Orbit file the API should fetching for based on fileTimestamp. (optional)
   * @param stockCode The company/ticker which is associated with the transcript. Please submit a question via Issue Tracker under the Open:FactSet - Partner Communication to get the required list of tickers.  (optional)
   * @param fileName This parameter is used to filters the results based on file name. (optional)
   * @param title This parameter is used to filter the results based on the headline of the transcript. (optional)
   * @return OrbitResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Download link &amp; metadata for Orbit data. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public OrbitResponse getChineseTranscriptsDaily(String sort, Integer paginationLimit, Integer paginationOffset, LocalDate startDate, LocalDate endDate, String stockCode, String fileName, String title) throws ApiException {
    return getChineseTranscriptsDailyWithHttpInfo(sort, paginationLimit, paginationOffset, startDate, endDate, stockCode, fileName, title).getData();
  }

  /**
   * Returns the daily files from Open:FactSet Partner - Orbit.
   * Returns the daily files from Open:FactSet Partner - Orbit.
   * @param sort Enables to get the data in ascending or descending order based on startTime. Results are in reverse chronological order if this parameter is not used. (optional, default to -startDate)
   * @param paginationLimit Specifies the maximum number of results to return per result. (optional, default to 20)
   * @param paginationOffset Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. Using this parameter can fetch maximum of first 10000 records. (optional, default to 0)
   * @param startDate The earliest date of the Orbit file the API should fetching for based on fileTimestamp. (optional)
   * @param endDate The latest date of the Orbit file the API should fetching for based on fileTimestamp. (optional)
   * @param stockCode The company/ticker which is associated with the transcript. Please submit a question via Issue Tracker under the Open:FactSet - Partner Communication to get the required list of tickers.  (optional)
   * @param fileName This parameter is used to filters the results based on file name. (optional)
   * @param title This parameter is used to filter the results based on the headline of the transcript. (optional)
   * @return ApiResponse&lt;OrbitResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Download link &amp; metadata for Orbit data. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<OrbitResponse> getChineseTranscriptsDailyWithHttpInfo(String sort, Integer paginationLimit, Integer paginationOffset, LocalDate startDate, LocalDate endDate, String stockCode, String fileName, String title) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/orbit/transcripts/daily";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_paginationLimit", paginationLimit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_paginationOffset", paginationOffset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startDate", startDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "endDate", endDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "stockCode", stockCode));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "fileName", fileName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "title", title));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        OrbitResponse
      
    > apiResponse = apiClient.invokeAPI("OrbitApi.getChineseTranscriptsDaily", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getChineseTranscriptsDailyResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Returns the history files from Open:FactSet Partner - Orbit
   * Returns the historical files from February 28th, 2005 to current date. 
   * @param paginationLimit Specifies the maximum number of results to return per result. (optional, default to 20)
   * @param paginationOffset Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. Using this parameter can fetch maximum of first 10000 records. (optional, default to 0)
   * @param fileName This parameter is used to filters the results based on file name. (optional)
   * @return OrbithistoryResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Download link &amp; metadata for Orbit data. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public OrbithistoryResponse getChineseTranscriptsHistory(Integer paginationLimit, Integer paginationOffset, String fileName) throws ApiException {
    return getChineseTranscriptsHistoryWithHttpInfo(paginationLimit, paginationOffset, fileName).getData();
  }

  /**
   * Returns the history files from Open:FactSet Partner - Orbit
   * Returns the historical files from February 28th, 2005 to current date. 
   * @param paginationLimit Specifies the maximum number of results to return per result. (optional, default to 20)
   * @param paginationOffset Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. Using this parameter can fetch maximum of first 10000 records. (optional, default to 0)
   * @param fileName This parameter is used to filters the results based on file name. (optional)
   * @return ApiResponse&lt;OrbithistoryResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Download link &amp; metadata for Orbit data. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<OrbithistoryResponse> getChineseTranscriptsHistoryWithHttpInfo(Integer paginationLimit, Integer paginationOffset, String fileName) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/orbit/transcripts/history";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_paginationLimit", paginationLimit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_paginationOffset", paginationOffset));
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
        
        OrbithistoryResponse
      
    > apiResponse = apiClient.invokeAPI("OrbitApi.getChineseTranscriptsHistory", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getChineseTranscriptsHistoryResponseTypeMap, false);

    return apiResponse;

  }
}
