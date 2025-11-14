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

import com.factset.sdk.BestExecutionAnalyticsforSmarterTradingBEAST.models.CostImpactResponseRootV3;
import com.factset.sdk.BestExecutionAnalyticsforSmarterTradingBEAST.models.ErrorResponse;
import java.time.LocalDate;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class MarketImpactApi {
  private ApiClient apiClient;

  public MarketImpactApi() {
    this(Configuration.getDefaultApiClient());
  }

  public MarketImpactApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> getCostImpactV3ResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getCostImpactV3ResponseTypeMap.put(200, new GenericType<CostImpactResponseRootV3>(){});
    getCostImpactV3ResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
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
   * @param orderVolume Order Volume in scientific notation or float format. Example: 1000 or 1.234567e4. (required)
   * @param strategy Specify the strategy, choices are: Optimal, VWAP, TWAP, Custom (optional)
   * @param riskAversion Input risk tolerance from passive to very aggressive (optional)
   * @param date Date in the format YYYY-MM-DD (optional)
   * @param startTime Start Time in the format HH:MM (optional)
   * @param endTime End Time in the format HH:MM (optional)
   * @param isMomentum Flag to apply stock momentum. Specify true to include momentum (optional)
   * @param side Indicate whether a buyer or seller. Only applies when isMomentum is true. Example: Buy or Sell. (optional)
   * @param peer Flag to apply peer calibration. Specify true to include peer calibration (optional)
   * @param frontLoadHalfLife Speeds up early execution (optional)
   * @param rearLoadHalfLife Delays orders towards end of the trading day. (optional)
   * @param rearRatio Adjusts weighting of final execution (optional)
   * @param binsData Flag to apply BinsData. Specify true to include BinsData (optional, default to true)
   * @return CostImpactResponseRootV3
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
  public CostImpactResponseRootV3 getCostImpactV3(String securityId, String orderVolume, String strategy, java.util.List<String> riskAversion, LocalDate date, String startTime, String endTime, Boolean isMomentum, String side, Boolean peer, Float frontLoadHalfLife, Float rearLoadHalfLife, Float rearRatio, Boolean binsData) throws ApiException {
    return getCostImpactV3WithHttpInfo(securityId, orderVolume, strategy, riskAversion, date, startTime, endTime, isMomentum, side, peer, frontLoadHalfLife, rearLoadHalfLife, rearRatio, binsData).getData();
  }

  /**
   * Get Cost Impact
   * Get Cost Impact
   * @param securityId ISIN for European securities, otherwise TICKER (required)
   * @param orderVolume Order Volume in scientific notation or float format. Example: 1000 or 1.234567e4. (required)
   * @param strategy Specify the strategy, choices are: Optimal, VWAP, TWAP, Custom (optional)
   * @param riskAversion Input risk tolerance from passive to very aggressive (optional)
   * @param date Date in the format YYYY-MM-DD (optional)
   * @param startTime Start Time in the format HH:MM (optional)
   * @param endTime End Time in the format HH:MM (optional)
   * @param isMomentum Flag to apply stock momentum. Specify true to include momentum (optional)
   * @param side Indicate whether a buyer or seller. Only applies when isMomentum is true. Example: Buy or Sell. (optional)
   * @param peer Flag to apply peer calibration. Specify true to include peer calibration (optional)
   * @param frontLoadHalfLife Speeds up early execution (optional)
   * @param rearLoadHalfLife Delays orders towards end of the trading day. (optional)
   * @param rearRatio Adjusts weighting of final execution (optional)
   * @param binsData Flag to apply BinsData. Specify true to include BinsData (optional, default to true)
   * @return ApiResponse&lt;CostImpactResponseRootV3&gt;
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
  public ApiResponse<CostImpactResponseRootV3> getCostImpactV3WithHttpInfo(String securityId, String orderVolume, String strategy, java.util.List<String> riskAversion, LocalDate date, String startTime, String endTime, Boolean isMomentum, String side, Boolean peer, Float frontLoadHalfLife, Float rearLoadHalfLife, Float rearRatio, Boolean binsData) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'securityId' is set
    if (securityId == null) {
      throw new ApiException(400, "Missing the required parameter 'securityId' when calling getCostImpactV3");
    }
    
    // verify the required parameter 'orderVolume' is set
    if (orderVolume == null) {
      throw new ApiException(400, "Missing the required parameter 'orderVolume' when calling getCostImpactV3");
    }
    
    // create path and map variables
    String localVarPath = "/tca/market-impact/cost-impact";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "securityId", securityId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "orderVolume", orderVolume));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "strategy", strategy));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "riskAversion", riskAversion));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "date", date));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startTime", startTime));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "endTime", endTime));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "isMomentum", isMomentum));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "side", side));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "peer", peer));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "frontLoadHalfLife", frontLoadHalfLife));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "rearLoadHalfLife", rearLoadHalfLife));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "rearRatio", rearRatio));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "binsData", binsData));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        CostImpactResponseRootV3
      
    > apiResponse = apiClient.invokeAPI("MarketImpactApi.getCostImpactV3", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getCostImpactV3ResponseTypeMap, false);

    return apiResponse;

  }
}
