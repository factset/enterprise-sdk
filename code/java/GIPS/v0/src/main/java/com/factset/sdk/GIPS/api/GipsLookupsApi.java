package com.factset.sdk.GIPS.api;

import com.factset.sdk.GIPS.ApiException;
import com.factset.sdk.GIPS.ApiClient;
import com.factset.sdk.GIPS.ApiResponse;
import com.factset.sdk.GIPS.Configuration;
import com.factset.sdk.GIPS.Pair;

import jakarta.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.GIPS.models.APIClientErrorResponse;
import com.factset.sdk.GIPS.models.AccountDirectoriesRoot;
import com.factset.sdk.GIPS.models.CurrencyRoot;
import com.factset.sdk.GIPS.models.GIPSViewsRoot;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class GipsLookupsApi {
  private ApiClient apiClient;

  public GipsLookupsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public GipsLookupsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> gipsGetAccountsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    gipsGetAccountsResponseTypeMap.put(200, new GenericType<AccountDirectoriesRoot>(){});
    gipsGetAccountsResponseTypeMap.put(404, new GenericType<APIClientErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> gipsGetCurrenciesResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    gipsGetCurrenciesResponseTypeMap.put(200, new GenericType<CurrencyRoot>(){});
  }

  private static final Map<Integer, GenericType> gipsGetViewsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    gipsGetViewsResponseTypeMap.put(200, new GenericType<GIPSViewsRoot>(){});
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
   * Get accounts
   * This endpoint requests all GIPS composites and sub-directories in the given directory which can be used in the GipsCalculationParameters schema. Please note that the endpoint returns all ACTMs and not all are GIPS Compliant.
   * @param path The directory to get the accounts and sub-directories. (required)
   * @return AccountDirectoriesRoot
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Expected response, returns a list of accounts and directories </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Reset - Number of seconds remaining till rate limit resets. <br>  </td></tr>
       <tr><td> 401 </td><td> Missing or invalid authentication </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  </td></tr>
       <tr><td> 403 </td><td> User is forbidden with current credentials </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Reset - Number of seconds remaining till rate limit resets. <br>  </td></tr>
       <tr><td> 404 </td><td> Invalid path parameter provided </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Reset - Number of seconds remaining till rate limit resets. <br>  </td></tr>
       <tr><td> 406 </td><td> Unsupported Accept header.  Header needs to be set to application/json </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Reset - Number of seconds remaining till rate limit resets. <br>  </td></tr>
       <tr><td> 429 </td><td> Rate limit reached. Wait till the time specified in Retry-After header value to make further requests. </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Reset - Number of seconds remaining till rate limit resets. <br>  * Retry-After - Time to wait in seconds before making a new request as the rate limit has reached. <br>  </td></tr>
       <tr><td> 500 </td><td> Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  </td></tr>
       <tr><td> 503 </td><td> Request timed out. Retry the request in some time </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  </td></tr>
     </table>
   */
  public AccountDirectoriesRoot gipsGetAccounts(String path) throws ApiException {
    return gipsGetAccountsWithHttpInfo(path).getData();
  }

  /**
   * Get accounts
   * This endpoint requests all GIPS composites and sub-directories in the given directory which can be used in the GipsCalculationParameters schema. Please note that the endpoint returns all ACTMs and not all are GIPS Compliant.
   * @param path The directory to get the accounts and sub-directories. (required)
   * @return ApiResponse&lt;AccountDirectoriesRoot&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Expected response, returns a list of accounts and directories </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Reset - Number of seconds remaining till rate limit resets. <br>  </td></tr>
       <tr><td> 401 </td><td> Missing or invalid authentication </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  </td></tr>
       <tr><td> 403 </td><td> User is forbidden with current credentials </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Reset - Number of seconds remaining till rate limit resets. <br>  </td></tr>
       <tr><td> 404 </td><td> Invalid path parameter provided </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Reset - Number of seconds remaining till rate limit resets. <br>  </td></tr>
       <tr><td> 406 </td><td> Unsupported Accept header.  Header needs to be set to application/json </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Reset - Number of seconds remaining till rate limit resets. <br>  </td></tr>
       <tr><td> 429 </td><td> Rate limit reached. Wait till the time specified in Retry-After header value to make further requests. </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Reset - Number of seconds remaining till rate limit resets. <br>  * Retry-After - Time to wait in seconds before making a new request as the rate limit has reached. <br>  </td></tr>
       <tr><td> 500 </td><td> Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  </td></tr>
       <tr><td> 503 </td><td> Request timed out. Retry the request in some time </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  </td></tr>
     </table>
   */
  public ApiResponse<AccountDirectoriesRoot> gipsGetAccountsWithHttpInfo(String path) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'path' is set
    if (path == null) {
      throw new ApiException(400, "Missing the required parameter 'path' when calling gipsGetAccounts");
    }
    
    // create path and map variables
    String localVarPath = "/accounts/{path}"
      .replaceAll("\\{" + "path" + "\\}", apiClient.escapeString(path.toString()));

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
        
        AccountDirectoriesRoot
      
    > apiResponse = apiClient.invokeAPI("GipsLookupsApi.gipsGetAccounts", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, gipsGetAccountsResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Get currencies
   * This endpoint lists all the supported currencies that can be used in the GipsCalculationParameters schema.
   * @return CurrencyRoot
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Expected response, returns a list of currencies. </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Reset - Number of seconds remaining till rate limit resets. <br>  </td></tr>
       <tr><td> 401 </td><td> Missing or invalid authentication. </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  </td></tr>
       <tr><td> 403 </td><td> User is forbidden with current credentials </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Reset - Number of seconds remaining till rate limit resets. <br>  </td></tr>
       <tr><td> 406 </td><td> Unsupported Accept header. Header needs to be set to application/json. </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Reset - Number of seconds remaining till rate limit resets. <br>  </td></tr>
       <tr><td> 429 </td><td> Rate limit reached. Wait till the time specified in Retry-After header value to make further requests. </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Reset - Number of seconds remaining till rate limit resets. <br>  * Retry-After - Time to wait in seconds before making a new request as the rate limit has reached. <br>  </td></tr>
       <tr><td> 500 </td><td> Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  </td></tr>
       <tr><td> 503 </td><td> Request timed out. Retry the request in sometime. </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  </td></tr>
     </table>
   */
  public CurrencyRoot gipsGetCurrencies() throws ApiException {
    return gipsGetCurrenciesWithHttpInfo().getData();
  }

  /**
   * Get currencies
   * This endpoint lists all the supported currencies that can be used in the GipsCalculationParameters schema.
   * @return ApiResponse&lt;CurrencyRoot&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Expected response, returns a list of currencies. </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Reset - Number of seconds remaining till rate limit resets. <br>  </td></tr>
       <tr><td> 401 </td><td> Missing or invalid authentication. </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  </td></tr>
       <tr><td> 403 </td><td> User is forbidden with current credentials </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Reset - Number of seconds remaining till rate limit resets. <br>  </td></tr>
       <tr><td> 406 </td><td> Unsupported Accept header. Header needs to be set to application/json. </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Reset - Number of seconds remaining till rate limit resets. <br>  </td></tr>
       <tr><td> 429 </td><td> Rate limit reached. Wait till the time specified in Retry-After header value to make further requests. </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Reset - Number of seconds remaining till rate limit resets. <br>  * Retry-After - Time to wait in seconds before making a new request as the rate limit has reached. <br>  </td></tr>
       <tr><td> 500 </td><td> Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  </td></tr>
       <tr><td> 503 </td><td> Request timed out. Retry the request in sometime. </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  </td></tr>
     </table>
   */
  public ApiResponse<CurrencyRoot> gipsGetCurrenciesWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/currencies";

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
        
        CurrencyRoot
      
    > apiResponse = apiClient.invokeAPI("GipsLookupsApi.gipsGetCurrencies", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, gipsGetCurrenciesResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Get views
   * This endpoint lists all the views that can be used in the GipsCalculationParameters schema.
   * @return GIPSViewsRoot
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Expected response, returns a list of views. </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Reset - Number of seconds remaining till rate limit resets. <br>  </td></tr>
       <tr><td> 401 </td><td> Missing or invalid authentication. </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  </td></tr>
       <tr><td> 403 </td><td> User is forbidden with current credentials </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Reset - Number of seconds remaining till rate limit resets. <br>  </td></tr>
       <tr><td> 406 </td><td> Unsupported Accept header. Header needs to be set to application/json. </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Reset - Number of seconds remaining till rate limit resets. <br>  </td></tr>
       <tr><td> 429 </td><td> Rate limit reached. Wait till the time specified in Retry-After header value to make further requests. </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Reset - Number of seconds remaining till rate limit resets. <br>  * Retry-After - Time to wait in seconds before making a new request as the rate limit has reached. <br>  </td></tr>
       <tr><td> 500 </td><td> Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  </td></tr>
       <tr><td> 503 </td><td> Request timed out. Retry the request in sometime. </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  </td></tr>
     </table>
   */
  public GIPSViewsRoot gipsGetViews() throws ApiException {
    return gipsGetViewsWithHttpInfo().getData();
  }

  /**
   * Get views
   * This endpoint lists all the views that can be used in the GipsCalculationParameters schema.
   * @return ApiResponse&lt;GIPSViewsRoot&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Expected response, returns a list of views. </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Reset - Number of seconds remaining till rate limit resets. <br>  </td></tr>
       <tr><td> 401 </td><td> Missing or invalid authentication. </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  </td></tr>
       <tr><td> 403 </td><td> User is forbidden with current credentials </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Reset - Number of seconds remaining till rate limit resets. <br>  </td></tr>
       <tr><td> 406 </td><td> Unsupported Accept header. Header needs to be set to application/json. </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Reset - Number of seconds remaining till rate limit resets. <br>  </td></tr>
       <tr><td> 429 </td><td> Rate limit reached. Wait till the time specified in Retry-After header value to make further requests. </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Reset - Number of seconds remaining till rate limit resets. <br>  * Retry-After - Time to wait in seconds before making a new request as the rate limit has reached. <br>  </td></tr>
       <tr><td> 500 </td><td> Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  </td></tr>
       <tr><td> 503 </td><td> Request timed out. Retry the request in sometime. </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  </td></tr>
     </table>
   */
  public ApiResponse<GIPSViewsRoot> gipsGetViewsWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/views";

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
        
        GIPSViewsRoot
      
    > apiResponse = apiClient.invokeAPI("GipsLookupsApi.gipsGetViews", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, gipsGetViewsResponseTypeMap, false);

    return apiResponse;

  }
}
