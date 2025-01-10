package com.factset.sdk.FactSetProgrammaticEnvironment.api;

import com.factset.sdk.FactSetProgrammaticEnvironment.ApiException;
import com.factset.sdk.FactSetProgrammaticEnvironment.ApiClient;
import com.factset.sdk.FactSetProgrammaticEnvironment.ApiResponse;
import com.factset.sdk.FactSetProgrammaticEnvironment.Configuration;
import com.factset.sdk.FactSetProgrammaticEnvironment.Pair;

import jakarta.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.FactSetProgrammaticEnvironment.models.Calculation;
import com.factset.sdk.FactSetProgrammaticEnvironment.models.CalculationStatus;
import java.io.File;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class CalculationsApi {
  private ApiClient apiClient;

  public CalculationsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public CalculationsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> createCalculationsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    createCalculationsResponseTypeMap.put(202, new GenericType<CalculationStatus>(){});
  }

  private static final Map<Integer, GenericType> getCalculationsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getCalculationsResponseTypeMap.put(200, new GenericType<CalculationStatus>(){});
    getCalculationsResponseTypeMap.put(202, new GenericType<CalculationStatus>(){});
  }

  private static final Map<Integer, GenericType> getCalculationsLogResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getCalculationsLogResponseTypeMap.put(200, new GenericType<File>(){});
  }

  private static final Map<Integer, GenericType> getCalculationsOutputResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getCalculationsOutputResponseTypeMap.put(200, new GenericType<File>(){});
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
   * Starts a new script calculation
   * This endpoint takes a python script and starts executing it within FPE
   * @param calculation  (optional)
   * @return CalculationStatus
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Expected response, contains the relative URL in the Location header to check the status of the calculation. </td><td>  * Location - Relative URL to check status of the request. <br>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
       <tr><td> 400 </td><td> Invalid request body provided </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
       <tr><td> 500 </td><td> Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
       <tr><td> 503 </td><td> Request timeout. Retry the request later </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
     </table>
   */
  public CalculationStatus createCalculations(Calculation calculation) throws ApiException {
    return createCalculationsWithHttpInfo(calculation).getData();
  }

  /**
   * Starts a new script calculation
   * This endpoint takes a python script and starts executing it within FPE
   * @param calculation  (optional)
   * @return ApiResponse&lt;CalculationStatus&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Expected response, contains the relative URL in the Location header to check the status of the calculation. </td><td>  * Location - Relative URL to check status of the request. <br>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
       <tr><td> 400 </td><td> Invalid request body provided </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
       <tr><td> 500 </td><td> Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
       <tr><td> 503 </td><td> Request timeout. Retry the request later </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
     </table>
   */
  public ApiResponse<CalculationStatus> createCalculationsWithHttpInfo(Calculation calculation) throws ApiException {
    Object localVarPostBody = calculation;
    
    // create path and map variables
    String localVarPath = "/calculations";

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
        
        CalculationStatus
      
    > apiResponse = apiClient.invokeAPI("CalculationsApi.createCalculations", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, createCalculationsResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Get calculation status by id
   * This is the endpoint to check on the progress of a previous calculation request.
   * @param id From url, provided by location header or response body in the calculation start endpoint (required)
   * @return CalculationStatus
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Expected response. Signals that the calculation is finished. </td><td>  * Location - Relative URL to check status of the request. <br>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
       <tr><td> 202 </td><td> Expected response. Signals that the calculation is still in progress. </td><td>  * Location - Relative URL to check status of the request. <br>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
       <tr><td> 500 </td><td> Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
       <tr><td> 503 </td><td> Request timeout. Retry the request later </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
     </table>
   */
  public CalculationStatus getCalculations(String id) throws ApiException {
    return getCalculationsWithHttpInfo(id).getData();
  }

  /**
   * Get calculation status by id
   * This is the endpoint to check on the progress of a previous calculation request.
   * @param id From url, provided by location header or response body in the calculation start endpoint (required)
   * @return ApiResponse&lt;CalculationStatus&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Expected response. Signals that the calculation is finished. </td><td>  * Location - Relative URL to check status of the request. <br>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
       <tr><td> 202 </td><td> Expected response. Signals that the calculation is still in progress. </td><td>  * Location - Relative URL to check status of the request. <br>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
       <tr><td> 500 </td><td> Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
       <tr><td> 503 </td><td> Request timeout. Retry the request later </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
     </table>
   */
  public ApiResponse<CalculationStatus> getCalculationsWithHttpInfo(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getCalculations");
    }
    
    // create path and map variables
    String localVarPath = "/calculations/{id}"
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
        
        CalculationStatus
      
    > apiResponse = apiClient.invokeAPI("CalculationsApi.getCalculations", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getCalculationsResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Get calculation log for a specific calculation
   * This endpoint returns the log from the calculation.
   * @param id From url, provided by location header or response body in the calculation start endpoint (required)
   * @return File
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Expected response. Signals that the calculation is finished. Log from the calculation is returned. </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
       <tr><td> 202 </td><td> Expected response. Signals that the calculation is still in progress and no log is returned. </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
       <tr><td> 500 </td><td> Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
       <tr><td> 503 </td><td> Request timeout. Retry the request later </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
     </table>
   */
  public File getCalculationsLog(String id) throws ApiException {
    return getCalculationsLogWithHttpInfo(id).getData();
  }

  /**
   * Get calculation log for a specific calculation
   * This endpoint returns the log from the calculation.
   * @param id From url, provided by location header or response body in the calculation start endpoint (required)
   * @return ApiResponse&lt;File&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Expected response. Signals that the calculation is finished. Log from the calculation is returned. </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
       <tr><td> 202 </td><td> Expected response. Signals that the calculation is still in progress and no log is returned. </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
       <tr><td> 500 </td><td> Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
       <tr><td> 503 </td><td> Request timeout. Retry the request later </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
     </table>
   */
  public ApiResponse<File> getCalculationsLogWithHttpInfo(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getCalculationsLog");
    }
    
    // create path and map variables
    String localVarPath = "/calculations/{id}/log"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "text/plain"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        File
      
    > apiResponse = apiClient.invokeAPI("CalculationsApi.getCalculationsLog", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getCalculationsLogResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Get calculation output for a specific calculation
   * This endpoint returns the specified output from the calculation.
   * @param id From url, provided by location header or response body in the calculation start endpoint (required)
   * @return File
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Expected response. Signals that the calculation is finished. Output from the calculation is returned. </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  * Content-Type - The content type of the output specified in the calculation&#39;s script. <br>  </td></tr>
       <tr><td> 202 </td><td> Expected response. Signals that the calculation is still in progress and no output is returned. </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
       <tr><td> 500 </td><td> Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
       <tr><td> 503 </td><td> Request timeout. Retry the request later </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
     </table>
   */
  public File getCalculationsOutput(String id) throws ApiException {
    return getCalculationsOutputWithHttpInfo(id).getData();
  }

  /**
   * Get calculation output for a specific calculation
   * This endpoint returns the specified output from the calculation.
   * @param id From url, provided by location header or response body in the calculation start endpoint (required)
   * @return ApiResponse&lt;File&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Expected response. Signals that the calculation is finished. Output from the calculation is returned. </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  * Content-Type - The content type of the output specified in the calculation&#39;s script. <br>  </td></tr>
       <tr><td> 202 </td><td> Expected response. Signals that the calculation is still in progress and no output is returned. </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
       <tr><td> 500 </td><td> Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
       <tr><td> 503 </td><td> Request timeout. Retry the request later </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
     </table>
   */
  public ApiResponse<File> getCalculationsOutputWithHttpInfo(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getCalculationsOutput");
    }
    
    // create path and map variables
    String localVarPath = "/calculations/{id}/output"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        File
      
    > apiResponse = apiClient.invokeAPI("CalculationsApi.getCalculationsOutput", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getCalculationsOutputResponseTypeMap, false);

    return apiResponse;

  }
}
