package com.factset.sdk.IRNConfiguration.api;

import com.factset.sdk.IRNConfiguration.ApiException;
import com.factset.sdk.IRNConfiguration.ApiClient;
import com.factset.sdk.IRNConfiguration.ApiResponse;
import com.factset.sdk.IRNConfiguration.Configuration;
import com.factset.sdk.IRNConfiguration.Pair;

import javax.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.IRNConfiguration.models.AuthorConfigDto;
import com.factset.sdk.IRNConfiguration.models.ClientSalesRepresentativeDto;
import com.factset.sdk.IRNConfiguration.models.CustomFieldConfigDto;
import com.factset.sdk.IRNConfiguration.models.GroupConfigDto;
import com.factset.sdk.IRNConfiguration.models.ProblemDetails;
import com.factset.sdk.IRNConfiguration.models.RecommendationConfigDto;
import com.factset.sdk.IRNConfiguration.models.SentimentConfigDto;
import com.factset.sdk.IRNConfiguration.models.SubjectConfigDto;
import com.factset.sdk.IRNConfiguration.models.SubjectSummaryDto;
import com.factset.sdk.IRNConfiguration.models.TeamConfigDto;
import com.factset.sdk.IRNConfiguration.models.TeamSummaryDto;
import com.factset.sdk.IRNConfiguration.models.UserConfigDto;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class NotesConfigurationApi {
  private ApiClient apiClient;

  public NotesConfigurationApi() {
    this(Configuration.getDefaultApiClient());
  }

  public NotesConfigurationApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> getAssignedFactSetUsersResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getAssignedFactSetUsersResponseTypeMap.put(200, new GenericType<java.util.List<UserConfigDto>>(){});
  }

  private static final Map<Integer, GenericType> getAuthorsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getAuthorsResponseTypeMap.put(200, new GenericType<java.util.List<AuthorConfigDto>>(){});
    getAuthorsResponseTypeMap.put(403, new GenericType<ProblemDetails>(){});
  }

  private static final Map<Integer, GenericType> getClientsSalesRepresentativeResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getClientsSalesRepresentativeResponseTypeMap.put(200, new GenericType<ClientSalesRepresentativeDto>(){});
    getClientsSalesRepresentativeResponseTypeMap.put(404, new GenericType<ProblemDetails>(){});
  }

  private static final Map<Integer, GenericType> getCustomFieldsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getCustomFieldsResponseTypeMap.put(200, new GenericType<java.util.List<CustomFieldConfigDto>>(){});
    getCustomFieldsResponseTypeMap.put(403, new GenericType<ProblemDetails>(){});
  }

  private static final Map<Integer, GenericType> getGroupResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getGroupResponseTypeMap.put(200, new GenericType<GroupConfigDto>(){});
  }

  private static final Map<Integer, GenericType> getRecommendationsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getRecommendationsResponseTypeMap.put(200, new GenericType<java.util.List<RecommendationConfigDto>>(){});
  }

  private static final Map<Integer, GenericType> getSentimentsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getSentimentsResponseTypeMap.put(200, new GenericType<java.util.List<SentimentConfigDto>>(){});
  }

  private static final Map<Integer, GenericType> getSubjectResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getSubjectResponseTypeMap.put(200, new GenericType<SubjectConfigDto>(){});
    getSubjectResponseTypeMap.put(403, new GenericType<ProblemDetails>(){});
    getSubjectResponseTypeMap.put(404, new GenericType<ProblemDetails>(){});
  }

  private static final Map<Integer, GenericType> getSubjectsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getSubjectsResponseTypeMap.put(200, new GenericType<java.util.List<SubjectSummaryDto>>(){});
    getSubjectsResponseTypeMap.put(403, new GenericType<ProblemDetails>(){});
  }

  private static final Map<Integer, GenericType> getTeamResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getTeamResponseTypeMap.put(200, new GenericType<TeamConfigDto>(){});
    getTeamResponseTypeMap.put(403, new GenericType<ProblemDetails>(){});
    getTeamResponseTypeMap.put(404, new GenericType<ProblemDetails>(){});
  }

  private static final Map<Integer, GenericType> getTeamsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getTeamsResponseTypeMap.put(200, new GenericType<java.util.List<TeamSummaryDto>>(){});
    getTeamsResponseTypeMap.put(403, new GenericType<ProblemDetails>(){});
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
   * Get all assigned FactSet users
   * 
   * @return java.util.List<UserConfigDto>
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public java.util.List<UserConfigDto> getAssignedFactSetUsers() throws ApiException {
    return getAssignedFactSetUsersWithHttpInfo().getData();
  }

  /**
   * Get all assigned FactSet users
   * 
   * @return ApiResponse&lt;java.util.List<UserConfigDto>&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<java.util.List<UserConfigDto>> getAssignedFactSetUsersWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/v1/users";

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
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        java.util.List<UserConfigDto>
      
    > apiResponse = apiClient.invokeAPI("NotesConfigurationApi.getAssignedFactSetUsers", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getAssignedFactSetUsersResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Get all Authors
   * 
   * @param xIRNIgnorePermissions  (optional, default to false)
   * @return java.util.List<AuthorConfigDto>
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     </table>
   */
  public java.util.List<AuthorConfigDto> getAuthors(Boolean xIRNIgnorePermissions) throws ApiException {
    return getAuthorsWithHttpInfo(xIRNIgnorePermissions).getData();
  }

  /**
   * Get all Authors
   * 
   * @param xIRNIgnorePermissions  (optional, default to false)
   * @return ApiResponse&lt;java.util.List<AuthorConfigDto>&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<java.util.List<AuthorConfigDto>> getAuthorsWithHttpInfo(Boolean xIRNIgnorePermissions) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/v1/authors";

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


    ApiResponse<
        
        java.util.List<AuthorConfigDto>
      
    > apiResponse = apiClient.invokeAPI("NotesConfigurationApi.getAuthors", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getAuthorsResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * 
   * 
   * @return ClientSalesRepresentativeDto
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
   */
  public ClientSalesRepresentativeDto getClientsSalesRepresentative() throws ApiException {
    return getClientsSalesRepresentativeWithHttpInfo().getData();
  }

  /**
   * 
   * 
   * @return ApiResponse&lt;ClientSalesRepresentativeDto&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ClientSalesRepresentativeDto> getClientsSalesRepresentativeWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/v1/group/client-sales-representative";

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
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        ClientSalesRepresentativeDto
      
    > apiResponse = apiClient.invokeAPI("NotesConfigurationApi.getClientsSalesRepresentative", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getClientsSalesRepresentativeResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Get all Custom Fields
   * 
   * @param xIRNIgnorePermissions  (optional, default to false)
   * @return java.util.List<CustomFieldConfigDto>
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     </table>
   */
  public java.util.List<CustomFieldConfigDto> getCustomFields(Boolean xIRNIgnorePermissions) throws ApiException {
    return getCustomFieldsWithHttpInfo(xIRNIgnorePermissions).getData();
  }

  /**
   * Get all Custom Fields
   * 
   * @param xIRNIgnorePermissions  (optional, default to false)
   * @return ApiResponse&lt;java.util.List<CustomFieldConfigDto>&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<java.util.List<CustomFieldConfigDto>> getCustomFieldsWithHttpInfo(Boolean xIRNIgnorePermissions) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/v1/custom-fields";

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


    ApiResponse<
        
        java.util.List<CustomFieldConfigDto>
      
    > apiResponse = apiClient.invokeAPI("NotesConfigurationApi.getCustomFields", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getCustomFieldsResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Get Group details
   * 
   * @return GroupConfigDto
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public GroupConfigDto getGroup() throws ApiException {
    return getGroupWithHttpInfo().getData();
  }

  /**
   * Get Group details
   * 
   * @return ApiResponse&lt;GroupConfigDto&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GroupConfigDto> getGroupWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/v1/group";

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
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        GroupConfigDto
      
    > apiResponse = apiClient.invokeAPI("NotesConfigurationApi.getGroup", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getGroupResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Get all Recommendations
   * 
   * @return java.util.List<RecommendationConfigDto>
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public java.util.List<RecommendationConfigDto> getRecommendations() throws ApiException {
    return getRecommendationsWithHttpInfo().getData();
  }

  /**
   * Get all Recommendations
   * 
   * @return ApiResponse&lt;java.util.List<RecommendationConfigDto>&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<java.util.List<RecommendationConfigDto>> getRecommendationsWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/v1/recommendations";

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
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        java.util.List<RecommendationConfigDto>
      
    > apiResponse = apiClient.invokeAPI("NotesConfigurationApi.getRecommendations", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getRecommendationsResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Get all Sentiments
   * 
   * @return java.util.List<SentimentConfigDto>
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public java.util.List<SentimentConfigDto> getSentiments() throws ApiException {
    return getSentimentsWithHttpInfo().getData();
  }

  /**
   * Get all Sentiments
   * 
   * @return ApiResponse&lt;java.util.List<SentimentConfigDto>&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<java.util.List<SentimentConfigDto>> getSentimentsWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/v1/sentiments";

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
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        java.util.List<SentimentConfigDto>
      
    > apiResponse = apiClient.invokeAPI("NotesConfigurationApi.getSentiments", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getSentimentsResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Get Subject details for the given Id provided
   * 
   * @param subjectId Id (required)
   * @param xIRNIgnorePermissions  (optional, default to false)
   * @return SubjectConfigDto
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
   */
  public SubjectConfigDto getSubject(java.util.UUID subjectId, Boolean xIRNIgnorePermissions) throws ApiException {
    return getSubjectWithHttpInfo(subjectId, xIRNIgnorePermissions).getData();
  }

  /**
   * Get Subject details for the given Id provided
   * 
   * @param subjectId Id (required)
   * @param xIRNIgnorePermissions  (optional, default to false)
   * @return ApiResponse&lt;SubjectConfigDto&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SubjectConfigDto> getSubjectWithHttpInfo(java.util.UUID subjectId, Boolean xIRNIgnorePermissions) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'subjectId' is set
    if (subjectId == null) {
      throw new ApiException(400, "Missing the required parameter 'subjectId' when calling getSubject");
    }
    
    // create path and map variables
    String localVarPath = "/v1/subjects/{subjectId}"
      .replaceAll("\\{" + "subjectId" + "\\}", apiClient.escapeString(subjectId.toString()));

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


    ApiResponse<
        
        SubjectConfigDto
      
    > apiResponse = apiClient.invokeAPI("NotesConfigurationApi.getSubject", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getSubjectResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Get all Subjects
   * 
   * @param xIRNIgnorePermissions  (optional, default to false)
   * @return java.util.List<SubjectSummaryDto>
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     </table>
   */
  public java.util.List<SubjectSummaryDto> getSubjects(Boolean xIRNIgnorePermissions) throws ApiException {
    return getSubjectsWithHttpInfo(xIRNIgnorePermissions).getData();
  }

  /**
   * Get all Subjects
   * 
   * @param xIRNIgnorePermissions  (optional, default to false)
   * @return ApiResponse&lt;java.util.List<SubjectSummaryDto>&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<java.util.List<SubjectSummaryDto>> getSubjectsWithHttpInfo(Boolean xIRNIgnorePermissions) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/v1/subjects";

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


    ApiResponse<
        
        java.util.List<SubjectSummaryDto>
      
    > apiResponse = apiClient.invokeAPI("NotesConfigurationApi.getSubjects", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getSubjectsResponseTypeMap, false);

    return apiResponse;

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
  public TeamConfigDto getTeam(java.util.UUID teamId, Boolean xIRNIgnorePermissions) throws ApiException {
    return getTeamWithHttpInfo(teamId, xIRNIgnorePermissions).getData();
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
  public ApiResponse<TeamConfigDto> getTeamWithHttpInfo(java.util.UUID teamId, Boolean xIRNIgnorePermissions) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'teamId' is set
    if (teamId == null) {
      throw new ApiException(400, "Missing the required parameter 'teamId' when calling getTeam");
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


    ApiResponse<
        
        TeamConfigDto
      
    > apiResponse = apiClient.invokeAPI("NotesConfigurationApi.getTeam", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getTeamResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Get all Teams
   * 
   * @param xIRNIgnorePermissions  (optional, default to false)
   * @return java.util.List<TeamSummaryDto>
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     </table>
   */
  public java.util.List<TeamSummaryDto> getTeams(Boolean xIRNIgnorePermissions) throws ApiException {
    return getTeamsWithHttpInfo(xIRNIgnorePermissions).getData();
  }

  /**
   * Get all Teams
   * 
   * @param xIRNIgnorePermissions  (optional, default to false)
   * @return ApiResponse&lt;java.util.List<TeamSummaryDto>&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<java.util.List<TeamSummaryDto>> getTeamsWithHttpInfo(Boolean xIRNIgnorePermissions) throws ApiException {
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


    ApiResponse<
        
        java.util.List<TeamSummaryDto>
      
    > apiResponse = apiClient.invokeAPI("NotesConfigurationApi.getTeams", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getTeamsResponseTypeMap, false);

    return apiResponse;

  }
}
