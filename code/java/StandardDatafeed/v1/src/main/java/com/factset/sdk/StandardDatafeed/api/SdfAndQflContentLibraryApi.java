package com.factset.sdk.StandardDatafeed.api;

import com.factset.sdk.StandardDatafeed.ApiException;
import com.factset.sdk.StandardDatafeed.ApiClient;
import com.factset.sdk.StandardDatafeed.ApiResponse;
import com.factset.sdk.StandardDatafeed.Configuration;
import com.factset.sdk.StandardDatafeed.Pair;

import javax.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.StandardDatafeed.models.ListFiles200Response;
import com.factset.sdk.StandardDatafeed.models.ListFiles400Response;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SdfAndQflContentLibraryApi {
  private ApiClient apiClient;

  public SdfAndQflContentLibraryApi() {
    this(Configuration.getDefaultApiClient());
  }

  public SdfAndQflContentLibraryApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> getV1ListFilesResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getV1ListFilesResponseTypeMap.put(200, new GenericType<ListFiles200Response>(){});
    getV1ListFilesResponseTypeMap.put(400, new GenericType<ListFiles400Response>(){});
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
   * 
   * &lt;a href&#x3D;https://api.factset.com/bulk-documents/sdf/v1/list-files&gt;List-Files&lt;/a&gt; end point provides the delta &amp; full files in a reverse chronological order by default for all the schemas &amp; bundles subscribed by the client    QFL:-    - In case of QFL, &lt;a href&#x3D;https://api.factset.com/bulk-documents/sdf/v1/list-files&gt;List-Files&lt;/a&gt; end point provides the \&quot;Historical &amp; Year to Date (YTD)\&quot; data in a reverse chronological order by default for all the factor families &amp; groups subscribed to by the user&lt;/p&gt; Provides \&quot;full files\&quot; only for historical bundles[data available from 1995 to previous year], \&quot;full &amp; delta files\&quot; for YTD bundles[data available for current year]        If startDate and endDate parameters are not specified in the request, this endpoint returns past 10 days data by default. 
   * @param schema schema name&lt;/p&gt; &lt;/p&gt; **Example: acta_v1, fgp_v1, yn_v1**  QFL:- To query QFL data, please use value:   **qfl_v1**  (optional)
   * @param bundle bundle name&lt;/p&gt; If this parameter is not passed in the request, all the bundles a client is subscribed to are returned.  QFL:- - For QFL its the factor group name - If this parameter is not passed in the request, all the the factor families &amp; factor groups subscribed to by the user are returned. - Supports comma separated list of multiple factor groups (optional)
   * @param type file type &#x3D; Full or Delta&lt;/p&gt; Full files are weekly files generated every weekend (Saturday). **The date range should include weekend dates if requesting for \&quot;Full\&quot; files**  QFL:- In case of QFL we have - Historical files (1995 to previous year)- Always \&quot;Full\&quot; . A \&quot;Full\&quot; file is generated for each year - For YTD (Current year)- \&quot;Full\&quot; files are weekly files generated every weekend (Saturday). The date range should include weekend dates if requesting for \&quot;Full\&quot; files (optional)
   * @param startDate The earliest date of the feed file the API should fetch for based on the fileTimestamp.&lt;/p&gt;   - If schema parameter is not specified in the request, then data requested should be in batches of 10days or less**(Date range should be less than or equal to 10)** - If the schema parameter is specified in the request, date range can be greater than 10 days - If startDate and endDate parameters are not specified in the request, this endpoint returns past 10 days data by default. - startDate can be absolute- YYYY-MM-DD or relative:-  -1 for yesterday  QFL:- In case of QFL - Historical files available from 1995-01-01 to 2021-12-31. YTD files are current year files. (optional)
   * @param endDate The latest date of the feed file the API should fetch for based on the fileTimestamp  If startDate and endDate parameters are not specified in the request, this endpoint returns past 10 days data by default.  endDate can be in absolute- YYYY-MM-DD or relative date:- 0 for today (optional)
   * @param paginationLimit Specifies the number of results to return per page. Default is 20 &amp; Maximum is 500 results per page (optional, default to 20)
   * @param paginationOffset Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results (optional, default to 0)
   * @param sort Enables to get the data in ascending or descending order based on startTime. Results are in reverse chronological order if this parameter is not used (optional)
   * @return ListFiles200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     </table>
   */
  public ListFiles200Response getV1ListFiles(String schema, String bundle, String type, String startDate, String endDate, Integer paginationLimit, Integer paginationOffset, String sort) throws ApiException {
    return getV1ListFilesWithHttpInfo(schema, bundle, type, startDate, endDate, paginationLimit, paginationOffset, sort).getData();
  }

  /**
   * 
   * &lt;a href&#x3D;https://api.factset.com/bulk-documents/sdf/v1/list-files&gt;List-Files&lt;/a&gt; end point provides the delta &amp; full files in a reverse chronological order by default for all the schemas &amp; bundles subscribed by the client    QFL:-    - In case of QFL, &lt;a href&#x3D;https://api.factset.com/bulk-documents/sdf/v1/list-files&gt;List-Files&lt;/a&gt; end point provides the \&quot;Historical &amp; Year to Date (YTD)\&quot; data in a reverse chronological order by default for all the factor families &amp; groups subscribed to by the user&lt;/p&gt; Provides \&quot;full files\&quot; only for historical bundles[data available from 1995 to previous year], \&quot;full &amp; delta files\&quot; for YTD bundles[data available for current year]        If startDate and endDate parameters are not specified in the request, this endpoint returns past 10 days data by default. 
   * @param schema schema name&lt;/p&gt; &lt;/p&gt; **Example: acta_v1, fgp_v1, yn_v1**  QFL:- To query QFL data, please use value:   **qfl_v1**  (optional)
   * @param bundle bundle name&lt;/p&gt; If this parameter is not passed in the request, all the bundles a client is subscribed to are returned.  QFL:- - For QFL its the factor group name - If this parameter is not passed in the request, all the the factor families &amp; factor groups subscribed to by the user are returned. - Supports comma separated list of multiple factor groups (optional)
   * @param type file type &#x3D; Full or Delta&lt;/p&gt; Full files are weekly files generated every weekend (Saturday). **The date range should include weekend dates if requesting for \&quot;Full\&quot; files**  QFL:- In case of QFL we have - Historical files (1995 to previous year)- Always \&quot;Full\&quot; . A \&quot;Full\&quot; file is generated for each year - For YTD (Current year)- \&quot;Full\&quot; files are weekly files generated every weekend (Saturday). The date range should include weekend dates if requesting for \&quot;Full\&quot; files (optional)
   * @param startDate The earliest date of the feed file the API should fetch for based on the fileTimestamp.&lt;/p&gt;   - If schema parameter is not specified in the request, then data requested should be in batches of 10days or less**(Date range should be less than or equal to 10)** - If the schema parameter is specified in the request, date range can be greater than 10 days - If startDate and endDate parameters are not specified in the request, this endpoint returns past 10 days data by default. - startDate can be absolute- YYYY-MM-DD or relative:-  -1 for yesterday  QFL:- In case of QFL - Historical files available from 1995-01-01 to 2021-12-31. YTD files are current year files. (optional)
   * @param endDate The latest date of the feed file the API should fetch for based on the fileTimestamp  If startDate and endDate parameters are not specified in the request, this endpoint returns past 10 days data by default.  endDate can be in absolute- YYYY-MM-DD or relative date:- 0 for today (optional)
   * @param paginationLimit Specifies the number of results to return per page. Default is 20 &amp; Maximum is 500 results per page (optional, default to 20)
   * @param paginationOffset Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results (optional, default to 0)
   * @param sort Enables to get the data in ascending or descending order based on startTime. Results are in reverse chronological order if this parameter is not used (optional)
   * @return ApiResponse&lt;ListFiles200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ListFiles200Response> getV1ListFilesWithHttpInfo(String schema, String bundle, String type, String startDate, String endDate, Integer paginationLimit, Integer paginationOffset, String sort) throws ApiException {
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
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "endDate", endDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_paginationLimit", paginationLimit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_paginationOffset", paginationOffset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_sort", sort));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        ListFiles200Response
      
    > apiResponse = apiClient.invokeAPI("SdfAndQflContentLibraryApi.getV1ListFiles", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getV1ListFilesResponseTypeMap, false);

    return apiResponse;

  }
}
