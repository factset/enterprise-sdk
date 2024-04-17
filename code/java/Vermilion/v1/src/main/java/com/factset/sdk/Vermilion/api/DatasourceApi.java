package com.factset.sdk.Vermilion.api;

import com.factset.sdk.Vermilion.ApiException;
import com.factset.sdk.Vermilion.ApiClient;
import com.factset.sdk.Vermilion.ApiResponse;
import com.factset.sdk.Vermilion.Configuration;
import com.factset.sdk.Vermilion.Pair;

import jakarta.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.Vermilion.models.DataSourceData;
import com.factset.sdk.Vermilion.models.DataSourceDataInstance;
import com.factset.sdk.Vermilion.models.DataSourceList;
import com.factset.sdk.Vermilion.models.ErrorList;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class DatasourceApi {
  private ApiClient apiClient;

  public DatasourceApi() {
    this(Configuration.getDefaultApiClient());
  }

  public DatasourceApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> getAllDataSourcesResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getAllDataSourcesResponseTypeMap.put(200, new GenericType<DataSourceList>(){});
    getAllDataSourcesResponseTypeMap.put(401, new GenericType<ErrorList>(){});
    getAllDataSourcesResponseTypeMap.put(403, new GenericType<ErrorList>(){});
    getAllDataSourcesResponseTypeMap.put(406, new GenericType<ErrorList>(){});
  }

  private static final Map<Integer, GenericType> getDataSourceByCodeResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getDataSourceByCodeResponseTypeMap.put(200, new GenericType<DataSourceData>(){});
    getDataSourceByCodeResponseTypeMap.put(401, new GenericType<ErrorList>(){});
    getDataSourceByCodeResponseTypeMap.put(403, new GenericType<ErrorList>(){});
    getDataSourceByCodeResponseTypeMap.put(404, new GenericType<ErrorList>(){});
    getDataSourceByCodeResponseTypeMap.put(406, new GenericType<ErrorList>(){});
  }

  private static final Map<Integer, GenericType> getDataSourceDataResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getDataSourceDataResponseTypeMap.put(200, new GenericType<DataSourceDataInstance>(){});
    getDataSourceDataResponseTypeMap.put(400, new GenericType<ErrorList>(){});
    getDataSourceDataResponseTypeMap.put(401, new GenericType<ErrorList>(){});
    getDataSourceDataResponseTypeMap.put(403, new GenericType<ErrorList>(){});
    getDataSourceDataResponseTypeMap.put(404, new GenericType<ErrorList>(){});
    getDataSourceDataResponseTypeMap.put(406, new GenericType<ErrorList>(){});
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
  public DataSourceList getAllDataSources(String tenant, java.util.List<String> sort, Integer paginationLimit, Integer paginationOffset) throws ApiException {
    return getAllDataSourcesWithHttpInfo(tenant, sort, paginationLimit, paginationOffset).getData();
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
  public ApiResponse<DataSourceList> getAllDataSourcesWithHttpInfo(String tenant, java.util.List<String> sort, Integer paginationLimit, Integer paginationOffset) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'tenant' is set
    if (tenant == null) {
      throw new ApiException(400, "Missing the required parameter 'tenant' when calling getAllDataSources");
    }
    
    // create path and map variables
    String localVarPath = "/v1/{tenant}/data-sources"
      .replaceAll("\\{" + "tenant" + "\\}", apiClient.escapeString(tenant.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "_sort", sort));
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


    ApiResponse<
        
        DataSourceList
      
    > apiResponse = apiClient.invokeAPI("DatasourceApi.getAllDataSources", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getAllDataSourcesResponseTypeMap, false);

    return apiResponse;

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
  public DataSourceData getDataSourceByCode(String tenant, String dataSourceCode) throws ApiException {
    return getDataSourceByCodeWithHttpInfo(tenant, dataSourceCode).getData();
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
  public ApiResponse<DataSourceData> getDataSourceByCodeWithHttpInfo(String tenant, String dataSourceCode) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'tenant' is set
    if (tenant == null) {
      throw new ApiException(400, "Missing the required parameter 'tenant' when calling getDataSourceByCode");
    }
    
    // verify the required parameter 'dataSourceCode' is set
    if (dataSourceCode == null) {
      throw new ApiException(400, "Missing the required parameter 'dataSourceCode' when calling getDataSourceByCode");
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


    ApiResponse<
        
        DataSourceData
      
    > apiResponse = apiClient.invokeAPI("DatasourceApi.getDataSourceByCode", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getDataSourceByCodeResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Gets the data for the datasource
   * Gets the data for the datasource. There are optional query parameters to filter the data
   * @param tenant The code of the tenancy (required)
   * @param dataSourceCode The code of the datasource (required)
   * @param entityCodes A series of query parameter used to filter the data for a datasource. This represents the entities for the datasource. E.g.: entityCodes&#x3D;ACCOUNT&amp;entityCodes&#x3D;FUNDS (optional)
   * @param entityKeys A series of query parameter used to filter the data for a datasource. This is the entity key value for an entity selection. E.g.: entityKeys&#x3D;1&amp;entityKeys&#x3D;Test2 (optional)
   * @param paginationLimit Non-negative maximum number of entries to return. Default is 25 (optional)
   * @param paginationOffset Non-negative number of entries to skip. Default is 0 (optional)
   * @return DataSourceDataInstance
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
  public DataSourceDataInstance getDataSourceData(String tenant, String dataSourceCode, String entityCodes, String entityKeys, Integer paginationLimit, Integer paginationOffset) throws ApiException {
    return getDataSourceDataWithHttpInfo(tenant, dataSourceCode, entityCodes, entityKeys, paginationLimit, paginationOffset).getData();
  }

  /**
   * Gets the data for the datasource
   * Gets the data for the datasource. There are optional query parameters to filter the data
   * @param tenant The code of the tenancy (required)
   * @param dataSourceCode The code of the datasource (required)
   * @param entityCodes A series of query parameter used to filter the data for a datasource. This represents the entities for the datasource. E.g.: entityCodes&#x3D;ACCOUNT&amp;entityCodes&#x3D;FUNDS (optional)
   * @param entityKeys A series of query parameter used to filter the data for a datasource. This is the entity key value for an entity selection. E.g.: entityKeys&#x3D;1&amp;entityKeys&#x3D;Test2 (optional)
   * @param paginationLimit Non-negative maximum number of entries to return. Default is 25 (optional)
   * @param paginationOffset Non-negative number of entries to skip. Default is 0 (optional)
   * @return ApiResponse&lt;DataSourceDataInstance&gt;
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
  public ApiResponse<DataSourceDataInstance> getDataSourceDataWithHttpInfo(String tenant, String dataSourceCode, String entityCodes, String entityKeys, Integer paginationLimit, Integer paginationOffset) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'tenant' is set
    if (tenant == null) {
      throw new ApiException(400, "Missing the required parameter 'tenant' when calling getDataSourceData");
    }
    
    // verify the required parameter 'dataSourceCode' is set
    if (dataSourceCode == null) {
      throw new ApiException(400, "Missing the required parameter 'dataSourceCode' when calling getDataSourceData");
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


    ApiResponse<
        
        DataSourceDataInstance
      
    > apiResponse = apiClient.invokeAPI("DatasourceApi.getDataSourceData", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getDataSourceDataResponseTypeMap, false);

    return apiResponse;

  }
}
