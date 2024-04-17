package com.factset.sdk.Vermilion.api;

import com.factset.sdk.Vermilion.ApiException;
import com.factset.sdk.Vermilion.ApiClient;
import com.factset.sdk.Vermilion.ApiResponse;
import com.factset.sdk.Vermilion.Configuration;
import com.factset.sdk.Vermilion.Pair;

import jakarta.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.Vermilion.models.CreateScimUserJSONRequest;
import com.factset.sdk.Vermilion.models.CreatedScimUserJSONResponse;
import com.factset.sdk.Vermilion.models.ScimError;
import com.factset.sdk.Vermilion.models.ScimGroup;
import com.factset.sdk.Vermilion.models.ScimGroupListResponse;
import com.factset.sdk.Vermilion.models.ScimGroupPatchRequestBody;
import com.factset.sdk.Vermilion.models.ScimUser;
import com.factset.sdk.Vermilion.models.ScimUserListResponse;
import com.factset.sdk.Vermilion.models.ScimUserPatchRequestBody;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class ScimApi {
  private ApiClient apiClient;

  public ScimApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ScimApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> createGroupResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    createGroupResponseTypeMap.put(201, new GenericType<ScimGroup>(){});
    createGroupResponseTypeMap.put(403, new GenericType<ScimError>(){});
    createGroupResponseTypeMap.put(409, new GenericType<ScimError>(){});
  }

  private static final Map<Integer, GenericType> createUserResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    createUserResponseTypeMap.put(201, new GenericType<CreatedScimUserJSONResponse>(){});
    createUserResponseTypeMap.put(400, new GenericType<ScimError>(){});
    createUserResponseTypeMap.put(403, new GenericType<ScimError>(){});
    createUserResponseTypeMap.put(409, new GenericType<ScimError>(){});
  }

  private static final Map<Integer, GenericType> deleteGroupByIdResponseTypeMap = new HashMap<Integer, GenericType>();

  private static final Map<Integer, GenericType> deleteUserByIdResponseTypeMap = new HashMap<Integer, GenericType>();

  private static final Map<Integer, GenericType> getAllGroupsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getAllGroupsResponseTypeMap.put(200, new GenericType<ScimGroupListResponse>(){});
    getAllGroupsResponseTypeMap.put(403, new GenericType<ScimError>(){});
  }

  private static final Map<Integer, GenericType> getAllUsersResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getAllUsersResponseTypeMap.put(200, new GenericType<ScimUserListResponse>(){});
    getAllUsersResponseTypeMap.put(403, new GenericType<ScimError>(){});
  }

  private static final Map<Integer, GenericType> getGroupByIdResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getGroupByIdResponseTypeMap.put(200, new GenericType<ScimGroup>(){});
    getGroupByIdResponseTypeMap.put(403, new GenericType<ScimError>(){});
    getGroupByIdResponseTypeMap.put(404, new GenericType<ScimError>(){});
  }

  private static final Map<Integer, GenericType> getUserByIdResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getUserByIdResponseTypeMap.put(200, new GenericType<ScimUser>(){});
    getUserByIdResponseTypeMap.put(403, new GenericType<ScimError>(){});
    getUserByIdResponseTypeMap.put(404, new GenericType<ScimError>(){});
  }

  private static final Map<Integer, GenericType> patchGroupByIdResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    patchGroupByIdResponseTypeMap.put(200, new GenericType<ScimGroup>(){});
  }

  private static final Map<Integer, GenericType> patchUserByIdResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    patchUserByIdResponseTypeMap.put(200, new GenericType<ScimUser>(){});
    patchUserByIdResponseTypeMap.put(403, new GenericType<ScimError>(){});
    patchUserByIdResponseTypeMap.put(404, new GenericType<ScimError>(){});
  }

  private static final Map<Integer, GenericType> updateGroupByIdResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    updateGroupByIdResponseTypeMap.put(200, new GenericType<ScimGroup>(){});
    updateGroupByIdResponseTypeMap.put(403, new GenericType<ScimError>(){});
    updateGroupByIdResponseTypeMap.put(404, new GenericType<ScimError>(){});
  }

  private static final Map<Integer, GenericType> updateUserByIdResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    updateUserByIdResponseTypeMap.put(200, new GenericType<ScimUser>(){});
    updateUserByIdResponseTypeMap.put(403, new GenericType<ScimError>(){});
    updateUserByIdResponseTypeMap.put(404, new GenericType<ScimError>(){});
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
   * Creates a role
   * Creates a VRS role
   * @param scimGroup  (required)
   * @return ScimGroup
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Created </td><td>  * Location - A callback URL to the updated group, for example https://example.com/VRSAPI/scim/v2/Groups/1 <br>  </td></tr>
       <tr><td> 403 </td><td> Forbidden, user does not have permission to create roles </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Group already exists </td><td>  -  </td></tr>
     </table>
   */
  public ScimGroup createGroup(ScimGroup scimGroup) throws ApiException {
    return createGroupWithHttpInfo(scimGroup).getData();
  }

  /**
   * Creates a role
   * Creates a VRS role
   * @param scimGroup  (required)
   * @return ApiResponse&lt;ScimGroup&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Created </td><td>  * Location - A callback URL to the updated group, for example https://example.com/VRSAPI/scim/v2/Groups/1 <br>  </td></tr>
       <tr><td> 403 </td><td> Forbidden, user does not have permission to create roles </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Group already exists </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ScimGroup> createGroupWithHttpInfo(ScimGroup scimGroup) throws ApiException {
    Object localVarPostBody = scimGroup;
    
    // verify the required parameter 'scimGroup' is set
    if (scimGroup == null) {
      throw new ApiException(400, "Missing the required parameter 'scimGroup' when calling createGroup");
    }
    
    // create path and map variables
    String localVarPath = "/scim/v2/Groups";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/scim+json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/scim+json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        ScimGroup
      
    > apiResponse = apiClient.invokeAPI("ScimApi.createGroup", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, createGroupResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Creates a user
   * Creates a VRS user
   * @param createScimUserJSONRequest  (required)
   * @return CreatedScimUserJSONResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Created </td><td>  * Location - A callback URL to the updated group, for example https://example.com/VRSAPI/scim/v2/Groups/1 <br>  </td></tr>
       <tr><td> 400 </td><td> Bad Request, required values not provided in JSON request body (e.g. tenant, name or userName (loginID) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden, user does not have permission to create users or it does not have requested tenancy assigned to it </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> User already exists </td><td>  -  </td></tr>
     </table>
   */
  public CreatedScimUserJSONResponse createUser(CreateScimUserJSONRequest createScimUserJSONRequest) throws ApiException {
    return createUserWithHttpInfo(createScimUserJSONRequest).getData();
  }

  /**
   * Creates a user
   * Creates a VRS user
   * @param createScimUserJSONRequest  (required)
   * @return ApiResponse&lt;CreatedScimUserJSONResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Created </td><td>  * Location - A callback URL to the updated group, for example https://example.com/VRSAPI/scim/v2/Groups/1 <br>  </td></tr>
       <tr><td> 400 </td><td> Bad Request, required values not provided in JSON request body (e.g. tenant, name or userName (loginID) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden, user does not have permission to create users or it does not have requested tenancy assigned to it </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> User already exists </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CreatedScimUserJSONResponse> createUserWithHttpInfo(CreateScimUserJSONRequest createScimUserJSONRequest) throws ApiException {
    Object localVarPostBody = createScimUserJSONRequest;
    
    // verify the required parameter 'createScimUserJSONRequest' is set
    if (createScimUserJSONRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'createScimUserJSONRequest' when calling createUser");
    }
    
    // create path and map variables
    String localVarPath = "/scim/v2/Users";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/scim+json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/scim+json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        CreatedScimUserJSONResponse
      
    > apiResponse = apiClient.invokeAPI("ScimApi.createUser", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, createUserResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Deletes a VRS role
   * Deletes a VRS role
   * @param groupId The ID of the group (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden, user does not have permission to delete roles </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
   */
  public void deleteGroupById(String groupId) throws ApiException {
    deleteGroupByIdWithHttpInfo(groupId);
  }

  /**
   * Deletes a VRS role
   * Deletes a VRS role
   * @param groupId The ID of the group (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden, user does not have permission to delete roles </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> deleteGroupByIdWithHttpInfo(String groupId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'groupId' is set
    if (groupId == null) {
      throw new ApiException(400, "Missing the required parameter 'groupId' when calling deleteGroupById");
    }
    
    // create path and map variables
    String localVarPath = "/scim/v2/Groups/{groupId}"
      .replaceAll("\\{" + "groupId" + "\\}", apiClient.escapeString(groupId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/scim+json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
      Void
    > apiResponse = apiClient.invokeAPI("ScimApi.deleteGroupById", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, deleteGroupByIdResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Deletes a VRS user
   * Deletes a VRS user (this marks them as &#39;Deleted&#39; in the database)
   * @param userId The ID of the user (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden, user does not have permission to delete users </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
   */
  public void deleteUserById(String userId) throws ApiException {
    deleteUserByIdWithHttpInfo(userId);
  }

  /**
   * Deletes a VRS user
   * Deletes a VRS user (this marks them as &#39;Deleted&#39; in the database)
   * @param userId The ID of the user (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden, user does not have permission to delete users </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> deleteUserByIdWithHttpInfo(String userId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling deleteUserById");
    }
    
    // create path and map variables
    String localVarPath = "/scim/v2/Users/{userId}"
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/scim+json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
      Void
    > apiResponse = apiClient.invokeAPI("ScimApi.deleteUserById", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, deleteUserByIdResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Retrieves a list of VRS role
   * Retrieves a VRS roles
   * @param count Non-negative maximum number of entries to return (optional)
   * @param startIndex The 1-based index of the first query result (optional)
   * @return ScimGroupListResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden, user does not have permission to view roles </td><td>  -  </td></tr>
     </table>
   */
  public ScimGroupListResponse getAllGroups(Integer count, Integer startIndex) throws ApiException {
    return getAllGroupsWithHttpInfo(count, startIndex).getData();
  }

  /**
   * Retrieves a list of VRS role
   * Retrieves a VRS roles
   * @param count Non-negative maximum number of entries to return (optional)
   * @param startIndex The 1-based index of the first query result (optional)
   * @return ApiResponse&lt;ScimGroupListResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden, user does not have permission to view roles </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ScimGroupListResponse> getAllGroupsWithHttpInfo(Integer count, Integer startIndex) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/scim/v2/Groups";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "count", count));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startIndex", startIndex));

    
    
    
    final String[] localVarAccepts = {
      "application/scim+json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        ScimGroupListResponse
      
    > apiResponse = apiClient.invokeAPI("ScimApi.getAllGroups", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getAllGroupsResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Retrieves a list of VRS users
   * Retrieves a list of VRS users
   * @param count Non-negative maximum number of entries to return (optional)
   * @param startIndex The 1-based index of the first query result (optional)
   * @return ScimUserListResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden, user does not have permission to view users </td><td>  -  </td></tr>
     </table>
   */
  public ScimUserListResponse getAllUsers(Integer count, Integer startIndex) throws ApiException {
    return getAllUsersWithHttpInfo(count, startIndex).getData();
  }

  /**
   * Retrieves a list of VRS users
   * Retrieves a list of VRS users
   * @param count Non-negative maximum number of entries to return (optional)
   * @param startIndex The 1-based index of the first query result (optional)
   * @return ApiResponse&lt;ScimUserListResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden, user does not have permission to view users </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ScimUserListResponse> getAllUsersWithHttpInfo(Integer count, Integer startIndex) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/scim/v2/Users";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "count", count));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startIndex", startIndex));

    
    
    
    final String[] localVarAccepts = {
      "application/scim+json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        ScimUserListResponse
      
    > apiResponse = apiClient.invokeAPI("ScimApi.getAllUsers", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getAllUsersResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Retrieves a VRS role
   * Retrieves a VRS role based on the ID
   * @param groupId The ID of the role (required)
   * @return ScimGroup
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  * Location - A callback URL to the updated group, for example https://example.com/VRSAPI/scim/v2/Groups/1 <br>  </td></tr>
       <tr><td> 403 </td><td> Forbidden, user does not have permission to view roles </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
   */
  public ScimGroup getGroupById(String groupId) throws ApiException {
    return getGroupByIdWithHttpInfo(groupId).getData();
  }

  /**
   * Retrieves a VRS role
   * Retrieves a VRS role based on the ID
   * @param groupId The ID of the role (required)
   * @return ApiResponse&lt;ScimGroup&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  * Location - A callback URL to the updated group, for example https://example.com/VRSAPI/scim/v2/Groups/1 <br>  </td></tr>
       <tr><td> 403 </td><td> Forbidden, user does not have permission to view roles </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ScimGroup> getGroupByIdWithHttpInfo(String groupId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'groupId' is set
    if (groupId == null) {
      throw new ApiException(400, "Missing the required parameter 'groupId' when calling getGroupById");
    }
    
    // create path and map variables
    String localVarPath = "/scim/v2/Groups/{groupId}"
      .replaceAll("\\{" + "groupId" + "\\}", apiClient.escapeString(groupId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/scim+json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        ScimGroup
      
    > apiResponse = apiClient.invokeAPI("ScimApi.getGroupById", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getGroupByIdResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Retrieves a VRS User
   * Retrieves a VRS user based on their ID
   * @param userId The ID of the user (required)
   * @return ScimUser
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  * Location - A callback URL to the updated group, for example https://example.com/VRSAPI/scim/v2/Groups/1 <br>  </td></tr>
       <tr><td> 403 </td><td> Forbidden, user does not have permission to view users </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
   */
  public ScimUser getUserById(String userId) throws ApiException {
    return getUserByIdWithHttpInfo(userId).getData();
  }

  /**
   * Retrieves a VRS User
   * Retrieves a VRS user based on their ID
   * @param userId The ID of the user (required)
   * @return ApiResponse&lt;ScimUser&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  * Location - A callback URL to the updated group, for example https://example.com/VRSAPI/scim/v2/Groups/1 <br>  </td></tr>
       <tr><td> 403 </td><td> Forbidden, user does not have permission to view users </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ScimUser> getUserByIdWithHttpInfo(String userId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling getUserById");
    }
    
    // create path and map variables
    String localVarPath = "/scim/v2/Users/{userId}"
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/scim+json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        ScimUser
      
    > apiResponse = apiClient.invokeAPI("ScimApi.getUserById", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getUserByIdResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Add or remove a user to/from a group
   * Adds or removes a VRS user to/from a VRS role
   * @param groupId The ID of the role (required)
   * @param scimGroupPatchRequestBody  (required)
   * @return ScimGroup
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successfully added user to group </td><td>  -  </td></tr>
     </table>
   */
  public ScimGroup patchGroupById(String groupId, ScimGroupPatchRequestBody scimGroupPatchRequestBody) throws ApiException {
    return patchGroupByIdWithHttpInfo(groupId, scimGroupPatchRequestBody).getData();
  }

  /**
   * Add or remove a user to/from a group
   * Adds or removes a VRS user to/from a VRS role
   * @param groupId The ID of the role (required)
   * @param scimGroupPatchRequestBody  (required)
   * @return ApiResponse&lt;ScimGroup&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successfully added user to group </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ScimGroup> patchGroupByIdWithHttpInfo(String groupId, ScimGroupPatchRequestBody scimGroupPatchRequestBody) throws ApiException {
    Object localVarPostBody = scimGroupPatchRequestBody;
    
    // verify the required parameter 'groupId' is set
    if (groupId == null) {
      throw new ApiException(400, "Missing the required parameter 'groupId' when calling patchGroupById");
    }
    
    // verify the required parameter 'scimGroupPatchRequestBody' is set
    if (scimGroupPatchRequestBody == null) {
      throw new ApiException(400, "Missing the required parameter 'scimGroupPatchRequestBody' when calling patchGroupById");
    }
    
    // create path and map variables
    String localVarPath = "/scim/v2/Groups/{groupId}"
      .replaceAll("\\{" + "groupId" + "\\}", apiClient.escapeString(groupId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/scim+json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/scim+json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        ScimGroup
      
    > apiResponse = apiClient.invokeAPI("ScimApi.patchGroupById", localVarPath, "PATCH", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, patchGroupByIdResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Add or remove VRS user attributes
   * Adds or removes VRS user attributes based on the JSON properties
   * @param userId The ID of the user (required)
   * @param scimUserPatchRequestBody  (required)
   * @return ScimUser
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successfully updated user </td><td>  * Location - A callback URL to the updated group, for example https://example.com/VRSAPI/scim/v2/Groups/1 <br>  </td></tr>
       <tr><td> 403 </td><td> Forbidden, user does not have permission to update users </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
   */
  public ScimUser patchUserById(String userId, ScimUserPatchRequestBody scimUserPatchRequestBody) throws ApiException {
    return patchUserByIdWithHttpInfo(userId, scimUserPatchRequestBody).getData();
  }

  /**
   * Add or remove VRS user attributes
   * Adds or removes VRS user attributes based on the JSON properties
   * @param userId The ID of the user (required)
   * @param scimUserPatchRequestBody  (required)
   * @return ApiResponse&lt;ScimUser&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successfully updated user </td><td>  * Location - A callback URL to the updated group, for example https://example.com/VRSAPI/scim/v2/Groups/1 <br>  </td></tr>
       <tr><td> 403 </td><td> Forbidden, user does not have permission to update users </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ScimUser> patchUserByIdWithHttpInfo(String userId, ScimUserPatchRequestBody scimUserPatchRequestBody) throws ApiException {
    Object localVarPostBody = scimUserPatchRequestBody;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling patchUserById");
    }
    
    // verify the required parameter 'scimUserPatchRequestBody' is set
    if (scimUserPatchRequestBody == null) {
      throw new ApiException(400, "Missing the required parameter 'scimUserPatchRequestBody' when calling patchUserById");
    }
    
    // create path and map variables
    String localVarPath = "/scim/v2/Users/{userId}"
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/scim+json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/scim+json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        ScimUser
      
    > apiResponse = apiClient.invokeAPI("ScimApi.patchUserById", localVarPath, "PATCH", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, patchUserByIdResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Updates a VRS Group
   * Updates (replaces) a VRS Group with the properties in the JSON
   * @param groupId The ID of the group (required)
   * @param scimGroup  (required)
   * @return ScimGroup
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successfully updated group </td><td>  * Location - A callback URL to the updated group, for example https://example.com/VRSAPI/scim/v2/Groups/1 <br>  </td></tr>
       <tr><td> 403 </td><td> Forbidden, user does not have permission to update groups </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
   */
  public ScimGroup updateGroupById(String groupId, ScimGroup scimGroup) throws ApiException {
    return updateGroupByIdWithHttpInfo(groupId, scimGroup).getData();
  }

  /**
   * Updates a VRS Group
   * Updates (replaces) a VRS Group with the properties in the JSON
   * @param groupId The ID of the group (required)
   * @param scimGroup  (required)
   * @return ApiResponse&lt;ScimGroup&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successfully updated group </td><td>  * Location - A callback URL to the updated group, for example https://example.com/VRSAPI/scim/v2/Groups/1 <br>  </td></tr>
       <tr><td> 403 </td><td> Forbidden, user does not have permission to update groups </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ScimGroup> updateGroupByIdWithHttpInfo(String groupId, ScimGroup scimGroup) throws ApiException {
    Object localVarPostBody = scimGroup;
    
    // verify the required parameter 'groupId' is set
    if (groupId == null) {
      throw new ApiException(400, "Missing the required parameter 'groupId' when calling updateGroupById");
    }
    
    // verify the required parameter 'scimGroup' is set
    if (scimGroup == null) {
      throw new ApiException(400, "Missing the required parameter 'scimGroup' when calling updateGroupById");
    }
    
    // create path and map variables
    String localVarPath = "/scim/v2/Groups/{groupId}"
      .replaceAll("\\{" + "groupId" + "\\}", apiClient.escapeString(groupId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/scim+json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/scim+json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        ScimGroup
      
    > apiResponse = apiClient.invokeAPI("ScimApi.updateGroupById", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, updateGroupByIdResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Updates a VRS user
   * Updates (replaces) a VRS user with the properties in the JSON
   * @param userId The ID of the user (required)
   * @param scimUser  (required)
   * @return ScimUser
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successfully updated user </td><td>  * Location - A callback URL to the updated group, for example https://example.com/VRSAPI/scim/v2/Groups/1 <br>  </td></tr>
       <tr><td> 403 </td><td> Forbidden, user does not have permission to update users </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
   */
  public ScimUser updateUserById(String userId, ScimUser scimUser) throws ApiException {
    return updateUserByIdWithHttpInfo(userId, scimUser).getData();
  }

  /**
   * Updates a VRS user
   * Updates (replaces) a VRS user with the properties in the JSON
   * @param userId The ID of the user (required)
   * @param scimUser  (required)
   * @return ApiResponse&lt;ScimUser&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successfully updated user </td><td>  * Location - A callback URL to the updated group, for example https://example.com/VRSAPI/scim/v2/Groups/1 <br>  </td></tr>
       <tr><td> 403 </td><td> Forbidden, user does not have permission to update users </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ScimUser> updateUserByIdWithHttpInfo(String userId, ScimUser scimUser) throws ApiException {
    Object localVarPostBody = scimUser;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling updateUserById");
    }
    
    // verify the required parameter 'scimUser' is set
    if (scimUser == null) {
      throw new ApiException(400, "Missing the required parameter 'scimUser' when calling updateUserById");
    }
    
    // create path and map variables
    String localVarPath = "/scim/v2/Users/{userId}"
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/scim+json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/scim+json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        ScimUser
      
    > apiResponse = apiClient.invokeAPI("ScimApi.updateUserById", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, updateUserByIdResponseTypeMap, false);

    return apiResponse;

  }
}
