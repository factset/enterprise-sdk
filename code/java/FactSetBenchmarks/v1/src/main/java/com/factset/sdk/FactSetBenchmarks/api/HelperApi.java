package com.factset.sdk.FactSetBenchmarks.api;

import com.factset.sdk.FactSetBenchmarks.ApiException;
import com.factset.sdk.FactSetBenchmarks.ApiClient;
import com.factset.sdk.FactSetBenchmarks.ApiResponse;
import com.factset.sdk.FactSetBenchmarks.Configuration;
import com.factset.sdk.FactSetBenchmarks.Pair;

import javax.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.FactSetBenchmarks.models.BenchmarkIdListRequest;
import com.factset.sdk.FactSetBenchmarks.models.BenchmarkIdListResponse;
import com.factset.sdk.FactSetBenchmarks.models.ErrorResponse;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class HelperApi {
  private ApiClient apiClient;

  public HelperApi() {
    this(Configuration.getDefaultApiClient());
  }

  public HelperApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> getBenchmarkIdsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getBenchmarkIdsResponseTypeMap.put(200, new GenericType<BenchmarkIdListResponse>(){});
    getBenchmarkIdsResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getBenchmarkIdsResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getBenchmarkIdsResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getBenchmarkIdsResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getBenchmarkIdsResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> getBenchmarkIdsForListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getBenchmarkIdsForListResponseTypeMap.put(200, new GenericType<BenchmarkIdListResponse>(){});
    getBenchmarkIdsForListResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getBenchmarkIdsForListResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getBenchmarkIdsForListResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getBenchmarkIdsForListResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getBenchmarkIdsForListResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
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
   * Returns a sample list of Benchmark Identifiers and the benchmark categorization to use in other Benchmark API endpoints.
   * Returns a **sample** list of Benchmark Identifiers to use in other Benchmark API endpoints. This is a supporting API to be use alongside the other Benchmark API endpoints. For example, use the fsymID value returned in this response as the input to your &#x60;ids&#x60; parameter in the /constituents endpoint to return constituents for that id.&lt;p&gt; *This is not the full list of benchmark ids allowed in this service, but rather a representation of the most commonly requested. For complete assistance with ID lookup or concordance services, please reach out to FactSet Support. *&lt;/p&gt;
   * @param familyFilter Highest Level Filter to search by common Benchmark Families, such as S&amp;P, MSCI, or Russell. This will retrieve all related benchmark ids. For further filtering, use the response items such as the categoryDescription field. Leave blank if you wish to see a full sample list of ids. requested- * **CHINA &amp; HK INDICES** - Major Hong Kong and China Indices, such as Hang Seng Index (HSI-HKX) * **DOW JONES** - Dow Jones Global, Regions, Countries, Titans. * **FACTSET MARKET INDICES** - Regional and Country Indices defined by FactSet * **FTSE** - FTSE Global, UK, Global All Cap, World, Xinhua, European, GWA, JSE, Multinationals, and Style indices * **GLOBAL INDICES** - A mix of major indices across the globe. * **MSCI** - MSCI All Country, Asia Pacific, Thematic &amp; Strategy, Emerging, Developed, US. * **RUSSELL** - US, Global, and Nomura. * **S&amp;P** - US, ASX, Select Industry, BMI, Global, Thematic, Emerging, TSX. * **STOXX** - Total Market, Europe, and Nordic * **TOPIX** - Topix Indices, such as TOPIX 500 (182301)  (optional)
   * @return BenchmarkIdListResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> List of sample Benchmark Ids </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public BenchmarkIdListResponse getBenchmarkIds(String familyFilter) throws ApiException {
    return getBenchmarkIdsWithHttpInfo(familyFilter).getData();
  }

  /**
   * Returns a sample list of Benchmark Identifiers and the benchmark categorization to use in other Benchmark API endpoints.
   * Returns a **sample** list of Benchmark Identifiers to use in other Benchmark API endpoints. This is a supporting API to be use alongside the other Benchmark API endpoints. For example, use the fsymID value returned in this response as the input to your &#x60;ids&#x60; parameter in the /constituents endpoint to return constituents for that id.&lt;p&gt; *This is not the full list of benchmark ids allowed in this service, but rather a representation of the most commonly requested. For complete assistance with ID lookup or concordance services, please reach out to FactSet Support. *&lt;/p&gt;
   * @param familyFilter Highest Level Filter to search by common Benchmark Families, such as S&amp;P, MSCI, or Russell. This will retrieve all related benchmark ids. For further filtering, use the response items such as the categoryDescription field. Leave blank if you wish to see a full sample list of ids. requested- * **CHINA &amp; HK INDICES** - Major Hong Kong and China Indices, such as Hang Seng Index (HSI-HKX) * **DOW JONES** - Dow Jones Global, Regions, Countries, Titans. * **FACTSET MARKET INDICES** - Regional and Country Indices defined by FactSet * **FTSE** - FTSE Global, UK, Global All Cap, World, Xinhua, European, GWA, JSE, Multinationals, and Style indices * **GLOBAL INDICES** - A mix of major indices across the globe. * **MSCI** - MSCI All Country, Asia Pacific, Thematic &amp; Strategy, Emerging, Developed, US. * **RUSSELL** - US, Global, and Nomura. * **S&amp;P** - US, ASX, Select Industry, BMI, Global, Thematic, Emerging, TSX. * **STOXX** - Total Market, Europe, and Nordic * **TOPIX** - Topix Indices, such as TOPIX 500 (182301)  (optional)
   * @return ApiResponse&lt;BenchmarkIdListResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> List of sample Benchmark Ids </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<BenchmarkIdListResponse> getBenchmarkIdsWithHttpInfo(String familyFilter) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/factset-benchmarks/v1/id-list";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "familyFilter", familyFilter));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        BenchmarkIdListResponse
      
    > apiResponse = apiClient.invokeAPI("HelperApi.getBenchmarkIds", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getBenchmarkIdsResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Returns a sample list of Benchmark Identifiers and the benchmark categorization to use in other Benchmark API endpoints.
   * Returns a **sample** list of Benchmark Identifiers to use in other Benchmark API endpoints. This is a supporting API to be use alongside the other Benchmark API endpoints. For example, use the fsymID value returned in this response as the input to your &#x60;ids&#x60; parameter in the /constituents endpoint to return constituents for that id.&lt;p&gt; *This is not the full list of benchmark ids allowed in this service, but rather a representation of the most commonly requested. For complete assistance with ID lookup or concordance services, please reach out to FactSet Support.*&lt;/p&gt;
   * @param benchmarkIdListRequest Requests a sample list of identifiers that can be used in other Benchmarks API endpoints. (required)
   * @return BenchmarkIdListResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> List of sample Benchmark Ids </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public BenchmarkIdListResponse getBenchmarkIdsForList(BenchmarkIdListRequest benchmarkIdListRequest) throws ApiException {
    return getBenchmarkIdsForListWithHttpInfo(benchmarkIdListRequest).getData();
  }

  /**
   * Returns a sample list of Benchmark Identifiers and the benchmark categorization to use in other Benchmark API endpoints.
   * Returns a **sample** list of Benchmark Identifiers to use in other Benchmark API endpoints. This is a supporting API to be use alongside the other Benchmark API endpoints. For example, use the fsymID value returned in this response as the input to your &#x60;ids&#x60; parameter in the /constituents endpoint to return constituents for that id.&lt;p&gt; *This is not the full list of benchmark ids allowed in this service, but rather a representation of the most commonly requested. For complete assistance with ID lookup or concordance services, please reach out to FactSet Support.*&lt;/p&gt;
   * @param benchmarkIdListRequest Requests a sample list of identifiers that can be used in other Benchmarks API endpoints. (required)
   * @return ApiResponse&lt;BenchmarkIdListResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> List of sample Benchmark Ids </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<BenchmarkIdListResponse> getBenchmarkIdsForListWithHttpInfo(BenchmarkIdListRequest benchmarkIdListRequest) throws ApiException {
    Object localVarPostBody = benchmarkIdListRequest;
    
    // verify the required parameter 'benchmarkIdListRequest' is set
    if (benchmarkIdListRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'benchmarkIdListRequest' when calling getBenchmarkIdsForList");
    }
    
    // create path and map variables
    String localVarPath = "/factset-benchmarks/v1/id-list";

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
        
        BenchmarkIdListResponse
      
    > apiResponse = apiClient.invokeAPI("HelperApi.getBenchmarkIdsForList", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getBenchmarkIdsForListResponseTypeMap, false);

    return apiResponse;

  }
}
