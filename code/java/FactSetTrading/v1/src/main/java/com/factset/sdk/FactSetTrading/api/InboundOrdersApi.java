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

import com.factset.sdk.FactSetTrading.models.CancelInboundOrdersRoot;
import com.factset.sdk.FactSetTrading.models.ClientErrorResponse;
import com.factset.sdk.FactSetTrading.models.InboundOrdersResponseRoot;
import com.factset.sdk.FactSetTrading.models.InboundOrdersRoot;
import com.factset.sdk.FactSetTrading.models.ReplaceInboundOrdersRoot;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class InboundOrdersApi {
  private ApiClient apiClient;

  public InboundOrdersApi() {
    this(Configuration.getDefaultApiClient());
  }

  public InboundOrdersApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> cancelResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    cancelResponseTypeMap.put(200, new GenericType<InboundOrdersResponseRoot>(){});
    cancelResponseTypeMap.put(400, new GenericType<ClientErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> createResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    createResponseTypeMap.put(200, new GenericType<InboundOrdersResponseRoot>(){});
    createResponseTypeMap.put(400, new GenericType<ClientErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> replaceResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    replaceResponseTypeMap.put(200, new GenericType<InboundOrdersResponseRoot>(){});
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
   * Cancel the inbound orders on Trading system.
   * This endpoint takes the list of inbound orders to be cancelled on the Trading system.
   * @param cancelInboundOrdersRoot  (optional)
   * @return InboundOrdersResponseRoot
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
  public InboundOrdersResponseRoot cancel(CancelInboundOrdersRoot cancelInboundOrdersRoot) throws ApiException {
    return cancelWithHttpInfo(cancelInboundOrdersRoot).getData();
  }

  /**
   * Cancel the inbound orders on Trading system.
   * This endpoint takes the list of inbound orders to be cancelled on the Trading system.
   * @param cancelInboundOrdersRoot  (optional)
   * @return ApiResponse&lt;InboundOrdersResponseRoot&gt;
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
  public ApiResponse<InboundOrdersResponseRoot> cancelWithHttpInfo(CancelInboundOrdersRoot cancelInboundOrdersRoot) throws ApiException {
    Object localVarPostBody = cancelInboundOrdersRoot;
    
    // create path and map variables
    String localVarPath = "/inbound-orders/cancel";

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
        
        InboundOrdersResponseRoot
      
    > apiResponse = apiClient.invokeAPI("InboundOrdersApi.cancel", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, cancelResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Send inbound orders to Trading system for execution.
   * This endpoint takes the list of inbound orders and place them on Trading system for execution.
   * @param inboundOrdersRoot  (optional)
   * @return InboundOrdersResponseRoot
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
  public InboundOrdersResponseRoot create(InboundOrdersRoot inboundOrdersRoot) throws ApiException {
    return createWithHttpInfo(inboundOrdersRoot).getData();
  }

  /**
   * Send inbound orders to Trading system for execution.
   * This endpoint takes the list of inbound orders and place them on Trading system for execution.
   * @param inboundOrdersRoot  (optional)
   * @return ApiResponse&lt;InboundOrdersResponseRoot&gt;
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
  public ApiResponse<InboundOrdersResponseRoot> createWithHttpInfo(InboundOrdersRoot inboundOrdersRoot) throws ApiException {
    Object localVarPostBody = inboundOrdersRoot;
    
    // create path and map variables
    String localVarPath = "/inbound-orders/create";

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
        
        InboundOrdersResponseRoot
      
    > apiResponse = apiClient.invokeAPI("InboundOrdersApi.create", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, createResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Replace the inbound orders on Trading system.
   * This endpoint takes the list of orders to be replaced on the Trading system.
   * @param replaceInboundOrdersRoot  (optional)
   * @return InboundOrdersResponseRoot
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
  public InboundOrdersResponseRoot replace(ReplaceInboundOrdersRoot replaceInboundOrdersRoot) throws ApiException {
    return replaceWithHttpInfo(replaceInboundOrdersRoot).getData();
  }

  /**
   * Replace the inbound orders on Trading system.
   * This endpoint takes the list of orders to be replaced on the Trading system.
   * @param replaceInboundOrdersRoot  (optional)
   * @return ApiResponse&lt;InboundOrdersResponseRoot&gt;
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
  public ApiResponse<InboundOrdersResponseRoot> replaceWithHttpInfo(ReplaceInboundOrdersRoot replaceInboundOrdersRoot) throws ApiException {
    Object localVarPostBody = replaceInboundOrdersRoot;
    
    // create path and map variables
    String localVarPath = "/inbound-orders/replace";

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
        
        InboundOrdersResponseRoot
      
    > apiResponse = apiClient.invokeAPI("InboundOrdersApi.replace", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, replaceResponseTypeMap, false);

    return apiResponse;

  }
}
