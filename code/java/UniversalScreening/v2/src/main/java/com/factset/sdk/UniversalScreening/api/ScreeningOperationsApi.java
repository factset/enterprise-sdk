package com.factset.sdk.UniversalScreening.api;

import com.factset.sdk.UniversalScreening.ApiException;
import com.factset.sdk.UniversalScreening.ApiClient;
import com.factset.sdk.UniversalScreening.ApiResponse;
import com.factset.sdk.UniversalScreening.Configuration;
import com.factset.sdk.UniversalScreening.Pair;

import javax.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.UniversalScreening.models.ErrorArray;
import com.factset.sdk.UniversalScreening.models.PaginatedCalculationResponse;
import com.factset.sdk.UniversalScreening.models.ResourceStatusResponse;
import com.factset.sdk.UniversalScreening.models.ScreenArchiveOFDBParameters;
import com.factset.sdk.UniversalScreening.models.ScreenCalcParameters;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ScreeningOperationsApi {
  private ApiClient apiClient;

  public ScreeningOperationsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ScreeningOperationsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> getCalculateResultsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getCalculateResultsResponseTypeMap.put(200, new GenericType<PaginatedCalculationResponse>(){});
    getCalculateResultsResponseTypeMap.put(202, new GenericType<ResourceStatusResponse>(){});
    getCalculateResultsResponseTypeMap.put(400, new GenericType<ErrorArray>(){});
    getCalculateResultsResponseTypeMap.put(401, new GenericType<ErrorArray>(){});
    getCalculateResultsResponseTypeMap.put(404, new GenericType<ErrorArray>(){});
    getCalculateResultsResponseTypeMap.put(410, new GenericType<ErrorArray>(){});
  }

  private static final Map<Integer, GenericType> pollCalculateResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    pollCalculateResponseTypeMap.put(201, new GenericType<ResourceStatusResponse>(){});
    pollCalculateResponseTypeMap.put(202, new GenericType<ResourceStatusResponse>(){});
    pollCalculateResponseTypeMap.put(401, new GenericType<ErrorArray>(){});
    pollCalculateResponseTypeMap.put(404, new GenericType<ErrorArray>(){});
    pollCalculateResponseTypeMap.put(410, new GenericType<ErrorArray>(){});
  }

  private static final Map<Integer, GenericType> submitArchiveOFDBResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    submitArchiveOFDBResponseTypeMap.put(202, new GenericType<ResourceStatusResponse>(){});
    submitArchiveOFDBResponseTypeMap.put(400, new GenericType<ErrorArray>(){});
    submitArchiveOFDBResponseTypeMap.put(401, new GenericType<ErrorArray>(){});
    submitArchiveOFDBResponseTypeMap.put(429, new GenericType<ErrorArray>(){});
  }

  private static final Map<Integer, GenericType> submitCalculateResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    submitCalculateResponseTypeMap.put(202, new GenericType<ResourceStatusResponse>(){});
    submitCalculateResponseTypeMap.put(400, new GenericType<ErrorArray>(){});
    submitCalculateResponseTypeMap.put(401, new GenericType<ErrorArray>(){});
    submitCalculateResponseTypeMap.put(429, new GenericType<ErrorArray>(){});
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
   * 
   * Retrieve results of complete screen calculation. Screens with more than 10,000 rows will be returned in a paginated format. Results may be fetched in pages of 1,000 - 100,000 results with 10,000 being the default page size.
   * @param id Unique identifier for a screen calculation job (required)
   * @param paginationLimit Page size limit (minumum 1000, default 10,000, maximum 100,000) (optional)
   * @param paginationCursor Paging index (Initial request may omit) (optional)
   * @return PaginatedCalculationResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Paginated Screen Results and Metadata </td><td>  -  </td></tr>
       <tr><td> 202 </td><td> Calculation job still in progress </td><td>  * Location - Relative location to poll for status <br>  * X-FactSet-Api-PickUp-Progress - Screen progress <br>  </td></tr>
       <tr><td> 400 </td><td> The requested screen could not be opened. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Invalid or missing authentication. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Job ID not found. </td><td>  -  </td></tr>
       <tr><td> 410 </td><td> The results have been fetched for this ID. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  * Request-Key - Provide this key when reporting this issue <br>  </td></tr>
     </table>
   */
  public PaginatedCalculationResponse getCalculateResults(String id, Integer paginationLimit, Integer paginationCursor) throws ApiException {
    return getCalculateResultsWithHttpInfo(id, paginationLimit, paginationCursor).getData();
  }

  /**
   * 
   * Retrieve results of complete screen calculation. Screens with more than 10,000 rows will be returned in a paginated format. Results may be fetched in pages of 1,000 - 100,000 results with 10,000 being the default page size.
   * @param id Unique identifier for a screen calculation job (required)
   * @param paginationLimit Page size limit (minumum 1000, default 10,000, maximum 100,000) (optional)
   * @param paginationCursor Paging index (Initial request may omit) (optional)
   * @return ApiResponse&lt;PaginatedCalculationResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Paginated Screen Results and Metadata </td><td>  -  </td></tr>
       <tr><td> 202 </td><td> Calculation job still in progress </td><td>  * Location - Relative location to poll for status <br>  * X-FactSet-Api-PickUp-Progress - Screen progress <br>  </td></tr>
       <tr><td> 400 </td><td> The requested screen could not be opened. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Invalid or missing authentication. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Job ID not found. </td><td>  -  </td></tr>
       <tr><td> 410 </td><td> The results have been fetched for this ID. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  * Request-Key - Provide this key when reporting this issue <br>  </td></tr>
     </table>
   */
  public ApiResponse<PaginatedCalculationResponse> getCalculateResultsWithHttpInfo(String id, Integer paginationLimit, Integer paginationCursor) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getCalculateResults");
    }
    
    // create path and map variables
    String localVarPath = "/v2/job/{id}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_paginationLimit", paginationLimit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_paginationCursor", paginationCursor));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        PaginatedCalculationResponse
      
    > apiResponse = apiClient.invokeAPI("ScreeningOperationsApi.getCalculateResults", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getCalculateResultsResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * 
   * Polls the job with a given screen ID and returns job status
   * @param id Unique identifier for a screen calculation job (required)
   * @return ResourceStatusResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Job completed </td><td>  * Location - Relative location to poll for status <br>  * X-FactSet-Api-PickUp-Progress - Screen progress <br>  </td></tr>
       <tr><td> 202 </td><td> Calculation job still in progress </td><td>  * Location - Relative location to poll for status <br>  * X-FactSet-Api-PickUp-Progress - Screen progress <br>  </td></tr>
       <tr><td> 401 </td><td> Invalid or missing authentication. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Job ID not found. </td><td>  -  </td></tr>
       <tr><td> 410 </td><td> The results have been fetched for this ID. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  * Request-Key - Provide this key when reporting this issue <br>  </td></tr>
     </table>
   */
  public ResourceStatusResponse pollCalculate(String id) throws ApiException {
    return pollCalculateWithHttpInfo(id).getData();
  }

  /**
   * 
   * Polls the job with a given screen ID and returns job status
   * @param id Unique identifier for a screen calculation job (required)
   * @return ApiResponse&lt;ResourceStatusResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Job completed </td><td>  * Location - Relative location to poll for status <br>  * X-FactSet-Api-PickUp-Progress - Screen progress <br>  </td></tr>
       <tr><td> 202 </td><td> Calculation job still in progress </td><td>  * Location - Relative location to poll for status <br>  * X-FactSet-Api-PickUp-Progress - Screen progress <br>  </td></tr>
       <tr><td> 401 </td><td> Invalid or missing authentication. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Job ID not found. </td><td>  -  </td></tr>
       <tr><td> 410 </td><td> The results have been fetched for this ID. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  * Request-Key - Provide this key when reporting this issue <br>  </td></tr>
     </table>
   */
  public ApiResponse<ResourceStatusResponse> pollCalculateWithHttpInfo(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling pollCalculate");
    }
    
    // create path and map variables
    String localVarPath = "/v2/job/{id}/status"
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
        
        ResourceStatusResponse
      
    > apiResponse = apiClient.invokeAPI("ScreeningOperationsApi.pollCalculate", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, pollCalculateResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * 
   * Begins archive of screen to OFDB. Subject to rate limiting by serial.
   * @param screenArchiveOFDBParameters Data required for an archive to OFDB request (optional)
   * @return ResourceStatusResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Successful archive OFDB submission response, returns the job ID unique to this archive and the URL in the Location header to check the status of the archive. </td><td>  * Location - Relative location to poll for status <br>  * X-FactSet-Api-Units-Limit - Maximum number of jobs. <br>  * X-FactSet-Api-Units-Remaining - Number of available jobs. <br>  * RateLimit-Limit - Number of weekly jobs available. <br>  * RateLimit-Remaining - Number of remaining weekly jobs. <br>  * RateLimit-Reset - Time, in seconds, until weekly limit resets. <br>  </td></tr>
       <tr><td> 400 </td><td> Invalid request body. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Invalid or missing authentication. </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> Too many requests. </td><td>  * X-FactSet-Api-Units-Limit - Maximum number of jobs. <br>  * X-FactSet-Api-Units-Remaining - Number of available jobs. <br>  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  * Request-Key - Provide this key when reporting this issue <br>  </td></tr>
     </table>
   */
  public ResourceStatusResponse submitArchiveOFDB(ScreenArchiveOFDBParameters screenArchiveOFDBParameters) throws ApiException {
    return submitArchiveOFDBWithHttpInfo(screenArchiveOFDBParameters).getData();
  }

  /**
   * 
   * Begins archive of screen to OFDB. Subject to rate limiting by serial.
   * @param screenArchiveOFDBParameters Data required for an archive to OFDB request (optional)
   * @return ApiResponse&lt;ResourceStatusResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Successful archive OFDB submission response, returns the job ID unique to this archive and the URL in the Location header to check the status of the archive. </td><td>  * Location - Relative location to poll for status <br>  * X-FactSet-Api-Units-Limit - Maximum number of jobs. <br>  * X-FactSet-Api-Units-Remaining - Number of available jobs. <br>  * RateLimit-Limit - Number of weekly jobs available. <br>  * RateLimit-Remaining - Number of remaining weekly jobs. <br>  * RateLimit-Reset - Time, in seconds, until weekly limit resets. <br>  </td></tr>
       <tr><td> 400 </td><td> Invalid request body. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Invalid or missing authentication. </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> Too many requests. </td><td>  * X-FactSet-Api-Units-Limit - Maximum number of jobs. <br>  * X-FactSet-Api-Units-Remaining - Number of available jobs. <br>  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  * Request-Key - Provide this key when reporting this issue <br>  </td></tr>
     </table>
   */
  public ApiResponse<ResourceStatusResponse> submitArchiveOFDBWithHttpInfo(ScreenArchiveOFDBParameters screenArchiveOFDBParameters) throws ApiException {
    Object localVarPostBody = screenArchiveOFDBParameters;
    
    // create path and map variables
    String localVarPath = "/v2/job/archive";

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
        
        ResourceStatusResponse
      
    > apiResponse = apiClient.invokeAPI("ScreeningOperationsApi.submitArchiveOFDB", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, submitArchiveOFDBResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * 
   * Begins calculation of screen. Subject to rate limiting by serial.
   * @param screenCalcParameters Data required for a calculation request (optional)
   * @return ResourceStatusResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Successful calculation submission response, returns the job ID unique to this calculation and the URL in the Location header to check the status of the calculation. </td><td>  * Location - Relative location to poll for status <br>  * X-FactSet-Api-Units-Limit - Maximum number of jobs. <br>  * X-FactSet-Api-Units-Remaining - Number of available jobs. <br>  * RateLimit-Limit - Number of weekly jobs available. <br>  * RateLimit-Remaining - Number of remaining weekly jobs. <br>  * RateLimit-Reset - Time, in seconds, until weekly limit resets. <br>  </td></tr>
       <tr><td> 400 </td><td> Invalid request body. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Invalid or missing authentication. </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> Too many requests. </td><td>  * X-FactSet-Api-Units-Limit - Maximum number of jobs. <br>  * X-FactSet-Api-Units-Remaining - Number of available jobs. <br>  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  * Request-Key - Provide this key when reporting this issue <br>  </td></tr>
     </table>
   */
  public ResourceStatusResponse submitCalculate(ScreenCalcParameters screenCalcParameters) throws ApiException {
    return submitCalculateWithHttpInfo(screenCalcParameters).getData();
  }

  /**
   * 
   * Begins calculation of screen. Subject to rate limiting by serial.
   * @param screenCalcParameters Data required for a calculation request (optional)
   * @return ApiResponse&lt;ResourceStatusResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Successful calculation submission response, returns the job ID unique to this calculation and the URL in the Location header to check the status of the calculation. </td><td>  * Location - Relative location to poll for status <br>  * X-FactSet-Api-Units-Limit - Maximum number of jobs. <br>  * X-FactSet-Api-Units-Remaining - Number of available jobs. <br>  * RateLimit-Limit - Number of weekly jobs available. <br>  * RateLimit-Remaining - Number of remaining weekly jobs. <br>  * RateLimit-Reset - Time, in seconds, until weekly limit resets. <br>  </td></tr>
       <tr><td> 400 </td><td> Invalid request body. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Invalid or missing authentication. </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> Too many requests. </td><td>  * X-FactSet-Api-Units-Limit - Maximum number of jobs. <br>  * X-FactSet-Api-Units-Remaining - Number of available jobs. <br>  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  * Request-Key - Provide this key when reporting this issue <br>  </td></tr>
     </table>
   */
  public ApiResponse<ResourceStatusResponse> submitCalculateWithHttpInfo(ScreenCalcParameters screenCalcParameters) throws ApiException {
    Object localVarPostBody = screenCalcParameters;
    
    // create path and map variables
    String localVarPath = "/v2/job/calculate";

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
        
        ResourceStatusResponse
      
    > apiResponse = apiClient.invokeAPI("ScreeningOperationsApi.submitCalculate", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, submitCalculateResponseTypeMap, false);

    return apiResponse;

  }
}
