package com.factset.sdk.FactSetOwnershipReportBuilder.api;

import com.factset.sdk.FactSetOwnershipReportBuilder.ApiException;
import com.factset.sdk.FactSetOwnershipReportBuilder.ApiClient;
import com.factset.sdk.FactSetOwnershipReportBuilder.ApiResponse;
import com.factset.sdk.FactSetOwnershipReportBuilder.Configuration;
import com.factset.sdk.FactSetOwnershipReportBuilder.Pair;

import jakarta.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.FactSetOwnershipReportBuilder.models.ErrorResponse;
import com.factset.sdk.FactSetOwnershipReportBuilder.models.ErrorWithMetaResponse;
import java.time.LocalDate;
import com.factset.sdk.FactSetOwnershipReportBuilder.models.ResponseHolders;
import com.factset.sdk.FactSetOwnershipReportBuilder.models.ResponseUltimateParent;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class OwnershipApi {
  private ApiClient apiClient;

  public OwnershipApi() {
    this(Configuration.getDefaultApiClient());
  }

  public OwnershipApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> getOwnershipHoldersResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getOwnershipHoldersResponseTypeMap.put(200, new GenericType<ResponseHolders>(){});
    getOwnershipHoldersResponseTypeMap.put(400, new GenericType<ErrorWithMetaResponse>(){});
    getOwnershipHoldersResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getOwnershipHoldersResponseTypeMap.put(404, new GenericType<ErrorResponse>(){});
    getOwnershipHoldersResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> getOwnershipUltimateParentResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getOwnershipUltimateParentResponseTypeMap.put(200, new GenericType<ResponseUltimateParent>(){});
    getOwnershipUltimateParentResponseTypeMap.put(400, new GenericType<ErrorWithMetaResponse>(){});
    getOwnershipUltimateParentResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getOwnershipUltimateParentResponseTypeMap.put(404, new GenericType<ErrorResponse>(){});
    getOwnershipUltimateParentResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
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
   * Holders of a company or fund
   * Holders of a company or fund
   * @param id Company or Fund Identifier (required)
   * @param assetType Controls the Asset Type of the data returned (optional, default to EQUITY)
   * @param holderType Controls the Holder Type of the data returned (optional, default to INSTITUTIONS)
   * @param entityType Controls the type of Entity data returned. Defaults to Security data, but can also be used to display Company data. (optional, default to SECURITY)
   * @param topn Limits the number of holders returned based on their Market Value position in the security. Default is ALL, otherwise use a valid number above 0.  (optional)
   * @param date Top Holders as of date expressed in YYYY-MM-DD format. Defaults to latest month-end close; non-month-end dates are converted to month-end dates. (optional)
   * @return ResponseHolders
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Expected response; returns JSON data containing STACH 2.0 row organized package format </td><td>  * Api-Supported-Versions - Supported API versions (semantic versioning) <br>  * Api-Version - API version (semantic versioning) <br>  * X-DataDirect-Request-Key - FactSet request ID <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Remaining - Number of requests remaining for the time window <br>  * X-FactSet-Api-RateLimit-Limit-Reset - Number of seconds remaining until rate limit resets <br>  </td></tr>
       <tr><td> 400 </td><td> Bad Request. For further assistance, file an issue under \&quot;Workflow &amp; Throttling - 400 or 429 Response\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. </td><td>  * Api-Supported-Versions - Supported API versions (semantic versioning) <br>  * Api-Version - API version (semantic versioning) <br>  * X-DataDirect-Request-Key - FactSet request ID <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Remaining - Number of requests remaining for the time window <br>  * X-FactSet-Api-RateLimit-Limit-Reset - Number of seconds remaining until rate limit resets <br>  </td></tr>
       <tr><td> 401 </td><td> Missing or invalid authentication. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For further assistance, file an issue under \&quot;Connectivty - 401 or 403 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key - FactSet request ID <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Remaining - Number of requests remaining for the time window <br>  * X-FactSet-Api-RateLimit-Limit-Reset - Number of seconds remaining until rate limit resets <br>  </td></tr>
       <tr><td> 403 </td><td> User is forbidden access with current credentials. Reach out to your local FactSet Account Manager for assistance, or file an issue under \&quot;Connectivty - 401 or 403 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key - FactSet request ID <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Remaining - Number of requests remaining for the time window <br>  * X-FactSet-Api-RateLimit-Limit-Reset - Number of seconds remaining until rate limit resets <br>  </td></tr>
       <tr><td> 404 </td><td> Not found. For further assistance, file an issue under \&quot;Performance - 404 and 500 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key - FactSet request ID <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Remaining - Number of requests remaining for the time window <br>  * X-FactSet-Api-RateLimit-Limit-Reset - Number of seconds remaining until rate limit resets <br>  </td></tr>
       <tr><td> 429 </td><td> Too many requests - this API is rate-limited to 20 requests per second. For further assistance, file an issue under \&quot;Workflow &amp; Throttling - 400 or 429 Response\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key - FactSet request ID <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Remaining - Number of requests remaining for the time window <br>  * X-FactSet-Api-RateLimit-Limit-Reset - Number of seconds remaining until rate limit resets <br>  </td></tr>
       <tr><td> 500 </td><td> Server error. For further assistance, file an issue under \&quot;Performance - 404 and 500 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key - FactSet request ID <br>  </td></tr>
       <tr><td> 503 </td><td> Service unavailable. Typically a timeout, or result of a rejected request to prevent service overload. For further assistance, file an issue under \&quot;Performance - 404 and 500 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key - FactSet request ID <br>  </td></tr>
     </table>
   */
  public ResponseHolders getOwnershipHolders(String id, String assetType, String holderType, String entityType, String topn, LocalDate date) throws ApiException {
    return getOwnershipHoldersWithHttpInfo(id, assetType, holderType, entityType, topn, date).getData();
  }

  /**
   * Holders of a company or fund
   * Holders of a company or fund
   * @param id Company or Fund Identifier (required)
   * @param assetType Controls the Asset Type of the data returned (optional, default to EQUITY)
   * @param holderType Controls the Holder Type of the data returned (optional, default to INSTITUTIONS)
   * @param entityType Controls the type of Entity data returned. Defaults to Security data, but can also be used to display Company data. (optional, default to SECURITY)
   * @param topn Limits the number of holders returned based on their Market Value position in the security. Default is ALL, otherwise use a valid number above 0.  (optional)
   * @param date Top Holders as of date expressed in YYYY-MM-DD format. Defaults to latest month-end close; non-month-end dates are converted to month-end dates. (optional)
   * @return ApiResponse&lt;ResponseHolders&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Expected response; returns JSON data containing STACH 2.0 row organized package format </td><td>  * Api-Supported-Versions - Supported API versions (semantic versioning) <br>  * Api-Version - API version (semantic versioning) <br>  * X-DataDirect-Request-Key - FactSet request ID <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Remaining - Number of requests remaining for the time window <br>  * X-FactSet-Api-RateLimit-Limit-Reset - Number of seconds remaining until rate limit resets <br>  </td></tr>
       <tr><td> 400 </td><td> Bad Request. For further assistance, file an issue under \&quot;Workflow &amp; Throttling - 400 or 429 Response\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. </td><td>  * Api-Supported-Versions - Supported API versions (semantic versioning) <br>  * Api-Version - API version (semantic versioning) <br>  * X-DataDirect-Request-Key - FactSet request ID <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Remaining - Number of requests remaining for the time window <br>  * X-FactSet-Api-RateLimit-Limit-Reset - Number of seconds remaining until rate limit resets <br>  </td></tr>
       <tr><td> 401 </td><td> Missing or invalid authentication. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For further assistance, file an issue under \&quot;Connectivty - 401 or 403 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key - FactSet request ID <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Remaining - Number of requests remaining for the time window <br>  * X-FactSet-Api-RateLimit-Limit-Reset - Number of seconds remaining until rate limit resets <br>  </td></tr>
       <tr><td> 403 </td><td> User is forbidden access with current credentials. Reach out to your local FactSet Account Manager for assistance, or file an issue under \&quot;Connectivty - 401 or 403 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key - FactSet request ID <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Remaining - Number of requests remaining for the time window <br>  * X-FactSet-Api-RateLimit-Limit-Reset - Number of seconds remaining until rate limit resets <br>  </td></tr>
       <tr><td> 404 </td><td> Not found. For further assistance, file an issue under \&quot;Performance - 404 and 500 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key - FactSet request ID <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Remaining - Number of requests remaining for the time window <br>  * X-FactSet-Api-RateLimit-Limit-Reset - Number of seconds remaining until rate limit resets <br>  </td></tr>
       <tr><td> 429 </td><td> Too many requests - this API is rate-limited to 20 requests per second. For further assistance, file an issue under \&quot;Workflow &amp; Throttling - 400 or 429 Response\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key - FactSet request ID <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Remaining - Number of requests remaining for the time window <br>  * X-FactSet-Api-RateLimit-Limit-Reset - Number of seconds remaining until rate limit resets <br>  </td></tr>
       <tr><td> 500 </td><td> Server error. For further assistance, file an issue under \&quot;Performance - 404 and 500 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key - FactSet request ID <br>  </td></tr>
       <tr><td> 503 </td><td> Service unavailable. Typically a timeout, or result of a rejected request to prevent service overload. For further assistance, file an issue under \&quot;Performance - 404 and 500 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key - FactSet request ID <br>  </td></tr>
     </table>
   */
  public ApiResponse<ResponseHolders> getOwnershipHoldersWithHttpInfo(String id, String assetType, String holderType, String entityType, String topn, LocalDate date) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getOwnershipHolders");
    }
    
    // create path and map variables
    String localVarPath = "/holders";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "id", id));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "asset_type", assetType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "holder_type", holderType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "entity_type", entityType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "topn", topn));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "date", date));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        ResponseHolders
      
    > apiResponse = apiClient.invokeAPI("OwnershipApi.getOwnershipHolders", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getOwnershipHoldersResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Get FactSet&#39;s ownership breakdown about a specific security.  The returned table will display the institutions, insiders, funds, and beneficial owners that comprise the ownership of the provided security.  These holders will be grouped by the ultimate parent in their entity structure.
   * Get FactSet&#39;s ownership breakdown about a specific security.  The returned table will display the institutions, insiders, funds, and beneficial owners that comprise the ownership of the provided security.  These holders will be grouped by the ultimate parent in their entity structure.
   * @param id Any valid FactSet identifier which points to a security.  This could be Ticker Region, Entity ID, CUSIP, or SEDOL.  (required)
   * @param currency Currency ISO code that any currency-based data should be returned in.  If excluded, the value will default to the special keyword \&quot;LOCAL\&quot; which will cause the currency-based values to be calculated in currency which is local to the exchange it is traded on.  (optional)
   * @param attributes The columns to be returned in the resulting table (optional, default to [\&quot;percentOwnership\&quot;,\&quot;position\&quot;,\&quot;positionChange\&quot;,\&quot;marketValue\&quot;,\&quot;marketValueChange\&quot;,\&quot;percentPortfolio\&quot;,\&quot;reportDate\&quot;,\&quot;source\&quot;,\&quot;holderId\&quot;])
   * @param period The period over which we should return holdings for. (optional, default to 6m)
   * @param holderType The holder types which should be included in this table (optional, default to institutions)
   * @param date The date as of which this data should be returned. YYYY-MM-DD format. Defaults to current date. (optional)
   * @return ResponseUltimateParent
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Expected response; returns JSON data containing STACH 3.1 table format </td><td>  * Api-Supported-Versions - Supported API versions (semantic versioning) <br>  * Api-Version - API version (semantic versioning) <br>  * X-DataDirect-Request-Key - FactSet request ID <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Remaining - Number of requests remaining for the time window <br>  * X-FactSet-Api-RateLimit-Limit-Reset - Number of seconds remaining until rate limit resets <br>  </td></tr>
       <tr><td> 400 </td><td> Bad Request. For further assistance, file an issue under \&quot;Workflow &amp; Throttling - 400 or 429 Response\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. </td><td>  * Api-Supported-Versions - Supported API versions (semantic versioning) <br>  * Api-Version - API version (semantic versioning) <br>  * X-DataDirect-Request-Key - FactSet request ID <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Remaining - Number of requests remaining for the time window <br>  * X-FactSet-Api-RateLimit-Limit-Reset - Number of seconds remaining until rate limit resets <br>  </td></tr>
       <tr><td> 401 </td><td> Missing or invalid authentication. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For further assistance, file an issue under \&quot;Connectivty - 401 or 403 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key - FactSet request ID <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Remaining - Number of requests remaining for the time window <br>  * X-FactSet-Api-RateLimit-Limit-Reset - Number of seconds remaining until rate limit resets <br>  </td></tr>
       <tr><td> 403 </td><td> User is forbidden access with current credentials. Reach out to your local FactSet Account Manager for assistance, or file an issue under \&quot;Connectivty - 401 or 403 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key - FactSet request ID <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Remaining - Number of requests remaining for the time window <br>  * X-FactSet-Api-RateLimit-Limit-Reset - Number of seconds remaining until rate limit resets <br>  </td></tr>
       <tr><td> 404 </td><td> Not found. For further assistance, file an issue under \&quot;Performance - 404 and 500 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key - FactSet request ID <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Remaining - Number of requests remaining for the time window <br>  * X-FactSet-Api-RateLimit-Limit-Reset - Number of seconds remaining until rate limit resets <br>  </td></tr>
       <tr><td> 429 </td><td> Too many requests - this API is rate-limited to 20 requests per second. For further assistance, file an issue under \&quot;Workflow &amp; Throttling - 400 or 429 Response\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key - FactSet request ID <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Remaining - Number of requests remaining for the time window <br>  * X-FactSet-Api-RateLimit-Limit-Reset - Number of seconds remaining until rate limit resets <br>  </td></tr>
       <tr><td> 500 </td><td> Server error. For further assistance, file an issue under \&quot;Performance - 404 and 500 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key - FactSet request ID <br>  </td></tr>
       <tr><td> 503 </td><td> Service unavailable. Typically a timeout, or result of a rejected request to prevent service overload. For further assistance, file an issue under \&quot;Performance - 404 and 500 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key - FactSet request ID <br>  </td></tr>
     </table>
   */
  public ResponseUltimateParent getOwnershipUltimateParent(String id, String currency, java.util.List<String> attributes, String period, String holderType, LocalDate date) throws ApiException {
    return getOwnershipUltimateParentWithHttpInfo(id, currency, attributes, period, holderType, date).getData();
  }

  /**
   * Get FactSet&#39;s ownership breakdown about a specific security.  The returned table will display the institutions, insiders, funds, and beneficial owners that comprise the ownership of the provided security.  These holders will be grouped by the ultimate parent in their entity structure.
   * Get FactSet&#39;s ownership breakdown about a specific security.  The returned table will display the institutions, insiders, funds, and beneficial owners that comprise the ownership of the provided security.  These holders will be grouped by the ultimate parent in their entity structure.
   * @param id Any valid FactSet identifier which points to a security.  This could be Ticker Region, Entity ID, CUSIP, or SEDOL.  (required)
   * @param currency Currency ISO code that any currency-based data should be returned in.  If excluded, the value will default to the special keyword \&quot;LOCAL\&quot; which will cause the currency-based values to be calculated in currency which is local to the exchange it is traded on.  (optional)
   * @param attributes The columns to be returned in the resulting table (optional, default to [\&quot;percentOwnership\&quot;,\&quot;position\&quot;,\&quot;positionChange\&quot;,\&quot;marketValue\&quot;,\&quot;marketValueChange\&quot;,\&quot;percentPortfolio\&quot;,\&quot;reportDate\&quot;,\&quot;source\&quot;,\&quot;holderId\&quot;])
   * @param period The period over which we should return holdings for. (optional, default to 6m)
   * @param holderType The holder types which should be included in this table (optional, default to institutions)
   * @param date The date as of which this data should be returned. YYYY-MM-DD format. Defaults to current date. (optional)
   * @return ApiResponse&lt;ResponseUltimateParent&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Expected response; returns JSON data containing STACH 3.1 table format </td><td>  * Api-Supported-Versions - Supported API versions (semantic versioning) <br>  * Api-Version - API version (semantic versioning) <br>  * X-DataDirect-Request-Key - FactSet request ID <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Remaining - Number of requests remaining for the time window <br>  * X-FactSet-Api-RateLimit-Limit-Reset - Number of seconds remaining until rate limit resets <br>  </td></tr>
       <tr><td> 400 </td><td> Bad Request. For further assistance, file an issue under \&quot;Workflow &amp; Throttling - 400 or 429 Response\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. </td><td>  * Api-Supported-Versions - Supported API versions (semantic versioning) <br>  * Api-Version - API version (semantic versioning) <br>  * X-DataDirect-Request-Key - FactSet request ID <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Remaining - Number of requests remaining for the time window <br>  * X-FactSet-Api-RateLimit-Limit-Reset - Number of seconds remaining until rate limit resets <br>  </td></tr>
       <tr><td> 401 </td><td> Missing or invalid authentication. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For further assistance, file an issue under \&quot;Connectivty - 401 or 403 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key - FactSet request ID <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Remaining - Number of requests remaining for the time window <br>  * X-FactSet-Api-RateLimit-Limit-Reset - Number of seconds remaining until rate limit resets <br>  </td></tr>
       <tr><td> 403 </td><td> User is forbidden access with current credentials. Reach out to your local FactSet Account Manager for assistance, or file an issue under \&quot;Connectivty - 401 or 403 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key - FactSet request ID <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Remaining - Number of requests remaining for the time window <br>  * X-FactSet-Api-RateLimit-Limit-Reset - Number of seconds remaining until rate limit resets <br>  </td></tr>
       <tr><td> 404 </td><td> Not found. For further assistance, file an issue under \&quot;Performance - 404 and 500 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key - FactSet request ID <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Remaining - Number of requests remaining for the time window <br>  * X-FactSet-Api-RateLimit-Limit-Reset - Number of seconds remaining until rate limit resets <br>  </td></tr>
       <tr><td> 429 </td><td> Too many requests - this API is rate-limited to 20 requests per second. For further assistance, file an issue under \&quot;Workflow &amp; Throttling - 400 or 429 Response\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key - FactSet request ID <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Remaining - Number of requests remaining for the time window <br>  * X-FactSet-Api-RateLimit-Limit-Reset - Number of seconds remaining until rate limit resets <br>  </td></tr>
       <tr><td> 500 </td><td> Server error. For further assistance, file an issue under \&quot;Performance - 404 and 500 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key - FactSet request ID <br>  </td></tr>
       <tr><td> 503 </td><td> Service unavailable. Typically a timeout, or result of a rejected request to prevent service overload. For further assistance, file an issue under \&quot;Performance - 404 and 500 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key - FactSet request ID <br>  </td></tr>
     </table>
   */
  public ApiResponse<ResponseUltimateParent> getOwnershipUltimateParentWithHttpInfo(String id, String currency, java.util.List<String> attributes, String period, String holderType, LocalDate date) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getOwnershipUltimateParent");
    }
    
    // create path and map variables
    String localVarPath = "/ultimate-parent";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "id", id));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "currency", currency));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "attributes", attributes));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "period", period));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "holderType", holderType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "date", date));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        ResponseUltimateParent
      
    > apiResponse = apiClient.invokeAPI("OwnershipApi.getOwnershipUltimateParent", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getOwnershipUltimateParentResponseTypeMap, false);

    return apiResponse;

  }
}
