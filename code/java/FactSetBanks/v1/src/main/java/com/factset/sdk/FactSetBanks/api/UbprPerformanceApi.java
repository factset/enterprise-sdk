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
import com.factset.sdk.FactSetBanks.models.PerformanceRequest;
import com.factset.sdk.FactSetBanks.models.PerformanceResponse;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class UbprPerformanceApi {
  private ApiClient apiClient;

  public UbprPerformanceApi() {
    this(Configuration.getDefaultApiClient());
  }

  public UbprPerformanceApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> getPerformanceResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getPerformanceResponseTypeMap.put(200, new GenericType<PerformanceResponse>(){});
    getPerformanceResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getPerformanceResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getPerformanceResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getPerformanceResponseTypeMap.put(404, new GenericType<ErrorResponse>(){});
    getPerformanceResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getPerformanceResponseTypeMap.put(422, new GenericType<ErrorResponse>(){});
    getPerformanceResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
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
   * Returns UBPR performance metrics
   * Returns Uniform Bank Performance Report (UBPR) metrics — financial ratios, peer group rankings, and performance analytics — sourced from FFIEC reports of condition and income (call reports). Supports analysis of earnings, liquidity, capital, asset/liability management, and growth across three data views: the bank&#39;s own data, peer group data (banks similar in size and economic environment), and percentile rankings.  Covers 10,000+ insured commercial banks and FDIC-supervised savings banks across 249 peer groups. Quarterly history since 2002; 1,600+ data items.  Find available metrics via [&#x60;/metrics&#x60;](#operation/getMetrics) with:  * **category**: &#x60;PERFORMANCE&#x60; * **subcategory**: &#x60;UBPR&#x60; 
   * @param performanceRequest  (required)
   * @return PerformanceResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Performance metrics data </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;detail\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The requested endpoint could not be found. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity. Your request data was syntactically correct but semantically invalid. Check the required parameters and their value constraints.  </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public PerformanceResponse getPerformance(PerformanceRequest performanceRequest) throws ApiException {
    return getPerformanceWithHttpInfo(performanceRequest).getData();
  }

  /**
   * Returns UBPR performance metrics
   * Returns Uniform Bank Performance Report (UBPR) metrics — financial ratios, peer group rankings, and performance analytics — sourced from FFIEC reports of condition and income (call reports). Supports analysis of earnings, liquidity, capital, asset/liability management, and growth across three data views: the bank&#39;s own data, peer group data (banks similar in size and economic environment), and percentile rankings.  Covers 10,000+ insured commercial banks and FDIC-supervised savings banks across 249 peer groups. Quarterly history since 2002; 1,600+ data items.  Find available metrics via [&#x60;/metrics&#x60;](#operation/getMetrics) with:  * **category**: &#x60;PERFORMANCE&#x60; * **subcategory**: &#x60;UBPR&#x60; 
   * @param performanceRequest  (required)
   * @return ApiResponse&lt;PerformanceResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Performance metrics data </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;detail\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The requested endpoint could not be found. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity. Your request data was syntactically correct but semantically invalid. Check the required parameters and their value constraints.  </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<PerformanceResponse> getPerformanceWithHttpInfo(PerformanceRequest performanceRequest) throws ApiException {
    Object localVarPostBody = performanceRequest;
    
    // verify the required parameter 'performanceRequest' is set
    if (performanceRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'performanceRequest' when calling getPerformance");
    }
    
    // create path and map variables
    String localVarPath = "/ubpr";

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
        
        PerformanceResponse
      
    > apiResponse = apiClient.invokeAPI("UbprPerformanceApi.getPerformance", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getPerformanceResponseTypeMap, false);

    return apiResponse;

  }
}
