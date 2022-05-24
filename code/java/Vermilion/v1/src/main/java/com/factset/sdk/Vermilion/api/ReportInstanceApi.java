package com.factset.sdk.Vermilion.api;

import com.factset.sdk.Vermilion.ApiException;
import com.factset.sdk.Vermilion.ApiClient;
import com.factset.sdk.Vermilion.ApiResponse;
import com.factset.sdk.Vermilion.Configuration;
import com.factset.sdk.Vermilion.Pair;

import javax.ws.rs.core.GenericType;

import com.factset.sdk.Vermilion.models.InlineObject;
import com.factset.sdk.Vermilion.models.InlineResponse4002;
import com.factset.sdk.Vermilion.models.InlineResponse4003;
import com.factset.sdk.Vermilion.models.InlineResponse401;
import com.factset.sdk.Vermilion.models.InlineResponse4011;
import com.factset.sdk.Vermilion.models.InlineResponse403;
import com.factset.sdk.Vermilion.models.InlineResponse4042;
import com.factset.sdk.Vermilion.models.InlineResponse4043;
import com.factset.sdk.Vermilion.models.InlineResponse406;
import com.factset.sdk.Vermilion.models.ReportInstanceData;
import com.factset.sdk.Vermilion.models.ReportInstanceDataResponse;
import com.factset.sdk.Vermilion.models.ReportInstanceList;
import com.factset.sdk.Vermilion.models.ReportInstanceLogList;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ReportInstanceApi {
  private ApiClient apiClient;

  public ReportInstanceApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ReportInstanceApi(ApiClient apiClient) {
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
   * Generates a report
   * Generates a report using the specified ID and the JSON in the request body
   * @param inlineObject  (required)
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
  public ReportInstanceDataResponse v1ReportInstancesGeneratePost(InlineObject inlineObject) throws ApiException {
    return v1ReportInstancesGeneratePostWithHttpInfo(inlineObject).getData();
  }

  /**
   * Generates a report
   * Generates a report using the specified ID and the JSON in the request body
   * @param inlineObject  (required)
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
  public ApiResponse<ReportInstanceDataResponse> v1ReportInstancesGeneratePostWithHttpInfo(InlineObject inlineObject) throws ApiException {
    Object localVarPostBody = inlineObject;
    
    // verify the required parameter 'inlineObject' is set
    if (inlineObject == null) {
      throw new ApiException(400, "Missing the required parameter 'inlineObject' when calling v1ReportInstancesGeneratePost");
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

    GenericType<ReportInstanceDataResponse> localVarReturnType = new GenericType<ReportInstanceDataResponse>() {};

    return apiClient.invokeAPI("ReportInstanceApi.v1ReportInstancesGeneratePost", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
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
  public ReportInstanceList v1TenantReportInstancesGet(String tenant, String reportDefinitionCode, String entityCodes, String entityKeys, String sectionFilter, String outputFormat, Integer paginationLimit, Integer paginationOffset) throws ApiException {
    return v1TenantReportInstancesGetWithHttpInfo(tenant, reportDefinitionCode, entityCodes, entityKeys, sectionFilter, outputFormat, paginationLimit, paginationOffset).getData();
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
  public ApiResponse<ReportInstanceList> v1TenantReportInstancesGetWithHttpInfo(String tenant, String reportDefinitionCode, String entityCodes, String entityKeys, String sectionFilter, String outputFormat, Integer paginationLimit, Integer paginationOffset) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'tenant' is set
    if (tenant == null) {
      throw new ApiException(400, "Missing the required parameter 'tenant' when calling v1TenantReportInstancesGet");
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

    GenericType<ReportInstanceList> localVarReturnType = new GenericType<ReportInstanceList>() {};

    return apiClient.invokeAPI("ReportInstanceApi.v1TenantReportInstancesGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
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
  public void v1TenantReportInstancesReportInstanceIdDelete(String tenant, String reportInstanceId) throws ApiException {
    v1TenantReportInstancesReportInstanceIdDeleteWithHttpInfo(tenant, reportInstanceId);
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
  public ApiResponse<Void> v1TenantReportInstancesReportInstanceIdDeleteWithHttpInfo(String tenant, String reportInstanceId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'tenant' is set
    if (tenant == null) {
      throw new ApiException(400, "Missing the required parameter 'tenant' when calling v1TenantReportInstancesReportInstanceIdDelete");
    }
    
    // verify the required parameter 'reportInstanceId' is set
    if (reportInstanceId == null) {
      throw new ApiException(400, "Missing the required parameter 'reportInstanceId' when calling v1TenantReportInstancesReportInstanceIdDelete");
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

    return apiClient.invokeAPI("ReportInstanceApi.v1TenantReportInstancesReportInstanceIdDelete", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * Gets a report instance based on the ID
   * Gets a report instance object based on the ID passed
   * @param reportInstanceId The ID of the report instance (required)
   * @param tenant The code of the tenancy (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Report generation has completed and the report is ready to download </td><td>  * Location - A callback URL to the updated group, for example https://example.com/VRSAPI/scim/v2/Groups/1 <br>  </td></tr>
       <tr><td> 202 </td><td> Expected response returned if the report generation is not yet completed. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> The supplied report instance id was either missing or invalid, or the report instance was not found </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorised </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> No permissions to view reports in VRS </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The supplied report instance ID could not be found </td><td>  -  </td></tr>
       <tr><td> 406 </td><td> Unsupported Accept header. Header needs to be set to application/json. </td><td>  -  </td></tr>
     </table>
   */
  public void v1TenantReportInstancesReportInstanceIdGet(String reportInstanceId, String tenant) throws ApiException {
    v1TenantReportInstancesReportInstanceIdGetWithHttpInfo(reportInstanceId, tenant);
  }

  /**
   * Gets a report instance based on the ID
   * Gets a report instance object based on the ID passed
   * @param reportInstanceId The ID of the report instance (required)
   * @param tenant The code of the tenancy (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Report generation has completed and the report is ready to download </td><td>  * Location - A callback URL to the updated group, for example https://example.com/VRSAPI/scim/v2/Groups/1 <br>  </td></tr>
       <tr><td> 202 </td><td> Expected response returned if the report generation is not yet completed. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> The supplied report instance id was either missing or invalid, or the report instance was not found </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorised </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> No permissions to view reports in VRS </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The supplied report instance ID could not be found </td><td>  -  </td></tr>
       <tr><td> 406 </td><td> Unsupported Accept header. Header needs to be set to application/json. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> v1TenantReportInstancesReportInstanceIdGetWithHttpInfo(String reportInstanceId, String tenant) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'reportInstanceId' is set
    if (reportInstanceId == null) {
      throw new ApiException(400, "Missing the required parameter 'reportInstanceId' when calling v1TenantReportInstancesReportInstanceIdGet");
    }
    
    // verify the required parameter 'tenant' is set
    if (tenant == null) {
      throw new ApiException(400, "Missing the required parameter 'tenant' when calling v1TenantReportInstancesReportInstanceIdGet");
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

    return apiClient.invokeAPI("ReportInstanceApi.v1TenantReportInstancesReportInstanceIdGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * Gets a list of logs for the report instance generation
   * Gets a list of logs for the generated report instance. Allows the user to sort on log message, type and date. Also allows for retrieving of just the errors &amp; warnings&#39;
   * @param tenant The code of the tenancy (required)
   * @param reportInstanceId Used to validate that report file name belongs to the report instance passed (required)
   * @param fullLog Determines if the endpoint should return a full set of logs or just the errors and warnings E.g: fullLog&#x3D;true (optional)
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
  public ReportInstanceLogList v1TenantReportInstancesReportInstanceIdLogsGet(String tenant, String reportInstanceId, String fullLog, String sort, Integer paginationLimit, Integer paginationOffset) throws ApiException {
    return v1TenantReportInstancesReportInstanceIdLogsGetWithHttpInfo(tenant, reportInstanceId, fullLog, sort, paginationLimit, paginationOffset).getData();
  }

  /**
   * Gets a list of logs for the report instance generation
   * Gets a list of logs for the generated report instance. Allows the user to sort on log message, type and date. Also allows for retrieving of just the errors &amp; warnings&#39;
   * @param tenant The code of the tenancy (required)
   * @param reportInstanceId Used to validate that report file name belongs to the report instance passed (required)
   * @param fullLog Determines if the endpoint should return a full set of logs or just the errors and warnings E.g: fullLog&#x3D;true (optional)
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
  public ApiResponse<ReportInstanceLogList> v1TenantReportInstancesReportInstanceIdLogsGetWithHttpInfo(String tenant, String reportInstanceId, String fullLog, String sort, Integer paginationLimit, Integer paginationOffset) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'tenant' is set
    if (tenant == null) {
      throw new ApiException(400, "Missing the required parameter 'tenant' when calling v1TenantReportInstancesReportInstanceIdLogsGet");
    }
    
    // verify the required parameter 'reportInstanceId' is set
    if (reportInstanceId == null) {
      throw new ApiException(400, "Missing the required parameter 'reportInstanceId' when calling v1TenantReportInstancesReportInstanceIdLogsGet");
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

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "fullLog", fullLog));
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

    GenericType<ReportInstanceLogList> localVarReturnType = new GenericType<ReportInstanceLogList>() {};

    return apiClient.invokeAPI("ReportInstanceApi.v1TenantReportInstancesReportInstanceIdLogsGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Gets the generated file
   * Get the generated file for a report instance. Users can fetch the generated report once the genration is finished. The report instance id and the report file name are passed in as path paramters
   * @param tenant The code of the tenancy (required)
   * @param reportInstanceId Used to validate that report file name belongs to the report instance passed (required)
   * @param reportFileName The report file name that has to be retrieved. report file name. E.g: xyz.pdf (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> The supplied report instance id was either missing or invalid or the report instance was not found. The supplied report file name was either invalid or not found </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorised </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> No permissions to view the generated file in VRS </td><td>  -  </td></tr>
       <tr><td> 406 </td><td> Unsupported Accept header. Header needs to be set to application/json. </td><td>  -  </td></tr>
     </table>
   */
  public void v1TenantReportInstancesReportInstanceIdResultsReportFileNameGet(String tenant, String reportInstanceId, String reportFileName) throws ApiException {
    v1TenantReportInstancesReportInstanceIdResultsReportFileNameGetWithHttpInfo(tenant, reportInstanceId, reportFileName);
  }

  /**
   * Gets the generated file
   * Get the generated file for a report instance. Users can fetch the generated report once the genration is finished. The report instance id and the report file name are passed in as path paramters
   * @param tenant The code of the tenancy (required)
   * @param reportInstanceId Used to validate that report file name belongs to the report instance passed (required)
   * @param reportFileName The report file name that has to be retrieved. report file name. E.g: xyz.pdf (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> The supplied report instance id was either missing or invalid or the report instance was not found. The supplied report file name was either invalid or not found </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorised </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> No permissions to view the generated file in VRS </td><td>  -  </td></tr>
       <tr><td> 406 </td><td> Unsupported Accept header. Header needs to be set to application/json. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> v1TenantReportInstancesReportInstanceIdResultsReportFileNameGetWithHttpInfo(String tenant, String reportInstanceId, String reportFileName) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'tenant' is set
    if (tenant == null) {
      throw new ApiException(400, "Missing the required parameter 'tenant' when calling v1TenantReportInstancesReportInstanceIdResultsReportFileNameGet");
    }
    
    // verify the required parameter 'reportInstanceId' is set
    if (reportInstanceId == null) {
      throw new ApiException(400, "Missing the required parameter 'reportInstanceId' when calling v1TenantReportInstancesReportInstanceIdResultsReportFileNameGet");
    }
    
    // verify the required parameter 'reportFileName' is set
    if (reportFileName == null) {
      throw new ApiException(400, "Missing the required parameter 'reportFileName' when calling v1TenantReportInstancesReportInstanceIdResultsReportFileNameGet");
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
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };

    return apiClient.invokeAPI("ReportInstanceApi.v1TenantReportInstancesReportInstanceIdResultsReportFileNameGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
}
