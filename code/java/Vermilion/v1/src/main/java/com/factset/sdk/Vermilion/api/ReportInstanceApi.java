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
import java.io.File;
import com.factset.sdk.Vermilion.models.ReportGenerationRequestBody;
import com.factset.sdk.Vermilion.models.ReportInstanceData;
import com.factset.sdk.Vermilion.models.ReportInstanceDataResponse;
import com.factset.sdk.Vermilion.models.ReportInstanceList;
import com.factset.sdk.Vermilion.models.ReportInstanceLogList;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class ReportInstanceApi {
  private ApiClient apiClient;

  public ReportInstanceApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ReportInstanceApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> cancelReportGenerationResponseTypeMap = new HashMap<Integer, GenericType>();

  private static final Map<Integer, GenericType> downloadReportFileResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    downloadReportFileResponseTypeMap.put(200, new GenericType<File>(){});
    downloadReportFileResponseTypeMap.put(400, new GenericType<ErrorList>(){});
    downloadReportFileResponseTypeMap.put(401, new GenericType<ErrorList>(){});
    downloadReportFileResponseTypeMap.put(403, new GenericType<ErrorList>(){});
    downloadReportFileResponseTypeMap.put(406, new GenericType<ErrorList>(){});
  }

  private static final Map<Integer, GenericType> getAllReportInstancesResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getAllReportInstancesResponseTypeMap.put(200, new GenericType<ReportInstanceList>(){});
    getAllReportInstancesResponseTypeMap.put(401, new GenericType<ErrorList>(){});
    getAllReportInstancesResponseTypeMap.put(403, new GenericType<ErrorList>(){});
    getAllReportInstancesResponseTypeMap.put(406, new GenericType<ErrorList>(){});
  }

  private static final Map<Integer, GenericType> getReportGenerationLogsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getReportGenerationLogsResponseTypeMap.put(200, new GenericType<ReportInstanceLogList>(){});
    getReportGenerationLogsResponseTypeMap.put(401, new GenericType<ErrorList>(){});
    getReportGenerationLogsResponseTypeMap.put(403, new GenericType<ErrorList>(){});
    getReportGenerationLogsResponseTypeMap.put(404, new GenericType<ErrorList>(){});
    getReportGenerationLogsResponseTypeMap.put(406, new GenericType<ErrorList>(){});
  }

  private static final Map<Integer, GenericType> getReportInstanceByIdResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getReportInstanceByIdResponseTypeMap.put(200, new GenericType<ReportInstanceData>(){});
    getReportInstanceByIdResponseTypeMap.put(400, new GenericType<ErrorList>(){});
    getReportInstanceByIdResponseTypeMap.put(401, new GenericType<ErrorList>(){});
    getReportInstanceByIdResponseTypeMap.put(403, new GenericType<ErrorList>(){});
    getReportInstanceByIdResponseTypeMap.put(404, new GenericType<ErrorList>(){});
    getReportInstanceByIdResponseTypeMap.put(406, new GenericType<ErrorList>(){});
  }

  private static final Map<Integer, GenericType> startReportGenerationResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    startReportGenerationResponseTypeMap.put(202, new GenericType<ReportInstanceDataResponse>(){});
    startReportGenerationResponseTypeMap.put(400, new GenericType<ErrorList>(){});
    startReportGenerationResponseTypeMap.put(401, new GenericType<ErrorList>(){});
    startReportGenerationResponseTypeMap.put(403, new GenericType<ErrorList>(){});
    startReportGenerationResponseTypeMap.put(404, new GenericType<ErrorList>(){});
    startReportGenerationResponseTypeMap.put(406, new GenericType<ErrorList>(){});
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
   * Cancels a report generation
   * Sends a request to cancel a report generation based on the report instance id passed
   * @param tenant The code of the tenancy (required)
   * @param reportInstanceId The id of the report instance (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> Successful operation - no response </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> The supplied report instance id was either missing or invalid </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorised </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> No permissions to view reports in VRS </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The supplied report instance ID could not be found </td><td>  -  </td></tr>
       <tr><td> 406 </td><td> Unsupported Accept header. Header needs to be set to application/json. </td><td>  -  </td></tr>
     </table>
   */
  public void cancelReportGeneration(String tenant, String reportInstanceId) throws ApiException {
    cancelReportGenerationWithHttpInfo(tenant, reportInstanceId);
  }

  /**
   * Cancels a report generation
   * Sends a request to cancel a report generation based on the report instance id passed
   * @param tenant The code of the tenancy (required)
   * @param reportInstanceId The id of the report instance (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> Successful operation - no response </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> The supplied report instance id was either missing or invalid </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorised </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> No permissions to view reports in VRS </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The supplied report instance ID could not be found </td><td>  -  </td></tr>
       <tr><td> 406 </td><td> Unsupported Accept header. Header needs to be set to application/json. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> cancelReportGenerationWithHttpInfo(String tenant, String reportInstanceId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'tenant' is set
    if (tenant == null) {
      throw new ApiException(400, "Missing the required parameter 'tenant' when calling cancelReportGeneration");
    }
    
    // verify the required parameter 'reportInstanceId' is set
    if (reportInstanceId == null) {
      throw new ApiException(400, "Missing the required parameter 'reportInstanceId' when calling cancelReportGeneration");
    }
    
    // create path and map variables
    String localVarPath = "/v1/{tenant}/report-instances/{reportInstanceId}"
      .replaceAll("\\{" + "tenant" + "\\}", apiClient.escapeString(tenant.toString()))
      .replaceAll("\\{" + "reportInstanceId" + "\\}", apiClient.escapeString(reportInstanceId.toString()));

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
      Void
    > apiResponse = apiClient.invokeAPI("ReportInstanceApi.cancelReportGeneration", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, cancelReportGenerationResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Gets the generated file
   * Get the generated file for a report instance. Users can fetch the generated report once the generation is finished. The report instance id and the report file name are passed in as path paramters. The following mapping defines the respective Content-Type for the outputFormat defined during report generation. | outputFormat | Content-Type | | ---------------- | ------------| |WORD     | application/msword | |WORD2010 |   application/vnd.openxmlformats-officedocument.wordprocessingml.document| |EXCEL    |   application/vnd.ms-excel| |EXCEL2010|   application/vnd.openxmlformats-officedocument.spreadsheetml.sheet| |PPT      |   application/vnd.ms-powerpoint| |PPT2010  |   application/vnd.openxmlformats-officedocument.presentationml.presentation| |PDF      |   application/pdf| |CSV      |   text/csv| |XML      |   application/xml| |VXML     |   application/xml| |HTML     |   text/html| |PS       |   application/postscript|
   * @param tenant The code of the tenancy (required)
   * @param reportInstanceId Used to validate that report file name belongs to the report instance passed (required)
   * @param reportFileName The report file name that has to be retrieved. report file name. E.g: xyz.pdf (required)
   * @return File
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> The supplied report instance id was either missing or invalid or the report instance was not found. The supplied report file name was either invalid or not found </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorised </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> No permissions to view the generated file in VRS </td><td>  -  </td></tr>
       <tr><td> 406 </td><td> Unsupported Accept header. </td><td>  -  </td></tr>
     </table>
   */
  public File downloadReportFile(String tenant, String reportInstanceId, String reportFileName) throws ApiException {
    return downloadReportFileWithHttpInfo(tenant, reportInstanceId, reportFileName).getData();
  }

  /**
   * Gets the generated file
   * Get the generated file for a report instance. Users can fetch the generated report once the generation is finished. The report instance id and the report file name are passed in as path paramters. The following mapping defines the respective Content-Type for the outputFormat defined during report generation. | outputFormat | Content-Type | | ---------------- | ------------| |WORD     | application/msword | |WORD2010 |   application/vnd.openxmlformats-officedocument.wordprocessingml.document| |EXCEL    |   application/vnd.ms-excel| |EXCEL2010|   application/vnd.openxmlformats-officedocument.spreadsheetml.sheet| |PPT      |   application/vnd.ms-powerpoint| |PPT2010  |   application/vnd.openxmlformats-officedocument.presentationml.presentation| |PDF      |   application/pdf| |CSV      |   text/csv| |XML      |   application/xml| |VXML     |   application/xml| |HTML     |   text/html| |PS       |   application/postscript|
   * @param tenant The code of the tenancy (required)
   * @param reportInstanceId Used to validate that report file name belongs to the report instance passed (required)
   * @param reportFileName The report file name that has to be retrieved. report file name. E.g: xyz.pdf (required)
   * @return ApiResponse&lt;File&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> The supplied report instance id was either missing or invalid or the report instance was not found. The supplied report file name was either invalid or not found </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorised </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> No permissions to view the generated file in VRS </td><td>  -  </td></tr>
       <tr><td> 406 </td><td> Unsupported Accept header. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<File> downloadReportFileWithHttpInfo(String tenant, String reportInstanceId, String reportFileName) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'tenant' is set
    if (tenant == null) {
      throw new ApiException(400, "Missing the required parameter 'tenant' when calling downloadReportFile");
    }
    
    // verify the required parameter 'reportInstanceId' is set
    if (reportInstanceId == null) {
      throw new ApiException(400, "Missing the required parameter 'reportInstanceId' when calling downloadReportFile");
    }
    
    // verify the required parameter 'reportFileName' is set
    if (reportFileName == null) {
      throw new ApiException(400, "Missing the required parameter 'reportFileName' when calling downloadReportFile");
    }
    
    // create path and map variables
    String localVarPath = "/v1/{tenant}/report-instances/{reportInstanceId}/results/{reportFileName}"
      .replaceAll("\\{" + "tenant" + "\\}", apiClient.escapeString(tenant.toString()))
      .replaceAll("\\{" + "reportInstanceId" + "\\}", apiClient.escapeString(reportInstanceId.toString()))
      .replaceAll("\\{" + "reportFileName" + "\\}", apiClient.escapeString(reportFileName.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/pdf", "application/vnd.openxmlformats-officedocument.presentationml.presentation", "application/vnd.ms-powerpoint", "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet", "application/vnd.ms-excel", "application/vnd.openxmlformats-officedocument.wordprocessingml.document", "application/msword", "application/postscript", "text/csv", "text/html", "application/xml", "application/zip", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        File
      
    > apiResponse = apiClient.invokeAPI("ReportInstanceApi.downloadReportFile", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, downloadReportFileResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Gets a list of report instances
   * Gets a list of report instances. This can be filtered down further by including query parameters in the URL. For example, a report definition id can be added so the only report instances returned are the ones with a matching id
   * @param tenant The code of the tenancy (required)
   * @param reportDefinitionCode Acts as a filter for the retrieval process. Filters the report instances that match the report definition code (optional)
   * @param entityCodes A series of query parameters used to filter the report instances by entity code. E.g: entityCode&#x3D;DATE&amp;entityCode&#x3D;SYSTEM_LANG (optional)
   * @param entityKeys A series of query parameters used to filter the report instances by entity keys. E.g: entityKey&#x3D;en-gb (optional)
   * @param sectionFilter Acts as a filter for the retrieval process. Filters the report instances that match the section filter (optional)
   * @param outputFormat Acts as a filter for the retrieval process. Filters the report instances that match the output format (optional)
   * @param sort The column to sort on. Append - to sort in descending order. If parameter is not given, sorting will be based on the report instance id in descending order (optional)
   * @param paginationLimit Non-negative maximum number of entries to return (optional)
   * @param paginationOffset Non-negative number of entries to skip (optional)
   * @return ReportInstanceList
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorised </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> No permissions to view reports in VRS </td><td>  -  </td></tr>
       <tr><td> 406 </td><td> Unsupported Accept header. Header needs to be set to application/json. </td><td>  -  </td></tr>
     </table>
   */
  public ReportInstanceList getAllReportInstances(String tenant, String reportDefinitionCode, String entityCodes, String entityKeys, String sectionFilter, String outputFormat, java.util.List<String> sort, Integer paginationLimit, Integer paginationOffset) throws ApiException {
    return getAllReportInstancesWithHttpInfo(tenant, reportDefinitionCode, entityCodes, entityKeys, sectionFilter, outputFormat, sort, paginationLimit, paginationOffset).getData();
  }

  /**
   * Gets a list of report instances
   * Gets a list of report instances. This can be filtered down further by including query parameters in the URL. For example, a report definition id can be added so the only report instances returned are the ones with a matching id
   * @param tenant The code of the tenancy (required)
   * @param reportDefinitionCode Acts as a filter for the retrieval process. Filters the report instances that match the report definition code (optional)
   * @param entityCodes A series of query parameters used to filter the report instances by entity code. E.g: entityCode&#x3D;DATE&amp;entityCode&#x3D;SYSTEM_LANG (optional)
   * @param entityKeys A series of query parameters used to filter the report instances by entity keys. E.g: entityKey&#x3D;en-gb (optional)
   * @param sectionFilter Acts as a filter for the retrieval process. Filters the report instances that match the section filter (optional)
   * @param outputFormat Acts as a filter for the retrieval process. Filters the report instances that match the output format (optional)
   * @param sort The column to sort on. Append - to sort in descending order. If parameter is not given, sorting will be based on the report instance id in descending order (optional)
   * @param paginationLimit Non-negative maximum number of entries to return (optional)
   * @param paginationOffset Non-negative number of entries to skip (optional)
   * @return ApiResponse&lt;ReportInstanceList&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorised </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> No permissions to view reports in VRS </td><td>  -  </td></tr>
       <tr><td> 406 </td><td> Unsupported Accept header. Header needs to be set to application/json. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ReportInstanceList> getAllReportInstancesWithHttpInfo(String tenant, String reportDefinitionCode, String entityCodes, String entityKeys, String sectionFilter, String outputFormat, java.util.List<String> sort, Integer paginationLimit, Integer paginationOffset) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'tenant' is set
    if (tenant == null) {
      throw new ApiException(400, "Missing the required parameter 'tenant' when calling getAllReportInstances");
    }
    
    // create path and map variables
    String localVarPath = "/v1/{tenant}/report-instances"
      .replaceAll("\\{" + "tenant" + "\\}", apiClient.escapeString(tenant.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "reportDefinitionCode", reportDefinitionCode));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "entityCodes", entityCodes));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "entityKeys", entityKeys));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sectionFilter", sectionFilter));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "outputFormat", outputFormat));
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
        
        ReportInstanceList
      
    > apiResponse = apiClient.invokeAPI("ReportInstanceApi.getAllReportInstances", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getAllReportInstancesResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Gets a list of logs for the report instance generation
   * Gets a list of logs for the generated report instance. Allows the user to sort on log message, type and date. Also allows for retrieving of just the errors &amp; warnings&#39;
   * @param tenant The code of the tenancy (required)
   * @param reportInstanceId Used to validate that report file name belongs to the report instance passed (required)
   * @param errorsOnly If the parameter is set to true the endpoint should return just errors and warnings E.g: errorsOnly&#x3D;true (optional)
   * @param sort The column to sort on. Can add - to sort (optional)
   * @param paginationLimit Non-negative maximum number of entries to return (optional)
   * @param paginationOffset Non-negative number of entries to skip (optional)
   * @return ReportInstanceLogList
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorised </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> No permissions to view reports in VRS </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The supplied report instance ID could not be found </td><td>  -  </td></tr>
       <tr><td> 406 </td><td> Unsupported Accept header. Header needs to be set to application/json. </td><td>  -  </td></tr>
     </table>
   */
  public ReportInstanceLogList getReportGenerationLogs(String tenant, String reportInstanceId, String errorsOnly, java.util.List<String> sort, Integer paginationLimit, Integer paginationOffset) throws ApiException {
    return getReportGenerationLogsWithHttpInfo(tenant, reportInstanceId, errorsOnly, sort, paginationLimit, paginationOffset).getData();
  }

  /**
   * Gets a list of logs for the report instance generation
   * Gets a list of logs for the generated report instance. Allows the user to sort on log message, type and date. Also allows for retrieving of just the errors &amp; warnings&#39;
   * @param tenant The code of the tenancy (required)
   * @param reportInstanceId Used to validate that report file name belongs to the report instance passed (required)
   * @param errorsOnly If the parameter is set to true the endpoint should return just errors and warnings E.g: errorsOnly&#x3D;true (optional)
   * @param sort The column to sort on. Can add - to sort (optional)
   * @param paginationLimit Non-negative maximum number of entries to return (optional)
   * @param paginationOffset Non-negative number of entries to skip (optional)
   * @return ApiResponse&lt;ReportInstanceLogList&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorised </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> No permissions to view reports in VRS </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The supplied report instance ID could not be found </td><td>  -  </td></tr>
       <tr><td> 406 </td><td> Unsupported Accept header. Header needs to be set to application/json. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ReportInstanceLogList> getReportGenerationLogsWithHttpInfo(String tenant, String reportInstanceId, String errorsOnly, java.util.List<String> sort, Integer paginationLimit, Integer paginationOffset) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'tenant' is set
    if (tenant == null) {
      throw new ApiException(400, "Missing the required parameter 'tenant' when calling getReportGenerationLogs");
    }
    
    // verify the required parameter 'reportInstanceId' is set
    if (reportInstanceId == null) {
      throw new ApiException(400, "Missing the required parameter 'reportInstanceId' when calling getReportGenerationLogs");
    }
    
    // create path and map variables
    String localVarPath = "/v1/{tenant}/report-instances/{reportInstanceId}/logs"
      .replaceAll("\\{" + "tenant" + "\\}", apiClient.escapeString(tenant.toString()))
      .replaceAll("\\{" + "reportInstanceId" + "\\}", apiClient.escapeString(reportInstanceId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "errorsOnly", errorsOnly));
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
        
        ReportInstanceLogList
      
    > apiResponse = apiClient.invokeAPI("ReportInstanceApi.getReportGenerationLogs", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getReportGenerationLogsResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Gets a report instance based on the ID
   * Gets a report instance object based on the ID passed
   * @param reportInstanceId The ID of the report instance (required)
   * @param tenant The code of the tenancy (required)
   * @return ReportInstanceData
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  * Location - A callback URL to the updated group, for example https://example.com/VRSAPI/scim/v2/Groups/1 <br>  </td></tr>
       <tr><td> 400 </td><td> The supplied report instance id was either missing or invalid, or the report instance was not found </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorised </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> No permissions to view reports in VRS </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The supplied report instance ID could not be found </td><td>  -  </td></tr>
       <tr><td> 406 </td><td> Unsupported Accept header. Header needs to be set to application/json. </td><td>  -  </td></tr>
     </table>
   */
  public ReportInstanceData getReportInstanceById(String reportInstanceId, String tenant) throws ApiException {
    return getReportInstanceByIdWithHttpInfo(reportInstanceId, tenant).getData();
  }

  /**
   * Gets a report instance based on the ID
   * Gets a report instance object based on the ID passed
   * @param reportInstanceId The ID of the report instance (required)
   * @param tenant The code of the tenancy (required)
   * @return ApiResponse&lt;ReportInstanceData&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  * Location - A callback URL to the updated group, for example https://example.com/VRSAPI/scim/v2/Groups/1 <br>  </td></tr>
       <tr><td> 400 </td><td> The supplied report instance id was either missing or invalid, or the report instance was not found </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorised </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> No permissions to view reports in VRS </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The supplied report instance ID could not be found </td><td>  -  </td></tr>
       <tr><td> 406 </td><td> Unsupported Accept header. Header needs to be set to application/json. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ReportInstanceData> getReportInstanceByIdWithHttpInfo(String reportInstanceId, String tenant) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'reportInstanceId' is set
    if (reportInstanceId == null) {
      throw new ApiException(400, "Missing the required parameter 'reportInstanceId' when calling getReportInstanceById");
    }
    
    // verify the required parameter 'tenant' is set
    if (tenant == null) {
      throw new ApiException(400, "Missing the required parameter 'tenant' when calling getReportInstanceById");
    }
    
    // create path and map variables
    String localVarPath = "/v1/{tenant}/report-instances/{reportInstanceId}"
      .replaceAll("\\{" + "reportInstanceId" + "\\}", apiClient.escapeString(reportInstanceId.toString()))
      .replaceAll("\\{" + "tenant" + "\\}", apiClient.escapeString(tenant.toString()));

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
        
        ReportInstanceData
      
    > apiResponse = apiClient.invokeAPI("ReportInstanceApi.getReportInstanceById", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getReportInstanceByIdResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Generates a report
   * Generates a report using the specified ID and the JSON in the request body
   * @param reportGenerationRequestBody  (required)
   * @return ReportInstanceDataResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Report generation request succeeded and report generation is in progress </td><td>  * Location - A callback URL to the updated group, for example https://example.com/VRSAPI/scim/v2/Groups/1 <br>  </td></tr>
       <tr><td> 400 </td><td> The supplied report definition code was either missing or invalid, or the report definition was not found </td><td>  * Location - A callback URL to the updated group, for example https://example.com/VRSAPI/scim/v2/Groups/1 <br>  </td></tr>
       <tr><td> 401 </td><td> Unauthorised </td><td>  * Location - A callback URL to the updated group, for example https://example.com/VRSAPI/scim/v2/Groups/1 <br>  </td></tr>
       <tr><td> 403 </td><td> No permissions to view reports in VRS </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The report code could not be found </td><td>  -  </td></tr>
       <tr><td> 406 </td><td> Unsupported Accept header. Header needs to be set to application/json. </td><td>  -  </td></tr>
     </table>
   */
  public ReportInstanceDataResponse startReportGeneration(ReportGenerationRequestBody reportGenerationRequestBody) throws ApiException {
    return startReportGenerationWithHttpInfo(reportGenerationRequestBody).getData();
  }

  /**
   * Generates a report
   * Generates a report using the specified ID and the JSON in the request body
   * @param reportGenerationRequestBody  (required)
   * @return ApiResponse&lt;ReportInstanceDataResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Report generation request succeeded and report generation is in progress </td><td>  * Location - A callback URL to the updated group, for example https://example.com/VRSAPI/scim/v2/Groups/1 <br>  </td></tr>
       <tr><td> 400 </td><td> The supplied report definition code was either missing or invalid, or the report definition was not found </td><td>  * Location - A callback URL to the updated group, for example https://example.com/VRSAPI/scim/v2/Groups/1 <br>  </td></tr>
       <tr><td> 401 </td><td> Unauthorised </td><td>  * Location - A callback URL to the updated group, for example https://example.com/VRSAPI/scim/v2/Groups/1 <br>  </td></tr>
       <tr><td> 403 </td><td> No permissions to view reports in VRS </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The report code could not be found </td><td>  -  </td></tr>
       <tr><td> 406 </td><td> Unsupported Accept header. Header needs to be set to application/json. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ReportInstanceDataResponse> startReportGenerationWithHttpInfo(ReportGenerationRequestBody reportGenerationRequestBody) throws ApiException {
    Object localVarPostBody = reportGenerationRequestBody;
    
    // verify the required parameter 'reportGenerationRequestBody' is set
    if (reportGenerationRequestBody == null) {
      throw new ApiException(400, "Missing the required parameter 'reportGenerationRequestBody' when calling startReportGeneration");
    }
    
    // create path and map variables
    String localVarPath = "/v1/report-instances/generate";

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
        
        ReportInstanceDataResponse
      
    > apiResponse = apiClient.invokeAPI("ReportInstanceApi.startReportGeneration", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, startReportGenerationResponseTypeMap, false);

    return apiResponse;

  }
}
