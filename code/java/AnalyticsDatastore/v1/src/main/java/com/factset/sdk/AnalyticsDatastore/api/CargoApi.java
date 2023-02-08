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
public class CargoApi {
  private ApiClient apiClient;

  public CargoApi() {
    this(Configuration.getDefaultApiClient());
  }

  public CargoApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> getCargoEndpointResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getCargoEndpointResponseTypeMap.put(200, new GenericType<java.util.List<String>>(){});
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
   * Get Cargo endpoint, gets an object given an ID. In this case ID retrieved from Swivel Location header, results in json response body of the report.
   * STACH json response documentation: https://pages.github.factset.com/analytics-reporting/stachschema/#/    Optional request header \&quot;accept-encoding\&quot;, with allowed values of \&quot;br\&quot; and \&quot;gzip\&quot;. If accept-encoding is passed, the response is compressed.
   * @param groupId The ID of the group (required)
   * @param objectId The ID of the object (required)
   * @return java.util.List<String>
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Expected response, returns json response body of the report. </td><td>  * Transfer-Encoding - Standard HTTP header. Header value will be set to Chunked if Accept-Encoding header is specified. <br>  * Content-Encoding - Standard HTTP header. Header value based on Accept-Encoding Request header. <br>  * Content-Type - Standard HTTP header. <br>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  </td></tr>
       <tr><td> 400 </td><td> Invalid parameter provided. </td><td>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  </td></tr>
       <tr><td> 401 </td><td> Missing or invalid authentication. </td><td>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  </td></tr>
       <tr><td> 403 </td><td> User is forbidden with current credentials </td><td>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  </td></tr>
       <tr><td> 404 </td><td> The provided request does not exist. </td><td>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  </td></tr>
       <tr><td> 500 </td><td> Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting </td><td>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  </td></tr>
       <tr><td> 503 </td><td> Request timed out. Retry the request in sometime. </td><td>  * X-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  * X-RateLimit-Reset - Number of seconds remaining till rate limit resets. <br>  * X-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  </td></tr>
     </table>
   */
  public java.util.List<String> getCargoEndpoint(String groupId, String objectId) throws ApiException {
    return getCargoEndpointWithHttpInfo(groupId, objectId).getData();
  }

  /**
   * Get Cargo endpoint, gets an object given an ID. In this case ID retrieved from Swivel Location header, results in json response body of the report.
   * STACH json response documentation: https://pages.github.factset.com/analytics-reporting/stachschema/#/    Optional request header \&quot;accept-encoding\&quot;, with allowed values of \&quot;br\&quot; and \&quot;gzip\&quot;. If accept-encoding is passed, the response is compressed.
   * @param groupId The ID of the group (required)
   * @param objectId The ID of the object (required)
   * @return ApiResponse&lt;java.util.List<String>&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Expected response, returns json response body of the report. </td><td>  * Transfer-Encoding - Standard HTTP header. Header value will be set to Chunked if Accept-Encoding header is specified. <br>  * Content-Encoding - Standard HTTP header. Header value based on Accept-Encoding Request header. <br>  * Content-Type - Standard HTTP header. <br>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  </td></tr>
       <tr><td> 400 </td><td> Invalid parameter provided. </td><td>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  </td></tr>
       <tr><td> 401 </td><td> Missing or invalid authentication. </td><td>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  </td></tr>
       <tr><td> 403 </td><td> User is forbidden with current credentials </td><td>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  </td></tr>
       <tr><td> 404 </td><td> The provided request does not exist. </td><td>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  </td></tr>
       <tr><td> 500 </td><td> Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting </td><td>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  </td></tr>
       <tr><td> 503 </td><td> Request timed out. Retry the request in sometime. </td><td>  * X-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  * X-RateLimit-Reset - Number of seconds remaining till rate limit resets. <br>  * X-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  </td></tr>
     </table>
   */
  public ApiResponse<java.util.List<String>> getCargoEndpointWithHttpInfo(String groupId, String objectId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'groupId' is set
    if (groupId == null) {
      throw new ApiException(400, "Missing the required parameter 'groupId' when calling getCargoEndpoint");
    }
    
    // verify the required parameter 'objectId' is set
    if (objectId == null) {
      throw new ApiException(400, "Missing the required parameter 'objectId' when calling getCargoEndpoint");
    }
    
    // create path and map variables
    String localVarPath = "/analytics/pub-datastore/cargo/v1/groups/{groupId}/objects/{objectId}"
      .replaceAll("\\{" + "groupId" + "\\}", apiClient.escapeString(groupId.toString()))
      .replaceAll("\\{" + "objectId" + "\\}", apiClient.escapeString(objectId.toString()));

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
        
        java.util.List<String>
      
    > apiResponse = apiClient.invokeAPI("CargoApi.getCargoEndpoint", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getCargoEndpointResponseTypeMap, false);

    return apiResponse;

  }
}
