package com.factset.sdk.FactSetTrading.api;

import com.factset.sdk.FactSetTrading.ApiException;
import com.factset.sdk.FactSetTrading.ApiClient;
import com.factset.sdk.FactSetTrading.ApiResponse;
import com.factset.sdk.FactSetTrading.Configuration;
import com.factset.sdk.FactSetTrading.Pair;

import jakarta.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.FactSetTrading.models.CancelChildOrdersRoot;
import com.factset.sdk.FactSetTrading.models.ChildOrdersResponseRoot;
import com.factset.sdk.FactSetTrading.models.ChildOrdersRoot;
import com.factset.sdk.FactSetTrading.models.ClientErrorResponse;
import com.factset.sdk.FactSetTrading.models.CreateChildOrdersResponseRoot;
import com.factset.sdk.FactSetTrading.models.ReplaceChildOrdersRoot;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class ChildOrdersApi {
  private ApiClient apiClient;

  public ChildOrdersApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ChildOrdersApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> cancelChildOrderResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    cancelChildOrderResponseTypeMap.put(200, new GenericType<ChildOrdersResponseRoot>(){});
    cancelChildOrderResponseTypeMap.put(400, new GenericType<ClientErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> createChildOrderResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    createChildOrderResponseTypeMap.put(200, new GenericType<CreateChildOrdersResponseRoot>(){});
    createChildOrderResponseTypeMap.put(400, new GenericType<ClientErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> replaceChildOrderResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    replaceChildOrderResponseTypeMap.put(200, new GenericType<ChildOrdersResponseRoot>(){});
    replaceChildOrderResponseTypeMap.put(400, new GenericType<ClientErrorResponse>(){});
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
   * Cancel Child Orders on Trading system
   * This endpoint is used to cancel a specific child order on Trading system.
   * @param cancelChildOrdersRoot  (optional)
   * @return ChildOrdersResponseRoot
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Expected response. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Invalid parameters provided. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Missing or invalid authentication. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> User is forbidden with current credentials. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Missing/Invalid Content-Type header. Header needs to be set to application/json. </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> Rate limit reached. Wait before sending further requests. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting. </td><td>  -  </td></tr>
       <tr><td> 503 </td><td> Request timed out. Retry the request in sometime. </td><td>  -  </td></tr>
     </table>
   */
  public ChildOrdersResponseRoot cancelChildOrder(CancelChildOrdersRoot cancelChildOrdersRoot) throws ApiException {
    return cancelChildOrderWithHttpInfo(cancelChildOrdersRoot).getData();
  }

  /**
   * Cancel Child Orders on Trading system
   * This endpoint is used to cancel a specific child order on Trading system.
   * @param cancelChildOrdersRoot  (optional)
   * @return ApiResponse&lt;ChildOrdersResponseRoot&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Expected response. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Invalid parameters provided. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Missing or invalid authentication. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> User is forbidden with current credentials. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Missing/Invalid Content-Type header. Header needs to be set to application/json. </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> Rate limit reached. Wait before sending further requests. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting. </td><td>  -  </td></tr>
       <tr><td> 503 </td><td> Request timed out. Retry the request in sometime. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ChildOrdersResponseRoot> cancelChildOrderWithHttpInfo(CancelChildOrdersRoot cancelChildOrdersRoot) throws ApiException {
    Object localVarPostBody = cancelChildOrdersRoot;
    
    // create path and map variables
    String localVarPath = "/child-orders/cancel";

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
        
        ChildOrdersResponseRoot
      
    > apiResponse = apiClient.invokeAPI("ChildOrdersApi.cancelChildOrder", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, cancelChildOrderResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Create Child Orders on Trading system.
   * This endpoint is used to create child orders on Trading system.
   * @param childOrdersRoot  (optional)
   * @return CreateChildOrdersResponseRoot
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Expected response. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Invalid parameters provided. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Missing or invalid authentication. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> User is forbidden with current credentials. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Missing/Invalid Content-Type header. Header needs to be set to application/json. </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> Rate limit reached. Wait before sending further requests. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting. </td><td>  -  </td></tr>
       <tr><td> 503 </td><td> Request timed out. Retry the request in sometime. </td><td>  -  </td></tr>
     </table>
   */
  public CreateChildOrdersResponseRoot createChildOrder(ChildOrdersRoot childOrdersRoot) throws ApiException {
    return createChildOrderWithHttpInfo(childOrdersRoot).getData();
  }

  /**
   * Create Child Orders on Trading system.
   * This endpoint is used to create child orders on Trading system.
   * @param childOrdersRoot  (optional)
   * @return ApiResponse&lt;CreateChildOrdersResponseRoot&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Expected response. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Invalid parameters provided. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Missing or invalid authentication. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> User is forbidden with current credentials. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Missing/Invalid Content-Type header. Header needs to be set to application/json. </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> Rate limit reached. Wait before sending further requests. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting. </td><td>  -  </td></tr>
       <tr><td> 503 </td><td> Request timed out. Retry the request in sometime. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CreateChildOrdersResponseRoot> createChildOrderWithHttpInfo(ChildOrdersRoot childOrdersRoot) throws ApiException {
    Object localVarPostBody = childOrdersRoot;
    
    // create path and map variables
    String localVarPath = "/child-orders/create";

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
        
        CreateChildOrdersResponseRoot
      
    > apiResponse = apiClient.invokeAPI("ChildOrdersApi.createChildOrder", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, createChildOrderResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Replace the Child Orders on Trading system.
   * This endpoint takes the child order to be replaced on the Trading system.
   * @param replaceChildOrdersRoot  (optional)
   * @return ChildOrdersResponseRoot
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Expected response. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Invalid parameters provided. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Missing or invalid authentication. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> User is forbidden with current credentials. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Missing/Invalid Content-Type header. Header needs to be set to application/json. </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> Rate limit reached. Wait before sending further requests. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting. </td><td>  -  </td></tr>
       <tr><td> 503 </td><td> Request timed out. Retry the request in sometime. </td><td>  -  </td></tr>
     </table>
   */
  public ChildOrdersResponseRoot replaceChildOrder(ReplaceChildOrdersRoot replaceChildOrdersRoot) throws ApiException {
    return replaceChildOrderWithHttpInfo(replaceChildOrdersRoot).getData();
  }

  /**
   * Replace the Child Orders on Trading system.
   * This endpoint takes the child order to be replaced on the Trading system.
   * @param replaceChildOrdersRoot  (optional)
   * @return ApiResponse&lt;ChildOrdersResponseRoot&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Expected response. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Invalid parameters provided. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Missing or invalid authentication. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> User is forbidden with current credentials. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Missing/Invalid Content-Type header. Header needs to be set to application/json. </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> Rate limit reached. Wait before sending further requests. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting. </td><td>  -  </td></tr>
       <tr><td> 503 </td><td> Request timed out. Retry the request in sometime. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ChildOrdersResponseRoot> replaceChildOrderWithHttpInfo(ReplaceChildOrdersRoot replaceChildOrdersRoot) throws ApiException {
    Object localVarPostBody = replaceChildOrdersRoot;
    
    // create path and map variables
    String localVarPath = "/child-orders/replace";

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
        
        ChildOrdersResponseRoot
      
    > apiResponse = apiClient.invokeAPI("ChildOrdersApi.replaceChildOrder", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, replaceChildOrderResponseTypeMap, false);

    return apiResponse;

  }
}
