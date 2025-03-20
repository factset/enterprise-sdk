package com.factset.sdk.OpenFactSetMarketplace.api;

import com.factset.sdk.OpenFactSetMarketplace.ApiException;
import com.factset.sdk.OpenFactSetMarketplace.ApiClient;
import com.factset.sdk.OpenFactSetMarketplace.ApiResponse;
import com.factset.sdk.OpenFactSetMarketplace.Configuration;
import com.factset.sdk.OpenFactSetMarketplace.Pair;

import jakarta.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.OpenFactSetMarketplace.models.ErrorResponse;
import com.factset.sdk.OpenFactSetMarketplace.models.ProductSuccessResponse;
import com.factset.sdk.OpenFactSetMarketplace.models.ProductsSuccessResponse;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class ProductsApi {
  private ApiClient apiClient;

  public ProductsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ProductsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> getProductByIdResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getProductByIdResponseTypeMap.put(200, new GenericType<ProductSuccessResponse>(){});
    getProductByIdResponseTypeMap.put(401, new GenericType<String>(){});
    getProductByIdResponseTypeMap.put(403, new GenericType<String>(){});
    getProductByIdResponseTypeMap.put(404, new GenericType<ErrorResponse>(){});
    getProductByIdResponseTypeMap.put(429, new GenericType<String>(){});
    getProductByIdResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> getProductsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getProductsResponseTypeMap.put(200, new GenericType<ProductsSuccessResponse>(){});
    getProductsResponseTypeMap.put(401, new GenericType<String>(){});
    getProductsResponseTypeMap.put(403, new GenericType<String>(){});
    getProductsResponseTypeMap.put(429, new GenericType<String>(){});
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
   * 
   * Get a single Open:FactSet Marketplace Catalog product by ID.
   * @param id ID of the product or partner (required)
   * @return ProductSuccessResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Get a single Open:FactSet Marketplace Catalog product by ID. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized - You are not properly authenticated for use of this API. Please make sure you using a valid API key (managed via this developer portal page) or valid OAuth 2.0 credentials (see OAuth 2.0 documentation on the developer portal) for access. If you believe you are seeing this message in error, please reach out to your FactSet Support Team representative. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> You do not have the proper permissions for this request. Please make sure you have the proper CACCESS entitlements enabled for this service and that you are using a resource ID that your account has access to. This may also be due to your IP address being unsupported by the API key you are currently using. Please ensure your IP address is whitelisted for the API key you are using. IP addresses can be managed per API key via this developer portal page. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Product not found </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> Rate limit reached. Retry the requests after waiting the time specified in the Retry-After header. </td><td>  * X-DataDirect-Request-Key - FactSet request key header. <br>  * RateLimit-Limit - The maximum number of requests that the consumer is permitted to make in a given time window. <br>  * RateLimit-Remaining - The number of requests remaining in the current rate limit window. <br>  * RateLimit-Reset - Time remaining (in seconds) until request limit is reset. <br>  * X-RateLimit-Limit-Minute - The maximum number of requests that the consumer is permitted to make in a minute. <br>  * X-RateLimit-Remaining-Minute - The number of requests remaining in the current minute. <br>  * Retry-After - Time to wait in seconds before making a new request as the rate limit has been reached. <br>  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public ProductSuccessResponse getProductById(String id) throws ApiException {
    return getProductByIdWithHttpInfo(id).getData();
  }

  /**
   * 
   * Get a single Open:FactSet Marketplace Catalog product by ID.
   * @param id ID of the product or partner (required)
   * @return ApiResponse&lt;ProductSuccessResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Get a single Open:FactSet Marketplace Catalog product by ID. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized - You are not properly authenticated for use of this API. Please make sure you using a valid API key (managed via this developer portal page) or valid OAuth 2.0 credentials (see OAuth 2.0 documentation on the developer portal) for access. If you believe you are seeing this message in error, please reach out to your FactSet Support Team representative. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> You do not have the proper permissions for this request. Please make sure you have the proper CACCESS entitlements enabled for this service and that you are using a resource ID that your account has access to. This may also be due to your IP address being unsupported by the API key you are currently using. Please ensure your IP address is whitelisted for the API key you are using. IP addresses can be managed per API key via this developer portal page. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Product not found </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> Rate limit reached. Retry the requests after waiting the time specified in the Retry-After header. </td><td>  * X-DataDirect-Request-Key - FactSet request key header. <br>  * RateLimit-Limit - The maximum number of requests that the consumer is permitted to make in a given time window. <br>  * RateLimit-Remaining - The number of requests remaining in the current rate limit window. <br>  * RateLimit-Reset - Time remaining (in seconds) until request limit is reset. <br>  * X-RateLimit-Limit-Minute - The maximum number of requests that the consumer is permitted to make in a minute. <br>  * X-RateLimit-Remaining-Minute - The number of requests remaining in the current minute. <br>  * Retry-After - Time to wait in seconds before making a new request as the rate limit has been reached. <br>  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ProductSuccessResponse> getProductByIdWithHttpInfo(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getProductById");
    }
    
    // create path and map variables
    String localVarPath = "/product/{id}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json", "text/plain"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        ProductSuccessResponse
      
    > apiResponse = apiClient.invokeAPI("ProductsApi.getProductById", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getProductByIdResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * 
   * Get all products published on the Open:FactSet Marketplace Catalog.
   * @param paginationLimit Limit for number of records returned per page (optional, default to 10)
   * @param paginationOffset Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. (optional, default to 0)
   * @return ProductsSuccessResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response to get all products published on the Open:FactSet Marketplace Catalog. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized - You are not properly authenticated for use of this API. Please make sure you using a valid API key (managed via this developer portal page) or valid OAuth 2.0 credentials (see OAuth 2.0 documentation on the developer portal) for access. If you believe you are seeing this message in error, please reach out to your FactSet Support Team representative. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> You do not have the proper permissions for this request. Please make sure you have the proper CACCESS entitlements enabled for this service and that you are using a resource ID that your account has access to. This may also be due to your IP address being unsupported by the API key you are currently using. Please ensure your IP address is whitelisted for the API key you are using. IP addresses can be managed per API key via this developer portal page. </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> Rate limit reached. Retry the requests after waiting the time specified in the Retry-After header. </td><td>  * X-DataDirect-Request-Key - FactSet request key header. <br>  * RateLimit-Limit - The maximum number of requests that the consumer is permitted to make in a given time window. <br>  * RateLimit-Remaining - The number of requests remaining in the current rate limit window. <br>  * RateLimit-Reset - Time remaining (in seconds) until request limit is reset. <br>  * X-RateLimit-Limit-Minute - The maximum number of requests that the consumer is permitted to make in a minute. <br>  * X-RateLimit-Remaining-Minute - The number of requests remaining in the current minute. <br>  * Retry-After - Time to wait in seconds before making a new request as the rate limit has been reached. <br>  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public ProductsSuccessResponse getProducts(Integer paginationLimit, Integer paginationOffset) throws ApiException {
    return getProductsWithHttpInfo(paginationLimit, paginationOffset).getData();
  }

  /**
   * 
   * Get all products published on the Open:FactSet Marketplace Catalog.
   * @param paginationLimit Limit for number of records returned per page (optional, default to 10)
   * @param paginationOffset Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. (optional, default to 0)
   * @return ApiResponse&lt;ProductsSuccessResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response to get all products published on the Open:FactSet Marketplace Catalog. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized - You are not properly authenticated for use of this API. Please make sure you using a valid API key (managed via this developer portal page) or valid OAuth 2.0 credentials (see OAuth 2.0 documentation on the developer portal) for access. If you believe you are seeing this message in error, please reach out to your FactSet Support Team representative. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> You do not have the proper permissions for this request. Please make sure you have the proper CACCESS entitlements enabled for this service and that you are using a resource ID that your account has access to. This may also be due to your IP address being unsupported by the API key you are currently using. Please ensure your IP address is whitelisted for the API key you are using. IP addresses can be managed per API key via this developer portal page. </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> Rate limit reached. Retry the requests after waiting the time specified in the Retry-After header. </td><td>  * X-DataDirect-Request-Key - FactSet request key header. <br>  * RateLimit-Limit - The maximum number of requests that the consumer is permitted to make in a given time window. <br>  * RateLimit-Remaining - The number of requests remaining in the current rate limit window. <br>  * RateLimit-Reset - Time remaining (in seconds) until request limit is reset. <br>  * X-RateLimit-Limit-Minute - The maximum number of requests that the consumer is permitted to make in a minute. <br>  * X-RateLimit-Remaining-Minute - The number of requests remaining in the current minute. <br>  * Retry-After - Time to wait in seconds before making a new request as the rate limit has been reached. <br>  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ProductsSuccessResponse> getProductsWithHttpInfo(Integer paginationLimit, Integer paginationOffset) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/products";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_paginationLimit", paginationLimit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_paginationOffset", paginationOffset));

    
    
    
    final String[] localVarAccepts = {
      "application/json", "text/plain"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        ProductsSuccessResponse
      
    > apiResponse = apiClient.invokeAPI("ProductsApi.getProducts", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getProductsResponseTypeMap, false);

    return apiResponse;

  }
}
