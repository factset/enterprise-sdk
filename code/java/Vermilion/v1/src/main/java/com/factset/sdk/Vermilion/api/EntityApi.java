package com.factset.sdk.Vermilion.api;

import com.factset.sdk.Vermilion.ApiException;
import com.factset.sdk.Vermilion.ApiClient;
import com.factset.sdk.Vermilion.ApiResponse;
import com.factset.sdk.Vermilion.Configuration;
import com.factset.sdk.Vermilion.Pair;

import javax.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.Vermilion.models.EntityFieldValueDTO;
import com.factset.sdk.Vermilion.models.ErrorList;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class EntityApi {
  private ApiClient apiClient;

  public EntityApi() {
    this(Configuration.getDefaultApiClient());
  }

  public EntityApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> getEntityValuesByCodeResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getEntityValuesByCodeResponseTypeMap.put(200, new GenericType<EntityFieldValueDTO>(){});
    getEntityValuesByCodeResponseTypeMap.put(400, new GenericType<ErrorList>(){});
    getEntityValuesByCodeResponseTypeMap.put(401, new GenericType<ErrorList>(){});
    getEntityValuesByCodeResponseTypeMap.put(403, new GenericType<ErrorList>(){});
    getEntityValuesByCodeResponseTypeMap.put(404, new GenericType<ErrorList>(){});
    getEntityValuesByCodeResponseTypeMap.put(406, new GenericType<ErrorList>(){});
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
   * @param showAll Whether to show all field values for each entity row. Value should either be 1 or 0. Default is 0 (false) (optional)
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
  public EntityFieldValueDTO getEntityValuesByCode(String tenant, String entityCode, java.util.List<String> sort, Integer paginationLimit, Integer paginationOffset, Integer showAll) throws ApiException {
    return getEntityValuesByCodeWithHttpInfo(tenant, entityCode, sort, paginationLimit, paginationOffset, showAll).getData();
  }

  /**
   * Gets the entity values
   * Gets the entity values for the specified entity
   * @param tenant The code of the tenancy (required)
   * @param entityCode The code of the entity (required)
   * @param sort The entity field to sort on. Can only be sorted on entity key, description or secondary key fields. Append \&quot;-\&quot; to sort in descending order. If no parameter given, it will be sorted by key field in ascending order by default (optional)
   * @param paginationLimit Non-negative maximum number of entries to return. Default is 25 (optional)
   * @param paginationOffset Non-negative number of entries to skip. Default is 0 (optional)
   * @param showAll Whether to show all field values for each entity row. Value should either be 1 or 0. Default is 0 (false) (optional)
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
  public ApiResponse<EntityFieldValueDTO> getEntityValuesByCodeWithHttpInfo(String tenant, String entityCode, java.util.List<String> sort, Integer paginationLimit, Integer paginationOffset, Integer showAll) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'tenant' is set
    if (tenant == null) {
      throw new ApiException(400, "Missing the required parameter 'tenant' when calling getEntityValuesByCode");
    }
    
    // verify the required parameter 'entityCode' is set
    if (entityCode == null) {
      throw new ApiException(400, "Missing the required parameter 'entityCode' when calling getEntityValuesByCode");
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

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "_sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_paginationLimit", paginationLimit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_paginationOffset", paginationOffset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "showAll", showAll));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        EntityFieldValueDTO
      
    > apiResponse = apiClient.invokeAPI("EntityApi.getEntityValuesByCode", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getEntityValuesByCodeResponseTypeMap, false);

    return apiResponse;

  }
}
