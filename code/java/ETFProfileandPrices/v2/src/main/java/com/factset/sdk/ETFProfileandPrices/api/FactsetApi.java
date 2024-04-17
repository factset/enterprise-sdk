package com.factset.sdk.ETFProfileandPrices.api;

import com.factset.sdk.ETFProfileandPrices.ApiException;
import com.factset.sdk.ETFProfileandPrices.ApiClient;
import com.factset.sdk.ETFProfileandPrices.ApiResponse;
import com.factset.sdk.ETFProfileandPrices.Configuration;
import com.factset.sdk.ETFProfileandPrices.Pair;

import jakarta.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import java.math.BigDecimal;
import com.factset.sdk.ETFProfileandPrices.models.InlineResponse200;
import com.factset.sdk.ETFProfileandPrices.models.InlineResponse2001;
import com.factset.sdk.ETFProfileandPrices.models.InlineResponse20010;
import com.factset.sdk.ETFProfileandPrices.models.InlineResponse20011;
import com.factset.sdk.ETFProfileandPrices.models.InlineResponse20012;
import com.factset.sdk.ETFProfileandPrices.models.InlineResponse20013;
import com.factset.sdk.ETFProfileandPrices.models.InlineResponse20014;
import com.factset.sdk.ETFProfileandPrices.models.InlineResponse20015;
import com.factset.sdk.ETFProfileandPrices.models.InlineResponse20016;
import com.factset.sdk.ETFProfileandPrices.models.InlineResponse20017;
import com.factset.sdk.ETFProfileandPrices.models.InlineResponse20018;
import com.factset.sdk.ETFProfileandPrices.models.InlineResponse20019;
import com.factset.sdk.ETFProfileandPrices.models.InlineResponse2002;
import com.factset.sdk.ETFProfileandPrices.models.InlineResponse20020;
import com.factset.sdk.ETFProfileandPrices.models.InlineResponse20021;
import com.factset.sdk.ETFProfileandPrices.models.InlineResponse20022;
import com.factset.sdk.ETFProfileandPrices.models.InlineResponse20023;
import com.factset.sdk.ETFProfileandPrices.models.InlineResponse20024;
import com.factset.sdk.ETFProfileandPrices.models.InlineResponse20025;
import com.factset.sdk.ETFProfileandPrices.models.InlineResponse20026;
import com.factset.sdk.ETFProfileandPrices.models.InlineResponse20027;
import com.factset.sdk.ETFProfileandPrices.models.InlineResponse20028;
import com.factset.sdk.ETFProfileandPrices.models.InlineResponse20029;
import com.factset.sdk.ETFProfileandPrices.models.InlineResponse2003;
import com.factset.sdk.ETFProfileandPrices.models.InlineResponse20030;
import com.factset.sdk.ETFProfileandPrices.models.InlineResponse20031;
import com.factset.sdk.ETFProfileandPrices.models.InlineResponse20032;
import com.factset.sdk.ETFProfileandPrices.models.InlineResponse20033;
import com.factset.sdk.ETFProfileandPrices.models.InlineResponse2004;
import com.factset.sdk.ETFProfileandPrices.models.InlineResponse2005;
import com.factset.sdk.ETFProfileandPrices.models.InlineResponse2006;
import com.factset.sdk.ETFProfileandPrices.models.InlineResponse2007;
import com.factset.sdk.ETFProfileandPrices.models.InlineResponse2008;
import com.factset.sdk.ETFProfileandPrices.models.InlineResponse2009;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class FactsetApi {
  private ApiClient apiClient;

  public FactsetApi() {
    this(Configuration.getDefaultApiClient());
  }

  public FactsetApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> getFactsetEtfAllocationAssetListBySymbolResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getFactsetEtfAllocationAssetListBySymbolResponseTypeMap.put(200, new GenericType<InlineResponse2001>(){});
  }

  private static final Map<Integer, GenericType> getFactsetEtfAllocationCountryListBySymbolResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getFactsetEtfAllocationCountryListBySymbolResponseTypeMap.put(200, new GenericType<InlineResponse2002>(){});
  }

  private static final Map<Integer, GenericType> getFactsetEtfAllocationCurrencyListBySymbolResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getFactsetEtfAllocationCurrencyListBySymbolResponseTypeMap.put(200, new GenericType<InlineResponse2003>(){});
  }

  private static final Map<Integer, GenericType> getFactsetEtfAllocationEconomicDevelopmentListBySymbolResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getFactsetEtfAllocationEconomicDevelopmentListBySymbolResponseTypeMap.put(200, new GenericType<InlineResponse2004>(){});
  }

  private static final Map<Integer, GenericType> getFactsetEtfAllocationExchangeListBySymbolResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getFactsetEtfAllocationExchangeListBySymbolResponseTypeMap.put(200, new GenericType<InlineResponse2005>(){});
  }

  private static final Map<Integer, GenericType> getFactsetEtfAllocationIndustryListBySymbolResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getFactsetEtfAllocationIndustryListBySymbolResponseTypeMap.put(200, new GenericType<InlineResponse2006>(){});
  }

  private static final Map<Integer, GenericType> getFactsetEtfAllocationMarketCapitalizationListBySymbolResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getFactsetEtfAllocationMarketCapitalizationListBySymbolResponseTypeMap.put(200, new GenericType<InlineResponse2007>(){});
  }

  private static final Map<Integer, GenericType> getFactsetEtfAllocationRegionListBySymbolResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getFactsetEtfAllocationRegionListBySymbolResponseTypeMap.put(200, new GenericType<InlineResponse2008>(){});
  }

  private static final Map<Integer, GenericType> getFactsetEtfAllocationSectorListBySymbolResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getFactsetEtfAllocationSectorListBySymbolResponseTypeMap.put(200, new GenericType<InlineResponse2009>(){});
  }

  private static final Map<Integer, GenericType> getFactsetEtfAnalyticsGetBySymbolResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getFactsetEtfAnalyticsGetBySymbolResponseTypeMap.put(200, new GenericType<InlineResponse20010>(){});
  }

  private static final Map<Integer, GenericType> getFactsetEtfAnalyticsHoldingsStatisticsGetBySymbolResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getFactsetEtfAnalyticsHoldingsStatisticsGetBySymbolResponseTypeMap.put(200, new GenericType<InlineResponse20011>(){});
  }

  private static final Map<Integer, GenericType> getFactsetEtfAnalyticsScoreGetBySymbolResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getFactsetEtfAnalyticsScoreGetBySymbolResponseTypeMap.put(200, new GenericType<InlineResponse20012>(){});
  }

  private static final Map<Integer, GenericType> getFactsetEtfAnalyticsTradeGetBySymbolResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getFactsetEtfAnalyticsTradeGetBySymbolResponseTypeMap.put(200, new GenericType<InlineResponse20013>(){});
  }

  private static final Map<Integer, GenericType> getFactsetEtfCharacteristicsGetBySymbolResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getFactsetEtfCharacteristicsGetBySymbolResponseTypeMap.put(200, new GenericType<InlineResponse20014>(){});
  }

  private static final Map<Integer, GenericType> getFactsetEtfClassCategoryBroadListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getFactsetEtfClassCategoryBroadListResponseTypeMap.put(200, new GenericType<InlineResponse20016>(){});
  }

  private static final Map<Integer, GenericType> getFactsetEtfClassCategoryFocusListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getFactsetEtfClassCategoryFocusListResponseTypeMap.put(200, new GenericType<InlineResponse20017>(){});
  }

  private static final Map<Integer, GenericType> getFactsetEtfClassCategoryNicheListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getFactsetEtfClassCategoryNicheListResponseTypeMap.put(200, new GenericType<InlineResponse20018>(){});
  }

  private static final Map<Integer, GenericType> getFactsetEtfClassGeographyListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getFactsetEtfClassGeographyListResponseTypeMap.put(200, new GenericType<InlineResponse20019>(){});
  }

  private static final Map<Integer, GenericType> getFactsetEtfClassGetBySymbolResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getFactsetEtfClassGetBySymbolResponseTypeMap.put(200, new GenericType<InlineResponse20015>(){});
  }

  private static final Map<Integer, GenericType> getFactsetEtfCompetitorsListBySymbolResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getFactsetEtfCompetitorsListBySymbolResponseTypeMap.put(200, new GenericType<InlineResponse20020>(){});
  }

  private static final Map<Integer, GenericType> getFactsetEtfDistributionGetBySymbolResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getFactsetEtfDistributionGetBySymbolResponseTypeMap.put(200, new GenericType<InlineResponse20021>(){});
  }

  private static final Map<Integer, GenericType> getFactsetEtfFundFlowsGetBySymbolResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getFactsetEtfFundFlowsGetBySymbolResponseTypeMap.put(200, new GenericType<InlineResponse20022>(){});
  }

  private static final Map<Integer, GenericType> getFactsetEtfGetBySymbolResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getFactsetEtfGetBySymbolResponseTypeMap.put(200, new GenericType<InlineResponse200>(){});
  }

  private static final Map<Integer, GenericType> getFactsetEtfGrowthOfTenKListBySymbolResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getFactsetEtfGrowthOfTenKListBySymbolResponseTypeMap.put(200, new GenericType<InlineResponse20023>(){});
  }

  private static final Map<Integer, GenericType> getFactsetEtfHoldingsListBySymbolResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getFactsetEtfHoldingsListBySymbolResponseTypeMap.put(200, new GenericType<InlineResponse20024>(){});
  }

  private static final Map<Integer, GenericType> getFactsetEtfMarketAggregatesGetBySymbolResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getFactsetEtfMarketAggregatesGetBySymbolResponseTypeMap.put(200, new GenericType<InlineResponse20025>(){});
  }

  private static final Map<Integer, GenericType> getFactsetEtfPremiumDiscountSummaryListBySymbolResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getFactsetEtfPremiumDiscountSummaryListBySymbolResponseTypeMap.put(200, new GenericType<InlineResponse20026>(){});
  }

  private static final Map<Integer, GenericType> getFactsetEtfPriceGetBySymbolResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getFactsetEtfPriceGetBySymbolResponseTypeMap.put(200, new GenericType<InlineResponse20027>(){});
  }

  private static final Map<Integer, GenericType> getFactsetEtfReturnsGetBySymbolResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getFactsetEtfReturnsGetBySymbolResponseTypeMap.put(200, new GenericType<InlineResponse20028>(){});
  }

  private static final Map<Integer, GenericType> getFactsetEtfStrategyGetBySymbolResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getFactsetEtfStrategyGetBySymbolResponseTypeMap.put(200, new GenericType<InlineResponse20029>(){});
  }

  private static final Map<Integer, GenericType> getFactsetEtfStrategySegmentListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getFactsetEtfStrategySegmentListResponseTypeMap.put(200, new GenericType<InlineResponse20030>(){});
  }

  private static final Map<Integer, GenericType> getFactsetEtfStructureGetBySymbolResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getFactsetEtfStructureGetBySymbolResponseTypeMap.put(200, new GenericType<InlineResponse20031>(){});
  }

  private static final Map<Integer, GenericType> getFactsetEtfTaxesAndFeesUsGetBySymbolResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getFactsetEtfTaxesAndFeesUsGetBySymbolResponseTypeMap.put(200, new GenericType<InlineResponse20032>(){});
  }

  private static final Map<Integer, GenericType> getFactsetEtfTimeSeriesListBySymbolResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getFactsetEtfTimeSeriesListBySymbolResponseTypeMap.put(200, new GenericType<InlineResponse20033>(){});
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
   * This endpoint returns selected ETP&#39;s asset allocations.
   * This endpoint returns selected ETP&#39;s allocations grouped by asset class. The response will be sorted by weight in descending order.
   * @param symbol Market symbol of ETP defined by FactSet. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param paginationOffset Non-negative number of entries to skip, or 0 (default). (optional, default to 0.0)
   * @param paginationLimit Non-negative maximum number of entries to return. (optional, default to 20.0)
   * @return InlineResponse2001
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse2001 getFactsetEtfAllocationAssetListBySymbol(String symbol, java.util.Set<String> attributes, BigDecimal paginationOffset, BigDecimal paginationLimit) throws ApiException {
    return getFactsetEtfAllocationAssetListBySymbolWithHttpInfo(symbol, attributes, paginationOffset, paginationLimit).getData();
  }

  /**
   * This endpoint returns selected ETP&#39;s asset allocations.
   * This endpoint returns selected ETP&#39;s allocations grouped by asset class. The response will be sorted by weight in descending order.
   * @param symbol Market symbol of ETP defined by FactSet. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param paginationOffset Non-negative number of entries to skip, or 0 (default). (optional, default to 0.0)
   * @param paginationLimit Non-negative maximum number of entries to return. (optional, default to 20.0)
   * @return ApiResponse&lt;InlineResponse2001&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse2001> getFactsetEtfAllocationAssetListBySymbolWithHttpInfo(String symbol, java.util.Set<String> attributes, BigDecimal paginationOffset, BigDecimal paginationLimit) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'symbol' is set
    if (symbol == null) {
      throw new ApiException(400, "Missing the required parameter 'symbol' when calling getFactsetEtfAllocationAssetListBySymbol");
    }
    
    // create path and map variables
    String localVarPath = "/factset/etf/allocation/asset/listBySymbol";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "_attributes", attributes));
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
        
        InlineResponse2001
      
    > apiResponse = apiClient.invokeAPI("FactsetApi.getFactsetEtfAllocationAssetListBySymbol", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getFactsetEtfAllocationAssetListBySymbolResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * This endpoint returns selected ETP&#39;s country allocations.
   * This endpoint returns selected ETP&#39;s allocations grouped by country names. The response will be sorted by weight in descending order.
   * @param symbol Market symbol of ETP defined by FactSet. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param paginationOffset Non-negative number of entries to skip, or 0 (default). (optional, default to 0.0)
   * @param paginationLimit Non-negative maximum number of entries to return. (optional, default to 20.0)
   * @return InlineResponse2002
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse2002 getFactsetEtfAllocationCountryListBySymbol(String symbol, java.util.Set<String> attributes, BigDecimal paginationOffset, BigDecimal paginationLimit) throws ApiException {
    return getFactsetEtfAllocationCountryListBySymbolWithHttpInfo(symbol, attributes, paginationOffset, paginationLimit).getData();
  }

  /**
   * This endpoint returns selected ETP&#39;s country allocations.
   * This endpoint returns selected ETP&#39;s allocations grouped by country names. The response will be sorted by weight in descending order.
   * @param symbol Market symbol of ETP defined by FactSet. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param paginationOffset Non-negative number of entries to skip, or 0 (default). (optional, default to 0.0)
   * @param paginationLimit Non-negative maximum number of entries to return. (optional, default to 20.0)
   * @return ApiResponse&lt;InlineResponse2002&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse2002> getFactsetEtfAllocationCountryListBySymbolWithHttpInfo(String symbol, java.util.Set<String> attributes, BigDecimal paginationOffset, BigDecimal paginationLimit) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'symbol' is set
    if (symbol == null) {
      throw new ApiException(400, "Missing the required parameter 'symbol' when calling getFactsetEtfAllocationCountryListBySymbol");
    }
    
    // create path and map variables
    String localVarPath = "/factset/etf/allocation/country/listBySymbol";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "_attributes", attributes));
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
        
        InlineResponse2002
      
    > apiResponse = apiClient.invokeAPI("FactsetApi.getFactsetEtfAllocationCountryListBySymbol", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getFactsetEtfAllocationCountryListBySymbolResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * This endpoint returns selected ETP&#39;s currency allocations.
   * This endpoint returns selected ETP&#39;s allocations grouped by currency. The response will be sorted by weight in descending order.
   * @param symbol Market symbol of ETP defined by FactSet. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param paginationOffset Non-negative number of entries to skip, or 0 (default). (optional, default to 0.0)
   * @param paginationLimit Non-negative maximum number of entries to return. (optional, default to 20.0)
   * @return InlineResponse2003
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse2003 getFactsetEtfAllocationCurrencyListBySymbol(String symbol, java.util.Set<String> attributes, BigDecimal paginationOffset, BigDecimal paginationLimit) throws ApiException {
    return getFactsetEtfAllocationCurrencyListBySymbolWithHttpInfo(symbol, attributes, paginationOffset, paginationLimit).getData();
  }

  /**
   * This endpoint returns selected ETP&#39;s currency allocations.
   * This endpoint returns selected ETP&#39;s allocations grouped by currency. The response will be sorted by weight in descending order.
   * @param symbol Market symbol of ETP defined by FactSet. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param paginationOffset Non-negative number of entries to skip, or 0 (default). (optional, default to 0.0)
   * @param paginationLimit Non-negative maximum number of entries to return. (optional, default to 20.0)
   * @return ApiResponse&lt;InlineResponse2003&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse2003> getFactsetEtfAllocationCurrencyListBySymbolWithHttpInfo(String symbol, java.util.Set<String> attributes, BigDecimal paginationOffset, BigDecimal paginationLimit) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'symbol' is set
    if (symbol == null) {
      throw new ApiException(400, "Missing the required parameter 'symbol' when calling getFactsetEtfAllocationCurrencyListBySymbol");
    }
    
    // create path and map variables
    String localVarPath = "/factset/etf/allocation/currency/listBySymbol";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "_attributes", attributes));
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
        
        InlineResponse2003
      
    > apiResponse = apiClient.invokeAPI("FactsetApi.getFactsetEtfAllocationCurrencyListBySymbol", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getFactsetEtfAllocationCurrencyListBySymbolResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * List of allocations classified by a holding&#39;s economic development status.
   * List of allocations classified by a holding&#39;s economic development status (e.g. developed market, frontier market, emerging market).
   * @param symbol Market symbol of ETP defined by FactSet. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param paginationOffset Non-negative number of entries to skip, or 0 (default). (optional, default to 0.0)
   * @param paginationLimit Non-negative maximum number of entries to return. (optional, default to 20.0)
   * @return InlineResponse2004
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse2004 getFactsetEtfAllocationEconomicDevelopmentListBySymbol(String symbol, java.util.Set<String> attributes, BigDecimal paginationOffset, BigDecimal paginationLimit) throws ApiException {
    return getFactsetEtfAllocationEconomicDevelopmentListBySymbolWithHttpInfo(symbol, attributes, paginationOffset, paginationLimit).getData();
  }

  /**
   * List of allocations classified by a holding&#39;s economic development status.
   * List of allocations classified by a holding&#39;s economic development status (e.g. developed market, frontier market, emerging market).
   * @param symbol Market symbol of ETP defined by FactSet. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param paginationOffset Non-negative number of entries to skip, or 0 (default). (optional, default to 0.0)
   * @param paginationLimit Non-negative maximum number of entries to return. (optional, default to 20.0)
   * @return ApiResponse&lt;InlineResponse2004&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse2004> getFactsetEtfAllocationEconomicDevelopmentListBySymbolWithHttpInfo(String symbol, java.util.Set<String> attributes, BigDecimal paginationOffset, BigDecimal paginationLimit) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'symbol' is set
    if (symbol == null) {
      throw new ApiException(400, "Missing the required parameter 'symbol' when calling getFactsetEtfAllocationEconomicDevelopmentListBySymbol");
    }
    
    // create path and map variables
    String localVarPath = "/factset/etf/allocation/economicDevelopment/listBySymbol";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "_attributes", attributes));
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
        
        InlineResponse2004
      
    > apiResponse = apiClient.invokeAPI("FactsetApi.getFactsetEtfAllocationEconomicDevelopmentListBySymbol", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getFactsetEtfAllocationEconomicDevelopmentListBySymbolResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * This endpoint returns selected ETP&#39;s exchange allocations.
   * This endpoint returns selected ETP&#39;s allocations grouped by exchanges. The response will be sorted by weight in descending order.
   * @param symbol Market symbol of ETP defined by FactSet. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param paginationOffset Non-negative number of entries to skip, or 0 (default). (optional, default to 0.0)
   * @param paginationLimit Non-negative maximum number of entries to return. (optional, default to 20.0)
   * @return InlineResponse2005
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse2005 getFactsetEtfAllocationExchangeListBySymbol(String symbol, java.util.Set<String> attributes, BigDecimal paginationOffset, BigDecimal paginationLimit) throws ApiException {
    return getFactsetEtfAllocationExchangeListBySymbolWithHttpInfo(symbol, attributes, paginationOffset, paginationLimit).getData();
  }

  /**
   * This endpoint returns selected ETP&#39;s exchange allocations.
   * This endpoint returns selected ETP&#39;s allocations grouped by exchanges. The response will be sorted by weight in descending order.
   * @param symbol Market symbol of ETP defined by FactSet. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param paginationOffset Non-negative number of entries to skip, or 0 (default). (optional, default to 0.0)
   * @param paginationLimit Non-negative maximum number of entries to return. (optional, default to 20.0)
   * @return ApiResponse&lt;InlineResponse2005&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse2005> getFactsetEtfAllocationExchangeListBySymbolWithHttpInfo(String symbol, java.util.Set<String> attributes, BigDecimal paginationOffset, BigDecimal paginationLimit) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'symbol' is set
    if (symbol == null) {
      throw new ApiException(400, "Missing the required parameter 'symbol' when calling getFactsetEtfAllocationExchangeListBySymbol");
    }
    
    // create path and map variables
    String localVarPath = "/factset/etf/allocation/exchange/listBySymbol";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "_attributes", attributes));
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
        
        InlineResponse2005
      
    > apiResponse = apiClient.invokeAPI("FactsetApi.getFactsetEtfAllocationExchangeListBySymbol", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getFactsetEtfAllocationExchangeListBySymbolResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * This endpoint returns selected ETP&#39;s industry allocations.
   * This endpoint returns selected ETP&#39;s allocations grouped by industry. The response will be sorted by weight in descending order.
   * @param symbol Market symbol of ETP defined by FactSet. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param paginationOffset Non-negative number of entries to skip, or 0 (default). (optional, default to 0.0)
   * @param paginationLimit Non-negative maximum number of entries to return. (optional, default to 20.0)
   * @return InlineResponse2006
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse2006 getFactsetEtfAllocationIndustryListBySymbol(String symbol, java.util.Set<String> attributes, BigDecimal paginationOffset, BigDecimal paginationLimit) throws ApiException {
    return getFactsetEtfAllocationIndustryListBySymbolWithHttpInfo(symbol, attributes, paginationOffset, paginationLimit).getData();
  }

  /**
   * This endpoint returns selected ETP&#39;s industry allocations.
   * This endpoint returns selected ETP&#39;s allocations grouped by industry. The response will be sorted by weight in descending order.
   * @param symbol Market symbol of ETP defined by FactSet. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param paginationOffset Non-negative number of entries to skip, or 0 (default). (optional, default to 0.0)
   * @param paginationLimit Non-negative maximum number of entries to return. (optional, default to 20.0)
   * @return ApiResponse&lt;InlineResponse2006&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse2006> getFactsetEtfAllocationIndustryListBySymbolWithHttpInfo(String symbol, java.util.Set<String> attributes, BigDecimal paginationOffset, BigDecimal paginationLimit) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'symbol' is set
    if (symbol == null) {
      throw new ApiException(400, "Missing the required parameter 'symbol' when calling getFactsetEtfAllocationIndustryListBySymbol");
    }
    
    // create path and map variables
    String localVarPath = "/factset/etf/allocation/industry/listBySymbol";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "_attributes", attributes));
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
        
        InlineResponse2006
      
    > apiResponse = apiClient.invokeAPI("FactsetApi.getFactsetEtfAllocationIndustryListBySymbol", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getFactsetEtfAllocationIndustryListBySymbolResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * List of allocations classified by a holding&#39;s total market capitalization.
   * List of allocations classified by a holding&#39;s total market capitalization (e.g. Small Cap, Mid Cap, Large Cap). Response will be sorted by weight in descending order.
   * @param symbol Market symbol of ETP defined by FactSet. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param paginationOffset Non-negative number of entries to skip, or 0 (default). (optional, default to 0.0)
   * @param paginationLimit Non-negative maximum number of entries to return. (optional, default to 20.0)
   * @return InlineResponse2007
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse2007 getFactsetEtfAllocationMarketCapitalizationListBySymbol(String symbol, java.util.Set<String> attributes, BigDecimal paginationOffset, BigDecimal paginationLimit) throws ApiException {
    return getFactsetEtfAllocationMarketCapitalizationListBySymbolWithHttpInfo(symbol, attributes, paginationOffset, paginationLimit).getData();
  }

  /**
   * List of allocations classified by a holding&#39;s total market capitalization.
   * List of allocations classified by a holding&#39;s total market capitalization (e.g. Small Cap, Mid Cap, Large Cap). Response will be sorted by weight in descending order.
   * @param symbol Market symbol of ETP defined by FactSet. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param paginationOffset Non-negative number of entries to skip, or 0 (default). (optional, default to 0.0)
   * @param paginationLimit Non-negative maximum number of entries to return. (optional, default to 20.0)
   * @return ApiResponse&lt;InlineResponse2007&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse2007> getFactsetEtfAllocationMarketCapitalizationListBySymbolWithHttpInfo(String symbol, java.util.Set<String> attributes, BigDecimal paginationOffset, BigDecimal paginationLimit) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'symbol' is set
    if (symbol == null) {
      throw new ApiException(400, "Missing the required parameter 'symbol' when calling getFactsetEtfAllocationMarketCapitalizationListBySymbol");
    }
    
    // create path and map variables
    String localVarPath = "/factset/etf/allocation/marketCapitalization/listBySymbol";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "_attributes", attributes));
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
        
        InlineResponse2007
      
    > apiResponse = apiClient.invokeAPI("FactsetApi.getFactsetEtfAllocationMarketCapitalizationListBySymbol", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getFactsetEtfAllocationMarketCapitalizationListBySymbolResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * This endpoint returns selected ETP&#39;s region allocations.
   * This endpoint returns selected ETP&#39;s allocations grouped by region names. The response will be sorted by weight in descending order.
   * @param symbol Market symbol of ETP defined by FactSet. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
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
  public InlineResponse2008 getFactsetEtfAllocationRegionListBySymbol(String symbol, java.util.Set<String> attributes, BigDecimal paginationOffset, BigDecimal paginationLimit) throws ApiException {
    return getFactsetEtfAllocationRegionListBySymbolWithHttpInfo(symbol, attributes, paginationOffset, paginationLimit).getData();
  }

  /**
   * This endpoint returns selected ETP&#39;s region allocations.
   * This endpoint returns selected ETP&#39;s allocations grouped by region names. The response will be sorted by weight in descending order.
   * @param symbol Market symbol of ETP defined by FactSet. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
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
  public ApiResponse<InlineResponse2008> getFactsetEtfAllocationRegionListBySymbolWithHttpInfo(String symbol, java.util.Set<String> attributes, BigDecimal paginationOffset, BigDecimal paginationLimit) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'symbol' is set
    if (symbol == null) {
      throw new ApiException(400, "Missing the required parameter 'symbol' when calling getFactsetEtfAllocationRegionListBySymbol");
    }
    
    // create path and map variables
    String localVarPath = "/factset/etf/allocation/region/listBySymbol";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "_attributes", attributes));
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
      
    > apiResponse = apiClient.invokeAPI("FactsetApi.getFactsetEtfAllocationRegionListBySymbol", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getFactsetEtfAllocationRegionListBySymbolResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * This endpoint returns selected ETP&#39;s sector allocations.
   * This endpoint returns selected ETP&#39;s allocations grouped by sector names. The response will be sorted by weight in descending order.
   * @param symbol Market symbol of ETP defined by FactSet. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param paginationOffset Non-negative number of entries to skip, or 0 (default). (optional, default to 0.0)
   * @param paginationLimit Non-negative maximum number of entries to return. (optional, default to 20.0)
   * @return InlineResponse2009
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse2009 getFactsetEtfAllocationSectorListBySymbol(String symbol, java.util.Set<String> attributes, BigDecimal paginationOffset, BigDecimal paginationLimit) throws ApiException {
    return getFactsetEtfAllocationSectorListBySymbolWithHttpInfo(symbol, attributes, paginationOffset, paginationLimit).getData();
  }

  /**
   * This endpoint returns selected ETP&#39;s sector allocations.
   * This endpoint returns selected ETP&#39;s allocations grouped by sector names. The response will be sorted by weight in descending order.
   * @param symbol Market symbol of ETP defined by FactSet. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param paginationOffset Non-negative number of entries to skip, or 0 (default). (optional, default to 0.0)
   * @param paginationLimit Non-negative maximum number of entries to return. (optional, default to 20.0)
   * @return ApiResponse&lt;InlineResponse2009&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse2009> getFactsetEtfAllocationSectorListBySymbolWithHttpInfo(String symbol, java.util.Set<String> attributes, BigDecimal paginationOffset, BigDecimal paginationLimit) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'symbol' is set
    if (symbol == null) {
      throw new ApiException(400, "Missing the required parameter 'symbol' when calling getFactsetEtfAllocationSectorListBySymbol");
    }
    
    // create path and map variables
    String localVarPath = "/factset/etf/allocation/sector/listBySymbol";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "_attributes", attributes));
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
      
    > apiResponse = apiClient.invokeAPI("FactsetApi.getFactsetEtfAllocationSectorListBySymbol", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getFactsetEtfAllocationSectorListBySymbolResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * FactSet proprietary analytics datapoints for ETPs.
   * FactSet&#39;s proprietary analytical datapoints include ETP attributes specific to lending, corporate actions, and benchmarks.
   * @param symbol Ticker-region of a security as defined by FactSet. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @return InlineResponse20010
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20010 getFactsetEtfAnalyticsGetBySymbol(String symbol, java.util.Set<String> attributes) throws ApiException {
    return getFactsetEtfAnalyticsGetBySymbolWithHttpInfo(symbol, attributes).getData();
  }

  /**
   * FactSet proprietary analytics datapoints for ETPs.
   * FactSet&#39;s proprietary analytical datapoints include ETP attributes specific to lending, corporate actions, and benchmarks.
   * @param symbol Ticker-region of a security as defined by FactSet. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @return ApiResponse&lt;InlineResponse20010&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20010> getFactsetEtfAnalyticsGetBySymbolWithHttpInfo(String symbol, java.util.Set<String> attributes) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'symbol' is set
    if (symbol == null) {
      throw new ApiException(400, "Missing the required parameter 'symbol' when calling getFactsetEtfAnalyticsGetBySymbol");
    }
    
    // create path and map variables
    String localVarPath = "/factset/etf/analytics/getBySymbol";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));
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
        
        InlineResponse20010
      
    > apiResponse = apiClient.invokeAPI("FactsetApi.getFactsetEtfAnalyticsGetBySymbol", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getFactsetEtfAnalyticsGetBySymbolResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * FactSet&#39;s portfolio statistics for ETPs.
   * FactSet calculates several proprietary portfolio statistics for ETPs including average maturity, credit quality, price/book ratio, price/earnings ratio, and dividend yield.
   * @param symbol Ticker-region of a security as defined by FactSet. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @return InlineResponse20011
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20011 getFactsetEtfAnalyticsHoldingsStatisticsGetBySymbol(String symbol, java.util.Set<String> attributes) throws ApiException {
    return getFactsetEtfAnalyticsHoldingsStatisticsGetBySymbolWithHttpInfo(symbol, attributes).getData();
  }

  /**
   * FactSet&#39;s portfolio statistics for ETPs.
   * FactSet calculates several proprietary portfolio statistics for ETPs including average maturity, credit quality, price/book ratio, price/earnings ratio, and dividend yield.
   * @param symbol Ticker-region of a security as defined by FactSet. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @return ApiResponse&lt;InlineResponse20011&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20011> getFactsetEtfAnalyticsHoldingsStatisticsGetBySymbolWithHttpInfo(String symbol, java.util.Set<String> attributes) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'symbol' is set
    if (symbol == null) {
      throw new ApiException(400, "Missing the required parameter 'symbol' when calling getFactsetEtfAnalyticsHoldingsStatisticsGetBySymbol");
    }
    
    // create path and map variables
    String localVarPath = "/factset/etf/analytics/holdings/statistics/getBySymbol";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));
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
        
        InlineResponse20011
      
    > apiResponse = apiClient.invokeAPI("FactsetApi.getFactsetEtfAnalyticsHoldingsStatisticsGetBySymbol", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getFactsetEtfAnalyticsHoldingsStatisticsGetBySymbolResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * FactSet proprietary ETP rankings.
   * FactSet calculates various proprietary fund rankings including unique scores, fund grades, segment averages, and recommendations.
   * @param symbol Ticker-region of a security as defined by FactSet. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @return InlineResponse20012
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20012 getFactsetEtfAnalyticsScoreGetBySymbol(String symbol, java.util.Set<String> attributes) throws ApiException {
    return getFactsetEtfAnalyticsScoreGetBySymbolWithHttpInfo(symbol, attributes).getData();
  }

  /**
   * FactSet proprietary ETP rankings.
   * FactSet calculates various proprietary fund rankings including unique scores, fund grades, segment averages, and recommendations.
   * @param symbol Ticker-region of a security as defined by FactSet. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @return ApiResponse&lt;InlineResponse20012&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20012> getFactsetEtfAnalyticsScoreGetBySymbolWithHttpInfo(String symbol, java.util.Set<String> attributes) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'symbol' is set
    if (symbol == null) {
      throw new ApiException(400, "Missing the required parameter 'symbol' when calling getFactsetEtfAnalyticsScoreGetBySymbol");
    }
    
    // create path and map variables
    String localVarPath = "/factset/etf/analytics/score/getBySymbol";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));
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
        
        InlineResponse20012
      
    > apiResponse = apiClient.invokeAPI("FactsetApi.getFactsetEtfAnalyticsScoreGetBySymbol", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getFactsetEtfAnalyticsScoreGetBySymbolResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Trade statistics for specific ETP.
   * Various metrics of an ETP&#39;s liquidity including creation metrics, premium/discount, spread, and tracking error statistics.
   * @param symbol Ticker-region of a security as defined by FactSet. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @return InlineResponse20013
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20013 getFactsetEtfAnalyticsTradeGetBySymbol(String symbol, java.util.Set<String> attributes) throws ApiException {
    return getFactsetEtfAnalyticsTradeGetBySymbolWithHttpInfo(symbol, attributes).getData();
  }

  /**
   * Trade statistics for specific ETP.
   * Various metrics of an ETP&#39;s liquidity including creation metrics, premium/discount, spread, and tracking error statistics.
   * @param symbol Ticker-region of a security as defined by FactSet. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @return ApiResponse&lt;InlineResponse20013&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20013> getFactsetEtfAnalyticsTradeGetBySymbolWithHttpInfo(String symbol, java.util.Set<String> attributes) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'symbol' is set
    if (symbol == null) {
      throw new ApiException(400, "Missing the required parameter 'symbol' when calling getFactsetEtfAnalyticsTradeGetBySymbol");
    }
    
    // create path and map variables
    String localVarPath = "/factset/etf/analytics/trade/getBySymbol";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));
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
        
        InlineResponse20013
      
    > apiResponse = apiClient.invokeAPI("FactsetApi.getFactsetEtfAnalyticsTradeGetBySymbol", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getFactsetEtfAnalyticsTradeGetBySymbolResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Retrieve basic characteristic information for a specified ETP.
   * An ETP has many unique characteristics specific to its composition that differentiate it from other products. This includes details on leverage, hedging, derivatives, and service providers.
   * @param symbol Market symbol of ETF defined by FactSet. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @return InlineResponse20014
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20014 getFactsetEtfCharacteristicsGetBySymbol(String symbol, java.util.Set<String> attributes) throws ApiException {
    return getFactsetEtfCharacteristicsGetBySymbolWithHttpInfo(symbol, attributes).getData();
  }

  /**
   * Retrieve basic characteristic information for a specified ETP.
   * An ETP has many unique characteristics specific to its composition that differentiate it from other products. This includes details on leverage, hedging, derivatives, and service providers.
   * @param symbol Market symbol of ETF defined by FactSet. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @return ApiResponse&lt;InlineResponse20014&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20014> getFactsetEtfCharacteristicsGetBySymbolWithHttpInfo(String symbol, java.util.Set<String> attributes) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'symbol' is set
    if (symbol == null) {
      throw new ApiException(400, "Missing the required parameter 'symbol' when calling getFactsetEtfCharacteristicsGetBySymbol");
    }
    
    // create path and map variables
    String localVarPath = "/factset/etf/characteristics/getBySymbol";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));
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
        
        InlineResponse20014
      
    > apiResponse = apiClient.invokeAPI("FactsetApi.getFactsetEtfCharacteristicsGetBySymbol", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getFactsetEtfCharacteristicsGetBySymbolResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * List of ETP class broad categories.
   * List of ETP class broad categories.
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @return InlineResponse20016
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20016 getFactsetEtfClassCategoryBroadList(java.util.Set<String> attributes) throws ApiException {
    return getFactsetEtfClassCategoryBroadListWithHttpInfo(attributes).getData();
  }

  /**
   * List of ETP class broad categories.
   * List of ETP class broad categories.
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @return ApiResponse&lt;InlineResponse20016&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20016> getFactsetEtfClassCategoryBroadListWithHttpInfo(java.util.Set<String> attributes) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/factset/etf/class/category/broad/list";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

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
        
        InlineResponse20016
      
    > apiResponse = apiClient.invokeAPI("FactsetApi.getFactsetEtfClassCategoryBroadList", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getFactsetEtfClassCategoryBroadListResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * List of ETP class focus categories.
   * List of ETP class focus categories.
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param paginationOffset Non-negative number of entries to skip, or 0 (default). (optional, default to 0.0)
   * @param paginationLimit Non-negative maximum number of entries to return. (optional, default to 20.0)
   * @return InlineResponse20017
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20017 getFactsetEtfClassCategoryFocusList(java.util.Set<String> attributes, BigDecimal paginationOffset, BigDecimal paginationLimit) throws ApiException {
    return getFactsetEtfClassCategoryFocusListWithHttpInfo(attributes, paginationOffset, paginationLimit).getData();
  }

  /**
   * List of ETP class focus categories.
   * List of ETP class focus categories.
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param paginationOffset Non-negative number of entries to skip, or 0 (default). (optional, default to 0.0)
   * @param paginationLimit Non-negative maximum number of entries to return. (optional, default to 20.0)
   * @return ApiResponse&lt;InlineResponse20017&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20017> getFactsetEtfClassCategoryFocusListWithHttpInfo(java.util.Set<String> attributes, BigDecimal paginationOffset, BigDecimal paginationLimit) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/factset/etf/class/category/focus/list";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "_attributes", attributes));
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
        
        InlineResponse20017
      
    > apiResponse = apiClient.invokeAPI("FactsetApi.getFactsetEtfClassCategoryFocusList", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getFactsetEtfClassCategoryFocusListResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * List of ETP class niche categories.
   * List of ETP class niche categories.
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param paginationOffset Non-negative number of entries to skip, or 0 (default). (optional, default to 0.0)
   * @param paginationLimit Non-negative maximum number of entries to return. (optional, default to 20.0)
   * @return InlineResponse20018
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20018 getFactsetEtfClassCategoryNicheList(java.util.Set<String> attributes, BigDecimal paginationOffset, BigDecimal paginationLimit) throws ApiException {
    return getFactsetEtfClassCategoryNicheListWithHttpInfo(attributes, paginationOffset, paginationLimit).getData();
  }

  /**
   * List of ETP class niche categories.
   * List of ETP class niche categories.
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param paginationOffset Non-negative number of entries to skip, or 0 (default). (optional, default to 0.0)
   * @param paginationLimit Non-negative maximum number of entries to return. (optional, default to 20.0)
   * @return ApiResponse&lt;InlineResponse20018&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20018> getFactsetEtfClassCategoryNicheListWithHttpInfo(java.util.Set<String> attributes, BigDecimal paginationOffset, BigDecimal paginationLimit) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/factset/etf/class/category/niche/list";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "_attributes", attributes));
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
        
        InlineResponse20018
      
    > apiResponse = apiClient.invokeAPI("FactsetApi.getFactsetEtfClassCategoryNicheList", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getFactsetEtfClassCategoryNicheListResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * List of ETP class geographies.
   * List of ETP class geographies.
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @return InlineResponse20019
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20019 getFactsetEtfClassGeographyList(java.util.Set<String> attributes) throws ApiException {
    return getFactsetEtfClassGeographyListWithHttpInfo(attributes).getData();
  }

  /**
   * List of ETP class geographies.
   * List of ETP class geographies.
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @return ApiResponse&lt;InlineResponse20019&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20019> getFactsetEtfClassGeographyListWithHttpInfo(java.util.Set<String> attributes) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/factset/etf/class/geography/list";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

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
        
        InlineResponse20019
      
    > apiResponse = apiClient.invokeAPI("FactsetApi.getFactsetEtfClassGeographyList", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getFactsetEtfClassGeographyListResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Retrieve an ETP&#39;s classification specific to asset class, geography, or investment strategy.
   * ETP classification is divided into three categories: Asset Class, Geography, and Investment Strategy. Asset class is determined based on the various asset types held by the fund, A fund&#39;s geography can be classified by region (e.g. Asia-Pac), specific geography (e.g. China) or economic development (e.g. BRIC). An ETP&#39;s investment strategy is classified in broad categories (e.g. Large Cap) and more granular categorizations.
   * @param symbol Market symbol of ETP defined by FactSet. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @return InlineResponse20015
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20015 getFactsetEtfClassGetBySymbol(String symbol, java.util.Set<String> attributes) throws ApiException {
    return getFactsetEtfClassGetBySymbolWithHttpInfo(symbol, attributes).getData();
  }

  /**
   * Retrieve an ETP&#39;s classification specific to asset class, geography, or investment strategy.
   * ETP classification is divided into three categories: Asset Class, Geography, and Investment Strategy. Asset class is determined based on the various asset types held by the fund, A fund&#39;s geography can be classified by region (e.g. Asia-Pac), specific geography (e.g. China) or economic development (e.g. BRIC). An ETP&#39;s investment strategy is classified in broad categories (e.g. Large Cap) and more granular categorizations.
   * @param symbol Market symbol of ETP defined by FactSet. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @return ApiResponse&lt;InlineResponse20015&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20015> getFactsetEtfClassGetBySymbolWithHttpInfo(String symbol, java.util.Set<String> attributes) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'symbol' is set
    if (symbol == null) {
      throw new ApiException(400, "Missing the required parameter 'symbol' when calling getFactsetEtfClassGetBySymbol");
    }
    
    // create path and map variables
    String localVarPath = "/factset/etf/class/getBySymbol";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));
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
        
        InlineResponse20015
      
    > apiResponse = apiClient.invokeAPI("FactsetApi.getFactsetEtfClassGetBySymbol", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getFactsetEtfClassGetBySymbolResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * FactSet&#39;s proprietary list of competing companies.
   * FactSet defines and maintains a proprietary list of competing companies based on a number of attributes specific to a fund.
   * @param symbol Ticker-region of a security as defined by FactSet. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @return InlineResponse20020
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20020 getFactsetEtfCompetitorsListBySymbol(String symbol, java.util.Set<String> attributes) throws ApiException {
    return getFactsetEtfCompetitorsListBySymbolWithHttpInfo(symbol, attributes).getData();
  }

  /**
   * FactSet&#39;s proprietary list of competing companies.
   * FactSet defines and maintains a proprietary list of competing companies based on a number of attributes specific to a fund.
   * @param symbol Ticker-region of a security as defined by FactSet. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @return ApiResponse&lt;InlineResponse20020&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20020> getFactsetEtfCompetitorsListBySymbolWithHttpInfo(String symbol, java.util.Set<String> attributes) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'symbol' is set
    if (symbol == null) {
      throw new ApiException(400, "Missing the required parameter 'symbol' when calling getFactsetEtfCompetitorsListBySymbol");
    }
    
    // create path and map variables
    String localVarPath = "/factset/etf/competitors/listBySymbol";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));
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
        
        InlineResponse20020
      
    > apiResponse = apiClient.invokeAPI("FactsetApi.getFactsetEtfCompetitorsListBySymbol", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getFactsetEtfCompetitorsListBySymbolResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Retrieve an ETP&#39;s current distribution details.
   * Retrieve distribution-related details for a specific ETP including dividend and capital gain distribution details.
   * @param symbol Market symbol of ETP defined by FactSet. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @return InlineResponse20021
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20021 getFactsetEtfDistributionGetBySymbol(String symbol, java.util.Set<String> attributes) throws ApiException {
    return getFactsetEtfDistributionGetBySymbolWithHttpInfo(symbol, attributes).getData();
  }

  /**
   * Retrieve an ETP&#39;s current distribution details.
   * Retrieve distribution-related details for a specific ETP including dividend and capital gain distribution details.
   * @param symbol Market symbol of ETP defined by FactSet. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @return ApiResponse&lt;InlineResponse20021&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20021> getFactsetEtfDistributionGetBySymbolWithHttpInfo(String symbol, java.util.Set<String> attributes) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'symbol' is set
    if (symbol == null) {
      throw new ApiException(400, "Missing the required parameter 'symbol' when calling getFactsetEtfDistributionGetBySymbol");
    }
    
    // create path and map variables
    String localVarPath = "/factset/etf/distribution/getBySymbol";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));
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
        
        InlineResponse20021
      
    > apiResponse = apiClient.invokeAPI("FactsetApi.getFactsetEtfDistributionGetBySymbol", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getFactsetEtfDistributionGetBySymbolResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Retrieve an ETP&#39;s cash inflow/outflows for various time periods.
   * Retrieve the amount invested or divested in a specific ETP over various time periods including one-day, one-week, one-month, one-year, and YTD.
   * @param symbol Market symbol of ETP defined by FactSet. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @return InlineResponse20022
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20022 getFactsetEtfFundFlowsGetBySymbol(String symbol, java.util.Set<String> attributes) throws ApiException {
    return getFactsetEtfFundFlowsGetBySymbolWithHttpInfo(symbol, attributes).getData();
  }

  /**
   * Retrieve an ETP&#39;s cash inflow/outflows for various time periods.
   * Retrieve the amount invested or divested in a specific ETP over various time periods including one-day, one-week, one-month, one-year, and YTD.
   * @param symbol Market symbol of ETP defined by FactSet. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @return ApiResponse&lt;InlineResponse20022&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20022> getFactsetEtfFundFlowsGetBySymbolWithHttpInfo(String symbol, java.util.Set<String> attributes) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'symbol' is set
    if (symbol == null) {
      throw new ApiException(400, "Missing the required parameter 'symbol' when calling getFactsetEtfFundFlowsGetBySymbol");
    }
    
    // create path and map variables
    String localVarPath = "/factset/etf/fundFlows/getBySymbol";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));
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
        
        InlineResponse20022
      
    > apiResponse = apiClient.invokeAPI("FactsetApi.getFactsetEtfFundFlowsGetBySymbol", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getFactsetEtfFundFlowsGetBySymbolResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Retrieve basic profile information for a specified ETP.
   * An ETP can be profiled by defining several common attributes such as issuer, fund description, and benchmark.
   * @param symbol Market symbol of ETP defined by FactSet. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @return InlineResponse200
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse200 getFactsetEtfGetBySymbol(String symbol, java.util.Set<String> attributes) throws ApiException {
    return getFactsetEtfGetBySymbolWithHttpInfo(symbol, attributes).getData();
  }

  /**
   * Retrieve basic profile information for a specified ETP.
   * An ETP can be profiled by defining several common attributes such as issuer, fund description, and benchmark.
   * @param symbol Market symbol of ETP defined by FactSet. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @return ApiResponse&lt;InlineResponse200&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse200> getFactsetEtfGetBySymbolWithHttpInfo(String symbol, java.util.Set<String> attributes) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'symbol' is set
    if (symbol == null) {
      throw new ApiException(400, "Missing the required parameter 'symbol' when calling getFactsetEtfGetBySymbol");
    }
    
    // create path and map variables
    String localVarPath = "/factset/etf/getBySymbol";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));
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
        
        InlineResponse200
      
    > apiResponse = apiClient.invokeAPI("FactsetApi.getFactsetEtfGetBySymbol", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getFactsetEtfGetBySymbolResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * This endpoint returns selected ETP&#39;s Growth of 10K calculated values.
   * Growth of 10K (or growth of 10,000) is a commonly used chart that highlights the change in the value of an initial 10,000 investment in the ETP during a given period of time. Often, this period of time is either since inception or the calculation between the pre-defined range.
   * @param symbol Market symbol of ETP defined by FactSet. (required)
   * @param timePeriod Historice NAV date value. (optional)
   * @param calculationType Historice NAV date value. (optional)
   * @param alignment Indicates the reference point for growth of 10k data. (optional)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param paginationOffset Non-negative number of entries to skip, or 0 (default). (optional, default to 0.0)
   * @param paginationLimit Non-negative maximum number of entries to return. (optional, default to 20.0)
   * @return InlineResponse20023
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20023 getFactsetEtfGrowthOfTenKListBySymbol(String symbol, String timePeriod, String calculationType, String alignment, java.util.Set<String> attributes, BigDecimal paginationOffset, BigDecimal paginationLimit) throws ApiException {
    return getFactsetEtfGrowthOfTenKListBySymbolWithHttpInfo(symbol, timePeriod, calculationType, alignment, attributes, paginationOffset, paginationLimit).getData();
  }

  /**
   * This endpoint returns selected ETP&#39;s Growth of 10K calculated values.
   * Growth of 10K (or growth of 10,000) is a commonly used chart that highlights the change in the value of an initial 10,000 investment in the ETP during a given period of time. Often, this period of time is either since inception or the calculation between the pre-defined range.
   * @param symbol Market symbol of ETP defined by FactSet. (required)
   * @param timePeriod Historice NAV date value. (optional)
   * @param calculationType Historice NAV date value. (optional)
   * @param alignment Indicates the reference point for growth of 10k data. (optional)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param paginationOffset Non-negative number of entries to skip, or 0 (default). (optional, default to 0.0)
   * @param paginationLimit Non-negative maximum number of entries to return. (optional, default to 20.0)
   * @return ApiResponse&lt;InlineResponse20023&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20023> getFactsetEtfGrowthOfTenKListBySymbolWithHttpInfo(String symbol, String timePeriod, String calculationType, String alignment, java.util.Set<String> attributes, BigDecimal paginationOffset, BigDecimal paginationLimit) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'symbol' is set
    if (symbol == null) {
      throw new ApiException(400, "Missing the required parameter 'symbol' when calling getFactsetEtfGrowthOfTenKListBySymbol");
    }
    
    // create path and map variables
    String localVarPath = "/factset/etf/growthOfTenK/listBySymbol";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "timePeriod", timePeriod));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "calculationType", calculationType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "alignment", alignment));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "_attributes", attributes));
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
        
        InlineResponse20023
      
    > apiResponse = apiClient.invokeAPI("FactsetApi.getFactsetEtfGrowthOfTenKListBySymbol", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getFactsetEtfGrowthOfTenKListBySymbolResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Holdings details for an individual ETP.
   * Retrieve an ETP&#39;s holdings information including security, shares held, and weight.
   * @param symbol Market symbol of ETP defined by FactSet. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param paginationOffset Non-negative number of entries to skip, or 0 (default). (optional, default to 0.0)
   * @param paginationLimit Non-negative maximum number of entries to return. (optional, default to 20.0)
   * @return InlineResponse20024
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20024 getFactsetEtfHoldingsListBySymbol(String symbol, java.util.Set<String> attributes, BigDecimal paginationOffset, BigDecimal paginationLimit) throws ApiException {
    return getFactsetEtfHoldingsListBySymbolWithHttpInfo(symbol, attributes, paginationOffset, paginationLimit).getData();
  }

  /**
   * Holdings details for an individual ETP.
   * Retrieve an ETP&#39;s holdings information including security, shares held, and weight.
   * @param symbol Market symbol of ETP defined by FactSet. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param paginationOffset Non-negative number of entries to skip, or 0 (default). (optional, default to 0.0)
   * @param paginationLimit Non-negative maximum number of entries to return. (optional, default to 20.0)
   * @return ApiResponse&lt;InlineResponse20024&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20024> getFactsetEtfHoldingsListBySymbolWithHttpInfo(String symbol, java.util.Set<String> attributes, BigDecimal paginationOffset, BigDecimal paginationLimit) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'symbol' is set
    if (symbol == null) {
      throw new ApiException(400, "Missing the required parameter 'symbol' when calling getFactsetEtfHoldingsListBySymbol");
    }
    
    // create path and map variables
    String localVarPath = "/factset/etf/holdings/listBySymbol";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "_attributes", attributes));
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
        
        InlineResponse20024
      
    > apiResponse = apiClient.invokeAPI("FactsetApi.getFactsetEtfHoldingsListBySymbol", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getFactsetEtfHoldingsListBySymbolResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Market aggregate data for ETPs.
   * Market Aggregates combines FactSet Estimates, FactSet Fundamentals, and FactSet Prices data to derive ratios and per share values on an aggregate level. The resulting index values can be used to identify market trends and compare a combination of portfolios, benchmarks, and individual securities.
   * @param symbol Ticker-region of an ETP as defined by FactSet. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @return InlineResponse20025
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20025 getFactsetEtfMarketAggregatesGetBySymbol(String symbol, java.util.Set<String> attributes) throws ApiException {
    return getFactsetEtfMarketAggregatesGetBySymbolWithHttpInfo(symbol, attributes).getData();
  }

  /**
   * Market aggregate data for ETPs.
   * Market Aggregates combines FactSet Estimates, FactSet Fundamentals, and FactSet Prices data to derive ratios and per share values on an aggregate level. The resulting index values can be used to identify market trends and compare a combination of portfolios, benchmarks, and individual securities.
   * @param symbol Ticker-region of an ETP as defined by FactSet. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @return ApiResponse&lt;InlineResponse20025&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20025> getFactsetEtfMarketAggregatesGetBySymbolWithHttpInfo(String symbol, java.util.Set<String> attributes) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'symbol' is set
    if (symbol == null) {
      throw new ApiException(400, "Missing the required parameter 'symbol' when calling getFactsetEtfMarketAggregatesGetBySymbol");
    }
    
    // create path and map variables
    String localVarPath = "/factset/etf/marketAggregates/getBySymbol";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));
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
        
        InlineResponse20025
      
    > apiResponse = apiClient.invokeAPI("FactsetApi.getFactsetEtfMarketAggregatesGetBySymbol", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getFactsetEtfMarketAggregatesGetBySymbolResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Summary of ETP premium discount data.
   * Summary of ETP premium discount data.
   * @param symbol Market symbol of ETP defined by FactSet. (required)
   * @param timePeriod Time frame of the data. (optional, default to YTD)
   * @param alignment Indicates the reference point for the historical NAV and price values. (optional, default to quarter-end)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param paginationOffset Non-negative number of entries to skip, or 0 (default). (optional, default to 0.0)
   * @param paginationLimit Non-negative maximum number of entries to return. (optional, default to 20.0)
   * @return InlineResponse20026
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20026 getFactsetEtfPremiumDiscountSummaryListBySymbol(String symbol, String timePeriod, String alignment, java.util.Set<String> attributes, BigDecimal paginationOffset, BigDecimal paginationLimit) throws ApiException {
    return getFactsetEtfPremiumDiscountSummaryListBySymbolWithHttpInfo(symbol, timePeriod, alignment, attributes, paginationOffset, paginationLimit).getData();
  }

  /**
   * Summary of ETP premium discount data.
   * Summary of ETP premium discount data.
   * @param symbol Market symbol of ETP defined by FactSet. (required)
   * @param timePeriod Time frame of the data. (optional, default to YTD)
   * @param alignment Indicates the reference point for the historical NAV and price values. (optional, default to quarter-end)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param paginationOffset Non-negative number of entries to skip, or 0 (default). (optional, default to 0.0)
   * @param paginationLimit Non-negative maximum number of entries to return. (optional, default to 20.0)
   * @return ApiResponse&lt;InlineResponse20026&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20026> getFactsetEtfPremiumDiscountSummaryListBySymbolWithHttpInfo(String symbol, String timePeriod, String alignment, java.util.Set<String> attributes, BigDecimal paginationOffset, BigDecimal paginationLimit) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'symbol' is set
    if (symbol == null) {
      throw new ApiException(400, "Missing the required parameter 'symbol' when calling getFactsetEtfPremiumDiscountSummaryListBySymbol");
    }
    
    // create path and map variables
    String localVarPath = "/factset/etf/premiumDiscount/summary/listBySymbol";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "timePeriod", timePeriod));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "alignment", alignment));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "_attributes", attributes));
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
        
        InlineResponse20026
      
    > apiResponse = apiClient.invokeAPI("FactsetApi.getFactsetEtfPremiumDiscountSummaryListBySymbol", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getFactsetEtfPremiumDiscountSummaryListBySymbolResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Retrieve historical ETP NAV values.
   * Retrieve an ETP&#39;s historical NAV and shares outstanding for a specified time range.
   * @param symbol Market symbol of ETP defined by FactSet. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @return InlineResponse20027
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20027 getFactsetEtfPriceGetBySymbol(String symbol, java.util.Set<String> attributes) throws ApiException {
    return getFactsetEtfPriceGetBySymbolWithHttpInfo(symbol, attributes).getData();
  }

  /**
   * Retrieve historical ETP NAV values.
   * Retrieve an ETP&#39;s historical NAV and shares outstanding for a specified time range.
   * @param symbol Market symbol of ETP defined by FactSet. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @return ApiResponse&lt;InlineResponse20027&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20027> getFactsetEtfPriceGetBySymbolWithHttpInfo(String symbol, java.util.Set<String> attributes) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'symbol' is set
    if (symbol == null) {
      throw new ApiException(400, "Missing the required parameter 'symbol' when calling getFactsetEtfPriceGetBySymbol");
    }
    
    // create path and map variables
    String localVarPath = "/factset/etf/price/getBySymbol";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));
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
        
        InlineResponse20027
      
    > apiResponse = apiClient.invokeAPI("FactsetApi.getFactsetEtfPriceGetBySymbol", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getFactsetEtfPriceGetBySymbolResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Retrieve total return data for a specified ETP.
   * An ETP&#39;s total return data can be returned for various time frames including 1-month, 3-month, YTD, 1-year, 3-year, and 5-year. Total return calculations include price performance plus reinvested and compounded distributions. Market price is used to calcualte market returns. Portfolio nav is used to calcualte nav returns.
   * @param symbol Market symbol of ETP defined by FactSet. (required)
   * @param returnType Return type. (optional, default to price)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @return InlineResponse20028
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20028 getFactsetEtfReturnsGetBySymbol(String symbol, String returnType, java.util.Set<String> attributes) throws ApiException {
    return getFactsetEtfReturnsGetBySymbolWithHttpInfo(symbol, returnType, attributes).getData();
  }

  /**
   * Retrieve total return data for a specified ETP.
   * An ETP&#39;s total return data can be returned for various time frames including 1-month, 3-month, YTD, 1-year, 3-year, and 5-year. Total return calculations include price performance plus reinvested and compounded distributions. Market price is used to calcualte market returns. Portfolio nav is used to calcualte nav returns.
   * @param symbol Market symbol of ETP defined by FactSet. (required)
   * @param returnType Return type. (optional, default to price)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @return ApiResponse&lt;InlineResponse20028&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20028> getFactsetEtfReturnsGetBySymbolWithHttpInfo(String symbol, String returnType, java.util.Set<String> attributes) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'symbol' is set
    if (symbol == null) {
      throw new ApiException(400, "Missing the required parameter 'symbol' when calling getFactsetEtfReturnsGetBySymbol");
    }
    
    // create path and map variables
    String localVarPath = "/factset/etf/returns/getBySymbol";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "returnType", returnType));
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
        
        InlineResponse20028
      
    > apiResponse = apiClient.invokeAPI("FactsetApi.getFactsetEtfReturnsGetBySymbol", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getFactsetEtfReturnsGetBySymbolResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Retrieve various classification details for a specified ETP.
   * ETP&#39;s can be classified in many different ways including investment strategy, security weightings, and fund composition.
   * @param symbol Market symbol of ETP defined by FactSet. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @return InlineResponse20029
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20029 getFactsetEtfStrategyGetBySymbol(String symbol, java.util.Set<String> attributes) throws ApiException {
    return getFactsetEtfStrategyGetBySymbolWithHttpInfo(symbol, attributes).getData();
  }

  /**
   * Retrieve various classification details for a specified ETP.
   * ETP&#39;s can be classified in many different ways including investment strategy, security weightings, and fund composition.
   * @param symbol Market symbol of ETP defined by FactSet. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @return ApiResponse&lt;InlineResponse20029&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20029> getFactsetEtfStrategyGetBySymbolWithHttpInfo(String symbol, java.util.Set<String> attributes) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'symbol' is set
    if (symbol == null) {
      throw new ApiException(400, "Missing the required parameter 'symbol' when calling getFactsetEtfStrategyGetBySymbol");
    }
    
    // create path and map variables
    String localVarPath = "/factset/etf/strategy/getBySymbol";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));
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
        
        InlineResponse20029
      
    > apiResponse = apiClient.invokeAPI("FactsetApi.getFactsetEtfStrategyGetBySymbol", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getFactsetEtfStrategyGetBySymbolResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Retrieve a list of ETP strategy segments.
   * Retrieve the various segments assigned to a specific ETP. Segment data is used to group funds for comparison and relative performance analyses.
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param paginationOffset Non-negative number of entries to skip, or 0 (default). (optional, default to 0.0)
   * @param paginationLimit Non-negative maximum number of entries to return. (optional, default to 20.0)
   * @return InlineResponse20030
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20030 getFactsetEtfStrategySegmentList(java.util.Set<String> attributes, BigDecimal paginationOffset, BigDecimal paginationLimit) throws ApiException {
    return getFactsetEtfStrategySegmentListWithHttpInfo(attributes, paginationOffset, paginationLimit).getData();
  }

  /**
   * Retrieve a list of ETP strategy segments.
   * Retrieve the various segments assigned to a specific ETP. Segment data is used to group funds for comparison and relative performance analyses.
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param paginationOffset Non-negative number of entries to skip, or 0 (default). (optional, default to 0.0)
   * @param paginationLimit Non-negative maximum number of entries to return. (optional, default to 20.0)
   * @return ApiResponse&lt;InlineResponse20030&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20030> getFactsetEtfStrategySegmentListWithHttpInfo(java.util.Set<String> attributes, BigDecimal paginationOffset, BigDecimal paginationLimit) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/factset/etf/strategy/segment/list";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "_attributes", attributes));
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
        
        InlineResponse20030
      
    > apiResponse = apiClient.invokeAPI("FactsetApi.getFactsetEtfStrategySegmentList", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getFactsetEtfStrategySegmentListResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Retrieve the basic structure information for a specified ETP.
   * Retrieve details on a fund&#39;s structure including its type, investment style (active/passive), and legal structure.
   * @param symbol Market symbol of ETP defined by FactSet. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @return InlineResponse20031
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20031 getFactsetEtfStructureGetBySymbol(String symbol, java.util.Set<String> attributes) throws ApiException {
    return getFactsetEtfStructureGetBySymbolWithHttpInfo(symbol, attributes).getData();
  }

  /**
   * Retrieve the basic structure information for a specified ETP.
   * Retrieve details on a fund&#39;s structure including its type, investment style (active/passive), and legal structure.
   * @param symbol Market symbol of ETP defined by FactSet. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @return ApiResponse&lt;InlineResponse20031&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20031> getFactsetEtfStructureGetBySymbolWithHttpInfo(String symbol, java.util.Set<String> attributes) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'symbol' is set
    if (symbol == null) {
      throw new ApiException(400, "Missing the required parameter 'symbol' when calling getFactsetEtfStructureGetBySymbol");
    }
    
    // create path and map variables
    String localVarPath = "/factset/etf/structure/getBySymbol";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));
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
        
        InlineResponse20031
      
    > apiResponse = apiClient.invokeAPI("FactsetApi.getFactsetEtfStructureGetBySymbol", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getFactsetEtfStructureGetBySymbolResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Retrieve the tax and fee related information for a specified ETP.
   * Retrieve various fee and tax related details on a specified ETP including expense ratio and tax treatment for dividends and capital gains.
   * @param symbol Market symbol of ETP defined by FactSet. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @return InlineResponse20032
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20032 getFactsetEtfTaxesAndFeesUsGetBySymbol(String symbol, java.util.Set<String> attributes) throws ApiException {
    return getFactsetEtfTaxesAndFeesUsGetBySymbolWithHttpInfo(symbol, attributes).getData();
  }

  /**
   * Retrieve the tax and fee related information for a specified ETP.
   * Retrieve various fee and tax related details on a specified ETP including expense ratio and tax treatment for dividends and capital gains.
   * @param symbol Market symbol of ETP defined by FactSet. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @return ApiResponse&lt;InlineResponse20032&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20032> getFactsetEtfTaxesAndFeesUsGetBySymbolWithHttpInfo(String symbol, java.util.Set<String> attributes) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'symbol' is set
    if (symbol == null) {
      throw new ApiException(400, "Missing the required parameter 'symbol' when calling getFactsetEtfTaxesAndFeesUsGetBySymbol");
    }
    
    // create path and map variables
    String localVarPath = "/factset/etf/taxesAndFees/us/getBySymbol";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));
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
        
        InlineResponse20032
      
    > apiResponse = apiClient.invokeAPI("FactsetApi.getFactsetEtfTaxesAndFeesUsGetBySymbol", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getFactsetEtfTaxesAndFeesUsGetBySymbolResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Retrieve historical NAV data for a specified ETP.
   * Retrieve the historical NAV data and the respective fund flows and shares outstanding for a specified fund and time period. Please refer currency.fund in /factset/etf/getBySymbol for currency value.
   * @param symbol Market symbol of ETP defined by FactSet. (required)
   * @param timePeriod Time frame of the data. (optional, default to 1Y)
   * @param alignment Indicates the reference point for the time series data. (optional)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param paginationOffset Non-negative number of entries to skip, or 0 (default). (optional, default to 0.0)
   * @param paginationLimit Non-negative maximum number of entries to return. (optional, default to 20.0)
   * @return InlineResponse20033
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20033 getFactsetEtfTimeSeriesListBySymbol(String symbol, String timePeriod, String alignment, java.util.Set<String> attributes, BigDecimal paginationOffset, BigDecimal paginationLimit) throws ApiException {
    return getFactsetEtfTimeSeriesListBySymbolWithHttpInfo(symbol, timePeriod, alignment, attributes, paginationOffset, paginationLimit).getData();
  }

  /**
   * Retrieve historical NAV data for a specified ETP.
   * Retrieve the historical NAV data and the respective fund flows and shares outstanding for a specified fund and time period. Please refer currency.fund in /factset/etf/getBySymbol for currency value.
   * @param symbol Market symbol of ETP defined by FactSet. (required)
   * @param timePeriod Time frame of the data. (optional, default to 1Y)
   * @param alignment Indicates the reference point for the time series data. (optional)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param paginationOffset Non-negative number of entries to skip, or 0 (default). (optional, default to 0.0)
   * @param paginationLimit Non-negative maximum number of entries to return. (optional, default to 20.0)
   * @return ApiResponse&lt;InlineResponse20033&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20033> getFactsetEtfTimeSeriesListBySymbolWithHttpInfo(String symbol, String timePeriod, String alignment, java.util.Set<String> attributes, BigDecimal paginationOffset, BigDecimal paginationLimit) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'symbol' is set
    if (symbol == null) {
      throw new ApiException(400, "Missing the required parameter 'symbol' when calling getFactsetEtfTimeSeriesListBySymbol");
    }
    
    // create path and map variables
    String localVarPath = "/factset/etf/timeSeries/listBySymbol";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "timePeriod", timePeriod));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "alignment", alignment));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "_attributes", attributes));
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
        
        InlineResponse20033
      
    > apiResponse = apiClient.invokeAPI("FactsetApi.getFactsetEtfTimeSeriesListBySymbol", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getFactsetEtfTimeSeriesListBySymbolResponseTypeMap, false);

    return apiResponse;

  }
}
