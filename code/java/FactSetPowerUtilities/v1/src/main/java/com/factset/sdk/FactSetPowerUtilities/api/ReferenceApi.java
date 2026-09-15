package com.factset.sdk.FactSetPowerUtilities.api;

import com.factset.sdk.FactSetPowerUtilities.ApiException;
import com.factset.sdk.FactSetPowerUtilities.ApiClient;
import com.factset.sdk.FactSetPowerUtilities.ApiResponse;
import com.factset.sdk.FactSetPowerUtilities.Configuration;
import com.factset.sdk.FactSetPowerUtilities.Pair;

import jakarta.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.FactSetPowerUtilities.models.EntityHistoryResponse;
import com.factset.sdk.FactSetPowerUtilities.models.ErrorResponse;
import com.factset.sdk.FactSetPowerUtilities.models.IsoMappingResponse;
import com.factset.sdk.FactSetPowerUtilities.models.LocationMappingResponse;
import com.factset.sdk.FactSetPowerUtilities.models.ZoneMappingResponse;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class ReferenceApi {
  private ApiClient apiClient;

  public ReferenceApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ReferenceApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> listEntityHistoryResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    listEntityHistoryResponseTypeMap.put(200, new GenericType<EntityHistoryResponse>(){});
    listEntityHistoryResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    listEntityHistoryResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    listEntityHistoryResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    listEntityHistoryResponseTypeMap.put(404, new GenericType<ErrorResponse>(){});
    listEntityHistoryResponseTypeMap.put(429, new GenericType<ErrorResponse>(){});
    listEntityHistoryResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
    listEntityHistoryResponseTypeMap.put(503, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> listIsoMappingResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    listIsoMappingResponseTypeMap.put(200, new GenericType<IsoMappingResponse>(){});
    listIsoMappingResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    listIsoMappingResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    listIsoMappingResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    listIsoMappingResponseTypeMap.put(404, new GenericType<ErrorResponse>(){});
    listIsoMappingResponseTypeMap.put(429, new GenericType<ErrorResponse>(){});
    listIsoMappingResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
    listIsoMappingResponseTypeMap.put(503, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> listLocationMappingResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    listLocationMappingResponseTypeMap.put(200, new GenericType<LocationMappingResponse>(){});
    listLocationMappingResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    listLocationMappingResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    listLocationMappingResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    listLocationMappingResponseTypeMap.put(404, new GenericType<ErrorResponse>(){});
    listLocationMappingResponseTypeMap.put(429, new GenericType<ErrorResponse>(){});
    listLocationMappingResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
    listLocationMappingResponseTypeMap.put(503, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> listZoneMappingResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    listZoneMappingResponseTypeMap.put(200, new GenericType<ZoneMappingResponse>(){});
    listZoneMappingResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    listZoneMappingResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    listZoneMappingResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    listZoneMappingResponseTypeMap.put(404, new GenericType<ErrorResponse>(){});
    listZoneMappingResponseTypeMap.put(429, new GenericType<ErrorResponse>(){});
    listZoneMappingResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
    listZoneMappingResponseTypeMap.put(503, new GenericType<ErrorResponse>(){});
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
   * Returns entity and security history records
   * Returns entity and security history records combining security-to-entity identifier mappings and entity ownership structure history, including immediate and ultimate parent entities.  **Helpful for:** Understanding entity relationships and parent-subsidiary structures related to plant ownership data returned by &#x60;POST /units/ownership&#x60;. 
   * @param factsetEntityId Filter records by a specific FactSet entity identifier (e.g., &#x60;\&quot;0GSF7D-E\&quot;&#x60;). (optional)
   * @param paginationLimit Maximum number of results to return per request. (optional, default to 100)
   * @param paginationOffset Number of results to skip. (optional, default to 0)
   * @return EntityHistoryResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with entity history records </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request — the request was malformed or a required parameter was missing. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated — no valid credentials were provided. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden — the credentials provided do not have access to this resource. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found — the requested resource was not found. </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> Too Many Requests — the rate limit for this endpoint has been exceeded. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error — an unexpected error occurred on the server. </td><td>  -  </td></tr>
       <tr><td> 503 </td><td> Service Unavailable — the service is temporarily unavailable. </td><td>  -  </td></tr>
     </table>
   */
  public EntityHistoryResponse listEntityHistory(String factsetEntityId, Integer paginationLimit, Integer paginationOffset) throws ApiException {
    return listEntityHistoryWithHttpInfo(factsetEntityId, paginationLimit, paginationOffset).getData();
  }

  /**
   * Returns entity and security history records
   * Returns entity and security history records combining security-to-entity identifier mappings and entity ownership structure history, including immediate and ultimate parent entities.  **Helpful for:** Understanding entity relationships and parent-subsidiary structures related to plant ownership data returned by &#x60;POST /units/ownership&#x60;. 
   * @param factsetEntityId Filter records by a specific FactSet entity identifier (e.g., &#x60;\&quot;0GSF7D-E\&quot;&#x60;). (optional)
   * @param paginationLimit Maximum number of results to return per request. (optional, default to 100)
   * @param paginationOffset Number of results to skip. (optional, default to 0)
   * @return ApiResponse&lt;EntityHistoryResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with entity history records </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request — the request was malformed or a required parameter was missing. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated — no valid credentials were provided. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden — the credentials provided do not have access to this resource. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found — the requested resource was not found. </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> Too Many Requests — the rate limit for this endpoint has been exceeded. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error — an unexpected error occurred on the server. </td><td>  -  </td></tr>
       <tr><td> 503 </td><td> Service Unavailable — the service is temporarily unavailable. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<EntityHistoryResponse> listEntityHistoryWithHttpInfo(String factsetEntityId, Integer paginationLimit, Integer paginationOffset) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/reference/entity-history";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "factsetEntityId", factsetEntityId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_paginationLimit", paginationLimit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_paginationOffset", paginationOffset));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        EntityHistoryResponse
      
    > apiResponse = apiClient.invokeAPI("ReferenceApi.listEntityHistory", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, listEntityHistoryResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Returns ISO/TSO mapping data
   * Returns the complete list of ISO/TSO codes and their corresponding names.  **Helpful for:** Use this endpoint to understand available ISO/TSO codes for filtering in &#x60;GET /plants/ids&#x60; (via the &#x60;isoCode&#x60; parameter) and &#x60;GET /market-data/coverage&#x60;.  Reflects current data only; historical or point-in-time values are not retained. 
   * @param paginationLimit Maximum number of results to return per request. (optional, default to 100)
   * @param paginationOffset Number of results to skip. (optional, default to 0)
   * @return IsoMappingResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with ISO/TSO mapping records </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request — the request was malformed or a required parameter was missing. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated — no valid credentials were provided. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden — the credentials provided do not have access to this resource. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found — the requested resource was not found. </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> Too Many Requests — the rate limit for this endpoint has been exceeded. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error — an unexpected error occurred on the server. </td><td>  -  </td></tr>
       <tr><td> 503 </td><td> Service Unavailable — the service is temporarily unavailable. </td><td>  -  </td></tr>
     </table>
   */
  public IsoMappingResponse listIsoMapping(Integer paginationLimit, Integer paginationOffset) throws ApiException {
    return listIsoMappingWithHttpInfo(paginationLimit, paginationOffset).getData();
  }

  /**
   * Returns ISO/TSO mapping data
   * Returns the complete list of ISO/TSO codes and their corresponding names.  **Helpful for:** Use this endpoint to understand available ISO/TSO codes for filtering in &#x60;GET /plants/ids&#x60; (via the &#x60;isoCode&#x60; parameter) and &#x60;GET /market-data/coverage&#x60;.  Reflects current data only; historical or point-in-time values are not retained. 
   * @param paginationLimit Maximum number of results to return per request. (optional, default to 100)
   * @param paginationOffset Number of results to skip. (optional, default to 0)
   * @return ApiResponse&lt;IsoMappingResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with ISO/TSO mapping records </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request — the request was malformed or a required parameter was missing. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated — no valid credentials were provided. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden — the credentials provided do not have access to this resource. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found — the requested resource was not found. </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> Too Many Requests — the rate limit for this endpoint has been exceeded. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error — an unexpected error occurred on the server. </td><td>  -  </td></tr>
       <tr><td> 503 </td><td> Service Unavailable — the service is temporarily unavailable. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<IsoMappingResponse> listIsoMappingWithHttpInfo(Integer paginationLimit, Integer paginationOffset) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/reference/iso-mapping";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_paginationLimit", paginationLimit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_paginationOffset", paginationOffset));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        IsoMappingResponse
      
    > apiResponse = apiClient.invokeAPI("ReferenceApi.listIsoMapping", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, listIsoMappingResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Returns power price location mapping data
   * Returns the list of ISO/TSO power price location codes (hub codes) used by &#x60;POST /prices&#x60; for the &#x60;Power&#x60;, &#x60;SparkSpread&#x60;, and &#x60;Forward&#x60; categories, with their names. Use the returned &#x60;locationId&#x60; values as input to those endpoints.  Note: these &#x60;iso_loc_code&#x60; identifiers are a distinct code space from the &#x60;iso_zone_code&#x60; identifiers used by &#x60;POST /prices?category&#x3D;Capacity&#x60; — see &#x60;GET /reference/zone-mapping&#x60; for those.  Reflects current data only; historical or point-in-time values are not retained. 
   * @param isoCode Filter locations by ISO/TSO market. (optional)
   * @param paginationLimit Maximum number of results to return per request. (optional, default to 100)
   * @param paginationOffset Number of results to skip. (optional, default to 0)
   * @return LocationMappingResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with power price location mapping records </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request — the request was malformed or a required parameter was missing. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated — no valid credentials were provided. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden — the credentials provided do not have access to this resource. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found — the requested resource was not found. </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> Too Many Requests — the rate limit for this endpoint has been exceeded. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error — an unexpected error occurred on the server. </td><td>  -  </td></tr>
       <tr><td> 503 </td><td> Service Unavailable — the service is temporarily unavailable. </td><td>  -  </td></tr>
     </table>
   */
  public LocationMappingResponse listLocationMapping(String isoCode, Integer paginationLimit, Integer paginationOffset) throws ApiException {
    return listLocationMappingWithHttpInfo(isoCode, paginationLimit, paginationOffset).getData();
  }

  /**
   * Returns power price location mapping data
   * Returns the list of ISO/TSO power price location codes (hub codes) used by &#x60;POST /prices&#x60; for the &#x60;Power&#x60;, &#x60;SparkSpread&#x60;, and &#x60;Forward&#x60; categories, with their names. Use the returned &#x60;locationId&#x60; values as input to those endpoints.  Note: these &#x60;iso_loc_code&#x60; identifiers are a distinct code space from the &#x60;iso_zone_code&#x60; identifiers used by &#x60;POST /prices?category&#x3D;Capacity&#x60; — see &#x60;GET /reference/zone-mapping&#x60; for those.  Reflects current data only; historical or point-in-time values are not retained. 
   * @param isoCode Filter locations by ISO/TSO market. (optional)
   * @param paginationLimit Maximum number of results to return per request. (optional, default to 100)
   * @param paginationOffset Number of results to skip. (optional, default to 0)
   * @return ApiResponse&lt;LocationMappingResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with power price location mapping records </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request — the request was malformed or a required parameter was missing. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated — no valid credentials were provided. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden — the credentials provided do not have access to this resource. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found — the requested resource was not found. </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> Too Many Requests — the rate limit for this endpoint has been exceeded. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error — an unexpected error occurred on the server. </td><td>  -  </td></tr>
       <tr><td> 503 </td><td> Service Unavailable — the service is temporarily unavailable. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<LocationMappingResponse> listLocationMappingWithHttpInfo(String isoCode, Integer paginationLimit, Integer paginationOffset) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/reference/location-mapping";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "isoCode", isoCode));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_paginationLimit", paginationLimit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_paginationOffset", paginationOffset));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        LocationMappingResponse
      
    > apiResponse = apiClient.invokeAPI("ReferenceApi.listLocationMapping", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, listLocationMappingResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Returns price zone and hub mapping data
   * Returns the list of ISO/TSO load distribution area and zone codes used by &#x60;POST /prices?category&#x3D;Capacity&#x60;, with their names, price units, and auction frequency. Use the returned &#x60;locationId&#x60; values as input to that endpoint.  Note: these &#x60;iso_zone_code&#x60; identifiers are a distinct code space from the &#x60;iso_loc_code&#x60; identifiers used by &#x60;POST /prices&#x60; for the &#x60;Power&#x60;, &#x60;SparkSpread&#x60;, and &#x60;Forward&#x60; categories.  Reflects current data only; historical or point-in-time values are not retained. 
   * @param isoCode Filter locations by ISO/TSO market. (optional)
   * @param paginationLimit Maximum number of results to return per request. (optional, default to 100)
   * @param paginationOffset Number of results to skip. (optional, default to 0)
   * @return ZoneMappingResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with zone and hub mapping records </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request — the request was malformed or a required parameter was missing. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated — no valid credentials were provided. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden — the credentials provided do not have access to this resource. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found — the requested resource was not found. </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> Too Many Requests — the rate limit for this endpoint has been exceeded. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error — an unexpected error occurred on the server. </td><td>  -  </td></tr>
       <tr><td> 503 </td><td> Service Unavailable — the service is temporarily unavailable. </td><td>  -  </td></tr>
     </table>
   */
  public ZoneMappingResponse listZoneMapping(String isoCode, Integer paginationLimit, Integer paginationOffset) throws ApiException {
    return listZoneMappingWithHttpInfo(isoCode, paginationLimit, paginationOffset).getData();
  }

  /**
   * Returns price zone and hub mapping data
   * Returns the list of ISO/TSO load distribution area and zone codes used by &#x60;POST /prices?category&#x3D;Capacity&#x60;, with their names, price units, and auction frequency. Use the returned &#x60;locationId&#x60; values as input to that endpoint.  Note: these &#x60;iso_zone_code&#x60; identifiers are a distinct code space from the &#x60;iso_loc_code&#x60; identifiers used by &#x60;POST /prices&#x60; for the &#x60;Power&#x60;, &#x60;SparkSpread&#x60;, and &#x60;Forward&#x60; categories.  Reflects current data only; historical or point-in-time values are not retained. 
   * @param isoCode Filter locations by ISO/TSO market. (optional)
   * @param paginationLimit Maximum number of results to return per request. (optional, default to 100)
   * @param paginationOffset Number of results to skip. (optional, default to 0)
   * @return ApiResponse&lt;ZoneMappingResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with zone and hub mapping records </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request — the request was malformed or a required parameter was missing. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated — no valid credentials were provided. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden — the credentials provided do not have access to this resource. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found — the requested resource was not found. </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> Too Many Requests — the rate limit for this endpoint has been exceeded. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error — an unexpected error occurred on the server. </td><td>  -  </td></tr>
       <tr><td> 503 </td><td> Service Unavailable — the service is temporarily unavailable. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ZoneMappingResponse> listZoneMappingWithHttpInfo(String isoCode, Integer paginationLimit, Integer paginationOffset) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/reference/zone-mapping";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "isoCode", isoCode));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_paginationLimit", paginationLimit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_paginationOffset", paginationOffset));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        ZoneMappingResponse
      
    > apiResponse = apiClient.invokeAPI("ReferenceApi.listZoneMapping", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, listZoneMappingResponseTypeMap, false);

    return apiResponse;

  }
}
