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

import com.factset.sdk.OpenRisk.models.ErrorResponse;
import com.factset.sdk.OpenRisk.models.InlineResponse200;
import com.factset.sdk.OpenRisk.models.InlineResponse2001;
import com.factset.sdk.OpenRisk.models.InlineResponse2002;
import com.factset.sdk.OpenRisk.models.InlineResponse403;
import com.factset.sdk.OpenRisk.models.InlineResponse404;
import com.factset.sdk.OpenRisk.models.SupportedStats;
import com.factset.sdk.OpenRisk.models.SupportedStatsNamesOnly;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class AboutApi {
  private ApiClient apiClient;

  public AboutApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AboutApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> healthStatusResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    healthStatusResponseTypeMap.put(200, new GenericType<InlineResponse2002>(){});
    healthStatusResponseTypeMap.put(401, new GenericType<String>(){});
    healthStatusResponseTypeMap.put(403, new GenericType<InlineResponse403>(){});
    healthStatusResponseTypeMap.put(404, new GenericType<InlineResponse404>(){});
  }

  private static final Map<Integer, GenericType> listRiskModelsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    listRiskModelsResponseTypeMap.put(200, new GenericType<InlineResponse200>(){});
    listRiskModelsResponseTypeMap.put(401, new GenericType<String>(){});
    listRiskModelsResponseTypeMap.put(404, new GenericType<ErrorResponse>(){});
    listRiskModelsResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> riskModelMetadataResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    riskModelMetadataResponseTypeMap.put(200, new GenericType<InlineResponse2001>(){});
    riskModelMetadataResponseTypeMap.put(401, new GenericType<String>(){});
    riskModelMetadataResponseTypeMap.put(404, new GenericType<ErrorResponse>(){});
    riskModelMetadataResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> statsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    statsResponseTypeMap.put(200, new GenericType<SupportedStats>(){});
    statsResponseTypeMap.put(401, new GenericType<String>(){});
    statsResponseTypeMap.put(404, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> statsNamesOnlyResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    statsNamesOnlyResponseTypeMap.put(200, new GenericType<SupportedStatsNamesOnly>(){});
    statsNamesOnlyResponseTypeMap.put(401, new GenericType<String>(){});
    statsNamesOnlyResponseTypeMap.put(404, new GenericType<ErrorResponse>(){});
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
   * Get health of service
   * Health status of the service
   * @param version Semantic version number. See [this link here](https://regexr.com/47b7t) to test validate patterns. (required)
   * @return InlineResponse2002
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Service is operational and healthy </td><td>  * api-supported-versions -  <br>  * api-version -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 401 </td><td> Missing or invalid authentication </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Full access to the service is not authorized </td><td>  * api-supported-versions -  <br>  * api-version -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 404 </td><td> API version not found </td><td>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 429 </td><td> Rate limit reached. Wait until the time specified in header &#39;Retry-After&#39; has elapsed before making further requests. </td><td>  * Retry-After -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  </td></tr>
     </table>
   */
  public InlineResponse2002 healthStatus(String version) throws ApiException {
    return healthStatusWithHttpInfo(version).getData();
  }

  /**
   * Get health of service
   * Health status of the service
   * @param version Semantic version number. See [this link here](https://regexr.com/47b7t) to test validate patterns. (required)
   * @return ApiResponse&lt;InlineResponse2002&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Service is operational and healthy </td><td>  * api-supported-versions -  <br>  * api-version -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 401 </td><td> Missing or invalid authentication </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Full access to the service is not authorized </td><td>  * api-supported-versions -  <br>  * api-version -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 404 </td><td> API version not found </td><td>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 429 </td><td> Rate limit reached. Wait until the time specified in header &#39;Retry-After&#39; has elapsed before making further requests. </td><td>  * Retry-After -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse2002> healthStatusWithHttpInfo(String version) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'version' is set
    if (version == null) {
      throw new ApiException(400, "Missing the required parameter 'version' when calling healthStatus");
    }
    
    // create path and map variables
    String localVarPath = "/linear/{version}/health"
      .replaceAll("\\{" + "version" + "\\}", apiClient.escapeString(version.toString()));

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
        
        InlineResponse2002
      
    > apiResponse = apiClient.invokeAPI("AboutApi.healthStatus", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, healthStatusResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Get available risk models
   * Get the list of available risk models, including their respective model codes required for use with other routes.
   * @param version Semantic version number. See [this link here](https://regexr.com/47b7t) to test validate patterns. (required)
   * @return InlineResponse200
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Returns the list of available risk models for use. Both risk model subscription and each risk model vendor specific Open:Risk API subscription are required for use. For subscription, please report an issue from FactSet:Developer portal. </td><td>  * api-supported-versions -  <br>  * api-version -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 401 </td><td> Missing or invalid authentication </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Endpoint not found </td><td>  * api-supported-versions -  <br>  * api-version -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 429 </td><td> Rate limit reached. Wait until the time specified in header &#39;Retry-After&#39; has elapsed before making further requests. </td><td>  * Retry-After -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 500 </td><td> Internal server error occurred </td><td>  * api-supported-versions -  <br>  * api-version -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  </td></tr>
     </table>
   */
  public InlineResponse200 listRiskModels(String version) throws ApiException {
    return listRiskModelsWithHttpInfo(version).getData();
  }

  /**
   * Get available risk models
   * Get the list of available risk models, including their respective model codes required for use with other routes.
   * @param version Semantic version number. See [this link here](https://regexr.com/47b7t) to test validate patterns. (required)
   * @return ApiResponse&lt;InlineResponse200&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Returns the list of available risk models for use. Both risk model subscription and each risk model vendor specific Open:Risk API subscription are required for use. For subscription, please report an issue from FactSet:Developer portal. </td><td>  * api-supported-versions -  <br>  * api-version -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 401 </td><td> Missing or invalid authentication </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Endpoint not found </td><td>  * api-supported-versions -  <br>  * api-version -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 429 </td><td> Rate limit reached. Wait until the time specified in header &#39;Retry-After&#39; has elapsed before making further requests. </td><td>  * Retry-After -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 500 </td><td> Internal server error occurred </td><td>  * api-supported-versions -  <br>  * api-version -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse200> listRiskModelsWithHttpInfo(String version) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'version' is set
    if (version == null) {
      throw new ApiException(400, "Missing the required parameter 'version' when calling listRiskModels");
    }
    
    // create path and map variables
    String localVarPath = "/linear/{version}/riskmodels"
      .replaceAll("\\{" + "version" + "\\}", apiClient.escapeString(version.toString()));

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
        
        InlineResponse200
      
    > apiResponse = apiClient.invokeAPI("AboutApi.listRiskModels", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, listRiskModelsResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Get risk model details
   * Get the meta data of the risk model for the corresponding modelCode. modelCode can be obtained via &#39;/linear/{version}/riskmodels/&#39; route.
   * @param version Semantic version number. See [this link here](https://regexr.com/47b7t) to test validate patterns. (required)
   * @param modelCode Model code (required)
   * @return InlineResponse2001
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Returns the meta data of risk model. </td><td>  * api-supported-versions -  <br>  * api-version -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 401 </td><td> Missing or invalid authentication </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Endpoint not found </td><td>  * api-supported-versions -  <br>  * api-version -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 429 </td><td> Rate limit reached. Wait until the time specified in header &#39;Retry-After&#39; has elapsed before making further requests. </td><td>  * Retry-After -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 500 </td><td> Internal server error occurred </td><td>  * api-supported-versions -  <br>  * api-version -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  </td></tr>
     </table>
   */
  public InlineResponse2001 riskModelMetadata(String version, String modelCode) throws ApiException {
    return riskModelMetadataWithHttpInfo(version, modelCode).getData();
  }

  /**
   * Get risk model details
   * Get the meta data of the risk model for the corresponding modelCode. modelCode can be obtained via &#39;/linear/{version}/riskmodels/&#39; route.
   * @param version Semantic version number. See [this link here](https://regexr.com/47b7t) to test validate patterns. (required)
   * @param modelCode Model code (required)
   * @return ApiResponse&lt;InlineResponse2001&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Returns the meta data of risk model. </td><td>  * api-supported-versions -  <br>  * api-version -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 401 </td><td> Missing or invalid authentication </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Endpoint not found </td><td>  * api-supported-versions -  <br>  * api-version -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 429 </td><td> Rate limit reached. Wait until the time specified in header &#39;Retry-After&#39; has elapsed before making further requests. </td><td>  * Retry-After -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 500 </td><td> Internal server error occurred </td><td>  * api-supported-versions -  <br>  * api-version -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse2001> riskModelMetadataWithHttpInfo(String version, String modelCode) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'version' is set
    if (version == null) {
      throw new ApiException(400, "Missing the required parameter 'version' when calling riskModelMetadata");
    }
    
    // verify the required parameter 'modelCode' is set
    if (modelCode == null) {
      throw new ApiException(400, "Missing the required parameter 'modelCode' when calling riskModelMetadata");
    }
    
    // create path and map variables
    String localVarPath = "/linear/{version}/riskmodels/{modelCode}"
      .replaceAll("\\{" + "version" + "\\}", apiClient.escapeString(version.toString()))
      .replaceAll("\\{" + "modelCode" + "\\}", apiClient.escapeString(modelCode.toString()));

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
        
        InlineResponse2001
      
    > apiResponse = apiClient.invokeAPI("AboutApi.riskModelMetadata", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, riskModelMetadataResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Get available risk statistics details
   * All base risk statistic names and their respective support and/or requirement for certain name-settings statistics options (such as: correlated specific risk, covariance isolation method, etc.), available levels, and security group calculation methodology. When &#39;securityGroupMethod&#39; is &#39;statSpecific&#39;, please refer to statistics documentation service for more information.
   * @param version Semantic version number. See [this link here](https://regexr.com/47b7t) to test validate patterns. (required)
   * @return SupportedStats
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> All base risk statistic names and their respective support and/or requirement for certain name-settings statistics options (such as: correlated specific risk, covariance isolation method, etc.), available levels, and security group calculation methodology. When &#39;securityGroupMethod&#39; is &#39;statSpecific&#39;, please refer to statistics documentation service for more information. </td><td>  * api-supported-versions -  <br>  * api-version -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 401 </td><td> Missing or invalid authentication </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Endpoint not found </td><td>  * api-supported-versions -  <br>  * api-version -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 429 </td><td> Rate limit reached. Wait until the time specified in header &#39;Retry-After&#39; has elapsed before making further requests. </td><td>  * Retry-After -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  </td></tr>
     </table>
   */
  public SupportedStats stats(String version) throws ApiException {
    return statsWithHttpInfo(version).getData();
  }

  /**
   * Get available risk statistics details
   * All base risk statistic names and their respective support and/or requirement for certain name-settings statistics options (such as: correlated specific risk, covariance isolation method, etc.), available levels, and security group calculation methodology. When &#39;securityGroupMethod&#39; is &#39;statSpecific&#39;, please refer to statistics documentation service for more information.
   * @param version Semantic version number. See [this link here](https://regexr.com/47b7t) to test validate patterns. (required)
   * @return ApiResponse&lt;SupportedStats&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> All base risk statistic names and their respective support and/or requirement for certain name-settings statistics options (such as: correlated specific risk, covariance isolation method, etc.), available levels, and security group calculation methodology. When &#39;securityGroupMethod&#39; is &#39;statSpecific&#39;, please refer to statistics documentation service for more information. </td><td>  * api-supported-versions -  <br>  * api-version -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 401 </td><td> Missing or invalid authentication </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Endpoint not found </td><td>  * api-supported-versions -  <br>  * api-version -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 429 </td><td> Rate limit reached. Wait until the time specified in header &#39;Retry-After&#39; has elapsed before making further requests. </td><td>  * Retry-After -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<SupportedStats> statsWithHttpInfo(String version) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'version' is set
    if (version == null) {
      throw new ApiException(400, "Missing the required parameter 'version' when calling stats");
    }
    
    // create path and map variables
    String localVarPath = "/linear/{version}/stats"
      .replaceAll("\\{" + "version" + "\\}", apiClient.escapeString(version.toString()));

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
        
        SupportedStats
      
    > apiResponse = apiClient.invokeAPI("AboutApi.stats", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, statsResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Get available risk statistics names
   * All available risk statistic names including statistics names containing risk statistics options such as CSR (correlated specific risk)
   * @param version Semantic version number. See [this link here](https://regexr.com/47b7t) to test validate patterns. (required)
   * @return SupportedStatsNamesOnly
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> All available risk statistic names including statistics names containing risk statistics options such as CSR (correlated specific risk) </td><td>  * api-supported-versions -  <br>  * api-version -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 401 </td><td> Missing or invalid authentication </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Endpoint not found </td><td>  * api-supported-versions -  <br>  * api-version -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 429 </td><td> Rate limit reached. Wait until the time specified in header &#39;Retry-After&#39; has elapsed before making further requests. </td><td>  * Retry-After -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  </td></tr>
     </table>
   */
  public SupportedStatsNamesOnly statsNamesOnly(String version) throws ApiException {
    return statsNamesOnlyWithHttpInfo(version).getData();
  }

  /**
   * Get available risk statistics names
   * All available risk statistic names including statistics names containing risk statistics options such as CSR (correlated specific risk)
   * @param version Semantic version number. See [this link here](https://regexr.com/47b7t) to test validate patterns. (required)
   * @return ApiResponse&lt;SupportedStatsNamesOnly&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> All available risk statistic names including statistics names containing risk statistics options such as CSR (correlated specific risk) </td><td>  * api-supported-versions -  <br>  * api-version -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 401 </td><td> Missing or invalid authentication </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Endpoint not found </td><td>  * api-supported-versions -  <br>  * api-version -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 429 </td><td> Rate limit reached. Wait until the time specified in header &#39;Retry-After&#39; has elapsed before making further requests. </td><td>  * Retry-After -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<SupportedStatsNamesOnly> statsNamesOnlyWithHttpInfo(String version) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'version' is set
    if (version == null) {
      throw new ApiException(400, "Missing the required parameter 'version' when calling statsNamesOnly");
    }
    
    // create path and map variables
    String localVarPath = "/linear/{version}/stats-names-only"
      .replaceAll("\\{" + "version" + "\\}", apiClient.escapeString(version.toString()));

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
        
        SupportedStatsNamesOnly
      
    > apiResponse = apiClient.invokeAPI("AboutApi.statsNamesOnly", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, statsNamesOnlyResponseTypeMap, false);

    return apiResponse;

  }
}
