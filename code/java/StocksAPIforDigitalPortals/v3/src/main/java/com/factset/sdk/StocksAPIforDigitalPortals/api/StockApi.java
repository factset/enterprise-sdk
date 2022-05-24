package com.factset.sdk.StocksAPIforDigitalPortals.api;

import com.factset.sdk.StocksAPIforDigitalPortals.ApiException;
import com.factset.sdk.StocksAPIforDigitalPortals.ApiClient;
import com.factset.sdk.StocksAPIforDigitalPortals.ApiResponse;
import com.factset.sdk.StocksAPIforDigitalPortals.Configuration;
import com.factset.sdk.StocksAPIforDigitalPortals.Pair;

import javax.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineObject1;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineObject2;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineObject3;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineObject4;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse2001;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse20010;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse20011;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse20012;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse2002;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse2006;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse2007;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse2008;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse2009;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class StockApi {
  private ApiClient apiClient;

  public StockApi() {
    this(Configuration.getDefaultApiClient());
  }

  public StockApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

    private static final Map<Integer, GenericType> getStockDividendTypeListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getStockDividendTypeListResponseTypeMap.put(200, new GenericType<InlineResponse2008>(){});
  }
  private static final Map<Integer, GenericType> getStockNotationKeyFiguresBenchmarkMonth1GetResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getStockNotationKeyFiguresBenchmarkMonth1GetResponseTypeMap.put(200, new GenericType<InlineResponse2009>(){});
  }
  private static final Map<Integer, GenericType> getStockNotationKeyFiguresBenchmarkMonth3GetResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getStockNotationKeyFiguresBenchmarkMonth3GetResponseTypeMap.put(200, new GenericType<InlineResponse2009>(){});
  }
  private static final Map<Integer, GenericType> getStockNotationKeyFiguresBenchmarkWeek1GetResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getStockNotationKeyFiguresBenchmarkWeek1GetResponseTypeMap.put(200, new GenericType<InlineResponse2009>(){});
  }
  private static final Map<Integer, GenericType> getStockNotationKeyFiguresBenchmarkYear1GetResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getStockNotationKeyFiguresBenchmarkYear1GetResponseTypeMap.put(200, new GenericType<InlineResponse2009>(){});
  }
  private static final Map<Integer, GenericType> getStockNotationKeyFiguresBenchmarkYear3GetResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getStockNotationKeyFiguresBenchmarkYear3GetResponseTypeMap.put(200, new GenericType<InlineResponse2009>(){});
  }
  private static final Map<Integer, GenericType> getStockNotationKeyFiguresBenchmarkYear5GetResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getStockNotationKeyFiguresBenchmarkYear5GetResponseTypeMap.put(200, new GenericType<InlineResponse2009>(){});
  }
  private static final Map<Integer, GenericType> getStockOwnerListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getStockOwnerListResponseTypeMap.put(200, new GenericType<InlineResponse2006>(){});
  }
  private static final Map<Integer, GenericType> getStockRecommendationAggregateGetResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getStockRecommendationAggregateGetResponseTypeMap.put(200, new GenericType<InlineResponse2001>(){});
  }
  private static final Map<Integer, GenericType> getStockRecommendationAggregateHistoryListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getStockRecommendationAggregateHistoryListResponseTypeMap.put(200, new GenericType<InlineResponse2002>(){});
  }
  private static final Map<Integer, GenericType> postStockDividendListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    postStockDividendListResponseTypeMap.put(200, new GenericType<InlineResponse2007>(){});
  }
  private static final Map<Integer, GenericType> postStockNotationRankingIntradayListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    postStockNotationRankingIntradayListResponseTypeMap.put(200, new GenericType<InlineResponse20010>(){});
  }
  private static final Map<Integer, GenericType> postStockNotationScreenerSearchResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    postStockNotationScreenerSearchResponseTypeMap.put(200, new GenericType<InlineResponse20011>(){});
  }
  private static final Map<Integer, GenericType> postStockNotationScreenerValueRangesGetResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    postStockNotationScreenerValueRangesGetResponseTypeMap.put(200, new GenericType<InlineResponse20012>(){});
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
   * List of dividend types.
   * List of dividend types.
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language ISO 639-1 code of the language. (optional)
   * @return InlineResponse2008
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse2008 getStockDividendTypeList(java.util.Set<String> attributes, String language) throws ApiException {
    return getStockDividendTypeListWithHttpInfo(attributes, language).getData();
  }

  /**
   * List of dividend types.
   * List of dividend types.
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language ISO 639-1 code of the language. (optional)
   * @return ApiResponse&lt;InlineResponse2008&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse2008> getStockDividendTypeListWithHttpInfo(java.util.Set<String> attributes, String language) throws ApiException {
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
        
        InlineResponse2008
      
    > apiResponse = apiClient.invokeAPI("StockApi.getStockDividendTypeList", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getStockDividendTypeListResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * End-of-day (EOD) benchmark key figures of a stock for the time range of one month.
   * End-of-day (EOD) benchmark key figures of a stock for the time range of one month.
   * @param id Identifier of the notation. (required)
   * @param idNotationBenchmark List of identifiers of benchmark notations. See the group description for the list of valid values. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language ISO 639-1 code of the language. (optional)
   * @return InlineResponse2009
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse2009 getStockNotationKeyFiguresBenchmarkMonth1Get(String id, java.util.Set<String> idNotationBenchmark, java.util.Set<String> attributes, String language) throws ApiException {
    return getStockNotationKeyFiguresBenchmarkMonth1GetWithHttpInfo(id, idNotationBenchmark, attributes, language).getData();
  }

  /**
   * End-of-day (EOD) benchmark key figures of a stock for the time range of one month.
   * End-of-day (EOD) benchmark key figures of a stock for the time range of one month.
   * @param id Identifier of the notation. (required)
   * @param idNotationBenchmark List of identifiers of benchmark notations. See the group description for the list of valid values. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language ISO 639-1 code of the language. (optional)
   * @return ApiResponse&lt;InlineResponse2009&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse2009> getStockNotationKeyFiguresBenchmarkMonth1GetWithHttpInfo(String id, java.util.Set<String> idNotationBenchmark, java.util.Set<String> attributes, String language) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getStockNotationKeyFiguresBenchmarkMonth1Get");
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

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "id", id));
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
        
        InlineResponse2009
      
    > apiResponse = apiClient.invokeAPI("StockApi.getStockNotationKeyFiguresBenchmarkMonth1Get", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getStockNotationKeyFiguresBenchmarkMonth1GetResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * End-of-day (EOD) benchmark key figures of a stock for the time range of three months.
   * End-of-day (EOD) benchmark key figures of a stock for the time range of three months.
   * @param id Identifier of the notation. (required)
   * @param idNotationBenchmark List of identifiers of benchmark notations. See the group description for the list of valid values. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language ISO 639-1 code of the language. (optional)
   * @return InlineResponse2009
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse2009 getStockNotationKeyFiguresBenchmarkMonth3Get(String id, java.util.Set<String> idNotationBenchmark, java.util.Set<String> attributes, String language) throws ApiException {
    return getStockNotationKeyFiguresBenchmarkMonth3GetWithHttpInfo(id, idNotationBenchmark, attributes, language).getData();
  }

  /**
   * End-of-day (EOD) benchmark key figures of a stock for the time range of three months.
   * End-of-day (EOD) benchmark key figures of a stock for the time range of three months.
   * @param id Identifier of the notation. (required)
   * @param idNotationBenchmark List of identifiers of benchmark notations. See the group description for the list of valid values. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language ISO 639-1 code of the language. (optional)
   * @return ApiResponse&lt;InlineResponse2009&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse2009> getStockNotationKeyFiguresBenchmarkMonth3GetWithHttpInfo(String id, java.util.Set<String> idNotationBenchmark, java.util.Set<String> attributes, String language) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getStockNotationKeyFiguresBenchmarkMonth3Get");
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

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "id", id));
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
        
        InlineResponse2009
      
    > apiResponse = apiClient.invokeAPI("StockApi.getStockNotationKeyFiguresBenchmarkMonth3Get", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getStockNotationKeyFiguresBenchmarkMonth3GetResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * End-of-day (EOD) benchmark key figures of a stock for the time range of one week.
   * End-of-day (EOD) benchmark key figures of a stock for the time range of one week.
   * @param id Identifier of the notation. (required)
   * @param idNotationBenchmark List of identifiers of benchmark notations. See the group description for the list of valid values. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language ISO 639-1 code of the language. (optional)
   * @return InlineResponse2009
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse2009 getStockNotationKeyFiguresBenchmarkWeek1Get(String id, java.util.Set<String> idNotationBenchmark, java.util.Set<String> attributes, String language) throws ApiException {
    return getStockNotationKeyFiguresBenchmarkWeek1GetWithHttpInfo(id, idNotationBenchmark, attributes, language).getData();
  }

  /**
   * End-of-day (EOD) benchmark key figures of a stock for the time range of one week.
   * End-of-day (EOD) benchmark key figures of a stock for the time range of one week.
   * @param id Identifier of the notation. (required)
   * @param idNotationBenchmark List of identifiers of benchmark notations. See the group description for the list of valid values. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language ISO 639-1 code of the language. (optional)
   * @return ApiResponse&lt;InlineResponse2009&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse2009> getStockNotationKeyFiguresBenchmarkWeek1GetWithHttpInfo(String id, java.util.Set<String> idNotationBenchmark, java.util.Set<String> attributes, String language) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getStockNotationKeyFiguresBenchmarkWeek1Get");
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

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "id", id));
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
        
        InlineResponse2009
      
    > apiResponse = apiClient.invokeAPI("StockApi.getStockNotationKeyFiguresBenchmarkWeek1Get", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getStockNotationKeyFiguresBenchmarkWeek1GetResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * End-of-day (EOD) benchmark key figures of a stock for the time range of one year.
   * End-of-day (EOD) benchmark key figures of a stock for the time range of one year.
   * @param id Identifier of the notation. (required)
   * @param idNotationBenchmark List of identifiers of benchmark notations. See the group description for the list of valid values. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language ISO 639-1 code of the language. (optional)
   * @return InlineResponse2009
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse2009 getStockNotationKeyFiguresBenchmarkYear1Get(String id, java.util.Set<String> idNotationBenchmark, java.util.Set<String> attributes, String language) throws ApiException {
    return getStockNotationKeyFiguresBenchmarkYear1GetWithHttpInfo(id, idNotationBenchmark, attributes, language).getData();
  }

  /**
   * End-of-day (EOD) benchmark key figures of a stock for the time range of one year.
   * End-of-day (EOD) benchmark key figures of a stock for the time range of one year.
   * @param id Identifier of the notation. (required)
   * @param idNotationBenchmark List of identifiers of benchmark notations. See the group description for the list of valid values. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language ISO 639-1 code of the language. (optional)
   * @return ApiResponse&lt;InlineResponse2009&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse2009> getStockNotationKeyFiguresBenchmarkYear1GetWithHttpInfo(String id, java.util.Set<String> idNotationBenchmark, java.util.Set<String> attributes, String language) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getStockNotationKeyFiguresBenchmarkYear1Get");
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

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "id", id));
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
        
        InlineResponse2009
      
    > apiResponse = apiClient.invokeAPI("StockApi.getStockNotationKeyFiguresBenchmarkYear1Get", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getStockNotationKeyFiguresBenchmarkYear1GetResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * End-of-day (EOD) benchmark key figures of a stock for the time range of three years.
   * End-of-day (EOD) benchmark key figures of a stock for the time range of three years.
   * @param id Identifier of the notation. (required)
   * @param idNotationBenchmark List of identifiers of benchmark notations. See the group description for the list of valid values. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language ISO 639-1 code of the language. (optional)
   * @return InlineResponse2009
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse2009 getStockNotationKeyFiguresBenchmarkYear3Get(String id, java.util.Set<String> idNotationBenchmark, java.util.Set<String> attributes, String language) throws ApiException {
    return getStockNotationKeyFiguresBenchmarkYear3GetWithHttpInfo(id, idNotationBenchmark, attributes, language).getData();
  }

  /**
   * End-of-day (EOD) benchmark key figures of a stock for the time range of three years.
   * End-of-day (EOD) benchmark key figures of a stock for the time range of three years.
   * @param id Identifier of the notation. (required)
   * @param idNotationBenchmark List of identifiers of benchmark notations. See the group description for the list of valid values. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language ISO 639-1 code of the language. (optional)
   * @return ApiResponse&lt;InlineResponse2009&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse2009> getStockNotationKeyFiguresBenchmarkYear3GetWithHttpInfo(String id, java.util.Set<String> idNotationBenchmark, java.util.Set<String> attributes, String language) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getStockNotationKeyFiguresBenchmarkYear3Get");
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

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "id", id));
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
        
        InlineResponse2009
      
    > apiResponse = apiClient.invokeAPI("StockApi.getStockNotationKeyFiguresBenchmarkYear3Get", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getStockNotationKeyFiguresBenchmarkYear3GetResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * End-of-day (EOD) benchmark key figures of a stock for the time range of five years.
   * End-of-day (EOD) benchmark key figures of a stock for the time range of five years.
   * @param id Identifier of the notation. (required)
   * @param idNotationBenchmark List of identifiers of benchmark notations. See the group description for the list of valid values. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language ISO 639-1 code of the language. (optional)
   * @return InlineResponse2009
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse2009 getStockNotationKeyFiguresBenchmarkYear5Get(String id, java.util.Set<String> idNotationBenchmark, java.util.Set<String> attributes, String language) throws ApiException {
    return getStockNotationKeyFiguresBenchmarkYear5GetWithHttpInfo(id, idNotationBenchmark, attributes, language).getData();
  }

  /**
   * End-of-day (EOD) benchmark key figures of a stock for the time range of five years.
   * End-of-day (EOD) benchmark key figures of a stock for the time range of five years.
   * @param id Identifier of the notation. (required)
   * @param idNotationBenchmark List of identifiers of benchmark notations. See the group description for the list of valid values. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language ISO 639-1 code of the language. (optional)
   * @return ApiResponse&lt;InlineResponse2009&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse2009> getStockNotationKeyFiguresBenchmarkYear5GetWithHttpInfo(String id, java.util.Set<String> idNotationBenchmark, java.util.Set<String> attributes, String language) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getStockNotationKeyFiguresBenchmarkYear5Get");
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

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "id", id));
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
        
        InlineResponse2009
      
    > apiResponse = apiClient.invokeAPI("StockApi.getStockNotationKeyFiguresBenchmarkYear5Get", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getStockNotationKeyFiguresBenchmarkYear5GetResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * List of owners for a specific type of a company&#39;s shares.
   * List of top-20 owners for a specific type of a company&#39;s shares.
   * @param id Identifier of the instrument. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language ISO 639-1 code of the language. (optional)
   * @return InlineResponse2006
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse2006 getStockOwnerList(String id, java.util.Set<String> attributes, String language) throws ApiException {
    return getStockOwnerListWithHttpInfo(id, attributes, language).getData();
  }

  /**
   * List of owners for a specific type of a company&#39;s shares.
   * List of top-20 owners for a specific type of a company&#39;s shares.
   * @param id Identifier of the instrument. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language ISO 639-1 code of the language. (optional)
   * @return ApiResponse&lt;InlineResponse2006&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse2006> getStockOwnerListWithHttpInfo(String id, java.util.Set<String> attributes, String language) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getStockOwnerList");
    }
    
    // create path and map variables
    String localVarPath = "/stock/owner/list";

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
        
        InlineResponse2006
      
    > apiResponse = apiClient.invokeAPI("StockApi.getStockOwnerList", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getStockOwnerListResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Target price and aggregated recommendations for a stock.
   * Target price and aggregated recommendations for a stock.
   * @param id Identifier of an instrument. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @return InlineResponse2001
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse2001 getStockRecommendationAggregateGet(String id, java.util.Set<String> attributes) throws ApiException {
    return getStockRecommendationAggregateGetWithHttpInfo(id, attributes).getData();
  }

  /**
   * Target price and aggregated recommendations for a stock.
   * Target price and aggregated recommendations for a stock.
   * @param id Identifier of an instrument. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @return ApiResponse&lt;InlineResponse2001&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse2001> getStockRecommendationAggregateGetWithHttpInfo(String id, java.util.Set<String> attributes) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getStockRecommendationAggregateGet");
    }
    
    // create path and map variables
    String localVarPath = "/stock/recommendation/aggregate/get";

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
      
    > apiResponse = apiClient.invokeAPI("StockApi.getStockRecommendationAggregateGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getStockRecommendationAggregateGetResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Current and historical trade recommendations and target prices for a stock.
   * Current and historical trade recommendations and target prices for a stock.
   * @param id Identifier of an instrument. (required)
   * @param snapshots Choice of historic snapshots for aggregated recommendations. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @return InlineResponse2002
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse2002 getStockRecommendationAggregateHistoryList(String id, java.util.Set<String> snapshots, java.util.Set<String> attributes) throws ApiException {
    return getStockRecommendationAggregateHistoryListWithHttpInfo(id, snapshots, attributes).getData();
  }

  /**
   * Current and historical trade recommendations and target prices for a stock.
   * Current and historical trade recommendations and target prices for a stock.
   * @param id Identifier of an instrument. (required)
   * @param snapshots Choice of historic snapshots for aggregated recommendations. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @return ApiResponse&lt;InlineResponse2002&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse2002> getStockRecommendationAggregateHistoryListWithHttpInfo(String id, java.util.Set<String> snapshots, java.util.Set<String> attributes) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getStockRecommendationAggregateHistoryList");
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

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "id", id));
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
        
        InlineResponse2002
      
    > apiResponse = apiClient.invokeAPI("StockApi.getStockRecommendationAggregateHistoryList", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getStockRecommendationAggregateHistoryListResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * List of dividends for a stock.
   * List of dividends for a stock.
   * @param body  (required)
   * @return InlineResponse2007
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse2007 postStockDividendList(InlineObject1 body) throws ApiException {
    return postStockDividendListWithHttpInfo(body).getData();
  }

  /**
   * List of dividends for a stock.
   * List of dividends for a stock.
   * @param body  (required)
   * @return ApiResponse&lt;InlineResponse2007&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse2007> postStockDividendListWithHttpInfo(InlineObject1 body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling postStockDividendList");
    }
    
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
        
        InlineResponse2007
      
    > apiResponse = apiClient.invokeAPI("StockApi.postStockDividendList", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, postStockDividendListResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Ranking of stocks&#39; notations using intraday figures.
   * Ranking of stocks&#39; notations using intraday figures. The result is limited to 100 notations that all must satisfy all selected filters. If more than one notation of an instrument matches the parameters, and no market priority has been specified, only the notation with the highest trading volume, averaged over one month, is considered.  By default, the result is sorted descending by the relative intraday performance corresponding to the most recent trade price, see attribute &#x60;trade.performance.relative&#x60;. The result may contain sortable values based on different currencies, possibly making the ranking nonsensical, if the parameter &#x60;currency&#x60; has not been specified.&#x60;  The search can be restricted to a specific set of products by using customer-specific instrument or notation restriction lists. Such restriction lists are set up by FactSet upon request.  All identifiers used as parameters must be valid and entitled.
   * @param body  (optional)
   * @return InlineResponse20010
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20010 postStockNotationRankingIntradayList(InlineObject2 body) throws ApiException {
    return postStockNotationRankingIntradayListWithHttpInfo(body).getData();
  }

  /**
   * Ranking of stocks&#39; notations using intraday figures.
   * Ranking of stocks&#39; notations using intraday figures. The result is limited to 100 notations that all must satisfy all selected filters. If more than one notation of an instrument matches the parameters, and no market priority has been specified, only the notation with the highest trading volume, averaged over one month, is considered.  By default, the result is sorted descending by the relative intraday performance corresponding to the most recent trade price, see attribute &#x60;trade.performance.relative&#x60;. The result may contain sortable values based on different currencies, possibly making the ranking nonsensical, if the parameter &#x60;currency&#x60; has not been specified.&#x60;  The search can be restricted to a specific set of products by using customer-specific instrument or notation restriction lists. Such restriction lists are set up by FactSet upon request.  All identifiers used as parameters must be valid and entitled.
   * @param body  (optional)
   * @return ApiResponse&lt;InlineResponse20010&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20010> postStockNotationRankingIntradayListWithHttpInfo(InlineObject2 body) throws ApiException {
    Object localVarPostBody = body;
    
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
        
        InlineResponse20010
      
    > apiResponse = apiClient.invokeAPI("StockApi.postStockNotationRankingIntradayList", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, postStockNotationRankingIntradayListResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Screener for stocks&#39; notations based on stock-specific parameters.
   * Screener for stocks&#39; notations based on stock-specific parameters. The result is limited to the notations that satisfy all the selected filters. If more than one notation of an instrument matches the parameters, and no market priority has been specified, only the notation with the highest trading volume, averaged over one month, is considered.  Parameters for up to three fiscal years might be used in one request, see attribute &#x60;reportedKeyFigures&#x60;; data is available for the ten most recent completed fiscal years. Estimates are available for the current and two consecutive fiscal years; parameters for all three might be used in one request, see attribute &#x60;estimates&#x60;. The estimated values are calculated as the average of the most recent estimates provided by all analysts in a fixed time frame of 100 days. Screening and sorting by a currency-dependent attribute is not possible if the currency (see parameter &#x60;reportedKeyFigures.currencyDependentKeyFigures.currency.isoCode&#x60; and parameter &#x60;estimates.currencyDependentEstimates.currency.isoCode&#x60; respectively) is not set. If a fiscal year for the data as of the end of a fiscal year (see parameter &#x60;reportedKeyFigures.fiscalYear&#x60;) or for the estimates (see parameter &#x60;estimates.fiscalYear&#x60;) has been selected but no currency has been set, the respective data will be returned in the currency in which it was originally reported.  A specific set of stocks can be restricted to or excluded by using customer-specific instrument or notation selection lists. Such selection lists are set up by FactSet upon request. All identifiers used as parameters must be valid and entitled.
   * @param body  (optional)
   * @return InlineResponse20011
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20011 postStockNotationScreenerSearch(InlineObject3 body) throws ApiException {
    return postStockNotationScreenerSearchWithHttpInfo(body).getData();
  }

  /**
   * Screener for stocks&#39; notations based on stock-specific parameters.
   * Screener for stocks&#39; notations based on stock-specific parameters. The result is limited to the notations that satisfy all the selected filters. If more than one notation of an instrument matches the parameters, and no market priority has been specified, only the notation with the highest trading volume, averaged over one month, is considered.  Parameters for up to three fiscal years might be used in one request, see attribute &#x60;reportedKeyFigures&#x60;; data is available for the ten most recent completed fiscal years. Estimates are available for the current and two consecutive fiscal years; parameters for all three might be used in one request, see attribute &#x60;estimates&#x60;. The estimated values are calculated as the average of the most recent estimates provided by all analysts in a fixed time frame of 100 days. Screening and sorting by a currency-dependent attribute is not possible if the currency (see parameter &#x60;reportedKeyFigures.currencyDependentKeyFigures.currency.isoCode&#x60; and parameter &#x60;estimates.currencyDependentEstimates.currency.isoCode&#x60; respectively) is not set. If a fiscal year for the data as of the end of a fiscal year (see parameter &#x60;reportedKeyFigures.fiscalYear&#x60;) or for the estimates (see parameter &#x60;estimates.fiscalYear&#x60;) has been selected but no currency has been set, the respective data will be returned in the currency in which it was originally reported.  A specific set of stocks can be restricted to or excluded by using customer-specific instrument or notation selection lists. Such selection lists are set up by FactSet upon request. All identifiers used as parameters must be valid and entitled.
   * @param body  (optional)
   * @return ApiResponse&lt;InlineResponse20011&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20011> postStockNotationScreenerSearchWithHttpInfo(InlineObject3 body) throws ApiException {
    Object localVarPostBody = body;
    
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
        
        InlineResponse20011
      
    > apiResponse = apiClient.invokeAPI("StockApi.postStockNotationScreenerSearch", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, postStockNotationScreenerSearchResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Possible values and value ranges for the parameters used in the endpoint &#x60;/stock/notation/screener/search&#x60;.
   * The endpoint returns the possible values and value ranges for the parameters used in the endpoint &#x60;/stock/notation/screener/search&#x60;. It allows to request the values and value ranges only for a restricted set of notations that match predefined parameters. The functionality may be used to pre-fill the values and value ranges of the parameters of the &#x60;/stock/notation/screener/search&#x60; endpoint so that performing a search always leads to a non-empty set of notations. If more than one notation of an instrument matches the parameters, and no market priority has been specified, only the notation with the highest trading volume, averaged over one month, is considered. For more information regarding the performance and volatility parameters, see the information available in the group description of the &#x60;/notation/keyFigures/&#x60; endpoints.
   * @param body  (optional)
   * @return InlineResponse20012
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20012 postStockNotationScreenerValueRangesGet(InlineObject4 body) throws ApiException {
    return postStockNotationScreenerValueRangesGetWithHttpInfo(body).getData();
  }

  /**
   * Possible values and value ranges for the parameters used in the endpoint &#x60;/stock/notation/screener/search&#x60;.
   * The endpoint returns the possible values and value ranges for the parameters used in the endpoint &#x60;/stock/notation/screener/search&#x60;. It allows to request the values and value ranges only for a restricted set of notations that match predefined parameters. The functionality may be used to pre-fill the values and value ranges of the parameters of the &#x60;/stock/notation/screener/search&#x60; endpoint so that performing a search always leads to a non-empty set of notations. If more than one notation of an instrument matches the parameters, and no market priority has been specified, only the notation with the highest trading volume, averaged over one month, is considered. For more information regarding the performance and volatility parameters, see the information available in the group description of the &#x60;/notation/keyFigures/&#x60; endpoints.
   * @param body  (optional)
   * @return ApiResponse&lt;InlineResponse20012&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20012> postStockNotationScreenerValueRangesGetWithHttpInfo(InlineObject4 body) throws ApiException {
    Object localVarPostBody = body;
    
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
        
        InlineResponse20012
      
    > apiResponse = apiClient.invokeAPI("StockApi.postStockNotationScreenerValueRangesGet", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, postStockNotationScreenerValueRangesGetResponseTypeMap, false);

    return apiResponse;

  }
}
