package com.factset.sdk.StreetAccountNews.api;

import com.factset.sdk.StreetAccountNews.ApiException;
import com.factset.sdk.StreetAccountNews.ApiClient;
import com.factset.sdk.StreetAccountNews.ApiResponse;
import com.factset.sdk.StreetAccountNews.Configuration;
import com.factset.sdk.StreetAccountNews.Pair;

import javax.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.StreetAccountNews.models.CheckstatusResponse;
import com.factset.sdk.StreetAccountNews.models.GetfilesResponse;
import java.time.OffsetDateTime;
import com.factset.sdk.StreetAccountNews.models.RequestfilesResponse;
import com.factset.sdk.StreetAccountNews.models.StreetAccountStatus;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class StreetAccountHistoricalStoriesApi {
  private ApiClient apiClient;

  public StreetAccountHistoricalStoriesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public StreetAccountHistoricalStoriesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> streetaccountHistoricalCheckStatusGetResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    streetaccountHistoricalCheckStatusGetResponseTypeMap.put(200, new GenericType<CheckstatusResponse>(){});
    streetaccountHistoricalCheckStatusGetResponseTypeMap.put(400, new GenericType<StreetAccountStatus>(){});
    streetaccountHistoricalCheckStatusGetResponseTypeMap.put(401, new GenericType<StreetAccountStatus>(){});
    streetaccountHistoricalCheckStatusGetResponseTypeMap.put(403, new GenericType<StreetAccountStatus>(){});
    streetaccountHistoricalCheckStatusGetResponseTypeMap.put(500, new GenericType<StreetAccountStatus>(){});
  }

  private static final Map<Integer, GenericType> streetaccountHistoricalGetFilesGetResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    streetaccountHistoricalGetFilesGetResponseTypeMap.put(200, new GenericType<GetfilesResponse>(){});
    streetaccountHistoricalGetFilesGetResponseTypeMap.put(400, new GenericType<StreetAccountStatus>(){});
    streetaccountHistoricalGetFilesGetResponseTypeMap.put(401, new GenericType<StreetAccountStatus>(){});
    streetaccountHistoricalGetFilesGetResponseTypeMap.put(403, new GenericType<StreetAccountStatus>(){});
    streetaccountHistoricalGetFilesGetResponseTypeMap.put(500, new GenericType<StreetAccountStatus>(){});
  }

  private static final Map<Integer, GenericType> streetaccountHistoricalRequestFilesGetResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    streetaccountHistoricalRequestFilesGetResponseTypeMap.put(200, new GenericType<RequestfilesResponse>(){});
    streetaccountHistoricalRequestFilesGetResponseTypeMap.put(400, new GenericType<StreetAccountStatus>(){});
    streetaccountHistoricalRequestFilesGetResponseTypeMap.put(401, new GenericType<StreetAccountStatus>(){});
    streetaccountHistoricalRequestFilesGetResponseTypeMap.put(403, new GenericType<StreetAccountStatus>(){});
    streetaccountHistoricalRequestFilesGetResponseTypeMap.put(500, new GenericType<StreetAccountStatus>(){});
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
   * Returns the status and percentage of completion for the requested jobID
   * Need to plug-in the jobID from /request-files into /check-status endpoint
   * @param jobID jobID returned by the request-files endpoint to know the status and percentDone (required)
   * @param paginationLimit Specifies the maximum number of results to return per result (optional)
   * @param paginationOffset Specifies the starting point for pagination. This parameter is used to identify the   beginning of next set of results (optional)
   * @return CheckstatusResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Bad request </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Bad request </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Bad request </td><td>  -  </td></tr>
     </table>
   */
  public CheckstatusResponse streetaccountHistoricalCheckStatusGet(String jobID, Integer paginationLimit, Integer paginationOffset) throws ApiException {
    return streetaccountHistoricalCheckStatusGetWithHttpInfo(jobID, paginationLimit, paginationOffset).getData();
  }

  /**
   * Returns the status and percentage of completion for the requested jobID
   * Need to plug-in the jobID from /request-files into /check-status endpoint
   * @param jobID jobID returned by the request-files endpoint to know the status and percentDone (required)
   * @param paginationLimit Specifies the maximum number of results to return per result (optional)
   * @param paginationOffset Specifies the starting point for pagination. This parameter is used to identify the   beginning of next set of results (optional)
   * @return ApiResponse&lt;CheckstatusResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Bad request </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Bad request </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Bad request </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CheckstatusResponse> streetaccountHistoricalCheckStatusGetWithHttpInfo(String jobID, Integer paginationLimit, Integer paginationOffset) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'jobID' is set
    if (jobID == null) {
      throw new ApiException(400, "Missing the required parameter 'jobID' when calling streetaccountHistoricalCheckStatusGet");
    }
    
    // create path and map variables
    String localVarPath = "/streetaccount/historical/check-status";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "jobID", jobID));
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
        
        CheckstatusResponse
      
    > apiResponse = apiClient.invokeAPI("StreetAccountHistoricalStoriesApi.streetaccountHistoricalCheckStatusGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, streetaccountHistoricalCheckStatusGetResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Returns the StreetAccount XML files for the specified date range
   * Need to plug-in the jobID from /check-status into /get-files endpoint
   * @param jobID jobID returned by the request-files endpoint to collect the results of the query (required)
   * @param paginationLimit Specifies the maximum number of results to return per result (optional)
   * @param paginationOffset Specifies the starting point for pagination. This parameter is used to identify the   beginning of next set of results (optional)
   * @return GetfilesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> success </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Bad request </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Bad request </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Bad request </td><td>  -  </td></tr>
     </table>
   */
  public GetfilesResponse streetaccountHistoricalGetFilesGet(String jobID, Integer paginationLimit, Integer paginationOffset) throws ApiException {
    return streetaccountHistoricalGetFilesGetWithHttpInfo(jobID, paginationLimit, paginationOffset).getData();
  }

  /**
   * Returns the StreetAccount XML files for the specified date range
   * Need to plug-in the jobID from /check-status into /get-files endpoint
   * @param jobID jobID returned by the request-files endpoint to collect the results of the query (required)
   * @param paginationLimit Specifies the maximum number of results to return per result (optional)
   * @param paginationOffset Specifies the starting point for pagination. This parameter is used to identify the   beginning of next set of results (optional)
   * @return ApiResponse&lt;GetfilesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> success </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Bad request </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Bad request </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Bad request </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetfilesResponse> streetaccountHistoricalGetFilesGetWithHttpInfo(String jobID, Integer paginationLimit, Integer paginationOffset) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'jobID' is set
    if (jobID == null) {
      throw new ApiException(400, "Missing the required parameter 'jobID' when calling streetaccountHistoricalGetFilesGet");
    }
    
    // create path and map variables
    String localVarPath = "/streetaccount/historical/get-files";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "jobID", jobID));
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
        
        GetfilesResponse
      
    > apiResponse = apiClient.invokeAPI("StreetAccountHistoricalStoriesApi.streetaccountHistoricalGetFilesGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, streetaccountHistoricalGetFilesGetResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Returns the jobID
   * Give the startDate and endDate parameters as request parameters in the /request-files endpoint, it returns the jobID. startDate and endDate should be in YYYY-MM-DDTHH:MM:SSZ format. This API only supports adhoc requests to retrieve historical files and does not support real-time files and if you interested in require real-time push should consider the other three methods (pushed via SFTP, to QNT account, or your Azure Storage). Per API request able to query till 2 years of data
   * @param startDate Date from which data is required. Should be YYYY-MM-DDTHH:MM:SSZ format (required)
   * @param endDate The date until which the data is to be fetched. Should be YYYY-MM-DDTHH:MM:SSZ format (required)
   * @return RequestfilesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> success </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Bad request </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Bad request </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Bad request </td><td>  -  </td></tr>
     </table>
   */
  public RequestfilesResponse streetaccountHistoricalRequestFilesGet(OffsetDateTime startDate, OffsetDateTime endDate) throws ApiException {
    return streetaccountHistoricalRequestFilesGetWithHttpInfo(startDate, endDate).getData();
  }

  /**
   * Returns the jobID
   * Give the startDate and endDate parameters as request parameters in the /request-files endpoint, it returns the jobID. startDate and endDate should be in YYYY-MM-DDTHH:MM:SSZ format. This API only supports adhoc requests to retrieve historical files and does not support real-time files and if you interested in require real-time push should consider the other three methods (pushed via SFTP, to QNT account, or your Azure Storage). Per API request able to query till 2 years of data
   * @param startDate Date from which data is required. Should be YYYY-MM-DDTHH:MM:SSZ format (required)
   * @param endDate The date until which the data is to be fetched. Should be YYYY-MM-DDTHH:MM:SSZ format (required)
   * @return ApiResponse&lt;RequestfilesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> success </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Bad request </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Bad request </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Bad request </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<RequestfilesResponse> streetaccountHistoricalRequestFilesGetWithHttpInfo(OffsetDateTime startDate, OffsetDateTime endDate) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'startDate' is set
    if (startDate == null) {
      throw new ApiException(400, "Missing the required parameter 'startDate' when calling streetaccountHistoricalRequestFilesGet");
    }
    
    // verify the required parameter 'endDate' is set
    if (endDate == null) {
      throw new ApiException(400, "Missing the required parameter 'endDate' when calling streetaccountHistoricalRequestFilesGet");
    }
    
    // create path and map variables
    String localVarPath = "/streetaccount/historical/request-files";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

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
        
        RequestfilesResponse
      
    > apiResponse = apiClient.invokeAPI("StreetAccountHistoricalStoriesApi.streetaccountHistoricalRequestFilesGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, streetaccountHistoricalRequestFilesGetResponseTypeMap, false);

    return apiResponse;

  }
}
