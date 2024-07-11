package com.factset.sdk.OpenRisk.api;

import com.factset.sdk.OpenRisk.ApiException;
import com.factset.sdk.OpenRisk.ApiClient;
import com.factset.sdk.OpenRisk.ApiResponse;
import com.factset.sdk.OpenRisk.Configuration;
import com.factset.sdk.OpenRisk.Pair;

import jakarta.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.OpenRisk.models.CalculateFromHoldingsRequestBody;
import com.factset.sdk.OpenRisk.models.ErrorResponse;
import com.factset.sdk.OpenRisk.models.GenerateIdMappingRequestBody;
import com.factset.sdk.OpenRisk.models.InlineResponse2003;
import com.factset.sdk.OpenRisk.models.InlineResponse2004;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class OperationsApi {
  private ApiClient apiClient;

  public OperationsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public OperationsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> calculateFromHoldingsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    calculateFromHoldingsResponseTypeMap.put(200, new GenericType<InlineResponse2003>(){});
    calculateFromHoldingsResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    calculateFromHoldingsResponseTypeMap.put(401, new GenericType<String>(){});
    calculateFromHoldingsResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    calculateFromHoldingsResponseTypeMap.put(404, new GenericType<ErrorResponse>(){});
    calculateFromHoldingsResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> generateIdMappingResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    generateIdMappingResponseTypeMap.put(200, new GenericType<InlineResponse2004>(){});
    generateIdMappingResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    generateIdMappingResponseTypeMap.put(401, new GenericType<String>(){});
    generateIdMappingResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    generateIdMappingResponseTypeMap.put(404, new GenericType<ErrorResponse>(){});
    generateIdMappingResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
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
   * Calculate risk statistics
   * Calculate predicted risk statistics for provided holdings using risk model data. Asset symbols and market values/weights are required.
   * @param calculateFromHoldingsRequestBody  (required)
   * @return InlineResponse2003
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Calculate predicted risk statistics for provided holdings using risk model data. Asset symbols and market values/weights are required. </td><td>  * api-supported-versions -  <br>  * api-version -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 400 </td><td> Request was malformed or the requested data is not available </td><td>  * api-supported-versions -  <br>  * api-version -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 401 </td><td> Missing or invalid authentication </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Access forbidden for the requested data </td><td>  * api-supported-versions -  <br>  * api-version -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 404 </td><td> Endpoint not found </td><td>  * api-supported-versions -  <br>  * api-version -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 429 </td><td> Rate limit reached. Wait until the time specified in header &#39;Retry-After&#39; has elapsed before making further requests. </td><td>  * Retry-After -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 500 </td><td> Internal server error occurred </td><td>  * api-supported-versions -  <br>  * api-version -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  </td></tr>
     </table>
   */
  public InlineResponse2003 calculateFromHoldings(CalculateFromHoldingsRequestBody calculateFromHoldingsRequestBody) throws ApiException {
    return calculateFromHoldingsWithHttpInfo(calculateFromHoldingsRequestBody).getData();
  }

  /**
   * Calculate risk statistics
   * Calculate predicted risk statistics for provided holdings using risk model data. Asset symbols and market values/weights are required.
   * @param calculateFromHoldingsRequestBody  (required)
   * @return ApiResponse&lt;InlineResponse2003&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Calculate predicted risk statistics for provided holdings using risk model data. Asset symbols and market values/weights are required. </td><td>  * api-supported-versions -  <br>  * api-version -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 400 </td><td> Request was malformed or the requested data is not available </td><td>  * api-supported-versions -  <br>  * api-version -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 401 </td><td> Missing or invalid authentication </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Access forbidden for the requested data </td><td>  * api-supported-versions -  <br>  * api-version -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 404 </td><td> Endpoint not found </td><td>  * api-supported-versions -  <br>  * api-version -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 429 </td><td> Rate limit reached. Wait until the time specified in header &#39;Retry-After&#39; has elapsed before making further requests. </td><td>  * Retry-After -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 500 </td><td> Internal server error occurred </td><td>  * api-supported-versions -  <br>  * api-version -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse2003> calculateFromHoldingsWithHttpInfo(CalculateFromHoldingsRequestBody calculateFromHoldingsRequestBody) throws ApiException {
    Object localVarPostBody = calculateFromHoldingsRequestBody;
    
    // verify the required parameter 'calculateFromHoldingsRequestBody' is set
    if (calculateFromHoldingsRequestBody == null) {
      throw new ApiException(400, "Missing the required parameter 'calculateFromHoldingsRequestBody' when calling calculateFromHoldings");
    }
    
    // create path and map variables
    String localVarPath = "/calculate/from-holdings";

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
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        InlineResponse2003
      
    > apiResponse = apiClient.invokeAPI("OperationsApi.calculateFromHoldings", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, calculateFromHoldingsResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Generate risk model ID mapping
   * Resolve all input holdings IDs against a risk model for coverage and provide a mapping to security indices in the model or the reason for exclusion
   * @param generateIdMappingRequestBody  (required)
   * @return InlineResponse2004
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Provides a mapping to security indices in the risk model or the reason for exclusion </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Request was malformed or the requested data is not available </td><td>  * api-supported-versions -  <br>  * api-version -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 401 </td><td> Missing or invalid authentication </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Access forbidden for the requested data </td><td>  * api-supported-versions -  <br>  * api-version -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 404 </td><td> Endpoint not found </td><td>  * api-supported-versions -  <br>  * api-version -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 429 </td><td> Rate limit reached. Wait until the time specified in header &#39;Retry-After&#39; has elapsed before making further requests. </td><td>  * Retry-After -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 500 </td><td> Internal server error occurred </td><td>  * api-supported-versions -  <br>  * api-version -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  </td></tr>
     </table>
   */
  public InlineResponse2004 generateIdMapping(GenerateIdMappingRequestBody generateIdMappingRequestBody) throws ApiException {
    return generateIdMappingWithHttpInfo(generateIdMappingRequestBody).getData();
  }

  /**
   * Generate risk model ID mapping
   * Resolve all input holdings IDs against a risk model for coverage and provide a mapping to security indices in the model or the reason for exclusion
   * @param generateIdMappingRequestBody  (required)
   * @return ApiResponse&lt;InlineResponse2004&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Provides a mapping to security indices in the risk model or the reason for exclusion </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Request was malformed or the requested data is not available </td><td>  * api-supported-versions -  <br>  * api-version -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 401 </td><td> Missing or invalid authentication </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Access forbidden for the requested data </td><td>  * api-supported-versions -  <br>  * api-version -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 404 </td><td> Endpoint not found </td><td>  * api-supported-versions -  <br>  * api-version -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 429 </td><td> Rate limit reached. Wait until the time specified in header &#39;Retry-After&#39; has elapsed before making further requests. </td><td>  * Retry-After -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 500 </td><td> Internal server error occurred </td><td>  * api-supported-versions -  <br>  * api-version -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse2004> generateIdMappingWithHttpInfo(GenerateIdMappingRequestBody generateIdMappingRequestBody) throws ApiException {
    Object localVarPostBody = generateIdMappingRequestBody;
    
    // verify the required parameter 'generateIdMappingRequestBody' is set
    if (generateIdMappingRequestBody == null) {
      throw new ApiException(400, "Missing the required parameter 'generateIdMappingRequestBody' when calling generateIdMapping");
    }
    
    // create path and map variables
    String localVarPath = "/generate/id-mapping";

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
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        InlineResponse2004
      
    > apiResponse = apiClient.invokeAPI("OperationsApi.generateIdMapping", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, generateIdMappingResponseTypeMap, false);

    return apiResponse;

  }
}
