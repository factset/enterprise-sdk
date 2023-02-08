package com.factset.sdk.QuotesAPIforDigitalPortals.api;

import com.factset.sdk.QuotesAPIforDigitalPortals.ApiException;
import com.factset.sdk.QuotesAPIforDigitalPortals.ApiClient;
import com.factset.sdk.QuotesAPIforDigitalPortals.ApiResponse;
import com.factset.sdk.QuotesAPIforDigitalPortals.Configuration;
import com.factset.sdk.QuotesAPIforDigitalPortals.Pair;

import javax.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import java.math.BigDecimal;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse20082;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse20083;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse20084;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse20085;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse20086;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse20087;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse20088;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse20089;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.PostPricesTradingScheduleEventListRequest;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
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
    getPricesBidAskGetResponseTypeMap.put(200, new GenericType<InlineResponse20084>(){});
  }

  private static final Map<Integer, GenericType> getPricesBidAskListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getPricesBidAskListResponseTypeMap.put(200, new GenericType<InlineResponse20085>(){});
  }

  private static final Map<Integer, GenericType> getPricesGetResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getPricesGetResponseTypeMap.put(200, new GenericType<InlineResponse20082>(){});
  }

  private static final Map<Integer, GenericType> getPricesListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getPricesListResponseTypeMap.put(200, new GenericType<InlineResponse20083>(){});
  }

  private static final Map<Integer, GenericType> getPricesOrderbookAggregatedGetResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getPricesOrderbookAggregatedGetResponseTypeMap.put(200, new GenericType<InlineResponse20086>(){});
  }

  private static final Map<Integer, GenericType> getPricesOrderbookFullGetResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getPricesOrderbookFullGetResponseTypeMap.put(200, new GenericType<InlineResponse20087>(){});
  }

  private static final Map<Integer, GenericType> getPricesTradingScheduleEventTypeListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getPricesTradingScheduleEventTypeListResponseTypeMap.put(200, new GenericType<InlineResponse20089>(){});
  }

  private static final Map<Integer, GenericType> postPricesTradingScheduleEventListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    postPricesTradingScheduleEventListResponseTypeMap.put(200, new GenericType<InlineResponse20088>(){});
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
   * @return InlineResponse20084
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20084 getPricesBidAskGet(String identifier, String identifierType, String quality, java.util.Set<String> attributes, BigDecimal subscriptionMinimumInterval) throws ApiException {
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
   * @return ApiResponse&lt;InlineResponse20084&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20084> getPricesBidAskGetWithHttpInfo(String identifier, String identifierType, String quality, java.util.Set<String> attributes, BigDecimal subscriptionMinimumInterval) throws ApiException {
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
        
        InlineResponse20084
      
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
   * @return InlineResponse20085
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20085 getPricesBidAskList(java.util.Set<String> identifiers, String identifierType, String quality, Boolean sameQuality, java.util.Set<String> attributes) throws ApiException {
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
   * @return ApiResponse&lt;InlineResponse20085&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20085> getPricesBidAskListWithHttpInfo(java.util.Set<String> identifiers, String identifierType, String quality, Boolean sameQuality, java.util.Set<String> attributes) throws ApiException {
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
        
        InlineResponse20085
      
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
   * @return InlineResponse20082
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20082 getPricesGet(String identifier, String identifierType, String quality, java.util.Set<String> attributes, BigDecimal subscriptionMinimumInterval) throws ApiException {
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
   * @return ApiResponse&lt;InlineResponse20082&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20082> getPricesGetWithHttpInfo(String identifier, String identifierType, String quality, java.util.Set<String> attributes, BigDecimal subscriptionMinimumInterval) throws ApiException {
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
        
        InlineResponse20082
      
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
   * @return InlineResponse20083
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20083 getPricesList(java.util.Set<String> identifiers, String identifierType, String quality, Boolean sameQuality, java.util.Set<String> attributes) throws ApiException {
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
   * @return ApiResponse&lt;InlineResponse20083&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20083> getPricesListWithHttpInfo(java.util.Set<String> identifiers, String identifierType, String quality, Boolean sameQuality, java.util.Set<String> attributes) throws ApiException {
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
        
        InlineResponse20083
      
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
   * @return InlineResponse20086
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20086 getPricesOrderbookAggregatedGet(String identifier, String identifierType, String quality, java.util.Set<String> attributes, BigDecimal subscriptionMinimumInterval) throws ApiException {
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
   * @return ApiResponse&lt;InlineResponse20086&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20086> getPricesOrderbookAggregatedGetWithHttpInfo(String identifier, String identifierType, String quality, java.util.Set<String> attributes, BigDecimal subscriptionMinimumInterval) throws ApiException {
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
        
        InlineResponse20086
      
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
   * @return InlineResponse20087
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20087 getPricesOrderbookFullGet(String identifier, String identifierType, String quality, java.util.Set<String> attributes, BigDecimal subscriptionMinimumInterval) throws ApiException {
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
   * @return ApiResponse&lt;InlineResponse20087&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20087> getPricesOrderbookFullGetWithHttpInfo(String identifier, String identifierType, String quality, java.util.Set<String> attributes, BigDecimal subscriptionMinimumInterval) throws ApiException {
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
        
        InlineResponse20087
      
    > apiResponse = apiClient.invokeAPI("PricesApi.getPricesOrderbookFullGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getPricesOrderbookFullGetResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Trading schedule event types.
   * Trading schedule event types define the events which may occur during any period of trading. Types of trading schedule events are for instance OPEN, CLOSE, END_OF_DAY.
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @return InlineResponse20089
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20089 getPricesTradingScheduleEventTypeList(java.util.Set<String> attributes) throws ApiException {
    return getPricesTradingScheduleEventTypeListWithHttpInfo(attributes).getData();
  }

  /**
   * Trading schedule event types.
   * Trading schedule event types define the events which may occur during any period of trading. Types of trading schedule events are for instance OPEN, CLOSE, END_OF_DAY.
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @return ApiResponse&lt;InlineResponse20089&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20089> getPricesTradingScheduleEventTypeListWithHttpInfo(java.util.Set<String> attributes) throws ApiException {
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
        
        InlineResponse20089
      
    > apiResponse = apiClient.invokeAPI("PricesApi.getPricesTradingScheduleEventTypeList", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getPricesTradingScheduleEventTypeListResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Sequence of market-related events.
   * Sequence of market-related events like the opening time or closing time of a market of a specific notation.&lt;br&gt;&lt;br&gt;Pagination to a previous page is not supported and &#x60;pagination.previous&#x60; is always &#x60;null&#x60;.
   * @param postPricesTradingScheduleEventListRequest  (optional)
   * @return InlineResponse20088
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20088 postPricesTradingScheduleEventList(PostPricesTradingScheduleEventListRequest postPricesTradingScheduleEventListRequest) throws ApiException {
    return postPricesTradingScheduleEventListWithHttpInfo(postPricesTradingScheduleEventListRequest).getData();
  }

  /**
   * Sequence of market-related events.
   * Sequence of market-related events like the opening time or closing time of a market of a specific notation.&lt;br&gt;&lt;br&gt;Pagination to a previous page is not supported and &#x60;pagination.previous&#x60; is always &#x60;null&#x60;.
   * @param postPricesTradingScheduleEventListRequest  (optional)
   * @return ApiResponse&lt;InlineResponse20088&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20088> postPricesTradingScheduleEventListWithHttpInfo(PostPricesTradingScheduleEventListRequest postPricesTradingScheduleEventListRequest) throws ApiException {
    Object localVarPostBody = postPricesTradingScheduleEventListRequest;
    
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
        
        InlineResponse20088
      
    > apiResponse = apiClient.invokeAPI("PricesApi.postPricesTradingScheduleEventList", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, postPricesTradingScheduleEventListResponseTypeMap, false);

    return apiResponse;

  }
}
