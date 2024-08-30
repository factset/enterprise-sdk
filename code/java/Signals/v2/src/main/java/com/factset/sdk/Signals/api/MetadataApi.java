package com.factset.sdk.Signals.api;

import com.factset.sdk.Signals.ApiException;
import com.factset.sdk.Signals.ApiClient;
import com.factset.sdk.Signals.ApiResponse;
import com.factset.sdk.Signals.Configuration;
import com.factset.sdk.Signals.Pair;

import jakarta.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.Signals.models.ErrorResponse;
import com.factset.sdk.Signals.models.RateLimitResponse;
import com.factset.sdk.Signals.models.SignalDefinition;
import com.factset.sdk.Signals.models.SignalMetaData;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class MetadataApi {
  private ApiClient apiClient;

  public MetadataApi() {
    this(Configuration.getDefaultApiClient());
  }

  public MetadataApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> getCategoriesResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getCategoriesResponseTypeMap.put(200, new GenericType<SignalMetaData>(){});
    getCategoriesResponseTypeMap.put(429, new GenericType<RateLimitResponse>(){});
    getCategoriesResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> getDataDictionaryResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getDataDictionaryResponseTypeMap.put(200, new GenericType<SignalMetaData>(){});
    getDataDictionaryResponseTypeMap.put(429, new GenericType<RateLimitResponse>(){});
    getDataDictionaryResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> getDataDictionaryByIdResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getDataDictionaryByIdResponseTypeMap.put(200, new GenericType<SignalDefinition>(){});
    getDataDictionaryByIdResponseTypeMap.put(404, new GenericType<ErrorResponse>(){});
    getDataDictionaryByIdResponseTypeMap.put(429, new GenericType<RateLimitResponse>(){});
    getDataDictionaryByIdResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> getThemesResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getThemesResponseTypeMap.put(200, new GenericType<SignalMetaData>(){});
    getThemesResponseTypeMap.put(429, new GenericType<RateLimitResponse>(){});
    getThemesResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
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
   * Fetch a list of available signal categories
   * @return SignalMetaData
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> API Rate Limit Exceeded </td><td>  * Api-Version -  <br>  * Api-Supported-Versions -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public SignalMetaData getCategories() throws ApiException {
    return getCategoriesWithHttpInfo().getData();
  }

  /**
   * 
   * Fetch a list of available signal categories
   * @return ApiResponse&lt;SignalMetaData&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> API Rate Limit Exceeded </td><td>  * Api-Version -  <br>  * Api-Supported-Versions -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SignalMetaData> getCategoriesWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/categories";

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
        
        SignalMetaData
      
    > apiResponse = apiClient.invokeAPI("MetadataApi.getCategories", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getCategoriesResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * 
   * Fetch a list of all active signals
   * @return SignalMetaData
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> API Rate Limit Exceeded </td><td>  * Api-Version -  <br>  * Api-Supported-Versions -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public SignalMetaData getDataDictionary() throws ApiException {
    return getDataDictionaryWithHttpInfo().getData();
  }

  /**
   * 
   * Fetch a list of all active signals
   * @return ApiResponse&lt;SignalMetaData&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> API Rate Limit Exceeded </td><td>  * Api-Version -  <br>  * Api-Supported-Versions -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SignalMetaData> getDataDictionaryWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/data-dictionary";

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
        
        SignalMetaData
      
    > apiResponse = apiClient.invokeAPI("MetadataApi.getDataDictionary", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getDataDictionaryResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * 
   * Fetch the metadata and contract for the requested signal
   * @param signalId A single signalId. (required)
   * @return SignalDefinition
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> API Rate Limit Exceeded </td><td>  * Api-Version -  <br>  * Api-Supported-Versions -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public SignalDefinition getDataDictionaryById(String signalId) throws ApiException {
    return getDataDictionaryByIdWithHttpInfo(signalId).getData();
  }

  /**
   * 
   * Fetch the metadata and contract for the requested signal
   * @param signalId A single signalId. (required)
   * @return ApiResponse&lt;SignalDefinition&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> API Rate Limit Exceeded </td><td>  * Api-Version -  <br>  * Api-Supported-Versions -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SignalDefinition> getDataDictionaryByIdWithHttpInfo(String signalId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'signalId' is set
    if (signalId == null) {
      throw new ApiException(400, "Missing the required parameter 'signalId' when calling getDataDictionaryById");
    }
    
    // create path and map variables
    String localVarPath = "/data-dictionary/{signalId}"
      .replaceAll("\\{" + "signalId" + "\\}", apiClient.escapeString(signalId.toString()));

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
        
        SignalDefinition
      
    > apiResponse = apiClient.invokeAPI("MetadataApi.getDataDictionaryById", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getDataDictionaryByIdResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * 
   * Fetch a list of available signal themes
   * @return SignalMetaData
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> API Rate Limit Exceeded </td><td>  * Api-Version -  <br>  * Api-Supported-Versions -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public SignalMetaData getThemes() throws ApiException {
    return getThemesWithHttpInfo().getData();
  }

  /**
   * 
   * Fetch a list of available signal themes
   * @return ApiResponse&lt;SignalMetaData&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> API Rate Limit Exceeded </td><td>  * Api-Version -  <br>  * Api-Supported-Versions -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SignalMetaData> getThemesWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/themes";

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
        
        SignalMetaData
      
    > apiResponse = apiClient.invokeAPI("MetadataApi.getThemes", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getThemesResponseTypeMap, false);

    return apiResponse;

  }
}
