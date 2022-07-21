package com.factset.sdk.Signals.api;

import com.factset.sdk.Signals.ApiException;
import com.factset.sdk.Signals.ApiClient;
import com.factset.sdk.Signals.ApiResponse;
import com.factset.sdk.Signals.Configuration;
import com.factset.sdk.Signals.Pair;

import javax.ws.rs.core.GenericType;
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
import com.factset.sdk.Signals.models.RelevanceScoreRange;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
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
    getEventAdaptiveCardByIdResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }
  private static final Map<Integer, GenericType> getEventAdaptiveCardsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getEventAdaptiveCardsResponseTypeMap.put(200, new GenericType<EventAdaptiveCards>(){});
    getEventAdaptiveCardsResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getEventAdaptiveCardsResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }
  private static final Map<Integer, GenericType> getEventDetailByIdResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getEventDetailByIdResponseTypeMap.put(200, new GenericType<EventDetail>(){});
    getEventDetailByIdResponseTypeMap.put(404, new GenericType<ErrorResponse>(){});
    getEventDetailByIdResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }
  private static final Map<Integer, GenericType> getEventDetailsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getEventDetailsResponseTypeMap.put(200, new GenericType<EventDetails>(){});
    getEventDetailsResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getEventDetailsResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }
  private static final Map<Integer, GenericType> getEventEntitiesResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getEventEntitiesResponseTypeMap.put(200, new GenericType<EventsEntities>(){});
    getEventEntitiesResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getEventEntitiesResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }
  private static final Map<Integer, GenericType> getEventHeadlinesResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getEventHeadlinesResponseTypeMap.put(200, new GenericType<EventHeadlines>(){});
    getEventHeadlinesResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getEventHeadlinesResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }
  private static final Map<Integer, GenericType> postEventDetailsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    postEventDetailsResponseTypeMap.put(200, new GenericType<EventDetails>(){});
  }
  private static final Map<Integer, GenericType> postEventHeadlinesResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    postEventHeadlinesResponseTypeMap.put(200, new GenericType<EventHeadlines>(){});
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
   * Fetch Microsoft&#39;s Adaptive Cards, which includes headlines and event details data plus hyperlinks to FactSet reports, based on the filtering criteria
   * @param created A date/time (UTC) interval for filtering signal events based on their creation date. Defaults to NOW - 7 days if omitted. (optional)
   * @param updated A date/time interval (UTC) for filtering signal events based on their last updated date. Defaults to NOW - 7 days if omitted. (optional)
   * @param signalIds  (optional)
   * @param ids Comma delimited string of identifiers. An identifier can be a ticker, FactSet entity id, CUSIP or ISIN. You must provide a list of identifiers either via a ids or a portfolios parameter. If both are provided, only ids filter is used. (optional)
   * @param portfolios Name of a portfolio file stored by FactSet. If the portfolio contains more than 1,000 ids, only the first 1,000 ids are processed. e.g. client:techstocks.ofdb (optional)
   * @param themes Comma delimited string of theme ids. Full list of signal themes can be viewed at /themes. (optional)
   * @param categories Comma delimited string of category ids. Full list of signal categories can be viewed at /categories. (optional)
   * @param userRelevanceScore A range for filtering signal events based on their relevancy score. (optional)
   * @param sort Comma delimited string of sortable attributes. The sort order for each sort attribute is ascending unless it is prefixed with a minus sign, in which case it is descending. If sort is not provided, the default sort applied is -userRelevanceScore (userRelevanceScore in descending order). (optional)
   * @return EventAdaptiveCards
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public EventAdaptiveCards getEventAdaptiveCards(DateTimeInterval created, DateTimeInterval updated, String signalIds, String ids, String portfolios, String themes, String categories, RelevanceScoreRange userRelevanceScore, String sort) throws ApiException {
    return getEventAdaptiveCardsWithHttpInfo(created, updated, signalIds, ids, portfolios, themes, categories, userRelevanceScore, sort).getData();
  }

  /**
   * 
   * Fetch Microsoft&#39;s Adaptive Cards, which includes headlines and event details data plus hyperlinks to FactSet reports, based on the filtering criteria
   * @param created A date/time (UTC) interval for filtering signal events based on their creation date. Defaults to NOW - 7 days if omitted. (optional)
   * @param updated A date/time interval (UTC) for filtering signal events based on their last updated date. Defaults to NOW - 7 days if omitted. (optional)
   * @param signalIds  (optional)
   * @param ids Comma delimited string of identifiers. An identifier can be a ticker, FactSet entity id, CUSIP or ISIN. You must provide a list of identifiers either via a ids or a portfolios parameter. If both are provided, only ids filter is used. (optional)
   * @param portfolios Name of a portfolio file stored by FactSet. If the portfolio contains more than 1,000 ids, only the first 1,000 ids are processed. e.g. client:techstocks.ofdb (optional)
   * @param themes Comma delimited string of theme ids. Full list of signal themes can be viewed at /themes. (optional)
   * @param categories Comma delimited string of category ids. Full list of signal categories can be viewed at /categories. (optional)
   * @param userRelevanceScore A range for filtering signal events based on their relevancy score. (optional)
   * @param sort Comma delimited string of sortable attributes. The sort order for each sort attribute is ascending unless it is prefixed with a minus sign, in which case it is descending. If sort is not provided, the default sort applied is -userRelevanceScore (userRelevanceScore in descending order). (optional)
   * @return ApiResponse&lt;EventAdaptiveCards&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<EventAdaptiveCards> getEventAdaptiveCardsWithHttpInfo(DateTimeInterval created, DateTimeInterval updated, String signalIds, String ids, String portfolios, String themes, String categories, RelevanceScoreRange userRelevanceScore, String sort) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/events/adaptive-cards";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "created", created));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "updated", updated));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "signalIds", signalIds));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "ids", ids));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "portfolios", portfolios));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "themes", themes));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "categories", categories));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "userRelevanceScore", userRelevanceScore));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        EventAdaptiveCards
      
    > apiResponse = apiClient.invokeAPI("EventsApi.getEventAdaptiveCards", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getEventAdaptiveCardsResponseTypeMap, false);

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
   * Fetch Signals event headlines plus all additional event details based on the filtering criteria
   * @param created A date/time (UTC) interval for filtering signal events based on their creation date. Defaults to NOW - 7 days if omitted. (optional)
   * @param updated A date/time interval (UTC) for filtering signal events based on their last updated date. Defaults to NOW - 7 days if omitted. (optional)
   * @param signalIds  (optional)
   * @param ids Comma delimited string of identifiers. An identifier can be a ticker, FactSet entity id, CUSIP or ISIN. You must provide a list of identifiers either via a ids or a portfolios parameter. If both are provided, only ids filter is used. (optional)
   * @param portfolios Name of a portfolio file stored by FactSet. If the portfolio contains more than 1,000 ids, only the first 1,000 ids are processed. e.g. client:techstocks.ofdb (optional)
   * @param themes Comma delimited string of theme ids. Full list of signal themes can be viewed at /themes. (optional)
   * @param categories Comma delimited string of category ids. Full list of signal categories can be viewed at /categories. (optional)
   * @param userRelevanceScore A range for filtering signal events based on their relevancy score. (optional)
   * @param sort Comma delimited string of sortable attributes. The sort order for each sort attribute is ascending unless it is prefixed with a minus sign, in which case it is descending. If sort is not provided, the default sort applied is -userRelevanceScore (userRelevanceScore in descending order). (optional)
   * @return EventDetails
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public EventDetails getEventDetails(DateTimeInterval created, DateTimeInterval updated, String signalIds, String ids, String portfolios, String themes, String categories, RelevanceScoreRange userRelevanceScore, String sort) throws ApiException {
    return getEventDetailsWithHttpInfo(created, updated, signalIds, ids, portfolios, themes, categories, userRelevanceScore, sort).getData();
  }

  /**
   * 
   * Fetch Signals event headlines plus all additional event details based on the filtering criteria
   * @param created A date/time (UTC) interval for filtering signal events based on their creation date. Defaults to NOW - 7 days if omitted. (optional)
   * @param updated A date/time interval (UTC) for filtering signal events based on their last updated date. Defaults to NOW - 7 days if omitted. (optional)
   * @param signalIds  (optional)
   * @param ids Comma delimited string of identifiers. An identifier can be a ticker, FactSet entity id, CUSIP or ISIN. You must provide a list of identifiers either via a ids or a portfolios parameter. If both are provided, only ids filter is used. (optional)
   * @param portfolios Name of a portfolio file stored by FactSet. If the portfolio contains more than 1,000 ids, only the first 1,000 ids are processed. e.g. client:techstocks.ofdb (optional)
   * @param themes Comma delimited string of theme ids. Full list of signal themes can be viewed at /themes. (optional)
   * @param categories Comma delimited string of category ids. Full list of signal categories can be viewed at /categories. (optional)
   * @param userRelevanceScore A range for filtering signal events based on their relevancy score. (optional)
   * @param sort Comma delimited string of sortable attributes. The sort order for each sort attribute is ascending unless it is prefixed with a minus sign, in which case it is descending. If sort is not provided, the default sort applied is -userRelevanceScore (userRelevanceScore in descending order). (optional)
   * @return ApiResponse&lt;EventDetails&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<EventDetails> getEventDetailsWithHttpInfo(DateTimeInterval created, DateTimeInterval updated, String signalIds, String ids, String portfolios, String themes, String categories, RelevanceScoreRange userRelevanceScore, String sort) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/events/details";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "created", created));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "updated", updated));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "signalIds", signalIds));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "ids", ids));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "portfolios", portfolios));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "themes", themes));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "categories", categories));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "userRelevanceScore", userRelevanceScore));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        EventDetails
      
    > apiResponse = apiClient.invokeAPI("EventsApi.getEventDetails", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getEventDetailsResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * 
   * Fetch FactSet entity IDs for events that match the filtering criteria
   * @param created A date/time (UTC) interval for filtering signal events based on their creation date. Defaults to NOW - 7 days if omitted. (optional)
   * @param updated A date/time interval (UTC) for filtering signal events based on their last updated date. Defaults to NOW - 7 days if omitted. (optional)
   * @param signalIds  (optional)
   * @param themes Comma delimited string of theme ids. Full list of signal themes can be viewed at /themes. (optional)
   * @param categories Comma delimited string of category ids. Full list of signal categories can be viewed at /categories. (optional)
   * @param userRelevanceScore A range for filtering signal events based on their relevancy score. (optional)
   * @return EventsEntities
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public EventsEntities getEventEntities(DateTimeInterval created, DateTimeInterval updated, String signalIds, String themes, String categories, RelevanceScoreRange userRelevanceScore) throws ApiException {
    return getEventEntitiesWithHttpInfo(created, updated, signalIds, themes, categories, userRelevanceScore).getData();
  }

  /**
   * 
   * Fetch FactSet entity IDs for events that match the filtering criteria
   * @param created A date/time (UTC) interval for filtering signal events based on their creation date. Defaults to NOW - 7 days if omitted. (optional)
   * @param updated A date/time interval (UTC) for filtering signal events based on their last updated date. Defaults to NOW - 7 days if omitted. (optional)
   * @param signalIds  (optional)
   * @param themes Comma delimited string of theme ids. Full list of signal themes can be viewed at /themes. (optional)
   * @param categories Comma delimited string of category ids. Full list of signal categories can be viewed at /categories. (optional)
   * @param userRelevanceScore A range for filtering signal events based on their relevancy score. (optional)
   * @return ApiResponse&lt;EventsEntities&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<EventsEntities> getEventEntitiesWithHttpInfo(DateTimeInterval created, DateTimeInterval updated, String signalIds, String themes, String categories, RelevanceScoreRange userRelevanceScore) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/events/entities";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "created", created));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "updated", updated));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "signalIds", signalIds));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "themes", themes));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "categories", categories));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "userRelevanceScore", userRelevanceScore));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        EventsEntities
      
    > apiResponse = apiClient.invokeAPI("EventsApi.getEventEntities", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getEventEntitiesResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * 
   * Fetch Signals event headlines based on the filtering criteria
   * @param created A date/time (UTC) interval for filtering signal events based on their creation date. Defaults to NOW - 7 days if omitted. (optional)
   * @param updated A date/time interval (UTC) for filtering signal events based on their last updated date. Defaults to NOW - 7 days if omitted. (optional)
   * @param signalIds  (optional)
   * @param ids Comma delimited string of identifiers. An identifier can be a ticker, FactSet entity id, CUSIP or ISIN. You must provide a list of identifiers either via a ids or a portfolios parameter. If both are provided, only ids filter is used. (optional)
   * @param portfolios Name of a portfolio file stored by FactSet. If the portfolio contains more than 1,000 ids, only the first 1,000 ids are processed. e.g. client:techstocks.ofdb (optional)
   * @param themes Comma delimited string of theme ids. Full list of signal themes can be viewed at /themes. (optional)
   * @param categories Comma delimited string of category ids. Full list of signal categories can be viewed at /categories. (optional)
   * @param userRelevanceScore A range for filtering signal events based on their relevancy score. (optional)
   * @param sort Comma delimited string of sortable attributes. The sort order for each sort attribute is ascending unless it is prefixed with a minus sign, in which case it is descending. If sort is not provided, the default sort applied is -userRelevanceScore (userRelevanceScore in descending order). (optional)
   * @return EventHeadlines
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public EventHeadlines getEventHeadlines(DateTimeInterval created, DateTimeInterval updated, String signalIds, String ids, String portfolios, String themes, String categories, RelevanceScoreRange userRelevanceScore, String sort) throws ApiException {
    return getEventHeadlinesWithHttpInfo(created, updated, signalIds, ids, portfolios, themes, categories, userRelevanceScore, sort).getData();
  }

  /**
   * 
   * Fetch Signals event headlines based on the filtering criteria
   * @param created A date/time (UTC) interval for filtering signal events based on their creation date. Defaults to NOW - 7 days if omitted. (optional)
   * @param updated A date/time interval (UTC) for filtering signal events based on their last updated date. Defaults to NOW - 7 days if omitted. (optional)
   * @param signalIds  (optional)
   * @param ids Comma delimited string of identifiers. An identifier can be a ticker, FactSet entity id, CUSIP or ISIN. You must provide a list of identifiers either via a ids or a portfolios parameter. If both are provided, only ids filter is used. (optional)
   * @param portfolios Name of a portfolio file stored by FactSet. If the portfolio contains more than 1,000 ids, only the first 1,000 ids are processed. e.g. client:techstocks.ofdb (optional)
   * @param themes Comma delimited string of theme ids. Full list of signal themes can be viewed at /themes. (optional)
   * @param categories Comma delimited string of category ids. Full list of signal categories can be viewed at /categories. (optional)
   * @param userRelevanceScore A range for filtering signal events based on their relevancy score. (optional)
   * @param sort Comma delimited string of sortable attributes. The sort order for each sort attribute is ascending unless it is prefixed with a minus sign, in which case it is descending. If sort is not provided, the default sort applied is -userRelevanceScore (userRelevanceScore in descending order). (optional)
   * @return ApiResponse&lt;EventHeadlines&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<EventHeadlines> getEventHeadlinesWithHttpInfo(DateTimeInterval created, DateTimeInterval updated, String signalIds, String ids, String portfolios, String themes, String categories, RelevanceScoreRange userRelevanceScore, String sort) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/events/headlines";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "created", created));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "updated", updated));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "signalIds", signalIds));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "ids", ids));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "portfolios", portfolios));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "themes", themes));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "categories", categories));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "userRelevanceScore", userRelevanceScore));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        EventHeadlines
      
    > apiResponse = apiClient.invokeAPI("EventsApi.getEventHeadlines", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getEventHeadlinesResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * 
   * Fetch Signals event headlines plus all additional event details for up to 1000 identifiers
   * @param eventRequestBody  (required)
   * @return EventDetails
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public EventDetails postEventDetails(EventRequestBody eventRequestBody) throws ApiException {
    return postEventDetailsWithHttpInfo(eventRequestBody).getData();
  }

  /**
   * 
   * Fetch Signals event headlines plus all additional event details for up to 1000 identifiers
   * @param eventRequestBody  (required)
   * @return ApiResponse&lt;EventDetails&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
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
   * Fetch Signals event headlines based on the filtering criteria for up to 1000 identifiers
   * @param eventRequestBody  (required)
   * @return EventHeadlines
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
   */
  public EventHeadlines postEventHeadlines(EventRequestBody eventRequestBody) throws ApiException {
    return postEventHeadlinesWithHttpInfo(eventRequestBody).getData();
  }

  /**
   * 
   * Fetch Signals event headlines based on the filtering criteria for up to 1000 identifiers
   * @param eventRequestBody  (required)
   * @return ApiResponse&lt;EventHeadlines&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
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
