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
import com.factset.sdk.ExchangeDataFeedDataModel.models.ProductsResponse;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class ProductCodesApi {
  private ApiClient apiClient;

  public ProductCodesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ProductCodesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> getProductsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getProductsResponseTypeMap.put(200, new GenericType<ProductsResponse>(){});
    getProductsResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getProductsResponseTypeMap.put(402, new GenericType<ErrorResponse>(){});
    getProductsResponseTypeMap.put(404, new GenericType<ErrorResponse>(){});
    getProductsResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
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
   * Request the enumeration table for FactSet product codes.
   * Data can be returned in CSV, JSON or XML format, use the &#x60;format&#x60; parameter to change from the default JSON format. *You must be logged into the Developer Portal and obtain an **[API key](https://developer.factset.com/factset/api-key-listing)** for &#39;&#39;Try it Out&#39;&#39; to receive a successful server response.  Select **Authorize** button or visit **[Authentication Support](https://developer.factset.com/authentication)** for more details.* 
   * @param productCode Allows filtering of specific product codes in the response. (optional)
   * @param format The format of the output file. (optional)
   * @param accessFilter Allows filtering based on Real-Time, delayed, or both access types. **Omit** this parameter for the complete list. (optional)
   * @return ProductsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response for the FactSet product codes table </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API key for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 402 </td><td> Invalid HTTP method. Either the method is not GET or exceeds the maximum request length (currently set at 5000 bytes). The description field will indicate the exact reason. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The provided endpoint is not valid. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. The server encountered an unexpected condition that prevented it from fulfilling the request. </td><td>  -  </td></tr>
     </table>
   */
  public ProductsResponse getProducts(java.util.List<Integer> productCode, String format, String accessFilter) throws ApiException {
    return getProductsWithHttpInfo(productCode, format, accessFilter).getData();
  }

  /**
   * Request the enumeration table for FactSet product codes.
   * Data can be returned in CSV, JSON or XML format, use the &#x60;format&#x60; parameter to change from the default JSON format. *You must be logged into the Developer Portal and obtain an **[API key](https://developer.factset.com/factset/api-key-listing)** for &#39;&#39;Try it Out&#39;&#39; to receive a successful server response.  Select **Authorize** button or visit **[Authentication Support](https://developer.factset.com/authentication)** for more details.* 
   * @param productCode Allows filtering of specific product codes in the response. (optional)
   * @param format The format of the output file. (optional)
   * @param accessFilter Allows filtering based on Real-Time, delayed, or both access types. **Omit** this parameter for the complete list. (optional)
   * @return ApiResponse&lt;ProductsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response for the FactSet product codes table </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API key for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 402 </td><td> Invalid HTTP method. Either the method is not GET or exceeds the maximum request length (currently set at 5000 bytes). The description field will indicate the exact reason. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The provided endpoint is not valid. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. The server encountered an unexpected condition that prevented it from fulfilling the request. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ProductsResponse> getProductsWithHttpInfo(java.util.List<Integer> productCode, String format, String accessFilter) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/products";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "product_code", productCode));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "format", format));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "access_filter", accessFilter));

    
    
    
    final String[] localVarAccepts = {
      "application/json", "application/xml"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        ProductsResponse
      
    > apiResponse = apiClient.invokeAPI("ProductCodesApi.getProducts", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getProductsResponseTypeMap, false);

    return apiResponse;

  }
}
