package com.factset.sdk.OFDB.api;

import com.factset.sdk.OFDB.ApiException;
import com.factset.sdk.OFDB.ApiClient;
import com.factset.sdk.OFDB.ApiResponse;
import com.factset.sdk.OFDB.Configuration;
import com.factset.sdk.OFDB.Pair;

import jakarta.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.OFDB.models.InlineResponse202;
import com.factset.sdk.OFDB.models.InlineResponse400;
import com.factset.sdk.OFDB.models.InlineResponse403;
import com.factset.sdk.OFDB.models.UpdateDate;
import com.factset.sdk.OFDB.models.UpdateDates;
import com.factset.sdk.OFDB.models.UpdateSymbol;
import com.factset.sdk.OFDB.models.UpdateSymbols;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class UpdateApi {
  private ApiClient apiClient;

  public UpdateApi() {
    this(Configuration.getDefaultApiClient());
  }

  public UpdateApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> updateDateResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    updateDateResponseTypeMap.put(202, new GenericType<InlineResponse202>(){});
    updateDateResponseTypeMap.put(400, new GenericType<InlineResponse400>(){});
    updateDateResponseTypeMap.put(403, new GenericType<InlineResponse403>(){});
    updateDateResponseTypeMap.put(404, new GenericType<InlineResponse403>(){});
    updateDateResponseTypeMap.put(406, new GenericType<InlineResponse403>(){});
    updateDateResponseTypeMap.put(413, new GenericType<InlineResponse403>(){});
    updateDateResponseTypeMap.put(429, new GenericType<InlineResponse403>(){});
  }

  private static final Map<Integer, GenericType> updateDatesResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    updateDatesResponseTypeMap.put(202, new GenericType<InlineResponse202>(){});
    updateDatesResponseTypeMap.put(400, new GenericType<InlineResponse400>(){});
    updateDatesResponseTypeMap.put(403, new GenericType<InlineResponse403>(){});
    updateDatesResponseTypeMap.put(404, new GenericType<InlineResponse403>(){});
    updateDatesResponseTypeMap.put(406, new GenericType<InlineResponse403>(){});
    updateDatesResponseTypeMap.put(413, new GenericType<InlineResponse403>(){});
    updateDatesResponseTypeMap.put(429, new GenericType<InlineResponse403>(){});
  }

  private static final Map<Integer, GenericType> updateSymbolResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    updateSymbolResponseTypeMap.put(202, new GenericType<InlineResponse202>(){});
    updateSymbolResponseTypeMap.put(400, new GenericType<InlineResponse400>(){});
    updateSymbolResponseTypeMap.put(403, new GenericType<InlineResponse403>(){});
    updateSymbolResponseTypeMap.put(404, new GenericType<InlineResponse403>(){});
    updateSymbolResponseTypeMap.put(406, new GenericType<InlineResponse403>(){});
    updateSymbolResponseTypeMap.put(413, new GenericType<InlineResponse403>(){});
    updateSymbolResponseTypeMap.put(429, new GenericType<InlineResponse403>(){});
  }

  private static final Map<Integer, GenericType> updateSymbolsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    updateSymbolsResponseTypeMap.put(202, new GenericType<InlineResponse202>(){});
    updateSymbolsResponseTypeMap.put(400, new GenericType<InlineResponse400>(){});
    updateSymbolsResponseTypeMap.put(403, new GenericType<InlineResponse403>(){});
    updateSymbolsResponseTypeMap.put(404, new GenericType<InlineResponse403>(){});
    updateSymbolsResponseTypeMap.put(406, new GenericType<InlineResponse403>(){});
    updateSymbolsResponseTypeMap.put(413, new GenericType<InlineResponse403>(){});
    updateSymbolsResponseTypeMap.put(429, new GenericType<InlineResponse403>(){});
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
   * Updates an existing date field value for single/multiple symbols or adds a new date/symbol within a date if not present in 3d database(OFDB).
   * @param path Encode database path (required)
   * @param date Date in YYYYMMDD format (required)
   * @param updateDate Required data for updating date in the database (required)
   * @return InlineResponse202
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Returns when the request is moved to long running mode. The next pickup URL is provided by the Location header. </td><td>  * Location -  <br>  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 400 </td><td> Invalid query parameter or value provided </td><td>  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 403 </td><td> User is forbidden with current credentials </td><td>  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 404 </td><td> Path not found </td><td>  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 406 </td><td> Unsupported Accept header. Header needs to be set to application/json </td><td>  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 413 </td><td> Post body too large </td><td>  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 429 </td><td> Rate limit reached. Wait till the time specified in Retry-After header value to make further requests. </td><td>  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  * Retry-After -  <br>  </td></tr>
       <tr><td> 500 </td><td> Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting </td><td>  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 503 </td><td> Request timed out. Retry the request in some time </td><td>  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  </td></tr>
     </table>
   */
  public InlineResponse202 updateDate(String path, Integer date, UpdateDate updateDate) throws ApiException {
    return updateDateWithHttpInfo(path, date, updateDate).getData();
  }

  /**
   * 
   * Updates an existing date field value for single/multiple symbols or adds a new date/symbol within a date if not present in 3d database(OFDB).
   * @param path Encode database path (required)
   * @param date Date in YYYYMMDD format (required)
   * @param updateDate Required data for updating date in the database (required)
   * @return ApiResponse&lt;InlineResponse202&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Returns when the request is moved to long running mode. The next pickup URL is provided by the Location header. </td><td>  * Location -  <br>  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 400 </td><td> Invalid query parameter or value provided </td><td>  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 403 </td><td> User is forbidden with current credentials </td><td>  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 404 </td><td> Path not found </td><td>  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 406 </td><td> Unsupported Accept header. Header needs to be set to application/json </td><td>  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 413 </td><td> Post body too large </td><td>  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 429 </td><td> Rate limit reached. Wait till the time specified in Retry-After header value to make further requests. </td><td>  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  * Retry-After -  <br>  </td></tr>
       <tr><td> 500 </td><td> Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting </td><td>  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 503 </td><td> Request timed out. Retry the request in some time </td><td>  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse202> updateDateWithHttpInfo(String path, Integer date, UpdateDate updateDate) throws ApiException {
    Object localVarPostBody = updateDate;
    
    // verify the required parameter 'path' is set
    if (path == null) {
      throw new ApiException(400, "Missing the required parameter 'path' when calling updateDate");
    }
    
    // verify the required parameter 'date' is set
    if (date == null) {
      throw new ApiException(400, "Missing the required parameter 'date' when calling updateDate");
    }
    
    // verify the required parameter 'updateDate' is set
    if (updateDate == null) {
      throw new ApiException(400, "Missing the required parameter 'updateDate' when calling updateDate");
    }
    
    // create path and map variables
    String localVarPath = "/database/{path}/dates/{date}"
      .replaceAll("\\{" + "path" + "\\}", apiClient.escapeString(path.toString()))
      .replaceAll("\\{" + "date" + "\\}", apiClient.escapeString(date.toString()));

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
        
        InlineResponse202
      
    > apiResponse = apiClient.invokeAPI("UpdateApi.updateDate", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, updateDateResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * 
   * Updates existing dates for single/multiple symbols or adds a new date/symbol within a date if not present in 3d database(OFDB).
   * @param path Encode database path (required)
   * @param updateDates Required data for updating date in the database (required)
   * @return InlineResponse202
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Returns when the request is moved to long running mode. The next pickup URL is provided by the Location header. </td><td>  * Location -  <br>  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 400 </td><td> Invalid query parameter or value provided </td><td>  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 403 </td><td> User is forbidden with current credentials </td><td>  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 404 </td><td> Path not found </td><td>  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 406 </td><td> Unsupported Accept header. Header needs to be set to application/json </td><td>  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 413 </td><td> Post body too large </td><td>  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 429 </td><td> Rate limit reached. Wait till the time specified in Retry-After header value to make further requests. </td><td>  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  * Retry-After -  <br>  </td></tr>
       <tr><td> 500 </td><td> Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting </td><td>  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 503 </td><td> Request timed out. Retry the request in some time </td><td>  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  </td></tr>
     </table>
   */
  public InlineResponse202 updateDates(String path, UpdateDates updateDates) throws ApiException {
    return updateDatesWithHttpInfo(path, updateDates).getData();
  }

  /**
   * 
   * Updates existing dates for single/multiple symbols or adds a new date/symbol within a date if not present in 3d database(OFDB).
   * @param path Encode database path (required)
   * @param updateDates Required data for updating date in the database (required)
   * @return ApiResponse&lt;InlineResponse202&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Returns when the request is moved to long running mode. The next pickup URL is provided by the Location header. </td><td>  * Location -  <br>  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 400 </td><td> Invalid query parameter or value provided </td><td>  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 403 </td><td> User is forbidden with current credentials </td><td>  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 404 </td><td> Path not found </td><td>  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 406 </td><td> Unsupported Accept header. Header needs to be set to application/json </td><td>  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 413 </td><td> Post body too large </td><td>  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 429 </td><td> Rate limit reached. Wait till the time specified in Retry-After header value to make further requests. </td><td>  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  * Retry-After -  <br>  </td></tr>
       <tr><td> 500 </td><td> Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting </td><td>  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 503 </td><td> Request timed out. Retry the request in some time </td><td>  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse202> updateDatesWithHttpInfo(String path, UpdateDates updateDates) throws ApiException {
    Object localVarPostBody = updateDates;
    
    // verify the required parameter 'path' is set
    if (path == null) {
      throw new ApiException(400, "Missing the required parameter 'path' when calling updateDates");
    }
    
    // verify the required parameter 'updateDates' is set
    if (updateDates == null) {
      throw new ApiException(400, "Missing the required parameter 'updateDates' when calling updateDates");
    }
    
    // create path and map variables
    String localVarPath = "/database/{path}/dates"
      .replaceAll("\\{" + "path" + "\\}", apiClient.escapeString(path.toString()));

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
        
        InlineResponse202
      
    > apiResponse = apiClient.invokeAPI("UpdateApi.updateDates", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, updateDatesResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * 
   * Updates an existing symbol field value for single/multiple dates or adds a new symbol/date within a symbol if not present in 3d database(OFDB). Updates an existing symbol field value or adds a new symbol if not present in the 2d database(OFDB)
   * @param path Encode database path (required)
   * @param symbol Symbol with in the ofdb (required)
   * @param updateSymbol Data for updating symbol in the database (required)
   * @return InlineResponse202
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Returns when the request is moved to long running mode. The next pickup URL is provided by the Location header. </td><td>  * Location -  <br>  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 400 </td><td> Invalid query parameter or value provided </td><td>  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 403 </td><td> User is forbidden with current credentials </td><td>  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 404 </td><td> Path not found </td><td>  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 406 </td><td> Unsupported Accept header. Header needs to be set to application/json </td><td>  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 413 </td><td> Post body too large </td><td>  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 429 </td><td> Rate limit reached. Wait till the time specified in Retry-After header value to make further requests. </td><td>  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  * Retry-After -  <br>  </td></tr>
       <tr><td> 500 </td><td> Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting </td><td>  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 503 </td><td> Request timed out. Retry the request in some time </td><td>  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  </td></tr>
     </table>
   */
  public InlineResponse202 updateSymbol(String path, String symbol, UpdateSymbol updateSymbol) throws ApiException {
    return updateSymbolWithHttpInfo(path, symbol, updateSymbol).getData();
  }

  /**
   * 
   * Updates an existing symbol field value for single/multiple dates or adds a new symbol/date within a symbol if not present in 3d database(OFDB). Updates an existing symbol field value or adds a new symbol if not present in the 2d database(OFDB)
   * @param path Encode database path (required)
   * @param symbol Symbol with in the ofdb (required)
   * @param updateSymbol Data for updating symbol in the database (required)
   * @return ApiResponse&lt;InlineResponse202&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Returns when the request is moved to long running mode. The next pickup URL is provided by the Location header. </td><td>  * Location -  <br>  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 400 </td><td> Invalid query parameter or value provided </td><td>  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 403 </td><td> User is forbidden with current credentials </td><td>  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 404 </td><td> Path not found </td><td>  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 406 </td><td> Unsupported Accept header. Header needs to be set to application/json </td><td>  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 413 </td><td> Post body too large </td><td>  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 429 </td><td> Rate limit reached. Wait till the time specified in Retry-After header value to make further requests. </td><td>  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  * Retry-After -  <br>  </td></tr>
       <tr><td> 500 </td><td> Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting </td><td>  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 503 </td><td> Request timed out. Retry the request in some time </td><td>  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse202> updateSymbolWithHttpInfo(String path, String symbol, UpdateSymbol updateSymbol) throws ApiException {
    Object localVarPostBody = updateSymbol;
    
    // verify the required parameter 'path' is set
    if (path == null) {
      throw new ApiException(400, "Missing the required parameter 'path' when calling updateSymbol");
    }
    
    // verify the required parameter 'symbol' is set
    if (symbol == null) {
      throw new ApiException(400, "Missing the required parameter 'symbol' when calling updateSymbol");
    }
    
    // verify the required parameter 'updateSymbol' is set
    if (updateSymbol == null) {
      throw new ApiException(400, "Missing the required parameter 'updateSymbol' when calling updateSymbol");
    }
    
    // create path and map variables
    String localVarPath = "/database/{path}/symbols/{symbol}"
      .replaceAll("\\{" + "path" + "\\}", apiClient.escapeString(path.toString()))
      .replaceAll("\\{" + "symbol" + "\\}", apiClient.escapeString(symbol.toString()));

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
        
        InlineResponse202
      
    > apiResponse = apiClient.invokeAPI("UpdateApi.updateSymbol", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, updateSymbolResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * 
   * Updates existing symbols for single/multiple dates or adds a new symbol/date within a symbol if not present in 3d database(OFDB). Updates an existing symbol field value or adds a new symbol if not present in the 2d database(OFDB)
   * @param path Encode database path (required)
   * @param updateSymbols Data for updating symbol in the database (required)
   * @return InlineResponse202
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Returns when the request is moved to long running mode. The next pickup URL is provided by the Location header. </td><td>  * Location -  <br>  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 400 </td><td> Invalid query parameter or value provided </td><td>  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 403 </td><td> User is forbidden with current credentials </td><td>  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 404 </td><td> Path not found </td><td>  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 406 </td><td> Unsupported Accept header. Header needs to be set to application/json </td><td>  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 413 </td><td> Post body too large </td><td>  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 429 </td><td> Rate limit reached. Wait till the time specified in Retry-After header value to make further requests. </td><td>  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  * Retry-After -  <br>  </td></tr>
       <tr><td> 500 </td><td> Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting </td><td>  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 503 </td><td> Request timed out. Retry the request in some time </td><td>  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  </td></tr>
     </table>
   */
  public InlineResponse202 updateSymbols(String path, UpdateSymbols updateSymbols) throws ApiException {
    return updateSymbolsWithHttpInfo(path, updateSymbols).getData();
  }

  /**
   * 
   * Updates existing symbols for single/multiple dates or adds a new symbol/date within a symbol if not present in 3d database(OFDB). Updates an existing symbol field value or adds a new symbol if not present in the 2d database(OFDB)
   * @param path Encode database path (required)
   * @param updateSymbols Data for updating symbol in the database (required)
   * @return ApiResponse&lt;InlineResponse202&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Returns when the request is moved to long running mode. The next pickup URL is provided by the Location header. </td><td>  * Location -  <br>  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 400 </td><td> Invalid query parameter or value provided </td><td>  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 403 </td><td> User is forbidden with current credentials </td><td>  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 404 </td><td> Path not found </td><td>  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 406 </td><td> Unsupported Accept header. Header needs to be set to application/json </td><td>  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 413 </td><td> Post body too large </td><td>  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 429 </td><td> Rate limit reached. Wait till the time specified in Retry-After header value to make further requests. </td><td>  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  * Retry-After -  <br>  </td></tr>
       <tr><td> 500 </td><td> Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting </td><td>  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  </td></tr>
       <tr><td> 503 </td><td> Request timed out. Retry the request in some time </td><td>  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse202> updateSymbolsWithHttpInfo(String path, UpdateSymbols updateSymbols) throws ApiException {
    Object localVarPostBody = updateSymbols;
    
    // verify the required parameter 'path' is set
    if (path == null) {
      throw new ApiException(400, "Missing the required parameter 'path' when calling updateSymbols");
    }
    
    // verify the required parameter 'updateSymbols' is set
    if (updateSymbols == null) {
      throw new ApiException(400, "Missing the required parameter 'updateSymbols' when calling updateSymbols");
    }
    
    // create path and map variables
    String localVarPath = "/database/{path}/symbols"
      .replaceAll("\\{" + "path" + "\\}", apiClient.escapeString(path.toString()));

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
        
        InlineResponse202
      
    > apiResponse = apiClient.invokeAPI("UpdateApi.updateSymbols", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, updateSymbolsResponseTypeMap, false);

    return apiResponse;

  }
}
