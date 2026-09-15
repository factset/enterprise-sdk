package com.factset.sdk.FactSetPowerUtilities.api;

import com.factset.sdk.FactSetPowerUtilities.ApiException;
import com.factset.sdk.FactSetPowerUtilities.ApiClient;
import com.factset.sdk.FactSetPowerUtilities.ApiResponse;
import com.factset.sdk.FactSetPowerUtilities.Configuration;
import com.factset.sdk.FactSetPowerUtilities.Pair;

import jakarta.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.FactSetPowerUtilities.models.ErrorResponse;
import com.factset.sdk.FactSetPowerUtilities.models.MarketDataCoverageResponse;
import com.factset.sdk.FactSetPowerUtilities.models.MarketDataRequest;
import com.factset.sdk.FactSetPowerUtilities.models.MarketDataResponse;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class MarketDataApi {
  private ApiClient apiClient;

  public MarketDataApi() {
    this(Configuration.getDefaultApiClient());
  }

  public MarketDataApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> listMarketDataResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    listMarketDataResponseTypeMap.put(200, new GenericType<MarketDataResponse>(){});
    listMarketDataResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    listMarketDataResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    listMarketDataResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    listMarketDataResponseTypeMap.put(404, new GenericType<ErrorResponse>(){});
    listMarketDataResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    listMarketDataResponseTypeMap.put(422, new GenericType<ErrorResponse>(){});
    listMarketDataResponseTypeMap.put(429, new GenericType<ErrorResponse>(){});
    listMarketDataResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
    listMarketDataResponseTypeMap.put(503, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> listMarketDataCoverageResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    listMarketDataCoverageResponseTypeMap.put(200, new GenericType<MarketDataCoverageResponse>(){});
    listMarketDataCoverageResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    listMarketDataCoverageResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    listMarketDataCoverageResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    listMarketDataCoverageResponseTypeMap.put(404, new GenericType<ErrorResponse>(){});
    listMarketDataCoverageResponseTypeMap.put(429, new GenericType<ErrorResponse>(){});
    listMarketDataCoverageResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
    listMarketDataCoverageResponseTypeMap.put(503, new GenericType<ErrorResponse>(){});
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
   * Returns balancing authority generation, demand, or interchange
   * Returns balancing authority time-series data for one of three categories, selected via the &#x60;category&#x60; discriminator in the request body:  * **&#x60;Generation&#x60;** — Hourly net generation in MW by fuel type for the specified balancing authorities (&#x60;factsetBaId&#x60;) and date range. * **&#x60;Demand&#x60;** — Hourly electricity demand (load) in MW for the specified balancing authority sub-regions (&#x60;factsetBaSubRegId&#x60;). * **&#x60;Interchange&#x60;** — Hourly net interchange in MW between a reporting BA sub-region and its counterpart sub-regions. Positive values indicate net exports; negative values indicate net imports. 
   * @param marketDataRequest  (required)
   * @return MarketDataResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response. Record shape matches the requested &#x60;category&#x60;. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request — the request was malformed or a required parameter was missing. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated — no valid credentials were provided. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden — the credentials provided do not have access to this resource. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found — the requested resource was not found. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type — the request body was not JSON or the Content-Type header was missing. </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity — the request was syntactically valid but semantically incorrect (e.g., invalid date range). </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> Too Many Requests — the rate limit for this endpoint has been exceeded. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error — an unexpected error occurred on the server. </td><td>  -  </td></tr>
       <tr><td> 503 </td><td> Service Unavailable — the service is temporarily unavailable. </td><td>  -  </td></tr>
     </table>
   */
  public MarketDataResponse listMarketData(MarketDataRequest marketDataRequest) throws ApiException {
    return listMarketDataWithHttpInfo(marketDataRequest).getData();
  }

  /**
   * Returns balancing authority generation, demand, or interchange
   * Returns balancing authority time-series data for one of three categories, selected via the &#x60;category&#x60; discriminator in the request body:  * **&#x60;Generation&#x60;** — Hourly net generation in MW by fuel type for the specified balancing authorities (&#x60;factsetBaId&#x60;) and date range. * **&#x60;Demand&#x60;** — Hourly electricity demand (load) in MW for the specified balancing authority sub-regions (&#x60;factsetBaSubRegId&#x60;). * **&#x60;Interchange&#x60;** — Hourly net interchange in MW between a reporting BA sub-region and its counterpart sub-regions. Positive values indicate net exports; negative values indicate net imports. 
   * @param marketDataRequest  (required)
   * @return ApiResponse&lt;MarketDataResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response. Record shape matches the requested &#x60;category&#x60;. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request — the request was malformed or a required parameter was missing. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated — no valid credentials were provided. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden — the credentials provided do not have access to this resource. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found — the requested resource was not found. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type — the request body was not JSON or the Content-Type header was missing. </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity — the request was syntactically valid but semantically incorrect (e.g., invalid date range). </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> Too Many Requests — the rate limit for this endpoint has been exceeded. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error — an unexpected error occurred on the server. </td><td>  -  </td></tr>
       <tr><td> 503 </td><td> Service Unavailable — the service is temporarily unavailable. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<MarketDataResponse> listMarketDataWithHttpInfo(MarketDataRequest marketDataRequest) throws ApiException {
    Object localVarPostBody = marketDataRequest;
    
    // verify the required parameter 'marketDataRequest' is set
    if (marketDataRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'marketDataRequest' when calling listMarketData");
    }
    
    // create path and map variables
    String localVarPath = "/market-data";

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
        
        MarketDataResponse
      
    > apiResponse = apiClient.invokeAPI("MarketDataApi.listMarketData", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, listMarketDataResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Returns balancing authority coverage
   * Returns the full list of balancing authority (BA) sub-regions available in the market data endpoints. Use the returned &#x60;factsetBaId&#x60; values as input for the &#x60;Generation&#x60; category, or &#x60;factsetBaSubRegId&#x60; values for the &#x60;Demand&#x60; and &#x60;Interchange&#x60; categories, of &#x60;POST /market-data&#x60;. 
   * @param country Filter by country name. (optional)
   * @param paginationLimit Maximum number of results to return per request. (optional, default to 100)
   * @param paginationOffset Number of results to skip. (optional, default to 0)
   * @return MarketDataCoverageResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with balancing authority coverage list </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request — the request was malformed or a required parameter was missing. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated — no valid credentials were provided. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden — the credentials provided do not have access to this resource. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found — the requested resource was not found. </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> Too Many Requests — the rate limit for this endpoint has been exceeded. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error — an unexpected error occurred on the server. </td><td>  -  </td></tr>
       <tr><td> 503 </td><td> Service Unavailable — the service is temporarily unavailable. </td><td>  -  </td></tr>
     </table>
   */
  public MarketDataCoverageResponse listMarketDataCoverage(String country, Integer paginationLimit, Integer paginationOffset) throws ApiException {
    return listMarketDataCoverageWithHttpInfo(country, paginationLimit, paginationOffset).getData();
  }

  /**
   * Returns balancing authority coverage
   * Returns the full list of balancing authority (BA) sub-regions available in the market data endpoints. Use the returned &#x60;factsetBaId&#x60; values as input for the &#x60;Generation&#x60; category, or &#x60;factsetBaSubRegId&#x60; values for the &#x60;Demand&#x60; and &#x60;Interchange&#x60; categories, of &#x60;POST /market-data&#x60;. 
   * @param country Filter by country name. (optional)
   * @param paginationLimit Maximum number of results to return per request. (optional, default to 100)
   * @param paginationOffset Number of results to skip. (optional, default to 0)
   * @return ApiResponse&lt;MarketDataCoverageResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with balancing authority coverage list </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request — the request was malformed or a required parameter was missing. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated — no valid credentials were provided. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden — the credentials provided do not have access to this resource. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found — the requested resource was not found. </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> Too Many Requests — the rate limit for this endpoint has been exceeded. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error — an unexpected error occurred on the server. </td><td>  -  </td></tr>
       <tr><td> 503 </td><td> Service Unavailable — the service is temporarily unavailable. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<MarketDataCoverageResponse> listMarketDataCoverageWithHttpInfo(String country, Integer paginationLimit, Integer paginationOffset) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/market-data/coverage";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "country", country));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_paginationLimit", paginationLimit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_paginationOffset", paginationOffset));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        MarketDataCoverageResponse
      
    > apiResponse = apiClient.invokeAPI("MarketDataApi.listMarketDataCoverage", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, listMarketDataCoverageResponseTypeMap, false);

    return apiResponse;

  }
}
