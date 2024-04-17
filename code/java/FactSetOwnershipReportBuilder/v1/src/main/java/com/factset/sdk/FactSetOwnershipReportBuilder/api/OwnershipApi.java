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
import com.factset.sdk.FactSetOwnershipReportBuilder.models.Response;

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
    getOwnershipHoldersResponseTypeMap.put(200, new GenericType<Response>(){});
    getOwnershipHoldersResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getOwnershipHoldersResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getOwnershipHoldersResponseTypeMap.put(404, new GenericType<ErrorResponse>(){});
    getOwnershipHoldersResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
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
   * @param topn Limits the number of holders returned based on their Market Value position in the security.   Default is ALL, otherwise use a valid number above 0.  (optional)
   * @param date Top Holders as of date expressed in YYYY-MM-DD format. Defaults to latest month-end close; non-month-end dates are converted to month-end dates. (optional)
   * @return Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Expected response; returns JSON data containing STACH 2.0 row organized package format </td><td>  * X-DataDirect-Request-Key - FactSet request ID <br>  * Api-Supported-Versions - Supported API versions (semantic versioning) <br>  * Api-Version - API version (semantic versioning) <br>  </td></tr>
       <tr><td> 400 </td><td> Bad Request. For further assistance, file an issue under \&quot;Workflow &amp; Throttling - 400 or 429 Response\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key - FactSet request ID <br>  * Api-Supported-Versions - Supported API versions (semantic versioning) <br>  * Api-Version - API version (semantic versioning) <br>  </td></tr>
       <tr><td> 401 </td><td> Missing or invalid authentication. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For further assistance, file an issue under \&quot;Connectivty - 401 or 403 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key - FactSet request ID <br>  </td></tr>
       <tr><td> 403 </td><td> User is forbidden access with current credentials. Reach out to your local FactSet Account Manager for assistance, or file an issue under \&quot;Connectivty - 401 or 403 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key - FactSet request ID <br>  </td></tr>
       <tr><td> 404 </td><td> Not found. For further assistance, file an issue under \&quot;Performance - 404 and 500 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key - FactSet request ID <br>  </td></tr>
       <tr><td> 429 </td><td> Too many requests - this API is rate-limited to 20 requests per second. For further assistance, file an issue under \&quot;Workflow &amp; Throttling - 400 or 429 Response\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key - FactSet request ID <br>  </td></tr>
       <tr><td> 500 </td><td> Server error. For further assistance, file an issue under \&quot;Performance - 404 and 500 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key - FactSet request ID <br>  </td></tr>
       <tr><td> 503 </td><td> Service unavailable. Typically a timeout, or result of a rejected request to prevent service overload. For further assistance, file an issue under \&quot;Performance - 404 and 500 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key - FactSet request ID <br>  </td></tr>
     </table>
   */
  public Response getOwnershipHolders(String id, String assetType, String holderType, String topn, String date) throws ApiException {
    return getOwnershipHoldersWithHttpInfo(id, assetType, holderType, topn, date).getData();
  }

  /**
   * Holders of a company or fund
   * Holders of a company or fund
   * @param id Company or Fund Identifier (required)
   * @param assetType Controls the Asset Type of the data returned (optional, default to EQUITY)
   * @param holderType Controls the Holder Type of the data returned (optional, default to INSTITUTIONS)
   * @param topn Limits the number of holders returned based on their Market Value position in the security.   Default is ALL, otherwise use a valid number above 0.  (optional)
   * @param date Top Holders as of date expressed in YYYY-MM-DD format. Defaults to latest month-end close; non-month-end dates are converted to month-end dates. (optional)
   * @return ApiResponse&lt;Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Expected response; returns JSON data containing STACH 2.0 row organized package format </td><td>  * X-DataDirect-Request-Key - FactSet request ID <br>  * Api-Supported-Versions - Supported API versions (semantic versioning) <br>  * Api-Version - API version (semantic versioning) <br>  </td></tr>
       <tr><td> 400 </td><td> Bad Request. For further assistance, file an issue under \&quot;Workflow &amp; Throttling - 400 or 429 Response\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key - FactSet request ID <br>  * Api-Supported-Versions - Supported API versions (semantic versioning) <br>  * Api-Version - API version (semantic versioning) <br>  </td></tr>
       <tr><td> 401 </td><td> Missing or invalid authentication. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For further assistance, file an issue under \&quot;Connectivty - 401 or 403 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key - FactSet request ID <br>  </td></tr>
       <tr><td> 403 </td><td> User is forbidden access with current credentials. Reach out to your local FactSet Account Manager for assistance, or file an issue under \&quot;Connectivty - 401 or 403 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key - FactSet request ID <br>  </td></tr>
       <tr><td> 404 </td><td> Not found. For further assistance, file an issue under \&quot;Performance - 404 and 500 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key - FactSet request ID <br>  </td></tr>
       <tr><td> 429 </td><td> Too many requests - this API is rate-limited to 20 requests per second. For further assistance, file an issue under \&quot;Workflow &amp; Throttling - 400 or 429 Response\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key - FactSet request ID <br>  </td></tr>
       <tr><td> 500 </td><td> Server error. For further assistance, file an issue under \&quot;Performance - 404 and 500 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key - FactSet request ID <br>  </td></tr>
       <tr><td> 503 </td><td> Service unavailable. Typically a timeout, or result of a rejected request to prevent service overload. For further assistance, file an issue under \&quot;Performance - 404 and 500 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key - FactSet request ID <br>  </td></tr>
     </table>
   */
  public ApiResponse<Response> getOwnershipHoldersWithHttpInfo(String id, String assetType, String holderType, String topn, String date) throws ApiException {
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
        
        Response
      
    > apiResponse = apiClient.invokeAPI("OwnershipApi.getOwnershipHolders", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getOwnershipHoldersResponseTypeMap, false);

    return apiResponse;

  }
}
