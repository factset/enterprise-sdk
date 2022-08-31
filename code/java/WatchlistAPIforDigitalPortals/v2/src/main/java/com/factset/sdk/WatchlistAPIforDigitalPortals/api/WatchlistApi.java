package com.factset.sdk.WatchlistAPIforDigitalPortals.api;

import com.factset.sdk.WatchlistAPIforDigitalPortals.ApiException;
import com.factset.sdk.WatchlistAPIforDigitalPortals.ApiClient;
import com.factset.sdk.WatchlistAPIforDigitalPortals.ApiResponse;
import com.factset.sdk.WatchlistAPIforDigitalPortals.Configuration;
import com.factset.sdk.WatchlistAPIforDigitalPortals.Pair;

import javax.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.WatchlistAPIforDigitalPortals.models.InlineObject;
import com.factset.sdk.WatchlistAPIforDigitalPortals.models.InlineObject1;
import com.factset.sdk.WatchlistAPIforDigitalPortals.models.InlineObject2;
import com.factset.sdk.WatchlistAPIforDigitalPortals.models.InlineObject3;
import com.factset.sdk.WatchlistAPIforDigitalPortals.models.InlineObject4;
import com.factset.sdk.WatchlistAPIforDigitalPortals.models.InlineObject5;
import com.factset.sdk.WatchlistAPIforDigitalPortals.models.InlineObject6;
import com.factset.sdk.WatchlistAPIforDigitalPortals.models.InlineResponse200;
import com.factset.sdk.WatchlistAPIforDigitalPortals.models.InlineResponse2001;
import com.factset.sdk.WatchlistAPIforDigitalPortals.models.InlineResponse2002;
import com.factset.sdk.WatchlistAPIforDigitalPortals.models.InlineResponse2003;
import com.factset.sdk.WatchlistAPIforDigitalPortals.models.InlineResponse2004;
import com.factset.sdk.WatchlistAPIforDigitalPortals.models.InlineResponse2005;
import com.factset.sdk.WatchlistAPIforDigitalPortals.models.InlineResponse201;
import com.factset.sdk.WatchlistAPIforDigitalPortals.models.InlineResponse2011;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class WatchlistApi {
  private ApiClient apiClient;

  public WatchlistApi() {
    this(Configuration.getDefaultApiClient());
  }

  public WatchlistApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

    private static final Map<Integer, GenericType> getWatchlistGetResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getWatchlistGetResponseTypeMap.put(200, new GenericType<InlineResponse2001>(){});
  }
  private static final Map<Integer, GenericType> getWatchlistListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getWatchlistListResponseTypeMap.put(200, new GenericType<InlineResponse2002>(){});
  }
  private static final Map<Integer, GenericType> getWatchlistPositionListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getWatchlistPositionListResponseTypeMap.put(200, new GenericType<InlineResponse2005>(){});
  }
  private static final Map<Integer, GenericType> postWatchlistCreateResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    postWatchlistCreateResponseTypeMap.put(201, new GenericType<InlineResponse201>(){});
  }
  private static final Map<Integer, GenericType> postWatchlistDeleteResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    postWatchlistDeleteResponseTypeMap.put(200, new GenericType<InlineResponse200>(){});
  }
  private static final Map<Integer, GenericType> postWatchlistModifyResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    postWatchlistModifyResponseTypeMap.put(200, new GenericType<InlineResponse2003>(){});
  }
  private static final Map<Integer, GenericType> postWatchlistPositionCreateResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    postWatchlistPositionCreateResponseTypeMap.put(201, new GenericType<InlineResponse2011>(){});
  }
  private static final Map<Integer, GenericType> postWatchlistPositionDeleteResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    postWatchlistPositionDeleteResponseTypeMap.put(200, new GenericType<InlineResponse2003>(){});
  }
  private static final Map<Integer, GenericType> postWatchlistPositionGetResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    postWatchlistPositionGetResponseTypeMap.put(200, new GenericType<InlineResponse2004>(){});
  }
  private static final Map<Integer, GenericType> postWatchlistPositionModifyResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    postWatchlistPositionModifyResponseTypeMap.put(200, new GenericType<InlineResponse2003>(){});
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
   * Details of a watchlist.
   * Details of a watchlist.
   * @param id  (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @return InlineResponse2001
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse2001 getWatchlistGet(String id, java.util.Set<String> attributes) throws ApiException {
    return getWatchlistGetWithHttpInfo(id, attributes).getData();
  }

  /**
   * Details of a watchlist.
   * Details of a watchlist.
   * @param id  (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @return ApiResponse&lt;InlineResponse2001&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse2001> getWatchlistGetWithHttpInfo(String id, java.util.Set<String> attributes) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getWatchlistGet");
    }
    
    // create path and map variables
    String localVarPath = "/watchlist/get";

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


    ApiResponse<
        
        InlineResponse2001
      
    > apiResponse = apiClient.invokeAPI("WatchlistApi.getWatchlistGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getWatchlistGetResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * List of watchlists.
   * List of watchlists.
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param sort Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 4 (possibly prefixed) attribute name(s) is allowed. (optional, default to [\&quot;name\&quot;])
   * @return InlineResponse2002
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse2002 getWatchlistList(java.util.Set<String> attributes, java.util.Set<String> sort) throws ApiException {
    return getWatchlistListWithHttpInfo(attributes, sort).getData();
  }

  /**
   * List of watchlists.
   * List of watchlists.
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param sort Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 4 (possibly prefixed) attribute name(s) is allowed. (optional, default to [\&quot;name\&quot;])
   * @return ApiResponse&lt;InlineResponse2002&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse2002> getWatchlistListWithHttpInfo(java.util.Set<String> attributes, java.util.Set<String> sort) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/watchlist/list";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "_attributes", attributes));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "_sort", sort));

    
    
    
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
      
    > apiResponse = apiClient.invokeAPI("WatchlistApi.getWatchlistList", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getWatchlistListResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * List of positions of a watchlist.
   * List of positions of a watchlist.
   * @param id  (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param sort Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 2 (possibly prefixed) attribute name(s) is allowed. (optional, default to [\&quot;id\&quot;])
   * @return InlineResponse2005
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse2005 getWatchlistPositionList(String id, java.util.Set<String> attributes, java.util.Set<String> sort) throws ApiException {
    return getWatchlistPositionListWithHttpInfo(id, attributes, sort).getData();
  }

  /**
   * List of positions of a watchlist.
   * List of positions of a watchlist.
   * @param id  (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param sort Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 2 (possibly prefixed) attribute name(s) is allowed. (optional, default to [\&quot;id\&quot;])
   * @return ApiResponse&lt;InlineResponse2005&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse2005> getWatchlistPositionListWithHttpInfo(String id, java.util.Set<String> attributes, java.util.Set<String> sort) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getWatchlistPositionList");
    }
    
    // create path and map variables
    String localVarPath = "/watchlist/position/list";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "id", id));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "_attributes", attributes));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "_sort", sort));

    
    
    
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
      
    > apiResponse = apiClient.invokeAPI("WatchlistApi.getWatchlistPositionList", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getWatchlistPositionListResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Create a watchlist.
   * Create a watchlist.  Certain error conditions yield errors as follows:   |Error Condition|HTTP Error| |-------|--------| |The number of watchlists would exceed 100.|400 Bad Request|
   * @param inlineObject  (optional)
   * @return InlineResponse201
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse201 postWatchlistCreate(InlineObject inlineObject) throws ApiException {
    return postWatchlistCreateWithHttpInfo(inlineObject).getData();
  }

  /**
   * Create a watchlist.
   * Create a watchlist.  Certain error conditions yield errors as follows:   |Error Condition|HTTP Error| |-------|--------| |The number of watchlists would exceed 100.|400 Bad Request|
   * @param inlineObject  (optional)
   * @return ApiResponse&lt;InlineResponse201&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse201> postWatchlistCreateWithHttpInfo(InlineObject inlineObject) throws ApiException {
    Object localVarPostBody = inlineObject;
    
    // create path and map variables
    String localVarPath = "/watchlist/create";

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
        
        InlineResponse201
      
    > apiResponse = apiClient.invokeAPI("WatchlistApi.postWatchlistCreate", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, postWatchlistCreateResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Delete a watchlist.
   * Delete a watchlist.
   * @param inlineObject1  (optional)
   * @return InlineResponse200
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse200 postWatchlistDelete(InlineObject1 inlineObject1) throws ApiException {
    return postWatchlistDeleteWithHttpInfo(inlineObject1).getData();
  }

  /**
   * Delete a watchlist.
   * Delete a watchlist.
   * @param inlineObject1  (optional)
   * @return ApiResponse&lt;InlineResponse200&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse200> postWatchlistDeleteWithHttpInfo(InlineObject1 inlineObject1) throws ApiException {
    Object localVarPostBody = inlineObject1;
    
    // create path and map variables
    String localVarPath = "/watchlist/delete";

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
        
        InlineResponse200
      
    > apiResponse = apiClient.invokeAPI("WatchlistApi.postWatchlistDelete", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, postWatchlistDeleteResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Modify a watchlist.
   * Modify a watchlist.
   * @param inlineObject2  (optional)
   * @return InlineResponse2003
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse2003 postWatchlistModify(InlineObject2 inlineObject2) throws ApiException {
    return postWatchlistModifyWithHttpInfo(inlineObject2).getData();
  }

  /**
   * Modify a watchlist.
   * Modify a watchlist.
   * @param inlineObject2  (optional)
   * @return ApiResponse&lt;InlineResponse2003&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse2003> postWatchlistModifyWithHttpInfo(InlineObject2 inlineObject2) throws ApiException {
    Object localVarPostBody = inlineObject2;
    
    // create path and map variables
    String localVarPath = "/watchlist/modify";

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
      
    > apiResponse = apiClient.invokeAPI("WatchlistApi.postWatchlistModify", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, postWatchlistModifyResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Add a position to a watchlist.
   * Add a position to a watchlist.  Certain error conditions yield errors as follows:   |Error Condition|HTTP Error| |-------|--------| |Maximum number of watchlist positions would exceed 100.|400 Bad Request| |The watchlist does not exist.|400 Bad Request| |The notation already exists in the watchlist.|400 Bad Request|
   * @param inlineObject3  (optional)
   * @return InlineResponse2011
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse2011 postWatchlistPositionCreate(InlineObject3 inlineObject3) throws ApiException {
    return postWatchlistPositionCreateWithHttpInfo(inlineObject3).getData();
  }

  /**
   * Add a position to a watchlist.
   * Add a position to a watchlist.  Certain error conditions yield errors as follows:   |Error Condition|HTTP Error| |-------|--------| |Maximum number of watchlist positions would exceed 100.|400 Bad Request| |The watchlist does not exist.|400 Bad Request| |The notation already exists in the watchlist.|400 Bad Request|
   * @param inlineObject3  (optional)
   * @return ApiResponse&lt;InlineResponse2011&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse2011> postWatchlistPositionCreateWithHttpInfo(InlineObject3 inlineObject3) throws ApiException {
    Object localVarPostBody = inlineObject3;
    
    // create path and map variables
    String localVarPath = "/watchlist/position/create";

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
        
        InlineResponse2011
      
    > apiResponse = apiClient.invokeAPI("WatchlistApi.postWatchlistPositionCreate", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, postWatchlistPositionCreateResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Delete a position of a watchlist.
   * Delete a position of a watchlist.
   * @param inlineObject4  (optional)
   * @return InlineResponse2003
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse2003 postWatchlistPositionDelete(InlineObject4 inlineObject4) throws ApiException {
    return postWatchlistPositionDeleteWithHttpInfo(inlineObject4).getData();
  }

  /**
   * Delete a position of a watchlist.
   * Delete a position of a watchlist.
   * @param inlineObject4  (optional)
   * @return ApiResponse&lt;InlineResponse2003&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse2003> postWatchlistPositionDeleteWithHttpInfo(InlineObject4 inlineObject4) throws ApiException {
    Object localVarPostBody = inlineObject4;
    
    // create path and map variables
    String localVarPath = "/watchlist/position/delete";

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
      
    > apiResponse = apiClient.invokeAPI("WatchlistApi.postWatchlistPositionDelete", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, postWatchlistPositionDeleteResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Details of the position of a watchlist.
   * Details of the position of a watchlist.
   * @param inlineObject5  (optional)
   * @return InlineResponse2004
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse2004 postWatchlistPositionGet(InlineObject5 inlineObject5) throws ApiException {
    return postWatchlistPositionGetWithHttpInfo(inlineObject5).getData();
  }

  /**
   * Details of the position of a watchlist.
   * Details of the position of a watchlist.
   * @param inlineObject5  (optional)
   * @return ApiResponse&lt;InlineResponse2004&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse2004> postWatchlistPositionGetWithHttpInfo(InlineObject5 inlineObject5) throws ApiException {
    Object localVarPostBody = inlineObject5;
    
    // create path and map variables
    String localVarPath = "/watchlist/position/get";

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
        
        InlineResponse2004
      
    > apiResponse = apiClient.invokeAPI("WatchlistApi.postWatchlistPositionGet", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, postWatchlistPositionGetResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Modify a position in a watchlist.
   * Modify a position in a watchlist.  Certain error conditions yield errors as follows:   |Error Condition|HTTP Error| |-------|--------| |At least one of the parameters &#x60;notation&#x60; or &#x60;comment&#x60; must be set.|400 Bad Request| |The notation already exists in the watchlist.|400 Bad Request|
   * @param inlineObject6  (optional)
   * @return InlineResponse2003
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse2003 postWatchlistPositionModify(InlineObject6 inlineObject6) throws ApiException {
    return postWatchlistPositionModifyWithHttpInfo(inlineObject6).getData();
  }

  /**
   * Modify a position in a watchlist.
   * Modify a position in a watchlist.  Certain error conditions yield errors as follows:   |Error Condition|HTTP Error| |-------|--------| |At least one of the parameters &#x60;notation&#x60; or &#x60;comment&#x60; must be set.|400 Bad Request| |The notation already exists in the watchlist.|400 Bad Request|
   * @param inlineObject6  (optional)
   * @return ApiResponse&lt;InlineResponse2003&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse2003> postWatchlistPositionModifyWithHttpInfo(InlineObject6 inlineObject6) throws ApiException {
    Object localVarPostBody = inlineObject6;
    
    // create path and map variables
    String localVarPath = "/watchlist/position/modify";

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
      
    > apiResponse = apiClient.invokeAPI("WatchlistApi.postWatchlistPositionModify", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, postWatchlistPositionModifyResponseTypeMap, false);

    return apiResponse;

  }
}
