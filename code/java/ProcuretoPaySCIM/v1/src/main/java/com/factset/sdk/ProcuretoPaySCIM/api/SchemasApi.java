package com.factset.sdk.ProcuretoPaySCIM.api;

import com.factset.sdk.ProcuretoPaySCIM.ApiException;
import com.factset.sdk.ProcuretoPaySCIM.ApiClient;
import com.factset.sdk.ProcuretoPaySCIM.ApiResponse;
import com.factset.sdk.ProcuretoPaySCIM.Configuration;
import com.factset.sdk.ProcuretoPaySCIM.Pair;

import javax.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.ProcuretoPaySCIM.models.Error;
import com.factset.sdk.ProcuretoPaySCIM.models.Schema;
import com.factset.sdk.ProcuretoPaySCIM.models.SchemaList;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SchemasApi {
  private ApiClient apiClient;

  public SchemasApi() {
    this(Configuration.getDefaultApiClient());
  }

  public SchemasApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

    private static final Map<Integer, GenericType> schemasGetResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    schemasGetResponseTypeMap.put(200, new GenericType<SchemaList>(){});
    schemasGetResponseTypeMap.put(401, new GenericType<Error>(){});
    schemasGetResponseTypeMap.put(403, new GenericType<Error>(){});
    schemasGetResponseTypeMap.put(500, new GenericType<Error>(){});
  }
  private static final Map<Integer, GenericType> schemasIdGetResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    schemasIdGetResponseTypeMap.put(200, new GenericType<Schema>(){});
    schemasIdGetResponseTypeMap.put(401, new GenericType<Error>(){});
    schemasIdGetResponseTypeMap.put(404, new GenericType<Error>(){});
    schemasIdGetResponseTypeMap.put(500, new GenericType<Error>(){});
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
   * Get a list of schemas.
   * 
   * @param startIndex Result start index. The one-based index of the first result to be returned in the list of resources. For example, to exclude the first two resources, use a *startIndex* value of 3. This parameter has a default value of 1. This index applies *after* any resource filtration has been applied as specified by the *filter* argument. (optional)
   * @param count Maximum resource count. The server will not return more resources than this value, although it may return fewer. (optional)
   * @return SchemaList
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> User has not been authenticated. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> User is not authorized to use this API. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal server error. </td><td>  -  </td></tr>
     </table>
   */
  public SchemaList schemasGet(Integer startIndex, Integer count) throws ApiException {
    return schemasGetWithHttpInfo(startIndex, count).getData();
  }

  /**
   * Get a list of schemas.
   * 
   * @param startIndex Result start index. The one-based index of the first result to be returned in the list of resources. For example, to exclude the first two resources, use a *startIndex* value of 3. This parameter has a default value of 1. This index applies *after* any resource filtration has been applied as specified by the *filter* argument. (optional)
   * @param count Maximum resource count. The server will not return more resources than this value, although it may return fewer. (optional)
   * @return ApiResponse&lt;SchemaList&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> User has not been authenticated. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> User is not authorized to use this API. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal server error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SchemaList> schemasGetWithHttpInfo(Integer startIndex, Integer count) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/Schemas";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startIndex", startIndex));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "count", count));

    
    
    
    final String[] localVarAccepts = {
      "application/scim+json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        SchemaList
      
    > apiResponse = apiClient.invokeAPI("SchemasApi.schemasGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, schemasGetResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Get a schema.
   * 
   * @param id ID of resource. (required)
   * @return Schema
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> User has not been authenticated. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Schema not found. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal server error. </td><td>  -  </td></tr>
     </table>
   */
  public Schema schemasIdGet(String id) throws ApiException {
    return schemasIdGetWithHttpInfo(id).getData();
  }

  /**
   * Get a schema.
   * 
   * @param id ID of resource. (required)
   * @return ApiResponse&lt;Schema&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> User has not been authenticated. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Schema not found. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal server error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Schema> schemasIdGetWithHttpInfo(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling schemasIdGet");
    }
    
    // create path and map variables
    String localVarPath = "/Schemas/{id}"
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
        
        Schema
      
    > apiResponse = apiClient.invokeAPI("SchemasApi.schemasIdGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, schemasIdGetResponseTypeMap, false);

    return apiResponse;

  }
}
