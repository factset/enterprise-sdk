package com.factset.sdk.AnalyticsDatastore.api;

import com.factset.sdk.AnalyticsDatastore.ApiException;
import com.factset.sdk.AnalyticsDatastore.ApiClient;
import com.factset.sdk.AnalyticsDatastore.ApiResponse;
import com.factset.sdk.AnalyticsDatastore.Configuration;
import com.factset.sdk.AnalyticsDatastore.Pair;

import javax.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import java.time.LocalDate;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MappingsApi {
  private ApiClient apiClient;

  public MappingsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public MappingsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> getInsightMappingResponseTypeMap = new HashMap<Integer, GenericType>();

  private static final Map<Integer, GenericType> getPdfPptMappingResponseTypeMap = new HashMap<Integer, GenericType>();

  private static final Map<Integer, GenericType> getStachMappingResponseTypeMap = new HashMap<Integer, GenericType>();

  private static final Map<Integer, GenericType> getStachMappingNoDateResponseTypeMap = new HashMap<Integer, GenericType>();

  


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
   * Redirects to the underlying Insight/Vault data in a Stach format.
   * The inclusion of a configId in the path indicates this is for Insight/Vault mappings only, as PA/SPAR mappings do not support the concept of configuration id.    Takes report parameter inputs and returns the object location for the specified report via a 302 redirect.    Note: Due to Swagger UI functionality, the redirect is automatically followed when using &#39;Try it out&#39;, so instead of the 302 Header response, a 200 is returned with the Cargo response Body.
   * @param document The Analytics Datafeed document containing the report (required)
   * @param assetName The PA/SPAR asset name and extension (required)
   * @param reportId The PA/SPAR report ID (required)
   * @param tileId The PA/SPAR tile ID (required)
   * @param accountId The account ID (required)
   * @param configId The Vault configuration ID (required)
   * @param date The as of date for the report (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 302 </td><td> Expected response, contains the Cargo URL in the Location header. </td><td>  * Location - Redirect URL to get Cargo object.    (example: https://api.factset.com/analytics/datastore/cargo/v1/groups/a4186c50f8e74f979d271dd22298c901/objects/fe875bc4150542dea6bc237663a01a0d) <br>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  </td></tr>
       <tr><td> 400 </td><td> Invalid parameter provided. </td><td>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  </td></tr>
       <tr><td> 401 </td><td> Missing or invalid authentication. </td><td>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  </td></tr>
       <tr><td> 403 </td><td> User is forbidden with current credentials </td><td>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  </td></tr>
       <tr><td> 404 </td><td> The provided request does not exist. </td><td>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  </td></tr>
       <tr><td> 500 </td><td> Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting </td><td>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  </td></tr>
       <tr><td> 503 </td><td> Request timed out. Retry the request in sometime. </td><td>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  </td></tr>
     </table>
   */
  public void getInsightMapping(String document, String assetName, String reportId, String tileId, String accountId, String configId, LocalDate date) throws ApiException {
    getInsightMappingWithHttpInfo(document, assetName, reportId, tileId, accountId, configId, date);
  }

  /**
   * Redirects to the underlying Insight/Vault data in a Stach format.
   * The inclusion of a configId in the path indicates this is for Insight/Vault mappings only, as PA/SPAR mappings do not support the concept of configuration id.    Takes report parameter inputs and returns the object location for the specified report via a 302 redirect.    Note: Due to Swagger UI functionality, the redirect is automatically followed when using &#39;Try it out&#39;, so instead of the 302 Header response, a 200 is returned with the Cargo response Body.
   * @param document The Analytics Datafeed document containing the report (required)
   * @param assetName The PA/SPAR asset name and extension (required)
   * @param reportId The PA/SPAR report ID (required)
   * @param tileId The PA/SPAR tile ID (required)
   * @param accountId The account ID (required)
   * @param configId The Vault configuration ID (required)
   * @param date The as of date for the report (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 302 </td><td> Expected response, contains the Cargo URL in the Location header. </td><td>  * Location - Redirect URL to get Cargo object.    (example: https://api.factset.com/analytics/datastore/cargo/v1/groups/a4186c50f8e74f979d271dd22298c901/objects/fe875bc4150542dea6bc237663a01a0d) <br>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  </td></tr>
       <tr><td> 400 </td><td> Invalid parameter provided. </td><td>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  </td></tr>
       <tr><td> 401 </td><td> Missing or invalid authentication. </td><td>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  </td></tr>
       <tr><td> 403 </td><td> User is forbidden with current credentials </td><td>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  </td></tr>
       <tr><td> 404 </td><td> The provided request does not exist. </td><td>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  </td></tr>
       <tr><td> 500 </td><td> Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting </td><td>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  </td></tr>
       <tr><td> 503 </td><td> Request timed out. Retry the request in sometime. </td><td>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  </td></tr>
     </table>
   */
  public ApiResponse<Void> getInsightMappingWithHttpInfo(String document, String assetName, String reportId, String tileId, String accountId, String configId, LocalDate date) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'document' is set
    if (document == null) {
      throw new ApiException(400, "Missing the required parameter 'document' when calling getInsightMapping");
    }
    
    // verify the required parameter 'assetName' is set
    if (assetName == null) {
      throw new ApiException(400, "Missing the required parameter 'assetName' when calling getInsightMapping");
    }
    
    // verify the required parameter 'reportId' is set
    if (reportId == null) {
      throw new ApiException(400, "Missing the required parameter 'reportId' when calling getInsightMapping");
    }
    
    // verify the required parameter 'tileId' is set
    if (tileId == null) {
      throw new ApiException(400, "Missing the required parameter 'tileId' when calling getInsightMapping");
    }
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getInsightMapping");
    }
    
    // verify the required parameter 'configId' is set
    if (configId == null) {
      throw new ApiException(400, "Missing the required parameter 'configId' when calling getInsightMapping");
    }
    
    // verify the required parameter 'date' is set
    if (date == null) {
      throw new ApiException(400, "Missing the required parameter 'date' when calling getInsightMapping");
    }
    
    // create path and map variables
    String localVarPath = "/analytics/pub-datastore/swivel/v1/{document}/{assetName}/{reportId}/{tileId}/{accountId}/{configId}/{date}"
      .replaceAll("\\{" + "document" + "\\}", apiClient.escapeString(document.toString()))
      .replaceAll("\\{" + "assetName" + "\\}", apiClient.escapeString(assetName.toString()))
      .replaceAll("\\{" + "reportId" + "\\}", apiClient.escapeString(reportId.toString()))
      .replaceAll("\\{" + "tileId" + "\\}", apiClient.escapeString(tileId.toString()))
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "configId" + "\\}", apiClient.escapeString(configId.toString()))
      .replaceAll("\\{" + "date" + "\\}", apiClient.escapeString(date.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
      Void
    > apiResponse = apiClient.invokeAPI("MappingsApi.getInsightMapping", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getInsightMappingResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Redirects to the raw PPT/PDF output created by the Publisher service.
   * Takes report parameter inputs and returns the object location for the specified report via a 302 redirect.    Note: Due to Swagger UI functionality, the redirect is automatically followed when using &#39;Try it out&#39;, so instead of the 302 Header response, a 200 is returned with the Cargo response Body.
   * @param document The Publisher document containing the report (required)
   * @param accountId The account ID (required)
   * @param date The as of date for the report (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 302 </td><td> Expected response, contains the Cargo URL in the Location header. </td><td>  * Location - Redirect URL to get Cargo object.    (example: https://api.factset.com/analytics/datastore/cargo/v1/groups/a4186c50f8e74f979d271dd22298c901/objects/fe875bc4150542dea6bc237663a01a0d) <br>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  </td></tr>
       <tr><td> 400 </td><td> Invalid parameter provided. </td><td>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  </td></tr>
       <tr><td> 401 </td><td> Missing or invalid authentication. </td><td>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  </td></tr>
       <tr><td> 403 </td><td> User is forbidden with current credentials </td><td>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  </td></tr>
       <tr><td> 404 </td><td> The provided request does not exist. </td><td>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  </td></tr>
       <tr><td> 500 </td><td> Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting </td><td>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  </td></tr>
       <tr><td> 503 </td><td> Request timed out. Retry the request in sometime. </td><td>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  </td></tr>
     </table>
   */
  public void getPdfPptMapping(String document, String accountId, LocalDate date) throws ApiException {
    getPdfPptMappingWithHttpInfo(document, accountId, date);
  }

  /**
   * Redirects to the raw PPT/PDF output created by the Publisher service.
   * Takes report parameter inputs and returns the object location for the specified report via a 302 redirect.    Note: Due to Swagger UI functionality, the redirect is automatically followed when using &#39;Try it out&#39;, so instead of the 302 Header response, a 200 is returned with the Cargo response Body.
   * @param document The Publisher document containing the report (required)
   * @param accountId The account ID (required)
   * @param date The as of date for the report (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 302 </td><td> Expected response, contains the Cargo URL in the Location header. </td><td>  * Location - Redirect URL to get Cargo object.    (example: https://api.factset.com/analytics/datastore/cargo/v1/groups/a4186c50f8e74f979d271dd22298c901/objects/fe875bc4150542dea6bc237663a01a0d) <br>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  </td></tr>
       <tr><td> 400 </td><td> Invalid parameter provided. </td><td>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  </td></tr>
       <tr><td> 401 </td><td> Missing or invalid authentication. </td><td>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  </td></tr>
       <tr><td> 403 </td><td> User is forbidden with current credentials </td><td>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  </td></tr>
       <tr><td> 404 </td><td> The provided request does not exist. </td><td>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  </td></tr>
       <tr><td> 500 </td><td> Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting </td><td>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  </td></tr>
       <tr><td> 503 </td><td> Request timed out. Retry the request in sometime. </td><td>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  </td></tr>
     </table>
   */
  public ApiResponse<Void> getPdfPptMappingWithHttpInfo(String document, String accountId, LocalDate date) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'document' is set
    if (document == null) {
      throw new ApiException(400, "Missing the required parameter 'document' when calling getPdfPptMapping");
    }
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getPdfPptMapping");
    }
    
    // verify the required parameter 'date' is set
    if (date == null) {
      throw new ApiException(400, "Missing the required parameter 'date' when calling getPdfPptMapping");
    }
    
    // create path and map variables
    String localVarPath = "/analytics/pub-datastore/swivel/v1/{document}/{accountId}/{date}"
      .replaceAll("\\{" + "document" + "\\}", apiClient.escapeString(document.toString()))
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "date" + "\\}", apiClient.escapeString(date.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
      Void
    > apiResponse = apiClient.invokeAPI("MappingsApi.getPdfPptMapping", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getPdfPptMappingResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Redirects to the underlying PA/SPAR data represented in a Stach format.
   * Takes report parameter inputs and returns the object location for the specified report via a 302 redirect.    Note: Due to Swagger UI functionality, the redirect is automatically followed when using &#39;Try it out&#39;, so instead of the 302 Header response, a 200 is returned with the Cargo response Body.
   * @param document The Publisher or Analytics Datafeed document containing the report (required)
   * @param assetName The PA/SPAR asset name and extension (required)
   * @param reportId The PA/SPAR report ID (required)
   * @param tileId The PA/SPAR tile ID (required)
   * @param accountId The account ID (required)
   * @param date The as of date for the report (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 302 </td><td> Expected response, contains the Cargo URL in the Location header. </td><td>  * Location - Redirect URL to get Cargo object.    (example: https://api.factset.com/analytics/datastore/cargo/v1/groups/a4186c50f8e74f979d271dd22298c901/objects/fe875bc4150542dea6bc237663a01a0d) <br>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  </td></tr>
       <tr><td> 400 </td><td> Invalid parameter provided. </td><td>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  </td></tr>
       <tr><td> 401 </td><td> Missing or invalid authentication. </td><td>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  </td></tr>
       <tr><td> 403 </td><td> User is forbidden with current credentials </td><td>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  </td></tr>
       <tr><td> 404 </td><td> The provided request does not exist. </td><td>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  </td></tr>
       <tr><td> 500 </td><td> Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting </td><td>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  </td></tr>
       <tr><td> 503 </td><td> Request timed out. Retry the request in sometime. </td><td>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  </td></tr>
     </table>
   */
  public void getStachMapping(String document, String assetName, String reportId, String tileId, String accountId, LocalDate date) throws ApiException {
    getStachMappingWithHttpInfo(document, assetName, reportId, tileId, accountId, date);
  }

  /**
   * Redirects to the underlying PA/SPAR data represented in a Stach format.
   * Takes report parameter inputs and returns the object location for the specified report via a 302 redirect.    Note: Due to Swagger UI functionality, the redirect is automatically followed when using &#39;Try it out&#39;, so instead of the 302 Header response, a 200 is returned with the Cargo response Body.
   * @param document The Publisher or Analytics Datafeed document containing the report (required)
   * @param assetName The PA/SPAR asset name and extension (required)
   * @param reportId The PA/SPAR report ID (required)
   * @param tileId The PA/SPAR tile ID (required)
   * @param accountId The account ID (required)
   * @param date The as of date for the report (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 302 </td><td> Expected response, contains the Cargo URL in the Location header. </td><td>  * Location - Redirect URL to get Cargo object.    (example: https://api.factset.com/analytics/datastore/cargo/v1/groups/a4186c50f8e74f979d271dd22298c901/objects/fe875bc4150542dea6bc237663a01a0d) <br>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  </td></tr>
       <tr><td> 400 </td><td> Invalid parameter provided. </td><td>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  </td></tr>
       <tr><td> 401 </td><td> Missing or invalid authentication. </td><td>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  </td></tr>
       <tr><td> 403 </td><td> User is forbidden with current credentials </td><td>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  </td></tr>
       <tr><td> 404 </td><td> The provided request does not exist. </td><td>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  </td></tr>
       <tr><td> 500 </td><td> Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting </td><td>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  </td></tr>
       <tr><td> 503 </td><td> Request timed out. Retry the request in sometime. </td><td>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  </td></tr>
     </table>
   */
  public ApiResponse<Void> getStachMappingWithHttpInfo(String document, String assetName, String reportId, String tileId, String accountId, LocalDate date) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'document' is set
    if (document == null) {
      throw new ApiException(400, "Missing the required parameter 'document' when calling getStachMapping");
    }
    
    // verify the required parameter 'assetName' is set
    if (assetName == null) {
      throw new ApiException(400, "Missing the required parameter 'assetName' when calling getStachMapping");
    }
    
    // verify the required parameter 'reportId' is set
    if (reportId == null) {
      throw new ApiException(400, "Missing the required parameter 'reportId' when calling getStachMapping");
    }
    
    // verify the required parameter 'tileId' is set
    if (tileId == null) {
      throw new ApiException(400, "Missing the required parameter 'tileId' when calling getStachMapping");
    }
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getStachMapping");
    }
    
    // verify the required parameter 'date' is set
    if (date == null) {
      throw new ApiException(400, "Missing the required parameter 'date' when calling getStachMapping");
    }
    
    // create path and map variables
    String localVarPath = "/analytics/pub-datastore/swivel/v1/{document}/{assetName}/{reportId}/{tileId}/{accountId}/{date}"
      .replaceAll("\\{" + "document" + "\\}", apiClient.escapeString(document.toString()))
      .replaceAll("\\{" + "assetName" + "\\}", apiClient.escapeString(assetName.toString()))
      .replaceAll("\\{" + "reportId" + "\\}", apiClient.escapeString(reportId.toString()))
      .replaceAll("\\{" + "tileId" + "\\}", apiClient.escapeString(tileId.toString()))
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "date" + "\\}", apiClient.escapeString(date.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
      Void
    > apiResponse = apiClient.invokeAPI("MappingsApi.getStachMapping", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getStachMappingResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Redirects to the underlying PA/SPAR data represented in a Stach format, with no as of date specified.
   * Takes report parameter inputs and returns the object location for the specified report via a 302 redirect.    Note: Due to Swagger UI functionality, the redirect is automatically followed when using &#39;Try it out&#39;, so instead of the 302 Header response, a 200 is returned with the Cargo response Body.
   * @param document The Publisher or Analytics Datafeed document containing the report (required)
   * @param assetName The PA/SPAR asset name and extension (required)
   * @param reportId The PA/SPAR report ID (required)
   * @param tileId The PA/SPAR tile ID (required)
   * @param accountId The account ID (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 302 </td><td> Expected response, contains the Cargo URL in the Location header. </td><td>  * Location - Redirect URL to get Cargo object.    (example: https://api.factset.com/analytics/datastore/cargo/v1/groups/a4186c50f8e74f979d271dd22298c901/objects/fe875bc4150542dea6bc237663a01a0d) <br>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  </td></tr>
       <tr><td> 400 </td><td> Invalid parameter provided. </td><td>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  </td></tr>
       <tr><td> 401 </td><td> Missing or invalid authentication. </td><td>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  </td></tr>
       <tr><td> 403 </td><td> User is forbidden with current credentials </td><td>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  </td></tr>
       <tr><td> 404 </td><td> The provided request does not exist. </td><td>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  </td></tr>
       <tr><td> 500 </td><td> Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting </td><td>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  </td></tr>
       <tr><td> 503 </td><td> Request timed out. Retry the request in sometime. </td><td>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  </td></tr>
     </table>
   */
  public void getStachMappingNoDate(String document, String assetName, String reportId, String tileId, String accountId) throws ApiException {
    getStachMappingNoDateWithHttpInfo(document, assetName, reportId, tileId, accountId);
  }

  /**
   * Redirects to the underlying PA/SPAR data represented in a Stach format, with no as of date specified.
   * Takes report parameter inputs and returns the object location for the specified report via a 302 redirect.    Note: Due to Swagger UI functionality, the redirect is automatically followed when using &#39;Try it out&#39;, so instead of the 302 Header response, a 200 is returned with the Cargo response Body.
   * @param document The Publisher or Analytics Datafeed document containing the report (required)
   * @param assetName The PA/SPAR asset name and extension (required)
   * @param reportId The PA/SPAR report ID (required)
   * @param tileId The PA/SPAR tile ID (required)
   * @param accountId The account ID (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 302 </td><td> Expected response, contains the Cargo URL in the Location header. </td><td>  * Location - Redirect URL to get Cargo object.    (example: https://api.factset.com/analytics/datastore/cargo/v1/groups/a4186c50f8e74f979d271dd22298c901/objects/fe875bc4150542dea6bc237663a01a0d) <br>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  </td></tr>
       <tr><td> 400 </td><td> Invalid parameter provided. </td><td>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  </td></tr>
       <tr><td> 401 </td><td> Missing or invalid authentication. </td><td>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  </td></tr>
       <tr><td> 403 </td><td> User is forbidden with current credentials </td><td>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  </td></tr>
       <tr><td> 404 </td><td> The provided request does not exist. </td><td>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  </td></tr>
       <tr><td> 500 </td><td> Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting </td><td>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  </td></tr>
       <tr><td> 503 </td><td> Request timed out. Retry the request in sometime. </td><td>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  </td></tr>
     </table>
   */
  public ApiResponse<Void> getStachMappingNoDateWithHttpInfo(String document, String assetName, String reportId, String tileId, String accountId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'document' is set
    if (document == null) {
      throw new ApiException(400, "Missing the required parameter 'document' when calling getStachMappingNoDate");
    }
    
    // verify the required parameter 'assetName' is set
    if (assetName == null) {
      throw new ApiException(400, "Missing the required parameter 'assetName' when calling getStachMappingNoDate");
    }
    
    // verify the required parameter 'reportId' is set
    if (reportId == null) {
      throw new ApiException(400, "Missing the required parameter 'reportId' when calling getStachMappingNoDate");
    }
    
    // verify the required parameter 'tileId' is set
    if (tileId == null) {
      throw new ApiException(400, "Missing the required parameter 'tileId' when calling getStachMappingNoDate");
    }
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getStachMappingNoDate");
    }
    
    // create path and map variables
    String localVarPath = "/analytics/pub-datastore/swivel/v1/{document}/{assetName}/{reportId}/{tileId}/{accountId}"
      .replaceAll("\\{" + "document" + "\\}", apiClient.escapeString(document.toString()))
      .replaceAll("\\{" + "assetName" + "\\}", apiClient.escapeString(assetName.toString()))
      .replaceAll("\\{" + "reportId" + "\\}", apiClient.escapeString(reportId.toString()))
      .replaceAll("\\{" + "tileId" + "\\}", apiClient.escapeString(tileId.toString()))
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
      Void
    > apiResponse = apiClient.invokeAPI("MappingsApi.getStachMappingNoDate", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getStachMappingNoDateResponseTypeMap, false);

    return apiResponse;

  }
}
