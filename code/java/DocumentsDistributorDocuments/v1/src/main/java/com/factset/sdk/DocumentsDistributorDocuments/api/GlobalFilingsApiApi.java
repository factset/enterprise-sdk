package com.factset.sdk.DocumentsDistributorDocuments.api;

import com.factset.sdk.DocumentsDistributorDocuments.ApiException;
import com.factset.sdk.DocumentsDistributorDocuments.ApiClient;
import com.factset.sdk.DocumentsDistributorDocuments.ApiResponse;
import com.factset.sdk.DocumentsDistributorDocuments.Configuration;
import com.factset.sdk.DocumentsDistributorDocuments.Pair;

import javax.ws.rs.core.GenericType;

import com.factset.sdk.DocumentsDistributorDocuments.models.Response;
import com.factset.sdk.DocumentsDistributorDocuments.models.Status;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GlobalFilingsApiApi {
  private ApiClient apiClient;

  public GlobalFilingsApiApi() {
    this(Configuration.getDefaultApiClient());
  }

  public GlobalFilingsApiApi(ApiClient apiClient) {
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
   * Retrieve form types for each available Filings Source
   * Gets all available form types for the filings sources. Source parameter can be used to filter the results.
   * @param source This parameter filters the results based on the source of the filings document. (required)
   * @return Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Form Types data items </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request- invalid or missing parameter </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Authentication Failed </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Entitlements Not Found </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Service Error </td><td>  -  </td></tr>
     </table>
   */
  public Response globalFilingsV1FormTypesGet(String source) throws ApiException {
    return globalFilingsV1FormTypesGetWithHttpInfo(source).getData();
  }

  /**
   * Retrieve form types for each available Filings Source
   * Gets all available form types for the filings sources. Source parameter can be used to filter the results.
   * @param source This parameter filters the results based on the source of the filings document. (required)
   * @return ApiResponse&lt;Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Form Types data items </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request- invalid or missing parameter </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Authentication Failed </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Entitlements Not Found </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Service Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Response> globalFilingsV1FormTypesGetWithHttpInfo(String source) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'source' is set
    if (source == null) {
      throw new ApiException(400, "Missing the required parameter 'source' when calling globalFilingsV1FormTypesGet");
    }
    
    // create path and map variables
    String localVarPath = "/global-filings/v1/form-types";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "source", source));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };

    GenericType<Response> localVarReturnType = new GenericType<Response>() {};

    return apiClient.invokeAPI("GlobalFilingsApiApi.globalFilingsV1FormTypesGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Retrieve filings and metadata within FactSet coverage
   * Gets the latest 25 filings files. Parameters can be used to filter and narrow down the results
   * @param source This parameter filters the results based on the source of the filings documents. (required)
   * @param paginationLimit Specifies the maximum number of results to return per result (max. 25) (required)
   * @param paginationOffset Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results (required)
   * @param sort Enables to get the data in ascending or descending order based on startTime. Results are in reverse chronological order if this parameter is not used (optional, default to -startDate)
   * @param startDate The earliest date the API should fetch for. Dates can be YYYY-MM-DD format (optional)
   * @param endDate The latest date the API should fetch for. Dates can be YYYY-MM-DD format (optional)
   * @param ids This parameter filters the results based on ticker ID. (optional)
   * @param formType This parameter filters the results based on filings formType. Use the form-types endpoint to view the formTypes available by filings source. (optional)
   * @return Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Global Filings data items </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request- invalid or missing parameter </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Authentication Failed </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Entitlements Not Found </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Service Error </td><td>  -  </td></tr>
     </table>
   */
  public Response globalFilingsV1ListFilesGet(String source, Integer paginationLimit, Integer paginationOffset, String sort, String startDate, String endDate, String ids, String formType) throws ApiException {
    return globalFilingsV1ListFilesGetWithHttpInfo(source, paginationLimit, paginationOffset, sort, startDate, endDate, ids, formType).getData();
  }

  /**
   * Retrieve filings and metadata within FactSet coverage
   * Gets the latest 25 filings files. Parameters can be used to filter and narrow down the results
   * @param source This parameter filters the results based on the source of the filings documents. (required)
   * @param paginationLimit Specifies the maximum number of results to return per result (max. 25) (required)
   * @param paginationOffset Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results (required)
   * @param sort Enables to get the data in ascending or descending order based on startTime. Results are in reverse chronological order if this parameter is not used (optional, default to -startDate)
   * @param startDate The earliest date the API should fetch for. Dates can be YYYY-MM-DD format (optional)
   * @param endDate The latest date the API should fetch for. Dates can be YYYY-MM-DD format (optional)
   * @param ids This parameter filters the results based on ticker ID. (optional)
   * @param formType This parameter filters the results based on filings formType. Use the form-types endpoint to view the formTypes available by filings source. (optional)
   * @return ApiResponse&lt;Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Global Filings data items </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request- invalid or missing parameter </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Authentication Failed </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Entitlements Not Found </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Service Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Response> globalFilingsV1ListFilesGetWithHttpInfo(String source, Integer paginationLimit, Integer paginationOffset, String sort, String startDate, String endDate, String ids, String formType) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'source' is set
    if (source == null) {
      throw new ApiException(400, "Missing the required parameter 'source' when calling globalFilingsV1ListFilesGet");
    }
    
    // verify the required parameter 'paginationLimit' is set
    if (paginationLimit == null) {
      throw new ApiException(400, "Missing the required parameter 'paginationLimit' when calling globalFilingsV1ListFilesGet");
    }
    
    // verify the required parameter 'paginationOffset' is set
    if (paginationOffset == null) {
      throw new ApiException(400, "Missing the required parameter 'paginationOffset' when calling globalFilingsV1ListFilesGet");
    }
    
    // create path and map variables
    String localVarPath = "/global-filings/v1/list-files";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "source", source));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startDate", startDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "endDate", endDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_paginationLimit", paginationLimit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_paginationOffset", paginationOffset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "ids", ids));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "formType", formType));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };

    GenericType<Response> localVarReturnType = new GenericType<Response>() {};

    return apiClient.invokeAPI("GlobalFilingsApiApi.globalFilingsV1ListFilesGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
