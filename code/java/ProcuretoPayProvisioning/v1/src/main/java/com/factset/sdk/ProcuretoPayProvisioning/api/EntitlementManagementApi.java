package com.factset.sdk.ProcuretoPayProvisioning.api;

import com.factset.sdk.ProcuretoPayProvisioning.ApiException;
import com.factset.sdk.ProcuretoPayProvisioning.ApiClient;
import com.factset.sdk.ProcuretoPayProvisioning.ApiResponse;
import com.factset.sdk.ProcuretoPayProvisioning.Configuration;
import com.factset.sdk.ProcuretoPayProvisioning.Pair;

import javax.ws.rs.core.GenericType;

import com.factset.sdk.ProcuretoPayProvisioning.models.InlineResponse202;
import com.factset.sdk.ProcuretoPayProvisioning.models.ManageProductIds;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class EntitlementManagementApi {
  private ApiClient apiClient;

  public EntitlementManagementApi() {
    this(Configuration.getDefaultApiClient());
  }

  public EntitlementManagementApi(ApiClient apiClient) {
    this.apiClient = apiClient;
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
   * Adds listed productIds to an individual
   * 
   * @param manageProductIds  (optional)
   * @return InlineResponse202
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Accepted </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
       <tr><td> 403 </td><td> Unauthorized </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
       <tr><td> 429 </td><td> Rate limit reached </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
     </table>
   */
  public InlineResponse202 addProductsPost(ManageProductIds manageProductIds) throws ApiException {
    return addProductsPostWithHttpInfo(manageProductIds).getData();
  }

  /**
   * Adds listed productIds to an individual
   * 
   * @param manageProductIds  (optional)
   * @return ApiResponse&lt;InlineResponse202&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Accepted </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
       <tr><td> 403 </td><td> Unauthorized </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
       <tr><td> 429 </td><td> Rate limit reached </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse202> addProductsPostWithHttpInfo(ManageProductIds manageProductIds) throws ApiException {
    Object localVarPostBody = manageProductIds;
    
    // create path and map variables
    String localVarPath = "/addProducts";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json; charset=utf-8", "text/plain"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };

    GenericType<InlineResponse202> localVarReturnType = new GenericType<InlineResponse202>() {};

    return apiClient.invokeAPI("EntitlementManagementApi.addProductsPost", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Removes listed productIds from an individual
   * 
   * @param manageProductIds  (optional)
   * @return InlineResponse202
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Accepted </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
       <tr><td> 403 </td><td> Unauthorized </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
       <tr><td> 429 </td><td> Rate limit reached </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
     </table>
   */
  public InlineResponse202 removeProductsPost(ManageProductIds manageProductIds) throws ApiException {
    return removeProductsPostWithHttpInfo(manageProductIds).getData();
  }

  /**
   * Removes listed productIds from an individual
   * 
   * @param manageProductIds  (optional)
   * @return ApiResponse&lt;InlineResponse202&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Accepted </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
       <tr><td> 403 </td><td> Unauthorized </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
       <tr><td> 429 </td><td> Rate limit reached </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse202> removeProductsPostWithHttpInfo(ManageProductIds manageProductIds) throws ApiException {
    Object localVarPostBody = manageProductIds;
    
    // create path and map variables
    String localVarPath = "/removeProducts";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json; charset=utf-8", "text/plain"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };

    GenericType<InlineResponse202> localVarReturnType = new GenericType<InlineResponse202>() {};

    return apiClient.invokeAPI("EntitlementManagementApi.removeProductsPost", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
