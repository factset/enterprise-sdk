package com.factset.sdk.Vermilion.api;

import com.factset.sdk.Vermilion.ApiException;
import com.factset.sdk.Vermilion.ApiClient;
import com.factset.sdk.Vermilion.ApiResponse;
import com.factset.sdk.Vermilion.Configuration;
import com.factset.sdk.Vermilion.Pair;

import javax.ws.rs.core.GenericType;

import com.factset.sdk.Vermilion.models.DataSourceData;
import com.factset.sdk.Vermilion.models.DataSourceDataInstance;
import com.factset.sdk.Vermilion.models.DataSourceList;
import com.factset.sdk.Vermilion.models.InlineResponse400;
import com.factset.sdk.Vermilion.models.InlineResponse401;
import com.factset.sdk.Vermilion.models.InlineResponse403;
import com.factset.sdk.Vermilion.models.InlineResponse404;
import com.factset.sdk.Vermilion.models.InlineResponse406;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DatasourceApi {
  private ApiClient apiClient;

  public DatasourceApi() {
    this(Configuration.getDefaultApiClient());
  }

  public DatasourceApi(ApiClient apiClient) {
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
   * Gets the data for the datasource
   * Gets the data for the datasource. There are optional query parameters to filter the da
   * @param tenant The code of the tenancy (required)
   * @param dataSourceCode The code of the datasource (required)
   * @param entityCodes A series of query parameter used to filter the data for a datasource. This represents the entities for the datasource. E.g.: entityCodes&#x3D;ACCOUNT&amp;entityCodes&#x3D;FUNDS (optional)
   * @param entityKeys A series of query parameter used to filter the data for a datasource. This is the entity key value for an entity selection. E.g.: entityKeys&#x3D;1&amp;entityKeys&#x3D;Test2 (optional)
   * @return java.util.List&lt;DataSourceDataInstance&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation - returns data for the datasource </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> The supplied datasource code was either missing or invalid, or the query parameters are invalid </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorised </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> No permissions to view datasources in VRS </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The supplied datasource code was not found </td><td>  -  </td></tr>
       <tr><td> 406 </td><td> Unsupported Accept header. Header needs to be set to application/json. </td><td>  -  </td></tr>
     </table>
   */
  public java.util.List<DataSourceDataInstance> v1TenantDataSourcesDataSourceCodeDataGet(String tenant, String dataSourceCode, String entityCodes, String entityKeys) throws ApiException {
    return v1TenantDataSourcesDataSourceCodeDataGetWithHttpInfo(tenant, dataSourceCode, entityCodes, entityKeys).getData();
  }

  /**
   * Gets the data for the datasource
   * Gets the data for the datasource. There are optional query parameters to filter the da
   * @param tenant The code of the tenancy (required)
   * @param dataSourceCode The code of the datasource (required)
   * @param entityCodes A series of query parameter used to filter the data for a datasource. This represents the entities for the datasource. E.g.: entityCodes&#x3D;ACCOUNT&amp;entityCodes&#x3D;FUNDS (optional)
   * @param entityKeys A series of query parameter used to filter the data for a datasource. This is the entity key value for an entity selection. E.g.: entityKeys&#x3D;1&amp;entityKeys&#x3D;Test2 (optional)
   * @return ApiResponse&lt;java.util.List&lt;DataSourceDataInstance&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation - returns data for the datasource </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> The supplied datasource code was either missing or invalid, or the query parameters are invalid </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorised </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> No permissions to view datasources in VRS </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The supplied datasource code was not found </td><td>  -  </td></tr>
       <tr><td> 406 </td><td> Unsupported Accept header. Header needs to be set to application/json. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<java.util.List<DataSourceDataInstance>> v1TenantDataSourcesDataSourceCodeDataGetWithHttpInfo(String tenant, String dataSourceCode, String entityCodes, String entityKeys) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'tenant' is set
    if (tenant == null) {
      throw new ApiException(400, "Missing the required parameter 'tenant' when calling v1TenantDataSourcesDataSourceCodeDataGet");
    }
    
    // verify the required parameter 'dataSourceCode' is set
    if (dataSourceCode == null) {
      throw new ApiException(400, "Missing the required parameter 'dataSourceCode' when calling v1TenantDataSourcesDataSourceCodeDataGet");
    }
    
    // create path and map variables
    String localVarPath = "/v1/{tenant}/data-sources/{dataSourceCode}/data"
      .replaceAll("\\{" + "tenant" + "\\}", apiClient.escapeString(tenant.toString()))
      .replaceAll("\\{" + "dataSourceCode" + "\\}", apiClient.escapeString(dataSourceCode.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "entityCodes", entityCodes));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "entityKeys", entityKeys));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };

    GenericType<java.util.List<DataSourceDataInstance>> localVarReturnType = new GenericType<java.util.List<DataSourceDataInstance>>() {};

    return apiClient.invokeAPI("DatasourceApi.v1TenantDataSourcesDataSourceCodeDataGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Gets a datasource
   * Gets a datasource based on the code passed
   * @param tenant The code of the tenancy (required)
   * @param dataSourceCode The code of the datasource (required)
   * @return DataSourceData
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorised </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> No permissions to view datasources in VRS </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The supplied datasource code was not found </td><td>  -  </td></tr>
       <tr><td> 406 </td><td> Unsupported Accept header. Header needs to be set to application/json. </td><td>  -  </td></tr>
     </table>
   */
  public DataSourceData v1TenantDataSourcesDataSourceCodeGet(String tenant, String dataSourceCode) throws ApiException {
    return v1TenantDataSourcesDataSourceCodeGetWithHttpInfo(tenant, dataSourceCode).getData();
  }

  /**
   * Gets a datasource
   * Gets a datasource based on the code passed
   * @param tenant The code of the tenancy (required)
   * @param dataSourceCode The code of the datasource (required)
   * @return ApiResponse&lt;DataSourceData&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorised </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> No permissions to view datasources in VRS </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The supplied datasource code was not found </td><td>  -  </td></tr>
       <tr><td> 406 </td><td> Unsupported Accept header. Header needs to be set to application/json. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<DataSourceData> v1TenantDataSourcesDataSourceCodeGetWithHttpInfo(String tenant, String dataSourceCode) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'tenant' is set
    if (tenant == null) {
      throw new ApiException(400, "Missing the required parameter 'tenant' when calling v1TenantDataSourcesDataSourceCodeGet");
    }
    
    // verify the required parameter 'dataSourceCode' is set
    if (dataSourceCode == null) {
      throw new ApiException(400, "Missing the required parameter 'dataSourceCode' when calling v1TenantDataSourcesDataSourceCodeGet");
    }
    
    // create path and map variables
    String localVarPath = "/v1/{tenant}/data-sources/{dataSourceCode}"
      .replaceAll("\\{" + "tenant" + "\\}", apiClient.escapeString(tenant.toString()))
      .replaceAll("\\{" + "dataSourceCode" + "\\}", apiClient.escapeString(dataSourceCode.toString()));

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

    GenericType<DataSourceData> localVarReturnType = new GenericType<DataSourceData>() {};

    return apiClient.invokeAPI("DatasourceApi.v1TenantDataSourcesDataSourceCodeGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Lists all datasources
   * List all datasources the user has permission to see
   * @param tenant The code of the tenancy (required)
   * @param sort The column to sort on. Append - to sort in descending order. If parameter is not given, no sorting will be done (optional)
   * @param paginationLimit Non-negative maximum number of entries to return. Default is 25 (optional)
   * @param paginationOffset Non-negative number of entries to skip. Default is 0 (optional)
   * @return DataSourceList
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorised </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> No permissions to view datasources in VRS </td><td>  -  </td></tr>
       <tr><td> 406 </td><td> Unsupported Accept header. Header needs to be set to application/json. </td><td>  -  </td></tr>
     </table>
   */
  public DataSourceList v1TenantDataSourcesGet(String tenant, String sort, Integer paginationLimit, Integer paginationOffset) throws ApiException {
    return v1TenantDataSourcesGetWithHttpInfo(tenant, sort, paginationLimit, paginationOffset).getData();
  }

  /**
   * Lists all datasources
   * List all datasources the user has permission to see
   * @param tenant The code of the tenancy (required)
   * @param sort The column to sort on. Append - to sort in descending order. If parameter is not given, no sorting will be done (optional)
   * @param paginationLimit Non-negative maximum number of entries to return. Default is 25 (optional)
   * @param paginationOffset Non-negative number of entries to skip. Default is 0 (optional)
   * @return ApiResponse&lt;DataSourceList&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorised </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> No permissions to view datasources in VRS </td><td>  -  </td></tr>
       <tr><td> 406 </td><td> Unsupported Accept header. Header needs to be set to application/json. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<DataSourceList> v1TenantDataSourcesGetWithHttpInfo(String tenant, String sort, Integer paginationLimit, Integer paginationOffset) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'tenant' is set
    if (tenant == null) {
      throw new ApiException(400, "Missing the required parameter 'tenant' when calling v1TenantDataSourcesGet");
    }
    
    // create path and map variables
    String localVarPath = "/v1/{tenant}/data-sources"
      .replaceAll("\\{" + "tenant" + "\\}", apiClient.escapeString(tenant.toString()));

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

    GenericType<DataSourceList> localVarReturnType = new GenericType<DataSourceList>() {};

    return apiClient.invokeAPI("DatasourceApi.v1TenantDataSourcesGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
