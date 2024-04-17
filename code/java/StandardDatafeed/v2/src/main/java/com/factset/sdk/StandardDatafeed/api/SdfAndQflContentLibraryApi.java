package com.factset.sdk.StandardDatafeed.api;

import com.factset.sdk.StandardDatafeed.ApiException;
import com.factset.sdk.StandardDatafeed.ApiClient;
import com.factset.sdk.StandardDatafeed.ApiResponse;
import com.factset.sdk.StandardDatafeed.Configuration;
import com.factset.sdk.StandardDatafeed.Pair;

import jakarta.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.StandardDatafeed.models.ErrorResponse;
import com.factset.sdk.StandardDatafeed.models.HistoricalFile;
import com.factset.sdk.StandardDatafeed.models.ListFile;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class SdfAndQflContentLibraryApi {
  private ApiClient apiClient;

  public SdfAndQflContentLibraryApi() {
    this(Configuration.getDefaultApiClient());
  }

  public SdfAndQflContentLibraryApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> getListFilesResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getListFilesResponseTypeMap.put(200, new GenericType<ListFile>(){});
    getListFilesResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getListFilesResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getListFilesResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getListFilesResponseTypeMap.put(429, new GenericType<ErrorResponse>(){});
    getListFilesResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> gethistoricalFilesResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    gethistoricalFilesResponseTypeMap.put(200, new GenericType<HistoricalFile>(){});
    gethistoricalFilesResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    gethistoricalFilesResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    gethistoricalFilesResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    gethistoricalFilesResponseTypeMap.put(429, new GenericType<ErrorResponse>(){});
    gethistoricalFilesResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
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
   * Returns delta &amp; full files for the schemas.
   * This endpoint returns delta and full files for all the schemas subscribed by the client.  - If the request does not include a date range filter, this endpoint returns the past 10 days of data by default.  - If filtered by a date range, the data is limited to maximum of latest 30 days.                
   * @param schema Name of the schema. (optional)
   * @param bundle Name of the bundle. (optional)
   * @param type Type of the file.  Note: - Full files are snapshots of the bundle capturing the most recent version of the bundle generated every weekend. When requesting &#39;Full&#39; files, ensure that the date range includes weekend dates. - Delta files include the incremental changes (inserts, updates, deletes), since the last file and have incremental sequence numbers.    (optional, default to delta)
   * @param startDate The earliest date of the feed file the API should fetch based on the file timestamp. Consider the following points:   - Dates provided in &#x60;startDate&#x60; and &#x60;endDate&#x60; along with &#x60;schema&#x60; parameter: The returned dataset is limited to a maximum of latest 30 days&#39; worth of records. - Format: Should be absolute (YYYY-MM-DD).  (optional)
   * @param startDateRelative The earliest date of the feed file the API should fetch based on the file timestamp. Consider the following points:  - Dates provided in &#x60;startDate&#x60; and &#x60;endDate&#x60; along with &#x60;schema&#x60; parameter: The returned dataset is limited to a maximum of latest 30 days&#39; worth of records. - Format: Specify the date using a relative term as an integer: &#39;0&#39; for today, &#39;-1&#39; for yesterday, &#39;-2&#39; for two days ago, and so forth. Negative values are used to represent past dates.  *Note:* - *Either &#x60;startDate&#x60; or &#x60;startDateRelative&#x60; should be used, but not both.* - *If both &#x60;startDate&#x60; and &#x60;startDateRelative&#x60; are provided in the same request, the API will return an error.* - *If users provide future dates in requests for &#x60;startDate&#x60; or &#x60;startDateRelative&#x60;, the API will not return any data.*  (optional)
   * @param endDate The latest date of the feed file the API should fetch for based on the file timestamp.  - Format: Should be absolute - YYYY-MM-DD.  (optional)
   * @param endDateRelative The latest date of the feed file the API should fetch for based on the file timestamp.  - Format: Specify the date using a relative term as an integer: &#39;0&#39; for today, &#39;-1&#39; for yesterday, &#39;-2&#39; for two days ago, and so forth. Negative values are used to represent past dates.  *Note:* - *Either &#x60;endDate&#x60; or &#x60;endDateRelative&#x60; should be used, but not both.* - *If both &#x60;endDate&#x60; and &#x60;endDateRelative&#x60; are provided in the same request, the API will return an error.* - *If users provide future dates in requests for &#x60;endDate&#x60; or &#x60;endDateRelative&#x60;, the API will not return any data.*  (optional)
   * @param paginationLimit Specifies the number of results to return per page. (optional, default to 20)
   * @param paginationOffset Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. (optional, default to 0)
   * @param sort Enables sorting data in ascending or descending chronological order based on startDate.  (optional, default to [\&quot;-startDate\&quot;])
   * @return ListFile
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses.  </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint but is not authorized to access it. The request was legal, but the server is refusing to respond. Please reach out to the FactSet Account Team for assistance with authorization.  </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> Quantity Limits Exceeded </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public ListFile getListFiles(String schema, String bundle, String type, String startDate, Integer startDateRelative, String endDate, Integer endDateRelative, Integer paginationLimit, Integer paginationOffset, java.util.List<String> sort) throws ApiException {
    return getListFilesWithHttpInfo(schema, bundle, type, startDate, startDateRelative, endDate, endDateRelative, paginationLimit, paginationOffset, sort).getData();
  }

  /**
   * Returns delta &amp; full files for the schemas.
   * This endpoint returns delta and full files for all the schemas subscribed by the client.  - If the request does not include a date range filter, this endpoint returns the past 10 days of data by default.  - If filtered by a date range, the data is limited to maximum of latest 30 days.                
   * @param schema Name of the schema. (optional)
   * @param bundle Name of the bundle. (optional)
   * @param type Type of the file.  Note: - Full files are snapshots of the bundle capturing the most recent version of the bundle generated every weekend. When requesting &#39;Full&#39; files, ensure that the date range includes weekend dates. - Delta files include the incremental changes (inserts, updates, deletes), since the last file and have incremental sequence numbers.    (optional, default to delta)
   * @param startDate The earliest date of the feed file the API should fetch based on the file timestamp. Consider the following points:   - Dates provided in &#x60;startDate&#x60; and &#x60;endDate&#x60; along with &#x60;schema&#x60; parameter: The returned dataset is limited to a maximum of latest 30 days&#39; worth of records. - Format: Should be absolute (YYYY-MM-DD).  (optional)
   * @param startDateRelative The earliest date of the feed file the API should fetch based on the file timestamp. Consider the following points:  - Dates provided in &#x60;startDate&#x60; and &#x60;endDate&#x60; along with &#x60;schema&#x60; parameter: The returned dataset is limited to a maximum of latest 30 days&#39; worth of records. - Format: Specify the date using a relative term as an integer: &#39;0&#39; for today, &#39;-1&#39; for yesterday, &#39;-2&#39; for two days ago, and so forth. Negative values are used to represent past dates.  *Note:* - *Either &#x60;startDate&#x60; or &#x60;startDateRelative&#x60; should be used, but not both.* - *If both &#x60;startDate&#x60; and &#x60;startDateRelative&#x60; are provided in the same request, the API will return an error.* - *If users provide future dates in requests for &#x60;startDate&#x60; or &#x60;startDateRelative&#x60;, the API will not return any data.*  (optional)
   * @param endDate The latest date of the feed file the API should fetch for based on the file timestamp.  - Format: Should be absolute - YYYY-MM-DD.  (optional)
   * @param endDateRelative The latest date of the feed file the API should fetch for based on the file timestamp.  - Format: Specify the date using a relative term as an integer: &#39;0&#39; for today, &#39;-1&#39; for yesterday, &#39;-2&#39; for two days ago, and so forth. Negative values are used to represent past dates.  *Note:* - *Either &#x60;endDate&#x60; or &#x60;endDateRelative&#x60; should be used, but not both.* - *If both &#x60;endDate&#x60; and &#x60;endDateRelative&#x60; are provided in the same request, the API will return an error.* - *If users provide future dates in requests for &#x60;endDate&#x60; or &#x60;endDateRelative&#x60;, the API will not return any data.*  (optional)
   * @param paginationLimit Specifies the number of results to return per page. (optional, default to 20)
   * @param paginationOffset Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. (optional, default to 0)
   * @param sort Enables sorting data in ascending or descending chronological order based on startDate.  (optional, default to [\&quot;-startDate\&quot;])
   * @return ApiResponse&lt;ListFile&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses.  </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint but is not authorized to access it. The request was legal, but the server is refusing to respond. Please reach out to the FactSet Account Team for assistance with authorization.  </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> Quantity Limits Exceeded </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ListFile> getListFilesWithHttpInfo(String schema, String bundle, String type, String startDate, Integer startDateRelative, String endDate, Integer endDateRelative, Integer paginationLimit, Integer paginationOffset, java.util.List<String> sort) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/list-files";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "schema", schema));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "bundle", bundle));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "type", type));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startDate", startDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startDateRelative", startDateRelative));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "endDate", endDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "endDateRelative", endDateRelative));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_paginationLimit", paginationLimit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_paginationOffset", paginationOffset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "_sort", sort));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        ListFile
      
    > apiResponse = apiClient.invokeAPI("SdfAndQflContentLibraryApi.getListFiles", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getListFilesResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Returns full historic data of specified schema and bundle.
   * This endpoint returns historical data for the specified schema and bundle.  - If no date range is specified, this endpoint grants access to all archived records back to the first full. - If filtered by a date range, the endpoint provides records within the specified date range; if it precedes the first full, all available records are included. 
   * @param schema Name of the schema. (optional)
   * @param bundle Name of the bundle. (optional)
   * @param type Type of the file.  Note: - Full files are snapshots of the bundle capturing the most recent version of the bundle generated every weekend. When requesting &#39;Full&#39; files, ensure that the date range includes weekend dates. - Delta files include the incremental changes (inserts, updates, deletes), since the last file and have incremental sequence numbers.    (optional, default to delta)
   * @param startDate The earliest date of the feed file the API should fetch based on the file timestamp.    - Format: Should be absolute (YYYY-MM-DD).  (optional)
   * @param startDateRelative The earliest date of the feed file the API should fetch based on the file timestamp.    - Format: Specify the date using a relative term as an integer: &#39;0&#39; for today, &#39;-1&#39; for yesterday, &#39;-2&#39; for two days ago, and so forth. Negative values are used to represent past dates.  *Note:* - *Either &#x60;startDate&#x60; or &#x60;startDateRelative&#x60; should be used, but not both.* - *If both &#x60;startDate&#x60; and &#x60;startDateRelative&#x60; are provided in the same request, the API will return an error.* - *If users provide future dates in requests for &#x60;startDate&#x60; or &#x60;startDateRelative&#x60;, the API will not return any data.*  (optional)
   * @param endDate The latest date of the feed file the API should fetch for based on the file timestamp.  - Format: Should be absolute - YYYY-MM-DD.  (optional)
   * @param endDateRelative The latest date of the feed file the API should fetch for based on the file timestamp.  - Format: Specify the date using a relative term as an integer: &#39;0&#39; for today, &#39;-1&#39; for yesterday, &#39;-2&#39; for two days ago, and so forth. Negative values are used to represent past dates.  *Note:* - *Either &#x60;endDate&#x60; or &#x60;endDateRelative&#x60; should be used, but not both.* - *If both &#x60;endDate&#x60; and &#x60;endDateRelative&#x60; are provided in the same request, the API will return an error.* - *If users provide future dates in requests for &#x60;endDate&#x60; or &#x60;endDateRelative&#x60;, the API will not return any data.*  (optional)
   * @param paginationLimit Specifies the number of results to return per page. (optional, default to 20)
   * @param paginationOffset Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. (optional, default to 0)
   * @param sort Enables sorting data in ascending or descending chronological order based on startDate.  (optional, default to [\&quot;-startDate\&quot;])
   * @return HistoricalFile
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses.  </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint but is not authorized to access it. The request was legal, but the server is refusing to respond. Please reach out to the FactSet Account Team for assistance with authorization.  </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> Quantity Limits Exceeded </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public HistoricalFile gethistoricalFiles(String schema, String bundle, String type, String startDate, Integer startDateRelative, String endDate, Integer endDateRelative, Integer paginationLimit, Integer paginationOffset, java.util.List<String> sort) throws ApiException {
    return gethistoricalFilesWithHttpInfo(schema, bundle, type, startDate, startDateRelative, endDate, endDateRelative, paginationLimit, paginationOffset, sort).getData();
  }

  /**
   * Returns full historic data of specified schema and bundle.
   * This endpoint returns historical data for the specified schema and bundle.  - If no date range is specified, this endpoint grants access to all archived records back to the first full. - If filtered by a date range, the endpoint provides records within the specified date range; if it precedes the first full, all available records are included. 
   * @param schema Name of the schema. (optional)
   * @param bundle Name of the bundle. (optional)
   * @param type Type of the file.  Note: - Full files are snapshots of the bundle capturing the most recent version of the bundle generated every weekend. When requesting &#39;Full&#39; files, ensure that the date range includes weekend dates. - Delta files include the incremental changes (inserts, updates, deletes), since the last file and have incremental sequence numbers.    (optional, default to delta)
   * @param startDate The earliest date of the feed file the API should fetch based on the file timestamp.    - Format: Should be absolute (YYYY-MM-DD).  (optional)
   * @param startDateRelative The earliest date of the feed file the API should fetch based on the file timestamp.    - Format: Specify the date using a relative term as an integer: &#39;0&#39; for today, &#39;-1&#39; for yesterday, &#39;-2&#39; for two days ago, and so forth. Negative values are used to represent past dates.  *Note:* - *Either &#x60;startDate&#x60; or &#x60;startDateRelative&#x60; should be used, but not both.* - *If both &#x60;startDate&#x60; and &#x60;startDateRelative&#x60; are provided in the same request, the API will return an error.* - *If users provide future dates in requests for &#x60;startDate&#x60; or &#x60;startDateRelative&#x60;, the API will not return any data.*  (optional)
   * @param endDate The latest date of the feed file the API should fetch for based on the file timestamp.  - Format: Should be absolute - YYYY-MM-DD.  (optional)
   * @param endDateRelative The latest date of the feed file the API should fetch for based on the file timestamp.  - Format: Specify the date using a relative term as an integer: &#39;0&#39; for today, &#39;-1&#39; for yesterday, &#39;-2&#39; for two days ago, and so forth. Negative values are used to represent past dates.  *Note:* - *Either &#x60;endDate&#x60; or &#x60;endDateRelative&#x60; should be used, but not both.* - *If both &#x60;endDate&#x60; and &#x60;endDateRelative&#x60; are provided in the same request, the API will return an error.* - *If users provide future dates in requests for &#x60;endDate&#x60; or &#x60;endDateRelative&#x60;, the API will not return any data.*  (optional)
   * @param paginationLimit Specifies the number of results to return per page. (optional, default to 20)
   * @param paginationOffset Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. (optional, default to 0)
   * @param sort Enables sorting data in ascending or descending chronological order based on startDate.  (optional, default to [\&quot;-startDate\&quot;])
   * @return ApiResponse&lt;HistoricalFile&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses.  </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint but is not authorized to access it. The request was legal, but the server is refusing to respond. Please reach out to the FactSet Account Team for assistance with authorization.  </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> Quantity Limits Exceeded </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<HistoricalFile> gethistoricalFilesWithHttpInfo(String schema, String bundle, String type, String startDate, Integer startDateRelative, String endDate, Integer endDateRelative, Integer paginationLimit, Integer paginationOffset, java.util.List<String> sort) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/historical-files";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "schema", schema));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "bundle", bundle));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "type", type));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startDate", startDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startDateRelative", startDateRelative));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "endDate", endDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "endDateRelative", endDateRelative));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_paginationLimit", paginationLimit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_paginationOffset", paginationOffset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "_sort", sort));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        HistoricalFile
      
    > apiResponse = apiClient.invokeAPI("SdfAndQflContentLibraryApi.gethistoricalFiles", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, gethistoricalFilesResponseTypeMap, false);

    return apiResponse;

  }
}
