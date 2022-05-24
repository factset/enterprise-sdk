package com.factset.sdk.FactSetETF.api;

import com.factset.sdk.FactSetETF.ApiException;
import com.factset.sdk.FactSetETF.ApiClient;
import com.factset.sdk.FactSetETF.ApiResponse;
import com.factset.sdk.FactSetETF.Configuration;
import com.factset.sdk.FactSetETF.Pair;

import javax.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.FactSetETF.models.Category;
import com.factset.sdk.FactSetETF.models.MetricsResponse;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DataItemsApi {
  private ApiClient apiClient;

  public DataItemsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public DataItemsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

    private static final Map<Integer, GenericType> getEtfMetricsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getEtfMetricsResponseTypeMap.put(200, new GenericType<MetricsResponse>(){});
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
   * Available ETF metrics
   * Returns a list of available metrics that can be used in the &#x60;metrics&#x60; parameter of related endpoints. Leave _category_ blank to request all available items. 
   * @param category The available categories that can be used to select collections of metrics for use within the ETF endpoints. |category|description| |---|---| |BENCHMARK_DETAILS|Details surrounding the underlying Benchmark Id and Segment Banchmark| |CLASSIFICATION|FactSet Fund Classification Codes and Names, across Asset Class, Broad  Geography, Fund Categories, Focus, Niche, and more.| |COSTS_FEES|Expenses and Fees such as capital gains, expense ratio, management fees, and more.| |COUNTERPARTY|Credit and Swap Counterparty details| |CREATE_REDEEM|Creation and Redemption Sizes| |DESCRIPTIVE|General Descriptive information such as name, objectives, issuer details, launch dates, website, and more.| |DISTRIBUTIONS|Dividend Dates, Dividend Treatmetns, Min/Max Cap Gains| |DOCUMENTATION|Details surrounding reporting information.| |GEARING|Leverage factors, inverse flags, and more.| |HEDGE|Hedging Information| |RISK|CIFSC Risk Ratings| |SERVICE_PROVIDERS|Distributors, issuers, and Advisor details| |STATUS|Actively Managed Flags| |STRATEGY|Segment Codes, selection criteria, strategy codes, weighting schemes, and lending details.| |STRUCTURE|ETF Type, backing codes, synthetic types, ucits compliance, legal structures, and more.| |TAX|Tax Types, distribution takes, K1 Flags, and more.|  (optional)
   * @return MetricsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Metrics Response </td><td>  -  </td></tr>
     </table>
   */
  public MetricsResponse getEtfMetrics(Category category) throws ApiException {
    return getEtfMetricsWithHttpInfo(category).getData();
  }

  /**
   * Available ETF metrics
   * Returns a list of available metrics that can be used in the &#x60;metrics&#x60; parameter of related endpoints. Leave _category_ blank to request all available items. 
   * @param category The available categories that can be used to select collections of metrics for use within the ETF endpoints. |category|description| |---|---| |BENCHMARK_DETAILS|Details surrounding the underlying Benchmark Id and Segment Banchmark| |CLASSIFICATION|FactSet Fund Classification Codes and Names, across Asset Class, Broad  Geography, Fund Categories, Focus, Niche, and more.| |COSTS_FEES|Expenses and Fees such as capital gains, expense ratio, management fees, and more.| |COUNTERPARTY|Credit and Swap Counterparty details| |CREATE_REDEEM|Creation and Redemption Sizes| |DESCRIPTIVE|General Descriptive information such as name, objectives, issuer details, launch dates, website, and more.| |DISTRIBUTIONS|Dividend Dates, Dividend Treatmetns, Min/Max Cap Gains| |DOCUMENTATION|Details surrounding reporting information.| |GEARING|Leverage factors, inverse flags, and more.| |HEDGE|Hedging Information| |RISK|CIFSC Risk Ratings| |SERVICE_PROVIDERS|Distributors, issuers, and Advisor details| |STATUS|Actively Managed Flags| |STRATEGY|Segment Codes, selection criteria, strategy codes, weighting schemes, and lending details.| |STRUCTURE|ETF Type, backing codes, synthetic types, ucits compliance, legal structures, and more.| |TAX|Tax Types, distribution takes, K1 Flags, and more.|  (optional)
   * @return ApiResponse&lt;MetricsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Metrics Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<MetricsResponse> getEtfMetricsWithHttpInfo(Category category) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/factset-etf/v1/metrics";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "category", category));

    
    
    
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
      
    > apiResponse = apiClient.invokeAPI("DataItemsApi.getEtfMetrics", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getEtfMetricsResponseTypeMap, false);

    return apiResponse;

  }
}
