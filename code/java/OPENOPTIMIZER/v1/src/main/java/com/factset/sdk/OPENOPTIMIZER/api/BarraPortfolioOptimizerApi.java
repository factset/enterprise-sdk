package com.factset.sdk.OPENOPTIMIZER.api;

import com.factset.sdk.OPENOPTIMIZER.ApiException;
import com.factset.sdk.OPENOPTIMIZER.ApiClient;
import com.factset.sdk.OPENOPTIMIZER.ApiResponse;
import com.factset.sdk.OPENOPTIMIZER.Configuration;
import com.factset.sdk.OPENOPTIMIZER.Pair;

import jakarta.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.OPENOPTIMIZER.models.AvailableComponentsResponse;
import com.factset.sdk.OPENOPTIMIZER.models.AvailableStrategiesInput;
import com.factset.sdk.OPENOPTIMIZER.models.AvailableStrategiesResponse;
import com.factset.sdk.OPENOPTIMIZER.models.BPMNPOAvailableComponentsInput;
import com.factset.sdk.OPENOPTIMIZER.models.BPMOptimizationParametersRequest;
import com.factset.sdk.OPENOPTIMIZER.models.ClientErrorResponse;
import com.factset.sdk.OPENOPTIMIZER.models.OptimizationStatus;
import com.factset.sdk.OPENOPTIMIZER.models.ResultResponse;
import com.factset.sdk.OPENOPTIMIZER.models.SettingsGlobalVarsResponse;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class BarraPortfolioOptimizerApi {
  private ApiClient apiClient;

  public BarraPortfolioOptimizerApi() {
    this(Configuration.getDefaultApiClient());
  }

  public BarraPortfolioOptimizerApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> getGlobalVariablesBPMResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getGlobalVariablesBPMResponseTypeMap.put(200, new GenericType<SettingsGlobalVarsResponse>(){});
    getGlobalVariablesBPMResponseTypeMap.put(400, new GenericType<ClientErrorResponse>(){});
    getGlobalVariablesBPMResponseTypeMap.put(417, new GenericType<ClientErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> getOptimizationResultByIdBPMResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getOptimizationResultByIdBPMResponseTypeMap.put(200, new GenericType<ResultResponse>(){});
    getOptimizationResultByIdBPMResponseTypeMap.put(202, new GenericType<OptimizationStatus>(){});
    getOptimizationResultByIdBPMResponseTypeMap.put(400, new GenericType<ClientErrorResponse>(){});
    getOptimizationResultByIdBPMResponseTypeMap.put(417, new GenericType<ClientErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> getOptimizationStatusByIdBPMResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getOptimizationStatusByIdBPMResponseTypeMap.put(201, new GenericType<OptimizationStatus>(){});
    getOptimizationStatusByIdBPMResponseTypeMap.put(202, new GenericType<OptimizationStatus>(){});
    getOptimizationStatusByIdBPMResponseTypeMap.put(400, new GenericType<ClientErrorResponse>(){});
    getOptimizationStatusByIdBPMResponseTypeMap.put(417, new GenericType<ClientErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> postAndOptimizeBPMResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    postAndOptimizeBPMResponseTypeMap.put(202, new GenericType<OptimizationStatus>(){});
    postAndOptimizeBPMResponseTypeMap.put(400, new GenericType<ClientErrorResponse>(){});
    postAndOptimizeBPMResponseTypeMap.put(417, new GenericType<ClientErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> postComponentsBPMResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    postComponentsBPMResponseTypeMap.put(200, new GenericType<AvailableComponentsResponse>(){});
    postComponentsBPMResponseTypeMap.put(417, new GenericType<ClientErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> postStrategiesBPMResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    postStrategiesBPMResponseTypeMap.put(200, new GenericType<AvailableStrategiesResponse>(){});
    postStrategiesBPMResponseTypeMap.put(417, new GenericType<ClientErrorResponse>(){});
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
   * Returns a dictionary with the name-value pairs for all global variables.
   * Fetch all available global variables
   * @param cacheControl Standard HTTP header.  Accepts max-stale. (optional)
   * @return SettingsGlobalVarsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Name-value pairs for each global variable. </td><td>  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 400 </td><td> Invalid identifier provided. </td><td>  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 401 </td><td> Missing or invalid authentication. </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
       <tr><td> 403 </td><td> User is forbidden with current credentials </td><td>  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 417 </td><td> Optimization result was already returned, provided id was not a requested optimization, or the optimization was cancelled </td><td>  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 429 </td><td> Rate limit exceeded. Check the X-RateLimit-* headers and resend the request. </td><td>  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 500 </td><td> Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 503 </td><td> Request timed out. Retry the request in sometime. </td><td>  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  </td></tr>
     </table>
   */
  public SettingsGlobalVarsResponse getGlobalVariablesBPM(String cacheControl) throws ApiException {
    return getGlobalVariablesBPMWithHttpInfo(cacheControl).getData();
  }

  /**
   * Returns a dictionary with the name-value pairs for all global variables.
   * Fetch all available global variables
   * @param cacheControl Standard HTTP header.  Accepts max-stale. (optional)
   * @return ApiResponse&lt;SettingsGlobalVarsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Name-value pairs for each global variable. </td><td>  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 400 </td><td> Invalid identifier provided. </td><td>  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 401 </td><td> Missing or invalid authentication. </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
       <tr><td> 403 </td><td> User is forbidden with current credentials </td><td>  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 417 </td><td> Optimization result was already returned, provided id was not a requested optimization, or the optimization was cancelled </td><td>  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 429 </td><td> Rate limit exceeded. Check the X-RateLimit-* headers and resend the request. </td><td>  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 500 </td><td> Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 503 </td><td> Request timed out. Retry the request in sometime. </td><td>  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<SettingsGlobalVarsResponse> getGlobalVariablesBPMWithHttpInfo(String cacheControl) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/bpm/settings/global-variables";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();


    if (cacheControl != null)
      localVarHeaderParams.put("Cache-Control", apiClient.parameterToString(cacheControl));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        SettingsGlobalVarsResponse
      
    > apiResponse = apiClient.invokeAPI("BarraPortfolioOptimizerApi.getGlobalVariablesBPM", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getGlobalVariablesBPMResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Get BPM optimization result by id
   * This is the endpoint to get optimization result.  If the optimization result is available, a 200 is returned.   Otherwise, the optimization is still running and the body of the response will contain a detailed status in JSON besides its pickup id.
   * @param id from url, provided from the location header in the Create and Run FPO optimization endpoint (required)
   * @return ResultResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Gets the optimization result. </td><td>  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 202 </td><td> The request to run an optimization has been accepted. The response includes a 202 Accepted status code, the ID of the new resource, and a Location header with the URL to check the status of the optimization. </td><td>  * Location - URL to poll for the resulting optimization <br>  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 400 </td><td> Invalid identifier provided. </td><td>  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 401 </td><td> Missing or invalid authentication. </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
       <tr><td> 403 </td><td> User is forbidden with current credentials </td><td>  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 417 </td><td> Optimization result was already returned, provided id was not a requested optimization, or the optimization was cancelled </td><td>  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 429 </td><td> Rate limit exceeded. Check the X-RateLimit-* headers and resend the request. </td><td>  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 500 </td><td> Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 503 </td><td> Request timed out. Retry the request in sometime. </td><td>  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  </td></tr>
     </table>
   */
  public ResultResponse getOptimizationResultByIdBPM(String id) throws ApiException {
    return getOptimizationResultByIdBPMWithHttpInfo(id).getData();
  }

  /**
   * Get BPM optimization result by id
   * This is the endpoint to get optimization result.  If the optimization result is available, a 200 is returned.   Otherwise, the optimization is still running and the body of the response will contain a detailed status in JSON besides its pickup id.
   * @param id from url, provided from the location header in the Create and Run FPO optimization endpoint (required)
   * @return ApiResponse&lt;ResultResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Gets the optimization result. </td><td>  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 202 </td><td> The request to run an optimization has been accepted. The response includes a 202 Accepted status code, the ID of the new resource, and a Location header with the URL to check the status of the optimization. </td><td>  * Location - URL to poll for the resulting optimization <br>  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 400 </td><td> Invalid identifier provided. </td><td>  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 401 </td><td> Missing or invalid authentication. </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
       <tr><td> 403 </td><td> User is forbidden with current credentials </td><td>  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 417 </td><td> Optimization result was already returned, provided id was not a requested optimization, or the optimization was cancelled </td><td>  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 429 </td><td> Rate limit exceeded. Check the X-RateLimit-* headers and resend the request. </td><td>  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 500 </td><td> Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 503 </td><td> Request timed out. Retry the request in sometime. </td><td>  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<ResultResponse> getOptimizationResultByIdBPMWithHttpInfo(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getOptimizationResultByIdBPM");
    }
    
    // create path and map variables
    String localVarPath = "/bpm/{id}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

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
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        ResultResponse
      
    > apiResponse = apiClient.invokeAPI("BarraPortfolioOptimizerApi.getOptimizationResultByIdBPM", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getOptimizationResultByIdBPMResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Get BPM optimization status by id
   * This is the endpoint to check on the progress of a previously requested optimization.  If the optimization has finished computing, a 201 is returned and the result can be fetched using /bpm/{id} endpoint.   Otherwise, the optimization is still running and the body of the response will contain a detailed status in JSON besides its pickup id.
   * @param id from url, provided from the location header in the Create and Run BPM optimization endpoint (required)
   * @return OptimizationStatus
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> This indicates that the optimization is complete and the result is now available. </td><td>  * Location - URL to fetch the optimization result <br>  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 202 </td><td> Indicates optimization is in progress. The response body contains the detailed status. </td><td>  * Location - URL to poll for the resulting optimization <br>  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 400 </td><td> Invalid identifier provided. </td><td>  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 401 </td><td> Missing or invalid authentication. </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
       <tr><td> 403 </td><td> User is forbidden with current credentials </td><td>  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 417 </td><td> Optimization result was already returned, provided id was not a requested optimization, or the optimization was cancelled </td><td>  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 429 </td><td> Rate limit exceeded. Check the X-RateLimit-* headers and resend the request. </td><td>  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 500 </td><td> Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 503 </td><td> Request timed out. Retry the request in sometime. </td><td>  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  </td></tr>
     </table>
   */
  public OptimizationStatus getOptimizationStatusByIdBPM(String id) throws ApiException {
    return getOptimizationStatusByIdBPMWithHttpInfo(id).getData();
  }

  /**
   * Get BPM optimization status by id
   * This is the endpoint to check on the progress of a previously requested optimization.  If the optimization has finished computing, a 201 is returned and the result can be fetched using /bpm/{id} endpoint.   Otherwise, the optimization is still running and the body of the response will contain a detailed status in JSON besides its pickup id.
   * @param id from url, provided from the location header in the Create and Run BPM optimization endpoint (required)
   * @return ApiResponse&lt;OptimizationStatus&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> This indicates that the optimization is complete and the result is now available. </td><td>  * Location - URL to fetch the optimization result <br>  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 202 </td><td> Indicates optimization is in progress. The response body contains the detailed status. </td><td>  * Location - URL to poll for the resulting optimization <br>  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 400 </td><td> Invalid identifier provided. </td><td>  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 401 </td><td> Missing or invalid authentication. </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
       <tr><td> 403 </td><td> User is forbidden with current credentials </td><td>  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 417 </td><td> Optimization result was already returned, provided id was not a requested optimization, or the optimization was cancelled </td><td>  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 429 </td><td> Rate limit exceeded. Check the X-RateLimit-* headers and resend the request. </td><td>  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 500 </td><td> Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 503 </td><td> Request timed out. Retry the request in sometime. </td><td>  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<OptimizationStatus> getOptimizationStatusByIdBPMWithHttpInfo(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getOptimizationStatusByIdBPM");
    }
    
    // create path and map variables
    String localVarPath = "/bpm/{id}/status"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

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
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        OptimizationStatus
      
    > apiResponse = apiClient.invokeAPI("BarraPortfolioOptimizerApi.getOptimizationStatusByIdBPM", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getOptimizationStatusByIdBPMResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Create and Run BPM optimization
   * This endpoint runs BPM optimization specified in the POST body parameters.                Remarks:                * Any settings in POST body will act as a one-time override over the settings saved in the strategy document.
   * @param cacheControl Standard HTTP header.  Accepts max-stale. (optional)
   * @param bpMOptimizationParametersRequest Optimization Parameters (optional)
   * @return OptimizationStatus
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> The request to run an optimization has been accepted. The response includes a 202 Accepted status code, the ID of the new resource, and a Location header with the URL to check the status of the optimization. </td><td>  * Location - URL to poll for the resulting optimization <br>  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 400 </td><td> Invalid identifier provided. </td><td>  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 401 </td><td> Missing or invalid authentication. </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
       <tr><td> 403 </td><td> User is forbidden with current credentials </td><td>  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 417 </td><td> Optimization result was already returned, provided id was not a requested optimization, or the optimization was cancelled </td><td>  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 429 </td><td> Rate limit exceeded. Check the X-RateLimit-* headers and resend the request. </td><td>  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 500 </td><td> Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 503 </td><td> Request timed out. Retry the request in sometime. </td><td>  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  </td></tr>
     </table>
   */
  public OptimizationStatus postAndOptimizeBPM(String cacheControl, BPMOptimizationParametersRequest bpMOptimizationParametersRequest) throws ApiException {
    return postAndOptimizeBPMWithHttpInfo(cacheControl, bpMOptimizationParametersRequest).getData();
  }

  /**
   * Create and Run BPM optimization
   * This endpoint runs BPM optimization specified in the POST body parameters.                Remarks:                * Any settings in POST body will act as a one-time override over the settings saved in the strategy document.
   * @param cacheControl Standard HTTP header.  Accepts max-stale. (optional)
   * @param bpMOptimizationParametersRequest Optimization Parameters (optional)
   * @return ApiResponse&lt;OptimizationStatus&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> The request to run an optimization has been accepted. The response includes a 202 Accepted status code, the ID of the new resource, and a Location header with the URL to check the status of the optimization. </td><td>  * Location - URL to poll for the resulting optimization <br>  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 400 </td><td> Invalid identifier provided. </td><td>  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 401 </td><td> Missing or invalid authentication. </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
       <tr><td> 403 </td><td> User is forbidden with current credentials </td><td>  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 417 </td><td> Optimization result was already returned, provided id was not a requested optimization, or the optimization was cancelled </td><td>  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 429 </td><td> Rate limit exceeded. Check the X-RateLimit-* headers and resend the request. </td><td>  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 500 </td><td> Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 503 </td><td> Request timed out. Retry the request in sometime. </td><td>  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<OptimizationStatus> postAndOptimizeBPMWithHttpInfo(String cacheControl, BPMOptimizationParametersRequest bpMOptimizationParametersRequest) throws ApiException {
    Object localVarPostBody = bpMOptimizationParametersRequest;
    
    // create path and map variables
    String localVarPath = "/bpm/optimize";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();


    if (cacheControl != null)
      localVarHeaderParams.put("Cache-Control", apiClient.parameterToString(cacheControl));

    
    
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
        
        OptimizationStatus
      
    > apiResponse = apiClient.invokeAPI("BarraPortfolioOptimizerApi.postAndOptimizeBPM", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, postAndOptimizeBPMResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Returns a dictionary with individually-filtered metadata for each component type.
   * Fetch metadata for all FPO component types. Output is individually-filtered for each component type.
   * @param bpMNPOAvailableComponentsInput  (optional)
   * @return AvailableComponentsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A JSON object with filtered metadata for all requested components </td><td>  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 401 </td><td> Missing or invalid authentication. </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
       <tr><td> 403 </td><td> User is forbidden with current credentials </td><td>  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 415 </td><td> Missing/Invalid Content-Type header. Header needs to be set to application/json. </td><td>  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 417 </td><td> Expectation Failed </td><td>  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 429 </td><td> Rate limit exceeded. Check the X-RateLimit-* headers and resend the request. </td><td>  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 500 </td><td> Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 503 </td><td> Request timed out. Retry the request in sometime. </td><td>  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  </td></tr>
     </table>
   */
  public AvailableComponentsResponse postComponentsBPM(BPMNPOAvailableComponentsInput bpMNPOAvailableComponentsInput) throws ApiException {
    return postComponentsBPMWithHttpInfo(bpMNPOAvailableComponentsInput).getData();
  }

  /**
   * Returns a dictionary with individually-filtered metadata for each component type.
   * Fetch metadata for all FPO component types. Output is individually-filtered for each component type.
   * @param bpMNPOAvailableComponentsInput  (optional)
   * @return ApiResponse&lt;AvailableComponentsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A JSON object with filtered metadata for all requested components </td><td>  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 401 </td><td> Missing or invalid authentication. </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
       <tr><td> 403 </td><td> User is forbidden with current credentials </td><td>  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 415 </td><td> Missing/Invalid Content-Type header. Header needs to be set to application/json. </td><td>  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 417 </td><td> Expectation Failed </td><td>  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 429 </td><td> Rate limit exceeded. Check the X-RateLimit-* headers and resend the request. </td><td>  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 500 </td><td> Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 503 </td><td> Request timed out. Retry the request in sometime. </td><td>  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<AvailableComponentsResponse> postComponentsBPMWithHttpInfo(BPMNPOAvailableComponentsInput bpMNPOAvailableComponentsInput) throws ApiException {
    Object localVarPostBody = bpMNPOAvailableComponentsInput;
    
    // create path and map variables
    String localVarPath = "/bpm/settings/components";

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
        
        AvailableComponentsResponse
      
    > apiResponse = apiClient.invokeAPI("BarraPortfolioOptimizerApi.postComponentsBPM", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, postComponentsBPMResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Returns a dictionary containing all strategies stored in a specified directory. Returns all strategies if no directory is given.
   * Fetch available FPO Strategies
   * @param cacheControl Standard HTTP header.  Accepts max-stale. (optional)
   * @param availableStrategiesInput  (optional)
   * @return AvailableStrategiesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Expected response, contains the requested strategies. </td><td>  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 401 </td><td> Missing or invalid authentication. </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
       <tr><td> 403 </td><td> User is forbidden with current credentials </td><td>  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 415 </td><td> Missing/Invalid Content-Type header. Header needs to be set to application/json. </td><td>  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 417 </td><td> Expectation Failed </td><td>  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 429 </td><td> Rate limit exceeded. Check the X-RateLimit-* headers and resend the request. </td><td>  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 500 </td><td> Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 503 </td><td> Request timed out. Retry the request in sometime. </td><td>  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  </td></tr>
     </table>
   */
  public AvailableStrategiesResponse postStrategiesBPM(String cacheControl, AvailableStrategiesInput availableStrategiesInput) throws ApiException {
    return postStrategiesBPMWithHttpInfo(cacheControl, availableStrategiesInput).getData();
  }

  /**
   * Returns a dictionary containing all strategies stored in a specified directory. Returns all strategies if no directory is given.
   * Fetch available FPO Strategies
   * @param cacheControl Standard HTTP header.  Accepts max-stale. (optional)
   * @param availableStrategiesInput  (optional)
   * @return ApiResponse&lt;AvailableStrategiesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Expected response, contains the requested strategies. </td><td>  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 401 </td><td> Missing or invalid authentication. </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
       <tr><td> 403 </td><td> User is forbidden with current credentials </td><td>  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 415 </td><td> Missing/Invalid Content-Type header. Header needs to be set to application/json. </td><td>  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 417 </td><td> Expectation Failed </td><td>  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 429 </td><td> Rate limit exceeded. Check the X-RateLimit-* headers and resend the request. </td><td>  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 500 </td><td> Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 503 </td><td> Request timed out. Retry the request in sometime. </td><td>  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<AvailableStrategiesResponse> postStrategiesBPMWithHttpInfo(String cacheControl, AvailableStrategiesInput availableStrategiesInput) throws ApiException {
    Object localVarPostBody = availableStrategiesInput;
    
    // create path and map variables
    String localVarPath = "/bpm/settings/strategies";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();


    if (cacheControl != null)
      localVarHeaderParams.put("Cache-Control", apiClient.parameterToString(cacheControl));

    
    
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
        
        AvailableStrategiesResponse
      
    > apiResponse = apiClient.invokeAPI("BarraPortfolioOptimizerApi.postStrategiesBPM", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, postStrategiesBPMResponseTypeMap, false);

    return apiResponse;

  }
}
