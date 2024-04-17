package com.factset.sdk.StocksAPIforDigitalPortals.api;

import com.factset.sdk.StocksAPIforDigitalPortals.ApiException;
import com.factset.sdk.StocksAPIforDigitalPortals.ApiClient;
import com.factset.sdk.StocksAPIforDigitalPortals.ApiResponse;
import com.factset.sdk.StocksAPIforDigitalPortals.Configuration;
import com.factset.sdk.StocksAPIforDigitalPortals.Pair;

import jakarta.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse20010;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse20011;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse20012;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse20013;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse20014;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse20015;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse2003;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse2004;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse2008;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse2009;
import com.factset.sdk.StocksAPIforDigitalPortals.models.PostStockDividendListRequest;
import com.factset.sdk.StocksAPIforDigitalPortals.models.PostStockNotationRankingIntradayListRequest;
import com.factset.sdk.StocksAPIforDigitalPortals.models.PostStockNotationScreenerSearchRequest;
import com.factset.sdk.StocksAPIforDigitalPortals.models.PostStockNotationScreenerValueRangesGetRequest;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class StockApi {
  private ApiClient apiClient;

  public StockApi() {
    this(Configuration.getDefaultApiClient());
  }

  public StockApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> getStockCompositeProfileGetByNotationResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getStockCompositeProfileGetByNotationResponseTypeMap.put(200, new GenericType<InlineResponse2009>(){});
  }

  private static final Map<Integer, GenericType> getStockDividendTypeListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getStockDividendTypeListResponseTypeMap.put(200, new GenericType<InlineResponse20011>(){});
  }

  private static final Map<Integer, GenericType> getStockNotationKeyFiguresBenchmarkMonth1GetResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getStockNotationKeyFiguresBenchmarkMonth1GetResponseTypeMap.put(200, new GenericType<InlineResponse20012>(){});
  }

  private static final Map<Integer, GenericType> getStockNotationKeyFiguresBenchmarkMonth3GetResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getStockNotationKeyFiguresBenchmarkMonth3GetResponseTypeMap.put(200, new GenericType<InlineResponse20012>(){});
  }

  private static final Map<Integer, GenericType> getStockNotationKeyFiguresBenchmarkMonth6GetResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getStockNotationKeyFiguresBenchmarkMonth6GetResponseTypeMap.put(200, new GenericType<InlineResponse20012>(){});
  }

  private static final Map<Integer, GenericType> getStockNotationKeyFiguresBenchmarkWeek1GetResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getStockNotationKeyFiguresBenchmarkWeek1GetResponseTypeMap.put(200, new GenericType<InlineResponse20012>(){});
  }

  private static final Map<Integer, GenericType> getStockNotationKeyFiguresBenchmarkYear1GetResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getStockNotationKeyFiguresBenchmarkYear1GetResponseTypeMap.put(200, new GenericType<InlineResponse20012>(){});
  }

  private static final Map<Integer, GenericType> getStockNotationKeyFiguresBenchmarkYear3GetResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getStockNotationKeyFiguresBenchmarkYear3GetResponseTypeMap.put(200, new GenericType<InlineResponse20012>(){});
  }

  private static final Map<Integer, GenericType> getStockNotationKeyFiguresBenchmarkYear5GetResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getStockNotationKeyFiguresBenchmarkYear5GetResponseTypeMap.put(200, new GenericType<InlineResponse20012>(){});
  }

  private static final Map<Integer, GenericType> getStockOwnerListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getStockOwnerListResponseTypeMap.put(200, new GenericType<InlineResponse2008>(){});
  }

  private static final Map<Integer, GenericType> getStockRecommendationAggregateGetResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getStockRecommendationAggregateGetResponseTypeMap.put(200, new GenericType<InlineResponse2003>(){});
  }

  private static final Map<Integer, GenericType> getStockRecommendationAggregateHistoryListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getStockRecommendationAggregateHistoryListResponseTypeMap.put(200, new GenericType<InlineResponse2004>(){});
  }

  private static final Map<Integer, GenericType> postStockDividendListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    postStockDividendListResponseTypeMap.put(200, new GenericType<InlineResponse20010>(){});
  }

  private static final Map<Integer, GenericType> postStockNotationRankingIntradayListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    postStockNotationRankingIntradayListResponseTypeMap.put(200, new GenericType<InlineResponse20013>(){});
  }

  private static final Map<Integer, GenericType> postStockNotationScreenerSearchResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    postStockNotationScreenerSearchResponseTypeMap.put(200, new GenericType<InlineResponse20014>(){});
  }

  private static final Map<Integer, GenericType> postStockNotationScreenerValueRangesGetResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    postStockNotationScreenerValueRangesGetResponseTypeMap.put(200, new GenericType<InlineResponse20015>(){});
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
   * Provides key elements of a stock profile together with the profile of the issuing company.
   * Provides key elements of a stock profile together with the profile of the issuing company.
   * @param identifier  (required)
   * @param identifierType  (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language  (optional)
   * @return InlineResponse2009
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse2009 getStockCompositeProfileGetByNotation(String identifier, String identifierType, java.util.Set<String> attributes, String language) throws ApiException {
    return getStockCompositeProfileGetByNotationWithHttpInfo(identifier, identifierType, attributes, language).getData();
  }

  /**
   * Provides key elements of a stock profile together with the profile of the issuing company.
   * Provides key elements of a stock profile together with the profile of the issuing company.
   * @param identifier  (required)
   * @param identifierType  (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language  (optional)
   * @return ApiResponse&lt;InlineResponse2009&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse2009> getStockCompositeProfileGetByNotationWithHttpInfo(String identifier, String identifierType, java.util.Set<String> attributes, String language) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'identifier' is set
    if (identifier == null) {
      throw new ApiException(400, "Missing the required parameter 'identifier' when calling getStockCompositeProfileGetByNotation");
    }
    
    // verify the required parameter 'identifierType' is set
    if (identifierType == null) {
      throw new ApiException(400, "Missing the required parameter 'identifierType' when calling getStockCompositeProfileGetByNotation");
    }
    
    // create path and map variables
    String localVarPath = "/stock/composite/profile/getByNotation";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "identifier", identifier));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "identifierType", identifierType));
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
        
        InlineResponse2009
      
    > apiResponse = apiClient.invokeAPI("StockApi.getStockCompositeProfileGetByNotation", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getStockCompositeProfileGetByNotationResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * List of dividend types.
   * List of dividend types.
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language  (optional)
   * @return InlineResponse20011
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20011 getStockDividendTypeList(java.util.Set<String> attributes, String language) throws ApiException {
    return getStockDividendTypeListWithHttpInfo(attributes, language).getData();
  }

  /**
   * List of dividend types.
   * List of dividend types.
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language  (optional)
   * @return ApiResponse&lt;InlineResponse20011&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20011> getStockDividendTypeListWithHttpInfo(java.util.Set<String> attributes, String language) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/stock/dividend/type/list";

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
        
        InlineResponse20011
      
    > apiResponse = apiClient.invokeAPI("StockApi.getStockDividendTypeList", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getStockDividendTypeListResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * End-of-day (EOD) benchmark key figures of a stock for the time range of one month.
   * End-of-day (EOD) benchmark key figures of a stock for the time range of one month.
   * @param identifier  (required)
   * @param identifierType  (required)
   * @param idNotationBenchmark  (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language  (optional)
   * @return InlineResponse20012
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20012 getStockNotationKeyFiguresBenchmarkMonth1Get(String identifier, String identifierType, java.util.Set<String> idNotationBenchmark, java.util.Set<String> attributes, String language) throws ApiException {
    return getStockNotationKeyFiguresBenchmarkMonth1GetWithHttpInfo(identifier, identifierType, idNotationBenchmark, attributes, language).getData();
  }

  /**
   * End-of-day (EOD) benchmark key figures of a stock for the time range of one month.
   * End-of-day (EOD) benchmark key figures of a stock for the time range of one month.
   * @param identifier  (required)
   * @param identifierType  (required)
   * @param idNotationBenchmark  (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language  (optional)
   * @return ApiResponse&lt;InlineResponse20012&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20012> getStockNotationKeyFiguresBenchmarkMonth1GetWithHttpInfo(String identifier, String identifierType, java.util.Set<String> idNotationBenchmark, java.util.Set<String> attributes, String language) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'identifier' is set
    if (identifier == null) {
      throw new ApiException(400, "Missing the required parameter 'identifier' when calling getStockNotationKeyFiguresBenchmarkMonth1Get");
    }
    
    // verify the required parameter 'identifierType' is set
    if (identifierType == null) {
      throw new ApiException(400, "Missing the required parameter 'identifierType' when calling getStockNotationKeyFiguresBenchmarkMonth1Get");
    }
    
    // verify the required parameter 'idNotationBenchmark' is set
    if (idNotationBenchmark == null) {
      throw new ApiException(400, "Missing the required parameter 'idNotationBenchmark' when calling getStockNotationKeyFiguresBenchmarkMonth1Get");
    }
    
    // create path and map variables
    String localVarPath = "/stock/notation/keyFigures/benchmark/month/1/get";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "identifier", identifier));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "identifierType", identifierType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "idNotationBenchmark", idNotationBenchmark));
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
        
        InlineResponse20012
      
    > apiResponse = apiClient.invokeAPI("StockApi.getStockNotationKeyFiguresBenchmarkMonth1Get", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getStockNotationKeyFiguresBenchmarkMonth1GetResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * End-of-day (EOD) benchmark key figures of a stock for the time range of three months.
   * End-of-day (EOD) benchmark key figures of a stock for the time range of three months.
   * @param identifier  (required)
   * @param identifierType  (required)
   * @param idNotationBenchmark  (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language  (optional)
   * @return InlineResponse20012
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20012 getStockNotationKeyFiguresBenchmarkMonth3Get(String identifier, String identifierType, java.util.Set<String> idNotationBenchmark, java.util.Set<String> attributes, String language) throws ApiException {
    return getStockNotationKeyFiguresBenchmarkMonth3GetWithHttpInfo(identifier, identifierType, idNotationBenchmark, attributes, language).getData();
  }

  /**
   * End-of-day (EOD) benchmark key figures of a stock for the time range of three months.
   * End-of-day (EOD) benchmark key figures of a stock for the time range of three months.
   * @param identifier  (required)
   * @param identifierType  (required)
   * @param idNotationBenchmark  (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language  (optional)
   * @return ApiResponse&lt;InlineResponse20012&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20012> getStockNotationKeyFiguresBenchmarkMonth3GetWithHttpInfo(String identifier, String identifierType, java.util.Set<String> idNotationBenchmark, java.util.Set<String> attributes, String language) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'identifier' is set
    if (identifier == null) {
      throw new ApiException(400, "Missing the required parameter 'identifier' when calling getStockNotationKeyFiguresBenchmarkMonth3Get");
    }
    
    // verify the required parameter 'identifierType' is set
    if (identifierType == null) {
      throw new ApiException(400, "Missing the required parameter 'identifierType' when calling getStockNotationKeyFiguresBenchmarkMonth3Get");
    }
    
    // verify the required parameter 'idNotationBenchmark' is set
    if (idNotationBenchmark == null) {
      throw new ApiException(400, "Missing the required parameter 'idNotationBenchmark' when calling getStockNotationKeyFiguresBenchmarkMonth3Get");
    }
    
    // create path and map variables
    String localVarPath = "/stock/notation/keyFigures/benchmark/month/3/get";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "identifier", identifier));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "identifierType", identifierType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "idNotationBenchmark", idNotationBenchmark));
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
        
        InlineResponse20012
      
    > apiResponse = apiClient.invokeAPI("StockApi.getStockNotationKeyFiguresBenchmarkMonth3Get", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getStockNotationKeyFiguresBenchmarkMonth3GetResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * End-of-day (EOD) benchmark key figures of a stock for the time range of six months.
   * End-of-day (EOD) benchmark key figures of a stock for the time range of six months.
   * @param identifier  (required)
   * @param identifierType  (required)
   * @param idNotationBenchmark  (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language  (optional)
   * @return InlineResponse20012
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20012 getStockNotationKeyFiguresBenchmarkMonth6Get(String identifier, String identifierType, java.util.Set<String> idNotationBenchmark, java.util.Set<String> attributes, String language) throws ApiException {
    return getStockNotationKeyFiguresBenchmarkMonth6GetWithHttpInfo(identifier, identifierType, idNotationBenchmark, attributes, language).getData();
  }

  /**
   * End-of-day (EOD) benchmark key figures of a stock for the time range of six months.
   * End-of-day (EOD) benchmark key figures of a stock for the time range of six months.
   * @param identifier  (required)
   * @param identifierType  (required)
   * @param idNotationBenchmark  (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language  (optional)
   * @return ApiResponse&lt;InlineResponse20012&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20012> getStockNotationKeyFiguresBenchmarkMonth6GetWithHttpInfo(String identifier, String identifierType, java.util.Set<String> idNotationBenchmark, java.util.Set<String> attributes, String language) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'identifier' is set
    if (identifier == null) {
      throw new ApiException(400, "Missing the required parameter 'identifier' when calling getStockNotationKeyFiguresBenchmarkMonth6Get");
    }
    
    // verify the required parameter 'identifierType' is set
    if (identifierType == null) {
      throw new ApiException(400, "Missing the required parameter 'identifierType' when calling getStockNotationKeyFiguresBenchmarkMonth6Get");
    }
    
    // verify the required parameter 'idNotationBenchmark' is set
    if (idNotationBenchmark == null) {
      throw new ApiException(400, "Missing the required parameter 'idNotationBenchmark' when calling getStockNotationKeyFiguresBenchmarkMonth6Get");
    }
    
    // create path and map variables
    String localVarPath = "/stock/notation/keyFigures/benchmark/month/6/get";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "identifier", identifier));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "identifierType", identifierType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "idNotationBenchmark", idNotationBenchmark));
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
        
        InlineResponse20012
      
    > apiResponse = apiClient.invokeAPI("StockApi.getStockNotationKeyFiguresBenchmarkMonth6Get", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getStockNotationKeyFiguresBenchmarkMonth6GetResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * End-of-day (EOD) benchmark key figures of a stock for the time range of one week.
   * End-of-day (EOD) benchmark key figures of a stock for the time range of one week.
   * @param identifier  (required)
   * @param identifierType  (required)
   * @param idNotationBenchmark  (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language  (optional)
   * @return InlineResponse20012
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20012 getStockNotationKeyFiguresBenchmarkWeek1Get(String identifier, String identifierType, java.util.Set<String> idNotationBenchmark, java.util.Set<String> attributes, String language) throws ApiException {
    return getStockNotationKeyFiguresBenchmarkWeek1GetWithHttpInfo(identifier, identifierType, idNotationBenchmark, attributes, language).getData();
  }

  /**
   * End-of-day (EOD) benchmark key figures of a stock for the time range of one week.
   * End-of-day (EOD) benchmark key figures of a stock for the time range of one week.
   * @param identifier  (required)
   * @param identifierType  (required)
   * @param idNotationBenchmark  (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language  (optional)
   * @return ApiResponse&lt;InlineResponse20012&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20012> getStockNotationKeyFiguresBenchmarkWeek1GetWithHttpInfo(String identifier, String identifierType, java.util.Set<String> idNotationBenchmark, java.util.Set<String> attributes, String language) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'identifier' is set
    if (identifier == null) {
      throw new ApiException(400, "Missing the required parameter 'identifier' when calling getStockNotationKeyFiguresBenchmarkWeek1Get");
    }
    
    // verify the required parameter 'identifierType' is set
    if (identifierType == null) {
      throw new ApiException(400, "Missing the required parameter 'identifierType' when calling getStockNotationKeyFiguresBenchmarkWeek1Get");
    }
    
    // verify the required parameter 'idNotationBenchmark' is set
    if (idNotationBenchmark == null) {
      throw new ApiException(400, "Missing the required parameter 'idNotationBenchmark' when calling getStockNotationKeyFiguresBenchmarkWeek1Get");
    }
    
    // create path and map variables
    String localVarPath = "/stock/notation/keyFigures/benchmark/week/1/get";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "identifier", identifier));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "identifierType", identifierType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "idNotationBenchmark", idNotationBenchmark));
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
        
        InlineResponse20012
      
    > apiResponse = apiClient.invokeAPI("StockApi.getStockNotationKeyFiguresBenchmarkWeek1Get", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getStockNotationKeyFiguresBenchmarkWeek1GetResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * End-of-day (EOD) benchmark key figures of a stock for the time range of one year.
   * End-of-day (EOD) benchmark key figures of a stock for the time range of one year.
   * @param identifier  (required)
   * @param identifierType  (required)
   * @param idNotationBenchmark  (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language  (optional)
   * @return InlineResponse20012
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20012 getStockNotationKeyFiguresBenchmarkYear1Get(String identifier, String identifierType, java.util.Set<String> idNotationBenchmark, java.util.Set<String> attributes, String language) throws ApiException {
    return getStockNotationKeyFiguresBenchmarkYear1GetWithHttpInfo(identifier, identifierType, idNotationBenchmark, attributes, language).getData();
  }

  /**
   * End-of-day (EOD) benchmark key figures of a stock for the time range of one year.
   * End-of-day (EOD) benchmark key figures of a stock for the time range of one year.
   * @param identifier  (required)
   * @param identifierType  (required)
   * @param idNotationBenchmark  (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language  (optional)
   * @return ApiResponse&lt;InlineResponse20012&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20012> getStockNotationKeyFiguresBenchmarkYear1GetWithHttpInfo(String identifier, String identifierType, java.util.Set<String> idNotationBenchmark, java.util.Set<String> attributes, String language) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'identifier' is set
    if (identifier == null) {
      throw new ApiException(400, "Missing the required parameter 'identifier' when calling getStockNotationKeyFiguresBenchmarkYear1Get");
    }
    
    // verify the required parameter 'identifierType' is set
    if (identifierType == null) {
      throw new ApiException(400, "Missing the required parameter 'identifierType' when calling getStockNotationKeyFiguresBenchmarkYear1Get");
    }
    
    // verify the required parameter 'idNotationBenchmark' is set
    if (idNotationBenchmark == null) {
      throw new ApiException(400, "Missing the required parameter 'idNotationBenchmark' when calling getStockNotationKeyFiguresBenchmarkYear1Get");
    }
    
    // create path and map variables
    String localVarPath = "/stock/notation/keyFigures/benchmark/year/1/get";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "identifier", identifier));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "identifierType", identifierType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "idNotationBenchmark", idNotationBenchmark));
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
        
        InlineResponse20012
      
    > apiResponse = apiClient.invokeAPI("StockApi.getStockNotationKeyFiguresBenchmarkYear1Get", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getStockNotationKeyFiguresBenchmarkYear1GetResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * End-of-day (EOD) benchmark key figures of a stock for the time range of three years.
   * End-of-day (EOD) benchmark key figures of a stock for the time range of three years.
   * @param identifier  (required)
   * @param identifierType  (required)
   * @param idNotationBenchmark  (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language  (optional)
   * @return InlineResponse20012
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20012 getStockNotationKeyFiguresBenchmarkYear3Get(String identifier, String identifierType, java.util.Set<String> idNotationBenchmark, java.util.Set<String> attributes, String language) throws ApiException {
    return getStockNotationKeyFiguresBenchmarkYear3GetWithHttpInfo(identifier, identifierType, idNotationBenchmark, attributes, language).getData();
  }

  /**
   * End-of-day (EOD) benchmark key figures of a stock for the time range of three years.
   * End-of-day (EOD) benchmark key figures of a stock for the time range of three years.
   * @param identifier  (required)
   * @param identifierType  (required)
   * @param idNotationBenchmark  (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language  (optional)
   * @return ApiResponse&lt;InlineResponse20012&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20012> getStockNotationKeyFiguresBenchmarkYear3GetWithHttpInfo(String identifier, String identifierType, java.util.Set<String> idNotationBenchmark, java.util.Set<String> attributes, String language) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'identifier' is set
    if (identifier == null) {
      throw new ApiException(400, "Missing the required parameter 'identifier' when calling getStockNotationKeyFiguresBenchmarkYear3Get");
    }
    
    // verify the required parameter 'identifierType' is set
    if (identifierType == null) {
      throw new ApiException(400, "Missing the required parameter 'identifierType' when calling getStockNotationKeyFiguresBenchmarkYear3Get");
    }
    
    // verify the required parameter 'idNotationBenchmark' is set
    if (idNotationBenchmark == null) {
      throw new ApiException(400, "Missing the required parameter 'idNotationBenchmark' when calling getStockNotationKeyFiguresBenchmarkYear3Get");
    }
    
    // create path and map variables
    String localVarPath = "/stock/notation/keyFigures/benchmark/year/3/get";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "identifier", identifier));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "identifierType", identifierType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "idNotationBenchmark", idNotationBenchmark));
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
        
        InlineResponse20012
      
    > apiResponse = apiClient.invokeAPI("StockApi.getStockNotationKeyFiguresBenchmarkYear3Get", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getStockNotationKeyFiguresBenchmarkYear3GetResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * End-of-day (EOD) benchmark key figures of a stock for the time range of five years.
   * End-of-day (EOD) benchmark key figures of a stock for the time range of five years.
   * @param identifier  (required)
   * @param identifierType  (required)
   * @param idNotationBenchmark  (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language  (optional)
   * @return InlineResponse20012
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20012 getStockNotationKeyFiguresBenchmarkYear5Get(String identifier, String identifierType, java.util.Set<String> idNotationBenchmark, java.util.Set<String> attributes, String language) throws ApiException {
    return getStockNotationKeyFiguresBenchmarkYear5GetWithHttpInfo(identifier, identifierType, idNotationBenchmark, attributes, language).getData();
  }

  /**
   * End-of-day (EOD) benchmark key figures of a stock for the time range of five years.
   * End-of-day (EOD) benchmark key figures of a stock for the time range of five years.
   * @param identifier  (required)
   * @param identifierType  (required)
   * @param idNotationBenchmark  (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language  (optional)
   * @return ApiResponse&lt;InlineResponse20012&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20012> getStockNotationKeyFiguresBenchmarkYear5GetWithHttpInfo(String identifier, String identifierType, java.util.Set<String> idNotationBenchmark, java.util.Set<String> attributes, String language) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'identifier' is set
    if (identifier == null) {
      throw new ApiException(400, "Missing the required parameter 'identifier' when calling getStockNotationKeyFiguresBenchmarkYear5Get");
    }
    
    // verify the required parameter 'identifierType' is set
    if (identifierType == null) {
      throw new ApiException(400, "Missing the required parameter 'identifierType' when calling getStockNotationKeyFiguresBenchmarkYear5Get");
    }
    
    // verify the required parameter 'idNotationBenchmark' is set
    if (idNotationBenchmark == null) {
      throw new ApiException(400, "Missing the required parameter 'idNotationBenchmark' when calling getStockNotationKeyFiguresBenchmarkYear5Get");
    }
    
    // create path and map variables
    String localVarPath = "/stock/notation/keyFigures/benchmark/year/5/get";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "identifier", identifier));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "identifierType", identifierType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "idNotationBenchmark", idNotationBenchmark));
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
        
        InlineResponse20012
      
    > apiResponse = apiClient.invokeAPI("StockApi.getStockNotationKeyFiguresBenchmarkYear5Get", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getStockNotationKeyFiguresBenchmarkYear5GetResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * List of owners for a specific type of a company&#39;s shares.
   * List of top-20 owners for a specific type of a company&#39;s shares.
   * @param identifier  (required)
   * @param identifierType  (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language  (optional)
   * @return InlineResponse2008
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse2008 getStockOwnerList(String identifier, String identifierType, java.util.Set<String> attributes, String language) throws ApiException {
    return getStockOwnerListWithHttpInfo(identifier, identifierType, attributes, language).getData();
  }

  /**
   * List of owners for a specific type of a company&#39;s shares.
   * List of top-20 owners for a specific type of a company&#39;s shares.
   * @param identifier  (required)
   * @param identifierType  (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language  (optional)
   * @return ApiResponse&lt;InlineResponse2008&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse2008> getStockOwnerListWithHttpInfo(String identifier, String identifierType, java.util.Set<String> attributes, String language) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'identifier' is set
    if (identifier == null) {
      throw new ApiException(400, "Missing the required parameter 'identifier' when calling getStockOwnerList");
    }
    
    // verify the required parameter 'identifierType' is set
    if (identifierType == null) {
      throw new ApiException(400, "Missing the required parameter 'identifierType' when calling getStockOwnerList");
    }
    
    // create path and map variables
    String localVarPath = "/stock/owner/list";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "identifier", identifier));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "identifierType", identifierType));
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
        
        InlineResponse2008
      
    > apiResponse = apiClient.invokeAPI("StockApi.getStockOwnerList", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getStockOwnerListResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Target price and aggregated recommendations for a stock.
   * Target price and aggregated recommendations for a stock.
   * @param identifier  (required)
   * @param identifierType  (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @return InlineResponse2003
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse2003 getStockRecommendationAggregateGet(String identifier, String identifierType, java.util.Set<String> attributes) throws ApiException {
    return getStockRecommendationAggregateGetWithHttpInfo(identifier, identifierType, attributes).getData();
  }

  /**
   * Target price and aggregated recommendations for a stock.
   * Target price and aggregated recommendations for a stock.
   * @param identifier  (required)
   * @param identifierType  (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @return ApiResponse&lt;InlineResponse2003&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse2003> getStockRecommendationAggregateGetWithHttpInfo(String identifier, String identifierType, java.util.Set<String> attributes) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'identifier' is set
    if (identifier == null) {
      throw new ApiException(400, "Missing the required parameter 'identifier' when calling getStockRecommendationAggregateGet");
    }
    
    // verify the required parameter 'identifierType' is set
    if (identifierType == null) {
      throw new ApiException(400, "Missing the required parameter 'identifierType' when calling getStockRecommendationAggregateGet");
    }
    
    // create path and map variables
    String localVarPath = "/stock/recommendation/aggregate/get";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "identifier", identifier));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "identifierType", identifierType));
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
        
        InlineResponse2003
      
    > apiResponse = apiClient.invokeAPI("StockApi.getStockRecommendationAggregateGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getStockRecommendationAggregateGetResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Current and historical trade recommendations and target prices for a stock.
   * Current and historical trade recommendations and target prices for a stock.
   * @param identifier  (required)
   * @param identifierType  (required)
   * @param snapshots  (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @return InlineResponse2004
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse2004 getStockRecommendationAggregateHistoryList(String identifier, String identifierType, java.util.Set<String> snapshots, java.util.Set<String> attributes) throws ApiException {
    return getStockRecommendationAggregateHistoryListWithHttpInfo(identifier, identifierType, snapshots, attributes).getData();
  }

  /**
   * Current and historical trade recommendations and target prices for a stock.
   * Current and historical trade recommendations and target prices for a stock.
   * @param identifier  (required)
   * @param identifierType  (required)
   * @param snapshots  (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @return ApiResponse&lt;InlineResponse2004&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse2004> getStockRecommendationAggregateHistoryListWithHttpInfo(String identifier, String identifierType, java.util.Set<String> snapshots, java.util.Set<String> attributes) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'identifier' is set
    if (identifier == null) {
      throw new ApiException(400, "Missing the required parameter 'identifier' when calling getStockRecommendationAggregateHistoryList");
    }
    
    // verify the required parameter 'identifierType' is set
    if (identifierType == null) {
      throw new ApiException(400, "Missing the required parameter 'identifierType' when calling getStockRecommendationAggregateHistoryList");
    }
    
    // verify the required parameter 'snapshots' is set
    if (snapshots == null) {
      throw new ApiException(400, "Missing the required parameter 'snapshots' when calling getStockRecommendationAggregateHistoryList");
    }
    
    // create path and map variables
    String localVarPath = "/stock/recommendation/aggregate/history/list";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "identifier", identifier));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "identifierType", identifierType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "snapshots", snapshots));
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
        
        InlineResponse2004
      
    > apiResponse = apiClient.invokeAPI("StockApi.getStockRecommendationAggregateHistoryList", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getStockRecommendationAggregateHistoryListResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * List of dividends for a stock.
   * List of dividends for a stock.
   * @param postStockDividendListRequest  (optional)
   * @return InlineResponse20010
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20010 postStockDividendList(PostStockDividendListRequest postStockDividendListRequest) throws ApiException {
    return postStockDividendListWithHttpInfo(postStockDividendListRequest).getData();
  }

  /**
   * List of dividends for a stock.
   * List of dividends for a stock.
   * @param postStockDividendListRequest  (optional)
   * @return ApiResponse&lt;InlineResponse20010&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20010> postStockDividendListWithHttpInfo(PostStockDividendListRequest postStockDividendListRequest) throws ApiException {
    Object localVarPostBody = postStockDividendListRequest;
    
    // create path and map variables
    String localVarPath = "/stock/dividend/list";

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
      
    > apiResponse = apiClient.invokeAPI("StockApi.postStockDividendList", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, postStockDividendListResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Ranking of stocks&#39; notations using intraday figures.
   * Ranking of stocks&#39; notations using intraday figures. The result is limited to 100 notations that all must satisfy all selected filters. If more than one notation of an instrument matches the parameters, and no market priority has been specified, only the notation with the highest trading volume, averaged over one month, is considered.  By default, the result is sorted descending by the relative intraday performance corresponding to the most recent trade price, see attribute &#x60;trade.performance.relative&#x60;. The result may contain sortable values based on different currencies, possibly making the ranking nonsensical, if the parameter &#x60;currency&#x60; has not been specified.&#x60;  The search can be restricted to a specific set of products by using customer-specific instrument or notation restriction lists. Such restriction lists are set up by FactSet upon request.  All identifiers used as parameters must be valid and entitled.
   * @param postStockNotationRankingIntradayListRequest  (optional)
   * @return InlineResponse20013
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20013 postStockNotationRankingIntradayList(PostStockNotationRankingIntradayListRequest postStockNotationRankingIntradayListRequest) throws ApiException {
    return postStockNotationRankingIntradayListWithHttpInfo(postStockNotationRankingIntradayListRequest).getData();
  }

  /**
   * Ranking of stocks&#39; notations using intraday figures.
   * Ranking of stocks&#39; notations using intraday figures. The result is limited to 100 notations that all must satisfy all selected filters. If more than one notation of an instrument matches the parameters, and no market priority has been specified, only the notation with the highest trading volume, averaged over one month, is considered.  By default, the result is sorted descending by the relative intraday performance corresponding to the most recent trade price, see attribute &#x60;trade.performance.relative&#x60;. The result may contain sortable values based on different currencies, possibly making the ranking nonsensical, if the parameter &#x60;currency&#x60; has not been specified.&#x60;  The search can be restricted to a specific set of products by using customer-specific instrument or notation restriction lists. Such restriction lists are set up by FactSet upon request.  All identifiers used as parameters must be valid and entitled.
   * @param postStockNotationRankingIntradayListRequest  (optional)
   * @return ApiResponse&lt;InlineResponse20013&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20013> postStockNotationRankingIntradayListWithHttpInfo(PostStockNotationRankingIntradayListRequest postStockNotationRankingIntradayListRequest) throws ApiException {
    Object localVarPostBody = postStockNotationRankingIntradayListRequest;
    
    // create path and map variables
    String localVarPath = "/stock/notation/ranking/intraday/list";

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
        
        InlineResponse20013
      
    > apiResponse = apiClient.invokeAPI("StockApi.postStockNotationRankingIntradayList", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, postStockNotationRankingIntradayListResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Screener for stocks&#39; notations based on stock-specific parameters.
   * Screener for stocks&#39; notations based on stock-specific parameters. The result is limited to the notations that satisfy all the selected filters. If more than one notation of an instrument matches the parameters, and no market priority has been specified, only the notation with the highest trading volume, averaged over one month, is considered.  Currency dependent current figures on company level (see attribute &#x60;currentKeyFigures.company.currencyDependent&#x60;) or on share instrument level (see attribute &#x60;currentKeyFigures.shareInstrument.currencyDependent&#x60;) are only returned if the currency (see parameter &#x60;currentKeyFigures.company.currencyDependent.currency.isoCode&#x60; or parameter &#x60;currentKeyFigures.shareInstrument.currencyDependent.currency.isoCode&#x60; respectively) are set.  Parameters for up to three fiscal years might be used in one request, see attribute &#x60;reportedKeyFigures&#x60;; data is available for the ten most recent completed fiscal years. Estimates are available for the current and two consecutive fiscal years; parameters for all three might be used in one request, see attribute &#x60;estimates&#x60;. The estimated values are calculated as the average of the most recent estimates provided by all analysts in a fixed time frame of 100 days. Screening and sorting by a currency-dependent attribute is not possible if the currency (see parameter &#x60;reportedKeyFigures.currencyDependentKeyFigures.currency.isoCode&#x60; and parameter &#x60;estimates.currencyDependentEstimates.currency.isoCode&#x60; respectively) is not set. If a fiscal year for the data as of the end of a fiscal year (see parameter &#x60;reportedKeyFigures.fiscalYear&#x60;) or for the estimates (see parameter &#x60;estimates.fiscalYear&#x60;) has been selected but no currency has been set, the respective data will be returned in the currency in which it was originally reported.  A specific set of stocks can be restricted to or excluded by using customer-specific instrument or notation selection lists. Such selection lists are set up by FactSet upon request. All identifiers used as parameters must be valid and entitled.
   * @param postStockNotationScreenerSearchRequest  (optional)
   * @return InlineResponse20014
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20014 postStockNotationScreenerSearch(PostStockNotationScreenerSearchRequest postStockNotationScreenerSearchRequest) throws ApiException {
    return postStockNotationScreenerSearchWithHttpInfo(postStockNotationScreenerSearchRequest).getData();
  }

  /**
   * Screener for stocks&#39; notations based on stock-specific parameters.
   * Screener for stocks&#39; notations based on stock-specific parameters. The result is limited to the notations that satisfy all the selected filters. If more than one notation of an instrument matches the parameters, and no market priority has been specified, only the notation with the highest trading volume, averaged over one month, is considered.  Currency dependent current figures on company level (see attribute &#x60;currentKeyFigures.company.currencyDependent&#x60;) or on share instrument level (see attribute &#x60;currentKeyFigures.shareInstrument.currencyDependent&#x60;) are only returned if the currency (see parameter &#x60;currentKeyFigures.company.currencyDependent.currency.isoCode&#x60; or parameter &#x60;currentKeyFigures.shareInstrument.currencyDependent.currency.isoCode&#x60; respectively) are set.  Parameters for up to three fiscal years might be used in one request, see attribute &#x60;reportedKeyFigures&#x60;; data is available for the ten most recent completed fiscal years. Estimates are available for the current and two consecutive fiscal years; parameters for all three might be used in one request, see attribute &#x60;estimates&#x60;. The estimated values are calculated as the average of the most recent estimates provided by all analysts in a fixed time frame of 100 days. Screening and sorting by a currency-dependent attribute is not possible if the currency (see parameter &#x60;reportedKeyFigures.currencyDependentKeyFigures.currency.isoCode&#x60; and parameter &#x60;estimates.currencyDependentEstimates.currency.isoCode&#x60; respectively) is not set. If a fiscal year for the data as of the end of a fiscal year (see parameter &#x60;reportedKeyFigures.fiscalYear&#x60;) or for the estimates (see parameter &#x60;estimates.fiscalYear&#x60;) has been selected but no currency has been set, the respective data will be returned in the currency in which it was originally reported.  A specific set of stocks can be restricted to or excluded by using customer-specific instrument or notation selection lists. Such selection lists are set up by FactSet upon request. All identifiers used as parameters must be valid and entitled.
   * @param postStockNotationScreenerSearchRequest  (optional)
   * @return ApiResponse&lt;InlineResponse20014&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20014> postStockNotationScreenerSearchWithHttpInfo(PostStockNotationScreenerSearchRequest postStockNotationScreenerSearchRequest) throws ApiException {
    Object localVarPostBody = postStockNotationScreenerSearchRequest;
    
    // create path and map variables
    String localVarPath = "/stock/notation/screener/search";

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
        
        InlineResponse20014
      
    > apiResponse = apiClient.invokeAPI("StockApi.postStockNotationScreenerSearch", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, postStockNotationScreenerSearchResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Possible values and value ranges for the parameters used in the endpoint &#x60;/stock/notation/screener/search&#x60;.
   * The endpoint returns the possible values and value ranges for the parameters used in the endpoint &#x60;/stock/notation/screener/search&#x60;. It allows to request the values and value ranges only for a restricted set of notations that match predefined parameters. The functionality may be used to pre-fill the values and value ranges of the parameters of the &#x60;/stock/notation/screener/search&#x60; endpoint so that performing a search always leads to a non-empty set of notations. If more than one notation of an instrument matches the parameters, and no market priority has been specified, only the notation with the highest trading volume, averaged over one month, is considered. For more information regarding the performance and volatility parameters, see the information available in the group description of the &#x60;/notation/keyFigures/&#x60; endpoints.
   * @param postStockNotationScreenerValueRangesGetRequest  (optional)
   * @return InlineResponse20015
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20015 postStockNotationScreenerValueRangesGet(PostStockNotationScreenerValueRangesGetRequest postStockNotationScreenerValueRangesGetRequest) throws ApiException {
    return postStockNotationScreenerValueRangesGetWithHttpInfo(postStockNotationScreenerValueRangesGetRequest).getData();
  }

  /**
   * Possible values and value ranges for the parameters used in the endpoint &#x60;/stock/notation/screener/search&#x60;.
   * The endpoint returns the possible values and value ranges for the parameters used in the endpoint &#x60;/stock/notation/screener/search&#x60;. It allows to request the values and value ranges only for a restricted set of notations that match predefined parameters. The functionality may be used to pre-fill the values and value ranges of the parameters of the &#x60;/stock/notation/screener/search&#x60; endpoint so that performing a search always leads to a non-empty set of notations. If more than one notation of an instrument matches the parameters, and no market priority has been specified, only the notation with the highest trading volume, averaged over one month, is considered. For more information regarding the performance and volatility parameters, see the information available in the group description of the &#x60;/notation/keyFigures/&#x60; endpoints.
   * @param postStockNotationScreenerValueRangesGetRequest  (optional)
   * @return ApiResponse&lt;InlineResponse20015&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20015> postStockNotationScreenerValueRangesGetWithHttpInfo(PostStockNotationScreenerValueRangesGetRequest postStockNotationScreenerValueRangesGetRequest) throws ApiException {
    Object localVarPostBody = postStockNotationScreenerValueRangesGetRequest;
    
    // create path and map variables
    String localVarPath = "/stock/notation/screener/valueRanges/get";

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
        
        InlineResponse20015
      
    > apiResponse = apiClient.invokeAPI("StockApi.postStockNotationScreenerValueRangesGet", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, postStockNotationScreenerValueRangesGetResponseTypeMap, false);

    return apiResponse;

  }
}
