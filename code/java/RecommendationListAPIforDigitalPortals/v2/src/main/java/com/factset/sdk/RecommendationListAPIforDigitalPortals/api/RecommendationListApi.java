package com.factset.sdk.RecommendationListAPIforDigitalPortals.api;

import com.factset.sdk.RecommendationListAPIforDigitalPortals.ApiException;
import com.factset.sdk.RecommendationListAPIforDigitalPortals.ApiClient;
import com.factset.sdk.RecommendationListAPIforDigitalPortals.ApiResponse;
import com.factset.sdk.RecommendationListAPIforDigitalPortals.Configuration;
import com.factset.sdk.RecommendationListAPIforDigitalPortals.Pair;

import javax.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import java.math.BigDecimal;
import com.factset.sdk.RecommendationListAPIforDigitalPortals.models.InlineObject;
import com.factset.sdk.RecommendationListAPIforDigitalPortals.models.InlineResponse200;
import com.factset.sdk.RecommendationListAPIforDigitalPortals.models.InlineResponse2001;
import com.factset.sdk.RecommendationListAPIforDigitalPortals.models.InlineResponse2002;
import com.factset.sdk.RecommendationListAPIforDigitalPortals.models.InlineResponse2003;
import com.factset.sdk.RecommendationListAPIforDigitalPortals.models.InlineResponse2004;
import com.factset.sdk.RecommendationListAPIforDigitalPortals.models.InlineResponse2005;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RecommendationListApi {
  private ApiClient apiClient;

  public RecommendationListApi() {
    this(Configuration.getDefaultApiClient());
  }

  public RecommendationListApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

    private static final Map<Integer, GenericType> getRecommendationListGetResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getRecommendationListGetResponseTypeMap.put(200, new GenericType<InlineResponse200>(){});
  }
  private static final Map<Integer, GenericType> getRecommendationListRevisionElementListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getRecommendationListRevisionElementListResponseTypeMap.put(200, new GenericType<InlineResponse2005>(){});
  }
  private static final Map<Integer, GenericType> getRecommendationListRevisionGetResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getRecommendationListRevisionGetResponseTypeMap.put(200, new GenericType<InlineResponse2002>(){});
  }
  private static final Map<Integer, GenericType> getRecommendationListRevisionSearchResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getRecommendationListRevisionSearchResponseTypeMap.put(200, new GenericType<InlineResponse2004>(){});
  }
  private static final Map<Integer, GenericType> getRecommendationListSearchResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getRecommendationListSearchResponseTypeMap.put(200, new GenericType<InlineResponse2001>(){});
  }
  private static final Map<Integer, GenericType> postRecommendationListRevisionListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    postRecommendationListRevisionListResponseTypeMap.put(200, new GenericType<InlineResponse2003>(){});
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
   * Attributes of a single list.
   * Attributes of a single list, including data about its active revision.
   * @param id Identifier of the list. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language ISO 639-1 code of the language. (optional)
   * @return InlineResponse200
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse200 getRecommendationListGet(BigDecimal id, java.util.Set<String> attributes, String language) throws ApiException {
    return getRecommendationListGetWithHttpInfo(id, attributes, language).getData();
  }

  /**
   * Attributes of a single list.
   * Attributes of a single list, including data about its active revision.
   * @param id Identifier of the list. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language ISO 639-1 code of the language. (optional)
   * @return ApiResponse&lt;InlineResponse200&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse200> getRecommendationListGetWithHttpInfo(BigDecimal id, java.util.Set<String> attributes, String language) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getRecommendationListGet");
    }
    
    // create path and map variables
    String localVarPath = "/recommendationList/get";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "id", id));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "_attributes", attributes));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_language", language));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        InlineResponse200
      
    > apiResponse = apiClient.invokeAPI("RecommendationListApi.getRecommendationListGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getRecommendationListGetResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * List of elements of a given revision.
   * List of elements of a given revision.
   * @param idRevision Identifier of the revision. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language ISO 639-1 code of the language. (optional)
   * @return InlineResponse2005
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse2005 getRecommendationListRevisionElementList(BigDecimal idRevision, java.util.Set<String> attributes, String language) throws ApiException {
    return getRecommendationListRevisionElementListWithHttpInfo(idRevision, attributes, language).getData();
  }

  /**
   * List of elements of a given revision.
   * List of elements of a given revision.
   * @param idRevision Identifier of the revision. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language ISO 639-1 code of the language. (optional)
   * @return ApiResponse&lt;InlineResponse2005&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse2005> getRecommendationListRevisionElementListWithHttpInfo(BigDecimal idRevision, java.util.Set<String> attributes, String language) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'idRevision' is set
    if (idRevision == null) {
      throw new ApiException(400, "Missing the required parameter 'idRevision' when calling getRecommendationListRevisionElementList");
    }
    
    // create path and map variables
    String localVarPath = "/recommendationList/revision/element/list";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "idRevision", idRevision));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "_attributes", attributes));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_language", language));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        InlineResponse2005
      
    > apiResponse = apiClient.invokeAPI("RecommendationListApi.getRecommendationListRevisionElementList", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getRecommendationListRevisionElementListResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Attributes of a single revision.
   * Attributes of a single revision.
   * @param id Identifier of the revision. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language ISO 639-1 code of the language. (optional)
   * @return InlineResponse2002
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse2002 getRecommendationListRevisionGet(BigDecimal id, java.util.Set<String> attributes, String language) throws ApiException {
    return getRecommendationListRevisionGetWithHttpInfo(id, attributes, language).getData();
  }

  /**
   * Attributes of a single revision.
   * Attributes of a single revision.
   * @param id Identifier of the revision. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language ISO 639-1 code of the language. (optional)
   * @return ApiResponse&lt;InlineResponse2002&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse2002> getRecommendationListRevisionGetWithHttpInfo(BigDecimal id, java.util.Set<String> attributes, String language) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getRecommendationListRevisionGet");
    }
    
    // create path and map variables
    String localVarPath = "/recommendationList/revision/get";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "id", id));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "_attributes", attributes));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_language", language));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        InlineResponse2002
      
    > apiResponse = apiClient.invokeAPI("RecommendationListApi.getRecommendationListRevisionGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getRecommendationListRevisionGetResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Search for revisions of a recommendation list.
   * Search for revisions of a recommendation list.
   * @param idNotation Restrict the search to revisions containing an element associated with the identified notation. (optional)
   * @param idInstrument Restrict the search to revisions pointing to the identified instrument. (optional)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language ISO 639-1 code of the language. (optional)
   * @return InlineResponse2004
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse2004 getRecommendationListRevisionSearch(String idNotation, String idInstrument, java.util.Set<String> attributes, String language) throws ApiException {
    return getRecommendationListRevisionSearchWithHttpInfo(idNotation, idInstrument, attributes, language).getData();
  }

  /**
   * Search for revisions of a recommendation list.
   * Search for revisions of a recommendation list.
   * @param idNotation Restrict the search to revisions containing an element associated with the identified notation. (optional)
   * @param idInstrument Restrict the search to revisions pointing to the identified instrument. (optional)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language ISO 639-1 code of the language. (optional)
   * @return ApiResponse&lt;InlineResponse2004&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse2004> getRecommendationListRevisionSearchWithHttpInfo(String idNotation, String idInstrument, java.util.Set<String> attributes, String language) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/recommendationList/revision/search";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "idNotation", idNotation));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "idInstrument", idInstrument));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "_attributes", attributes));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_language", language));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        InlineResponse2004
      
    > apiResponse = apiClient.invokeAPI("RecommendationListApi.getRecommendationListRevisionSearch", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getRecommendationListRevisionSearchResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Search for recommendation lists.
   * Search for recommendation lists, delivering an array of recommendation lists matching the specified filter criteria. The data provided for each recommendation list includes the currently active revision (or null in case no active revision exists).
   * @param name Restricts the search to recommendation lists, which contain the provided string in their name attribute. The filter is a case-insensitive substring match. (optional)
   * @param onlyActive Restrict the search to recommendation lists, which are currently active (e.g., current date is before the recommendation list&#39;s activeRange.end date). If set to false, recommendation lists will be returned regardless of their state. (optional)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language ISO 639-1 code of the language. (optional)
   * @return InlineResponse2001
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse2001 getRecommendationListSearch(String name, Boolean onlyActive, java.util.Set<String> attributes, String language) throws ApiException {
    return getRecommendationListSearchWithHttpInfo(name, onlyActive, attributes, language).getData();
  }

  /**
   * Search for recommendation lists.
   * Search for recommendation lists, delivering an array of recommendation lists matching the specified filter criteria. The data provided for each recommendation list includes the currently active revision (or null in case no active revision exists).
   * @param name Restricts the search to recommendation lists, which contain the provided string in their name attribute. The filter is a case-insensitive substring match. (optional)
   * @param onlyActive Restrict the search to recommendation lists, which are currently active (e.g., current date is before the recommendation list&#39;s activeRange.end date). If set to false, recommendation lists will be returned regardless of their state. (optional)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language ISO 639-1 code of the language. (optional)
   * @return ApiResponse&lt;InlineResponse2001&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse2001> getRecommendationListSearchWithHttpInfo(String name, Boolean onlyActive, java.util.Set<String> attributes, String language) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/recommendationList/search";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "name", name));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "onlyActive", onlyActive));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "_attributes", attributes));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_language", language));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        InlineResponse2001
      
    > apiResponse = apiClient.invokeAPI("RecommendationListApi.getRecommendationListSearch", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getRecommendationListSearchResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * List of revisions of a recommendation list.
   * List of revisions of a recommendation list, excluding the elements of each revision.
   * @param body  (required)
   * @return InlineResponse2003
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse2003 postRecommendationListRevisionList(InlineObject body) throws ApiException {
    return postRecommendationListRevisionListWithHttpInfo(body).getData();
  }

  /**
   * List of revisions of a recommendation list.
   * List of revisions of a recommendation list, excluding the elements of each revision.
   * @param body  (required)
   * @return ApiResponse&lt;InlineResponse2003&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse2003> postRecommendationListRevisionListWithHttpInfo(InlineObject body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling postRecommendationListRevisionList");
    }
    
    // create path and map variables
    String localVarPath = "/recommendationList/revision/list";

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
        
        InlineResponse2003
      
    > apiResponse = apiClient.invokeAPI("RecommendationListApi.postRecommendationListRevisionList", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, postRecommendationListRevisionListResponseTypeMap, false);

    return apiResponse;

  }
}
