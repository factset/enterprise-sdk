package com.factset.sdk.UniversalScreening.api;

import com.factset.sdk.UniversalScreening.ApiException;
import com.factset.sdk.UniversalScreening.ApiClient;
import com.factset.sdk.UniversalScreening.ApiResponse;
import com.factset.sdk.UniversalScreening.Configuration;
import com.factset.sdk.UniversalScreening.Pair;

import jakarta.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.UniversalScreening.models.ErrorArray;
import java.io.File;
import com.factset.sdk.UniversalScreening.models.PaginatedCalculationResponse;
import com.factset.sdk.UniversalScreening.models.ResourceStatusResponse;
import com.factset.sdk.UniversalScreening.models.ScreenArchiveOFDBParameters;
import com.factset.sdk.UniversalScreening.models.ScreenCalcParameters;
import com.factset.sdk.UniversalScreening.models.ScreenExportParameters;
import com.factset.sdk.UniversalScreening.models.SubmitExportResponse;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

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
    getCalculateResultsResponseTypeMap.put(403, new GenericType<ErrorArray>(){});
    getCalculateResultsResponseTypeMap.put(404, new GenericType<ErrorArray>(){});
    getCalculateResultsResponseTypeMap.put(410, new GenericType<ErrorArray>(){});
    getCalculateResultsResponseTypeMap.put(429, new GenericType<ErrorArray>(){});
  }

  private static final Map<Integer, GenericType> getExportResultsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getExportResultsResponseTypeMap.put(200, new GenericType<File>(){});
    getExportResultsResponseTypeMap.put(202, new GenericType<ResourceStatusResponse>(){});
    getExportResultsResponseTypeMap.put(400, new GenericType<ErrorArray>(){});
    getExportResultsResponseTypeMap.put(401, new GenericType<ErrorArray>(){});
    getExportResultsResponseTypeMap.put(403, new GenericType<ErrorArray>(){});
    getExportResultsResponseTypeMap.put(404, new GenericType<ErrorArray>(){});
    getExportResultsResponseTypeMap.put(410, new GenericType<ErrorArray>(){});
    getExportResultsResponseTypeMap.put(429, new GenericType<ErrorArray>(){});
  }

  private static final Map<Integer, GenericType> pollCalculateResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    pollCalculateResponseTypeMap.put(201, new GenericType<ResourceStatusResponse>(){});
    pollCalculateResponseTypeMap.put(202, new GenericType<ResourceStatusResponse>(){});
    pollCalculateResponseTypeMap.put(401, new GenericType<ErrorArray>(){});
    pollCalculateResponseTypeMap.put(403, new GenericType<ErrorArray>(){});
    pollCalculateResponseTypeMap.put(404, new GenericType<ErrorArray>(){});
    pollCalculateResponseTypeMap.put(410, new GenericType<ErrorArray>(){});
    pollCalculateResponseTypeMap.put(429, new GenericType<ErrorArray>(){});
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

  private static final Map<Integer, GenericType> submitExportResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    submitExportResponseTypeMap.put(202, new GenericType<SubmitExportResponse>(){});
    submitExportResponseTypeMap.put(400, new GenericType<ErrorArray>(){});
    submitExportResponseTypeMap.put(401, new GenericType<ErrorArray>(){});
    submitExportResponseTypeMap.put(429, new GenericType<ErrorArray>(){});
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
   * @param id Unique identifier for a job. \&quot;Job\&quot; refers to a screen calculation or archival. (required)
   * @param paginationLimit Page size limit (minumum 1000, default 10,000, maximum 100,000) (optional, default to 10000)
   * @param paginationCursor Paging index (Initial request may omit) (optional, default to 0)
   * @return PaginatedCalculationResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Paginated Screen Results and Metadata </td><td>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 202 </td><td> Long-running job still in progress </td><td>  * Location -  <br>  * X-FactSet-Api-PickUp-Progress -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 400 </td><td> The requested screen could not be opened. </td><td>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 401 </td><td> Invalid or missing authentication. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> User is not authorized for this operation. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Job ID not found. </td><td>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 410 </td><td> The results have been fetched for this ID. </td><td>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 429 </td><td> Too many requests. </td><td>  * X-FactSet-Api-Units-Limit -  <br>  * X-FactSet-Api-Units-Remaining -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  * Retry-After -  <br>  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  * Request-Key - Provide this key when reporting this issue <br>  </td></tr>
     </table>
   */
  public PaginatedCalculationResponse getCalculateResults(java.util.UUID id, Integer paginationLimit, Integer paginationCursor) throws ApiException {
    return getCalculateResultsWithHttpInfo(id, paginationLimit, paginationCursor).getData();
  }

  /**
   * 
   * Retrieve results of complete screen calculation. Screens with more than 10,000 rows will be returned in a paginated format. Results may be fetched in pages of 1,000 - 100,000 results with 10,000 being the default page size.
   * @param id Unique identifier for a job. \&quot;Job\&quot; refers to a screen calculation or archival. (required)
   * @param paginationLimit Page size limit (minumum 1000, default 10,000, maximum 100,000) (optional, default to 10000)
   * @param paginationCursor Paging index (Initial request may omit) (optional, default to 0)
   * @return ApiResponse&lt;PaginatedCalculationResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Paginated Screen Results and Metadata </td><td>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 202 </td><td> Long-running job still in progress </td><td>  * Location -  <br>  * X-FactSet-Api-PickUp-Progress -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 400 </td><td> The requested screen could not be opened. </td><td>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 401 </td><td> Invalid or missing authentication. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> User is not authorized for this operation. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Job ID not found. </td><td>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 410 </td><td> The results have been fetched for this ID. </td><td>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 429 </td><td> Too many requests. </td><td>  * X-FactSet-Api-Units-Limit -  <br>  * X-FactSet-Api-Units-Remaining -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  * Retry-After -  <br>  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  * Request-Key - Provide this key when reporting this issue <br>  </td></tr>
     </table>
   */
  public ApiResponse<PaginatedCalculationResponse> getCalculateResultsWithHttpInfo(java.util.UUID id, Integer paginationLimit, Integer paginationCursor) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getCalculateResults");
    }
    
    // create path and map variables
    String localVarPath = "/job/{id}"
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
   * Retrieve results of an export request.
   * @param id Unique identifier for a job. \&quot;Job\&quot; refers to a screen calculation or archival. (required)
   * @return File
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Body of the requested export file. Content-type will be conditioned on requested export type. </td><td>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  * Content-Disposition -  <br>  </td></tr>
       <tr><td> 202 </td><td> Long-running job still in progress </td><td>  * Location -  <br>  * X-FactSet-Api-PickUp-Progress -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 400 </td><td> The requested screen could not be opened. </td><td>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 401 </td><td> Invalid or missing authentication. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> User is not authorized for this operation. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Job ID not found. </td><td>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 410 </td><td> The results have been fetched for this ID. </td><td>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 429 </td><td> Too many requests. </td><td>  * X-FactSet-Api-Units-Limit -  <br>  * X-FactSet-Api-Units-Remaining -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  * Retry-After -  <br>  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  * Request-Key - Provide this key when reporting this issue <br>  </td></tr>
     </table>
   */
  public File getExportResults(java.util.UUID id) throws ApiException {
    return getExportResultsWithHttpInfo(id).getData();
  }

  /**
   * 
   * Retrieve results of an export request.
   * @param id Unique identifier for a job. \&quot;Job\&quot; refers to a screen calculation or archival. (required)
   * @return ApiResponse&lt;File&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Body of the requested export file. Content-type will be conditioned on requested export type. </td><td>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  * Content-Disposition -  <br>  </td></tr>
       <tr><td> 202 </td><td> Long-running job still in progress </td><td>  * Location -  <br>  * X-FactSet-Api-PickUp-Progress -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 400 </td><td> The requested screen could not be opened. </td><td>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 401 </td><td> Invalid or missing authentication. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> User is not authorized for this operation. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Job ID not found. </td><td>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 410 </td><td> The results have been fetched for this ID. </td><td>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 429 </td><td> Too many requests. </td><td>  * X-FactSet-Api-Units-Limit -  <br>  * X-FactSet-Api-Units-Remaining -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  * Retry-After -  <br>  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  * Request-Key - Provide this key when reporting this issue <br>  </td></tr>
     </table>
   */
  public ApiResponse<File> getExportResultsWithHttpInfo(java.util.UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getExportResults");
    }
    
    // create path and map variables
    String localVarPath = "/job/{id}/export"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/pdf", "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet", "text/csv", "text/plain", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        File
      
    > apiResponse = apiClient.invokeAPI("ScreeningOperationsApi.getExportResults", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getExportResultsResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * 
   * Polls the job with a given screen ID and returns job status
   * @param id Unique identifier for a job. \&quot;Job\&quot; refers to a screen calculation or archival. (required)
   * @return ResourceStatusResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Job completed </td><td>  * Location -  <br>  * X-FactSet-Api-PickUp-Progress -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 202 </td><td> Long-running job still in progress </td><td>  * Location -  <br>  * X-FactSet-Api-PickUp-Progress -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 401 </td><td> Invalid or missing authentication. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> User is not authorized for this operation. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Job ID not found. </td><td>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 410 </td><td> The results have been fetched for this ID. </td><td>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 429 </td><td> Too many requests. </td><td>  * X-FactSet-Api-Units-Limit -  <br>  * X-FactSet-Api-Units-Remaining -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  * Retry-After -  <br>  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  * Request-Key - Provide this key when reporting this issue <br>  </td></tr>
     </table>
   */
  public ResourceStatusResponse pollCalculate(java.util.UUID id) throws ApiException {
    return pollCalculateWithHttpInfo(id).getData();
  }

  /**
   * 
   * Polls the job with a given screen ID and returns job status
   * @param id Unique identifier for a job. \&quot;Job\&quot; refers to a screen calculation or archival. (required)
   * @return ApiResponse&lt;ResourceStatusResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Job completed </td><td>  * Location -  <br>  * X-FactSet-Api-PickUp-Progress -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 202 </td><td> Long-running job still in progress </td><td>  * Location -  <br>  * X-FactSet-Api-PickUp-Progress -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 401 </td><td> Invalid or missing authentication. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> User is not authorized for this operation. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Job ID not found. </td><td>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 410 </td><td> The results have been fetched for this ID. </td><td>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 429 </td><td> Too many requests. </td><td>  * X-FactSet-Api-Units-Limit -  <br>  * X-FactSet-Api-Units-Remaining -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  * Retry-After -  <br>  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  * Request-Key - Provide this key when reporting this issue <br>  </td></tr>
     </table>
   */
  public ApiResponse<ResourceStatusResponse> pollCalculateWithHttpInfo(java.util.UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling pollCalculate");
    }
    
    // create path and map variables
    String localVarPath = "/job/{id}/status"
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
       <tr><td> 202 </td><td> Successful archive OFDB submission response, returns the job ID unique to this archive and the URL in the Location header to check the status of the archive. </td><td>  * Location -  <br>  * X-FactSet-Api-Units-Limit -  <br>  * X-FactSet-Api-Units-Remaining -  <br>  * X-RateLimit-Limit-604800 -  <br>  * X-RateLimit-Remaining-604800 -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 400 </td><td> Invalid request body. </td><td>  * X-RateLimit-Limit-604800 -  <br>  * X-RateLimit-Remaining-604800 -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 401 </td><td> Invalid or missing authentication. </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> Too many requests. </td><td>  * X-FactSet-Api-Units-Limit -  <br>  * X-FactSet-Api-Units-Remaining -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  * Retry-After -  <br>  </td></tr>
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
       <tr><td> 202 </td><td> Successful archive OFDB submission response, returns the job ID unique to this archive and the URL in the Location header to check the status of the archive. </td><td>  * Location -  <br>  * X-FactSet-Api-Units-Limit -  <br>  * X-FactSet-Api-Units-Remaining -  <br>  * X-RateLimit-Limit-604800 -  <br>  * X-RateLimit-Remaining-604800 -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 400 </td><td> Invalid request body. </td><td>  * X-RateLimit-Limit-604800 -  <br>  * X-RateLimit-Remaining-604800 -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 401 </td><td> Invalid or missing authentication. </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> Too many requests. </td><td>  * X-FactSet-Api-Units-Limit -  <br>  * X-FactSet-Api-Units-Remaining -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  * Retry-After -  <br>  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  * Request-Key - Provide this key when reporting this issue <br>  </td></tr>
     </table>
   */
  public ApiResponse<ResourceStatusResponse> submitArchiveOFDBWithHttpInfo(ScreenArchiveOFDBParameters screenArchiveOFDBParameters) throws ApiException {
    Object localVarPostBody = screenArchiveOFDBParameters;
    
    // create path and map variables
    String localVarPath = "/job/archive";

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
       <tr><td> 202 </td><td> Successful calculation submission response, returns the job ID unique to this calculation and the URL in the Location header to check the status of the calculation. </td><td>  * Location -  <br>  * X-FactSet-Api-Units-Limit -  <br>  * X-FactSet-Api-Units-Remaining -  <br>  * X-RateLimit-Limit-604800 -  <br>  * X-RateLimit-Remaining-604800 -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 400 </td><td> Invalid request body. </td><td>  * X-RateLimit-Limit-604800 -  <br>  * X-RateLimit-Remaining-604800 -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 401 </td><td> Invalid or missing authentication. </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> Too many requests. </td><td>  * X-FactSet-Api-Units-Limit -  <br>  * X-FactSet-Api-Units-Remaining -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  * Retry-After -  <br>  </td></tr>
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
       <tr><td> 202 </td><td> Successful calculation submission response, returns the job ID unique to this calculation and the URL in the Location header to check the status of the calculation. </td><td>  * Location -  <br>  * X-FactSet-Api-Units-Limit -  <br>  * X-FactSet-Api-Units-Remaining -  <br>  * X-RateLimit-Limit-604800 -  <br>  * X-RateLimit-Remaining-604800 -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 400 </td><td> Invalid request body. </td><td>  * X-RateLimit-Limit-604800 -  <br>  * X-RateLimit-Remaining-604800 -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 401 </td><td> Invalid or missing authentication. </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> Too many requests. </td><td>  * X-FactSet-Api-Units-Limit -  <br>  * X-FactSet-Api-Units-Remaining -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  * Retry-After -  <br>  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  * Request-Key - Provide this key when reporting this issue <br>  </td></tr>
     </table>
   */
  public ApiResponse<ResourceStatusResponse> submitCalculateWithHttpInfo(ScreenCalcParameters screenCalcParameters) throws ApiException {
    Object localVarPostBody = screenCalcParameters;
    
    // create path and map variables
    String localVarPath = "/job/calculate";

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
  /**
   * 
   * Begins the calculate and export of screen to specified file format. Subject to rate limiting by serial.
   * @param screenExportParameters Data required for an export request (optional)
   * @return SubmitExportResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Successful export submission response, returns the job ID unique to this export and the URL in the Location header to check the status of the export. </td><td>  * Location -  <br>  * X-FactSet-Api-Units-Limit -  <br>  * X-FactSet-Api-Units-Remaining -  <br>  * X-RateLimit-Limit-604800 -  <br>  * X-RateLimit-Remaining-604800 -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 400 </td><td> Invalid request body. </td><td>  * X-RateLimit-Limit-604800 -  <br>  * X-RateLimit-Remaining-604800 -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 401 </td><td> Invalid or missing authentication. </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> Too many requests. </td><td>  * X-FactSet-Api-Units-Limit -  <br>  * X-FactSet-Api-Units-Remaining -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  * Retry-After -  <br>  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  * Request-Key - Provide this key when reporting this issue <br>  </td></tr>
     </table>
   */
  public SubmitExportResponse submitExport(ScreenExportParameters screenExportParameters) throws ApiException {
    return submitExportWithHttpInfo(screenExportParameters).getData();
  }

  /**
   * 
   * Begins the calculate and export of screen to specified file format. Subject to rate limiting by serial.
   * @param screenExportParameters Data required for an export request (optional)
   * @return ApiResponse&lt;SubmitExportResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Successful export submission response, returns the job ID unique to this export and the URL in the Location header to check the status of the export. </td><td>  * Location -  <br>  * X-FactSet-Api-Units-Limit -  <br>  * X-FactSet-Api-Units-Remaining -  <br>  * X-RateLimit-Limit-604800 -  <br>  * X-RateLimit-Remaining-604800 -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 400 </td><td> Invalid request body. </td><td>  * X-RateLimit-Limit-604800 -  <br>  * X-RateLimit-Remaining-604800 -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 401 </td><td> Invalid or missing authentication. </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> Too many requests. </td><td>  * X-FactSet-Api-Units-Limit -  <br>  * X-FactSet-Api-Units-Remaining -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  * Retry-After -  <br>  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  * Request-Key - Provide this key when reporting this issue <br>  </td></tr>
     </table>
   */
  public ApiResponse<SubmitExportResponse> submitExportWithHttpInfo(ScreenExportParameters screenExportParameters) throws ApiException {
    Object localVarPostBody = screenExportParameters;
    
    // create path and map variables
    String localVarPath = "/job/export";

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
        
        SubmitExportResponse
      
    > apiResponse = apiClient.invokeAPI("ScreeningOperationsApi.submitExport", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, submitExportResponseTypeMap, false);

    return apiResponse;

  }
}
