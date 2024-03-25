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

import com.factset.sdk.StandardDatafeed.models.ErrorResponse;
import com.factset.sdk.StandardDatafeed.models.ListSchema;
import com.factset.sdk.StandardDatafeed.models.SchemaDetail;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SchemaApi {
  private ApiClient apiClient;

  public SchemaApi() {
    this(Configuration.getDefaultApiClient());
  }

  public SchemaApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> getListSchemaswithoutwithooutRequiredParametersResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getListSchemaswithoutwithooutRequiredParametersResponseTypeMap.put(200, new GenericType<ListSchema>(){});
    getListSchemaswithoutwithooutRequiredParametersResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getListSchemaswithoutwithooutRequiredParametersResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getListSchemaswithoutwithooutRequiredParametersResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getListSchemaswithoutwithooutRequiredParametersResponseTypeMap.put(429, new GenericType<ErrorResponse>(){});
    getListSchemaswithoutwithooutRequiredParametersResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> getSchemaDetailsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getSchemaDetailsResponseTypeMap.put(200, new GenericType<SchemaDetail>(){});
    getSchemaDetailsResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getSchemaDetailsResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getSchemaDetailsResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getSchemaDetailsResponseTypeMap.put(429, new GenericType<ErrorResponse>(){});
    getSchemaDetailsResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
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
   * List of Standard DataFeed (SDF) schemas.
   * This helper endpoint provides the list of schemas subscribed by the client and their corresponding versions. 
   * @return ListSchema
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses.  </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint but is not authorized to access it. The request was legal, but the server is refusing to respond. Please reach out to the FactSet Account Team for assistance with authorization.  </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> Quantity Limits Exceeded </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public ListSchema getListSchemaswithoutwithooutRequiredParameters() throws ApiException {
    return getListSchemaswithoutwithooutRequiredParametersWithHttpInfo().getData();
  }

  /**
   * List of Standard DataFeed (SDF) schemas.
   * This helper endpoint provides the list of schemas subscribed by the client and their corresponding versions. 
   * @return ApiResponse&lt;ListSchema&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses.  </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint but is not authorized to access it. The request was legal, but the server is refusing to respond. Please reach out to the FactSet Account Team for assistance with authorization.  </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> Quantity Limits Exceeded </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ListSchema> getListSchemaswithoutwithooutRequiredParametersWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/list-schemas";

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
        
        ListSchema
      
    > apiResponse = apiClient.invokeAPI("SchemaApi.getListSchemaswithoutwithooutRequiredParameters", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getListSchemaswithoutwithooutRequiredParametersResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Schema Details.
   * If the schema and version number are passed in the request, this endpoint provides a pre-signed URL pointing to the location from where the schema details can be downloaded. 
   * @param schema Name of the schema. (required)
   * @param version Version number of the schema. (required)
   * @return SchemaDetail
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses.  </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint but is not authorized to access it. The request was legal, but the server is refusing to respond. Please reach out to the FactSet Account Team for assistance with authorization.  </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> Quantity Limits Exceeded </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public SchemaDetail getSchemaDetails(String schema, Integer version) throws ApiException {
    return getSchemaDetailsWithHttpInfo(schema, version).getData();
  }

  /**
   * Schema Details.
   * If the schema and version number are passed in the request, this endpoint provides a pre-signed URL pointing to the location from where the schema details can be downloaded. 
   * @param schema Name of the schema. (required)
   * @param version Version number of the schema. (required)
   * @return ApiResponse&lt;SchemaDetail&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses.  </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint but is not authorized to access it. The request was legal, but the server is refusing to respond. Please reach out to the FactSet Account Team for assistance with authorization.  </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> Quantity Limits Exceeded </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SchemaDetail> getSchemaDetailsWithHttpInfo(String schema, Integer version) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'schema' is set
    if (schema == null) {
      throw new ApiException(400, "Missing the required parameter 'schema' when calling getSchemaDetails");
    }
    
    // verify the required parameter 'version' is set
    if (version == null) {
      throw new ApiException(400, "Missing the required parameter 'version' when calling getSchemaDetails");
    }
    
    // create path and map variables
    String localVarPath = "/schema-details";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "schema", schema));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "version", version));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        SchemaDetail
      
    > apiResponse = apiClient.invokeAPI("SchemaApi.getSchemaDetails", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getSchemaDetailsResponseTypeMap, false);

    return apiResponse;

  }
}
