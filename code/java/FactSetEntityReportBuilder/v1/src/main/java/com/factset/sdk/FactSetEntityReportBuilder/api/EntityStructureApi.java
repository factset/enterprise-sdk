package com.factset.sdk.FactSetEntityReportBuilder.api;

import com.factset.sdk.FactSetEntityReportBuilder.ApiException;
import com.factset.sdk.FactSetEntityReportBuilder.ApiClient;
import com.factset.sdk.FactSetEntityReportBuilder.ApiResponse;
import com.factset.sdk.FactSetEntityReportBuilder.Configuration;
import com.factset.sdk.FactSetEntityReportBuilder.Pair;

import jakarta.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.FactSetEntityReportBuilder.models.ErrorResponse;
import com.factset.sdk.FactSetEntityReportBuilder.models.Response;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class EntityStructureApi {
  private ApiClient apiClient;

  public EntityStructureApi() {
    this(Configuration.getDefaultApiClient());
  }

  public EntityStructureApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> getEntityStructureStructureResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getEntityStructureStructureResponseTypeMap.put(200, new GenericType<Response>(){});
    getEntityStructureStructureResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getEntityStructureStructureResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getEntityStructureStructureResponseTypeMap.put(404, new GenericType<ErrorResponse>(){});
    getEntityStructureStructureResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
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
   * Entity structure
   * Returns full entity tree for table and tree display
   * @param id Company ticker (required)
   * @param schema The schema that the data is returned as. The following are descriptions for the accepted values: - table_group_level - STACH 2.0 row organized package format with parent-child relationships represented using STACH group level cell metadata - table_parent_child_columns - STACH 2.0 row organized package format with parent-child relationships represented using STACH parent-child columns - tree - Entities are represented as tree nodes returned in a flat structure, where each parent node contains a children attribute pointing to its child nodes  (optional, default to table_parent_child_columns)
   * @return Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Expected response </td><td>  * Api-Supported-Versions - Supported API major versions <br>  * Api-Version - API version (semantic versioning) <br>  * X-DataDirect-Request-Key - FactSet request ID <br>  </td></tr>
       <tr><td> 400 </td><td> Bad Request. For further assistance, file an issue under \&quot;Workflow &amp; Throttling - 400 or 429 Response\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. </td><td>  * Api-Supported-Versions - Supported API major versions <br>  * Api-Version - API version (semantic versioning) <br>  * X-DataDirect-Request-Key - FactSet request ID <br>  </td></tr>
       <tr><td> 401 </td><td> Missing or invalid authentication. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For further assistance, file an issue under \&quot;Connectivty - 401 or 403 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key - FactSet request ID <br>  </td></tr>
       <tr><td> 403 </td><td> User is forbidden access with current credentials. Reach out to your local FactSet Account Manager for assistance, or file an issue under \&quot;Connectivty - 401 or 403 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key - FactSet request ID <br>  </td></tr>
       <tr><td> 404 </td><td> Not found. For further assistance, file an issue under \&quot;Performance - 404 and 500 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key - FactSet request ID <br>  </td></tr>
       <tr><td> 429 </td><td> Too many requests - this API is rate-limited to 20 requests per second. For further assistance, file an issue under \&quot;Workflow &amp; Throttling - 400 or 429 Response\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key - FactSet request ID <br>  </td></tr>
       <tr><td> 500 </td><td> Server error. For further assistance, file an issue under \&quot;Performance - 404 and 500 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key - FactSet request ID <br>  </td></tr>
       <tr><td> 503 </td><td> Service unavailable. Typically a timeout, or result of a rejected request to prevent service overload. For further assistance, file an issue under \&quot;Performance - 404 and 500 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key - FactSet request ID <br>  </td></tr>
     </table>
   */
  public Response getEntityStructureStructure(String id, String schema) throws ApiException {
    return getEntityStructureStructureWithHttpInfo(id, schema).getData();
  }

  /**
   * Entity structure
   * Returns full entity tree for table and tree display
   * @param id Company ticker (required)
   * @param schema The schema that the data is returned as. The following are descriptions for the accepted values: - table_group_level - STACH 2.0 row organized package format with parent-child relationships represented using STACH group level cell metadata - table_parent_child_columns - STACH 2.0 row organized package format with parent-child relationships represented using STACH parent-child columns - tree - Entities are represented as tree nodes returned in a flat structure, where each parent node contains a children attribute pointing to its child nodes  (optional, default to table_parent_child_columns)
   * @return ApiResponse&lt;Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Expected response </td><td>  * Api-Supported-Versions - Supported API major versions <br>  * Api-Version - API version (semantic versioning) <br>  * X-DataDirect-Request-Key - FactSet request ID <br>  </td></tr>
       <tr><td> 400 </td><td> Bad Request. For further assistance, file an issue under \&quot;Workflow &amp; Throttling - 400 or 429 Response\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. </td><td>  * Api-Supported-Versions - Supported API major versions <br>  * Api-Version - API version (semantic versioning) <br>  * X-DataDirect-Request-Key - FactSet request ID <br>  </td></tr>
       <tr><td> 401 </td><td> Missing or invalid authentication. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For further assistance, file an issue under \&quot;Connectivty - 401 or 403 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key - FactSet request ID <br>  </td></tr>
       <tr><td> 403 </td><td> User is forbidden access with current credentials. Reach out to your local FactSet Account Manager for assistance, or file an issue under \&quot;Connectivty - 401 or 403 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key - FactSet request ID <br>  </td></tr>
       <tr><td> 404 </td><td> Not found. For further assistance, file an issue under \&quot;Performance - 404 and 500 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key - FactSet request ID <br>  </td></tr>
       <tr><td> 429 </td><td> Too many requests - this API is rate-limited to 20 requests per second. For further assistance, file an issue under \&quot;Workflow &amp; Throttling - 400 or 429 Response\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key - FactSet request ID <br>  </td></tr>
       <tr><td> 500 </td><td> Server error. For further assistance, file an issue under \&quot;Performance - 404 and 500 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key - FactSet request ID <br>  </td></tr>
       <tr><td> 503 </td><td> Service unavailable. Typically a timeout, or result of a rejected request to prevent service overload. For further assistance, file an issue under \&quot;Performance - 404 and 500 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key - FactSet request ID <br>  </td></tr>
     </table>
   */
  public ApiResponse<Response> getEntityStructureStructureWithHttpInfo(String id, String schema) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getEntityStructureStructure");
    }
    
    // create path and map variables
    String localVarPath = "/structure";

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
      
    > apiResponse = apiClient.invokeAPI("EntityStructureApi.getEntityStructureStructure", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getEntityStructureStructureResponseTypeMap, false);

    return apiResponse;

  }
}
