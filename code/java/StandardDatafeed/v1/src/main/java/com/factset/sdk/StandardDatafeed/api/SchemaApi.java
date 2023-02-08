package com.factset.sdk.StandardDatafeed.api;

import com.factset.sdk.StandardDatafeed.ApiException;
import com.factset.sdk.StandardDatafeed.ApiClient;
import com.factset.sdk.StandardDatafeed.ApiResponse;
import com.factset.sdk.StandardDatafeed.Configuration;
import com.factset.sdk.StandardDatafeed.Pair;

import javax.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.StandardDatafeed.models.ListSchema200Response;
import com.factset.sdk.StandardDatafeed.models.ListSchema400Response;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SchemaApi {
  private ApiClient apiClient;

  public SchemaApi() {
    this(Configuration.getDefaultApiClient());
  }

  public SchemaApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> getV1ListSchemasResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getV1ListSchemasResponseTypeMap.put(200, new GenericType<ListSchema200Response>(){});
    getV1ListSchemasResponseTypeMap.put(400, new GenericType<ListSchema400Response>(){});
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
   * schemas
   * &lt;a href&#x3D;https://api.factset.com/bulk-documents/sdf/v1/list-schemas&gt;List-Schemas&lt;/a&gt; helper end point provides the list of schemas subscribed by the client and their corresponding sequences if no query parameters are passed in the request.   If schema &amp; sequence number (version number of schema) are passed in the request, this endpoint provides a downloadable presigned url containing the schema information.
   * @param schema schema name&lt;/p&gt; &lt;/p&gt; **Example: acta_v1, fgp_v1, yn_v1**  QFL:- To query QFL data, please use value:   **qfl_v1**  (optional)
   * @param sequence Version number of a schema  Please enter the sequence number associated with the schema passed in the request **Example: \&quot;8\&quot; from acta_v1: [8],**  QFL:- Enter the sequence number associated with the qfl schema   **Note:** Please pass sequence parameter only while passing the schema parameter in the request (optional)
   * @return ListSchema200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     </table>
   */
  public ListSchema200Response getV1ListSchemas(String schema, Integer sequence) throws ApiException {
    return getV1ListSchemasWithHttpInfo(schema, sequence).getData();
  }

  /**
   * schemas
   * &lt;a href&#x3D;https://api.factset.com/bulk-documents/sdf/v1/list-schemas&gt;List-Schemas&lt;/a&gt; helper end point provides the list of schemas subscribed by the client and their corresponding sequences if no query parameters are passed in the request.   If schema &amp; sequence number (version number of schema) are passed in the request, this endpoint provides a downloadable presigned url containing the schema information.
   * @param schema schema name&lt;/p&gt; &lt;/p&gt; **Example: acta_v1, fgp_v1, yn_v1**  QFL:- To query QFL data, please use value:   **qfl_v1**  (optional)
   * @param sequence Version number of a schema  Please enter the sequence number associated with the schema passed in the request **Example: \&quot;8\&quot; from acta_v1: [8],**  QFL:- Enter the sequence number associated with the qfl schema   **Note:** Please pass sequence parameter only while passing the schema parameter in the request (optional)
   * @return ApiResponse&lt;ListSchema200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ListSchema200Response> getV1ListSchemasWithHttpInfo(String schema, Integer sequence) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/v1/list-schemas";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "schema", schema));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sequence", sequence));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        ListSchema200Response
      
    > apiResponse = apiClient.invokeAPI("SchemaApi.getV1ListSchemas", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getV1ListSchemasResponseTypeMap, false);

    return apiResponse;

  }
}
