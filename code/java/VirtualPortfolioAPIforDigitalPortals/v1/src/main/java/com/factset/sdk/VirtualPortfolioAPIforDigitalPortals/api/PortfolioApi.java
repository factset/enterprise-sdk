package com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.api;

import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.ApiException;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.ApiClient;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.ApiResponse;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.Configuration;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.Pair;

import javax.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.models.InlineObject;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.models.InlineObject1;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.models.InlineObject2;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.models.InlineObject3;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.models.InlineObject4;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.models.InlineObject5;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.models.InlineObject6;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.models.InlineObject7;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.models.InlineObject8;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.models.InlineResponse200;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.models.InlineResponse2001;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.models.InlineResponse2002;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.models.InlineResponse2003;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.models.InlineResponse2004;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.models.InlineResponse2005;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.models.InlineResponse2006;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.models.InlineResponse2007;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.models.InlineResponse2008;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.models.InlineResponse2009;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.models.InlineResponse201;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.models.InlineResponse2011;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PortfolioApi {
  private ApiClient apiClient;

  public PortfolioApi() {
    this(Configuration.getDefaultApiClient());
  }

  public PortfolioApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

    private static final Map<Integer, GenericType> portfolioCreatePostResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    portfolioCreatePostResponseTypeMap.put(201, new GenericType<InlineResponse201>(){});
  }
  private static final Map<Integer, GenericType> portfolioDeletePostResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    portfolioDeletePostResponseTypeMap.put(200, new GenericType<InlineResponse200>(){});
  }
  private static final Map<Integer, GenericType> portfolioEvaluationListPostResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    portfolioEvaluationListPostResponseTypeMap.put(200, new GenericType<InlineResponse2004>(){});
  }
  private static final Map<Integer, GenericType> portfolioGetGetResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    portfolioGetGetResponseTypeMap.put(200, new GenericType<InlineResponse2001>(){});
  }
  private static final Map<Integer, GenericType> portfolioListGetResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    portfolioListGetResponseTypeMap.put(200, new GenericType<InlineResponse2002>(){});
  }
  private static final Map<Integer, GenericType> portfolioModifyPostResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    portfolioModifyPostResponseTypeMap.put(200, new GenericType<InlineResponse2003>(){});
  }
  private static final Map<Integer, GenericType> portfolioNameListGetResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    portfolioNameListGetResponseTypeMap.put(200, new GenericType<InlineResponse2005>(){});
  }
  private static final Map<Integer, GenericType> portfolioPositionListGetResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    portfolioPositionListGetResponseTypeMap.put(200, new GenericType<InlineResponse2006>(){});
  }
  private static final Map<Integer, GenericType> portfolioTransactionCashCreatePostResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    portfolioTransactionCashCreatePostResponseTypeMap.put(200, new GenericType<InlineResponse2011>(){});
  }
  private static final Map<Integer, GenericType> portfolioTransactionCashDeletePostResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    portfolioTransactionCashDeletePostResponseTypeMap.put(200, new GenericType<InlineResponse2007>(){});
  }
  private static final Map<Integer, GenericType> portfolioTransactionCreatePostResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    portfolioTransactionCreatePostResponseTypeMap.put(201, new GenericType<InlineResponse2011>(){});
  }
  private static final Map<Integer, GenericType> portfolioTransactionDeletePostResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    portfolioTransactionDeletePostResponseTypeMap.put(200, new GenericType<InlineResponse2007>(){});
  }
  private static final Map<Integer, GenericType> portfolioTransactionListGetResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    portfolioTransactionListGetResponseTypeMap.put(200, new GenericType<InlineResponse2008>(){});
  }
  private static final Map<Integer, GenericType> portfolioTransactionModifyPostResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    portfolioTransactionModifyPostResponseTypeMap.put(200, new GenericType<InlineResponse2009>(){});
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
   * Create a portfolio.
   * Create a portfolio.  Certain error conditions yield errors as follows:   |Error Condition|HTTP Error| |-------|--------| |The number of portfolios would exceed 100.|400 Bad Request|
   * @param body  (required)
   * @return InlineResponse201
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse201 portfolioCreatePost(InlineObject body) throws ApiException {
    return portfolioCreatePostWithHttpInfo(body).getData();
  }

  /**
   * Create a portfolio.
   * Create a portfolio.  Certain error conditions yield errors as follows:   |Error Condition|HTTP Error| |-------|--------| |The number of portfolios would exceed 100.|400 Bad Request|
   * @param body  (required)
   * @return ApiResponse&lt;InlineResponse201&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse201> portfolioCreatePostWithHttpInfo(InlineObject body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling portfolioCreatePost");
    }
    
    // create path and map variables
    String localVarPath = "/portfolio/create";

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
      
    > apiResponse = apiClient.invokeAPI("PortfolioApi.portfolioCreatePost", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, portfolioCreatePostResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Delete a portfolio.
   * Delete a portfolio.
   * @param body  (optional)
   * @return InlineResponse200
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse200 portfolioDeletePost(InlineObject1 body) throws ApiException {
    return portfolioDeletePostWithHttpInfo(body).getData();
  }

  /**
   * Delete a portfolio.
   * Delete a portfolio.
   * @param body  (optional)
   * @return ApiResponse&lt;InlineResponse200&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse200> portfolioDeletePostWithHttpInfo(InlineObject1 body) throws ApiException {
    Object localVarPostBody = body;
    
    // create path and map variables
    String localVarPath = "/portfolio/delete";

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
      
    > apiResponse = apiClient.invokeAPI("PortfolioApi.portfolioDeletePost", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, portfolioDeletePostResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Evaluate a portfolio.
   * Performs an evaluation over a period of time and returns portfolio key figures for each day, week, or month.
   * @param body  (optional)
   * @return InlineResponse2004
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse2004 portfolioEvaluationListPost(InlineObject3 body) throws ApiException {
    return portfolioEvaluationListPostWithHttpInfo(body).getData();
  }

  /**
   * Evaluate a portfolio.
   * Performs an evaluation over a period of time and returns portfolio key figures for each day, week, or month.
   * @param body  (optional)
   * @return ApiResponse&lt;InlineResponse2004&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse2004> portfolioEvaluationListPostWithHttpInfo(InlineObject3 body) throws ApiException {
    Object localVarPostBody = body;
    
    // create path and map variables
    String localVarPath = "/portfolio/evaluation/list";

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
      
    > apiResponse = apiClient.invokeAPI("PortfolioApi.portfolioEvaluationListPost", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, portfolioEvaluationListPostResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Details of a portfolio.
   * Details of a portfolio.
   * @param id Identifier of the portfolio. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @return InlineResponse2001
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse2001 portfolioGetGet(String id, java.util.Set<String> attributes) throws ApiException {
    return portfolioGetGetWithHttpInfo(id, attributes).getData();
  }

  /**
   * Details of a portfolio.
   * Details of a portfolio.
   * @param id Identifier of the portfolio. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @return ApiResponse&lt;InlineResponse2001&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse2001> portfolioGetGetWithHttpInfo(String id, java.util.Set<String> attributes) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling portfolioGetGet");
    }
    
    // create path and map variables
    String localVarPath = "/portfolio/get";

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
      
    > apiResponse = apiClient.invokeAPI("PortfolioApi.portfolioGetGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, portfolioGetGetResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * List of portfolios with keyfigures.
   * List of portfolios with keyfigures.
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param sort Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 2 (possibly prefixed) attribute name(s) is allowed. (optional, default to [\&quot;name\&quot;])
   * @return InlineResponse2002
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse2002 portfolioListGet(java.util.Set<String> attributes, java.util.Set<String> sort) throws ApiException {
    return portfolioListGetWithHttpInfo(attributes, sort).getData();
  }

  /**
   * List of portfolios with keyfigures.
   * List of portfolios with keyfigures.
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param sort Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 2 (possibly prefixed) attribute name(s) is allowed. (optional, default to [\&quot;name\&quot;])
   * @return ApiResponse&lt;InlineResponse2002&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse2002> portfolioListGetWithHttpInfo(java.util.Set<String> attributes, java.util.Set<String> sort) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/portfolio/list";

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
      
    > apiResponse = apiClient.invokeAPI("PortfolioApi.portfolioListGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, portfolioListGetResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Modify a portfolio.
   * Modify a portfolio.
   * @param body  (optional)
   * @return InlineResponse2003
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse2003 portfolioModifyPost(InlineObject2 body) throws ApiException {
    return portfolioModifyPostWithHttpInfo(body).getData();
  }

  /**
   * Modify a portfolio.
   * Modify a portfolio.
   * @param body  (optional)
   * @return ApiResponse&lt;InlineResponse2003&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse2003> portfolioModifyPostWithHttpInfo(InlineObject2 body) throws ApiException {
    Object localVarPostBody = body;
    
    // create path and map variables
    String localVarPath = "/portfolio/modify";

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
      
    > apiResponse = apiClient.invokeAPI("PortfolioApi.portfolioModifyPost", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, portfolioModifyPostResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * List of portfolios.
   * List of portfolios.
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param sort Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 2 (possibly prefixed) attribute name(s) is allowed. (optional, default to [\&quot;name\&quot;])
   * @return InlineResponse2005
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse2005 portfolioNameListGet(java.util.Set<String> attributes, java.util.Set<String> sort) throws ApiException {
    return portfolioNameListGetWithHttpInfo(attributes, sort).getData();
  }

  /**
   * List of portfolios.
   * List of portfolios.
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param sort Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 2 (possibly prefixed) attribute name(s) is allowed. (optional, default to [\&quot;name\&quot;])
   * @return ApiResponse&lt;InlineResponse2005&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse2005> portfolioNameListGetWithHttpInfo(java.util.Set<String> attributes, java.util.Set<String> sort) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/portfolio/name/list";

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
        
        InlineResponse2005
      
    > apiResponse = apiClient.invokeAPI("PortfolioApi.portfolioNameListGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, portfolioNameListGetResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * List all positions of a portfolio.
   * List all positions of a portfolio.
   * @param id Identifier of the portfolio. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @return InlineResponse2006
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse2006 portfolioPositionListGet(String id, java.util.Set<String> attributes) throws ApiException {
    return portfolioPositionListGetWithHttpInfo(id, attributes).getData();
  }

  /**
   * List all positions of a portfolio.
   * List all positions of a portfolio.
   * @param id Identifier of the portfolio. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @return ApiResponse&lt;InlineResponse2006&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse2006> portfolioPositionListGetWithHttpInfo(String id, java.util.Set<String> attributes) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling portfolioPositionListGet");
    }
    
    // create path and map variables
    String localVarPath = "/portfolio/position/list";

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
        
        InlineResponse2006
      
    > apiResponse = apiClient.invokeAPI("PortfolioApi.portfolioPositionListGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, portfolioPositionListGetResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Add a cash transaction to a portfolio.
   * Add a cash transaction to a portfolio.  Certain error conditions yield errors as follows:   |Error Condition|HTTP Error| |-------|--------| |The number of transactions would exceed 1000.|400 Bad Request|
   * @param body  (optional)
   * @return InlineResponse2011
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse2011 portfolioTransactionCashCreatePost(InlineObject7 body) throws ApiException {
    return portfolioTransactionCashCreatePostWithHttpInfo(body).getData();
  }

  /**
   * Add a cash transaction to a portfolio.
   * Add a cash transaction to a portfolio.  Certain error conditions yield errors as follows:   |Error Condition|HTTP Error| |-------|--------| |The number of transactions would exceed 1000.|400 Bad Request|
   * @param body  (optional)
   * @return ApiResponse&lt;InlineResponse2011&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse2011> portfolioTransactionCashCreatePostWithHttpInfo(InlineObject7 body) throws ApiException {
    Object localVarPostBody = body;
    
    // create path and map variables
    String localVarPath = "/portfolio/transaction/cash/create";

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
      
    > apiResponse = apiClient.invokeAPI("PortfolioApi.portfolioTransactionCashCreatePost", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, portfolioTransactionCashCreatePostResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Delete a cash transaction.
   * Delete a cash transaction.
   * @param body  (optional)
   * @return InlineResponse2007
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse2007 portfolioTransactionCashDeletePost(InlineObject8 body) throws ApiException {
    return portfolioTransactionCashDeletePostWithHttpInfo(body).getData();
  }

  /**
   * Delete a cash transaction.
   * Delete a cash transaction.
   * @param body  (optional)
   * @return ApiResponse&lt;InlineResponse2007&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse2007> portfolioTransactionCashDeletePostWithHttpInfo(InlineObject8 body) throws ApiException {
    Object localVarPostBody = body;
    
    // create path and map variables
    String localVarPath = "/portfolio/transaction/cash/delete";

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
        
        InlineResponse2007
      
    > apiResponse = apiClient.invokeAPI("PortfolioApi.portfolioTransactionCashDeletePost", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, portfolioTransactionCashDeletePostResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Add a transaction to a portfolio.
   * Add a transaction to a portfolio.  Certain error conditions yield errors as follows:   |Error Condition|HTTP Error| |-------|--------| |The number of transactions would exceed 1000.|400 Bad Request|
   * @param body  (optional)
   * @return InlineResponse2011
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse2011 portfolioTransactionCreatePost(InlineObject4 body) throws ApiException {
    return portfolioTransactionCreatePostWithHttpInfo(body).getData();
  }

  /**
   * Add a transaction to a portfolio.
   * Add a transaction to a portfolio.  Certain error conditions yield errors as follows:   |Error Condition|HTTP Error| |-------|--------| |The number of transactions would exceed 1000.|400 Bad Request|
   * @param body  (optional)
   * @return ApiResponse&lt;InlineResponse2011&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse2011> portfolioTransactionCreatePostWithHttpInfo(InlineObject4 body) throws ApiException {
    Object localVarPostBody = body;
    
    // create path and map variables
    String localVarPath = "/portfolio/transaction/create";

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
      
    > apiResponse = apiClient.invokeAPI("PortfolioApi.portfolioTransactionCreatePost", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, portfolioTransactionCreatePostResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Delete a transaction of a portfolio.
   * Delete a transaction of a portfolio.
   * @param body  (optional)
   * @return InlineResponse2007
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse2007 portfolioTransactionDeletePost(InlineObject5 body) throws ApiException {
    return portfolioTransactionDeletePostWithHttpInfo(body).getData();
  }

  /**
   * Delete a transaction of a portfolio.
   * Delete a transaction of a portfolio.
   * @param body  (optional)
   * @return ApiResponse&lt;InlineResponse2007&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse2007> portfolioTransactionDeletePostWithHttpInfo(InlineObject5 body) throws ApiException {
    Object localVarPostBody = body;
    
    // create path and map variables
    String localVarPath = "/portfolio/transaction/delete";

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
        
        InlineResponse2007
      
    > apiResponse = apiClient.invokeAPI("PortfolioApi.portfolioTransactionDeletePost", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, portfolioTransactionDeletePostResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * List of transactions in a portfolio.
   * List of transactions in a portfolio.
   * @param id Identifier of the portfolio. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @return InlineResponse2008
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse2008 portfolioTransactionListGet(String id, java.util.Set<String> attributes) throws ApiException {
    return portfolioTransactionListGetWithHttpInfo(id, attributes).getData();
  }

  /**
   * List of transactions in a portfolio.
   * List of transactions in a portfolio.
   * @param id Identifier of the portfolio. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @return ApiResponse&lt;InlineResponse2008&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse2008> portfolioTransactionListGetWithHttpInfo(String id, java.util.Set<String> attributes) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling portfolioTransactionListGet");
    }
    
    // create path and map variables
    String localVarPath = "/portfolio/transaction/list";

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
        
        InlineResponse2008
      
    > apiResponse = apiClient.invokeAPI("PortfolioApi.portfolioTransactionListGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, portfolioTransactionListGetResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Modify a transaction in a portfolio.
   * Modify a transaction in a portfolio.  Certain error conditions yield errors as follows:   |Error Condition|HTTP Error| |-------|--------| |At least one of the parameters &#x60;numberShares&#x60;, &#x60;price&#x60;, &#x60;charges&#x60;, &#x60;exchangeRate&#x60; or &#x60;time&#x60; must be set.|400 Bad Request|
   * @param body  (optional)
   * @return InlineResponse2009
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse2009 portfolioTransactionModifyPost(InlineObject6 body) throws ApiException {
    return portfolioTransactionModifyPostWithHttpInfo(body).getData();
  }

  /**
   * Modify a transaction in a portfolio.
   * Modify a transaction in a portfolio.  Certain error conditions yield errors as follows:   |Error Condition|HTTP Error| |-------|--------| |At least one of the parameters &#x60;numberShares&#x60;, &#x60;price&#x60;, &#x60;charges&#x60;, &#x60;exchangeRate&#x60; or &#x60;time&#x60; must be set.|400 Bad Request|
   * @param body  (optional)
   * @return ApiResponse&lt;InlineResponse2009&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse2009> portfolioTransactionModifyPostWithHttpInfo(InlineObject6 body) throws ApiException {
    Object localVarPostBody = body;
    
    // create path and map variables
    String localVarPath = "/portfolio/transaction/modify";

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
        
        InlineResponse2009
      
    > apiResponse = apiClient.invokeAPI("PortfolioApi.portfolioTransactionModifyPost", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, portfolioTransactionModifyPostResponseTypeMap, false);

    return apiResponse;

  }
}
