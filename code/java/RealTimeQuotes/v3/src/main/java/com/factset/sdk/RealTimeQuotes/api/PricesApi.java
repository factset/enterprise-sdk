package com.factset.sdk.RealTimeQuotes.api;

import com.factset.sdk.RealTimeQuotes.ApiException;
import com.factset.sdk.RealTimeQuotes.ApiClient;
import com.factset.sdk.RealTimeQuotes.ApiResponse;
import com.factset.sdk.RealTimeQuotes.Configuration;
import com.factset.sdk.RealTimeQuotes.Pair;

import jakarta.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import java.math.BigDecimal;
import com.factset.sdk.RealTimeQuotes.models.InlineResponse20089;
import com.factset.sdk.RealTimeQuotes.models.InlineResponse20090;
import com.factset.sdk.RealTimeQuotes.models.InlineResponse20091;
import com.factset.sdk.RealTimeQuotes.models.InlineResponse20092;
import com.factset.sdk.RealTimeQuotes.models.InlineResponse20093;
import com.factset.sdk.RealTimeQuotes.models.InlineResponse20094;
import com.factset.sdk.RealTimeQuotes.models.InlineResponse20095;
import com.factset.sdk.RealTimeQuotes.models.InlineResponse20096;
import com.factset.sdk.RealTimeQuotes.models.PostPricesTradingScheduleEventListRequest;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class PricesApi {
  private ApiClient apiClient;

  public PricesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public PricesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> getPricesBidAskGetResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getPricesBidAskGetResponseTypeMap.put(200, new GenericType<InlineResponse20091>(){});
  }

  private static final Map<Integer, GenericType> getPricesBidAskListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getPricesBidAskListResponseTypeMap.put(200, new GenericType<InlineResponse20092>(){});
  }

  private static final Map<Integer, GenericType> getPricesGetResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getPricesGetResponseTypeMap.put(200, new GenericType<InlineResponse20089>(){});
  }

  private static final Map<Integer, GenericType> getPricesListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getPricesListResponseTypeMap.put(200, new GenericType<InlineResponse20090>(){});
  }

  private static final Map<Integer, GenericType> getPricesOrderbookAggregatedGetResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getPricesOrderbookAggregatedGetResponseTypeMap.put(200, new GenericType<InlineResponse20093>(){});
  }

  private static final Map<Integer, GenericType> getPricesOrderbookFullGetResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getPricesOrderbookFullGetResponseTypeMap.put(200, new GenericType<InlineResponse20094>(){});
  }

  private static final Map<Integer, GenericType> getPricesTradingScheduleEventTypeListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getPricesTradingScheduleEventTypeListResponseTypeMap.put(200, new GenericType<InlineResponse20096>(){});
  }

  private static final Map<Integer, GenericType> postPricesTradingScheduleEventListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    postPricesTradingScheduleEventListResponseTypeMap.put(200, new GenericType<InlineResponse20095>(){});
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
   * Most recent bid and ask prices (best bid / offer) for a notation.
   * Most recent bid and ask prices (best bid / offer) for a notation.  The endpoint is subscribable to provide push updates. See attribute &#x60;_subscriptionMinimalInterval&#x60; for valid update rates.
   * @param identifier  (required)
   * @param identifierType  (required)
   * @param quality  (optional, default to DLY)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param subscriptionMinimumInterval Minimum number of milliseconds at which updates are send. (optional, default to 5000)
   * @return InlineResponse20091
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20091 getPricesBidAskGet(String identifier, String identifierType, String quality, java.util.Set<String> attributes, BigDecimal subscriptionMinimumInterval) throws ApiException {
    return getPricesBidAskGetWithHttpInfo(identifier, identifierType, quality, attributes, subscriptionMinimumInterval).getData();
  }

  /**
   * Most recent bid and ask prices (best bid / offer) for a notation.
   * Most recent bid and ask prices (best bid / offer) for a notation.  The endpoint is subscribable to provide push updates. See attribute &#x60;_subscriptionMinimalInterval&#x60; for valid update rates.
   * @param identifier  (required)
   * @param identifierType  (required)
   * @param quality  (optional, default to DLY)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param subscriptionMinimumInterval Minimum number of milliseconds at which updates are send. (optional, default to 5000)
   * @return ApiResponse&lt;InlineResponse20091&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20091> getPricesBidAskGetWithHttpInfo(String identifier, String identifierType, String quality, java.util.Set<String> attributes, BigDecimal subscriptionMinimumInterval) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'identifier' is set
    if (identifier == null) {
      throw new ApiException(400, "Missing the required parameter 'identifier' when calling getPricesBidAskGet");
    }
    
    // verify the required parameter 'identifierType' is set
    if (identifierType == null) {
      throw new ApiException(400, "Missing the required parameter 'identifierType' when calling getPricesBidAskGet");
    }
    
    // create path and map variables
    String localVarPath = "/prices/bidAsk/get";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "identifier", identifier));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "identifierType", identifierType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "quality", quality));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "_attributes", attributes));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_subscriptionMinimumInterval", subscriptionMinimumInterval));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        InlineResponse20091
      
    > apiResponse = apiClient.invokeAPI("PricesApi.getPricesBidAskGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getPricesBidAskGetResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Most recent bid and ask prices (best bid / offer) for a list of notations.
   * Most recent bid and ask prices (best bid / offer) for a list of notations.
   * @param identifiers  (required)
   * @param identifierType  (required)
   * @param quality  (optional, default to DLY)
   * @param sameQuality  (optional, default to true)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @return InlineResponse20092
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20092 getPricesBidAskList(java.util.Set<String> identifiers, String identifierType, String quality, Boolean sameQuality, java.util.Set<String> attributes) throws ApiException {
    return getPricesBidAskListWithHttpInfo(identifiers, identifierType, quality, sameQuality, attributes).getData();
  }

  /**
   * Most recent bid and ask prices (best bid / offer) for a list of notations.
   * Most recent bid and ask prices (best bid / offer) for a list of notations.
   * @param identifiers  (required)
   * @param identifierType  (required)
   * @param quality  (optional, default to DLY)
   * @param sameQuality  (optional, default to true)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @return ApiResponse&lt;InlineResponse20092&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20092> getPricesBidAskListWithHttpInfo(java.util.Set<String> identifiers, String identifierType, String quality, Boolean sameQuality, java.util.Set<String> attributes) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'identifiers' is set
    if (identifiers == null) {
      throw new ApiException(400, "Missing the required parameter 'identifiers' when calling getPricesBidAskList");
    }
    
    // verify the required parameter 'identifierType' is set
    if (identifierType == null) {
      throw new ApiException(400, "Missing the required parameter 'identifierType' when calling getPricesBidAskList");
    }
    
    // create path and map variables
    String localVarPath = "/prices/bidAsk/list";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "identifiers", identifiers));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "identifierType", identifierType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "quality", quality));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sameQuality", sameQuality));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "_attributes", attributes));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        InlineResponse20092
      
    > apiResponse = apiClient.invokeAPI("PricesApi.getPricesBidAskList", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getPricesBidAskListResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Overview of trading on the most recent trading day, including the latest price, for a notation.
   * Overview of trading on the most recent trading day, including the latest price, for a notation.  The endpoint is subscribable to provide push updates. See attribute &#x60;_subscriptionMinimalInterval&#x60; for valid update rates.
   * @param identifier  (required)
   * @param identifierType  (required)
   * @param quality  (optional, default to DLY)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param subscriptionMinimumInterval Minimum number of milliseconds at which updates are sent. (optional, default to 5000)
   * @return InlineResponse20089
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20089 getPricesGet(String identifier, String identifierType, String quality, java.util.Set<String> attributes, BigDecimal subscriptionMinimumInterval) throws ApiException {
    return getPricesGetWithHttpInfo(identifier, identifierType, quality, attributes, subscriptionMinimumInterval).getData();
  }

  /**
   * Overview of trading on the most recent trading day, including the latest price, for a notation.
   * Overview of trading on the most recent trading day, including the latest price, for a notation.  The endpoint is subscribable to provide push updates. See attribute &#x60;_subscriptionMinimalInterval&#x60; for valid update rates.
   * @param identifier  (required)
   * @param identifierType  (required)
   * @param quality  (optional, default to DLY)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param subscriptionMinimumInterval Minimum number of milliseconds at which updates are sent. (optional, default to 5000)
   * @return ApiResponse&lt;InlineResponse20089&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20089> getPricesGetWithHttpInfo(String identifier, String identifierType, String quality, java.util.Set<String> attributes, BigDecimal subscriptionMinimumInterval) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'identifier' is set
    if (identifier == null) {
      throw new ApiException(400, "Missing the required parameter 'identifier' when calling getPricesGet");
    }
    
    // verify the required parameter 'identifierType' is set
    if (identifierType == null) {
      throw new ApiException(400, "Missing the required parameter 'identifierType' when calling getPricesGet");
    }
    
    // create path and map variables
    String localVarPath = "/prices/get";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "identifier", identifier));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "identifierType", identifierType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "quality", quality));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "_attributes", attributes));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_subscriptionMinimumInterval", subscriptionMinimumInterval));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        InlineResponse20089
      
    > apiResponse = apiClient.invokeAPI("PricesApi.getPricesGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getPricesGetResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Overview of trading on the most recent trading day, including the latest price, for a list of notations.
   * Overview of trading on the most recent trading day, including the latest price, for a list of notations.
   * @param identifiers  (required)
   * @param identifierType  (required)
   * @param quality  (optional, default to DLY)
   * @param sameQuality  (optional, default to true)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @return InlineResponse20090
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20090 getPricesList(java.util.Set<String> identifiers, String identifierType, String quality, Boolean sameQuality, java.util.Set<String> attributes) throws ApiException {
    return getPricesListWithHttpInfo(identifiers, identifierType, quality, sameQuality, attributes).getData();
  }

  /**
   * Overview of trading on the most recent trading day, including the latest price, for a list of notations.
   * Overview of trading on the most recent trading day, including the latest price, for a list of notations.
   * @param identifiers  (required)
   * @param identifierType  (required)
   * @param quality  (optional, default to DLY)
   * @param sameQuality  (optional, default to true)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @return ApiResponse&lt;InlineResponse20090&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20090> getPricesListWithHttpInfo(java.util.Set<String> identifiers, String identifierType, String quality, Boolean sameQuality, java.util.Set<String> attributes) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'identifiers' is set
    if (identifiers == null) {
      throw new ApiException(400, "Missing the required parameter 'identifiers' when calling getPricesList");
    }
    
    // verify the required parameter 'identifierType' is set
    if (identifierType == null) {
      throw new ApiException(400, "Missing the required parameter 'identifierType' when calling getPricesList");
    }
    
    // create path and map variables
    String localVarPath = "/prices/list";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "identifiers", identifiers));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "identifierType", identifierType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "quality", quality));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sameQuality", sameQuality));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "_attributes", attributes));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        InlineResponse20090
      
    > apiResponse = apiClient.invokeAPI("PricesApi.getPricesList", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getPricesListResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Orderbook aggregated by price.
   * Orderbook aggregated by price.
   * @param identifier  (required)
   * @param identifierType  (required)
   * @param quality  (optional, default to RLT)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param subscriptionMinimumInterval Non-negative number of milliseconds to throttle the update rate. (optional, default to 5000)
   * @return InlineResponse20093
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20093 getPricesOrderbookAggregatedGet(String identifier, String identifierType, String quality, java.util.Set<String> attributes, BigDecimal subscriptionMinimumInterval) throws ApiException {
    return getPricesOrderbookAggregatedGetWithHttpInfo(identifier, identifierType, quality, attributes, subscriptionMinimumInterval).getData();
  }

  /**
   * Orderbook aggregated by price.
   * Orderbook aggregated by price.
   * @param identifier  (required)
   * @param identifierType  (required)
   * @param quality  (optional, default to RLT)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param subscriptionMinimumInterval Non-negative number of milliseconds to throttle the update rate. (optional, default to 5000)
   * @return ApiResponse&lt;InlineResponse20093&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20093> getPricesOrderbookAggregatedGetWithHttpInfo(String identifier, String identifierType, String quality, java.util.Set<String> attributes, BigDecimal subscriptionMinimumInterval) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'identifier' is set
    if (identifier == null) {
      throw new ApiException(400, "Missing the required parameter 'identifier' when calling getPricesOrderbookAggregatedGet");
    }
    
    // verify the required parameter 'identifierType' is set
    if (identifierType == null) {
      throw new ApiException(400, "Missing the required parameter 'identifierType' when calling getPricesOrderbookAggregatedGet");
    }
    
    // create path and map variables
    String localVarPath = "/prices/orderbook/aggregated/get";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "identifier", identifier));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "identifierType", identifierType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "quality", quality));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "_attributes", attributes));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_subscriptionMinimumInterval", subscriptionMinimumInterval));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        InlineResponse20093
      
    > apiResponse = apiClient.invokeAPI("PricesApi.getPricesOrderbookAggregatedGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getPricesOrderbookAggregatedGetResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Full orderbook
   * Full orderbook
   * @param identifier  (required)
   * @param identifierType  (required)
   * @param quality  (optional, default to RLT)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param subscriptionMinimumInterval Non-negative number of milliseconds to throttle the update rate. (optional, default to 5000)
   * @return InlineResponse20094
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20094 getPricesOrderbookFullGet(String identifier, String identifierType, String quality, java.util.Set<String> attributes, BigDecimal subscriptionMinimumInterval) throws ApiException {
    return getPricesOrderbookFullGetWithHttpInfo(identifier, identifierType, quality, attributes, subscriptionMinimumInterval).getData();
  }

  /**
   * Full orderbook
   * Full orderbook
   * @param identifier  (required)
   * @param identifierType  (required)
   * @param quality  (optional, default to RLT)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param subscriptionMinimumInterval Non-negative number of milliseconds to throttle the update rate. (optional, default to 5000)
   * @return ApiResponse&lt;InlineResponse20094&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20094> getPricesOrderbookFullGetWithHttpInfo(String identifier, String identifierType, String quality, java.util.Set<String> attributes, BigDecimal subscriptionMinimumInterval) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'identifier' is set
    if (identifier == null) {
      throw new ApiException(400, "Missing the required parameter 'identifier' when calling getPricesOrderbookFullGet");
    }
    
    // verify the required parameter 'identifierType' is set
    if (identifierType == null) {
      throw new ApiException(400, "Missing the required parameter 'identifierType' when calling getPricesOrderbookFullGet");
    }
    
    // create path and map variables
    String localVarPath = "/prices/orderbook/full/get";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "identifier", identifier));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "identifierType", identifierType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "quality", quality));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "_attributes", attributes));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_subscriptionMinimumInterval", subscriptionMinimumInterval));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        InlineResponse20094
      
    > apiResponse = apiClient.invokeAPI("PricesApi.getPricesOrderbookFullGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getPricesOrderbookFullGetResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Trading schedule event types.
   * Trading schedule event types define the events which may occur during any period of trading. Types of trading schedule events are for instance OPEN, CLOSE, END_OF_DAY.
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @return InlineResponse20096
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20096 getPricesTradingScheduleEventTypeList(java.util.Set<String> attributes) throws ApiException {
    return getPricesTradingScheduleEventTypeListWithHttpInfo(attributes).getData();
  }

  /**
   * Trading schedule event types.
   * Trading schedule event types define the events which may occur during any period of trading. Types of trading schedule events are for instance OPEN, CLOSE, END_OF_DAY.
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @return ApiResponse&lt;InlineResponse20096&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20096> getPricesTradingScheduleEventTypeListWithHttpInfo(java.util.Set<String> attributes) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/prices/tradingSchedule/event/type/list";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "_attributes", attributes));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        InlineResponse20096
      
    > apiResponse = apiClient.invokeAPI("PricesApi.getPricesTradingScheduleEventTypeList", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getPricesTradingScheduleEventTypeListResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Sequence of market-related events.
   * Sequence of market-related events like the opening time or closing time of a market of a specific notation.&lt;br&gt;&lt;br&gt;Pagination to a previous page is not supported and &#x60;pagination.previous&#x60; is always &#x60;null&#x60;.
   * @param postPricesTradingScheduleEventListRequest Request Body (required)
   * @return InlineResponse20095
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20095 postPricesTradingScheduleEventList(PostPricesTradingScheduleEventListRequest postPricesTradingScheduleEventListRequest) throws ApiException {
    return postPricesTradingScheduleEventListWithHttpInfo(postPricesTradingScheduleEventListRequest).getData();
  }

  /**
   * Sequence of market-related events.
   * Sequence of market-related events like the opening time or closing time of a market of a specific notation.&lt;br&gt;&lt;br&gt;Pagination to a previous page is not supported and &#x60;pagination.previous&#x60; is always &#x60;null&#x60;.
   * @param postPricesTradingScheduleEventListRequest Request Body (required)
   * @return ApiResponse&lt;InlineResponse20095&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20095> postPricesTradingScheduleEventListWithHttpInfo(PostPricesTradingScheduleEventListRequest postPricesTradingScheduleEventListRequest) throws ApiException {
    Object localVarPostBody = postPricesTradingScheduleEventListRequest;
    
    // verify the required parameter 'postPricesTradingScheduleEventListRequest' is set
    if (postPricesTradingScheduleEventListRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'postPricesTradingScheduleEventListRequest' when calling postPricesTradingScheduleEventList");
    }
    
    // create path and map variables
    String localVarPath = "/prices/tradingSchedule/event/list";

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
        
        InlineResponse20095
      
    > apiResponse = apiClient.invokeAPI("PricesApi.postPricesTradingScheduleEventList", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, postPricesTradingScheduleEventListResponseTypeMap, false);

    return apiResponse;

  }
}
