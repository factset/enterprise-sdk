package com.factset.sdk.NewsAPIforDigitalPortals.api;

import com.factset.sdk.NewsAPIforDigitalPortals.ApiException;
import com.factset.sdk.NewsAPIforDigitalPortals.ApiClient;
import com.factset.sdk.NewsAPIforDigitalPortals.ApiResponse;
import com.factset.sdk.NewsAPIforDigitalPortals.Configuration;
import com.factset.sdk.NewsAPIforDigitalPortals.Pair;

import javax.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import java.math.BigDecimal;
import com.factset.sdk.NewsAPIforDigitalPortals.models.InlineObject;
import com.factset.sdk.NewsAPIforDigitalPortals.models.InlineObject1;
import com.factset.sdk.NewsAPIforDigitalPortals.models.InlineObject2;
import com.factset.sdk.NewsAPIforDigitalPortals.models.InlineObject3;
import com.factset.sdk.NewsAPIforDigitalPortals.models.InlineObject4;
import com.factset.sdk.NewsAPIforDigitalPortals.models.InlineObject5;
import com.factset.sdk.NewsAPIforDigitalPortals.models.InlineObject6;
import com.factset.sdk.NewsAPIforDigitalPortals.models.InlineResponse200;
import com.factset.sdk.NewsAPIforDigitalPortals.models.InlineResponse2001;
import com.factset.sdk.NewsAPIforDigitalPortals.models.InlineResponse2002;
import com.factset.sdk.NewsAPIforDigitalPortals.models.InlineResponse2003;
import com.factset.sdk.NewsAPIforDigitalPortals.models.InlineResponse2004;
import com.factset.sdk.NewsAPIforDigitalPortals.models.InlineResponse2005;
import com.factset.sdk.NewsAPIforDigitalPortals.models.InlineResponse2006;
import com.factset.sdk.NewsAPIforDigitalPortals.models.InlineResponse2007;
import com.factset.sdk.NewsAPIforDigitalPortals.models.InlineResponse2008;
import com.factset.sdk.NewsAPIforDigitalPortals.models.InlineResponse2009;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class NewsApi {
  private ApiClient apiClient;

  public NewsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public NewsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

    private static final Map<Integer, GenericType> getNewsArticleGetResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getNewsArticleGetResponseTypeMap.put(200, new GenericType<InlineResponse200>(){});
  }
  private static final Map<Integer, GenericType> getNewsArticleTypeGetResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getNewsArticleTypeGetResponseTypeMap.put(200, new GenericType<InlineResponse2003>(){});
  }
  private static final Map<Integer, GenericType> getNewsArticleTypeListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getNewsArticleTypeListResponseTypeMap.put(200, new GenericType<InlineResponse2004>(){});
  }
  private static final Map<Integer, GenericType> getNewsDistributorGetResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getNewsDistributorGetResponseTypeMap.put(200, new GenericType<InlineResponse2005>(){});
  }
  private static final Map<Integer, GenericType> getNewsDistributorListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getNewsDistributorListResponseTypeMap.put(200, new GenericType<InlineResponse2006>(){});
  }
  private static final Map<Integer, GenericType> getNewsPublisherGetResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getNewsPublisherGetResponseTypeMap.put(200, new GenericType<InlineResponse2007>(){});
  }
  private static final Map<Integer, GenericType> getNewsPublisherListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getNewsPublisherListResponseTypeMap.put(200, new GenericType<InlineResponse2008>(){});
  }
  private static final Map<Integer, GenericType> getNewsPublisherListByDistributorResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getNewsPublisherListByDistributorResponseTypeMap.put(200, new GenericType<InlineResponse2009>(){});
  }
  private static final Map<Integer, GenericType> postNewsArticleListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    postNewsArticleListResponseTypeMap.put(200, new GenericType<InlineResponse2001>(){});
  }
  private static final Map<Integer, GenericType> postNewsArticleListByChainResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    postNewsArticleListByChainResponseTypeMap.put(200, new GenericType<InlineResponse2002>(){});
  }
  private static final Map<Integer, GenericType> postNewsArticleListByIndexResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    postNewsArticleListByIndexResponseTypeMap.put(200, new GenericType<InlineResponse2001>(){});
  }
  private static final Map<Integer, GenericType> postNewsArticleListByInstrumentResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    postNewsArticleListByInstrumentResponseTypeMap.put(200, new GenericType<InlineResponse2001>(){});
  }
  private static final Map<Integer, GenericType> postNewsArticleListByMediaKindResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    postNewsArticleListByMediaKindResponseTypeMap.put(200, new GenericType<InlineResponse2001>(){});
  }
  private static final Map<Integer, GenericType> postNewsArticleSearchByTextResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    postNewsArticleSearchByTextResponseTypeMap.put(200, new GenericType<InlineResponse2001>(){});
  }
  private static final Map<Integer, GenericType> postNewsPublisherSearchByNameResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    postNewsPublisherSearchByNameResponseTypeMap.put(200, new GenericType<InlineResponse2009>(){});
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
   * Details for a news article.
   * Details for a news article.
   * @param code Identifier of a news article. (required)
   * @param includeMedia If true, media references are included if available. (optional, default to false)
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
  public InlineResponse200 getNewsArticleGet(String code, Boolean includeMedia, java.util.Set<String> attributes, String language) throws ApiException {
    return getNewsArticleGetWithHttpInfo(code, includeMedia, attributes, language).getData();
  }

  /**
   * Details for a news article.
   * Details for a news article.
   * @param code Identifier of a news article. (required)
   * @param includeMedia If true, media references are included if available. (optional, default to false)
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
  public ApiResponse<InlineResponse200> getNewsArticleGetWithHttpInfo(String code, Boolean includeMedia, java.util.Set<String> attributes, String language) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'code' is set
    if (code == null) {
      throw new ApiException(400, "Missing the required parameter 'code' when calling getNewsArticleGet");
    }
    
    // create path and map variables
    String localVarPath = "/news/article/get";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "code", code));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "includeMedia", includeMedia));
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
      
    > apiResponse = apiClient.invokeAPI("NewsApi.getNewsArticleGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getNewsArticleGetResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Details for a news article type.
   * Details for a news article type.
   * @param id Identifier of a news article type. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language ISO 639-1 code of the language. (optional)
   * @return InlineResponse2003
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse2003 getNewsArticleTypeGet(BigDecimal id, java.util.Set<String> attributes, String language) throws ApiException {
    return getNewsArticleTypeGetWithHttpInfo(id, attributes, language).getData();
  }

  /**
   * Details for a news article type.
   * Details for a news article type.
   * @param id Identifier of a news article type. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language ISO 639-1 code of the language. (optional)
   * @return ApiResponse&lt;InlineResponse2003&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse2003> getNewsArticleTypeGetWithHttpInfo(BigDecimal id, java.util.Set<String> attributes, String language) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getNewsArticleTypeGet");
    }
    
    // create path and map variables
    String localVarPath = "/news/article/type/get";

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
        
        InlineResponse2003
      
    > apiResponse = apiClient.invokeAPI("NewsApi.getNewsArticleTypeGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getNewsArticleTypeGetResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * List of news article types.
   * List of news article types.
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
  public InlineResponse2004 getNewsArticleTypeList(java.util.Set<String> attributes, String language) throws ApiException {
    return getNewsArticleTypeListWithHttpInfo(attributes, language).getData();
  }

  /**
   * List of news article types.
   * List of news article types.
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
  public ApiResponse<InlineResponse2004> getNewsArticleTypeListWithHttpInfo(java.util.Set<String> attributes, String language) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/news/article/type/list";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

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
      
    > apiResponse = apiClient.invokeAPI("NewsApi.getNewsArticleTypeList", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getNewsArticleTypeListResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Details of a distributor.
   * Details of a distributor.
   * @param id Identifier of a distributor. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @return InlineResponse2005
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse2005 getNewsDistributorGet(BigDecimal id, java.util.Set<String> attributes) throws ApiException {
    return getNewsDistributorGetWithHttpInfo(id, attributes).getData();
  }

  /**
   * Details of a distributor.
   * Details of a distributor.
   * @param id Identifier of a distributor. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @return ApiResponse&lt;InlineResponse2005&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse2005> getNewsDistributorGetWithHttpInfo(BigDecimal id, java.util.Set<String> attributes) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getNewsDistributorGet");
    }
    
    // create path and map variables
    String localVarPath = "/news/distributor/get";

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
        
        InlineResponse2005
      
    > apiResponse = apiClient.invokeAPI("NewsApi.getNewsDistributorGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getNewsDistributorGetResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * List of distributors.
   * List of distributors.
   * @param ids Identifiers of distributors. (optional)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param sort Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 1 (possibly prefixed) attribute name(s) is allowed. (optional, default to [\&quot;name\&quot;])
   * @return InlineResponse2006
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse2006 getNewsDistributorList(java.util.Set<BigDecimal> ids, java.util.Set<String> attributes, java.util.Set<String> sort) throws ApiException {
    return getNewsDistributorListWithHttpInfo(ids, attributes, sort).getData();
  }

  /**
   * List of distributors.
   * List of distributors.
   * @param ids Identifiers of distributors. (optional)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param sort Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 1 (possibly prefixed) attribute name(s) is allowed. (optional, default to [\&quot;name\&quot;])
   * @return ApiResponse&lt;InlineResponse2006&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse2006> getNewsDistributorListWithHttpInfo(java.util.Set<BigDecimal> ids, java.util.Set<String> attributes, java.util.Set<String> sort) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/news/distributor/list";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "ids", ids));
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
        
        InlineResponse2006
      
    > apiResponse = apiClient.invokeAPI("NewsApi.getNewsDistributorList", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getNewsDistributorListResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Details of a publisher.
   * Details of a publisher.
   * @param id Identifier of a publisher. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @return InlineResponse2007
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse2007 getNewsPublisherGet(BigDecimal id, java.util.Set<String> attributes) throws ApiException {
    return getNewsPublisherGetWithHttpInfo(id, attributes).getData();
  }

  /**
   * Details of a publisher.
   * Details of a publisher.
   * @param id Identifier of a publisher. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @return ApiResponse&lt;InlineResponse2007&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse2007> getNewsPublisherGetWithHttpInfo(BigDecimal id, java.util.Set<String> attributes) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getNewsPublisherGet");
    }
    
    // create path and map variables
    String localVarPath = "/news/publisher/get";

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
        
        InlineResponse2007
      
    > apiResponse = apiClient.invokeAPI("NewsApi.getNewsPublisherGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getNewsPublisherGetResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * List of publishers.
   * List of publishers.
   * @param ids Identifiers of publishers. (optional)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param sort Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 1 (possibly prefixed) attribute name(s) is allowed. (optional, default to [\&quot;name\&quot;])
   * @param paginationOffset Non-negative number of entries to skip, or 0 (default). (optional, default to 0.0)
   * @param paginationLimit Non-negative maximum number of entries to return. (optional, default to 20.0)
   * @return InlineResponse2008
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse2008 getNewsPublisherList(java.util.Set<BigDecimal> ids, java.util.Set<String> attributes, java.util.Set<String> sort, BigDecimal paginationOffset, BigDecimal paginationLimit) throws ApiException {
    return getNewsPublisherListWithHttpInfo(ids, attributes, sort, paginationOffset, paginationLimit).getData();
  }

  /**
   * List of publishers.
   * List of publishers.
   * @param ids Identifiers of publishers. (optional)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param sort Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 1 (possibly prefixed) attribute name(s) is allowed. (optional, default to [\&quot;name\&quot;])
   * @param paginationOffset Non-negative number of entries to skip, or 0 (default). (optional, default to 0.0)
   * @param paginationLimit Non-negative maximum number of entries to return. (optional, default to 20.0)
   * @return ApiResponse&lt;InlineResponse2008&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse2008> getNewsPublisherListWithHttpInfo(java.util.Set<BigDecimal> ids, java.util.Set<String> attributes, java.util.Set<String> sort, BigDecimal paginationOffset, BigDecimal paginationLimit) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/news/publisher/list";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "ids", ids));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "_attributes", attributes));
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
        
        InlineResponse2008
      
    > apiResponse = apiClient.invokeAPI("NewsApi.getNewsPublisherList", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getNewsPublisherListResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * List of publishers provided by the given distributor.
   * List of publishers provided by the given distributor.
   * @param id Identifier of a distributor. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param sort Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 1 (possibly prefixed) attribute name(s) is allowed. (optional, default to [\&quot;name\&quot;])
   * @return InlineResponse2009
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse2009 getNewsPublisherListByDistributor(BigDecimal id, java.util.Set<String> attributes, java.util.Set<String> sort) throws ApiException {
    return getNewsPublisherListByDistributorWithHttpInfo(id, attributes, sort).getData();
  }

  /**
   * List of publishers provided by the given distributor.
   * List of publishers provided by the given distributor.
   * @param id Identifier of a distributor. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param sort Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 1 (possibly prefixed) attribute name(s) is allowed. (optional, default to [\&quot;name\&quot;])
   * @return ApiResponse&lt;InlineResponse2009&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse2009> getNewsPublisherListByDistributorWithHttpInfo(BigDecimal id, java.util.Set<String> attributes, java.util.Set<String> sort) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getNewsPublisherListByDistributor");
    }
    
    // create path and map variables
    String localVarPath = "/news/publisher/listByDistributor";

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
        
        InlineResponse2009
      
    > apiResponse = apiClient.invokeAPI("NewsApi.getNewsPublisherListByDistributor", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getNewsPublisherListByDistributorResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * List of news articles.
   * List of news articles.
   * @param body  (optional)
   * @return InlineResponse2001
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse2001 postNewsArticleList(InlineObject body) throws ApiException {
    return postNewsArticleListWithHttpInfo(body).getData();
  }

  /**
   * List of news articles.
   * List of news articles.
   * @param body  (optional)
   * @return ApiResponse&lt;InlineResponse2001&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse2001> postNewsArticleListWithHttpInfo(InlineObject body) throws ApiException {
    Object localVarPostBody = body;
    
    // create path and map variables
    String localVarPath = "/news/article/list";

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
        
        InlineResponse2001
      
    > apiResponse = apiClient.invokeAPI("NewsApi.postNewsArticleList", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, postNewsArticleListResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * List news articles of an article chain.
   * List news articles of an article chain.
   * @param body  (required)
   * @return InlineResponse2002
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse2002 postNewsArticleListByChain(InlineObject1 body) throws ApiException {
    return postNewsArticleListByChainWithHttpInfo(body).getData();
  }

  /**
   * List news articles of an article chain.
   * List news articles of an article chain.
   * @param body  (required)
   * @return ApiResponse&lt;InlineResponse2002&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse2002> postNewsArticleListByChainWithHttpInfo(InlineObject1 body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling postNewsArticleListByChain");
    }
    
    // create path and map variables
    String localVarPath = "/news/article/listByChain";

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
        
        InlineResponse2002
      
    > apiResponse = apiClient.invokeAPI("NewsApi.postNewsArticleListByChain", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, postNewsArticleListByChainResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * News articles for instruments that are constituents of the given indices.
   * News articles for instruments that are constituents of the given indices.
   * @param body  (required)
   * @return InlineResponse2001
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse2001 postNewsArticleListByIndex(InlineObject2 body) throws ApiException {
    return postNewsArticleListByIndexWithHttpInfo(body).getData();
  }

  /**
   * News articles for instruments that are constituents of the given indices.
   * News articles for instruments that are constituents of the given indices.
   * @param body  (required)
   * @return ApiResponse&lt;InlineResponse2001&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse2001> postNewsArticleListByIndexWithHttpInfo(InlineObject2 body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling postNewsArticleListByIndex");
    }
    
    // create path and map variables
    String localVarPath = "/news/article/listByIndex";

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
        
        InlineResponse2001
      
    > apiResponse = apiClient.invokeAPI("NewsApi.postNewsArticleListByIndex", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, postNewsArticleListByIndexResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * News articles for instruments.
   * News articles for instruments.
   * @param body  (required)
   * @return InlineResponse2001
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse2001 postNewsArticleListByInstrument(InlineObject3 body) throws ApiException {
    return postNewsArticleListByInstrumentWithHttpInfo(body).getData();
  }

  /**
   * News articles for instruments.
   * News articles for instruments.
   * @param body  (required)
   * @return ApiResponse&lt;InlineResponse2001&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse2001> postNewsArticleListByInstrumentWithHttpInfo(InlineObject3 body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling postNewsArticleListByInstrument");
    }
    
    // create path and map variables
    String localVarPath = "/news/article/listByInstrument";

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
        
        InlineResponse2001
      
    > apiResponse = apiClient.invokeAPI("NewsApi.postNewsArticleListByInstrument", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, postNewsArticleListByInstrumentResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * List news articles which contain media of specific media kinds.
   * List news articles which contain media of specific media kinds.
   * @param body  (required)
   * @return InlineResponse2001
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse2001 postNewsArticleListByMediaKind(InlineObject4 body) throws ApiException {
    return postNewsArticleListByMediaKindWithHttpInfo(body).getData();
  }

  /**
   * List news articles which contain media of specific media kinds.
   * List news articles which contain media of specific media kinds.
   * @param body  (required)
   * @return ApiResponse&lt;InlineResponse2001&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse2001> postNewsArticleListByMediaKindWithHttpInfo(InlineObject4 body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling postNewsArticleListByMediaKind");
    }
    
    // create path and map variables
    String localVarPath = "/news/article/listByMediaKind";

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
        
        InlineResponse2001
      
    > apiResponse = apiClient.invokeAPI("NewsApi.postNewsArticleListByMediaKind", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, postNewsArticleListByMediaKindResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Search for news articles using a fulltext search.
   * Search for news articles using a fulltext search. All specified criteria need to be fulfilled for an article to match. Each criterion is handled according to its selectionType; \&quot;include\&quot; requires the criterion to evaluate to true, \&quot;exclude\&quot; requires the criterion to evaluate to false. A criterion is fulfilled when at least one of its values is found.
   * @param body  (optional)
   * @return InlineResponse2001
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse2001 postNewsArticleSearchByText(InlineObject5 body) throws ApiException {
    return postNewsArticleSearchByTextWithHttpInfo(body).getData();
  }

  /**
   * Search for news articles using a fulltext search.
   * Search for news articles using a fulltext search. All specified criteria need to be fulfilled for an article to match. Each criterion is handled according to its selectionType; \&quot;include\&quot; requires the criterion to evaluate to true, \&quot;exclude\&quot; requires the criterion to evaluate to false. A criterion is fulfilled when at least one of its values is found.
   * @param body  (optional)
   * @return ApiResponse&lt;InlineResponse2001&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse2001> postNewsArticleSearchByTextWithHttpInfo(InlineObject5 body) throws ApiException {
    Object localVarPostBody = body;
    
    // create path and map variables
    String localVarPath = "/news/article/searchByText";

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
        
        InlineResponse2001
      
    > apiResponse = apiClient.invokeAPI("NewsApi.postNewsArticleSearchByText", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, postNewsArticleSearchByTextResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Search for publishers.
   * Search for publishers by the name of the publisher.
   * @param body  (required)
   * @return InlineResponse2009
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse2009 postNewsPublisherSearchByName(InlineObject6 body) throws ApiException {
    return postNewsPublisherSearchByNameWithHttpInfo(body).getData();
  }

  /**
   * Search for publishers.
   * Search for publishers by the name of the publisher.
   * @param body  (required)
   * @return ApiResponse&lt;InlineResponse2009&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse2009> postNewsPublisherSearchByNameWithHttpInfo(InlineObject6 body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling postNewsPublisherSearchByName");
    }
    
    // create path and map variables
    String localVarPath = "/news/publisher/searchByName";

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
      
    > apiResponse = apiClient.invokeAPI("NewsApi.postNewsPublisherSearchByName", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, postNewsPublisherSearchByNameResponseTypeMap, false);

    return apiResponse;

  }
}
