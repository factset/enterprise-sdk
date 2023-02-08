package com.factset.sdk.FactSetNER.api;

import com.factset.sdk.FactSetNER.ApiException;
import com.factset.sdk.FactSetNER.ApiClient;
import com.factset.sdk.FactSetNER.ApiResponse;
import com.factset.sdk.FactSetNER.Configuration;
import com.factset.sdk.FactSetNER.Pair;

import javax.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.FactSetNER.models.Request;
import com.factset.sdk.FactSetNER.models.Response;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class EntitiesApi {
  private ApiClient apiClient;

  public EntitiesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public EntitiesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> postEntitiesEntitiesResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    postEntitiesEntitiesResponseTypeMap.put(200, new GenericType<Response>(){});
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
   * Extract named entities from document text.
   * @param payload  (optional)
   * @return Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Server-side Error </td><td>  -  </td></tr>
     </table>
   */
  public Response postEntitiesEntities(Request payload) throws ApiException {
    return postEntitiesEntitiesWithHttpInfo(payload).getData();
  }

  /**
   * 
   * Extract named entities from document text.
   * @param payload  (optional)
   * @return ApiResponse&lt;Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Server-side Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Response> postEntitiesEntitiesWithHttpInfo(Request payload) throws ApiException {
    Object localVarPostBody = payload;
    
    // create path and map variables
    String localVarPath = "/cognitive/ner/v1/entities";

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
        
        Response
      
    > apiResponse = apiClient.invokeAPI("EntitiesApi.postEntitiesEntities", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, postEntitiesEntitiesResponseTypeMap, false);

    return apiResponse;

  }
}
