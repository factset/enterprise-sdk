package com.factset.sdk.ProcuretoPayAPISCIM.api;

import com.factset.sdk.ProcuretoPayAPISCIM.ApiException;
import com.factset.sdk.ProcuretoPayAPISCIM.ApiClient;
import com.factset.sdk.ProcuretoPayAPISCIM.ApiResponse;
import com.factset.sdk.ProcuretoPayAPISCIM.Configuration;
import com.factset.sdk.ProcuretoPayAPISCIM.Pair;

import javax.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.ProcuretoPayAPISCIM.models.Error;
import com.factset.sdk.ProcuretoPayAPISCIM.models.Patch;
import com.factset.sdk.ProcuretoPayAPISCIM.models.VermilionUserResource;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class VermilionUsersApi {
  private ApiClient apiClient;

  public VermilionUsersApi() {
    this(Configuration.getDefaultApiClient());
  }

  public VermilionUsersApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

    private static final Map<Integer, GenericType> vermilionUsersGetResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    vermilionUsersGetResponseTypeMap.put(200, new GenericType<VermilionUserResource>(){});
    vermilionUsersGetResponseTypeMap.put(400, new GenericType<Error>(){});
    vermilionUsersGetResponseTypeMap.put(401, new GenericType<Error>(){});
    vermilionUsersGetResponseTypeMap.put(403, new GenericType<Error>(){});
    vermilionUsersGetResponseTypeMap.put(500, new GenericType<Error>(){});
  }
  private static final Map<Integer, GenericType> vermilionUsersIdDeleteResponseTypeMap = new HashMap<Integer, GenericType>();
  private static final Map<Integer, GenericType> vermilionUsersIdGetResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    vermilionUsersIdGetResponseTypeMap.put(200, new GenericType<VermilionUserResource>(){});
    vermilionUsersIdGetResponseTypeMap.put(401, new GenericType<Error>(){});
    vermilionUsersIdGetResponseTypeMap.put(403, new GenericType<Error>(){});
    vermilionUsersIdGetResponseTypeMap.put(404, new GenericType<Error>(){});
    vermilionUsersIdGetResponseTypeMap.put(500, new GenericType<Error>(){});
  }
  private static final Map<Integer, GenericType> vermilionUsersIdPatchResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    vermilionUsersIdPatchResponseTypeMap.put(200, new GenericType<VermilionUserResource>(){});
    vermilionUsersIdPatchResponseTypeMap.put(400, new GenericType<Error>(){});
    vermilionUsersIdPatchResponseTypeMap.put(401, new GenericType<Error>(){});
    vermilionUsersIdPatchResponseTypeMap.put(403, new GenericType<Error>(){});
    vermilionUsersIdPatchResponseTypeMap.put(500, new GenericType<Error>(){});
  }
  private static final Map<Integer, GenericType> vermilionUsersIdPutResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    vermilionUsersIdPutResponseTypeMap.put(200, new GenericType<VermilionUserResource>(){});
    vermilionUsersIdPutResponseTypeMap.put(400, new GenericType<Error>(){});
    vermilionUsersIdPutResponseTypeMap.put(401, new GenericType<Error>(){});
    vermilionUsersIdPutResponseTypeMap.put(403, new GenericType<Error>(){});
    vermilionUsersIdPutResponseTypeMap.put(404, new GenericType<Error>(){});
    vermilionUsersIdPutResponseTypeMap.put(500, new GenericType<Error>(){});
  }
  private static final Map<Integer, GenericType> vermilionUsersPostResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    vermilionUsersPostResponseTypeMap.put(201, new GenericType<VermilionUserResource>(){});
    vermilionUsersPostResponseTypeMap.put(400, new GenericType<Error>(){});
    vermilionUsersPostResponseTypeMap.put(401, new GenericType<Error>(){});
    vermilionUsersPostResponseTypeMap.put(403, new GenericType<Error>(){});
    vermilionUsersPostResponseTypeMap.put(500, new GenericType<Error>(){});
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
   * Get a list of Vermilion users.
   * 
   * @param filter Resource filter string. See [RFC 7644 section 3.4.2.2](https://tools.ietf.org/html/rfc7644#section-3.4.2.2) for syntax. Note this API implementation also supports a non-standard \&quot;re\&quot; operator for regular expression matching against strings. (optional)
   * @param startIndex Result start index. The one-based index of the first result to be returned in the list of resources. For example, to exclude the first two resources, use a *startIndex* value of 3. This parameter has a default value of 1. This index applies *after* any resource filtration has been applied as specified by the *filter* argument. (optional)
   * @param count Maximum resource count. The server will not return more resources than this value, although it may return fewer. (optional)
   * @param attributes Attribute whitelist filter string. A comma-separated list of resource attribute names to be returned in the response, overriding the set of attributes that would be returned by default. Attribute names must be specified in standard attribute notation (see [RFC 7644 section 3.10](https://datatracker.ietf.org/doc/html/rfc7644#section-3.10).) This parameter cannot be used with the *excludedAttributes* parameter. (optional)
   * @param excludedAttributes Attribute blacklist filter string. A comma-separated list of resource attribute names to be excluded in the response, overriding the set of attributes that would be returned by default. Attribute names must be specified in standard attribute notation (see [RFC 7644 section 3.10](https://datatracker.ietf.org/doc/html/rfc7644#section-3.10).) This parameter cannot be used with the *attributes* parameter. (optional)
   * @return VermilionUserResource
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Invalid filter value provided. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> User has not been authenticated. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> User is not authorized to use this API. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal server error. </td><td>  -  </td></tr>
     </table>
   */
  public VermilionUserResource vermilionUsersGet(String filter, Integer startIndex, Integer count, String attributes, String excludedAttributes) throws ApiException {
    return vermilionUsersGetWithHttpInfo(filter, startIndex, count, attributes, excludedAttributes).getData();
  }

  /**
   * Get a list of Vermilion users.
   * 
   * @param filter Resource filter string. See [RFC 7644 section 3.4.2.2](https://tools.ietf.org/html/rfc7644#section-3.4.2.2) for syntax. Note this API implementation also supports a non-standard \&quot;re\&quot; operator for regular expression matching against strings. (optional)
   * @param startIndex Result start index. The one-based index of the first result to be returned in the list of resources. For example, to exclude the first two resources, use a *startIndex* value of 3. This parameter has a default value of 1. This index applies *after* any resource filtration has been applied as specified by the *filter* argument. (optional)
   * @param count Maximum resource count. The server will not return more resources than this value, although it may return fewer. (optional)
   * @param attributes Attribute whitelist filter string. A comma-separated list of resource attribute names to be returned in the response, overriding the set of attributes that would be returned by default. Attribute names must be specified in standard attribute notation (see [RFC 7644 section 3.10](https://datatracker.ietf.org/doc/html/rfc7644#section-3.10).) This parameter cannot be used with the *excludedAttributes* parameter. (optional)
   * @param excludedAttributes Attribute blacklist filter string. A comma-separated list of resource attribute names to be excluded in the response, overriding the set of attributes that would be returned by default. Attribute names must be specified in standard attribute notation (see [RFC 7644 section 3.10](https://datatracker.ietf.org/doc/html/rfc7644#section-3.10).) This parameter cannot be used with the *attributes* parameter. (optional)
   * @return ApiResponse&lt;VermilionUserResource&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Invalid filter value provided. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> User has not been authenticated. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> User is not authorized to use this API. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal server error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<VermilionUserResource> vermilionUsersGetWithHttpInfo(String filter, Integer startIndex, Integer count, String attributes, String excludedAttributes) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/VermilionUsers";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter", filter));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startIndex", startIndex));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "count", count));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "attributes", attributes));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "excludedAttributes", excludedAttributes));

    
    
    
    final String[] localVarAccepts = {
      "application/scim+json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        VermilionUserResource
      
    > apiResponse = apiClient.invokeAPI("VermilionUsersApi.vermilionUsersGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, vermilionUsersGetResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Delete a Vermilion user.
   * 
   * @param id ID of resource. (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> User successfully deleted. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> User has not been authenticated. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> User is not authorized to use this API. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Vermilion user not found. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal server error. </td><td>  -  </td></tr>
     </table>
   */
  public void vermilionUsersIdDelete(String id) throws ApiException {
    vermilionUsersIdDeleteWithHttpInfo(id);
  }

  /**
   * Delete a Vermilion user.
   * 
   * @param id ID of resource. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> User successfully deleted. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> User has not been authenticated. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> User is not authorized to use this API. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Vermilion user not found. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal server error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> vermilionUsersIdDeleteWithHttpInfo(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling vermilionUsersIdDelete");
    }
    
    // create path and map variables
    String localVarPath = "/VermilionUsers/{id}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

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
    > apiResponse = apiClient.invokeAPI("VermilionUsersApi.vermilionUsersIdDelete", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, vermilionUsersIdDeleteResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Get a Vermilion user.
   * 
   * @param id ID of resource. (required)
   * @return VermilionUserResource
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> User has not been authenticated. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> User is not authorized to use this API. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> User not found. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal server error. </td><td>  -  </td></tr>
     </table>
   */
  public VermilionUserResource vermilionUsersIdGet(String id) throws ApiException {
    return vermilionUsersIdGetWithHttpInfo(id).getData();
  }

  /**
   * Get a Vermilion user.
   * 
   * @param id ID of resource. (required)
   * @return ApiResponse&lt;VermilionUserResource&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> User has not been authenticated. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> User is not authorized to use this API. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> User not found. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal server error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<VermilionUserResource> vermilionUsersIdGetWithHttpInfo(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling vermilionUsersIdGet");
    }
    
    // create path and map variables
    String localVarPath = "/VermilionUsers/{id}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

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
        
        VermilionUserResource
      
    > apiResponse = apiClient.invokeAPI("VermilionUsersApi.vermilionUsersIdGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, vermilionUsersIdGetResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Patch a Vermilion user (add, replace, or remove attributes of a Vermilion user.)
   * 
   * @param id ID of resource. (required)
   * @param patch  (optional)
   * @return VermilionUserResource
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Patch request invalid. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> User has not been authenticated. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> User is not authorized to use this API. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal server error. </td><td>  -  </td></tr>
     </table>
   */
  public VermilionUserResource vermilionUsersIdPatch(String id, Patch patch) throws ApiException {
    return vermilionUsersIdPatchWithHttpInfo(id, patch).getData();
  }

  /**
   * Patch a Vermilion user (add, replace, or remove attributes of a Vermilion user.)
   * 
   * @param id ID of resource. (required)
   * @param patch  (optional)
   * @return ApiResponse&lt;VermilionUserResource&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Patch request invalid. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> User has not been authenticated. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> User is not authorized to use this API. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal server error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<VermilionUserResource> vermilionUsersIdPatchWithHttpInfo(String id, Patch patch) throws ApiException {
    Object localVarPostBody = patch;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling vermilionUsersIdPatch");
    }
    
    // create path and map variables
    String localVarPath = "/VermilionUsers/{id}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

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
        
        VermilionUserResource
      
    > apiResponse = apiClient.invokeAPI("VermilionUsersApi.vermilionUsersIdPatch", localVarPath, "PATCH", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, vermilionUsersIdPatchResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Replace a Vermilion user.
   * 
   * @param id ID of resource. (required)
   * @param vermilionUserResource Vermilion user resource. (required)
   * @return VermilionUserResource
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Provided resource contains invalid data. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> User has not been authenticated. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> User is not authorized to use this API. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> User not found. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal server error. </td><td>  -  </td></tr>
     </table>
   */
  public VermilionUserResource vermilionUsersIdPut(String id, VermilionUserResource vermilionUserResource) throws ApiException {
    return vermilionUsersIdPutWithHttpInfo(id, vermilionUserResource).getData();
  }

  /**
   * Replace a Vermilion user.
   * 
   * @param id ID of resource. (required)
   * @param vermilionUserResource Vermilion user resource. (required)
   * @return ApiResponse&lt;VermilionUserResource&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Provided resource contains invalid data. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> User has not been authenticated. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> User is not authorized to use this API. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> User not found. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal server error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<VermilionUserResource> vermilionUsersIdPutWithHttpInfo(String id, VermilionUserResource vermilionUserResource) throws ApiException {
    Object localVarPostBody = vermilionUserResource;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling vermilionUsersIdPut");
    }
    
    // verify the required parameter 'vermilionUserResource' is set
    if (vermilionUserResource == null) {
      throw new ApiException(400, "Missing the required parameter 'vermilionUserResource' when calling vermilionUsersIdPut");
    }
    
    // create path and map variables
    String localVarPath = "/VermilionUsers/{id}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

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
        
        VermilionUserResource
      
    > apiResponse = apiClient.invokeAPI("VermilionUsersApi.vermilionUsersIdPut", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, vermilionUsersIdPutResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Create a Vermilion user.
   * 
   * @param vermilionUserResource Vermilion user resource. (required)
   * @return VermilionUserResource
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Success. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Provided resource contains invalid data. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> User has not been authenticated. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> User is not authorized to use this API. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal server error. </td><td>  -  </td></tr>
     </table>
   */
  public VermilionUserResource vermilionUsersPost(VermilionUserResource vermilionUserResource) throws ApiException {
    return vermilionUsersPostWithHttpInfo(vermilionUserResource).getData();
  }

  /**
   * Create a Vermilion user.
   * 
   * @param vermilionUserResource Vermilion user resource. (required)
   * @return ApiResponse&lt;VermilionUserResource&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Success. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Provided resource contains invalid data. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> User has not been authenticated. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> User is not authorized to use this API. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal server error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<VermilionUserResource> vermilionUsersPostWithHttpInfo(VermilionUserResource vermilionUserResource) throws ApiException {
    Object localVarPostBody = vermilionUserResource;
    
    // verify the required parameter 'vermilionUserResource' is set
    if (vermilionUserResource == null) {
      throw new ApiException(400, "Missing the required parameter 'vermilionUserResource' when calling vermilionUsersPost");
    }
    
    // create path and map variables
    String localVarPath = "/VermilionUsers";

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
        
        VermilionUserResource
      
    > apiResponse = apiClient.invokeAPI("VermilionUsersApi.vermilionUsersPost", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, vermilionUsersPostResponseTypeMap, false);

    return apiResponse;

  }
}
