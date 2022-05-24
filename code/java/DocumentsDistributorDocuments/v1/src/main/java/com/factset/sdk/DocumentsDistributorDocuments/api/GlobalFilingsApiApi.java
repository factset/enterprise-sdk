package com.factset.sdk.DocumentsDistributorDocuments.api;

import com.factset.sdk.DocumentsDistributorDocuments.ApiException;
import com.factset.sdk.DocumentsDistributorDocuments.ApiClient;
import com.factset.sdk.DocumentsDistributorDocuments.ApiResponse;
import com.factset.sdk.DocumentsDistributorDocuments.Configuration;
import com.factset.sdk.DocumentsDistributorDocuments.Pair;

import javax.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.DocumentsDistributorDocuments.models.FilingsFiles;
import java.time.LocalDate;
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

    private static final Map<Integer, GenericType> globalFilingsV1ListFilesGetResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    globalFilingsV1ListFilesGetResponseTypeMap.put(200, new GenericType<java.util.List<FilingsFiles>>(){});
    globalFilingsV1ListFilesGetResponseTypeMap.put(400, new GenericType<Status>(){});
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
   * Retrieve filings within FactSet coverage
   * Parameters can be used to get the filings
   * @param dataset This parameter filters the results based on the dataset of the filings documents. (required)
   * @param startDate The earliest date the API should fetch for. Dates can be YYYY-MM-DD format (required)
   * @param endDate The date after upto eight days of the earliest date given the API should fetch for. Dates can be YYYY-MM-DD format (required)
   * @return java.util.List<FilingsFiles>
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Global Filings data items </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request- invalid or missing parameter </td><td>  -  </td></tr>
     </table>
   */
  public java.util.List<FilingsFiles> globalFilingsV1ListFilesGet(String dataset, LocalDate startDate, LocalDate endDate) throws ApiException {
    return globalFilingsV1ListFilesGetWithHttpInfo(dataset, startDate, endDate).getData();
  }

  /**
   * Retrieve filings within FactSet coverage
   * Parameters can be used to get the filings
   * @param dataset This parameter filters the results based on the dataset of the filings documents. (required)
   * @param startDate The earliest date the API should fetch for. Dates can be YYYY-MM-DD format (required)
   * @param endDate The date after upto eight days of the earliest date given the API should fetch for. Dates can be YYYY-MM-DD format (required)
   * @return ApiResponse&lt;java.util.List<FilingsFiles>&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Global Filings data items </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request- invalid or missing parameter </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<java.util.List<FilingsFiles>> globalFilingsV1ListFilesGetWithHttpInfo(String dataset, LocalDate startDate, LocalDate endDate) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'dataset' is set
    if (dataset == null) {
      throw new ApiException(400, "Missing the required parameter 'dataset' when calling globalFilingsV1ListFilesGet");
    }
    
    // verify the required parameter 'startDate' is set
    if (startDate == null) {
      throw new ApiException(400, "Missing the required parameter 'startDate' when calling globalFilingsV1ListFilesGet");
    }
    
    // verify the required parameter 'endDate' is set
    if (endDate == null) {
      throw new ApiException(400, "Missing the required parameter 'endDate' when calling globalFilingsV1ListFilesGet");
    }
    
    // create path and map variables
    String localVarPath = "/global-filings/v1/list-files";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "dataset", dataset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startDate", startDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "endDate", endDate));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        java.util.List<FilingsFiles>
      
    > apiResponse = apiClient.invokeAPI("GlobalFilingsApiApi.globalFilingsV1ListFilesGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, globalFilingsV1ListFilesGetResponseTypeMap, false);

    return apiResponse;

  }
}
