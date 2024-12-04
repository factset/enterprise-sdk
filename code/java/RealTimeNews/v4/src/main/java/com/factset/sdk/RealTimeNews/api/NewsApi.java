package com.factset.sdk.RealTimeNews.api;

import com.factset.sdk.RealTimeNews.ApiException;
import com.factset.sdk.RealTimeNews.ApiClient;
import com.factset.sdk.RealTimeNews.ApiResponse;
import com.factset.sdk.RealTimeNews.Configuration;
import com.factset.sdk.RealTimeNews.Pair;

import jakarta.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import java.math.BigDecimal;
import com.factset.sdk.RealTimeNews.models.InlineResponse20043;
import com.factset.sdk.RealTimeNews.models.InlineResponse20044;
import com.factset.sdk.RealTimeNews.models.InlineResponse20045;
import com.factset.sdk.RealTimeNews.models.InlineResponse20046;
import com.factset.sdk.RealTimeNews.models.InlineResponse20047;
import com.factset.sdk.RealTimeNews.models.InlineResponse20048;
import com.factset.sdk.RealTimeNews.models.InlineResponse20049;
import com.factset.sdk.RealTimeNews.models.InlineResponse20050;
import com.factset.sdk.RealTimeNews.models.InlineResponse20051;
import com.factset.sdk.RealTimeNews.models.InlineResponse20052;
import com.factset.sdk.RealTimeNews.models.InlineResponse20053;
import com.factset.sdk.RealTimeNews.models.InlineResponse20054;
import com.factset.sdk.RealTimeNews.models.InlineResponse20055;
import com.factset.sdk.RealTimeNews.models.InlineResponse20056;
import com.factset.sdk.RealTimeNews.models.InlineResponse20057;
import com.factset.sdk.RealTimeNews.models.PostNewsArticleListByChainRequest;
import com.factset.sdk.RealTimeNews.models.PostNewsArticleListByIndexRequest;
import com.factset.sdk.RealTimeNews.models.PostNewsArticleListByInstrumentRequest;
import com.factset.sdk.RealTimeNews.models.PostNewsArticleListByMediaKindRequest;
import com.factset.sdk.RealTimeNews.models.PostNewsArticleListRequest;
import com.factset.sdk.RealTimeNews.models.PostNewsArticleSearchByTextRequest;
import com.factset.sdk.RealTimeNews.models.PostNewsPublisherSearchByNameRequest;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

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
    getNewsArticleGetResponseTypeMap.put(200, new GenericType<InlineResponse20043>(){});
  }

  private static final Map<Integer, GenericType> getNewsArticleTypeGetResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getNewsArticleTypeGetResponseTypeMap.put(200, new GenericType<InlineResponse20050>(){});
  }

  private static final Map<Integer, GenericType> getNewsArticleTypeListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getNewsArticleTypeListResponseTypeMap.put(200, new GenericType<InlineResponse20051>(){});
  }

  private static final Map<Integer, GenericType> getNewsDistributorGetResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getNewsDistributorGetResponseTypeMap.put(200, new GenericType<InlineResponse20052>(){});
  }

  private static final Map<Integer, GenericType> getNewsDistributorListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getNewsDistributorListResponseTypeMap.put(200, new GenericType<InlineResponse20053>(){});
  }

  private static final Map<Integer, GenericType> getNewsPublisherGetResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getNewsPublisherGetResponseTypeMap.put(200, new GenericType<InlineResponse20054>(){});
  }

  private static final Map<Integer, GenericType> getNewsPublisherListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getNewsPublisherListResponseTypeMap.put(200, new GenericType<InlineResponse20055>(){});
  }

  private static final Map<Integer, GenericType> getNewsPublisherListByDistributorResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getNewsPublisherListByDistributorResponseTypeMap.put(200, new GenericType<InlineResponse20056>(){});
  }

  private static final Map<Integer, GenericType> postNewsArticleListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    postNewsArticleListResponseTypeMap.put(200, new GenericType<InlineResponse20044>(){});
  }

  private static final Map<Integer, GenericType> postNewsArticleListByChainResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    postNewsArticleListByChainResponseTypeMap.put(200, new GenericType<InlineResponse20045>(){});
  }

  private static final Map<Integer, GenericType> postNewsArticleListByIndexResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    postNewsArticleListByIndexResponseTypeMap.put(200, new GenericType<InlineResponse20046>(){});
  }

  private static final Map<Integer, GenericType> postNewsArticleListByInstrumentResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    postNewsArticleListByInstrumentResponseTypeMap.put(200, new GenericType<InlineResponse20047>(){});
  }

  private static final Map<Integer, GenericType> postNewsArticleListByMediaKindResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    postNewsArticleListByMediaKindResponseTypeMap.put(200, new GenericType<InlineResponse20048>(){});
  }

  private static final Map<Integer, GenericType> postNewsArticleSearchByTextResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    postNewsArticleSearchByTextResponseTypeMap.put(200, new GenericType<InlineResponse20049>(){});
  }

  private static final Map<Integer, GenericType> postNewsPublisherSearchByNameResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    postNewsPublisherSearchByNameResponseTypeMap.put(200, new GenericType<InlineResponse20057>(){});
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
   * @param metaLanguage ISO 639-1 code of the language. (optional)
   * @return InlineResponse20043
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20043 getNewsArticleGet(String code, Boolean includeMedia, java.util.Set<String> attributes, String metaLanguage) throws ApiException {
    return getNewsArticleGetWithHttpInfo(code, includeMedia, attributes, metaLanguage).getData();
  }

  /**
   * Details for a news article.
   * Details for a news article.
   * @param code Identifier of a news article. (required)
   * @param includeMedia If true, media references are included if available. (optional, default to false)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param metaLanguage ISO 639-1 code of the language. (optional)
   * @return ApiResponse&lt;InlineResponse20043&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20043> getNewsArticleGetWithHttpInfo(String code, Boolean includeMedia, java.util.Set<String> attributes, String metaLanguage) throws ApiException {
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
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "metaLanguage", metaLanguage));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        InlineResponse20043
      
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
   * @param metaLanguage ISO 639-1 code of the language. (optional)
   * @return InlineResponse20050
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20050 getNewsArticleTypeGet(BigDecimal id, java.util.Set<String> attributes, String metaLanguage) throws ApiException {
    return getNewsArticleTypeGetWithHttpInfo(id, attributes, metaLanguage).getData();
  }

  /**
   * Details for a news article type.
   * Details for a news article type.
   * @param id Identifier of a news article type. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param metaLanguage ISO 639-1 code of the language. (optional)
   * @return ApiResponse&lt;InlineResponse20050&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20050> getNewsArticleTypeGetWithHttpInfo(BigDecimal id, java.util.Set<String> attributes, String metaLanguage) throws ApiException {
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
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "metaLanguage", metaLanguage));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        InlineResponse20050
      
    > apiResponse = apiClient.invokeAPI("NewsApi.getNewsArticleTypeGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getNewsArticleTypeGetResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * List of news article types.
   * List of news article types.
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param metaLanguage ISO 639-1 code of the language. (optional)
   * @return InlineResponse20051
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20051 getNewsArticleTypeList(java.util.Set<String> attributes, String metaLanguage) throws ApiException {
    return getNewsArticleTypeListWithHttpInfo(attributes, metaLanguage).getData();
  }

  /**
   * List of news article types.
   * List of news article types.
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param metaLanguage ISO 639-1 code of the language. (optional)
   * @return ApiResponse&lt;InlineResponse20051&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20051> getNewsArticleTypeListWithHttpInfo(java.util.Set<String> attributes, String metaLanguage) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/news/article/type/list";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "_attributes", attributes));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "metaLanguage", metaLanguage));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        InlineResponse20051
      
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
   * @return InlineResponse20052
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20052 getNewsDistributorGet(BigDecimal id, java.util.Set<String> attributes) throws ApiException {
    return getNewsDistributorGetWithHttpInfo(id, attributes).getData();
  }

  /**
   * Details of a distributor.
   * Details of a distributor.
   * @param id Identifier of a distributor. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @return ApiResponse&lt;InlineResponse20052&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20052> getNewsDistributorGetWithHttpInfo(BigDecimal id, java.util.Set<String> attributes) throws ApiException {
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
        
        InlineResponse20052
      
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
   * @param sort Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 1 (possibly prefixed) attribute name(s) is allowed. | Value | | --- | | id | | -id | | name | | -name |   (optional, default to [\&quot;name\&quot;])
   * @return InlineResponse20053
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20053 getNewsDistributorList(java.util.Set<BigDecimal> ids, java.util.Set<String> attributes, java.util.Set<String> sort) throws ApiException {
    return getNewsDistributorListWithHttpInfo(ids, attributes, sort).getData();
  }

  /**
   * List of distributors.
   * List of distributors.
   * @param ids Identifiers of distributors. (optional)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param sort Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 1 (possibly prefixed) attribute name(s) is allowed. | Value | | --- | | id | | -id | | name | | -name |   (optional, default to [\&quot;name\&quot;])
   * @return ApiResponse&lt;InlineResponse20053&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20053> getNewsDistributorListWithHttpInfo(java.util.Set<BigDecimal> ids, java.util.Set<String> attributes, java.util.Set<String> sort) throws ApiException {
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
        
        InlineResponse20053
      
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
   * @return InlineResponse20054
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20054 getNewsPublisherGet(BigDecimal id, java.util.Set<String> attributes) throws ApiException {
    return getNewsPublisherGetWithHttpInfo(id, attributes).getData();
  }

  /**
   * Details of a publisher.
   * Details of a publisher.
   * @param id Identifier of a publisher. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @return ApiResponse&lt;InlineResponse20054&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20054> getNewsPublisherGetWithHttpInfo(BigDecimal id, java.util.Set<String> attributes) throws ApiException {
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
        
        InlineResponse20054
      
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
   * @param sort Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 1 (possibly prefixed) attribute name(s) is allowed. | Value | | --- | | id | | -id | | name | | -name |   (optional, default to [\&quot;name\&quot;])
   * @param paginationOffset Non-negative number of entries to skip, or 0 (default). (optional, default to 0)
   * @param paginationLimit Non-negative maximum number of entries to return. (optional, default to 20)
   * @return InlineResponse20055
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20055 getNewsPublisherList(java.util.Set<BigDecimal> ids, java.util.Set<String> attributes, java.util.Set<String> sort, BigDecimal paginationOffset, BigDecimal paginationLimit) throws ApiException {
    return getNewsPublisherListWithHttpInfo(ids, attributes, sort, paginationOffset, paginationLimit).getData();
  }

  /**
   * List of publishers.
   * List of publishers.
   * @param ids Identifiers of publishers. (optional)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param sort Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 1 (possibly prefixed) attribute name(s) is allowed. | Value | | --- | | id | | -id | | name | | -name |   (optional, default to [\&quot;name\&quot;])
   * @param paginationOffset Non-negative number of entries to skip, or 0 (default). (optional, default to 0)
   * @param paginationLimit Non-negative maximum number of entries to return. (optional, default to 20)
   * @return ApiResponse&lt;InlineResponse20055&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20055> getNewsPublisherListWithHttpInfo(java.util.Set<BigDecimal> ids, java.util.Set<String> attributes, java.util.Set<String> sort, BigDecimal paginationOffset, BigDecimal paginationLimit) throws ApiException {
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
        
        InlineResponse20055
      
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
   * @param sort Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 1 (possibly prefixed) attribute name(s) is allowed. | Value | | --- | | id | | -id | | name | | -name |   (optional, default to [\&quot;name\&quot;])
   * @return InlineResponse20056
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20056 getNewsPublisherListByDistributor(BigDecimal id, java.util.Set<String> attributes, java.util.Set<String> sort) throws ApiException {
    return getNewsPublisherListByDistributorWithHttpInfo(id, attributes, sort).getData();
  }

  /**
   * List of publishers provided by the given distributor.
   * List of publishers provided by the given distributor.
   * @param id Identifier of a distributor. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param sort Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 1 (possibly prefixed) attribute name(s) is allowed. | Value | | --- | | id | | -id | | name | | -name |   (optional, default to [\&quot;name\&quot;])
   * @return ApiResponse&lt;InlineResponse20056&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20056> getNewsPublisherListByDistributorWithHttpInfo(BigDecimal id, java.util.Set<String> attributes, java.util.Set<String> sort) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getNewsPublisherListByDistributor");
    }
    
    // create path and map variables
    String localVarPath = "/news/publisher/list-by-distributor";

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
        
        InlineResponse20056
      
    > apiResponse = apiClient.invokeAPI("NewsApi.getNewsPublisherListByDistributor", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getNewsPublisherListByDistributorResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * List of news articles.
   * List of news articles.
   * @param postNewsArticleListRequest Request Body (optional)
   * @return InlineResponse20044
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20044 postNewsArticleList(PostNewsArticleListRequest postNewsArticleListRequest) throws ApiException {
    return postNewsArticleListWithHttpInfo(postNewsArticleListRequest).getData();
  }

  /**
   * List of news articles.
   * List of news articles.
   * @param postNewsArticleListRequest Request Body (optional)
   * @return ApiResponse&lt;InlineResponse20044&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20044> postNewsArticleListWithHttpInfo(PostNewsArticleListRequest postNewsArticleListRequest) throws ApiException {
    Object localVarPostBody = postNewsArticleListRequest;
    
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
        
        InlineResponse20044
      
    > apiResponse = apiClient.invokeAPI("NewsApi.postNewsArticleList", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, postNewsArticleListResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * List news articles of an article chain.
   * List news articles of an article chain.
   * @param postNewsArticleListByChainRequest Request Body (required)
   * @return InlineResponse20045
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20045 postNewsArticleListByChain(PostNewsArticleListByChainRequest postNewsArticleListByChainRequest) throws ApiException {
    return postNewsArticleListByChainWithHttpInfo(postNewsArticleListByChainRequest).getData();
  }

  /**
   * List news articles of an article chain.
   * List news articles of an article chain.
   * @param postNewsArticleListByChainRequest Request Body (required)
   * @return ApiResponse&lt;InlineResponse20045&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20045> postNewsArticleListByChainWithHttpInfo(PostNewsArticleListByChainRequest postNewsArticleListByChainRequest) throws ApiException {
    Object localVarPostBody = postNewsArticleListByChainRequest;
    
    // verify the required parameter 'postNewsArticleListByChainRequest' is set
    if (postNewsArticleListByChainRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'postNewsArticleListByChainRequest' when calling postNewsArticleListByChain");
    }
    
    // create path and map variables
    String localVarPath = "/news/article/list-by-chain";

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
        
        InlineResponse20045
      
    > apiResponse = apiClient.invokeAPI("NewsApi.postNewsArticleListByChain", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, postNewsArticleListByChainResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * News articles for instruments that are constituents of the given indices.
   * News articles for instruments that are constituents of the given indices.
   * @param postNewsArticleListByIndexRequest Request Body (required)
   * @return InlineResponse20046
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20046 postNewsArticleListByIndex(PostNewsArticleListByIndexRequest postNewsArticleListByIndexRequest) throws ApiException {
    return postNewsArticleListByIndexWithHttpInfo(postNewsArticleListByIndexRequest).getData();
  }

  /**
   * News articles for instruments that are constituents of the given indices.
   * News articles for instruments that are constituents of the given indices.
   * @param postNewsArticleListByIndexRequest Request Body (required)
   * @return ApiResponse&lt;InlineResponse20046&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20046> postNewsArticleListByIndexWithHttpInfo(PostNewsArticleListByIndexRequest postNewsArticleListByIndexRequest) throws ApiException {
    Object localVarPostBody = postNewsArticleListByIndexRequest;
    
    // verify the required parameter 'postNewsArticleListByIndexRequest' is set
    if (postNewsArticleListByIndexRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'postNewsArticleListByIndexRequest' when calling postNewsArticleListByIndex");
    }
    
    // create path and map variables
    String localVarPath = "/news/article/list-by-index";

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
        
        InlineResponse20046
      
    > apiResponse = apiClient.invokeAPI("NewsApi.postNewsArticleListByIndex", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, postNewsArticleListByIndexResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * News articles for instruments.
   * News articles for instruments.
   * @param postNewsArticleListByInstrumentRequest Request Body (required)
   * @return InlineResponse20047
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20047 postNewsArticleListByInstrument(PostNewsArticleListByInstrumentRequest postNewsArticleListByInstrumentRequest) throws ApiException {
    return postNewsArticleListByInstrumentWithHttpInfo(postNewsArticleListByInstrumentRequest).getData();
  }

  /**
   * News articles for instruments.
   * News articles for instruments.
   * @param postNewsArticleListByInstrumentRequest Request Body (required)
   * @return ApiResponse&lt;InlineResponse20047&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20047> postNewsArticleListByInstrumentWithHttpInfo(PostNewsArticleListByInstrumentRequest postNewsArticleListByInstrumentRequest) throws ApiException {
    Object localVarPostBody = postNewsArticleListByInstrumentRequest;
    
    // verify the required parameter 'postNewsArticleListByInstrumentRequest' is set
    if (postNewsArticleListByInstrumentRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'postNewsArticleListByInstrumentRequest' when calling postNewsArticleListByInstrument");
    }
    
    // create path and map variables
    String localVarPath = "/news/article/list-by-instrument";

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
        
        InlineResponse20047
      
    > apiResponse = apiClient.invokeAPI("NewsApi.postNewsArticleListByInstrument", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, postNewsArticleListByInstrumentResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * List news articles which contain media of specific media kinds.
   * List news articles which contain media of specific media kinds.
   * @param postNewsArticleListByMediaKindRequest Request Body (required)
   * @return InlineResponse20048
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20048 postNewsArticleListByMediaKind(PostNewsArticleListByMediaKindRequest postNewsArticleListByMediaKindRequest) throws ApiException {
    return postNewsArticleListByMediaKindWithHttpInfo(postNewsArticleListByMediaKindRequest).getData();
  }

  /**
   * List news articles which contain media of specific media kinds.
   * List news articles which contain media of specific media kinds.
   * @param postNewsArticleListByMediaKindRequest Request Body (required)
   * @return ApiResponse&lt;InlineResponse20048&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20048> postNewsArticleListByMediaKindWithHttpInfo(PostNewsArticleListByMediaKindRequest postNewsArticleListByMediaKindRequest) throws ApiException {
    Object localVarPostBody = postNewsArticleListByMediaKindRequest;
    
    // verify the required parameter 'postNewsArticleListByMediaKindRequest' is set
    if (postNewsArticleListByMediaKindRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'postNewsArticleListByMediaKindRequest' when calling postNewsArticleListByMediaKind");
    }
    
    // create path and map variables
    String localVarPath = "/news/article/list-by-media-kind";

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
        
        InlineResponse20048
      
    > apiResponse = apiClient.invokeAPI("NewsApi.postNewsArticleListByMediaKind", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, postNewsArticleListByMediaKindResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Search for news articles using a fulltext search.
   * Search for news articles using a fulltext search. All specified criteria need to be fulfilled for an article to match. Each criterion is handled according to its selectionType; \&quot;include\&quot; requires the criterion to evaluate to true, \&quot;exclude\&quot; requires the criterion to evaluate to false. A criterion is fulfilled when at least one of its values is found.
   * @param postNewsArticleSearchByTextRequest Request Body (optional)
   * @return InlineResponse20049
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20049 postNewsArticleSearchByText(PostNewsArticleSearchByTextRequest postNewsArticleSearchByTextRequest) throws ApiException {
    return postNewsArticleSearchByTextWithHttpInfo(postNewsArticleSearchByTextRequest).getData();
  }

  /**
   * Search for news articles using a fulltext search.
   * Search for news articles using a fulltext search. All specified criteria need to be fulfilled for an article to match. Each criterion is handled according to its selectionType; \&quot;include\&quot; requires the criterion to evaluate to true, \&quot;exclude\&quot; requires the criterion to evaluate to false. A criterion is fulfilled when at least one of its values is found.
   * @param postNewsArticleSearchByTextRequest Request Body (optional)
   * @return ApiResponse&lt;InlineResponse20049&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20049> postNewsArticleSearchByTextWithHttpInfo(PostNewsArticleSearchByTextRequest postNewsArticleSearchByTextRequest) throws ApiException {
    Object localVarPostBody = postNewsArticleSearchByTextRequest;
    
    // create path and map variables
    String localVarPath = "/news/article/search-by-text";

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
        
        InlineResponse20049
      
    > apiResponse = apiClient.invokeAPI("NewsApi.postNewsArticleSearchByText", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, postNewsArticleSearchByTextResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Search for publishers.
   * Search for publishers by the name of the publisher.
   * @param postNewsPublisherSearchByNameRequest Request Body (required)
   * @return InlineResponse20057
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20057 postNewsPublisherSearchByName(PostNewsPublisherSearchByNameRequest postNewsPublisherSearchByNameRequest) throws ApiException {
    return postNewsPublisherSearchByNameWithHttpInfo(postNewsPublisherSearchByNameRequest).getData();
  }

  /**
   * Search for publishers.
   * Search for publishers by the name of the publisher.
   * @param postNewsPublisherSearchByNameRequest Request Body (required)
   * @return ApiResponse&lt;InlineResponse20057&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20057> postNewsPublisherSearchByNameWithHttpInfo(PostNewsPublisherSearchByNameRequest postNewsPublisherSearchByNameRequest) throws ApiException {
    Object localVarPostBody = postNewsPublisherSearchByNameRequest;
    
    // verify the required parameter 'postNewsPublisherSearchByNameRequest' is set
    if (postNewsPublisherSearchByNameRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'postNewsPublisherSearchByNameRequest' when calling postNewsPublisherSearchByName");
    }
    
    // create path and map variables
    String localVarPath = "/news/publisher/search-by-name";

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
        
        InlineResponse20057
      
    > apiResponse = apiClient.invokeAPI("NewsApi.postNewsPublisherSearchByName", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, postNewsPublisherSearchByNameResponseTypeMap, false);

    return apiResponse;

  }
}
