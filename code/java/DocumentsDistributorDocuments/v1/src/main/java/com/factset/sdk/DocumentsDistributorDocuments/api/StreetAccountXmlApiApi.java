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

import com.factset.sdk.DocumentsDistributorDocuments.models.Checkstatus;
import com.factset.sdk.DocumentsDistributorDocuments.models.Getfiles;
import java.time.LocalDate;
import com.factset.sdk.DocumentsDistributorDocuments.models.RequestfilesResponse;
import com.factset.sdk.DocumentsDistributorDocuments.models.StreetAccountStatus;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class StreetAccountXmlApiApi {
  private ApiClient apiClient;

  public StreetAccountXmlApiApi() {
    this(Configuration.getDefaultApiClient());
  }

  public StreetAccountXmlApiApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

    private static final Map<Integer, GenericType> asynchStreetaccountV1CheckStatusGetResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    asynchStreetaccountV1CheckStatusGetResponseTypeMap.put(200, new GenericType<java.util.List<Checkstatus>>(){});
    asynchStreetaccountV1CheckStatusGetResponseTypeMap.put(400, new GenericType<StreetAccountStatus>(){});
  }
  private static final Map<Integer, GenericType> asynchStreetaccountV1GetFilesGetResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    asynchStreetaccountV1GetFilesGetResponseTypeMap.put(200, new GenericType<java.util.List<Getfiles>>(){});
    asynchStreetaccountV1GetFilesGetResponseTypeMap.put(400, new GenericType<StreetAccountStatus>(){});
  }
  private static final Map<Integer, GenericType> asynchStreetaccountV1RequestFilesGetResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    asynchStreetaccountV1RequestFilesGetResponseTypeMap.put(200, new GenericType<RequestfilesResponse>(){});
    asynchStreetaccountV1RequestFilesGetResponseTypeMap.put(400, new GenericType<StreetAccountStatus>(){});
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
   * Returns the status and percentDone of the requested jobID
   * Need to plug-in the jobID got from /request-files into /check-status endpoint
   * @param jobID jobID returned by the request-files endpoint to know the status and percentDone (required)
   * @return java.util.List<Checkstatus>
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
     </table>
   */
  public java.util.List<Checkstatus> asynchStreetaccountV1CheckStatusGet(String jobID) throws ApiException {
    return asynchStreetaccountV1CheckStatusGetWithHttpInfo(jobID).getData();
  }

  /**
   * Returns the status and percentDone of the requested jobID
   * Need to plug-in the jobID got from /request-files into /check-status endpoint
   * @param jobID jobID returned by the request-files endpoint to know the status and percentDone (required)
   * @return ApiResponse&lt;java.util.List<Checkstatus>&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<java.util.List<Checkstatus>> asynchStreetaccountV1CheckStatusGetWithHttpInfo(String jobID) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'jobID' is set
    if (jobID == null) {
      throw new ApiException(400, "Missing the required parameter 'jobID' when calling asynchStreetaccountV1CheckStatusGet");
    }
    
    // create path and map variables
    String localVarPath = "/asynch/streetaccount/v1/check-status";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "jobID", jobID));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        java.util.List<Checkstatus>
      
    > apiResponse = apiClient.invokeAPI("StreetAccountXmlApiApi.asynchStreetaccountV1CheckStatusGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, asynchStreetaccountV1CheckStatusGetResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Returns the SA XML files for the specified daterange
   * Need to plug-in the jobID got from /request-files into /check-status endpoint
   * @param jobID jobID returned by the request-files endpoint to collect the results of the query (required)
   * @return java.util.List<Getfiles>
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> success </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
     </table>
   */
  public java.util.List<Getfiles> asynchStreetaccountV1GetFilesGet(String jobID) throws ApiException {
    return asynchStreetaccountV1GetFilesGetWithHttpInfo(jobID).getData();
  }

  /**
   * Returns the SA XML files for the specified daterange
   * Need to plug-in the jobID got from /request-files into /check-status endpoint
   * @param jobID jobID returned by the request-files endpoint to collect the results of the query (required)
   * @return ApiResponse&lt;java.util.List<Getfiles>&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> success </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<java.util.List<Getfiles>> asynchStreetaccountV1GetFilesGetWithHttpInfo(String jobID) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'jobID' is set
    if (jobID == null) {
      throw new ApiException(400, "Missing the required parameter 'jobID' when calling asynchStreetaccountV1GetFilesGet");
    }
    
    // create path and map variables
    String localVarPath = "/asynch/streetaccount/v1/get-files";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "jobID", jobID));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        java.util.List<Getfiles>
      
    > apiResponse = apiClient.invokeAPI("StreetAccountXmlApiApi.asynchStreetaccountV1GetFilesGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, asynchStreetaccountV1GetFilesGetResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Returns the jobID
   * Give the startDate and endDate parameters as request parameters in the /request-files endpoint, it returns the jobID. startDate and endDate should be in YYYY-MM-DDTHH:MM:SSZ format  This API only supports adhoc requests to retrieve historical files and does not support real-time       files and if you interested in require real-time push should consider the other three methods         (pushed via SFTP, to QNT account, or your Azure Storage). Per API request able to query till 2 years of data
   * @param startDate Date from which data is required. Should be YYYY-MM-DDTHH:MM:SSZ format (required)
   * @param endDate The date until which the data is to be fetched. Should be YYYY-MM-DDTHH:MM:SSZ format (required)
   * @return RequestfilesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> success </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
     </table>
   */
  public RequestfilesResponse asynchStreetaccountV1RequestFilesGet(LocalDate startDate, LocalDate endDate) throws ApiException {
    return asynchStreetaccountV1RequestFilesGetWithHttpInfo(startDate, endDate).getData();
  }

  /**
   * Returns the jobID
   * Give the startDate and endDate parameters as request parameters in the /request-files endpoint, it returns the jobID. startDate and endDate should be in YYYY-MM-DDTHH:MM:SSZ format  This API only supports adhoc requests to retrieve historical files and does not support real-time       files and if you interested in require real-time push should consider the other three methods         (pushed via SFTP, to QNT account, or your Azure Storage). Per API request able to query till 2 years of data
   * @param startDate Date from which data is required. Should be YYYY-MM-DDTHH:MM:SSZ format (required)
   * @param endDate The date until which the data is to be fetched. Should be YYYY-MM-DDTHH:MM:SSZ format (required)
   * @return ApiResponse&lt;RequestfilesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> success </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<RequestfilesResponse> asynchStreetaccountV1RequestFilesGetWithHttpInfo(LocalDate startDate, LocalDate endDate) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'startDate' is set
    if (startDate == null) {
      throw new ApiException(400, "Missing the required parameter 'startDate' when calling asynchStreetaccountV1RequestFilesGet");
    }
    
    // verify the required parameter 'endDate' is set
    if (endDate == null) {
      throw new ApiException(400, "Missing the required parameter 'endDate' when calling asynchStreetaccountV1RequestFilesGet");
    }
    
    // create path and map variables
    String localVarPath = "/asynch/streetaccount/v1/request-files";

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
      
    > apiResponse = apiClient.invokeAPI("StreetAccountXmlApiApi.asynchStreetaccountV1RequestFilesGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, asynchStreetaccountV1RequestFilesGetResponseTypeMap, false);

    return apiResponse;

  }
}
