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
import com.factset.sdk.ProcuretoPayAPISCIM.models.VermilionGroupResource;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class VermilionGroupsApi {
  private ApiClient apiClient;

  public VermilionGroupsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public VermilionGroupsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> vermilionGroupsGetResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    vermilionGroupsGetResponseTypeMap.put(200, new GenericType<VermilionGroupResource>(){});
    vermilionGroupsGetResponseTypeMap.put(400, new GenericType<Error>(){});
    vermilionGroupsGetResponseTypeMap.put(401, new GenericType<Error>(){});
    vermilionGroupsGetResponseTypeMap.put(403, new GenericType<Error>(){});
    vermilionGroupsGetResponseTypeMap.put(500, new GenericType<Error>(){});
  }

  private static final Map<Integer, GenericType> vermilionGroupsIdGetResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    vermilionGroupsIdGetResponseTypeMap.put(200, new GenericType<VermilionGroupResource>(){});
    vermilionGroupsIdGetResponseTypeMap.put(401, new GenericType<Error>(){});
    vermilionGroupsIdGetResponseTypeMap.put(403, new GenericType<Error>(){});
    vermilionGroupsIdGetResponseTypeMap.put(404, new GenericType<Error>(){});
    vermilionGroupsIdGetResponseTypeMap.put(500, new GenericType<Error>(){});
  }

  private static final Map<Integer, GenericType> vermilionGroupsIdPatchResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    vermilionGroupsIdPatchResponseTypeMap.put(200, new GenericType<VermilionGroupResource>(){});
    vermilionGroupsIdPatchResponseTypeMap.put(400, new GenericType<Error>(){});
    vermilionGroupsIdPatchResponseTypeMap.put(401, new GenericType<Error>(){});
    vermilionGroupsIdPatchResponseTypeMap.put(403, new GenericType<Error>(){});
    vermilionGroupsIdPatchResponseTypeMap.put(500, new GenericType<Error>(){});
  }

  private static final Map<Integer, GenericType> vermilionGroupsIdPutResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    vermilionGroupsIdPutResponseTypeMap.put(200, new GenericType<VermilionGroupResource>(){});
    vermilionGroupsIdPutResponseTypeMap.put(400, new GenericType<Error>(){});
    vermilionGroupsIdPutResponseTypeMap.put(401, new GenericType<Error>(){});
    vermilionGroupsIdPutResponseTypeMap.put(403, new GenericType<Error>(){});
    vermilionGroupsIdPutResponseTypeMap.put(404, new GenericType<Error>(){});
    vermilionGroupsIdPutResponseTypeMap.put(500, new GenericType<Error>(){});
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
   * Get a list of Vermilion groups.
   * 
   * @param filter Resource filter string. See [RFC 7644 section 3.4.2.2](https://tools.ietf.org/html/rfc7644#section-3.4.2.2) for syntax. Note this API implementation also supports a non-standard \&quot;re\&quot; operator for regular expression matching against strings. (optional)
   * @param startIndex Result start index. The one-based index of the first result to be returned in the list of resources. For example, to exclude the first two resources, use a *startIndex* value of 3. This parameter has a default value of 1. This index applies *after* any resource filtration has been applied as specified by the *filter* argument. (optional)
   * @param count Maximum resource count. The server will not return more resources than this value, although it may return fewer. (optional)
   * @param attributes Attribute whitelist filter string. A comma-separated list of resource attribute names to be returned in the response, overriding the set of attributes that would be returned by default. Attribute names must be specified in standard attribute notation (see [RFC 7644 section 3.10](https://datatracker.ietf.org/doc/html/rfc7644#section-3.10).) This parameter cannot be used with the *excludedAttributes* parameter. (optional)
   * @param excludedAttributes Attribute blacklist filter string. A comma-separated list of resource attribute names to be excluded in the response, overriding the set of attributes that would be returned by default. Attribute names must be specified in standard attribute notation (see [RFC 7644 section 3.10](https://datatracker.ietf.org/doc/html/rfc7644#section-3.10).) This parameter cannot be used with the *attributes* parameter. (optional)
   * @return VermilionGroupResource
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
  public VermilionGroupResource vermilionGroupsGet(String filter, Integer startIndex, Integer count, String attributes, String excludedAttributes) throws ApiException {
    return vermilionGroupsGetWithHttpInfo(filter, startIndex, count, attributes, excludedAttributes).getData();
  }

  /**
   * Get a list of Vermilion groups.
   * 
   * @param filter Resource filter string. See [RFC 7644 section 3.4.2.2](https://tools.ietf.org/html/rfc7644#section-3.4.2.2) for syntax. Note this API implementation also supports a non-standard \&quot;re\&quot; operator for regular expression matching against strings. (optional)
   * @param startIndex Result start index. The one-based index of the first result to be returned in the list of resources. For example, to exclude the first two resources, use a *startIndex* value of 3. This parameter has a default value of 1. This index applies *after* any resource filtration has been applied as specified by the *filter* argument. (optional)
   * @param count Maximum resource count. The server will not return more resources than this value, although it may return fewer. (optional)
   * @param attributes Attribute whitelist filter string. A comma-separated list of resource attribute names to be returned in the response, overriding the set of attributes that would be returned by default. Attribute names must be specified in standard attribute notation (see [RFC 7644 section 3.10](https://datatracker.ietf.org/doc/html/rfc7644#section-3.10).) This parameter cannot be used with the *excludedAttributes* parameter. (optional)
   * @param excludedAttributes Attribute blacklist filter string. A comma-separated list of resource attribute names to be excluded in the response, overriding the set of attributes that would be returned by default. Attribute names must be specified in standard attribute notation (see [RFC 7644 section 3.10](https://datatracker.ietf.org/doc/html/rfc7644#section-3.10).) This parameter cannot be used with the *attributes* parameter. (optional)
   * @return ApiResponse&lt;VermilionGroupResource&gt;
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
  public ApiResponse<VermilionGroupResource> vermilionGroupsGetWithHttpInfo(String filter, Integer startIndex, Integer count, String attributes, String excludedAttributes) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/VermilionGroups";

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
        
        VermilionGroupResource
      
    > apiResponse = apiClient.invokeAPI("VermilionGroupsApi.vermilionGroupsGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, vermilionGroupsGetResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Get a Vermilion group.
   * 
   * @param id ID of resource. (required)
   * @return VermilionGroupResource
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
  public VermilionGroupResource vermilionGroupsIdGet(String id) throws ApiException {
    return vermilionGroupsIdGetWithHttpInfo(id).getData();
  }

  /**
   * Get a Vermilion group.
   * 
   * @param id ID of resource. (required)
   * @return ApiResponse&lt;VermilionGroupResource&gt;
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
  public ApiResponse<VermilionGroupResource> vermilionGroupsIdGetWithHttpInfo(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling vermilionGroupsIdGet");
    }
    
    // create path and map variables
    String localVarPath = "/VermilionGroups/{id}"
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
        
        VermilionGroupResource
      
    > apiResponse = apiClient.invokeAPI("VermilionGroupsApi.vermilionGroupsIdGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, vermilionGroupsIdGetResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Patch a Vermilion group (add, replace, or remove attributes of a Vermilion group.)
   * 
   * @param id ID of resource. (required)
   * @param patch  (optional)
   * @return VermilionGroupResource
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
  public VermilionGroupResource vermilionGroupsIdPatch(String id, Patch patch) throws ApiException {
    return vermilionGroupsIdPatchWithHttpInfo(id, patch).getData();
  }

  /**
   * Patch a Vermilion group (add, replace, or remove attributes of a Vermilion group.)
   * 
   * @param id ID of resource. (required)
   * @param patch  (optional)
   * @return ApiResponse&lt;VermilionGroupResource&gt;
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
  public ApiResponse<VermilionGroupResource> vermilionGroupsIdPatchWithHttpInfo(String id, Patch patch) throws ApiException {
    Object localVarPostBody = patch;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling vermilionGroupsIdPatch");
    }
    
    // create path and map variables
    String localVarPath = "/VermilionGroups/{id}"
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
        
        VermilionGroupResource
      
    > apiResponse = apiClient.invokeAPI("VermilionGroupsApi.vermilionGroupsIdPatch", localVarPath, "PATCH", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, vermilionGroupsIdPatchResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Replace a Vermilion group.
   * 
   * @param id ID of resource. (required)
   * @param vermilionGroupResource Vermilion group resource. (required)
   * @return VermilionGroupResource
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
  public VermilionGroupResource vermilionGroupsIdPut(String id, VermilionGroupResource vermilionGroupResource) throws ApiException {
    return vermilionGroupsIdPutWithHttpInfo(id, vermilionGroupResource).getData();
  }

  /**
   * Replace a Vermilion group.
   * 
   * @param id ID of resource. (required)
   * @param vermilionGroupResource Vermilion group resource. (required)
   * @return ApiResponse&lt;VermilionGroupResource&gt;
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
  public ApiResponse<VermilionGroupResource> vermilionGroupsIdPutWithHttpInfo(String id, VermilionGroupResource vermilionGroupResource) throws ApiException {
    Object localVarPostBody = vermilionGroupResource;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling vermilionGroupsIdPut");
    }
    
    // verify the required parameter 'vermilionGroupResource' is set
    if (vermilionGroupResource == null) {
      throw new ApiException(400, "Missing the required parameter 'vermilionGroupResource' when calling vermilionGroupsIdPut");
    }
    
    // create path and map variables
    String localVarPath = "/VermilionGroups/{id}"
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
        
        VermilionGroupResource
      
    > apiResponse = apiClient.invokeAPI("VermilionGroupsApi.vermilionGroupsIdPut", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, vermilionGroupsIdPutResponseTypeMap, false);

    return apiResponse;

  }
}
