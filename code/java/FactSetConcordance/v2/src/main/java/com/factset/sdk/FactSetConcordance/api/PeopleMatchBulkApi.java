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

import com.factset.sdk.FactSetConcordance.models.ErrorResponse;
import java.io.File;
import com.factset.sdk.FactSetConcordance.models.PeopleDecisionsResponse;
import com.factset.sdk.FactSetConcordance.models.PeopleTaskResponse;
import com.factset.sdk.FactSetConcordance.models.PeopleTaskStatusResponse;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PeopleMatchBulkApi {
  private ApiClient apiClient;

  public PeopleMatchBulkApi() {
    this(Configuration.getDefaultApiClient());
  }

  public PeopleMatchBulkApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

    private static final Map<Integer, GenericType> getPeopleDecisionsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getPeopleDecisionsResponseTypeMap.put(200, new GenericType<PeopleDecisionsResponse>(){});
    getPeopleDecisionsResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getPeopleDecisionsResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getPeopleDecisionsResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getPeopleDecisionsResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getPeopleDecisionsResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }
  private static final Map<Integer, GenericType> getPeopleTaskForListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getPeopleTaskForListResponseTypeMap.put(200, new GenericType<PeopleTaskResponse>(){});
    getPeopleTaskForListResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getPeopleTaskForListResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getPeopleTaskForListResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getPeopleTaskForListResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getPeopleTaskForListResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }
  private static final Map<Integer, GenericType> getPeopleTaskStatusResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getPeopleTaskStatusResponseTypeMap.put(200, new GenericType<PeopleTaskStatusResponse>(){});
    getPeopleTaskStatusResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getPeopleTaskStatusResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getPeopleTaskStatusResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getPeopleTaskStatusResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getPeopleTaskStatusResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
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
   * Get the decisions of matches for the requested taskId.
   * Retrieves the &#x60;Decision&#x60; objects for an People Task (taskId). The decisions do not include all candidates, but rather the results of concording the requested list of names included in the input file. Mapped entities will include a FactSet Entity Identifier (-E). Results will be saved to the &#x60;universeId&#x60; specified in the input file. 
   * @param taskId Concordance Task Identifier. The taskId is created in response from the /people-task endpoint. (required)
   * @param offset Starting row for records to return or rows to skip. (optional, default to 0)
   * @param limit Limits the number of records in the response. (optional)
   * @return PeopleDecisionsResponse
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
  public PeopleDecisionsResponse getPeopleDecisions(Integer taskId, Integer offset, Integer limit) throws ApiException {
    return getPeopleDecisionsWithHttpInfo(taskId, offset, limit).getData();
  }

  /**
   * Get the decisions of matches for the requested taskId.
   * Retrieves the &#x60;Decision&#x60; objects for an People Task (taskId). The decisions do not include all candidates, but rather the results of concording the requested list of names included in the input file. Mapped entities will include a FactSet Entity Identifier (-E). Results will be saved to the &#x60;universeId&#x60; specified in the input file. 
   * @param taskId Concordance Task Identifier. The taskId is created in response from the /people-task endpoint. (required)
   * @param offset Starting row for records to return or rows to skip. (optional, default to 0)
   * @param limit Limits the number of records in the response. (optional)
   * @return ApiResponse&lt;PeopleDecisionsResponse&gt;
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
  public ApiResponse<PeopleDecisionsResponse> getPeopleDecisionsWithHttpInfo(Integer taskId, Integer offset, Integer limit) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'taskId' is set
    if (taskId == null) {
      throw new ApiException(400, "Missing the required parameter 'taskId' when calling getPeopleDecisions");
    }
    
    // create path and map variables
    String localVarPath = "/factset-concordance/v2/people-decisions";

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
        
        PeopleDecisionsResponse
      
    > apiResponse = apiClient.invokeAPI("PeopleMatchBulkApi.getPeopleDecisions", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getPeopleDecisionsResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Create a People Concordance Task.
   * The \&quot;Bulk\&quot; workflow allows the user to create a People Concordance Task. Uploading of a Comma-Separated List file (.csv / UTF-8 encoding) with a list of names and attributes and creation of a task id is mandatory to start the process.    The taskId is then used for reference in the /people-task-status and /people-decisions endpoints to receive results once the task is successful.The /people-task-status endpoint is to check the status of the Tasks as per the ids.     A universeId must be included in request. If you do not have a universe created, reference the /universe endpoint.The bulk workflow supports a two way approach for the user.   **The user can use these parameters in the following ways.**     1.Filling all the required fields including the &#x60;personNameColumn&#x60;.(do not include &#x60;firstNameColumn&#x60;,&#x60;lastNameColumn&#x60; &amp; &#x60;middleNameColumn&#x60;)     2.Filling all the required fields excluding the &#x60;personNameColumn&#x60;.(Ensure atleast the &#x60;lastNameColumn&#x60; is filled) 
   * @param universeId The id of the universe that entities should be mapped to. Reference the &#x60;/universe&#x60; endpoint to create a universe, or view available universes via &#x60;/universes&#x60;. (required)
   * @param taskName User defined name for the task that will be used to name the output files. (required)
   * @param inputFile The UTF-8 encoded CSV File containing the entity names to be concorded to a FactSet Entity Identifier. The files first row **MUST** include headers as defined in the *Column parameters. Be mindful of casing and spacing in column headers. The input file is posted as a file object in the form. For this reason, the mime type of this post request must be multipart/form-data.  (required)
   * @param clientIdColumn Header Name of the column in the input file that contains a unique identifier supplied by the user referred to as a \\\&quot;clientId\\\&quot;. This clientId can be used to create custom mappings or references.  (required)
   * @param entityColumn Header name of the column in the input file that contains the Entity Name to be matched.  (required)
   * @param firstNameColumn First name of the person.**Do not include with &#x60;personNameColumn&#x60;**.   (optional)
   * @param lastNameColumn Lat name of the person.**Do not include with &#x60;personNameColumn&#x60;**.  (optional)
   * @param middleNameColumn Middle name of the person.**Do not include within &#x60;personNameColumn&#x60;**.  (optional)
   * @param personNameColumn Header name of the column in the input file that contains the name of the person to be matched. **Do not include with &#x60;firstNameColumn&#x60; and &#x60;lastNameColumn&#x60;.**  (optional)
   * @param priorityColumn Priority associated to the clientId. Used for manual mapping.  (optional)
   * @param salutationColumn The salutation of the person.**Do not include with &#x60;personNameColumn&#x60;**.  (optional)
   * @param suffixColumn A name suffix, that follows a person&#39;s full name and provides additional information about the person.**Do not include with &#x60;personNameColumn&#x60;**.  (optional)
   * @return PeopleTaskResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK. The People Task creation is submitted. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public PeopleTaskResponse getPeopleTaskForList(Integer universeId, String taskName, File inputFile, String clientIdColumn, String entityColumn, String firstNameColumn, String lastNameColumn, String middleNameColumn, String personNameColumn, String priorityColumn, String salutationColumn, String suffixColumn) throws ApiException {
    return getPeopleTaskForListWithHttpInfo(universeId, taskName, inputFile, clientIdColumn, entityColumn, firstNameColumn, lastNameColumn, middleNameColumn, personNameColumn, priorityColumn, salutationColumn, suffixColumn).getData();
  }

  /**
   * Create a People Concordance Task.
   * The \&quot;Bulk\&quot; workflow allows the user to create a People Concordance Task. Uploading of a Comma-Separated List file (.csv / UTF-8 encoding) with a list of names and attributes and creation of a task id is mandatory to start the process.    The taskId is then used for reference in the /people-task-status and /people-decisions endpoints to receive results once the task is successful.The /people-task-status endpoint is to check the status of the Tasks as per the ids.     A universeId must be included in request. If you do not have a universe created, reference the /universe endpoint.The bulk workflow supports a two way approach for the user.   **The user can use these parameters in the following ways.**     1.Filling all the required fields including the &#x60;personNameColumn&#x60;.(do not include &#x60;firstNameColumn&#x60;,&#x60;lastNameColumn&#x60; &amp; &#x60;middleNameColumn&#x60;)     2.Filling all the required fields excluding the &#x60;personNameColumn&#x60;.(Ensure atleast the &#x60;lastNameColumn&#x60; is filled) 
   * @param universeId The id of the universe that entities should be mapped to. Reference the &#x60;/universe&#x60; endpoint to create a universe, or view available universes via &#x60;/universes&#x60;. (required)
   * @param taskName User defined name for the task that will be used to name the output files. (required)
   * @param inputFile The UTF-8 encoded CSV File containing the entity names to be concorded to a FactSet Entity Identifier. The files first row **MUST** include headers as defined in the *Column parameters. Be mindful of casing and spacing in column headers. The input file is posted as a file object in the form. For this reason, the mime type of this post request must be multipart/form-data.  (required)
   * @param clientIdColumn Header Name of the column in the input file that contains a unique identifier supplied by the user referred to as a \\\&quot;clientId\\\&quot;. This clientId can be used to create custom mappings or references.  (required)
   * @param entityColumn Header name of the column in the input file that contains the Entity Name to be matched.  (required)
   * @param firstNameColumn First name of the person.**Do not include with &#x60;personNameColumn&#x60;**.   (optional)
   * @param lastNameColumn Lat name of the person.**Do not include with &#x60;personNameColumn&#x60;**.  (optional)
   * @param middleNameColumn Middle name of the person.**Do not include within &#x60;personNameColumn&#x60;**.  (optional)
   * @param personNameColumn Header name of the column in the input file that contains the name of the person to be matched. **Do not include with &#x60;firstNameColumn&#x60; and &#x60;lastNameColumn&#x60;.**  (optional)
   * @param priorityColumn Priority associated to the clientId. Used for manual mapping.  (optional)
   * @param salutationColumn The salutation of the person.**Do not include with &#x60;personNameColumn&#x60;**.  (optional)
   * @param suffixColumn A name suffix, that follows a person&#39;s full name and provides additional information about the person.**Do not include with &#x60;personNameColumn&#x60;**.  (optional)
   * @return ApiResponse&lt;PeopleTaskResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK. The People Task creation is submitted. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<PeopleTaskResponse> getPeopleTaskForListWithHttpInfo(Integer universeId, String taskName, File inputFile, String clientIdColumn, String entityColumn, String firstNameColumn, String lastNameColumn, String middleNameColumn, String personNameColumn, String priorityColumn, String salutationColumn, String suffixColumn) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'universeId' is set
    if (universeId == null) {
      throw new ApiException(400, "Missing the required parameter 'universeId' when calling getPeopleTaskForList");
    }
    
    // verify the required parameter 'taskName' is set
    if (taskName == null) {
      throw new ApiException(400, "Missing the required parameter 'taskName' when calling getPeopleTaskForList");
    }
    
    // verify the required parameter 'inputFile' is set
    if (inputFile == null) {
      throw new ApiException(400, "Missing the required parameter 'inputFile' when calling getPeopleTaskForList");
    }
    
    // verify the required parameter 'clientIdColumn' is set
    if (clientIdColumn == null) {
      throw new ApiException(400, "Missing the required parameter 'clientIdColumn' when calling getPeopleTaskForList");
    }
    
    // verify the required parameter 'entityColumn' is set
    if (entityColumn == null) {
      throw new ApiException(400, "Missing the required parameter 'entityColumn' when calling getPeopleTaskForList");
    }
    
    // create path and map variables
    String localVarPath = "/factset-concordance/v2/people-task";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();


    
    
    if (universeId != null)
      localVarFormParams.put("universeId", universeId);
if (taskName != null)
      localVarFormParams.put("taskName", taskName);
if (inputFile != null)
      localVarFormParams.put("inputFile", inputFile);
if (clientIdColumn != null)
      localVarFormParams.put("clientIdColumn", clientIdColumn);
if (entityColumn != null)
      localVarFormParams.put("entityColumn", entityColumn);
if (firstNameColumn != null)
      localVarFormParams.put("firstNameColumn", firstNameColumn);
if (lastNameColumn != null)
      localVarFormParams.put("lastNameColumn", lastNameColumn);
if (middleNameColumn != null)
      localVarFormParams.put("middleNameColumn", middleNameColumn);
if (personNameColumn != null)
      localVarFormParams.put("personNameColumn", personNameColumn);
if (priorityColumn != null)
      localVarFormParams.put("priorityColumn", priorityColumn);
if (salutationColumn != null)
      localVarFormParams.put("salutationColumn", salutationColumn);
if (suffixColumn != null)
      localVarFormParams.put("suffixColumn", suffixColumn);

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
        
        PeopleTaskResponse
      
    > apiResponse = apiClient.invokeAPI("PeopleMatchBulkApi.getPeopleTaskForList", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getPeopleTaskForListResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Get the Status of the People Tasks.
   * Pulls the **status** for ALL the People Tasks submitted by a client within the last 30 days, and related details such as task duration and decision rates. Specific Tasks can also be retrieved by using the _taskId_ parameter.&lt;p&gt;Status types include -   * PENDING - The task has not yet started.   * IN_PROGRESS - The task is submitted and decisions are in progress.   * SUCCESS - The task was successful! Move to the /people-decisions endpoint to retrieve decisions.   * FAILURE - The task failed. Reach out to FactSet Support for assistance.   * BAD_REQUEST - The task creation was unsuccesfull. Typically occurs with an incorrect input file format or column headers.   * ABORTED - The task was aborted. 
   * @param taskId Concordance Task Identifier. The taskId is created in response from the /people-task endpoint. (optional)
   * @param offset Starting row for records to return or rows to skip. (optional, default to 0)
   * @param limit Limits the number of records in the response. (optional)
   * @param status Filter on the status of the Concordance Tasks. Default is no filter.   * PENDING - The task has not yet started   * IN_PROGRESS - The task is submitted and decisions are in progress.   * SUCCESS - The task was successful! Move to the /entity-decisions endpoint to retrieve decisions.   * FAILURE - The task failed. Reach out to FactSet Support for assistance.   * BAD_REQUEST - The task creation was unsuccesfull. Typically occurs with an incorrect input file format or column headers.   * ABORTED - The task was aborted.  (optional)
   * @return PeopleTaskStatusResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Response object for People Task Status endpoint. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public PeopleTaskStatusResponse getPeopleTaskStatus(Integer taskId, Integer offset, Integer limit, java.util.List<String> status) throws ApiException {
    return getPeopleTaskStatusWithHttpInfo(taskId, offset, limit, status).getData();
  }

  /**
   * Get the Status of the People Tasks.
   * Pulls the **status** for ALL the People Tasks submitted by a client within the last 30 days, and related details such as task duration and decision rates. Specific Tasks can also be retrieved by using the _taskId_ parameter.&lt;p&gt;Status types include -   * PENDING - The task has not yet started.   * IN_PROGRESS - The task is submitted and decisions are in progress.   * SUCCESS - The task was successful! Move to the /people-decisions endpoint to retrieve decisions.   * FAILURE - The task failed. Reach out to FactSet Support for assistance.   * BAD_REQUEST - The task creation was unsuccesfull. Typically occurs with an incorrect input file format or column headers.   * ABORTED - The task was aborted. 
   * @param taskId Concordance Task Identifier. The taskId is created in response from the /people-task endpoint. (optional)
   * @param offset Starting row for records to return or rows to skip. (optional, default to 0)
   * @param limit Limits the number of records in the response. (optional)
   * @param status Filter on the status of the Concordance Tasks. Default is no filter.   * PENDING - The task has not yet started   * IN_PROGRESS - The task is submitted and decisions are in progress.   * SUCCESS - The task was successful! Move to the /entity-decisions endpoint to retrieve decisions.   * FAILURE - The task failed. Reach out to FactSet Support for assistance.   * BAD_REQUEST - The task creation was unsuccesfull. Typically occurs with an incorrect input file format or column headers.   * ABORTED - The task was aborted.  (optional)
   * @return ApiResponse&lt;PeopleTaskStatusResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Response object for People Task Status endpoint. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<PeopleTaskStatusResponse> getPeopleTaskStatusWithHttpInfo(Integer taskId, Integer offset, Integer limit, java.util.List<String> status) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/factset-concordance/v2/people-task-status";

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
        
        PeopleTaskStatusResponse
      
    > apiResponse = apiClient.invokeAPI("PeopleMatchBulkApi.getPeopleTaskStatus", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getPeopleTaskStatusResponseTypeMap, false);

    return apiResponse;

  }
}
