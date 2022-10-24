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
import com.factset.sdk.FactSetConcordance.models.ErrorResponse;
import com.factset.sdk.FactSetConcordance.models.PeopleMappingDeleteResponse;
import com.factset.sdk.FactSetConcordance.models.PeopleMappingRequest;
import com.factset.sdk.FactSetConcordance.models.PeopleMappingResponse;
import com.factset.sdk.FactSetConcordance.models.PeopleUniverseRequest;
import com.factset.sdk.FactSetConcordance.models.PeopleUniverseResponse;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PeopleMappingApi {
  private ApiClient apiClient;

  public PeopleMappingApi() {
    this(Configuration.getDefaultApiClient());
  }

  public PeopleMappingApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

    private static final Map<Integer, GenericType> getPeopleMappingDeleteForListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getPeopleMappingDeleteForListResponseTypeMap.put(200, new GenericType<PeopleMappingDeleteResponse>(){});
    getPeopleMappingDeleteForListResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getPeopleMappingDeleteForListResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getPeopleMappingDeleteForListResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getPeopleMappingDeleteForListResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getPeopleMappingDeleteForListResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }
  private static final Map<Integer, GenericType> getPeopleMappingForListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getPeopleMappingForListResponseTypeMap.put(200, new GenericType<PeopleMappingResponse>(){});
    getPeopleMappingForListResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getPeopleMappingForListResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getPeopleMappingForListResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getPeopleMappingForListResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getPeopleMappingForListResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }
  private static final Map<Integer, GenericType> getPeopleUniverseResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getPeopleUniverseResponseTypeMap.put(200, new GenericType<PeopleUniverseResponse>(){});
    getPeopleUniverseResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getPeopleUniverseResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getPeopleUniverseResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getPeopleUniverseResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getPeopleUniverseResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }
  private static final Map<Integer, GenericType> getPeopleUniverseForListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getPeopleUniverseForListResponseTypeMap.put(200, new GenericType<PeopleUniverseResponse>(){});
    getPeopleUniverseForListResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getPeopleUniverseForListResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getPeopleUniverseForListResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getPeopleUniverseForListResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getPeopleUniverseForListResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
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
   * @param entityMappingDeleteRequest A request to delete people mappings specified by the client (required)
   * @return PeopleMappingDeleteResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Response object for the people-mapping-delete endpoint. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public PeopleMappingDeleteResponse getPeopleMappingDeleteForList(EntityMappingDeleteRequest entityMappingDeleteRequest) throws ApiException {
    return getPeopleMappingDeleteForListWithHttpInfo(entityMappingDeleteRequest).getData();
  }

  /**
   * Deletes mapping specified by the client.
   * Delete a Concordance Mapping to the client universe. When making a post, all exiting values are overwritten in the database with the values passed in the request. clientId and universeId are required. 
   * @param entityMappingDeleteRequest A request to delete people mappings specified by the client (required)
   * @return ApiResponse&lt;PeopleMappingDeleteResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Response object for the people-mapping-delete endpoint. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<PeopleMappingDeleteResponse> getPeopleMappingDeleteForListWithHttpInfo(EntityMappingDeleteRequest entityMappingDeleteRequest) throws ApiException {
    Object localVarPostBody = entityMappingDeleteRequest;
    
    // verify the required parameter 'entityMappingDeleteRequest' is set
    if (entityMappingDeleteRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'entityMappingDeleteRequest' when calling getPeopleMappingDeleteForList");
    }
    
    // create path and map variables
    String localVarPath = "/factset-concordance/v2/people-mapping-delete";

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
        
        PeopleMappingDeleteResponse
      
    > apiResponse = apiClient.invokeAPI("PeopleMappingApi.getPeopleMappingDeleteForList", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getPeopleMappingDeleteForListResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Saves a single-mapping specified by the client.
   * Saves a single Concordance People Mapping to a given universe. When making a post, all exiting values are overwritten in the database with the values passed in the request. clientId and clientName are required. 
   * @param peopleMappingRequest A request to create a single mapping. (required)
   * @return PeopleMappingResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Single people mapping </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public PeopleMappingResponse getPeopleMappingForList(PeopleMappingRequest peopleMappingRequest) throws ApiException {
    return getPeopleMappingForListWithHttpInfo(peopleMappingRequest).getData();
  }

  /**
   * Saves a single-mapping specified by the client.
   * Saves a single Concordance People Mapping to a given universe. When making a post, all exiting values are overwritten in the database with the values passed in the request. clientId and clientName are required. 
   * @param peopleMappingRequest A request to create a single mapping. (required)
   * @return ApiResponse&lt;PeopleMappingResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Single people mapping </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<PeopleMappingResponse> getPeopleMappingForListWithHttpInfo(PeopleMappingRequest peopleMappingRequest) throws ApiException {
    Object localVarPostBody = peopleMappingRequest;
    
    // verify the required parameter 'peopleMappingRequest' is set
    if (peopleMappingRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'peopleMappingRequest' when calling getPeopleMappingForList");
    }
    
    // create path and map variables
    String localVarPath = "/factset-concordance/v2/people-mapping";

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
        
        PeopleMappingResponse
      
    > apiResponse = apiClient.invokeAPI("PeopleMappingApi.getPeopleMappingForList", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getPeopleMappingForListResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Retrieve all saved mappings within a requested universe
   * Retrieves all people mappings within a requested universe. 
   * @param universeId Universe identifier. *To create a universe, use the &#x60;/universe&#39; endpoint.* (required)
   * @param clientId Filter by the clientId(s) created by the user in a previous mapping.  (optional)
   * @param mapStatus Filter by the Entity Decisions that have the specified mapStatus, where -   * MAPPED - The requested Entity Name is successfully mapped to a FactSet Entity Id (-E)   * UNMAPPED - The requested Entity Name is unmapped by FactSet.   * INDETERMINATE - The requested Entity Name was unable to make a mapping.  (optional)
   * @param offset Starting row for records to return or rows to skip. (optional, default to 0)
   * @param limit Limits the number of records in the response. (optional)
   * @return PeopleUniverseResponse
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
  public PeopleUniverseResponse getPeopleUniverse(Integer universeId, java.util.List<String> clientId, java.util.List<String> mapStatus, Integer offset, Integer limit) throws ApiException {
    return getPeopleUniverseWithHttpInfo(universeId, clientId, mapStatus, offset, limit).getData();
  }

  /**
   * Retrieve all saved mappings within a requested universe
   * Retrieves all people mappings within a requested universe. 
   * @param universeId Universe identifier. *To create a universe, use the &#x60;/universe&#39; endpoint.* (required)
   * @param clientId Filter by the clientId(s) created by the user in a previous mapping.  (optional)
   * @param mapStatus Filter by the Entity Decisions that have the specified mapStatus, where -   * MAPPED - The requested Entity Name is successfully mapped to a FactSet Entity Id (-E)   * UNMAPPED - The requested Entity Name is unmapped by FactSet.   * INDETERMINATE - The requested Entity Name was unable to make a mapping.  (optional)
   * @param offset Starting row for records to return or rows to skip. (optional, default to 0)
   * @param limit Limits the number of records in the response. (optional)
   * @return ApiResponse&lt;PeopleUniverseResponse&gt;
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
  public ApiResponse<PeopleUniverseResponse> getPeopleUniverseWithHttpInfo(Integer universeId, java.util.List<String> clientId, java.util.List<String> mapStatus, Integer offset, Integer limit) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'universeId' is set
    if (universeId == null) {
      throw new ApiException(400, "Missing the required parameter 'universeId' when calling getPeopleUniverse");
    }
    
    // create path and map variables
    String localVarPath = "/factset-concordance/v2/people-universe";

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

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        PeopleUniverseResponse
      
    > apiResponse = apiClient.invokeAPI("PeopleMappingApi.getPeopleUniverse", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getPeopleUniverseResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Retrieve all saved mappings within a requested universe or large list of client ids
   * Retrieves all people mappings that were saved in a given universe. Supports filtering by a large number of &#x60;clientId&#x60;s 
   * @param peopleUniverseRequest A request to fetch all entities of a given universe (required)
   * @return PeopleUniverseResponse
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
  public PeopleUniverseResponse getPeopleUniverseForList(PeopleUniverseRequest peopleUniverseRequest) throws ApiException {
    return getPeopleUniverseForListWithHttpInfo(peopleUniverseRequest).getData();
  }

  /**
   * Retrieve all saved mappings within a requested universe or large list of client ids
   * Retrieves all people mappings that were saved in a given universe. Supports filtering by a large number of &#x60;clientId&#x60;s 
   * @param peopleUniverseRequest A request to fetch all entities of a given universe (required)
   * @return ApiResponse&lt;PeopleUniverseResponse&gt;
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
  public ApiResponse<PeopleUniverseResponse> getPeopleUniverseForListWithHttpInfo(PeopleUniverseRequest peopleUniverseRequest) throws ApiException {
    Object localVarPostBody = peopleUniverseRequest;
    
    // verify the required parameter 'peopleUniverseRequest' is set
    if (peopleUniverseRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'peopleUniverseRequest' when calling getPeopleUniverseForList");
    }
    
    // create path and map variables
    String localVarPath = "/factset-concordance/v2/people-universe";

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
        
        PeopleUniverseResponse
      
    > apiResponse = apiClient.invokeAPI("PeopleMappingApi.getPeopleUniverseForList", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getPeopleUniverseForListResponseTypeMap, false);

    return apiResponse;

  }
}
