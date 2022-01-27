package com.factset.sdk.ProcuretoPayProvisioning.api;

import com.factset.sdk.ProcuretoPayProvisioning.ApiException;
import com.factset.sdk.ProcuretoPayProvisioning.ApiClient;
import com.factset.sdk.ProcuretoPayProvisioning.ApiResponse;
import com.factset.sdk.ProcuretoPayProvisioning.Configuration;
import com.factset.sdk.ProcuretoPayProvisioning.Pair;

import javax.ws.rs.core.GenericType;

import com.factset.sdk.ProcuretoPayProvisioning.models.CancelIndividual;
import com.factset.sdk.ProcuretoPayProvisioning.models.CreateIndividual;
import com.factset.sdk.ProcuretoPayProvisioning.models.GetIndividual;
import com.factset.sdk.ProcuretoPayProvisioning.models.InlineResponse202;
import com.factset.sdk.ProcuretoPayProvisioning.models.ModifyIndividual;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UserManagementApi {
  private ApiClient apiClient;

  public UserManagementApi() {
    this(Configuration.getDefaultApiClient());
  }

  public UserManagementApi(ApiClient apiClient) {
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
   * Cancels an individual&#39;s serial and all productIds
   * 
   * @param cancelIndividual  (optional)
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
  public InlineResponse202 cancelIndividualPost(CancelIndividual cancelIndividual) throws ApiException {
    return cancelIndividualPostWithHttpInfo(cancelIndividual).getData();
  }

  /**
   * Cancels an individual&#39;s serial and all productIds
   * 
   * @param cancelIndividual  (optional)
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
  public ApiResponse<InlineResponse202> cancelIndividualPostWithHttpInfo(CancelIndividual cancelIndividual) throws ApiException {
    Object localVarPostBody = cancelIndividual;
    
    // create path and map variables
    String localVarPath = "/cancelIndividual";

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

    return apiClient.invokeAPI("UserManagementApi.cancelIndividualPost", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Provisions an individual for FactSet
   * 
   * @param createIndividual  (optional)
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
  public InlineResponse202 createIndividualPost(CreateIndividual createIndividual) throws ApiException {
    return createIndividualPostWithHttpInfo(createIndividual).getData();
  }

  /**
   * Provisions an individual for FactSet
   * 
   * @param createIndividual  (optional)
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
  public ApiResponse<InlineResponse202> createIndividualPostWithHttpInfo(CreateIndividual createIndividual) throws ApiException {
    Object localVarPostBody = createIndividual;
    
    // create path and map variables
    String localVarPath = "/createIndividual";

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

    return apiClient.invokeAPI("UserManagementApi.createIndividualPost", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Returns an individual&#39;s details by uniqueId
   * 
   * @param uniqueid uniqueId to query (required)
   * @return GetIndividual
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
       <tr><td> 403 </td><td> Unauthorized </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
       <tr><td> 429 </td><td> Rate limit reached </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
     </table>
   */
  public GetIndividual getIndividualGet(String uniqueid) throws ApiException {
    return getIndividualGetWithHttpInfo(uniqueid).getData();
  }

  /**
   * Returns an individual&#39;s details by uniqueId
   * 
   * @param uniqueid uniqueId to query (required)
   * @return ApiResponse&lt;GetIndividual&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
       <tr><td> 403 </td><td> Unauthorized </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
       <tr><td> 429 </td><td> Rate limit reached </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
     </table>
   */
  public ApiResponse<GetIndividual> getIndividualGetWithHttpInfo(String uniqueid) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'uniqueid' is set
    if (uniqueid == null) {
      throw new ApiException(400, "Missing the required parameter 'uniqueid' when calling getIndividualGet");
    }
    
    // create path and map variables
    String localVarPath = "/getIndividual";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "uniqueid", uniqueid));

    
    
    
    final String[] localVarAccepts = {
      "application/json; charset=utf-8", "text/plain"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };

    GenericType<GetIndividual> localVarReturnType = new GenericType<GetIndividual>() {};

    return apiClient.invokeAPI("UserManagementApi.getIndividualGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Lists all individuals with details at all locations.
   * 
   * @param includeProductIds &lt;br&gt;Optional, if &#x3D;TRUE will return additional product array per object with all productIds for all returned individuals.&lt;/br&gt; (optional)
   * @return java.util.List&lt;Object&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
       <tr><td> 403 </td><td> Unauthorized </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
       <tr><td> 429 </td><td> Rate limit reached </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
     </table>
   */
  public java.util.List<Object> listIndividualsGet(Boolean includeProductIds) throws ApiException {
    return listIndividualsGetWithHttpInfo(includeProductIds).getData();
  }

  /**
   * Lists all individuals with details at all locations.
   * 
   * @param includeProductIds &lt;br&gt;Optional, if &#x3D;TRUE will return additional product array per object with all productIds for all returned individuals.&lt;/br&gt; (optional)
   * @return ApiResponse&lt;java.util.List&lt;Object&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
       <tr><td> 403 </td><td> Unauthorized </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
       <tr><td> 429 </td><td> Rate limit reached </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
     </table>
   */
  public ApiResponse<java.util.List<Object>> listIndividualsGetWithHttpInfo(Boolean includeProductIds) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/listIndividuals";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "includeProductIds", includeProductIds));

    
    
    
    final String[] localVarAccepts = {
      "application/json; charset=utf-8", "text/plain"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };

    GenericType<java.util.List<Object>> localVarReturnType = new GenericType<java.util.List<Object>>() {};

    return apiClient.invokeAPI("UserManagementApi.listIndividualsGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Modifies an individual&#39;s attributes as determined by the uniqueId in the body of the request. Please note that the uniqueId may not be changed. Fields not changing may be passed as NULL but never empty.
   * 
   * @param modifyIndividual  (optional)
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
  public InlineResponse202 modifyIndividualPost(ModifyIndividual modifyIndividual) throws ApiException {
    return modifyIndividualPostWithHttpInfo(modifyIndividual).getData();
  }

  /**
   * Modifies an individual&#39;s attributes as determined by the uniqueId in the body of the request. Please note that the uniqueId may not be changed. Fields not changing may be passed as NULL but never empty.
   * 
   * @param modifyIndividual  (optional)
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
  public ApiResponse<InlineResponse202> modifyIndividualPostWithHttpInfo(ModifyIndividual modifyIndividual) throws ApiException {
    Object localVarPostBody = modifyIndividual;
    
    // create path and map variables
    String localVarPath = "/modifyIndividual";

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

    return apiClient.invokeAPI("UserManagementApi.modifyIndividualPost", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
