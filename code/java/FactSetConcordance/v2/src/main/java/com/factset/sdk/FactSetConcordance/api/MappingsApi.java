package com.factset.sdk.FactSetConcordance.api;

import com.factset.sdk.FactSetConcordance.ApiException;
import com.factset.sdk.FactSetConcordance.ApiClient;
import com.factset.sdk.FactSetConcordance.ApiResponse;
import com.factset.sdk.FactSetConcordance.Configuration;
import com.factset.sdk.FactSetConcordance.Pair;

import javax.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.FactSetConcordance.models.EntityMappingDeleteRequest;
import com.factset.sdk.FactSetConcordance.models.EntityMappingDeleteResponse;
import com.factset.sdk.FactSetConcordance.models.EntityMappingRequest;
import com.factset.sdk.FactSetConcordance.models.EntityResponse;
import com.factset.sdk.FactSetConcordance.models.EntityUniverseRequest;
import com.factset.sdk.FactSetConcordance.models.EntityUniverseResponse;
import com.factset.sdk.FactSetConcordance.models.ErrorResponse;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MappingsApi {
  private ApiClient apiClient;

  public MappingsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public MappingsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> getEntityMappingDeleteForListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getEntityMappingDeleteForListResponseTypeMap.put(200, new GenericType<EntityMappingDeleteResponse>(){});
    getEntityMappingDeleteForListResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getEntityMappingDeleteForListResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getEntityMappingDeleteForListResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getEntityMappingDeleteForListResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getEntityMappingDeleteForListResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> getEntityMappingForListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getEntityMappingForListResponseTypeMap.put(200, new GenericType<EntityResponse>(){});
    getEntityMappingForListResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getEntityMappingForListResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getEntityMappingForListResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getEntityMappingForListResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getEntityMappingForListResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> getEntityUniverseResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getEntityUniverseResponseTypeMap.put(200, new GenericType<EntityUniverseResponse>(){});
    getEntityUniverseResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getEntityUniverseResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getEntityUniverseResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getEntityUniverseResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getEntityUniverseResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> getEntityUniverseForListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getEntityUniverseForListResponseTypeMap.put(200, new GenericType<EntityUniverseResponse>(){});
    getEntityUniverseForListResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getEntityUniverseForListResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getEntityUniverseForListResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getEntityUniverseForListResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getEntityUniverseForListResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
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
   * Deletes mapping specified by the client.
   * Delete a Concordance Mapping to the client universe. When making a post, all exiting values are overwritten in the database with the values passed in the request. clientId and universeId are required. 
   * @param entityMappingDeleteRequest A request to delete entity mappings specified by the client (required)
   * @return EntityMappingDeleteResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Response object for the entity-match object in a snowflake friendly response model. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public EntityMappingDeleteResponse getEntityMappingDeleteForList(EntityMappingDeleteRequest entityMappingDeleteRequest) throws ApiException {
    return getEntityMappingDeleteForListWithHttpInfo(entityMappingDeleteRequest).getData();
  }

  /**
   * Deletes mapping specified by the client.
   * Delete a Concordance Mapping to the client universe. When making a post, all exiting values are overwritten in the database with the values passed in the request. clientId and universeId are required. 
   * @param entityMappingDeleteRequest A request to delete entity mappings specified by the client (required)
   * @return ApiResponse&lt;EntityMappingDeleteResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Response object for the entity-match object in a snowflake friendly response model. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<EntityMappingDeleteResponse> getEntityMappingDeleteForListWithHttpInfo(EntityMappingDeleteRequest entityMappingDeleteRequest) throws ApiException {
    Object localVarPostBody = entityMappingDeleteRequest;
    
    // verify the required parameter 'entityMappingDeleteRequest' is set
    if (entityMappingDeleteRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'entityMappingDeleteRequest' when calling getEntityMappingDeleteForList");
    }
    
    // create path and map variables
    String localVarPath = "/factset-concordance/v2/entity-mapping-delete";

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
        
        EntityMappingDeleteResponse
      
    > apiResponse = apiClient.invokeAPI("MappingsApi.getEntityMappingDeleteForList", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getEntityMappingDeleteForListResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Saves a single-mapping specified by the client.
   * Saves a Concordance Mapping to the client universe. When making a post, all exiting values are overwritten in the database with the values passed in the request. clientId and clientName are required. 
   * @param entityMappingRequest A request to create a single mapping. (required)
   * @return EntityResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Response object for FactSet Concordance Entity. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public EntityResponse getEntityMappingForList(EntityMappingRequest entityMappingRequest) throws ApiException {
    return getEntityMappingForListWithHttpInfo(entityMappingRequest).getData();
  }

  /**
   * Saves a single-mapping specified by the client.
   * Saves a Concordance Mapping to the client universe. When making a post, all exiting values are overwritten in the database with the values passed in the request. clientId and clientName are required. 
   * @param entityMappingRequest A request to create a single mapping. (required)
   * @return ApiResponse&lt;EntityResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Response object for FactSet Concordance Entity. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<EntityResponse> getEntityMappingForListWithHttpInfo(EntityMappingRequest entityMappingRequest) throws ApiException {
    Object localVarPostBody = entityMappingRequest;
    
    // verify the required parameter 'entityMappingRequest' is set
    if (entityMappingRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'entityMappingRequest' when calling getEntityMappingForList");
    }
    
    // create path and map variables
    String localVarPath = "/factset-concordance/v2/entity-mapping";

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
        
        EntityResponse
      
    > apiResponse = apiClient.invokeAPI("MappingsApi.getEntityMappingForList", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getEntityMappingForListResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Retrieve all saved mappings within a requested universe
   * Retrieves all entity mappings within a requested universe. 
   * @param universeId Universe identifier. *To create a universe, use the &#x60;/universe&#39; endpoint.* (required)
   * @param clientId Filter by the clientId(s) created by the user in a previous mapping.  (optional)
   * @param mapStatus Filter by the Entity Decisions that have the specified mapStatus, where -   * MAPPED - The requested Entity Name is successfully mapped to a FactSet Entity Id (-E)   * UNMAPPED - The requested Entity Name is unmapped by FactSet.   * INDETERMINATE - The requested Entity Name was unable to make a mapping.  (optional)
   * @param offset Starting row for records to return or rows to skip. (optional, default to 0)
   * @param limit Limits the number of records in the response. (optional)
   * @param sort Sort clientId, createdTime, updatedTime, clientName, entityId fields in ascending or descending order with asc and desc to indicate the order. Example (clientId:asc) (optional)
   * @return EntityUniverseResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Response object for FactSet Concordance Universe detail. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public EntityUniverseResponse getEntityUniverse(Integer universeId, java.util.List<String> clientId, java.util.List<String> mapStatus, Integer offset, Integer limit, java.util.List<String> sort) throws ApiException {
    return getEntityUniverseWithHttpInfo(universeId, clientId, mapStatus, offset, limit, sort).getData();
  }

  /**
   * Retrieve all saved mappings within a requested universe
   * Retrieves all entity mappings within a requested universe. 
   * @param universeId Universe identifier. *To create a universe, use the &#x60;/universe&#39; endpoint.* (required)
   * @param clientId Filter by the clientId(s) created by the user in a previous mapping.  (optional)
   * @param mapStatus Filter by the Entity Decisions that have the specified mapStatus, where -   * MAPPED - The requested Entity Name is successfully mapped to a FactSet Entity Id (-E)   * UNMAPPED - The requested Entity Name is unmapped by FactSet.   * INDETERMINATE - The requested Entity Name was unable to make a mapping.  (optional)
   * @param offset Starting row for records to return or rows to skip. (optional, default to 0)
   * @param limit Limits the number of records in the response. (optional)
   * @param sort Sort clientId, createdTime, updatedTime, clientName, entityId fields in ascending or descending order with asc and desc to indicate the order. Example (clientId:asc) (optional)
   * @return ApiResponse&lt;EntityUniverseResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Response object for FactSet Concordance Universe detail. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<EntityUniverseResponse> getEntityUniverseWithHttpInfo(Integer universeId, java.util.List<String> clientId, java.util.List<String> mapStatus, Integer offset, Integer limit, java.util.List<String> sort) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'universeId' is set
    if (universeId == null) {
      throw new ApiException(400, "Missing the required parameter 'universeId' when calling getEntityUniverse");
    }
    
    // create path and map variables
    String localVarPath = "/factset-concordance/v2/entity-universe";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "universeId", universeId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "clientId", clientId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "mapStatus", mapStatus));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "sort", sort));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        EntityUniverseResponse
      
    > apiResponse = apiClient.invokeAPI("MappingsApi.getEntityUniverse", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getEntityUniverseResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Retrieve all saved mappings within a requested universe or large list of client ids
   * Retrieves all entity mappings that were saved in a given universe. Supports filtering by a large number of &#x60;clientId&#x60;s 
   * @param entityUniverseRequest A request to fetch all entities of a given universe (required)
   * @return EntityUniverseResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Response object for FactSet Concordance Universe detail. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public EntityUniverseResponse getEntityUniverseForList(EntityUniverseRequest entityUniverseRequest) throws ApiException {
    return getEntityUniverseForListWithHttpInfo(entityUniverseRequest).getData();
  }

  /**
   * Retrieve all saved mappings within a requested universe or large list of client ids
   * Retrieves all entity mappings that were saved in a given universe. Supports filtering by a large number of &#x60;clientId&#x60;s 
   * @param entityUniverseRequest A request to fetch all entities of a given universe (required)
   * @return ApiResponse&lt;EntityUniverseResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Response object for FactSet Concordance Universe detail. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<EntityUniverseResponse> getEntityUniverseForListWithHttpInfo(EntityUniverseRequest entityUniverseRequest) throws ApiException {
    Object localVarPostBody = entityUniverseRequest;
    
    // verify the required parameter 'entityUniverseRequest' is set
    if (entityUniverseRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'entityUniverseRequest' when calling getEntityUniverseForList");
    }
    
    // create path and map variables
    String localVarPath = "/factset-concordance/v2/entity-universe";

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
        
        EntityUniverseResponse
      
    > apiResponse = apiClient.invokeAPI("MappingsApi.getEntityUniverseForList", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getEntityUniverseForListResponseTypeMap, false);

    return apiResponse;

  }
}
