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

import java.math.BigDecimal;
import com.factset.sdk.FactSetPowerUtilities.models.ErrorResponse;
import com.factset.sdk.FactSetPowerUtilities.models.PlantIdsResponse;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class PlantsApi {
  private ApiClient apiClient;

  public PlantsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public PlantsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> listPlantIdsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    listPlantIdsResponseTypeMap.put(200, new GenericType<PlantIdsResponse>(){});
    listPlantIdsResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    listPlantIdsResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    listPlantIdsResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    listPlantIdsResponseTypeMap.put(404, new GenericType<ErrorResponse>(){});
    listPlantIdsResponseTypeMap.put(429, new GenericType<ErrorResponse>(){});
    listPlantIdsResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
    listPlantIdsResponseTypeMap.put(503, new GenericType<ErrorResponse>(){});
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
   * Returns discoverable power plant IDs
   * Returns a paginated list of FactSet power plant asset identifiers matching the specified filter criteria, along with plant name, status, fuel type, and geographic location (nearest city, region, country, continent, and coordinates).  For unit-level metadata and technical details, see &#x60;POST /units/details&#x60;. You can provide either plant IDs or unit IDs to &#x60;/units/details&#x60; to retrieve unit-level data with full mapping information (unit names, EIA codes, grades, regions).  Reflects current data only; historical or point-in-time values are not retained. 
   * @param isoCode Filter plants by ISO/TSO market area code (e.g., &#x60;\&quot;ERCOT\&quot;&#x60;, &#x60;\&quot;PJM\&quot;&#x60; for US ISO/RTOs; other codes for non-US TSOs as coverage expands). (optional)
   * @param country Filter plants by country name (e.g., &#x60;\&quot;United States\&quot;&#x60;, &#x60;\&quot;Canada\&quot;&#x60;, &#x60;\&quot;United Kingdom\&quot;&#x60;). (optional)
   * @param region Filter plants by region (e.g., a US state name such as &#x60;\&quot;Texas\&quot;&#x60;, &#x60;\&quot;Tennessee\&quot;&#x60;). (optional)
   * @param plantStatus Filter plants by operational status. (optional)
   * @param plantIds Filter results to the specified FactSet plant asset identifiers. If omitted, all plants matching other filter criteria are returned. (optional)
   * @param minCapacityMw Filter plants by minimum nameplate capacity in megawatts (MW), inclusive. Returns plants with capacity greater than or equal to this value. (optional)
   * @param maxCapacityMw Filter plants by maximum nameplate capacity in megawatts (MW), inclusive. Returns plants with capacity less than or equal to this value. (optional)
   * @param paginationLimit Maximum number of results to return per request. (optional, default to 100)
   * @param paginationOffset Number of results to skip. Use with &#x60;_paginationLimit&#x60; for paging through large result sets. (optional, default to 0)
   * @return PlantIdsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with a list of plant identifiers </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request — the request was malformed or a required parameter was missing. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated — no valid credentials were provided. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden — the credentials provided do not have access to this resource. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found — the requested resource was not found. </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> Too Many Requests — the rate limit for this endpoint has been exceeded. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error — an unexpected error occurred on the server. </td><td>  -  </td></tr>
       <tr><td> 503 </td><td> Service Unavailable — the service is temporarily unavailable. </td><td>  -  </td></tr>
     </table>
   */
  public PlantIdsResponse listPlantIds(java.util.List<String> isoCode, java.util.List<String> country, java.util.List<String> region, java.util.List<String> plantStatus, java.util.List<String> plantIds, BigDecimal minCapacityMw, BigDecimal maxCapacityMw, Integer paginationLimit, Integer paginationOffset) throws ApiException {
    return listPlantIdsWithHttpInfo(isoCode, country, region, plantStatus, plantIds, minCapacityMw, maxCapacityMw, paginationLimit, paginationOffset).getData();
  }

  /**
   * Returns discoverable power plant IDs
   * Returns a paginated list of FactSet power plant asset identifiers matching the specified filter criteria, along with plant name, status, fuel type, and geographic location (nearest city, region, country, continent, and coordinates).  For unit-level metadata and technical details, see &#x60;POST /units/details&#x60;. You can provide either plant IDs or unit IDs to &#x60;/units/details&#x60; to retrieve unit-level data with full mapping information (unit names, EIA codes, grades, regions).  Reflects current data only; historical or point-in-time values are not retained. 
   * @param isoCode Filter plants by ISO/TSO market area code (e.g., &#x60;\&quot;ERCOT\&quot;&#x60;, &#x60;\&quot;PJM\&quot;&#x60; for US ISO/RTOs; other codes for non-US TSOs as coverage expands). (optional)
   * @param country Filter plants by country name (e.g., &#x60;\&quot;United States\&quot;&#x60;, &#x60;\&quot;Canada\&quot;&#x60;, &#x60;\&quot;United Kingdom\&quot;&#x60;). (optional)
   * @param region Filter plants by region (e.g., a US state name such as &#x60;\&quot;Texas\&quot;&#x60;, &#x60;\&quot;Tennessee\&quot;&#x60;). (optional)
   * @param plantStatus Filter plants by operational status. (optional)
   * @param plantIds Filter results to the specified FactSet plant asset identifiers. If omitted, all plants matching other filter criteria are returned. (optional)
   * @param minCapacityMw Filter plants by minimum nameplate capacity in megawatts (MW), inclusive. Returns plants with capacity greater than or equal to this value. (optional)
   * @param maxCapacityMw Filter plants by maximum nameplate capacity in megawatts (MW), inclusive. Returns plants with capacity less than or equal to this value. (optional)
   * @param paginationLimit Maximum number of results to return per request. (optional, default to 100)
   * @param paginationOffset Number of results to skip. Use with &#x60;_paginationLimit&#x60; for paging through large result sets. (optional, default to 0)
   * @return ApiResponse&lt;PlantIdsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with a list of plant identifiers </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request — the request was malformed or a required parameter was missing. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated — no valid credentials were provided. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden — the credentials provided do not have access to this resource. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found — the requested resource was not found. </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> Too Many Requests — the rate limit for this endpoint has been exceeded. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error — an unexpected error occurred on the server. </td><td>  -  </td></tr>
       <tr><td> 503 </td><td> Service Unavailable — the service is temporarily unavailable. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<PlantIdsResponse> listPlantIdsWithHttpInfo(java.util.List<String> isoCode, java.util.List<String> country, java.util.List<String> region, java.util.List<String> plantStatus, java.util.List<String> plantIds, BigDecimal minCapacityMw, BigDecimal maxCapacityMw, Integer paginationLimit, Integer paginationOffset) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/plants/ids";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "isoCode", isoCode));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "country", country));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "region", region));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "plantStatus", plantStatus));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "plantIds", plantIds));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "minCapacityMw", minCapacityMw));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "maxCapacityMw", maxCapacityMw));
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
        
        PlantIdsResponse
      
    > apiResponse = apiClient.invokeAPI("PlantsApi.listPlantIds", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, listPlantIdsResponseTypeMap, false);

    return apiResponse;

  }
}
