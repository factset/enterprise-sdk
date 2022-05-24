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


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SwivelApi {
  private ApiClient apiClient;

  public SwivelApi() {
    this(Configuration.getDefaultApiClient());
  }

  public SwivelApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

    private static final Map<Integer, GenericType> getSwivelEndpointResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getSwivelEndpointResponseTypeMap.put(200, new GenericType<java.util.List<String>>(){});
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
   * Get Swivel endpoint, takes report parameter inputs and returns the Cargo location for the specified report via a 302 redirect.
   * Note: Due to Swagger UI functionality, the redirect is automatically followed when using &#39;Try it out&#39;, so instead of the 302 Header response, a 200 is returned with the Cargo response Body.
   * @param pubDoc The publisher document containing the report (required)
   * @param assetName The PA/SPAR asset name and extension (required)
   * @param reportId The PA/SPAR report ID (required)
   * @param tileId The PA/SPAR tile ID (required)
   * @param accountId The account ID (required)
   * @return java.util.List<String>
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Expected response (when redirect followed), returns json response body of the report. </td><td>  * Transfer-Encoding - Standard HTTP header. Header value will be set to Chunked if Accept-Encoding header is specified. <br>  * Content-Encoding - Standard HTTP header. Header value based on Accept-Encoding Request header. <br>  * Content-Type - Standard HTTP header. <br>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  </td></tr>
       <tr><td> 302 </td><td> Expected response, contains the Cargo URL in the Location header. </td><td>  * Location - Redirect URL to get Cargo object.    (example: https://api.factset.com/analytics/pub-datastore/cargo/v1/groups/a4186c50f8e74f979d271dd22298c901/objects/fe875bc4150542dea6bc237663a01a0d) <br>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  </td></tr>
       <tr><td> 400 </td><td> Invalid parameter provided. </td><td>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  </td></tr>
       <tr><td> 401 </td><td> Missing or invalid authentication. </td><td>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  </td></tr>
       <tr><td> 403 </td><td> User is forbidden with current credentials </td><td>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  </td></tr>
       <tr><td> 404 </td><td> The provided request does not exist. </td><td>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  </td></tr>
       <tr><td> 500 </td><td> Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting </td><td>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  </td></tr>
       <tr><td> 503 </td><td> Request timed out. Retry the request in sometime. </td><td>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  </td></tr>
     </table>
   */
  public java.util.List<String> getSwivelEndpoint(String pubDoc, String assetName, String reportId, String tileId, String accountId) throws ApiException {
    return getSwivelEndpointWithHttpInfo(pubDoc, assetName, reportId, tileId, accountId).getData();
  }

  /**
   * Get Swivel endpoint, takes report parameter inputs and returns the Cargo location for the specified report via a 302 redirect.
   * Note: Due to Swagger UI functionality, the redirect is automatically followed when using &#39;Try it out&#39;, so instead of the 302 Header response, a 200 is returned with the Cargo response Body.
   * @param pubDoc The publisher document containing the report (required)
   * @param assetName The PA/SPAR asset name and extension (required)
   * @param reportId The PA/SPAR report ID (required)
   * @param tileId The PA/SPAR tile ID (required)
   * @param accountId The account ID (required)
   * @return ApiResponse&lt;java.util.List<String>&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Expected response (when redirect followed), returns json response body of the report. </td><td>  * Transfer-Encoding - Standard HTTP header. Header value will be set to Chunked if Accept-Encoding header is specified. <br>  * Content-Encoding - Standard HTTP header. Header value based on Accept-Encoding Request header. <br>  * Content-Type - Standard HTTP header. <br>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  </td></tr>
       <tr><td> 302 </td><td> Expected response, contains the Cargo URL in the Location header. </td><td>  * Location - Redirect URL to get Cargo object.    (example: https://api.factset.com/analytics/pub-datastore/cargo/v1/groups/a4186c50f8e74f979d271dd22298c901/objects/fe875bc4150542dea6bc237663a01a0d) <br>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  </td></tr>
       <tr><td> 400 </td><td> Invalid parameter provided. </td><td>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  </td></tr>
       <tr><td> 401 </td><td> Missing or invalid authentication. </td><td>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  </td></tr>
       <tr><td> 403 </td><td> User is forbidden with current credentials </td><td>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  </td></tr>
       <tr><td> 404 </td><td> The provided request does not exist. </td><td>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  </td></tr>
       <tr><td> 500 </td><td> Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting </td><td>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  </td></tr>
       <tr><td> 503 </td><td> Request timed out. Retry the request in sometime. </td><td>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  </td></tr>
     </table>
   */
  public ApiResponse<java.util.List<String>> getSwivelEndpointWithHttpInfo(String pubDoc, String assetName, String reportId, String tileId, String accountId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'pubDoc' is set
    if (pubDoc == null) {
      throw new ApiException(400, "Missing the required parameter 'pubDoc' when calling getSwivelEndpoint");
    }
    
    // verify the required parameter 'assetName' is set
    if (assetName == null) {
      throw new ApiException(400, "Missing the required parameter 'assetName' when calling getSwivelEndpoint");
    }
    
    // verify the required parameter 'reportId' is set
    if (reportId == null) {
      throw new ApiException(400, "Missing the required parameter 'reportId' when calling getSwivelEndpoint");
    }
    
    // verify the required parameter 'tileId' is set
    if (tileId == null) {
      throw new ApiException(400, "Missing the required parameter 'tileId' when calling getSwivelEndpoint");
    }
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getSwivelEndpoint");
    }
    
    // create path and map variables
    String localVarPath = "/analytics/pub-datastore/swivel/v1/{pubDoc}/{assetName}/{reportId}/{tileId}/{accountId}"
      .replaceAll("\\{" + "pubDoc" + "\\}", apiClient.escapeString(pubDoc.toString()))
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
      "headers"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        java.util.List<String>
      
    > apiResponse = apiClient.invokeAPI("SwivelApi.getSwivelEndpoint", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getSwivelEndpointResponseTypeMap, false);

    return apiResponse;

  }
}
