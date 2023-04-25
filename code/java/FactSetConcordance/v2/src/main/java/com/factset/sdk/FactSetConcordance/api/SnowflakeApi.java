package com.factset.sdk.FactSetConcordance.api;

import com.factset.sdk.FactSetConcordance.ApiException;
import com.factset.sdk.FactSetConcordance.ApiClient;
import com.factset.sdk.FactSetConcordance.ApiResponse;
import com.factset.sdk.FactSetConcordance.Configuration;
import com.factset.sdk.FactSetConcordance.Pair;

import javax.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.FactSetConcordance.models.SnowflakeEntityMappingRequest;
import com.factset.sdk.FactSetConcordance.models.SnowflakeEntityMappingResponse;
import com.factset.sdk.FactSetConcordance.models.SnowflakeEntityMatchRequest;
import com.factset.sdk.FactSetConcordance.models.SnowflakeEntityMatchResponse;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SnowflakeApi {
  private ApiClient apiClient;

  public SnowflakeApi() {
    this(Configuration.getDefaultApiClient());
  }

  public SnowflakeApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> getSnowflakeEntityMatchForListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getSnowflakeEntityMatchForListResponseTypeMap.put(200, new GenericType<SnowflakeEntityMatchResponse>(){});
  }

  private static final Map<Integer, GenericType> snowflakeEntityMappingPostResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    snowflakeEntityMappingPostResponseTypeMap.put(0, new GenericType<SnowflakeEntityMappingResponse>(){});
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
   * Perform an entity search and return a snowflake-friendly response. Up to 25 Names per request.
   * Finds the best candidate entities matching the given company name. Additional attributes can be supplied to narrow the search. *This endpoint is used natively within Snowflake and is not to be consumed directly by users. Reach out to your FactSet Account team to learn more about Concordance in Snowflake.* 
   * @param snowflakeEntityMatchRequest A request to match an entity name and its attributes within Snowflake. (required)
   * @return SnowflakeEntityMatchResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Response object for the entity-match object in a snowflake friendly response model. </td><td>  -  </td></tr>
     </table>
   */
  public SnowflakeEntityMatchResponse getSnowflakeEntityMatchForList(SnowflakeEntityMatchRequest snowflakeEntityMatchRequest) throws ApiException {
    return getSnowflakeEntityMatchForListWithHttpInfo(snowflakeEntityMatchRequest).getData();
  }

  /**
   * Perform an entity search and return a snowflake-friendly response. Up to 25 Names per request.
   * Finds the best candidate entities matching the given company name. Additional attributes can be supplied to narrow the search. *This endpoint is used natively within Snowflake and is not to be consumed directly by users. Reach out to your FactSet Account team to learn more about Concordance in Snowflake.* 
   * @param snowflakeEntityMatchRequest A request to match an entity name and its attributes within Snowflake. (required)
   * @return ApiResponse&lt;SnowflakeEntityMatchResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Response object for the entity-match object in a snowflake friendly response model. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SnowflakeEntityMatchResponse> getSnowflakeEntityMatchForListWithHttpInfo(SnowflakeEntityMatchRequest snowflakeEntityMatchRequest) throws ApiException {
    Object localVarPostBody = snowflakeEntityMatchRequest;
    
    // verify the required parameter 'snowflakeEntityMatchRequest' is set
    if (snowflakeEntityMatchRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'snowflakeEntityMatchRequest' when calling getSnowflakeEntityMatchForList");
    }
    
    // create path and map variables
    String localVarPath = "/factset-concordance/v2/snowflake-entity-match";

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
        
        SnowflakeEntityMatchResponse
      
    > apiResponse = apiClient.invokeAPI("SnowflakeApi.getSnowflakeEntityMatchForList", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getSnowflakeEntityMatchForListResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Save entity mappings to a universe
   * Manually save or update entity mappings with metadata
   * @param snowflakeEntityMappingRequest A request to save entity mappings to a universe (required)
   * @return SnowflakeEntityMappingResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 0 </td><td> Response object according to snowflake external function spec </td><td>  -  </td></tr>
     </table>
   */
  public SnowflakeEntityMappingResponse snowflakeEntityMappingPost(SnowflakeEntityMappingRequest snowflakeEntityMappingRequest) throws ApiException {
    return snowflakeEntityMappingPostWithHttpInfo(snowflakeEntityMappingRequest).getData();
  }

  /**
   * Save entity mappings to a universe
   * Manually save or update entity mappings with metadata
   * @param snowflakeEntityMappingRequest A request to save entity mappings to a universe (required)
   * @return ApiResponse&lt;SnowflakeEntityMappingResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 0 </td><td> Response object according to snowflake external function spec </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SnowflakeEntityMappingResponse> snowflakeEntityMappingPostWithHttpInfo(SnowflakeEntityMappingRequest snowflakeEntityMappingRequest) throws ApiException {
    Object localVarPostBody = snowflakeEntityMappingRequest;
    
    // verify the required parameter 'snowflakeEntityMappingRequest' is set
    if (snowflakeEntityMappingRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'snowflakeEntityMappingRequest' when calling snowflakeEntityMappingPost");
    }
    
    // create path and map variables
    String localVarPath = "/factset-concordance/v2/snowflake-entity-mapping";

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
        
        SnowflakeEntityMappingResponse
      
    > apiResponse = apiClient.invokeAPI("SnowflakeApi.snowflakeEntityMappingPost", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, snowflakeEntityMappingPostResponseTypeMap, false);

    return apiResponse;

  }
}
