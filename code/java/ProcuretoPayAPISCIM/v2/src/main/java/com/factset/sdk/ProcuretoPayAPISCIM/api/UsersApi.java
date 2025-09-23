package com.factset.sdk.ProcuretoPayAPISCIM.api;

import com.factset.sdk.ProcuretoPayAPISCIM.ApiException;
import com.factset.sdk.ProcuretoPayAPISCIM.ApiClient;
import com.factset.sdk.ProcuretoPayAPISCIM.ApiResponse;
import com.factset.sdk.ProcuretoPayAPISCIM.Configuration;
import com.factset.sdk.ProcuretoPayAPISCIM.Pair;

import jakarta.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.ProcuretoPayAPISCIM.models.Error;
import com.factset.sdk.ProcuretoPayAPISCIM.models.InlineResponse429;
import com.factset.sdk.ProcuretoPayAPISCIM.models.Patch;
import com.factset.sdk.ProcuretoPayAPISCIM.models.UserResource;
import com.factset.sdk.ProcuretoPayAPISCIM.models.UserResourceList;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class UsersApi {
  private ApiClient apiClient;

  public UsersApi() {
    this(Configuration.getDefaultApiClient());
  }

  public UsersApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> createUserResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    createUserResponseTypeMap.put(201, new GenericType<UserResource>(){});
    createUserResponseTypeMap.put(400, new GenericType<Error>(){});
    createUserResponseTypeMap.put(401, new GenericType<Error>(){});
    createUserResponseTypeMap.put(403, new GenericType<Error>(){});
    createUserResponseTypeMap.put(429, new GenericType<InlineResponse429>(){});
    createUserResponseTypeMap.put(500, new GenericType<Error>(){});
  }

  private static final Map<Integer, GenericType> deleteUserResponseTypeMap = new HashMap<Integer, GenericType>();

  private static final Map<Integer, GenericType> getUserResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getUserResponseTypeMap.put(200, new GenericType<UserResource>(){});
    getUserResponseTypeMap.put(401, new GenericType<Error>(){});
    getUserResponseTypeMap.put(403, new GenericType<Error>(){});
    getUserResponseTypeMap.put(404, new GenericType<Error>(){});
    getUserResponseTypeMap.put(429, new GenericType<InlineResponse429>(){});
    getUserResponseTypeMap.put(500, new GenericType<Error>(){});
  }

  private static final Map<Integer, GenericType> getUsersResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getUsersResponseTypeMap.put(200, new GenericType<UserResourceList>(){});
    getUsersResponseTypeMap.put(400, new GenericType<Error>(){});
    getUsersResponseTypeMap.put(401, new GenericType<Error>(){});
    getUsersResponseTypeMap.put(403, new GenericType<Error>(){});
    getUsersResponseTypeMap.put(429, new GenericType<InlineResponse429>(){});
    getUsersResponseTypeMap.put(500, new GenericType<Error>(){});
  }

  private static final Map<Integer, GenericType> modifyUserResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    modifyUserResponseTypeMap.put(200, new GenericType<UserResource>(){});
    modifyUserResponseTypeMap.put(400, new GenericType<Error>(){});
    modifyUserResponseTypeMap.put(401, new GenericType<Error>(){});
    modifyUserResponseTypeMap.put(403, new GenericType<Error>(){});
    modifyUserResponseTypeMap.put(429, new GenericType<InlineResponse429>(){});
    modifyUserResponseTypeMap.put(500, new GenericType<Error>(){});
    modifyUserResponseTypeMap.put(501, new GenericType<Error>(){});
  }

  private static final Map<Integer, GenericType> replaceUserResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    replaceUserResponseTypeMap.put(200, new GenericType<UserResource>(){});
    replaceUserResponseTypeMap.put(400, new GenericType<Error>(){});
    replaceUserResponseTypeMap.put(401, new GenericType<Error>(){});
    replaceUserResponseTypeMap.put(403, new GenericType<Error>(){});
    replaceUserResponseTypeMap.put(404, new GenericType<Error>(){});
    replaceUserResponseTypeMap.put(429, new GenericType<InlineResponse429>(){});
    replaceUserResponseTypeMap.put(500, new GenericType<Error>(){});
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
   * Create a user.
   * Create a user resource.
   * @param userResource User resource. (required)
   * @param attributes Attribute whitelist filter string. A comma-separated list of resource attribute names to be returned in the response, overriding the set of attributes that would be returned by default. Attribute names must be specified in standard attribute notation (see [RFC 7644 section 3.10](https://datatracker.ietf.org/doc/html/rfc7644#section-3.10).) This parameter cannot be used with the *excludedAttributes* or *additionalAttributes* parameters. (optional)
   * @param excludedAttributes Attribute blacklist filter string. A comma-separated list of resource attribute names to be excluded in the response, overriding the set of attributes that would be returned by default. Attribute names must be specified in standard attribute notation (see [RFC 7644 section 3.10](https://datatracker.ietf.org/doc/html/rfc7644#section-3.10).) This parameter cannot be used with the *attributes* or *additionalAttributes* parameters. (optional)
   * @param additionalAttributes Non-standard attribute filter string. A comma-separated list of resource attribute names to be included in the response, complementing the set of attributes that would be returned by default. Attribute names must be specified in standard attribute notation (see [RFC 7644 section 3.10](https://datatracker.ietf.org/doc/html/rfc7644#section-3.10).) This parameter cannot be used with the *attributes* or *excludedAttributes* parameters. (optional)
   * @return UserResource
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Success. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Provided resource contains invalid data. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> User has not been authenticated. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> User is not authorized to use this API. </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> User is accessing this API too frequently. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal server error. </td><td>  -  </td></tr>
     </table>
   */
  public UserResource createUser(UserResource userResource, java.util.List<String> attributes, java.util.List<String> excludedAttributes, java.util.List<String> additionalAttributes) throws ApiException {
    return createUserWithHttpInfo(userResource, attributes, excludedAttributes, additionalAttributes).getData();
  }

  /**
   * Create a user.
   * Create a user resource.
   * @param userResource User resource. (required)
   * @param attributes Attribute whitelist filter string. A comma-separated list of resource attribute names to be returned in the response, overriding the set of attributes that would be returned by default. Attribute names must be specified in standard attribute notation (see [RFC 7644 section 3.10](https://datatracker.ietf.org/doc/html/rfc7644#section-3.10).) This parameter cannot be used with the *excludedAttributes* or *additionalAttributes* parameters. (optional)
   * @param excludedAttributes Attribute blacklist filter string. A comma-separated list of resource attribute names to be excluded in the response, overriding the set of attributes that would be returned by default. Attribute names must be specified in standard attribute notation (see [RFC 7644 section 3.10](https://datatracker.ietf.org/doc/html/rfc7644#section-3.10).) This parameter cannot be used with the *attributes* or *additionalAttributes* parameters. (optional)
   * @param additionalAttributes Non-standard attribute filter string. A comma-separated list of resource attribute names to be included in the response, complementing the set of attributes that would be returned by default. Attribute names must be specified in standard attribute notation (see [RFC 7644 section 3.10](https://datatracker.ietf.org/doc/html/rfc7644#section-3.10).) This parameter cannot be used with the *attributes* or *excludedAttributes* parameters. (optional)
   * @return ApiResponse&lt;UserResource&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Success. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Provided resource contains invalid data. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> User has not been authenticated. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> User is not authorized to use this API. </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> User is accessing this API too frequently. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal server error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<UserResource> createUserWithHttpInfo(UserResource userResource, java.util.List<String> attributes, java.util.List<String> excludedAttributes, java.util.List<String> additionalAttributes) throws ApiException {
    Object localVarPostBody = userResource;
    
    // verify the required parameter 'userResource' is set
    if (userResource == null) {
      throw new ApiException(400, "Missing the required parameter 'userResource' when calling createUser");
    }
    
    // create path and map variables
    String localVarPath = "/Users";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "attributes", attributes));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "excludedAttributes", excludedAttributes));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "additionalAttributes", additionalAttributes));

    
    
    
    final String[] localVarAccepts = {
      "application/scim+json", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/scim+json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        UserResource
      
    > apiResponse = apiClient.invokeAPI("UsersApi.createUser", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, createUserResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Delete a user.
   * Delete a specific user resource.
   * @param id ID of resource. (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> User successfully deleted. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> User has not been authenticated. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> User is not authorized to use this API. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> User not found. </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> User is accessing this API too frequently. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal server error. </td><td>  -  </td></tr>
     </table>
   */
  public void deleteUser(String id) throws ApiException {
    deleteUserWithHttpInfo(id);
  }

  /**
   * Delete a user.
   * Delete a specific user resource.
   * @param id ID of resource. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> User successfully deleted. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> User has not been authenticated. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> User is not authorized to use this API. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> User not found. </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> User is accessing this API too frequently. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal server error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> deleteUserWithHttpInfo(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteUser");
    }
    
    // create path and map variables
    String localVarPath = "/Users/{id}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/scim+json", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
      Void
    > apiResponse = apiClient.invokeAPI("UsersApi.deleteUser", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, deleteUserResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Get a user.
   * Get a specific user resource.
   * @param id ID of resource. (required)
   * @param attributes Attribute whitelist filter string. A comma-separated list of resource attribute names to be returned in the response, overriding the set of attributes that would be returned by default. Attribute names must be specified in standard attribute notation (see [RFC 7644 section 3.10](https://datatracker.ietf.org/doc/html/rfc7644#section-3.10).) This parameter cannot be used with the *excludedAttributes* or *additionalAttributes* parameters. (optional)
   * @param excludedAttributes Attribute blacklist filter string. A comma-separated list of resource attribute names to be excluded in the response, overriding the set of attributes that would be returned by default. Attribute names must be specified in standard attribute notation (see [RFC 7644 section 3.10](https://datatracker.ietf.org/doc/html/rfc7644#section-3.10).) This parameter cannot be used with the *attributes* or *additionalAttributes* parameters. (optional)
   * @param additionalAttributes Non-standard attribute filter string. A comma-separated list of resource attribute names to be included in the response, complementing the set of attributes that would be returned by default. Attribute names must be specified in standard attribute notation (see [RFC 7644 section 3.10](https://datatracker.ietf.org/doc/html/rfc7644#section-3.10).) This parameter cannot be used with the *attributes* or *excludedAttributes* parameters. (optional)
   * @return UserResource
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> User has not been authenticated. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> User is not authorized to use this API. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> User not found. </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> User is accessing this API too frequently. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal server error. </td><td>  -  </td></tr>
     </table>
   */
  public UserResource getUser(String id, java.util.List<String> attributes, java.util.List<String> excludedAttributes, java.util.List<String> additionalAttributes) throws ApiException {
    return getUserWithHttpInfo(id, attributes, excludedAttributes, additionalAttributes).getData();
  }

  /**
   * Get a user.
   * Get a specific user resource.
   * @param id ID of resource. (required)
   * @param attributes Attribute whitelist filter string. A comma-separated list of resource attribute names to be returned in the response, overriding the set of attributes that would be returned by default. Attribute names must be specified in standard attribute notation (see [RFC 7644 section 3.10](https://datatracker.ietf.org/doc/html/rfc7644#section-3.10).) This parameter cannot be used with the *excludedAttributes* or *additionalAttributes* parameters. (optional)
   * @param excludedAttributes Attribute blacklist filter string. A comma-separated list of resource attribute names to be excluded in the response, overriding the set of attributes that would be returned by default. Attribute names must be specified in standard attribute notation (see [RFC 7644 section 3.10](https://datatracker.ietf.org/doc/html/rfc7644#section-3.10).) This parameter cannot be used with the *attributes* or *additionalAttributes* parameters. (optional)
   * @param additionalAttributes Non-standard attribute filter string. A comma-separated list of resource attribute names to be included in the response, complementing the set of attributes that would be returned by default. Attribute names must be specified in standard attribute notation (see [RFC 7644 section 3.10](https://datatracker.ietf.org/doc/html/rfc7644#section-3.10).) This parameter cannot be used with the *attributes* or *excludedAttributes* parameters. (optional)
   * @return ApiResponse&lt;UserResource&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> User has not been authenticated. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> User is not authorized to use this API. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> User not found. </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> User is accessing this API too frequently. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal server error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<UserResource> getUserWithHttpInfo(String id, java.util.List<String> attributes, java.util.List<String> excludedAttributes, java.util.List<String> additionalAttributes) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getUser");
    }
    
    // create path and map variables
    String localVarPath = "/Users/{id}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "attributes", attributes));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "excludedAttributes", excludedAttributes));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "additionalAttributes", additionalAttributes));

    
    
    
    final String[] localVarAccepts = {
      "application/scim+json", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        UserResource
      
    > apiResponse = apiClient.invokeAPI("UsersApi.getUser", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getUserResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Get a list of users.
   * Get a list of user resources.
   * @param filter Resource filter string. See [RFC 7644 section 3.4.2.2](https://tools.ietf.org/html/rfc7644#section-3.4.2.2) for syntax. Note this API implementation also supports a non-standard \&quot;re\&quot; operator for regular expression matching against string attributes. When using the \&quot;re\&quot; operator, do not include slash characters as delimiters (e.g. use \&quot;foo\&quot; instead of \&quot;/foo/\&quot;.) Also note the case-sensitivity of the regular expression corresponds to the \&quot;caseExact\&quot; characteristic of the target attribute. (optional)
   * @param sortBy Attribute to be used for sorting resources. See [RFC 7644 section 3.4.2.3](https://tools.ietf.org/html/rfc7644#section-3.4.2.3). The attribute name must be specified in standard attribute notation (see [RFC 7644 section 3.10](https://datatracker.ietf.org/doc/html/rfc7644#section-3.10).) Use the *sortOrder* parameter to specify whether resources should be sorted in ascending or descending order. (optional)
   * @param sortOrder The order by which resources are to be sorted. See [RFC 7644 section 3.4.2.3](https://tools.ietf.org/html/rfc7644#section-3.4.2.3). Valid values are &#39;&#39;ascending&#39;&#39; (the default value) or &#39;&#39;descending&#39;&#39;. This parameter may not be used unless the *sortBy* parameter is also specified. (optional)
   * @param startIndex Result start index. The one-based index of the first result to be returned in the list of resources. For example, to exclude the first two resources, use a *startIndex* value of 3. This parameter has a default value of 1. This index applies *after* any resource filtration has been applied as specified by the *filter* argument. (optional)
   * @param count Maximum resource count. The server will not return more resources than this value, although it may return fewer. (optional)
   * @param attributes Attribute whitelist filter string. A comma-separated list of resource attribute names to be returned in the response, overriding the set of attributes that would be returned by default. Attribute names must be specified in standard attribute notation (see [RFC 7644 section 3.10](https://datatracker.ietf.org/doc/html/rfc7644#section-3.10).) This parameter cannot be used with the *excludedAttributes* or *additionalAttributes* parameters. (optional)
   * @param excludedAttributes Attribute blacklist filter string. A comma-separated list of resource attribute names to be excluded in the response, overriding the set of attributes that would be returned by default. Attribute names must be specified in standard attribute notation (see [RFC 7644 section 3.10](https://datatracker.ietf.org/doc/html/rfc7644#section-3.10).) This parameter cannot be used with the *attributes* or *additionalAttributes* parameters. (optional)
   * @param additionalAttributes Non-standard attribute filter string. A comma-separated list of resource attribute names to be included in the response, complementing the set of attributes that would be returned by default. Attribute names must be specified in standard attribute notation (see [RFC 7644 section 3.10](https://datatracker.ietf.org/doc/html/rfc7644#section-3.10).) This parameter cannot be used with the *attributes* or *excludedAttributes* parameters. (optional)
   * @return UserResourceList
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Invalid filter value provided. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> User has not been authenticated. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> User is not authorized to use this API. </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> User is accessing this API too frequently. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal server error. </td><td>  -  </td></tr>
     </table>
   */
  public UserResourceList getUsers(String filter, String sortBy, String sortOrder, Integer startIndex, Integer count, java.util.List<String> attributes, java.util.List<String> excludedAttributes, java.util.List<String> additionalAttributes) throws ApiException {
    return getUsersWithHttpInfo(filter, sortBy, sortOrder, startIndex, count, attributes, excludedAttributes, additionalAttributes).getData();
  }

  /**
   * Get a list of users.
   * Get a list of user resources.
   * @param filter Resource filter string. See [RFC 7644 section 3.4.2.2](https://tools.ietf.org/html/rfc7644#section-3.4.2.2) for syntax. Note this API implementation also supports a non-standard \&quot;re\&quot; operator for regular expression matching against string attributes. When using the \&quot;re\&quot; operator, do not include slash characters as delimiters (e.g. use \&quot;foo\&quot; instead of \&quot;/foo/\&quot;.) Also note the case-sensitivity of the regular expression corresponds to the \&quot;caseExact\&quot; characteristic of the target attribute. (optional)
   * @param sortBy Attribute to be used for sorting resources. See [RFC 7644 section 3.4.2.3](https://tools.ietf.org/html/rfc7644#section-3.4.2.3). The attribute name must be specified in standard attribute notation (see [RFC 7644 section 3.10](https://datatracker.ietf.org/doc/html/rfc7644#section-3.10).) Use the *sortOrder* parameter to specify whether resources should be sorted in ascending or descending order. (optional)
   * @param sortOrder The order by which resources are to be sorted. See [RFC 7644 section 3.4.2.3](https://tools.ietf.org/html/rfc7644#section-3.4.2.3). Valid values are &#39;&#39;ascending&#39;&#39; (the default value) or &#39;&#39;descending&#39;&#39;. This parameter may not be used unless the *sortBy* parameter is also specified. (optional)
   * @param startIndex Result start index. The one-based index of the first result to be returned in the list of resources. For example, to exclude the first two resources, use a *startIndex* value of 3. This parameter has a default value of 1. This index applies *after* any resource filtration has been applied as specified by the *filter* argument. (optional)
   * @param count Maximum resource count. The server will not return more resources than this value, although it may return fewer. (optional)
   * @param attributes Attribute whitelist filter string. A comma-separated list of resource attribute names to be returned in the response, overriding the set of attributes that would be returned by default. Attribute names must be specified in standard attribute notation (see [RFC 7644 section 3.10](https://datatracker.ietf.org/doc/html/rfc7644#section-3.10).) This parameter cannot be used with the *excludedAttributes* or *additionalAttributes* parameters. (optional)
   * @param excludedAttributes Attribute blacklist filter string. A comma-separated list of resource attribute names to be excluded in the response, overriding the set of attributes that would be returned by default. Attribute names must be specified in standard attribute notation (see [RFC 7644 section 3.10](https://datatracker.ietf.org/doc/html/rfc7644#section-3.10).) This parameter cannot be used with the *attributes* or *additionalAttributes* parameters. (optional)
   * @param additionalAttributes Non-standard attribute filter string. A comma-separated list of resource attribute names to be included in the response, complementing the set of attributes that would be returned by default. Attribute names must be specified in standard attribute notation (see [RFC 7644 section 3.10](https://datatracker.ietf.org/doc/html/rfc7644#section-3.10).) This parameter cannot be used with the *attributes* or *excludedAttributes* parameters. (optional)
   * @return ApiResponse&lt;UserResourceList&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Invalid filter value provided. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> User has not been authenticated. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> User is not authorized to use this API. </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> User is accessing this API too frequently. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal server error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<UserResourceList> getUsersWithHttpInfo(String filter, String sortBy, String sortOrder, Integer startIndex, Integer count, java.util.List<String> attributes, java.util.List<String> excludedAttributes, java.util.List<String> additionalAttributes) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/Users";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter", filter));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sortBy", sortBy));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sortOrder", sortOrder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startIndex", startIndex));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "count", count));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "attributes", attributes));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "excludedAttributes", excludedAttributes));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "additionalAttributes", additionalAttributes));

    
    
    
    final String[] localVarAccepts = {
      "application/scim+json", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        UserResourceList
      
    > apiResponse = apiClient.invokeAPI("UsersApi.getUsers", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getUsersResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Patch a user.
   * Modify a specific user resource (i.e. add, replace, or remove attributes of a user resource.)
   * @param id ID of resource. (required)
   * @param attributes Attribute whitelist filter string. A comma-separated list of resource attribute names to be returned in the response, overriding the set of attributes that would be returned by default. Attribute names must be specified in standard attribute notation (see [RFC 7644 section 3.10](https://datatracker.ietf.org/doc/html/rfc7644#section-3.10).) This parameter cannot be used with the *excludedAttributes* or *additionalAttributes* parameters. (optional)
   * @param excludedAttributes Attribute blacklist filter string. A comma-separated list of resource attribute names to be excluded in the response, overriding the set of attributes that would be returned by default. Attribute names must be specified in standard attribute notation (see [RFC 7644 section 3.10](https://datatracker.ietf.org/doc/html/rfc7644#section-3.10).) This parameter cannot be used with the *attributes* or *additionalAttributes* parameters. (optional)
   * @param additionalAttributes Non-standard attribute filter string. A comma-separated list of resource attribute names to be included in the response, complementing the set of attributes that would be returned by default. Attribute names must be specified in standard attribute notation (see [RFC 7644 section 3.10](https://datatracker.ietf.org/doc/html/rfc7644#section-3.10).) This parameter cannot be used with the *attributes* or *excludedAttributes* parameters. (optional)
   * @param patch  (optional)
   * @return UserResource
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Patch request invalid. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> User has not been authenticated. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> User is not authorized to use this API. </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> User is accessing this API too frequently. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal server error. </td><td>  -  </td></tr>
       <tr><td> 501 </td><td> Operation is not supported. </td><td>  -  </td></tr>
     </table>
   */
  public UserResource modifyUser(String id, java.util.List<String> attributes, java.util.List<String> excludedAttributes, java.util.List<String> additionalAttributes, Patch patch) throws ApiException {
    return modifyUserWithHttpInfo(id, attributes, excludedAttributes, additionalAttributes, patch).getData();
  }

  /**
   * Patch a user.
   * Modify a specific user resource (i.e. add, replace, or remove attributes of a user resource.)
   * @param id ID of resource. (required)
   * @param attributes Attribute whitelist filter string. A comma-separated list of resource attribute names to be returned in the response, overriding the set of attributes that would be returned by default. Attribute names must be specified in standard attribute notation (see [RFC 7644 section 3.10](https://datatracker.ietf.org/doc/html/rfc7644#section-3.10).) This parameter cannot be used with the *excludedAttributes* or *additionalAttributes* parameters. (optional)
   * @param excludedAttributes Attribute blacklist filter string. A comma-separated list of resource attribute names to be excluded in the response, overriding the set of attributes that would be returned by default. Attribute names must be specified in standard attribute notation (see [RFC 7644 section 3.10](https://datatracker.ietf.org/doc/html/rfc7644#section-3.10).) This parameter cannot be used with the *attributes* or *additionalAttributes* parameters. (optional)
   * @param additionalAttributes Non-standard attribute filter string. A comma-separated list of resource attribute names to be included in the response, complementing the set of attributes that would be returned by default. Attribute names must be specified in standard attribute notation (see [RFC 7644 section 3.10](https://datatracker.ietf.org/doc/html/rfc7644#section-3.10).) This parameter cannot be used with the *attributes* or *excludedAttributes* parameters. (optional)
   * @param patch  (optional)
   * @return ApiResponse&lt;UserResource&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Patch request invalid. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> User has not been authenticated. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> User is not authorized to use this API. </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> User is accessing this API too frequently. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal server error. </td><td>  -  </td></tr>
       <tr><td> 501 </td><td> Operation is not supported. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<UserResource> modifyUserWithHttpInfo(String id, java.util.List<String> attributes, java.util.List<String> excludedAttributes, java.util.List<String> additionalAttributes, Patch patch) throws ApiException {
    Object localVarPostBody = patch;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling modifyUser");
    }
    
    // create path and map variables
    String localVarPath = "/Users/{id}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "attributes", attributes));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "excludedAttributes", excludedAttributes));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "additionalAttributes", additionalAttributes));

    
    
    
    final String[] localVarAccepts = {
      "application/scim+json", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/scim+json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        UserResource
      
    > apiResponse = apiClient.invokeAPI("UsersApi.modifyUser", localVarPath, "PATCH", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, modifyUserResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Replace a user.
   * Replace a specific user resource with another provided user resource.
   * @param id ID of resource. (required)
   * @param userResource User resource. (required)
   * @param attributes Attribute whitelist filter string. A comma-separated list of resource attribute names to be returned in the response, overriding the set of attributes that would be returned by default. Attribute names must be specified in standard attribute notation (see [RFC 7644 section 3.10](https://datatracker.ietf.org/doc/html/rfc7644#section-3.10).) This parameter cannot be used with the *excludedAttributes* or *additionalAttributes* parameters. (optional)
   * @param excludedAttributes Attribute blacklist filter string. A comma-separated list of resource attribute names to be excluded in the response, overriding the set of attributes that would be returned by default. Attribute names must be specified in standard attribute notation (see [RFC 7644 section 3.10](https://datatracker.ietf.org/doc/html/rfc7644#section-3.10).) This parameter cannot be used with the *attributes* or *additionalAttributes* parameters. (optional)
   * @param additionalAttributes Non-standard attribute filter string. A comma-separated list of resource attribute names to be included in the response, complementing the set of attributes that would be returned by default. Attribute names must be specified in standard attribute notation (see [RFC 7644 section 3.10](https://datatracker.ietf.org/doc/html/rfc7644#section-3.10).) This parameter cannot be used with the *attributes* or *excludedAttributes* parameters. (optional)
   * @return UserResource
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Provided resource contains invalid data. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> User has not been authenticated. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> User is not authorized to use this API. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> User not found. </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> User is accessing this API too frequently. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal server error. </td><td>  -  </td></tr>
     </table>
   */
  public UserResource replaceUser(String id, UserResource userResource, java.util.List<String> attributes, java.util.List<String> excludedAttributes, java.util.List<String> additionalAttributes) throws ApiException {
    return replaceUserWithHttpInfo(id, userResource, attributes, excludedAttributes, additionalAttributes).getData();
  }

  /**
   * Replace a user.
   * Replace a specific user resource with another provided user resource.
   * @param id ID of resource. (required)
   * @param userResource User resource. (required)
   * @param attributes Attribute whitelist filter string. A comma-separated list of resource attribute names to be returned in the response, overriding the set of attributes that would be returned by default. Attribute names must be specified in standard attribute notation (see [RFC 7644 section 3.10](https://datatracker.ietf.org/doc/html/rfc7644#section-3.10).) This parameter cannot be used with the *excludedAttributes* or *additionalAttributes* parameters. (optional)
   * @param excludedAttributes Attribute blacklist filter string. A comma-separated list of resource attribute names to be excluded in the response, overriding the set of attributes that would be returned by default. Attribute names must be specified in standard attribute notation (see [RFC 7644 section 3.10](https://datatracker.ietf.org/doc/html/rfc7644#section-3.10).) This parameter cannot be used with the *attributes* or *additionalAttributes* parameters. (optional)
   * @param additionalAttributes Non-standard attribute filter string. A comma-separated list of resource attribute names to be included in the response, complementing the set of attributes that would be returned by default. Attribute names must be specified in standard attribute notation (see [RFC 7644 section 3.10](https://datatracker.ietf.org/doc/html/rfc7644#section-3.10).) This parameter cannot be used with the *attributes* or *excludedAttributes* parameters. (optional)
   * @return ApiResponse&lt;UserResource&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Provided resource contains invalid data. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> User has not been authenticated. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> User is not authorized to use this API. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> User not found. </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> User is accessing this API too frequently. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal server error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<UserResource> replaceUserWithHttpInfo(String id, UserResource userResource, java.util.List<String> attributes, java.util.List<String> excludedAttributes, java.util.List<String> additionalAttributes) throws ApiException {
    Object localVarPostBody = userResource;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling replaceUser");
    }
    
    // verify the required parameter 'userResource' is set
    if (userResource == null) {
      throw new ApiException(400, "Missing the required parameter 'userResource' when calling replaceUser");
    }
    
    // create path and map variables
    String localVarPath = "/Users/{id}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "attributes", attributes));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "excludedAttributes", excludedAttributes));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "additionalAttributes", additionalAttributes));

    
    
    
    final String[] localVarAccepts = {
      "application/scim+json", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/scim+json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        UserResource
      
    > apiResponse = apiClient.invokeAPI("UsersApi.replaceUser", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, replaceUserResponseTypeMap, false);

    return apiResponse;

  }
}
