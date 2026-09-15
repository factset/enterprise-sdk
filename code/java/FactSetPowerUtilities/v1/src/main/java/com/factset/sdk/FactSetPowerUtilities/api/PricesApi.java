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
import com.factset.sdk.FactSetPowerUtilities.models.PricesRequest;
import com.factset.sdk.FactSetPowerUtilities.models.PricesResponse;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class PricesApi {
  private ApiClient apiClient;

  public PricesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public PricesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> listPricesResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    listPricesResponseTypeMap.put(200, new GenericType<PricesResponse>(){});
    listPricesResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    listPricesResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    listPricesResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    listPricesResponseTypeMap.put(404, new GenericType<ErrorResponse>(){});
    listPricesResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    listPricesResponseTypeMap.put(422, new GenericType<ErrorResponse>(){});
    listPricesResponseTypeMap.put(429, new GenericType<ErrorResponse>(){});
    listPricesResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
    listPricesResponseTypeMap.put(503, new GenericType<ErrorResponse>(){});
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
   * Returns power spot prices, spark spreads, capacity prices, or forward prices
   * Returns power market price data for one of four categories, selected via the &#x60;category&#x60; discriminator in the request body:  * **&#x60;Power&#x60;** — Daily spot power prices in $/MWh at major hubs and zones. Includes on-peak, off-peak, and around-the-clock prices. * **&#x60;SparkSpread&#x60;** — Natural gas spark spreads in $/MWh at four fixed assumed heat rates (7,000 / 8,000 / 10,000 / 12,000 MMBtu/MWh), representing the difference between the power price and the cost of gas needed to generate one MWh. * **&#x60;Capacity&#x60;** — Capacity auction clearing prices in $/MW-day from ISO/RTO forward capacity markets. Includes delivery year and auction type. * **&#x60;Forward&#x60;** — Forward power price curves in $/MWh for future delivery months, reported as a rolling 3-day average. Includes on-peak, off-peak, and around-the-clock products.  Use &#x60;GET /reference/location-mapping&#x60; to discover valid &#x60;ids&#x60; for the &#x60;Power&#x60;, &#x60;SparkSpread&#x60;, and &#x60;Forward&#x60; categories, or &#x60;GET /reference/zone-mapping&#x60; for the &#x60;Capacity&#x60; category. 
   * @param pricesRequest  (required)
   * @return PricesResponse
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
  public PricesResponse listPrices(PricesRequest pricesRequest) throws ApiException {
    return listPricesWithHttpInfo(pricesRequest).getData();
  }

  /**
   * Returns power spot prices, spark spreads, capacity prices, or forward prices
   * Returns power market price data for one of four categories, selected via the &#x60;category&#x60; discriminator in the request body:  * **&#x60;Power&#x60;** — Daily spot power prices in $/MWh at major hubs and zones. Includes on-peak, off-peak, and around-the-clock prices. * **&#x60;SparkSpread&#x60;** — Natural gas spark spreads in $/MWh at four fixed assumed heat rates (7,000 / 8,000 / 10,000 / 12,000 MMBtu/MWh), representing the difference between the power price and the cost of gas needed to generate one MWh. * **&#x60;Capacity&#x60;** — Capacity auction clearing prices in $/MW-day from ISO/RTO forward capacity markets. Includes delivery year and auction type. * **&#x60;Forward&#x60;** — Forward power price curves in $/MWh for future delivery months, reported as a rolling 3-day average. Includes on-peak, off-peak, and around-the-clock products.  Use &#x60;GET /reference/location-mapping&#x60; to discover valid &#x60;ids&#x60; for the &#x60;Power&#x60;, &#x60;SparkSpread&#x60;, and &#x60;Forward&#x60; categories, or &#x60;GET /reference/zone-mapping&#x60; for the &#x60;Capacity&#x60; category. 
   * @param pricesRequest  (required)
   * @return ApiResponse&lt;PricesResponse&gt;
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
  public ApiResponse<PricesResponse> listPricesWithHttpInfo(PricesRequest pricesRequest) throws ApiException {
    Object localVarPostBody = pricesRequest;
    
    // verify the required parameter 'pricesRequest' is set
    if (pricesRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'pricesRequest' when calling listPrices");
    }
    
    // create path and map variables
    String localVarPath = "/prices";

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
        
        PricesResponse
      
    > apiResponse = apiClient.invokeAPI("PricesApi.listPrices", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, listPricesResponseTypeMap, false);

    return apiResponse;

  }
}
