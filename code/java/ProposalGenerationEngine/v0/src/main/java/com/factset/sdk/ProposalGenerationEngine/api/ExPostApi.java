package com.factset.sdk.ProposalGenerationEngine.api;

import com.factset.sdk.ProposalGenerationEngine.ApiException;
import com.factset.sdk.ProposalGenerationEngine.ApiClient;
import com.factset.sdk.ProposalGenerationEngine.ApiResponse;
import com.factset.sdk.ProposalGenerationEngine.Configuration;
import com.factset.sdk.ProposalGenerationEngine.Pair;

import jakarta.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.ProposalGenerationEngine.models.Errors;
import com.factset.sdk.ProposalGenerationEngine.models.ExPostSeries;
import com.factset.sdk.ProposalGenerationEngine.models.ExPostSeriesResponse;
import com.factset.sdk.ProposalGenerationEngine.models.ExPostSeriesRolling;
import com.factset.sdk.ProposalGenerationEngine.models.ExPostSeriesRollingResponse;
import com.factset.sdk.ProposalGenerationEngine.models.ExPostStats;
import com.factset.sdk.ProposalGenerationEngine.models.ExPostStatsCorrelations;
import com.factset.sdk.ProposalGenerationEngine.models.ExPostStatsCorrelationsResponse;
import com.factset.sdk.ProposalGenerationEngine.models.ExPostStatsFactorExposure;
import com.factset.sdk.ProposalGenerationEngine.models.ExPostStatsFactorExposureResponse;
import com.factset.sdk.ProposalGenerationEngine.models.ExPostStatsResponse;
import com.factset.sdk.ProposalGenerationEngine.models.ExPostStatsRolling;
import com.factset.sdk.ProposalGenerationEngine.models.ExPostStatsRollingResponse;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class ExPostApi {
  private ApiClient apiClient;

  public ExPostApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ExPostApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> calculateExPostCorrelationsStatsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    calculateExPostCorrelationsStatsResponseTypeMap.put(200, new GenericType<ExPostStatsCorrelationsResponse>(){});
    calculateExPostCorrelationsStatsResponseTypeMap.put(501, new GenericType<Errors>(){});
  }

  private static final Map<Integer, GenericType> calculateExPostFactorExposureStatsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    calculateExPostFactorExposureStatsResponseTypeMap.put(200, new GenericType<ExPostStatsFactorExposureResponse>(){});
    calculateExPostFactorExposureStatsResponseTypeMap.put(501, new GenericType<Errors>(){});
  }

  private static final Map<Integer, GenericType> calculateExPostRollingSeriesResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    calculateExPostRollingSeriesResponseTypeMap.put(200, new GenericType<ExPostSeriesRollingResponse>(){});
    calculateExPostRollingSeriesResponseTypeMap.put(501, new GenericType<Errors>(){});
  }

  private static final Map<Integer, GenericType> calculateExPostRollingStatsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    calculateExPostRollingStatsResponseTypeMap.put(200, new GenericType<ExPostStatsRollingResponse>(){});
    calculateExPostRollingStatsResponseTypeMap.put(501, new GenericType<Errors>(){});
  }

  private static final Map<Integer, GenericType> calculateExPostSeriesResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    calculateExPostSeriesResponseTypeMap.put(200, new GenericType<ExPostSeriesResponse>(){});
    calculateExPostSeriesResponseTypeMap.put(400, new GenericType<Errors>(){});
  }

  private static final Map<Integer, GenericType> calculateExPostStatsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    calculateExPostStatsResponseTypeMap.put(200, new GenericType<ExPostStatsResponse>(){});
    calculateExPostStatsResponseTypeMap.put(400, new GenericType<Errors>(){});
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
   * calculate portfolio vs benchmark correlation and correlation between portfolio holdings
   * Notes:&lt;br&gt; * id &#39;Cash proxy&#39; can be used in order to set cash amount for the portfolio
   * @param exPostStatsCorrelations  (optional)
   * @return ExPostStatsCorrelationsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Status 200 </td><td>  -  </td></tr>
       <tr><td> 501 </td><td> Server is unable to process your request </td><td>  -  </td></tr>
     </table>
   */
  public ExPostStatsCorrelationsResponse calculateExPostCorrelationsStats(ExPostStatsCorrelations exPostStatsCorrelations) throws ApiException {
    return calculateExPostCorrelationsStatsWithHttpInfo(exPostStatsCorrelations).getData();
  }

  /**
   * calculate portfolio vs benchmark correlation and correlation between portfolio holdings
   * Notes:&lt;br&gt; * id &#39;Cash proxy&#39; can be used in order to set cash amount for the portfolio
   * @param exPostStatsCorrelations  (optional)
   * @return ApiResponse&lt;ExPostStatsCorrelationsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Status 200 </td><td>  -  </td></tr>
       <tr><td> 501 </td><td> Server is unable to process your request </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ExPostStatsCorrelationsResponse> calculateExPostCorrelationsStatsWithHttpInfo(ExPostStatsCorrelations exPostStatsCorrelations) throws ApiException {
    Object localVarPostBody = exPostStatsCorrelations;
    
    // create path and map variables
    String localVarPath = "/portfolios/ex-post/stats/correlations";

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
        
        ExPostStatsCorrelationsResponse
      
    > apiResponse = apiClient.invokeAPI("ExPostApi.calculateExPostCorrelationsStats", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, calculateExPostCorrelationsStatsResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Create portfolio and return risk factor contribution
   * Ex-Post factor-exposure Stats
   * @param exPostStatsFactorExposure  (optional)
   * @return ExPostStatsFactorExposureResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Status 200 </td><td>  -  </td></tr>
       <tr><td> 501 </td><td> Server is unable to process your request </td><td>  -  </td></tr>
     </table>
   */
  public ExPostStatsFactorExposureResponse calculateExPostFactorExposureStats(ExPostStatsFactorExposure exPostStatsFactorExposure) throws ApiException {
    return calculateExPostFactorExposureStatsWithHttpInfo(exPostStatsFactorExposure).getData();
  }

  /**
   * Create portfolio and return risk factor contribution
   * Ex-Post factor-exposure Stats
   * @param exPostStatsFactorExposure  (optional)
   * @return ApiResponse&lt;ExPostStatsFactorExposureResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Status 200 </td><td>  -  </td></tr>
       <tr><td> 501 </td><td> Server is unable to process your request </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ExPostStatsFactorExposureResponse> calculateExPostFactorExposureStatsWithHttpInfo(ExPostStatsFactorExposure exPostStatsFactorExposure) throws ApiException {
    Object localVarPostBody = exPostStatsFactorExposure;
    
    // create path and map variables
    String localVarPath = "/portfolios/ex-post/stats/factor-exposure";

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
        
        ExPostStatsFactorExposureResponse
      
    > apiResponse = apiClient.invokeAPI("ExPostApi.calculateExPostFactorExposureStats", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, calculateExPostFactorExposureStatsResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * retrieve series of rolling stats for the portfolio
   * Notes:&lt;br&gt; * id &#39;Cash proxy&#39; can be used in order to set cash amount for the portfolio
   * @param exPostSeriesRolling  (optional)
   * @return ExPostSeriesRollingResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Status 200 </td><td>  -  </td></tr>
       <tr><td> 501 </td><td> Server is unable to process your request </td><td>  -  </td></tr>
     </table>
   */
  public ExPostSeriesRollingResponse calculateExPostRollingSeries(ExPostSeriesRolling exPostSeriesRolling) throws ApiException {
    return calculateExPostRollingSeriesWithHttpInfo(exPostSeriesRolling).getData();
  }

  /**
   * retrieve series of rolling stats for the portfolio
   * Notes:&lt;br&gt; * id &#39;Cash proxy&#39; can be used in order to set cash amount for the portfolio
   * @param exPostSeriesRolling  (optional)
   * @return ApiResponse&lt;ExPostSeriesRollingResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Status 200 </td><td>  -  </td></tr>
       <tr><td> 501 </td><td> Server is unable to process your request </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ExPostSeriesRollingResponse> calculateExPostRollingSeriesWithHttpInfo(ExPostSeriesRolling exPostSeriesRolling) throws ApiException {
    Object localVarPostBody = exPostSeriesRolling;
    
    // create path and map variables
    String localVarPath = "/portfolios/ex-post/series/rolling";

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
        
        ExPostSeriesRollingResponse
      
    > apiResponse = apiClient.invokeAPI("ExPostApi.calculateExPostRollingSeries", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, calculateExPostRollingSeriesResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * calculate rolling stats (for ex-post data)
   * Notes:&lt;br&gt; * id &#39;Cash proxy&#39; can be used in order to set cash amount for the portfolio
   * @param exPostStatsRolling  (optional)
   * @return ExPostStatsRollingResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Status 200 </td><td>  -  </td></tr>
       <tr><td> 501 </td><td> Server is unable to process your request </td><td>  -  </td></tr>
     </table>
   */
  public ExPostStatsRollingResponse calculateExPostRollingStats(ExPostStatsRolling exPostStatsRolling) throws ApiException {
    return calculateExPostRollingStatsWithHttpInfo(exPostStatsRolling).getData();
  }

  /**
   * calculate rolling stats (for ex-post data)
   * Notes:&lt;br&gt; * id &#39;Cash proxy&#39; can be used in order to set cash amount for the portfolio
   * @param exPostStatsRolling  (optional)
   * @return ApiResponse&lt;ExPostStatsRollingResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Status 200 </td><td>  -  </td></tr>
       <tr><td> 501 </td><td> Server is unable to process your request </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ExPostStatsRollingResponse> calculateExPostRollingStatsWithHttpInfo(ExPostStatsRolling exPostStatsRolling) throws ApiException {
    Object localVarPostBody = exPostStatsRolling;
    
    // create path and map variables
    String localVarPath = "/portfolios/ex-post/stats/rolling";

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
        
        ExPostStatsRollingResponse
      
    > apiResponse = apiClient.invokeAPI("ExPostApi.calculateExPostRollingStats", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, calculateExPostRollingStatsResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * retrieve portfolio and benchmark data series, generated from the underlying holdings data series
   * Notes:&lt;br&gt; * id &#39;Cash proxy&#39; can be used in order to set cash amount for the portfolio
   * @param exPostSeries  (optional)
   * @return ExPostSeriesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful request </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
     </table>
   */
  public ExPostSeriesResponse calculateExPostSeries(ExPostSeries exPostSeries) throws ApiException {
    return calculateExPostSeriesWithHttpInfo(exPostSeries).getData();
  }

  /**
   * retrieve portfolio and benchmark data series, generated from the underlying holdings data series
   * Notes:&lt;br&gt; * id &#39;Cash proxy&#39; can be used in order to set cash amount for the portfolio
   * @param exPostSeries  (optional)
   * @return ApiResponse&lt;ExPostSeriesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful request </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ExPostSeriesResponse> calculateExPostSeriesWithHttpInfo(ExPostSeries exPostSeries) throws ApiException {
    Object localVarPostBody = exPostSeries;
    
    // create path and map variables
    String localVarPath = "/portfolios/ex-post/series";

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
        
        ExPostSeriesResponse
      
    > apiResponse = apiClient.invokeAPI("ExPostApi.calculateExPostSeries", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, calculateExPostSeriesResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * calculate ex-post stats (on portfolio or holdings level)
   * Notes:&lt;br&gt; * id &#39;Cash proxy&#39; can be used in order to set cash amount for the portfolio
   * @param exPostStats  (optional)
   * @return ExPostStatsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Status 200 </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
     </table>
   */
  public ExPostStatsResponse calculateExPostStats(ExPostStats exPostStats) throws ApiException {
    return calculateExPostStatsWithHttpInfo(exPostStats).getData();
  }

  /**
   * calculate ex-post stats (on portfolio or holdings level)
   * Notes:&lt;br&gt; * id &#39;Cash proxy&#39; can be used in order to set cash amount for the portfolio
   * @param exPostStats  (optional)
   * @return ApiResponse&lt;ExPostStatsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Status 200 </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ExPostStatsResponse> calculateExPostStatsWithHttpInfo(ExPostStats exPostStats) throws ApiException {
    Object localVarPostBody = exPostStats;
    
    // create path and map variables
    String localVarPath = "/portfolios/ex-post/stats";

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
        
        ExPostStatsResponse
      
    > apiResponse = apiClient.invokeAPI("ExPostApi.calculateExPostStats", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, calculateExPostStatsResponseTypeMap, false);

    return apiResponse;

  }
}
