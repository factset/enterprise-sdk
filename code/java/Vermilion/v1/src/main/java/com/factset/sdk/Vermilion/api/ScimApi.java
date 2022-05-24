package com.factset.sdk.Vermilion.api;

import com.factset.sdk.Vermilion.ApiException;
import com.factset.sdk.Vermilion.ApiClient;
import com.factset.sdk.Vermilion.ApiResponse;
import com.factset.sdk.Vermilion.Configuration;
import com.factset.sdk.Vermilion.Pair;

import javax.ws.rs.core.GenericType;

import com.factset.sdk.Vermilion.models.CreateScimUserJSONRequest;
import com.factset.sdk.Vermilion.models.CreatedScimUserJSONResponse;
import com.factset.sdk.Vermilion.models.InlineObject1;
import com.factset.sdk.Vermilion.models.InlineObject2;
import com.factset.sdk.Vermilion.models.InlineResponse4004;
import com.factset.sdk.Vermilion.models.InlineResponse4031;
import com.factset.sdk.Vermilion.models.InlineResponse4032;
import com.factset.sdk.Vermilion.models.InlineResponse4033;
import com.factset.sdk.Vermilion.models.InlineResponse4034;
import com.factset.sdk.Vermilion.models.InlineResponse4035;
import com.factset.sdk.Vermilion.models.InlineResponse4036;
import com.factset.sdk.Vermilion.models.InlineResponse4037;
import com.factset.sdk.Vermilion.models.InlineResponse4038;
import com.factset.sdk.Vermilion.models.InlineResponse4044;
import com.factset.sdk.Vermilion.models.InlineResponse409;
import com.factset.sdk.Vermilion.models.InlineResponse4091;
import com.factset.sdk.Vermilion.models.ScimGroup;
import com.factset.sdk.Vermilion.models.ScimGroupListResponse;
import com.factset.sdk.Vermilion.models.ScimUser;
import com.factset.sdk.Vermilion.models.ScimUserListResponse;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ScimApi {
  private ApiClient apiClient;

  public ScimApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ScimApi(ApiClient apiClient) {
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
  public ScimGroupListResponse scimV2GroupsGet(Integer count, Integer startIndex) throws ApiException {
    return scimV2GroupsGetWithHttpInfo(count, startIndex).getData();
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
  public ApiResponse<ScimGroupListResponse> scimV2GroupsGetWithHttpInfo(Integer count, Integer startIndex) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/scim/v2/Groups/";

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

    GenericType<ScimGroupListResponse> localVarReturnType = new GenericType<ScimGroupListResponse>() {};

    return apiClient.invokeAPI("ScimApi.scimV2GroupsGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
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
  public void scimV2GroupsGroupIdDelete(String groupId) throws ApiException {
    scimV2GroupsGroupIdDeleteWithHttpInfo(groupId);
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
  public ApiResponse<Void> scimV2GroupsGroupIdDeleteWithHttpInfo(String groupId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'groupId' is set
    if (groupId == null) {
      throw new ApiException(400, "Missing the required parameter 'groupId' when calling scimV2GroupsGroupIdDelete");
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

    return apiClient.invokeAPI("ScimApi.scimV2GroupsGroupIdDelete", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
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
  public ScimGroup scimV2GroupsGroupIdGet(String groupId) throws ApiException {
    return scimV2GroupsGroupIdGetWithHttpInfo(groupId).getData();
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
  public ApiResponse<ScimGroup> scimV2GroupsGroupIdGetWithHttpInfo(String groupId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'groupId' is set
    if (groupId == null) {
      throw new ApiException(400, "Missing the required parameter 'groupId' when calling scimV2GroupsGroupIdGet");
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

    GenericType<ScimGroup> localVarReturnType = new GenericType<ScimGroup>() {};

    return apiClient.invokeAPI("ScimApi.scimV2GroupsGroupIdGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Add or remove a user to/from a group
   * Adds or removes a VRS user to/from a VRS role
   * @param groupId The ID of the role (required)
   * @param inlineObject2  (required)
   * @return ScimGroup
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> Successfully added user to group </td><td>  -  </td></tr>
     </table>
   */
  public ScimGroup scimV2GroupsGroupIdPatch(String groupId, InlineObject2 inlineObject2) throws ApiException {
    return scimV2GroupsGroupIdPatchWithHttpInfo(groupId, inlineObject2).getData();
  }

  /**
   * Add or remove a user to/from a group
   * Adds or removes a VRS user to/from a VRS role
   * @param groupId The ID of the role (required)
   * @param inlineObject2  (required)
   * @return ApiResponse&lt;ScimGroup&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> Successfully added user to group </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ScimGroup> scimV2GroupsGroupIdPatchWithHttpInfo(String groupId, InlineObject2 inlineObject2) throws ApiException {
    Object localVarPostBody = inlineObject2;
    
    // verify the required parameter 'groupId' is set
    if (groupId == null) {
      throw new ApiException(400, "Missing the required parameter 'groupId' when calling scimV2GroupsGroupIdPatch");
    }
    
    // verify the required parameter 'inlineObject2' is set
    if (inlineObject2 == null) {
      throw new ApiException(400, "Missing the required parameter 'inlineObject2' when calling scimV2GroupsGroupIdPatch");
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

    GenericType<ScimGroup> localVarReturnType = new GenericType<ScimGroup>() {};

    return apiClient.invokeAPI("ScimApi.scimV2GroupsGroupIdPatch", localVarPath, "PATCH", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
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
  public ScimGroup scimV2GroupsGroupIdPut(String groupId, ScimGroup scimGroup) throws ApiException {
    return scimV2GroupsGroupIdPutWithHttpInfo(groupId, scimGroup).getData();
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
  public ApiResponse<ScimGroup> scimV2GroupsGroupIdPutWithHttpInfo(String groupId, ScimGroup scimGroup) throws ApiException {
    Object localVarPostBody = scimGroup;
    
    // verify the required parameter 'groupId' is set
    if (groupId == null) {
      throw new ApiException(400, "Missing the required parameter 'groupId' when calling scimV2GroupsGroupIdPut");
    }
    
    // verify the required parameter 'scimGroup' is set
    if (scimGroup == null) {
      throw new ApiException(400, "Missing the required parameter 'scimGroup' when calling scimV2GroupsGroupIdPut");
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

    GenericType<ScimGroup> localVarReturnType = new GenericType<ScimGroup>() {};

    return apiClient.invokeAPI("ScimApi.scimV2GroupsGroupIdPut", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
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
  public ScimGroup scimV2GroupsPost(ScimGroup scimGroup) throws ApiException {
    return scimV2GroupsPostWithHttpInfo(scimGroup).getData();
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
  public ApiResponse<ScimGroup> scimV2GroupsPostWithHttpInfo(ScimGroup scimGroup) throws ApiException {
    Object localVarPostBody = scimGroup;
    
    // verify the required parameter 'scimGroup' is set
    if (scimGroup == null) {
      throw new ApiException(400, "Missing the required parameter 'scimGroup' when calling scimV2GroupsPost");
    }
    
    // create path and map variables
    String localVarPath = "/scim/v2/Groups/";

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

    GenericType<ScimGroup> localVarReturnType = new GenericType<ScimGroup>() {};

    return apiClient.invokeAPI("ScimApi.scimV2GroupsPost", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Retrieves a list of VRS users
   * Retrieves a VRS users
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
  public ScimUserListResponse scimV2UsersGet(Integer count, Integer startIndex) throws ApiException {
    return scimV2UsersGetWithHttpInfo(count, startIndex).getData();
  }

  /**
   * Retrieves a list of VRS users
   * Retrieves a VRS users
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
  public ApiResponse<ScimUserListResponse> scimV2UsersGetWithHttpInfo(Integer count, Integer startIndex) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/scim/v2/Users/";

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

    GenericType<ScimUserListResponse> localVarReturnType = new GenericType<ScimUserListResponse>() {};

    return apiClient.invokeAPI("ScimApi.scimV2UsersGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
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
  public CreatedScimUserJSONResponse scimV2UsersPost(CreateScimUserJSONRequest createScimUserJSONRequest) throws ApiException {
    return scimV2UsersPostWithHttpInfo(createScimUserJSONRequest).getData();
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
  public ApiResponse<CreatedScimUserJSONResponse> scimV2UsersPostWithHttpInfo(CreateScimUserJSONRequest createScimUserJSONRequest) throws ApiException {
    Object localVarPostBody = createScimUserJSONRequest;
    
    // verify the required parameter 'createScimUserJSONRequest' is set
    if (createScimUserJSONRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'createScimUserJSONRequest' when calling scimV2UsersPost");
    }
    
    // create path and map variables
    String localVarPath = "/scim/v2/Users/";

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

    GenericType<CreatedScimUserJSONResponse> localVarReturnType = new GenericType<CreatedScimUserJSONResponse>() {};

    return apiClient.invokeAPI("ScimApi.scimV2UsersPost", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
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
  public void scimV2UsersUserIdDelete(String userId) throws ApiException {
    scimV2UsersUserIdDeleteWithHttpInfo(userId);
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
  public ApiResponse<Void> scimV2UsersUserIdDeleteWithHttpInfo(String userId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling scimV2UsersUserIdDelete");
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

    return apiClient.invokeAPI("ScimApi.scimV2UsersUserIdDelete", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
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
  public ScimUser scimV2UsersUserIdGet(String userId) throws ApiException {
    return scimV2UsersUserIdGetWithHttpInfo(userId).getData();
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
  public ApiResponse<ScimUser> scimV2UsersUserIdGetWithHttpInfo(String userId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling scimV2UsersUserIdGet");
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

    GenericType<ScimUser> localVarReturnType = new GenericType<ScimUser>() {};

    return apiClient.invokeAPI("ScimApi.scimV2UsersUserIdGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Add or remove VRS user attributes
   * Adds or removes VRS user attributes based on the JSON properties
   * @param userId The ID of the user (required)
   * @param inlineObject1  (required)
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
  public ScimUser scimV2UsersUserIdPatch(String userId, InlineObject1 inlineObject1) throws ApiException {
    return scimV2UsersUserIdPatchWithHttpInfo(userId, inlineObject1).getData();
  }

  /**
   * Add or remove VRS user attributes
   * Adds or removes VRS user attributes based on the JSON properties
   * @param userId The ID of the user (required)
   * @param inlineObject1  (required)
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
  public ApiResponse<ScimUser> scimV2UsersUserIdPatchWithHttpInfo(String userId, InlineObject1 inlineObject1) throws ApiException {
    Object localVarPostBody = inlineObject1;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling scimV2UsersUserIdPatch");
    }
    
    // verify the required parameter 'inlineObject1' is set
    if (inlineObject1 == null) {
      throw new ApiException(400, "Missing the required parameter 'inlineObject1' when calling scimV2UsersUserIdPatch");
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

    GenericType<ScimUser> localVarReturnType = new GenericType<ScimUser>() {};

    return apiClient.invokeAPI("ScimApi.scimV2UsersUserIdPatch", localVarPath, "PATCH", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
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
  public ScimUser scimV2UsersUserIdPut(String userId, ScimUser scimUser) throws ApiException {
    return scimV2UsersUserIdPutWithHttpInfo(userId, scimUser).getData();
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
  public ApiResponse<ScimUser> scimV2UsersUserIdPutWithHttpInfo(String userId, ScimUser scimUser) throws ApiException {
    Object localVarPostBody = scimUser;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling scimV2UsersUserIdPut");
    }
    
    // verify the required parameter 'scimUser' is set
    if (scimUser == null) {
      throw new ApiException(400, "Missing the required parameter 'scimUser' when calling scimV2UsersUserIdPut");
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

    GenericType<ScimUser> localVarReturnType = new GenericType<ScimUser>() {};

    return apiClient.invokeAPI("ScimApi.scimV2UsersUserIdPut", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
