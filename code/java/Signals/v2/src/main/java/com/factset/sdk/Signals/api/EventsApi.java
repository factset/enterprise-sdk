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

import com.factset.sdk.Signals.models.DateTimeInterval;
import com.factset.sdk.Signals.models.ErrorResponse;
import com.factset.sdk.Signals.models.EventAdaptiveCard;
import com.factset.sdk.Signals.models.EventAdaptiveCards;
import com.factset.sdk.Signals.models.EventDetail;
import com.factset.sdk.Signals.models.EventDetails;
import com.factset.sdk.Signals.models.EventHeadlines;
import com.factset.sdk.Signals.models.EventRequestBody;
import com.factset.sdk.Signals.models.EventsEntities;
import com.factset.sdk.Signals.models.EventsEntitiesPost;
import com.factset.sdk.Signals.models.RateLimitResponse;
import com.factset.sdk.Signals.models.RelevanceScoreRange;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class EventsApi {
  private ApiClient apiClient;

  public EventsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public EventsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> getEventAdaptiveCardByIdResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getEventAdaptiveCardByIdResponseTypeMap.put(200, new GenericType<EventAdaptiveCard>(){});
    getEventAdaptiveCardByIdResponseTypeMap.put(404, new GenericType<ErrorResponse>(){});
    getEventAdaptiveCardByIdResponseTypeMap.put(429, new GenericType<RateLimitResponse>(){});
    getEventAdaptiveCardByIdResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> getEventDetailByIdResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getEventDetailByIdResponseTypeMap.put(200, new GenericType<EventDetail>(){});
    getEventDetailByIdResponseTypeMap.put(404, new GenericType<ErrorResponse>(){});
    getEventDetailByIdResponseTypeMap.put(429, new GenericType<RateLimitResponse>(){});
    getEventDetailByIdResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> postEventAdaptiveCardsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    postEventAdaptiveCardsResponseTypeMap.put(200, new GenericType<EventAdaptiveCards>(){});
    postEventAdaptiveCardsResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    postEventAdaptiveCardsResponseTypeMap.put(429, new GenericType<RateLimitResponse>(){});
    postEventAdaptiveCardsResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> postEventDetailsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    postEventDetailsResponseTypeMap.put(200, new GenericType<EventDetails>(){});
    postEventDetailsResponseTypeMap.put(429, new GenericType<RateLimitResponse>(){});
  }

  private static final Map<Integer, GenericType> postEventEntitiesResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    postEventEntitiesResponseTypeMap.put(200, new GenericType<EventsEntities>(){});
    postEventEntitiesResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    postEventEntitiesResponseTypeMap.put(429, new GenericType<RateLimitResponse>(){});
    postEventEntitiesResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> postEventHeadlinesResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    postEventHeadlinesResponseTypeMap.put(200, new GenericType<EventHeadlines>(){});
    postEventHeadlinesResponseTypeMap.put(429, new GenericType<RateLimitResponse>(){});
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
   * Fetch Microsoft&#39;s Adaptive Cards, which includes headlines and event details data plus hyperlinks to FactSet reports, for a single requested Signal event
   * @param eventId The UUID of the event to return. (required)
   * @return EventAdaptiveCard
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> API Rate Limit Exceeded </td><td>  * Api-Version -  <br>  * Api-Supported-Versions -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public EventAdaptiveCard getEventAdaptiveCardById(java.util.UUID eventId) throws ApiException {
    return getEventAdaptiveCardByIdWithHttpInfo(eventId).getData();
  }

  /**
   * 
   * Fetch Microsoft&#39;s Adaptive Cards, which includes headlines and event details data plus hyperlinks to FactSet reports, for a single requested Signal event
   * @param eventId The UUID of the event to return. (required)
   * @return ApiResponse&lt;EventAdaptiveCard&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> API Rate Limit Exceeded </td><td>  * Api-Version -  <br>  * Api-Supported-Versions -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<EventAdaptiveCard> getEventAdaptiveCardByIdWithHttpInfo(java.util.UUID eventId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'eventId' is set
    if (eventId == null) {
      throw new ApiException(400, "Missing the required parameter 'eventId' when calling getEventAdaptiveCardById");
    }
    
    // create path and map variables
    String localVarPath = "/events/adaptive-cards/{eventId}"
      .replaceAll("\\{" + "eventId" + "\\}", apiClient.escapeString(eventId.toString()));

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
        
        EventAdaptiveCard
      
    > apiResponse = apiClient.invokeAPI("EventsApi.getEventAdaptiveCardById", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getEventAdaptiveCardByIdResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * 
   * Fetch Signals event headlines plus all additional event details for a single requested Signal event
   * @param eventId The UUID of the event to return. (required)
   * @return EventDetail
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> API Rate Limit Exceeded </td><td>  * Api-Version -  <br>  * Api-Supported-Versions -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public EventDetail getEventDetailById(java.util.UUID eventId) throws ApiException {
    return getEventDetailByIdWithHttpInfo(eventId).getData();
  }

  /**
   * 
   * Fetch Signals event headlines plus all additional event details for a single requested Signal event
   * @param eventId The UUID of the event to return. (required)
   * @return ApiResponse&lt;EventDetail&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> API Rate Limit Exceeded </td><td>  * Api-Version -  <br>  * Api-Supported-Versions -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<EventDetail> getEventDetailByIdWithHttpInfo(java.util.UUID eventId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'eventId' is set
    if (eventId == null) {
      throw new ApiException(400, "Missing the required parameter 'eventId' when calling getEventDetailById");
    }
    
    // create path and map variables
    String localVarPath = "/events/details/{eventId}"
      .replaceAll("\\{" + "eventId" + "\\}", apiClient.escapeString(eventId.toString()));

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
        
        EventDetail
      
    > apiResponse = apiClient.invokeAPI("EventsApi.getEventDetailById", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getEventDetailByIdResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * 
   * Fetch Microsoft&#39;s Adaptive Cards, which includes headlines and event details data plus hyperlinks to FactSet reports, based on at least one of the following filtering parameters: &#x60;ids&#x60;, &#x60;portfolios&#x60;
   * @param eventRequestBody  (required)
   * @return EventAdaptiveCards
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> API Rate Limit Exceeded </td><td>  * Api-Version -  <br>  * Api-Supported-Versions -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public EventAdaptiveCards postEventAdaptiveCards(EventRequestBody eventRequestBody) throws ApiException {
    return postEventAdaptiveCardsWithHttpInfo(eventRequestBody).getData();
  }

  /**
   * 
   * Fetch Microsoft&#39;s Adaptive Cards, which includes headlines and event details data plus hyperlinks to FactSet reports, based on at least one of the following filtering parameters: &#x60;ids&#x60;, &#x60;portfolios&#x60;
   * @param eventRequestBody  (required)
   * @return ApiResponse&lt;EventAdaptiveCards&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> API Rate Limit Exceeded </td><td>  * Api-Version -  <br>  * Api-Supported-Versions -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<EventAdaptiveCards> postEventAdaptiveCardsWithHttpInfo(EventRequestBody eventRequestBody) throws ApiException {
    Object localVarPostBody = eventRequestBody;
    
    // verify the required parameter 'eventRequestBody' is set
    if (eventRequestBody == null) {
      throw new ApiException(400, "Missing the required parameter 'eventRequestBody' when calling postEventAdaptiveCards");
    }
    
    // create path and map variables
    String localVarPath = "/events/adaptive-cards";

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
        
        EventAdaptiveCards
      
    > apiResponse = apiClient.invokeAPI("EventsApi.postEventAdaptiveCards", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, postEventAdaptiveCardsResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * 
   * Fetch Signals event headlines plus all additional event details for up to 1000 identifiers and at least one of the following filtering parameters: &#x60;ids&#x60;, &#x60;portfolios&#x60;
   * @param eventRequestBody  (required)
   * @return EventDetails
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> API Rate Limit Exceeded </td><td>  * Api-Version -  <br>  * Api-Supported-Versions -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  </td></tr>
     </table>
   */
  public EventDetails postEventDetails(EventRequestBody eventRequestBody) throws ApiException {
    return postEventDetailsWithHttpInfo(eventRequestBody).getData();
  }

  /**
   * 
   * Fetch Signals event headlines plus all additional event details for up to 1000 identifiers and at least one of the following filtering parameters: &#x60;ids&#x60;, &#x60;portfolios&#x60;
   * @param eventRequestBody  (required)
   * @return ApiResponse&lt;EventDetails&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> API Rate Limit Exceeded </td><td>  * Api-Version -  <br>  * Api-Supported-Versions -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<EventDetails> postEventDetailsWithHttpInfo(EventRequestBody eventRequestBody) throws ApiException {
    Object localVarPostBody = eventRequestBody;
    
    // verify the required parameter 'eventRequestBody' is set
    if (eventRequestBody == null) {
      throw new ApiException(400, "Missing the required parameter 'eventRequestBody' when calling postEventDetails");
    }
    
    // create path and map variables
    String localVarPath = "/events/details";

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
        
        EventDetails
      
    > apiResponse = apiClient.invokeAPI("EventsApi.postEventDetails", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, postEventDetailsResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * 
   * Fetch FactSet entity IDs for events that match the filtering criteria
   * @param eventsEntitiesPost  (required)
   * @return EventsEntities
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> API Rate Limit Exceeded </td><td>  * Api-Version -  <br>  * Api-Supported-Versions -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public EventsEntities postEventEntities(EventsEntitiesPost eventsEntitiesPost) throws ApiException {
    return postEventEntitiesWithHttpInfo(eventsEntitiesPost).getData();
  }

  /**
   * 
   * Fetch FactSet entity IDs for events that match the filtering criteria
   * @param eventsEntitiesPost  (required)
   * @return ApiResponse&lt;EventsEntities&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> API Rate Limit Exceeded </td><td>  * Api-Version -  <br>  * Api-Supported-Versions -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<EventsEntities> postEventEntitiesWithHttpInfo(EventsEntitiesPost eventsEntitiesPost) throws ApiException {
    Object localVarPostBody = eventsEntitiesPost;
    
    // verify the required parameter 'eventsEntitiesPost' is set
    if (eventsEntitiesPost == null) {
      throw new ApiException(400, "Missing the required parameter 'eventsEntitiesPost' when calling postEventEntities");
    }
    
    // create path and map variables
    String localVarPath = "/events/entities";

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
        
        EventsEntities
      
    > apiResponse = apiClient.invokeAPI("EventsApi.postEventEntities", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, postEventEntitiesResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * 
   * Fetch Signals event headlines based on the filtering criteria for up to 1000 identifiers and at least one of the following filtering parameters: &#x60;ids&#x60;, &#x60;portfolios&#x60;
   * @param eventRequestBody  (required)
   * @return EventHeadlines
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> API Rate Limit Exceeded </td><td>  * Api-Version -  <br>  * Api-Supported-Versions -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  </td></tr>
     </table>
   */
  public EventHeadlines postEventHeadlines(EventRequestBody eventRequestBody) throws ApiException {
    return postEventHeadlinesWithHttpInfo(eventRequestBody).getData();
  }

  /**
   * 
   * Fetch Signals event headlines based on the filtering criteria for up to 1000 identifiers and at least one of the following filtering parameters: &#x60;ids&#x60;, &#x60;portfolios&#x60;
   * @param eventRequestBody  (required)
   * @return ApiResponse&lt;EventHeadlines&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> API Rate Limit Exceeded </td><td>  * Api-Version -  <br>  * Api-Supported-Versions -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<EventHeadlines> postEventHeadlinesWithHttpInfo(EventRequestBody eventRequestBody) throws ApiException {
    Object localVarPostBody = eventRequestBody;
    
    // verify the required parameter 'eventRequestBody' is set
    if (eventRequestBody == null) {
      throw new ApiException(400, "Missing the required parameter 'eventRequestBody' when calling postEventHeadlines");
    }
    
    // create path and map variables
    String localVarPath = "/events/headlines";

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
        
        EventHeadlines
      
    > apiResponse = apiClient.invokeAPI("EventsApi.postEventHeadlines", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, postEventHeadlinesResponseTypeMap, false);

    return apiResponse;

  }
}
