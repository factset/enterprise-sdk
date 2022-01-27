package com.factset.sdk.PriceAlertingAPIforDigitalPortals.api;

import com.factset.sdk.PriceAlertingAPIforDigitalPortals.ApiException;
import com.factset.sdk.PriceAlertingAPIforDigitalPortals.ApiClient;
import com.factset.sdk.PriceAlertingAPIforDigitalPortals.ApiResponse;
import com.factset.sdk.PriceAlertingAPIforDigitalPortals.Configuration;
import com.factset.sdk.PriceAlertingAPIforDigitalPortals.Pair;

import javax.ws.rs.core.GenericType;

import java.math.BigDecimal;
import com.factset.sdk.PriceAlertingAPIforDigitalPortals.models.InlineObject;
import com.factset.sdk.PriceAlertingAPIforDigitalPortals.models.InlineResponse200;
import com.factset.sdk.PriceAlertingAPIforDigitalPortals.models.InlineResponse2001;
import com.factset.sdk.PriceAlertingAPIforDigitalPortals.models.InlineResponse2002;
import com.factset.sdk.PriceAlertingAPIforDigitalPortals.models.InlineResponse2003;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlertingApi {
  private ApiClient apiClient;

  public AlertingApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AlertingApi(ApiClient apiClient) {
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
   * Details of an alert.
   * Details of an alert. The details include the trigger definition at the time of alert creation.
   * @param id Identifier of the alert. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @return InlineResponse200
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse200 getAlertingPricesBasicAlertGet(String id, java.util.Set<String> attributes) throws ApiException {
    return getAlertingPricesBasicAlertGetWithHttpInfo(id, attributes).getData();
  }

  /**
   * Details of an alert.
   * Details of an alert. The details include the trigger definition at the time of alert creation.
   * @param id Identifier of the alert. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @return ApiResponse&lt;InlineResponse200&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse200> getAlertingPricesBasicAlertGetWithHttpInfo(String id, java.util.Set<String> attributes) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getAlertingPricesBasicAlertGet");
    }
    
    // create path and map variables
    String localVarPath = "/alerting/prices/basic/alert/get";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "id", id));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "_attributes", attributes));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };

    GenericType<InlineResponse200> localVarReturnType = new GenericType<InlineResponse200>() {};

    return apiClient.invokeAPI("AlertingApi.getAlertingPricesBasicAlertGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * List of alerts.
   * List of alerts in descending order of creation.
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param subscriptionMinimumInterval Non-negative number of milliseconds to throttle the update rate from 0ms to 5000ms. Set to 0 for sending updates immediately. (optional, default to 0.0)
   * @param paginationCursor Starting point as returned in the attributes &#x60;pagination.next&#x60; or &#x60;pagination.previous&#x60; by a prior invocation of this endpoint, or undefined (default). (optional)
   * @param paginationLimit Non-negative maximum number of entries to return. (optional, default to 20.0)
   * @return InlineResponse2001
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse2001 getAlertingPricesBasicAlertList(java.util.Set<String> attributes, BigDecimal subscriptionMinimumInterval, String paginationCursor, BigDecimal paginationLimit) throws ApiException {
    return getAlertingPricesBasicAlertListWithHttpInfo(attributes, subscriptionMinimumInterval, paginationCursor, paginationLimit).getData();
  }

  /**
   * List of alerts.
   * List of alerts in descending order of creation.
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param subscriptionMinimumInterval Non-negative number of milliseconds to throttle the update rate from 0ms to 5000ms. Set to 0 for sending updates immediately. (optional, default to 0.0)
   * @param paginationCursor Starting point as returned in the attributes &#x60;pagination.next&#x60; or &#x60;pagination.previous&#x60; by a prior invocation of this endpoint, or undefined (default). (optional)
   * @param paginationLimit Non-negative maximum number of entries to return. (optional, default to 20.0)
   * @return ApiResponse&lt;InlineResponse2001&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse2001> getAlertingPricesBasicAlertListWithHttpInfo(java.util.Set<String> attributes, BigDecimal subscriptionMinimumInterval, String paginationCursor, BigDecimal paginationLimit) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/alerting/prices/basic/alert/list";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "_attributes", attributes));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_subscriptionMinimumInterval", subscriptionMinimumInterval));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_paginationCursor", paginationCursor));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_paginationLimit", paginationLimit));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };

    GenericType<InlineResponse2001> localVarReturnType = new GenericType<InlineResponse2001>() {};

    return apiClient.invokeAPI("AlertingApi.getAlertingPricesBasicAlertList", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Details of a trigger.
   * Details of a trigger.
   * @param id Identifier of the trigger. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @return InlineResponse2002
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse2002 getAlertingPricesBasicTriggerGet(String id, java.util.Set<String> attributes) throws ApiException {
    return getAlertingPricesBasicTriggerGetWithHttpInfo(id, attributes).getData();
  }

  /**
   * Details of a trigger.
   * Details of a trigger.
   * @param id Identifier of the trigger. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @return ApiResponse&lt;InlineResponse2002&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse2002> getAlertingPricesBasicTriggerGetWithHttpInfo(String id, java.util.Set<String> attributes) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getAlertingPricesBasicTriggerGet");
    }
    
    // create path and map variables
    String localVarPath = "/alerting/prices/basic/trigger/get";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "id", id));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "_attributes", attributes));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };

    GenericType<InlineResponse2002> localVarReturnType = new GenericType<InlineResponse2002>() {};

    return apiClient.invokeAPI("AlertingApi.getAlertingPricesBasicTriggerGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * List of triggers.
   * Returns a list of triggers sorted in descending order of creation.
   * @param body  (optional)
   * @return InlineResponse2003
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse2003 postAlertingPricesBasicTriggerList(InlineObject body) throws ApiException {
    return postAlertingPricesBasicTriggerListWithHttpInfo(body).getData();
  }

  /**
   * List of triggers.
   * Returns a list of triggers sorted in descending order of creation.
   * @param body  (optional)
   * @return ApiResponse&lt;InlineResponse2003&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse2003> postAlertingPricesBasicTriggerListWithHttpInfo(InlineObject body) throws ApiException {
    Object localVarPostBody = body;
    
    // create path and map variables
    String localVarPath = "/alerting/prices/basic/trigger/list";

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

    GenericType<InlineResponse2003> localVarReturnType = new GenericType<InlineResponse2003>() {};

    return apiClient.invokeAPI("AlertingApi.postAlertingPricesBasicTriggerList", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
