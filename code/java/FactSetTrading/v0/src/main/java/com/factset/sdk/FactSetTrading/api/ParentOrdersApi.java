package com.factset.sdk.FactSetTrading.api;

import com.factset.sdk.FactSetTrading.ApiException;
import com.factset.sdk.FactSetTrading.ApiClient;
import com.factset.sdk.FactSetTrading.ApiResponse;
import com.factset.sdk.FactSetTrading.Configuration;
import com.factset.sdk.FactSetTrading.Pair;

import jakarta.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.FactSetTrading.models.ClientErrorResponse;
import com.factset.sdk.FactSetTrading.models.ParentOrdersUpdateResponseRoot;
import com.factset.sdk.FactSetTrading.models.ParentOrdersUpdateRoot;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class ParentOrdersApi {
  private ApiClient apiClient;

  public ParentOrdersApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ParentOrdersApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> updateParentOrderResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    updateParentOrderResponseTypeMap.put(200, new GenericType<ParentOrdersUpdateResponseRoot>(){});
    updateParentOrderResponseTypeMap.put(400, new GenericType<ClientErrorResponse>(){});
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
   * Update Parent Orders
   * This endpoint allows the user to update parent orders which are already present in Trading system.
   * @param parentOrdersUpdateRoot  (optional)
   * @return ParentOrdersUpdateResponseRoot
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Expected response. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Invalid parameters provided. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Missing or invalid authentication. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> User is forbidden with current credentials. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Missing/Invalid Content-Type header. Header needs to be set to application/json. </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> Rate limit reached. Wait before sending further requests. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting. </td><td>  -  </td></tr>
       <tr><td> 503 </td><td> Request timed out. Retry the request in sometime. </td><td>  -  </td></tr>
     </table>
   */
  public ParentOrdersUpdateResponseRoot updateParentOrder(ParentOrdersUpdateRoot parentOrdersUpdateRoot) throws ApiException {
    return updateParentOrderWithHttpInfo(parentOrdersUpdateRoot).getData();
  }

  /**
   * Update Parent Orders
   * This endpoint allows the user to update parent orders which are already present in Trading system.
   * @param parentOrdersUpdateRoot  (optional)
   * @return ApiResponse&lt;ParentOrdersUpdateResponseRoot&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Expected response. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Invalid parameters provided. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Missing or invalid authentication. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> User is forbidden with current credentials. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Missing/Invalid Content-Type header. Header needs to be set to application/json. </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> Rate limit reached. Wait before sending further requests. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting. </td><td>  -  </td></tr>
       <tr><td> 503 </td><td> Request timed out. Retry the request in sometime. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ParentOrdersUpdateResponseRoot> updateParentOrderWithHttpInfo(ParentOrdersUpdateRoot parentOrdersUpdateRoot) throws ApiException {
    Object localVarPostBody = parentOrdersUpdateRoot;
    
    // create path and map variables
    String localVarPath = "/parent-orders/update";

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
        
        ParentOrdersUpdateResponseRoot
      
    > apiResponse = apiClient.invokeAPI("ParentOrdersApi.updateParentOrder", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, updateParentOrderResponseTypeMap, false);

    return apiResponse;

  }
}
