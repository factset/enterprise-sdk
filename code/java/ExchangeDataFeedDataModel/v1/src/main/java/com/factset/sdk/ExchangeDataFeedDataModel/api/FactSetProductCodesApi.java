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
import com.factset.sdk.ExchangeDataFeedDataModel.models.RTDataModelProducts;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class FactSetProductCodesApi {
  private ApiClient apiClient;

  public FactSetProductCodesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public FactSetProductCodesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> getProductsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getProductsResponseTypeMap.put(200, new GenericType<RTDataModelProducts>(){});
    getProductsResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getProductsResponseTypeMap.put(402, new GenericType<ErrorResponse>(){});
    getProductsResponseTypeMap.put(404, new GenericType<ErrorResponse>(){});
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
   *  Data can be returned in CSV, JSON or XML format, use the &#x60;format&#x60; parameter to chnage from the default JSON format.    &#39;*You must be logged into the Developer Portal and obtain an **[API Key](https://developer.factset.com/factset/api-key-listing)** for &#39;&#39;Try it Out&#39;&#39; to receive a successful server response. Select **Authorize** button or visit **[Authentication Support](https://developer.factset.com/authentication)** for more details.*&#39; 
   * @param format The format of the output file.&lt;p&gt;**Try it Out** - All formats available&lt;/p&gt; (optional, default to json)
   * @return RTDataModelProducts
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response for the FactSet product codes table </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. </td><td>  -  </td></tr>
       <tr><td> 402 </td><td> Invalid method. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The provided report name is not valid. </td><td>  -  </td></tr>
     </table>
   */
  public RTDataModelProducts getProducts(String format) throws ApiException {
    return getProductsWithHttpInfo(format).getData();
  }

  /**
   * Request the enumeration table for FactSet product codes.
   *  Data can be returned in CSV, JSON or XML format, use the &#x60;format&#x60; parameter to chnage from the default JSON format.    &#39;*You must be logged into the Developer Portal and obtain an **[API Key](https://developer.factset.com/factset/api-key-listing)** for &#39;&#39;Try it Out&#39;&#39; to receive a successful server response. Select **Authorize** button or visit **[Authentication Support](https://developer.factset.com/authentication)** for more details.*&#39; 
   * @param format The format of the output file.&lt;p&gt;**Try it Out** - All formats available&lt;/p&gt; (optional, default to json)
   * @return ApiResponse&lt;RTDataModelProducts&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response for the FactSet product codes table </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. </td><td>  -  </td></tr>
       <tr><td> 402 </td><td> Invalid method. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The provided report name is not valid. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<RTDataModelProducts> getProductsWithHttpInfo(String format) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/products";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

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
        
        RTDataModelProducts
      
    > apiResponse = apiClient.invokeAPI("FactSetProductCodesApi.getProducts", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getProductsResponseTypeMap, false);

    return apiResponse;

  }
}
