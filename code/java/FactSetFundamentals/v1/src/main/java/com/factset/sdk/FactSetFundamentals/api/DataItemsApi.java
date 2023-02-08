package com.factset.sdk.FactSetFundamentals.api;

import com.factset.sdk.FactSetFundamentals.ApiException;
import com.factset.sdk.FactSetFundamentals.ApiClient;
import com.factset.sdk.FactSetFundamentals.ApiResponse;
import com.factset.sdk.FactSetFundamentals.Configuration;
import com.factset.sdk.FactSetFundamentals.Pair;

import javax.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.FactSetFundamentals.models.ErrorResponse;
import com.factset.sdk.FactSetFundamentals.models.MetricsRequest;
import com.factset.sdk.FactSetFundamentals.models.MetricsResponse;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DataItemsApi {
  private ApiClient apiClient;

  public DataItemsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public DataItemsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> getFdsFundamentalsMetricsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getFdsFundamentalsMetricsResponseTypeMap.put(200, new GenericType<MetricsResponse>(){});
    getFdsFundamentalsMetricsResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getFdsFundamentalsMetricsResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getFdsFundamentalsMetricsResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getFdsFundamentalsMetricsResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getFdsFundamentalsMetricsResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> getFdsFundamentalsMetricsForListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getFdsFundamentalsMetricsForListResponseTypeMap.put(200, new GenericType<MetricsResponse>(){});
    getFdsFundamentalsMetricsForListResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getFdsFundamentalsMetricsForListResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getFdsFundamentalsMetricsForListResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getFdsFundamentalsMetricsForListResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getFdsFundamentalsMetricsForListResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
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
   * Available fundamental metrics or ratios.
   * Returns list of available FF_* metrics that can be used in the &#x60;metrics&#x60; parameter of related endpoints. These are related to FactSet Fundamentals standardized data. As Reported will be available in future endpoints. Leave Category and Subcategory blank to request all available items. The Endpoint Data model is optimized for timeseries data with periodicity. Some items in this list are non-timeseries. **For methodology definitions, reference the &#x60;OApageID&#x60; or &#x60;OAurl&#x60; response items to launch the available methodology page.** 
   * @param category Filters the list of FF_* metrics by major category -   * **INCOME_STATEMENT** &#x3D; Income Statement line items, such as Sales, Gross Profit, Net Income.   * **BALANCE_SHEET** &#x3D; Balance Sheet line items, such as Assets, Liabilities, and Shareholders Equity.   * **CASH_FLOW** &#x3D; Cash Flow Statement line items, such as Financing activities, Operation, and Per Share.   * **RATIOS** &#x3D; Pre-calculated Ratios, including Financial, Growth Rates, Profitability, Liquidity, Size, and Valuation.   * **FINANCIAL_SERVICES** &#x3D; Financial Statement Items modified for Financial Services companies.   * **INDUSTRY_METRICS** &#x3D; Industry Specific Line Items or Modifications. View subcategory for list of Industries.   * **PENSION_AND_POSTRETIREMENT** &#x3D; Accumulated Pension Benefit Obligations and related data.   * **MARKET_DATA** &#x3D; General Market Data, such as Shares Outstanding. *Note - /factset-prices/prices/ endpoints may be better suited for pricing related market data.*   * **MISCELLANEOUS** &#x3D; Corporation Data, Financial Records details, Indicators.   * **DATES** &#x3D; Relevant Dates  (optional)
   * @param subcategory Sub-Category Filter for the Primary Category Requested. Choose a related sub-category for the Category requested-   * **INCOME_STATEMENT** - INCOME_STATEMENT, NON-OPERATING, PER_SHARE, SUPPLEMENTAL, OTHER   * **BALANCE_SHEET** - ASSETS, BALANCE_SHEET, HEALTHCARE, LIABILITIES, PER_SHARE, SHAREHOLDERS_EQUITY, SUPPLEMENTAL   * **CASH_FLOW** - CASH_FLOW, CHANGE_IN_CASH, FINANCING, INVESTING, OPERATING, PER_SHARE, SUPPLEMENTAL   * **RATIOS** - FINANCIAL, GROWTH_RATE, LIQUIDITY, PROFITABILITY, SIZE, VALUATION   * **FINANCIAL_SERVICES** - BALANCE_SHEET, INCOME_STATEMENT, SUPPLEMENTAL   * **INDUSTRY_METRICS** - AIRLINES, BANKING, HOTELS_AND_GAMING, METALS_AND_MINING, OIL_AND_GAS, PHARMACEUTICAL, REIT, RETAIL, BANK, INSURANCE, UTILITY   * **PENSION_AND_POSTRETIREMENT** - PENSION_AND_POSTRETIREMENT   * **MARKET_DATA** - MARKET_DATA   * **MISCELLANEOUS** - CLASSIFICATION, CORPORATE_DATA, FINANCIAL_RECORDS, INDICATOR, EMPLOYEES_AND_MANAGEMENT   * **DATES** - DATES  (optional)
   * @return MetricsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Fundamental data metric items </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public MetricsResponse getFdsFundamentalsMetrics(String category, String subcategory) throws ApiException {
    return getFdsFundamentalsMetricsWithHttpInfo(category, subcategory).getData();
  }

  /**
   * Available fundamental metrics or ratios.
   * Returns list of available FF_* metrics that can be used in the &#x60;metrics&#x60; parameter of related endpoints. These are related to FactSet Fundamentals standardized data. As Reported will be available in future endpoints. Leave Category and Subcategory blank to request all available items. The Endpoint Data model is optimized for timeseries data with periodicity. Some items in this list are non-timeseries. **For methodology definitions, reference the &#x60;OApageID&#x60; or &#x60;OAurl&#x60; response items to launch the available methodology page.** 
   * @param category Filters the list of FF_* metrics by major category -   * **INCOME_STATEMENT** &#x3D; Income Statement line items, such as Sales, Gross Profit, Net Income.   * **BALANCE_SHEET** &#x3D; Balance Sheet line items, such as Assets, Liabilities, and Shareholders Equity.   * **CASH_FLOW** &#x3D; Cash Flow Statement line items, such as Financing activities, Operation, and Per Share.   * **RATIOS** &#x3D; Pre-calculated Ratios, including Financial, Growth Rates, Profitability, Liquidity, Size, and Valuation.   * **FINANCIAL_SERVICES** &#x3D; Financial Statement Items modified for Financial Services companies.   * **INDUSTRY_METRICS** &#x3D; Industry Specific Line Items or Modifications. View subcategory for list of Industries.   * **PENSION_AND_POSTRETIREMENT** &#x3D; Accumulated Pension Benefit Obligations and related data.   * **MARKET_DATA** &#x3D; General Market Data, such as Shares Outstanding. *Note - /factset-prices/prices/ endpoints may be better suited for pricing related market data.*   * **MISCELLANEOUS** &#x3D; Corporation Data, Financial Records details, Indicators.   * **DATES** &#x3D; Relevant Dates  (optional)
   * @param subcategory Sub-Category Filter for the Primary Category Requested. Choose a related sub-category for the Category requested-   * **INCOME_STATEMENT** - INCOME_STATEMENT, NON-OPERATING, PER_SHARE, SUPPLEMENTAL, OTHER   * **BALANCE_SHEET** - ASSETS, BALANCE_SHEET, HEALTHCARE, LIABILITIES, PER_SHARE, SHAREHOLDERS_EQUITY, SUPPLEMENTAL   * **CASH_FLOW** - CASH_FLOW, CHANGE_IN_CASH, FINANCING, INVESTING, OPERATING, PER_SHARE, SUPPLEMENTAL   * **RATIOS** - FINANCIAL, GROWTH_RATE, LIQUIDITY, PROFITABILITY, SIZE, VALUATION   * **FINANCIAL_SERVICES** - BALANCE_SHEET, INCOME_STATEMENT, SUPPLEMENTAL   * **INDUSTRY_METRICS** - AIRLINES, BANKING, HOTELS_AND_GAMING, METALS_AND_MINING, OIL_AND_GAS, PHARMACEUTICAL, REIT, RETAIL, BANK, INSURANCE, UTILITY   * **PENSION_AND_POSTRETIREMENT** - PENSION_AND_POSTRETIREMENT   * **MARKET_DATA** - MARKET_DATA   * **MISCELLANEOUS** - CLASSIFICATION, CORPORATE_DATA, FINANCIAL_RECORDS, INDICATOR, EMPLOYEES_AND_MANAGEMENT   * **DATES** - DATES  (optional)
   * @return ApiResponse&lt;MetricsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Fundamental data metric items </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<MetricsResponse> getFdsFundamentalsMetricsWithHttpInfo(String category, String subcategory) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/factset-fundamentals/v1/metrics";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "category", category));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "subcategory", subcategory));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        MetricsResponse
      
    > apiResponse = apiClient.invokeAPI("DataItemsApi.getFdsFundamentalsMetrics", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getFdsFundamentalsMetricsResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Available fundamental metrics or ratios.
   * Returns list of available FF_* metrics that can be used in the &#x60;metrics&#x60; parameter of related endpoints. These are related to FactSet Fundamentals standardized data. As-Reported will be available in future endpoints. Leave Category and Subcategory blank to request all available items. The Endpoint Data model is optimized for timeseries data with periodicity. Some items in this list are non-timeseries.        **For methodology definitions, reference the &#x60;OApageID&#x60; or &#x60;OAurl&#x60; response items to launch the available methodology page.** 
   * @param metricsRequest Request object for requesting fundamentals data (required)
   * @return MetricsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> List of sample Fundamental metric Ids </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public MetricsResponse getFdsFundamentalsMetricsForList(MetricsRequest metricsRequest) throws ApiException {
    return getFdsFundamentalsMetricsForListWithHttpInfo(metricsRequest).getData();
  }

  /**
   * Available fundamental metrics or ratios.
   * Returns list of available FF_* metrics that can be used in the &#x60;metrics&#x60; parameter of related endpoints. These are related to FactSet Fundamentals standardized data. As-Reported will be available in future endpoints. Leave Category and Subcategory blank to request all available items. The Endpoint Data model is optimized for timeseries data with periodicity. Some items in this list are non-timeseries.        **For methodology definitions, reference the &#x60;OApageID&#x60; or &#x60;OAurl&#x60; response items to launch the available methodology page.** 
   * @param metricsRequest Request object for requesting fundamentals data (required)
   * @return ApiResponse&lt;MetricsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> List of sample Fundamental metric Ids </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<MetricsResponse> getFdsFundamentalsMetricsForListWithHttpInfo(MetricsRequest metricsRequest) throws ApiException {
    Object localVarPostBody = metricsRequest;
    
    // verify the required parameter 'metricsRequest' is set
    if (metricsRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'metricsRequest' when calling getFdsFundamentalsMetricsForList");
    }
    
    // create path and map variables
    String localVarPath = "/factset-fundamentals/v1/metrics";

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
        
        MetricsResponse
      
    > apiResponse = apiClient.invokeAPI("DataItemsApi.getFdsFundamentalsMetricsForList", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getFdsFundamentalsMetricsForListResponseTypeMap, false);

    return apiResponse;

  }
}
