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

import com.factset.sdk.Vermilion.models.ErrorList;
import com.factset.sdk.Vermilion.models.ReportDefinitionData;
import com.factset.sdk.Vermilion.models.ReportDefinitionList;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class ReportApi {
  private ApiClient apiClient;

  public ReportApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ReportApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> getAllReportDefinitionsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getAllReportDefinitionsResponseTypeMap.put(200, new GenericType<ReportDefinitionList>(){});
    getAllReportDefinitionsResponseTypeMap.put(400, new GenericType<ErrorList>(){});
    getAllReportDefinitionsResponseTypeMap.put(401, new GenericType<ErrorList>(){});
    getAllReportDefinitionsResponseTypeMap.put(403, new GenericType<ErrorList>(){});
    getAllReportDefinitionsResponseTypeMap.put(406, new GenericType<ErrorList>(){});
  }

  private static final Map<Integer, GenericType> getReportDefinitionByCodeResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getReportDefinitionByCodeResponseTypeMap.put(200, new GenericType<ReportDefinitionData>(){});
    getReportDefinitionByCodeResponseTypeMap.put(400, new GenericType<ErrorList>(){});
    getReportDefinitionByCodeResponseTypeMap.put(401, new GenericType<ErrorList>(){});
    getReportDefinitionByCodeResponseTypeMap.put(403, new GenericType<ErrorList>(){});
    getReportDefinitionByCodeResponseTypeMap.put(404, new GenericType<ErrorList>(){});
    getReportDefinitionByCodeResponseTypeMap.put(406, new GenericType<ErrorList>(){});
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
   * Gets all report definitions
   * Gets all report definitions the user has permissions for
   * @param tenant The code of the tenancy (required)
   * @param sort The column to sort on. Can add - to sort (optional)
   * @param paginationLimit Non-negative maximum number of entries to return (optional)
   * @param paginationOffset Non-negative number of entries to skip (optional)
   * @return ReportDefinitionList
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> The supplied report definition code was either missing or invalid, or the report definition was not found </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorised </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> No permissions to view reports in VRS </td><td>  -  </td></tr>
       <tr><td> 406 </td><td> Unsupported Accept header. Header needs to be set to application/json. </td><td>  -  </td></tr>
     </table>
   */
  public ReportDefinitionList getAllReportDefinitions(String tenant, java.util.List<String> sort, Integer paginationLimit, Integer paginationOffset) throws ApiException {
    return getAllReportDefinitionsWithHttpInfo(tenant, sort, paginationLimit, paginationOffset).getData();
  }

  /**
   * Gets all report definitions
   * Gets all report definitions the user has permissions for
   * @param tenant The code of the tenancy (required)
   * @param sort The column to sort on. Can add - to sort (optional)
   * @param paginationLimit Non-negative maximum number of entries to return (optional)
   * @param paginationOffset Non-negative number of entries to skip (optional)
   * @return ApiResponse&lt;ReportDefinitionList&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> The supplied report definition code was either missing or invalid, or the report definition was not found </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorised </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> No permissions to view reports in VRS </td><td>  -  </td></tr>
       <tr><td> 406 </td><td> Unsupported Accept header. Header needs to be set to application/json. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ReportDefinitionList> getAllReportDefinitionsWithHttpInfo(String tenant, java.util.List<String> sort, Integer paginationLimit, Integer paginationOffset) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'tenant' is set
    if (tenant == null) {
      throw new ApiException(400, "Missing the required parameter 'tenant' when calling getAllReportDefinitions");
    }
    
    // create path and map variables
    String localVarPath = "/v1/{tenant}/reports"
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
        
        ReportDefinitionList
      
    > apiResponse = apiClient.invokeAPI("ReportApi.getAllReportDefinitions", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getAllReportDefinitionsResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Gets a report definition
   * Gets a report defintion based on the code specified
   * @param tenant The code of the tenancy (required)
   * @param reportDefinitionCode The code of the report definition (required)
   * @return ReportDefinitionData
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> The supplied report definition code was either missing or invalid, or the report definition was not found </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorised </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> No permissions to view reports in VRS </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The supplied report definition code was was not found </td><td>  -  </td></tr>
       <tr><td> 406 </td><td> Unsupported Accept header. Header needs to be set to application/json. </td><td>  -  </td></tr>
     </table>
   */
  public ReportDefinitionData getReportDefinitionByCode(String tenant, String reportDefinitionCode) throws ApiException {
    return getReportDefinitionByCodeWithHttpInfo(tenant, reportDefinitionCode).getData();
  }

  /**
   * Gets a report definition
   * Gets a report defintion based on the code specified
   * @param tenant The code of the tenancy (required)
   * @param reportDefinitionCode The code of the report definition (required)
   * @return ApiResponse&lt;ReportDefinitionData&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> The supplied report definition code was either missing or invalid, or the report definition was not found </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorised </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> No permissions to view reports in VRS </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The supplied report definition code was was not found </td><td>  -  </td></tr>
       <tr><td> 406 </td><td> Unsupported Accept header. Header needs to be set to application/json. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ReportDefinitionData> getReportDefinitionByCodeWithHttpInfo(String tenant, String reportDefinitionCode) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'tenant' is set
    if (tenant == null) {
      throw new ApiException(400, "Missing the required parameter 'tenant' when calling getReportDefinitionByCode");
    }
    
    // verify the required parameter 'reportDefinitionCode' is set
    if (reportDefinitionCode == null) {
      throw new ApiException(400, "Missing the required parameter 'reportDefinitionCode' when calling getReportDefinitionByCode");
    }
    
    // create path and map variables
    String localVarPath = "/v1/{tenant}/reports/{reportDefinitionCode}"
      .replaceAll("\\{" + "tenant" + "\\}", apiClient.escapeString(tenant.toString()))
      .replaceAll("\\{" + "reportDefinitionCode" + "\\}", apiClient.escapeString(reportDefinitionCode.toString()));

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
        
        ReportDefinitionData
      
    > apiResponse = apiClient.invokeAPI("ReportApi.getReportDefinitionByCode", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getReportDefinitionByCodeResponseTypeMap, false);

    return apiResponse;

  }
}
