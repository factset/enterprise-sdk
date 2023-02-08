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

import java.time.LocalDate;
import com.factset.sdk.DocumentsDistributorDocuments.models.NewsStatus;
import com.factset.sdk.DocumentsDistributorDocuments.models.NewscheckstatusResponse;
import com.factset.sdk.DocumentsDistributorDocuments.models.NewsgetfilesResponse;
import com.factset.sdk.DocumentsDistributorDocuments.models.NewsrequestfilesResponse;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class NewsApiApi {
  private ApiClient apiClient;

  public NewsApiApi() {
    this(Configuration.getDefaultApiClient());
  }

  public NewsApiApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> asynchNewsV1CheckStatusGetResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    asynchNewsV1CheckStatusGetResponseTypeMap.put(200, new GenericType<NewscheckstatusResponse>(){});
    asynchNewsV1CheckStatusGetResponseTypeMap.put(400, new GenericType<NewsStatus>(){});
  }

  private static final Map<Integer, GenericType> asynchNewsV1GetFilesGetResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    asynchNewsV1GetFilesGetResponseTypeMap.put(200, new GenericType<NewsgetfilesResponse>(){});
    asynchNewsV1GetFilesGetResponseTypeMap.put(400, new GenericType<NewsStatus>(){});
  }

  private static final Map<Integer, GenericType> asynchNewsV1RequestFilesGetResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    asynchNewsV1RequestFilesGetResponseTypeMap.put(200, new GenericType<NewsrequestfilesResponse>(){});
    asynchNewsV1RequestFilesGetResponseTypeMap.put(400, new GenericType<NewsStatus>(){});
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
   * Returns the status and percentDone of the requested jobID and source
   * Need to plug-in the jobID got from /request-files into /check-status endpoint
   * @param jobID jobID returned by the request-files endpoint to know the status and percentDone (required)
   * @param source This parameter filters the results based on the source of the filings document (required)
   * @param paginationLimit Specifies the maximum number of results to return per result (optional)
   * @param paginationOffset Specifies the starting point for pagination. This parameter is used to identify the   beginning of next set of results (optional)
   * @return NewscheckstatusResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
     </table>
   */
  public NewscheckstatusResponse asynchNewsV1CheckStatusGet(String jobID, String source, Integer paginationLimit, Integer paginationOffset) throws ApiException {
    return asynchNewsV1CheckStatusGetWithHttpInfo(jobID, source, paginationLimit, paginationOffset).getData();
  }

  /**
   * Returns the status and percentDone of the requested jobID and source
   * Need to plug-in the jobID got from /request-files into /check-status endpoint
   * @param jobID jobID returned by the request-files endpoint to know the status and percentDone (required)
   * @param source This parameter filters the results based on the source of the filings document (required)
   * @param paginationLimit Specifies the maximum number of results to return per result (optional)
   * @param paginationOffset Specifies the starting point for pagination. This parameter is used to identify the   beginning of next set of results (optional)
   * @return ApiResponse&lt;NewscheckstatusResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<NewscheckstatusResponse> asynchNewsV1CheckStatusGetWithHttpInfo(String jobID, String source, Integer paginationLimit, Integer paginationOffset) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'jobID' is set
    if (jobID == null) {
      throw new ApiException(400, "Missing the required parameter 'jobID' when calling asynchNewsV1CheckStatusGet");
    }
    
    // verify the required parameter 'source' is set
    if (source == null) {
      throw new ApiException(400, "Missing the required parameter 'source' when calling asynchNewsV1CheckStatusGet");
    }
    
    // create path and map variables
    String localVarPath = "/asynch/news/v1/check-status";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "jobID", jobID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "source", source));
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
        
        NewscheckstatusResponse
      
    > apiResponse = apiClient.invokeAPI("NewsApiApi.asynchNewsV1CheckStatusGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, asynchNewsV1CheckStatusGetResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Returns the news filings for the specified daterange and source
   * Need to plug-in the source and jobID got from /request-files into /get-files endpoint
   * @param jobID jobID returned by the request-files endpoint to collect the results of the query (required)
   * @param source This parameter filters the results based on the source of the filings document (required)
   * @param paginationLimit Specifies the maximum number of results to return per result (optional)
   * @param paginationOffset Specifies the starting point for pagination. This parameter is used to identify the   beginning of next set of results (optional)
   * @return NewsgetfilesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> success </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
     </table>
   */
  public NewsgetfilesResponse asynchNewsV1GetFilesGet(String jobID, String source, Integer paginationLimit, Integer paginationOffset) throws ApiException {
    return asynchNewsV1GetFilesGetWithHttpInfo(jobID, source, paginationLimit, paginationOffset).getData();
  }

  /**
   * Returns the news filings for the specified daterange and source
   * Need to plug-in the source and jobID got from /request-files into /get-files endpoint
   * @param jobID jobID returned by the request-files endpoint to collect the results of the query (required)
   * @param source This parameter filters the results based on the source of the filings document (required)
   * @param paginationLimit Specifies the maximum number of results to return per result (optional)
   * @param paginationOffset Specifies the starting point for pagination. This parameter is used to identify the   beginning of next set of results (optional)
   * @return ApiResponse&lt;NewsgetfilesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> success </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<NewsgetfilesResponse> asynchNewsV1GetFilesGetWithHttpInfo(String jobID, String source, Integer paginationLimit, Integer paginationOffset) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'jobID' is set
    if (jobID == null) {
      throw new ApiException(400, "Missing the required parameter 'jobID' when calling asynchNewsV1GetFilesGet");
    }
    
    // verify the required parameter 'source' is set
    if (source == null) {
      throw new ApiException(400, "Missing the required parameter 'source' when calling asynchNewsV1GetFilesGet");
    }
    
    // create path and map variables
    String localVarPath = "/asynch/news/v1/get-files";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "jobID", jobID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "source", source));
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
        
        NewsgetfilesResponse
      
    > apiResponse = apiClient.invokeAPI("NewsApiApi.asynchNewsV1GetFilesGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, asynchNewsV1GetFilesGetResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Returns the jobID
   * Give the startDate,endDate and source parameters as request parameters in the /request-files endpoint, it returns the jobID. startDate and endDate should be in YYYY-MM-DDTHH:MM:SSZ format This API only supports adhoc requests to retrieve historical files
   * @param startDate Date from which data is required. Should be YYYY-MM-DDTHH:MM:SSZ format (required)
   * @param endDate The date until which the data is to be fetched. Should be YYYY-MM-DDTHH:MM:SSZ format (required)
   * @param source This parameter filters the results based on the source of the filings document (required)
   * @return NewsrequestfilesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> success </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
     </table>
   */
  public NewsrequestfilesResponse asynchNewsV1RequestFilesGet(LocalDate startDate, LocalDate endDate, String source) throws ApiException {
    return asynchNewsV1RequestFilesGetWithHttpInfo(startDate, endDate, source).getData();
  }

  /**
   * Returns the jobID
   * Give the startDate,endDate and source parameters as request parameters in the /request-files endpoint, it returns the jobID. startDate and endDate should be in YYYY-MM-DDTHH:MM:SSZ format This API only supports adhoc requests to retrieve historical files
   * @param startDate Date from which data is required. Should be YYYY-MM-DDTHH:MM:SSZ format (required)
   * @param endDate The date until which the data is to be fetched. Should be YYYY-MM-DDTHH:MM:SSZ format (required)
   * @param source This parameter filters the results based on the source of the filings document (required)
   * @return ApiResponse&lt;NewsrequestfilesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> success </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<NewsrequestfilesResponse> asynchNewsV1RequestFilesGetWithHttpInfo(LocalDate startDate, LocalDate endDate, String source) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'startDate' is set
    if (startDate == null) {
      throw new ApiException(400, "Missing the required parameter 'startDate' when calling asynchNewsV1RequestFilesGet");
    }
    
    // verify the required parameter 'endDate' is set
    if (endDate == null) {
      throw new ApiException(400, "Missing the required parameter 'endDate' when calling asynchNewsV1RequestFilesGet");
    }
    
    // verify the required parameter 'source' is set
    if (source == null) {
      throw new ApiException(400, "Missing the required parameter 'source' when calling asynchNewsV1RequestFilesGet");
    }
    
    // create path and map variables
    String localVarPath = "/asynch/news/v1/request-files";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startDate", startDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "endDate", endDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "source", source));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        NewsrequestfilesResponse
      
    > apiResponse = apiClient.invokeAPI("NewsApiApi.asynchNewsV1RequestFilesGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, asynchNewsV1RequestFilesGetResponseTypeMap, false);

    return apiResponse;

  }
}
