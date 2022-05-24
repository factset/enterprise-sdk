package com.factset.sdk.CapitalStructureReportBuilder.api;

import com.factset.sdk.CapitalStructureReportBuilder.ApiException;
import com.factset.sdk.CapitalStructureReportBuilder.ApiClient;
import com.factset.sdk.CapitalStructureReportBuilder.ApiResponse;
import com.factset.sdk.CapitalStructureReportBuilder.Configuration;
import com.factset.sdk.CapitalStructureReportBuilder.Pair;

import javax.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.CapitalStructureReportBuilder.models.ErrorResponse;
import com.factset.sdk.CapitalStructureReportBuilder.models.Response;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CapitalStructureApi {
  private ApiClient apiClient;

  public CapitalStructureApi() {
    this(Configuration.getDefaultApiClient());
  }

  public CapitalStructureApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

    private static final Map<Integer, GenericType> getDcsDetailResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getDcsDetailResponseTypeMap.put(200, new GenericType<Response>(){});
    getDcsDetailResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getDcsDetailResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getDcsDetailResponseTypeMap.put(404, new GenericType<ErrorResponse>(){});
    getDcsDetailResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }
  private static final Map<Integer, GenericType> getDcsSummaryResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getDcsSummaryResponseTypeMap.put(200, new GenericType<Response>(){});
    getDcsSummaryResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getDcsSummaryResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getDcsSummaryResponseTypeMap.put(404, new GenericType<ErrorResponse>(){});
    getDcsSummaryResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }
  private static final Map<Integer, GenericType> getSourceOfCapitalResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getSourceOfCapitalResponseTypeMap.put(200, new GenericType<Response>(){});
    getSourceOfCapitalResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getSourceOfCapitalResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getSourceOfCapitalResponseTypeMap.put(404, new GenericType<ErrorResponse>(){});
    getSourceOfCapitalResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
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
   * Debt Capital Structure (DCS)
   * 
   * @param id Company ticker (required)
   * @param schema The schema that the data is returned as. The following are descriptions for the accepted values: - table_group_level - STACH 2.0 row organized package format with parent-child relationships represented using STACH group level cell metadata - table_parent_child_columns - STACH 2.0 row organized package format with parent-child relationships represented using STACH parent-child columns  (optional, default to table_parent_child_columns)
   * @return Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Expected response; returns JSON data containing STACH 2.0 row organized package format </td><td>  * X-DataDirect-Request-Key - FactSet request ID <br>  * Api-Supported-Versions - Supported API major versions <br>  * Api-Version - API version (semantic versioning) <br>  </td></tr>
       <tr><td> 400 </td><td> Bad Request. For further assistance, file an issue under \&quot;Workflow &amp; Throttling - 400 or 429 Response\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key - FactSet request ID <br>  * Api-Supported-Versions - Supported API major versions <br>  * Api-Version - API version (semantic versioning) <br>  </td></tr>
       <tr><td> 401 </td><td> Missing or invalid authentication. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For further assistance, file an issue under \&quot;Connectivty - 401 or 403 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key - FactSet request ID <br>  </td></tr>
       <tr><td> 403 </td><td> User is forbidden access with current credentials. Reach out to your local FactSet Account Manager for assistance, or file an issue under \&quot;Connectivty - 401 or 403 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key - FactSet request ID <br>  </td></tr>
       <tr><td> 404 </td><td> Not found. For further assistance, file an issue under \&quot;Performance - 404 and 500 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key - FactSet request ID <br>  </td></tr>
       <tr><td> 429 </td><td> Too many requests - this API is rate-limited to 20 requests per second. For further assistance, file an issue under \&quot;Workflow &amp; Throttling - 400 or 429 Response\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key - FactSet request ID <br>  </td></tr>
       <tr><td> 500 </td><td> Server error. For further assistance, file an issue under \&quot;Performance - 404 and 500 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key - FactSet request ID <br>  </td></tr>
       <tr><td> 503 </td><td> Service unavailable. Typically a timeout, or result of a rejected request to prevent service overload. For further assistance, file an issue under \&quot;Performance - 404 and 500 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key - FactSet request ID <br>  </td></tr>
     </table>
   */
  public Response getDcsDetail(String id, String schema) throws ApiException {
    return getDcsDetailWithHttpInfo(id, schema).getData();
  }

  /**
   * Debt Capital Structure (DCS)
   * 
   * @param id Company ticker (required)
   * @param schema The schema that the data is returned as. The following are descriptions for the accepted values: - table_group_level - STACH 2.0 row organized package format with parent-child relationships represented using STACH group level cell metadata - table_parent_child_columns - STACH 2.0 row organized package format with parent-child relationships represented using STACH parent-child columns  (optional, default to table_parent_child_columns)
   * @return ApiResponse&lt;Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Expected response; returns JSON data containing STACH 2.0 row organized package format </td><td>  * X-DataDirect-Request-Key - FactSet request ID <br>  * Api-Supported-Versions - Supported API major versions <br>  * Api-Version - API version (semantic versioning) <br>  </td></tr>
       <tr><td> 400 </td><td> Bad Request. For further assistance, file an issue under \&quot;Workflow &amp; Throttling - 400 or 429 Response\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key - FactSet request ID <br>  * Api-Supported-Versions - Supported API major versions <br>  * Api-Version - API version (semantic versioning) <br>  </td></tr>
       <tr><td> 401 </td><td> Missing or invalid authentication. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For further assistance, file an issue under \&quot;Connectivty - 401 or 403 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key - FactSet request ID <br>  </td></tr>
       <tr><td> 403 </td><td> User is forbidden access with current credentials. Reach out to your local FactSet Account Manager for assistance, or file an issue under \&quot;Connectivty - 401 or 403 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key - FactSet request ID <br>  </td></tr>
       <tr><td> 404 </td><td> Not found. For further assistance, file an issue under \&quot;Performance - 404 and 500 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key - FactSet request ID <br>  </td></tr>
       <tr><td> 429 </td><td> Too many requests - this API is rate-limited to 20 requests per second. For further assistance, file an issue under \&quot;Workflow &amp; Throttling - 400 or 429 Response\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key - FactSet request ID <br>  </td></tr>
       <tr><td> 500 </td><td> Server error. For further assistance, file an issue under \&quot;Performance - 404 and 500 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key - FactSet request ID <br>  </td></tr>
       <tr><td> 503 </td><td> Service unavailable. Typically a timeout, or result of a rejected request to prevent service overload. For further assistance, file an issue under \&quot;Performance - 404 and 500 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key - FactSet request ID <br>  </td></tr>
     </table>
   */
  public ApiResponse<Response> getDcsDetailWithHttpInfo(String id, String schema) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getDcsDetail");
    }
    
    // create path and map variables
    String localVarPath = "/dcs-detail";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "id", id));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "schema", schema));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        Response
      
    > apiResponse = apiClient.invokeAPI("CapitalStructureApi.getDcsDetail", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getDcsDetailResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Debt Capital Structure (DCS) Summary
   * 
   * @param id Company ticker (required)
   * @param schema The schema that the data is returned as. The following are descriptions for the accepted values: - table_group_level - STACH 2.0 row organized package format with parent-child relationships represented using STACH group level cell metadata - table_parent_child_columns - STACH 2.0 row organized package format with parent-child relationships represented using STACH parent-child columns  (optional, default to table_parent_child_columns)
   * @return Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Expected response; returns JSON data containing STACH 2.0 row organized package format </td><td>  * X-DataDirect-Request-Key - FactSet request ID <br>  * Api-Supported-Versions - Supported API major versions <br>  * Api-Version - API version (semantic versioning) <br>  </td></tr>
       <tr><td> 400 </td><td> Bad Request. For further assistance, file an issue under \&quot;Workflow &amp; Throttling - 400 or 429 Response\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key - FactSet request ID <br>  * Api-Supported-Versions - Supported API major versions <br>  * Api-Version - API version (semantic versioning) <br>  </td></tr>
       <tr><td> 401 </td><td> Missing or invalid authentication. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For further assistance, file an issue under \&quot;Connectivty - 401 or 403 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key - FactSet request ID <br>  </td></tr>
       <tr><td> 403 </td><td> User is forbidden access with current credentials. Reach out to your local FactSet Account Manager for assistance, or file an issue under \&quot;Connectivty - 401 or 403 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key - FactSet request ID <br>  </td></tr>
       <tr><td> 404 </td><td> Not found. For further assistance, file an issue under \&quot;Performance - 404 and 500 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key - FactSet request ID <br>  </td></tr>
       <tr><td> 429 </td><td> Too many requests - this API is rate-limited to 20 requests per second. For further assistance, file an issue under \&quot;Workflow &amp; Throttling - 400 or 429 Response\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key - FactSet request ID <br>  </td></tr>
       <tr><td> 500 </td><td> Server error. For further assistance, file an issue under \&quot;Performance - 404 and 500 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key - FactSet request ID <br>  </td></tr>
       <tr><td> 503 </td><td> Service unavailable. Typically a timeout, or result of a rejected request to prevent service overload. For further assistance, file an issue under \&quot;Performance - 404 and 500 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key - FactSet request ID <br>  </td></tr>
     </table>
   */
  public Response getDcsSummary(String id, String schema) throws ApiException {
    return getDcsSummaryWithHttpInfo(id, schema).getData();
  }

  /**
   * Debt Capital Structure (DCS) Summary
   * 
   * @param id Company ticker (required)
   * @param schema The schema that the data is returned as. The following are descriptions for the accepted values: - table_group_level - STACH 2.0 row organized package format with parent-child relationships represented using STACH group level cell metadata - table_parent_child_columns - STACH 2.0 row organized package format with parent-child relationships represented using STACH parent-child columns  (optional, default to table_parent_child_columns)
   * @return ApiResponse&lt;Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Expected response; returns JSON data containing STACH 2.0 row organized package format </td><td>  * X-DataDirect-Request-Key - FactSet request ID <br>  * Api-Supported-Versions - Supported API major versions <br>  * Api-Version - API version (semantic versioning) <br>  </td></tr>
       <tr><td> 400 </td><td> Bad Request. For further assistance, file an issue under \&quot;Workflow &amp; Throttling - 400 or 429 Response\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key - FactSet request ID <br>  * Api-Supported-Versions - Supported API major versions <br>  * Api-Version - API version (semantic versioning) <br>  </td></tr>
       <tr><td> 401 </td><td> Missing or invalid authentication. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For further assistance, file an issue under \&quot;Connectivty - 401 or 403 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key - FactSet request ID <br>  </td></tr>
       <tr><td> 403 </td><td> User is forbidden access with current credentials. Reach out to your local FactSet Account Manager for assistance, or file an issue under \&quot;Connectivty - 401 or 403 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key - FactSet request ID <br>  </td></tr>
       <tr><td> 404 </td><td> Not found. For further assistance, file an issue under \&quot;Performance - 404 and 500 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key - FactSet request ID <br>  </td></tr>
       <tr><td> 429 </td><td> Too many requests - this API is rate-limited to 20 requests per second. For further assistance, file an issue under \&quot;Workflow &amp; Throttling - 400 or 429 Response\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key - FactSet request ID <br>  </td></tr>
       <tr><td> 500 </td><td> Server error. For further assistance, file an issue under \&quot;Performance - 404 and 500 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key - FactSet request ID <br>  </td></tr>
       <tr><td> 503 </td><td> Service unavailable. Typically a timeout, or result of a rejected request to prevent service overload. For further assistance, file an issue under \&quot;Performance - 404 and 500 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key - FactSet request ID <br>  </td></tr>
     </table>
   */
  public ApiResponse<Response> getDcsSummaryWithHttpInfo(String id, String schema) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getDcsSummary");
    }
    
    // create path and map variables
    String localVarPath = "/dcs-summary";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "id", id));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "schema", schema));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        Response
      
    > apiResponse = apiClient.invokeAPI("CapitalStructureApi.getDcsSummary", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getDcsSummaryResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Source of Capital
   * 
   * @param id Company ticker (required)
   * @return Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Expected response; returns JSON data containing STACH 2.0 row organized package format </td><td>  * X-DataDirect-Request-Key - FactSet request ID <br>  * Api-Supported-Versions - Supported API major versions <br>  * Api-Version - API version (semantic versioning) <br>  </td></tr>
       <tr><td> 400 </td><td> Bad Request. For further assistance, file an issue under \&quot;Workflow &amp; Throttling - 400 or 429 Response\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key - FactSet request ID <br>  * Api-Supported-Versions - Supported API major versions <br>  * Api-Version - API version (semantic versioning) <br>  </td></tr>
       <tr><td> 401 </td><td> Missing or invalid authentication. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For further assistance, file an issue under \&quot;Connectivty - 401 or 403 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key - FactSet request ID <br>  </td></tr>
       <tr><td> 403 </td><td> User is forbidden access with current credentials. Reach out to your local FactSet Account Manager for assistance, or file an issue under \&quot;Connectivty - 401 or 403 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key - FactSet request ID <br>  </td></tr>
       <tr><td> 404 </td><td> Not found. For further assistance, file an issue under \&quot;Performance - 404 and 500 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key - FactSet request ID <br>  </td></tr>
       <tr><td> 429 </td><td> Too many requests - this API is rate-limited to 20 requests per second. For further assistance, file an issue under \&quot;Workflow &amp; Throttling - 400 or 429 Response\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key - FactSet request ID <br>  </td></tr>
       <tr><td> 500 </td><td> Server error. For further assistance, file an issue under \&quot;Performance - 404 and 500 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key - FactSet request ID <br>  </td></tr>
       <tr><td> 503 </td><td> Service unavailable. Typically a timeout, or result of a rejected request to prevent service overload. For further assistance, file an issue under \&quot;Performance - 404 and 500 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key - FactSet request ID <br>  </td></tr>
     </table>
   */
  public Response getSourceOfCapital(String id) throws ApiException {
    return getSourceOfCapitalWithHttpInfo(id).getData();
  }

  /**
   * Source of Capital
   * 
   * @param id Company ticker (required)
   * @return ApiResponse&lt;Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Expected response; returns JSON data containing STACH 2.0 row organized package format </td><td>  * X-DataDirect-Request-Key - FactSet request ID <br>  * Api-Supported-Versions - Supported API major versions <br>  * Api-Version - API version (semantic versioning) <br>  </td></tr>
       <tr><td> 400 </td><td> Bad Request. For further assistance, file an issue under \&quot;Workflow &amp; Throttling - 400 or 429 Response\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key - FactSet request ID <br>  * Api-Supported-Versions - Supported API major versions <br>  * Api-Version - API version (semantic versioning) <br>  </td></tr>
       <tr><td> 401 </td><td> Missing or invalid authentication. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For further assistance, file an issue under \&quot;Connectivty - 401 or 403 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key - FactSet request ID <br>  </td></tr>
       <tr><td> 403 </td><td> User is forbidden access with current credentials. Reach out to your local FactSet Account Manager for assistance, or file an issue under \&quot;Connectivty - 401 or 403 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key - FactSet request ID <br>  </td></tr>
       <tr><td> 404 </td><td> Not found. For further assistance, file an issue under \&quot;Performance - 404 and 500 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key - FactSet request ID <br>  </td></tr>
       <tr><td> 429 </td><td> Too many requests - this API is rate-limited to 20 requests per second. For further assistance, file an issue under \&quot;Workflow &amp; Throttling - 400 or 429 Response\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key - FactSet request ID <br>  </td></tr>
       <tr><td> 500 </td><td> Server error. For further assistance, file an issue under \&quot;Performance - 404 and 500 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key - FactSet request ID <br>  </td></tr>
       <tr><td> 503 </td><td> Service unavailable. Typically a timeout, or result of a rejected request to prevent service overload. For further assistance, file an issue under \&quot;Performance - 404 and 500 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key - FactSet request ID <br>  </td></tr>
     </table>
   */
  public ApiResponse<Response> getSourceOfCapitalWithHttpInfo(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getSourceOfCapital");
    }
    
    // create path and map variables
    String localVarPath = "/source-of-capital";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "id", id));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        Response
      
    > apiResponse = apiClient.invokeAPI("CapitalStructureApi.getSourceOfCapital", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getSourceOfCapitalResponseTypeMap, false);

    return apiResponse;

  }
}
