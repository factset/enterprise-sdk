package com.factset.sdk.FactSetEntity.api;

import com.factset.sdk.FactSetEntity.ApiException;
import com.factset.sdk.FactSetEntity.ApiClient;
import com.factset.sdk.FactSetEntity.ApiResponse;
import com.factset.sdk.FactSetEntity.Configuration;
import com.factset.sdk.FactSetEntity.Pair;

import javax.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.FactSetEntity.models.EntityStructureRequest;
import com.factset.sdk.FactSetEntity.models.EntityStructureResponse;
import com.factset.sdk.FactSetEntity.models.ErrorResponse;
import com.factset.sdk.FactSetEntity.models.UltimateEntityStructureRequest;
import com.factset.sdk.FactSetEntity.models.UltimateEntityStructureResponse;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class EntityStructureApi {
  private ApiClient apiClient;

  public EntityStructureApi() {
    this(Configuration.getDefaultApiClient());
  }

  public EntityStructureApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> getEntityStructureResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getEntityStructureResponseTypeMap.put(200, new GenericType<EntityStructureResponse>(){});
    getEntityStructureResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getEntityStructureResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getEntityStructureResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getEntityStructureResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getEntityStructureResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> getUltimateEntityStructureResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getUltimateEntityStructureResponseTypeMap.put(200, new GenericType<UltimateEntityStructureResponse>(){});
    getUltimateEntityStructureResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getUltimateEntityStructureResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getUltimateEntityStructureResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getUltimateEntityStructureResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getUltimateEntityStructureResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> postEntityStructureResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    postEntityStructureResponseTypeMap.put(200, new GenericType<EntityStructureResponse>(){});
    postEntityStructureResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    postEntityStructureResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    postEntityStructureResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    postEntityStructureResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    postEntityStructureResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> postUltimateEntityStructureResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    postUltimateEntityStructureResponseTypeMap.put(200, new GenericType<UltimateEntityStructureResponse>(){});
    postUltimateEntityStructureResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    postUltimateEntityStructureResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    postUltimateEntityStructureResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    postUltimateEntityStructureResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    postUltimateEntityStructureResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
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
   * Returns all active or inactive entities and respective levels below the requested entity id.
   * Returns all active or inactive entities below the requested entity id. 
   * @param ids The requested Market Identifier. Accepted input identifiers include Ticker-Exchange, Ticker-Regions, CUSIPs, ISINs, SEDOLs, or FactSet Permanent Ids, such as -R, -L, or -E.&lt;p&gt;**Max Ids Limit set to 100 in a single request**&lt;/p&gt;   *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids,       which may lead to exceeding this request line limit of 8KB, its       advised for any requests with large request lines to be requested through       the respective \\\&quot;POST\\\&quot; method.&lt;/p&gt;*  (required)
   * @param level Controls the levels returned in the hierarchy. Use -1 to return all levels, or 1-n for a specific level. (optional, default to -1)
   * @param active Controls active or inactive securities returned in the hierarchy. Enter 1 to return only active entities, 0 for inactive entities, and -1 for all active and inactive. (optional, default to -1)
   * @return EntityStructureResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Fetches Entity Structure </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public EntityStructureResponse getEntityStructure(java.util.List<String> ids, Integer level, Integer active) throws ApiException {
    return getEntityStructureWithHttpInfo(ids, level, active).getData();
  }

  /**
   * Returns all active or inactive entities and respective levels below the requested entity id.
   * Returns all active or inactive entities below the requested entity id. 
   * @param ids The requested Market Identifier. Accepted input identifiers include Ticker-Exchange, Ticker-Regions, CUSIPs, ISINs, SEDOLs, or FactSet Permanent Ids, such as -R, -L, or -E.&lt;p&gt;**Max Ids Limit set to 100 in a single request**&lt;/p&gt;   *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids,       which may lead to exceeding this request line limit of 8KB, its       advised for any requests with large request lines to be requested through       the respective \\\&quot;POST\\\&quot; method.&lt;/p&gt;*  (required)
   * @param level Controls the levels returned in the hierarchy. Use -1 to return all levels, or 1-n for a specific level. (optional, default to -1)
   * @param active Controls active or inactive securities returned in the hierarchy. Enter 1 to return only active entities, 0 for inactive entities, and -1 for all active and inactive. (optional, default to -1)
   * @return ApiResponse&lt;EntityStructureResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Fetches Entity Structure </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<EntityStructureResponse> getEntityStructureWithHttpInfo(java.util.List<String> ids, Integer level, Integer active) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ids' is set
    if (ids == null) {
      throw new ApiException(400, "Missing the required parameter 'ids' when calling getEntityStructure");
    }
    
    // create path and map variables
    String localVarPath = "/factset-entity/v1/entity-structures";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "ids", ids));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "level", level));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "active", active));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        EntityStructureResponse
      
    > apiResponse = apiClient.invokeAPI("EntityStructureApi.getEntityStructure", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getEntityStructureResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Returns the full ultimate parent entity hiearachy. Control levels and active status of underlying entities.
   * Returns full ultimate entity structure including ultimate parent and all subordinates. Will accept entity from any level of entity structure or active vs. inactive status of entity. 
   * @param ids The requested Market Identifier. Accepted input identifiers include Ticker-Exchange, Ticker-Regions, CUSIPs, ISINs, SEDOLs, or FactSet Permanent Ids, such as -R, -L, or -E.&lt;p&gt;**Max Ids Limit set to 100 in a single request**&lt;/p&gt;   *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids,       which may lead to exceeding this request line limit of 8KB, its       advised for any requests with large request lines to be requested through       the respective \\\&quot;POST\\\&quot; method.&lt;/p&gt;*  (required)
   * @param level Controls the levels returned in the hierarchy. Use -1 to return all levels, or 1-n for a specific level. (optional, default to -1)
   * @param active Controls active or inactive securities returned in the hierarchy. Enter 1 to return only active entities, 0 for inactive entities, and -1 for all active and inactive. (optional, default to -1)
   * @return UltimateEntityStructureResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Fetches Ultimate Entity Structure data for a list of ids. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public UltimateEntityStructureResponse getUltimateEntityStructure(java.util.List<String> ids, Integer level, Integer active) throws ApiException {
    return getUltimateEntityStructureWithHttpInfo(ids, level, active).getData();
  }

  /**
   * Returns the full ultimate parent entity hiearachy. Control levels and active status of underlying entities.
   * Returns full ultimate entity structure including ultimate parent and all subordinates. Will accept entity from any level of entity structure or active vs. inactive status of entity. 
   * @param ids The requested Market Identifier. Accepted input identifiers include Ticker-Exchange, Ticker-Regions, CUSIPs, ISINs, SEDOLs, or FactSet Permanent Ids, such as -R, -L, or -E.&lt;p&gt;**Max Ids Limit set to 100 in a single request**&lt;/p&gt;   *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids,       which may lead to exceeding this request line limit of 8KB, its       advised for any requests with large request lines to be requested through       the respective \\\&quot;POST\\\&quot; method.&lt;/p&gt;*  (required)
   * @param level Controls the levels returned in the hierarchy. Use -1 to return all levels, or 1-n for a specific level. (optional, default to -1)
   * @param active Controls active or inactive securities returned in the hierarchy. Enter 1 to return only active entities, 0 for inactive entities, and -1 for all active and inactive. (optional, default to -1)
   * @return ApiResponse&lt;UltimateEntityStructureResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Fetches Ultimate Entity Structure data for a list of ids. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<UltimateEntityStructureResponse> getUltimateEntityStructureWithHttpInfo(java.util.List<String> ids, Integer level, Integer active) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ids' is set
    if (ids == null) {
      throw new ApiException(400, "Missing the required parameter 'ids' when calling getUltimateEntityStructure");
    }
    
    // create path and map variables
    String localVarPath = "/factset-entity/v1/ultimate-entity-structures";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "ids", ids));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "level", level));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "active", active));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        UltimateEntityStructureResponse
      
    > apiResponse = apiClient.invokeAPI("EntityStructureApi.getUltimateEntityStructure", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getUltimateEntityStructureResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Returns all active or inactive entities below the requested entity id.
   * Returns all active or inactive entities and respective levels below the requested entity id. 
   * @param entityStructureRequest Request Body to request a list of Entity Structure objects. (required)
   * @return EntityStructureResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Entity Structure data items </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public EntityStructureResponse postEntityStructure(EntityStructureRequest entityStructureRequest) throws ApiException {
    return postEntityStructureWithHttpInfo(entityStructureRequest).getData();
  }

  /**
   * Returns all active or inactive entities below the requested entity id.
   * Returns all active or inactive entities and respective levels below the requested entity id. 
   * @param entityStructureRequest Request Body to request a list of Entity Structure objects. (required)
   * @return ApiResponse&lt;EntityStructureResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Entity Structure data items </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<EntityStructureResponse> postEntityStructureWithHttpInfo(EntityStructureRequest entityStructureRequest) throws ApiException {
    Object localVarPostBody = entityStructureRequest;
    
    // verify the required parameter 'entityStructureRequest' is set
    if (entityStructureRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'entityStructureRequest' when calling postEntityStructure");
    }
    
    // create path and map variables
    String localVarPath = "/factset-entity/v1/entity-structures";

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
        
        EntityStructureResponse
      
    > apiResponse = apiClient.invokeAPI("EntityStructureApi.postEntityStructure", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, postEntityStructureResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Returns all active or inactive entities and respective levels below the requested entity id.
   * Returns all active or inactive entities and respective levels below the requested entity id. 
   * @param ultimateEntityStructureRequest Request Body to request a list of Ultimate Entity Structure objects. (required)
   * @return UltimateEntityStructureResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Ultimate Entity Structure data items </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public UltimateEntityStructureResponse postUltimateEntityStructure(UltimateEntityStructureRequest ultimateEntityStructureRequest) throws ApiException {
    return postUltimateEntityStructureWithHttpInfo(ultimateEntityStructureRequest).getData();
  }

  /**
   * Returns all active or inactive entities and respective levels below the requested entity id.
   * Returns all active or inactive entities and respective levels below the requested entity id. 
   * @param ultimateEntityStructureRequest Request Body to request a list of Ultimate Entity Structure objects. (required)
   * @return ApiResponse&lt;UltimateEntityStructureResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Ultimate Entity Structure data items </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<UltimateEntityStructureResponse> postUltimateEntityStructureWithHttpInfo(UltimateEntityStructureRequest ultimateEntityStructureRequest) throws ApiException {
    Object localVarPostBody = ultimateEntityStructureRequest;
    
    // verify the required parameter 'ultimateEntityStructureRequest' is set
    if (ultimateEntityStructureRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'ultimateEntityStructureRequest' when calling postUltimateEntityStructure");
    }
    
    // create path and map variables
    String localVarPath = "/factset-entity/v1/ultimate-entity-structures";

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
        
        UltimateEntityStructureResponse
      
    > apiResponse = apiClient.invokeAPI("EntityStructureApi.postUltimateEntityStructure", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, postUltimateEntityStructureResponseTypeMap, false);

    return apiResponse;

  }
}
