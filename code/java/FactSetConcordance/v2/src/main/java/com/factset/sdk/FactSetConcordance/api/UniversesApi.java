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

import com.factset.sdk.FactSetConcordance.models.CreateUniverseRequest;
import com.factset.sdk.FactSetConcordance.models.EntityUniverseStatisticsResponse;
import com.factset.sdk.FactSetConcordance.models.ErrorResponse;
import com.factset.sdk.FactSetConcordance.models.UniverseMetaResponse;
import com.factset.sdk.FactSetConcordance.models.UniverseStatisticsResponse;
import com.factset.sdk.FactSetConcordance.models.UniversesResponse;
import com.factset.sdk.FactSetConcordance.models.UpdateUniverseRequest;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UniversesApi {
  private ApiClient apiClient;

  public UniversesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public UniversesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> getEntityUniverseStatisticsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getEntityUniverseStatisticsResponseTypeMap.put(200, new GenericType<EntityUniverseStatisticsResponse>(){});
    getEntityUniverseStatisticsResponseTypeMap.put(0, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> getUniverseForListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getUniverseForListResponseTypeMap.put(200, new GenericType<UniverseMetaResponse>(){});
    getUniverseForListResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getUniverseForListResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getUniverseForListResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getUniverseForListResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getUniverseForListResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
    getUniverseForListResponseTypeMap.put(0, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> getUniverseStatisticsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getUniverseStatisticsResponseTypeMap.put(200, new GenericType<UniverseStatisticsResponse>(){});
    getUniverseStatisticsResponseTypeMap.put(0, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> getUniversesResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getUniversesResponseTypeMap.put(200, new GenericType<UniversesResponse>(){});
    getUniversesResponseTypeMap.put(0, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> getUpdateUniverseForListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getUpdateUniverseForListResponseTypeMap.put(200, new GenericType<UniverseMetaResponse>(){});
    getUpdateUniverseForListResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getUpdateUniverseForListResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getUpdateUniverseForListResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getUpdateUniverseForListResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getUpdateUniverseForListResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
    getUpdateUniverseForListResponseTypeMap.put(0, new GenericType<ErrorResponse>(){});
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
   * Get statistics on a given universe
   * Get the total number of mappings in a universe, as well as the number of mapped, unmapped and indeterminate mappings 
   * @param universeId Universe identifier. *To create a universe, use the &#x60;/universe&#39; endpoint.* (required)
   * @return EntityUniverseStatisticsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Response object for mapping statistics for a universe </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  -  </td></tr>
     </table>
   */
  public EntityUniverseStatisticsResponse getEntityUniverseStatistics(Integer universeId) throws ApiException {
    return getEntityUniverseStatisticsWithHttpInfo(universeId).getData();
  }

  /**
   * Get statistics on a given universe
   * Get the total number of mappings in a universe, as well as the number of mapped, unmapped and indeterminate mappings 
   * @param universeId Universe identifier. *To create a universe, use the &#x60;/universe&#39; endpoint.* (required)
   * @return ApiResponse&lt;EntityUniverseStatisticsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Response object for mapping statistics for a universe </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<EntityUniverseStatisticsResponse> getEntityUniverseStatisticsWithHttpInfo(Integer universeId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'universeId' is set
    if (universeId == null) {
      throw new ApiException(400, "Missing the required parameter 'universeId' when calling getEntityUniverseStatistics");
    }
    
    // create path and map variables
    String localVarPath = "/factset-concordance/v2/entity-universe-statistics";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "universeId", universeId));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        EntityUniverseStatisticsResponse
      
    > apiResponse = apiClient.invokeAPI("UniversesApi.getEntityUniverseStatistics", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getEntityUniverseStatisticsResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Create a new universe
   * Create a new universe that is distinct from any existing universe 
   * @param createUniverseRequest A request to create a user&#39;s universe (required)
   * @return UniverseMetaResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Metadata on a single universe </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  -  </td></tr>
     </table>
   */
  public UniverseMetaResponse getUniverseForList(CreateUniverseRequest createUniverseRequest) throws ApiException {
    return getUniverseForListWithHttpInfo(createUniverseRequest).getData();
  }

  /**
   * Create a new universe
   * Create a new universe that is distinct from any existing universe 
   * @param createUniverseRequest A request to create a user&#39;s universe (required)
   * @return ApiResponse&lt;UniverseMetaResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Metadata on a single universe </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<UniverseMetaResponse> getUniverseForListWithHttpInfo(CreateUniverseRequest createUniverseRequest) throws ApiException {
    Object localVarPostBody = createUniverseRequest;
    
    // verify the required parameter 'createUniverseRequest' is set
    if (createUniverseRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'createUniverseRequest' when calling getUniverseForList");
    }
    
    // create path and map variables
    String localVarPath = "/factset-concordance/v2/universe";

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
        
        UniverseMetaResponse
      
    > apiResponse = apiClient.invokeAPI("UniversesApi.getUniverseForList", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getUniverseForListResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Get statistics on a given universe
   * Get the total number of mappings in a universe, as well as the number of mapped, unmapped and indeterminate mappings 
   * @param universeId Universe identifier. *To create a universe, use the &#x60;/universe&#39; endpoint.* (required)
   * @return UniverseStatisticsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Response object for mapping statistics for a universe </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  -  </td></tr>
     </table>
   */
  public UniverseStatisticsResponse getUniverseStatistics(Integer universeId) throws ApiException {
    return getUniverseStatisticsWithHttpInfo(universeId).getData();
  }

  /**
   * Get statistics on a given universe
   * Get the total number of mappings in a universe, as well as the number of mapped, unmapped and indeterminate mappings 
   * @param universeId Universe identifier. *To create a universe, use the &#x60;/universe&#39; endpoint.* (required)
   * @return ApiResponse&lt;UniverseStatisticsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Response object for mapping statistics for a universe </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<UniverseStatisticsResponse> getUniverseStatisticsWithHttpInfo(Integer universeId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'universeId' is set
    if (universeId == null) {
      throw new ApiException(400, "Missing the required parameter 'universeId' when calling getUniverseStatistics");
    }
    
    // create path and map variables
    String localVarPath = "/factset-concordance/v2/universe-statistics";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "universeId", universeId));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        UniverseStatisticsResponse
      
    > apiResponse = apiClient.invokeAPI("UniversesApi.getUniverseStatistics", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getUniverseStatisticsResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Fetch metadata for universes
   * Fetch information on active universes for the current user. Optionally filter for a specific universe given a &#x60;universeId&#x60; 
   * @param universeId Universe identifier. *To create a universe, use the &#x60;/universe&#39; endpoint.* (optional)
   * @param universeType Universe Type. (optional)
   * @return UniversesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Metadata on multiple universes </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  -  </td></tr>
     </table>
   */
  public UniversesResponse getUniverses(Integer universeId, String universeType) throws ApiException {
    return getUniversesWithHttpInfo(universeId, universeType).getData();
  }

  /**
   * Fetch metadata for universes
   * Fetch information on active universes for the current user. Optionally filter for a specific universe given a &#x60;universeId&#x60; 
   * @param universeId Universe identifier. *To create a universe, use the &#x60;/universe&#39; endpoint.* (optional)
   * @param universeType Universe Type. (optional)
   * @return ApiResponse&lt;UniversesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Metadata on multiple universes </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<UniversesResponse> getUniversesWithHttpInfo(Integer universeId, String universeType) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/factset-concordance/v2/universes";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "universeId", universeId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "universeType", universeType));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        UniversesResponse
      
    > apiResponse = apiClient.invokeAPI("UniversesApi.getUniverses", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getUniversesResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Update metadata for an existing universe
   * Update metadata for an existing universe 
   * @param updateUniverseRequest A request to update a user&#39;s universe (required)
   * @return UniverseMetaResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Metadata on a single universe </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  -  </td></tr>
     </table>
   */
  public UniverseMetaResponse getUpdateUniverseForList(UpdateUniverseRequest updateUniverseRequest) throws ApiException {
    return getUpdateUniverseForListWithHttpInfo(updateUniverseRequest).getData();
  }

  /**
   * Update metadata for an existing universe
   * Update metadata for an existing universe 
   * @param updateUniverseRequest A request to update a user&#39;s universe (required)
   * @return ApiResponse&lt;UniverseMetaResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Metadata on a single universe </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<UniverseMetaResponse> getUpdateUniverseForListWithHttpInfo(UpdateUniverseRequest updateUniverseRequest) throws ApiException {
    Object localVarPostBody = updateUniverseRequest;
    
    // verify the required parameter 'updateUniverseRequest' is set
    if (updateUniverseRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'updateUniverseRequest' when calling getUpdateUniverseForList");
    }
    
    // create path and map variables
    String localVarPath = "/factset-concordance/v2/update-universe";

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
        
        UniverseMetaResponse
      
    > apiResponse = apiClient.invokeAPI("UniversesApi.getUpdateUniverseForList", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getUpdateUniverseForListResponseTypeMap, false);

    return apiResponse;

  }
}
