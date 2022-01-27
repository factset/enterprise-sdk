package com.factset.sdk.IRNConfiguration.api;

import com.factset.sdk.IRNConfiguration.ApiException;
import com.factset.sdk.IRNConfiguration.ApiClient;
import com.factset.sdk.IRNConfiguration.ApiResponse;
import com.factset.sdk.IRNConfiguration.Configuration;
import com.factset.sdk.IRNConfiguration.Pair;

import javax.ws.rs.core.GenericType;

import com.factset.sdk.IRNConfiguration.models.ProblemDetails;
import com.factset.sdk.IRNConfiguration.models.TeamConfigDto;
import com.factset.sdk.IRNConfiguration.models.TeamSummaryDto;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TeamsApi {
  private ApiClient apiClient;

  public TeamsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public TeamsApi(ApiClient apiClient) {
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
   * Get all Teams
   * 
   * @param xIRNIgnorePermissions  (optional, default to false)
   * @return java.util.List&lt;TeamSummaryDto&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     </table>
   */
  public java.util.List<TeamSummaryDto> v1TeamsGet(Boolean xIRNIgnorePermissions) throws ApiException {
    return v1TeamsGetWithHttpInfo(xIRNIgnorePermissions).getData();
  }

  /**
   * Get all Teams
   * 
   * @param xIRNIgnorePermissions  (optional, default to false)
   * @return ApiResponse&lt;java.util.List&lt;TeamSummaryDto&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<java.util.List<TeamSummaryDto>> v1TeamsGetWithHttpInfo(Boolean xIRNIgnorePermissions) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/v1/teams";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();


    if (xIRNIgnorePermissions != null)
      localVarHeaderParams.put("X-IRN-Ignore-Permissions", apiClient.parameterToString(xIRNIgnorePermissions));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };

    GenericType<java.util.List<TeamSummaryDto>> localVarReturnType = new GenericType<java.util.List<TeamSummaryDto>>() {};

    return apiClient.invokeAPI("TeamsApi.v1TeamsGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get Team details for the given Id provided
   * 
   * @param teamId Id (required)
   * @param xIRNIgnorePermissions  (optional, default to false)
   * @return TeamConfigDto
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
   */
  public TeamConfigDto v1TeamsTeamIdGet(java.util.UUID teamId, Boolean xIRNIgnorePermissions) throws ApiException {
    return v1TeamsTeamIdGetWithHttpInfo(teamId, xIRNIgnorePermissions).getData();
  }

  /**
   * Get Team details for the given Id provided
   * 
   * @param teamId Id (required)
   * @param xIRNIgnorePermissions  (optional, default to false)
   * @return ApiResponse&lt;TeamConfigDto&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<TeamConfigDto> v1TeamsTeamIdGetWithHttpInfo(java.util.UUID teamId, Boolean xIRNIgnorePermissions) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'teamId' is set
    if (teamId == null) {
      throw new ApiException(400, "Missing the required parameter 'teamId' when calling v1TeamsTeamIdGet");
    }
    
    // create path and map variables
    String localVarPath = "/v1/teams/{teamId}"
      .replaceAll("\\{" + "teamId" + "\\}", apiClient.escapeString(teamId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();


    if (xIRNIgnorePermissions != null)
      localVarHeaderParams.put("X-IRN-Ignore-Permissions", apiClient.parameterToString(xIRNIgnorePermissions));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };

    GenericType<TeamConfigDto> localVarReturnType = new GenericType<TeamConfigDto>() {};

    return apiClient.invokeAPI("TeamsApi.v1TeamsTeamIdGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
