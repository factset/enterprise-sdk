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
import com.factset.sdk.Vermilion.models.GenerateScheduleResponse;
import com.factset.sdk.Vermilion.models.ScheduleDefinitionsList;
import com.factset.sdk.Vermilion.models.ScheduleGenerationLogList;
import com.factset.sdk.Vermilion.models.ScheduleStatusUpdateResponse;
import com.factset.sdk.Vermilion.models.SchedulesList;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class WorkflowApi {
  private ApiClient apiClient;

  public WorkflowApi() {
    this(Configuration.getDefaultApiClient());
  }

  public WorkflowApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> generateScheduleResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    generateScheduleResponseTypeMap.put(202, new GenericType<GenerateScheduleResponse>(){});
    generateScheduleResponseTypeMap.put(400, new GenericType<ErrorList>(){});
    generateScheduleResponseTypeMap.put(401, new GenericType<ErrorList>(){});
    generateScheduleResponseTypeMap.put(403, new GenericType<ErrorList>(){});
    generateScheduleResponseTypeMap.put(404, new GenericType<ErrorList>(){});
    generateScheduleResponseTypeMap.put(406, new GenericType<ErrorList>(){});
  }

  private static final Map<Integer, GenericType> getScheduleDefinitionsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getScheduleDefinitionsResponseTypeMap.put(200, new GenericType<ScheduleDefinitionsList>(){});
    getScheduleDefinitionsResponseTypeMap.put(400, new GenericType<ErrorList>(){});
    getScheduleDefinitionsResponseTypeMap.put(401, new GenericType<ErrorList>(){});
    getScheduleDefinitionsResponseTypeMap.put(403, new GenericType<ErrorList>(){});
    getScheduleDefinitionsResponseTypeMap.put(406, new GenericType<ErrorList>(){});
  }

  private static final Map<Integer, GenericType> getScheduleGenerationLogsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getScheduleGenerationLogsResponseTypeMap.put(200, new GenericType<ScheduleGenerationLogList>(){});
    getScheduleGenerationLogsResponseTypeMap.put(400, new GenericType<ErrorList>(){});
    getScheduleGenerationLogsResponseTypeMap.put(401, new GenericType<ErrorList>(){});
    getScheduleGenerationLogsResponseTypeMap.put(403, new GenericType<ErrorList>(){});
    getScheduleGenerationLogsResponseTypeMap.put(406, new GenericType<ErrorList>(){});
  }

  private static final Map<Integer, GenericType> getSchedulesResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getSchedulesResponseTypeMap.put(200, new GenericType<SchedulesList>(){});
    getSchedulesResponseTypeMap.put(400, new GenericType<ErrorList>(){});
    getSchedulesResponseTypeMap.put(401, new GenericType<ErrorList>(){});
    getSchedulesResponseTypeMap.put(403, new GenericType<ErrorList>(){});
    getSchedulesResponseTypeMap.put(406, new GenericType<ErrorList>(){});
  }

  private static final Map<Integer, GenericType> updateScheduleStatusResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    updateScheduleStatusResponseTypeMap.put(200, new GenericType<ScheduleStatusUpdateResponse>(){});
    updateScheduleStatusResponseTypeMap.put(400, new GenericType<ErrorList>(){});
    updateScheduleStatusResponseTypeMap.put(401, new GenericType<ErrorList>(){});
    updateScheduleStatusResponseTypeMap.put(403, new GenericType<ErrorList>(){});
    updateScheduleStatusResponseTypeMap.put(404, new GenericType<ErrorList>(){});
    updateScheduleStatusResponseTypeMap.put(406, new GenericType<ErrorList>(){});
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
   * Creates schedule for the specified schedule definition
   * Creates schedule for the specified Schedule Definition code and sets to running based on the param in the JSON in the request body
   * @param tenant The code of the tenancy (required)
   * @param scheduleDefinitionCode The schedule definition code for which to generate the schedule (required)
   * @param setToRunning This parameter is used to set the generated schedule&#39;s status to Running.If parameter is set to true, the generated schedule will be set to Running. If no value is provided, the schedule will remain in Initialised status. (optional)
   * @return GenerateScheduleResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Schedule generation request succeeded and tasks have been generated </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> The supplied schedule definition code missing or invalid </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorised </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> No permissions to create schedule in VRS </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The schedule definition code could not be found </td><td>  -  </td></tr>
       <tr><td> 406 </td><td> Unsupported Accept header. Header needs to be set to application/json. </td><td>  -  </td></tr>
     </table>
   */
  public GenerateScheduleResponse generateSchedule(String tenant, String scheduleDefinitionCode, Boolean setToRunning) throws ApiException {
    return generateScheduleWithHttpInfo(tenant, scheduleDefinitionCode, setToRunning).getData();
  }

  /**
   * Creates schedule for the specified schedule definition
   * Creates schedule for the specified Schedule Definition code and sets to running based on the param in the JSON in the request body
   * @param tenant The code of the tenancy (required)
   * @param scheduleDefinitionCode The schedule definition code for which to generate the schedule (required)
   * @param setToRunning This parameter is used to set the generated schedule&#39;s status to Running.If parameter is set to true, the generated schedule will be set to Running. If no value is provided, the schedule will remain in Initialised status. (optional)
   * @return ApiResponse&lt;GenerateScheduleResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Schedule generation request succeeded and tasks have been generated </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> The supplied schedule definition code missing or invalid </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorised </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> No permissions to create schedule in VRS </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The schedule definition code could not be found </td><td>  -  </td></tr>
       <tr><td> 406 </td><td> Unsupported Accept header. Header needs to be set to application/json. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GenerateScheduleResponse> generateScheduleWithHttpInfo(String tenant, String scheduleDefinitionCode, Boolean setToRunning) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'tenant' is set
    if (tenant == null) {
      throw new ApiException(400, "Missing the required parameter 'tenant' when calling generateSchedule");
    }
    
    // verify the required parameter 'scheduleDefinitionCode' is set
    if (scheduleDefinitionCode == null) {
      throw new ApiException(400, "Missing the required parameter 'scheduleDefinitionCode' when calling generateSchedule");
    }
    
    // create path and map variables
    String localVarPath = "/v1/{tenant}/schedules/{scheduleDefinitionCode}"
      .replaceAll("\\{" + "tenant" + "\\}", apiClient.escapeString(tenant.toString()))
      .replaceAll("\\{" + "scheduleDefinitionCode" + "\\}", apiClient.escapeString(scheduleDefinitionCode.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "setToRunning", setToRunning));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        GenerateScheduleResponse
      
    > apiResponse = apiClient.invokeAPI("WorkflowApi.generateSchedule", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, generateScheduleResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Retrieves a list of all schedule definitions
   * Retrieves all schedule definitions the user has permissions for. User has sort and filter parameters available to use.
   * @param tenant The code of the tenancy (required)
   * @param scheduleType Acts as a filter for the retrieval process. Filters the schedule definitions that match the given schedule type. Accepts multiple values separated by a comma, e.g. ?scheduleType&#x3D;REPEATING,TEMPLATE (optional)
   * @param reportDate Acts as a filter for the retrieval process. Filters the schedule definitions that match the given schedule report date.  Accepts multiple values separated by a comma, e.g. ?reportDate&#x3D;LAST_DAY_OF_PREV_MONTH,CREATION_DATE (optional)
   * @param lastUpdatedBy Acts as a filter for the retrieval process. Filters the schedule definitions where the provided parameter value matches or is a substring of the last updated by value of the schedule definitions (optional)
   * @param startDate Acts as a filter for the retrieval process. Filters the schedule definitions based on their last updated date, the input date must be of the date format (d MMMMM yyyy 00:00:00). (optional)
   * @param endDate Acts as a filter for the retrieval process. Filters the schedule definitions based on their last updated date, the input date must be of the date format (d MMMMM yyyy 00:00:00). (optional)
   * @param sort The column to sort on. Can add &#39;-&#39; to the start of the parameter value to sort in descending order. (optional)
   * @param paginationLimit Non-negative maximum number of entries to return (optional, default to 25)
   * @param paginationOffset Non-negative number of entries to skip (optional, default to 0)
   * @return ScheduleDefinitionsList
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. Required values not provided in request parameter or invalid values given (e.g. tenant, scheduleType) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorised </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden. No permissions to view schedule definitions in VRS </td><td>  -  </td></tr>
       <tr><td> 406 </td><td> Unsupported Accept header. Header needs to be set to application/json. </td><td>  -  </td></tr>
     </table>
   */
  public ScheduleDefinitionsList getScheduleDefinitions(String tenant, String scheduleType, String reportDate, String lastUpdatedBy, String startDate, String endDate, java.util.List<String> sort, Integer paginationLimit, Integer paginationOffset) throws ApiException {
    return getScheduleDefinitionsWithHttpInfo(tenant, scheduleType, reportDate, lastUpdatedBy, startDate, endDate, sort, paginationLimit, paginationOffset).getData();
  }

  /**
   * Retrieves a list of all schedule definitions
   * Retrieves all schedule definitions the user has permissions for. User has sort and filter parameters available to use.
   * @param tenant The code of the tenancy (required)
   * @param scheduleType Acts as a filter for the retrieval process. Filters the schedule definitions that match the given schedule type. Accepts multiple values separated by a comma, e.g. ?scheduleType&#x3D;REPEATING,TEMPLATE (optional)
   * @param reportDate Acts as a filter for the retrieval process. Filters the schedule definitions that match the given schedule report date.  Accepts multiple values separated by a comma, e.g. ?reportDate&#x3D;LAST_DAY_OF_PREV_MONTH,CREATION_DATE (optional)
   * @param lastUpdatedBy Acts as a filter for the retrieval process. Filters the schedule definitions where the provided parameter value matches or is a substring of the last updated by value of the schedule definitions (optional)
   * @param startDate Acts as a filter for the retrieval process. Filters the schedule definitions based on their last updated date, the input date must be of the date format (d MMMMM yyyy 00:00:00). (optional)
   * @param endDate Acts as a filter for the retrieval process. Filters the schedule definitions based on their last updated date, the input date must be of the date format (d MMMMM yyyy 00:00:00). (optional)
   * @param sort The column to sort on. Can add &#39;-&#39; to the start of the parameter value to sort in descending order. (optional)
   * @param paginationLimit Non-negative maximum number of entries to return (optional, default to 25)
   * @param paginationOffset Non-negative number of entries to skip (optional, default to 0)
   * @return ApiResponse&lt;ScheduleDefinitionsList&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. Required values not provided in request parameter or invalid values given (e.g. tenant, scheduleType) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorised </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden. No permissions to view schedule definitions in VRS </td><td>  -  </td></tr>
       <tr><td> 406 </td><td> Unsupported Accept header. Header needs to be set to application/json. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ScheduleDefinitionsList> getScheduleDefinitionsWithHttpInfo(String tenant, String scheduleType, String reportDate, String lastUpdatedBy, String startDate, String endDate, java.util.List<String> sort, Integer paginationLimit, Integer paginationOffset) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'tenant' is set
    if (tenant == null) {
      throw new ApiException(400, "Missing the required parameter 'tenant' when calling getScheduleDefinitions");
    }
    
    // create path and map variables
    String localVarPath = "/v1/{tenant}/schedule-definitions"
      .replaceAll("\\{" + "tenant" + "\\}", apiClient.escapeString(tenant.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "scheduleType", scheduleType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "reportDate", reportDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "lastUpdatedBy", lastUpdatedBy));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startDate", startDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "endDate", endDate));
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
        
        ScheduleDefinitionsList
      
    > apiResponse = apiClient.invokeAPI("WorkflowApi.getScheduleDefinitions", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getScheduleDefinitionsResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Gets the generation logs for a specific schedule
   * Gets the generation logs for a specific schedule based on the Schedule ID. Allows the user to sort and filter logs.
   * @param tenant The code of the tenancy (required)
   * @param scheduleId The scheduleId for which the logs are requested (required)
   * @param type Acts as a filter for the retrieval process. Filters the log instances that match the input type (optional)
   * @param message Acts as a filter for the retrieval process. Filters the log instances that match the input message (optional)
   * @param logSet Acts as a filter for the retrieval process. Filters the log instances that match the input logset (optional)
   * @param startDate Acts as a filter for the retrieval process. Filters the log instances based on their last updated date, the input date must be of the date format (d MMMMM yyyy 00:00:00). (optional)
   * @param endDate Acts as a filter for the retrieval process. Filters the log instances based on their last updated date, the input date must be of the date format (d MMMMM yyyy 00:00:00). (optional)
   * @param sort The column to sort on. Can add - to sort (optional)
   * @param paginationLimit Non-negative maximum number of entries to return (optional, default to 25)
   * @param paginationOffset Non-negative number of entries to skip (optional, default to 0)
   * @return ScheduleGenerationLogList
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. Required values not provided in request parameter or invalid values given (e.g. tenant, type) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorised </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> No permissions to view schedule logs in VRS </td><td>  -  </td></tr>
       <tr><td> 406 </td><td> Unsupported Accept header. Header needs to be set to application/json. </td><td>  -  </td></tr>
     </table>
   */
  public ScheduleGenerationLogList getScheduleGenerationLogs(String tenant, String scheduleId, String type, String message, String logSet, String startDate, String endDate, java.util.List<String> sort, Integer paginationLimit, Integer paginationOffset) throws ApiException {
    return getScheduleGenerationLogsWithHttpInfo(tenant, scheduleId, type, message, logSet, startDate, endDate, sort, paginationLimit, paginationOffset).getData();
  }

  /**
   * Gets the generation logs for a specific schedule
   * Gets the generation logs for a specific schedule based on the Schedule ID. Allows the user to sort and filter logs.
   * @param tenant The code of the tenancy (required)
   * @param scheduleId The scheduleId for which the logs are requested (required)
   * @param type Acts as a filter for the retrieval process. Filters the log instances that match the input type (optional)
   * @param message Acts as a filter for the retrieval process. Filters the log instances that match the input message (optional)
   * @param logSet Acts as a filter for the retrieval process. Filters the log instances that match the input logset (optional)
   * @param startDate Acts as a filter for the retrieval process. Filters the log instances based on their last updated date, the input date must be of the date format (d MMMMM yyyy 00:00:00). (optional)
   * @param endDate Acts as a filter for the retrieval process. Filters the log instances based on their last updated date, the input date must be of the date format (d MMMMM yyyy 00:00:00). (optional)
   * @param sort The column to sort on. Can add - to sort (optional)
   * @param paginationLimit Non-negative maximum number of entries to return (optional, default to 25)
   * @param paginationOffset Non-negative number of entries to skip (optional, default to 0)
   * @return ApiResponse&lt;ScheduleGenerationLogList&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. Required values not provided in request parameter or invalid values given (e.g. tenant, type) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorised </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> No permissions to view schedule logs in VRS </td><td>  -  </td></tr>
       <tr><td> 406 </td><td> Unsupported Accept header. Header needs to be set to application/json. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ScheduleGenerationLogList> getScheduleGenerationLogsWithHttpInfo(String tenant, String scheduleId, String type, String message, String logSet, String startDate, String endDate, java.util.List<String> sort, Integer paginationLimit, Integer paginationOffset) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'tenant' is set
    if (tenant == null) {
      throw new ApiException(400, "Missing the required parameter 'tenant' when calling getScheduleGenerationLogs");
    }
    
    // verify the required parameter 'scheduleId' is set
    if (scheduleId == null) {
      throw new ApiException(400, "Missing the required parameter 'scheduleId' when calling getScheduleGenerationLogs");
    }
    
    // create path and map variables
    String localVarPath = "/v1/{tenant}/schedules/{scheduleId}/logs"
      .replaceAll("\\{" + "tenant" + "\\}", apiClient.escapeString(tenant.toString()))
      .replaceAll("\\{" + "scheduleId" + "\\}", apiClient.escapeString(scheduleId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "type", type));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "message", message));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "logSet", logSet));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startDate", startDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "endDate", endDate));
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
        
        ScheduleGenerationLogList
      
    > apiResponse = apiClient.invokeAPI("WorkflowApi.getScheduleGenerationLogs", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getScheduleGenerationLogsResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Retrieves a list of all schedules
   * Retrieves all schedules the user has permissions for. User has sort and filter parameters available to use.
   * @param tenant The code of the tenancy (required)
   * @param status Acts as a filter for the retrieval process. Filters the schedules that match the given status. Accepts multiple values separated by a comma, e.g. ?status&#x3D;INITIALISED,RUNNING (optional)
   * @param startDate Acts as a filter for the retrieval process. Filters the schedules based on their last updated date, the input date must be of the date format (d MMMMM yyyy 00:00:00). (optional)
   * @param endDate Acts as a filter for the retrieval process. Filters the schedules based on their last updated date, the input date must be of the date format (d MMMMM yyyy 00:00:00). (optional)
   * @param sort The column to sort on. Can add &#39;-&#39; to the start of the parameter value to sort in descending order. (optional)
   * @param paginationLimit Non-negative maximum number of entries to return (optional, default to 25)
   * @param paginationOffset Non-negative number of entries to skip (optional, default to 0)
   * @return SchedulesList
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. Required values not provided in request parameter or invalid values given (e.g. tenant, status) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorised </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden. No permissions to view schedule definitions in VRS </td><td>  -  </td></tr>
       <tr><td> 406 </td><td> Unsupported Accept header. Header needs to be set to application/json. </td><td>  -  </td></tr>
     </table>
   */
  public SchedulesList getSchedules(String tenant, String status, String startDate, String endDate, java.util.List<String> sort, Integer paginationLimit, Integer paginationOffset) throws ApiException {
    return getSchedulesWithHttpInfo(tenant, status, startDate, endDate, sort, paginationLimit, paginationOffset).getData();
  }

  /**
   * Retrieves a list of all schedules
   * Retrieves all schedules the user has permissions for. User has sort and filter parameters available to use.
   * @param tenant The code of the tenancy (required)
   * @param status Acts as a filter for the retrieval process. Filters the schedules that match the given status. Accepts multiple values separated by a comma, e.g. ?status&#x3D;INITIALISED,RUNNING (optional)
   * @param startDate Acts as a filter for the retrieval process. Filters the schedules based on their last updated date, the input date must be of the date format (d MMMMM yyyy 00:00:00). (optional)
   * @param endDate Acts as a filter for the retrieval process. Filters the schedules based on their last updated date, the input date must be of the date format (d MMMMM yyyy 00:00:00). (optional)
   * @param sort The column to sort on. Can add &#39;-&#39; to the start of the parameter value to sort in descending order. (optional)
   * @param paginationLimit Non-negative maximum number of entries to return (optional, default to 25)
   * @param paginationOffset Non-negative number of entries to skip (optional, default to 0)
   * @return ApiResponse&lt;SchedulesList&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. Required values not provided in request parameter or invalid values given (e.g. tenant, status) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorised </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden. No permissions to view schedule definitions in VRS </td><td>  -  </td></tr>
       <tr><td> 406 </td><td> Unsupported Accept header. Header needs to be set to application/json. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SchedulesList> getSchedulesWithHttpInfo(String tenant, String status, String startDate, String endDate, java.util.List<String> sort, Integer paginationLimit, Integer paginationOffset) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'tenant' is set
    if (tenant == null) {
      throw new ApiException(400, "Missing the required parameter 'tenant' when calling getSchedules");
    }
    
    // create path and map variables
    String localVarPath = "/v1/{tenant}/schedules"
      .replaceAll("\\{" + "tenant" + "\\}", apiClient.escapeString(tenant.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "status", status));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startDate", startDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "endDate", endDate));
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
        
        SchedulesList
      
    > apiResponse = apiClient.invokeAPI("WorkflowApi.getSchedules", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getSchedulesResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Update schedule status for specified schedule
   * Updated the schedule status for the specified schedule id based on the given status
   * @param tenant The code of the tenancy (required)
   * @param scheduleId The schedule id for which to update the status (required)
   * @param status The schedule status that needs to be updated only if the transition is valid (required)
   * @return ScheduleStatusUpdateResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Update schedule request succeeded and status has been changed </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Schedule status in the request is missing or invalid </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorised </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> No permissions to update schedule in VRS </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The schedule id could not be found </td><td>  -  </td></tr>
       <tr><td> 406 </td><td> Unsupported Accept header. Header needs to be set to application/json. </td><td>  -  </td></tr>
     </table>
   */
  public ScheduleStatusUpdateResponse updateScheduleStatus(String tenant, String scheduleId, String status) throws ApiException {
    return updateScheduleStatusWithHttpInfo(tenant, scheduleId, status).getData();
  }

  /**
   * Update schedule status for specified schedule
   * Updated the schedule status for the specified schedule id based on the given status
   * @param tenant The code of the tenancy (required)
   * @param scheduleId The schedule id for which to update the status (required)
   * @param status The schedule status that needs to be updated only if the transition is valid (required)
   * @return ApiResponse&lt;ScheduleStatusUpdateResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Update schedule request succeeded and status has been changed </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Schedule status in the request is missing or invalid </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorised </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> No permissions to update schedule in VRS </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The schedule id could not be found </td><td>  -  </td></tr>
       <tr><td> 406 </td><td> Unsupported Accept header. Header needs to be set to application/json. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ScheduleStatusUpdateResponse> updateScheduleStatusWithHttpInfo(String tenant, String scheduleId, String status) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'tenant' is set
    if (tenant == null) {
      throw new ApiException(400, "Missing the required parameter 'tenant' when calling updateScheduleStatus");
    }
    
    // verify the required parameter 'scheduleId' is set
    if (scheduleId == null) {
      throw new ApiException(400, "Missing the required parameter 'scheduleId' when calling updateScheduleStatus");
    }
    
    // verify the required parameter 'status' is set
    if (status == null) {
      throw new ApiException(400, "Missing the required parameter 'status' when calling updateScheduleStatus");
    }
    
    // create path and map variables
    String localVarPath = "/v1/{tenant}/schedules/{scheduleId}/{status}"
      .replaceAll("\\{" + "tenant" + "\\}", apiClient.escapeString(tenant.toString()))
      .replaceAll("\\{" + "scheduleId" + "\\}", apiClient.escapeString(scheduleId.toString()))
      .replaceAll("\\{" + "status" + "\\}", apiClient.escapeString(status.toString()));

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
        
        ScheduleStatusUpdateResponse
      
    > apiResponse = apiClient.invokeAPI("WorkflowApi.updateScheduleStatus", localVarPath, "PATCH", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, updateScheduleStatusResponseTypeMap, false);

    return apiResponse;

  }
}
