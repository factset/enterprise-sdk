package com.factset.sdk.FactSetConcordance.api;

import com.factset.sdk.FactSetConcordance.ApiException;
import com.factset.sdk.FactSetConcordance.ApiClient;
import com.factset.sdk.FactSetConcordance.ApiResponse;
import com.factset.sdk.FactSetConcordance.Configuration;
import com.factset.sdk.FactSetConcordance.Pair;

import javax.ws.rs.core.GenericType;

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
   * Perform an entity match and return a snowflake-friendly response. 1 Name per request.
   * Finds the best candidate entities matching the given entity name. Additional attributes can be supplied to narrow the search. *This endpoint is used natively within Snowflake and is not to be consumed directly by users. Reach out to your FactSet Account team to learn more about Concordance in Snowflake.* 
   * @param name Name of Entity to match. (required)
   * @param country ISO2 country code corresponding to the entity name that is used when evaluating candidates for a match. For a list of ISO2 Country codes, visit [OA 8754](https://my.apps.factset.com/oa/pages/8754). (optional)
   * @param state Two-character state code corresponding to the entity name that is used when evaluating candidates for a match. Currently, only US state codes are supported. (optional)
   * @param url URL corresponding to the entity name that is used when evaluating candidates for a match. (optional)
   * @return SnowflakeEntityMatchResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Response object for the entity-match object in a snowflake friendly response model. </td><td>  -  </td></tr>
     </table>
   */
  public SnowflakeEntityMatchResponse getSnowflakeEntityMatch(String name, String country, String state, String url) throws ApiException {
    return getSnowflakeEntityMatchWithHttpInfo(name, country, state, url).getData();
  }

  /**
   * Perform an entity match and return a snowflake-friendly response. 1 Name per request.
   * Finds the best candidate entities matching the given entity name. Additional attributes can be supplied to narrow the search. *This endpoint is used natively within Snowflake and is not to be consumed directly by users. Reach out to your FactSet Account team to learn more about Concordance in Snowflake.* 
   * @param name Name of Entity to match. (required)
   * @param country ISO2 country code corresponding to the entity name that is used when evaluating candidates for a match. For a list of ISO2 Country codes, visit [OA 8754](https://my.apps.factset.com/oa/pages/8754). (optional)
   * @param state Two-character state code corresponding to the entity name that is used when evaluating candidates for a match. Currently, only US state codes are supported. (optional)
   * @param url URL corresponding to the entity name that is used when evaluating candidates for a match. (optional)
   * @return ApiResponse&lt;SnowflakeEntityMatchResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Response object for the entity-match object in a snowflake friendly response model. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SnowflakeEntityMatchResponse> getSnowflakeEntityMatchWithHttpInfo(String name, String country, String state, String url) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling getSnowflakeEntityMatch");
    }
    
    // create path and map variables
    String localVarPath = "/factset-concordance/v1/snowflake-entity-match";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "name", name));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "country", country));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "state", state));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "url", url));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };

    GenericType<SnowflakeEntityMatchResponse> localVarReturnType = new GenericType<SnowflakeEntityMatchResponse>() {};

    return apiClient.invokeAPI("SnowflakeApi.getSnowflakeEntityMatch", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
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
    String localVarPath = "/factset-concordance/v1/snowflake-entity-match";

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

    GenericType<SnowflakeEntityMatchResponse> localVarReturnType = new GenericType<SnowflakeEntityMatchResponse>() {};

    return apiClient.invokeAPI("SnowflakeApi.getSnowflakeEntityMatchForList", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
