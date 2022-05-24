package com.factset.sdk.FactSetConcordance.api;

import com.factset.sdk.FactSetConcordance.ApiException;
import com.factset.sdk.FactSetConcordance.ApiClient;
import com.factset.sdk.FactSetConcordance.ApiResponse;
import com.factset.sdk.FactSetConcordance.Configuration;
import com.factset.sdk.FactSetConcordance.Pair;

import javax.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.FactSetConcordance.models.EntityDecisionsResponse;
import com.factset.sdk.FactSetConcordance.models.EntityTaskResponse;
import com.factset.sdk.FactSetConcordance.models.EntityTaskStatusResponse;
import com.factset.sdk.FactSetConcordance.models.ErrorResponse;
import java.io.File;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class EntityMatchBulkApi {
  private ApiClient apiClient;

  public EntityMatchBulkApi() {
    this(Configuration.getDefaultApiClient());
  }

  public EntityMatchBulkApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

    private static final Map<Integer, GenericType> createEntityTaskResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    createEntityTaskResponseTypeMap.put(200, new GenericType<EntityTaskResponse>(){});
    createEntityTaskResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    createEntityTaskResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    createEntityTaskResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    createEntityTaskResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    createEntityTaskResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }
  private static final Map<Integer, GenericType> getEntityDecisionsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getEntityDecisionsResponseTypeMap.put(200, new GenericType<EntityDecisionsResponse>(){});
    getEntityDecisionsResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getEntityDecisionsResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getEntityDecisionsResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getEntityDecisionsResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getEntityDecisionsResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }
  private static final Map<Integer, GenericType> getEntityTaskStatusResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getEntityTaskStatusResponseTypeMap.put(200, new GenericType<EntityTaskStatusResponse>(){});
    getEntityTaskStatusResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getEntityTaskStatusResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getEntityTaskStatusResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getEntityTaskStatusResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getEntityTaskStatusResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
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
   * Input a file with names and attributes, creating a taskId.
   * Upload a Comma-Separated List file (.csv / UTF-8 encoding) with a list of names and attributes and receive a &#x60;taskId&#x60;. The taskId is then used for reference in the *_/entity-task-status* and *_/entity-decisions* endpoints to receive results once the task is successful. &lt;p&gt; **Number of ids is limited to 10,000 ids per upload file.** &lt;/p&gt;&lt;p&gt;This is the first step in the overall \&quot;Bulk\&quot; workflow. Use the /entity-task-status endpoint to check the status.&lt;/p&gt; 
   * @param taskName User defined name for the task that will be used to name the output files. (required)
   * @param inputFile The UTF-8 encoded CSV File containing the entity names to be concorded to a FactSet Entity Identifier. The files first row **MUST** include headers as defined in the *Column parameters. Be mindful of casing and spacing in column headers. Only 10,001 rows are accepted, including the Header row. The input file is posted as a file object in the form. For this reason, the mime type of this post request must be multipart/form-data.  (required)
   * @param clientIdColumn Header Name of the column in the input file that contains a unique identifier supplied by the user referred to as a \\\&quot;clientId\\\&quot;. This clientId can be used to create custom mappings or references.  (required)
   * @param nameColumn Header name of the column in the input file that contains the Entity Name to be matched.  (required)
   * @param countryColumn Header Name of the column in the input file that contains the country&#39;s ISO Code. This is used to filter the candidates before taking a match decision.  (optional)
   * @param urlColumn Header Name of the column in the input file that contains the Entity&#39;s URL. URL corresponding to the entity name that is used when evaluating candidates for a match.  (optional)
   * @param stateColumn Header Name of the column in the input file that contains the two letter State Code of the state or province where the Entity is located. Currently, only US state codes are supported.  (optional)
   * @param includeEntityType Three-character FactSet entity type code used to filter candidates in order to determine the final match result. Only candidates with an entity type specified will be considered for the final match result. Multiple types can be entered separated by commas. **Do not include within &#x60;inputFile&#x60;.**  (optional)
   * @param excludeEntityType Three-character FactSet entity type code used to filter candidates in order to determine the final match result. Entities with these types will be excluded from the decisions. It is a global option used to filter the candidates before taking a match decision. Candidates with an entity type specified will *not* be considered for the final match result. **Do not include within &#x60;inputFile&#x60;.**  (optional)
   * @param includeEntitySubType Two-character FactSet entity subtype code used to filter candidates in order to determine the final match result. Only candidates with an entity subtype specified will be considered for the final match result. Multiple types can be entered separated by commas. **Do not include within &#x60;inputFile&#x60;.**  (optional)
   * @param excludeEntitySubType Two-character FactSet entity subtype code used to filter candidates in order to determine the final match result. Candidates with an entity subtype specified will *not* be considered for the final match result. Multiple types can be entered separated by commas. **Do not include within &#x60;inputFile&#x60;.**  (optional)
   * @return EntityTaskResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK. The Entity Task creation is submitted. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public EntityTaskResponse createEntityTask(String taskName, File inputFile, String clientIdColumn, String nameColumn, String countryColumn, String urlColumn, String stateColumn, java.util.List<String> includeEntityType, java.util.List<String> excludeEntityType, java.util.List<String> includeEntitySubType, java.util.List<String> excludeEntitySubType) throws ApiException {
    return createEntityTaskWithHttpInfo(taskName, inputFile, clientIdColumn, nameColumn, countryColumn, urlColumn, stateColumn, includeEntityType, excludeEntityType, includeEntitySubType, excludeEntitySubType).getData();
  }

  /**
   * Input a file with names and attributes, creating a taskId.
   * Upload a Comma-Separated List file (.csv / UTF-8 encoding) with a list of names and attributes and receive a &#x60;taskId&#x60;. The taskId is then used for reference in the *_/entity-task-status* and *_/entity-decisions* endpoints to receive results once the task is successful. &lt;p&gt; **Number of ids is limited to 10,000 ids per upload file.** &lt;/p&gt;&lt;p&gt;This is the first step in the overall \&quot;Bulk\&quot; workflow. Use the /entity-task-status endpoint to check the status.&lt;/p&gt; 
   * @param taskName User defined name for the task that will be used to name the output files. (required)
   * @param inputFile The UTF-8 encoded CSV File containing the entity names to be concorded to a FactSet Entity Identifier. The files first row **MUST** include headers as defined in the *Column parameters. Be mindful of casing and spacing in column headers. Only 10,001 rows are accepted, including the Header row. The input file is posted as a file object in the form. For this reason, the mime type of this post request must be multipart/form-data.  (required)
   * @param clientIdColumn Header Name of the column in the input file that contains a unique identifier supplied by the user referred to as a \\\&quot;clientId\\\&quot;. This clientId can be used to create custom mappings or references.  (required)
   * @param nameColumn Header name of the column in the input file that contains the Entity Name to be matched.  (required)
   * @param countryColumn Header Name of the column in the input file that contains the country&#39;s ISO Code. This is used to filter the candidates before taking a match decision.  (optional)
   * @param urlColumn Header Name of the column in the input file that contains the Entity&#39;s URL. URL corresponding to the entity name that is used when evaluating candidates for a match.  (optional)
   * @param stateColumn Header Name of the column in the input file that contains the two letter State Code of the state or province where the Entity is located. Currently, only US state codes are supported.  (optional)
   * @param includeEntityType Three-character FactSet entity type code used to filter candidates in order to determine the final match result. Only candidates with an entity type specified will be considered for the final match result. Multiple types can be entered separated by commas. **Do not include within &#x60;inputFile&#x60;.**  (optional)
   * @param excludeEntityType Three-character FactSet entity type code used to filter candidates in order to determine the final match result. Entities with these types will be excluded from the decisions. It is a global option used to filter the candidates before taking a match decision. Candidates with an entity type specified will *not* be considered for the final match result. **Do not include within &#x60;inputFile&#x60;.**  (optional)
   * @param includeEntitySubType Two-character FactSet entity subtype code used to filter candidates in order to determine the final match result. Only candidates with an entity subtype specified will be considered for the final match result. Multiple types can be entered separated by commas. **Do not include within &#x60;inputFile&#x60;.**  (optional)
   * @param excludeEntitySubType Two-character FactSet entity subtype code used to filter candidates in order to determine the final match result. Candidates with an entity subtype specified will *not* be considered for the final match result. Multiple types can be entered separated by commas. **Do not include within &#x60;inputFile&#x60;.**  (optional)
   * @return ApiResponse&lt;EntityTaskResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK. The Entity Task creation is submitted. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<EntityTaskResponse> createEntityTaskWithHttpInfo(String taskName, File inputFile, String clientIdColumn, String nameColumn, String countryColumn, String urlColumn, String stateColumn, java.util.List<String> includeEntityType, java.util.List<String> excludeEntityType, java.util.List<String> includeEntitySubType, java.util.List<String> excludeEntitySubType) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'taskName' is set
    if (taskName == null) {
      throw new ApiException(400, "Missing the required parameter 'taskName' when calling createEntityTask");
    }
    
    // verify the required parameter 'inputFile' is set
    if (inputFile == null) {
      throw new ApiException(400, "Missing the required parameter 'inputFile' when calling createEntityTask");
    }
    
    // verify the required parameter 'clientIdColumn' is set
    if (clientIdColumn == null) {
      throw new ApiException(400, "Missing the required parameter 'clientIdColumn' when calling createEntityTask");
    }
    
    // verify the required parameter 'nameColumn' is set
    if (nameColumn == null) {
      throw new ApiException(400, "Missing the required parameter 'nameColumn' when calling createEntityTask");
    }
    
    // create path and map variables
    String localVarPath = "/factset-concordance/v1/entity-task";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();


    
    
    if (taskName != null)
      localVarFormParams.put("taskName", taskName);
if (inputFile != null)
      localVarFormParams.put("inputFile", inputFile);
if (clientIdColumn != null)
      localVarFormParams.put("clientIdColumn", clientIdColumn);
if (nameColumn != null)
      localVarFormParams.put("nameColumn", nameColumn);
if (countryColumn != null)
      localVarFormParams.put("countryColumn", countryColumn);
if (urlColumn != null)
      localVarFormParams.put("urlColumn", urlColumn);
if (stateColumn != null)
      localVarFormParams.put("stateColumn", stateColumn);
if (includeEntityType != null)
      localVarFormParams.put("includeEntityType", includeEntityType);
if (excludeEntityType != null)
      localVarFormParams.put("excludeEntityType", excludeEntityType);
if (includeEntitySubType != null)
      localVarFormParams.put("includeEntitySubType", includeEntitySubType);
if (excludeEntitySubType != null)
      localVarFormParams.put("excludeEntitySubType", excludeEntitySubType);

    final String[] localVarAccepts = {
      "application/json;charset=utf-8", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "multipart/form-data"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        EntityTaskResponse
      
    > apiResponse = apiClient.invokeAPI("EntityMatchBulkApi.createEntityTask", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, createEntityTaskResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Get the decisions of matches for the requested taskId.
   * Retrieves the &#x60;Decision&#x60; objects for an Entity Task (taskId). The decisions do not include all candidates, but rather the status of concording the requested list of names included in the input file. Mapped entities will include a FactSet Entity Identifier (-E). 
   * @param taskId Concordance Task Identifier. The taskId is created in response from the /entity-task endpoint. (required)
   * @param offset Starting row for records to return or rows to skip. (optional, default to 0)
   * @param limit Limits the number of records in the response. (optional)
   * @return EntityDecisionsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Response object for Entity Decisions endpoint. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public EntityDecisionsResponse getEntityDecisions(Integer taskId, Integer offset, Integer limit) throws ApiException {
    return getEntityDecisionsWithHttpInfo(taskId, offset, limit).getData();
  }

  /**
   * Get the decisions of matches for the requested taskId.
   * Retrieves the &#x60;Decision&#x60; objects for an Entity Task (taskId). The decisions do not include all candidates, but rather the status of concording the requested list of names included in the input file. Mapped entities will include a FactSet Entity Identifier (-E). 
   * @param taskId Concordance Task Identifier. The taskId is created in response from the /entity-task endpoint. (required)
   * @param offset Starting row for records to return or rows to skip. (optional, default to 0)
   * @param limit Limits the number of records in the response. (optional)
   * @return ApiResponse&lt;EntityDecisionsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Response object for Entity Decisions endpoint. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<EntityDecisionsResponse> getEntityDecisionsWithHttpInfo(Integer taskId, Integer offset, Integer limit) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'taskId' is set
    if (taskId == null) {
      throw new ApiException(400, "Missing the required parameter 'taskId' when calling getEntityDecisions");
    }
    
    // create path and map variables
    String localVarPath = "/factset-concordance/v1/entity-decisions";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "taskId", taskId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));

    
    
    
    final String[] localVarAccepts = {
      "application/json;charset=utf-8", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        EntityDecisionsResponse
      
    > apiResponse = apiClient.invokeAPI("EntityMatchBulkApi.getEntityDecisions", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getEntityDecisionsResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Gets the status of the requested taskId or all tasks for a User
   * Pulls the **status** for ALL the Entity Tasks submitted by a client within the last 30 days, and related details such as task duration and decision rates. Specific Tasks can also be retrieved by using the _taskId_ parameter.&lt;p&gt;Status types include -   * PENDING - The task has not yet started.   * IN_PROGRESS - The task is submitted and decisions are in progress.   * SUCCESS - The task was successful! Move to the /entity-decisions endpoint to retrieve decisions.   * FAILURE - The task failed. Reach out to FactSet Support for assistance.   * BAD_REQUEST - The task creation was unsuccesfull. Typically occurs with an incorrect input file format or column headers.   * ABORTED - The task was aborted. 
   * @param taskId Concordance Task Identifier. The taskId is created in response from the /entity-task endpoint. (optional)
   * @param offset Starting row for records to return or rows to skip. (optional, default to 0)
   * @param limit Limits the number of records in the response. (optional)
   * @param status Filter on the status of the Concordance Tasks. Default is no filter.   * PENDING - The task has not yet started   * IN_PROGRESS - The task is submitted and decisions are in progress.   * SUCCESS - The task was successful! Move to the /entity-decisions endpoint to retrieve decisions.   * FAILURE - The task failed. Reach out to FactSet Support for assistance.   * BAD_REQUEST - The task creation was unsuccesfull. Typically occurs with an incorrect input file format or column headers.   * ABORTED - The task was aborted.  (optional)
   * @return EntityTaskStatusResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Response object for Task Status endpoint. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public EntityTaskStatusResponse getEntityTaskStatus(Integer taskId, Integer offset, Integer limit, java.util.List<String> status) throws ApiException {
    return getEntityTaskStatusWithHttpInfo(taskId, offset, limit, status).getData();
  }

  /**
   * Gets the status of the requested taskId or all tasks for a User
   * Pulls the **status** for ALL the Entity Tasks submitted by a client within the last 30 days, and related details such as task duration and decision rates. Specific Tasks can also be retrieved by using the _taskId_ parameter.&lt;p&gt;Status types include -   * PENDING - The task has not yet started.   * IN_PROGRESS - The task is submitted and decisions are in progress.   * SUCCESS - The task was successful! Move to the /entity-decisions endpoint to retrieve decisions.   * FAILURE - The task failed. Reach out to FactSet Support for assistance.   * BAD_REQUEST - The task creation was unsuccesfull. Typically occurs with an incorrect input file format or column headers.   * ABORTED - The task was aborted. 
   * @param taskId Concordance Task Identifier. The taskId is created in response from the /entity-task endpoint. (optional)
   * @param offset Starting row for records to return or rows to skip. (optional, default to 0)
   * @param limit Limits the number of records in the response. (optional)
   * @param status Filter on the status of the Concordance Tasks. Default is no filter.   * PENDING - The task has not yet started   * IN_PROGRESS - The task is submitted and decisions are in progress.   * SUCCESS - The task was successful! Move to the /entity-decisions endpoint to retrieve decisions.   * FAILURE - The task failed. Reach out to FactSet Support for assistance.   * BAD_REQUEST - The task creation was unsuccesfull. Typically occurs with an incorrect input file format or column headers.   * ABORTED - The task was aborted.  (optional)
   * @return ApiResponse&lt;EntityTaskStatusResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Response object for Task Status endpoint. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<EntityTaskStatusResponse> getEntityTaskStatusWithHttpInfo(Integer taskId, Integer offset, Integer limit, java.util.List<String> status) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/factset-concordance/v1/entity-task-status";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "taskId", taskId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "status", status));

    
    
    
    final String[] localVarAccepts = {
      "application/json;charset=utf-8", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        EntityTaskStatusResponse
      
    > apiResponse = apiClient.invokeAPI("EntityMatchBulkApi.getEntityTaskStatus", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getEntityTaskStatusResponseTypeMap, false);

    return apiResponse;

  }
}
