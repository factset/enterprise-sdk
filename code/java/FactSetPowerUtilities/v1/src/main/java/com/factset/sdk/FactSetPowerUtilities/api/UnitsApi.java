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

import com.factset.sdk.FactSetPowerUtilities.models.ErrorResponse;
import com.factset.sdk.FactSetPowerUtilities.models.PlantUnitsRequest;
import com.factset.sdk.FactSetPowerUtilities.models.PlantUnitsResponse;
import com.factset.sdk.FactSetPowerUtilities.models.UnitsOwnershipRequest;
import com.factset.sdk.FactSetPowerUtilities.models.UnitsOwnershipResponse;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class UnitsApi {
  private ApiClient apiClient;

  public UnitsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public UnitsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> listPlantUnitsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    listPlantUnitsResponseTypeMap.put(200, new GenericType<PlantUnitsResponse>(){});
    listPlantUnitsResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    listPlantUnitsResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    listPlantUnitsResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    listPlantUnitsResponseTypeMap.put(404, new GenericType<ErrorResponse>(){});
    listPlantUnitsResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    listPlantUnitsResponseTypeMap.put(422, new GenericType<ErrorResponse>(){});
    listPlantUnitsResponseTypeMap.put(429, new GenericType<ErrorResponse>(){});
    listPlantUnitsResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
    listPlantUnitsResponseTypeMap.put(503, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> listUnitsOwnershipResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    listUnitsOwnershipResponseTypeMap.put(200, new GenericType<UnitsOwnershipResponse>(){});
    listUnitsOwnershipResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    listUnitsOwnershipResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    listUnitsOwnershipResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    listUnitsOwnershipResponseTypeMap.put(404, new GenericType<ErrorResponse>(){});
    listUnitsOwnershipResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    listUnitsOwnershipResponseTypeMap.put(422, new GenericType<ErrorResponse>(){});
    listUnitsOwnershipResponseTypeMap.put(429, new GenericType<ErrorResponse>(){});
    listUnitsOwnershipResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
    listUnitsOwnershipResponseTypeMap.put(503, new GenericType<ErrorResponse>(){});
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
   * Returns power plant unit metadata and technical details
   * Returns metadata and technical detail data for one of five categories, selected via the &#x60;category&#x60; discriminator in the request body:  * **&#x60;Metadata&#x60;** — General plant metadata: plant name, ISO/TSO assignment, primary fuel type, nameplate capacity, operational status, owner details, and key lifecycle dates. * **&#x60;Pipeline&#x60;** — Gas pipeline connections: pipeline name and pipeline sequence (for units supplied by more than one pipeline). * **&#x60;Solar&#x60;** — Solar-specific technical specifications: installed capacity (DC), array/tracking type, tilt and azimuth angle, thin-film flag, and land area. * **&#x60;Wind&#x60;** — Wind turbine technical specifications: turbine count, model, manufacturer, hub height, and rotor swept area. * **&#x60;Thermal&#x60;** — Thermal/fossil technical specifications: design heat rate.  For unit ownership details, use &#x60;POST /units/ownership&#x60;.  This endpoint operates at the unit level, matching the underlying source data.  Reflects current data only; historical or point-in-time values are not retained.  **Input flexibility:** You can provide either plant IDs or unit IDs. When you provide a plant ID, all units within that plant are returned. Unit names, parent plant IDs, EIA codes, project grades, and regional mappings are included in the metadata response. 
   * @param plantUnitsRequest  (required)
   * @return PlantUnitsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response. Record shape matches the requested &#x60;category&#x60;. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request — the request was malformed or a required parameter was missing. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated — no valid credentials were provided. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden — the credentials provided do not have access to this resource. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found — the requested resource was not found. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type — the request body was not JSON or the Content-Type header was missing. </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity — the request was syntactically valid but semantically incorrect (e.g., invalid date range). </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> Too Many Requests — the rate limit for this endpoint has been exceeded. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error — an unexpected error occurred on the server. </td><td>  -  </td></tr>
       <tr><td> 503 </td><td> Service Unavailable — the service is temporarily unavailable. </td><td>  -  </td></tr>
     </table>
   */
  public PlantUnitsResponse listPlantUnits(PlantUnitsRequest plantUnitsRequest) throws ApiException {
    return listPlantUnitsWithHttpInfo(plantUnitsRequest).getData();
  }

  /**
   * Returns power plant unit metadata and technical details
   * Returns metadata and technical detail data for one of five categories, selected via the &#x60;category&#x60; discriminator in the request body:  * **&#x60;Metadata&#x60;** — General plant metadata: plant name, ISO/TSO assignment, primary fuel type, nameplate capacity, operational status, owner details, and key lifecycle dates. * **&#x60;Pipeline&#x60;** — Gas pipeline connections: pipeline name and pipeline sequence (for units supplied by more than one pipeline). * **&#x60;Solar&#x60;** — Solar-specific technical specifications: installed capacity (DC), array/tracking type, tilt and azimuth angle, thin-film flag, and land area. * **&#x60;Wind&#x60;** — Wind turbine technical specifications: turbine count, model, manufacturer, hub height, and rotor swept area. * **&#x60;Thermal&#x60;** — Thermal/fossil technical specifications: design heat rate.  For unit ownership details, use &#x60;POST /units/ownership&#x60;.  This endpoint operates at the unit level, matching the underlying source data.  Reflects current data only; historical or point-in-time values are not retained.  **Input flexibility:** You can provide either plant IDs or unit IDs. When you provide a plant ID, all units within that plant are returned. Unit names, parent plant IDs, EIA codes, project grades, and regional mappings are included in the metadata response. 
   * @param plantUnitsRequest  (required)
   * @return ApiResponse&lt;PlantUnitsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response. Record shape matches the requested &#x60;category&#x60;. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request — the request was malformed or a required parameter was missing. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated — no valid credentials were provided. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden — the credentials provided do not have access to this resource. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found — the requested resource was not found. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type — the request body was not JSON or the Content-Type header was missing. </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity — the request was syntactically valid but semantically incorrect (e.g., invalid date range). </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> Too Many Requests — the rate limit for this endpoint has been exceeded. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error — an unexpected error occurred on the server. </td><td>  -  </td></tr>
       <tr><td> 503 </td><td> Service Unavailable — the service is temporarily unavailable. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<PlantUnitsResponse> listPlantUnitsWithHttpInfo(PlantUnitsRequest plantUnitsRequest) throws ApiException {
    Object localVarPostBody = plantUnitsRequest;
    
    // verify the required parameter 'plantUnitsRequest' is set
    if (plantUnitsRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'plantUnitsRequest' when calling listPlantUnits");
    }
    
    // create path and map variables
    String localVarPath = "/units/details";

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
        
        PlantUnitsResponse
      
    > apiResponse = apiClient.invokeAPI("UnitsApi.listPlantUnits", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, listPlantUnitsResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Returns power plant unit ownership details
   * Returns ownership records for the specified unit IDs, including owner name, FactSet entity ID, ownership percentage, ultimate parent entity, and the plant ID for each unit.  This endpoint is a convenience endpoint that returns ownership data with the plant ID included. For other unit detail categories (metadata, pipeline, solar, wind, thermal), use &#x60;POST /units/details&#x60;.  Reflects current data only; historical or point-in-time values are not retained. 
   * @param unitsOwnershipRequest  (required)
   * @return UnitsOwnershipResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with unit ownership records. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request — the request was malformed or a required parameter was missing. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated — no valid credentials were provided. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden — the credentials provided do not have access to this resource. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found — the requested resource was not found. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type — the request body was not JSON or the Content-Type header was missing. </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity — the request was syntactically valid but semantically incorrect (e.g., invalid date range). </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> Too Many Requests — the rate limit for this endpoint has been exceeded. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error — an unexpected error occurred on the server. </td><td>  -  </td></tr>
       <tr><td> 503 </td><td> Service Unavailable — the service is temporarily unavailable. </td><td>  -  </td></tr>
     </table>
   */
  public UnitsOwnershipResponse listUnitsOwnership(UnitsOwnershipRequest unitsOwnershipRequest) throws ApiException {
    return listUnitsOwnershipWithHttpInfo(unitsOwnershipRequest).getData();
  }

  /**
   * Returns power plant unit ownership details
   * Returns ownership records for the specified unit IDs, including owner name, FactSet entity ID, ownership percentage, ultimate parent entity, and the plant ID for each unit.  This endpoint is a convenience endpoint that returns ownership data with the plant ID included. For other unit detail categories (metadata, pipeline, solar, wind, thermal), use &#x60;POST /units/details&#x60;.  Reflects current data only; historical or point-in-time values are not retained. 
   * @param unitsOwnershipRequest  (required)
   * @return ApiResponse&lt;UnitsOwnershipResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with unit ownership records. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request — the request was malformed or a required parameter was missing. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated — no valid credentials were provided. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden — the credentials provided do not have access to this resource. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found — the requested resource was not found. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type — the request body was not JSON or the Content-Type header was missing. </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity — the request was syntactically valid but semantically incorrect (e.g., invalid date range). </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> Too Many Requests — the rate limit for this endpoint has been exceeded. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error — an unexpected error occurred on the server. </td><td>  -  </td></tr>
       <tr><td> 503 </td><td> Service Unavailable — the service is temporarily unavailable. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<UnitsOwnershipResponse> listUnitsOwnershipWithHttpInfo(UnitsOwnershipRequest unitsOwnershipRequest) throws ApiException {
    Object localVarPostBody = unitsOwnershipRequest;
    
    // verify the required parameter 'unitsOwnershipRequest' is set
    if (unitsOwnershipRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'unitsOwnershipRequest' when calling listUnitsOwnership");
    }
    
    // create path and map variables
    String localVarPath = "/units/ownership";

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
        
        UnitsOwnershipResponse
      
    > apiResponse = apiClient.invokeAPI("UnitsApi.listUnitsOwnership", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, listUnitsOwnershipResponseTypeMap, false);

    return apiResponse;

  }
}
