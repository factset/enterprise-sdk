package com.factset.sdk.Vermilion.api;

import com.factset.sdk.Vermilion.ApiException;
import com.factset.sdk.Vermilion.ApiClient;
import com.factset.sdk.Vermilion.ApiResponse;
import com.factset.sdk.Vermilion.Configuration;
import com.factset.sdk.Vermilion.Pair;

import javax.ws.rs.core.GenericType;

import com.factset.sdk.Vermilion.models.EntityFieldValueDTO;
import com.factset.sdk.Vermilion.models.InlineResponse4001;
import com.factset.sdk.Vermilion.models.InlineResponse401;
import com.factset.sdk.Vermilion.models.InlineResponse403;
import com.factset.sdk.Vermilion.models.InlineResponse4041;
import com.factset.sdk.Vermilion.models.InlineResponse406;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class EntityApi {
  private ApiClient apiClient;

  public EntityApi() {
    this(Configuration.getDefaultApiClient());
  }

  public EntityApi(ApiClient apiClient) {
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
   * Gets the entity values
   * Gets the entity values for the specified entity
   * @param tenant The code of the tenancy (required)
   * @param entityCode The code of the entity (required)
   * @param sort The entity field to sort on. Can only be sorted on entity key, description or secondary key fields. Append \&quot;-\&quot; to sort in descending order. If no parameter given, it will be sorted by key field in ascending order by default (optional)
   * @param paginationLimit Non-negative maximum number of entries to return. Default is 25 (optional)
   * @param paginationOffset Non-negative number of entries to skip. Default is 0 (optional)
   * @return EntityFieldValueDTO
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> The supplied entity code was either missing or invalid, or the entity was not found </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorised </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> No permissions to view datasources in VRS </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The supplied entity code was not found </td><td>  -  </td></tr>
       <tr><td> 406 </td><td> Unsupported Accept header. Header needs to be set to application/json. </td><td>  -  </td></tr>
     </table>
   */
  public EntityFieldValueDTO v1TenantEntitiesEntityCodeValuesGet(String tenant, String entityCode, String sort, Integer paginationLimit, Integer paginationOffset) throws ApiException {
    return v1TenantEntitiesEntityCodeValuesGetWithHttpInfo(tenant, entityCode, sort, paginationLimit, paginationOffset).getData();
  }

  /**
   * Gets the entity values
   * Gets the entity values for the specified entity
   * @param tenant The code of the tenancy (required)
   * @param entityCode The code of the entity (required)
   * @param sort The entity field to sort on. Can only be sorted on entity key, description or secondary key fields. Append \&quot;-\&quot; to sort in descending order. If no parameter given, it will be sorted by key field in ascending order by default (optional)
   * @param paginationLimit Non-negative maximum number of entries to return. Default is 25 (optional)
   * @param paginationOffset Non-negative number of entries to skip. Default is 0 (optional)
   * @return ApiResponse&lt;EntityFieldValueDTO&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> The supplied entity code was either missing or invalid, or the entity was not found </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorised </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> No permissions to view datasources in VRS </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The supplied entity code was not found </td><td>  -  </td></tr>
       <tr><td> 406 </td><td> Unsupported Accept header. Header needs to be set to application/json. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<EntityFieldValueDTO> v1TenantEntitiesEntityCodeValuesGetWithHttpInfo(String tenant, String entityCode, String sort, Integer paginationLimit, Integer paginationOffset) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'tenant' is set
    if (tenant == null) {
      throw new ApiException(400, "Missing the required parameter 'tenant' when calling v1TenantEntitiesEntityCodeValuesGet");
    }
    
    // verify the required parameter 'entityCode' is set
    if (entityCode == null) {
      throw new ApiException(400, "Missing the required parameter 'entityCode' when calling v1TenantEntitiesEntityCodeValuesGet");
    }
    
    // create path and map variables
    String localVarPath = "/v1/{tenant}/entities/{entityCode}/values"
      .replaceAll("\\{" + "tenant" + "\\}", apiClient.escapeString(tenant.toString()))
      .replaceAll("\\{" + "entityCode" + "\\}", apiClient.escapeString(entityCode.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_paginationLimit", paginationLimit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_paginationOffset", paginationOffset));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };

    GenericType<EntityFieldValueDTO> localVarReturnType = new GenericType<EntityFieldValueDTO>() {};

    return apiClient.invokeAPI("EntityApi.v1TenantEntitiesEntityCodeValuesGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
