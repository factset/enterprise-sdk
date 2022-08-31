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

import java.math.BigDecimal;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.models.InlineObject;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.models.InlineObject1;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.models.InlineObject10;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.models.InlineObject11;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.models.InlineObject12;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.models.InlineObject13;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.models.InlineObject2;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.models.InlineObject3;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.models.InlineObject4;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.models.InlineObject5;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.models.InlineObject6;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.models.InlineObject7;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.models.InlineObject8;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.models.InlineObject9;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.models.InlineResponse200;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.models.InlineResponse2001;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.models.InlineResponse20010;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.models.InlineResponse20011;
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
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.models.InlineResponse2012;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PortfolioApi {
  private ApiClient apiClient;

  public PortfolioApi() {
    this(Configuration.getDefaultApiClient());
  }

  public PortfolioApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

    private static final Map<Integer, GenericType> getPortfolioGetResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getPortfolioGetResponseTypeMap.put(200, new GenericType<InlineResponse2001>(){});
  }
  private static final Map<Integer, GenericType> getPortfolioListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getPortfolioListResponseTypeMap.put(200, new GenericType<InlineResponse2002>(){});
  }
  private static final Map<Integer, GenericType> getPortfolioNameListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getPortfolioNameListResponseTypeMap.put(200, new GenericType<InlineResponse2005>(){});
  }
  private static final Map<Integer, GenericType> getPortfolioPositionListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getPortfolioPositionListResponseTypeMap.put(200, new GenericType<InlineResponse2009>(){});
  }
  private static final Map<Integer, GenericType> getPortfolioTransactionListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getPortfolioTransactionListResponseTypeMap.put(200, new GenericType<InlineResponse20011>(){});
  }
  private static final Map<Integer, GenericType> postPortfolioCreateResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    postPortfolioCreateResponseTypeMap.put(201, new GenericType<InlineResponse201>(){});
  }
  private static final Map<Integer, GenericType> postPortfolioDeleteResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    postPortfolioDeleteResponseTypeMap.put(200, new GenericType<InlineResponse200>(){});
  }
  private static final Map<Integer, GenericType> postPortfolioEvaluationListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    postPortfolioEvaluationListResponseTypeMap.put(200, new GenericType<InlineResponse2004>(){});
  }
  private static final Map<Integer, GenericType> postPortfolioModifyResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    postPortfolioModifyResponseTypeMap.put(200, new GenericType<InlineResponse2003>(){});
  }
  private static final Map<Integer, GenericType> postPortfolioPayoutCreateResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    postPortfolioPayoutCreateResponseTypeMap.put(201, new GenericType<InlineResponse2011>(){});
  }
  private static final Map<Integer, GenericType> postPortfolioPayoutDeleteResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    postPortfolioPayoutDeleteResponseTypeMap.put(200, new GenericType<InlineResponse2006>(){});
  }
  private static final Map<Integer, GenericType> postPortfolioPayoutListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    postPortfolioPayoutListResponseTypeMap.put(200, new GenericType<InlineResponse2007>(){});
  }
  private static final Map<Integer, GenericType> postPortfolioPayoutModifyResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    postPortfolioPayoutModifyResponseTypeMap.put(200, new GenericType<InlineResponse2008>(){});
  }
  private static final Map<Integer, GenericType> postPortfolioPositionClosedListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    postPortfolioPositionClosedListResponseTypeMap.put(200, new GenericType<InlineResponse20010>(){});
  }
  private static final Map<Integer, GenericType> postPortfolioTransactionCashCreateResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    postPortfolioTransactionCashCreateResponseTypeMap.put(200, new GenericType<InlineResponse2012>(){});
  }
  private static final Map<Integer, GenericType> postPortfolioTransactionCashDeleteResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    postPortfolioTransactionCashDeleteResponseTypeMap.put(200, new GenericType<InlineResponse2006>(){});
  }
  private static final Map<Integer, GenericType> postPortfolioTransactionCreateResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    postPortfolioTransactionCreateResponseTypeMap.put(201, new GenericType<InlineResponse2012>(){});
  }
  private static final Map<Integer, GenericType> postPortfolioTransactionDeleteResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    postPortfolioTransactionDeleteResponseTypeMap.put(200, new GenericType<InlineResponse2006>(){});
  }
  private static final Map<Integer, GenericType> postPortfolioTransactionModifyResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    postPortfolioTransactionModifyResponseTypeMap.put(200, new GenericType<InlineResponse2008>(){});
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
   * Details of a portfolio.
   * Details of a portfolio.
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
  public InlineResponse2001 getPortfolioGet(String id, java.util.Set<String> attributes) throws ApiException {
    return getPortfolioGetWithHttpInfo(id, attributes).getData();
  }

  /**
   * Details of a portfolio.
   * Details of a portfolio.
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
  public ApiResponse<InlineResponse2001> getPortfolioGetWithHttpInfo(String id, java.util.Set<String> attributes) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getPortfolioGet");
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
      
    > apiResponse = apiClient.invokeAPI("PortfolioApi.getPortfolioGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getPortfolioGetResponseTypeMap, false);

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
  public InlineResponse2002 getPortfolioList(java.util.Set<String> attributes, java.util.Set<String> sort) throws ApiException {
    return getPortfolioListWithHttpInfo(attributes, sort).getData();
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
  public ApiResponse<InlineResponse2002> getPortfolioListWithHttpInfo(java.util.Set<String> attributes, java.util.Set<String> sort) throws ApiException {
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
      
    > apiResponse = apiClient.invokeAPI("PortfolioApi.getPortfolioList", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getPortfolioListResponseTypeMap, false);

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
  public InlineResponse2005 getPortfolioNameList(java.util.Set<String> attributes, java.util.Set<String> sort) throws ApiException {
    return getPortfolioNameListWithHttpInfo(attributes, sort).getData();
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
  public ApiResponse<InlineResponse2005> getPortfolioNameListWithHttpInfo(java.util.Set<String> attributes, java.util.Set<String> sort) throws ApiException {
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
      
    > apiResponse = apiClient.invokeAPI("PortfolioApi.getPortfolioNameList", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getPortfolioNameListResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * List all open positions of a portfolio.
   * List all open positions of a portfolio.
   * @param id  (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language  (optional)
   * @param sort Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 10 (possibly prefixed) attribute name(s) is allowed. (optional, default to [\&quot;positions.instrument.name\&quot;])
   * @param paginationOffset Non-negative number of entries to skip, or 0 (default). (optional, default to 0)
   * @param paginationLimit Non-negative maximum number of entries to return. (optional, default to 20)
   * @return InlineResponse2009
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse2009 getPortfolioPositionList(String id, java.util.Set<String> attributes, String language, java.util.Set<String> sort, BigDecimal paginationOffset, BigDecimal paginationLimit) throws ApiException {
    return getPortfolioPositionListWithHttpInfo(id, attributes, language, sort, paginationOffset, paginationLimit).getData();
  }

  /**
   * List all open positions of a portfolio.
   * List all open positions of a portfolio.
   * @param id  (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language  (optional)
   * @param sort Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 10 (possibly prefixed) attribute name(s) is allowed. (optional, default to [\&quot;positions.instrument.name\&quot;])
   * @param paginationOffset Non-negative number of entries to skip, or 0 (default). (optional, default to 0)
   * @param paginationLimit Non-negative maximum number of entries to return. (optional, default to 20)
   * @return ApiResponse&lt;InlineResponse2009&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse2009> getPortfolioPositionListWithHttpInfo(String id, java.util.Set<String> attributes, String language, java.util.Set<String> sort, BigDecimal paginationOffset, BigDecimal paginationLimit) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getPortfolioPositionList");
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
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_language", language));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "_sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_paginationOffset", paginationOffset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_paginationLimit", paginationLimit));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        InlineResponse2009
      
    > apiResponse = apiClient.invokeAPI("PortfolioApi.getPortfolioPositionList", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getPortfolioPositionListResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * List of transactions in a portfolio.
   * List of transactions in a portfolio.
   * @param id  (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language  (optional)
   * @param sort Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 7 (possibly prefixed) attribute name(s) is allowed. (optional, default to [\&quot;instrument.name\&quot;])
   * @param paginationOffset Non-negative number of entries to skip, or 0 (default). (optional, default to 0)
   * @param paginationLimit Non-negative maximum number of entries to return. (optional, default to 20)
   * @return InlineResponse20011
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20011 getPortfolioTransactionList(String id, java.util.Set<String> attributes, String language, java.util.Set<String> sort, BigDecimal paginationOffset, BigDecimal paginationLimit) throws ApiException {
    return getPortfolioTransactionListWithHttpInfo(id, attributes, language, sort, paginationOffset, paginationLimit).getData();
  }

  /**
   * List of transactions in a portfolio.
   * List of transactions in a portfolio.
   * @param id  (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language  (optional)
   * @param sort Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 7 (possibly prefixed) attribute name(s) is allowed. (optional, default to [\&quot;instrument.name\&quot;])
   * @param paginationOffset Non-negative number of entries to skip, or 0 (default). (optional, default to 0)
   * @param paginationLimit Non-negative maximum number of entries to return. (optional, default to 20)
   * @return ApiResponse&lt;InlineResponse20011&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20011> getPortfolioTransactionListWithHttpInfo(String id, java.util.Set<String> attributes, String language, java.util.Set<String> sort, BigDecimal paginationOffset, BigDecimal paginationLimit) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getPortfolioTransactionList");
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
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_language", language));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "_sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_paginationOffset", paginationOffset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_paginationLimit", paginationLimit));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        InlineResponse20011
      
    > apiResponse = apiClient.invokeAPI("PortfolioApi.getPortfolioTransactionList", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getPortfolioTransactionListResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Create a portfolio.
   * Create a portfolio.  Certain error conditions yield errors as follows:   |Error Condition|HTTP Error| |-------|--------| |The number of portfolios would exceed 100.|400 Bad Request|
   * @param inlineObject  (required)
   * @return InlineResponse201
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse201 postPortfolioCreate(InlineObject inlineObject) throws ApiException {
    return postPortfolioCreateWithHttpInfo(inlineObject).getData();
  }

  /**
   * Create a portfolio.
   * Create a portfolio.  Certain error conditions yield errors as follows:   |Error Condition|HTTP Error| |-------|--------| |The number of portfolios would exceed 100.|400 Bad Request|
   * @param inlineObject  (required)
   * @return ApiResponse&lt;InlineResponse201&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse201> postPortfolioCreateWithHttpInfo(InlineObject inlineObject) throws ApiException {
    Object localVarPostBody = inlineObject;
    
    // verify the required parameter 'inlineObject' is set
    if (inlineObject == null) {
      throw new ApiException(400, "Missing the required parameter 'inlineObject' when calling postPortfolioCreate");
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
      
    > apiResponse = apiClient.invokeAPI("PortfolioApi.postPortfolioCreate", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, postPortfolioCreateResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Delete a portfolio.
   * Delete a portfolio.
   * @param inlineObject1  (optional)
   * @return InlineResponse200
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse200 postPortfolioDelete(InlineObject1 inlineObject1) throws ApiException {
    return postPortfolioDeleteWithHttpInfo(inlineObject1).getData();
  }

  /**
   * Delete a portfolio.
   * Delete a portfolio.
   * @param inlineObject1  (optional)
   * @return ApiResponse&lt;InlineResponse200&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse200> postPortfolioDeleteWithHttpInfo(InlineObject1 inlineObject1) throws ApiException {
    Object localVarPostBody = inlineObject1;
    
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
      
    > apiResponse = apiClient.invokeAPI("PortfolioApi.postPortfolioDelete", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, postPortfolioDeleteResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Evaluate a portfolio.
   * Performs an evaluation over a period of time and returns portfolio key figures for each day, week, or month.
   * @param inlineObject3  (optional)
   * @return InlineResponse2004
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse2004 postPortfolioEvaluationList(InlineObject3 inlineObject3) throws ApiException {
    return postPortfolioEvaluationListWithHttpInfo(inlineObject3).getData();
  }

  /**
   * Evaluate a portfolio.
   * Performs an evaluation over a period of time and returns portfolio key figures for each day, week, or month.
   * @param inlineObject3  (optional)
   * @return ApiResponse&lt;InlineResponse2004&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse2004> postPortfolioEvaluationListWithHttpInfo(InlineObject3 inlineObject3) throws ApiException {
    Object localVarPostBody = inlineObject3;
    
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
      
    > apiResponse = apiClient.invokeAPI("PortfolioApi.postPortfolioEvaluationList", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, postPortfolioEvaluationListResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Modify a portfolio.
   * Modify a portfolio.
   * @param inlineObject2  (optional)
   * @return InlineResponse2003
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse2003 postPortfolioModify(InlineObject2 inlineObject2) throws ApiException {
    return postPortfolioModifyWithHttpInfo(inlineObject2).getData();
  }

  /**
   * Modify a portfolio.
   * Modify a portfolio.
   * @param inlineObject2  (optional)
   * @return ApiResponse&lt;InlineResponse2003&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse2003> postPortfolioModifyWithHttpInfo(InlineObject2 inlineObject2) throws ApiException {
    Object localVarPostBody = inlineObject2;
    
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
      
    > apiResponse = apiClient.invokeAPI("PortfolioApi.postPortfolioModify", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, postPortfolioModifyResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Add a payout to a portfolio.
   * Add a payout to a portfolio.
   * @param inlineObject4  (optional)
   * @return InlineResponse2011
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse2011 postPortfolioPayoutCreate(InlineObject4 inlineObject4) throws ApiException {
    return postPortfolioPayoutCreateWithHttpInfo(inlineObject4).getData();
  }

  /**
   * Add a payout to a portfolio.
   * Add a payout to a portfolio.
   * @param inlineObject4  (optional)
   * @return ApiResponse&lt;InlineResponse2011&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse2011> postPortfolioPayoutCreateWithHttpInfo(InlineObject4 inlineObject4) throws ApiException {
    Object localVarPostBody = inlineObject4;
    
    // create path and map variables
    String localVarPath = "/portfolio/payout/create";

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
      
    > apiResponse = apiClient.invokeAPI("PortfolioApi.postPortfolioPayoutCreate", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, postPortfolioPayoutCreateResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Delete a payout of a portfolio.
   * Delete a payout of a portfolio.  Certain error conditions yield errors as follows:   |Error Condition|HTTP Error| |-------|--------| |Invalid payout identifier.|400 Bad Request|
   * @param inlineObject5  (optional)
   * @return InlineResponse2006
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse2006 postPortfolioPayoutDelete(InlineObject5 inlineObject5) throws ApiException {
    return postPortfolioPayoutDeleteWithHttpInfo(inlineObject5).getData();
  }

  /**
   * Delete a payout of a portfolio.
   * Delete a payout of a portfolio.  Certain error conditions yield errors as follows:   |Error Condition|HTTP Error| |-------|--------| |Invalid payout identifier.|400 Bad Request|
   * @param inlineObject5  (optional)
   * @return ApiResponse&lt;InlineResponse2006&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse2006> postPortfolioPayoutDeleteWithHttpInfo(InlineObject5 inlineObject5) throws ApiException {
    Object localVarPostBody = inlineObject5;
    
    // create path and map variables
    String localVarPath = "/portfolio/payout/delete";

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
        
        InlineResponse2006
      
    > apiResponse = apiClient.invokeAPI("PortfolioApi.postPortfolioPayoutDelete", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, postPortfolioPayoutDeleteResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * List of payouts in a portfolio.
   * List of payouts in a portfolio.
   * @param inlineObject6  (required)
   * @return InlineResponse2007
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse2007 postPortfolioPayoutList(InlineObject6 inlineObject6) throws ApiException {
    return postPortfolioPayoutListWithHttpInfo(inlineObject6).getData();
  }

  /**
   * List of payouts in a portfolio.
   * List of payouts in a portfolio.
   * @param inlineObject6  (required)
   * @return ApiResponse&lt;InlineResponse2007&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse2007> postPortfolioPayoutListWithHttpInfo(InlineObject6 inlineObject6) throws ApiException {
    Object localVarPostBody = inlineObject6;
    
    // verify the required parameter 'inlineObject6' is set
    if (inlineObject6 == null) {
      throw new ApiException(400, "Missing the required parameter 'inlineObject6' when calling postPortfolioPayoutList");
    }
    
    // create path and map variables
    String localVarPath = "/portfolio/payout/list";

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
      
    > apiResponse = apiClient.invokeAPI("PortfolioApi.postPortfolioPayoutList", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, postPortfolioPayoutListResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Modify a payout in a portfolio.
   * Modify a payout in a portfolio.  Certain error conditions yield errors as follows:   |Error Condition|HTTP Error| |-------|--------| |At least one of the parameters &#x60;notation&#x60;, &#x60;type&#x60;, &#x60;amount&#x60;, &#x60;transaction&#x60; or &#x60;time&#x60; must be set.|400 Bad Request| |Invalid payout identifier.|400 Bad Request|
   * @param inlineObject7  (optional)
   * @return InlineResponse2008
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse2008 postPortfolioPayoutModify(InlineObject7 inlineObject7) throws ApiException {
    return postPortfolioPayoutModifyWithHttpInfo(inlineObject7).getData();
  }

  /**
   * Modify a payout in a portfolio.
   * Modify a payout in a portfolio.  Certain error conditions yield errors as follows:   |Error Condition|HTTP Error| |-------|--------| |At least one of the parameters &#x60;notation&#x60;, &#x60;type&#x60;, &#x60;amount&#x60;, &#x60;transaction&#x60; or &#x60;time&#x60; must be set.|400 Bad Request| |Invalid payout identifier.|400 Bad Request|
   * @param inlineObject7  (optional)
   * @return ApiResponse&lt;InlineResponse2008&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse2008> postPortfolioPayoutModifyWithHttpInfo(InlineObject7 inlineObject7) throws ApiException {
    Object localVarPostBody = inlineObject7;
    
    // create path and map variables
    String localVarPath = "/portfolio/payout/modify";

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
        
        InlineResponse2008
      
    > apiResponse = apiClient.invokeAPI("PortfolioApi.postPortfolioPayoutModify", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, postPortfolioPayoutModifyResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * List all closed positions of a portfolio.
   * List all closed positions of a portfolio.
   * @param inlineObject8  (optional)
   * @return InlineResponse20010
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20010 postPortfolioPositionClosedList(InlineObject8 inlineObject8) throws ApiException {
    return postPortfolioPositionClosedListWithHttpInfo(inlineObject8).getData();
  }

  /**
   * List all closed positions of a portfolio.
   * List all closed positions of a portfolio.
   * @param inlineObject8  (optional)
   * @return ApiResponse&lt;InlineResponse20010&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20010> postPortfolioPositionClosedListWithHttpInfo(InlineObject8 inlineObject8) throws ApiException {
    Object localVarPostBody = inlineObject8;
    
    // create path and map variables
    String localVarPath = "/portfolio/position/closed/list";

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
        
        InlineResponse20010
      
    > apiResponse = apiClient.invokeAPI("PortfolioApi.postPortfolioPositionClosedList", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, postPortfolioPositionClosedListResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Add a cash transaction to a portfolio.
   * Add a cash transaction to a portfolio.  Certain error conditions yield errors as follows:   |Error Condition|HTTP Error| |-------|--------| |The number of transactions would exceed 1000.|400 Bad Request|
   * @param inlineObject12  (optional)
   * @return InlineResponse2012
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse2012 postPortfolioTransactionCashCreate(InlineObject12 inlineObject12) throws ApiException {
    return postPortfolioTransactionCashCreateWithHttpInfo(inlineObject12).getData();
  }

  /**
   * Add a cash transaction to a portfolio.
   * Add a cash transaction to a portfolio.  Certain error conditions yield errors as follows:   |Error Condition|HTTP Error| |-------|--------| |The number of transactions would exceed 1000.|400 Bad Request|
   * @param inlineObject12  (optional)
   * @return ApiResponse&lt;InlineResponse2012&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse2012> postPortfolioTransactionCashCreateWithHttpInfo(InlineObject12 inlineObject12) throws ApiException {
    Object localVarPostBody = inlineObject12;
    
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
        
        InlineResponse2012
      
    > apiResponse = apiClient.invokeAPI("PortfolioApi.postPortfolioTransactionCashCreate", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, postPortfolioTransactionCashCreateResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Delete a cash transaction.
   * Delete a cash transaction.
   * @param inlineObject13  (optional)
   * @return InlineResponse2006
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse2006 postPortfolioTransactionCashDelete(InlineObject13 inlineObject13) throws ApiException {
    return postPortfolioTransactionCashDeleteWithHttpInfo(inlineObject13).getData();
  }

  /**
   * Delete a cash transaction.
   * Delete a cash transaction.
   * @param inlineObject13  (optional)
   * @return ApiResponse&lt;InlineResponse2006&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse2006> postPortfolioTransactionCashDeleteWithHttpInfo(InlineObject13 inlineObject13) throws ApiException {
    Object localVarPostBody = inlineObject13;
    
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
        
        InlineResponse2006
      
    > apiResponse = apiClient.invokeAPI("PortfolioApi.postPortfolioTransactionCashDelete", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, postPortfolioTransactionCashDeleteResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Add a transaction to a portfolio.
   * Add a transaction to a portfolio.  Certain error conditions yield errors as follows:   |Error Condition|HTTP Error| |-------|--------| |The number of transactions would exceed 1000.|400 Bad Request|
   * @param inlineObject9  (optional)
   * @return InlineResponse2012
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse2012 postPortfolioTransactionCreate(InlineObject9 inlineObject9) throws ApiException {
    return postPortfolioTransactionCreateWithHttpInfo(inlineObject9).getData();
  }

  /**
   * Add a transaction to a portfolio.
   * Add a transaction to a portfolio.  Certain error conditions yield errors as follows:   |Error Condition|HTTP Error| |-------|--------| |The number of transactions would exceed 1000.|400 Bad Request|
   * @param inlineObject9  (optional)
   * @return ApiResponse&lt;InlineResponse2012&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse2012> postPortfolioTransactionCreateWithHttpInfo(InlineObject9 inlineObject9) throws ApiException {
    Object localVarPostBody = inlineObject9;
    
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
        
        InlineResponse2012
      
    > apiResponse = apiClient.invokeAPI("PortfolioApi.postPortfolioTransactionCreate", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, postPortfolioTransactionCreateResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Delete a transaction of a portfolio.
   * Delete a transaction of a portfolio.
   * @param inlineObject10  (optional)
   * @return InlineResponse2006
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse2006 postPortfolioTransactionDelete(InlineObject10 inlineObject10) throws ApiException {
    return postPortfolioTransactionDeleteWithHttpInfo(inlineObject10).getData();
  }

  /**
   * Delete a transaction of a portfolio.
   * Delete a transaction of a portfolio.
   * @param inlineObject10  (optional)
   * @return ApiResponse&lt;InlineResponse2006&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse2006> postPortfolioTransactionDeleteWithHttpInfo(InlineObject10 inlineObject10) throws ApiException {
    Object localVarPostBody = inlineObject10;
    
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
        
        InlineResponse2006
      
    > apiResponse = apiClient.invokeAPI("PortfolioApi.postPortfolioTransactionDelete", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, postPortfolioTransactionDeleteResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Modify a transaction in a portfolio.
   * Modify a transaction in a portfolio.  Certain error conditions yield errors as follows:   |Error Condition|HTTP Error| |-------|--------| |At least one of the parameters &#x60;numberShares&#x60;, &#x60;price&#x60;, &#x60;charges&#x60;, &#x60;exchangeRate&#x60; or &#x60;time&#x60; must be set.|400 Bad Request|
   * @param inlineObject11  (optional)
   * @return InlineResponse2008
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse2008 postPortfolioTransactionModify(InlineObject11 inlineObject11) throws ApiException {
    return postPortfolioTransactionModifyWithHttpInfo(inlineObject11).getData();
  }

  /**
   * Modify a transaction in a portfolio.
   * Modify a transaction in a portfolio.  Certain error conditions yield errors as follows:   |Error Condition|HTTP Error| |-------|--------| |At least one of the parameters &#x60;numberShares&#x60;, &#x60;price&#x60;, &#x60;charges&#x60;, &#x60;exchangeRate&#x60; or &#x60;time&#x60; must be set.|400 Bad Request|
   * @param inlineObject11  (optional)
   * @return ApiResponse&lt;InlineResponse2008&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse2008> postPortfolioTransactionModifyWithHttpInfo(InlineObject11 inlineObject11) throws ApiException {
    Object localVarPostBody = inlineObject11;
    
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
        
        InlineResponse2008
      
    > apiResponse = apiClient.invokeAPI("PortfolioApi.postPortfolioTransactionModify", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, postPortfolioTransactionModifyResponseTypeMap, false);

    return apiResponse;

  }
}
