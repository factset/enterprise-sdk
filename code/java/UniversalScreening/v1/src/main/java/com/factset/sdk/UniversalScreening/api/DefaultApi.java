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
import com.factset.sdk.UniversalScreening.models.InlineResponse200;
import com.factset.sdk.UniversalScreening.models.ResourceStatusResponse;
import com.factset.sdk.UniversalScreening.models.ScreenArchiveOFDBParameters;
import com.factset.sdk.UniversalScreening.models.ScreenCalcParameters;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DefaultApi {
  private ApiClient apiClient;

  public DefaultApi() {
    this(Configuration.getDefaultApiClient());
  }

  public DefaultApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

    private static final Map<Integer, GenericType> deleteActiveJobResponseTypeMap = new HashMap<Integer, GenericType>();
  private static final Map<Integer, GenericType> deleteAllActiveJobsResponseTypeMap = new HashMap<Integer, GenericType>();
  private static final Map<Integer, GenericType> getAllActiveJobsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getAllActiveJobsResponseTypeMap.put(200, new GenericType<InlineResponse200>(){});
    getAllActiveJobsResponseTypeMap.put(401, new GenericType<ErrorArray>(){});
    getAllActiveJobsResponseTypeMap.put(404, new GenericType<ErrorArray>(){});
  }
  private static final Map<Integer, GenericType> getCalculateResultsResponseTypeMap = new HashMap<Integer, GenericType>();
  private static final Map<Integer, GenericType> pollArchiveOFDBResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    pollArchiveOFDBResponseTypeMap.put(201, new GenericType<ResourceStatusResponse>(){});
    pollArchiveOFDBResponseTypeMap.put(202, new GenericType<ResourceStatusResponse>(){});
    pollArchiveOFDBResponseTypeMap.put(401, new GenericType<ErrorArray>(){});
    pollArchiveOFDBResponseTypeMap.put(404, new GenericType<ErrorArray>(){});
    pollArchiveOFDBResponseTypeMap.put(410, new GenericType<ErrorArray>(){});
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
   * Delete a specified job started by the requester&#39;s username-serial
   * @param id Unique identifier for a screen calculation job (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> No content </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Invalid or missing authentication. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Job ID not found. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  * Request-Key - Provide this key when reporting this issue <br>  </td></tr>
     </table>
   */
  public void deleteActiveJob(String id) throws ApiException {
    deleteActiveJobWithHttpInfo(id);
  }

  /**
   * 
   * Delete a specified job started by the requester&#39;s username-serial
   * @param id Unique identifier for a screen calculation job (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> No content </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Invalid or missing authentication. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Job ID not found. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  * Request-Key - Provide this key when reporting this issue <br>  </td></tr>
     </table>
   */
  public ApiResponse<Void> deleteActiveJobWithHttpInfo(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteActiveJob");
    }
    
    // create path and map variables
    String localVarPath = "/v1/calculations/{id}"
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
      Void
    > apiResponse = apiClient.invokeAPI("DefaultApi.deleteActiveJob", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, deleteActiveJobResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * 
   * Delete all active jobs started by the requester&#39;s username-serial
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Invalid or missing authentication. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Job ID not found. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  * Request-Key - Provide this key when reporting this issue <br>  </td></tr>
     </table>
   */
  public void deleteAllActiveJobs() throws ApiException {
    deleteAllActiveJobsWithHttpInfo();
  }

  /**
   * 
   * Delete all active jobs started by the requester&#39;s username-serial
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Invalid or missing authentication. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Job ID not found. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  * Request-Key - Provide this key when reporting this issue <br>  </td></tr>
     </table>
   */
  public ApiResponse<Void> deleteAllActiveJobsWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/v1/calculations";

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
      Void
    > apiResponse = apiClient.invokeAPI("DefaultApi.deleteAllActiveJobs", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, deleteAllActiveJobsResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * 
   * Retrieve list of all active job ids started by requester&#39;s username-serial
   * @return InlineResponse200
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> ActiveJobsResponse contains id of all of a user&#39;s active jobs </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Invalid or missing authentication. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Job ID not found. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  * Request-Key - Provide this key when reporting this issue <br>  </td></tr>
     </table>
   */
  public InlineResponse200 getAllActiveJobs() throws ApiException {
    return getAllActiveJobsWithHttpInfo().getData();
  }

  /**
   * 
   * Retrieve list of all active job ids started by requester&#39;s username-serial
   * @return ApiResponse&lt;InlineResponse200&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> ActiveJobsResponse contains id of all of a user&#39;s active jobs </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Invalid or missing authentication. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Job ID not found. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  * Request-Key - Provide this key when reporting this issue <br>  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse200> getAllActiveJobsWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/v1/calculations";

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
        
        InlineResponse200
      
    > apiResponse = apiClient.invokeAPI("DefaultApi.getAllActiveJobs", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getAllActiveJobsResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * 
   * Retrieve results of complete screen calculation. Screens with more than 10,000 rows will be returned in a paginated format. Results may be fetched in pages of 1,000 - 100,000 results with 10,000 being the default page size.
   * @param id Unique identifier for a screen calculation job (required)
   * @param paginationLimit Page size limit (minumum 1000, default 10,000, maximum 100,000) (optional)
   * @param paginationCursor Paging index (Initial request may omit) (optional)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Screen calculation complete. The screen results will be formatted as a STACH 2.0 table and in a property named data. In the case of pagination column metadata will only be returned with the first page. Results will be purged after they are retrieved or six hours. </td><td>  -  </td></tr>
       <tr><td> 202 </td><td> Calculation job still in progress </td><td>  * Location - Relative location to pick up screen calculation results <br>  * X-FactSet-Api-PickUp-Progress - Screen calculation progress <br>  </td></tr>
       <tr><td> 400 </td><td> The requested screen could not be opened. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Invalid or missing authentication. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Job ID not found. </td><td>  -  </td></tr>
       <tr><td> 410 </td><td> The results have been fetched for this ID. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  * Request-Key - Provide this key when reporting this issue <br>  </td></tr>
     </table>
   */
  public void getCalculateResults(String id, Integer paginationLimit, Integer paginationCursor) throws ApiException {
    getCalculateResultsWithHttpInfo(id, paginationLimit, paginationCursor);
  }

  /**
   * 
   * Retrieve results of complete screen calculation. Screens with more than 10,000 rows will be returned in a paginated format. Results may be fetched in pages of 1,000 - 100,000 results with 10,000 being the default page size.
   * @param id Unique identifier for a screen calculation job (required)
   * @param paginationLimit Page size limit (minumum 1000, default 10,000, maximum 100,000) (optional)
   * @param paginationCursor Paging index (Initial request may omit) (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Screen calculation complete. The screen results will be formatted as a STACH 2.0 table and in a property named data. In the case of pagination column metadata will only be returned with the first page. Results will be purged after they are retrieved or six hours. </td><td>  -  </td></tr>
       <tr><td> 202 </td><td> Calculation job still in progress </td><td>  * Location - Relative location to pick up screen calculation results <br>  * X-FactSet-Api-PickUp-Progress - Screen calculation progress <br>  </td></tr>
       <tr><td> 400 </td><td> The requested screen could not be opened. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Invalid or missing authentication. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Job ID not found. </td><td>  -  </td></tr>
       <tr><td> 410 </td><td> The results have been fetched for this ID. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  * Request-Key - Provide this key when reporting this issue <br>  </td></tr>
     </table>
   */
  public ApiResponse<Void> getCalculateResultsWithHttpInfo(String id, Integer paginationLimit, Integer paginationCursor) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getCalculateResults");
    }
    
    // create path and map variables
    String localVarPath = "/v1/calculations/{id}"
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
      Void
    > apiResponse = apiClient.invokeAPI("DefaultApi.getCalculateResults", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getCalculateResultsResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * 
   * Polls the archive OFDB job with a given archive job ID and returns job status
   * @param id Unique identifier for a screen archive to OFDB job (required)
   * @return ResourceStatusResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Archive job completed </td><td>  * X-FactSet-Api-PickUp-Progress - Screen calculation progress <br>  </td></tr>
       <tr><td> 202 </td><td> Archive job still in progress </td><td>  * Location - Relative location to pick up screen calculation results <br>  * X-FactSet-Api-PickUp-Progress - Screen calculation progress <br>  </td></tr>
       <tr><td> 401 </td><td> Invalid or missing authentication. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Job ID not found. </td><td>  -  </td></tr>
       <tr><td> 410 </td><td> The results have been fetched for this ID. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  * Request-Key - Provide this key when reporting this issue <br>  </td></tr>
     </table>
   */
  public ResourceStatusResponse pollArchiveOFDB(String id) throws ApiException {
    return pollArchiveOFDBWithHttpInfo(id).getData();
  }

  /**
   * 
   * Polls the archive OFDB job with a given archive job ID and returns job status
   * @param id Unique identifier for a screen archive to OFDB job (required)
   * @return ApiResponse&lt;ResourceStatusResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Archive job completed </td><td>  * X-FactSet-Api-PickUp-Progress - Screen calculation progress <br>  </td></tr>
       <tr><td> 202 </td><td> Archive job still in progress </td><td>  * Location - Relative location to pick up screen calculation results <br>  * X-FactSet-Api-PickUp-Progress - Screen calculation progress <br>  </td></tr>
       <tr><td> 401 </td><td> Invalid or missing authentication. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Job ID not found. </td><td>  -  </td></tr>
       <tr><td> 410 </td><td> The results have been fetched for this ID. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  * Request-Key - Provide this key when reporting this issue <br>  </td></tr>
     </table>
   */
  public ApiResponse<ResourceStatusResponse> pollArchiveOFDBWithHttpInfo(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling pollArchiveOFDB");
    }
    
    // create path and map variables
    String localVarPath = "/v1/archive/{id}/status"
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
      
    > apiResponse = apiClient.invokeAPI("DefaultApi.pollArchiveOFDB", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, pollArchiveOFDBResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * 
   * Polls the calculation job with a given screen calculation ID and returns job status
   * @param id Unique identifier for a screen calculation job (required)
   * @return ResourceStatusResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Calculation job completed </td><td>  * Location - Relative location to pick up screen calculation results <br>  * X-FactSet-Api-PickUp-Progress - Screen calculation progress <br>  </td></tr>
       <tr><td> 202 </td><td> Calculation job still in progress </td><td>  * Location - Relative location to pick up screen calculation results <br>  * X-FactSet-Api-PickUp-Progress - Screen calculation progress <br>  </td></tr>
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
   * Polls the calculation job with a given screen calculation ID and returns job status
   * @param id Unique identifier for a screen calculation job (required)
   * @return ApiResponse&lt;ResourceStatusResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Calculation job completed </td><td>  * Location - Relative location to pick up screen calculation results <br>  * X-FactSet-Api-PickUp-Progress - Screen calculation progress <br>  </td></tr>
       <tr><td> 202 </td><td> Calculation job still in progress </td><td>  * Location - Relative location to pick up screen calculation results <br>  * X-FactSet-Api-PickUp-Progress - Screen calculation progress <br>  </td></tr>
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
    String localVarPath = "/v1/calculations/{id}/status"
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
      
    > apiResponse = apiClient.invokeAPI("DefaultApi.pollCalculate", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, pollCalculateResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * 
   * Begins archive of screen to OFDB
   * @param screenArchiveOFDBParameters Data required for an archive to OFDB request (optional)
   * @return ResourceStatusResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Successful archive OFDB submission response, returns the job ID unique to this archive and the URL in the Location header to check the status of the archive. </td><td>  * Location - Relative location to pick up screen calculation results <br>  * X-FactSet-Api-Units-Limit - Maximum number of jobs. <br>  * X-FactSet-Api-Units-Remaining - Number of available jobs. <br>  </td></tr>
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
   * Begins archive of screen to OFDB
   * @param screenArchiveOFDBParameters Data required for an archive to OFDB request (optional)
   * @return ApiResponse&lt;ResourceStatusResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Successful archive OFDB submission response, returns the job ID unique to this archive and the URL in the Location header to check the status of the archive. </td><td>  * Location - Relative location to pick up screen calculation results <br>  * X-FactSet-Api-Units-Limit - Maximum number of jobs. <br>  * X-FactSet-Api-Units-Remaining - Number of available jobs. <br>  </td></tr>
       <tr><td> 400 </td><td> Invalid request body. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Invalid or missing authentication. </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> Too many requests. </td><td>  * X-FactSet-Api-Units-Limit - Maximum number of jobs. <br>  * X-FactSet-Api-Units-Remaining - Number of available jobs. <br>  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  * Request-Key - Provide this key when reporting this issue <br>  </td></tr>
     </table>
   */
  public ApiResponse<ResourceStatusResponse> submitArchiveOFDBWithHttpInfo(ScreenArchiveOFDBParameters screenArchiveOFDBParameters) throws ApiException {
    Object localVarPostBody = screenArchiveOFDBParameters;
    
    // create path and map variables
    String localVarPath = "/v1/archive";

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
      
    > apiResponse = apiClient.invokeAPI("DefaultApi.submitArchiveOFDB", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, submitArchiveOFDBResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * 
   * Begins calculation of screen
   * @param screenCalcParameters Data required for a calculation request (optional)
   * @return ResourceStatusResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Successful calculation submission response, returns the job ID unique to this calculation and the URL in the Location header to check the status of the calculation. </td><td>  * Location - Relative location to pick up screen calculation results <br>  * X-FactSet-Api-Units-Limit - Maximum number of jobs. <br>  * X-FactSet-Api-Units-Remaining - Number of available jobs. <br>  </td></tr>
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
   * Begins calculation of screen
   * @param screenCalcParameters Data required for a calculation request (optional)
   * @return ApiResponse&lt;ResourceStatusResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Successful calculation submission response, returns the job ID unique to this calculation and the URL in the Location header to check the status of the calculation. </td><td>  * Location - Relative location to pick up screen calculation results <br>  * X-FactSet-Api-Units-Limit - Maximum number of jobs. <br>  * X-FactSet-Api-Units-Remaining - Number of available jobs. <br>  </td></tr>
       <tr><td> 400 </td><td> Invalid request body. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Invalid or missing authentication. </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> Too many requests. </td><td>  * X-FactSet-Api-Units-Limit - Maximum number of jobs. <br>  * X-FactSet-Api-Units-Remaining - Number of available jobs. <br>  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  * Request-Key - Provide this key when reporting this issue <br>  </td></tr>
     </table>
   */
  public ApiResponse<ResourceStatusResponse> submitCalculateWithHttpInfo(ScreenCalcParameters screenCalcParameters) throws ApiException {
    Object localVarPostBody = screenCalcParameters;
    
    // create path and map variables
    String localVarPath = "/v1/calculations";

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
      
    > apiResponse = apiClient.invokeAPI("DefaultApi.submitCalculate", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, submitCalculateResponseTypeMap, false);

    return apiResponse;

  }
}
