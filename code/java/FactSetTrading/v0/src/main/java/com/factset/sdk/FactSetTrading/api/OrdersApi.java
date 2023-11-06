package com.factset.sdk.FactSetTrading.api;

import com.factset.sdk.FactSetTrading.ApiException;
import com.factset.sdk.FactSetTrading.ApiClient;
import com.factset.sdk.FactSetTrading.ApiResponse;
import com.factset.sdk.FactSetTrading.Configuration;
import com.factset.sdk.FactSetTrading.Pair;

import javax.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.FactSetTrading.models.ClientErrorResponse;
import com.factset.sdk.FactSetTrading.models.EMSCancelOrdersRoot;
import com.factset.sdk.FactSetTrading.models.EMSOrdersResponseRoot;
import com.factset.sdk.FactSetTrading.models.EMSOrdersRoot;
import com.factset.sdk.FactSetTrading.models.EMSReplaceOrdersRoot;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class OrdersApi {
  private ApiClient apiClient;

  public OrdersApi() {
    this(Configuration.getDefaultApiClient());
  }

  public OrdersApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> cancelResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    cancelResponseTypeMap.put(200, new GenericType<EMSOrdersResponseRoot>(){});
    cancelResponseTypeMap.put(400, new GenericType<ClientErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> createResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    createResponseTypeMap.put(200, new GenericType<EMSOrdersResponseRoot>(){});
    createResponseTypeMap.put(400, new GenericType<ClientErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> replaceResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    replaceResponseTypeMap.put(200, new GenericType<EMSOrdersResponseRoot>(){});
    replaceResponseTypeMap.put(400, new GenericType<ClientErrorResponse>(){});
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
   * Cancel the orders on EMS system.
   * This endpoint takes the list of orders to be cancelled on the EMS system.
   * @param emSCancelOrdersRoot  (optional)
   * @return EMSOrdersResponseRoot
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Expected response, returns the list of order ids. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Invalid post body parameters. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Missing or invalid authentication. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> User is forbidden with current credentials. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Missing/Invalid Content-Type header. Header needs to be set to application/json. </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> Rate limit reached. Wait before sending further requests. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting. </td><td>  -  </td></tr>
       <tr><td> 503 </td><td> Request timed out. Retry the request in sometime. </td><td>  -  </td></tr>
     </table>
   */
  public EMSOrdersResponseRoot cancel(EMSCancelOrdersRoot emSCancelOrdersRoot) throws ApiException {
    return cancelWithHttpInfo(emSCancelOrdersRoot).getData();
  }

  /**
   * Cancel the orders on EMS system.
   * This endpoint takes the list of orders to be cancelled on the EMS system.
   * @param emSCancelOrdersRoot  (optional)
   * @return ApiResponse&lt;EMSOrdersResponseRoot&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Expected response, returns the list of order ids. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Invalid post body parameters. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Missing or invalid authentication. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> User is forbidden with current credentials. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Missing/Invalid Content-Type header. Header needs to be set to application/json. </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> Rate limit reached. Wait before sending further requests. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting. </td><td>  -  </td></tr>
       <tr><td> 503 </td><td> Request timed out. Retry the request in sometime. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<EMSOrdersResponseRoot> cancelWithHttpInfo(EMSCancelOrdersRoot emSCancelOrdersRoot) throws ApiException {
    Object localVarPostBody = emSCancelOrdersRoot;
    
    // create path and map variables
    String localVarPath = "/orders/cancel";

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
        
        EMSOrdersResponseRoot
      
    > apiResponse = apiClient.invokeAPI("OrdersApi.cancel", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, cancelResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Send orders to EMS for execution.
   * This endpoint takes the list of orders and place them on EMS for execution.
   * @param emSOrdersRoot  (optional)
   * @return EMSOrdersResponseRoot
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Expected response, returns the list of orders. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Invalid post body parameters. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Missing or invalid authentication. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> User is forbidden with current credentials. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Missing/Invalid Content-Type header. Header needs to be set to application/json. </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> Rate limit reached. Wait before sending further requests. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting. </td><td>  -  </td></tr>
       <tr><td> 503 </td><td> Request timed out. Retry the request in sometime. </td><td>  -  </td></tr>
     </table>
   */
  public EMSOrdersResponseRoot create(EMSOrdersRoot emSOrdersRoot) throws ApiException {
    return createWithHttpInfo(emSOrdersRoot).getData();
  }

  /**
   * Send orders to EMS for execution.
   * This endpoint takes the list of orders and place them on EMS for execution.
   * @param emSOrdersRoot  (optional)
   * @return ApiResponse&lt;EMSOrdersResponseRoot&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Expected response, returns the list of orders. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Invalid post body parameters. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Missing or invalid authentication. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> User is forbidden with current credentials. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Missing/Invalid Content-Type header. Header needs to be set to application/json. </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> Rate limit reached. Wait before sending further requests. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting. </td><td>  -  </td></tr>
       <tr><td> 503 </td><td> Request timed out. Retry the request in sometime. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<EMSOrdersResponseRoot> createWithHttpInfo(EMSOrdersRoot emSOrdersRoot) throws ApiException {
    Object localVarPostBody = emSOrdersRoot;
    
    // create path and map variables
    String localVarPath = "/orders/create";

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
        
        EMSOrdersResponseRoot
      
    > apiResponse = apiClient.invokeAPI("OrdersApi.create", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, createResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Replace the orders on EMS system.
   * This endpoint takes the list of orders to be replaced on the EMS system.
   * @param emSReplaceOrdersRoot  (optional)
   * @return EMSOrdersResponseRoot
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Expected response, returns the list of order ids. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Invalid post body parameters. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Missing or invalid authentication. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> User is forbidden with current credentials. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Missing/Invalid Content-Type header. Header needs to be set to application/json. </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> Rate limit reached. Wait before sending further requests. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting. </td><td>  -  </td></tr>
       <tr><td> 503 </td><td> Request timed out. Retry the request in sometime. </td><td>  -  </td></tr>
     </table>
   */
  public EMSOrdersResponseRoot replace(EMSReplaceOrdersRoot emSReplaceOrdersRoot) throws ApiException {
    return replaceWithHttpInfo(emSReplaceOrdersRoot).getData();
  }

  /**
   * Replace the orders on EMS system.
   * This endpoint takes the list of orders to be replaced on the EMS system.
   * @param emSReplaceOrdersRoot  (optional)
   * @return ApiResponse&lt;EMSOrdersResponseRoot&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Expected response, returns the list of order ids. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Invalid post body parameters. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Missing or invalid authentication. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> User is forbidden with current credentials. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Missing/Invalid Content-Type header. Header needs to be set to application/json. </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> Rate limit reached. Wait before sending further requests. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting. </td><td>  -  </td></tr>
       <tr><td> 503 </td><td> Request timed out. Retry the request in sometime. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<EMSOrdersResponseRoot> replaceWithHttpInfo(EMSReplaceOrdersRoot emSReplaceOrdersRoot) throws ApiException {
    Object localVarPostBody = emSReplaceOrdersRoot;
    
    // create path and map variables
    String localVarPath = "/orders/replace";

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
        
        EMSOrdersResponseRoot
      
    > apiResponse = apiClient.invokeAPI("OrdersApi.replace", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, replaceResponseTypeMap, false);

    return apiResponse;

  }
}
