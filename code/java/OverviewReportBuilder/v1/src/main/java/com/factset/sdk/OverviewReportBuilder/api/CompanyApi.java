package com.factset.sdk.OverviewReportBuilder.api;

import com.factset.sdk.OverviewReportBuilder.ApiException;
import com.factset.sdk.OverviewReportBuilder.ApiClient;
import com.factset.sdk.OverviewReportBuilder.ApiResponse;
import com.factset.sdk.OverviewReportBuilder.Configuration;
import com.factset.sdk.OverviewReportBuilder.Pair;

import javax.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import java.math.BigDecimal;
import com.factset.sdk.OverviewReportBuilder.models.ErrorResponse;
import com.factset.sdk.OverviewReportBuilder.models.PeerListResponse;
import com.factset.sdk.OverviewReportBuilder.models.ProfileResponse;
import com.factset.sdk.OverviewReportBuilder.models.StachTableResponse;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CompanyApi {
  private ApiClient apiClient;

  public CompanyApi() {
    this(Configuration.getDefaultApiClient());
  }

  public CompanyApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

    private static final Map<Integer, GenericType> currentCapGetResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    currentCapGetResponseTypeMap.put(200, new GenericType<StachTableResponse>(){});
    currentCapGetResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    currentCapGetResponseTypeMap.put(404, new GenericType<ErrorResponse>(){});
  }
  private static final Map<Integer, GenericType> financialHighlightsGetResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    financialHighlightsGetResponseTypeMap.put(200, new GenericType<StachTableResponse>(){});
    financialHighlightsGetResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    financialHighlightsGetResponseTypeMap.put(404, new GenericType<ErrorResponse>(){});
  }
  private static final Map<Integer, GenericType> getProfileProfileResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getProfileProfileResponseTypeMap.put(200, new GenericType<ProfileResponse>(){});
    getProfileProfileResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getProfileProfileResponseTypeMap.put(404, new GenericType<ErrorResponse>(){});
  }
  private static final Map<Integer, GenericType> peerListGetResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    peerListGetResponseTypeMap.put(200, new GenericType<PeerListResponse>(){});
    peerListGetResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    peerListGetResponseTypeMap.put(404, new GenericType<ErrorResponse>(){});
  }
  private static final Map<Integer, GenericType> transactionsGetResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    transactionsGetResponseTypeMap.put(200, new GenericType<StachTableResponse>(){});
    transactionsGetResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    transactionsGetResponseTypeMap.put(404, new GenericType<ErrorResponse>(){});
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
   * Current Capitalization
   * 
   * @param id Company ticker (required)
   * @return StachTableResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Expected response; returns JSON data containing STACH 2.0 row organized package format </td><td>  * X-DataDirect-Request-Key -  <br>  * Api-Supported-Versions -  <br>  * Api-Version -  <br>  </td></tr>
       <tr><td> 400 </td><td> Bad Request. For further assistance, file an issue under \&quot;Workflow &amp; Throttling - 400 or 429 Response\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key -  <br>  * Api-Supported-Versions -  <br>  * Api-Version -  <br>  </td></tr>
       <tr><td> 401 </td><td> Missing or invalid authentication. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For further assistance, file an issue under \&quot;Connectivty - 401 or 403 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key -  <br>  </td></tr>
       <tr><td> 404 </td><td> Not found. For further assistance, file an issue under \&quot;Performance - 404 and 500 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key -  <br>  </td></tr>
       <tr><td> 429 </td><td> Too many requests - this API is rate-limited to 20 requests per second. For further assistance, file an issue under \&quot;Workflow &amp; Throttling - 400 or 429 Response\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key -  <br>  </td></tr>
       <tr><td> 500 </td><td> Server error. For further assistance, file an issue under \&quot;Performance - 404 and 500 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key -  <br>  </td></tr>
       <tr><td> 503 </td><td> Service unavailable. Typically a timeout, or result of a rejected request to prevent service overload. For further assistance, file an issue under \&quot;Performance - 404 and 500 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key -  <br>  </td></tr>
     </table>
   */
  public StachTableResponse currentCapGet(String id) throws ApiException {
    return currentCapGetWithHttpInfo(id).getData();
  }

  /**
   * Current Capitalization
   * 
   * @param id Company ticker (required)
   * @return ApiResponse&lt;StachTableResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Expected response; returns JSON data containing STACH 2.0 row organized package format </td><td>  * X-DataDirect-Request-Key -  <br>  * Api-Supported-Versions -  <br>  * Api-Version -  <br>  </td></tr>
       <tr><td> 400 </td><td> Bad Request. For further assistance, file an issue under \&quot;Workflow &amp; Throttling - 400 or 429 Response\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key -  <br>  * Api-Supported-Versions -  <br>  * Api-Version -  <br>  </td></tr>
       <tr><td> 401 </td><td> Missing or invalid authentication. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For further assistance, file an issue under \&quot;Connectivty - 401 or 403 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key -  <br>  </td></tr>
       <tr><td> 404 </td><td> Not found. For further assistance, file an issue under \&quot;Performance - 404 and 500 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key -  <br>  </td></tr>
       <tr><td> 429 </td><td> Too many requests - this API is rate-limited to 20 requests per second. For further assistance, file an issue under \&quot;Workflow &amp; Throttling - 400 or 429 Response\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key -  <br>  </td></tr>
       <tr><td> 500 </td><td> Server error. For further assistance, file an issue under \&quot;Performance - 404 and 500 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key -  <br>  </td></tr>
       <tr><td> 503 </td><td> Service unavailable. Typically a timeout, or result of a rejected request to prevent service overload. For further assistance, file an issue under \&quot;Performance - 404 and 500 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<StachTableResponse> currentCapGetWithHttpInfo(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling currentCapGet");
    }
    
    // create path and map variables
    String localVarPath = "/current-cap";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "id", id));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        StachTableResponse
      
    > apiResponse = apiClient.invokeAPI("CompanyApi.currentCapGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, currentCapGetResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Financial / Estimate Highlights
   * 
   * @param id Company ticker (required)
   * @return StachTableResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Expected response; Returns JSON data containing STACH 2.0 row organized package format </td><td>  * X-DataDirect-Request-Key -  <br>  * Api-Supported-Versions -  <br>  * Api-Version -  <br>  </td></tr>
       <tr><td> 400 </td><td> Bad Request. For further assistance, file an issue under \&quot;Workflow &amp; Throttling - 400 or 429 Response\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key -  <br>  * Api-Supported-Versions -  <br>  * Api-Version -  <br>  </td></tr>
       <tr><td> 401 </td><td> Missing or invalid authentication. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For further assistance, file an issue under \&quot;Connectivty - 401 or 403 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key -  <br>  </td></tr>
       <tr><td> 404 </td><td> Not found. For further assistance, file an issue under \&quot;Performance - 404 and 500 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key -  <br>  </td></tr>
       <tr><td> 429 </td><td> Too many requests - this API is rate-limited to 20 requests per second. For further assistance, file an issue under \&quot;Workflow &amp; Throttling - 400 or 429 Response\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key -  <br>  </td></tr>
       <tr><td> 500 </td><td> Server error. For further assistance, file an issue under \&quot;Performance - 404 and 500 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key -  <br>  </td></tr>
       <tr><td> 503 </td><td> Service unavailable. Typically a timeout, or result of a rejected request to prevent service overload. For further assistance, file an issue under \&quot;Performance - 404 and 500 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key -  <br>  </td></tr>
     </table>
   */
  public StachTableResponse financialHighlightsGet(String id) throws ApiException {
    return financialHighlightsGetWithHttpInfo(id).getData();
  }

  /**
   * Financial / Estimate Highlights
   * 
   * @param id Company ticker (required)
   * @return ApiResponse&lt;StachTableResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Expected response; Returns JSON data containing STACH 2.0 row organized package format </td><td>  * X-DataDirect-Request-Key -  <br>  * Api-Supported-Versions -  <br>  * Api-Version -  <br>  </td></tr>
       <tr><td> 400 </td><td> Bad Request. For further assistance, file an issue under \&quot;Workflow &amp; Throttling - 400 or 429 Response\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key -  <br>  * Api-Supported-Versions -  <br>  * Api-Version -  <br>  </td></tr>
       <tr><td> 401 </td><td> Missing or invalid authentication. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For further assistance, file an issue under \&quot;Connectivty - 401 or 403 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key -  <br>  </td></tr>
       <tr><td> 404 </td><td> Not found. For further assistance, file an issue under \&quot;Performance - 404 and 500 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key -  <br>  </td></tr>
       <tr><td> 429 </td><td> Too many requests - this API is rate-limited to 20 requests per second. For further assistance, file an issue under \&quot;Workflow &amp; Throttling - 400 or 429 Response\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key -  <br>  </td></tr>
       <tr><td> 500 </td><td> Server error. For further assistance, file an issue under \&quot;Performance - 404 and 500 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key -  <br>  </td></tr>
       <tr><td> 503 </td><td> Service unavailable. Typically a timeout, or result of a rejected request to prevent service overload. For further assistance, file an issue under \&quot;Performance - 404 and 500 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<StachTableResponse> financialHighlightsGetWithHttpInfo(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling financialHighlightsGet");
    }
    
    // create path and map variables
    String localVarPath = "/financial-highlights";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "id", id));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        StachTableResponse
      
    > apiResponse = apiClient.invokeAPI("CompanyApi.financialHighlightsGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, financialHighlightsGetResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Overview Profile
   * 
   * @param id Company ticker (required)
   * @return ProfileResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Expected response; returns the JSON in a simple key-value format </td><td>  * X-DataDirect-Request-Key -  <br>  * Api-Supported-Versions -  <br>  * Api-Version -  <br>  </td></tr>
       <tr><td> 400 </td><td> Bad Request. For further assistance, file an issue under \&quot;Workflow &amp; Throttling - 400 or 429 Response\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key -  <br>  * Api-Supported-Versions -  <br>  * Api-Version -  <br>  </td></tr>
       <tr><td> 401 </td><td> Missing or invalid authentication. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For further assistance, file an issue under \&quot;Connectivty - 401 or 403 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key -  <br>  </td></tr>
       <tr><td> 404 </td><td> Not found. For further assistance, file an issue under \&quot;Performance - 404 and 500 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key -  <br>  </td></tr>
       <tr><td> 429 </td><td> Too many requests - this API is rate-limited to 20 requests per second. For further assistance, file an issue under \&quot;Workflow &amp; Throttling - 400 or 429 Response\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key -  <br>  </td></tr>
       <tr><td> 500 </td><td> Server error. For further assistance, file an issue under \&quot;Performance - 404 and 500 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key -  <br>  </td></tr>
       <tr><td> 503 </td><td> Service unavailable. Typically a timeout, or result of a rejected request to prevent service overload. For further assistance, file an issue under \&quot;Performance - 404 and 500 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key -  <br>  </td></tr>
     </table>
   */
  public ProfileResponse getProfileProfile(String id) throws ApiException {
    return getProfileProfileWithHttpInfo(id).getData();
  }

  /**
   * Overview Profile
   * 
   * @param id Company ticker (required)
   * @return ApiResponse&lt;ProfileResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Expected response; returns the JSON in a simple key-value format </td><td>  * X-DataDirect-Request-Key -  <br>  * Api-Supported-Versions -  <br>  * Api-Version -  <br>  </td></tr>
       <tr><td> 400 </td><td> Bad Request. For further assistance, file an issue under \&quot;Workflow &amp; Throttling - 400 or 429 Response\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key -  <br>  * Api-Supported-Versions -  <br>  * Api-Version -  <br>  </td></tr>
       <tr><td> 401 </td><td> Missing or invalid authentication. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For further assistance, file an issue under \&quot;Connectivty - 401 or 403 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key -  <br>  </td></tr>
       <tr><td> 404 </td><td> Not found. For further assistance, file an issue under \&quot;Performance - 404 and 500 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key -  <br>  </td></tr>
       <tr><td> 429 </td><td> Too many requests - this API is rate-limited to 20 requests per second. For further assistance, file an issue under \&quot;Workflow &amp; Throttling - 400 or 429 Response\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key -  <br>  </td></tr>
       <tr><td> 500 </td><td> Server error. For further assistance, file an issue under \&quot;Performance - 404 and 500 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key -  <br>  </td></tr>
       <tr><td> 503 </td><td> Service unavailable. Typically a timeout, or result of a rejected request to prevent service overload. For further assistance, file an issue under \&quot;Performance - 404 and 500 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<ProfileResponse> getProfileProfileWithHttpInfo(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getProfileProfile");
    }
    
    // create path and map variables
    String localVarPath = "/profile";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "id", id));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        ProfileResponse
      
    > apiResponse = apiClient.invokeAPI("CompanyApi.getProfileProfile", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getProfileProfileResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Peer List
   * 
   * @param id Company ticker (required)
   * @param topn Limits the number of peers returned. (optional)
   * @return PeerListResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Expected response; returns JSON data containing key-value format </td><td>  * X-DataDirect-Request-Key -  <br>  * Api-Supported-Versions -  <br>  * Api-Version -  <br>  </td></tr>
       <tr><td> 400 </td><td> Bad Request. For further assistance, file an issue under \&quot;Workflow &amp; Throttling - 400 or 429 Response\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key -  <br>  * Api-Supported-Versions -  <br>  * Api-Version -  <br>  </td></tr>
       <tr><td> 401 </td><td> Missing or invalid authentication. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For further assistance, file an issue under \&quot;Connectivty - 401 or 403 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key -  <br>  </td></tr>
       <tr><td> 404 </td><td> Not found. For further assistance, file an issue under \&quot;Performance - 404 and 500 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key -  <br>  </td></tr>
       <tr><td> 429 </td><td> Too many requests - this API is rate-limited to 20 requests per second. For further assistance, file an issue under \&quot;Workflow &amp; Throttling - 400 or 429 Response\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key -  <br>  </td></tr>
       <tr><td> 500 </td><td> Server error. For further assistance, file an issue under \&quot;Performance - 404 and 500 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key -  <br>  </td></tr>
       <tr><td> 503 </td><td> Service unavailable. Typically a timeout, or result of a rejected request to prevent service overload. For further assistance, file an issue under \&quot;Performance - 404 and 500 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key -  <br>  </td></tr>
     </table>
   */
  public PeerListResponse peerListGet(String id, BigDecimal topn) throws ApiException {
    return peerListGetWithHttpInfo(id, topn).getData();
  }

  /**
   * Peer List
   * 
   * @param id Company ticker (required)
   * @param topn Limits the number of peers returned. (optional)
   * @return ApiResponse&lt;PeerListResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Expected response; returns JSON data containing key-value format </td><td>  * X-DataDirect-Request-Key -  <br>  * Api-Supported-Versions -  <br>  * Api-Version -  <br>  </td></tr>
       <tr><td> 400 </td><td> Bad Request. For further assistance, file an issue under \&quot;Workflow &amp; Throttling - 400 or 429 Response\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key -  <br>  * Api-Supported-Versions -  <br>  * Api-Version -  <br>  </td></tr>
       <tr><td> 401 </td><td> Missing or invalid authentication. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For further assistance, file an issue under \&quot;Connectivty - 401 or 403 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key -  <br>  </td></tr>
       <tr><td> 404 </td><td> Not found. For further assistance, file an issue under \&quot;Performance - 404 and 500 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key -  <br>  </td></tr>
       <tr><td> 429 </td><td> Too many requests - this API is rate-limited to 20 requests per second. For further assistance, file an issue under \&quot;Workflow &amp; Throttling - 400 or 429 Response\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key -  <br>  </td></tr>
       <tr><td> 500 </td><td> Server error. For further assistance, file an issue under \&quot;Performance - 404 and 500 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key -  <br>  </td></tr>
       <tr><td> 503 </td><td> Service unavailable. Typically a timeout, or result of a rejected request to prevent service overload. For further assistance, file an issue under \&quot;Performance - 404 and 500 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<PeerListResponse> peerListGetWithHttpInfo(String id, BigDecimal topn) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling peerListGet");
    }
    
    // create path and map variables
    String localVarPath = "/peer-list";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "id", id));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "topn", topn));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        PeerListResponse
      
    > apiResponse = apiClient.invokeAPI("CompanyApi.peerListGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, peerListGetResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Transactions
   * 
   * @param id Company ticker (required)
   * @return StachTableResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Expected response; Returns JSON data containing STACH 2.0 row organized package format </td><td>  * X-DataDirect-Request-Key -  <br>  * Api-Supported-Versions -  <br>  * Api-Version -  <br>  </td></tr>
       <tr><td> 400 </td><td> Bad Request. For further assistance, file an issue under \&quot;Workflow &amp; Throttling - 400 or 429 Response\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key -  <br>  * Api-Supported-Versions -  <br>  * Api-Version -  <br>  </td></tr>
       <tr><td> 401 </td><td> Missing or invalid authentication. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For further assistance, file an issue under \&quot;Connectivty - 401 or 403 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key -  <br>  </td></tr>
       <tr><td> 404 </td><td> Not found. For further assistance, file an issue under \&quot;Performance - 404 and 500 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key -  <br>  </td></tr>
       <tr><td> 429 </td><td> Too many requests - this API is rate-limited to 20 requests per second. For further assistance, file an issue under \&quot;Workflow &amp; Throttling - 400 or 429 Response\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key -  <br>  </td></tr>
       <tr><td> 500 </td><td> Server error. For further assistance, file an issue under \&quot;Performance - 404 and 500 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key -  <br>  </td></tr>
       <tr><td> 503 </td><td> Service unavailable. Typically a timeout, or result of a rejected request to prevent service overload. For further assistance, file an issue under \&quot;Performance - 404 and 500 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key -  <br>  </td></tr>
     </table>
   */
  public StachTableResponse transactionsGet(String id) throws ApiException {
    return transactionsGetWithHttpInfo(id).getData();
  }

  /**
   * Transactions
   * 
   * @param id Company ticker (required)
   * @return ApiResponse&lt;StachTableResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Expected response; Returns JSON data containing STACH 2.0 row organized package format </td><td>  * X-DataDirect-Request-Key -  <br>  * Api-Supported-Versions -  <br>  * Api-Version -  <br>  </td></tr>
       <tr><td> 400 </td><td> Bad Request. For further assistance, file an issue under \&quot;Workflow &amp; Throttling - 400 or 429 Response\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key -  <br>  * Api-Supported-Versions -  <br>  * Api-Version -  <br>  </td></tr>
       <tr><td> 401 </td><td> Missing or invalid authentication. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For further assistance, file an issue under \&quot;Connectivty - 401 or 403 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key -  <br>  </td></tr>
       <tr><td> 404 </td><td> Not found. For further assistance, file an issue under \&quot;Performance - 404 and 500 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key -  <br>  </td></tr>
       <tr><td> 429 </td><td> Too many requests - this API is rate-limited to 20 requests per second. For further assistance, file an issue under \&quot;Workflow &amp; Throttling - 400 or 429 Response\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key -  <br>  </td></tr>
       <tr><td> 500 </td><td> Server error. For further assistance, file an issue under \&quot;Performance - 404 and 500 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key -  <br>  </td></tr>
       <tr><td> 503 </td><td> Service unavailable. Typically a timeout, or result of a rejected request to prevent service overload. For further assistance, file an issue under \&quot;Performance - 404 and 500 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<StachTableResponse> transactionsGetWithHttpInfo(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling transactionsGet");
    }
    
    // create path and map variables
    String localVarPath = "/transactions";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "id", id));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        StachTableResponse
      
    > apiResponse = apiClient.invokeAPI("CompanyApi.transactionsGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, transactionsGetResponseTypeMap, false);

    return apiResponse;

  }
}
