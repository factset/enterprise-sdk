package com.factset.sdk.ExchangeDataFeedDataModel.api;

import com.factset.sdk.ExchangeDataFeedDataModel.ApiException;
import com.factset.sdk.ExchangeDataFeedDataModel.ApiClient;
import com.factset.sdk.ExchangeDataFeedDataModel.ApiResponse;
import com.factset.sdk.ExchangeDataFeedDataModel.Configuration;
import com.factset.sdk.ExchangeDataFeedDataModel.Pair;

import jakarta.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.ExchangeDataFeedDataModel.models.ErrorResponse;
import com.factset.sdk.ExchangeDataFeedDataModel.models.ExchangesResponse;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class ExchangeInformationApi {
  private ApiClient apiClient;

  public ExchangeInformationApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ExchangeInformationApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> getExchangesResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getExchangesResponseTypeMap.put(200, new GenericType<ExchangesResponse>(){});
    getExchangesResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getExchangesResponseTypeMap.put(402, new GenericType<ErrorResponse>(){});
    getExchangesResponseTypeMap.put(404, new GenericType<ErrorResponse>(){});
    getExchangesResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
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
   * Request metadata for covered Real-Time market data venues at FactSet.
   * Returns a list of exchanges with details like exchange code, name, market open and close times, etc.
   * @param productCode Allows filtering of specific product codes in the response. (optional)
   * @param exchangeCode Allows filtering of specific exchange codes in the response. (optional)
   * @param isoCode Allows filtering on specific ISO code in the response. (optional)
   * @param format The format of the output file. (optional)
   * @return ExchangesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with a list of exchanges </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 402 </td><td> Invalid HTTP method. Either the method is not GET or exceeds the maximum request length (currently set at 5000 bytes). The description field will indicate the exact reason. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The provided endpoint is not valid. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. The server encountered an unexpected condition that prevented it from fulfilling the request. </td><td>  -  </td></tr>
     </table>
   */
  public ExchangesResponse getExchanges(java.util.List<Integer> productCode, java.util.List<Integer> exchangeCode, java.util.List<String> isoCode, String format) throws ApiException {
    return getExchangesWithHttpInfo(productCode, exchangeCode, isoCode, format).getData();
  }

  /**
   * Request metadata for covered Real-Time market data venues at FactSet.
   * Returns a list of exchanges with details like exchange code, name, market open and close times, etc.
   * @param productCode Allows filtering of specific product codes in the response. (optional)
   * @param exchangeCode Allows filtering of specific exchange codes in the response. (optional)
   * @param isoCode Allows filtering on specific ISO code in the response. (optional)
   * @param format The format of the output file. (optional)
   * @return ApiResponse&lt;ExchangesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with a list of exchanges </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 402 </td><td> Invalid HTTP method. Either the method is not GET or exceeds the maximum request length (currently set at 5000 bytes). The description field will indicate the exact reason. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The provided endpoint is not valid. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. The server encountered an unexpected condition that prevented it from fulfilling the request. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ExchangesResponse> getExchangesWithHttpInfo(java.util.List<Integer> productCode, java.util.List<Integer> exchangeCode, java.util.List<String> isoCode, String format) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/exchanges";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "product_code", productCode));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "exchange_code", exchangeCode));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "iso_code", isoCode));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "format", format));

    
    
    
    final String[] localVarAccepts = {
      "application/json", "application/xml"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        ExchangesResponse
      
    > apiResponse = apiClient.invokeAPI("ExchangeInformationApi.getExchanges", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getExchangesResponseTypeMap, false);

    return apiResponse;

  }
}
