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
import com.factset.sdk.FactSetPowerUtilities.models.HourlyGenerationRequest;
import com.factset.sdk.FactSetPowerUtilities.models.HourlyGenerationResponse;
import com.factset.sdk.FactSetPowerUtilities.models.MonthlyGenerationRequest;
import com.factset.sdk.FactSetPowerUtilities.models.MonthlyGenerationResponse;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class GenerationEmissionsApi {
  private ApiClient apiClient;

  public GenerationEmissionsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public GenerationEmissionsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> listHourlyGenerationUnitsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    listHourlyGenerationUnitsResponseTypeMap.put(200, new GenericType<HourlyGenerationResponse>(){});
    listHourlyGenerationUnitsResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    listHourlyGenerationUnitsResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    listHourlyGenerationUnitsResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    listHourlyGenerationUnitsResponseTypeMap.put(404, new GenericType<ErrorResponse>(){});
    listHourlyGenerationUnitsResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    listHourlyGenerationUnitsResponseTypeMap.put(422, new GenericType<ErrorResponse>(){});
    listHourlyGenerationUnitsResponseTypeMap.put(429, new GenericType<ErrorResponse>(){});
    listHourlyGenerationUnitsResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
    listHourlyGenerationUnitsResponseTypeMap.put(503, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> listMonthlyGenerationResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    listMonthlyGenerationResponseTypeMap.put(200, new GenericType<MonthlyGenerationResponse>(){});
    listMonthlyGenerationResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    listMonthlyGenerationResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    listMonthlyGenerationResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    listMonthlyGenerationResponseTypeMap.put(404, new GenericType<ErrorResponse>(){});
    listMonthlyGenerationResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    listMonthlyGenerationResponseTypeMap.put(422, new GenericType<ErrorResponse>(){});
    listMonthlyGenerationResponseTypeMap.put(429, new GenericType<ErrorResponse>(){});
    listMonthlyGenerationResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
    listMonthlyGenerationResponseTypeMap.put(503, new GenericType<ErrorResponse>(){});
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
   * Returns hourly plant unit generation and emissions
   * Returns hourly net generation and emissions for the requested power plant units over the specified date range. Each record provides net generation in MWh and reported emissions of CO₂, SO₂, and N₂O (nitrous oxide) in metric tons, along with heat input in MMBtu and steam generation.  This endpoint operates at the unit level, matching the underlying source data. 
   * @param hourlyGenerationRequest  (required)
   * @return HourlyGenerationResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with hourly generation and emissions </td><td>  -  </td></tr>
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
  public HourlyGenerationResponse listHourlyGenerationUnits(HourlyGenerationRequest hourlyGenerationRequest) throws ApiException {
    return listHourlyGenerationUnitsWithHttpInfo(hourlyGenerationRequest).getData();
  }

  /**
   * Returns hourly plant unit generation and emissions
   * Returns hourly net generation and emissions for the requested power plant units over the specified date range. Each record provides net generation in MWh and reported emissions of CO₂, SO₂, and N₂O (nitrous oxide) in metric tons, along with heat input in MMBtu and steam generation.  This endpoint operates at the unit level, matching the underlying source data. 
   * @param hourlyGenerationRequest  (required)
   * @return ApiResponse&lt;HourlyGenerationResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with hourly generation and emissions </td><td>  -  </td></tr>
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
  public ApiResponse<HourlyGenerationResponse> listHourlyGenerationUnitsWithHttpInfo(HourlyGenerationRequest hourlyGenerationRequest) throws ApiException {
    Object localVarPostBody = hourlyGenerationRequest;
    
    // verify the required parameter 'hourlyGenerationRequest' is set
    if (hourlyGenerationRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'hourlyGenerationRequest' when calling listHourlyGenerationUnits");
    }
    
    // create path and map variables
    String localVarPath = "/generation/hourly/units";

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
        
        HourlyGenerationResponse
      
    > apiResponse = apiClient.invokeAPI("GenerationEmissionsApi.listHourlyGenerationUnits", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, listHourlyGenerationUnitsResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Returns monthly plant generation and emissions
   * Returns monthly net generation and emissions for the requested power plants over the specified date range. Each record provides net generation in MWh, plant/fuel-type capacity and capacity factor, and total emissions of CO₂ (metric tons), SO₂ (short tons), and N₂O (nitrous oxide, short tons), along with heat input in MMBtu and a CO₂ intensity measure. 
   * @param monthlyGenerationRequest  (required)
   * @return MonthlyGenerationResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with monthly generation and emissions </td><td>  -  </td></tr>
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
  public MonthlyGenerationResponse listMonthlyGeneration(MonthlyGenerationRequest monthlyGenerationRequest) throws ApiException {
    return listMonthlyGenerationWithHttpInfo(monthlyGenerationRequest).getData();
  }

  /**
   * Returns monthly plant generation and emissions
   * Returns monthly net generation and emissions for the requested power plants over the specified date range. Each record provides net generation in MWh, plant/fuel-type capacity and capacity factor, and total emissions of CO₂ (metric tons), SO₂ (short tons), and N₂O (nitrous oxide, short tons), along with heat input in MMBtu and a CO₂ intensity measure. 
   * @param monthlyGenerationRequest  (required)
   * @return ApiResponse&lt;MonthlyGenerationResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with monthly generation and emissions </td><td>  -  </td></tr>
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
  public ApiResponse<MonthlyGenerationResponse> listMonthlyGenerationWithHttpInfo(MonthlyGenerationRequest monthlyGenerationRequest) throws ApiException {
    Object localVarPostBody = monthlyGenerationRequest;
    
    // verify the required parameter 'monthlyGenerationRequest' is set
    if (monthlyGenerationRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'monthlyGenerationRequest' when calling listMonthlyGeneration");
    }
    
    // create path and map variables
    String localVarPath = "/generation/monthly";

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
        
        MonthlyGenerationResponse
      
    > apiResponse = apiClient.invokeAPI("GenerationEmissionsApi.listMonthlyGeneration", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, listMonthlyGenerationResponseTypeMap, false);

    return apiResponse;

  }
}
