package com.factset.sdk.FactSetBanks.api;

import com.factset.sdk.FactSetBanks.ApiException;
import com.factset.sdk.FactSetBanks.ApiClient;
import com.factset.sdk.FactSetBanks.ApiResponse;
import com.factset.sdk.FactSetBanks.Configuration;
import com.factset.sdk.FactSetBanks.Pair;

import jakarta.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.FactSetBanks.models.ErrorResponse;
import com.factset.sdk.FactSetBanks.models.MetricsResponse;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class MetricsApi {
  private ApiClient apiClient;

  public MetricsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public MetricsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> getMetricsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getMetricsResponseTypeMap.put(200, new GenericType<MetricsResponse>(){});
    getMetricsResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getMetricsResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getMetricsResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getMetricsResponseTypeMap.put(404, new GenericType<ErrorResponse>(){});
    getMetricsResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getMetricsResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
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
   * Returns available metrics and their definitions
   * Returns list of available metrics that can be used in the metrics parameter of related endpoints.  Use this endpoint to discover available financial metrics, their definitions, and metadata. Filter by category and subcategory to narrow results.  **For methodology definitions**, reference the &#x60;oaPageId&#x60; or &#x60;oaUrl&#x60; response items to launch the available methodology page. 
   * @param searchText Free-text search to filter metrics whose metric code or description contains the supplied text. Case-insensitive partial matching.  (optional)
   * @param category Filter metrics by major category: - **FINANCIALS** - Financial statement data, demographics, and core institution identifiers (US, Canada, Australia, Credit Union, Industry, Specialty Finance). Endpoint: &#x60;/financials&#x60;, &#x60;/aum&#x60;, &#x60;/focus&#x60; - **FILINGS** - Regulatory filing data (10-D). Endpoint: &#x60;/ten-d&#x60; - **PERFORMANCE** - Uniform Bank Performance Report (UBPR) metrics. Endpoint: &#x60;/ubpr&#x60; - **EXPOSURE** - Country exposure data (Form 009a). Endpoint: &#x60;/country-exposure&#x60;  (optional)
   * @param subcategory Sub-category filter for the primary category: - **US** - United States regulatory financials. Endpoint: &#x60;/financials&#x60; - **CANADA** - Canadian OSFI regulatory financials. Endpoint: &#x60;/financials&#x60; - **AUSTRALIA** - Australian regulatory financials. Endpoint: &#x60;/financials&#x60; - **CREDIT_UNION** - Credit union financial data. Endpoint: &#x60;/financials&#x60; - **INDUSTRY** - Industry-level financial aggregates. Endpoint: &#x60;/financials&#x60; - **SPECIALTY_FINANCE** - Specialty finance industry data including FOCUS reports, Form ADV, and Business Development Corporations. Endpoint: &#x60;/aum&#x60;, &#x60;/focus&#x60; - **TEN_D** - Form 10-D securitization filings. Endpoint: &#x60;/ten-d&#x60; - **UBPR** - Uniform Bank Performance Report metrics. Endpoint: &#x60;/ubpr&#x60; - **COUNTRY** - Country exposure metrics. Endpoint: &#x60;/country-exposure&#x60;  (optional)
   * @param dataType Filter by metric data type (optional)
   * @return MetricsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Available metrics data </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;detail\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The requested endpoint could not be found. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public MetricsResponse getMetrics(String searchText, String category, String subcategory, String dataType) throws ApiException {
    return getMetricsWithHttpInfo(searchText, category, subcategory, dataType).getData();
  }

  /**
   * Returns available metrics and their definitions
   * Returns list of available metrics that can be used in the metrics parameter of related endpoints.  Use this endpoint to discover available financial metrics, their definitions, and metadata. Filter by category and subcategory to narrow results.  **For methodology definitions**, reference the &#x60;oaPageId&#x60; or &#x60;oaUrl&#x60; response items to launch the available methodology page. 
   * @param searchText Free-text search to filter metrics whose metric code or description contains the supplied text. Case-insensitive partial matching.  (optional)
   * @param category Filter metrics by major category: - **FINANCIALS** - Financial statement data, demographics, and core institution identifiers (US, Canada, Australia, Credit Union, Industry, Specialty Finance). Endpoint: &#x60;/financials&#x60;, &#x60;/aum&#x60;, &#x60;/focus&#x60; - **FILINGS** - Regulatory filing data (10-D). Endpoint: &#x60;/ten-d&#x60; - **PERFORMANCE** - Uniform Bank Performance Report (UBPR) metrics. Endpoint: &#x60;/ubpr&#x60; - **EXPOSURE** - Country exposure data (Form 009a). Endpoint: &#x60;/country-exposure&#x60;  (optional)
   * @param subcategory Sub-category filter for the primary category: - **US** - United States regulatory financials. Endpoint: &#x60;/financials&#x60; - **CANADA** - Canadian OSFI regulatory financials. Endpoint: &#x60;/financials&#x60; - **AUSTRALIA** - Australian regulatory financials. Endpoint: &#x60;/financials&#x60; - **CREDIT_UNION** - Credit union financial data. Endpoint: &#x60;/financials&#x60; - **INDUSTRY** - Industry-level financial aggregates. Endpoint: &#x60;/financials&#x60; - **SPECIALTY_FINANCE** - Specialty finance industry data including FOCUS reports, Form ADV, and Business Development Corporations. Endpoint: &#x60;/aum&#x60;, &#x60;/focus&#x60; - **TEN_D** - Form 10-D securitization filings. Endpoint: &#x60;/ten-d&#x60; - **UBPR** - Uniform Bank Performance Report metrics. Endpoint: &#x60;/ubpr&#x60; - **COUNTRY** - Country exposure metrics. Endpoint: &#x60;/country-exposure&#x60;  (optional)
   * @param dataType Filter by metric data type (optional)
   * @return ApiResponse&lt;MetricsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Available metrics data </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;detail\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The requested endpoint could not be found. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<MetricsResponse> getMetricsWithHttpInfo(String searchText, String category, String subcategory, String dataType) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/metrics";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "searchText", searchText));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "category", category));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "subcategory", subcategory));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "dataType", dataType));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        MetricsResponse
      
    > apiResponse = apiClient.invokeAPI("MetricsApi.getMetrics", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getMetricsResponseTypeMap, false);

    return apiResponse;

  }
}
