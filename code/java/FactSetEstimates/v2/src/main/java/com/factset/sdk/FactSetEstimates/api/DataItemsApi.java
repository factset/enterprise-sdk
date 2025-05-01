package com.factset.sdk.FactSetEstimates.api;

import com.factset.sdk.FactSetEstimates.ApiException;
import com.factset.sdk.FactSetEstimates.ApiClient;
import com.factset.sdk.FactSetEstimates.ApiResponse;
import com.factset.sdk.FactSetEstimates.Configuration;
import com.factset.sdk.FactSetEstimates.Pair;

import jakarta.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.FactSetEstimates.models.ErrorResponse;
import com.factset.sdk.FactSetEstimates.models.MetricsRequest;
import com.factset.sdk.FactSetEstimates.models.MetricsResponse;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class DataItemsApi {
  private ApiClient apiClient;

  public DataItemsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public DataItemsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> getEstimateMetricsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getEstimateMetricsResponseTypeMap.put(200, new GenericType<MetricsResponse>(){});
    getEstimateMetricsResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getEstimateMetricsResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getEstimateMetricsResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getEstimateMetricsResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getEstimateMetricsResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> getEstimateMetricsForListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getEstimateMetricsForListResponseTypeMap.put(200, new GenericType<MetricsResponse>(){});
    getEstimateMetricsForListResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getEstimateMetricsForListResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getEstimateMetricsForListResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getEstimateMetricsForListResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getEstimateMetricsForListResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
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
   * Available Estimate metrics
   * Returns list of available Estimate metrics that can be used in the &#x60;metrics&#x60; parameter of related endpoints. **By default, Factset provides Estimated items in millions across all currencies. For specific metric methodology definitions, reference the &#x60;OAurl&#x60; response items to launch the available methodology page.**  
   * @param category Filters the list of Estimate metrics by major category -   * **FINANCIAL_STATEMENT** &#x3D; Includes Balance Sheet, Cash Flow, and Income Statement.   * **INDUSTRY_METRICS** &#x3D; Industry specific metrics.   * **OTHER** &#x3D; Target Price  (optional)
   * @param subcategory Sub-Category Filter for the Primary Category Requested. Choose a related sub-category for the Category requested. For methodology, visit [OA 16038](https://my.apps.factset.com/oa/pages/16038) &lt;p&gt;Financial Statement -    * **BALANCE_SHEET** - Balance Sheet line items, such as Assets, Long-term Debt, and more.   * **CASH_FLOW** - Cash Flow Statement line items, such as Free Cash Flow and Share Repurchases   * **INCOME_STATEMENT** - Income Statement line items, such as EPS, Sales, DPS, and more.   * **MISCELLANEOUS** - EPS Long Term Growth &lt;/p&gt; &lt;p&gt; Industry Metrics -     * **AIRLINES** - Including items such as Revenue Passenger, Total Revenue per ASK, Available Seats, and more.   * **BANKS** - Including items such as Net Interest Income, Trading Income, Net Loans, and more. SUPPLEMENTAL   * **COMMODITIES** - Including items such as Average Target Price.   * **COMPUTER_HARDWARE** - Including items such as Total Addressable Market.   * **CONSUMER_SERVICES** - Including items such as Gross Merchandise Volume   * **EDUCATION** - Including Items such as Total Student Enrollment   * **FINANCIAL_SERVICE_PROVIDER** - Including items such as Annual Subscription Value   * **FOREX** - Including items such as USD/JPY   * **HOME_BUILDERS** - Including items such as Home Sales, Land Sales, Cancellation Rates, and more.   * **HOSPITALS** - Including items such as Bad Debt Provisions, Medical Cost Ratio, SS Admissions and more.   * **HOTELS** - Including items such as Average Daily Rate, Occupancy %, RevPAR, and more.   * **INSURANCE** - Including items such as Gross Premiums Written, Underwriting Income, and Claims.   * **HOSPITALS** - Including items such as Bad Debt Provisions, Medical Cost Ratio, SS Admissions and more.   * **HOTELS** - Including items such as Average Daily Rate, Occupancy %, RevPAR, and more.   * **INSURANCE** - Including items such as Gross Premiums Written, Underwriting Income, and Claims.   * **MARIJUANA** - Including items such as Cost per Gram and Kg of Cannabis Sold.   * **MINING** - Including items such as Realized Price and Total Production   * **MULTIFINANCIAL** - Including items such as AUM, Net Flows, and Fee Related Earnings.   * **OIL_AND_GAS** - Including items such as Downstream Income, Production per Day, and Exploration Expense.   * **OTHER** - Target Price   * **POWER_AND_UTILITIES** - Including items such as Average Ratebase, Cash Conversion, and more.   * **REITS** - Including items such as Funds from Operations, Implied Cap Rate, and LTV.   * **RESTAURANTS** - Including items such as Restaurant Margin.   * **RETAILERS** - Including items such as Stores Information, Selling Space and Net sales per square foot.   * **SOCIAL_MEDIA_AND_GAMES** - Including items such as Daily Active Users and Monthly Unique Users.    * **TELECOMMUNICATIONS** - Including items such as Gross Adds, Monthly Revenue Per User, Churn, and more.   * **TRANSPORTATION** - Including items such as Revenue Per Unit, Volume Growth, and Operating Ratio.&lt;/p&gt;     (optional)
   * @return MetricsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Estimate data metric items </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public MetricsResponse getEstimateMetrics(String category, String subcategory) throws ApiException {
    return getEstimateMetricsWithHttpInfo(category, subcategory).getData();
  }

  /**
   * Available Estimate metrics
   * Returns list of available Estimate metrics that can be used in the &#x60;metrics&#x60; parameter of related endpoints. **By default, Factset provides Estimated items in millions across all currencies. For specific metric methodology definitions, reference the &#x60;OAurl&#x60; response items to launch the available methodology page.**  
   * @param category Filters the list of Estimate metrics by major category -   * **FINANCIAL_STATEMENT** &#x3D; Includes Balance Sheet, Cash Flow, and Income Statement.   * **INDUSTRY_METRICS** &#x3D; Industry specific metrics.   * **OTHER** &#x3D; Target Price  (optional)
   * @param subcategory Sub-Category Filter for the Primary Category Requested. Choose a related sub-category for the Category requested. For methodology, visit [OA 16038](https://my.apps.factset.com/oa/pages/16038) &lt;p&gt;Financial Statement -    * **BALANCE_SHEET** - Balance Sheet line items, such as Assets, Long-term Debt, and more.   * **CASH_FLOW** - Cash Flow Statement line items, such as Free Cash Flow and Share Repurchases   * **INCOME_STATEMENT** - Income Statement line items, such as EPS, Sales, DPS, and more.   * **MISCELLANEOUS** - EPS Long Term Growth &lt;/p&gt; &lt;p&gt; Industry Metrics -     * **AIRLINES** - Including items such as Revenue Passenger, Total Revenue per ASK, Available Seats, and more.   * **BANKS** - Including items such as Net Interest Income, Trading Income, Net Loans, and more. SUPPLEMENTAL   * **COMMODITIES** - Including items such as Average Target Price.   * **COMPUTER_HARDWARE** - Including items such as Total Addressable Market.   * **CONSUMER_SERVICES** - Including items such as Gross Merchandise Volume   * **EDUCATION** - Including Items such as Total Student Enrollment   * **FINANCIAL_SERVICE_PROVIDER** - Including items such as Annual Subscription Value   * **FOREX** - Including items such as USD/JPY   * **HOME_BUILDERS** - Including items such as Home Sales, Land Sales, Cancellation Rates, and more.   * **HOSPITALS** - Including items such as Bad Debt Provisions, Medical Cost Ratio, SS Admissions and more.   * **HOTELS** - Including items such as Average Daily Rate, Occupancy %, RevPAR, and more.   * **INSURANCE** - Including items such as Gross Premiums Written, Underwriting Income, and Claims.   * **HOSPITALS** - Including items such as Bad Debt Provisions, Medical Cost Ratio, SS Admissions and more.   * **HOTELS** - Including items such as Average Daily Rate, Occupancy %, RevPAR, and more.   * **INSURANCE** - Including items such as Gross Premiums Written, Underwriting Income, and Claims.   * **MARIJUANA** - Including items such as Cost per Gram and Kg of Cannabis Sold.   * **MINING** - Including items such as Realized Price and Total Production   * **MULTIFINANCIAL** - Including items such as AUM, Net Flows, and Fee Related Earnings.   * **OIL_AND_GAS** - Including items such as Downstream Income, Production per Day, and Exploration Expense.   * **OTHER** - Target Price   * **POWER_AND_UTILITIES** - Including items such as Average Ratebase, Cash Conversion, and more.   * **REITS** - Including items such as Funds from Operations, Implied Cap Rate, and LTV.   * **RESTAURANTS** - Including items such as Restaurant Margin.   * **RETAILERS** - Including items such as Stores Information, Selling Space and Net sales per square foot.   * **SOCIAL_MEDIA_AND_GAMES** - Including items such as Daily Active Users and Monthly Unique Users.    * **TELECOMMUNICATIONS** - Including items such as Gross Adds, Monthly Revenue Per User, Churn, and more.   * **TRANSPORTATION** - Including items such as Revenue Per Unit, Volume Growth, and Operating Ratio.&lt;/p&gt;     (optional)
   * @return ApiResponse&lt;MetricsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Estimate data metric items </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<MetricsResponse> getEstimateMetricsWithHttpInfo(String category, String subcategory) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/factset-estimates/v2/metrics";

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
      
    > apiResponse = apiClient.invokeAPI("DataItemsApi.getEstimateMetrics", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getEstimateMetricsResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Available Estimate metrics or ratios.
   * Returns list of available Estimate metrics that can be used in the &#x60;metrics&#x60; parameter of related endpoints. **By default, Factset provides Estimated items in millions across all currencies. For specific metric methodology definitions, reference the &#x60;OAurl&#x60; response items to launch the available methodology page.**  
   * @param metricsRequest Request object for requesting estimates data (required)
   * @return MetricsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> List of Estimate metric Ids </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public MetricsResponse getEstimateMetricsForList(MetricsRequest metricsRequest) throws ApiException {
    return getEstimateMetricsForListWithHttpInfo(metricsRequest).getData();
  }

  /**
   * Available Estimate metrics or ratios.
   * Returns list of available Estimate metrics that can be used in the &#x60;metrics&#x60; parameter of related endpoints. **By default, Factset provides Estimated items in millions across all currencies. For specific metric methodology definitions, reference the &#x60;OAurl&#x60; response items to launch the available methodology page.**  
   * @param metricsRequest Request object for requesting estimates data (required)
   * @return ApiResponse&lt;MetricsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> List of Estimate metric Ids </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<MetricsResponse> getEstimateMetricsForListWithHttpInfo(MetricsRequest metricsRequest) throws ApiException {
    Object localVarPostBody = metricsRequest;
    
    // verify the required parameter 'metricsRequest' is set
    if (metricsRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'metricsRequest' when calling getEstimateMetricsForList");
    }
    
    // create path and map variables
    String localVarPath = "/factset-estimates/v2/metrics";

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
      
    > apiResponse = apiClient.invokeAPI("DataItemsApi.getEstimateMetricsForList", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getEstimateMetricsForListResponseTypeMap, false);

    return apiResponse;

  }
}
