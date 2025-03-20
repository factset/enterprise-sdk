package com.factset.sdk.BestExecutionAnalyticsforSmarterTradingBEAST.api;

import com.factset.sdk.BestExecutionAnalyticsforSmarterTradingBEAST.ApiException;
import com.factset.sdk.BestExecutionAnalyticsforSmarterTradingBEAST.ApiClient;
import com.factset.sdk.BestExecutionAnalyticsforSmarterTradingBEAST.ApiResponse;
import com.factset.sdk.BestExecutionAnalyticsforSmarterTradingBEAST.Configuration;
import com.factset.sdk.BestExecutionAnalyticsforSmarterTradingBEAST.Pair;

import jakarta.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.BestExecutionAnalyticsforSmarterTradingBEAST.models.CostImpactResponseRoot;
import com.factset.sdk.BestExecutionAnalyticsforSmarterTradingBEAST.models.ErrorResponse;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class MarketImpactApi {
  private ApiClient apiClient;

  public MarketImpactApi() {
    this(Configuration.getDefaultApiClient());
  }

  public MarketImpactApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> getCostImpactResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getCostImpactResponseTypeMap.put(200, new GenericType<CostImpactResponseRoot>(){});
    getCostImpactResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
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
   * Get Cost Impact
   * Get Cost Impact
   * @param securityId ISIN for European securities, otherwise TICKER (required)
   * @param region The two character ISO country code of the trading region. EMEA is used for the European trading region (required)
   * @param currency The ISO 4217 currency code (required)
   * @param orderVolume Order Volume (required)
   * @param strategy Specify the strategy, choices are: Optimal, VWAP, TWAP, Custom (optional)
   * @param date Date in the format YYYY-MM-DD (optional)
   * @param isin International securities identification number (optional)
   * @param startTime Start Time in the format HH:MM:SS (optional)
   * @param endTime End Time in the format HH:MM:SS (optional)
   * @param frontLoadHalfLife Front Load Half Life (optional)
   * @param rearLoadHalfLife Rear Load Half Life (optional)
   * @param rearRatio Rear Ratio (optional)
   * @param riskAversion Risk Aversion (optional)
   * @param applyMomentum Flag to apply stock momentum. Specify true to include momentum (optional)
   * @param side Indicate whether a buyer or seller. Only applies when applyMomentum is true. Example: Buy or Sell. (optional)
   * @return CostImpactResponseRoot
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Expected response. </td><td>  * X-DataDirect-Request-Key - FactSet request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify the API request. Only available after successful authentication. <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Reset - Number of seconds remaining until the rate limit resets. <br>  </td></tr>
       <tr><td> 400 </td><td> Invalid query parameters. </td><td>  * X-DataDirect-Request-Key - FactSet request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify the API request. Only available after successful authentication. <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Reset - Number of seconds remaining until the rate limit resets. <br>  </td></tr>
       <tr><td> 401 </td><td> Missing or invalid authentication. </td><td>  * X-DataDirect-Request-Key - FactSet request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify the API request. Only available after successful authentication. <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Reset - Number of seconds remaining until the rate limit resets. <br>  </td></tr>
       <tr><td> 403 </td><td> User is forbidden with current credentials. </td><td>  * X-DataDirect-Request-Key - FactSet request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify the API request. Only available after successful authentication. <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Reset - Number of seconds remaining until the rate limit resets. <br>  </td></tr>
       <tr><td> 429 </td><td> Rate limit reached. Retry the requests after waiting the time specified in the Retry-After header. </td><td>  * X-DataDirect-Request-Key - FactSet request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify the API request. Only available after successful authentication. <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Reset - Number of seconds remaining until the rate limit resets. <br>  * Retry-After - Time to wait in seconds before making a new request as the rate limit has been reached. <br>  </td></tr>
       <tr><td> 500 </td><td> Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key - FactSet request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify the API request. Only available after successful authentication. <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Reset - Number of seconds remaining until the rate limit resets. <br>  </td></tr>
       <tr><td> 503 </td><td> Request timed out. </td><td>  * X-DataDirect-Request-Key - FactSet request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify the API request. Only available after successful authentication. <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Reset - Number of seconds remaining until the rate limit resets. <br>  </td></tr>
     </table>
   */
  public CostImpactResponseRoot getCostImpact(String securityId, String region, String currency, Float orderVolume, String strategy, String date, String isin, String startTime, String endTime, Float frontLoadHalfLife, Float rearLoadHalfLife, Float rearRatio, Float riskAversion, Boolean applyMomentum, String side) throws ApiException {
    return getCostImpactWithHttpInfo(securityId, region, currency, orderVolume, strategy, date, isin, startTime, endTime, frontLoadHalfLife, rearLoadHalfLife, rearRatio, riskAversion, applyMomentum, side).getData();
  }

  /**
   * Get Cost Impact
   * Get Cost Impact
   * @param securityId ISIN for European securities, otherwise TICKER (required)
   * @param region The two character ISO country code of the trading region. EMEA is used for the European trading region (required)
   * @param currency The ISO 4217 currency code (required)
   * @param orderVolume Order Volume (required)
   * @param strategy Specify the strategy, choices are: Optimal, VWAP, TWAP, Custom (optional)
   * @param date Date in the format YYYY-MM-DD (optional)
   * @param isin International securities identification number (optional)
   * @param startTime Start Time in the format HH:MM:SS (optional)
   * @param endTime End Time in the format HH:MM:SS (optional)
   * @param frontLoadHalfLife Front Load Half Life (optional)
   * @param rearLoadHalfLife Rear Load Half Life (optional)
   * @param rearRatio Rear Ratio (optional)
   * @param riskAversion Risk Aversion (optional)
   * @param applyMomentum Flag to apply stock momentum. Specify true to include momentum (optional)
   * @param side Indicate whether a buyer or seller. Only applies when applyMomentum is true. Example: Buy or Sell. (optional)
   * @return ApiResponse&lt;CostImpactResponseRoot&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Expected response. </td><td>  * X-DataDirect-Request-Key - FactSet request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify the API request. Only available after successful authentication. <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Reset - Number of seconds remaining until the rate limit resets. <br>  </td></tr>
       <tr><td> 400 </td><td> Invalid query parameters. </td><td>  * X-DataDirect-Request-Key - FactSet request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify the API request. Only available after successful authentication. <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Reset - Number of seconds remaining until the rate limit resets. <br>  </td></tr>
       <tr><td> 401 </td><td> Missing or invalid authentication. </td><td>  * X-DataDirect-Request-Key - FactSet request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify the API request. Only available after successful authentication. <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Reset - Number of seconds remaining until the rate limit resets. <br>  </td></tr>
       <tr><td> 403 </td><td> User is forbidden with current credentials. </td><td>  * X-DataDirect-Request-Key - FactSet request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify the API request. Only available after successful authentication. <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Reset - Number of seconds remaining until the rate limit resets. <br>  </td></tr>
       <tr><td> 429 </td><td> Rate limit reached. Retry the requests after waiting the time specified in the Retry-After header. </td><td>  * X-DataDirect-Request-Key - FactSet request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify the API request. Only available after successful authentication. <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Reset - Number of seconds remaining until the rate limit resets. <br>  * Retry-After - Time to wait in seconds before making a new request as the rate limit has been reached. <br>  </td></tr>
       <tr><td> 500 </td><td> Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key - FactSet request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify the API request. Only available after successful authentication. <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Reset - Number of seconds remaining until the rate limit resets. <br>  </td></tr>
       <tr><td> 503 </td><td> Request timed out. </td><td>  * X-DataDirect-Request-Key - FactSet request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify the API request. Only available after successful authentication. <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Reset - Number of seconds remaining until the rate limit resets. <br>  </td></tr>
     </table>
   */
  public ApiResponse<CostImpactResponseRoot> getCostImpactWithHttpInfo(String securityId, String region, String currency, Float orderVolume, String strategy, String date, String isin, String startTime, String endTime, Float frontLoadHalfLife, Float rearLoadHalfLife, Float rearRatio, Float riskAversion, Boolean applyMomentum, String side) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'securityId' is set
    if (securityId == null) {
      throw new ApiException(400, "Missing the required parameter 'securityId' when calling getCostImpact");
    }
    
    // verify the required parameter 'region' is set
    if (region == null) {
      throw new ApiException(400, "Missing the required parameter 'region' when calling getCostImpact");
    }
    
    // verify the required parameter 'currency' is set
    if (currency == null) {
      throw new ApiException(400, "Missing the required parameter 'currency' when calling getCostImpact");
    }
    
    // verify the required parameter 'orderVolume' is set
    if (orderVolume == null) {
      throw new ApiException(400, "Missing the required parameter 'orderVolume' when calling getCostImpact");
    }
    
    // create path and map variables
    String localVarPath = "/tca/market-impact/cost-impact";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "securityId", securityId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "region", region));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "currency", currency));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "orderVolume", orderVolume));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "strategy", strategy));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "date", date));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "isin", isin));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startTime", startTime));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "endTime", endTime));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "frontLoadHalfLife", frontLoadHalfLife));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "rearLoadHalfLife", rearLoadHalfLife));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "rearRatio", rearRatio));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "riskAversion", riskAversion));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "applyMomentum", applyMomentum));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "side", side));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        CostImpactResponseRoot
      
    > apiResponse = apiClient.invokeAPI("MarketImpactApi.getCostImpact", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getCostImpactResponseTypeMap, false);

    return apiResponse;

  }
}
