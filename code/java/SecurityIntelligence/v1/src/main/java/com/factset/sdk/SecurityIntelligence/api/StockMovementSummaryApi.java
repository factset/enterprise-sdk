package com.factset.sdk.SecurityIntelligence.api;

import com.factset.sdk.SecurityIntelligence.ApiException;
import com.factset.sdk.SecurityIntelligence.ApiClient;
import com.factset.sdk.SecurityIntelligence.ApiResponse;
import com.factset.sdk.SecurityIntelligence.Configuration;
import com.factset.sdk.SecurityIntelligence.Pair;

import jakarta.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.SecurityIntelligence.models.CustomValidationError;
import com.factset.sdk.SecurityIntelligence.models.ServerError;
import com.factset.sdk.SecurityIntelligence.models.StockMovementResponse;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class StockMovementSummaryApi {
  private ApiClient apiClient;

  public StockMovementSummaryApi() {
    this(Configuration.getDefaultApiClient());
  }

  public StockMovementSummaryApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> getStockMovementSummaryResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getStockMovementSummaryResponseTypeMap.put(200, new GenericType<StockMovementResponse>(){});
    getStockMovementSummaryResponseTypeMap.put(400, new GenericType<CustomValidationError>(){});
    getStockMovementSummaryResponseTypeMap.put(500, new GenericType<ServerError>(){});
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
   * Get Stock Movement Summary
   * Returns the stock price movement over the last trading period or intraday, and aims to explain that movement using StreetAccount news over the last two trading days.
   * @param identifier Ticker or FactSet Entity ID of the company (required)
   * @param outputType Type of output to return. default for full summary and oneline for one-line summary. (optional, default to default)
   * @return StockMovementResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with stock movement data </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Authentication Failed </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public StockMovementResponse getStockMovementSummary(String identifier, String outputType) throws ApiException {
    return getStockMovementSummaryWithHttpInfo(identifier, outputType).getData();
  }

  /**
   * Get Stock Movement Summary
   * Returns the stock price movement over the last trading period or intraday, and aims to explain that movement using StreetAccount news over the last two trading days.
   * @param identifier Ticker or FactSet Entity ID of the company (required)
   * @param outputType Type of output to return. default for full summary and oneline for one-line summary. (optional, default to default)
   * @return ApiResponse&lt;StockMovementResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with stock movement data </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Authentication Failed </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<StockMovementResponse> getStockMovementSummaryWithHttpInfo(String identifier, String outputType) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'identifier' is set
    if (identifier == null) {
      throw new ApiException(400, "Missing the required parameter 'identifier' when calling getStockMovementSummary");
    }
    
    // create path and map variables
    String localVarPath = "/company/stock-movement-summary";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "identifier", identifier));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "outputType", outputType));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        StockMovementResponse
      
    > apiResponse = apiClient.invokeAPI("StockMovementSummaryApi.getStockMovementSummary", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getStockMovementSummaryResponseTypeMap, false);

    return apiResponse;

  }
}
