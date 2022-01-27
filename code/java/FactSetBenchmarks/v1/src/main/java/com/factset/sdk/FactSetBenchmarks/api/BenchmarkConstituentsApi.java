package com.factset.sdk.FactSetBenchmarks.api;

import com.factset.sdk.FactSetBenchmarks.ApiException;
import com.factset.sdk.FactSetBenchmarks.ApiClient;
import com.factset.sdk.FactSetBenchmarks.ApiResponse;
import com.factset.sdk.FactSetBenchmarks.Configuration;
import com.factset.sdk.FactSetBenchmarks.Pair;

import javax.ws.rs.core.GenericType;

import com.factset.sdk.FactSetBenchmarks.models.BenchmarkConstituentsRequest;
import com.factset.sdk.FactSetBenchmarks.models.BenchmarkConstituentsResponse;
import com.factset.sdk.FactSetBenchmarks.models.ErrorResponse;
import com.factset.sdk.FactSetBenchmarks.models.FixedIncomeBenchmarkConstituentsRequest;
import com.factset.sdk.FactSetBenchmarks.models.FixedIncomeBenchmarkConstituentsResponse;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class BenchmarkConstituentsApi {
  private ApiClient apiClient;

  public BenchmarkConstituentsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public BenchmarkConstituentsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
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
   * Returns the requested Benchmark Constituents and respective Weights, Price and Market Value.
   * Returns the requested Benchmark Constituents and respective Weights, Price and Market Value. You must be authorized for the &#x60;ids&#x60; requested. Use the helper endpoint **_/id-list** for valid identifiers.   
   * @param ids Benchmark Identifiers. Reference the helper endpoint **_/id-list** to get a sample list of  valid identifiers. You must be authorized for the &#x60;ids&#x60; requested, otherwise you will receive an error. &lt;p&gt;***ids limit** &#x3D;  1 per request*&lt;/p&gt; (required)
   * @param date Date of holding expressed in YYYY-MM-DD format. (optional)
   * @param currency Currency for response. (optional)
   * @return BenchmarkConstituentsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Benchmark data items </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public BenchmarkConstituentsResponse getBenchmarkConstituents(java.util.List<String> ids, String date, String currency) throws ApiException {
    return getBenchmarkConstituentsWithHttpInfo(ids, date, currency).getData();
  }

  /**
   * Returns the requested Benchmark Constituents and respective Weights, Price and Market Value.
   * Returns the requested Benchmark Constituents and respective Weights, Price and Market Value. You must be authorized for the &#x60;ids&#x60; requested. Use the helper endpoint **_/id-list** for valid identifiers.   
   * @param ids Benchmark Identifiers. Reference the helper endpoint **_/id-list** to get a sample list of  valid identifiers. You must be authorized for the &#x60;ids&#x60; requested, otherwise you will receive an error. &lt;p&gt;***ids limit** &#x3D;  1 per request*&lt;/p&gt; (required)
   * @param date Date of holding expressed in YYYY-MM-DD format. (optional)
   * @param currency Currency for response. (optional)
   * @return ApiResponse&lt;BenchmarkConstituentsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Benchmark data items </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<BenchmarkConstituentsResponse> getBenchmarkConstituentsWithHttpInfo(java.util.List<String> ids, String date, String currency) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ids' is set
    if (ids == null) {
      throw new ApiException(400, "Missing the required parameter 'ids' when calling getBenchmarkConstituents");
    }
    
    // create path and map variables
    String localVarPath = "/factset-benchmarks/v1/constituents";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "ids", ids));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "date", date));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "currency", currency));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };

    GenericType<BenchmarkConstituentsResponse> localVarReturnType = new GenericType<BenchmarkConstituentsResponse>() {};

    return apiClient.invokeAPI("BenchmarkConstituentsApi.getBenchmarkConstituents", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Returns the requested Benchmark Constituents and respective Weights, Price and Market Value.
   * Returns the requested Benchmark Constituents and respective Weights, Price and Market Value. You must be authorized for the &#x60;ids&#x60; requested. Use the helper endpoint **_/id-list** for valid identifiers. 
   * @param benchmarkConstituentsRequest Requests Benchmark Constituents for the given identifier and date. (required)
   * @return BenchmarkConstituentsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Benchmark data items </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public BenchmarkConstituentsResponse getBenchmarkConstituentsForList(BenchmarkConstituentsRequest benchmarkConstituentsRequest) throws ApiException {
    return getBenchmarkConstituentsForListWithHttpInfo(benchmarkConstituentsRequest).getData();
  }

  /**
   * Returns the requested Benchmark Constituents and respective Weights, Price and Market Value.
   * Returns the requested Benchmark Constituents and respective Weights, Price and Market Value. You must be authorized for the &#x60;ids&#x60; requested. Use the helper endpoint **_/id-list** for valid identifiers. 
   * @param benchmarkConstituentsRequest Requests Benchmark Constituents for the given identifier and date. (required)
   * @return ApiResponse&lt;BenchmarkConstituentsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Benchmark data items </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<BenchmarkConstituentsResponse> getBenchmarkConstituentsForListWithHttpInfo(BenchmarkConstituentsRequest benchmarkConstituentsRequest) throws ApiException {
    Object localVarPostBody = benchmarkConstituentsRequest;
    
    // verify the required parameter 'benchmarkConstituentsRequest' is set
    if (benchmarkConstituentsRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'benchmarkConstituentsRequest' when calling getBenchmarkConstituentsForList");
    }
    
    // create path and map variables
    String localVarPath = "/factset-benchmarks/v1/constituents";

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

    GenericType<BenchmarkConstituentsResponse> localVarReturnType = new GenericType<BenchmarkConstituentsResponse>() {};

    return apiClient.invokeAPI("BenchmarkConstituentsApi.getBenchmarkConstituentsForList", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Returns the requested Fixed Income Benchmark Constituents and respective Weights, Price and Market Value.
   * Returns the requested Fixed Income Benchmark Constituents and respective Weights, Price and Market Value. You must be authorized for the &#x60;ids&#x60; requested. 
   * @param ids Fixed Income Benchmark Identifiers. You must be authorized for the &#x60;ids&#x60; requested, otherwise you will receive an error. &lt;p&gt;***ids limit** &#x3D;  1 per request*&lt;/p&gt; (required)
   * @param date Date of holding expressed in YYYY-MM-DD format. (optional)
   * @param currency Currency for response. (optional)
   * @return FixedIncomeBenchmarkConstituentsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Fixed Income Constituent data items </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public FixedIncomeBenchmarkConstituentsResponse getFIBenchmarkConstituents(java.util.List<String> ids, String date, String currency) throws ApiException {
    return getFIBenchmarkConstituentsWithHttpInfo(ids, date, currency).getData();
  }

  /**
   * Returns the requested Fixed Income Benchmark Constituents and respective Weights, Price and Market Value.
   * Returns the requested Fixed Income Benchmark Constituents and respective Weights, Price and Market Value. You must be authorized for the &#x60;ids&#x60; requested. 
   * @param ids Fixed Income Benchmark Identifiers. You must be authorized for the &#x60;ids&#x60; requested, otherwise you will receive an error. &lt;p&gt;***ids limit** &#x3D;  1 per request*&lt;/p&gt; (required)
   * @param date Date of holding expressed in YYYY-MM-DD format. (optional)
   * @param currency Currency for response. (optional)
   * @return ApiResponse&lt;FixedIncomeBenchmarkConstituentsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Fixed Income Constituent data items </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<FixedIncomeBenchmarkConstituentsResponse> getFIBenchmarkConstituentsWithHttpInfo(java.util.List<String> ids, String date, String currency) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ids' is set
    if (ids == null) {
      throw new ApiException(400, "Missing the required parameter 'ids' when calling getFIBenchmarkConstituents");
    }
    
    // create path and map variables
    String localVarPath = "/factset-benchmarks/v1/fixed-income-constituents";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "ids", ids));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "date", date));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "currency", currency));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };

    GenericType<FixedIncomeBenchmarkConstituentsResponse> localVarReturnType = new GenericType<FixedIncomeBenchmarkConstituentsResponse>() {};

    return apiClient.invokeAPI("BenchmarkConstituentsApi.getFIBenchmarkConstituents", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Returns the requested Benchmark Constituents and respective Weights, Price and Market Value.
   * Returns the requested Fixed Income Benchmark Constituents and respective Weights, Price and Market Value. You must be authorized for the &#x60;ids&#x60; requested. 
   * @param fixedIncomeBenchmarkConstituentsRequest Requests Fixed Income Benchmark Constituents for the given identifier and date. (required)
   * @return FixedIncomeBenchmarkConstituentsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Fixed Income Constituent data items </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public FixedIncomeBenchmarkConstituentsResponse getFIBenchmarkConstituentsForList(FixedIncomeBenchmarkConstituentsRequest fixedIncomeBenchmarkConstituentsRequest) throws ApiException {
    return getFIBenchmarkConstituentsForListWithHttpInfo(fixedIncomeBenchmarkConstituentsRequest).getData();
  }

  /**
   * Returns the requested Benchmark Constituents and respective Weights, Price and Market Value.
   * Returns the requested Fixed Income Benchmark Constituents and respective Weights, Price and Market Value. You must be authorized for the &#x60;ids&#x60; requested. 
   * @param fixedIncomeBenchmarkConstituentsRequest Requests Fixed Income Benchmark Constituents for the given identifier and date. (required)
   * @return ApiResponse&lt;FixedIncomeBenchmarkConstituentsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Fixed Income Constituent data items </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<FixedIncomeBenchmarkConstituentsResponse> getFIBenchmarkConstituentsForListWithHttpInfo(FixedIncomeBenchmarkConstituentsRequest fixedIncomeBenchmarkConstituentsRequest) throws ApiException {
    Object localVarPostBody = fixedIncomeBenchmarkConstituentsRequest;
    
    // verify the required parameter 'fixedIncomeBenchmarkConstituentsRequest' is set
    if (fixedIncomeBenchmarkConstituentsRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'fixedIncomeBenchmarkConstituentsRequest' when calling getFIBenchmarkConstituentsForList");
    }
    
    // create path and map variables
    String localVarPath = "/factset-benchmarks/v1/fixed-income-constituents";

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

    GenericType<FixedIncomeBenchmarkConstituentsResponse> localVarReturnType = new GenericType<FixedIncomeBenchmarkConstituentsResponse>() {};

    return apiClient.invokeAPI("BenchmarkConstituentsApi.getFIBenchmarkConstituentsForList", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
